package jetbrains.mps.lang.typesystem.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Type;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class QuickFixArgument extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.lang.typesystem.structure.QuickFixArgument";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String ARGUMENT_TYPE = "argumentType";

  public QuickFixArgument(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(QuickFixArgument.NAME);
  }

  public void setName(String value) {
    this.setProperty(QuickFixArgument.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(QuickFixArgument.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(QuickFixArgument.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(QuickFixArgument.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(QuickFixArgument.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(QuickFixArgument.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(QuickFixArgument.VIRTUAL_PACKAGE, value);
  }

  public Type getArgumentType() {
    return (Type)this.getChild(Type.class, QuickFixArgument.ARGUMENT_TYPE);
  }

  public void setArgumentType(Type node) {
    super.setChild(QuickFixArgument.ARGUMENT_TYPE, node);
  }


  public static QuickFixArgument newInstance(SModel sm, boolean init) {
    return (QuickFixArgument)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.QuickFixArgument", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static QuickFixArgument newInstance(SModel sm) {
    return QuickFixArgument.newInstance(sm, false);
  }

}
