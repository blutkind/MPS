package jetbrains.mps.lang.pattern.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.lang.structure.behavior.AbstractConceptDeclaration_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ListPattern_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_ListPattern_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck, final TypeCheckingContext typeCheckingContext) {
    SNode attributedNode = SNodeOperations.getParent(nodeToCheck);
    SNode parent = SNodeOperations.getParent(attributedNode);
    if (parent == null) {
      {
        SNode _nodeToCheck_1029348928467 = nodeToCheck;
        BaseIntentionProvider intentionProvider = null;
        EquationInfo info = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590343(jetbrains.mps.lang.pattern.typesystem)", "1202491231731", 0, intentionProvider);
        typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590343(jetbrains.mps.lang.pattern.typesystem)", "1202491231736", true), (SNode)new _Quotations.QuotationClass_6().createNode(typeCheckingContext), info);
      }
    } else {
      String role = attributedNode.getRole_();
      SNode linkDeclaration = AbstractConceptDeclaration_Behavior.call_findLinkDeclaration_1213877394467(SNodeOperations.getConceptDeclaration(parent), role);
      {
        SNode _nodeToCheck_1029348928467 = nodeToCheck;
        BaseIntentionProvider intentionProvider = null;
        EquationInfo info = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590343(jetbrains.mps.lang.pattern.typesystem)", "1202491231762", 0, intentionProvider);
        typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590343(jetbrains.mps.lang.pattern.typesystem)", "1202491231771", true), (SNode)new _Quotations.QuotationClass_7().createNode(SLinkOperations.getTarget(linkDeclaration, "target", false), typeCheckingContext), info);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.pattern.structure.ListPattern";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }
}
