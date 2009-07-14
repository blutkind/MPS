package jetbrains.mps.baseLanguage.closures.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import java.util.LinkedList;
import jetbrains.mps.lang.pattern.util.MatchingUtil;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.baseLanguage.closures.behavior.ClosureLiteral_Behavior;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ClosureLiteral_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_ClosureLiteral_InferenceRule() {
  }

  public void applyRule(final SNode closure, final TypeCheckingContext typeCheckingContext) {
    List<SNode> paramTypes = ListSequence.fromList(new ArrayList<SNode>());
    for(SNode param : SLinkOperations.getTargets(closure, "parameter", true)) {
      if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(param, "type", true), "jetbrains.mps.baseLanguage.structure.WildCardType")) {
        final SNode pt_typevar_1221579075465 = typeCheckingContext.createNewRuntimeTypesVariable();
        {
          SNode _nodeToCheck_1029348928467 = param;
          BaseIntentionProvider intentionProvider = null;
          typeCheckingContext.createEquation((SNode)typeCheckingContext.getEquationManager().getRepresentator(pt_typevar_1221579075465), (SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1221579075470", true), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1221579075466", intentionProvider);
        }
        ListSequence.fromList(paramTypes).addElement(typeCheckingContext.getEquationManager().getRepresentator(pt_typevar_1221579075465));
      } else if ((SLinkOperations.getTarget(param, "type", true) != null)) {
        ListSequence.fromList(paramTypes).addElement(SLinkOperations.getTarget(param, "type", true));
      }
    }
    List<SNode> allRets = ListSequence.fromList(new ArrayList<SNode>());
    List<SNode> allYlds = ListSequence.fromList(new ArrayList<SNode>());
    List<SNode> allYldAlls = ListSequence.fromList(new ArrayList<SNode>());
    List<SNode> allStmts = ListSequence.fromList(new LinkedList<SNode>());
    List<SNode> allThrows = ListSequence.fromList(new ArrayList<SNode>());
    for(SNode c : SNodeOperations.getChildren(SLinkOperations.getTarget(closure, "body", true))) {
      if (SNodeOperations.isInstanceOf(c, "jetbrains.mps.baseLanguage.structure.ReturnStatement")) {
        ListSequence.fromList(allRets).addElement(c);
      } else if (SNodeOperations.isInstanceOf(c, "jetbrains.mps.baseLanguage.closures.structure.YieldStatement")) {
        ListSequence.fromList(allYlds).addElement(c);
      } else if (SNodeOperations.isInstanceOf(c, "jetbrains.mps.baseLanguage.closures.structure.YieldAllStatement")) {
        ListSequence.fromList(allYldAlls).addElement(c);
      } else if (!(SNodeOperations.isInstanceOf(c, "jetbrains.mps.baseLanguage.structure.CommentedStatementsBlock")) && !(SNodeOperations.isInstanceOf(c, "jetbrains.mps.baseLanguage.structure.IStatementListContainer"))) {
        ListSequence.fromList(allStmts).addElement(c);
      }
    }
    while (!(ListSequence.fromList(allStmts).isEmpty())) {
      SNode stmt = ListSequence.fromList(allStmts).removeElementAt(0);
      if (SNodeOperations.isInstanceOf(stmt, "jetbrains.mps.baseLanguage.structure.ReturnStatement")) {
        ListSequence.fromList(allRets).addElement(stmt);
      } else if (SNodeOperations.isInstanceOf(stmt, "jetbrains.mps.baseLanguage.closures.structure.YieldStatement")) {
        ListSequence.fromList(allYlds).addElement(stmt);
      } else if (SNodeOperations.isInstanceOf(stmt, "jetbrains.mps.baseLanguage.closures.structure.YieldAllStatement")) {
        ListSequence.fromList(allYldAlls).addElement(stmt);
      } else
      if (SNodeOperations.isInstanceOf(stmt, "jetbrains.mps.baseLanguage.closures.structure.YieldStatement")) {
        ListSequence.fromList(allYlds).addElement(stmt);
      } else
      {
        if (SNodeOperations.isInstanceOf(stmt, "jetbrains.mps.baseLanguage.structure.ThrowStatement")) {
          final SNode tt_typevar_1221579075612 = typeCheckingContext.createNewRuntimeTypesVariable();
          {
            SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(SNodeOperations.cast(stmt, "jetbrains.mps.baseLanguage.structure.ThrowStatement"), "throwable", true);
            BaseIntentionProvider intentionProvider = null;
            typeCheckingContext.createEquation((SNode)typeCheckingContext.getEquationManager().getRepresentator(tt_typevar_1221579075612), (SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1221579075617", true), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1221579075613", intentionProvider);
          }
          ListSequence.fromList(allThrows).addElement(typeCheckingContext.getEquationManager().getRepresentator(tt_typevar_1221579075612));
        } else
        if (SNodeOperations.isInstanceOf(stmt, "jetbrains.mps.baseLanguage.structure.IMethodCall")) {
          for(SNode thr : ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(SNodeOperations.cast(stmt, "jetbrains.mps.baseLanguage.structure.IMethodCall"), "baseMethodDeclaration", false), "throwsItem", true))) {
            ListSequence.fromList(allThrows).addElement(SNodeOperations.copyNode(thr));
          }
        }
        List<SNode> allChildren = ListSequence.fromList(new LinkedList<SNode>());
        ListSequence.fromList(allChildren).addSequence(ListSequence.fromList(SNodeOperations.getChildren(stmt)));
        while (ListSequence.fromList(allChildren).isNotEmpty()) {
          SNode c = ListSequence.fromList(allChildren).removeElementAt(0);
          if (SNodeOperations.isInstanceOf(c, "jetbrains.mps.baseLanguage.structure.StatementList")) {
            for(SNode cstmt : SLinkOperations.getTargets(SNodeOperations.cast(c, "jetbrains.mps.baseLanguage.structure.StatementList"), "statement", true)) {
              if (!(SNodeOperations.isInstanceOf(cstmt, "jetbrains.mps.baseLanguage.structure.CommentedStatementsBlock")) && !(SNodeOperations.isInstanceOf(cstmt, "jetbrains.mps.baseLanguage.structure.IStatementListContainer"))) {
                ListSequence.fromList(allStmts).addElement(cstmt);
              }
            }
          } else if (!(SNodeOperations.isInstanceOf(c, "jetbrains.mps.baseLanguage.structure.IStatementListContainer"))) {
            ListSequence.fromList(allChildren).addSequence(ListSequence.fromList(SNodeOperations.getChildren(c)));
          }
        }
      }
    }
    final SNode RLCS_typevar_1221579075692 = typeCheckingContext.createNewRuntimeTypesVariable();
    for(SNode rs : allRets) {
      {
        SNode _nodeToCheck_1029348928467 = closure;
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createGreaterThanInequation((SNode)typeCheckingContext.getEquationManager().getRepresentator(RLCS_typevar_1221579075692), (SNode)((SLinkOperations.getTarget(SNodeOperations.cast(rs, "jetbrains.mps.baseLanguage.structure.ReturnStatement"), "expression", true) != null) ?
          typeCheckingContext.typeOf(SLinkOperations.getTarget(SNodeOperations.cast(rs, "jetbrains.mps.baseLanguage.structure.ReturnStatement"), "expression", true), "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1231434118678", true) :
          new _Quotations.QuotationClass_7().createNode(typeCheckingContext)
        ), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1221579075710", false, 0, intentionProvider);
      }
    }
    final SNode YLCS_typevar_1221579075693 = typeCheckingContext.createNewRuntimeTypesVariable();
    for(SNode ys : allYlds) {
      {
        SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(SNodeOperations.cast(ys, "jetbrains.mps.baseLanguage.closures.structure.YieldStatement"), "expression", true);
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createGreaterThanInequation((SNode)typeCheckingContext.getEquationManager().getRepresentator(YLCS_typevar_1221579075693), (SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1221579075728", true), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1221579075724", false, 0, intentionProvider);
      }
    }
    final SNode YALCS_typevar_1229000934873 = typeCheckingContext.createNewRuntimeTypesVariable();
    for(SNode yas : allYldAlls) {
      final SNode elementType_typevar_1229000969704 = typeCheckingContext.createNewRuntimeTypesVariable();
      {
        SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(SNodeOperations.cast(yas, "jetbrains.mps.baseLanguage.closures.structure.YieldAllStatement"), "expression", true);
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createLessThanInequation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1229000996769", true), (SNode)new _Quotations.QuotationClass_4().createNode(typeCheckingContext.getEquationManager().getRepresentator(elementType_typevar_1229000969704), typeCheckingContext.getEquationManager().getRepresentator(elementType_typevar_1229000969704), typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1229000989981", false, 0, intentionProvider);
      }
      {
        SNode _nodeToCheck_1029348928467 = closure;
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createGreaterThanInequation((SNode)typeCheckingContext.getEquationManager().getRepresentator(YALCS_typevar_1229000934873), (SNode)typeCheckingContext.getEquationManager().getRepresentator(elementType_typevar_1229000969704), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1229001090979", false, 0, intentionProvider);
      }
    }
    List<SNode> stmts = SLinkOperations.getTargets(SLinkOperations.getTarget(closure, "body", true), "statement", true);
    SNode lastStmt = (stmts != null && ListSequence.fromList(stmts).count() > 0 ?
      ListSequence.fromList(stmts).getElement(ListSequence.fromList(stmts).count() - 1) :
      null
    );
    boolean returnsValue = !(ListSequence.fromList(allRets).isEmpty());
    boolean returnsFromLast = SNodeOperations.isInstanceOf(lastStmt, "jetbrains.mps.baseLanguage.structure.ExpressionStatement");
    boolean yieldsValue = !(ListSequence.fromList(allYlds).isEmpty());
    switch (ListSequence.fromList(allYldAlls).count()) {
      case 0:
        break;
      case 1:
        if (ListSequence.fromList(allYldAlls).getElement(0) == lastStmt && !(yieldsValue)) {
          returnsValue = true;
          {
            SNode _nodeToCheck_1029348928467 = closure;
            BaseIntentionProvider intentionProvider = null;
            typeCheckingContext.createGreaterThanInequation((SNode)typeCheckingContext.getEquationManager().getRepresentator(RLCS_typevar_1221579075692), (SNode)new _Quotations.QuotationClass_5().createNode(typeCheckingContext.getEquationManager().getRepresentator(YALCS_typevar_1229000934873), typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1229001407669", false, 0, intentionProvider);
          }
          break;
        }
        //  fall through
      default:
        yieldsValue = true;
        {
          SNode _nodeToCheck_1029348928467 = closure;
          BaseIntentionProvider intentionProvider = null;
          typeCheckingContext.createGreaterThanInequation((SNode)typeCheckingContext.getEquationManager().getRepresentator(YLCS_typevar_1221579075693), (SNode)typeCheckingContext.getEquationManager().getRepresentator(YALCS_typevar_1229000934873), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1229010820337", false, 0, intentionProvider);
        }
    }
    final SNode RESULT_typevar_1221579592331 = typeCheckingContext.createNewRuntimeTypesVariable();
    final SNode RETURN_typevar_1232125235963 = typeCheckingContext.createNewRuntimeTypesVariable();
    final SNode TERMINATE_typevar_1232105622932 = typeCheckingContext.createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = closure;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createGreaterThanInequation((SNode)typeCheckingContext.getEquationManager().getRepresentator(RETURN_typevar_1232125235963), (SNode)typeCheckingContext.getEquationManager().getRepresentator(RLCS_typevar_1221579075692), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1232131392781", false, 0, intentionProvider);
    }
    if (returnsFromLast && !(yieldsValue)) {
      {
        SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(SNodeOperations.cast(lastStmt, "jetbrains.mps.baseLanguage.structure.ExpressionStatement"), "expression", true);
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createEquation((SNode)typeCheckingContext.getEquationManager().getRepresentator(TERMINATE_typevar_1232105622932), (SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1232131997253", true), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1232131997249", intentionProvider);
      }
      final SNode RET_AND_TERM_typevar_1232125197501 = typeCheckingContext.createNewRuntimeTypesVariable();
      {
        SNode _nodeToCheck_1029348928467 = closure;
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createGreaterThanInequation((SNode)typeCheckingContext.getEquationManager().getRepresentator(RET_AND_TERM_typevar_1232125197501), (SNode)typeCheckingContext.getEquationManager().getRepresentator(RLCS_typevar_1221579075692), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1232125205435", false, 0, intentionProvider);
      }
      {
        SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(SNodeOperations.cast(lastStmt, "jetbrains.mps.baseLanguage.structure.ExpressionStatement"), "expression", true);
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createGreaterThanInequation((SNode)typeCheckingContext.getEquationManager().getRepresentator(RET_AND_TERM_typevar_1232125197501), (SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1221579075774", true), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1221579075770", false, 0, intentionProvider);
      }
      {
        SNode _nodeToCheck_1029348928467 = closure;
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createEquation((SNode)typeCheckingContext.getEquationManager().getRepresentator(RESULT_typevar_1221579592331), (SNode)typeCheckingContext.getEquationManager().getRepresentator(RET_AND_TERM_typevar_1232125197501), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1221663085197", intentionProvider);
      }
    } else
    {
      {
        SNode _nodeToCheck_1029348928467 = closure;
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createEquation((SNode)typeCheckingContext.getEquationManager().getRepresentator(TERMINATE_typevar_1232105622932), (SNode)new _Quotations.QuotationClass_11().createNode(typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1232131979682", intentionProvider);
      }
      {
        SNode _nodeToCheck_1029348928467 = closure;
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createEquation((SNode)typeCheckingContext.getEquationManager().getRepresentator(RESULT_typevar_1221579592331), (SNode)typeCheckingContext.getEquationManager().getRepresentator(RLCS_typevar_1221579075692), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1221663751995", intentionProvider);
      }
    }
    List<SNode> realThrows = ListSequence.fromList(new ArrayList<SNode>());
with_allThrows:
    for(SNode another : allThrows) {
      for(SNode one : realThrows) {
        if (SNodeOperations.isInstanceOf(one, "jetbrains.mps.baseLanguage.structure.ClassifierType") && SNodeOperations.isInstanceOf(another, "jetbrains.mps.baseLanguage.structure.ClassifierType") && SLinkOperations.getTarget(SNodeOperations.cast(one, "jetbrains.mps.baseLanguage.structure.ClassifierType"), "classifier", false) == SLinkOperations.getTarget(SNodeOperations.cast(another, "jetbrains.mps.baseLanguage.structure.ClassifierType"), "classifier", false)) {
          continue with_allThrows;
        }
        if (MatchingUtil.matchNodes(one, another)) {
          continue with_allThrows;
        }
      }
      ListSequence.fromList(realThrows).addElement(another);
    }
    if (returnsValue && yieldsValue) {
      if (!(false)) {
        BaseIntentionProvider intentionProvider = null;
        IErrorTarget errorTarget = new NodeErrorTarget();
        typeCheckingContext.reportTypeError(closure, "closure must either return or yield value", "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1221579075859", intentionProvider, errorTarget);
      }
    } else
    if ((returnsValue || returnsFromLast) && !(yieldsValue)) {
      {
        SNode _nodeToCheck_1029348928467 = closure;
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1229718156828", true), (SNode)ClosureLiteral_Behavior.call_getType_1229718192182(closure, paramTypes, typeCheckingContext.getEquationManager().getRepresentator(RESULT_typevar_1221579592331), typeCheckingContext.getEquationManager().getRepresentator(RETURN_typevar_1232125235963), typeCheckingContext.getEquationManager().getRepresentator(TERMINATE_typevar_1232105622932), realThrows), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1229718163909", intentionProvider);
      }
    } else
    if (yieldsValue) {
      {
        SNode _nodeToCheck_1029348928467 = closure;
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1229718251100", true), (SNode)ClosureLiteral_Behavior.call_getType_1229718192182(closure, paramTypes, new _Quotations.QuotationClass_14().createNode(typeCheckingContext.getEquationManager().getRepresentator(YLCS_typevar_1221579075693), typeCheckingContext), null, null, realThrows), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1229718256918", intentionProvider);
      }
    } else
    {
      {
        SNode _nodeToCheck_1029348928467 = closure;
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1229718277155", true), (SNode)ClosureLiteral_Behavior.call_getType_1229718192182(closure, paramTypes, new _Quotations.QuotationClass_8().createNode(typeCheckingContext), new _Quotations.QuotationClass_9().createNode(typeCheckingContext), new _Quotations.QuotationClass_10().createNode(typeCheckingContext), realThrows), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1229718281813", intentionProvider);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
