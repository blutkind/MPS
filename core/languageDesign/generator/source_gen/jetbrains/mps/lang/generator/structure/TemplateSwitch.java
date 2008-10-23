package jetbrains.mps.lang.generator.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TemplateSwitch extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.lang.generator.structure.TemplateSwitch";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String MODIFIED_SWITCH = "modifiedSwitch";
  public static final String DEFAULT_CONSEQUENCE = "defaultConsequence";
  public static final String REDUCTION_MAPPING_RULE = "reductionMappingRule";

  public TemplateSwitch(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(TemplateSwitch.NAME);
  }

  public void setName(String value) {
    this.setProperty(TemplateSwitch.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(TemplateSwitch.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(TemplateSwitch.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(TemplateSwitch.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(TemplateSwitch.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(TemplateSwitch.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(TemplateSwitch.VIRTUAL_PACKAGE, value);
  }

  public TemplateSwitch getModifiedSwitch() {
    return (TemplateSwitch)this.getReferent(TemplateSwitch.MODIFIED_SWITCH);
  }

  public void setModifiedSwitch(TemplateSwitch node) {
    super.setReferent(TemplateSwitch.MODIFIED_SWITCH, node);
  }

  public RuleConsequence getDefaultConsequence() {
    return (RuleConsequence)this.getChild(TemplateSwitch.DEFAULT_CONSEQUENCE);
  }

  public void setDefaultConsequence(RuleConsequence node) {
    super.setChild(TemplateSwitch.DEFAULT_CONSEQUENCE, node);
  }

  public int getReductionMappingRulesCount() {
    return this.getChildCount(TemplateSwitch.REDUCTION_MAPPING_RULE);
  }

  public Iterator<Reduction_MappingRule> reductionMappingRules() {
    return this.children(TemplateSwitch.REDUCTION_MAPPING_RULE);
  }

  public List<Reduction_MappingRule> getReductionMappingRules() {
    return this.getChildren(TemplateSwitch.REDUCTION_MAPPING_RULE);
  }

  public void addReductionMappingRule(Reduction_MappingRule node) {
    this.addChild(TemplateSwitch.REDUCTION_MAPPING_RULE, node);
  }

  public void insertReductionMappingRule(Reduction_MappingRule prev, Reduction_MappingRule node) {
    this.insertChild(prev, TemplateSwitch.REDUCTION_MAPPING_RULE, node);
  }


  public static TemplateSwitch newInstance(SModel sm, boolean init) {
    return (TemplateSwitch)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.generator.structure.TemplateSwitch", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TemplateSwitch newInstance(SModel sm) {
    return TemplateSwitch.newInstance(sm, false);
  }

}
