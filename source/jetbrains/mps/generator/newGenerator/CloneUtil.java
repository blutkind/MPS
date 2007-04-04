package jetbrains.mps.generator.newGenerator;

import jetbrains.mps.smodel.*;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by: Sergey Dmitriev
 * Date: Apr 2, 2007
 */
public class CloneUtil {
  /**
  Creates cloned model, each node in target model has the same nodeId that corresponding node in source model
  it allows to resolve internal references much faster
   */

  public static List<SNode> copy(List<SNode> nodes, SModel targetModel, IScope scope) {
    List<SNode> results = new ArrayList<SNode>();
    for (SNode node : nodes) {
      results.add(clone(node, targetModel, scope));
    }
    return results;
  }

  private static SNode clone (SNode node, SModel targetModel, IScope scope) {
    SNode result = SModelUtil_new.instantiateConceptDeclaration(node.getConceptFqName(), targetModel, scope, false);
    assert result != null;
    result.setId(node.getId());
    targetModel.addLanguage(node.getLanguage(scope));
    for (String property : node.getProperties().keySet()) {
      result.setProperty(property, node.getProperty(property), false);
    }
    for (SReference reference : node.getReferences()) {
/*
      if(reference.isExternal()) {
        try {
          result.addReferent(reference.getRole(), reference.getTargetNode());
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
      else {
*/
        SModelUID targetModelUID = reference.isExternal() ? reference.getTargetModelUID() : targetModel.getUID();
        SReference sReference = SReference.newInstance(reference.getRole(), result, reference.getTargetNodeId(), reference.getExtResolveInfo(), targetModelUID, reference.getResolveInfo());
        result.addSReference(sReference);
//      }
    }
    for (SNode child : node.getChildren()) {
      result.addChild(node.getRoleOf(child), clone(child, targetModel, scope));
    }
    return result;
  }

}
