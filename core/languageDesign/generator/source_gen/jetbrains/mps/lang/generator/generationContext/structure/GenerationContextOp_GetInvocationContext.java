package jetbrains.mps.lang.generator.generationContext.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class GenerationContextOp_GetInvocationContext extends GenerationContextOp_Base {
  public static final String concept = "jetbrains.mps.lang.generator.generationContext.structure.GenerationContextOp_GetInvocationContext";

  public GenerationContextOp_GetInvocationContext(SNode node) {
    super(node);
  }

  public static GenerationContextOp_GetInvocationContext newInstance(SModel sm, boolean init) {
    return (GenerationContextOp_GetInvocationContext)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.generator.generationContext.structure.GenerationContextOp_GetInvocationContext", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static GenerationContextOp_GetInvocationContext newInstance(SModel sm) {
    return GenerationContextOp_GetInvocationContext.newInstance(sm, false);
  }

}
