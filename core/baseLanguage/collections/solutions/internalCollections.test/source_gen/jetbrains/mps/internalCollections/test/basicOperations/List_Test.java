package jetbrains.mps.internalCollections.test.basicOperations;

/*Generated by MPS */

import jetbrains.mps.internalCollections.test.closures.Util_Test;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.backports.LinkedList;
import jetbrains.mps.internal.collections.runtime.Sequence;
import java.util.Arrays;
import junit.framework.Assert;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import jetbrains.mps.internal.collections.runtime.ArrayUtils;
import jetbrains.mps.internal.collections.runtime.LinkedListSequence;
import jetbrains.mps.internal.collections.runtime.ISequenceClosure;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.closures.runtime.YieldingIterator;
import java.util.Collections;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import java.util.Deque;

public class List_Test extends Util_Test {
  public void test_listCreator() throws Exception {
    List<Integer> test = ListSequence.fromListAndArray(new ArrayList<Integer>(), 1, 2, 3, 4, 5);
    this.assertIterableEquals(this.expect5(), test);
  }

  public void test_initSize() throws Exception {
    List<Integer> ali = ListSequence.fromList(new ArrayList<Integer>(10));
    List<Integer> lli = ListSequence.fromListWithValues(new LinkedList<Integer>(), ali);
    ali = lli;
  }

  public void test_add() throws Exception {
    List<Integer> test = ListSequence.fromList(new ArrayList<Integer>());
    for (int i = 1; i <= 5; i++) {
      ListSequence.fromList(test).addElement(i);
    }
    this.assertIterableEquals(this.expect5(), test);
  }

  public void test_addAll() throws Exception {
    List<Integer> test = ListSequence.fromList(new ArrayList<Integer>());
    ListSequence.fromList(test).addSequence(Sequence.fromIterable(this.input5()));
    this.assertIterableEquals(this.expect5(), test);
    List<Number> nlist = ListSequence.fromList(new ArrayList<Number>());
    ListSequence.fromList(nlist).addSequence(ListSequence.fromList(test));
    this.assertIterableEquals(this.expect5(), nlist);
  }

  public void test_copy() throws Exception {
    List<Integer> test = ListSequence.fromListAndArray(new ArrayList<Integer>(), 1, 2, 3, 4, 5);
    List<Integer> copy = ListSequence.fromListWithValues(new ArrayList<Integer>(), test);
    this.assertIterableEquals(this.input5(), copy);
    ListSequence.fromList(copy).addSequence(ListSequence.fromList(ListSequence.fromListAndArray(new ArrayList<Integer>(), 6, 7, 8, 9, 10)));
    this.assertIterableEquals(this.input10(), copy);
    this.assertIterableEquals(this.input5(), test);
    List<Integer> copy2 = ListSequence.fromListWithValues(new LinkedList<Integer>(), copy);
    this.assertIterableEquals(this.input10(), copy2);
    ListSequence.fromList(copy2).removeSequence(ListSequence.fromList(ListSequence.fromListAndArray(new ArrayList<Integer>(), 10, 9, 8, 7, 6)));
    this.assertIterableEquals(this.input5(), copy2);
    this.assertIterableEquals(this.input10(), copy);
  }

  public void test_remove() throws Exception {
    List<String> test = ListSequence.fromListAndArray(new ArrayList<String>(), "A", "B", "C", "D", "E");
    for (String s : Arrays.asList("A", "B", "C", "D", "E")) {
      ListSequence.fromList(test).removeElement(s);
    }
    Assert.assertTrue(ListSequence.fromList(test).isEmpty());
    Assert.assertSame(0, ListSequence.fromList(test).count());
    Assert.assertSame(0, ListSequence.fromList(test).count());
  }

  public void test_removeAll() throws Exception {
    List<Integer> test = ListSequence.fromListAndArray(new ArrayList<Integer>(), 1, 2, 3, 4, 5);
    ListSequence.fromList(test).removeSequence(Sequence.fromIterable(this.input5()));
    Assert.assertTrue(ListSequence.fromList(test).isEmpty());
    Assert.assertSame(0, ListSequence.fromList(test).count());
    Assert.assertSame(0, ListSequence.fromList(test).count());
  }

  public void test_reverse() throws Exception {
    List<String> test = ListSequence.fromListAndArray(new ArrayList<String>(), "A", "B", "C", "D", "E");
    this.assertIterableEquals(Arrays.asList("E", "D", "C", "B", "A"), ListSequence.fromList(test).reversedList());
    this.assertIterableEquals(Arrays.asList("A", "B", "C", "D", "E"), test);
  }

