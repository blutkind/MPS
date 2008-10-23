package jetbrains.mps.lang.findUsages.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AbstractFinderDeclaration extends BaseConcept {
  public static final String concept = "jetbrains.mps.lang.findUsages.structure.AbstractFinderDeclaration";
  public static final String FOR_CONCEPT = "forConcept";
  public static final String IS_APPLICABLE_FUNCTION = "isApplicableFunction";
  public static final String FIND_FUNCTION = "findFunction";
  public static final String SEARCHED_NODES_BLOCK = "searchedNodesBlock";
  public static final String CATEGORIZE_BLOCK = "categorizeBlock";

  public AbstractFinderDeclaration(SNode node) {
    super(node);
  }

  public AbstractConceptDeclaration getForConcept() {
    return (AbstractConceptDeclaration)this.getReferent(AbstractFinderDeclaration.FOR_CONCEPT);
  }

  public void setForConcept(AbstractConceptDeclaration node) {
    super.setReferent(AbstractFinderDeclaration.FOR_CONCEPT, node);
  }

  public IsApplicableBlock getIsApplicableFunction() {
    return (IsApplicableBlock)this.getChild(AbstractFinderDeclaration.IS_APPLICABLE_FUNCTION);
  }

  public void setIsApplicableFunction(IsApplicableBlock node) {
    super.setChild(AbstractFinderDeclaration.IS_APPLICABLE_FUNCTION, node);
  }

  public FindBlock getFindFunction() {
    return (FindBlock)this.getChild(AbstractFinderDeclaration.FIND_FUNCTION);
  }

  public void setFindFunction(FindBlock node) {
    super.setChild(AbstractFinderDeclaration.FIND_FUNCTION, node);
  }

  public SearchedNodesBlock getSearchedNodesBlock() {
    return (SearchedNodesBlock)this.getChild(AbstractFinderDeclaration.SEARCHED_NODES_BLOCK);
  }

  public void setSearchedNodesBlock(SearchedNodesBlock node) {
    super.setChild(AbstractFinderDeclaration.SEARCHED_NODES_BLOCK, node);
  }

  public CategorizeBlock getCategorizeBlock() {
    return (CategorizeBlock)this.getChild(AbstractFinderDeclaration.CATEGORIZE_BLOCK);
  }

  public void setCategorizeBlock(CategorizeBlock node) {
    super.setChild(AbstractFinderDeclaration.CATEGORIZE_BLOCK, node);
  }


  public static AbstractFinderDeclaration newInstance(SModel sm, boolean init) {
    return (AbstractFinderDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.findUsages.structure.AbstractFinderDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AbstractFinderDeclaration newInstance(SModel sm) {
    return AbstractFinderDeclaration.newInstance(sm, false);
  }

}
