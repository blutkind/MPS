package jetbrains.mps.baseLanguage.closures.generator.baseLanguage.template.helper;

/*Generated by MPS */

import jetbrains.mps.generator.template.ITemplateGenerator;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.ArrayList;
import jetbrains.mps.generator.template.TemplateQueryContext;

public class PrepStatementUtil {

  private PrepStatementUtil.Context ctx;
  private ITemplateGenerator generator;

  private PrepStatementUtil(ITemplateGenerator generator) {
    this.ctx = new PrepStatementUtil.Context();
    this.generator = generator;
  }

  private void prepTopStatementList(SNode slist) {
    int beginLabel = this.ctx.label;
    int endLabel = this.ctx.incrementLabel();
    putPrepData(slist, new Integer[]{beginLabel,endLabel}, this.generator);
    this.prepStatementList(slist);
  }

  private int prepStatementList(SNode slist) {
    boolean labelAutoIncremented = true;
    int label = this.ctx.incrementLabel();
    for(SNode stmt : SLinkOperations.getTargets(slist, "statement", true)) {
      if (!(labelAutoIncremented) && StatementListUtil.isControlStatement(stmt)) {
        label = this.ctx.incrementLabel();
      }
      labelAutoIncremented = StatementListUtil.isControlStatement(stmt);
      label = this.prepStatement(stmt, label);
    }
    return label;
  }

  private int prepStatement(SNode stmt, int label) {
    if (SNodeOperations.isInstanceOf(stmt, "jetbrains.mps.baseLanguage.structure.WhileStatement")) {
      return this.prepWhileStatement(stmt, label);
    } else
    if (SNodeOperations.isInstanceOf(stmt, "jetbrains.mps.baseLanguage.structure.DoWhileStatement")) {
      return this.prepDoWhileStatement(stmt, label);
    } else
    if (SNodeOperations.isInstanceOf(stmt, "jetbrains.mps.baseLanguage.structure.ForStatement")) {
      return this.prepForStatement(stmt, label);
    } else
    if (SNodeOperations.isInstanceOf(stmt, "jetbrains.mps.baseLanguage.structure.ForeachStatement")) {
      return this.prepForeachStatement(stmt, label);
    } else
    if (SNodeOperations.isInstanceOf(stmt, "jetbrains.mps.baseLanguage.structure.IfStatement")) {
      return this.prepIfStatement(stmt, label);
    } else
    if (SNodeOperations.isInstanceOf(stmt, "jetbrains.mps.baseLanguage.structure.SwitchStatement")) {
      return this.prepSwitchStatement(stmt, label);
    } else
    if (SNodeOperations.isInstanceOf(stmt, "jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement")) {
      return this.prepLocalvariableDeclarationStatement(stmt, label);
    } else
    if (SNodeOperations.isInstanceOf(stmt, "jetbrains.mps.baseLanguage.closures.structure.YieldStatement")) {
      return this.prepYieldStatement(stmt, label);
    } else
    if (SNodeOperations.isInstanceOf(stmt, "jetbrains.mps.baseLanguage.structure.BreakStatement")) {
      this.prepBreakStatement(stmt);
    } else
    if (SNodeOperations.isInstanceOf(stmt, "jetbrains.mps.baseLanguage.structure.ContinueStatement")) {
      this.prepContinueStatement(stmt);
    } else
    if (SNodeOperations.isInstanceOf(stmt, "jetbrains.mps.baseLanguage.structure.BlockStatement")) {
      return this.prepBlockStatement(stmt, label);
    }
    return label;
  }

  private int prepWhileStatement(SNode wstmt, int label) {
    int beginLabel = label;
    int blockLabel = this.ctx.incrementLabel();
    putPrepData(SLinkOperations.getTarget(wstmt, "body", true), new Integer[]{blockLabel,beginLabel}, this.generator);
    this.prepStatementList(SLinkOperations.getTarget(wstmt, "body", true));
    int nextLabel = this.calcNextLabel(wstmt);
    putPrepData(wstmt, new Integer[]{beginLabel,beginLabel,blockLabel,nextLabel}, this.generator);
    return nextLabel;
  }

