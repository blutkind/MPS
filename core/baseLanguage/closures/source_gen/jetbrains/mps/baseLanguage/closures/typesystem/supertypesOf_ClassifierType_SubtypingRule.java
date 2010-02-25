package jetbrains.mps.baseLanguage.closures.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.closures.constraints.ClassifierTypeUtil;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.smodel.CopyUtil;

public class supertypesOf_ClassifierType_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  public supertypesOf_ClassifierType_SubtypingRule() {
  }

  public List<SNode> getSubOrSuperTypes(SNode ct, TypeCheckingContext typeCheckingContext) {
    List<SNode> supertypes = ListSequence.fromList(new ArrayList<SNode>());
    SNode classifier = SLinkOperations.getTarget(ct, "classifier", false);
    if (SNodeOperations.isInstanceOf(classifier, "jetbrains.mps.baseLanguage.structure.Interface")) {
      List<SNode> methods = SLinkOperations.getTargets(classifier, "method", true);
      if (methods != null && ListSequence.fromList(methods).count() == 1) {
        SNode md = ListSequence.fromList(methods).getElement(0);
        List<SNode> paramTypes = ListSequence.fromList(new ArrayList<SNode>());
        for (SNode p : SLinkOperations.getTargets(md, "parameter", true)) {
          ListSequence.fromList(paramTypes).addElement(ClassifierTypeUtil.resolveType(SLinkOperations.getTarget(p, "type", true), ct));
        }
        SNode resType = ClassifierTypeUtil.resolveType(SLinkOperations.getTarget(md, "returnType", true), ct);
        supertypes = ListSequence.fromListAndArray(new ArrayList<SNode>(), new supertypesOf_ClassifierType_SubtypingRule.QuotationClass_2487_l523emne7f2d().createNode(paramTypes, resType, typeCheckingContext));
      }
    }
    return supertypes;
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean isWeak() {
    return true;
  }

  public static class QuotationClass_2487_l523emne7f2d {
    public QuotationClass_2487_l523emne7f2d() {
    }

    public SNode createNode(Object parameter_2487_l523emne7at3, Object parameter_2487_l523emne7at6, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_2487_l523emne7at0 = null;
      SNode quotedNode_2487_l523emne7at1 = null;
      SNode quotedNode_2487_l523emne7at4 = null;
      {
        quotedNode_2487_l523emne7at0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.closures.structure.FunctionType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2487_l523emne7at0 = quotedNode_2487_l523emne7at0;
        {
          List<SNode> nodes = (List<SNode>) parameter_2487_l523emne7at3;
          for (SNode child : nodes) {
            quotedNode_2487_l523emne7at0.addChild("parameterType", HUtil.copyIfNecessary(child, typeCheckingContext));
          }
        }
        {
          quotedNode_2487_l523emne7at4 = (SNode) parameter_2487_l523emne7at6;
          SNode quotedNode1_2487_l523emne7at4;
          if (_parameterValues_129834374.contains(quotedNode_2487_l523emne7at4)) {
            quotedNode1_2487_l523emne7at4 = CopyUtil.copy(quotedNode_2487_l523emne7at4);
          } else {
            _parameterValues_129834374.add(quotedNode_2487_l523emne7at4);
            quotedNode1_2487_l523emne7at4 = quotedNode_2487_l523emne7at4;
          }
          if (quotedNode1_2487_l523emne7at4 != null) {
            quotedNode_2487_l523emne7at0.addChild("resultType", HUtil.copyIfNecessary(quotedNode1_2487_l523emne7at4, typeCheckingContext));
          }
        }
        result = quotedNode1_2487_l523emne7at0;
      }
      return result;
    }

    public SNode createNode(Object parameter_2487_l523emne7at3, Object parameter_2487_l523emne7at6) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_2487_l523emne7at0 = null;
      SNode quotedNode_2487_l523emne7at1 = null;
      SNode quotedNode_2487_l523emne7at4 = null;
      {
        quotedNode_2487_l523emne7at0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.closures.structure.FunctionType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2487_l523emne7at0 = quotedNode_2487_l523emne7at0;
        {
          List<SNode> nodes = (List<SNode>) parameter_2487_l523emne7at3;
          for (SNode child : nodes) {
            quotedNode_2487_l523emne7at0.addChild("parameterType", HUtil.copyIfNecessary(child));
          }
        }
        {
          quotedNode_2487_l523emne7at4 = (SNode) parameter_2487_l523emne7at6;
          SNode quotedNode1_2487_l523emne7at4;
          if (_parameterValues_129834374.contains(quotedNode_2487_l523emne7at4)) {
            quotedNode1_2487_l523emne7at4 = CopyUtil.copy(quotedNode_2487_l523emne7at4);
          } else {
            _parameterValues_129834374.add(quotedNode_2487_l523emne7at4);
            quotedNode1_2487_l523emne7at4 = quotedNode_2487_l523emne7at4;
          }
          if (quotedNode1_2487_l523emne7at4 != null) {
            quotedNode_2487_l523emne7at0.addChild("resultType", HUtil.copyIfNecessary(quotedNode1_2487_l523emne7at4));
          }
        }
        result = quotedNode1_2487_l523emne7at0;
      }
      return result;
    }
  }
}
