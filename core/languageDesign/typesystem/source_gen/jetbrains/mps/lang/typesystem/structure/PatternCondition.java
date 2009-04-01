package jetbrains.mps.lang.typesystem.structure;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.structure.ApplicableNodeCondition;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.pattern.structure.PatternExpression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PatternCondition extends ApplicableNodeCondition {
  public static final String concept = "jetbrains.mps.lang.typesystem.structure.PatternCondition";
  public static final String PATTERN = "pattern";

  public PatternCondition(SNode node) {
    super(node);
  }

  public PatternExpression getPattern() {
    return (PatternExpression)this.getChild(PatternExpression.class, PatternCondition.PATTERN);
  }

  public void setPattern(PatternExpression node) {
    super.setChild(PatternCondition.PATTERN, node);
  }


  public static PatternCondition newInstance(SModel sm, boolean init) {
    return (PatternCondition)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.PatternCondition", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PatternCondition newInstance(SModel sm) {
    return PatternCondition.newInstance(sm, false);
  }

}
