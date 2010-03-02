package jetbrains.mps.baseLanguage.dates.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.baseLanguage.dates.actions.DateTypeUtil;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class MathDateTimeOperation_Behavior {
  public static void init(SNode thisNode) {
  }

  public static boolean call_needLeftConvert_1238250704510(SNode thisNode) {
    return MathDateTimeOperation_Behavior.call_needConvert_1238250776233(thisNode, SLinkOperations.getTarget(thisNode, "leftExpression", true));
  }

  public static boolean call_needRightConvert_1238250706060(SNode thisNode) {
    return MathDateTimeOperation_Behavior.call_needConvert_1238250776233(thisNode, SLinkOperations.getTarget(thisNode, "rightExpression", true));
  }

  public static boolean call_needConvert_1238250776233(SNode thisNode, SNode expression) {
    boolean can = false;
    SNode expressionType = TypeChecker.getInstance().getTypeOf(expression);
    can = TypeChecker.getInstance().getSubtypingManager().isSubtype(expressionType, new MathDateTimeOperation_Behavior.QuotationClass_26vghy_a1a0a2a3().createNode());
    can = can || TypeChecker.getInstance().getSubtypingManager().isSubtype(expressionType, new MathDateTimeOperation_Behavior.QuotationClass_26vghy_a1a0a0d0d().createNode());
    can = can || TypeChecker.getInstance().getSubtypingManager().isSubtype(expressionType, new MathDateTimeOperation_Behavior.QuotationClass_26vghy_a1a0a0e0d().createNode());
    can = can || TypeChecker.getInstance().getSubtypingManager().isSubtype(expressionType, new MathDateTimeOperation_Behavior.QuotationClass_26vghy_a1a0a0f0d().createNode());
    can = can || DateTypeUtil.isInstanceOfPeriod(expression);
    return can;
  }

  public static class QuotationClass_26vghy_a1a0a2a3 {
    public QuotationClass_26vghy_a1a0a2a3() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#org.joda.time.base(org.joda.time.base@java_stub)"), SNodeId.fromString("~AbstractInstant")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_26vghy_a1a0a0d0d {
    public QuotationClass_26vghy_a1a0a0d0d() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#java.util(java.util@java_stub)"), SNodeId.fromString("~Date")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_26vghy_a1a0a0e0d {
    public QuotationClass_26vghy_a1a0a0e0d() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#java.util(java.util@java_stub)"), SNodeId.fromString("~Calendar")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_26vghy_a1a0a0f0d {
    public QuotationClass_26vghy_a1a0a0f0d() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.PeriodType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
