package planarizationTest;

/*Generated by MPS */

import junit.framework.TestCase;
import jetbrains.mps.graphLayout.graph.Graph;
import sampleGraphs.SimpleDirectedGraphs;
import visualization.GraphIO;
import java.util.Scanner;
import jetbrains.mps.graphLayout.planarization.TreeEmbeddingFinder;
import jetbrains.mps.graphLayout.planarGraph.EmbeddedGraph;

public class TreeEmbeddingFinder_Find_Test extends TestCase {
  public void test_triangle() throws Exception {
    Graph graph = SimpleDirectedGraphs.triangle();
    test(graph);
  }

  public void test_test1() throws Exception {
    String graphString = "4 5  0 1  0 3  1 2  1 3  2 3";
    test(GraphIO.scanGraph(new Scanner(graphString)));
  }

  public void test_test2() throws Exception {
    String graphString = "5 6  0 1  0 3  1 2  1 3  2 3  0 4";
    test(GraphIO.scanGraph(new Scanner(graphString)));
  }

  public void test_K5() throws Exception {
    String graphString = "5 10  0 1  0 2  0 3  0 4  1 2  1 3  1 4  2 3  2 4  3 4";
    test(GraphIO.scanGraph(new Scanner(graphString)));
  }

  public void test_K3_3() throws Exception {
    String graphString = "6 9  0 3  0 4  0 5  1 3  1 4  1 5  2 3  2 4  2 5";
    test(GraphIO.scanGraph(new Scanner(graphString)));
  }

  public void test_BookGraph() throws Exception {
    String graphString = "9 15  \n0 1  \n0 5  \n0 3  \n0 7  \n1 2  \n2 4  \n2 3  \n3 6  \n3 7  \n3 8  \n4 5  \n4 6  \n5 8  \n6 8 \n 7 8";
    test(GraphIO.scanGraph(new Scanner(graphString)));
  }

  public void test(Graph graph) {
    TreeEmbeddingFinder embeddingFinder = new TreeEmbeddingFinder();
    EmbeddedGraph embeddedGraph = embeddingFinder.find(graph);
    CheckEmbeddedGraph.checkEmbeddedGraph(embeddedGraph, true);
  }
}
