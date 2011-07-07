package jetbrains.mps.make.facet.actions;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.action.NodeSubstitutePreconditionContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.action.SideTransformPreconditionContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.action.NodeSetupContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import java.util.List;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.smodel.action.NodeSubstituteActionsFactoryContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.util.Calculable;
import jetbrains.mps.make.facet.behavior.FacetDeclaration_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.closures.runtime.YieldingIterator;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SEnumOperations;
import jetbrains.mps.baseLanguage.tuples.runtime.MultiTuple;
import jetbrains.mps.smodel.action.DefaultChildNodeSubstituteAction;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.smodel.action.SideTransformActionsBuilderContext;
import jetbrains.mps.smodel.action.AbstractSideTransformHintSubstituteAction;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class QueriesGenerated {
  public static boolean nodeSubstituteActionsBuilder_Precondition_Expression_7320828025189375235(final IOperationContext operationContext, final NodeSubstitutePreconditionContext _context) {
    return (SNodeOperations.getAncestor(_context.getParentNode(), "jetbrains.mps.make.facet.structure.TargetDeclaration", false, false) != null);
  }

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_IPropertyExpression_2191561637326275635(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    return (SLinkOperations.getTarget(_context.getSourceNode(), "resource", true) == null);
  }

  public static void nodeFactory_NodeSetup_ParametersDeclaration_7320828025189345690(final IOperationContext operationContext, final NodeSetupContext _context) {
    SPropertyOperations.set(_context.getNewNode(), "name", "Parameters");
  }

  public static void nodeFactory_NodeSetup_ParametersDeclaration_127305800529615845(final IOperationContext operationContext, final NodeSetupContext _context) {
    SNodeFactoryOperations.addNewChild(_context.getNewNode(), "component", "jetbrains.mps.baseLanguage.tuples.structure.NamedTupleComponentDeclaration");
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_TargetDependency_8351679702044371560(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.make.facet.structure.TargetDependency");
      SNode childConcept = (SNode) _context.getChildConcept();
      if (SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        Calculable calc = new Calculable() {
          public Object calculate() {
            final Iterable<SNode> relatedFacets = FacetDeclaration_Behavior.call_allRelated_8351679702044331818(SNodeOperations.getAncestor(_context.getParentNode(), "jetbrains.mps.make.facet.structure.FacetDeclaration", false, false));
            return ListSequence.fromList(SModelOperations.getNodesIncludingImported(_context.getModel(), operationContext.getScope(), "jetbrains.mps.make.facet.structure.TargetDeclaration")).where(new IWhereFilter<SNode>() {
              public boolean accept(SNode fct) {
                return Sequence.fromIterable(relatedFacets).contains(SNodeOperations.getAncestor(fct, "jetbrains.mps.make.facet.structure.FacetDeclaration", false, false));
              }
            }).<Tuples._2<SNode, SNode>>translate(new ITranslator2<SNode, Tuples._2<SNode, SNode>>() {
              public Iterable<Tuples._2<SNode, SNode>> translate(final SNode td) {
                return new Iterable<Tuples._2<SNode, SNode>>() {
                  public Iterator<Tuples._2<SNode, SNode>> iterator() {
                    return new YieldingIterator<Tuples._2<SNode, SNode>>() {
                      private int __CP__ = 0;
                      private SNode _2_em;
                      private Iterator<SNode> _2_em_it;

                      protected boolean moveToNext() {
__loop__:
                        do {
__switch__:
                          switch (this.__CP__) {
                            case -1:
                              assert false : "Internal error";
                              return false;
                            case 2:
                              this._2_em_it = SEnumOperations.getEnumMembers(SEnumOperations.getEnum("r:b16ff46d-fa06-479d-9f5c-5b6e17e7f1b2(jetbrains.mps.make.facet.structure)", "TargetDependencyQualifier")).iterator();
                            case 3:
                              if (!(this._2_em_it.hasNext())) {
                                this.__CP__ = 1;
                                break;
                              }
                              this._2_em = this._2_em_it.next();
                              this.__CP__ = 4;
                              break;
                            case 5:
                              this.__CP__ = 3;
                              this.yield(MultiTuple.<SNode,SNode>from(_2_em, td));
                              return true;
                            case 0:
                              this.__CP__ = 2;
                              break;
                            case 4:
                              this.__CP__ = 5;
                              break;
                            default:
                              break __loop__;
                          }
                        } while (true);
                        return false;
                      }
                    };
                  }
                };
              }
            }).toListSequence();
          }
        };
        Iterable<Tuples._2<SNode, SNode>> queryResult = (Iterable) calc.calculate();
        if (queryResult != null) {
          for (final Tuples._2<SNode, SNode> item : queryResult) {
            ListSequence.fromList(result).addElement(new DefaultChildNodeSubstituteAction(outputConcept, item, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {
              public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
                SNode dep = SNodeFactoryOperations.createNewNode(model, "jetbrains.mps.make.facet.structure.TargetDependency", null);
                SPropertyOperations.set(dep, "qualifier", SEnumOperations.getEnumMemberValue((item)._0()));
                SLinkOperations.setTarget(dep, "dependsOn", (item)._1(), false);
                return dep;
              }

              public String getMatchingText(String pattern) {
                return SEnumOperations.getEnumMemberName((item)._0()) + " " + SPropertyOperations.getString((item)._1(), "name");
              }

              public String getVisibleMatchingText(String pattern) {
                return this.getMatchingText(pattern);
              }
            });
          }
        }
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_Expression_7320828025189375232(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.make.facet.structure.LocalParametersComponentExpression");
      SNode childConcept = (SNode) _context.getChildConcept();
      if (SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        Calculable calc = new Calculable() {
          public Object calculate() {
            return SLinkOperations.getTargets(SLinkOperations.getTarget(SNodeOperations.getAncestor(_context.getParentNode(), "jetbrains.mps.make.facet.structure.TargetDeclaration", false, false), "parameters", true), "component", true);
          }
        };
        Iterable<SNode> queryResult = (Iterable) calc.calculate();
        if (queryResult != null) {
          for (final SNode item : queryResult) {
            ListSequence.fromList(result).addElement(new DefaultChildNodeSubstituteAction(outputConcept, item, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {
              public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
                SNode lve = SNodeFactoryOperations.createNewNode("jetbrains.mps.make.facet.structure.LocalParametersExpression", null);
                SNode lvce = SNodeFactoryOperations.createNewNode("jetbrains.mps.make.facet.structure.LocalParametersComponentExpression", null);
                SLinkOperations.setTarget(lvce, "operand", lve, true);
                SLinkOperations.setTarget(lvce, "operation", new QueriesGenerated.QuotationClass_x583g4_a2a3a0a0a0a0a0a2a2a0a1a5().createNode((item)), true);
                return lvce;
              }

              public String getMatchingText(String pattern) {
                return SPropertyOperations.getString((item), "name");
              }

              public String getVisibleMatchingText(String pattern) {
                return this.getMatchingText(pattern);
              }
            });
          }
        }
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_Expression_3344436107830239664(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.make.facet.structure.ForeignParametersComponentExpression");
      SNode childConcept = (SNode) _context.getChildConcept();
      if (SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        Calculable calc = new Calculable() {
          public Object calculate() {
            final SNode td = SNodeOperations.getAncestor(_context.getParentNode(), "jetbrains.mps.make.facet.structure.TargetDeclaration", false, false);
            SNode fd = SNodeOperations.cast(SNodeOperations.getParent(td), "jetbrains.mps.make.facet.structure.FacetDeclaration");
            return ListSequence.fromList(SLinkOperations.getTargets(fd, "targetDeclaration", true)).where(new IWhereFilter<SNode>() {
              public boolean accept(SNode sibl) {
                return sibl != td;
              }
            }).concat(ListSequence.fromList(SLinkOperations.getTargets(fd, "required", true)).<SNode>translate(new ITranslator2<SNode, SNode>() {
              public Iterable<SNode> translate(SNode rfd) {
                return SLinkOperations.getTargets(SLinkOperations.getTarget(rfd, "facet", false), "targetDeclaration", true);
              }
            })).<SNode>select(new ISelector<SNode, SNode>() {
              public SNode select(SNode rtd) {
                return SLinkOperations.getTarget(rtd, "parameters", true);
              }
            }).<SNode>translate(new ITranslator2<SNode, SNode>() {
              public Iterable<SNode> translate(SNode p) {
                return SLinkOperations.getTargets(p, "component", true);
              }
            }).toListSequence();
          }
        };
        Iterable<SNode> queryResult = (Iterable) calc.calculate();
        if (queryResult != null) {
          for (final SNode item : queryResult) {
            ListSequence.fromList(result).addElement(new DefaultChildNodeSubstituteAction(outputConcept, item, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {
              public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
                SNode fve = new QueriesGenerated.QuotationClass_x583g4_a0a0a0a0a0a0a0a2a2a0a1a6().createNode(SNodeOperations.getAncestor((item), "jetbrains.mps.make.facet.structure.TargetDeclaration", false, false));
                SNode op = new QueriesGenerated.QuotationClass_x583g4_a0a1a0a0a0a0a0a2a2a0a1a6().createNode((item));
                return new QueriesGenerated.QuotationClass_x583g4_a0c0a0a0a0a0a0c0c0a0b0g().createNode(fve, op);
              }

              public String getMatchingText(String pattern) {
                return SPropertyOperations.getString(SNodeOperations.getAncestor((item), "jetbrains.mps.make.facet.structure.TargetDeclaration", false, false), "name") + "." + SPropertyOperations.getString((item), "name");
              }

              public String getVisibleMatchingText(String pattern) {
                return this.getMatchingText(pattern);
              }
            });
          }
        }
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_FacetReferenceExpression_7178445679340358586(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.make.facet.structure.FacetReferenceExpression");
      SNode childConcept = (SNode) _context.getChildConcept();
      if (SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        Calculable calc = new Calculable() {
          public Object calculate() {
            return SModelOperations.getNodesIncludingImported(_context.getModel(), operationContext.getScope(), "jetbrains.mps.make.facet.structure.FacetDeclaration");
          }
        };
        Iterable<SNode> queryResult = (Iterable) calc.calculate();
        if (queryResult != null) {
          for (final SNode item : queryResult) {
            ListSequence.fromList(result).addElement(new DefaultChildNodeSubstituteAction(outputConcept, item, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {
              public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
                return new QueriesGenerated.QuotationClass_x583g4_a0a0a0a0a0a0a0c0c0a0b0h().createNode((item));
              }

              public String getMatchingText(String pattern) {
                return "&" + SPropertyOperations.getString((item), "name");
              }

              public String getVisibleMatchingText(String pattern) {
                return this.getMatchingText(pattern);
              }

              public String getDescriptionText(String pattern) {
                return "reference to facet " + SPropertyOperations.getString((item), "name");
              }
            });
          }
        }
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_IPropertyExpression_2191561637326275634(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.make.facet.structure.ResourceSpecificPropertiesExpression");
      ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(concept, _context.getSourceNode()) {
        public SNode doSubstitute(String pattern) {
          SLinkOperations.setNewChild(_context.getSourceNode(), "resource", "jetbrains.mps.baseLanguage.structure.Expression");
          return _context.getSourceNode();
        }

        public String getMatchingText(String pattern) {
          return "@";
        }

        public String getVisibleMatchingText(String pattern) {
          return this.getMatchingText(pattern);
        }

        public String getDescriptionText(String pattern) {
          return "specify resource";
        }
      });
    }
    return result;
  }

  public static class QuotationClass_x583g4_a2a3a0a0a0a0a0a2a2a0a1a5 {
    public QuotationClass_x583g4_a2a3a0a0a0a0a0a2a2a0a1a5() {
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.tuples.structure.NamedTupleComponentAccessOperation", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("component", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_x583g4_a0a0a0a0a0a0a0a2a2a0a1a6 {
    public QuotationClass_x583g4_a0a0a0a0a0a0a0a2a2a0a1a6() {
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.make.facet.structure.ForeignParametersExpression", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("target", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_x583g4_a0a1a0a0a0a0a0a2a2a0a1a6 {
    public QuotationClass_x583g4_a0a1a0a0a0a0a0a2a2a0a1a6() {
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.tuples.structure.NamedTupleComponentAccessOperation", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("component", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_x583g4_a0c0a0a0a0a0a0c0c0a0b0g {
    public QuotationClass_x583g4_a0c0a0a0a0a0a0c0c0a0b0g() {
    }

    public SNode createNode(Object parameter_7, Object parameter_8) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.make.facet.structure.ForeignParametersComponentExpression", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_4 = quotedNode_1;
        {
          quotedNode_2 = (SNode) parameter_7;
          SNode quotedNode1_5;
          if (_parameterValues_129834374.contains(quotedNode_2)) {
            quotedNode1_5 = HUtil.copyIfNecessary(quotedNode_2);
          } else {
            _parameterValues_129834374.add(quotedNode_2);
            quotedNode1_5 = quotedNode_2;
          }
          if (quotedNode1_5 != null) {
            quotedNode_1.addChild("operand", HUtil.copyIfNecessary(quotedNode1_5));
          }
        }
        {
          quotedNode_3 = (SNode) parameter_8;
          SNode quotedNode1_6;
          if (_parameterValues_129834374.contains(quotedNode_3)) {
            quotedNode1_6 = HUtil.copyIfNecessary(quotedNode_3);
          } else {
            _parameterValues_129834374.add(quotedNode_3);
            quotedNode1_6 = quotedNode_3;
          }
          if (quotedNode1_6 != null) {
            quotedNode_1.addChild("operation", HUtil.copyIfNecessary(quotedNode1_6));
          }
        }
        result = quotedNode1_4;
      }
      return result;
    }
  }

  public static class QuotationClass_x583g4_a0a0a0a0a0a0a0c0c0a0b0h {
    public QuotationClass_x583g4_a0a0a0a0a0a0a0c0c0a0b0h() {
    }

    public SNode createNode(Object parameter_5) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.make.facet.structure.FacetReferenceExpression", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        {
          quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.make.facet.structure.NamedFacetReference", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_4 = quotedNode_2;
          quotedNode1_4.setReferent("facet", (SNode) parameter_5);
          quotedNode_1.addChild("reference", quotedNode1_4);
        }
        result = quotedNode1_3;
      }
      return result;
    }
  }
}
