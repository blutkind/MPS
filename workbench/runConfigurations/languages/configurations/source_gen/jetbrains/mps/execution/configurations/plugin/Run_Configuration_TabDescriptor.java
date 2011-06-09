package jetbrains.mps.execution.configurations.plugin;

/*Generated by MPS */

import jetbrains.mps.ide.editorTabs.EditorTabDescriptor;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;

public class Run_Configuration_TabDescriptor extends EditorTabDescriptor {
  public Run_Configuration_TabDescriptor() {
  }

  public String getTitle() {
    return "Run Configuration";
  }

  public void startListening() {
    throw new RuntimeException("NOT IMPLEMENTED");
  }

  public SNode getBaseNode(SNode node) {
    return node;
  }

  public boolean isApplicable(SNode node) {
    return SNodeOperations.isInstanceOf(node, "jetbrains.mps.execution.configurations.structure.RunConfiguration");
  }

  public List<SNode> getNodes(SNode node) {
    List<SNode> list = ListSequence.fromList(new ArrayList<SNode>());
    SNode n = getNode(node);
    if (n == null) {
      return list;
    }
    ListSequence.fromList(list).addElement(n);
    return list;
  }

  public boolean isSingle() {
    return false;
  }

  public SNode getNode(SNode node) {
    return node;
  }
}
