package jetbrains.mps.bootstrap.smodelLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;

public class SModelLanguageUtil {

  private SModelLanguageUtil() {
  }

  public static SNode getDatatypeFromLeft_SPropertyAccess(SNode operation) {
    SNode property = getPropertyDeclarationFromLeft_SPropertyAccess(operation);
    if ((property != null)) {
      return SLinkOperations.getTarget(property, "dataType", false);
    }
    return null;
  }

  private static SNode getPropertyDeclarationFromLeft_SPropertyAccess(SNode operation) {
    SNode leftExpression = SLinkOperations.getTarget(SNodeOperations.getParent(operation), "operand", true);
    SNode leftOp = SLinkOperations.getTarget(leftExpression, "operation", true);
    if (SNodeOperations.isInstanceOf(leftOp, "jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess")) {
      return SLinkOperations.getTarget(leftOp, "property", false);
    }
    return null;
  }

}
