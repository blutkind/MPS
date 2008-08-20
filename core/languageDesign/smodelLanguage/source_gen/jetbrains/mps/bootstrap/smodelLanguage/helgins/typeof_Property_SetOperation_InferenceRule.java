package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.behavior.SNodeOperation_Behavior;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.DataTypeUtil;
import jetbrains.mps.bootstrap.structureLanguage.structure.DataTypeDeclaration;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_Property_SetOperation_InferenceRule implements InferenceRule_Runtime {

  public typeof_Property_SetOperation_InferenceRule() {
  }

  public void applyRule(final SNode op) {
    RulesUtil.checkAppliedCorrectly_generic(op);
    SNode propertyAccessOp = SNodeOperation_Behavior.call_getLeftExpressionOperation_1213877508946(op);
    SNode dataType = SLinkOperations.getTarget(SLinkOperations.getTarget(propertyAccessOp, "property", false), "dataType", false);
    if (!((dataType != null))) {
      TypeChecker.getInstance().reportTypeError(op, "couldn't define accessed property datatype", "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186059295963");
    }
    SNode value = SLinkOperations.getTarget(op, "value", true);
    if ((value != null)) {
      if (DataTypeUtil.isSimpleString(((DataTypeDeclaration)SNodeOperations.getAdapter(dataType)))) {
        {
          SNode _nodeToCheck_1029348928467 = op;
          BaseIntentionProvider intentionProvider = null;
          TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(value, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186059295984", true), new QuotationClass_3().createNode(), _nodeToCheck_1029348928467, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186059295979", false, 0, intentionProvider);
        }
      } else
      if (DataTypeUtil.isSimpleInteger(((DataTypeDeclaration)SNodeOperations.getAdapter(dataType)))) {
        {
          SNode _nodeToCheck_1029348928467 = op;
          BaseIntentionProvider intentionProvider = null;
          TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(value, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186059295997", true), new QuotationClass_4().createNode(), _nodeToCheck_1029348928467, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186059295992", false, 0, intentionProvider);
        }
      } else
      if (DataTypeUtil.isSimpleBoolean(((DataTypeDeclaration)SNodeOperations.getAdapter(dataType)))) {
        {
          SNode _nodeToCheck_1029348928467 = op;
          BaseIntentionProvider intentionProvider = null;
          TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(value, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186059296010", true), new QuotationClass_5().createNode(), _nodeToCheck_1029348928467, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186059296005", false, 0, intentionProvider);
        }
      } else
      if (DataTypeUtil.isEnum(((DataTypeDeclaration)SNodeOperations.getAdapter(dataType)))) {
        if (!(SNodeOperations.isInstanceOf(value, "jetbrains.mps.bootstrap.smodelLanguage.structure.EnumMemberReference"))) {
          if (DataTypeUtil.isEnumOfInteger(((DataTypeDeclaration)SNodeOperations.getAdapter(dataType)))) {
            {
              SNode _nodeToCheck_1029348928467 = op;
              BaseIntentionProvider intentionProvider = null;
              TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(value, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1214430014542", true), new QuotationClass_95().createNode(), _nodeToCheck_1029348928467, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1214430014537", false, 0, intentionProvider);
            }
          } else
          if (DataTypeUtil.isEnumOfBoolean(((DataTypeDeclaration)SNodeOperations.getAdapter(dataType)))) {
            {
              SNode _nodeToCheck_1029348928467 = op;
              BaseIntentionProvider intentionProvider = null;
              TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(value, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1214430042918", true), new QuotationClass_96().createNode(), _nodeToCheck_1029348928467, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1214430042913", false, 0, intentionProvider);
            }
          } else
          {
            {
              SNode _nodeToCheck_1029348928467 = op;
              BaseIntentionProvider intentionProvider = null;
              TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(value, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186059478775", true), new QuotationClass_6().createNode(), _nodeToCheck_1029348928467, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186059478770", false, 0, intentionProvider);
            }
          }
        }
      } else
      {
        {
          BaseIntentionProvider intentionProvider = null;
          TypeChecker.getInstance().reportTypeError(op, "unknown property datatype: " + dataType, "jetbrains.mps.bootstrap.smodelLanguage.helgins@3_0", "1219267258211", intentionProvider);
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.Property_SetOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

}
