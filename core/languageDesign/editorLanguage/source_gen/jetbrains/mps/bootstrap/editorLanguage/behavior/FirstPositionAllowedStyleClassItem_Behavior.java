package jetbrains.mps.bootstrap.editorLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;

public class FirstPositionAllowedStyleClassItem_Behavior {

  public static void init(SNode thisNode) {
  }

  public static boolean virtual_isApplicableTo_1214304723440(SNode thisNode, SNode cellModel) {
    return SNodeOperations.isInstanceOf(cellModel, "jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_AbstractLabel");
  }

}
