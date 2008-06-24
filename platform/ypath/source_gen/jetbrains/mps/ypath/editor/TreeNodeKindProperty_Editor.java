package jetbrains.mps.ypath.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.BasicCellContext;
import jetbrains.mps.nodeEditor.cellMenu.ISubstituteInfoPart;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeCellProvider;
import jetbrains.mps.bootstrap.editorLanguage.generator.internal.AbstractCellMenuPart_Generic_Group;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SModel;

public class TreeNodeKindProperty_Editor extends DefaultNodeEditor {

  private static void setupBasic_CollectionCell20062_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell20062_0");
    editorCell.addKeyMap(new keymap_TreeNodeKindProperty());
  }

  private static void setupBasic_namePropertyCell20062_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_namePropertyCell20062_0");
    editorCell.addKeyMap(new keymap_TreeNodeKindProperty());
  }

  private static void setupBasic_ConstantCell20062_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell20062_0");
    {
      Style inlineStyle = new Style() {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_getterRefNodeCell20062_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_AlternationCell20062_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_AlternationCell20062_0");
    TreeNodeKindProperty_default_DELETE.setCellActions(editorCell, node, context);
  }

  private static void setupBasic_ConstantCell20062_01(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell20062_01");
    editorCell.setFontType(MPSFonts.BOLD);
  }

  private static void setupBasic_ConstantCell20062_02(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell20062_02");
  }

  private static void setupLabel_namePropertyCell20062_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell20062_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_getterRefNodeCell20062_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell20062_01(EditorCell_Label editorCell, SNode node, EditorContext context) {
    editorCell.setEditable(false);
    editorCell.setTextColor(MPSColors.DARK_MAGENTA);
  }

  private static void setupLabel_ConstantCell20062_02(EditorCell_Label editorCell, SNode node, EditorContext context) {
    editorCell.setEditable(false);
  }

  public static boolean renderingCondition20062_0(SNode node, EditorContext editorContext, IScope scope) {
    return SPropertyOperations.getBoolean(node, "default");
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.create_CollectionCell20062_0(context, node);
  }

  public EditorCell create_AlternationCell20062_0(EditorContext context, SNode node) {
    boolean alternationCondition = true;
    alternationCondition = TreeNodeKindProperty_Editor.renderingCondition20062_0(node, context, context.getOperationContext().getScope());
    EditorCell editorCell = null;
    if (alternationCondition) {
      editorCell = this.create_ConstantCell20062_01(context, node, "default");
    } else
    {
      editorCell = this.create_ConstantCell20062_02(context, node, "");
    }
    setupBasic_AlternationCell20062_0(editorCell, node, context);
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, new BasicCellContext(node), new ISubstituteInfoPart[]{new TreeNodeKindProperty_Editor.TreeNodeKindProperty_generic_cellMenu()}));
    return editorCell;
  }

  public EditorCell create_CollectionCell20062_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell20062_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_AlternationCell20062_0(context, node));
    editorCell.addEditorCell(this.create_namePropertyCell20062_0(context, node));
    editorCell.addEditorCell(this.create_ConstantCell20062_0(context, node, ":"));
    editorCell.addEditorCell(this.create_getterRefNodeCell20062_0(context, node));
    return editorCell;
  }

  public EditorCell create_ConstantCell20062_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell20062_0(editorCell, node, context);
    setupLabel_ConstantCell20062_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell20062_01(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell20062_01(editorCell, node, context);
    setupLabel_ConstantCell20062_01(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell20062_02(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell20062_02(editorCell, node, context);
    setupLabel_ConstantCell20062_02(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_namePropertyCell20062_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_namePropertyCell20062_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_namePropertyCell20062_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_namePropertyCell20062_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("name");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_namePropertyCell20062_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell create_getterRefNodeCell20062_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_getterRefNodeCell20062_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_getterRefNodeCell20062_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_getterRefNodeCell20062_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("getter");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_getterRefNodeCell20062_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public static class TreeNodeKindProperty_generic_cellMenu extends AbstractCellMenuPart_Generic_Group {

    public TreeNodeKindProperty_generic_cellMenu() {
    }

    public List createParameterObjects(SNode node, IScope scope, IOperationContext operationContext) {
      return ListSequence.<Boolean>fromArray(true, false);
    }

    public void handleAction(Object parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext) {
      this.handleAction_impl((Boolean)parameterObject, node, model, scope, operationContext);
    }

    public void handleAction_impl(Boolean parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext) {
      SPropertyOperations.set(node, "default", "" + (parameterObject));
    }

    public boolean isReferentPresentation() {
      return false;
    }

    public String getMatchingText(Object parameterObject) {
      return this.getMatchingText_internal((Boolean)parameterObject);
    }

    public String getMatchingText_internal(Boolean parameterObject) {
      return (parameterObject ?
        "default" :
        "regular"
      );
    }

    public String getDescriptionText(Object parameterObject) {
      return this.getDescriptionText_internal((Boolean)parameterObject);
    }

    public String getDescriptionText_internal(Boolean parameterObject) {
      return (parameterObject ?
        "allows to omit the property when testing" :
        "property must be always specified"
      );
    }

}

}
