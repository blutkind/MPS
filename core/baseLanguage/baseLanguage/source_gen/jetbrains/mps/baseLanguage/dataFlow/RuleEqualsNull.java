package jetbrains.mps.baseLanguage.dataFlow;

/*Generated by MPS */

import jetbrains.mps.analyzers.runtime.framework.DataFlowConstructor;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.lang.pattern.GeneratedMatchingPattern;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.dataFlow.framework.Program;
import jetbrains.mps.lang.pattern.IMatchingPattern;
import jetbrains.mps.lang.pattern.runtime.PatternUtil;
import jetbrains.mps.lang.dataFlow.framework.instructions.Instruction;

public class RuleEqualsNull extends DataFlowConstructor {
  private static SNodePointer SNODE_POINTER_vwsftd_a0a0a0a0b0c0b0b0b0b0b0c0b0b0b0c0b0c0b0b0b0a0b0c0b0b0b0a0b0d0a0a0a0 = new SNodePointer("r:4ecd46ec-a719-429f-a7df-7d3a52f8d827(jetbrains.mps.baseLanguage.dataFlow@1_0)", "6868777471677432053");
  private static SNodePointer SNODE_POINTER_vwsftd_a0a0a0a0b0c0b0b0b0b0b0c0b0b0b0b0b0c0b0b0b0c0b0c0b0b0b0a0b0c0b0b0b0a0b0d0a0a0a0 = new SNodePointer("r:4ecd46ec-a719-429f-a7df-7d3a52f8d827(jetbrains.mps.baseLanguage.dataFlow@1_0)", "5730083271929373147");
  private static SNodePointer SNODE_POINTER_vwsftd_a0a0a0a0b0c0b0b0b0a0b0c0b0b0b0c0b0c0b0b0b0c0b0d0a0a0a0 = new SNodePointer("r:4ecd46ec-a719-429f-a7df-7d3a52f8d827(jetbrains.mps.baseLanguage.dataFlow@1_0)", "6868777471677432050");
  private static SNodePointer SNODE_POINTER_vwsftd_a0a0a0a0b0c0b0b0b0b0b0c0b0b0b0a0b0c0b0b0b0c0b0c0b0b0b0c0b0d0a0a0a0 = new SNodePointer("r:4ecd46ec-a719-429f-a7df-7d3a52f8d827(jetbrains.mps.baseLanguage.dataFlow@1_0)", "5730083271929373147");
  private static SNodePointer SNODE_POINTER_vwsftd_a0a0a0a0b0c0b0b0b0b0b0c0b0b0b0c0b0c0b0b0b0a0b0c0b0b0b0a0b0c0b0b0b0d0b0d0a0a0a0 = new SNodePointer("r:4ecd46ec-a719-429f-a7df-7d3a52f8d827(jetbrains.mps.baseLanguage.dataFlow@1_0)", "6868777471677432047");
  private static SNodePointer SNODE_POINTER_vwsftd_a0a0a0a0b0c0b0b0b0b0b0c0b0b0b0b0b0c0b0b0b0c0b0c0b0b0b0a0b0c0b0b0b0a0b0c0b0b0b0d0b0d0a0a0a0 = new SNodePointer("r:4ecd46ec-a719-429f-a7df-7d3a52f8d827(jetbrains.mps.baseLanguage.dataFlow@1_0)", "5730083271929373147");

  private GeneratedMatchingPattern myPattern = new RuleEqualsNull.Pattern_vwsftd_a0a();

  public RuleEqualsNull() {
  }

  public boolean isApplicable(SNode node) {
    return myPattern.match(node);
  }

  public void performActions(Program program, SNode node) {
    myPattern.performActions(program);
  }

  public static class Pattern_vwsftd_a0a extends GeneratedMatchingPattern implements IMatchingPattern {
    /*package*/ SNode patternVar_p;
    /*package*/ SNode patternVar_f;
    /*package*/ SNode patternVar_fd;
    /*package*/ SNode patternVar_d;
    private GeneratedMatchingPattern myOrPattern_vwsftd_a0a0;

