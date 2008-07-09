package jetbrains.mps.workbench.output;

import com.intellij.openapi.actionSystem.ActionManager;
import com.intellij.openapi.actionSystem.ActionPlaces;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindowAnchor;
import jetbrains.mps.ide.action.AbstractActionWithEmptyIcon;
import jetbrains.mps.ide.projectPane.Icons;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.workbench.tools.BaseGeneratedTool;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class OutputViewTool extends BaseGeneratedTool {
  private JPanel myComponent = new JPanel(new BorderLayout());
  private JTextArea myTextArea = new JTextArea();
  private String myLastSearchPattern = null;
  private AbstractAction myFindAction;
  private AbstractAction myFindNextAction;
  private int myFontSize = 12;

  public OutputViewTool(Project project) {
    super(project, "Output", 4, Icons.OUTPUT_VIEW_ICON, ToolWindowAnchor.BOTTOM, true);
  }

  public void initComponent() {
    super.initComponent();
    myTextArea.setEditable(false);

    myFindAction = new AbstractActionWithEmptyIcon("Find") {
      {
        putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("control F"));
      }

      public void actionPerformed(ActionEvent e) {
        String pattern = JOptionPane.showInputDialog(getMPSProject().getComponent(Frame.class), "Enter pattern to find", myLastSearchPattern);
        if (pattern == null) return;
        find(pattern);
      }
    };
    myFindNextAction = new AbstractActionWithEmptyIcon("Find Next") {
      {
        putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("F3"));
      }

      public void actionPerformed(ActionEvent e) {
        if (myLastSearchPattern != null) {
          find(myLastSearchPattern);
        }
      }
    };

    JPanel panel = new JPanel();

    updateComponent();

    myTextArea.addMouseListener(new MouseAdapter() {
      public void mouseReleased(MouseEvent e) {
        processMouseEvent(e);
      }

      public void mousePressed(MouseEvent e) {
        processMouseEvent(e);
      }

      private void processMouseEvent(MouseEvent e) {
        if (e.isPopupTrigger()) {
          JPopupMenu menu = new JPopupMenu();
          menu.add(new AbstractActionWithEmptyIcon("Clear") {
            public void actionPerformed(ActionEvent event) {
              clear();
            }
          });
          menu.addSeparator();
          menu.add(myFindAction);
          menu.add(myFindNextAction);

          menu.show(myTextArea, e.getX(), e.getY());
        }
      }
    });

    panel.setLayout(new BorderLayout());
    panel.add(new JScrollPane(myTextArea), BorderLayout.CENTER);

    DefaultActionGroup group = new DefaultActionGroup();
    group.add(createCloseAction());
    JComponent toolbar = ActionManager.getInstance().createActionToolbar(ActionPlaces.UNKNOWN, group, false).getComponent();

    myComponent.registerKeyboardAction(myFindAction, KeyStroke.getKeyStroke("control F"), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    myComponent.registerKeyboardAction(myFindNextAction, KeyStroke.getKeyStroke("F3"), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    myComponent.add(panel, BorderLayout.CENTER);
    myComponent.add(toolbar, BorderLayout.WEST);
  }

  public static OutputViewTool getOutputViewTool(MPSProject project) {
    return project.getComponent(OutputViewTool.class);
  }

  private void updateComponent() {
    myTextArea.setFont(new Font("Monospaced", 0, myFontSize));
    myTextArea.repaint();
  }

  private void find(String pattern) {
    int startIndex = 0;
    if (myTextArea.getSelectedText() != null && myTextArea.getSelectedText().length() > 0) {
      startIndex = myTextArea.getSelectionEnd();
    }
    int start = myTextArea.getText().indexOf(pattern, startIndex);
    myLastSearchPattern = pattern;
    if (start == -1) {
      myTextArea.setSelectionStart(0);
      myTextArea.setSelectionEnd(0);
      return;
    }
    myTextArea.setSelectionStart(start);
    myTextArea.setSelectionEnd(start + pattern.length());
  }

  public void append(String text) {
    myTextArea.append(text);
  }

  public void clear() {
    myTextArea.setText("");
  }

  public JComponent getComponent() {
    return myComponent;
  }
}
