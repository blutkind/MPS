package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.core.behavior.BaseConcept_Behavior;

public class ConstructorDeclaration_Behavior {

  public static void init(SNode thisNode) {
  }

  public static String virtual_getPresentation_1213877396640(SNode thisNode) {
    StringBuilder result = new StringBuilder();
    result.append(SPropertyOperations.getString(thisNode, "nestedName"));
    result.append("(");
    boolean first = true;
    for(SNode parm : SLinkOperations.getTargets(thisNode, "parameter", true)) {
      if (!(first)) {
        result.append(",");
      }
      ModelAccess.instance().runReadAction(new Runnable() {

        public void run() {
        }

      });
      first = false;
      if (SLinkOperations.getTarget(parm, "type", true) != null) {
        result.append(BaseConcept_Behavior.call_getPresentation_1213877396640(SLinkOperations.getTarget(parm, "type", true)));
      } else
      {
        result.append("???");
      }
    }
    result.append(")");
    return result.toString();
  }

}
