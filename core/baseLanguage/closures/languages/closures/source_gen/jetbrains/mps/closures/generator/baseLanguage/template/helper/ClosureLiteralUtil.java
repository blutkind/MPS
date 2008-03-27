package jetbrains.mps.closures.generator.baseLanguage.template.helper;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.generator.template.ITemplateGenerator;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import java.util.Map;
import jetbrains.mps.closures.constraints.FunctionType_Behavior;
import jetbrains.mps.generator.JavaNameUtil;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SModelOperations;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedList;
import jetbrains.mps.core.constraints.BaseConcept_Behavior;
import java.util.HashMap;

public class ClosureLiteralUtil {

  public static boolean hasYieldStatement(SNode cl) {
    for(SNode desc : SNodeOperations.getDescendants(cl, null, false)) {
      if (SNodeOperations.isInstanceOf(desc, "jetbrains.mps.closures.structure.YieldStatement")) {
        if (cl == SNodeOperations.getAncestor(desc, "jetbrains.mps.closures.structure.ClosureLiteral", false, false)) {
          return true;
        }
      }
    }
    return false;
  }

  public static List<SNode> collectNonFinalVariableDeclarations(SNode cl) {
    List<SNode> vrefs = new ArrayList<SNode>();
    for(SNode desc : SNodeOperations.getDescendants(cl, null, false)) {
      if (SNodeOperations.isInstanceOf(desc, "jetbrains.mps.baseLanguage.structure.VariableReference") && cl == SNodeOperations.getAncestor(desc, "jetbrains.mps.closures.structure.ClosureLiteral", false, false)) {
        SNode vd = SLinkOperations.getTarget(desc, "variableDeclaration", false);
        if (cl != SNodeOperations.getAncestor(vd, "jetbrains.mps.closures.structure.ClosureLiteral", false, false)) {
          if (!(SPropertyOperations.getBoolean(vd, "isFinal")) && (SNodeOperations.isInstanceOf(vd, "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration") || SNodeOperations.isInstanceOf(vd, "jetbrains.mps.baseLanguage.structure.ParameterDeclaration"))) {
            vrefs.add(SLinkOperations.getTarget(desc, "variableDeclaration", false));
          }
        }
      }
    }
    return vrefs;
  }

  public static void addAdaptableClosureLiteralTarget(SNode literal, SNode target, ITemplateGenerator generator) {
    SNode trgCopy = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ClassifierType", null);
    SLinkOperations.setTarget(trgCopy, "classifier", SLinkOperations.getTarget(target, "classifier", false), false);
    ClosureLiteralUtil.matchParameters(target, trgCopy, TypeChecker.getInstance().getTypeOf(literal));
    generator.getGeneratorSessionContext().putSessionObject("literal_target_" + ((SNode)literal).getId(), trgCopy);
    ((SNode)trgCopy).putUserObject("literal", literal);
  }

  public static SNode getAdaptableClosureLiteralTarget(SNode literal, ITemplateGenerator generator) {
    return (SNode)generator.getGeneratorSessionContext().getSessionObject("literal_target_" + ((SNode)literal).getId());
  }

