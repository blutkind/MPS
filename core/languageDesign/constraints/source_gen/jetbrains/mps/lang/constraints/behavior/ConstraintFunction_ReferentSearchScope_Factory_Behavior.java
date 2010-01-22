package jetbrains.mps.lang.constraints.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class ConstraintFunction_ReferentSearchScope_Factory_Behavior {
  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getExpectedReturnType_1213877374441(SNode thisNode) {
    return new ConstraintFunction_ReferentSearchScope_Factory_Behavior.QuotationClass_8721_0().createNode();
  }

  public static class QuotationClass_8721_0 {
    public QuotationClass_8721_0() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_8721_0 = null;
      SNode quotedNode_8721_1 = null;
      SNode quotedNode_8721_2 = null;
      SNode quotedNode_8721_3 = null;
      {
        quotedNode_8721_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.JoinType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_8721_0 = quotedNode_8721_0;
        {
          quotedNode_8721_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_8721_1 = quotedNode_8721_1;
          quotedNode1_8721_1.addReference(SReference.create("classifier", quotedNode1_8721_1, SModelReference.fromString("f:java_stub#jetbrains.mps.smodel.search(jetbrains.mps.smodel.search@java_stub)"), SNodeId.fromString("~ISearchScope")));
          quotedNode_8721_0.addChild("argument", quotedNode1_8721_1);
        }
        {
          quotedNode_8721_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SequenceType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_8721_2 = quotedNode_8721_2;
          {
            quotedNode_8721_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
            SNode quotedNode1_8721_3 = quotedNode_8721_3;
            quotedNode_8721_2.addChild("elementType", quotedNode1_8721_3);
          }
          quotedNode_8721_0.addChild("argument", quotedNode1_8721_2);
        }
        result = quotedNode1_8721_0;
      }
      return result;
    }
  }
}
