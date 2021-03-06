package jetbrains.mps.debugger.api.ui.breakpoints;

/*Generated by MPS */

import jetbrains.mps.debug.api.breakpoints.IBreakpoint;
import java.awt.Color;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.debug.api.breakpoints.ILocationBreakpoint;

/*package*/ class BreakpointPainter extends EditorCellPainter<IBreakpoint> {
  private static final Color CELL_BACKGROUND_COLOR = new Color(255, 200, 200, 50);
  private static final Color STRIPE_BACKGROUND_COLOR = new Color(255, 200, 200);
  private static final Color FRAME_COLOR = new Color(255, 100, 100);

  private final IBreakpoint myBreakpoint;

  public BreakpointPainter(IBreakpoint mpsBreakpoint) {
    myBreakpoint = mpsBreakpoint;
  }

  @Override
  protected SNode getSNode() {
    if (myBreakpoint instanceof ILocationBreakpoint) {
      return ((ILocationBreakpoint) myBreakpoint).getLocation().getSNode();
    } else {
      return null;
    }
  }

  @Override
  protected Color getCellBackgroundColor() {
    return CELL_BACKGROUND_COLOR;
  }

  @Override
  protected Color getStripeBackgroundColor() {
    return STRIPE_BACKGROUND_COLOR;
  }

  @Override
  protected Color getFrameColor() {
    return FRAME_COLOR;
  }

  @Override
  public IBreakpoint getItem() {
    return myBreakpoint;
  }
}
