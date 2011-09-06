package jetbrains.mps.internalCollections.test.closures;

/*Generated by MPS */

import jetbrains.mps.internal.collections.runtime.ISequence;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.closures.runtime.YieldingIterator;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import java.util.Arrays;

public class ChainedOperations_Test extends Util_Test {
  public void test_chainedCall() throws Exception {
    ISequence<String> test = Sequence.fromIterable(this.input5()).select(new ISelector<Integer, Integer>() {
      public Integer select(Integer it) {
        return it * 3;
      }
    }).translate(new ITranslator2<Integer, String>() {
      public Iterable<String> translate(final Integer it) {
        return new Iterable<String>() {
          public Iterator<String> iterator() {
            return new YieldingIterator<String>() {
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
                      this.yield(((String) String.valueOf(it)));
                      return true;
                    case 0:
                      this.__CP__ = 2;
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
    }).where(new IWhereFilter<String>() {
      public boolean accept(String it) {
        return it.length() == 2;
      }
    });
    this.assertIterableEquals(Arrays.asList("12", "15"), test.toIterable());
  }

  public void test_chainedOperations() throws Exception {
    Iterable<String> test = Sequence.fromIterable(this.input5()).<Integer>select(new ISelector<Integer, Integer>() {
      public Integer select(Integer it) {
        return it * 3;
      }
    }).<String>translate(new ITranslator2<Integer, String>() {
      public Iterable<String> translate(final Integer it) {
        return new Iterable<String>() {
          public Iterator<String> iterator() {
            return new YieldingIterator<String>() {
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
                      this.yield(((String) String.valueOf(it)));
                      return true;
                    case 0:
                      this.__CP__ = 2;
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
    }).where(new IWhereFilter<String>() {
      public boolean accept(String it) {
        return it.length() == 2;
      }
    });
    this.assertIterableEquals(Arrays.asList("12", "15"), test);
  }
}
