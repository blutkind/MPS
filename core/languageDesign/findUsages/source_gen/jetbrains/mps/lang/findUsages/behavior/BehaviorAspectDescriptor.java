package jetbrains.mps.lang.findUsages.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.DescriptorProvider;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;

public class BehaviorAspectDescriptor extends DescriptorProvider<BehaviorDescriptor> {
  public BehaviorAspectDescriptor() {
  }

  public BehaviorDescriptor getDescriptor(String fqName) {
    switch ((fqName).hashCode()) {
      case -1681546880:
        return new FindBlock_BehaviorDescriptor();
      case -415867744:
        return new FinderDeclaration_BehaviorDescriptor();
      case 408242384:
        return new IsApplicableBlock_BehaviorDescriptor();
      case 238808196:
        return new ConceptFunctionParameter_node_BehaviorDescriptor();
      case -2054006786:
        return new ResultStatement_BehaviorDescriptor();
      case 714333881:
        return new NodeStatement_BehaviorDescriptor();
      case -1710867681:
        return new ExecuteFinderExpression_BehaviorDescriptor();
      case 206834080:
        return new CategorizeBlock_BehaviorDescriptor();
      case -658040233:
        return new SearchedNodesBlock_BehaviorDescriptor();
      case 1462314592:
        return new CheckCancelledStatusStatement_BehaviorDescriptor();
      case 1225576921:
        return new IsVisibleBlock_BehaviorDescriptor();
      case -191444834:
        // interface or abstract concept behavior jetbrains.mps.lang.findUsages.structure.AbstractFinderDeclaration 
        return null;
      case 360234436:
        return new ExecuteFindersGetSearchResults_BehaviorDescriptor();
      case -172640271:
        return new FinderReference_BehaviorDescriptor();
      case -772220656:
        return new MakeResultProvider_BehaviorDescriptor();
      default:
        return null;
    }
  }
}
