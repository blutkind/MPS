<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.ypath.constraints">
  <persistence version="1" />
  <language namespace="jetbrains.mps.bootstrap.constraintsLanguage" />
  <language namespace="jetbrains.mps.baseLanguage" />
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage" />
  <language namespace="jetbrains.mps.baseLanguage.ext.collections.lang" />
  <language namespace="jetbrains.mps.bootstrap.helgins" />
  <language namespace="jetbrains.mps.core" />
  <language namespace="jetbrains.mps.bootstrap.sharedConcepts" />
  <language namespace="jetbrains.mps.ypath" />
  <maxImportIndex value="18" />
  <import index="1" modelUID="jetbrains.mps.ypath.structure" version="-1" />
  <import index="2" modelUID="jetbrains.mps.core.structure" version="-1" />
  <import index="3" modelUID="java.lang@java_stub" version="-1" />
  <import index="4" modelUID="jetbrains.mps.ypath.structure@java_stub" version="-1" />
  <import index="5" modelUID="jetbrains.mps.ypath.actions" version="-1" />
  <import index="6" modelUID="jetbrains.mps.baseLanguage.structure" version="-1" />
  <import index="7" modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.structure" version="-1" />
  <import index="8" modelUID="jetbrains.mps.smodel@java_stub" version="-1" />
  <import index="10" modelUID="jetbrains.mps.baseLanguage.constraints" version="-1" />
  <import index="11" modelUID="jetbrains.mps.smodel.search@java_stub" version="-1" />
  <import index="12" modelUID="jetbrains.mps.core.constraints" version="-1" />
  <import index="13" modelUID="jetbrains.mps.helgins.uiActions@java_stub" version="-1" />
  <import index="14" modelUID="jetbrains.mps.ypath.design@java_stub" version="-1" />
  <import index="15" modelUID="jetbrains.mps.generator@java_stub" version="-1" />
  <import index="16" modelUID="jetbrains.mps.ypath.constraints" version="-1" />
  <import index="17" modelUID="jetbrains.mps.ypath.runtime@java_stub" version="-1" />
  <import index="18" modelUID="jetbrains.mps.ypath.plugin@java_stub" version="-1" />
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1178187486791">
    <link role="concept" targetNodeId="1.1168428529658" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1184345381945">
      <property name="name" value="getPresentation" />
      <link role="overridenMethod" targetNodeId="12.1180102203531" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184345381947">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1184345477702">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1184345509453">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1184345511063">
              <property name="value" value="&gt;" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1184345516498">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1184345550939">
                <link role="baseMethodDeclaration" targetNodeId="13.~PresentationManager.toString_1(jetbrains.mps.smodel.SNode):java.lang.String" resolveInfo="toString_1" />
                <link role="classConcept" targetNodeId="13.~PresentationManager" resolveInfo="PresentationManager" />
                <node role="actualArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184345557909">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1184345560185">
                    <link role="link" targetNodeId="1.1168428551640" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1184345556934" />
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1184589665002">
                <property name="value" value="treepath&lt;" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1190026849759">
        <link role="classifier" targetNodeId="3.~String" resolveInfo="String" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1187948042730">
      <property name="name" value="getAbstractCreator" />
      <link role="overridenMethod" targetNodeId="10.1187945523562" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1187948042732">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1187948064253">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1187948064254">
            <property name="name" value="creator" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1187948064255">
              <link role="concept" targetNodeId="1.1168428603688" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1187948094385">
              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1187948094386">
                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1187948094387">
                  <link role="concept" targetNodeId="1.1168428603688" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1187948102739">
          <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1187948141330">
            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetTargetOperation" id="1187948144937">
              <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1187948146952">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_CopyOperation" id="1187948148181" />
                <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1187948146418" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1187948103361">
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1187948140667">
                <link role="link" targetNodeId="1.1179235945873" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1187948102740">
                <link role="variableDeclaration" targetNodeId="1187948064254" resolveInfo="creator" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1187948099831">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1187948099832">
            <link role="variableDeclaration" targetNodeId="1187948064254" resolveInfo="creator" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1190026849760">
        <link role="concept" targetNodeId="6.1145552809883" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1178187486792">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1178187486793" />
    </node>
    <node role="properties" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodePropertyConstraint" id="1177410539875">
      <link role="applicableProperty" targetNodeId="2.1169194664001" />
      <node role="propertyGetter" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_PropertyGetter" id="1177410564083">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1177410564084">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1177410566712">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1177410604041">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1177410610438">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1177410627193">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1177410628736">
                    <property name="value" value="&gt;" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1177410624987">
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1177410619631">
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.PropertyGetter_FunctionParm_node" id="1177410617037" />
                      <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1177410622226">
                        <link role="link" targetNodeId="1.1168428551640" />
                      </node>
                    </node>
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1177410625981">
                      <link role="property" targetNodeId="2.1169194664001" />
                    </node>
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1177410605286">
                  <property name="value" value="&lt;" />
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1177410596275">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.PropertyGetter_FunctionParm_node" id="1177410594249" />
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptPropertyAccess" id="1177410602022">
                  <link role="conceptProperty" targetNodeId="2.1137473891462" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1178980575228">
    <property name="package" value="treeOperation.traverse" />
    <link role="concept" targetNodeId="1.1168524996431" />
    <node role="references" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodeReferentConstraint" id="1184147967382">
      <link role="applicableLink" targetNodeId="1.1184147586245" />
      <node role="searchScopeFactory" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_ReferentSearchScope_Factory" id="1184147971616">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184147971617">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1184148883089">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1184148883090">
              <property name="name" value="tpoe" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1184148883091">
                <link role="concept" targetNodeId="1.1168468602533" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1184148849934">
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184148849935">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1184148895792">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1184148897269">
                  <node role="rValue" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptParameter_ReferentSearchScope_enclosingNode" id="1184148899964" />
                  <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1184148895793">
                    <link role="variableDeclaration" targetNodeId="1184148883090" resolveInfo="tpoe" />
                  </node>
                </node>
              </node>
            </node>
            <node role="condition" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184148856750">
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1184148857851">
                <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1184148861943">
                  <link role="conceptDeclaration" targetNodeId="1.1168468602533" />
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptParameter_ReferentSearchScope_enclosingNode" id="1184148855109" />
            </node>
            <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1184148902943">
              <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184148902944">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1184148905693">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1184148906106">
                    <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1184148905694">
                      <link role="variableDeclaration" targetNodeId="1184148883090" resolveInfo="tpoe" />
                    </node>
                    <node role="rValue" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184148912301">
                      <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1184148912302">
                        <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1184148912303">
                          <link role="concept" targetNodeId="1.1168468602533" />
                        </node>
                      </node>
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptParameter_ReferentSearchScope_enclosingNode" id="1184148912304" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1184580664509">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1184580666481">
              <link role="baseMethodDeclaration" targetNodeId="11.~SimpleSearchScope.&lt;init&gt;(java.util.List)" resolveInfo="SimpleSearchScope" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression" id="1184591357719">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184591342112">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1184591343459">
                    <link role="conceptMethodDeclaration" targetNodeId="1184591220431" resolveInfo="getFeature" />
                    <node role="actualArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184591353276">
                      <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1184591355592">
                        <link role="link" targetNodeId="1.1168428551640" />
                      </node>
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1184591350411">
                        <link role="concept" targetNodeId="1.1168428529658" />
                        <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184591347299">
                          <node role="nodeOperation" type="jetbrains.mps.bootstrap.helgins.structure.Node_TypeOperation" id="1184591348775" />
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1184591346630">
                            <link role="variableDeclaration" targetNodeId="1184148883090" resolveInfo="tpoe" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184591338525">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1184591340103">
                      <link role="conceptMethodDeclaration" targetNodeId="1184590859224" resolveInfo="getTreePath" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1184591337633">
                      <link role="variableDeclaration" targetNodeId="1184148883090" resolveInfo="tpoe" />
                    </node>
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ToListOperation" id="1184591359105" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1178980580496">
      <property name="name" value="getAxisInternalValue" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1178980592515">
        <link role="classifier" targetNodeId="3.~String" resolveInfo="String" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1178980580498">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1179162060943">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1179162096634">
            <link role="baseMethodDeclaration" targetNodeId="5.1179161831408" />
            <link role="classConcept" targetNodeId="5.1179161788761" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1179162097775">
              <link role="classConcept" targetNodeId="17.~TraversalAxis" resolveInfo="TraversalAxis" />
              <link role="baseMethodDeclaration" targetNodeId="17.~TraversalAxis.parseValue(java.lang.String):jetbrains.mps.ypath.runtime.TraversalAxis" resolveInfo="parseValue" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179162112662">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1179162097777" />
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1179162114235">
                  <link role="property" targetNodeId="1.1168527174196" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1178980575229">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1178980575230" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1179306328870">
    <property name="package" value="treePath" />
    <link role="concept" targetNodeId="1.1179235924605" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1179306333014">
      <property name="name" value="getNodeType" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1179306341158">
        <link role="concept" targetNodeId="6.1068431790189" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179306333016">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1184578558434">
          <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184578559442">
            <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184578559443">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1184578559444" />
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1184578559445">
                <link role="link" targetNodeId="1.1179235945873" />
              </node>
            </node>
            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1184578559446">
              <link role="link" targetNodeId="1.1168428551640" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1184591220431">
      <property name="name" value="getFeature" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1184591240537">
        <property name="name" value="type" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1184591242959">
          <link role="concept" targetNodeId="6.1068431790189" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceType" id="1184591230353">
        <node role="elementType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1184591233443">
          <link role="concept" targetNodeId="1.1184066209434" />
        </node>
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184591220433">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1184591223143">
          <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184591224819">
            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1184591226638">
              <link role="link" targetNodeId="1.1183980376561" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1184591224082" />
          </node>
        </node>
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1179306328871">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179306328872" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1179319915907">
    <property name="package" value="treePath" />
    <link role="concept" targetNodeId="1.1168428680123" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1179319917738">
      <property name="name" value="returnsArray" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1179319922107" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179319917740">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1179319933453">
          <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179319951135">
            <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179319944335">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1179319933454" />
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.helgins.structure.Node_TypeOperation" id="1179319949710" />
            </node>
            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1179319958574">
              <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1179319961560">
                <link role="conceptDeclaration" targetNodeId="6.1070534760951" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1179319962780">
      <property name="name" value="returnsSequence" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1179319964502" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179319962782">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1179320136787">
          <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179320199312">
            <node role="leftExpression" type="jetbrains.mps.bootstrap.helgins.structure.CoerceExpression" id="1179320136788">
              <node role="pattern" type="jetbrains.mps.bootstrap.helgins.structure.ConceptReference" id="1179320148653">
                <property name="name" value="sequenceType" />
                <link role="concept" targetNodeId="7.1151689724996" />
              </node>
              <node role="nodeToCoerce" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179320141260">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1179320139806" />
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.helgins.structure.Node_TypeOperation" id="1179320142574" />
              </node>
            </node>
            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNotNullOperation" id="1179320200797" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1179573502028">
      <property name="name" value="getExpectedReturnType" />
      <link role="overridenMethod" targetNodeId="10.1178571276073" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179573502030">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1179573516536">
          <node role="expression" type="jetbrains.mps.bootstrap.helgins.structure.Quotation" id="1179573519198">
            <node role="quotedNode" type="jetbrains.mps.ypath.structure.ArrayOrSequenceType" id="1179573545499">
              <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1179573573517">
                <link role="classifier" targetNodeId="3.~Object" resolveInfo="Object" />
                <node role="_attr_$attribute" type="jetbrains.mps.bootstrap.helgins.structure.Antiquotation" id="1179573575677">
                  <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179573592406">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1179573597583">
                      <link role="conceptMethodDeclaration" targetNodeId="1179306333014" resolveInfo="getNodeType" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179573580313">
                      <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1179573582068">
                        <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1179573584774">
                          <link role="concept" targetNodeId="1.1179235924605" />
                        </node>
                      </node>
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1179573578446" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1190026849776">
        <link role="classifier" targetNodeId="8.~SNode" resolveInfo="SNode" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1179319915908">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179319915909" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1179335431996">
    <property name="package" value="treePath" />
    <link role="concept" targetNodeId="1.1168879975004" />
    <node role="references" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodeReferentConstraint" id="1184069930604">
      <link role="applicableLink" targetNodeId="1.1184069859692" />
      <node role="searchScopeFactory" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_ReferentSearchScope_Factory" id="1184069936070">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184069936071">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1184069945837">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1184069945838">
              <link role="baseMethodDeclaration" targetNodeId="11.~SimpleSearchScope.&lt;init&gt;(java.util.List)" resolveInfo="SimpleSearchScope" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184069989796">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccessAsList" id="1184069992575">
                  <link role="link" targetNodeId="1.1183980376561" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1184069983216">
                  <link role="concept" targetNodeId="1.1179235924605" />
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptParameter_ReferentSearchScope_enclosingNode" id="1184069972769" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1179335433937">
      <property name="name" value="getDefaultProperty" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1179335437236">
        <link role="concept" targetNodeId="1.1175160940972" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179335433939">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1179335502537">
          <node role="expression" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression" id="1179336247087">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression" id="1179335533289">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179335503945">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1179335502538" />
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1179335509759">
                  <link role="link" targetNodeId="1.1172240749936" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.MapOperation" id="1179335537558">
                <node role="mapper" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.MapperBlock" id="1179335537559">
                  <node role="defaultInputElement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.DefaultInputElement" id="1179335537560">
                    <property name="name" value="it" />
                  </node>
                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179335537561">
                    <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1179335580725">
                      <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1179335580726">
                        <property name="name" value="property" />
                      </node>
                      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179335580728">
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1179335599363">
                          <node role="condition" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179335610160">
                            <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1179336197904">
                              <link role="concept" targetNodeId="1.1175160940972" />
                              <node role="leftExpression" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1179335601136">
                                <link role="variable" targetNodeId="1179335580726" resolveInfo="property" />
                              </node>
                            </node>
                            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1179336214821">
                              <link role="property" targetNodeId="1.1175877871677" />
                            </node>
                          </node>
                          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179335599365">
                            <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.TraversalYieldStatement" id="1179336220813">
                              <node role="value" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1179336222963">
                                <link role="variable" targetNodeId="1179335580726" resolveInfo="property" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="inputSequence" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179335590418">
                        <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1179335590419">
                          <link role="concept" targetNodeId="1.1172240563057" />
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ClosureParameterReference" id="1179335590420">
                            <link role="closureParameter" targetNodeId="1179335537560" resolveInfo="it" />
                          </node>
                        </node>
                        <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1179335590421">
                          <link role="link" targetNodeId="1.1175162866857" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetFirstOperation" id="1179336252923" />
          </node>
        </node>
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1179335431997">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179335431998" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1179336361256">
    <property name="package" value="treeOperation.filter" />
    <link role="concept" targetNodeId="1.1175879071372" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1179336363244">
      <property name="name" value="getDefaultProperty" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1179336366200">
        <link role="concept" targetNodeId="1.1175160940972" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179336363246">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1179336458187">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1179336458188">
            <property name="name" value="tpoe" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1179336458189">
              <link role="concept" targetNodeId="1.1168468602533" />
            </node>
            <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179336476522">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1179336475238" />
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1179336478304">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1179336481604">
                  <link role="concept" targetNodeId="1.1168468602533" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.WhileStatement" id="1179336513921">
          <node role="condition" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179336526333">
            <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179336544153">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1179336524596">
                <link role="variableDeclaration" targetNodeId="1179336458188" resolveInfo="tpoe" />
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1179336545357">
                <link role="link" targetNodeId="1.1168468622494" />
              </node>
            </node>
            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1179336529381">
              <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1179336532477">
                <link role="conceptDeclaration" targetNodeId="1.1168468602533" />
              </node>
            </node>
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179336513923">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1179336541557">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1179336550755">
                <node role="rValue" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1179336559273">
                  <link role="concept" targetNodeId="1.1168468602533" />
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179336554295">
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1179336552776">
                      <link role="variableDeclaration" targetNodeId="1179336458188" resolveInfo="tpoe" />
                    </node>
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1179336555298">
                      <link role="link" targetNodeId="1.1168468622494" />
                    </node>
                  </node>
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1179336541558">
                  <link role="variableDeclaration" targetNodeId="1179336458188" resolveInfo="tpoe" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1179336566508">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179336566509">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1179336591906">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1179336593617" />
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1179336586950">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179336586951">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179336586952">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1179336586953">
                  <link role="variableDeclaration" targetNodeId="1179336458188" resolveInfo="tpoe" />
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1179336586954">
                  <link role="link" targetNodeId="1.1168468622494" />
                </node>
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1179336586955">
                <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1179336586956">
                  <link role="conceptDeclaration" targetNodeId="1.1168890168054" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1179336602790">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1179336602791">
            <property name="name" value="tpae" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1179336602792">
              <link role="concept" targetNodeId="1.1168890168054" />
            </node>
            <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1179336615510">
              <link role="concept" targetNodeId="1.1168890168054" />
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179336612977">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1179336611562">
                  <link role="variableDeclaration" targetNodeId="1179336458188" resolveInfo="tpoe" />
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1179336614421">
                  <link role="link" targetNodeId="1.1168468622494" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1179336652757">
          <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179418761514">
            <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179336656927">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1179336655431">
                <link role="variableDeclaration" targetNodeId="1179336602791" resolveInfo="tpae" />
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1179336660764">
                <link role="link" targetNodeId="1.1168890235188" />
              </node>
            </node>
            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1179418761517">
              <link role="conceptMethodDeclaration" targetNodeId="1179335433937" resolveInfo="getDefaultProperty" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1179336361257">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179336361258" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1179337007888">
    <property name="package" value="treePath" />
    <link role="concept" targetNodeId="1.1172240563057" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1179337009627">
      <property name="name" value="getTriggerClassName" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1179337013585">
        <link role="classifier" targetNodeId="3.~String" resolveInfo="String" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179337009629">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1179337029236">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1179337064358">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1179337065319">
              <property name="value" value="_NodeKindTrigger" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179337049344">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1179337048074" />
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1179337054160">
                <link role="property" targetNodeId="2.1169194664001" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1179337569969">
      <property name="name" value="getTriggerFQClassName" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1179337572649">
        <link role="classifier" targetNodeId="3.~String" resolveInfo="String" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179337569971">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1179337584911">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1179337584912">
            <property name="name" value="packageName" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1179337584913">
              <link role="classifier" targetNodeId="3.~String" resolveInfo="String" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1179337584914">
              <link role="baseMethodDeclaration" targetNodeId="8.~SModelDescriptor.getLongName():java.lang.String" resolveInfo="getLongName" />
              <node role="instance" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1179337584915">
                <link role="baseMethodDeclaration" targetNodeId="8.~SModel.getModelDescriptor():jetbrains.mps.smodel.SModelDescriptor" resolveInfo="getModelDescriptor" />
                <node role="instance" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179337624735">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1179337622809" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetModelOperation" id="1179337626438" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1179337584919">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1179337584920">
            <property name="name" value="outerClassName" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1179337584921">
              <link role="classifier" targetNodeId="3.~String" resolveInfo="String" />
            </node>
            <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179337584922">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179337584923">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1179337629644" />
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1179337584925">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1179337584926">
                    <link role="concept" targetNodeId="1.1168879975004" />
                  </node>
                </node>
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1179337636027">
                <link role="property" targetNodeId="2.1169194664001" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1179337584928">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1179337584929">
            <property name="name" value="innerClassName" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1179337584930">
              <link role="classifier" targetNodeId="3.~String" resolveInfo="String" />
            </node>
            <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179418762158">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1179337632741" />
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1179418762161">
                <link role="conceptMethodDeclaration" targetNodeId="1179337009627" resolveInfo="getTriggerClassName" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1179337584933">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1179337584934">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1179337584935">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1179337584936">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1179337584937">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1179337584938">
                    <link role="variableDeclaration" targetNodeId="1179337584929" resolveInfo="innerClassName" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1179337584939">
                    <property name="value" value="." />
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1179337584940">
                  <link role="variableDeclaration" targetNodeId="1179337584920" resolveInfo="outerClassName" />
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1179337584941">
                <property name="value" value="!" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1179337584942">
              <link role="variableDeclaration" targetNodeId="1179337584912" resolveInfo="packageName" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1179337007889">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179337007890" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1179341922990">
    <property name="package" value="treeOperation.filter" />
    <link role="concept" targetNodeId="1.1172242735136" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1179341925025">
      <property name="name" value="getTreeNodeKind" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1179341934616">
        <link role="concept" targetNodeId="1.1172240563057" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179341925027">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1179341964987">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1179341964988">
            <property name="name" value="treeNodeKind" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1179341964989">
              <link role="concept" targetNodeId="1.1172240563057" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1179341944163">
          <node role="condition" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179341957024">
            <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179341948202">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1179341946652" />
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1179341954800">
                <link role="link" targetNodeId="1.1175165403535" />
              </node>
            </node>
            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNotNullOperation" id="1179341983606" />
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179341944165">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1179341980364">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1179341985407">
                <node role="rValue" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179341993688">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179341989119">
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1179341987380" />
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1179341991635">
                      <link role="link" targetNodeId="1.1175165403535" />
                    </node>
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1179341995037">
                    <link role="link" targetNodeId="1.1175167444487" />
                  </node>
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1179341980365">
                  <link role="variableDeclaration" targetNodeId="1179341964988" resolveInfo="treeNodeKind" />
                </node>
              </node>
            </node>
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1179341996669">
            <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179341996670">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1179341999067">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1179341999701">
                  <node role="rValue" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179342004918">
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1179342003051" />
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1179342006331">
                      <link role="link" targetNodeId="1.1172242802393" />
                    </node>
                  </node>
                  <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1179341999068">
                    <link role="variableDeclaration" targetNodeId="1179341964988" resolveInfo="treeNodeKind" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1179342009146">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1179342011435">
            <link role="variableDeclaration" targetNodeId="1179341964988" resolveInfo="treeNodeKind" />
          </node>
        </node>
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1179341922991">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179341922992" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1179394818388">
    <property name="package" value="treePath" />
    <link role="concept" targetNodeId="1.1175160940972" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1179394820016">
      <property name="name" value="getClassName" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1179394833918">
        <link role="classifier" targetNodeId="3.~String" resolveInfo="String" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179394820018">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1179394899285">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1179394891783">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1179394898323">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1179394907774">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1179394908928">
                  <property name="value" value="_Property" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179394903787">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1179394902606" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1179394904607">
                    <link role="property" targetNodeId="2.1169194664001" />
                  </node>
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1179394893524">
                <property name="value" value="_" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179394888652">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1179394883600">
                <link role="concept" targetNodeId="1.1172240563057" />
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179394874484">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1179394872840" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1179394875391" />
                </node>
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1179394890153">
                <link role="property" targetNodeId="2.1169194664001" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1179398802547">
      <property name="name" value="getFQClassName" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1179398802548">
        <link role="classifier" targetNodeId="3.~String" resolveInfo="String" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179398802549">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1179398830350">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1179398830351">
            <property name="name" value="packageName" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1179398830352">
              <link role="classifier" targetNodeId="3.~String" resolveInfo="String" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1179398830353">
              <link role="baseMethodDeclaration" targetNodeId="8.~SModelDescriptor.getLongName():java.lang.String" resolveInfo="getLongName" />
              <node role="instance" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1179398830354">
                <link role="baseMethodDeclaration" targetNodeId="8.~SModel.getModelDescriptor():jetbrains.mps.smodel.SModelDescriptor" resolveInfo="getModelDescriptor" />
                <node role="instance" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179398830355">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1179398830356" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetModelOperation" id="1179398830357" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1179398830358">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1179398830359">
            <property name="name" value="outerClassName" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1179398830360">
              <link role="classifier" targetNodeId="3.~String" resolveInfo="String" />
            </node>
            <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179398830361">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179398830362">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1179398830363" />
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1179398830364">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1179398830365">
                    <link role="concept" targetNodeId="1.1168879975004" />
                  </node>
                </node>
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1179398830366">
                <link role="property" targetNodeId="2.1169194664001" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1179398830367">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1179398830368">
            <property name="name" value="innerClassName" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1179398830369">
              <link role="classifier" targetNodeId="3.~String" resolveInfo="String" />
            </node>
            <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179418761025">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1179398830371" />
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1179418761028">
                <link role="conceptMethodDeclaration" targetNodeId="1179394820016" resolveInfo="getClassName" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1179398830372">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1179398830373">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1179398830374">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1179398830375">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1179398830376">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1179398830377">
                    <link role="variableDeclaration" targetNodeId="1179398830368" resolveInfo="innerClassName" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1179398830378">
                    <property name="value" value="." />
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1179398830379">
                  <link role="variableDeclaration" targetNodeId="1179398830359" resolveInfo="outerClassName" />
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1179398830380">
                <property name="value" value="!" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1179398830381">
              <link role="variableDeclaration" targetNodeId="1179398830351" resolveInfo="packageName" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1179394818389">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179394818390" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1179420058058">
    <link role="concept" targetNodeId="1.1168428709096" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1179420058059">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179420058060">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1179420068550">
          <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179420129643">
            <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179420069505">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1179420068551" />
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1179420117256">
                <link role="property" targetNodeId="2.1169194664001" />
              </node>
            </node>
            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_SetOperation" id="1179420131084">
              <node role="value" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1179420158139">
                <property name="value" value="node" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1179573613932">
    <property name="package" value="treePath" />
    <link role="concept" targetNodeId="1.1168428668253" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1179573615575">
      <property name="name" value="getExpectedReturnType" />
      <link role="overridenMethod" targetNodeId="10.1178571276073" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179573615577">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1179573626907">
          <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179573678364">
            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1179573680649">
              <link role="conceptMethodDeclaration" targetNodeId="1179306333014" resolveInfo="getNodeType" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179573644498">
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1179573646235">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1179573649267">
                  <link role="concept" targetNodeId="1.1179235924605" />
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1179573643415" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1190026849777">
        <link role="classifier" targetNodeId="8.~SNode" resolveInfo="SNode" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1179573613933">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179573613934" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1179740632548">
    <link role="concept" targetNodeId="1.1179740189248" />
    <node role="references" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodeReferentConstraint" id="1179740637335">
      <link role="applicableLink" targetNodeId="1.1179740244195" />
      <node role="searchScopeFactory" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_ReferentSearchScope_Factory" id="1179740644607">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179740644608">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1179740678095">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1179740678096">
              <property name="name" value="searchScope" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1179740678097">
                <link role="classifier" targetNodeId="11.~ISearchScope" resolveInfo="ISearchScope" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1179740687826">
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179740687827">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1179740853731">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1179740854927">
                  <node role="rValue" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1179740887897">
                    <link role="baseMethodDeclaration" targetNodeId="11.~SimpleSearchScope.&lt;init&gt;(java.util.List)" resolveInfo="SimpleSearchScope" />
                    <node role="actualArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179741015365">
                      <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1179741024069">
                        <link role="link" targetNodeId="1.1172240749936" />
                      </node>
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179740975547">
                        <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1179740992523">
                          <link role="link" targetNodeId="1.1179740217128" />
                        </node>
                        <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunctionParameter_referenceNode" id="1179740974080" />
                      </node>
                    </node>
                  </node>
                  <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1179740853732">
                    <link role="variableDeclaration" targetNodeId="1179740678096" resolveInfo="searchScope" />
                  </node>
                </node>
              </node>
            </node>
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1179740769285">
              <node role="rightExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179740817044">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNotNullOperation" id="1179740820100" />
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179740773724">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1179740815613">
                    <link role="link" targetNodeId="1.1179740217128" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunctionParameter_referenceNode" id="1179740772292" />
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179740763441">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNotNullOperation" id="1179740764976" />
                <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunctionParameter_referenceNode" id="1179740758790" />
              </node>
            </node>
            <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1179741036244">
              <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179741036245">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1179741037870">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1179741039887">
                    <node role="rValue" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1179741046701">
                      <link role="baseMethodDeclaration" targetNodeId="11.~EmptySearchScope.&lt;init&gt;()" resolveInfo="EmptySearchScope" />
                    </node>
                    <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1179741037871">
                      <link role="variableDeclaration" targetNodeId="1179740678096" resolveInfo="searchScope" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1179740692287">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1179740694869">
              <link role="variableDeclaration" targetNodeId="1179740678096" resolveInfo="searchScope" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1179740632549">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179740632550" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1180014791481">
    <property name="package" value="treeOperation.visit" />
    <link role="concept" targetNodeId="1.1180011113930" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1180014794484">
      <property name="name" value="getEnclosingVisitNodesStatement" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1180014799128">
        <link role="concept" targetNodeId="1.1180006635472" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1180014794486">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1180014819661">
          <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1180014821029">
            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1180014822454">
              <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1180014824863">
                <link role="concept" targetNodeId="1.1180006635472" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1180014819662" />
          </node>
        </node>
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1180014791482">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1180014791483" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1180024300263">
    <property name="package" value="treeOperation.visit" />
    <link role="concept" targetNodeId="1.1180007355512" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1180024304313">
      <property name="name" value="getTreePathAspect" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1180024308959">
        <link role="concept" targetNodeId="1.1168879975004" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1180024304315">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1180024365722">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1180024365723">
            <property name="name" value="treePathAspect" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1180024365724">
              <link role="concept" targetNodeId="1.1168879975004" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1180024379915" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1180024356151">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1180024356152">
            <property name="name" value="switchStatement" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1180024356153">
              <link role="concept" targetNodeId="1.1180023776692" />
            </node>
            <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1180024330129">
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1180024332444">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1180024334807">
                  <link role="concept" targetNodeId="1.1180023776692" />
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1180024328637" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1180024384903">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1180024384904">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1180024401937">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1180024636777">
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1180024633187">
                  <link role="variableDeclaration" targetNodeId="1180024365723" resolveInfo="treePathAspect" />
                </node>
                <node role="rValue" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1180024641511">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1180024643944">
                    <link role="link" targetNodeId="1.1168890235188" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1180024637455">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1180024637456">
                      <link role="link" targetNodeId="1.1180023956589" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1180024637457">
                      <link role="variableDeclaration" targetNodeId="1180024356152" resolveInfo="switchStatement" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1180024553293">
            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNotNullOperation" id="1180024555736" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1180024550175">
              <link role="variableDeclaration" targetNodeId="1180024356152" resolveInfo="switchStatement" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1180024397143">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1180024649300">
            <link role="variableDeclaration" targetNodeId="1180024365723" resolveInfo="treePathAspect" />
          </node>
        </node>
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1180024300264">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1180024300265" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1180024664561">
    <property name="package" value="treeOperation.visit" />
    <link role="concept" targetNodeId="1.1180007382905" />
    <node role="references" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodeReferentConstraint" id="1180024666392">
      <link role="applicableLink" targetNodeId="1.1180007405188" />
      <node role="searchScopeFactory" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_ReferentSearchScope_Factory" id="1180024669644">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1180024669645">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1180024675865">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1180024678836">
              <link role="baseMethodDeclaration" targetNodeId="11.~SimpleSearchScope.&lt;init&gt;(java.util.List)" resolveInfo="SimpleSearchScope" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1180024694298">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1180024700272">
                  <link role="link" targetNodeId="1.1172240749936" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1180025963951">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1180025969162">
                    <link role="link" targetNodeId="1.1168890235188" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1180025956613">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1180025961884">
                      <link role="link" targetNodeId="1.1180023956589" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1180025946093">
                      <link role="concept" targetNodeId="1.1180023776692" />
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptParameter_ReferentSearchScope_enclosingNode" id="1180025942627" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1180024664562">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1180024664563" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1183979237109">
    <property name="package" value="treePath.features.functions" />
    <link role="concept" targetNodeId="1.1183978641483" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1183979240563">
      <property name="name" value="getExpectedReturnType" />
      <link role="overridenMethod" targetNodeId="10.1178571276073" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1183979240565">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1183979305634">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1183979305635">
            <property name="name" value="treepath" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1183979305636">
              <link role="concept" targetNodeId="1.1179235924605" />
            </node>
            <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1183979283358">
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1183979285888">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1183979289082">
                  <link role="concept" targetNodeId="1.1179235924605" />
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1183979281765" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1183979313126">
          <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1183979341099">
            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1183979344393">
              <link role="link" targetNodeId="1.1168428551640" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1183979315382">
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1183979319637">
                <link role="link" targetNodeId="1.1179235945873" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1183979314601">
                <link role="variableDeclaration" targetNodeId="1183979305635" resolveInfo="treepath" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1190026849794">
        <link role="classifier" targetNodeId="8.~SNode" resolveInfo="SNode" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1183979237110">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1183979237111" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1183979544303">
    <property name="package" value="treePath.features.functions" />
    <link role="concept" targetNodeId="1.1183978693009" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1183979546076">
      <property name="name" value="getExpectedReturnType" />
      <link role="overridenMethod" targetNodeId="10.1178571276073" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1183979546078">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1183979553590">
          <node role="expression" type="jetbrains.mps.bootstrap.helgins.structure.Quotation" id="1183979559951">
            <node role="quotedNode" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1183979561883" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1190026849795">
        <link role="classifier" targetNodeId="8.~SNode" resolveInfo="SNode" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1183979544304">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1183979544305" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1184064347251">
    <property name="package" value="treePath.features.functions" />
    <link role="concept" targetNodeId="1.1184064321014" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1184064349509">
      <property name="name" value="getExpectedReturnType" />
      <link role="overridenMethod" targetNodeId="10.1178571276073" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184064349511">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1184064495278">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1184064495279">
            <property name="name" value="nodeType" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1184064495280">
              <link role="concept" targetNodeId="6.1068431790189" />
            </node>
            <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184064489285">
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1184064490853">
                <link role="link" targetNodeId="1.1168428551640" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184064487383">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1184064488947">
                  <link role="link" targetNodeId="1.1179235945873" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184064475165">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1184064477585">
                    <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1184064480638">
                      <link role="concept" targetNodeId="1.1179235924605" />
                    </node>
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1184064474408" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1184064356579">
          <node role="expression" type="jetbrains.mps.bootstrap.helgins.structure.Quotation" id="1184064410682">
            <node role="quotedNode" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceType" id="1184064428546">
              <node role="elementType" type="jetbrains.mps.baseLanguage.structure.Type" id="1184064428547">
                <node role="_attr_$attribute" type="jetbrains.mps.bootstrap.helgins.structure.Antiquotation" id="1184064499731">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1184064502625">
                    <link role="variableDeclaration" targetNodeId="1184064495279" resolveInfo="nodeType" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1190026849796">
        <link role="classifier" targetNodeId="8.~SNode" resolveInfo="SNode" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1184064347252">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184064347253" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1184069384188">
    <property name="package" value="treePath.features" />
    <link role="concept" targetNodeId="1.1184066209434" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1184069386479">
      <property name="name" value="getFullName" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1184069393674">
        <link role="classifier" targetNodeId="3.~String" resolveInfo="String" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184069386481">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1184069408084">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1184069415310">
            <node role="rightExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184069420619">
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1184069441679">
                <link role="property" targetNodeId="2.1169194664001" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1184069420133" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1184069409881">
              <property name="value" value="Feature_" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1184069384189">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184069384190" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1184589107280">
    <property name="package" value="treePath.features" />
    <link role="concept" targetNodeId="1.1183978481785" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1184589107281">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184589107282" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1184589169689">
    <property name="package" value="treePath.features" />
    <link role="concept" targetNodeId="1.1184066481897" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1184589169690">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184589169691" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1184590856526">
    <property name="package" value="treeOperation" />
    <link role="concept" targetNodeId="1.1168468602533" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1184590859224">
      <property name="name" value="getTreePath" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1184590959521">
        <link role="concept" targetNodeId="1.1179235924605" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184590859226">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1184591001982">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1184591001983">
            <property name="name" value="tpae" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1184591001984" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression" id="1184590994239">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression" id="1184590980504">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184590976613">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetDescendantsOperation" id="1184590978613" />
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1184590976284" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.WhereOperation" id="1184590981905">
                  <node role="whereClosure" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.WhereBlock" id="1184590981906">
                    <node role="defaultInputElement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.DefaultInputElement" id="1184590981907">
                      <property name="name" value="it" />
                    </node>
                    <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184590981908">
                      <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1184590986064">
                        <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184590987342">
                          <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1184590988690">
                            <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1184590991007">
                              <link role="conceptDeclaration" targetNodeId="1.1168890168054" />
                            </node>
                          </node>
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ClosureParameterReference" id="1184590986065">
                            <link role="closureParameter" targetNodeId="1184590981907" resolveInfo="it" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetFirstOperation" id="1184590996142" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1184591015489">
          <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184591025221">
            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1184591029058">
              <link role="link" targetNodeId="1.1168890235188" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1184591019360">
              <link role="concept" targetNodeId="1.1168890168054" />
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1184591017791">
                <link role="variableDeclaration" targetNodeId="1184591001983" resolveInfo="tpae" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1184590856527">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184590856528" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1184593647632">
    <property name="package" value="treePath.features.functions" />
    <link role="concept" targetNodeId="1.1184593387281" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1184593649703">
      <property name="name" value="getExpectedReturnType" />
      <link role="overridenMethod" targetNodeId="10.1178571276073" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184593649705">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1184606695480">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1184606695481">
            <property name="name" value="parameterType" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1184606695482">
              <link role="concept" targetNodeId="6.1068431790189" />
            </node>
            <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184606689863">
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1184606692024">
                <link role="link" targetNodeId="1.1184659264134" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184606679967">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1184606681450">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1184606685599">
                    <link role="concept" targetNodeId="1.1184066209434" />
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1184606679921" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1184606701305">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184606701306">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1184606713060">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1184606714531" />
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184606709393">
            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNullOperation" id="1184606710730" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1184606703310">
              <link role="variableDeclaration" targetNodeId="1184606695481" resolveInfo="parameterType" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1184593665933">
          <node role="expression" type="jetbrains.mps.bootstrap.helgins.structure.Quotation" id="1184593673123">
            <node role="quotedNode" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceType" id="1184593675272">
              <node role="elementType" type="jetbrains.mps.baseLanguage.structure.Type" id="1184593675273">
                <node role="_attr_$attribute" type="jetbrains.mps.bootstrap.helgins.structure.Antiquotation" id="1184593705740">
                  <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184593718430">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1184593721763">
                      <link role="link" targetNodeId="1.1184659264134" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184593708093">
                      <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1184593710385">
                        <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1184593713514">
                          <link role="concept" targetNodeId="1.1184066209434" />
                        </node>
                      </node>
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1184593707992" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1190026849797">
        <link role="classifier" targetNodeId="8.~SNode" resolveInfo="SNode" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1184593647633">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184593647634" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1184606207465">
    <property name="package" value="treePath.features.functions" />
    <link role="concept" targetNodeId="1.1184603621091" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1184606210586">
      <property name="name" value="getExpectedReturnType" />
      <link role="overridenMethod" targetNodeId="10.1178571276073" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184606210588">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1184606221879">
          <node role="expression" type="jetbrains.mps.bootstrap.helgins.structure.Quotation" id="1184606231075">
            <node role="quotedNode" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1184762534156" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1190026849798">
        <link role="classifier" targetNodeId="8.~SNode" resolveInfo="SNode" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1184606207466">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184606207467" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1184661017905">
    <property name="package" value="treePath.features.functions" />
    <link role="concept" targetNodeId="1.1184659771596" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1184661019991">
      <property name="name" value="getExpectedReturnType" />
      <link role="overridenMethod" targetNodeId="10.1178571276073" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184661019993">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1184661036493">
          <node role="expression" type="jetbrains.mps.bootstrap.helgins.structure.Quotation" id="1184661063445">
            <node role="quotedNode" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1184661129548">
              <link role="classifier" targetNodeId="3.~String" resolveInfo="String" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1190026849799">
        <link role="classifier" targetNodeId="8.~SNode" resolveInfo="SNode" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1184661017906">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184661017907" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1184774364444">
    <property name="package" value="treeOperation.traverse" />
    <link role="concept" targetNodeId="1.1168890168054" />
    <node role="references" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodeReferentConstraint" id="1184774366688">
      <link role="applicableLink" targetNodeId="1.1168890235188" />
      <node role="searchScopeFactory" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_ReferentSearchScope_Factory" id="1184774369684">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184774369685">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1184774811812">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1184774811813">
              <property name="name" value="tpae" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1184774811814">
                <link role="concept" targetNodeId="1.1168890168054" />
              </node>
              <node role="initializer" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunctionParameter_referenceNode" id="1184775092661" />
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1184774404296">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1184774406844">
              <link role="baseMethodDeclaration" targetNodeId="11.~SimpleSearchScope.&lt;init&gt;(java.util.List)" resolveInfo="SimpleSearchScope" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1184774414429">
                <link role="classConcept" targetNodeId="5.1178974535833" />
                <link role="baseMethodDeclaration" targetNodeId="5.1178974554507" />
                <node role="actualArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184774434245">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1184774484905">
                    <link role="link" targetNodeId="1.1168890213786" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1184774883435">
                    <link role="variableDeclaration" targetNodeId="1184774811813" resolveInfo="tpae" />
                  </node>
                </node>
                <node role="actualArgument" type="jetbrains.mps.bootstrap.sharedConcepts.structure.ConceptFunctionParameter_scope" id="1184774414431" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1184774364445">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184774364446" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1184789870448">
    <property name="package" value="treePath.features" />
    <link role="concept" targetNodeId="1.1184657361043" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1184789870449">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184789870450" />
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1184790036011">
    <property name="name" value="FeatureTargetTypeUtil" />
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration" id="1192792093233">
      <property name="name" value="getterExpression" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1192792111785">
        <link role="concept" targetNodeId="6.1068431790191" resolveInfo="Expression" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1192792093235" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1192792093236">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1192792179305">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1192792179306">
            <property name="name" value="gfd" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1192792179307">
              <link role="classifier" targetNodeId="14.~IGenericFeatureDesign" resolveInfo="IGenericFeatureDesign" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1192792192043">
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1192792192044">
                <link role="classifier" targetNodeId="14.~IGenericFeatureDesign" resolveInfo="IGenericFeatureDesign" />
              </node>
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalStaticMethodCall" id="1192792196139">
                <link role="baseMethodDeclaration" targetNodeId="1184840289279" resolveInfo="getFeatureDesign" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1192792198630">
                  <link role="variableDeclaration" targetNodeId="1192792122414" resolveInfo="feature" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1192792202279">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1192792202280">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.TryCatchStatement" id="1193060284349">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1193060284350">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1193060314847">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1193060314848">
                    <property name="name" value="expr" />
                    <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1193060314849">
                      <link role="classifier" targetNodeId="8.~SNode" resolveInfo="SNode" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1193060314850">
                      <link role="baseMethodDeclaration" targetNodeId="14.~IGenericFeatureDesign.getterExpression(jetbrains.mps.smodel.SNode,java.lang.Object):jetbrains.mps.smodel.SNode" resolveInfo="getterExpression" />
                      <node role="instance" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1193060314851">
                        <link role="variableDeclaration" targetNodeId="1192792179306" resolveInfo="gfd" />
                      </node>
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1193060314852">
                        <link role="variableDeclaration" targetNodeId="1192792232788" resolveInfo="srcExpr" />
                      </node>
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1193060314853">
                        <link role="variableDeclaration" targetNodeId="1192792130998" resolveInfo="param" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1193060314854">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1193060314855">
                    <link role="variableDeclaration" targetNodeId="1193060314848" resolveInfo="expr" />
                  </node>
                </node>
              </node>
              <node role="catchClause" type="jetbrains.mps.baseLanguage.structure.CatchClause" id="1193060284352">
                <node role="throwable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1193060284353">
                  <property name="name" value="t" />
                  <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1193060295321">
                    <link role="classifier" targetNodeId="3.~Throwable" resolveInfo="Throwable" />
                  </node>
                </node>
                <node role="catchBody" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1193060284355">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1193060305639">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1193060309396">
                      <link role="baseMethodDeclaration" targetNodeId="3.~Throwable.printStackTrace():void" resolveInfo="printStackTrace" />
                      <node role="instance" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1193060305640">
                        <link role="variableDeclaration" targetNodeId="1193060284353" resolveInfo="t" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1192792206336">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1192792207711" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1192792204978">
              <link role="variableDeclaration" targetNodeId="1192792179306" resolveInfo="gfd" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1192806388181">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1192806389478" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1192792122414">
        <property name="name" value="feature" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1192792122415">
          <link role="concept" targetNodeId="1.1191843944385" resolveInfo="IGenericFeature" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1192792232788">
        <property name="name" value="srcExpr" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1192792234780">
          <link role="concept" targetNodeId="6.1068431790191" resolveInfo="Expression" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1192792130998">
        <property name="name" value="param" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1192792137284">
          <link role="classifier" targetNodeId="3.~Object" resolveInfo="Object" />
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration" id="1193057674749">
      <property name="name" value="isSingleTargetCardinality" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1193057713464">
        <property name="name" value="feature" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1193057713465">
          <link role="concept" targetNodeId="1.1191843944385" resolveInfo="IGenericFeature" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1193057713469">
        <property name="name" value="param" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1193057713470">
          <link role="classifier" targetNodeId="3.~Object" resolveInfo="Object" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1193057681792" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1193057674751" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1193057674752">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1193057722905">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1193057722906">
            <property name="name" value="gfd" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1193057722907">
              <link role="classifier" targetNodeId="14.~IGenericFeatureDesign" resolveInfo="IGenericFeatureDesign" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1193057722908">
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1193057722909">
                <link role="classifier" targetNodeId="14.~IGenericFeatureDesign" resolveInfo="IGenericFeatureDesign" />
              </node>
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalStaticMethodCall" id="1193057722910">
                <link role="baseMethodDeclaration" targetNodeId="1184840289279" resolveInfo="getFeatureDesign" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1193057722911">
                  <link role="variableDeclaration" targetNodeId="1193057713464" resolveInfo="feature" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1193057722912">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1193057722913">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.TryCatchStatement" id="1193060329383">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1193060329384">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1193060333862">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1193060333863">
                    <link role="baseMethodDeclaration" targetNodeId="14.~IGenericFeatureDesign.isSingleTargetCardinality(java.lang.Object):boolean" resolveInfo="isSingleTargetCardinality" />
                    <node role="instance" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1193060333864">
                      <link role="variableDeclaration" targetNodeId="1193057722906" resolveInfo="gfd" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1193060333865">
                      <link role="variableDeclaration" targetNodeId="1193057713469" resolveInfo="param" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="catchClause" type="jetbrains.mps.baseLanguage.structure.CatchClause" id="1193060329386">
                <node role="throwable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1193060329387">
                  <property name="name" value="t" />
                  <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1193060338587">
                    <link role="classifier" targetNodeId="3.~Throwable" resolveInfo="Throwable" />
                  </node>
                </node>
                <node role="catchBody" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1193060329389">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1193060340916">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1193060345210">
                      <link role="baseMethodDeclaration" targetNodeId="3.~Throwable.printStackTrace():void" resolveInfo="printStackTrace" />
                      <node role="instance" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1193060340917">
                        <link role="variableDeclaration" targetNodeId="1193060329387" resolveInfo="t" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1193057722923">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1193057722924" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1193057722925">
              <link role="variableDeclaration" targetNodeId="1193057722906" resolveInfo="gfd" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1193057722926">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1193057733300">
            <property name="value" value="true" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration" id="1184790049968">
      <property name="name" value="getTargetType" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1184790084832">
        <property name="name" value="feature" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1184790086359">
          <link role="concept" targetNodeId="1.1184659060758" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1184849767428">
        <property name="name" value="nodeType" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1184849773211" />
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1190284784011">
        <property name="name" value="param" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1190284785844">
          <link role="classifier" targetNodeId="3.~Object" resolveInfo="Object" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1184790063735">
        <link role="concept" targetNodeId="6.1068431790189" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1184790049970" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184790049971">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1184840404985">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1184840404986">
            <property name="name" value="fd" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1184840404987">
              <link role="classifier" targetNodeId="14.~IFeatureDesign" resolveInfo="IFeatureDesign" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.LocalStaticMethodCall" id="1184840408276">
              <link role="baseMethodDeclaration" targetNodeId="1184840289279" resolveInfo="getFeatureDesign" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1184840410811">
                <link role="variableDeclaration" targetNodeId="1184790084832" resolveInfo="feature" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1184840413757">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184840413758">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.TryCatchStatement" id="1193060356680">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1193060356681">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1193060362004">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1193060362005">
                    <link role="baseMethodDeclaration" targetNodeId="14.~IFeatureDesign.getTargetType(java.lang.Object,jetbrains.mps.smodel.SNode):jetbrains.mps.smodel.SNode" resolveInfo="getTargetType" />
                    <node role="instance" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1193060362006">
                      <link role="variableDeclaration" targetNodeId="1184840404986" resolveInfo="fd" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1193060362007">
                      <link role="variableDeclaration" targetNodeId="1190284784011" resolveInfo="param" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1193060362008">
                      <link role="variableDeclaration" targetNodeId="1184849767428" resolveInfo="nodeType" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="catchClause" type="jetbrains.mps.baseLanguage.structure.CatchClause" id="1193060356683">
                <node role="throwable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1193060356684">
                  <property name="name" value="t" />
                  <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1193060366518">
                    <link role="classifier" targetNodeId="3.~Throwable" resolveInfo="Throwable" />
                  </node>
                </node>
                <node role="catchBody" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1193060356686">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1193060370462">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1193060372903">
                      <link role="baseMethodDeclaration" targetNodeId="3.~Throwable.printStackTrace():void" resolveInfo="printStackTrace" />
                      <node role="instance" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1193060370463">
                        <link role="variableDeclaration" targetNodeId="1193060356684" resolveInfo="t" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1184840416248">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1184840417752" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1184840414826">
              <link role="variableDeclaration" targetNodeId="1184840404986" resolveInfo="fd" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1184790152261">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1184790153348" />
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration" id="1190198377893">
      <property name="name" value="getParameterObjects" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1190198401541">
        <node role="elementType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1190198838471">
          <link role="concept" targetNodeId="1.1184768155075" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1190198377895" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1190198377896">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1190198436910">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1190198436911">
            <property name="name" value="fd" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1190198436912">
              <link role="classifier" targetNodeId="14.~IFeatureDesign" resolveInfo="IFeatureDesign" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.LocalStaticMethodCall" id="1190198436913">
              <link role="baseMethodDeclaration" targetNodeId="1184840289279" resolveInfo="getFeatureDesign" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1190198436914">
                <link role="variableDeclaration" targetNodeId="1190198410605" resolveInfo="feature" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1190198436916">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1190198436917">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1190198436918">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1190198436919">
                <property name="name" value="params" />
                <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceType" id="1190198436920">
                  <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1190284704700">
                    <link role="classifier" targetNodeId="3.~Object" resolveInfo="Object" />
                  </node>
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1190198436922">
                  <link role="baseMethodDeclaration" targetNodeId="14.~IFeatureDesign.getParameters(jetbrains.mps.smodel.SNode):java.lang.Iterable" resolveInfo="getParameters" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1190198436923">
                    <link role="variableDeclaration" targetNodeId="1190198436911" resolveInfo="fd" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1190198436924">
                    <link role="variableDeclaration" targetNodeId="1190198416623" resolveInfo="nodeType" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1190198436925">
              <node role="expression" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression" id="1190198436926">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression" id="1190204379326">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1190198436928">
                    <link role="variableDeclaration" targetNodeId="1190198436919" resolveInfo="params" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SelectOperation" id="1190204381020">
                    <node role="selector" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SelectorBlock" id="1190204381021">
                      <node role="defaultInputElement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.DefaultInputElement" id="1190204381022">
                        <property name="name" value="it" />
                      </node>
                      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1190204381023">
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1190204390859">
                          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1190204390860">
                            <property name="name" value="param" />
                            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1190204390861">
                              <link role="concept" targetNodeId="1.1184768155075" />
                            </node>
                            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1190204390862">
                              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1190204390863">
                                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1190204390864">
                                  <link role="concept" targetNodeId="1.1184768155075" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1190282492568">
                          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1190282492569">
                            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1190282869214">
                              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1190282869215">
                                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetTargetOperation" id="1190282869216">
                                  <node role="parameter" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1190284711875">
                                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.ClosureParameterReference" id="1190284711876">
                                      <link role="closureParameter" targetNodeId="1190204381022" />
                                    </node>
                                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1190284729277" />
                                  </node>
                                </node>
                                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1190282869218">
                                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1190282869219">
                                    <link role="link" targetNodeId="1.1190213718970" />
                                  </node>
                                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1190282869220">
                                    <link role="variableDeclaration" targetNodeId="1190204390860" resolveInfo="param" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                          <node role="condition" type="jetbrains.mps.baseLanguage.structure.InstanceOfExpression" id="1190282857391">
                            <node role="classType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1190282861688">
                              <link role="classifier" targetNodeId="8.~SNode" resolveInfo="SNode" />
                            </node>
                            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ClosureParameterReference" id="1190282797660">
                              <link role="closureParameter" targetNodeId="1190204381022" resolveInfo="it" />
                            </node>
                          </node>
                          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1190282892320">
                            <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1190282892321">
                              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1190284519518">
                                <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1190284528709">
                                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_SetOperation" id="1190284529755">
                                    <node role="value" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1190284736972">
                                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.ClosureParameterReference" id="1190284736973">
                                        <link role="closureParameter" targetNodeId="1190204381022" />
                                      </node>
                                      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1190284738462">
                                        <link role="classifier" targetNodeId="3.~String" resolveInfo="String" />
                                      </node>
                                    </node>
                                  </node>
                                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1190284521390">
                                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1190284524671">
                                      <link role="property" targetNodeId="1.1190284493458" />
                                    </node>
                                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1190284519519">
                                      <link role="variableDeclaration" targetNodeId="1190204390860" resolveInfo="param" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node role="condition" type="jetbrains.mps.baseLanguage.structure.InstanceOfExpression" id="1190282897063">
                              <node role="classType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1190282901647">
                                <link role="classifier" targetNodeId="3.~String" resolveInfo="String" />
                              </node>
                              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ClosureParameterReference" id="1190284562867">
                                <link role="closureParameter" targetNodeId="1190204381022" resolveInfo="it" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1190204390870">
                          <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1190204390871">
                            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_SetOperation" id="1190204390872">
                              <node role="value" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1190204390873">
                                <link role="baseMethodDeclaration" targetNodeId="14.~IFeatureDesign.parameterToString(java.lang.Object):java.lang.String" resolveInfo="parameterToString" />
                                <node role="instance" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1190204390874">
                                  <link role="variableDeclaration" targetNodeId="1190198436911" resolveInfo="fd" />
                                </node>
                                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ClosureParameterReference" id="1190204390875">
                                  <link role="closureParameter" targetNodeId="1190204381022" resolveInfo="it" />
                                </node>
                              </node>
                            </node>
                            <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1190204390876">
                              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1190204390877">
                                <link role="property" targetNodeId="2.1169194664001" />
                              </node>
                              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1190204390878">
                                <link role="variableDeclaration" targetNodeId="1190204390860" resolveInfo="param" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1190205021761">
                          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1190205079543">
                            <link role="variableDeclaration" targetNodeId="1190204390860" resolveInfo="param" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ToListOperation" id="1190198436937" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1190198436938">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1190198436939" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1190198436940">
              <link role="variableDeclaration" targetNodeId="1190198436911" resolveInfo="fd" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1190198436941">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1190198436942" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1190198410605">
        <property name="name" value="feature" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1190198410606">
          <link role="concept" targetNodeId="1.1184659060758" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1190198416623">
        <property name="name" value="nodeType" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1190198418432">
          <link role="concept" targetNodeId="6.1068431790189" />
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration" id="1184840289279">
      <property name="name" value="getFeatureDesign" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1184840313445">
        <link role="classifier" targetNodeId="14.~IFeatureDesign" resolveInfo="IFeatureDesign" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1184840289281" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184840289282">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1184840344146">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1184840344147">
            <property name="name" value="treepathAspectName" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1184840344148">
              <link role="classifier" targetNodeId="3.~String" resolveInfo="String" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1184840344149">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1184840344150">
                <property name="value" value="_Design" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184840344151">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1184840344152">
                  <link role="property" targetNodeId="2.1169194664001" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184840344153">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1184840344154">
                    <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1184840344155">
                      <link role="concept" targetNodeId="1.1168879975004" />
                    </node>
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1184840344156">
                    <link role="variableDeclaration" targetNodeId="1184840326518" resolveInfo="feature" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1184840355220">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1184840355221">
            <property name="name" value="featureName" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1184840355222">
              <link role="classifier" targetNodeId="3.~String" resolveInfo="String" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1184840355223">
              <node role="rightExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184840355224">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1184840355225">
                  <link role="conceptMethodDeclaration" targetNodeId="1184069386479" resolveInfo="getFullName" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1184840355226">
                  <link role="concept" targetNodeId="1.1184066209434" />
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1184840355227">
                    <link role="variableDeclaration" targetNodeId="1184840326518" resolveInfo="feature" />
                  </node>
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1184840355228">
                <property name="value" value="Design_" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1184840364157">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1184840364158">
            <property name="name" value="fqClassName" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1184840364159">
              <link role="classifier" targetNodeId="3.~String" resolveInfo="String" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1184840364160">
              <link role="baseMethodDeclaration" targetNodeId="15.~JavaNameUtil.fqClassName(jetbrains.mps.smodel.SNode,java.lang.String):java.lang.String" resolveInfo="fqClassName" />
              <link role="classConcept" targetNodeId="15.~JavaNameUtil" resolveInfo="JavaNameUtil" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1184840364161">
                <link role="variableDeclaration" targetNodeId="1184840326518" resolveInfo="feature" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1184840364162">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1184840364163">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1184840364164">
                    <link role="variableDeclaration" targetNodeId="1184840355221" resolveInfo="featureName" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1184840364165">
                    <property name="value" value="$" />
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1184840364166">
                  <link role="variableDeclaration" targetNodeId="1184840344147" resolveInfo="treepathAspectName" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1193221836921">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1193221849347">
            <link role="baseMethodDeclaration" targetNodeId="18.~DesignPartLoader.getFeatureDesign(java.lang.String,jetbrains.mps.smodel.SModel):jetbrains.mps.ypath.design.IFeatureDesign" resolveInfo="getFeatureDesign" />
            <node role="instance" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1193221841234">
              <link role="baseMethodDeclaration" targetNodeId="18.~DesignPartLoader.getInstance():jetbrains.mps.ypath.plugin.DesignPartLoader" resolveInfo="getInstance" />
              <link role="classConcept" targetNodeId="18.~DesignPartLoader" resolveInfo="DesignPartLoader" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1193221853973">
              <link role="variableDeclaration" targetNodeId="1184840364158" resolveInfo="fqClassName" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1193312824455">
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetModelOperation" id="1193312831255" />
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1193312822800">
                <link role="variableDeclaration" targetNodeId="1184840326518" resolveInfo="feature" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1184840326518">
        <property name="name" value="feature" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1184840326519">
          <link role="concept" targetNodeId="1.1184659060758" />
        </node>
      </node>
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1184790036012" />
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1190199187576">
    <property name="package" value="treeOperation.traverse" />
    <link role="concept" targetNodeId="1.1184768155075" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1190199187577">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1190199187578" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1190800282750">
    <property name="package" value="treePath.features.functions" />
    <link role="concept" targetNodeId="1.1190800051916" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1190800284555">
      <property name="name" value="getExpectedReturnType" />
      <link role="overridenMethod" targetNodeId="10.1178571276073" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1190800284557">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1192556043328">
          <node role="expression" type="jetbrains.mps.bootstrap.helgins.structure.Quotation" id="1192556043329">
            <node role="quotedNode" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1192619817928">
              <link role="concept" targetNodeId="6.1068431790191" resolveInfo="Expression" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1190800291328">
        <link role="classifier" targetNodeId="8.~SNode" resolveInfo="SNode" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1190800282751">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1190800282752" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1191862683577">
    <property name="package" value="treePath.features" />
    <link role="concept" targetNodeId="1.1191843944385" resolveInfo="IGenericFeature" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1191862685760">
      <property name="isVirtual" value="true" />
      <property name="name" value="isSingleCardinality" />
      <property name="isAbstract" value="true" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1191862706624" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1191862685762" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1191937787574">
        <property name="name" value="param" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1193057654157">
          <link role="classifier" targetNodeId="3.~Object" resolveInfo="Object" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1191865774161">
      <property name="isVirtual" value="true" />
      <property name="isAbstract" value="true" />
      <property name="name" value="getterExpression" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1191865791023">
        <link role="concept" targetNodeId="6.1068431790191" resolveInfo="Expression" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1191865774163" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1191868312809">
        <property name="name" value="srcExpr" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1191868312810">
          <link role="concept" targetNodeId="6.1068431790191" resolveInfo="Expression" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1191868322066">
        <property name="name" value="param" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1192792314107">
          <link role="classifier" targetNodeId="3.~Object" resolveInfo="Object" />
        </node>
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1191862683578">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1191862683579" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1191867318697">
    <property name="package" value="treePath.features" />
    <link role="concept" targetNodeId="1.1190798501119" resolveInfo="GenericParamFeature" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1191937861487">
      <property name="name" value="isSingleCardinality" />
      <link role="overridenMethod" targetNodeId="1191862685760" resolveInfo="isSingleCardinality" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1191937861489">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1192792329679">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1193057824803">
            <link role="baseMethodDeclaration" targetNodeId="1193057674749" resolveInfo="isSingleTargetCardinality" />
            <link role="classConcept" targetNodeId="1184790036011" resolveInfo="FeatureTargetTypeUtil" />
            <node role="actualArgument" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1193057832432" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1193057835765">
              <link role="variableDeclaration" targetNodeId="1191937868532" resolveInfo="param" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1191937868532">
        <property name="name" value="param" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1193057661899">
          <link role="classifier" targetNodeId="3.~Object" resolveInfo="Object" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1191937868534" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1191868340719">
      <property name="name" value="getterExpression" />
      <link role="overridenMethod" targetNodeId="1191865774161" resolveInfo="getterExpression" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1191868340721">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1192792266676">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1192792276191">
            <link role="baseMethodDeclaration" targetNodeId="1192792093233" resolveInfo="getterExpression" />
            <link role="classConcept" targetNodeId="1184790036011" resolveInfo="FeatureTargetTypeUtil" />
            <node role="actualArgument" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1192806263012" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1192792278389">
              <link role="variableDeclaration" targetNodeId="1191868345486" resolveInfo="srcExpr" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1192792280238">
              <link role="variableDeclaration" targetNodeId="1191868345488" resolveInfo="param" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1191868345486">
        <property name="name" value="srcExpr" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1191868345487">
          <link role="concept" targetNodeId="6.1068431790191" resolveInfo="Expression" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1191868345488">
        <property name="name" value="param" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1192792324736">
          <link role="classifier" targetNodeId="3.~Object" resolveInfo="Object" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1191868345490">
        <link role="concept" targetNodeId="6.1068431790191" resolveInfo="Expression" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1191867318698">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1191867318699" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1193058010304">
    <property name="package" value="treePath.features.functions" />
    <link role="concept" targetNodeId="1.1193057943814" resolveInfo="GenericFeatureCardinalFun" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1193058012086">
      <property name="name" value="getExpectedReturnType" />
      <link role="overridenMethod" targetNodeId="10.1178571276073" resolveInfo="getExpectedReturnType" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1193058012088">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1193058018175">
          <node role="expression" type="jetbrains.mps.bootstrap.helgins.structure.Quotation" id="1193058028553">
            <node role="quotedNode" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1193058032833" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1193058015915">
        <link role="classifier" targetNodeId="8.~SNode" resolveInfo="SNode" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1193058010305">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1193058010306" />
    </node>
  </node>
</model>

