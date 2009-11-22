/*
 * Copyright 2003-2009 JetBrains s.r.o.
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
package jetbrains.mps.smodel;

import jetbrains.mps.project.IModule;
import jetbrains.mps.project.SModelRoot;
import jetbrains.mps.smodel.persistence.AbstractModelRootManager;
import jetbrains.mps.smodel.persistence.IModelRootManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Set;

public class ProjectModels {
  private static long ourProjectModelDescriptorCount = 0;
  private static final IModelRootManager ourModelRootManager = new AbstractModelRootManager() {
    public void updateModelsWhenLoaded(@NotNull SModelRoot root, @NotNull IModule owner) {
      throw new RuntimeException();
    }

    @NotNull
    public SModel loadModel(@NotNull SModelDescriptor modelDescriptor) {
      return new SModel(modelDescriptor.getSModelReference());
    }

    public void saveModel(@NotNull SModelDescriptor modelDescriptor) {
    }


    @Nullable
    public SModel refresh(@NotNull SModelDescriptor modelDescriptor) {
      return modelDescriptor.getSModel();
    }
  };

  @NotNull
  public static SModelDescriptor createDescriptorFor(@NotNull ModelOwner owner) {
    SModelFqName fqName = new SModelFqName("projectModel" + ourProjectModelDescriptorCount++, SModelStereotype.INTERNAL); // "$internal$"
    SModelDescriptor result = new DefaultSModelDescriptor(ourModelRootManager, null, new SModelReference(fqName, SModelId.generate()));
    SModelRepository.getInstance().registerModelDescriptor(result, owner);
    return result;
  }

  public static boolean isProjectModel(@NotNull SModelReference reference) {
    return SModelStereotype.INTERNAL.equals(reference.getStereotype()); // "$internal$"
  }
}
