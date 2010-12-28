package jetbrains.mps.vcs.diff.changes;

/*Generated by MPS */

import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SNodeId;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ISelector;
import java.util.List;
import jetbrains.mps.util.LongestCommonSubsequenceFinder;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.internal.collections.runtime.ISetSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;

public class ChangeSetBuilder {
  private SModel myOldModel;
  private SModel myNewModel;
  private ChangeSet myChangeSet;

  private ChangeSetBuilder(SModel oldModel, SModel newModel) {
    myOldModel = oldModel;
    myNewModel = newModel;
    myChangeSet = new ChangeSet(oldModel, newModel);
    buildChanges();
  }

  private void buildNodeChanges(SNode oldNode) {
    SNodeId nodeId = oldNode.getSNodeId();
    SNode newNode = myNewModel.getNodeById(nodeId);
    Set<String> roles = SetSequence.fromSetWithValues(new HashSet<String>(), ListSequence.fromList(SNodeOperations.getChildren(oldNode)).concat(ListSequence.fromList(SNodeOperations.getChildren(newNode))).<String>select(new ISelector<SNode, String>() {
      public String select(SNode ch) {
        return SNodeOperations.getContainingLinkRole(ch);
      }
    }));
    for (String role : SetSequence.fromSet(roles)) {
      final List<SNode> oldChildren = oldNode.getChildren(role);
      List<SNode> newChildren = newNode.getChildren(role);
      List<SNodeId> oldIds = ListSequence.fromList(oldChildren).<SNodeId>select(new ISelector<SNode, SNodeId>() {
        public SNodeId select(SNode n) {
          return n.getSNodeId();
        }
      }).toListSequence();
      List<SNodeId> newIds = ListSequence.fromList(newChildren).<SNodeId>select(new ISelector<SNode, SNodeId>() {
        public SNodeId select(SNode n) {
          return n.getSNodeId();
        }
      }).toListSequence();
      LongestCommonSubsequenceFinder<SNodeId> finder = new LongestCommonSubsequenceFinder<SNodeId>(oldIds, newIds);

      List<Tuples._2<Tuples._2<Integer, Integer>, Tuples._2<Integer, Integer>>> differentIndices = finder.getDifferentIndices();
      for (Tuples._2<Tuples._2<Integer, Integer>, Tuples._2<Integer, Integer>> indices : ListSequence.fromList(differentIndices)) {
        Tuples._2<Integer, Integer> oldIndices = indices._0();
        Tuples._2<Integer, Integer> newIndices = indices._1();
        if (oldIndices._0() == oldIndices._1()) {
          myChangeSet.add(new InsertNodeGroupChange(myChangeSet, nodeId, role, oldIndices._0(), newIndices._0(), newIndices._1()));
        } else if (newIndices._0() == newIndices._1()) {
          myChangeSet.add(new DeleteNodeGroupChange(myChangeSet, nodeId, role, oldIndices._0(), oldIndices._1()));
        } else {
          myChangeSet.add(new ReplaceNodeGroupChange(myChangeSet, nodeId, role, oldIndices._0(), oldIndices._1(), newIndices._0(), newIndices._1()));
        }
      }

      List<Tuples._2<Integer, Integer>> commonIndices = finder.getCommonIndices();
      ListSequence.fromList(commonIndices).<SNode>select(new ISelector<Tuples._2<Integer, Integer>, SNode>() {
        public SNode select(Tuples._2<Integer, Integer> in) {
          return ListSequence.fromList(oldChildren).getElement(in._0());
        }
      }).visitAll(new IVisitor<SNode>() {
        public void visit(SNode child) {
          buildNodeChanges(child);
        }
      });
    }
  }

  private void buildChanges() {
    _FunctionTypes._return_P1_E0<? extends Set<SNodeId>, ? super SModel> rootIds = new _FunctionTypes._return_P1_E0<ISetSequence<SNodeId>, SModel>() {
      public ISetSequence<SNodeId> invoke(SModel m) {
        return SetSequence.fromSetWithValues(new HashSet<SNodeId>(), ListSequence.fromList(SModelOperations.getRoots(m, null)).<SNodeId>select(new ISelector<SNode, SNodeId>() {
          public SNodeId select(SNode node) {
            return node.getSNodeId();
          }
        }));
      }
    };
    Set<SNodeId> oldRootIds = rootIds.invoke(myOldModel);
    Set<SNodeId> newRootIds = rootIds.invoke(myNewModel);

    myChangeSet.addAll(SetSequence.fromSet(newRootIds).subtract(SetSequence.fromSet(oldRootIds)).<AddRootChange>select(new ISelector<SNodeId, AddRootChange>() {
      public AddRootChange select(SNodeId r) {
        return new AddRootChange(myChangeSet, r);
      }
    }));
    myChangeSet.addAll(SetSequence.fromSet(oldRootIds).subtract(SetSequence.fromSet(newRootIds)).<DeleteRootChange>select(new ISelector<SNodeId, DeleteRootChange>() {
      public DeleteRootChange select(SNodeId r) {
        return new DeleteRootChange(myChangeSet, r);
      }
    }));

    for (SNodeId rootId : SetSequence.fromSet(oldRootIds).intersect(SetSequence.fromSet(newRootIds))) {
      buildNodeChanges(myOldModel.getNodeById(rootId));
    }
  }

  public static ChangeSet buildChangeSet(SModel oldModel, SModel newModel) {
    return new ChangeSetBuilder(oldModel, newModel).myChangeSet;
  }
}
