package jetbrains.mps.execution.configurations.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.execution.common.behavior.IGeneratedToClass_Behavior;

public class RunConfiguration_Behavior {
  public static void init(SNode thisNode) {
  }

  @Nullable
  public static SNode call_getExecutor_3754890006475713427(final SNode thisNode) {
    return ListSequence.fromList(SModelOperations.getRoots(SNodeOperations.getModel(thisNode), "jetbrains.mps.execution.configurations.structure.RunConfigurationExecutor")).findFirst(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SLinkOperations.getTarget(it, "configuration", false) == thisNode;
      }
    });
  }

  public static boolean call_isForeign_4042467058397504911(SNode thisNode) {
    if ((SLinkOperations.getTarget(thisNode, "configurationKind", false) == null)) {
      return false;
    }
    return neq_g3syr7_a0b0c(SNodeOperations.getModel(SLinkOperations.getTarget(thisNode, "configurationKind", false)), SNodeOperations.getModel(thisNode));
  }

  public static String call_getGeneratedFactoryName_2256484787298832736(SNode thisNode) {
    return IGeneratedToClass_Behavior.call_getGeneratedClassName_946964771156905488(thisNode) + "_Factory";
  }

  private static boolean neq_g3syr7_a0b0c(Object a, Object b) {
    return !((a != null ?
      a.equals(b) :
      a == b
    ));
  }
}
