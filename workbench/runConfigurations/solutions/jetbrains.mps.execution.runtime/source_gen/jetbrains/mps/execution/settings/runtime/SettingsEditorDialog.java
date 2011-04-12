package jetbrains.mps.execution.settings.runtime;

/*Generated by MPS */

import javax.swing.JDialog;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import java.awt.event.ActionEvent;

public class SettingsEditorDialog extends JDialog {
  private final SettingsEditorPanel mySettingsPanel;

  public SettingsEditorDialog(ITemplatePersistentConfiguration configuration) {
    setModal(true);
    setSize(new Dimension(500, 300));
    mySettingsPanel = new SettingsEditorPanel(configuration);
    add(mySettingsPanel.getComponent(), BorderLayout.CENTER);
    add(this.createButtons(mySettingsPanel), BorderLayout.SOUTH);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  }

  private JPanel createButtons(SettingsEditorPanel editor) {
    JPanel buttonsPanel = new JPanel(new FlowLayout());
    buttonsPanel.add(new JButton(new ActionWrapper(editor.getOkAction(), new _FunctionTypes._void_P1_E0<ActionEvent>() {
      public void invoke(ActionEvent e) {
        dispose();
      }
    })));
    buttonsPanel.add(new JButton(editor.getApplyAction()));
    buttonsPanel.add(new JButton(editor.getResetAction()));
    buttonsPanel.add(new JButton(new ActionWrapper(editor.getCancelAction(), new _FunctionTypes._void_P1_E0<ActionEvent>() {
      public void invoke(ActionEvent e) {
        dispose();
      }
    })));
    return buttonsPanel;
  }

  @Override
  public void dispose() {
    super.dispose();
    mySettingsPanel.dispose();
  }
}
