package jetbrains.mps.execution.configurations.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.baseLanguage.structure.IOperation;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class GetProjectOperation extends BaseConcept implements IOperation {
  public static final String concept = "jetbrains.mps.execution.configurations.structure.GetProjectOperation";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public GetProjectOperation(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(GetProjectOperation.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(GetProjectOperation.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(GetProjectOperation.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(GetProjectOperation.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(GetProjectOperation.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(GetProjectOperation.VIRTUAL_PACKAGE, value);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(GetProjectOperation.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, GetProjectOperation.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, GetProjectOperation.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(GetProjectOperation.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, GetProjectOperation.SMODEL_ATTRIBUTE, node);
  }

  public static GetProjectOperation newInstance(SModel sm, boolean init) {
    return (GetProjectOperation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.execution.configurations.structure.GetProjectOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static GetProjectOperation newInstance(SModel sm) {
    return GetProjectOperation.newInstance(sm, false);
  }
}
