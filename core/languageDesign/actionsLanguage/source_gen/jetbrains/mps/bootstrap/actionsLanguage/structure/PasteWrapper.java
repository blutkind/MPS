package jetbrains.mps.bootstrap.actionsLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PasteWrapper extends BaseConcept {
  public static final String concept = "jetbrains.mps.bootstrap.actionsLanguage.structure.PasteWrapper";
  public static String SOURCE_CONCEPT = "sourceConcept";
  public static String TARGET_CONCEPT = "targetConcept";
  public static String WRAPPER = "wrapper";

  public PasteWrapper(SNode node) {
    super(node);
  }

  public AbstractConceptDeclaration getSourceConcept() {
    return (AbstractConceptDeclaration)this.getReferent(PasteWrapper.SOURCE_CONCEPT);
  }

  public void setSourceConcept(AbstractConceptDeclaration node) {
    super.setReferent(PasteWrapper.SOURCE_CONCEPT, node);
  }

  public AbstractConceptDeclaration getTargetConcept() {
    return (AbstractConceptDeclaration)this.getReferent(PasteWrapper.TARGET_CONCEPT);
  }

  public void setTargetConcept(AbstractConceptDeclaration node) {
    super.setReferent(PasteWrapper.TARGET_CONCEPT, node);
  }

  public QueryFunction_Wrapper getWrapper() {
    return (QueryFunction_Wrapper)this.getChild(PasteWrapper.WRAPPER);
  }

  public void setWrapper(QueryFunction_Wrapper node) {
    super.setChild(PasteWrapper.WRAPPER, node);
  }


  public static PasteWrapper newInstance(SModel sm, boolean init) {
    return (PasteWrapper)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.actionsLanguage.structure.PasteWrapper", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PasteWrapper newInstance(SModel sm) {
    return PasteWrapper.newInstance(sm, false);
  }

}
