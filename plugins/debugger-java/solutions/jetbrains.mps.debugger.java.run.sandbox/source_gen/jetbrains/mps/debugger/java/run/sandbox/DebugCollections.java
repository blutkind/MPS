package jetbrains.mps.debugger.java.run.sandbox;

/*Generated by MPS */

import java.util.Map;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.internal.collections.runtime.SortedMapSequence;
import java.util.TreeMap;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.backports.Deque;
import jetbrains.mps.internal.collections.runtime.LinkedListSequence;
import jetbrains.mps.internal.collections.runtime.backports.LinkedList;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;

public class DebugCollections {
  public DebugCollections() {
  }

  public static void main(String[] args) {
    int[] i = {1, 2};
    int k = 0;
    DebugCollections.testList();
    DebugCollections.testMap();
    DebugCollections.testSortedMap();
    DebugCollections.testLinkedList();
    DebugCollections.testSet();
    DebugCollections.testForeach();
  }

  public static void testMap() {
    Map<String, String> strings = MapSequence.fromMap(new HashMap<String, String>());
    MapSequence.fromMap(strings).put("one", "1");
    MapSequence.fromMap(strings).put("two", "2");
    MapSequence.fromMap(strings).put("three", "3");
    System.out.println(strings);
  }

  public static void testSortedMap() {
    Map<String, String> strings = SortedMapSequence.fromMap(new TreeMap<String, String>());
    MapSequence.fromMap(strings).put("one", "1");
    MapSequence.fromMap(strings).put("two", "2");
    MapSequence.fromMap(strings).put("three", "3");
    System.out.println(strings);
  }

  private static void testList() {
    List<String> strings = ListSequence.fromList(new ArrayList<String>());
    ListSequence.fromList(strings).addElement("alpha");
    ListSequence.fromList(strings).addElement("beta");
    ListSequence.fromList(strings).addElement("gamma");
    System.out.println(strings);
  }

  private static void testLinkedList() {
    Deque<String> strings = LinkedListSequence.fromLinkedList(new LinkedList<String>());
    LinkedListSequence.fromLinkedList(strings).addElement("alpha");
    LinkedListSequence.fromLinkedList(strings).addElement("beta");
    LinkedListSequence.fromLinkedList(strings).addElement("gamma");
    System.out.println(strings);
  }

  public static void testSet() {
    Set<String> strings = SetSequence.fromSet(new HashSet<String>());
    SetSequence.fromSet(strings).addElement("alpha");
    SetSequence.fromSet(strings).addElement("beta");
    SetSequence.fromSet(strings).addElement("gamma");
    System.out.println(strings);
  }

  public static void testForeach() {
    Set<String> strings = SetSequence.fromSet(new HashSet<String>());
    SetSequence.fromSet(strings).addElement("alpha");
    SetSequence.fromSet(strings).addElement("beta");
    SetSequence.fromSet(strings).addElement("gamma");
    for (String i : SetSequence.fromSet(strings)) {
      System.err.println(i);
    }
    for (String j : strings) {
      System.err.println(j);
    }
  }
}
