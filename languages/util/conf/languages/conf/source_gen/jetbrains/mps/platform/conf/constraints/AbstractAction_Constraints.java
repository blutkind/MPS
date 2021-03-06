package jetbrains.mps.platform.conf.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import java.util.Map;
import jetbrains.mps.smodel.runtime.PropertyConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BasePropertyConstraintsDescriptor;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptPropertyOperations;

public class AbstractAction_Constraints extends BaseConstraintsDescriptor {
  public AbstractAction_Constraints() {
    super("jetbrains.mps.platform.conf.structure.AbstractAction");
  }

  @Override
  protected Map<String, PropertyConstraintsDescriptor> getNotDefaultProperties() {
    Map<String, PropertyConstraintsDescriptor> properties = new HashMap();
    properties.put("resolveInfo", new BasePropertyConstraintsDescriptor("resolveInfo", this) {
      @Override
      public boolean hasOwnGetter() {
        return true;
      }

      @Override
      public Object getValue(SNode node, IScope scope) {
        String propertyName = "resolveInfo";
        {
          String id = node.getProperty("id");
          id = (id == null ?
            node.getId() :
            id
          );
          return SConceptPropertyOperations.getString(node, "alias") + "$" + (id).replace('.', '-');

        }
      }
    });
    return properties;
  }
}
