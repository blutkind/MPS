package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil;
import jetbrains.mps.project.GlobalScope;

public class LocalVariableDeclarationStatement extends Statement {
  public static String LOCAL_VARIABLE_DECLARATION = "localVariableDeclaration";

  public  LocalVariableDeclarationStatement(SNode node) {
    super(node);
  }

  public static LocalVariableDeclarationStatement newInstance(SModel sm) {
    return (LocalVariableDeclarationStatement)SModelUtil.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement", sm, GlobalScope.getInstance()).getAdapter();
  }

  public LocalVariableDeclaration getLocalVariableDeclaration() {
    return (LocalVariableDeclaration)this.getChild(LocalVariableDeclarationStatement.LOCAL_VARIABLE_DECLARATION);
  }
  public void setLocalVariableDeclaration(LocalVariableDeclaration node) {
    super.setChild(LocalVariableDeclarationStatement.LOCAL_VARIABLE_DECLARATION, node);
  }
}
