package jetbrains.mps.transformation.test.outputLang.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.TemplateDeclaration;
import jetbrains.mps.smodel.SNode;
import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.generator.runtime.TemplateExecutionEnvironment;
import jetbrains.mps.generator.runtime.TemplateContext;
import jetbrains.mps.generator.runtime.GenerationException;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;
import jetbrains.mps.generator.runtime.TemplateUtil;

public class Templateprocess42 implements TemplateDeclaration {
  private SNode myNode;

  public Templateprocess42(SNode node) {
    this.myNode = node;
  }

  public Collection<SNode> apply(@NotNull final TemplateExecutionEnvironment environment, @NotNull final TemplateContext context) throws GenerationException {
    TemplateContext contextWithParameters = context;
    final SNode tnode1 = new SNode(null, "jetbrains.mps.baseLanguage.structure.PlusExpression", false);
    // TODO notify environment 
    {
      final SNode tnode2 = new SNode(null, "jetbrains.mps.baseLanguage.structure.IntegerConstant", false);
      // TODO notify environment 
      tnode2.setProperty("value", "58");
      tnode1.addChild("leftExpression", tnode2);
    }
    {
      final SNode tnode3 = new SNode(null, "jetbrains.mps.baseLanguage.structure.ParenthesizedExpression", false);
      // TODO notify environment 
      {
        final SNode tnode4 = new SNode(null, "jetbrains.mps.baseLanguage.structure.DotExpression", false);
        // TODO notify environment 
        {
          final SNode tnode5 = new SNode(null, "jetbrains.mps.baseLanguage.structure.StringLiteral", false);
          // TODO notify environment 
          tnode5.setProperty("value", (String) QueriesGenerated.propertyMacro_GetPropertyValue_5857536350883039219(null, new PropertyMacroContext(contextWithParameters.getInput(), null, null, contextWithParameters, null)));
          tnode4.addChild("operand", tnode5);
        }
        {
          final SNode tnode6 = new SNode(null, "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation", false);
          // TODO notify environment 
          tnode6.addReference(SReference.create("baseMethodDeclaration", tnode6, SModelReference.fromString("f:java_stub#java.lang(java.lang@java_stub)"), SNodeId.fromString("~String.length():int")));
          tnode4.addChild("operation", tnode6);
        }
        tnode3.addChild("expression", tnode4);
      }
      tnode1.addChild("rightExpression", tnode3);
    }
    return TemplateUtil.singletonList(tnode1);
  }
}
