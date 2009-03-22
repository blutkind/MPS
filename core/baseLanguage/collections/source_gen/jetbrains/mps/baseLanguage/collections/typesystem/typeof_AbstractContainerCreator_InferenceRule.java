package jetbrains.mps.baseLanguage.collections.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import java.util.Iterator;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.baseLanguage.collections.behavior.AbstractContainerCreator_Behavior;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_AbstractContainerCreator_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_AbstractContainerCreator_InferenceRule() {
  }

  public void applyRule(final SNode creator, final TypeCheckingContext typeCheckingContext) {
    {
      SNode initValue;
      Iterator<SNode> initValue_iterator = SLinkOperations.getTargets(creator, "initValue", true).iterator();
      while (true) {
        if (!(initValue_iterator.hasNext())) {
          break;
        }
        initValue = initValue_iterator.next();
        {
          SNode _nodeToCheck_1029348928467 = creator;
          BaseIntentionProvider intentionProvider = null;
          typeCheckingContext.createLessThanInequation(typeCheckingContext.typeOf(initValue, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1237723049579", true), SLinkOperations.getTarget(creator, "elementType", true), _nodeToCheck_1029348928467, "" + SLinkOperations.getTarget(creator, "elementType", true) + " is expected", "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1237723049573", false, 0, intentionProvider);
        }
      }
    }
    if ((SLinkOperations.getTarget(creator, "copyFrom", true) != null)) {
      {
        SNode _nodeToCheck_1029348928467 = creator;
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createLessThanInequation(typeCheckingContext.typeOf(SLinkOperations.getTarget(creator, "copyFrom", true), "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1237732500184", true), new _Quotations.QuotationClass_142().createNode(SLinkOperations.getTarget(creator, "elementType", true), typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1237732500182", false, 0, intentionProvider);
      }
    }
    {
      SNode _nodeToCheck_1029348928467 = creator;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createEquation(typeCheckingContext.typeOf(creator, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1237723292398", true), AbstractContainerCreator_Behavior.call_createType_1237722437229(creator), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1237723275733", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.collections.structure.AbstractContainerCreator";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
