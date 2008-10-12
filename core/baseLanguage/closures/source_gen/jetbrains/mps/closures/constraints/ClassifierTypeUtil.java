package jetbrains.mps.closures.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.helgins.runtime.HUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.core.behavior.BaseConcept_Behavior;
import java.util.List;
import jetbrains.mps.closures.generator.baseLanguage.template.helper.FunctionTypeUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import java.util.ArrayList;
import java.util.LinkedList;
import jetbrains.mps.lang.pattern.IMatchingPattern;

public class ClassifierTypeUtil {

  public static SNode getTypeCoercedToClassifierType(SNode type) {
    if (SNodeOperations.isInstanceOf(type, "jetbrains.mps.baseLanguage.structure.TypeVariableReference") || SNodeOperations.isInstanceOf(type, "jetbrains.mps.baseLanguage.structure.WildCardType")) {
      return type;
    }
    if (SNodeOperations.isInstanceOf(type, "jetbrains.mps.baseLanguage.structure.UpperBoundType")) {
      SNode res = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.UpperBoundType", null);
      SLinkOperations.setTarget(res, "bound", getTypeCoercedToClassifierType(SLinkOperations.getTarget(type, "bound", true)), true);
    }
    if (SNodeOperations.isInstanceOf(type, "jetbrains.mps.bootstrap.helgins.structure.MeetType")) {
      SNode res = SConceptOperations.createNewNode("jetbrains.mps.bootstrap.helgins.structure.MeetType", null);
      for(SNode arg : SLinkOperations.getTargets(type, "argument", true)) {
        if (SNodeOperations.isInstanceOf(arg, "jetbrains.mps.baseLanguage.structure.Type")) {
          SLinkOperations.addChild(res, "argument", getTypeCoercedToClassifierType(arg));
        } else
        {
          Logger.getLogger(ClassifierTypeUtil.class).error("Argument of an instance of MEET type is not a subconcept of Type");
        }
      }
      return res;
    }
    SNode ctw = TypeChecker.getInstance().getRuntimeSupport().coerce(type, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.ClassifierType"), true);
    SNode cts = TypeChecker.getInstance().getRuntimeSupport().coerce(type, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.ClassifierType"), false);
    if (SNodeOperations.isInstanceOf(type, "jetbrains.mps.baseLanguage.collections.structure.SequenceType") && !("Iterable".equals(SPropertyOperations.getString(SLinkOperations.getTarget(cts, "classifier", false), "name")))) {
      System.err.println("*** Gotcha! *** coerceStrong( " + BaseConcept_Behavior.call_getPresentation_1213877396640(type) + " <: concept = ClassifierType) == " + BaseConcept_Behavior.call_getPresentation_1213877396640(cts) + ", coerce( " + BaseConcept_Behavior.call_getPresentation_1213877396640(type) + " <: concept = ClassifierType) == " + BaseConcept_Behavior.call_getPresentation_1213877396640(ctw));
    }
    if ((cts == null)) {
      cts = ctw;
    }
    if ((cts != null)) {
      List<SNode> params = SLinkOperations.getTargets(cts, "parameter", true);
      if (params != null && params.size() > 0) {
        SNode res = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ClassifierType", null);
        SLinkOperations.setTarget(res, "classifier", SLinkOperations.getTarget(cts, "classifier", false), false);
        for(SNode p : params) {
          SLinkOperations.addChild(res, "parameter", SNodeOperations.copyNode(getTypeCoercedToClassifierType(p)));
        }
        return res;
      }
      return cts;
    }
    return type;
  }

  public static SNode getDeclarationClassifierType(SNode ft) {
    String rtSig = "_FunctionTypes." + FunctionTypeUtil.getRuntimeSignature(ft);
    for(SNode ice : SModelOperations.getNodes(SNodeOperations.getModel(SLinkOperations.getTarget(new QuotationClass_1().createNode(), "classifier", false)), "jetbrains.mps.baseLanguage.structure.Interface")) {
      if (rtSig.equals(SPropertyOperations.getString(ice, "name"))) {
        SNode ct = new QuotationClass_0().createNode(ice);
        if ((SLinkOperations.getTarget(ft, "resultType", true) != null) && !(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(ft, "resultType", true), "jetbrains.mps.baseLanguage.structure.VoidType"))) {
          SLinkOperations.addChild(ct, "parameter", copyTypeRecursively(getTypeCoercedToClassifierType(SLinkOperations.getTarget(ft, "resultType", true)), true));
        }
        for(SNode pt : SLinkOperations.getTargets(ft, "parameterType", true)) {
          SLinkOperations.addChild(ct, "parameter", copyTypeRecursively(getTypeCoercedToClassifierType(pt), false));
        }
        for(SNode tt : SLinkOperations.getTargets(ft, "throwsType", true)) {
          SLinkOperations.addChild(ct, "parameter", copyTypeRecursively(tt, true));
        }
        return ct;
      }
    }
    return null;
  }

  public static SNode getClassifierType(SNode ft) {
    String rtSig = "_FunctionTypes." + FunctionTypeUtil.getRuntimeSignature(ft);
    for(SNode ice : SModelOperations.getNodes(SNodeOperations.getModel(SLinkOperations.getTarget(new QuotationClass_9().createNode(), "classifier", false)), "jetbrains.mps.baseLanguage.structure.Interface")) {
      if (rtSig.equals(SPropertyOperations.getString(ice, "name"))) {
        SNode ct = new QuotationClass_8().createNode(ice);
        if ((SLinkOperations.getTarget(ft, "resultType", true) != null) && !(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(ft, "resultType", true), "jetbrains.mps.baseLanguage.structure.VoidType"))) {
          SLinkOperations.addChild(ct, "parameter", copyTypeRecursively(getTypeCoercedToClassifierType(SLinkOperations.getTarget(ft, "resultType", true))));
        }
        for(SNode pt : SLinkOperations.getTargets(ft, "parameterType", true)) {
          SLinkOperations.addChild(ct, "parameter", copyTypeRecursively(getTypeCoercedToClassifierType(pt)));
        }
        for(SNode tt : SLinkOperations.getTargets(ft, "throwsType", true)) {
          SLinkOperations.addChild(ct, "parameter", copyTypeRecursively(tt));
        }
        return ct;
      }
    }
    return null;
  }

