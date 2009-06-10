package jetbrains.mps.lang.test.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TypesCheckOperation extends NodeOperation {
  public static final String concept = "jetbrains.mps.lang.test.structure.TypesCheckOperation";
  public static final String OPERATION_NAME = "operationName";
  public static final String ALLOW_ERRORS = "allowErrors";
  public static final String ALLOW_WARNINGS = "allowWarnings";

  public TypesCheckOperation(SNode node) {
    super(node);
  }

  public String getOperationName() {
    return this.getProperty(TypesCheckOperation.OPERATION_NAME);
  }

  public void setOperationName(String value) {
    this.setProperty(TypesCheckOperation.OPERATION_NAME, value);
  }

  public boolean getAllowErrors() {
    return this.getBooleanProperty(TypesCheckOperation.ALLOW_ERRORS);
  }

  public void setAllowErrors(boolean value) {
    this.setBooleanProperty(TypesCheckOperation.ALLOW_ERRORS, value);
  }

  public boolean getAllowWarnings() {
    return this.getBooleanProperty(TypesCheckOperation.ALLOW_WARNINGS);
  }

  public void setAllowWarnings(boolean value) {
    this.setBooleanProperty(TypesCheckOperation.ALLOW_WARNINGS, value);
  }


  public static TypesCheckOperation newInstance(SModel sm, boolean init) {
    return (TypesCheckOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.test.structure.TypesCheckOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TypesCheckOperation newInstance(SModel sm) {
    return TypesCheckOperation.newInstance(sm, false);
  }

}
