package jetbrains.mps.lang.editor.tableTests.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.impl.CompiledConceptDescriptor;
import jetbrains.mps.smodel.runtime.interpreted.StructureAspectInterpreted;

public class StructureAspectDescriptor implements jetbrains.mps.smodel.runtime.StructureAspectDescriptor {
  private static String[] stringSwitchCases_1htk8d_a0a0a = new String[]{"jetbrains.mps.lang.editor.tableTests.structure.AbstractStateMachineElement", "jetbrains.mps.lang.editor.tableTests.structure.ContentElement", "jetbrains.mps.lang.editor.tableTests.structure.DataCell", "jetbrains.mps.lang.editor.tableTests.structure.Event", "jetbrains.mps.lang.editor.tableTests.structure.EventReference", "jetbrains.mps.lang.editor.tableTests.structure.HierarchycalTable", "jetbrains.mps.lang.editor.tableTests.structure.Matrix", "jetbrains.mps.lang.editor.tableTests.structure.Row", "jetbrains.mps.lang.editor.tableTests.structure.State", "jetbrains.mps.lang.editor.tableTests.structure.StateMachine", "jetbrains.mps.lang.editor.tableTests.structure.StateReference", "jetbrains.mps.lang.editor.tableTests.structure.Table", "jetbrains.mps.lang.editor.tableTests.structure.Transition", "jetbrains.mps.lang.editor.tableTests.structure.UltimateContainer", "jetbrains.mps.lang.editor.tableTests.structure.XElement", "jetbrains.mps.lang.editor.tableTests.structure.YElement"};

  public StructureAspectDescriptor() {
  }

  public ConceptDescriptor getDescriptor(String conceptFqName) {
    switch (Arrays.binarySearch(stringSwitchCases_1htk8d_a0a0a, conceptFqName)) {
      case 0:
        return new CompiledConceptDescriptor("jetbrains.mps.lang.editor.tableTests.structure.AbstractStateMachineElement", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{});
      case 1:
        return new CompiledConceptDescriptor("jetbrains.mps.lang.editor.tableTests.structure.ContentElement", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{});
      case 2:
        return new CompiledConceptDescriptor("jetbrains.mps.lang.editor.tableTests.structure.DataCell", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{"value"}, new String[]{});
      case 3:
        return new CompiledConceptDescriptor("jetbrains.mps.lang.editor.tableTests.structure.Event", "jetbrains.mps.lang.editor.tableTests.structure.AbstractStateMachineElement", false, new String[]{"jetbrains.mps.lang.editor.tableTests.structure.AbstractStateMachineElement", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{});
      case 4:
        return new CompiledConceptDescriptor("jetbrains.mps.lang.editor.tableTests.structure.EventReference", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"event"});
      case 5:
        return new CompiledConceptDescriptor("jetbrains.mps.lang.editor.tableTests.structure.HierarchycalTable", "jetbrains.mps.lang.editor.tableTests.structure.Table", false, new String[]{"jetbrains.mps.lang.editor.tableTests.structure.Table"}, new String[]{}, new String[]{});
      case 6:
        return new CompiledConceptDescriptor("jetbrains.mps.lang.editor.tableTests.structure.Matrix", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{});
      case 7:
        return new CompiledConceptDescriptor("jetbrains.mps.lang.editor.tableTests.structure.Row", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{});
      case 8:
        return new CompiledConceptDescriptor("jetbrains.mps.lang.editor.tableTests.structure.State", "jetbrains.mps.lang.editor.tableTests.structure.AbstractStateMachineElement", false, new String[]{"jetbrains.mps.lang.editor.tableTests.structure.AbstractStateMachineElement", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{});
      case 9:
        return new CompiledConceptDescriptor("jetbrains.mps.lang.editor.tableTests.structure.StateMachine", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{});
      case 10:
        return new CompiledConceptDescriptor("jetbrains.mps.lang.editor.tableTests.structure.StateReference", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"state"});
      case 11:
        return new CompiledConceptDescriptor("jetbrains.mps.lang.editor.tableTests.structure.Table", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{"initialRowCount", "initialColumnCount"}, new String[]{});
      case 12:
        return new CompiledConceptDescriptor("jetbrains.mps.lang.editor.tableTests.structure.Transition", "jetbrains.mps.lang.editor.tableTests.structure.AbstractStateMachineElement", false, new String[]{"jetbrains.mps.lang.editor.tableTests.structure.AbstractStateMachineElement"}, new String[]{"condition"}, new String[]{});
      case 13:
        return new CompiledConceptDescriptor("jetbrains.mps.lang.editor.tableTests.structure.UltimateContainer", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{});
      case 14:
        return new CompiledConceptDescriptor("jetbrains.mps.lang.editor.tableTests.structure.XElement", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{});
      case 15:
        return new CompiledConceptDescriptor("jetbrains.mps.lang.editor.tableTests.structure.YElement", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{});
      default:
        return StructureAspectInterpreted.getInstance().getDescriptor(conceptFqName);
    }
  }
}
