package jetbrains.mps.uiLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.SubtypingRule_Runtime;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.uiLanguage.constraints.ComponentDeclaration_Behavior;

import java.util.ArrayList;
import java.util.List;

public class subtyping_ComponentType_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  public subtyping_ComponentType_SubtypingRule() {
  }

  public List<SNode> getSubOrSuperTypes(SNode componentType) {
    List<SNode> result = new ArrayList<SNode>();
    SNode extendedComponent = ComponentDeclaration_Behavior.call_getExtendedComponent_1202392526494(SLinkOperations.getTarget(componentType, "component", false));
    if (extendedComponent != null) {
      ListSequence.fromList(result).addElement(new QuotationClass_2().createNode(extendedComponent));
    }
    if (SPropertyOperations.getBoolean(SLinkOperations.getTarget(componentType, "component", false), "stub")) {
      ListSequence.fromList(result).addElement(new QuotationClass_1().createNode(SLinkOperations.getTarget(SLinkOperations.getTarget(componentType, "component", false), "mapTo", false)));
    }
    return result;
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.uiLanguage.structure.ComponentType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean isWeak() {
    return false;
  }

}
