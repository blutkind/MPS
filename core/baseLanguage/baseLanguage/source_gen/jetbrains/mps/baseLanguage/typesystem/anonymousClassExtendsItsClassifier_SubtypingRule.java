package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.collections.internal.query.ListOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.baseLanguage.typesystem._Quotations;

public class anonymousClassExtendsItsClassifier_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  public anonymousClassExtendsItsClassifier_SubtypingRule() {
  }

  public List<SNode> getSubOrSuperTypes(SNode classifierType) {
    List<SNode> result = ListOperations.<SNode>createList();
    do {
      SNode matchedNode_1 = SLinkOperations.getTarget(classifierType, "classifier", false);
      {
        boolean matches_1 = false;
        {
          SNode matchingNode_1 = SLinkOperations.getTarget(classifierType, "classifier", false);
          if (matchingNode_1 != null) {
            matches_1 = SModelUtil_new.isAssignableConcept(matchingNode_1.getConceptFqName(), "jetbrains.mps.baseLanguage.structure.AnonymousClass");
          }
        }
        if (matches_1) {
          ListSequence.fromList(result).addElement(new _Quotations.QuotationClass_87().createNode(SLinkOperations.getTargets(matchedNode_1, "typeParameter", true), SLinkOperations.getTarget(matchedNode_1, "classifier", false)));
          break;
        }
      }
    } while(false);
    return result;
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean isWeak() {
    return false;
  }

}
