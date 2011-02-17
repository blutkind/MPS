package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class OptionWithParam extends ExternalOptionDeclaration implements ISymbolConcept, INamedConcept, IDescribedConcept {
  public static final String concept = "jetbrains.mps.bash.structure.OptionWithParam";
  public static final String SYMBOL = "symbol";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String NAME = "name";
  public static final String DESCRIPTION = "description";
  public static final String _$ATTRIBUTE = "_$attribute";

  public OptionWithParam(SNode node) {
    super(node);
  }

  public String getSymbol() {
    return this.getProperty(OptionWithParam.SYMBOL);
  }

  public void setSymbol(String value) {
    this.setProperty(OptionWithParam.SYMBOL, value);
  }

  public String getShortDescription() {
    return this.getProperty(OptionWithParam.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(OptionWithParam.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(OptionWithParam.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(OptionWithParam.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(OptionWithParam.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(OptionWithParam.VIRTUAL_PACKAGE, value);
  }

  public String getName() {
    return this.getProperty(OptionWithParam.NAME);
  }

  public void setName(String value) {
    this.setProperty(OptionWithParam.NAME, value);
  }

  public String getDescription() {
    return this.getProperty(OptionWithParam.DESCRIPTION);
  }

  public void setDescription(String value) {
    this.setProperty(OptionWithParam.DESCRIPTION, value);
  }

  public int get_$attributesCount() {
    return this.getChildCount(OptionWithParam._$ATTRIBUTE);
  }

  public Iterator<Attribute> _$attributes() {
    return this.children(Attribute.class, OptionWithParam._$ATTRIBUTE);
  }

  public List<Attribute> get_$attributes() {
    return this.getChildren(Attribute.class, OptionWithParam._$ATTRIBUTE);
  }

  public void add_$attribute(Attribute node) {
    this.addChild(OptionWithParam._$ATTRIBUTE, node);
  }

  public void insert_$attribute(Attribute prev, Attribute node) {
    this.insertChild(prev, OptionWithParam._$ATTRIBUTE, node);
  }

  public static OptionWithParam newInstance(SModel sm, boolean init) {
    return (OptionWithParam) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bash.structure.OptionWithParam", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static OptionWithParam newInstance(SModel sm) {
    return OptionWithParam.newInstance(sm, false);
  }
}
