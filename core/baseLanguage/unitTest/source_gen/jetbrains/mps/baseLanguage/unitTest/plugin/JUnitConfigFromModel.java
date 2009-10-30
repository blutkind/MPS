package jetbrains.mps.baseLanguage.unitTest.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.runconfigs.BaseConfigCreator;
import jetbrains.mps.smodel.SModel;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.util.containers.ContainerUtil;
import com.intellij.openapi.extensions.Extensions;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.plugins.pluginparts.runconfigs.MPSPsiElement;

public class JUnitConfigFromModel extends BaseConfigCreator<SModel> implements Cloneable {
  private RunConfiguration myConfig;

  public JUnitConfigFromModel() {
    super(ContainerUtil.findInstance(Extensions.getExtensions(JUnit_ConfigurationType.CONFIGURATION_TYPE_EP), JUnit_ConfigurationType.class));
  }

  protected RunConfiguration doCreateConfiguration(SModel node) {
    this.createConfig(node);
    return this.myConfig;
  }

  private void createConfig(final SModel parameter) {
    if (ListSequence.fromList(TestRunUtil.getModelTests(parameter)).isEmpty()) {
      return;
    }
    final String name = SModelOperations.getModelName(parameter);
    JUnitConfigFromModel.this.setSourceElement(new MPSPsiElement<SModel>(parameter) {    });
    {
      JUnit_ConfigurationType configType = ContainerUtil.findInstance(Extensions.getExtensions(JUnit_ConfigurationType.CONFIGURATION_TYPE_EP), JUnit_ConfigurationType.class);
      DefaultJUnit_Configuration _config = new DefaultJUnit_Configuration(JUnitConfigFromModel.this.getContext().getProject(), configType.getConfigurationFactories()[0], "NewConfig") {
        @Override
        public String suggestedName() {
          return "Tests in '" + name + "'";
        }
      };
      _config.setName(name);
      _config.getStateObject().type = JUnitRunTypes.MODEL;
      _config.getStateObject().model = parameter.getLongName();
      JUnitConfigFromModel.this.myConfig = _config;
    }
  }

  @Override
  public JUnitConfigFromModel clone() {
    return ((JUnitConfigFromModel)super.clone());
  }

  protected boolean isApplicable(final Object element) {
    return element instanceof SModel;
  }
}
