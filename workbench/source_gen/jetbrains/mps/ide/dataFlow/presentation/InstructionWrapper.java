package jetbrains.mps.ide.dataFlow.presentation;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.framework.instructions.Instruction;
import java.util.Set;
import java.util.HashSet;

public class InstructionWrapper implements IInstruction<InstructionWrapper> {
  private Instruction myInstruction;

  public InstructionWrapper(Instruction instruction) {
    this.myInstruction = instruction;
  }

  public Set<InstructionWrapper> succ() {
    Set<InstructionWrapper> result = new HashSet<InstructionWrapper>();
    for (Instruction instruction : this.myInstruction.succ()) {
      result.add(new InstructionWrapper(instruction));
    }
    return result;
  }

  public Set<InstructionWrapper> pred() {
    Set<InstructionWrapper> result = new HashSet<InstructionWrapper>();
    for (Instruction instruction : this.myInstruction.pred()) {
      result.add(new InstructionWrapper(instruction));
    }
    return result;
  }

  public Instruction getInstruction() {
    return this.myInstruction;
  }

  public String toString() {
    return this.myInstruction.toString();
  }

  public int hashCode() {
    return this.myInstruction.hashCode();
  }

  public boolean equals(Object obj) {
    if (obj instanceof InstructionWrapper) {
      return (this.myInstruction.equals(((InstructionWrapper) obj).myInstruction));
    }
    return false;
  }
}
