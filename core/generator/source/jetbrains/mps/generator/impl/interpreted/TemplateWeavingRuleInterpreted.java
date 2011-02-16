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
package jetbrains.mps.generator.impl.interpreted;

import jetbrains.mps.generator.GenerationCanceledException;
import jetbrains.mps.generator.IGeneratorLogger.ProblemDescription;
import jetbrains.mps.generator.impl.*;
import jetbrains.mps.generator.impl.TemplateProcessor.TemplateProcessingFailureException;
import jetbrains.mps.generator.runtime.GenerationException;
import jetbrains.mps.generator.runtime.TemplateContext;
import jetbrains.mps.generator.runtime.TemplateExecutionEnvironment;
import jetbrains.mps.generator.runtime.TemplateWeavingRule;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.generator.template.TemplateFunctionMethodName;
import jetbrains.mps.generator.template.WeavingMappingRuleContext;
import jetbrains.mps.lang.generator.structure.*;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.util.QueryMethodGenerated;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Evgeny Gryaznov, Nov 30, 2010
 */
public class TemplateWeavingRuleInterpreted implements TemplateWeavingRule {

  private final SNode ruleNode;
  private final SNode applicableConcept;

  public TemplateWeavingRuleInterpreted(SNode rule) {
    ruleNode = rule;
    applicableConcept = RuleUtil.getBaseRuleApplicableConcept(ruleNode);
  }

  @Override
  public SNodePointer getRuleNode() {
    return new SNodePointer(ruleNode);
  }

  @Override
  public String getApplicableConcept() {
    return NameUtil.nodeFQName(this.applicableConcept);
  }

  @Override
  public boolean applyToInheritors() {
    return RuleUtil.getBaseRuleApplyToConceptInheritors(ruleNode);
  }

  @Override
  public SNode getContextNode(TemplateExecutionEnvironment environment, TemplateContext context) {
    SNode contextQuery = ruleNode.getChild(Weaving_MappingRule.CONTEXT_NODE_QUERY);
    if (contextQuery == null) {
      return null;
    }

    String methodName = TemplateFunctionMethodName.weaving_MappingRule_ContextNodeQuery(contextQuery);
    try {
      return (SNode) QueryMethodGenerated.invoke(
        methodName,
        environment.getGenerator().getGeneratorSessionContext(),
        new WeavingMappingRuleContext(context.getInput(), ruleNode, environment.getGenerator()),
        ruleNode.getModel());
    } catch (NoSuchMethodException e) {
      environment.getGenerator().getLogger().warning(ruleNode, "cannot find context node query '" + methodName + "' : evaluate to null");
      return null;
    } catch (Exception e) {
      environment.getGenerator().showErrorMessage(context.getInput(), null, ruleNode, "cannot evaluate rule context query");
      environment.getGenerator().getLogger().handleException(e);
    }
    return null;
  }

  @Override
  public boolean isApplicable(TemplateExecutionEnvironment environment, TemplateContext context) throws GenerationException {
    SNode condition = RuleUtil.getBaseRuleCondition(ruleNode);
    if (condition == null) {
      return true;
    }

    String methodName = TemplateFunctionMethodName.baseMappingRule_Condition(condition);
    try {
      return (Boolean) QueryMethodGenerated.invoke(
        methodName,
        environment.getGenerator().getGeneratorSessionContext(),
        new BaseMappingRuleContext(context.getInput(), ruleNode, environment.getGenerator()),
        ruleNode.getModel(),
        true);
    } catch (ClassNotFoundException e) {
      environment.getGenerator().getLogger().warning(condition, "cannot find condition method '" + methodName + "' : evaluate to FALSE");
    } catch (NoSuchMethodException e) {
      environment.getGenerator().getLogger().warning(condition, "cannot find condition method '" + methodName + "' : evaluate to FALSE");
    } catch (Throwable t) {
      throw new GenerationFailureException("error executing condition ", condition, t);
    }
    return false;
  }

  @Override
  public boolean apply(TemplateExecutionEnvironment environment, TemplateContext context, SNode outputContextNode) throws GenerationException {
    SNode consequence = ruleNode.getChild(Weaving_MappingRule.RULE_CONSEQUENCE);
    if (consequence == null) {
      environment.getGenerator().showErrorMessage(context.getInput(), null, ruleNode, "weaving rule: no rule consequence");
      return false;
    }

    RuleConsequence ruleConsequence = (RuleConsequence) consequence.getAdapter();
    environment.getTracer().pushRuleConsequence(new SNodePointer(consequence));
    if (ruleConsequence instanceof TemplateDeclarationReference) {
      TemplateDeclaration template = ((TemplateDeclarationReference) ruleConsequence).getTemplate();
      weaveTemplateDeclaration(template, outputContextNode,
        GeneratorUtil.createTemplateContext(context.getInput(), null, environment.getReductionContext(), ruleConsequence, context.getInput(), environment.getGenerator()), environment);
      return true;

    } else if (ruleConsequence instanceof WeaveEach_RuleConsequence) {
      WeaveEach_RuleConsequence weaveEach = (WeaveEach_RuleConsequence) ruleConsequence;
      SourceSubstituteMacro_SourceNodesQuery query = weaveEach.getSourceNodesQuery();
      if (query == null) {
        environment.getGenerator().showErrorMessage(context.getInput(), ruleNode, "weaving rule: cannot create list of source nodes");
        return false;
      }
      TemplateDeclaration template = weaveEach.getTemplate();
      Collection<SNode> queryNodes = environment.getReductionContext().getQueryExecutor().evaluateSourceNodesQuery(context.getInput(), ruleNode, null, query, context);
      if (queryNodes.isEmpty()) {
        return false;
      }
      for (SNode queryNode : queryNodes) {
        weaveTemplateDeclaration(template, outputContextNode,
          GeneratorUtil.createTemplateContext(queryNode, null, environment.getReductionContext(), ruleConsequence, queryNode, environment.getGenerator()), environment);
      }

      return true;
    } else {
      environment.getGenerator().showErrorMessage(context.getInput(), null, ruleConsequence.getNode(), "weaving rule: unsupported rule consequence");
      return false;
    }
  }

