package jetbrains.mps.lang.plugin.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.nodeEditor.cells.EditorCell_Indent;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.nodeEditor.BlockCells;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.style.Padding;
import jetbrains.mps.nodeEditor.style.Measure;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class FileGeneratorDeclaration_Editor extends DefaultNodeEditor {

  /* package */AbstractCellListHandler myListHandler_1227642411211;
  /* package */AbstractCellListHandler myListHandler_1227642411224;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1227642411226(context, node);
  }

  public EditorCell createCollection1227642411187(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12276424111871227642411187(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1227642411188(context, node, "file generator"));
    editorCell.addEditorCell(this.createConstant1227642411189(context, node, "extends"));
    editorCell.addEditorCell(this.createRefCell1227642411190(context, node));
    return editorCell;
  }

  public EditorCell createCollection1227642411210(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_12276424112101227642411210(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createRefNodeList1227642411211(context, node));
    editorCell.addEditorCell(this.createConstant1227642411213(context, node, ""));
    editorCell.addEditorCell(this.createRefNode1227642411215(context, node));
    editorCell.addEditorCell(this.createConstant1227642411216(context, node, ""));
    editorCell.addEditorCell(this.createRefNode1227642411218(context, node));
    editorCell.addEditorCell(this.createConstant1227642411219(context, node, ""));
    editorCell.addEditorCell(this.createRefNode1227642411221(context, node));
    editorCell.addEditorCell(this.createConstant1227642411222(context, node, ""));
    editorCell.addEditorCell(this.createRefNodeList1227642411224(context, node));
    return editorCell;
  }

  public EditorCell createCollection1227642411226(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_12276424112261227642411226(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1227642411227(context, node));
    editorCell.addEditorCell(this.createCollection1227642411230(context, node));
    if (renderingCondition0103_1(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant1227642411654(context, node, "}"));
    }
    return editorCell;
  }

  public EditorCell createCollection1227642411227(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12276424112271227642411227(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1227642411187(context, node));
    if (renderingCondition0103_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant1227642411649(context, node, "{"));
    }
    return editorCell;
  }

  public EditorCell createCollection1227642411230(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12276424112301227642411230(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createIndentCell0103_0(context, node));
    editorCell.addEditorCell(this.createCollection1227642411210(context, node));
    return editorCell;
  }

  public EditorCell createConstant1227642411188(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12276424111881227642411188(editorCell, node, context);
    setupLabel_Constant_1227642411188_1227642411188(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1227642411189(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12276424111891227642411189(editorCell, node, context);
    setupLabel_Constant_1227642411189_1227642411189(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1227642411213(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12276424112131227642411213(editorCell, node, context);
    setupLabel_Constant_1227642411213_1227642411213(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1227642411216(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12276424112161227642411216(editorCell, node, context);
    setupLabel_Constant_1227642411216_1227642411216(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1227642411219(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12276424112191227642411219(editorCell, node, context);
    setupLabel_Constant_1227642411219_1227642411219(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1227642411222(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12276424112221227642411222(editorCell, node, context);
    setupLabel_Constant_1227642411222_1227642411222(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1227642411649(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12276424116491227642411649(editorCell, node, context);
    setupLabel_Constant_1227642411649_1227642411649(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1227642411654(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12276424116541227642411654(editorCell, node, context);
    setupLabel_Constant_1227642411654_1227642411654(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNodeList1227642411211(EditorContext context, SNode node) {
    if (this.myListHandler_1227642411211 == null) {
      this.myListHandler_1227642411211 = new FileGeneratorDeclaration_Editor.fieldListHandler_0103_0(node, "field", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_1227642411211.createCells(context, new CellLayout_Vertical(), false);
    setupBasic_refNodeList_field1227642411211(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.setRole(this.myListHandler_1227642411211.getElementRole());
    return editorCell;
  }

  public EditorCell createRefNodeList1227642411224(EditorContext context, SNode node) {
    if (this.myListHandler_1227642411224 == null) {
      this.myListHandler_1227642411224 = new FileGeneratorDeclaration_Editor.methodListHandler_0103_0(node, "method", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_1227642411224.createCells(context, new CellLayout_Vertical(), false);
    setupBasic_refNodeList_method1227642411224(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.setRole(this.myListHandler_1227642411224.getElementRole());
    return editorCell;
  }

  public EditorCell createIndentCell0103_0(EditorContext context, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(context, node);
    return result;
  }

  public EditorCell createRefCell1227642411190_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new FileGeneratorDeclaration_Editor._Inline0103_0());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refCell_extendedClass1227642411190(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refCell_extendedClass_1227642411190((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefCell1227642411190(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("extendedClass");
    provider.setNoTargetText("<no extendedClass>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefCell1227642411190_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1227642411215_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_generateBlock1227642411215(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_generateBlock_1227642411215((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1227642411215(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("generateBlock");
    provider.setNoTargetText("<no generate block>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1227642411215_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1227642411218_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_isDefaultBlock1227642411218(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_isDefaultBlock_1227642411218((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1227642411218(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("isDefaultBlock");
    provider.setNoTargetText("<no isDefault block>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1227642411218_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1227642411221_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_overridesDefaultBlock1227642411221(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_overridesDefaultBlock_1227642411221((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1227642411221(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("overridesDefaultBlock");
    provider.setNoTargetText("<no overridesDefaultBlock>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1227642411221_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_12276424111871227642411187(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1227642411187");
  }

  private static void setupBasic_Constant_12276424111881227642411188(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1227642411188");
  }

  private static void setupBasic_Constant_12276424111891227642411189(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1227642411189");
  }

  private static void setupBasic_refCell_extendedClass1227642411190(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refCell_extendedClass");
  }

  private static void setupBasic_Collection_12276424112101227642411210(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1227642411210");
  }

  private static void setupBasic_refNodeList_field1227642411211(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_field");
  }

  private static void setupBasic_Constant_12276424112131227642411213(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1227642411213");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNode_generateBlock1227642411215(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_12276424112161227642411216(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1227642411216");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNode_isDefaultBlock1227642411218(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_12276424112191227642411219(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1227642411219");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNode_overridesDefaultBlock1227642411221(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_12276424112221227642411222(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1227642411222");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNodeList_method1227642411224(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_method");
  }

  private static void setupBasic_Collection_12276424112261227642411226(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1227642411226");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_12276424112271227642411227(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1227642411227");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_12276424112301227642411230(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1227642411230");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Indent_12276424112311227642411231(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Indent_1227642411231");
  }

  private static void setupBasic_Constant_12276424116491227642411649(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1227642411649");
    BaseLanguageStyle_StyleSheet.getLeftBrace(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_12276424116541227642411654(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1227642411654");
    BaseLanguageStyle_StyleSheet.getRightBrace(editorCell).apply(editorCell);
  }

  private static void setupLabel_Constant_1227642411188_1227642411188(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1227642411189_1227642411189(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refCell_extendedClass_1227642411190(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNodeList_field_1227642411211(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1227642411213_1227642411213(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_generateBlock_1227642411215(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1227642411216_1227642411216(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_isDefaultBlock_1227642411218(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1227642411219_1227642411219(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_overridesDefaultBlock_1227642411221(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1227642411222_1227642411222(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNodeList_method_1227642411224(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1227642411649_1227642411649(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1227642411654_1227642411654(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition0103_0(SNode node, EditorContext editorContext, IScope scope) {
    return BlockCells.useBraces();
  }

  public static boolean renderingCondition0103_1(SNode node, EditorContext editorContext, IScope scope) {
    return BlockCells.useBraces();
  }

  public static class _Inline0103_0 extends AbstractCellProvider {

    public _Inline0103_0() {
      super();
    }

    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.createProperty1227642411192(context, node);
    }

    public EditorCell createProperty1227642411192_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
      CellProviderWithRole provider = aProvider;
      provider.setAuxiliaryCellProvider(null);
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_property_name1227642411192(editorCell, node, context);
      if (editorCell instanceof EditorCell_Label) {
        setupLabel_property_name_1227642411192((EditorCell_Label)editorCell, node, context);
      }
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell createProperty1227642411192(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      provider.setAllowsEmptyTarget(false);
      EditorCell cellWithRole = this.createProperty1227642411192_internal(context, node, provider);
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if (attributeConcept != null) {
        IOperationContext opContext = context.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
      } else
      return cellWithRole;
    }


    private static void setupBasic_property_name1227642411192(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("property_name");
      {
        Style inlineStyle = new Style(editorCell) {
          {
            this.set(StyleAttributes.PADDING_RIGHT, new Padding(0.0, Measure.SPACES));
          }

        };
        inlineStyle.apply(editorCell);
      }
    }

    private static void setupLabel_property_name_1227642411192(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}
  public static class fieldListHandler_0103_0 extends RefNodeListHandler {

    public fieldListHandler_0103_0(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
    }

    public SNode createNodeToInsert(EditorContext context) {
      SNode listOwner = super.getOwner();
      return NodeFactoryManager.createNode(listOwner, context, super.getElementRole());
    }

    public EditorCell createNodeCell(EditorContext context, SNode elementNode) {
      EditorCell elementCell = super.createNodeCell(context, elementNode);
      this.installElementCellActions(this.getOwner(), elementNode, elementCell, context);
      return elementCell;
    }

    public EditorCell createEmptyCell(EditorContext context) {
      EditorCell emptyCell = null;
      emptyCell = this.createEmptyCell_internal(context, this.getOwner());
      this.installElementCellActions(super.getOwner(), null, emptyCell, context);
      return emptyCell;
    }

    public EditorCell createEmptyCell_internal(EditorContext context, SNode node) {
      return this.createConstant1227642411212(context, node, "");
    }

    public void installElementCellActions(SNode listOwner, SNode elementNode, EditorCell elementCell, EditorContext context) {
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        SNode substituteInfoNode = listOwner;
        if (elementNode != null) {
          substituteInfoNode = elementNode;
          elementCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(elementNode));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultReferenceSubstituteInfo) {
          elementCell.setSubstituteInfo(new DefaultChildSubstituteInfo(listOwner, elementNode, super.getLinkDeclaration(), context));
        }
      }
    }

    public EditorCell createSeparatorCell(EditorContext context) {
      return super.createSeparatorCell(context);
    }

    public EditorCell createConstant1227642411212(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      setupBasic_Constant_12276424112121227642411212(editorCell, node, context);
      setupLabel_Constant_1227642411212_1227642411212(editorCell, node, context);
      editorCell.setDefaultText("<fields>");
      return editorCell;
    }


    private static void setupBasic_Constant_12276424112121227642411212(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("Constant_1227642411212");
    }

    private static void setupLabel_Constant_1227642411212_1227642411212(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}
  public static class methodListHandler_0103_0 extends RefNodeListHandler {

    public methodListHandler_0103_0(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
    }

    public SNode createNodeToInsert(EditorContext context) {
      SNode listOwner = super.getOwner();
      return NodeFactoryManager.createNode(listOwner, context, super.getElementRole());
    }

    public EditorCell createNodeCell(EditorContext context, SNode elementNode) {
      EditorCell elementCell = super.createNodeCell(context, elementNode);
      this.installElementCellActions(this.getOwner(), elementNode, elementCell, context);
      return elementCell;
    }

    public EditorCell createEmptyCell(EditorContext context) {
      EditorCell emptyCell = null;
      emptyCell = this.createEmptyCell_internal(context, this.getOwner());
      this.installElementCellActions(super.getOwner(), null, emptyCell, context);
      return emptyCell;
    }

    public EditorCell createEmptyCell_internal(EditorContext context, SNode node) {
      return this.createConstant1227642411225(context, node, "");
    }

    public void installElementCellActions(SNode listOwner, SNode elementNode, EditorCell elementCell, EditorContext context) {
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        SNode substituteInfoNode = listOwner;
        if (elementNode != null) {
          substituteInfoNode = elementNode;
          elementCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(elementNode));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultReferenceSubstituteInfo) {
          elementCell.setSubstituteInfo(new DefaultChildSubstituteInfo(listOwner, elementNode, super.getLinkDeclaration(), context));
        }
      }
    }

    public EditorCell createSeparatorCell(EditorContext context) {
      return super.createSeparatorCell(context);
    }

    public EditorCell createConstant1227642411225(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      setupBasic_Constant_12276424112251227642411225(editorCell, node, context);
      setupLabel_Constant_1227642411225_1227642411225(editorCell, node, context);
      editorCell.setDefaultText("<methods>");
      return editorCell;
    }


    private static void setupBasic_Constant_12276424112251227642411225(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("Constant_1227642411225");
    }

    private static void setupLabel_Constant_1227642411225_1227642411225(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}

}
