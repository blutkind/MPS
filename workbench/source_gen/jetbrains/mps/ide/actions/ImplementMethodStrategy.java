package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.plugin.uiActions.StratergyAddMethodDialog;
import javax.swing.JComponent;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.behavior.Type_Behavior;

public class ImplementMethodStrategy implements StratergyAddMethodDialog.AdditionStrategy {
  public ImplementMethodStrategy() {
  }

  public String getTitle() {
    return "Implement Method";
  }

  public JComponent createAdditionalOptionsComponent() {
    return null;
  }

  public void updateMethod(SNode sourceMethod, SNode method) {
    if (!(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(method, "returnType", true), "jetbrains.mps.baseLanguage.structure.VoidType"))) {
      SNode defaultReturnExpr = Type_Behavior.call_createDefaultTypeExpression_3359611512358152580(SLinkOperations.getTarget(method, "returnType", true));
      if ((defaultReturnExpr == null)) {
        SLinkOperations.addChild(SLinkOperations.getTarget(method, "body", true), "statement", new _Quotations.QuotationClass_6().createNode());
      } else {
        SLinkOperations.addChild(SLinkOperations.getTarget(method, "body", true), "statement", new _Quotations.QuotationClass_5().createNode(defaultReturnExpr));
      }
    }
  }
}
