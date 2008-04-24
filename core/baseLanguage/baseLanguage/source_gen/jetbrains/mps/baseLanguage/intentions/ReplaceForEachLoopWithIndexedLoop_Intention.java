package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;

public class ReplaceForEachLoopWithIndexedLoop_Intention extends BaseIntention implements Intention {

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.ForeachStatement";
  }

  public boolean isErrorIntention() {
    return false;
  }

  public String getDescription(SNode node, EditorContext editorContext) {
    return "Replace for each loop with indexed loop";
  }

  public boolean isApplicable(SNode node, EditorContext editorContext) {
    boolean array = SNodeOperations.isInstanceOf(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(node, "iterable", true)), "jetbrains.mps.baseLanguage.structure.ArrayType");
    if (!(array)) {
      return false;
    }
    return true;
  }

  public void execute(SNode node, EditorContext editorContext) {
    final zClosureContext _zClosureContext = new zClosureContext();
    // TODO: expression as iterable - make a variable
    _zClosureContext.iterable = SLinkOperations.getTarget(node, "iterable", true);
    // 
    SNode forStatement = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ForStatement", null);
    // 
    SPropertyOperations.set(forStatement, "label", SPropertyOperations.getString(node, "label"));
    // 
    _zClosureContext.forVariableDeclaration = SLinkOperations.setNewChild(forStatement, "variable", "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration");
    SPropertyOperations.set(_zClosureContext.forVariableDeclaration, "name", "i");
    SLinkOperations.setTarget(_zClosureContext.forVariableDeclaration, "type", new QuotationClass_5().createNode(), true);
    SLinkOperations.setNewChild(_zClosureContext.forVariableDeclaration, "initializer", "jetbrains.mps.baseLanguage.structure.IntegerConstant");
    SPropertyOperations.set(SLinkOperations.getTarget(_zClosureContext.forVariableDeclaration, "initializer", true), "value", "" + (0));
    // 
    SNode forCondition = SLinkOperations.setNewChild(forStatement, "condition", "jetbrains.mps.baseLanguage.structure.LessThanExpression");
    SLinkOperations.setNewChild(forCondition, "leftExpression", "jetbrains.mps.baseLanguage.structure.LocalVariableReference");
    SLinkOperations.setTarget(SLinkOperations.getTarget(forCondition, "leftExpression", true), "variableDeclaration", _zClosureContext.forVariableDeclaration, false);
    SLinkOperations.setNewChild(SLinkOperations.setNewChild(forCondition, "rightExpression", "jetbrains.mps.baseLanguage.structure.DotExpression"), "operation", "jetbrains.mps.baseLanguage.structure.ArrayLengthOperation");
    SLinkOperations.setTarget(SLinkOperations.getTarget(forCondition, "rightExpression", true), "operand", SNodeOperations.copyNode(_zClosureContext.iterable), true);
    // 
    SNode iterationExpr = SLinkOperations.setNewChild(forStatement, "iteration", "jetbrains.mps.baseLanguage.structure.AssignmentExpression");
    SLinkOperations.setNewChild(iterationExpr, "lValue", "jetbrains.mps.baseLanguage.structure.LocalVariableReference");
    SLinkOperations.setTarget(SLinkOperations.getTarget(iterationExpr, "lValue", true), "variableDeclaration", _zClosureContext.forVariableDeclaration, false);
    SLinkOperations.setNewChild(iterationExpr, "rValue", "jetbrains.mps.baseLanguage.structure.PlusExpression");
    SLinkOperations.setTarget(SLinkOperations.getTarget(iterationExpr, "rValue", true), "leftExpression", SNodeOperations.copyNode(SLinkOperations.getTarget(iterationExpr, "lValue", true)), true);
    SLinkOperations.setNewChild(SLinkOperations.getTarget(iterationExpr, "rValue", true), "rightExpression", "jetbrains.mps.baseLanguage.structure.IntegerConstant");
    SPropertyOperations.set(SLinkOperations.getTarget(SLinkOperations.getTarget(iterationExpr, "rValue", true), "rightExpression", true), "value", "" + (1));
    // 
    _zClosureContext.fake_node = node;
    SequenceOperations.forEach(SequenceOperations.where(SNodeOperations.getDescendants(SLinkOperations.getTarget(node, "body", true), null, false), new zPredicate(ReplaceForEachLoopWithIndexedLoop_Intention.this, _zClosureContext)), new zForEach(ReplaceForEachLoopWithIndexedLoop_Intention.this, _zClosureContext));
    SLinkOperations.setTarget(forStatement, "body", SLinkOperations.getTarget(node, "body", true), true);
    // 
    SNodeOperations.replaceWithAnother(node, forStatement);
  }

}
