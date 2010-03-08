package jetbrains.mps.ide.actions;

/*Generated by MPS */

import javax.swing.JCheckBox;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.workbench.MPSDataKeys;
import com.intellij.ide.DataManager;
import jetbrains.mps.MPSProjectHolder;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public abstract class BaseMethodUpdateStrategy implements StratergyAddMethodDialog.AdditionStrategy {
  private JCheckBox myAddReturnKeyword;
  private JCheckBox myRemoveAttributes;
  private PersistentOptions_PreferencesComponent myPrefsComponent = this.getPrefsComponent();

  public BaseMethodUpdateStrategy() {
    this.myAddReturnKeyword = new JCheckBox("Add \"return\" keyword");
    this.myAddReturnKeyword.setSelected(this.myPrefsComponent.getStateObject().addReturnsOnImplement);

    this.myRemoveAttributes = new JCheckBox("Remove Attributes");
    this.myRemoveAttributes.setSelected(this.myPrefsComponent.getStateObject().removeAttributes);
  }

  private void removeAttributes(SNode node) {
    if (SNodeOperations.isAttribute(node)) {
      SNodeOperations.deleteNode(node);
    } else {
      for (SNode child : SNodeOperations.getChildren(node)) {
        this.removeAttributes(child);
      }
    }
  }

  public PersistentOptions_PreferencesComponent getPrefsComponent() {
    MPSProject p = MPSDataKeys.MPS_PROJECT.getData(DataManager.getInstance().getDataContext());
    return p.getComponent(MPSProjectHolder.class).getMPSProject().getPluginManager().getPrefsComponent(PersistentOptions_PreferencesComponent.class);
  }

  public JCheckBox getReturnCheckBox() {
    return this.myAddReturnKeyword;
  }

  public JCheckBox getRemoveAttributes() {
    return this.myRemoveAttributes;
  }

  public void updateMethod(SNode sourceMethod, SNode method) {
    this.myPrefsComponent.getStateObject().addReturnsOnImplement = this.myAddReturnKeyword.isSelected();
    this.myPrefsComponent.getStateObject().removeAttributes = this.myRemoveAttributes.isSelected();
    if (this.myRemoveAttributes.isSelected()) {
      for (SNode child : SNodeOperations.getChildren(method)) {
        this.removeAttributes(child);
      }
    }
  }

  public SNode getReturnStatement(SNode returnExpr) {
    if ((returnExpr == null)) {
      return null;
    }

    if (this.myAddReturnKeyword.isSelected()) {
      return new BaseMethodUpdateStrategy.QuotationClass_f5ta53_a0a0c0f().createNode(returnExpr);
    } else {
      return new BaseMethodUpdateStrategy.QuotationClass_f5ta53_a0a0a2a5().createNode(returnExpr);
    }
  }

  public static class QuotationClass_f5ta53_a0a0c0f {
    public QuotationClass_f5ta53_a0a0c0f() {
    }

    public SNode createNode(Object parameter_5) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ReturnStatement", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        {
          quotedNode_2 = (SNode) parameter_5;
          SNode quotedNode1_4;
          if (_parameterValues_129834374.contains(quotedNode_2)) {
            quotedNode1_4 = CopyUtil.copy(quotedNode_2);
          } else {
            _parameterValues_129834374.add(quotedNode_2);
            quotedNode1_4 = quotedNode_2;
          }
          if (quotedNode1_4 != null) {
            quotedNode_1.addChild("expression", HUtil.copyIfNecessary(quotedNode1_4));
          }
        }
        result = quotedNode1_3;
      }
      return result;
    }
  }

  public static class QuotationClass_f5ta53_a0a0a2a5 {
    public QuotationClass_f5ta53_a0a0a2a5() {
    }

    public SNode createNode(Object parameter_5) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ExpressionStatement", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        {
          quotedNode_2 = (SNode) parameter_5;
          SNode quotedNode1_4;
          if (_parameterValues_129834374.contains(quotedNode_2)) {
            quotedNode1_4 = CopyUtil.copy(quotedNode_2);
          } else {
            _parameterValues_129834374.add(quotedNode_2);
            quotedNode1_4 = quotedNode_2;
          }
          if (quotedNode1_4 != null) {
            quotedNode_1.addChild("expression", HUtil.copyIfNecessary(quotedNode1_4));
          }
        }
        result = quotedNode1_3;
      }
      return result;
    }
  }
}
