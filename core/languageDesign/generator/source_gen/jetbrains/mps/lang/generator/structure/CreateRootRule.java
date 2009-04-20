package jetbrains.mps.lang.generator.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.lang.generator.structure.MappingLabelDeclaration;
import jetbrains.mps.lang.generator.structure.CreateRootRule_Condition;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CreateRootRule extends BaseConcept {
  public static final String concept = "jetbrains.mps.lang.generator.structure.CreateRootRule";
  public static final String TEMPLATE_NODE = "templateNode";
  public static final String LABEL = "label";
  public static final String CONDITION_FUNCTION = "conditionFunction";

  public CreateRootRule(SNode node) {
    super(node);
  }

  public INamedConcept getTemplateNode() {
    return (INamedConcept)this.getReferent(INamedConcept.class, CreateRootRule.TEMPLATE_NODE);
  }

  public void setTemplateNode(INamedConcept node) {
    super.setReferent(CreateRootRule.TEMPLATE_NODE, node);
  }

  public MappingLabelDeclaration getLabel() {
    return (MappingLabelDeclaration)this.getReferent(MappingLabelDeclaration.class, CreateRootRule.LABEL);
  }

  public void setLabel(MappingLabelDeclaration node) {
    super.setReferent(CreateRootRule.LABEL, node);
  }

  public CreateRootRule_Condition getConditionFunction() {
    return (CreateRootRule_Condition)this.getChild(CreateRootRule_Condition.class, CreateRootRule.CONDITION_FUNCTION);
  }

  public void setConditionFunction(CreateRootRule_Condition node) {
    super.setChild(CreateRootRule.CONDITION_FUNCTION, node);
  }


  public static CreateRootRule newInstance(SModel sm, boolean init) {
    return (CreateRootRule)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.generator.structure.CreateRootRule", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CreateRootRule newInstance(SModel sm) {
    return CreateRootRule.newInstance(sm, false);
  }

}
