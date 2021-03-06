package jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_reduceOneToMany;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.TemplateSwitchMapping;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.generator.runtime.TemplateReductionRule;
import java.util.Collections;
import java.util.Collection;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.generator.runtime.TemplateExecutionEnvironment;
import jetbrains.mps.generator.runtime.TemplateContext;
import jetbrains.mps.generator.runtime.GenerationException;
import jetbrains.mps.generator.runtime.TemplateUtil;

public class Switchbetter__switch2 implements TemplateSwitchMapping {
  private static SNodePointer conseq_r4cs19_a0a0a3 = new SNodePointer("r:eca8e1c7-93fd-4ddf-9db6-91f9c2320691(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_reduceOneToMany@generator)", "8371596541809075901");
  private static SNodePointer templateNode_r4cs19_a0a0a2a3 = new SNodePointer("r:eca8e1c7-93fd-4ddf-9db6-91f9c2320691(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_reduceOneToMany@generator)", "8371596541809075903");

  public Switchbetter__switch2() {
  }

  public SNodePointer getSwitchNode() {
    return new SNodePointer("r:eca8e1c7-93fd-4ddf-9db6-91f9c2320691(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_reduceOneToMany@generator)", "8371596541809075900");
  }

  public SNodePointer getModifiesSwitch() {
    return new SNodePointer("r:eca8e1c7-93fd-4ddf-9db6-91f9c2320691(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_reduceOneToMany@generator)", "8371596541809066874");
  }

  public Iterable<TemplateReductionRule> getReductionRules() {
    return Collections.emptySet();
  }

  public Collection<SNode> applyDefault(final TemplateExecutionEnvironment environment, SNodePointer templateSwitch, String mappingLabel, final TemplateContext context) throws GenerationException {
    environment.getTracer().pushRuleConsequence(conseq_r4cs19_a0a0a3);
    final SNode tnode1 = new SNode(environment.getOutputModel(), "jetbrains.mps.baseLanguage.structure.NullLiteral", false);
    try {
      environment.getTracer().pushTemplateNode(templateNode_r4cs19_a0a0a2a3);
      environment.nodeCopied(context, tnode1, "tpl/r:eca8e1c7-93fd-4ddf-9db6-91f9c2320691/8371596541809075903");

    } finally {
      environment.getTracer().pushOutputNode(tnode1);
      environment.getTracer().closeTemplateNode(templateNode_r4cs19_a0a0a2a3);
    }
    return TemplateUtil.singletonList(tnode1);
  }

  public void processNull(TemplateExecutionEnvironment environment, SNodePointer templateSwitch, TemplateContext context) {
  }
}
