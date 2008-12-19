package jetbrains.mps.lang.editor.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.generator.template.TemplateQueryContext;
import jetbrains.mps.lang.structure.behavior.PropertyDeclaration_Behavior;

public class CellModel_Property_Behavior {

  public static void init(SNode thisNode) {
  }

  public static String virtual_getRoleForCell_1216377898846(SNode thisNode) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(thisNode, "relationDeclaration", false), "name");
  }

  public static String virtual_createCellId_1216737839993(SNode thisNode, TemplateQueryContext gc) {
    return PropertyDeclaration_Behavior.call_getCellId_1216822951265(SLinkOperations.getTarget(thisNode, "relationDeclaration", false));
  }

  public static String virtual_getOpeningText_1220339714057(SNode thisNode) {
    return "{";
  }

  public static String virtual_getClosingText_1220339738643(SNode thisNode) {
    return "}";
  }

}
