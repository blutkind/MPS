package jetbrains.mps.traceInfo.testWeavingGenerated.data.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ChildConceptWeaveEachMany extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.traceInfo.testWeavingGenerated.data.structure.ChildConceptWeaveEachMany";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public ChildConceptWeaveEachMany(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(ChildConceptWeaveEachMany.NAME);
  }

  public void setName(String value) {
    this.setProperty(ChildConceptWeaveEachMany.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(ChildConceptWeaveEachMany.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ChildConceptWeaveEachMany.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ChildConceptWeaveEachMany.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ChildConceptWeaveEachMany.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ChildConceptWeaveEachMany.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ChildConceptWeaveEachMany.VIRTUAL_PACKAGE, value);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(ChildConceptWeaveEachMany.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, ChildConceptWeaveEachMany.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, ChildConceptWeaveEachMany.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(ChildConceptWeaveEachMany.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, ChildConceptWeaveEachMany.SMODEL_ATTRIBUTE, node);
  }

  public static ChildConceptWeaveEachMany newInstance(SModel sm, boolean init) {
    return (ChildConceptWeaveEachMany) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.traceInfo.testWeavingGenerated.data.structure.ChildConceptWeaveEachMany", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ChildConceptWeaveEachMany newInstance(SModel sm) {
    return ChildConceptWeaveEachMany.newInstance(sm, false);
  }
}
