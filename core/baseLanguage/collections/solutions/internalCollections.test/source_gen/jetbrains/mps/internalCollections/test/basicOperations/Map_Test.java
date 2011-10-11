package jetbrains.mps.internalCollections.test.basicOperations;

/*Generated by MPS */

import jetbrains.mps.internalCollections.test.closures.Util_Test;
import java.util.Map;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.SortedMap;
import jetbrains.mps.internal.collections.runtime.SortedMapSequence;
import java.util.TreeMap;
import jetbrains.mps.internal.collections.runtime.IMapSequence;
import junit.framework.Assert;
import java.util.Arrays;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.IMapping;
import java.util.Iterator;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import jetbrains.mps.internal.collections.runtime.ArrayUtils;
import jetbrains.mps.internal.collections.runtime.ISelector;
import java.util.WeakHashMap;

public class Map_Test extends Util_Test {
  public void test_initSize() throws Exception {
    Map<Integer, String> hm = MapSequence.fromMap(new HashMap<Integer, String>(10));
    Map<Integer, String> lhm = MapSequence.fromMap(new LinkedHashMap<Integer, String>(20, (float) 0.75, false));
    SortedMap<Integer, String> sm = SortedMapSequence.fromMap(new TreeMap<Integer, String>());
  }

  public void test_mapMethod() throws Exception {
    IMapSequence<Integer, String> map = MapSequence.fromMap(new HashMap<Integer, String>());
    map.put(1, "a");
    map.put(2, "b");
    map.put(3, "c");
    Assert.assertEquals(3, map.size());
    this.assertIterableEqualsIgnoreOrder(Arrays.asList(1, 2, 3), map.keySet());
    this.assertIterableEqualsIgnoreOrder(Arrays.asList("a", "b", "c"), map.values());
  }

  public void test_mapInitializer() throws Exception {
    Map<Integer, String> map = MapSequence.<Integer, String>fromMapAndKeysArray(new HashMap<Integer, String>(), 1, 2, 3).withValues("a", "b", "c");
    List<String> values = Arrays.asList("a", "b", "c");
    for (Integer i : Arrays.asList(1, 2, 3)) {
      Assert.assertTrue(MapSequence.fromMap(map).containsKey(i));
      Assert.assertTrue(MapSequence.fromMap(map).containsValue(values.get(i - 1)));
      Assert.assertEquals(values.get(i - 1), MapSequence.fromMap(map).get(i));
    }
    this.assertIterableEqualsIgnoreOrder(Arrays.asList(1, 2, 3), MapSequence.fromMap(map).keySet());
    for (Integer i : Arrays.asList(1, 2, 3)) {
      MapSequence.fromMap(map).removeKey(i);
    }
    for (Integer i : Arrays.asList(1, 2, 3)) {
      Assert.assertFalse(MapSequence.fromMap(map).containsKey(i));
      Assert.assertFalse(MapSequence.fromMap(map).containsValue(values.get(i - 1)));
    }
  }

  public void test_mapNoInitializer() throws Exception {
    Map<Integer, String> map = MapSequence.fromMap(new HashMap<Integer, String>());
    List<String> values = Arrays.asList("a", "b", "c");
    Integer idx = 1;
    for (String val : values) {
      MapSequence.fromMap(map).put(idx, val);
      idx++;
    }
    for (Integer i : Arrays.asList(1, 2, 3)) {
      Assert.assertTrue(MapSequence.fromMap(map).containsKey(i));
      Assert.assertTrue(MapSequence.fromMap(map).containsValue(values.get(i - 1)));
      Assert.assertEquals(values.get(i - 1), MapSequence.fromMap(map).get(i));
    }
    this.assertIterableEqualsIgnoreOrder(Arrays.asList(1, 2, 3), MapSequence.fromMap(map).keySet());
    this.assertIterableEqualsIgnoreOrder(Arrays.asList("a", "b", "c"), MapSequence.fromMap(map).values());
  }

  public void test_clear() throws Exception {
    Map<Integer, String> map1 = MapSequence.<Integer, String>fromMapAndKeysArray(new HashMap<Integer, String>(), 1, 2, 3).withValues("a", "b", "c");
    Assert.assertFalse(SetSequence.fromSet(MapSequence.fromMap(map1).keySet()).isEmpty());
    Assert.assertFalse(Sequence.fromIterable(MapSequence.fromMap(map1).values()).isEmpty());
    MapSequence.fromMap(map1).clear();
    Assert.assertTrue(SetSequence.fromSet(MapSequence.fromMap(map1).keySet()).isEmpty());
    Assert.assertTrue(Sequence.fromIterable(MapSequence.fromMap(map1).values()).isEmpty());
  }

