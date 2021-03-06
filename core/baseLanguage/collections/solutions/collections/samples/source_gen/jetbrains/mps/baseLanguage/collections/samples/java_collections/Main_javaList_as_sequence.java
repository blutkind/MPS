package jetbrains.mps.baseLanguage.collections.samples.java_collections;

/*Generated by MPS */

import java.util.List;
import java.util.LinkedList;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ListSequence;

/*package*/ class Main_javaList_as_sequence {
  /*package*/ static void main(String[] args) {
    List<Integer> javaList = new LinkedList<Integer>();
    for (int i = 0; i < 5; i++) {
      javaList.add(i);
    }
    System.out.println("java-list as sequence");
    Iterable<Integer> sequence = javaList;
    for (Integer n : Sequence.fromIterable(sequence)) {
      System.out.println(n);
    }
    System.out.println("java-list as list");
    List<Integer> list = javaList;
    for (Integer n : ListSequence.fromList(list)) {
      System.out.println(n);
    }
  }
}
