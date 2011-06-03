package jetbrains.mps.platform.conf.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.DescriptorProvider;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import java.util.Arrays;

public class BehaviorAspectDescriptor extends DescriptorProvider<BehaviorDescriptor> {
  private static String[] stringSwitchCases_846f5o_a0a0a = new String[]{"jetbrains.mps.platform.conf.structure.AbstractAction", "jetbrains.mps.platform.conf.structure.Action", "jetbrains.mps.platform.conf.structure.ActionReference", "jetbrains.mps.platform.conf.structure.Actions", "jetbrains.mps.platform.conf.structure.BeanExtension", "jetbrains.mps.platform.conf.structure.BeanExtensionAttribute", "jetbrains.mps.platform.conf.structure.BeanExtensionPoint", "jetbrains.mps.platform.conf.structure.Component", "jetbrains.mps.platform.conf.structure.ComponentRoot", "jetbrains.mps.platform.conf.structure.Components", "jetbrains.mps.platform.conf.structure.ComponentsRoot", "jetbrains.mps.platform.conf.structure.ConfigurationXmlDocument", "jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.ConfigurationXmlRootNode", "jetbrains.mps.platform.conf.structure.Extension", "jetbrains.mps.platform.conf.structure.ExtensionPoint", "jetbrains.mps.platform.conf.structure.ExtensionPoints", "jetbrains.mps.platform.conf.structure.Extensions", "jetbrains.mps.platform.conf.structure.Group", "jetbrains.mps.platform.conf.structure.GroupReference", "jetbrains.mps.platform.conf.structure.HasLevel", "jetbrains.mps.platform.conf.structure.IActionItem", "jetbrains.mps.platform.conf.structure.IConfiguration", "jetbrains.mps.platform.conf.structure.IConfigurationElement", "jetbrains.mps.platform.conf.structure.IConfigurationElementFragment", "jetbrains.mps.platform.conf.structure.IConfigurationFragment", "jetbrains.mps.platform.conf.structure.IExternalConfigurationFragment", "jetbrains.mps.platform.conf.structure.IPluginConfigurationFragment", "jetbrains.mps.platform.conf.structure.IdeaPluginRoot", "jetbrains.mps.platform.conf.structure.IdeaVersion", "jetbrains.mps.platform.conf.structure.IntefaceExtensionPoint", "jetbrains.mps.platform.conf.structure.InterfaceExtension", "jetbrains.mps.platform.conf.structure.KeyboardShortcut", "jetbrains.mps.platform.conf.structure.MouseShortcut", "jetbrains.mps.platform.conf.structure.Plugin", "jetbrains.mps.platform.conf.structure.PluginDependency", "jetbrains.mps.platform.conf.structure.PluginDetails", "jetbrains.mps.platform.conf.structure.PluginHelpset", "jetbrains.mps.platform.conf.structure.PluginVendor", "jetbrains.mps.platform.conf.structure.RootRoot", "jetbrains.mps.platform.conf.structure.Separator", "jetbrains.mps.platform.conf.structure.Service", "jetbrains.mps.platform.conf.structure.Shortcut", "jetbrains.mps.platform.conf.structure.XInclude"};

  public BehaviorAspectDescriptor() {
  }

  public BehaviorDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_846f5o_a0a0a, fqName)) {
      case 7:
        return new Component_BehaviorDescriptor();
      case 14:
        // interface or abstract concept behavior jetbrains.mps.platform.conf.structure.Extension 
        return null;
      case 23:
        // interface or abstract concept behavior jetbrains.mps.platform.conf.structure.IConfigurationElement 
        return null;
      case 15:
        // interface or abstract concept behavior jetbrains.mps.platform.conf.structure.ExtensionPoint 
        return null;
      case 25:
        // interface or abstract concept behavior jetbrains.mps.platform.conf.structure.IConfigurationFragment 
        return null;
      case 22:
        // interface or abstract concept behavior jetbrains.mps.platform.conf.structure.IConfiguration 
        return null;
      case 11:
        return new ConfigurationXmlDocument_BehaviorDescriptor();
      case 26:
        // interface or abstract concept behavior jetbrains.mps.platform.conf.structure.IExternalConfigurationFragment 
        return null;
      case 43:
        return new XInclude_BehaviorDescriptor();
      case 12:
        // interface or abstract concept behavior jetbrains.mps.platform.conf.structure.ConfigurationXmlNode 
        return null;
      case 16:
        return new ExtensionPoints_BehaviorDescriptor();
      case 9:
        return new Components_BehaviorDescriptor();
      case 6:
        return new BeanExtensionPoint_BehaviorDescriptor();
      case 30:
        return new IntefaceExtensionPoint_BehaviorDescriptor();
      case 41:
        return new Service_BehaviorDescriptor();
      case 20:
        // interface or abstract concept behavior jetbrains.mps.platform.conf.structure.HasLevel 
        return null;
      case 17:
        return new Extensions_BehaviorDescriptor();
      case 28:
        // interface or abstract concept behavior jetbrains.mps.platform.conf.structure.IdeaPluginRoot 
        return null;
      case 4:
        return new BeanExtension_BehaviorDescriptor();
      case 31:
        return new InterfaceExtension_BehaviorDescriptor();
      case 5:
        return new BeanExtensionAttribute_BehaviorDescriptor();
      case 24:
        // interface or abstract concept behavior jetbrains.mps.platform.conf.structure.IConfigurationElementFragment 
        return null;
      case 10:
        return new ComponentsRoot_BehaviorDescriptor();
      case 8:
        return new ComponentRoot_BehaviorDescriptor();
      case 39:
        return new RootRoot_BehaviorDescriptor();
      case 27:
        // interface or abstract concept behavior jetbrains.mps.platform.conf.structure.IPluginConfigurationFragment 
        return null;
      case 34:
        return new Plugin_BehaviorDescriptor();
      case 35:
        return new PluginDependency_BehaviorDescriptor();
      case 38:
        return new PluginVendor_BehaviorDescriptor();
      case 36:
        return new PluginDetails_BehaviorDescriptor();
      case 29:
        return new IdeaVersion_BehaviorDescriptor();
      case 37:
        return new PluginHelpset_BehaviorDescriptor();
      case 3:
        return new Actions_BehaviorDescriptor();
      case 0:
        // interface or abstract concept behavior jetbrains.mps.platform.conf.structure.AbstractAction 
        return null;
      case 42:
        return new Shortcut_BehaviorDescriptor();
      case 33:
        return new MouseShortcut_BehaviorDescriptor();
      case 32:
        return new KeyboardShortcut_BehaviorDescriptor();
      case 18:
        return new Group_BehaviorDescriptor();
      case 19:
        return new GroupReference_BehaviorDescriptor();
      case 2:
        return new ActionReference_BehaviorDescriptor();
      case 1:
        return new Action_BehaviorDescriptor();
      case 21:
        // interface or abstract concept behavior jetbrains.mps.platform.conf.structure.IActionItem 
        return null;
      case 40:
        return new Separator_BehaviorDescriptor();
      case 13:
        // interface or abstract concept behavior jetbrains.mps.platform.conf.structure.ConfigurationXmlRootNode 
        return null;
      default:
        return null;
    }
  }
}
