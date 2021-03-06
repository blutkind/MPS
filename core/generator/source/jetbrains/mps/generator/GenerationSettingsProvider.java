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
package jetbrains.mps.generator;

import jetbrains.mps.components.CoreComponent;

/**
 * Created by IntelliJ IDEA.
 * User: fyodor
 * Date: 11/10/11
 * Time: 11:36 AM
 * To change this template use File | Settings | File Templates.
 */
public class GenerationSettingsProvider implements CoreComponent {

  private static GenerationSettingsProvider INSTANCE;

  private IModifiableGenerationSettings myGenerationSettings;

  public static GenerationSettingsProvider getInstance () {
    return INSTANCE;
  }

  public void setGenerationSettings(IModifiableGenerationSettings generationSettings) {
    myGenerationSettings = generationSettings;
  }

  public IModifiableGenerationSettings getGenerationSettings () {
    return myGenerationSettings;
  }

  @Override
  public void init() {
    INSTANCE = this;
  }

  @Override
  public void dispose() {
    INSTANCE = null;
  }
}
