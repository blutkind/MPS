<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.transformation.TLBase.actions">
  <persistence version="1" />
  <refactoringHistory />
  <language namespace="jetbrains.mps.bootstrap.actionsLanguage">
    <languageAspect modelUID="jetbrains.mps.bootstrap.actionsLanguage.constraints" version="16" />
    <languageAspect modelUID="jetbrains.mps.bootstrap.actionsLanguage.structure" version="22" />
  </language>
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage">
    <languageAspect modelUID="jetbrains.mps.bootstrap.smodelLanguage.constraints" version="21" />
    <languageAspect modelUID="jetbrains.mps.bootstrap.smodelLanguage.structure" version="1" />
  </language>
  <language namespace="jetbrains.mps.baseLanguage.ext.collections.lang">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.constraints" version="6" />
    <languageAspect modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.structure" version="1" />
  </language>
  <language namespace="jetbrains.mps.baseLanguage">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.constraints" version="83" />
    <languageAspect modelUID="jetbrains.mps.baseLanguage.structure" version="0" />
  </language>
  <language namespace="jetbrains.mps.bootstrap.helgins">
    <languageAspect modelUID="jetbrains.mps.bootstrap.helgins.constraints" version="17" />
  </language>
  <languageAspect modelUID="jetbrains.mps.bootstrap.constraintsLanguage.structure" version="1" />
  <languageAspect modelUID="jetbrains.mps.transformation.TLBase.structure" version="1" />
  <languageAspect modelUID="jetbrains.mps.closures.structure" version="0" />
  <languageAspect modelUID="jetbrains.mps.transformation.TLBase.constraints" version="16" />
  <languageAspect modelUID="jetbrains.mps.bootstrap.structureLanguage.constraints" version="11" />
  <languageAspect modelUID="jetbrains.mps.bootstrap.sharedConcepts.constraints" version="0" />
  <languageAspect modelUID="jetbrains.mps.closures.constraints" version="2" />
  <languageAspect modelUID="jetbrains.mps.core.constraints" version="2" />
  <languageAspect modelUID="jetbrains.mps.internal.collections.constraints" version="2" />
  <languageAspect modelUID="jetbrains.mps.patterns.constraints" version="2" />
  <maxImportIndex value="4" />
  <import index="1" modelUID="jetbrains.mps.transformation.TLBase.structure" version="1" />
  <import index="3" modelUID="jetbrains.mps.bootstrap.smodelLanguage.structure" version="1" />
  <node type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSubstituteActions" id="1169570915271">
    <property name="name" value="TL_node_substitute" />
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSubstituteActionsBuilder" id="1169570930693">
      <property name="description" value="choice of consequences for weaving rule" />
      <link role="applicableConcept" targetNodeId="1.1168559098955" />
      <node role="part" type="jetbrains.mps.bootstrap.actionsLanguage.structure.RemovePart" id="1177412896773">
        <link role="conceptToRemove" targetNodeId="1.1168559512253" />
      </node>
      <node role="part" type="jetbrains.mps.bootstrap.actionsLanguage.structure.RemovePart" id="1177412906732">
        <link role="conceptToRemove" targetNodeId="1.1177093525992" />
      </node>
      <node role="part" type="jetbrains.mps.bootstrap.actionsLanguage.structure.RemovePart" id="1202777025214">
        <link role="conceptToRemove" targetNodeId="1.1202776937179" resolveInfo="AbandonInput_RuleConsequence" />
      </node>
      <node role="part" type="jetbrains.mps.bootstrap.actionsLanguage.structure.ConceptSubstitutePart" id="1195244204581">
        <link role="concept" targetNodeId="1.1169569792945" resolveInfo="WeaveEach_RuleConsequence" />
      </node>
      <node role="precondition" type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSubstitutePreconditionFunction" id="1169582381136">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1169582381137">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1195244142608">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227901282">
              <node role="operand" type="jetbrains.mps.bootstrap.actionsLanguage.structure.ConceptFunctionParameter_parentNode" id="1169582460352" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1169582465151">
                <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1177093043370">
                  <link role="conceptDeclaration" targetNodeId="1.1167171569011" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSubstituteActionsBuilder" id="1195244607537">
      <property name="description" value="choice of consequences for reduction rule" />
      <link role="applicableConcept" targetNodeId="1.1168559098955" resolveInfo="RuleConsequence" />
      <node role="precondition" type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSubstitutePreconditionFunction" id="1195244660444">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1195244660445">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1195244680228">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227895292">
              <node role="operand" type="jetbrains.mps.bootstrap.actionsLanguage.structure.ConceptFunctionParameter_parentNode" id="1195244680229" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1195244683592">
                <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1195244693391">
                  <link role="conceptDeclaration" targetNodeId="1.1167327847730" resolveInfo="Reduction_MappingRule" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="part" type="jetbrains.mps.bootstrap.actionsLanguage.structure.ConceptSubstitutePart" id="1195244699704">
        <link role="concept" targetNodeId="1.1195158154974" resolveInfo="InlineSwitch_RuleConsequence" />
      </node>
    </node>
  </node>
  <visible index="2" modelUID="jetbrains.mps.baseLanguage.structure" />
  <node type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeFactories" id="1198265022560">
    <property name="name" value="TL_node_factories" />
    <node role="nodeFactory" type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeFactory" id="1205663677152">
      <property name="description" value="Init generator if possible" />
      <link role="applicableConcept" targetNodeId="1.1200913690460" resolveInfo="Node_FindOutputNode" />
      <node role="setupFunction" type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSetupFunction" id="1205663677153">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205663677154">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205663736295">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205663736296">
              <property name="name" value="cf" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1205663736297">
                <link role="concept" targetNodeId="2v.1137021947720" resolveInfo="ConceptFunction" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205663736298">
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1205663736299">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1205663736300">
                    <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1207674649459">
                      <link role="conceptDeclaration" targetNodeId="2v.1137021947720" resolveInfo="ConceptFunction" />
                    </node>
                  </node>
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Inclusion" id="1205663736301" />
                </node>
                <node role="operand" type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSetupFunction_EnclosingNode" id="1205663736302" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1205663743287">
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205663743288">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1205663800271">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205663815117">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205663800654">
                    <node role="operand" type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSetupFunction_NewNode" id="1205663800272" />
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1205663814728">
                      <link role="link" targetNodeId="1.1200913810085" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetNewChildOperation" id="1205663817076">
                    <link role="concept" targetNodeId="1.1166749287094" resolveInfo="TemplateFunctionParameter_generator" />
                  </node>
                </node>
              </node>
            </node>
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1205663748380">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205663759580">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205663750298">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205663749883">
                    <link role="variableDeclaration" targetNodeId="1205663736296" resolveInfo="cf" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptLinkAccess" id="1205663753412">
                    <link role="conceptLinkDeclaration" targetNodeId="2v.1161119487665" resolveInfo="applicableConceptFunctionParameter" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ContainsOperation" id="1205663768925">
                  <node role="argument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.ConceptRefExpression" id="1205663780336">
                    <link role="conceptDeclaration" targetNodeId="1.1166749287094" resolveInfo="TemplateFunctionParameter_generator" />
                  </node>
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1205663745855">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205663744907">
                  <link role="variableDeclaration" targetNodeId="1205663736296" resolveInfo="cf" />
                </node>
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1205663747229" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="nodeFactory" type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeFactory" id="1207674454116">
      <link role="applicableConcept" targetNodeId="1.1131073187192" resolveInfo="MapSrcNodeMacro" />
      <node role="setupFunction" type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSetupFunction" id="1207674454117">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207674454118">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1207674483510">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207674488857">
              <node role="operand" type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSetupFunction_SampleNode" id="1207674487653" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1207674489766">
                <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1207674493329">
                  <link role="conceptDeclaration" targetNodeId="1.1087833466690" resolveInfo="NodeMacro" />
                </node>
              </node>
            </node>
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207674483512">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207674552830">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1207674558569">
                  <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207674566450">
                    <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1207674562464">
                      <link role="concept" targetNodeId="1.1087833466690" resolveInfo="NodeMacro" />
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSetupFunction_SampleNode" id="1207674560884" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1207674571577">
                      <link role="link" targetNodeId="1.1200912223215" />
                    </node>
                  </node>
                  <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207674554113">
                    <node role="operand" type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSetupFunction_NewNode" id="1207674552831" />
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1207674556709">
                      <link role="link" targetNodeId="1.1200912223215" />
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
</model>

