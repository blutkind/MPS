package jetbrains.mps.lang.editor.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class InlineEditorComponent_Behavior {

  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getConceptDeclaration_7055725856388417603(SNode thisNode) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getParent(thisNode), "jetbrains.mps.lang.editor.structure.CellModel_RefCell"), "relationDeclaration", false), "target", false);
  }

}
