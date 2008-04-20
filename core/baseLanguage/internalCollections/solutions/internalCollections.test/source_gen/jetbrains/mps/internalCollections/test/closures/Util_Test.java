package jetbrains.mps.internalCollections.test.closures;

/*Generated by MPS */

import junit.framework.TestCase;
import org.junit.Test;
import java.util.Iterator;
import junit.framework.Assert;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Collections;
import java.util.Arrays;

public class Util_Test extends TestCase {

  @Test()
  public void test_dummy() throws Exception {
  }

  public  <T>void assertIterableEquals(Iterable<T> exp, Iterable<T> test) {
    Iterator<T> expIt = exp.iterator();
    Iterator<T> testIt = test.iterator();
    while(expIt.hasNext() && testIt.hasNext()) {
      Assert.assertEquals(expIt.next(), testIt.next());
    }
    Assert.assertFalse(expIt.hasNext());
    Assert.assertFalse(testIt.hasNext());
  }

  public  <T>void assertIterableEqualsAsSet(Iterable<T> exp, Iterable<T> test) {
    HashSet<T> expSet = new HashSet<T>();
    for(T e : exp) {
      Assert.assertTrue(expSet.add(e));
    }
    Iterator<T> testIt = test.iterator();
    while(testIt.hasNext()) {
      Assert.assertTrue(expSet.remove(testIt.next()));
    }
    Assert.assertTrue(expSet.isEmpty());
    Assert.assertFalse(testIt.hasNext());
  }

  public  <T>void assertIterableEqualsIgnoreOrder(Iterable<T> exp, Iterable<T> test) {
    HashMap<T, Integer> cardMap = new HashMap<T, Integer>();
    for(T e : exp) {
      Integer card = cardMap.get(e);
      cardMap.put(e, (card != null ?
        card + 1 :
        1
      ));
    }
    Iterator<T> testIt = test.iterator();
    while(testIt.hasNext()) {
      T next = testIt.next();
      Integer card = cardMap.remove(next);
      Assert.assertFalse(card == null);
      if (card > 1) {
        cardMap.put(next, card - 1);
      }
    }
    Assert.assertTrue(cardMap.isEmpty());
    Assert.assertFalse(testIt.hasNext());
  }

  public Iterable<Integer> inputEmpty() {
    return Collections.emptyList();
  }

  public Iterable<Integer> input5() {
    return Arrays.asList(1, 2, 3, 4, 5);
  }

  public Iterable<Integer> input10() {
    return Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
  }

  public Iterable<Integer> expectEmpty() {
    return Collections.emptyList();
  }

  public Iterable<Integer> expect5() {
    return Arrays.asList(1, 2, 3, 4, 5);
  }

  public Iterable<Integer> expect10() {
    return Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
  }

  public Iterable<Integer> expectOdd5() {
    return Arrays.asList(1, 3, 5);
  }

  public Iterable<Integer> expectEven10() {
    return Arrays.asList(2, 4, 6, 8, 10);
  }

}
