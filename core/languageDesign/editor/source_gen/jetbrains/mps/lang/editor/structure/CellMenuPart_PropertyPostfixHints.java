package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CellMenuPart_PropertyPostfixHints extends CellMenuPart_Abstract {
  public static final String concept = "jetbrains.mps.lang.editor.structure.CellMenuPart_PropertyPostfixHints";
  public static final String POSTFIXES_FUNCTION = "postfixesFunction";

  public CellMenuPart_PropertyPostfixHints(SNode node) {
    super(node);
  }

  public CellMenuPart_PropertyPostfixHints_GetPostfixes getPostfixesFunction() {
    return (CellMenuPart_PropertyPostfixHints_GetPostfixes)this.getChild(CellMenuPart_PropertyPostfixHints.POSTFIXES_FUNCTION);
  }

  public void setPostfixesFunction(CellMenuPart_PropertyPostfixHints_GetPostfixes node) {
    super.setChild(CellMenuPart_PropertyPostfixHints.POSTFIXES_FUNCTION, node);
  }


  public static CellMenuPart_PropertyPostfixHints newInstance(SModel sm, boolean init) {
    return (CellMenuPart_PropertyPostfixHints)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.CellMenuPart_PropertyPostfixHints", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CellMenuPart_PropertyPostfixHints newInstance(SModel sm) {
    return CellMenuPart_PropertyPostfixHints.newInstance(sm, false);
  }

}
