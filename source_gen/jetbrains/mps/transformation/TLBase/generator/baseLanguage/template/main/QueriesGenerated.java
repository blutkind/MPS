package jetbrains.mps.transformation.TLBase.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.generator.template.ITemplateGenerator;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.transformation.TLBase.generator.baseLanguage.template.TemplateFunctionMethodName;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptPropertyOperations;
import jetbrains.mps.generator.template.INodeBuilder;
import jetbrains.mps.transformation.TLBase.generator.baseLanguage.template.QueriesUtil;
import jetbrains.mps.baseLanguage.ext.collections.internal.ICursor;
import jetbrains.mps.baseLanguage.ext.collections.internal.CursorFactory;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration;
import jetbrains.mps.transformation.TemplateLanguageTypesUtil;
import jetbrains.mps.transformation.TLBase.structure.ReferenceMacro_GetReferent;
import jetbrains.mps.transformation.TLBase.helgins.Util_TLBase_types;

public class QueriesGenerated {

  public static String propertyMacro_GetPropertyValue_1167762379110(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return TemplateFunctionMethodName.createRootRule_Condition(node);
  }
  public static String propertyMacro_GetPropertyValue_1167765482559(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return TemplateFunctionMethodName.baseMappingRule_Condition(node);
  }
  public static String propertyMacro_GetPropertyValue_1167764877550(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return TemplateFunctionMethodName.propertyMacro_GetPropertyValue(node);
  }
  public static String propertyMacro_GetPropertyValue_1167770891051(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return TemplateFunctionMethodName.referenceMacro_GetReferent(node);
  }
  public static String propertyMacro_GetPropertyValue_1167946761277(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return TemplateFunctionMethodName.ifMacro_Condition(node);
  }
  public static String propertyMacro_GetPropertyValue_1167952935373(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return TemplateFunctionMethodName.sourceSubstituteMacro_SourceNodesQuery(node);
  }
  public static String propertyMacro_GetPropertyValue_1168025033018(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return TemplateFunctionMethodName.sourceSubstituteMacro_SourceNodeQuery(node);
  }
  public static String propertyMacro_GetPropertyValue_1170727064429(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return TemplateFunctionMethodName.mapSrcMacro_MapperFunction(node);
  }
  public static SNode referenceMacro_GetReferent_1167774837569(SNode node, SNode templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    String alias = SConceptPropertyOperations.getString(node, "alias");
    if(alias == null) {
      generator.showErrorMessage(node, templateNode, "concept function parm has no <alias> - can't map it to method parameter");
      return null;
    }
    INodeBuilder builder = QueriesUtil.findParent_BaseMethodDeclaration_Builder(generator.getCurrentBuilder());
    if(builder != null) {
      SNode methodDeclaration = builder.getTargetNode();
      {
        ICursor<SNode> _zCursor = CursorFactory.createCursor(SLinkOperations.getTargets(methodDeclaration, "parameter", true));
        try {
          while(_zCursor.moveToNext()) {
            SNode parm = _zCursor.getCurrent();
            if(alias.equals(SPropertyOperations.getString(parm, "name"))) {
              return parm;
            }
          }
        } finally {
          _zCursor.release();
        }
      }
    }
    generator.showErrorMessage(node, templateNode, "couldn't find method parameter for concept function parm '" + alias + "'");
    return null;
  }
  public static SNode referenceMacro_GetReferent_1167771845166(SNode node, SNode templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SNodeOperations.getAncestor(node, "jetbrains.mps.transformation.TLBase.structure.BaseMappingRule", false, false), "applicableConcept", false);
  }
  public static SNode referenceMacro_GetReferent_1170795079215(SNode node, SNode templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    AbstractConceptDeclaration concept = TemplateLanguageTypesUtil.get_sourceNode_concept(((ReferenceMacro_GetReferent)SNodeOperations.getAdapter(node)), generator.getTypeChecker());
    if(concept != null) {
      return concept.getNode();
    }
    return templateValue;
  }
  public static SNode sourceNodeQuery_1168025917226(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "body", true);
  }
  public static SNode sourceNodeQuery_1168025905128(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "body", true);
  }
  public static SNode sourceNodeQuery_1168025932423(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "body", true);
  }
  public static SNode sourceNodeQuery_1168025938897(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "body", true);
  }
  public static SNode sourceNodeQuery_1168025925887(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "body", true);
  }
  public static SNode sourceNodeQuery_1168025947268(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "body", true);
  }
  public static SNode sourceNodeQuery_1168025330833(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "body", true);
  }
  public static SNode sourceNodeQuery_1170727064418(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "body", true);
  }
  public static SNode mapSrcMacro_mapper_1178910515264(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.copyNode(Util_TLBase_types.get_templateFunction_inputNodeType(node));
  }
  public static SNode mapSrcMacro_mapper_1178914006342(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.copyNode(Util_TLBase_types.get_templateFunction_inputNodeType(node));
  }
  public static SNode mapSrcMacro_mapper_1178913463923(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.copyNode(Util_TLBase_types.get_templateFunction_inputNodeType(node));
  }
  public static SNode mapSrcMacro_mapper_1178913788227(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.copyNode(Util_TLBase_types.get_templateFunction_inputNodeType(node));
  }
  public static SNode mapSrcMacro_mapper_1178913590671(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.copyNode(Util_TLBase_types.get_templateFunction_inputNodeType(node));
  }
}
