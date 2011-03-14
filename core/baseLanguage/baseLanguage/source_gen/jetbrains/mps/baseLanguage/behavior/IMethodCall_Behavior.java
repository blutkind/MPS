package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.project.IModule;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.pattern.GeneratedMatchingPattern;
import jetbrains.mps.typesystem.inference.TypeChecker;
import java.util.List;
import java.util.Map;
import jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration;
import jetbrains.mps.baseLanguage.structure.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.pattern.IMatchingPattern;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class IMethodCall_Behavior {
  private static Class[] PARAMETERS_8008512149545154471 = {SNode.class};
  private static Class[] PARAMETERS_851115533308208851 = {SNode.class};
  private static Class[] PARAMETERS_5776618742611315379 = {SNode.class ,String.class};

  public static void init(SNode thisNode) {
  }

  public static Object[] call_getActualArguments_1219275428261(SNode thisNode, final IModule module) {
    return ListSequence.fromList(SLinkOperations.getTargets(thisNode, "actualArgument", true)).<Object>select(new ISelector<SNode, Object>() {
      public Object select(SNode it) {
        return Expression_Behavior.call_eval_1213877519769(it, module);
      }
    }).toGenericArray(Object.class);
  }

  public static SNode virtual_deriveType_1213877435747(SNode thisNode, SNode expression) {
    // is 'experssion' an actual argument in this method call? 
    if (SNodeOperations.getParent(expression) == thisNode && SNodeOperations.hasRole(expression, "jetbrains.mps.baseLanguage.structure.IMethodCall", "actualArgument")) {
      SNode method = SLinkOperations.getTarget(thisNode, "baseMethodDeclaration", false);
      int i = SNodeOperations.getIndexInParent(expression);
      if (i < ListSequence.fromList(SLinkOperations.getTargets(method, "parameter", true)).count()) {
        SNode parameterDeclaration = ListSequence.fromList(SLinkOperations.getTargets(method, "parameter", true)).getElement(i);
        SNode rawType = SNodeOperations.copyNode(SLinkOperations.getTarget(parameterDeclaration, "type", true));
        SNode instanceType = IMethodCall_Behavior.call_getInstanceType_8008512149545154471(thisNode);
        if ((instanceType == null)) {
          return rawType;
        }
        SNode methodClassifier = SNodeOperations.getAncestor(SLinkOperations.getTarget(thisNode, "baseMethodDeclaration", false), "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
        {
          GeneratedMatchingPattern pattern_fq0410_f0c0b0b = new IMethodCall_Behavior.Pattern_fq0410_a0a0a5a2a1a2(methodClassifier);
          SNode coercedNode_fq0410_f0c0b0b = TypeChecker.getInstance().getRuntimeSupport().coerce_(instanceType, pattern_fq0410_f0c0b0b);
          if (coercedNode_fq0410_f0c0b0b != null) {
            SNode resultType;
            if (SNodeOperations.isInstanceOf(rawType, "jetbrains.mps.baseLanguage.structure.TypeVariableReference")) {
              resultType = IMethodCall_Behavior.call_getConcreteType_8008512149545161843(thisNode, SNodeOperations.cast(rawType, "jetbrains.mps.baseLanguage.structure.TypeVariableReference"), coercedNode_fq0410_f0c0b0b, methodClassifier);
            } else {
              for (SNode typeVariableReference : SNodeOperations.getDescendants(rawType, "jetbrains.mps.baseLanguage.structure.TypeVariableReference", false, new String[]{})) {
                SNode concreteType = IMethodCall_Behavior.call_getConcreteType_8008512149545161843(thisNode, typeVariableReference, coercedNode_fq0410_f0c0b0b, methodClassifier);
                SNodeOperations.replaceWithAnother(typeVariableReference, concreteType);
              }
              resultType = rawType;
            }
            return resultType;
          } else {
            return rawType;
          }
        }
      }
    }
    return null;
  }

  public static SNode call_getConcreteType_8008512149545161843(SNode thisNode, SNode typeVariableReference, SNode coercedClt, SNode methodClassifier) {
    List<SNode> parameters = SLinkOperations.getTargets(coercedClt, "parameter", true);
    if (ListSequence.fromList(parameters).isEmpty()) {
      return new IMethodCall_Behavior.QuotationClass_fq0410_a0a0b0d().createNode();
    }
    SNode concreteType;
    if (SNodeOperations.getParent(SLinkOperations.getTarget(typeVariableReference, "typeVariableDeclaration", false)) == methodClassifier) {
      concreteType = SNodeOperations.copyNode(ListSequence.fromList(parameters).getElement(SNodeOperations.getIndexInParent(SLinkOperations.getTarget(typeVariableReference, "typeVariableDeclaration", false))));
    } else {
      concreteType = new IMethodCall_Behavior.QuotationClass_fq0410_a0a0a0d0d().createNode();
    }
    return concreteType;
  }

  public static SNode virtual_getTypeAnnotation_1233920952262(SNode thisNode) {
    return TypeAnnotable_Behavior.call_getTypeAnnotation_1233920952262(SLinkOperations.getTarget(thisNode, "baseMethodDeclaration", false));
  }

  public static SNode virtual_getInstanceType_8008512149545154471(SNode thisNode) {
    return null;
  }

  public static Map<TypeVariableDeclaration, Type> virtual_getTypesByTypeVars_851115533308208851(SNode thisNode) {
    SNode instanceType = IMethodCall_Behavior.call_getInstanceType_8008512149545154471(thisNode);
    HashMap<TypeVariableDeclaration, Type> result = new HashMap<TypeVariableDeclaration, Type>();
    if ((instanceType == null)) {
      return result;
    }
    Iterator<SNode> typeParms = ListSequence.fromList(SLinkOperations.getTargets(instanceType, "parameter", true)).iterator();
    Iterator<SNode> typeVars = ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(instanceType, "classifier", false), "typeVariableDeclaration", true)).iterator();
    while (typeParms.hasNext() && typeVars.hasNext()) {
      result.put(((TypeVariableDeclaration) SNodeOperations.getAdapter(typeVars.next())), ((Type) SNodeOperations.getAdapter(typeParms.next())));
    }
    return result;
  }

  public static List<SNode> virtual_getAvailableMethodDeclarations_5776618742611315379(SNode thisNode, String methodName) {
    return new ArrayList<SNode>();
  }

  public static SNode call_getInstanceType_8008512149545154471(SNode thisNode) {
    return (SNode) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.IMethodCall"), "virtual_getInstanceType_8008512149545154471", PARAMETERS_8008512149545154471);
  }

  public static Map<TypeVariableDeclaration, Type> call_getTypesByTypeVars_851115533308208851(SNode thisNode) {
    return (Map<TypeVariableDeclaration, Type>) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.IMethodCall"), "virtual_getTypesByTypeVars_851115533308208851", PARAMETERS_851115533308208851);
  }

  public static List<SNode> call_getAvailableMethodDeclarations_5776618742611315379(SNode thisNode, String methodName) {
    return (List<SNode>) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.IMethodCall"), "virtual_getAvailableMethodDeclarations_5776618742611315379", PARAMETERS_5776618742611315379, methodName);
  }

  public static SNode callSuper_getInstanceType_8008512149545154471(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.IMethodCall"), callerConceptFqName, "virtual_getInstanceType_8008512149545154471", PARAMETERS_8008512149545154471);
  }

  public static Map<TypeVariableDeclaration, Type> callSuper_getTypesByTypeVars_851115533308208851(SNode thisNode, String callerConceptFqName) {
    return (Map<TypeVariableDeclaration, Type>) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.IMethodCall"), callerConceptFqName, "virtual_getTypesByTypeVars_851115533308208851", PARAMETERS_851115533308208851);
  }

  public static List<SNode> callSuper_getAvailableMethodDeclarations_5776618742611315379(SNode thisNode, String callerConceptFqName, String methodName) {
    return (List<SNode>) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.IMethodCall"), callerConceptFqName, "virtual_getAvailableMethodDeclarations_5776618742611315379", PARAMETERS_5776618742611315379, methodName);
  }

  public static class Pattern_fq0410_a0a0a5a2a1a2 extends GeneratedMatchingPattern implements IMatchingPattern {
    /*package*/ List<SNode> patternVar_param;
    /*package*/ SNode patternVar_ignore;
    /*package*/ Object AntiquotationField_fq0410_a0a0a5a2a1a1;

    public Pattern_fq0410_a0a0a5a2a1a2(Object parameter_fq0410_a0a0a5a2a1a1) {
      this.AntiquotationField_fq0410_a0a0a5a2a1a1 = parameter_fq0410_a0a0a5a2a1a1;
    }

    public boolean match(SNode nodeToMatch) {
      {
        SNode nodeToMatch_fq0410_a0a5a2a1a1;
        nodeToMatch_fq0410_a0a5a2a1a1 = nodeToMatch;
        if (!("jetbrains.mps.baseLanguage.structure.ClassifierType".equals(nodeToMatch_fq0410_a0a5a2a1a1.getConceptFqName()))) {
          return false;
        }
        {
          SNode referent;
          referent = (SNode) this.AntiquotationField_fq0410_a0a0a5a2a1a1;
          if (nodeToMatch_fq0410_a0a5a2a1a1.getReferent("classifier") != referent) {
            return false;
          }
        }
        {
          String childRole_fq0410_ = "parameter";
          this.patternVar_param = ListSequence.fromList(new ArrayList<SNode>());
          patternVar_ignore = null;
          for (SNode childVar : nodeToMatch_fq0410_a0a5a2a1a1.getChildren(childRole_fq0410_)) {
            patternVar_ignore = childVar;
            ListSequence.fromList(this.patternVar_param).addElement(childVar);
          }
        }
      }
      return true;
    }

    public boolean hasAntiquotations() {
      return true;
    }

    public void fillFieldValuesFrom(GeneratedMatchingPattern pattern) {
      if (pattern != null && pattern.getClass() == this.getClass()) {
        patternVar_param = (List<SNode>) pattern.getFieldValue("patternVar_param");
        patternVar_ignore = (SNode) pattern.getFieldValue("patternVar_ignore");
      }
    }

    public Object getFieldValue(String fieldName) {
      if ("patternVar_param".equals(fieldName)) {
        return patternVar_param;
      }
      if ("patternVar_ignore".equals(fieldName)) {
        return patternVar_ignore;
      }
      return null;
    }

    public void performActions(Object o) {
    }
  }

  public static class QuotationClass_fq0410_a0a0b0d {
    public QuotationClass_fq0410_a0a0b0d() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(java.lang@java_stub)"), SNodeId.fromString("~Object")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_fq0410_a0a0a0d0d {
    public QuotationClass_fq0410_a0a0a0d0d() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(java.lang@java_stub)"), SNodeId.fromString("~Object")));
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
