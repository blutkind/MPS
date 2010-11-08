package jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_reduceOneToMany;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.TemplateMappingConfiguration;
import java.util.Collection;
import jetbrains.mps.generator.runtime.TemplateReductionRule;
import jetbrains.mps.generator.runtime.TemplateCreateRootRule;
import jetbrains.mps.generator.runtime.TemplateRootMappingRule;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.generator.runtime.TemplateExecutionEnvironment;
import jetbrains.mps.generator.runtime.TemplateContext;
import jetbrains.mps.generator.runtime.GenerationException;
import jetbrains.mps.generator.template.BaseMappingRuleContext;

public class Mappingmain implements TemplateMappingConfiguration {
  public Mappingmain() {
  }

  public Collection<TemplateReductionRule> getReductionRules() {
    return null;
  }

  public Collection<TemplateCreateRootRule> getCreateRules() {
    return null;
  }

  public Collection<TemplateRootMappingRule> getRootRules() {
    return null;
  }

  public class ReductionRule0 implements TemplateReductionRule {
    public ReductionRule0() {
    }

    public Collection<SNode> apply(final TemplateExecutionEnvironment environment, final TemplateContext context) throws GenerationException {
      if (!(QueriesGenerated.baseMappingRule_Condition_3893401255414132234(environment.getOperationContext(), new BaseMappingRuleContext(context.getInput(), null, null)))) {
        return null;
      }
      Collection<SNode> tlist1 = new Templatereduce_InputNode_A().apply(environment, context);
      return tlist1;
    }

    public boolean applyToInheritors() {
      return false;
    }

    public String getApplicableConcept() {
      return "jetbrains.mps.transformation.test.inputLang.structure.InputNode_A";
    }
  }

  public class RootMappingRule0 implements TemplateRootMappingRule {
    public RootMappingRule0() {
    }

    public Collection<SNode> apply(final TemplateExecutionEnvironment environment, final TemplateContext context) throws GenerationException {
      if (!(QueriesGenerated.baseMappingRule_Condition_3893401255414129777(environment.getOperationContext(), new BaseMappingRuleContext(context.getInput(), null, null)))) {
        return null;
      }
      return new TemplateOutputRoot().apply(environment, context);
    }

    public boolean applyToInheritors() {
      return false;
    }

    public String getApplicableConcept() {
      return "jetbrains.mps.transformation.test.inputLang.structure.InputRoot";
    }

    public boolean keepSourceRoot() {
      return false;
    }
  }
}
