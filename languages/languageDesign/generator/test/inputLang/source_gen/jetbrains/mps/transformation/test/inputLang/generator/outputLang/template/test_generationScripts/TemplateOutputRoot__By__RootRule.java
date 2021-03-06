package jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_generationScripts;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.TemplateDeclaration;
import jetbrains.mps.smodel.SNodePointer;
import java.util.Collection;
import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.generator.runtime.TemplateExecutionEnvironment;
import jetbrains.mps.generator.runtime.TemplateContext;
import jetbrains.mps.generator.runtime.GenerationException;
import jetbrains.mps.generator.runtime.TemplateUtil;

public class TemplateOutputRoot__By__RootRule implements TemplateDeclaration {
  private static SNodePointer template_l7bj61_a0a0 = new SNodePointer("r:00000000-0000-4000-0000-011c895905f6(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_generationScripts@generator)", "1195166061402");
  private static SNodePointer templateNode_l7bj61_a0a0a1a1 = new SNodePointer("r:00000000-0000-4000-0000-011c895905f6(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_generationScripts@generator)", "1195166061402");

  public TemplateOutputRoot__By__RootRule() {
  }

  public SNodePointer getTemplateNode() {
    return template_l7bj61_a0a0;
  }

  public Collection<SNode> apply(@NotNull final TemplateExecutionEnvironment environment, @NotNull final TemplateContext context) throws GenerationException {
    final SNode tnode1 = new SNode(environment.getOutputModel(), "jetbrains.mps.transformation.test.outputLang.structure.OutputRoot", false);
    try {
      environment.getTracer().pushTemplateNode(templateNode_l7bj61_a0a0a1a1);
      environment.nodeCopied(context, tnode1, "tpl/r:00000000-0000-4000-0000-011c895905f6/1195166061402");
      tnode1.setProperty("name", "OutputRoot_By_RootRule");
      tnode1.setProperty("text", "OutputRoot by RootRule");

    } finally {
      environment.getTracer().pushOutputNode(tnode1);
      environment.getTracer().closeTemplateNode(templateNode_l7bj61_a0a0a1a1);
    }
    return TemplateUtil.singletonList(tnode1);
  }
}
