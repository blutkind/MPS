package jetbrains.mps.baseLanguage.math.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.math.behavior.MathUtil;

public class DeleteMathContext_Intention extends BaseIntention implements Intention {
  public DeleteMathContext_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.math.structure.DecimalBinaryOperation";
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
    return "Use default math context";
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNodeOperations.replaceWithAnother(node, MathUtil.convert1(node));
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.math.intentions";
  }
}