  public void test_primitiveParameter() throws Exception {
    Map<Integer, Character> ascii = MapSequence.<Integer, Character>fromMapAndKeysArray(new HashMap<Integer, Character>(), 48, 49, 50).withValues('0', '1', '2');
    Assert.assertSame('1', MapSequence.fromMap(ascii).get(49));
    Iterable<Integer> keys = MapSequence.fromMap(ascii).keySet();
    for (int k : Sequence.fromIterable(keys)) {
      Assert.assertEquals(Character.valueOf((char) (int) k), MapSequence.fromMap(ascii).get(k));
    }
  }

  public void test_array() throws Exception {
    Map<String, String[]> test = MapSequence.<String, String[]>fromMapAndKeysArray(new HashMap<String, String[]>(), "foo").withValues(new String[]{"bar", "baz"});
    Iterable<String> seq = MapSequence.fromMap(test).keySet();
    Assert.assertTrue(Sequence.fromIterable(seq).contains("foo"));
    String[] array = MapSequence.fromMap(test).get("foo");
    Assert.assertSame(2, array.length);
  }

  public void test_arrayOfString() throws Exception {
    Map<String, String[]> test = MapSequence.<String, String[]>fromMapAndKeysArray(new HashMap<String, String[]>(), "foo").withValues(new String[]{"bar", "baz"});
    Iterable<String> seq = MapSequence.fromMap(test).keySet();
    Assert.assertTrue(Sequence.fromIterable(seq).contains("foo"));
    String[] array = MapSequence.fromMap(test).get("foo");
    Assert.assertSame(2, array.length);
  }

  public void test_contains() throws Exception {
  }

  public void test_mps4050() throws Exception {
    /*
      Map<Foo, List<Bar>> mmap = MapSequence.fromMap(new HashMap<Foo, List<Bar>>());
      for (List<Bar> lst : Sequence.fromIterable(mmap.values())) {
        lst.<!TextGen not found for 'jetbrains.mps.baseLanguage.structure.AbstractOperation'!>;
      }
    */
  }

  public void test__toString() throws Exception {
    Map<Integer, String> test = MapSequence.<Integer, String>fromMapAndKeysArray(new HashMap<Integer, String>(), 1).withValues("a");
    Assert.assertEquals("[1=a]", String.valueOf(test));
  }

  public void test_mappings() throws Exception {
    Map<Integer, String> test = MapSequence.<Integer, String>fromMapAndKeysArray(new HashMap<Integer, String>(), 1, 2, 3).withValues("a", "b", "c");
    List<Integer> nums = ListSequence.fromListAndArray(new ArrayList<Integer>(), 1, 2, 3);
    Set<IMapping<Integer, String>> ms = MapSequence.fromMap(test).mappingsSet();
    Assert.assertSame(3, SetSequence.fromSet(ms).count());
    Iterator<IMapping<Integer, String>> itr = SetSequence.fromSet(ms).iterator();
    Assert.assertTrue(itr.hasNext());
    while (itr.hasNext()) {
      IMapping<Integer, String> m = itr.next();
      int key = m.key();
      Assert.assertTrue(ListSequence.fromList(nums).contains(key));
      ListSequence.fromList(nums).removeElement(key);
      String val = m.value();
      Assert.assertEquals(MapSequence.fromMap(test).get(key), val);
      itr.remove();
      Assert.assertFalse(MapSequence.fromMap(test).containsKey(key));
      Assert.assertFalse(MapSequence.fromMap(test).containsValue(val));
    }
    Assert.assertTrue(SetSequence.fromSet(MapSequence.fromMap(test).keySet()).isEmpty());
    Assert.assertTrue(ListSequence.fromList(nums).isEmpty());
  }

  public void test_mapIsASequence() throws Exception {
    Map<String, Integer> test = MapSequence.<String, Integer>fromMapAndKeysArray(new HashMap<String, Integer>(), "a", "b", "c").withValues(1, 2, 3);
    Iterable<IMapping<String, Integer>> seq = MapSequence.fromMap(test);
    Assert.assertSame(3, Sequence.fromIterable(seq).count());
    Assert.assertTrue(Sequence.fromIterable(seq).isNotEmpty());
    Assert.assertFalse(Sequence.fromIterable(seq).isEmpty());
    Map<String, Integer> test2 = MapSequence.<String, Integer>fromMapAndKeysArray(new LinkedHashMap<String, Integer>(16, (float) 0.75, false), "b", "a", "c").withValues(2, 1, 3);
    Iterable<IMapping<String, Integer>> seq2 = MapSequence.fromMap(test2);
    this.assertIterableEqualsIgnoreOrder(seq, seq2);
  }

