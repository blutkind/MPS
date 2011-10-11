package jetbrains.mps.internalCollections.test.basicOperations;

/*Generated by MPS */

import jetbrains.mps.internalCollections.test.closures.Util_Test;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import jetbrains.mps.internal.collections.runtime.SortedSetSequence;
import java.util.TreeSet;
import junit.framework.Assert;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ArrayUtils;
import java.util.Arrays;
import jetbrains.mps.util.WeakSet;
import java.util.Collection;
import jetbrains.mps.internal.collections.runtime.IterableUtils;
import jetbrains.mps.internal.collections.runtime.ISelector;

public class Set_Test extends Util_Test {
  public void test_initSize() throws Exception {
    Set<Integer> hs = SetSequence.fromSet(new HashSet<Integer>(10));
    Set<Integer> lhs = SetSequence.fromSet(new LinkedHashSet<Integer>(20));
    SortedSet<Integer> ss = SortedSetSequence.fromSet(new TreeSet<Integer>());
  }

  public void test_emptyCreator() throws Exception {
    Set<String> test = SetSequence.fromSet(new HashSet<String>());
    Assert.assertTrue(SetSequence.fromSet(test).isEmpty());
    Assert.assertFalse(SetSequence.fromSet(test).isNotEmpty());
    Assert.assertEquals(0, SetSequence.fromSet(test).count());
  }

  public void test_nonEmptyCreator() throws Exception {
    Set<String> test = SetSequence.fromSetAndArray(new HashSet<String>(), "A", "B", "C");
    Assert.assertFalse(SetSequence.fromSet(test).isEmpty());
    Assert.assertTrue(SetSequence.fromSet(test).isNotEmpty());
    Assert.assertEquals(3, SetSequence.fromSet(test).count());
  }

  public void test_clear() throws Exception {
    Set<String> test = SetSequence.fromSetAndArray(new HashSet<String>(), "A", "B", "C");
    SetSequence.fromSet(test).clear();
    Assert.assertTrue(SetSequence.fromSet(test).isEmpty());
  }

  public void test_add() throws Exception {
    Set<String> test = SetSequence.fromSetAndArray(new HashSet<String>(), "A", "B", "C");
    SetSequence.fromSet(test).addElement("D");
    Assert.assertEquals(4, SetSequence.fromSet(test).count());
    SetSequence.fromSet(test).addElement("E");
    Assert.assertEquals(5, SetSequence.fromSet(test).count());
    SetSequence.fromSet(test).addElement("A");
    Assert.assertEquals(5, SetSequence.fromSet(test).count());
  }

  public void test_testAdd() throws Exception {
    Set<String> sets = SetSequence.fromSetAndArray(new HashSet<String>(), "a", "b");
    Assert.assertTrue(SetSequence.fromSet(sets).add("c"));
    Assert.assertFalse(SetSequence.fromSet(sets).add("b"));
    SetSequence.fromSet(sets).removeElement("b");
    Assert.assertTrue(SetSequence.fromSet(sets).add("b"));
  }

  public void test_addAll() throws Exception {
    Set<String> test = SetSequence.fromSetAndArray(new HashSet<String>(), "A", "B", "C");
    this.assertIterableEqualsIgnoreOrder(this.inputABC(), test);
    SetSequence.fromSet(test).addSequence(Sequence.fromIterable(this.inputABCDEF()));
    this.assertIterableEqualsIgnoreOrder(this.inputABCDEF(), test);
  }

  public void test_copy() throws Exception {
    Set<Integer> test = SetSequence.fromSetAndArray(new HashSet<Integer>(), 1, 2, 3, 4, 5);
    Set<Integer> copy = SetSequence.fromSetWithValues(new HashSet<Integer>(), test);
    this.assertIterableEqualsIgnoreOrder(this.input5(), copy);
    SetSequence.fromSet(copy).addSequence(ListSequence.fromList(ListSequence.fromListAndArray(new ArrayList<Integer>(), 6, 7, 8, 9, 10)));
    this.assertIterableEqualsIgnoreOrder(this.input10(), copy);
    this.assertIterableEqualsIgnoreOrder(this.input5(), test);
  }

  public void test_remove() throws Exception {
    Set<String> test = SetSequence.fromSetAndArray(new HashSet<String>(), "A", "B", "C", "D", "E", "F");
    SetSequence.fromSet(test).removeElement("F");
    SetSequence.fromSet(test).removeElement("D");
    SetSequence.fromSet(test).removeElement("E");
    this.assertIterableEqualsIgnoreOrder(this.inputABC(), test);
  }

  public void test_testRemove() throws Exception {
    Set<String> sets = SetSequence.fromSetAndArray(new HashSet<String>(), "a", "b");
    Assert.assertTrue(SetSequence.fromSet(sets).remove("a"));
    Assert.assertTrue(SetSequence.fromSet(sets).remove("b"));
    Assert.assertFalse(SetSequence.fromSet(sets).remove("c"));
    SetSequence.fromSet(sets).addElement("c");
    Assert.assertTrue(SetSequence.fromSet(sets).remove("c"));
  }

