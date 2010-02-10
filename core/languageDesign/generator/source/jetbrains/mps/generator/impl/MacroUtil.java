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
package jetbrains.mps.generator.impl;

import jetbrains.mps.generator.GenerationFailureException;
import jetbrains.mps.generator.template.ITemplateGenerator;
import jetbrains.mps.generator.template.QueryExecutor;
import jetbrains.mps.lang.generator.structure.*;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.smodel.SNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by: Sergey Dmitriev
 * Date: Jan 24, 2007
 */
public class MacroUtil {

  public static List<SNode> getNewInputNodes(NodeMacro nodeMacro, SNode currentInputNode, ITemplateGenerator generator) throws GenerationFailureException {
    try {
      if (nodeMacro instanceof LoopMacro) {
        return getNewInputNodes(currentInputNode, (SourceSubstituteMacro) nodeMacro, ((LoopMacro) nodeMacro).getSourceNodesQuery(), generator);
      } else if (nodeMacro instanceof CopySrcListMacro) {
        return getNewInputNodes(currentInputNode, (SourceSubstituteMacro) nodeMacro, ((CopySrcListMacro) nodeMacro).getSourceNodesQuery(), generator);
      } else if (nodeMacro instanceof MapSrcListMacro) {
        return getNewInputNodes(currentInputNode, (SourceSubstituteMacro) nodeMacro, ((MapSrcListMacro) nodeMacro).getSourceNodesQuery(), generator);
      }

      if (nodeMacro instanceof CopySrcNodeMacro) {
        List<SNode> result = new ArrayList<SNode>(1);
        SNode newInputNode = getNewInputNode(currentInputNode, (SourceSubstituteMacro) nodeMacro, ((CopySrcNodeMacro) nodeMacro).getSourceNodeQuery(), false, generator);
        if (newInputNode != null) {
          result.add(newInputNode);
        }
        return result;
      } else if (nodeMacro instanceof MapSrcNodeMacro) {
        List<SNode> result = new ArrayList<SNode>(1);
        SNode newInputNode = getNewInputNode(currentInputNode, (SourceSubstituteMacro) nodeMacro, ((MapSrcNodeMacro) nodeMacro).getSourceNodeQuery(), true, generator);
        if (newInputNode != null) {
          result.add(newInputNode);
        }
        return result;
      }

      if (nodeMacro instanceof SwitchMacro) {
        throw new GenerationFailureException("SwitchMacro is not supported by getNewInputNodes", currentInputNode, nodeMacro.getNode(), null);
      } else if (nodeMacro instanceof IncludeMacro) {
        throw new GenerationFailureException("IncludeMacro is not supported by getNewInputNodes", currentInputNode, nodeMacro.getNode(), null);
      }

      // <default> : propagate  current input node
      List<SNode> list = new ArrayList<SNode>(1);
      list.add(currentInputNode);
      return list;

    } catch (Throwable t) {
      throw new GenerationFailureException("couldn't get input nodes", currentInputNode, nodeMacro.getNode(), null, t);
    }
  }

  /**
   * only applicable to macros, which can yield 1 new output node
   */
  public static SNode getNewInputNode(NodeMacro nodeMacro, SNode currentInputNode, ITemplateGenerator generator) throws GenerationFailureException {
    try {
      if (nodeMacro instanceof SwitchMacro) {
        return getNewInputNodeForSwitchMacro(currentInputNode, (SwitchMacro) nodeMacro, generator);
      } else if (nodeMacro instanceof IncludeMacro) {
        return getNewInputNode(currentInputNode, (SourceSubstituteMacro) nodeMacro, ((IncludeMacro) nodeMacro).getSourceNodeQuery(), true, generator);
      }
    } catch (Throwable t) {
      throw new GenerationFailureException("couldn't get new input node", currentInputNode, nodeMacro.getNode(), null, t);
    }
    throw new GenerationFailureException("couldn't get new input node", currentInputNode, nodeMacro.getNode(), null);
  }

  private static SNode getNewInputNode(SNode currentInputNode, SourceSubstituteMacro macro, SourceSubstituteMacro_SourceNodeQuery query, boolean optionalQuery, ITemplateGenerator generator) throws GenerationFailureException {
    if (query == null) {
      if (optionalQuery) {
        // continue with current source node
        return currentInputNode;
      }
      throw new GenerationFailureException("couldn't evaluate macro query", currentInputNode, BaseAdapter.fromAdapter(macro), null);
    }

    SNode resultNode = QueryExecutor.evaluateSourceNodeQuery(currentInputNode, macro.getNode(), query, generator);
    return resultNode;
  }

  private static List<SNode> getNewInputNodes(SNode currentInputNode, SourceSubstituteMacro macro, SourceSubstituteMacro_SourceNodesQuery query, ITemplateGenerator generator) throws GenerationFailureException {
    if (query != null) {
      List<SNode> list = QueryExecutor.evaluateSourceNodesQuery(currentInputNode, null, macro.getNode(), query, generator);
      if (list != null) {
        return list;
      }
      return new LinkedList<SNode>();
    }

    throw new GenerationFailureException("couldn't evaluate macro query", currentInputNode, BaseAdapter.fromAdapter(macro), null);
  }

  private static SNode getNewInputNodeForSwitchMacro(SNode currentInputNode, SwitchMacro macro, ITemplateGenerator generator) {
    // in SWITCH the input query is optional
    SourceSubstituteMacro_SourceNodeQuery query = macro.getSourceNodeQuery();
    if (query == null) {
      // continue with current input node
      return currentInputNode;
    }
    return QueryExecutor.evaluateSourceNodeQuery(currentInputNode, macro.getNode(), query, generator);
  }
}
