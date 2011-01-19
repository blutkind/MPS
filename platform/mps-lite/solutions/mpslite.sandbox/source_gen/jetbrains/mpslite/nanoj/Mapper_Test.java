package jetbrains.mpslite.nanoj;

/*Generated by MPS */

import junit.framework.TestCase;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.closures.runtime.YieldingIterator;

public class Mapper_Test extends TestCase {
  public void test_nextWithoutHasNext() throws Exception {
    new _FunctionTypes._return_P1_E0<Iterable<Integer>, Integer>() {
      public Iterable<Integer> invoke(final Integer i) {
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
                      this.__CP__ = 3;
                      this.yield(i);
                      return true;
                    case 3:
                      this.__CP__ = 1;
                      this.yield(1);
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
    };

  }
}
