/*
 * Copyright 2003-2010 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrains.mps.typesystem.inference.util;

import jetbrains.mps.smodel.*;
import jetbrains.mps.smodel.event.SModelListener;
import jetbrains.mps.util.misc.ObjectCache;
import jetbrains.mps.util.misc.ObjectCache.DeletedPairsListener;
import jetbrains.mps.logging.Logger;

import java.util.*;

public class StructuralCollectionUtil {
  private static final Logger LOG = Logger.getLogger(StructuralCollectionUtil.class);

  private static final ObjectCache<SNode, Integer> ourHashCodeCash = new ObjectCache<SNode, Integer>(5000);
  private static final Map<SModel, Set<SNode>> ourModelsToNodes = new HashMap<SModel, Set<SNode>>();
  private static final SModelListener ourModelListener = new SModelAdapter() {
    @Override
    public void beforeModelDisposed(SModel model) {
      Set<SNode> nodeSet = ourModelsToNodes.get(model);
      for (SNode node : new HashSet<SNode>(nodeSet)) {
        ourHashCodeCash.remove(node);
      }
    }

    @Override
    public void modelReplaced(SModelDescriptor md) {
      SModelReference reference = md.getSModelReference();
      for (SModel model : ourModelsToNodes.keySet()) {
        if (reference.equals(model.getSModelReference())) {
          beforeModelDisposed(model);
          return;
        }
      }
    }
  };

  static {
    ourHashCodeCash.addDeletedPairsListener(new DeletedPairsListener() {
      @Override
      public void objectRemoved(Object key, Object value) {
        SNode node = (SNode) key;
        SModel model = node.getModel();
        Set<SNode> nodeSet = ourModelsToNodes.get(model);
        removeNodeFromSet(node, model, nodeSet);
      }
    });

    ModelChangedCaster.getInstance().addListener(new NodeModelChangedListener() {
      @Override
      public void modelChanged(SNode node, SModel oldModel) {
        SModel newModel = node.getModel();
        Set<SNode> oldNodeSet = ourModelsToNodes.get(oldModel);
        if (oldNodeSet != null && oldNodeSet.contains(node)) {
          removeNodeFromSet(node, oldModel, oldNodeSet);
          addNodeToSet(node, newModel);
        }
      }
    });
  }

  private static void removeNodeFromSet(SNode node, SModel model, Set<SNode> nodeSet) {
    if (nodeSet == null) {
      LOG.warning("node set is null");
      return;
    }
    nodeSet.remove(node);
    if (nodeSet.isEmpty()) {
      ourModelsToNodes.remove(model);
      SModelDescriptor modelDescriptor = model.getModelDescriptor();
      if (modelDescriptor != null) {
        modelDescriptor.removeModelListener(ourModelListener);
      }
    }
  }

  private static void addNodeToSet(SNode node, SModel model) {
    Set<SNode> nodeSet = ourModelsToNodes.get(model);
    if (nodeSet == null) {
      nodeSet = new HashSet<SNode>();
      ourModelsToNodes.put(model, nodeSet);
      model.getModelDescriptor().addModelListener(ourModelListener);
    }
    nodeSet.add(node);
  }

  public static int hashCode(final SNode node) {
    Integer result = ourHashCodeCash.tryKey(node);
    if (result != null) {
      return result;
    }
    StringBuilder sb = new StringBuilder();
    toString(sb, node, node);
    result = sb.toString().hashCode();
    ourHashCodeCash.cacheObject(node, result);

    SModel model = node.getModel();
    addNodeToSet(node, model);

    return result;
  }

  public static void toString(StringBuilder result, SNode root, SNode node) {
    result.append(node.getConceptFqName());
    result.append("(");

    Set<String> roles = new TreeSet<String>(node.getChildRoles(false));
    for (String role : roles) {
      for (SNode child : node.getChildren(role)) {
        toString(result, root, child);
        result.append(";");
      }
    }

    for (SReference ref : node.getReferences()) {
      SNode target = ref.getTargetNode();
      if (target != null && !target.isDescendantOf(root, true)) {
        result.append(target.getSNodeId());
      }
    }

    result.append(")");
  }

}
