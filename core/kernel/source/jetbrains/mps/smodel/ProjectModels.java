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
package jetbrains.mps.smodel;

import org.jetbrains.annotations.NotNull;

public class ProjectModels {
  private static long ourProjectModelDescriptorCount = 0;

  @NotNull
  public static BaseSModelDescriptor createDescriptorFor(@NotNull ModelOwner owner) {
    SModelFqName fqName = new SModelFqName("projectModel" + ourProjectModelDescriptorCount++, SModelStereotype.INTERNAL);

    SModelReference ref = new SModelReference(fqName, SModelId.generate());
    BaseSModelDescriptor result = new BaseSModelDescriptor(ref, false) {
      protected ModelLoadResult initialLoad() {
        SModel model = new SModel(this.getSModelReference());
        return new ModelLoadResult(model, ModelLoadingState.FULLY_LOADED);
      }
    };
    SModelRepository.getInstance().registerModelDescriptor(result, owner);
    return result;
  }

  public static boolean isProjectModel(@NotNull SModelReference reference) {
    return SModelStereotype.INTERNAL.equals(reference.getStereotype());
  }
}
