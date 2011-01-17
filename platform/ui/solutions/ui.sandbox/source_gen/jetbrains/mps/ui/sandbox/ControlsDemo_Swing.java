package jetbrains.mps.ui.sandbox;

/*Generated by MPS */

import javax.swing.JComponent;
import org.jdesktop.swingx.JXHyperlink;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import javax.swing.JPanel;
import java.util.Iterator;
import jetbrains.mps.ui.swing.runtime.JComponentIterator;
import jetbrains.mps.ui.swing.runtime.DockLayout;
import jetbrains.mps.ui.swing.runtime.DockLayoutData;
import javax.swing.JTabbedPane;
import javax.swing.ButtonGroup;
import java.awt.GridLayout;
import javax.swing.JTree;
import javax.swing.tree.TreeNode;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;
import java.util.Arrays;

public class ControlsDemo_Swing {
  private UIDemo_Swing uidemo;

  public ControlsDemo_Swing(UIDemo_Swing uiDemo) {
    this.uidemo = uiDemo;
  }

  public void buildUI(JComponent menu) {
    final JXHyperlink widget_e1wtj0_a0a0a = new JXHyperlink();
    widget_e1wtj0_a0a0a.setText("Tree");
    widget_e1wtj0_a0a0a.setActionCommand("tree");
    widget_e1wtj0_a0a0a.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        _FunctionTypes._void_P1_E0<? super ActionEvent> h = new _FunctionTypes._void_P1_E0<ActionEvent>() {
          public void invoke(ActionEvent event) {
            tree();
          }
        };
        h.invoke(e);
      }
    });
    menu.add(widget_e1wtj0_a0a0a);
    final JXHyperlink widget_e1wtj0_b0a0a = new JXHyperlink();
    widget_e1wtj0_b0a0a.setText("Table");
    widget_e1wtj0_b0a0a.setActionCommand("tree");
    widget_e1wtj0_b0a0a.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        _FunctionTypes._void_P1_E0<? super ActionEvent> h = new _FunctionTypes._void_P1_E0<ActionEvent>() {
          public void invoke(ActionEvent event) {
            table();
          }
        };
        h.invoke(e);
      }
    });
    menu.add(widget_e1wtj0_b0a0a);
  }

  public void tree() {
    final JPanel dc = this.uidemo.getDemoContainer();
    for (Iterator<JComponent> it = new JComponentIterator(dc) {
      @Override
      public boolean accept(JComponent item) {
        return ((DockLayout) dc.getLayout()).getConstraints(item) == DockLayoutData.CENTER;
      }
    }; it.hasNext();) {
      it.next();
      it.remove();
    }
    final JTabbedPane widget_e1wtj0_b0b0b = new JTabbedPane();
    final ButtonGroup buttonGroup_e1wtj0_a0c0b0b = new ButtonGroup();
    final JPanel widget_e1wtj0_a0a1a1a1 = new JPanel(new GridLayout(1, 1));
    final ButtonGroup buttonGroup_e1wtj0_a0b0d0b0b = new ButtonGroup();
    final JTree widget_e1wtj0_a0a0a0b0b0b = new JTree();
    final TreeNode widget_e1wtj0_a0a0a0a0a1a1a1 = new DefaultMutableTreeNode();
    ((DefaultMutableTreeNode) widget_e1wtj0_a0a0a0a0a1a1a1).setUserObject("ROOT");
    for (int i = 0; i < 5; i++) {
      final TreeNode widget_e1wtj0_a0a0a0a0a0a0a0b0b0b = new DefaultMutableTreeNode();
      ((DefaultMutableTreeNode) widget_e1wtj0_a0a0a0a0a0a0a0b0b0b).setUserObject("Leaf");
      ((DefaultMutableTreeNode) widget_e1wtj0_a0a0a0a0a1a1a1).add((MutableTreeNode) widget_e1wtj0_a0a0a0a0a0a0a0b0b0b);
    }
    widget_e1wtj0_a0a0a0b0b0b.setModel(new DefaultTreeModel(widget_e1wtj0_a0a0a0a0a1a1a1));
    widget_e1wtj0_a0a1a1a1.add(widget_e1wtj0_a0a0a0b0b0b);
    widget_e1wtj0_b0b0b.addTab("Tree", widget_e1wtj0_a0a1a1a1);
    dc.add(widget_e1wtj0_b0b0b, DockLayoutData.CENTER);
    dc.doLayout();
  }

  public void table() {
    final JPanel dc = this.uidemo.getDemoContainer();
    for (Iterator<JComponent> it = new JComponentIterator(dc) {
      @Override
      public boolean accept(JComponent item) {
        return ((DockLayout) dc.getLayout()).getConstraints(item) == DockLayoutData.CENTER;
      }
    }; it.hasNext();) {
      it.next();
      it.remove();
    }
    final JTabbedPane widget_e1wtj0_b0b0c = new JTabbedPane();
    final ButtonGroup buttonGroup_e1wtj0_a0c0b0c = new ButtonGroup();
    final JPanel widget_e1wtj0_a0a1a1a2 = new JPanel(new GridLayout(1, 1));
    final ButtonGroup buttonGroup_e1wtj0_a0b0d0b0c = new ButtonGroup();
    final JScrollPane widget_e1wtj0_a0a0a0b0b0c = new _FunctionTypes._return_P0_E0<JScrollPane>() {
      public JScrollPane invoke() {
        JTable jt = new JTable();
        return new JScrollPane(jt);
      }
    }.invoke();
    final JTable theTable_e1wtj0_a0b0c0d0b0c = (JTable) widget_e1wtj0_a0a0a0b0b0c.getViewport().getView();
    final TableColumn widget_e1wtj0_a0a0a0a0a1a1a2 = new TableColumn(theTable_e1wtj0_a0b0c0d0b0c.getColumnCount());
    widget_e1wtj0_a0a0a0a0a1a1a2.setHeaderValue("Foo");
    ((JTable) widget_e1wtj0_a0a0a0b0b0c.getViewport().getView()).addColumn(widget_e1wtj0_a0a0a0a0a1a1a2);
    ((DefaultTableModel) ((JTable) widget_e1wtj0_a0a0a0b0b0c.getViewport().getView()).getModel()).addColumn(widget_e1wtj0_a0a0a0a0a1a1a2.getHeaderValue());
    final TableColumn widget_e1wtj0_b0a0a0a0a1a1a2 = new TableColumn(theTable_e1wtj0_a0b0c0d0b0c.getColumnCount());
    widget_e1wtj0_b0a0a0a0a1a1a2.setHeaderValue("Bar");
    ((JTable) widget_e1wtj0_a0a0a0b0b0c.getViewport().getView()).addColumn(widget_e1wtj0_b0a0a0a0a1a1a2);
    ((DefaultTableModel) ((JTable) widget_e1wtj0_a0a0a0b0b0c.getViewport().getView()).getModel()).addColumn(widget_e1wtj0_b0a0a0a0a1a1a2.getHeaderValue());
    for (int i = 0; i < 128; i++) {
      final Vector<Object> widget_e1wtj0_a0a0b0a0a0a1a1a2 = new Vector();
      widget_e1wtj0_a0a0b0a0a0a1a1a2.clear();
      widget_e1wtj0_a0a0b0a0a0a1a1a2.addAll(Arrays.asList(new String[]{"" + (i + 32), "" + Character.valueOf((char) (' ' + i))}));
      ((DefaultTableModel) ((JTable) widget_e1wtj0_a0a0a0b0b0c.getViewport().getView()).getModel()).addRow(widget_e1wtj0_a0a0b0a0a0a1a1a2);
    }
    widget_e1wtj0_a0a1a1a2.add(widget_e1wtj0_a0a0a0b0b0c);
    widget_e1wtj0_b0b0c.addTab("Tree", widget_e1wtj0_a0a1a1a2);
    dc.add(widget_e1wtj0_b0b0c, DockLayoutData.CENTER);
    dc.doLayout();
  }
}