    public Pattern_vwsftd_a0a() {
    }

    public boolean match(SNode nodeToMatch) {
      {
        SNode nodeToMatch_vwsftd_a0a;
        nodeToMatch_vwsftd_a0a = nodeToMatch;
        patternVar_fd = nodeToMatch_vwsftd_a0a;
        if (!("jetbrains.mps.baseLanguage.structure.IfStatement".equals(nodeToMatch_vwsftd_a0a.getConceptFqName()))) {
          return false;
        }
        {
          String childRole_vwsftd_ = "ifTrue";
          if (nodeToMatch_vwsftd_a0a.getChildCount(childRole_vwsftd_) != 1) {
            return false;
          }
          {
            SNode childVar_vwsftd_a0a0 = nodeToMatch_vwsftd_a0a.getChildren(childRole_vwsftd_).get(0);
            {
              SNode nodeToMatch_vwsftd_a0a0;
              nodeToMatch_vwsftd_a0a0 = childVar_vwsftd_a0a0;
              if (!("jetbrains.mps.baseLanguage.structure.StatementList".equals(nodeToMatch_vwsftd_a0a0.getConceptFqName()))) {
                return false;
              }
              {
                String childRole_vwsftd__0 = "smodelAttribute";
                if (nodeToMatch_vwsftd_a0a0.getChildCount(childRole_vwsftd__0) != 1) {
                  return false;
                }
                {
                  SNode childVar_vwsftd_a0a0a = nodeToMatch_vwsftd_a0a0.getChildren(childRole_vwsftd__0).get(0);
                  {
                    SNode nodeToMatch_vwsftd_a0a0a;
                    nodeToMatch_vwsftd_a0a0a = childVar_vwsftd_a0a0a;
                    if (!("jetbrains.mps.lang.pattern.structure.ActionAsPattern".equals(nodeToMatch_vwsftd_a0a0a.getConceptFqName()))) {
                      return false;
                    }
                    if (!("d".equals(nodeToMatch_vwsftd_a0a0a.getProperty("varName")))) {
                      return false;
                    }
                    {
                      String childRole_vwsftd__1 = "position";
                      if (nodeToMatch_vwsftd_a0a0a.getChildCount(childRole_vwsftd__1) != 1) {
                        return false;
                      }
                      {
                        SNode childVar_vwsftd_a0a0a0 = nodeToMatch_vwsftd_a0a0a.getChildren(childRole_vwsftd__1).get(0);
                        {
                          SNode nodeToMatch_vwsftd_a0a0a0;
                          nodeToMatch_vwsftd_a0a0a0 = childVar_vwsftd_a0a0a0;
                          if (!("jetbrains.mps.lang.pattern.structure.InsertBeforePosition".equals(nodeToMatch_vwsftd_a0a0a0.getConceptFqName()))) {
                            return false;
                          }
                        }
                      }
                    }
                    {
                      String childRole_vwsftd__2 = "action";
                      if (nodeToMatch_vwsftd_a0a0a.getChildCount(childRole_vwsftd__2) != 1) {
                        return false;
                      }
                      {
                        SNode childVar_vwsftd_a0a0a0_0 = nodeToMatch_vwsftd_a0a0a.getChildren(childRole_vwsftd__2).get(0);
                        {
                          SNode nodeToMatch_vwsftd_a0a0a0_0;
                          nodeToMatch_vwsftd_a0a0a0_0 = childVar_vwsftd_a0a0a0_0;
                          if (!("jetbrains.mps.analyzers.structure.EmitInstruction".equals(nodeToMatch_vwsftd_a0a0a0_0.getConceptFqName()))) {
                            return false;
                          }
                          {
                            String childRole_vwsftd__3 = "position";
                            if (nodeToMatch_vwsftd_a0a0a0_0.getChildCount(childRole_vwsftd__3) != 1) {
                              return false;
                            }
                            {
                              SNode childVar_vwsftd_a0a0a0a = nodeToMatch_vwsftd_a0a0a0_0.getChildren(childRole_vwsftd__3).get(0);
                              {
                                SNode nodeToMatch_vwsftd_a0a0a0a;
                                nodeToMatch_vwsftd_a0a0a0a = childVar_vwsftd_a0a0a0a;
                                if (!("jetbrains.mps.lang.pattern.structure.InsertPosition".equals(nodeToMatch_vwsftd_a0a0a0a.getConceptFqName()))) {
                                  return false;
                                }
                              }
                            }
                          }
                          {
                            String childRole_vwsftd__4 = "instructionRef";
                            if (nodeToMatch_vwsftd_a0a0a0_0.getChildCount(childRole_vwsftd__4) != 1) {
                              return false;
                            }
                            {
                              SNode childVar_vwsftd_a0a0a0a_0 = nodeToMatch_vwsftd_a0a0a0_0.getChildren(childRole_vwsftd__4).get(0);
                              {
                                SNode nodeToMatch_vwsftd_a0a0a0a_0;
                                nodeToMatch_vwsftd_a0a0a0a_0 = childVar_vwsftd_a0a0a0a_0;
                                if (!("jetbrains.mps.analyzers.structure.InstructionReference".equals(nodeToMatch_vwsftd_a0a0a0a_0.getConceptFqName()))) {
                                  return false;
                                }
                                {
                                  SNodePointer pointer = SNODE_POINTER_vwsftd_a0a0a0a0b0c0b0b0b0b0b0c0b0b0b0c0b0c0b0b0b0a0b0c0b0b0b0a0b0d0a0a0a0;
                                  if (!(PatternUtil.matchReferentWithNode(pointer, nodeToMatch_vwsftd_a0a0a0a_0.getReferent("instruction")))) {
                                    return false;
                                  }
                                }
                                {
                                  String childRole_vwsftd__5 = "argument";
                                  if (nodeToMatch_vwsftd_a0a0a0a_0.getChildCount(childRole_vwsftd__5) != 1) {
                                    return false;
                                  }
                                  {
                                    SNode childVar_vwsftd_a0a0a0a0 = nodeToMatch_vwsftd_a0a0a0a_0.getChildren(childRole_vwsftd__5).get(0);
                                    {
                                      SNode nodeToMatch_vwsftd_a0a0a0a0;
                                      nodeToMatch_vwsftd_a0a0a0a0 = childVar_vwsftd_a0a0a0a0;
                                      if (!("jetbrains.mps.lang.pattern.structure.PatternVariableReference".equals(nodeToMatch_vwsftd_a0a0a0a0.getConceptFqName()))) {
                                        return false;
                                      }
                                      {
                                        SNodePointer pointer = SNODE_POINTER_vwsftd_a0a0a0a0b0c0b0b0b0b0b0c0b0b0b0b0b0c0b0b0b0c0b0c0b0b0b0a0b0c0b0b0b0a0b0d0a0a0a0;
                                        if (!(PatternUtil.matchReferentWithNode(pointer, nodeToMatch_vwsftd_a0a0a0a0.getReferent("variable")))) {
                                          return false;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            this.patternVar_d = childVar_vwsftd_a0a0;
          }
        }
        {
          String childRole_vwsftd__6 = "condition";
          if (nodeToMatch_vwsftd_a0a.getChildCount(childRole_vwsftd__6) != 1) {
            return false;
          }
          {
            SNode childVar_vwsftd_a0a0_0 = nodeToMatch_vwsftd_a0a.getChildren(childRole_vwsftd__6).get(0);
            {
              SNode nodeToMatch_vwsftd_a0a0_0;
              nodeToMatch_vwsftd_a0a0_0 = childVar_vwsftd_a0a0_0;
              {
                boolean orMatches = false;
                GeneratedMatchingPattern orPattern;
                orPattern = new RuleEqualsNull.Pattern_vwsftd_a0a.Pattern_vwsftd_a0a0a2a2a1a1a1a1a1a3a0a0a0a();
                if (orPattern.match(nodeToMatch_vwsftd_a0a0_0)) {
                  orMatches = true;
                  myOrPattern_vwsftd_a0a0 = orPattern;
                }
                orPattern = new RuleEqualsNull.Pattern_vwsftd_a0a.Pattern_vwsftd_a0a0a3a2a1a1a1a1a1a3a0a0a0a();
                if (orPattern.match(nodeToMatch_vwsftd_a0a0_0)) {
                  orMatches = true;
                  myOrPattern_vwsftd_a0a0 = orPattern;
                }
                if (!(orMatches)) {
                  return false;
                }
              }
            }
          }
        }
        {
          String childRole_vwsftd__11 = "smodelAttribute";
          if (nodeToMatch_vwsftd_a0a.getChildCount(childRole_vwsftd__11) != 1) {
            return false;
          }
          {
            SNode childVar_vwsftd_a0a0_1 = nodeToMatch_vwsftd_a0a.getChildren(childRole_vwsftd__11).get(0);
            {
              SNode nodeToMatch_vwsftd_a0a0_1;
              nodeToMatch_vwsftd_a0a0_1 = childVar_vwsftd_a0a0_1;
              if (!("jetbrains.mps.lang.pattern.structure.ActionAsPattern".equals(nodeToMatch_vwsftd_a0a0_1.getConceptFqName()))) {
                return false;
              }
              if (!("fd".equals(nodeToMatch_vwsftd_a0a0_1.getProperty("varName")))) {
                return false;
              }
              {
                String childRole_vwsftd__12 = "position";
                if (nodeToMatch_vwsftd_a0a0_1.getChildCount(childRole_vwsftd__12) != 1) {
                  return false;
                }
                {
                  SNode childVar_vwsftd_a0a0a_0 = nodeToMatch_vwsftd_a0a0_1.getChildren(childRole_vwsftd__12).get(0);
                  {
                    SNode nodeToMatch_vwsftd_a0a0a_0;
                    nodeToMatch_vwsftd_a0a0a_0 = childVar_vwsftd_a0a0a_0;
                    if (!("jetbrains.mps.lang.pattern.structure.InsertAfterPosition".equals(nodeToMatch_vwsftd_a0a0a_0.getConceptFqName()))) {
                      return false;
                    }
                  }
                }
              }
              {
                String childRole_vwsftd__13 = "action";
                if (nodeToMatch_vwsftd_a0a0_1.getChildCount(childRole_vwsftd__13) != 1) {
                  return false;
                }
                {
                  SNode childVar_vwsftd_a0a0a_1 = nodeToMatch_vwsftd_a0a0_1.getChildren(childRole_vwsftd__13).get(0);
                  {
                    SNode nodeToMatch_vwsftd_a0a0a_1;
                    nodeToMatch_vwsftd_a0a0a_1 = childVar_vwsftd_a0a0a_1;
                    if (!("jetbrains.mps.analyzers.structure.EmitInstruction".equals(nodeToMatch_vwsftd_a0a0a_1.getConceptFqName()))) {
                      return false;
                    }
                    {
                      String childRole_vwsftd__14 = "instructionRef";
                      if (nodeToMatch_vwsftd_a0a0a_1.getChildCount(childRole_vwsftd__14) != 1) {
                        return false;
                      }
                      {
                        SNode childVar_vwsftd_a0a0a0_1 = nodeToMatch_vwsftd_a0a0a_1.getChildren(childRole_vwsftd__14).get(0);
                        {
                          SNode nodeToMatch_vwsftd_a0a0a0_2;
                          nodeToMatch_vwsftd_a0a0a0_2 = childVar_vwsftd_a0a0a0_1;
                          if (!("jetbrains.mps.analyzers.structure.InstructionReference".equals(nodeToMatch_vwsftd_a0a0a0_2.getConceptFqName()))) {
                            return false;
                          }
                          {
                            SNodePointer pointer = SNODE_POINTER_vwsftd_a0a0a0a0b0c0b0b0b0a0b0c0b0b0b0c0b0c0b0b0b0c0b0d0a0a0a0;
                            if (!(PatternUtil.matchReferentWithNode(pointer, nodeToMatch_vwsftd_a0a0a0_2.getReferent("instruction")))) {
                              return false;
                            }
                          }
                          {
                            String childRole_vwsftd__15 = "argument";
                            if (nodeToMatch_vwsftd_a0a0a0_2.getChildCount(childRole_vwsftd__15) != 1) {
                              return false;
                            }
                            {
                              SNode childVar_vwsftd_a0a0a0a_3 = nodeToMatch_vwsftd_a0a0a0_2.getChildren(childRole_vwsftd__15).get(0);
                              {
                                SNode nodeToMatch_vwsftd_a0a0a0a_3;
                                nodeToMatch_vwsftd_a0a0a0a_3 = childVar_vwsftd_a0a0a0a_3;
                                if (!("jetbrains.mps.lang.pattern.structure.PatternVariableReference".equals(nodeToMatch_vwsftd_a0a0a0a_3.getConceptFqName()))) {
                                  return false;
                                }
                                {
                                  SNodePointer pointer = SNODE_POINTER_vwsftd_a0a0a0a0b0c0b0b0b0b0b0c0b0b0b0a0b0c0b0b0b0c0b0c0b0b0b0c0b0d0a0a0a0;
                                  if (!(PatternUtil.matchReferentWithNode(pointer, nodeToMatch_vwsftd_a0a0a0a_3.getReferent("variable")))) {
                                    return false;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        {
          String childRole_vwsftd__16 = "ifFalseStatement";
          if (nodeToMatch_vwsftd_a0a.getChildCount(childRole_vwsftd__16) != 1) {
            return false;
          }
          {
            SNode childVar_vwsftd_a0a0_2 = nodeToMatch_vwsftd_a0a.getChildren(childRole_vwsftd__16).get(0);
            {
              SNode nodeToMatch_vwsftd_a0a0_2;
              nodeToMatch_vwsftd_a0a0_2 = childVar_vwsftd_a0a0_2;
              if (!("jetbrains.mps.baseLanguage.structure.BlockStatement".equals(nodeToMatch_vwsftd_a0a0_2.getConceptFqName()))) {
                return false;
              }
              {
                String childRole_vwsftd__17 = "statements";
                if (nodeToMatch_vwsftd_a0a0_2.getChildCount(childRole_vwsftd__17) != 1) {
                  return false;
                }
                {
                  SNode childVar_vwsftd_a0a0a_2 = nodeToMatch_vwsftd_a0a0_2.getChildren(childRole_vwsftd__17).get(0);
                  {
                    SNode nodeToMatch_vwsftd_a0a0a_2;
                    nodeToMatch_vwsftd_a0a0a_2 = childVar_vwsftd_a0a0a_2;
                    if (!("jetbrains.mps.baseLanguage.structure.StatementList".equals(nodeToMatch_vwsftd_a0a0a_2.getConceptFqName()))) {
                      return false;
                    }
                    {
                      String childRole_vwsftd__18 = "smodelAttribute";
                      if (nodeToMatch_vwsftd_a0a0a_2.getChildCount(childRole_vwsftd__18) != 1) {
                        return false;
                      }
                      {
                        SNode childVar_vwsftd_a0a0a0_2 = nodeToMatch_vwsftd_a0a0a_2.getChildren(childRole_vwsftd__18).get(0);
                        {
                          SNode nodeToMatch_vwsftd_a0a0a0_3;
                          nodeToMatch_vwsftd_a0a0a0_3 = childVar_vwsftd_a0a0a0_2;
                          if (!("jetbrains.mps.lang.pattern.structure.ActionAsPattern".equals(nodeToMatch_vwsftd_a0a0a0_3.getConceptFqName()))) {
                            return false;
                          }
                          if (!("f".equals(nodeToMatch_vwsftd_a0a0a0_3.getProperty("varName")))) {
                            return false;
                          }
                          {
                            String childRole_vwsftd__19 = "position";
                            if (nodeToMatch_vwsftd_a0a0a0_3.getChildCount(childRole_vwsftd__19) != 1) {
                              return false;
                            }
                            {
                              SNode childVar_vwsftd_a0a0a0a_4 = nodeToMatch_vwsftd_a0a0a0_3.getChildren(childRole_vwsftd__19).get(0);
                              {
                                SNode nodeToMatch_vwsftd_a0a0a0a_4;
                                nodeToMatch_vwsftd_a0a0a0a_4 = childVar_vwsftd_a0a0a0a_4;
                                if (!("jetbrains.mps.lang.pattern.structure.InsertBeforePosition".equals(nodeToMatch_vwsftd_a0a0a0a_4.getConceptFqName()))) {
                                  return false;
                                }
                              }
                            }
                          }
                          {
                            String childRole_vwsftd__20 = "action";
                            if (nodeToMatch_vwsftd_a0a0a0_3.getChildCount(childRole_vwsftd__20) != 1) {
                              return false;
                            }
                            {
                              SNode childVar_vwsftd_a0a0a0a_5 = nodeToMatch_vwsftd_a0a0a0_3.getChildren(childRole_vwsftd__20).get(0);
                              {
                                SNode nodeToMatch_vwsftd_a0a0a0a_5;
                                nodeToMatch_vwsftd_a0a0a0a_5 = childVar_vwsftd_a0a0a0a_5;
                                if (!("jetbrains.mps.analyzers.structure.EmitInstruction".equals(nodeToMatch_vwsftd_a0a0a0a_5.getConceptFqName()))) {
                                  return false;
                                }
                                {
                                  String childRole_vwsftd__21 = "position";
                                  if (nodeToMatch_vwsftd_a0a0a0a_5.getChildCount(childRole_vwsftd__21) != 1) {
                                    return false;
                                  }
                                  {
                                    SNode childVar_vwsftd_a0a0a0a0_0 = nodeToMatch_vwsftd_a0a0a0a_5.getChildren(childRole_vwsftd__21).get(0);
                                    {
                                      SNode nodeToMatch_vwsftd_a0a0a0a0_0;
                                      nodeToMatch_vwsftd_a0a0a0a0_0 = childVar_vwsftd_a0a0a0a0_0;
                                      if (!("jetbrains.mps.lang.pattern.structure.InsertPosition".equals(nodeToMatch_vwsftd_a0a0a0a0_0.getConceptFqName()))) {
                                        return false;
                                      }
                                    }
                                  }
                                }
                                {
                                  String childRole_vwsftd__22 = "instructionRef";
                                  if (nodeToMatch_vwsftd_a0a0a0a_5.getChildCount(childRole_vwsftd__22) != 1) {
                                    return false;
                                  }
                                  {
                                    SNode childVar_vwsftd_a0a0a0a0_1 = nodeToMatch_vwsftd_a0a0a0a_5.getChildren(childRole_vwsftd__22).get(0);
                                    {
                                      SNode nodeToMatch_vwsftd_a0a0a0a0_1;
                                      nodeToMatch_vwsftd_a0a0a0a0_1 = childVar_vwsftd_a0a0a0a0_1;
                                      if (!("jetbrains.mps.analyzers.structure.InstructionReference".equals(nodeToMatch_vwsftd_a0a0a0a0_1.getConceptFqName()))) {
                                        return false;
                                      }
                                      {
                                        SNodePointer pointer = SNODE_POINTER_vwsftd_a0a0a0a0b0c0b0b0b0b0b0c0b0b0b0c0b0c0b0b0b0a0b0c0b0b0b0a0b0c0b0b0b0d0b0d0a0a0a0;
                                        if (!(PatternUtil.matchReferentWithNode(pointer, nodeToMatch_vwsftd_a0a0a0a0_1.getReferent("instruction")))) {
                                          return false;
                                        }
                                      }
                                      {
                                        String childRole_vwsftd__23 = "argument";
                                        if (nodeToMatch_vwsftd_a0a0a0a0_1.getChildCount(childRole_vwsftd__23) != 1) {
                                          return false;
                                        }
                                        {
                                          SNode childVar_vwsftd_a0a0a0a0a = nodeToMatch_vwsftd_a0a0a0a0_1.getChildren(childRole_vwsftd__23).get(0);
                                          {
                                            SNode nodeToMatch_vwsftd_a0a0a0a0a;
                                            nodeToMatch_vwsftd_a0a0a0a0a = childVar_vwsftd_a0a0a0a0a;
                                            if (!("jetbrains.mps.lang.pattern.structure.PatternVariableReference".equals(nodeToMatch_vwsftd_a0a0a0a0a.getConceptFqName()))) {
                                              return false;
                                            }
                                            {
                                              SNodePointer pointer = SNODE_POINTER_vwsftd_a0a0a0a0b0c0b0b0b0b0b0c0b0b0b0b0b0c0b0b0b0c0b0c0b0b0b0a0b0c0b0b0b0a0b0c0b0b0b0d0b0d0a0a0a0;
                                              if (!(PatternUtil.matchReferentWithNode(pointer, nodeToMatch_vwsftd_a0a0a0a0a.getReferent("variable")))) {
                                                return false;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  this.patternVar_f = childVar_vwsftd_a0a0a_2;
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
        patternVar_p = (SNode) pattern.getFieldValue("patternVar_p");
        patternVar_f = (SNode) pattern.getFieldValue("patternVar_f");
        patternVar_fd = (SNode) pattern.getFieldValue("patternVar_fd");
        patternVar_d = (SNode) pattern.getFieldValue("patternVar_d");
      }
    }

    public Object getFieldValue(String fieldName) {
      if ("patternVar_p".equals(fieldName)) {
        return patternVar_p;
      }
      if ("patternVar_f".equals(fieldName)) {
        return patternVar_f;
      }
      if ("patternVar_fd".equals(fieldName)) {
        return patternVar_fd;
      }
      if ("patternVar_d".equals(fieldName)) {
        return patternVar_d;
      }
      return null;
    }

    public void performActions(Object o) {
      {
        Object object = getFieldValue("patternVar_f");
        if (((Program) o).contains(object)) {
          boolean before = true;
          int position;
          if (before) {
            position = ((Program) (o)).getStart(object);
          } else {
            position = ((Program) (o)).getEnd(object);
          }
          Instruction instruction = new notNullInstruction((SNode) getFieldValue("patternVar_p"));
          instruction.setSource(getFieldValue("patternVar_f"));
          ((Program) (o)).insert(instruction, position, true, before);
        }
      }
      {
        Object object = getFieldValue("patternVar_fd");
        if (((Program) o).contains(object)) {
          boolean before = false;
          int position;
          if (before) {
            position = ((Program) (o)).getStart(object);
          } else {
            position = ((Program) (o)).getEnd(object);
          }
          Instruction instruction = new nullableInstruction((SNode) getFieldValue("patternVar_p"));
          instruction.setSource(getFieldValue("patternVar_fd"));
          ((Program) (o)).insert(instruction, position, true, before);
        }
      }
      {
        Object object = getFieldValue("patternVar_d");
        if (((Program) o).contains(object)) {
          boolean before = true;
          int position;
          if (before) {
            position = ((Program) (o)).getStart(object);
          } else {
            position = ((Program) (o)).getEnd(object);
          }
          Instruction instruction = new nullInstruction((SNode) getFieldValue("patternVar_p"));
          instruction.setSource(getFieldValue("patternVar_d"));
          ((Program) (o)).insert(instruction, position, true, before);
        }
      }
    }

    public class Pattern_vwsftd_a0a0a2a2a1a1a1a1a1a3a0a0a0a extends GeneratedMatchingPattern implements IMatchingPattern {
      public Pattern_vwsftd_a0a0a2a2a1a1a1a1a1a3a0a0a0a() {
      }

      public boolean match(SNode nodeToMatch) {
        {
          SNode nodeToMatch_vwsftd_a0a0a0_1;
          nodeToMatch_vwsftd_a0a0a0_1 = nodeToMatch;
          if (!("jetbrains.mps.baseLanguage.structure.EqualsExpression".equals(nodeToMatch_vwsftd_a0a0a0_1.getConceptFqName()))) {
            return false;
          }
          {
            String childRole_vwsftd__7 = "leftExpression";
            if (nodeToMatch_vwsftd_a0a0a0_1.getChildCount(childRole_vwsftd__7) != 1) {
              return false;
            }
            {
              SNode childVar_vwsftd_a0a0a0a_1 = nodeToMatch_vwsftd_a0a0a0_1.getChildren(childRole_vwsftd__7).get(0);
              {
                SNode nodeToMatch_vwsftd_a0a0a0a_1;
                nodeToMatch_vwsftd_a0a0a0a_1 = childVar_vwsftd_a0a0a0a_1;
                patternVar_p = nodeToMatch_vwsftd_a0a0a0a_1;
              }
            }
          }
          {
            String childRole_vwsftd__8 = "rightExpression";
            if (nodeToMatch_vwsftd_a0a0a0_1.getChildCount(childRole_vwsftd__8) != 1) {
              return false;
            }
            {
              SNode childVar_vwsftd_a0a0a0a_2 = nodeToMatch_vwsftd_a0a0a0_1.getChildren(childRole_vwsftd__8).get(0);
              {
                SNode nodeToMatch_vwsftd_a0a0a0a_2;
                nodeToMatch_vwsftd_a0a0a0a_2 = childVar_vwsftd_a0a0a0a_2;
                if (!("jetbrains.mps.baseLanguage.structure.NullLiteral".equals(nodeToMatch_vwsftd_a0a0a0a_2.getConceptFqName()))) {
                  return false;
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
      }

      public Object getFieldValue(String fieldName) {
        return null;
      }

      public void performActions(Object o) {
      }
    }

    public class Pattern_vwsftd_a0a0a3a2a1a1a1a1a1a3a0a0a0a extends GeneratedMatchingPattern implements IMatchingPattern {
      public Pattern_vwsftd_a0a0a3a2a1a1a1a1a1a3a0a0a0a() {
      }

      public boolean match(SNode nodeToMatch) {
        {
          SNode nodeToMatch_vwsftd_a1a0a0;
          nodeToMatch_vwsftd_a1a0a0 = nodeToMatch;
          if (!("jetbrains.mps.baseLanguage.structure.EqualsExpression".equals(nodeToMatch_vwsftd_a1a0a0.getConceptFqName()))) {
            return false;
          }
          {
            String childRole_vwsftd__9 = "leftExpression";
            if (nodeToMatch_vwsftd_a1a0a0.getChildCount(childRole_vwsftd__9) != 1) {
              return false;
            }
            {
              SNode childVar_vwsftd_a0b0a0a = nodeToMatch_vwsftd_a1a0a0.getChildren(childRole_vwsftd__9).get(0);
              {
                SNode nodeToMatch_vwsftd_a0b0a0a;
                nodeToMatch_vwsftd_a0b0a0a = childVar_vwsftd_a0b0a0a;
                if (!("jetbrains.mps.baseLanguage.structure.NullLiteral".equals(nodeToMatch_vwsftd_a0b0a0a.getConceptFqName()))) {
                  return false;
                }
              }
            }
          }
          {
            String childRole_vwsftd__10 = "rightExpression";
            if (nodeToMatch_vwsftd_a1a0a0.getChildCount(childRole_vwsftd__10) != 1) {
              return false;
            }
            {
              SNode childVar_vwsftd_a0b0a0a_0 = nodeToMatch_vwsftd_a1a0a0.getChildren(childRole_vwsftd__10).get(0);
              {
                SNode nodeToMatch_vwsftd_a0b0a0a_0;
                nodeToMatch_vwsftd_a0b0a0a_0 = childVar_vwsftd_a0b0a0a_0;
                patternVar_p = nodeToMatch_vwsftd_a0b0a0a_0;
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
      }

      public Object getFieldValue(String fieldName) {
        return null;
      }

      public void performActions(Object o) {
      }
    }
  }
}
