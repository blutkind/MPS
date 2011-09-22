package jetbrains.mps.internalCollections.test.runtime;

/*Generated by MPS */

import junit.framework.TestCase;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import junit.framework.Assert;

public class Generics_Test extends TestCase {
  public void test_mps13933_generic() throws Exception {
    MPS13933<String> o1 = new MPS13933<String>() {
      @Override
      public void doSmth() {
        addRow(ListSequence.fromListAndArray(new ArrayList<String>(), "foo", "bar"));
      }
    };
    o1.doSmth();
    Assert.assertEquals(ListSequence.fromListAndArray(new ArrayList<String>(), "foo", "bar"), o1.myList);
    MPS13933<Integer> o2 = new MPS13933<Integer>() {
      @Override
      public void doSmth() {
        this.addRow(ListSequence.fromListAndArray(new ArrayList<Integer>(), 333, 444));
      }
    };
    o2.doSmth();
    Assert.assertEquals(ListSequence.fromListAndArray(new ArrayList<Integer>(), 333, 444), o2.myList);
  }

  public void test_mps13933_raw() throws Exception {
    MPS13933 o1 = new MPS13933() {
      @Override
      public void doSmth() {
        addRow(ListSequence.fromListAndArray(new ArrayList(), "foo", "bar"));
      }
    };
    o1.doSmth();
    Assert.assertEquals(ListSequence.fromListAndArray(new ArrayList(), "foo", "bar"), o1.myList);
  }
}
