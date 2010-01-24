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
        result = new LoggingGenerationUtil.QuotationClass_8857_0().createNode(SNodeOperations.copyNode(textExpression), result);
      }
    }
    return result;
  }

  public static boolean isDesignTimeModel(SModel sm) {
    return Language.isLanguageModel(sm);
  }

  public static class QuotationClass_8857_0 {
    public QuotationClass_8857_0() {
    }

    public SNode createNode(Object parameter_8857_0, Object parameter_8857_1) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_8857_0 = null;
      SNode quotedNode_8857_1 = null;
      SNode quotedNode_8857_2 = null;
      {
        quotedNode_8857_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.PlusExpression", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_8857_0 = quotedNode_8857_0;
        {
          quotedNode_8857_1 = (SNode) parameter_8857_0;
          SNode quotedNode1_0;
          if (_parameterValues_129834374.contains(quotedNode_8857_1)) {
            quotedNode1_0 = CopyUtil.copy(quotedNode_8857_1);
          } else {
            _parameterValues_129834374.add(quotedNode_8857_1);
            quotedNode1_0 = quotedNode_8857_1;
          }
          if (quotedNode1_0 != null) {
            quotedNode_8857_0.addChild("rightExpression", HUtil.copyIfNecessary(quotedNode1_0));
          }
        }
        {
          quotedNode_8857_2 = (SNode) parameter_8857_1;
          SNode quotedNode1_1;
          if (_parameterValues_129834374.contains(quotedNode_8857_2)) {
            quotedNode1_1 = CopyUtil.copy(quotedNode_8857_2);
          } else {
            _parameterValues_129834374.add(quotedNode_8857_2);
            quotedNode1_1 = quotedNode_8857_2;
          }
          if (quotedNode1_1 != null) {
            quotedNode_8857_0.addChild("leftExpression", HUtil.copyIfNecessary(quotedNode1_1));
          }
        }
        result = quotedNode1_8857_0;
      }
      return result;
    }
  }
}
