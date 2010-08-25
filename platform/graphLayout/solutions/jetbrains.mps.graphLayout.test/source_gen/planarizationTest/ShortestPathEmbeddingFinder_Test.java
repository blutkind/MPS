package planarizationTest;

/*Generated by MPS */

import junit.framework.TestCase;
import jetbrains.mps.graphLayout.graph.Graph;
import sampleGraphs.SimpleDirectedGraphs;
import visualization.GraphIO;
import java.util.Scanner;
import jetbrains.mps.graphLayout.planarGraph.EmbeddedGraph;
import jetbrains.mps.graphLayout.planarization.ShortestPathEmbeddingFinder;
import jetbrains.mps.graphLayout.planarization.BiconnectedInitialEmbeddingFinder;
import jetbrains.mps.graphLayout.planarization.PQPlanarizationFinder;

public class ShortestPathEmbeddingFinder_Test extends TestCase {
  public void test_cycle() throws Exception {
    Graph cycle = SimpleDirectedGraphs.cycle(5);
    test(cycle);
  }

  public void test_test1() throws Exception {
    String graphString = "6 7  0 1  1 2  2 3  3 0  1 4  4 5  5 2";
    test(GraphIO.scanGraph(new Scanner(graphString)));
  }

  public void test_K5() throws Exception {
    String graphString = "5 10  0 1  0 2  0 3  0 4  1 2  1 3  1 4  2 3  2 4  3 4";
    test(GraphIO.scanGraph(new Scanner(graphString)));
  }

  public void test_BookGraph() throws Exception {
    String graphString = "9 15  \n0 1  \n0 5  \n0 3  \n0 7  \n1 2  \n2 4  \n2 3  \n3 6  \n3 7  \n3 8  \n4 5  \n4 6  \n5 8  \n6 8 \n 7 8";
    test(GraphIO.scanGraph(new Scanner(graphString)));
  }

  public void test_K3_3() throws Exception {
    String graphString = "6 9  0 3  0 4  0 5  1 3  1 4  1 5  2 3  2 4  2 5";
    test(GraphIO.scanGraph(new Scanner(graphString)));
  }

  public void test_test2() throws Exception {
    String graphString = "7 12\n  0 3\n  0 1  \n1 2  \n1 6  \n2 5  \n2 4  \n3 5  \n4 0  \n5 4  \n5 0  \n6 4  \n6 3";
    Graph graph = GraphIO.scanGraph(new Scanner(graphString));
    testPQ(graph);
  }

  public void test(Graph graph) {
    EmbeddedGraph embeddedGraph = new ShortestPathEmbeddingFinder(new BiconnectedInitialEmbeddingFinder()).find(graph);
    CheckEmbeddedGraph.checkEmbeddedGraph(embeddedGraph);
    CheckEmbeddedGraph.checkFull(embeddedGraph);
  }

  public void testPQ(Graph graph) {
    EmbeddedGraph embeddedGraph = new ShortestPathEmbeddingFinder(new PQPlanarizationFinder()).find(graph);
    CheckEmbeddedGraph.checkEmbeddedGraph(embeddedGraph);
    CheckEmbeddedGraph.checkFull(embeddedGraph);
  }
}
