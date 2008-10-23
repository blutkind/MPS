package jetbrains.mps.lang.typesystem.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TypeVarReference extends Expression {
  public static final String concept = "jetbrains.mps.lang.typesystem.structure.TypeVarReference";
  public static final String TYPE_VAR_DECLARATION = "typeVarDeclaration";

  public TypeVarReference(SNode node) {
    super(node);
  }

  public TypeVarDeclaration getTypeVarDeclaration() {
    return (TypeVarDeclaration)this.getReferent(TypeVarReference.TYPE_VAR_DECLARATION);
  }

  public void setTypeVarDeclaration(TypeVarDeclaration node) {
    super.setReferent(TypeVarReference.TYPE_VAR_DECLARATION, node);
  }


  public static TypeVarReference newInstance(SModel sm, boolean init) {
    return (TypeVarReference)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.TypeVarReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TypeVarReference newInstance(SModel sm) {
    return TypeVarReference.newInstance(sm, false);
  }

}
