package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.ide.dialogs.BaseDialog;
import javax.swing.JComponent;
import javax.swing.JTextArea;
import jetbrains.mps.project.MPSProject;
import java.awt.Frame;
import jetbrains.mps.smodel.IOperationContext;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import jetbrains.mps.datatransfer.TextPasteUtil;
import javax.swing.JScrollPane;
import jetbrains.mps.ide.dialogs.DialogDimensionsSettings;

public class AnalyzeStacktraceDialog extends BaseDialog {
  private JComponent myComponent;
  private JTextArea myText;
  private MPSProject myProject;

  public AnalyzeStacktraceDialog(Frame frame, final IOperationContext context, MPSProject project) {
    super(frame, "Analyze Stacktrace");
    this.myProject = project;
    this.myComponent = this.createPanel();
  }

  protected JComponent getMainComponent() {
    return this.myComponent;
  }

  public JComponent createPanel() {
    JPanel panel = new JPanel(new BorderLayout());
    this.myText = new JTextArea("");
    String str = TextPasteUtil.getStringFromClipboard();
    if (str != null) {
      this.myText.setText(str);
    }
    panel.add(this.myText);
    JScrollPane scrollPane = new JScrollPane(panel);
    scrollPane.getVerticalScrollBar().setBlockIncrement(40);
    scrollPane.getVerticalScrollBar().setUnitIncrement(20);
    scrollPane.getHorizontalScrollBar().setBlockIncrement(40);
    return scrollPane;
  }

  @Override
  public DialogDimensionsSettings.DialogDimensions getDefaultDimensionSettings() {
    return new DialogDimensionsSettings.DialogDimensions(100, 200, 400, 600);
  }

  @BaseDialog.Button(name = "OK", mnemonic = 'O', position = 0, defaultButton = false)
  public void onOk() {
    AnalyzeStacktrace_Tool tool = this.myProject.getPluginManager().getTool(AnalyzeStacktrace_Tool.class);
    tool.setStackTrace(this.myText.getText());
    tool.openToolLater(true);
    this.dispose();
  }

  @BaseDialog.Button(name = "Cancel", mnemonic = 'C', position = 1, defaultButton = true)
  public void onCancel() {
    this.dispose();
  }
}
