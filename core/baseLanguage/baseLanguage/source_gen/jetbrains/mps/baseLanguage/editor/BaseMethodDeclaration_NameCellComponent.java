package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.ISubstituteInfoPart;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.bootstrap.editorLanguage.generator.internal.AbstractCellMenuPart_PropertyPostfixHints;
import java.util.List;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.constraints.Type_Behavior;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;

public class BaseMethodDeclaration_NameCellComponent extends AbstractCellProvider {

  public BaseMethodDeclaration_NameCellComponent(SNode node) {
    super(node);
  }

  private static void setupBasic_NameCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1185275036523");
  }

  private static void setupLabel_NameCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }


  public EditorCell createEditorCell(EditorContext context) {
    return this.createEditorCell(context, this.getSNode());
  }

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createNameCell(context, node);
  }

  public EditorCell createNameCellinternal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    BaseMethodDeclaration_NameCellComponent.setupBasic_NameCell(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      BaseMethodDeclaration_NameCellComponent.setupLabel_NameCell((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, provider.getCellContext(), new ISubstituteInfoPart[]{new BaseMethodDeclaration_NameCellComponent.BaseMethodDeclaration_name_postfixCellMenu()}));
    return editorCell;
  }

  public EditorCell createNameCell(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("name");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createNameCellinternal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public static class BaseMethodDeclaration_name_postfixCellMenu extends AbstractCellMenuPart_PropertyPostfixHints {

    public BaseMethodDeclaration_name_postfixCellMenu() {
    }

    public List<String> getPostfixes(SNode node, IScope scope, IOperationContext operationContext) {
      List<String> result;
      SNode nodeType = SLinkOperations.getTarget(node, "returnType", true);
      if (nodeType != null) {
        result = Type_Behavior.call_getVariableSuffixes_1182416669983(nodeType);
      } else
      {
        result = ListOperations.<String>createList();
      }
      return result;
    }

}

}
