package jetbrains.mps.bootstrap.helgins.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.baseLanguage.structure.Expression;

public class NormalTypeClause extends TypeClause {
  public static final String concept = "jetbrains.mps.bootstrap.helgins.structure.NormalTypeClause";
  public static String NORMAL_TYPE = "normalType";

  public  NormalTypeClause(SNode node) {
    super(node);
  }

  public static NormalTypeClause newInstance(SModel sm, boolean init) {
    return ((NormalTypeClause)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.helgins.structure.NormalTypeClause", sm, GlobalScope.getInstance(), init).getAdapter());
  }

  public static NormalTypeClause newInstance(SModel sm) {
    return NormalTypeClause.newInstance(sm, false);
  }


  public Expression getNormalType() {
    return ((Expression)this.getChild(NormalTypeClause.NORMAL_TYPE));
  }

  public void setNormalType(Expression node) {
    super.setChild(NormalTypeClause.NORMAL_TYPE, node);
  }

}
