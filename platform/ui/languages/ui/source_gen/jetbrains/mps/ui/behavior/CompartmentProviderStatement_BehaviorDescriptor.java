package jetbrains.mps.ui.behavior;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.behavior.Statement_BehaviorDescriptor;
import jetbrains.mps.smodel.SNode;

public class CompartmentProviderStatement_BehaviorDescriptor extends Statement_BehaviorDescriptor implements IUIObjectContextProvider_BehaviorDescriptor {
  public CompartmentProviderStatement_BehaviorDescriptor() {
  }

  public boolean virtual_shouldReturnValue_8923564134259848103(SNode thisNode) {
    return CompartmentProviderStatement_Behavior.virtual_shouldReturnValue_8923564134259848103(thisNode);
  }

  public SNode virtual_getContextExpression_8923564134258345446(SNode thisNode) {
    return CompartmentProviderStatement_Behavior.virtual_getContextExpression_8923564134258345446(thisNode);
  }

  public SNode virtual_getContext_8923564134258345451(SNode thisNode) {
    return IUIObjectContextProvider_Behavior.virtual_getContext_8923564134258345451(thisNode);
  }

  public SNode virtual_getContainer_8923564134258257521(SNode thisNode) {
    return CompartmentProviderStatement_Behavior.virtual_getContainer_8923564134258257521(thisNode);
  }
}
