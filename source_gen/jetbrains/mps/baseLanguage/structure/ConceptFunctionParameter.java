package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConceptFunctionParameter extends Expression {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter";
  public static String CPR_DontUseParameterObject = "dontUseParameterObject";
  public static String CLNK_ConceptFunctionParameterType = "conceptFunctionParameterType";

  public  ConceptFunctionParameter(SNode node) {
    super(node);
  }

  public static ConceptFunctionParameter newInstance(SModel sm, boolean init) {
    return (ConceptFunctionParameter)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConceptFunctionParameter newInstance(SModel sm) {
    return ConceptFunctionParameter.newInstance(sm, false);
  }

}
