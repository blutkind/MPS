package jetbrains.mps.baseLanguage.unitTest.plugin;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.smodel.SNodePointer;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.baseLanguage.unitTest.runtime.TestRunParameters;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.ModelAccess;

public abstract class AbstractTestWrapper<N extends SNode> implements ITestNodeWrapper<N> {
  @NotNull
  protected final SNodePointer myNodePointer;
  private String myFqName;

  public AbstractTestWrapper(@NotNull N node) {
    myNodePointer = new SNodePointer(node);
  }

  public AbstractTestWrapper(@NotNull SNodePointer nodePointer) {
    myNodePointer = nodePointer;
  }

  @Nullable
  public N getNode() {
    return (N) myNodePointer.getNode();
  }

  @NotNull
  public SNodePointer getNodePointer() {
    return myNodePointer;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }

    AbstractTestWrapper that = (AbstractTestWrapper) o;
    if ((this.myNodePointer != null ?
      !(((Object) this.myNodePointer).equals(that.myNodePointer)) :
      that.myNodePointer != null
    )) {
      return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int result = 0;
    result = 31 * result + ((this.myNodePointer != null ?
      ((Object) this.myNodePointer).hashCode() :
      0
    ));
    return result;
  }

  @Nullable
  public ITestNodeWrapper getTestCase() {
    return null;
  }

  @NotNull
  public Iterable<ITestNodeWrapper> getTestMethods() {
    return ListSequence.fromList(new ArrayList<ITestNodeWrapper>());
  }

  public TestRunParameters getTestRunParameters() {
    return new TestRunParameters();
  }

  public String getName() {
    N node = getNode();
    if (node == null) {
      return null;
    }
    return SPropertyOperations.getString(node, "name");
  }

  public String getFqName() {
    ITestNodeWrapper testCase = getTestCase();
    if (isTestCase() || testCase == null) {
      N node = getNode();
      if (node == null) {
        return null;
      }
      return SPropertyOperations.getString(node, "name");
    }
    return testCase.getFqName() + "." + getName();
  }

  public String getCachedFqName() {
    if (myFqName == null) {
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          myFqName = getFqName();
        }
      });
    }
    return myFqName;
  }
}
