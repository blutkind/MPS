package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.AbstractInequationReplacementRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.EquationInfo;
import jetbrains.mps.helgins.inference.TypeCheckingContext;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import java.util.Iterator;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.core.behavior.BaseConcept_Behavior;
import jetbrains.mps.lang.pattern.util.MatchingUtil;
import jetbrains.mps.smodel.SModelUtil_new;

public class subtypesOfClassifierTypeWWildcards_InequationReplacementRule extends AbstractInequationReplacementRule_Runtime {

  public subtypesOfClassifierTypeWWildcards_InequationReplacementRule() {
  }

  public void processInequation(final SNode subtype, final SNode supertype, final EquationInfo equationInfo, final TypeCheckingContext typeCheckingContext) {
    {
      final SNode t = subtype;
      TypeChecker.getInstance().getRuntimeSupport().whenConcrete(t, new Runnable() {

        public void run() {
          {
            Pattern_10 pattern_0 = new Pattern_10(SLinkOperations.getTarget(supertype, "classifier", false));
            SNode coercedNode_0 = TypeChecker.getInstance().getRuntimeSupport().coerce(TypeChecker.getInstance().getEquationManager().getRepresentator(t), pattern_0);
            if (coercedNode_0 != null) {
              {
                SNode typeParam;
                SNode myParam;
                Iterator<SNode> typeParam_iterator = SLinkOperations.getTargets(coercedNode_0, "parameter", true).iterator();
                Iterator<SNode> myParam_iterator = SLinkOperations.getTargets(supertype, "parameter", true).iterator();
                while (true) {
                  if (!(typeParam_iterator.hasNext())) {
                    break;
                  }
                  if (!(myParam_iterator.hasNext())) {
                    break;
                  }
                  typeParam = typeParam_iterator.next();
                  myParam = myParam_iterator.next();
                  {
                    final SNode finalTypeParam = typeParam;
                    {
                      SNode _nodeToCheck_1029348928467 = equationInfo.getNodeWithError();
                      BaseIntentionProvider intentionProvider = null;
                      TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(finalTypeParam, myParam, _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.helgins)", "1220535076789", false, 0, intentionProvider);
                    }
                    {
                      final SNode concreteParam = myParam;
                      TypeChecker.getInstance().getRuntimeSupport().whenConcrete(concreteParam, new Runnable() {

                        public void run() {
                          if (SNodeOperations.isInstanceOf(TypeChecker.getInstance().getEquationManager().getRepresentator(concreteParam), "jetbrains.mps.baseLanguage.structure.WildCardType") || SNodeOperations.isInstanceOf(TypeChecker.getInstance().getEquationManager().getRepresentator(concreteParam), "jetbrains.mps.baseLanguage.structure.UpperBoundType")) {
                            /*
                              {
                                SNode _nodeToCheck_1029348928467 = equationInfo.getNodeWithError();
                                BaseIntentionProvider intentionProvider = null;
                                TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(finalTypeParam, TypeChecker.getInstance().getEquationManager().getRepresentator(concreteParam), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.helgins)", "1220523357893", false, 0, intentionProvider);
                              }
                            */
                          } else
                          {
                            {
                              SNode _nodeToCheck_1029348928467 = equationInfo.getNodeWithError();
                              BaseIntentionProvider intentionProvider = null;
                              TypeChecker.getInstance().getRuntimeSupport().createEquation(finalTypeParam, TypeChecker.getInstance().getEquationManager().getRepresentator(concreteParam), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.helgins)", "1220523357903", intentionProvider);
                            }
                          }
                        }

                      }, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.helgins)", "1220523357880");
                    }
                  }
                }
              }
            } else
            {
              {
                BaseIntentionProvider intentionProvider = null;
                typeCheckingContext.reportTypeError(equationInfo.getNodeWithError(), BaseConcept_Behavior.call_getPresentation_1213877396640(subtype) + " is not a subtype of " + BaseConcept_Behavior.call_getPresentation_1213877396640(supertype), "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.helgins)", "1220523357915", intentionProvider);
              }
            }
          }
        }

      }, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.helgins)", "1220523357849");
    }
  }

  public boolean checkInequation(final SNode subtype, final SNode supertype, final EquationInfo equationInfo) {
    boolean result_14532009 = true;
    {
      final SNode t = subtype;
      {
        Pattern_10 pattern_1 = new Pattern_10(SLinkOperations.getTarget(supertype, "classifier", false));
        SNode coercedNode_1 = TypeChecker.getInstance().getRuntimeSupport().coerce(TypeChecker.getInstance().getEquationManager().getRepresentator(t), pattern_1);
        if (coercedNode_1 != null) {
          {
            SNode typeParam;
            SNode myParam;
            Iterator<SNode> typeParam_iterator = SLinkOperations.getTargets(coercedNode_1, "parameter", true).iterator();
            Iterator<SNode> myParam_iterator = SLinkOperations.getTargets(supertype, "parameter", true).iterator();
            while (true) {
              if (!(typeParam_iterator.hasNext())) {
                break;
              }
              if (!(myParam_iterator.hasNext())) {
                break;
              }
              typeParam = typeParam_iterator.next();
              myParam = myParam_iterator.next();
              {
                final SNode finalTypeParam = typeParam;
                result_14532009 = result_14532009 && TypeChecker.getInstance().getSubtypingManager().isSubtype(finalTypeParam, myParam, true);
                {
                  final SNode concreteParam = myParam;
                  if (SNodeOperations.isInstanceOf(TypeChecker.getInstance().getEquationManager().getRepresentator(concreteParam), "jetbrains.mps.baseLanguage.structure.WildCardType") || SNodeOperations.isInstanceOf(TypeChecker.getInstance().getEquationManager().getRepresentator(concreteParam), "jetbrains.mps.baseLanguage.structure.UpperBoundType")) {
                    /*
                      {
                        result_14532009 = result_14532009 && TypeChecker.getInstance().getSubtypingManager().isSubtype(finalTypeParam, TypeChecker.getInstance().getEquationManager().getRepresentator(concreteParam), true);
                      }
                    */
                  } else
                  {
                    result_14532009 = result_14532009 && MatchingUtil.matchNodes(finalTypeParam, TypeChecker.getInstance().getEquationManager().getRepresentator(concreteParam));
                  }
                }
              }
            }
          }
        } else
        {
          result_14532009 = false;
        }
      }
    }
    return result_14532009;
  }

  public boolean isWeak() {
    return true;
  }

  public boolean isApplicableSubtype(SNode node) {
    return SModelUtil_new.isAssignableConcept(node.getConceptFqName(), this.getApplicableSubtypeConceptFQName());
  }

  public boolean isApplicableSupertype(SNode node) {
    return SModelUtil_new.isAssignableConcept(node.getConceptFqName(), this.getApplicableSupertypeConceptFQName());
  }

  public String getApplicableSubtypeConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.Type";
  }

  public String getApplicableSupertypeConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierType";
  }

}
