package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.ide.dialogs.BaseDialog;
import jetbrains.mps.ide.dialogs.DialogDimensionsSettings;
import jetbrains.mps.internal.collections.runtime.ListSequence;

import javax.swing.*;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;

public class SetNodePackageDialog extends BaseDialog {

  private boolean myIsCancelled = true;
  private JPanel myMainPanel;
  private JComboBox myCbPackage;
  private String myPackage;

  public SetNodePackageDialog(Frame frame, String title, List<String> existingPackages) {
    super(frame, title);
    this.setModal(true);
    this.myMainPanel = new JPanel();
    this.myMainPanel.setLayout(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints(0, 0, 1, 1, 1, 0, GridBagConstraints.NORTHWEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0);
    this.myMainPanel.add(new JLabel("Enter virtual package name:"), c);
    this.myCbPackage = new JComboBox();
    this.myCbPackage.setEditable(true);
    this.myCbPackage.setModel(new DefaultComboBoxModel(ListSequence.fromList(existingPackages).toGenericArray(String.class)));
    this.myCbPackage.addActionListener(new ActionListener() {

      public void actionPerformed(ActionEvent e) {
        SetNodePackageDialog.this.myPackage = ((String)SetNodePackageDialog.this.myCbPackage.getSelectedItem());
      }
    });
    this.myCbPackage.getEditor().getEditorComponent().addKeyListener(new KeyAdapter() {

      public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER && !(SetNodePackageDialog.this.myCbPackage.isPopupVisible())) {
          SetNodePackageDialog.this.onOk();
        }
      }
    });
    c.gridy = 1;
    this.myMainPanel.add(this.myCbPackage, c);
    c.gridy = 2;
    c.weighty = 1.0;
    this.myMainPanel.add(new JPanel(), c);
  }

  protected JComponent getMainComponent() {
    return this.myMainPanel;
  }

  public DialogDimensionsSettings.DialogDimensions getDefaultDimensionSettings() {
    return new DialogDimensionsSettings.DialogDimensions(100, 200, 250, 150);
  }

  public String getPackage() {
    return this.myPackage;
  }

  private void updatePackage() {
    String pack = ((String)this.myCbPackage.getEditor().getItem());
    if (pack != null && pack.length() == 0) {
      pack = null;
    }
    this.myPackage = pack;
  }

  public void setPackage(String pack) {
    if (pack == null) {
      pack = "";
    }
    this.myCbPackage.setSelectedItem(pack);
  }

  public boolean isCancelled() {
    return this.myIsCancelled;
  }

  @BaseDialog.Button(name = "OK", position = 0, defaultButton = true)
  public void onOk() {
    this.updatePackage();
    this.myIsCancelled = false;
    this.dispose();
  }

  @BaseDialog.Button(name = "Cancel", position = 1)
  public void onCancel() {
    this.dispose();
  }

}
