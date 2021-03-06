package jetbrains.mps.execution.settings.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CreateEditor_Function extends EditorOperationDeclaration {
  public static final String concept = "jetbrains.mps.execution.settings.structure.CreateEditor_Function";

  public CreateEditor_Function(SNode node) {
    super(node);
  }

  public static CreateEditor_Function newInstance(SModel sm, boolean init) {
    return (CreateEditor_Function) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.execution.settings.structure.CreateEditor_Function", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CreateEditor_Function newInstance(SModel sm) {
    return CreateEditor_Function.newInstance(sm, false);
  }
}
