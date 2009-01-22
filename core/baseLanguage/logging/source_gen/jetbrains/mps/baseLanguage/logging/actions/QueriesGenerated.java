package jetbrains.mps.baseLanguage.logging.actions;

/*Generated by MPS */

import jetbrains.mps.logging.Logger;
import java.util.List;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.action.NodeSubstituteActionsFactoryContext;
import java.util.ArrayList;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.util.Calculable;
import jetbrains.mps.baseLanguage.logging.structure.Severity;
import jetbrains.mps.smodel.action.DefaultChildNodeSubstituteAction;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class QueriesGenerated {
  private static Logger LOG = Logger.getLogger(QueriesGenerated.class);

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_Statement_1167245930434(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.logging.structure.LogStatement");
      SNode childConcept = (SNode)_context.getChildConcept();
      if (SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        Calculable calc = new Calculable() {

          public Object calculate() {
            LOG.info("test info");
            return Severity.getConstants();
          }

        };
        Iterable<Severity> queryResult = (Iterable)calc.calculate();
        if (queryResult != null) {
          for(final Severity item : queryResult) {
            result.add(new DefaultChildNodeSubstituteAction(outputConcept, item, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {

              public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
                SNode logStatement = SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.logging.structure.LogStatement", null);
                SPropertyOperations.set(logStatement, "severity", (item).getValueAsString());
                SLinkOperations.setNewChild(logStatement, "logExpression", "jetbrains.mps.baseLanguage.structure.StringLiteral");
                SNode catchClause = SNodeOperations.getAncestor(_context.getParentNode(), "jetbrains.mps.baseLanguage.structure.CatchClause", true, false);
                if ((catchClause != null) && (SLinkOperations.getTarget(catchClause, "throwable", true) != null)) {
                  SPropertyOperations.set(logStatement, "hasException", "" + (true));
                  SNode lvr = SLinkOperations.setNewChild(logStatement, "exception", "jetbrains.mps.baseLanguage.structure.LocalVariableReference");
                  SLinkOperations.setTarget(lvr, "variableDeclaration", SLinkOperations.getTarget(catchClause, "throwable", true), false);
                }
                return logStatement;
              }

              public String getMatchingText(String pattern) {
                return (item).getValueAsString();
              }

              public String getVisibleMatchingText(String pattern) {
                return this.getMatchingText(pattern);
              }

              public String getDescriptionText(String pattern) {
                return "Log statement";
              }

            });
          }
        }
      }
    }
    return result;
  }

}
