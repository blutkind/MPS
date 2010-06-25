package jetbrains.mps.lang.core.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.quickfix.QuickFix_Runtime;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.IVisitor;

public class RemoveUnnecessaryChildrenInSingleRole_QuickFix extends QuickFix_Runtime {
  public RemoveUnnecessaryChildrenInSingleRole_QuickFix() {
  }

  public String getDescription() {
    return "Remove unnecessary children in single role \"" + SPropertyOperations.getString(((SNode) RemoveUnnecessaryChildrenInSingleRole_QuickFix.this.getField("link")[0]), "role") + "\"";
  }

  public void execute(SNode node) {
    ListSequence.fromList(SNodeOperations.getChildren(node, ((SNode) RemoveUnnecessaryChildrenInSingleRole_QuickFix.this.getField("link")[0]))).skip(1).toListSequence().visitAll(new IVisitor<SNode>() {
      public void visit(SNode child) {
        SNodeOperations.deleteNode(child);
      }
    });
  }
}
