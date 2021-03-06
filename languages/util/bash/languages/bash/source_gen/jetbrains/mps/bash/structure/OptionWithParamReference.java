package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class OptionWithParamReference extends ExternalOptionReference {
  public static final String concept = "jetbrains.mps.bash.structure.OptionWithParamReference";
  public static final String OPTION_WITH_PARAM = "optionWithParam";
  public static final String WORD = "word";

  public OptionWithParamReference(SNode node) {
    super(node);
  }

  public OptionWithParam getOptionWithParam() {
    return (OptionWithParam) this.getReferent(OptionWithParam.class, OptionWithParamReference.OPTION_WITH_PARAM);
  }

  public void setOptionWithParam(OptionWithParam node) {
    super.setReferent(OptionWithParamReference.OPTION_WITH_PARAM, node);
  }

  public GeneralizedWord getWord() {
    return (GeneralizedWord) this.getChild(GeneralizedWord.class, OptionWithParamReference.WORD);
  }

  public void setWord(GeneralizedWord node) {
    super.setChild(OptionWithParamReference.WORD, node);
  }

  public static OptionWithParamReference newInstance(SModel sm, boolean init) {
    return (OptionWithParamReference) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bash.structure.OptionWithParamReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static OptionWithParamReference newInstance(SModel sm) {
    return OptionWithParamReference.newInstance(sm, false);
  }
}
