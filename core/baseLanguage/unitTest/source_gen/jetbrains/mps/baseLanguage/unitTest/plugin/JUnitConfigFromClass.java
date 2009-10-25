package jetbrains.mps.baseLanguage.unitTest.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.runconfigs.BaseConfigCreator;
import jetbrains.mps.smodel.SNode;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.util.containers.ContainerUtil;
import com.intellij.openapi.extensions.Extensions;
import jetbrains.mps.plugins.pluginparts.runconfigs.MPSPsiElement;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class JUnitConfigFromClass extends BaseConfigCreator<SNode> implements Cloneable {
  private RunConfiguration myConfig;

  public JUnitConfigFromClass() {
    super(ContainerUtil.findInstance(Extensions.getExtensions(JUnit_ConfigurationType.CONFIGURATION_TYPE_EP), JUnit_ConfigurationType.class));
  }

  protected RunConfiguration doCreateConfiguration(SNode node) {
    this.createConfig(node);
    return this.myConfig;
  }

  private void createConfig(final SNode parameter) {
    JUnitConfigFromClass.this.setSourceElement(new MPSPsiElement<SNode>(parameter) {    });

    {
      JUnit_ConfigurationType configType = ContainerUtil.findInstance(Extensions.getExtensions(JUnit_ConfigurationType.CONFIGURATION_TYPE_EP), JUnit_ConfigurationType.class);
      DefaultJUnit_Configuration _config = new DefaultJUnit_Configuration(JUnitConfigFromClass.this.getContext().getProject(), configType.getConfigurationFactories()[0], "NewConfig");
      _config.setName(SPropertyOperations.getString(parameter, "name"));
      _config.getStateObject().type = JUnitRunTypes.NODE;
      _config.getStateObject().node = INamedConcept_Behavior.call_getFqName_1213877404258(parameter);
      JUnitConfigFromClass.this.myConfig = _config;
    }
  }

  @Override
  public JUnitConfigFromClass clone() {
    return ((JUnitConfigFromClass)super.clone());
  }

  protected boolean isApplicable(final Object element) {
    return element instanceof SNode && SNodeOperations.isInstanceOf(((SNode)element), "jetbrains.mps.baseLanguage.unitTest.structure.ITestCase");
  }
}