  public void test_putAll() throws Exception {
    Map<String, String> map = MapSequence.<String, String>fromMapAndKeysArray(new HashMap<String, String>(), "a", "b", "c").withValues("A", "B", "C");
    Map<String, String> test = MapSequence.fromMap(new HashMap<String, String>());
    Assert.assertTrue(MapSequence.fromMap(test).isEmpty());
    MapSequence.fromMap(test).putAll(map);
    Assert.assertFalse(MapSequence.fromMap(test).isEmpty());
    this.assertIterableEqualsIgnoreOrder(MapSequence.fromMap(map).values(), MapSequence.fromMap(test).values());
    this.assertIterableEqualsIgnoreOrder(MapSequence.fromMap(map).keySet(), MapSequence.fromMap(test).keySet());
    this.assertIterableEqualsIgnoreOrder(MapSequence.fromMap(map).mappingsSet(), MapSequence.fromMap(test).mappingsSet());
  }

  public void test_removeKey() throws Exception {
    Map<String, Integer> map = MapSequence.<String, Integer>fromMapAndKeysArray(new HashMap<String, Integer>(), "a", "b", "c").withValues(1, 2, 3);
    int removed = MapSequence.fromMap(map).removeKey("a");
    Assert.assertEquals(1, removed);
    Assert.assertSame(2, MapSequence.fromMap(map).count());
    Assert.assertSame(2, MapSequence.fromMap(map).get("b"));
    Assert.assertSame(3, MapSequence.fromMap(map).get("c"));
  }

  public void test_mappings2() throws Exception {
    Map<Integer, String> mis = MapSequence.<Integer, String>fromMapAndKeysArray(new HashMap<Integer, String>(), 1, 2, 3).withValues("a", "b", "c");
    SetSequence.fromSet(MapSequence.fromMap(mis).mappingsSet()).toListSequence().visitAll(new IVisitor<IMapping<Integer, String>>() {
      public void visit(IMapping<Integer, String> m) {
        m.value(String.valueOf((char) ('A' - 1 + m.key())));
      }
    });
    this.assertIterableEqualsIgnoreOrder(Sequence.fromIterable(ArrayUtils.fromCharacterArray("ABC".toCharArray())).select(new ISelector<Character, String>() {
      public String select(Character c) {
        return String.valueOf(c);
      }
    }), MapSequence.fromMap(mis).values());
  }

  public void test_weakHashMap() throws Exception {
    Map<Object, Integer> moi = MapSequence.fromMap(new WeakHashMap<Object, Integer>());
    Object o = new Object();
    MapSequence.fromMap(moi).put(o, 1);
    Assert.assertSame(1, MapSequence.fromMap(moi).count());
    Assert.assertNotNull(o);
    o = null;
    System.gc();
    System.gc();
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
    }
    System.gc();
    Assert.assertSame(0, MapSequence.fromMap(moi).count());

  }

  public void test_primitiveValues() throws Exception {
    Map<String, Integer> msi = MapSequence.<String, Integer>fromMapAndKeysArray(new HashMap<String, Integer>(), "A", "B", "C").withValues(333, 444, 333);
    Assert.assertTrue(444 == (int) MapSequence.fromMap(msi).get("B"));
    Assert.assertTrue((int) MapSequence.fromMap(msi).get("B") == 444);
    Assert.assertTrue((int) MapSequence.fromMap(msi).get("A") == (int) MapSequence.fromMap(msi).get("C"));
  }

  public void test_opAssign() throws Exception {
    Map<String, Integer> mapsi = MapSequence.<String, Integer>fromMapAndKeysArray(new HashMap<String, Integer>(), "A", "B", "C").withValues(345, 543, 1111);
    Assert.assertTrue(645 == (int) MapSequence.fromMap(mapsi).putValue("A", MapSequence.fromMap(mapsi).get("A") + (300)));
    Assert.assertTrue(645 == (int) MapSequence.fromMap(mapsi).get("A"));
    Assert.assertTrue((int) MapSequence.fromMap(mapsi).putValue("B", MapSequence.fromMap(mapsi).get("B") - (40)) == 503);
    Assert.assertTrue((int) MapSequence.fromMap(mapsi).get("B") == 503);
    Assert.assertTrue(9999 == (int) MapSequence.fromMap(mapsi).putValue("C", MapSequence.fromMap(mapsi).get("C") * (9)));
    Assert.assertTrue(9999 == (int) MapSequence.fromMap(mapsi).get("C"));
  }
}
