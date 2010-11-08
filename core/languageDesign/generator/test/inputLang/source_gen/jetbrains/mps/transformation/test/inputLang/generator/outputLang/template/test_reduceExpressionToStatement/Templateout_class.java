package jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_reduceExpressionToStatement;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.TemplateDeclaration;
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
}
