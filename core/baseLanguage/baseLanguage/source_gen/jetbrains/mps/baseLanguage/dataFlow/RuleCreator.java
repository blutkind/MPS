package jetbrains.mps.baseLanguage.dataFlow;

/*Generated by MPS */

import jetbrains.mps.analyzers.runtime.framework.DataFlowConstructor;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.dataFlow.framework.Program;
import jetbrains.mps.lang.dataFlow.framework.instructions.Instruction;

public class RuleCreator extends DataFlowConstructor {
  public RuleCreator() {
  }

  public boolean isApplicable(SNode node) {
    return SModelUtil_new.isAssignableConcept(INamedConcept_Behavior.call_getFqName_1213877404258(SNodeOperations.getConceptDeclaration(node)), getApplicableConceptFqName());
  }

  public String getApplicableConceptFqName() {
    return "jetbrains.mps.baseLanguage.structure.AbstractCreator";
  }

  public void performActions(Program o, SNode node) {
    {
      Object object = node;
      if (((Program) o).contains(object)) {
        int position = ((Program) (o)).getEnd(object);
        Instruction instruction = new notNullInstruction(node);
        instruction.setSource(node);
        ((Program) (o)).insert(instruction, position, true);
      }
    }
  }
}
