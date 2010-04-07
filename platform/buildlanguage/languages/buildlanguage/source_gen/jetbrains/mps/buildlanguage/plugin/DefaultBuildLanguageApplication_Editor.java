package jetbrains.mps.buildlanguage.plugin;

/*Generated by MPS */

import javax.swing.JPanel;
import jetbrains.mps.baseLanguage.plugin.JavaConfigOptions;
import jetbrains.mps.baseLanguage.runConfigurations.runtime.MainNodeChooser;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import java.awt.GridBagLayout;
import jetbrains.mps.baseLanguage.util.plugin.run.LayoutUtil;
import javax.swing.JLabel;

public class DefaultBuildLanguageApplication_Editor extends JPanel {
  private JavaConfigOptions myJavaConfigurationOptions = new JavaConfigOptions();
  private MainNodeChooser myChooseNodeComponent = new MainNodeChooser(new _FunctionTypes._return_P0_E0<SNode>() {
    public SNode invoke() {
      final Wrappers._T<SNode> c = new Wrappers._T<SNode>();
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          c.value = SConceptOperations.findConceptDeclaration("jetbrains.mps.buildlanguage.structure.Project");
        }
      });
      return c.value;
    }
  }.invoke(), null);

  public DefaultBuildLanguageApplication_Editor() {
    super(new GridBagLayout());

    this.add(this.myJavaConfigurationOptions, LayoutUtil.createPanelConstraints(2));
    {
      JPanel panel = new JPanel(new GridBagLayout());
      panel.add(new JLabel("Main node:"), LayoutUtil.createLabelConstraints(0));
      panel.add(this.myChooseNodeComponent, LayoutUtil.createPanelConstraints(1));
      this.add(panel, LayoutUtil.createPanelConstraints(0));
    }
  }

  public void apply(DefaultBuildLanguageApplication_Configuration configuration) {
    this.myJavaConfigurationOptions.apply(configuration.getStateObject().myJavaRunParameters);
    {
      MainNodeChooser mainClassField = this.myChooseNodeComponent;
      configuration.setNode(mainClassField.getNode());
    }
  }

  public void reset(DefaultBuildLanguageApplication_Configuration configuration) {
    this.myJavaConfigurationOptions.reset(configuration.getStateObject().myJavaRunParameters);
    (this.myChooseNodeComponent).setNode(configuration.getNode());
  }

  public void dispose() {
    this.myJavaConfigurationOptions.dispose();
  }
}
