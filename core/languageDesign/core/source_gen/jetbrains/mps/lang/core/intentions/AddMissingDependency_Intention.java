package jetbrains.mps.lang.core.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SModelDescriptor;

public class AddMissingDependency_Intention extends BaseIntention {

  public String getConcept() {
    return "jetbrains.mps.lang.core.structure.BaseConcept";
  }

  public boolean isErrorIntention() {
    return true;
  }

  public boolean isAvailableInChildNodes() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    IScope scope = editorContext.getScope();
    for(SReference ref : node.getReferences()) {
      SModelReference uid = ref.getTargetSModelReference();
      if (scope.getModelDescriptor(uid) == null && GlobalScope.getInstance().getModelDescriptor(uid) != null) {
        SModelDescriptor sm = GlobalScope.getInstance().getModelDescriptor(uid);
        return "Add dependency on module " + sm.getModule();
      }
    }
    throw new RuntimeException();
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    IScope scope = editorContext.getScope();
    for(SReference ref : node.getReferences()) {
      SModelReference uid = ref.getTargetSModelReference();
      if (uid == null) {
        continue;
      }
      if (scope.getModelDescriptor(uid) == null && GlobalScope.getInstance().getModelDescriptor(uid) != null) {
        return true;
      }
    }
    return false;
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    IScope scope = editorContext.getScope();
    for(SReference ref : node.getReferences()) {
      SModelReference uid = ref.getTargetSModelReference();
      if (scope.getModelDescriptor(uid) == null && GlobalScope.getInstance().getModelDescriptor(uid) != null) {
        SModelDescriptor sm = GlobalScope.getInstance().getModelDescriptor(uid);
        editorContext.getOperationContext().getModule().addDependency(sm.getModule().getModuleReference(), false);
      }
    }
  }

  public String getLocationString() {
    return "jetbrains.mps.lang.core.intentions";
  }

}
