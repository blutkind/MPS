package jetbrains.mps.lang.editor.intentions;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.smodel.SNode;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.editor.behavior.EditorCellModel_Behavior;
import jetbrains.mps.lang.editor.behavior.CellModel_Collection_Behavior;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.editor.behavior.AbstractComponent_Behavior;

public class IndentLayoutUtil {
  public IndentLayoutUtil() {
  }

  public static List<SNode> moveToIndentLayoutChildren(SNode node, boolean isLast) {
    List<SNode> result = new ArrayList<SNode>();
    if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.editor.structure.CellModel_Collection")) {
      SNode collection = SNodeOperations.cast(node, "jetbrains.mps.lang.editor.structure.CellModel_Collection");
      if (SLinkOperations.getTarget(collection, "renderingCondition", true) != null || EditorCellModel_Behavior.call_isIndented_1237383418148(node) || CellModel_Collection_Behavior.call_isVertical_1237380214915(collection) || SLinkOperations.getTarget(ListSequence.fromList(SLinkOperations.getTargets(collection, "childCellModel", true)).last(), "renderingCondition", true) != null) {
        moveToIndentLayout(SNodeOperations.cast(node, "jetbrains.mps.lang.editor.structure.CellModel_Collection"));
        if (isLast) {
          SNode classItem = SConceptOperations.createNewNode("jetbrains.mps.lang.editor.structure.IndentLayoutNewLineStyleClassItem", null);
          SPropertyOperations.set(classItem, "flag", "" + true);
          SLinkOperations.addChild(node, "styleItem", classItem);
        }
        ListSequence.fromList(result).addElement(node);
      } else {
        List<SNode> children = SLinkOperations.getTargets(SNodeOperations.cast(node, "jetbrains.mps.lang.editor.structure.CellModel_Collection"), "childCellModel", true);
        for (int i = 0; i < ListSequence.fromList(children).count(); i++) {
          ListSequence.fromList(result).addSequence(ListSequence.fromList(moveToIndentLayoutChildren(ListSequence.fromList(children).getElement(i), isLast && (i == ListSequence.fromList(children).count() - 1))));
        }
      }
    } else if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.editor.structure.CellModel_Indent")) {
      IndentLayoutUtil.makeIndent(SNodeOperations.cast(SNodeOperations.getNextSibling(node), "jetbrains.mps.lang.editor.structure.EditorCellModel"));
    } else {
      ListSequence.fromList(result).addElement(node);
      if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.editor.structure.CellModel_RefNodeList")) {
        if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SNodeOperations.cast(node, "jetbrains.mps.lang.editor.structure.CellModel_RefNodeList"), "cellLayout", true), "jetbrains.mps.lang.editor.structure.CellLayout_Vertical")) {
          SNode classItem = SConceptOperations.createNewNode("jetbrains.mps.lang.editor.structure.IndentLayoutNewLineChildrenStyleClassItem", null);
          SLinkOperations.addChild(node, "styleItem", classItem);
        }
        SLinkOperations.setTarget(SNodeOperations.cast(node, "jetbrains.mps.lang.editor.structure.CellModel_RefNodeList"), "cellLayout", SConceptOperations.createNewNode("jetbrains.mps.lang.editor.structure.CellLayout_Indent", null), true);
      }
      if (isLast) {
        SNode classItem = SConceptOperations.createNewNode("jetbrains.mps.lang.editor.structure.IndentLayoutNewLineStyleClassItem", null);
        SPropertyOperations.set(classItem, "flag", "" + true);
        SLinkOperations.addChild(node, "styleItem", classItem);
      }
    }
    return result;
  }

  public static void moveToIndentLayout(SNode node) {
    if (SLinkOperations.getTarget(node, "cellLayout", true) == null || !(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "cellLayout", true), "jetbrains.mps.lang.editor.structure.CellLayout_Indent"))) {
      List<SNode> children = new ArrayList<SNode>();
      for (SNode cellModel : ListSequence.fromList(SLinkOperations.getTargets(node, "childCellModel", true))) {
        ListSequence.fromList(children).addSequence(ListSequence.fromList(moveToIndentLayoutChildren(cellModel, CellModel_Collection_Behavior.call_isVertical_1237380214915(node))));
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

  public static boolean isExtendsBaseLanguage(SNode node) {
    SNode editor = SNodeOperations.getAncestor(node, "jetbrains.mps.lang.editor.structure.BaseEditorComponent", false, false);
    if (editor == null) {
      return false;
    }
    if (SNodeOperations.getModel(SLinkOperations.getTarget(((SNode) AbstractComponent_Behavior.call_getConceptDeclaration_7055725856388417603(editor)), "extends", false)) != SNodeOperations.getModel(SNodeOperations.getNode("r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)", "1068580123132"))) {
      return false;
    }
    return true;
  }
}
