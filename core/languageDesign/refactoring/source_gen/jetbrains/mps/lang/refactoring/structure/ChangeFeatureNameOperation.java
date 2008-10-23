package jetbrains.mps.lang.refactoring.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Statement;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ChangeFeatureNameOperation extends Statement {
  public static final String concept = "jetbrains.mps.lang.refactoring.structure.ChangeFeatureNameOperation";
  public static final String FEATURE = "feature";
  public static final String NEW_CONCEPT_F_Q_NAME = "newConceptFQName";
  public static final String NEW_FEATURE_NAME = "newFeatureName";

  public ChangeFeatureNameOperation(SNode node) {
    super(node);
  }

  public Expression getFeature() {
    return (Expression)this.getChild(ChangeFeatureNameOperation.FEATURE);
  }

  public void setFeature(Expression node) {
    super.setChild(ChangeFeatureNameOperation.FEATURE, node);
  }

  public Expression getNewConceptFQName() {
    return (Expression)this.getChild(ChangeFeatureNameOperation.NEW_CONCEPT_F_Q_NAME);
  }

  public void setNewConceptFQName(Expression node) {
    super.setChild(ChangeFeatureNameOperation.NEW_CONCEPT_F_Q_NAME, node);
  }

  public Expression getNewFeatureName() {
    return (Expression)this.getChild(ChangeFeatureNameOperation.NEW_FEATURE_NAME);
  }

  public void setNewFeatureName(Expression node) {
    super.setChild(ChangeFeatureNameOperation.NEW_FEATURE_NAME, node);
  }


  public static ChangeFeatureNameOperation newInstance(SModel sm, boolean init) {
    return (ChangeFeatureNameOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.refactoring.structure.ChangeFeatureNameOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ChangeFeatureNameOperation newInstance(SModel sm) {
    return ChangeFeatureNameOperation.newInstance(sm, false);
  }

}
