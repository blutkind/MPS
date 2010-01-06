package jetbrains.mps.lang.smodel.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;

public class supertypesOf_ClassifierTypeSModel_SModelType_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  /*package*/ _Patterns.Pattern_1 myMatchingPattern;

  public supertypesOf_ClassifierTypeSModel_SModelType_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode type, TypeCheckingContext typeCheckingContext) {
    return new supertypesOf_ClassifierTypeSModel_SModelType_SubtypingRule.QuotationClass_1688_0().createNode(typeCheckingContext);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierType";
  }

  public boolean isApplicable(SNode argument) {
    this.myMatchingPattern = new _Patterns.Pattern_1();
    return this.myMatchingPattern.match(argument);
  }

  public boolean isWeak() {
    return true;
  }

  public static class QuotationClass_1688_0 {
    public QuotationClass_1688_0() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_61 = null;
      {
        quotedNode_61 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SModelType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_61 = quotedNode_61;
        result = quotedNode1_61;
      }
      return result;
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_61 = null;
      {
        quotedNode_61 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SModelType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_61 = quotedNode_61;
        result = quotedNode1_61;
      }
      return result;
    }
  }
}
