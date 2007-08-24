package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import jetbrains.mps.nodeEditor.MPSColors;
import java.awt.Color;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.ModelAccessor;
import jetbrains.mps.nodeEditor.EditorCell_Property;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.nodeEditor.CellAction_Empty;
import java.util.List;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptPropertyOperations;
import jetbrains.mps.baseLanguage.constraints.ConceptFunction_Behavior;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;

public class ConceptFunction_Editor extends DefaultNodeEditor {

  private static void setupBasic_ConstantCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1180024314807");
    editorCell.setSelectable(false);
  }

  private static void setupBasic_CellModel_ModelAccess(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1180024314810");
    editorCell.setSelectable(true);
    editorCell.setFontType(MPSFonts.ITALIC);
  }

  private static void setupBasic_RowCell2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1180024314809");
    editorCell.setSelectable(false);
  }

  private static void setupBasic_BodyCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1180024314901");
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_RowCell3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1180024314900");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setCellBackgroundColor(ConceptFunction_Editor._QueryFunction_Color_1180024314902(node, context));
  }

  private static void setupBasic_ColumnCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1180024314808");
    editorCell.setSelectable(false);
  }

  private static void setupBasic_RowCell1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1180024314806");
    editorCell.setSelectable(false);
    editorCell.setCellBackgroundColor(ConceptFunction_Editor._QueryFunction_Color_1180024314906(node, context));
  }

  private static void setupBasic_RowCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1180024314805");
  }

  private static void setupLabel_ConstantCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_CellModel_ModelAccess(EditorCell_Label editorCell, SNode node, EditorContext context) {
    editorCell.setEditable(false);
    editorCell.getTextLine().setTextColor(MPSColors.DARK_BLUE);
  }

  private static void setupLabel_BodyCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static Color _QueryFunction_Color_1180024314902(SNode node, EditorContext editorContext) {
    return Color.white;
  }

  public static Color _QueryFunction_Color_1180024314906(SNode node, EditorContext editorContext) {
    return new Color(238, 238, 238);
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createRowCell(context, node);
  }

  public EditorCell createRowCell2(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    ConceptFunction_Editor.setupBasic_RowCell2(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCellModel_ModelAccess(context, node));
    return editorCell;
  }

  public EditorCell createRowCell3(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    ConceptFunction_Editor.setupBasic_RowCell3(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createBodyCell(context, node));
    return editorCell;
  }

  public EditorCell createColumnCell(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    ConceptFunction_Editor.setupBasic_ColumnCell(editorCell, node, context);
    editorCell.setGridLayout(true);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createRowCell2(context, node));
    editorCell.addEditorCell(this.createRowCell3(context, node));
    return editorCell;
  }

  public EditorCell createRowCell1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    ConceptFunction_Editor.setupBasic_RowCell1(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstantCell(context, node, ""));
    editorCell.addEditorCell(this.createColumnCell(context, node));
    return editorCell;
  }

  public EditorCell createRowCell(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    ConceptFunction_Editor.setupBasic_RowCell(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createRowCell1(context, node));
    return editorCell;
  }

  public EditorCell createConstantCell(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    ConceptFunction_Editor.setupBasic_ConstantCell(editorCell, node, context);
    ConceptFunction_Editor.setupLabel_ConstantCell(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createCellModel_ModelAccess(EditorContext context, SNode node) {
    ModelAccessor modelAccessor = this._modelAcessorFactory_1180024314810(context, node);
    EditorCell_Property editorCell = EditorCell_Property.create(context, modelAccessor, node);
    ConceptFunction_Editor.setupBasic_CellModel_ModelAccess(editorCell, node, context);
    ConceptFunction_Editor.setupLabel_CellModel_ModelAccess(editorCell, node, context);
    editorCell.setDefaultText("");
    editorCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
    return editorCell;
  }

  public ModelAccessor _modelAcessorFactory_1180024314810(final EditorContext editorContext, final SNode node) {
    return new ModelAccessor() {

      public String getText() {
        StringBuilder result = new StringBuilder();
        result.append("(");
        List<SNode> parameters = SLinkOperations.getConceptLinkTargets(node, "applicableConceptFunctionParameter");
        ListOperations.addAllElements(parameters, SLinkOperations.getConceptLinkTargets(node, "conceptFunctionParameter"));
        boolean isFirst = true;
        for(SNode cfp : parameters) {
          if(!(isFirst)) {
            result.append(", ");
          }
          isFirst = false;
          result.append(SConceptPropertyOperations.getString(cfp, "alias"));
        }
        result.append(")->");
        SNode expectedReturnType = ConceptFunction_Behavior.call_getExpectedReturnType_1178571276073(node);
        if(expectedReturnType == null) {
          result.append("void");
        } else
        {
          result.append(SPropertyOperations.getString(expectedReturnType, "name"));
        }
        return result.toString();
      }

      public void setText(String text) {
      }

      public boolean isValidText(String text) {
        return this.getText().equals(text);
      }

    };
  }

  public EditorCell createBodyCellinternal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    ConceptFunction_Editor.setupBasic_BodyCell(editorCell, node, context);
    if(editorCell instanceof EditorCell_Label) {
      ConceptFunction_Editor.setupLabel_BodyCell((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createBodyCell(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("body");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createBodyCellinternal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if(attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

}
