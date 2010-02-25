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
    return new BeanPropertyBuilder_Behavior.QuotationClass_4571_l523emne469v().createNode(parentRef, childRef, SLinkOperations.getTarget(thisNode, "setter", false));
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

  public static class QuotationClass_4571_l523emne469v {
    public QuotationClass_4571_l523emne469v() {
    }

    public SNode createNode(Object parameter_4571_10g64by4tnnyx, Object parameter_4571_10g64by4tnnz1, Object parameter_4571_10g64by4tnnz5) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_4571_10g64by4tnnys = null;
      SNode quotedNode_4571_10g64by4tnnyu = null;
      SNode quotedNode_4571_10g64by4tnnyv = null;
      SNode quotedNode_4571_10g64by4tnnyy = null;
      SNode quotedNode_4571_10g64by4tnnyz = null;
      {
        quotedNode_4571_10g64by4tnnys = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ExpressionStatement", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_4571_10g64by4tnnys = quotedNode_4571_10g64by4tnnys;
        {
          quotedNode_4571_10g64by4tnnyu = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.DotExpression", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_4571_10g64by4tnnyu = quotedNode_4571_10g64by4tnnyu;
          {
            quotedNode_4571_10g64by4tnnyv = (SNode) parameter_4571_10g64by4tnnyx;
            SNode quotedNode1_4571_10g64by4tnnyv;
            if (_parameterValues_129834374.contains(quotedNode_4571_10g64by4tnnyv)) {
              quotedNode1_4571_10g64by4tnnyv = CopyUtil.copy(quotedNode_4571_10g64by4tnnyv);
            } else {
              _parameterValues_129834374.add(quotedNode_4571_10g64by4tnnyv);
              quotedNode1_4571_10g64by4tnnyv = quotedNode_4571_10g64by4tnnyv;
            }
            if (quotedNode1_4571_10g64by4tnnyv != null) {
              quotedNode_4571_10g64by4tnnyu.addChild("operand", HUtil.copyIfNecessary(quotedNode1_4571_10g64by4tnnyv));
            }
          }
          {
            quotedNode_4571_10g64by4tnnyy = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
            SNode quotedNode1_4571_10g64by4tnnyy = quotedNode_4571_10g64by4tnnyy;
            quotedNode1_4571_10g64by4tnnyy.setReferent("baseMethodDeclaration", (SNode) parameter_4571_10g64by4tnnz5);
            {
              quotedNode_4571_10g64by4tnnyz = (SNode) parameter_4571_10g64by4tnnz1;
              SNode quotedNode1_4571_10g64by4tnnyz;
              if (_parameterValues_129834374.contains(quotedNode_4571_10g64by4tnnyz)) {
                quotedNode1_4571_10g64by4tnnyz = CopyUtil.copy(quotedNode_4571_10g64by4tnnyz);
              } else {
                _parameterValues_129834374.add(quotedNode_4571_10g64by4tnnyz);
                quotedNode1_4571_10g64by4tnnyz = quotedNode_4571_10g64by4tnnyz;
              }
              if (quotedNode1_4571_10g64by4tnnyz != null) {
                quotedNode_4571_10g64by4tnnyy.addChild("actualArgument", HUtil.copyIfNecessary(quotedNode1_4571_10g64by4tnnyz));
              }
            }
            quotedNode_4571_10g64by4tnnyu.addChild("operation", quotedNode1_4571_10g64by4tnnyy);
          }
          quotedNode_4571_10g64by4tnnys.addChild("expression", quotedNode1_4571_10g64by4tnnyu);
        }
        result = quotedNode1_4571_10g64by4tnnys;
      }
      return result;
    }
  }
}
