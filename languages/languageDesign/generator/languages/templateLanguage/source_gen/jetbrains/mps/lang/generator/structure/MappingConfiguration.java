package jetbrains.mps.lang.generator.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.baseLanguage.structure.IMemberContainer;
import jetbrains.mps.lang.structure.structure.IConceptAspect;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.lang.core.structure.Attribute;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MappingConfiguration extends BaseConcept implements INamedConcept, IMemberContainer, IConceptAspect {
  public static final String concept = "jetbrains.mps.lang.generator.structure.MappingConfiguration";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String TOP_PRIORITY_GROUP = "topPriorityGroup";
  public static final String CONDITION = "condition";
  public static final String ROOT_MAPPING_RULE = "rootMappingRule";
  public static final String WEAVING_MAPPING_RULE = "weavingMappingRule";
  public static final String REDUCTION_MAPPING_RULE = "reductionMappingRule";
  public static final String PATTERN_REDUCTION_RULE = "patternReductionRule";
  public static final String CREATE_ROOT_RULE = "createRootRule";
  public static final String DROP_ROOT_RULE = "dropRootRule";
  public static final String PRE_MAPPING_SCRIPT = "preMappingScript";
  public static final String POST_MAPPING_SCRIPT = "postMappingScript";
  public static final String MAPPING_LABEL = "mappingLabel";
  public static final String GENERATION_PARAMETERS = "generationParameters";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public MappingConfiguration(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(MappingConfiguration.NAME);
  }

  public void setName(String value) {
    this.setProperty(MappingConfiguration.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(MappingConfiguration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(MappingConfiguration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(MappingConfiguration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(MappingConfiguration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(MappingConfiguration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(MappingConfiguration.VIRTUAL_PACKAGE, value);
  }

  public boolean getTopPriorityGroup() {
    return this.getBooleanProperty(MappingConfiguration.TOP_PRIORITY_GROUP);
  }

  public void setTopPriorityGroup(boolean value) {
    this.setBooleanProperty(MappingConfiguration.TOP_PRIORITY_GROUP, value);
  }

  public MappingConfiguration_Condition getCondition() {
    return (MappingConfiguration_Condition) this.getChild(MappingConfiguration_Condition.class, MappingConfiguration.CONDITION);
  }

  public void setCondition(MappingConfiguration_Condition node) {
    super.setChild(MappingConfiguration.CONDITION, node);
  }

  public int getRootMappingRulesCount() {
    return this.getChildCount(MappingConfiguration.ROOT_MAPPING_RULE);
  }

  public Iterator<Root_MappingRule> rootMappingRules() {
    return this.children(Root_MappingRule.class, MappingConfiguration.ROOT_MAPPING_RULE);
  }

  public List<Root_MappingRule> getRootMappingRules() {
    return this.getChildren(Root_MappingRule.class, MappingConfiguration.ROOT_MAPPING_RULE);
  }

  public void addRootMappingRule(Root_MappingRule node) {
    this.addChild(MappingConfiguration.ROOT_MAPPING_RULE, node);
  }

  public void insertRootMappingRule(Root_MappingRule prev, Root_MappingRule node) {
    this.insertChild(prev, MappingConfiguration.ROOT_MAPPING_RULE, node);
  }

  public int getWeavingMappingRulesCount() {
    return this.getChildCount(MappingConfiguration.WEAVING_MAPPING_RULE);
  }

  public Iterator<Weaving_MappingRule> weavingMappingRules() {
    return this.children(Weaving_MappingRule.class, MappingConfiguration.WEAVING_MAPPING_RULE);
  }

  public List<Weaving_MappingRule> getWeavingMappingRules() {
    return this.getChildren(Weaving_MappingRule.class, MappingConfiguration.WEAVING_MAPPING_RULE);
  }

  public void addWeavingMappingRule(Weaving_MappingRule node) {
    this.addChild(MappingConfiguration.WEAVING_MAPPING_RULE, node);
  }

  public void insertWeavingMappingRule(Weaving_MappingRule prev, Weaving_MappingRule node) {
    this.insertChild(prev, MappingConfiguration.WEAVING_MAPPING_RULE, node);
  }

  public int getReductionMappingRulesCount() {
    return this.getChildCount(MappingConfiguration.REDUCTION_MAPPING_RULE);
  }

  public Iterator<Reduction_MappingRule> reductionMappingRules() {
    return this.children(Reduction_MappingRule.class, MappingConfiguration.REDUCTION_MAPPING_RULE);
  }

  public List<Reduction_MappingRule> getReductionMappingRules() {
    return this.getChildren(Reduction_MappingRule.class, MappingConfiguration.REDUCTION_MAPPING_RULE);
  }

  public void addReductionMappingRule(Reduction_MappingRule node) {
    this.addChild(MappingConfiguration.REDUCTION_MAPPING_RULE, node);
  }

  public void insertReductionMappingRule(Reduction_MappingRule prev, Reduction_MappingRule node) {
    this.insertChild(prev, MappingConfiguration.REDUCTION_MAPPING_RULE, node);
  }

  public int getPatternReductionRulesCount() {
    return this.getChildCount(MappingConfiguration.PATTERN_REDUCTION_RULE);
  }

  public Iterator<PatternReduction_MappingRule> patternReductionRules() {
    return this.children(PatternReduction_MappingRule.class, MappingConfiguration.PATTERN_REDUCTION_RULE);
  }

  public List<PatternReduction_MappingRule> getPatternReductionRules() {
    return this.getChildren(PatternReduction_MappingRule.class, MappingConfiguration.PATTERN_REDUCTION_RULE);
  }

  public void addPatternReductionRule(PatternReduction_MappingRule node) {
    this.addChild(MappingConfiguration.PATTERN_REDUCTION_RULE, node);
  }

  public void insertPatternReductionRule(PatternReduction_MappingRule prev, PatternReduction_MappingRule node) {
    this.insertChild(prev, MappingConfiguration.PATTERN_REDUCTION_RULE, node);
  }

  public int getCreateRootRulesCount() {
    return this.getChildCount(MappingConfiguration.CREATE_ROOT_RULE);
  }

  public Iterator<CreateRootRule> createRootRules() {
    return this.children(CreateRootRule.class, MappingConfiguration.CREATE_ROOT_RULE);
  }

  public List<CreateRootRule> getCreateRootRules() {
    return this.getChildren(CreateRootRule.class, MappingConfiguration.CREATE_ROOT_RULE);
  }

  public void addCreateRootRule(CreateRootRule node) {
    this.addChild(MappingConfiguration.CREATE_ROOT_RULE, node);
  }

  public void insertCreateRootRule(CreateRootRule prev, CreateRootRule node) {
    this.insertChild(prev, MappingConfiguration.CREATE_ROOT_RULE, node);
  }

  public int getDropRootRulesCount() {
    return this.getChildCount(MappingConfiguration.DROP_ROOT_RULE);
  }

  public Iterator<DropRootRule> dropRootRules() {
    return this.children(DropRootRule.class, MappingConfiguration.DROP_ROOT_RULE);
  }

  public List<DropRootRule> getDropRootRules() {
    return this.getChildren(DropRootRule.class, MappingConfiguration.DROP_ROOT_RULE);
  }

  public void addDropRootRule(DropRootRule node) {
    this.addChild(MappingConfiguration.DROP_ROOT_RULE, node);
  }

  public void insertDropRootRule(DropRootRule prev, DropRootRule node) {
    this.insertChild(prev, MappingConfiguration.DROP_ROOT_RULE, node);
  }

  public int getPreMappingScriptsCount() {
    return this.getChildCount(MappingConfiguration.PRE_MAPPING_SCRIPT);
  }

  public Iterator<MappingScriptReference> preMappingScripts() {
    return this.children(MappingScriptReference.class, MappingConfiguration.PRE_MAPPING_SCRIPT);
  }

  public List<MappingScriptReference> getPreMappingScripts() {
    return this.getChildren(MappingScriptReference.class, MappingConfiguration.PRE_MAPPING_SCRIPT);
  }

  public void addPreMappingScript(MappingScriptReference node) {
    this.addChild(MappingConfiguration.PRE_MAPPING_SCRIPT, node);
  }

  public void insertPreMappingScript(MappingScriptReference prev, MappingScriptReference node) {
    this.insertChild(prev, MappingConfiguration.PRE_MAPPING_SCRIPT, node);
  }

  public int getPostMappingScriptsCount() {
    return this.getChildCount(MappingConfiguration.POST_MAPPING_SCRIPT);
  }

  public Iterator<MappingScriptReference> postMappingScripts() {
    return this.children(MappingScriptReference.class, MappingConfiguration.POST_MAPPING_SCRIPT);
  }

  public List<MappingScriptReference> getPostMappingScripts() {
    return this.getChildren(MappingScriptReference.class, MappingConfiguration.POST_MAPPING_SCRIPT);
  }

  public void addPostMappingScript(MappingScriptReference node) {
    this.addChild(MappingConfiguration.POST_MAPPING_SCRIPT, node);
  }

  public void insertPostMappingScript(MappingScriptReference prev, MappingScriptReference node) {
    this.insertChild(prev, MappingConfiguration.POST_MAPPING_SCRIPT, node);
  }

  public int getMappingLabelsCount() {
    return this.getChildCount(MappingConfiguration.MAPPING_LABEL);
  }

  public Iterator<MappingLabelDeclaration> mappingLabels() {
    return this.children(MappingLabelDeclaration.class, MappingConfiguration.MAPPING_LABEL);
  }

  public List<MappingLabelDeclaration> getMappingLabels() {
    return this.getChildren(MappingLabelDeclaration.class, MappingConfiguration.MAPPING_LABEL);
  }

  public void addMappingLabel(MappingLabelDeclaration node) {
    this.addChild(MappingConfiguration.MAPPING_LABEL, node);
  }

  public void insertMappingLabel(MappingLabelDeclaration prev, MappingLabelDeclaration node) {
    this.insertChild(prev, MappingConfiguration.MAPPING_LABEL, node);
  }

  public int getGenerationParametersesCount() {
    return this.getChildCount(MappingConfiguration.GENERATION_PARAMETERS);
  }

  public Iterator<GeneratorParameterReference> generationParameterses() {
    return this.children(GeneratorParameterReference.class, MappingConfiguration.GENERATION_PARAMETERS);
  }

  public List<GeneratorParameterReference> getGenerationParameterses() {
    return this.getChildren(GeneratorParameterReference.class, MappingConfiguration.GENERATION_PARAMETERS);
  }

  public void addGenerationParameters(GeneratorParameterReference node) {
    this.addChild(MappingConfiguration.GENERATION_PARAMETERS, node);
  }

  public void insertGenerationParameters(GeneratorParameterReference prev, GeneratorParameterReference node) {
    this.insertChild(prev, MappingConfiguration.GENERATION_PARAMETERS, node);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(MappingConfiguration.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, MappingConfiguration.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, MappingConfiguration.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(MappingConfiguration.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, MappingConfiguration.SMODEL_ATTRIBUTE, node);
  }

  public static MappingConfiguration newInstance(SModel sm, boolean init) {
    return (MappingConfiguration) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.generator.structure.MappingConfiguration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MappingConfiguration newInstance(SModel sm) {
    return MappingConfiguration.newInstance(sm, false);
  }
}
