package jetbrains.mps.ypath.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.applicationplugins.BaseApplicationPlugin;
import jetbrains.mps.plugins.pluginparts.custom.BaseCustomApplicationPlugin;

import java.util.ArrayList;
import java.util.List;

public class Ypath_ApplicationPlugin extends BaseApplicationPlugin {

  public void initGroups() {
  }

  public void adjustGroups() {
  }

  public List<BaseCustomApplicationPlugin> initCustomParts() {
    List<BaseCustomApplicationPlugin> res = new ArrayList<BaseCustomApplicationPlugin>();
    {
      BaseCustomApplicationPlugin plugin = new DesignPartLoader_CustomProjectPlugin();
      res.add(plugin);
      plugin.init();
    }
    return res;
  }

}
