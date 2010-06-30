package jetbrains.mps.generator.impl;

import jetbrains.mps.generator.IGeneratorLogger;
import jetbrains.mps.generator.IGeneratorLogger.ProblemDescription;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.util.Pair;
import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Evgeny Gryaznov, Feb 16, 2010
 */
public class GeneratorMappings {

  /* mapping,input -> output */
  private final ConcurrentMap<String, Map<SNode, Object>> myMappingNameAndInputNodeToOutputNodeMap = new ConcurrentHashMap<String, Map<SNode, Object>>();

  /* input -> output */
  private final Map<SNode, Object> myCopiedOutputNodeForInputNode;

  /* Object means multiple nodes for the template */
  private final ConcurrentMap<SNode, Object> myTemplateNodeToOutputNodeMap = new ConcurrentHashMap<SNode, Object>();

  /* template,input -> output */
  private final ConcurrentMap<Pair<SNode, SNode>, SNode> myTemplateNodeAndInputNodeToOutputNodeMap = new ConcurrentHashMap<Pair<SNode, SNode>, SNode>();

  public GeneratorMappings(int numberOfNodesInModel) {
    /* we use non-default load factor to reduce memory usage */ 
    myCopiedOutputNodeForInputNode = new ConcurrentHashMap<SNode, Object>(numberOfNodesInModel, 2);
  }

  void addOutputNodeByTemplateNode(SNode templateNode, @NotNull SNode outputNode) {
    synchronized (templateNode) {
      if (myTemplateNodeToOutputNodeMap.containsKey(templateNode)) {
        myTemplateNodeToOutputNodeMap.put(templateNode, this);
        return;
      }
      myTemplateNodeToOutputNodeMap.put(templateNode, outputNode);
    }
  }

  void addOutputNodeByInputNodeAndMappingName(SNode inputNode, String mappingName, SNode outputNode) {
    if (mappingName == null) return;
    Map<SNode, Object> currentMapping = myMappingNameAndInputNodeToOutputNodeMap.get(mappingName);
    if (currentMapping == null) {
      myMappingNameAndInputNodeToOutputNodeMap.putIfAbsent(mappingName, new HashMap<SNode, Object>());
      currentMapping = myMappingNameAndInputNodeToOutputNodeMap.get(mappingName); 
    }
    synchronized (currentMapping) {
      Object o = currentMapping.get(inputNode);
      if (o == null) {
        currentMapping.put(inputNode, outputNode);
      } else if (o instanceof List) {
        ((List<SNode>) o).add(outputNode);
      } else {
        List<SNode> list = new ArrayList<SNode>(4);
        list.add((SNode) o);
        list.add(outputNode);
        currentMapping.put(inputNode, list);
      }
    }
  }

  void addCopiedOutputNodeForInputNode(SNode inputNode, SNode outputNode) {
    if(outputNode == null) {
      return;
    }
    synchronized (inputNode) {
      Object o = myCopiedOutputNodeForInputNode.get(inputNode);
      if(o == null) {
        myCopiedOutputNodeForInputNode.put(inputNode, outputNode);
      } else if (o instanceof List) {
        ((List<SNode>) o).add(outputNode);
      } else {
        List<SNode> list = new ArrayList<SNode>(2);
        list.add((SNode) o);
        list.add(outputNode);
        myCopiedOutputNodeForInputNode.put(inputNode, list);
      }
    }
  }

  void addOutputNodeByInputAndTemplateNode(SNode inputNode, SNode templateNode, SNode outputNode) {
    // todo: combination of (templateN, inputN) -> outputN
    // todo: is not unique
    // todo: generator should report error on attempt to obtain not unique output-node
    if (templateNode == null) return;
    myTemplateNodeAndInputNodeToOutputNodeMap.put(new Pair(templateNode, inputNode), outputNode);
  }

  void addOutputNodeByIndirectInputAndTemplateNode(SNode inditectInputNode, SNode templateNode, SNode outputNode) {
    // todo: combination of (templateN, inputN) -> outputN
    // todo: is not unique
    // todo: generator should report error on attempt to obtain not unique output-node
    Pair key = new Pair(templateNode, inditectInputNode);
    myTemplateNodeAndInputNodeToOutputNodeMap.putIfAbsent(key, outputNode);
  }

  // find methods

  public SNode findOutputNodeByTemplateNodeUnique(SNode templateNode) {
    Object o = myTemplateNodeToOutputNodeMap.get(templateNode);
    return o instanceof SNode ? (SNode) o : null;
  }

  public SNode findOutputNodeByInputNodeAndMappingName(SNode inputNode, String mappingName, IGeneratorLogger logger) {
    if (mappingName == null) return null;
    Map<SNode, Object> currentMapping = myMappingNameAndInputNodeToOutputNodeMap.get(mappingName);
    if (currentMapping == null) return null;
    Object o = currentMapping.get(inputNode);
    if (o instanceof List) {
      List<SNode> list = (List<SNode>) o;
      ProblemDescription[] descr = new ProblemDescription[list.size()];
      for (int i = 0; i < list.size(); i++) {
        descr[i] = new ProblemDescription(list.get(i), "output [" + i + "] : " + list.get(i).getDebugText());
      }
      logger.warning(inputNode, "" + list.size() + " output nodes found for mapping label '" + mappingName + "' and input " + inputNode.getDebugText(), descr);
      return list.get(0);
    }

    return (SNode) o;
  }

  public List<SNode> findAllOutputNodesByInputNodeAndMappingName(SNode inputNode, String mappingName) {
    if (mappingName == null) return null;
    Map<SNode, Object> currentMapping = myMappingNameAndInputNodeToOutputNodeMap.get(mappingName);
    if (currentMapping == null) return null;
    Object o = currentMapping.get(inputNode);
    if (o == null) return Collections.emptyList();
    if (o instanceof List) return ((List<SNode>) o);
    return Collections.singletonList((SNode) o);
  }

  public SNode findCopiedOutputNodeForInputNode(SNode inputNode) {
    Object o = myCopiedOutputNodeForInputNode.get(inputNode);
    if(o instanceof SNode) {
      return (SNode) o;
    }
    if(o instanceof List) {
      return (SNode) ((List)o).get(0);
    }
    return null;
  }

  public SNode findOutputNodeByInputAndTemplateNode(SNode inputNode, SNode templateNode) {
    return myTemplateNodeAndInputNodeToOutputNodeMap.get(new Pair(templateNode, inputNode));
  }

  public boolean isInputNodeHasUniqueCopiedOutputNode(SNode inputNode) {
    Object o = myCopiedOutputNodeForInputNode.get(inputNode);
    return !(o instanceof List);
  }
}
