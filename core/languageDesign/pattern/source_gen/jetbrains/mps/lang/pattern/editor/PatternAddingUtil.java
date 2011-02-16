package jetbrains.mps.lang.pattern.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.INodeAdapter;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.lang.pattern.structure.PatternExpression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.kernel.model.SModelUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.pattern.structure.LinkPatternVariableDeclaration;
import jetbrains.mps.lang.pattern.structure.PatternVariableDeclaration;

public class PatternAddingUtil {
  public PatternAddingUtil() {
  }

  public static boolean isPatternApplicable(EditorContext context) {
    EditorCell contextCell = context.getSelectedCell();
    if (contextCell == null) {
      return false;
    }
    INodeAdapter node = BaseAdapter.fromNode(contextCell.getSNode());
    if (node == null) {
      return false;
    }
    return node.findParent(PatternExpression.class) != null;
  }

  public static void addVariablePattern(EditorContext context) {
    EditorCell contextCell = context.getSelectedCell();
    SNode node = contextCell.getSNode();
    SModel model = node.getModel();
    SNode linkDeclaration = (SNode) BaseAdapter.fromAdapter(contextCell.getLinkDeclaration());
    SNode genuineLinkDeclaration = SModelUtil.getGenuineLinkDeclaration(linkDeclaration);
    if (linkDeclaration != null && SPropertyOperations.hasValue(genuineLinkDeclaration, "metaClass", "reference", "reference")) {
      linkDeclaration = genuineLinkDeclaration;
      String role = SPropertyOperations.getString(linkDeclaration, "role");
      LinkPatternVariableDeclaration linkPatternVariable = LinkPatternVariableDeclaration.newInstance(model);
      node.setLinkAttribute(role, linkPatternVariable.getNode());
    } else {
      PatternVariableDeclaration patternVariable = PatternVariableDeclaration.newInstance(model);
      node.setAttribute(patternVariable.getNode());
    }
  }
}
