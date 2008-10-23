package jetbrains.mps.util.misc.hash;

import java.util.*;

public class LinkedHashMap<K, V> extends AbstractMap<K, V> implements Map<K, V> {

  private Entry<K, V>[] _table;
  private Entry<K, V> _top;
  private Entry<K, V> _back;
  private int _capacity;
  private int _size;

  public LinkedHashMap() {
    clear();
  }

  public LinkedHashMap(int capacity) {
    clear(capacity);
  }

  public int size() {
    return _size;
  }

  public boolean isEmpty() {
    return size() == 0;
  }

  public void clear() {
    clear(0);
  }

  public V get(final Object key) {
    final Entry<K, V>[] table = _table;
    final int hash = key.hashCode();
    final int index = (hash & 0x7fffffff) % table.length;

    for (Entry<K, V> e = table[index]; e != null; e = e._hashNext) {
      final K entryKey;
      if (e.getKeyHash() == hash && ((entryKey = e.getKey()) == key || entryKey.equals(key))) {
        moveToTop(e);
        return e.getValue();
      }
    }

    return null;
  }

  public V put(final K key, final V value) {
    final Entry<K, V>[] table = _table;
    final int hash = key.hashCode();
    final int index = (hash & 0x7fffffff) % table.length;

    for (Entry<K, V> e = table[index]; e != null; e = e._hashNext) {
      final K entryKey;
      if (e.getKeyHash() == hash && ((entryKey = e.getKey()) == key || entryKey.equals(key))) {
        moveToTop(e);
        return e.setValue(value);
      }
    }

    final Entry<K, V> e = new Entry<K, V>(key, value);
    e._hashNext = table[index];
    table[index] = e;
    final Entry<K, V> top = _top;
    e.setNext(top);
    if (top != null) {
      top.setPrevious(e);
    } else {
      _back = e;
    }
    _top = e;
    _size = _size + 1;

    if (removeEldestEntry(_back)) {
      remove(_back.getKey());
    } else if (_size > _capacity) {
      rehash((int) (_capacity * HashUtil.CAPACITY_MULTIPLE));
    }
    return null;
  }

  public boolean containsKey(final Object key) {
    return get(key) != null;
  }

  public boolean containsValue(final Object value) {
    final ValueIterator it = new ValueIterator();
    while (it.hasNext()) {
      final V next = it.next();
      if (next == value || next.equals(value)) return true;
    }
    return false;
  }

  public V remove(final Object key) {
    final Entry<K, V>[] table = _table;
    final int hash = key.hashCode();
    final int index = (hash & 0x7fffffff) % table.length;
    Entry<K, V> e = table[index];

    if (e != null) {
      K entryKey;
      if (e.getKeyHash() == hash && ((entryKey = e.getKey()) == key || entryKey.equals(key))) {
        table[index] = e._hashNext;
        unlink(e);
        _size = _size - 1;
        return e.getValue();
      }
      for (; ;) {
        Entry<K, V> lastEntry = e;
        e = e._hashNext;
        if (e == null) break;
        if (e.getKeyHash() == hash && ((entryKey = e.getKey()) == key || entryKey.equals(key))) {
          lastEntry._hashNext = e._hashNext;
          unlink(e);
          _size = _size - 1;
          return e.getValue();
        }
      }
    }

    return null;
  }

  public Set<K> keySet() {
    return new KeySet();
  }

  public Collection<V> values() {
    return new Values();
  }

  public Set<Map.Entry<K, V>> entrySet() {
    return new EntrySet();
  }

  protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
    return false;
  }

  private void init(int capacity) {
    _table = new Entry[HashUtil.adjustTableSize((int) (capacity / HashUtil.ENTRIES_PER_BUCKET))];
    _top = _back = null;
    _capacity = capacity;
  }

  private void clear(int capacity) {
    if (capacity < HashUtil.MIN_CAPACITY) {
      capacity = HashUtil.MIN_CAPACITY;
    }
    init(capacity);
    _size = 0;
  }

  private void moveToTop(final Entry<K, V> e) {
    final Entry<K, V> top = _top;
    if (top != e) {
      final Entry<K, V> prev = (Entry<K, V>) e.getPrevious();
      final Entry<K, V> next = (Entry<K, V>) e.getNext();
      prev.setNext(next);
      if (next != null) {
        next.setPrevious(prev);
      } else {
        _back = prev;
      }
      top.setPrevious(e);
      e.setNext(top);
      e.setPrevious(null);
      _top = e;
    }
  }

  private void unlink(final Entry<K, V> e) {
    final Entry<K, V> prev = (Entry<K, V>) e.getPrevious();
    final Entry<K, V> next = (Entry<K, V>) e.getNext();
    if (prev != null) {
      prev.setNext(next);
    } else {
      _top = next;
    }
    if (next != null) {
      next.setPrevious(prev);
    } else {
      _back = prev;
    }
  }

  private void rehash(int capacity) {
    _table = new Entry[HashUtil.adjustTableSize((int) (capacity / HashUtil.ENTRIES_PER_BUCKET))];
    _capacity = capacity;
    final Entry<K, V>[] table = _table;
    final int bucketsLength = table.length;
    for (Entry<K, V> e = _back; e != null; e = (Entry<K, V>) e.getPrevious()) {
      final int hash = (e.getKey().hashCode() & 0x7fffffff) % bucketsLength;
      e._hashNext = table[hash];
      table[hash] = e;
    }
  }

  private static class Entry<K, V> extends LinkableKeyValuePair<K, V> {

    private Entry<K, V> _hashNext;

    public Entry(final K key, final V value) {
      super(key, value);
    }
  }

  private final class KeyIterator implements Iterator<K> {

    private Entry<K, V> e = _top;

    public boolean hasNext() {
      return e != null;
    }

    public K next() {
      final Entry<K, V> lastEntry = e;
      e = (Entry<K, V>) e.getNext();
      return lastEntry.getKey();
    }

    public void remove() {
      LinkedHashMap.this.remove(e.getKey());
    }
  }

  private final class ValueIterator implements Iterator<V> {

    private Entry<K, V> e = _top;

    public boolean hasNext() {
      return e != null;
    }

    public V next() {
      final Entry<K, V> lastEntry = e;
      e = (Entry<K, V>) e.getNext();
      return lastEntry.getValue();
    }

    public void remove() {
      LinkedHashMap.this.remove(e.getKey());
    }
  }

  private final class KeySet extends AbstractSet<K> {

    public Iterator<K> iterator() {
      return new KeyIterator();
    }

    public int size() {
      return _size;
    }

    public boolean contains(Object o) {
      return LinkedHashMap.this.containsKey(o);
    }

    public boolean remove(Object o) {
      return LinkedHashMap.this.remove(o) != null;
    }

    public void clear() {
      LinkedHashMap.this.clear();
    }
  }

  private final class Values extends AbstractCollection<V> {

    public Iterator<V> iterator() {
      return new ValueIterator();
    }

    public int size() {
      return _size;
    }

    public boolean contains(Object o) {
      return containsValue(o);
    }

    public void clear() {
      LinkedHashMap.this.clear();
    }
  }

  private final class EntrySet extends AbstractSet<Map.Entry<K, V>> {

    public Iterator<Map.Entry<K, V>> iterator() {
      return null;
    }

    public boolean contains(Object o) {
      if (!(o instanceof Map.Entry)) {
        return false;
      }
      Map.Entry<K, V> e = (Map.Entry<K, V>) o;
      final V value = get(e.getKey());
      return value != null && value.equals(e.getValue());
    }

    public boolean remove(Object o) {
      if (!(o instanceof Map.Entry)) {
        return false;
      }
      Map.Entry<K, V> e = (Map.Entry<K, V>) o;
      return LinkedHashMap.this.remove(e.getKey()) != null;
    }

    public int size() {
      return _size;
    }

    public void clear() {
      LinkedHashMap.this.clear();
    }
  }
}
