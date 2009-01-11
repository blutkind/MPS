package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Type;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SNodeType extends Type {
  public static final String concept = "jetbrains.mps.lang.smodel.structure.SNodeType";
  public static final String CONCEPT = "concept";

  public SNodeType(SNode node) {
    super(node);
  }

  public AbstractConceptDeclaration getConcept() {
    return (AbstractConceptDeclaration)this.getReferent(AbstractConceptDeclaration.class, SNodeType.CONCEPT);
  }

  public void setConcept(AbstractConceptDeclaration node) {
    super.setReferent(SNodeType.CONCEPT, node);
  }


  public static SNodeType newInstance(SModel sm, boolean init) {
    return (SNodeType)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SNodeType newInstance(SModel sm) {
    return SNodeType.newInstance(sm, false);
  }

}
