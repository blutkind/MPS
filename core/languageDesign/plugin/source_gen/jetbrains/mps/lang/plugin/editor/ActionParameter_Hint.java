package jetbrains.mps.lang.plugin.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cells.EditorCell_Property;
import jetbrains.mps.nodeEditor.cells.ModelAccessor;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.plugin.behavior.ActionParameter_Behavior;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.util.EqualUtil;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_Empty;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.smodel.IScope;

public class ActionParameter_Hint extends AbstractCellProvider {

  public ActionParameter_Hint(SNode node) {
    super(node);
  }

  public EditorCell createEditorCell(EditorContext context) {
    return this.createEditorCell(context, this.getSNode());
  }

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_8189_1(context, node);
  }

  public EditorCell createCollection_8189_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_8189_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createReadOnlyModelAccessor_8189_0(context, node));
    editorCell.addEditorCell(this.createConstant_8189_0(context, node, ""));
    editorCell.addEditorCell(this.createReadOnlyModelAccessor_8189_1(context, node));
    return editorCell;
  }

  public EditorCell createCollection_8189_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_8189_1(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    if (renderingCondition8189_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection_8189_0(context, node));
    }
    return editorCell;
  }

  public EditorCell createConstant_8189_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_8189_0(editorCell, node, context);
    setupLabel_Constant_8189_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createReadOnlyModelAccessor_8189_0(final EditorContext context, final SNode node) {
    EditorCell_Property editorCell = EditorCell_Property.create(context, new ModelAccessor() {

      public String getText() {
        SNode annotation = ListSequence.fromList(SLinkOperations.getTargets(ActionParameter_Behavior.call_getFieldDeclaration_1171743928471867409(node), "annotation", true)).where(new IWhereFilter <SNode>() {

          public boolean accept(SNode it) {
            return SPropertyOperations.getString(SLinkOperations.getTarget(it, "annotation", false), "name").equals(SPropertyOperations.getString(SNodeOperations.cast(SLinkOperations.getTarget(new _Quotations.QuotationClass_0().createNode(), "classifier", false), "jetbrains.mps.baseLanguage.structure.Annotation"), "name"));
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
        String descriptionString = SPropertyOperations.getString(SNodeOperations.cast(SLinkOperations.getTarget(description, "value", true), "jetbrains.mps.baseLanguage.structure.StringLiteral"), "value");
        return descriptionString;
      }

      public void setText(String s) {
      }

      public boolean isValidText(String s) {
        return EqualUtil.equals(s, this.getText());
      }
    }, node);
    editorCell.setAction(CellActionType.DELETE, new CellAction_Empty());
    setupBasic_ReadOnlyModelAccessor_8189_0(editorCell, node, context);
    setupLabel_ReadOnlyModelAccessor_8189_0(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createReadOnlyModelAccessor_8189_1(final EditorContext context, final SNode node) {
    EditorCell_Property editorCell = EditorCell_Property.create(context, new ModelAccessor() {

      public String getText() {
        SNode annotation = ListSequence.fromList(SLinkOperations.getTargets(ActionParameter_Behavior.call_getFieldDeclaration_1171743928471867409(node), "annotation", true)).where(new IWhereFilter <SNode>() {

          public boolean accept(SNode it) {
            return SPropertyOperations.getString(SLinkOperations.getTarget(it, "annotation", false), "name").equals(SPropertyOperations.getString(SNodeOperations.cast(SLinkOperations.getTarget(new _Quotations.QuotationClass_1().createNode(), "classifier", false), "jetbrains.mps.baseLanguage.structure.Annotation"), "name"));
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
        String longDescriptionString = SPropertyOperations.getString(SNodeOperations.cast(SLinkOperations.getTarget(longDescription, "value", true), "jetbrains.mps.baseLanguage.structure.StringLiteral"), "value");
        return longDescriptionString;
      }

      public void setText(String s) {
      }

      public boolean isValidText(String s) {
        return EqualUtil.equals(s, this.getText());
      }
    }, node);
    editorCell.setAction(CellActionType.DELETE, new CellAction_Empty());
    setupBasic_ReadOnlyModelAccessor_8189_1(editorCell, node, context);
    setupLabel_ReadOnlyModelAccessor_8189_1(editorCell, node, context);
    return editorCell;
  }


  private static void setupBasic_Collection_8189_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_8189_0");
  }

  private static void setupBasic_ReadOnlyModelAccessor_8189_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("ReadOnlyModelAccessor_8189_0");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }
      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_8189_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_8189_0");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }
      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_ReadOnlyModelAccessor_8189_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("ReadOnlyModelAccessor_8189_1");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }
      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_8189_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_8189_1");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }
      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupLabel_ReadOnlyModelAccessor_8189_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_8189_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ReadOnlyModelAccessor_8189_1(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition8189_0(SNode node, EditorContext editorContext, IScope scope) {
    return ActionParameter_Behavior.call_getFieldDeclaration_1171743928471867409(node) != null;
  }

}
