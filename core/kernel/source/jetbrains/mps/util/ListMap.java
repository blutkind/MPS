package jetbrains.mps.util;

import java.util.*;

public class ListMap<K, V> extends AbstractMap<K, V> {
  private MyEntry<K, V>[] myEntries = MyEntry.EMPTY_ARRAY;

  public ListMap() {
  }

  private List<MyEntry<K, V>> _entries() {
    return (List<MyEntry<K, V>>) (List) new ArrayWrapper<MyEntry>() {
      protected MyEntry[] getArray() {
        return myEntries;
      }

      protected void setArray(MyEntry[] newArray) {
        myEntries = newArray;
      }

      protected MyEntry[] newArray(int size) {
        return new MyEntry[size];
      }
    };
  }

  public V put(K key, V value) {
    for (MyEntry<K, V> e : myEntries) {
      if (key.equals(e.myKey)) {
        V oldValue = e.myValue;
        e.myValue = value;
        return oldValue;
      }
    }
    _entries().add(new MyEntry<K, V>(key, value));
    return null;
  }

  public Set<Entry<K, V>> entrySet() {
    return new AbstractSet<Entry<K, V>>() {
      public Iterator<Entry<K, V>> iterator() {
        return (Iterator<Entry<K,V>>) (Iterator) _entries().iterator();
      }

      public int size() {
        return myEntries.length;
      }
    };
  }


  public V get(Object key) {
    for (MyEntry<K, V> e : myEntries) {
      if (e.myKey.equals(key)) {
        return e.myValue;
      }
    }
    return null;
  }

  private static class MyEntry<K, V> implements Entry<K, V> {
    private static MyEntry[] EMPTY_ARRAY = new MyEntry[0];

    private K myKey;
    private V myValue;

    private MyEntry(K key, V value) {
      myKey = key;
      myValue = value;
    }

    public K getKey() {
      return myKey;
    }

    public V getValue() {
      return myValue;
    }

    public V setValue(V value) {
      V oldValue = myValue;
      myValue = value;
      return oldValue;
    }
  }
}
