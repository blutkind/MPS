package jetbrains.mps.analyzers.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AnalyzerFunParameterProgramState extends ConceptFunctionParameter {
  public static final String concept = "jetbrains.mps.analyzers.structure.AnalyzerFunParameterProgramState";

  public AnalyzerFunParameterProgramState(SNode node) {
    super(node);
  }

  public static AnalyzerFunParameterProgramState newInstance(SModel sm, boolean init) {
    return (AnalyzerFunParameterProgramState) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.analyzers.structure.AnalyzerFunParameterProgramState", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AnalyzerFunParameterProgramState newInstance(SModel sm) {
    return AnalyzerFunParameterProgramState.newInstance(sm, false);
  }
}
