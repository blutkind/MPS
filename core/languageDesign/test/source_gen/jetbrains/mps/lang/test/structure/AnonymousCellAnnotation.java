package jetbrains.mps.lang.test.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AnonymousCellAnnotation extends BaseConcept implements INamedConcept, INodeAnnotattion {
  public static final String concept = "jetbrains.mps.lang.test.structure.AnonymousCellAnnotation";
  public static final String CELL_ID = "cellId";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String IS_LAST_POSITION = "isLastPosition";
  public static final String USE_LABEL_SELECTION = "useLabelSelection";
  public static final String CARET_POSITION = "caretPosition";
  public static final String SELECTION_START = "selectionStart";
  public static final String SELECTION_END = "selectionEnd";
  public static final String NODE_RANGE_SELECTION_START = "nodeRangeSelectionStart";
  public static final String NODE_RANGE_SELECTION_END = "nodeRangeSelectionEnd";

  public AnonymousCellAnnotation(SNode node) {
    super(node);
  }

  public String getCellId() {
    return this.getProperty(AnonymousCellAnnotation.CELL_ID);
  }

  public void setCellId(String value) {
    this.setProperty(AnonymousCellAnnotation.CELL_ID, value);
  }

  public String getName() {
    return this.getProperty(AnonymousCellAnnotation.NAME);
  }

  public void setName(String value) {
    this.setProperty(AnonymousCellAnnotation.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(AnonymousCellAnnotation.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(AnonymousCellAnnotation.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(AnonymousCellAnnotation.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(AnonymousCellAnnotation.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(AnonymousCellAnnotation.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(AnonymousCellAnnotation.VIRTUAL_PACKAGE, value);
  }

  public boolean getIsLastPosition() {
    return this.getBooleanProperty(AnonymousCellAnnotation.IS_LAST_POSITION);
  }

  public void setIsLastPosition(boolean value) {
    this.setBooleanProperty(AnonymousCellAnnotation.IS_LAST_POSITION, value);
  }

  public boolean getUseLabelSelection() {
    return this.getBooleanProperty(AnonymousCellAnnotation.USE_LABEL_SELECTION);
  }

  public void setUseLabelSelection(boolean value) {
    this.setBooleanProperty(AnonymousCellAnnotation.USE_LABEL_SELECTION, value);
  }

  public int getCaretPosition() {
    return this.getIntegerProperty(AnonymousCellAnnotation.CARET_POSITION);
  }

  public void setCaretPosition(int value) {
    this.setIntegerProperty(AnonymousCellAnnotation.CARET_POSITION, value);
  }

  public int getSelectionStart() {
    return this.getIntegerProperty(AnonymousCellAnnotation.SELECTION_START);
  }

  public void setSelectionStart(int value) {
    this.setIntegerProperty(AnonymousCellAnnotation.SELECTION_START, value);
  }

  public int getSelectionEnd() {
    return this.getIntegerProperty(AnonymousCellAnnotation.SELECTION_END);
  }

  public void setSelectionEnd(int value) {
    this.setIntegerProperty(AnonymousCellAnnotation.SELECTION_END, value);
  }

  public BaseConcept getNodeRangeSelectionStart() {
    return (BaseConcept)this.getReferent(BaseConcept.class, AnonymousCellAnnotation.NODE_RANGE_SELECTION_START);
  }

  public void setNodeRangeSelectionStart(BaseConcept node) {
    super.setReferent(AnonymousCellAnnotation.NODE_RANGE_SELECTION_START, node);
  }

  public BaseConcept getNodeRangeSelectionEnd() {
    return (BaseConcept)this.getReferent(BaseConcept.class, AnonymousCellAnnotation.NODE_RANGE_SELECTION_END);
  }

  public void setNodeRangeSelectionEnd(BaseConcept node) {
    super.setReferent(AnonymousCellAnnotation.NODE_RANGE_SELECTION_END, node);
  }


  public static AnonymousCellAnnotation newInstance(SModel sm, boolean init) {
    return (AnonymousCellAnnotation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.test.structure.AnonymousCellAnnotation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AnonymousCellAnnotation newInstance(SModel sm) {
    return AnonymousCellAnnotation.newInstance(sm, false);
  }

}
