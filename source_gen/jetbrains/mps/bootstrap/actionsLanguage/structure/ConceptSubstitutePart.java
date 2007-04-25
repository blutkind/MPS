package jetbrains.mps.bootstrap.actionsLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration;
import java.util.Iterator;
import java.util.List;

public class ConceptSubstitutePart extends NodeBuilderPart {
  public static String CONCEPT = "concept";
  public static String PART = "part";

  public ConceptSubstitutePart(SNode node) {
    super(node);
  }

  public static ConceptSubstitutePart newInstance(SModel sm, boolean init) {
    return (ConceptSubstitutePart)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.actionsLanguage.ConceptPart", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static ConceptSubstitutePart newInstance(SModel sm) {
    return newInstance(sm, false);
  }

  public ConceptDeclaration getConcept() {
    return (ConceptDeclaration)this.getReferent(CONCEPT);
  }
  public void setConcept(ConceptDeclaration node) {
    super.setReferent(CONCEPT, node);
  }
  public int getPartsCount() {
    return this.getChildCount(PART);
  }
  public Iterator<SubstituteMenuPart> parts() {
    return this.children(PART);
  }
  public List<SubstituteMenuPart> getParts() {
    return this.getChildren(PART);
  }
  public void addPart(SubstituteMenuPart node) {
    this.addChild(PART, node);
  }
  public void insertPart(SubstituteMenuPart prev, SubstituteMenuPart node) {
    this.insertChild(prev, PART, node);
  }
}
