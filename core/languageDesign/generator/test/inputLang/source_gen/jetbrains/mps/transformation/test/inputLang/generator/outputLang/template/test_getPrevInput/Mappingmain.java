package jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_getPrevInput;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.TemplateMappingConfiguration;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.generator.runtime.TemplateRootMappingRule;
import jetbrains.mps.generator.runtime.TemplateUtil;
import jetbrains.mps.generator.runtime.TemplateReductionRule;
import java.util.Collections;
import jetbrains.mps.generator.runtime.TemplateCreateRootRule;
import jetbrains.mps.generator.runtime.TemplateWeavingRule;
import jetbrains.mps.generator.runtime.TemplateDropRootRule;
import java.util.Collection;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.generator.runtime.TemplateExecutionEnvironment;
import jetbrains.mps.generator.runtime.TemplateContext;
import jetbrains.mps.generator.runtime.GenerationException;
import jetbrains.mps.generator.template.BaseMappingRuleContext;

public class Mappingmain implements TemplateMappingConfiguration {
  private static SNodePointer rootMappingRule_417xrn_a0a0a = new SNodePointer("r:00000000-0000-4000-0000-011c895905f7(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_getPrevInput@generator)", "1202255161953");
  private static SNodePointer rootMappingRule_417xrn_b0b0a1a1a = new SNodePointer("r:00000000-0000-4000-0000-011c895905f7(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_getPrevInput@generator)", "1202255161953");
  private static SNodePointer rootMappingRule_417xrn_a0a0b = new SNodePointer("r:00000000-0000-4000-0000-011c895905f7(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_getPrevInput@generator)", "1202338801828");
  private static SNodePointer rootMappingRule_417xrn_b0b0a1a1b = new SNodePointer("r:00000000-0000-4000-0000-011c895905f7(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_getPrevInput@generator)", "1202338801828");

  private final Iterable<TemplateRootMappingRule> rootRules;

  public Mappingmain() {
    rootRules = TemplateUtil.<TemplateRootMappingRule>asIterable(new Mappingmain.RootMappingRule0(), new Mappingmain.RootMappingRule1());
  }

  public SNodePointer getMappingNode() {
    return new SNodePointer("r:00000000-0000-4000-0000-011c895905f7(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_getPrevInput@generator)", "1202255161944");
  }

  public Iterable<TemplateReductionRule> getReductionRules() {
    return Collections.emptySet();
  }

  public Iterable<TemplateCreateRootRule> getCreateRules() {
    return Collections.emptySet();
  }

  public Iterable<TemplateRootMappingRule> getRootRules() {
    return rootRules;
  }

  public Iterable<TemplateWeavingRule> getWeavingRules() {
    return Collections.emptySet();
  }

  public Iterable<TemplateDropRootRule> getDropRules() {
    return Collections.emptySet();
  }

  public class RootMappingRule0 implements TemplateRootMappingRule {
    public RootMappingRule0() {
    }

    public SNodePointer getRuleNode() {
      return rootMappingRule_417xrn_a0a0a;
    }

    public Collection<SNode> apply(final TemplateExecutionEnvironment environment, final TemplateContext context) throws GenerationException {
      final String mappingName = "ROOT INPUT";
      if (!(QueriesGenerated.baseMappingRule_Condition_1202255161954(environment.getOperationContext(), new BaseMappingRuleContext(context.getInput(), rootMappingRule_417xrn_b0b0a1a1a, environment.getGenerator())))) {
        return null;
      }
      return new TemplateOutputRoot_1().apply(environment, context);
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

  public class RootMappingRule1 implements TemplateRootMappingRule {
    public RootMappingRule1() {
    }

    public SNodePointer getRuleNode() {
      return rootMappingRule_417xrn_a0a0b;
    }

    public Collection<SNode> apply(final TemplateExecutionEnvironment environment, final TemplateContext context) throws GenerationException {
      final String mappingName = "ROOT INPUT";
      if (!(QueriesGenerated.baseMappingRule_Condition_1202338801829(environment.getOperationContext(), new BaseMappingRuleContext(context.getInput(), rootMappingRule_417xrn_b0b0a1a1b, environment.getGenerator())))) {
        return null;
      }
      return new TemplateOutputRoot_2().apply(environment, context);
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
