<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="jetbrains.mps.baseLanguage.classifiers.constraints">
  <persistence version="3" />
  <refactoringHistory />
  <language namespace="jetbrains.mps.bootstrap.constraintsLanguage">
    <languageAspect modelUID="jetbrains.mps.bootstrap.constraintsLanguage.constraints" version="9" />
    <languageAspect modelUID="jetbrains.mps.bootstrap.constraintsLanguage.structure" version="0" />
  </language>
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage">
    <languageAspect modelUID="jetbrains.mps.bootstrap.smodelLanguage.constraints" version="21" />
    <languageAspect modelUID="jetbrains.mps.bootstrap.smodelLanguage.structure" version="1" />
  </language>
  <language namespace="jetbrains.mps.baseLanguage">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.constraints" version="83" />
    <languageAspect modelUID="jetbrains.mps.baseLanguage.structure" version="0" />
  </language>
  <language namespace="jetbrains.mps.bootstrap.sharedConcepts">
    <languageAspect modelUID="jetbrains.mps.bootstrap.sharedConcepts.constraints" version="0" />
  </language>
  <language namespace="jetbrains.mps.bootstrap.helgins">
    <languageAspect modelUID="jetbrains.mps.bootstrap.helgins.constraints" version="17" />
  </language>
  <language namespace="jetbrains.mps.baseLanguage.ext.collections.lang">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.constraints" version="6" />
    <languageAspect modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.structure" version="1" />
  </language>
  <languageAspect modelUID="jetbrains.mps.closures.structure" version="0" />
  <languageAspect modelUID="jetbrains.mps.patterns.constraints" version="2" />
  <languageAspect modelUID="jetbrains.mps.bootstrap.structureLanguage.constraints" version="11" />
  <languageAspect modelUID="jetbrains.mps.baseLanguage.classifiers.constraints" version="7" />
  <languageAspect modelUID="jetbrains.mps.closures.constraints" version="2" />
  <languageAspect modelUID="jetbrains.mps.core.constraints" version="2" />
  <languageAspect modelUID="jetbrains.mps.internal.collections.constraints" version="2" />
  <maxImportIndex value="6" />
  <import index="1" modelUID="jetbrains.mps.baseLanguage.classifiers.structure" version="-1" />
  <import index="2" modelUID="jetbrains.mps.baseLanguage.structure" version="0" />
  <import index="3" modelUID="jetbrains.mps.smodel.search@java_stub" version="-1" />
  <visible index="2" modelUID="jetbrains.mps.baseLanguage.classifiers.behavior" />
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstraints" id="1213104844334">
    <link role="concept" targetNodeId="1.1205756064662" resolveInfo="IMemberOperation" />
    <node role="referent" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodeReferentConstraint" id="1213104844335">
      <link role="applicableLink" targetNodeId="1.1205756909548" />
      <node role="searchScopeFactory" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_ReferentSearchScope_Factory" id="1213104844336">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213104844337">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213104844338">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213104844339">
              <property name="name" value="operand" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213104844340">
                <link role="concept" targetNodeId="2.1068431790191" resolveInfo="Expression" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213104844341">
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213104844342">
                  <link role="link" targetNodeId="2.1197027771414" />
                </node>
                <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1213104844343">
                  <link role="concept" targetNodeId="2.1197027756228" resolveInfo="DotExpression" />
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptParameter_ReferentSearchScope_enclosingNode" id="1213104844344" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213104844345">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213104844346">
              <property name="name" value="applicableMembers" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1213104844347">
                <link role="elementConcept" targetNodeId="1.1205752032448" resolveInfo="IMember" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1213104844348">
                <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListCreator" id="1213104844349">
                  <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1213104844350">
                    <link role="elementConcept" targetNodeId="1.1205752032448" resolveInfo="IMember" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.bootstrap.helgins.structure.CoerceStatement" id="1213104844351">
            <node role="pattern" type="jetbrains.mps.bootstrap.helgins.structure.ConceptReference" id="1213104844352">
              <property name="name" value="nodeType" />
              <link role="concept" targetNodeId="1.1205752813637" resolveInfo="BaseClassifierType" />
            </node>
            <node role="nodeToCoerce" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213104844353">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213104844354">
                <link role="variableDeclaration" targetNodeId="1213104844339" resolveInfo="operand" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.helgins.structure.Node_TypeOperation" id="1213104844355" />
            </node>
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213104844356">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1213104844357">
                <node role="iterable" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213104844358">
                  <node role="operand" type="jetbrains.mps.bootstrap.helgins.structure.ApplicableNodeReference" id="1213104844359">
                    <link role="applicableNode" targetNodeId="1213104844352" resolveInfo="nodeType" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213104844360">
                    <link role="conceptMethodDeclaration" targetNodeId="2v.1213877402148" resolveInfo="getMembers" />
                    <node role="actualArgument" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptParameter_ReferentSearchScope_enclosingNode" id="1213104844361" />
                  </node>
                </node>
                <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213104844362">
                  <property name="name" value="member" />
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213104844363">
                    <link role="concept" targetNodeId="1.1205752032448" resolveInfo="IMember" />
                  </node>
                </node>
                <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213104844364">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213104844365">
                    <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213104844366">
                      <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213104844367">
                        <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213104844368">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213104844369">
                            <link role="variableDeclaration" targetNodeId="1213104844346" resolveInfo="applicableMembers" />
                          </node>
                          <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddElementOperation" id="1213104844370">
                            <node role="argument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213104844371">
                              <link role="variableDeclaration" targetNodeId="1213104844362" resolveInfo="member" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213104844372">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213104844373">
                        <link role="variableDeclaration" targetNodeId="1213104844362" resolveInfo="member" />
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1213104844374">
                        <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.PoundExpression" id="1217631634927">
                          <node role="expression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunctionParameter_linkTarget" id="1213104844376" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213104844377">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1217888398944">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1217888398946">
                <link role="baseMethodDeclaration" targetNodeId="3.~SimpleSearchScope.&lt;init&gt;(java.util.List)" resolveInfo="SimpleSearchScope" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213104844379">
                  <link role="variableDeclaration" targetNodeId="1213104844346" resolveInfo="applicableMembers" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstraints" id="1213107438049">
    <link role="concept" targetNodeId="1.1205752633985" resolveInfo="ThisClassifierExpresson" />
    <node role="referent" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodeReferentConstraint" id="1218737390835">
      <link role="applicableLink" targetNodeId="1.1218736638915" />
      <node role="searchScopeFactory" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_ReferentSearchScope_Factory" id="1218737393727">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1218737393728">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1218737395370">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1218737415186">
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1218737435551">
                <link role="conceptMethodDeclaration" targetNodeId="2v.1219068414643" resolveInfo="getPossibleClassifiers" />
              </node>
              <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1218737853465">
                <link role="concept" targetNodeId="1.1205752633985" resolveInfo="ThisClassifierExpresson" />
                <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptParameter_ReferentSearchScope_enclosingNode" id="1218737806139" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="canBeChild" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_CanBeAChild" id="1213107438050">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213107438051">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213107438052">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1213107438053">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1213107438054" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213107438055">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunctionParameter_parentNode" id="1213107438056" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1213107438057">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_ConceptList" id="1213107438058">
                  <node role="concept" type="jetbrains.mps.bootstrap.smodelLanguage.structure.ConceptReference" id="1213107438059">
                    <link role="concept" targetNodeId="1.1205751982837" resolveInfo="IClassifier" />
                  </node>
                  <node role="concept" type="jetbrains.mps.bootstrap.smodelLanguage.structure.ConceptReference" id="1213107438060">
                    <link role="concept" targetNodeId="1.1205752174734" resolveInfo="IClassifierPart" />
                  </node>
                </node>
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Inclusion" id="1213107438061" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstraints" id="1216915253694">
    <property name="package" value="Types" />
    <link role="concept" targetNodeId="1.1205752906494" resolveInfo="DefaultClassifierType" />
    <node role="referent" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodeReferentConstraint" id="1216915256179">
      <link role="applicableLink" targetNodeId="1.1205752917136" />
      <node role="searchScopeFactory" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_ReferentSearchScope_Factory" id="1216915259774">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1216915259775">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1216915305632">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1216915305633">
              <property name="name" value="classifiers" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1216915305634">
                <link role="elementConcept" targetNodeId="1.1205751982837" resolveInfo="IClassifier" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216915305635">
                <node role="operand" type="jetbrains.mps.bootstrap.sharedConcepts.structure.ConceptFunctionParameter_model" id="1216915305636" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Model_RootsIncludingImportedOperation" id="1216915305637">
                  <link role="concept" targetNodeId="1.1205751982837" resolveInfo="IClassifier" />
                  <node role="scope" type="jetbrains.mps.bootstrap.sharedConcepts.structure.ConceptFunctionParameter_scope" id="1216915305638" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1216915319724">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1216915321007">
              <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216916038506">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216915323574">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1216915322791">
                    <link role="variableDeclaration" targetNodeId="1216915305633" resolveInfo="classifiers" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.WhereOperation" id="1216915329999">
                    <node role="whereClosure" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.WhereBlock" id="1216915330000">
                      <node role="defaultInputElement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.DefaultInputElement" id="1216915330001">
                        <property name="name" value="it" />
                      </node>
                      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1216915330002">
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1216915333708">
                          <node role="expression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1216915883731">
                            <node role="rightExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.ConceptRefExpression" id="1216915892314">
                              <link role="conceptDeclaration" targetNodeId="1.1205752906494" resolveInfo="DefaultClassifierType" />
                            </node>
                            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216915876596">
                              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216915334529">
                                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ClosureParameterReference" id="1216915333709">
                                  <link role="closureParameter" targetNodeId="1216915330001" resolveInfo="it" />
                                </node>
                                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1216915335956">
                                  <link role="conceptMethodDeclaration" targetNodeId="2v.1213877527970" resolveInfo="createType" />
                                </node>
                              </node>
                              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetConceptOperation" id="1216915878866" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ToListOperation" id="1216916041745" />
              </node>
              <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1216915319725">
                <link role="variableDeclaration" targetNodeId="1216915305633" resolveInfo="classifiers" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1216915363805">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1216915366434">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1216915374051">
                <link role="baseMethodDeclaration" targetNodeId="3.~SimpleSearchScope.&lt;init&gt;(java.util.List)" resolveInfo="SimpleSearchScope" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1216915375476">
                  <link role="variableDeclaration" targetNodeId="1216915305633" resolveInfo="classifiers" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstraints" id="1217433542422">
    <link role="concept" targetNodeId="1.1217433449852" resolveInfo="SuperClassifierExpresson" />
    <node role="canBeChild" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_CanBeAChild" id="1217433547506">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1217433547507">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1217434129978">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1217434129979">
            <property name="name" value="inClassifier" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1217434129980" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1217434129981">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1217434129982" />
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1217434129983">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunctionParameter_parentNode" id="1217434129984" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1217434129985">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_ConceptList" id="1217434129986">
                    <node role="concept" type="jetbrains.mps.bootstrap.smodelLanguage.structure.ConceptReference" id="1217434129987">
                      <link role="concept" targetNodeId="1.1205751982837" resolveInfo="IClassifier" />
                    </node>
                    <node role="concept" type="jetbrains.mps.bootstrap.smodelLanguage.structure.ConceptReference" id="1217434129988">
                      <link role="concept" targetNodeId="1.1205752174734" resolveInfo="IClassifierPart" />
                    </node>
                  </node>
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Inclusion" id="1217434129989" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1217434225796">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1217434225797">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1217434234154">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1217434235736">
                <property name="value" value="false" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1217434230586">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1217434232199">
              <link role="variableDeclaration" targetNodeId="1217434129979" resolveInfo="inClassifier" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1217434214154">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1217434214155">
            <property name="name" value="classifier" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1217434214156">
              <link role="concept" targetNodeId="1.1205751982837" resolveInfo="IClassifier" />
            </node>
            <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.structure.StaticConceptMethodCall" id="1217434214157">
              <link role="concept" targetNodeId="1.1205751982837" resolveInfo="IClassifier" />
              <link role="baseMethodDeclaration" targetNodeId="2v.1213877527940" resolveInfo="getContextClassifier" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunctionParameter_parentNode" id="1217434214158" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1217434240304">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1217434240305">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1217434247257">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1217434248604">
                <property name="value" value="false" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1217434244829">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1217434245629" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1217434243639">
              <link role="variableDeclaration" targetNodeId="1217434214155" resolveInfo="classifier" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1217434133698">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1217434133699">
            <property name="name" value="hasSuper" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1217434133700" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1217434272849">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1217434276840" />
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1217434255549">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1217434214159">
                  <link role="variableDeclaration" targetNodeId="1217434214155" resolveInfo="classifier" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1217434270268">
                  <link role="conceptMethodDeclaration" targetNodeId="2v.1217433657148" resolveInfo="createSuperType" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1217434280830">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1217434280831">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1217434290470">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1217434291833">
                <property name="value" value="false" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1217434285807">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1217434288296">
              <link role="variableDeclaration" targetNodeId="1217434133699" resolveInfo="hasSuper" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1217433547508">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1217434295761">
            <property name="value" value="true" />
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

