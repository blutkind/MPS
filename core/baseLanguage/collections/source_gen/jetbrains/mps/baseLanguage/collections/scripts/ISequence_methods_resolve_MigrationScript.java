package jetbrains.mps.baseLanguage.collections.scripts;

/*Generated by MPS */

import jetbrains.mps.lang.script.runtime.BaseMigrationScript;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.script.runtime.AbstractMigrationRefactoring;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class ISequence_methods_resolve_MigrationScript extends BaseMigrationScript {
  public ISequence_methods_resolve_MigrationScript(IOperationContext operationContext) {
    super("Resolve ISequence methods references");
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "fix dangling refs";
      }

      public String getAdditionalInfo() {
        return "fix dangling refs";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return (SLinkOperations.getTarget(node, "baseMethodDeclaration", false) == null);
      }

      public void doUpdateInstanceNode(SNode node) {
        List<SNode> seqCls = new ArrayList<SNode>();
        ListSequence.fromList(seqCls).addElement(SLinkOperations.getTarget(new ISequence_methods_resolve_MigrationScript.QuotationClass_3k0ck2_a0a0a1a4a0a0a1a0().createNode(), "classifier", false));
        ListSequence.fromList(seqCls).addElement(SLinkOperations.getTarget(new ISequence_methods_resolve_MigrationScript.QuotationClass_3k0ck2_a0a0a2a4a0a0a1a0().createNode(), "classifier", false));
        ListSequence.fromList(seqCls).addElement(SLinkOperations.getTarget(new ISequence_methods_resolve_MigrationScript.QuotationClass_3k0ck2_a0a0a3a4a0a0a1a0().createNode(), "classifier", false));
        ListSequence.fromList(seqCls).addElement(SLinkOperations.getTarget(new ISequence_methods_resolve_MigrationScript.QuotationClass_3k0ck2_a0a0a4a4a0a0a1a0().createNode(), "classifier", false));
        ListSequence.fromList(seqCls).addElement(SLinkOperations.getTarget(new ISequence_methods_resolve_MigrationScript.QuotationClass_3k0ck2_a0a0a5a4a0a0a1a0().createNode(), "classifier", false));
        ListSequence.fromList(seqCls).addElement(SLinkOperations.getTarget(new ISequence_methods_resolve_MigrationScript.QuotationClass_3k0ck2_a0a0a6a4a0a0a1a0().createNode(), "classifier", false));
        ListSequence.fromList(seqCls).addElement(SLinkOperations.getTarget(new ISequence_methods_resolve_MigrationScript.QuotationClass_3k0ck2_a0a0a7a4a0a0a1a0().createNode(), "classifier", false));
        ListSequence.fromList(seqCls).addElement(SLinkOperations.getTarget(new ISequence_methods_resolve_MigrationScript.QuotationClass_3k0ck2_a0a0a8a4a0a0a1a0().createNode(), "classifier", false));
        ListSequence.fromList(seqCls).addElement(SLinkOperations.getTarget(new ISequence_methods_resolve_MigrationScript.QuotationClass_3k0ck2_a0a0a9a4a0a0a1a0().createNode(), "classifier", false));
        List<SReference> refs = node.getReferences();
        if (refs.size() > 0) {
          SReference ref = refs.get(0);
          if (ref.getTargetNode() == null) {
with_cls:
            for (SNode iseq : seqCls) {
              for (SNode imd : SLinkOperations.getTargets(iseq, "method", true)) {
                if (SPropertyOperations.getString(imd, "name").equals(ref.getResolveInfo())) {
                  SLinkOperations.setTarget(node, "baseMethodDeclaration", imd, false);
                  break with_cls;
                }
              }
            }
          }
        }
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
  }

  public static class QuotationClass_3k0ck2_a0a0a1a4a0a0a1a0 {
    public QuotationClass_3k0ck2_a0a0a1a4a0a0a1a0() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("r:fc76aa36-3cff-41c7-b94b-eee0e8341932(jetbrains.mps.internal.collections.runtime)"), SNodeId.fromString("6543581031674024311")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_3k0ck2_a0a0a2a4a0a0a1a0 {
    public QuotationClass_3k0ck2_a0a0a2a4a0a0a1a0() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("r:fc76aa36-3cff-41c7-b94b-eee0e8341932(jetbrains.mps.internal.collections.runtime)"), SNodeId.fromString("6543581031674026272")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_3k0ck2_a0a0a3a4a0a0a1a0 {
    public QuotationClass_3k0ck2_a0a0a3a4a0a0a1a0() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("r:fc76aa36-3cff-41c7-b94b-eee0e8341932(jetbrains.mps.internal.collections.runtime)"), SNodeId.fromString("6543581031674030017")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_3k0ck2_a0a0a4a4a0a0a1a0 {
    public QuotationClass_3k0ck2_a0a0a4a4a0a0a1a0() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("r:fc76aa36-3cff-41c7-b94b-eee0e8341932(jetbrains.mps.internal.collections.runtime)"), SNodeId.fromString("6543581031674036013")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_3k0ck2_a0a0a5a4a0a0a1a0 {
    public QuotationClass_3k0ck2_a0a0a5a4a0a0a1a0() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("r:fc76aa36-3cff-41c7-b94b-eee0e8341932(jetbrains.mps.internal.collections.runtime)"), SNodeId.fromString("6543581031674024899")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_3k0ck2_a0a0a6a4a0a0a1a0 {
    public QuotationClass_3k0ck2_a0a0a6a4a0a0a1a0() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("r:fc76aa36-3cff-41c7-b94b-eee0e8341932(jetbrains.mps.internal.collections.runtime)"), SNodeId.fromString("6543581031674036081")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_3k0ck2_a0a0a7a4a0a0a1a0 {
    public QuotationClass_3k0ck2_a0a0a7a4a0a0a1a0() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("r:fc76aa36-3cff-41c7-b94b-eee0e8341932(jetbrains.mps.internal.collections.runtime)"), SNodeId.fromString("6543581031674036880")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_3k0ck2_a0a0a8a4a0a0a1a0 {
    public QuotationClass_3k0ck2_a0a0a8a4a0a0a1a0() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("r:fc76aa36-3cff-41c7-b94b-eee0e8341932(jetbrains.mps.internal.collections.runtime)"), SNodeId.fromString("6543581031674036653")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_3k0ck2_a0a0a9a4a0a0a1a0 {
    public QuotationClass_3k0ck2_a0a0a9a4a0a0a1a0() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("r:fc76aa36-3cff-41c7-b94b-eee0e8341932(jetbrains.mps.internal.collections.runtime)"), SNodeId.fromString("6543581031674025209")));
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
