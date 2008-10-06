package jetbrains.mps.bootstrap.editorLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.structureLanguage.behavior.ConceptPropertyDeclaration_Behavior;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.ConceptPropertyCellProvider;

public class CellModel_ConceptProperty_Behavior {

  public static void init(SNode thisNode) {
  }

  public static String virtual_getRoleForCell_1216377898846(SNode thisNode) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(thisNode, "relationDeclaration", false), "name");
  }

  public static String virtual_getCellId_1216737839993(SNode thisNode) {
    return ConceptPropertyDeclaration_Behavior.call_getCellId_1216822989252(SLinkOperations.getTarget(thisNode, "relationDeclaration", false));
  }

  public static String virtual_getOpeningText_1220339714057(SNode thisNode) {
    return "{{";
  }

  public static String virtual_getClosingText_1220339738643(SNode thisNode) {
    return "}}";
  }

  public static int virtual_getDefaultFontStyle_1221472292001(SNode thisNode) {
    return ConceptPropertyCellProvider.DEFAULT_FONT_STYLE;
  }

}
