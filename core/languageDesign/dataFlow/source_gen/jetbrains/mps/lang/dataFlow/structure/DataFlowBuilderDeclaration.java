package jetbrains.mps.lang.dataFlow.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.lang.structure.structure.IConceptAspect;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class DataFlowBuilderDeclaration extends BaseConcept implements INamedConcept, IConceptAspect {
  public static final String concept = "jetbrains.mps.lang.dataFlow.structure.DataFlowBuilderDeclaration";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String CONCEPT_DECLARATION = "conceptDeclaration";
  public static final String BUILDER_BLOCK = "builderBlock";

  public DataFlowBuilderDeclaration(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(DataFlowBuilderDeclaration.NAME);
  }

  public void setName(String value) {
    this.setProperty(DataFlowBuilderDeclaration.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(DataFlowBuilderDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(DataFlowBuilderDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(DataFlowBuilderDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(DataFlowBuilderDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(DataFlowBuilderDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(DataFlowBuilderDeclaration.VIRTUAL_PACKAGE, value);
  }

  public AbstractConceptDeclaration getConceptDeclaration() {
    return (AbstractConceptDeclaration) this.getReferent(AbstractConceptDeclaration.class, DataFlowBuilderDeclaration.CONCEPT_DECLARATION);
  }

  public void setConceptDeclaration(AbstractConceptDeclaration node) {
    super.setReferent(DataFlowBuilderDeclaration.CONCEPT_DECLARATION, node);
  }

  public BuilderBlock getBuilderBlock() {
    return (BuilderBlock) this.getChild(BuilderBlock.class, DataFlowBuilderDeclaration.BUILDER_BLOCK);
  }

  public void setBuilderBlock(BuilderBlock node) {
    super.setChild(DataFlowBuilderDeclaration.BUILDER_BLOCK, node);
  }

  public static DataFlowBuilderDeclaration newInstance(SModel sm, boolean init) {
    return (DataFlowBuilderDeclaration) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.dataFlow.structure.DataFlowBuilderDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static DataFlowBuilderDeclaration newInstance(SModel sm) {
    return DataFlowBuilderDeclaration.newInstance(sm, false);
  }
}
