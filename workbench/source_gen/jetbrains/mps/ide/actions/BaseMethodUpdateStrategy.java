package jetbrains.mps.ide.actions;

/*Generated by MPS */

import javax.swing.JCheckBox;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.workbench.MPSDataKeys;
import com.intellij.ide.DataManager;
import jetbrains.mps.MPSProjectHolder;
import jetbrains.mps.smodel.SNode;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public abstract class BaseMethodUpdateStrategy implements StratergyAddMethodDialog.AdditionStrategy {
  private JCheckBox myCheckBox;
  private PersistentOptions_PreferencesComponent myPrefsComponent = this.getPrefsComponent();

  public BaseMethodUpdateStrategy() {
    this.myCheckBox = new JCheckBox("Add \"return\" keyword");
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
      return new BaseMethodUpdateStrategy.QuotationClass_3774_0().createNode(returnExpr);
    } else {
      return new BaseMethodUpdateStrategy.QuotationClass_3774_1().createNode(returnExpr);
    }
  }

  public static class QuotationClass_3774_0 {
    public QuotationClass_3774_0() {
    }

    public SNode createNode(Object parameter_3774_0) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_3774_0 = null;
      SNode quotedNode_3774_1 = null;
      {
        quotedNode_3774_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ReturnStatement", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_3774_0 = quotedNode_3774_0;
        {
          quotedNode_3774_1 = (SNode) parameter_3774_0;
          SNode quotedNode1_3774_1;
          if (_parameterValues_129834374.contains(quotedNode_3774_1)) {
            quotedNode1_3774_1 = CopyUtil.copy(quotedNode_3774_1);
          } else {
            _parameterValues_129834374.add(quotedNode_3774_1);
            quotedNode1_3774_1 = quotedNode_3774_1;
          }
          if (quotedNode1_3774_1 != null) {
            quotedNode_3774_0.addChild("expression", HUtil.copyIfNecessary(quotedNode1_3774_1));
          }
        }
        result = quotedNode1_3774_0;
      }
      return result;
    }
  }

  public static class QuotationClass_3774_1 {
    public QuotationClass_3774_1() {
    }

    public SNode createNode(Object parameter_3774_1) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_3774_2 = null;
      SNode quotedNode_3774_3 = null;
      {
        quotedNode_3774_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ExpressionStatement", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_3774_2 = quotedNode_3774_2;
        {
          quotedNode_3774_3 = (SNode) parameter_3774_1;
          SNode quotedNode1_3774_3;
          if (_parameterValues_129834374.contains(quotedNode_3774_3)) {
            quotedNode1_3774_3 = CopyUtil.copy(quotedNode_3774_3);
          } else {
            _parameterValues_129834374.add(quotedNode_3774_3);
            quotedNode1_3774_3 = quotedNode_3774_3;
          }
          if (quotedNode1_3774_3 != null) {
            quotedNode_3774_2.addChild("expression", HUtil.copyIfNecessary(quotedNode1_3774_3));
          }
        }
        result = quotedNode1_3774_2;
      }
      return result;
    }
  }
}
