package jetbrains.mps.vcs.actions;

/*Generated by MPS */

import jetbrains.mps.generator.generationTypes.IGenerationHandler;
import jetbrains.mps.ide.generator.OutputViewGenerationHandler;

public class GenerateTextFromChangeListAction extends GenerateFromChangeListAction {
  public GenerateTextFromChangeListAction() {
  }

  protected IGenerationHandler getGenerationHandler() {
    return new OutputViewGenerationHandler();
  }

  protected String getWhatToGenerateName() {
    return "Text";
  }
}
