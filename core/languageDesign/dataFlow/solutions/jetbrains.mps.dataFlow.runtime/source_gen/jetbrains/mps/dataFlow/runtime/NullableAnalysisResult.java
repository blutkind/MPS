package jetbrains.mps.dataFlow.runtime;

/*Generated by MPS */

import org.jetbrains.annotations.NotNull;
import java.util.Map;
import jetbrains.mps.smodel.SNode;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.behavior.Expression_Behavior;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.MapSequence;

public class NullableAnalysisResult {

  @NotNull()
  private Map<SNode, NullableVariableState> myResult;
  @NotNull()
  private List<SNode> myCheckResults = new ArrayList<SNode>();

  public NullableAnalysisResult(@NotNull() SNode statementList) {
    this.myResult = NullableUtil.getVariableReferenceStates(statementList);
  }

  private void checkNode(@NotNull() SNode node) {
    if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.AssignmentExpression")) {
      this.checkAssignment(node);
    }
    if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.IMethodCall")) {
      this.checkMethodCall(node);
    }
    if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.DotExpression")) {
      this.checkDotExpression(node);
    }
  }

  private void checkAssignment(@NotNull() SNode assignment) {
    SNode rValue = SLinkOperations.getTarget(assignment, "rValue", true);
    if (rValue != null) {
      if (this.badAssignment(Expression_Behavior.call_getNullableState_1230540989695(SLinkOperations.getTarget(assignment, "lValue", true)), this.getNodeState(rValue))) {
        ListSequence.fromList(this.myCheckResults).addElement(assignment);
      }
    }
  }

  private void checkMethodCall(@NotNull() SNode call) {
    if (ListSequence.fromList(SLinkOperations.getTargets(call, "actualArgument", true)).count() != ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(call, "baseMethodDeclaration", false), "parameter", true)).count()) {
      return;
    }
    for(int i = 0 ; i < ListSequence.fromList(SLinkOperations.getTargets(call, "actualArgument", true)).count() ; i++ ) {
      SNode parameter = ListSequence.fromList(ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(call, "baseMethodDeclaration", false), "parameter", true)).toListSequence()).getElement(i);
      SNode expression = ListSequence.fromList(ListSequence.fromList(SLinkOperations.getTargets(call, "actualArgument", true)).toListSequence()).getElement(i);
      if (this.badAssignment(NullableUtil.getVariableStateByAnnotation(SLinkOperations.getTargets(parameter, "annotation", true)), this.getNodeState(expression))) {
        ListSequence.fromList(this.myCheckResults).addElement(expression);
      }
    }
  }

  public void checkDotExpression(@NotNull() SNode call) {
    NullableVariableState operand = this.getNodeState(SLinkOperations.getTarget(call, "operand", true));
    if (operand == NullableVariableState.NULLABLE || operand == NullableVariableState.NULL) {
      ListSequence.fromList(this.myCheckResults).addElement(SLinkOperations.getTarget(call, "operand", true));
    }
  }

  @NotNull()
  private NullableVariableState getNodeState(@NotNull() SNode node) {
    if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.LocalVariableReference") && MapSequence.fromMap(this.myResult).containsKey(node)) {
      return MapSequence.fromMap(this.myResult).get(node);
    }
    return Expression_Behavior.call_getNullableState_1230540989695(node);
  }

  private boolean badAssignment(@NotNull() NullableVariableState lValue, @NotNull() NullableVariableState rValue) {
    return lValue == NullableVariableState.NOT_NULL && (rValue == NullableVariableState.NULLABLE || rValue == NullableVariableState.NULL);
  }

  public List<SNode> checkNodes(SNode list) {
    for(SNode descendant : ListSequence.fromList(SNodeOperations.getDescendants(list, "jetbrains.mps.lang.core.structure.BaseConcept", false))) {
      this.checkNode(descendant);
    }
    return this.myCheckResults;
  }

}
