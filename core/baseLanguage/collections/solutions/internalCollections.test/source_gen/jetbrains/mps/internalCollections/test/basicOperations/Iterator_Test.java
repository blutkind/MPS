package jetbrains.mps.internalCollections.test.basicOperations;

/*Generated by MPS */

import jetbrains.mps.internalCollections.test.closures.Util_Test;
import org.junit.Test;
import junit.framework.Assert;
import jetbrains.mps.internal.collections.runtime.Sequence;
import java.util.NoSuchElementException;
import java.util.Iterator;
import jetbrains.mps.internal.collections.runtime.IEnumerator;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;

public class Iterator_Test extends Util_Test {
  @Test
  public void test_null() throws Exception {
    Iterable<Integer> test = null;
    Assert.assertFalse(Sequence.fromIterable(test).iterator() == null);
    Assert.assertFalse(Sequence.fromIterable(test).iterator().hasNext());
    Assert.assertFalse(Sequence.fromIterable(test).enumerator().moveNext());
    try {
      Sequence.fromIterable(test).iterator().next();
      Assert.fail();
    } catch (NoSuchElementException e) {
      // expected exception
    }
    try {
      Sequence.fromIterable(test).enumerator().current();
      Assert.fail();
    } catch (NoSuchElementException e) {
      // expected exception
    }
  }

  @Test
  public void singleton() throws Exception {
    Iterable<Integer> test = Sequence.<Integer>singleton(42);
    Iterator<Integer> is = Sequence.fromIterable(test).iterator();
    Assert.assertTrue(is.hasNext());
    Assert.assertSame(42, is.next());
    Assert.assertFalse(is.hasNext());
    try {
      is.next();
      Assert.fail();
    } catch (NoSuchElementException e) {
      // expected exception
    }
    IEnumerator<Integer> is2 = Sequence.fromIterable(test).enumerator();
    Assert.assertTrue(is2.moveNext());
    Assert.assertSame(42, is2.current());
    Assert.assertFalse(is2.moveNext());
    try {
      is2.current();
      Assert.fail();
    } catch (NoSuchElementException e) {
      // expected exception
    }
  }

  @Test
  public void iterating() throws Exception {
    Iterable<String> test = this.inputABC();
    String res = "";
    for (Iterator<String> itr = Sequence.fromIterable(test).iterator() ; itr.hasNext() ; ) {
      res = res + itr.next();
    }
    Assert.assertEquals("ABC", res);
    res = "";
    for (IEnumerator<String> enm = Sequence.fromIterable(test).enumerator() ; enm.moveNext() ; ) {
      res = res + enm.current();
      res = res + enm.current();
    }
    Assert.assertEquals("AABBCC", res);
  }

  @Test
  public void containerIterator() throws Exception {
    List<Integer> list = ListSequence.fromListAndArray(new ArrayList<Integer>(), 1, 2, 3);
    for (Iterator<Integer> cit = ListSequence.fromList(list).iterator() ; cit.hasNext() ; ) {
      cit.next();
      cit.remove();
    }
    Assert.assertTrue(ListSequence.fromList(list).isEmpty());
    Set<Integer> set = SetSequence.fromSetAndArray(new HashSet<Integer>(), 1, 2, 3);
    for (Iterator<Integer> cit = SetSequence.fromSet(set).iterator() ; cit.hasNext() ; ) {
      cit.next();
      cit.remove();
    }
    Assert.assertTrue(SetSequence.fromSet(set).isEmpty());
  }
}
