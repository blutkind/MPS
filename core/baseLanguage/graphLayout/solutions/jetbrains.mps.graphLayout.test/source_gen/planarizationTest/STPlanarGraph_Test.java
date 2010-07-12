package planarizationTest;

/*Generated by MPS */

import junit.framework.TestCase;
import jetbrains.mps.graphLayout.graph.Graph;
import sampleGraphs.SimpleDirectedGraphs;
import jetbrains.mps.graphLayout.graph.Node;
import jetbrains.mps.graphLayout.graph.Edge;
import jetbrains.mps.graphLayout.planarGraph.EmbeddedGraph;
import jetbrains.mps.graphLayout.planarGraph.Face;
import jetbrains.mps.graphLayout.planarGraph.Dart;
import jetbrains.mps.graphLayout.algorithms.GraphOrientation;
import jetbrains.mps.graphLayout.planarGraph.STPlanarGraph;
import junit.framework.Assert;
import visualization.GraphIO;
import java.util.Scanner;
import jetbrains.mps.graphLayout.planarization.TreeEmbeddingFinder;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.graphLayout.planarization.ShortestPathEmbeddingFinder;
import jetbrains.mps.graphLayout.planarization.BiconnectedInitialEmbeddingFinder;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.graphLayout.planarGraph.DualGraph;
import jetbrains.mps.graphLayout.algorithms.TopologicalNumbering;

public class STPlanarGraph_Test extends TestCase {
  public void test_test1() throws Exception {
    Graph graph = SimpleDirectedGraphs.emptyGraph(4);
    Node node0 = graph.getNode(0);
    Node node1 = graph.getNode(1);
    Node node2 = graph.getNode(2);
    Node node3 = graph.getNode(3);
    Edge edge01 = node0.addEdgeTo(node1);
    Edge edge13 = node1.addEdgeTo(node3);
    Edge edge32 = node3.addEdgeTo(node2);
    Edge edge20 = node2.addEdgeTo(node0);
    Edge edge12 = node1.addEdgeTo(node2);
    EmbeddedGraph embeddedGraph = new EmbeddedGraph(graph);
    Face face012 = new Face(graph);
    face012.addNext(new Dart(edge01, node0));
    face012.addNext(new Dart(edge12, node1));
    face012.addNext(new Dart(edge20, node2));
    embeddedGraph.addFace(face012);
    Face face132 = new Face(graph);
    face132.addNext(new Dart(edge13, node1));
    face132.addNext(new Dart(edge32, node3));
    face132.addNext(new Dart(edge12, node2));
    embeddedGraph.addFace(face132);
    Face face0123 = new Face(graph);
    face0123.addNext(new Dart(edge01, node1));
    face0123.addNext(new Dart(edge20, node0));
    face0123.addNext(new Dart(edge32, node2));
    face0123.addNext(new Dart(edge13, node3));
    embeddedGraph.addFace(face0123);
    embeddedGraph.setOuterFace(face0123);
    GraphOrientation.orientST(graph, node1, node0);
    STPlanarGraph stPlanarGraph = new STPlanarGraph(embeddedGraph, node1, node0);
    Assert.assertTrue(stPlanarGraph.getOrigNode(face012) == node1);
    Assert.assertTrue(stPlanarGraph.getDestNode(face012) == node0);
    Assert.assertTrue(stPlanarGraph.getOrigNode(face132) == node1);
    Assert.assertTrue(stPlanarGraph.getDestNode(face132) == node2);
    Assert.assertTrue(stPlanarGraph.getOrigNode(face0123) == node1);
    Assert.assertTrue(stPlanarGraph.getDestNode(face0123) == node0);
    Assert.assertTrue(stPlanarGraph.getLeftFace(edge01) == face012);
    Assert.assertTrue(stPlanarGraph.getRightFace(edge01) == face0123);
    Assert.assertTrue(stPlanarGraph.getLeftFace(edge13) == face0123);
    Assert.assertTrue(stPlanarGraph.getRightFace(edge13) == face132);
    Assert.assertTrue(stPlanarGraph.getLeftFace(edge32) == face0123);
    Assert.assertTrue(stPlanarGraph.getRightFace(edge32) == face132);
    Assert.assertTrue(stPlanarGraph.getLeftFace(edge20) == face0123);
    Assert.assertTrue(stPlanarGraph.getRightFace(edge20) == face012);
    Assert.assertTrue(stPlanarGraph.getLeftFace(edge12) == face132);
    Assert.assertTrue(stPlanarGraph.getRightFace(edge12) == face012);
    Assert.assertTrue(stPlanarGraph.getLeftFace(node0) == face0123);
    Assert.assertTrue(stPlanarGraph.getRightFace(node0) == face0123);
    Assert.assertTrue(stPlanarGraph.getLeftFace(node1) == face0123);
    Assert.assertTrue(stPlanarGraph.getRightFace(node1) == face0123);
    Assert.assertTrue(stPlanarGraph.getLeftFace(node2) == face0123);
    Assert.assertTrue(stPlanarGraph.getRightFace(node2) == face012);
    Assert.assertTrue(stPlanarGraph.getLeftFace(node3) == face0123);
    Assert.assertTrue(stPlanarGraph.getRightFace(node3) == face132);
  }

