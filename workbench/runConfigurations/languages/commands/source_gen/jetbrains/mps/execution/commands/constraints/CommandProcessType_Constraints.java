package jetbrains.mps.execution.commands.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.ConstraintsDataHolder;
import java.util.Map;
import jetbrains.mps.smodel.constraints.INodePropertyGetter;
import java.util.HashMap;
import jetbrains.mps.smodel.constraints.BaseNodePropertyGetter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class CommandProcessType_Constraints extends ConstraintsDataHolder {
  public CommandProcessType_Constraints() {
  }

  public String getConceptFqName() {
    return "jetbrains.mps.execution.commands.structure.CommandProcessType";
  }

  public Map<String, INodePropertyGetter> getNodePropertyGetters() {
    HashMap<String, INodePropertyGetter> result = new HashMap<String, INodePropertyGetter>();
    result.put("alias", new BaseNodePropertyGetter() {
      public Object execPropertyGet(SNode node, String propertyName, IScope scope) {
        String string = "process";
        if ((SLinkOperations.getTarget(node, "commandDeclaration", false) == null)) {
          return string;
        }
        return string + "<" + SPropertyOperations.getString(SLinkOperations.getTarget(node, "commandDeclaration", false), "name") + ">";
      }
    });
    return result;
  }
}
