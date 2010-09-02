<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:00000000-0000-4000-0000-011c89590343(jetbrains.mps.lang.pattern.typesystem)">
  <persistence version="4" />
  <refactoringHistory />
  <language namespace="7a5dda62-9140-4668-ab76-d5ed1746f2b2(jetbrains.mps.lang.typesystem)" />
  <language namespace="7866978e-a0f0-4cc7-81bc-4d213d9375e1(jetbrains.mps.lang.smodel)" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="3a13115c-633c-4c5c-bbcc-75c4219e9555(jetbrains.mps.lang.quotation)" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902ae(jetbrains.mps.lang.typesystem.constraints)" version="17" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590340(jetbrains.mps.lang.pattern.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902fb(jetbrains.mps.lang.smodel.constraints)" version="21" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.lang.smodel.structure)" version="16" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902c1(jetbrains.mps.baseLanguage.constraints)" version="83" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590283(jetbrains.mps.lang.core.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959030d(jetbrains.mps.lang.constraints.structure)" version="1" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959032e(jetbrains.mps.baseLanguage.collections.structure)" version="1" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590338(jetbrains.mps.baseLanguage.closures.structure)" version="3" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959028c(jetbrains.mps.lang.structure.constraints)" version="11" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590328(jetbrains.mps.baseLanguage.collections.constraints)" version="6" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590334(jetbrains.mps.baseLanguage.closures.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895903e4(jetbrains.mps.internal.collections.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902db(jetbrains.mps.baseLanguage.blTypes.constraints)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.lang.structure.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959033d(jetbrains.mps.lang.annotations.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959034b(jetbrains.mps.lang.quotation.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590345(jetbrains.mps.lang.pattern.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902b4(jetbrains.mps.lang.typesystem.structure)" version="3" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895903fe(jetbrains.mps.baseLanguage.strings.constraints)" version="1" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590402(jetbrains.mps.baseLanguage.strings.structure)" version="9" />
  <maxImportIndex value="8" />
  <import index="1" modelUID="r:00000000-0000-4000-0000-011c89590345(jetbrains.mps.lang.pattern.structure)" version="0" />
  <import index="4" modelUID="f:java_stub#jetbrains.mps.smodel(jetbrains.mps.smodel@java_stub)" version="-1" />
  <import index="5" modelUID="r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.lang.structure.structure)" version="0" />
  <import index="7" modelUID="r:00000000-0000-4000-0000-011c8959028b(jetbrains.mps.lang.structure.behavior)" version="-1" />
  <import index="8" modelUID="f:java_stub#java.util(java.util@java_stub)" version="-1" />
  <node type="jetbrains.mps.lang.typesystem.structure.InferenceRule:3" id="1196515055991">
    <property name="name:3" value="typeof_PatternExpression" />
    <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="1196515055992">
      <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="1196515055993">
        <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="1196515055994">
          <property name="name:3" value="patternExpression1" />
          <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="1196515055995">
            <link role="concept:16" targetNodeId="1.1136720037777:0" resolveInfo="PatternExpression" />
          </node>
          <node role="initializer:3" type="jetbrains.mps.lang.typesystem.structure.ApplicableNodeReference:3" id="1196515055996">
            <link role="applicableNode:3" targetNodeId="1196515056007" resolveInfo="patternExpression" />
          </node>
        </node>
      </node>
      <node role="statement:3" type="jetbrains.mps.lang.typesystem.structure.CreateEquationStatement:3" id="1223981705727">
        <node role="leftExpression:3" type="jetbrains.mps.lang.typesystem.structure.NormalTypeClause:3" id="1223981705730">
          <node role="normalType:3" type="jetbrains.mps.lang.typesystem.structure.TypeOfExpression:3" id="1223981705732">
            <node role="term:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="1196515056006">
              <link role="variableDeclaration:3" targetNodeId="1196515055994" resolveInfo="patternExpression" />
            </node>
          </node>
        </node>
        <node role="rightExpression:3" type="jetbrains.mps.lang.typesystem.structure.NormalTypeClause:3" id="1223981705734">
          <node role="normalType:3" type="jetbrains.mps.lang.quotation.structure.Quotation:0" id="1196515055998">
            <node role="quotedNode:0" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="1196515055999">
              <node role="referenceAntiquotation$link_attribute$concept:16" type="jetbrains.mps.lang.quotation.structure.ReferenceAntiquotation:0" id="1196515056000">
                <node role="expression:0" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="1204227946775">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="1204227904761">
                    <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="1196515056003">
                      <link role="variableDeclaration:3" targetNodeId="1196515055994" resolveInfo="patternExpression" />
                    </node>
                    <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.SLinkAccess:16" id="1196515056004">
                      <link role="link:16" targetNodeId="1.1136720037778:0" />
                    </node>
                  </node>
                  <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.Node_GetConceptOperation:16" id="1196515056005" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="applicableNode:3" type="jetbrains.mps.lang.typesystem.structure.ConceptReference:3" id="1196515056007">
      <property name="name:3" value="patternExpression" />
      <link role="concept:3" targetNodeId="1.1136720037777:0" resolveInfo="PatternExpression" />
    </node>
  </node>
  <node type="jetbrains.mps.lang.typesystem.structure.InferenceRule:3" id="1202483500731">
    <property name="name:3" value="typeof_LinkPatternVariableDeclaration" />
    <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="1202483500732">
      <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="1202483513156">
        <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="1202483513157">
          <property name="name:3" value="parent" />
          <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="1202483513158" />
          <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="1204227960064">
            <node role="operand:3" type="jetbrains.mps.lang.typesystem.structure.ApplicableNodeReference:3" id="1202483519051">
              <link role="applicableNode:3" targetNodeId="1202483500733" resolveInfo="nodeToCheck" />
            </node>
            <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.Node_GetParentOperation:16" id="1202483523133" />
          </node>
        </node>
      </node>
      <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="1202483548898">
        <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="1202483548899">
          <property name="name:3" value="role" />
          <node role="type:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="1225192346674" />
          <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="1202484632546">
            <link role="baseMethodDeclaration:3" targetNodeId="4.~AttributesRolesUtil.getLinkRoleFromLinkAttributeRole(java.lang.String):java.lang.String" resolveInfo="getLinkRoleFromLinkAttributeRole" />
            <link role="classConcept:3" targetNodeId="4.~AttributesRolesUtil" resolveInfo="AttributesRolesUtil" />
            <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="1212195018501">
              <node role="operand:3" type="jetbrains.mps.lang.smodel.structure.SemanticDowncastExpression:16" id="1202484642926">
                <node role="leftExpression:16" type="jetbrains.mps.lang.typesystem.structure.ApplicableNodeReference:3" id="1202484636250">
                  <link role="applicableNode:3" targetNodeId="1202483500733" resolveInfo="nodeToCheck" />
                </node>
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="1212195018502">
                <link role="baseMethodDeclaration:3" targetNodeId="4.~SNode.getRole_():java.lang.String" resolveInfo="getRole_" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="1202484670182">
        <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="1202484670183">
          <property name="name:3" value="linkDeclaration" />
          <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="1202484670184">
            <link role="concept:16" targetNodeId="5.1071489288298:0" resolveInfo="LinkDeclaration" />
          </node>
          <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="1212195009058">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="1212195006211">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="1212195003491">
                <link role="variableDeclaration:3" targetNodeId="1202483513157" resolveInfo="parent" />
              </node>
              <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.Node_GetConceptOperation:16" id="1212195007870" />
            </node>
            <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.Node_ConceptMethodCall:16" id="1212195010780">
              <link role="baseMethodDeclaration:16" targetNodeId="7.1213877394467" resolveInfo="findLinkDeclaration" />
              <node role="actualArgument:16" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="1212195012797">
                <link role="variableDeclaration:3" targetNodeId="1202483548899" resolveInfo="role" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="statement:3" type="jetbrains.mps.lang.typesystem.structure.CreateEquationStatement:3" id="1202486181555">
        <node role="rightExpression:3" type="jetbrains.mps.lang.typesystem.structure.NormalTypeClause:3" id="1202486183684">
          <node role="normalType:3" type="jetbrains.mps.lang.quotation.structure.Quotation:0" id="1202486183685">
            <node role="quotedNode:0" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="1202486186234">
              <node role="referenceAntiquotation$link_attribute$concept:16" type="jetbrains.mps.lang.quotation.structure.ReferenceAntiquotation:0" id="1202486188672">
                <node role="expression:0" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="1204227886943">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="1202486194205">
                    <link role="variableDeclaration:3" targetNodeId="1202484670183" resolveInfo="linkDeclaration" />
                  </node>
                  <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.SLinkAccess:16" id="1202486199491">
                    <link role="link:16" targetNodeId="5.1071599976176:0" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="leftExpression:3" type="jetbrains.mps.lang.typesystem.structure.NormalTypeClause:3" id="1202486181558">
          <node role="normalType:3" type="jetbrains.mps.lang.typesystem.structure.TypeOfExpression:3" id="1202486174317">
            <node role="term:3" type="jetbrains.mps.lang.typesystem.structure.ApplicableNodeReference:3" id="1202486176522">
              <link role="applicableNode:3" targetNodeId="1202483500733" resolveInfo="nodeToCheck" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="applicableNode:3" type="jetbrains.mps.lang.typesystem.structure.ConceptReference:3" id="1202483500733">
      <property name="name:3" value="nodeToCheck" />
      <link role="concept:3" targetNodeId="1.1137418540378:0" resolveInfo="LinkPatternVariableDeclaration" />
    </node>
  </node>
  <node type="jetbrains.mps.lang.typesystem.structure.InferenceRule:3" id="1202488162378">
    <property name="name:3" value="typeof_PropertyPatternVariableDeclaration" />
    <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="1202488162379">
      <node role="statement:3" type="jetbrains.mps.lang.typesystem.structure.CreateEquationStatement:3" id="1202488174301">
        <node role="rightExpression:3" type="jetbrains.mps.lang.typesystem.structure.NormalTypeClause:3" id="1202488176883">
          <node role="normalType:3" type="jetbrains.mps.lang.quotation.structure.Quotation:0" id="1202488176884">
            <node role="quotedNode:0" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="1225192349861" />
          </node>
        </node>
        <node role="leftExpression:3" type="jetbrains.mps.lang.typesystem.structure.NormalTypeClause:3" id="1202488174304">
          <node role="normalType:3" type="jetbrains.mps.lang.typesystem.structure.TypeOfExpression:3" id="1202488170860">
            <node role="term:3" type="jetbrains.mps.lang.typesystem.structure.ApplicableNodeReference:3" id="1202488172456">
              <link role="applicableNode:3" targetNodeId="1202488162380" resolveInfo="nodeToCheck" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="applicableNode:3" type="jetbrains.mps.lang.typesystem.structure.ConceptReference:3" id="1202488162380">
      <property name="name:3" value="nodeToCheck" />
      <link role="concept:3" targetNodeId="1.1136720037781:0" resolveInfo="PropertyPatternVariableDeclaration" />
    </node>
  </node>
  <node type="jetbrains.mps.lang.typesystem.structure.InferenceRule:3" id="1202488392899">
    <property name="name:3" value="typeof_PatternVariableDeclaration" />
    <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="1202488392900">
      <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="1202488411718">
        <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="1202488411719">
          <property name="name:3" value="attributedNode" />
          <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="1202488411720" />
          <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="1204227929486">
            <node role="operand:3" type="jetbrains.mps.lang.typesystem.structure.ApplicableNodeReference:3" id="1202488411723">
              <link role="applicableNode:3" targetNodeId="1202488392901" resolveInfo="nodeToCheck" />
            </node>
            <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.Node_GetParentOperation:16" id="1202488411722" />
          </node>
        </node>
      </node>
      <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="1202488433157">
        <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="1202488433158">
          <property name="name:3" value="parent" />
          <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="1202488433159" />
          <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="1204227842295">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="1202488444114">
              <link role="variableDeclaration:3" targetNodeId="1202488411719" resolveInfo="attributedNode" />
            </node>
            <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.Node_GetParentOperation:16" id="1202488448337" />
          </node>
        </node>
      </node>
      <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="1202488455901">
        <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="1202488455902">
          <node role="statement:3" type="jetbrains.mps.lang.typesystem.structure.CreateEquationStatement:3" id="1202488480088">
            <node role="rightExpression:3" type="jetbrains.mps.lang.typesystem.structure.NormalTypeClause:3" id="1202488481889">
              <node role="normalType:3" type="jetbrains.mps.lang.quotation.structure.Quotation:0" id="1202488481890">
                <node role="quotedNode:0" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="1202488483767" />
              </node>
            </node>
            <node role="leftExpression:3" type="jetbrains.mps.lang.typesystem.structure.NormalTypeClause:3" id="1202488480091">
              <node role="normalType:3" type="jetbrains.mps.lang.typesystem.structure.TypeOfExpression:3" id="1202488469553">
                <node role="term:3" type="jetbrains.mps.lang.typesystem.structure.ApplicableNodeReference:3" id="1202488474118">
                  <link role="applicableNode:3" targetNodeId="1202488392901" resolveInfo="nodeToCheck" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="1202488458532">
          <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="1202488460425" />
          <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="1202488456921">
            <link role="variableDeclaration:3" targetNodeId="1202488433158" resolveInfo="parent" />
          </node>
        </node>
        <node role="ifFalseStatement:3" type="jetbrains.mps.baseLanguage.structure.BlockStatement:3" id="1202488488019">
          <node role="statements:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="1202488488020">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="1202488496523">
              <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="1202488496524">
                <property name="name:3" value="role" />
                <node role="type:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="1225192346156" />
                <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="1212195103271">
                  <node role="operand:3" type="jetbrains.mps.lang.smodel.structure.SemanticDowncastExpression:16" id="1202488632494">
                    <node role="leftExpression:16" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="1202488630102">
                      <link role="variableDeclaration:3" targetNodeId="1202488411719" resolveInfo="attributedNode" />
                    </node>
                  </node>
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="1212195103272">
                    <link role="baseMethodDeclaration:3" targetNodeId="4.~SNode.getRole_():java.lang.String" resolveInfo="getRole_" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="1202488496530">
              <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="1202488496531">
                <property name="name:3" value="linkDeclaration" />
                <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="1202488496532">
                  <link role="concept:16" targetNodeId="5.1071489288298:0" resolveInfo="LinkDeclaration" />
                </node>
                <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="1212195098796">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="1212195098797">
                    <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="1212195098798">
                      <link role="variableDeclaration:3" targetNodeId="1202488433158" resolveInfo="parent" />
                    </node>
                    <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.Node_GetConceptOperation:16" id="1212195098799" />
                  </node>
                  <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.Node_ConceptMethodCall:16" id="1212195098800">
                    <link role="baseMethodDeclaration:16" targetNodeId="7.1213877394467" resolveInfo="findLinkDeclaration" />
                    <node role="actualArgument:16" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="1212195098801">
                      <link role="variableDeclaration:3" targetNodeId="1202488496524" resolveInfo="role" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.lang.typesystem.structure.CreateEquationStatement:3" id="1202488496543">
              <node role="rightExpression:3" type="jetbrains.mps.lang.typesystem.structure.NormalTypeClause:3" id="1202488496544">
                <node role="normalType:3" type="jetbrains.mps.lang.quotation.structure.Quotation:0" id="1202488496545">
                  <node role="quotedNode:0" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="1202488496546">
                    <node role="referenceAntiquotation$link_attribute$concept:16" type="jetbrains.mps.lang.quotation.structure.ReferenceAntiquotation:0" id="1202488496547">
                      <node role="expression:0" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="1204227921532">
                        <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="1202488496550">
                          <link role="variableDeclaration:3" targetNodeId="1202488496531" resolveInfo="linkDeclaration" />
                        </node>
                        <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.SLinkAccess:16" id="1202488496549">
                          <link role="link:16" targetNodeId="5.1071599976176:0" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="leftExpression:3" type="jetbrains.mps.lang.typesystem.structure.NormalTypeClause:3" id="1202488496551">
                <node role="normalType:3" type="jetbrains.mps.lang.typesystem.structure.TypeOfExpression:3" id="1202488496552">
                  <node role="term:3" type="jetbrains.mps.lang.typesystem.structure.ApplicableNodeReference:3" id="1202488496553">
                    <link role="applicableNode:3" targetNodeId="1202488392901" resolveInfo="nodeToCheck" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="applicableNode:3" type="jetbrains.mps.lang.typesystem.structure.ConceptReference:3" id="1202488392901">
      <property name="name:3" value="nodeToCheck" />
      <link role="concept:3" targetNodeId="1.1136720037779:0" resolveInfo="PatternVariableDeclaration" />
    </node>
  </node>
  <node type="jetbrains.mps.lang.typesystem.structure.InferenceRule:3" id="1202491110369">
    <property name="name:3" value="typeof_AsPattern" />
    <property name="overrides:3" value="true" />
    <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="1202491110370">
      <node role="statement:3" type="jetbrains.mps.lang.typesystem.structure.CreateEquationStatement:3" id="1202491123370">
        <node role="rightExpression:3" type="jetbrains.mps.lang.typesystem.structure.NormalTypeClause:3" id="1202491125108">
          <node role="normalType:3" type="jetbrains.mps.lang.quotation.structure.Quotation:0" id="1202491125109">
            <node role="quotedNode:0" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="1202491126596">
              <node role="referenceAntiquotation$link_attribute$concept:16" type="jetbrains.mps.lang.quotation.structure.ReferenceAntiquotation:0" id="1202491128034">
                <node role="expression:0" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="1204227899979">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="1204227919175">
                    <node role="operand:3" type="jetbrains.mps.lang.typesystem.structure.ApplicableNodeReference:3" id="1202491129224">
                      <link role="applicableNode:3" targetNodeId="1202491110371" resolveInfo="nodeToCheck" />
                    </node>
                    <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.Node_GetParentOperation:16" id="1202491133603" />
                  </node>
                  <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.Node_GetConceptOperation:16" id="1202491137482" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="leftExpression:3" type="jetbrains.mps.lang.typesystem.structure.NormalTypeClause:3" id="1202491123373">
          <node role="normalType:3" type="jetbrains.mps.lang.typesystem.structure.TypeOfExpression:3" id="1202491120336">
            <node role="term:3" type="jetbrains.mps.lang.typesystem.structure.ApplicableNodeReference:3" id="1202491121603">
              <link role="applicableNode:3" targetNodeId="1202491110371" resolveInfo="nodeToCheck" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="applicableNode:3" type="jetbrains.mps.lang.typesystem.structure.ConceptReference:3" id="1202491110371">
      <property name="name:3" value="nodeToCheck" />
      <link role="concept:3" targetNodeId="1.1136720037773:0" resolveInfo="AsPattern" />
    </node>
  </node>
  <node type="jetbrains.mps.lang.typesystem.structure.InferenceRule:3" id="1202491204038">
    <property name="name:3" value="typeof_ListPattern" />
    <property name="overrides:3" value="true" />
    <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="1202491204039">
      <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="1202491231717">
        <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="1202491231718">
          <property name="name:3" value="attributedNode" />
          <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="1202491231719" />
          <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="1204227841046">
            <node role="operand:3" type="jetbrains.mps.lang.typesystem.structure.ApplicableNodeReference:3" id="1202491231722">
              <link role="applicableNode:3" targetNodeId="1202491204040" resolveInfo="nodeToCheck" />
            </node>
            <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.Node_GetParentOperation:16" id="1202491231721" />
          </node>
        </node>
      </node>
      <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="1202491231723">
        <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="1202491231724">
          <property name="name:3" value="parent" />
          <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="1202491231725" />
          <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="1204227939245">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="1202491231728">
              <link role="variableDeclaration:3" targetNodeId="1202491231718" resolveInfo="attributedNode" />
            </node>
            <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.Node_GetParentOperation:16" id="1202491231727" />
          </node>
        </node>
      </node>
      <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="1202491231729">
        <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="1202491231730">
          <node role="statement:3" type="jetbrains.mps.lang.typesystem.structure.CreateEquationStatement:3" id="1202491231731">
            <node role="rightExpression:3" type="jetbrains.mps.lang.typesystem.structure.NormalTypeClause:3" id="1202491231732">
              <node role="normalType:3" type="jetbrains.mps.lang.quotation.structure.Quotation:0" id="1202491231733">
                <node role="quotedNode:0" type="jetbrains.mps.lang.smodel.structure.SNodeListType:16" id="1202491239915" />
              </node>
            </node>
            <node role="leftExpression:3" type="jetbrains.mps.lang.typesystem.structure.NormalTypeClause:3" id="1202491231735">
              <node role="normalType:3" type="jetbrains.mps.lang.typesystem.structure.TypeOfExpression:3" id="1202491231736">
                <node role="term:3" type="jetbrains.mps.lang.typesystem.structure.ApplicableNodeReference:3" id="1202491231737">
                  <link role="applicableNode:3" targetNodeId="1202491204040" resolveInfo="nodeToCheck" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="1202491231738">
          <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="1202491231739" />
          <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="1202491231740">
            <link role="variableDeclaration:3" targetNodeId="1202491231724" resolveInfo="parent" />
          </node>
        </node>
        <node role="ifFalseStatement:3" type="jetbrains.mps.baseLanguage.structure.BlockStatement:3" id="1202491231741">
          <node role="statements:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="1202491231742">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="1202491231743">
              <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="1202491231744">
                <property name="name:3" value="role" />
                <node role="type:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="1225192345214" />
                <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="1212195068310">
                  <node role="operand:3" type="jetbrains.mps.lang.smodel.structure.SemanticDowncastExpression:16" id="1202491231747">
                    <node role="leftExpression:16" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="1202491231748">
                      <link role="variableDeclaration:3" targetNodeId="1202491231718" resolveInfo="attributedNode" />
                    </node>
                  </node>
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="1212195068311">
                    <link role="baseMethodDeclaration:3" targetNodeId="4.~SNode.getRole_():java.lang.String" resolveInfo="getRole_" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="1202491231749">
              <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="1202491231750">
                <property name="name:3" value="linkDeclaration" />
                <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="1202491231751">
                  <link role="concept:16" targetNodeId="5.1071489288298:0" resolveInfo="LinkDeclaration" />
                </node>
                <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="1212195057227">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="1212195054894">
                    <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="1212195053175">
                      <link role="variableDeclaration:3" targetNodeId="1202491231724" resolveInfo="parent" />
                    </node>
                    <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.Node_GetConceptOperation:16" id="1212195056741" />
                  </node>
                  <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.Node_ConceptMethodCall:16" id="1212195061792">
                    <link role="baseMethodDeclaration:16" targetNodeId="7.1213877394467" resolveInfo="findLinkDeclaration" />
                    <node role="actualArgument:16" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="1212195063621">
                      <link role="variableDeclaration:3" targetNodeId="1202491231744" resolveInfo="role" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.lang.typesystem.structure.CreateEquationStatement:3" id="1202491231762">
              <node role="rightExpression:3" type="jetbrains.mps.lang.typesystem.structure.NormalTypeClause:3" id="1202491231763">
                <node role="normalType:3" type="jetbrains.mps.lang.quotation.structure.Quotation:0" id="1202491231764">
                  <node role="quotedNode:0" type="jetbrains.mps.lang.smodel.structure.SNodeListType:16" id="1202491245306">
                    <node role="referenceAntiquotation$link_attribute$elementConcept:16" type="jetbrains.mps.lang.quotation.structure.ReferenceAntiquotation:0" id="1202491246870">
                      <node role="expression:0" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="1204227892230">
                        <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="1202491248372">
                          <link role="variableDeclaration:3" targetNodeId="1202491231750" resolveInfo="linkDeclaration" />
                        </node>
                        <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.SLinkAccess:16" id="1202491272246">
                          <link role="link:16" targetNodeId="5.1071599976176:0" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="leftExpression:3" type="jetbrains.mps.lang.typesystem.structure.NormalTypeClause:3" id="1202491231770">
                <node role="normalType:3" type="jetbrains.mps.lang.typesystem.structure.TypeOfExpression:3" id="1202491231771">
                  <node role="term:3" type="jetbrains.mps.lang.typesystem.structure.ApplicableNodeReference:3" id="1202491231772">
                    <link role="applicableNode:3" targetNodeId="1202491204040" resolveInfo="nodeToCheck" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="applicableNode:3" type="jetbrains.mps.lang.typesystem.structure.ConceptReference:3" id="1202491204040">
      <property name="name:3" value="nodeToCheck" />
      <link role="concept:3" targetNodeId="1.1136727061274:0" resolveInfo="ListPattern" />
    </node>
  </node>
  <visible index="2" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" />
  <visible index="3" modelUID="r:00000000-0000-4000-0000-011c8959033f(jetbrains.mps.lang.pattern.behavior)" />
  <node type="jetbrains.mps.lang.typesystem.structure.NonTypesystemRule:3" id="612919440683696543">
    <property name="name:3" value="check_PatternVariableNamesDuplication" />
    <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="612919440683696544">
      <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="612919440683723821">
        <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="612919440683723822">
          <property name="name:3" value="variables" />
          <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeListType:16" id="6708167710375032319">
            <link role="elementConcept:16" targetNodeId="2v.1169194658468:0" resolveInfo="INamedConcept" />
          </node>
          <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6708167710375032313">
            <node role="operand:3" type="jetbrains.mps.lang.typesystem.structure.ApplicableNodeReference:3" id="6708167710375032312">
              <link role="applicableNode:3" targetNodeId="612919440683696546" resolveInfo="patternExpression" />
            </node>
            <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.Node_ConceptMethodCall:16" id="6708167710375032317">
              <link role="baseMethodDeclaration:16" targetNodeId="3v.4855904478357072957" resolveInfo="getVariables" />
            </node>
          </node>
        </node>
      </node>
      <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="612919440683723755">
        <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="612919440683723756">
          <property name="name:3" value="names" />
          <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="612919440683723759">
            <link role="classifier:3" targetNodeId="8.~Set" resolveInfo="Set" />
            <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="612919440683723761" />
          </node>
          <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="612919440683723763">
            <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="612919440683723765">
              <link role="baseMethodDeclaration:3" targetNodeId="8.~HashSet.&lt;init&gt;()" resolveInfo="HashSet" />
            </node>
          </node>
        </node>
      </node>
      <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="612919440683723749">
        <node role="variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="612919440683723750">
          <property name="name:3" value="var" />
          <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="612919440683723773">
            <link role="concept:16" targetNodeId="2v.1169194658468:0" resolveInfo="INamedConcept" />
          </node>
        </node>
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="612919440683723751">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="612919440683723774">
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="612919440683723775">
              <node role="statement:3" type="jetbrains.mps.lang.typesystem.structure.ReportErrorStatement:3" id="4264731254635435133">
                <node role="errorString:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="4264731254635435134">
                  <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4264731254635435135">
                    <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4264731254635435136">
                      <link role="variableDeclaration:3" targetNodeId="612919440683723750" resolveInfo="var" />
                    </node>
                    <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess:16" id="4264731254635435137">
                      <link role="property:16" targetNodeId="2v.1169194664001:0" resolveInfo="name" />
                    </node>
                  </node>
                  <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="4264731254635435138">
                    <property name="value:3" value="Pattern has two or more variables with name " />
                  </node>
                </node>
                <node role="nodeToReport:3" type="jetbrains.mps.lang.typesystem.structure.ApplicableNodeReference:3" id="4264731254635435139">
                  <link role="applicableNode:3" targetNodeId="612919440683696546" resolveInfo="patternExpression" />
                </node>
              </node>
            </node>
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="612919440683723779">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="612919440683723778">
                <link role="variableDeclaration:3" targetNodeId="612919440683723756" resolveInfo="names" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="612919440683723783">
                <link role="baseMethodDeclaration:3" targetNodeId="8.~Set.contains(java.lang.Object):boolean" resolveInfo="contains" />
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="612919440683723785">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="612919440683723784">
                    <link role="variableDeclaration:3" targetNodeId="612919440683723750" resolveInfo="var" />
                  </node>
                  <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess:16" id="4264731254635399192">
                    <link role="property:16" targetNodeId="2v.1169194664001:0" resolveInfo="name" />
                  </node>
                </node>
              </node>
            </node>
            <node role="ifFalseStatement:3" type="jetbrains.mps.baseLanguage.structure.BlockStatement:3" id="612919440683723796">
              <node role="statements:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="612919440683723797">
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="612919440683723798">
                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="612919440683723800">
                    <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="612919440683723799">
                      <link role="variableDeclaration:3" targetNodeId="612919440683723756" resolveInfo="names" />
                    </node>
                    <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="612919440683723804">
                      <link role="baseMethodDeclaration:3" targetNodeId="8.~Set.add(java.lang.Object):boolean" resolveInfo="add" />
                      <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="612919440683723806">
                        <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="612919440683723805">
                          <link role="variableDeclaration:3" targetNodeId="612919440683723750" resolveInfo="var" />
                        </node>
                        <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess:16" id="612919440683723810">
                          <link role="property:16" targetNodeId="2v.1169194664001:0" resolveInfo="name" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="iterable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="612919440683740387">
          <link role="variableDeclaration:3" targetNodeId="612919440683723822" resolveInfo="vars" />
        </node>
      </node>
    </node>
    <node role="applicableNode:3" type="jetbrains.mps.lang.typesystem.structure.ConceptReference:3" id="612919440683696546">
      <property name="name:3" value="patternExpression" />
      <link role="concept:3" targetNodeId="1.1136720037777:0" resolveInfo="PatternExpression" />
    </node>
  </node>
</model>

