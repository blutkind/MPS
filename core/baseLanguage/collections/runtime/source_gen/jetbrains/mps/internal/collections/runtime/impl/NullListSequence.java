package jetbrains.mps.internal.collections.runtime.impl;

/*Generated by MPS */

import jetbrains.mps.internal.collections.runtime.IListSequence;
import java.util.List;
import java.util.Collection;
import java.util.ListIterator;
import jetbrains.mps.internal.collections.runtime.ISequence;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import java.util.NoSuchElementException;

public class NullListSequence<T> extends NullCollectionSequence<T> implements IListSequence<T>, List<T> {
  private static final NullListSequence<Object> INSTANCE = new NullListSequence<Object>();

  protected NullListSequence() {
  }

  public void add(int index, T element) {
  }

  public boolean addAll(int index, Collection<? extends T> c) {
    return false;
  }

  public T get(int index) {
    return null;
  }

  public int indexOf(Object t) {
    return -1;
  }

  public int lastIndexOf(Object o) {
    return -1;
  }

  public ListIterator<T> listIterator() {
    return new NullListSequence.EmptyListIterator<T>();
  }

  public ListIterator<T> listIterator(int index) {
    return new NullListSequence.EmptyListIterator<T>();
  }

  public T remove(int index) {
    return null;
  }

  public T set(int index, T element) {
    return null;
  }

  public int size() {
    return 0;
  }

  public List<T> subList(int fromIndex, int toIndex) {
    return this;
  }

  public T removeElementAt(int idx) {
    return null;
  }

  public T removeLastElement() {
    return null;
  }

  public T insertElement(int idx, T t) {
    return null;
  }

  public T getElement(int idx) {
    return null;
  }

  public T setElement(int idx, T t) {
    return null;
  }

  public IListSequence<T> addSequence(ISequence<? extends T> seq) {
    return this;
  }

  public IListSequence<T> reversedList() {
    return this;
  }

  public IListSequence<T> subListSequence(int fromIdx, int upToIdx) {
    return this;
  }

  public IListSequence<T> headListSequence(int upToIdx) {
    return this;
  }

  public IListSequence<T> tailListSequence(int fromIdx) {
    return this;
  }

  public IListSequence<T> removeSequence(ISequence<? extends T> seq) {
    return this;
  }

  @Override
  public IListSequence<T> removeWhere(_FunctionTypes._return_P1_E0<? extends Boolean, ? super T> filter) {
    return (IListSequence<T>) super.removeWhere(filter);
  }

  @Override
  public IListSequence<T> asSynchronized() {
    return this;
  }

  @Override
  public IListSequence<T> asUnmodifiable() {
    return this;
  }

  public List<T> toList() {
    return this;
  }

  @SuppressWarnings(value = "unchecked")
  public T[] toGenericArray() {
    return (T[]) NullCollectionSequence.EMPTY_ARRAY;
  }

  @SuppressWarnings(value = "unchecked")
  public T[] toGenericArray(Class<T> runtimeClass) {
    return (T[]) NullCollectionSequence.EMPTY_ARRAY;
  }

  @SuppressWarnings(value = "unchecked")
  public static <U> NullListSequence<U> instance() {
    return (NullListSequence<U>) INSTANCE;
  }

  protected static class EmptyListIterator<U> implements ListIterator<U> {
    protected EmptyListIterator() {
    }

    public void add(U e) {
    }

    public boolean hasNext() {
      return false;
    }

    public boolean hasPrevious() {
      return false;
    }

    public U next() {
      throw new NoSuchElementException();
    }

    public int nextIndex() {
      return -1;
    }

    public U previous() {
      return null;
    }

    public int previousIndex() {
      return -1;
    }

    public void remove() {
      throw new UnsupportedOperationException();
    }

    public void set(U e) {
      throw new UnsupportedOperationException();
    }
  }
}
