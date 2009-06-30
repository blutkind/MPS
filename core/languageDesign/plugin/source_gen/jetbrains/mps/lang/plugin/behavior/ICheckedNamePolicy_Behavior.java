package jetbrains.mps.lang.plugin.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.checkedName.PropertyReference;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class ICheckedNamePolicy_Behavior {
  private static Class[] PARAMETERS_1628770029971140562 = {SNode.class};
  private static Class[] PARAMETERS_1628770029971140570 = {SNode.class};
  private static Class[] PARAMETERS_5003188907305392322 = {SNode.class};
  private static Class[] PARAMETERS_1628770029971140579 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static List<SNode> virtual_getDescendantsToCheck_1628770029971140562(SNode thisNode) {
    return new ArrayList<SNode>();
  }

  public static List<PropertyReference> virtual_getPropertiesToCheck_1628770029971140570(SNode thisNode) {
    List<PropertyReference> result = ListSequence.fromList(new ArrayList<PropertyReference>());
    PropertyReference property = ICheckedNamePolicy_Behavior.call_getPropertyToCheck_5003188907305392322(thisNode);
    if (property != null) {
      ListSequence.fromList(result).addElement(property);
    }
    return result;
  }

  public static PropertyReference virtual_getPropertyToCheck_5003188907305392322(SNode thisNode) {
    return null;
  }

  public static String virtual_getFixIntentionCaption_1628770029971140579(SNode thisNode) {
    return "Fix Naming Issues";
  }

  public static List<SNode> call_getDescendantsToCheck_1628770029971140562(SNode thisNode) {
    return (List<SNode>)BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.plugin.structure.ICheckedNamePolicy"), "virtual_getDescendantsToCheck_1628770029971140562", PARAMETERS_1628770029971140562);
  }

  public static List<PropertyReference> call_getPropertiesToCheck_1628770029971140570(SNode thisNode) {
    return (List<PropertyReference>)BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.plugin.structure.ICheckedNamePolicy"), "virtual_getPropertiesToCheck_1628770029971140570", PARAMETERS_1628770029971140570);
  }

  public static PropertyReference call_getPropertyToCheck_5003188907305392322(SNode thisNode) {
    return (PropertyReference)BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.plugin.structure.ICheckedNamePolicy"), "virtual_getPropertyToCheck_5003188907305392322", PARAMETERS_5003188907305392322);
  }

  public static String call_getFixIntentionCaption_1628770029971140579(SNode thisNode) {
    return (String)BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.plugin.structure.ICheckedNamePolicy"), "virtual_getFixIntentionCaption_1628770029971140579", PARAMETERS_1628770029971140579);
  }

  public static List<SNode> callSuper_getDescendantsToCheck_1628770029971140562(SNode thisNode, String callerConceptFqName) {
    return (List<SNode>)BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.plugin.structure.ICheckedNamePolicy"), callerConceptFqName, "virtual_getDescendantsToCheck_1628770029971140562", PARAMETERS_1628770029971140562);
  }

  public static List<PropertyReference> callSuper_getPropertiesToCheck_1628770029971140570(SNode thisNode, String callerConceptFqName) {
    return (List<PropertyReference>)BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.plugin.structure.ICheckedNamePolicy"), callerConceptFqName, "virtual_getPropertiesToCheck_1628770029971140570", PARAMETERS_1628770029971140570);
  }

  public static PropertyReference callSuper_getPropertyToCheck_5003188907305392322(SNode thisNode, String callerConceptFqName) {
    return (PropertyReference)BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.plugin.structure.ICheckedNamePolicy"), callerConceptFqName, "virtual_getPropertyToCheck_5003188907305392322", PARAMETERS_5003188907305392322);
  }

  public static String callSuper_getFixIntentionCaption_1628770029971140579(SNode thisNode, String callerConceptFqName) {
    return (String)BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.plugin.structure.ICheckedNamePolicy"), callerConceptFqName, "virtual_getFixIntentionCaption_1628770029971140579", PARAMETERS_1628770029971140579);
  }

}
