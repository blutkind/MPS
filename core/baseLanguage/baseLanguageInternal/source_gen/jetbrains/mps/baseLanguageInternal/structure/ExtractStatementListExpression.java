package jetbrains.mps.baseLanguageInternal.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.baseLanguage.structure.ILocalVariableElementList;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.StatementList;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ExtractStatementListExpression extends Expression implements ILocalVariableElementList {
  public static final String concept = "jetbrains.mps.baseLanguageInternal.structure.ExtractStatementListExpression";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String STMTS = "stmts";
  public static final String INNER_EXPR = "innerExpr";
  public static final String _$ATTRIBUTE = "_$attribute";

  public ExtractStatementListExpression(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(ExtractStatementListExpression.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ExtractStatementListExpression.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ExtractStatementListExpression.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ExtractStatementListExpression.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ExtractStatementListExpression.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ExtractStatementListExpression.VIRTUAL_PACKAGE, value);
  }

  public StatementList getStmts() {
    return (StatementList) this.getChild(StatementList.class, ExtractStatementListExpression.STMTS);
  }

  public void setStmts(StatementList node) {
    super.setChild(ExtractStatementListExpression.STMTS, node);
  }

  public ExtractStatementListInnerExpression getInnerExpr() {
    return (ExtractStatementListInnerExpression) this.getChild(ExtractStatementListInnerExpression.class, ExtractStatementListExpression.INNER_EXPR);
  }

  public void setInnerExpr(ExtractStatementListInnerExpression node) {
    super.setChild(ExtractStatementListExpression.INNER_EXPR, node);
  }

  public int get_$attributesCount() {
    return this.getChildCount(ExtractStatementListExpression._$ATTRIBUTE);
  }

  public Iterator<Attribute> _$attributes() {
    return this.children(Attribute.class, ExtractStatementListExpression._$ATTRIBUTE);
  }

  public List<Attribute> get_$attributes() {
    return this.getChildren(Attribute.class, ExtractStatementListExpression._$ATTRIBUTE);
  }

  public void add_$attribute(Attribute node) {
    this.addChild(ExtractStatementListExpression._$ATTRIBUTE, node);
  }

  public void insert_$attribute(Attribute prev, Attribute node) {
    this.insertChild(prev, ExtractStatementListExpression._$ATTRIBUTE, node);
  }

  public static ExtractStatementListExpression newInstance(SModel sm, boolean init) {
    return (ExtractStatementListExpression) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguageInternal.structure.ExtractStatementListExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ExtractStatementListExpression newInstance(SModel sm) {
    return ExtractStatementListExpression.newInstance(sm, false);
  }
}
