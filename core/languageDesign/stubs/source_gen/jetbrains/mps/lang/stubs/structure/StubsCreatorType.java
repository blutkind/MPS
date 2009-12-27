package jetbrains.mps.lang.stubs.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.classifiers.structure.BaseClassifierType;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class StubsCreatorType extends BaseClassifierType {
  public static final String concept = "jetbrains.mps.lang.stubs.structure.StubsCreatorType";
  public static final String CREATOR_DECLARATION = "creatorDeclaration";

  public StubsCreatorType(SNode node) {
    super(node);
  }

  public StubsCreatorDeclaration getCreatorDeclaration() {
    return (StubsCreatorDeclaration) this.getReferent(StubsCreatorDeclaration.class, StubsCreatorType.CREATOR_DECLARATION);
  }

  public void setCreatorDeclaration(StubsCreatorDeclaration node) {
    super.setReferent(StubsCreatorType.CREATOR_DECLARATION, node);
  }

  public static StubsCreatorType newInstance(SModel sm, boolean init) {
    return (StubsCreatorType) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.stubs.structure.StubsCreatorType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static StubsCreatorType newInstance(SModel sm) {
    return StubsCreatorType.newInstance(sm, false);
  }
}
