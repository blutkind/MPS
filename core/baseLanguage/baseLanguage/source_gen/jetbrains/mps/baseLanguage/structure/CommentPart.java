package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.IMetaLevelChanger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CommentPart extends BaseConcept implements IMetaLevelChanger {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.CommentPart";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";

  public CommentPart(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(CommentPart.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(CommentPart.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(CommentPart.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(CommentPart.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(CommentPart.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(CommentPart.VIRTUAL_PACKAGE, value);
  }

  public static CommentPart newInstance(SModel sm, boolean init) {
    return (CommentPart)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.CommentPart", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CommentPart newInstance(SModel sm) {
    return CommentPart.newInstance(sm, false);
  }
}
