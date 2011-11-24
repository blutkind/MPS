package jetbrains.mps.build.packaging.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import java.util.Map;
import jetbrains.mps.smodel.runtime.PropertyConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BasePropertyConstraintsDescriptor;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.build.packaging.behavior.PluginModule_Behavior;
import jetbrains.mps.build.packaging.behavior.Module_Behavior;

public class PluginModule_Constraints extends BaseConstraintsDescriptor {
  public PluginModule_Constraints() {
    super("jetbrains.mps.build.packaging.structure.PluginModule");
  }

  @Override
  protected Map<String, PropertyConstraintsDescriptor> getNotDefaultProperties() {
    Map<String, PropertyConstraintsDescriptor> properties = new HashMap();
    properties.put("doNotJar", new BasePropertyConstraintsDescriptor("doNotJar", this) {
      @Override
      public boolean hasOwnGetter() {
        return true;
      }

      @Override
      public Object getValue(SNode node, IScope scope) {
        String propertyName = "doNotJar";
        return false;
      }
    });
    properties.put("id", new BasePropertyConstraintsDescriptor("id", this) {
      @Override
      public boolean hasOwnGetter() {
        return true;
      }

      @Override
      public Object getValue(SNode node, IScope scope) {
        String propertyName = "id";
        return PluginModule_Behavior.call_getPluginModule_989489456094442313(node).getModuleReference().getModuleId().toString();
      }
    });
    properties.put("name", new BasePropertyConstraintsDescriptor("name", this) {
      @Override
      public boolean hasOwnGetter() {
        return true;
      }

      @Override
      public Object getValue(SNode node, IScope scope) {
        String propertyName = "name";
        return Module_Behavior.extractModuleProperName_1235487584035(PluginModule_Behavior.call_getPluginModule_989489456094442313(node));
      }
    });
    return properties;
  }
}
