package jetbrains.mps.internal.make.runtime.script;

/*Generated by MPS */

import jetbrains.mps.messages.Message;
import jetbrains.mps.messages.MessageKind;

public class ValidationError extends Message {
  private Object object;

  public ValidationError(Object context, String message) {
    super(MessageKind.ERROR, message);
    this.object = context;
  }

  public String getText() {
    return "Validation failed: " + super.getText() + ((object != null ?
      " in " + object.toString() :
      ""
    ));
  }
}
