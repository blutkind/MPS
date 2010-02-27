/*
 * Copyright 2003-2010 JetBrains s.r.o.
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

import jetbrains.mps.project.structure.modules.Dependency;
import jetbrains.mps.project.structure.modules.ModuleDescriptor;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.reloading.IClassPathItem;
import jetbrains.mps.reloading.FileClassPathItem;
import jetbrains.mps.runtime.BytecodeLocator;
import jetbrains.mps.smodel.*;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.workbench.actions.goTo.index.SNodeDescriptor;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.util.List;
import java.util.Set;

public interface IModule extends ModelOwner, MPSModuleOwner {
  @Deprecated
  String getModuleUID();

  @NotNull
  ModuleReference getModuleReference();

  ModuleId getModuleId();

  String getModuleFqName();

  String getModuleNamespace();

  List<SModelDescriptor> getOwnModelDescriptors();

  List<SModelRoot> getSModelRoots();

  SModelRoot findModelRoot(String path);

  List<Dependency> getDependOn();

  List<IModule> getDependOnModules();

  List<IModule> getAllDependOnModules();

  List<ModuleReference> getUsedLanguagesReferences();

  List<Language> getUsedLanguages();

  List<Language> getAllUsedLanguages();

  List<ModuleReference> getUsedDevkitReferences();

  List<DevKit> getUsedDevkits();

  List<IModule> getExplicitlyDependOnModules();

  List<IModule> getExplicitlyDependOnModules(boolean includeBootstrap);

  List<IModule> getDesignTimeDependOnModules();

  void addDependency(ModuleReference moduleRef, boolean reexport);

  void addUsedLanguage(ModuleReference langRef);

  void addUsedDevkit(ModuleReference devkitRef);

  SModelDescriptor createModel(SModelFqName fqName, SModelRoot root);

  Set<SModelDescriptor> getImplicitlyImportedModelsFor(SModelDescriptor sm);

  Set<Language> getImplicitlyImportedLanguages(SModelDescriptor sm);

  <T extends IModule> Set<T> getAllDependOnModules(Class<T> cls);

  IFile getDescriptorFile();

  ModuleDescriptor getModuleDescriptor();

  void setModuleDescriptor(ModuleDescriptor moduleDescriptor);

  void setModuleDescriptor(ModuleDescriptor moduleDescriptor, boolean reloadClasses);

  String getGeneratorOutputPath();

  String getTestsGeneratorOutputPath();

  String getOutputFor(SModelDescriptor model);

  IFile getClassesGen();

  File getBundleHome();

  @NotNull
  IScope getScope();

  List<String> getSourcePaths();

  Class getClass(String fqName);

  IClassPathItem getClassPathItem();

  IClassPathItem getModuleWithDependenciesClassPathItem();

  BytecodeLocator getBytecodeLocator();

  boolean isCompileInMPS();

  boolean reloadClassesAfterGeneration();

  void invalidateCaches();

  void updateClassPath();

  void updateStubs();

  void save();

  void onModuleLoad();

  boolean isPackaged();

  void dispose();

  boolean isValid();

  List<String> validate();

  void reloadFromDisk(boolean reloadClasses);

  boolean needReloading();

  boolean isStubPathExcluded(String path);

  boolean setStubPathExcluded(String path, boolean b);

  List<SNodeDescriptor> getStubsRootNodeDescriptors();
}
