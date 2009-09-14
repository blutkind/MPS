package ypath.traversalTests;

/*Generated by MPS */

import junit.framework.TestCase;
import org.junit.Test;
import org.w3c.dom.Document;
import jetbrains.mps.ypath.runtime.ITreeTraversal;
import org.w3c.dom.Node;
import jetbrains.mps.ypath.runtime.TreeTraversalFactory;
import treepath_dom.DOM2;
import junit.framework.Assert;
import jetbrains.mps.internal.collections.runtime.Sequence;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import javax.xml.parsers.DocumentBuilderFactory;

public class TestFeatures_Test extends TestCase {
  private static String SIMPLE = "<root r1=\"r1\"><a a1=\"a1\"><b b1=\"b1\" b2=\"b2\"><c c1=\"c1\"/></b></a></root>";

  @Test
  public void nodesAndAttributes() throws Exception {
    Document doc = this.parse(SIMPLE);
    ITreeTraversal<Node> nodes = TreeTraversalFactory.Traverse(new DOM2().startTraversal(doc), TreeTraversalFactory.Axis("DESCENDANTS"), "nodes");
    Assert.assertEquals("root, a, b, c", this.toString(nodes));
    ITreeTraversal<Node> attribs = TreeTraversalFactory.Traverse(new DOM2().startTraversal(doc), TreeTraversalFactory.Axis("DESCENDANTS"), "attributes");
    Assert.assertEquals(0, Sequence.fromIterable(attribs).count());
    ITreeTraversal<Node> rootChildren = TreeTraversalFactory.Traverse(TreeTraversalFactory.Traverse(new DOM2().startTraversal(doc), TreeTraversalFactory.Axis("CHILDREN"), "nodes"), TreeTraversalFactory.Axis("CHILDREN"));
    Assert.assertEquals("r1, a", this.toString(rootChildren));
    ITreeTraversal<Node> everything = TreeTraversalFactory.Traverse(new DOM2().startTraversal(doc), TreeTraversalFactory.Axis("DESCENDANTS"));
    Assert.assertEquals("root, r1, #text, a, a1, #text, b, b1, #text, b2, #text, c, c1, #text", this.toString(everything));
  }

  public Document parse(String xml) throws Exception {
    InputStream is = new ByteArrayInputStream(xml.getBytes());
    Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(is);
    return doc;
  }

  public String toString(Iterable<Node> nodes) {
    StringBuilder sb = new StringBuilder();
    String sep = "";
    for (Node n : Sequence.fromIterable(nodes)) {
      sb.append(sep).append(n.getNodeName());
      sep = ", ";
    }
    return sb.toString();
  }
}