  private int prepDoWhileStatement(SNode dwstmt, int label) {
    int beginLabel = label;
    int condLabel = this.ctx.incrementLabel();
    putPrepData(SLinkOperations.getTarget(dwstmt, "body", true), new Integer[]{beginLabel,condLabel}, this.generator);
    int nextLabel = this.calcNextLabel(dwstmt);
    putPrepData(dwstmt, new Integer[]{beginLabel,condLabel,nextLabel}, this.generator);
    this.prepStatementList(SLinkOperations.getTarget(dwstmt, "body", true));
    return nextLabel;
  }

  private int prepForStatement(SNode fstmt, int label) {
    int beginLabel = label;
    this.prepLocalVariableDeclaration(SLinkOperations.getTarget(fstmt, "variable", true));
    int condLabel = this.ctx.incrementLabel();
    int blockLabel = this.ctx.incrementLabel();
    int postLabel = this.ctx.incrementLabel();
    putPrepData(SLinkOperations.getTarget(fstmt, "body", true), new Integer[]{blockLabel,postLabel}, this.generator);
    int nextLabel = this.calcNextLabel(fstmt);
    putPrepData(fstmt, new Integer[]{beginLabel,postLabel,blockLabel,condLabel,nextLabel}, this.generator);
    this.prepStatementList(SLinkOperations.getTarget(fstmt, "body", true));
    return nextLabel;
  }

  private int prepForeachStatement(SNode fstmt, int label) {
    int beginLabel = label;
    this.prepLocalVariableDeclaration(SLinkOperations.getTarget(fstmt, "variable", true));
    int condLabel = this.ctx.incrementLabel();
    int blockLabel = this.ctx.incrementLabel();
    putPrepData(SLinkOperations.getTarget(fstmt, "body", true), new Integer[]{blockLabel,condLabel}, this.generator);
    int nextLabel = this.calcNextLabel(fstmt);
    putPrepData(fstmt, new Integer[]{beginLabel,condLabel,blockLabel,nextLabel}, this.generator);
    this.prepStatementList(SLinkOperations.getTarget(fstmt, "body", true));
    return nextLabel;
  }

