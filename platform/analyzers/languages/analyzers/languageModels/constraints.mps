<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:73c9a355-2bf0-4466-8a7d-8b8d8a945cd4(jetbrains.mps.analyzers.constraints)">
  <persistence version="4" />
  <refactoringHistory />
  <language namespace="97a52717-898f-4598-8150-573d9fd03868(jetbrains.mps.analyzers)" />
  <language namespace="3f4bc5f5-c6c1-4a28-8b10-c83066ffa4a1(jetbrains.mps.lang.constraints)" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="13744753-c81f-424a-9c1b-cf8943bf4e86(jetbrains.mps.lang.sharedConcepts)" />
  <language namespace="83888646-71ce-4f1c-9c53-c54016f6ad4f(jetbrains.mps.baseLanguage.collections)" />
  <language namespace="7a5dda62-9140-4668-ab76-d5ed1746f2b2(jetbrains.mps.lang.typesystem)" />
  <language namespace="7866978e-a0f0-4cc7-81bc-4d213d9375e1(jetbrains.mps.lang.smodel)" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959030d(jetbrains.mps.lang.constraints.structure)" version="8" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902bc(jetbrains.mps.lang.sharedConcepts.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.lang.smodel.structure)" version="16" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902b4(jetbrains.mps.lang.typesystem.structure)" version="3" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959032e(jetbrains.mps.baseLanguage.collections.structure)" version="7" />
  <languageAspect modelUID="r:73c9a355-2bf0-4466-8a7d-8b8d8a945cd4(jetbrains.mps.analyzers.constraints)" version="-1" />
  <maxImportIndex value="4" />
  <import index="1" modelUID="r:8b09f5e2-b403-4747-aaa3-eac5acb1f753(jetbrains.mps.analyzers.structure)" version="0" />
  <import index="3" modelUID="f:java_stub#jetbrains.mps.util(jetbrains.mps.util@java_stub)" version="-1" />
  <import index="4" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" />
  <node type="jetbrains.mps.lang.constraints.structure.ConceptConstraints:8" id="4217760266503650622">
    <property name="virtualPackage:8" value="Instructions" />
    <link role="concept:8" targetNodeId="1.4217760266503638748:0" resolveInfo="InstructionReference" />
    <node role="defaultScope:8" type="jetbrains.mps.lang.constraints.structure.NodeDefaultSearchScope:8" id="4217760266503650625">
      <node role="searchScopeFactory:8" type="jetbrains.mps.lang.constraints.structure.ConstraintFunction_ReferentSearchScope_Factory:8" id="4217760266503650626">
        <node role="body:8" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4217760266503650627">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4217760266503650628">
            <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4217760266503650629">
              <property name="name:3" value="result" />
              <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeListType:16" id="4217760266503650630">
                <link role="elementConcept:16" targetNodeId="1.6618572076229093258:0" resolveInfo="Instruction" />
              </node>
              <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4217760266503650631">
                <node role="creator:3" type="jetbrains.mps.lang.smodel.structure.SNodeListCreator:16" id="4217760266503650632">
                  <node role="createdType:16" type="jetbrains.mps.lang.smodel.structure.SNodeListType:16" id="4217760266503650633">
                    <link role="elementConcept:16" targetNodeId="1.6618572076229093258:0" resolveInfo="Instruction" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4217760266503650634">
            <node role="variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4217760266503650635">
              <property name="name:3" value="analyzer" />
              <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="4217760266503650636">
                <link role="concept:16" targetNodeId="1.6618572076229093257:0" resolveInfo="Analyzer" />
              </node>
            </node>
            <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4217760266503650637">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4217760266503650638">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4217760266503650639">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4217760266503650640">
                    <link role="variableDeclaration:3" targetNodeId="4217760266503650629" resolveInfo="result" />
                  </node>
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.collections.structure.AddAllElementsOperation:7" id="4217760266503650641">
                    <node role="argument:7" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4217760266503650642">
                      <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4217760266503650643">
                        <link role="variableDeclaration:3" targetNodeId="4217760266503650635" resolveInfo="analyzer" />
                      </node>
                      <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess:16" id="4217760266503650644">
                        <link role="link:16" targetNodeId="1.3325264799421088056:0" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="iterable:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4217760266503650645">
              <node role="operand:3" type="jetbrains.mps.lang.sharedConcepts.structure.ConceptFunctionParameter_model:0" id="4217760266503650646" />
              <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.Model_RootsIncludingImportedOperation:16" id="4217760266503650647">
                <link role="concept:16" targetNodeId="1.6618572076229093257:0" resolveInfo="Analyzer" />
                <node role="scope:16" type="jetbrains.mps.lang.sharedConcepts.structure.ConceptFunctionParameter_scope:0" id="4217760266503650648" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4217760266503650649">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4217760266503650650">
              <link role="variableDeclaration:3" targetNodeId="4217760266503650629" resolveInfo="result" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.constraints.structure.ConceptConstraints:8" id="95073643532950051">
    <property name="virtualPackage:8" value="Analyzer" />
    <link role="concept:8" targetNodeId="1.95073643532950033:0" resolveInfo="AnalyzerRunnerAnalyzeOperation" />
    <node role="canBeChild:8" type="jetbrains.mps.lang.constraints.structure.ConstraintFunction_CanBeAChild:8" id="95073643532950052">
      <node role="body:8" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="95073643532950053">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="95073643532950054">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AndExpression:3" id="95073643532950055">
            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="95073643532950056">
              <node role="operand:3" type="jetbrains.mps.lang.constraints.structure.ConstraintFunctionParameter_parentNode:8" id="95073643532950057" />
              <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation:16" id="95073643532950058">
                <node role="conceptArgument:16" type="jetbrains.mps.lang.smodel.structure.RefConcept_Reference:16" id="95073643532950059">
                  <link role="conceptDeclaration:16" targetNodeId="4.1197027756228:3" resolveInfo="DotExpression" />
                </node>
              </node>
            </node>
            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="95073643532950060">
              <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="95073643532950061" />
              <node role="leftExpression:3" type="jetbrains.mps.lang.typesystem.structure.CoerceExpression:3" id="95073643532950062">
                <node role="pattern:3" type="jetbrains.mps.lang.typesystem.structure.ConceptReference:3" id="95073643532950063">
                  <property name="name:3" value="analyzerRunnerType" />
                  <link role="concept:3" targetNodeId="1.2045671745393426211:0" resolveInfo="AnalyzerRunnerType" />
                </node>
                <node role="nodeToCoerce:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="95073643532950064">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="95073643532950065">
                    <node role="operand:3" type="jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression:16" id="95073643532950066">
                      <link role="concept:16" targetNodeId="4.1197027756228:3" resolveInfo="DotExpression" />
                      <node role="leftExpression:16" type="jetbrains.mps.lang.constraints.structure.ConstraintFunctionParameter_parentNode:8" id="95073643532950067" />
                    </node>
                    <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.SLinkAccess:16" id="95073643532950068">
                      <link role="link:16" targetNodeId="4.1197027771414:3" />
                    </node>
                  </node>
                  <node role="operation:3" type="jetbrains.mps.lang.typesystem.structure.Node_TypeOperation:3" id="95073643532950069" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.constraints.structure.ConceptConstraints:8" id="178770917832460637">
    <property name="virtualPackage:8" value="Analyzer" />
    <link role="concept:8" targetNodeId="1.95073643532950038:0" resolveInfo="AnalyzerRunnerCreator" />
    <node role="referent:8" type="jetbrains.mps.lang.constraints.structure.NodeReferentConstraint:8" id="178770917832460638">
      <link role="applicableLink:8" targetNodeId="1.95073643532950039:0" />
      <node role="searchScopeFactory:8" type="jetbrains.mps.lang.constraints.structure.ConstraintFunction_ReferentSearchScope_Factory:8" id="178770917832460639">
        <node role="body:8" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="178770917832460640">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="178770917832460641">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="178770917832460643">
              <node role="operand:3" type="jetbrains.mps.lang.sharedConcepts.structure.ConceptFunctionParameter_model:0" id="178770917832460642" />
              <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.Model_RootsIncludingImportedOperation:16" id="178770917832460647">
                <link role="concept:16" targetNodeId="1.6618572076229093257:0" resolveInfo="Analyzer" />
                <node role="scope:16" type="jetbrains.mps.lang.sharedConcepts.structure.ConceptFunctionParameter_scope:0" id="178770917832460649" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.constraints.structure.ConceptConstraints:8" id="7985661997283725842">
    <property name="virtualPackage:8" value="Instructions" />
    <link role="concept:8" targetNodeId="1.7985661997283714146:0" resolveInfo="InstructionType" />
    <node role="referent:8" type="jetbrains.mps.lang.constraints.structure.NodeReferentConstraint:8" id="7985661997283726526">
      <link role="applicableLink:8" targetNodeId="1.7985661997283714147:0" />
      <node role="searchScopeFactory:8" type="jetbrains.mps.lang.constraints.structure.ConstraintFunction_ReferentSearchScope_Factory:8" id="7985661997283726527">
        <node role="body:8" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="7985661997283726528">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="7985661997283726529">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="7985661997283726540">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="7985661997283726531">
                <node role="operand:3" type="jetbrains.mps.lang.constraints.structure.ConceptParameter_ReferentSearchScope_enclosingNode:8" id="7985661997283726530" />
                <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.Node_GetAncestorOperation:16" id="7985661997283726535">
                  <node role="parameter:16" type="jetbrains.mps.lang.smodel.structure.OperationParm_Concept:16" id="7985661997283726536">
                    <node role="conceptArgument:16" type="jetbrains.mps.lang.smodel.structure.RefConcept_Reference:16" id="7985661997283726539">
                      <link role="conceptDeclaration:16" targetNodeId="1.6618572076229093257:0" resolveInfo="Analyzer" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess:16" id="7985661997283726544">
                <link role="link:16" targetNodeId="1.3325264799421088056:0" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="canBeChild:8" type="jetbrains.mps.lang.constraints.structure.ConstraintFunction_CanBeAChild:8" id="7985661997283725843">
      <node role="body:8" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="7985661997283725844">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="7985661997283726510">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="7985661997283726522">
            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="7985661997283726525" />
            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="7985661997283726512">
              <node role="operand:3" type="jetbrains.mps.lang.constraints.structure.ConstraintFunctionParameter_parentNode:8" id="7985661997283726511" />
              <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.Node_GetAncestorOperation:16" id="7985661997283726516">
                <node role="parameter:16" type="jetbrains.mps.lang.smodel.structure.OperationParm_Concept:16" id="7985661997283726517">
                  <node role="conceptArgument:16" type="jetbrains.mps.lang.smodel.structure.RefConcept_Reference:16" id="7985661997283726521">
                    <link role="conceptDeclaration:16" targetNodeId="1.6618572076229093257:0" resolveInfo="Analyzer" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.constraints.structure.ConceptConstraints:8" id="4943044633101742685">
    <property name="virtualPackage:8" value="Rules" />
    <link role="concept:8" targetNodeId="1.4943044633101449694:0" resolveInfo="ConceptCondition" />
  </node>
  <node type="jetbrains.mps.lang.constraints.structure.ConceptConstraints:8" id="4943044633102057755">
    <property name="virtualPackage:8" value="Rules" />
    <link role="concept:8" targetNodeId="1.4943044633102057744:0" resolveInfo="ApplicableNodeReference" />
    <node role="referent:8" type="jetbrains.mps.lang.constraints.structure.NodeReferentConstraint:8" id="4943044633102057776">
      <link role="applicableLink:8" targetNodeId="1.4943044633102057745:0" />
      <node role="searchScopeFactory:8" type="jetbrains.mps.lang.constraints.structure.ConstraintFunction_ReferentSearchScope_Factory:8" id="4943044633102057777">
        <node role="body:8" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4943044633102057778">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4943044633102057801">
            <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4943044633102057802">
              <property name="name:3" value="result" />
              <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeListType:16" id="4943044633102057803">
                <link role="elementConcept:16" targetNodeId="1.4943044633101449694:0" resolveInfo="ConceptCondition" />
              </node>
              <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4943044633102057805">
                <node role="creator:3" type="jetbrains.mps.lang.smodel.structure.SNodeListCreator:16" id="4943044633102057806">
                  <node role="createdType:16" type="jetbrains.mps.lang.smodel.structure.SNodeListType:16" id="4943044633102057807">
                    <link role="elementConcept:16" targetNodeId="1.4943044633101449694:0" resolveInfo="ConceptCondition" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4943044633102118271">
            <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4943044633102118272">
              <property name="name:3" value="rule" />
              <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="4943044633102118273">
                <link role="concept:16" targetNodeId="1.430844094082168520:0" resolveInfo="Rule" />
              </node>
              <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4943044633102118275">
                <node role="operand:3" type="jetbrains.mps.lang.constraints.structure.ConceptParameter_ReferentSearchScope_enclosingNode:8" id="4943044633102118276" />
                <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.Node_GetAncestorOperation:16" id="4943044633102118277">
                  <node role="parameter:16" type="jetbrains.mps.lang.smodel.structure.OperationParm_Concept:16" id="4943044633102118278">
                    <node role="conceptArgument:16" type="jetbrains.mps.lang.smodel.structure.RefConcept_Reference:16" id="4943044633102119210">
                      <link role="conceptDeclaration:16" targetNodeId="1.430844094082168520:0" resolveInfo="Rule" />
                    </node>
                  </node>
                  <node role="parameter:16" type="jetbrains.mps.lang.smodel.structure.OperationParm_Inclusion:16" id="4943044633102118750" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4943044633102119212">
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4943044633102119213">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4943044633102119239">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4943044633102119240">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4943044633102119241">
                    <link role="variableDeclaration:3" targetNodeId="4943044633102057802" resolveInfo="result" />
                  </node>
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.collections.structure.AddElementOperation:7" id="4943044633102119242">
                    <node role="argument:7" type="jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression:16" id="4943044633102119250">
                      <link role="concept:16" targetNodeId="1.4943044633101449694:0" resolveInfo="ConceptCondition" />
                      <node role="leftExpression:16" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4943044633102119244">
                        <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4943044633102119243">
                          <link role="variableDeclaration:3" targetNodeId="4943044633102118272" resolveInfo="rule" />
                        </node>
                        <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.SLinkAccess:16" id="4943044633102119248">
                          <link role="link:16" targetNodeId="1.3325264799421290838:0" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.AndExpression:3" id="4943044633102119231">
              <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="4943044633102119235">
                <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4943044633102119238" />
                <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4943044633102119234">
                  <link role="variableDeclaration:3" targetNodeId="4943044633102118272" resolveInfo="rule" />
                </node>
              </node>
              <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4943044633102119222">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4943044633102119217">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4943044633102119216">
                    <link role="variableDeclaration:3" targetNodeId="4943044633102118272" resolveInfo="rule" />
                  </node>
                  <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.SLinkAccess:16" id="4943044633102119221">
                    <link role="link:16" targetNodeId="1.3325264799421290838:0" />
                  </node>
                </node>
                <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation:16" id="4943044633102119226">
                  <node role="conceptArgument:16" type="jetbrains.mps.lang.smodel.structure.RefConcept_Reference:16" id="4943044633102119249">
                    <link role="conceptDeclaration:16" targetNodeId="1.4943044633101449694:0" resolveInfo="ConceptCondition" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4943044633102057779">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4943044633102057820">
              <link role="variableDeclaration:3" targetNodeId="4943044633102057802" resolveInfo="result" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.constraints.structure.ConceptConstraints:8" id="8424563347437838493">
    <link role="concept:8" targetNodeId="1.4217760266503579796:0" resolveInfo="EmitInstruction" />
  </node>
</model>

