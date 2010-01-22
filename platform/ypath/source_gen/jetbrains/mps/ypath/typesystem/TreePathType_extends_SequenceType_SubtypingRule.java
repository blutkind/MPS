package jetbrains.mps.ypath.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class TreePathType_extends_SequenceType_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  public TreePathType_extends_SequenceType_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode treepath, TypeCheckingContext typeCheckingContext) {
    return new TreePathType_extends_SequenceType_SubtypingRule.QuotationClass_7447_0().createNode(SLinkOperations.getTarget(treepath, "nodeType", true), typeCheckingContext);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.ypath.structure.TreePathType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean isWeak() {
    return false;
  }

  public static class QuotationClass_7447_0 {
    public QuotationClass_7447_0() {
    }

    public SNode createNode(Object parameter_7447_0, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_7447_0 = null;
      SNode quotedNode_7447_1 = null;
      {
        quotedNode_7447_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SequenceType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_7447_0 = quotedNode_7447_0;
        {
          quotedNode_7447_1 = (SNode) parameter_7447_0;
          SNode quotedNode1_3;
          if (_parameterValues_129834374.contains(quotedNode_7447_1)) {
            quotedNode1_3 = CopyUtil.copy(quotedNode_7447_1);
          } else {
            _parameterValues_129834374.add(quotedNode_7447_1);
            quotedNode1_3 = quotedNode_7447_1;
          }
          if (quotedNode1_3 != null) {
            quotedNode_7447_0.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_3, typeCheckingContext));
          }
        }
        result = quotedNode1_7447_0;
      }
      return result;
    }

    public SNode createNode(Object parameter_7447_0) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_7447_0 = null;
      SNode quotedNode_7447_1 = null;
      {
        quotedNode_7447_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SequenceType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_7447_0 = quotedNode_7447_0;
        {
          quotedNode_7447_1 = (SNode) parameter_7447_0;
          SNode quotedNode1_3;
          if (_parameterValues_129834374.contains(quotedNode_7447_1)) {
            quotedNode1_3 = CopyUtil.copy(quotedNode_7447_1);
          } else {
            _parameterValues_129834374.add(quotedNode_7447_1);
            quotedNode1_3 = quotedNode_7447_1;
          }
          if (quotedNode1_3 != null) {
            quotedNode_7447_0.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_3));
          }
        }
        result = quotedNode1_7447_0;
      }
      return result;
    }
  }
}
