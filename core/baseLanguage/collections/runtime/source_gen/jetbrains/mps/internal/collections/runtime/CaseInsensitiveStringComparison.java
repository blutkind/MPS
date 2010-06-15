package jetbrains.mps.internal.collections.runtime;

/*Generated by MPS */


public class CaseInsensitiveStringComparison {
  public CaseInsensitiveStringComparison() {
  }

  @SuppressWarnings(value = "unchecked")
  public static <T> int compare(T a, T b, ISelector<T, Comparable<?>> selector) {
    if (a == b) {
      return 0;
    }
    if (a == null || b == null) {
      return (a == null ?
        -1 :
        1
      );
    }
    Object selA = selector.select(a);
    Object selB = selector.select(b);
    if (selA == selB) {
      return 0;
    }
    if (selA == null || selB == null) {
      return (selA == null ?
        -1 :
        1
      );
    }
    if ((selA instanceof String) && (selB instanceof String)) {
      return String.CASE_INSENSITIVE_ORDER.compare((String) selA, (String) selB);
    }
    return ((Comparable<Object>) selA).compareTo((Comparable<Object>) selB);
  }
}
