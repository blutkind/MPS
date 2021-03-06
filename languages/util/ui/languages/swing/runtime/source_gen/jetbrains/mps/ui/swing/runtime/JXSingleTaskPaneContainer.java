package jetbrains.mps.ui.swing.runtime;

/*Generated by MPS */

import org.jdesktop.swingx.JXTaskPaneContainer;
import java.util.List;
import org.jdesktop.swingx.JXTaskPane;
import java.util.ArrayList;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import javax.swing.SwingUtilities;
import java.awt.Component;
import java.util.Iterator;

public class JXSingleTaskPaneContainer extends JXTaskPaneContainer {
  private List<JXTaskPane> myTpanes = new ArrayList<JXTaskPane>();
  private List<JXTaskPane> myTpanes_trans = new ArrayList<JXTaskPane>();
  private PropertyChangeListener myChangeListener = new PropertyChangeListener() {
    public void propertyChange(PropertyChangeEvent e) {
      if (JXSingleTaskPaneContainer.this.myTpanes_trans.isEmpty()) {
        final Boolean wascollapsed = (Boolean) e.getOldValue();
        final Boolean collapsed = (Boolean) e.getNewValue();
        if (wascollapsed != collapsed) {
          JXSingleTaskPaneContainer.this.myTpanes_trans.addAll(JXSingleTaskPaneContainer.this.myTpanes);
          JXSingleTaskPaneContainer.this.myTpanes_trans.remove(e.getSource());
          SwingUtilities.invokeLater(new Runnable() {
            public void run() {
              JXSingleTaskPaneContainer.this.setCollapsedTrans(!(collapsed));
            }
          });
        }
      }
    }
  };

  public JXSingleTaskPaneContainer() {
    super();
    this.setLayout(new VerticalStackLayout() {
      public boolean isSelected(Component c) {
        return !(((JXSingleTaskPane) c).isCollapsed());
      }
    });
  }

  public boolean proceedSetCollapsed(JXSingleTaskPane tp, boolean collapsed) {
    return !(collapsed) || !(this.myTpanes.contains(tp)) || JXSingleTaskPaneContainer.this.myTpanes_trans.contains(tp);
  }

  @Override
  public void add(JXTaskPane pane) {
    super.add(pane);
    if (!(this.myTpanes.contains(pane))) {
      boolean initcollapsed = this.myTpanes.size() > 0;
      pane.setCollapsed(initcollapsed);
      this.myTpanes.add(pane);
      pane.addPropertyChangeListener("collapsed", this.myChangeListener);
    }
  }

  @Override
  public void remove(JXTaskPane pane) {
    super.remove(pane);
    this.myTpanes.remove(pane);
    pane.removePropertyChangeListener("collapsed", this.myChangeListener);
  }

  private void setCollapsedTrans(boolean collapsed) {
    for (Iterator<JXTaskPane> it = this.myTpanes_trans.iterator(); it.hasNext();) {
      it.next().setCollapsed(collapsed);
      it.remove();
    }
  }
}
