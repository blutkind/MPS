package jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_weaveManyToSingularChild;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.TemplateDeclaration;
import java.util.Collection;
import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.generator.runtime.TemplateExecutionEnvironment;
import jetbrains.mps.generator.runtime.TemplateContext;
import jetbrains.mps.generator.runtime.GenerationException;
import java.util.Collections;

public class Templatemap_outputNode implements TemplateDeclaration {
  public Templatemap_outputNode() {
  }

  public Collection<SNode> apply(@NotNull TemplateExecutionEnvironment environment, @NotNull TemplateContext context, String mappingName) throws GenerationException {
    SNode tnode1 = new SNode(null, "jetbrains.mps.transformation.test.outputLang.structure.OutputRoot", false);
    // TODO notify environment 
    tnode1.setProperty("name", "map_outputNode");
    tnode1.setProperty("text", "output root");
    {
      SNode tnode2 = new SNode(null, "jetbrains.mps.transformation.test.outputLang.structure.OutputNode", false);
      // TODO notify environment 
      tnode2.setProperty("text", "this is 'special child' in root template");
      tnode1.addChild("specialChild", tnode2);
    }
    return Collections.singletonList(tnode1);

  }
}
