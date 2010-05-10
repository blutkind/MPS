package jetbrains.mps.nodeEditor.messageTargets;

import jetbrains.mps.util.EqualUtil;
import org.jetbrains.annotations.NotNull;


public class DeletedNodeMessageTarget implements MessageTarget {
  private String myRole;
  private int myNextChildIndex = -1; // -1 for deleted in single role

  public DeletedNodeMessageTarget(String role, int nextChildIndex) {
    myRole = role;
    myNextChildIndex = nextChildIndex;
  }

  public DeletedNodeMessageTarget(String role) {
    myRole = role;
  }

  public MessageTargetEnum getTarget() {
    return MessageTargetEnum.DELETED_CHILD;
  }

  public String getRole() {
    return myRole;
  }

  public int getNextChildIndex() {
    return myNextChildIndex;
  }

  public boolean sameAs(@NotNull MessageTarget errorTarget) {
    return errorTarget instanceof DeletedNodeMessageTarget && EqualUtil.equals(errorTarget.getRole(), getRole())
      && myNextChildIndex == ((DeletedNodeMessageTarget) errorTarget).myNextChildIndex;
  }
}
