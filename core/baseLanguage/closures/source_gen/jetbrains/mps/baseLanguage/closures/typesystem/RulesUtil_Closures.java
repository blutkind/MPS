package jetbrains.mps.baseLanguage.closures.typesystem;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.reloading.ClassLoaderManager;
import jetbrains.mps.reloading.ReloadAdapter;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class RulesUtil_Closures {
  /*package*/ static List<SNode> ourInterfaces;

  public static List<SNode> getInterfaces() {
    if (ourInterfaces == null) {
      ourInterfaces = SModelOperations.getNodes(SNodeOperations.getModel(SLinkOperations.getTarget(new RulesUtil_Closures.QuotationClass_7070_0().createNode(), "classifier", false)), "jetbrains.mps.baseLanguage.structure.Interface");
      ClassLoaderManager.getInstance().addReloadHandler(new ReloadAdapter() {
        public void onReload() {
          RulesUtil_Closures.ourInterfaces = null;
          ClassLoaderManager.getInstance().removeReloadHandler(this);
        }
      });
    }
    return ourInterfaces;
  }

  public static class QuotationClass_7070_0 {
    public QuotationClass_7070_0() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_51 = null;
      {
        quotedNode_51 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_44 = quotedNode_51;
        quotedNode1_44.addReference(SReference.create("classifier", quotedNode1_44, SModelReference.fromString("f:java_stub#jetbrains.mps.baseLanguage.closures.runtime(jetbrains.mps.baseLanguage.closures.runtime@java_stub)"), SNodeId.fromString("~FunctionTypes")));
        result = quotedNode1_44;
      }
      return result;
    }
  }
}
