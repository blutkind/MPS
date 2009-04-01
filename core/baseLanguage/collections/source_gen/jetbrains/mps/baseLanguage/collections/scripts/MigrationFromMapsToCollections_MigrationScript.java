package jetbrains.mps.baseLanguage.collections.scripts;

/*Generated by MPS */

import jetbrains.mps.lang.script.runtime.BaseMigrationScript;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.script.runtime.AbstractMigrationRefactoring;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.collections.scripts.ListMigrationUtil;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.collections.scripts.ParameterType;

public class MigrationFromMapsToCollections_MigrationScript extends BaseMigrationScript {

  public MigrationFromMapsToCollections_MigrationScript(IOperationContext operationContext) {
    super("Migration from map to collections");
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {

      public String getName() {
        return "MapMigration";
      }

      public String getAdditionalInfo() {
        return "MapMigration";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.ClassifierType";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return ListMigrationUtil.isApplicableForType(node, 2, ListSequence.<SNode>fromArray(SNodeOperations.getNode("f:java_stub#java.util(java.util@java_stub)", "~Map"), SNodeOperations.getNode("f:java_stub#java.util(java.util@java_stub)", "~HashMap")));
      }

      public void doUpdateInstanceNode(SNode node) {
        SNode result = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.collections.structure.MapType", null);
        SLinkOperations.setTarget(result, "keyType", SNodeOperations.copyNode(ListSequence.fromList(SLinkOperations.getTargets(node, "parameter", true)).first()), true);
        SLinkOperations.setTarget(result, "valueType", SNodeOperations.copyNode(ListSequence.fromList(SLinkOperations.getTargets(node, "parameter", true)).last()), true);
        SNodeOperations.replaceWithAnother(node, result);
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {

      public String getName() {
        return "Get ";
      }

      public String getAdditionalInfo() {
        return "Get ";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return ListMigrationUtil.isApplicableForMap(node, "get", ListSequence.<ParameterType>fromArray(ParameterType.NOT_INT));
      }

      public void doUpdateInstanceNode(SNode node) {
        SNode operation = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.collections.structure.MapElement", null);
        SLinkOperations.setTarget(operation, "key", SNodeOperations.copyNode(ListSequence.fromList(SLinkOperations.getTargets(node, "actualArgument", true)).first()), true);
        SLinkOperations.setTarget(operation, "map", SLinkOperations.getTarget(SNodeOperations.getParent(node), "operand", true), true);
        SNodeOperations.replaceWithAnother(SNodeOperations.getParent(node), operation);
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {

      public String getName() {
        return "Put ";
      }

      public String getAdditionalInfo() {
        return "Put ";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return ListMigrationUtil.isApplicableForMap(node, "put", ListSequence.<ParameterType>fromArray(ParameterType.NOT_INT, ParameterType.NOT_INT));
      }

      public void doUpdateInstanceNode(SNode node) {
        SNode assignment = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.AssignmentExpression", null);
        SNode operation = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.collections.structure.MapElement", null);
        SLinkOperations.setTarget(operation, "key", SNodeOperations.copyNode(ListSequence.fromList(SLinkOperations.getTargets(node, "actualArgument", true)).first()), true);
        SLinkOperations.setTarget(operation, "map", SLinkOperations.getTarget(SNodeOperations.getParent(node), "operand", true), true);
        SLinkOperations.setTarget(assignment, "lValue", operation, true);
        SLinkOperations.setTarget(assignment, "rValue", SNodeOperations.copyNode(ListSequence.fromList(SLinkOperations.getTargets(node, "actualArgument", true)).last()), true);
        SNodeOperations.replaceWithAnother(SNodeOperations.getParent(node), assignment);
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {

      public String getName() {
        return "values ";
      }

      public String getAdditionalInfo() {
        return "values ";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return ListMigrationUtil.isApplicableForMap(node, "values", ListSequence.<ParameterType>fromArray());
      }

      public void doUpdateInstanceNode(SNode node) {
        SNode values = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.collections.structure.GetValuesOperation", null);
        SNodeOperations.replaceWithAnother(node, values);
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
  }
}
