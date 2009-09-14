package jetbrains.mps.baseLanguage.collections.unittest.generics_test;

/*Generated by MPS */

import junit.framework.TestCase;
import org.junit.Test;
import jetbrains.mps.internal.collections.runtime.Sequence;
import junit.framework.Assert;

public class Generics1_Test extends TestCase {
  @Test
  public void test1() throws Exception {
    BooleanSequence bools = new BooleanSequence();
    for (Boolean bool : Sequence.fromIterable(bools.get())) {
      Assert.assertTrue(bool.booleanValue());
    }
  }

  @Test
  public void test2() throws Exception {
    IntegerSequence ints = new IntegerSequence();
    int count = 0;
    for (Integer i : Sequence.fromIterable(ints.get())) {
      Assert.assertEquals(count, i.intValue());
      count++ ;
    }
  }
}
