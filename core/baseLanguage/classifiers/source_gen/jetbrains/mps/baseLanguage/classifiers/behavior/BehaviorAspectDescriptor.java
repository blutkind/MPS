package jetbrains.mps.baseLanguage.classifiers.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.DescriptorProvider;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import java.util.Arrays;

public class BehaviorAspectDescriptor extends DescriptorProvider<BehaviorDescriptor> {
  private static String[] stringSwitchCases_846f5o_a0a0a = new String[]{"jetbrains.mps.baseLanguage.classifiers.structure.BaseClassifierType", "jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifier", "jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierFieldAccessOperation", "jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierFieldDeclaration", "jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierMethodCallOperation", "jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierMethodDeclaration", "jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierType", "jetbrains.mps.baseLanguage.classifiers.structure.IClassifier", "jetbrains.mps.baseLanguage.classifiers.structure.IClassifierPart", "jetbrains.mps.baseLanguage.classifiers.structure.IMember", "jetbrains.mps.baseLanguage.classifiers.structure.IMemberOperation", "jetbrains.mps.baseLanguage.classifiers.structure.SuperClassifierExpresson", "jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpression"};

  public BehaviorAspectDescriptor() {
  }

  public BehaviorDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_846f5o_a0a0a, fqName)) {
      case 7:
        // interface or abstract concept behavior jetbrains.mps.baseLanguage.classifiers.structure.IClassifier 
        return null;
      case 9:
        // interface or abstract concept behavior jetbrains.mps.baseLanguage.classifiers.structure.IMember 
        return null;
      case 8:
        // interface or abstract concept behavior jetbrains.mps.baseLanguage.classifiers.structure.IClassifierPart 
        return null;
      case 12:
        return new ThisClassifierExpression_BehaviorDescriptor();
      case 0:
        // interface or abstract concept behavior jetbrains.mps.baseLanguage.classifiers.structure.BaseClassifierType 
        return null;
      case 6:
        return new DefaultClassifierType_BehaviorDescriptor();
      case 10:
        // interface or abstract concept behavior jetbrains.mps.baseLanguage.classifiers.structure.IMemberOperation 
        return null;
      case 5:
        return new DefaultClassifierMethodDeclaration_BehaviorDescriptor();
      case 4:
        return new DefaultClassifierMethodCallOperation_BehaviorDescriptor();
      case 3:
        return new DefaultClassifierFieldDeclaration_BehaviorDescriptor();
      case 2:
        return new DefaultClassifierFieldAccessOperation_BehaviorDescriptor();
      case 11:
        return new SuperClassifierExpresson_BehaviorDescriptor();
      case 1:
        return new DefaultClassifier_BehaviorDescriptor();
      default:
        return null;
    }
  }
}
