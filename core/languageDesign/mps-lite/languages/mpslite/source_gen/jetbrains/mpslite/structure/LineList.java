package jetbrains.mpslite.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mpslite.structure.Line;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class LineList extends BaseConcept {
  public static final String concept = "jetbrains.mpslite.structure.LineList";
  public static final String LINE = "line";

  public LineList(SNode node) {
    super(node);
  }

  public int getLinesCount() {
    return this.getChildCount(LineList.LINE);
  }

  public Iterator<Line> lines() {
    return this.children(Line.class, LineList.LINE);
  }

  public List<Line> getLines() {
    return this.getChildren(Line.class, LineList.LINE);
  }

  public void addLine(Line node) {
    this.addChild(LineList.LINE, node);
  }

  public void insertLine(Line prev, Line node) {
    this.insertChild(prev, LineList.LINE, node);
  }


  public static LineList newInstance(SModel sm, boolean init) {
    return (LineList)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mpslite.structure.LineList", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static LineList newInstance(SModel sm) {
    return LineList.newInstance(sm, false);
  }

}
