package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.structure.SNodeOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SelectOperation extends SNodeOperation {
  public static final String concept = "jetbrains.mps.lang.editor.structure.SelectOperation";
  public static final String EDITOR_CONTEXT = "editorContext";
  public static final String SELECT_LATER_PARAMETER = "selectLaterParameter";

  public SelectOperation(SNode node) {
    super(node);
  }

  public Expression getEditorContext() {
    return (Expression)this.getChild(Expression.class, SelectOperation.EDITOR_CONTEXT);
  }

  public void setEditorContext(Expression node) {
    super.setChild(SelectOperation.EDITOR_CONTEXT, node);
  }

  public int getSelectLaterParametersCount() {
    return this.getChildCount(SelectOperation.SELECT_LATER_PARAMETER);
  }

  public Iterator<SelectParameter> selectLaterParameters() {
    return this.children(SelectParameter.class, SelectOperation.SELECT_LATER_PARAMETER);
  }

  public List<SelectParameter> getSelectLaterParameters() {
    return this.getChildren(SelectParameter.class, SelectOperation.SELECT_LATER_PARAMETER);
  }

  public void addSelectLaterParameter(SelectParameter node) {
    this.addChild(SelectOperation.SELECT_LATER_PARAMETER, node);
  }

  public void insertSelectLaterParameter(SelectParameter prev, SelectParameter node) {
    this.insertChild(prev, SelectOperation.SELECT_LATER_PARAMETER, node);
  }


  public static SelectOperation newInstance(SModel sm, boolean init) {
    return (SelectOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.SelectOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SelectOperation newInstance(SModel sm) {
    return SelectOperation.newInstance(sm, false);
  }

}
