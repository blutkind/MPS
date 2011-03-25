package jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_ReduceInheritors;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.TemplateDeclarationWeavingAware;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.generator.runtime.TemplateExecutionEnvironment;
import jetbrains.mps.generator.runtime.TemplateContext;
import jetbrains.mps.generator.runtime.GenerationException;
import java.util.Collection;
import jetbrains.mps.generator.runtime.TemplateUtil;

public class Templateweave__InputRoot implements TemplateDeclarationWeavingAware {
  private static SNodePointer templateNode_ww46pe_a0a0a1a1 = new SNodePointer("r:00000000-0000-4000-0000-011c895905f9(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_ReduceInheritors@generator)", "8417539822878724216");
  private static SNodePointer templateNode_ww46pe_a0a0a1a2 = new SNodePointer("r:00000000-0000-4000-0000-011c895905f9(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_ReduceInheritors@generator)", "8417539822878724215");
  private static SNodePointer weaveTfConst_ww46pe_a0b0e = new SNodePointer("r:00000000-0000-4000-0000-011c895905f9(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_ReduceInheritors@generator)", "8417539822878724217");
  private static SNodePointer weaveTfConst_ww46pe_a0e0e = new SNodePointer("r:00000000-0000-4000-0000-011c895905f9(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_ReduceInheritors@generator)", "8417539822878724218");

  public Templateweave__InputRoot() {
  }

  public SNodePointer getTemplateNode() {
    return new SNodePointer("r:00000000-0000-4000-0000-011c895905f9(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_ReduceInheritors@generator)", "8417539822878724212");
  }

  protected SNode applyPart0(@NotNull final TemplateExecutionEnvironment environment, @NotNull final TemplateContext context) throws GenerationException {
    final SNode tnode1 = new SNode(environment.getOutputModel(), "jetbrains.mps.transformation.test.outputLang.structure.OutputNode", false);
    try {
      environment.getTracer().pushTemplateNode(templateNode_ww46pe_a0a0a1a1);
      environment.nodeCopied(context, tnode1, "tpl/r:00000000-0000-4000-0000-011c895905f9/8417539822878724216");
      tnode1.setProperty("text", "weaved N1");

    } finally {
      environment.getTracer().pushOutputNode(tnode1);
      environment.getTracer().closeTemplateNode(templateNode_ww46pe_a0a0a1a1);
    }
    return tnode1;
  }

  protected SNode applyPart1(@NotNull final TemplateExecutionEnvironment environment, @NotNull final TemplateContext context) throws GenerationException {
    final SNode tnode2 = new SNode(environment.getOutputModel(), "jetbrains.mps.transformation.test.outputLang.structure.OutputNode", false);
    try {
      environment.getTracer().pushTemplateNode(templateNode_ww46pe_a0a0a1a2);
      environment.nodeCopied(context, tnode2, "tpl/r:00000000-0000-4000-0000-011c895905f9/8417539822878724215");
      tnode2.setProperty("text", "weaved N2");

    } finally {
      environment.getTracer().pushOutputNode(tnode2);
      environment.getTracer().closeTemplateNode(templateNode_ww46pe_a0a0a1a2);
    }
    return tnode2;
  }

  public Collection<SNode> apply(@NotNull TemplateExecutionEnvironment environment, @NotNull TemplateContext context) throws GenerationException {
    return TemplateUtil.asList(applyPart0(environment, context), applyPart1(environment, context));
  }

  public Collection<SNode> weave(@NotNull TemplateExecutionEnvironment environment, @NotNull TemplateContext context, @NotNull SNode outputContextNode) throws GenerationException {
    SNode tnodepart0 = applyPart0(environment, context);
    SNodePointer weaveTf0 = weaveTfConst_ww46pe_a0b0e;
    environment.weaveNode(outputContextNode, "outputChild", tnodepart0, weaveTf0, context.getInput());
    SNode tnodepart1 = applyPart1(environment, context);
    SNodePointer weaveTf1 = weaveTfConst_ww46pe_a0e0e;
    environment.weaveNode(outputContextNode, "outputChild", tnodepart1, weaveTf1, context.getInput());
    return TemplateUtil.asList(tnodepart0, tnodepart1);
  }
}