  public static SNode getClassifierType(SNode ft, List<SNode> parameterType) {
    String rtSig = "_FunctionTypes." + FunctionTypeUtil.getRuntimeSignature(ft);
    for(SNode ice : SModelOperations.getNodes(SNodeOperations.getModel(SLinkOperations.getTarget(new QuotationClass_11().createNode(), "classifier", false)), "jetbrains.mps.baseLanguage.structure.Interface")) {
      if (rtSig.equals(SPropertyOperations.getString(ice, "name"))) {
        SNode ct = new QuotationClass_10().createNode(ice);
        if ((SLinkOperations.getTarget(ft, "resultType", true) != null) && !(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(ft, "resultType", true), "jetbrains.mps.baseLanguage.structure.VoidType"))) {
          SLinkOperations.addChild(ct, "parameter", copyTypeRecursively(getTypeCoercedToClassifierType(SLinkOperations.getTarget(ft, "resultType", true))));
        }
        for(SNode pt : parameterType) {
          SLinkOperations.addChild(ct, "parameter", copyTypeRecursively(getTypeCoercedToClassifierType(pt)));
        }
        for(SNode tt : SLinkOperations.getTargets(ft, "throwsType", true)) {
          SLinkOperations.addChild(ct, "parameter", copyTypeRecursively(tt));
        }
        return ct;
      }
    }
    return null;
  }

  public static boolean isFunctionTypeClassifier(SNode classifier) {
    for(SNode ice : SModelOperations.getNodes(SNodeOperations.getModel(SLinkOperations.getTarget(new QuotationClass_6().createNode(), "classifier", false)), "jetbrains.mps.baseLanguage.structure.Interface")) {
      if (ice == classifier) {
        return true;
      }
    }
    return false;
  }

  public static boolean isFunctionTypeClassifierReturningValue(SNode classifier) {
    for(SNode ice : SModelOperations.getNodes(SNodeOperations.getModel(SLinkOperations.getTarget(new QuotationClass_7().createNode(), "classifier", false)), "jetbrains.mps.baseLanguage.structure.Interface")) {
      if (ice == classifier) {
        String cname = SPropertyOperations.getString(classifier, "name");
        int ldi = cname.lastIndexOf(".");
        cname = (ldi >= 0 ?
          cname.substring(ldi + 1) :
          cname
        );
        return !(cname.startsWith("_void"));
      }
    }
    return false;
  }

  public static SNode resolveTypeUsingSupertypes(SNode type, SNode concrete) {
    List<SNode> visitedClassifiers = new ArrayList<SNode>();
    LinkedList<SNode> concretes = new LinkedList<SNode>();
    concretes.addLast(concrete);
    SNode resType = type;
    while (!(concretes.isEmpty())) {
      SNode ct = concretes.removeFirst();
      if (visitedClassifiers.contains(SLinkOperations.getTarget(ct, "classifier", false)) || SLinkOperations.getCount(ct, "parameter") == 0) {
        continue;
      }
      visitedClassifiers.add(SLinkOperations.getTarget(ct, "classifier", false));
      for(SNode sup : TypeChecker.getInstance().getSubtypingManager().collectImmediateSupertypes(ct)) {
        {
          IMatchingPattern pattern_0 = HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.ClassifierType");
          SNode coercedNode_0 = TypeChecker.getInstance().getRuntimeSupport().coerce(sup, pattern_0);
          if (coercedNode_0 != null) {
            concretes.addLast(coercedNode_0);
          }
        }
      }
      resType = resolveType(resType, ct);
      if (((List)SNodeOperations.getDescendants(resType, "jetbrains.mps.baseLanguage.structure.TypeVariableReference", false)).isEmpty()) {
        break;
      }
    }
    return resType;
  }

  public static SNode resolveType(SNode type, SNode concrete) {
    List<SNode> ptypes = SLinkOperations.getTargets(concrete, "parameter", true);
    List<SNode> vars = SLinkOperations.getTargets(SLinkOperations.getTarget(concrete, "classifier", false), "typeVariableDeclaration", true);
    return resolveType(SNodeOperations.copyNode(type), ptypes, vars);
  }

  public static SNode resolveType(SNode type, List<SNode> actTypes, List<SNode> vars) {
    if (SNodeOperations.isInstanceOf(type, "jetbrains.mps.baseLanguage.structure.TypeVariableReference") && actTypes.size() > 0) {
      int idx = 0;
      for(SNode tvd : vars) {
        if (tvd == SLinkOperations.getTarget(type, "typeVariableDeclaration", false) && idx < actTypes.size()) {
          return SNodeOperations.copyNode(getTypeCoercedToClassifierType(actTypes.get(idx)));
        }
        idx = idx + 1;
      }
    } else
    if (SNodeOperations.isInstanceOf(type, "jetbrains.mps.baseLanguage.structure.ClassifierType")) {
      for(SNode pt : SLinkOperations.getTargets(type, "parameter", true)) {
        SNode rt = resolveType(pt, actTypes, vars);
        if (pt != rt) {
          SNodeOperations.replaceWithAnother(pt, rt);
        }
      }
    }
    return type;
  }

  private static SNode copyTypeRecursively(SNode type, boolean covariant) {
    if (SNodeOperations.isInstanceOf(type, "jetbrains.mps.baseLanguage.structure.ClassifierType")) {
      SNode copy = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ClassifierType", null);
      SLinkOperations.setTarget(copy, "classifier", SLinkOperations.getTarget(type, "classifier", false), false);
      boolean covariantParam = isFunctionTypeClassifierReturningValue(SLinkOperations.getTarget(type, "classifier", false));
      for(SNode pt : SLinkOperations.getTargets(type, "parameter", true)) {
        SLinkOperations.addChild(copy, "parameter", (isFunctionTypeClassifier(SLinkOperations.getTarget(type, "classifier", false)) ?
          copyTypeRecursively(pt, covariantParam) :
          copyTypeRecursively(pt)
        ));
        covariantParam = false;
      }
      return (covariant || isFunctionTypeClassifier(SLinkOperations.getTarget(type, "classifier", false)) ?
        new QuotationClass_2().createNode(copy) :
        new QuotationClass_3().createNode(copy)
      );
    } else
    {
      return (covariant ?
        new QuotationClass_4().createNode(SNodeOperations.copyNode(type)) :
        new QuotationClass_5().createNode(SNodeOperations.copyNode(type))
      );
    }
  }

  public static SNode copyTypeRecursively(SNode type) {
    type = (SNodeOperations.isInstanceOf(type, "jetbrains.mps.baseLanguage.structure.UpperBoundType") ?
      SLinkOperations.getTarget(type, "bound", true) :
      type
    );
    type = (SNodeOperations.isInstanceOf(type, "jetbrains.mps.baseLanguage.structure.LowerBoundType") ?
      SLinkOperations.getTarget(type, "bound", true) :
      type
    );
    if (SNodeOperations.isInstanceOf(type, "jetbrains.mps.baseLanguage.structure.ClassifierType")) {
      SNode copy = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ClassifierType", null);
      SLinkOperations.setTarget(copy, "classifier", SLinkOperations.getTarget(type, "classifier", false), false);
      for(SNode pt : SLinkOperations.getTargets(type, "parameter", true)) {
        SLinkOperations.addChild(copy, "parameter", copyTypeRecursively(pt));
      }
      return copy;
    } else if (SNodeOperations.isInstanceOf(type, "jetbrains.mps.bootstrap.helgins.structure.MeetType")) {
      SNode copy = SConceptOperations.createNewNode("jetbrains.mps.bootstrap.helgins.structure.MeetType", null);
      for(SNode arg : SLinkOperations.getTargets(type, "argument", true)) {
        SLinkOperations.addChild(copy, "argument", copyTypeRecursively(arg));
      }
      return copy;
    } else
    {
      return SNodeOperations.copyNode(type);
    }
  }

}
