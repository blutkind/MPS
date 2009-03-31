package jetbrains.mps.baseLanguage.regexp.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.regexp.structure.MatchParensRegexp;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MatchVariableReference extends Expression {
  public static final String concept = "jetbrains.mps.baseLanguage.regexp.structure.MatchVariableReference";
  public static final String MATCH = "match";

  public MatchVariableReference(SNode node) {
    super(node);
  }

  public MatchParensRegexp getMatch() {
    return (MatchParensRegexp)this.getReferent(MatchParensRegexp.class, MatchVariableReference.MATCH);
  }

  public void setMatch(MatchParensRegexp node) {
    super.setReferent(MatchVariableReference.MATCH, node);
  }


  public static MatchVariableReference newInstance(SModel sm, boolean init) {
    return (MatchVariableReference)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.regexp.structure.MatchVariableReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MatchVariableReference newInstance(SModel sm) {
    return MatchVariableReference.newInstance(sm, false);
  }

}