  private void weaveTemplateDeclaration(TemplateDeclaration template,
                                        SNode outputContextNode, @NotNull TemplateContext context, @NotNull TemplateExecutionEnvironment environment)
    throws GenerationFailureException, GenerationCanceledException {

    environment.getTracer().pushInputNode(context.getInput());
    try {
      weaveTemplateDeclaration_intern(template, outputContextNode, context, environment);
    } finally {
      environment.getTracer().closeInputNode(context.getInput());
    }
  }

  private void weaveTemplateDeclaration_intern(TemplateDeclaration template, SNode outputContextNode, @NotNull TemplateContext context, @NotNull TemplateExecutionEnvironment environment)
    throws GenerationFailureException, GenerationCanceledException {

    if (template == null) {
      environment.getGenerator().showErrorMessage(context.getInput(), null, ruleNode, "couldn't evaluate weaving rule: no template");
      return;
    }

    List<TemplateFragment> templateFragments = GeneratorUtil.getTemplateFragments(template);
    if (templateFragments.isEmpty()) {
      environment.getGenerator().showErrorMessage(context.getInput(), template.getNode(), ruleNode, "nothing to weave: no template fragments found in template");
      return;
    }

    // check fragments: all fragments with <default context> should have the same parent
    checkTemplateFragmentsForWeaving(template, templateFragments, environment);

    String ruleMappingName = RuleUtil.getBaseRuleLabel(ruleNode);

    // for each template fragment create output nodes
    TemplateProcessor templateProcessor = new TemplateProcessor(environment.getGenerator(), environment.getReductionContext());
    for (TemplateFragment templateFragment : templateFragments) {
      SNode templateFragmentNode = BaseAdapter.fromAdapter(templateFragment.getParent());
      SNode contextParentNode = null;
      try {
        contextParentNode = environment.getReductionContext().getQueryExecutor().getContextNodeForTemplateFragment(templateFragmentNode, outputContextNode, context);
      } catch (Exception e) {
        environment.getGenerator().getLogger().handleException(e);
      }
      if (contextParentNode != null) {
        try {
          List<SNode> outputNodesToWeave = templateProcessor.processTemplateNode(
            GeneratorUtil.getMappingName(templateFragment, ruleMappingName),
            templateFragmentNode, context);
          String childRole = templateFragmentNode.getRole_();
          for (SNode outputNodeToWeave : outputNodesToWeave) {
            environment.weaveNode(contextParentNode, childRole, outputNodeToWeave, new SNodePointer(templateFragment), context.getInput());
          }
        } catch (DismissTopMappingRuleException e) {
          environment.getGenerator().showErrorMessage(context.getInput(), templateFragment.getNode(), ruleNode, "wrong template: dismission of weaving rule is not supported");
        } catch (TemplateProcessingFailureException e) {
          // FIXME
          environment.getGenerator().showErrorMessage(context.getInput(), templateFragment.getNode(), ruleNode, "error processing template fragment");
          environment.getGenerator().getLogger().info(contextParentNode, " -- was output context node:");
        }
      } else {
        environment.getGenerator().showErrorMessage(context.getInput(), templateFragment.getNode(), ruleNode, "couldn't define 'context' for template fragment");
      }
    }
  }

  private void checkTemplateFragmentsForWeaving(TemplateDeclaration template, List<TemplateFragment> templateFragments, TemplateExecutionEnvironment environment) {

    // all fragments with <default context> should have the same parent
    boolean sameParent = true;
    SNode defaultContext = null;
    for (TemplateFragment templateFragment : templateFragments) {
      if (templateFragment.getContextNodeQuery() == null) { // uses <default context>
        SNode fragmentContextNode = BaseAdapter.fromAdapter(templateFragment.getParent().getParent());
        if (defaultContext == null) {
          defaultContext = fragmentContextNode;
        } else if (defaultContext != fragmentContextNode) {
          sameParent = false;
          break;
        }
      }
    }
    if (!sameParent) {
      List<ProblemDescription> list = new ArrayList<ProblemDescription>();
      for (TemplateFragment templateFragment : templateFragments) {
        if (templateFragment.getContextNodeQuery() == null) { // uses <default context>
          list.add(GeneratorUtil.describe(templateFragment.getNode(), "template fragment"));
        }
      }
      environment.getGenerator().getLogger().error(template.getNode(), "all fragments with <default context> should have the same parent",
        list.toArray(new ProblemDescription[list.size()]));
    }
  }
}
