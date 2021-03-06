package jetbrains.mps.buildlanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import java.util.Map;
import jetbrains.mps.smodel.runtime.PropertyConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BasePropertyConstraintsDescriptor;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.buildlanguage.behavior.PropertyValueExpression_Behavior;

public class MultiLineString_Constraints extends BaseConstraintsDescriptor {
  public MultiLineString_Constraints() {
    super("jetbrains.mps.buildlanguage.structure.MultiLineString");
  }

  @Override
  protected Map<String, PropertyConstraintsDescriptor> getNotDefaultProperties() {
    Map<String, PropertyConstraintsDescriptor> properties = new HashMap();
    properties.put("name", new BasePropertyConstraintsDescriptor("name", this) {
      @Override
      public boolean hasOwnGetter() {
        return true;
      }

      @Override
      public Object getValue(SNode node, IScope scope) {
        String propertyName = "name";
        {
          String result = "";
          for (SNode lit : ListSequence.fromList(SLinkOperations.getTargets(node, "stringExpression", true))) {
            result += PropertyValueExpression_Behavior.call_toString_1213877472569(lit);
          }
          return (result.length() > 0 ?
            result :
            ""
          );
        }
      }
    });
    return properties;
  }
}
