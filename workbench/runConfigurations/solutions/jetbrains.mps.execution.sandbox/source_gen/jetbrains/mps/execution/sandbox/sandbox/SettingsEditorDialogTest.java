package jetbrains.mps.execution.sandbox.sandbox;

/*Generated by MPS */

import javax.swing.SwingUtilities;
import jetbrains.mps.execution.settings.runtime.SettingsEditorDialog;

public class SettingsEditorDialogTest {
  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        final TwoFieldsEditor_Configuration twoFieldsConfiguration = new TwoFieldsEditor_Configuration();
        SettingsEditorDialog dialog = new SettingsEditorDialog(twoFieldsConfiguration);
        dialog.setVisible(true);
        System.out.println("property1 = " + twoFieldsConfiguration.getProperty1());
        System.out.println("property2 = " + twoFieldsConfiguration.getProperty2());
      }
    });
  }
}
