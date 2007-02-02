package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.core.structure.NamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil;
import jetbrains.mps.project.GlobalScope;
import java.util.Iterator;
import java.util.List;

public class GenericDeclaration extends NamedConcept {
  public static String TYPE_VARIABLE_DECLARATION = "typeVariableDeclaration";

  public  GenericDeclaration(SNode node) {
    super(node);
  }

  public static GenericDeclaration newInstance(SModel sm) {
    return (GenericDeclaration)SModelUtil.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.GenericDeclaration", sm, GlobalScope.getInstance()).getAdapter();
  }

  public int getTypeVariableDeclarationsCount() {
    return this.getChildCount(GenericDeclaration.TYPE_VARIABLE_DECLARATION);
  }
  public Iterator<TypeVariableDeclaration> typeVariableDeclarations() {
    return this.children(GenericDeclaration.TYPE_VARIABLE_DECLARATION);
  }
  public List<TypeVariableDeclaration> getTypeVariableDeclarations() {
    return this.getChildren(GenericDeclaration.TYPE_VARIABLE_DECLARATION);
  }
  public void addTypeVariableDeclaration(TypeVariableDeclaration node) {
    this.addChild(GenericDeclaration.TYPE_VARIABLE_DECLARATION, node);
  }
  public void insertTypeVariableDeclaration(TypeVariableDeclaration prev, TypeVariableDeclaration node) {
    this.insertChild(prev, GenericDeclaration.TYPE_VARIABLE_DECLARATION, node);
  }
}
