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
package jetbrains.mps.ide.projectPane.logicalview.highlighting.visitor;

import com.intellij.openapi.application.Application;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.project.DumbService;
import jetbrains.mps.generator.ModelGenerationStatusManager;
import jetbrains.mps.ide.project.ProjectHelper;
import jetbrains.mps.ide.projectPane.ProjectPane;
import jetbrains.mps.ide.projectPane.logicalview.nodes.ProjectModuleTreeNode;
import jetbrains.mps.ide.projectPane.logicalview.nodes.ProjectTreeNode;
import jetbrains.mps.ide.ui.MPSTreeNode;
import jetbrains.mps.ide.ui.smodel.SModelTreeNode;
import jetbrains.mps.internal.collections.runtime.backports.LinkedList;
import jetbrains.mps.project.IModule;
import jetbrains.mps.project.ProjectOperationContext;
import jetbrains.mps.smodel.*;
import jetbrains.mps.smodel.descriptor.EditableSModelDescriptor;
import jetbrains.mps.util.Computable;
import jetbrains.mps.util.misc.hash.HashSet;
import org.jetbrains.annotations.Nullable;

import javax.swing.SwingUtilities;
import javax.swing.tree.TreeNode;
import java.util.List;
import java.util.Set;

public class ProjectPaneTreeGenStatusUpdater extends TreeNodeVisitor {

  private ProjectModuleTreeNode getContainingModuleNode(TreeNode node) {
    do {
      node = node.getParent();
      if (node ==null) return null;
    } while (!(node instanceof ProjectModuleTreeNode));
    return (ProjectModuleTreeNode) node;
  }

  protected void visitModelNode(final SModelTreeNode modelNode) {
    if (!ProjectPane.isShowGenStatus()) return;
    Application application = ApplicationManager.getApplication();
    if (application.isDisposed() || application.isDisposeInProgress()) return;

    SModelDescriptor md = modelNode.getSModelDescriptor();
    if (!(md instanceof EditableSModelDescriptor) && !(md.isGeneratable())) return;
    if (md.getModule() == null) return;

    TreeNode node = modelNode;
    final ProjectModuleTreeNode moduleNode = getContainingModuleNode(node);

    boolean wasChanged = md instanceof EditableSModelDescriptor && ((EditableSModelDescriptor) md).isChanged();

    if (moduleNode.getModule().isPackaged()) {
      updateNodeLater(modelNode, GenerationStatus.PACKAGED.getMessage());
      updateNodeLater(moduleNode, GenerationStatus.PACKAGED.getMessage());
      return;
    }

    if (wasChanged) {
      updateNodeLater(modelNode, GenerationStatus.REQUIRED.getMessage());
      updateNodeLater(moduleNode, GenerationStatus.REQUIRED.getMessage());
      if (moduleNode.getModule() instanceof Generator) {
        updateNodeLater(getContainingModuleNode(moduleNode), GenerationStatus.REQUIRED.getMessage());
      }
      return;
    }

    GenerationStatus modelStatus = ModelAccess.instance().runReadAction(new Computable<GenerationStatus>() {
      public GenerationStatus compute() {
        // extra check before read action
        if (modelNode.getSModelDescriptor().getModule() == null) {
          return GenerationStatus.NOT_REQUIRED;
        }
        return getGenerationStatus(modelNode);
      }
    });
    updateModuleStatus(moduleNode);
    if (moduleNode.getModule() instanceof Generator) {
      updateModuleStatus(getContainingModuleNode(moduleNode));
    }
    updateNodeLater(modelNode, modelStatus.getMessage());
  }

  private void updateModuleStatus(final ProjectModuleTreeNode moduleNode) {
    if (moduleNode == null) return;
    GenerationStatus moduleStatus = ModelAccess.instance().runReadAction(new Computable<GenerationStatus>() {
      public GenerationStatus compute() {
        return generationRequired(moduleNode);
      }
    });
    updateNodeLater(moduleNode, moduleStatus.getMessage());
  }

  protected void visitModuleNode(final ProjectModuleTreeNode node) {

  }

  protected void visitProjectNode(ProjectTreeNode node) {

  }

  private boolean generationRequired(IModule module, IOperationContext context) {
    if (module == null) return false;
    for (SModelDescriptor md : module.getOwnModelDescriptors()) {
      boolean required = ModelGenerationStatusManager.getInstance().generationRequired(md, context);
      if (required) return true;
    }
    return false;
  }

  private GenerationStatus generationRequired(ProjectModuleTreeNode node) {
    IModule module = node.getModule();
    ProjectOperationContext context = new ProjectOperationContext(node.getOperationContext().getProject());
    if (generationRequired(module, context)) return GenerationStatus.REQUIRED;
    if (module instanceof Language) {
      for (Generator generator : ((Language) module).getGenerators()) {
        if (generationRequired(generator, context)) return GenerationStatus.REQUIRED;
      }
    }
    return GenerationStatus.NOT_REQUIRED;
  }

  private GenerationStatus getGenerationStatus(SModelTreeNode node) {
    if (node.getSModelDescriptor() == null) return GenerationStatus.NOT_REQUIRED;
    if (isPackaged(node)) return GenerationStatus.PACKAGED;
    if (isDoNotGenerate(node)) return GenerationStatus.DO_NOT_GENERATE;

    jetbrains.mps.project.Project project = node.getOperationContext().getProject();
    if (DumbService.getInstance(ProjectHelper.toIdeaProject(project)).isDumb()) return GenerationStatus.UPDATING;

    boolean required = ModelGenerationStatusManager.getInstance().generationRequired(node.getSModelDescriptor(), new ProjectOperationContext(project));
    return required ? GenerationStatus.REQUIRED : GenerationStatus.NOT_REQUIRED;
  }

  private boolean isPackaged(SModelTreeNode node) {
    SModelDescriptor md = node.getSModelDescriptor();
    if (!(md instanceof EditableSModelDescriptor)) return false;
    return ((EditableSModelDescriptor) md).isReadOnly();
  }

  private boolean isDoNotGenerate(SModelTreeNode node) {
    SModelDescriptor md = node.getSModelDescriptor();
    if (!(md instanceof DefaultSModelDescriptor)) return false;
    return ((DefaultSModelDescriptor) md).isDoNotGenerate();
  }

  private void updateNodeLater(final MPSTreeNode node, final String addText) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        node.setAdditionalText(addText);
        node.updateNodePresentationInTree();
      }
    });
  }

  public static enum GenerationStatus {
    PACKAGED("packaged"),
    DO_NOT_GENERATE("do not generate"),
    UPDATING("updating..."),
    REQUIRED("generation required"),
    NOT_REQUIRED(null);

    private String myMessage;

    GenerationStatus(String message) {
      myMessage = message;
    }

    @Nullable
    public String getMessage() {
      return myMessage;
    }
  }
}
