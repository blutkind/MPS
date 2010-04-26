package jetbrains.mps.baseLanguage.util.plugin.refactorings;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.behavior.VariableDeclaration_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
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
    this.findDuplicates();
    SNode var = new IntroduceLocalVariableRefactoring.QuotationClass_nngwe4_a0a1a0().createNode(this.getExpressionType(), this.getExpression(), this.getName());
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

  @Override
  protected SNode getRootToFindDuplicates(SNode node) {
    SNode result = SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.StatementList", false, false);
    while ((SNodeOperations.getAncestor(result, "jetbrains.mps.baseLanguage.structure.StatementList", false, false) != null)) {
      result = SNodeOperations.getAncestor(result, "jetbrains.mps.baseLanguage.structure.StatementList", false, false);
    }
    return result;
  }

  public void replaceNode(SNode node, SNode declaration) {
    SNode reference = new IntroduceLocalVariableRefactoring.QuotationClass_nngwe4_a0a0a2().createNode(declaration);
    SNodeOperations.replaceWithAnother(node, reference);
    this.moveDeclarationIfNeed(reference, SNodeOperations.getParent(declaration));
  }

  private void moveDeclarationIfNeed(SNode node, SNode declaration) {
    List<SNode> declAncestors = SNodeOperations.getAncestors(declaration, null, false);
    ListSequence.fromList(declAncestors).addElement(declaration);
    SNode commonList = SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.StatementList", false, false);
    while ((commonList != null) && !(ListSequence.fromList(declAncestors).contains(commonList))) {
      commonList = SNodeOperations.getAncestor(commonList, "jetbrains.mps.baseLanguage.structure.StatementList", false, false);
    }
    if ((commonList != null)) {
      SNode firstAncestor = null;
      for (SNode statement : ListSequence.fromList(SLinkOperations.getTargets(commonList, "statement", true))) {
        List<SNode> nodeAncestors = SNodeOperations.getAncestors(node, null, false);
        if (ListSequence.fromList(declAncestors).contains(statement) || ListSequence.fromList(nodeAncestors).contains(statement)) {
          firstAncestor = statement;
          break;
        }
      }
      if (firstAncestor != declaration) {
        SNodeOperations.insertPrevSiblingChild(firstAncestor, SNodeOperations.detachNode(declaration));
      }
    }
  }

  public static boolean isApplicable(SNode expr) {
    return SNodeOperations.isInstanceOf(expr, "jetbrains.mps.baseLanguage.structure.Expression") && SNodeOperations.getAncestor(expr, "jetbrains.mps.baseLanguage.structure.StatementList", false, false) != null;
  }

  public static class QuotationClass_nngwe4_a0a1a0 {
    public QuotationClass_nngwe4_a0a1a0() {
    }

    public SNode createNode(Object parameter_9, Object parameter_10, Object parameter_11) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      SNode quotedNode_4 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_5 = quotedNode_1;
        {
          quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_6 = quotedNode_2;
          quotedNode1_6.setProperty("name", (String) parameter_11);
          {
            quotedNode_3 = (SNode) parameter_9;
            SNode quotedNode1_7;
            if (_parameterValues_129834374.contains(quotedNode_3)) {
              quotedNode1_7 = CopyUtil.copy(quotedNode_3);
            } else {
              _parameterValues_129834374.add(quotedNode_3);
              quotedNode1_7 = quotedNode_3;
            }
            if (quotedNode1_7 != null) {
              quotedNode_2.addChild("type", HUtil.copyIfNecessary(quotedNode1_7));
            }
          }
          {
            quotedNode_4 = (SNode) parameter_10;
            SNode quotedNode1_8;
            if (_parameterValues_129834374.contains(quotedNode_4)) {
              quotedNode1_8 = CopyUtil.copy(quotedNode_4);
            } else {
              _parameterValues_129834374.add(quotedNode_4);
              quotedNode1_8 = quotedNode_4;
            }
            if (quotedNode1_8 != null) {
              quotedNode_2.addChild("initializer", HUtil.copyIfNecessary(quotedNode1_8));
            }
          }
          quotedNode_1.addChild("localVariableDeclaration", quotedNode1_6);
        }
        result = quotedNode1_5;
      }
      return result;
    }
  }

  public static class QuotationClass_nngwe4_a0a0a2 {
    public QuotationClass_nngwe4_a0a0a2() {
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.LocalVariableReference", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("variableDeclaration", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
