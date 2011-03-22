package jetbrains.mps.baseLanguage.extensionMethods.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.dependencies.InferenceMethod;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.smodel.SNode;
import java.util.Map;
import java.util.List;
import jetbrains.mps.baseLanguage.typesystem.RulesFunctions_BaseLanguage;
import jetbrains.mps.baseLanguage.extensionMethods.behavior.ExtensionMethodDeclaration_Behavior;
import jetbrains.mps.typesystem.inference.EquationInfo;

public class RulesFunctions_Extension {
  public RulesFunctions_Extension() {
  }

  @InferenceMethod
  public static void inference_equateApplicableType(final TypeCheckingContext typeCheckingContext, SNode instanceType, SNode extensionMethod, Map<SNode, List<SNode>> mmap) {
    SNode matchedType = RulesFunctions_BaseLanguage.inference_matchTypeWithTypeVariables(typeCheckingContext, ExtensionMethodDeclaration_Behavior.call_getThisType_8022092943109893938(extensionMethod), mmap);
    {
      SNode _nodeToCheck_1029348928467 = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:d9557470-9267-4b7b-ab45-4dc4cc5d697c(jetbrains.mps.baseLanguage.extensionMethods.typesystem)", "5744862332973447913", 0, null);
      typeCheckingContext.createLessThanInequation((SNode) instanceType, (SNode) matchedType, false, _info_12389875345);
    }
  }
}
