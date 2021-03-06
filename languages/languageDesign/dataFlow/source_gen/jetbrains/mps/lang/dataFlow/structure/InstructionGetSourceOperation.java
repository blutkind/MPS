package jetbrains.mps.lang.dataFlow.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class InstructionGetSourceOperation extends BaseInstructionOperation {
  public static final String concept = "jetbrains.mps.lang.dataFlow.structure.InstructionGetSourceOperation";

  public InstructionGetSourceOperation(SNode node) {
    super(node);
  }

  public static InstructionGetSourceOperation newInstance(SModel sm, boolean init) {
    return (InstructionGetSourceOperation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.dataFlow.structure.InstructionGetSourceOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static InstructionGetSourceOperation newInstance(SModel sm) {
    return InstructionGetSourceOperation.newInstance(sm, false);
  }
}
