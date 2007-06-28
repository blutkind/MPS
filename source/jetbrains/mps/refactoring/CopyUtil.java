package jetbrains.mps.refactoring;

import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CopyUtil  {
  public static<SN extends SNode> List<SN> copy(List<SN> nodes, SModel targetModel, IScope scope) {
    return copy(nodes, targetModel, new HashMap<SNode, SNode>(), scope);
  }

  public static<BA extends BaseAdapter> BA copy(BA node, SModel targetModel) {
    return (BA) copy(node.getNode(), targetModel, new HashMap<SNode, SNode>(), GlobalScope.getInstance()).getAdapter();
  }

  public static<BA extends BaseAdapter> BA copy(BA node, SModel targetModel, IScope scope) {
    return (BA) copy(node.getNode(), targetModel, new HashMap<SNode, SNode>(), scope).getAdapter();
  }

  public static<SN extends SNode> SN copy(SN node, SModel targetModel, IScope scope) {
    return copy(node, targetModel, new HashMap<SNode, SNode>(), scope);
  }

  /**
   * @deprecated use method with scope parameter instead
   */
  public static<SN extends SNode> SN copy(SN node, SModel targetModel) {
    return copy(node, targetModel, GlobalScope.getInstance());
  }

  public static <SN extends SNode> List<SN> copy(List<SN> nodes, SModel targetModel, Map<SNode, SNode> mapping, IScope scope) {
    List<SN> result = (List<SN>) clone(nodes, targetModel, mapping, scope);
    addReferences(nodes, mapping);
    return result;
  }

  /**
   * @deprecated use method with scope parameter instead
   */
  public static <SN extends SNode> SN copy(SN node, SModel targetModel, Map<SNode, SNode> mapping) {
    return copy(node, targetModel, mapping, GlobalScope.getInstance());      
  }

  public static <SN extends SNode> SN copy(SN node, SModel targetModel, Map<SNode, SNode> mapping, IScope scope) {
    SN result = (SN) clone(node, targetModel, mapping, scope);
    List<SN> nodes = new ArrayList<SN>();
    nodes.add(node);
    addReferences(nodes, mapping);
    return result;
  }

  private static SNode clone(SNode node, SModel targetModel, Map<SNode, SNode> mapping, IScope scope) {
    SNode result = SModelUtil_new.instantiateConceptDeclaration(node.getConceptFqName(), targetModel, scope, false);
    assert result != null;
    mapping.put(node, result);

    targetModel.addLanguage(node.getLanguage(scope));

    for (String property : node.getProperties().keySet()) {
      result.setProperty(property, node.getProperty(property), false);
    }

    for (SNode child : node.getChildren()) {
      result.addChild(node.getRoleOf(child), clone(child, targetModel, mapping, scope));
    }

    return result;
  }

   private static List<SNode> clone(List<? extends SNode> nodes, SModel targetModel, Map<SNode, SNode> mapping, IScope scope) {
     List<SNode> results = new ArrayList<SNode>();
     for (SNode node : nodes) {
       results.add(clone(node, targetModel, mapping, scope));
     }
     return results;
   }

  private static void addReferences(List<? extends SNode> sourceNodes, Map<SNode, SNode> mapping) {
    for (SNode node : sourceNodes) {
      SNode target = mapping.get(node);

      for (SReference ref : node.getReferences()) {
        if (mapping.containsKey(ref.getTargetNode())) {
          target.addReferent(ref.getRole(), mapping.get(ref.getTargetNode()));
        } else {
          target.addReferent(ref.getRole(), ref.getTargetNode());
        }
      }

      List<SNode> childList = new ArrayList<SNode>();
      for (SNode child : node.getChildren()) {
        childList.add(child);
      }
      addReferences(childList, mapping);
    }
  }
}
