package jetbrains.mps.lang.generator.generationContext.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class GenerationContextOp_GetCopiedOutputByInput extends GenerationContextOp_Base {
  public static final String concept = "jetbrains.mps.lang.generator.generationContext.structure.GenerationContextOp_GetCopiedOutputByInput";
  public static final String INPUT_NODE = "inputNode";

  public GenerationContextOp_GetCopiedOutputByInput(SNode node) {
    super(node);
  }

  public Expression getInputNode() {
    return (Expression)this.getChild(Expression.class, GenerationContextOp_GetCopiedOutputByInput.INPUT_NODE);
  }

  public void setInputNode(Expression node) {
    super.setChild(GenerationContextOp_GetCopiedOutputByInput.INPUT_NODE, node);
  }


  public static GenerationContextOp_GetCopiedOutputByInput newInstance(SModel sm, boolean init) {
    return (GenerationContextOp_GetCopiedOutputByInput)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.generator.generationContext.structure.GenerationContextOp_GetCopiedOutputByInput", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static GenerationContextOp_GetCopiedOutputByInput newInstance(SModel sm) {
    return GenerationContextOp_GetCopiedOutputByInput.newInstance(sm, false);
  }

}
