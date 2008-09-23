<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:1222075024888(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_reduceExpressionToStatement@generator)">
  <persistence version="3" />
  <refactoringHistory />
  <language namespace="jetbrains.mps.transformation.TLBase" />
  <language namespace="jetbrains.mps.baseLanguage" />
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage" />
  <language namespace="jetbrains.mps.core" />
  <languageAspect modelUID="r:1222075024098(jetbrains.mps.transformation.TLBase.constraints)" version="16" />
  <languageAspect modelUID="r:1222075024104(jetbrains.mps.transformation.TLBase.structure)" version="1" />
  <languageAspect modelUID="r:1222075024065(jetbrains.mps.baseLanguage.constraints)" version="83" />
  <languageAspect modelUID="r:1222075024074(jetbrains.mps.baseLanguage.structure)" version="0" />
  <languageAspect modelUID="r:1222075024123(jetbrains.mps.bootstrap.smodelLanguage.constraints)" version="21" />
  <languageAspect modelUID="r:1222075024129(jetbrains.mps.bootstrap.smodelLanguage.structure)" version="1" />
  <languageAspect modelUID="r:1222075024003(jetbrains.mps.core.constraints)" version="2" />
  <languageAspect modelUID="r:1222075024184(jetbrains.mps.closures.structure)" version="0" />
  <languageAspect modelUID="r:1222075024012(jetbrains.mps.bootstrap.structureLanguage.constraints)" version="11" />
  <languageAspect modelUID="r:1222075024058(jetbrains.mps.bootstrap.sharedConcepts.constraints)" version="0" />
  <languageAspect modelUID="r:1222075024180(jetbrains.mps.closures.constraints)" version="2" />
  <languageAspect modelUID="r:1222075024091(jetbrains.mps.baseLanguage.blTypes.constraints)" version="0" />
  <maxImportIndex value="1" />
  <import index="1" modelUID="r:1222075024884(jetbrains.mps.transformation.test.inputLang.structure)" version="-1" />
  <node type="jetbrains.mps.transformation.TLBase.structure.MappingConfiguration" id="1209150022679">
    <property name="name" value="main" />
    <node role="reductionMappingRule" type="jetbrains.mps.transformation.TLBase.structure.Reduction_MappingRule" id="1209150610748">
      <link role="applicableConcept" targetNodeId="1.1209146548167" resolveInfo="ExpressionToReduceToStatement" />
      <node role="ruleConsequence" type="jetbrains.mps.transformation.TLBase.structure.InlineTemplate_RuleConsequence" id="1209150677803">
        <node role="templateNode" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1209150725887">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1209150737045">
            <property name="value" value="my expression" />
          </node>
        </node>
      </node>
      <node role="conditionFunction" type="jetbrains.mps.transformation.TLBase.structure.BaseMappingRule_Condition" id="1209150617830">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1209150617831">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1209150621175">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209150660963">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209150652241">
                <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1209150646676">
                  <link role="concept" targetNodeId="1.1209149421970" resolveInfo="InputRootWithStatementList" />
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209150622209">
                    <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1209150621176" />
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetContainingRootOperation" id="1209150627063" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1209150659587">
                  <link role="property" targetNodeId="1.1209149495553" resolveInfo="useInTest" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_HasValue_Enum" id="1209150665145">
                <node role="value" type="jetbrains.mps.bootstrap.smodelLanguage.structure.EnumMemberReference" id="1209150665146">
                  <link role="enumMember" targetNodeId="1.1209146734796" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="rootMappingRule" type="jetbrains.mps.transformation.TLBase.structure.Root_MappingRule" id="1209150078117">
      <link role="applicableConcept" targetNodeId="1.1209149421970" resolveInfo="InputRootWithStatementList" />
      <link role="template" targetNodeId="1209150125542" resolveInfo="out_class" />
      <node role="conditionFunction" type="jetbrains.mps.transformation.TLBase.structure.BaseMappingRule_Condition" id="1209150502311">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1209150502312">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1209150505329">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209150513007">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209150506362">
                <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1209150505330" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1209150511740">
                  <link role="property" targetNodeId="1.1209149495553" resolveInfo="useInTest" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_HasValue_Enum" id="1209150515860">
                <node role="value" type="jetbrains.mps.bootstrap.smodelLanguage.structure.EnumMemberReference" id="1209150515861">
                  <link role="enumMember" targetNodeId="1.1209146734796" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1209150125542">
    <property name="name" value="out_class" />
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1209150155196">
      <property name="name" value="method" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1209150155197" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1209150155198" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1209150155199">
        <node role="nodeMacro$attribute" type="jetbrains.mps.transformation.TLBase.structure.CopySrcNodeMacro" id="1209150187920">
          <node role="sourceNodeQuery" type="jetbrains.mps.transformation.TLBase.structure.SourceSubstituteMacro_SourceNodeQuery" id="1209150187921">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1209150187922">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1209150220871">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209150221967">
                  <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1209150220872" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1209150368813">
                    <link role="link" targetNodeId="1.1209149449081" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1209150125543" />
    <node role="rootTemplateAnnotation$attribute" type="jetbrains.mps.transformation.TLBase.structure.RootTemplateAnnotation" id="1209150125544">
      <link role="applicableConcept" targetNodeId="1.1209149421970" resolveInfo="InputRootWithStatementList" />
    </node>
  </node>
</model>

