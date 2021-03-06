package jetbrains.mps.gtext.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BehaviorDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.interpreted.BehaviorAspectInterpreted;

public class BehaviorAspectDescriptor implements jetbrains.mps.smodel.runtime.BehaviorAspectDescriptor {
  private static String[] stringSwitchCases_846f5o_a0a0a = new String[]{"jetbrains.mps.gtext.structure.BuilderContextRef", "jetbrains.mps.gtext.structure.GConditionalLine", "jetbrains.mps.gtext.structure.GContentBlock", "jetbrains.mps.gtext.structure.GContentPlaceholder", "jetbrains.mps.gtext.structure.GDocument", "jetbrains.mps.gtext.structure.GExpressionItem", "jetbrains.mps.gtext.structure.GIndent", "jetbrains.mps.gtext.structure.GIndentBlock", "jetbrains.mps.gtext.structure.GItemList", "jetbrains.mps.gtext.structure.GItemStatement", "jetbrains.mps.gtext.structure.GLine", "jetbrains.mps.gtext.structure.GNewLine", "jetbrains.mps.gtext.structure.GSeparatorItemList", "jetbrains.mps.gtext.structure.GStatementItem", "jetbrains.mps.gtext.structure.GText"};

  public BehaviorAspectDescriptor() {
  }

  public BehaviorDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_846f5o_a0a0a, fqName)) {
      case 14:
        return new GText_BehaviorDescriptor();
      case 8:
        return new GItemList_BehaviorDescriptor();
      case 11:
        return new GNewLine_BehaviorDescriptor();
      case 6:
        return new GIndent_BehaviorDescriptor();
      case 7:
        return new GIndentBlock_BehaviorDescriptor();
      case 9:
        return new GItemStatement_BehaviorDescriptor();
      case 5:
        return new GExpressionItem_BehaviorDescriptor();
      case 13:
        return new GStatementItem_BehaviorDescriptor();
      case 10:
        return new GLine_BehaviorDescriptor();
      case 1:
        return new GConditionalLine_BehaviorDescriptor();
      case 0:
        return new BuilderContextRef_BehaviorDescriptor();
      case 4:
        return new GDocument_BehaviorDescriptor();
      case 12:
        return new GSeparatorItemList_BehaviorDescriptor();
      case 3:
        return new GContentPlaceholder_BehaviorDescriptor();
      case 2:
        return new GContentBlock_BehaviorDescriptor();
      default:
        return BehaviorAspectInterpreted.getInstance().getDescriptor(fqName);
    }
  }
}
