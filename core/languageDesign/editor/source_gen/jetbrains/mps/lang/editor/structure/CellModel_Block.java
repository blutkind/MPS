package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CellModel_Block extends EditorCellModel {
  public static final String concept = "jetbrains.mps.lang.editor.structure.CellModel_Block";
  public static final String OPEN_BRACE = "openBrace";
  public static final String CLOSE_BRACE = "closeBrace";
  public static final String HEADER = "header";
  public static final String BODY = "body";

  public CellModel_Block(SNode node) {
    super(node);
  }

  public String getOpenBrace() {
    return this.getProperty(CellModel_Block.OPEN_BRACE);
  }

  public void setOpenBrace(String value) {
    this.setProperty(CellModel_Block.OPEN_BRACE, value);
  }

  public String getCloseBrace() {
    return this.getProperty(CellModel_Block.CLOSE_BRACE);
  }

  public void setCloseBrace(String value) {
    this.setProperty(CellModel_Block.CLOSE_BRACE, value);
  }

  public EditorCellModel getHeader() {
    return (EditorCellModel)this.getChild(CellModel_Block.HEADER);
  }

  public void setHeader(EditorCellModel node) {
    super.setChild(CellModel_Block.HEADER, node);
  }

  public EditorCellModel getBody() {
    return (EditorCellModel)this.getChild(CellModel_Block.BODY);
  }

  public void setBody(EditorCellModel node) {
    super.setChild(CellModel_Block.BODY, node);
  }


  public static CellModel_Block newInstance(SModel sm, boolean init) {
    return (CellModel_Block)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.CellModel_Block", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CellModel_Block newInstance(SModel sm) {
    return CellModel_Block.newInstance(sm, false);
  }

}
