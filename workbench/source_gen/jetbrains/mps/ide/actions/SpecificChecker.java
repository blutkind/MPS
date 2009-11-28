package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SNode;

public abstract class SpecificChecker {
  private ModelChecker myModelChecker;

  protected SpecificChecker(ModelChecker modelChecker) {
    this.myModelChecker = modelChecker;
  }

  protected ModelChecker getModelChecker() {
    return this.myModelChecker;
  }

  public abstract void checkModel(SModel model);

  protected void addIssue(SNode node, String message, String category, ModelCheckerFix fix) {
    this.myModelChecker.addIssue(node, message, category, fix);
  }

  protected void addIssue(SNode node, String message) {
    addIssue(node, message, ModelChecker.CATEGORY_WARNING, null);
  }
}
