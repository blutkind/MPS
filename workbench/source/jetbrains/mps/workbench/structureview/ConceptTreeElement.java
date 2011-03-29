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
package jetbrains.mps.workbench.structureview;

import com.intellij.ide.DataManager;
import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.ide.util.treeView.smartTree.TreeElement;
import com.intellij.navigation.ItemPresentation;
import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.AsyncResult.Handler;
import jetbrains.mps.ide.editorTabs.EditorTabDescriptor;
import jetbrains.mps.plugins.projectplugins.ProjectPluginManager;
import jetbrains.mps.project.IModule;
import jetbrains.mps.project.ModuleContext;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.workbench.choose.nodes.NodePresentation;
import jetbrains.mps.workbench.editors.MPSEditorOpener;

import java.util.ArrayList;
import java.util.List;

class ConceptTreeElement extends NodeTreeElement {
  private Project myProject;

  public ConceptTreeElement(Project project, SNode node) {
    super(node);
    myProject = project;
  }

  public TreeElement[] getChildren() {
    List<TreeElement> result = new ArrayList<TreeElement>();

    List<EditorTabDescriptor> tabs = myProject.getComponent(ProjectPluginManager.class).getTabDescriptors(myNode);
    for (EditorTabDescriptor tab: tabs) {
      for (SNode aspectNode: tab.getNodes(myNode)){
        result.add(new AspectTreeElement(aspectNode));
      }
    }

    return result.toArray(new TreeElement[result.size()]);
  }

}
