package jetbrains.mps.lang.plugin.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;

public class SingletabbedEditorTab_Behavior {
  private static Class[] PARAMETERS_144706109457730962 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static SNode virtual_createType_1213877527970(SNode thisNode) {
    return new SingletabbedEditorTab_Behavior.QuotationClass_8147_0().createNode();
  }

  public static SNode call_createType_144706109457730962(SNode thisNode) {
    return (SNode) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.plugin.structure.SingletabbedEditorTab"), "virtual_createType_1213877527970", PARAMETERS_144706109457730962);
  }

  public static SNode callSuper_createType_144706109457730962(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.plugin.structure.SingletabbedEditorTab"), callerConceptFqName, "virtual_createType_1213877527970", PARAMETERS_144706109457730962);
  }

  public static class QuotationClass_8147_0 {
    public QuotationClass_8147_0() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_8 = null;
      {
        quotedNode_8 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.SingletabbedEditorTabType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_8 = quotedNode_8;
        result = quotedNode1_8;
      }
      return result;
    }
  }
}
