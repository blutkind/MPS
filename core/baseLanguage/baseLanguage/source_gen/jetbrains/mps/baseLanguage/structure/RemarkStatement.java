package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class RemarkStatement extends Statement {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.RemarkStatement";
  public static final String VALUE = "value";

  public RemarkStatement(SNode node) {
    super(node);
  }

  public String getValue() {
    return this.getProperty(RemarkStatement.VALUE);
  }

  public void setValue(String value) {
    this.setProperty(RemarkStatement.VALUE, value);
  }

  public static RemarkStatement newInstance(SModel sm, boolean init) {
    return (RemarkStatement) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.RemarkStatement", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static RemarkStatement newInstance(SModel sm) {
    return RemarkStatement.newInstance(sm, false);
  }
}
