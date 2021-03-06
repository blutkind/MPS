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
package jetbrains.mps.refactoring.renameModel;

import jetbrains.mps.project.ReferenceUpdater;
import jetbrains.mps.smodel.DefaultSModelDescriptor;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.SModelFqName;
import jetbrains.mps.smodel.descriptor.EditableSModelDescriptor;

public class ModelRenamer {
  private EditableSModelDescriptor myModelDescriptor;
  private SModelFqName myModelFqName;
  private boolean myLazy;

  public ModelRenamer(EditableSModelDescriptor modelDescriptor, SModelFqName fqName, boolean lazy) {
    myModelDescriptor = modelDescriptor;
    myModelFqName = fqName;
    myLazy = lazy;
  }

  public void rename() {
    myModelDescriptor.rename(myModelFqName, true);
  }

  public void updateReferencesIfNeeded() {
    if (!myLazy) {
      ReferenceUpdater.getInstance().updateModelReferences();
      ReferenceUpdater.getInstance().updateModuleReferences();
    }
  }
}
