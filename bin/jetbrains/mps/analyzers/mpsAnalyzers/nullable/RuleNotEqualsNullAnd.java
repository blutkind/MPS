package jetbrains.mps.analyzers.mpsAnalyzers.nullable;

/*Generated by MPS */

import jetbrains.mps.analyzers.runtime.framework.DataFlowConstructor;
import jetbrains.mps.lang.pattern.GeneratedMatchingPattern;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.dataFlow.framework.Program;
import jetbrains.mps.lang.pattern.IMatchingPattern;

public class RuleNotEqualsNullAnd extends DataFlowConstructor {
  private GeneratedMatchingPattern myPattern = new RuleNotEqualsNullAnd.Pattern_ehdml9_a0a();

  public RuleNotEqualsNullAnd() {
  }

  public boolean isApplicable(SNode node) {
    return myPattern.match(node);
  }

  public void performActions(Program program) {
    myPattern.performActions(program);
  }

  public static class Pattern_ehdml9_a0a extends GeneratedMatchingPattern implements IMatchingPattern {
    /*package*/ SNode PatternVar_ifTrue;
    /*package*/ SNode PatternVar_p;
    /*package*/ SNode PatternVar_body;

    public Pattern_ehdml9_a0a() {
    }

    public boolean match(SNode nodeToMatch) {
      {
        SNode nodeToMatch_ehdml9_a0a;
        nodeToMatch_ehdml9_a0a = nodeToMatch;
        PatternVar_body = nodeToMatch_ehdml9_a0a;
        if (!("jetbrains.mps.baseLanguage.structure.IfStatement".equals(nodeToMatch_ehdml9_a0a.getConceptFqName()))) {
          return false;
        }
        {
          String childRole_ehdml9_ = "ifTrue";
          if (nodeToMatch_ehdml9_a0a.getChildCount(childRole_ehdml9_) != 1) {
            return false;
          }
          {
            SNode childVar_ehdml9_a0a0 = nodeToMatch_ehdml9_a0a.getChildren(childRole_ehdml9_).get(0);
            {
              SNode nodeToMatch_ehdml9_a0a0;
              nodeToMatch_ehdml9_a0a0 = childVar_ehdml9_a0a0;
              if (!("jetbrains.mps.baseLanguage.structure.StatementList".equals(nodeToMatch_ehdml9_a0a0.getConceptFqName()))) {
                return false;
              }
            }
            this.PatternVar_ifTrue = childVar_ehdml9_a0a0;
          }
        }
        {
          String childRole_ehdml9__0 = "condition";
          if (nodeToMatch_ehdml9_a0a.getChildCount(childRole_ehdml9__0) != 1) {
            return false;
          }
          {
            SNode childVar_ehdml9_a0a0_0 = nodeToMatch_ehdml9_a0a.getChildren(childRole_ehdml9__0).get(0);
            {
              SNode nodeToMatch_ehdml9_a0a0_0;
              nodeToMatch_ehdml9_a0a0_0 = childVar_ehdml9_a0a0_0;
              if (!("jetbrains.mps.baseLanguage.structure.AndExpression".equals(nodeToMatch_ehdml9_a0a0_0.getConceptFqName()))) {
                return false;
              }
              {
                String childRole_ehdml9__1 = "leftExpression";
                if (nodeToMatch_ehdml9_a0a0_0.getChildCount(childRole_ehdml9__1) != 1) {
                  return false;
                }
                {
                  SNode childVar_ehdml9_a0a0a = nodeToMatch_ehdml9_a0a0_0.getChildren(childRole_ehdml9__1).get(0);
                  {
                    SNode nodeToMatch_ehdml9_a0a0a;
                    nodeToMatch_ehdml9_a0a0a = childVar_ehdml9_a0a0a;
                    if (!("jetbrains.mps.baseLanguage.structure.NotEqualsExpression".equals(nodeToMatch_ehdml9_a0a0a.getConceptFqName()))) {
                      return false;
                    }
                    {
                      String childRole_ehdml9__2 = "leftExpression";
                      if (nodeToMatch_ehdml9_a0a0a.getChildCount(childRole_ehdml9__2) != 1) {
                        return false;
                      }
                      {
                        SNode childVar_ehdml9_a0a0a0 = nodeToMatch_ehdml9_a0a0a.getChildren(childRole_ehdml9__2).get(0);
                        this.PatternVar_p = childVar_ehdml9_a0a0a0;
                      }
                    }
                    {
                      String childRole_ehdml9__3 = "rightExpression";
                      if (nodeToMatch_ehdml9_a0a0a.getChildCount(childRole_ehdml9__3) != 1) {
                        return false;
                      }
                      {
                        SNode childVar_ehdml9_a0a0a0_0 = nodeToMatch_ehdml9_a0a0a.getChildren(childRole_ehdml9__3).get(0);
                        {
                          SNode nodeToMatch_ehdml9_a0a0a0;
                          nodeToMatch_ehdml9_a0a0a0 = childVar_ehdml9_a0a0a0_0;
                          if (!("jetbrains.mps.baseLanguage.structure.NullLiteral".equals(nodeToMatch_ehdml9_a0a0a0.getConceptFqName()))) {
                            return false;
                          }
                        }
                      }
                    }
                  }
                }
              }
              {
                String childRole_ehdml9__4 = "rightExpression";
                if (nodeToMatch_ehdml9_a0a0_0.getChildCount(childRole_ehdml9__4) != 1) {
                  return false;
                }
                {
                  SNode childVar_ehdml9_a0a0a_0 = nodeToMatch_ehdml9_a0a0_0.getChildren(childRole_ehdml9__4).get(0);
                }
              }
            }
          }
        }
      }
      return true;
    }

    public boolean hasAntiquotations() {
      return false;
    }

    public void fillFieldValuesFrom(GeneratedMatchingPattern pattern) {
      if (pattern != null && pattern.getClass() == this.getClass()) {
        this.PatternVar_ifTrue = (SNode) pattern.getFieldValue("PatternVar_ifTrue");
        this.PatternVar_p = (SNode) pattern.getFieldValue("PatternVar_p");
        this.PatternVar_body = (SNode) pattern.getFieldValue("PatternVar_body");
      }
    }

    public Object getFieldValue(String fieldName) {
      if ("PatternVar_ifTrue".equals(fieldName)) {
        return this.PatternVar_ifTrue;
      }
      if ("PatternVar_p".equals(fieldName)) {
        return this.PatternVar_p;
      }
      if ("PatternVar_body".equals(fieldName)) {
        return this.PatternVar_body;
      }
      return null;
    }

    public void performActions(Object o) {

      {
        int position = 0;
        position = ((Program) (o)).getStart(getFieldValue("PatternVar_ifTrue"));
        ((Program) (o)).insert(new notNullInstruction((SNode) getFieldValue("PatternVar_p")), position, true);
      }
      {
        int position = 0;
        position = ((Program) (o)).getEnd(getFieldValue("PatternVar_body"));
        ((Program) (o)).insert(new nullableInstruction((SNode) getFieldValue("PatternVar_p")), position, true);
      }
    }
  }
}
