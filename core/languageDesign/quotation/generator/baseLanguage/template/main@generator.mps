<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:1222075024204(jetbrains.mps.quotation.generator.baseLanguage.template.main@generator)">
  <persistence version="3" />
  <refactoringHistory />
  <language namespace="jetbrains.mps.transformation.TLBase">
    <languageAspect modelUID="r:1222075024098(jetbrains.mps.transformation.TLBase.constraints)" version="16" />
    <languageAspect modelUID="r:1222075024104(jetbrains.mps.transformation.TLBase.structure)" version="1" />
  </language>
  <language namespace="jetbrains.mps.baseLanguage">
    <languageAspect modelUID="r:1222075024065(jetbrains.mps.baseLanguage.constraints)" version="83" />
    <languageAspect modelUID="r:1222075024074(jetbrains.mps.baseLanguage.structure)" version="0" />
  </language>
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage">
    <languageAspect modelUID="r:1222075024123(jetbrains.mps.bootstrap.smodelLanguage.constraints)" version="21" />
    <languageAspect modelUID="r:1222075024129(jetbrains.mps.bootstrap.smodelLanguage.structure)" version="1" />
  </language>
  <language namespace="jetbrains.mps.baseLanguage.ext.collections.lang">
    <languageAspect modelUID="r:1222075024168(jetbrains.mps.baseLanguage.ext.collections.lang.constraints)" version="6" />
    <languageAspect modelUID="r:1222075024174(jetbrains.mps.baseLanguage.ext.collections.lang.structure)" version="1" />
  </language>
  <language namespace="jetbrains.mps.transformation.generationContext" />
  <languageAspect modelUID="r:1222075024141(jetbrains.mps.bootstrap.constraintsLanguage.structure)" version="1" />
  <languageAspect modelUID="r:1222075024184(jetbrains.mps.closures.structure)" version="0" />
  <languageAspect modelUID="r:1222075024192(jetbrains.mps.patterns.constraints)" version="2" />
  <languageAspect modelUID="r:1222075024012(jetbrains.mps.bootstrap.structureLanguage.constraints)" version="11" />
  <languageAspect modelUID="r:1222075024058(jetbrains.mps.bootstrap.sharedConcepts.constraints)" version="0" />
  <languageAspect modelUID="r:1222075024046(jetbrains.mps.bootstrap.helgins.constraints)" version="17" />
  <languageAspect modelUID="r:1222075024180(jetbrains.mps.closures.constraints)" version="2" />
  <languageAspect modelUID="r:1222075024003(jetbrains.mps.core.constraints)" version="2" />
  <languageAspect modelUID="r:1222075024356(jetbrains.mps.internal.collections.constraints)" version="2" />
  <maxImportIndex value="21" />
  <import index="1" modelUID="r:1222075024203(jetbrains.mps.quotation.structure)" version="-1" />
  <import index="2" modelUID="f:java_stub#java.lang(java.lang@java_stub)" version="-1" />
  <import index="6" modelUID="f:java_stub#jetbrains.mps.generator.template(jetbrains.mps.generator.template@java_stub)" version="-1" />
  <import index="7" modelUID="f:java_stub#jetbrains.mps.core.structure(jetbrains.mps.core.structure@java_stub)" version="-1" />
  <import index="8" modelUID="f:java_stub#jetbrains.mps.baseLanguage.structure(jetbrains.mps.baseLanguage.structure@java_stub)" version="-1" />
  <import index="9" modelUID="r:1222075024052(jetbrains.mps.bootstrap.helgins.structure)" version="7" />
  <import index="10" modelUID="f:java_stub#jetbrains.mps.generator(jetbrains.mps.generator@java_stub)" version="-1" />
  <import index="11" modelUID="f:java_stub#jetbrains.mps.smodel(jetbrains.mps.smodel@java_stub)" version="-1" />
  <import index="12" modelUID="r:1222075024074(jetbrains.mps.baseLanguage.structure)" version="0" />
  <import index="13" modelUID="f:java_stub#jetbrains.mps.project(jetbrains.mps.project@java_stub)" version="-1" />
  <import index="14" modelUID="r:1222075024008(jetbrains.mps.core.structure)" version="-1" />
  <import index="16" modelUID="f:java_stub#java.util(java.util@java_stub)" version="-1" />
  <import index="17" modelUID="r:1222075024204(jetbrains.mps.quotation.generator.baseLanguage.template.main@generator)" version="-1" />
  <import index="18" modelUID="f:java_stub#jetbrains.mps.helgins.inference(jetbrains.mps.helgins.inference@java_stub)" version="-1" />
  <import index="19" modelUID="f:java_stub#jetbrains.mps.bootstrap.helgins.structure(jetbrains.mps.bootstrap.helgins.structure@java_stub)" version="-1" />
  <import index="20" modelUID="f:java_stub#jetbrains.mps.bootstrap.helgins.runtime(jetbrains.mps.bootstrap.helgins.runtime@java_stub)" version="-1" />
  <import index="21" modelUID="f:java_stub#jetbrains.mps.quotation.structure(jetbrains.mps.quotation.structure@java_stub)" version="-1" />
  <node type="jetbrains.mps.transformation.TLBase.structure.TemplateDeclaration" id="1196351886629">
    <property name="name" value="QuotationModel_modelToCreate" />
    <link role="applicableConcept" targetNodeId="1.1196350785113" resolveInfo="Quotation" />
    <node role="contentNode" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1196351886630">
      <property name="name" value="m" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1196351886631" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351886632">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196351886633">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1196351886634">
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196351886635">
              <link role="classifier" targetNodeId="11.~SModel" resolveInfo="SModel" />
            </node>
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1196351886636">
              <link role="variableDeclaration" targetNodeId="1196351886648" resolveInfo="o" />
              <node role="referenceMacro$link_attribute$variableDeclaration" type="jetbrains.mps.transformation.TLBase.structure.ReferenceMacro" id="1196351886637">
                <node role="referentFunction" type="jetbrains.mps.transformation.TLBase.structure.ReferenceMacro_GetReferent" id="1196351886638">
                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351886639">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1196351886640">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216932803533">
                        <node role="operand" type="jetbrains.mps.transformation.generationContext.structure.TemplateFunctionParameter_generationContext" id="1216932803535" />
                        <node role="operation" type="jetbrains.mps.transformation.generationContext.structure.GenerationContextOp_GetOutputByLabelAndInput" id="1216932803536">
                          <link role="label" targetNodeId="1215479323001" resolveInfo="parametersFromExpressions" />
                          <node role="inputNode" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227912331">
                            <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196351886644" />
                            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1202140943715">
                              <link role="link" targetNodeId="1.1196350785115" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="templateFragment$attribute" type="jetbrains.mps.transformation.TLBase.structure.TemplateFragment" id="1196351886647" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1196351886648">
        <property name="name" value="o" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196351886649">
          <link role="classifier" targetNodeId="2.~Object" resolveInfo="Object" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1196351886650" />
    </node>
  </node>
  <node type="jetbrains.mps.transformation.TLBase.structure.TemplateDeclaration" id="1196351886651">
    <property name="name" value="QuotationModel_RuntimeTypesModel" />
    <node role="contentNode" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933353579">
      <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1196351886653">
        <link role="baseMethodDeclaration" targetNodeId="18.~TypeChecker.getInstance():jetbrains.mps.helgins.inference.TypeChecker" resolveInfo="getInstance" />
        <link role="classConcept" targetNodeId="18.~TypeChecker" resolveInfo="TypeChecker" />
      </node>
      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933353580">
        <link role="baseMethodDeclaration" targetNodeId="18.~TypeChecker.getRuntimeTypesModel():jetbrains.mps.smodel.SModel" resolveInfo="getRuntimeTypesModel" />
      </node>
      <node role="templateFragment$attribute" type="jetbrains.mps.transformation.TLBase.structure.TemplateFragment" id="1196351886654" />
    </node>
  </node>
  <node type="jetbrains.mps.transformation.TLBase.structure.TemplateSwitch" id="1196351886655">
    <property name="name" value="QuotationModel_switch" />
    <node role="reductionMappingRule" type="jetbrains.mps.transformation.TLBase.structure.Reduction_MappingRule" id="1196351886656">
      <link role="applicableConcept" targetNodeId="1.1196350785113" resolveInfo="Quotation" />
      <node role="ruleConsequence" type="jetbrains.mps.transformation.TLBase.structure.TemplateDeclarationReference" id="1196351886657">
        <link role="template" targetNodeId="1196351886629" resolveInfo="QuotationModel_modelToCreate" />
      </node>
      <node role="conditionFunction" type="jetbrains.mps.transformation.TLBase.structure.BaseMappingRule_Condition" id="1196351886658">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351886659">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196351886660">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1196351886661">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1196351886662" />
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227841286">
                <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196351886664" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1196352299450">
                  <link role="link" targetNodeId="1.1196350785115" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="defaultConsequence" type="jetbrains.mps.transformation.TLBase.structure.TemplateDeclarationReference" id="1196351886666">
      <link role="template" targetNodeId="1196351886651" resolveInfo="QuotationModel_RuntimeTypesModel" />
    </node>
  </node>
  <node type="jetbrains.mps.transformation.TLBase.structure.TemplateSwitch" id="1196351886667">
    <property name="name" value="Quotation_switch" />
    <node role="defaultConsequence" type="jetbrains.mps.transformation.TLBase.structure.TemplateDeclarationReference" id="1196351886668">
      <link role="template" targetNodeId="1196351886726" resolveInfo="QuotedNode_to_statementList" />
    </node>
  </node>
  <node type="jetbrains.mps.transformation.TLBase.structure.TemplateDeclaration" id="1196351886669">
    <property name="name" value="Quotation_to_methodCall" />
    <link role="applicableConcept" targetNodeId="1.1196350785113" resolveInfo="Quotation" />
    <node role="contentNode" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933351591">
      <node role="operand" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1216933355819">
        <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1216933355821">
          <link role="baseMethodDeclaration" targetNodeId="1196351887792" resolveInfo="quotation_class" />
        </node>
      </node>
      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933351592">
        <link role="baseMethodDeclaration" targetNodeId="1196351887796" resolveInfo="createNode" />
        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1196351886673">
          <property name="value" value="4" />
          <node role="nodeMacro$attribute" type="jetbrains.mps.transformation.TLBase.structure.LoopMacro" id="1196351886674">
            <node role="sourceNodesQuery" type="jetbrains.mps.transformation.TLBase.structure.SourceSubstituteMacro_SourceNodesQuery" id="1196351886675">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351886676">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1196351886677">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196351886678">
                    <property name="name" value="result" />
                    <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196351886679">
                      <link role="classifier" targetNodeId="16.~List" resolveInfo="List" />
                      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196351886680">
                        <link role="classifier" targetNodeId="11.~SNode" resolveInfo="SNode" />
                      </node>
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1216933355816">
                      <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1216933355818">
                        <link role="baseMethodDeclaration" targetNodeId="16.~ArrayList.&lt;init&gt;()" resolveInfo="ArrayList" />
                        <node role="typeParameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1202140855524">
                          <link role="classifier" targetNodeId="11.~SNode" resolveInfo="SNode" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1196351886682">
                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1196351886683">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1196351886684" />
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227848935">
                      <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196351886686" />
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1202140842568">
                        <link role="link" targetNodeId="1.1196350785115" />
                      </node>
                    </node>
                  </node>
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351886688">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196351886689">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933351882">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351886691">
                          <link role="variableDeclaration" targetNodeId="1196351886678" resolveInfo="result" />
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933351883">
                          <link role="baseMethodDeclaration" targetNodeId="16.~List.add(java.lang.Object):boolean" resolveInfo="add" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227945962">
                            <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196351886693" />
                            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1202140848850">
                              <link role="link" targetNodeId="1.1196350785115" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1196351886695">
                  <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196351886696">
                    <property name="name" value="child" />
                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1196351886697" />
                  </node>
                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351886698">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1196351886699">
                      <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351886700">
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1196351886701">
                          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196351886702">
                            <property name="name" value="antiqExpression" />
                            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1196351886703">
                              <link role="concept" targetNodeId="12.1068431790191" resolveInfo="Expression" />
                            </node>
                            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227867345">
                              <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1196351886705">
                                <link role="concept" targetNodeId="1.1196350785110" resolveInfo="AbstractAntiquotation" />
                                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351886706">
                                  <link role="variableDeclaration" targetNodeId="1196351886696" resolveInfo="child" />
                                </node>
                              </node>
                              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1202140864822">
                                <link role="link" targetNodeId="1.1196350785111" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196351886708">
                          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933355233">
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351886710">
                              <link role="variableDeclaration" targetNodeId="1196351886678" resolveInfo="result" />
                            </node>
                            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933355234">
                              <link role="baseMethodDeclaration" targetNodeId="16.~List.add(java.lang.Object):boolean" resolveInfo="add" />
                              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351886711">
                                <link role="variableDeclaration" targetNodeId="1196351886702" resolveInfo="antiqExpression" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227831057">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351886713">
                          <link role="variableDeclaration" targetNodeId="1196351886696" resolveInfo="child" />
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1196351886714">
                          <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1196351886715">
                            <link role="conceptDeclaration" targetNodeId="1.1196350785110" resolveInfo="AbstractAntiquotation" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="iterable" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227839186">
                    <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196351886717" />
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetDescendantsOperation" id="1196351886718" />
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1196351886719">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351886720">
                    <link role="variableDeclaration" targetNodeId="1196351886678" resolveInfo="result" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="nodeMacro$attribute" type="jetbrains.mps.transformation.TLBase.structure.CopySrcNodeMacro" id="1196351886721">
            <node role="sourceNodeQuery" type="jetbrains.mps.transformation.TLBase.structure.SourceSubstituteMacro_SourceNodeQuery" id="1196351886722">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351886723">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196351886724">
                  <node role="expression" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196351886725" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="templateFragment$attribute" type="jetbrains.mps.transformation.TLBase.structure.TemplateFragment" id="1196351886672" />
    </node>
  </node>
  <node type="jetbrains.mps.transformation.TLBase.structure.TemplateDeclaration" id="1196351886726">
    <property name="name" value="QuotedNode_to_statementList" />
    <link role="applicableConcept" targetNodeId="14.1133920641626" resolveInfo="BaseConcept" />
    <node role="contentNode" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1196351886727">
      <property name="name" value="method" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1196351886728" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351886729">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1201868795872">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1201868795873">
            <property name="name" value="_node_" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1201868795874">
              <link role="classifier" targetNodeId="11.~SNode" resolveInfo="SNode" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1201868769774">
          <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201868769775">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1196351886741">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196351886742">
                <property name="name" value="parent" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196351886743">
                  <link role="classifier" targetNodeId="11.~SNode" resolveInfo="SNode" />
                </node>
              </node>
              <node role="nodeMacro$attribute" type="jetbrains.mps.transformation.TLBase.structure.IfMacro" id="1196351886744">
                <node role="conditionFunction" type="jetbrains.mps.transformation.TLBase.structure.IfMacro_Condition" id="1196351886745">
                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351886746">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196351886747">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1196351886748" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1196351886749">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196351886750">
                <property name="name" value="expression" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196351886751">
                  <link role="classifier" targetNodeId="11.~SNode" resolveInfo="SNode" />
                </node>
              </node>
              <node role="nodeMacro$attribute" type="jetbrains.mps.transformation.TLBase.structure.IfMacro" id="1196351886752">
                <node role="conditionFunction" type="jetbrains.mps.transformation.TLBase.structure.IfMacro_Condition" id="1196351886753">
                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351886754">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196351886755">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1196351886756" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1196351886757">
              <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351886758">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196351886759">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1196351886760">
                    <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201868915141">
                      <link role="variableDeclaration" targetNodeId="1201868795873" resolveInfo="_node_" />
                      <node role="referenceMacro$link_attribute$variableDeclaration" type="jetbrains.mps.transformation.TLBase.structure.ReferenceMacro" id="1201868926380">
                        <node role="referentFunction" type="jetbrains.mps.transformation.TLBase.structure.ReferenceMacro_GetReferent" id="1201868926381">
                          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201868926382">
                            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1201868991803">
                              <node role="expression" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1201868992820">
                                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216932803478">
                                  <node role="operand" type="jetbrains.mps.transformation.generationContext.structure.TemplateFunctionParameter_generationContext" id="1216932803480" />
                                  <node role="operation" type="jetbrains.mps.transformation.generationContext.structure.GenerationContextOp_GetOutputByLabelAndInput" id="1216932803481">
                                    <link role="label" targetNodeId="1215479326395" resolveInfo="nodeVariable" />
                                    <node role="inputNode" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1201869005532" />
                                  </node>
                                </node>
                                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1201868992828">
                                  <link role="concept" targetNodeId="12.1068581242863" resolveInfo="LocalVariableDeclaration" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="rValue" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1196351886762">
                      <link role="baseMethodDeclaration" targetNodeId="11.~SModelUtil_new.instantiateConceptDeclaration(java.lang.String,jetbrains.mps.smodel.SModel,jetbrains.mps.smodel.IScope,boolean):jetbrains.mps.smodel.SNode" resolveInfo="instantiateConceptDeclaration" />
                      <link role="classConcept" targetNodeId="11.~SModelUtil_new" resolveInfo="SModelUtil_new" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1196351886763">
                        <property name="value" value="conceptFqName" />
                        <node role="propertyMacro$property_attribute$value" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro" id="1196351886764">
                          <node role="propertyValueFunction" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro_GetPropertyValue" id="1196351886765">
                            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351886766">
                              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196351886767">
                                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933354601">
                                  <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196351886769" />
                                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933354602">
                                    <link role="baseMethodDeclaration" targetNodeId="11.~SNode.getConceptFqName():java.lang.String" resolveInfo="getConceptFqName" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933355337">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1196351886771">
                          <link role="classConcept" targetNodeId="18.~TypeChecker" resolveInfo="TypeChecker" />
                          <link role="baseMethodDeclaration" targetNodeId="18.~TypeChecker.getInstance():jetbrains.mps.helgins.inference.TypeChecker" resolveInfo="getInstance" />
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933355338">
                          <link role="baseMethodDeclaration" targetNodeId="18.~TypeChecker.getRuntimeTypesModel():jetbrains.mps.smodel.SModel" resolveInfo="getRuntimeTypesModel" />
                        </node>
                        <node role="nodeMacro$attribute" type="jetbrains.mps.transformation.TLBase.structure.SwitchMacro" id="1196351886772">
                          <link role="templateSwitch" targetNodeId="1196351886655" resolveInfo="QuotationModel_switch" />
                          <node role="sourceNodeQuery" type="jetbrains.mps.transformation.TLBase.structure.SourceSubstituteMacro_SourceNodeQuery" id="1196351886773">
                            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351886774">
                              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196351886775">
                                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227908548">
                                  <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196351886777" />
                                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1196351886778">
                                    <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1196351886779">
                                      <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1216933355781">
                                        <link role="conceptDeclaration" targetNodeId="1.1196350785113" resolveInfo="Quotation" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1196351886780">
                        <link role="classConcept" targetNodeId="13.~GlobalScope" resolveInfo="GlobalScope" />
                        <link role="baseMethodDeclaration" targetNodeId="13.~GlobalScope.getInstance():jetbrains.mps.project.GlobalScope" resolveInfo="getInstance" />
                      </node>
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1196351886781" />
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1201868524251">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1201868524252">
                    <property name="name" value="_node1_" />
                    <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1201868524253">
                      <link role="classifier" targetNodeId="11.~SNode" resolveInfo="SNode" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201868929196">
                      <link role="variableDeclaration" targetNodeId="1201868795873" resolveInfo="_node_" />
                      <node role="referenceMacro$link_attribute$variableDeclaration" type="jetbrains.mps.transformation.TLBase.structure.ReferenceMacro" id="1201870201454">
                        <node role="referentFunction" type="jetbrains.mps.transformation.TLBase.structure.ReferenceMacro_GetReferent" id="1201870201455">
                          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201870201456">
                            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1201870205795">
                              <node role="expression" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1201870205796">
                                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216932803474">
                                  <node role="operand" type="jetbrains.mps.transformation.generationContext.structure.TemplateFunctionParameter_generationContext" id="1216932803476" />
                                  <node role="operation" type="jetbrains.mps.transformation.generationContext.structure.GenerationContextOp_GetOutputByLabelAndInput" id="1216932803477">
                                    <link role="label" targetNodeId="1215479326395" resolveInfo="nodeVariable" />
                                    <node role="inputNode" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1201870205798" />
                                  </node>
                                </node>
                                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1201870205801">
                                  <link role="concept" targetNodeId="12.1068581242863" resolveInfo="LocalVariableDeclaration" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="propertyMacro$property_attribute$name" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro" id="1201868689727">
                      <node role="propertyValueFunction" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro_GetPropertyValue" id="1201868689728">
                        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201868689729">
                          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1203100269870">
                            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1218070397405">
                              <node role="operand" type="jetbrains.mps.transformation.generationContext.structure.TemplateFunctionParameter_generationContext" id="1218070397407" />
                              <node role="operation" type="jetbrains.mps.transformation.generationContext.structure.GenerationContextOp_CreateUniqueName" id="1218070397408">
                                <node role="baseName" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1203100269872">
                                  <property name="value" value="quotedNode1_" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196351886782">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933353545">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201868547350">
                      <link role="variableDeclaration" targetNodeId="1201868524252" resolveInfo="_node1_" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933353546">
                      <link role="baseMethodDeclaration" targetNodeId="11.~SNode.setProperty(java.lang.String,java.lang.String):void" resolveInfo="setProperty" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1196351886785">
                        <property name="value" value="propertyName" />
                        <node role="propertyMacro$property_attribute$value" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro" id="1196351886786">
                          <node role="propertyValueFunction" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro_GetPropertyValue" id="1196351886787">
                            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351886788">
                              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196351886789">
                                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933355286">
                                  <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196351886791" />
                                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933355287">
                                    <link role="baseMethodDeclaration" targetNodeId="11.~SNode.getProperty(java.lang.String):java.lang.String" resolveInfo="getProperty" />
                                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1196351886792">
                                      <property name="value" value="propertyName" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1196351886793">
                        <property name="value" value="propertyValue" />
                        <node role="propertyMacro$property_attribute$value" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro" id="1196351886794">
                          <node role="propertyValueFunction" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro_GetPropertyValue" id="1196351886795">
                            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351886796">
                              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196351886797">
                                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933353772">
                                  <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196351886799" />
                                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933353773">
                                    <link role="baseMethodDeclaration" targetNodeId="11.~SNode.getProperty(java.lang.String):java.lang.String" resolveInfo="getProperty" />
                                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1196351886800">
                                      <property name="value" value="propertyValue" />
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
                  <node role="nodeMacro$attribute" type="jetbrains.mps.transformation.TLBase.structure.LoopMacro" id="1196351886801">
                    <node role="sourceNodesQuery" type="jetbrains.mps.transformation.TLBase.structure.SourceSubstituteMacro_SourceNodesQuery" id="1196351886802">
                      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351886803">
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1196351886804">
                          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196351886805">
                            <property name="name" value="model" />
                            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196351886806">
                              <link role="classifier" targetNodeId="11.~SModel" resolveInfo="SModel" />
                            </node>
                            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1218220894259">
                              <node role="operand" type="jetbrains.mps.transformation.generationContext.structure.TemplateFunctionParameter_generationContext" id="1218220894277" />
                              <node role="operation" type="jetbrains.mps.transformation.generationContext.structure.GenerationContextOp_GetOutputModel" id="1218220894278" />
                            </node>
                          </node>
                        </node>
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1196351886809">
                          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196351886810">
                            <property name="name" value="result" />
                            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196351886811">
                              <link role="classifier" targetNodeId="16.~List" resolveInfo="List" />
                              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196351886812">
                                <link role="classifier" targetNodeId="11.~SNode" resolveInfo="SNode" />
                              </node>
                            </node>
                            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1216933355872">
                              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1216933355874">
                                <link role="baseMethodDeclaration" targetNodeId="16.~ArrayList.&lt;init&gt;()" resolveInfo="ArrayList" />
                                <node role="typeParameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196871632374">
                                  <link role="classifier" targetNodeId="11.~SNode" resolveInfo="SNode" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1196351886814">
                          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933353841">
                            <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SemanticDowncastExpression" id="1196871643578">
                              <node role="leftExpression" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196351886816" />
                            </node>
                            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933353842">
                              <link role="baseMethodDeclaration" targetNodeId="11.~SNode.getPropertyNames():java.util.Set" resolveInfo="getPropertyNames" />
                            </node>
                          </node>
                          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196351886817">
                            <property name="name" value="property" />
                            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196351886818">
                              <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
                            </node>
                          </node>
                          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351886819">
                            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1196871767655">
                              <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1196871767656">
                                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1196871767657" />
                                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1196871767658">
                                  <link role="classConcept" targetNodeId="21.~PropertyAntiquotation_AnnotationLink" resolveInfo="PropertyAntiquotation_AnnotationLink" />
                                  <link role="baseMethodDeclaration" targetNodeId="21.~PropertyAntiquotation_AnnotationLink.getPropertyAntiquotation(jetbrains.mps.core.structure.BaseConcept,java.lang.String):jetbrains.mps.quotation.structure.PropertyAntiquotation" resolveInfo="getPropertyAntiquotation" />
                                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1196871767659">
                                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204672721319">
                                      <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196871767661" />
                                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAdapterOperation" id="1196871767662" />
                                    </node>
                                    <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196871767663">
                                      <link role="classifier" targetNodeId="7.~BaseConcept" resolveInfo="BaseConcept" />
                                    </node>
                                  </node>
                                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196871796825">
                                    <link role="variableDeclaration" targetNodeId="1196351886817" resolveInfo="property" />
                                  </node>
                                </node>
                              </node>
                              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196871767666">
                                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ContinueStatement" id="1196871767667" />
                              </node>
                            </node>
                            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1196351886820">
                              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196351886821">
                                <property name="name" value="propertyNode" />
                                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196351886822">
                                  <link role="classifier" targetNodeId="11.~SNode" resolveInfo="SNode" />
                                </node>
                                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933351509">
                                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1196351886824">
                                    <link role="baseMethodDeclaration" targetNodeId="7.~BaseConcept.newInstance(jetbrains.mps.smodel.SModel):jetbrains.mps.core.structure.BaseConcept" resolveInfo="newInstance" />
                                    <link role="classConcept" targetNodeId="7.~BaseConcept" resolveInfo="BaseConcept" />
                                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351886825">
                                      <link role="variableDeclaration" targetNodeId="1196351886805" resolveInfo="model" />
                                    </node>
                                  </node>
                                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933351510">
                                    <link role="baseMethodDeclaration" targetNodeId="11.~BaseAdapter.getNode():jetbrains.mps.smodel.SNode" resolveInfo="getNode" />
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196351886826">
                              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933355370">
                                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351886828">
                                  <link role="variableDeclaration" targetNodeId="1196351886821" resolveInfo="propertyNode" />
                                </node>
                                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933355371">
                                  <link role="baseMethodDeclaration" targetNodeId="11.~SNode.setProperty(java.lang.String,java.lang.String):void" resolveInfo="setProperty" />
                                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1196351886829">
                                    <property name="value" value="propertyName" />
                                  </node>
                                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351886830">
                                    <link role="variableDeclaration" targetNodeId="1196351886817" resolveInfo="property" />
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196351886831">
                              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933350766">
                                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351886833">
                                  <link role="variableDeclaration" targetNodeId="1196351886821" resolveInfo="propertyNode" />
                                </node>
                                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933350767">
                                  <link role="baseMethodDeclaration" targetNodeId="11.~SNode.setProperty(java.lang.String,java.lang.String):void" resolveInfo="setProperty" />
                                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1196351886834">
                                    <property name="value" value="propertyValue" />
                                  </node>
                                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933354813">
                                    <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SemanticDowncastExpression" id="1196871650753">
                                      <node role="leftExpression" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196351886836" />
                                    </node>
                                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933354814">
                                      <link role="baseMethodDeclaration" targetNodeId="11.~SNode.getProperty(java.lang.String):java.lang.String" resolveInfo="getProperty" />
                                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351886837">
                                        <link role="variableDeclaration" targetNodeId="1196351886817" resolveInfo="property" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196351886838">
                              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933350932">
                                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351886840">
                                  <link role="variableDeclaration" targetNodeId="1196351886810" resolveInfo="result" />
                                </node>
                                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933350933">
                                  <link role="baseMethodDeclaration" targetNodeId="16.~List.add(java.lang.Object):boolean" resolveInfo="add" />
                                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351886841">
                                    <link role="variableDeclaration" targetNodeId="1196351886821" resolveInfo="propertyNode" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1196351886842">
                          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351886843">
                            <link role="variableDeclaration" targetNodeId="1196351886810" resolveInfo="result" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196871487513">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933352224">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201868549241">
                      <link role="variableDeclaration" targetNodeId="1201868524252" resolveInfo="_node1_" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933352225">
                      <link role="baseMethodDeclaration" targetNodeId="11.~SNode.setProperty(java.lang.String,java.lang.String):void" resolveInfo="setProperty" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1196871487516">
                        <property name="value" value="propertyName" />
                        <node role="propertyMacro$property_attribute$value" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro" id="1196871487517">
                          <node role="propertyValueFunction" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro_GetPropertyValue" id="1196871487518">
                            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196871487519">
                              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196875002857">
                                <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1196875002858">
                                  <link role="classConcept" targetNodeId="11.~AttributesRolesUtil" resolveInfo="AttributesRolesUtil" />
                                  <link role="baseMethodDeclaration" targetNodeId="11.~AttributesRolesUtil.getPropertyNameFromPropertyAttributeRole(java.lang.String):java.lang.String" resolveInfo="getPropertyNameFromPropertyAttributeRole" />
                                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933355319">
                                    <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196875002860" />
                                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933355320">
                                      <link role="baseMethodDeclaration" targetNodeId="11.~SNode.getRole_():java.lang.String" resolveInfo="getRole_" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1197034040796">
                        <node role="expression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1197034040797">
                          <link role="variableDeclaration" targetNodeId="1196351887553" resolveInfo="expr" />
                          <node role="referenceMacro$link_attribute$variableDeclaration" type="jetbrains.mps.transformation.TLBase.structure.ReferenceMacro" id="1197034040798">
                            <node role="referentFunction" type="jetbrains.mps.transformation.TLBase.structure.ReferenceMacro_GetReferent" id="1197034040799">
                              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197034040800">
                                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1197034040801">
                                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1197034040802">
                                    <property name="name" value="quotation" />
                                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1197034040803">
                                      <link role="concept" targetNodeId="1.1196350785113" resolveInfo="Quotation" />
                                    </node>
                                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227867162">
                                      <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1197034040805" />
                                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1197034040806">
                                        <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1197034040807">
                                          <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1216933355782">
                                            <link role="conceptDeclaration" targetNodeId="1.1196350785113" resolveInfo="Quotation" />
                                          </node>
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                </node>
                                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1197034040808">
                                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1197034040809">
                                    <property name="name" value="antiquotation" />
                                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1197034040810">
                                      <link role="concept" targetNodeId="1.1196866233735" resolveInfo="PropertyAntiquotation" />
                                    </node>
                                    <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1197034040811">
                                      <link role="concept" targetNodeId="1.1196866233735" resolveInfo="PropertyAntiquotation" />
                                      <node role="leftExpression" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1197034040812" />
                                    </node>
                                  </node>
                                </node>
                                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1197034040813">
                                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197034040814">
                                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1197034040815">
                                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1197034040816" />
                                    </node>
                                  </node>
                                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1197034040817">
                                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1197034040818">
                                      <link role="variableDeclaration" targetNodeId="1197034040809" resolveInfo="antiquotation" />
                                    </node>
                                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1197034040819" />
                                  </node>
                                </node>
                                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1197034040820">
                                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216932803529">
                                    <node role="operand" type="jetbrains.mps.transformation.generationContext.structure.TemplateFunctionParameter_generationContext" id="1216932803531" />
                                    <node role="operation" type="jetbrains.mps.transformation.generationContext.structure.GenerationContextOp_GetOutputByLabelAndInput" id="1216932803532">
                                      <link role="label" targetNodeId="1215479323001" resolveInfo="parametersFromExpressions" />
                                      <node role="inputNode" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227905597">
                                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1197034040823">
                                          <link role="variableDeclaration" targetNodeId="1197034040809" resolveInfo="antiquotation" />
                                        </node>
                                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1202141021290">
                                          <link role="link" targetNodeId="1.1196350785111" />
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1197034047703">
                          <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="nodeMacro$attribute" type="jetbrains.mps.transformation.TLBase.structure.LoopMacro" id="1196871487532">
                    <node role="sourceNodesQuery" type="jetbrains.mps.transformation.TLBase.structure.SourceSubstituteMacro_SourceNodesQuery" id="1196871487533">
                      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196871487534">
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1196871487535">
                          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196871487536">
                            <property name="name" value="model" />
                            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196871487537">
                              <link role="classifier" targetNodeId="11.~SModel" resolveInfo="SModel" />
                            </node>
                            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1218220899897">
                              <node role="operand" type="jetbrains.mps.transformation.generationContext.structure.TemplateFunctionParameter_generationContext" id="1218220899899" />
                              <node role="operation" type="jetbrains.mps.transformation.generationContext.structure.GenerationContextOp_GetOutputModel" id="1218220899900" />
                            </node>
                          </node>
                        </node>
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1196871487540">
                          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196871487541">
                            <property name="name" value="result" />
                            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196871487542">
                              <link role="classifier" targetNodeId="16.~List" resolveInfo="List" />
                              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196871487543">
                                <link role="classifier" targetNodeId="11.~SNode" resolveInfo="SNode" />
                              </node>
                            </node>
                            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1216933355838">
                              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1216933355855">
                                <link role="baseMethodDeclaration" targetNodeId="16.~ArrayList.&lt;init&gt;()" resolveInfo="ArrayList" />
                                <node role="typeParameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196871712867">
                                  <link role="classifier" targetNodeId="11.~SNode" resolveInfo="SNode" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1196871487545">
                          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933351642">
                            <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SemanticDowncastExpression" id="1196871717649">
                              <node role="leftExpression" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196871487547" />
                            </node>
                            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933351643">
                              <link role="baseMethodDeclaration" targetNodeId="11.~SNode.getPropertyNames():java.util.Set" resolveInfo="getPropertyNames" />
                            </node>
                          </node>
                          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196871487548">
                            <property name="name" value="property" />
                            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196871487549">
                              <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
                            </node>
                          </node>
                          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196871487550">
                            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1196871927205">
                              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196871927206">
                                <property name="name" value="attribute" />
                                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196871927207">
                                  <link role="classifier" targetNodeId="11.~BaseAdapter" resolveInfo="BaseAdapter" />
                                </node>
                                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1196871927208">
                                  <link role="classConcept" targetNodeId="21.~PropertyAntiquotation_AnnotationLink" resolveInfo="PropertyAntiquotation_AnnotationLink" />
                                  <link role="baseMethodDeclaration" targetNodeId="21.~PropertyAntiquotation_AnnotationLink.getPropertyAntiquotation(jetbrains.mps.core.structure.BaseConcept,java.lang.String):jetbrains.mps.quotation.structure.PropertyAntiquotation" resolveInfo="getPropertyAntiquotation" />
                                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1196871927209">
                                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204672721299">
                                      <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196871927211" />
                                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAdapterOperation" id="1196871927212" />
                                    </node>
                                    <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196871927213">
                                      <link role="classifier" targetNodeId="7.~BaseConcept" resolveInfo="BaseConcept" />
                                    </node>
                                  </node>
                                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196871946694">
                                    <link role="variableDeclaration" targetNodeId="1196871487548" resolveInfo="property" />
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1196871927215">
                              <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1196871927216">
                                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1196871927217" />
                                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196871927218">
                                  <link role="variableDeclaration" targetNodeId="1196871927206" resolveInfo="attribute" />
                                </node>
                              </node>
                              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196871927219">
                                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196871927220">
                                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933350914">
                                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196871927222">
                                      <link role="variableDeclaration" targetNodeId="1196871487541" resolveInfo="result" />
                                    </node>
                                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933350915">
                                      <link role="baseMethodDeclaration" targetNodeId="16.~List.add(java.lang.Object):boolean" resolveInfo="add" />
                                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933351425">
                                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196871927224">
                                          <link role="variableDeclaration" targetNodeId="1196871927206" resolveInfo="attribute" />
                                        </node>
                                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933351426">
                                          <link role="baseMethodDeclaration" targetNodeId="11.~BaseAdapter.getNode():jetbrains.mps.smodel.SNode" resolveInfo="getNode" />
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1196871487573">
                          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196871487574">
                            <link role="variableDeclaration" targetNodeId="1196871487541" resolveInfo="result" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196351886844">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933353892">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201868551258">
                      <link role="variableDeclaration" targetNodeId="1201868524252" resolveInfo="_node1_" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933353893">
                      <link role="baseMethodDeclaration" targetNodeId="11.~SNode.addReference(jetbrains.mps.smodel.SReference):void" resolveInfo="addReference" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1196351886847">
                        <link role="classConcept" targetNodeId="11.~SReference" resolveInfo="SReference" />
                        <link role="baseMethodDeclaration" targetNodeId="11.~SReference.create(java.lang.String,jetbrains.mps.smodel.SNode,jetbrains.mps.smodel.SModelUID,jetbrains.mps.smodel.SNodeId):jetbrains.mps.smodel.SReference" resolveInfo="create" />
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1196351886848">
                          <property name="value" value="role" />
                          <node role="propertyMacro$property_attribute$value" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro" id="1196351886849">
                            <node role="propertyValueFunction" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro_GetPropertyValue" id="1196351886850">
                              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351886851">
                                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196351886852">
                                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933354271">
                                    <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196351886854" />
                                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933354272">
                                      <link role="baseMethodDeclaration" targetNodeId="11.~SNode.getProperty(java.lang.String):java.lang.String" resolveInfo="getProperty" />
                                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1196351886855">
                                        <property name="value" value="role" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201868558276">
                          <link role="variableDeclaration" targetNodeId="1201868524252" resolveInfo="_node1_" />
                        </node>
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1196351886857">
                          <link role="baseMethodDeclaration" targetNodeId="11.~SModelUID.fromString(java.lang.String):jetbrains.mps.smodel.SModelUID" resolveInfo="fromString" />
                          <link role="classConcept" targetNodeId="11.~SModelUID" resolveInfo="SModelUID" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1196351886858">
                            <property name="value" value="targetModel" />
                            <node role="propertyMacro$property_attribute$value" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro" id="1196351886859">
                              <node role="propertyValueFunction" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro_GetPropertyValue" id="1196351886860">
                                <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351886861">
                                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196351886862">
                                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933352015">
                                      <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196351886864" />
                                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933352016">
                                        <link role="baseMethodDeclaration" targetNodeId="11.~SNode.getProperty(java.lang.String):java.lang.String" resolveInfo="getProperty" />
                                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1196351886865">
                                          <property name="value" value="targetModel" />
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1196351886866">
                          <link role="classConcept" targetNodeId="11.~SNodeId" resolveInfo="SNodeId" />
                          <link role="baseMethodDeclaration" targetNodeId="11.~SNodeId.fromString(java.lang.String):jetbrains.mps.smodel.SNodeId" resolveInfo="fromString" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1196351886867">
                            <property name="value" value="targetNodeId" />
                            <node role="propertyMacro$property_attribute$value" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro" id="1196351886868">
                              <node role="propertyValueFunction" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro_GetPropertyValue" id="1196351886869">
                                <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351886870">
                                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196351886871">
                                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933355180">
                                      <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196351886873" />
                                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933355181">
                                        <link role="baseMethodDeclaration" targetNodeId="11.~SNode.getProperty(java.lang.String):java.lang.String" resolveInfo="getProperty" />
                                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1196351886874">
                                          <property name="value" value="targetNodeId" />
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
                    </node>
                  </node>
                  <node role="nodeMacro$attribute" type="jetbrains.mps.transformation.TLBase.structure.LoopMacro" id="1196351886875">
                    <node role="sourceNodesQuery" type="jetbrains.mps.transformation.TLBase.structure.SourceSubstituteMacro_SourceNodesQuery" id="1196351886876">
                      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351886877">
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1196351886878">
                          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196351886879">
                            <property name="name" value="model" />
                            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196351886880">
                              <link role="classifier" targetNodeId="11.~SModel" resolveInfo="SModel" />
                            </node>
                            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1218220899874">
                              <node role="operand" type="jetbrains.mps.transformation.generationContext.structure.TemplateFunctionParameter_generationContext" id="1218220899876" />
                              <node role="operation" type="jetbrains.mps.transformation.generationContext.structure.GenerationContextOp_GetOutputModel" id="1218220899877" />
                            </node>
                          </node>
                        </node>
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1196351886883">
                          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196351886884">
                            <property name="name" value="result" />
                            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196351886885">
                              <link role="classifier" targetNodeId="16.~List" resolveInfo="List" />
                              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196351886886">
                                <link role="classifier" targetNodeId="11.~SNode" resolveInfo="SNode" />
                              </node>
                            </node>
                            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1216933355891">
                              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1216933355893">
                                <link role="baseMethodDeclaration" targetNodeId="16.~ArrayList.&lt;init&gt;()" resolveInfo="ArrayList" />
                                <node role="typeParameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196355017607">
                                  <link role="classifier" targetNodeId="11.~SNode" resolveInfo="SNode" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1196351886888">
                          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933351933">
                            <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SemanticDowncastExpression" id="1201801080007">
                              <node role="leftExpression" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196351886890" />
                            </node>
                            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933351934">
                              <link role="baseMethodDeclaration" targetNodeId="11.~SNode.getReferences():java.util.List" resolveInfo="getReferences" />
                            </node>
                          </node>
                          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196351886891">
                            <property name="name" value="reference" />
                            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196351886892">
                              <link role="classifier" targetNodeId="11.~SReference" resolveInfo="SReference" />
                            </node>
                          </node>
                          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351886893">
                            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1196351886894">
                              <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1196351886895">
                                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1196351886896" />
                                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1196351886897">
                                  <link role="classConcept" targetNodeId="21.~ReferenceAntiquotation_AnnotationLink" resolveInfo="ReferenceAntiquotation_AnnotationLink" />
                                  <link role="baseMethodDeclaration" targetNodeId="21.~ReferenceAntiquotation_AnnotationLink.getReferenceAntiquotation(jetbrains.mps.core.structure.BaseConcept,java.lang.String):jetbrains.mps.quotation.structure.ReferenceAntiquotation" resolveInfo="getReferenceAntiquotation" />
                                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1196351886898">
                                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204672721749">
                                      <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196351886900" />
                                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAdapterOperation" id="1196351886901" />
                                    </node>
                                    <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196351886902">
                                      <link role="classifier" targetNodeId="7.~BaseConcept" resolveInfo="BaseConcept" />
                                    </node>
                                  </node>
                                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933354988">
                                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351886904">
                                      <link role="variableDeclaration" targetNodeId="1196351886891" resolveInfo="reference" />
                                    </node>
                                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933354989">
                                      <link role="baseMethodDeclaration" targetNodeId="11.~SReference.getRole():java.lang.String" resolveInfo="getRole" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351886905">
                                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ContinueStatement" id="1196351886906" />
                              </node>
                            </node>
                            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1201801229677">
                              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1201801229678">
                                <property name="name" value="targetNode" />
                                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1201801265846" />
                                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933352400">
                                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201801229681">
                                    <link role="variableDeclaration" targetNodeId="1196351886891" resolveInfo="reference" />
                                  </node>
                                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933352401">
                                    <link role="baseMethodDeclaration" targetNodeId="11.~SReference.getTargetNode():jetbrains.mps.smodel.SNode" resolveInfo="getTargetNode" />
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1201801247277">
                              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201801247278">
                                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ContinueStatement" id="1201801327612" />
                              </node>
                              <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1201801293024">
                                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227903037">
                                  <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1201801307621" />
                                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1201801312016">
                                    <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1201801314485">
                                      <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1216933355780">
                                        <link role="conceptDeclaration" targetNodeId="1.1196350785113" resolveInfo="Quotation" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227943754">
                                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201801251797">
                                    <link role="variableDeclaration" targetNodeId="1201801229678" resolveInfo="targetNode" />
                                  </node>
                                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1201801274006">
                                    <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1201801277304">
                                      <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1216933355777">
                                        <link role="conceptDeclaration" targetNodeId="1.1196350785113" resolveInfo="Quotation" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1196351886907">
                              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196351886908">
                                <property name="name" value="referenceNode" />
                                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196351886909">
                                  <link role="classifier" targetNodeId="11.~SNode" resolveInfo="SNode" />
                                </node>
                                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933354093">
                                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1196351886911">
                                    <link role="classConcept" targetNodeId="7.~BaseConcept" resolveInfo="BaseConcept" />
                                    <link role="baseMethodDeclaration" targetNodeId="7.~BaseConcept.newInstance(jetbrains.mps.smodel.SModel):jetbrains.mps.core.structure.BaseConcept" resolveInfo="newInstance" />
                                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351886912">
                                      <link role="variableDeclaration" targetNodeId="1196351886879" resolveInfo="model" />
                                    </node>
                                  </node>
                                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933354094">
                                    <link role="baseMethodDeclaration" targetNodeId="11.~BaseAdapter.getNode():jetbrains.mps.smodel.SNode" resolveInfo="getNode" />
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196351886913">
                              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933352867">
                                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351886915">
                                  <link role="variableDeclaration" targetNodeId="1196351886908" resolveInfo="referenceNode" />
                                </node>
                                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933352868">
                                  <link role="baseMethodDeclaration" targetNodeId="11.~SNode.setProperty(java.lang.String,java.lang.String):void" resolveInfo="setProperty" />
                                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1196351886916">
                                    <property name="value" value="targetModel" />
                                  </node>
                                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933351423">
                                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933354568">
                                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351886919">
                                        <link role="variableDeclaration" targetNodeId="1196351886891" resolveInfo="reference" />
                                      </node>
                                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933354569">
                                        <link role="baseMethodDeclaration" targetNodeId="11.~SReference.getTargetModelUID():jetbrains.mps.smodel.SModelUID" resolveInfo="getTargetModelUID" />
                                      </node>
                                    </node>
                                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933351424">
                                      <link role="baseMethodDeclaration" targetNodeId="11.~SModelUID.toString():java.lang.String" resolveInfo="toString" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196351886920">
                              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933354462">
                                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351886922">
                                  <link role="variableDeclaration" targetNodeId="1196351886908" resolveInfo="referenceNode" />
                                </node>
                                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933354463">
                                  <link role="baseMethodDeclaration" targetNodeId="11.~SNode.setProperty(java.lang.String,java.lang.String):void" resolveInfo="setProperty" />
                                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1196351886923">
                                    <property name="value" value="role" />
                                  </node>
                                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933351542">
                                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351886925">
                                      <link role="variableDeclaration" targetNodeId="1196351886891" resolveInfo="reference" />
                                    </node>
                                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933351543">
                                      <link role="baseMethodDeclaration" targetNodeId="11.~SReference.getRole():java.lang.String" resolveInfo="getRole" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196351886926">
                              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933351100">
                                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351886928">
                                  <link role="variableDeclaration" targetNodeId="1196351886908" resolveInfo="referenceNode" />
                                </node>
                                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933351101">
                                  <link role="baseMethodDeclaration" targetNodeId="11.~SNode.setProperty(java.lang.String,java.lang.String):void" resolveInfo="setProperty" />
                                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1196351886929">
                                    <property name="value" value="targetNodeId" />
                                  </node>
                                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933352674">
                                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933353823">
                                      <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SemanticDowncastExpression" id="1201801336410">
                                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201801229682">
                                          <link role="variableDeclaration" targetNodeId="1201801229678" resolveInfo="targetNode" />
                                        </node>
                                      </node>
                                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933353824">
                                        <link role="baseMethodDeclaration" targetNodeId="11.~SNode.getSNodeId():jetbrains.mps.smodel.SNodeId" resolveInfo="getSNodeId" />
                                      </node>
                                    </node>
                                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933352675">
                                      <link role="baseMethodDeclaration" targetNodeId="2.~Object.toString():java.lang.String" resolveInfo="toString" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196351886934">
                              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933354025">
                                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351886936">
                                  <link role="variableDeclaration" targetNodeId="1196351886884" resolveInfo="result" />
                                </node>
                                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933354026">
                                  <link role="baseMethodDeclaration" targetNodeId="16.~List.add(java.lang.Object):boolean" resolveInfo="add" />
                                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351886937">
                                    <link role="variableDeclaration" targetNodeId="1196351886908" resolveInfo="referenceNode" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1196351886938">
                          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351886939">
                            <link role="variableDeclaration" targetNodeId="1196351886884" resolveInfo="result" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196351886940">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933354795">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201868555760">
                      <link role="variableDeclaration" targetNodeId="1201868524252" resolveInfo="_node1_" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933354796">
                      <link role="baseMethodDeclaration" targetNodeId="11.~SNode.setReferent(java.lang.String,jetbrains.mps.smodel.SNode):jetbrains.mps.smodel.SReference" resolveInfo="setReferent" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1196351886943">
                        <property name="value" value="role" />
                        <node role="propertyMacro$property_attribute$value" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro" id="1196351886944">
                          <node role="propertyValueFunction" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro_GetPropertyValue" id="1196351886945">
                            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351886946">
                              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196351886947">
                                <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1196351886948">
                                  <link role="baseMethodDeclaration" targetNodeId="11.~AttributesRolesUtil.getLinkRoleFromLinkAttributeRole(java.lang.String):java.lang.String" resolveInfo="getLinkRoleFromLinkAttributeRole" />
                                  <link role="classConcept" targetNodeId="11.~AttributesRolesUtil" resolveInfo="AttributesRolesUtil" />
                                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933353528">
                                    <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196351886950" />
                                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933353529">
                                      <link role="baseMethodDeclaration" targetNodeId="11.~SNode.getRole_():java.lang.String" resolveInfo="getRole_" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1196351886951">
                        <node role="expression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1196351886952">
                          <link role="variableDeclaration" targetNodeId="1196351887553" resolveInfo="expr" />
                          <node role="referenceMacro$link_attribute$variableDeclaration" type="jetbrains.mps.transformation.TLBase.structure.ReferenceMacro" id="1196351886953">
                            <node role="referentFunction" type="jetbrains.mps.transformation.TLBase.structure.ReferenceMacro_GetReferent" id="1196351886954">
                              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351886955">
                                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1196351886956">
                                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196351886957">
                                    <property name="name" value="quotation" />
                                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1196351886958">
                                      <link role="concept" targetNodeId="1.1196350785113" resolveInfo="Quotation" />
                                    </node>
                                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227820616">
                                      <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196351886960" />
                                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1196351886961">
                                        <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1196351886962">
                                          <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1216933355754">
                                            <link role="conceptDeclaration" targetNodeId="1.1196350785113" resolveInfo="Quotation" />
                                          </node>
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                </node>
                                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1196351886963">
                                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196351886964">
                                    <property name="name" value="antiquotation" />
                                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1196351886965">
                                      <link role="concept" targetNodeId="1.1196350785117" resolveInfo="ReferenceAntiquotation" />
                                    </node>
                                    <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1196351886966">
                                      <link role="concept" targetNodeId="1.1196350785117" resolveInfo="ReferenceAntiquotation" />
                                      <node role="leftExpression" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196351886967" />
                                    </node>
                                  </node>
                                </node>
                                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1196351886968">
                                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1196351886969">
                                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1196351886970" />
                                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351886971">
                                      <link role="variableDeclaration" targetNodeId="1196351886964" resolveInfo="antiquotation" />
                                    </node>
                                  </node>
                                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351886972">
                                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1196351886973">
                                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1196351886974" />
                                    </node>
                                  </node>
                                </node>
                                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1196351886975">
                                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216932803505">
                                    <node role="operand" type="jetbrains.mps.transformation.generationContext.structure.TemplateFunctionParameter_generationContext" id="1216932803507" />
                                    <node role="operation" type="jetbrains.mps.transformation.generationContext.structure.GenerationContextOp_GetOutputByLabelAndInput" id="1216932803508">
                                      <link role="label" targetNodeId="1215479323001" resolveInfo="parametersFromExpressions" />
                                      <node role="inputNode" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227905313">
                                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351886979">
                                          <link role="variableDeclaration" targetNodeId="1196351886964" resolveInfo="antiquotation" />
                                        </node>
                                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1202141111176">
                                          <link role="link" targetNodeId="1.1196350785111" />
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196351886982">
                          <link role="classifier" targetNodeId="11.~SNode" resolveInfo="SNode" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="nodeMacro$attribute" type="jetbrains.mps.transformation.TLBase.structure.LoopMacro" id="1196351886983">
                    <node role="sourceNodesQuery" type="jetbrains.mps.transformation.TLBase.structure.SourceSubstituteMacro_SourceNodesQuery" id="1196351886984">
                      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351886985">
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1196351886986">
                          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196351886987">
                            <property name="name" value="result" />
                            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196351886988">
                              <link role="classifier" targetNodeId="16.~List" resolveInfo="List" />
                              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196351886989">
                                <link role="classifier" targetNodeId="11.~SNode" resolveInfo="SNode" />
                              </node>
                            </node>
                            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1216933355943">
                              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1216933355945">
                                <link role="baseMethodDeclaration" targetNodeId="16.~ArrayList.&lt;init&gt;()" resolveInfo="ArrayList" />
                                <node role="typeParameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196354960684">
                                  <link role="classifier" targetNodeId="11.~SNode" resolveInfo="SNode" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1196351886991">
                          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933352640">
                            <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196351886993" />
                            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933352641">
                              <link role="baseMethodDeclaration" targetNodeId="11.~SNode.getReferenceRoles():java.util.Set" resolveInfo="getReferenceRoles" />
                            </node>
                          </node>
                          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196351886994">
                            <property name="name" value="refRole" />
                            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196351886995">
                              <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
                            </node>
                          </node>
                          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351886996">
                            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1196351886997">
                              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196351886998">
                                <property name="name" value="attribute" />
                                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196351886999">
                                  <link role="classifier" targetNodeId="11.~BaseAdapter" resolveInfo="BaseAdapter" />
                                </node>
                                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1196351887000">
                                  <link role="classConcept" targetNodeId="21.~ReferenceAntiquotation_AnnotationLink" resolveInfo="ReferenceAntiquotation_AnnotationLink" />
                                  <link role="baseMethodDeclaration" targetNodeId="21.~ReferenceAntiquotation_AnnotationLink.getReferenceAntiquotation(jetbrains.mps.core.structure.BaseConcept,java.lang.String):jetbrains.mps.quotation.structure.ReferenceAntiquotation" resolveInfo="getReferenceAntiquotation" />
                                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1196351887001">
                                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204672721774">
                                      <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196351887003" />
                                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAdapterOperation" id="1196351887004" />
                                    </node>
                                    <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196351887005">
                                      <link role="classifier" targetNodeId="7.~BaseConcept" resolveInfo="BaseConcept" />
                                    </node>
                                  </node>
                                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351887006">
                                    <link role="variableDeclaration" targetNodeId="1196351886994" resolveInfo="refRole" />
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1196351887007">
                              <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1196351887008">
                                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1196351887009" />
                                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351887010">
                                  <link role="variableDeclaration" targetNodeId="1196351886998" resolveInfo="attribute" />
                                </node>
                              </node>
                              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351887011">
                                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196351887012">
                                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933350635">
                                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351887014">
                                      <link role="variableDeclaration" targetNodeId="1196351886987" resolveInfo="result" />
                                    </node>
                                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933350636">
                                      <link role="baseMethodDeclaration" targetNodeId="16.~List.add(java.lang.Object):boolean" resolveInfo="add" />
                                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933350967">
                                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351887016">
                                          <link role="variableDeclaration" targetNodeId="1196351886998" resolveInfo="attribute" />
                                        </node>
                                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933350968">
                                          <link role="baseMethodDeclaration" targetNodeId="11.~BaseAdapter.getNode():jetbrains.mps.smodel.SNode" resolveInfo="getNode" />
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1196351887017">
                          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351887018">
                            <link role="variableDeclaration" targetNodeId="1196351886987" resolveInfo="result" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1196351887019">
                  <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351887020">
                    <node role="nodeMacro$attribute" type="jetbrains.mps.transformation.TLBase.structure.SwitchMacro" id="1196351887021">
                      <link role="templateSwitch" targetNodeId="1196351886667" resolveInfo="Quotation_switch" />
                      <link role="mappingLabel" targetNodeId="1215479246106" resolveInfo="nodeCreatorForQuotedNode" />
                    </node>
                  </node>
                  <node role="nodeMacro$attribute" type="jetbrains.mps.transformation.TLBase.structure.LoopMacro" id="1196351887022">
                    <node role="sourceNodesQuery" type="jetbrains.mps.transformation.TLBase.structure.SourceSubstituteMacro_SourceNodesQuery" id="1196351887023">
                      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351887024">
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1196351887025">
                          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196351887026">
                            <property name="name" value="result" />
                            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196351887027">
                              <link role="classifier" targetNodeId="16.~List" resolveInfo="List" />
                              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196351887028">
                                <link role="classifier" targetNodeId="11.~SNode" resolveInfo="SNode" />
                              </node>
                            </node>
                            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1216933355925">
                              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1216933355927">
                                <link role="baseMethodDeclaration" targetNodeId="16.~ArrayList.&lt;init&gt;()" resolveInfo="ArrayList" />
                                <node role="typeParameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196351887030">
                                  <link role="classifier" targetNodeId="11.~SNode" resolveInfo="SNode" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1196351887031">
                          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227841362">
                            <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196351887033" />
                            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetChildrenOperation" id="1196351887034" />
                          </node>
                          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196351887035">
                            <property name="name" value="child" />
                            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1196351887036" />
                          </node>
                          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351887037">
                            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1196351887038">
                              <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1196351887039">
                                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227956337">
                                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351887041">
                                    <link role="variableDeclaration" targetNodeId="1196351887035" resolveInfo="child" />
                                  </node>
                                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1196351887042">
                                    <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1196351887043">
                                      <link role="conceptDeclaration" targetNodeId="1.1196350785110" resolveInfo="AbstractAntiquotation" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351887044">
                                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196351887045">
                                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933351167">
                                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351887047">
                                      <link role="variableDeclaration" targetNodeId="1196351887026" resolveInfo="result" />
                                    </node>
                                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933351168">
                                      <link role="baseMethodDeclaration" targetNodeId="16.~List.add(java.lang.Object):boolean" resolveInfo="add" />
                                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351887048">
                                        <link role="variableDeclaration" targetNodeId="1196351887035" resolveInfo="child" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1196351887049">
                          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351887050">
                            <link role="variableDeclaration" targetNodeId="1196351887026" resolveInfo="result" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196351887051">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1196351887052">
                    <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351887053">
                      <link role="variableDeclaration" targetNodeId="1196351886742" resolveInfo="parent" />
                      <node role="referenceMacro$link_attribute$variableDeclaration" type="jetbrains.mps.transformation.TLBase.structure.ReferenceMacro" id="1196351887054">
                        <node role="referentFunction" type="jetbrains.mps.transformation.TLBase.structure.ReferenceMacro_GetReferent" id="1196351887055">
                          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351887056">
                            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1196351887057">
                              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196351887058">
                                <property name="name" value="parentTargetNode" />
                                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196351887059">
                                  <link role="classifier" targetNodeId="11.~SNode" resolveInfo="SNode" />
                                </node>
                                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216932803580">
                                  <node role="operand" type="jetbrains.mps.transformation.generationContext.structure.TemplateFunctionParameter_generationContext" id="1216932803582" />
                                  <node role="operation" type="jetbrains.mps.transformation.generationContext.structure.GenerationContextOp_GetOutputByLabelAndInput" id="1216932803583">
                                    <link role="label" targetNodeId="1215475953198" resolveInfo="quotationClass" />
                                    <node role="inputNode" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227878345">
                                      <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196351887063" />
                                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1196351887064" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1196351887066">
                              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196351887067">
                                <property name="name" value="quotationClass" />
                                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196351887068">
                                  <link role="classifier" targetNodeId="8.~ClassConcept" resolveInfo="ClassConcept" />
                                </node>
                                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1196351887069">
                                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1196351887070">
                                    <link role="baseMethodDeclaration" targetNodeId="11.~BaseAdapter.fromNode(jetbrains.mps.smodel.SNode):jetbrains.mps.smodel.INodeAdapter" resolveInfo="fromNode" />
                                    <link role="classConcept" targetNodeId="11.~BaseAdapter" resolveInfo="BaseAdapter" />
                                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351887071">
                                      <link role="variableDeclaration" targetNodeId="1196351887058" resolveInfo="parentTargetNode" />
                                    </node>
                                  </node>
                                  <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196351887072">
                                    <link role="classifier" targetNodeId="8.~ClassConcept" resolveInfo="ClassConcept" />
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1196351887073">
                              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196351887074">
                                <property name="name" value="methodDecl" />
                                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196351887075">
                                  <link role="classifier" targetNodeId="8.~InstanceMethodDeclaration" resolveInfo="InstanceMethodDeclaration" />
                                </node>
                                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933354513">
                                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933350799">
                                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351887078">
                                      <link role="variableDeclaration" targetNodeId="1196351887067" resolveInfo="quotationClass" />
                                    </node>
                                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933350800">
                                      <link role="baseMethodDeclaration" targetNodeId="8.~Classifier.getMethods():java.util.List" resolveInfo="getMethods" />
                                    </node>
                                  </node>
                                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933354514">
                                    <link role="baseMethodDeclaration" targetNodeId="16.~List.get(int):java.lang.Object" resolveInfo="get" />
                                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1196351887079">
                                      <property name="value" value="0" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1196351887080">
                              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196351887081">
                                <property name="name" value="statementList" />
                                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196351887082">
                                  <link role="classifier" targetNodeId="8.~StatementList" resolveInfo="StatementList" />
                                </node>
                                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933352033">
                                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351887084">
                                    <link role="variableDeclaration" targetNodeId="1196351887074" resolveInfo="methodDecl" />
                                  </node>
                                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933352034">
                                    <link role="baseMethodDeclaration" targetNodeId="8.~BaseMethodDeclaration.getBody():jetbrains.mps.baseLanguage.structure.StatementList" resolveInfo="getBody" />
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1196351887085">
                              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196351887086">
                                <property name="name" value="lvs" />
                                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196351887087">
                                  <link role="classifier" targetNodeId="8.~LocalVariableDeclarationStatement" resolveInfo="LocalVariableDeclarationStatement" />
                                </node>
                                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1196351887088">
                                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933351000">
                                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933350965">
                                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351887091">
                                        <link role="variableDeclaration" targetNodeId="1196351887081" resolveInfo="statementList" />
                                      </node>
                                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933350966">
                                        <link role="baseMethodDeclaration" targetNodeId="8.~StatementList.getStatements():java.util.List" resolveInfo="getStatements" />
                                      </node>
                                    </node>
                                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933351001">
                                      <link role="baseMethodDeclaration" targetNodeId="16.~List.get(int):java.lang.Object" resolveInfo="get" />
                                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1196351887092">
                                        <property name="value" value="0" />
                                      </node>
                                    </node>
                                  </node>
                                  <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196351887093">
                                    <link role="classifier" targetNodeId="8.~LocalVariableDeclarationStatement" resolveInfo="LocalVariableDeclarationStatement" />
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1196351887094">
                              <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1196351887095">
                                <link role="classConcept" targetNodeId="11.~BaseAdapter" resolveInfo="BaseAdapter" />
                                <link role="baseMethodDeclaration" targetNodeId="11.~BaseAdapter.fromAdapter(jetbrains.mps.smodel.INodeAdapter):jetbrains.mps.smodel.SNode" resolveInfo="fromAdapter" />
                                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933353477">
                                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351887097">
                                    <link role="variableDeclaration" targetNodeId="1196351887086" resolveInfo="lvs" />
                                  </node>
                                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933353478">
                                    <link role="baseMethodDeclaration" targetNodeId="8.~LocalVariableDeclarationStatement.getLocalVariableDeclaration():jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" resolveInfo="getLocalVariableDeclaration" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="rValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201868567043">
                      <link role="variableDeclaration" targetNodeId="1201868524252" resolveInfo="_node1_" />
                    </node>
                  </node>
                  <node role="nodeMacro$attribute" type="jetbrains.mps.transformation.TLBase.structure.IfMacro" id="1196351887099">
                    <node role="conditionFunction" type="jetbrains.mps.transformation.TLBase.structure.IfMacro_Condition" id="1196351887100">
                      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351887101">
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196351887102">
                          <node role="expression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1196351887103">
                            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227908858">
                              <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196351887105" />
                              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1196351887106" />
                            </node>
                            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227896429">
                              <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196351887108" />
                              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1196351887109">
                                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1196351887110">
                                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1216933355755">
                                    <link role="conceptDeclaration" targetNodeId="1.1196350785113" resolveInfo="Quotation" />
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
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196351887111">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933351659">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351887113">
                      <link role="variableDeclaration" targetNodeId="1196351886742" resolveInfo="parent" />
                      <node role="referenceMacro$link_attribute$variableDeclaration" type="jetbrains.mps.transformation.TLBase.structure.ReferenceMacro" id="1196351887114">
                        <node role="referentFunction" type="jetbrains.mps.transformation.TLBase.structure.ReferenceMacro_GetReferent" id="1196351887115">
                          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351887116">
                            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1201870635519">
                              <node role="expression" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1201870635520">
                                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216932803557">
                                  <node role="operand" type="jetbrains.mps.transformation.generationContext.structure.TemplateFunctionParameter_generationContext" id="1216932803559" />
                                  <node role="operation" type="jetbrains.mps.transformation.generationContext.structure.GenerationContextOp_GetOutputByLabelAndInput" id="1216932803560">
                                    <link role="label" targetNodeId="1215479326395" resolveInfo="nodeVariable" />
                                    <node role="inputNode" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227883744">
                                      <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1201870635522" />
                                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1201870647812" />
                                    </node>
                                  </node>
                                </node>
                                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1201870635525">
                                  <link role="concept" targetNodeId="12.1068581242863" resolveInfo="LocalVariableDeclaration" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933351660">
                      <link role="baseMethodDeclaration" targetNodeId="11.~SNode.addChild(java.lang.String,jetbrains.mps.smodel.SNode):void" resolveInfo="addChild" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1196351887146">
                        <property name="value" value="role" />
                        <node role="propertyMacro$property_attribute$value" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro" id="1196351887147">
                          <node role="propertyValueFunction" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro_GetPropertyValue" id="1196351887148">
                            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351887149">
                              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196351887150">
                                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933355268">
                                  <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196351887152" />
                                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933355269">
                                    <link role="baseMethodDeclaration" targetNodeId="11.~SNode.getRole_():java.lang.String" resolveInfo="getRole_" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201868568669">
                        <link role="variableDeclaration" targetNodeId="1201868524252" resolveInfo="_node1_" />
                      </node>
                    </node>
                  </node>
                  <node role="nodeMacro$attribute" type="jetbrains.mps.transformation.TLBase.structure.IfMacro" id="1196351887154">
                    <node role="conditionFunction" type="jetbrains.mps.transformation.TLBase.structure.IfMacro_Condition" id="1196351887155">
                      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351887156">
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196351887157">
                          <node role="expression" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1196351887158">
                            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227883273">
                              <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196351887160" />
                              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1196351887161">
                                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1196351887162">
                                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1216933355772">
                                    <link role="conceptDeclaration" targetNodeId="1.1196350785113" resolveInfo="Quotation" />
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227838837">
                              <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196351887164" />
                              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1196351887165" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="nodeMacro$attribute" type="jetbrains.mps.transformation.TLBase.structure.IfMacro" id="1196351887166">
                <node role="conditionFunction" type="jetbrains.mps.transformation.TLBase.structure.IfMacro_Condition" id="1196351887167">
                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351887168">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1196351887169">
                      <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196351887170">
                        <property name="name" value="children" />
                        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1196351887171" />
                        <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227852823">
                          <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196351887173" />
                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetChildrenOperation" id="1196351887174" />
                        </node>
                      </node>
                    </node>
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1196351887175">
                      <node role="iterable" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351887176">
                        <link role="variableDeclaration" targetNodeId="1196351887170" resolveInfo="children" />
                      </node>
                      <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196351887177">
                        <property name="name" value="child" />
                        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1196351887178" />
                      </node>
                      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351887179">
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1196351887180">
                          <node role="condition" type="jetbrains.mps.baseLanguage.structure.OrExpression" id="1196351887181">
                            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227885913">
                              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351887183">
                                <link role="variableDeclaration" targetNodeId="1196351887177" resolveInfo="child" />
                              </node>
                              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1196351887184">
                                <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1196351887185">
                                  <link role="conceptDeclaration" targetNodeId="1.1196350785118" resolveInfo="ListAntiquotation" />
                                </node>
                              </node>
                            </node>
                            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227943490">
                              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351887187">
                                <link role="variableDeclaration" targetNodeId="1196351887177" resolveInfo="child" />
                              </node>
                              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1196351887188">
                                <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1196351887189">
                                  <link role="conceptDeclaration" targetNodeId="1.1196350785112" resolveInfo="Antiquotation" />
                                </node>
                              </node>
                            </node>
                          </node>
                          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351887190">
                            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1196351887191">
                              <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1196351887192" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1196351887193">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1196351887194">
                        <property name="value" value="true" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1196351887195">
              <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351887196">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196351887197">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1196351887198">
                    <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201868921236">
                      <link role="variableDeclaration" targetNodeId="1201868795873" resolveInfo="_node_" />
                      <node role="referenceMacro$link_attribute$variableDeclaration" type="jetbrains.mps.transformation.TLBase.structure.ReferenceMacro" id="1201868923346">
                        <node role="referentFunction" type="jetbrains.mps.transformation.TLBase.structure.ReferenceMacro_GetReferent" id="1201868923347">
                          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201868923348">
                            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1201869020174">
                              <node role="expression" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1201869020175">
                                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216932803395">
                                  <node role="operand" type="jetbrains.mps.transformation.generationContext.structure.TemplateFunctionParameter_generationContext" id="1216932803397" />
                                  <node role="operation" type="jetbrains.mps.transformation.generationContext.structure.GenerationContextOp_GetOutputByLabelAndInput" id="1216932803414">
                                    <link role="label" targetNodeId="1215479326395" resolveInfo="nodeVariable" />
                                    <node role="inputNode" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1201869020177" />
                                  </node>
                                </node>
                                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1201869020180">
                                  <link role="concept" targetNodeId="12.1068581242863" resolveInfo="LocalVariableDeclaration" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="rValue" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1196351887200">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1196351887201">
                        <link role="variableDeclaration" targetNodeId="1196351887553" resolveInfo="expr" />
                        <node role="referenceMacro$link_attribute$variableDeclaration" type="jetbrains.mps.transformation.TLBase.structure.ReferenceMacro" id="1196351887202">
                          <node role="referentFunction" type="jetbrains.mps.transformation.TLBase.structure.ReferenceMacro_GetReferent" id="1196351887203">
                            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351887204">
                              <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1196351887205">
                                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196351887206">
                                  <property name="name" value="quotation" />
                                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1196351887207">
                                    <link role="concept" targetNodeId="1.1196350785113" resolveInfo="Quotation" />
                                  </node>
                                  <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227820461">
                                    <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196351887209" />
                                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1196351887210">
                                      <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1196351887211">
                                        <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1216933355775">
                                          <link role="conceptDeclaration" targetNodeId="1.1196350785113" resolveInfo="Quotation" />
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                              <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1196351887212">
                                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196351887213">
                                  <property name="name" value="antiquotation" />
                                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1196351887214">
                                    <link role="concept" targetNodeId="1.1196350785112" resolveInfo="Antiquotation" />
                                  </node>
                                  <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1196351887215" />
                                </node>
                              </node>
                              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1196351887216">
                                <node role="iterable" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227892309">
                                  <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196351887218" />
                                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetChildrenOperation" id="1196351887219" />
                                </node>
                                <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196351887220">
                                  <property name="name" value="child" />
                                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1196351887221" />
                                </node>
                                <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351887222">
                                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1196351887223">
                                    <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227924922">
                                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351887225">
                                        <link role="variableDeclaration" targetNodeId="1196351887220" resolveInfo="child" />
                                      </node>
                                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1196351887226">
                                        <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1196351887227">
                                          <link role="conceptDeclaration" targetNodeId="1.1196350785112" resolveInfo="Antiquotation" />
                                        </node>
                                      </node>
                                    </node>
                                    <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351887228">
                                      <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196351887229">
                                        <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1196351887230">
                                          <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351887231">
                                            <link role="variableDeclaration" targetNodeId="1196351887213" resolveInfo="antiquotation" />
                                          </node>
                                          <node role="rValue" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1196351887232">
                                            <link role="concept" targetNodeId="1.1196350785112" resolveInfo="Antiquotation" />
                                            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351887233">
                                              <link role="variableDeclaration" targetNodeId="1196351887220" resolveInfo="child" />
                                            </node>
                                          </node>
                                        </node>
                                      </node>
                                      <node role="statement" type="jetbrains.mps.baseLanguage.structure.BreakStatement" id="1196351887234" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                              <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1196351887235">
                                <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1196351887236">
                                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1196351887237" />
                                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351887238">
                                    <link role="variableDeclaration" targetNodeId="1196351887213" resolveInfo="antiquotation" />
                                  </node>
                                </node>
                                <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351887239">
                                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1196351887240">
                                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1196351887241" />
                                  </node>
                                </node>
                              </node>
                              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1196351887242">
                                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216932803438">
                                  <node role="operand" type="jetbrains.mps.transformation.generationContext.structure.TemplateFunctionParameter_generationContext" id="1216932803440" />
                                  <node role="operation" type="jetbrains.mps.transformation.generationContext.structure.GenerationContextOp_GetOutputByLabelAndInput" id="1216932803441">
                                    <link role="label" targetNodeId="1215479323001" resolveInfo="parametersFromExpressions" />
                                    <node role="inputNode" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227840866">
                                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351887246">
                                        <link role="variableDeclaration" targetNodeId="1196351887213" resolveInfo="antiquotation" />
                                      </node>
                                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1202141297689">
                                        <link role="link" targetNodeId="1.1196350785111" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196351887249">
                        <link role="classifier" targetNodeId="11.~SNode" resolveInfo="SNode" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1201868455976">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1201868455977">
                    <property name="name" value="_node1_" />
                    <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1201868455978">
                      <link role="classifier" targetNodeId="11.~SNode" resolveInfo="SNode" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201868931338">
                      <link role="variableDeclaration" targetNodeId="1201868795873" resolveInfo="_node_" />
                      <node role="referenceMacro$link_attribute$variableDeclaration" type="jetbrains.mps.transformation.TLBase.structure.ReferenceMacro" id="1201870241920">
                        <node role="referentFunction" type="jetbrains.mps.transformation.TLBase.structure.ReferenceMacro_GetReferent" id="1201870241921">
                          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201870241922">
                            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1201870244251">
                              <node role="expression" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1201870244252">
                                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216932803501">
                                  <node role="operand" type="jetbrains.mps.transformation.generationContext.structure.TemplateFunctionParameter_generationContext" id="1216932803503" />
                                  <node role="operation" type="jetbrains.mps.transformation.generationContext.structure.GenerationContextOp_GetOutputByLabelAndInput" id="1216932803504">
                                    <link role="label" targetNodeId="1215479326395" resolveInfo="nodeVariable" />
                                    <node role="inputNode" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1201870244254" />
                                  </node>
                                </node>
                                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1201870244257">
                                  <link role="concept" targetNodeId="12.1068581242863" resolveInfo="LocalVariableDeclaration" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="propertyMacro$property_attribute$name" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro" id="1201868659572">
                      <node role="propertyValueFunction" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro_GetPropertyValue" id="1201868659573">
                        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201868659574">
                          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1203100299512">
                            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1218070397362">
                              <node role="operand" type="jetbrains.mps.transformation.generationContext.structure.TemplateFunctionParameter_generationContext" id="1218070397364" />
                              <node role="operation" type="jetbrains.mps.transformation.generationContext.structure.GenerationContextOp_CreateUniqueName" id="1218070397365">
                                <node role="baseName" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1203100299514">
                                  <property name="value" value="quotedNode1_" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1196860174783">
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196860174784">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196860200834">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1196860200835">
                        <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196860200836">
                          <link role="variableDeclaration" targetNodeId="1196351886742" resolveInfo="parent" />
                          <node role="referenceMacro$link_attribute$variableDeclaration" type="jetbrains.mps.transformation.TLBase.structure.ReferenceMacro" id="1196860200837">
                            <node role="referentFunction" type="jetbrains.mps.transformation.TLBase.structure.ReferenceMacro_GetReferent" id="1196860200838">
                              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196860200839">
                                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1196860200840">
                                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196860200841">
                                    <property name="name" value="parentTargetNode" />
                                    <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196860200842">
                                      <link role="classifier" targetNodeId="11.~SNode" resolveInfo="SNode" />
                                    </node>
                                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216932803482">
                                      <node role="operand" type="jetbrains.mps.transformation.generationContext.structure.TemplateFunctionParameter_generationContext" id="1216932803499" />
                                      <node role="operation" type="jetbrains.mps.transformation.generationContext.structure.GenerationContextOp_GetOutputByLabelAndInput" id="1216932803500">
                                        <link role="label" targetNodeId="1215475953198" resolveInfo="quotationClass" />
                                        <node role="inputNode" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227848533">
                                          <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196860200846" />
                                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1196860200847" />
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                </node>
                                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1196860200849">
                                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196860200850">
                                    <property name="name" value="quotationClass" />
                                    <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196860200851">
                                      <link role="classifier" targetNodeId="8.~ClassConcept" resolveInfo="ClassConcept" />
                                    </node>
                                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1196860200852">
                                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1196860200853">
                                        <link role="baseMethodDeclaration" targetNodeId="11.~BaseAdapter.fromNode(jetbrains.mps.smodel.SNode):jetbrains.mps.smodel.INodeAdapter" resolveInfo="fromNode" />
                                        <link role="classConcept" targetNodeId="11.~BaseAdapter" resolveInfo="BaseAdapter" />
                                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196860200854">
                                          <link role="variableDeclaration" targetNodeId="1196860200841" resolveInfo="parentTargetNode" />
                                        </node>
                                      </node>
                                      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196860200855">
                                        <link role="classifier" targetNodeId="8.~ClassConcept" resolveInfo="ClassConcept" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1196860200856">
                                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196860200857">
                                    <property name="name" value="methodDecl" />
                                    <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196860200858">
                                      <link role="classifier" targetNodeId="8.~InstanceMethodDeclaration" resolveInfo="InstanceMethodDeclaration" />
                                    </node>
                                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933353940">
                                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933355235">
                                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196860200861">
                                          <link role="variableDeclaration" targetNodeId="1196860200850" resolveInfo="quotationClass" />
                                        </node>
                                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933355236">
                                          <link role="baseMethodDeclaration" targetNodeId="8.~Classifier.getMethods():java.util.List" resolveInfo="getMethods" />
                                        </node>
                                      </node>
                                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933353941">
                                        <link role="baseMethodDeclaration" targetNodeId="16.~List.get(int):java.lang.Object" resolveInfo="get" />
                                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1196860200862">
                                          <property name="value" value="0" />
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                </node>
                                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1196860200863">
                                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196860200864">
                                    <property name="name" value="statementList" />
                                    <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196860200865">
                                      <link role="classifier" targetNodeId="8.~StatementList" resolveInfo="StatementList" />
                                    </node>
                                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933351608">
                                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196860200867">
                                        <link role="variableDeclaration" targetNodeId="1196860200857" resolveInfo="methodDecl" />
                                      </node>
                                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933351609">
                                        <link role="baseMethodDeclaration" targetNodeId="8.~BaseMethodDeclaration.getBody():jetbrains.mps.baseLanguage.structure.StatementList" resolveInfo="getBody" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1196860200868">
                                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196860200869">
                                    <property name="name" value="lvs" />
                                    <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196860200870">
                                      <link role="classifier" targetNodeId="8.~LocalVariableDeclarationStatement" resolveInfo="LocalVariableDeclarationStatement" />
                                    </node>
                                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1196860200871">
                                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933351982">
                                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933353739">
                                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196860200874">
                                            <link role="variableDeclaration" targetNodeId="1196860200864" resolveInfo="statementList" />
                                          </node>
                                          <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933353740">
                                            <link role="baseMethodDeclaration" targetNodeId="8.~StatementList.getStatements():java.util.List" resolveInfo="getStatements" />
                                          </node>
                                        </node>
                                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933351983">
                                          <link role="baseMethodDeclaration" targetNodeId="16.~List.get(int):java.lang.Object" resolveInfo="get" />
                                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1196860200875">
                                            <property name="value" value="0" />
                                          </node>
                                        </node>
                                      </node>
                                      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196860200876">
                                        <link role="classifier" targetNodeId="8.~LocalVariableDeclarationStatement" resolveInfo="LocalVariableDeclarationStatement" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1196860200877">
                                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1196860200878">
                                    <link role="classConcept" targetNodeId="11.~BaseAdapter" resolveInfo="BaseAdapter" />
                                    <link role="baseMethodDeclaration" targetNodeId="11.~BaseAdapter.fromAdapter(jetbrains.mps.smodel.INodeAdapter):jetbrains.mps.smodel.SNode" resolveInfo="fromAdapter" />
                                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933352918">
                                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196860200880">
                                        <link role="variableDeclaration" targetNodeId="1196860200869" resolveInfo="lvs" />
                                      </node>
                                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933352919">
                                        <link role="baseMethodDeclaration" targetNodeId="8.~LocalVariableDeclarationStatement.getLocalVariableDeclaration():jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" resolveInfo="getLocalVariableDeclaration" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="rValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201868494060">
                          <link role="variableDeclaration" targetNodeId="1201868455977" resolveInfo="_node1_" />
                        </node>
                      </node>
                      <node role="nodeMacro$attribute" type="jetbrains.mps.transformation.TLBase.structure.IfMacro" id="1196860200882">
                        <node role="conditionFunction" type="jetbrains.mps.transformation.TLBase.structure.IfMacro_Condition" id="1196860200883">
                          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196860200884">
                            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196860200885">
                              <node role="expression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1196860200886">
                                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227833234">
                                  <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196860200888" />
                                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1196860200889" />
                                </node>
                                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227841664">
                                  <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196860200891" />
                                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1196860200892">
                                    <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1196860200893">
                                      <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1216933355776">
                                        <link role="conceptDeclaration" targetNodeId="1.1196350785113" resolveInfo="Quotation" />
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
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196860192980">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933354619">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196860192982">
                          <link role="variableDeclaration" targetNodeId="1196351886742" resolveInfo="parent" />
                          <node role="referenceMacro$link_attribute$variableDeclaration" type="jetbrains.mps.transformation.TLBase.structure.ReferenceMacro" id="1196860192983">
                            <node role="referentFunction" type="jetbrains.mps.transformation.TLBase.structure.ReferenceMacro_GetReferent" id="1196860192984">
                              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196860192985">
                                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1201870669580">
                                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1201870669581">
                                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216932803434">
                                      <node role="operand" type="jetbrains.mps.transformation.generationContext.structure.TemplateFunctionParameter_generationContext" id="1216932803436" />
                                      <node role="operation" type="jetbrains.mps.transformation.generationContext.structure.GenerationContextOp_GetOutputByLabelAndInput" id="1216932803437">
                                        <link role="label" targetNodeId="1215479326395" resolveInfo="nodeVariable" />
                                        <node role="inputNode" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227920956">
                                          <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1201870669585" />
                                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1201870669584" />
                                        </node>
                                      </node>
                                    </node>
                                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1201870669588">
                                      <link role="concept" targetNodeId="12.1068581242863" resolveInfo="LocalVariableDeclaration" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933354620">
                          <link role="baseMethodDeclaration" targetNodeId="11.~SNode.addChild(java.lang.String,jetbrains.mps.smodel.SNode):void" resolveInfo="addChild" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1196860193015">
                            <property name="value" value="role" />
                            <node role="propertyMacro$property_attribute$value" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro" id="1196860193016">
                              <node role="propertyValueFunction" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro_GetPropertyValue" id="1196860193017">
                                <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196860193018">
                                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196860193019">
                                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933351374">
                                      <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196860193021" />
                                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933351375">
                                        <link role="baseMethodDeclaration" targetNodeId="11.~SNode.getRole_():java.lang.String" resolveInfo="getRole_" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1196860193022">
                            <link role="classConcept" targetNodeId="20.~HUtil" resolveInfo="HUtil" />
                            <link role="baseMethodDeclaration" targetNodeId="20.~HUtil.copyIfNecessary(jetbrains.mps.smodel.SNode,jetbrains.mps.smodel.SModel):jetbrains.mps.smodel.SNode" resolveInfo="copyIfNecessary" />
                            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201868496905">
                              <link role="variableDeclaration" targetNodeId="1201868455977" resolveInfo="_node1_" />
                            </node>
                            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933352900">
                              <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1196860193025">
                                <link role="classConcept" targetNodeId="18.~TypeChecker" resolveInfo="TypeChecker" />
                                <link role="baseMethodDeclaration" targetNodeId="18.~TypeChecker.getInstance():jetbrains.mps.helgins.inference.TypeChecker" resolveInfo="getInstance" />
                              </node>
                              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933352901">
                                <link role="baseMethodDeclaration" targetNodeId="18.~TypeChecker.getRuntimeTypesModel():jetbrains.mps.smodel.SModel" resolveInfo="getRuntimeTypesModel" />
                              </node>
                              <node role="nodeMacro$attribute" type="jetbrains.mps.transformation.TLBase.structure.SwitchMacro" id="1196860193026">
                                <link role="templateSwitch" targetNodeId="1196351886655" resolveInfo="QuotationModel_switch" />
                                <node role="sourceNodeQuery" type="jetbrains.mps.transformation.TLBase.structure.SourceSubstituteMacro_SourceNodeQuery" id="1196860193027">
                                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196860193028">
                                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196860193029">
                                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227924423">
                                        <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196860193031" />
                                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1196860193032">
                                          <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1196860193033">
                                            <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1216933355773">
                                              <link role="conceptDeclaration" targetNodeId="1.1196350785113" resolveInfo="Quotation" />
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
                        </node>
                      </node>
                      <node role="nodeMacro$attribute" type="jetbrains.mps.transformation.TLBase.structure.IfMacro" id="1196860193034">
                        <node role="conditionFunction" type="jetbrains.mps.transformation.TLBase.structure.IfMacro_Condition" id="1196860193035">
                          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196860193036">
                            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196860193037">
                              <node role="expression" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1196860193038">
                                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227941999">
                                  <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196860193040" />
                                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1196860193041">
                                    <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1196860193042">
                                      <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1216933355778">
                                        <link role="conceptDeclaration" targetNodeId="1.1196350785113" resolveInfo="Quotation" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227913443">
                                  <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196860193044" />
                                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1196860193045" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1196860185766">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1196860187584" />
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201868491372">
                      <link role="variableDeclaration" targetNodeId="1201868455977" resolveInfo="_node1_" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="nodeMacro$attribute" type="jetbrains.mps.transformation.TLBase.structure.IfMacro" id="1196351887376">
                <node role="conditionFunction" type="jetbrains.mps.transformation.TLBase.structure.IfMacro_Condition" id="1196351887377">
                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351887378">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1196351887379">
                      <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196351887380">
                        <property name="name" value="children" />
                        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1196351887381" />
                        <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227850599">
                          <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196351887383" />
                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetChildrenOperation" id="1196351887384" />
                        </node>
                      </node>
                    </node>
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1196351887385">
                      <node role="iterable" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351887386">
                        <link role="variableDeclaration" targetNodeId="1196351887380" resolveInfo="children" />
                      </node>
                      <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196351887387">
                        <property name="name" value="child" />
                        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1196351887388" />
                      </node>
                      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351887389">
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1196351887390">
                          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227959197">
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351887392">
                              <link role="variableDeclaration" targetNodeId="1196351887387" resolveInfo="child" />
                            </node>
                            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1196351887393">
                              <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1196351887394">
                                <link role="conceptDeclaration" targetNodeId="1.1196350785112" resolveInfo="Antiquotation" />
                              </node>
                            </node>
                          </node>
                          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351887395">
                            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1196351887396">
                              <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1196351887397">
                                <property name="value" value="true" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1196351887398">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1196351887399" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1196351887400">
              <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351887401">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1196351887402">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196351887403">
                    <property name="name" value="nodes" />
                    <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196351887404">
                      <link role="classifier" targetNodeId="16.~List" resolveInfo="List" />
                      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196351887405">
                        <link role="classifier" targetNodeId="11.~SNode" resolveInfo="SNode" />
                      </node>
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1196351887406">
                      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196351887407">
                        <link role="classifier" targetNodeId="16.~List" resolveInfo="List" />
                        <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196351887408">
                          <link role="classifier" targetNodeId="11.~SNode" resolveInfo="SNode" />
                        </node>
                      </node>
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1196351887409">
                        <link role="variableDeclaration" targetNodeId="1196351887553" resolveInfo="expr" />
                        <node role="referenceMacro$link_attribute$variableDeclaration" type="jetbrains.mps.transformation.TLBase.structure.ReferenceMacro" id="1196351887410">
                          <node role="referentFunction" type="jetbrains.mps.transformation.TLBase.structure.ReferenceMacro_GetReferent" id="1196351887411">
                            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351887412">
                              <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1196351887413">
                                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196351887414">
                                  <property name="name" value="quotation" />
                                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1196351887415">
                                    <link role="concept" targetNodeId="1.1196350785113" resolveInfo="Quotation" />
                                  </node>
                                  <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227925505">
                                    <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196351887417" />
                                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1196351887418">
                                      <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1196351887419">
                                        <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1216933355784">
                                          <link role="conceptDeclaration" targetNodeId="1.1196350785113" resolveInfo="Quotation" />
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                              <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1196351887420">
                                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196351887421">
                                  <property name="name" value="antiquotation" />
                                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1196351887422">
                                    <link role="concept" targetNodeId="1.1196350785118" resolveInfo="ListAntiquotation" />
                                  </node>
                                  <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1196351887423" />
                                </node>
                              </node>
                              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1196351887424">
                                <node role="iterable" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227822538">
                                  <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196351887426" />
                                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetChildrenOperation" id="1196351887427" />
                                </node>
                                <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196351887428">
                                  <property name="name" value="child" />
                                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1196351887429" />
                                </node>
                                <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351887430">
                                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1196351887431">
                                    <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227908806">
                                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351887433">
                                        <link role="variableDeclaration" targetNodeId="1196351887428" resolveInfo="child" />
                                      </node>
                                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1196351887434">
                                        <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1196351887435">
                                          <link role="conceptDeclaration" targetNodeId="1.1196350785118" resolveInfo="ListAntiquotation" />
                                        </node>
                                      </node>
                                    </node>
                                    <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351887436">
                                      <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196351887437">
                                        <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1196351887438">
                                          <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351887439">
                                            <link role="variableDeclaration" targetNodeId="1196351887421" resolveInfo="antiquotation" />
                                          </node>
                                          <node role="rValue" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1196351887440">
                                            <link role="concept" targetNodeId="1.1196350785118" resolveInfo="ListAntiquotation" />
                                            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351887441">
                                              <link role="variableDeclaration" targetNodeId="1196351887428" resolveInfo="child" />
                                            </node>
                                          </node>
                                        </node>
                                      </node>
                                      <node role="statement" type="jetbrains.mps.baseLanguage.structure.BreakStatement" id="1196351887442" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                              <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1196351887443">
                                <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1196351887444">
                                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1196351887445" />
                                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351887446">
                                    <link role="variableDeclaration" targetNodeId="1196351887421" resolveInfo="antiquotation" />
                                  </node>
                                </node>
                                <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351887447">
                                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1196351887448">
                                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1196351887449" />
                                  </node>
                                </node>
                              </node>
                              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1196351887450">
                                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216932803415">
                                  <node role="operand" type="jetbrains.mps.transformation.generationContext.structure.TemplateFunctionParameter_generationContext" id="1216932803417" />
                                  <node role="operation" type="jetbrains.mps.transformation.generationContext.structure.GenerationContextOp_GetOutputByLabelAndInput" id="1216932803418">
                                    <link role="label" targetNodeId="1215479323001" resolveInfo="parametersFromExpressions" />
                                    <node role="inputNode" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227867032">
                                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351887454">
                                        <link role="variableDeclaration" targetNodeId="1196351887421" resolveInfo="antiquotation" />
                                      </node>
                                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1202141316813">
                                        <link role="link" targetNodeId="1.1196350785111" />
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
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1196351887457">
                  <node role="iterable" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351887458">
                    <link role="variableDeclaration" targetNodeId="1196351887403" resolveInfo="nodes" />
                  </node>
                  <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196351887459">
                    <property name="name" value="child" />
                    <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196351887460">
                      <link role="classifier" targetNodeId="11.~SNode" resolveInfo="SNode" />
                    </node>
                  </node>
                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351887461">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196351887462">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933350850">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351887464">
                          <link role="variableDeclaration" targetNodeId="1196351886742" resolveInfo="parent" />
                          <node role="referenceMacro$link_attribute$variableDeclaration" type="jetbrains.mps.transformation.TLBase.structure.ReferenceMacro" id="1196351887465">
                            <node role="referentFunction" type="jetbrains.mps.transformation.TLBase.structure.ReferenceMacro_GetReferent" id="1196351887466">
                              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351887467">
                                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1201871436885">
                                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1201871436886">
                                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216932803509">
                                      <node role="operand" type="jetbrains.mps.transformation.generationContext.structure.TemplateFunctionParameter_generationContext" id="1216932803511" />
                                      <node role="operation" type="jetbrains.mps.transformation.generationContext.structure.GenerationContextOp_GetOutputByLabelAndInput" id="1216932803512">
                                        <link role="label" targetNodeId="1215479326395" resolveInfo="nodeVariable" />
                                        <node role="inputNode" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227957158">
                                          <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1201871436890" />
                                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1201871436889" />
                                        </node>
                                      </node>
                                    </node>
                                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1201871436893">
                                      <link role="concept" targetNodeId="12.1068581242863" resolveInfo="LocalVariableDeclaration" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933350851">
                          <link role="baseMethodDeclaration" targetNodeId="11.~SNode.addChild(java.lang.String,jetbrains.mps.smodel.SNode):void" resolveInfo="addChild" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1196351887497">
                            <property name="value" value="role" />
                            <node role="propertyMacro$property_attribute$value" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro" id="1196351887498">
                              <node role="propertyValueFunction" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro_GetPropertyValue" id="1196351887499">
                                <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351887500">
                                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196351887501">
                                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933353974">
                                      <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196351887503" />
                                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933353975">
                                        <link role="baseMethodDeclaration" targetNodeId="11.~SNode.getRole_():java.lang.String" resolveInfo="getRole_" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1196351887504">
                            <link role="classConcept" targetNodeId="20.~HUtil" resolveInfo="HUtil" />
                            <link role="baseMethodDeclaration" targetNodeId="20.~HUtil.copyIfNecessary(jetbrains.mps.smodel.SNode,jetbrains.mps.smodel.SModel):jetbrains.mps.smodel.SNode" resolveInfo="copyIfNecessary" />
                            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351887505">
                              <link role="variableDeclaration" targetNodeId="1196351887459" resolveInfo="child" />
                            </node>
                            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933353495">
                              <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1196351887507">
                                <link role="baseMethodDeclaration" targetNodeId="18.~TypeChecker.getInstance():jetbrains.mps.helgins.inference.TypeChecker" resolveInfo="getInstance" />
                                <link role="classConcept" targetNodeId="18.~TypeChecker" resolveInfo="TypeChecker" />
                              </node>
                              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933353496">
                                <link role="baseMethodDeclaration" targetNodeId="18.~TypeChecker.getRuntimeTypesModel():jetbrains.mps.smodel.SModel" resolveInfo="getRuntimeTypesModel" />
                              </node>
                              <node role="nodeMacro$attribute" type="jetbrains.mps.transformation.TLBase.structure.SwitchMacro" id="1196351887508">
                                <link role="templateSwitch" targetNodeId="1196351886655" resolveInfo="QuotationModel_switch" />
                                <node role="sourceNodeQuery" type="jetbrains.mps.transformation.TLBase.structure.SourceSubstituteMacro_SourceNodeQuery" id="1196351887509">
                                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351887510">
                                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196351887511">
                                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227837167">
                                        <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196351887513" />
                                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1196351887514">
                                          <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1196351887515">
                                            <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1216933355774">
                                              <link role="conceptDeclaration" targetNodeId="1.1196350785113" resolveInfo="Quotation" />
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
                        </node>
                      </node>
                      <node role="nodeMacro$attribute" type="jetbrains.mps.transformation.TLBase.structure.IfMacro" id="1196351887516">
                        <node role="conditionFunction" type="jetbrains.mps.transformation.TLBase.structure.IfMacro_Condition" id="1196351887517">
                          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351887518">
                            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196351887519">
                              <node role="expression" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1196351887520">
                                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227946909">
                                  <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196351887522" />
                                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1196351887523">
                                    <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1196351887524">
                                      <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1216933355779">
                                        <link role="conceptDeclaration" targetNodeId="1.1196350785113" resolveInfo="Quotation" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227887024">
                                  <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196351887526" />
                                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1196351887527" />
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
              <node role="nodeMacro$attribute" type="jetbrains.mps.transformation.TLBase.structure.IfMacro" id="1196351887528">
                <node role="conditionFunction" type="jetbrains.mps.transformation.TLBase.structure.IfMacro_Condition" id="1196351887529">
                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351887530">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1196351887531">
                      <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196351887532">
                        <property name="name" value="children" />
                        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1196351887533" />
                        <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227903488">
                          <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196351887535" />
                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetChildrenOperation" id="1196351887536" />
                        </node>
                      </node>
                    </node>
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1196351887537">
                      <node role="iterable" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351887538">
                        <link role="variableDeclaration" targetNodeId="1196351887532" resolveInfo="children" />
                      </node>
                      <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196351887539">
                        <property name="name" value="child" />
                        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1196351887540" />
                      </node>
                      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351887541">
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1196351887542">
                          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227914900">
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351887544">
                              <link role="variableDeclaration" targetNodeId="1196351887539" resolveInfo="child" />
                            </node>
                            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1196351887545">
                              <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1196351887546">
                                <link role="conceptDeclaration" targetNodeId="1.1196350785118" resolveInfo="ListAntiquotation" />
                              </node>
                            </node>
                          </node>
                          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351887547">
                            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1196351887548">
                              <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1196351887549">
                                <property name="value" value="true" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1196351887550">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1196351887551" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="templateFragment$attribute" type="jetbrains.mps.transformation.TLBase.structure.TemplateFragment" id="1201868883921" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1196351887553">
        <property name="name" value="expr" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1196351887554" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1196351887555" />
    </node>
  </node>
  <node type="jetbrains.mps.transformation.TLBase.structure.MappingConfiguration" id="1196351887556">
    <property name="name" value="main" />
    <property name="topPriorityGroup" value="true" />
    <node role="rootMappingRule" type="jetbrains.mps.transformation.TLBase.structure.Root_MappingRule" id="1196351887567">
      <link role="template" targetNodeId="1196351887791" resolveInfo="quotation_class" />
      <link role="applicableConcept" targetNodeId="1.1196350785113" resolveInfo="Quotation" />
      <link role="labelDeclaration" targetNodeId="1215475953198" resolveInfo="quotationClass" />
    </node>
    <node role="reductionMappingRule" type="jetbrains.mps.transformation.TLBase.structure.Reduction_MappingRule" id="1196351887579">
      <link role="applicableConcept" targetNodeId="1.1196350785113" resolveInfo="Quotation" />
      <node role="ruleConsequence" type="jetbrains.mps.transformation.TLBase.structure.TemplateDeclarationReference" id="1196351887580">
        <link role="template" targetNodeId="1196351886669" resolveInfo="Quotation_to_methodCall" />
      </node>
    </node>
    <node role="mappingLabel" type="jetbrains.mps.transformation.TLBase.structure.MappingLabelDeclaration" id="1215475953198">
      <property name="name" value="quotationClass" />
    </node>
    <node role="mappingLabel" type="jetbrains.mps.transformation.TLBase.structure.MappingLabelDeclaration" id="1215479246106">
      <property name="name" value="nodeCreatorForQuotedNode" />
    </node>
    <node role="mappingLabel" type="jetbrains.mps.transformation.TLBase.structure.MappingLabelDeclaration" id="1215479323001">
      <property name="name" value="parametersFromExpressions" />
    </node>
    <node role="mappingLabel" type="jetbrains.mps.transformation.TLBase.structure.MappingLabelDeclaration" id="1215479326395">
      <property name="name" value="nodeVariable" />
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1196351887791">
    <property name="name" value="quotation_class" />
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1196351887792">
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.Type" id="1196351887793" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351887794" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1196351887795" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1196351887796">
      <property name="name" value="createNode" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196351887797">
        <link role="classifier" targetNodeId="11.~SNode" resolveInfo="SNode" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351887798">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1196351887799">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196351887800">
            <property name="name" value="result" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196351887801">
              <link role="classifier" targetNodeId="11.~SNode" resolveInfo="SNode" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1202932041432" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1201866061108">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1201866061109">
            <property name="name" value="_node_" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1201866061110">
              <link role="classifier" targetNodeId="11.~SNode" resolveInfo="SNode" />
            </node>
            <node role="propertyMacro$property_attribute$name" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro" id="1201866124840">
              <node role="propertyValueFunction" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro_GetPropertyValue" id="1201866124841">
                <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201866124842">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1203100247033">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1218070397520">
                      <node role="operand" type="jetbrains.mps.transformation.generationContext.structure.TemplateFunctionParameter_generationContext" id="1218070397522" />
                      <node role="operation" type="jetbrains.mps.transformation.generationContext.structure.GenerationContextOp_CreateUniqueName" id="1218070397523">
                        <node role="baseName" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1203100247035">
                          <property name="value" value="quotedNode_" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="nodeMacro$attribute" type="jetbrains.mps.transformation.TLBase.structure.IfMacro" id="1201869852240">
              <link role="mappingLabel" targetNodeId="1215479326395" resolveInfo="nodeVariable" />
              <node role="conditionFunction" type="jetbrains.mps.transformation.TLBase.structure.IfMacro_Condition" id="1201869852241">
                <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201869852242">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1201869861642">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1201869861643">
                      <property name="value" value="true" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1202931932946" />
          </node>
          <node role="nodeMacro$attribute" type="jetbrains.mps.transformation.TLBase.structure.LoopMacro" id="1201869846064">
            <node role="sourceNodesQuery" type="jetbrains.mps.transformation.TLBase.structure.SourceSubstituteMacro_SourceNodesQuery" id="1201869846065">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201869846066">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1201869864963">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1201869864964">
                    <property name="name" value="root" />
                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1201869864965" />
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227939815">
                      <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1201869864968" />
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1201869864967">
                        <link role="link" targetNodeId="1.1196350785114" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1201869864969">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1201869864970">
                    <property name="name" value="result" />
                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1201869864971" />
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1201869864972">
                      <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListCreator" id="1201869864973">
                        <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1201869864974" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1201869864975">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1201869864976">
                    <property name="name" value="frontier" />
                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1201869864977" />
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1201869864978">
                      <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListCreator" id="1201869864979">
                        <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1201869864980" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1201869864981">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933355683">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201869864985">
                      <link role="variableDeclaration" targetNodeId="1201869864970" resolveInfo="result" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddElementOperation" id="1201869864983">
                      <node role="argument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201869864984">
                        <link role="variableDeclaration" targetNodeId="1201869864964" resolveInfo="root" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1201869864986">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933355548">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201869864990">
                      <link role="variableDeclaration" targetNodeId="1201869864976" resolveInfo="frontier" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddElementOperation" id="1201869864988">
                      <node role="argument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201869864989">
                        <link role="variableDeclaration" targetNodeId="1201869864964" resolveInfo="root" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1201869864991">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1201869864992">
                    <property name="name" value="newFrontier" />
                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1201869864993" />
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1201869864994">
                      <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListCreator" id="1201869864995">
                        <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1201869864996" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.WhileStatement" id="1201869864997">
                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933355734">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201869865000">
                      <link role="variableDeclaration" targetNodeId="1201869864976" resolveInfo="frontier" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.IsNotEmptyOperation" id="1201869864999" />
                  </node>
                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201869865001">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1201869865002">
                      <node role="iterable" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201869865003">
                        <link role="variableDeclaration" targetNodeId="1201869864976" resolveInfo="frontier" />
                      </node>
                      <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1201869865004">
                        <property name="name" value="node" />
                        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1201869865005" />
                      </node>
                      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201869865006">
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1201869865007">
                          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227893870">
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201869865010">
                              <link role="variableDeclaration" targetNodeId="1201869865004" resolveInfo="node" />
                            </node>
                            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetChildrenOperation" id="1201869865009" />
                          </node>
                          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1201869865011">
                            <property name="name" value="child" />
                            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1201869865012" />
                          </node>
                          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201869865013">
                            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1201869865014">
                              <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1201869865015">
                                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227901725">
                                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201869865017">
                                    <link role="variableDeclaration" targetNodeId="1201869865011" resolveInfo="child" />
                                  </node>
                                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1201869865018">
                                    <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1201869865019">
                                      <link role="conceptDeclaration" targetNodeId="1.1196350785110" resolveInfo="AbstractAntiquotation" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201869865020">
                                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1201869865021">
                                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933355716">
                                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201869865025">
                                      <link role="variableDeclaration" targetNodeId="1201869864970" resolveInfo="result" />
                                    </node>
                                    <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddElementOperation" id="1201869865023">
                                      <node role="argument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201869865024">
                                        <link role="variableDeclaration" targetNodeId="1201869865011" resolveInfo="child" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1201869865026">
                                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933355565">
                                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201869865030">
                                      <link role="variableDeclaration" targetNodeId="1201869864992" resolveInfo="newFrontier" />
                                    </node>
                                    <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddElementOperation" id="1201869865028">
                                      <node role="argument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201869865029">
                                        <link role="variableDeclaration" targetNodeId="1201869865011" resolveInfo="child" />
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
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1201869865031">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1201869865032">
                        <node role="rValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201869865033">
                          <link role="variableDeclaration" targetNodeId="1201869864992" resolveInfo="newFrontier" />
                        </node>
                        <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201869865034">
                          <link role="variableDeclaration" targetNodeId="1201869864976" resolveInfo="frontier" />
                        </node>
                      </node>
                    </node>
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1201869865035">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1201869865036">
                        <node role="rValue" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1201869865037">
                          <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListCreator" id="1201869865038">
                            <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1201869865039" />
                          </node>
                        </node>
                        <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201869865040">
                          <link role="variableDeclaration" targetNodeId="1201869864992" resolveInfo="newFrontier" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1201869865041">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201869865042">
                    <link role="variableDeclaration" targetNodeId="1201869864970" resolveInfo="result" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1196351887802">
          <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351887803">
            <node role="nodeMacro$attribute" type="jetbrains.mps.transformation.TLBase.structure.SwitchMacro" id="1196351887804">
              <link role="templateSwitch" targetNodeId="1196351886667" resolveInfo="Quotation_switch" />
              <link role="mappingLabel" targetNodeId="1215479246106" resolveInfo="nodeCreatorForQuotedNode" />
              <node role="sourceNodeQuery" type="jetbrains.mps.transformation.TLBase.structure.SourceSubstituteMacro_SourceNodeQuery" id="1196351887805">
                <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351887806">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196351887807">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227919169">
                      <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196351887809" />
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1196352027118">
                        <link role="link" targetNodeId="1.1196350785114" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1201866023911">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933351458">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201866150008">
              <link role="variableDeclaration" targetNodeId="1201866061109" resolveInfo="_node_" />
              <node role="referenceMacro$link_attribute$variableDeclaration" type="jetbrains.mps.transformation.TLBase.structure.ReferenceMacro" id="1201868277246">
                <node role="referentFunction" type="jetbrains.mps.transformation.TLBase.structure.ReferenceMacro_GetReferent" id="1201868277247">
                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201868277248">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1201868290233">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1201868290234">
                        <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216932803537">
                          <node role="operand" type="jetbrains.mps.transformation.generationContext.structure.TemplateFunctionParameter_generationContext" id="1216932803539" />
                          <node role="operation" type="jetbrains.mps.transformation.generationContext.structure.GenerationContextOp_GetOutputByLabelAndInput" id="1216932803556">
                            <link role="label" targetNodeId="1215479326395" resolveInfo="nodeVariable" />
                            <node role="inputNode" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933353874">
                              <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SemanticDowncastExpression" id="1201868290238">
                                <node role="leftExpression" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1201868290239" />
                              </node>
                              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933353875">
                                <link role="baseMethodDeclaration" targetNodeId="11.~SNode.getReferent(java.lang.String):jetbrains.mps.smodel.SNode" resolveInfo="getReferent" />
                                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1201868290237">
                                  <property name="value" value="sourceNode" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1201868290242">
                          <link role="concept" targetNodeId="12.1068581242863" resolveInfo="LocalVariableDeclaration" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933351459">
              <link role="baseMethodDeclaration" targetNodeId="11.~SNode.setReferent(java.lang.String,jetbrains.mps.smodel.SNode):jetbrains.mps.smodel.SReference" resolveInfo="setReferent" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1201866023914">
                <property name="value" value="role" />
                <node role="propertyMacro$property_attribute$value" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro" id="1201866023915">
                  <node role="propertyValueFunction" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro_GetPropertyValue" id="1201866023916">
                    <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201866023917">
                      <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1201866023918">
                        <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933352691">
                          <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SemanticDowncastExpression" id="1201867815923">
                            <node role="leftExpression" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1201866023920" />
                          </node>
                          <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933352692">
                            <link role="baseMethodDeclaration" targetNodeId="11.~SNode.getProperty(java.lang.String):java.lang.String" resolveInfo="getProperty" />
                            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1201866023921">
                              <property name="value" value="role" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201866023922">
                <link role="variableDeclaration" targetNodeId="1201866061109" resolveInfo="_node_" />
                <node role="referenceMacro$link_attribute$variableDeclaration" type="jetbrains.mps.transformation.TLBase.structure.ReferenceMacro" id="1201866023923">
                  <node role="referentFunction" type="jetbrains.mps.transformation.TLBase.structure.ReferenceMacro_GetReferent" id="1201866023924">
                    <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201866023925">
                      <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1201866023926">
                        <node role="expression" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1201866023927">
                          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216932803561">
                            <node role="operand" type="jetbrains.mps.transformation.generationContext.structure.TemplateFunctionParameter_generationContext" id="1216932803563" />
                            <node role="operation" type="jetbrains.mps.transformation.generationContext.structure.GenerationContextOp_GetOutputByLabelAndInput" id="1216932803564">
                              <link role="label" targetNodeId="1215479326395" resolveInfo="nodeVariable" />
                              <node role="inputNode" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933355198">
                                <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SemanticDowncastExpression" id="1201866023931">
                                  <node role="leftExpression" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1201866023932" />
                                </node>
                                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933355199">
                                  <link role="baseMethodDeclaration" targetNodeId="11.~SNode.getReferent(java.lang.String):jetbrains.mps.smodel.SNode" resolveInfo="getReferent" />
                                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1201866023930">
                                    <property name="value" value="targetNode" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                          <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1201866023935">
                            <link role="concept" targetNodeId="12.1068581242863" resolveInfo="LocalVariableDeclaration" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="nodeMacro$attribute" type="jetbrains.mps.transformation.TLBase.structure.LoopMacro" id="1201866023936">
            <node role="sourceNodesQuery" type="jetbrains.mps.transformation.TLBase.structure.SourceSubstituteMacro_SourceNodesQuery" id="1201866023937">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201866023938">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1201867939334">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1201867939335">
                    <property name="name" value="root" />
                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1201867939336" />
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227937653">
                      <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1201867939339" />
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1201867939338">
                        <link role="link" targetNodeId="1.1196350785114" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1201867939340">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1201867939341">
                    <property name="name" value="result" />
                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1201867939342" />
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1201867939343">
                      <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListCreator" id="1201867939344">
                        <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1201867939345" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1201867939346">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1201867939347">
                    <property name="name" value="frontier" />
                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1201867939348" />
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1201867939349">
                      <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListCreator" id="1201867939350">
                        <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1201867939351" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1201868064531">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1201868064532">
                    <property name="name" value="model" />
                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SModelType" id="1201868064533" />
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1218220899862">
                      <node role="operand" type="jetbrains.mps.transformation.generationContext.structure.TemplateFunctionParameter_generationContext" id="1218220899864" />
                      <node role="operation" type="jetbrains.mps.transformation.generationContext.structure.GenerationContextOp_GetOutputModel" id="1218220899865" />
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1201867939357">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933355616">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201867939361">
                      <link role="variableDeclaration" targetNodeId="1201867939347" resolveInfo="frontier" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddElementOperation" id="1201867939359">
                      <node role="argument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201867939360">
                        <link role="variableDeclaration" targetNodeId="1201867939335" resolveInfo="root" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1201867939362">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1201867939363">
                    <property name="name" value="newFrontier" />
                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1201867939364" />
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1201867939365">
                      <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListCreator" id="1201867939366">
                        <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1201867939367" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.WhileStatement" id="1201867939368">
                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933355634">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201867939371">
                      <link role="variableDeclaration" targetNodeId="1201867939347" resolveInfo="frontier" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.IsNotEmptyOperation" id="1201867939370" />
                  </node>
                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201867939372">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1201867939373">
                      <node role="iterable" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201867939374">
                        <link role="variableDeclaration" targetNodeId="1201867939347" resolveInfo="frontier" />
                      </node>
                      <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1201867939375">
                        <property name="name" value="node" />
                        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1201867939376" />
                      </node>
                      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201867939377">
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1201867939378">
                          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227927373">
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201869648280">
                              <link role="variableDeclaration" targetNodeId="1201867939375" resolveInfo="node" />
                            </node>
                            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetChildrenOperation" id="1201867939380" />
                          </node>
                          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1201867939382">
                            <property name="name" value="child" />
                            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1201867939383" />
                          </node>
                          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201867939384">
                            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1201867939385">
                              <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1201867939386">
                                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227945818">
                                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201867939388">
                                    <link role="variableDeclaration" targetNodeId="1201867939382" resolveInfo="child" />
                                  </node>
                                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1201867939389">
                                    <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1201867939390">
                                      <link role="conceptDeclaration" targetNodeId="1.1196350785110" resolveInfo="AbstractAntiquotation" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201867939391">
                                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1201867924427">
                                  <node role="iterable" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933354496">
                                    <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SemanticDowncastExpression" id="1201867924429">
                                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201868250040">
                                        <link role="variableDeclaration" targetNodeId="1201867939382" resolveInfo="child" />
                                      </node>
                                    </node>
                                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933354497">
                                      <link role="baseMethodDeclaration" targetNodeId="11.~SNode.getReferences():java.util.List" resolveInfo="getReferences" />
                                    </node>
                                  </node>
                                  <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1201867924431">
                                    <property name="name" value="reference" />
                                    <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1201867924432">
                                      <link role="classifier" targetNodeId="11.~SReference" resolveInfo="SReference" />
                                    </node>
                                  </node>
                                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201867924433">
                                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1201867924434">
                                      <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1201867924435">
                                        <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1201867924436" />
                                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1201867924437">
                                          <link role="baseMethodDeclaration" targetNodeId="21.~ReferenceAntiquotation_AnnotationLink.getReferenceAntiquotation(jetbrains.mps.core.structure.BaseConcept,java.lang.String):jetbrains.mps.quotation.structure.ReferenceAntiquotation" resolveInfo="getReferenceAntiquotation" />
                                          <link role="classConcept" targetNodeId="21.~ReferenceAntiquotation_AnnotationLink" resolveInfo="ReferenceAntiquotation_AnnotationLink" />
                                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1201867924438">
                                            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204672721354">
                                              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201868260995">
                                                <link role="variableDeclaration" targetNodeId="1201867939382" resolveInfo="child" />
                                              </node>
                                              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAdapterOperation" id="1201867924441" />
                                            </node>
                                            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1201867924442">
                                              <link role="classifier" targetNodeId="7.~BaseConcept" resolveInfo="BaseConcept" />
                                            </node>
                                          </node>
                                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933350668">
                                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201867924444">
                                              <link role="variableDeclaration" targetNodeId="1201867924431" resolveInfo="reference" />
                                            </node>
                                            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933350669">
                                              <link role="baseMethodDeclaration" targetNodeId="11.~SReference.getRole():java.lang.String" resolveInfo="getRole" />
                                            </node>
                                          </node>
                                        </node>
                                      </node>
                                      <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201867924445">
                                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ContinueStatement" id="1201867924446" />
                                      </node>
                                    </node>
                                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1201867924447">
                                      <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1201867924448">
                                        <property name="name" value="targetNode" />
                                        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1201867924449" />
                                        <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933351018">
                                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201867924451">
                                            <link role="variableDeclaration" targetNodeId="1201867924431" resolveInfo="reference" />
                                          </node>
                                          <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933351019">
                                            <link role="baseMethodDeclaration" targetNodeId="11.~SReference.getTargetNode():jetbrains.mps.smodel.SNode" resolveInfo="getTargetNode" />
                                          </node>
                                        </node>
                                      </node>
                                    </node>
                                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1201867924452">
                                      <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201867924453">
                                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1201867924454">
                                          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1201867924455">
                                            <property name="name" value="referenceNode" />
                                            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1201867924456">
                                              <link role="classifier" targetNodeId="11.~SNode" resolveInfo="SNode" />
                                            </node>
                                            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933352951">
                                              <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1201867924458">
                                                <link role="baseMethodDeclaration" targetNodeId="7.~BaseConcept.newInstance(jetbrains.mps.smodel.SModel):jetbrains.mps.core.structure.BaseConcept" resolveInfo="newInstance" />
                                                <link role="classConcept" targetNodeId="7.~BaseConcept" resolveInfo="BaseConcept" />
                                                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201868087133">
                                                  <link role="variableDeclaration" targetNodeId="1201868064532" resolveInfo="model" />
                                                </node>
                                              </node>
                                              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933352952">
                                                <link role="baseMethodDeclaration" targetNodeId="11.~BaseAdapter.getNode():jetbrains.mps.smodel.SNode" resolveInfo="getNode" />
                                              </node>
                                            </node>
                                          </node>
                                        </node>
                                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1201867924460">
                                          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933350586">
                                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201867924462">
                                              <link role="variableDeclaration" targetNodeId="1201867924455" resolveInfo="referenceNode" />
                                            </node>
                                            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933350587">
                                              <link role="baseMethodDeclaration" targetNodeId="11.~SNode.setProperty(java.lang.String,java.lang.String):void" resolveInfo="setProperty" />
                                              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1201867924463">
                                                <property name="value" value="role" />
                                              </node>
                                              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933354095">
                                                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201867924465">
                                                  <link role="variableDeclaration" targetNodeId="1201867924431" resolveInfo="reference" />
                                                </node>
                                                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933354096">
                                                  <link role="baseMethodDeclaration" targetNodeId="11.~SReference.getRole():java.lang.String" resolveInfo="getRole" />
                                                </node>
                                              </node>
                                            </node>
                                          </node>
                                        </node>
                                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1201867924466">
                                          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933353991">
                                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201867924468">
                                              <link role="variableDeclaration" targetNodeId="1201867924455" resolveInfo="referenceNode" />
                                            </node>
                                            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933353992">
                                              <link role="baseMethodDeclaration" targetNodeId="11.~SNode.setReferent(java.lang.String,jetbrains.mps.smodel.SNode):jetbrains.mps.smodel.SReference" resolveInfo="setReferent" />
                                              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1201867924469">
                                                <property name="value" value="targetNode" />
                                              </node>
                                              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201867924470">
                                                <link role="variableDeclaration" targetNodeId="1201867924448" resolveInfo="targetNode" />
                                              </node>
                                            </node>
                                          </node>
                                        </node>
                                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1201868218032">
                                          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933351475">
                                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201868218033">
                                              <link role="variableDeclaration" targetNodeId="1201867924455" resolveInfo="referenceNode" />
                                            </node>
                                            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933351476">
                                              <link role="baseMethodDeclaration" targetNodeId="11.~SNode.setReferent(java.lang.String,jetbrains.mps.smodel.SNode):jetbrains.mps.smodel.SReference" resolveInfo="setReferent" />
                                              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1201868224647">
                                                <property name="value" value="sourceNode" />
                                              </node>
                                              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201868230930">
                                                <link role="variableDeclaration" targetNodeId="1201867939382" resolveInfo="child" />
                                              </node>
                                            </node>
                                          </node>
                                        </node>
                                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1201867924471">
                                          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933355751">
                                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201868020841">
                                              <link role="variableDeclaration" targetNodeId="1201867939341" resolveInfo="result" />
                                            </node>
                                            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddElementOperation" id="1201868177089">
                                              <node role="argument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201868179639">
                                                <link role="variableDeclaration" targetNodeId="1201867924455" resolveInfo="referenceNode" />
                                              </node>
                                            </node>
                                          </node>
                                        </node>
                                      </node>
                                      <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1201867924475">
                                        <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227881016">
                                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201868038327">
                                            <link role="variableDeclaration" targetNodeId="1201867939382" resolveInfo="child" />
                                          </node>
                                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1201867924477">
                                            <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1201867924478">
                                              <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1216933355783">
                                                <link role="conceptDeclaration" targetNodeId="1.1196350785113" resolveInfo="Quotation" />
                                              </node>
                                            </node>
                                          </node>
                                        </node>
                                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227928267">
                                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201867924483">
                                            <link role="variableDeclaration" targetNodeId="1201867924448" resolveInfo="targetNode" />
                                          </node>
                                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1201867924481">
                                            <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1201867924482">
                                              <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1216933355753">
                                                <link role="conceptDeclaration" targetNodeId="1.1196350785113" resolveInfo="Quotation" />
                                              </node>
                                            </node>
                                          </node>
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                </node>
                                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1201867939397">
                                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933355599">
                                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201867939401">
                                      <link role="variableDeclaration" targetNodeId="1201867939363" resolveInfo="newFrontier" />
                                    </node>
                                    <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddElementOperation" id="1201867939399">
                                      <node role="argument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201867939400">
                                        <link role="variableDeclaration" targetNodeId="1201867939382" resolveInfo="child" />
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
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1201867939402">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1201867939403">
                        <node role="rValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201867939404">
                          <link role="variableDeclaration" targetNodeId="1201867939363" resolveInfo="newFrontier" />
                        </node>
                        <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201867939405">
                          <link role="variableDeclaration" targetNodeId="1201867939347" resolveInfo="frontier" />
                        </node>
                      </node>
                    </node>
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1201867939406">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1201867939407">
                        <node role="rValue" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1201867939408">
                          <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListCreator" id="1201867939409">
                            <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1201867939410" />
                          </node>
                        </node>
                        <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201867939411">
                          <link role="variableDeclaration" targetNodeId="1201867939363" resolveInfo="newFrontier" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1201867939412">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201867939413">
                    <link role="variableDeclaration" targetNodeId="1201867939341" resolveInfo="result" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1196351887811">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351887812">
            <link role="variableDeclaration" targetNodeId="1196351887800" resolveInfo="result" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1196351887813">
        <property name="name" value="a" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196351887814">
          <link role="classifier" targetNodeId="2.~Object" resolveInfo="Object" />
        </node>
        <node role="nodeMacro$attribute" type="jetbrains.mps.transformation.TLBase.structure.LoopMacro" id="1196351887815">
          <link role="mappingLabel" targetNodeId="1215479323001" resolveInfo="parametersFromExpressions" />
          <node role="sourceNodesQuery" type="jetbrains.mps.transformation.TLBase.structure.SourceSubstituteMacro_SourceNodesQuery" id="1196351887816">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351887817">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1196351887818">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196351887819">
                  <property name="name" value="result" />
                  <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196351887820">
                    <link role="classifier" targetNodeId="16.~List" resolveInfo="List" />
                    <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196351887821">
                      <link role="classifier" targetNodeId="11.~SNode" resolveInfo="SNode" />
                    </node>
                  </node>
                  <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1216933355978">
                    <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1216933355980">
                      <link role="baseMethodDeclaration" targetNodeId="16.~ArrayList.&lt;init&gt;()" resolveInfo="ArrayList" />
                      <node role="typeParameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196352043672">
                        <link role="classifier" targetNodeId="11.~SNode" resolveInfo="SNode" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1196351887823">
                <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1196351887824">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1196351887825" />
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227845438">
                    <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196351887827" />
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1196352032603">
                      <link role="link" targetNodeId="1.1196350785115" />
                    </node>
                  </node>
                </node>
                <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351887829">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196351887830">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933355215">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351887832">
                        <link role="variableDeclaration" targetNodeId="1196351887819" resolveInfo="result" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933355216">
                        <link role="baseMethodDeclaration" targetNodeId="16.~List.add(java.lang.Object):boolean" resolveInfo="add" />
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227889849">
                          <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196351887834" />
                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1196352046657">
                            <link role="link" targetNodeId="1.1196350785115" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1196351887836">
                <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196351887837">
                  <property name="name" value="child" />
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1196351887838" />
                </node>
                <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351887839">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1196351887840">
                    <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351887841">
                      <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196351887842">
                        <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933354547">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351887844">
                            <link role="variableDeclaration" targetNodeId="1196351887819" resolveInfo="result" />
                          </node>
                          <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933354548">
                            <link role="baseMethodDeclaration" targetNodeId="16.~List.add(java.lang.Object):boolean" resolveInfo="add" />
                            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227899528">
                              <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1196351887846">
                                <link role="concept" targetNodeId="1.1196350785110" resolveInfo="AbstractAntiquotation" />
                                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351887847">
                                  <link role="variableDeclaration" targetNodeId="1196351887837" resolveInfo="child" />
                                </node>
                              </node>
                              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1196352050330">
                                <link role="link" targetNodeId="1.1196350785111" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227906650">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351887850">
                        <link role="variableDeclaration" targetNodeId="1196351887837" resolveInfo="child" />
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1196351887851">
                        <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1196351887852">
                          <link role="conceptDeclaration" targetNodeId="1.1196350785110" resolveInfo="AbstractAntiquotation" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="iterable" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227897707">
                  <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196351887854" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetDescendantsOperation" id="1196351887855" />
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1196351887856">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196351887857">
                  <link role="variableDeclaration" targetNodeId="1196351887819" resolveInfo="result" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="propertyMacro$property_attribute$name" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro" id="1196351887858">
          <node role="propertyValueFunction" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro_GetPropertyValue" id="1196351887859">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351887860">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196351887861">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1196351887862">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216933353143">
                    <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1196351887864" />
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216933353144">
                      <link role="baseMethodDeclaration" targetNodeId="11.~SNode.getId():java.lang.String" resolveInfo="getId" />
                    </node>
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1196351887865">
                    <property name="value" value="parameter_" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1196351887866" />
    </node>
    <node role="rootTemplateAnnotation$attribute" type="jetbrains.mps.transformation.TLBase.structure.RootTemplateAnnotation" id="1196351887867">
      <link role="applicableConcept" targetNodeId="1.1196350785113" resolveInfo="Quotation" />
    </node>
    <node role="propertyMacro$property_attribute$name" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro" id="1196351887868">
      <node role="propertyValueFunction" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro_GetPropertyValue" id="1196351887869">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196351887870">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1196351887871">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1218070397524">
              <node role="operand" type="jetbrains.mps.transformation.generationContext.structure.TemplateFunctionParameter_generationContext" id="1218070397526" />
              <node role="operation" type="jetbrains.mps.transformation.generationContext.structure.GenerationContextOp_CreateUniqueName" id="1218070397543">
                <node role="baseName" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1196351887873">
                  <property name="value" value="QuotationClass_" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1196351887876" />
  </node>
</model>

