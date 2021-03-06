package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.structure.PropertyDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CellModel_TransactionalProperty extends CellModel_AbstractLabel {
  public static final String concept = "jetbrains.mps.lang.editor.structure.CellModel_TransactionalProperty";
  public static final String RUN_IN_COMMAND = "runInCommand";
  public static final String ALLOW_EMPTY_TEXT = "allowEmptyText";
  public static final String PROPERTY = "property";
  public static final String HANDLER_BLOCK = "handlerBlock";

  public CellModel_TransactionalProperty(SNode node) {
    super(node);
  }

  public boolean getRunInCommand() {
    return this.getBooleanProperty(CellModel_TransactionalProperty.RUN_IN_COMMAND);
  }

  public void setRunInCommand(boolean value) {
    this.setBooleanProperty(CellModel_TransactionalProperty.RUN_IN_COMMAND, value);
  }

  public boolean getAllowEmptyText() {
    return this.getBooleanProperty(CellModel_TransactionalProperty.ALLOW_EMPTY_TEXT);
  }

  public void setAllowEmptyText(boolean value) {
    this.setBooleanProperty(CellModel_TransactionalProperty.ALLOW_EMPTY_TEXT, value);
  }

  public PropertyDeclaration getProperty() {
    return (PropertyDeclaration) this.getReferent(PropertyDeclaration.class, CellModel_TransactionalProperty.PROPERTY);
  }

  public void setProperty(PropertyDeclaration node) {
    super.setReferent(CellModel_TransactionalProperty.PROPERTY, node);
  }

  public TransactionalPropertyHandler getHandlerBlock() {
    return (TransactionalPropertyHandler) this.getChild(TransactionalPropertyHandler.class, CellModel_TransactionalProperty.HANDLER_BLOCK);
  }

  public void setHandlerBlock(TransactionalPropertyHandler node) {
    super.setChild(CellModel_TransactionalProperty.HANDLER_BLOCK, node);
  }

  public static CellModel_TransactionalProperty newInstance(SModel sm, boolean init) {
    return (CellModel_TransactionalProperty) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.CellModel_TransactionalProperty", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CellModel_TransactionalProperty newInstance(SModel sm) {
    return CellModel_TransactionalProperty.newInstance(sm, false);
  }
}
