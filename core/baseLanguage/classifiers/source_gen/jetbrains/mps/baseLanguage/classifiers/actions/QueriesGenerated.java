package jetbrains.mps.baseLanguage.classifiers.actions;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.action.NodeSubstitutePreconditionContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.action.SideTransformPreconditionContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import java.util.List;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.smodel.action.NodeSubstituteActionsFactoryContext;
import java.util.ArrayList;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.util.Calculable;
import jetbrains.mps.baseLanguage.classifiers.behavior.IClassifierPart_Behavior;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.baseLanguage.classifiers.behavior.IClassifier_Behavior;
import jetbrains.mps.smodel.action.DefaultChildNodeSubstituteAction;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.baseLanguage.classifiers.behavior.IMember_Behavior;
import jetbrains.mps.smodel.action.SideTransformActionsBuilderContext;
import jetbrains.mps.baseLanguage.classifiers.behavior.ThisClassifierExpresson_Behavior;
import jetbrains.mps.smodel.action.AbstractSideTransformHintSubstituteAction;

public class QueriesGenerated {

  public static boolean nodeSubstituteActionsBuilder_Precondition_Expression_1205921340852(final IOperationContext operationContext, final NodeSubstitutePreconditionContext _context) {
    return SNodeOperations.getAncestorWhereConceptInList(_context.getParentNode(), new String[]{"jetbrains.mps.baseLanguage.classifiers.structure.IClassifier","jetbrains.mps.baseLanguage.classifiers.structure.IClassifierPart"}, true, false) != null;
  }

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_ThisClassifierExpresson_1219068300393(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    return (SLinkOperations.getTarget(_context.getSourceNode(), "classifier", false) == null);
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_Expression_1205921334476(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    final SNode contextClassifier;
    final boolean multipleClassifiers;
    {
      Calculable calc = new Calculable() {

        public Object calculate() {
          SNode contextPart = SNodeOperations.getAncestorWhereConceptInList(_context.getParentNode(), new String[]{"jetbrains.mps.baseLanguage.classifiers.structure.IClassifier","jetbrains.mps.baseLanguage.classifiers.structure.IClassifierPart"}, true, false);
          if (SNodeOperations.isInstanceOf(contextPart, "jetbrains.mps.baseLanguage.classifiers.structure.IClassifier")) {
            return contextPart;
          } else
          {
            return IClassifierPart_Behavior.call_getMainClassifier_1213877255428(contextPart);
          }
        }

      };
      contextClassifier = (SNode)calc.calculate();
    }
    {
      Calculable calc = new Calculable() {

        public Object calculate() {
          return ListSequence.fromList(SNodeOperations.getAncestorsWhereConceptInList(_context.getParentNode(), new String[]{"jetbrains.mps.baseLanguage.classifiers.structure.IClassifier","jetbrains.mps.baseLanguage.classifiers.structure.IClassifierPart","jetbrains.mps.baseLanguage.structure.Classifier"}, true)).count() > 1;
        }

      };
      multipleClassifiers = (Boolean)calc.calculate();
    }
    {
      AbstractConceptDeclaration outputConcept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.DotExpression", operationContext.getScope());
      SNode childConcept = (SNode)_context.getChildConcept();
      if (SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName((SNode)BaseAdapter.fromAdapter(outputConcept)))) {
        Calculable calc = new Calculable() {

          public Object calculate() {
            return IClassifier_Behavior.call_getMembers_1213877528020(contextClassifier, _context.getParentNode());
          }

        };
        Iterable<SNode> queryResult = (Iterable)calc.calculate();
        if (queryResult != null) {
          for(final SNode item : queryResult) {
            result.add(new DefaultChildNodeSubstituteAction(outputConcept, item, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {

              public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
                SNode result = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.DotExpression", null);
                SLinkOperations.setNewChild(result, "operand", "jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson");
                if (multipleClassifiers) {
                  SLinkOperations.setTarget(SLinkOperations.getTarget(result, "operand", true), "classifier", contextClassifier, false);
                }
                SLinkOperations.setTarget(result, "operation", IMember_Behavior.call_createOperation_1213877353000((item)), true);
                return result;
              }

            });
          }
        }
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_ThisClassifierExpresson_1219068300355(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      final AbstractConceptDeclaration concept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson", operationContext.getScope());
      Calculable calculable = new Calculable() {

        public Object calculate() {
          return ThisClassifierExpresson_Behavior.call_getPossibleClassifiers_1219068414643(_context.getSourceNode());
        }

      };
      Iterable<SNode> parameterObjects = (Iterable<SNode>)calculable.calculate();
      assert parameterObjects != null;
      for(final SNode item : parameterObjects) {
        result.add(new AbstractSideTransformHintSubstituteAction(item, _context.getSourceNode()) {

          public SNode doSubstitute(String pattern) {
            SNode expr = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson", null);
            SLinkOperations.setTarget(expr, "classifier", (item), false);
            SNodeOperations.replaceWithAnother(_context.getSourceNode(), expr);
            return expr;
          }

          public SNode getOutputConcept() {
            return concept.getNode();
          }

          public String getMatchingText(String text) {
            return (item) + ".";
          }

          public String getVisibleMatchingText(String text) {
            return this.getMatchingText(text);
          }

        });
      }
    }
    return result;
  }

}
