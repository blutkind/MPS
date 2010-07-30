package jetbrains.mps.graphLayout.planarGraph;

/*Generated by MPS */

import jetbrains.mps.graphLayout.graph.Graph;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.graphLayout.graph.Node;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.internal.collections.runtime.ISelector;

public class Face {
  private Graph myGraph;
  private List<Dart> myDarts;

  public Face(Graph graph) {
    myGraph = graph;
    myDarts = ListSequence.fromList(new ArrayList<Dart>());
  }

  public void addLast(Dart dart) {
    ListSequence.fromList(myDarts).addElement(dart);
  }

  public void addFirst(Dart dart) {
    ListSequence.fromList(myDarts).insertElement(0, dart);
  }

  public List<Dart> getDarts() {
    return myDarts;
  }

  public boolean contains(List<Node> nodes) {
    Set<Node> faceNodes = SetSequence.fromSet(new HashSet<Node>());
    SetSequence.fromSet(faceNodes).addSequence(ListSequence.fromList(myDarts).select(new ISelector<Dart, Node>() {
      public Node select(Dart it) {
        return it.getSource();
      }
    }));
    return SetSequence.fromSet(faceNodes).containsSequence(ListSequence.fromList(nodes));
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Face:\n");
    for (Dart dart : ListSequence.fromList(myDarts)) {
      builder.append(dart + ", ");
    }
    builder.append("\n");
    return builder.toString();
  }
}
