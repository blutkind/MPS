package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TrimOperation extends BaseStringOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.TrimOperation";
  public static final String TRIM_KIND = "trimKind";

  public TrimOperation(SNode node) {
    super(node);
  }

  public TrimKind getTrimKind() {
    String value = super.getProperty(TrimOperation.TRIM_KIND);
    return TrimKind.parseValue(value);
  }

  public void setTrimKind(TrimKind value) {
    super.setProperty(TrimOperation.TRIM_KIND, value.getValueAsString());
  }

  public static TrimOperation newInstance(SModel sm, boolean init) {
    return (TrimOperation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.TrimOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TrimOperation newInstance(SModel sm) {
    return TrimOperation.newInstance(sm, false);
  }
}
