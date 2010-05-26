package jetbrains.mps.ui.sandbox;

/*Generated by MPS */

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import java.util.Iterator;
import org.eclipse.swt.widgets.Control;
import jetbrains.mps.ui.swt.runtime.widgets.ControlIterator;
import jetbrains.mps.ui.swt.runtime.layout.DockLayoutData;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

public class ControlsDemo_SWT {
  private UIDemo_SWT uidemo;

  public ControlsDemo_SWT(UIDemo_SWT uiDemo) {
    this.uidemo = uiDemo;
  }

  public void buildUI(Composite menu) {
    final Link widget_z347t1_a0a0a = new Link(menu, SWT.NONE);
    widget_z347t1_a0a0a.setText("<A>" + "Tree" + "</A>");
    widget_z347t1_a0a0a.setData("historyToken", "tree");
    widget_z347t1_a0a0a.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(SelectionEvent e) {
        new _FunctionTypes._void_P1_E0<SelectionEvent>() {
          public void invoke(SelectionEvent event) {
            tree();
          }
        }.invoke(e);
      }
    });
    //  with SWT items are not added to container
    final Link widget_z347t1_b0a0a = new Link(menu, SWT.NONE);
    widget_z347t1_b0a0a.setText("<A>" + "Table" + "</A>");
    widget_z347t1_b0a0a.setData("historyToken", "tree");
    widget_z347t1_b0a0a.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(SelectionEvent e) {
        new _FunctionTypes._void_P1_E0<SelectionEvent>() {
          public void invoke(SelectionEvent event) {
            table();
          }
        }.invoke(e);
      }
    });
    //  with SWT items are not added to container
  }

  public void tree() {
    final Composite dc = this.uidemo.getDemoContainer();
    for (Iterator<Control> it = new ControlIterator(dc) {
      @Override
      public boolean accept(Control item) {
        return DockLayoutData.CENTER == item.getLayoutData();
      }
    }; it.hasNext();) {
      it.next();
      it.remove();
    }
    final TabFolder widget_z347t1_b0b0b = new TabFolder(dc, SWT.BORDER);
    final Composite widget_z347t1_a0a1a1a1 = new _FunctionTypes._return_P1_E0<Composite, Composite>() {
      public Composite invoke(Composite context_z347t1_a) {
        Composite cmp = new Composite(widget_z347t1_b0b0b, SWT.NONE);
        cmp.setLayout(new FillLayout());
        return cmp;
      }
    }.invoke(widget_z347t1_b0b0b);
    final Tree widget_z347t1_a0a0a0b0b0b = new Tree(widget_z347t1_a0a1a1a1, SWT.NONE);
    final TreeItem widget_z347t1_a0a0a0a0a1a1a1 = new TreeItem(widget_z347t1_a0a0a0b0b0b, SWT.NONE);
    widget_z347t1_a0a0a0a0a1a1a1.setText(String.valueOf("ROOT"));
    for (int i = 0; i < 5; i++) {
      final TreeItem widget_z347t1_a0a0a0a0a0a0a0b0b0b = new TreeItem(widget_z347t1_a0a0a0a0a1a1a1, SWT.NONE);
      widget_z347t1_a0a0a0a0a0a0a0b0b0b.setText(String.valueOf("Leaf"));
      // nothing to do 
    }
    // nothing to do 
    //  with SWT items are not added to container
    new _FunctionTypes._void_P0_E0() {
      public void invoke() {
        TabItem ti = new TabItem(widget_z347t1_b0b0b, SWT.NONE);
        ti.setText("Tree");
        ti.setControl((Control) widget_z347t1_a0a1a1a1);
      }
    }.invoke();
    widget_z347t1_b0b0b.setLayoutData(DockLayoutData.CENTER);
    dc.layout();
  }

  public void table() {
    final Composite dc = this.uidemo.getDemoContainer();
    for (Iterator<Control> it = new ControlIterator(dc) {
      @Override
      public boolean accept(Control item) {
        return DockLayoutData.CENTER == item.getLayoutData();
      }
    }; it.hasNext();) {
      it.next();
      it.remove();
    }
    final TabFolder widget_z347t1_b0b0c = new TabFolder(dc, SWT.BORDER);
    final Composite widget_z347t1_a0a1a1a2 = new _FunctionTypes._return_P1_E0<Composite, Composite>() {
      public Composite invoke(Composite context_z347t1_a_0) {
        Composite cmp = new Composite(widget_z347t1_b0b0c, SWT.NONE);
        cmp.setLayout(new FillLayout());
        return cmp;
      }
    }.invoke(widget_z347t1_b0b0c);
    final Table widget_z347t1_a0a0a0b0b0c = new _FunctionTypes._return_P1_E0<Table, Composite>() {
      public Table invoke(Composite context_z347t1_a_1) {
        Table t = new Table(widget_z347t1_a0a1a1a2, SWT.NONE);
        t.setHeaderVisible(true);
        return t;
      }
    }.invoke(widget_z347t1_a0a1a1a2);
    final TableColumn widget_z347t1_a0a0a0a0a1a1a2 = new _FunctionTypes._return_P1_E0<TableColumn, Table>() {
      public TableColumn invoke(Table context_z347t1_a_2) {
        TableColumn tc = new TableColumn(widget_z347t1_a0a0a0b0b0c, SWT.NONE);
        return tc;
      }
    }.invoke(widget_z347t1_a0a0a0b0b0c);
    widget_z347t1_a0a0a0a0a1a1a2.setText("Foo");
    widget_z347t1_a0a0a0a0a1a1a2.pack();
    final TableColumn widget_z347t1_b0a0a0a0a1a1a2 = new _FunctionTypes._return_P1_E0<TableColumn, Table>() {
      public TableColumn invoke(Table context_z347t1_a_3) {
        TableColumn tc = new TableColumn(widget_z347t1_a0a0a0b0b0c, SWT.NONE);
        return tc;
      }
    }.invoke(widget_z347t1_a0a0a0b0b0c);
    widget_z347t1_b0a0a0a0a1a1a2.setText("Bar");
    widget_z347t1_b0a0a0a0a1a1a2.pack();
    for (int i = 0; i < 128; i++) {
      final TableItem widget_z347t1_a0a0b0a0a0a1a1a2 = new TableItem(widget_z347t1_a0a0a0b0b0c, SWT.NONE);
      widget_z347t1_a0a0b0a0a0a1a1a2.setText((String[]) new String[]{"" + (i + 32), "" + Character.valueOf((char) (' ' + i))});
      // nothing to do 
    }
    //  with SWT items are not added to container
    new _FunctionTypes._void_P0_E0() {
      public void invoke() {
        TabItem ti = new TabItem(widget_z347t1_b0b0c, SWT.NONE);
        ti.setText("Tree");
        ti.setControl((Control) widget_z347t1_a0a1a1a2);
      }
    }.invoke();
    widget_z347t1_b0b0c.setLayoutData(DockLayoutData.CENTER);
    dc.layout();
  }
}
