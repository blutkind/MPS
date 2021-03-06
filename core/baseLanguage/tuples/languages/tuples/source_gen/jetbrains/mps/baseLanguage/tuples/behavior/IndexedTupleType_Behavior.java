package jetbrains.mps.baseLanguage.tuples.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.core.behavior.BaseConcept_Behavior;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;

public class IndexedTupleType_Behavior {
  public static void init(SNode thisNode) {
  }

  public static String virtual_getPresentation_1213877396640(SNode thisNode) {
    StringBuilder sb = new StringBuilder();
    sb.append(SConceptPropertyOperations.getString(thisNode, "leftBracket"));
    String sep = "";
    for (SNode mt : SLinkOperations.getTargets(thisNode, "componentType", true)) {
      sb.append(sep).append(BaseConcept_Behavior.call_getPresentation_1213877396640(mt));
      sep = ", ";
    }
    sb.append(SConceptPropertyOperations.getString(thisNode, "rightBracket"));
    return sb.toString();
  }

  public static List<String> virtual_getVariableSuffixes_1213877337304(SNode thisNode) {
    List<String> suffixes = ListSequence.fromList(new ArrayList<String>());
    switch (ListSequence.fromList(SLinkOperations.getTargets(thisNode, "componentType", true)).count()) {
      case 0:
        ListSequence.fromList(suffixes).addElement("unit");
        break;
      case 1:
        ListSequence.fromList(suffixes).addElement("single");
        break;
      case 2:
        ListSequence.fromList(suffixes).addElement("pair");
        break;
      case 3:
        ListSequence.fromList(suffixes).addElement("triple");
        break;
      case 4:
        ListSequence.fromList(suffixes).addElement("quadruple");
        break;
      default:
        ListSequence.fromList(suffixes).addElement("_" + Integer.valueOf(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "componentType", true)).count()) + "tuple");
    }
    return suffixes;
  }
}