  private static void matchParameters(SNode origCT, SNode ctNoParams, SNode ft) {
    Map<String, SNode> map = null;
    List<SNode> imds = SLinkOperations.getTargets(SLinkOperations.getTarget(ctNoParams, "classifier", false), "method", true);
    SNode absRetCT = null;
    if (imds.size() > 0) {
      SNode method = imds.get(0);
      if ((SLinkOperations.getTarget(method, "returnType", true) != null) && !(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(method, "returnType", true), "jetbrains.mps.baseLanguage.structure.VoidType"))) {
        /*
          map = ClosureLiteralUtil.matchType(SLinkOperations.getTarget(method, "returnType", true), FunctionType_Behavior.call_getNormalizedReturnType_1201526153722(ft), map);
        */
        map = ClosureLiteralUtil.matchReturnType(SLinkOperations.getTarget(method, "returnType", true), FunctionType_Behavior.call_getNormalizedReturnType_1201526153722(ft), map);
        if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(method, "returnType", true), "jetbrains.mps.baseLanguage.structure.ClassifierType")) {
          absRetCT = SNodeOperations.copyNode(SLinkOperations.getTarget(method, "returnType", true));
        }
      }
      List<SNode> ptypes = FunctionType_Behavior.call_getNormalizedParameterTypes_1201526194584(ft);
      int idx = 0;
      for(SNode pd : SLinkOperations.getTargets(method, "parameter", true)) {
        map = ClosureLiteralUtil.matchType(SLinkOperations.getTarget(pd, "type", true), ptypes.get(idx), map);
        idx = idx + 1;
      }
    }
    ((SNode)ctNoParams).putUserObject("typeMap", map);
    if ((absRetCT != null)) {
      SNode ftResCT = FunctionType_Behavior.call_getNormalizedReturnType_1201526153722(ft);
      String adapterName = JavaNameUtil.shortName(SPropertyOperations.getString(SLinkOperations.getTarget(absRetCT, "classifier", false), "name")) + JavaNameUtil.shortName(SPropertyOperations.getString(SLinkOperations.getTarget(ftResCT, "classifier", false), "name")) + "Adapter";
      for(SNode cls : SModelOperations.getNodes(SNodeOperations.getModel(SLinkOperations.getTarget(absRetCT, "classifier", false)), "jetbrains.mps.baseLanguage.structure.Classifier")) {
        if (adapterName.equals(JavaNameUtil.shortName(SPropertyOperations.getString(cls, "name")))) {
          SNode newRetCT = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ClassifierType", null);
          SLinkOperations.setTarget(newRetCT, "classifier", cls, false);
          /*
            for(SNode tvar : SLinkOperations.getTargets(SLinkOperations.getTarget(absRetCT, "classifier", false), "typeVariableDeclaration", true)) {
              SLinkOperations.addChild(newRetCT, "parameter", map.get(SPropertyOperations.getString(tvar, "name")));
            }
          */
          ((SNode)ctNoParams).putUserObject("returnType", newRetCT);
          break;
        }
      }
    }
    /*
      for(SNode tvar : SLinkOperations.getTargets(SLinkOperations.getTarget(ctNoParams, "classifier", false), "typeVariableDeclaration", true)) {
        SLinkOperations.addChild(ctNoParams, "parameter", map.get(SPropertyOperations.getString(tvar, "name")));
      }
    */
    List<SNode> varDecls = SLinkOperations.getTargets(SLinkOperations.getTarget(origCT, "classifier", false), "typeVariableDeclaration", true);
    int idx = 0;
    for(SNode p : SLinkOperations.getTargets(origCT, "parameter", true)) {
      if (SNodeOperations.isInstanceOf(p, "jetbrains.mps.baseLanguage.structure.UpperBoundType") || SNodeOperations.isInstanceOf(p, "jetbrains.mps.baseLanguage.structure.LowerBoundType")) {
        p = (SNodeOperations.isInstanceOf(p, "jetbrains.mps.baseLanguage.structure.UpperBoundType") ?
          SLinkOperations.getTarget(p, "bound", true) :
          SLinkOperations.getTarget(p, "bound", true)
        );
      }
      if (SNodeOperations.isInstanceOf(p, "jetbrains.mps.baseLanguage.structure.TypeVariableReference")) {
        if (idx < varDecls.size()) {
          SNode tvd = varDecls.get(idx);
          SLinkOperations.addChild(ctNoParams, "parameter", map.get(SPropertyOperations.getString(tvd, "name")));
        }
      } else
      {
        SLinkOperations.addChild(ctNoParams, "parameter", SNodeOperations.copyNode(p));
      }
      idx = idx + 1;
    }
  }

  public static Map<String, SNode> matchReturnType(SNode absType, SNode realType, Map<String, SNode> map) {
    Set<String> visited = new HashSet<String>();
    LinkedList<SNode> queue = new LinkedList<SNode>();
    queue.addLast(realType);
    while(!(queue.isEmpty())) {
      SNode candidate = queue.removeFirst();
      if (!(visited.contains(BaseConcept_Behavior.call_getPresentation_1180102203531(candidate)))) {
        if (SNodeOperations.isInstanceOf(absType, "jetbrains.mps.baseLanguage.structure.TypeVariableReference") || (SNodeOperations.getConceptDeclaration(absType) == SNodeOperations.getConceptDeclaration(candidate) && (!(SNodeOperations.isInstanceOf(absType, "jetbrains.mps.baseLanguage.structure.ClassifierType")) || SLinkOperations.getTarget(absType, "classifier", false) == SLinkOperations.getTarget(candidate, "classifier", false)))) {
          map = ClosureLiteralUtil.matchType(absType, candidate, map);
          return map;
        }
        visited.add(BaseConcept_Behavior.call_getPresentation_1180102203531(candidate));
        for(SNode superType : TypeChecker.getInstance().getSubtypingManager().collectImmediateSupertypes(candidate)) {
          queue.addLast(superType);
        }
      }
    }
    return map;
  }

  private static Map<String, SNode> matchType(SNode absType, SNode realType, Map<String, SNode> map) {
    if (SNodeOperations.isInstanceOf(absType, "jetbrains.mps.baseLanguage.structure.TypeVariableReference")) {
      (map = ClosureLiteralUtil.getMap(map)).put(SPropertyOperations.getString(SLinkOperations.getTarget(absType, "typeVariableDeclaration", false), "name"), realType);
    } else
    if (SNodeOperations.isInstanceOf(absType, "jetbrains.mps.baseLanguage.structure.ClassifierType") && SNodeOperations.isInstanceOf(realType, "jetbrains.mps.baseLanguage.structure.ClassifierType") && SLinkOperations.getTarget(absType, "classifier", false) == SLinkOperations.getTarget(realType, "classifier", false)) {
      int idx = 0;
      List<SNode> mptypes = SLinkOperations.getTargets(absType, "parameter", true);
      List<SNode> rptypes = SLinkOperations.getTargets(realType, "parameter", true);
      for(int i = 0 ; i < mptypes.size() && i < rptypes.size() ; i = i + 1) {
        map = ClosureLiteralUtil.matchType(mptypes.get(i), rptypes.get(i), ClosureLiteralUtil.getMap(map));
      }
    }
    return map;
  }

  private static Map<String, SNode> getMap(Map<String, SNode> map) {
    if (map == null) {
      map = new HashMap<String, SNode>();
    }
    return map;
  }

}
