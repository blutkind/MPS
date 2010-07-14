package jetbrains.mps.lang.editor.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CellMenuPart_ReplaceChild_Item_Create_Behavior {
  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getExpectedReturnType_1213877374441(SNode thisNode) {
    if (thisNode == null) {
      return null;
    }
    SNode hostMenuPart = SNodeOperations.getAncestor(thisNode, "jetbrains.mps.lang.editor.structure.CellMenuPart_Abstract", false, false);
    SNode editedLink = CellMenuPart_Abstract_Behavior.call_getEditedLink_1219409839992(hostMenuPart);
    SNode conceptOfChild = SLinkOperations.getTarget(editedLink, "target", false);
    return new CellMenuPart_ReplaceChild_Item_Create_Behavior.QuotationClass_jf8h0a_a0e0b().createNode(conceptOfChild);
  }

  public static class QuotationClass_jf8h0a_a0e0b {
    public QuotationClass_jf8h0a_a0e0b() {
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("concept", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
