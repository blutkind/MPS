package jetbrains.mps.baseLanguage.util.plugin.refactorings;

/*Generated by MPS */

import jetbrains.mps.ide.dialogs.BaseDialog;
import javax.swing.JPanel;
import javax.swing.JLabel;
import jetbrains.mps.smodel.SNode;
import com.intellij.openapi.project.Project;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.ide.project.ProjectHelper;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.TitledBorder;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import jetbrains.mps.smodel.ModelAccess;
import javax.swing.JOptionPane;
import javax.swing.JComponent;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import jetbrains.mps.ide.dialogs.DialogDimensionsSettings;

public class InlineMethodDialog extends BaseDialog {
  private JPanel myPanel;
  private JLabel myText = new JLabel();
  private String myErrors;
  private InlineMethodDialogModel myModel;

  public InlineMethodDialog(SNode node, Project project, IOperationContext operationContext) {
    super(ProjectHelper.toMainFrame(operationContext.getProject()), "Inline Method");
    this.myModel = new InlineMethodDialogModel(node, operationContext);
    this.myPanel = new JPanel(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    c.fill = GridBagConstraints.BOTH;
    c.insets = new Insets(3, 3, 3, 3);
    c.gridx = 0;
    c.gridy = 0;
    c.weightx = 1;
    this.myPanel.add(this.myText, c);
    c = new GridBagConstraints();
    c.fill = GridBagConstraints.BOTH;
    c.insets = new Insets(3, 3, 3, 3);
    c.gridx = 0;
    c.gridy = 1;
    c.weighty = 1;
    this.myPanel.add(this.createCheckBoxes(), c);
  }

  private JPanel createCheckBoxes() {
    JPanel checkboxesPanel = new JPanel(new GridBagLayout());
    checkboxesPanel.setBorder(new TitledBorder("Inline"));
    ButtonGroup group = new ButtonGroup();
    JRadioButton button1 = this.createButton(group, checkboxesPanel, 0, false, "Inline only this call of method.");
    if (this.myModel == null || this.myModel.getMethodCall() == null) {
      button1.setEnabled(false);
    }
    JRadioButton button2 = this.createButton(group, checkboxesPanel, 1, true, "Inline all calls of method.");
    if (this.myModel.isRecusive()) {
      button2.setEnabled(false);
    }
    if (this.myModel.getMethodCall() != null) {
      button1.setSelected(true);
      this.myModel.setForAll(false);
    } else {
      button2.setSelected(true);
      this.myModel.setForAll(true);
    }
    return checkboxesPanel;
  }

  public void tryToShow() {
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        InlineMethodDialog.this.myErrors = InlineMethodRefactoringAnalyzer.getErrors(InlineMethodDialog.this.myModel);
      }
    });
    if (this.myErrors == null) {
      this.showDialog();
    } else {
      JOptionPane.showMessageDialog(this, this.myErrors, "Can't perform refactoring", JOptionPane.ERROR_MESSAGE);
    }
  }

  protected JComponent getMainComponent() {
    return this.myPanel;
  }

  @BaseDialog.Button(position = 0, name = "Refactor", mnemonic = 'R', defaultButton = true)
  public void onOk() {
    this.dispose();
    this.myModel.onOk();
  }

  @BaseDialog.Button(position = 1, name = "Preview", mnemonic = 'P', defaultButton = false)
  public void onPreview() {
    if (this.myModel.isForAll()) {
      this.dispose();
      this.myModel.preview();
    } else {
      JOptionPane.showMessageDialog(this, "Preview available only when inline all calls.", "Preview not available", JOptionPane.INFORMATION_MESSAGE);
    }
  }

  @BaseDialog.Button(position = 2, name = "Cancel", mnemonic = 'C', defaultButton = false)
  public void onCancel() {
    this.dispose();
  }

  private JRadioButton createButton(ButtonGroup group, JPanel checkboxesPanel, int y, final boolean forAll, String text) {
    GridBagConstraints c = new GridBagConstraints();
    c.fill = GridBagConstraints.NONE;
    c.gridx = 0;
    c.gridy = y;
    c.weightx = 1;
    c.anchor = GridBagConstraints.FIRST_LINE_START;
    JRadioButton button1 = new JRadioButton(new AbstractAction(text) {
      public void actionPerformed(ActionEvent e) {
        InlineMethodDialog.this.myModel.setForAll(forAll);
      }
    });
    group.add(button1);
    checkboxesPanel.add(button1, c);
    return button1;
  }

  public DialogDimensionsSettings.DialogDimensions getDefaultDimensionSettings() {
    return new DialogDimensionsSettings.DialogDimensions(100, 200, 300, 200);
  }
}
