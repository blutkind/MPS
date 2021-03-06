/*
 * Copyright 2003-2011 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrains.mps.stubs;

import jetbrains.mps.components.CoreComponent;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.project.AbstractModule;
import jetbrains.mps.project.IModule;
import jetbrains.mps.project.Solution;
import jetbrains.mps.project.structure.model.ModelRoot;
import jetbrains.mps.project.structure.modules.LanguageDescriptor;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.project.structure.modules.SolutionDescriptor;
import jetbrains.mps.project.structure.modules.StubSolution;
import jetbrains.mps.smodel.*;
import jetbrains.mps.util.Condition;
import jetbrains.mps.util.ConditionalIterable;

import java.util.ArrayList;
import java.util.List;

public class LibrariesLoader implements CoreComponent {
  private static final Logger LOG = Logger.getLogger(LibrariesLoader.class);

  private static LibrariesLoader INSTANCE;

  public static LibrariesLoader getInstance() {
    return INSTANCE;
  }

  private MPSModuleRepository myModuleRepository;

  private List<String> myLoadedSolutions = new ArrayList<String>();
  private List<ModuleReference> myLoadedModules = new ArrayList<ModuleReference>();

  public LibrariesLoader(MPSModuleRepository moduleRepository) {
    myModuleRepository = moduleRepository;
  }

  public void init() {
    if (INSTANCE != null) {
      throw new IllegalStateException("double initialization");
    }

    INSTANCE = this;
  }

  public void dispose() {
    myLoadedSolutions.clear();

    INSTANCE = null;
  }

  public void reload() {
    loadNewLanguageLibs();
    for (IModule m : MPSModuleRepository.getInstance().getAllModules()) {
      if (!(m instanceof AbstractModule)) continue;
      if (myLoadedModules.contains(m.getModuleReference())) continue;
      myLoadedModules.add(m.getModuleReference());
      ((AbstractModule) m).loadNewModels();
    }
  }


  public static void createLanguageLibs(MPSModuleOwner moduleOwner, Language language, LanguageDescriptor languageDescriptor, MPSModuleRepository repository) {
    List<SolutionDescriptor> solutionDescriptors = createLanguageLibraryDescriptors(languageDescriptor);

    for (SolutionDescriptor sd : solutionDescriptors) {
      Solution.newInstance(sd, language);
    }
  }

  private static List<SolutionDescriptor> createLanguageLibraryDescriptors(LanguageDescriptor ld) {
    List<SolutionDescriptor> result = new ArrayList<SolutionDescriptor>();
    for (StubSolution ss : ld.getStubSolutions()) {
      SolutionDescriptor descriptor = new SolutionDescriptor();
      descriptor.setUUID(ss.getId().toString());
      descriptor.setNamespace(ss.getName());

      descriptor.setCompileInMPS(false);

      result.add(descriptor);
    }
    return result;
  }

  private void loadNewLanguageLibs() {
    for (BaseLibStubDescriptor d : createLibDescrs()) {
      if (myLoadedSolutions.contains(d.getModuleId())) continue;

      myLoadedSolutions.add(d.getModuleId());
      Solution library = myModuleRepository.getSolution(new ModuleReference(d.getModuleName(), d.getModuleId()));
      assert library != null : d.getModuleName();

      SolutionDescriptor sd = library.getModuleDescriptor();

      for (String path : d.getPaths()) {
        ModelRoot root = new ModelRoot();
        root.setPath(path);
        root.setManager(d.getManager());
        sd.getModelRoots().add(root);
        sd.getStubModelEntries().add(root);
      }

      d.init(sd);

      library.setSolutionDescriptor(sd, false);
    }
  }

  private List<BaseLibStubDescriptor> createLibDescrs() {
    List<BaseLibStubDescriptor> result = new ArrayList<BaseLibStubDescriptor>();

    List<Language> languages = myModuleRepository.getAllLanguages();
    for (Language l : languages) {
      SModelDescriptor descriptor = LanguageAspect.STUBS.get(l);
      if (descriptor == null) continue;

      Condition<SNode> cond = new Condition<SNode>() {
        public boolean met(SNode node) {
          return node.getConceptFqName().equals(BootstrapLanguages.concept_stubs_LibraryStubDescriptor);
        }
      };
      Iterable<SNode> iterable = new ConditionalIterable<SNode>(descriptor.getSModel().roots(), cond);

      for (SNode node : iterable) {
        Class descrClass = l.getClass(l.getModuleFqName() + "." + LanguageAspect.STUBS.getName() + "." + node.getPersistentProperty(SNodeUtil.property_INamedConcept_name) + "_StubDescriptor");
        if (descrClass == null) continue;

        try {
          BaseLibStubDescriptor descr = (BaseLibStubDescriptor) descrClass.newInstance();
          result.add(descr);
        } catch (Throwable t) {
          LOG.error(t);
        }
      }
    }

    return result;
  }
}
