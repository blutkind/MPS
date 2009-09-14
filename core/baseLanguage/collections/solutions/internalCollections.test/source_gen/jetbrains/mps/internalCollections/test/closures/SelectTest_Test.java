package jetbrains.mps.internalCollections.test.closures;

/*Generated by MPS */

import org.junit.Test;
import jetbrains.mps.internal.collections.runtime.ISequence;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ISelector;
import java.util.Arrays;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ISequenceClosure;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.closures.runtime.YieldingIterator;
import junit.framework.Assert;

public class SelectTest_Test extends Util_Test {
  @Test
  public void selectMethod() throws Exception {
    ISequence<Integer> seq = Sequence.fromIterable(this.input5());
    ISequence<Integer> test = seq.select(new ISelector<Integer, Integer>() {
      public Integer select(Integer it) {
        return (it % 2 == 1 ?
          it * 2 :
          it * 3
        );
      }
    });
    this.assertIterableEquals(Arrays.asList(2, 6, 6, 12, 10), test.toIterable());
  }

  @Test
  public void selectMethod2() throws Exception {
    int a = Character.valueOf('a').charValue();
    Iterable<Integer> input = Arrays.asList(a, a + 1, a + 2, a + 3, a + 4);
    ISequence<Integer> seq = Sequence.fromIterable(input);
    ISequence<String> test = seq.select(new ISelector<Integer, String>() {
      public String select(Integer it) {
        return Character.valueOf((char)it.intValue()).toString();
      }
    });
    this.assertIterableEquals(Arrays.asList("a", "b", "c", "d", "e"), test.toIterable());
  }

  @Test
  public void selectorVar() throws Exception {
    ISequence<Integer> seq = Sequence.fromIterable(this.input5());
    ISelector<Integer, Integer> selector = new ISelector<Integer, Integer>() {
      public Integer select(Integer it) {
        return (it % 2 == 1 ?
          it * 2 :
          it * 3
        );
      }
    };
    ISequence<Integer> test = seq.select(selector);
    this.assertIterableEquals(Arrays.asList(2, 6, 6, 12, 10), test.toIterable());
  }

  @Test
  public void selectOperation() throws Exception {
    Iterable<Integer> test = Sequence.fromIterable(this.input5()).select(new ISelector<Integer, Integer>() {
      public Integer select(Integer it) {
        return it * 2;
      }
    });
    this.assertIterableEquals(this.expectEven10(), test);
  }

  @Test
  public void legacySelector() throws Exception {
    Iterable<Integer> test = Sequence.fromIterable(this.input5()).select(new ISelector<Integer, Integer>() {
      public Integer select(Integer it) {
        return it * 2;
      }
    });
    this.assertIterableEquals(this.expectEven10(), test);
  }

  @Test
  public void selectMany() throws Exception {
    final List<Integer> list = ListSequence.fromListAndArray(new ArrayList<Integer>(), 1, 2, 3);
    Iterable<Integer> test = Sequence.fromClosure(new ISequenceClosure<Integer>() {
      public Iterable<Integer> iterable() {
        return new Iterable<Integer>() {
          public Iterator<Integer> iterator() {
            return new YieldingIterator<Integer>() {
              private int __CP__ = 0;

              protected boolean moveToNext() {
__loop__:
                do {
__switch__:
                  switch (this.__CP__) {
                    case -1:
                      assert false : "Internal error";
                      return false;
                    case 2:
                      this.__CP__ = 1;
                      this.yield(0);
                      return true;
                    case 0:
                      this.__CP__ = 2;
                      break;
                    default:
                      break __loop__;
                  }
                } while(true);
                return false;
              }
            };
          }
        };
      }
    });
    Sequence.fromIterable(test).select(new ISelector<Integer, List<Integer>>() {
      public List<Integer> select(Integer it) {
        return list;
      }
    });
    Iterable<List<Integer>> result = Sequence.fromIterable(test).select(new ISelector<Integer, List<Integer>>() {
      public List<Integer> select(Integer it) {
        return list;
      }
    });
    Assert.assertEquals(list, Sequence.fromIterable(result).first());
  }

  @Test
  public void nextWithoutHasNext() throws Exception {
    this.assertIteratorYields(ListSequence.fromList(ListSequence.fromListAndArray(new ArrayList<Integer>(), 1, 2, 3)).select(new ISelector<Integer, Integer>() {
      public Integer select(Integer i) {
        return i * 2;
      }
    }).iterator(), 2, 4, 6);
  }
}
