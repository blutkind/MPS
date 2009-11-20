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
package jetbrains.mps.ide.ui;

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SModelStereotype;
import jetbrains.mps.ide.projectPane.ProjectModuleTreeNode;

import javax.swing.tree.TreeNode;

public class TextTreeNode extends MPSTreeNode {
  public TextTreeNode(String text) {
    this(text, null);
  }

  public TextTreeNode(String text, IOperationContext context) {
    super(context);
    setText(text);
    setNodeIdentifier(text.replaceAll(MPSTree.TREE_PATH_SEPARATOR, " "));
  }

  public String getDefaultStereotype() {
    TreeNode parent = getParent();
    if (parent != null && parent instanceof TextTreeNode) {
      return ((TextTreeNode) parent).getDefaultStereotype();
    }
    if (parent != null && parent instanceof ProjectModuleTreeNode) {
      return SModelStereotype.NONE;
    }
    return SModelStereotype.NONE;
  }
}
