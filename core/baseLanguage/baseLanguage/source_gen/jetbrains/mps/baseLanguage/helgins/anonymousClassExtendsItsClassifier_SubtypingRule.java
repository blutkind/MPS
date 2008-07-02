package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.SubtypingRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.ISubtypingRule_Runtime;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import java.util.ArrayList;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class anonymousClassExtendsItsClassifier_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  public anonymousClassExtendsItsClassifier_SubtypingRule() {
  }

  public List<SNode> getSubOrSuperTypes(SNode classifierType) {
    List<SNode> result = new ArrayList<SNode>();
    do {
      SNode matchedNode_1215004601306 = SLinkOperations.getTarget(classifierType, "classifier", false);
      {
        boolean matches_1215004601308 = false;
        matches_1215004601308 = SModelUtil_new.isAssignableConcept(SLinkOperations.getTarget(classifierType, "classifier", false).getConceptFqName(), "jetbrains.mps.baseLanguage.structure.AnonymousClass");
        if (matches_1215004601308) {
          ListSequence.fromList(result).addElement(new QuotationClass_102().createNode(SLinkOperations.getTargets(matchedNode_1215004601306, "typeParameter", true), SLinkOperations.getTarget(matchedNode_1215004601306, "classifier", false)));
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
