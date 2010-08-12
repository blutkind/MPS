package planarizationTest;

/*Generated by MPS */

import junit.framework.TestCase;
import jetbrains.mps.graphLayout.graph.Graph;
import visualization.GraphIO;
import java.util.Scanner;
import jetbrains.mps.graphLayout.graph.Node;
import jetbrains.mps.graphLayout.planarization.PQPlanarityTest;
import jetbrains.mps.graphLayout.algorithms.GraphOrientation;
import java.util.Map;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.graphLayout.planarGraph.EmbeddedGraph;

public class PQPlanarityTest_Test extends TestCase {
  public void test_test1() throws Exception {
    String graphString = "5 9  0 1  0 2  0 3  0 4  1 2  1 3  1 4  2 3  2 4";
    this.test(graphString);
  }

  public void test_test2() throws Exception {
    String graphString = "9 15  \n0 1  \n0 5  \n0 3  \n0 7  \n1 2  \n2 4  \n2 3  \n3 6  \n3 7  \n3 8  \n4 5  \n4 6  \n5 8  \n6 8 \n 7 8";
    this.test(graphString);
  }

  public void test_test3() throws Exception {
    String graphString = "6 8  0 1  0 2  0 3  0 4  1 4  2 4  3 5  4 5";
    testWithGraph(graphString);
  }

  public void test_test4() throws Exception {
    String graphString = "13 17  0 1  0 2  1 3  1 4  2 5  2 6  3 9  3 7   4 7  5 8  6 8  6 10  7 11  8 11  9 12  10 12  11 12";
    testWithGraph(graphString);
  }

  public void test_test5() throws Exception {
    String graphString = "9 12  0 1  0 3  0 2  1 3  2 8  3 4  4 5  4 6  4 7  5 7  7 8  6 8";
    testWithGraph(graphString);
  }

  public void test_test6() throws Exception {
    String graphString = "5 10  0 1  0 2  0 3  0 4  1 2  1 3  1 4  2 3  2 4  3 4";
    testWithGraph(graphString);
  }

  public void test_test7() throws Exception {
    String graphString = "8 14  0 1  0 2  0 3  0 6  0 7  1 2  1 4  2 3  2 4  3 4  3 6  4 5  5 6  6 7";
    testWithGraph(graphString);
  }

  public void test_test8() throws Exception {
    String graphString = "8 17  0 7  0 5  0 6  0 1  0 3  1 5  1 6  1 2  2 5  2 3  2 4  3 5  3 4  3 6  4 5  5 6  6 7";
    testWithGraph(graphString);
  }

  public void test_testForBreakingST() throws Exception {
    String graphString = "8 14  0 2  0 5  0 1  0 6  0 7  1 5  1 6  1 4  2 3  2 6  3 4  4 5  5 6  6 7";
    testWithGraph(graphString);
  }

  public void test_K6() throws Exception {
    String graphString = "6 15  0 1  0 2  0 3  0 4  0 5  1 2  1 3  1 4  1 5  2 3  2 4  2 5  3 4  3 5  4 5";
    testWithGraph(graphString);
  }

  public void test_JTSPaperGraph() throws Exception {
    String graphString = "10 22  0 1  0 3  0 5  0 6  0 9  1 2  1 5  1 7  1 8  2 3  2 8  3 4  3 7  4 5  4 7  4 8  5 6  5 8  6 8  6 9  7 9  8 9";
    testWithGraph(graphString);
  }

  public void test_test9() throws Exception {
    String graphString = "11 22\n  0 9\n  0 4  \n0 1  \n0 7  \n0 10  \n1 3  \n1 7  \n1 8  \n1 2  \n2 9  \n2 3  \n3 8  \n3 5  \n4 6  \n4 5  \n5 9  \n5 8  \n5 7  \n6 7  \n7 8  \n8 9  \n9 10\n";
    testWithGraph(graphString);
  }

  private void test(String graphString) throws IllegalArgumentException {
    Graph graph = GraphIO.scanGraph(new Scanner(graphString));
    Node s = graph.getNode(0);
    Node t = graph.getNode(4);
    new PQPlanarityTest().testPlanarity(graph, GraphOrientation.orientST(graph, s, t));
  }

  public void testWithGraph(String graphString) {
    Graph graph = GraphIO.scanGraph(new Scanner(graphString));
    Map<Node, Integer> stNumbering = MapSequence.fromMap(new HashMap<Node, Integer>());
    for (Node node : ListSequence.fromList(graph.getNodes())) {
      MapSequence.fromMap(stNumbering).put(node, node.getIndex());
    }
    EmbeddedGraph embeddedGraph = new PQPlanarityTest().testPlanarity(graph, stNumbering);
    CheckEmbeddedGraph.checkEmbeddedGraph(embeddedGraph);
  }
}
