package jetbrains.mps.closures.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.core.behavior.BaseConcept_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.helgins.runtime.HUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptPropertyOperations;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.closures.constraints.ClassifierTypeUtil;
import jetbrains.mps.lang.pattern.IMatchingPattern;

public class FunctionType_Behavior {

  public static void init(SNode thisNode) {
  }

  public static String virtual_getPresentation_1213877396640(SNode thisNode) {
    StringBuffer sb = new StringBuffer("{");
    String sep = "";
    for(SNode pt : SLinkOperations.getTargets(thisNode, "parameterType", true)) {
      sb.append(sep).append(BaseConcept_Behavior.call_getPresentation_1213877396640(pt));
      sep = ",";
    }
    sb.append("=>").append(BaseConcept_Behavior.call_getPresentation_1213877396640(SLinkOperations.getTarget(thisNode, "resultType", true)));
    return sb.append("}").toString();
  }

  public static SNode virtual_getClassExpression_1213877337357(SNode thisNode) {
    return new QuotationClass_0().createNode();
  }

  public static String call_getRuntimeSignature_1213877404927(SNode thisNode) {
    String[] paramTypes = new String[]{"_J","_K","_L","_M","_N","_O","_P","_Q","_S","_T"};
    StringBuilder sb = new StringBuilder();
    if ((SLinkOperations.getTarget(thisNode, "resultType", true) != null) && !(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(thisNode, "resultType", true), "jetbrains.mps.baseLanguage.structure.VoidType"))) {
      sb.append("_return");
    } else
    {
      sb.append("_void");
    }
    sb.append("_P").append(SLinkOperations.getCount(thisNode, "parameterType"));
    sb.append("_E").append(SLinkOperations.getCount(thisNode, "throwsType"));
    /*
      int idx = paramTypes.length - SLinkOperations.getCount(thisNode, "parameterType");
      if (idx < 0) {
        return "???too many parameters in function type???";
      }
      String sep = "_from";
      for(SNode t : SLinkOperations.getTargets(thisNode, "parameterType", true)) {
        sb.append(sep);
        sep = "_and";
        if (idx >= paramTypes.length) {
          sb.append("_not_enough_type_variables");
          break;
        }
        sb.append(paramTypes[idx]);
        idx = idx + 1;
      }
    */
    return sb.toString();
  }

  public static String call_getSignature_1213877405047(SNode thisNode) {
    if (thisNode == null) {
      return "???invalid signature???";
    }
    StringBuffer buf = new StringBuffer();
    FunctionType_Behavior.call_fillTypeSignature_1213877405099(thisNode, SLinkOperations.getTarget(thisNode, "resultType", true), buf);
    String sep = "_from";
    for(SNode pt : SLinkOperations.getTargets(thisNode, "parameterType", true)) {
      buf.append(sep);
      sep = "_and";
      FunctionType_Behavior.call_fillTypeSignature_1213877405099(thisNode, pt, buf);
    }
    sep = "_throws";
    for(SNode tt : SLinkOperations.getTargets(thisNode, "throwsType", true)) {
      buf.append(sep);
      sep = "_and";
      FunctionType_Behavior.call_fillTypeSignature_1213877405099(thisNode, tt, buf);
    }
    return buf.toString();
  }

  public static void call_fillTypeSignature_1213877405099(SNode thisNode, SNode t, StringBuffer buf) {
    buf.append("_");
    if (SNodeOperations.isInstanceOf(t, "jetbrains.mps.closures.structure.FunctionType")) {
      buf.append(FunctionType_Behavior.call_getSignature_1213877405047(t));
      return;
    }
    SNode ct = TypeChecker.getInstance().getRuntimeSupport().coerce(t, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.ClassifierType"), true);
    String pres;
    if ((ct != null)) {
      String[] nn = SPropertyOperations.getString(SLinkOperations.getTarget(ct, "classifier", false), "name").split("\\\\.");
      buf.append(nn[nn.length - 1]);
    } else
    if (SConceptPropertyOperations.getString(t, "alias") != null) {
      buf.append(SConceptPropertyOperations.getString(t, "alias"));
    } else
    if ((pres = BaseConcept_Behavior.call_getPresentation_1213877396640(t)) != null) {
      buf.append(pres);
    } else
    {
      buf.append(SPropertyOperations.getString(SNodeOperations.getConceptDeclaration(t), "name"));
    }
    // TODO: sort children by role
    List<SNode> paramTypes = new ArrayList<SNode>();
    for(SNode c : SNodeOperations.getChildren(t)) {
      if (SNodeOperations.isInstanceOf(c, "jetbrains.mps.baseLanguage.structure.Type")) {
        paramTypes.add(c);
      }
    }
    String sep = "_of";
    for(SNode pt : paramTypes) {
      buf.append(sep);
      sep = "_x";
      FunctionType_Behavior.call_fillTypeSignature_1213877405099(thisNode, pt, buf);
    }
  }

  public static SNode call_getNormalizedReturnType_1213877405252(SNode thisNode) {
    return ClassifierTypeUtil.getTypeCoercedToClassifierType(SLinkOperations.getTarget(thisNode, "resultType", true));
  }

  public static SNode call_getNormalizedSequenceParameterReturnType_1213877405260(SNode thisNode) {
    {
      IMatchingPattern pattern_0 = HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.collections.structure.SequenceType");
      SNode coercedNode_0 = TypeChecker.getInstance().getRuntimeSupport().coerce(SLinkOperations.getTarget(thisNode, "resultType", true), pattern_0);
      if (coercedNode_0 != null) {
        return ClassifierTypeUtil.getTypeCoercedToClassifierType(SLinkOperations.getTarget(coercedNode_0, "elementType", true));
      }
    }
    return null;
  }

  public static List<SNode> call_getNormalizedParameterTypes_1213877405276(SNode thisNode) {
    List<SNode> resList = new ArrayList<SNode>();
    List<SNode> paramTypes = SLinkOperations.getTargets(thisNode, "parameterType", true);
    int idx = 0;
    for(SNode p : paramTypes) {
      SNode pct = ClassifierTypeUtil.getTypeCoercedToClassifierType(p);
      resList.add(ClassifierTypeUtil.copyTypeRecursively(pct));
      idx = idx + 1;
    }
    return resList;
  }

}
