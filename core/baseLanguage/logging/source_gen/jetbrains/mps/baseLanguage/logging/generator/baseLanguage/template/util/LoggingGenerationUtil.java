package jetbrains.mps.baseLanguage.logging.generator.baseLanguage.template.util;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.Language;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class LoggingGenerationUtil {
  public static SNode toPlus(List<SNode> textExpressions) {
    SNode result = null;
    if (ListSequence.fromList(textExpressions).isNotEmpty()) {
      result = SNodeOperations.copyNode(ListSequence.fromList(textExpressions).first());
      for (SNode textExpression : ListSequence.fromList(textExpressions).skip(1)) {
        result = new LoggingGenerationUtil.QuotationClass_8857_l523emnegr9l().createNode(SNodeOperations.copyNode(textExpression), result);
      }
    }
    return result;
  }

  public static boolean isDesignTimeModel(SModel sm) {
    return Language.isLanguageModel(sm);
  }

  public static class QuotationClass_8857_l523emnegr9l {
    public QuotationClass_8857_l523emnegr9l() {
    }

    public SNode createNode(Object parameter_8857_ffy3yqom, Object parameter_8857_ffy3yqor) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_8857_ffy3yqoj = null;
      SNode quotedNode_8857_ffy3yqok = null;
      SNode quotedNode_8857_ffy3yqop = null;
      {
        quotedNode_8857_ffy3yqoj = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.PlusExpression", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_8857_ffy3yqoj = quotedNode_8857_ffy3yqoj;
        {
          quotedNode_8857_ffy3yqok = (SNode) parameter_8857_ffy3yqom;
          SNode quotedNode1_8857_ffy3yqok;
          if (_parameterValues_129834374.contains(quotedNode_8857_ffy3yqok)) {
            quotedNode1_8857_ffy3yqok = CopyUtil.copy(quotedNode_8857_ffy3yqok);
          } else {
            _parameterValues_129834374.add(quotedNode_8857_ffy3yqok);
            quotedNode1_8857_ffy3yqok = quotedNode_8857_ffy3yqok;
          }
          if (quotedNode1_8857_ffy3yqok != null) {
            quotedNode_8857_ffy3yqoj.addChild("rightExpression", HUtil.copyIfNecessary(quotedNode1_8857_ffy3yqok));
          }
        }
        {
          quotedNode_8857_ffy3yqop = (SNode) parameter_8857_ffy3yqor;
          SNode quotedNode1_8857_ffy3yqop;
          if (_parameterValues_129834374.contains(quotedNode_8857_ffy3yqop)) {
            quotedNode1_8857_ffy3yqop = CopyUtil.copy(quotedNode_8857_ffy3yqop);
          } else {
            _parameterValues_129834374.add(quotedNode_8857_ffy3yqop);
            quotedNode1_8857_ffy3yqop = quotedNode_8857_ffy3yqop;
          }
          if (quotedNode1_8857_ffy3yqop != null) {
            quotedNode_8857_ffy3yqoj.addChild("leftExpression", HUtil.copyIfNecessary(quotedNode1_8857_ffy3yqop));
          }
        }
        result = quotedNode1_8857_ffy3yqoj;
      }
      return result;
    }
  }
}
