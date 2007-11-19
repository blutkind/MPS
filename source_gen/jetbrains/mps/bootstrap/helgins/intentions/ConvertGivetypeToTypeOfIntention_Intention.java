package jetbrains.mps.bootstrap.helgins.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;

public class ConvertGivetypeToTypeOfIntention_Intention extends BaseIntention implements Intention {

  public String getConcept() {
    return "jetbrains.mps.bootstrap.helgins.structure.GivetypeStatement";
  }

  public boolean isErrorIntention() {
    return false;
  }

  public String getDescription(SNode node, IOperationContext operationContext) {
    return "convert to TYPEOF";
  }

  public boolean isApplicable(SNode node, IOperationContext operationContext) {
    return true;
  }

  public void execute(SNode node, EditorContext editorContext) {
    SNode equationStatement = SModelOperations.createNewNode(SNodeOperations.getModel(node), "jetbrains.mps.bootstrap.helgins.structure.CreateEquationStatement");
    SNode typeOfExpression = SModelOperations.createNewNode(SNodeOperations.getModel(node), "jetbrains.mps.bootstrap.helgins.structure.TypeOfExpression");
    SNode leftTypeClause = SModelOperations.createNewNode(SNodeOperations.getModel(node), "jetbrains.mps.bootstrap.helgins.structure.NormalTypeClause");
    SNode rightTypeClause = SModelOperations.createNewNode(SNodeOperations.getModel(node), "jetbrains.mps.bootstrap.helgins.structure.NormalTypeClause");
    SLinkOperations.setTarget(equationStatement, "leftExpression", leftTypeClause, true);
    SLinkOperations.setTarget(equationStatement, "rightExpression", rightTypeClause, true);
    SLinkOperations.setTarget(leftTypeClause, "normalType", typeOfExpression, true);
    SNode typeExpression = SLinkOperations.getTarget(node, "typeExpression", true);
    SLinkOperations.setTarget(rightTypeClause, "normalType", typeExpression, true);
    SNode termExpression = SLinkOperations.getTarget(node, "termExpression", true);
    SLinkOperations.setTarget(typeOfExpression, "term", termExpression, true);
    SNodeOperations.replaceWithAnother(node, equationStatement);
  }

}
