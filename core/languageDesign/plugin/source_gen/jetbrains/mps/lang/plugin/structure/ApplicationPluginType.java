package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.classifiers.structure.BaseClassifierType;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ApplicationPluginType extends BaseClassifierType {
public    static final String concept = "jetbrains.mps.lang.plugin.structure.ApplicationPluginType";
public    static final String PLUGIN = "plugin";

  public ApplicationPluginType(SNode node) {
    super(node);
  }

  public ApplicationPluginDeclaration getPlugin() {
    return (ApplicationPluginDeclaration)this.getReferent(ApplicationPluginType.PLUGIN);
  }

  public void setPlugin(ApplicationPluginDeclaration node) {
    super.setReferent(ApplicationPluginType.PLUGIN, node);
  }


  public static ApplicationPluginType newInstance(SModel sm, boolean init) {
    return (ApplicationPluginType)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.ApplicationPluginType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ApplicationPluginType newInstance(SModel sm) {
    return ApplicationPluginType.newInstance(sm, false);
  }

}
