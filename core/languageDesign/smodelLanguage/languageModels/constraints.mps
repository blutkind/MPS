<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.bootstrap.smodelLanguage.constraints">
  <persistence version="1" />
  <refactoringHistory />
  <language namespace="jetbrains.mps.bootstrap.constraintsLanguage">
    <languageAspect modelUID="jetbrains.mps.bootstrap.constraintsLanguage.structure" version="1" />
  </language>
  <language namespace="jetbrains.mps.baseLanguage" />
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage">
    <languageAspect modelUID="jetbrains.mps.bootstrap.smodelLanguage.structure" version="0" />
  </language>
  <language namespace="jetbrains.mps.bootstrap.helgins" />
  <language namespace="jetbrains.mps.bootstrap.sharedConcepts" />
  <language namespace="jetbrains.mps.baseLanguage.ext.collections.lang">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.structure" version="0" />
  </language>
  <language namespace="jetbrains.mps.quotation" />
  <maxImportIndex value="19" />
  <import index="1" modelUID="jetbrains.mps.bootstrap.smodelLanguage.structure" version="0" />
  <import index="2" modelUID="jetbrains.mps.bootstrap.structureLanguage.structure" version="-1" />
  <import index="3" modelUID="java.util@java_stub" version="-1" />
  <import index="4" modelUID="jetbrains.mps.smodel.search@java_stub" version="-1" />
  <import index="6" modelUID="jetbrains.mps.smodel@java_stub" version="-1" />
  <import index="7" modelUID="jetbrains.mps.bootstrap.smodelLanguage@java_stub" version="-1" />
  <import index="9" modelUID="jetbrains.mps.core.structure" version="-1" />
  <import index="11" modelUID="jetbrains.mps.bootstrap.structureLanguage.structure@java_stub" version="-1" />
  <import index="12" modelUID="jetbrains.mps.bootstrap.constraintsLanguage.structure" version="1" />
  <import index="13" modelUID="jetbrains.mps.bootstrap.structureLanguage.constraints" version="-1" />
  <import index="15" modelUID="jetbrains.mps.baseLanguage.constraints" version="-1" />
  <import index="16" modelUID="java.lang@java_stub" version="-1" />
  <import index="17" modelUID="jetbrains.mps.util@java_stub" version="-1" />
  <import index="18" modelUID="jetbrains.mps.baseLanguage.structure" version="0" />
  <import index="19" modelUID="jetbrains.mps.core.constraints" version="-1" />
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1178181704881">
    <link role="concept" targetNodeId="1.1145383075378" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1198893638268">
      <property name="name" value="getPresentation" />
      <link role="overriddenMethod" targetNodeId="19.1180102203531" resolveInfo="getPresentation" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1198893638270">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1198893648773">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1198893648774">
            <property name="name" value="conceptDeclaration" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1198893648775">
              <link role="concept" targetNodeId="2.1169125787135" resolveInfo="AbstractConceptDeclaration" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227842587">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1198893655276" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1198893648777">
                <link role="link" targetNodeId="1.1145383142433" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1198893648779">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.TernaryOperatorExpression" id="1198893648780">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1198893648781">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1198893648782" />
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1198893648783">
                <link role="variableDeclaration" targetNodeId="1198893648774" resolveInfo="conceptDeclaration" />
              </node>
            </node>
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1198893648784">
              <property name="value" value="snodes&lt; &gt;" />
            </node>
            <node role="ifFalse" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1198893648785">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1198893648786">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1198893648787">
                  <property name="value" value="&gt;" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227905414">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1198893648790">
                    <link role="variableDeclaration" targetNodeId="1198893648774" resolveInfo="conceptDeclaration" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1198893648789">
                    <link role="property" targetNodeId="9.1169194664001" resolveInfo="name" />
                  </node>
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1198893648791">
                <property name="value" value="snodes&lt;" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1198893642286">
        <link role="classifier" targetNodeId="16.~String" resolveInfo="String" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1183572829396">
      <property name="name" value="getVariableSuffixes" />
      <link role="overriddenMethod" targetNodeId="15.1182416669983" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1183572829398">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1183572850427">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1183572850428">
            <property name="name" value="variableSuffixes" />
            <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1183572850429">
              <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1183572852486">
                <link role="classifier" targetNodeId="16.~String" resolveInfo="String" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1183572875696">
              <node role="creator" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListCreatorWithInit" id="1183572877065">
                <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1183572879593">
                  <link role="classifier" targetNodeId="16.~String" resolveInfo="String" />
                </node>
                <node role="initValue" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1183572883383">
                  <property name="value" value="nodes" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1183572926667">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1183572926668">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1183572956495">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1183572956496">
                <property name="name" value="name" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1183572956497">
                  <link role="classifier" targetNodeId="16.~String" resolveInfo="String" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1183572966400">
                  <link role="baseMethodDeclaration" targetNodeId="17.~NameUtil.pluralize(java.lang.String):java.lang.String" resolveInfo="pluralize" />
                  <link role="classConcept" targetNodeId="17.~NameUtil" resolveInfo="NameUtil" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1183572974589">
                    <link role="baseMethodDeclaration" targetNodeId="17.~NameUtil.decapitalize(java.lang.String):java.lang.String" resolveInfo="decapitalize" />
                    <link role="classConcept" targetNodeId="17.~NameUtil" resolveInfo="NameUtil" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227946655">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227842642">
                        <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1183572997817" />
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1183573001074">
                          <link role="link" targetNodeId="1.1145383142433" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1183573002799">
                        <link role="property" targetNodeId="9.1169194664001" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1183573010084">
              <node role="expression" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression" id="1183573010640">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1183573010085">
                  <link role="variableDeclaration" targetNodeId="1183572850428" resolveInfo="variableSuffixes" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddAllElementsOperation" id="1183573015128">
                  <node role="argument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1183573024977">
                    <link role="baseMethodDeclaration" targetNodeId="17.~NameUtil.splitByCamels(java.lang.String):java.util.List" resolveInfo="splitByCamels" />
                    <link role="classConcept" targetNodeId="17.~NameUtil" resolveInfo="NameUtil" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1183573027786">
                      <link role="variableDeclaration" targetNodeId="1183572956496" resolveInfo="name" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227946706">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227941894">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1183572938487" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1183572941931">
                <link role="link" targetNodeId="1.1145383142433" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNotNullOperation" id="1183572946641" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1183572872061">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1183572872062">
            <link role="variableDeclaration" targetNodeId="1183572850428" resolveInfo="variableSuffixes" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1190026812669">
        <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1190026812670">
          <link role="classifier" targetNodeId="16.~String" resolveInfo="String" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1187947708016">
      <property name="name" value="getAbstractCreator" />
      <link role="overriddenMethod" targetNodeId="15.1187945523562" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1187947708018">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1187947722405">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1187947722406">
            <property name="name" value="creator" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1187947722407">
              <link role="concept" targetNodeId="1.1145567426890" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1187947734224">
              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1187947734225">
                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1187947734226">
                  <link role="concept" targetNodeId="1.1145567426890" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1187947740963">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227932138">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227926646">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1187947740964">
                <link role="variableDeclaration" targetNodeId="1187947722406" resolveInfo="creator" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1187947749069">
                <link role="link" targetNodeId="1.1145567471833" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetTargetOperation" id="1187947751754">
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227895034">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1187947753694" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_CopyOperation" id="1187947755056" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1187947737690">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1187947737691">
            <link role="variableDeclaration" targetNodeId="1187947722406" resolveInfo="creator" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1190026812671">
        <link role="concept" targetNodeId="18.1145552809883" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1195721949128">
      <property name="name" value="getClassExpression" />
      <link role="overriddenMethod" targetNodeId="15.1194035415601" resolveInfo="getClassExpression" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1195721949130">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1195721970098">
          <node role="expression" type="jetbrains.mps.quotation.structure.Quotation" id="1196933153133">
            <node role="quotedNode" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression" id="1196933153134">
              <link role="classifier" targetNodeId="3.~List" resolveInfo="List" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1195721955739">
        <link role="concept" targetNodeId="18.1068431790191" resolveInfo="Expression" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1178181704882">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1178181704883" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1178181704906">
    <link role="concept" targetNodeId="1.1138055754698" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1198180382972">
      <property name="name" value="getPresentation" />
      <link role="overriddenMethod" targetNodeId="19.1180102203531" resolveInfo="getPresentation" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1198180382974">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1198893701262">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1198893701263">
            <property name="name" value="concept" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1198893701264">
              <link role="concept" targetNodeId="2.1169125787135" resolveInfo="AbstractConceptDeclaration" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227956256">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1198893716254" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1198893701266">
                <link role="link" targetNodeId="1.1138405853777" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1198893701268">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1198893701269">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1198893701270" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1198893701271">
              <link role="variableDeclaration" targetNodeId="1198893701263" resolveInfo="concept" />
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1198893701272">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1198893701273">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1198893701274">
                <property name="value" value="snode&lt; &gt;" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1198893733005">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1198893733006">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1198893733007">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1198893733008">
                <property name="value" value="&gt;" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227866500">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1198893733011">
                  <link role="variableDeclaration" targetNodeId="1198893701263" resolveInfo="concept" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1198893733010">
                  <link role="property" targetNodeId="9.1169194664001" resolveInfo="name" />
                </node>
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1198893733012">
              <property name="value" value="snode&lt;" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1198180419033">
        <link role="classifier" targetNodeId="16.~String" resolveInfo="String" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1183572132674">
      <property name="name" value="getVariableSuffixes" />
      <link role="overriddenMethod" targetNodeId="15.1182416669983" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1183572132676">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1183572175822">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1183572175823">
            <property name="name" value="variableSuffixes" />
            <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1183572175824">
              <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1183572178198">
                <link role="classifier" targetNodeId="16.~String" resolveInfo="String" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1183572197040">
              <node role="creator" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListCreatorWithInit" id="1183572198564">
                <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1183572200887">
                  <link role="classifier" targetNodeId="16.~String" resolveInfo="String" />
                </node>
                <node role="initValue" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1183572206112">
                  <property name="value" value="node" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1183572221095">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1183572221096">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1183572245613">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1183572245614">
                <property name="name" value="name" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1183572245615">
                  <link role="classifier" targetNodeId="16.~String" resolveInfo="String" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1183572498743">
                  <link role="baseMethodDeclaration" targetNodeId="17.~NameUtil.decapitalize(java.lang.String):java.lang.String" resolveInfo="decapitalize" />
                  <link role="classConcept" targetNodeId="17.~NameUtil" resolveInfo="NameUtil" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227882466">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227910048">
                      <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1183572500139" />
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1183572500138">
                        <link role="link" targetNodeId="1.1138405853777" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1183572500136">
                      <link role="property" targetNodeId="9.1169194664001" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1183572442694">
              <node role="expression" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression" id="1183572465893">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1183572464964">
                  <link role="variableDeclaration" targetNodeId="1183572175823" resolveInfo="variableSuffixes" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddAllElementsOperation" id="1183572469861">
                  <node role="argument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1183572472693">
                    <link role="baseMethodDeclaration" targetNodeId="17.~NameUtil.splitByCamels(java.lang.String):java.util.List" resolveInfo="splitByCamels" />
                    <link role="classConcept" targetNodeId="17.~NameUtil" resolveInfo="NameUtil" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1183572504854">
                      <link role="variableDeclaration" targetNodeId="1183572245614" resolveInfo="name" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1183572234985">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1183572236510" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227942527">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1183572228770" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1183572232257">
                <link role="link" targetNodeId="1.1138405853777" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1183572240650">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1183572240651">
            <link role="variableDeclaration" targetNodeId="1183572175823" resolveInfo="variableSuffixes" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1190026812672">
        <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1190026812673">
          <link role="classifier" targetNodeId="16.~String" resolveInfo="String" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1187947557497">
      <property name="name" value="getAbstractCreator" />
      <link role="overriddenMethod" targetNodeId="15.1187945523562" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1187947557499">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1187947573709">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1187947573710">
            <property name="name" value="creator" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1187947573711">
              <link role="concept" targetNodeId="1.1180636770613" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1187947585408">
              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1187947587252">
                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1187947587254">
                  <link role="concept" targetNodeId="1.1180636770613" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1187947594085">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227890486">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227934267">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1187947594086">
                <link role="variableDeclaration" targetNodeId="1187947573710" resolveInfo="creator" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1187947607122">
                <link role="link" targetNodeId="1.1180636770616" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetTargetOperation" id="1187947690483">
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227920676">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1187947692093" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_CopyOperation" id="1187947693273" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1187947614286">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1187947614287">
            <link role="variableDeclaration" targetNodeId="1187947573710" resolveInfo="creator" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1190026812674">
        <link role="concept" targetNodeId="18.1145552809883" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1194294765614">
      <property name="name" value="getClassExpression" />
      <link role="overriddenMethod" targetNodeId="15.1194035415601" resolveInfo="getClassExpression" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194294765616">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1194294866147">
          <node role="expression" type="jetbrains.mps.quotation.structure.Quotation" id="1196933153135">
            <node role="quotedNode" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression" id="1196933153136">
              <link role="classifier" targetNodeId="6.~SNode" resolveInfo="SNode" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1194294850662">
        <link role="concept" targetNodeId="18.1068431790191" resolveInfo="Expression" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1178181704907">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1178181704908" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1178181704912">
    <link role="concept" targetNodeId="1.1143226024141" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1198893326121">
      <property name="name" value="getPresentation" />
      <link role="overriddenMethod" targetNodeId="19.1180102203531" resolveInfo="getPresentation" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1198893326123">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1198893337500">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1198893337501">
            <property name="value" value="smodel" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1198893331452">
        <link role="classifier" targetNodeId="16.~String" resolveInfo="String" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1178181704913">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1178181704914" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1178181704999">
    <link role="concept" targetNodeId="1.1172420572800" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1198893254508">
      <property name="name" value="getPresentation" />
      <link role="overriddenMethod" targetNodeId="19.1180102203531" resolveInfo="getPresentation" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1198893254510">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1198893271466">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1198893271467">
            <property name="name" value="concept" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptType" id="1198893271468" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227844834">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1198893292776" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1198893271470">
                <link role="link" targetNodeId="1.1180481110358" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1198893271472">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1198893271473">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1198893271474" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1198893271475">
              <link role="variableDeclaration" targetNodeId="1198893271467" resolveInfo="concept" />
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1198893271476">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1198893271477">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1198893271478">
                <property name="value" value="sconcept&lt; &gt;" />
              </node>
            </node>
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1198893271479">
            <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1198893271480">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1198893271481">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1198893271482">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1198893271483">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1198893271484">
                      <property name="value" value="&gt;" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227910898">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1198893271487">
                        <link role="variableDeclaration" targetNodeId="1198893271467" resolveInfo="concept" />
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1198893271486">
                        <link role="property" targetNodeId="9.1169194664001" resolveInfo="name" />
                      </node>
                    </node>
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1198893271488">
                    <property name="value" value="sconcept&lt;" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1198893260808">
        <link role="classifier" targetNodeId="16.~String" resolveInfo="String" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1183630083042">
      <property name="name" value="getVariableSuffixes" />
      <link role="overriddenMethod" targetNodeId="15.1182416669983" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1183630083044">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1183630099339">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1183630099340">
            <property name="name" value="variableSuffixes" />
            <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1183630099341">
              <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1183630102333">
                <link role="classifier" targetNodeId="16.~String" resolveInfo="String" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1183630110519">
              <node role="creator" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListCreatorWithInit" id="1183630112074">
                <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1183630115131">
                  <link role="classifier" targetNodeId="16.~String" resolveInfo="String" />
                </node>
                <node role="initValue" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1183630118091">
                  <property name="value" value="concept" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1183630128449">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1183630128450">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1183630164915">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1183630164916">
                <property name="name" value="name" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1183630164917">
                  <link role="classifier" targetNodeId="16.~String" resolveInfo="String" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1183630181346">
                  <link role="baseMethodDeclaration" targetNodeId="17.~NameUtil.decapitalize(java.lang.String):java.lang.String" resolveInfo="decapitalize" />
                  <link role="classConcept" targetNodeId="17.~NameUtil" resolveInfo="NameUtil" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227933131">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227923041">
                      <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1183630188119" />
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1183630190778">
                        <link role="link" targetNodeId="1.1180481110358" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1183630193311">
                      <link role="property" targetNodeId="9.1169194664001" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1183630204685">
              <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1183630204686">
                <property name="name" value="element" />
              </node>
              <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1183630217843">
                <link role="baseMethodDeclaration" targetNodeId="17.~NameUtil.splitByCamels(java.lang.String):java.util.List" resolveInfo="splitByCamels" />
                <link role="classConcept" targetNodeId="17.~NameUtil" resolveInfo="NameUtil" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1183630219868">
                  <link role="variableDeclaration" targetNodeId="1183630164916" resolveInfo="name" />
                </node>
              </node>
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1183630204688">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1183630224761">
                  <node role="expression" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression" id="1183630259446">
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1183630243940">
                      <link role="variableDeclaration" targetNodeId="1183630099340" resolveInfo="variableSuffixes" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddElementOperation" id="1183630260946">
                      <node role="argument" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1183630264950">
                        <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1183630266669">
                          <property name="value" value="Concept" />
                        </node>
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1183630264086">
                          <link role="variable" targetNodeId="1183630204686" resolveInfo="element" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227911393">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227897636">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1183630136656" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1183630150153">
                <link role="link" targetNodeId="1.1180481110358" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNotNullOperation" id="1183630154624" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1183630157655">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1183630157656">
            <link role="variableDeclaration" targetNodeId="1183630099340" resolveInfo="variableSuffixes" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1190026812675">
        <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1190026812676">
          <link role="classifier" targetNodeId="16.~String" resolveInfo="String" />
        </node>
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1178181705000">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1178181705001" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1178192141098">
    <property name="package" value="operation.node" />
    <link role="concept" targetNodeId="1.1144195091934" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1178192141099">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1178192141100" />
    </node>
    <node role="references" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodeReferentConstraint" id="1149280435282">
      <property name="description" value="links declared in specified concept" />
      <link role="applicableLink" targetNodeId="1.1144195396777" />
      <node role="searchScopeFactory" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_ReferentSearchScope_Factory" id="1149280435283">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1149280435284">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1149280698776">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1149280698777">
              <property name="name" value="conceptOfParent" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1149280698779">
                <link role="concept" targetNodeId="2.1169125787135" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227841585">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunctionParameter_referenceNode" id="1149280676164" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccessAsNode" id="1173215296928">
                  <link role="link" targetNodeId="1.1144195362400" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1149280736094">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1149280736095">
              <property name="name" value="links" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1149280736096">
                <link role="classifier" targetNodeId="3.~List" resolveInfo="List" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1149280781302">
                <link role="classConcept" targetNodeId="4.~SModelSearchUtil_new" resolveInfo="SModelSearchUtil_new" />
                <link role="baseMethodDeclaration" targetNodeId="4.~SModelSearchUtil_new.getAggregationLinkDeclarationsExcludingOverridden(jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration):java.util.List" resolveInfo="getAggregationLinkDeclarationsExcludingOverridden" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204668169851">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1149280790183">
                    <link role="variableDeclaration" targetNodeId="1149280698777" resolveInfo="conceptOfParent" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAdapterOperation" id="1171037719098" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1149280801716">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1149280804718">
              <link role="baseMethodDeclaration" targetNodeId="4.~SimpleSearchScope.&lt;init&gt;(java.util.List)" resolveInfo="SimpleSearchScope" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1171037736401">
                <link role="classConcept" targetNodeId="6.~BaseAdapter" resolveInfo="BaseAdapter" />
                <link role="baseMethodDeclaration" targetNodeId="6.~BaseAdapter.toNodes(java.util.List):java.util.List" resolveInfo="toNodes" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1173134904081">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1173134904082">
                    <link role="variableDeclaration" targetNodeId="1149280736095" resolveInfo="links" />
                  </node>
                  <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1173134904083">
                    <link role="classifier" targetNodeId="3.~List" resolveInfo="List" />
                    <node role="parameter" type="jetbrains.mps.baseLanguage.structure.UpperBoundType" id="1173134904084">
                      <node role="bound" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1173134904085">
                        <link role="classifier" targetNodeId="6.~INodeAdapter" resolveInfo="INodeAdapter" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="searchScopeCanCreate" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_ReferentSearchScope_CanCreate" id="1159217105516">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1159217105517">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1159217109065">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227957558">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227935801">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunctionParameter_referenceNode" id="1159217115200" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1173898345504">
                  <link role="link" targetNodeId="1.1144195362400" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNotNullOperation" id="1173389785711" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1178192141390">
    <property name="package" value="operation.property" />
    <link role="concept" targetNodeId="1.1138676077309" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1178192141391">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1178192141392" />
    </node>
    <node role="references" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodeReferentConstraint" id="1149281131881">
      <property name="description" value="constants defined in enum-datatype. only applicable to operations on an enum-property." />
      <link role="applicableLink" targetNodeId="1.1138676095763" />
      <node role="searchScopeFactory" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_ReferentSearchScope_Factory" id="1149281131882">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1149281131883">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1149281660846">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1149281660847">
              <property name="name" value="datatype" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1171246523675">
                <link role="classifier" targetNodeId="11.~DataTypeDeclaration" resolveInfo="DataTypeDeclaration" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1149281660849">
                <link role="classConcept" targetNodeId="7.~SModelLanguageUtil" resolveInfo="SModelLanguageUtil" />
                <link role="baseMethodDeclaration" targetNodeId="7.~SModelLanguageUtil.getDatatypeFromLeft_SPropertyAccess(jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperation):jetbrains.mps.bootstrap.structureLanguage.structure.DataTypeDeclaration" resolveInfo="getDatatypeFromLeft_SPropertyAccess" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204668169898">
                  <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1171246495058">
                    <link role="concept" targetNodeId="1.1138411891628" />
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptParameter_ReferentSearchScope_enclosingNode" id="1150219204935" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAdapterOperation" id="1171246502016" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1171246590445">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1171246590446">
              <property name="name" value="datatypeNode" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1171246590447">
                <link role="concept" targetNodeId="2.1082978164218" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1171246608734">
                <link role="baseMethodDeclaration" targetNodeId="6.~BaseAdapter.getNode():jetbrains.mps.smodel.SNode" resolveInfo="getNode" />
                <node role="instance" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1171246603855">
                  <link role="variableDeclaration" targetNodeId="1149281660847" resolveInfo="datatype" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1149281694655">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1149281736532">
              <link role="baseMethodDeclaration" targetNodeId="4.~SimpleSearchScope.&lt;init&gt;(java.util.List)" resolveInfo="SimpleSearchScope" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227925217">
                <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1149281825526">
                  <link role="concept" targetNodeId="2.1082978164219" />
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1171246616532">
                    <link role="variableDeclaration" targetNodeId="1171246590446" resolveInfo="datatypeNode" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccessAsList" id="1171246551332">
                  <link role="link" targetNodeId="2.1083172003582" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="searchScopeCanCreate" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_ReferentSearchScope_CanCreate" id="1159217448763">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1159217448764">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1159217451674">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.OrExpression" id="1159217451675">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227945844">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptParameter_ReferentSearchScope_enclosingNode" id="1159217451677" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1159217451678">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1177556242892">
                    <link role="conceptDeclaration" targetNodeId="1.1146171026731" />
                  </node>
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227835978">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptParameter_ReferentSearchScope_enclosingNode" id="1159217451680" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1159217451681">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1177556243071">
                    <link role="conceptDeclaration" targetNodeId="1.1138661924179" />
                  </node>
                </node>
              </node>
            </node>
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1159217451682">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1159217451683">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1159217451684">
                  <property name="name" value="datatype" />
                  <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1171246374707">
                    <link role="classifier" targetNodeId="11.~DataTypeDeclaration" resolveInfo="DataTypeDeclaration" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1159217451686">
                    <link role="classConcept" targetNodeId="7.~SModelLanguageUtil" resolveInfo="SModelLanguageUtil" />
                    <link role="baseMethodDeclaration" targetNodeId="7.~SModelLanguageUtil.getDatatypeFromLeft_SPropertyAccess(jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperation):jetbrains.mps.bootstrap.structureLanguage.structure.DataTypeDeclaration" resolveInfo="getDatatypeFromLeft_SPropertyAccess" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204668169875">
                      <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1171246443337">
                        <link role="concept" targetNodeId="1.1138411891628" />
                        <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptParameter_ReferentSearchScope_enclosingNode" id="1159217451689" />
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAdapterOperation" id="1171246388868" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1159217451691">
                <node role="condition" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1159217451692">
                  <link role="classConcept" targetNodeId="6.~DataTypeUtil" resolveInfo="DataTypeUtil" />
                  <link role="baseMethodDeclaration" targetNodeId="6.~DataTypeUtil.isEnum(jetbrains.mps.bootstrap.structureLanguage.structure.DataTypeDeclaration):boolean" resolveInfo="isEnum" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1159217451695">
                    <link role="variableDeclaration" targetNodeId="1159217451684" resolveInfo="datatype" />
                  </node>
                </node>
                <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1159217451696">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1159217451697">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1159217457264">
                      <property name="value" value="true" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1159217451699">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1159217461155" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1179409416623">
    <property name="package" value="operation.node" />
    <link role="concept" targetNodeId="1.1179409122411" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1179412972990">
      <property name="name" value="isVirtualMethodCall" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1179412974768" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179412972992">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1179413025267">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227942164">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227903196">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1179413025268" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1179414637216">
                <link role="conceptMethodDeclaration" targetNodeId="1179412993748" resolveInfo="getVirtualMethodDeclaration" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNotNullOperation" id="1179413037209" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1179412993748">
      <property name="name" value="getVirtualMethodDeclaration" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1179412996026">
        <link role="concept" targetNodeId="12.1177673300966" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179412993750">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1179413102655">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1179413102656">
            <property name="name" value="methodDeclaration" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1179413102657">
              <link role="concept" targetNodeId="12.1177673300966" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227888877">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1179413082458" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1179413088078">
                <link role="link" targetNodeId="1.1179409206125" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1179413105841">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179413105842">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1179413146625">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227900717">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1179413149800">
                  <link role="variableDeclaration" targetNodeId="1179413102656" resolveInfo="methodDeclaration" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1179413154164">
                  <link role="link" targetNodeId="12.1177755346718" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227818151">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227893690">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1179413108249">
                <link role="variableDeclaration" targetNodeId="1179413102656" resolveInfo="methodDeclaration" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1179413139198">
                <link role="link" targetNodeId="12.1177755346718" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNotNullOperation" id="1179413142685" />
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1179413165783">
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179413165784">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1179413180620">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1179413184299">
                  <link role="variableDeclaration" targetNodeId="1179413102656" resolveInfo="methodDeclaration" />
                </node>
              </node>
            </node>
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227933906">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1179413168353">
                <link role="variableDeclaration" targetNodeId="1179413102656" resolveInfo="methodDeclaration" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1179413172895">
                <link role="property" targetNodeId="12.1177676055874" />
              </node>
            </node>
            <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1179413189281">
              <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179413189282">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1179413190866">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1179413191983" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1187950165398">
      <property name="name" value="getVariableExpectedName" />
      <link role="overriddenMethod" targetNodeId="1187949800331" resolveInfo="getVariableExpectedName" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1187950165400">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1187950181603">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1187950181604">
            <property name="name" value="variableExpectedName" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1187950181605">
              <link role="classifier" targetNodeId="16.~String" resolveInfo="String" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1187950205910">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1187950212963">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227908241">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227958749">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1187950216466" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1187950231502">
                  <link role="link" targetNodeId="1.1179409206125" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1187950233139">
                <link role="property" targetNodeId="18.1083152972672" />
              </node>
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1187950205911">
              <link role="variableDeclaration" targetNodeId="1187950181604" resolveInfo="variableExpectedName" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1187950236454">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1187950236455">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1187950249080">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1187950249688">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1187950255407">
                  <link role="baseMethodDeclaration" targetNodeId="16.~String.substring(int):java.lang.String" resolveInfo="substring" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1187950251987">
                    <link role="variableDeclaration" targetNodeId="1187950181604" resolveInfo="variableExpectedName" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1187950257575">
                    <property name="value" value="3" />
                  </node>
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1187950249081">
                  <link role="variableDeclaration" targetNodeId="1187950181604" resolveInfo="variableExpectedName" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1187950242701">
            <link role="baseMethodDeclaration" targetNodeId="16.~String.startsWith(java.lang.String):boolean" resolveInfo="startsWith" />
            <node role="instance" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1187950238785">
              <link role="variableDeclaration" targetNodeId="1187950181604" resolveInfo="variableExpectedName" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1187950245525">
              <property name="value" value="get" />
            </node>
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1187950261458">
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1187950261459">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1187950273917">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1187950274948">
                  <node role="rValue" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1187950280252">
                    <link role="baseMethodDeclaration" targetNodeId="16.~String.substring(int):java.lang.String" resolveInfo="substring" />
                    <node role="instance" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1187950276623">
                      <link role="variableDeclaration" targetNodeId="1187950181604" resolveInfo="variableExpectedName" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1187950281491">
                      <property name="value" value="2" />
                    </node>
                  </node>
                  <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1187950273918">
                    <link role="variableDeclaration" targetNodeId="1187950181604" resolveInfo="variableExpectedName" />
                  </node>
                </node>
              </node>
            </node>
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1187950269226">
              <link role="baseMethodDeclaration" targetNodeId="16.~String.startsWith(java.lang.String):boolean" resolveInfo="startsWith" />
              <node role="instance" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1187950263621">
                <link role="variableDeclaration" targetNodeId="1187950181604" resolveInfo="variableExpectedName" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1187950271170">
                <property name="value" value="is" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1187950200668">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1187950293872">
            <link role="baseMethodDeclaration" targetNodeId="17.~NameUtil.decapitalize(java.lang.String):java.lang.String" resolveInfo="decapitalize" />
            <link role="classConcept" targetNodeId="17.~NameUtil" resolveInfo="NameUtil" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1187950294878">
              <link role="variableDeclaration" targetNodeId="1187950181604" resolveInfo="variableExpectedName" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1190026812677">
        <link role="classifier" targetNodeId="16.~String" resolveInfo="String" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1179409416624">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179409416625" />
    </node>
    <node role="references" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodeReferentConstraint" id="1179409429736">
      <link role="applicableLink" targetNodeId="1.1179409206125" />
      <node role="searchScopeFactory" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_ReferentSearchScope_Factory" id="1179409435440">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179409435441">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1203537404347">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1203537404348">
              <property name="name" value="leftExpression" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1203537404349">
                <link role="concept" targetNodeId="18.1068431790191" resolveInfo="Expression" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227887073">
                <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1203537456648">
                  <link role="concept" targetNodeId="18.1197027756228" resolveInfo="DotExpression" />
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptParameter_ReferentSearchScope_enclosingNode" id="1203537434694" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1203537580437">
                  <link role="link" targetNodeId="18.1197027771414" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1203537589407">
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1203537589408">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1203537654046">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1203537655939">
                  <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227932686">
                    <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1203537670287">
                      <link role="concept" targetNodeId="1.1138055978872" resolveInfo="SNodeOperationExpression" />
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptParameter_ReferentSearchScope_enclosingNode" id="1203537667458" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1203537692715">
                      <link role="link" targetNodeId="1.1138056667223" />
                    </node>
                  </node>
                  <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203537654047">
                    <link role="variableDeclaration" targetNodeId="1203537404348" resolveInfo="leftExpression" />
                  </node>
                </node>
              </node>
            </node>
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203537617510">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptParameter_ReferentSearchScope_enclosingNode" id="1203537599803" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1203537619778">
                <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1203537647592">
                  <link role="conceptDeclaration" targetNodeId="1.1138055978872" resolveInfo="SNodeOperationExpression" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1179409615282">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1179409615283">
              <property name="name" value="snodeType" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1179409615284">
                <link role="concept" targetNodeId="1.1138055754698" />
              </node>
              <node role="initializer" type="jetbrains.mps.bootstrap.helgins.structure.CoerceExpression" id="1179409654782">
                <node role="pattern" type="jetbrains.mps.bootstrap.helgins.structure.ConceptReference" id="1179409698377">
                  <property name="name" value="xoxo" />
                  <link role="concept" targetNodeId="1.1138055754698" />
                </node>
                <node role="nodeToCoerce" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227882512">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203537708966">
                    <link role="variableDeclaration" targetNodeId="1203537404348" resolveInfo="leftExpression" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.helgins.structure.Node_TypeOperation" id="1179409690936" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1179410022975">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1179410022976">
              <property name="name" value="searchScope" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1179410022977">
                <link role="classifier" targetNodeId="4.~ISearchScope" resolveInfo="ISearchScope" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1179409721039">
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179409721040">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1179409747476">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1179409747477">
                  <property name="name" value="concept" />
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1179409747478">
                    <link role="concept" targetNodeId="2.1169125787135" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227842690">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1179409762864">
                      <link role="variableDeclaration" targetNodeId="1179409615283" resolveInfo="snodeType" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1179409769125">
                      <link role="link" targetNodeId="1.1138405853777" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1179409792758">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1179409792759">
                  <property name="name" value="methods" />
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1179409792760">
                    <link role="elementConcept" targetNodeId="12.1177673300966" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227946882">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1179409822467">
                      <link role="variableDeclaration" targetNodeId="1179409747477" resolveInfo="concept" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1179419284898">
                      <link role="conceptMethodDeclaration" targetNodeId="13.1178096836413" />
                      <node role="actualArgument" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptParameter_ReferentSearchScope_enclosingNode" id="1179410001386" />
                      <node role="actualArgument" type="jetbrains.mps.bootstrap.sharedConcepts.structure.ConceptFunctionParameter_scope" id="1179409937715" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1179410044321">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1179410049139">
                  <node role="rValue" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1179410051978">
                    <link role="baseMethodDeclaration" targetNodeId="4.~SimpleSearchScope.&lt;init&gt;(java.util.List)" resolveInfo="SimpleSearchScope" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1179410061036">
                      <link role="variableDeclaration" targetNodeId="1179409792759" resolveInfo="methods" />
                    </node>
                  </node>
                  <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1179410048489">
                    <link role="variableDeclaration" targetNodeId="1179410022976" resolveInfo="searchScope" />
                  </node>
                </node>
              </node>
            </node>
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227943671">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1179409727465">
                <link role="variableDeclaration" targetNodeId="1179409615283" resolveInfo="snodeType" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNotNullOperation" id="1179409731066" />
            </node>
            <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1179410066075">
              <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179410066076">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1179410068323">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1179410069008">
                    <node role="rValue" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1179410071881">
                      <link role="baseMethodDeclaration" targetNodeId="4.~EmptySearchScope.&lt;init&gt;()" resolveInfo="EmptySearchScope" />
                    </node>
                    <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1179410068324">
                      <link role="variableDeclaration" targetNodeId="1179410022976" resolveInfo="searchScope" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1179410077556">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1179410079350">
              <link role="variableDeclaration" targetNodeId="1179410022976" resolveInfo="searchScope" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1187949777121">
    <property name="package" value="operation" />
    <link role="concept" targetNodeId="1.1138055978872" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1187949779930">
      <property name="name" value="getVariableExpectedName" />
      <link role="overriddenMethod" targetNodeId="15.1187949494822" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1187949779932">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1187949839508">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1187949839509">
            <property name="name" value="variableExpectedName" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1187949839510">
              <link role="classifier" targetNodeId="16.~String" resolveInfo="String" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1187949846962" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1187949852945">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1187949852946">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1187949867319">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1187949867906">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227942292">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227908454">
                    <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1187949869449" />
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1187949871230">
                      <link role="link" targetNodeId="1.1138411864174" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1187949873681">
                    <link role="conceptMethodDeclaration" targetNodeId="1187949800331" resolveInfo="getVariableExpectedName" />
                  </node>
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1187949867320">
                  <link role="variableDeclaration" targetNodeId="1187949839509" resolveInfo="variableExpectedName" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227882143">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227903484">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1187949855603" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1187949861911">
                <link role="link" targetNodeId="1.1138411864174" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNotNullOperation" id="1187949863762" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1187949849847">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1187949849848">
            <link role="variableDeclaration" targetNodeId="1187949839509" resolveInfo="variableExpectedName" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1190026812693">
        <link role="classifier" targetNodeId="16.~String" resolveInfo="String" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1187949777122">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1187949777123" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1187949798135">
    <property name="package" value="operation" />
    <link role="concept" targetNodeId="1.1138411891628" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1200920411564">
      <property name="name" value="getLeftExpression" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1200920419497">
        <link role="concept" targetNodeId="18.1068431790191" resolveInfo="Expression" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200920411566">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1203103828146">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1203103828147">
            <property name="name" value="parent" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1203103828148" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227820796">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1203103828150" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1203103828151" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1203103835435">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1203103835436">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1203103874479">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227881302">
                <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1203103874482">
                  <link role="concept" targetNodeId="1.1138055978872" resolveInfo="SNodeOperationExpression" />
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203103874483">
                    <link role="variableDeclaration" targetNodeId="1203103828147" resolveInfo="parent" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1203103874481">
                  <link role="link" targetNodeId="1.1138056667223" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227915889">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203103839737">
              <link role="variableDeclaration" targetNodeId="1203103828147" resolveInfo="parent" />
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1203103854913">
              <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1203103861384">
                <link role="conceptDeclaration" targetNodeId="1.1138055978872" resolveInfo="SNodeOperationExpression" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1203103923135">
          <property name="value" value="new: DotExpression everywhere" />
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1203103885313">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227896319">
            <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1203103908956">
              <link role="concept" targetNodeId="18.1197027756228" resolveInfo="DotExpression" />
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203103906237">
                <link role="variableDeclaration" targetNodeId="1203103828147" resolveInfo="parent" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1203103919852">
              <link role="link" targetNodeId="18.1197027771414" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1203458218533">
      <property name="name" value="getLeftExpressionLeftExpression" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1203458234177">
        <link role="concept" targetNodeId="18.1068431790191" resolveInfo="Expression" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1203458218535">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1203458317098">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1203458317099">
            <property name="name" value="leftExpression" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1203458317100">
              <link role="concept" targetNodeId="18.1068431790191" resolveInfo="Expression" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227941870">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1203458317102" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1203458317103">
                <link role="conceptMethodDeclaration" targetNodeId="1200920411564" resolveInfo="getLeftExpression" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1203458358395">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1203458358396">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1203458358397">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227925817">
                <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1203458358400">
                  <link role="concept" targetNodeId="1.1138055978872" resolveInfo="SNodeOperationExpression" />
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203458373366">
                    <link role="variableDeclaration" targetNodeId="1203458317099" resolveInfo="leftExpression" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1203458358399">
                  <link role="link" targetNodeId="1.1138056667223" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227878923">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203458368022">
              <link role="variableDeclaration" targetNodeId="1203458317099" resolveInfo="leftExpression" />
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1203458358403">
              <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1203458358404">
                <link role="conceptDeclaration" targetNodeId="1.1138055978872" resolveInfo="SNodeOperationExpression" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1203458358406">
          <property name="value" value="new: DotExpression everywhere" />
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1203458358407">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227923713">
            <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1203458358410">
              <link role="concept" targetNodeId="18.1197027756228" resolveInfo="DotExpression" />
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203458382461">
                <link role="variableDeclaration" targetNodeId="1203458317099" resolveInfo="leftExpression" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1203458358409">
              <link role="link" targetNodeId="18.1197027771414" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1203459446846">
      <property name="name" value="getLeftExpressionOperation" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1203459452131">
        <link role="concept" targetNodeId="18.1197027803184" resolveInfo="IOperation" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1203459446848">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1203459501398">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1203459501399">
            <property name="name" value="leftExpression" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1203459501400">
              <link role="concept" targetNodeId="18.1068431790191" resolveInfo="Expression" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227915911">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1203459501402" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1203459501403">
                <link role="conceptMethodDeclaration" targetNodeId="1200920411564" resolveInfo="getLeftExpression" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1203459501404">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1203459501405">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1203459501406">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227924162">
                <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1203459501409">
                  <link role="concept" targetNodeId="1.1138055978872" resolveInfo="SNodeOperationExpression" />
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203459501410">
                    <link role="variableDeclaration" targetNodeId="1203459501399" resolveInfo="leftExpression" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1203459520593">
                  <link role="link" targetNodeId="1.1138411864174" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227889494">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203459501414">
              <link role="variableDeclaration" targetNodeId="1203459501399" resolveInfo="leftExpression" />
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1203459501412">
              <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1203459501413">
                <link role="conceptDeclaration" targetNodeId="1.1138055978872" resolveInfo="SNodeOperationExpression" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1203459501415">
          <property name="value" value="new: DotExpression everywhere" />
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1203459501416">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227894086">
            <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1203459501419">
              <link role="concept" targetNodeId="18.1197027756228" resolveInfo="DotExpression" />
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203459501420">
                <link role="variableDeclaration" targetNodeId="1203459501399" resolveInfo="leftExpression" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1203459530407">
              <link role="link" targetNodeId="18.1197027833540" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1187949800331">
      <property name="name" value="getVariableExpectedName" />
      <property name="isVirtual" value="true" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1187949811453">
        <link role="classifier" targetNodeId="16.~String" resolveInfo="String" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1187949800333">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1187950382003">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1187950382004">
            <property name="name" value="variableExpectedName" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1187950382005">
              <link role="classifier" targetNodeId="16.~String" resolveInfo="String" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1187950458464">
              <link role="baseMethodDeclaration" targetNodeId="17.~NameUtil.toValidCamelIdentifier(java.lang.String):java.lang.String" resolveInfo="toValidCamelIdentifier" />
              <link role="classConcept" targetNodeId="17.~NameUtil" resolveInfo="NameUtil" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227919997">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1187950459311" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptPropertyAccess" id="1187950459310">
                  <link role="conceptProperty" targetNodeId="9.1137473891462" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1187949823827">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1187950393682">
            <link role="variableDeclaration" targetNodeId="1187950382004" resolveInfo="variableExpectedName" />
          </node>
        </node>
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1187949798136">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1187949798137" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1187949898603">
    <property name="package" value="operation.featureAccess" />
    <link role="concept" targetNodeId="1.1138056022639" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1187949900517">
      <property name="name" value="getVariableExpectedName" />
      <link role="overriddenMethod" targetNodeId="1187949800331" resolveInfo="getVariableExpectedName" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1187949900519">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1187949917598">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227942109">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227837406">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1187949917599" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1187949924358">
                <link role="link" targetNodeId="1.1138056395725" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1187949931650">
              <link role="property" targetNodeId="9.1169194664001" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1190026812694">
        <link role="classifier" targetNodeId="16.~String" resolveInfo="String" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1187949898604">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1187949898605" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1187949943385">
    <property name="package" value="operation.featureAccess" />
    <link role="concept" targetNodeId="1.1138056143562" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1187949946021">
      <property name="name" value="getVariableExpectedName" />
      <link role="overriddenMethod" targetNodeId="1187949800331" resolveInfo="getVariableExpectedName" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1187949946023">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1187949963676">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227941973">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227900159">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1187949963677" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1187949967815">
                <link role="link" targetNodeId="1.1138056516764" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1187949984092">
              <link role="property" targetNodeId="2.1071599776563" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1190026812695">
        <link role="classifier" targetNodeId="16.~String" resolveInfo="String" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1187949943386">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1187949943387" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1187949997814">
    <property name="package" value="operation.featureAccess" />
    <link role="concept" targetNodeId="1.1138056282393" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1187949999471">
      <property name="name" value="getVariableExpectedName" />
      <link role="overriddenMethod" targetNodeId="1187949800331" resolveInfo="getVariableExpectedName" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1187949999473">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1187950006373">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227939813">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227930245">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1187950006374" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1187950013232">
                <link role="link" targetNodeId="1.1138056546658" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1187950014612">
              <link role="property" targetNodeId="2.1071599776563" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1190026812696">
        <link role="classifier" targetNodeId="16.~String" resolveInfo="String" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1187949997815">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1187949997816" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1187950034647">
    <property name="package" value="operation.featureAccess" />
    <link role="concept" targetNodeId="1.1145994841052" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1187950034648">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1187950034649" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1187950036737">
      <property name="name" value="getVariableExpectedName" />
      <link role="overriddenMethod" targetNodeId="1187949800331" resolveInfo="getVariableExpectedName" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1187950036739">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1187950043064">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227837195">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227913807">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1187950043065" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1187950047529">
                <link role="link" targetNodeId="1.1145994841055" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1187950048907">
              <link role="property" targetNodeId="9.1169194664001" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1190026812697">
        <link role="classifier" targetNodeId="16.~String" resolveInfo="String" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1187950061022">
    <property name="package" value="operation.featureAccess" />
    <link role="concept" targetNodeId="1.1175618182947" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1187950061023">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1187950061024" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1187950063226">
      <property name="name" value="getVariableExpectedName" />
      <link role="overriddenMethod" targetNodeId="1187949800331" resolveInfo="getVariableExpectedName" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1187950063228">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1187950071199">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227881625">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227880884">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1187950071200" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1187950075298">
                <link role="link" targetNodeId="1.1175618223511" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1187950078142">
              <link role="property" targetNodeId="9.1169194664001" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1190026812698">
        <link role="classifier" targetNodeId="16.~String" resolveInfo="String" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1204764877968">
    <property name="package" value="attribute" />
    <link role="concept" targetNodeId="1.1204763358057" resolveInfo="NodeAttributeAccessQualifier" />
    <node role="references" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodeReferentConstraint" id="1204765277892">
      <link role="applicableLink" targetNodeId="1.1204763443606" />
      <node role="searchScopeFactory" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_ReferentSearchScope_Factory" id="1204765300658">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204765300659">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1204765426916">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1204765426917">
              <property name="name" value="ald" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptType" id="1204765426918">
                <link role="conceptDeclaraton" targetNodeId="2.1149608206811" resolveInfo="AnnotationLinkDeclaration" />
              </node>
              <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.structure.ConceptRefExpression" id="1204765426919">
                <link role="conceptDeclaration" targetNodeId="2.1149608206811" resolveInfo="AnnotationLinkDeclaration" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1204765602890">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1204765602891">
              <property name="name" value="annotationLinks" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1204765602892">
                <link role="elementConcept" targetNodeId="2.1149608206811" resolveInfo="AnnotationLinkDeclaration" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204765602893">
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Concept_FindInstances" id="1204765602894">
                  <node role="scope" type="jetbrains.mps.bootstrap.sharedConcepts.structure.ConceptFunctionParameter_scope" id="1204765680528" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204765602899">
                  <link role="variableDeclaration" targetNodeId="1204765426917" resolveInfo="ald" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1204765779649">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1204765779650">
              <property name="name" value="nodeAttrLinks" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1204765793379">
                <link role="elementConcept" targetNodeId="2.1149608206811" resolveInfo="AnnotationLinkDeclaration" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression" id="1204765779653">
                <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ToListOperation" id="1204765779654" />
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.Expression" id="1204765779655" />
                <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression" id="1204765779656">
                  <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.WhereOperation" id="1204765779657">
                    <node role="whereClosure" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.WhereBlock" id="1204765779658">
                      <node role="defaultInputElement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.DefaultInputElement" id="1204765779659">
                        <property name="name" value="it" />
                      </node>
                      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204765779660">
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204765779661">
                          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204765779662">
                            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_HasValue_Enum" id="1204765779663">
                              <node role="value" type="jetbrains.mps.bootstrap.smodelLanguage.structure.EnumMemberReference" id="1204765779664">
                                <link role="enumMember" targetNodeId="2.1149608364144" resolveInfo="node" />
                              </node>
                            </node>
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204765779665">
                              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1204765779666">
                                <link role="property" targetNodeId="2.1149608445162" resolveInfo="stereotype" />
                              </node>
                              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ClosureParameterReference" id="1204765779667">
                                <link role="closureParameter" targetNodeId="1204765779659" resolveInfo="it" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.Expression" id="1204765779668" />
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204765779669">
                    <link role="variableDeclaration" targetNodeId="1204765602891" resolveInfo="annotationLinks" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1204765800937">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1204765803501">
              <link role="baseMethodDeclaration" targetNodeId="4.~SimpleSearchScope.&lt;init&gt;(java.util.List)" resolveInfo="SimpleSearchScope" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204765811440">
                <link role="variableDeclaration" targetNodeId="1204765779650" resolveInfo="nodeAttrLinks" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1204764877969">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204764877970" />
    </node>
  </node>
</model>

