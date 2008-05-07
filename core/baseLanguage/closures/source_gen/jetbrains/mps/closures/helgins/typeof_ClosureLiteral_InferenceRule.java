package jetbrains.mps.closures.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import java.util.LinkedList;
import jetbrains.mps.patterns.IMatchingPattern;
import jetbrains.mps.bootstrap.helgins.runtime.HUtil;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ClosureLiteral_InferenceRule implements InferenceRule_Runtime {

  public typeof_ClosureLiteral_InferenceRule() {
  }

  public void applyRule(final SNode closure) {
    List<SNode> paramTypes = new ArrayList<SNode>();
    for(SNode param : SLinkOperations.getTargets(closure, "parameter", true)) {
      if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(param, "type", true), "jetbrains.mps.baseLanguage.structure.WildCardType")) {
        final SNode pt_typevar_1203031819477 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable(false);
        TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getEquationManager().getRepresentator(pt_typevar_1203031819477), TypeChecker.getInstance().getRuntimeSupport().typeOf(param, "jetbrains.mps.closures.helgins", "1203031834114", true), param, null, "jetbrains.mps.closures.helgins", "1203031828846");
        paramTypes.add(TypeChecker.getInstance().getEquationManager().getRepresentator(pt_typevar_1203031819477));
      } else
      {
        paramTypes.add(SLinkOperations.getTarget(param, "type", true));
      }
    }
    List<SNode> allRets = new ArrayList<SNode>();
    List<SNode> allYlds = new ArrayList<SNode>();
    LinkedList<SNode> allStmts = new LinkedList<SNode>();
    for(SNode c : SNodeOperations.getChildren(SLinkOperations.getTarget(closure, "body", true))) {
      if (SNodeOperations.isInstanceOf(c, "jetbrains.mps.baseLanguage.structure.ReturnStatement")) {
        allRets.add(c);
      } else
      if (SNodeOperations.isInstanceOf(c, "jetbrains.mps.closures.structure.YieldStatement")) {
        allYlds.add(c);
      } else
      if (!(SNodeOperations.isInstanceOf(c, "jetbrains.mps.baseLanguage.structure.CommentedStatementsBlock")) && !(SNodeOperations.isInstanceOf(c, "jetbrains.mps.baseLanguage.structure.IStatementListContainer"))) {
        allStmts.addLast(c);
      }
    }
    while(!(allStmts.isEmpty())) {
      SNode stmt = allStmts.removeFirst();
      if (SNodeOperations.isInstanceOf(stmt, "jetbrains.mps.baseLanguage.structure.ReturnStatement")) {
        allRets.add(stmt);
      } else
      if (SNodeOperations.isInstanceOf(stmt, "jetbrains.mps.closures.structure.YieldStatement")) {
        allYlds.add(stmt);
      } else
      {
        for(SNode c : SNodeOperations.getChildren(stmt)) {
          if (SNodeOperations.isInstanceOf(c, "jetbrains.mps.baseLanguage.structure.StatementList")) {
            for(SNode cstmt : SLinkOperations.getTargets(c, "statement", true)) {
              if (!(SNodeOperations.isInstanceOf(cstmt, "jetbrains.mps.baseLanguage.structure.CommentedStatementsBlock")) && !(SNodeOperations.isInstanceOf(cstmt, "jetbrains.mps.baseLanguage.structure.IStatementListContainer"))) {
                allStmts.addLast(cstmt);
              }
            }
          }
        }
      }
    }
    final SNode RLCS_typevar_1199621958531 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable(false);
    final SNode YLCS_typevar_1200831610156 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable(false);
    boolean returnsValue = !(allRets.isEmpty());
    boolean yieldsValue = !(allYlds.isEmpty());
    for(SNode rs : allRets) {
      TypeChecker.getInstance().getRuntimeSupport().createGreaterThanInequation(TypeChecker.getInstance().getEquationManager().getRepresentator(RLCS_typevar_1199621958531), TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(rs, "expression", true), "jetbrains.mps.closures.helgins", "1199622037643", true), SLinkOperations.getTarget(rs, "expression", true), null, "jetbrains.mps.closures.helgins", "1199622013511", false);
    }
    for(SNode ys : allYlds) {
      TypeChecker.getInstance().getRuntimeSupport().createGreaterThanInequation(TypeChecker.getInstance().getEquationManager().getRepresentator(YLCS_typevar_1200831610156), TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(ys, "expression", true), "jetbrains.mps.closures.helgins", "1200831650975", true), SLinkOperations.getTarget(ys, "expression", true), null, "jetbrains.mps.closures.helgins", "1200831646309", false);
    }
    List<SNode> stmts = SLinkOperations.getTargets(SLinkOperations.getTarget(closure, "body", true), "statement", true);
    SNode lastStmt = (stmts != null && stmts.size() > 0 ?
      stmts.get(stmts.size() - 1) :
      null
    );
    if (SNodeOperations.isInstanceOf(lastStmt, "jetbrains.mps.baseLanguage.structure.ExpressionStatement")) {
      TypeChecker.getInstance().getRuntimeSupport().createGreaterThanInequation(TypeChecker.getInstance().getEquationManager().getRepresentator(RLCS_typevar_1199621958531), TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(lastStmt, "expression", true), "jetbrains.mps.closures.helgins", "1199622127027", true), SLinkOperations.getTarget(lastStmt, "expression", true), null, "jetbrains.mps.closures.helgins", "1199622121009", false);
      returnsValue = true;
    }
    if (returnsValue && yieldsValue) {
      if (!(false)) {
        TypeChecker.getInstance().reportTypeError(closure, "closure must either return or yield value", "jetbrains.mps.closures.helgins", "1200831719690");
      }
    } else
    if (returnsValue) {
      /*
        {
          IMatchingPattern pattern_1201519259737 = HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.ClassifierType");
          SNode coercedNode_1201519251382 = TypeChecker.getInstance().getRuntimeSupport().coerce(TypeChecker.getInstance().getEquationManager().getRepresentator(RLCS_typevar_1199621958531), pattern_1201519259737);
          if (coercedNode_1201519251382 != null) {
            TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getEquationManager().getRepresentator(RLCS_typevar_1199621958531), coercedNode_1201519251382, closure, null, "jetbrains.mps.closures.helgins", "1201519323502");
          }
        }
      */
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(closure, "jetbrains.mps.closures.helgins", "1200829007706", true), new QuotationClass_().createNode(paramTypes, TypeChecker.getInstance().getEquationManager().getRepresentator(RLCS_typevar_1199621958531)), closure, null, "jetbrains.mps.closures.helgins", "1200829005839");
    } else
    if (yieldsValue) {
      /*
        {
          IMatchingPattern pattern_1201519344629 = HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.ClassifierType");
          SNode coercedNode_1201519339952 = TypeChecker.getInstance().getRuntimeSupport().coerce(TypeChecker.getInstance().getEquationManager().getRepresentator(YLCS_typevar_1200831610156), pattern_1201519344629);
          if (coercedNode_1201519339952 != null) {
            TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getEquationManager().getRepresentator(YLCS_typevar_1200831610156), coercedNode_1201519339952, closure, null, "jetbrains.mps.closures.helgins", "1201519354283");
          }
        }
      */
      SNode st = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceType", null);
      SLinkOperations.setTarget(st, "elementType", TypeChecker.getInstance().getEquationManager().getRepresentator(YLCS_typevar_1200831610156), true);
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(closure, "jetbrains.mps.closures.helgins", "1201866101391", true), new QuotationClass_2().createNode(paramTypes, st), closure, null, "jetbrains.mps.closures.helgins", "1201866101389");
    } else
    {
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(closure, "jetbrains.mps.closures.helgins", "1200831808767", true), new QuotationClass_1().createNode(paramTypes), closure, null, "jetbrains.mps.closures.helgins", "1200831808765");
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.closures.structure.ClosureLiteral";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
