<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.baseLanguage.constraints">
  <persistence version="1" />
  <refactoringHistory />
  <language namespace="jetbrains.mps.bootstrap.constraintsLanguage">
    <languageAspect modelUID="jetbrains.mps.bootstrap.constraintsLanguage.structure" version="1" />
  </language>
  <language namespace="jetbrains.mps.baseLanguage">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.structure" version="0" />
  </language>
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage">
    <languageAspect modelUID="jetbrains.mps.bootstrap.smodelLanguage.structure" version="0" />
  </language>
  <language namespace="jetbrains.mps.bootstrap.sharedConcepts" />
  <language namespace="jetbrains.mps.baseLanguage.ext.collections.lang">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.structure" version="1" />
  </language>
  <language namespace="jetbrains.mps.bootstrap.helgins" />
  <language namespace="jetbrains.mps.quotation" />
  <languageAspect modelUID="jetbrains.mps.closures.structure" version="0" />
  <languageAspect modelUID="jetbrains.mps.closures.structure" version="0" />
  <languageAspect modelUID="jetbrains.mps.closures.structure" version="0" />
  <languageAspect modelUID="jetbrains.mps.closures.structure" version="0" />
  <languageAspect modelUID="jetbrains.mps.closures.structure" version="0" />
  <languageAspect modelUID="jetbrains.mps.closures.structure" version="0" />
  <languageAspect modelUID="jetbrains.mps.closures.structure" version="0" />
  <languageAspect modelUID="jetbrains.mps.closures.structure" version="0" />
  <languageAspect modelUID="jetbrains.mps.closures.structure" version="0" />
  <languageAspect modelUID="jetbrains.mps.closures.structure" version="0" />
  <languageAspect modelUID="jetbrains.mps.closures.structure" version="0" />
  <languageAspect modelUID="jetbrains.mps.closures.structure" version="0" />
  <languageAspect modelUID="jetbrains.mps.closures.structure" version="0" />
  <languageAspect modelUID="jetbrains.mps.closures.structure" version="0" />
  <languageAspect modelUID="jetbrains.mps.closures.structure" version="0" />
  <languageAspect modelUID="jetbrains.mps.closures.structure" version="0" />
  <maxImportIndex value="48" />
  <import index="1" modelUID="jetbrains.mps.baseLanguage.structure" version="0" />
  <import index="2" modelUID="jetbrains.mps.core.structure" version="-1" />
  <import index="3" modelUID="jetbrains.mps.util@java_stub" version="-1" />
  <import index="5" modelUID="jetbrains.mps.smodel.search@java_stub" version="-1" />
  <import index="6" modelUID="java.util@java_stub" version="-1" />
  <import index="7" modelUID="jetbrains.mps.smodel@java_stub" version="-1" />
  <import index="10" modelUID="jetbrains.mps.baseLanguage.search@java_stub" version="-1" />
  <import index="11" modelUID="jetbrains.mps.smodel.presentation@java_stub" version="-1" />
  <import index="13" modelUID="java.lang@java_stub" version="-1" />
  <import index="26" modelUID="jetbrains.mps.nodeEditor@java_stub" version="-1" />
  <import index="27" modelUID="javax.swing@java_stub" version="-1" />
  <import index="28" modelUID="java.lang.reflect@java_stub" version="-1" />
  <import index="30" modelUID="jetbrains.mps.reloading@java_stub" version="-1" />
  <import index="32" modelUID="jetbrains.mps.baseLanguage.constraints@java_stub" version="-1" />
  <import index="35" modelUID="jetbrains.mps.project@java_stub" version="-1" />
  <import index="36" modelUID="jetbrains.mps.core.constraints" version="-1" />
  <import index="37" modelUID="jetbrains.mps.bootstrap.structureLanguage.structure" version="-1" />
  <import index="43" modelUID="jetbrains.mps.dataFlow@java_stub" version="-1" />
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1156246260769">
    <property name="name" value="QueriesUtil" />
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration" id="1156246279317">
      <property name="name" value="getDesciptionText" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1156246297805">
        <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1156246279319">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1156246335497">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1156246335498">
            <property name="name" value="where" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1156246335499">
              <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1170384168797">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1170384168798">
            <property name="name" value="parent" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1170384168800">
              <link role="concept" targetNodeId="1.1107461130800" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977964034">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1170384100699">
                <link role="variableDeclaration" targetNodeId="1156246316635" resolveInfo="node" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1171505136176">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1170384156265">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1207781905999">
                    <link role="conceptDeclaration" targetNodeId="1.1107461130800" resolveInfo="Classifier" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1156246552041">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1156246558592">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1156246560673" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1170384183567">
              <link role="variableDeclaration" targetNodeId="1170384168798" resolveInfo="parent" />
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1156246552043">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1156246566971">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1156246568067">
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1156246566972">
                  <link role="variableDeclaration" targetNodeId="1156246335498" resolveInfo="where" />
                </node>
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1156246571006">
                  <property name="value" value="?declaring classifier?" />
                </node>
              </node>
            </node>
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1156247041484">
            <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1156247041485">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1156247050767">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1156247052957">
                  <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1156247050768">
                    <link role="variableDeclaration" targetNodeId="1156246335498" resolveInfo="where" />
                  </node>
                  <node role="rValue" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1156247057912">
                    <link role="classConcept" targetNodeId="3.~NameUtil" resolveInfo="NameUtil" />
                    <link role="baseMethodDeclaration" targetNodeId="3.~NameUtil.compactNodeFQName(jetbrains.mps.smodel.SNode):java.lang.String" resolveInfo="compactNodeFQName" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1170384186287">
                      <link role="variableDeclaration" targetNodeId="1170384168798" resolveInfo="parent" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1156247070377">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1156247090179">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1156247107152">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1156247114016">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1156247116207">
                  <property name="value" value=")" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1156247111187">
                  <link role="variableDeclaration" targetNodeId="1156246335498" resolveInfo="where" />
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1156247100792">
                <property name="value" value=" (" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1156247082005">
              <link role="baseMethodDeclaration" targetNodeId="11.~NodePresentationUtil.getRoleInParentOrConceptName(jetbrains.mps.smodel.SNode):java.lang.String" resolveInfo="getRoleInParentOrConceptName" />
              <link role="classConcept" targetNodeId="11.~NodePresentationUtil" resolveInfo="NodePresentationUtil" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1156247085631">
                <link role="variableDeclaration" targetNodeId="1156246316635" resolveInfo="node" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1156246316635">
        <property name="name" value="node" />
        <property name="isFinal" value="false" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1170384086315" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1178546097058" />
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration" id="1171331618660">
      <property name="name" value="getMatchingText_BaseMethodDeclaration" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1171331618661">
        <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1171331618662">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1171331618663">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1171331618664">
            <property name="name" value="sb" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1181219222621">
              <link role="classifier" targetNodeId="13.~StringBuilder" resolveInfo="StringBuilder" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1171331618666">
              <link role="baseMethodDeclaration" targetNodeId="13.~StringBuilder.&lt;init&gt;(java.lang.String)" resolveInfo="StringBuilder" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1189011920921">
                <link role="baseMethodDeclaration" targetNodeId="13.~String.valueOf(java.lang.Object):java.lang.String" resolveInfo="valueOf" />
                <link role="classConcept" targetNodeId="13.~String" resolveInfo="String" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977956102">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1189011927565">
                    <link role="variableDeclaration" targetNodeId="1171331618747" resolveInfo="method" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1189011927564">
                    <link role="property" targetNodeId="1.1083152972672" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1181219147167">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalStaticMethodCall" id="1181219147168">
            <link role="baseMethodDeclaration" targetNodeId="1181218974303" resolveInfo="appendParameterTypes_BaseMethodDeclaration" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1181219152723">
              <link role="variableDeclaration" targetNodeId="1171331618747" resolveInfo="method" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1181219157063">
              <link role="variableDeclaration" targetNodeId="1171331618664" resolveInfo="sb" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1171331618741">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332445487">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1171331618744">
              <link role="variableDeclaration" targetNodeId="1171331618664" resolveInfo="sb" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332445488">
              <link role="baseMethodDeclaration" targetNodeId="13.~StringBuilder.toString():java.lang.String" resolveInfo="toString" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1171331618747">
        <property name="name" value="method" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1171331654624">
          <link role="concept" targetNodeId="1.1068580123132" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1178546096914" />
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration" id="1181218974303">
      <property name="name" value="appendParameterTypes_BaseMethodDeclaration" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1181218974304" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1181218974305" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1181218974306">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1181219051523">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332445069">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1181219056633">
              <link role="variableDeclaration" targetNodeId="1181219012252" resolveInfo="sb" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332445070">
              <link role="baseMethodDeclaration" targetNodeId="13.~Appendable.append(java.lang.CharSequence):java.lang.Appendable" resolveInfo="append" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1181219051526">
                <property name="value" value="(" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1181219051527">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1181219051528">
            <property name="name" value="parms" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1181219051529">
              <link role="elementConcept" targetNodeId="1.1068498886292" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977954293">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1181219051532">
                <link role="variableDeclaration" targetNodeId="1181219003811" resolveInfo="method" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1206572417765">
                <link role="link" targetNodeId="1.1068580123134" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1181219051533">
          <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1181219051534">
            <property name="name" value="parm" />
          </node>
          <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1181219051535">
            <link role="variableDeclaration" targetNodeId="1181219051528" resolveInfo="parms" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1181219051536">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1181219051537">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332446196">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1181219075307">
                  <link role="variableDeclaration" targetNodeId="1181219012252" resolveInfo="sb" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332446197">
                  <link role="baseMethodDeclaration" targetNodeId="13.~Appendable.append(java.lang.CharSequence):java.lang.Appendable" resolveInfo="append" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalStaticMethodCall" id="1181219051540">
                    <link role="baseMethodDeclaration" targetNodeId="1171330436701" resolveInfo="getMatchingText_Type" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977954320">
                      <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1181219051543">
                        <link role="variable" targetNodeId="1181219051534" resolveInfo="parm" />
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1181219051542">
                        <link role="link" targetNodeId="1.1068431790188" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1181219051544">
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1181219051545">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206572405522">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1181219051548">
                    <link role="variableDeclaration" targetNodeId="1181219051528" resolveInfo="parms" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetLastOperation" id="1181219051547" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1181219051549">
                  <link role="variable" targetNodeId="1181219051534" resolveInfo="parm" />
                </node>
              </node>
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1181219051550">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1181219051551">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332454825">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1181219082877">
                      <link role="variableDeclaration" targetNodeId="1181219012252" resolveInfo="sb" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332454826">
                      <link role="baseMethodDeclaration" targetNodeId="13.~Appendable.append(java.lang.CharSequence):java.lang.Appendable" resolveInfo="append" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1181219051554">
                        <property name="value" value="," />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1181219051555">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332446170">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1181219090383">
              <link role="variableDeclaration" targetNodeId="1181219012252" resolveInfo="sb" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332446171">
              <link role="baseMethodDeclaration" targetNodeId="13.~Appendable.append(java.lang.CharSequence):java.lang.Appendable" resolveInfo="append" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1181219051558">
                <property name="value" value=")" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1181219051559">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1181219051560">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977965805">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1181219051564">
                <link role="variableDeclaration" targetNodeId="1181219003811" resolveInfo="method" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1181219051562">
                <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1181219051563">
                  <link role="conceptDeclaration" targetNodeId="1.1068580123140" />
                </node>
              </node>
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1181219051565">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1181219051566">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332445790">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1181219096788">
                  <link role="variableDeclaration" targetNodeId="1181219012252" resolveInfo="sb" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332445791">
                  <link role="baseMethodDeclaration" targetNodeId="13.~Appendable.append(java.lang.CharSequence):java.lang.Appendable" resolveInfo="append" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1181219051569">
                    <property name="value" value=":" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1181219051570">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1181219051571">
                <property name="name" value="returnType" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1181219051572">
                  <link role="concept" targetNodeId="1.1068431790189" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977956623">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1181219051575">
                    <link role="variableDeclaration" targetNodeId="1181219003811" resolveInfo="method" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1181219051574">
                    <link role="link" targetNodeId="1.1068580123133" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1181219051576">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332444651">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1181219098121">
                  <link role="variableDeclaration" targetNodeId="1181219012252" resolveInfo="sb" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332444652">
                  <link role="baseMethodDeclaration" targetNodeId="13.~Appendable.append(java.lang.CharSequence):java.lang.Appendable" resolveInfo="append" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalStaticMethodCall" id="1181219051579">
                    <link role="baseMethodDeclaration" targetNodeId="1171330436701" resolveInfo="getMatchingText_Type" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1181219051580">
                      <link role="variableDeclaration" targetNodeId="1181219051571" resolveInfo="returnType" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1181219003811">
        <property name="name" value="method" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1181219003812">
          <link role="concept" targetNodeId="1.1068580123132" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1181219012252">
        <property name="name" value="sb" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1181219216554">
          <link role="classifier" targetNodeId="13.~StringBuilder" resolveInfo="StringBuilder" />
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration" id="1171330436701">
      <property name="name" value="getMatchingText_Type" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1171330436702">
        <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1171330436703">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1171330436704">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1171330436705">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1171330436706" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1171330436707">
              <link role="variableDeclaration" targetNodeId="1171330436779" resolveInfo="type" />
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1171330436708">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1171330436709">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1171330436710">
                <property name="value" value="?no type?" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1171330436711">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1171330436715">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1171330509373">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1171330509374">
                <property name="name" value="classifierType" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1171330509375">
                  <link role="concept" targetNodeId="1.1107535904670" />
                </node>
                <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1171330528769">
                  <link role="concept" targetNodeId="1.1107535904670" />
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1171330527565">
                    <link role="variableDeclaration" targetNodeId="1171330436779" resolveInfo="type" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1171330436722">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1171330436723">
                <property name="name" value="parmsSB" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1171330436724">
                  <link role="classifier" targetNodeId="13.~StringBuffer" resolveInfo="StringBuffer" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1171330436725">
                  <link role="baseMethodDeclaration" targetNodeId="13.~StringBuffer.&lt;init&gt;()" resolveInfo="StringBuffer" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1171330436726">
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.GreaterThanExpression" id="1171330436727">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1171330436728">
                  <property name="value" value="0" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977967405">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977967147">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1171330562208">
                      <link role="variableDeclaration" targetNodeId="1171330509374" resolveInfo="classifierType" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1171330581931">
                      <link role="link" targetNodeId="1.1109201940907" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_GetCountOperation" id="1171330584435" />
                </node>
              </node>
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1171330436731">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1171331106613">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332444255">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1171331108367">
                      <link role="variableDeclaration" targetNodeId="1171330436723" resolveInfo="parmsSB" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332444256">
                      <link role="baseMethodDeclaration" targetNodeId="13.~StringBuffer.append(java.lang.Object):java.lang.StringBuffer" resolveInfo="append" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1171331106616">
                        <property name="value" value="&lt;" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1171331336988">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1171331336989">
                    <property name="name" value="typeParameters" />
                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1171331336991">
                      <link role="elementConcept" targetNodeId="1.1068431790189" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977954634">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1171330644227">
                        <link role="variableDeclaration" targetNodeId="1171330509374" resolveInfo="classifierType" />
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1206572417748">
                        <link role="link" targetNodeId="1.1109201940907" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1171330632192">
                  <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1171330632193">
                    <property name="name" value="parm" />
                  </node>
                  <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1171331336992">
                    <link role="variableDeclaration" targetNodeId="1171331336989" resolveInfo="typeParameters" />
                  </node>
                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1171330632195">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1172061283692">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332444604">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1172061283693">
                          <link role="variableDeclaration" targetNodeId="1171330436723" resolveInfo="parmsSB" />
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332444605">
                          <link role="baseMethodDeclaration" targetNodeId="13.~StringBuffer.append(java.lang.CharSequence):java.lang.StringBuffer" resolveInfo="append" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalStaticMethodCall" id="1172061310197">
                            <link role="baseMethodDeclaration" targetNodeId="1171330436701" resolveInfo="getMatchingText_Type" />
                            <node role="actualArgument" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1172061313823">
                              <link role="variable" targetNodeId="1171330632193" resolveInfo="parm" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1171331007481">
                      <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1171331016817">
                        <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206572405461">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1171331353508">
                            <link role="variableDeclaration" targetNodeId="1171331336989" resolveInfo="typeParameters" />
                          </node>
                          <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetLastOperation" id="1171331357637" />
                        </node>
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1171331010125">
                          <link role="variable" targetNodeId="1171330632193" resolveInfo="parm" />
                        </node>
                      </node>
                      <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1171331007483">
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1171331031696">
                          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332468395">
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1171331033810">
                              <link role="variableDeclaration" targetNodeId="1171330436723" resolveInfo="parmsSB" />
                            </node>
                            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332468396">
                              <link role="baseMethodDeclaration" targetNodeId="13.~StringBuffer.append(java.lang.String):java.lang.StringBuffer" resolveInfo="append" />
                              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1171331031699">
                                <property name="value" value="," />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1171330436765">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332422356">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1171330436767">
                      <link role="variableDeclaration" targetNodeId="1171330436723" resolveInfo="parmsSB" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332422357">
                      <link role="baseMethodDeclaration" targetNodeId="13.~StringBuffer.append(java.lang.Object):java.lang.StringBuffer" resolveInfo="append" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1171330436768">
                        <property name="value" value="&gt;" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1181220452958">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1181220452959">
                <property name="name" value="typeName" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1181220452960">
                  <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977954421">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1171330436775">
                    <link role="variableDeclaration" targetNodeId="1171330436779" resolveInfo="type" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1171331147793">
                    <link role="property" targetNodeId="2.1169194664001" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1181220485421">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1181220485422">
                <property name="name" value="indexOfLT" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1181220485423" />
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1201710885216">
                  <property name="value" value="-1" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1201710886469">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201710886470">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1201710896916">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1201710897656">
                    <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332444393">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201710899960">
                        <link role="variableDeclaration" targetNodeId="1181220452959" resolveInfo="typeName" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332444394">
                        <link role="baseMethodDeclaration" targetNodeId="13.~String.indexOf(java.lang.String):int" resolveInfo="indexOf" />
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1201710904425">
                          <property name="value" value="&lt;" />
                        </node>
                      </node>
                    </node>
                    <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201710896917">
                      <link role="variableDeclaration" targetNodeId="1181220485422" resolveInfo="indexOfLT" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1201710891232">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1201710892582" />
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201710890617">
                  <link role="variableDeclaration" targetNodeId="1181220452959" resolveInfo="typeName" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1181220458906">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1181220458907">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1181220496748">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1181220498361">
                    <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332446024">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1181220500539">
                        <link role="variableDeclaration" targetNodeId="1181220452959" resolveInfo="typeName" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332446025">
                        <link role="baseMethodDeclaration" targetNodeId="13.~String.substring(int,int):java.lang.String" resolveInfo="substring" />
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1181220505775">
                          <property name="value" value="0" />
                        </node>
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1181220518458">
                          <link role="variableDeclaration" targetNodeId="1181220485422" resolveInfo="indexOfLT" />
                        </node>
                      </node>
                    </node>
                    <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1181220496749">
                      <link role="variableDeclaration" targetNodeId="1181220452959" resolveInfo="typeName" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.GreaterThanOrEqualsExpression" id="1181220473898">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1181220475933">
                  <property name="value" value="0" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1181220485424">
                  <link role="variableDeclaration" targetNodeId="1181220485422" resolveInfo="indexOfLT" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1171330436769">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1171330436770">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332445835">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1171330436772">
                    <link role="variableDeclaration" targetNodeId="1171330436723" resolveInfo="parmsSB" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332445836">
                    <link role="baseMethodDeclaration" targetNodeId="13.~StringBuffer.toString():java.lang.String" resolveInfo="toString" />
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1171330436773">
                  <link role="classConcept" targetNodeId="3.~NameUtil" resolveInfo="NameUtil" />
                  <link role="baseMethodDeclaration" targetNodeId="3.~NameUtil.shortNameFromLongName(java.lang.String):java.lang.String" resolveInfo="shortNameFromLongName" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1181220452961">
                    <link role="variableDeclaration" targetNodeId="1181220452959" resolveInfo="typeName" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977962989">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1171330481287">
              <link role="variableDeclaration" targetNodeId="1171330436779" resolveInfo="type" />
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1171330486947">
              <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1177556242899">
                <link role="conceptDeclaration" targetNodeId="1.1107535904670" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1171330436776">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977967303">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1171330436778">
              <link role="variableDeclaration" targetNodeId="1171330436779" resolveInfo="type" />
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1171331166578">
              <link role="property" targetNodeId="2.1169194664001" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1171330436779">
        <property name="name" value="type" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1171330462927">
          <link role="concept" targetNodeId="1.1068431790189" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1178546097237" />
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1178549561824" />
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1178180387775">
    <property name="package" value="type" />
    <link role="concept" targetNodeId="1.1107535904670" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1199305285589">
      <property name="name" value="getPresentation" />
      <link role="overriddenMethod" targetNodeId="36.1180102203531" resolveInfo="getPresentation" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1199305285591">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1199305344022">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1199305344023">
            <property name="name" value="classifier" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1199305344024">
              <link role="concept" targetNodeId="1.1107461130800" resolveInfo="Classifier" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977955071">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1199305344026" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1199305344027">
                <link role="link" targetNodeId="1.1107535924139" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1199305344028">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1199305344029">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1199305344030">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1199305344031">
                <property name="value" value="?no classifier?" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1199305344032">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1199305344033" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1199305344034">
              <link role="variableDeclaration" targetNodeId="1199305344023" resolveInfo="classifier" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1199305344035">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1199305344036">
            <property name="name" value="result" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1199305344037">
              <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977963279">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1199316438622">
                <link role="variableDeclaration" targetNodeId="1199305344023" resolveInfo="classifier" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1199316445578">
                <link role="property" targetNodeId="2.1169194664001" resolveInfo="name" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1199305344040">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1199305344041">
            <property name="name" value="parms" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1199305344042">
              <link role="elementConcept" targetNodeId="1.1068431790189" resolveInfo="Type" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977965647">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1199305344044" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1206572417743">
                <link role="link" targetNodeId="1.1109201940907" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1199305344046">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1199305344047">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1199305344048">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1199305344049">
                <property name="name" value="parmsText" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1199305344050">
                  <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1199305344051" />
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1199305344052">
              <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1199305344053">
                <property name="name" value="parm" />
              </node>
              <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1199305344054">
                <link role="variableDeclaration" targetNodeId="1199305344041" resolveInfo="parms" />
              </node>
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1199305344055">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1199305344056">
                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.GreaterThanExpression" id="1199305344057">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1199305344058">
                      <property name="value" value="0" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332468275">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1199305344060">
                        <link role="variableDeclaration" targetNodeId="1199305344049" resolveInfo="parmsText" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332468276">
                        <link role="baseMethodDeclaration" targetNodeId="13.~String.length():int" resolveInfo="length" />
                      </node>
                    </node>
                  </node>
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1199305344061">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1199305344062">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1199305344063">
                        <node role="rValue" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1199305344064">
                          <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1199305344065">
                            <property name="value" value="," />
                          </node>
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1199305344066">
                            <link role="variableDeclaration" targetNodeId="1199305344049" resolveInfo="parmsText" />
                          </node>
                        </node>
                        <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1199305344067">
                          <link role="variableDeclaration" targetNodeId="1199305344049" resolveInfo="parmsText" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1199305344068">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1199305344069">
                    <node role="rValue" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1199305344070">
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977965022">
                        <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1199306447505">
                          <link role="variable" targetNodeId="1199305344053" resolveInfo="parm" />
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1199306452275">
                          <link role="conceptMethodDeclaration" targetNodeId="36.1180102203531" resolveInfo="getPresentation" />
                        </node>
                      </node>
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1199305344074">
                        <link role="variableDeclaration" targetNodeId="1199305344049" resolveInfo="parmsText" />
                      </node>
                    </node>
                    <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1199305344075">
                      <link role="variableDeclaration" targetNodeId="1199305344049" resolveInfo="parmsText" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1199305344076">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1199305344077">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1199305344078">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1199305344079">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1199305344080">
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1199305344081">
                        <property name="value" value="&gt;" />
                      </node>
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1199305344082">
                        <link role="variableDeclaration" targetNodeId="1199305344049" resolveInfo="parmsText" />
                      </node>
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1199305344083">
                      <property name="value" value="&lt;" />
                    </node>
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1199305344084">
                    <link role="variableDeclaration" targetNodeId="1199305344036" resolveInfo="result" />
                  </node>
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1199305344085">
                  <link role="variableDeclaration" targetNodeId="1199305344036" resolveInfo="result" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206572405301">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1199305344087">
              <link role="variableDeclaration" targetNodeId="1199305344041" resolveInfo="parms" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.IsNotEmptyOperation" id="1199305344088" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1199305344089">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1199305344090">
            <link role="variableDeclaration" targetNodeId="1199305344036" resolveInfo="result" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1199316421837">
        <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1199318903017">
      <property name="name" value="getErasureSignature" />
      <link role="overriddenMethod" targetNodeId="1199318924019" resolveInfo="getErasureSignature" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1199318903019">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1199319981296">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1199319981297">
            <property name="name" value="classifier" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1199319981298">
              <link role="concept" targetNodeId="1.1107461130800" resolveInfo="Classifier" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977951982">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1199319981300" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1199319981301">
                <link role="link" targetNodeId="1.1107535924139" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1199319981302">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1199319981303">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1199319981304">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1199319981305">
                <property name="value" value="?no classifier?" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1199319981306">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1199319981307" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1199319981308">
              <link role="variableDeclaration" targetNodeId="1199319981297" resolveInfo="classifier" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1199318979827">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977956394">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1199320010809">
              <link role="variableDeclaration" targetNodeId="1199319981297" resolveInfo="classifier" />
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1199319070249">
              <link role="conceptMethodDeclaration" targetNodeId="36.1184686272576" resolveInfo="getFqName" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1199318907270">
        <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1182417235045">
      <property name="name" value="getVariableSuffixes" />
      <link role="overriddenMethod" targetNodeId="1182416669983" resolveInfo="getVariableSuffixes" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1182417235047">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1182417317062">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1182417317063">
            <property name="name" value="classifierName" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977954787">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977954527">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1182417360742" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1182417363657">
                  <link role="link" targetNodeId="1.1107535924139" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1182417317066">
                <link role="property" targetNodeId="2.1169194664001" />
              </node>
            </node>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1182417317064">
              <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1182417317071">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1182417317072">
            <property name="name" value="shortName" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1182417317074">
              <link role="baseMethodDeclaration" targetNodeId="3.~NameUtil.shortNameFromLongName(java.lang.String):java.lang.String" resolveInfo="shortNameFromLongName" />
              <link role="classConcept" targetNodeId="3.~NameUtil" resolveInfo="NameUtil" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1182417317075">
                <link role="variableDeclaration" targetNodeId="1182417317063" resolveInfo="classifierName" />
              </node>
            </node>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1182417317073">
              <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1182417384752">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1182417388887">
            <link role="baseMethodDeclaration" targetNodeId="3.~NameUtil.splitByCamels(java.lang.String):java.util.List" resolveInfo="splitByCamels" />
            <link role="classConcept" targetNodeId="3.~NameUtil" resolveInfo="NameUtil" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1182417397123">
              <link role="baseMethodDeclaration" targetNodeId="3.~NameUtil.decapitalize(java.lang.String):java.lang.String" resolveInfo="decapitalize" />
              <link role="classConcept" targetNodeId="3.~NameUtil" resolveInfo="NameUtil" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1182417400259">
                <link role="variableDeclaration" targetNodeId="1182417317072" resolveInfo="shortName" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1190026803610">
        <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1190026803611">
          <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1187948785371">
      <property name="name" value="getAbstractCreator" />
      <link role="overriddenMethod" targetNodeId="1187945523562" resolveInfo="getAbstractCreator" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1187948785373">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1187948806682">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1187948806683">
            <property name="name" value="creator" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1187948806684">
              <link role="concept" targetNodeId="1.1182160077978" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1187948829425">
              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1187948829426">
                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1187948829427">
                  <link role="concept" targetNodeId="1.1182160077978" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1187948869621">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1187948869622">
            <property name="name" value="clazz" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1187948869623">
              <link role="concept" targetNodeId="1.1170345865475" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977968202">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977965389">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1187948837631">
                  <link role="variableDeclaration" targetNodeId="1187948806683" resolveInfo="creator" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1187948858577">
                  <link role="link" targetNodeId="1.1182160096073" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetNewChildOperation" id="1187948860684" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1187948872586">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977965284">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977956493">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1187948872587">
                <link role="variableDeclaration" targetNodeId="1187948869622" resolveInfo="clazz" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1187948895643">
                <link role="link" targetNodeId="1.1170346070688" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetTargetOperation" id="1187948898636">
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977955556">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1187948900483" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1187948902653">
                  <link role="link" targetNodeId="1.1107535924139" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1187948834100">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1187948834101">
            <link role="variableDeclaration" targetNodeId="1187948806683" resolveInfo="creator" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1190026803612">
        <link role="concept" targetNodeId="1.1145552809883" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1194035602721">
      <property name="name" value="getClassExpression" />
      <link role="overriddenMethod" targetNodeId="1194035415601" resolveInfo="getClassExpression" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194035602723">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194035614381">
          <node role="expression" type="jetbrains.mps.quotation.structure.Quotation" id="1196777956853">
            <node role="quotedNode" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression" id="1196777956854">
              <link role="classifier" targetNodeId="13.~Object" resolveInfo="Object" />
              <node role="referenceAntiquotation$link_attribute$classifier" type="jetbrains.mps.quotation.structure.ReferenceAntiquotation" id="1196777956859">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977964614">
                  <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1196777956861" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1196777956862">
                    <link role="link" targetNodeId="1.1107535924139" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1194035609239">
        <link role="concept" targetNodeId="1.1068431790191" resolveInfo="Expression" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1178180387776">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1178180387777" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1178180470411">
    <property name="package" value="type" />
    <link role="concept" targetNodeId="1.1171903916106" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1195229647250">
      <property name="name" value="getPresentation" />
      <link role="overriddenMethod" targetNodeId="36.1180102203531" resolveInfo="getPresentation" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1195229647252">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1195229652880">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1195229656857">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1195229657704" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977966238">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1195229654836" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1195229656356">
                <link role="link" targetNodeId="1.1171903916107" />
              </node>
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1195229652882">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1195229660990">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1195229661695">
                <property name="value" value="? extends ???" />
              </node>
            </node>
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1195229659754">
            <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1195229659755">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1195229681388">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1195229685407">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977964117">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977956495">
                      <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1195229688520" />
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1195229693623">
                        <link role="link" targetNodeId="1.1171903916107" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1195229701210">
                      <link role="conceptMethodDeclaration" targetNodeId="36.1180102203531" resolveInfo="getPresentation" />
                    </node>
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1195229681952">
                    <property name="value" value="? extends " />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1199316533550">
        <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1178180470412">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1178180470413" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1178180512795">
    <property name="package" value="type" />
    <link role="concept" targetNodeId="1.1171903862077" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1195229564798">
      <property name="name" value="getPresentation" />
      <link role="overriddenMethod" targetNodeId="36.1180102203531" resolveInfo="getPresentation" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1195229564800">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1195229577903">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1195229577905">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1195229587872">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1195229593189">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977955069">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977965184">
                    <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1195229595958" />
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1195229597510">
                      <link role="link" targetNodeId="1.1171903869531" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1195229599108">
                    <link role="conceptMethodDeclaration" targetNodeId="36.1180102203531" resolveInfo="getPresentation" />
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1195229589687">
                  <property name="value" value="? super " />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1195229586102">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1195229586933" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977953993">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1195229581923" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1195229585475">
                <link role="link" targetNodeId="1.1171903869531" />
              </node>
            </node>
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1195229602501">
            <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1195229602502">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1195229604551">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1195229605194">
                  <property name="value" value="? super ???" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1199316475735">
        <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1178180512796">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1178180512797" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1178180533543">
    <property name="package" value="type" />
    <link role="concept" targetNodeId="1.1171903607971" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1195229709462">
      <property name="name" value="getPresentation" />
      <link role="overriddenMethod" targetNodeId="36.1180102203531" resolveInfo="getPresentation" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1195229709464">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1195229714202">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1195229714844">
            <property name="value" value="?" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1199316546629">
        <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1178180533544">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1178180533545" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1178181704918">
    <property name="package" value="type" />
    <link role="concept" targetNodeId="1.1068431790189" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1182416669983">
      <property name="isVirtual" value="true" />
      <property name="name" value="getVariableSuffixes" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1182416728726">
        <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1182416732684">
          <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
        </node>
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1182416669985">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1182417002470">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1182417004492">
            <link role="baseMethodDeclaration" targetNodeId="3.~NameUtil.splitByCamels(java.lang.String):java.util.List" resolveInfo="splitByCamels" />
            <link role="classConcept" targetNodeId="3.~NameUtil" resolveInfo="NameUtil" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977964616">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1199303682605" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1199303686671">
                <link role="conceptMethodDeclaration" targetNodeId="36.1180102203531" resolveInfo="getPresentation" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1199318924019">
      <property name="name" value="getErasureSignature" />
      <property name="isVirtual" value="true" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1199318935858">
        <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1199318924021">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1199318959016">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977962814">
            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1199318959017" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1199318968177">
              <link role="conceptMethodDeclaration" targetNodeId="36.1180102203531" resolveInfo="getPresentation" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1182580547590">
      <property name="isVirtual" value="true" />
      <property name="name" value="getUnboxedType" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1182580626382">
        <link role="concept" targetNodeId="1.1068431790189" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1182580547592">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1182580641141">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977965828">
            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1182580641142" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_CopyOperation" id="1182580643300" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1184959749711">
      <property name="name" value="getClass" />
      <property name="isVirtual" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1184959753000">
        <link role="classifier" targetNodeId="13.~Class" resolveInfo="Class" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184959749713">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1184959766673">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1184959766674">
            <link role="classConcept" targetNodeId="30.~ReflectionUtil" resolveInfo="ReflectionUtil" />
            <link role="baseMethodDeclaration" targetNodeId="30.~ReflectionUtil.forName(jetbrains.mps.project.IModule,jetbrains.mps.smodel.SNode):java.lang.Class" resolveInfo="forName" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1194439094783">
              <link role="variableDeclaration" targetNodeId="1194439082156" resolveInfo="module" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977967360">
              <node role="operand" type="jetbrains.mps.bootstrap.helgins.structure.CoerceExpression" id="1184959766677">
                <node role="pattern" type="jetbrains.mps.bootstrap.helgins.structure.ConceptReference" id="1184959766678">
                  <property name="name" value="classifierType" />
                  <link role="concept" targetNodeId="1.1107535904670" />
                </node>
                <node role="nodeToCoerce" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1184959773900" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1184959766676">
                <link role="link" targetNodeId="1.1107535924139" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1194439082156">
        <property name="name" value="module" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1194440798590">
          <link role="classifier" targetNodeId="35.~IModule" resolveInfo="IModule" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1187945523562">
      <property name="name" value="getAbstractCreator" />
      <property name="isVirtual" value="true" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1187945583255">
        <link role="concept" targetNodeId="1.1145552809883" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1187945523564">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1187945608906">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1187945608907" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1193670432254">
      <property name="isVirtual" value="true" />
      <property name="name" value="getJavaType" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1193670476620">
        <link role="concept" targetNodeId="1.1068431790189" resolveInfo="Type" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1193670432256">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1193670544870">
          <node role="expression" type="jetbrains.mps.bootstrap.helgins.structure.CoerceExpression" id="1193670546919">
            <node role="pattern" type="jetbrains.mps.bootstrap.helgins.structure.ConceptReference" id="1193670563970">
              <property name="name" value="classifierType" />
              <link role="concept" targetNodeId="1.1107535904670" resolveInfo="ClassifierType" />
            </node>
            <node role="nodeToCoerce" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1193670552907" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1206028811708">
      <property name="name" value="selectOnVariableCreation" />
      <property name="isVirtual" value="true" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1206028846679" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206028811710">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1206028920497">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1206028922421">
            <property name="value" value="false" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1194035415601">
      <property name="isVirtual" value="true" />
      <property name="name" value="getClassExpression" />
      <property name="isAbstract" value="true" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1194035475006">
        <link role="concept" targetNodeId="1.1068431790191" resolveInfo="Expression" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1178181704919">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1178181704920" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1178181704925">
    <property name="package" value="method" />
    <link role="concept" targetNodeId="1.1068580123132" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1195229803120">
      <property name="name" value="getPresentation" />
      <link role="overriddenMethod" targetNodeId="36.1180102203531" resolveInfo="getPresentation" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1195229803122">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1195229817027">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1195229817028">
            <property name="name" value="result" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1195229817029">
              <link role="classifier" targetNodeId="13.~StringBuilder" resolveInfo="StringBuilder" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1195229820110">
              <link role="baseMethodDeclaration" targetNodeId="13.~StringBuilder.&lt;init&gt;()" resolveInfo="StringBuilder" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1195229846560">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332416443">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1195229846561">
              <link role="variableDeclaration" targetNodeId="1195229817028" resolveInfo="result" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332416444">
              <link role="baseMethodDeclaration" targetNodeId="13.~StringBuilder.append(java.lang.CharSequence):java.lang.StringBuilder" resolveInfo="append" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977967258">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1195229850456" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1195229851429">
                  <link role="property" targetNodeId="1.1083152972672" resolveInfo="name" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1195229853885">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332454801">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1195229853886">
              <link role="variableDeclaration" targetNodeId="1195229817028" resolveInfo="result" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332454802">
              <link role="baseMethodDeclaration" targetNodeId="13.~StringBuilder.append(java.lang.CharSequence):java.lang.StringBuilder" resolveInfo="append" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1195229858985">
                <property name="value" value="(" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1195229875575">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1195229875576">
            <property name="name" value="first" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1195229875577" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1195229875578">
              <property name="value" value="true" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1195229875579">
          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977954478">
            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1195229875582" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1195229875581">
              <link role="link" targetNodeId="1.1068580123134" />
            </node>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1195229875583">
            <property name="name" value="parm" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1195229875584">
              <link role="concept" targetNodeId="1.1068498886292" resolveInfo="ParameterDeclaration" />
            </node>
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1195229875585">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1195229875586">
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1195229875587">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1195229875588">
                  <link role="variableDeclaration" targetNodeId="1195229875576" resolveInfo="first" />
                </node>
              </node>
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1195229875589">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1195229875590">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332444413">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1195229875592">
                      <link role="variableDeclaration" targetNodeId="1195229817028" resolveInfo="result" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332444414">
                      <link role="baseMethodDeclaration" targetNodeId="13.~StringBuilder.append(java.lang.CharSequence):java.lang.StringBuilder" resolveInfo="append" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1195229875593">
                        <property name="value" value="," />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1195229875594">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1195229875595">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1195229875596">
                  <property name="value" value="false" />
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1195229875597">
                  <link role="variableDeclaration" targetNodeId="1195229875576" resolveInfo="first" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1195229885563">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1195229885564">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1195229905474">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332445739">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1195229905476">
                      <link role="variableDeclaration" targetNodeId="1195229817028" resolveInfo="result" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332445740">
                      <link role="baseMethodDeclaration" targetNodeId="13.~StringBuilder.append(java.lang.CharSequence):java.lang.StringBuilder" resolveInfo="append" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977966914">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977964557">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1195229905481">
                            <link role="variableDeclaration" targetNodeId="1195229875583" resolveInfo="parm" />
                          </node>
                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1195229905480">
                            <link role="link" targetNodeId="1.1068431790188" />
                          </node>
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1195229905478">
                          <link role="conceptMethodDeclaration" targetNodeId="36.1180102203531" resolveInfo="getPresentation" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1195229900437">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1195229901378" />
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977966136">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1195229887161">
                    <link role="variableDeclaration" targetNodeId="1195229875583" resolveInfo="parm" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1195229898358">
                    <link role="link" targetNodeId="1.1068431790188" />
                  </node>
                </node>
              </node>
              <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1195229910562">
                <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1195229910563">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1195229912377">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332445721">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1195229912378">
                        <link role="variableDeclaration" targetNodeId="1195229817028" resolveInfo="result" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332445722">
                        <link role="baseMethodDeclaration" targetNodeId="13.~StringBuilder.append(java.lang.CharSequence):java.lang.StringBuilder" resolveInfo="append" />
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1195229914460">
                          <property name="value" value="???" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.CommentedStatementsBlock" id="1199319529034">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1197314162827">
                <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197314162828">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1197314174410">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332468438">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332445584">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1197314174411">
                          <link role="variableDeclaration" targetNodeId="1195229817028" resolveInfo="result" />
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332445585">
                          <link role="baseMethodDeclaration" targetNodeId="13.~StringBuilder.append(java.lang.CharSequence):java.lang.StringBuilder" resolveInfo="append" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1197314177860">
                            <property name="value" value=" " />
                          </node>
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332468439">
                        <link role="baseMethodDeclaration" targetNodeId="13.~StringBuilder.append(java.lang.CharSequence):java.lang.StringBuilder" resolveInfo="append" />
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977963955">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1197314183040">
                            <link role="variableDeclaration" targetNodeId="1195229875583" resolveInfo="parm" />
                          </node>
                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1197314184698">
                            <link role="property" targetNodeId="1.1083152972671" resolveInfo="name" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1197314170084">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1197314171297" />
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977954094">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1197314164246">
                      <link role="variableDeclaration" targetNodeId="1195229875583" resolveInfo="parm" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1197314168439">
                      <link role="property" targetNodeId="1.1083152972671" resolveInfo="name" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1195229860909">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332445605">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1195229860910">
              <link role="variableDeclaration" targetNodeId="1195229817028" resolveInfo="result" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332445606">
              <link role="baseMethodDeclaration" targetNodeId="13.~StringBuilder.append(java.lang.CharSequence):java.lang.StringBuilder" resolveInfo="append" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1195229863180">
                <property name="value" value=")" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1195229923464">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332454821">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1195229923465">
              <link role="variableDeclaration" targetNodeId="1195229817028" resolveInfo="result" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332454822">
              <link role="baseMethodDeclaration" targetNodeId="13.~StringBuilder.append(java.lang.CharSequence):java.lang.StringBuilder" resolveInfo="append" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1195229925547">
                <property name="value" value=":" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1195229930413">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1195229930414">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1195229948901">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332469543">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1195229948902">
                  <link role="variableDeclaration" targetNodeId="1195229817028" resolveInfo="result" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332469544">
                  <link role="baseMethodDeclaration" targetNodeId="13.~StringBuilder.append(java.lang.CharSequence):java.lang.StringBuilder" resolveInfo="append" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977964657">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977965393">
                      <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1195229952110" />
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1195229954443">
                        <link role="link" targetNodeId="1.1068580123133" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1195229956650">
                      <link role="conceptMethodDeclaration" targetNodeId="36.1180102203531" resolveInfo="getPresentation" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1195229935454">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1195229936317" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977956938">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1195229932839" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1195229934765">
                <link role="link" targetNodeId="1.1068580123133" />
              </node>
            </node>
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1195229939288">
            <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1195229939289">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1195229958605">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332444657">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1195229958606">
                    <link role="variableDeclaration" targetNodeId="1195229817028" resolveInfo="result" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332444658">
                    <link role="baseMethodDeclaration" targetNodeId="13.~StringBuilder.append(java.lang.CharSequence):java.lang.StringBuilder" resolveInfo="append" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1195229961032">
                      <property name="value" value="???" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1195229839506">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332468414">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1195229839507">
              <link role="variableDeclaration" targetNodeId="1195229817028" resolveInfo="result" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332468415">
              <link role="baseMethodDeclaration" targetNodeId="13.~StringBuilder.toString():java.lang.String" resolveInfo="toString" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1195229805921">
        <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1178181704926">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1178181704927" />
    </node>
    <node role="properties" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodePropertyConstraint" id="1156247157927">
      <link role="applicableProperty" targetNodeId="2.1156234966388" />
      <node role="propertyGetter" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_PropertyGetter" id="1156247206181">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1156247206182">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1156247207746">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1156247213139">
              <link role="baseMethodDeclaration" targetNodeId="1156246279317" resolveInfo="getDesciptionText" />
              <link role="classConcept" targetNodeId="1156246260769" resolveInfo="QueriesUtil" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintsFunctionParameter_node" id="1156247215422" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1184949950947">
      <property name="name" value="getMethod" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1184949950948">
        <link role="classifier" targetNodeId="28.~Method" resolveInfo="Method" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184949950949">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1184959904600">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1184959909384">
            <link role="classConcept" targetNodeId="30.~ReflectionUtil" resolveInfo="ReflectionUtil" />
            <link role="baseMethodDeclaration" targetNodeId="30.~ReflectionUtil.getMethod(jetbrains.mps.project.IModule,jetbrains.mps.smodel.SNode,java.lang.String,java.lang.Class[]):java.lang.reflect.Method" resolveInfo="getMethod" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1194439064574">
              <link role="variableDeclaration" targetNodeId="1194439059384" resolveInfo="module" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977962524">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1184959909387" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1184959909386" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977965333">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1184959909390" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1184959909389">
                <link role="property" targetNodeId="1.1083152972672" />
              </node>
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977953932">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1184968961412" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1184968961411">
                <link role="conceptMethodDeclaration" targetNodeId="1184950182063" resolveInfo="getParameterTypes" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1194439101222">
                  <link role="variableDeclaration" targetNodeId="1194439059384" resolveInfo="module" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1194439059384">
        <property name="name" value="module" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1194440786932">
          <link role="classifier" targetNodeId="35.~IModule" resolveInfo="IModule" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1184950182063">
      <property name="isPrivate" value="true" />
      <property name="name" value="getParameterTypes" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ArrayType" id="1184950281016">
        <node role="componentType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1184950279328">
          <link role="classifier" targetNodeId="13.~Class" resolveInfo="Class" />
        </node>
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184950182065">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1184964586486">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206572405485">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206572405379">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977967013">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1184964586487" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1206572417742">
                  <link role="link" targetNodeId="1.1068580123134" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SelectOperation" id="1184964594164">
                <node role="selector" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SelectorBlock" id="1184964594165">
                  <node role="defaultInputElement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.DefaultInputElement" id="1184964594166">
                    <property name="name" value="it" />
                  </node>
                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184964594167">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1184964611528">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977952257">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977966733">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.ClosureParameterReference" id="1184964611529">
                            <link role="closureParameter" targetNodeId="1184964594166" resolveInfo="it" />
                          </node>
                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1184964615361">
                            <link role="link" targetNodeId="1.1068431790188" />
                          </node>
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1184964617365">
                          <link role="conceptMethodDeclaration" targetNodeId="1184959749711" resolveInfo="getClass" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1194439074827">
                            <link role="variableDeclaration" targetNodeId="1194439070762" resolveInfo="module" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ToArrayOperation" id="1184964622304" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1194439070762">
        <property name="name" value="module" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1194440789573">
          <link role="classifier" targetNodeId="35.~IModule" resolveInfo="IModule" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1204901126405">
      <property name="name" value="hasSameSignature" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1204901156171" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204901126407">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1204901205781">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1204901205782">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1204901205783">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204901205784">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204901205785">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1204901256959">
                    <link role="variableDeclaration" targetNodeId="1204901170489" resolveInfo="checked" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1204901205787">
                    <link role="link" targetNodeId="1.1068580123134" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_GetCountOperation" id="1204901205788" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204901205789">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204901205790">
                  <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1204901252750" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1204901205792">
                    <link role="link" targetNodeId="1.1068580123134" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_GetCountOperation" id="1204901205793" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204901205794">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204901205795">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1204901217128" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1204901222978">
                  <link role="property" targetNodeId="1.1083152972672" resolveInfo="name" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204901205798">
                <link role="baseMethodDeclaration" targetNodeId="13.~String.equals(java.lang.Object):boolean" resolveInfo="equals" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204901205799">
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1204901234385">
                    <link role="property" targetNodeId="1.1083152972672" resolveInfo="name" />
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1204901231989">
                    <link role="variableDeclaration" targetNodeId="1204901170489" resolveInfo="checked" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204901205802">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1204901205803">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1204901205804">
                <property name="name" value="same" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1204901205805" />
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1204901205806">
                  <property name="value" value="true" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForStatement" id="1204901205807">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204901205808">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1204901205809">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1204901205810">
                    <property name="name" value="searchedParamType" />
                    <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204901205811">
                      <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204901205812">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204901205813">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206572405386">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204901205815">
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1204901284612">
                              <link role="variableDeclaration" targetNodeId="1204901170489" resolveInfo="checked" />
                            </node>
                            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1204901205817">
                              <link role="link" targetNodeId="1.1068580123134" />
                            </node>
                          </node>
                          <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetElementOperation" id="1204901205818">
                            <node role="argument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204901205819">
                              <link role="variableDeclaration" targetNodeId="1204901205846" resolveInfo="i" />
                            </node>
                          </node>
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1204901205820">
                          <link role="link" targetNodeId="1.1068431790188" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1204901205821">
                        <link role="conceptMethodDeclaration" targetNodeId="1199318924019" resolveInfo="getErasureSignature" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1204901205822">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1204901205823">
                    <property name="name" value="foundParamType" />
                    <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204901205824">
                      <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204901205825">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204901205826">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206572405649">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204901205828">
                            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1204901288853" />
                            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1204901205830">
                              <link role="link" targetNodeId="1.1068580123134" />
                            </node>
                          </node>
                          <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetElementOperation" id="1204901205831">
                            <node role="argument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204901205832">
                              <link role="variableDeclaration" targetNodeId="1204901205846" resolveInfo="i" />
                            </node>
                          </node>
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1204901205833">
                          <link role="link" targetNodeId="1.1068431790188" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1204901205834">
                        <link role="conceptMethodDeclaration" targetNodeId="1199318924019" resolveInfo="getErasureSignature" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1204901205835">
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204901205836">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204901205837">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1204901205838">
                        <node role="rValue" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1204901205839">
                          <property name="value" value="false" />
                        </node>
                        <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204901205840">
                          <link role="variableDeclaration" targetNodeId="1204901205804" resolveInfo="same" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1204901205841">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204901205842">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204901205843">
                        <link role="variableDeclaration" targetNodeId="1204901205823" resolveInfo="foundParamType" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204901205844">
                        <link role="baseMethodDeclaration" targetNodeId="13.~String.equals(java.lang.Object):boolean" resolveInfo="equals" />
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204901205845">
                          <link role="variableDeclaration" targetNodeId="1204901205810" resolveInfo="searchedParamType" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1204901205846">
                <property name="name" value="i" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1204901205847" />
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204901205848">
                  <property name="value" value="0" />
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.LessThanExpression" id="1204901205849">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204901205850">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204901205851">
                    <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1204901279653" />
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1204901205853">
                      <link role="link" targetNodeId="1.1068580123134" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_GetCountOperation" id="1204901205854" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204901205855">
                  <link role="variableDeclaration" targetNodeId="1204901205846" resolveInfo="i" />
                </node>
              </node>
              <node role="iteration" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1204901205856">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1204901205857">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204901205858">
                    <property name="value" value="1" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204901205859">
                    <link role="variableDeclaration" targetNodeId="1204901205846" resolveInfo="i" />
                  </node>
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204901205860">
                  <link role="variableDeclaration" targetNodeId="1204901205846" resolveInfo="i" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1204901306748">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204901308959">
                <link role="variableDeclaration" targetNodeId="1204901205804" resolveInfo="same" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1204901311889">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1204901313125">
            <property name="value" value="false" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1204901170489">
        <property name="name" value="checked" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1204901170490">
          <link role="concept" targetNodeId="1.1068580123132" resolveInfo="BaseMethodDeclaration" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1178181704931">
    <link role="concept" targetNodeId="1.1107461130800" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1189552517057">
      <property name="name" value="getVisibleMembersSearchScope" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1189552517058">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1189552641242">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1189552641243">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1189552649188">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1189552652909">
                <link role="baseMethodDeclaration" targetNodeId="5.~EmptySearchScope.&lt;init&gt;()" resolveInfo="EmptySearchScope" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1189552645731">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1189552647125" />
            <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1189552644402" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1189552684793">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1189552688124">
            <link role="baseMethodDeclaration" targetNodeId="10.~VisibleClassifierMembersScope.&lt;init&gt;(jetbrains.mps.baseLanguage.structure.Classifier,jetbrains.mps.smodel.SNode,int)" resolveInfo="VisibleClassifierMembersScope" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204672721486">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1189552727798" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAdapterOperation" id="1189552792044" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1189552771538">
              <link role="variableDeclaration" targetNodeId="1189552740066" resolveInfo="contextNode" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1189552778102">
              <link role="variableDeclaration" targetNodeId="1189552709625" resolveInfo="constraint" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1189552600176">
        <link role="classifier" targetNodeId="5.~ISearchScope" resolveInfo="ISearchScope" />
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1189552740066">
        <property name="name" value="contextNode" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1189552747006" />
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1189552709625">
        <property name="name" value="constraint" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1189552709626" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1199297265766">
      <property name="name" value="getFqName" />
      <link role="overriddenMethod" targetNodeId="36.1184686272576" resolveInfo="getFqName" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1199297265768">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1199297309458">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1199297309459">
            <property name="name" value="parentClassifier" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1199297309460">
              <link role="concept" targetNodeId="1.1107461130800" resolveInfo="Classifier" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977967356">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1199297309462" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1199297309463">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1199297309464">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1207781906033">
                    <link role="conceptDeclaration" targetNodeId="1.1107461130800" resolveInfo="Classifier" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1199297343030">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1199297343031">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1199297351196">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1199297364562">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1199297374878">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977952082">
                    <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1199297384225" />
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1199297387479">
                      <link role="property" targetNodeId="2.1169194664001" resolveInfo="name" />
                    </node>
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1199297371721">
                    <property name="value" value="." />
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977967949">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1199297356338">
                    <link role="variableDeclaration" targetNodeId="1199297309459" resolveInfo="parentClassifier" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1199297361514">
                    <link role="conceptMethodDeclaration" targetNodeId="36.1184686272576" resolveInfo="getFqName" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1199299515197">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1199299515198">
              <link role="variableDeclaration" targetNodeId="1199297309459" resolveInfo="parentClassifier" />
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1199299515199" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1199297420841">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977956599">
            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.SuperNodeExpression" id="1199297432311" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1199297436206">
              <link role="conceptMethodDeclaration" targetNodeId="36.1184686272576" resolveInfo="getFqName" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1199297276894">
        <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1178620561746">
      <property name="name" value="getQualifiedNameInAPackage" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1178620585007">
        <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1178620561748">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1178620613477">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1178620613478">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1178620621269">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977966163">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1178620625218" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1178620627538">
                  <link role="property" targetNodeId="2.1169194664001" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977968255">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977963050">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1178620615928" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1178620618706" />
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNullOperation" id="1179330285876" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1178620630360">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1178620630361">
            <property name="name" value="parentClassifier" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1178620630362">
              <link role="concept" targetNodeId="1.1107461130800" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977954019">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1178620644379" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1178620647332">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1178620649007">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1207781905889">
                    <link role="conceptDeclaration" targetNodeId="1.1107461130800" resolveInfo="Classifier" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1178620654542">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1178620661868">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1178620665425">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977964712">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1178620666376" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1178620668373">
                  <link role="property" targetNodeId="2.1169194664001" />
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1178620663836">
                <property name="value" value="." />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977951928">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1178620655810">
                <link role="variableDeclaration" targetNodeId="1178620630361" resolveInfo="parentClassifier" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1179419283721">
                <link role="conceptMethodDeclaration" targetNodeId="1178620561746" resolveInfo="getQualifiedNameInAPackage" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1179330359503">
      <property name="name" value="getShortClassifierNameToImport" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1179330390413">
        <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179330359505">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1179330429512">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977963754">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977967587">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1179330431536" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1179330436175" />
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNullOperation" id="1179330441206" />
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179330429514">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1182408065974">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1182408065975">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1182408110450">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1182408110451">
                    <property name="name" value="firstIndex" />
                    <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1182408110452" />
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332454819">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977956566">
                        <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1182408113451" />
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1182408115277">
                          <link role="property" targetNodeId="2.1169194664001" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332454820">
                        <link role="baseMethodDeclaration" targetNodeId="13.~String.indexOf(java.lang.String):int" resolveInfo="indexOf" />
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1182408128869">
                          <property name="value" value="." />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1182408081166">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332446095">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977954472">
                      <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1182408098337" />
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1182408100570">
                        <link role="property" targetNodeId="2.1169194664001" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332446096">
                      <link role="baseMethodDeclaration" targetNodeId="13.~String.substring(int,int):java.lang.String" resolveInfo="substring" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1182408138772">
                        <property name="value" value="0" />
                      </node>
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1182408141146">
                        <link role="variableDeclaration" targetNodeId="1182408110451" resolveInfo="firstIndex" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332445507">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977956727">
                  <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1182408066974" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1182408068814">
                    <link role="property" targetNodeId="2.1169194664001" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332445508">
                  <link role="baseMethodDeclaration" targetNodeId="13.~String.contains(java.lang.CharSequence):boolean" resolveInfo="contains" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1182408079544">
                    <property name="value" value="." />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1179330443761">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977964714">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1179330445458" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1179330447961">
                  <link role="property" targetNodeId="2.1169194664001" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1179330451703">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1179330451704">
            <property name="name" value="parentClassifier" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1179330451705">
              <link role="concept" targetNodeId="1.1107461130800" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977964637">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1179330467610" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1179330471475">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1179330474425">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1207781905873">
                    <link role="conceptDeclaration" targetNodeId="1.1107461130800" resolveInfo="Classifier" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1179330481676">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977964840">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1179330483969">
              <link role="variableDeclaration" targetNodeId="1179330451704" resolveInfo="parentClassifier" />
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1179419285052">
              <link role="conceptMethodDeclaration" targetNodeId="1178620561746" resolveInfo="getQualifiedNameInAPackage" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1194954191268">
      <property name="name" value="getMembers" />
      <link role="overriddenMethod" targetNodeId="1194952456574" resolveInfo="getMembers" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194954191270">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1194954793904">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1194954793905">
            <property name="name" value="members" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1194954884716" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1194954889816">
              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListCreator" id="1194954889817">
                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1194954889818" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194954205579">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206572405381">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1194954897790">
              <link role="variableDeclaration" targetNodeId="1194954793905" resolveInfo="members" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddAllElementsOperation" id="1194954901489">
              <node role="argument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977967098">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1194954904248" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1194954926542">
                  <link role="link" targetNodeId="1.1128555889557" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194954929251">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206572405865">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1194954929253">
              <link role="variableDeclaration" targetNodeId="1194954793905" resolveInfo="members" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddAllElementsOperation" id="1194954929254">
              <node role="argument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977954375">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1194954929257" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1194954940351">
                  <link role="link" targetNodeId="1.1107880067339" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194954936026">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1194954936027">
            <link role="variableDeclaration" targetNodeId="1194954793905" resolveInfo="members" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1194954197630" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1178181704932">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1178181704933">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1178550133303">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977965901">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977965590">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1178550133304" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1178550136209">
                <link role="link" targetNodeId="1.1178549650460" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetNewChildOperation" id="1178550138723">
              <link role="concept" targetNodeId="1.1146644602865" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="properties" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodePropertyConstraint" id="1156245967001">
      <link role="applicableProperty" targetNodeId="2.1156234966388" />
      <node role="propertyGetter" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_PropertyGetter" id="1156245998315">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1156245998316">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1189552928001">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1156246127874">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1156246152019">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1156246212795">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1156246214423">
                    <property name="value" value=")" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332454922">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332445532">
                      <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SemanticDowncastExpression" id="1170384264335">
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977962549">
                          <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintsFunctionParameter_node" id="1170384264337" />
                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetModelOperation" id="1170384264338" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332445533">
                        <link role="baseMethodDeclaration" targetNodeId="7.~SModel.getUID():jetbrains.mps.smodel.SModelUID" resolveInfo="getUID" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332454923">
                      <link role="baseMethodDeclaration" targetNodeId="7.~SModelUID.getCompactPresentation():java.lang.String" resolveInfo="getCompactPresentation" />
                    </node>
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1156246145252">
                  <property name="value" value=" (" />
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1156246109823">
                <link role="classConcept" targetNodeId="11.~NodePresentationUtil" resolveInfo="NodePresentationUtil" />
                <link role="baseMethodDeclaration" targetNodeId="11.~NodePresentationUtil.getAliasOrConceptName(jetbrains.mps.smodel.SNode):java.lang.String" resolveInfo="getAliasOrConceptName" />
                <node role="actualArgument" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintsFunctionParameter_node" id="1156246111870" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="defaultScope" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodeDefaultSearchScope" id="1188500607728">
      <property name="description" value="visible classifiers from model and imported models" />
      <node role="searchScopeFactory" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_ReferentSearchScope_Factory" id="1188500607729">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1188500607730">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1188500774284">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1188500774285">
              <link role="baseMethodDeclaration" targetNodeId="10.~VisibleClassifiersScope.&lt;init&gt;(jetbrains.mps.smodel.SModel,int,jetbrains.mps.smodel.IScope)" resolveInfo="VisibleClassifiersScope" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.sharedConcepts.structure.ConceptFunctionParameter_model" id="1188500802731" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1188500834047">
                <link role="classifier" targetNodeId="10.~IClassifiersSearchScope" resolveInfo="IClassifiersSearchScope" />
                <link role="variableDeclaration" targetNodeId="10.~IClassifiersSearchScope.CLASSIFFIER" resolveInfo="CLASSIFFIER" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.bootstrap.sharedConcepts.structure.ConceptFunctionParameter_scope" id="1188500860799" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1178181704938">
    <link role="concept" targetNodeId="1.1070475926800" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1185039170390">
      <property name="name" value="eval" />
      <link role="overriddenMethod" targetNodeId="1184884309598" resolveInfo="eval" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1185039170392">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1185039281131">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977966165">
            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1185039281132" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1185039285183">
              <link role="property" targetNodeId="1.1070475926801" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1194439182492">
        <property name="name" value="module" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1194440887782">
          <link role="classifier" targetNodeId="35.~IModule" resolveInfo="IModule" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1193389769393">
        <link role="classifier" targetNodeId="13.~Object" resolveInfo="Object" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1178181704939">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1178181704940" />
    </node>
    <node role="properties" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodePropertyConstraint" id="1173475842434">
      <link role="applicableProperty" targetNodeId="1.1070475926801" />
      <node role="propertyGetter" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_PropertyGetter" id="1173475852701">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1173475852702">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1173475883903">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1173475883904">
              <property name="name" value="value" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1173475883902">
                <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977965103">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintsFunctionParameter_node" id="1173475874008" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1173475876588">
                  <link role="property" targetNodeId="1.1070475926801" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1173475889992">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.TernaryOperatorExpression" id="1173475889993">
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1173475893507">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1173475895463" />
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1173475891990">
                  <link role="variableDeclaration" targetNodeId="1173475883904" resolveInfo="value" />
                </node>
              </node>
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1173475898831" />
              <node role="ifFalse" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1173475901059">
                <link role="variableDeclaration" targetNodeId="1173475883904" resolveInfo="value" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1178181704950">
    <link role="concept" targetNodeId="1.1068431474542" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1182160839808">
      <property name="isVirtual" value="true" />
      <property name="isAbstract" value="false" />
      <property name="name" value="inline" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1182160869063" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1182162555072">
        <property name="name" value="editorContext" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1182162555073">
          <link role="classifier" targetNodeId="26.~EditorContext" resolveInfo="EditorContext" />
        </node>
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1198838207743">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1198838218045">
          <property name="value" value="Do nothing by default" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1207235870860">
      <property name="name" value="createReference" />
      <property name="isVirtual" value="true" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207235883251">
        <link role="concept" targetNodeId="1.1068498886296" resolveInfo="VariableReference" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207235870862">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ThrowStatement" id="1207235891362">
          <node role="throwable" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1207235893473">
            <link role="baseMethodDeclaration" targetNodeId="13.~RuntimeException.&lt;init&gt;()" resolveInfo="RuntimeException" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1198838351591">
      <property name="name" value="isInitializable" />
      <property name="isVirtual" value="true" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1198838353788" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1198838351593">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1198838361623">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1198838361624">
            <property name="value" value="false" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1201184521862">
      <property name="name" value="deriveType" />
      <link role="overriddenMethod" targetNodeId="1201184092299" resolveInfo="deriveType" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201184521864">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1201184537005">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1201184537006">
            <property name="name" value="type" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1201184537007">
              <link role="concept" targetNodeId="1.1068431790189" resolveInfo="Type" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1201184537008" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1201184537009">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201184537010">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1201184570296">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1201184572677">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977963703">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977967354">
                    <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1201184575882" />
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1201184578292">
                      <link role="link" targetNodeId="1.1068431790188" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_CopyOperation" id="1201184580513" />
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201184570297">
                  <link role="variableDeclaration" targetNodeId="1201184537006" resolveInfo="type" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1201184537050">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977954068">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1201184537053">
                <link role="variableDeclaration" targetNodeId="1201184525125" resolveInfo="expression" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsRoleOperation" id="1201184537052">
                <link role="conceptOfParent" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration" />
                <link role="linkInParent" targetNodeId="1.1068431790190" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1201184537054">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977962611">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1201184537057">
                  <link role="variableDeclaration" targetNodeId="1201184525125" resolveInfo="expression" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1201184537056" />
              </node>
              <node role="rightExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1201184537058" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1201184537059">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201184537060">
            <link role="variableDeclaration" targetNodeId="1201184537006" resolveInfo="type" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1201184525125">
        <property name="name" value="expression" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1201184525126">
          <link role="concept" targetNodeId="1.1068431790191" resolveInfo="Expression" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1201184525127">
        <link role="concept" targetNodeId="1.1068431790189" resolveInfo="Type" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1178181704951">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1178181704952" />
    </node>
    <node role="properties" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodePropertyConstraint" id="1156247170881">
      <link role="applicableProperty" targetNodeId="2.1156234966388" />
      <node role="propertyGetter" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_PropertyGetter" id="1156247218329">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1156247218330">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1156247219987">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1156247226365">
              <link role="baseMethodDeclaration" targetNodeId="1156246279317" resolveInfo="getDesciptionText" />
              <link role="classConcept" targetNodeId="1156246260769" resolveInfo="QueriesUtil" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintsFunctionParameter_node" id="1156247228632" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1178181704973">
    <property name="package" value="classConcept" />
    <link role="concept" targetNodeId="1.1170345865475" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1178181704974">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1178181704975" />
    </node>
    <node role="properties" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodePropertyConstraint" id="1170356866890">
      <link role="applicableProperty" targetNodeId="1.1075300953595" />
      <node role="propertyGetter" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_PropertyGetter" id="1170356883829">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1170356883830">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1170356914025">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1170356931468">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1170356947567">
                <property name="value" value="$anonymous" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977955564">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977967873">
                  <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintsFunctionParameter_node" id="1170356926309" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1170356927623">
                    <link role="link" targetNodeId="1.1170346070688" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1170356943159">
                  <link role="property" targetNodeId="2.1169194664001" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1178181705016">
    <link role="concept" targetNodeId="1.1068581242863" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1182162170965">
      <property name="name" value="inline" />
      <link role="overriddenMethod" targetNodeId="1182160839808" resolveInfo="inline" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1182162215087">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1182162402478">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1182162402479">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1182162415649" />
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1182162411932">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1182162413916" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977956731">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1182162404057" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1182162410369">
                <link role="link" targetNodeId="1.1068431790190" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1182162215088">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1182162215089">
            <property name="name" value="modelDescriptor" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1182162215090">
              <link role="classifier" targetNodeId="7.~SModelDescriptor" resolveInfo="SModelDescriptor" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332454920">
              <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SemanticDowncastExpression" id="1182162215092">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977968287">
                  <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1182162232584" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetModelOperation" id="1182162215095" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332454921">
                <link role="baseMethodDeclaration" targetNodeId="7.~SModel.getModelDescriptor():jetbrains.mps.smodel.SModelDescriptor" resolveInfo="getModelDescriptor" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.AssertStatement" id="1182162215096">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1182162215097">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1182162215098" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1182162215099">
              <link role="variableDeclaration" targetNodeId="1182162215089" resolveInfo="modelDescriptor" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1182162215100">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1182162215101">
            <property name="name" value="usages" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1182162215102">
              <link role="classifier" targetNodeId="6.~Set" resolveInfo="Set" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1182162215103">
                <link role="classifier" targetNodeId="7.~SReference" resolveInfo="SReference" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332445889">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1182162215105">
                <link role="variableDeclaration" targetNodeId="1182162215089" resolveInfo="modelDescriptor" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332445890">
                <link role="baseMethodDeclaration" targetNodeId="7.~SModelDescriptor.findUsages(jetbrains.mps.smodel.SNode):java.util.Set" resolveInfo="findUsages" />
                <node role="actualArgument" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1182162283611" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1182162215107">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332468227">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1182162215109">
              <link role="variableDeclaration" targetNodeId="1182162215101" resolveInfo="usages" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332468228">
              <link role="baseMethodDeclaration" targetNodeId="6.~Set.isEmpty():boolean" resolveInfo="isEmpty" />
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1182162215110">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1182162215111">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1182162215112">
                <link role="classConcept" targetNodeId="27.~JOptionPane" resolveInfo="JOptionPane" />
                <link role="baseMethodDeclaration" targetNodeId="27.~JOptionPane.showMessageDialog(java.awt.Component,java.lang.Object,java.lang.String,int):void" resolveInfo="showMessageDialog" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332444608">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1190052389898">
                    <link role="variableDeclaration" targetNodeId="1190026803773" resolveInfo="editorContext" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332444609">
                    <link role="baseMethodDeclaration" targetNodeId="26.~EditorContext.getNodeEditorComponent():jetbrains.mps.nodeEditor.AbstractEditorComponent" resolveInfo="getNodeEditorComponent" />
                  </node>
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1182162215115">
                  <property name="value" value="Variable is never used" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1182162215116" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1182162215117">
                  <link role="variableDeclaration" targetNodeId="27.~JOptionPane.INFORMATION_MESSAGE" resolveInfo="INFORMATION_MESSAGE" />
                  <link role="classifier" targetNodeId="27.~JOptionPane" resolveInfo="JOptionPane" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1182162215118" />
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1182162215119">
            <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1182162215120">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1182162215121">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1182162215122">
                  <property name="name" value="code" />
                  <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1182162215123" />
                  <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1182162215124">
                    <link role="baseMethodDeclaration" targetNodeId="27.~JOptionPane.showConfirmDialog(java.awt.Component,java.lang.Object,java.lang.String,int):int" resolveInfo="showConfirmDialog" />
                    <link role="classConcept" targetNodeId="27.~JOptionPane" resolveInfo="JOptionPane" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332444206">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1190052392024">
                        <link role="variableDeclaration" targetNodeId="1190026803773" resolveInfo="editorContext" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332444207">
                        <link role="baseMethodDeclaration" targetNodeId="26.~EditorContext.getNodeEditorComponent():jetbrains.mps.nodeEditor.AbstractEditorComponent" resolveInfo="getNodeEditorComponent" />
                      </node>
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1182162215127">
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1182162215128">
                        <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1182162215129">
                          <property name="value" value=" occurrences)" />
                        </node>
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332445461">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1182162215131">
                            <link role="variableDeclaration" targetNodeId="1182162215101" resolveInfo="usages" />
                          </node>
                          <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332445462">
                            <link role="baseMethodDeclaration" targetNodeId="6.~Set.size():int" resolveInfo="size" />
                          </node>
                        </node>
                      </node>
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1182162215132">
                        <property name="value" value="Inline variable? (" />
                      </node>
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1182162215133" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1182162215134">
                      <link role="variableDeclaration" targetNodeId="27.~JOptionPane.YES_NO_OPTION" resolveInfo="YES_NO_OPTION" />
                      <link role="classifier" targetNodeId="27.~JOptionPane" resolveInfo="JOptionPane" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1182162215135">
                <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1182162215136">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1182162215137">
                    <link role="variableDeclaration" targetNodeId="27.~JOptionPane.YES_OPTION" resolveInfo="YES_OPTION" />
                    <link role="classifier" targetNodeId="27.~JOptionPane" resolveInfo="JOptionPane" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1182162215138">
                    <link role="variableDeclaration" targetNodeId="1182162215122" resolveInfo="code" />
                  </node>
                </node>
                <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1182162215139">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1182162215140" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1190053132210">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1190053132211">
            <property name="name" value="newSelection" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1190053132212" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1190053135402" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1182162215141">
          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1182162215142">
            <link role="variableDeclaration" targetNodeId="1182162215101" resolveInfo="usages" />
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1182162215143">
            <property name="name" value="ref" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1182162215144">
              <link role="classifier" targetNodeId="7.~SReference" resolveInfo="SReference" />
            </node>
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1182162215145">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1182162215146">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1182162215147">
                <property name="name" value="sourceNode" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1182162215148" />
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332444442">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1182162215150">
                    <link role="variableDeclaration" targetNodeId="1182162215143" resolveInfo="ref" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332444443">
                    <link role="baseMethodDeclaration" targetNodeId="7.~SReference.getSourceNode():jetbrains.mps.smodel.SNode" resolveInfo="getSourceNode" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1182162215151">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1182162215152">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1190053145529">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1190053145530">
                    <property name="name" value="copy" />
                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1190053145531">
                      <link role="concept" targetNodeId="1.1068431790191" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977964659">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977956337">
                        <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1182162329202" />
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1182162215161">
                          <link role="link" targetNodeId="1.1068431790190" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_CopyOperation" id="1182162215162" />
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1190053150346">
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1190053150347">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1190053157511">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1190053158201">
                        <node role="rValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1190053159141">
                          <link role="variableDeclaration" targetNodeId="1190053145530" resolveInfo="copy" />
                        </node>
                        <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1190053157512">
                          <link role="variableDeclaration" targetNodeId="1190053132211" resolveInfo="newSelection" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1190053154539">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1190053155323" />
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1190053152772">
                      <link role="variableDeclaration" targetNodeId="1190053132211" resolveInfo="newSelection" />
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1182162215153">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977968389">
                    <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1182162215155">
                      <link role="concept" targetNodeId="1.1068498886296" />
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1182162215156">
                        <link role="variableDeclaration" targetNodeId="1182162215147" resolveInfo="sourceNode" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ReplaceWithAnotherOperation" id="1182162215157">
                      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1190053145532">
                        <link role="variableDeclaration" targetNodeId="1190053145530" resolveInfo="copy" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977965755">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1182162215164">
                  <link role="variableDeclaration" targetNodeId="1182162215147" resolveInfo="sourceNode" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1182162215165">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1182162215166">
                    <link role="conceptDeclaration" targetNodeId="1.1068498886296" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1182162215167">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977951976">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977965954">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1182162361542" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1182162215171">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1182162215172">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1207781905892">
                    <link role="conceptDeclaration" targetNodeId="1.1068581242864" resolveInfo="LocalVariableDeclarationStatement" />
                  </node>
                </node>
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_DeleteOperation" id="1182162215173" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1190053162987">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1190053162988">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1190053169746">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332445696">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1190053169747">
                  <link role="variableDeclaration" targetNodeId="1190026803773" resolveInfo="editorContext" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332445697">
                  <link role="baseMethodDeclaration" targetNodeId="26.~EditorContext.selectLater(jetbrains.mps.smodel.SNode):void" resolveInfo="selectLater" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1190053175720">
                    <link role="variableDeclaration" targetNodeId="1190053132211" resolveInfo="newSelection" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1190053165523">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1190053168417" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1190053164694">
              <link role="variableDeclaration" targetNodeId="1190053132211" resolveInfo="newSelection" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1190026803773">
        <property name="name" value="editorContext" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1190026803774">
          <link role="classifier" targetNodeId="26.~EditorContext" resolveInfo="EditorContext" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1190026803775" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1198838531538">
      <property name="name" value="isInitializable" />
      <link role="overriddenMethod" targetNodeId="1198838351591" resolveInfo="isInitializable" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1198838531540">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1198838576798">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1198838576799">
            <property name="name" value="parent" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1198838576800" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977967175">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1198838582438" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1198838576803" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1198838617354">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.OrExpression" id="1198838618753">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977954070">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1198838618755">
                <link role="variableDeclaration" targetNodeId="1198838576799" resolveInfo="parent" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1198838618756">
                <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1198838618757">
                  <link role="conceptDeclaration" targetNodeId="1.1144231330558" resolveInfo="ForStatement" />
                </node>
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977956593">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1198838618759">
                <link role="variableDeclaration" targetNodeId="1198838576799" resolveInfo="parent" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1198838618760">
                <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1198838618761">
                  <link role="conceptDeclaration" targetNodeId="1.1068581242864" resolveInfo="LocalVariableDeclarationStatement" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1198838534422" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1207236001822">
      <property name="name" value="createReference" />
      <link role="overriddenMethod" targetNodeId="1207235870860" resolveInfo="createReference" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207236001824">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207236007455">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207236007456">
            <property name="name" value="ref" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207236007457">
              <link role="concept" targetNodeId="1.1068581242866" resolveInfo="LocalVariableReference" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1207236011916">
              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1207236011917">
                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207236011918">
                  <link role="concept" targetNodeId="1.1068581242866" resolveInfo="LocalVariableReference" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207236013701">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207236016743">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207236014440">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207236013702">
                <link role="variableDeclaration" targetNodeId="1207236007456" resolveInfo="ref" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1207236016350">
                <link role="link" targetNodeId="1.1070568296581" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetTargetOperation" id="1207236018716">
              <node role="parameter" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1207236019546" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1207236020705">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207236022194">
            <link role="variableDeclaration" targetNodeId="1207236007456" resolveInfo="ref" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207236004483">
        <link role="concept" targetNodeId="1.1068498886296" resolveInfo="VariableReference" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1178181705017">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1178181705018" />
    </node>
    <node role="properties" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodePropertyConstraint" id="1156242327032">
      <link role="applicableProperty" targetNodeId="2.1156234966388" />
      <node role="propertyGetter" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_PropertyGetter" id="1156242343205">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1156242343206">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1156242344754">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1156242347975">
              <property name="value" value="local variable" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1178181705030">
    <property name="package" value="type" />
    <link role="concept" targetNodeId="1.1109283449304" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1198891352964">
      <property name="name" value="getPresentation" />
      <link role="overriddenMethod" targetNodeId="36.1180102203531" resolveInfo="getPresentation" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1198891352966">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1198891397219">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1198891397220">
            <property name="name" value="decl" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1198891397221">
              <link role="concept" targetNodeId="1.1109279763828" resolveInfo="TypeVariableDeclaration" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977964215">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1198891403924" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1198891397224">
                <link role="link" targetNodeId="1.1109283546497" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1198891397225">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1198891397226">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1198891397227" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1198891397228">
              <link role="variableDeclaration" targetNodeId="1198891397220" resolveInfo="decl" />
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1198891397229">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1198891397230">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977951934">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1198891397232">
                  <link role="variableDeclaration" targetNodeId="1198891397220" resolveInfo="decl" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1198891408800">
                  <link role="property" targetNodeId="1.1109279783704" resolveInfo="name" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1198891397234">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1198891397235">
            <property name="value" value="?typevar_ref?" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1199316516846">
        <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1178181705031">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1178181705032" />
    </node>
    <node role="references" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodeReferentConstraint" id="1149800541394">
      <property name="searchScopeDescription" value="type-variables declared in enclosing classifier" />
      <link role="applicableLink" targetNodeId="1.1109283546497" />
      <node role="searchScopeFactory" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_ReferentSearchScope_Factory" id="1149800541395">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1149800541396">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1208874513123">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1208874513124">
              <property name="name" value="declarations" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1208874513125">
                <link role="elementConcept" targetNodeId="1.1109279763828" resolveInfo="TypeVariableDeclaration" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1208874527832">
                <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListCreator" id="1208874527833">
                  <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1208874527834">
                    <link role="elementConcept" targetNodeId="1.1109279763828" resolveInfo="TypeVariableDeclaration" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1208874533381">
            <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1208874533382">
              <property name="name" value="genericDeclaration" />
            </node>
            <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208874593365">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptParameter_ReferentSearchScope_enclosingNode" id="1208874593366" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorsOperation" id="1208874593367">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Inclusion" id="1208874593368" />
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1208874593370">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1208874593371">
                    <link role="conceptDeclaration" targetNodeId="1.1109279851642" resolveInfo="GenericDeclaration" />
                  </node>
                </node>
              </node>
            </node>
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208874533384">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1208874557959">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208874558884">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208874557960">
                    <link role="variableDeclaration" targetNodeId="1208874513124" resolveInfo="declarations" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddAllElementsOperation" id="1208874562543">
                    <node role="argument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208874568395">
                      <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1208874567707">
                        <link role="variable" targetNodeId="1208874533382" resolveInfo="genericDeclaration" />
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1208874574609">
                        <link role="link" targetNodeId="1.1109279881614" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1208874582533">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1149800841719">
              <link role="baseMethodDeclaration" targetNodeId="5.~SimpleSearchScope.&lt;init&gt;(java.util.List)" resolveInfo="SimpleSearchScope" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208874580163">
                <link role="variableDeclaration" targetNodeId="1208874513124" resolveInfo="declarations" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="searchScopeCanCreate" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_ReferentSearchScope_CanCreate" id="1159222123024">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1159222123025">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1159222133714">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1159222133715">
              <property name="name" value="genericDeclaration" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1159222133716">
                <link role="concept" targetNodeId="1.1109279851642" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977966291">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptParameter_ReferentSearchScope_enclosingNode" id="1159222133718" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1171484302549">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Inclusion" id="1159222133720" />
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1159222133721">
                    <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1207781905998">
                      <link role="conceptDeclaration" targetNodeId="1.1109279851642" resolveInfo="GenericDeclaration" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1159222138817">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1159222146351">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1159222148432" />
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1159222141788">
                <link role="variableDeclaration" targetNodeId="1159222133715" resolveInfo="genericDeclaration" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1178181705039">
    <link role="concept" targetNodeId="1.1083245299891" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1178181705040">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1178181705041" />
    </node>
    <node role="properties" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodePropertyConstraint" id="1156247184805">
      <link role="applicableProperty" targetNodeId="2.1156234966388" />
      <node role="propertyGetter" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_PropertyGetter" id="1156247231883">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1156247231884">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1156247233432">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1156247238232">
              <link role="baseMethodDeclaration" targetNodeId="1156246279317" resolveInfo="getDesciptionText" />
              <link role="classConcept" targetNodeId="1156246260769" resolveInfo="QueriesUtil" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintsFunctionParameter_node" id="1156247240280" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1178181705049">
    <link role="concept" targetNodeId="1.1068580123140" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1196336070467">
      <property name="name" value="getPresentation" />
      <link role="overriddenMethod" targetNodeId="36.1180102203531" resolveInfo="getPresentation" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196336070469">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1196336112525">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196336112526">
            <property name="name" value="result" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196336112527">
              <link role="classifier" targetNodeId="13.~StringBuilder" resolveInfo="StringBuilder" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1196336112528">
              <link role="baseMethodDeclaration" targetNodeId="13.~StringBuilder.&lt;init&gt;()" resolveInfo="StringBuilder" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196336112529">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332444232">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196336112531">
              <link role="variableDeclaration" targetNodeId="1196336112526" resolveInfo="result" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332444233">
              <link role="baseMethodDeclaration" targetNodeId="13.~StringBuilder.append(java.lang.CharSequence):java.lang.StringBuilder" resolveInfo="append" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977963488">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1196336112534" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1196336155160">
                  <link role="property" targetNodeId="1.1083152972672" resolveInfo="name" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196336112535">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332446455">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196336112537">
              <link role="variableDeclaration" targetNodeId="1196336112526" resolveInfo="result" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332446456">
              <link role="baseMethodDeclaration" targetNodeId="13.~StringBuilder.append(java.lang.CharSequence):java.lang.StringBuilder" resolveInfo="append" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1196336112538">
                <property name="value" value="(" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1196336112539">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196336112540">
            <property name="name" value="first" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1196336112541" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1196336112542">
              <property name="value" value="true" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1196336112543">
          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977965304">
            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1196336112546" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1196336112545">
              <link role="link" targetNodeId="1.1068580123134" />
            </node>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196336112547">
            <property name="name" value="parm" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1196336112548">
              <link role="concept" targetNodeId="1.1068498886292" resolveInfo="ParameterDeclaration" />
            </node>
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196336112549">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1196336112550">
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1196336112551">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196336112552">
                  <link role="variableDeclaration" targetNodeId="1196336112540" resolveInfo="first" />
                </node>
              </node>
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196336112553">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196336112554">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332444464">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196336112556">
                      <link role="variableDeclaration" targetNodeId="1196336112526" resolveInfo="result" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332444465">
                      <link role="baseMethodDeclaration" targetNodeId="13.~StringBuilder.append(java.lang.CharSequence):java.lang.StringBuilder" resolveInfo="append" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1196336112557">
                        <property name="value" value="," />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196336112558">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1196336112559">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1196336112560">
                  <property name="value" value="false" />
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196336112561">
                  <link role="variableDeclaration" targetNodeId="1196336112540" resolveInfo="first" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1196336112562">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196336112563">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196336112564">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332446461">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196336112566">
                      <link role="variableDeclaration" targetNodeId="1196336112526" resolveInfo="result" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332446462">
                      <link role="baseMethodDeclaration" targetNodeId="13.~StringBuilder.append(java.lang.CharSequence):java.lang.StringBuilder" resolveInfo="append" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977968137">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977966753">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196336112571">
                            <link role="variableDeclaration" targetNodeId="1196336112547" resolveInfo="parm" />
                          </node>
                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1196336112570">
                            <link role="link" targetNodeId="1.1068431790188" />
                          </node>
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1196336112568">
                          <link role="conceptMethodDeclaration" targetNodeId="36.1180102203531" resolveInfo="getPresentation" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1196336112572">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1196336112573" />
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977951907">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196336112576">
                    <link role="variableDeclaration" targetNodeId="1196336112547" resolveInfo="parm" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1196336112575">
                    <link role="link" targetNodeId="1.1068431790188" />
                  </node>
                </node>
              </node>
              <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1196336112577">
                <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196336112578">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196336112579">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332445625">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196336112581">
                        <link role="variableDeclaration" targetNodeId="1196336112526" resolveInfo="result" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332445626">
                        <link role="baseMethodDeclaration" targetNodeId="13.~StringBuilder.append(java.lang.CharSequence):java.lang.StringBuilder" resolveInfo="append" />
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1196336112582">
                          <property name="value" value="???" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196336112583">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332468420">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196336112585">
              <link role="variableDeclaration" targetNodeId="1196336112526" resolveInfo="result" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332468421">
              <link role="baseMethodDeclaration" targetNodeId="13.~StringBuilder.append(java.lang.CharSequence):java.lang.StringBuilder" resolveInfo="append" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1196336112586">
                <property name="value" value=")" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1196336162301">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332444352">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196336163040">
              <link role="variableDeclaration" targetNodeId="1196336112526" resolveInfo="result" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332444353">
              <link role="baseMethodDeclaration" targetNodeId="13.~StringBuilder.toString():java.lang.String" resolveInfo="toString" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196336073388">
        <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1178181705050">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1178181705051" />
    </node>
    <node role="properties" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodePropertyConstraint" id="1147487410154">
      <link role="applicableProperty" targetNodeId="1.1083152972672" />
      <node role="propertyGetter" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_PropertyGetter" id="1147487421436">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1147487421437">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1147487505771">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1147487505772">
              <property name="name" value="parent" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1147487505774">
                <link role="concept" targetNodeId="2.1169194658468" resolveInfo="INamedConcept" />
              </node>
              <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1147487497770">
                <link role="concept" targetNodeId="2.1169194658468" resolveInfo="INamedConcept" />
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977965045">
                  <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintsFunctionParameter_node" id="1147487490189" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1147487495128" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1147487516182">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1147487519952">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1147487521877" />
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1147487517904">
                <link role="variableDeclaration" targetNodeId="1147487505772" resolveInfo="parent" />
              </node>
            </node>
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1147487516184">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1147487524300">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977966605">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1147487525614">
                    <link role="variableDeclaration" targetNodeId="1147487505772" resolveInfo="parent" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1196207690826">
                    <link role="property" targetNodeId="2.1169194664001" resolveInfo="name" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1147487532040">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1147487534198">
              <property name="value" value="?constructor?" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1178192141104">
    <property name="package" value="method.static" />
    <link role="concept" targetNodeId="1.1172058436953" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1178192141105">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1178192141106" />
    </node>
    <node role="references" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodeReferentConstraint" id="1172059482708">
      <link role="applicableLink" targetNodeId="1.1172058436957" />
      <node role="searchScopeFactory" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_ReferentSearchScope_Factory" id="1172059496350">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1172059496351">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1189556848980">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1189556848981">
              <property name="name" value="clazz" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1189556848982">
                <link role="concept" targetNodeId="1.1068390468198" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977955201">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptParameter_ReferentSearchScope_enclosingNode" id="1172060024797" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1172060024798">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1172060024799">
                    <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1207781905934">
                      <link role="conceptDeclaration" targetNodeId="1.1068390468198" resolveInfo="ClassConcept" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1210185894914">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1210185894915">
              <link role="baseMethodDeclaration" targetNodeId="32.~StaticMethodCall_StaticMethodScope.&lt;init&gt;(jetbrains.mps.baseLanguage.structure.ClassConcept,jetbrains.mps.smodel.SNode)" resolveInfo="StaticMethodCall_StaticMethodScope" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210185894916">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210185894917">
                  <link role="variableDeclaration" targetNodeId="1189556848981" resolveInfo="clazz" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAdapterOperation" id="1210185894918" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunctionParameter_referenceNode" id="1210185894919" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1178192141184">
    <link role="concept" targetNodeId="1.1070533707846" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1185038559679">
      <property name="name" value="eval" />
      <link role="overriddenMethod" targetNodeId="1184884309598" resolveInfo="eval" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1185038559681">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1185039079871">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1185039079872">
            <property name="name" value="classifier" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1185039079873">
              <link role="concept" targetNodeId="1.1107461130800" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977953861">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1185039069834" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1185039076620">
                <link role="link" targetNodeId="1.1144433057691" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1185039098885">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1185039098886">
            <property name="name" value="name" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1185039098887">
              <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977966349">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977967561">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1185039093344" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1185039095411">
                  <link role="link" targetNodeId="1.1070568178160" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1185039096821">
                <link role="property" targetNodeId="1.1083152972671" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1185039106545">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1185039110438">
            <link role="classConcept" targetNodeId="30.~ReflectionUtil" resolveInfo="ReflectionUtil" />
            <link role="baseMethodDeclaration" targetNodeId="30.~ReflectionUtil.getConstant(jetbrains.mps.project.IModule,jetbrains.mps.smodel.SNode,java.lang.String):java.lang.Object" resolveInfo="getConstant" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1194439203655">
              <link role="variableDeclaration" targetNodeId="1194439199263" resolveInfo="module" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1185039112001">
              <link role="variableDeclaration" targetNodeId="1185039079872" resolveInfo="classifier" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1185039113956">
              <link role="variableDeclaration" targetNodeId="1185039098886" resolveInfo="name" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1194439199263">
        <property name="name" value="module" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1194440839686">
          <link role="classifier" targetNodeId="35.~IModule" resolveInfo="IModule" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1193389832000">
        <link role="classifier" targetNodeId="13.~Object" resolveInfo="Object" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1178192141185">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1178192141186" />
    </node>
    <node role="references" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodeReferentConstraint" id="1149181411824">
      <property name="searchScopeDescription" value="static fields from hierarchy of specified class" />
      <link role="applicableLink" targetNodeId="1.1070568178160" />
      <node role="searchScopeFactory" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_ReferentSearchScope_Factory" id="1149181411825">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1149181411826">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1189556501760">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977964352">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977962528">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunctionParameter_referenceNode" id="1189556501761" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1189556511625">
                  <link role="link" targetNodeId="1.1144433057691" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1189556516004">
                <link role="conceptMethodDeclaration" targetNodeId="1189552517057" resolveInfo="getVisibleMembersSearchScope" />
                <node role="actualArgument" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptParameter_ReferentSearchScope_enclosingNode" id="1189556622916" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1189556641105">
                  <link role="classifier" targetNodeId="10.~IClassifiersSearchScope" resolveInfo="IClassifiersSearchScope" />
                  <link role="variableDeclaration" targetNodeId="10.~IClassifiersSearchScope.STATIC_FIELD" resolveInfo="STATIC_FIELD" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="searchScopeCanCreate" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_ReferentSearchScope_CanCreate" id="1159221685532">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1159221685533">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1188435439827">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977966209">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977952317">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunctionParameter_referenceNode" id="1159221697371" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1159221697388">
                  <link role="link" targetNodeId="1.1144433057691" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNotNullOperation" id="1172010363955" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1178192141241">
    <property name="package" value="dotExpression_old" />
    <link role="concept" targetNodeId="1.1068580123163" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1185034069547">
      <property name="name" value="eval" />
      <link role="overriddenMethod" targetNodeId="1184884309598" resolveInfo="eval" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1185034069549">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1185034350516">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1185034350517">
            <property name="name" value="instance" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1185034350518">
              <link role="classifier" targetNodeId="13.~Object" resolveInfo="Object" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977966656">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977951980">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1185034340272" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1185034343042">
                  <link role="link" targetNodeId="1.1068580123164" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1185034344593">
                <link role="conceptMethodDeclaration" targetNodeId="1184884309598" resolveInfo="eval" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1194439168128">
                  <link role="variableDeclaration" targetNodeId="1194439165142" resolveInfo="module" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1185034100428">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1185034100429">
            <property name="name" value="method" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1185034100430">
              <link role="classifier" targetNodeId="28.~Method" resolveInfo="Method" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977963281">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977966244">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1185034093075" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1185034095751">
                  <link role="link" targetNodeId="1.1070568044740" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1185034097833">
                <link role="conceptMethodDeclaration" targetNodeId="1184949950947" resolveInfo="getMethod" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1194439169973">
                  <link role="variableDeclaration" targetNodeId="1194439165142" resolveInfo="module" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1185034110953">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1185034110954">
            <property name="name" value="actualArguments" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ArrayType" id="1185034110955">
              <node role="componentType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1185034110956">
                <link role="classifier" targetNodeId="13.~Object" resolveInfo="Object" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977953906">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1185034105495" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1185034107562">
                <link role="conceptMethodDeclaration" targetNodeId="1185033838760" resolveInfo="getActualArguments" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1194439171614">
                  <link role="variableDeclaration" targetNodeId="1194439165142" resolveInfo="module" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1185035959220">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1185035962472">
            <link role="baseMethodDeclaration" targetNodeId="30.~ReflectionUtil.invoke(java.lang.reflect.Method,java.lang.Object,java.lang.Object[]):java.lang.Object" resolveInfo="invoke" />
            <link role="classConcept" targetNodeId="30.~ReflectionUtil" resolveInfo="ReflectionUtil" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1185035965239">
              <link role="variableDeclaration" targetNodeId="1185034100429" resolveInfo="method" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1185035967897">
              <link role="variableDeclaration" targetNodeId="1185034350517" resolveInfo="instance" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1185035971196">
              <link role="variableDeclaration" targetNodeId="1185034110954" resolveInfo="actualArguments" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1194439165142">
        <property name="name" value="module" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1194440781446">
          <link role="classifier" targetNodeId="35.~IModule" resolveInfo="IModule" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1193389802417">
        <link role="classifier" targetNodeId="13.~Object" resolveInfo="Object" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1178192141242">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1178192141243" />
    </node>
    <node role="references" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodeReferentConstraint" id="1149206864868">
      <link role="applicableLink" targetNodeId="1.1070568044740" />
      <node role="searchScopeFactory" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_ReferentSearchScope_Factory" id="1149206864869">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1149206864870">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1149206864871">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1149206864872">
              <property name="name" value="instance" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1149206864873">
                <link role="concept" targetNodeId="1.1068431790191" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977954811">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunctionParameter_referenceNode" id="1149206864875" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1149206936561">
                  <link role="link" targetNodeId="1.1068580123164" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1179960832521">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1179960832522">
              <property name="name" value="classifierType" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1179960832523">
                <link role="concept" targetNodeId="1.1107535904670" />
              </node>
              <node role="initializer" type="jetbrains.mps.bootstrap.helgins.structure.CoerceStrongExpression" id="1179960832524">
                <node role="nodeToCoerce" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977956672">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1179960832527">
                    <link role="variableDeclaration" targetNodeId="1149206864872" resolveInfo="instance" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.helgins.structure.Node_TypeOperation" id="1179960832526" />
                </node>
                <node role="pattern" type="jetbrains.mps.bootstrap.helgins.structure.ConceptReference" id="1179960832528">
                  <property name="name" value="v1" />
                  <link role="concept" targetNodeId="1.1107535904670" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1190151837666">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1190151858199">
              <link role="baseMethodDeclaration" targetNodeId="32.~InstanceMethodCall_InstanceMethodScope.&lt;init&gt;(jetbrains.mps.baseLanguage.structure.ClassifierType,jetbrains.mps.smodel.SNode)" resolveInfo="InstanceMethodCall_InstanceMethodScope" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204672721833">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1190151937430">
                  <link role="variableDeclaration" targetNodeId="1179960832522" resolveInfo="classifierType" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAdapterOperation" id="1190151937427" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptParameter_ReferentSearchScope_enclosingNode" id="1210185690348" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1178192141296">
    <link role="concept" targetNodeId="1.1068581242866" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1178192141297">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1178192141298" />
    </node>
    <node role="references" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodeReferentConstraint" id="1149804506480">
      <link role="applicableLink" targetNodeId="1.1070568296581" />
      <node role="searchScopeFactory" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_ReferentSearchScope_Factory" id="1149804506481">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1149804506482">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1189816016931">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1149804528812">
              <link role="baseMethodDeclaration" targetNodeId="10.~LocalVariablesScope.&lt;init&gt;(jetbrains.mps.smodel.SNode)" resolveInfo="LocalVariablesScope" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptParameter_ReferentSearchScope_enclosingNode" id="1149804703732" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1178192141301">
    <property name="package" value="method.static" />
    <link role="concept" targetNodeId="1.1081236700937" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1184945458101">
      <property name="name" value="eval" />
      <link role="overriddenMethod" targetNodeId="1184884309598" resolveInfo="eval" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184945458103">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1184946709414">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1184946709415">
            <property name="name" value="method" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1184946709416">
              <link role="classifier" targetNodeId="28.~Method" resolveInfo="Method" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977966974">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977967666">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1184946700483" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1184946702643">
                  <link role="link" targetNodeId="1.1081236769987" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1184946705319">
                <link role="conceptMethodDeclaration" targetNodeId="1184949950947" resolveInfo="getMethod" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1194439107801">
                  <link role="variableDeclaration" targetNodeId="1194439050694" resolveInfo="module" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1184970547359">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1184970547360">
            <property name="name" value="actualArguments" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ArrayType" id="1184970547361">
              <node role="componentType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1184970547362">
                <link role="classifier" targetNodeId="13.~Object" resolveInfo="Object" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977963155">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1185033975358" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1185033977534">
                <link role="conceptMethodDeclaration" targetNodeId="1185033838760" resolveInfo="getActualArguments" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1194439127836">
                  <link role="variableDeclaration" targetNodeId="1194439050694" resolveInfo="module" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1185036528410">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1185036532084">
            <link role="baseMethodDeclaration" targetNodeId="30.~ReflectionUtil.staticInvoke(java.lang.reflect.Method,java.lang.Object[]):java.lang.Object" resolveInfo="staticInvoke" />
            <link role="classConcept" targetNodeId="30.~ReflectionUtil" resolveInfo="ReflectionUtil" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1185036534350">
              <link role="variableDeclaration" targetNodeId="1184946709415" resolveInfo="method" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1185036536071">
              <link role="variableDeclaration" targetNodeId="1184970547360" resolveInfo="actualArguments" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1194439050694">
        <property name="name" value="module" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1194440931972">
          <link role="classifier" targetNodeId="35.~IModule" resolveInfo="IModule" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1193389787195">
        <link role="classifier" targetNodeId="13.~Object" resolveInfo="Object" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1178192141302">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1178192141303" />
    </node>
    <node role="references" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodeReferentConstraint" id="1149183996828">
      <link role="applicableLink" targetNodeId="1.1081236769987" />
      <node role="searchScopeFactory" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_ReferentSearchScope_Factory" id="1149183996829">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1149183996830">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1190320970035">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1190320970036">
              <link role="baseMethodDeclaration" targetNodeId="32.~StaticMethodCall_StaticMethodScope.&lt;init&gt;(jetbrains.mps.baseLanguage.structure.ClassConcept,jetbrains.mps.smodel.SNode)" resolveInfo="StaticMethodCall_StaticMethodScope" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204672721297">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977957161">
                  <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunctionParameter_referenceNode" id="1190321010343" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1190321016191">
                    <link role="link" targetNodeId="1.1144433194310" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAdapterOperation" id="1190321021016" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptParameter_ReferentSearchScope_enclosingNode" id="1210185849241" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1178192141336">
    <property name="package" value="method.instance" />
    <link role="concept" targetNodeId="1.1073063089578" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1178192141337">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1178192141338" />
    </node>
    <node role="references" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodeReferentConstraint" id="1149122590093">
      <link role="applicableLink" targetNodeId="1.1073063089579" />
      <node role="searchScopeFactory" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_ReferentSearchScope_Factory" id="1149122590094">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1149122590095">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1149122818658">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1149122818659">
              <property name="name" value="enclosingClass" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1149122818661">
                <link role="concept" targetNodeId="1.1068390468198" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977968103">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptParameter_ReferentSearchScope_enclosingNode" id="1149122746917" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1171484236595">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Inclusion" id="1149122794546" />
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1149122800048">
                    <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1207781905937">
                      <link role="conceptDeclaration" targetNodeId="1.1068390468198" resolveInfo="ClassConcept" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1210188379055">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1210188384057">
              <link role="baseMethodDeclaration" targetNodeId="32.~SuperMethodCall_InstanceMethodScope.&lt;init&gt;(jetbrains.mps.baseLanguage.structure.ClassifierType,jetbrains.mps.smodel.SNode)" resolveInfo="SuperMethodCall_InstanceMethodScope" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210188553501">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210188489714">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210188487697">
                    <link role="variableDeclaration" targetNodeId="1149122818659" resolveInfo="enclosingClass" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1210188495451">
                    <link role="link" targetNodeId="1.1165602531693" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAdapterOperation" id="1210188554723" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptParameter_ReferentSearchScope_enclosingNode" id="1210188505672" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1178192141341">
    <link role="concept" targetNodeId="1.1153179560115" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1178192141342">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1178192141343" />
    </node>
    <node role="references" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodeReferentConstraint" id="1153180279818">
      <property name="searchScopeDescription" value="closure-parameters declaring in enclosing closure" />
      <link role="applicableLink" targetNodeId="1.1153179615652" />
      <node role="searchScopeFactory" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_ReferentSearchScope_Factory" id="1153180279819">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1153180279820">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1153180516000">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1153180516001">
              <property name="name" value="enclosingClosure" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1153180516002" />
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977963332">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptParameter_ReferentSearchScope_enclosingNode" id="1153180535541" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1171484331445">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Inclusion" id="1153180535543" />
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1153180535544">
                    <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1207781905992">
                      <link role="conceptDeclaration" targetNodeId="1.1152728232947" resolveInfo="Closure" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1153180547749">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1153180556173">
              <link role="baseMethodDeclaration" targetNodeId="5.~SimpleSearchScope.&lt;init&gt;(java.util.List)" resolveInfo="SimpleSearchScope" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977966039">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1153180581334">
                  <link role="variableDeclaration" targetNodeId="1153180516001" resolveInfo="enclosingClosure" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetChildrenOperation" id="1171501834503" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1178192141345">
    <link role="concept" targetNodeId="1.1083260308424" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1185034479585">
      <property name="name" value="eval" />
      <link role="overriddenMethod" targetNodeId="1184884309598" resolveInfo="eval" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1185034479587">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1185035405519">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1185035405520">
            <property name="name" value="enumClass" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1185035405521">
              <link role="concept" targetNodeId="1.1083245097125" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977967920">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1185035401374" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1185035403596">
                <link role="link" targetNodeId="1.1144432896254" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1185035431939">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1185035431940">
            <property name="name" value="name" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1185035431941">
              <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977956800">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977953983">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1185035424055" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1185035426544">
                  <link role="link" targetNodeId="1.1083260308426" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1185035428438">
                <link role="property" targetNodeId="1.1095257688468" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1185035483010">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1185035484903">
            <link role="classConcept" targetNodeId="30.~ReflectionUtil" resolveInfo="ReflectionUtil" />
            <link role="baseMethodDeclaration" targetNodeId="30.~ReflectionUtil.getEnum(jetbrains.mps.project.IModule,jetbrains.mps.smodel.SNode,java.lang.String):java.lang.Enum" resolveInfo="getEnum" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1194439193965">
              <link role="variableDeclaration" targetNodeId="1194439188447" resolveInfo="module" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1185035487029">
              <link role="variableDeclaration" targetNodeId="1185035405520" resolveInfo="enumClass" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1185035488953">
              <link role="variableDeclaration" targetNodeId="1185035431940" resolveInfo="name" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1194439188447">
        <property name="name" value="module" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1194440895674">
          <link role="classifier" targetNodeId="35.~IModule" resolveInfo="IModule" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1193389840909">
        <link role="classifier" targetNodeId="13.~Object" resolveInfo="Object" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1178192141346">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1178192141347" />
    </node>
    <node role="references" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodeReferentConstraint" id="1149184492381">
      <property name="searchScopeDescription" value="constants declared in the specified class" />
      <link role="applicableLink" targetNodeId="1.1083260308426" />
      <node role="searchScopeFactory" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_ReferentSearchScope_Factory" id="1149184492382">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1149184492383">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1189553047406">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977953910">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977957301">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunctionParameter_referenceNode" id="1189553047407" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1189553054240">
                  <link role="link" targetNodeId="1.1144432896254" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1189553061962">
                <link role="conceptMethodDeclaration" targetNodeId="1189552517057" resolveInfo="getVisibleMembersSearchScope" />
                <node role="actualArgument" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunctionParameter_referenceNode" id="1189553070870" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1189553078997">
                  <link role="classifier" targetNodeId="10.~IClassifiersSearchScope" resolveInfo="IClassifiersSearchScope" />
                  <link role="variableDeclaration" targetNodeId="10.~IClassifiersSearchScope.ENUM_CONSTANT" resolveInfo="ENUM_CONSTANT" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="searchScopeCanCreate" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_ReferentSearchScope_CanCreate" id="1159221831726">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1159221831727">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1189552953995">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1159221839783">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977965231">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunctionParameter_referenceNode" id="1159221837794" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1159221837795">
                  <link role="link" targetNodeId="1.1144432896254" />
                </node>
              </node>
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1159221837792" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1178192141358">
    <link role="concept" targetNodeId="1.1172008963197" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1178192141359">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1178192141360" />
    </node>
    <node role="references" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodeReferentConstraint" id="1172009356894">
      <link role="applicableLink" targetNodeId="1.1172008963202" />
      <node role="searchScopeFactory" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_ReferentSearchScope_Factory" id="1172009365333">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1172009365334">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1189556706616">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1189556706617">
              <property name="name" value="classifier" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1189556706618">
                <link role="concept" targetNodeId="1.1107461130800" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977963725">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptParameter_ReferentSearchScope_enclosingNode" id="1172010529074" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1172010294866">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1172010294867">
                    <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1207781905895">
                      <link role="conceptDeclaration" targetNodeId="1.1107461130800" resolveInfo="Classifier" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1189556738746">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977968419">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1189556738748">
                <link role="variableDeclaration" targetNodeId="1189556706617" resolveInfo="classifier" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1189556738749">
                <link role="conceptMethodDeclaration" targetNodeId="1189552517057" resolveInfo="getVisibleMembersSearchScope" />
                <node role="actualArgument" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptParameter_ReferentSearchScope_enclosingNode" id="1189556738750" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1189556738751">
                  <link role="classifier" targetNodeId="10.~IClassifiersSearchScope" resolveInfo="IClassifiersSearchScope" />
                  <link role="variableDeclaration" targetNodeId="10.~IClassifiersSearchScope.STATIC_FIELD" resolveInfo="STATIC_FIELD" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="searchScopeCanCreate" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_ReferentSearchScope_CanCreate" id="1172009372647">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1172009372648">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1189556690435">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977954324">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977955682">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptParameter_ReferentSearchScope_enclosingNode" id="1172010525020" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1172009464085">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1172009464086">
                    <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1207781905989">
                      <link role="conceptDeclaration" targetNodeId="1.1107461130800" resolveInfo="Classifier" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNotNullOperation" id="1172009452769" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1178192141395">
    <property name="package" value="method" />
    <link role="concept" targetNodeId="1.1068581242872" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1178192141396">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1178192141397" />
    </node>
    <node role="references" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodeReferentConstraint" id="1149122067639">
      <link role="applicableLink" targetNodeId="1.1135374435992" />
      <node role="searchScopeFactory" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_ReferentSearchScope_Factory" id="1149122067640">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1149122067641">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1188411626000">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1188411626001">
              <link role="baseMethodDeclaration" targetNodeId="32.~NewExpression_ClassConstructorScope.&lt;init&gt;(jetbrains.mps.baseLanguage.structure.NewExpression,jetbrains.mps.smodel.SModel,jetbrains.mps.smodel.IScope)" resolveInfo="NewExpression_ClassConstructorScope" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204672721329">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunctionParameter_referenceNode" id="1190137908849" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAdapterOperation" id="1190137913681" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.bootstrap.sharedConcepts.structure.ConceptFunctionParameter_model" id="1188411709999" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.sharedConcepts.structure.ConceptFunctionParameter_scope" id="1188411718501" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1178192141404">
    <property name="package" value="dotExpression_old" />
    <link role="concept" targetNodeId="1.1068580123158" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1178192141405">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1178192141406" />
    </node>
    <node role="references" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodeReferentConstraint" id="1149188104698">
      <property name="searchScopeDescription" value="fields declared in hierarhy of class specified by left expression. only applicable to expressions of classifier-type" />
      <link role="applicableLink" targetNodeId="1.1070568237987" />
      <node role="searchScopeFactory" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_ReferentSearchScope_Factory" id="1149188104699">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1149188104700">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1149190853409">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1149190853410">
              <property name="name" value="instance" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1149190853411">
                <link role="concept" targetNodeId="1.1068431790191" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977964943">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunctionParameter_referenceNode" id="1149190853413" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1149190853414">
                  <link role="link" targetNodeId="1.1080137532343" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1179960359444">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1179960359445">
              <property name="name" value="classifierType" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1179960359446">
                <link role="concept" targetNodeId="1.1107535904670" />
              </node>
              <node role="initializer" type="jetbrains.mps.bootstrap.helgins.structure.CoerceStrongExpression" id="1179960359447">
                <node role="nodeToCoerce" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977956158">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1179960359450">
                    <link role="variableDeclaration" targetNodeId="1149190853410" resolveInfo="instance" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.helgins.structure.Node_TypeOperation" id="1179960359449" />
                </node>
                <node role="pattern" type="jetbrains.mps.bootstrap.helgins.structure.ConceptReference" id="1179960359451">
                  <property name="name" value="v1" />
                  <link role="concept" targetNodeId="1.1107535904670" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1189546699121">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1189546704701">
              <link role="baseMethodDeclaration" targetNodeId="10.~VisibleClassifierMembersScope.&lt;init&gt;(jetbrains.mps.baseLanguage.structure.ClassifierType,jetbrains.mps.smodel.SNode,int)" resolveInfo="VisibleClassifierMembersScope" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204672721246">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1189546743190">
                  <link role="variableDeclaration" targetNodeId="1179960359445" resolveInfo="classifierType" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAdapterOperation" id="1189546750839" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptParameter_ReferentSearchScope_enclosingNode" id="1189546772515" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1189546784611">
                <link role="classifier" targetNodeId="10.~IClassifiersSearchScope" resolveInfo="IClassifiersSearchScope" />
                <link role="variableDeclaration" targetNodeId="10.~IClassifiersSearchScope.INSTANCE_FIELD" resolveInfo="INSTANCE_FIELD" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1196337942276">
      <property name="name" value="getVariableExpectedName" />
      <link role="overriddenMethod" targetNodeId="1187949494822" resolveInfo="getVariableExpectedName" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196337942278">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1196338013343">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1196338013344">
            <property name="name" value="expectedName" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196338013345">
              <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1196338043690" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1196338027964">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196338027965">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196338027966">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1196338027967">
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196338027968">
                  <link role="variableDeclaration" targetNodeId="1196338013344" resolveInfo="expectedName" />
                </node>
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977952056">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977965570">
                    <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1196338027971" />
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1196338027972">
                      <link role="link" targetNodeId="1.1070568237987" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1196338027973">
                    <link role="property" targetNodeId="1.1083152972671" resolveInfo="name" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977964008">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977965649">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1196338031381" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1196338033313">
                <link role="link" targetNodeId="1.1070568237987" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNotNullOperation" id="1196338034902" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196338037267">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1196338037268">
            <link role="variableDeclaration" targetNodeId="1196338013344" resolveInfo="expectedName" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196337952140">
        <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1178192141413">
    <property name="package" value="method" />
    <link role="concept" targetNodeId="1.1068581242874" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1178192141414">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1178192141415" />
    </node>
    <node role="references" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodeReferentConstraint" id="1149811192494">
      <property name="searchScopeDescription" value="parameters declared in enclosing method" />
      <link role="applicableLink" targetNodeId="1.1070567982819" />
      <node role="searchScopeFactory" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_ReferentSearchScope_Factory" id="1149811192495">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1149811192496">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1176797757202">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1176797757203">
              <property name="name" value="methods" />
              <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1176797757204">
                <node role="elementType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1176797759749">
                  <link role="concept" targetNodeId="1.1068580123132" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977957137">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptParameter_ReferentSearchScope_enclosingNode" id="1176797772746" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorsOperation" id="1176797778638">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Inclusion" id="1176797780929" />
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1176797785392">
                    <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1207781905979">
                      <link role="conceptDeclaration" targetNodeId="1.1068580123132" resolveInfo="BaseMethodDeclaration" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1176797799883">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1176797799884">
              <property name="name" value="params" />
              <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1176797799885">
                <node role="elementType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1176797802636">
                  <link role="concept" targetNodeId="1.1068498886292" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1176797813607">
                <node role="creator" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListCreatorWithInit" id="1176797815157">
                  <node role="elementType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1176797817389">
                    <link role="concept" targetNodeId="1.1068498886292" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1176797825565">
            <node role="iterable" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1176797833003">
              <link role="variableDeclaration" targetNodeId="1176797757203" resolveInfo="methods" />
            </node>
            <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1176797825567">
              <property name="name" value="bmd" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1176797827495">
                <link role="concept" targetNodeId="1.1068580123132" />
              </node>
            </node>
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1176797825569">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1176797835358">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206572405654">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1176797835359">
                    <link role="variableDeclaration" targetNodeId="1176797799884" resolveInfo="params" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddAllElementsOperation" id="1176797839060">
                    <node role="argument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977964509">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1176797842075">
                        <link role="variableDeclaration" targetNodeId="1176797825567" resolveInfo="bmd" />
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1176797847874">
                        <link role="link" targetNodeId="1.1068580123134" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1149811304899">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1149811407869">
              <link role="baseMethodDeclaration" targetNodeId="5.~SimpleSearchScope.&lt;init&gt;(java.util.List)" resolveInfo="SimpleSearchScope" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1176797856870">
                <link role="variableDeclaration" targetNodeId="1176797799884" resolveInfo="params" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1178551970215">
    <link role="concept" targetNodeId="1.1116615150612" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1178551970216">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1178551970217" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1178571253851">
    <property name="package" value="conceptFunction" />
    <link role="concept" targetNodeId="1.1137021947720" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1199888241493">
      <property name="name" value="usesParameterObjectFor" />
      <property name="isVirtual" value="true" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1199888246278" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1199888241495">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1199888265502">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977956160">
            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1199888266832" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptPropertyAccess" id="1199888269039">
              <link role="conceptProperty" targetNodeId="1.1199874763892" resolveInfo="usesParameterObject" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1199888256671">
        <property name="name" value="parameter" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1199888256672">
          <link role="concept" targetNodeId="1.1107135704075" resolveInfo="ConceptFunctionParameter" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1178571276073">
      <property name="isVirtual" value="true" />
      <property name="name" value="getExpectedReturnType" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1197576063831">
        <link role="concept" targetNodeId="1.1068431790189" resolveInfo="Type" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1178571276075">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1178571550000">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206572405216">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977955876">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1178571571299" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptLinkAccess" id="1178571606129">
                <link role="conceptLinkDeclaration" targetNodeId="1.1137545148427" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetFirstOperation" id="1178571627999" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1197312191473">
      <property name="name" value="getParameters" />
      <property name="isVirtual" value="true" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1197312202845">
        <node role="elementType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptType" id="1197312657539">
          <link role="conceptDeclaraton" targetNodeId="1.1107135704075" resolveInfo="ConceptFunctionParameter" />
        </node>
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197312191475">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1197312396370">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1197312396371">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1197312396372" />
            <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1197312414745" />
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197312396374">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1197312396375">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1197312450311">
                <node role="creator" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListCreatorWithInit" id="1197312450312">
                  <node role="elementType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptType" id="1197312668602">
                    <link role="conceptDeclaraton" targetNodeId="1.1107135704075" resolveInfo="ConceptFunctionParameter" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1197312396364">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1197312396365">
            <property name="name" value="result" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1197312396366">
              <link role="elementConcept" targetNodeId="37.1071489090640" resolveInfo="ConceptDeclaration" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1197312396367">
              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListCreator" id="1197312396368">
                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1197312396369">
                  <link role="elementConcept" targetNodeId="37.1071489090640" resolveInfo="ConceptDeclaration" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1197312396377">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206572405789">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1197312396379">
              <link role="variableDeclaration" targetNodeId="1197312396365" resolveInfo="result" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddAllElementsOperation" id="1197312396380">
              <node role="argument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977966424">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1197312426871" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptLinkAccess" id="1197312396382">
                  <link role="conceptLinkDeclaration" targetNodeId="1.1137546998352" resolveInfo="conceptFunctionParameter" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1197312396384">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206572405332">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1197312396386">
              <link role="variableDeclaration" targetNodeId="1197312396365" resolveInfo="result" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddAllElementsOperation" id="1197312396387">
              <node role="argument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977968229">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1197312434653" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptLinkAccess" id="1197312396389">
                  <link role="conceptLinkDeclaration" targetNodeId="1.1161119487665" resolveInfo="applicableConceptFunctionParameter" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1197312714995">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1197312732139">
            <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1197312732140">
              <node role="elementType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptType" id="1197312732141">
                <link role="conceptDeclaraton" targetNodeId="1.1107135704075" resolveInfo="ConceptFunctionParameter" />
              </node>
            </node>
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1197312732142">
              <link role="variableDeclaration" targetNodeId="1197312396365" resolveInfo="result" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1178571253852">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1178571253853" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1178610164825">
    <property name="package" value="classConcept" />
    <link role="concept" targetNodeId="1.1068390468198" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1194954280187">
      <property name="name" value="getMembers" />
      <link role="overriddenMethod" targetNodeId="1194952456574" resolveInfo="getMembers" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194954280189">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1194954337830">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1194954337831">
            <property name="name" value="members" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1194954337832" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977964511">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.SuperNodeExpression" id="1194954346623" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1194954351051">
                <link role="conceptMethodDeclaration" targetNodeId="1194952456574" resolveInfo="getMembers" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194954740989">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206572405787">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1194954740990">
              <link role="variableDeclaration" targetNodeId="1194954337831" resolveInfo="members" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddAllElementsOperation" id="1194954743229">
              <node role="argument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977965495">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1194954745799" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1194954755286">
                  <link role="link" targetNodeId="1.1068390468199" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194954757805">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206572405871">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1194954757808">
              <link role="variableDeclaration" targetNodeId="1194954337831" resolveInfo="members" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddAllElementsOperation" id="1194954757809">
              <node role="argument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977955278">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1194954757812" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1194954762412">
                  <link role="link" targetNodeId="1.1070462273904" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194954758176">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206572405699">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1194954758178">
              <link role="variableDeclaration" targetNodeId="1194954337831" resolveInfo="members" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddAllElementsOperation" id="1194954758179">
              <node role="argument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977966607">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1194954758182" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1194954768102">
                  <link role="link" targetNodeId="1.1068390468201" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194954758701">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206572405615">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1194954758703">
              <link role="variableDeclaration" targetNodeId="1194954337831" resolveInfo="members" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddAllElementsOperation" id="1194954758704">
              <node role="argument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977967608">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1194954758707" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1194954781243">
                  <link role="link" targetNodeId="1.1178616825527" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194954375589">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1194954375590">
            <link role="variableDeclaration" targetNodeId="1194954337831" resolveInfo="members" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1194954290879" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1199631877012">
      <property name="name" value="isDescendant" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1199631887875" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1199631877014">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1204906830590">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1204906830591">
            <property name="name" value="namesAreSame" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1204906830592" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1204906820132">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204906820133">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1204906864534">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204906864535">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204906877649">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1204906879299">
                    <node role="rValue" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1204906880904">
                      <property name="value" value="false" />
                    </node>
                    <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204906877650">
                      <link role="variableDeclaration" targetNodeId="1204906830591" resolveInfo="namesAreSame" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1204906873418">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1204906874468" />
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204906869696">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1204906868312">
                    <link role="variableDeclaration" targetNodeId="1199631932658" resolveInfo="classToCompare" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1204906871721">
                    <link role="conceptMethodDeclaration" targetNodeId="36.1184686272576" resolveInfo="getFqName" />
                  </node>
                </node>
              </node>
              <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1204906883648">
                <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204906883649">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204907009508">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1204907013034">
                      <node role="rValue" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1204907672436">
                        <property name="value" value="true" />
                      </node>
                      <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204907009509">
                        <link role="variableDeclaration" targetNodeId="1204906830591" resolveInfo="namesAreSame" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1204906856749">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1204906858525" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204906851089">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1204906850408" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1204906854740">
                <link role="conceptMethodDeclaration" targetNodeId="36.1184686272576" resolveInfo="getFqName" />
              </node>
            </node>
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1204907003558">
            <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204907003559">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204907006724">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1204907006725">
                  <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204907006726">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204907006727">
                      <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1204907006728" />
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1204907006729">
                        <link role="conceptMethodDeclaration" targetNodeId="36.1184686272576" resolveInfo="getFqName" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204907006730">
                      <link role="baseMethodDeclaration" targetNodeId="13.~String.equals(java.lang.Object):boolean" resolveInfo="equals" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204907006731">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1204907006732">
                          <link role="variableDeclaration" targetNodeId="1199631932658" resolveInfo="classToCompare" />
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1204907006733">
                          <link role="conceptMethodDeclaration" targetNodeId="36.1184686272576" resolveInfo="getFqName" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204907006734">
                    <link role="variableDeclaration" targetNodeId="1204906830591" resolveInfo="namesAreSame" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1199631940504">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1199631940506">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1199632470293">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1199632472655">
                <property name="value" value="true" />
              </node>
            </node>
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1199632490094">
            <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1199632490095">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1199632528007">
                <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1199632570265">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1199632572393" />
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977956205">
                    <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1199632536479" />
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1199633668646">
                      <link role="link" targetNodeId="1.1165602531693" />
                    </node>
                  </node>
                </node>
                <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1199632528009">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1199632574894">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1199632580177">
                      <property name="value" value="false" />
                    </node>
                  </node>
                </node>
                <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1199632583336">
                  <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1199632583337">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1199632587291">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977955738">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977967382">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977965160">
                            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1199632600262" />
                            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1199633674990">
                              <link role="link" targetNodeId="1.1165602531693" />
                            </node>
                          </node>
                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1199634141224">
                            <link role="link" targetNodeId="1.1107535924139" />
                          </node>
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1199632609348">
                          <link role="conceptMethodDeclaration" targetNodeId="1199631877012" resolveInfo="isAncestor" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1199632612911">
                            <link role="variableDeclaration" targetNodeId="1199631932658" resolveInfo="class" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204906922630">
            <link role="variableDeclaration" targetNodeId="1204906830591" resolveInfo="namesAreSame" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1199631932658">
        <property name="name" value="classToCompare" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1199631932659">
          <link role="concept" targetNodeId="1.1068390468198" resolveInfo="ClassConcept" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1205837873246">
      <property name="name" value="getMainMethod" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1205837886806">
        <link role="concept" targetNodeId="1.1081236700938" resolveInfo="StaticMethodDeclaration" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205837873248">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1205837916182">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205837935887">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205837927169">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205837921937">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1205837921159" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1205837926019">
                  <link role="link" targetNodeId="1.1070462273904" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.WhereOperation" id="1205837929329">
                <node role="whereClosure" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.WhereBlock" id="1205837929330">
                  <node role="defaultInputElement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.DefaultInputElement" id="1205837929331">
                    <property name="name" value="it" />
                  </node>
                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205837929332">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1205839440205">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205839441651">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.ClosureParameterReference" id="1205839440206">
                          <link role="closureParameter" targetNodeId="1205837929331" resolveInfo="it" />
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1205839445757">
                          <link role="conceptMethodDeclaration" targetNodeId="1205839403910" resolveInfo="isMainMethod" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetFirstOperation" id="1205837937950" />
          </node>
        </node>
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1178610164826">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1178610164827" />
    </node>
    <node role="defaultScope" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodeDefaultSearchScope" id="1188504964018">
      <property name="description" value="visible classes from model and imported models" />
      <node role="searchScopeFactory" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_ReferentSearchScope_Factory" id="1188504964019">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1188504964020">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1188504997131">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1188504997132">
              <link role="baseMethodDeclaration" targetNodeId="10.~VisibleClassifiersScope.&lt;init&gt;(jetbrains.mps.smodel.SModel,int,jetbrains.mps.smodel.IScope)" resolveInfo="VisibleClassifiersScope" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.sharedConcepts.structure.ConceptFunctionParameter_model" id="1188504997133" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1188504997134">
                <link role="classifier" targetNodeId="10.~IClassifiersSearchScope" resolveInfo="IClassifiersSearchScope" />
                <link role="variableDeclaration" targetNodeId="10.~IClassifiersSearchScope.CLASS" resolveInfo="CLASS" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.bootstrap.sharedConcepts.structure.ConceptFunctionParameter_scope" id="1188504997135" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1182417073821">
    <property name="package" value="type.primitive" />
    <link role="concept" targetNodeId="1.1164118113764" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1195229619668">
      <property name="name" value="getPresentation" />
      <link role="overriddenMethod" targetNodeId="36.1180102203531" resolveInfo="getPresentation" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1195229619670">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1195229628331">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977966995">
            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1195229628974" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptPropertyAccess" id="1195229631401">
              <link role="conceptProperty" targetNodeId="2.1137473891462" resolveInfo="alias" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1199316500876">
        <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1182417078683">
      <property name="name" value="getVariableSuffixes" />
      <link role="overriddenMethod" targetNodeId="1182416669983" resolveInfo="getVariableSuffixes" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1182417078685">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1182417114658">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1182417114659">
            <node role="creator" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListCreatorWithInit" id="1182417115739">
              <node role="initValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332444438">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977965540">
                  <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1182417121619" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptPropertyAccess" id="1199306620363">
                    <link role="conceptProperty" targetNodeId="2.1137473891462" resolveInfo="alias" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332444439">
                  <link role="baseMethodDeclaration" targetNodeId="13.~String.substring(int,int):java.lang.String" resolveInfo="substring" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1182417166696">
                    <property name="value" value="0" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1182417168510">
                    <property name="value" value="1" />
                  </node>
                </node>
              </node>
              <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1182417118259">
                <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1190026804808">
        <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1190026804809">
          <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1193670576127">
      <property name="name" value="getJavaType" />
      <link role="overriddenMethod" targetNodeId="1193670432254" resolveInfo="getJavaType" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1193670576129">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1193670582537">
          <node role="expression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1193670584024" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1193670580458">
        <link role="concept" targetNodeId="1.1068431790189" resolveInfo="Type" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1182417073822">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1182417073823" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1182580680652">
    <property name="package" value="type.primitive" />
    <link role="concept" targetNodeId="1.1070534370425" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1182580682186">
      <property name="name" value="getUnboxedType" />
      <link role="overriddenMethod" targetNodeId="1182580547590" resolveInfo="getUnboxedType" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1182580682188">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1182580695426">
          <node role="expression" type="jetbrains.mps.quotation.structure.Quotation" id="1196777956919">
            <node role="quotedNode" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196777956920">
              <link role="classifier" targetNodeId="13.~Integer" resolveInfo="Integer" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1190026804810">
        <link role="concept" targetNodeId="1.1068431790189" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1194035797540">
      <property name="name" value="getClassExpression" />
      <link role="overriddenMethod" targetNodeId="1194035415601" resolveInfo="getClassExpression" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194035797542">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194035804310">
          <node role="expression" type="jetbrains.mps.quotation.structure.Quotation" id="1196777962270">
            <node role="quotedNode" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1196777962271">
              <link role="classifier" targetNodeId="13.~Integer" resolveInfo="Integer" />
              <link role="variableDeclaration" targetNodeId="13.~Integer.TYPE" resolveInfo="TYPE" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1194035801074">
        <link role="concept" targetNodeId="1.1068431790191" resolveInfo="Expression" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1182580680653">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1182580680654" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1182580714619">
    <property name="package" value="type.primitive" />
    <link role="concept" targetNodeId="1.1070534644030" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1182580716122">
      <property name="name" value="getUnboxedType" />
      <link role="overriddenMethod" targetNodeId="1182580547590" resolveInfo="getUnboxedType" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1182580716124">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1182580724549">
          <node role="expression" type="jetbrains.mps.quotation.structure.Quotation" id="1196777962272">
            <node role="quotedNode" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196777962273">
              <link role="classifier" targetNodeId="13.~Boolean" resolveInfo="Boolean" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1190026804811">
        <link role="concept" targetNodeId="1.1068431790189" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1194035682753">
      <property name="name" value="getClassExpression" />
      <link role="overriddenMethod" targetNodeId="1194035415601" resolveInfo="getClassExpression" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194035682755">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194035693648">
          <node role="expression" type="jetbrains.mps.quotation.structure.Quotation" id="1196777962274">
            <node role="quotedNode" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1196777962275">
              <link role="classifier" targetNodeId="13.~Boolean" resolveInfo="Boolean" />
              <link role="variableDeclaration" targetNodeId="13.~Boolean.TYPE" resolveInfo="TYPE" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1194035688631">
        <link role="concept" targetNodeId="1.1068431790191" resolveInfo="Expression" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1182580714620">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1182580714621" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1182580731555">
    <property name="package" value="type.primitive" />
    <link role="concept" targetNodeId="1.1070534604311" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1182580733121">
      <property name="name" value="getUnboxedType" />
      <link role="overriddenMethod" targetNodeId="1182580547590" resolveInfo="getUnboxedType" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1182580733123">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1182580741298">
          <node role="expression" type="jetbrains.mps.quotation.structure.Quotation" id="1196777962276">
            <node role="quotedNode" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196777962277">
              <link role="classifier" targetNodeId="13.~Byte" resolveInfo="Byte" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1190026804812">
        <link role="concept" targetNodeId="1.1068431790189" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1194035710623">
      <property name="name" value="getClassExpression" />
      <link role="overriddenMethod" targetNodeId="1194035415601" resolveInfo="getClassExpression" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194035710625">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194035720830">
          <node role="expression" type="jetbrains.mps.quotation.structure.Quotation" id="1196777962278">
            <node role="quotedNode" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1196777962279">
              <link role="classifier" targetNodeId="13.~Byte" resolveInfo="Byte" />
              <link role="variableDeclaration" targetNodeId="13.~Byte.TYPE" resolveInfo="TYPE" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1194035717314">
        <link role="concept" targetNodeId="1.1068431790191" resolveInfo="Expression" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1182580731556">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1182580731557" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1182580749554">
    <property name="package" value="type.primitive" />
    <link role="concept" targetNodeId="1.1070534555686" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1182580751166">
      <property name="name" value="getUnboxedType" />
      <link role="overriddenMethod" targetNodeId="1182580547590" resolveInfo="getUnboxedType" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1182580751168">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1182580759015">
          <node role="expression" type="jetbrains.mps.quotation.structure.Quotation" id="1196777962280">
            <node role="quotedNode" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196777962281">
              <link role="classifier" targetNodeId="13.~Character" resolveInfo="Character" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1190026804813">
        <link role="concept" targetNodeId="1.1068431790189" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1194035735040">
      <property name="name" value="getClassExpression" />
      <link role="overriddenMethod" targetNodeId="1194035415601" resolveInfo="getClassExpression" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194035735042">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194035745310">
          <node role="expression" type="jetbrains.mps.quotation.structure.Quotation" id="1196777962282">
            <node role="quotedNode" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1196777962283">
              <link role="classifier" targetNodeId="13.~Character" resolveInfo="Character" />
              <link role="variableDeclaration" targetNodeId="13.~Character.TYPE" resolveInfo="TYPE" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1194035742043">
        <link role="concept" targetNodeId="1.1068431790191" resolveInfo="Expression" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1182580749555">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1182580749556" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1182580774458">
    <property name="package" value="type.primitive" />
    <link role="concept" targetNodeId="1.1070534513062" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1182580775742">
      <property name="name" value="getUnboxedType" />
      <link role="overriddenMethod" targetNodeId="1182580547590" resolveInfo="getUnboxedType" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1182580775744">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1182580783201">
          <node role="expression" type="jetbrains.mps.quotation.structure.Quotation" id="1196777962284">
            <node role="quotedNode" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196777962285">
              <link role="classifier" targetNodeId="13.~Double" resolveInfo="Double" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1190026804814">
        <link role="concept" targetNodeId="1.1068431790189" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1194035760941">
      <property name="name" value="getClassExpression" />
      <link role="overriddenMethod" targetNodeId="1194035415601" resolveInfo="getClassExpression" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194035760943">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194035770570">
          <node role="expression" type="jetbrains.mps.quotation.structure.Quotation" id="1196777962286">
            <node role="quotedNode" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1196777962287">
              <link role="classifier" targetNodeId="13.~Double" resolveInfo="Double" />
              <link role="variableDeclaration" targetNodeId="13.~Double.TYPE" resolveInfo="TYPE" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1194035764726">
        <link role="concept" targetNodeId="1.1068431790191" resolveInfo="Expression" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1182580774459">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1182580774460" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1182580792347">
    <property name="package" value="type.primitive" />
    <link role="concept" targetNodeId="1.1070534436861" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1182580793788">
      <property name="name" value="getUnboxedType" />
      <link role="overriddenMethod" targetNodeId="1182580547590" resolveInfo="getUnboxedType" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1182580793790">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1182580799574">
          <node role="expression" type="jetbrains.mps.quotation.structure.Quotation" id="1196777962288">
            <node role="quotedNode" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196777962289">
              <link role="classifier" targetNodeId="13.~Float" resolveInfo="Float" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1190026804815">
        <link role="concept" targetNodeId="1.1068431790189" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1194035783171">
      <property name="name" value="getClassExpression" />
      <link role="overriddenMethod" targetNodeId="1194035415601" resolveInfo="getClassExpression" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194035783173">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194035785611">
          <node role="expression" type="jetbrains.mps.quotation.structure.Quotation" id="1196777962306">
            <node role="quotedNode" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1196777962307">
              <link role="classifier" targetNodeId="13.~Float" resolveInfo="Float" />
              <link role="variableDeclaration" targetNodeId="13.~Float.TYPE" resolveInfo="TYPE" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1194035916411">
        <link role="concept" targetNodeId="1.1068431790191" resolveInfo="Expression" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1182580792348">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1182580792349" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1182580809252">
    <property name="package" value="type.primitive" />
    <link role="concept" targetNodeId="1.1068581242867" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1182580810489">
      <property name="name" value="getUnboxedType" />
      <link role="overriddenMethod" targetNodeId="1182580547590" resolveInfo="getUnboxedType" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1182580810491">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1182580816979">
          <node role="expression" type="jetbrains.mps.quotation.structure.Quotation" id="1196777962308">
            <node role="quotedNode" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196777962309">
              <link role="classifier" targetNodeId="13.~Long" resolveInfo="Long" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1190026804816">
        <link role="concept" targetNodeId="1.1068431790189" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1194035817879">
      <property name="name" value="getClassExpression" />
      <link role="overriddenMethod" targetNodeId="1194035415601" resolveInfo="getClassExpression" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194035817881">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194035825586">
          <node role="expression" type="jetbrains.mps.quotation.structure.Quotation" id="1196777962310">
            <node role="quotedNode" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1196777962311">
              <link role="classifier" targetNodeId="13.~Integer" resolveInfo="Integer" />
              <link role="variableDeclaration" targetNodeId="13.~Integer.TYPE" resolveInfo="TYPE" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1194035822382">
        <link role="concept" targetNodeId="1.1068431790191" resolveInfo="Expression" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1182580809253">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1182580809254" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1182580828906">
    <property name="package" value="type.primitive" />
    <link role="concept" targetNodeId="1.1070533982221" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1182580830253">
      <property name="name" value="getUnboxedType" />
      <link role="overriddenMethod" targetNodeId="1182580547590" resolveInfo="getUnboxedType" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1182580830255">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1182580838055">
          <node role="expression" type="jetbrains.mps.quotation.structure.Quotation" id="1196777962312">
            <node role="quotedNode" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1196777962313">
              <link role="classifier" targetNodeId="13.~Short" resolveInfo="Short" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1190026804817">
        <link role="concept" targetNodeId="1.1068431790189" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1194035837624">
      <property name="name" value="getClassExpression" />
      <link role="overriddenMethod" targetNodeId="1194035415601" resolveInfo="getClassExpression" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194035837626">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194035847961">
          <node role="expression" type="jetbrains.mps.quotation.structure.Quotation" id="1196777962314">
            <node role="quotedNode" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1196777962315">
              <link role="classifier" targetNodeId="13.~Short" resolveInfo="Short" />
              <link role="variableDeclaration" targetNodeId="13.~Short.TYPE" resolveInfo="TYPE" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1194035842955">
        <link role="concept" targetNodeId="1.1068431790191" resolveInfo="Expression" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1182580828907">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1182580828908" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1182955301909">
    <link role="concept" targetNodeId="1.1070475354124" />
    <node role="references" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodeReferentConstraint" id="1182955306411">
      <link role="applicableLink" targetNodeId="1.1182955020723" />
      <node role="searchScopeFactory" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_ReferentSearchScope_Factory" id="1182955310831">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1182955310832">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1182955331571">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1182955331572">
              <link role="baseMethodDeclaration" targetNodeId="5.~SimpleSearchScope.&lt;init&gt;(java.util.List)" resolveInfo="SimpleSearchScope" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977956386">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptParameter_ReferentSearchScope_enclosingNode" id="1182955371700" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorsOperation" id="1182955376160">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1182955380079">
                    <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1207781906002">
                      <link role="conceptDeclaration" targetNodeId="1.1068390468198" resolveInfo="ClassConcept" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1182955301910">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1182955301911" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1184160780378">
    <link role="concept" targetNodeId="1.1068390468200" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1184160785366">
      <property name="name" value="getGetterName" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1184160793087">
        <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184160785368">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1208781583338">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1208781583339">
            <property name="name" value="prefix" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208781583340">
              <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1208781583341">
              <property name="value" value="get" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1208781604657">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208781604658">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1208781660027">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1208781662265">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1208781663504">
                  <property name="value" value="is" />
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208781660028">
                  <link role="variableDeclaration" targetNodeId="1208781583339" resolveInfo="prefix" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.bootstrap.helgins.structure.IsSubtypeExpression" id="1208781637591">
            <node role="subtypeExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208781640510">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1208781640511" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1208781640512">
                <link role="link" targetNodeId="1.1068431790188" />
              </node>
            </node>
            <node role="supertypeExpression" type="jetbrains.mps.quotation.structure.Quotation" id="1208781644992">
              <node role="quotedNode" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1208781655422" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1184161090833">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1184161093376">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1184161104647">
              <link role="baseMethodDeclaration" targetNodeId="3.~NameUtil.capitalize(java.lang.String):java.lang.String" resolveInfo="capitalize" />
              <link role="classConcept" targetNodeId="3.~NameUtil" resolveInfo="NameUtil" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977963309">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1184161111377" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1184161113469">
                  <link role="property" targetNodeId="1.1083152972671" />
                </node>
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208781583344">
              <link role="variableDeclaration" targetNodeId="1208781583339" resolveInfo="prefix" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1184161255813">
      <property name="name" value="hasGetter" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1184161257706" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184161255815">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1184161335712">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1184161335713">
            <property name="name" value="fieldDeclaration" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1184161335714">
              <link role="concept" targetNodeId="1.1068390468200" />
            </node>
            <node role="initializer" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1184161353423" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1184161301709">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206572405623">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206572405350">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977964947">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1184161473290">
                  <link role="variableDeclaration" targetNodeId="1184161451990" resolveInfo="classConcept" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1184161320005">
                  <link role="link" targetNodeId="1.1107880067339" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.WhereOperation" id="1184161325020">
                <node role="whereClosure" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.WhereBlock" id="1184161325021">
                  <node role="defaultInputElement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.DefaultInputElement" id="1184161325022">
                    <property name="name" value="it" />
                  </node>
                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184161325023">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1184161360288">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977962530">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1184161360289">
                          <link role="variableDeclaration" targetNodeId="1184161335713" resolveInfo="fieldDeclaration" />
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1184161373195">
                          <link role="conceptMethodDeclaration" targetNodeId="1184160814686" resolveInfo="isGetter" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ClosureParameterReference" id="1184161380531">
                            <link role="closureParameter" targetNodeId="1184161325022" resolveInfo="it" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.IsNotEmptyOperation" id="1184161393794" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1184161451990">
        <property name="name" value="classConcept" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1184161451991">
          <link role="concept" targetNodeId="1.1068390468198" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1184160814686">
      <property name="name" value="isGetter" />
      <property name="isPrivate" value="true" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1184160817392" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184160814688">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1184160868084">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1184160905218">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1184160939395">
              <node role="rightExpression" type="jetbrains.mps.bootstrap.helgins.structure.IsSubtypeExpression" id="1184160953322">
                <node role="subtypeExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977954632">
                  <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1184160958608" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1184160962022">
                    <link role="link" targetNodeId="1.1068431790188" />
                  </node>
                </node>
                <node role="supertypeExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977954072">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1184160968478">
                    <link role="variableDeclaration" targetNodeId="1184160831425" resolveInfo="method" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1184160971549">
                    <link role="link" targetNodeId="1.1068580123133" />
                  </node>
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332444535">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977963673">
                  <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1184160908268" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1184160911414">
                    <link role="conceptMethodDeclaration" targetNodeId="1184160785366" resolveInfo="getGetterName" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332444536">
                  <link role="baseMethodDeclaration" targetNodeId="13.~String.equals(java.lang.Object):boolean" resolveInfo="equals" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977967644">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1184160918690">
                      <link role="variableDeclaration" targetNodeId="1184160831425" resolveInfo="method" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1184160920555">
                      <link role="property" targetNodeId="1.1083152972672" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206572405376">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977967380">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1184160868085">
                  <link role="variableDeclaration" targetNodeId="1184160831425" resolveInfo="method" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1184160890019">
                  <link role="link" targetNodeId="1.1068580123134" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.IsEmptyOperation" id="1184160903810" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1184160831425">
        <property name="name" value="method" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1184160831426">
          <link role="concept" targetNodeId="1.1068580123165" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1184160800181">
      <property name="name" value="getSetterName" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1184160801966">
        <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184160800183">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1184161121190">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1184161121191">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1184161121192">
              <link role="baseMethodDeclaration" targetNodeId="3.~NameUtil.capitalize(java.lang.String):java.lang.String" resolveInfo="capitalize" />
              <link role="classConcept" targetNodeId="3.~NameUtil" resolveInfo="NameUtil" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977956367">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1184161121195" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1184161131175">
                  <link role="property" targetNodeId="1.1083152972671" />
                </node>
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1184161121196">
              <property name="value" value="set" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1184161485385">
      <property name="name" value="hasSetter" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1184161485386" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184161485387">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1184161485388">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1184161485389">
            <property name="name" value="fieldDeclaration" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1184161485390">
              <link role="concept" targetNodeId="1.1068390468200" />
            </node>
            <node role="initializer" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1184161485391" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1184161485392">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206572405435">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206572405782">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977954713">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1184161485397">
                  <link role="variableDeclaration" targetNodeId="1184161485408" resolveInfo="classConcept" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1184161485396">
                  <link role="link" targetNodeId="1.1107880067339" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.WhereOperation" id="1184161485398">
                <node role="whereClosure" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.WhereBlock" id="1184161485399">
                  <node role="defaultInputElement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.DefaultInputElement" id="1184161485400">
                    <property name="name" value="it" />
                  </node>
                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184161485401">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1184161485402">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977966895">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1184161485406">
                          <link role="variableDeclaration" targetNodeId="1184161485389" resolveInfo="fieldDeclaration" />
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1184161485404">
                          <link role="conceptMethodDeclaration" targetNodeId="1184160852031" resolveInfo="isSetter" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ClosureParameterReference" id="1184161485405">
                            <link role="closureParameter" targetNodeId="1184161485400" resolveInfo="it" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.IsNotEmptyOperation" id="1184161485407" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1184161485408">
        <property name="name" value="classConcept" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1184161485409">
          <link role="concept" targetNodeId="1.1068390468198" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1184160852031">
      <property name="name" value="isSetter" />
      <property name="isPrivate" value="true" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1184160852032" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184160852033">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1184160927410">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1184160927411">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1184160997864">
              <node role="rightExpression" type="jetbrains.mps.bootstrap.helgins.structure.IsSubtypeExpression" id="1184161001103">
                <node role="subtypeExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977962991">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206572405354">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977964815">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1184161014020">
                        <link role="variableDeclaration" targetNodeId="1184160852034" resolveInfo="method" />
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1184161017372">
                        <link role="link" targetNodeId="1.1068580123134" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetFirstOperation" id="1184161020866" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1184161027886">
                    <link role="link" targetNodeId="1.1068431790188" />
                  </node>
                </node>
                <node role="supertypeExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977951958">
                  <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1184161030892" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1184161034765">
                    <link role="link" targetNodeId="1.1068431790188" />
                  </node>
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332444372">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977956729">
                  <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1184160927415" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1184160927414">
                    <link role="conceptMethodDeclaration" targetNodeId="1184160800181" resolveInfo="getSetterName" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332444373">
                  <link role="baseMethodDeclaration" targetNodeId="13.~String.equals(java.lang.Object):boolean" resolveInfo="equals" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977967043">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1184160927418">
                      <link role="variableDeclaration" targetNodeId="1184160852034" resolveInfo="method" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1184160994826">
                      <link role="property" targetNodeId="1.1083152972672" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1184160983472">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1184160985852">
                <property name="value" value="1" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206572405412">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977965150">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1184160927422">
                    <link role="variableDeclaration" targetNodeId="1184160852034" resolveInfo="method" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1184160927421">
                    <link role="link" targetNodeId="1.1068580123134" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetSizeOperation" id="1184160982161" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1184160852034">
        <property name="name" value="method" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1184160852035">
          <link role="concept" targetNodeId="1.1068580123165" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1198838375885">
      <property name="name" value="isInitializable" />
      <link role="overriddenMethod" targetNodeId="1198838351591" resolveInfo="isInitializable" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1198838375887">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1198838396357">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1198838396358">
            <property name="value" value="true" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1198838391568" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1184160780379">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184160780380">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1202207143347">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977954705">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977956075">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1202207143348" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1202207147288">
                <link role="link" targetNodeId="1.1178549979242" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetNewChildOperation" id="1202207155608">
              <link role="concept" targetNodeId="1.1146644623116" resolveInfo="PrivateVisibility" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1184884307360">
    <link role="concept" targetNodeId="1.1068431790191" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1184884309598">
      <property name="name" value="eval" />
      <property name="isVirtual" value="true" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1184884390616">
        <link role="classifier" targetNodeId="13.~Object" resolveInfo="Object" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184884309600">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ThrowStatement" id="1184884398890">
          <node role="throwable" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1184884460313">
            <link role="baseMethodDeclaration" targetNodeId="13.~UnsupportedOperationException.&lt;init&gt;(java.lang.String)" resolveInfo="UnsupportedOperationException" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332445958">
              <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SemanticDowncastExpression" id="1184884527380">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1184884514986" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332445959">
                <link role="baseMethodDeclaration" targetNodeId="7.~SNode.getDebugText():java.lang.String" resolveInfo="getDebugText" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1194439027181">
        <property name="name" value="module" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1194440709692">
          <link role="classifier" targetNodeId="35.~IModule" resolveInfo="IModule" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1187949494822">
      <property name="name" value="getVariableExpectedName" />
      <property name="isVirtual" value="true" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1187949498704">
        <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1187949494824">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1187949526718">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1187949526719" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1196166566965">
      <property name="name" value="isLValue" />
      <property name="isVirtual" value="true" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1196166602307" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1196166566967">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1196166615309">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977967892">
            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1196166615310" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptPropertyAccess" id="1196166616990">
              <link role="conceptProperty" targetNodeId="1.1146528679895" resolveInfo="lvalue" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1184884307361">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184884307362" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1185033836491">
    <property name="package" value="method" />
    <link role="concept" targetNodeId="1.1068499141036" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1185033838760">
      <property name="name" value="getActualArguments" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ArrayType" id="1185033926739">
        <node role="componentType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1185033925754">
          <link role="classifier" targetNodeId="13.~Object" resolveInfo="Object" />
        </node>
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1185033838762">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1185033955449">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206572405275">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206572405272">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977951879">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1185033957409" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1206572417744">
                  <link role="link" targetNodeId="1.1068499141038" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SelectOperation" id="1185033957410">
                <node role="selector" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SelectorBlock" id="1185033957411">
                  <node role="defaultInputElement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.DefaultInputElement" id="1185033957412">
                    <property name="name" value="it" />
                  </node>
                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1185033957413">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1185033957414">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977963303">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.ClosureParameterReference" id="1185033960263">
                          <link role="closureParameter" targetNodeId="1185033957412" resolveInfo="it" />
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1185033957416">
                          <link role="conceptMethodDeclaration" targetNodeId="1184884309598" resolveInfo="eval" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1194439118804">
                            <link role="variableDeclaration" targetNodeId="1194439115099" resolveInfo="module" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ToArrayOperation" id="1185033957418" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1194439115099">
        <property name="name" value="module" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1194440694076">
          <link role="classifier" targetNodeId="35.~IModule" resolveInfo="IModule" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1187949569115">
      <property name="name" value="getVariableExpectedName" />
      <link role="overriddenMethod" targetNodeId="1187949494822" resolveInfo="getVariableExpectedName" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1187949569117">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1187949638597">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1187949638598">
            <property name="name" value="variableExpectedName" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1187949638599">
              <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1187949649594" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1187949618386">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977963565">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977956538">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1187949620784" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1187949625358">
                <link role="link" targetNodeId="1.1068499141037" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNotNullOperation" id="1187949627473" />
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1187949618388">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1187949654134">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1187949654135">
                <property name="name" value="name" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1187949654136">
                  <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977967774">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977957118">
                    <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1187949661380" />
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1187949665281">
                      <link role="link" targetNodeId="1.1068499141037" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1187949667063">
                    <link role="property" targetNodeId="1.1083152972672" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1187949673039">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1187949673040">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1187949686586">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1187949687380">
                    <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332444415">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1187949689208">
                        <link role="variableDeclaration" targetNodeId="1187949654135" resolveInfo="name" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332444416">
                        <link role="baseMethodDeclaration" targetNodeId="13.~String.substring(int):java.lang.String" resolveInfo="substring" />
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1187949693501">
                          <property name="value" value="3" />
                        </node>
                      </node>
                    </node>
                    <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1187949686587">
                      <link role="variableDeclaration" targetNodeId="1187949638598" resolveInfo="variableExpectedName" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332445440">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1187949674277">
                  <link role="variableDeclaration" targetNodeId="1187949654135" resolveInfo="name" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332445441">
                  <link role="baseMethodDeclaration" targetNodeId="13.~String.startsWith(java.lang.String):boolean" resolveInfo="startsWith" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1187949680988">
                    <property name="value" value="get" />
                  </node>
                </node>
              </node>
              <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1187949696412">
                <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1187949696413">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1187949705543">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1187949706698">
                      <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332445067">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1187949708154">
                          <link role="variableDeclaration" targetNodeId="1187949654135" resolveInfo="name" />
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332445068">
                          <link role="baseMethodDeclaration" targetNodeId="13.~String.substring(int):java.lang.String" resolveInfo="substring" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1187949714283">
                            <property name="value" value="2" />
                          </node>
                        </node>
                      </node>
                      <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1187949705544">
                        <link role="variableDeclaration" targetNodeId="1187949638598" resolveInfo="variableExpectedName" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332444275">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1187949697649">
                    <link role="variableDeclaration" targetNodeId="1187949654135" resolveInfo="name" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332444276">
                    <link role="baseMethodDeclaration" targetNodeId="13.~String.startsWith(java.lang.String):boolean" resolveInfo="startsWith" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1187949701636">
                      <property name="value" value="is" />
                    </node>
                  </node>
                </node>
                <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1187950143393">
                  <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1187950143394">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1187950145677">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1187950146463">
                        <node role="rValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1187950147530">
                          <link role="variableDeclaration" targetNodeId="1187949654135" resolveInfo="name" />
                        </node>
                        <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1187950145678">
                          <link role="variableDeclaration" targetNodeId="1187949638598" resolveInfo="variableExpectedName" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1187949718081">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1187950303618">
            <link role="baseMethodDeclaration" targetNodeId="3.~NameUtil.decapitalize(java.lang.String):java.lang.String" resolveInfo="decapitalize" />
            <link role="classConcept" targetNodeId="3.~NameUtil" resolveInfo="NameUtil" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1187950304945">
              <link role="variableDeclaration" targetNodeId="1187949638598" resolveInfo="variableExpectedName" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1190026804854">
        <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1201184197901">
      <property name="name" value="deriveType" />
      <link role="overriddenMethod" targetNodeId="1201184092299" resolveInfo="deriveType" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201184197903">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1203979102756">
          <property name="value" value="is 'experssion' an actual argument in this method call?" />
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1201184230085">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201184230086">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1201184305304">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1201184305305">
                <property name="name" value="method" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1201184305306">
                  <link role="concept" targetNodeId="1.1068580123132" resolveInfo="BaseMethodDeclaration" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977967721">
                  <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1201184305308" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1201184305309">
                    <link role="link" targetNodeId="1.1068499141037" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1201184393769">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1201184393770">
                <property name="name" value="i" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1201184393771" />
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977966082">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1201184393773">
                    <link role="variableDeclaration" targetNodeId="1201184201385" resolveInfo="expression" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetIndexInParentOperation" id="1201184393774" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1201184409310">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201184409311">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1201184460592">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1201184460593">
                    <property name="name" value="parameterDeclaration" />
                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1201184460594">
                      <link role="concept" targetNodeId="1.1068498886292" resolveInfo="ParameterDeclaration" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206572405358">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977964320">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201184460597">
                          <link role="variableDeclaration" targetNodeId="1201184305305" resolveInfo="method" />
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1201184460598">
                          <link role="link" targetNodeId="1.1068580123134" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetElementOperation" id="1201184460599">
                        <node role="argument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201184460600">
                          <link role="variableDeclaration" targetNodeId="1201184393770" resolveInfo="i" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1203979252231">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203979257286">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203979257287">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203979257288">
                        <link role="variableDeclaration" targetNodeId="1201184460593" resolveInfo="parameterDeclaration" />
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1203979257289">
                        <link role="link" targetNodeId="1.1068431790188" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_CopyOperation" id="1203979257290" />
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.LessThanExpression" id="1201184414247">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977966916">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977967256">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201184416403">
                      <link role="variableDeclaration" targetNodeId="1201184305305" resolveInfo="method" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1201184420475">
                      <link role="link" targetNodeId="1.1068580123134" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_GetCountOperation" id="1201184429659" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201184411746">
                  <link role="variableDeclaration" targetNodeId="1201184393770" resolveInfo="i" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1201184247682">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977954945">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1201184251677">
                <link role="variableDeclaration" targetNodeId="1201184201385" resolveInfo="expression" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsRoleOperation" id="1201184265770">
                <link role="conceptOfParent" targetNodeId="1.1068499141036" resolveInfo="BaseMethodCall" />
                <link role="linkInParent" targetNodeId="1.1068499141038" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1201184244003">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977956966">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1201184232725">
                  <link role="variableDeclaration" targetNodeId="1201184201385" resolveInfo="expression" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1201184237660" />
              </node>
              <node role="rightExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1201184246240" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1203979152716">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1203979263428" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1201184201385">
        <property name="name" value="expression" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1201184201386">
          <link role="concept" targetNodeId="1.1068431790191" resolveInfo="Expression" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1201184201388">
        <link role="concept" targetNodeId="1.1068431790189" resolveInfo="Type" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1185033836492">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1185033836493" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1185037508247">
    <link role="concept" targetNodeId="1.1068581242875" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1185037509859">
      <property name="name" value="eval" />
      <link role="overriddenMethod" targetNodeId="1184884309598" resolveInfo="eval" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1185037509861">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1185039737869">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1185039737870">
            <property name="name" value="result" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1185039737871">
              <link role="classifier" targetNodeId="13.~Object" resolveInfo="Object" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1185038232865">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1185038232866">
            <property name="name" value="leftExpression" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1185038232867">
              <link role="classifier" targetNodeId="13.~Object" resolveInfo="Object" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977954807">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977954943">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1185038217559" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1185038219688">
                  <link role="link" targetNodeId="1.1081773367580" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1185038220848">
                <link role="conceptMethodDeclaration" targetNodeId="1184884309598" resolveInfo="eval" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1194439143666">
                  <link role="variableDeclaration" targetNodeId="1194439137430" resolveInfo="module" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1185038244895">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1185038244896">
            <property name="name" value="rightExpression" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1185038244897">
              <link role="classifier" targetNodeId="13.~Object" resolveInfo="Object" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977963795">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977955507">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1185038234932" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1185038237499">
                  <link role="link" targetNodeId="1.1081773367579" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1185038239222">
                <link role="conceptMethodDeclaration" targetNodeId="1184884309598" resolveInfo="eval" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1194439145855">
                  <link role="variableDeclaration" targetNodeId="1194439137430" resolveInfo="module" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1185039732411">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1185039732412">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1185039759316">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1185039760100">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1185039770619">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1185039773561">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1185039774814">
                      <link role="variableDeclaration" targetNodeId="1185038244896" resolveInfo="rightExpression" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1185039772575">
                      <link role="variableDeclaration" targetNodeId="1185038232866" resolveInfo="leftExpression" />
                    </node>
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1185039768728">
                    <property name="value" value="" />
                  </node>
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1185039759317">
                  <link role="variableDeclaration" targetNodeId="1185039737870" resolveInfo="result" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.InstanceOfExpression" id="1185039749750">
            <node role="classType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1185039753909">
              <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1185039741466">
              <link role="variableDeclaration" targetNodeId="1185038232866" resolveInfo="leftExpression" />
            </node>
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1185039783429">
            <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1185039783430">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ThrowStatement" id="1185039785353">
                <node role="throwable" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1185039788386">
                  <link role="baseMethodDeclaration" targetNodeId="13.~UnsupportedOperationException.&lt;init&gt;()" resolveInfo="UnsupportedOperationException" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1185039777785">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1185039777786">
            <link role="variableDeclaration" targetNodeId="1185039737870" resolveInfo="result" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1194439137430">
        <property name="name" value="module" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1194440772929">
          <link role="classifier" targetNodeId="35.~IModule" resolveInfo="IModule" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1193389751950">
        <link role="classifier" targetNodeId="13.~Object" resolveInfo="Object" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1185037508248">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1185037508249" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1187398810002">
    <link role="concept" targetNodeId="1.1070534058343" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1187398812615">
      <property name="name" value="eval" />
      <link role="overriddenMethod" targetNodeId="1184884309598" resolveInfo="eval" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1187398812617">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1187398909713">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1187398909714" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1194439176834">
        <property name="name" value="module" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1194440822560">
          <link role="classifier" targetNodeId="35.~IModule" resolveInfo="IModule" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1193389777630">
        <link role="classifier" targetNodeId="13.~Object" resolveInfo="Object" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1187398810003">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1187398810004" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1187625988101">
    <property name="package" value="type" />
    <link role="concept" targetNodeId="1.1070534760951" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1199304961236">
      <property name="isPrivate" value="false" />
      <property name="name" value="getPresentation" />
      <link role="overriddenMethod" targetNodeId="36.1180102203531" resolveInfo="getPresentation" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1199304961238">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1199305090508">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1199305172995">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1199305176639" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977966686">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1199305090513" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1199305090512">
                <link role="link" targetNodeId="1.1070534760952" />
              </node>
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1199305090514">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1199305090515">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1199305090516">
                <property name="value" value="???[]" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1199305159690">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1199305159691">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1199305159692">
              <property name="value" value="[]" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977964819">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977966948">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1199305159697" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1199305159696">
                  <link role="link" targetNodeId="1.1070534760952" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1199305159694">
                <link role="conceptMethodDeclaration" targetNodeId="36.1180102203531" resolveInfo="getPresentation" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1199316256696">
        <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1187625989902">
      <property name="name" value="getVariableSuffixes" />
      <link role="overriddenMethod" targetNodeId="1182416669983" resolveInfo="getVariableSuffixes" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1187625989904">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1187626044893">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1187626044894">
            <property name="name" value="variableSuffixes" />
            <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1187626044895">
              <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1187626046880">
                <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1187626063857">
              <node role="creator" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListCreatorWithInit" id="1187626064878">
                <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1187626067166">
                  <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
                </node>
                <node role="initValue" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1187626069343">
                  <property name="value" value="array" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1187626081509">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1187626081510">
            <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1187626101907">
              <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1187626101908">
                <property name="name" value="suffix" />
              </node>
              <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977964213">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977963874">
                  <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1187626113931" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1187626115815">
                    <link role="link" targetNodeId="1.1070534760952" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1187626120571">
                  <link role="conceptMethodDeclaration" targetNodeId="1182416669983" resolveInfo="getVariableSuffixes" />
                </node>
              </node>
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1187626101910">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1187626124682">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206572405697">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1187626124683">
                      <link role="variableDeclaration" targetNodeId="1187626044894" resolveInfo="variableSuffixes" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddElementOperation" id="1187626126570">
                      <node role="argument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1187626133739">
                        <link role="baseMethodDeclaration" targetNodeId="3.~NameUtil.pluralize(java.lang.String):java.lang.String" resolveInfo="pluralize" />
                        <link role="classConcept" targetNodeId="3.~NameUtil" resolveInfo="NameUtil" />
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1187626137363">
                          <link role="variable" targetNodeId="1187626101908" resolveInfo="suffix" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977964917">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977962709">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1187626083847" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1187626088954">
                <link role="link" targetNodeId="1.1070534760952" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNotNullOperation" id="1187626090680" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1187626145448">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1187626145449">
            <link role="variableDeclaration" targetNodeId="1187626044894" resolveInfo="variableSuffixes" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1190026804857">
        <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1190026804858">
          <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1187945667298">
      <property name="name" value="getAbstractCreator" />
      <link role="overriddenMethod" targetNodeId="1187945523562" resolveInfo="getAbstractCreator" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1187945667300">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1187945687269">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1187945687270">
            <property name="name" value="arrayCreator" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1187945687271">
              <link role="concept" targetNodeId="1.1184950988562" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1187945766092">
              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1187945767624">
                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1187945767625">
                  <link role="concept" targetNodeId="1.1184950988562" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1209401685126">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1209401685127">
            <property name="name" value="type" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1209401685128">
              <link role="concept" targetNodeId="1.1068431790189" resolveInfo="Type" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209401685129">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1209401685130" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1209401685131">
                <link role="link" targetNodeId="1.1070534760952" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.WhileStatement" id="1209401677420">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209401694429">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209401693828">
              <link role="variableDeclaration" targetNodeId="1209401685127" resolveInfo="type" />
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1209401695987">
              <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1209401699233">
                <link role="conceptDeclaration" targetNodeId="1.1070534760951" resolveInfo="ArrayType" />
              </node>
            </node>
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1209401677422">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1209401718729">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1209401721298">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209401739246">
                  <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1209401728036">
                    <link role="concept" targetNodeId="1.1070534760951" resolveInfo="ArrayType" />
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209401726722">
                      <link role="variableDeclaration" targetNodeId="1209401685127" resolveInfo="type" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1209401740740">
                    <link role="link" targetNodeId="1.1070534760952" />
                  </node>
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209401718730">
                  <link role="variableDeclaration" targetNodeId="1209401685127" resolveInfo="type" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1209401773660">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209401778152">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209401774023">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209401773661">
                    <link role="variableDeclaration" targetNodeId="1187945687270" resolveInfo="arrayCreator" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1209401776209">
                    <link role="link" targetNodeId="1.1184952969026" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_AddNewChildOperation" id="1209401781665" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1187945778106">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977966991">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977955734">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1187945778107">
                <link role="variableDeclaration" targetNodeId="1187945687270" resolveInfo="arrayCreator" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1187945793540">
                <link role="link" targetNodeId="1.1184951007469" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetTargetOperation" id="1187945796217">
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977952259">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209401685136">
                  <link role="variableDeclaration" targetNodeId="1209401685127" resolveInfo="type" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_CopyOperation" id="1187945799111" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1187945814924">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1187945814925">
            <link role="variableDeclaration" targetNodeId="1187945687270" resolveInfo="arrayCreator" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1190026804859">
        <link role="concept" targetNodeId="1.1145552809883" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1187625988102">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1187625988103" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1188214183318">
    <link role="concept" targetNodeId="1.1188207840427" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1188214183319">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1188214183320" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1188214671427">
    <link role="concept" targetNodeId="1.1188214545140" />
    <node role="references" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodeReferentConstraint" id="1188214673789">
      <link role="applicableLink" targetNodeId="1.1188214555875" />
      <node role="searchScopeFactory" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_ReferentSearchScope_Factory" id="1188214676337">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1188214676338">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1188214753020">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1188214753021">
              <property name="name" value="result" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1188214758774">
                <link role="elementConcept" targetNodeId="1.1188206574119" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1188214771495">
                <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListCreator" id="1188214771496">
                  <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1188214771497">
                    <link role="elementConcept" targetNodeId="1.1188206574119" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1188214825738">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1188214825739">
              <property name="name" value="parent" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1188214825740">
                <link role="concept" targetNodeId="1.1188207840427" />
              </node>
              <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1188214850167">
                <link role="concept" targetNodeId="1.1188207840427" />
                <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptParameter_ReferentSearchScope_enclosingNode" id="1188214848119" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1188214871506">
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1188214871507">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1188214880113">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206572405812">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1188214880115">
                    <link role="variableDeclaration" targetNodeId="1188214753021" resolveInfo="result" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddAllElementsOperation" id="1188214880116">
                    <node role="argument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977955945">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977967612">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1188214880121">
                          <link role="variableDeclaration" targetNodeId="1188214825739" resolveInfo="parent" />
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1188214880120">
                          <link role="link" targetNodeId="1.1188208074048" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1188214889934">
                        <link role="link" targetNodeId="1.1188206594042" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1188214876015">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1188214876956" />
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977965233">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1188214872698">
                  <link role="variableDeclaration" targetNodeId="1188214825739" resolveInfo="parent" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1188214875248">
                  <link role="link" targetNodeId="1.1188208074048" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1188214775796">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1188214777408">
              <link role="baseMethodDeclaration" targetNodeId="5.~SimpleSearchScope.&lt;init&gt;(java.util.List)" resolveInfo="SimpleSearchScope" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1188214815902">
                <link role="variableDeclaration" targetNodeId="1188214753021" resolveInfo="result" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1188214671428">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1188214671429" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1188505359202">
    <link role="concept" targetNodeId="1.1107796713796" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1188505359203">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1188505359204" />
    </node>
    <node role="defaultScope" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodeDefaultSearchScope" id="1188505382908">
      <property name="description" value="visible interfaces from model and imported models" />
      <node role="searchScopeFactory" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_ReferentSearchScope_Factory" id="1188505382909">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1188505382910">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1188505419286">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1188505419287">
              <link role="baseMethodDeclaration" targetNodeId="10.~VisibleClassifiersScope.&lt;init&gt;(jetbrains.mps.smodel.SModel,int,jetbrains.mps.smodel.IScope)" resolveInfo="VisibleClassifiersScope" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.sharedConcepts.structure.ConceptFunctionParameter_model" id="1188505419288" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1188505419289">
                <link role="classifier" targetNodeId="10.~IClassifiersSearchScope" resolveInfo="IClassifiersSearchScope" />
                <link role="variableDeclaration" targetNodeId="10.~IClassifiersSearchScope.INTERFACE" resolveInfo="INTERFACE" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.bootstrap.sharedConcepts.structure.ConceptFunctionParameter_scope" id="1188505419290" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1188505469509">
    <link role="concept" targetNodeId="1.1188206331916" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1194955133406">
      <property name="name" value="getMembers" />
      <link role="overriddenMethod" targetNodeId="1194952456574" resolveInfo="getMembers" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194955133408">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1194955174910">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1194955174911">
            <property name="name" value="members" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1194955174912" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977954425">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.SuperNodeExpression" id="1194955170531" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1194955172528">
                <link role="conceptMethodDeclaration" targetNodeId="1194952456574" resolveInfo="getMembers" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194955180356">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206572405567">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1194955180357">
              <link role="variableDeclaration" targetNodeId="1194955174911" resolveInfo="members" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddAllElementsOperation" id="1194955183914">
              <node role="argument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977966573">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1194955187559" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1194955196454">
                  <link role="link" targetNodeId="1.1188206594042" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194955177721">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1194955177722">
            <link role="variableDeclaration" targetNodeId="1194955174911" resolveInfo="members" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1194955165721" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1188505469510">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1188505469511">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1188995228293">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977968263">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977956757">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1188995228294" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1188995231361">
                <link role="link" targetNodeId="1.1178549650460" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetNewChildOperation" id="1188995233693">
              <link role="concept" targetNodeId="1.1146644602865" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="defaultScope" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodeDefaultSearchScope" id="1188505472809">
      <property name="description" value="visible annotations from model and imported models" />
      <node role="searchScopeFactory" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_ReferentSearchScope_Factory" id="1188505472810">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1188505472811">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1188505590747">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1188505590748">
              <link role="baseMethodDeclaration" targetNodeId="10.~VisibleClassifiersScope.&lt;init&gt;(jetbrains.mps.smodel.SModel,int,jetbrains.mps.smodel.IScope)" resolveInfo="VisibleClassifiersScope" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.sharedConcepts.structure.ConceptFunctionParameter_model" id="1188505590749" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1188505590750">
                <link role="classifier" targetNodeId="10.~IClassifiersSearchScope" resolveInfo="IClassifiersSearchScope" />
                <link role="variableDeclaration" targetNodeId="10.~IClassifiersSearchScope.ANNOTATION" resolveInfo="ANNOTATION" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.bootstrap.sharedConcepts.structure.ConceptFunctionParameter_scope" id="1188505590751" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1192184779567">
    <link role="concept" targetNodeId="1.1083245097125" resolveInfo="EnumClass" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1192184783133">
      <property name="name" value="findConstantByName" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1192184833847">
        <link role="concept" targetNodeId="1.1083245299891" resolveInfo="EnumConstantDeclaration" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1192184783135">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1192184862176">
          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977956126">
            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1192184872915" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1192184876106">
              <link role="link" targetNodeId="1.1083245396908" />
            </node>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1192184862178">
            <property name="name" value="constant" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1192184864431">
              <link role="concept" targetNodeId="1.1083245299891" resolveInfo="EnumConstantDeclaration" />
            </node>
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1192184862180">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1192184878154">
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332446437">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1192184879235">
                  <link role="variableDeclaration" targetNodeId="1192184857862" resolveInfo="name" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332446438">
                  <link role="baseMethodDeclaration" targetNodeId="13.~String.equalsIgnoreCase(java.lang.String):boolean" resolveInfo="equalsIgnoreCase" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977966368">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1192184885223">
                      <link role="variableDeclaration" targetNodeId="1192184862178" resolveInfo="constant" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1192184893073">
                      <link role="property" targetNodeId="1.1095257688468" resolveInfo="name" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1192184878156">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1192184896074">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1192184901388">
                    <link role="variableDeclaration" targetNodeId="1192184862178" resolveInfo="constant" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1192184904687">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1192184905970" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1192184857862">
        <property name="name" value="name" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1192184857863">
          <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1194954996534">
      <property name="name" value="getMembers" />
      <link role="overriddenMethod" targetNodeId="1194952456574" resolveInfo="getMembers" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194954996535">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1194955009225">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1194955009226">
            <property name="name" value="members" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1194955009227" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977956834">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.SuperNodeExpression" id="1194955003662" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1194955006386">
                <link role="conceptMethodDeclaration" targetNodeId="1194952456574" resolveInfo="getMembers" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194955012251">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206572405820">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1194955012252">
              <link role="variableDeclaration" targetNodeId="1194955009226" resolveInfo="members" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddAllElementsOperation" id="1194955013962">
              <node role="argument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977964683">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1194955017030" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1194955024661">
                  <link role="link" targetNodeId="1.1083245396908" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194955027825">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1194955027826">
            <link role="variableDeclaration" targetNodeId="1194955009226" resolveInfo="members" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1194954999755" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1192184779568">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1192184779569" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1194952345242">
    <link role="concept" targetNodeId="1.1194952169813" resolveInfo="Structured" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1194952456574">
      <property name="name" value="getMembers" />
      <property name="isVirtual" value="true" />
      <property name="isAbstract" value="true" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1194952517292" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194952456576">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194952530597">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1194952530598" />
        </node>
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1194952345243">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194952345245" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1197028593979">
    <property name="package" value="dotExpression" />
    <link role="concept" targetNodeId="1.1197027803184" resolveInfo="IOperation" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1197028596169">
      <property name="name" value="getOperand" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1197028607820">
        <link role="concept" targetNodeId="1.1068431790191" resolveInfo="Expression" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197028596171">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1197028616888">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977963147">
            <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1197028618920">
              <link role="concept" targetNodeId="1.1197027756228" resolveInfo="OperationExpression" />
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977967307">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1197028616889" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1197028618314" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1197028627806">
              <link role="link" targetNodeId="1.1197027771414" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1202595004827">
      <property name="name" value="isLValue" />
      <property name="isVirtual" value="true" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1202595010838" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1202595004829">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1202595032136">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977952281">
            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1202595032137" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptPropertyAccess" id="1202595035688">
              <link role="conceptProperty" targetNodeId="1.1197029536315" resolveInfo="lvalue" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1197028593980">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197028593981" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1197029554471">
    <property name="package" value="dotExpression" />
    <link role="concept" targetNodeId="1.1197027756228" resolveInfo="OperationExpression" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1197029557234">
      <property name="name" value="isLValue" />
      <link role="overriddenMethod" targetNodeId="1196166566965" resolveInfo="isLValue" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197029557236">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1197029569025">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977952157">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977964687">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1197029569026" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1197029583287">
                <link role="link" targetNodeId="1.1197027833540" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1202595047267">
              <link role="conceptMethodDeclaration" targetNodeId="1202595004827" resolveInfo="isLValue" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1197029562628" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1201997214164">
      <property name="name" value="getClassifier" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1201997220854">
        <link role="concept" targetNodeId="1.1107461130800" resolveInfo="Classifier" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201997214166">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1201997235715">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977954582">
            <node role="operand" type="jetbrains.mps.bootstrap.helgins.structure.CoerceStrongExpression" id="1201997263234">
              <node role="nodeToCoerce" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977965203">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977967305">
                  <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1201997263237" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1201997263238">
                    <link role="link" targetNodeId="1.1197027771414" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.helgins.structure.Node_TypeOperation" id="1201997263239" />
              </node>
              <node role="pattern" type="jetbrains.mps.bootstrap.helgins.structure.ConceptReference" id="1201997263240">
                <property name="name" value="classifierType" />
                <link role="concept" targetNodeId="1.1107535904670" resolveInfo="ClassifierType" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1201997235718">
              <link role="link" targetNodeId="1.1107535924139" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1197029554472">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197029554473" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1197029746210">
    <property name="package" value="dotExpression" />
    <link role="concept" targetNodeId="1.1197029447546" resolveInfo="FieldReferenceOperation" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1197029756624">
      <property name="name" value="getVariableExpectedName" />
      <link role="overriddenMethod" targetNodeId="1187949494822" resolveInfo="getVariableExpectedName" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197029756626">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1197029771332">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1197029771333">
            <property name="name" value="expectedName" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1197029771334">
              <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1197029771335" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1197029771337">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197029771338">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1197029771339">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1197029771340">
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1197029771341">
                  <link role="variableDeclaration" targetNodeId="1197029771333" resolveInfo="expectedName" />
                </node>
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977965258">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977957220">
                    <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1197029771344" />
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1197029780275">
                      <link role="link" targetNodeId="1.1197029500499" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1197029782413">
                    <link role="property" targetNodeId="1.1083152972671" resolveInfo="name" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977954990">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977955535">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1197029771351" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1197029778690">
                <link role="link" targetNodeId="1.1197029500499" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNotNullOperation" id="1197029771348" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1197029771352">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1197029771353">
            <link role="variableDeclaration" targetNodeId="1197029771333" resolveInfo="expectedName" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1197029761636">
        <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1197029746211">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197029746212" />
    </node>
    <node role="references" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodeReferentConstraint" id="1197029794316">
      <property name="searchScopeDescription" value="fields declared in hierarhy of class specified by left expression. only applicable to expressions of classifier-type" />
      <link role="applicableLink" targetNodeId="1.1197029500499" />
      <node role="searchScopeFactory" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_ReferentSearchScope_Factory" id="1197029796857">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197029796858">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1197029820925">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1197029820926">
              <property name="name" value="instance" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1197029820927">
                <link role="concept" targetNodeId="1.1068431790191" resolveInfo="Expression" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977965980">
                <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1197029898842">
                  <link role="concept" targetNodeId="1.1197027756228" resolveInfo="OperationExpression" />
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptParameter_ReferentSearchScope_enclosingNode" id="1197029896355" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1197029903552">
                  <link role="link" targetNodeId="1.1197027771414" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1197029820931">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1197029820932">
              <property name="name" value="classifierType" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1197029820933">
                <link role="concept" targetNodeId="1.1107535904670" resolveInfo="ClassifierType" />
              </node>
              <node role="initializer" type="jetbrains.mps.bootstrap.helgins.structure.CoerceStrongExpression" id="1197029820934">
                <node role="nodeToCoerce" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977965698">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1197029820937">
                    <link role="variableDeclaration" targetNodeId="1197029820926" resolveInfo="instance" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.helgins.structure.Node_TypeOperation" id="1197029820936" />
                </node>
                <node role="pattern" type="jetbrains.mps.bootstrap.helgins.structure.ConceptReference" id="1197029820938">
                  <property name="name" value="classifierType" />
                  <link role="concept" targetNodeId="1.1107535904670" resolveInfo="ClassifierType" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1197029820939">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1197029820940">
              <link role="baseMethodDeclaration" targetNodeId="10.~VisibleClassifierMembersScope.&lt;init&gt;(jetbrains.mps.baseLanguage.structure.ClassifierType,jetbrains.mps.smodel.SNode,int)" resolveInfo="VisibleClassifierMembersScope" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204672721399">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1197029919519">
                  <link role="variableDeclaration" targetNodeId="1197029820932" resolveInfo="classifierType" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAdapterOperation" id="1197029922757" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptParameter_ReferentSearchScope_enclosingNode" id="1197029924465" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1197029820947">
                <link role="classifier" targetNodeId="10.~IClassifiersSearchScope" resolveInfo="IClassifiersSearchScope" />
                <link role="variableDeclaration" targetNodeId="10.~IClassifiersSearchScope.INSTANCE_FIELD" resolveInfo="INSTANCE_FIELD" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1197462236379">
    <link role="concept" targetNodeId="1.1068580123136" resolveInfo="StatementList" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1206985459773">
      <property name="name" value="checkDataFlow" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1206985510662" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206985459775">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1206986810383">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206986845038">
            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1206986810385" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1206986810386">
              <link role="conceptMethodDeclaration" targetNodeId="1206986747362" resolveInfo="checkUnreachable" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1206986837861">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206986838097">
            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1206986837862" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1206986842177">
              <link role="conceptMethodDeclaration" targetNodeId="1206986828200" resolveInfo="checkUninitializedReads" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207047171430">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207047171744">
            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1207047171431" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1207047173872">
              <link role="conceptMethodDeclaration" targetNodeId="1207046917712" resolveInfo="checkUnusedAssignments" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1206989696423">
      <property name="name" value="checkReturns" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1206989733151" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206989696425">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1206989746297">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1206989746298">
            <property name="name" value="expectedReturns" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206989746299">
              <link role="classifier" targetNodeId="6.~Set" resolveInfo="Set" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206989746300">
                <link role="classifier" targetNodeId="7.~SNode" resolveInfo="SNode" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1206989746301">
              <link role="classConcept" targetNodeId="43.~DataFlow" resolveInfo="DataFlow" />
              <link role="baseMethodDeclaration" targetNodeId="43.~DataFlow.getExpectedReturns(jetbrains.mps.smodel.SNode):java.util.Set" resolveInfo="getExpectedReturns" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1206989766371" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1206989746305">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206989746306">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1206989746307">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1206989746308">
                <property name="name" value="statement" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1206989746309">
                  <link role="concept" targetNodeId="1.1068580123157" resolveInfo="Statement" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206989746310">
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1206989746311">
                    <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1206989746312">
                      <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1207781905956">
                        <link role="conceptDeclaration" targetNodeId="1.1068580123157" resolveInfo="Statement" />
                      </node>
                    </node>
                    <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Inclusion" id="1206989746313" />
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1206989746314">
                    <link role="variableDeclaration" targetNodeId="1206989746329" resolveInfo="n" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1206989746315">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206989746316">
                <node role="statement" type="jetbrains.mps.bootstrap.helgins.structure.ReportErrorStatement" id="1206989746317">
                  <node role="errorString" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1206989746318">
                    <property name="value" value="Return expected" />
                  </node>
                  <node role="nodeToReport" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1206989746319">
                    <link role="variableDeclaration" targetNodeId="1206989746308" resolveInfo="statement" />
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1206989746320">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1206989746321" />
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1206989746322">
                  <link role="variableDeclaration" targetNodeId="1206989746308" resolveInfo="statement" />
                </node>
              </node>
              <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1206989746323">
                <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206989746324">
                  <node role="statement" type="jetbrains.mps.bootstrap.helgins.structure.ReportErrorStatement" id="1206989746325">
                    <node role="errorString" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1206989746326">
                      <property name="value" value="Return expected" />
                    </node>
                    <node role="nodeToReport" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1206989746327">
                      <link role="variableDeclaration" targetNodeId="1206989746329" resolveInfo="n" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1206989746328">
            <link role="variableDeclaration" targetNodeId="1206989746298" resolveInfo="expectedReturns" />
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1206989746329">
            <property name="name" value="n" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1206989746330" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1206986747362">
      <property name="name" value="checkUnreachable" />
      <property name="isPrivate" value="true" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1206986788722" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206986747364">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1206985610296">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1206985610297">
            <property name="name" value="unreachable" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206985610298">
              <link role="classifier" targetNodeId="6.~Set" resolveInfo="Set" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206985610299">
                <link role="classifier" targetNodeId="7.~SNode" resolveInfo="SNode" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1206985610300">
              <link role="baseMethodDeclaration" targetNodeId="43.~DataFlow.getUnreachableNodes(jetbrains.mps.smodel.SNode):java.util.Set" resolveInfo="getUnreachableNodes" />
              <link role="classConcept" targetNodeId="43.~DataFlow" resolveInfo="DataFlow" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1206985617719" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1206985610304">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206985610305">
            <node role="statement" type="jetbrains.mps.bootstrap.helgins.structure.ReportErrorStatement" id="1206985610306">
              <node role="errorString" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1206985610307">
                <property name="value" value="Unreachable node" />
              </node>
              <node role="nodeToReport" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1206985610308">
                <link role="variableDeclaration" targetNodeId="1206985610310" resolveInfo="n" />
              </node>
            </node>
          </node>
          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1206985610309">
            <link role="variableDeclaration" targetNodeId="1206985610297" resolveInfo="unreachable" />
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1206985610310">
            <property name="name" value="n" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1206985610311" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1206986828200">
      <property name="name" value="checkUninitializedReads" />
      <property name="isPrivate" value="true" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1206986829531" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206986828202">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1206986850227">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1206986850228">
            <property name="name" value="uninitializedReads" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206986850229">
              <link role="classifier" targetNodeId="6.~Set" resolveInfo="Set" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206986853997">
                <link role="classifier" targetNodeId="7.~SNode" resolveInfo="SNode" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1206986970991">
              <link role="baseMethodDeclaration" targetNodeId="43.~DataFlow.getUninitializedReads(jetbrains.mps.smodel.SNode):java.util.Set" resolveInfo="getUninitializedReads" />
              <link role="classConcept" targetNodeId="43.~DataFlow" resolveInfo="DataFlow" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1206986972321" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207138675916">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207138675917">
            <property name="name" value="referencedInClosures" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1207138675918">
              <link role="elementConcept" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207138684992">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1207138684583" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1207138687543">
                <link role="conceptMethodDeclaration" targetNodeId="1207138364818" resolveInfo="getVariablesReferencedInClosures" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1206986982401">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206986982402">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1206986988177">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206986988178">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207075909180">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207075909181">
                    <property name="name" value="ref" />
                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207075909182">
                      <link role="concept" targetNodeId="1.1068581242866" resolveInfo="LocalVariableReference" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1207075918013">
                      <link role="concept" targetNodeId="1.1068581242866" resolveInfo="LocalVariableReference" />
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207075914044">
                        <link role="variableDeclaration" targetNodeId="1206986982405" resolveInfo="read" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1207125439961">
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207125439962">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ContinueStatement" id="1207125508520" />
                  </node>
                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.OrExpression" id="1207138759101">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207138798914">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207138798161">
                        <link role="variableDeclaration" targetNodeId="1207075909181" resolveInfo="ref" />
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1207138800340">
                        <link role="conceptMethodDeclaration" targetNodeId="1207138978268" resolveInfo="isReferencedFromClosure" />
                      </node>
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207138716393">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207138714796">
                        <link role="variableDeclaration" targetNodeId="1207138675917" resolveInfo="referencedInClosures" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ContainsOperation" id="1207138720460">
                        <node role="argument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207138725842">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207138725245">
                            <link role="variableDeclaration" targetNodeId="1207075909181" resolveInfo="ref" />
                          </node>
                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1207138732393">
                            <link role="link" targetNodeId="1.1070568296581" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.bootstrap.helgins.structure.ReportErrorStatement" id="1206986997624">
                  <node role="errorString" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1206986999502">
                    <property name="value" value="Variable used before it is initialized" />
                  </node>
                  <node role="nodeToReport" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1206987006706">
                    <link role="variableDeclaration" targetNodeId="1206986982405" resolveInfo="read" />
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206986989589">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1206986989088">
                  <link role="variableDeclaration" targetNodeId="1206986982405" resolveInfo="read" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1206986991231">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1206986995373">
                    <link role="conceptDeclaration" targetNodeId="1.1068581242866" resolveInfo="LocalVariableReference" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1206986986628">
            <link role="variableDeclaration" targetNodeId="1206986850228" resolveInfo="uninitializedReads" />
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1206986982405">
            <property name="name" value="read" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1206986983501" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1207046917712">
      <property name="isPrivate" value="true" />
      <property name="name" value="checkUnusedAssignments" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1207046974688" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207046917714">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207047036073">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207047036074">
            <property name="name" value="unusedAssignments" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1207047036075">
              <link role="classifier" targetNodeId="6.~Set" resolveInfo="Set" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1207047038843">
                <link role="classifier" targetNodeId="7.~SNode" resolveInfo="SNode" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1207047047707">
              <link role="baseMethodDeclaration" targetNodeId="43.~DataFlow.getUnusedAssignments(jetbrains.mps.smodel.SNode):java.util.Set" resolveInfo="getUnusedAssignments" />
              <link role="classConcept" targetNodeId="43.~DataFlow" resolveInfo="DataFlow" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1207047048677" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207138477926">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207138477927">
            <property name="name" value="referencedInClosure" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1207138477928">
              <link role="elementConcept" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207138488643">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1207138488312" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1207138490912">
                <link role="conceptMethodDeclaration" targetNodeId="1207138364818" resolveInfo="getVariablesReferencesInClosures" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1207047051070">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207047051071">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1207047058315">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207047058316">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207047074436">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207047074437">
                    <property name="name" value="assignment" />
                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207047074438">
                      <link role="concept" targetNodeId="1.1068498886294" resolveInfo="AssignmentExpression" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1207047081692">
                      <link role="concept" targetNodeId="1.1068498886294" resolveInfo="AssignmentExpression" />
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207047080034">
                        <link role="variableDeclaration" targetNodeId="1207047051074" resolveInfo="write" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1207047085258">
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207047085259">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207076669284">
                      <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207076669285">
                        <property name="name" value="ref" />
                        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207076669286">
                          <link role="concept" targetNodeId="1.1068498886296" resolveInfo="VariableReference" />
                        </node>
                        <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1207138561872">
                          <link role="concept" targetNodeId="1.1068498886296" resolveInfo="VariableReference" />
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207076831016">
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207076830216">
                              <link role="variableDeclaration" targetNodeId="1207047074437" resolveInfo="assignment" />
                            </node>
                            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1207076832723">
                              <link role="link" targetNodeId="1.1068498886295" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1207076855786">
                      <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207076855787">
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ContinueStatement" id="1207076980877" />
                      </node>
                      <node role="condition" type="jetbrains.mps.baseLanguage.structure.OrExpression" id="1207138900226">
                        <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207138939897">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207138939238">
                            <link role="variableDeclaration" targetNodeId="1207076669285" resolveInfo="ref" />
                          </node>
                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1207139036070">
                            <link role="conceptMethodDeclaration" targetNodeId="1207138978268" resolveInfo="isReferencedFromClosure" />
                          </node>
                        </node>
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207076917343">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207138495572">
                            <link role="variableDeclaration" targetNodeId="1207138477927" resolveInfo="referencedInClosure" />
                          </node>
                          <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ContainsOperation" id="1207076963925">
                            <node role="argument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207076967026">
                              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207076966179">
                                <link role="variableDeclaration" targetNodeId="1207076669285" resolveInfo="ref" />
                              </node>
                              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1207138567378">
                                <link role="link" targetNodeId="1.1068581517664" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" type="jetbrains.mps.bootstrap.helgins.structure.WarningStatement" id="1207057762735">
                      <node role="warningText" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1207057766067">
                        <property name="value" value="Unused assignment" />
                      </node>
                      <node role="nodeToReport" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207057782883">
                        <link role="variableDeclaration" targetNodeId="1207047074437" resolveInfo="assignment" />
                      </node>
                    </node>
                  </node>
                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.OrExpression" id="1207047098209">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207047102889">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207047100636">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207047099822">
                          <link role="variableDeclaration" targetNodeId="1207047074437" resolveInfo="assignment" />
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1207047102575">
                          <link role="link" targetNodeId="1.1068498886295" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1207047104204">
                        <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1207047108674">
                          <link role="conceptDeclaration" targetNodeId="1.1068581242874" resolveInfo="ParameterReference" />
                        </node>
                      </node>
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207047090001">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207047086857">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207047086215">
                          <link role="variableDeclaration" targetNodeId="1207047074437" resolveInfo="assignment" />
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1207047089515">
                          <link role="link" targetNodeId="1.1068498886295" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1207047091441">
                        <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1207047096380">
                          <link role="conceptDeclaration" targetNodeId="1.1068581242866" resolveInfo="LocalVariableReference" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207047059633">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207047059241">
                  <link role="variableDeclaration" targetNodeId="1207047051074" resolveInfo="write" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1207047061244">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1207047065980">
                    <link role="conceptDeclaration" targetNodeId="1.1068498886294" resolveInfo="AssignmentExpression" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1207047127842">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207047127843">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1207077729533">
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207077729534">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ContinueStatement" id="1207077810176" />
                  </node>
                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207077732837">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207138500809">
                      <link role="variableDeclaration" targetNodeId="1207138477927" resolveInfo="referencedInClosure" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ContainsOperation" id="1207077795748">
                      <node role="argument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207077803798">
                        <link role="variableDeclaration" targetNodeId="1207047051074" resolveInfo="write" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.bootstrap.helgins.structure.WarningStatement" id="1207057789199">
                  <node role="warningText" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1207057792937">
                    <property name="value" value="Unused assignment" />
                  </node>
                  <node role="nodeToReport" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207057796954">
                    <link role="variableDeclaration" targetNodeId="1207047051074" resolveInfo="write" />
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207047131897">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207047153498">
                  <link role="variableDeclaration" targetNodeId="1207047051074" resolveInfo="write" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1207047133587">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1207047139027">
                    <link role="conceptDeclaration" targetNodeId="1.1068581242863" resolveInfo="LocalVariableDeclaration" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207047057078">
            <link role="variableDeclaration" targetNodeId="1207047036074" resolveInfo="unusedAssignments" />
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207047051074">
            <property name="name" value="write" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207047051966" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1207138364818">
      <property name="name" value="getVariablesReferencedInClosures" />
      <property name="isPrivate" value="true" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1207138370951">
        <link role="elementConcept" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207138364820">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207138403663">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207138403664">
            <property name="name" value="referencedInClosures" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1207138403665">
              <link role="elementConcept" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1207138403666">
              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListCreator" id="1207138403667">
                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1207138403668">
                  <link role="elementConcept" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1207138403669">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207138403670">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207138403671">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207138403672">
                <property name="name" value="closure" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207138403673">
                  <link role="concept" targetNodeId="1.1152728232947" resolveInfo="Closure" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207138403674">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207138403675">
                    <link role="variableDeclaration" targetNodeId="1207138403700" resolveInfo="varRef" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1207138403676">
                    <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1207138403677">
                      <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1207781905987">
                        <link role="conceptDeclaration" targetNodeId="1.1152728232947" resolveInfo="Closure" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1207138403678">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207138403679">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207138403680">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207138403681">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207138403682">
                      <link role="variableDeclaration" targetNodeId="1207138403664" resolveInfo="accessedInClosures" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddElementOperation" id="1207138403683">
                      <node role="argument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207138403684">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207138403685">
                          <link role="variableDeclaration" targetNodeId="1207138403700" resolveInfo="varRef" />
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1207138430619">
                          <link role="link" targetNodeId="1.1068581517664" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1207138403687">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1207138403688">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207138403689">
                    <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1207138403690" />
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1207138403691" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207138403692">
                    <link role="variableDeclaration" targetNodeId="1207138403672" resolveInfo="closure" />
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207138403693">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207138403694">
                    <link role="variableDeclaration" targetNodeId="1207138403672" resolveInfo="closure" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNotNullOperation" id="1207138403695" />
                </node>
              </node>
            </node>
          </node>
          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207138403696">
            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1207138403697" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetDescendantsOperation" id="1207138403698">
              <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1207138403699">
                <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1207781905902">
                  <link role="conceptDeclaration" targetNodeId="1.1068498886296" resolveInfo="VariableReference" />
                </node>
              </node>
            </node>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207138403700">
            <property name="name" value="varRef" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207138403701">
              <link role="concept" targetNodeId="1.1068498886296" resolveInfo="VariableReference" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1207138467278">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207138468170">
            <link role="variableDeclaration" targetNodeId="1207138403664" resolveInfo="referencedInClosures" />
          </node>
        </node>
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1197462236380">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197462236381" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1198838409529">
    <link role="concept" targetNodeId="1.1070462154015" resolveInfo="StaticFieldDeclaration" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1198838409530">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1198838409531" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1198838412160">
      <property name="name" value="isInitializable" />
      <link role="overriddenMethod" targetNodeId="1198838351591" resolveInfo="isInitializable" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1198838412162">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1198838418168">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1198838418169">
            <property name="value" value="true" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1198838415297" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1199560612324">
    <property name="package" value="method.instance" />
    <link role="concept" targetNodeId="1.1068580123165" resolveInfo="InstanceMethodDeclaration" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1199560612325">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1199560612326" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1199878394628">
    <property name="package" value="conceptFunction" />
    <link role="concept" targetNodeId="1.1107135704075" resolveInfo="ConceptFunctionParameter" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1199878619650">
      <property name="name" value="getFromParameterObject" />
      <property name="isVirtual" value="true" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1199878621184" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1199878619652">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1199886621102">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1199886621103">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1199886627059">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1199886628919">
                <property name="value" value="false" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1199888112622">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977956130">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1199888119611" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1199888121521">
                <link role="conceptMethodDeclaration" targetNodeId="1199888026916" resolveInfo="isParameterObjectUsed" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1199878635029">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977966475">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977963646">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1199878711764" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1199878714534">
                <link role="conceptMethodDeclaration" targetNodeId="1199878398256" resolveInfo="findConceptFunction" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1199888284576">
              <link role="conceptMethodDeclaration" targetNodeId="1199888241493" resolveInfo="usesParameterObjectFor" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1199888286874" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1199888026916">
      <property name="name" value="isParameterObjectUsed" />
      <property name="isVirtual" value="true" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1199888064900" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1199888026918">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1199888107243">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1199888125836">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977952234">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1199888126666" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptPropertyAccess" id="1199888129186">
                <link role="conceptProperty" targetNodeId="1.1199886518837" resolveInfo="dontUseParameterObject" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1199878398256">
      <property name="name" value="findConceptFunction" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1199878448723">
        <link role="concept" targetNodeId="1.1137021947720" resolveInfo="ConceptFunction" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1199878398258">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1199878458270">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1199878458271">
            <property name="name" value="functions" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1199878458272">
              <link role="elementConcept" targetNodeId="1.1137021947720" resolveInfo="ConceptFunction" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977956315">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1199878570442" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorsOperation" id="1199878572430">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1199878573665">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1207781905985">
                    <link role="conceptDeclaration" targetNodeId="1.1137021947720" resolveInfo="ConceptFunction" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1199878951564">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1199878951565">
            <property name="name" value="ourConcept" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptType" id="1199878951566" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977955249">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1199878956757" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetConceptOperation" id="1199878956756" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1199878582729">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206572405440">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206572405596">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1199878583934">
                <link role="variableDeclaration" targetNodeId="1199878458271" resolveInfo="functions" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.WhereOperation" id="1199878585688">
                <node role="whereClosure" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.WhereBlock" id="1199878585689">
                  <node role="defaultInputElement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.DefaultInputElement" id="1199878585690">
                    <property name="name" value="it" />
                  </node>
                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1199878585691">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1199878591428">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.OrExpression" id="1199880644018">
                        <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206572405565">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977965676">
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ClosureParameterReference" id="1199880678501">
                              <link role="closureParameter" targetNodeId="1199878585690" resolveInfo="it" />
                            </node>
                            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptLinkAccess" id="1199880681302">
                              <link role="conceptLinkDeclaration" targetNodeId="1.1161119487665" resolveInfo="applicableConceptFunctionParameter" />
                            </node>
                          </node>
                          <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ContainsOperation" id="1199880687260">
                            <node role="argument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1199880688403">
                              <link role="variableDeclaration" targetNodeId="1199878951565" resolveInfo="ourConcept" />
                            </node>
                          </node>
                        </node>
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206572405680">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977965596">
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ClosureParameterReference" id="1199878591429">
                              <link role="closureParameter" targetNodeId="1199878585690" resolveInfo="it" />
                            </node>
                            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptLinkAccess" id="1199878595542">
                              <link role="conceptLinkDeclaration" targetNodeId="1.1137546998352" resolveInfo="conceptFunctionParameter" />
                            </node>
                          </node>
                          <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ContainsOperation" id="1199878600827">
                            <node role="argument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1199878959930">
                              <link role="variableDeclaration" targetNodeId="1199878951565" resolveInfo="ourConcept" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetFirstOperation" id="1199878614165" />
          </node>
        </node>
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1199878394629">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1199878394630" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1201184083512">
    <link role="concept" targetNodeId="1.1201183863028" resolveInfo="TypeDerivable" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1201184083513">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201184083514" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1201184092299">
      <property name="name" value="deriveType" />
      <property name="isVirtual" value="true" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1201184140089">
        <link role="concept" targetNodeId="1.1068431790189" resolveInfo="Type" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201184092301">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1201184178930">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1201184181443" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1201184149994">
        <property name="name" value="expression" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1201184149995">
          <link role="concept" targetNodeId="1.1068431790191" resolveInfo="Expression" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1201184611511">
    <link role="concept" targetNodeId="1.1068581242878" resolveInfo="ReturnStatement" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1201184611512">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201184611513" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1206626417012">
      <property name="name" value="getFinallyBlocks" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1206626655957">
        <link role="elementConcept" targetNodeId="1.1068580123136" resolveInfo="StatementList" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206626417014">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1206626486279">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1206626486280">
            <property name="name" value="result" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1206626551243">
              <link role="elementConcept" targetNodeId="1.1068580123136" resolveInfo="StatementList" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1206626561214">
              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListCreator" id="1206626561215">
                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1206626561216">
                  <link role="elementConcept" targetNodeId="1.1068580123136" resolveInfo="StatementList" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1206626681146">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1206626681147">
            <property name="name" value="current" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1206626681148" />
            <node role="initializer" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1206626685228" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.WhileStatement" id="1206626688875">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1206626689800">
            <property name="value" value="true" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206626688877">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1206626729838">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206626729839">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1206626742989">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1206626742990">
                    <property name="name" value="tryStatement" />
                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1206626742991">
                      <link role="concept" targetNodeId="1.1153952380246" resolveInfo="TryStatement" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1206626752869">
                      <link role="concept" targetNodeId="1.1153952380246" resolveInfo="TryStatement" />
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1206626751024">
                        <link role="variableDeclaration" targetNodeId="1206626681147" resolveInfo="current" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1206626757950">
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206626757951">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1206626766555">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206626767229">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1206626766556">
                          <link role="variableDeclaration" targetNodeId="1206626486280" resolveInfo="result" />
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddElementOperation" id="1206626768278">
                          <node role="argument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206626771799">
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1206626770937">
                              <link role="variableDeclaration" targetNodeId="1206626742990" resolveInfo="tryStatement" />
                            </node>
                            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1206626772614">
                              <link role="link" targetNodeId="1.1153952429843" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1206627996622">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1206628040591">
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206628042064">
                        <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1206628041625" />
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1206628043395" />
                      </node>
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206628038601">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1206628037740">
                          <link role="variableDeclaration" targetNodeId="1206626742990" resolveInfo="tryStatement" />
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1206628039620">
                          <link role="link" targetNodeId="1.1153952429843" />
                        </node>
                      </node>
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206626762505">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206626761143">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1206626760611">
                          <link role="variableDeclaration" targetNodeId="1206626742990" resolveInfo="tryStatement" />
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1206626762160">
                          <link role="link" targetNodeId="1.1153952429843" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNotNullOperation" id="1206626763945" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206626731062">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1206626730420">
                  <link role="variableDeclaration" targetNodeId="1206626681147" resolveInfo="current" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1206626732923">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1206626737222">
                    <link role="conceptDeclaration" targetNodeId="1.1153952380246" resolveInfo="TryStatement" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1206626774664">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1206626775167">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206626777345">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1206626776796">
                    <link role="variableDeclaration" targetNodeId="1206626681147" resolveInfo="current" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1206626778551" />
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1206626774665">
                  <link role="variableDeclaration" targetNodeId="1206626681147" resolveInfo="current" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1206626779834">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206626779835">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.BreakStatement" id="1206626871087" />
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1206626791508">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1206626863388">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206626864532">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1206626863843">
                      <link role="variableDeclaration" targetNodeId="1206626681147" resolveInfo="current" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1206626866410">
                      <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1206626869023">
                        <link role="conceptDeclaration" targetNodeId="1.1068580123136" resolveInfo="StatementList" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1206627913890">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206627913891">
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1206627913892">
                      <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1206627913893">
                        <link role="conceptDeclaration" targetNodeId="1.1068580123157" resolveInfo="Statement" />
                      </node>
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1206627913894">
                      <link role="variableDeclaration" targetNodeId="1206626681147" resolveInfo="current" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1206626562812">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1206626563642">
            <link role="variableDeclaration" targetNodeId="1206626486280" resolveInfo="result" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1201184618197">
      <property name="name" value="deriveType" />
      <link role="overriddenMethod" targetNodeId="1201184092299" resolveInfo="deriveType" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201184618199">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1201184623344">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1201184623345">
            <property name="name" value="type" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1201184623346">
              <link role="concept" targetNodeId="1.1068431790189" resolveInfo="Type" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1201184623347" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1201184623349">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201184623350">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1201184887981">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1201184887982">
                <property name="name" value="ancestor" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1201184887983" />
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977967559">
                  <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1201184900257" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1201184887985">
                    <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_ConceptList" id="1201184887986">
                      <node role="concept" type="jetbrains.mps.bootstrap.smodelLanguage.structure.ConceptReference" id="1201184887987">
                        <link role="concept" targetNodeId="1.1068580123132" resolveInfo="BaseMethodDeclaration" />
                      </node>
                      <node role="concept" type="jetbrains.mps.bootstrap.smodelLanguage.structure.ConceptReference" id="1201184887988">
                        <link role="concept" targetNodeId="1.1137021947720" resolveInfo="ConceptFunction" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1201184887990">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201184887991">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1201184887992">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1201184887993">
                    <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977965049">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977954162">
                        <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1201184887998">
                          <link role="concept" targetNodeId="1.1068580123132" resolveInfo="BaseMethodDeclaration" />
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201184887999">
                            <link role="variableDeclaration" targetNodeId="1201184887982" resolveInfo="ancestor" />
                          </node>
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1201184887997">
                          <link role="link" targetNodeId="1.1068580123133" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_CopyOperation" id="1201184887995" />
                    </node>
                    <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201184921755">
                      <link role="variableDeclaration" targetNodeId="1201184623345" resolveInfo="type" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977967742">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201184888004">
                  <link role="variableDeclaration" targetNodeId="1201184887982" resolveInfo="ancestor" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1201184888002">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1201184888003">
                    <link role="conceptDeclaration" targetNodeId="1.1068580123132" resolveInfo="BaseMethodDeclaration" />
                  </node>
                </node>
              </node>
              <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1201184888005">
                <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201184888006">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1201184888007">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1201184888008">
                      <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977951911">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977966084">
                          <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1201184888013">
                            <link role="concept" targetNodeId="1.1137021947720" resolveInfo="ConceptFunction" />
                            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201184888014">
                              <link role="variableDeclaration" targetNodeId="1201184887982" resolveInfo="ancestor" />
                            </node>
                          </node>
                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1201184888012">
                            <link role="conceptMethodDeclaration" targetNodeId="1178571276073" resolveInfo="getExpectedReturnType" />
                          </node>
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_CopyOperation" id="1201184888010" />
                      </node>
                      <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201184928174">
                        <link role="variableDeclaration" targetNodeId="1201184623345" resolveInfo="type" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1201184623389">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977968133">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1201184623392">
                <link role="variableDeclaration" targetNodeId="1201184620677" resolveInfo="expression" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsRoleOperation" id="1201184623391">
                <link role="conceptOfParent" targetNodeId="1.1068581242878" resolveInfo="ReturnStatement" />
                <link role="linkInParent" targetNodeId="1.1068581517676" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1201184623393">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977953885">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1201184623396">
                  <link role="variableDeclaration" targetNodeId="1201184620677" resolveInfo="expression" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1201184623395" />
              </node>
              <node role="rightExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1201184623397" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1201184623398">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201184623399">
            <link role="variableDeclaration" targetNodeId="1201184623345" resolveInfo="type" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1201184620677">
        <property name="name" value="expression" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1201184620678">
          <link role="concept" targetNodeId="1.1068431790191" resolveInfo="Expression" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1201184620680">
        <link role="concept" targetNodeId="1.1068431790189" resolveInfo="Type" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1201184947950">
    <link role="concept" targetNodeId="1.1068498886294" resolveInfo="AssignmentExpression" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1201184947951">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201184947952" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1201184952467">
      <property name="name" value="deriveType" />
      <link role="overriddenMethod" targetNodeId="1201184092299" resolveInfo="deriveType" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201184952469">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1201184974804">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1201184974805">
            <property name="name" value="type" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1201184974806">
              <link role="concept" targetNodeId="1.1068431790189" resolveInfo="Type" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1201184974807" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1201184974808">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201184974809">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1201185016310">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1201185018685">
                <node role="rValue" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1201185036847">
                  <link role="concept" targetNodeId="1.1068431790189" resolveInfo="Type" />
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977965905">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977954779">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977964965">
                        <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1201185020496" />
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1201185027776">
                          <link role="link" targetNodeId="1.1068498886295" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.helgins.structure.Node_TypeOperation" id="1201185030504" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_CopyOperation" id="1201185033618" />
                  </node>
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201185016311">
                  <link role="variableDeclaration" targetNodeId="1201184974805" resolveInfo="type" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1201184974818">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977963932">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1201184974821">
                <link role="variableDeclaration" targetNodeId="1201184954635" resolveInfo="expression" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsRoleOperation" id="1201184974820">
                <link role="conceptOfParent" targetNodeId="1.1068498886294" resolveInfo="AssignmentExpression" />
                <link role="linkInParent" targetNodeId="1.1068498886297" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1201184974822">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977963072">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1201184974825">
                  <link role="variableDeclaration" targetNodeId="1201184954635" resolveInfo="expression" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1201184974824" />
              </node>
              <node role="rightExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1201184974826" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1201184974827">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201184974828">
            <link role="variableDeclaration" targetNodeId="1201184974805" resolveInfo="type" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1201184954635">
        <property name="name" value="expression" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1201184954636">
          <link role="concept" targetNodeId="1.1068431790191" resolveInfo="Expression" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1201184954637">
        <link role="concept" targetNodeId="1.1068431790189" resolveInfo="Type" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1201372666943">
    <property name="package" value="property.implementation" />
    <link role="concept" targetNodeId="1.1201372346056" resolveInfo="PropertyImplementation" />
    <link role="defaultConcreteConcept" targetNodeId="1.1201372606839" resolveInfo="DefaultPropertyImplementation" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1202008483266">
      <property name="name" value="hasSetter" />
      <property name="isVirtual" value="true" />
      <property name="isAbstract" value="true" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1202008533207" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1202008483268" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1201372666944">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201372666945" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1201375204863">
    <property name="package" value="property" />
    <link role="concept" targetNodeId="1.1201370618622" resolveInfo="Property" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1201571498897">
      <property name="name" value="isDefaultImplementation" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1201571543765" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201571498899">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1201571552938">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977966287">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977956988">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1201571552939" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1201571557521">
                <link role="link" targetNodeId="1.1201372378714" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1201571561556">
              <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1201571563340">
                <link role="conceptDeclaration" targetNodeId="1.1201372606839" resolveInfo="DefaultPropertyImplementation" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1202009265236">
      <property name="name" value="isCustomImplementation" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1202009269151" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1202009265238">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1202009287793">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977964273">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977964503">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1202009287794" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1202009293579">
                <link role="link" targetNodeId="1.1201372378714" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1202009296708">
              <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1202009299960">
                <link role="conceptDeclaration" targetNodeId="1.1201398722958" resolveInfo="CustomPropertyImplementation" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1202009493962">
      <property name="name" value="getCustomPropertyImplementation" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1202009499037">
        <link role="concept" targetNodeId="1.1201398722958" resolveInfo="CustomPropertyImplementation" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1202009493964">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1202009524007">
          <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1202009529825">
            <link role="concept" targetNodeId="1.1201398722958" resolveInfo="CustomPropertyImplementation" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977964740">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1202009524008" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1202009527777">
                <link role="link" targetNodeId="1.1201372378714" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1202008955205">
      <property name="name" value="getPropertyNameWithId" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1202008964741">
        <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1202008955207">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1206151825187">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1206151828070">
            <link role="baseMethodDeclaration" targetNodeId="3.~NameUtil.capitalize(java.lang.String):java.lang.String" resolveInfo="capitalize" />
            <link role="classConcept" targetNodeId="3.~NameUtil" resolveInfo="NameUtil" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206151836104">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1206151835165" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1206151838652">
                <link role="property" targetNodeId="1.1201371481316" resolveInfo="propertyName" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1206152348095">
      <property name="name" value="getGetterMethodName" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206152425772">
        <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206152348097">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1206152448961">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1206152453634">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206152483648">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1206152482851" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1206152489057">
                <link role="conceptMethodDeclaration" targetNodeId="1202008955205" resolveInfo="getPropertyNameWithId" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1206152448962">
              <property name="value" value="get" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1206152502448">
      <property name="name" value="getSetterMethodName" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206152502449">
        <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206152502450">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1206152502451">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1206152502452">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206152502453">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1206152502454" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1206152502455">
                <link role="conceptMethodDeclaration" targetNodeId="1202008955205" resolveInfo="getPropertyNameWithId" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1206152502456">
              <property name="value" value="set" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1202090653454">
      <property name="name" value="getSetterVisibility" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1202090699410">
        <link role="concept" targetNodeId="1.1146644584814" resolveInfo="Visibility" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1202090653456">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1202090743011">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1202090743012">
            <property name="name" value="visibility" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1202090743013">
              <link role="concept" targetNodeId="1.1146644584814" resolveInfo="Visibility" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977966396">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1202090743015" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1202090743016">
                <link role="link" targetNodeId="1.1178549979242" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1202090851177">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1202090851178">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1202094810888">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1202094810889">
                <property name="name" value="setterVisibility" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1202094810890">
                  <link role="concept" targetNodeId="1.1146644584814" resolveInfo="Visibility" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977962654">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977967301">
                    <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1202094810893">
                      <link role="concept" targetNodeId="1.1201372606839" resolveInfo="DefaultPropertyImplementation" />
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977966112">
                        <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1202094810895" />
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1202094810896">
                          <link role="link" targetNodeId="1.1201372378714" />
                        </node>
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1202094810897">
                      <link role="link" targetNodeId="1.1202078082794" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1202094810898">
                    <link role="link" targetNodeId="1.1202077744034" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1202094814368">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1202094814369">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1202094821846">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1202094823848">
                    <node role="rValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1202094825289">
                      <link role="variableDeclaration" targetNodeId="1202094810889" resolveInfo="setterVisibility" />
                    </node>
                    <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1202094821847">
                      <link role="variableDeclaration" targetNodeId="1202090743012" resolveInfo="visibility" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977963567">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1202094816622">
                  <link role="variableDeclaration" targetNodeId="1202094810889" resolveInfo="setterVisibility" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNotNullOperation" id="1202094819673" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977965588">
            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1202090853635" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1202090853636">
              <link role="conceptMethodDeclaration" targetNodeId="1201571498897" resolveInfo="isDefaultImplementation" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1202090745034">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1202090745035">
            <link role="variableDeclaration" targetNodeId="1202090743012" resolveInfo="visibility" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1202595424897">
      <property name="name" value="hasSetter" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1202595429016" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1202595424899">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1202595513017">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977966157">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977954860">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1202595513018" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1202595517710">
                <link role="link" targetNodeId="1.1201372378714" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1202595521105">
              <link role="conceptMethodDeclaration" targetNodeId="1202008483266" resolveInfo="hasSetter" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="properties" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodePropertyConstraint" id="1201386039238">
      <link role="applicableProperty" targetNodeId="2.1156235010670" resolveInfo="alias" />
      <node role="propertyGetter" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_PropertyGetter" id="1201386042317">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201386042318">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1201386045297">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977963699">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintsFunctionParameter_node" id="1201386045298" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1201386051989">
                <link role="property" targetNodeId="1.1201371481316" resolveInfo="propertyName" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="properties" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodePropertyConstraint" id="1209153878824">
      <link role="applicableProperty" targetNodeId="2.1169194664001" resolveInfo="name" />
      <node role="propertyGetter" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_PropertyGetter" id="1209153882934">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1209153882935">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1209153929575">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209153931592">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintsFunctionParameter_node" id="1209153929576" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1209154440064">
                <link role="property" targetNodeId="1.1201371481316" resolveInfo="propertyName" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1201375204864">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201375204865">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1201375213647">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977956859">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977965276">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1201375213648" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1201375221434">
                <link role="link" targetNodeId="1.1178549979242" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetNewChildOperation" id="1201375322691">
              <link role="concept" targetNodeId="1.1146644602865" resolveInfo="PublicVisibility" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1201993599076">
    <property name="package" value="property" />
    <link role="concept" targetNodeId="1.1201385106094" resolveInfo="PropertyReference" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1202595610107">
      <property name="name" value="isLValue" />
      <link role="overriddenMethod" targetNodeId="1202595004827" resolveInfo="isLValue" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1202595610109">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1202595622075">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977957082">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977954918">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1202595622076" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1202595628049">
                <link role="link" targetNodeId="1.1201385237847" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1202595630818">
              <link role="conceptMethodDeclaration" targetNodeId="1202595424897" resolveInfo="hasSetter" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1202595615047" />
    </node>
    <node role="references" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodeReferentConstraint" id="1201995131114">
      <link role="applicableLink" targetNodeId="1.1201385237847" />
      <node role="searchScopeFactory" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_ReferentSearchScope_Factory" id="1201995135037">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201995135038">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1201996734489">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1201996734490">
              <property name="name" value="resultProperties" />
              <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1201996734491">
                <node role="elementType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1201996734492">
                  <link role="concept" targetNodeId="1.1201370618622" resolveInfo="Property" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1201996734493">
                <node role="creator" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListCreatorWithInit" id="1201996734494">
                  <node role="elementType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1201996734495">
                    <link role="concept" targetNodeId="1.1201370618622" resolveInfo="Property" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1201997296913">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1201997296914">
              <property name="name" value="opClassifier" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1201997296915">
                <link role="concept" targetNodeId="1.1107461130800" resolveInfo="Classifier" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977964866">
                <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1201997304736">
                  <link role="concept" targetNodeId="1.1197027756228" resolveInfo="OperationExpression" />
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptParameter_ReferentSearchScope_enclosingNode" id="1201997301766" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1201997296918">
                  <link role="conceptMethodDeclaration" targetNodeId="1201997214164" resolveInfo="getClassifier" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1201995724066">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1201995724067">
              <property name="name" value="classifiers" />
              <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1201995736853">
                <node role="elementType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1201995739871">
                  <link role="concept" targetNodeId="1.1107461130800" resolveInfo="Classifier" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204332445049">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1201995768232">
                  <link role="baseMethodDeclaration" targetNodeId="10.~ClassifierAndSuperClassifiersCache.getInstance(jetbrains.mps.smodel.SNode):jetbrains.mps.baseLanguage.search.ClassifierAndSuperClassifiersCache" resolveInfo="getInstance" />
                  <link role="classConcept" targetNodeId="10.~ClassifierAndSuperClassifiersCache" resolveInfo="ClassifierAndSuperClassifiersCache" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201997296919">
                    <link role="variableDeclaration" targetNodeId="1201997296914" resolveInfo="opClassifier" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204332445050">
                  <link role="baseMethodDeclaration" targetNodeId="10.~ClassifierAndSuperClassifiersCache.getClassifierNodes():java.util.List" resolveInfo="getClassifierNodes" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1201996266350">
            <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1201996266351">
              <property name="name" value="classifier" />
            </node>
            <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201996269324">
              <link role="variableDeclaration" targetNodeId="1201995724067" resolveInfo="classifiers" />
            </node>
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201996266353">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1201996280671">
                <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977966057">
                  <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1201996307494">
                    <link role="variable" targetNodeId="1201996266351" resolveInfo="classifier" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1201996280673">
                    <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1201996280674">
                      <link role="conceptDeclaration" targetNodeId="1.1068390468198" resolveInfo="ClassConcept" />
                    </node>
                  </node>
                </node>
                <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201996280676">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1201996280677">
                    <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1201996280678">
                      <property name="name" value="classConcept" />
                      <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1201996280679">
                        <link role="concept" targetNodeId="1.1068390468198" resolveInfo="ClassConcept" />
                      </node>
                      <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1201996280680">
                        <link role="concept" targetNodeId="1.1068390468198" resolveInfo="ClassConcept" />
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1201996312027">
                          <link role="variable" targetNodeId="1201996266351" resolveInfo="classifier" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1201996280682">
                    <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1201996280683">
                      <property name="name" value="properties" />
                      <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1201996280684">
                        <link role="elementConcept" targetNodeId="1.1201370618622" resolveInfo="Property" />
                      </node>
                      <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977951883">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201996280686">
                          <link role="variableDeclaration" targetNodeId="1201996280678" resolveInfo="classConcept" />
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1206572417741">
                          <link role="link" targetNodeId="1.1201374247313" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1201996325043">
                    <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1201996325044">
                      <property name="name" value="property" />
                    </node>
                    <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201996326455">
                      <link role="variableDeclaration" targetNodeId="1201996280683" resolveInfo="properties" />
                    </node>
                    <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201996325046">
                      <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1201996351582">
                        <node role="condition" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1201996364601">
                          <link role="classConcept" targetNodeId="10.~VisibilityUtil" resolveInfo="VisibilityUtil" />
                          <link role="baseMethodDeclaration" targetNodeId="10.~VisibilityUtil.isVisible(jetbrains.mps.smodel.SNode,jetbrains.mps.smodel.SNode):boolean" resolveInfo="isVisible" />
                          <node role="actualArgument" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptParameter_ReferentSearchScope_enclosingNode" id="1201996590590" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1201996394791">
                            <link role="variable" targetNodeId="1201996325044" resolveInfo="property" />
                          </node>
                        </node>
                        <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201996351584">
                          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1201996754891">
                            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206572405546">
                              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201996754892">
                                <link role="variableDeclaration" targetNodeId="1201996734490" resolveInfo="resultProperties" />
                              </node>
                              <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddElementOperation" id="1201996759224">
                                <node role="argument" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1201996762352">
                                  <link role="variable" targetNodeId="1201996325044" resolveInfo="property" />
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
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1201996742700">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1201996742701">
              <link role="baseMethodDeclaration" targetNodeId="5.~SimpleSearchScope.&lt;init&gt;(java.util.List)" resolveInfo="SimpleSearchScope" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201996749936">
                <link role="variableDeclaration" targetNodeId="1201996734490" resolveInfo="resultProperties" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="searchScopeCanCreate" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_ReferentSearchScope_CanCreate" id="1201996837216">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201996837217">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1201997147987">
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201997147988">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1201997165596">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1201997167114">
                  <property name="value" value="false" />
                </node>
              </node>
            </node>
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1201997163638">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977955255">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptParameter_ReferentSearchScope_enclosingNode" id="1201997163640" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1201997163641">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1201997163642">
                    <link role="conceptDeclaration" targetNodeId="1.1197027756228" resolveInfo="OperationExpression" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1201996847142">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977964691">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977965775">
                <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1201997173459">
                  <link role="concept" targetNodeId="1.1197027756228" resolveInfo="OperationExpression" />
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptParameter_ReferentSearchScope_enclosingNode" id="1201997028375" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1201996852038">
                  <link role="conceptMethodDeclaration" targetNodeId="1201997214164" resolveInfo="getClassifier" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNotNullOperation" id="1201996858479" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1201993599077">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201993599078" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1202008567255">
    <property name="package" value="property.implementation.default" />
    <link role="concept" targetNodeId="1.1201372606839" resolveInfo="DefaultPropertyImplementation" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1202008570383">
      <property name="name" value="hasSetter" />
      <link role="overriddenMethod" targetNodeId="1202008483266" resolveInfo="hasSetter" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1202008570385">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1202078471192">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1202078471193">
            <property name="value" value="true" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1202008576120" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1202008567256">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1202008567257" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1202008650359">
    <property name="package" value="property.implementation.custom" />
    <link role="concept" targetNodeId="1.1201398722958" resolveInfo="CustomPropertyImplementation" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1202008652628">
      <property name="name" value="hasSetter" />
      <link role="overriddenMethod" targetNodeId="1202008483266" resolveInfo="hasSetter" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1202008652630">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1202008678897">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977951849">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977962754">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1202008678898" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1202008682699">
                <link role="link" targetNodeId="1.1201476937466" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNotNullOperation" id="1202008685625" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1202008656412" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1202008650360">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1202008650361" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1202077784185">
    <property name="package" value="property.implementation.default" />
    <link role="concept" targetNodeId="1.1202077725299" resolveInfo="DefaultSetAccessor" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1202077784186">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1202077784187">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1202077796213">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977967746">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977964330">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1202077796214" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1202077800125">
                <link role="link" targetNodeId="1.1202077744034" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetNewChildOperation" id="1202077810004">
              <link role="concept" targetNodeId="1.1146644623116" resolveInfo="PrivateVisibility" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1202949801225">
    <property name="package" value="method.instance" />
    <link role="concept" targetNodeId="1.1202948039474" resolveInfo="InstanceMethodCallOperation" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1202949801226">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1202949801227" />
    </node>
    <node role="references" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodeReferentConstraint" id="1202949807248">
      <link role="applicableLink" targetNodeId="1.1202948736718" />
      <node role="searchScopeFactory" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_ReferentSearchScope_Factory" id="1202949807249">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1202949807250">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1202952099868">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1202952099869">
              <property name="name" value="instance" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1202952099870">
                <link role="concept" targetNodeId="1.1068431790191" resolveInfo="Expression" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977963801">
                <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1202952099872">
                  <link role="concept" targetNodeId="1.1197027756228" resolveInfo="OperationExpression" />
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptParameter_ReferentSearchScope_enclosingNode" id="1202952099873" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1202952099874">
                  <link role="link" targetNodeId="1.1197027771414" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1202952099875">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1202952099876">
              <property name="name" value="classifierType" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1202952099877">
                <link role="concept" targetNodeId="1.1107535904670" resolveInfo="ClassifierType" />
              </node>
              <node role="initializer" type="jetbrains.mps.bootstrap.helgins.structure.CoerceStrongExpression" id="1202952099878">
                <node role="nodeToCoerce" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203977956083">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1202952099881">
                    <link role="variableDeclaration" targetNodeId="1202952099869" resolveInfo="instance" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.helgins.structure.Node_TypeOperation" id="1202952099880" />
                </node>
                <node role="pattern" type="jetbrains.mps.bootstrap.helgins.structure.ConceptReference" id="1202952099882">
                  <property name="name" value="foo" />
                  <link role="concept" targetNodeId="1.1107535904670" resolveInfo="ClassifierType" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1202952192763">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1202952192764">
              <link role="baseMethodDeclaration" targetNodeId="32.~InstanceMethodCall_InstanceMethodScope.&lt;init&gt;(jetbrains.mps.baseLanguage.structure.ClassifierType,jetbrains.mps.smodel.SNode)" resolveInfo="InstanceMethodCall_InstanceMethodScope" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204672721429">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1202952192767">
                  <link role="variableDeclaration" targetNodeId="1202952099876" resolveInfo="classifierType" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAdapterOperation" id="1202952192766" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptParameter_ReferentSearchScope_enclosingNode" id="1203009828736" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1205839397631">
    <property name="package" value="method.static" />
    <link role="concept" targetNodeId="1.1081236700938" resolveInfo="StaticMethodDeclaration" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1205839397632">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205839397633" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1205839403910">
      <property name="name" value="isMainMethod" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1205839403911" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205839403912">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1205839403913">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1205839403914">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1205839403915">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1205839403916">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205839403917">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205839403918">
                    <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1205839417642" />
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1205839421967">
                      <link role="link" targetNodeId="1.1068580123134" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetSizeOperation" id="1205839403921" />
                </node>
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205839403922">
                  <property name="value" value="1" />
                </node>
              </node>
              <node role="rightExpression" type="jetbrains.mps.bootstrap.helgins.structure.IsStrongSubtypeExpression" id="1205839403923">
                <node role="subtypeExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205859950248">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205839403924">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205839403925">
                      <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1205839424849" />
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1205839428042">
                        <link role="link" targetNodeId="1.1068580123134" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetFirstOperation" id="1205839403928" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.helgins.structure.Node_TypeOperation" id="1205859952142" />
                </node>
                <node role="supertypeExpression" type="jetbrains.mps.quotation.structure.Quotation" id="1205839403929">
                  <node role="quotedNode" type="jetbrains.mps.baseLanguage.structure.ArrayType" id="1205839403930">
                    <node role="componentType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205839403931">
                      <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205839403932">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1205839403933">
                <property name="value" value="main" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205839403934">
                <link role="baseMethodDeclaration" targetNodeId="13.~String.equals(java.lang.Object):boolean" resolveInfo="equals" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205839403935">
                  <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1205839412384" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1205839415182">
                    <link role="property" targetNodeId="1.1083152972672" resolveInfo="name" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1206036075775">
    <property name="package" value="type" />
    <link role="concept" targetNodeId="1.1206036041805" resolveInfo="IInternalType" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1206036091684">
      <property name="name" value="getPublicType" />
      <property name="isVirtual" value="true" />
      <property name="isAbstract" value="true" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1206036101776">
        <link role="concept" targetNodeId="1.1068431790189" resolveInfo="Type" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206036091686" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1206036075776">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206036075777" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1206464901154">
    <link role="concept" targetNodeId="1.1081855346303" resolveInfo="BreakStatement" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1206464967689">
      <property name="name" value="getLoop" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1206465006301">
        <link role="concept" targetNodeId="1.1154032098014" resolveInfo="AbstractLoopStatement" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206464967691">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207558187059">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207558187060">
            <property name="name" value="loopOrSwitch" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207558187061" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208467025211">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1207558193939" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1207558193940">
                <link role="conceptMethodDeclaration" targetNodeId="1207557724489" resolveInfo="getLoopOrSwitch" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1207558195098">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207558195099">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1207558202029">
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1207558221948">
                <link role="concept" targetNodeId="1.1154032098014" resolveInfo="AbstractLoopStatement" />
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207558202891">
                  <link role="variableDeclaration" targetNodeId="1207558187060" resolveInfo="loopOrSwitch" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207558216350">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207558215614">
              <link role="variableDeclaration" targetNodeId="1207558187060" resolveInfo="loopOrSwitch" />
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1207558217805">
              <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1207558219368">
                <link role="conceptDeclaration" targetNodeId="1.1154032098014" resolveInfo="AbstractLoopStatement" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1207558205330">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1207558227044" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1207557694904">
      <property name="name" value="getSwitch" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207557696407">
        <link role="concept" targetNodeId="1.1163670490218" resolveInfo="SwitchStatement" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207557694906">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207558232781">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207558232782">
            <property name="name" value="loopOrSwitch" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207558232783" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208467025194">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1207558232785" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1207558232786">
                <link role="conceptMethodDeclaration" targetNodeId="1207557724489" resolveInfo="getLoopOrSwitch" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1207558232787">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207558232788">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1207558232789">
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1207558232790">
                <link role="concept" targetNodeId="1.1163670490218" resolveInfo="SwitchStatement" />
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207558232791">
                  <link role="variableDeclaration" targetNodeId="1207558232782" resolveInfo="loopOrSwitch" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207558232792">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207558232793">
              <link role="variableDeclaration" targetNodeId="1207558232782" resolveInfo="loopOrSwitch" />
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1207558232794">
              <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1207558236126">
                <link role="conceptDeclaration" targetNodeId="1.1163670490218" resolveInfo="SwitchStatement" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1207558232796">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1207558232797" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1207557724489">
      <property name="isPrivate" value="true" />
      <property name="name" value="getLoopOrSwitch" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207557728351" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207557724491">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1207557741165">
          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207557749094">
            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1207557748765" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorsOperation" id="1207557751331">
              <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_ConceptList" id="1207557755349">
                <node role="concept" type="jetbrains.mps.bootstrap.smodelLanguage.structure.ConceptReference" id="1207557757898">
                  <link role="concept" targetNodeId="1.1154032098014" resolveInfo="AbstractLoopStatement" />
                </node>
                <node role="concept" type="jetbrains.mps.bootstrap.smodelLanguage.structure.ConceptReference" id="1207557762009">
                  <link role="concept" targetNodeId="1.1163670490218" resolveInfo="SwitchStatement" />
                </node>
              </node>
            </node>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207557741167">
            <property name="name" value="item" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207557741920" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207557741169">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1207557844103">
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1207557852173">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1207557861765">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1207557862909" />
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207557860278">
                    <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1207557859699" />
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1207557861202">
                      <link role="property" targetNodeId="1.1199466066648" resolveInfo="label" />
                    </node>
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207557848091">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207557847715">
                    <link role="variableDeclaration" targetNodeId="1207557741167" resolveInfo="item" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1207557849531">
                    <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1207557851094">
                      <link role="conceptDeclaration" targetNodeId="1.1163670490218" resolveInfo="SwitchStatement" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207557844105">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1207557863894">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207557864756">
                    <link role="variableDeclaration" targetNodeId="1207557741167" resolveInfo="item" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1207557893445">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207557893446">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207557900908">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207557900909">
                    <property name="name" value="loop" />
                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207557900910">
                      <link role="concept" targetNodeId="1.1154032098014" resolveInfo="AbstractLoopStatement" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1207557909116">
                      <link role="concept" targetNodeId="1.1154032098014" resolveInfo="AbstractLoopStatement" />
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207557907709">
                        <link role="variableDeclaration" targetNodeId="1207557741167" resolveInfo="item" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1207557915416">
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207557915417">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1207558141064">
                      <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207558141065">
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1207558158283">
                          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207558159410">
                            <link role="variableDeclaration" targetNodeId="1207557900909" resolveInfo="loop" />
                          </node>
                        </node>
                      </node>
                      <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1207558156123">
                        <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1207558157298" />
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207558154292">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207558153510">
                            <link role="variableDeclaration" targetNodeId="1207557900909" resolveInfo="loop" />
                          </node>
                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1207558155435">
                            <link role="property" targetNodeId="1.1199465379613" resolveInfo="label" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1207558132322">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1207558133403" />
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207558126365">
                      <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1207558125911" />
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1207558131696">
                        <link role="property" targetNodeId="1.1199466066648" resolveInfo="label" />
                      </node>
                    </node>
                  </node>
                  <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1207558139733">
                    <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207558139734">
                      <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1207558162849">
                        <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207558162850">
                          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1207558177036">
                            <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207558178038">
                              <link role="variableDeclaration" targetNodeId="1207557900909" resolveInfo="loop" />
                            </node>
                          </node>
                        </node>
                        <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207558168357">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207558166135">
                            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1209906359977" />
                            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1209906377075">
                              <link role="property" targetNodeId="1.1199466066648" resolveInfo="label" />
                            </node>
                          </node>
                          <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207558170140">
                            <link role="baseMethodDeclaration" targetNodeId="13.~String.equals(java.lang.Object):boolean" resolveInfo="equals" />
                            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209906372770">
                              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209906371818">
                                <link role="variableDeclaration" targetNodeId="1207557900909" resolveInfo="loop" />
                              </node>
                              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1209906374414">
                                <link role="property" targetNodeId="1.1199465379613" resolveInfo="label" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207557895029">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207557894309">
                  <link role="variableDeclaration" targetNodeId="1207557741167" resolveInfo="item" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1207557896562">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1207557898828">
                    <link role="conceptDeclaration" targetNodeId="1.1154032098014" resolveInfo="AbstractLoopStatement" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1207558179821">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1207558181042" />
        </node>
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1206464901155">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206464901156" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1206465090748">
    <link role="concept" targetNodeId="1.1082113931046" resolveInfo="ContinueStatement" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1206465090749">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206465090750" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1206465092861">
      <property name="name" value="getLoop" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1206465092862">
        <link role="concept" targetNodeId="1.1154032098014" resolveInfo="AbstractLoopStatement" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206465092863">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1206465092864">
          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206465092865">
            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1206465092866" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorsOperation" id="1206465092867">
              <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1206465092868">
                <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1207781905978">
                  <link role="conceptDeclaration" targetNodeId="1.1154032098014" resolveInfo="AbstractLoopStatement" />
                </node>
              </node>
            </node>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1206465092869">
            <property name="name" value="loop" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1206465092870">
              <link role="concept" targetNodeId="1.1154032098014" resolveInfo="AbstractLoopStatement" />
            </node>
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206465092871">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1206465092872">
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1206465092873">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1206465092874" />
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206465092875">
                  <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1206465092876" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1206465101163">
                    <link role="property" targetNodeId="1.1199470060942" resolveInfo="label" />
                  </node>
                </node>
              </node>
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206465092878">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1206465092879">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1206465092880">
                    <link role="variableDeclaration" targetNodeId="1206465092869" resolveInfo="loop" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1206465092881">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206465092882">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1206465092883">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1206465092884">
                    <link role="variableDeclaration" targetNodeId="1206465092869" resolveInfo="loop" />
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206465092885">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206465092886">
                  <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1206465092887" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1206465102587">
                    <link role="property" targetNodeId="1.1199470060942" resolveInfo="label" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1206465092889">
                  <link role="baseMethodDeclaration" targetNodeId="13.~String.equals(java.lang.Object):boolean" resolveInfo="equals" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206465092890">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1206465092891">
                      <link role="variableDeclaration" targetNodeId="1206465092869" resolveInfo="loop" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1206465106714">
                      <link role="property" targetNodeId="1.1199465379613" resolveInfo="label" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207321068467">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207321069453">
            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1207321068468" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1207321071236">
              <link role="conceptMethodDeclaration" targetNodeId="1206465092861" resolveInfo="getLoop" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1206536732916">
    <property name="package" value="if" />
    <link role="concept" targetNodeId="1.1206060495898" resolveInfo="ElsifClause" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1206536734450">
      <property name="name" value="getIfStatement" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1206536787924">
        <link role="concept" targetNodeId="1.1068580123159" resolveInfo="IfStatement" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206536734452">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1206536795581">
          <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1206536814462">
            <link role="concept" targetNodeId="1.1068580123159" resolveInfo="IfStatement" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206536801459">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1206536801161" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1206536812336" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1206536732917">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206536732918" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1207124398550">
    <link role="concept" targetNodeId="1.1152728232947" resolveInfo="Closure" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1207124398551">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207124398552" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1207138976999">
    <link role="concept" targetNodeId="1.1068498886296" resolveInfo="VariableReference" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1207138977000">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207138977001" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1207138978268">
      <property name="name" value="isClosureReference" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1207138978269" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207138978270">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207138978271">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207138978272">
            <property name="name" value="closureoid" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207138978273">
              <link role="concept" targetNodeId="1.1207665819089" resolveInfo="Closureoid" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207138978274">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1207138978275" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1207138978276">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1207138978277">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1207665921174">
                    <link role="conceptDeclaration" targetNodeId="1.1207665819089" resolveInfo="Closureoid" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1207138978278">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207138978279">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1207138978280">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1207138978281">
                <property name="value" value="false" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207138978282">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207138978283">
              <link role="variableDeclaration" targetNodeId="1207138978272" resolveInfo="closure" />
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNullOperation" id="1207138978284" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207138978285">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207138978286">
            <property name="name" value="declaration" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207138978287">
              <link role="concept" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207138978288">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1207138978289" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1207138986038">
                <link role="link" targetNodeId="1.1068581517664" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1207138978291">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207138978292">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1207138978293">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1207138978294">
                <property name="value" value="false" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207138978295">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207138978296">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207138978297">
                <link role="variableDeclaration" targetNodeId="1207138978286" resolveInfo="declaration" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorsOperation" id="1207138978298" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ContainsOperation" id="1207138978299">
              <node role="argument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207138978300">
                <link role="variableDeclaration" targetNodeId="1207138978272" resolveInfo="closure" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1207138978301">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1207138978302">
            <property name="value" value="true" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1207236153543">
    <property name="package" value="method" />
    <link role="concept" targetNodeId="1.1068498886292" resolveInfo="ParameterDeclaration" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1207236155124">
      <property name="name" value="createReference" />
      <link role="overriddenMethod" targetNodeId="1207235870860" resolveInfo="createReference" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207236155126">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207236171883">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207236171884">
            <property name="name" value="ref" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207236171885">
              <link role="concept" targetNodeId="1.1068581242874" resolveInfo="ParameterReference" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1207236176200">
              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1207236176201">
                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207236176202">
                  <link role="concept" targetNodeId="1.1068581242874" resolveInfo="ParameterReference" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207236177579">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1207236180037">
            <node role="rValue" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1207236180852" />
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207236178159">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207236177580">
                <link role="variableDeclaration" targetNodeId="1207236171884" resolveInfo="ref" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1207236179676">
                <link role="link" targetNodeId="1.1070567982819" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1207236182886">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207236183841">
            <link role="variableDeclaration" targetNodeId="1207236171884" resolveInfo="ref" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207236157299">
        <link role="concept" targetNodeId="1.1068498886296" resolveInfo="VariableReference" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1207236153544">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207236153545" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1208784217702">
    <link role="concept" targetNodeId="1.1168622733562" resolveInfo="RemarkStatement" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1208784222268">
      <property name="name" value="isTodo" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1208784268527" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208784222270">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1208784314202">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1208784314203">
            <property name="name" value="v" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208784314204">
              <link role="classifier" targetNodeId="13.~String" resolveInfo="String" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208784314205">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1208784319469" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1208784314207">
                <link role="property" targetNodeId="1.1168623065899" resolveInfo="value" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1208784314208">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1208784314209">
            <property name="name" value="isToDo" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1208784314210" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1208784314211">
              <property name="value" value="false" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1208784314212">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1208784314213">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1208784314214" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208784314215">
              <link role="variableDeclaration" targetNodeId="1208784314203" resolveInfo="v" />
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208784314216">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1208784314217">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1208784314218">
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208784314219">
                  <link role="variableDeclaration" targetNodeId="1208784314209" resolveInfo="isToDo" />
                </node>
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.OrExpression" id="1208784314220">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.OrExpression" id="1208784314221">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208784314222">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208784314223">
                        <link role="variableDeclaration" targetNodeId="1208784314203" resolveInfo="v" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208784314224">
                        <link role="baseMethodDeclaration" targetNodeId="13.~String.startsWith(java.lang.String):boolean" resolveInfo="startsWith" />
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1208784314225">
                          <property name="value" value="todo:" />
                        </node>
                      </node>
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208784314226">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208784314227">
                        <link role="variableDeclaration" targetNodeId="1208784314203" resolveInfo="v" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208784314228">
                        <link role="baseMethodDeclaration" targetNodeId="13.~String.startsWith(java.lang.String):boolean" resolveInfo="startsWith" />
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1208784314229">
                          <property name="value" value="FIX:" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208784314230">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208784314231">
                      <link role="variableDeclaration" targetNodeId="1208784314203" resolveInfo="v" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208784314232">
                      <link role="baseMethodDeclaration" targetNodeId="13.~String.startsWith(java.lang.String):boolean" resolveInfo="startsWith" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1208784314233">
                        <property name="value" value="TODO:" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1208784408637">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208784411983">
            <link role="variableDeclaration" targetNodeId="1208784314209" resolveInfo="isToDo" />
          </node>
        </node>
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1208784217703">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208784217704" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1208890851807">
    <property name="package" value="dotExpression" />
    <link role="concept" targetNodeId="1.1208890769693" resolveInfo="ArrayLengthOperation" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1208890851808">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208890851809" />
    </node>
    <node role="canBeAChild" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_CanBeAChild" id="1208890856901">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208890856902">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1208890929881">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1208890929882">
            <property name="name" value="result" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1208890929883" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1208890932611">
              <property name="value" value="false" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1208890936512">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208890936513">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1208890996927">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1208891023419">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1208891023420">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1208891023421" />
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.helgins.structure.CoerceStrongExpression" id="1208891023422">
                    <node role="pattern" type="jetbrains.mps.bootstrap.helgins.structure.ConceptReference" id="1208891023423">
                      <property name="name" value="arrayType" />
                      <link role="concept" targetNodeId="1.1070534760951" resolveInfo="ArrayType" />
                    </node>
                    <node role="nodeToCoerce" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208891023424">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208891023425">
                        <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1208891023426">
                          <link role="concept" targetNodeId="1.1197027756228" resolveInfo="DotExpression" />
                          <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunctionParameter_parentNode" id="1208891023427" />
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1208891023428">
                          <link role="link" targetNodeId="1.1197027771414" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.helgins.structure.Node_TypeOperation" id="1208891023429" />
                    </node>
                  </node>
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208891025484">
                  <link role="variableDeclaration" targetNodeId="1208890929882" resolveInfo="result" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208890941370">
            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunctionParameter_parentNode" id="1208890940796" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1208890942577">
              <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1208890945326">
                <link role="conceptDeclaration" targetNodeId="1.1197027756228" resolveInfo="DotExpression" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1208890934995">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208890934996">
            <link role="variableDeclaration" targetNodeId="1208890929882" resolveInfo="result" />
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

