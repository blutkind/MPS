package jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_reduceExpressionToStatement;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.TemplateDeclaration;
import jetbrains.mps.smodel.SNodePointer;
import java.util.Collection;
import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.generator.runtime.TemplateExecutionEnvironment;
import jetbrains.mps.generator.runtime.TemplateContext;
import jetbrains.mps.generator.runtime.GenerationException;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import java.util.Collections;
import jetbrains.mps.generator.runtime.TemplateUtil;

public class Templateout_class implements TemplateDeclaration {
  private static SNodePointer copySrcMacro_b1jp4m_a0a0a1a5a3a0 = new SNodePointer("r:00000000-0000-4000-0000-011c895905f8(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_reduceExpressionToStatement@generator)", "1209150187920");

  public Templateout_class() {
  }

  public Collection<SNode> apply(@NotNull final TemplateExecutionEnvironment environment, @NotNull final TemplateContext context) throws GenerationException {
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
        Collection<SNode> tlist5 = null;
        try {
          environment.getTracer().pushMacro(copySrcMacro_b1jp4m_a0a0a1a5a3a0);
          final SNode copySrcInput5 = QueriesGenerated.sourceNodeQuery_1209150187921(environment.getOperationContext(), new SourceSubstituteMacroNodeContext(context.getInput(), null, context, environment.getGenerator()));
          tlist5 = environment.copyNodes(Collections.singletonList(copySrcInput5), null);
        } finally {
          environment.getTracer().closeMacro(copySrcMacro_b1jp4m_a0a0a1a5a3a0);
        }
        for (SNode child6 : tlist5) {
          tnode2.addChild("body", child6);
        }
      }
      tnode1.addChild("method", tnode2);
    }
    {
      final SNode tnode7 = new SNode(null, "jetbrains.mps.baseLanguage.structure.PublicVisibility", false);
      // TODO notify environment 
      tnode1.addChild("visibility", tnode7);
    }
    return TemplateUtil.singletonList(tnode1);

  }
}
