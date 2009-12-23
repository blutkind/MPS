package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConceptFunctionParameter_oldText extends ConceptFunctionParameter {
  public static final String concept = "jetbrains.mps.lang.editor.structure.ConceptFunctionParameter_oldText";

  public ConceptFunctionParameter_oldText(SNode node) {
    super(node);
  }

  public static ConceptFunctionParameter_oldText newInstance(SModel sm, boolean init) {
    return (ConceptFunctionParameter_oldText) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.ConceptFunctionParameter_oldText", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConceptFunctionParameter_oldText newInstance(SModel sm) {
    return ConceptFunctionParameter_oldText.newInstance(sm, false);
  }
}
