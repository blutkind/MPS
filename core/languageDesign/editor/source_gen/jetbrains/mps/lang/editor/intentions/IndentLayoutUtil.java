package jetbrains.mps.lang.editor.intentions;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.collections.internal.query.ListOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.editor.behavior.EditorCellModel_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class IndentLayoutUtil {

  public IndentLayoutUtil() {
  }

  public static List<SNode> moveToIndentLayoutChildren(SNode node, boolean isLast) {
    List<SNode> result = ListOperations.<SNode>createList();
    if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.editor.structure.CellModel_Collection")) {
      if (SLinkOperations.getTarget(node, "renderingCondition", true) != null || EditorCellModel_Behavior.call_isIndented_1237383418148(node) || SPropertyOperations.getBoolean(node, "vertical")) {
        moveToIndentLayout(node);
        if (isLast) {
          SNode classItem = SConceptOperations.createNewNode("jetbrains.mps.lang.editor.structure.IndentLayoutNewLineStyleClassItem", null);
          SPropertyOperations.set(classItem, "flag", "" + true);
          SLinkOperations.addChild(node, "styleItem", classItem);
        }
        ListSequence.fromList(result).addElement(node);
      } else
      {
        List<SNode> children = SLinkOperations.getTargets(node, "childCellModel", true);
        for(int i = 0 ; i < ListSequence.fromList(children).count() ; i++ ) {
          ListSequence.fromList(result).addSequence(ListSequence.fromList(moveToIndentLayoutChildren(ListSequence.fromList(children).getElement(i), isLast && (i == ListSequence.fromList(children).count() - 1))));
        }
      }
    } else if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.editor.structure.CellModel_Indent")) {
      IndentLayoutUtil.makeIndent(SNodeOperations.getNextSibling(node));
    } else
    {
      ListSequence.fromList(result).addElement(node);
      if (isLast) {
        SNode classItem = SConceptOperations.createNewNode("jetbrains.mps.lang.editor.structure.IndentLayoutNewLineStyleClassItem", null);
        SPropertyOperations.set(classItem, "flag", "" + true);
        SLinkOperations.addChild(node, "styleItem", classItem);
      }
    }
    return result;
  }

  public static void moveToIndentLayout(SNode node) {
    if (SLinkOperations.getTarget(node, "cellLayout", true) == null) {
      List<SNode> children = ListOperations.<SNode>createList();
      for(SNode cellModel : ListSequence.fromList(SLinkOperations.getTargets(node, "childCellModel", true))) {
        ListSequence.fromList(children).addSequence(ListSequence.fromList(moveToIndentLayoutChildren(cellModel, SPropertyOperations.getBoolean(node, "vertical"))));
      }
      SLinkOperations.removeAllChildren(node, "childCellModel");
      SLinkOperations.addAll(node, "childCellModel", children);
      SLinkOperations.setTarget(node, "cellLayout", SConceptOperations.createNewNode("jetbrains.mps.lang.editor.structure.CellLayout_Indent", null), true);
    }
  }

  private static void makeIndent(SNode cellModel) {
    SNode classItem = SConceptOperations.createNewNode("jetbrains.mps.lang.editor.structure.IndentLayoutIndentStyleClassItem", null);
    SPropertyOperations.set(classItem, "flag", "" + true);
    SLinkOperations.addChild(cellModel, "styleItem", classItem);
  }

}
