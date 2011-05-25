package jetbrains.mps.baseLanguage.logging.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.DescriptorProvider;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;

public class BehaviorAspectDescriptor extends DescriptorProvider<BehaviorDescriptor> {
  public BehaviorAspectDescriptor() {
  }

  public BehaviorDescriptor getDescriptor(String fqName) {
    switch ((fqName).hashCode()) {
      case 72083556:
        return new LogStatement_BehaviorDescriptor();
      case 1410338011:
        return new PrintStatement_BehaviorDescriptor();
      default:
        return null;
    }
  }
}
