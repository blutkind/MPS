/*
 * Created by IntelliJ IDEA.
 * User: alshan
 * Date: Jul 9, 2004
 * Time: 7:07:36 PM
 */
package jetbrains.mps.generator.template;

import jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration;
import jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration;
import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.generator.GenerationFailedException;
import jetbrains.mps.generator.GenerationFailueInfo;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.*;
import jetbrains.mps.transformation.TLBase.generator.baseLanguage.template.TemplateFunctionMethodName;
import jetbrains.mps.transformation.TLBase.structure.*;
import jetbrains.mps.transformation.TemplateLanguageUtil;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.util.QueryMethod;
import jetbrains.mps.util.QueryMethodGenerated;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class TemplateGenUtil {
  private static final Logger LOG = Logger.getLogger(TemplateGenUtil.class);

  private static boolean checkResolvedReference(SNode sourceNode, SNode targetNode, SNode templateNode, String role, SNode targetReferentNode, ITemplateGenerator generator) {
    if (!targetNode.isAcceptableReferent(role, targetReferentNode, generator.getScope())) {
      generator.showErrorMessage(sourceNode, templateNode, "unacceptable referent: " + targetReferentNode.getDebugText() + " for role \"" + role + "\" in " + targetNode.getDebugText());
      return false;
    }
    SModel referentNodeModel = targetReferentNode.getModel();
    if (referentNodeModel != targetNode.getModel()) {
      if (TemplateLanguageUtil.isTemplatesModel(referentNodeModel)) {
        // references on template nodes are not acceptable
        generator.showErrorMessage(sourceNode, templateNode, "unacceptable referent on template node: " + targetReferentNode.getDebugText() + " for role \"" + role + "\" in " + targetNode.getDebugText());
        return false;
      }
      if (referentNodeModel.getModelDescriptor().isTransient()) {
        // references on transient nodes are not acceptable
        generator.showErrorMessage(sourceNode, templateNode, "unacceptable referent on transient node: " + targetReferentNode.getDebugText() + " for role \"" + role + "\" in " + targetNode.getDebugText());
        return false;
      }
    }
    return true;
  }

  public static boolean isTemplateLanguageElement(INodeAdapter n) {
    return n instanceof NodeMacro ||
            n instanceof ReferenceMacro ||
            n instanceof PropertyMacro ||
            n instanceof TemplateFragment ||
            n instanceof RootTemplateAnnotation;
  }

  public static boolean checkConditionForIfMacro(SNode sourceNode, IfMacro ifMacro, ITemplateGenerator generator) {
    // new
    IfMacro_Condition function = ifMacro.getConditionFunction();
    long startTime = System.currentTimeMillis();
    Boolean res = false;
    if (function != null) {
      String methodName = TemplateFunctionMethodName.ifMacro_Condition(function.getNode());
      Object[] args = new Object[]{
              sourceNode,
              generator.getSourceModel(),
              generator,
              generator.getScope(),
              generator.getGeneratorSessionContext()};
      try {
        res = (Boolean) QueryMethodGenerated.invoke(methodName, args, ifMacro.getModel());
        return res;
      } catch (Exception e) {
        generator.showErrorMessage(sourceNode, null, BaseAdapter.fromAdapter(ifMacro), "couldn't evaluate if-macro condition");
        LOG.error(e);
        return false;
      } finally {
        Statistics.getStatistic(Statistics.TPL).add(ifMacro.getModel(), methodName, startTime, res);
      }
    }

    // old
    String conditionAspectId = ifMacro.getConditionAspectId();
    if (conditionAspectId != null) {
      String methodName = "semanticNodeCondition_" + conditionAspectId;
      Object[] args = new Object[]{sourceNode};
      try {
        res = (Boolean) QueryMethod.invokeWithOptionalArg(methodName, args, ifMacro.getModel(), generator.getGeneratorSessionContext());
        return res;
      } catch (Exception e) {
        generator.showErrorMessage(sourceNode, null, BaseAdapter.fromAdapter(ifMacro), "couldn't evaluate if-macro condition: " + NameUtil.shortNameFromLongName(e.getClass().getName()) + " : " + e.getMessage());
        LOG.error(e);
        return false;
      } finally {
        Statistics.getStatistic(Statistics.TPL).add(ifMacro.getModel(), methodName, startTime, res);
      }
    }

    throw new GenerationFailedException(new GenerationFailueInfo("couldn't evaluate if-macro condition", sourceNode, BaseAdapter.fromAdapter(ifMacro), null, generator.getGeneratorSessionContext()));
  }

  private static List<SNode> evaluateSourceNodesQuery(SNode sourceNode, SourceSubstituteMacro_SourceNodesQuery query, SNode queryOwner, ITemplateGenerator generator) {
    String methodName = TemplateFunctionMethodName.sourceSubstituteMacro_SourceNodesQuery(query.getNode());
    Object[] args = new Object[]{
            sourceNode,
            generator.getSourceModel(),
            generator,
            generator.getScope(),
            generator.getGeneratorSessionContext()};
    long startTime = System.currentTimeMillis();
    try {
      List<SNode> sourceNodes = (List<SNode>) QueryMethodGenerated.invoke(methodName, args, queryOwner.getModel());
      return sourceNodes;
    } catch (Exception e) {
      generator.showErrorMessage(sourceNode, queryOwner, "couldn't evaluate query");
      LOG.error(e);
      return new LinkedList<SNode>();
    } finally {
      Statistics.getStatistic(Statistics.TPL).add(query.getModel(), methodName, startTime);
    }
  }

  private static List<SNode> getSourceNodesForMacroWithSourceNodesQuery(SNode sourceNode, SourceSubstituteMacro macro, SourceSubstituteMacro_SourceNodesQuery query, ITemplateGenerator generator) {
    // new
    if (query != null) {
      List<SNode> list = evaluateSourceNodesQuery(sourceNode, query, BaseAdapter.fromAdapter(macro), generator);
      if (list != null) {
        return list;
      }
      return new LinkedList<SNode>();
    }

    // old
    String sourceQueryAspectMethodName = macro.getSourceQueryAspectMethodName();
    if (sourceQueryAspectMethodName != null) {
      String methodName = "templateSourceQuery_" + sourceQueryAspectMethodName;
      Object[] args = new Object[]{sourceNode, generator};
      long startTime = System.currentTimeMillis();
      try {
        List<SNode> sourceNodes = (List<SNode>) QueryMethod.invoke(methodName, args, macro.getModel());
        if (sourceNodes != null) {
          return sourceNodes;
        }
        return new LinkedList<SNode>();
      } catch (Exception e) {
        generator.showErrorMessage(sourceNode, null, BaseAdapter.fromAdapter(macro), "couldn't evaluate macro query: " + NameUtil.shortNameFromLongName(e.getClass().getName()) + " : " + e.getMessage());
        LOG.error(e);
        return new LinkedList<SNode>();
      } finally {
        Statistics.getStatistic(Statistics.TPL).add(macro.getModel(), methodName, startTime);
      }
    }

    throw new GenerationFailedException(new GenerationFailueInfo("couldn't evaluate macro query", sourceNode, BaseAdapter.fromAdapter(macro), null, generator.getGeneratorSessionContext()));
  }

  private static List<SNode> getSourceNodesForMacroWithSourceNodeQuery(SNode sourceNode, SourceSubstituteMacro macro, SourceSubstituteMacro_SourceNodeQuery query, boolean optionalQuery, ITemplateGenerator generator) {
    List<SNode> sourceNodes = new ArrayList<SNode>(1);

    // optional query is not defined?
    String sourceQueryAspectMethodName = null;
    if (macro instanceof CopySrcNodeMacro) {
      sourceQueryAspectMethodName = ((CopySrcNodeMacro) macro).getSourceNodeQueryId();
    } else if (macro instanceof MapSrcNodeMacro) {
      sourceQueryAspectMethodName = ((MapSrcNodeMacro) macro).getSourceNodeQueryId();
    }

    if (query == null && sourceQueryAspectMethodName == null && optionalQuery) {
      // continue with current source node
      sourceNodes.add(sourceNode);
      return sourceNodes;
    }

    // new
    if (query != null) {
      String methodName = TemplateFunctionMethodName.sourceSubstituteMacro_SourceNodeQuery(query.getNode());
      Object[] args = new Object[]{
              sourceNode,
              generator.getSourceModel(),
              generator,
              generator.getScope(),
              generator.getGeneratorSessionContext()};
      long startTime = System.currentTimeMillis();
      try {
        SNode outputSourceNode = (SNode) QueryMethodGenerated.invoke(methodName, args, macro.getModel());
        if (outputSourceNode != null) {
          sourceNodes.add(outputSourceNode);
        }
        return sourceNodes;
      } catch (Exception e) {
        generator.showErrorMessage(sourceNode, null, BaseAdapter.fromAdapter(macro), "couldn't evaluate macro query");
        LOG.error(e);
        return new LinkedList<SNode>();
      } finally {
        Statistics.getStatistic(Statistics.TPL).add(macro.getModel(), methodName, startTime);
      }
    }

    // old
    if (sourceQueryAspectMethodName != null) {
      String methodName = "templateSourceNodeQuery_" + sourceQueryAspectMethodName;
      Object[] args = new Object[]{sourceNode, generator};
      long startTime = System.currentTimeMillis();
      try {
        SNode outputSourceNode = (SNode) QueryMethod.invoke(methodName, args, macro.getModel());
        if (outputSourceNode != null) {
          sourceNodes.add(outputSourceNode);
        }
        return sourceNodes;
      } catch (Exception e) {
        generator.showErrorMessage(sourceNode, null, BaseAdapter.fromAdapter(macro), "couldn't evaluate macro query: " + NameUtil.shortNameFromLongName(e.getClass().getName()) + " : " + e.getMessage());
        LOG.error(e);
        return new LinkedList<SNode>();
      } finally {
        Statistics.getStatistic(Statistics.TPL).add(macro.getModel(), methodName, startTime);
      }
    }

    throw new GenerationFailedException(new GenerationFailueInfo("couldn't evaluate macro query", sourceNode, BaseAdapter.fromAdapter(macro), null, generator.getGeneratorSessionContext()));
  }

  private static List<SNode> getSourceNodesForSwitchMacro(SNode sourceNode, SwitchMacro macro, ITemplateGenerator generator) {
    List<SNode> sourceNodes = new ArrayList<SNode>(1);

    // in SWITCH query is optional?
    String sourceQueryAspectMethodName = macro.getSourceQueryAspectMethodName();
    SourceSubstituteMacro_SourceNodeQuery query = macro.getSourceNodeQuery();
    if (query == null && sourceQueryAspectMethodName == null) {
      // continue with current source node
      sourceNodes.add(sourceNode);
      return sourceNodes;
    }

    // new
    if (query != null) {
      String methodName = TemplateFunctionMethodName.sourceSubstituteMacro_SourceNodeQuery(query.getNode());
      Object[] args = new Object[]{
              sourceNode,
              generator.getSourceModel(),
              generator,
              generator.getScope(),
              generator.getGeneratorSessionContext()};
      long startTime = System.currentTimeMillis();
      try {
        SNode outputSourceNode = (SNode) QueryMethodGenerated.invoke(methodName, args, macro.getModel());
        if (outputSourceNode != null) {
          sourceNodes.add(outputSourceNode);
        }
        return sourceNodes;
      } catch (Exception e) {
        generator.showErrorMessage(sourceNode, null, BaseAdapter.fromAdapter(macro), "couldn't evaluate macro query");
        LOG.error(e);
        return new LinkedList<SNode>();
      } finally {
        Statistics.getStatistic(Statistics.TPL).add(macro.getModel(), methodName, startTime);
      }
    }

    // old (returns list in switch)
    String methodName = "templateSourceQuery_" + sourceQueryAspectMethodName;
    Object[] args = new Object[]{sourceNode, generator};
    long startTime = System.currentTimeMillis();
    try {
      sourceNodes = (List<SNode>) QueryMethod.invoke(methodName, args, macro.getModel());
      return sourceNodes;
    } catch (Exception e) {
      generator.showErrorMessage(sourceNode, null, BaseAdapter.fromAdapter(macro), "couldn't evaluate macro query: " + NameUtil.shortNameFromLongName(e.getClass().getName()) + " : " + e.getMessage());
      LOG.error(e);
      return new LinkedList<SNode>();
    } finally {
      Statistics.getStatistic(Statistics.TPL).add(macro.getModel(), methodName, startTime);
    }
  }

  public static boolean checkPremiseForBaseMappingRule(SNode sourceNode, ConceptDeclaration sourceNodeConcept, BaseMappingRule mappingRule, ITemplateGenerator generator) {
    AbstractConceptDeclaration applicableConcept = mappingRule.getApplicableConcept();
    if (applicableConcept != null) {
      if (mappingRule.getApplyToConceptInheritors()) {
        if (!SModelUtil_new.isAssignableConcept(sourceNodeConcept, applicableConcept)) return false;
      } else {
        if (sourceNodeConcept != applicableConcept) return false;
      }
    }
    return checkConditionForBaseMappingRule(sourceNode, mappingRule, generator);
  }

  protected static boolean checkConditionForBaseMappingRule(SNode sourceNode, BaseMappingRule mappingRule, ITemplateGenerator generator) {
    BaseMappingRule_Condition conditionFunction = mappingRule.getConditionFunction();
    if (conditionFunction == null) {
      return true;
    }

    String methodName = TemplateFunctionMethodName.baseMappingRule_Condition(conditionFunction.getNode());
    Object[] args = new Object[]{
            sourceNode,
            generator.getSourceModel(),
            generator,
            generator.getScope(),
            generator.getGeneratorSessionContext()};
    long startTime = System.currentTimeMillis();
    boolean res = false;
    try {
      res = (Boolean) QueryMethodGenerated.invoke(methodName, args, mappingRule.getModel());
      return res;
    } catch (Exception e) {
      generator.showErrorMessage(sourceNode, null, BaseAdapter.fromAdapter(mappingRule), "couldn't evaluate rule condition");
      LOG.error(e);

      return false;
    } finally {
      Statistics.getStatistic(Statistics.TPL).add(mappingRule.getModel(), methodName, startTime, res);
    }
  }

  public static List<SNode> createSourceNodeListForTemplateNode(SNode parentSourceNode, SNode templateNode, int currentMacroIndex, ITemplateGenerator generator) {
    try {
      List<NodeMacro> nodeMacros = NodeMacro_AnnotationLink.getNodeMacros((BaseConcept) templateNode.getAdapter());
      NodeMacro nodeMacro = null;
      if (nodeMacros.size() > currentMacroIndex) {
        nodeMacro = nodeMacros.get(currentMacroIndex);
      }

      if (nodeMacro instanceof CopySrcNodeMacro) {
        return getSourceNodesForMacroWithSourceNodeQuery(parentSourceNode, (SourceSubstituteMacro) nodeMacro, ((CopySrcNodeMacro) nodeMacro).getSourceNodeQuery(), false, generator);
      } else if (nodeMacro instanceof MapSrcNodeMacro) {
        return getSourceNodesForMacroWithSourceNodeQuery(parentSourceNode, (SourceSubstituteMacro) nodeMacro, ((MapSrcNodeMacro) nodeMacro).getSourceNodeQuery(), true, generator);
      } /*else if (nodeMacro instanceof IfMacro) {
        List<SNode> sourceNodes = new ArrayList<SNode>(1);
        if (checkConditionForIfMacro(parentSourceNode, (IfMacro) nodeMacro, generator)) {
          sourceNodes.add(parentSourceNode);
        }
        return sourceNodes;
      } */
      else if (nodeMacro instanceof LoopMacro) {
        return getSourceNodesForMacroWithSourceNodesQuery(parentSourceNode, (SourceSubstituteMacro) nodeMacro, ((LoopMacro) nodeMacro).getSourceNodesQuery(), generator);
      } else if (nodeMacro instanceof CopySrcListMacro) {
        return getSourceNodesForMacroWithSourceNodesQuery(parentSourceNode, (SourceSubstituteMacro) nodeMacro, ((CopySrcListMacro) nodeMacro).getSourceNodesQuery(), generator);
      } else if (nodeMacro instanceof MapSrcListMacro) {
        return getSourceNodesForMacroWithSourceNodesQuery(parentSourceNode, (SourceSubstituteMacro) nodeMacro, ((MapSrcListMacro) nodeMacro).getSourceNodesQuery(), generator);
      } else if (nodeMacro instanceof SwitchMacro) {
        return getSourceNodesForSwitchMacro(parentSourceNode, (SwitchMacro) nodeMacro, generator);
      } else if (nodeMacro instanceof IncludeMacro) {
        return getSourceNodesForMacroWithSourceNodeQuery(parentSourceNode, (SourceSubstituteMacro) nodeMacro, ((IncludeMacro) nodeMacro).getSourceNodeQuery(), true, generator);
      }

      if (nodeMacro != null) {
        String sourceQueryAspectMethodName = nodeMacro.getSourceQueryAspectMethodName();
        if (sourceQueryAspectMethodName != null) {
          String methodName = "templateSourceQuery_" + sourceQueryAspectMethodName;
          Object[] args = new Object[]{parentSourceNode, generator};
          List<SNode> sourceNodes = (List<SNode>) QueryMethod.invoke(methodName, args, nodeMacro.getModel());
          return sourceNodes;
        }
      }

      // <default> : propagate  parent source node
      List<SNode> list = new ArrayList<SNode>(1);
      list.add(parentSourceNode);
      return list;

    } catch (GenerationFailedException gfe) {
      throw gfe;
    } catch (Throwable t) {
      throw new GenerationFailedException(new GenerationFailueInfo(t.toString(), parentSourceNode, templateNode, null, generator.getGeneratorSessionContext()), t);
    }
  }

  public static void executeMappingScript(MappingScript mappingScript, SModel model, ITemplateGenerator generator) {
    MappingScript_CodeBlock codeBlock = mappingScript.getCodeBlock();
    if (codeBlock == null) {
      generator.showWarningMessage(mappingScript.getNode(), "couldn't run script '" + mappingScript.getName() + "' : no code-block");
      return;
    }

    String methodName = TemplateFunctionMethodName.mappingScript_CodeBlock(codeBlock.getNode());
    Object[] args = new Object[]{
            model,
            generator};
    long startTime = System.currentTimeMillis();
    try {
      QueryMethodGenerated.invoke(methodName, args, mappingScript.getModel());
    } catch (GenerationFailedException gfe) {
      generator.showErrorMessage(codeBlock.getNode(), "error executing script '" + mappingScript.getName() + "'");
      throw gfe;
    } catch (IllegalModelChangeError imce) {
      generator.showErrorMessage(codeBlock.getNode(), "error executing script '" + mappingScript.getName() + "'");
      throw imce;
    } catch (Throwable t) {
      generator.showErrorMessage(codeBlock.getNode(), "error executing script '" + mappingScript.getName() + "'");
      GenerationFailueInfo failueInfo = new GenerationFailueInfo("?", null, null, mappingScript.getNode(), generator.getGeneratorSessionContext());
      throw new GenerationFailedException(failueInfo, t);
    }

    finally {
      Statistics.getStatistic(Statistics.TPL).add(mappingScript.getModel(), methodName, startTime);
    }
  }
}