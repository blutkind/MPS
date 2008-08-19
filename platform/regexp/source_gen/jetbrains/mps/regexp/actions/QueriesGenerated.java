package jetbrains.mps.regexp.actions;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.action.SideTransformPreconditionContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.action.NodeSetupContext;
import java.util.List;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.smodel.action.SideTransformActionsBuilderContext;
import java.util.ArrayList;
import jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.smodel.action.AbstractSideTransformHintSubstituteAction;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptPropertyOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.util.Calculable;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.regexp.structure.PredefinedSymbolClassDeclaration;
import jetbrains.mps.regexp.structure.RegexpDeclaration;
import jetbrains.mps.smodel.constraints.SearchScopeStatus;
import jetbrains.mps.smodel.constraints.ModelConstraintsUtil;

public class QueriesGenerated {

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_Expression_1175165238942(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    SNode type = TypeChecker.getInstance().getTypeOf(_context.getSourceNode());
    if (type == null) {
      return false;
    }
    if (!(SNodeOperations.isInstanceOf(type, "jetbrains.mps.baseLanguage.structure.ClassifierType"))) {
      return false;
    }
    if ("String".equals(SPropertyOperations.getString(SLinkOperations.getTarget(type, "classifier", false), "name")) && SNodeOperations.getModel(SLinkOperations.getTarget(type, "classifier", false)).getLongName().equals("java.lang")) {
      return true;
    }
    return false;
  }

