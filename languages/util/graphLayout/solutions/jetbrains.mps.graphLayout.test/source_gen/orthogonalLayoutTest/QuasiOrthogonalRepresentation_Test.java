package orthogonalLayoutTest;

/*Generated by MPS */

import junit.framework.TestCase;
import jetbrains.mps.graphLayout.graph.Graph;
import visualization.GraphIO;
import java.util.Scanner;
import sampleGraphs.SimpleDirectedGraphs;
import jetbrains.mps.graphLayout.planarGraph.EmbeddedGraph;
import jetbrains.mps.graphLayout.planarization.PQPlanarizationFinder;
import java.util.Map;
import jetbrains.mps.graphLayout.planarGraph.Dart;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.graphLayout.flowOrthogonalLayout.QuasiOrthogonalRepresentation;
import java.util.Set;
import jetbrains.mps.graphLayout.graph.Edge;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.graphLayout.flowOrthogonalLayout.QuasiRepresentationModifier;
import jetbrains.mps.graphLayout.planarGraph.CheckEmbeddedGraph;

public class QuasiOrthogonalRepresentation_Test extends TestCase {
  public void test_test1() throws Exception {
    String graphString = "4 4  0 1  1 2  2 3  3 0";
    Graph graph = GraphIO.scanGraph(new Scanner(graphString));
    testPlanarBiconnectedGraph(graph);
  }

  public void test_test2() throws Exception {
    String graphString = "6 7  0 1  0 2  1 3  2 3  2 4  4 5  3 5";
    Graph graph = GraphIO.scanGraph(new Scanner(graphString));
    testPlanarBiconnectedGraph(graph);
  }

  public void test_test3() throws Exception {
    String graphString = "3 3  0 1  1 2  2 0";
    Graph graph = GraphIO.scanGraph(new Scanner(graphString));
    testPlanarBiconnectedGraph(graph);
  }

  public void test_test4() throws Exception {
    Graph graph = SimpleDirectedGraphs.weel(6);
    testPlanarBiconnectedGraph(graph);
  }

  public void test_test5() throws Exception {
    Graph graph = SimpleDirectedGraphs.weel(10);
    testPlanarBiconnectedGraph(graph);
  }

  public void test_K4() throws Exception {
    String graphString = "4 6  0 1  0 2  0 3  1 2  1 3  2 3";
    Graph graph = GraphIO.scanGraph(new Scanner(graphString));
    testPlanarBiconnectedGraph(graph);
  }

  public void test_test6() throws Exception {
    String graphString = "6 11  \n0 3  \n1 4  \n1 5  \n2 4  \n2 0  \n2 1  \n3 4  \n3 1  \n4 0  \n4 5  \n5 2";
    Graph graph = GraphIO.scanGraph(new Scanner(graphString));
    testPlanarBiconnectedGraph(graph);
  }

  public void test_test7() throws Exception {
    String graphString = "6 9  0 1  0 2  0 3  0 4  0 5  1 2  1 3  1 4  1 5";
    Graph graph = GraphIO.scanGraph(new Scanner(graphString));
    testPlanarBiconnectedGraph(graph);
  }

  public void test_test8() throws Exception {
    Graph graph = GraphIO.scanGraph("7 12  \n0 3  \n1 4  \n3 5  \n3 2  \n4 2  \n4 5  \n4 6  \n4 0  \n4 3  \n5 1  \n6 0  \n6 3");
    testPlanarBiconnectedGraph(graph);
  }

  public void testPlanarBiconnectedGraph(Graph graph) {
    EmbeddedGraph embeddedGraph = new PQPlanarizationFinder().find(graph);
    Map<Dart, Integer> bends = MapSequence.fromMap(new HashMap<Dart, Integer>());
    Map<Dart, Integer> angles = MapSequence.fromMap(new HashMap<Dart, Integer>());
    QuasiOrthogonalRepresentation.getRepresentation(embeddedGraph, bends, angles);
    Set<Edge> oldEdges = SetSequence.fromSet(new HashSet<Edge>());
    SetSequence.fromSet(oldEdges).addSequence(ListSequence.fromList(graph.getEdges()));
    OrthogonalRepresentationChecker.checkOrthogonalRepresentation(graph, bends, angles, 0);
    new QuasiRepresentationModifier(embeddedGraph, bends, angles).reduceToOrthogonalRepresentation();
    CheckEmbeddedGraph.checkEmbeddedGraph(embeddedGraph, false);
    OrthogonalRepresentationChecker.checkOrthogonalRepresentation(graph, bends, angles, 1);
  }
}
