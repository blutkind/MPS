package jetbrains.mps.lang.typesystem.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class WhenConcreteVariableDeclaration_Behavior {
  public static void init(SNode thisNode) {
    SLinkOperations.setNewChild(thisNode, "type", "jetbrains.mps.baseLanguage.structure.UndefinedType");
  }
}
