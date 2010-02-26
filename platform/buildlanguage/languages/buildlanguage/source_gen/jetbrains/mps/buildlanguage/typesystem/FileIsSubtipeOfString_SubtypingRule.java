package jetbrains.mps.buildlanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;

public class FileIsSubtipeOfString_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  public FileIsSubtipeOfString_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode fileType, TypeCheckingContext typeCheckingContext) {
    return new FileIsSubtipeOfString_SubtypingRule.QuotationClass_3xtvj4_a0a0a().createNode(typeCheckingContext);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.buildlanguage.structure.FileType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean isWeak() {
    return false;
  }

  public static class QuotationClass_3xtvj4_a0a0a {
    public QuotationClass_3xtvj4_a0a0a() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_3xtvj4_a0a0a = null;
      {
        quotedNode_3xtvj4_a0a0a = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.buildlanguage.structure.StringType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_3xtvj4_a0a0a = quotedNode_3xtvj4_a0a0a;
        result = quotedNode1_3xtvj4_a0a0a;
      }
      return result;
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_3xtvj4_a0a0a = null;
      {
        quotedNode_3xtvj4_a0a0a = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.buildlanguage.structure.StringType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_3xtvj4_a0a0a = quotedNode_3xtvj4_a0a0a;
        result = quotedNode1_3xtvj4_a0a0a;
      }
      return result;
    }
  }
}
