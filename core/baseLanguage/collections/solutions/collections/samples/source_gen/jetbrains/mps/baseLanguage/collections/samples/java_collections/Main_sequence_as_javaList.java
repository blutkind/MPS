package jetbrains.mps.baseLanguage.collections.samples.java_collections;

/*Generated by MPS */

import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ISequenceClosure;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.closures.runtime.YieldingIterator;
import java.util.List;

/* package */class Main_sequence_as_javaList {

  /* package */static void main(String[] args) {
    Iterable<Integer> sequence = Sequence.fromClosure(new ISequenceClosure <Integer>() {

      public Iterable<Integer> iterable() {
        return new Iterable <Integer>() {

          public Iterator<Integer> iterator() {
            return new YieldingIterator <Integer>() {

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
                      if (!(_2_i < 5)) {
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
    List<Integer> list = Sequence.fromIterable(sequence).toListSequence();
    System.out.println("list: type cast -> java-list");
    List<Integer> javaList = list;
    for(Integer n : javaList) {
      System.out.println(n);
    }
  }

}
