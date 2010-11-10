package jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_reduceOneToMany;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.TemplateDeclaration;
import jetbrains.mps.smodel.SNodePointer;
import java.util.Collection;
import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.generator.runtime.TemplateExecutionEnvironment;
import jetbrains.mps.generator.runtime.TemplateContext;
import jetbrains.mps.generator.runtime.GenerationException;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import jetbrains.mps.generator.runtime.TemplateUtil;

public class Templatereduce_InputNode_A implements TemplateDeclaration {
  private static SNodePointer loopMacroRef_9iqmnb_a0a0a1a0 = new SNodePointer("r:eca8e1c7-93fd-4ddf-9db6-91f9c2320691(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_reduceOneToMany@generator)", "3893401255414161782");

  public Templatereduce_InputNode_A() {
  }

  public Collection<SNode> apply(@NotNull final TemplateExecutionEnvironment environment, @NotNull final TemplateContext context) throws GenerationException {
    final List<SNode> tlist1 = new ArrayList();
    try {
      environment.getTracer().pushMacro(loopMacroRef_9iqmnb_a0a0a1a0);
      final Iterable<SNode> loopList1 = QueriesGenerated.sourceNodesQuery_3893401255414161783(environment.getOperationContext(), new SourceSubstituteMacroNodesContext(context.getInput(), null, null, context, environment.getGenerator()));
      for (SNode itnode1 : loopList1) {
        if (itnode1 == null) {
          continue;
        }
        boolean inputChanged1 = context.getInput() != itnode1;
        try {
          if (inputChanged1) {
            environment.getTracer().pushInputNode(itnode1);
          }
          TemplateContext context1 = context.subContext(null, itnode1);
          final SNode tnode2 = new SNode(null, "jetbrains.mps.transformation.test.outputLang.structure.OutputNode", false);
          // TODO notify environment 
          tnode2.setProperty("text", "child #1");
          if (tnode2 != null) {
            tlist1.add(tnode2);
          }
        } finally {
          if (inputChanged1) {
            environment.getTracer().closeInputNode(itnode1);
          }
        }
      }

    } finally {
      environment.getTracer().closeMacro(loopMacroRef_9iqmnb_a0a0a1a0);
    }
    final SNode tnode3 = new SNode(null, "jetbrains.mps.transformation.test.outputLang.structure.OutputNode", false);
    // TODO notify environment 
    tnode3.setProperty("text", "child #2");
    Collection<SNode> tlist4 = null;
    final SNodePointer templateNode4 = new SNodePointer("r:eca8e1c7-93fd-4ddf-9db6-91f9c2320691(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_reduceOneToMany@generator)", "1892993302480251689");
    try {
      environment.getTracer().pushTemplateNode(templateNode4);
      tlist4 = new Templatereduce_InputNode_A_included().apply(environment, context);
    } finally {
      environment.getTracer().pushTemplateNode(templateNode4);
    }
    Collection<SNode> tlist5 = null;
    try {
      environment.getTracer().pushSwitch(new SNodePointer("r:eca8e1c7-93fd-4ddf-9db6-91f9c2320691(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_reduceOneToMany@generator)", "1892993302480310366"));
      tlist5 = environment.processSwitch(null, context);

    } finally {
      // TODO close switch node 
    }
    return TemplateUtil.asList(tlist1, tnode3, tlist4, tlist5);
  }
}
