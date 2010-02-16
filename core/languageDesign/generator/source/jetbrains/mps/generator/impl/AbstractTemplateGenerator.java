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

import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.generator.GenerationCanceledException;
import jetbrains.mps.generator.GenerationFailureException;
import jetbrains.mps.generator.template.ITemplateGenerator;
import jetbrains.mps.lang.generator.structure.Reduction_MappingRule;
import jetbrains.mps.lang.generator.structure.RuleConsequence;
import jetbrains.mps.lang.generator.structure.TemplateSwitch;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import jetbrains.mps.smodel.*;

import java.util.*;

public abstract class AbstractTemplateGenerator implements ITemplateGenerator {

  private IOperationContext myOperationContext;
  private ProgressIndicator myProgressMonitor;
  private GeneratorLogger myLogger;

  protected final SModel myInputModel;
  protected final SModel myOutputModel;

  private GeneratorMappings myMappings;

  private TemplateSwitchGraph myTemplateSwitchGraph;
  private Map<TemplateSwitch, List<TemplateSwitch>> myTemplateSwitchToListCache;
  private Map<String, SNode> myCurrentPreviousInputNodesByMappingName;

  protected AbstractTemplateGenerator(IOperationContext operationContext,
                                      ProgressIndicator progressMonitor, GeneratorLogger logger,
                                      SModel inputModel, SModel outputModel) {
    myOperationContext = operationContext;
    myProgressMonitor = progressMonitor;
    myLogger = logger;
    myInputModel = inputModel;
    myOutputModel = outputModel;
    myMappings = new GeneratorMappings();
  }

  public IOperationContext getOperationContext() {
    return myOperationContext;
  }

  public IScope getScope() {
    if (myOperationContext != null) {
      return myOperationContext.getScope();
    }
    return null;
  }

  public ProgressIndicator getProgressMonitor() {
    return myProgressMonitor;
  }

  protected void checkMonitorCanceled() throws GenerationCanceledException {
    if (myProgressMonitor.isCanceled()) throw new GenerationCanceledException();
  }

  public void showInformationMessage(SNode node, String message) {
    myLogger.showInformationMessage(node, message);
  }

  public void showWarningMessage(SNode node, String message) {
    myLogger.showWarningMessage(node, message);
  }

  public void showErrorMessage(SNode node, String message) {
    myLogger.showErrorMessage(node, message);
  }

  public void showErrorMessage(SNode inputNode, SNode templateNode, String message) {
    myLogger.showErrorMessage(inputNode, templateNode, message);
  }

  public void showErrorMessage(SNode inputNode, SNode templateNode, SNode ruleNode, String message) {
    myLogger.showErrorMessage(inputNode, templateNode, ruleNode, message);
  }

  public int getErrorCount() {
    return myLogger.getErrorCount();
  }

  public int getWarningCount() {
    return myLogger.getWarningCount();
  }

  public SModel getInputModel() {
    return myInputModel;
  }

  /**
   * @deprecated
   */
  public SModel getSourceModel() {
    return myInputModel;
  }

  public SModel getOutputModel() {
    return myOutputModel;
  }

  /**
   * @deprecated
   */
  public SModel getTargetModel() {
    return myOutputModel;
  }

  public GeneratorMappings getMappings() {
    return myMappings;
  }

  public SNode findOutputNodeByTemplateNode(SNode templateNode, boolean unique) {
    return myMappings.findOutputNodeByTemplateNode(templateNode, unique);
  }

  @Override
  public SNode findOutputNodeByInputNodeAndMappingName(SNode inputNode, String mappingName) {
    return myMappings.findOutputNodeByInputNodeAndMappingName(inputNode, mappingName, myLogger);
  }

  @Override
  public SNode findOutputNodeByInputNodeAndOutputNodeAndMappingName(SNode inputNode, SNode outputNode, String mappingName) {
    return myMappings.findOutputNodeByInputNodeAndOutputNodeAndMappingName(inputNode, outputNode, mappingName, myLogger);
  }

  @Override
  public List<SNode> findAllOutputNodesByInputNodeAndMappingName(SNode inputNode, String mappingName) {
    return myMappings.findAllOutputNodesByInputNodeAndMappingName(inputNode, mappingName);
  }

  @Override
  public SNode findCopiedOutputNodeForInputNode(SNode inputNode) {
    return findOutputNodeByInputAndTemplateNode(inputNode, inputNode);
  }

  /*package*/

  SNode findCopiedOutputNodeForInputNode_unique(SNode inputNode) {
    SNode node = findOutputNodeByInputAndTemplateNode(inputNode, inputNode);
    if (myMappings.isInputNodeHasUniqueCopiedOutputNode(inputNode)) return node;
    return null;
  }

  public SNode findOutputNodeByInputAndTemplateNode(SNode inputNode, SNode templateNode) {
    SNode outputNode = myMappings.findOutputNodeByInputAndTemplateNode(inputNode, templateNode);
    if (outputNode == null) {
      // input node has been cloned?
      if (inputNode == templateNode) {
        outputNode = findOutputNodeById(inputNode.getSNodeId());
      }
    }
    return outputNode;
  }

  public Map<String, SNode> setPreviousInputNodesByMappingName(Map<String, SNode> inputNodesByMappingName) {
    Map<String, SNode> old = myCurrentPreviousInputNodesByMappingName;
    myCurrentPreviousInputNodesByMappingName = inputNodesByMappingName;
    return old;
  }

  public SNode getPreviousInputNodeByMappingName(String mappingName) {
    if (myCurrentPreviousInputNodesByMappingName == null || mappingName == null) {
      return null;
    }
    return myCurrentPreviousInputNodesByMappingName.get(mappingName);
  }

  public RuleConsequence getConsequenceForSwitchCase(SNode inputNode, TemplateSwitch templateSwitch) throws GenerationFailureException {
    AbstractConceptDeclaration inputNodeConcept = inputNode.getConceptDeclarationAdapter();

    if (myTemplateSwitchGraph == null) {
      myTemplateSwitchGraph = new TemplateSwitchGraph(getGeneratorSessionContext().getTemplateModels());
      myTemplateSwitchToListCache = new HashMap<TemplateSwitch, List<TemplateSwitch>>();
    }

    List<TemplateSwitch> switches = myTemplateSwitchToListCache.get(templateSwitch);
    if (switches == null) {
      switches = myTemplateSwitchGraph.getSubgraphAsList(templateSwitch);
      myTemplateSwitchToListCache.put(templateSwitch, switches);
    }

    // for each template switch test conditions and choose template node
    for (TemplateSwitch aSwitch : switches) {
      List<Reduction_MappingRule> rules = aSwitch.getReductionMappingRules();
      for (Reduction_MappingRule rule : rules) {
        if (GeneratorUtil.checkPremiseForBaseMappingRule(inputNode, inputNodeConcept, rule, this)) {
          RuleConsequence ruleConsequence = rule.getRuleConsequence();
          if (ruleConsequence == null) {
            showErrorMessage(inputNode, null, rule.getNode(), "couldn't apply reduction: no rule consequence");
          }
          return ruleConsequence;
        }
      }

      // default
      RuleConsequence ruleConsequence = aSwitch.getDefaultConsequence();
      if (ruleConsequence != null) {
        return ruleConsequence;
      }
    }

    return null;
  }

  public SNode findOutputNodeById(SNodeId nodeId) {
    return myOutputModel.getNodeById(nodeId);
  }

  public SNode findInputNodeById(SNodeId nodeId) {
    return myInputModel.getNodeById(nodeId);
  }
}
