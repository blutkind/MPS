package jetbrains.mps.lang.typesystem.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.structure.LinkDeclaration;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConceptClauseLinkInfo extends BaseConcept {
  public static final String concept = "jetbrains.mps.lang.typesystem.structure.ConceptClauseLinkInfo";
  public static final String LINK_DECLARATION = "linkDeclaration";
  public static final String TARGET_NODE = "targetNode";
  public static final String CHILD_INDEX = "childIndex";

  public ConceptClauseLinkInfo(SNode node) {
    super(node);
  }

  public LinkDeclaration getLinkDeclaration() {
    return (LinkDeclaration)this.getReferent(LinkDeclaration.class, ConceptClauseLinkInfo.LINK_DECLARATION);
  }

  public void setLinkDeclaration(LinkDeclaration node) {
    super.setReferent(ConceptClauseLinkInfo.LINK_DECLARATION, node);
  }

  public Expression getTargetNode() {
    return (Expression)this.getChild(Expression.class, ConceptClauseLinkInfo.TARGET_NODE);
  }

  public void setTargetNode(Expression node) {
    super.setChild(ConceptClauseLinkInfo.TARGET_NODE, node);
  }

  public Expression getChildIndex() {
    return (Expression)this.getChild(Expression.class, ConceptClauseLinkInfo.CHILD_INDEX);
  }

  public void setChildIndex(Expression node) {
    super.setChild(ConceptClauseLinkInfo.CHILD_INDEX, node);
  }


  public static ConceptClauseLinkInfo newInstance(SModel sm, boolean init) {
    return (ConceptClauseLinkInfo)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.ConceptClauseLinkInfo", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConceptClauseLinkInfo newInstance(SModel sm) {
    return ConceptClauseLinkInfo.newInstance(sm, false);
  }

}
