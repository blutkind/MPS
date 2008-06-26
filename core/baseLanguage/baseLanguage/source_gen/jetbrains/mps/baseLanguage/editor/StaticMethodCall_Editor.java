package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.ISubstituteInfoPart;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefCellCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.PropertyCellProvider;
import jetbrains.mps.bootstrap.editorLanguage.generator.internal.AbstractCellMenuPart_ReplaceNode_Group;
import java.util.List;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.bootstrap.editorLanguage.generator.internal.PrimaryReferentMenuCellMenuPart;

public class StaticMethodCall_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider myIMethodCall_actualArguments;

  private static void setupBasic_CollectionCell12257_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell12257_0");
  }

  private static void setupBasic_ConstantCell12257_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell12257_0");
  }

  private static void setupBasic_staticMethodDeclarationRefCell12257_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_staticMethodDeclarationRefCell12257_0");
  }

  private static void setupBasic_classConceptRefCell12257_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_classConceptRefCell12257_0");
    StaticMethodCall_Actions.setCellActions(editorCell, node, context);
  }

  private static void setupBasic_IMethodCall_actualArgumentsComponentCell12257_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_IMethodCall_actualArgumentsComponentCell12257_0");
  }

  private static void setupLabel_ConstantCell12257_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_staticMethodDeclarationRefCell12257_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_classConceptRefCell12257_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.create_CollectionCell12257_0(context, node);
  }

  public EditorCell create_CollectionCell12257_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell12257_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_classConceptRefCell12257_0(context, node));
    editorCell.addEditorCell(this.create_ConstantCell12257_0(context, node, "."));
    editorCell.addEditorCell(this.create_staticMethodDeclarationRefCell12257_0(context, node));
    editorCell.addEditorCell(this.create_IMethodCall_actualArgumentsComponentCell12257_0(context, node));
    return editorCell;
  }

  public EditorCell create_IMethodCall_actualArgumentsComponentCell12257_0(EditorContext context, SNode node) {
    if (this.myIMethodCall_actualArguments == null) {
      this.myIMethodCall_actualArguments = new IMethodCall_actualArguments(node);
    }
    EditorCell editorCell = this.myIMethodCall_actualArguments.createEditorCell(context);
    setupBasic_IMethodCall_actualArgumentsComponentCell12257_0(editorCell, node, context);
    return editorCell;
  }

  public EditorCell create_ConstantCell12257_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell12257_0(editorCell, node, context);
    setupLabel_ConstantCell12257_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_staticMethodDeclarationRefCell12257_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new StaticMethodCall_Editor._Inline3());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_staticMethodDeclarationRefCell12257_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_staticMethodDeclarationRefCell12257_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, provider.getCellContext(), new ISubstituteInfoPart[]{new StaticMethodCall_Editor.StaticMethodCall_staticMethodDeclaration_cellMenu(),new StaticMethodCall_Editor.StaticMethodCall_customReplace_cellMenu()}));
    return editorCell;
  }

  public EditorCell create_staticMethodDeclarationRefCell12257_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("staticMethodDeclaration");
    provider.setNoTargetText("<no method>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_staticMethodDeclarationRefCell12257_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell create_classConceptRefCell12257_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new StaticMethodCall_Editor._Inline12());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_classConceptRefCell12257_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_classConceptRefCell12257_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_classConceptRefCell12257_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("classConcept");
    provider.setNoTargetText("<no class>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_classConceptRefCell12257_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public static class _Inline3 extends AbstractCellProvider {

    public _Inline3() {
      super();
    }

    private static void setupBasic_namePropertyCell12257_0(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_namePropertyCell12257_0");
      {
        Style inlineStyle = new Style(editorCell) {
          {
            this.set(StyleAttributes.FONT_STYLE, MPSFonts.ITALIC);
          }

        };
        inlineStyle.apply(editorCell);
      }
    }

    private static void setupLabel_namePropertyCell12257_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }


    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.create_namePropertyCell12257_0(context, node);
    }

    public EditorCell create_namePropertyCell12257_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
      CellProviderWithRole provider = aProvider;
      provider.setAuxiliaryCellProvider(null);
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_namePropertyCell12257_0(editorCell, node, context);
      if (editorCell instanceof EditorCell_Label) {
        setupLabel_namePropertyCell12257_0((EditorCell_Label)editorCell, node, context);
      }
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell create_namePropertyCell12257_0(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      provider.setAllowsEmptyTarget(false);
      EditorCell cellWithRole = this.create_namePropertyCell12257_0_internal(context, node, provider);
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if (attributeConcept != null) {
        IOperationContext opContext = context.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
      } else
      return cellWithRole;
    }

}
  public static class _Inline12 extends AbstractCellProvider {

    public _Inline12() {
      super();
    }

    private static void setupBasic_namePropertyCell12257_01(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_namePropertyCell12257_01");
    }

    private static void setupLabel_namePropertyCell12257_01(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }


    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.create_namePropertyCell12257_01(context, node);
    }

    public EditorCell create_namePropertyCell12257_01_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
      CellProviderWithRole provider = aProvider;
      provider.setAuxiliaryCellProvider(null);
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_namePropertyCell12257_01(editorCell, node, context);
      if (editorCell instanceof EditorCell_Label) {
        setupLabel_namePropertyCell12257_01((EditorCell_Label)editorCell, node, context);
      }
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell create_namePropertyCell12257_01(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      provider.setAllowsEmptyTarget(false);
      EditorCell cellWithRole = this.create_namePropertyCell12257_01_internal(context, node, provider);
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if (attributeConcept != null) {
        IOperationContext opContext = context.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
      } else
      return cellWithRole;
    }

}
  public static class StaticMethodCall_customReplace_cellMenu extends AbstractCellMenuPart_ReplaceNode_Group {

    public StaticMethodCall_customReplace_cellMenu() {
    }

    public List createParameterObjects(SNode node, IScope scope, IOperationContext operationContext) {
      return QueriesUtil.replaceNodeMenu_StaticMethodCall_getParameterObjects(node);
    }

    public SNode createReplacementNode(Object parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext) {
      return this.createReplacementNode_impl((SNode)parameterObject, node, model, scope, operationContext);
    }

    public SNode createReplacementNode_impl(SNode parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext) {
      return QueriesUtil.replaceNodeMenu_StaticMethodCall_createReplacementNode(node, parameterObject);
    }

    public boolean isReferentPresentation() {
      return true;
    }

}
  public static class StaticMethodCall_staticMethodDeclaration_cellMenu extends PrimaryReferentMenuCellMenuPart {

    public StaticMethodCall_staticMethodDeclaration_cellMenu() {
    }
}

}
