package jetbrains.mps.ide.actions;

/*Generated by MPS */

import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.openapi.project.Project;
import javax.swing.SwingUtilities;
import org.jetbrains.annotations.Nullable;
import javax.swing.JComponent;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JCheckBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import jetbrains.mps.generator.GenerationSettings;
import javax.swing.JLabel;
import javax.swing.Action;

/*package*/ class CheckBeforeGenerationDialog extends DialogWrapper {
  private String myDialogMessage;

  public CheckBeforeGenerationDialog(Project project, int errors, int warnings) {
    super(project, true);
    myDialogMessage = String.format("Model checker found %d errors and %d warnings. " + "Review them and don't generate models or ignore them?", errors, warnings);
    setTitle("Check Before Generation");
    setButtonsAlignment(SwingUtilities.CENTER);
    init();
  }

  @Nullable
  protected JComponent createCenterPanel() {
    JPanel panel = new JPanel(new BorderLayout());

    JCheckBox checkBox = new JCheckBox("Don't check models before generation");
    checkBox.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent ev) {
        boolean selected = ev.getStateChange() == ItemEvent.SELECTED;
        GenerationSettings.getInstance().setCheckModelsBeforeGeneration(!(selected));
      }
    });

    panel.add(new JLabel(myDialogMessage), BorderLayout.CENTER);
    panel.add(checkBox, BorderLayout.SOUTH);
    return panel;
  }

  @Override
  protected Action getCancelAction() {
    Action cancelAction = super.getCancelAction();
    cancelAction.putValue(Action.NAME, "Ignore Errors");
    return cancelAction;
  }

  @Override
  protected Action getOKAction() {
    Action okAction = super.getOKAction();
    okAction.putValue(Action.NAME, "Review Errors");
    return okAction;
  }
}