  public static void nodeFactory_NodeSetup_MatchParensRegexp_1202218039385(final IOperationContext operationContext, final NodeSetupContext _context) {
    if (SNodeOperations.isInstanceOf(_context.getSampleNode(), "jetbrains.mps.regexp.structure.Regexp")) {
      SLinkOperations.setTarget(_context.getNewNode(), "regexp", _context.getSampleNode(), true);
    }
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_Expression_1175165206848(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      AbstractConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.Expression", operationContext.getScope());
      result.add(new AbstractSideTransformHintSubstituteAction(BaseAdapter.fromAdapter(concept), _context.getSourceNode()) {

        public SNode doSubstitute(String pattern) {
          SNode replace = SModelOperations.createNewNode(_context.getModel(), "jetbrains.mps.regexp.structure.ReplaceWithRegexpExpression", null);
          SNodeOperations.replaceWithAnother(_context.getSourceNode(), replace);
          SLinkOperations.setTarget(replace, "expr", _context.getSourceNode(), true);
          return replace;
        }

        public String getMatchingText(String pattern) {
          return ".replace with";
        }

        public String getVisibleMatchingText(String pattern) {
          return this.getMatchingText(pattern);
        }

      });
    }
    {
      AbstractConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.Expression", operationContext.getScope());
      result.add(new AbstractSideTransformHintSubstituteAction(BaseAdapter.fromAdapter(concept), _context.getSourceNode()) {

        public SNode doSubstitute(String pattern) {
          SNode split = SModelOperations.createNewNode(_context.getModel(), "jetbrains.mps.regexp.structure.SplitExpression", null);
          SNodeOperations.replaceWithAnother(_context.getSourceNode(), split);
          SLinkOperations.setTarget(split, "expr", _context.getSourceNode(), true);
          return split;
        }

        public String getMatchingText(String pattern) {
          return ".split";
        }

        public String getVisibleMatchingText(String pattern) {
          return this.getMatchingText(pattern);
        }

      });
    }
    {
      AbstractConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.Expression", operationContext.getScope());
      result.add(new AbstractSideTransformHintSubstituteAction(BaseAdapter.fromAdapter(concept), _context.getSourceNode()) {

        public SNode doSubstitute(String pattern) {
          SNode matchRegexpExpression = SNodeOperations.replaceWithNewChild(_context.getSourceNode(), "jetbrains.mps.regexp.structure.MatchRegexpExpression");
          SLinkOperations.setTarget(matchRegexpExpression, "inputExpression", _context.getSourceNode(), true);
          return matchRegexpExpression;
        }

        public String getMatchingText(String pattern) {
          return "matches";
        }

        public String getVisibleMatchingText(String pattern) {
          return this.getMatchingText(pattern);
        }

      });
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_Regexp_1177531247694(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.regexp.structure.BinaryRegexp");
      Iterable<SNode> concepts = ListOperations.<SNode>createList(concept);
      concepts = SequenceOperations.concat(concepts, SConceptOperations.getAllSubConcepts(concept, _context.getModel(), operationContext.getScope()));
      for(final SNode subconcept : concepts) {
        if (!(SNodeOperations.isInstanceOf(subconcept, "jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration"))) {
          continue;
        }
        if (SConceptPropertyOperations.getBoolean(subconcept, "abstract")) {
          continue;
        }
        result.add(new AbstractSideTransformHintSubstituteAction(subconcept, _context.getSourceNode()) {

          public SNode doSubstitute(String pattern) {
            SNode result = SConceptOperations.createNewNode(NameUtil.nodeFQName(subconcept), null);
            SNodeOperations.replaceWithAnother(_context.getSourceNode(), result);
            SLinkOperations.setTarget(result, "left", _context.getSourceNode(), true);
            return result;
          }

        });
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_Regexp_1177531282394(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.regexp.structure.UnaryRegexp");
      Iterable<SNode> concepts = ListOperations.<SNode>createList(concept);
      concepts = SequenceOperations.concat(concepts, SConceptOperations.getAllSubConcepts(concept, _context.getModel(), operationContext.getScope()));
      for(final SNode subconcept : concepts) {
        if (!(SNodeOperations.isInstanceOf(subconcept, "jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration"))) {
          continue;
        }
        if (SConceptPropertyOperations.getBoolean(subconcept, "abstract")) {
          continue;
        }
        result.add(new AbstractSideTransformHintSubstituteAction(subconcept, _context.getSourceNode()) {

          public SNode doSubstitute(String pattern) {
            SNode result = SConceptOperations.createNewNode(NameUtil.nodeFQName(subconcept), null);
            SNodeOperations.replaceWithAnother(_context.getSourceNode(), result);
            SLinkOperations.setTarget(result, "regexp", _context.getSourceNode(), true);
            return result;
          }

        });
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_Regexp_1177531335474(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      final AbstractConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.regexp.structure.Regexp", operationContext.getScope());
      Calculable calculable = new Calculable() {

        public Object calculate() {
          final List<SNode> excludeList = ListSequence.<SNode>fromArray(SConceptOperations.findConceptDeclaration("jetbrains.mps.regexp.structure.BinaryRegexp"), SConceptOperations.findConceptDeclaration("jetbrains.mps.regexp.structure.UnaryRegexp"), SConceptOperations.findConceptDeclaration("jetbrains.mps.regexp.structure.PredefinedSymbolClassRegexp"), SConceptOperations.findConceptDeclaration("jetbrains.mps.regexp.structure.RegexpDeclarationReferenceRegexp"), SConceptOperations.findConceptDeclaration("jetbrains.mps.regexp.structure.MatchVariableReferenceRegexp"));
          List<SNode> regexps = SConceptOperations.getAllSubConcepts(SConceptOperations.findConceptDeclaration("jetbrains.mps.regexp.structure.Regexp"), _context.getModel(), operationContext.getScope());
          return ListSequence.fromList(regexps).where(new IWhereFilter <SNode>() {

            public boolean accept(SNode it) {
              for(SNode exclude : excludeList) {
                if (SConceptOperations.isSubConceptOf(it, NameUtil.nodeFQName(exclude))) {
                  return false;
                }
              }
              return true;
            }

          }).toListSequence();
        }

      };
      Iterable<SNode> parameterObjects = (Iterable<SNode>)calculable.calculate();
      assert parameterObjects != null;
      for(final SNode item : parameterObjects) {
        result.add(new AbstractSideTransformHintSubstituteAction(item, _context.getSourceNode()) {

          public SNode doSubstitute(String pattern) {
            SNode newRegexp = SConceptOperations.createNewNode(NameUtil.nodeFQName((item)), null);
            SNode result = SConceptOperations.createNewNode("jetbrains.mps.regexp.structure.SeqRegexp", null);
            SNodeOperations.replaceWithAnother(_context.getSourceNode(), result);
            SLinkOperations.setTarget(result, "left", _context.getSourceNode(), true);
            SLinkOperations.setTarget(result, "right", newRegexp, true);
            return result;
          }

          public SNode getOutputConcept() {
            return concept.getNode();
          }

        });
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_Regexp_1177531588848(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      final AbstractConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.regexp.structure.PredefinedSymbolClassRegexp", operationContext.getScope());
      Calculable calculable = new Calculable() {

        public Object calculate() {
          SModel model = _context.getSourceNode().getModel();
          return BaseAdapter.toNodes(model.allAdaptersIncludingImported(operationContext.getScope(), PredefinedSymbolClassDeclaration.class));
        }

      };
      Iterable<SNode> parameterObjects = (Iterable<SNode>)calculable.calculate();
      assert parameterObjects != null;
      for(final SNode item : parameterObjects) {
        result.add(new AbstractSideTransformHintSubstituteAction(item, _context.getSourceNode()) {

          public SNode doSubstitute(String pattern) {
            SNode res = SModelOperations.createNewNode(_context.getModel(), "jetbrains.mps.regexp.structure.SeqRegexp", null);
            SNodeOperations.replaceWithAnother(_context.getSourceNode(), res);
            SLinkOperations.setTarget(res, "left", _context.getSourceNode(), true);
            SNode ref = SModelOperations.createNewNode(_context.getModel(), "jetbrains.mps.regexp.structure.PredefinedSymbolClassRegexp", null);
            SLinkOperations.setTarget(ref, "symbolClass", (item), false);
            SLinkOperations.setTarget(res, "right", ref, true);
            return res;
          }

          public SNode getOutputConcept() {
            return concept.getNode();
          }

          public String getMatchingText(String text) {
            return SPropertyOperations.getString((item), "name");
          }

          public String getVisibleMatchingText(String text) {
            return this.getMatchingText(text);
          }

          public String getDescriptionText(String text) {
            return SPropertyOperations.getString((item), "description");
          }

        });
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_Regexp_1177531829621(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      final AbstractConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.regexp.structure.RegexpDeclarationReferenceRegexp", operationContext.getScope());
      Calculable calculable = new Calculable() {

        public Object calculate() {
          return BaseAdapter.toNodes(SNodeOperations.getModel(_context.getSourceNode()).allAdaptersIncludingImported(operationContext.getScope(), RegexpDeclaration.class));
        }

      };
      Iterable<SNode> parameterObjects = (Iterable<SNode>)calculable.calculate();
      assert parameterObjects != null;
      for(final SNode item : parameterObjects) {
        result.add(new AbstractSideTransformHintSubstituteAction(item, _context.getSourceNode()) {

          public SNode doSubstitute(String pattern) {
            SNode seq = SModelOperations.createNewNode(_context.getModel(), "jetbrains.mps.regexp.structure.SeqRegexp", null);
            SNodeOperations.replaceWithAnother(_context.getSourceNode(), seq);
            SLinkOperations.setTarget(seq, "left", _context.getSourceNode(), true);
            SNode ref = SModelOperations.createNewNode(_context.getModel(), "jetbrains.mps.regexp.structure.RegexpDeclarationReferenceRegexp", null);
            SLinkOperations.setTarget(ref, "regexp", (item), false);
            SLinkOperations.setTarget(seq, "right", ref, true);
            return seq;
          }

          public SNode getOutputConcept() {
            return concept.getNode();
          }

          public String getMatchingText(String text) {
            return SPropertyOperations.getString((item), "name");
          }

          public String getVisibleMatchingText(String text) {
            return this.getMatchingText(text);
          }

          public String getDescriptionText(String text) {
            return SPropertyOperations.getString((item), "description");
          }

        });
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_Regexp_1177533163867(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      final AbstractConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.regexp.structure.MatchVariableReferenceRegexp", operationContext.getScope());
      Calculable calculable = new Calculable() {

        public Object calculate() {
          SearchScopeStatus status = ModelConstraintsUtil.getSearchScope(null, _context.getSourceNode(), ((AbstractConceptDeclaration)SNodeOperations.getAdapter(SConceptOperations.findConceptDeclaration("jetbrains.mps.regexp.structure.MatchVariableReferenceRegexp"))), "match", operationContext);
          return status.getSearchScope().getNodes();
        }

      };
      Iterable<SNode> parameterObjects = (Iterable<SNode>)calculable.calculate();
      assert parameterObjects != null;
      for(final SNode item : parameterObjects) {
        result.add(new AbstractSideTransformHintSubstituteAction(item, _context.getSourceNode()) {

          public SNode doSubstitute(String pattern) {
            SNode seq = SModelOperations.createNewNode(_context.getModel(), "jetbrains.mps.regexp.structure.SeqRegexp", null);
            SNode ref = SModelOperations.createNewNode(_context.getModel(), "jetbrains.mps.regexp.structure.MatchVariableReferenceRegexp", null);
            SLinkOperations.setTarget(ref, "match", (item), false);
            SNodeOperations.replaceWithAnother(_context.getSourceNode(), seq);
            SLinkOperations.setTarget(seq, "left", _context.getSourceNode(), true);
            SLinkOperations.setTarget(seq, "right", ref, true);
            return seq;
          }

          public SNode getOutputConcept() {
            return concept.getNode();
          }

          public String getMatchingText(String text) {
            return SPropertyOperations.getString((item), "name");
          }

          public String getVisibleMatchingText(String text) {
            return this.getMatchingText(text);
          }

          public String getDescriptionText(String text) {
            return "";
          }

        });
      }
    }
    return result;
  }

}
