package jetbrains.mps.baseLanguage.dates.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;

public class PeriodConstant_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_1753_0(context, node);
  }

  public EditorCell createAlternation_1753_0(EditorContext context, SNode node) {
    boolean alternationCondition = true;
    alternationCondition = PeriodConstant_Editor.renderingCondition1753_0(node, context, context.getOperationContext().getScope());
    EditorCell editorCell = null;
    if (alternationCondition) {
      editorCell = this.createRefCell_1753_1(context, node);
    } else
    {
      editorCell = this.createRefCell_1753_3(context, node);
    }
    setupBasic_Alternation_1753_0(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createCollection_1753_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(context, node);
    setupBasic_Collection_1753_0(editorCell, node, context);
    editorCell.addEditorCell(this.createRefNode_1753_1(context, node));
    editorCell.addEditorCell(this.createAlternation_1753_0(context, node));
    return editorCell;
  }

  public EditorCell createRefCell_1753_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    provider.setAuxiliaryCellProvider(new PeriodConstant_Editor._Inline1753_0());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefCell_1753_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefCell_1753_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("dateTimeProperty");
    provider.setNoTargetText("<no dateTimeProperty>");
    EditorCell cellWithRole = this.createRefCell_1753_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefCell_1753_2_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    provider.setAuxiliaryCellProvider(new PeriodConstant_Editor._Inline1753_1());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefCell_1753_1(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefCell_1753_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("dateTimeProperty");
    provider.setNoTargetText("<no dateTimeProperty>");
    EditorCell cellWithRole = this.createRefCell_1753_2_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_1753_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_1753_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_1753_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("count");
    provider.setNoTargetText("<no count>");
    EditorCell cellWithRole = this.createRefNode_1753_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_1753_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1753_0");
  }

  private static void setupBasic_Alternation_1753_0(EditorCell editorCell, SNode node, EditorContext context) {
    PeriodConstant_ActionMap.setCellActions(editorCell, node, context);
  }

  private static void setupBasic_RefCell_1753_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_RefCell_1753_1(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_RefNode_1753_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition1753_0(SNode node, EditorContext editorContext, IScope scope) {
    boolean result = true;
    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "count", true), "jetbrains.mps.baseLanguage.structure.IntegerConstant")) {
      return SPropertyOperations.getInteger(SNodeOperations.cast(SLinkOperations.getTarget(node, "count", true), "jetbrains.mps.baseLanguage.structure.IntegerConstant"), "value") != 1;
    }
    return result;
  }

  public static class _Inline1753_0 extends AbstractCellProvider {

    public _Inline1753_0() {
      super();
    }

    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.createProperty_1753_1(context, node);
    }

    public EditorCell createProperty_1753_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_Property_1753_0(editorCell, node, context);
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell createProperty_1753_1(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("pluralForm");
      provider.setNoTargetText("<no pluralForm>");
      provider.setReadOnly(true);
      EditorCell cellWithRole = this.createProperty_1753_0_internal(context, node, provider);
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if (attributeConcept != null) {
        IOperationContext opContext = context.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
      } else
      return cellWithRole;
    }


    private static void setupBasic_Property_1753_0(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("property_pluralForm");
      Dates_StyleSheet.getDateProperty(editorCell).apply(editorCell);
    }

}
  public static class _Inline1753_1 extends AbstractCellProvider {

    public _Inline1753_1() {
      super();
    }

    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.createProperty_1753_3(context, node);
    }

    public EditorCell createProperty_1753_2_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_Property_1753_1(editorCell, node, context);
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell createProperty_1753_3(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      EditorCell cellWithRole = this.createProperty_1753_2_internal(context, node, provider);
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if (attributeConcept != null) {
        IOperationContext opContext = context.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
      } else
      return cellWithRole;
    }


    private static void setupBasic_Property_1753_1(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("property_name");
      Dates_StyleSheet.getDateProperty(editorCell).apply(editorCell);
    }

}

}
