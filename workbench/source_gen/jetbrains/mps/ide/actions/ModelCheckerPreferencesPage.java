package jetbrains.mps.ide.actions;

/*Generated by MPS */

import javax.swing.JPanel;
import javax.swing.JCheckBox;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.border.EmptyBorder;
import javax.swing.Icon;
import javax.swing.JComponent;

public class ModelCheckerPreferencesPage {
  private JPanel myPage;
  private JCheckBox myCheckUnresolvedReferencesCheckBox = new JCheckBox("Check for unresolved references");
  private JCheckBox myCheckConstraintsCheckBox = new JCheckBox("Check for cardinalities and properties constraints");
  private JCheckBox myCheckScopesCheckBox = new JCheckBox("Check references for valid search scopes");
  private JCheckBox myCheckTypesystemCheckBox = new JCheckBox("Perform typesystem checks");
  private ModelCheckerSettings myModelCheckerSettings;

  public ModelCheckerPreferencesPage(ModelCheckerSettings settings) {
    myModelCheckerSettings = settings;
    myCheckUnresolvedReferencesCheckBox.setSelected(myModelCheckerSettings.isCheckUnresolvedReferences());
    myCheckConstraintsCheckBox.setSelected(myModelCheckerSettings.isCheckConstraints());
    myCheckScopesCheckBox.setSelected(myModelCheckerSettings.isCheckScopes());
    myCheckTypesystemCheckBox.setSelected(myModelCheckerSettings.isCheckTypesystem());

    JPanel optionsPanel = new JPanel(new GridLayout(0, 1));
    optionsPanel.add(myCheckUnresolvedReferencesCheckBox);
    optionsPanel.add(myCheckConstraintsCheckBox);
    /*
      optionsPanel.add(myCheckScopesCheckBox);
    */
    optionsPanel.add(myCheckTypesystemCheckBox);

    myPage = new JPanel(new BorderLayout());
    myPage.setBorder(new EmptyBorder(10, 10, 10, 10));
    myPage.add(optionsPanel, BorderLayout.NORTH);
  }

  public String getName() {
    return "Model Checker";
  }

  public Icon getIcon() {
    return null;
  }

  public JComponent getComponent() {
    return myPage;
  }

  public boolean validate() {
    return true;
  }

  public void commit() {
    myModelCheckerSettings.setCheckUnresolvedReferences(myCheckUnresolvedReferencesCheckBox.isSelected());
    myModelCheckerSettings.setCheckConstraints(myCheckConstraintsCheckBox.isSelected());
    myModelCheckerSettings.setCheckScopes(myCheckScopesCheckBox.isSelected());
    myModelCheckerSettings.setCheckTypesystem(myCheckTypesystemCheckBox.isSelected());
  }

  public boolean isModified() {
    if (myModelCheckerSettings.isCheckUnresolvedReferences() != myCheckUnresolvedReferencesCheckBox.isSelected()) {
      return true;
    }
    if (myModelCheckerSettings.isCheckConstraints() != myCheckConstraintsCheckBox.isSelected()) {
      return true;
    }
    if (myModelCheckerSettings.isCheckScopes() != myCheckScopesCheckBox.isSelected()) {
      return true;
    }
    if (myModelCheckerSettings.isCheckTypesystem() != myCheckTypesystemCheckBox.isSelected()) {
      return true;
    }
    return false;
  }
}
