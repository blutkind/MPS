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

import com.intellij.openapi.util.Computable;
import jetbrains.mps.ide.projectPane.logicalview.nodes.ProjectModuleTreeNode;
import jetbrains.mps.ide.projectPane.logicalview.nodes.ProjectTreeNode;
import jetbrains.mps.ide.ui.ErrorState;
import jetbrains.mps.ide.ui.MPSTreeNode;
import jetbrains.mps.ide.ui.smodel.SModelTreeNode;
import jetbrains.mps.project.IModule;
import jetbrains.mps.project.validation.ModelValidator;
import jetbrains.mps.project.validation.ModuleValidatorFactory;
import jetbrains.mps.smodel.*;

import javax.swing.SwingUtilities;
import java.util.Collections;
import java.util.List;

public class ProjectPaneTreeErrorChecker extends TreeNodeVisitor {
  protected void visitModelNode(final SModelTreeNode node) {
    final SModelDescriptor modelDescriptor = node.getSModelDescriptor();
    if (modelDescriptor != null && modelDescriptor.getLoadingState() != ModelLoadingState.NOT_LOADED) {
      final IScope scope = node.getOperationContext().getScope();
      List<String> errors = ModelAccess.instance().runReadAction(new Computable<List<String>>() {
        public List<String> compute() {
          return new ModelValidator(modelDescriptor.getSModel()).validate(scope);
        }
      });

      String result = null;
      if (!errors.isEmpty()) {
        result = "<html>";
        for (String r : errors) {
          result += r + "<br>";
        }
      }

      updateNodeLater(node, result);
    }
  }

  protected void visitModuleNode(final ProjectModuleTreeNode node) {
    List<String> errors = ModelAccess.instance().runReadAction(new Computable<List<String>>() {
      public List<String> compute() {
        IModule module = node.getModule();
        if (module==null) return Collections.emptyList();
        return ModuleValidatorFactory.createValidator(module).getErrors();
      }
    });

    String result = null;
    if (!errors.isEmpty()) {
      result = "<html>";
      for (String error : errors) {
        result += error + "<br>";
      }
    }

    updateNodeLater(node, result);
  }

  protected void visitProjectNode(final ProjectTreeNode node) {
    String errors = node.getProject().getErrors();
    updateNodeLater(node, errors);
  }

  private void updateNodeLater(final MPSTreeNode node, final String tooltipText) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        node.setErrorState(tooltipText == null ? ErrorState.NONE : ErrorState.ERROR);
        node.setTooltipText(tooltipText);
        node.updateNodePresentationInTree();
      }
    });
  }
}
