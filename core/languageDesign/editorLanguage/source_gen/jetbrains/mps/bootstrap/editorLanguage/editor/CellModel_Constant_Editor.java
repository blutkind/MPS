package jetbrains.mps.bootstrap.editorLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.AttributeCalculator;
import java.awt.Color;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.bootstrap.editorLanguage.behavior.EditorCellModel_Behavior;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.MPSColors;

public class CellModel_Constant_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider my_OpenTag6752_0;
  /* package */AbstractCellProvider my_CloseTag6752_0;
  /* package */AbstractCellProvider my_CellModel_Common6752_0;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1080742754454(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCollection1080742936930(context, node);
  }

  public EditorCell createCollection1080742754454(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_10807427544541080742754454(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    if (renderingCondition6752_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createComponent1176717068047(context, node));
    }
    editorCell.addEditorCell(this.createProperty1080742871174(context, node));
    if (renderingCondition6752_1(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createComponent1176717088137(context, node));
    }
    return editorCell;
  }

  public EditorCell createCollection1080742936930(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_10807429369301080742936930(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createComponent1214479415172(context, node));
    editorCell.addEditorCell(this.createConstant1214479415173(context, node, ""));
    editorCell.addEditorCell(this.createConstant1080742964963(context, node, "Constant cell:"));
    editorCell.addEditorCell(this.createCollection1080742964964(context, node));
    return editorCell;
  }

  public EditorCell createCollection1080742964964(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_10807429649641080742964964(editorCell, node, context);
    editorCell.setGridLayout(true);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1080742964965(context, node));
    editorCell.addEditorCell(this.createCollection1082639645063(context, node));
    return editorCell;
  }

  public EditorCell createCollection1080742964965(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_10807429649651080742964965(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1080742964966(context, node, "text"));
    editorCell.addEditorCell(this.createProperty1080742964968(context, node));
    return editorCell;
  }

  public EditorCell createCollection1082639645063(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_10826396450631082639645063(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1082639645064(context, node, "text*"));
    editorCell.addEditorCell(this.createProperty1082639645065(context, node));
    return editorCell;
  }

  public EditorCell createComponent1176717068047(EditorContext context, SNode node) {
    if (this.my_OpenTag6752_0 == null) {
      this.my_OpenTag6752_0 = new _OpenTag(node);
    }
    EditorCell editorCell = this.my_OpenTag6752_0.createEditorCell(context);
    setupBasic_component__OpenTag1176717068047(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createComponent1176717088137(EditorContext context, SNode node) {
    if (this.my_CloseTag6752_0 == null) {
      this.my_CloseTag6752_0 = new _CloseTag(node);
    }
    EditorCell editorCell = this.my_CloseTag6752_0.createEditorCell(context);
    setupBasic_component__CloseTag1176717088137(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createComponent1214479415172(EditorContext context, SNode node) {
    if (this.my_CellModel_Common6752_0 == null) {
      this.my_CellModel_Common6752_0 = new _CellModel_Common(node);
    }
    EditorCell editorCell = this.my_CellModel_Common6752_0.createEditorCell(context);
    setupBasic_component__CellModel_Common1214479415172(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createConstant1080742964963(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_10807429649631080742964963(editorCell, node, context);
    setupLabel_Constant_1080742964963_1080742964963(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1080742964966(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_10807429649661080742964966(editorCell, node, context);
    setupLabel_Constant_1080742964966_1080742964966(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1082639645064(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_10826396450641082639645064(editorCell, node, context);
    setupLabel_Constant_1082639645064_1082639645064(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1214479415173(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12144794151731214479415173(editorCell, node, context);
    setupLabel_Constant_1214479415173_1214479415173(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createProperty1080742871174_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_text1080742871174(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_text_1080742871174((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1080742871174(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("text");
    provider.setNoTargetText("<no text>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(true);
    EditorCell cellWithRole = this.createProperty1080742871174_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty1080742964968_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_text1080742964968(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_text_1080742964968((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1080742964968(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("text");
    provider.setNoTargetText("<none>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(true);
    EditorCell cellWithRole = this.createProperty1080742964968_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty1082639645065_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_nullText1082639645065(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_nullText_1082639645065((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1082639645065(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("nullText");
    provider.setNoTargetText("<none>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(true);
    EditorCell cellWithRole = this.createProperty1082639645065_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_10807427544541080742754454(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Collection_1080742754454");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.DRAW_BORDER, new AttributeCalculator <Boolean>() {

            public Boolean calculate(EditorCell cell) {
              return CellModel_Constant_Editor.calculateBoolean6752_9(cell);
            }

          });
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_property_text1080742871174(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "property_text");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.DRAW_BORDER, new AttributeCalculator <Boolean>() {

            public Boolean calculate(EditorCell cell) {
              return CellModel_Constant_Editor.calculateBoolean6752_4(cell);
            }

          });
          this.set(StyleAttributes.TEXT_BACKGROUND_COLOR, new AttributeCalculator <Color>() {

            public Color calculate(EditorCell cell) {
              return CellModel_Constant_Editor.calculateColor6752_4(cell);
            }

          });
          this.set(StyleAttributes.BACKGROUND_COLOR, new AttributeCalculator <Color>() {

            public Color calculate(EditorCell cell) {
              return CellModel_Constant_Editor.calculateColor6752_5(cell);
            }

          });
          this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

            public Color calculate(EditorCell cell) {
              return CellModel_Constant_Editor.calculateColor6752_6(cell);
            }

          });
          this.set(StyleAttributes.FONT_STYLE, new AttributeCalculator <Integer>() {

            public Integer calculate(EditorCell cell) {
              return CellModel_Constant_Editor.calculateFontStyle6752_0(cell);
            }

          });
          this.set(StyleAttributes.FONT_SIZE, new AttributeCalculator <Integer>() {

            public Integer calculate(EditorCell cell) {
              return CellModel_Constant_Editor.calculateFontSize6752_0(cell);
            }

          });
          this.set(StyleAttributes.UNDERLINED, new AttributeCalculator <Boolean>() {

            public Boolean calculate(EditorCell cell) {
              return CellModel_Constant_Editor.calculateUnderlined6752_0(cell);
            }

          });
          this.set(StyleAttributes.STRIKE_OUT, new AttributeCalculator <Boolean>() {

            public Boolean calculate(EditorCell cell) {
              return CellModel_Constant_Editor.calculateBoolean6752_11(cell);
            }

          });
        }

      };
      inlineStyle.apply(editorCell);
    }
    editorCell.addKeyMap(new _SplitConctantCellIntoWordsKeyMap());
  }

  private static void setupBasic_Collection_10807429369301080742936930(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Collection_1080742936930");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, new AttributeCalculator <Boolean>() {

            public Boolean calculate(EditorCell cell) {
              return CellModel_Constant_Editor.calculateBoolean6752_0(cell);
            }

          });
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_10807429649631080742964963(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1080742964963");
    Styles_StyleSheet.getHeader(editorCell).apply(editorCell);
  }

  private static void setupBasic_Collection_10807429649641080742964964(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Collection_1080742964964");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, new AttributeCalculator <Boolean>() {

            public Boolean calculate(EditorCell cell) {
              return CellModel_Constant_Editor.calculateBoolean6752_2(cell);
            }

          });
          this.set(StyleAttributes.DRAW_BORDER, new AttributeCalculator <Boolean>() {

            public Boolean calculate(EditorCell cell) {
              return CellModel_Constant_Editor.calculateBoolean6752_8(cell);
            }

          });
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_10807429649651080742964965(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Collection_1080742964965");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, new AttributeCalculator <Boolean>() {

            public Boolean calculate(EditorCell cell) {
              return CellModel_Constant_Editor.calculateBoolean6752_3(cell);
            }

          });
          this.set(StyleAttributes.DRAW_BORDER, new AttributeCalculator <Boolean>() {

            public Boolean calculate(EditorCell cell) {
              return CellModel_Constant_Editor.calculateBoolean6752_5(cell);
            }

          });
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_10807429649661080742964966(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1080742964966");
    Styles_StyleSheet.getProperty(editorCell).apply(editorCell);
  }

  private static void setupBasic_property_text1080742964968(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "property_text");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.DRAW_BORDER, new AttributeCalculator <Boolean>() {

            public Boolean calculate(EditorCell cell) {
              return CellModel_Constant_Editor.calculateBoolean6752_10(cell);
            }

          });
          this.set(StyleAttributes.TEXT_BACKGROUND_COLOR, new AttributeCalculator <Color>() {

            public Color calculate(EditorCell cell) {
              return CellModel_Constant_Editor.calculateColor6752_1(cell);
            }

          });
          this.set(StyleAttributes.SELECTED_TEXT_BACKGROUND_COLOR, new AttributeCalculator <Color>() {

            public Color calculate(EditorCell cell) {
              return CellModel_Constant_Editor.calculateColor6752_3(cell);
            }

          });
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_10826396450631082639645063(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Collection_1082639645063");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, new AttributeCalculator <Boolean>() {

            public Boolean calculate(EditorCell cell) {
              return CellModel_Constant_Editor.calculateBoolean6752_1(cell);
            }

          });
          this.set(StyleAttributes.DRAW_BORDER, new AttributeCalculator <Boolean>() {

            public Boolean calculate(EditorCell cell) {
              return CellModel_Constant_Editor.calculateBoolean6752_7(cell);
            }

          });
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_10826396450641082639645064(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1082639645064");
    Styles_StyleSheet.getProperty(editorCell).apply(editorCell);
  }

  private static void setupBasic_property_nullText1082639645065(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "property_nullText");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.DRAW_BORDER, new AttributeCalculator <Boolean>() {

            public Boolean calculate(EditorCell cell) {
              return CellModel_Constant_Editor.calculateBoolean6752_6(cell);
            }

          });
          this.set(StyleAttributes.TEXT_BACKGROUND_COLOR, new AttributeCalculator <Color>() {

            public Color calculate(EditorCell cell) {
              return CellModel_Constant_Editor.calculateColor6752_0(cell);
            }

          });
          this.set(StyleAttributes.SELECTED_TEXT_BACKGROUND_COLOR, new AttributeCalculator <Color>() {

            public Color calculate(EditorCell cell) {
              return CellModel_Constant_Editor.calculateColor6752_2(cell);
            }

          });
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_component__OpenTag1176717068047(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "component__OpenTag");
  }

  private static void setupBasic_component__CloseTag1176717088137(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "component__CloseTag");
  }

  private static void setupBasic_component__CellModel_Common1214479415172(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "component__CellModel_Common");
  }

  private static void setupBasic_Constant_12144794151731214479415173(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1214479415173");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.FONT_STYLE, new AttributeCalculator <Integer>() {

            public Integer calculate(EditorCell cell) {
              return CellModel_Constant_Editor.calculateFontStyle6752_1(cell);
            }

          });
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupLabel_property_text_1080742871174(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1080742964963_1080742964963(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1080742964966_1080742964966(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_text_1080742964968(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1082639645064_1082639645064(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_nullText_1082639645065(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1214479415173_1214479415173(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition6752_0(SNode node, EditorContext editorContext, IScope scope) {
    return EditorCellModel_Behavior.call_getOpeningTag_1220340471382(node).length() > 0;
  }

  public static boolean renderingCondition6752_1(SNode node, EditorContext editorContext, IScope scope) {
    return EditorCellModel_Behavior.call_getOpeningTag_1220340471382(node).length() > 0;
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

  private static Integer calculateFontStyle6752_0(EditorCell cell) {
    int result;
    result = CellModel_Constant_Editor._StyleParameter_QueryFunction_1221238018498((cell == null ?
      null :
      cell.getSNode()
    ), (cell == null ?
      null :
      cell.getEditorContext()
    ));
    return result;
  }

  private static Integer calculateFontStyle6752_1(EditorCell cell) {
    int result;
    result = MPSFonts.BOLD;
    return result;
  }

  private static Color calculateColor6752_0(EditorCell cell) {
    Color result;
    result = MPSColors.yellow;
    return result;
  }

  private static Color calculateColor6752_1(EditorCell cell) {
    Color result;
    result = MPSColors.yellow;
    return result;
  }

  private static Color calculateColor6752_2(EditorCell cell) {
    Color result;
    result = MPSColors.cyan;
    return result;
  }

  private static Color calculateColor6752_3(EditorCell cell) {
    Color result;
    result = MPSColors.cyan;
    return result;
  }

  private static Color calculateColor6752_4(EditorCell cell) {
    Color result;
    result = CellModel_Constant_Editor._StyleParameter_QueryFunction_1221237912391((cell == null ?
      null :
      cell.getSNode()
    ), (cell == null ?
      null :
      cell.getEditorContext()
    ));
    return result;
  }

  private static Color calculateColor6752_5(EditorCell cell) {
    Color result;
    result = CellModel_Constant_Editor._StyleParameter_QueryFunction_1221237968304((cell == null ?
      null :
      cell.getSNode()
    ), (cell == null ?
      null :
      cell.getEditorContext()
    ));
    return result;
  }

  private static Color calculateColor6752_6(EditorCell cell) {
    Color result;
    result = CellModel_Constant_Editor._StyleParameter_QueryFunction_1221237984986((cell == null ?
      null :
      cell.getSNode()
    ), (cell == null ?
      null :
      cell.getEditorContext()
    ));
    return result;
  }

  private static Integer calculateFontSize6752_0(EditorCell cell) {
    int result;
    result = CellModel_Constant_Editor._StyleParameter_QueryFunction_1221240468805((cell == null ?
      null :
      cell.getSNode()
    ), (cell == null ?
      null :
      cell.getEditorContext()
    ));
    return result;
  }

  private static boolean calculateUnderlined6752_0(EditorCell cell) {
    boolean result;
    result = CellModel_Constant_Editor._StyleParameter_QueryFunction_1221238039415((cell == null ?
      null :
      cell.getSNode()
    ), (cell == null ?
      null :
      cell.getEditorContext()
    ));
    return result;
  }

  public static Boolean calculateBoolean6752_0(EditorCell cell) {
    boolean result;
    result = false;
    return result;
  }

  public static Boolean calculateBoolean6752_1(EditorCell cell) {
    boolean result;
    result = false;
    return result;
  }

  public static Boolean calculateBoolean6752_2(EditorCell cell) {
    boolean result;
    result = false;
    return result;
  }

  public static Boolean calculateBoolean6752_3(EditorCell cell) {
    boolean result;
    result = false;
    return result;
  }

  public static Boolean calculateBoolean6752_4(EditorCell cell) {
    boolean result;
    result = true;
    return result;
  }

  public static Boolean calculateBoolean6752_5(EditorCell cell) {
    boolean result;
    result = true;
    return result;
  }

  public static Boolean calculateBoolean6752_6(EditorCell cell) {
    boolean result;
    result = true;
    return result;
  }

  public static Boolean calculateBoolean6752_7(EditorCell cell) {
    boolean result;
    result = true;
    return result;
  }

  public static Boolean calculateBoolean6752_8(EditorCell cell) {
    boolean result;
    result = true;
    return result;
  }

  public static Boolean calculateBoolean6752_9(EditorCell cell) {
    boolean result;
    result = true;
    return result;
  }

  public static Boolean calculateBoolean6752_10(EditorCell cell) {
    boolean result;
    result = true;
    return result;
  }

  public static Boolean calculateBoolean6752_11(EditorCell cell) {
    boolean result;
    result = CellModel_Constant_Editor._StyleParameter_QueryFunction_1223482212351((cell == null ?
      null :
      cell.getSNode()
    ), (cell == null ?
      null :
      cell.getEditorContext()
    ));
    return result;
  }

}
