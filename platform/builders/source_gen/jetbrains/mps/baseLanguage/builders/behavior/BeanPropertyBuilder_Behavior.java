package jetbrains.mps.baseLanguage.builders.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.behavior.Type_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class BeanPropertyBuilder_Behavior {
  private static Class[] PARAMETERS_2679357232284060725 = {SNode.class};
  private static Class[] PARAMETERS_2679357232284060737 = {SNode.class ,SNode.class};
  private static Class[] PARAMETERS_4797501453850342017 = {SNode.class ,SNode.class ,SNode.class ,SNode.class};

  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getResultType_7057666463730718251(SNode thisNode) {
    return Type_Behavior.call_getJavaType_1213877337345(SLinkOperations.getTarget(ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(thisNode, "setter", false), "parameter", true)).first(), "type", true));
  }

  public static SNode virtual_getCreatorExpression_7057666463730727863(SNode thisNode, SNode parentRef) {
    return SLinkOperations.getTarget(thisNode, "value", true);
  }

  public static SNode virtual_getAttachStatementChild_4797501453850305563(SNode thisNode, SNode parentBuilder, SNode parentRef, SNode childRef) {
    return new BeanPropertyBuilder_Behavior.QuotationClass_4571_0().createNode(parentRef, childRef, SLinkOperations.getTarget(thisNode, "setter", false));
  }

  public static SNode call_getResultType_2679357232284060725(SNode thisNode) {
    return (SNode) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.builders.structure.BeanPropertyBuilder"), "virtual_getResultType_7057666463730718251", PARAMETERS_2679357232284060725);
  }

  public static SNode call_getCreatorExpression_2679357232284060737(SNode thisNode, SNode parentRef) {
    return (SNode) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.builders.structure.BeanPropertyBuilder"), "virtual_getCreatorExpression_7057666463730727863", PARAMETERS_2679357232284060737, parentRef);
  }

  public static SNode call_getAttachStatementChild_4797501453850342017(SNode thisNode, SNode parentBuilder, SNode parentRef, SNode childRef) {
    return (SNode) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.builders.structure.BeanPropertyBuilder"), "virtual_getAttachStatementChild_4797501453850305563", PARAMETERS_4797501453850342017, parentBuilder, parentRef, childRef);
  }

  public static SNode callSuper_getResultType_2679357232284060725(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.builders.structure.BeanPropertyBuilder"), callerConceptFqName, "virtual_getResultType_7057666463730718251", PARAMETERS_2679357232284060725);
  }

  public static SNode callSuper_getCreatorExpression_2679357232284060737(SNode thisNode, String callerConceptFqName, SNode parentRef) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.builders.structure.BeanPropertyBuilder"), callerConceptFqName, "virtual_getCreatorExpression_7057666463730727863", PARAMETERS_2679357232284060737, parentRef);
  }

  public static SNode callSuper_getAttachStatementChild_4797501453850342017(SNode thisNode, String callerConceptFqName, SNode parentBuilder, SNode parentRef, SNode childRef) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.builders.structure.BeanPropertyBuilder"), callerConceptFqName, "virtual_getAttachStatementChild_4797501453850305563", PARAMETERS_4797501453850342017, parentBuilder, parentRef, childRef);
  }

  public static String getPropertyName_2679357232284040711(String methodName) {
    String prefix = "set";
    if (methodName == null) {
      return null;
    }
    if (!(methodName.startsWith(prefix))) {
      return null;
    }
    if (methodName.length() <= prefix.length()) {
      return null;
    }
    String suffix = methodName.substring(prefix.length());
    return Character.toLowerCase(suffix.charAt(0)) + suffix.substring(1);
  }

  public static class QuotationClass_4571_0 {
    public QuotationClass_4571_0() {
    }

    public SNode createNode(Object parameter_4571_0, Object parameter_4571_1, Object parameter_4571_2) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_4571_0 = null;
      SNode quotedNode_4571_1 = null;
      SNode quotedNode_4571_2 = null;
      SNode quotedNode_4571_3 = null;
      SNode quotedNode_4571_4 = null;
      {
        quotedNode_4571_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ExpressionStatement", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_4571_0 = quotedNode_4571_0;
        {
          quotedNode_4571_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.DotExpression", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_4571_1 = quotedNode_4571_1;
          {
            quotedNode_4571_2 = (SNode) parameter_4571_0;
            SNode quotedNode1_4571_2;
            if (_parameterValues_129834374.contains(quotedNode_4571_2)) {
              quotedNode1_4571_2 = CopyUtil.copy(quotedNode_4571_2);
            } else {
              _parameterValues_129834374.add(quotedNode_4571_2);
              quotedNode1_4571_2 = quotedNode_4571_2;
            }
            if (quotedNode1_4571_2 != null) {
              quotedNode_4571_1.addChild("operand", HUtil.copyIfNecessary(quotedNode1_4571_2));
            }
          }
          {
            quotedNode_4571_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
            SNode quotedNode1_4571_3 = quotedNode_4571_3;
            quotedNode1_4571_3.setReferent("baseMethodDeclaration", (SNode) parameter_4571_2);
            {
              quotedNode_4571_4 = (SNode) parameter_4571_1;
              SNode quotedNode1_4571_4;
              if (_parameterValues_129834374.contains(quotedNode_4571_4)) {
                quotedNode1_4571_4 = CopyUtil.copy(quotedNode_4571_4);
              } else {
                _parameterValues_129834374.add(quotedNode_4571_4);
                quotedNode1_4571_4 = quotedNode_4571_4;
              }
              if (quotedNode1_4571_4 != null) {
                quotedNode_4571_3.addChild("actualArgument", HUtil.copyIfNecessary(quotedNode1_4571_4));
              }
            }
            quotedNode_4571_1.addChild("operation", quotedNode1_4571_3);
          }
          quotedNode_4571_0.addChild("expression", quotedNode1_4571_1);
        }
        result = quotedNode1_4571_0;
      }
      return result;
    }
  }
}
