package jetbrains.mps.analyzers.mpsAnalyzers.nullable;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.framework.instructions.Instruction;
import jetbrains.mps.smodel.SNode;

public class nullableInstruction extends Instruction {
  private SNode myexpression;
  private String myPresentation;

  public nullableInstruction(SNode expression) {
    StringBuilder sb = new StringBuilder();
    sb.append("nullable");
    myexpression = expression;
    putUserObject("expression", expression);
    sb.append(" " + expression);
    myPresentation = sb.toString();
  }

  @Override
  public String commandPresentation() {
    return myPresentation;
  }

  public SNode getexpression() {
    return myexpression;
  }
}
