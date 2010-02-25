package jetbrains.mps.baseLanguage.closures.generator.baseLanguage.template.helper;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.closures.behavior.FunctionType_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.generator.template.TemplateQueryContext;
import jetbrains.mps.generator.template.ITemplateGenerator;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.baseLanguage.closures.constraints.ClassifierTypeUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import java.util.Comparator;
import java.text.Collator;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.closures.util.Constants;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import java.util.Map;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class FunctionTypeUtil {
  public static String getRuntimeSignature(SNode ft) {
    return FunctionType_Behavior.call_getRuntimeSignature_1213877404927(ft);
  }

  public static String getAdapterName(SNode adaptable, SNode target) {
    String aname = SPropertyOperations.getString(adaptable, "name");
    int aldidx = aname.lastIndexOf(".");
    aname = (aldidx >= 0 ?
      aname.substring(aldidx + 1) :
      aname
    );
    String tname = SPropertyOperations.getString(target, "name");
    int tldidx = tname.lastIndexOf(".");
    tname = (tldidx >= 0 ?
      tname.substring(tldidx + 1) :
      tname
    );
    return aname + "_to_" + tname + "_adapter";
  }

  public static SNode getAdaptableTarget(TemplateQueryContext genContext, SNode expr, ITemplateGenerator generator) {
    SNode ntype = (SNodeOperations.isInstanceOf(TypeChecker.getInstance().getTypeOf(expr), "jetbrains.mps.baseLanguage.closures.structure.FunctionType") ?
      ClassifierTypeUtil.getDeclarationClassifierType(TypeChecker.getInstance().getTypeOf(expr)) :
      null
    );
    ntype = (ntype == null ?
      TypeChecker.getInstance().getRuntimeSupport().coerce_(TypeChecker.getInstance().getTypeOf(expr), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.ClassifierType"), true) :
      ntype
    );
    assert ntype != null;
    List<SNode> targets = FunctionTypeUtil.getAdaptableClassifierTargets(SLinkOperations.getTarget(SNodeOperations.as(ntype, "jetbrains.mps.baseLanguage.structure.ClassifierType"), "classifier", false), generator);
    String trgFQname = (String) Values.PREP_DATA.get(genContext, expr);
    SNode trg = null;
    for (SNode ct : targets) {
      if (trgFQname.equals(INamedConcept_Behavior.call_getFqName_1213877404258(ct))) {
        trg = ct;
        break;
      }
    }
    return trg;
  }

  public static List<SNode> getAllFunctionTypes(SModel sourceModel) {
    List<SNode> cls = SModelOperations.getNodes(sourceModel, "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral");
    List<SNode> typesList = ListSequence.fromList(new ArrayList<SNode>());
    for (SNode cl : cls) {
      ListSequence.fromList(typesList).addElement(TypeChecker.getInstance().getTypeOf(cl));
    }
    List<SNode> funTypes = SModelOperations.getNodes(sourceModel, "jetbrains.mps.baseLanguage.closures.structure.FunctionType");
    ListSequence.fromList(typesList).addSequence(ListSequence.fromList(funTypes));
    ListSequence.fromList(typesList).sort(new Comparator<SNode>() {
      public int compare(SNode a, SNode b) {
        return Collator.getInstance().compare(FunctionType_Behavior.call_getSignature_1213877405047(SNodeOperations.cast(a, "jetbrains.mps.baseLanguage.closures.structure.FunctionType")), FunctionType_Behavior.call_getSignature_1213877405047(SNodeOperations.cast(b, "jetbrains.mps.baseLanguage.closures.structure.FunctionType")));
      }
    }, true);
    SNode prev = null;
    for (Iterator<SNode> it = ListSequence.fromList(typesList).iterator(); it.hasNext();) {
      SNode next = it.next();
      if (prev != null) {
        if (Collator.getInstance().compare(FunctionType_Behavior.call_getSignature_1213877405047(SNodeOperations.cast(prev, "jetbrains.mps.baseLanguage.closures.structure.FunctionType")), FunctionType_Behavior.call_getSignature_1213877405047(SNodeOperations.cast(next, "jetbrains.mps.baseLanguage.closures.structure.FunctionType"))) == 0) {
          it.remove();
          continue;
        }
      }
      prev = next;
    }
    return typesList;
  }

  public static SNode unmeet(SNode possiblyMeet) {
    SNode tmp = possiblyMeet;
with_meet:
    while (SNodeOperations.isInstanceOf(tmp, "jetbrains.mps.lang.typesystem.structure.MeetType")) {
      for (SNode arg : SLinkOperations.getTargets(SNodeOperations.cast(tmp, "jetbrains.mps.lang.typesystem.structure.MeetType"), "argument", true)) {
        if (!(SNodeOperations.isInstanceOf(arg, "jetbrains.mps.baseLanguage.structure.VoidType"))) {
          tmp = arg;
          continue with_meet;
        }
      }
      return new FunctionTypeUtil.QuotationClass_5316_l523emne66df().createNode();
    }
    if (SNodeOperations.isInstanceOf(tmp, "jetbrains.mps.baseLanguage.structure.ClassifierType")) {
      List<SNode> params = SLinkOperations.getTargets(SNodeOperations.cast(tmp, "jetbrains.mps.baseLanguage.structure.ClassifierType"), "parameter", true);
      for (SNode p : params) {
        SNode up = unmeet(p);
        if (up != p) {
          SNodeOperations.replaceWithAnother(p, up);
        }
      }
    }
    return tmp;
  }

  public static SNode unmeetRecursively(SNode nodeWithMeetDescendants) {
    for (SNode dsc : SNodeOperations.getDescendants(nodeWithMeetDescendants, null, false, new String[]{})) {
      if (SNodeOperations.isInstanceOf(dsc, "jetbrains.mps.lang.typesystem.structure.MeetType")) {
        SNodeOperations.replaceWithAnother(dsc, SNodeOperations.copyNode(unmeet(dsc)));
      }
    }
    return nodeWithMeetDescendants;
  }

  public static void prepAdaptations(TemplateQueryContext genContext, SNode ltype, SNode rexpr) {
    SNode lCType = (SNodeOperations.isInstanceOf(ltype, "jetbrains.mps.baseLanguage.structure.ClassifierType") ?
      SNodeOperations.cast(ltype, "jetbrains.mps.baseLanguage.structure.ClassifierType") :
      null
    );
    SNode lFType = (SNodeOperations.isInstanceOf(ltype, "jetbrains.mps.baseLanguage.closures.structure.FunctionType") ?
      SNodeOperations.cast(ltype, "jetbrains.mps.baseLanguage.closures.structure.FunctionType") :
      null
    );
    if ((lFType == null) && (lCType == null)) {
      return;
    }
    if ((lCType != null) && !(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(lCType, "classifier", false), "jetbrains.mps.baseLanguage.structure.Interface"))) {
      return;
    }
    if (Constants.ONLY_CLOSURE_LITERAL_AS_FUNCTION_TYPE) {
      //  TEMP HACK: proceed only if the "right" expression is a ClosureLiteral, balk otherwise 
      //  This may cause unexpected results, so please disable in case of difficulties generating some code 
      if (!(SNodeOperations.isInstanceOf(rexpr, "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral"))) {
        return;
      }
    }
    SNode rtype = TypeChecker.getInstance().getTypeOf(rexpr);
    SNode rFType = (SNodeOperations.isInstanceOf(rtype, "jetbrains.mps.baseLanguage.closures.structure.FunctionType") ?
      SNodeOperations.cast(rtype, "jetbrains.mps.baseLanguage.closures.structure.FunctionType") :
      null
    );
    SNode rCType = (SNodeOperations.isInstanceOf(rtype, "jetbrains.mps.baseLanguage.structure.ClassifierType") ?
      SNodeOperations.cast(rtype, "jetbrains.mps.baseLanguage.structure.ClassifierType") :
      null
    );

    if ((lCType != null) && (rFType != null)) {
      if (SNodeOperations.isInstanceOf(rexpr, "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral") && (!(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(TypeChecker.getInstance().getRuntimeSupport().coerce_(lCType, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.closures.structure.FunctionType"), true), "resultType", true), "jetbrains.mps.baseLanguage.structure.VoidType")) || SNodeOperations.isInstanceOf(SLinkOperations.getTarget(rFType, "resultType", true), "jetbrains.mps.baseLanguage.structure.VoidType") || ListSequence.fromList(SNodeOperations.getDescendants(SLinkOperations.getTarget(SNodeOperations.cast(rexpr, "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral"), "body", true), "jetbrains.mps.baseLanguage.structure.ReturnStatement", false, new String[]{})).all(new IWhereFilter<SNode>() {
        public boolean accept(SNode rs) {
          return (SLinkOperations.getTarget(rs, "expression", true) == null);
        }
      }))) {
        ClosureLiteralUtil.addAdaptableClosureLiteralTarget(genContext, SNodeOperations.cast(rexpr, "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral"), lCType);
      } else {
        FunctionTypeUtil.addAdaptableClassifierTypeTarget(genContext, ClassifierTypeUtil.getDeclarationClassifierType(rFType), lCType);
        Values.PREP_DATA.set(genContext, rexpr, INamedConcept_Behavior.call_getFqName_1213877404258(SLinkOperations.getTarget(lCType, "classifier", false)));
      }
    } else
    if ((lFType != null) && (rCType != null)) {
      FunctionTypeUtil.addAdaptableClassifierTypeTarget(genContext, rCType, ClassifierTypeUtil.getDeclarationClassifierType(lFType));
      Values.PREP_DATA.set(genContext, rexpr, INamedConcept_Behavior.call_getFqName_1213877404258(SLinkOperations.getTarget(ClassifierTypeUtil.getDeclarationClassifierType(lFType), "classifier", false)));
    } else
    if ((lFType != null) && (rFType != null)) {
      if (SNodeOperations.isInstanceOf(rexpr, "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral") && (!(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(lFType, "resultType", true), "jetbrains.mps.baseLanguage.structure.VoidType")) || SNodeOperations.isInstanceOf(SLinkOperations.getTarget(rFType, "resultType", true), "jetbrains.mps.baseLanguage.structure.VoidType") || ListSequence.fromList(SNodeOperations.getDescendants(SLinkOperations.getTarget(SNodeOperations.cast(rexpr, "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral"), "body", true), "jetbrains.mps.baseLanguage.structure.ReturnStatement", false, new String[]{})).all(new IWhereFilter<SNode>() {
        public boolean accept(SNode rs) {
          return (SLinkOperations.getTarget(rs, "expression", true) == null);
        }
      }))) {
        ClosureLiteralUtil.addAdaptableClosureLiteralTarget(genContext, SNodeOperations.cast(rexpr, "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral"), ClassifierTypeUtil.getClassifierType(lFType, SLinkOperations.getTargets(rFType, "parameterType", true)));
      } else if (SNodeOperations.isInstanceOf(rexpr, "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral") || ListSequence.fromList(SLinkOperations.getTargets(lFType, "throwsType", true)).count() != ListSequence.fromList(SLinkOperations.getTargets(rFType, "throwsType", true)).count()) {
        FunctionTypeUtil.addAdaptableClassifierTypeTarget(genContext, ClassifierTypeUtil.getDeclarationClassifierType(rFType), ClassifierTypeUtil.getDeclarationClassifierType(lFType));
        Values.PREP_DATA.set(genContext, rexpr, INamedConcept_Behavior.call_getFqName_1213877404258(SLinkOperations.getTarget(ClassifierTypeUtil.getDeclarationClassifierType(lFType), "classifier", false)));
      }
    }
  }

  public static void addAdaptableClassifierTypeTarget(TemplateQueryContext genContext, SNode adaptable, SNode target) {
    List<SNode> allAdaptable = getAllAdaptableClassifiers(genContext);
    if (allAdaptable == null) {
      allAdaptable = ListSequence.fromList(new ArrayList<SNode>());
      genContext.putStepObject(Keys.ALL_NEEDS_ADAPTED, allAdaptable);
    }
    if (!(ListSequence.fromList(allAdaptable).contains(SLinkOperations.getTarget(adaptable, "classifier", false)))) {
      ListSequence.fromList(allAdaptable).addElement(SLinkOperations.getTarget(adaptable, "classifier", false));
    }
    List<SNode> trgList = (List<SNode>) genContext.getStepObject(Keys.NEEDS_ADAPTER.compose(INamedConcept_Behavior.call_getFqName_1213877404258(SLinkOperations.getTarget(adaptable, "classifier", false))));
    if (trgList == null) {
      trgList = ListSequence.fromList(new ArrayList<SNode>());
      genContext.putStepObject(Keys.NEEDS_ADAPTER.compose(INamedConcept_Behavior.call_getFqName_1213877404258(SLinkOperations.getTarget(adaptable, "classifier", false))), trgList);
    }
    boolean hasOneAlready = false;
    for (SNode ct : trgList) {
      if (INamedConcept_Behavior.call_getFqName_1213877404258(SLinkOperations.getTarget(target, "classifier", false)).equals(INamedConcept_Behavior.call_getFqName_1213877404258(ct))) {
        hasOneAlready = true;
        break;
      }
    }
    if (!(hasOneAlready)) {
      ListSequence.fromList(trgList).addElement(SLinkOperations.getTarget(target, "classifier", false));
      Values.ADAPTABLE.set(genContext, SLinkOperations.getTarget(target, "classifier", false), SLinkOperations.getTarget(adaptable, "classifier", false));
    }
  }

  public static List<SNode> getAllAdaptableClassifiers(TemplateQueryContext genContext) {
    return (List<SNode>) genContext.getStepObject(Keys.ALL_NEEDS_ADAPTED);
  }

  public static List<SNode> getAdaptableClassifierTargets(SNode adaptable, ITemplateGenerator generator) {
    return (List<SNode>) generator.getGeneratorSessionContext().getStepObject(Keys.NEEDS_ADAPTER.compose(INamedConcept_Behavior.call_getFqName_1213877404258(adaptable)));
  }

  public static Map<SNode, SNode> mapAdaptableTargetTVDs(SNode adaptable, SNode target) {
    Map<SNode, SNode> resMap = MapSequence.fromMap(new HashMap<SNode, SNode>());
    SNode adMethod = ListSequence.fromList(SLinkOperations.getTargets(adaptable, "method", true)).getElement(0);
    SNode trgMethod = ListSequence.fromList(SLinkOperations.getTargets(target, "method", true)).getElement(0);
    doMapTVDS(resMap, SLinkOperations.getTarget(adMethod, "returnType", true), SLinkOperations.getTarget(trgMethod, "returnType", true));
    {
      SNode adParm;
      SNode trgParm;
      Iterator<SNode> adParm_iterator = ListSequence.fromList(SLinkOperations.getTargets(adMethod, "parameter", true)).iterator();
      Iterator<SNode> trgParm_iterator = ListSequence.fromList(SLinkOperations.getTargets(trgMethod, "parameter", true)).iterator();
      while (true) {
        if (!(adParm_iterator.hasNext())) {
          break;
        }
        if (!(trgParm_iterator.hasNext())) {
          break;
        }
        adParm = adParm_iterator.next();
        trgParm = trgParm_iterator.next();
        doMapTVDS(resMap, SLinkOperations.getTarget(adParm, "type", true), SLinkOperations.getTarget(trgParm, "type", true));
      }
    }
    return resMap;
  }

  private static void doMapTVDS(Map<SNode, SNode> theMap, SNode adType, SNode trgType) {
    SNode adTVD = SLinkOperations.getTarget(SNodeOperations.as(adType, "jetbrains.mps.baseLanguage.structure.TypeVariableReference"), "typeVariableDeclaration", false);
    SNode trgTVD = SLinkOperations.getTarget(SNodeOperations.as(trgType, "jetbrains.mps.baseLanguage.structure.TypeVariableReference"), "typeVariableDeclaration", false);
    if ((adTVD != null) && (trgTVD != null)) {
      MapSequence.fromMap(theMap).put(adTVD, trgTVD);
    }
  }

  public static class QuotationClass_5316_l523emne66df {
    public QuotationClass_5316_l523emne66df() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_5316_fsez99r6 = null;
      {
        quotedNode_5316_fsez99r6 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.VoidType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_5316_fsez99r6 = quotedNode_5316_fsez99r6;
        result = quotedNode1_5316_fsez99r6;
      }
      return result;
    }
  }
}
