package jetbrains.mps.closures.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.SubtypingRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.ISubtypingRule_Runtime;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import java.util.Collections;
import jetbrains.mps.closures.constraints.FunctionType_Behavior;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class supertypesOf_FunctionType_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  public supertypesOf_FunctionType_SubtypingRule() {
  }

  public List<SNode> getSubOrSuperTypes(SNode ft) {
    List<SNode> supertypes = Collections.emptyList();
    String rtSig = "FunctionTypes." + FunctionType_Behavior.call_getRuntimeSignature_1202756382806(ft);
    List<SNode> interfaces = RulesUtil_Closures.getInterfaces();
    for(SNode ice : interfaces) {
      if (rtSig.equals(SPropertyOperations.getString(ice, "name"))) {
        SNode ct = new QuotationClass_4().createNode(ice);
        if ((SLinkOperations.getTarget(ft, "resultType", true) != null) && !(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(ft, "resultType", true), "jetbrains.mps.baseLanguage.structure.VoidType"))) {
          SLinkOperations.addChild(ct, "parameter", SNodeOperations.copyNode(SLinkOperations.getTarget(ft, "resultType", true)));
        }
        for(SNode pt : SLinkOperations.getTargets(ft, "parameterType", true)) {
          SLinkOperations.addChild(ct, "parameter", SNodeOperations.copyNode(pt));
        }
        supertypes = Collections.singletonList(ct);
        break;
      }
    }
    return supertypes;
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.closures.structure.FunctionType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean isWeak() {
    return true;
  }

}
