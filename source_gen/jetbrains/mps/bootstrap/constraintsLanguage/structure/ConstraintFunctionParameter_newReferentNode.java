package jetbrains.mps.bootstrap.constraintsLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil;
import jetbrains.mps.project.GlobalScope;

public class ConstraintFunctionParameter_newReferentNode extends ConceptFunctionParameter {

  public  ConstraintFunctionParameter_newReferentNode(SNode node) {
    super(node);
  }

  public static ConstraintFunctionParameter_newReferentNode newInstance(SModel sm) {
    return (ConstraintFunctionParameter_newReferentNode)SModelUtil.instantiateConceptDeclaration("jetbrains.mps.bootstrap.constraintsLanguage.ConstraintFunctionParameter_newReferentNode", sm, GlobalScope.getInstance()).getAdapter();
  }
}
