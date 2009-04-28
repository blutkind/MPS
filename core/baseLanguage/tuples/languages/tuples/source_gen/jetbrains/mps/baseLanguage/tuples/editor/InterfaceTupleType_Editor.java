package jetbrains.mps.baseLanguage.tuples.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cells.EditorCell_Property;
import jetbrains.mps.nodeEditor.cells.ModelAccessor;
import jetbrains.mps.internal.collections.runtime.IterableUtils;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.baseLanguage.tuples.constraints.TupleIntefaceUtils;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.lang.core.behavior.BaseConcept_Behavior;
import jetbrains.mps.util.EqualUtil;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_Empty;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Indent;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.ConceptPropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandlerElementKeyMap;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class InterfaceTupleType_Editor extends DefaultNodeEditor {

  /* package */AbstractCellListHandler myListHandler_0883_0;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_0883_0(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCollection_0883_1(context, node);
  }

  public EditorCell createCollection_0883_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(context, node);
    setupBasic_Collection_0883_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConceptProperty_0883_1(context, node));
    editorCell.addEditorCell(this.createReadOnlyModelAccessor_0883_0(context, node));
    editorCell.addEditorCell(this.createConceptProperty_0883_3(context, node));
    if (renderingCondition0883_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection_0883_3(context, node));
    }
    return editorCell;
  }

  public EditorCell createCollection_0883_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(context, node);
    setupBasic_Collection_0883_1(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection_0883_2(context, node));
    return editorCell;
  }

  public EditorCell createCollection_0883_2(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(context, node);
    setupBasic_Collection_0883_2(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant_0883_0(context, node, "interface:"));
    editorCell.addEditorCell(this.createRefCell_0883_1(context, node));
    return editorCell;
  }

  public EditorCell createCollection_0883_3(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(context, node);
    setupBasic_Collection_0883_3(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant_0883_1(context, node, "<"));
    editorCell.addEditorCell(this.createRefNodeList_0883_0(context, node));
    editorCell.addEditorCell(this.createConstant_0883_2(context, node, ">"));
    return editorCell;
  }

  public EditorCell createConstant_0883_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_0883_0(editorCell, node, context);
    setupLabel_Constant_0883_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_0883_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_0883_1(editorCell, node, context);
    setupLabel_Constant_0883_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_0883_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_0883_2(editorCell, node, context);
    setupLabel_Constant_0883_2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createReadOnlyModelAccessor_0883_0(final EditorContext context, final SNode node) {
    EditorCell_Property editorCell = EditorCell_Property.create(context, new ModelAccessor() {

      public String getText() {
        return IterableUtils.join(ListSequence.fromList(TupleIntefaceUtils.analyzeTupleInterface(SLinkOperations.getTarget(node, "iface", false))).select(new ISelector <TupleIntefaceUtils.Property, String>() {

          public String select(TupleIntefaceUtils.Property p) {
            return BaseConcept_Behavior.call_getPresentation_1213877396640(p.type()) + " " + p.name();
          }
        }), ", ");
      }

      public void setText(String s) {
      }

      public boolean isValidText(String s) {
        return EqualUtil.equals(s, this.getText());
      }
    }, node);
    editorCell.setAction(CellActionType.DELETE, new CellAction_Empty());
    setupBasic_ReadOnlyModelAccessor_0883_0(editorCell, node, context);
    setupLabel_ReadOnlyModelAccessor_0883_0(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createRefNodeList_0883_0(EditorContext context, SNode node) {
    if (this.myListHandler_0883_0 == null) {
      this.myListHandler_0883_0 = new InterfaceTupleType_Editor.parameterTypeListHandler_0883_0(node, "parameterType", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_0883_0.createCells(context, new CellLayout_Indent(), false);
    setupBasic_RefNodeList_0883_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.setRole(this.myListHandler_0883_0.getElementRole());
    return editorCell;
  }

  public EditorCell createConceptProperty_0883_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_ConceptProperty_0883_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_ConceptProperty_0883_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createConceptProperty_0883_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new ConceptPropertyCellProvider(node, context);
    provider.setRole("leftBracket");
    provider.setNoTargetText("<no leftBracket>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createConceptProperty_0883_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createConceptProperty_0883_2_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_ConceptProperty_0883_1(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_ConceptProperty_0883_1((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createConceptProperty_0883_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new ConceptPropertyCellProvider(node, context);
    provider.setRole("rightBracket");
    provider.setNoTargetText("<no rightBracket>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createConceptProperty_0883_2_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefCell_0883_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new InterfaceTupleType_Editor._Inline0883_0());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefCell_0883_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_RefCell_0883_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefCell_0883_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("iface");
    provider.setNoTargetText("<no iface>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefCell_0883_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_0883_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_0883_0");
  }

  private static void setupBasic_ConceptProperty_0883_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("conceptProperty_leftBracket");
    BaseLanguageStyle_StyleSheet.getLeftParen(editorCell).apply(editorCell);
  }

  private static void setupBasic_ConceptProperty_0883_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("conceptProperty_rightBracket");
    BaseLanguageStyle_StyleSheet.getRightParen(editorCell).apply(editorCell);
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.RT_ANCHOR_TAG, "default_RTransform");
        }
      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_ReadOnlyModelAccessor_0883_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("ReadOnlyModelAccessor_0883_0");
  }

  private static void setupBasic_Collection_0883_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_0883_1");
  }

  private static void setupBasic_Collection_0883_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_0883_2");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }
      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_0883_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_0883_0");
  }

  private static void setupBasic_RefCell_0883_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Collection_0883_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_0883_3");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
          this.set(StyleAttributes.SELECTABLE, false);
        }
      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_0883_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_0883_1");
    BaseLanguageStyle_StyleSheet.getBaseAngleBracket(editorCell).apply(editorCell);
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.PUNCTUATION_LEFT, true);
          this.set(StyleAttributes.PUNCTUATION_RIGTH, true);
        }
      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_0883_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_0883_2");
    BaseLanguageStyle_StyleSheet.getBaseAngleBracket(editorCell).apply(editorCell);
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.PUNCTUATION_LEFT, true);
        }
      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_RefNodeList_0883_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_parameterType");
  }

  private static void setupLabel_ConceptProperty_0883_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConceptProperty_0883_1(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ReadOnlyModelAccessor_0883_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_0883_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_RefCell_0883_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_0883_1(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_0883_2(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_RefNodeList_0883_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition0883_0(SNode node, EditorContext editorContext, IScope scope) {
    return SLinkOperations.getCount(node, "parameterType") > 0;
  }

  public static class _Inline0883_0 extends AbstractCellProvider {

    public _Inline0883_0() {
      super();
    }

    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.createProperty_0883_1(context, node);
    }

    public EditorCell createProperty_0883_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
      CellProviderWithRole provider = aProvider;
      provider.setAuxiliaryCellProvider(null);
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_Property_0883_0(editorCell, node, context);
      if (editorCell instanceof EditorCell_Label) {
        setupLabel_Property_0883_0((EditorCell_Label)editorCell, node, context);
      }
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell createProperty_0883_1(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      provider.setAllowsEmptyTarget(false);
      EditorCell cellWithRole = this.createProperty_0883_0_internal(context, node, provider);
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if (attributeConcept != null) {
        IOperationContext opContext = context.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
      } else
      return cellWithRole;
    }


    private static void setupBasic_Property_0883_0(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("property_name");
    }

    private static void setupLabel_Property_0883_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}
  public static class parameterTypeListHandler_0883_0 extends RefNodeListHandler {

    public parameterTypeListHandler_0883_0(SNode ownerNode, String childRole, EditorContext context) {
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
      emptyCell = super.createEmptyCell(context);
      this.installElementCellActions(super.getOwner(), null, emptyCell, context);
      return emptyCell;
    }

    public void installElementCellActions(SNode listOwner, SNode elementNode, EditorCell elementCell, EditorContext context) {
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        SNode substituteInfoNode = listOwner;
        if (elementNode != null) {
          substituteInfoNode = elementNode;
          elementCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(elementNode));
          elementCell.addKeyMap(new RefNodeListHandlerElementKeyMap(this, ","));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultReferenceSubstituteInfo) {
          elementCell.setSubstituteInfo(new DefaultChildSubstituteInfo(listOwner, elementNode, super.getLinkDeclaration(), context));
        }
      }
    }

    public EditorCell createSeparatorCell(EditorContext context) {
      {
        EditorCell_Constant editorCell = new EditorCell_Constant(context, this.getOwner(), ",");
        editorCell.setSelectable(false);
        editorCell.getStyle().set(StyleAttributes.LAYOUT_CONSTRAINT, "");
        editorCell.getStyle().set(StyleAttributes.PUNCTUATION_LEFT, true);
        return editorCell;
      }
    }

}

}
