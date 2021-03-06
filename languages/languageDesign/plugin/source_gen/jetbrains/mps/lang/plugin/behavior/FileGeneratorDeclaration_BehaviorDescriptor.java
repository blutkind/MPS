package jetbrains.mps.lang.plugin.behavior;

/*Generated by MPS */

import jetbrains.mps.lang.core.behavior.BaseConcept_BehaviorDescriptor;
import jetbrains.mps.baseLanguage.classifiers.behavior.IClassifier_BehaviorDescriptor;
import jetbrains.mps.baseLanguage.behavior.IExtractMethodRefactoringProcessor;
import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.baseLanguage.classifiers.behavior.IClassifier_Behavior;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;

public class FileGeneratorDeclaration_BehaviorDescriptor extends BaseConcept_BehaviorDescriptor implements IClassifier_BehaviorDescriptor {
  public FileGeneratorDeclaration_BehaviorDescriptor() {
  }

  public IExtractMethodRefactoringProcessor virtual_getExtractMethodRefactoringProcessor_1221393367929(SNode thisNode, List<SNode> nodesToRefactor) {
    return IClassifier_Behavior.virtual_getExtractMethodRefactoringProcessor_1221393367929(thisNode, nodesToRefactor);
  }

  public List<SNode> virtual_getMembers_1213877528124(SNode thisNode) {
    return IClassifier_Behavior.virtual_getMembers_1213877528124(thisNode);
  }

  public SNode virtual_createType_1213877527970(SNode thisNode) {
    return FileGeneratorDeclaration_Behavior.virtual_createType_1213877527970(thisNode);
  }

  public List<SNode> virtual_getMembers_1213877528020(SNode thisNode, SNode contextNode) {
    return IClassifier_Behavior.virtual_getMembers_1213877528020(thisNode, contextNode);
  }

  public List<SNode> virtual_getParts_1213877527988(SNode thisNode) {
    return IClassifier_Behavior.virtual_getParts_1213877527988(thisNode);
  }

  public String virtual_getFqName_1213877404258(SNode thisNode) {
    return INamedConcept_Behavior.virtual_getFqName_1213877404258(thisNode);
  }

  public SNode virtual_createSuperType_1217433657148(SNode thisNode) {
    return IClassifier_Behavior.virtual_createSuperType_1217433657148(thisNode);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.lang.plugin.structure.FileGeneratorDeclaration";
  }
}
