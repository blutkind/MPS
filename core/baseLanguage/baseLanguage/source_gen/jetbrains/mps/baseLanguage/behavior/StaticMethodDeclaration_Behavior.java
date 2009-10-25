package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import java.util.List;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class StaticMethodDeclaration_Behavior {
  private static Class[] PARAMETERS_4025276038182459944 = {SNode.class};
  private static Class[] PARAMETERS_8986964027630472427 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static boolean virtual_canBeAnnotated_1233076312117(SNode thisNode) {
    return true;
  }

  public static boolean call_isMainMethod_1213877536670(SNode thisNode) {
    return "main".equals(SPropertyOperations.getString(thisNode, "name")) && ListSequence.fromList(SLinkOperations.getTargets(thisNode, "parameter", true)).count() == 1 && TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "parameter", true)).first()), new _Quotations.QuotationClass_18().createNode(), false);
  }

  public static List<SNode> virtual_getChildrenToDisplayIntention_4025276038182319200(SNode thisNode) {
    List<SNode> result = HasAnnotation_Behavior.callSuper_getChildrenToDisplayIntention_4025276038182319200(thisNode, "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration");
    ListSequence.fromList(result).addElement(SLinkOperations.getTarget(thisNode, "visibility", true));
    return result;
  }

  public static boolean virtual_isStatic_8986964027630462944(SNode thisNode) {
    return true;
  }

  public static List<SNode> call_getChildrenToDisplayIntention_4025276038182459944(SNode thisNode) {
    return (List<SNode>)BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration"), "virtual_getChildrenToDisplayIntention_4025276038182319200", PARAMETERS_4025276038182459944);
  }

  public static boolean call_isStatic_8986964027630472427(SNode thisNode) {
    return (Boolean)BehaviorManager.getInstance().invoke(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration"), "virtual_isStatic_8986964027630462944", PARAMETERS_8986964027630472427);
  }

  public static List<SNode> callSuper_getChildrenToDisplayIntention_4025276038182459944(SNode thisNode, String callerConceptFqName) {
    return (List<SNode>)BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration"), callerConceptFqName, "virtual_getChildrenToDisplayIntention_4025276038182319200", PARAMETERS_4025276038182459944);
  }

  public static boolean callSuper_isStatic_8986964027630472427(SNode thisNode, String callerConceptFqName) {
    return (Boolean)BehaviorManager.getInstance().invokeSuper(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration"), callerConceptFqName, "virtual_isStatic_8986964027630462944", PARAMETERS_8986964027630472427);
  }
}
