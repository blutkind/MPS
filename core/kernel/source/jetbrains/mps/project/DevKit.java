/*
 * Copyright 2003-2008 JetBrains s.r.o.
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
package jetbrains.mps.project;

import jetbrains.mps.logging.Logger;
import jetbrains.mps.projectLanguage.DescriptorsPersistence;
import jetbrains.mps.projectLanguage.structure.*;
import jetbrains.mps.projectLanguage.structure.ModuleDescriptor;
import jetbrains.mps.smodel.*;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.util.ToStringComparator;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.reloading.ClassLoaderManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

import com.intellij.openapi.progress.EmptyProgressIndicator;

public class DevKit extends AbstractModule {
  private static Logger LOG = Logger.getLogger(DevKit.class);

  public static DevKit newInstance(IFile descriptorFile, MPSModuleOwner moduleOwner) {
    DevKit result = new DevKit();

    SModel model = ProjectModels.createDescriptorFor(result).getSModel();

    model.setLoading(true);
    DevKitDescriptor devKitDescriptor;
    if (descriptorFile.exists()) {
      devKitDescriptor = DescriptorsPersistence.loadDevKitDescriptor(descriptorFile, model);
      if (devKitDescriptor.getModuleUUID() == null) {
        devKitDescriptor.setModuleUUID(UUID.randomUUID().toString());
        DescriptorsPersistence.saveDevKitDescriptor(devKitDescriptor, descriptorFile);
      }
    } else {
      devKitDescriptor = DevKitDescriptor.newInstance(model);
      devKitDescriptor.setModuleUUID(UUID.randomUUID().toString());
    }


    model.addRoot(devKitDescriptor);

    result.myDescriptorFile = descriptorFile;
    result.setDevKitDescriptor(devKitDescriptor, false);

    MPSModuleRepository.getInstance().addModule(result, moduleOwner);
    return result;
  }

  private DevKitDescriptor myDescriptor;
  private IFile myDescriptorFile;
  private MPSModuleOwner myGenerationOnlyModelsModelOwner = this;

  public DevKit() {
  }

  public IFile getDescriptorFile() {
    return myDescriptorFile;
  }

  public DevKitDescriptor getModuleDescriptor() {
    return myDescriptor;
  }


  public void setModuleDescriptor(ModuleDescriptor moduleDescriptor) {
    if (moduleDescriptor instanceof DevKitDescriptor) {
      setDevKitDescriptor((DevKitDescriptor) moduleDescriptor);
    } else {
      LOG.error("not a devkit descriptor", new Throwable());
    }
  }

  public String getGeneratorOutputPath() {
    return null;
  }


  public void setDevKitDescriptor(DevKitDescriptor descriptor) {
    setDevKitDescriptor(descriptor, true);
  }

  public void setDevKitDescriptor(DevKitDescriptor descriptor, boolean reloadClasses) {
    MPSModuleRepository.getInstance().unRegisterModules(this);
    MPSModuleRepository.getInstance().unRegisterModules(myGenerationOnlyModelsModelOwner);
    SModelRepository.getInstance().unRegisterModelDescriptors(this);
    SModelRepository.getInstance().registerModelDescriptor(descriptor.getModel().getModelDescriptor(), this);

    myDescriptor = descriptor;
    myDescriptor.getModel().setLoading(true);

    if (myDescriptor.getName() != null) {
      jetbrains.mps.project.structure.modules.ModuleReference mp = new jetbrains.mps.project.structure.modules.ModuleReference(myDescriptor.getName(), myDescriptor.getModuleUUID());
      setModulePointer(mp);
    }

    reload();

    if (reloadClasses) {
      ClassLoaderManager.getInstance().reloadAll(new EmptyProgressIndicator());
    }
  }


  public void dispose() {
    super.dispose();

    SModelRepository.getInstance().unRegisterModelDescriptors(this);
    MPSModuleRepository.getInstance().unRegisterModules(this);
    MPSModuleRepository.getInstance().unRegisterModules(myGenerationOnlyModelsModelOwner);
  }

  @Override
  protected DevKitDescriptor loadDescriptor() {
    return DescriptorsPersistence.loadDevKitDescriptor(getDescriptorFile(), getModuleDescriptor().getModel());
  }

  public List<Language> getExportedLanguages() {
    List<Language> langs = new ArrayList<Language>();
    for (LanguageReference l : myDescriptor.getExportedLanguages()) {
      jetbrains.mps.project.structure.modules.ModuleReference ref = jetbrains.mps.project.structure.modules.ModuleReference.fromString(l.getName());
      Language lang = MPSModuleRepository.getInstance().getLanguage(ref);
      if (lang != null) {
        langs.add(lang);
      }
    }
    Collections.sort(langs, new ToStringComparator());
    return langs;
  }

  public List<Language> getAllExportedLanguages() {
    List<Language> result = new ArrayList<Language>();
    for (DevKit dk : getAllExtendedDevkits()) {
      for (Language l : dk.getExportedLanguages()) {
        if (!result.contains(l)) {
          result.add(l);
        }
      }
    }
    return result;
  }

  public List<DevKit> getExtendedDevKits() {
    List<DevKit> result = new ArrayList<DevKit>();
    for (DevKitReference ref : myDescriptor.getExtendedDevKits()) {
      String uid = ref.getName();
      DevKit devKit = MPSModuleRepository.getInstance().getDevKit(uid);
      if (devKit != null) {
        result.add(devKit);
      }
    }
    return result;
  }

  public List<DevKit> getAllExtendedDevkits() {
    List<DevKit> result = new ArrayList<DevKit>();
    collectDevKits(result);
    return result;
  }

  private void collectDevKits(List<DevKit> result) {
    if (result.contains(this)) {
      return;
    }
    result.add(this);
    for (DevKit dk : getExtendedDevKits()) {
      dk.collectDevKits(result);
    }
  }

  public List<Solution> getExportedSolutions() {
    List<Solution> result = new ArrayList<Solution>();
    for (SolutionReference ref : myDescriptor.getExportedSolutions()) {
      String uid = ref.getName();
      Solution solution = MPSModuleRepository.getInstance().getSolution(uid);
      if (solution != null) {
        result.add(solution);
      }
    }
    return result;
  }

  public List<Solution> getAllExportedSolutions() {
    List<Solution> result = new ArrayList<Solution>();
    for (DevKit dk : getAllExtendedDevkits()) {
      for (Solution s : dk.getExportedSolutions()) {
        if (!result.contains(s)) {
          result.add(s);
        }
      }
    }
    return result;
  }

  public List<String> getLanguageNamespaces() {
    List<String> result = new ArrayList<String>();
    for (Language l : getExportedLanguages()) {
      result.add(l.getNamespace());
    }
    return result;
  }

  @Override
  public List<IModule> getExplicitlyDependOnModules(boolean includeBootstrap) {
    List<IModule> result = super.getExplicitlyDependOnModules(includeBootstrap);

    for (DevKit dk : getExtendedDevKits()) {
      if (!result.contains(dk)) {
        result.add(dk);
      }
    }

    for (Language l : getExportedLanguages()) {
      if (!result.contains(l)) {
        result.add(l);
      }
    }

    for (Solution s : getExportedSolutions()) {
      if (!result.contains(s)) {
        result.add(s);
      }
    }

    return result;
  }

  public void save() {
    DescriptorsPersistence.saveDevKitDescriptor(getModuleDescriptor(), myDescriptorFile);
  }

  public void onModuleLoad() {
    super.onModuleLoad();
  }

  public String getName() {
    return myDescriptor.getName();
  }

  public String toString() {
    return getName();
  }

  public String getDevKitPluginClass() {
    return myDescriptor.getDevKitPlugin();
  }
}
