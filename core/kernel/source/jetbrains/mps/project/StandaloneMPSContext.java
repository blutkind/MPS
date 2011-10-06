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
package jetbrains.mps.project;

import jetbrains.mps.MPSCore;
import jetbrains.mps.components.ComponentManager;
import jetbrains.mps.smodel.IOperationContext;

public abstract class StandaloneMPSContext implements IOperationContext {

  public boolean isTestMode() {
    return MPSCore.getInstance().isTestMode();
  }

  public <T> T getComponent(Class<T> clazz) {
    return ComponentManager.getInstance().getComponent(clazz);
  }

  public boolean isValid() {
    return true;
  }
}
