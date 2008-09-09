package jetbrains.mps.xml.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Horizontal;
import jetbrains.mps.nodeEditor.cells.EditorCell_Indent;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.style.AttributeCalculator;
import java.awt.Color;
import jetbrains.mps.nodeEditor.FocusPolicy;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class Element_Editor extends DefaultNodeEditor {

  /* package */AbstractCellListHandler myListHandler_1107867522565;
  /* package */AbstractCellListHandler myListHandler_1107867877446;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1107867292911(context, node);
  }

  public EditorCell createCollection1107867292911(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_11078672929111107867292911(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1107867303147(context, node));
    editorCell.addEditorCell(this.createCollection1107867423219(context, node));
    editorCell.addEditorCell(this.createCollection1107867400971(context, node));
    return editorCell;
  }

  public EditorCell createCollection1107867303147(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11078673031471107867303147(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1107867522561(context, node, "<"));
    editorCell.addEditorCell(this.createProperty1107867522562(context, node));
    editorCell.addEditorCell(this.createRefNodeList1107867877446(context, node));
    editorCell.addEditorCell(this.createConstant1107867877448(context, node, ">"));
    return editorCell;
  }

  public EditorCell createCollection1107867400971(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11078674009711107867400971(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1107867522566(context, node, "</"));
    editorCell.addEditorCell(this.createProperty1107867522567(context, node));
    editorCell.addEditorCell(this.createConstant1107867522568(context, node, ">"));
    return editorCell;
  }

  public EditorCell createCollection1107867423219(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11078674232191107867423219(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createIndentCell3264_0(context, node));
    editorCell.addEditorCell(this.createRefNodeList1107867522565(context, node));
    return editorCell;
  }

  public EditorCell createConstant1107867522561(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11078675225611107867522561(editorCell, node, context);
    setupLabel_Constant_1107867522561_1107867522561(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1107867522566(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11078675225661107867522566(editorCell, node, context);
    setupLabel_Constant_1107867522566_1107867522566(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1107867522568(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11078675225681107867522568(editorCell, node, context);
    setupLabel_Constant_1107867522568_1107867522568(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1107867877448(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11078678774481107867877448(editorCell, node, context);
    setupLabel_Constant_1107867877448_1107867877448(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNodeList1107867522565(EditorContext context, SNode node) {
    if (this.myListHandler_1107867522565 == null) {
      this.myListHandler_1107867522565 = new Element_Editor.contentListHandler_3264_0(node, "content", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_1107867522565.createCells(context, new CellLayout_Vertical(), false);
    setupBasic_refNodeList_content1107867522565(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myListHandler_1107867522565.getElementRole());
    return editorCell;
  }

  public EditorCell createRefNodeList1107867877446(EditorContext context, SNode node) {
    if (this.myListHandler_1107867877446 == null) {
      this.myListHandler_1107867877446 = new Element_Editor.attributeListHandler_3264_0(node, "attribute", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_1107867877446.createCells(context, new CellLayout_Horizontal(), false);
    setupBasic_refNodeList_attribute1107867877446(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myListHandler_1107867877446.getElementRole());
    return editorCell;
  }

  public EditorCell createIndentCell3264_0(EditorContext context, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(context, node);
    return result;
  }

  public EditorCell createProperty1107867522562_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_name1107867522562(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_name_1107867522562((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1107867522562(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty1107867522562_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty1107867522567_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_name1107867522567(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_name_1107867522567((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1107867522567(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty1107867522567_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_11078672929111107867292911(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Collection_1107867292911");
  }

  private static void setupBasic_Collection_11078673031471107867303147(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Collection_1107867303147");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_11078674009711107867400971(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Collection_1107867400971");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_11078674232191107867423219(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Collection_1107867423219");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11078675225611107867522561(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1107867522561");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_property_name1107867522562(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "property_name");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
          this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

            public Color calculate(EditorCell cell) {
              return Element_Editor.calculateColor3264_1(cell);
            }

          });
        }

      };
      inlineStyle.apply(editorCell);
    }
    if (true) {
      editorCell.setFocusPolicy(FocusPolicy.ATTRACTS_FOCUS);
    }
  }

  private static void setupBasic_refNodeList_content1107867522565(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "refNodeList_content");
  }

  private static void setupBasic_Constant_11078675225661107867522566(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1107867522566");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_property_name1107867522567(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "property_name");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
          this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

            public Color calculate(EditorCell cell) {
              return Element_Editor.calculateColor3264_0(cell);
            }

          });
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11078675225681107867522568(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1107867522568");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNodeList_attribute1107867877446(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "refNodeList_attribute");
  }

  private static void setupBasic_Constant_11078678774481107867877448(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1107867877448");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Indent_12209901127731220990112773(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Indent_1220990112773");
  }

  private static void setupLabel_Constant_1107867522561_1107867522561(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_name_1107867522562(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNodeList_content_1107867522565(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1107867522566_1107867522566(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_name_1107867522567(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1107867522568_1107867522568(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNodeList_attribute_1107867877446(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1107867877448_1107867877448(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static Color calculateColor3264_0(EditorCell cell) {
    Color result;
    result = MPSColors.DARK_BLUE;
    return result;
  }

  private static Color calculateColor3264_1(EditorCell cell) {
    Color result;
    result = MPSColors.DARK_BLUE;
    return result;
  }

  public static class contentListHandler_3264_0 extends RefNodeListHandler {

    public contentListHandler_3264_0(SNode ownerNode, String childRole, EditorContext context) {
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
      return this.createConstant1107867877449(context, node, "");
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

    public EditorCell createConstant1107867877449(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      setupBasic_Constant_11078678774491107867877449(editorCell, node, context);
      setupLabel_Constant_1107867877449_1107867877449(editorCell, node, context);
      editorCell.setDefaultText("...");
      return editorCell;
    }


    private static void setupBasic_Constant_11078678774491107867877449(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1107867877449");
      {
        Style inlineStyle = new Style(editorCell) {
          {
            this.set(StyleAttributes.EDITABLE, true);
          }

        };
        inlineStyle.apply(editorCell);
      }
    }

    private static void setupLabel_Constant_1107867877449_1107867877449(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}
  public static class attributeListHandler_3264_0 extends RefNodeListHandler {

    public attributeListHandler_3264_0(SNode ownerNode, String childRole, EditorContext context) {
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
      return this.createConstant1107867877447(context, node, "");
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

    public EditorCell createConstant1107867877447(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      setupBasic_Constant_11078678774471107867877447(editorCell, node, context);
      setupLabel_Constant_1107867877447_1107867877447(editorCell, node, context);
      editorCell.setDefaultText("...");
      return editorCell;
    }


    private static void setupBasic_Constant_11078678774471107867877447(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1107867877447");
      {
        Style inlineStyle = new Style(editorCell) {
          {
            this.set(StyleAttributes.EDITABLE, true);
          }

        };
        inlineStyle.apply(editorCell);
      }
    }

    private static void setupLabel_Constant_1107867877447_1107867877447(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}

}
