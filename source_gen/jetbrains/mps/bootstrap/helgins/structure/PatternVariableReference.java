package jetbrains.mps.bootstrap.helgins.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.patterns.structure.PatternVariableDeclaration;

public class PatternVariableReference extends Expression {
  public static String PATTERN_VAR_DECL = "patternVarDecl";

  public  PatternVariableReference(SNode node) {
    super(node);
  }

  public static PatternVariableReference newInstance(SModel sm, boolean init) {
    return (PatternVariableReference)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.helgins.PatternVariableReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static PatternVariableReference newInstance(SModel sm) {
    return PatternVariableReference.newInstance(sm, false);
  }

  public PatternVariableDeclaration getPatternVarDecl() {
    return (PatternVariableDeclaration)this.getReferent(PatternVariableReference.PATTERN_VAR_DECL);
  }
  public void setPatternVarDecl(PatternVariableDeclaration node) {
    super.setReferent(PatternVariableReference.PATTERN_VAR_DECL, node);
  }
}
