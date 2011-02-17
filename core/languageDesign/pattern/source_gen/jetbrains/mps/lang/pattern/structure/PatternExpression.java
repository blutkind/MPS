package jetbrains.mps.lang.pattern.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.lang.core.structure.IMetaLevelChanger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.core.structure.BaseConcept;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PatternExpression extends Expression implements IMetaLevelChanger {
  public static final String concept = "jetbrains.mps.lang.pattern.structure.PatternExpression";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String PATTERN_NODE = "patternNode";
  public static final String _$ATTRIBUTE = "_$attribute";

  public PatternExpression(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(PatternExpression.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(PatternExpression.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(PatternExpression.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(PatternExpression.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(PatternExpression.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(PatternExpression.VIRTUAL_PACKAGE, value);
  }

  public BaseConcept getPatternNode() {
    return (BaseConcept) this.getChild(BaseConcept.class, PatternExpression.PATTERN_NODE);
  }

  public void setPatternNode(BaseConcept node) {
    super.setChild(PatternExpression.PATTERN_NODE, node);
  }

  public int get_$attributesCount() {
    return this.getChildCount(PatternExpression._$ATTRIBUTE);
  }

  public Iterator<Attribute> _$attributes() {
    return this.children(Attribute.class, PatternExpression._$ATTRIBUTE);
  }

  public List<Attribute> get_$attributes() {
    return this.getChildren(Attribute.class, PatternExpression._$ATTRIBUTE);
  }

  public void add_$attribute(Attribute node) {
    this.addChild(PatternExpression._$ATTRIBUTE, node);
  }

  public void insert_$attribute(Attribute prev, Attribute node) {
    this.insertChild(prev, PatternExpression._$ATTRIBUTE, node);
  }

  public static PatternExpression newInstance(SModel sm, boolean init) {
    return (PatternExpression) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.pattern.structure.PatternExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PatternExpression newInstance(SModel sm) {
    return PatternExpression.newInstance(sm, false);
  }
}
