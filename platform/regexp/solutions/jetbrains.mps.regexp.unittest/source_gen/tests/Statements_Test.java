package tests;

/*Generated by MPS */

import junit.framework.TestCase;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import junit.framework.Assert;

public class Statements_Test extends TestCase {
  public void test_ifmatch() throws Exception {
    String input = "reader@gmail.com";
    boolean matches = false;
    {
      Pattern _pattern_0 = _PrecompiledPatterns.REGEXP0;
      Matcher _matcher_0 = _pattern_0.matcher(input);
      if (_matcher_0.matches()) {
        matches = true;
      }
    }
    Assert.assertTrue(matches);
  }
}
