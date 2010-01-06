package jetbrains.mps.baseLanguage.util.plugin.refactorings;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.behavior.VariableDeclaration_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class IntroduceLocalVariableRefactoring extends IntroduceVariableRefactoring {
  public IntroduceLocalVariableRefactoring() {
  }

  public SNode doRefactoring() {
    SNode var = new IntroduceLocalVariableRefactoring.QuotationClass_3912_0().createNode(this.getExpressionType(), this.getExpression(), this.getName());
    if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(this.getExpression()), "jetbrains.mps.baseLanguage.structure.ExpressionStatement")) {
      SNodeOperations.replaceWithAnother(SNodeOperations.getParent(this.getExpression()), var);
    } else {
      SNode parentStatement = SNodeOperations.getAncestor(this.getExpression(), "jetbrains.mps.baseLanguage.structure.Statement", false, false);
      while (!(SNodeOperations.isInstanceOf(SNodeOperations.getParent(parentStatement), "jetbrains.mps.baseLanguage.structure.StatementList"))) {
        parentStatement = SNodeOperations.getAncestor(parentStatement, "jetbrains.mps.baseLanguage.structure.Statement", false, false);
      }
      SNodeOperations.insertPrevSiblingChild(parentStatement, var);
      SNodeOperations.replaceWithAnother(this.getExpression(), VariableDeclaration_Behavior.call_createReference_1213877517482(SLinkOperations.getTarget(var, "localVariableDeclaration", true)));
    }
    return SLinkOperations.getTarget(var, "localVariableDeclaration", true);
  }

  public static boolean isApplicable(SNode expr) {
    return SNodeOperations.isInstanceOf(expr, "jetbrains.mps.baseLanguage.structure.Expression") && SNodeOperations.getAncestor(expr, "jetbrains.mps.baseLanguage.structure.StatementList", false, false) != null;
  }

  public static class QuotationClass_3912_0 {
    public QuotationClass_3912_0() {
    }

    public SNode createNode(Object parameter_3912_0, Object parameter_3912_1, Object parameter_3912_2) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_0 = null;
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      {
        quotedNode_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_0 = quotedNode_0;
        {
          quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_1 = quotedNode_1;
          quotedNode1_1.setProperty("name", (String) parameter_3912_2);
          {
            quotedNode_2 = (SNode) parameter_3912_0;
            SNode quotedNode1_2;
            if (_parameterValues_129834374.contains(quotedNode_2)) {
              quotedNode1_2 = CopyUtil.copy(quotedNode_2);
            } else {
              _parameterValues_129834374.add(quotedNode_2);
              quotedNode1_2 = quotedNode_2;
            }
            if (quotedNode1_2 != null) {
              quotedNode_1.addChild("type", HUtil.copyIfNecessary(quotedNode1_2));
            }
          }
          {
            quotedNode_3 = (SNode) parameter_3912_1;
            SNode quotedNode1_3;
            if (_parameterValues_129834374.contains(quotedNode_3)) {
              quotedNode1_3 = CopyUtil.copy(quotedNode_3);
            } else {
              _parameterValues_129834374.add(quotedNode_3);
              quotedNode1_3 = quotedNode_3;
            }
            if (quotedNode1_3 != null) {
              quotedNode_1.addChild("initializer", HUtil.copyIfNecessary(quotedNode1_3));
            }
          }
          quotedNode_0.addChild("localVariableDeclaration", quotedNode1_1);
        }
        result = quotedNode1_0;
      }
      return result;
    }
  }
}
