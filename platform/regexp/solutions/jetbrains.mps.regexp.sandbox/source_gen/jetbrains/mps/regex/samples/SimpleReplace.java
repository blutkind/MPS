package jetbrains.mps.regex.samples;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.regexp.runtime.RegexpOperations;

/* package */class SimpleReplace {

  /* package */void simplestReplace() {
    String s = "";
    s = RegexpOperations.replace(s, _PrecompiledPatterns.REGEXP3, new _Replacer0(SimpleReplace.this, null));
  }

  /* package */void replaceWithCapture() {
    String s = "";
    s = RegexpOperations.replace(s, _PrecompiledPatterns.REGEXP4, new _Replacer1(SimpleReplace.this, null));
  }

}
