package jetbrains.mps.baseLanguage.util.plugin.refactorings;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.framework.Program;
import java.util.Set;
import jetbrains.mps.lang.dataFlow.framework.instructions.ReadInstruction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.dataFlow.DataFlowManager;
import jetbrains.mps.lang.dataFlow.framework.AnalysisResult;
import jetbrains.mps.lang.dataFlow.framework.analyzers.ReachingReadsAnalyzer;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.lang.dataFlow.framework.instructions.Instruction;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.awt.Frame;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class InlineVariableAssignmentRefactoring extends InlineVariableRefactoring {
  private Program myProgram;
  private Set<ReadInstruction> myReadInstructions;
  private SNode myVariable;

  public InlineVariableAssignmentRefactoring(SNode node) {
    this.myVariable = node;
    SNode body = this.getBaseStatementList(node);
    this.myProgram = DataFlowManager.getInstance().buildProgramFor(body);
    AnalysisResult<Set<ReadInstruction>> reachingReads = this.myProgram.analyze(new ReachingReadsAnalyzer());
    this.myReadInstructions = SetSequence.fromSet(new HashSet<ReadInstruction>());
    for (Instruction instruction : ListSequence.fromList(this.myProgram.getInstructionsFor(node))) {
      for (Instruction next : SetSequence.fromSet(instruction.succ())) {
        for (ReadInstruction read : reachingReads.get(next)) {
          if (read.getVariable() == node) {
            SetSequence.fromSet(this.myReadInstructions).addElement(read);
          }
        }
      }
    }
  }

  public boolean checkRefactoring(Frame frame) {
    final Wrappers._boolean isLocalVariable = new Wrappers._boolean();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        isLocalVariable.value = SNodeOperations.isInstanceOf(InlineVariableAssignmentRefactoring.this.myVariable, "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration");
      }
    });
    if (isLocalVariable.value) {
      final Wrappers._T<List<SNode>> nodesToRafactor = new Wrappers._T<List<SNode>>();
      final Wrappers._T<SNode> initializer = new Wrappers._T<SNode>();
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          initializer.value = SLinkOperations.getTarget(SNodeOperations.cast(InlineVariableAssignmentRefactoring.this.myVariable, "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"), "initializer", true);
          nodesToRafactor.value = InlineVariableAssignmentRefactoring.this.getNodesToRafactor();
        }
      });
      if (initializer.value == null) {
        return false;
      }
      if (ListSequence.fromList(nodesToRafactor.value).isEmpty()) {
        JOptionPane.showMessageDialog(frame, "Variable is never used", "", JOptionPane.INFORMATION_MESSAGE);
        return false;
      } else {
        int code = JOptionPane.showConfirmDialog(frame, "Inline variable? (" + ListSequence.fromList(nodesToRafactor.value).count() + " occurrences)", "", JOptionPane.YES_NO_OPTION);
        if (code != JOptionPane.YES_OPTION) {
          return false;
        }
      }
    }
    return true;
  }

  public SNode doRefactoring() {
    SNode newSelection = null;
    for (SNode ref : this.getNodesToRafactor()) {
      SNode sourceNode = ref;
      // <node> 
      for (SNode reference : ListSequence.fromList(SNodeOperations.getDescendants(sourceNode, "jetbrains.mps.baseLanguage.structure.VariableReference", true, new String[]{}))) {
        if (SLinkOperations.getTarget(reference, "variableDeclaration", false) == myVariable) {
          SNodeOperations.replaceWithAnother(reference, SNodeOperations.copyNode(SLinkOperations.getTarget(myVariable, "initializer", true)));
        }
      }
    }
    this.optimizeDeclaration(this.myVariable);
    return newSelection;
  }

  private List<SNode> getNodesToRafactor() {
    List<SNode> result = new ArrayList<SNode>();
    for (ReadInstruction read : SetSequence.fromSet(this.myReadInstructions)) {
      ListSequence.fromList(result).addElement(((SNode) read.getSource()));
    }
    return result;
  }
}
