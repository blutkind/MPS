package jetbrains.mps.lang.typesystem.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.baseLanguage.structure.IOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CaretPositionOperation extends BaseConcept implements IOperation {
  public static final String concept = "jetbrains.mps.lang.typesystem.structure.CaretPositionOperation";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";

  public CaretPositionOperation(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(CaretPositionOperation.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(CaretPositionOperation.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(CaretPositionOperation.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(CaretPositionOperation.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(CaretPositionOperation.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(CaretPositionOperation.VIRTUAL_PACKAGE, value);
  }

  public static CaretPositionOperation newInstance(SModel sm, boolean init) {
    return (CaretPositionOperation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.CaretPositionOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CaretPositionOperation newInstance(SModel sm) {
    return CaretPositionOperation.newInstance(sm, false);
  }
}
