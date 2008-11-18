package jetbrains.mps.lang.plugin.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Component;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cells.EditorCell_Image;
import jetbrains.mps.nodeEditor.cells.EditorCell_Indent;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.Padding;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.project.IModule;
import jetbrains.mps.lang.structure.editor.EditorUtil;
import jetbrains.mps.plugins.MacrosUtil;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.nodeEditor.BlockCells;

import javax.swing.JComponent;

public class PreferencePage_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1227014566462(context, node);
  }

  public EditorCell createAlternation1227014566379(EditorContext context, SNode node) {
    boolean alternationCondition = true;
    alternationCondition = PreferencePage_Editor.renderingCondition6322_0(node, context, context.getOperationContext().getScope());
    EditorCell editorCell = null;
    if (alternationCondition) {
      editorCell = this.createCollection1227014566433(context, node);
    } else {
      editorCell = this.createConstant1227014566431(context, node, "<no icon>");
    }
    setupBasic_Alternation_12270145663791227014566379(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createCollection1227014566361(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12270145663611227014566361(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1227014566362(context, node, "page"));
    editorCell.addEditorCell(this.createProperty1227014566363(context, node));
    return editorCell;
  }

  public EditorCell createCollection1227014566365(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_12270145663651227014566365(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1227014566366(context, node));
    editorCell.addEditorCell(this.createCollection1227014566373(context, node));
    editorCell.addEditorCell(this.createConstant1227014566452(context, node, ""));
    editorCell.addEditorCell(this.createRefNode1227014566454(context, node));
    editorCell.addEditorCell(this.createConstant1227014566455(context, node, ""));
    editorCell.addEditorCell(this.createRefNode1227014566457(context, node));
    editorCell.addEditorCell(this.createConstant1227014566458(context, node, ""));
    editorCell.addEditorCell(this.createRefNode1227014566460(context, node));
    return editorCell;
  }

  public EditorCell createCollection1227014566366(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12270145663661227014566366(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1227014566367(context, node, "component"));
    editorCell.addEditorCell(this.createConstant1227014566368(context, node, ":"));
    editorCell.addEditorCell(this.createRefNode1227014566371(context, node));
    return editorCell;
  }

  public EditorCell createCollection1227014566373(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12270145663731227014566373(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1227014566374(context, node, "icon"));
    editorCell.addEditorCell(this.createConstant1227014566376(context, node, ":"));
    editorCell.addEditorCell(this.createAlternation1227014566379(context, node));
    editorCell.addEditorCell(EditorCell_Component.createComponentCell(context, node, PreferencePage_Editor._QueryFunction_JComponent_1227014566444(node, context), "_1227014566443"));
    return editorCell;
  }

  public EditorCell createCollection1227014566433(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12270145664331227014566433(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createImage1227014566434(context, node));
    editorCell.addEditorCell(this.createProperty1227014566441(context, node));
    return editorCell;
  }

  public EditorCell createCollection1227014566462(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_12270145664621227014566462(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1227014566463(context, node));
    editorCell.addEditorCell(this.createCollection1227014566466(context, node));
    if (renderingCondition6322_2(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant1227014567041(context, node, "}"));
    }
    return editorCell;
  }

  public EditorCell createCollection1227014566463(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12270145664631227014566463(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1227014566361(context, node));
    if (renderingCondition6322_1(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant1227014567020(context, node, "{"));
    }
    return editorCell;
  }

  public EditorCell createCollection1227014566466(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12270145664661227014566466(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createIndentCell6322_0(context, node));
    editorCell.addEditorCell(this.createCollection1227014566365(context, node));
    return editorCell;
  }

  public EditorCell createConstant1227014566362(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12270145663621227014566362(editorCell, node, context);
    setupLabel_Constant_1227014566362_1227014566362(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1227014566367(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12270145663671227014566367(editorCell, node, context);
    setupLabel_Constant_1227014566367_1227014566367(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1227014566368(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12270145663681227014566368(editorCell, node, context);
    setupLabel_Constant_1227014566368_1227014566368(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1227014566374(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12270145663741227014566374(editorCell, node, context);
    setupLabel_Constant_1227014566374_1227014566374(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1227014566376(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12270145663761227014566376(editorCell, node, context);
    setupLabel_Constant_1227014566376_1227014566376(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1227014566431(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12270145664311227014566431(editorCell, node, context);
    setupLabel_Constant_1227014566431_1227014566431(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1227014566452(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12270145664521227014566452(editorCell, node, context);
    setupLabel_Constant_1227014566452_1227014566452(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1227014566455(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12270145664551227014566455(editorCell, node, context);
    setupLabel_Constant_1227014566455_1227014566455(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1227014566458(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12270145664581227014566458(editorCell, node, context);
    setupLabel_Constant_1227014566458_1227014566458(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1227014567020(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12270145670201227014567020(editorCell, node, context);
    setupLabel_Constant_1227014567020_1227014567020(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1227014567041(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12270145670411227014567041(editorCell, node, context);
    setupLabel_Constant_1227014567041_1227014567041(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createImage1227014566434(EditorContext context, SNode node) {
    EditorCell_Image editorCell;
    editorCell = EditorCell_Image.createImageCell(context, node, _image_provider_1227014566434(node, context));
    setupBasic_Image_12270145664341227014566434(editorCell, node, context);
    editorCell.setDescent(0);
    return editorCell;
  }

  public EditorCell createIndentCell6322_0(EditorContext context, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(context, node);
    return result;
  }

  public EditorCell createProperty1227014566363_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_name1227014566363(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_name_1227014566363((EditorCell_Label) editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1227014566363(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty1227014566363_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
      return cellWithRole;
  }

  public EditorCell createRefNode1227014566371_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_component1227014566371(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_component_1227014566371((EditorCell_Label) editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1227014566371(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("component");
    provider.setNoTargetText("<no component>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1227014566371_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
      return cellWithRole;
  }

  public EditorCell createProperty1227014566441_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_icon1227014566441(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_icon_1227014566441((EditorCell_Label) editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1227014566441(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("icon");
    provider.setNoTargetText("<no icon>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty1227014566441_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
      return cellWithRole;
  }

  public EditorCell createRefNode1227014566454_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_resetBlock1227014566454(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_resetBlock_1227014566454((EditorCell_Label) editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1227014566454(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("resetBlock");
    provider.setNoTargetText("<is valid>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1227014566454_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
      return cellWithRole;
  }

  public EditorCell createRefNode1227014566457_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_commitBlock1227014566457(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_commitBlock_1227014566457((EditorCell_Label) editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1227014566457(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("commitBlock");
    provider.setNoTargetText("<no commitBlock>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1227014566457_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
      return cellWithRole;
  }

  public EditorCell createRefNode1227014566460_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_isModifiedBlock1227014566460(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_isModifiedBlock_1227014566460((EditorCell_Label) editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1227014566460(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("isModifiedBlock");
    provider.setNoTargetText("<no isModifiedBlock>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1227014566460_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
      return cellWithRole;
  }


  private static void setupBasic_Collection_12270145663611227014566361(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1227014566361");
  }

  private static void setupBasic_Constant_12270145663621227014566362(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1227014566362");
  }

  private static void setupBasic_property_name1227014566363(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_name");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.PADDING_RIGHT, new Padding(0.0, "spaces"));
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_12270145663651227014566365(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1227014566365");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_12270145663661227014566366(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1227014566366");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_12270145663671227014566367(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1227014566367");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_12270145663681227014566368(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1227014566368");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
          this.set(StyleAttributes.LAYOUT_CONSTRAINT, "punctuation");
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNode_component1227014566371(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Collection_12270145663731227014566373(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1227014566373");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_12270145663741227014566374(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1227014566374");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, true);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_12270145663761227014566376(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1227014566376");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
          this.set(StyleAttributes.LAYOUT_CONSTRAINT, "punctuation");
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Alternation_12270145663791227014566379(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Alternation_1227014566379");
  }

  private static void setupBasic_Constant_12270145664311227014566431(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1227014566431");
    BaseLanguageStyle_StyleSheet.getEmptyCell(editorCell).apply(editorCell);
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.TEXT_COLOR, MPSColors.lightGray);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_12270145664331227014566433(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1227014566433");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Image_12270145664341227014566434(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Image_1227014566434");
  }

  private static void setupBasic_property_icon1227014566441(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_icon");
  }

  private static void setupBasic_JComponent_12270145664431227014566443(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("JComponent_1227014566443");
  }

  private static void setupBasic_Constant_12270145664521227014566452(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1227014566452");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNode_resetBlock1227014566454(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_12270145664551227014566455(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1227014566455");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNode_commitBlock1227014566457(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_12270145664581227014566458(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1227014566458");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNode_isModifiedBlock1227014566460(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Collection_12270145664621227014566462(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1227014566462");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_12270145664631227014566463(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1227014566463");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_12270145664661227014566466(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1227014566466");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Indent_12270145664671227014566467(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Indent_1227014566467");
  }

  private static void setupBasic_Constant_12270145670201227014567020(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1227014567020");
    BaseLanguageStyle_StyleSheet.getLeftBrace(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_12270145670411227014567041(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1227014567041");
    BaseLanguageStyle_StyleSheet.getRightBrace(editorCell).apply(editorCell);
  }

  private static void setupLabel_Constant_1227014566362_1227014566362(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_name_1227014566363(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1227014566367_1227014566367(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1227014566368_1227014566368(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_component_1227014566371(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1227014566374_1227014566374(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1227014566376_1227014566376(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1227014566431_1227014566431(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_icon_1227014566441(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1227014566452_1227014566452(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_resetBlock_1227014566454(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1227014566455_1227014566455(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_commitBlock_1227014566457(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1227014566458_1227014566458(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_isModifiedBlock_1227014566460(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1227014567020_1227014567020(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1227014567041_1227014567041(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static String _image_provider_1227014566434(SNode node, EditorContext editorContext) {
    return SPropertyOperations.getString(node, "icon");
  }

  public static boolean renderingCondition6322_0(SNode node, EditorContext editorContext, IScope scope) {
    String path = null;
    IModule module = EditorUtil.findAnchorModule(node);
    if (module != null) {
      path = MacrosUtil.expandPath(SPropertyOperations.getString(node, "icon"), module.getModuleUID());
    }
    return path != null && FileSystem.getFile(path).exists();
  }

  public static boolean renderingCondition6322_1(SNode node, EditorContext editorContext, IScope scope) {
    return BlockCells.useBraces();
  }

  public static boolean renderingCondition6322_2(SNode node, EditorContext editorContext, IScope scope) {
    return BlockCells.useBraces();
  }

  public static JComponent _QueryFunction_JComponent_1227014566444(SNode node, EditorContext editorContext) {
    return EditorUtil.createSelectIconButton(node, "icon", editorContext);
  }

}
