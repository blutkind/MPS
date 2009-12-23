package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CellMenuPart_Generic_Group extends CellMenuPart_AbstractGroup {
  public static final String concept = "jetbrains.mps.lang.editor.structure.CellMenuPart_Generic_Group";
  public static final String PARAMETERS_FUNCTION = "parametersFunction";
  public static final String HANDLER_FUNCTION = "handlerFunction";

  public CellMenuPart_Generic_Group(SNode node) {
    super(node);
  }

  public CellMenuPart_AbstractGroup_Query getParametersFunction() {
    return (CellMenuPart_AbstractGroup_Query) this.getChild(CellMenuPart_AbstractGroup_Query.class, CellMenuPart_Generic_Group.PARAMETERS_FUNCTION);
  }

  public void setParametersFunction(CellMenuPart_AbstractGroup_Query node) {
    super.setChild(CellMenuPart_Generic_Group.PARAMETERS_FUNCTION, node);
  }

  public CellMenuPart_Generic_Group_Handler getHandlerFunction() {
    return (CellMenuPart_Generic_Group_Handler) this.getChild(CellMenuPart_Generic_Group_Handler.class, CellMenuPart_Generic_Group.HANDLER_FUNCTION);
  }

  public void setHandlerFunction(CellMenuPart_Generic_Group_Handler node) {
    super.setChild(CellMenuPart_Generic_Group.HANDLER_FUNCTION, node);
  }

  public static CellMenuPart_Generic_Group newInstance(SModel sm, boolean init) {
    return (CellMenuPart_Generic_Group) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.CellMenuPart_Generic_Group", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CellMenuPart_Generic_Group newInstance(SModel sm) {
    return CellMenuPart_Generic_Group.newInstance(sm, false);
  }
}
