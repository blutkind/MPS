package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS  */

import jetbrains.mps.bootstrap.helgins.runtime.SubtypingRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.ISubtypingRule_Runtime;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import java.util.ArrayList;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.helgins.structure.ApplicableNodeCondition;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.smodel.SModelUID;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.smodel.SModelUtil_new;

public class subtyping_classifier_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  public  subtyping_classifier_SubtypingRule() {
  }

  public List<SNode> getSubOrSuperTypes(SNode type) {
    SNode classifier = SLinkOperations.getTarget(type, "classifier", false);
    List<SNode> supertypes = new ArrayList<SNode>();
    supertypes.add(new QuotationClass_4().createNode());
    if(SNodeOperations.isInstanceOf(classifier, "jetbrains.mps.baseLanguage.structure.ClassConcept")) {
      SNode classConcept = classifier;
      supertypes.add(SLinkOperations.getTarget(classConcept, "superclass", true));
      supertypes.addAll(SLinkOperations.getTargets(classConcept, "implementedInterface", true));
      supertypes.add(new QuotationClass_5().createNode(SLinkOperations.getTarget(classConcept, "extendedClass", false)));
    }
    if(SNodeOperations.isInstanceOf(classifier, "jetbrains.mps.baseLanguage.structure.Interface")) {
      SNode interfaceConcept = classifier;
      supertypes.addAll(SLinkOperations.getTargets(interfaceConcept, "extendedInterface", true));
    }
    List<SNode> result = new ArrayList<SNode>();
    for(SNode supertype : supertypes) {
      SNode supertypeCopy = SNodeOperations.copyNode(supertype);
      for(SNode typeParam : new ArrayList<SNode>(SLinkOperations.getTargets(supertypeCopy, "parameter", true))) {
        if(SNodeOperations.isInstanceOf(typeParam, "jetbrains.mps.baseLanguage.structure.TypeVariableReference")) {
          SNode tvr = typeParam;
          int i = ((List)SLinkOperations.getTargets(classifier, "typeVariableDeclaration", true)).indexOf(SLinkOperations.getTarget(tvr, "typeVariableDeclaration", false));
          if(i < 0 || i >= SLinkOperations.getCount(type, "parameter")) {
            ((SNode)supertypeCopy).removeChild(typeParam);
            continue;
          }
          SNode newNode = SNodeOperations.copyNode(((SNode)((List)SLinkOperations.getTargets(type, "parameter", true)).get(i)));
          supertypeCopy.replaceChild(typeParam, newNode);
        }
      }
      result.add(supertypeCopy);
    }
    return result;
  }
  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierType";
  }
  public ApplicableNodeCondition getNodeCondition() {
    SModel model = SModelRepository.getInstance().getModelDescriptor(SModelUID.fromString("jetbrains.mps.baseLanguage.helgins")).getSModel();
    return (ApplicableNodeCondition)BaseAdapter.fromNode(model.getNodeById("1175523881222"));
  }
  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }
  public boolean isSupertyping() {
    return false;
  }
}
