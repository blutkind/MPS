package jetbrains.mps.baseLanguage.collections.scripts;

/*Generated by MPS */

import jetbrains.mps.lang.script.runtime.BaseMigrationScript;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.script.runtime.AbstractMigrationRefactoring;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class MigrationToCollections_MigrationScript extends BaseMigrationScript {
  public MigrationToCollections_MigrationScript(IOperationContext operationContext) {
    super("Migration from List to Collections");
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "ListMigration";
      }

      public String getAdditionalInfo() {
        return "ListMigration";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.ClassifierType";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return ListMigrationUtil.isApplicableForType(node, 1, ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.getNode("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.util(JDK/java.util@java_stub)", "~List"), SNodeOperations.getNode("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.util(JDK/java.util@java_stub)", "~ArrayList"), SNodeOperations.getNode("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.util(JDK/java.util@java_stub)", "~LinkedList")));
      }

      public void doUpdateInstanceNode(SNode node) {
        SNode result = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.collections.structure.ListType", null);
        SLinkOperations.setTarget(result, "elementType", SNodeOperations.copyNode(ListSequence.fromList(SLinkOperations.getTargets(node, "parameter", true)).first()), true);
        SNodeOperations.replaceWithAnother(node, result);
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "Size ";
      }

      public String getAdditionalInfo() {
        return "Size ";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return ListMigrationUtil.isApplicableForAll(node, "size", ListSequence.fromList(new ArrayList<ParameterType>()));
      }

      public void doUpdateInstanceNode(SNode node) {
        SNodeOperations.replaceWithAnother(node, SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.collections.structure.GetSizeOperation", null));
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "Get";
      }

      public String getAdditionalInfo() {
        return "Get";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return ListMigrationUtil.isApplicableForLists(node, "get", ListSequence.fromListAndArray(new ArrayList<ParameterType>(), ParameterType.INT));
      }

      public void doUpdateInstanceNode(SNode node) {
        SNode access = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.collections.structure.ListElementAccessExpression", null);
        SLinkOperations.setTarget(access, "list", SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getParent(node), "jetbrains.mps.baseLanguage.structure.DotExpression"), "operand", true), true);
        SLinkOperations.setTarget(access, "index", SNodeOperations.copyNode(ListSequence.fromList(SLinkOperations.getTargets(node, "actualArgument", true)).first()), true);
        SNodeOperations.replaceWithAnother(SNodeOperations.getParent(node), access);
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "Clear";
      }

      public String getAdditionalInfo() {
        return "Clear";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return ListMigrationUtil.isApplicableForLists(node, "clear", ListSequence.fromList(new ArrayList<ParameterType>()));
      }

      public void doUpdateInstanceNode(SNode node) {
        SNodeOperations.replaceWithAnother(node, SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.collections.structure.ClearAllElementsOperation", null));
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "Add element to List";
      }

      public String getAdditionalInfo() {
        return "Add element to List";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return ListMigrationUtil.isApplicableForLists(node, "add", ListSequence.fromListAndArray(new ArrayList<ParameterType>(), ParameterType.ANY));
      }

      public void doUpdateInstanceNode(SNode node) {
        SNode opration = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.collections.structure.AddElementOperation", null);
        SLinkOperations.setTarget(opration, "argument", SNodeOperations.copyNode(ListSequence.fromList(SLinkOperations.getTargets(node, "actualArgument", true)).first()), true);
        SNodeOperations.replaceWithAnother(node, opration);
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "Add element to pos";
      }

      public String getAdditionalInfo() {
        return "Add element to pos";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return ListMigrationUtil.isApplicableForLists(node, "add", ListSequence.fromListAndArray(new ArrayList<ParameterType>(), ParameterType.INT, ParameterType.NOT_INT));
      }

      public void doUpdateInstanceNode(SNode node) {
        SNode operation = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.collections.structure.InsertElementOperation", null);
        SLinkOperations.setTarget(operation, "index", SNodeOperations.copyNode(ListSequence.fromList(SLinkOperations.getTargets(node, "actualArgument", true)).first()), true);
        SLinkOperations.setTarget(operation, "element", SNodeOperations.copyNode(ListSequence.fromList(SLinkOperations.getTargets(node, "actualArgument", true)).last()), true);
        SNodeOperations.replaceWithAnother(node, operation);
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "isEmpty";
      }

      public String getAdditionalInfo() {
        return "isEmpty";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return ListMigrationUtil.isApplicableForAll(node, "isEmpty", ListSequence.fromList(new ArrayList<ParameterType>()));
      }

      public void doUpdateInstanceNode(SNode node) {
        SNodeOperations.replaceWithAnother(node, SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.collections.structure.IsEmptyOperation", null));
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "set";
      }

      public String getAdditionalInfo() {
        return "set";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return ListMigrationUtil.isApplicableForLists(node, "set", ListSequence.fromListAndArray(new ArrayList<ParameterType>(), ParameterType.INT, ParameterType.NOT_INT));
      }

      public void doUpdateInstanceNode(SNode node) {
        SNode operation = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.collections.structure.SetElementOperation", null);
        SLinkOperations.setTarget(operation, "index", SNodeOperations.copyNode(ListSequence.fromList(SLinkOperations.getTargets(node, "actualArgument", true)).first()), true);
        SLinkOperations.setTarget(operation, "element", SNodeOperations.copyNode(ListSequence.fromList(ListSequence.fromList(SLinkOperations.getTargets(node, "actualArgument", true)).toListSequence()).getElement(1)), true);
        SNodeOperations.replaceWithAnother(node, operation);
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "remove";
      }

      public String getAdditionalInfo() {
        return "remove";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return ListMigrationUtil.isApplicableForLists(node, "remove", ListSequence.fromListAndArray(new ArrayList<ParameterType>(), ParameterType.INT));
      }

      public void doUpdateInstanceNode(SNode node) {
        SNode operation = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.collections.structure.RemoveAtElementOperation", null);
        SLinkOperations.setTarget(operation, "index", SNodeOperations.copyNode(ListSequence.fromList(SLinkOperations.getTargets(node, "actualArgument", true)).first()), true);
        SNodeOperations.replaceWithAnother(node, operation);
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "removeObject";
      }

      public String getAdditionalInfo() {
        return "removeObject";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return ListMigrationUtil.isApplicableForLists(node, "remove", ListSequence.fromListAndArray(new ArrayList<ParameterType>(), ParameterType.NOT_INT));
      }

      public void doUpdateInstanceNode(SNode node) {
        SNode operation = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.collections.structure.RemoveElementOperation", null);
        SLinkOperations.setTarget(operation, "argument", SNodeOperations.copyNode(ListSequence.fromList(SLinkOperations.getTargets(node, "actualArgument", true)).first()), true);
        SNodeOperations.replaceWithAnother(node, operation);
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "removeAll";
      }

      public String getAdditionalInfo() {
        return "removeAll";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return ListMigrationUtil.isApplicableForLists(node, "removeAll", ListSequence.fromListAndArray(new ArrayList<ParameterType>(), ParameterType.NOT_INT));
      }

      public void doUpdateInstanceNode(SNode node) {
        SNode operation = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.collections.structure.RemoveAllElementsOperation", null);
        SLinkOperations.setTarget(operation, "argument", SNodeOperations.copyNode(ListSequence.fromList(SLinkOperations.getTargets(node, "actualArgument", true)).first()), true);
        SNodeOperations.replaceWithAnother(node, operation);
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "indexOf";
      }

      public String getAdditionalInfo() {
        return "indexOf";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return ListMigrationUtil.isApplicableForLists(node, "indexOf", ListSequence.fromListAndArray(new ArrayList<ParameterType>(), ParameterType.NOT_INT));
      }

      public void doUpdateInstanceNode(SNode node) {
        SNode operation = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.collections.structure.GetIndexOfOperation", null);
        SLinkOperations.setTarget(operation, "argument", SNodeOperations.copyNode(ListSequence.fromList(SLinkOperations.getTargets(node, "actualArgument", true)).first()), true);
        SNodeOperations.replaceWithAnother(node, operation);
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "contains";
      }

      public String getAdditionalInfo() {
        return "contains";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return ListMigrationUtil.isApplicableForAll(node, "contains", ListSequence.fromListAndArray(new ArrayList<ParameterType>(), ParameterType.NOT_INT));
      }

      public void doUpdateInstanceNode(SNode node) {
        SNode operation = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.collections.structure.ContainsOperation", null);
        SLinkOperations.setTarget(operation, "argument", SNodeOperations.copyNode(ListSequence.fromList(SLinkOperations.getTargets(node, "actualArgument", true)).first()), true);
        SNodeOperations.replaceWithAnother(node, operation);
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "addAll";
      }

      public String getAdditionalInfo() {
        return "addAll";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return ListMigrationUtil.isApplicableForLists(node, "addAll", ListSequence.fromListAndArray(new ArrayList<ParameterType>(), ParameterType.NOT_INT));
      }

      public void doUpdateInstanceNode(SNode node) {
        SNode operation = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.collections.structure.AddAllElementsOperation", null);
        SLinkOperations.setTarget(operation, "argument", SNodeOperations.copyNode(ListSequence.fromList(SLinkOperations.getTargets(node, "actualArgument", true)).first()), true);
        SNodeOperations.replaceWithAnother(node, operation);
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "Add First";
      }

      public String getAdditionalInfo() {
        return "Add First";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return ListMigrationUtil.isApplicableForLists(node, "addFirst", ListSequence.fromListAndArray(new ArrayList<ParameterType>(), ParameterType.NOT_INT));
      }

      public void doUpdateInstanceNode(SNode node) {
        SNode operation = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.collections.structure.AddFirstElementOperation", null);
        SLinkOperations.setTarget(operation, "argument", SNodeOperations.copyNode(ListSequence.fromList(SLinkOperations.getTargets(node, "actualArgument", true)).first()), true);
        SNodeOperations.replaceWithAnother(node, operation);
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "Add Last";
      }

      public String getAdditionalInfo() {
        return "Add Last";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return ListMigrationUtil.isApplicableForLists(node, "addLast", ListSequence.fromListAndArray(new ArrayList<ParameterType>(), ParameterType.NOT_INT));
      }

      public void doUpdateInstanceNode(SNode node) {
        SNode operation = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.collections.structure.AddLastElementOperation", null);
        SLinkOperations.setTarget(operation, "argument", SNodeOperations.copyNode(ListSequence.fromList(SLinkOperations.getTargets(node, "actualArgument", true)).first()), true);
        SNodeOperations.replaceWithAnother(node, operation);
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "Remove first";
      }

      public String getAdditionalInfo() {
        return "Remove first";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return ListMigrationUtil.isApplicableForLists(node, "removeFirst", ListSequence.fromList(new ArrayList<ParameterType>()));
      }

      public void doUpdateInstanceNode(SNode node) {
        SNodeOperations.replaceWithAnother(node, SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.collections.structure.RemoveFirstElementOperation", null));
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "ArrayList";
      }

      public String getAdditionalInfo() {
        return "ArrayList";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.ClassCreator";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return eq_2ocuwj_a0a0a0d0a0a0s0a(SPropertyOperations.getString(SNodeOperations.cast(SNodeOperations.getParent(SLinkOperations.getTarget(node, "baseMethodDeclaration", false)), "jetbrains.mps.lang.core.structure.INamedConcept"), "name"), "ArrayList") && (int) ListSequence.fromList(SLinkOperations.getTargets(node, "typeParameter", true)).count() == 1 && ListSequence.fromList(SLinkOperations.getTargets(node, "actualArgument", true)).count() <= 1;
      }

      public void doUpdateInstanceNode(SNode node) {
        SNode result = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.collections.structure.ListCreatorWithInit", null);
        SLinkOperations.setTarget(result, "elementType", ListSequence.fromList(SLinkOperations.getTargets(node, "typeParameter", true)).first(), true);
        if (ListSequence.fromList(SLinkOperations.getTargets(node, "actualArgument", true)).isNotEmpty()) {
          SLinkOperations.setTarget(result, "copyFrom", SNodeOperations.copyNode(ListSequence.fromList(SLinkOperations.getTargets(node, "actualArgument", true)).first()), true);
        }
        SNodeOperations.replaceWithAnother(node, result);
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "LinkedList";
      }

      public String getAdditionalInfo() {
        return "LinkedList";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.ClassCreator";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return eq_2ocuwj_a0a0a0d0a0a0t0a(SPropertyOperations.getString(SNodeOperations.cast(SNodeOperations.getParent(SLinkOperations.getTarget(node, "baseMethodDeclaration", false)), "jetbrains.mps.lang.core.structure.INamedConcept"), "name"), "LinkedList") && ListSequence.fromList(SLinkOperations.getTargets(node, "actualArgument", true)).isEmpty() && (int) ListSequence.fromList(SLinkOperations.getTargets(node, "typeParameter", true)).count() == 1;
      }

      public void doUpdateInstanceNode(SNode node) {
        SNode result = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.collections.structure.LinkedListCreator", null);
        SLinkOperations.setTarget(result, "elementType", ListSequence.fromList(SLinkOperations.getTargets(node, "typeParameter", true)).first(), true);
        SNodeOperations.replaceWithAnother(node, result);
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "SetMigration";
      }

      public String getAdditionalInfo() {
        return "SetMigration";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.ClassifierType";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return ListMigrationUtil.isApplicableForType(node, 1, ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.getNode("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.util(JDK/java.util@java_stub)", "~Set"), SNodeOperations.getNode("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.util(JDK/java.util@java_stub)", "~HashSet"), SNodeOperations.getNode("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.util(JDK/java.util@java_stub)", "~LinkedHashSet")));
      }

      public void doUpdateInstanceNode(SNode node) {
        SNode result = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.collections.structure.SetType", null);
        SLinkOperations.setTarget(result, "elementType", SNodeOperations.copyNode(ListSequence.fromList(SLinkOperations.getTargets(node, "parameter", true)).first()), true);
        SNodeOperations.replaceWithAnother(node, result);
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "Add element to Set";
      }

      public String getAdditionalInfo() {
        return "Add element to Set";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return ListMigrationUtil.isApplicableForSet(node, "add", ListSequence.fromListAndArray(new ArrayList<ParameterType>(), ParameterType.NOT_INT));
      }

      public void doUpdateInstanceNode(SNode node) {
        SNode opration = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.collections.structure.AddSetElementOperation", null);
        SLinkOperations.setTarget(opration, "argument", SNodeOperations.copyNode(ListSequence.fromList(SLinkOperations.getTargets(node, "actualArgument", true)).first()), true);
        SNodeOperations.replaceWithAnother(node, opration);
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "AddAll elements to Set";
      }

      public String getAdditionalInfo() {
        return "AddAll elements to Set";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return ListMigrationUtil.isApplicableForSet(node, "addAll", ListSequence.fromListAndArray(new ArrayList<ParameterType>(), ParameterType.NOT_INT));
      }

      public void doUpdateInstanceNode(SNode node) {
        SNode opration = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.collections.structure.AddAllSetElementsOperation", null);
        SLinkOperations.setTarget(opration, "argument", SNodeOperations.copyNode(ListSequence.fromList(SLinkOperations.getTargets(node, "actualArgument", true)).first()), true);
        SNodeOperations.replaceWithAnother(node, opration);
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "RemoveAll elements to Set";
      }

      public String getAdditionalInfo() {
        return "RemoveAll elements to Set";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return ListMigrationUtil.isApplicableForSet(node, "removeAll", ListSequence.fromListAndArray(new ArrayList<ParameterType>(), ParameterType.NOT_INT));
      }

      public void doUpdateInstanceNode(SNode node) {
        SNode opration = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.collections.structure.RemoveAllSetElementsOperation", null);
        SLinkOperations.setTarget(opration, "argument", SNodeOperations.copyNode(ListSequence.fromList(SLinkOperations.getTargets(node, "actualArgument", true)).first()), true);
        SNodeOperations.replaceWithAnother(node, opration);
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "Remove element from Set";
      }

      public String getAdditionalInfo() {
        return "Remove element from Set";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return ListMigrationUtil.isApplicableForSet(node, "remove", ListSequence.fromListAndArray(new ArrayList<ParameterType>(), ParameterType.NOT_INT));
      }

      public void doUpdateInstanceNode(SNode node) {
        SNode opration = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.collections.structure.RemoveSetElementOperation", null);
        SLinkOperations.setTarget(opration, "argument", SNodeOperations.copyNode(ListSequence.fromList(SLinkOperations.getTargets(node, "actualArgument", true)).first()), true);
        SNodeOperations.replaceWithAnother(node, opration);
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "HashSet migration";
      }

      public String getAdditionalInfo() {
        return "HashSet migration";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.ClassCreator";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return eq_2ocuwj_a0a0a0d0a0a0z0a(SPropertyOperations.getString(SNodeOperations.cast(SNodeOperations.getParent(SLinkOperations.getTarget(node, "baseMethodDeclaration", false)), "jetbrains.mps.lang.core.structure.INamedConcept"), "name"), "HashSet") && ListSequence.fromList(SLinkOperations.getTargets(node, "actualArgument", true)).count() <= 1 && (int) ListSequence.fromList(SLinkOperations.getTargets(node, "typeParameter", true)).count() == 1;
      }

      public void doUpdateInstanceNode(SNode node) {
        SNode result = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.collections.structure.HashSetCreator", null);
        SLinkOperations.setTarget(result, "elementType", ListSequence.fromList(SLinkOperations.getTargets(node, "typeParameter", true)).first(), true);
        if (ListSequence.fromList(SLinkOperations.getTargets(node, "actualArgument", true)).isNotEmpty()) {
          SLinkOperations.setTarget(result, "copyFrom", SNodeOperations.copyNode(ListSequence.fromList(SLinkOperations.getTargets(node, "actualArgument", true)).first()), true);
        }
        SNodeOperations.replaceWithAnother(node, result);
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "LinkedHashSet migration";
      }

      public String getAdditionalInfo() {
        return "LinkedHashSet migration";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.ClassCreator";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return eq_2ocuwj_a0a0a0d0a0a0ab0a(SPropertyOperations.getString(SNodeOperations.cast(SNodeOperations.getParent(SLinkOperations.getTarget(node, "baseMethodDeclaration", false)), "jetbrains.mps.lang.core.structure.INamedConcept"), "name"), "LinkedHashSet") && ListSequence.fromList(SLinkOperations.getTargets(node, "actualArgument", true)).count() <= 1 && (int) ListSequence.fromList(SLinkOperations.getTargets(node, "typeParameter", true)).count() == 1;
      }

      public void doUpdateInstanceNode(SNode node) {
        SNode result = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.collections.structure.LinkedHashSetCreator", null);
        SLinkOperations.setTarget(result, "elementType", ListSequence.fromList(SLinkOperations.getTargets(node, "typeParameter", true)).first(), true);
        if (ListSequence.fromList(SLinkOperations.getTargets(node, "actualArgument", true)).isNotEmpty()) {
          SLinkOperations.setTarget(result, "copyFrom", SNodeOperations.copyNode(ListSequence.fromList(SLinkOperations.getTargets(node, "actualArgument", true)).first()), true);
        }
        SNodeOperations.replaceWithAnother(node, result);
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "hasNext";
      }

      public String getAdditionalInfo() {
        return "hasNext";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return ListMigrationUtil.isApplicableForIterator(node, "hasNext", ListSequence.fromList(new ArrayList<ParameterType>()));
      }

      public void doUpdateInstanceNode(SNode node) {
        SNode opration = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.collections.structure.HasNextOperation", null);
        SNodeOperations.replaceWithAnother(node, opration);
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "next";
      }

      public String getAdditionalInfo() {
        return "next";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return ListMigrationUtil.isApplicableForIterator(node, "next", ListSequence.fromList(new ArrayList<ParameterType>()));
      }

      public void doUpdateInstanceNode(SNode node) {
        SNode opration = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.collections.structure.GetNextOperation", null);
        SNodeOperations.replaceWithAnother(node, opration);
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "getIterator";
      }

      public String getAdditionalInfo() {
        return "getIterator";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return ListMigrationUtil.isApplicableForLists(node, "iterator", ListSequence.fromList(new ArrayList<ParameterType>()));
      }

      public void doUpdateInstanceNode(SNode node) {
        SNode opration = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.collections.structure.GetIteratorOperation", null);
        SNodeOperations.replaceWithAnother(node, opration);
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "Iterator";
      }

      public String getAdditionalInfo() {
        return "Iterator";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.ClassifierType";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return ListMigrationUtil.isApplicableForType(node, 1, ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.getNode("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.util(JDK/java.util@java_stub)", "~Iterator")));
      }

      public void doUpdateInstanceNode(SNode node) {
        SNode result = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.collections.structure.IteratorType", null);
        SLinkOperations.setTarget(result, "elementType", SNodeOperations.copyNode(ListSequence.fromList(SLinkOperations.getTargets(node, "parameter", true)).first()), true);
        SNodeOperations.replaceWithAnother(node, result);
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
  }

  private static boolean eq_2ocuwj_a0a0a0d0a0a0s0a(Object a, Object b) {
    return (a != null ?
      a.equals(b) :
      a == b
    );
  }

  private static boolean eq_2ocuwj_a0a0a0d0a0a0t0a(Object a, Object b) {
    return (a != null ?
      a.equals(b) :
      a == b
    );
  }

  private static boolean eq_2ocuwj_a0a0a0d0a0a0z0a(Object a, Object b) {
    return (a != null ?
      a.equals(b) :
      a == b
    );
  }

  private static boolean eq_2ocuwj_a0a0a0d0a0a0ab0a(Object a, Object b) {
    return (a != null ?
      a.equals(b) :
      a == b
    );
  }
}