  public void test_K5() throws Exception {
    String graphString = "5 10  0 1  0 2  0 3  0 4  1 2  1 3  1 4  2 3  2 4  3 4";
    Graph graph = GraphIO.scanGraph(new Scanner(graphString));
    /*
      EmbeddedGraph embeddedGraph = new TreeEmbeddingFinder().find(graph);
      Node s = ListSequence.fromList(embeddedGraph.getOuterFace().getDarts()).getElement(0).getSource();
      Node t = ListSequence.fromList(embeddedGraph.getOuterFace().getDarts()).getElement(0).getTarget();
    */
    EmbeddedGraph embeddedGraph = new ShortestPathEmbeddingFinder(new BiconnectedInitialEmbeddingFinder()).find(graph);
    List<Node> outerNodes = ListSequence.fromList(new ArrayList<Node>());
    for (Dart dart : ListSequence.fromList(embeddedGraph.getOuterFace().getDarts())) {
      ListSequence.fromList(outerNodes).addElement(dart.getTarget());
    }
    Node s = ListSequence.fromList(outerNodes).getElement(0);
    Node t = ListSequence.fromList(outerNodes).getElement((ListSequence.fromList(outerNodes).count()) / 2);
    GraphOrientation.orientST(graph, s, t);
    STPlanarGraph stPlanarGraph = new STPlanarGraph(embeddedGraph, s, t);
    DualGraph dualGraph = stPlanarGraph.getModifiedDualGraph();
    TopologicalNumbering.number(dualGraph);
  }

  public void test_BookGraph() throws Exception {
    String graphString = "9 15  \n0 1  \n0 5  \n0 3  \n0 7  \n1 2  \n2 4  \n2 3  \n3 6  \n3 7  \n3 8  \n4 5  \n4 6  \n5 8  \n6 8 \n 7 8";
    Graph graph = GraphIO.scanGraph(new Scanner(graphString));
    EmbeddedGraph embeddedGraph = new ShortestPathEmbeddingFinder(new BiconnectedInitialEmbeddingFinder()).find(graph);
    List<Node> outerNodes = ListSequence.fromList(new ArrayList<Node>());
    for (Dart dart : ListSequence.fromList(embeddedGraph.getOuterFace().getDarts())) {
      ListSequence.fromList(outerNodes).addElement(dart.getTarget());
    }
    Node s = ListSequence.fromList(outerNodes).getElement(0);
    Node t = ListSequence.fromList(outerNodes).getElement((ListSequence.fromList(outerNodes).count()) / 2);
    STPlanarGraph stPlanarGraph = new STPlanarGraph(embeddedGraph, s, t);
    DualGraph dualGraph = stPlanarGraph.getModifiedDualGraph();
    System.out.println(dualGraph);
  }
}
