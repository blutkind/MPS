package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.structure.PropertyDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SPropertyAccess extends SNodeOperation {
  public static final String concept = "jetbrains.mps.lang.smodel.structure.SPropertyAccess";
  public static final String PROPERTY = "property";

  public SPropertyAccess(SNode node) {
    super(node);
  }

  public PropertyDeclaration getProperty() {
    return (PropertyDeclaration)this.getReferent(SPropertyAccess.PROPERTY);
  }

  public void setProperty(PropertyDeclaration node) {
    super.setReferent(SPropertyAccess.PROPERTY, node);
  }


  public static SPropertyAccess newInstance(SModel sm, boolean init) {
    return (SPropertyAccess)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SPropertyAccess", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SPropertyAccess newInstance(SModel sm) {
    return SPropertyAccess.newInstance(sm, false);
  }

}
