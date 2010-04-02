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

import com.intellij.openapi.project.Project;
import jetbrains.mps.MPSProjectHolder;
import jetbrains.mps.smodel.DefaultScope;
import jetbrains.mps.smodel.Language;

import java.util.HashSet;
import java.util.Set;

public class ProjectScope extends DefaultScope {
  private Project myProject;

  public ProjectScope(Project project) {
    myProject = project;
  }

  protected Set<IModule> getInitialModules() {
    MPSProject mpsProject = myProject.getComponent(MPSProjectHolder.class).getMPSProject();

    Set<IModule> result = new HashSet<IModule>();
    result.addAll(mpsProject.getProjectSolutions());
    for (Language l : mpsProject.getProjectLanguages()) {
      result.add(l);
      result.addAll(l.getGenerators());
    }

    result.addAll(mpsProject.getProjectDevKits());
    return result;
  }
}
