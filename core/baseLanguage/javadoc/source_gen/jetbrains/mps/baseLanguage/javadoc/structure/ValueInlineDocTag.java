package jetbrains.mps.baseLanguage.javadoc.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ValueInlineDocTag extends BaseInlineDocTag {
  public static final String concept = "jetbrains.mps.baseLanguage.javadoc.structure.ValueInlineDocTag";
  public static final String VARIABLE_REFERENCE = "variableReference";

  public ValueInlineDocTag(SNode node) {
    super(node);
  }

  public BaseVariableDocReference getVariableReference() {
    return (BaseVariableDocReference)this.getChild(BaseVariableDocReference.class, ValueInlineDocTag.VARIABLE_REFERENCE);
  }

  public void setVariableReference(BaseVariableDocReference node) {
    super.setChild(ValueInlineDocTag.VARIABLE_REFERENCE, node);
  }

  public static ValueInlineDocTag newInstance(SModel sm, boolean init) {
    return (ValueInlineDocTag)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.javadoc.structure.ValueInlineDocTag", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ValueInlineDocTag newInstance(SModel sm) {
    return ValueInlineDocTag.newInstance(sm, false);
  }
}
