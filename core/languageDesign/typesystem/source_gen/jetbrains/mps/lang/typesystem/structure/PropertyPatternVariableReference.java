package jetbrains.mps.lang.typesystem.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.pattern.structure.PropertyPatternVariableDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PropertyPatternVariableReference extends Expression {
  public static final String concept = "jetbrains.mps.lang.typesystem.structure.PropertyPatternVariableReference";
  public static final String PATTERN_VAR_DECL = "patternVarDecl";

  public PropertyPatternVariableReference(SNode node) {
    super(node);
  }

  public PropertyPatternVariableDeclaration getPatternVarDecl() {
    return (PropertyPatternVariableDeclaration)this.getReferent(PropertyPatternVariableReference.PATTERN_VAR_DECL);
  }

  public void setPatternVarDecl(PropertyPatternVariableDeclaration node) {
    super.setReferent(PropertyPatternVariableReference.PATTERN_VAR_DECL, node);
  }


  public static PropertyPatternVariableReference newInstance(SModel sm, boolean init) {
    return (PropertyPatternVariableReference)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.PropertyPatternVariableReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PropertyPatternVariableReference newInstance(SModel sm) {
    return PropertyPatternVariableReference.newInstance(sm, false);
  }

}
