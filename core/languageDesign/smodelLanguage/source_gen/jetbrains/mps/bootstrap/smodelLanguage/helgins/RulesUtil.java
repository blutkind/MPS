package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.dependencies.InferenceMethod;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.constraints.SNodeOperation_Behavior;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptPropertyOperations;
import jetbrains.mps.bootstrap.helgins.runtime.HUtil;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.DataTypeUtil;
import jetbrains.mps.bootstrap.structureLanguage.structure.DataTypeDeclaration;
import jetbrains.mps.util.NameUtil;
import java.util.List;
import jetbrains.mps.baseLanguage.ext.collections.internal.ICursor;
import jetbrains.mps.baseLanguage.ext.collections.internal.CursorFactory;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;

public class RulesUtil {

  @InferenceMethod()
  public static void checkAppliedCorrectly_generic(final SNode op) {
    if(SConceptOperations.isExactly(SNodeOperations.getConceptDeclaration(op), "jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperation")) {
      // don't check - it is red anyway
      return;
    }
    final SNode leftExpression = SNodeOperation_Behavior.call_getLeftExpression_1200920411564(op);
    final SNode LeftType_typevar_1186058295229 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable(false);
    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType_typevar_1186058295229), TypeChecker.getInstance().getRuntimeSupport().typeOf(leftExpression, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186058318393", false), leftExpression, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186058309840");
    TypeChecker.getInstance().getRuntimeSupport().whenConcrete(TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType_typevar_1186058295229), new Runnable() {

      public void run() {
        String applicableErrorString = "operation is not applicable to expression";
        boolean isGood = false;
        if(SConceptPropertyOperations.getBoolean(op, "applicable_to_model")) {
          if(TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType_typevar_1186058295229), new QuotationClass_40().createNode(), false, false)) {
            isGood = true;
          }
        }
        if(SConceptPropertyOperations.getBoolean(op, "applicable_to_concept")) {
          if(TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType_typevar_1186058295229), new QuotationClass_41().createNode(), false, false)) {
            isGood = true;
          }
        }
        if(SConceptPropertyOperations.getBoolean(op, "applicable_to_node")) {
          if(TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType_typevar_1186058295229), new QuotationClass_42().createNode(), false, false)) {
            isGood = true;
          }
        }
        // =========== new
        if(SConceptPropertyOperations.getBoolean(op, "applicable_to_link")) {
          SNode linkAccessT = TypeChecker.getInstance().getRuntimeSupport().coerce(TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType_typevar_1186058295229), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.bootstrap.smodelLanguage.structure._LinkAccessT"), false);
          if(linkAccessT != null) {
            isGood = SPropertyOperations.getBoolean(linkAccessT, "isSingularCradinality");
          }
        }
        if(SConceptPropertyOperations.getBoolean(op, "applicable_to_linkList")) {
          SNode linkAccessT = TypeChecker.getInstance().getRuntimeSupport().coerce(TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType_typevar_1186058295229), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.bootstrap.smodelLanguage.structure._LinkAccessT"), false);
          if(linkAccessT != null) {
            isGood = !(SPropertyOperations.getBoolean(linkAccessT, "isSingularCradinality"));
          }
        }
        // ===========
        SNode leftOperation = SNodeOperation_Behavior.call_getLeftExpressionOperation_1203459446846(op);
        if(SConceptPropertyOperations.getBoolean(op, "applicable_to_link")) {
          if(SConceptOperations.isExactly(SNodeOperations.getConceptDeclaration(leftOperation), "jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess")) {
            isGood = true;
          }
        }
        if(SConceptPropertyOperations.getBoolean(op, "applicable_to_linkList")) {
          if(SConceptOperations.isExactly(SNodeOperations.getConceptDeclaration(leftOperation), "jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess")) {
            isGood = true;
          }
        }
        if(SConceptPropertyOperations.getBoolean(op, "applicable_to_simple_property")) {
          if(SConceptOperations.isExactly(SNodeOperations.getConceptDeclaration(leftOperation), "jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess")) {
            SNode propertyDecl = SLinkOperations.getTarget(leftOperation, "property", false);
            if(DataTypeUtil.isSimple(((DataTypeDeclaration)SNodeOperations.getAdapter(SLinkOperations.getTarget(propertyDecl, "dataType", false))))) {
              isGood = true;
            }
          }
        }
        if(SConceptPropertyOperations.getBoolean(op, "applicable_to_enum_property")) {
          if(SConceptOperations.isExactly(SNodeOperations.getConceptDeclaration(leftOperation), "jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess")) {
            SNode propertyDecl = SLinkOperations.getTarget(leftOperation, "property", false);
            if(DataTypeUtil.isEnum(((DataTypeDeclaration)SNodeOperations.getAdapter(SLinkOperations.getTarget(propertyDecl, "dataType", false))))) {
              isGood = true;
            }
          }
        }
        if(SConceptPropertyOperations.getBoolean(op, "applicable_to_concept_property")) {
          if(SConceptOperations.isExactly(SNodeOperations.getConceptDeclaration(leftOperation), "jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptPropertyAccess")) {
            isGood = true;
          }
        }
        if(!(isGood)) {
          TypeChecker.getInstance().reportTypeError(op, applicableErrorString, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186067417054");
        }
      }

    }, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186065634833");
  }

  @InferenceMethod()
  public static void checkAppliedTo_LinkListAccess_aggregation(final SNode op) {
    // expect access to an aggregation link with plural cardinality
    // ------------------- new (duplicates checkAppliedCorrectly_generic)
    SNode leftExpression = SNodeOperation_Behavior.call_getLeftExpression_1200920411564(op);
    final SNode LeftType_typevar_1205267224534 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable(false);
    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType_typevar_1205267224534), TypeChecker.getInstance().getRuntimeSupport().typeOf(leftExpression, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1205267224539", false), leftExpression, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1205267224535");
    TypeChecker.getInstance().getRuntimeSupport().whenConcrete(TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType_typevar_1205267224534), new Runnable() {

      public void run() {
        boolean isGood = false;
        SNode linkAccessT = TypeChecker.getInstance().getRuntimeSupport().coerce(TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType_typevar_1205267224534), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.bootstrap.smodelLanguage.structure._LinkAccessT"), false);
        if(linkAccessT != null) {
          if(!(SPropertyOperations.getBoolean(linkAccessT, "isSingularCradinality"))) {
            isGood = true;
          }
        }
        if(!(isGood)) {
          SNode leftOperation = SNodeOperation_Behavior.call_getLeftExpressionOperation_1203459446846(op);
          if(SConceptOperations.isExactly(SNodeOperations.getConceptDeclaration(leftOperation), "jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess")) {
            SNode link = SLinkOperations.getTarget(leftOperation, "link", false);
            if(SPropertyOperations.hasValue(link, "metaClass", "aggregation", null)) {
              isGood = true;
            }
          }
        }
        // ----
        if(!(isGood)) {
          TypeChecker.getInstance().reportTypeError(op, "operation is only applicable to aggregation-link-list-access", "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1205271287931");
        }
      }

    }, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1205267224541");
  }

  @InferenceMethod()
  public static boolean checkAppliedTo_LinkAccess_aggregation(final SNode op) {
    // expect access to an aggregation link with singular cardinality
    // ------------------- new (duplicates checkAppliedCorrectly_generic)
    SNode leftExpression = SNodeOperation_Behavior.call_getLeftExpression_1200920411564(op);
    final SNode LeftType_typevar_1205267007210 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable(false);
    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType_typevar_1205267007210), TypeChecker.getInstance().getRuntimeSupport().typeOf(leftExpression, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1205267007215", false), leftExpression, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1205267007211");
    final boolean[] ok = new boolean[1];
    TypeChecker.getInstance().getRuntimeSupport().whenConcrete(TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType_typevar_1205267007210), new Runnable() {

      public void run() {
        boolean isGood = false;
        SNode linkAccessT = TypeChecker.getInstance().getRuntimeSupport().coerce(TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType_typevar_1205267007210), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.bootstrap.smodelLanguage.structure._LinkAccessT"), false);
        if(linkAccessT != null) {
          if(SPropertyOperations.getBoolean(linkAccessT, "isSingularCradinality")) {
            isGood = true;
          }
        }
        if(!(isGood)) {
          SNode leftOperation = SNodeOperation_Behavior.call_getLeftExpressionOperation_1203459446846(op);
          if(SConceptOperations.isExactly(SNodeOperations.getConceptDeclaration(leftOperation), "jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess")) {
            SNode link = SLinkOperations.getTarget(leftOperation, "link", false);
            if(SPropertyOperations.hasValue(link, "metaClass", "aggregation", null)) {
              isGood = true;
            }
          }
        }
        // ----
        if(!(isGood)) {
          TypeChecker.getInstance().reportTypeError(op, "operation is only applicable to aggregation-link-access", "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1205272067893");
        }
      }

    }, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1205267101146");
    return true;
  }

  public static boolean checkAssignableConcept(SNode fromConcept, SNode toConcept, SNode nodeToReportError, String errorTextPrefix) {
    if(SConceptOperations.isSubConceptOf(fromConcept, NameUtil.nodeFQName(toConcept))) {
      return true;
    }
    TypeChecker.getInstance().reportTypeError(nodeToReportError, "" + errorTextPrefix + "\nexpected: " + SPropertyOperations.getString(toConcept, "name") + "\nwas: " + SPropertyOperations.getString(fromConcept, "name"), "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1179506569646");
    return false;
  }

  @InferenceMethod()
  public static boolean checkOpParameters_generic(SNode op) {
    boolean noProblem = true;
    List<SNode> applicableParmConcepts = SLinkOperations.getConceptLinkTargets(op, "applicableParameter");
    {
      ICursor<SNode> _zCursor3 = CursorFactory.createCursor(SLinkOperations.getTargets(op, "parameter", true));
      try {
        while(_zCursor3.moveToNext()) {
          SNode parm = _zCursor3.getCurrent();
          if(!(SequenceOperations.contains(applicableParmConcepts, SNodeOperations.getConceptDeclaration(parm)))) {
            TypeChecker.getInstance().reportTypeError(parm, "not applicable here", "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1178302007667");
            noProblem = false;
          }
        }
      } finally {
        _zCursor3.release();
      }
    }
    return noProblem;
  }

  @InferenceMethod()
  public static SNode get_inputNodeConcept(SNode op) {
    // todo: just compute type of the expression
    // now: the expression is expected to be SNodeOperationExpression with Link/LinkList access operation
    SNode leftOperation = SNodeOperation_Behavior.call_getLeftExpressionOperation_1203459446846(op);
    if(SNodeOperations.isInstanceOf(leftOperation, "jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess")) {
      return SLinkOperations.getTarget(SLinkOperations.getTarget(leftOperation, "link", false), "target", false);
    }
    if(SNodeOperations.isInstanceOf(leftOperation, "jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess")) {
      return SLinkOperations.getTarget(SLinkOperations.getTarget(leftOperation, "link", false), "target", false);
    }
    // ---
    SNode leftExpression = SNodeOperation_Behavior.call_getLeftExpression_1200920411564(op);
    final SNode Result_typevar_1186062019004 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable(false);
    final SNode LeftType_typevar_1186062031569 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable(false);
    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(leftExpression, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186062039118", true), TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType_typevar_1186062031569), leftExpression, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186062045965");
    TypeChecker.getInstance().getRuntimeSupport().whenConcrete(TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType_typevar_1186062031569), new Runnable() {

      public void run() {
        if(SNodeOperations.isInstanceOf(TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType_typevar_1186062031569), "jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType")) {
          SNode conceptDeclaration = SLinkOperations.getTarget(TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType_typevar_1186062031569), "concept", false);
          if(conceptDeclaration == null) {
            conceptDeclaration = SConceptOperations.findConceptDeclaration("jetbrains.mps.core.structure.BaseConcept");
          }
          TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getEquationManager().getRepresentator(Result_typevar_1186062019004), conceptDeclaration, null, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186062259216");
        } else
        if(SNodeOperations.isInstanceOf(TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType_typevar_1186062031569), "jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptType")) {
          TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getEquationManager().getRepresentator(Result_typevar_1186062019004), SConceptOperations.findConceptDeclaration("jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration"), null, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186062259230");
        }
      }

    }, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186062066737");
    return (SNode)TypeChecker.getInstance().getEquationManager().getRepresentator(Result_typevar_1186062019004);
  }

  @InferenceMethod()
  public static SNode get_inputNodeType(SNode op) {
    SNode inputNodeConcept = RulesUtil.get_inputNodeConcept(op);
    SNode inputNodeType = new QuotationClass_43().createNode(inputNodeConcept);
    return inputNodeType;
  }

  public static SNode get_SNodeType_fromOpParameter(SNode op) {
    SNode type = new QuotationClass_44().createNode();
    SNode parm = SequenceOperations.getFirst(SequenceOperations.where(SLinkOperations.getTargets(op, "parameter", true), new zPredicate(null, null)));
    if(parm != null) {
      SLinkOperations.setTarget(type, "concept", SLinkOperations.getTarget(parm, "concept", false), false);
    }
    return type;
  }

  public static SNode get_SNodeListType_fromOpParameter(SNode op) {
    SNode type = new QuotationClass_45().createNode();
    SNode parm = SequenceOperations.getFirst(SequenceOperations.where(SLinkOperations.getTargets(op, "parameter", true), new zPredicate1(null, null)));
    if(parm != null) {
      SLinkOperations.setTarget(type, "elementConcept", SLinkOperations.getTarget(parm, "concept", false), false);
    }
    return type;
  }

}
