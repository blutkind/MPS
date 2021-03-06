package jetbrains.mps.lang.textGen.structure;

/*Generated by MPS */

import jetbrains.mps.lang.structure.structure.IConceptAspect;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConceptTextGenDeclaration extends AbstractTextGenDeclaration implements IConceptAspect {
  public static final String concept = "jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String CONCEPT_DECLARATION = "conceptDeclaration";
  public static final String EXTENSION = "extension";
  public static final String ENCODING = "encoding";
  public static final String TEXT_GEN_BLOCK = "textGenBlock";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public ConceptTextGenDeclaration(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(ConceptTextGenDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ConceptTextGenDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ConceptTextGenDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ConceptTextGenDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ConceptTextGenDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ConceptTextGenDeclaration.VIRTUAL_PACKAGE, value);
  }

  public AbstractConceptDeclaration getConceptDeclaration() {
    return (AbstractConceptDeclaration) this.getReferent(AbstractConceptDeclaration.class, ConceptTextGenDeclaration.CONCEPT_DECLARATION);
  }

  public void setConceptDeclaration(AbstractConceptDeclaration node) {
    super.setReferent(ConceptTextGenDeclaration.CONCEPT_DECLARATION, node);
  }

  public ExtensionDeclaration getExtension() {
    return (ExtensionDeclaration) this.getChild(ExtensionDeclaration.class, ConceptTextGenDeclaration.EXTENSION);
  }

  public void setExtension(ExtensionDeclaration node) {
    super.setChild(ConceptTextGenDeclaration.EXTENSION, node);
  }

  public EncodingDeclarationBase getEncoding() {
    return (EncodingDeclarationBase) this.getChild(EncodingDeclarationBase.class, ConceptTextGenDeclaration.ENCODING);
  }

  public void setEncoding(EncodingDeclarationBase node) {
    super.setChild(ConceptTextGenDeclaration.ENCODING, node);
  }

  public GenerateTextDeclaration getTextGenBlock() {
    return (GenerateTextDeclaration) this.getChild(GenerateTextDeclaration.class, ConceptTextGenDeclaration.TEXT_GEN_BLOCK);
  }

  public void setTextGenBlock(GenerateTextDeclaration node) {
    super.setChild(ConceptTextGenDeclaration.TEXT_GEN_BLOCK, node);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(ConceptTextGenDeclaration.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, ConceptTextGenDeclaration.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, ConceptTextGenDeclaration.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(ConceptTextGenDeclaration.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, ConceptTextGenDeclaration.SMODEL_ATTRIBUTE, node);
  }

  public static ConceptTextGenDeclaration newInstance(SModel sm, boolean init) {
    return (ConceptTextGenDeclaration) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConceptTextGenDeclaration newInstance(SModel sm) {
    return ConceptTextGenDeclaration.newInstance(sm, false);
  }
}
