package jetbrains.mps.baseLanguage.util.plugin.refactorings;

/*Generated by MPS */

import jetbrains.mps.ide.dialogs.BaseDialog;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import jetbrains.mps.nodeEditor.EditorContext;
import java.awt.Frame;
import java.awt.Dimension;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComponent;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.event.TableModelListener;
import javax.swing.event.TableModelEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import com.intellij.ui.DocumentAdapter;
import javax.swing.event.DocumentEvent;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import jetbrains.mps.ide.dialogs.DialogDimensionsSettings;
import javax.swing.JOptionPane;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class ExtractMethodDialog extends BaseDialog {
  private JPanel myPanel;
  private boolean myCanRefactor;
  private JTextArea myPreviewArea = new JTextArea();
  private JTextArea myMessagesArea = new JTextArea();
  private ExtractMethodRefactoringParameters myParameters;
  private EditorContext myContext;
  private ExtractMethodRefactoring myRefactoring;

  public ExtractMethodDialog(Frame frame, EditorContext context, ExtractMethodRefactoringParameters params, ExtractMethodRefactoring refactoring) {
    super(frame, "Extract Method");
    this.setMinimumSize(new Dimension(600, 450));
    this.myContext = context;
    this.myParameters = params;
    this.myRefactoring = refactoring;
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        ExtractMethodDialog.this.initPanel();
      }
    });
    this.update();
  }

  private void update() {
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        ExtractMethodDialog.this.myMessagesArea.setText(ExtractMethodDialog.this.getMessagesText());
        ExtractMethodDialog.this.myPreviewArea.setText(ExtractMethodDialog.this.myParameters.getMethodText());
      }
    });
    this.repaint();
  }

  private String getMessagesText() {
    StringBuffer buff = new StringBuffer();
    String methodName = this.myParameters.getName();
    if (methodName.length() == 0) {
      buff.append("Method name is empty.\n");
    } else {
      boolean nameIsGood = Character.isJavaIdentifierStart(methodName.charAt(0));
      for (int i = 1; i < methodName.length(); i++) {
        nameIsGood = nameIsGood && Character.isJavaIdentifierPart(methodName.charAt(0));
      }
      if (!(nameIsGood)) {
        buff.append("Method name is incorrect.");
      }
    }
    String errors = ExtractMethodFabric.getErrors(this.myParameters.getNodesToRefactor());
    if (errors != null) {
      buff.append(errors);
      this.myCanRefactor = false;
    } else {
      this.myCanRefactor = true;
    }
    SNode overrides = this.myParameters.getOverridingMethodClass();
    if (overrides != null) {
      if (overrides == SNodeOperations.getAncestor(this.myParameters.getContainerMethod(), "jetbrains.mps.baseLanguage.structure.Classifier", false, false)) {
        buff.append("Such method already exists.\n");
      } else {
        buff.append("Method overrides method from class ").append(SPropertyOperations.getString(overrides, "name")).append("\n");
      }
    }
    if (buff.length() == 0) {
      buff.append("\n");
    }
    return buff.toString();
  }

  private void initPanel() {
    this.myPanel = new JPanel(new GridBagLayout());

    GridBagConstraints c = new GridBagConstraints();
    c.fill = GridBagConstraints.BOTH;
    c.anchor = GridBagConstraints.NORTHWEST;
    c.insets = new Insets(3, 5, 3, 5);

    c.gridx = 0;
    c.gridy = 0;
    c.weightx = 1;
    c.weighty = 0;
    c.gridwidth = 2;
    this.myPanel.add(this.createMethodPanel(), c);

    c.gridx = 0;
    c.gridy = 1;
    c.weightx = 1;
    c.weighty = 1;
    c.gridwidth = 1;
    this.myPanel.add(this.createParametersPanel(), c);

    c.gridx = 1;
    c.gridy = 1;
    c.weightx = 0;
    c.weighty = 1;
    c.gridwidth = 1;
    this.myPanel.add(this.createVisibilityPanel(), c);

    c.gridx = 0;
    c.gridy = 2;
    c.weightx = 0;
    c.weighty = 0;
    c.gridwidth = 2;
    this.myPanel.add(this.createPreviewPanel(), c);

    c.gridx = 0;
    c.gridy = 3;
    c.weightx = 1;
    c.weighty = 0;
    c.gridwidth = 2;
    this.myPanel.add(this.createMessagesComponent(), c);
  }

  private JComponent createPreviewPanel() {
    this.myPreviewArea.setEditable(false);
    this.myPreviewArea.setBackground(this.myPanel.getBackground());
    this.myPreviewArea.setBorder(this.createBorder("Signature Preview"));
    return this.myPreviewArea;
  }

  private JComponent createMessagesComponent() {
    this.myMessagesArea.setEditable(false);
    this.myMessagesArea.setBackground(this.myPanel.getBackground());
    this.myMessagesArea.setBorder(this.createBorder("Messages"));
    return this.myMessagesArea;
  }

  private JComponent createVisibilityPanel() {
    JPanel visbilityPanel = new JPanel(new GridBagLayout());
    visbilityPanel.setBorder(this.createBorder("Visibility"));
    ButtonGroup group = new ButtonGroup();
    JRadioButton button = this.createVisibilityButton(0, VisibilityLevel.PRIVATE, group, visbilityPanel);
    this.createVisibilityButton(1, VisibilityLevel.PACKAGE_LOCAL, group, visbilityPanel);
    this.createVisibilityButton(2, VisibilityLevel.PROTECTED, group, visbilityPanel);
    this.createVisibilityButton(3, VisibilityLevel.PUBLIC, group, visbilityPanel);
    GridBagConstraints c = new GridBagConstraints();
    c.gridx = 0;
    c.gridy = 4;
    c.weightx = 1;
    c.weighty = 1;
    visbilityPanel.add(new JPanel(), c);
    button.setSelected(true);
    return visbilityPanel;
  }

  private JRadioButton createVisibilityButton(int y, final VisibilityLevel levelToSet, ButtonGroup group, JPanel visbilityPanel) {
    GridBagConstraints c = new GridBagConstraints();
    c.fill = GridBagConstraints.NONE;
    c.gridx = 0;
    c.gridy = y;
    c.weightx = 1;
    c.weighty = 0;
    c.anchor = GridBagConstraints.FIRST_LINE_START;
    JRadioButton button = new JRadioButton(new AbstractAction(levelToSet.getButtonText()) {
      public void actionPerformed(ActionEvent e) {
        ExtractMethodDialog.this.myParameters.setVisibilityLevel(levelToSet);
        ExtractMethodDialog.this.update();
      }
    });
    group.add(button);
    visbilityPanel.add(button, c);
    return button;
  }

  private JComponent createParametersPanel() {
    ParametersPanel parametersPanel = new ParametersPanel(this.myParameters);
    parametersPanel.setBorder(this.createBorder("Parameters"));
    ParametersTableModel tableModel = parametersPanel.getTableModel();
    tableModel.addTableModelListener(new TableModelListener() {
      public void tableChanged(TableModelEvent p0) {
        ExtractMethodDialog.this.update();
      }
    });
    return parametersPanel;
  }

  private JComponent createMethodPanel() {
    JPanel methodPanel = new JPanel(new GridBagLayout());
    methodPanel.setBorder(this.createBorder("Method"));
    GridBagConstraints c = new GridBagConstraints();
    c.gridx = 0;
    c.gridy = 0;
    c.weightx = 0;
    c.anchor = GridBagConstraints.FIRST_LINE_START;
    methodPanel.add(new JLabel("Name:"), c);
    c = new GridBagConstraints();
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 0;
    c.gridy = 1;
    c.weightx = 1;
    c.weighty = 1;
    c.anchor = GridBagConstraints.FIRST_LINE_START;
    final JTextField nameField = new JTextField(20);
    methodPanel.add(nameField, c);
    nameField.getDocument().addDocumentListener(new DocumentAdapter() {
      protected void textChanged(DocumentEvent p0) {
        ExtractMethodDialog.this.myParameters.setName(nameField.getText());
        ExtractMethodDialog.this.update();
      }
    });
    return methodPanel;
  }

  private Border createBorder(String title) {
    return new CompoundBorder(new TitledBorder(title), new EmptyBorder(5, 5, 5, 5));
  }

  private DialogDimensionsSettings.DialogDimensions getDimensionSettings() {
    return new DialogDimensionsSettings.DialogDimensions(100, 100, 800, 600);
  }

  public JComponent getMainComponent() {
    return this.myPanel;
  }

  @BaseDialog.Button(position = 0, name = "Refactor", mnemonic = 'R', defaultButton = true)
  public void onOk() {
    if (!(this.myCanRefactor)) {
      JOptionPane.showMessageDialog(this, "Can't refactor. See errors.", "Can't perform refactoring", JOptionPane.ERROR_MESSAGE);
    } else {
      final Wrappers._T<SNode> staticTarget = new Wrappers._T<SNode>();
      final Wrappers._T<SModel> refactoringModel = new Wrappers._T<SModel>(null);
      if (this.myParameters.getAnalyzer().getExtractMethodReafactoringProcessor().getClass() == AbstractExtractMethodRefactoringProcessor.class) {
        final Wrappers._T<SModelDescriptor> model = new Wrappers._T<SModelDescriptor>();
        ModelAccess.instance().runReadAction(new Runnable() {
          public void run() {
            refactoringModel.value = SNodeOperations.getModel(ListSequence.fromList(ExtractMethodDialog.this.myParameters.getNodesToRefactor()).first());
            model.value = refactoringModel.value.getModelDescriptor();
          }
        });
        staticTarget.value = BLDialogs.showStaticContainerChooser(this.myContext.getOperationContext(), model.value);
        if (staticTarget.value == null) {
          return;
        }
        ModelAccess.instance().runReadAction(new Runnable() {
          public void run() {
            ExtractMethodDialog.this.myRefactoring.setStaticContainer(staticTarget.value);
          }
        });
      }
      ModelAccess.instance().runWriteActionInCommand(new Runnable() {
        public void run() {
          SNode result = ExtractMethodDialog.this.myRefactoring.doRefactor();
          ExtractMethodDialog.this.myContext.select(result);
          if (refactoringModel.value != null) {
            refactoringModel.value.addImportedModel(SNodeOperations.getModel(staticTarget.value).getSModelReference());
          }
        }
      });
    }
    this.dispose();
  }

  @BaseDialog.Button(position = 1, name = "Cancel", mnemonic = 'C', defaultButton = false)
  public void onCancel() {
    this.dispose();
  }

  public DialogDimensionsSettings.DialogDimensions getDefaultDimensionSettings() {
    return new DialogDimensionsSettings.DialogDimensions(100, 200, 500, 400);
  }
}
