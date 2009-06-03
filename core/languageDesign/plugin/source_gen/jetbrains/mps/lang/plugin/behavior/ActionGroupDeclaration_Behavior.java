package jetbrains.mps.lang.plugin.behavior;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.util.NameUtil;

public class ActionGroupDeclaration_Behavior {

  public static void init(SNode thisNode) {
  }

  public static String call_getGroupPrefix_1213877494242(SNode thisNode) {
    String prefix = "";
    SNode parentGroup = SNodeOperations.getAncestor(thisNode, "jetbrains.mps.lang.plugin.structure.ActionGroupDeclaration", false, false);
    if (parentGroup != null) {
      prefix = ActionGroupDeclaration_Behavior.call_getGroupPrefix_1213877494242(parentGroup) + SPropertyOperations.getString(parentGroup, "name");
    }
    return prefix;
  }

  public static String call_getGeneratedName_1213877494274(SNode thisNode) {
    return ActionGroupDeclaration_Behavior.call_getGroupPrefix_1213877494242(thisNode) + NameUtil.toValidIdentifier(SPropertyOperations.getString(thisNode, "name")) + "_ActionGroup";
  }

  public static String call_getGeneratedClassFQName_1213877494288(SNode thisNode) {
    return SNodeOperations.getModel(thisNode).getLongName() + "." + ActionGroupDeclaration_Behavior.call_getGeneratedName_1213877494274(thisNode);
  }

  public static String call_getID_1213877494306(SNode thisNode) {
    return SNodeOperations.getModel(thisNode).getLongName() + "." + SPropertyOperations.getString(thisNode, "name");
  }

  public static SNode virtual_createType_1213877527970(SNode thisNode) {
    SNode type = SConceptOperations.createNewNode("jetbrains.mps.lang.plugin.structure.GroupType", null);
    SLinkOperations.setTarget(type, "actionGroup", thisNode, false);
    return type;
  }

}
