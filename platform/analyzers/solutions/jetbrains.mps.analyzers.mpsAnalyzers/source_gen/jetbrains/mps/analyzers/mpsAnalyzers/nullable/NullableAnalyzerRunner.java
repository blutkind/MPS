package jetbrains.mps.analyzers.mpsAnalyzers.nullable;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.framework.AnalyzerRunner;
import java.util.Map;
import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.analyzers.runtime.framework.DataFlowConstructor;
import java.util.HashMap;
import java.util.LinkedList;
import jetbrains.mps.lang.dataFlow.MPSProgramBuilder;
import jetbrains.mps.lang.dataFlow.DataFlowManager;
import jetbrains.mps.lang.dataFlow.framework.DataFlowAnalyzer;
import jetbrains.mps.lang.dataFlow.framework.Program;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.dataFlow.framework.ProgramState;
import jetbrains.mps.lang.dataFlow.framework.instructions.Instruction;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.dataFlow.framework.instructions.WriteInstruction;
import jetbrains.mps.lang.dataFlow.framework.AnalysisDirection;

public class NullableAnalyzerRunner extends AnalyzerRunner<Map<SNode, NullableState>> {
  private Map<String, List<DataFlowConstructor>> myApplicableMap = new HashMap<String, List<DataFlowConstructor>>();
  private SNode myNode;

  public NullableAnalyzerRunner(SNode node) {
    super(null, null);
    myNode = node;
    {
      DataFlowConstructor rule = new RuleNotEqualsNull();
      String conceptName = "jetbrains.mps.baseLanguage.structure.IfStatement";
      if (!(myApplicableMap.containsKey(conceptName))) {
        myApplicableMap.put(conceptName, new LinkedList<DataFlowConstructor>());
      }
      myApplicableMap.get(conceptName).add(rule);
    }
    {
      DataFlowConstructor rule = new RuleNullNotEquals();
      String conceptName = "jetbrains.mps.baseLanguage.structure.IfStatement";
      if (!(myApplicableMap.containsKey(conceptName))) {
        myApplicableMap.put(conceptName, new LinkedList<DataFlowConstructor>());
      }
      myApplicableMap.get(conceptName).add(rule);
    }
    {
      DataFlowConstructor rule = new RuleNotEqualsNullAnd();
      String conceptName = "jetbrains.mps.baseLanguage.structure.IfStatement";
      if (!(myApplicableMap.containsKey(conceptName))) {
        myApplicableMap.put(conceptName, new LinkedList<DataFlowConstructor>());
      }
      myApplicableMap.get(conceptName).add(rule);
    }
    {
      DataFlowConstructor rule = new RuleIfNullReturn();
      String conceptName = "jetbrains.mps.baseLanguage.structure.IfStatement";
      if (!(myApplicableMap.containsKey(conceptName))) {
        myApplicableMap.put(conceptName, new LinkedList<DataFlowConstructor>());
      }
      myApplicableMap.get(conceptName).add(rule);
    }
    {
      DataFlowConstructor rule = new RuleIfNullEqualsReturn();
      String conceptName = "jetbrains.mps.baseLanguage.structure.IfStatement";
      if (!(myApplicableMap.containsKey(conceptName))) {
        myApplicableMap.put(conceptName, new LinkedList<DataFlowConstructor>());
      }
      myApplicableMap.get(conceptName).add(rule);
    }
    myProgram = new MPSProgramBuilder(DataFlowManager.getInstance()).buildProgram(myNode);
    prepareProgram();
    myAnalyzer = new NullableAnalyzerRunner.NullableAnalyzer();
  }

  private void prepareProgram() {
    for (SNode descendant : myNode.getDescendants()) {
      String key = descendant.getConceptFqName();
      if (myApplicableMap.containsKey(key)) {
        for (DataFlowConstructor rule : myApplicableMap.get(key)) {
          if (rule.isApplicable(descendant)) {
            rule.performActions(myProgram);
          }
        }
      }
    }
  }

  public static class NullableAnalyzer implements DataFlowAnalyzer<Map<SNode, NullableState>> {
    public NullableAnalyzer() {
    }

    public Map<SNode, NullableState> initial(Program program) {
      Map<SNode, NullableState> result = new HashMap<SNode, NullableState>();
      return result;
    }

    public Map<SNode, NullableState> merge(Program program, List<Map<SNode, NullableState>> input) {
      Map<SNode, NullableState> result = new HashMap<SNode, NullableState>();

      for (Map<SNode, NullableState> inputElement : ListSequence.fromList(input)) {
        for (Map.Entry<SNode, NullableState> entry : inputElement.entrySet()) {
          SNode expr = entry.getKey();
          NullableState value = entry.getValue();
          NullableState resValue = result.get(expr);
          if (resValue == null) {
            resValue = NullableState.UNKNOWN;
          }
          result.put(expr, resValue.merge(value));
        }
      }
      return result;
    }

    public Map<SNode, NullableState> fun(Map<SNode, NullableState> input, ProgramState state) {
      Map<SNode, NullableState> result = new HashMap<SNode, NullableState>();
      Instruction instruction = state.getInstruction();
      result.putAll(input);
      NullableState nullableState = NullableState.UNKNOWN;
      SNode node = (SNode) instruction.getUserObject("expression");
      if (instruction instanceof notNullInstruction) {
        nullableState = NullableState.NOTNULL;
      }
      if (instruction instanceof nullableInstruction) {
        nullableState = NullableState.NULLABLE;
      }
      if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.VariableReference")) {
        node = SLinkOperations.getTarget(SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.VariableReference"), "variableDeclaration", false);
      }
      if (node != null) {
        result.put((SNode) node, nullableState);
      }
      if (instruction instanceof WriteInstruction) {
        WriteInstruction write = (WriteInstruction) instruction;
        SNode value = (SNode) write.getValue();
        if (SNodeOperations.isInstanceOf(value, "jetbrains.mps.baseLanguage.structure.VariableReference")) {
          value = SLinkOperations.getTarget(SNodeOperations.cast(value, "jetbrains.mps.baseLanguage.structure.VariableReference"), "variableDeclaration", false);
        }
        NullableState valueState = result.get(value);
        if (valueState == null) {
          valueState = NullableState.UNKNOWN;
        }
        result.put((SNode) write.getVariable(), valueState);
      }
      return result;
    }

    public AnalysisDirection getDirection() {
      return AnalysisDirection.FORWARD;
    }
  }
}
