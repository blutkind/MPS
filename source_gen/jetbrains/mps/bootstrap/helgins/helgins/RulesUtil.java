package jetbrains.mps.bootstrap.helgins.helgins;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import java.util.List;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;

public class RulesUtil {
  public static final Object MAY_BE_VARIABLE = new Object();

  public static boolean withinInferenceItem(SNode node) {
    if((SNodeOperations.getAncestor(node, "jetbrains.mps.bootstrap.helgins.structure.InferenceRule", false, false) != null)) {
      return true;
    }
    List<SNode> annotations = SLinkOperations.getTargets(SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration", false, false), "annotation", true);
    for(SNode annotation : annotations) {
      if(SLinkOperations.getTarget(annotation, "annotation", false) == SLinkOperations.getTarget(new QuotationClass_20().createNode(), "classifier", false)) {
        return true;
      }
    }
    return false;
  }

}
