package jetbrains.mps.lang.editor.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.style.AttributeCalculator;
import java.awt.Color;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.editor.behavior.EditorCellModel_Behavior;

public class CellModel_Constant_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider my_OpenTag6752_0;
  /* package */AbstractCellProvider my_CloseTag6752_0;
  /* package */AbstractCellProvider my_CellModel_Common6752_0;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_6752_0(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCollection_6752_1(context, node);
  }

  public EditorCell createCollection_6752_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setCellId("Collection_6752_0");
    Styles_StyleSheet.getRootCellModelStyle(editorCell).apply(editorCell);
    if (renderingCondition6752_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createComponent_6752_0(context, node));
    }
    editorCell.addEditorCell(this.createProperty_6752_1(context, node));
    if (renderingCondition6752_1(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createComponent_6752_1(context, node));
    }
    return editorCell;
  }

  public EditorCell createCollection_6752_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    editorCell.setCellId("Collection_6752_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createComponent_6752_2(context, node));
    editorCell.addEditorCell(this.createConstant_6752_3(context, node, ""));
    editorCell.addEditorCell(this.createConstant_6752_0(context, node, "Constant cell:"));
    editorCell.addEditorCell(this.createCollection_6752_2(context, node));
    return editorCell;
  }

  public EditorCell createCollection_6752_2(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    editorCell.setCellId("Collection_6752_2");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.DRAW_BORDER, true);
    }
    editorCell.setGridLayout(true);
    editorCell.addEditorCell(this.createCollection_6752_3(context, node));
    editorCell.addEditorCell(this.createCollection_6752_4(context, node));
    return editorCell;
  }

  public EditorCell createCollection_6752_3(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setCellId("Collection_6752_3");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.DRAW_BORDER, true);
    }
    editorCell.addEditorCell(this.createConstant_6752_1(context, node, "text"));
    editorCell.addEditorCell(this.createProperty_6752_3(context, node));
    return editorCell;
  }

  public EditorCell createCollection_6752_4(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setCellId("Collection_6752_4");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.DRAW_BORDER, true);
    }
    editorCell.addEditorCell(this.createConstant_6752_2(context, node, "text*"));
    editorCell.addEditorCell(this.createProperty_6752_5(context, node));
    return editorCell;
  }

  public EditorCell createComponent_6752_0(EditorContext context, SNode node) {
    if (this.my_OpenTag6752_0 == null) {
      this.my_OpenTag6752_0 = new _OpenTag(node);
    }
    EditorCell editorCell = this.my_OpenTag6752_0.createEditorCell(context);
    return editorCell;
  }

  public EditorCell createComponent_6752_1(EditorContext context, SNode node) {
    if (this.my_CloseTag6752_0 == null) {
      this.my_CloseTag6752_0 = new _CloseTag(node);
    }
    EditorCell editorCell = this.my_CloseTag6752_0.createEditorCell(context);
    return editorCell;
  }

  public EditorCell createComponent_6752_2(EditorContext context, SNode node) {
    if (this.my_CellModel_Common6752_0 == null) {
      this.my_CellModel_Common6752_0 = new _CellModel_Common(node);
    }
    EditorCell editorCell = this.my_CellModel_Common6752_0.createEditorCell(context);
    return editorCell;
  }

  public EditorCell createConstant_6752_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_6752_0");
    Styles_StyleSheet.getHeader(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_6752_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_6752_1");
    Styles_StyleSheet.getProperty(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_6752_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_6752_2");
    Styles_StyleSheet.getProperty(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_6752_3(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_6752_3");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createProperty_6752_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    editorCell.setCellId("property_text");
    Styles_StyleSheet.getBordered(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.TEXT_BACKGROUND_COLOR, new AttributeCalculator <Color>() {

        public Color calculate(EditorCell cell) {
          return CellModel_Constant_Editor._StyleParameter_QueryFunction_1221237912391((cell == null ?
            null :
            cell.getSNode()
          ), (cell == null ?
            null :
            cell.getEditorContext()
          ));
        }
      });
      style.set(StyleAttributes.BACKGROUND_COLOR, new AttributeCalculator <Color>() {

        public Color calculate(EditorCell cell) {
          return CellModel_Constant_Editor._StyleParameter_QueryFunction_1221237968304((cell == null ?
            null :
            cell.getSNode()
          ), (cell == null ?
            null :
            cell.getEditorContext()
          ));
        }
      });
      style.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

        public Color calculate(EditorCell cell) {
          return CellModel_Constant_Editor._StyleParameter_QueryFunction_1221237984986((cell == null ?
            null :
            cell.getSNode()
          ), (cell == null ?
            null :
            cell.getEditorContext()
          ));
        }
      });
      style.set(StyleAttributes.FONT_STYLE, new AttributeCalculator <Integer>() {

        public Integer calculate(EditorCell cell) {
          return CellModel_Constant_Editor._StyleParameter_QueryFunction_1221238018498((cell == null ?
            null :
            cell.getSNode()
          ), (cell == null ?
            null :
            cell.getEditorContext()
          ));
        }
      });
      style.set(StyleAttributes.FONT_SIZE, new AttributeCalculator <Integer>() {

        public Integer calculate(EditorCell cell) {
          return CellModel_Constant_Editor._StyleParameter_QueryFunction_1221240468805((cell == null ?
            null :
            cell.getSNode()
          ), (cell == null ?
            null :
            cell.getEditorContext()
          ));
        }
      });
      style.set(StyleAttributes.UNDERLINED, new AttributeCalculator <Boolean>() {

        public Boolean calculate(EditorCell cell) {
          return CellModel_Constant_Editor._StyleParameter_QueryFunction_1221238039415((cell == null ?
            null :
            cell.getSNode()
          ), (cell == null ?
            null :
            cell.getEditorContext()
          ));
        }
      });
      style.set(StyleAttributes.STRIKE_OUT, new AttributeCalculator <Boolean>() {

        public Boolean calculate(EditorCell cell) {
          return CellModel_Constant_Editor._StyleParameter_QueryFunction_1223482212351((cell == null ?
            null :
            cell.getSNode()
          ), (cell == null ?
            null :
            cell.getEditorContext()
          ));
        }
      });
    }
    editorCell.addKeyMap(new _SplitConctantCellIntoWordsKeyMap());
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_6752_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("text");
    provider.setNoTargetText("<constant>");
    provider.setAllowsEmptyTarget(true);
    EditorCell cellWithRole = this.createProperty_6752_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty_6752_2_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    editorCell.setCellId("property_text_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.DRAW_BORDER, true);
      style.set(StyleAttributes.TEXT_BACKGROUND_COLOR, MPSColors.yellow);
      style.set(StyleAttributes.SELECTED_TEXT_BACKGROUND_COLOR, MPSColors.cyan);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_6752_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("text");
    provider.setNoTargetText("<none>");
    provider.setAllowsEmptyTarget(true);
    EditorCell cellWithRole = this.createProperty_6752_2_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty_6752_4_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    editorCell.setCellId("property_nullText");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.DRAW_BORDER, true);
      style.set(StyleAttributes.TEXT_BACKGROUND_COLOR, MPSColors.yellow);
      style.set(StyleAttributes.SELECTED_TEXT_BACKGROUND_COLOR, MPSColors.cyan);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_6752_5(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("nullText");
    provider.setNoTargetText("<none>");
    provider.setAllowsEmptyTarget(true);
    EditorCell cellWithRole = this.createProperty_6752_4_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  public static boolean renderingCondition6752_0(SNode node, EditorContext editorContext, IScope scope) {
    return EditorCellModel_Behavior.call_getOpeningTag_1220340471382(node).length() > 0;
  }

  public static boolean renderingCondition6752_1(SNode node, EditorContext editorContext, IScope scope) {
    return EditorCellModel_Behavior.call_getClosingTag_1220340488560(node).length() > 0;
  }

  public static Color _StyleParameter_QueryFunction_1221237912391(SNode node, EditorContext editorContext) {
    return EditorCellModel_Behavior.call_getTextBackgroundColor_1220972190901(node);
  }

  public static Color _StyleParameter_QueryFunction_1221237968304(SNode node, EditorContext editorContext) {
    return EditorCellModel_Behavior.call_getBackgroundColor_1220969182195(node);
  }

  public static Color _StyleParameter_QueryFunction_1221237984986(SNode node, EditorContext editorContext) {
    return EditorCellModel_Behavior.call_getForegroundColor_1220960215403(node);
  }

  public static int _StyleParameter_QueryFunction_1221238018498(SNode node, EditorContext editorContext) {
    return EditorCellModel_Behavior.call_getFontStyle_1221053923273(node);
  }

  public static boolean _StyleParameter_QueryFunction_1221238039415(SNode node, EditorContext editorContext) {
    return EditorCellModel_Behavior.call_isUnderlined_1221220594206(node);
  }

  public static int _StyleParameter_QueryFunction_1221240468805(SNode node, EditorContext editorContext) {
    return EditorCellModel_Behavior.call_getFontSize_1221216397365(node);
  }

  public static boolean _StyleParameter_QueryFunction_1223482212351(SNode node, EditorContext editorContext) {
    return EditorCellModel_Behavior.call_isStrikeOut_1223390694337(node);
  }

}
