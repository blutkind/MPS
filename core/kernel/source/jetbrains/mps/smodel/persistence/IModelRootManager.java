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
package jetbrains.mps.smodel.persistence;

import jetbrains.mps.project.IModule;
import jetbrains.mps.project.SModelRoot;
import jetbrains.mps.refactoring.StructureModificationLog;
import jetbrains.mps.smodel.*;
import jetbrains.mps.smodel.persistence.def.DescriptorLoadResult;
import jetbrains.mps.vfs.IFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.Set;

public interface IModelRootManager {
  void updateModels(@NotNull SModelRoot root, @NotNull IModule owner);

  boolean isNewModelsSupported();

  /*
   * If you will implement this method do not forget
   * 1. Register new model in SModelRepository
   * 2. Fire new model created event : SModelsMulticaster.getInstance().fireModelCreatedEvent(modelDescriptor);
   */
  @NotNull
  SModelDescriptor createNewModel(@NotNull SModelRoot root,
                                  @NotNull SModelFqName fqName,
                                  @NotNull ModelOwner owner);
}
