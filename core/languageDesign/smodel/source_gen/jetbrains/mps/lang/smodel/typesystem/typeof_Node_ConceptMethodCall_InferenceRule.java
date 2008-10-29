package jetbrains.mps.lang.smodel.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import java.util.Iterator;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_Node_ConceptMethodCall_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_Node_ConceptMethodCall_InferenceRule() {
  }

  public void applyRule(final SNode conceptMethodCall, final TypeCheckingContext typeCheckingContext) {
    if (!((SLinkOperations.getTarget(conceptMethodCall, "baseMethodDeclaration", false) != null))) {
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.reportTypeError(conceptMethodCall, "no method declaration", "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1179410829052", intentionProvider);
    }
    int actCount = SLinkOperations.getCount(conceptMethodCall, "actualArgument");
    int expCount = SLinkOperations.getCount(SLinkOperations.getTarget(conceptMethodCall, "baseMethodDeclaration", false), "parameter");
    if (!(actCount == expCount)) {
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.reportTypeError(conceptMethodCall, "Wrong parameters number: expected " + expCount + ", actual " + actCount, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1179410886099", intentionProvider);
    }
    {
      SNode arg;
      SNode parameter;
      Iterator<SNode> arg_iterator = SLinkOperations.getTargets(conceptMethodCall, "actualArgument", true).iterator();
      Iterator<SNode> parameter_iterator = SLinkOperations.getTargets(SLinkOperations.getTarget(conceptMethodCall, "baseMethodDeclaration", false), "parameter", true).iterator();
      while (true) {
        if (!(arg_iterator.hasNext())) {
          break;
        }
        if (!(parameter_iterator.hasNext())) {
          break;
        }
        arg = arg_iterator.next();
        parameter = parameter_iterator.next();
        {
          SNode _nodeToCheck_1029348928467 = conceptMethodCall;
          BaseIntentionProvider intentionProvider = null;
          typeCheckingContext.createLessThanInequation(typeCheckingContext.typeOf(arg, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1179411075565", true), typeCheckingContext.typeOf(parameter, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1179411084134", true), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1179411081637", false, 0, intentionProvider);
        }
      }
    }
    {
      SNode _nodeToCheck_1029348928467 = conceptMethodCall;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createEquation(typeCheckingContext.typeOf(conceptMethodCall, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1179410528345", true), SLinkOperations.getTarget(SLinkOperations.getTarget(conceptMethodCall, "baseMethodDeclaration", false), "returnType", true), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1179410535708", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.smodel.structure.Node_ConceptMethodCall";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
