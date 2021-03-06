package jetbrains.mps.lang.generator.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TemplateFunctionParameter_parentOutputNode extends ConceptFunctionParameter {
  public static final String concept = "jetbrains.mps.lang.generator.structure.TemplateFunctionParameter_parentOutputNode";

  public TemplateFunctionParameter_parentOutputNode(SNode node) {
    super(node);
  }

  public static TemplateFunctionParameter_parentOutputNode newInstance(SModel sm, boolean init) {
    return (TemplateFunctionParameter_parentOutputNode) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.generator.structure.TemplateFunctionParameter_parentOutputNode", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TemplateFunctionParameter_parentOutputNode newInstance(SModel sm) {
    return TemplateFunctionParameter_parentOutputNode.newInstance(sm, false);
  }
}