  public void test_removeAll() throws Exception {
    Set<String> test = SetSequence.fromSetAndArray(new HashSet<String>(), "A", "B", "C");
    SetSequence.fromSet(test).removeSequence(Sequence.fromIterable(this.inputABC()));
    Assert.assertTrue(SetSequence.fromSet(test).isEmpty());
  }

  public void test_primitiveParameter() throws Exception {
    Set<Integer> test = SetSequence.fromSetAndArray(new HashSet<Integer>(), 1, 2, 3, 4, 5);
    this.assertIterableEqualsIgnoreOrder(this.input5(), test);
    int[] array = ArrayUtils.toIntArray(SetSequence.fromSet(test));
    Assert.assertEquals(5, array.length);
  }

  public void test_contains() throws Exception {
    Set<Integer> test = SetSequence.fromSetAndArray(new HashSet<Integer>(), 1, 2, 3, 4, 5);
    Assert.assertTrue(SetSequence.fromSet(test).contains(3));
  }

  public void test_linkedHashSet() throws Exception {
    Set<Integer> set = SetSequence.fromSet(new LinkedHashSet<Integer>());
    SetSequence.fromSet(set).addElement(11);
    SetSequence.fromSet(set).addElement(3);
    SetSequence.fromSet(set).addElement(2);
    SetSequence.fromSet(set).addElement(7);
    SetSequence.fromSet(set).addElement(1);
    SetSequence.fromSet(set).addElement(5);
    this.assertIterableEquals(Arrays.asList(11, 3, 2, 7, 1, 5), set);
  }

  public void test__toString() throws Exception {
    Set<Integer> test = SetSequence.fromSetAndArray(new HashSet<Integer>(), 9);
    Assert.assertEquals("[9]", String.valueOf(test));
  }

  public void test_array() throws Exception {
    String[] arr = new String[]{"A", "B", "C"};
    Set<String> test = SetSequence.fromSetAndArray(new LinkedHashSet<String>(), arr);
    this.assertIterableEquals(this.inputABC(), test);
  }

  public void test_eq() throws Exception {
    Set<Integer> seta = SetSequence.fromSetAndArray(new HashSet<Integer>(), 111, 222, 333);
    Set<Integer> setb = SetSequence.fromSetAndArray(new HashSet<Integer>(), 333, 222, 111);
    Assert.assertTrue(eq_c8cpc7_a0a2a61(seta, setb));
  }

  public void test_mps6232() throws Exception {
    Set<String> hs = SetSequence.fromSetAndArray(new HashSet<String>(), null);
    Assert.assertSame(1, SetSequence.fromSet(hs).count());
    Assert.assertTrue(SetSequence.fromSet(hs).contains(null));
  }

  public void test_weakSet() throws Exception {
    Set<Object> ws = SetSequence.fromSet(new WeakSet<Object>());
    Object o = new Object();
    SetSequence.fromSet(ws).addElement(o);
    Assert.assertSame(1, SetSequence.fromSet(ws).count());
    Assert.assertNotNull(o);
    o = null;
    System.gc();
    System.gc();
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
    }
    System.gc();
    Assert.assertTrue(SetSequence.fromSet(ws).isEmpty());
  }

  public void test_collection() throws Exception {
    Set<String> hss = SetSequence.fromSetAndArray(new HashSet<String>(), "a", "b");
    Collection<String> cs = hss;
    Assert.assertEquals("a b", IterableUtils.join(Sequence.fromIterable(cs).sort(new ISelector<String, Comparable<?>>() {
      public Comparable<?> select(String it) {
        return it;
      }
    }, true), " "));
    SetSequence.fromSet(hss).addElement("c");
    Assert.assertEquals("a b c", IterableUtils.join(Sequence.fromIterable(cs).sort(new ISelector<String, Comparable<?>>() {
      public Comparable<?> select(String it) {
        return it;
      }
    }, true), " "));
  }

  public void test_unmodifiable() throws Exception {
    Set<String> hss = SetSequence.fromSetAndArray(new HashSet<String>(), "a", "b", "c");
    SetSequence.fromSet(hss).addElement("d");
    SetSequence.fromSet(hss).removeElement("b");
    Assert.assertEquals("a c d", IterableUtils.join(SetSequence.fromSet(hss).sort(new ISelector<String, Comparable<?>>() {
      public Comparable<?> select(String it) {
        return it;
      }
    }, true), " "));
    Set<String> uhss = SetSequence.fromSet(hss).asUnmodifiable();
    try {
      SetSequence.fromSet(uhss).addElement("e");
      Assert.fail();
    } catch (UnsupportedOperationException e) {
      // expected exception 
    }
    SetSequence.fromSet(hss).removeElement("a");
    Assert.assertEquals("c d", IterableUtils.join(SetSequence.fromSet(uhss).sort(new ISelector<String, Comparable<?>>() {
      public Comparable<?> select(String it) {
        return it;
      }
    }, true), " "));
    try {
      SetSequence.fromSet(uhss).removeElement("c");
      Assert.fail();
    } catch (UnsupportedOperationException e) {
      // expected exception 
    }
  }

  private static boolean eq_c8cpc7_a0a2a61(Object a, Object b) {
    return (a != null ?
      a.equals(b) :
      a == b
    );
  }
}
