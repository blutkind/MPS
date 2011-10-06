package jetbrains.mps.baseLanguage.unitTest.plugin;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.baseLanguage.unitTest.behavior.ITestMethod_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.internal.collections.runtime.Sequence;
import java.util.Collections;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.baseLanguage.unitTest.behavior.ITestCase_Behavior;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.baseLanguage.unitTest.runtime.TestRunParameters;
import org.jetbrains.annotations.NonNls;
import jetbrains.mps.baseLanguage.unitTest.behavior.ITestable_Behavior;

public class LanguageTestWrapper extends AbstractTestWrapper<SNode> {
  public LanguageTestWrapper(SNode test) {
    super(test);
  }

  public boolean isTestCase() {
    return check_9og6tg_a0a0(getNode(), this);
  }

  private boolean isTestMethod() {
    return check_9og6tg_a0a1(getNode(), this);
  }

  @Nullable
  @Override
  public ITestNodeWrapper getTestCase() {
    if (check_9og6tg_a0a2(getNode(), this)) {
      return TestNodeWrapperFactory.tryToWrap(ITestMethod_Behavior.call_getTestCase_1216134500045(SNodeOperations.cast(getNode(), "jetbrains.mps.baseLanguage.unitTest.structure.ITestMethod")));
    }
    if (isTestCase()) {
      return null;
    }
    return null;
  }

  @NotNull
  @Override
  public Iterable<ITestNodeWrapper> getTestMethods() {
    if (!(isTestCase())) {
      return super.getTestMethods();
    }
    SNode node = getNode();
    if (node == null) {
      return Sequence.fromIterable(Collections.<ITestNodeWrapper>emptyList());
    }
    return ListSequence.fromList(ITestCase_Behavior.call_getTestMethods_2148145109766218395(SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.unitTest.structure.ITestCase"))).select(new ISelector<SNode, ITestNodeWrapper>() {
      public ITestNodeWrapper select(SNode it) {
        return TestNodeWrapperFactory.tryToWrap(it);
      }
    });
  }

  @Override
  public TestRunParameters getTestRunParameters() {
    return check_9og6tg_a0a4(getNode(), this);
  }

  @NonNls
  @Override
  public String getFqName() {
    if (isTestCase()) {
      return check_9og6tg_a0a0a5(SNodeOperations.cast(getNode(), "jetbrains.mps.baseLanguage.unitTest.structure.ITestCase"), this);
    }
    return super.getFqName();
  }

  @NonNls
  @Override
  public String getName() {
    if (isTestMethod()) {
      return check_9og6tg_a0a0a6(SNodeOperations.cast(getNode(), "jetbrains.mps.baseLanguage.unitTest.structure.ITestMethod"), this);
    }
    return check_9og6tg_a1a6(SNodeOperations.cast(getNode(), "jetbrains.mps.baseLanguage.unitTest.structure.ITestCase"), this);
  }

  private static boolean check_9og6tg_a0a0(SNode checkedDotOperand, LanguageTestWrapper checkedDotThisExpression) {
    if (null != checkedDotOperand) {
      return SNodeOperations.isInstanceOf(checkedDotOperand, "jetbrains.mps.baseLanguage.unitTest.structure.ITestCase");
    }
    return false;
  }

  private static boolean check_9og6tg_a0a1(SNode checkedDotOperand, LanguageTestWrapper checkedDotThisExpression) {
    if (null != checkedDotOperand) {
      return SNodeOperations.isInstanceOf(checkedDotOperand, "jetbrains.mps.baseLanguage.unitTest.structure.ITestMethod");
    }
    return false;
  }

  private static boolean check_9og6tg_a0a2(SNode checkedDotOperand, LanguageTestWrapper checkedDotThisExpression) {
    if (null != checkedDotOperand) {
      return SNodeOperations.isInstanceOf(checkedDotOperand, "jetbrains.mps.baseLanguage.unitTest.structure.ITestMethod");
    }
    return false;
  }

  private static TestRunParameters check_9og6tg_a0a4(SNode checkedDotOperand, LanguageTestWrapper checkedDotThisExpression) {
    if (null != checkedDotOperand) {
      return ITestable_Behavior.call_getTestRunParameters_1216045139515(checkedDotOperand);
    }
    return null;
  }

  private static String check_9og6tg_a0a0a5(SNode checkedDotOperand, LanguageTestWrapper checkedDotThisExpression) {
    if (null != checkedDotOperand) {
      return ITestCase_Behavior.call_getClassName_1216136193905(checkedDotOperand);
    }
    return null;
  }

  private static String check_9og6tg_a0a0a6(SNode checkedDotOperand, LanguageTestWrapper checkedDotThisExpression) {
    if (null != checkedDotOperand) {
      return ITestMethod_Behavior.call_getTestName_1216136419751(checkedDotOperand);
    }
    return null;
  }

  private static String check_9og6tg_a1a6(SNode checkedDotOperand, LanguageTestWrapper checkedDotThisExpression) {
    if (null != checkedDotOperand) {
      return ITestCase_Behavior.call_getSimpleClassName_1229278847513(checkedDotOperand);
    }
    return null;
  }
}
