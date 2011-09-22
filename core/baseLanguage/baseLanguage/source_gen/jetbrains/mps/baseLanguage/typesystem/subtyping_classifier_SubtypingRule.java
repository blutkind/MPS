package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class subtyping_classifier_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  public subtyping_classifier_SubtypingRule() {
  }

  public List<SNode> getSubOrSuperTypes(SNode clt, TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    SNode classifier = SLinkOperations.getTarget(clt, "classifier", false);
    List<SNode> result = ListSequence.fromList(new ArrayList<SNode>());
    List<SNode> supertypes = ListSequence.fromList(new ArrayList<SNode>());
    if (SNodeOperations.isInstanceOf(classifier, "jetbrains.mps.baseLanguage.structure.ClassConcept")) {
      SNode classConcept = SNodeOperations.cast(classifier, "jetbrains.mps.baseLanguage.structure.ClassConcept");
      if (!((SLinkOperations.getTarget(classConcept, "superclass", true) == null))) {
        ListSequence.fromList(supertypes).addElement(SLinkOperations.getTarget(classConcept, "superclass", true));
      }
      ListSequence.fromList(supertypes).addSequence(ListSequence.fromList(SLinkOperations.getTargets(classConcept, "implementedInterface", true)));
    }
    if (SNodeOperations.isInstanceOf(classifier, "jetbrains.mps.baseLanguage.structure.Interface")) {
      SNode interfaceConcept = SNodeOperations.cast(classifier, "jetbrains.mps.baseLanguage.structure.Interface");
      ListSequence.fromList(supertypes).addSequence(ListSequence.fromList(SLinkOperations.getTargets(interfaceConcept, "extendedInterface", true)));
    }
    if (ListSequence.fromList(supertypes).isEmpty()) {
      ListSequence.fromList(result).addElement(new subtyping_classifier_SubtypingRule.QuotationClass_pgdy8e_a0a0a0f0a().createNode(typeCheckingContext));
    }
    for (SNode supertype : supertypes) {
      SNode supertypeCopy = SNodeOperations.cast(SNodeOperations.copyNode(supertype), "jetbrains.mps.baseLanguage.structure.ClassifierType");
      for (SNode typeParam : SLinkOperations.getTargets(supertypeCopy, "parameter", true)) {
        for (SNode typeVar : SNodeOperations.getDescendants(typeParam, "jetbrains.mps.baseLanguage.structure.TypeVariableReference", true, new String[]{})) {
          int i = ListSequence.fromList(SLinkOperations.getTargets(classifier, "typeVariableDeclaration", true)).indexOf(SLinkOperations.getTarget(typeVar, "typeVariableDeclaration", false));
          if (i < 0 || i >= ListSequence.fromList(SLinkOperations.getTargets(clt, "parameter", true)).count()) {
            ((SNode) supertypeCopy).removeChild(typeParam);
            continue;
          }
          SNode newNode = SNodeOperations.copyNode(ListSequence.fromList(SLinkOperations.getTargets(clt, "parameter", true)).getElement(i));
          SNodeOperations.replaceWithAnother(typeVar, newNode);
        }
      }
      ListSequence.fromList(result).addElement(supertypeCopy);
    }
    ListSequence.fromList(supertypes).addElement(clt);
    for (SNode supertype : supertypes) {
      if (ListSequence.fromList(SLinkOperations.getTargets((SNodeOperations.cast(supertype, "jetbrains.mps.baseLanguage.structure.ClassifierType")), "parameter", true)).count() > 0) {
        SNode erasure = SNodeOperations.cast(SNodeOperations.copyNode(supertype), "jetbrains.mps.baseLanguage.structure.ClassifierType");
        for (SNode parameter : SLinkOperations.getTargets(erasure, "parameter", true)) {
          SNodeOperations.deleteNode(parameter);
        }
        ListSequence.fromList(result).addElement(erasure);
      }
    }
    return result;
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierType";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public boolean isWeak() {
    return false;
  }

  public static class QuotationClass_pgdy8e_a0a0a0f0a {
    public QuotationClass_pgdy8e_a0a0a0f0a() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(java.lang@java_stub)"), SNodeId.fromString("~Object")));
        result = quotedNode1_2;
      }
      return result;
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(java.lang@java_stub)"), SNodeId.fromString("~Object")));
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
