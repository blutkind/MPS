package jetbrains.mps.lang.test.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class NodeOperationsContainer extends BaseConcept {
  public static final String concept = "jetbrains.mps.lang.test.structure.NodeOperationsContainer";
  public static String OPERATIONS = "operations";

  public NodeOperationsContainer(SNode node) {
    super(node);
  }

  public int getOperationsesCount() {
    return this.getChildCount(NodeOperationsContainer.OPERATIONS);
  }

  public Iterator<NodeOperation> operationses() {
    return this.children(NodeOperationsContainer.OPERATIONS);
  }

  public List<NodeOperation> getOperationses() {
    return this.getChildren(NodeOperationsContainer.OPERATIONS);
  }

  public void addOperations(NodeOperation node) {
    this.addChild(NodeOperationsContainer.OPERATIONS, node);
  }

  public void insertOperations(NodeOperation prev, NodeOperation node) {
    this.insertChild(prev, NodeOperationsContainer.OPERATIONS, node);
  }


  public static NodeOperationsContainer newInstance(SModel sm, boolean init) {
    return (NodeOperationsContainer)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.test.structure.NodeOperationsContainer", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static NodeOperationsContainer newInstance(SModel sm) {
    return NodeOperationsContainer.newInstance(sm, false);
  }

}
