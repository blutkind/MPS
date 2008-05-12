package smodelLanguage.samples;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.AttributesRolesUtil;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;

public class Attributes {

  public void accessToNodeAttribute_1(SNode node) {
    List<SNode> macros = SLinkOperations.getTargets(node, AttributesRolesUtil.childRoleFromAttributeRole("nodeMacro"), true);
    SNode firstMacro = ListSequence.fromList(SLinkOperations.getTargets(node, AttributesRolesUtil.childRoleFromAttributeRole("nodeMacro"), true)).first();
  }

  public void accessToPropertyAttribute_1(SNode node) {
    SNode propertyMacro = SLinkOperations.getTarget(node, AttributesRolesUtil.childRoleFromPropertyAttributeRole("propertyMacro", "name"), true);
    SNode concept = SNodeOperations.getConceptDeclaration(SLinkOperations.getTarget(node, AttributesRolesUtil.childRoleFromPropertyAttributeRole("propertyMacro", "name"), true));
    SNode propertyMacro1 = SLinkOperations.getTarget(node, AttributesRolesUtil.childRoleFromPropertyAttributeRole("propertyMacro", "name"), true);
  }

  public void accessToPropertyAttribute_2(SNode node) {
    SNode propMacro = null;
    SLinkOperations.setTarget(node, AttributesRolesUtil.childRoleFromPropertyAttributeRole("propertyMacro", "name"), propMacro, true);
    SLinkOperations.setTarget(node, AttributesRolesUtil.childRoleFromPropertyAttributeRole("propertyMacro", "name"), propMacro, true);
    SLinkOperations.setTarget(node, AttributesRolesUtil.childRoleFromPropertyAttributeRole("propertyMacro", "name"), propMacro, true);
  }

  public void accessToReferenceAttribute_1(SNode node) {
    SNode referenceMacro = SLinkOperations.getTarget(node, AttributesRolesUtil.childRoleFromLinkAttributeRole("referenceMacro", "conceptDeclaration"), true);
    SNode referenceMacro1 = SLinkOperations.getTarget(node, AttributesRolesUtil.childRoleFromLinkAttributeRole("referenceMacro", "conceptDeclaration"), true);
  }

  public void accessToReferenceAttribute_2(SNode node) {
    SNode refMacro = null;
    SLinkOperations.setTarget(node, AttributesRolesUtil.childRoleFromLinkAttributeRole("referenceMacro", "conceptDeclaration"), refMacro, true);
    SLinkOperations.setTarget(node, AttributesRolesUtil.childRoleFromLinkAttributeRole("referenceMacro", "conceptDeclaration"), refMacro, true);
    SLinkOperations.setTarget(node, AttributesRolesUtil.childRoleFromLinkAttributeRole("referenceMacro", "conceptDeclaration"), refMacro, true);
  }

  public void other(SNode node) {
    SNodeOperations.isAttribute(node);
    List<SNode> nodes = SNodeOperations.getAllAttributes(node);
    SNode firstNode = ListSequence.fromList(SNodeOperations.getAllAttributes(node)).first();
  }

}
