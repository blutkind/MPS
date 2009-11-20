package tests;

/*Generated by MPS */

import junit.framework.TestCase;
import junit.framework.Assert;
import java.util.regex.Pattern;

public class Escaping_Test extends TestCase {
  public void test_escapeInLiteral() throws Exception {
    Assert.assertTrue(_PrecompiledPatterns.REGEXP2.matcher("[asdsa]").matches());
    Assert.assertTrue(_PrecompiledPatterns.REGEXP3.matcher("(asdsa)").matches());
    Assert.assertTrue(_PrecompiledPatterns.REGEXP4.matcher("{qq}").matches());
    Assert.assertFalse(_PrecompiledPatterns.REGEXP5.matcher("s{qq}").matches());
  }

  public void test_testPredefined() throws Exception {
    Pattern p = _PrecompiledPatterns.REGEXP19;
    Assert.assertEquals("\\s\\\\\\W[\\w\\D]\\b", p.pattern());
  }

  public void test_range1() throws Exception {
    Pattern p = _PrecompiledPatterns.REGEXP26;
    Assert.assertEquals("[ac-f\\d\\-]", p.pattern());
  }

  public void test_rangeIntersection() throws Exception {
    Pattern p = _PrecompiledPatterns.REGEXP17;
    Assert.assertEquals("[1-9\\w&&[^d-f]]", p.pattern());
    Assert.assertTrue(p.matcher("1").matches());
    Assert.assertTrue(p.matcher("a").matches());
    Assert.assertTrue(p.matcher("g").matches());
    Assert.assertFalse(p.matcher("f").matches());
  }

  public void test_rangeIntersectionSimple() throws Exception {
    Pattern p = _PrecompiledPatterns.REGEXP18;
    Assert.assertEquals("[\\w&&[^d-f]]", p.pattern());
  }

  public void test_testStringLiteral() throws Exception {
    Pattern p = _PrecompiledPatterns.REGEXP20;
    Assert.assertEquals("'\\'\"\\\"", p.pattern());
    Assert.assertTrue(p.matcher("''\"\"").matches());
  }

  public void test_testBackref() throws Exception {
    Pattern p = _PrecompiledPatterns.REGEXP21;
    Assert.assertEquals("^(\\w+)\\1$", p.pattern());
    Assert.assertTrue(p.matcher("kbbbwkbbbw").matches());
    Assert.assertFalse(p.matcher("kbbbwkbbw").matches());
  }

  public void test_testAutoBrackets() throws Exception {
    Pattern p = _PrecompiledPatterns.REGEXP22;
    Assert.assertEquals("^(?:\\w\\w)+$", p.pattern());
    Assert.assertTrue(p.matcher("bwbb").matches());
    Assert.assertFalse(p.matcher("bbb").matches());
  }

  public void test_testAutoBrackets24() throws Exception {
    Pattern p = _PrecompiledPatterns.REGEXP23;
    Assert.assertEquals("^(?:\\w\\w){2,4}$", p.pattern());
    Assert.assertTrue(p.matcher("bwbbbb").matches());
    Assert.assertFalse(p.matcher("bbaabbaacc").matches());
  }

  public void test_testAutoBrackets2ormore() throws Exception {
    Pattern p = _PrecompiledPatterns.REGEXP24;
    Assert.assertEquals("^(?:\\w\\w){2,}$", p.pattern());
    Assert.assertTrue(p.matcher("bwbb").matches());
    Assert.assertFalse(p.matcher("bb").matches());
  }

  public void test_testAutoBrackets2exactly() throws Exception {
    Pattern p = _PrecompiledPatterns.REGEXP25;
    Assert.assertEquals("^(?:\\w\\w){2}$", p.pattern());
    Assert.assertTrue(p.matcher("bwbb").matches());
    Assert.assertFalse(p.matcher("bb").matches());
  }
}
