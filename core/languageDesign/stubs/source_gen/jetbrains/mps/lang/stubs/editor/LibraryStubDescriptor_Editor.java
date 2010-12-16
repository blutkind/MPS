package jetbrains.mps.lang.stubs.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.nodeEditor.cells.EditorCell_Indent;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPart;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.nodeEditor.BlockCells;
import jetbrains.mps.nodeEditor.InlineCellProvider;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_Generic_Group;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.project.structure.modules.StubSolution;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_Generic_Item;

public class LibraryStubDescriptor_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_y9570a_a(editorContext, node);
  }

  private EditorCell createCollection_y9570a_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_y9570a_a");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createCollection_y9570a_a0(editorContext, node));
    editorCell.addEditorCell(this.createCollection_y9570a_b0(editorContext, node));
    if (renderingCondition_y9570a_a2a(node, editorContext, editorContext.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant_y9570a_c0(editorContext, node));
    }
    return editorCell;
  }

  private EditorCell createCollection_y9570a_a0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_y9570a_a0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createCollection_y9570a_a0a(editorContext, node));
    if (renderingCondition_y9570a_a1a0(node, editorContext, editorContext.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant_y9570a_b0a(editorContext, node));
    }
    return editorCell;
  }

  private EditorCell createCollection_y9570a_a0a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_y9570a_a0a");
    editorCell.addEditorCell(this.createConstant_y9570a_a0a0(editorContext, node));
    editorCell.addEditorCell(this.createProperty_y9570a_b0a0(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_y9570a_b0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_y9570a_b0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createIndentCell_y9570a_a1a(editorContext, node));
    editorCell.addEditorCell(this.createCollection_y9570a_b1a(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_y9570a_b1a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_y9570a_b1a");
    editorCell.addEditorCell(this.createCollection_y9570a_a1b0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_y9570a_b1b0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_y9570a_c1b0(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_y9570a_a1b0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_y9570a_a1b0");
    editorCell.setGridLayout(true);
    editorCell.addEditorCell(this.createCollection_y9570a_a0b1a(editorContext, node));
    editorCell.addEditorCell(this.createCollection_y9570a_b0b1a(editorContext, node));
    editorCell.addEditorCell(this.createCollection_y9570a_c0b1a(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_y9570a_a0b1a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_y9570a_a0b1a");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_y9570a_a0a1b0(editorContext, node));
    editorCell.addEditorCell(this.createProperty_y9570a_b0a1b0(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_y9570a_b0b1a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_y9570a_b0b1a");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_y9570a_a1a1b0(editorContext, node));
    editorCell.addEditorCell(this.createRefCell_y9570a_b1a1b0(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_y9570a_c0b1a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_y9570a_c0b1a");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_y9570a_a2a1b0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_y9570a_b2a1b0(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_y9570a_a0a0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "library descriptor");
    editorCell.setCellId("Constant_y9570a_a0a0");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_y9570a_b0a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "{");
    editorCell.setCellId("Constant_y9570a_b0a");
    BaseLanguageStyle_StyleSheet.getLeftBrace(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_y9570a_a0a1b0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "module:");
    editorCell.setCellId("Constant_y9570a_a0a1b0");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_y9570a_a1a1b0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "creator:");
    editorCell.setCellId("Constant_y9570a_a1a1b0");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_y9570a_a2a1b0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "export:");
    editorCell.setCellId("Constant_y9570a_a2a1b0");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_y9570a_b1b0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "");
    editorCell.setCellId("Constant_y9570a_b1b0");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_y9570a_c0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "}");
    editorCell.setCellId("Constant_y9570a_c0");
    BaseLanguageStyle_StyleSheet.getRightBrace(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createIndentCell_y9570a_a1a(EditorContext editorContext, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(editorContext, node);
    return result;
  }

  private EditorCell createRefCell_y9570a_b1a1b0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, editorContext);
    provider.setRole("creator");
    provider.setNoTargetText("<no creator>");
    EditorCell editorCell;
    provider.setAuxiliaryCellProvider(new LibraryStubDescriptor_Editor._Inline_y9570a_a1b0b1a());
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  private EditorCell createRefNode_y9570a_b2a1b0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("export");
    provider.setNoTargetText("do not set");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  private EditorCell createRefNode_y9570a_c1b0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("rootsBlock");
    provider.setNoTargetText("<no rootsBlock>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  private EditorCell createProperty_y9570a_b0a0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_name");
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  private EditorCell createProperty_y9570a_b0a1b0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("moduleName");
    provider.setNoTargetText("<no moduleName>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_moduleName");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(editorContext, provider.getCellContext(), new SubstituteInfoPart[]{new LibraryStubDescriptor_Editor.LibraryStubDescriptor_generic_cellMenu_a0b0a1b0(), new LibraryStubDescriptor_Editor.LibraryStubDescriptor_generic_cellMenu_b0b0a1b0()}));
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  private static boolean renderingCondition_y9570a_a1a0(SNode node, EditorContext editorContext, IScope scope) {
    return BlockCells.useBraces();
  }

  private static boolean renderingCondition_y9570a_a2a(SNode node, EditorContext editorContext, IScope scope) {
    return BlockCells.useBraces();
  }

  public static class _Inline_y9570a_a1b0b1a extends InlineCellProvider {
    public _Inline_y9570a_a1b0b1a() {
      super();
    }

    public EditorCell createEditorCell(EditorContext editorContext) {
      return this.createEditorCell(editorContext, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
      return this.createProperty_y9570a_a0b1a1b0(editorContext, node);
    }

    private EditorCell createProperty_y9570a_a0b1a1b0(EditorContext editorContext, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      EditorCell editorCell;
      editorCell = provider.createEditorCell(editorContext);
      editorCell.setCellId("property_name_1");
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if (attributeConcept != null) {
        IOperationContext opContext = editorContext.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
      } else
      return editorCell;
    }
  }

  public static class LibraryStubDescriptor_generic_cellMenu_a0b0a1b0 extends AbstractCellMenuPart_Generic_Group {
    public LibraryStubDescriptor_generic_cellMenu_a0b0a1b0() {
    }

    public List<?> createParameterObjects(SNode node, IScope scope, IOperationContext operationContext) {
      return StubSolutionCreateHelper.getAvailableStubSolutions(node);
    }

    protected void handleAction(Object parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext, EditorContext editorContext) {
      this.handleAction_impl((StubSolution) parameterObject, node, model, scope, operationContext, editorContext);
    }

    public void handleAction_impl(StubSolution parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext, EditorContext editorContext) {
      SPropertyOperations.set(node, "moduleId", parameterObject.getId().toString());
    }

    public boolean isReferentPresentation() {
      return false;
    }

    public String getMatchingText(Object parameterObject) {
      return this.getMatchingText_internal((StubSolution) parameterObject);
    }

    public String getMatchingText_internal(StubSolution parameterObject) {
      return parameterObject.getName();
    }
  }

  public static class LibraryStubDescriptor_generic_cellMenu_b0b0a1b0 extends AbstractCellMenuPart_Generic_Item {
    public LibraryStubDescriptor_generic_cellMenu_b0b0a1b0() {
    }

    public void handleAction(SNode node, SModel model, IScope scope, IOperationContext operationContext) {
      StubSolutionCreateHelper.createNewStubSolution(operationContext, node);
    }

    public String getMatchingText() {
      return "create new...";
    }
  }
}
