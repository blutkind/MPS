package jetbrains.mps.internalCollections.test.closures;

/*Generated by MPS */

import org.junit.Test;
import jetbrains.mps.internal.collections.runtime.ISequence;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ISelector;
import java.util.Arrays;
import java.util.Comparator;
import jetbrains.mps.internal.collections.runtime.SelectComparator;

public class Sort_Test extends Util_Test {

  @Test()
  public void test_sortMethod() throws Exception {
    ISequence<String> input = Sequence.fromArray("ZZZ", "Y", "XXXX", "WW");
    ISequence<String> test = input.sort(new ISelector <String, Comparable<?>>() {

      public Comparable<?> select(String it) {
        return it.length();
      }

    }, false);
    this.assertIterableEquals(Sequence.fromArray("XXXX", "ZZZ", "WW", "Y"), test);
  }

  @Test()
  public void test_toComparableVar() throws Exception {
    ISequence<String> input = Sequence.fromArray("ZZZ", "Y", "XXXX", "WW");
    ISelector<String, Comparable<?>> length = new ISelector <String, Comparable<?>>() {

      public Comparable<?> select(String it) {
        return it.length();
      }

    };
    ISequence<String> test = input.sort(length, false);
    ISelector<String, Comparable<?>> itself = new ISelector <String, Comparable<?>>() {

      public Comparable<?> select(String it) {
        return it;
      }

    };
    ISequence<String> test2 = input.sort(itself, true);
    this.assertIterableEquals(Sequence.fromArray("XXXX", "ZZZ", "WW", "Y"), test);
    this.assertIterableEquals(Sequence.fromArray("Y", "WW", "ZZZ", "XXXX"), test.sort(length, true));
    this.assertIterableEquals(Sequence.fromArray("WW", "XXXX", "Y", "ZZZ"), test2);
  }

  @Test()
  public void test_sortOperationInternal() throws Exception {
    Iterable<String> input = Arrays.asList("Z", "YY", "XXX", "WWWW");
    Iterable<String> test = Sequence.fromIterable(input).sort(new ISelector <String, Comparable<?>>() {

      public Comparable<?> select(String it) {
        return it.length();
      }

    }, false);
    Iterable<String> test2 = Sequence.fromIterable(input).sort(new Comparator <String>() {

      public int compare(String a, String b) {
        return a.length() - b.length();
      }

    }, false);
    this.assertIterableEquals(Arrays.asList("WWWW", "XXX", "YY", "Z"), test);
    this.assertIterableEquals(Arrays.asList("WWWW", "XXX", "YY", "Z"), test2);
    this.assertIterableEquals(input, Sequence.fromIterable(test).sort(new ISelector <String, Comparable<?>>() {

      public Comparable<?> select(String it) {
        return it.length();
      }

    }, true));
  }

  @Test()
  public void test_legacySort() throws Exception {
    Iterable<String> input = Arrays.asList("Z", "YY", "XXX", "WWWW");
    Iterable<String> test = Sequence.fromIterable(input).sort(new SelectComparator<String>(new ISelector <String, Comparable<?>>() {

      public Comparable<?> select(String it) {
        return it.length();
      }

    }), false);
    this.assertIterableEquals(Arrays.asList("WWWW", "XXX", "YY", "Z"), test);
  }

}
