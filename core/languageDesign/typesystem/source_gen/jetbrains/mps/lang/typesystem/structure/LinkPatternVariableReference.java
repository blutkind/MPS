package jetbrains.mps.lang.typesystem.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.pattern.structure.LinkPatternVariableDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class LinkPatternVariableReference extends Expression {
  public static final String concept = "jetbrains.mps.lang.typesystem.structure.LinkPatternVariableReference";
  public static final String PATTERN_VAR_DECL = "patternVarDecl";

  public LinkPatternVariableReference(SNode node) {
    super(node);
  }

  public LinkPatternVariableDeclaration getPatternVarDecl() {
    return (LinkPatternVariableDeclaration)this.getReferent(LinkPatternVariableReference.PATTERN_VAR_DECL);
  }

  public void setPatternVarDecl(LinkPatternVariableDeclaration node) {
    super.setReferent(LinkPatternVariableReference.PATTERN_VAR_DECL, node);
  }


  public static LinkPatternVariableReference newInstance(SModel sm, boolean init) {
    return (LinkPatternVariableReference)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.LinkPatternVariableReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static LinkPatternVariableReference newInstance(SModel sm) {
    return LinkPatternVariableReference.newInstance(sm, false);
  }

}
