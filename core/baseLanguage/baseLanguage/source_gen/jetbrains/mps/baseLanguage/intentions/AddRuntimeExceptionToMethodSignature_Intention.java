package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.baseLanguage.behavior.ClassConcept_Behavior;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class AddRuntimeExceptionToMethodSignature_Intention extends BaseIntention implements Intention {
  public AddRuntimeExceptionToMethodSignature_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.ThrowStatement";
  }

  public boolean isParameterized() {
    return false;
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Add Runtime Exception to Method Signature";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    // check that this is done in a method 
    SNode methodDecl = SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration", false, false);
    if (methodDecl == null) {
      return false;
    }
    // get exception type 
    final SNode exceptionType = (TypeChecker.getInstance().getRuntimeSupport().coerce_(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(node, "throwable", true)), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.ClassifierType"), true));
    if (exceptionType == null) {
      return false;
    }
    SNode exceptionJavaType = (SNode) SLinkOperations.getTarget(exceptionType, "classifier", false);
    if (exceptionJavaType == null) {
      return false;
    }
    // check it's instance of RuntimeException 
    if (!(ClassConcept_Behavior.call_isDescendant_1213877355812(exceptionJavaType, (SNode) SLinkOperations.getTarget(new AddRuntimeExceptionToMethodSignature_Intention.QuotationClass_1793_0().createNode(), "classifier", false)))) {
      return false;
    }
    // check if it's not thrown by a method yet 
    if (ListSequence.fromList(SLinkOperations.getTargets(methodDecl, "throwsItem", true)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SNodeOperations.isInstanceOf(it, "jetbrains.mps.baseLanguage.structure.ClassifierType") && SLinkOperations.getTarget(SNodeOperations.cast(it, "jetbrains.mps.baseLanguage.structure.ClassifierType"), "classifier", false) == SLinkOperations.getTarget(exceptionType, "classifier", false);
      }
    }).isNotEmpty()) {
      return false;
    }
    return true;
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode methodDecl = SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration", false, false);
    ListSequence.fromList(SLinkOperations.getTargets(methodDecl, "throwsItem", true)).addElement(SNodeOperations.cast(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(node, "throwable", true)), "jetbrains.mps.baseLanguage.structure.Type"));
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }

  public static class QuotationClass_1793_0 {
    public QuotationClass_1793_0() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_8 = null;
      {
        quotedNode_8 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_8 = quotedNode_8;
        quotedNode1_8.addReference(SReference.create("classifier", quotedNode1_8, SModelReference.fromString("f:java_stub#java.lang(java.lang@java_stub)"), SNodeId.fromString("~RuntimeException")));
        result = quotedNode1_8;
      }
      return result;
    }
  }
}
