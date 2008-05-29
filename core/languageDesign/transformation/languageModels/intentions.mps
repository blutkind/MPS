<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.transformation.TLBase.intentions">
  <persistence version="1" />
  <refactoringHistory />
  <language namespace="jetbrains.mps.baseLanguage">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.structure" version="0" />
  </language>
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage">
    <languageAspect modelUID="jetbrains.mps.bootstrap.smodelLanguage.structure" version="0" />
  </language>
  <language namespace="jetbrains.mps.bootstrap.intentionsLanguage" />
  <language namespace="jetbrains.mps.bootstrap.editorLanguage" />
  <language namespace="jetbrains.mps.bootstrap.sharedConcepts" />
  <language namespace="jetbrains.mps.baseLanguage.ext.collections.lang">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.structure" version="1" />
  </language>
  <languageAspect modelUID="jetbrains.mps.bootstrap.constraintsLanguage.structure" version="1" />
  <languageAspect modelUID="jetbrains.mps.transformation.TLBase.structure" version="1" />
  <languageAspect modelUID="jetbrains.mps.closures.structure" version="0" />
  <languageAspect modelUID="jetbrains.mps.closures.structure" version="0" />
  <languageAspect modelUID="jetbrains.mps.closures.structure" version="0" />
  <maxImportIndex value="16" />
  <import index="1" modelUID="jetbrains.mps.transformation.TLBase.structure" version="1" />
  <import index="2" modelUID="jetbrains.mps.core.structure" version="-1" />
  <import index="3" modelUID="jetbrains.mps.bootstrap.structureLanguage.structure" version="-1" />
  <import index="4" modelUID="jetbrains.mps.transformation@java_stub" version="-1" />
  <import index="5" modelUID="jetbrains.mps.nodeEditor@java_stub" version="-1" />
  <import index="6" modelUID="jetbrains.mps.smodel@java_stub" version="-1" />
  <import index="7" modelUID="java.util@java_stub" version="-1" />
  <import index="8" modelUID="jetbrains.mps.baseLanguage.structure" version="0" />
  <import index="9" modelUID="jetbrains.mps.bootstrap.structureLanguage.structure@java_stub" version="-1" />
  <import index="10" modelUID="jetbrains.mps.plugin@java_stub" version="-1" />
  <import index="11" modelUID="jetbrains.mps.generator.template@java_stub" version="-1" />
  <import index="12" modelUID="java.lang@java_stub" version="-1" />
  <import index="13" modelUID="java.io@java_stub" version="-1" />
  <import index="14" modelUID="jetbrains.mps.transformation.TLBase.structure@java_stub" version="-1" />
  <import index="15" modelUID="javax.swing@java_stub" version="-1" />
  <import index="16" modelUID="jetbrains.mps.transformation.TLBase.editor" version="-1" />
  <node type="jetbrains.mps.bootstrap.intentionsLanguage.structure.IntentionDeclaration" id="1195665973055">
    <property name="name" value="CreateTemplateDeclarationFromUsage" />
    <property name="isErrorIntention" value="false" />
    <link role="forConcept" targetNodeId="1.1168559098955" resolveInfo="RuleConsequence" />
    <node role="descriptionFunction" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.DescriptionBlock" id="1195665973125">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1195665973126">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1195665973127">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1195665973128">
            <property name="value" value="Create template declaration from usage" />
          </node>
        </node>
      </node>
    </node>
    <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.IsApplicableBlock" id="1195665973144">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1195665973145">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1195665973146">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1195665973147">
            <link role="baseMethodDeclaration" targetNodeId="5.~CreateFromUsageUtil.isApplicable(jetbrains.mps.nodeEditor.EditorContext):boolean" resolveInfo="isApplicable" />
            <link role="classConcept" targetNodeId="5.~CreateFromUsageUtil" resolveInfo="CreateFromUsageUtil" />
            <node role="actualArgument" type="jetbrains.mps.bootstrap.sharedConcepts.structure.ConceptFunctionParameter_editorContext" id="1195666126675" />
          </node>
        </node>
      </node>
    </node>
    <node role="executeFunction" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ExecuteBlock" id="1195665973181">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1195665973182">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1195665973183">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1195665973184">
            <property name="name" value="template" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1195665973185">
              <link role="concept" targetNodeId="1.1092059087312" resolveInfo="TemplateDeclaration" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227919250">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227911893">
                <node role="operand" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1195665973188" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetModelOperation" id="1195665973189" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Model_CreateNewRootNodeOperation" id="1195665973190">
                <link role="concept" targetNodeId="1.1092059087312" resolveInfo="TemplateDeclaration" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1195665973191">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227880406">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227931215">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1195665973194">
                <link role="variableDeclaration" targetNodeId="1195665973184" resolveInfo="template" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1195665973195">
                <link role="property" targetNodeId="2.1169194664001" resolveInfo="name" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_SetOperation" id="1195665973196">
              <node role="value" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1195665973197">
                <link role="baseMethodDeclaration" targetNodeId="5.~CreateFromUsageUtil.getText(jetbrains.mps.nodeEditor.EditorContext):java.lang.String" resolveInfo="getText" />
                <link role="classConcept" targetNodeId="5.~CreateFromUsageUtil" resolveInfo="CreateFromUsageUtil" />
                <node role="actualArgument" type="jetbrains.mps.bootstrap.sharedConcepts.structure.ConceptFunctionParameter_editorContext" id="1195666101742" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1195665973199">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1195665973200">
            <property name="name" value="applicableConcept" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptType" id="1195665973201" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227884596">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227846132">
                <node role="operand" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1195665973204" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1195665973205">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1195665973206">
                    <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1207675648299">
                      <link role="conceptDeclaration" targetNodeId="1.1167327847730" resolveInfo="Reduction_MappingRule" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1195665973207">
                <link role="link" targetNodeId="1.1167169349424" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1195665973208">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227866981">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227939505">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1195665973211">
                <link role="variableDeclaration" targetNodeId="1195665973184" resolveInfo="template" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1195665973212">
                <link role="link" targetNodeId="1.1168285871518" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetTargetOperation" id="1195665973213">
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1195665973214">
                <link role="variableDeclaration" targetNodeId="1195665973200" resolveInfo="applicableConcept" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1195665973215">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1195665973216">
            <property name="name" value="reference" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1195665973217">
              <link role="concept" targetNodeId="1.1168559333462" resolveInfo="TemplateDeclarationReference" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227933727">
              <node role="operand" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1195665973219" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ReplaceWithNewOperation" id="1195665973220">
                <link role="concept" targetNodeId="1.1168559333462" resolveInfo="TemplateDeclarationReference" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1195665973221">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227888828">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227934158">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1195665973224">
                <link role="variableDeclaration" targetNodeId="1195665973216" resolveInfo="reference" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1195665973225">
                <link role="link" targetNodeId="1.1168559393589" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetTargetOperation" id="1195665973226">
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1195665973227">
                <link role="variableDeclaration" targetNodeId="1195665973184" resolveInfo="template" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.intentionsLanguage.structure.IntentionDeclaration" id="1203775431223">
    <property name="name" value="ConvertInlineTemplateToTemplateFragment" />
    <link role="forConcept" targetNodeId="1.1177093525992" resolveInfo="InlineTemplate_RuleConsequence" />
    <node role="descriptionFunction" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.DescriptionBlock" id="1203775431224">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1203775431225">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1203775470228">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1203775470229">
            <property name="value" value="Convert inline template to template fragment" />
          </node>
        </node>
      </node>
    </node>
    <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.IsApplicableBlock" id="1203775431226">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1203775431227">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1203776371855">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1203776371856">
            <property name="name" value="ruleNode" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1203776371857">
              <link role="concept" targetNodeId="1.1167169308231" resolveInfo="BaseMappingRule" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227914432">
              <node role="operand" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1203776371861" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1203776371859">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1203776371860">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1207675648292">
                    <link role="conceptDeclaration" targetNodeId="1.1167169308231" resolveInfo="BaseMappingRule" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1203776375910">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1203776375911">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1203776444320">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1203776447775">
                <property name="value" value="false" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1203776395279">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.OrExpression" id="1203776412146">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.OrExpression" id="1203776433827">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203776434565">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203776434566">
                    <link role="variableDeclaration" targetNodeId="1203776371856" resolveInfo="ruleNode" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1203776434567">
                    <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1203776439663">
                      <link role="conceptDeclaration" targetNodeId="1.1167327847730" resolveInfo="Reduction_MappingRule" />
                    </node>
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203776418994">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203776417883">
                    <link role="variableDeclaration" targetNodeId="1203776371856" resolveInfo="ruleNode" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1203776420527">
                    <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1203776426935">
                      <link role="conceptDeclaration" targetNodeId="1.1167171569011" resolveInfo="Weaving_MappingRule" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203776396359">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203776396360">
                  <link role="variableDeclaration" targetNodeId="1203776371856" resolveInfo="ruleNode" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1203776396361">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1203776407989">
                    <link role="conceptDeclaration" targetNodeId="1.1167514355419" resolveInfo="Root_MappingRule" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1203776450387">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1203776451654">
            <property name="value" value="true" />
          </node>
        </node>
      </node>
    </node>
    <node role="executeFunction" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ExecuteBlock" id="1203775431228">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1203775431229">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1203775487326">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1203775487327">
            <property name="name" value="templateNode" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1203775487328">
              <link role="concept" targetNodeId="1.1092059087312" resolveInfo="TemplateDeclaration" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227955915">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227911840">
                <node role="operand" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1203775487333" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetModelOperation" id="1203775487332" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Model_CreateNewRootNodeOperation" id="1203775487330">
                <link role="concept" targetNodeId="1.1092059087312" resolveInfo="TemplateDeclaration" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1203776055299">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1203776055300">
            <property name="name" value="ruleNode" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1203776055301">
              <link role="concept" targetNodeId="1.1167169308231" resolveInfo="BaseMappingRule" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227902700">
              <node role="operand" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1203776071743" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1203776071741">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1203776071742">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1207675648315">
                    <link role="conceptDeclaration" targetNodeId="1.1167169308231" resolveInfo="BaseMappingRule" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1203775487334">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227942610">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227926055">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203775487345">
                <link role="variableDeclaration" targetNodeId="1203775487327" resolveInfo="templateNode" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1203775487344">
                <link role="link" targetNodeId="1.1168285871518" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetTargetOperation" id="1203775487336">
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227945046">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203776079744">
                  <link role="variableDeclaration" targetNodeId="1203776055300" resolveInfo="ruleNode" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1203775487338">
                  <link role="link" targetNodeId="1.1167169349424" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1203775780052">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203775803328">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203775781663">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203775780053">
                <link role="variableDeclaration" targetNodeId="1203775487327" resolveInfo="templateNode" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1203775783759">
                <link role="property" targetNodeId="2.1169194664001" resolveInfo="name" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_SetOperation" id="1203775805268">
              <node role="value" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1203775807567">
                <property name="value" value="template1" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1203775686764">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203775811755">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203775688188">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203775686765">
                <link role="variableDeclaration" targetNodeId="1203775487327" resolveInfo="templateNode" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1203775776581">
                <link role="link" targetNodeId="1.1092060348987" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetTargetOperation" id="1203775825508">
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203775841527">
                <node role="operand" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1203775828698" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1203775844794">
                  <link role="link" targetNodeId="1.1177093586806" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1203776481016">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1203776481017">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1203776501309">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203776528114">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203776509720">
                  <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1203776502467">
                    <link role="concept" targetNodeId="1.1167514355419" resolveInfo="Root_MappingRule" />
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203776501310">
                      <link role="variableDeclaration" targetNodeId="1203776055300" resolveInfo="ruleNode" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1203776526144">
                    <link role="link" targetNodeId="1.1167514355421" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetTargetOperation" id="1203776531569">
                  <node role="parameter" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203776543946">
                    <link role="variableDeclaration" targetNodeId="1203775487327" resolveInfo="templateNode" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203776484881">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203776483708">
              <link role="variableDeclaration" targetNodeId="1203776055300" resolveInfo="ruleNode" />
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1203776490306">
              <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1203776496542">
                <link role="conceptDeclaration" targetNodeId="1.1167514355419" resolveInfo="Root_MappingRule" />
              </node>
            </node>
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1203776558750">
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1203776558751">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1203776825305">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1203776825306">
                  <property name="name" value="templateRefNode" />
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1203776825307">
                    <link role="concept" targetNodeId="1.1168559333462" resolveInfo="TemplateDeclarationReference" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203776840700">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203776840701">
                      <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1203776840702">
                        <link role="concept" targetNodeId="1.1167171569011" resolveInfo="Weaving_MappingRule" />
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203776840703">
                          <link role="variableDeclaration" targetNodeId="1203776055300" resolveInfo="ruleNode" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1203776840704">
                        <link role="link" targetNodeId="1.1169570368028" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetNewChildOperation" id="1203776840705">
                      <link role="concept" targetNodeId="1.1168559333462" resolveInfo="TemplateDeclarationReference" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1203776847754">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203776871400">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203776849053">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203776847755">
                      <link role="variableDeclaration" targetNodeId="1203776825306" resolveInfo="templateRefNoded" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1203776869868">
                      <link role="link" targetNodeId="1.1168559393589" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetTargetOperation" id="1203776873246">
                    <node role="parameter" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203776877123">
                      <link role="variableDeclaration" targetNodeId="1203775487327" resolveInfo="templateNode" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1203777005542">
                <property name="value" value="context function creation" />
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1203776965491">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1203776965492">
                  <property name="name" value="contextFunction" />
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1203776965493">
                    <link role="concept" targetNodeId="1.1184616041890" resolveInfo="Weaving_MappingRule_ContextNodeQuery" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203776987604">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203776987605">
                      <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1203776987606">
                        <link role="concept" targetNodeId="1.1167171569011" resolveInfo="Weaving_MappingRule" />
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203776987607">
                          <link role="variableDeclaration" targetNodeId="1203776055300" resolveInfo="ruleNode" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1203776987608">
                        <link role="link" targetNodeId="1.1184616230853" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetNewChildOperation" id="1203776987609" />
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1203776992846">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203776999851">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203776993973">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203776992847">
                      <link role="variableDeclaration" targetNodeId="1203776965492" resolveInfo="contextFunction" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1203776998615">
                      <link role="link" targetNodeId="8.1137022507850" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetNewChildOperation" id="1203777002509" />
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1203777147659">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1203777147660">
                  <property name="name" value="exprStmt" />
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1203777147661">
                    <link role="concept" targetNodeId="8.1068580123155" resolveInfo="ExpressionStatement" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203777159804">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203777159805">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203777159806">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203777159807">
                          <link role="variableDeclaration" targetNodeId="1203776965492" resolveInfo="contextFunction" />
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1203777159808">
                          <link role="link" targetNodeId="8.1137022507850" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1203777159809">
                        <link role="link" targetNodeId="8.1068581517665" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_AddNewChildOperation" id="1203777159810">
                      <link role="concept" targetNodeId="8.1068580123155" resolveInfo="ExpressionStatement" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1203777163623">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203777268309">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203777165219">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203777163624">
                      <link role="variableDeclaration" targetNodeId="1203777147660" resolveInfo="exprStmt" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1203777176221">
                      <link role="link" targetNodeId="8.1068580123156" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetNewChildOperation" id="1203777270030">
                    <link role="concept" targetNodeId="1.1167169188348" resolveInfo="TemplateFunctionParameter_sourceNode" />
                  </node>
                </node>
              </node>
            </node>
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203776563537">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203776562067">
                <link role="variableDeclaration" targetNodeId="1203776055300" resolveInfo="ruleNode" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1203776566898">
                <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1203776571744">
                  <link role="conceptDeclaration" targetNodeId="1.1167171569011" resolveInfo="Weaving_MappingRule" />
                </node>
              </node>
            </node>
            <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1203776745135">
              <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1203776745136">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1203776882938">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1203776882939">
                    <property name="name" value="templateRefNode" />
                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1203776882940">
                      <link role="concept" targetNodeId="1.1168559333462" resolveInfo="TemplateDeclarationReference" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203776882941">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203776882942">
                        <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1203776882943">
                          <link role="concept" targetNodeId="1.1167327847730" resolveInfo="Reduction_MappingRule" />
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203776882944">
                            <link role="variableDeclaration" targetNodeId="1203776055300" resolveInfo="ruleNode" />
                          </node>
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1203776903470">
                          <link role="link" targetNodeId="1.1169672767469" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetNewChildOperation" id="1203776882946">
                        <link role="concept" targetNodeId="1.1168559333462" resolveInfo="TemplateDeclarationReference" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1203776882947">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203776882948">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203776882949">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203776914440">
                        <link role="variableDeclaration" targetNodeId="1203776882939" resolveInfo="templateRefNode" />
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1203776918847">
                        <link role="link" targetNodeId="1.1168559393589" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetTargetOperation" id="1203776882952">
                      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203776882953">
                        <link role="variableDeclaration" targetNodeId="1203775487327" resolveInfo="templateNode" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1203776131734">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203776132736">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203776131735">
              <link role="variableDeclaration" targetNodeId="1203775487327" resolveInfo="templateNode" />
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.editorLanguage.structure.SelectLaterOperation" id="1203776134097">
              <node role="editorContext" type="jetbrains.mps.bootstrap.sharedConcepts.structure.ConceptFunctionParameter_editorContext" id="1203776151537" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.intentionsLanguage.structure.IntentionDeclaration" id="1205436780371">
    <property name="name" value="ConvertTemplateDeclRefToInlineTemplate" />
    <link role="forConcept" targetNodeId="1.1168559333462" resolveInfo="TemplateDeclarationReference" />
    <node role="descriptionFunction" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.DescriptionBlock" id="1205436780372">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205436780373">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1205436827532">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1205436827533">
            <property name="value" value="Convert to in-line template" />
          </node>
        </node>
      </node>
    </node>
    <node role="executeFunction" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ExecuteBlock" id="1205436780374">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205436780375">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205437054638">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205437054639">
            <property name="name" value="TFs" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1205437054640" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205437054641">
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetDescendantsOperation" id="1205437054642">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Inclusion" id="1205437054643" />
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1205437054644">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1207675648296">
                    <link role="conceptDeclaration" targetNodeId="1.1095672379244" resolveInfo="TemplateFragment" />
                  </node>
                </node>
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205437054645">
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1205437054646">
                  <link role="link" targetNodeId="1.1092060348987" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205437054647">
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1205437054648">
                    <link role="link" targetNodeId="1.1168559393589" />
                  </node>
                  <node role="operand" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1205437054649" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1205437065526">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205437065527">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1205437192440">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205437250751">
                <link role="baseMethodDeclaration" targetNodeId="15.~JOptionPane.showMessageDialog(java.awt.Component,java.lang.Object):void" resolveInfo="showMessageDialog" />
                <link role="classConcept" targetNodeId="15.~JOptionPane" resolveInfo="JOptionPane" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1205437252736" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1205437266082">
                  <property name="value" value="No fragments found" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1205437293412" />
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1205437093417">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205437096937">
              <property name="value" value="0" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205437070109">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205437068546">
                <link role="variableDeclaration" targetNodeId="1205437054639" resolveInfo="TFs" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetSizeOperation" id="1205437073908" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1205437296804">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205437296805">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1205437296806">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205437296807">
                <link role="baseMethodDeclaration" targetNodeId="15.~JOptionPane.showMessageDialog(java.awt.Component,java.lang.Object):void" resolveInfo="showMessageDialog" />
                <link role="classConcept" targetNodeId="15.~JOptionPane" resolveInfo="JOptionPane" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1205437296808" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1205437296809">
                  <property name="value" value="Too many fragments" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1205437296810" />
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.GreaterThanExpression" id="1205437310871">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205437310872">
              <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetSizeOperation" id="1205437310873" />
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205437310874">
                <link role="variableDeclaration" targetNodeId="1205437054639" resolveInfo="TFs" />
              </node>
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205437310875">
              <property name="value" value="1" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1205437349253">
          <property name="value" value="------" />
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205437393789">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205437393790">
            <property name="name" value="oldTemplate" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1205437393791">
              <link role="concept" targetNodeId="1.1092059087312" resolveInfo="TemplateDeclaration" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205437393792">
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1205437393793">
                <link role="link" targetNodeId="1.1168559393589" />
              </node>
              <node role="operand" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1205437393794" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205437576724">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205437576725">
            <property name="name" value="fragmentToSet" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1205437576726" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205437605300">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205437602093">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205437587011">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205437585838">
                    <link role="variableDeclaration" targetNodeId="1205437054639" resolveInfo="TFs" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetFirstOperation" id="1205437592341" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1205437603627" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_CopyOperation" id="1205437608349" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205438118129">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205438118130">
            <property name="name" value="TFtoDelete" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1205438118131">
              <link role="concept" targetNodeId="1.1095672379244" resolveInfo="TemplateFragment" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205438118132">
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.AttributeAccessOperation" id="1205438118133">
                <node role="attributeQualifier" type="jetbrains.mps.bootstrap.smodelLanguage.structure.NodeAttributeAccessQualifier" id="1205438118134">
                  <link role="annotationLink" targetNodeId="1.1149858605876" resolveInfo="templateFragment" />
                </node>
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205438118135">
                <link role="variableDeclaration" targetNodeId="1205437576725" resolveInfo="fragmentToSet" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1205438123996">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205438125201">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205438123997">
              <link role="variableDeclaration" targetNodeId="1205438118130" resolveInfo="TFtoDelete" />
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_DeleteOperation" id="1205438126469" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205437482223">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205437482224">
            <property name="name" value="inlineTemplate" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1205437482225">
              <link role="concept" targetNodeId="1.1177093525992" resolveInfo="InlineTemplate_RuleConsequence" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205437482226">
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ReplaceWithNewOperation" id="1205437482227">
                <link role="concept" targetNodeId="1.1177093525992" resolveInfo="InlineTemplate_RuleConsequence" />
              </node>
              <node role="operand" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1205437482228" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1205437496449">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205437508438">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205437497623">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205437496450">
                <link role="variableDeclaration" targetNodeId="1205437482224" resolveInfo="inlineTemplate" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1205437507187">
                <link role="link" targetNodeId="1.1177093586806" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetTargetOperation" id="1205437510971">
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205437757383">
                <link role="variableDeclaration" targetNodeId="1205437576725" resolveInfo="fragmentToSet" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1205437778214">
          <property name="value" value="------" />
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205437833862">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205437833863">
            <property name="name" value="option" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1205437833864" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205437833865">
              <link role="classConcept" targetNodeId="15.~JOptionPane" resolveInfo="JOptionPane" />
              <link role="baseMethodDeclaration" targetNodeId="15.~JOptionPane.showConfirmDialog(java.awt.Component,java.lang.Object,java.lang.String,int):int" resolveInfo="showConfirmDialog" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1205437833866" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1205437833867">
                <property name="value" value="Delete old template?" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1205437960301">
                <property name="value" value="" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1205437987287">
                <link role="classifier" targetNodeId="15.~JOptionPane" resolveInfo="JOptionPane" />
                <link role="variableDeclaration" targetNodeId="15.~JOptionPane.YES_NO_OPTION" resolveInfo="YES_NO_OPTION" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1205437839400">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205437839401">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1205438040103">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205438041214">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205438040104">
                  <link role="variableDeclaration" targetNodeId="1205437393790" resolveInfo="oldTemplate" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_DeleteOperation" id="1205438042748" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1205437843640">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1205437847940">
              <link role="classifier" targetNodeId="15.~JOptionPane" resolveInfo="JOptionPane" />
              <link role="variableDeclaration" targetNodeId="15.~JOptionPane.YES_OPTION" resolveInfo="YES_OPTION" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205437841404">
              <link role="variableDeclaration" targetNodeId="1205437833863" resolveInfo="option" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.IsApplicableBlock" id="1205436888128">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205436888129">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1205436889755">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1205436896119">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1205436898529" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205436890804">
              <node role="operand" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1205436889756" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1205436893634">
                <link role="link" targetNodeId="1.1168559393589" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.intentionsLanguage.structure.IntentionDeclaration" id="1207152859258">
    <property name="name" value="AddNodeMacro" />
    <link role="forConcept" targetNodeId="2.1133920641626" resolveInfo="BaseConcept" />
    <node role="descriptionFunction" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.DescriptionBlock" id="1207152859259">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207152859260">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207153626673">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1207153626674">
            <property name="value" value="Add node macro" />
          </node>
        </node>
      </node>
    </node>
    <node role="executeFunction" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ExecuteBlock" id="1207152859261">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207152859262">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1207153675022">
          <property name="value" value="do not hang $$ on other attributes" />
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207153675023">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207153675024">
            <property name="name" value="applyToNode" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207153675025" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207153675026">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207153675027">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207153675028">
                  <node role="operand" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1207154163178" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorsOperation" id="1207153675030">
                    <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Inclusion" id="1207153675031" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.WhereOperation" id="1207153675032">
                  <node role="whereClosure" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.WhereBlock" id="1207153675033">
                    <node role="defaultInputElement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.DefaultInputElement" id="1207153675034">
                      <property name="name" value="it" />
                    </node>
                    <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207153675035">
                      <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207153675036">
                        <node role="expression" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1207153675037">
                          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207153675038">
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ClosureParameterReference" id="1207153675039">
                              <link role="closureParameter" targetNodeId="1207153675034" resolveInfo="it" />
                            </node>
                            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsAttributeOperation" id="1207153675040" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetFirstOperation" id="1207153675041" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1207153675042">
          <property name="value" value="surround with &lt;TF&gt; if necessary" />
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1207153675043">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207153675044">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1207153675045">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207153675046">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207153675047">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1207153675048">
                    <link role="baseMethodDeclaration" targetNodeId="16.1205869137520" resolveInfo="createTemplateFragment" />
                    <link role="classConcept" targetNodeId="16.1205859480204" resolveInfo="QueriesUtil" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207153675049">
                      <link role="variableDeclaration" targetNodeId="1207153675024" resolveInfo="applyToNode" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1207153675050">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1207153675051">
                  <link role="classConcept" targetNodeId="16.1205859480204" resolveInfo="QueriesUtil" />
                  <link role="baseMethodDeclaration" targetNodeId="16.1205859565509" resolveInfo="isInsideTemplateFragment" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207153675052">
                    <link role="variableDeclaration" targetNodeId="1207153675024" resolveInfo="applyToNode" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1207153675053">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207153675054">
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1207153675055">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1207153675056">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1207675648339">
                    <link role="conceptDeclaration" targetNodeId="1.1092059087312" resolveInfo="TemplateDeclaration" />
                  </node>
                </node>
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207153675057">
                <link role="variableDeclaration" targetNodeId="1207153675024" resolveInfo="applyToNode" />
              </node>
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1207153675058" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1207153675059">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207153675060" />
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1207153675061">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207153675062">
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1207153675063">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1207153675064">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1207675648312">
                    <link role="conceptDeclaration" targetNodeId="1.1092059087312" resolveInfo="TemplateDeclaration" />
                  </node>
                </node>
              </node>
              <node role="operand" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1207154154220" />
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1207153675066" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207153675067">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207153675068">
            <property name="name" value="nodeMacro" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207153675069">
              <link role="concept" targetNodeId="1.1087833466690" resolveInfo="NodeMacro" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1207153675070">
              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1207153675071">
                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207153675072">
                  <link role="concept" targetNodeId="1.1087833466690" resolveInfo="NodeMacro" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1207153675073">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207153675074">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207153675075">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207153675076">
                <node role="operand" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1207154159769" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_InsertPrevSiblingOperation" id="1207153675078">
                  <node role="parameter" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207153675079">
                    <link role="variableDeclaration" targetNodeId="1207153675068" resolveInfo="nodeMacro" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1207153675080">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207153675081">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207153675082">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207153675083">
                  <link role="variableDeclaration" targetNodeId="1207153675024" resolveInfo="applyToNode" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetChildrenOperation" id="1207153675084" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ContainsOperation" id="1207153675085">
                <node role="argument" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1207155442999" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207153675087">
              <node role="operand" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1207154157112" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1207153675089">
                <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1207153675090">
                  <link role="conceptDeclaration" targetNodeId="1.1087833466690" resolveInfo="NodeMacro" />
                </node>
              </node>
            </node>
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1207153675091">
            <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207153675092">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207153675093">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207153675094">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207153675095">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207153675096">
                      <link role="variableDeclaration" targetNodeId="1207153675024" resolveInfo="applyToNode" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.AttributeAccessOperation" id="1207153675097">
                      <node role="attributeQualifier" type="jetbrains.mps.bootstrap.smodelLanguage.structure.NodeAttributeAccessQualifier" id="1207153675098">
                        <link role="annotationLink" targetNodeId="1.1149694500506" resolveInfo="nodeMacro" />
                      </node>
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_AddChildOperation" id="1207153675099">
                    <node role="parameter" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207153675100">
                      <link role="variableDeclaration" targetNodeId="1207153675068" resolveInfo="nodeMacro" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1207153675101">
          <property name="value" value="set caret" />
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207153675102">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207153675103">
            <node role="operand" type="jetbrains.mps.bootstrap.sharedConcepts.structure.ConceptFunctionParameter_editorContext" id="1207154161286" />
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207153675105">
              <link role="baseMethodDeclaration" targetNodeId="5.~EditorContext.selectAndSetCaretLater(jetbrains.mps.smodel.SNode,int):void" resolveInfo="selectAndSetCaretLater" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207153675106">
                <link role="variableDeclaration" targetNodeId="1207153675068" resolveInfo="nodeMacro" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1207153675107">
                <property name="value" value="1" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.IsApplicableBlock" id="1207153617470">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207153617471">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207153622378">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.InstanceOfExpression" id="1207153622379">
            <node role="classType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1207153622380">
              <link role="classifier" targetNodeId="6.~Generator" resolveInfo="Generator" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207153622381">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207153622382">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression" id="1207153622383">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1207153622384">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207153622385">
                      <node role="operand" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1207153622386" />
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetModelOperation" id="1207153622387" />
                    </node>
                    <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1207153622388">
                      <link role="classifier" targetNodeId="6.~SModel" resolveInfo="SModel" />
                    </node>
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207153622389">
                  <link role="baseMethodDeclaration" targetNodeId="6.~SModel.getModelDescriptor():jetbrains.mps.smodel.SModelDescriptor" resolveInfo="getModelDescriptor" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207153622390">
                <link role="baseMethodDeclaration" targetNodeId="6.~SModelDescriptor.getModule():jetbrains.mps.project.IModule" resolveInfo="getModule" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.intentionsLanguage.structure.IntentionDeclaration" id="1207154194671">
    <property name="name" value="AddPropertyMacro" />
    <link role="forConcept" targetNodeId="2.1133920641626" resolveInfo="BaseConcept" />
    <node role="descriptionFunction" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.DescriptionBlock" id="1207154194672">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207154194673">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207154194674">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1207154194675">
            <property name="value" value="Add property macro" />
          </node>
        </node>
      </node>
    </node>
    <node role="executeFunction" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ExecuteBlock" id="1207154194676">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207154194677">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1207155381360">
          <property name="value" value="surround with &lt;TF&gt; if necessary" />
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1207155381361">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207155381362">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1207155381363">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207155381364">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207155381365">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1207155381366">
                    <link role="baseMethodDeclaration" targetNodeId="16.1205869137520" resolveInfo="createTemplateFragment" />
                    <link role="classConcept" targetNodeId="16.1205859480204" resolveInfo="QueriesUtil" />
                    <node role="actualArgument" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1207155385392" />
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1207155381368">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1207155381369">
                  <link role="baseMethodDeclaration" targetNodeId="16.1205859565509" resolveInfo="isInsideTemplateFragment" />
                  <link role="classConcept" targetNodeId="16.1205859480204" resolveInfo="QueriesUtil" />
                  <node role="actualArgument" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1207155386268" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1207155381371">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207155381372">
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1207155381373">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1207155381374">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1207675648310">
                    <link role="conceptDeclaration" targetNodeId="1.1092059087312" resolveInfo="TemplateDeclaration" />
                  </node>
                </node>
              </node>
              <node role="operand" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1207155383797" />
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1207155381376" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207155381377">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207155381378">
            <property name="name" value="cell" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1207155381379">
              <link role="classifier" targetNodeId="5.~EditorCell" resolveInfo="EditorCell" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207155381380">
              <node role="operand" type="jetbrains.mps.bootstrap.sharedConcepts.structure.ConceptFunctionParameter_editorContext" id="1207155388895" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207155381382">
                <link role="baseMethodDeclaration" targetNodeId="5.~EditorContext.getSelectedCell():jetbrains.mps.nodeEditor.EditorCell" resolveInfo="getSelectedCell" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207155381383">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207155381384">
            <property name="name" value="propertyName" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1207155381385">
              <link role="classifier" targetNodeId="12.~String" resolveInfo="String" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1207155381386">
              <link role="baseMethodDeclaration" targetNodeId="16.1205880048658" resolveInfo="getEditedPropertyName" />
              <link role="classConcept" targetNodeId="16.1205859480204" resolveInfo="QueriesUtil" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207155381387">
                <link role="variableDeclaration" targetNodeId="1207155381378" resolveInfo="cell" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207155381388">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207155381389">
            <property name="name" value="propertyMacro" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207155381390">
              <link role="concept" targetNodeId="1.1087833241328" resolveInfo="PropertyMacro" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207155381391">
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetNewChildOperation" id="1207155381392" />
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207155381393">
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.AttributeAccessOperation" id="1207155381394">
                  <node role="attributeQualifier" type="jetbrains.mps.bootstrap.smodelLanguage.structure.PropertyAttributeAccessQualifier" id="1207155381395">
                    <link role="annotationLink" targetNodeId="1.1149694466802" resolveInfo="propertyMacro" />
                    <node role="propertyQualifier" type="jetbrains.mps.bootstrap.smodelLanguage.structure.PoundExpression" id="1207155381396">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207155381397">
                        <link role="variableDeclaration" targetNodeId="1207155381384" resolveInfo="propertyName" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="operand" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1207155387878" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1207155381399">
          <property name="value" value="set caret" />
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207155381400">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207155381401">
            <node role="operand" type="jetbrains.mps.bootstrap.sharedConcepts.structure.ConceptFunctionParameter_editorContext" id="1207155389990" />
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207155381403">
              <link role="baseMethodDeclaration" targetNodeId="5.~EditorContext.selectAndSetCaretLater(jetbrains.mps.smodel.SNode,int):void" resolveInfo="selectAndSetCaretLater" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207155381404">
                <link role="variableDeclaration" targetNodeId="1207155381389" resolveInfo="propertyMacro" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1207155381405">
                <property name="value" value="0" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.IsApplicableBlock" id="1207154194764">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207154194765">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1207154574028">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207154574029">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1207154580608">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1207154584189">
                <property name="value" value="false" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1207154577829">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.InstanceOfExpression" id="1207154578284">
              <node role="classType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1207154578285">
                <link role="classifier" targetNodeId="6.~Generator" resolveInfo="Generator" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207154578286">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207154578287">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression" id="1207154578288">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1207154578289">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207154578290">
                        <node role="operand" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1207154578291" />
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetModelOperation" id="1207154578292" />
                      </node>
                      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1207154578293">
                        <link role="classifier" targetNodeId="6.~SModel" resolveInfo="SModel" />
                      </node>
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207154578294">
                    <link role="baseMethodDeclaration" targetNodeId="6.~SModel.getModelDescriptor():jetbrains.mps.smodel.SModelDescriptor" resolveInfo="getModelDescriptor" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207154578295">
                  <link role="baseMethodDeclaration" targetNodeId="6.~SModelDescriptor.getModule():jetbrains.mps.project.IModule" resolveInfo="getModule" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207154538579">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207154538580">
            <property name="name" value="cell" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1207154538581">
              <link role="classifier" targetNodeId="5.~EditorCell" resolveInfo="EditorCell" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207154538582">
              <node role="operand" type="jetbrains.mps.bootstrap.sharedConcepts.structure.ConceptFunctionParameter_editorContext" id="1207155292955" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207154538584">
                <link role="baseMethodDeclaration" targetNodeId="5.~EditorContext.getSelectedCell():jetbrains.mps.nodeEditor.EditorCell" resolveInfo="getSelectedCell" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1207154538585">
          <property name="value" value="it can be 'ref.cell-&gt;{name}'. in this case both are 'applicable'. but link has priority" />
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207154538586">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207154538587">
            <property name="name" value="linkRole" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1207154538588">
              <link role="classifier" targetNodeId="12.~String" resolveInfo="String" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1207154538589">
              <link role="baseMethodDeclaration" targetNodeId="16.1205879788732" resolveInfo="getEditedLinkRole" />
              <link role="classConcept" targetNodeId="16.1205859480204" resolveInfo="QueriesUtil" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207154538590">
                <link role="variableDeclaration" targetNodeId="1207154538580" resolveInfo="cell" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1207154538591">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207154538592">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1207154538593">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1207154538594">
                <property name="value" value="false" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1207154538595">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1207154538596" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207154538597">
              <link role="variableDeclaration" targetNodeId="1207154538587" resolveInfo="linkRole" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207154538598">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207154538599">
            <property name="name" value="propertyName" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1207154538600">
              <link role="classifier" targetNodeId="12.~String" resolveInfo="String" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1207154538601">
              <link role="baseMethodDeclaration" targetNodeId="16.1205880048658" resolveInfo="getEditedPropertyName" />
              <link role="classConcept" targetNodeId="16.1205859480204" resolveInfo="QueriesUtil" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207154538602">
                <link role="variableDeclaration" targetNodeId="1207154538580" resolveInfo="cell" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1207154538603">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207154538604">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1207154538605">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1207154538606">
                <property name="value" value="false" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1207154538607">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1207154538608" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207154538609">
              <link role="variableDeclaration" targetNodeId="1207154538599" resolveInfo="propertyName" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1207154538610">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1207154538611">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1207154538612" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207154538613">
              <node role="operand" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1207155294519" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.AttributeAccessOperation" id="1207154538615">
                <node role="attributeQualifier" type="jetbrains.mps.bootstrap.smodelLanguage.structure.PropertyAttributeAccessQualifier" id="1207154538616">
                  <link role="annotationLink" targetNodeId="1.1149694466802" resolveInfo="propertyMacro" />
                  <node role="propertyQualifier" type="jetbrains.mps.bootstrap.smodelLanguage.structure.PoundExpression" id="1207154538617">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207154538618">
                      <link role="variableDeclaration" targetNodeId="1207154538599" resolveInfo="propertyName" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.intentionsLanguage.structure.IntentionDeclaration" id="1207154220489">
    <property name="name" value="AddReferenceMacro" />
    <link role="forConcept" targetNodeId="2.1133920641626" resolveInfo="BaseConcept" />
    <node role="descriptionFunction" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.DescriptionBlock" id="1207154220490">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207154220491">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207154220492">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1207154220493">
            <property name="value" value="Add reference macro" />
          </node>
        </node>
      </node>
    </node>
    <node role="executeFunction" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ExecuteBlock" id="1207154220494">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207154220495">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207155369338">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207155369339">
            <property name="name" value="cell" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1207155369340">
              <link role="classifier" targetNodeId="5.~EditorCell" resolveInfo="EditorCell" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207155369341">
              <node role="operand" type="jetbrains.mps.bootstrap.sharedConcepts.structure.ConceptFunctionParameter_editorContext" id="1207155397960" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207155369343">
                <link role="baseMethodDeclaration" targetNodeId="5.~EditorContext.getSelectedCell():jetbrains.mps.nodeEditor.EditorCell" resolveInfo="getSelectedCell" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207155369344">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207155369345">
            <property name="name" value="linkRole" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1207155369346">
              <link role="classifier" targetNodeId="12.~String" resolveInfo="String" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1207155369347">
              <link role="classConcept" targetNodeId="16.1205859480204" resolveInfo="QueriesUtil" />
              <link role="baseMethodDeclaration" targetNodeId="16.1205879788732" resolveInfo="getEditedLinkRole" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207155369348">
                <link role="variableDeclaration" targetNodeId="1207155369339" resolveInfo="cell" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207155369349">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207155369350">
            <property name="name" value="referentNode" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207155369351" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1207155369352">
              <link role="classConcept" targetNodeId="16.1205859480204" resolveInfo="QueriesUtil" />
              <link role="baseMethodDeclaration" targetNodeId="16.1205881894854" resolveInfo="getEditedLinkReferentNode" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207155369353">
                <link role="variableDeclaration" targetNodeId="1207155369339" resolveInfo="cell" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1207155369354">
          <property name="value" value="surround with &lt;TF&gt; if necessary" />
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1207155369355">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207155369356">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1207155369357">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207155369358">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207155369359">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1207155369360">
                    <link role="classConcept" targetNodeId="16.1205859480204" resolveInfo="QueriesUtil" />
                    <link role="baseMethodDeclaration" targetNodeId="16.1205869137520" resolveInfo="createTemplateFragment" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207155369361">
                      <link role="variableDeclaration" targetNodeId="1207155369350" resolveInfo="referentNode" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1207155369362">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1207155369363">
                  <link role="classConcept" targetNodeId="16.1205859480204" resolveInfo="QueriesUtil" />
                  <link role="baseMethodDeclaration" targetNodeId="16.1205859565509" resolveInfo="isInsideTemplateFragment" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207155369364">
                    <link role="variableDeclaration" targetNodeId="1207155369350" resolveInfo="referentNode" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1207155369365">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207155369366">
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1207155369367">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1207155369368">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1207675648319">
                    <link role="conceptDeclaration" targetNodeId="1.1092059087312" resolveInfo="TemplateDeclaration" />
                  </node>
                </node>
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207155369369">
                <link role="variableDeclaration" targetNodeId="1207155369350" resolveInfo="referentNode" />
              </node>
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1207155369370" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207155369371">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207155369372">
            <property name="name" value="referenceMacro" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207155369373">
              <link role="concept" targetNodeId="1.1088761943574" resolveInfo="ReferenceMacro" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207155369374">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207155369375">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207155369376">
                  <link role="variableDeclaration" targetNodeId="1207155369350" resolveInfo="referentNode" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.AttributeAccessOperation" id="1207155369377">
                  <node role="attributeQualifier" type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkAttributeAccessQualifier" id="1207155369378">
                    <link role="annotationLink" targetNodeId="1.1149694518242" resolveInfo="referenceMacro" />
                    <node role="linkQualifier" type="jetbrains.mps.bootstrap.smodelLanguage.structure.PoundExpression" id="1207155369379">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207155369380">
                        <link role="variableDeclaration" targetNodeId="1207155369345" resolveInfo="linkRole" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetNewChildOperation" id="1207155369381" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1207155369382">
          <property name="value" value="set caret" />
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207155369383">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207155369384">
            <node role="operand" type="jetbrains.mps.bootstrap.sharedConcepts.structure.ConceptFunctionParameter_editorContext" id="1207155395897" />
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207155369386">
              <link role="baseMethodDeclaration" targetNodeId="5.~EditorContext.selectAndSetCaretLater(jetbrains.mps.smodel.SNode,int):void" resolveInfo="selectAndSetCaretLater" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207155369387">
                <link role="variableDeclaration" targetNodeId="1207155369372" resolveInfo="referenceMacro" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1207155369388">
                <property name="value" value="2" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.IsApplicableBlock" id="1207154220582">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207154220583">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1207155315551">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207155315552">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1207155315553">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1207155315554">
                <property name="value" value="false" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1207155315555">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.InstanceOfExpression" id="1207155315556">
              <node role="classType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1207155315557">
                <link role="classifier" targetNodeId="6.~Generator" resolveInfo="Generator" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207155315558">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207155315559">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression" id="1207155315560">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1207155315561">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207155315562">
                        <node role="operand" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1207155315563" />
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetModelOperation" id="1207155315564" />
                      </node>
                      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1207155315565">
                        <link role="classifier" targetNodeId="6.~SModel" resolveInfo="SModel" />
                      </node>
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207155315566">
                    <link role="baseMethodDeclaration" targetNodeId="6.~SModel.getModelDescriptor():jetbrains.mps.smodel.SModelDescriptor" resolveInfo="getModelDescriptor" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207155315567">
                  <link role="baseMethodDeclaration" targetNodeId="6.~SModelDescriptor.getModule():jetbrains.mps.project.IModule" resolveInfo="getModule" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207155332956">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207155332957">
            <property name="name" value="cell" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1207155332958">
              <link role="classifier" targetNodeId="5.~EditorCell" resolveInfo="EditorCell" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207155332959">
              <node role="operand" type="jetbrains.mps.bootstrap.sharedConcepts.structure.ConceptFunctionParameter_editorContext" id="1207155341489" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207155332961">
                <link role="baseMethodDeclaration" targetNodeId="5.~EditorContext.getSelectedCell():jetbrains.mps.nodeEditor.EditorCell" resolveInfo="getSelectedCell" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207155332962">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207155332963">
            <property name="name" value="linkRole" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1207155332964">
              <link role="classifier" targetNodeId="12.~String" resolveInfo="String" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1207155332965">
              <link role="baseMethodDeclaration" targetNodeId="16.1205879788732" resolveInfo="getEditedLinkRole" />
              <link role="classConcept" targetNodeId="16.1205859480204" resolveInfo="QueriesUtil" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207155332966">
                <link role="variableDeclaration" targetNodeId="1207155332957" resolveInfo="cell" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1207155332967">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207155332968">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1207155332969">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1207155332970">
                <property name="value" value="false" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1207155332971">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207155332972">
              <link role="variableDeclaration" targetNodeId="1207155332963" resolveInfo="linkRole" />
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1207155332973" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207155332974">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207155332975">
            <property name="name" value="referentNode" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207155332976" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1207155332977">
              <link role="classConcept" targetNodeId="16.1205859480204" resolveInfo="QueriesUtil" />
              <link role="baseMethodDeclaration" targetNodeId="16.1205881894854" resolveInfo="getEditedLinkReferentNode" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207155332978">
                <link role="variableDeclaration" targetNodeId="1207155332957" resolveInfo="cell" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1207155332979">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1207155332980">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1207155332981" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207155332982">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207155332983">
                <link role="variableDeclaration" targetNodeId="1207155332975" resolveInfo="referentNode" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.AttributeAccessOperation" id="1207155332984">
                <node role="attributeQualifier" type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkAttributeAccessQualifier" id="1207155332985">
                  <link role="annotationLink" targetNodeId="1.1149694518242" resolveInfo="referenceMacro" />
                  <node role="linkQualifier" type="jetbrains.mps.bootstrap.smodelLanguage.structure.PoundExpression" id="1207155332986">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207155332987">
                      <link role="variableDeclaration" targetNodeId="1207155332963" resolveInfo="linkRole" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.intentionsLanguage.structure.IntentionDeclaration" id="1207695450179">
    <property name="package" value="label" />
    <property name="name" value="Replace_ConditionalRootLabelDeclaration" />
    <property name="isErrorIntention" value="true" />
    <link role="forConcept" targetNodeId="1.1200923014784" resolveInfo="ConditionalRootLabelDeclaration" />
    <node role="descriptionFunction" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.DescriptionBlock" id="1207695450180">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207695450181">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207695514307">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1207695514308">
            <property name="value" value="replace deprecated label declaration" />
          </node>
        </node>
      </node>
    </node>
    <node role="executeFunction" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ExecuteBlock" id="1207695450182">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207695450183">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207696018117">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207696018118">
            <property name="name" value="newLabel" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207696018119">
              <link role="concept" targetNodeId="1.1200911316486" resolveInfo="MappingLabelDeclaration" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1207696018120">
              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1207696018121">
                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207696018122">
                  <link role="concept" targetNodeId="1.1200911316486" resolveInfo="MappingLabelDeclaration" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207695772385">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207695778684">
            <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SemanticDowncastExpression" id="1207695784029">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207696446006">
                <link role="variableDeclaration" targetNodeId="1207696018118" resolveInfo="newLabel" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207695795918">
              <link role="baseMethodDeclaration" targetNodeId="6.~SNode.setId(jetbrains.mps.smodel.SNodeId):void" resolveInfo="setId" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207696057159">
                <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SemanticDowncastExpression" id="1207696056064">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1207696069893" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207696064329">
                  <link role="baseMethodDeclaration" targetNodeId="6.~SNode.getSNodeId():jetbrains.mps.smodel.SNodeId" resolveInfo="getSNodeId" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207695710777">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1207695735329">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207695738177">
              <node role="operand" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1207695737285" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1207695748351">
                <link role="property" targetNodeId="2.1169194664001" resolveInfo="name" />
              </node>
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207695712701">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207696103020">
                <link role="variableDeclaration" targetNodeId="1207696018118" resolveInfo="newLabel" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1207695733468">
                <link role="property" targetNodeId="2.1169194664001" resolveInfo="name" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207695588509">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1207695599796">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207695603034">
              <node role="operand" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1207695601611" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1207695603474">
                <link role="link" targetNodeId="1.1200913004646" />
              </node>
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207695594762">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207696104193">
                <link role="variableDeclaration" targetNodeId="1207696018118" resolveInfo="newLabel" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1207695597592">
                <link role="link" targetNodeId="1.1200913004646" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207696111523">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207696112244">
            <node role="operand" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1207696111524" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ReplaceWithAnotherOperation" id="1207696115542">
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207696118919">
                <link role="variableDeclaration" targetNodeId="1207696018118" resolveInfo="newLabel" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.intentionsLanguage.structure.IntentionDeclaration" id="1212103271142">
    <property name="name" value="Remove_properyLink_fromPropMacro" />
    <property name="isErrorIntention" value="true" />
    <link role="forConcept" targetNodeId="1.1087833241328" resolveInfo="PropertyMacro" />
    <node role="descriptionFunction" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.DescriptionBlock" id="1212103271143">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1212103271144">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1212103467138">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1212103467139">
            <property name="value" value="remove obsolete 'property' link" />
          </node>
        </node>
      </node>
    </node>
    <node role="executeFunction" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ExecuteBlock" id="1212103271145">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1212103271146">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1212103579131">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1212103579132">
            <property name="name" value="reference" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1212103579133">
              <link role="classifier" targetNodeId="6.~SReference" resolveInfo="SReference" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1212103586416">
              <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SemanticDowncastExpression" id="1212103586417">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1212103586418" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1212103586419">
                <link role="baseMethodDeclaration" targetNodeId="6.~SNode.getReference(java.lang.String):jetbrains.mps.smodel.SReference" resolveInfo="getReference" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1212103586420">
                  <property name="value" value="property" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1212103591985">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1212103597942">
            <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SemanticDowncastExpression" id="1212103596815">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1212103591986" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1212103603867">
              <link role="baseMethodDeclaration" targetNodeId="6.~SNode.removeReference(jetbrains.mps.smodel.SReference):void" resolveInfo="removeReference" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1212103606227">
                <link role="variableDeclaration" targetNodeId="1212103579132" resolveInfo="reference" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.IsApplicableBlock" id="1212103521327">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1212103521328">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1212103527032">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1212103562877">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1212103565661" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1212103532664">
              <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SemanticDowncastExpression" id="1212103531647">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1212103527033" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1212103551062">
                <link role="baseMethodDeclaration" targetNodeId="6.~SNode.getReference(java.lang.String):jetbrains.mps.smodel.SReference" resolveInfo="getReference" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1212103553813">
                  <property name="value" value="property" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.intentionsLanguage.structure.IntentionDeclaration" id="1212104471752">
    <property name="name" value="Remove_linkLink_fromRefMacro" />
    <property name="isErrorIntention" value="true" />
    <link role="forConcept" targetNodeId="1.1088761943574" resolveInfo="ReferenceMacro" />
    <node role="descriptionFunction" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.DescriptionBlock" id="1212104471753">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1212104471754">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1212104471755">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1212104471756">
            <property name="value" value="remove obsolete 'link' link" />
          </node>
        </node>
      </node>
    </node>
    <node role="executeFunction" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ExecuteBlock" id="1212104471757">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1212104471758">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1212104471759">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1212104471760">
            <property name="name" value="reference" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1212104471761">
              <link role="classifier" targetNodeId="6.~SReference" resolveInfo="SReference" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1212104471762">
              <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SemanticDowncastExpression" id="1212104471763">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1212104471764" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1212104471765">
                <link role="baseMethodDeclaration" targetNodeId="6.~SNode.getReference(java.lang.String):jetbrains.mps.smodel.SReference" resolveInfo="getReference" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1212104471766">
                  <property name="value" value="link" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1212104471767">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1212104471768">
            <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SemanticDowncastExpression" id="1212104471769">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1212104471770" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1212104471771">
              <link role="baseMethodDeclaration" targetNodeId="6.~SNode.removeReference(jetbrains.mps.smodel.SReference):void" resolveInfo="removeReference" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1212104471772">
                <link role="variableDeclaration" targetNodeId="1212104471760" resolveInfo="reference" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.IsApplicableBlock" id="1212104471773">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1212104471774">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1212104471775">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1212104471776">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1212104471777" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1212104471778">
              <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SemanticDowncastExpression" id="1212104471779">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1212104471780" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1212104471781">
                <link role="baseMethodDeclaration" targetNodeId="6.~SNode.getReference(java.lang.String):jetbrains.mps.smodel.SReference" resolveInfo="getReference" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1212104471782">
                  <property name="value" value="link" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

