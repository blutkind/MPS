package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class supertypes_of_typeVariableReference_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  public supertypes_of_typeVariableReference_SubtypingRule() {
  }

  public List<SNode> getSubOrSuperTypes(SNode typeVariableReference, TypeCheckingContext typeCheckingContext) {
    SNode typeVariableDeclaration = SLinkOperations.getTarget(typeVariableReference, "typeVariableDeclaration", false);
    List<SNode> supertypes = new ArrayList<SNode>();
    if ((SLinkOperations.getTarget(typeVariableDeclaration, "bound", true) != null)) {
      ListSequence.fromList(supertypes).addElement(SLinkOperations.getTarget(typeVariableDeclaration, "bound", true));
    }
    for (SNode bound : SLinkOperations.getTargets(typeVariableDeclaration, "auxBounds", true)) {
      ListSequence.fromList(supertypes).addElement(bound);
    }
    if (ListSequence.fromList(supertypes).isEmpty()) {
      ListSequence.fromList(supertypes).addElement(new supertypes_of_typeVariableReference_SubtypingRule.QuotationClass_6210_0().createNode(typeCheckingContext));
    }
    return supertypes;
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.TypeVariableReference";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean isWeak() {
    return false;
  }

  public static class QuotationClass_6210_0 {
    public QuotationClass_6210_0() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_118 = null;
      {
        quotedNode_118 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_114 = quotedNode_118;
        quotedNode1_114.addReference(SReference.create("classifier", quotedNode1_114, SModelReference.fromString("f:java_stub#java.lang(java.lang@java_stub)"), SNodeId.fromString("~Object")));
        result = quotedNode1_114;
      }
      return result;
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_118 = null;
      {
        quotedNode_118 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_114 = quotedNode_118;
        quotedNode1_114.addReference(SReference.create("classifier", quotedNode1_114, SModelReference.fromString("f:java_stub#java.lang(java.lang@java_stub)"), SNodeId.fromString("~Object")));
        result = quotedNode1_114;
      }
      return result;
    }
  }
}
