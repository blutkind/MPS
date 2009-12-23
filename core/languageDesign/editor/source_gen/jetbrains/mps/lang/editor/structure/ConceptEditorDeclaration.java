package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.lang.structure.structure.IConceptAspect;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConceptEditorDeclaration extends BaseEditorComponent implements INamedConcept, IConceptAspect {
  public static final String concept = "jetbrains.mps.lang.editor.structure.ConceptEditorDeclaration";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String INSPECTED_CELL_MODEL = "inspectedCellModel";

  public ConceptEditorDeclaration(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(ConceptEditorDeclaration.NAME);
  }

  public void setName(String value) {
    this.setProperty(ConceptEditorDeclaration.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(ConceptEditorDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ConceptEditorDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ConceptEditorDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ConceptEditorDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ConceptEditorDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ConceptEditorDeclaration.VIRTUAL_PACKAGE, value);
  }

  public EditorCellModel getInspectedCellModel() {
    return (EditorCellModel) this.getChild(EditorCellModel.class, ConceptEditorDeclaration.INSPECTED_CELL_MODEL);
  }

  public void setInspectedCellModel(EditorCellModel node) {
    super.setChild(ConceptEditorDeclaration.INSPECTED_CELL_MODEL, node);
  }

  public static ConceptEditorDeclaration newInstance(SModel sm, boolean init) {
    return (ConceptEditorDeclaration) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.ConceptEditorDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConceptEditorDeclaration newInstance(SModel sm) {
    return ConceptEditorDeclaration.newInstance(sm, false);
  }
}
