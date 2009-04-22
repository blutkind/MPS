package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.collections.internal.query.ListOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SModelUtil_new;

public class supertypes_of_typeVariableReference_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  public supertypes_of_typeVariableReference_SubtypingRule() {
  }

  public List<SNode> getSubOrSuperTypes(SNode typeVariableReference) {
    SNode typeVariableDeclaration = SLinkOperations.getTarget(typeVariableReference, "typeVariableDeclaration", false);
    List<SNode> supertypes = ListOperations.<SNode>createList();
    ListSequence.fromList(supertypes).addElement(new _Quotations.QuotationClass_88().createNode());
    if ((SLinkOperations.getTarget(typeVariableDeclaration, "bound", true) != null)) {
      ListSequence.fromList(supertypes).addElement(SLinkOperations.getTarget(typeVariableDeclaration, "bound", true));
    }
    for(SNode bound : SLinkOperations.getTargets(typeVariableDeclaration, "auxBounds", true)) {
      ListSequence.fromList(supertypes).addElement(bound);
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

}
