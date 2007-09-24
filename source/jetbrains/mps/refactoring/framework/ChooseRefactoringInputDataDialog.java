package jetbrains.mps.refactoring.framework;

import jetbrains.mps.ide.BaseDialog;
import jetbrains.mps.ide.DialogDimensionsSettings.DialogDimensions;

import javax.swing.*;
import java.util.*;
import java.util.List;
import java.awt.*;

public class ChooseRefactoringInputDataDialog extends BaseDialog {

  private JPanel myPanel = new JPanel(new BorderLayout());
  private JPanel myInnerPanel;
  private Map<String, String> myResult = new HashMap<String, String>();
  private List<IChooseComponent> myComponents;

  protected ChooseRefactoringInputDataDialog(Frame mainFrame, List<IChooseComponent> components) throws HeadlessException {
    super(mainFrame, "Input data for refactoring");
    myComponents = new ArrayList<IChooseComponent>(components);
    myPanel.add(new JLabel("Input data for refactoring"), BorderLayout.NORTH);
    myInnerPanel = new JPanel(new GridLayout(myComponents.size(), 1));
    for (IChooseComponent component : myComponents) {
      myInnerPanel.add((Component)component);
    }
    myPanel.add(myInnerPanel);
  }

  public DialogDimensions getDefaultDimensionSettings() {
    return new DialogDimensions(200, 200, 800, 600);
  }

  protected JComponent getMainComponent() {
    return myPanel;
  }

  public Object getResult() {
    return myResult;
  }

  @Button(position = 0, name = "OK", defaultButton = true)
  public void onOk() {
    try {
    for (IChooseComponent component : myComponents) {
      myResult.put(component.getPropertyName(), component.submit());
    }
    dispose();
    } catch (InvalidInputValueException ex) {
      JOptionPane.showMessageDialog(this, ex.getMessage());
    }
  }


  @Button(position = 1, name = "Cancel")
  public void onCancel() {
    dispose();
    myResult = null;
  }
}
