package jetbrains.mps.internal.collections.runtime.impl;

/*Generated by MPS */

import jetbrains.mps.internal.collections.runtime.IDequeSequence;
import jetbrains.mps.internal.collections.runtime.backports.Deque;
import java.util.Iterator;
import jetbrains.mps.internal.collections.runtime.ISequence;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;

public class NullDequeSequence<T> extends NullQueueSequence<T> implements IDequeSequence<T>, Deque<T> {
  private static final NullDequeSequence<Object> INSTANCE = new NullDequeSequence<Object>();

  protected NullDequeSequence() {
  }

  public void addFirst(T t) {
  }

  public void addLast(T t) {
  }

  public Iterator<T> descendingIterator() {
    return iterator();
  }

  public T getFirst() {
    return null;
  }

  public T getLast() {
    return null;
  }

  public boolean offerFirst(T t) {
    return false;
  }

  public boolean offerLast(T t) {
    return false;
  }

  public T peekFirst() {
    return null;
  }

  public T peekLast() {
    return null;
  }

  public T pollFirst() {
    return null;
  }

  public T pollLast() {
    return null;
  }

  public T pop() {
    return null;
  }

  public void push(T t) {
  }

  public T removeFirst() {
    return null;
  }

  public boolean removeFirstOccurrence(Object o) {
    return false;
  }

  public T removeLast() {
    return null;
  }

  public boolean removeLastOccurrence(Object o) {
    return false;
  }

  public T addFirstElement(T t) {
    return null;
  }

  public T peekElement() {
    return null;
  }

  public T popElement() {
    return null;
  }

  public T pushElement(T t) {
    return null;
  }

  public T removeLastElement() {
    return null;
  }

  @Override
  public IDequeSequence<T> addSequence(ISequence<? extends T> seq) {
    return (IDequeSequence<T>) super.addSequence(seq);
  }

  @Override
  public IDequeSequence<T> removeSequence(ISequence<? extends T> seq) {
    return (IDequeSequence<T>) super.removeSequence(seq);
  }

  @Override
  public IDequeSequence<T> removeWhere(_FunctionTypes._return_P1_E0<? extends Boolean, ? super T> filter) {
    return (IDequeSequence<T>) super.removeWhere(filter);
  }

  @Override
  public IDequeSequence<T> asUnmodifiable() {
    return this;
  }

  @Override
  public IDequeSequence<T> asSynchronized() {
    return this;
  }

  public Deque<T> toDeque() {
    return this;
  }

  @SuppressWarnings(value = "unchecked")
  public static <U> NullDequeSequence<U> instance() {
    return (NullDequeSequence<U>) INSTANCE;
  }
}
