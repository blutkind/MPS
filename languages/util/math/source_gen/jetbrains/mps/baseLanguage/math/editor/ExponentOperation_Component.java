package jetbrains.mps.baseLanguage.math.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.ConceptPropertyCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.ScriptKind;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPart;
import jetbrains.mps.editor.runtime.EditorCell_Empty;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_Generic_Group;
import java.util.List;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptPropertyOperations;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.util.NameUtil;

public class ExponentOperation_Component extends AbstractCellProvider {
  public ExponentOperation_Component(SNode node) {
    super(node);
  }

  public EditorCell createEditorCell(EditorContext editorContext) {
    return this.createEditorCell(editorContext, this.getSNode());
  }

  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_spngij_a(editorContext, node);
  }

  private EditorCell createCollection_spngij_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createSuperscript(editorContext, node);
    editorCell.setCellId("Collection_spngij_a");
    editorCell.addEditorCell(this.createRefNode_spngij_a0(editorContext, node));
    editorCell.addEditorCell(this.createConceptProperty_spngij_b0(editorContext, node));
    editorCell.addEditorCell(this.createEmpty_spngij_c0(editorContext, node));
    return editorCell;
  }

  private EditorCell createRefNode_spngij_a0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("expr");
    provider.setNoTargetText("<no expr>");
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

  private EditorCell createConceptProperty_spngij_b0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new ConceptPropertyCellProvider(node, editorContext);
    provider.setRole("operationSymbol");
    provider.setNoTargetText("<no operationSymbol>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("conceptProperty_operationSymbol");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SCRIPT_KIND, ScriptKind.SUPERSCRIPT);
    }
    deleteUpperIndex.setCellActions(editorCell, node, editorContext);
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(editorContext, provider.getCellContext(), new SubstituteInfoPart[]{new ExponentOperation_Component.ExponentialOperation_generic_cellMenu_a0b0()}));
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  private EditorCell createEmpty_spngij_c0(EditorContext editorContext, SNode node) {
    EditorCell_Empty editorCell = new EditorCell_Empty(editorContext, node);
    editorCell.setCellId("Empty_spngij_c0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    }
    return editorCell;
  }

  public static class ExponentialOperation_generic_cellMenu_a0b0 extends AbstractCellMenuPart_Generic_Group {
    public ExponentialOperation_generic_cellMenu_a0b0() {
    }

    public List<?> createParameterObjects(SNode node, IScope scope, IOperationContext operationContext) {
      List<SNode> result = ListSequence.fromList(new ArrayList<SNode>());
      for (SNode a : ListSequence.fromList(SConceptOperations.getAllSubConcepts(ListSequence.fromList(SLinkOperations.getConceptLinkTargets(node, "allowedSubstituends")).first(), SNodeOperations.getModel(node), scope))) {
        if (!(SConceptPropertyOperations.getBoolean(a, "abstract")) && SConceptOperations.isSubConceptOf(a, "jetbrains.mps.baseLanguage.math.structure.ExponentialOperation")) {
          ListSequence.fromList(result).addElement(SNodeOperations.castConcept(a, "jetbrains.mps.baseLanguage.math.structure.ExponentialOperation"));
        }
      }
      return result;
    }

    protected void handleAction(Object parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext, EditorContext editorContext) {
      this.handleAction_impl((SNode) parameterObject, node, model, scope, operationContext, editorContext);
    }

    public void handleAction_impl(SNode parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext, EditorContext editorContext) {
      SNodeOperations.replaceWithAnother(node, SNodeFactoryOperations.createNewNode(NameUtil.nodeFQName(parameterObject), SLinkOperations.getTarget(node, "expr", true)));
    }

    public boolean isReferentPresentation() {
      return false;
    }

    public String getMatchingText(Object parameterObject) {
      return this.getMatchingText_internal((SNode) parameterObject);
    }

    public String getMatchingText_internal(SNode parameterObject) {
      return SConceptPropertyOperations.getString(parameterObject, "operationSymbol");
    }

    public String getDescriptionText(Object parameterObject) {
      return this.getDescriptionText_internal((SNode) parameterObject);
    }

    public String getDescriptionText_internal(SNode parameterObject) {
      return SConceptPropertyOperations.getString(parameterObject, "shortDescription");
    }
  }
}
