package jetbrains.mps.regex.samples;

/*Generated by MPS */

import java.util.regex.Pattern;
import jetbrains.mps.baseLanguage.regexp.runtime.RegexpOperations;

/*package*/ class SimpleReplace {
  private static Pattern REGEXP_x5qji9_b0a1a0 = Pattern.compile("abc", 0);
  private static Pattern REGEXP_x5qji9_b0a1a1 = Pattern.compile("\\((.*?)\\)", 0);

  public SimpleReplace() {
  }

  /*package*/ void simplestReplace() {
    String s = "";
    s = RegexpOperations.replace(s, REGEXP_x5qji9_b0a1a0, new _Replacer_a0a0b0a(SimpleReplace.this, null));
  }

  /*package*/ void replaceWithCapture() {
    String s = "";
    s = RegexpOperations.replace(s, REGEXP_x5qji9_b0a1a1, new _Replacer_a0a0b0b(SimpleReplace.this, null));
  }
}
