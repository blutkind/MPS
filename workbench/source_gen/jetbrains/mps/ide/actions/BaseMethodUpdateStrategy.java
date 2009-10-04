package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.plugin.uiActions.StratergyAddMethodDialog;
import javax.swing.JCheckBox;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.workbench.MPSDataKeys;
import com.intellij.ide.DataManager;
import jetbrains.mps.MPSProjectHolder;
import jetbrains.mps.smodel.SNode;

public abstract class BaseMethodUpdateStrategy implements StratergyAddMethodDialog.AdditionStrategy {
  private JCheckBox myCheckBox;
  private PersistentOptions_PreferencesComponent myPrefsComponent = this.getPrefsComponent();

  public BaseMethodUpdateStrategy() {
    this.myCheckBox = new JCheckBox("add \"return\" keyword");
    this.myCheckBox.setSelected(this.myPrefsComponent.getStateObject().addReturnsOnImplement);
  }

  public PersistentOptions_PreferencesComponent getPrefsComponent() {
    MPSProject p = MPSDataKeys.MPS_PROJECT.getData(DataManager.getInstance().getDataContext());
    return p.getComponent(MPSProjectHolder.class).getMPSProject().getPluginManager().getPrefsComponent(PersistentOptions_PreferencesComponent.class);
  }

  public JCheckBox getReturnCheckBox() {
    return this.myCheckBox;
  }

  public void updateMethod(SNode sourceMethod, SNode method) {
    this.myPrefsComponent.getStateObject().addReturnsOnImplement = this.myCheckBox.isSelected();
  }

  public SNode getReturnStatement(SNode returnExpr) {
    if ((returnExpr == null)) {
      return null;
    }

    if (this.myCheckBox.isSelected()) {
      return new _Quotations.QuotationClass_4().createNode(returnExpr);
    } else {
      return new _Quotations.QuotationClass_5().createNode(returnExpr);
    }
  }
}
