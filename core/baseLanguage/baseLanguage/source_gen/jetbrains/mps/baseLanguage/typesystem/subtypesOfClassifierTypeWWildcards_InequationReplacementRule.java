package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInequationReplacementRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.pattern.GeneratedMatchingPattern;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import java.util.Iterator;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.nodeEditor.IErrorReporter;
import jetbrains.mps.lang.core.behavior.BaseConcept_Behavior;
import jetbrains.mps.lang.pattern.util.MatchingUtil;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.lang.pattern.IMatchingPattern;
import java.util.List;
import java.util.ArrayList;

public class subtypesOfClassifierTypeWWildcards_InequationReplacementRule extends AbstractInequationReplacementRule_Runtime {
  public subtypesOfClassifierTypeWWildcards_InequationReplacementRule() {
  }

  public void processInequation(final SNode subtype, final SNode supertype, final EquationInfo equationInfo, final TypeCheckingContext typeCheckingContext) {
    {
      final SNode t = subtype;
      typeCheckingContext.whenConcrete(t, new Runnable() {
        public void run() {
          {
            GeneratedMatchingPattern pattern_n8ubly_a0a0 = new subtypesOfClassifierTypeWWildcards_InequationReplacementRule.Pattern_1s2zdh_a0a0a0a0a1a1(SLinkOperations.getTarget(supertype, "classifier", false));
            SNode coercedNode_n8ubly_a0a0 = TypeChecker.getInstance().getRuntimeSupport().coerce_(typeCheckingContext.getEquationManager().getRepresentator(t), pattern_n8ubly_a0a0, typeCheckingContext);
            if (coercedNode_n8ubly_a0a0 != null) {
              {
                SNode typeParam;
                SNode myParam;
                Iterator<SNode> typeParam_iterator = ListSequence.fromList(SLinkOperations.getTargets(coercedNode_n8ubly_a0a0, "parameter", true)).iterator();
                Iterator<SNode> myParam_iterator = ListSequence.fromList(SLinkOperations.getTargets(supertype, "parameter", true)).iterator();
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
                      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1220535076789", 0, intentionProvider);
                      _info_12389875345.getOuterRulesIdFromInfo(equationInfo);
                      _info_12389875345.setInequationGroup("default");
                      typeCheckingContext.createLessThanInequation((SNode) finalTypeParam, (SNode) myParam, false, _info_12389875345);
                    }
                    {
                      final SNode concreteParam = myParam;
                      typeCheckingContext.whenConcrete(concreteParam, new Runnable() {
                        public void run() {
                          if (!(SNodeOperations.isInstanceOf(typeCheckingContext.getEquationManager().getRepresentator(concreteParam), "jetbrains.mps.baseLanguage.structure.WildCardType") || SNodeOperations.isInstanceOf(typeCheckingContext.getEquationManager().getRepresentator(concreteParam), "jetbrains.mps.baseLanguage.structure.UpperBoundType"))) {
                            {
                              SNode _nodeToCheck_1029348928467 = equationInfo.getNodeWithError();
                              BaseIntentionProvider intentionProvider = null;
                              EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1220523357903", 0, intentionProvider);
                              _info_12389875345.getOuterRulesIdFromInfo(equationInfo);
                              typeCheckingContext.createEquation((SNode) finalTypeParam, (SNode) typeCheckingContext.getEquationManager().getRepresentator(concreteParam), _info_12389875345);
                            }
                          }
                        }
                      }, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1220523357880", false, false);
                    }
                  }
                }
              }
            } else {
              SNode nodeWithError = equationInfo.getNodeWithError();
              SNode methodCall = null;
              if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(nodeWithError), "jetbrains.mps.baseLanguage.structure.IMethodCall")) {
                methodCall = SNodeOperations.cast(SNodeOperations.getParent(nodeWithError), "jetbrains.mps.baseLanguage.structure.IMethodCall");
              } else if (SNodeOperations.isInstanceOf(nodeWithError, "jetbrains.mps.baseLanguage.structure.IMethodCall")) {
                methodCall = SNodeOperations.cast(nodeWithError, "jetbrains.mps.baseLanguage.structure.IMethodCall");
              }
              if (methodCall != null) {
                {
                  BaseIntentionProvider intentionProvider = null;
                  IErrorTarget errorTarget = new NodeErrorTarget();
                  IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(nodeWithError, BaseConcept_Behavior.call_getPresentation_1213877396640(subtype) + " is not a subtype of " + BaseConcept_Behavior.call_getPresentation_1213877396640(supertype), "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1227259028675", intentionProvider, errorTarget);
                  _reporter_2309309498.addAdditionalRuleIdsFromInfo(equationInfo);
                }
              } else {
                {
                  BaseIntentionProvider intentionProvider = null;
                  IErrorTarget errorTarget = new NodeErrorTarget();
                  IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(nodeWithError, BaseConcept_Behavior.call_getPresentation_1213877396640(subtype) + " is not a subtype of " + BaseConcept_Behavior.call_getPresentation_1213877396640(supertype), "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1220523357915", intentionProvider, errorTarget);
                  _reporter_2309309498.addAdditionalRuleIdsFromInfo(equationInfo);
                }
              }
            }
          }
        }
      }, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1220523357849", false, true);
    }
  }

  public boolean checkInequation(final SNode subtype, final SNode supertype, final EquationInfo equationInfo) {
    boolean result_14532009 = true;
    {
      final SNode t = subtype;
      {
        GeneratedMatchingPattern pattern_n8ubly_a0a0_0 = new subtypesOfClassifierTypeWWildcards_InequationReplacementRule.Pattern_1s2zdh_a0a0a0a0a1a1(SLinkOperations.getTarget(supertype, "classifier", false));
        SNode coercedNode_n8ubly_a0a0_0 = TypeChecker.getInstance().getRuntimeSupport().coerce_(t, pattern_n8ubly_a0a0_0);
        if (coercedNode_n8ubly_a0a0_0 != null) {
          {
            SNode typeParam;
            SNode myParam;
            Iterator<SNode> typeParam_iterator = ListSequence.fromList(SLinkOperations.getTargets(coercedNode_n8ubly_a0a0_0, "parameter", true)).iterator();
            Iterator<SNode> myParam_iterator = ListSequence.fromList(SLinkOperations.getTargets(supertype, "parameter", true)).iterator();
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
                result_14532009 = result_14532009 && TypeChecker.getInstance().getSubtypingManager().isSubtype((SNode) finalTypeParam, (SNode) myParam, true);
                {
                  final SNode concreteParam = myParam;
                  if (!(SNodeOperations.isInstanceOf(concreteParam, "jetbrains.mps.baseLanguage.structure.WildCardType") || SNodeOperations.isInstanceOf(concreteParam, "jetbrains.mps.baseLanguage.structure.UpperBoundType"))) {
                    result_14532009 = result_14532009 && MatchingUtil.matchNodes((SNode) finalTypeParam, (SNode) concreteParam);
                  }
                }
              }
            }
          }
        } else {
          SNode nodeWithError = equationInfo.getNodeWithError();
          SNode methodCall = null;
          if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(nodeWithError), "jetbrains.mps.baseLanguage.structure.IMethodCall")) {
            methodCall = SNodeOperations.cast(SNodeOperations.getParent(nodeWithError), "jetbrains.mps.baseLanguage.structure.IMethodCall");
          } else if (SNodeOperations.isInstanceOf(nodeWithError, "jetbrains.mps.baseLanguage.structure.IMethodCall")) {
            methodCall = SNodeOperations.cast(nodeWithError, "jetbrains.mps.baseLanguage.structure.IMethodCall");
          }
          if (methodCall != null) {
            result_14532009 = false;
          } else {
            result_14532009 = false;
          }
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

  public static class Pattern_1s2zdh_a0a0a0a0a0 extends GeneratedMatchingPattern implements IMatchingPattern {
    /*package*/ List<SNode> PatternVar_l;
    /*package*/ SNode PatternVar_ignored;
    /*package*/ Object AntiquotationField_n8ubly_a0a0a0a0a;

    public Pattern_1s2zdh_a0a0a0a0a0(Object parameter_n8ubly_a0a0a0a0a) {
      this.AntiquotationField_n8ubly_a0a0a0a0a = parameter_n8ubly_a0a0a0a0a;
    }

    public boolean match(SNode nodeToMatch) {
      {
        SNode nodeToMatch_n8ubly_a0a0a0a;
        nodeToMatch_n8ubly_a0a0a0a = nodeToMatch;
        if (!("jetbrains.mps.baseLanguage.structure.ClassifierType".equals(nodeToMatch_n8ubly_a0a0a0a.getConceptFqName()))) {
          return false;
        }
        {
          SNode referent;
          referent = (SNode) this.AntiquotationField_n8ubly_a0a0a0a0a;
          if (nodeToMatch_n8ubly_a0a0a0a.getReferent("classifier") != referent) {
            return false;
          }
        }
        {
          String childRole_n8ubly_ = "parameter";
          this.PatternVar_l = ListSequence.fromList(new ArrayList<SNode>());
          this.PatternVar_ignored = null;
          for (SNode childVar : nodeToMatch_n8ubly_a0a0a0a.getChildren(childRole_n8ubly_)) {
            this.PatternVar_ignored = childVar;
            ListSequence.fromList(this.PatternVar_l).addElement(childVar);
          }
        }
      }
      return true;
    }

    public boolean hasAntiquotations() {
      return true;
    }

    public void fillFieldValuesFrom(GeneratedMatchingPattern pattern) {
      if (pattern != null && pattern.getClass() == this.getClass()) {
        this.PatternVar_l = (List<SNode>) pattern.getFieldValue("PatternVar_l");
        this.PatternVar_ignored = (SNode) pattern.getFieldValue("PatternVar_ignored");
      }
    }

    public Object getFieldValue(String fieldName) {
      if ("PatternVar_l".equals(fieldName)) {
        return this.PatternVar_l;
      }
      if ("PatternVar_ignored".equals(fieldName)) {
        return this.PatternVar_ignored;
      }
      return null;
    }
  }

  public static class Pattern_1s2zdh_a0a0a0a0a1a1 extends GeneratedMatchingPattern implements IMatchingPattern {
    /*package*/ List<SNode> PatternVar_l;
    /*package*/ SNode PatternVar_ignored;
    /*package*/ Object AntiquotationField_n8ubly_a0a0a0a0a_0;

    public Pattern_1s2zdh_a0a0a0a0a1a1(Object parameter_n8ubly_a0a0a0a0a_0) {
      this.AntiquotationField_n8ubly_a0a0a0a0a_0 = parameter_n8ubly_a0a0a0a0a_0;
    }

    public boolean match(SNode nodeToMatch) {
      {
        SNode nodeToMatch_n8ubly_a0a0a0a_0;
        nodeToMatch_n8ubly_a0a0a0a_0 = nodeToMatch;
        if (!("jetbrains.mps.baseLanguage.structure.ClassifierType".equals(nodeToMatch_n8ubly_a0a0a0a_0.getConceptFqName()))) {
          return false;
        }
        {
          SNode referent;
          referent = (SNode) this.AntiquotationField_n8ubly_a0a0a0a0a_0;
          if (nodeToMatch_n8ubly_a0a0a0a_0.getReferent("classifier") != referent) {
            return false;
          }
        }
        {
          String childRole_n8ubly__0 = "parameter";
          this.PatternVar_l = ListSequence.fromList(new ArrayList<SNode>());
          this.PatternVar_ignored = null;
          for (SNode childVar : nodeToMatch_n8ubly_a0a0a0a_0.getChildren(childRole_n8ubly__0)) {
            this.PatternVar_ignored = childVar;
            ListSequence.fromList(this.PatternVar_l).addElement(childVar);
          }
        }
      }
      return true;
    }

    public boolean hasAntiquotations() {
      return true;
    }

    public void fillFieldValuesFrom(GeneratedMatchingPattern pattern) {
      if (pattern != null && pattern.getClass() == this.getClass()) {
        this.PatternVar_l = (List<SNode>) pattern.getFieldValue("PatternVar_l");
        this.PatternVar_ignored = (SNode) pattern.getFieldValue("PatternVar_ignored");
      }
    }

    public Object getFieldValue(String fieldName) {
      if ("PatternVar_l".equals(fieldName)) {
        return this.PatternVar_l;
      }
      if ("PatternVar_ignored".equals(fieldName)) {
        return this.PatternVar_ignored;
      }
      return null;
    }
  }
}
