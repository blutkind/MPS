package jetbrains.mps.lang.smodel.scripts;

/*Generated by MPS */

import jetbrains.mps.lang.script.runtime.BaseMigrationScript;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.script.runtime.AbstractMigrationRefactoring;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.behavior.Classifier_Behavior;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.util.NameUtil;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class AdapterElimination_MigrationScript extends BaseMigrationScript {
  public AdapterElimination_MigrationScript(IOperationContext operationContext) {
    super("findAdapters");
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "find adapter class usages in variable declarations";
      }

      public String getAdditionalInfo() {
        return "find adapter class usages in variable declarations";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.VariableDeclaration";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        if (!(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "type", true), "jetbrains.mps.baseLanguage.structure.ClassifierType"))) {
          return false;
        }
        if (!(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(node, "type", true), "jetbrains.mps.baseLanguage.structure.ClassifierType"), "classifier", false), "jetbrains.mps.baseLanguage.structure.ClassConcept"))) {
          return false;
        }
        return Classifier_Behavior.call_isDescendant_7165541881557222913(SNodeOperations.cast(SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(node, "type", true), "jetbrains.mps.baseLanguage.structure.ClassifierType"), "classifier", false), "jetbrains.mps.baseLanguage.structure.ClassConcept"), SNodeOperations.cast(SLinkOperations.getTarget(new AdapterElimination_MigrationScript.QuotationClass_9c65zs_a0a0a0c0d0a0a0b0a().createNode(), "classifier", false), "jetbrains.mps.baseLanguage.structure.ClassConcept"));
      }

      public void doUpdateInstanceNode(SNode node) {
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "find adapter interface usages in variable declarations";
      }

      public String getAdditionalInfo() {
        return "find adapter interface usages in variable declarations";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.VariableDeclaration";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        if (!(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "type", true), "jetbrains.mps.baseLanguage.structure.ClassifierType"))) {
          return false;
        }
        if (!(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(node, "type", true), "jetbrains.mps.baseLanguage.structure.ClassifierType"), "classifier", false), "jetbrains.mps.baseLanguage.structure.Interface"))) {
          return false;
        }
        return Classifier_Behavior.call_isDescendant_7165541881557222913(SNodeOperations.cast(SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(node, "type", true), "jetbrains.mps.baseLanguage.structure.ClassifierType"), "classifier", false), "jetbrains.mps.baseLanguage.structure.Interface"), SNodeOperations.cast(SLinkOperations.getTarget(new AdapterElimination_MigrationScript.QuotationClass_9c65zs_a0a0a0c0d0a0a0c0a().createNode(), "classifier", false), "jetbrains.mps.baseLanguage.structure.Interface"));
      }

      public void doUpdateInstanceNode(SNode node) {
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "find java util refrences";
      }

      public String getAdditionalInfo() {
        return "find java util refrences";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.lang.core.structure.BaseConcept";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        for (SReference ref : node.getReferences()) {
          String targetModelFQName = ref.getTargetSModelReference().getSModelFqName().toString();
          if (targetModelFQName.endsWith(".structure@java_stub")) {
            return true;
          }
        }
        return false;
      }

      public void doUpdateInstanceNode(SNode node) {
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "find adapter class usages";
      }

      public String getAdditionalInfo() {
        return "find adapter class usages";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.ClassifierType";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        if ((SLinkOperations.getTarget(node, "classifier", false) == null)) {
          return false;
        }
        String className = NameUtil.nodeFQName(SLinkOperations.getTarget(node, "classifier", false));
        String namespace = NameUtil.namespaceFromLongName(className);
        return namespace.endsWith(".structure");
      }

      public void doUpdateInstanceNode(SNode node) {
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "find .adapter operations";
      }

      public String getAdditionalInfo() {
        return "find .adapter operations";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.lang.smodel.structure.Node_GetAdapterOperation";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return true;
      }

      public void doUpdateInstanceNode(SNode node) {
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
  }

  public static class QuotationClass_9c65zs_a0a0a0c0d0a0a0b0a {
    public QuotationClass_9c65zs_a0a0a0c0d0a0a0b0a() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.smodel(MPS.Classpath/jetbrains.mps.smodel@java_stub)"), SNodeId.fromString("~BaseAdapter")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_9c65zs_a0a0a0c0d0a0a0c0a {
    public QuotationClass_9c65zs_a0a0a0c0d0a0a0c0a() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.smodel(MPS.Classpath/jetbrains.mps.smodel@java_stub)"), SNodeId.fromString("~INodeAdapter")));
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
