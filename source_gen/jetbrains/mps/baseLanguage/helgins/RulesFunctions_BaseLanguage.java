package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import java.util.List;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;

public class RulesFunctions_BaseLanguage {

  public static void comparisonOp(SNode binOp) {
    TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(binOp, "rightExpression", true)), SLinkOperations.getTarget(new QuotationClass_26().createNode(), "descriptor", false), SLinkOperations.getTarget(binOp, "rightExpression", true), null, "jetbrains.mps.baseLanguage.helgins", "1176897142200");
    TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(binOp, "leftExpression", true)), SLinkOperations.getTarget(new QuotationClass_27().createNode(), "descriptor", false), SLinkOperations.getTarget(binOp, "leftExpression", true), null, "jetbrains.mps.baseLanguage.helgins", "1176897185023");
    TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_28().createNode(), binOp);
  }
  public static void numericOp(SNode binOp) {
    TypeChecker.getInstance().getRuntimeSupport().check(SLinkOperations.getTarget(binOp, "leftExpression", true));
    TypeChecker.getInstance().getRuntimeSupport().check(SLinkOperations.getTarget(binOp, "rightExpression", true));
    SNode rightExpressionType = TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(binOp, "rightExpression", true));
    SNode leftExpressionType = TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(binOp, "leftExpression", true));
    TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(rightExpressionType, SLinkOperations.getTarget(new QuotationClass_29().createNode(), "descriptor", false), SLinkOperations.getTarget(binOp, "rightExpression", true), null, "jetbrains.mps.baseLanguage.helgins", "1176908856117");
    TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(leftExpressionType, SLinkOperations.getTarget(new QuotationClass_30().createNode(), "descriptor", false), SLinkOperations.getTarget(binOp, "leftExpression", true), null, "jetbrains.mps.baseLanguage.helgins", "1176908902743");
    TypeChecker.getInstance().getRuntimeSupport().givetype(Queries.getBinaryOperationType(leftExpressionType, rightExpressionType), binOp);
  }
  public static Iterable<SNode> collectReturnStatements(SNode node) {
    Iterable<SNode> returnStatements = SequenceOperations.map(SNodeOperations.getChildren(node), new zMapper(null, null));
    return returnStatements;
  }
  public static SNode computeLeastCommonSupertype(SNode exprWithType, SNode currentLeastCommonSupertype, SNode defaultSupertype) {
    SNode exprType = TypeChecker.getInstance().getRuntimeSupport().typeOf(exprWithType);
    if(exprType == null) {
      TypeChecker.getInstance().reportTypeError(exprWithType, "no type");
      return currentLeastCommonSupertype;
    }
    if((defaultSupertype != null) && !(TypeChecker.getInstance().getSubtypingManager().isSubtype(exprType, defaultSupertype))) {
      TypeChecker.getInstance().reportTypeError(exprWithType, "" + defaultSupertype + " is expected");
      return currentLeastCommonSupertype;
    }
    if(currentLeastCommonSupertype == null) {
      return exprType;
    }
    if(TypeChecker.getInstance().getSubtypingManager().isSubtype(currentLeastCommonSupertype, exprType)) {
      return exprType;
    }
    if(TypeChecker.getInstance().getSubtypingManager().isSubtype(exprType, currentLeastCommonSupertype)) {
      return currentLeastCommonSupertype;
    }
    TypeChecker.getInstance().reportTypeError(exprWithType, "type " + exprType + " is not compatible with infered " + currentLeastCommonSupertype);
    return currentLeastCommonSupertype;
  }
  public static SNode concreteTypeFromGenericType(SNode type, SNode genericClassifier, SNode instanceType) {
    SNode returnType = SNodeOperations.copyNode(type);
    {
      Pattern_1 pattern_1181217694220 = new Pattern_1(genericClassifier);
      SNode coercedNode_1181217694219 = TypeChecker.getInstance().getRuntimeSupport().coerce(instanceType, pattern_1181217694220);
      if(coercedNode_1181217694219 != null) {
        List<SNode> actualParams = pattern_1181217694220.PatternVar;
        for(SNode child : SNodeOperations.getDescendants(returnType, null, true)) {
          if(SNodeOperations.isInstanceOf(child, "jetbrains.mps.baseLanguage.structure.TypeVariableReference")) {
            SNode tvr = child;
            SNode tvd = SLinkOperations.getTarget(tvr, "typeVariableDeclaration", false);
            int index = ListOperations.indexOf(SLinkOperations.getTargets(genericClassifier, "typeVariableDeclaration", true), tvd);
            SNode actualParam = (index < actualParams.size() ?
              actualParams.get(index) :
              new QuotationClass_31().createNode()
            );
            if(returnType == tvr) {
              returnType = SNodeOperations.copyNode(actualParam, TypeChecker.getInstance().getRuntimeTypesModel());
            } else
            {
              // in this code the 'tvr' is not necessarily *child* of the 'returnType'.
              // in this case the replaceChild(old,new) fails with assertion.
              // new code is safe but might be not correct
              // returnType . replaceChild ( tvr , actualParam . copy ) ;
              SNodeOperations.replaceWithAnother(tvr, SNodeOperations.copyNode(actualParam));
            }
          }
        }
      }
    }
    return returnType;
  }
}
