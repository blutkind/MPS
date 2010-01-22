package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import javax.swing.JComponent;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import java.util.List;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.smodel.CopyUtil;

public class OverrideConceptMethodStrategy extends BaseMethodUpdateStrategy {
  public OverrideConceptMethodStrategy() {
  }

  public void updateMethod(SNode sourceMethod, SNode method) {
    super.updateMethod(sourceMethod, method);
    Iterable<SNode> paramList = ListSequence.fromList(SLinkOperations.getTargets(method, "parameter", true)).select(new ISelector<SNode, SNode>() {
      public SNode select(SNode it) {
        return new OverrideConceptMethodStrategy.QuotationClass_8496_1().createNode(it);
      }
    });
    SNode superCallExpr = new OverrideConceptMethodStrategy.QuotationClass_8496_0().createNode(Sequence.fromIterable(paramList).toListSequence(), sourceMethod);
    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(method, "returnType", true), "jetbrains.mps.baseLanguage.structure.VoidType")) {
      ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(method, "body", true), "statement", true)).addElement(new OverrideConceptMethodStrategy.QuotationClass_8496_2().createNode(superCallExpr));
    } else {
      ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(method, "body", true), "statement", true)).addElement(this.getReturnStatement(superCallExpr));
    }
  }

  public String getTitle() {
    return "Override Method";
  }

  public JComponent createAdditionalOptionsComponent() {
    return this.getReturnCheckBox();
  }

  public static class QuotationClass_8496_0 {
    public QuotationClass_8496_0() {
    }

    public SNode createNode(Object parameter_8496_1, Object parameter_8496_2) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_8496_1 = null;
      SNode quotedNode_8496_2 = null;
      SNode quotedNode_8496_3 = null;
      SNode quotedNode_8496_4 = null;
      {
        quotedNode_8496_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.DotExpression", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_8496_1 = quotedNode_8496_1;
        {
          quotedNode_8496_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.behavior.structure.SuperNodeExpression", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_8496_2 = quotedNode_8496_2;
          quotedNode_8496_1.addChild("operand", quotedNode1_8496_2);
        }
        {
          quotedNode_8496_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.Node_ConceptMethodCall", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_8496_3 = quotedNode_8496_3;
          quotedNode1_8496_3.setReferent("baseMethodDeclaration", (SNode) parameter_8496_2);
          {
            List<SNode> nodes = (List<SNode>) parameter_8496_1;
            for (SNode child : nodes) {
              quotedNode_8496_3.addChild("actualArgument", HUtil.copyIfNecessary(child));
            }
          }
          quotedNode_8496_1.addChild("operation", quotedNode1_8496_3);
        }
        result = quotedNode1_8496_1;
      }
      return result;
    }
  }

  public static class QuotationClass_8496_1 {
    public QuotationClass_8496_1() {
    }

    public SNode createNode(Object parameter_8496_0) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_8496_0 = null;
      {
        quotedNode_8496_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ParameterReference", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_8496_0 = quotedNode_8496_0;
        quotedNode1_8496_0.setReferent("variableDeclaration", (SNode) parameter_8496_0);
        result = quotedNode1_8496_0;
      }
      return result;
    }
  }

  public static class QuotationClass_8496_2 {
    public QuotationClass_8496_2() {
    }

    public SNode createNode(Object parameter_8496_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_8496_5 = null;
      SNode quotedNode_8496_6 = null;
      {
        quotedNode_8496_5 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ExpressionStatement", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_8496_4 = quotedNode_8496_5;
        {
          quotedNode_8496_6 = (SNode) parameter_8496_3;
          SNode quotedNode1_1;
          if (_parameterValues_129834374.contains(quotedNode_8496_6)) {
            quotedNode1_1 = CopyUtil.copy(quotedNode_8496_6);
          } else {
            _parameterValues_129834374.add(quotedNode_8496_6);
            quotedNode1_1 = quotedNode_8496_6;
          }
          if (quotedNode1_1 != null) {
            quotedNode_8496_5.addChild("expression", HUtil.copyIfNecessary(quotedNode1_1));
          }
        }
        result = quotedNode1_8496_4;
      }
      return result;
    }
  }
}
