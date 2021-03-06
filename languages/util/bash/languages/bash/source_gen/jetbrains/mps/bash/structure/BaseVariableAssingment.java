package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class BaseVariableAssingment extends AbstractCommand {
  public static final String concept = "jetbrains.mps.bash.structure.BaseVariableAssingment";
  public static final String CPR_AssingmentSign = "assingmentSign";
  public static final String LVALUE = "lvalue";
  public static final String VALUE = "value";

  public BaseVariableAssingment(SNode node) {
    super(node);
  }

  public LValue getLvalue() {
    return (LValue) this.getChild(LValue.class, BaseVariableAssingment.LVALUE);
  }

  public void setLvalue(LValue node) {
    super.setChild(BaseVariableAssingment.LVALUE, node);
  }

  public GeneralizedWord getValue() {
    return (GeneralizedWord) this.getChild(GeneralizedWord.class, BaseVariableAssingment.VALUE);
  }

  public void setValue(GeneralizedWord node) {
    super.setChild(BaseVariableAssingment.VALUE, node);
  }

  public static BaseVariableAssingment newInstance(SModel sm, boolean init) {
    return (BaseVariableAssingment) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bash.structure.BaseVariableAssingment", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static BaseVariableAssingment newInstance(SModel sm) {
    return BaseVariableAssingment.newInstance(sm, false);
  }
}
