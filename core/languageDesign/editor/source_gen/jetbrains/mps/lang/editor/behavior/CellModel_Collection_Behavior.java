package jetbrains.mps.lang.editor.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class CellModel_Collection_Behavior {

  public static void init(SNode thisNode) {
  }

  public static String virtual_getOpeningText_1220339714057(SNode thisNode) {
    if (CellModel_Collection_Behavior.call_isVertical_1237380214915(thisNode)) {
      return "[/";
    } else if (CellModel_Collection_Behavior.call_isIndentLayout_1237380273398(thisNode)) {
      return "[-";
    } else
    {
      return "[>";
    }
  }

  public static String virtual_getClosingText_1220339738643(SNode thisNode) {
    if (CellModel_Collection_Behavior.call_isVertical_1237380214915(thisNode)) {
      return "/]";
    } else if (CellModel_Collection_Behavior.call_isIndentLayout_1237380273398(thisNode)) {
      return "-]";
    } else
    {
      return "<]";
    }
  }

  public static boolean call_isVertical_1237380214915(SNode thisNode) {
    return SPropertyOperations.getBoolean(thisNode, "vertical") && (SLinkOperations.getTarget(thisNode, "cellLayout", true) == null);
  }

  public static boolean call_isHorizontal_1237380252717(SNode thisNode) {
    return !(SPropertyOperations.getBoolean(thisNode, "vertical")) && (SLinkOperations.getTarget(thisNode, "cellLayout", true) == null);
  }

  public static boolean call_isIndentLayout_1237380273398(SNode thisNode) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(thisNode, "cellLayout", true), "jetbrains.mps.lang.editor.structure.CellLayout_Indent");
  }

  public static boolean call_isVerticalIndent_1237451001939(SNode thisNode) {
    if (!(CellModel_Collection_Behavior.call_isIndentLayout_1237380273398(thisNode))) {
      return false;
    }
    if (EditorCellModel_Behavior.call_isNewLineChildren_1237383562600(thisNode)) {
      return true;
    }
    for(SNode model : SLinkOperations.getTargets(thisNode, "childCellModel", true)) {
      if (EditorCellModel_Behavior.call_isNewLine_1237383076236(model) || EditorCellModel_Behavior.call_isNewLineChildren_1237383562600(model) || EditorCellModel_Behavior.call_isOnNewLine_1237385424172(model)) {
        return true;
      }
      if (SNodeOperations.isInstanceOf(model, "jetbrains.mps.lang.editor.structure.CellModel_Collection") && CellModel_Collection_Behavior.call_isVerticalIndent_1237451001939(model)) {
        return true;
      }
    }
    return false;
  }

}
