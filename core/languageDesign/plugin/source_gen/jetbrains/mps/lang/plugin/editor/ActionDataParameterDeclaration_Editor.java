package jetbrains.mps.lang.plugin.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cells.EditorCell_Property;
import jetbrains.mps.nodeEditor.cells.ModelAccessor;
import jetbrains.mps.lang.core.behavior.BaseConcept_Behavior;
import jetbrains.mps.lang.plugin.behavior.ActionDataParameterDeclaration_Behavior;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_Empty;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.nodeEditor.AbstractCellProvider;

public class ActionDataParameterDeclaration_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1217252791143(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCollection1227642411149(context, node);
  }

  public EditorCell createCollection1217252791143(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12172527911431217252791143(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createReadOnlyModelAccessor1226062535407(context, node));
    editorCell.addEditorCell(this.createProperty1217252785750(context, node));
    editorCell.addEditorCell(this.createConstant1217252809571(context, node, "key:"));
    editorCell.addEditorCell(this.createRefCell1217252906272(context, node));
    return editorCell;
  }

  public EditorCell createCollection1227642410862(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_12276424108621227642410862(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1227642410863(context, node));
    editorCell.addEditorCell(this.createConstant1227642410866(context, node, ""));
    editorCell.addEditorCell(this.createReadOnlyModelAccessor1227642410868(context, node));
    editorCell.addEditorCell(this.createConstant1227642411027(context, node, ""));
    editorCell.addEditorCell(this.createReadOnlyModelAccessor1227642411029(context, node));
    return editorCell;
  }

  public EditorCell createCollection1227642410863(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12276424108631227642410863(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1227642410864(context, node, "is optional:"));
    editorCell.addEditorCell(this.createProperty1227642410865(context, node));
    return editorCell;
  }

  public EditorCell createCollection1227642411149(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12276424111491227642411149(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    if (renderingCondition6715_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection1227642410862(context, node));
    }
    return editorCell;
  }

  public EditorCell createConstant1217252809571(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12172528095711217252809571(editorCell, node, context);
    setupLabel_Constant_1217252809571_1217252809571(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1227642410864(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12276424108641227642410864(editorCell, node, context);
    setupLabel_Constant_1227642410864_1227642410864(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1227642410866(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12276424108661227642410866(editorCell, node, context);
    setupLabel_Constant_1227642410866_1227642410866(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1227642411027(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12276424110271227642411027(editorCell, node, context);
    setupLabel_Constant_1227642411027_1227642411027(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createReadOnlyModelAccessor1226062535407(final EditorContext context, final SNode node) {
    EditorCell_Property editorCell = EditorCell_Property.create(context, new ModelAccessor() {

      public String getText() {
        return BaseConcept_Behavior.call_getPresentation_1213877396640(ActionDataParameterDeclaration_Behavior.call_getType_1217257091542(node));
      }

      public void setText(String s) {
      }

      public boolean isValidText(String s) {
        return s.equals(this.getText());
      }

    }, node);
    editorCell.setAction(CellActionType.DELETE, new CellAction_Empty());
    setupBasic_ReadOnlyModelAccessor_12260625354071226062535407(editorCell, node, context);
    setupLabel_ReadOnlyModelAccessor_1226062535407_1226062535407(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createReadOnlyModelAccessor1227642410868(final EditorContext context, final SNode node) {
    EditorCell_Property editorCell = EditorCell_Property.create(context, new ModelAccessor() {

      public String getText() {
        SNode annotation = ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(node, "key", false), "annotation", true)).where(new IWhereFilter <SNode>() {

          public boolean accept(SNode it) {
            return SPropertyOperations.getString(SLinkOperations.getTarget(it, "annotation", false), "name").equals(SPropertyOperations.getString(SLinkOperations.getTarget(new _Quotations.QuotationClass_0().createNode(), "classifier", false), "name"));
          }

        }).first();
        if (annotation == null) {
          return "";
        }
        SNode description = ListSequence.fromList(SLinkOperations.getTargets(annotation, "value", true)).where(new IWhereFilter <SNode>() {

          public boolean accept(SNode it) {
            return SPropertyOperations.getString(SLinkOperations.getTarget(it, "key", false), "name").equals("description");
          }

        }).first();
        if (description == null) {
          return "";
        }
        String descriptionString = SPropertyOperations.getString(SLinkOperations.getTarget(description, "value", true), "value");
        return descriptionString;
      }

      public void setText(String s) {
      }

      public boolean isValidText(String s) {
        return s.equals(this.getText());
      }

    }, node);
    editorCell.setAction(CellActionType.DELETE, new CellAction_Empty());
    setupBasic_ReadOnlyModelAccessor_12276424108681227642410868(editorCell, node, context);
    setupLabel_ReadOnlyModelAccessor_1227642410868_1227642410868(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createReadOnlyModelAccessor1227642411029(final EditorContext context, final SNode node) {
    EditorCell_Property editorCell = EditorCell_Property.create(context, new ModelAccessor() {

      public String getText() {
        SNode annotation = ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(node, "key", false), "annotation", true)).where(new IWhereFilter <SNode>() {

          public boolean accept(SNode it) {
            return SPropertyOperations.getString(SLinkOperations.getTarget(it, "annotation", false), "name").equals(SPropertyOperations.getString(SLinkOperations.getTarget(new _Quotations.QuotationClass_1().createNode(), "classifier", false), "name"));
          }

        }).first();
        if (annotation == null) {
          return "";
        }
        SNode longDescription = ListSequence.fromList(SLinkOperations.getTargets(annotation, "value", true)).where(new IWhereFilter <SNode>() {

          public boolean accept(SNode it) {
            return SPropertyOperations.getString(SLinkOperations.getTarget(it, "key", false), "name").equals("longDescription");
          }

        }).last();
        if (longDescription == null) {
          return "";
        }
        String longDescriptionString = SPropertyOperations.getString(SLinkOperations.getTarget(longDescription, "value", true), "value");
        return longDescriptionString;
      }

      public void setText(String s) {
      }

      public boolean isValidText(String s) {
        return s.equals(this.getText());
      }

    }, node);
    editorCell.setAction(CellActionType.DELETE, new CellAction_Empty());
    setupBasic_ReadOnlyModelAccessor_12276424110291227642411029(editorCell, node, context);
    setupLabel_ReadOnlyModelAccessor_1227642411029_1227642411029(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createProperty1217252785750_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_name1217252785750(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_name_1217252785750((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1217252785750(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty1217252785750_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefCell1217252906272_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new ActionDataParameterDeclaration_Editor._Inline6715_0());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refCell_key1217252906272(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refCell_key_1217252906272((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefCell1217252906272(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("key");
    provider.setNoTargetText("<no key>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefCell1217252906272_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty1227642410865_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_isOptional1227642410865(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_isOptional_1227642410865((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1227642410865(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("isOptional");
    provider.setNoTargetText("<no isOptional>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty1227642410865_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_property_name1217252785750(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_name");
  }

  private static void setupBasic_Collection_12172527911431217252791143(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1217252791143");
  }

  private static void setupBasic_Constant_12172528095711217252809571(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1217252809571");
  }

  private static void setupBasic_refCell_key1217252906272(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refCell_key");
  }

  private static void setupBasic_ReadOnlyModelAccessor_12260625354071226062535407(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("ReadOnlyModelAccessor_1226062535407");
  }

  private static void setupBasic_Collection_12276424108621227642410862(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1227642410862");
  }

  private static void setupBasic_Collection_12276424108631227642410863(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1227642410863");
  }

  private static void setupBasic_Constant_12276424108641227642410864(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1227642410864");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
  }

  private static void setupBasic_property_isOptional1227642410865(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_isOptional");
  }

  private static void setupBasic_Constant_12276424108661227642410866(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1227642410866");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_ReadOnlyModelAccessor_12276424108681227642410868(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("ReadOnlyModelAccessor_1227642410868");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_12276424110271227642411027(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1227642411027");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_ReadOnlyModelAccessor_12276424110291227642411029(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("ReadOnlyModelAccessor_1227642411029");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_12276424111491227642411149(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1227642411149");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupLabel_property_name_1217252785750(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1217252809571_1217252809571(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refCell_key_1217252906272(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ReadOnlyModelAccessor_1226062535407_1226062535407(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1227642410864_1227642410864(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_isOptional_1227642410865(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1227642410866_1227642410866(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ReadOnlyModelAccessor_1227642410868_1227642410868(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1227642411027_1227642411027(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ReadOnlyModelAccessor_1227642411029_1227642411029(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition6715_0(SNode node, EditorContext editorContext, IScope scope) {
    return SLinkOperations.getTarget(node, "key", false) != null;
  }

  public static class _Inline6715_0 extends AbstractCellProvider {

    public _Inline6715_0() {
      super();
    }

    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.createProperty1217252908210(context, node);
    }

    public EditorCell createProperty1217252908210_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
      CellProviderWithRole provider = aProvider;
      provider.setAuxiliaryCellProvider(null);
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_property_name1217252908210(editorCell, node, context);
      if (editorCell instanceof EditorCell_Label) {
        setupLabel_property_name_1217252908210((EditorCell_Label)editorCell, node, context);
      }
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell createProperty1217252908210(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      provider.setAllowsEmptyTarget(false);
      EditorCell cellWithRole = this.createProperty1217252908210_internal(context, node, provider);
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if (attributeConcept != null) {
        IOperationContext opContext = context.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
      } else
      return cellWithRole;
    }


    private static void setupBasic_property_name1217252908210(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("property_name");
    }

    private static void setupLabel_property_name_1217252908210(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}

}
