package jetbrains.mps.bootstrap.smodelLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.AbstractCreator;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SNodeListCreator extends AbstractCreator {
  public static final String concept = "jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListCreator";
  public static String CREATED_TYPE = "createdType";

  public  SNodeListCreator(SNode node) {
    super(node);
  }

  public static SNodeListCreator newInstance(SModel sm, boolean init) {
    return ((SNodeListCreator)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListCreator", sm, GlobalScope.getInstance(), init).getAdapter());
  }

  public static SNodeListCreator newInstance(SModel sm) {
    return SNodeListCreator.newInstance(sm, false);
  }


  public SNodeListType getCreatedType() {
    return ((SNodeListType)this.getChild(SNodeListCreator.CREATED_TYPE));
  }

  public void setCreatedType(SNodeListType node) {
    super.setChild(SNodeListCreator.CREATED_TYPE, node);
  }

}
