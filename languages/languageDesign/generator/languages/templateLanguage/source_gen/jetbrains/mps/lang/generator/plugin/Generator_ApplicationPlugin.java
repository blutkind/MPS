package jetbrains.mps.lang.generator.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.applicationplugins.BaseApplicationPlugin;
import com.intellij.openapi.extensions.PluginId;

public class Generator_ApplicationPlugin extends BaseApplicationPlugin {
  private PluginId myId = PluginId.getId("jetbrains.mps.lang.generator");

  public Generator_ApplicationPlugin() {
  }

  public PluginId getId() {
    return myId;
  }
}
