package jetbrains.mps.runConfigurations.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import org.jetbrains.annotations.NonNls;
import jetbrains.mps.run.commands.behavior.IGeneratedToClass_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class RunConfigurationExecutor_Behavior {
  private static Class[] PARAMETERS_2309921853483580886 = {SNode.class};
  private static Class[] PARAMETERS_7594697556933223294 = {SNode.class};

  public static void init(SNode thisNode) {
    SPropertyOperations.set(thisNode, "canRun", "" + true);
  }

  public static String call_getCanExecuteMethodName_7806358006983616236(SNode thisNode) {
    return "canExecute";
  }

  @NonNls
  public static String virtual_getSuffix_856705193941282328(SNode thisNode) {
    return IGeneratedToClass_Behavior.call_getSuffix_856705193941282328(SLinkOperations.getTarget(thisNode, "runConfiguration", false)) + "_RunProfileState";
  }

  public static String virtual_getGeneratedClassName_856705193941282333(SNode thisNode) {
    return IGeneratedToClass_Behavior.call_getGeneratedClassName_856705193941282361(thisNode, SPropertyOperations.getString(SLinkOperations.getTarget(thisNode, "runConfiguration", false), "name"));
  }

  public static String call_getSuffix_2309921853483580886(SNode thisNode) {
    return (String) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.runConfigurations.structure.RunConfigurationExecutor"), "virtual_getSuffix_856705193941282328", PARAMETERS_2309921853483580886);
  }

  public static String call_getGeneratedClassName_7594697556933223294(SNode thisNode) {
    return (String) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.runConfigurations.structure.RunConfigurationExecutor"), "virtual_getGeneratedClassName_856705193941282333", PARAMETERS_7594697556933223294);
  }

  public static String callSuper_getSuffix_2309921853483580886(SNode thisNode, String callerConceptFqName) {
    return (String) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.runConfigurations.structure.RunConfigurationExecutor"), callerConceptFqName, "virtual_getSuffix_856705193941282328", PARAMETERS_2309921853483580886);
  }

  public static String callSuper_getGeneratedClassName_7594697556933223294(SNode thisNode, String callerConceptFqName) {
    return (String) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.runConfigurations.structure.RunConfigurationExecutor"), callerConceptFqName, "virtual_getGeneratedClassName_856705193941282333", PARAMETERS_7594697556933223294);
  }
}
