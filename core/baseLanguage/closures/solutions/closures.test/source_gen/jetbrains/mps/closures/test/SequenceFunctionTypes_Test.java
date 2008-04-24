package jetbrains.mps.closures.test;

/*Generated by MPS */

import org.junit.Test;
import jetbrains.mps.closures.runtime.FunctionTypes;
import jetbrains.mps.baseLanguage.ext.collections.internal.SequenceWithSupplier;
import java.util.List;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;
import java.util.Iterator;
import jetbrains.mps.closures.runtime.YieldingIterator;

public class SequenceFunctionTypes_Test extends ClosuresBase_Test {

  @Test()
  public void test_returnSequence() throws Exception {
    FunctionTypes._R<? extends Iterable<Integer>> fun1 = null;
    FunctionTypes._R<? extends Iterable<Integer>> fun2 = null;
    fun1 = fun2;
    fun2 = fun1;
    final Iterable<Integer> seq = new SequenceWithSupplier<Integer>(new zValueSupplier(null, null));
    fun1 = new FunctionTypes._R <Iterable<Integer>>() {

      public Iterable<Integer> invoke() {
        return seq;
      }

    };
    // TODO: fix the test
    /*
      fun1 = new FunctionTypes._R <List<Integer>>() {

        public List<Integer> invoke() {
          return ListOperations.<Integer>createList(Integer.valueOf(1));
        }

      };
    */
    fun1 = new FunctionTypes._R <Iterable<Integer>>() {

      public Iterable<Integer> invoke() {
        return new Iterable <Integer>() {

          public Iterator<Integer> iterator() {
            return new YieldingIterator <Integer>() {

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
                      this.yield(Integer.valueOf(1));
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

    };
    fun1 = new FunctionTypes._R <Iterable<Integer>>() {

      public Iterable<Integer> invoke() {
        return new Iterable <Integer>() {

          public Iterator<Integer> iterator() {
            return new YieldingIterator <Integer>() {

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
                      this.yield(1);
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

    };
  }

  @Test()
  public void test_acceptSequence() throws Exception {
    FunctionTypes._void_from_T<? super Iterable<Integer>> fun1 = new FunctionTypes._void_from_T <Iterable<Integer>>() {

      public void invoke(Iterable<Integer> p) {
      }

    };
    FunctionTypes._void_from_T<? super Iterable<Integer>> fun2 = new FunctionTypes._void_from_T <Iterable<Integer>>() {

      public void invoke(Iterable<Integer> p) {
      }

    };
    fun1 = fun2;
    fun2 = fun1;
  }

  @Test()
  public void test_resultsReturnSequence() throws Exception {
    final Iterable<Integer> seq = new SequenceWithSupplier<Integer>(new zValueSupplier1(null, null));
    this.assertResultsEqual(new FunctionTypes._R <Iterable<Integer>>() {

      public Iterable<Integer> invoke() {
        return seq;
      }

    }, new FunctionTypes._R <Iterable<Integer>>() {

      public Iterable<Integer> invoke() {
        return new Iterable <Integer>() {

          public Iterator<Integer> iterator() {
            return new YieldingIterator <Integer>() {

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
                      this.__CP__ = 3;
                      this.yield(1);
                      return true;
                    case 3:
                      this.__CP__ = 4;
                      this.yield(2);
                      return true;
                    case 4:
                      this.__CP__ = 1;
                      this.yield(3);
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
  }

}
