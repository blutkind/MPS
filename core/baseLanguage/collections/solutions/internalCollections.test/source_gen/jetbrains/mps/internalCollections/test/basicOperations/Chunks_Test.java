package jetbrains.mps.internalCollections.test.basicOperations;

/*Generated by MPS */

import jetbrains.mps.internalCollections.test.closures.Util_Test;
import org.junit.Test;
import jetbrains.mps.internal.collections.runtime.ISequence;
import jetbrains.mps.internal.collections.runtime.Sequence;
import java.util.Arrays;
import jetbrains.mps.internal.collections.runtime.ISequenceClosure;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.closures.runtime.YieldingIterator;
import junit.framework.Assert;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;

public class Chunks_Test extends Util_Test {
  @Test
  public void chunkMethods() throws Exception {
    ISequence<Integer> input = Sequence.fromIterable(this.input10());
    this.assertIterableEquals(Arrays.asList(1, 2, 3), input.take(3));
    this.assertIterableEquals(Arrays.asList(8, 9, 10), input.skip(7));
    this.assertIterableEquals(Arrays.asList(1, 2, 3), input.cut(7));
    this.assertIterableEquals(Arrays.asList(8, 9, 10), input.tail(3));
    this.assertIterableEquals(Arrays.asList(5, 6, 7), input.page(4, 7));
    this.assertIterableEquals(input.skip(3).take(5), input.page(3, 8));
  }

  @Test
  public void chunkOperations() throws Exception {
    Iterable<Integer> input = this.input10();
    this.assertIterableEquals(Arrays.asList(1, 2, 3), Sequence.fromIterable(input).take(3));
    this.assertIterableEquals(Arrays.asList(8, 9, 10), Sequence.fromIterable(input).skip(7));
    this.assertIterableEquals(Arrays.asList(1, 2, 3), Sequence.fromIterable(input).cut(7));
    this.assertIterableEquals(Arrays.asList(8, 9, 10), Sequence.fromIterable(input).tail(3));
    this.assertIterableEquals(Arrays.asList(5, 6, 7), Sequence.fromIterable(input).page(4, 7));
    this.assertIterableEquals(Sequence.fromIterable(input).skip(3).take(5), Sequence.fromIterable(input).page(3, 8));
  }

  @Test
  public void pageOperationNoSideEffects() throws Exception {
    Iterable<Integer> input = this.input10();
    int from = 3;
    int to = 8;
    this.assertIterableEquals(Arrays.asList(5, 6, 7), Sequence.fromIterable(input).page(from = from + 1, to = to - 1));
  }

  @Test
  public void takeAll() throws Exception {
    Iterable<Integer> test = Sequence.fromClosure(new ISequenceClosure<Integer>() {
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
                      if (!(_2_i < 100)) {
                        this.__CP__ = 1;
                        break;
                      }
                      this.__CP__ = 4;
                      break;
                    case 5:
                      _2_i++ ;
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
                } while(true);
                return false;
              }
            };
          }
        };
      }
    });
    Assert.assertSame(100, Sequence.fromIterable(test).take(Integer.MAX_VALUE).count());
  }

  @Test
  public void nextWithoutHasNext() throws Exception {
    List<Integer> test = ListSequence.fromListAndArray(new ArrayList<Integer>(), 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    this.assertIteratorYields(ListSequence.fromList(test).take(3).iterator(), 1, 2, 3);
    this.assertIteratorYields(ListSequence.fromList(test).skip(7).iterator(), 8, 9, 10);
    this.assertIteratorYields(ListSequence.fromList(test).cut(4).iterator(), 1, 2, 3, 4, 5, 6);
    this.assertIteratorYields(ListSequence.fromList(test).tail(5).iterator(), 6, 7, 8, 9, 10);
    this.assertIteratorYields(ListSequence.fromList(test).page(4, 7).iterator(), 5, 6, 7);
  }
}
