package jetbrains.mps.lang.stubs.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class ModelManagerType_SubtypeOf_ModelRootManager_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  public ModelManagerType_SubtypeOf_ModelRootManager_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode creatorType, TypeCheckingContext typeCheckingContext) {
    return new ModelManagerType_SubtypeOf_ModelRootManager_SubtypingRule.QuotationClass_2ew8he_a0a0a().createNode(typeCheckingContext);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.stubs.structure.StubsCreatorType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean isWeak() {
    return false;
  }

  public static class QuotationClass_2ew8he_a0a0a {
    public QuotationClass_2ew8he_a0a0a() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#jetbrains.mps.smodel.persistence(jetbrains.mps.smodel.persistence@java_stub)"), SNodeId.fromString("~AbstractModelRootManager")));
        result = quotedNode1_2;
      }
      return result;
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#jetbrains.mps.smodel.persistence(jetbrains.mps.smodel.persistence@java_stub)"), SNodeId.fromString("~AbstractModelRootManager")));
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
