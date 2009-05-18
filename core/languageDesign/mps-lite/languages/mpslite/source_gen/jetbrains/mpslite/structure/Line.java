package jetbrains.mpslite.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Line extends BaseConcept {
  public static final String concept = "jetbrains.mpslite.structure.Line";
  public static final String LINE_PART = "linePart";

  public Line(SNode node) {
    super(node);
  }

  public int getLinePartsCount() {
    return this.getChildCount(Line.LINE_PART);
  }

  public Iterator<LinePart> lineParts() {
    return this.children(LinePart.class, Line.LINE_PART);
  }

  public List<LinePart> getLineParts() {
    return this.getChildren(LinePart.class, Line.LINE_PART);
  }

  public void addLinePart(LinePart node) {
    this.addChild(Line.LINE_PART, node);
  }

  public void insertLinePart(LinePart prev, LinePart node) {
    this.insertChild(prev, Line.LINE_PART, node);
  }


  public static Line newInstance(SModel sm, boolean init) {
    return (Line)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mpslite.structure.Line", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Line newInstance(SModel sm) {
    return Line.newInstance(sm, false);
  }

}
