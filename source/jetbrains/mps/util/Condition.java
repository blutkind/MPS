package jetbrains.mps.util;

/**
 * Author: Sergey Dmitriev.
 * Time: Nov 24, 2003 1:27:18 PM
 */
public interface Condition<T> {
  public boolean met(T object);
}
