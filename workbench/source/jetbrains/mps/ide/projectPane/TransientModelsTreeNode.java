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
package jetbrains.mps.ide.projectPane;

import com.intellij.openapi.actionSystem.ActionGroup;
import com.intellij.openapi.project.Project;
import jetbrains.mps.generator.TransientModelsModule;
import jetbrains.mps.project.IModule;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.project.ModuleContext;
import jetbrains.mps.workbench.action.ActionUtils;

public class TransientModelsTreeNode extends ProjectModuleTreeNode {
  private IModule myTransientModule;

  public TransientModelsTreeNode(final Project project) {
    //sometimes (when opening another project after first project) module repository does not contain transient module
    //temp fix
    super(new ModuleContext(project.getComponent(TransientModelsModule.class), project) {
      @Override
      public IModule getModule() {
        return project.getComponent(TransientModelsModule.class);
      }
    });
    myTransientModule = project.getComponent(TransientModelsModule.class);
    populate();
    updatePresentation();
    setNodeIdentifier(myTransientModule.getModuleReference().toString());
  }

  protected void doUpdatePresentation() {
    super.doUpdatePresentation();
    setIcon(Icons.TRANSIENT_MODELS_ICON);
  }

  protected String getModulePresentation() {
    return "transient models";
  }

  public IModule getModule() {
    return myTransientModule;
  }

  private void populate() {
    if (getOperationContext().getModule() != null) {
      SModelsSubtree.create(this, getOperationContext());
    }
  }

  public ActionGroup getActionGroup() {
    return ActionUtils.getGroup(ProjectPaneActionGroups.PROJECT_PANE_TRANSIENT_MODULES_ACTIONS);
  }
}
