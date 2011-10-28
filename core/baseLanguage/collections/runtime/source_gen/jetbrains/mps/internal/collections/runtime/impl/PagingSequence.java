package jetbrains.mps.internal.collections.runtime.impl;

/*Generated by MPS */

import jetbrains.mps.internal.collections.runtime.Sequence;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class PagingSequence<U> extends Sequence<U> implements Iterable<U> {
  private final Sequence<U> input;
  private final PagingSequence.Page page;
  private final int length;

  public PagingSequence(Sequence<U> input, PagingSequence.Page page, int length) {
    if (input == null) {
      throw new NullPointerException();
    }
    if (length < 0) {
      throw new IllegalArgumentException("Negative page length");
    }
    this.input = input;
    this.page = page;
    this.length = length;
  }

  public Iterator<U> iterator() {
    return new PagingSequence.PagingIterator();
  }

  public static   enum Page {
    TAKE(),
    SKIP(),
    TAIL(),
    CUT();

    Page() {
    }
  }

  private class PagingIterator implements Iterator<U> {
    private Iterator<U> inputIt;
    private HasNextState hasNext = HasNextState.UNKNOWN;
    private U next;
    private int countDown;
    private ArrayList<U> cache;

    private PagingIterator() {
    }

    public boolean hasNext() {
      if (inputIt == null) {
        init();
      }
      if (hasNext.unknown()) {
        moveToNext();
      }
      return hasNext.hasNext();
    }

    public U next() {
      if (inputIt == null) {
        init();
      }
      if (hasNext.unknown()) {
        moveToNext();
      }
      if (!((hasNext.hasNext()))) {
        throw new NoSuchElementException();
      }
      return clearNext();
    }

    public void remove() {
      throw new UnsupportedOperationException();
    }

    private void init() {
      switch (page) {
        case TAKE:
        case SKIP:
          inputIt = input.toIterable().iterator();
          countDown = length;
          break;
        case TAIL:
        case CUT:
          cache = new ArrayList<U>();
          for (U o : input) {
            cache.add(o);
          }
          inputIt = cache.iterator();
          countDown = Math.max(0, cache.size() - length);
          break;
        default:
          break;
      }
    }

    private void destroy() {
      switch (page) {
        case TAKE:
        case SKIP:
          break;
        case TAIL:
        case CUT:
          cache.clear();
          break;
        default:
          break;
      }
    }

    @SuppressWarnings(value = "unused")
    private void moveToNext() {
      if (countDown > 0) {
skipping:
        do {
          --countDown;
          switch (page) {
            case TAKE:
            case CUT:
              takeNext();
              return;
            case SKIP:
            case TAIL:
              if (!(skipNext())) {
                return;
              }
              break;
            default:
              break;
          }
        } while (countDown > 0);
      }
      switch (page) {
        case TAKE:
        case CUT:
          stop();
          break;
        case SKIP:
        case TAIL:
          takeNext();
          break;
        default:
          break;
      }
    }

    private U clearNext() {
      U tmp = next;
      next = null;
      hasNext = HasNextState.UNKNOWN;
      return tmp;
    }

    private boolean skipNext() {
      if (inputIt.hasNext()) {
        inputIt.next();
        next = null;
        return true;
      } else {
        stop();
        return false;
      }
    }

    private void stop() {
      hasNext = HasNextState.AT_END;
      next = null;
      destroy();
    }

    private void takeNext() {
      if (inputIt.hasNext()) {
        next = inputIt.next();
        hasNext = HasNextState.HAS_NEXT;
      } else {
        stop();
      }
    }
  }
}