  public void test_sameList() throws Exception {
    List<Integer> test = ListSequence.fromListAndArray(new ArrayList<Integer>(), 1, 2, 3, 4, 5);
    List<Integer> test2 = test;
    ListSequence.fromList(test2).removeSequence(Sequence.fromIterable(this.input5()));
    this.assertIterableEquals(test, test2);
    ListSequence.fromList(test2).addSequence(Sequence.fromIterable(this.input5()));
    this.assertIterableEquals(this.input5(), test);
    this.assertIterableEquals(test, test2);
  }

  public void test_toArray() throws Exception {
    List<String> test = ListSequence.fromListAndArray(new ArrayList<String>(), "A", "B", "C");
    String[] arr = ListSequence.fromList(test).toGenericArray(String.class);
    Assert.assertEquals(Arrays.asList(arr), test);
    List<String> test2 = ListSequence.fromListAndArray(new ArrayList<String>(), "X", "Y", "Z");
    String[] strings = ListSequence.fromList(test2).toGenericArray(String.class);
    Assert.assertEquals(Arrays.asList(strings), test2);
  }

  public void test_insertSet() throws Exception {
    List<Integer> test = ListSequence.fromListAndArray(new ArrayList<Integer>(), 1, 2, 3, 5);
    Assert.assertEquals(Arrays.asList(new Integer[]{1, 2, 3, 5}), test);
    int insElm = ListSequence.fromList(test).insertElement(3, 4);
    Assert.assertEquals(4, insElm);
    Assert.assertEquals(Arrays.asList(new Integer[]{1, 2, 3, 4, 5}), test);
    int setElm = ListSequence.fromList(test).setElement(2, 0);
    Assert.assertEquals(3, setElm);
  }

  public void test_elementAccess() throws Exception {
    List<Integer> test = ListSequence.fromListAndArray(new ArrayList<Integer>(), 1, 2, 3, 5);
    int val = ListSequence.fromList(test).getElement(3);
    Assert.assertEquals(5, val);
    ListSequence.fromList(test).setElement(3, 4);
    Assert.assertEquals(Arrays.asList(new Integer[]{1, 2, 3, 4}), test);
    List<Integer> foo = ListSequence.fromList(new ArrayList<Integer>());
    ListSequence.fromList(foo).addElement(1);
    Assert.assertSame(1, ListSequence.fromList(foo).getElement(0));
    ListSequence.fromList(foo).setElement(0, 2);
    Assert.assertSame(2, ListSequence.fromList(foo).getElement(0));
    int i = 0;
    ListSequence.fromList(foo).setElement(i, 42);
    Assert.assertSame(42, ListSequence.fromList(foo).getElement(i));
  }

  public void test_serializeList() throws Exception {
    List<String> test = ListSequence.fromListAndArray(new ArrayList<String>(), "Quick", "brown", "fox");
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    ObjectOutputStream oos = new ObjectOutputStream(baos);
    oos.writeObject(test);
    oos.close();
    ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
    ObjectInputStream ois = new ObjectInputStream(bais);
    List<String> copy = (List<String>) ois.readObject();
    Assert.assertFalse(test == copy);
    Assert.assertEquals(test, copy);
  }

  public void test_emptyLinkedList() throws Exception {
    List<String> llist = ListSequence.fromList(new LinkedList<String>());
    Assert.assertTrue(ListSequence.fromList(llist).isEmpty());
  }

  public void test_nonEmptyLinkedList() throws Exception {
    List<String> llist = ListSequence.fromListAndArray(new LinkedList<String>(), "A", "B", "C");
    Assert.assertFalse(ListSequence.fromList(llist).isEmpty());
    Assert.assertEquals(3, ListSequence.fromList(llist).count());
  }

  public void test_clear() throws Exception {
    List<Integer> test = ListSequence.fromListAndArray(new ArrayList<Integer>(), 1, 2, 3, 5);
    Assert.assertTrue(ListSequence.fromList(test).isNotEmpty());
    ListSequence.fromList(test).clear();
    Assert.assertTrue(ListSequence.fromList(test).isEmpty());
  }

  public void test_addFirst() throws Exception {
    List<String> test = ListSequence.fromListAndArray(new ArrayList<String>(), "B", "C");
    ListSequence.fromList(test).insertElement(0, "A");
    this.assertIterableEquals(this.inputABC(), test);
  }

