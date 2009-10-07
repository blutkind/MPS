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
package jetbrains.mps.workbench.dataExtraction.runConfig;

import com.intellij.ide.impl.dataRules.GetDataRule;
import com.intellij.openapi.actionSystem.DataProvider;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.project.ProjectManager;
import jetbrains.mps.plugins.pluginparts.runconfigs.MPSLocation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.project.IModule;
import org.jetbrains.annotations.Nullable;

public class LocationRule implements GetDataRule {
  @Nullable
  public Object getData(DataProvider dataProvider) {
    Project project = (Project) dataProvider.getData(MPSDataKeys.PROJECT.getName());
    if (project == null) project = ProjectManager.getInstance().getOpenProjects()[0];
    if (project == null) return null;
    SNode node = (SNode) dataProvider.getData(MPSDataKeys.NODE.getName());
    if (node != null) return new MPSLocation(project, node);
    SModelDescriptor model = (SModelDescriptor) dataProvider.getData(MPSDataKeys.MODEL.getName());
    if (model != null) return new MPSLocation(project, model.getSModel());
    IModule module = (IModule) dataProvider.getData(MPSDataKeys.MODULE.getName());
    if (module != null) return new MPSLocation(project, module);
    return null;
  }
}