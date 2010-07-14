package jetbrains.mps.baseLanguage.closures.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import java.util.List;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.smodel.CopyUtil;

public class replace_invokeOperation_with_compactInvoke_Intention extends BaseIntention implements Intention {
  public replace_invokeOperation_with_compactInvoke_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.closures.structure.InvokeFunctionOperation";
  }

  public boolean isParameterized() {
    return false;
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Replace with Compact Invoke Expression";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return SNodeOperations.isInstanceOf(SNodeOperations.getParent(node), "jetbrains.mps.baseLanguage.structure.DotExpression");
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode parent = SNodeOperations.cast(SNodeOperations.getParent(node), "jetbrains.mps.baseLanguage.structure.DotExpression");
    SNodeOperations.replaceWithAnother(parent, new replace_invokeOperation_with_compactInvoke_Intention.QuotationClass_fknil1_a0a0b0h().createNode(SLinkOperations.getTargets(SNodeOperations.cast(SLinkOperations.getTarget(parent, "operation", true), "jetbrains.mps.baseLanguage.closures.structure.InvokeFunctionOperation"), "parameter", true), SLinkOperations.getTarget(parent, "operand", true)));
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.closures.intentions";
  }

  public static class QuotationClass_fknil1_a0a0b0h {
    public QuotationClass_fknil1_a0a0b0h() {
    }

    public SNode createNode(Object parameter_6, Object parameter_7) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.closures.structure.CompactInvokeFunctionExpression", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_4 = quotedNode_1;
        {
          List<SNode> nodes = (List<SNode>) parameter_6;
          for (SNode child : nodes) {
            quotedNode_1.addChild("parameter", HUtil.copyIfNecessary(child));
          }
        }
        {
          quotedNode_3 = (SNode) parameter_7;
          SNode quotedNode1_5;
          if (_parameterValues_129834374.contains(quotedNode_3)) {
            quotedNode1_5 = CopyUtil.copy(quotedNode_3);
          } else {
            _parameterValues_129834374.add(quotedNode_3);
            quotedNode1_5 = quotedNode_3;
          }
          if (quotedNode1_5 != null) {
            quotedNode_1.addChild("function", HUtil.copyIfNecessary(quotedNode1_5));
          }
        }
        result = quotedNode1_4;
      }
      return result;
    }
  }
}
