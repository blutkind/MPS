package jetbrains.mps.xmlSchema.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TextLine extends BaseConcept {
  public static final String concept = "jetbrains.mps.xmlSchema.structure.TextLine";
  public static final String LINE = "line";

  public TextLine(SNode node) {
    super(node);
  }

  public String getLine() {
    return this.getProperty(TextLine.LINE);
  }

  public void setLine(String value) {
    this.setProperty(TextLine.LINE, value);
  }


  public static TextLine newInstance(SModel sm, boolean init) {
    return (TextLine)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.xmlSchema.structure.TextLine", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TextLine newInstance(SModel sm) {
    return TextLine.newInstance(sm, false);
  }

}