  private int prepIfStatement(SNode ifstmt, int label) {
    int beginLabel = label;
    int ifTrueLabel = this.ctx.incrementLabel();
    int ifFalseLabel = -1;
    int nextLabel = this.calcNextLabel(ifstmt);
    putPrepData(SLinkOperations.getTarget(ifstmt, "ifTrue", true), new Integer[]{ifTrueLabel,nextLabel}, this.generator);
    this.prepStatementList(SLinkOperations.getTarget(ifstmt, "ifTrue", true));
    if (SLinkOperations.getCount(ifstmt, "elsifClauses") > 0) {
      for(SNode eicls : SLinkOperations.getTargets(ifstmt, "elsifClauses", true)) {
        int tmp = this.ctx.incrementLabel();
        putPrepData(SLinkOperations.getTarget(eicls, "statementList", true), new Integer[]{tmp,nextLabel}, this.generator);
        this.prepStatementList(SLinkOperations.getTarget(eicls, "statementList", true));
        putPrepData(eicls, new Integer[]{tmp}, this.generator);
      }
    }
    if ((SLinkOperations.getTarget(ifstmt, "ifFalseStatement", true) != null)) {
      if (StatementListUtil.isControlStatement(SLinkOperations.getTarget(ifstmt, "ifFalseStatement", true)) || SNodeOperations.isInstanceOf(SLinkOperations.getTarget(ifstmt, "ifFalseStatement", true), "jetbrains.mps.baseLanguage.structure.BlockStatement")) {
        ifFalseLabel = this.ctx.incrementLabel();
      }
    }
    putPrepData(ifstmt, new Integer[]{beginLabel,ifTrueLabel,ifFalseLabel,nextLabel}, this.generator);
    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(ifstmt, "ifFalseStatement", true), "jetbrains.mps.baseLanguage.structure.BlockStatement")) {
      putPrepData(SLinkOperations.getTarget(SLinkOperations.getTarget(ifstmt, "ifFalseStatement", true), "statements", true), new Integer[]{ifFalseLabel,nextLabel}, this.generator);
      this.prepStatementList(SLinkOperations.getTarget(SLinkOperations.getTarget(ifstmt, "ifFalseStatement", true), "statements", true));
    } else
    if ((SLinkOperations.getTarget(ifstmt, "ifFalseStatement", true) != null)) {
      this.prepStatement(SLinkOperations.getTarget(ifstmt, "ifFalseStatement", true), ifFalseLabel);
    }
    return nextLabel;
  }

  private int prepSwitchStatement(SNode sstmt, int label) {
    int beginLabel = label;
    int nextLabel = this.calcNextLabel(sstmt);
    putPrepData(sstmt, new Integer[]{beginLabel,nextLabel}, this.generator);
    int nextCaseLabel = this.ctx.incrementLabel();
    for(SNode scase : SLinkOperations.getTargets(sstmt, "case", true)) {
      int caseLabel = nextCaseLabel;
      nextCaseLabel = this.ctx.incrementLabel();
      if ((SLinkOperations.getTarget(scase, "body", true) != null)) {
        List<SNode> stmts = SLinkOperations.getTargets(SLinkOperations.getTarget(scase, "body", true), "statement", true);
        int endCaseLabel = nextCaseLabel;
        if (ListSequence.fromList(stmts).count() > 0 && SNodeOperations.isInstanceOf(ListSequence.fromList(stmts).getElement(ListSequence.fromList(stmts).count() - 1), "jetbrains.mps.baseLanguage.structure.BreakStatement")) {
          endCaseLabel = nextLabel;
        }
        putPrepData(SLinkOperations.getTarget(scase, "body", true), new Integer[]{caseLabel,endCaseLabel}, this.generator);
        this.prepStatementList(SLinkOperations.getTarget(scase, "body", true));
      }
    }
    if ((SLinkOperations.getTarget(sstmt, "defaultBlock", true) != null)) {
      int defLabel = this.ctx.incrementLabel();
      putPrepData(SLinkOperations.getTarget(sstmt, "defaultBlock", true), new Integer[]{defLabel,nextLabel}, this.generator);
      this.prepStatementList(SLinkOperations.getTarget(sstmt, "defaultBlock", true));
    }
    return nextLabel;
  }

  private int prepYieldStatement(SNode ystmt, int label) {
    int beginLabel = label;
    int nextLabel = this.calcNextLabel(ystmt);
    putPrepData(ystmt, new Integer[]{beginLabel,nextLabel}, this.generator);
    return nextLabel;
  }

  private void prepBreakStatement(SNode bstmt) {
    int brLabel = -1;
    String lbl = SPropertyOperations.getString(bstmt, "label");
    SNode node = bstmt;
    while (((node = SNodeOperations.getAncestorWhereConceptInList(node, new String[]{"jetbrains.mps.baseLanguage.structure.AbstractLoopStatement","jetbrains.mps.baseLanguage.structure.SwitchStatement"}, false, false)) != null)) {
      if (lbl == (SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.AbstractLoopStatement") ?
        SPropertyOperations.getString(node, "label") :
        SPropertyOperations.getString(node, "label")
      )) {
        Integer[] labels = (Integer[])getPrepData(node, this.generator);
        brLabel = labels[labels.length - 1];
        break;
      }
    }
    putPrepData(bstmt, new Integer[]{brLabel}, this.generator);
  }

  private void prepContinueStatement(SNode cstmt) {
    int conLabel = -1;
    String lbl = SPropertyOperations.getString(cstmt, "label");
    SNode node = cstmt;
    while (((node = SNodeOperations.getAncestorWhereConceptInList(node, new String[]{"jetbrains.mps.baseLanguage.structure.AbstractLoopStatement"}, false, false)) != null)) {
      if (lbl == SPropertyOperations.getString(node, "label") || (lbl != null && lbl.equals(SPropertyOperations.getString(node, "label")))) {
        Integer[] labels = (Integer[])getPrepData(node, this.generator);
        conLabel = labels[1];
        break;
      }
    }
    putPrepData(cstmt, new Integer[]{conLabel}, this.generator);
  }

  private int prepBlockStatement(SNode bs, int label) {
    int beginLabel = label;
    int nextLabel = this.calcNextLabel(bs);
    putPrepData(SLinkOperations.getTarget(bs, "statements", true), new Integer[]{beginLabel,nextLabel}, this.generator);
    int tmp = this.prepStatementList(SLinkOperations.getTarget(bs, "statements", true));
    putPrepData(bs, new Integer[]{beginLabel,tmp}, this.generator);
    return tmp;
  }

  private int prepLocalvariableDeclarationStatement(SNode lstmt, int label) {
    int nextLabel = this.ctx.incrementLabel();
    putPrepData(lstmt, label, this.generator);
    this.prepLocalVariableDeclaration(SLinkOperations.getTarget(lstmt, "localVariableDeclaration", true));
    return nextLabel;
  }

  private void prepLocalVariableDeclaration(SNode lvd) {
    String name = "_" + this.ctx.label + "_" + SPropertyOperations.getString(lvd, "name");
    putPrepData(lvd, name, this.generator);
  }

  private int calcNextLabel(SNode cstmt) {
    if (SNodeOperations.isInstanceOf(cstmt, "jetbrains.mps.baseLanguage.structure.IfStatement") && SNodeOperations.isInstanceOf(SNodeOperations.getParent(cstmt), "jetbrains.mps.baseLanguage.structure.IfStatement")) {
      SNode topIfStmt = SNodeOperations.getParent(cstmt);
      while (SNodeOperations.isInstanceOf(SNodeOperations.getParent(topIfStmt), "jetbrains.mps.baseLanguage.structure.IfStatement")) {
        topIfStmt = SNodeOperations.getParent(topIfStmt);
      }
      Integer[] parentLabels = (Integer[])PrepStatementUtil.getPrepData(topIfStmt, this.generator);
      if (parentLabels != null) {
        return parentLabels[parentLabels.length - 1];
      }
    } else if ((SNodeOperations.getNextSibling(cstmt) == null) && SNodeOperations.isInstanceOf(SNodeOperations.getParent(cstmt), "jetbrains.mps.baseLanguage.structure.StatementList")) {
      Integer[] parentLabels = (Integer[])PrepStatementUtil.getPrepData(SNodeOperations.getParent(cstmt), this.generator);
      if (parentLabels != null) {
        return parentLabels[parentLabels.length - 1];
      }
    }
    return this.ctx.incrementLabel();
  }


  public static void prepStatementList(SNode slist, ITemplateGenerator generator) {
    PrepStatementUtil psu = new PrepStatementUtil(generator);
    psu.prepTopStatementList(slist);
  }

  public static void putPrepData(SNode sn, Object data, ITemplateGenerator generator) {
    generator.getGeneratorSessionContext().putStepObject("closure_data_" + ((SNode)sn).getId(), data);
  }

  public static Object getPrepData(SNode sn, ITemplateGenerator generator) {
    return generator.getGeneratorSessionContext().getStepObject("closure_data_" + ((SNode)sn).getId());
  }

  public static void copyPrepData(SNode from, SNode to, ITemplateGenerator generator) {
    copyPrepDataNoRecursion(from, to, generator);
    List<SNode> toDescendants = new ArrayList<SNode>(SNodeOperations.getDescendants(to, null, false));
    int idx = 0;
    for(SNode fromDesc : SNodeOperations.getDescendants(from, null, false)) {
      copyPrepDataNoRecursion(fromDesc, ListSequence.fromList(toDescendants).getElement(idx), generator);
      idx = idx + 1;
    }
  }

  private static void copyPrepDataNoRecursion(SNode from, SNode to, ITemplateGenerator generator) {
    Object data = getPrepData(from, generator);
    if (data != null) {
      putPrepData(to, data, generator);
    }
  }

  public static void setFlag(SNode sn, TemplateQueryContext genContext, Object flag) {
    genContext.putStepObject("flag_" + ((SNode)sn).getId(), flag);
    List<SNode> allFlagged = getAllFlagged(genContext);
    if (allFlagged == null) {
      allFlagged = new ArrayList<SNode>();
      genContext.putStepObject("all_flagged", allFlagged);
    }
    if (!(allFlagged.contains(sn))) {
      ListSequence.fromList(allFlagged).addElement(sn);
    }
  }

  public static Object getFlag(SNode sn, ITemplateGenerator generator) {
    return generator.getGeneratorSessionContext().getStepObject("flag_" + ((SNode)sn).getId());
  }

  public static List<SNode> getAllFlagged(TemplateQueryContext genContext) {
    return (List<SNode>)genContext.getSessionObject("all_flagged");
  }

  private static class Context {

    public int label;

    public Context() {
      this.label = 0;
    }

    public int incrementLabel() {
      this.label = this.label + 1;
      return this.label;
    }

}

}