  public void test_addLast() throws Exception {
    List<String> test = ListSequence.fromListAndArray(new ArrayList<String>(), "A", "B");
    ListSequence.fromList(test).addElement("C");
    this.assertIterableEquals(this.inputABC(), test);
  }

  public void test_removeAt() throws Exception {
    List<String> test = ListSequence.fromListAndArray(new ArrayList<String>(), "A", "B", "FOO", "C");
    String foo = ListSequence.fromList(test).removeElementAt(2);
    Assert.assertEquals("FOO", foo);
    this.assertIterableEquals(this.inputABC(), test);
  }

  public void test_removeFirst() throws Exception {
    List<String> test = ListSequence.fromListAndArray(new ArrayList<String>(), "FOO", "A", "B", "C");
    String foo = ListSequence.fromList(test).removeElementAt(0);
    Assert.assertEquals("FOO", foo);
    this.assertIterableEquals(this.inputABC(), test);
  }

  public void test_removeLast() throws Exception {
    List<String> test = ListSequence.fromListAndArray(new ArrayList<String>(), "A", "B", "C", "FOO");
    String foo = ListSequence.fromList(test).removeLastElement();
    Assert.assertEquals("FOO", foo);
    this.assertIterableEquals(this.inputABC(), test);
  }

  public void test_primitiveParameter() throws Exception {
    List<Integer> test = ListSequence.fromListAndArray(new ArrayList<Integer>(), 1, 2, 3, 4, 5);
    this.assertIterableEquals(this.input5(), test);
    List<Integer> TEST = test;
    test = TEST;
    int[] arr = ArrayUtils.toIntArray(ListSequence.fromList(test));
    List<Character> cempty = ListSequence.fromList(new ArrayList<Character>());
    Assert.assertEquals(0, ListSequence.fromList(cempty).toGenericArray(Character.class).length);
    List<Byte> bempty = ListSequence.fromList(new LinkedList<Byte>());
  }

  public void test_array() throws Exception {
    List<int[]> test = ListSequence.fromListAndArray(new ArrayList<int[]>(), new int[]{1, 2, 3}, new int[]{3, 2, 1});
    int[] array = ListSequence.fromList(test).getElement(1);
    Assert.assertSame(3, array.length);
  }

  public void test_fromArray() throws Exception {
    String[] arr = new String[]{"A", "B", "C"};
    List<String> test = ListSequence.fromListAndArray(new ArrayList<String>(), arr);
    this.assertIterableEquals(this.inputABC(), test);
  }

  public void test__toString() throws Exception {
    List<Integer> test = ListSequence.fromListAndArray(new ArrayList<Integer>(), 1, 2, 3, 4, 5);
    Assert.assertEquals("[1, 2, 3, 4, 5]", String.valueOf(test));
    List<List<Integer>> test2 = ListSequence.fromListAndArray(new ArrayList<List<Integer>>(), ListSequence.fromListAndArray(new ArrayList<Integer>(), 1), LinkedListSequence.fromListAndArray(new LinkedList<Integer>(), 2));
    Assert.assertEquals("[[1], [2]]", String.valueOf(test2));
  }

  public void test_mps5845() throws Exception {
    /*
      List<String> abc = ListSequence.fromList(new ArrayList<String>());
      ListSequence.fromList(abc).addElement(new Integer(123));
      Assert.assertEquals("123", ListSequence.fromList(abc).first());
    */
  }

  public void test_mps5818() throws Exception {
    /*
      List<Object> abc = ListSequence.fromList(new ArrayList<String>());
    */
  }

  public void test_mps6093() throws Exception {
    List<String> strings = ListSequence.fromListAndArray(new ArrayList<String>(), "A", "B", "C");
    List<Object> objs = ListSequence.fromListWithValues(new ArrayList<Object>(), strings);
    this.assertIterableEquals(this.inputABC(), objs);
  }

