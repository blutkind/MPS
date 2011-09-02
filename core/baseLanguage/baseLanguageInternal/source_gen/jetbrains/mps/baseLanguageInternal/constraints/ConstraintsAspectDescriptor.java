package jetbrains.mps.baseLanguageInternal.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConstraintsDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;

public class ConstraintsAspectDescriptor implements jetbrains.mps.smodel.runtime.ConstraintsAspectDescriptor {
  private static String[] stringSwitchCases_2qnle6_a0a0a = new String[]{"jetbrains.mps.baseLanguageInternal.structure.ConstantValue", "jetbrains.mps.baseLanguageInternal.structure.ExtractStatementListInnerExpression", "jetbrains.mps.baseLanguageInternal.structure.ExtractStaticInnerClassConcept", "jetbrains.mps.baseLanguageInternal.structure.ExtractStaticInnerClassCreator", "jetbrains.mps.baseLanguageInternal.structure.ExtractStaticMethod_CallExpression", "jetbrains.mps.baseLanguageInternal.structure.ExtractToConstantRefExpression", "jetbrains.mps.baseLanguageInternal.structure.InternalAnonymousClass", "jetbrains.mps.baseLanguageInternal.structure.InternalPartialInstanceMethodCall", "jetbrains.mps.baseLanguageInternal.structure.WeakClassReference"};

  public ConstraintsAspectDescriptor() {
  }

  public ConstraintsDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_2qnle6_a0a0a, fqName)) {
      case 4:
        return new ExtractStaticMethod_CallExpression_Constraints();
      case 1:
        return new ExtractStatementListInnerExpression_Constraints();
      case 3:
        return new ExtractStaticInnerClassCreator_Constraints();
      case 2:
        return new ExtractStaticInnerClassConcept_Constraints();
      case 7:
        return new InternalPartialInstanceMethodCall_Constraints();
      case 5:
        return new ExtractToConstantRefExpression_Constraints();
      case 8:
        return new WeakClassReference_Constraints();
      case 6:
        return new InternalAnonymousClass_Constraints();
      case 0:
        return new ConstantValue_Constraints();
      default:
        // todo: illegal in some cases? 
        return new BaseConstraintsDescriptor(fqName);
    }
  }
}
