package jetbrains.mps.baseLanguage.dates.actions;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.action.NodeSubstitutePreconditionContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.baseLanguage.behavior.TypeDerivable_Behavior;
import jetbrains.mps.smodel.action.SideTransformPreconditionContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import java.util.List;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.smodel.action.NodeSubstituteActionsFactoryContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.action.ChildSubstituteActionsHelper;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.util.Calculable;
import org.joda.time.DateTimeZone;
import jetbrains.mps.smodel.action.DefaultChildNodeSubstituteAction;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.action.DefaultSimpleSubstituteAction;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import jetbrains.mps.smodel.action.SideTransformActionsBuilderContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptPropertyOperations;
import jetbrains.mps.smodel.action.AbstractSideTransformHintSubstituteAction;
import jetbrains.mps.smodel.action.ModelActions;
import jetbrains.mps.nodeEditor.CellSide;

public class QueriesGenerated {
  public static boolean nodeSubstituteActionsBuilder_Precondition_Expression_4555537781927653007(final IOperationContext operationContext, final NodeSubstitutePreconditionContext _context) {
    SNode td = SNodeOperations.getAncestor(_context.getParentNode(), "jetbrains.mps.baseLanguage.structure.TypeDerivable", true, false);
    return (td != null) && TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeDerivable_Behavior.call_deriveType_4555537781928374706(td, _context.getCurrentTargetNode(), _context.getLink()), new _Quotations.QuotationClass_11().createNode());
  }

  public static boolean nodeSubstituteActionsBuilder_Precondition_Expression_5473692278135639405(final IOperationContext operationContext, final NodeSubstitutePreconditionContext _context) {
    SNode td = SNodeOperations.getAncestor(_context.getParentNode(), "jetbrains.mps.baseLanguage.structure.TypeDerivable", true, false);
    return (td != null) && TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeDerivable_Behavior.call_deriveType_4555537781928374706(td, _context.getCurrentTargetNode(), _context.getLink()), new _Quotations.QuotationClass_14().createNode());
  }

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_Expression_1169657599823(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    return DateTypeUtil.isInstanceOfDatetimeWithTZ(_context.getSourceNode());
  }

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_Expression_1172507582020(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    return DateTypeUtil.isInstanceOfInt(_context.getSourceNode());
  }

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_Expression_1238418378523(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    return DateTypeUtil.isInstanceOfPeriod(_context.getSourceNode()) || DateTypeUtil.isInstanceOfDatetimeWithTZ(_context.getSourceNode());
  }

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_InlineFormatDateTimeExpression_194163770812434496(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    return (SLinkOperations.getTarget(_context.getSourceNode(), "locale", false) == null);
  }

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_ParseDateTimeExpression_670620798052429713(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    return (SLinkOperations.getTarget(_context.getSourceNode(), "locale", false) == null);
  }

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_ParseDateTimeExpression_670620798052429809(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    return (SLinkOperations.getTarget(_context.getSourceNode(), "default", true) == null);
  }

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_Expression_670620798052616884(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    return TypeChecker.getInstance().getRuntimeSupport().coerce_(TypeChecker.getInstance().getTypeOf(_context.getSourceNode()), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.StringType"), true) != null;
  }

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_Expression_2151017756820978893(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    return DateTypeUtil.getContainingPeriod(_context.getSourceNode()) != null;
  }

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_FormatDateTimeExpression_2890840340813346923(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    return (SLinkOperations.getTarget(_context.getSourceNode(), "locale", false) == null);
  }

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_Expression_6626410111396231034(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    return TypeChecker.getInstance().getRuntimeSupport().coerce_(TypeChecker.getInstance().getTypeOf(_context.getSourceNode()), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.dates.structure.DateTimeType"), true) != null;
  }

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_Expression_6922407976778399692(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    return DateTypeUtil.getCompareExpression(_context.getSourceNode()) != null;
  }

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_Expression_7499037524191428232(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    return DateTypeUtil.isInstanceOfTimezone(_context.getSourceNode()) && SNodeOperations.isInstanceOf(SNodeOperations.getParent(_context.getSourceNode()), "jetbrains.mps.baseLanguage.dates.structure.ParseDateTimeExpression");
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_Expression_4555537781927653006(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode conceptToAdd = SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.DefaultTimeZoneConstant");
      List<INodeSubstituteAction> defaultActions = ChildSubstituteActionsHelper.createDefaultActions(conceptToAdd, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext);
      ListSequence.fromList(result).addSequence(ListSequence.fromList(defaultActions));
    }
    {
      SNode conceptToAdd = SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.UTCTimeZoneConstant");
      List<INodeSubstituteAction> defaultActions = ChildSubstituteActionsHelper.createDefaultActions(conceptToAdd, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext);
      ListSequence.fromList(result).addSequence(ListSequence.fromList(defaultActions));
    }
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.TimeZoneIDExpression");
      SNode childConcept = (SNode)_context.getChildConcept();
      if (SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        Calculable calc = new Calculable() {
          public Object calculate() {
            DateTimeZone.getAvailableIDs();
            List<String> result = ListSequence.fromList(new ArrayList<String>());
            for (Object id : DateTimeZone.getAvailableIDs()) {
              ListSequence.fromList(result).addElement(String.valueOf(id));
            }
            return result;
          }
        };
        Iterable<String> queryResult = (Iterable)calc.calculate();
        if (queryResult != null) {
          for (final String item : queryResult) {
            ListSequence.fromList(result).addElement(new DefaultChildNodeSubstituteAction(outputConcept, item, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {
              public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
                SNode tz = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.dates.structure.TimeZoneIDExpression", null);
                SPropertyOperations.set(tz, "timezone_id", "" + ((item)));
                return tz;
              }

              public String getMatchingText(String pattern) {
                return (item);
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

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_Expression_5473692278135635934(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.TimeZoneOffsetExpression");
      SNode childConcept = (SNode)_context.getChildConcept();
      if (outputConcept == null || SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        ListSequence.fromList(result).addElement(new DefaultSimpleSubstituteAction(outputConcept, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {
          public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
            SNode tz = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.dates.structure.TimeZoneOffsetExpression", null);
            SPropertyOperations.set(tz, "offsetmillis", "" + (0));
            try {
              DateTime dt = DateTimeFormat.forPattern("Z").withOffsetParsed().parseDateTime(pattern);
              if (dt.withZoneRetainFields(DateTimeZone.UTC).getMillis() == 0L) {
                SPropertyOperations.set(tz, "offsetmillis", "" + (dt.getZone().getStandardOffset(0L)));
              }
            } catch (RuntimeException ignored) {
            }
            return tz;
          }

          public boolean hasSubstitute() {
            return true;
          }

          public boolean canSubstitute_internal(String pattern, boolean strictly) {
            if (strictly) {
              return _PrecompiledPatterns.REGEXP0.matcher(pattern).matches();
            } else {
              return _PrecompiledPatterns.REGEXP1.matcher(pattern).matches();
            }
          }

          public String getDescriptionText(String pattern) {
            return "offset time zone";
          }

          public String getMatchingText(String pattern) {
            return pattern;
          }

          public String getVisibleMatchingText(String pattern) {
            return this.getMatchingText(pattern);
          }
        });
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_Expression_1169657550853(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.DateTimeWithPropertyOperation");
      Iterable<SNode> concepts;
      concepts = SConceptOperations.getAllSubConcepts(concept, _context.getModel(), operationContext.getScope());
      for (final SNode subconcept : concepts) {
        if (!(SNodeOperations.isInstanceOf(subconcept, "jetbrains.mps.lang.structure.structure.ConceptDeclaration"))) {
          continue;
        }
        if (SConceptPropertyOperations.getBoolean(subconcept, "abstract")) {
          continue;
        }
        ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(subconcept, _context.getSourceNode()) {
          public SNode doSubstitute(String pattern) {
            SNode result = SConceptOperations.createNewNode(NameUtil.nodeFQName(subconcept), null);
            SNodeOperations.replaceWithAnother(_context.getSourceNode(), result);
            SLinkOperations.setTarget(result, "datetime", _context.getSourceNode(), true);
            return result;
          }
        });
      }
    }
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.RoundDateTimeOperation");
      Iterable<SNode> concepts;
      concepts = SConceptOperations.getAllSubConcepts(concept, _context.getModel(), operationContext.getScope());
      for (final SNode subconcept : concepts) {
        if (!(SNodeOperations.isInstanceOf(subconcept, "jetbrains.mps.lang.structure.structure.ConceptDeclaration"))) {
          continue;
        }
        if (SConceptPropertyOperations.getBoolean(subconcept, "abstract")) {
          continue;
        }
        ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(subconcept, _context.getSourceNode()) {
          public SNode doSubstitute(String pattern) {
            SNode result = SConceptOperations.createNewNode(NameUtil.nodeFQName(subconcept), null);
            SNodeOperations.replaceWithAnother(_context.getSourceNode(), result);
            SLinkOperations.setTarget(result, "datetime", _context.getSourceNode(), true);
            return result;
          }
        });
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_Expression_1172507550761(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      final SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.PeriodConstant");
      Calculable calculable = new Calculable() {
        public Object calculate() {
          return DateTypeUtil.findDateTimeProperties(operationContext.getScope(), _context.getModel());
        }
      };
      Iterable<SNode> parameterObjects = (Iterable<SNode>)calculable.calculate();
      assert parameterObjects != null;
      for (final SNode item : parameterObjects) {
        ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(item, _context.getSourceNode()) {
          public SNode doSubstitute(String pattern) {
            SNode result = SNodeOperations.replaceWithNewChild(_context.getSourceNode(), "jetbrains.mps.baseLanguage.dates.structure.PeriodConstant");
            SLinkOperations.setTarget(result, "count", _context.getSourceNode(), true);
            SLinkOperations.setTarget(result, "dateTimeProperty", (item), false);
            return result;
          }

          public SNode getOutputConcept() {
            return concept;
          }

          public String getMatchingText(String text) {
            return SPropertyOperations.getString((item), "pluralForm");
          }

          public String getVisibleMatchingText(String text) {
            return this.getMatchingText(text);
          }

          public String getDescriptionText(String text) {
            return "Period constant";
          }
        });
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_Expression_1238418304901(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.InlineFormatDateTimeExpression");
      Iterable<SNode> concepts;
      concepts = SConceptOperations.getAllSubConcepts(concept, _context.getModel(), operationContext.getScope());
      for (final SNode subconcept : concepts) {
        if (!(SNodeOperations.isInstanceOf(subconcept, "jetbrains.mps.lang.structure.structure.ConceptDeclaration"))) {
          continue;
        }
        if (SConceptPropertyOperations.getBoolean(subconcept, "abstract")) {
          continue;
        }
        ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(subconcept, _context.getSourceNode()) {
          public SNode doSubstitute(String pattern) {
            SNode result = SConceptOperations.createNewNode(NameUtil.nodeFQName(subconcept), null);
            SNodeOperations.replaceWithAnother(_context.getSourceNode(), result);
            SLinkOperations.setTarget(result, "datetime", _context.getSourceNode(), true);
            return result;
          }
        });
      }
    }
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.FormatDateTimeExpression");
      Iterable<SNode> concepts;
      concepts = SConceptOperations.getAllSubConcepts(concept, _context.getModel(), operationContext.getScope());
      for (final SNode subconcept : concepts) {
        if (!(SNodeOperations.isInstanceOf(subconcept, "jetbrains.mps.lang.structure.structure.ConceptDeclaration"))) {
          continue;
        }
        if (SConceptPropertyOperations.getBoolean(subconcept, "abstract")) {
          continue;
        }
        ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(subconcept, _context.getSourceNode()) {
          public SNode doSubstitute(String pattern) {
            SNode result = SConceptOperations.createNewNode(NameUtil.nodeFQName(subconcept), null);
            SNodeOperations.replaceWithAnother(_context.getSourceNode(), result);
            SLinkOperations.setTarget(result, "datetime", _context.getSourceNode(), true);
            return result;
          }
        });
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_InlineFormatDateTimeExpression_194163770812433047(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.InlineFormatDateTimeExpression");
      ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(concept, _context.getSourceNode()) {
        public SNode doSubstitute(String pattern) {
          return SLinkOperations.setTarget(_context.getSourceNode(), "locale", SLinkOperations.getTarget(new _Quotations.QuotationClass_6().createNode(), "locale", false), false);
        }

        public String getMatchingText(String pattern) {
          return "(";
        }

        public String getVisibleMatchingText(String pattern) {
          return this.getMatchingText(pattern);
        }
      });
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_ParseDateTimeExpression_670620798052429712(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.ParseDateTimeExpression");
      ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(concept, _context.getSourceNode()) {
        public SNode doSubstitute(String pattern) {
          SLinkOperations.setTarget(_context.getSourceNode(), "locale", SLinkOperations.getTarget(new _Quotations.QuotationClass_7().createNode(), "locale", false), false);
          return SNodeOperations.getNode("r:00000000-0000-4000-0000-011c895903dd(jetbrains.mps.baseLanguage.datesInternal.structure)", "1172074383898");
        }

        public String getMatchingText(String pattern) {
          return "(";
        }

        public String getVisibleMatchingText(String pattern) {
          return this.getMatchingText(pattern);
        }

        public String getDescriptionText(String pattern) {
          return "specify parsing locale";
        }
      });
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_ParseDateTimeExpression_670620798052429808(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.ParseDateTimeExpression");
      ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(concept, _context.getSourceNode()) {
        public SNode doSubstitute(String pattern) {
          return SLinkOperations.setTarget(_context.getSourceNode(), "default", new _Quotations.QuotationClass_8().createNode(), true);
        }

        public String getMatchingText(String pattern) {
          return "into";
        }

        public String getVisibleMatchingText(String pattern) {
          return this.getMatchingText(pattern);
        }

        public String getDescriptionText(String pattern) {
          return "specify datetime with default values";
        }
      });
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_Expression_670620798052615669(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.ParseDateTimeExpression");
      ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(concept, _context.getSourceNode()) {
        public SNode doSubstitute(String pattern) {
          SNode n = SNodeOperations.replaceWithNewChild(_context.getSourceNode(), "jetbrains.mps.baseLanguage.dates.structure.ParseDateTimeExpression");
          SLinkOperations.setTarget(n, "source", _context.getSourceNode(), true);
          return n;
        }

        public String getMatchingText(String pattern) {
          return SConceptPropertyOperations.getString(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.ParseDateTimeExpression"), "alias");
        }

        public String getVisibleMatchingText(String pattern) {
          return this.getMatchingText(pattern);
        }

        public String getDescriptionText(String pattern) {
          return SConceptPropertyOperations.getString(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.ParseDateTimeExpression"), "shortDescription");
        }
      });
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_Expression_2151017756820977438(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.PeriodInPropertyExpression");
      Iterable<SNode> concepts;
      concepts = SConceptOperations.getAllSubConcepts(concept, _context.getModel(), operationContext.getScope());
      for (final SNode subconcept : concepts) {
        if (!(SNodeOperations.isInstanceOf(subconcept, "jetbrains.mps.lang.structure.structure.ConceptDeclaration"))) {
          continue;
        }
        if (SConceptPropertyOperations.getBoolean(subconcept, "abstract")) {
          continue;
        }
        ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(subconcept, _context.getSourceNode()) {
          public SNode doSubstitute(String pattern) {
            SNode result = SConceptOperations.createNewNode(NameUtil.nodeFQName(subconcept), null);
            {
              SNode sn = DateTypeUtil.getContainingPeriod(_context.getSourceNode());
              SNodeOperations.replaceWithAnother(sn, result);
              if (SNodeOperations.isInstanceOf(sn, "jetbrains.mps.baseLanguage.structure.ParenthesizedExpression")) {
                SLinkOperations.setTarget(result, "datetime", sn, true);
              } else {
                SLinkOperations.setTarget(result, "datetime", SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ParenthesizedExpression", null), true);
                SLinkOperations.setTarget(SNodeOperations.cast(SLinkOperations.getTarget(result, "datetime", true), "jetbrains.mps.baseLanguage.structure.ParenthesizedExpression"), "expression", sn, true);
              }
              return result;
            }
          }
        });
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_FormatDateTimeExpression_2890840340813345708(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.FormatDateTimeExpression");
      ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(concept, _context.getSourceNode()) {
        public SNode doSubstitute(String pattern) {
          return SLinkOperations.setTarget(_context.getSourceNode(), "locale", SLinkOperations.getTarget(new _Quotations.QuotationClass_10().createNode(), "locale", false), false);
        }

        public String getMatchingText(String pattern) {
          return "(";
        }

        public String getVisibleMatchingText(String pattern) {
          return this.getMatchingText(pattern);
        }
      });
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_Expression_6626410111396229828(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.InTimezoneExpression");
      Iterable<SNode> concepts;
      concepts = SConceptOperations.getAllSubConcepts(concept, _context.getModel(), operationContext.getScope());
      for (final SNode subconcept : concepts) {
        if (!(SNodeOperations.isInstanceOf(subconcept, "jetbrains.mps.lang.structure.structure.ConceptDeclaration"))) {
          continue;
        }
        if (SConceptPropertyOperations.getBoolean(subconcept, "abstract")) {
          continue;
        }
        ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(subconcept, _context.getSourceNode()) {
          public SNode doSubstitute(String pattern) {
            SNode result = SConceptOperations.createNewNode(NameUtil.nodeFQName(subconcept), null);
            SNodeOperations.replaceWithAnother(_context.getSourceNode(), result);
            SLinkOperations.setTarget(result, "datetime", _context.getSourceNode(), true);
            return result;
          }
        });
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_Expression_6922407976778393368(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.WithPropertyCompareExpression");
      Iterable<SNode> concepts;
      concepts = SConceptOperations.getAllSubConcepts(concept, _context.getModel(), operationContext.getScope());
      for (final SNode subconcept : concepts) {
        if (!(SNodeOperations.isInstanceOf(subconcept, "jetbrains.mps.lang.structure.structure.ConceptDeclaration"))) {
          continue;
        }
        if (SConceptPropertyOperations.getBoolean(subconcept, "abstract")) {
          continue;
        }
        ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(subconcept, _context.getSourceNode()) {
          public SNode doSubstitute(String pattern) {
            SNode result = SConceptOperations.createNewNode(NameUtil.nodeFQName(subconcept), null);
            {
              SNode sn = DateTypeUtil.getCompareExpression(_context.getSourceNode());
              SNodeOperations.replaceWithAnother(sn, result);
              SLinkOperations.setTarget(result, "operation", sn, true);
              return result;
            }
          }
        });
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_Expression_7499037524191428215(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      Calculable calc = new Calculable() {
        public Object calculate() {
          return SNodeOperations.getParent(_context.getSourceNode());
        }
      };
      SNode node = (SNode)calc.calculate();
      ListSequence.fromList(result).addSequence(ListSequence.fromList(ModelActions.createRightTransformHintSubstituteActions(node, CellSide.RIGHT, _context.getTransformationTag(), operationContext)));
    }
    return result;
  }
}
