package jetbrains.mps.lang.generator.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TemplateFunctionParameter_mainContextNode extends ConceptFunctionParameter {
  public static final String concept = "jetbrains.mps.lang.generator.structure.TemplateFunctionParameter_mainContextNode";

  public TemplateFunctionParameter_mainContextNode(SNode node) {
    super(node);
  }

  public static TemplateFunctionParameter_mainContextNode newInstance(SModel sm, boolean init) {
    return (TemplateFunctionParameter_mainContextNode)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.generator.structure.TemplateFunctionParameter_mainContextNode", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TemplateFunctionParameter_mainContextNode newInstance(SModel sm) {
    return TemplateFunctionParameter_mainContextNode.newInstance(sm, false);
  }

}
