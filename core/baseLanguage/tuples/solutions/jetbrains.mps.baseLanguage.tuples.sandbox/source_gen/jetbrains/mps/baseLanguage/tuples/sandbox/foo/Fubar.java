package jetbrains.mps.baseLanguage.tuples.sandbox.foo;

/*Generated by MPS */

import java.util.HashMap;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import jetbrains.mps.baseLanguage.tuples.runtime.MultiTuple;

public class Fubar {
  public HashMap<Integer, Tuples._2<Integer, Integer>> a = new HashMap<Integer, Tuples._2<Integer, Integer>>();

  public Fubar() {
    this.a.put(1, MultiTuple.<Integer,Integer>from(42, -1));
  }

  public static void main(String[] args) {
    System.out.println(new Fubar().a.get(1)._0());
  }
}
