package jetbrains.mps.internal.collections.runtime.impl;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import java.util.Iterator;
import java.util.NoSuchElementException;
import jetbrains.mps.internal.collections.runtime.Sequence;

public class SelectingSequence<U, V> extends AbstractChainedSequence<U, V> implements Iterable<V> {
  private final _FunctionTypes._return_P1_E0<? extends V, ? super U> selector;

  public SelectingSequence(Iterable<U> input, _FunctionTypes._return_P1_E0<? extends V, ? super U> selector) {
    super(input);
    this.selector = selector;
  }

  public Iterator<V> iterator() {
    return new SelectingSequence.SelectingIterator();
  }

  private class SelectingIterator implements Iterator<V> {
    private Iterator<U> inputIterator = null;
    private HasNextState hasNext = HasNextState.UNKNOWN;
    private V next;

    private SelectingIterator() {
    }

    public boolean hasNext() {
      if (inputIterator == null) {
        init();
      }
      if (hasNext.unknown()) {
        moveToNext();
      }
      return hasNext.hasNext();
    }

    public V next() {
      if (inputIterator == null) {
        init();
      }
      if (hasNext.unknown()) {
        moveToNext();
      }
      if (!(hasNext.hasNext())) {
        throw new NoSuchElementException();
      }
      return clearNext();
    }

    public void remove() {
      throw new UnsupportedOperationException();
    }

    private void init() {
      inputIterator = getInput().iterator();
    }

    private void moveToNext() {
      hasNext = HasNextState.AT_END;
      next = null;
      while (inputIterator.hasNext()) {
        V tmp = selector.invoke(inputIterator.next());
        if (Sequence.IGNORE_NULL_VALUES) {
          if (tmp == null) {
            continue;
          }
        }
        hasNext = HasNextState.HAS_NEXT;
        next = tmp;
        break;
      }
    }

    private V clearNext() {
      V tmp = next;
      next = null;
      hasNext = HasNextState.UNKNOWN;
      return tmp;
    }
  }
}
