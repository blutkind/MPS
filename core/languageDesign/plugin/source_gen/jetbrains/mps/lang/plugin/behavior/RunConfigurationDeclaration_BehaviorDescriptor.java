package jetbrains.mps.lang.plugin.behavior;

/*Generated by MPS */

import jetbrains.mps.lang.core.behavior.BaseConcept_BehaviorDescriptor;
import jetbrains.mps.lang.core.behavior.INamedConcept_BehaviorDescriptor;
import jetbrains.mps.baseLanguage.classifiers.behavior.IClassifier_BehaviorDescriptor;
import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.baseLanguage.classifiers.behavior.IClassifier_Behavior;
import jetbrains.mps.checkedName.PropertyReference;
import jetbrains.mps.baseLanguage.behavior.AbstractExtractMethodRefactoringProcessor;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;

public class RunConfigurationDeclaration_BehaviorDescriptor extends BaseConcept_BehaviorDescriptor implements INamedConcept_BehaviorDescriptor, IClassifier_BehaviorDescriptor, ICheckedNamePolicy_BehaviorDescriptor {
  public RunConfigurationDeclaration_BehaviorDescriptor() {
  }

  public SNode virtual_createType_1213877527970(SNode thisNode) {
    return RunConfigurationDeclaration_Behavior.virtual_createType_1213877527970(thisNode);
  }

  public List<SNode> virtual_getMembers_1213877528124(SNode thisNode) {
    return IClassifier_Behavior.virtual_getMembers_1213877528124(thisNode);
  }

  public List<SNode> virtual_getDescendantsToCheck_1628770029971140562(SNode thisNode) {
    return ICheckedNamePolicy_Behavior.virtual_getDescendantsToCheck_1628770029971140562(thisNode);
  }

  public List<SNode> virtual_getMembers_1213877528020(SNode thisNode, SNode contextNode) {
    return RunConfigurationDeclaration_Behavior.virtual_getMembers_1213877528020(thisNode, contextNode);
  }

  public PropertyReference virtual_getPropertyToCheck_5003188907305392322(SNode thisNode) {
    return RunConfigurationDeclaration_Behavior.virtual_getPropertyToCheck_5003188907305392322(thisNode);
  }

  public List<SNode> virtual_getParts_1213877527988(SNode thisNode) {
    return IClassifier_Behavior.virtual_getParts_1213877527988(thisNode);
  }

  public SNode virtual_createSuperType_1217433657148(SNode thisNode) {
    return IClassifier_Behavior.virtual_createSuperType_1217433657148(thisNode);
  }

  public AbstractExtractMethodRefactoringProcessor virtual_getExtractMethodRefactoringProcessor_1221393367929(SNode thisNode, List<SNode> nodesToRefactor) {
    return IClassifier_Behavior.virtual_getExtractMethodRefactoringProcessor_1221393367929(thisNode, nodesToRefactor);
  }

  public List<PropertyReference> virtual_getPropertiesToCheck_1628770029971140570(SNode thisNode) {
    return ICheckedNamePolicy_Behavior.virtual_getPropertiesToCheck_1628770029971140570(thisNode);
  }

  public SNode virtual_getStateType_9017024590936598176(SNode thisNode) {
    return RunConfigurationDeclaration_Behavior.virtual_getStateType_9017024590936598176(thisNode);
  }

  public SNode virtual_getDescendantToCheck_3745452943050928880(SNode thisNode) {
    return ICheckedNamePolicy_Behavior.virtual_getDescendantToCheck_3745452943050928880(thisNode);
  }

  public String virtual_getFqName_1213877404258(SNode thisNode) {
    return INamedConcept_Behavior.virtual_getFqName_1213877404258(thisNode);
  }
}
