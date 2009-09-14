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
import java.util.NoSuchElementException;

public class Util_Test extends TestCase {
  @Test
  public void dummy() throws Exception {
  }

  public void assertIterableEquals(Iterable exp, Iterable test) {
    Iterator expIt = exp.iterator();
    Iterator testIt = test.iterator();
    while (expIt.hasNext() && testIt.hasNext()) {
      Assert.assertEquals(expIt.next(), testIt.next());
    }
    Assert.assertFalse(expIt.hasNext());
    Assert.assertFalse(testIt.hasNext());
  }

  public void assertIterableEqualsAsSet(Iterable exp, Iterable test) {
    HashSet expSet = new HashSet();
    for (Object e : exp) {
      Assert.assertTrue(expSet.add(e));
    }
    Iterator testIt = test.iterator();
    while (testIt.hasNext()) {
      Assert.assertTrue(expSet.remove(testIt.next()));
    }
    Assert.assertTrue(expSet.isEmpty());
    Assert.assertFalse(testIt.hasNext());
  }

  public void assertIterableEqualsIgnoreOrder(Iterable exp, Iterable test) {
    HashMap<Object, Integer> cardMap = new HashMap<Object, Integer>();
    for (Object e : exp) {
      Integer card = cardMap.get(e);
      cardMap.put(e, (card != null ?
        card + 1 :
        1
      ));
    }
    Iterator testIt = test.iterator();
    while (testIt.hasNext()) {
      Object next = testIt.next();
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

  public Iterable<String> inputABC() {
    return Arrays.asList("A", "B", "C");
  }

  public Iterable<String> inputABCDEF() {
    return Arrays.asList("A", "B", "C", "D", "E", "F");
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

  public void assertIteratorYields(Iterator it, Object... values) {
    for (Object v : values) {
      Assert.assertSame(v, it.next());
    }
    Assert.assertFalse(it.hasNext());
    try {
      it.next();
      Assert.fail();
    } catch (NoSuchElementException e) {
      // expected exception
    }
  }
}
