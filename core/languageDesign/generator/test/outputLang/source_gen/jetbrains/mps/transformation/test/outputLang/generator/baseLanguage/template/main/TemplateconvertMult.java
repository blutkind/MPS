package jetbrains.mps.transformation.test.outputLang.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.TemplateDeclaration;
import jetbrains.mps.smodel.SNode;
import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.generator.runtime.TemplateExecutionEnvironment;
import jetbrains.mps.generator.runtime.TemplateContext;
import jetbrains.mps.generator.runtime.GenerationException;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import java.util.Collections;
import jetbrains.mps.generator.runtime.TemplateUtil;

public class TemplateconvertMult implements TemplateDeclaration {
  private SNode myLeft;
  private SNode myRight;

  public TemplateconvertMult(SNode left, SNode right) {
    this.myLeft = left;
    this.myRight = right;
  }

  public Collection<SNode> apply(@NotNull final TemplateExecutionEnvironment environment, @NotNull final TemplateContext context) throws GenerationException {
    TemplateContext contextWithParameters = context;
    final SNode tnode1 = new SNode(null, "jetbrains.mps.baseLanguage.structure.ExpressionStatement", false);
    // TODO notify environment 
    {
      final SNode tnode2 = new SNode(null, "jetbrains.mps.baseLanguage.structure.MulAssignmentExpression", false);
      // TODO notify environment 
      {
        final SNode inputNode3 = QueriesGenerated.sourceNodeQuery_4146564171992617089(null, new SourceSubstituteMacroNodeContext(contextWithParameters.getInput(), null, contextWithParameters, null));
        Collection<SNode> tlist4 = environment.copyNodes(Collections.singletonList(inputNode3), null);
        for (SNode child5 : tlist4) {
          tnode2.addChild("lValue", child5);
        }
      }
      {
        final SNode inputNode6 = QueriesGenerated.sourceNodeQuery_4146564171992617085(null, new SourceSubstituteMacroNodeContext(contextWithParameters.getInput(), null, contextWithParameters, null));
        Collection<SNode> tlist7 = environment.copyNodes(Collections.singletonList(inputNode6), null);
        for (SNode child8 : tlist7) {
          tnode2.addChild("rValue", child8);
        }
      }
      tnode1.addChild("expression", tnode2);
    }
    return TemplateUtil.singletonList(tnode1);
  }
}
