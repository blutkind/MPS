package jetbrains.mps.baseLanguage.collections.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.core.behavior.BaseConcept_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.baseLanguage.behavior.Type_Behavior;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class ListType_Behavior {

  public static void init(SNode thisNode) {
  }

  public static String virtual_getPresentation_1213877396640(SNode thisNode) {
    return "list<" + BaseConcept_Behavior.call_getPresentation_1213877396640(SLinkOperations.getTarget(thisNode, "elementType", true)) + ">";
  }

  public static List<String> virtual_getVariableSuffixes_1213877337304(SNode thisNode) {
    List<String> variableSuffixes = ListSequence.fromListAndArray(new ArrayList<String>(), "list");
    if ((SLinkOperations.getTarget(thisNode, "elementType", true) != null)) {
      for(String suffix : ListSequence.fromList(Type_Behavior.call_getVariableSuffixes_1213877337304(SLinkOperations.getTarget(thisNode, "elementType", true)))) {
        ListSequence.fromList(variableSuffixes).addElement(NameUtil.pluralize(suffix));
      }
    }
    return variableSuffixes;
  }

  public static SNode virtual_getAbstractCreator_1213877337340(SNode thisNode) {
    SNode creator = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.collections.structure.ListCreatorWithInit", null);
    SLinkOperations.setTarget(creator, "elementType", SNodeOperations.copyNode(SLinkOperations.getTarget(thisNode, "elementType", true)), true);
    return creator;
  }

  public static List<SNode> virtual_getAbstractCreators_1226945293888(SNode thisNode) {
    List<SNode> res = new ArrayList<SNode>();
    SNode lc = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.collections.structure.ListCreatorWithInit", null);
    SLinkOperations.setTarget(lc, "elementType", SNodeOperations.copyNode(SLinkOperations.getTarget(thisNode, "elementType", true)), true);
    ListSequence.fromList(res).addElement(lc);
    SNode llc = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.collections.structure.LinkedListCreator", null);
    SLinkOperations.setTarget(llc, "elementType", SNodeOperations.copyNode(SLinkOperations.getTarget(thisNode, "elementType", true)), true);
    ListSequence.fromList(res).addElement(llc);
    return res;
  }

}
