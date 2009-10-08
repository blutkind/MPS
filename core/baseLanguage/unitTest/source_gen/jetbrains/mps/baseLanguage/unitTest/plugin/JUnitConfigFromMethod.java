package jetbrains.mps.baseLanguage.unitTest.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.runconfigs.BaseConfigCreator;
import jetbrains.mps.smodel.SNode;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.util.containers.ContainerUtil;
import com.intellij.openapi.extensions.Extensions;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.plugins.pluginparts.runconfigs.MPSPsiElement;
import jetbrains.mps.baseLanguage.unitTest.behavior.ITestMethod_Behavior;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;

public class JUnitConfigFromMethod extends BaseConfigCreator<SNode> implements Cloneable {
  private RunConfiguration myConfig;

  public JUnitConfigFromMethod() {
    super(ContainerUtil.findInstance(Extensions.getExtensions(JUnit_ConfigurationType.CONFIGURATION_TYPE_EP), JUnit_ConfigurationType.class));
  }

  protected RunConfiguration doCreateConfiguration(SNode node) {
    this.createConfig(node);
    return this.myConfig;
  }

  private void createConfig(SNode node) {
    if (!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.unitTest.structure.ITestMethod"))) {
      return;
    }

    JUnitConfigFromMethod.this.setSourceElement(new MPSPsiElement<SNode>(node) {    });

    {
      JUnit_ConfigurationType configType = ContainerUtil.findInstance(Extensions.getExtensions(JUnit_ConfigurationType.CONFIGURATION_TYPE_EP), JUnit_ConfigurationType.class);
      DefaultJUnit_Configuration _config = new DefaultJUnit_Configuration(JUnitConfigFromMethod.this.getContext().getProject(), configType.getConfigurationFactories()[0], "NewConfig");
      _config.setName(ITestMethod_Behavior.call_getTestName_1216136419751(SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.unitTest.structure.ITestMethod")));
      _config.getStateObject().type = JUnitRunTypes.METHOD;
      _config.getStateObject().method = ITestMethod_Behavior.call_getTestName_1216136419751(SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.unitTest.structure.ITestMethod"));
      _config.getStateObject().node = INamedConcept_Behavior.call_getFqName_1213877404258(ITestMethod_Behavior.call_getTestCase_1216134500045(SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.unitTest.structure.ITestMethod")));
      JUnitConfigFromMethod.this.myConfig = _config;
    }
  }

  @Override
  public JUnitConfigFromMethod clone() {
    return ((JUnitConfigFromMethod)super.clone());
  }

  protected boolean isApplicable(Object element) {
    return element instanceof SNode;
  }
}
