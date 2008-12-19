package jetbrains.mps.lang.editor.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.generator.template.TemplateQueryContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class CellModel_RefNodeList_Behavior {

  public static void init(SNode thisNode) {
  }

  public static String virtual_createCellId_1216737839993(SNode thisNode, TemplateQueryContext gc) {
    return "refNodeList_" + SPropertyOperations.getString(SLinkOperations.getTarget(thisNode, "relationDeclaration", false), "role");
  }

  public static String virtual_getOpeningText_1220339714057(SNode thisNode) {
    return "(>";
  }

  public static String virtual_getClosingText_1220339738643(SNode thisNode) {
    return "<)";
  }

}
