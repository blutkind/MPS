package jetbrains.mps.baseLanguage.classifiers.actions;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.classifiers.behavior.IClassifierPart_Behavior;
import jetbrains.mps.baseLanguage.classifiers.behavior.IClassifier_Behavior;
import jetbrains.mps.baseLanguage.classifiers.behavior.IMember_Behavior;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.*;
import jetbrains.mps.smodel.action.DefaultChildNodeSubstituteAction;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.smodel.action.NodeSubstituteActionsFactoryContext;
import jetbrains.mps.smodel.action.NodeSubstitutePreconditionContext;
import jetbrains.mps.util.Calculable;
import jetbrains.mps.util.NameUtil;

import java.util.ArrayList;
import java.util.List;

public class QueriesGenerated {

  public static boolean nodeSubstituteActionsBuilder_Precondition_Expression_1205921340852(final IOperationContext operationContext, final NodeSubstitutePreconditionContext _context) {
    return SNodeOperations.getAncestorWhereConceptInList(_context.getParentNode(), new String[]{"jetbrains.mps.baseLanguage.classifiers.structure.IClassifier", "jetbrains.mps.baseLanguage.classifiers.structure.IClassifierPart"}, true, false) != null;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_Expression_1205921334476(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    final SNode contextClassifier;
    final boolean multipleClassifiers;
    {
      Calculable calc = new Calculable() {

        public Object calculate() {
          SNode contextPart = SNodeOperations.getAncestorWhereConceptInList(_context.getParentNode(), new String[]{"jetbrains.mps.baseLanguage.classifiers.structure.IClassifier", "jetbrains.mps.baseLanguage.classifiers.structure.IClassifierPart"}, true, false);
          if (SNodeOperations.isInstanceOf(contextPart, "jetbrains.mps.baseLanguage.classifiers.structure.IClassifier")) {
            return contextPart;
          } else {
            return IClassifierPart_Behavior.call_getMainClassifier_1213877255428(contextPart);
          }
        }

      };
      contextClassifier = (SNode) calc.calculate();
    }
    {
      Calculable calc = new Calculable() {

        public Object calculate() {
          return ListSequence.fromList(SNodeOperations.getAncestorsWhereConceptInList(_context.getParentNode(), new String[]{"jetbrains.mps.baseLanguage.classifiers.structure.IClassifier", "jetbrains.mps.baseLanguage.classifiers.structure.IClassifierPart", "jetbrains.mps.baseLanguage.structure.Classifier"}, true)).count() > 1;
        }

      };
      multipleClassifiers = (Boolean) calc.calculate();
    }
    {
      AbstractConceptDeclaration outputConcept = SModelUtil_new.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.DotExpression", operationContext.getScope());
      SNode childConcept = (SNode) _context.getChildConcept();
      if (SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName((SNode) BaseAdapter.fromAdapter(outputConcept)))) {
        Calculable calc = new Calculable() {

          public Object calculate() {
            return IClassifier_Behavior.call_getMembers_1213877528020(contextClassifier, _context.getParentNode());
          }

        };
        Iterable<SNode> queryResult = (Iterable) calc.calculate();
        if (queryResult != null) {
          for (final SNode item : queryResult) {
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

}
