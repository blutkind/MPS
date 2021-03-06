package jetbrains.mps.baseLanguage.classifiers.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.baseLanguage.behavior.IExtractMethodRefactoringProcessor;
import jetbrains.mps.baseLanguage.behavior.AbstractExtractMethodRefactoringProcessor;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class IClassifier_Behavior {
  private static Class[] PARAMETERS_1213877527970 = {SNode.class};
  private static Class[] PARAMETERS_1217433657148 = {SNode.class};
  private static Class[] PARAMETERS_1213877527988 = {SNode.class};
  private static Class[] PARAMETERS_1213877528020 = {SNode.class, SNode.class};
  private static Class[] PARAMETERS_1213877528124 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static SNode virtual_createType_1213877527970(SNode thisNode) {
    SNode result = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierType", null);
    SLinkOperations.setTarget(result, "classifier", thisNode, false);
    return result;
  }

  public static SNode virtual_createSuperType_1217433657148(SNode thisNode) {
    return null;
  }

  public static List<SNode> virtual_getParts_1213877527988(SNode thisNode) {
    List<SNode> result = new ArrayList<SNode>();
    for (SNode part : SModelOperations.getRoots(SNodeOperations.getModel(thisNode), "jetbrains.mps.baseLanguage.classifiers.structure.IClassifierPart")) {
      if (IClassifierPart_Behavior.call_getMainClassifier_1213877255428(part) == thisNode) {
        ListSequence.fromList(result).addElement(part);
      }
    }
    return result;
  }

  public static List<SNode> virtual_getMembers_1213877528020(SNode thisNode, SNode contextNode) {
    List<SNode> result = new ArrayList<SNode>();
    for (SNode member : IClassifier_Behavior.call_getMembers_1213877528124(thisNode)) {
      if (IMember_Behavior.call_getVisiblity_1213877352965(member) == null && SNodeOperations.getModel(member) == SNodeOperations.getModel(contextNode)) {
        ListSequence.fromList(result).addElement(member);
      }
      if (SNodeOperations.isInstanceOf(IMember_Behavior.call_getVisiblity_1213877352965(member), "jetbrains.mps.baseLanguage.structure.PublicVisibility")) {
        ListSequence.fromList(result).addElement(member);
      }
      if (SNodeOperations.isInstanceOf(IMember_Behavior.call_getVisiblity_1213877352965(member), "jetbrains.mps.baseLanguage.structure.PrivateVisibility") && IClassifier_Behavior.getContextClassifier_1213877527940(contextNode) == IMember_Behavior.call_getContainer_1213877353020(member)) {
        ListSequence.fromList(result).addElement(member);
      }
      if (SNodeOperations.isInstanceOf(IMember_Behavior.call_getVisiblity_1213877352965(member), "jetbrains.mps.baseLanguage.structure.ProtectedVisibility")) {
        SNode contextClassifier = IClassifier_Behavior.getContextClassifier_1213877527940(contextNode);
        if (contextClassifier != null && TypeChecker.getInstance().getSubtypingManager().isSubtype(IClassifier_Behavior.call_createType_1213877527970(thisNode), IClassifier_Behavior.call_createType_1213877527970(contextClassifier))) {
          ListSequence.fromList(result).addElement(member);
        }
      }
    }
    return result;
  }

  public static List<SNode> virtual_getMembers_1213877528124(SNode thisNode) {
    List<SNode> result = new ArrayList<SNode>();
    for (SNode child : SNodeOperations.getChildren(thisNode)) {
      if (SNodeOperations.isInstanceOf(child, "jetbrains.mps.baseLanguage.classifiers.structure.IMember")) {
        ListSequence.fromList(result).addElement(SNodeOperations.cast(child, "jetbrains.mps.baseLanguage.classifiers.structure.IMember"));
      }
    }
    for (SNode part : IClassifier_Behavior.call_getParts_1213877527988(thisNode)) {
      ListSequence.fromList(result).addSequence(ListSequence.fromList(IClassifierPart_Behavior.call_getMembers_1213877255431(part)));
    }
    return result;
  }

  public static IExtractMethodRefactoringProcessor virtual_getExtractMethodRefactoringProcessor_1221393367929(SNode thisNode, List<SNode> nodesToRefactor) {
    return new AbstractExtractMethodRefactoringProcessor(thisNode, nodesToRefactor) {
      public SNode createNewMethod() {
        return SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierMethodDeclaration", null);
      }

      public SNode createMethodCall(SNode methodDeclaration, List<SNode> parameteres) {
        SNode call = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierMethodCallOperation", null);
        SLinkOperations.setTarget(call, "member", SNodeOperations.cast(methodDeclaration, "jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierMethodDeclaration"), false);
        ListSequence.fromList(SLinkOperations.getTargets(call, "actualArgument", true)).addSequence(ListSequence.fromList(parameteres));
        SNode result = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.DotExpression", null);
        SLinkOperations.setTarget(result, "operand", SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpression", null), true);
        SLinkOperations.setTarget(result, "operation", call, true);
        return result;
      }
    };
  }

  public static SNode call_createType_1213877527970(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getBehaviorDescriptorForInstanceNode(thisNode);
    return (SNode) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.classifiers.structure.IClassifier"), "virtual_createType_1213877527970", PARAMETERS_1213877527970);
  }

  public static SNode call_createSuperType_1217433657148(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getBehaviorDescriptorForInstanceNode(thisNode);
    return (SNode) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.classifiers.structure.IClassifier"), "virtual_createSuperType_1217433657148", PARAMETERS_1217433657148);
  }

  public static List<SNode> call_getParts_1213877527988(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getBehaviorDescriptorForInstanceNode(thisNode);
    return (List<SNode>) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.classifiers.structure.IClassifier"), "virtual_getParts_1213877527988", PARAMETERS_1213877527988);
  }

  public static List<SNode> call_getMembers_1213877528020(SNode thisNode, SNode contextNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getBehaviorDescriptorForInstanceNode(thisNode);
    return (List<SNode>) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.classifiers.structure.IClassifier"), "virtual_getMembers_1213877528020", PARAMETERS_1213877528020, contextNode);
  }

  public static List<SNode> call_getMembers_1213877528124(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getBehaviorDescriptorForInstanceNode(thisNode);
    return (List<SNode>) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.classifiers.structure.IClassifier"), "virtual_getMembers_1213877528124", PARAMETERS_1213877528124);
  }

  public static SNode callSuper_createType_1213877527970(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.classifiers.structure.IClassifier"), callerConceptFqName, "virtual_createType_1213877527970", PARAMETERS_1213877527970);
  }

  public static SNode callSuper_createSuperType_1217433657148(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.classifiers.structure.IClassifier"), callerConceptFqName, "virtual_createSuperType_1217433657148", PARAMETERS_1217433657148);
  }

  public static List<SNode> callSuper_getParts_1213877527988(SNode thisNode, String callerConceptFqName) {
    return (List<SNode>) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.classifiers.structure.IClassifier"), callerConceptFqName, "virtual_getParts_1213877527988", PARAMETERS_1213877527988);
  }

  public static List<SNode> callSuper_getMembers_1213877528020(SNode thisNode, String callerConceptFqName, SNode contextNode) {
    return (List<SNode>) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.classifiers.structure.IClassifier"), callerConceptFqName, "virtual_getMembers_1213877528020", PARAMETERS_1213877528020, contextNode);
  }

  public static List<SNode> callSuper_getMembers_1213877528124(SNode thisNode, String callerConceptFqName) {
    return (List<SNode>) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.classifiers.structure.IClassifier"), callerConceptFqName, "virtual_getMembers_1213877528124", PARAMETERS_1213877528124);
  }

  public static SNode getContextClassifier_1213877527940(SNode contextNode) {
    SNode classifier = SNodeOperations.getAncestor(contextNode, "jetbrains.mps.baseLanguage.classifiers.structure.IClassifier", true, false);
    if (classifier != null) {
      return classifier;
    }
    return IClassifierPart_Behavior.call_getMainClassifier_1213877255428(SNodeOperations.getAncestor(contextNode, "jetbrains.mps.baseLanguage.classifiers.structure.IClassifierPart", true, false));
  }
}
