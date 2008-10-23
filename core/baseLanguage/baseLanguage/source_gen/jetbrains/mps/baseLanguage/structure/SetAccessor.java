package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SetAccessor extends BaseConcept {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.SetAccessor";
  public static final String STATEMENT_LIST = "statementList";

  public SetAccessor(SNode node) {
    super(node);
  }

  public StatementList getStatementList() {
    return (StatementList)this.getChild(SetAccessor.STATEMENT_LIST);
  }

  public void setStatementList(StatementList node) {
    super.setChild(SetAccessor.STATEMENT_LIST, node);
  }


  public static SetAccessor newInstance(SModel sm, boolean init) {
    return (SetAccessor)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.SetAccessor", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SetAccessor newInstance(SModel sm) {
    return SetAccessor.newInstance(sm, false);
  }

}
