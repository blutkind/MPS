package jetbrains.mps.lang.test.runtime;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.AttributesRolesUtil;
import junit.framework.Assert;
import jetbrains.mps.lang.test.matcher.NodesMatcher;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.dataFlow.framework.Program;
import jetbrains.mps.lang.dataFlow.DataFlowManager;
import java.util.Set;
import jetbrains.mps.lang.dataFlow.framework.instructions.Instruction;
import jetbrains.mps.lang.dataFlow.framework.AnalysisResult;
import jetbrains.mps.lang.dataFlow.framework.analyzers.InitializedVariablesAnalyzer;
import jetbrains.mps.lang.dataFlow.framework.analyzers.LivenessAnalyzer;
import java.util.List;
import jetbrains.mps.lang.test.behavior.NodeOperation_Behavior;

public class SubtreeChecker {

  public static void checkNodeForErrors(SNode node) {
    TypeChecker checker = TypeChecker.getInstance();
    checker.checkIfNotChecked(node);
    for(SNode child : SNodeOperations.getDescendants(node, "jetbrains.mps.lang.core.structure.BaseConcept", false)) {
      boolean isError = false;
      if (SLinkOperations.getTarget(child, AttributesRolesUtil.childRoleFromAttributeRole("nodePropertiesMarker"), true) != null) {
        SNode container = SLinkOperations.getTarget(child, AttributesRolesUtil.childRoleFromAttributeRole("nodePropertiesMarker"), true);
        for(SNode property : SLinkOperations.getTargets(container, "properties", true)) {
          if (SNodeOperations.isInstanceOf(property, "jetbrains.mps.lang.test.structure.NodeTypeProperty")) {
            SNode type1 = checker.getTypeOf(child);
            SNode type2 = SLinkOperations.getTarget(((SNode)property), "type", true);
            Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.<SNode>fromArray(type1), ListSequence.<SNode>fromArray(type2)));
          }
          if (SNodeOperations.isInstanceOf(property, "jetbrains.mps.lang.test.structure.NodeErrorPropety")) {
            Assert.assertTrue(checker.getTypeErrorDontCheck(child) != null);
            Assert.assertFalse(checker.getTypeErrorDontCheck(child).isWarning());
            isError = true;
          }
          if (SNodeOperations.isInstanceOf(property, "jetbrains.mps.lang.test.structure.NodeWarningProperty")) {
            Assert.assertTrue(checker.getTypeErrorDontCheck(child) != null);
            Assert.assertTrue(checker.getTypeErrorDontCheck(child).isWarning());
            isError = true;
          }
        }
      }
      if (!(isError)) {
        Assert.assertNull(checker.getTypeErrorDontCheck(child));
      }
    }
  }

  public static void asserType(SNode nodeToCheck, SNode type) {
    TypeChecker checker = TypeChecker.getInstance();
    checker.checkIfNotChecked(nodeToCheck);
    SNode type1 = checker.getTypeOf(nodeToCheck);
    Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.<SNode>fromArray(type), ListSequence.<SNode>fromArray(type1)));
  }

  public static void checkDataFlow(SNode node) {
    Program program = DataFlowManager.getInstance().buildProgramFor(node);
    Set<Instruction> unreachable = program.getUnreachableInstructions();
    AnalysisResult<Set<Object>> initialyzed = program.analyze(new InitializedVariablesAnalyzer());
    AnalysisResult<Set<Object>> live = program.analyze(new LivenessAnalyzer());
    for(SNode child : SNodeOperations.getDescendants(node, "jetbrains.mps.lang.core.structure.BaseConcept", false)) {
      if (SLinkOperations.getTarget(child, AttributesRolesUtil.childRoleFromAttributeRole("nodePropertiesMarker"), true) != null) {
        SNode container = SLinkOperations.getTarget(child, AttributesRolesUtil.childRoleFromAttributeRole("nodePropertiesMarker"), true);
        for(SNode property : SLinkOperations.getTargets(container, "properties", true)) {
          Instruction instruction;
          List<Instruction> instructions = program.getInstructionsFor(child);
          if (instructions.size() > 0) {
            instruction = program.getInstructionsFor(child).get(0);
          } else
          {
            continue;
          }
          if (SNodeOperations.isInstanceOf(property, "jetbrains.mps.lang.test.structure.NodeReachable")) {
            Assert.assertFalse(unreachable.contains(instruction));
          }
          if (SNodeOperations.isInstanceOf(property, "jetbrains.mps.lang.test.structure.NodeUnreachable")) {
            Assert.assertTrue(unreachable.contains(instruction));
          }
          if (SNodeOperations.isInstanceOf(property, "jetbrains.mps.lang.test.structure.NodeUnreachable")) {
            Assert.assertTrue(unreachable.contains(instruction));
          }
          if (SNodeOperations.isInstanceOf(property, "jetbrains.mps.lang.test.structure.VariableInialized")) {
            Set vars = initialyzed.get(instruction);
            SNode var = SLinkOperations.getTarget(((SNode)property), "var", true);
            Assert.assertTrue(vars.contains(SLinkOperations.getTarget(var, "variableDeclaration", false)));
          }
          if (SNodeOperations.isInstanceOf(property, "jetbrains.mps.lang.test.structure.VariableLive")) {
            Set vars = live.get(instruction);
            SNode var = SLinkOperations.getTarget(((SNode)property), "var", true);
            Assert.assertTrue(vars.contains(SLinkOperations.getTarget(var, "variableDeclaration", false)));
          }
        }
      }
    }
  }

  public static void performOperations(SNode node) {
    for(SNode nodeToCheck : SNodeOperations.getDescendants(node, "jetbrains.mps.lang.core.structure.BaseConcept", false)) {
      if (nodeToCheck != null) {
        if (SLinkOperations.getTarget(nodeToCheck, AttributesRolesUtil.childRoleFromAttributeRole("nodeOpraretionsMark"), true) != null) {
          for(SNode operation : SLinkOperations.getTargets(SLinkOperations.getTarget(nodeToCheck, AttributesRolesUtil.childRoleFromAttributeRole("nodeOpraretionsMark"), true), "operations", true)) {
            NodeOperation_Behavior.call_perform_1215601182156(operation, nodeToCheck);
          }
        }
      }
    }
  }

  public static void runTest() {
  }

}
