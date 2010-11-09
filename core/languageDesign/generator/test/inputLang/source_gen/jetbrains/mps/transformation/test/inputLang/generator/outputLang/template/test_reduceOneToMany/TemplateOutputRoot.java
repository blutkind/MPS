package jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_reduceOneToMany;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.TemplateDeclaration;
import java.util.Collection;
import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.generator.runtime.TemplateExecutionEnvironment;
import jetbrains.mps.generator.runtime.TemplateContext;
import jetbrains.mps.generator.runtime.GenerationException;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import jetbrains.mps.generator.runtime.TemplateUtil;

public class TemplateOutputRoot implements TemplateDeclaration {
  public TemplateOutputRoot() {
  }

  public Collection<SNode> apply(@NotNull final TemplateExecutionEnvironment environment, @NotNull final TemplateContext context) throws GenerationException {
    final SNode tnode1 = new SNode(null, "jetbrains.mps.transformation.test.outputLang.structure.OutputRoot", false);
    // TODO notify environment 
    tnode1.setProperty("name", "OutputRoot");
    tnode1.setProperty("text", "chilren were generated from a single child in input node.");
    {
      final Iterable<SNode> copyListInput2 = QueriesGenerated.sourceNodesQuery_3893401255414086894(environment.getOperationContext(), new SourceSubstituteMacroNodesContext(context.getInput(), null, null, context, environment.getGenerator()));
      Collection<SNode> tlist2 = environment.copyNodes(copyListInput2, null);
      for (SNode child3 : tlist2) {
        tnode1.addChild("outputChild", child3);
      }
    }
    return TemplateUtil.singletonList(tnode1);

  }
}
