package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.behavior.ConceptFunction_Behavior;

public class ConceptFunction_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider myConceptFunction_Component3364_0;
  /* package */AbstractCellProvider myCellProvider3364_0;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createComponent1196975582231(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCustom1207577922324(context, node);
  }

  public EditorCell createComponent1196975582231(EditorContext context, SNode node) {
    if (this.myConceptFunction_Component3364_0 == null) {
      this.myConceptFunction_Component3364_0 = new ConceptFunction_Component(node);
    }
    EditorCell editorCell = this.myConceptFunction_Component3364_0.createEditorCell(context);
    setupBasic_component_ConceptFunction_Component1196975582231(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createCustom1207577922324(EditorContext context, SNode node) {
    if (this.myCellProvider3364_0 == null) {
      this.myCellProvider3364_0 = this._cellProviderFactory_1207577922324(node, context);
    }
    EditorCell editorCell = this.myCellProvider3364_0.createEditorCell(context);
    setupBasic_Custom_12075779223241207577922324(editorCell, node, context);
    return editorCell;
  }

  public AbstractCellProvider _cellProviderFactory_1207577922324(final SNode node, final EditorContext editorContext) {
    return new AbstractCellProvider() {

      public EditorCell createEditorCell(EditorContext editorContext) {
        EditorCell_Collection collection = EditorCell_Collection.createVertical(editorContext, node);
        collection.addEditorCell(new EditorCell_Constant(editorContext, node, "Concept function help:"));
        if (SConceptPropertyOperations.getString(SNodeOperations.getConceptDeclaration(node), "shortDescription") != null) {
          collection.addEditorCell(new EditorCell_Constant(editorContext, node, SConceptPropertyOperations.getString(SNodeOperations.getConceptDeclaration(node), "shortDescription")));
        }
        collection.addEditorCell(new EditorCell_Constant(editorContext, node, ""));
        collection.addEditorCell(new EditorCell_Constant(editorContext, node, "Parameter help:"));
        for(SNode cfp : ConceptFunction_Behavior.call_getParameters_1213877374450(node)) {
          String alias = SConceptPropertyOperations.getString(cfp, "alias");
          String description = SConceptPropertyOperations.getString(cfp, "shortDescription");
          if (description == null) {
            description = "<no help. use short_description concept function property to create one>";
          }
          EditorCell_Constant message = new EditorCell_Constant(editorContext, node, alias + " : " + description);
          collection.addEditorCell(message);
        }
        return collection;
      }

    };
  }


  private static void setupBasic_component_ConceptFunction_Component1196975582231(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("component_ConceptFunction_Component");
  }

  private static void setupBasic_Custom_12075779223241207577922324(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Custom_1207577922324");
  }

}
