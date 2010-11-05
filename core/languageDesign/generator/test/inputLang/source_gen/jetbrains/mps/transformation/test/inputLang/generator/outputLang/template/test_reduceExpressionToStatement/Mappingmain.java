package jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_reduceExpressionToStatement;

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
import jetbrains.mps.generator.runtime.TemplateUtil;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import java.util.Collections;

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
      if (!(QueriesGenerated.baseMappingRule_Condition_1209150617830(environment.getOperationContext(), new BaseMappingRuleContext(context.getInput(), null, null)))) {
        return null;
      }
      final SNode tnode1 = new SNode(null, "jetbrains.mps.baseLanguage.structure.ExpressionStatement", false);
      // TODO notify environment 
      {
        final SNode tnode2 = new SNode(null, "jetbrains.mps.baseLanguage.structure.StringLiteral", false);
        // TODO notify environment 
        tnode2.setProperty("value", "my expression");
        tnode1.addChild("expression", tnode2);
      }
      return TemplateUtil.singletonList(tnode1);
    }

    public boolean applyToInheritors() {
      return false;
    }

    public String getApplicableConcept() {
      return "jetbrains.mps.transformation.test.inputLang.structure.ExpressionToReduceToStatement";
    }
  }

  public class RootMappingRule0 implements TemplateRootMappingRule {
    public RootMappingRule0() {
    }

    public Collection<SNode> apply(final TemplateExecutionEnvironment environment, final TemplateContext context) throws GenerationException {
      if (!(QueriesGenerated.baseMappingRule_Condition_1209150502311(environment.getOperationContext(), new BaseMappingRuleContext(context.getInput(), null, null)))) {
        return null;
      }
      final SNode tnode1 = new SNode(null, "jetbrains.mps.baseLanguage.structure.ClassConcept", false);
      // TODO notify environment 
      tnode1.setProperty("name", "out_class");
      {
        final SNode tnode2 = new SNode(null, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration", false);
        // TODO notify environment 
        tnode2.setProperty("name", "method");
        {
          final SNode tnode3 = new SNode(null, "jetbrains.mps.baseLanguage.structure.VoidType", false);
          // TODO notify environment 
          tnode2.addChild("returnType", tnode3);
        }
        {
          final SNode tnode4 = new SNode(null, "jetbrains.mps.baseLanguage.structure.PublicVisibility", false);
          // TODO notify environment 
          tnode2.addChild("visibility", tnode4);
        }
        {
          final SNode inputNode5 = QueriesGenerated.sourceNodeQuery_1209150187921(null, new SourceSubstituteMacroNodeContext(context.getInput(), null, context, null));
          Collection<SNode> tlist6 = environment.copyNodes(Collections.singletonList(inputNode5), null);
          for (SNode child7 : tlist6) {
            tnode2.addChild("body", child7);
          }
        }
        tnode1.addChild("method", tnode2);
      }
      {
        final SNode tnode8 = new SNode(null, "jetbrains.mps.baseLanguage.structure.PublicVisibility", false);
        // TODO notify environment 
        tnode1.addChild("visibility", tnode8);
      }
      return TemplateUtil.singletonList(tnode1);
    }

    public boolean applyToInheritors() {
      return false;
    }

    public String getApplicableConcept() {
      return "jetbrains.mps.transformation.test.inputLang.structure.InputRootWithStatementList";
    }

    public boolean keepSourceRoot() {
      return false;
    }
  }
}
