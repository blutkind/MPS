package jetbrains.mps.graphLayout.graphLayout;

/*Generated by MPS */

import java.util.List;
import java.awt.Point;
import java.awt.Dimension;

public class EdgeLayout {
  private List<Point> myPath;
  private Dimension myLabelDimension;
  private Point myLabelAnchor;

  public EdgeLayout(List<Point> path) {
    myPath = path;
    myLabelDimension = null;
    myLabelAnchor = null;
  }

  public void setLabelLayout(Point anchor, Dimension labelDimension) {
    myLabelAnchor = anchor;
    myLabelDimension = labelDimension;
  }
}
