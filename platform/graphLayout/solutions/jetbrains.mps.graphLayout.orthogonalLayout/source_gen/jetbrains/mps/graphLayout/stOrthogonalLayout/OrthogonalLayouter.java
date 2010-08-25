package jetbrains.mps.graphLayout.stOrthogonalLayout;

/*Generated by MPS */

import jetbrains.mps.graphLayout.graphLayout.ILayouter;
import jetbrains.mps.graphLayout.graphLayout.GraphPointLayout;
import jetbrains.mps.graphLayout.graph.Graph;
import java.util.Map;
import jetbrains.mps.graphLayout.graph.Node;
import jetbrains.mps.graphLayout.algorithms.ConnectivityComponents;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.graphLayout.util.NodeMap;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.graphLayout.graph.Edge;
import jetbrains.mps.graphLayout.algorithms.BiconnectAugmentation;
import jetbrains.mps.graphLayout.planarization.TreeEmbeddingFinder;
import jetbrains.mps.graphLayout.planarGraph.EmbeddedGraph;
import jetbrains.mps.graphLayout.planarization.ShortestPathEmbeddingFinder;
import jetbrains.mps.graphLayout.planarization.BiconnectedInitialEmbeddingFinder;
import jetbrains.mps.graphLayout.planarGraph.Dart;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.graphLayout.algorithms.GraphOrientation;
import jetbrains.mps.graphLayout.planarGraph.STPlanarGraph;

public class OrthogonalLayouter implements ILayouter {
  public OrthogonalLayouter() {
  }

  public GraphPointLayout doLayout(Graph graph) {
    Map<Node, Integer> components = ConnectivityComponents.getComponents(graph);
    int maxComponent = 0;
    for (Node node : ListSequence.fromList(graph.getNodes())) {
      maxComponent = Math.max(maxComponent, MapSequence.fromMap(components).get(node));
    }
    Map<Node, Node> newNodes = new NodeMap<Node>(graph);
    List<Graph> subgraphs = ListSequence.fromList(new ArrayList<Graph>());
    for (int i = 0; i <= maxComponent; i++) {
      ListSequence.fromList(subgraphs).addElement(new Graph());
    }
    for (Node node : ListSequence.fromList(graph.getNodes())) {
      Graph subgraph = ListSequence.fromList(subgraphs).getElement(MapSequence.fromMap(components).get(node));
      MapSequence.fromMap(newNodes).put(node, subgraph.addNode());
    }
    for (Edge edge : ListSequence.fromList(graph.getEdges())) {
      MapSequence.fromMap(newNodes).get(edge.getSource()).addEdgeTo(MapSequence.fromMap(newNodes).get(edge.getTarget()));
    }
    /*
      for (Graph subgraph : ListSequence.fromList(subgraphs)) {
        findSTLayout(graph);
      }
    */
    return findSTLayout(ListSequence.fromList(subgraphs).getElement(0));
  }

  public GraphPointLayout findSTLayout(Graph graph) {
    BiconnectAugmentation.makeBiconnected(graph);
    final int maxIndex = graph.getNumNodes();
    TreeEmbeddingFinder embeddingFinder = new TreeEmbeddingFinder();
    EmbeddedGraph embeddedGraph = new ShortestPathEmbeddingFinder(new BiconnectedInitialEmbeddingFinder()).find(graph);
    List<Node> outerNodes = ListSequence.fromList(new ArrayList<Node>());
    for (Dart dart : ListSequence.fromList(embeddedGraph.getOuterFace().getDarts())) {
      ListSequence.fromList(outerNodes).addElement(dart.getTarget());
    }
    outerNodes = ListSequence.fromList(outerNodes).where(new IWhereFilter<Node>() {
      public boolean accept(Node it) {
        return it.getIndex() < maxIndex;
      }
    }).toListSequence();
    Node s = ListSequence.fromList(outerNodes).getElement(0);
    Node t = ListSequence.fromList(outerNodes).getElement((ListSequence.fromList(outerNodes).count()) / 2);
    GraphOrientation.orientST(graph, s, t);
    STPlanarGraph stPlanarGraph = new STPlanarGraph(embeddedGraph, s, t);
    return new OrthogonalFromVisibility().doLayout(stPlanarGraph);
  }
}
