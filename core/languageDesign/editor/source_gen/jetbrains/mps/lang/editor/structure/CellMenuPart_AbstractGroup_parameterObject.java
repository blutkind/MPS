package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CellMenuPart_AbstractGroup_parameterObject extends ConceptFunctionParameter {
  public static final String concept = "jetbrains.mps.lang.editor.structure.CellMenuPart_AbstractGroup_parameterObject";

  public CellMenuPart_AbstractGroup_parameterObject(SNode node) {
    super(node);
  }

  public static CellMenuPart_AbstractGroup_parameterObject newInstance(SModel sm, boolean init) {
    return (CellMenuPart_AbstractGroup_parameterObject) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.CellMenuPart_AbstractGroup_parameterObject", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CellMenuPart_AbstractGroup_parameterObject newInstance(SModel sm) {
    return CellMenuPart_AbstractGroup_parameterObject.newInstance(sm, false);
  }
}
