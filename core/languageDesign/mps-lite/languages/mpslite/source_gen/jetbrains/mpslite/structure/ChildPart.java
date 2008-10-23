package jetbrains.mpslite.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ChildPart extends LinePart {
  public static final String concept = "jetbrains.mpslite.structure.ChildPart";
  public static final String SEPARATOR = "separator";

  public ChildPart(SNode node) {
    super(node);
  }

  public String getSeparator() {
    return this.getProperty(ChildPart.SEPARATOR);
  }

  public void setSeparator(String value) {
    this.setProperty(ChildPart.SEPARATOR, value);
  }


  public static ChildPart newInstance(SModel sm, boolean init) {
    return (ChildPart)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mpslite.structure.ChildPart", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ChildPart newInstance(SModel sm) {
    return ChildPart.newInstance(sm, false);
  }

}
