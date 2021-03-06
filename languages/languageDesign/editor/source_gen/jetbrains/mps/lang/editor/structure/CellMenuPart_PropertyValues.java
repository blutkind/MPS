package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CellMenuPart_PropertyValues extends CellMenuPart_Abstract {
  public static final String concept = "jetbrains.mps.lang.editor.structure.CellMenuPart_PropertyValues";
  public static final String VALUES_FUNCTION = "valuesFunction";

  public CellMenuPart_PropertyValues(SNode node) {
    super(node);
  }

  public CellMenuPart_PropertyValues_GetValues getValuesFunction() {
    return (CellMenuPart_PropertyValues_GetValues) this.getChild(CellMenuPart_PropertyValues_GetValues.class, CellMenuPart_PropertyValues.VALUES_FUNCTION);
  }

  public void setValuesFunction(CellMenuPart_PropertyValues_GetValues node) {
    super.setChild(CellMenuPart_PropertyValues.VALUES_FUNCTION, node);
  }

  public static CellMenuPart_PropertyValues newInstance(SModel sm, boolean init) {
    return (CellMenuPart_PropertyValues) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.CellMenuPart_PropertyValues", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CellMenuPart_PropertyValues newInstance(SModel sm) {
    return CellMenuPart_PropertyValues.newInstance(sm, false);
  }
}