  public void test_subList() throws Exception {
    List<Integer> list = ListSequence.fromListAndArray(new ArrayList<Integer>(), 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    List<Integer> sublist = ListSequence.fromList(list).subListSequence(0, 5);
    this.assertIterableEquals(this.input5(), sublist);
    ListSequence.fromList(sublist).addSequence(ListSequence.fromList(sublist).reversedList());
    this.assertIterableEquals(ArrayUtils.fromIntegerArray(new int[]{1, 2, 3, 4, 5, 5, 4, 3, 2, 1, 6, 7, 8, 9, 10}), list);
  }

  public void test_headList() throws Exception {
    List<Integer> list = ListSequence.fromListAndArray(new ArrayList<Integer>(), 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    List<Integer> headlist = ListSequence.fromList(list).headListSequence(5);
    this.assertIterableEquals(this.input5(), headlist);
    ListSequence.fromList(headlist).addSequence(ListSequence.fromList(headlist).reversedList());
    this.assertIterableEquals(ArrayUtils.fromIntegerArray(new int[]{1, 2, 3, 4, 5, 5, 4, 3, 2, 1, 6, 7, 8, 9, 10}), list);
  }

  public void test_tailList() throws Exception {
    List<Integer> list = ListSequence.fromListAndArray(new ArrayList<Integer>(), 6, 7, 8, 9, 10, 1, 2, 3, 4, 5);
    List<Integer> taillist = ListSequence.fromList(list).tailListSequence(5);
    this.assertIterableEquals(this.input5(), taillist);
    ListSequence.fromList(taillist).addSequence(ListSequence.fromList(taillist).reversedList());
    this.assertIterableEquals(ArrayUtils.fromIntegerArray(new int[]{6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 5, 4, 3, 2, 1}), list);
  }

  public void test_containsAll() throws Exception {
    Iterable<Integer> bigSeq = Sequence.fromClosure(new ISequenceClosure<Integer>() {
      public Iterable<Integer> iterable() {
        return new Iterable<Integer>() {
          public Iterator<Integer> iterator() {
            return new YieldingIterator<Integer>() {
              private int __CP__ = 0;
              private int _2_i;

              protected boolean moveToNext() {
__loop__:
                do {
__switch__:
                  switch (this.__CP__) {
                    case -1:
                      assert false : "Internal error";
                      return false;
                    case 2:
                      this._2_i = 0;
                    case 3:
                      if (!(_2_i < 10000)) {
                        this.__CP__ = 1;
                        break;
                      }
                      this.__CP__ = 4;
                      break;
                    case 5:
                      _2_i++;
                      this.__CP__ = 3;
                      break;
                    case 6:
                      this.__CP__ = 5;
                      this.yield(_2_i);
                      return true;
                    case 0:
                      this.__CP__ = 2;
                      break;
                    case 4:
                      this.__CP__ = 6;
                      break;
                    default:
                      break __loop__;
                  }
                } while (true);
                return false;
              }
            };
          }
        };
      }
    });
    List<Integer> bigList = Sequence.fromIterable(bigSeq).toListSequence();
    Collections.shuffle(bigList);
    List<Integer> anotherBigList = ListSequence.fromList(bigList).select(new ISelector<Integer, Integer>() {
      public Integer select(Integer i) {
        return i;
      }
    }).toListSequence();
    Collections.shuffle(anotherBigList);
    long start = System.currentTimeMillis();
    Assert.assertTrue(ListSequence.fromList(bigList).select(new ISelector<Integer, Integer>() {
      public Integer select(Integer i) {
        return i;
      }
    }).containsSequence(ListSequence.fromList(anotherBigList).select(new ISelector<Integer, Integer>() {
      public Integer select(Integer i) {
        return i;
      }
    })));
    long seqDuration = System.currentTimeMillis() - start;
    long startAgain = System.currentTimeMillis();
    Assert.assertTrue(ListSequence.fromList(bigList).containsSequence(ListSequence.fromList(anotherBigList)));
    long listDuration = System.currentTimeMillis() - startAgain;
    Assert.assertTrue(seqDuration * 2 < listDuration);
  }

  public void test_mps6232() throws Exception {
    List<String> hs = ListSequence.fromListAndArray(new ArrayList<String>(), null);
    Assert.assertSame(1, ListSequence.fromList(hs).count());
    Assert.assertTrue(ListSequence.fromList(hs).contains(null));
  }

  public void test_mps8045() throws Exception {
    Assert.assertNotNull(Collections.synchronizedList(ListSequence.fromList(new ArrayList())));
    Assert.assertNotNull(Collections.synchronizedSet(SetSequence.fromSet(new HashSet())));
  }

  public void test_linkedlist() throws Exception {
    Deque<Integer> ll = LinkedListSequence.fromLinkedList(new LinkedList<Integer>());
    Assert.assertTrue(LinkedListSequence.fromLinkedList(ll).isEmpty());
  }

  public List<Foo> mps5684helper() {
    List<Bar> bars = ListSequence.fromListAndArray(new ArrayList<Bar>(), new Bar());
    return ListSequence.fromListWithValues(new ArrayList<Foo>(), bars);
  }
}
