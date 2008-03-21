package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.helgins.runtime.HUtil;
import jetbrains.mps.baseLanguage.constraints.ClassConcept_Behavior;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;

public class AddRuntimeExceptionToMethodSignature_Intention extends BaseIntention implements Intention {

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.ThrowStatement";
  }

  public boolean isErrorIntention() {
    return false;
  }

  public String getDescription(SNode node, EditorContext editorContext) {
    return "Add runtime exception to method signature";
  }

  public boolean isApplicable(SNode node, EditorContext editorContext) {
    final zClosureContext3 _zClosureContext2 = new zClosureContext3();
    // check that this is done in a method
    SNode methodDecl = SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration", false, false);
    if (methodDecl == null) {
      return false;
    }
    // get exception type
    _zClosureContext2.exceptionType = (TypeChecker.getInstance().getRuntimeSupport().coerce(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(node, "throwable", true)), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.ClassifierType"), true));
    if (_zClosureContext2.exceptionType == null) {
      return false;
    }
    SNode exceptionJavaType = (SNode)SLinkOperations.getTarget(_zClosureContext2.exceptionType, "classifier", false);
    if (exceptionJavaType == null) {
      return false;
    }
    // check it's instance of RuntimeException
    if (!(ClassConcept_Behavior.call_isDescendant_1199631877012(exceptionJavaType, (SNode)SLinkOperations.getTarget(new QuotationClass_3().createNode(), "classifier", false)))) {
      return false;
    }
    // check if it's not thrown by a method yet
    if (!(SequenceOperations.isEmpty(SequenceOperations.where(SLinkOperations.getTargets(methodDecl, "throwsItem", true), new zPredicate1(null, _zClosureContext2))))) {
      return false;
    }
    return true;
  }

  public void execute(SNode node, EditorContext editorContext) {
    SNode methodDecl = SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration", false, false);
    SLinkOperations.addChild(methodDecl, "throwsItem", (SNode)TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(node, "throwable", true)));
  }

}
