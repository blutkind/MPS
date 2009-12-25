package jetbrains.mps.baseLanguage.builders.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Statement;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.StatementList;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class BuilderStatement extends Statement implements BuilderContainer {
  public static final String concept = "jetbrains.mps.baseLanguage.builders.structure.BuilderStatement";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String BUILDER = "builder";
  public static final String BODY = "body";

  public BuilderStatement(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(BuilderStatement.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(BuilderStatement.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(BuilderStatement.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(BuilderStatement.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(BuilderStatement.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(BuilderStatement.VIRTUAL_PACKAGE, value);
  }

  public Builder getBuilder() {
    return (Builder) this.getChild(Builder.class, BuilderStatement.BUILDER);
  }

  public void setBuilder(Builder node) {
    super.setChild(BuilderStatement.BUILDER, node);
  }

  public StatementList getBody() {
    return (StatementList) this.getChild(StatementList.class, BuilderStatement.BODY);
  }

  public void setBody(StatementList node) {
    super.setChild(BuilderStatement.BODY, node);
  }

  public static BuilderStatement newInstance(SModel sm, boolean init) {
    return (BuilderStatement) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.builders.structure.BuilderStatement", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static BuilderStatement newInstance(SModel sm) {
    return BuilderStatement.newInstance(sm, false);
  }
}
