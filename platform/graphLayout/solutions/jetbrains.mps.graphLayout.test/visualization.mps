<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:964bbf7c-f239-4721-836a-ba42f2f69703(visualization)">
  <persistence version="7" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="83888646-71ce-4f1c-9c53-c54016f6ad4f(jetbrains.mps.baseLanguage.collections)" />
  <language namespace="fd392034-7849-419d-9071-12563d152375(jetbrains.mps.baseLanguage.closures)" />
  <import index="ko86" modelUID="f:java_stub#javax.swing.text(javax.swing.text@java_stub)" version="-1" />
  <import index="vhgx" modelUID="f:java_stub#java.lang(java.lang@java_stub)" version="-1" />
  <import index="aequ" modelUID="r:d228b8c9-d2b1-4686-9904-e3c49a346bc6(jetbrains.mps.graphLayout.graph)" version="-1" />
  <import index="trlv" modelUID="r:56e7ed05-c300-4310-9801-1a49a3ba1a5a(jetbrains.mps.graphLayout.layeredLayout)" version="-1" />
  <import index="t147" modelUID="f:java_stub#javax.swing(javax.swing@java_stub)" version="-1" />
  <import index="2uit" modelUID="f:java_stub#java.awt(java.awt@java_stub)" version="-1" />
  <import index="yjwb" modelUID="f:java_stub#java.util(java.util@java_stub)" version="-1" />
  <import index="46vv" modelUID="f:java_stub#java.awt.event(java.awt.event@java_stub)" version="-1" />
  <import index="35o0" modelUID="r:1674ee60-7c44-4176-8f8c-2c87c767d971(sampleGraphs)" version="-1" />
  <import index="tiz1" modelUID="f:java_stub#java.io(java.io@java_stub)" version="-1" />
  <import index="eqmc" modelUID="r:e4338979-215b-4b9c-a1e7-b887743c18eb(layeredLayoutTest)" version="-1" />
  <import index="c1ao" modelUID="r:6d741586-5996-4cd2-b3d3-7b04b7dd2971(jetbrains.mps.graphLayout.planarGraph)" version="-1" />
  <import index="rm96" modelUID="r:839ad18f-aa0d-4b1a-8b4c-ca87cf3bcac6(jetbrains.mps.graphLayout.graphLayout)" version="-1" />
  <import index="kw11" modelUID="r:c20b0f8c-abbe-4eb9-8b1f-6472cf6ea30c(jetbrains.mps.graphLayout.stOrthogonalLayout)" version="-1" />
  <import index="4t6q" modelUID="r:0556f5bf-4f71-4957-94d0-632c34bda241(jetbrains.mps.graphLayout.flowOrthogonalLayout)" version="-1" />
  <import index="ms8h" modelUID="r:0d165b79-85c3-4fee-8efc-b69a37e1c2ee(orthogonalLayoutTest)" version="-1" />
  <import index="4dwg" modelUID="r:5498b4d6-623f-4d7c-a07f-396c96e14007(jetbrains.mps.graphLayout.intGeom2D)" version="-1" />
  <import index="yvor" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" implicit="yes" />
  <import index="yvnu" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" implicit="yes" />
  <import index="yvix" modelUID="r:00000000-0000-4000-0000-011c8959032e(jetbrains.mps.baseLanguage.collections.structure)" version="7" implicit="yes" />
  <import index="yviq" modelUID="r:00000000-0000-4000-0000-011c89590338(jetbrains.mps.baseLanguage.closures.structure)" version="3" implicit="yes" />
  <import index="jh5a" modelUID="r:964bbf7c-f239-4721-836a-ba42f2f69703(visualization)" version="-1" implicit="yes" />
  <roots>
    <node type="yvor.ClassConcept" typeId="yvor.1068390468198:3" id="1567683135099906914">
      <property name="name" nameId="yvnu.1169194664001:0" value="GraphIO" />
    </node>
    <node type="yvor.ClassConcept" typeId="yvor.1068390468198:3" id="1567683135099907102">
      <property name="name" nameId="yvnu.1169194664001:0" value="TestPanel" />
    </node>
    <node type="yvor.ClassConcept" typeId="yvor.1068390468198:3" id="903391227141130074">
      <property name="name" nameId="yvnu.1169194664001:0" value="LayoutPainter" />
    </node>
    <node type="yvor.ClassConcept" typeId="yvor.1068390468198:3" id="903391227141135207">
      <property name="name" nameId="yvnu.1169194664001:0" value="OrthogonalLayoutTestPanel" />
    </node>
    <node type="yvor.ClassConcept" typeId="yvor.1068390468198:3" id="8729833695221588600">
      <property name="name" nameId="yvnu.1169194664001:0" value="RectLayoutTestPanel" />
    </node>
  </roots>
  <root id="1567683135099906914">
    <node role="staticMethod" roleId="yvor.1070462273904:3" type="yvor.StaticMethodDeclaration" typeId="yvor.1081236700938:3" id="7727845083901344073">
      <property name="name" nameId="yvnu.1169194664001:0" value="scanGraph" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="7727845083901344077">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="aequ.8567569493821103298" resolveInfo="Graph" />
      </node>
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="7727845083901344075" />
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="7727845083901344078">
        <property name="name" nameId="yvnu.1169194664001:0" value="graphString" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.StringType" typeId="yvor.1225271177708:3" id="7727845083901344079" />
      </node>
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="7727845083901369799">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="7727845083901369800">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.LocalStaticMethodCall" typeId="yvor.1172058436953:3" id="7727845083901369802">
            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1567683135099906915" resolveInfo="scanGraph" />
            <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="7727845083901369803">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="7727845083901371793">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Scanner%d&lt;init&gt;(java%dlang%dString)" resolveInfo="Scanner" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="7727845083901371794">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7727845083901344078" resolveInfo="graphString" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" roleId="yvor.1070462273904:3" type="yvor.StaticMethodDeclaration" typeId="yvor.1081236700938:3" id="1567683135099906915">
      <property name="name" nameId="yvnu.1169194664001:0" value="scanGraph" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1567683135099906916">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="aequ.8567569493821103298" resolveInfo="Graph" />
      </node>
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1567683135099906917" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1567683135099906918">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.TryCatchStatement" typeId="yvor.1164879751025:3" id="1567683135099906919">
          <node role="body" roleId="yvor.1164879758292:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1567683135099906920">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1567683135099906921">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1567683135099906922">
                <property name="name" nameId="yvnu.1169194664001:0" value="graph" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1567683135099906923">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="aequ.8567569493821103298" resolveInfo="Graph" />
                </node>
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1567683135099906924">
                  <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="1567683135099906925">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.8567569493821103300" resolveInfo="Graph" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1567683135099906926">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1567683135099906927">
                <property name="name" nameId="yvnu.1169194664001:0" value="numNodes" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1567683135099906928" />
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099906929">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1567683135099906930">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099906997" resolveInfo="in" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099906931">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Scanner%dnextInt()%cint" resolveInfo="nextInt" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ForStatement" typeId="yvor.1144231330558:3" id="1567683135099906932">
              <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1567683135099906933">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099906934">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099906935">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099906936">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099906922" resolveInfo="graph" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099906937">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.8567569493821112344" resolveInfo="addNode" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="variable" roleId="yvor.1144230900587:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1567683135099906938">
                <property name="name" nameId="yvnu.1169194664001:0" value="i" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1567683135099906939" />
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1567683135099906940">
                  <property name="value" nameId="yvor.1068580320021:3" value="0" />
                </node>
              </node>
              <node role="condition" roleId="yvor.1144231399730:3" type="yvor.LessThanExpression" typeId="yvor.1081506773034:3" id="1567683135099906941">
                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099906942">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099906938" resolveInfo="i" />
                </node>
                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099906943">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099906927" resolveInfo="numNodes" />
                </node>
              </node>
              <node role="iteration" roleId="yvor.1144231408325:3" type="yvor.PostfixIncrementExpression" typeId="yvor.1214918800624:3" id="1567683135099906944">
                <node role="expression" roleId="yvor.1239714902950:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099906945">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099906938" resolveInfo="i" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1567683135099906946">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1567683135099906947">
                <property name="name" nameId="yvnu.1169194664001:0" value="numEdges" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1567683135099906948" />
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099906949">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1567683135099906950">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099906997" resolveInfo="in" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099906951">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Scanner%dnextInt()%cint" resolveInfo="nextInt" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ForStatement" typeId="yvor.1144231330558:3" id="1567683135099906952">
              <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1567683135099906953">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1567683135099906954">
                  <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1567683135099906955">
                    <property name="name" nameId="yvnu.1169194664001:0" value="source" />
                    <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1567683135099906956" />
                    <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099906957">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1567683135099906958">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099906997" resolveInfo="in" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099906959">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Scanner%dnextInt()%cint" resolveInfo="nextInt" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1567683135099906960">
                  <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1567683135099906961">
                    <property name="name" nameId="yvnu.1169194664001:0" value="target" />
                    <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1567683135099906962" />
                    <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099906963">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1567683135099906964">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099906997" resolveInfo="in" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099906965">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Scanner%dnextInt()%cint" resolveInfo="nextInt" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099906966">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099906967">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099906968">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099906969">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099906922" resolveInfo="graph" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099906970">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.8567569493821112501" resolveInfo="getNode" />
                        <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099906971">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099906955" resolveInfo="source" />
                        </node>
                      </node>
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099906972">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.8567569493821112323" resolveInfo="addEdgeTo" />
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099906973">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099906974">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099906922" resolveInfo="graph" />
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099906975">
                          <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.8567569493821112501" resolveInfo="getNode" />
                          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099906976">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099906961" resolveInfo="target" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="variable" roleId="yvor.1144230900587:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1567683135099906977">
                <property name="name" nameId="yvnu.1169194664001:0" value="i" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1567683135099906978" />
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1567683135099906979">
                  <property name="value" nameId="yvor.1068580320021:3" value="0" />
                </node>
              </node>
              <node role="condition" roleId="yvor.1144231399730:3" type="yvor.LessThanExpression" typeId="yvor.1081506773034:3" id="1567683135099906980">
                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099906981">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099906947" resolveInfo="numEdges" />
                </node>
                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099906982">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099906977" resolveInfo="i" />
                </node>
              </node>
              <node role="iteration" roleId="yvor.1144231408325:3" type="yvor.PostfixIncrementExpression" typeId="yvor.1214918800624:3" id="1567683135099906983">
                <node role="expression" roleId="yvor.1239714902950:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099906984">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099906977" resolveInfo="i" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1567683135099906985">
              <node role="expression" roleId="yvor.1068581517676:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099906986">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099906922" resolveInfo="graph" />
              </node>
            </node>
          </node>
          <node role="catchClause" roleId="yvor.1164903496223:3" type="yvor.CatchClause" typeId="yvor.1164903280175:3" id="1567683135099906987">
            <node role="throwable" roleId="yvor.1164903359217:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1567683135099906988">
              <property name="name" nameId="yvnu.1169194664001:0" value="e" />
              <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1567683135099906989">
                <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Exception" resolveInfo="Exception" />
              </node>
            </node>
            <node role="catchBody" roleId="yvor.1164903359218:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1567683135099906990">
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ThrowStatement" typeId="yvor.1164991038168:3" id="1567683135099906991">
                <node role="throwable" roleId="yvor.1164991057263:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1567683135099906992">
                  <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="1567683135099906993">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vhgx.~IllegalArgumentException%d&lt;init&gt;(java%dlang%dString,java%dlang%dThrowable)" resolveInfo="IllegalArgumentException" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1567683135099906994">
                      <property name="value" nameId="yvor.1070475926801:3" value="invalid input" />
                    </node>
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099906995">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099906988" resolveInfo="e" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="throwsItem" roleId="yvor.1164879685961:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1567683135099906996">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~IllegalArgumentException" resolveInfo="IllegalArgumentException" />
      </node>
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1567683135099906997">
        <property name="name" nameId="yvnu.1169194664001:0" value="scanner" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1567683135099906998">
          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="yjwb.~Scanner" resolveInfo="Scanner" />
        </node>
      </node>
    </node>
    <node role="staticMethod" roleId="yvor.1070462273904:3" type="yvor.StaticMethodDeclaration" typeId="yvor.1081236700938:3" id="6984255766319282480">
      <property name="name" nameId="yvnu.1169194664001:0" value="scanSimpleEmbeddedGraph" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="6984255766319282482" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="6984255766319282483">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="6984255766319296600">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="6984255766319296601">
            <property name="name" nameId="yvnu.1169194664001:0" value="graph" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="6984255766319296602">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="aequ.8567569493821103298" resolveInfo="Graph" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.LocalStaticMethodCall" typeId="yvor.1172058436953:3" id="6984255766319296604">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1567683135099906915" resolveInfo="scanGraph" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="6984255766319296605">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6984255766319296596" resolveInfo="scanner" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="6984255766319296609">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="6984255766319296610">
            <property name="name" nameId="yvnu.1169194664001:0" value="embeddedGraph" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="6984255766319296611">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="c1ao.2899723422951321538" resolveInfo="EmbeddedGraph" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="6984255766319296613">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="6984255766319296615">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="c1ao.2899723422951321540" resolveInfo="EmbeddedGraph" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6984255766319296616">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6984255766319296601" resolveInfo="graph" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="6984255766319296622">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="6984255766319296623">
            <property name="name" nameId="yvnu.1169194664001:0" value="numFaces" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="6984255766319296624" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6984255766319296627">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="6984255766319296626">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6984255766319296596" resolveInfo="scanner" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="6984255766319296631">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Scanner%dnextInt()%cint" resolveInfo="nextInt" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ForStatement" typeId="yvor.1144231330558:3" id="6984255766319296633">
          <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="6984255766319296634">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="6984255766319296650">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="6984255766319296651">
                <property name="name" nameId="yvnu.1169194664001:0" value="face" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="6984255766319296652">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="c1ao.2899723422951321463" resolveInfo="Face" />
                </node>
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="6984255766319296654">
                  <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="6984255766319299298">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="c1ao.2899723422951321465" resolveInfo="Face" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6984255766319299299">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6984255766319296601" resolveInfo="graph" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="6984255766319299301">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="6984255766319299302">
                <property name="name" nameId="yvnu.1169194664001:0" value="numDarts" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="6984255766319299303" />
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6984255766319299306">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="6984255766319299305">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6984255766319296596" resolveInfo="scanner" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="6984255766319299310">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Scanner%dnextInt()%cint" resolveInfo="nextInt" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="6984255766319299370">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="6984255766319299371">
                <property name="name" nameId="yvnu.1169194664001:0" value="nodes" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ArrayType" typeId="yvor.1070534760951:3" id="6984255766319299373">
                  <node role="componentType" roleId="yvor.1070534760952:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="6984255766319299372" />
                </node>
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="6984255766319299376">
                  <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ArrayCreator" typeId="yvor.1184950988562:3" id="6984255766319299378">
                    <node role="dimensionExpression" roleId="yvor.1184952969026:3" type="yvor.DimensionExpression" typeId="yvor.1184952934362:3" id="6984255766319299379">
                      <node role="expression" roleId="yvor.1184953288404:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="6984255766319299406">
                        <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="6984255766319299409">
                          <property name="value" nameId="yvor.1068580320021:3" value="1" />
                        </node>
                        <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6984255766319299382">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6984255766319299302" resolveInfo="numDarts" />
                        </node>
                      </node>
                    </node>
                    <node role="componentType" roleId="yvor.1184951007469:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="6984255766319299381" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ForStatement" typeId="yvor.1144231330558:3" id="6984255766319299385">
              <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="6984255766319299386">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6984255766319299400">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="6984255766319299410">
                    <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6984255766319299414">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="6984255766319299413">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6984255766319296596" resolveInfo="scanner" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="6984255766319299418">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Scanner%dnextInt()%cint" resolveInfo="nextInt" />
                      </node>
                    </node>
                    <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.ArrayAccessExpression" typeId="yvor.1173175405605:3" id="6984255766319299402">
                      <node role="array" roleId="yvor.1173175590490:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6984255766319299401">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6984255766319299371" resolveInfo="nodes" />
                      </node>
                      <node role="index" roleId="yvor.1173175577737:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="3619822174190272577">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6984255766319299388" resolveInfo="dart" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="variable" roleId="yvor.1144230900587:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="6984255766319299388">
                <property name="name" nameId="yvnu.1169194664001:0" value="d" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="6984255766319299389" />
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="6984255766319299391">
                  <property name="value" nameId="yvor.1068580320021:3" value="0" />
                </node>
              </node>
              <node role="condition" roleId="yvor.1144231399730:3" type="yvor.LessThanExpression" typeId="yvor.1081506773034:3" id="6984255766319299393">
                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6984255766319299396">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6984255766319299302" resolveInfo="numDarts" />
                </node>
                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6984255766319299392">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6984255766319299388" resolveInfo="j" />
                </node>
              </node>
              <node role="iteration" roleId="yvor.1144231408325:3" type="yvor.PostfixIncrementExpression" typeId="yvor.1214918800624:3" id="6984255766319299398">
                <node role="expression" roleId="yvor.1239714902950:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6984255766319299399">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6984255766319299388" resolveInfo="j" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6984255766319299420">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="6984255766319299426">
                <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.ArrayAccessExpression" typeId="yvor.1173175405605:3" id="6984255766319299430">
                  <node role="index" roleId="yvor.1173175577737:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="6984255766319299433">
                    <property name="value" nameId="yvor.1068580320021:3" value="0" />
                  </node>
                  <node role="array" roleId="yvor.1173175590490:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6984255766319299429">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6984255766319299371" resolveInfo="nodes" />
                  </node>
                </node>
                <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.ArrayAccessExpression" typeId="yvor.1173175405605:3" id="6984255766319299422">
                  <node role="index" roleId="yvor.1173175577737:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6984255766319299425">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6984255766319299302" resolveInfo="numDarts" />
                  </node>
                  <node role="array" roleId="yvor.1173175590490:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6984255766319299421">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6984255766319299371" resolveInfo="nodes" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ForStatement" typeId="yvor.1144231330558:3" id="6984255766319299435">
              <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="6984255766319299436">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="6984255766319299456">
                  <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="6984255766319299457">
                    <property name="name" nameId="yvnu.1169194664001:0" value="source" />
                    <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="6984255766319299458">
                      <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="aequ.4671312709908983848" resolveInfo="Node" />
                    </node>
                    <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6984255766319299461">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6984255766319299460">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6984255766319296601" resolveInfo="graph" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="6984255766319299465">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.8567569493821112501" resolveInfo="getNode" />
                        <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ArrayAccessExpression" typeId="yvor.1173175405605:3" id="6984255766319299468">
                          <node role="index" roleId="yvor.1173175577737:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6984255766319299471">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6984255766319299438" resolveInfo="j" />
                          </node>
                          <node role="array" roleId="yvor.1173175590490:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6984255766319299467">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6984255766319299371" resolveInfo="nodes" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="6984255766319299473">
                  <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="6984255766319299474">
                    <property name="name" nameId="yvnu.1169194664001:0" value="target" />
                    <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="6984255766319299475">
                      <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="aequ.4671312709908983848" resolveInfo="Node" />
                    </node>
                    <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6984255766319299476">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6984255766319299477">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6984255766319296601" resolveInfo="graph" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="6984255766319299478">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.8567569493821112501" resolveInfo="getNode" />
                        <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ArrayAccessExpression" typeId="yvor.1173175405605:3" id="6984255766319299479">
                          <node role="index" roleId="yvor.1173175577737:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="6984255766319299482">
                            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="6984255766319299485">
                              <property name="value" nameId="yvor.1068580320021:3" value="1" />
                            </node>
                            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6984255766319299480">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6984255766319299438" resolveInfo="j" />
                            </node>
                          </node>
                          <node role="array" roleId="yvor.1173175590490:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6984255766319299481">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6984255766319299371" resolveInfo="nodes" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="6984255766319299501">
                  <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="6984255766319299502">
                    <property name="name" nameId="yvnu.1169194664001:0" value="curEdge" />
                    <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="6984255766319299503">
                      <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="aequ.8567569493821103292" resolveInfo="Edge" />
                    </node>
                    <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="6984255766319299506" />
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvix.ForEachStatement" typeId="yvix.1153943597977:7" id="6984255766319299487">
                  <node role="variable" roleId="yvix.1153944400369:7" type="yvix.ForEachVariable" typeId="yvix.1153944193378:7" id="6984255766319299488">
                    <property name="name" nameId="yvnu.1169194664001:0" value="edge" />
                  </node>
                  <node role="inputSequence" roleId="yvix.1153944424730:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6984255766319299492">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6984255766319299491">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6984255766319296601" resolveInfo="graph" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="6984255766319299496">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.1654665216152485905" resolveInfo="getEdges" />
                    </node>
                  </node>
                  <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="6984255766319299490">
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="6984255766319299516">
                      <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="6984255766319299517">
                        <property name="name" nameId="yvnu.1169194664001:0" value="adjNodes" />
                        <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.ListType" typeId="yvix.1151688443754:7" id="6984255766319299518">
                          <node role="elementType" roleId="yvix.1151688676805:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="6984255766319299519">
                            <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="aequ.4671312709908983848" resolveInfo="Node" />
                          </node>
                        </node>
                        <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6984255766319299520">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="6984255766319299521">
                            <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="6984255766319299488" resolveInfo="edge" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="6984255766319299522">
                            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.4179389957059014443" resolveInfo="getAdjacentNodes" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="6984255766319299507">
                      <node role="condition" roleId="yvor.1068580123160:3" type="yvor.AndExpression" typeId="yvor.1080120340718:3" id="6984255766319299531">
                        <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6984255766319299535">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6984255766319299534">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6984255766319299517" resolveInfo="adjNodes" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvix.ContainsOperation" typeId="yvix.1172254888721:7" id="6984255766319299539">
                            <node role="argument" roleId="yvix.1172256416782:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6984255766319299541">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6984255766319299474" resolveInfo="target" />
                            </node>
                          </node>
                        </node>
                        <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6984255766319299524">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6984255766319299523">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6984255766319299517" resolveInfo="adjNodes" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvix.ContainsOperation" typeId="yvix.1172254888721:7" id="6984255766319299528">
                            <node role="argument" roleId="yvix.1172256416782:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6984255766319299530">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6984255766319299457" resolveInfo="source" />
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="6984255766319299509">
                        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6984255766319299542">
                          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="6984255766319299544">
                            <node role="rValue" roleId="yvor.1068498886297:3" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="6984255766319299547">
                              <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="6984255766319299488" resolveInfo="edge" />
                            </node>
                            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6984255766319299543">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6984255766319299502" resolveInfo="curEdge" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6984255766319299549">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6984255766319299551">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6984255766319299550">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6984255766319296651" resolveInfo="face" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="6984255766319299555">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="c1ao.2899723422951325232" resolveInfo="addNext" />
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="6984255766319299556">
                        <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="6984255766319299558">
                          <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="c1ao.1646208389854273136" resolveInfo="Dart" />
                          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6984255766319299559">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6984255766319299502" resolveInfo="curEdge" />
                          </node>
                          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6984255766319299561">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6984255766319299457" resolveInfo="source" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="variable" roleId="yvor.1144230900587:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="6984255766319299438">
                <property name="name" nameId="yvnu.1169194664001:0" value="j" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="6984255766319299439" />
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="6984255766319299441">
                  <property name="value" nameId="yvor.1068580320021:3" value="0" />
                </node>
              </node>
              <node role="condition" roleId="yvor.1144231399730:3" type="yvor.LessThanExpression" typeId="yvor.1081506773034:3" id="6984255766319299443">
                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6984255766319299446">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6984255766319299302" resolveInfo="numDarts" />
                </node>
                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6984255766319299442">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6984255766319299438" resolveInfo="j" />
                </node>
              </node>
              <node role="iteration" roleId="yvor.1144231408325:3" type="yvor.PostfixIncrementExpression" typeId="yvor.1214918800624:3" id="6984255766319299448">
                <node role="expression" roleId="yvor.1239714902950:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6984255766319299449">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6984255766319299438" resolveInfo="j" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6984255766319299563">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6984255766319299565">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6984255766319299564">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6984255766319296610" resolveInfo="embeddedGraph" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="6984255766319299569">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="c1ao.2899723422951325404" resolveInfo="addFace" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6984255766319299570">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6984255766319296651" resolveInfo="face" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="6984255766319299572">
              <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="6984255766319299573">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6984255766319299585">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6984255766319299587">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6984255766319299586">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6984255766319296610" resolveInfo="embeddedGraph" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="6984255766319299591">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="c1ao.1123934034178601494" resolveInfo="setOuterFace" />
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6984255766319299592">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6984255766319296651" resolveInfo="face" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" roleId="yvor.1068580123160:3" type="yvor.EqualsExpression" typeId="yvor.1068580123152:3" id="6984255766319299577">
                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.MinusExpression" typeId="yvor.1068581242869:3" id="6984255766319299581">
                  <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="6984255766319299584">
                    <property name="value" nameId="yvor.1068580320021:3" value="1" />
                  </node>
                  <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6984255766319299580">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6984255766319296623" resolveInfo="numFaces" />
                  </node>
                </node>
                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6984255766319299576">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6984255766319296636" resolveInfo="i" />
                </node>
              </node>
            </node>
          </node>
          <node role="variable" roleId="yvor.1144230900587:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="6984255766319296636">
            <property name="name" nameId="yvnu.1169194664001:0" value="curFace" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="6984255766319296637" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="6984255766319296639">
              <property name="value" nameId="yvor.1068580320021:3" value="0" />
            </node>
          </node>
          <node role="condition" roleId="yvor.1144231399730:3" type="yvor.LessThanExpression" typeId="yvor.1081506773034:3" id="6984255766319296641">
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6984255766319296640">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6984255766319296636" resolveInfo="i" />
            </node>
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6984255766319296644">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6984255766319296623" resolveInfo="numFaces" />
            </node>
          </node>
          <node role="iteration" roleId="yvor.1144231408325:3" type="yvor.PostfixIncrementExpression" typeId="yvor.1214918800624:3" id="6984255766319296646">
            <node role="expression" roleId="yvor.1239714902950:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6984255766319296647">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6984255766319296636" resolveInfo="i" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="6984255766319296618">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6984255766319296620">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6984255766319296610" resolveInfo="embeddedGraph" />
          </node>
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="6984255766319296595">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="c1ao.2899723422951321538" resolveInfo="EmbeddedGraph" />
      </node>
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="6984255766319296596">
        <property name="name" nameId="yvnu.1169194664001:0" value="scanner" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="6984255766319296597">
          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="yjwb.~Scanner" resolveInfo="Scanner" />
        </node>
      </node>
    </node>
    <node role="staticMethod" roleId="yvor.1070462273904:3" type="yvor.StaticMethodDeclaration" typeId="yvor.1081236700938:3" id="4519409331094617336">
      <property name="name" nameId="yvnu.1169194664001:0" value="writeGraph" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="4519409331094617337" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="4519409331094617338" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="4519409331094617339">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="4519409331094617351">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="4519409331094617352">
            <property name="name" nameId="yvnu.1169194664001:0" value="numEdges" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="4519409331094617353" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="4519409331094617355">
              <property name="value" nameId="yvor.1068580320021:3" value="0" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvix.ForEachStatement" typeId="yvix.1153943597977:7" id="4519409331094617357">
          <node role="variable" roleId="yvix.1153944400369:7" type="yvix.ForEachVariable" typeId="yvix.1153944193378:7" id="4519409331094617358">
            <property name="name" nameId="yvnu.1169194664001:0" value="node" />
          </node>
          <node role="inputSequence" roleId="yvix.1153944424730:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4519409331094617365">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="4519409331094617364">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="4519409331094617361" resolveInfo="graph" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="4519409331094617369">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.8567569493821107956" resolveInfo="getNodes" />
            </node>
          </node>
          <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="4519409331094617360">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="4519409331094617370">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.PlusAssignmentExpression" typeId="yvor.1215695189714:3" id="4519409331094617372">
                <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4519409331094617381">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4519409331094617376">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="4519409331094617375">
                      <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="4519409331094617358" resolveInfo="node" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="4519409331094617380">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.8567569493821110932" resolveInfo="getOutEdges" />
                    </node>
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetSizeOperation" typeId="yvix.1162935959151:7" id="4519409331094617385" />
                </node>
                <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="4519409331094617371">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="4519409331094617352" resolveInfo="numEdges" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="4519409331094617387">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4519409331094617389">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="4519409331094617388">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="4519409331094617340" resolveInfo="writer" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="4519409331094617393">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="tiz1.~PrintWriter%dprintln(java%dlang%dString)%cvoid" resolveInfo="println" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="8327149575965780803">
                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="8327149575965780806">
                  <property name="value" nameId="yvor.1070475926801:3" value="  " />
                </node>
                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="4519409331094617406">
                  <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="4519409331094617402">
                    <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4519409331094617395">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="4519409331094617394">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="4519409331094617361" resolveInfo="graph" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="4519409331094617399">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.8567569493821112214" resolveInfo="getNumNodes" />
                      </node>
                    </node>
                    <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="4519409331094617405">
                      <property name="value" nameId="yvor.1070475926801:3" value=" " />
                    </node>
                  </node>
                  <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="4519409331094617409">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="4519409331094617352" resolveInfo="numEdges" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvix.ForEachStatement" typeId="yvix.1153943597977:7" id="4519409331094617411">
          <node role="variable" roleId="yvix.1153944400369:7" type="yvix.ForEachVariable" typeId="yvix.1153944193378:7" id="4519409331094617412">
            <property name="name" nameId="yvnu.1169194664001:0" value="node" />
          </node>
          <node role="inputSequence" roleId="yvix.1153944424730:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4519409331094617416">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="4519409331094617415">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="4519409331094617361" resolveInfo="graph" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="4519409331094617420">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.8567569493821107956" resolveInfo="getNodes" />
            </node>
          </node>
          <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="4519409331094617414">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvix.ForEachStatement" typeId="yvix.1153943597977:7" id="4519409331094617429">
              <node role="variable" roleId="yvix.1153944400369:7" type="yvix.ForEachVariable" typeId="yvix.1153944193378:7" id="4519409331094617430">
                <property name="name" nameId="yvnu.1169194664001:0" value="edge" />
              </node>
              <node role="inputSequence" roleId="yvix.1153944424730:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4519409331094617434">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="4519409331094617433">
                  <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="4519409331094617412" resolveInfo="node" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="4519409331094617438">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.8567569493821110932" resolveInfo="getOutEdges" />
                </node>
              </node>
              <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="4519409331094617432">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="4519409331094617441">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4519409331094617444">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="4519409331094617443">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="4519409331094617340" resolveInfo="writer" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="4519409331094617448">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="tiz1.~PrintWriter%dprintln(java%dlang%dString)%cvoid" resolveInfo="println" />
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="8327149575965776050">
                        <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="8327149575965776053">
                          <property name="value" nameId="yvor.1070475926801:3" value="  " />
                        </node>
                        <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="4519409331094617464">
                          <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="4519409331094617460">
                            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4519409331094617455">
                              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4519409331094617450">
                                <node role="operand" roleId="yvor.1197027771414:3" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="4519409331094617449">
                                  <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="4519409331094617430" resolveInfo="edge" />
                                </node>
                                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="4519409331094617454">
                                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.8567569493821111981" resolveInfo="getSource" />
                                </node>
                              </node>
                              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="4519409331094617459">
                                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.4660430665333281569" resolveInfo="getIndex" />
                              </node>
                            </node>
                            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="4519409331094617463">
                              <property name="value" nameId="yvor.1070475926801:3" value=" " />
                            </node>
                          </node>
                          <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4519409331094617467">
                            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4519409331094617468">
                              <node role="operand" roleId="yvor.1197027771414:3" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="4519409331094617469">
                                <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="4519409331094617430" resolveInfo="edge" />
                              </node>
                              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="4519409331094617470">
                                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.8567569493821111989" resolveInfo="getTarget" />
                              </node>
                            </node>
                            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="4519409331094617471">
                              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.4660430665333281569" resolveInfo="getIndex" />
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
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="4519409331094617361">
        <property name="name" nameId="yvnu.1169194664001:0" value="graph" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="4519409331094617363">
          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="aequ.8567569493821103298" resolveInfo="Graph" />
        </node>
      </node>
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="4519409331094617340">
        <property name="name" nameId="yvnu.1169194664001:0" value="writer" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="4519409331094617341">
          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="tiz1.~PrintWriter" resolveInfo="PrintWriter" />
        </node>
      </node>
    </node>
    <node role="staticMethod" roleId="yvor.1070462273904:3" type="yvor.StaticMethodDeclaration" typeId="yvor.1081236700938:3" id="8527875266531960591">
      <property name="name" nameId="yvnu.1169194664001:0" value="writeGraph" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="8527875266531960592" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="8527875266531960593" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8527875266531960594">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8527875266531960614">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalStaticMethodCall" typeId="yvor.1172058436953:3" id="8527875266531960615">
            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="4519409331094617336" resolveInfo="writeGraph" />
            <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="8527875266531960616">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8527875266531960595" resolveInfo="graph" />
            </node>
            <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="8527875266531960620">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8527875266531960597" resolveInfo="writer" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8527875266531960643">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8527875266531960645">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="8527875266531960644">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8527875266531960597" resolveInfo="writer" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8527875266531960649">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="tiz1.~PrintWriter%dprintln(int)%cvoid" resolveInfo="println" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8527875266531960708">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="8527875266531960707">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8527875266531960600" resolveInfo="nodeSizes" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetSizeOperation" typeId="yvix.1162935959151:7" id="8527875266531960712" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvix.ForEachStatement" typeId="yvix.1153943597977:7" id="8527875266531960623">
          <node role="variable" roleId="yvix.1153944400369:7" type="yvix.ForEachVariable" typeId="yvix.1153944193378:7" id="8527875266531960624">
            <property name="name" nameId="yvnu.1169194664001:0" value="node" />
          </node>
          <node role="inputSequence" roleId="yvix.1153944424730:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8527875266531960635">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="8527875266531960634">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8527875266531960600" resolveInfo="nodeSizes" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetKeysOperation" typeId="yvix.1201872418428:7" id="8527875266531960639" />
          </node>
          <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8527875266531960626">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8527875266531960640">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8527875266531960656">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="8527875266531960641">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8527875266531960597" resolveInfo="writer" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8527875266531960660">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="tiz1.~PrintWriter%dprintln(java%dlang%dString)%cvoid" resolveInfo="println" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="8527875266531960692">
                    <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8527875266531960700">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvix.MapElement" typeId="yvix.1197932370469:7" id="8527875266531960696">
                        <node role="key" roleId="yvix.1197932525128:7" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="8527875266531960699">
                          <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="8527875266531960624" resolveInfo="node" />
                        </node>
                        <node role="map" roleId="yvix.1197932505799:7" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="8527875266531960695">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8527875266531960600" resolveInfo="nodeSizes" />
                        </node>
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="5639108013728303246">
                        <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="4dwg.2301768597858221555" resolveInfo="height" />
                      </node>
                    </node>
                    <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="8527875266531960688">
                      <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="8527875266531960675">
                        <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="8527875266531960671">
                          <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8527875266531960666">
                            <node role="operand" roleId="yvor.1197027771414:3" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="8527875266531960661">
                              <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="8527875266531960624" resolveInfo="node" />
                            </node>
                            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8527875266531960670">
                              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.4660430665333281569" resolveInfo="getIndex" />
                            </node>
                          </node>
                          <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="8527875266531960674">
                            <property name="value" nameId="yvor.1070475926801:3" value=" " />
                          </node>
                        </node>
                        <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8527875266531960683">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvix.MapElement" typeId="yvix.1197932370469:7" id="8527875266531960679">
                            <node role="key" roleId="yvix.1197932525128:7" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="8527875266531960682">
                              <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="8527875266531960624" resolveInfo="node" />
                            </node>
                            <node role="map" roleId="yvix.1197932505799:7" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="8527875266531960678">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8527875266531960600" resolveInfo="nodeSizes" />
                            </node>
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="5639108013728303245">
                            <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="4dwg.2301768597858221550" resolveInfo="width" />
                          </node>
                        </node>
                      </node>
                      <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="8527875266531960691">
                        <property name="value" nameId="yvor.1070475926801:3" value=" " />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8527875266531960714">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8527875266531960715">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="8527875266531960716">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8527875266531960597" resolveInfo="writer" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8527875266531960717">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="tiz1.~PrintWriter%dprintln(int)%cvoid" resolveInfo="println" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8527875266531960718">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="8527875266531960750">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8527875266531960607" resolveInfo="edgeLabelSizes" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetSizeOperation" typeId="yvix.1162935959151:7" id="8527875266531960720" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvix.ForEachStatement" typeId="yvix.1153943597977:7" id="8527875266531960721">
          <node role="variable" roleId="yvix.1153944400369:7" type="yvix.ForEachVariable" typeId="yvix.1153944193378:7" id="8527875266531960722">
            <property name="name" nameId="yvnu.1169194664001:0" value="edge" />
          </node>
          <node role="inputSequence" roleId="yvix.1153944424730:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8527875266531960723">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="8527875266531960751">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8527875266531960607" resolveInfo="edgeLabelSizes" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetKeysOperation" typeId="yvix.1201872418428:7" id="8527875266531960725" />
          </node>
          <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8527875266531960726">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8527875266531960727">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8527875266531960728">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="8527875266531960729">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8527875266531960597" resolveInfo="writer" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8527875266531960730">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="tiz1.~PrintWriter%dprintln(java%dlang%dString)%cvoid" resolveInfo="println" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="8527875266531960731">
                    <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8527875266531960732">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvix.MapElement" typeId="yvix.1197932370469:7" id="8527875266531960733">
                        <node role="key" roleId="yvix.1197932525128:7" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="8527875266531960734">
                          <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="8527875266531960722" resolveInfo="node" />
                        </node>
                        <node role="map" roleId="yvix.1197932505799:7" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="8527875266531960785">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8527875266531960607" resolveInfo="edgeLabelSizes" />
                        </node>
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="5639108013728303247">
                        <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="4dwg.2301768597858221555" resolveInfo="height" />
                      </node>
                    </node>
                    <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="8527875266531960737">
                      <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="8527875266531960780">
                        <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8527875266531960744">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvix.MapElement" typeId="yvix.1197932370469:7" id="8527875266531960745">
                            <node role="key" roleId="yvix.1197932525128:7" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="8527875266531960746">
                              <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="8527875266531960722" resolveInfo="node" />
                            </node>
                            <node role="map" roleId="yvix.1197932505799:7" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="8527875266531960784">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8527875266531960607" resolveInfo="edgeLabelSizes" />
                            </node>
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="5639108013728303248">
                            <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="4dwg.2301768597858221550" resolveInfo="width" />
                          </node>
                        </node>
                        <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="8527875266531960738">
                          <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="8527875266531960754">
                            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8527875266531960770">
                              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8527875266531960758">
                                <node role="operand" roleId="yvor.1197027771414:3" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="8527875266531960757">
                                  <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="8527875266531960722" resolveInfo="edge" />
                                </node>
                                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8527875266531960762">
                                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.8567569493821111989" resolveInfo="getTarget" />
                                </node>
                              </node>
                              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8527875266531960774">
                                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.4660430665333281569" resolveInfo="getIndex" />
                              </node>
                            </node>
                            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="8527875266531960739">
                              <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8527875266531960763">
                                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8527875266531960740">
                                  <node role="operand" roleId="yvor.1197027771414:3" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="8527875266531960741">
                                    <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="8527875266531960722" resolveInfo="node" />
                                  </node>
                                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8527875266531960753">
                                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.8567569493821111981" resolveInfo="getSource" />
                                  </node>
                                </node>
                                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8527875266531960769">
                                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.4660430665333281569" resolveInfo="getIndex" />
                                </node>
                              </node>
                              <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="8527875266531960743">
                                <property name="value" nameId="yvor.1070475926801:3" value=" " />
                              </node>
                            </node>
                          </node>
                          <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="8527875266531960783">
                            <property name="value" nameId="yvor.1070475926801:3" value=" " />
                          </node>
                        </node>
                      </node>
                      <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="8527875266531960749">
                        <property name="value" nameId="yvor.1070475926801:3" value=" " />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.Statement" typeId="yvor.1068580123157:3" id="8527875266531960705" />
      </node>
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="8527875266531960595">
        <property name="name" nameId="yvnu.1169194664001:0" value="graph" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8527875266531960596">
          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="aequ.8567569493821103298" resolveInfo="Graph" />
        </node>
      </node>
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="8527875266531960600">
        <property name="name" nameId="yvnu.1169194664001:0" value="nodeSizes" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.MapType" typeId="yvix.1197683403723:7" id="8527875266531960602">
          <node role="keyType" roleId="yvix.1197683466920:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8527875266531960605">
            <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="aequ.4671312709908983848" resolveInfo="Node" />
          </node>
          <node role="valueType" roleId="yvix.1197683475734:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="5639108013728303243">
            <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="4dwg.2301768597858221544" resolveInfo="Dimension" />
          </node>
        </node>
      </node>
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="8527875266531960607">
        <property name="name" nameId="yvnu.1169194664001:0" value="edgeLabelSizes" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.MapType" typeId="yvix.1197683403723:7" id="8527875266531960609">
          <node role="keyType" roleId="yvix.1197683466920:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8527875266531960612">
            <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="aequ.8567569493821103292" resolveInfo="Edge" />
          </node>
          <node role="valueType" roleId="yvix.1197683475734:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="5639108013728303244">
            <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="4dwg.2301768597858221544" resolveInfo="Dimension" />
          </node>
        </node>
      </node>
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="8527875266531960597">
        <property name="name" nameId="yvnu.1169194664001:0" value="writer" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8527875266531960599">
          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="tiz1.~PrintWriter" resolveInfo="PrintWriter" />
        </node>
      </node>
    </node>
    <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1567683135099906999" />
  </root>
  <root id="1567683135099907102">
    <node role="staticInnerClassifiers" roleId="yvor.1178616825527:3" type="yvor.ClassConcept" typeId="yvor.1068390468198:3" id="1567683135099907103">
      <property name="nonStatic" nameId="yvor.521412098689998745:3" value="true" />
      <property name="name" nameId="yvnu.1169194664001:0" value="MyGraphLabel" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="1567683135099907104" />
      <node role="constructor" roleId="yvor.1068390468201:3" type="yvor.ConstructorDeclaration" typeId="yvor.1068580123140:3" id="1567683135099907105">
        <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="1567683135099907106" />
        <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1567683135099907107" />
        <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1567683135099907108">
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.SuperConstructorInvocation" typeId="yvor.1070475587102:3" id="1567683135099907109">
            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JLabel%d&lt;init&gt;()" resolveInfo="JLabel" />
          </node>
        </node>
      </node>
      <node role="superclass" roleId="yvor.1165602531693:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1567683135099907110">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="t147.~JLabel" resolveInfo="JLabel" />
      </node>
      <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="1567683135099907111">
        <property name="name" nameId="yvnu.1169194664001:0" value="paintComponent" />
        <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1567683135099907112" />
        <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="1567683135099907113" />
        <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1567683135099907114">
          <property name="name" nameId="yvnu.1169194664001:0" value="graphics" />
          <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1567683135099907115">
            <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~Graphics" resolveInfo="Graphics" />
          </node>
        </node>
        <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1567683135099907116">
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1567683135099907117">
            <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1567683135099907118">
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907119">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907120">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1567683135099907121">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907114" resolveInfo="graphics" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099907122">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Graphics%ddrawString(java%dlang%dString,int,int)%cvoid" resolveInfo="drawString" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1567683135099907123">
                      <property name="value" nameId="yvor.1070475926801:3" value="no graph yet" />
                    </node>
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1567683135099907124">
                      <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="1567683135099907102" resolveInfo="TestPanel" />
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907849" resolveInfo="NSIZE" />
                    </node>
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8780938838750213643">
                      <property name="value" nameId="yvor.1068580320021:3" value="40" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="condition" roleId="yvor.1068580123160:3" type="yvor.EqualsExpression" typeId="yvor.1068580123152:3" id="1567683135099907126">
              <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1567683135099907127" />
              <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="1567683135099907128">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907330" resolveInfo="myCurrentLayout" />
              </node>
            </node>
            <node role="ifFalseStatement" roleId="yvor.1082485599094:3" type="yvor.BlockStatement" typeId="yvor.1082485599095:3" id="1567683135099907129">
              <node role="statements" roleId="yvor.1082485599096:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1567683135099907130">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1567683135099907131">
                  <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1567683135099907132">
                    <property name="name" nameId="yvnu.1169194664001:0" value="xOffset" />
                    <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1567683135099907133" />
                    <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8780938838750213561">
                      <property name="value" nameId="yvor.1068580320021:3" value="40" />
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1567683135099907135">
                  <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1567683135099907136">
                    <property name="name" nameId="yvnu.1169194664001:0" value="yOffset" />
                    <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1567683135099907137" />
                    <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8780938838750213563">
                      <property name="value" nameId="yvor.1068580320021:3" value="40" />
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1567683135099907139">
                  <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1567683135099907140">
                    <property name="name" nameId="yvnu.1169194664001:0" value="nodeLayout" />
                    <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.MapType" typeId="yvix.1197683403723:7" id="1567683135099907141">
                      <node role="keyType" roleId="yvix.1197683466920:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1567683135099907142">
                        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="aequ.4671312709908983848" resolveInfo="Node" />
                      </node>
                      <node role="valueType" roleId="yvix.1197683475734:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="5639108013728303293">
                        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="4dwg.2301768597858221425" resolveInfo="Point" />
                      </node>
                    </node>
                    <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907144">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="1567683135099907145">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907330" resolveInfo="myCurrentLayout" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099907146">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="rm96.1327612371813188354" resolveInfo="getNodeLayout" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1567683135099907147">
                  <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1567683135099907148">
                    <property name="name" nameId="yvnu.1169194664001:0" value="edgeLayout" />
                    <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.MapType" typeId="yvix.1197683403723:7" id="1567683135099907149">
                      <node role="keyType" roleId="yvix.1197683466920:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1567683135099907150">
                        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="aequ.8567569493821103292" resolveInfo="Edge" />
                      </node>
                      <node role="valueType" roleId="yvix.1197683475734:7" type="yvix.ListType" typeId="yvix.1151688443754:7" id="1567683135099907151">
                        <node role="elementType" roleId="yvix.1151688676805:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="5639108013728303294">
                          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="4dwg.2301768597858221425" resolveInfo="Point" />
                        </node>
                      </node>
                    </node>
                    <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907153">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="1567683135099907154">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907330" resolveInfo="myCurrentLayout" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099907155">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="rm96.1327612371813188378" resolveInfo="getEdgeLayout" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvix.ForEachStatement" typeId="yvix.1153943597977:7" id="1567683135099907156">
                  <node role="variable" roleId="yvix.1153944400369:7" type="yvix.ForEachVariable" typeId="yvix.1153944193378:7" id="1567683135099907157">
                    <property name="name" nameId="yvnu.1169194664001:0" value="edge" />
                  </node>
                  <node role="inputSequence" roleId="yvix.1153944424730:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907158">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907159">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907148" resolveInfo="edgeLayout" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetKeysOperation" typeId="yvix.1201872418428:7" id="1567683135099907160" />
                  </node>
                  <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1567683135099907161">
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1567683135099907162">
                      <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1567683135099907163">
                        <property name="name" nameId="yvnu.1169194664001:0" value="cur" />
                        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="5639108013728303295">
                          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="4dwg.2301768597858221425" resolveInfo="Point" />
                        </node>
                        <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1567683135099907165" />
                      </node>
                    </node>
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvix.ForEachStatement" typeId="yvix.1153943597977:7" id="1567683135099907166">
                      <node role="variable" roleId="yvix.1153944400369:7" type="yvix.ForEachVariable" typeId="yvix.1153944193378:7" id="1567683135099907167">
                        <property name="name" nameId="yvnu.1169194664001:0" value="point" />
                      </node>
                      <node role="inputSequence" roleId="yvix.1153944424730:7" type="yvix.MapElement" typeId="yvix.1197932370469:7" id="1567683135099907168">
                        <node role="key" roleId="yvix.1197932525128:7" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="1567683135099907169">
                          <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="1567683135099907157" resolveInfo="edge" />
                        </node>
                        <node role="map" roleId="yvix.1197932505799:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907170">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907148" resolveInfo="edgeLayout" />
                        </node>
                      </node>
                      <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1567683135099907171">
                        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1567683135099907172">
                          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotEqualsExpression" typeId="yvor.1073239437375:3" id="1567683135099907173">
                            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907174">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907163" resolveInfo="cur" />
                            </node>
                            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1567683135099907175" />
                          </node>
                          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1567683135099907176">
                            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907177">
                              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907178">
                                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1567683135099907179">
                                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907114" resolveInfo="graphics" />
                                </node>
                                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099907180">
                                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Graphics%ddrawLine(int,int,int,int)%cvoid" resolveInfo="drawLine" />
                                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1567683135099907181">
                                    <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907182">
                                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907132" resolveInfo="xOffset" />
                                    </node>
                                    <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.MulExpression" typeId="yvor.1092119917967:3" id="1567683135099907183">
                                      <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907184">
                                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907185">
                                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907163" resolveInfo="cur" />
                                        </node>
                                        <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="5639108013728303296">
                                          <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="4dwg.2301768597858221431" resolveInfo="x" />
                                        </node>
                                      </node>
                                      <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1567683135099907187">
                                        <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="1567683135099907102" resolveInfo="TestPanel" />
                                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907845" resolveInfo="SCALE" />
                                      </node>
                                    </node>
                                  </node>
                                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1567683135099907188">
                                    <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907189">
                                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907136" resolveInfo="yOffset" />
                                    </node>
                                    <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.MulExpression" typeId="yvor.1092119917967:3" id="1567683135099907190">
                                      <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907191">
                                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907192">
                                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907163" resolveInfo="cur" />
                                        </node>
                                        <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="5639108013728303297">
                                          <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="4dwg.2301768597858221436" resolveInfo="y" />
                                        </node>
                                      </node>
                                      <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1567683135099907194">
                                        <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="1567683135099907102" resolveInfo="TestPanel" />
                                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8780938838750213476" resolveInfo="SCALE_Y" />
                                      </node>
                                    </node>
                                  </node>
                                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1567683135099907195">
                                    <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907196">
                                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907132" resolveInfo="xOffset" />
                                    </node>
                                    <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.MulExpression" typeId="yvor.1092119917967:3" id="1567683135099907197">
                                      <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907198">
                                        <node role="operand" roleId="yvor.1197027771414:3" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="1567683135099907199">
                                          <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="1567683135099907167" resolveInfo="point" />
                                        </node>
                                        <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="5639108013728303298">
                                          <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="4dwg.2301768597858221431" resolveInfo="x" />
                                        </node>
                                      </node>
                                      <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1567683135099907201">
                                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907845" resolveInfo="SCALE" />
                                        <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="1567683135099907102" resolveInfo="TestPanel" />
                                      </node>
                                    </node>
                                  </node>
                                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1567683135099907202">
                                    <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907203">
                                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907136" resolveInfo="yOffset" />
                                    </node>
                                    <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.MulExpression" typeId="yvor.1092119917967:3" id="1567683135099907204">
                                      <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907205">
                                        <node role="operand" roleId="yvor.1197027771414:3" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="1567683135099907206">
                                          <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="1567683135099907167" resolveInfo="point" />
                                        </node>
                                        <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="5639108013728303299">
                                          <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="4dwg.2301768597858221436" resolveInfo="y" />
                                        </node>
                                      </node>
                                      <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1567683135099907208">
                                        <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="1567683135099907102" resolveInfo="TestPanel" />
                                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8780938838750213476" resolveInfo="SCALE_Y" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907209">
                          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1567683135099907210">
                            <node role="rValue" roleId="yvor.1068498886297:3" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="1567683135099907211">
                              <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="1567683135099907167" resolveInfo="point" />
                            </node>
                            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907212">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907163" resolveInfo="cur" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvix.ForEachStatement" typeId="yvix.1153943597977:7" id="1567683135099907213">
                  <node role="variable" roleId="yvix.1153944400369:7" type="yvix.ForEachVariable" typeId="yvix.1153944193378:7" id="1567683135099907214">
                    <property name="name" nameId="yvnu.1169194664001:0" value="node" />
                  </node>
                  <node role="inputSequence" roleId="yvix.1153944424730:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907215">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907216">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907140" resolveInfo="nodeLayout" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetKeysOperation" typeId="yvix.1201872418428:7" id="1567683135099907217" />
                  </node>
                  <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1567683135099907218">
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1567683135099907219">
                      <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1567683135099907220">
                        <property name="name" nameId="yvnu.1169194664001:0" value="x" />
                        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1567683135099907221" />
                        <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.MinusExpression" typeId="yvor.1068581242869:3" id="1567683135099907222">
                          <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DivExpression" typeId="yvor.1095950406618:3" id="1567683135099907223">
                            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1567683135099907224">
                              <property name="value" nameId="yvor.1068580320021:3" value="2" />
                            </node>
                            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1567683135099907225">
                              <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="1567683135099907102" resolveInfo="TestPanel" />
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907849" resolveInfo="NSIZE" />
                            </node>
                          </node>
                          <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1567683135099907226">
                            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907227">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907132" resolveInfo="xOffset" />
                            </node>
                            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.MulExpression" typeId="yvor.1092119917967:3" id="1567683135099907228">
                              <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.ParenthesizedExpression" typeId="yvor.1079359253375:3" id="1567683135099907229">
                                <node role="expression" roleId="yvor.1079359253376:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907230">
                                  <node role="operand" roleId="yvor.1197027771414:3" type="yvix.MapElement" typeId="yvix.1197932370469:7" id="1567683135099907231">
                                    <node role="key" roleId="yvix.1197932525128:7" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="1567683135099907232">
                                      <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="1567683135099907214" resolveInfo="node" />
                                    </node>
                                    <node role="map" roleId="yvix.1197932505799:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907233">
                                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907140" resolveInfo="nodeLayout" />
                                    </node>
                                  </node>
                                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="5639108013728303300">
                                    <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="4dwg.2301768597858221431" resolveInfo="x" />
                                  </node>
                                </node>
                              </node>
                              <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1567683135099907235">
                                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907845" resolveInfo="SCALE" />
                                <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="1567683135099907102" resolveInfo="TestPanel" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1567683135099907236">
                      <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1567683135099907237">
                        <property name="name" nameId="yvnu.1169194664001:0" value="y" />
                        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1567683135099907238" />
                        <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.MinusExpression" typeId="yvor.1068581242869:3" id="1567683135099907239">
                          <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DivExpression" typeId="yvor.1095950406618:3" id="1567683135099907240">
                            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1567683135099907241">
                              <property name="value" nameId="yvor.1068580320021:3" value="2" />
                            </node>
                            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1567683135099907242">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907849" resolveInfo="NSIZE" />
                              <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="1567683135099907102" resolveInfo="TestPanel" />
                            </node>
                          </node>
                          <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1567683135099907243">
                            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907244">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907136" resolveInfo="yOffset" />
                            </node>
                            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.MulExpression" typeId="yvor.1092119917967:3" id="1567683135099907245">
                              <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.ParenthesizedExpression" typeId="yvor.1079359253375:3" id="1567683135099907246">
                                <node role="expression" roleId="yvor.1079359253376:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907247">
                                  <node role="operand" roleId="yvor.1197027771414:3" type="yvix.MapElement" typeId="yvix.1197932370469:7" id="1567683135099907248">
                                    <node role="key" roleId="yvix.1197932525128:7" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="1567683135099907249">
                                      <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="1567683135099907214" resolveInfo="node" />
                                    </node>
                                    <node role="map" roleId="yvix.1197932505799:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907250">
                                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907140" resolveInfo="nodeLayout" />
                                    </node>
                                  </node>
                                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="5639108013728303301">
                                    <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="4dwg.2301768597858221436" resolveInfo="y" />
                                  </node>
                                </node>
                              </node>
                              <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1567683135099907252">
                                <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="1567683135099907102" resolveInfo="TestPanel" />
                                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8780938838750213476" resolveInfo="SCALE_Y" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1567683135099907253">
                      <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1567683135099907254">
                        <property name="name" nameId="yvnu.1169194664001:0" value="oldColor" />
                        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1567683135099907255">
                          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~Color" resolveInfo="Color" />
                        </node>
                        <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907256">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1567683135099907257">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907114" resolveInfo="graphics" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099907258">
                            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Graphics%dgetColor()%cjava%dawt%dColor" resolveInfo="getColor" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907259">
                      <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907260">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1567683135099907261">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907114" resolveInfo="graphics" />
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099907262">
                          <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Graphics%dsetColor(java%dawt%dColor)%cvoid" resolveInfo="setColor" />
                          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907263">
                            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="1567683135099907264">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907324" resolveInfo="myGraphLabel" />
                            </node>
                            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099907265">
                              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Component%dgetBackground()%cjava%dawt%dColor" resolveInfo="getBackground" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907266">
                      <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907267">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1567683135099907268">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907114" resolveInfo="graphics" />
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099907269">
                          <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Graphics%dfillOval(int,int,int,int)%cvoid" resolveInfo="fillOval" />
                          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907270">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907220" resolveInfo="x" />
                          </node>
                          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907271">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907237" resolveInfo="y" />
                          </node>
                          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1567683135099907272">
                            <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="1567683135099907102" resolveInfo="TestPanel" />
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907849" resolveInfo="NSIZE" />
                          </node>
                          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1567683135099907273">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907849" resolveInfo="NSIZE" />
                            <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="1567683135099907102" resolveInfo="TestPanel" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907274">
                      <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907275">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1567683135099907276">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907114" resolveInfo="graphics" />
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099907277">
                          <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Graphics%dsetColor(java%dawt%dColor)%cvoid" resolveInfo="setColor" />
                          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907278">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907254" resolveInfo="oldColor" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907279">
                      <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907280">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1567683135099907281">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907114" resolveInfo="graphics" />
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099907282">
                          <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Graphics%ddrawOval(int,int,int,int)%cvoid" resolveInfo="drawOval" />
                          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907283">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907220" resolveInfo="x" />
                          </node>
                          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907284">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907237" resolveInfo="y" />
                          </node>
                          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1567683135099907285">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907849" resolveInfo="NSIZE" />
                            <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="1567683135099907102" resolveInfo="TestPanel" />
                          </node>
                          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1567683135099907286">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907849" resolveInfo="NSIZE" />
                            <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="1567683135099907102" resolveInfo="TestPanel" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8734440518943050067">
                      <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8734440518943050068">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="8734440518943050069">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907114" resolveInfo="graphics" />
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8734440518943050070">
                          <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Graphics%ddrawString(java%dlang%dString,int,int)%cvoid" resolveInfo="drawString" />
                          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="8734440518943050071">
                            <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="vhgx.~Integer" resolveInfo="Integer" />
                            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vhgx.~Integer%dtoString(int)%cjava%dlang%dString" resolveInfo="toString" />
                            <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8734440518943050072">
                              <node role="operand" roleId="yvor.1197027771414:3" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="8734440518943050073">
                                <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="1567683135099907214" resolveInfo="node" />
                              </node>
                              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8734440518943050074">
                                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.4660430665333281569" resolveInfo="getIndex" />
                              </node>
                            </node>
                          </node>
                          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="8734440518943050075">
                            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8734440518943050076">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907220" resolveInfo="x" />
                            </node>
                            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DivExpression" typeId="yvor.1095950406618:3" id="8734440518943050077">
                              <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8734440518943050078">
                                <property name="value" nameId="yvor.1068580320021:3" value="3" />
                              </node>
                              <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="8734440518943050079">
                                <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="1567683135099907102" resolveInfo="TestPanel" />
                                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907849" resolveInfo="NSIZE" />
                              </node>
                            </node>
                          </node>
                          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="8734440518943050080">
                            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DivExpression" typeId="yvor.1095950406618:3" id="8734440518943050081">
                              <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8734440518943050082">
                                <property name="value" nameId="yvor.1068580320021:3" value="3" />
                              </node>
                              <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.MulExpression" typeId="yvor.1092119917967:3" id="8734440518943050083">
                                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8734440518943050084">
                                  <property name="value" nameId="yvor.1068580320021:3" value="2" />
                                </node>
                                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="8734440518943050085">
                                  <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="1567683135099907102" resolveInfo="TestPanel" />
                                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907849" resolveInfo="NSIZE" />
                                </node>
                              </node>
                            </node>
                            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8734440518943050086">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907237" resolveInfo="y" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.CommentedStatementsBlock" typeId="yvor.1177326519037:3" id="8734440518943050087">
                      <node role="statement" roleId="yvor.1177326540772:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="8431902818504360367">
                        <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8431902818504360373">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="8431902818504360372">
                            <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="1567683135099907214" resolveInfo="node" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8431902818504360377">
                            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.6088058844796081325" resolveInfo="isDummy" />
                          </node>
                        </node>
                        <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8431902818504360369">
                          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8431902818504360418">
                            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8431902818504360419">
                              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="8431902818504360420">
                                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907114" resolveInfo="graphics" />
                              </node>
                              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8431902818504360421">
                                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Graphics%dfillOval(int,int,int,int)%cvoid" resolveInfo="fillOval" />
                                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8431902818504360422">
                                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907220" resolveInfo="x" />
                                </node>
                                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8431902818504360423">
                                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907237" resolveInfo="y" />
                                </node>
                                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="8431902818504360424">
                                  <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="1567683135099907102" resolveInfo="TestPanel" />
                                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907849" resolveInfo="NSIZE" />
                                </node>
                                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="8431902818504360425">
                                  <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="1567683135099907102" resolveInfo="TestPanel" />
                                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907849" resolveInfo="NSIZE" />
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
        </node>
        <node role="annotation" roleId="yvor.1188208488637:3" type="yvor.AnnotationInstance" typeId="yvor.1188207840427:3" id="1567683135099907320">
          <link role="annotation" roleId="yvor.1188208074048:3" targetNodeId="vhgx.~Override" resolveInfo="Override" />
        </node>
      </node>
    </node>
    <node role="field" roleId="yvor.1068390468199:3" type="yvor.FieldDeclaration" typeId="yvor.1068390468200:3" id="1567683135099907321">
      <property name="name" nameId="yvnu.1169194664001:0" value="myTextArea" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="1567683135099907322" />
      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1567683135099907323">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="t147.~JTextArea" resolveInfo="JTextArea" />
      </node>
    </node>
    <node role="field" roleId="yvor.1068390468199:3" type="yvor.FieldDeclaration" typeId="yvor.1068390468200:3" id="1567683135099907324">
      <property name="name" nameId="yvnu.1169194664001:0" value="myGraphLabel" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="1567683135099907325" />
      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1567683135099907326">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="1567683135099907103" resolveInfo="TestPanel.MyGraphLabel" />
      </node>
    </node>
    <node role="field" roleId="yvor.1068390468199:3" type="yvor.FieldDeclaration" typeId="yvor.1068390468200:3" id="1567683135099907327">
      <property name="name" nameId="yvnu.1169194664001:0" value="myLayouter" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="1567683135099907328" />
      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1327612371813208574">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="rm96.1327612371813208563" resolveInfo="ILayouter" />
      </node>
    </node>
    <node role="field" roleId="yvor.1068390468199:3" type="yvor.FieldDeclaration" typeId="yvor.1068390468200:3" id="1567683135099907330">
      <property name="name" nameId="yvnu.1169194664001:0" value="myCurrentLayout" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="1567683135099907331" />
      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1327612371813201606">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="rm96.1327612371813188313" resolveInfo="GraphLayout" />
      </node>
    </node>
    <node role="field" roleId="yvor.1068390468199:3" type="yvor.FieldDeclaration" typeId="yvor.1068390468200:3" id="1567683135099907333">
      <property name="name" nameId="yvnu.1169194664001:0" value="myNumEdgesField" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="1567683135099907334" />
      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1567683135099907335">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="t147.~JTextField" resolveInfo="JTextField" />
      </node>
    </node>
    <node role="field" roleId="yvor.1068390468199:3" type="yvor.FieldDeclaration" typeId="yvor.1068390468200:3" id="1567683135099907336">
      <property name="name" nameId="yvnu.1169194664001:0" value="myNumNodesField" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="1567683135099907337" />
      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1567683135099907338">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="t147.~JTextField" resolveInfo="JTextField" />
      </node>
    </node>
    <node role="field" roleId="yvor.1068390468199:3" type="yvor.FieldDeclaration" typeId="yvor.1068390468200:3" id="1567683135099907339">
      <property name="name" nameId="yvnu.1169194664001:0" value="myAllowMultiEdges" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="1567683135099907340" />
      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1567683135099907341">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="t147.~JRadioButton" resolveInfo="JRadioButton" />
      </node>
    </node>
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="1567683135099907342">
      <property name="name" nameId="yvnu.1169194664001:0" value="createNewGraphButton" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="1567683135099907343" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="1567683135099907344" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1567683135099907345">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907346">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1567683135099907347">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1567683135099907348">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="1567683135099907349">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTextField%d&lt;init&gt;(int)" resolveInfo="JTextField" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1567683135099907350">
                  <property name="value" nameId="yvor.1068580320021:3" value="10" />
                </node>
              </node>
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="1567683135099907351">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907336" resolveInfo="myNumNodesField" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907352">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907353">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="1567683135099907354">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907336" resolveInfo="myNumNodesField" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099907355">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JComponent%dsetBorder(javax%dswing%dborder%dBorder)%cvoid" resolveInfo="setBorder" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1567683135099907356">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~BorderFactory%dcreateTitledBorder(java%dlang%dString)%cjavax%dswing%dborder%dTitledBorder" resolveInfo="createTitledBorder" />
                <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="t147.~BorderFactory" resolveInfo="BorderFactory" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1567683135099907357">
                  <property name="value" nameId="yvor.1070475926801:3" value="nodes:" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907358">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1567683135099907359">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1567683135099907360">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="1567683135099907361">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTextField%d&lt;init&gt;(int)" resolveInfo="JTextField" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1567683135099907362">
                  <property name="value" nameId="yvor.1068580320021:3" value="10" />
                </node>
              </node>
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="1567683135099907363">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907333" resolveInfo="myNumEdgesField" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907364">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907365">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="1567683135099907366">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907333" resolveInfo="myNumEdgesField" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099907367">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JComponent%dsetBorder(javax%dswing%dborder%dBorder)%cvoid" resolveInfo="setBorder" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1567683135099907368">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~BorderFactory%dcreateTitledBorder(java%dlang%dString)%cjavax%dswing%dborder%dTitledBorder" resolveInfo="createTitledBorder" />
                <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="t147.~BorderFactory" resolveInfo="BorderFactory" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1567683135099907369">
                  <property name="value" nameId="yvor.1070475926801:3" value="edges:" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907370">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1567683135099907371">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1567683135099907372">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="1567683135099907373">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JRadioButton%d&lt;init&gt;(java%dlang%dString)" resolveInfo="JRadioButton" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1567683135099907374">
                  <property name="value" nameId="yvor.1070475926801:3" value="allow multiedges" />
                </node>
              </node>
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="1567683135099907375">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907339" resolveInfo="myAllowMultiEdges" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1567683135099907376">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1567683135099907377">
            <property name="name" nameId="yvnu.1169194664001:0" value="c" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1567683135099907378">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~GridBagConstraints" resolveInfo="GridBagConstraints" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1567683135099907379">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="1567683135099907380">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~GridBagConstraints%d&lt;init&gt;()" resolveInfo="GridBagConstraints" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907381">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1567683135099907382">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1567683135099907383">
              <property name="value" nameId="yvor.1068580320021:3" value="0" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907384">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907385">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907377" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1567683135099907386">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridy" resolveInfo="gridy" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907387">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1567683135099907388">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1567683135099907389">
              <property name="value" nameId="yvor.1068580320021:3" value="1" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907390">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907391">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907377" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1567683135099907392">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridx" resolveInfo="gridx" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907393">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1567683135099907394">
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907395">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907396">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907377" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1567683135099907397">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dfill" resolveInfo="fill" />
              </node>
            </node>
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1567683135099907398">
              <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="2uit.~GridBagConstraints" resolveInfo="GridBagConstraints" />
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2uit.~GridBagConstraints%dHORIZONTAL" resolveInfo="HORIZONTAL" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907399">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907400">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1567683135099907401" />
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099907402">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Container%dadd(java%dawt%dComponent)%cjava%dawt%dComponent" resolveInfo="add" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="1567683135099907403">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907336" resolveInfo="myNumNodesField" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907404">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1567683135099907405">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1567683135099907406">
              <property name="value" nameId="yvor.1068580320021:3" value="2" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907407">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907408">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907377" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1567683135099907409">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridx" resolveInfo="gridx" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907410">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907411">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1567683135099907412" />
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099907413">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Container%dadd(java%dawt%dComponent)%cjava%dawt%dComponent" resolveInfo="add" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="1567683135099907414">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907333" resolveInfo="myNumEdgesField" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907415">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1567683135099907416">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1567683135099907417">
              <property name="value" nameId="yvor.1068580320021:3" value="3" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907418">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907419">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907377" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1567683135099907420">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridy" resolveInfo="gridy" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907421">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907422">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1567683135099907423" />
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099907424">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Container%dadd(java%dawt%dComponent)%cjava%dawt%dComponent" resolveInfo="add" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="1567683135099907425">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907339" resolveInfo="myAllowMultiEdges" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907426">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1567683135099907427">
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907428">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907429">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907377" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1567683135099907430">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridy" resolveInfo="gridy" />
              </node>
            </node>
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1567683135099907431">
              <property name="value" nameId="yvor.1068580320021:3" value="4" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1567683135099907432">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1567683135099907433">
            <property name="name" nameId="yvnu.1169194664001:0" value="button" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1567683135099907434">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="t147.~JButton" resolveInfo="JButton" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1567683135099907435">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="1567683135099907436">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JButton%d&lt;init&gt;(java%dlang%dString)" resolveInfo="JButton" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1567683135099907437">
                  <property name="value" nameId="yvor.1070475926801:3" value="generate graph!" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907438">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907439">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907440">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907433" resolveInfo="button" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099907441">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~AbstractButton%daddActionListener(java%dawt%devent%dActionListener)%cvoid" resolveInfo="addActionListener" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1567683135099907442">
                <node role="creator" roleId="yvor.1145553007750:3" type="yvor.AnonymousClassCreator" typeId="yvor.1182160077978:3" id="1567683135099907443">
                  <node role="cls" roleId="yvor.1182160096073:3" type="yvor.AnonymousClass" typeId="yvor.1170345865475:3" id="1567683135099907444">
                    <property name="nonStatic" nameId="yvor.521412098689998745:3" value="true" />
                    <link role="classifier" roleId="yvor.1170346070688:3" targetNodeId="46vv.~ActionListener" resolveInfo="ActionListener" />
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vhgx.~Object%d&lt;init&gt;()" resolveInfo="Object" />
                    <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1567683135099907445" />
                    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="1567683135099907446">
                      <property name="isAbstract" nameId="yvor.1178608670077:3" value="false" />
                      <property name="name" nameId="yvnu.1169194664001:0" value="actionPerformed" />
                      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1567683135099907447" />
                      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="1567683135099907448" />
                      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1567683135099907449">
                        <property name="name" nameId="yvnu.1169194664001:0" value="p0" />
                        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1567683135099907450">
                          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="46vv.~ActionEvent" resolveInfo="ActionEvent" />
                        </node>
                      </node>
                      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1567683135099907451">
                        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.TryCatchStatement" typeId="yvor.1164879751025:3" id="1567683135099907452">
                          <node role="body" roleId="yvor.1164879758292:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1567683135099907453">
                            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1567683135099907454">
                              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1567683135099907455">
                                <property name="name" nameId="yvnu.1169194664001:0" value="numNodes" />
                                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1567683135099907456" />
                                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1567683135099907457">
                                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vhgx.~Integer%dparseInt(java%dlang%dString)%cint" resolveInfo="parseInt" />
                                  <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="vhgx.~Integer" resolveInfo="Integer" />
                                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907458">
                                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="1567683135099907459">
                                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907336" resolveInfo="myNumNodesField" />
                                    </node>
                                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099907460">
                                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="ko86.~JTextComponent%dgetText()%cjava%dlang%dString" resolveInfo="getText" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1567683135099907461">
                              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1567683135099907462">
                                <property name="name" nameId="yvnu.1169194664001:0" value="numEdges" />
                                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1567683135099907463" />
                                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1567683135099907464">
                                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vhgx.~Integer%dparseInt(java%dlang%dString)%cint" resolveInfo="parseInt" />
                                  <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="vhgx.~Integer" resolveInfo="Integer" />
                                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907465">
                                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="1567683135099907466">
                                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907333" resolveInfo="myNumEdgesField" />
                                    </node>
                                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099907467">
                                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="ko86.~JTextComponent%dgetText()%cjava%dlang%dString" resolveInfo="getText" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1567683135099907468">
                              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1567683135099907469">
                                <property name="name" nameId="yvnu.1169194664001:0" value="g" />
                                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1567683135099907470">
                                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="aequ.8567569493821103298" resolveInfo="Graph" />
                                </node>
                              </node>
                            </node>
                            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.CommentedStatementsBlock" typeId="yvor.1177326519037:3" id="8734440518943050301">
                              <node role="statement" roleId="yvor.1177326540772:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1567683135099907471">
                                <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907472">
                                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="1567683135099907473">
                                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907339" resolveInfo="myAllowMultiEdges" />
                                  </node>
                                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099907474">
                                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~AbstractButton%disSelected()%cboolean" resolveInfo="isSelected" />
                                  </node>
                                </node>
                                <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1567683135099907475">
                                  <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907476">
                                    <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1567683135099907477">
                                      <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1567683135099907478">
                                        <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="35o0.3437556975695846619" resolveInfo="RandomGraphGenerator" />
                                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="35o0.3437556975695846625" resolveInfo="generateNoLoops" />
                                        <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907479">
                                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907455" resolveInfo="numNodes" />
                                        </node>
                                        <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907480">
                                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907462" resolveInfo="numEdges" />
                                        </node>
                                      </node>
                                      <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907481">
                                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907469" resolveInfo="g" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                                <node role="ifFalseStatement" roleId="yvor.1082485599094:3" type="yvor.BlockStatement" typeId="yvor.1082485599095:3" id="1567683135099907482">
                                  <node role="statements" roleId="yvor.1082485599096:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1567683135099907483">
                                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907491">
                                      <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1567683135099907492">
                                        <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1567683135099907493">
                                          <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="35o0.3437556975695846619" resolveInfo="RandomGraphGenerator" />
                                          <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="35o0.3437556975695847322" resolveInfo="generateLayeredGraph" />
                                          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907494">
                                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907455" resolveInfo="numNodes" />
                                          </node>
                                          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907495">
                                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907462" resolveInfo="numEdges" />
                                          </node>
                                        </node>
                                        <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907496">
                                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907469" resolveInfo="g" />
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8734440518943050304">
                              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8734440518943050306">
                                <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="8734440518943050310">
                                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="35o0.3437556975695846704" resolveInfo="generateSimple" />
                                  <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="35o0.3437556975695846619" resolveInfo="RandomGraphGenerator" />
                                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8734440518943050311">
                                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907455" resolveInfo="numNodes" />
                                  </node>
                                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8734440518943050313">
                                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907462" resolveInfo="numEdges" />
                                  </node>
                                </node>
                                <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8734440518943050305">
                                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907469" resolveInfo="g" />
                                </node>
                              </node>
                            </node>
                            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907497">
                              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="1567683135099907498">
                                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1567683135099907593" resolveInfo="writeGraph" />
                                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907499">
                                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907469" resolveInfo="g" />
                                </node>
                              </node>
                            </node>
                          </node>
                          <node role="catchClause" roleId="yvor.1164903496223:3" type="yvor.CatchClause" typeId="yvor.1164903280175:3" id="1567683135099907500">
                            <node role="throwable" roleId="yvor.1164903359217:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1567683135099907501">
                              <property name="name" nameId="yvnu.1169194664001:0" value="e" />
                              <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1567683135099907502">
                                <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Exception" resolveInfo="Exception" />
                              </node>
                            </node>
                            <node role="catchBody" roleId="yvor.1164903359218:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1567683135099907503">
                              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907504">
                                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1567683135099907505">
                                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JOptionPane%dshowMessageDialog(java%dawt%dComponent,java%dlang%dObject)%cvoid" resolveInfo="showMessageDialog" />
                                  <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="t147.~JOptionPane" resolveInfo="JOptionPane" />
                                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1567683135099907506">
                                    <link role="classConcept" roleId="yvor.1182955020723:3" targetNodeId="1567683135099907102" resolveInfo="TestPanel" />
                                  </node>
                                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1567683135099907507">
                                    <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907508">
                                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907509">
                                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907501" resolveInfo="e" />
                                      </node>
                                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099907510">
                                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vhgx.~Throwable%dtoString()%cjava%dlang%dString" resolveInfo="toString" />
                                      </node>
                                    </node>
                                    <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1567683135099907511">
                                      <property name="value" nameId="yvor.1070475926801:3" value="enter number of nodes and edges...\n" />
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
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907512">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907513">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1567683135099907514" />
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099907515">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Container%dadd(java%dawt%dComponent)%cjava%dawt%dComponent" resolveInfo="add" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907516">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907433" resolveInfo="button" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="1567683135099907517">
      <property name="name" nameId="yvnu.1169194664001:0" value="createDoLayoutButton" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="1567683135099907518" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="1567683135099907519" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1567683135099907520">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1567683135099907521">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1567683135099907522">
            <property name="name" nameId="yvnu.1169194664001:0" value="button" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1567683135099907523">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="t147.~JButton" resolveInfo="JButton" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1567683135099907524">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="1567683135099907525">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JButton%d&lt;init&gt;(java%dlang%dString)" resolveInfo="JButton" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1567683135099907526">
                  <property name="value" nameId="yvor.1070475926801:3" value="do layout!" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1567683135099907527">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1567683135099907528">
            <property name="name" nameId="yvnu.1169194664001:0" value="c" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1567683135099907529">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~GridBagConstraints" resolveInfo="GridBagConstraints" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1567683135099907530">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="1567683135099907531">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~GridBagConstraints%d&lt;init&gt;()" resolveInfo="GridBagConstraints" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907532">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907533">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907534">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907522" resolveInfo="button" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099907535">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~AbstractButton%daddActionListener(java%dawt%devent%dActionListener)%cvoid" resolveInfo="addActionListener" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1567683135099907536">
                <node role="creator" roleId="yvor.1145553007750:3" type="yvor.AnonymousClassCreator" typeId="yvor.1182160077978:3" id="1567683135099907537">
                  <node role="cls" roleId="yvor.1182160096073:3" type="yvor.AnonymousClass" typeId="yvor.1170345865475:3" id="1567683135099907538">
                    <property name="nonStatic" nameId="yvor.521412098689998745:3" value="true" />
                    <link role="classifier" roleId="yvor.1170346070688:3" targetNodeId="46vv.~ActionListener" resolveInfo="ActionListener" />
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vhgx.~Object%d&lt;init&gt;()" resolveInfo="Object" />
                    <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1567683135099907539" />
                    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="1567683135099907540">
                      <property name="isAbstract" nameId="yvor.1178608670077:3" value="false" />
                      <property name="name" nameId="yvnu.1169194664001:0" value="actionPerformed" />
                      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1567683135099907541" />
                      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="1567683135099907542" />
                      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1567683135099907543">
                        <property name="name" nameId="yvnu.1169194664001:0" value="p0" />
                        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1567683135099907544">
                          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="46vv.~ActionEvent" resolveInfo="ActionEvent" />
                        </node>
                      </node>
                      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1567683135099907545">
                        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907546">
                          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="1567683135099907547">
                            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1567683135099907669" resolveInfo="layoutGraph" />
                          </node>
                        </node>
                        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907548">
                          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907549">
                            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="1567683135099907550">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907324" resolveInfo="myGraphLabel" />
                            </node>
                            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099907551">
                              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Component%drepaint()%cvoid" resolveInfo="repaint" />
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
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907552">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1567683135099907553">
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907554">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907555">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907528" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1567683135099907556">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dfill" resolveInfo="fill" />
              </node>
            </node>
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1567683135099907557">
              <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="2uit.~GridBagConstraints" resolveInfo="GridBagConstraints" />
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2uit.~GridBagConstraints%dHORIZONTAL" resolveInfo="HORIZONTAL" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907558">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1567683135099907559">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1567683135099907560">
              <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="2uit.~GridBagConstraints" resolveInfo="GridBagConstraints" />
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2uit.~GridBagConstraints%dFIRST_LINE_START" resolveInfo="FIRST_LINE_START" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907561">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907562">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907528" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1567683135099907563">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%danchor" resolveInfo="anchor" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907564">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1567683135099907565">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1567683135099907566">
              <property name="value" nameId="yvor.1068580320021:3" value="0" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907567">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907568">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907528" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1567683135099907569">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridx" resolveInfo="gridx" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907570">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1567683135099907571">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1567683135099907572">
              <property name="value" nameId="yvor.1068580320021:3" value="0" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907573">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907574">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907528" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1567683135099907575">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridy" resolveInfo="gridy" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907576">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1567683135099907577">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1567683135099907578">
              <property name="value" nameId="yvor.1068580320021:3" value="1" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907579">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907580">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907528" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1567683135099907581">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridwidth" resolveInfo="gridwidth" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907582">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1567683135099907583">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1567683135099907584">
              <property name="value" nameId="yvor.1068580320021:3" value="1" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907585">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907586">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907528" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1567683135099907587">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridheight" resolveInfo="gridheight" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907588">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907589">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1567683135099907590" />
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099907591">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Container%dadd(java%dawt%dComponent)%cjava%dawt%dComponent" resolveInfo="add" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907592">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907522" resolveInfo="button" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="1567683135099907593">
      <property name="name" nameId="yvnu.1169194664001:0" value="writeGraph" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="1567683135099907594" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="1567683135099907595" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1567683135099907596">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1567683135099907597">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1567683135099907598">
            <property name="name" nameId="yvnu.1169194664001:0" value="numEdges" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1567683135099907599" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1567683135099907600">
              <property name="value" nameId="yvor.1068580320021:3" value="0" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1567683135099907601">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1567683135099907602">
            <property name="name" nameId="yvnu.1169194664001:0" value="nodes" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.ListType" typeId="yvix.1151688443754:7" id="1567683135099907603">
              <node role="elementType" roleId="yvix.1151688676805:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1567683135099907604">
                <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="aequ.4671312709908983848" resolveInfo="Node" />
              </node>
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907605">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1567683135099907606">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907667" resolveInfo="graph" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099907607">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.8567569493821107956" resolveInfo="getNodes" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvix.ForEachStatement" typeId="yvix.1153943597977:7" id="1567683135099907608">
          <node role="variable" roleId="yvix.1153944400369:7" type="yvix.ForEachVariable" typeId="yvix.1153944193378:7" id="1567683135099907609">
            <property name="name" nameId="yvnu.1169194664001:0" value="node" />
          </node>
          <node role="inputSequence" roleId="yvix.1153944424730:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907610">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907602" resolveInfo="nodes" />
          </node>
          <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1567683135099907611">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907612">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.PlusAssignmentExpression" typeId="yvor.1215695189714:3" id="1567683135099907613">
                <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907614">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907615">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="1567683135099907616">
                      <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="1567683135099907609" resolveInfo="node" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099907617">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.8567569493821110932" resolveInfo="getOutEdges" />
                    </node>
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetSizeOperation" typeId="yvix.1162935959151:7" id="1567683135099907618" />
                </node>
                <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907619">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907598" resolveInfo="numEdges" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907620">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907621">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="1567683135099907622">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907321" resolveInfo="myTextArea" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099907623">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="ko86.~JTextComponent%dsetText(java%dlang%dString)%cvoid" resolveInfo="setText" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1567683135099907624">
                <property name="value" nameId="yvor.1070475926801:3" value="" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907625">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907626">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="1567683135099907627">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907321" resolveInfo="myTextArea" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099907628">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTextArea%dappend(java%dlang%dString)%cvoid" resolveInfo="append" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1567683135099907629">
                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1567683135099907630">
                  <property name="value" nameId="yvor.1070475926801:3" value="\n" />
                </node>
                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1567683135099907631">
                  <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1567683135099907632">
                    <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907633">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1567683135099907634">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907667" resolveInfo="graph" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099907635">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.8567569493821112214" resolveInfo="getNumNodes" />
                      </node>
                    </node>
                    <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1567683135099907636">
                      <property name="value" nameId="yvor.1070475926801:3" value=" " />
                    </node>
                  </node>
                  <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907637">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907598" resolveInfo="numEdges" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvix.ForEachStatement" typeId="yvix.1153943597977:7" id="1567683135099907638">
          <node role="variable" roleId="yvix.1153944400369:7" type="yvix.ForEachVariable" typeId="yvix.1153944193378:7" id="1567683135099907639">
            <property name="name" nameId="yvnu.1169194664001:0" value="node" />
          </node>
          <node role="inputSequence" roleId="yvix.1153944424730:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907640">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907602" resolveInfo="nodes" />
          </node>
          <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1567683135099907641">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvix.ForEachStatement" typeId="yvix.1153943597977:7" id="1567683135099907642">
              <node role="variable" roleId="yvix.1153944400369:7" type="yvix.ForEachVariable" typeId="yvix.1153944193378:7" id="1567683135099907643">
                <property name="name" nameId="yvnu.1169194664001:0" value="edge" />
              </node>
              <node role="inputSequence" roleId="yvix.1153944424730:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907644">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="1567683135099907645">
                  <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="1567683135099907639" resolveInfo="node" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099907646">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.8567569493821110932" resolveInfo="getOutEdges" />
                </node>
              </node>
              <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1567683135099907647">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907648">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907649">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="1567683135099907650">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907321" resolveInfo="myTextArea" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099907651">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTextArea%dappend(java%dlang%dString)%cvoid" resolveInfo="append" />
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1567683135099907652">
                        <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1567683135099907653">
                          <property name="value" nameId="yvor.1070475926801:3" value="\n" />
                        </node>
                        <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1567683135099907654">
                          <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1567683135099907655">
                            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907656">
                              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907657">
                                <node role="operand" roleId="yvor.1197027771414:3" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="1567683135099907658">
                                  <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="1567683135099907643" resolveInfo="edge" />
                                </node>
                                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099907659">
                                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.8567569493821111981" resolveInfo="getSource" />
                                </node>
                              </node>
                              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099907660">
                                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.4660430665333281569" resolveInfo="getIndex" />
                              </node>
                            </node>
                            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1567683135099907661">
                              <property name="value" nameId="yvor.1070475926801:3" value=" " />
                            </node>
                          </node>
                          <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907662">
                            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907663">
                              <node role="operand" roleId="yvor.1197027771414:3" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="1567683135099907664">
                                <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="1567683135099907643" resolveInfo="edge" />
                              </node>
                              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099907665">
                                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.8567569493821111989" resolveInfo="getTarget" />
                              </node>
                            </node>
                            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099907666">
                              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.4660430665333281569" resolveInfo="getIndex" />
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
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1567683135099907667">
        <property name="name" nameId="yvnu.1169194664001:0" value="graph" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1567683135099907668">
          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="aequ.8567569493821103298" resolveInfo="Graph" />
        </node>
      </node>
    </node>
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="1567683135099907669">
      <property name="name" nameId="yvnu.1169194664001:0" value="layoutGraph" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="1567683135099907670" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="1567683135099907671" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1567683135099907672">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1567683135099907673">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1567683135099907674">
            <property name="name" nameId="yvnu.1169194664001:0" value="scanner" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1567683135099907675">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="yjwb.~Scanner" resolveInfo="Scanner" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1567683135099907676">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="1567683135099907677">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Scanner%d&lt;init&gt;(java%dlang%dString)" resolveInfo="Scanner" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907678">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="1567683135099907679">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907321" resolveInfo="myTextArea" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099907680">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="ko86.~JTextComponent%dgetText()%cjava%dlang%dString" resolveInfo="getText" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="4624841703139866031">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="4624841703139866032">
            <property name="name" nameId="yvnu.1169194664001:0" value="g" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="4624841703139866033">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="aequ.8567569493821103298" resolveInfo="Graph" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="4624841703139866035" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.TryCatchStatement" typeId="yvor.1164879751025:3" id="1567683135099907681">
          <node role="body" roleId="yvor.1164879758292:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1567683135099907682">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="4624841703139866036">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="4624841703139866037">
                <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1567683135099907686">
                  <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="1567683135099906914" resolveInfo="GraphScanner" />
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1567683135099906915" resolveInfo="scanGraph" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907687">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907674" resolveInfo="scanner" />
                  </node>
                </node>
                <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="4624841703139866038">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="4624841703139866032" resolveInfo="g" />
                </node>
              </node>
            </node>
          </node>
          <node role="catchClause" roleId="yvor.1164903496223:3" type="yvor.CatchClause" typeId="yvor.1164903280175:3" id="1567683135099907695">
            <node role="throwable" roleId="yvor.1164903359217:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1567683135099907696">
              <property name="name" nameId="yvnu.1169194664001:0" value="e" />
              <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1567683135099907697">
                <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~IllegalArgumentException" resolveInfo="IllegalArgumentException" />
              </node>
            </node>
            <node role="catchBody" roleId="yvor.1164903359218:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1567683135099907698">
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907699">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1567683135099907700">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JOptionPane%dshowMessageDialog(java%dawt%dComponent,java%dlang%dObject)%cvoid" resolveInfo="showMessageDialog" />
                  <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="t147.~JOptionPane" resolveInfo="JOptionPane" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1567683135099907701" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1567683135099907702">
                    <property name="value" nameId="yvor.1070475926801:3" value="something is wrong in graph..." />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="4624841703139866021">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="4624841703139866022">
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="4624841703139866023">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907330" resolveInfo="myCurrentLayout" />
            </node>
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4624841703139866024">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="4624841703139866025">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907327" resolveInfo="myLayouter" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="4624841703139866026">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="rm96.1327612371813208565" resolveInfo="doLayout" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="4624841703139866027">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="4624841703139866032" resolveInfo="g" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="1567683135099907703">
      <property name="name" nameId="yvnu.1169194664001:0" value="createTextPanel" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="1567683135099907704" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="1567683135099907705" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1567683135099907706">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907707">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1567683135099907708">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1567683135099907709">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="1567683135099907710">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTextArea%d&lt;init&gt;(int,int)" resolveInfo="JTextArea" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1567683135099907711">
                  <property name="value" nameId="yvor.1068580320021:3" value="20" />
                </node>
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1567683135099907712">
                  <property name="value" nameId="yvor.1068580320021:3" value="20" />
                </node>
              </node>
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="1567683135099907713">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907321" resolveInfo="myTextArea" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907714">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907715">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="1567683135099907716">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907321" resolveInfo="myTextArea" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099907717">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JComponent%dsetBorder(javax%dswing%dborder%dBorder)%cvoid" resolveInfo="setBorder" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1567683135099907718">
                <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="t147.~BorderFactory" resolveInfo="BorderFactory" />
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~BorderFactory%dcreateTitledBorder(java%dlang%dString)%cjavax%dswing%dborder%dTitledBorder" resolveInfo="createTitledBorder" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1567683135099907719">
                  <property name="value" nameId="yvor.1070475926801:3" value="enter graph here" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1567683135099907720">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1567683135099907721">
            <property name="name" nameId="yvnu.1169194664001:0" value="c" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1567683135099907722">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~GridBagConstraints" resolveInfo="GridBagConstraints" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1567683135099907723">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="1567683135099907724">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~GridBagConstraints%d&lt;init&gt;()" resolveInfo="GridBagConstraints" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907725">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1567683135099907726">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1567683135099907727">
              <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="2uit.~GridBagConstraints" resolveInfo="GridBagConstraints" />
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2uit.~GridBagConstraints%dVERTICAL" resolveInfo="VERTICAL" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907728">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907729">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907721" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1567683135099907730">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dfill" resolveInfo="fill" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907731">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1567683135099907732">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1567683135099907733">
              <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="2uit.~GridBagConstraints" resolveInfo="GridBagConstraints" />
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2uit.~GridBagConstraints%dREMAINDER" resolveInfo="REMAINDER" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907734">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907735">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907721" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1567683135099907736">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridheight" resolveInfo="gridheight" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907737">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1567683135099907738">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1567683135099907739">
              <property name="value" nameId="yvor.1068580320021:3" value="0" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907740">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907741">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907721" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1567683135099907742">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridx" resolveInfo="gridx" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907743">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1567683135099907744">
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907745">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907746">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907721" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1567683135099907747">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridy" resolveInfo="gridy" />
              </node>
            </node>
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1567683135099907748">
              <property name="value" nameId="yvor.1068580320021:3" value="1" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907749">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1567683135099907750">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1567683135099907751">
              <property name="value" nameId="yvor.1068580320021:3" value="1" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907752">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907753">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907721" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1567683135099907754">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dweighty" resolveInfo="weighty" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907755">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907756">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1567683135099907757" />
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099907758">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Container%dadd(java%dawt%dComponent,java%dlang%dObject)%cvoid" resolveInfo="add" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="1567683135099907759">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907321" resolveInfo="myTextArea" />
              </node>
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907760">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907721" resolveInfo="c" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="1567683135099907761">
      <property name="name" nameId="yvnu.1169194664001:0" value="createGraphPanel" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="1567683135099907762" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="1567683135099907763" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1567683135099907764">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907765">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1567683135099907766">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1567683135099907767">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="1567683135099907768">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1567683135099907105" resolveInfo="TestPanel.MyGraphLabel" />
              </node>
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="1567683135099907769">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907324" resolveInfo="myGraphLabel" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907770">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907771">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="1567683135099907772">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907324" resolveInfo="myGraphLabel" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099907773">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JComponent%dsetBorder(javax%dswing%dborder%dBorder)%cvoid" resolveInfo="setBorder" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1567683135099907774">
                <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="t147.~BorderFactory" resolveInfo="BorderFactory" />
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~BorderFactory%dcreateTitledBorder(java%dlang%dString)%cjavax%dswing%dborder%dTitledBorder" resolveInfo="createTitledBorder" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1567683135099907775">
                  <property name="value" nameId="yvor.1070475926801:3" value="graph layout" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1567683135099907776">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1567683135099907777">
            <property name="name" nameId="yvnu.1169194664001:0" value="c" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1567683135099907778">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~GridBagConstraints" resolveInfo="GridBagConstraints" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1567683135099907779">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="1567683135099907780">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~GridBagConstraints%d&lt;init&gt;()" resolveInfo="GridBagConstraints" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907781">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1567683135099907782">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1567683135099907783">
              <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="2uit.~GridBagConstraints" resolveInfo="GridBagConstraints" />
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2uit.~GridBagConstraints%dBOTH" resolveInfo="BOTH" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907784">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907785">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907777" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1567683135099907786">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dfill" resolveInfo="fill" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907787">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1567683135099907788">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1567683135099907789">
              <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="2uit.~GridBagConstraints" resolveInfo="GridBagConstraints" />
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2uit.~GridBagConstraints%dREMAINDER" resolveInfo="REMAINDER" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907790">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907791">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907777" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1567683135099907792">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridwidth" resolveInfo="gridwidth" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907793">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1567683135099907794">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1567683135099907795">
              <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="2uit.~GridBagConstraints" resolveInfo="GridBagConstraints" />
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2uit.~GridBagConstraints%dREMAINDER" resolveInfo="REMAINDER" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907796">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907797">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907777" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1567683135099907798">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridheight" resolveInfo="gridheight" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907799">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1567683135099907800">
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907801">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907802">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907777" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1567683135099907803">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridx" resolveInfo="gridx" />
              </node>
            </node>
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1567683135099907804">
              <property name="value" nameId="yvor.1068580320021:3" value="1" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907805">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1567683135099907806">
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907807">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907808">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907777" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1567683135099907809">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridy" resolveInfo="gridy" />
              </node>
            </node>
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1567683135099907810">
              <property name="value" nameId="yvor.1068580320021:3" value="1" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907811">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1567683135099907812">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1567683135099907813">
              <property name="value" nameId="yvor.1068580320021:3" value="1" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907814">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907815">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907777" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1567683135099907816">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dweightx" resolveInfo="weightx" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907817">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1567683135099907818">
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907819">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907820">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907777" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="1567683135099907821">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dweightx" resolveInfo="weightx" />
              </node>
            </node>
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1567683135099907822">
              <property name="value" nameId="yvor.1068580320021:3" value="1" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.CommentedStatementsBlock" typeId="yvor.1177326519037:3" id="1567683135099907823">
          <node role="statement" roleId="yvor.1177326540772:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907824">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907825">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1567683135099907826" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099907827">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Container%dadd(java%dawt%dComponent,java%dlang%dObject)%cvoid" resolveInfo="add" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="1567683135099907828">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907324" resolveInfo="myGraphLabel" />
                </node>
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907829">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907777" resolveInfo="c" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907830">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907831">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1567683135099907832" />
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099907833">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Container%dadd(java%dawt%dComponent,java%dlang%dObject)%cvoid" resolveInfo="add" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1567683135099907834">
                <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="1567683135099907835">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JScrollPane%d&lt;init&gt;(java%dawt%dComponent)" resolveInfo="JScrollPane" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="1567683135099907836">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907324" resolveInfo="myGraphLabel" />
                  </node>
                </node>
              </node>
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907837">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907777" resolveInfo="c" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticField" roleId="yvor.1128555889557:3" type="yvor.StaticFieldDeclaration" typeId="yvor.1070462154015:3" id="1567683135099907838">
      <property name="name" nameId="yvnu.1169194664001:0" value="FRAME_DIMENSION" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="1567683135099907839" />
      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1567683135099907840">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~Dimension" resolveInfo="Dimension" />
      </node>
      <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1567683135099907841">
        <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="1567683135099907842">
          <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Dimension%d&lt;init&gt;(int,int)" resolveInfo="Dimension" />
          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1567683135099907843">
            <property name="value" nameId="yvor.1068580320021:3" value="800" />
          </node>
          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1567683135099907844">
            <property name="value" nameId="yvor.1068580320021:3" value="600" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticField" roleId="yvor.1128555889557:3" type="yvor.StaticFieldDeclaration" typeId="yvor.1070462154015:3" id="1567683135099907845">
      <property name="name" nameId="yvnu.1169194664001:0" value="SCALE_X" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="1567683135099907846" />
      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1567683135099907847" />
      <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1567683135099907848">
        <property name="value" nameId="yvor.1068580320021:3" value="40" />
      </node>
    </node>
    <node role="staticField" roleId="yvor.1128555889557:3" type="yvor.StaticFieldDeclaration" typeId="yvor.1070462154015:3" id="8780938838750213476">
      <property name="name" nameId="yvnu.1169194664001:0" value="SCALE_Y" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="8780938838750213477" />
      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="8780938838750213479" />
      <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8780938838750213481">
        <property name="value" nameId="yvor.1068580320021:3" value="40" />
      </node>
    </node>
    <node role="staticField" roleId="yvor.1128555889557:3" type="yvor.StaticFieldDeclaration" typeId="yvor.1070462154015:3" id="1567683135099907849">
      <property name="name" nameId="yvnu.1169194664001:0" value="NSIZE" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="1567683135099907850" />
      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1567683135099907851" />
      <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1567683135099907852">
        <property name="value" nameId="yvor.1068580320021:3" value="20" />
      </node>
    </node>
    <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1567683135099907853" />
    <node role="constructor" roleId="yvor.1068390468201:3" type="yvor.ConstructorDeclaration" typeId="yvor.1068580123140:3" id="1567683135099907854">
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="1567683135099907855" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1567683135099907856" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1567683135099907857">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907858">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907859">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1567683135099907860" />
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099907861">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Container%dsetLayout(java%dawt%dLayoutManager)%cvoid" resolveInfo="setLayout" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1567683135099907862">
                <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="1567683135099907863">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~GridBagLayout%d&lt;init&gt;()" resolveInfo="GridBagLayout" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907864">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="1567683135099907865">
            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1567683135099907517" resolveInfo="createDoLayoutButton" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907866">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="1567683135099907867">
            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1567683135099907342" resolveInfo="createNewGraphButton" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907868">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="1567683135099907869">
            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1567683135099907703" resolveInfo="createTextPanel" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907870">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="1567683135099907871">
            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1567683135099907761" resolveInfo="createGraphPanel" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="7343732392716135157">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="7343732392716135159">
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="7343732392716135158">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907327" resolveInfo="myLayouter" />
            </node>
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="7343732392716185065">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="7343732392716185067">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="4t6q.529057043639208600" resolveInfo="OrthogonalPointFlowLayouter" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.CommentedStatementsBlock" typeId="yvor.1177326519037:3" id="7343732392716135155">
          <node role="statement" roleId="yvor.1177326540772:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="529057043639210012">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="529057043639210014">
              <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="529057043639210017">
                <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="529057043639234560">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="4t6q.5530235529701258575" resolveInfo="FlowLayoutWithNodeProcessing" />
                </node>
              </node>
              <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="529057043639210013">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907327" resolveInfo="myLayouter" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.CommentedStatementsBlock" typeId="yvor.1177326519037:3" id="529057043639210010">
          <node role="statement" roleId="yvor.1177326540772:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1327612371813210083">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1327612371813210085">
              <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1327612371813210088">
                <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="1327612371813210090">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="kw11.5213231752900665241" resolveInfo="OrthogonalLayouter" />
                </node>
              </node>
              <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="1327612371813210084">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907327" resolveInfo="myLayouter" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.CommentedStatementsBlock" typeId="yvor.1177326519037:3" id="1327612371813210081">
          <node role="statement" roleId="yvor.1177326540772:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907886">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1567683135099907887">
              <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1567683135099907888">
                <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="1567683135099907889">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="trlv.4660430665333276834" resolveInfo="LayeredLayouter" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="4519409331094638005">
                    <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="4519409331094638007">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="eqmc.4519409331094619349" resolveInfo="EdgeReverterProxy" />
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="4519409331094638008">
                        <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="4519409331094638009">
                          <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="trlv.4660430665333276850" resolveInfo="DFSEdgeReverter" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="4519409331094638012">
                    <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="4519409331094638014">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="eqmc.4519409331094620045" resolveInfo="LayererProxy" />
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="4519409331094638015">
                        <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="4519409331094638016">
                          <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="trlv.5180427534212021893" resolveInfo="TopologicalLayerer" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1567683135099907894">
                    <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="1567683135099907895">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="trlv.7033456583153163506" resolveInfo="BKCoordinatePlacer" />
                    </node>
                  </node>
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="4519409331094638018">
                    <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="4519409331094638020">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="eqmc.4519409331094621477" resolveInfo="MedianLayerByLayerSorterProxy" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="1567683135099907900">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907327" resolveInfo="myLayouter" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.CommentedStatementsBlock" typeId="yvor.1177326519037:3" id="8780938838750225892">
          <node role="statement" roleId="yvor.1177326540772:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8780938838750223032">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8780938838750223033">
              <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8780938838750223034">
                <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="8780938838750223035">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="trlv.4660430665333276834" resolveInfo="LayeredLayouter" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8780938838750223036">
                    <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="8780938838750223037">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="eqmc.4519409331094619349" resolveInfo="EdgeReverterProxy" />
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8780938838750223038">
                        <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="8780938838750223039">
                          <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="trlv.4660430665333276850" resolveInfo="DFSEdgeReverter" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8780938838750223040">
                    <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="8780938838750223041">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="eqmc.4519409331094620045" resolveInfo="LayererProxy" />
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8780938838750223042">
                        <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="8780938838750223043">
                          <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="trlv.5180427534212021893" resolveInfo="TopologicalLayerer" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8780938838750223044">
                    <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="8780938838750223045">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="trlv.7033456583153163506" resolveInfo="BKCoordinatePlacer" />
                    </node>
                  </node>
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8780938838750223046">
                    <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="8780938838750223047">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="eqmc.8780938838750221988" resolveInfo="RefineAdjacentNodeSorterProxy" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8780938838750223048">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907327" resolveInfo="myLayouter" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907901">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1567683135099907902">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1567683135099907903" />
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="1567683135099907904">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907330" resolveInfo="myCurrentLayout" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="superclass" roleId="yvor.1165602531693:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1567683135099907905">
      <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="t147.~JPanel" resolveInfo="JPanel" />
    </node>
    <node role="staticMethod" roleId="yvor.1070462273904:3" type="yvor.StaticMethodDeclaration" typeId="yvor.1081236700938:3" id="1567683135099907906">
      <property name="name" nameId="yvnu.1169194664001:0" value="create" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="1567683135099907907" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="1567683135099907908" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1567683135099907909">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1567683135099907910">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1567683135099907911">
            <property name="name" nameId="yvnu.1169194664001:0" value="frame" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1567683135099907912">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="t147.~JFrame" resolveInfo="JFrame" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1567683135099907913">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="1567683135099907914">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JFrame%d&lt;init&gt;()" resolveInfo="JFrame" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907915">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907916">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907917">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907911" resolveInfo="frame" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099907918">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JFrame%dsetDefaultCloseOperation(int)%cvoid" resolveInfo="setDefaultCloseOperation" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1567683135099907919">
                <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="t147.~JFrame" resolveInfo="JFrame" />
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="t147.~JFrame%dEXIT_ON_CLOSE" resolveInfo="EXIT_ON_CLOSE" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907920">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907921">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907922">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907911" resolveInfo="frame" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099907923">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Container%dadd(java%dawt%dComponent)%cjava%dawt%dComponent" resolveInfo="add" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1567683135099907924">
                <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="1567683135099907925">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1567683135099907854" resolveInfo="TestPanel" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907926">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907927">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907928">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907911" resolveInfo="frame" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099907929">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Window%dsetMinimumSize(java%dawt%dDimension)%cvoid" resolveInfo="setMinimumSize" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1567683135099907930">
                <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="1567683135099907102" resolveInfo="TestPanel" />
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907838" resolveInfo="FRAME_DIMENSION" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907931">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907932">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907933">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907911" resolveInfo="frame" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099907934">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Window%dpack()%cvoid" resolveInfo="pack" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907935">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1567683135099907936">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1567683135099907937">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1567683135099907911" resolveInfo="frame" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1567683135099907938">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Window%dsetVisible(boolean)%cvoid" resolveInfo="setVisible" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="1567683135099907939">
                <property name="value" nameId="yvor.1068580123138:3" value="true" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" roleId="yvor.1070462273904:3" type="yvor.StaticMethodDeclaration" typeId="yvor.1081236700938:3" id="1567683135099907940">
      <property name="name" nameId="yvnu.1169194664001:0" value="main" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="1567683135099907941" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1567683135099907942" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1567683135099907943">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907944">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1567683135099907945">
            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~SwingUtilities%dinvokeLater(java%dlang%dRunnable)%cvoid" resolveInfo="invokeLater" />
            <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="t147.~SwingUtilities" resolveInfo="SwingUtilities" />
            <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1567683135099907946">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.AnonymousClassCreator" typeId="yvor.1182160077978:3" id="1567683135099907947">
                <node role="cls" roleId="yvor.1182160096073:3" type="yvor.AnonymousClass" typeId="yvor.1170345865475:3" id="1567683135099907948">
                  <property name="nonStatic" nameId="yvor.521412098689998745:3" value="true" />
                  <link role="classifier" roleId="yvor.1170346070688:3" targetNodeId="vhgx.~Runnable" resolveInfo="Runnable" />
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vhgx.~Object%d&lt;init&gt;()" resolveInfo="Object" />
                  <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1567683135099907949" />
                  <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="1567683135099907950">
                    <property name="isAbstract" nameId="yvor.1178608670077:3" value="false" />
                    <property name="name" nameId="yvnu.1169194664001:0" value="run" />
                    <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1567683135099907951" />
                    <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="1567683135099907952" />
                    <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1567683135099907953">
                      <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1567683135099907954">
                        <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalStaticMethodCall" typeId="yvor.1172058436953:3" id="1567683135099907955">
                          <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1567683135099907906" resolveInfo="create" />
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
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1567683135099907956">
        <property name="name" nameId="yvnu.1169194664001:0" value="args" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ArrayType" typeId="yvor.1070534760951:3" id="1567683135099907957">
          <node role="componentType" roleId="yvor.1070534760952:3" type="yvor.StringType" typeId="yvor.1225271177708:3" id="1567683135099907958" />
        </node>
      </node>
    </node>
  </root>
  <root id="903391227141130074">
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="903391227141130080">
      <property name="name" nameId="yvnu.1169194664001:0" value="paint" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="903391227141130081" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="903391227141130082" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="903391227141130083">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="2913448412765308012">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="2913448412765308013">
            <property name="name" nameId="yvnu.1169194664001:0" value="graph" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="2913448412765308014">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="aequ.2913448412765224985" resolveInfo="IGraph" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2913448412765308017">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="2913448412765308016">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141130084" resolveInfo="layout" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="2913448412765308021">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="rm96.2913448412765230862" resolveInfo="getGraph" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="2913448412765308034">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="2913448412765308035">
            <property name="name" nameId="yvnu.1169194664001:0" value="edgesIterator" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.IteratorType" typeId="yvix.1237467705688:7" id="2913448412765308036">
              <node role="elementType" roleId="yvix.1237467730343:7" type="yvor.UpperBoundType" typeId="yvor.1171903916106:3" id="2913448412765308037">
                <node role="bound" roleId="yvor.1171903916107:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="2913448412765308038">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="aequ.2913448412765224983" resolveInfo="IEdge" />
                </node>
              </node>
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2913448412765308039">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="2913448412765308040">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2913448412765308013" resolveInfo="graph" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="2913448412765308041">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.2913448412765225025" resolveInfo="getEdgesIterator" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.WhileStatement" typeId="yvor.1076505808687:3" id="2913448412765308042">
          <node role="condition" roleId="yvor.1076505808688:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2913448412765308046">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="2913448412765308045">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2913448412765308035" resolveInfo="edgesIterator" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.HasNextOperation" typeId="yvix.1237470895604:7" id="2913448412765308050" />
          </node>
          <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="2913448412765308044">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="2913448412765308053">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="2913448412765308054">
                <property name="name" nameId="yvnu.1169194664001:0" value="edge" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="2913448412765308055">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="aequ.2913448412765224983" resolveInfo="IEdge" />
                </node>
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2913448412765308058">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="2913448412765308057">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2913448412765308035" resolveInfo="edgesIterator" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetNextOperation" typeId="yvix.1237471031357:7" id="2913448412765308062" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="2913448412765308166">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="2913448412765308167">
                <property name="name" nameId="yvnu.1169194664001:0" value="routeIterator" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.IteratorType" typeId="yvix.1237467705688:7" id="2913448412765308168">
                  <node role="elementType" roleId="yvix.1237467730343:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="2913448412765308170">
                    <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="4dwg.2301768597858221425" resolveInfo="Point" />
                  </node>
                </node>
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2913448412765308173">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="2913448412765308172">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141130084" resolveInfo="layout" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="2913448412765308177">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="rm96.2913448412765230881" resolveInfo="getRouteLayout" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="2913448412765308178">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2913448412765308054" resolveInfo="edge" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="2913448412765308193">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="2913448412765308194">
                <property name="name" nameId="yvnu.1169194664001:0" value="first" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="2913448412765308195">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="4dwg.2301768597858221425" resolveInfo="Point" />
                </node>
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2913448412765308198">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="2913448412765308197">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2913448412765308167" resolveInfo="routeIterator" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetNextOperation" typeId="yvix.1237471031357:7" id="2913448412765308202" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="2913448412765308084">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="2913448412765308085">
                <property name="name" nameId="yvnu.1169194664001:0" value="cur" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="2913448412765308184">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="4dwg.2301768597858221425" resolveInfo="Point" />
                </node>
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="2913448412765308204">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2913448412765308194" resolveInfo="first" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.WhileStatement" typeId="yvor.1076505808687:3" id="2913448412765308090">
              <node role="condition" roleId="yvor.1076505808688:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2913448412765308091">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="2913448412765308180">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2913448412765308167" resolveInfo="routeIterator" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvix.HasNextOperation" typeId="yvix.1237470895604:7" id="2913448412765308093" />
              </node>
              <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="2913448412765308094">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="2913448412765308095">
                  <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="2913448412765308096">
                    <property name="name" nameId="yvnu.1169194664001:0" value="next" />
                    <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="2913448412765308182">
                      <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="4dwg.2301768597858221425" resolveInfo="Point" />
                    </node>
                    <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2913448412765308098">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="2913448412765308183">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2913448412765308167" resolveInfo="routeIterator" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetNextOperation" typeId="yvix.1237471031357:7" id="2913448412765308100" />
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="2913448412765308101">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2913448412765308102">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="2913448412765308103">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141130086" resolveInfo="g" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="2913448412765308104">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Graphics%ddrawLine(int,int,int,int)%cvoid" resolveInfo="drawLine" />
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2913448412765308105">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="2913448412765308106">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2913448412765308085" resolveInfo="cur" />
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="2913448412765308186">
                          <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="4dwg.2301768597858221431" resolveInfo="x" />
                        </node>
                      </node>
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2913448412765308108">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="2913448412765308109">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2913448412765308085" resolveInfo="cur" />
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="2913448412765308187">
                          <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="4dwg.2301768597858221436" resolveInfo="y" />
                        </node>
                      </node>
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2913448412765308111">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="2913448412765308112">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2913448412765308096" resolveInfo="next" />
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="2913448412765308188">
                          <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="4dwg.2301768597858221431" resolveInfo="x" />
                        </node>
                      </node>
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2913448412765308114">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="2913448412765308115">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2913448412765308096" resolveInfo="next" />
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="2913448412765308189">
                          <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="4dwg.2301768597858221436" resolveInfo="y" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="2913448412765308117">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="2913448412765308118">
                    <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="2913448412765308119">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2913448412765308096" resolveInfo="next" />
                    </node>
                    <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="2913448412765308120">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2913448412765308085" resolveInfo="cur" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="2913448412765308127">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2913448412765308128">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="2913448412765308129">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141130086" resolveInfo="g" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="2913448412765308130">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Graphics%dfillOval(int,int,int,int)%cvoid" resolveInfo="fillOval" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.MinusExpression" typeId="yvor.1068581242869:3" id="2913448412765308131">
                    <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="2913448412765308132">
                      <property name="value" nameId="yvor.1068580320021:3" value="2" />
                    </node>
                    <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2913448412765308133">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="2913448412765308134">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2913448412765308194" resolveInfo="first" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="2913448412765308207">
                        <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="4dwg.2301768597858221431" resolveInfo="x" />
                      </node>
                    </node>
                  </node>
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.MinusExpression" typeId="yvor.1068581242869:3" id="2913448412765308136">
                    <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="2913448412765308137">
                      <property name="value" nameId="yvor.1068580320021:3" value="2" />
                    </node>
                    <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2913448412765308138">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="2913448412765308139">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2913448412765308194" resolveInfo="first" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="2913448412765308210">
                        <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="4dwg.2301768597858221436" resolveInfo="y" />
                      </node>
                    </node>
                  </node>
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="2913448412765308141">
                    <property name="value" nameId="yvor.1068580320021:3" value="4" />
                  </node>
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="2913448412765308142">
                    <property name="value" nameId="yvor.1068580320021:3" value="4" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="2913448412765308149">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2913448412765308150">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="2913448412765308151">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141130086" resolveInfo="g" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="2913448412765308152">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Graphics%dfillOval(int,int,int,int)%cvoid" resolveInfo="fillOval" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.MinusExpression" typeId="yvor.1068581242869:3" id="2913448412765308153">
                    <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="2913448412765308154">
                      <property name="value" nameId="yvor.1068580320021:3" value="2" />
                    </node>
                    <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2913448412765308155">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="2913448412765308206">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2913448412765308085" resolveInfo="cur" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="2913448412765308208">
                        <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="4dwg.2301768597858221431" resolveInfo="x" />
                      </node>
                    </node>
                  </node>
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.MinusExpression" typeId="yvor.1068581242869:3" id="2913448412765308158">
                    <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="2913448412765308159">
                      <property name="value" nameId="yvor.1068580320021:3" value="2" />
                    </node>
                    <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2913448412765308160">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="2913448412765308205">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2913448412765308085" resolveInfo="cur" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="2913448412765308209">
                        <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="4dwg.2301768597858221436" resolveInfo="y" />
                      </node>
                    </node>
                  </node>
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="2913448412765308163">
                    <property name="value" nameId="yvor.1068580320021:3" value="4" />
                  </node>
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="2913448412765308164">
                    <property name="value" nameId="yvor.1068580320021:3" value="4" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="2913448412765308227">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="2913448412765308228">
            <property name="name" nameId="yvnu.1169194664001:0" value="nodesIterator" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.IteratorType" typeId="yvix.1237467705688:7" id="2913448412765308229">
              <node role="elementType" roleId="yvix.1237467730343:7" type="yvor.UpperBoundType" typeId="yvor.1171903916106:3" id="2913448412765308230">
                <node role="bound" roleId="yvor.1171903916107:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="2913448412765308231">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="aequ.2913448412765224981" resolveInfo="INode" />
                </node>
              </node>
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2913448412765308232">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="2913448412765308233">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2913448412765308013" resolveInfo="graph" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="2913448412765308234">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.2913448412765225018" resolveInfo="getNodesIterator" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.WhileStatement" typeId="yvor.1076505808687:3" id="2913448412765308236">
          <node role="condition" roleId="yvor.1076505808688:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2913448412765308240">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="2913448412765308239">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2913448412765308228" resolveInfo="nodesIterator" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.HasNextOperation" typeId="yvix.1237470895604:7" id="2913448412765308244" />
          </node>
          <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="2913448412765308238">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="2913448412765308247">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="2913448412765308248">
                <property name="name" nameId="yvnu.1169194664001:0" value="node" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="2913448412765308249">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="aequ.2913448412765224981" resolveInfo="INode" />
                </node>
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2913448412765308252">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="2913448412765308251">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2913448412765308228" resolveInfo="nodesIterator" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetNextOperation" typeId="yvix.1237471031357:7" id="2913448412765308256" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="2913448412765308260">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="2913448412765308261">
                <property name="name" nameId="yvnu.1169194664001:0" value="rect" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="2913448412765308262">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="4dwg.2301768597858221518" resolveInfo="Rectangle" />
                </node>
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2913448412765308265">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="2913448412765308264">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141130084" resolveInfo="layout" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="2913448412765308269">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="rm96.2913448412765230867" resolveInfo="getNodeLayout" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="2913448412765308270">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2913448412765308248" resolveInfo="node" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="2913448412765308272">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2913448412765308273">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="2913448412765308274">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141130086" resolveInfo="g" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="2913448412765308275">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Graphics%ddrawRect(int,int,int,int)%cvoid" resolveInfo="drawRect" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2913448412765308276">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="2913448412765308305">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2913448412765308261" resolveInfo="rect" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="2913448412765308278">
                      <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="4dwg.2301768597858221524" resolveInfo="x" />
                    </node>
                  </node>
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2913448412765308279">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="2913448412765308306">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2913448412765308261" resolveInfo="rect" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="2913448412765308281">
                      <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="4dwg.2301768597858221529" resolveInfo="y" />
                    </node>
                  </node>
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2913448412765308282">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="2913448412765308307">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2913448412765308261" resolveInfo="rect" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="2913448412765308284">
                      <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="4dwg.2301768597858221533" resolveInfo="width" />
                    </node>
                  </node>
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2913448412765308285">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="2913448412765308286">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2913448412765308261" resolveInfo="rect" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="2913448412765308287">
                      <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="4dwg.2301768597858221539" resolveInfo="height" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="2913448412765308288">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2913448412765308289">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="2913448412765308290">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141130086" resolveInfo="g" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="2913448412765308291">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Graphics%ddrawString(java%dlang%dString,int,int)%cvoid" resolveInfo="drawString" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2913448412765308292">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="2913448412765308309">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2913448412765308248" resolveInfo="node" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="2913448412765308294">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vhgx.~Object%dtoString()%cjava%dlang%dString" resolveInfo="toString" />
                    </node>
                  </node>
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="2913448412765308295">
                    <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2913448412765308296">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="2913448412765308297">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2913448412765308261" resolveInfo="rect" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="2913448412765308298">
                        <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="4dwg.2301768597858221524" resolveInfo="x" />
                      </node>
                    </node>
                    <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="2913448412765308299">
                      <property name="value" nameId="yvor.1068580320021:3" value="5" />
                    </node>
                  </node>
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="2913448412765308300">
                    <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2913448412765308301">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="2913448412765308302">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2913448412765308261" resolveInfo="rect" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="2913448412765308303">
                        <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="4dwg.2301768597858221529" resolveInfo="y" />
                      </node>
                    </node>
                    <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="2913448412765308304">
                      <property name="value" nameId="yvor.1068580320021:3" value="15" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.Statement" typeId="yvor.1068580123157:3" id="2913448412765308271" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="2913448412765308314">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="2913448412765308316">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2913448412765308321">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="2913448412765308320">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2913448412765308013" resolveInfo="graph" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="2913448412765308325">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.2913448412765225025" resolveInfo="getEdgesIterator" />
              </node>
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="2913448412765308315">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2913448412765308035" resolveInfo="edgesIterator" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.WhileStatement" typeId="yvor.1076505808687:3" id="2913448412765308332">
          <node role="condition" roleId="yvor.1076505808688:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2913448412765308333">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="2913448412765308334">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2913448412765308035" resolveInfo="edgesIterator" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.HasNextOperation" typeId="yvix.1237470895604:7" id="2913448412765308335" />
          </node>
          <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="2913448412765308336">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="2913448412765308337">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="2913448412765308338">
                <property name="name" nameId="yvnu.1169194664001:0" value="edge" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="2913448412765308339">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="aequ.2913448412765224983" resolveInfo="IEdge" />
                </node>
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2913448412765308340">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="2913448412765308341">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2913448412765308035" resolveInfo="edgesIterator" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetNextOperation" typeId="yvix.1237471031357:7" id="2913448412765308342" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="2913448412765308431">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="2913448412765308432">
                <property name="name" nameId="yvnu.1169194664001:0" value="rect" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="2913448412765308433">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="4dwg.2301768597858221518" resolveInfo="Rectangle" />
                </node>
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2913448412765308436">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="2913448412765308435">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141130084" resolveInfo="layout" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="2913448412765308440">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="rm96.2913448412765230874" resolveInfo="getLabelLayout" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="2913448412765308441">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2913448412765308338" resolveInfo="edge" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="2913448412765308443">
              <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="2913448412765308444">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="2913448412765308452">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2913448412765308453">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="2913448412765308454">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141130086" resolveInfo="g" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="2913448412765308455">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Graphics%ddrawRect(int,int,int,int)%cvoid" resolveInfo="drawRect" />
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2913448412765308456">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="2913448412765308457">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2913448412765308432" resolveInfo="rect" />
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="2913448412765308458">
                          <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="4dwg.2301768597858221524" resolveInfo="x" />
                        </node>
                      </node>
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2913448412765308459">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="2913448412765308460">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2913448412765308432" resolveInfo="rect" />
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="2913448412765308461">
                          <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="4dwg.2301768597858221529" resolveInfo="y" />
                        </node>
                      </node>
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2913448412765308462">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="2913448412765308463">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2913448412765308432" resolveInfo="rect" />
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="2913448412765308464">
                          <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="4dwg.2301768597858221533" resolveInfo="width" />
                        </node>
                      </node>
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2913448412765308465">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="2913448412765308466">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2913448412765308432" resolveInfo="rect" />
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="2913448412765308467">
                          <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="4dwg.2301768597858221539" resolveInfo="height" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="2913448412765308468">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2913448412765308469">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="2913448412765308470">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141130086" resolveInfo="g" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="2913448412765308471">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Graphics%ddrawString(java%dlang%dString,int,int)%cvoid" resolveInfo="drawString" />
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2913448412765308472">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="2913448412765308485">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2913448412765308338" resolveInfo="edge" />
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="2913448412765308474">
                          <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vhgx.~Object%dtoString()%cjava%dlang%dString" resolveInfo="toString" />
                        </node>
                      </node>
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="2913448412765308475">
                        <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2913448412765308476">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="2913448412765308477">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2913448412765308432" resolveInfo="rect" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="2913448412765308478">
                            <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="4dwg.2301768597858221524" resolveInfo="x" />
                          </node>
                        </node>
                        <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="2913448412765308479">
                          <property name="value" nameId="yvor.1068580320021:3" value="5" />
                        </node>
                      </node>
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="2913448412765308480">
                        <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2913448412765308481">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="2913448412765308482">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2913448412765308432" resolveInfo="rect" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="2913448412765308483">
                            <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="4dwg.2301768597858221529" resolveInfo="y" />
                          </node>
                        </node>
                        <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="2913448412765308484">
                          <property name="value" nameId="yvor.1068580320021:3" value="12" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.Statement" typeId="yvor.1068580123157:3" id="2913448412765308445" />
              </node>
              <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotEqualsExpression" typeId="yvor.1073239437375:3" id="2913448412765308448">
                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="2913448412765308451" />
                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="2913448412765308447">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2913448412765308432" resolveInfo="rect" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="903391227141130084">
        <property name="name" nameId="yvnu.1169194664001:0" value="layout" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="2913448412765308008">
          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="rm96.2913448412765230860" resolveInfo="IGraphLayout" />
        </node>
      </node>
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="903391227141130086">
        <property name="name" nameId="yvnu.1169194664001:0" value="g" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="903391227141130088">
          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~Graphics" resolveInfo="Graphics" />
        </node>
      </node>
    </node>
    <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="903391227141130075" />
    <node role="constructor" roleId="yvor.1068390468201:3" type="yvor.ConstructorDeclaration" typeId="yvor.1068580123140:3" id="903391227141130076">
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="903391227141130077" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="903391227141130078" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="903391227141130079" />
    </node>
  </root>
  <root id="903391227141135207">
    <node role="staticInnerClassifiers" roleId="yvor.1178616825527:3" type="yvor.ClassConcept" typeId="yvor.1068390468198:3" id="6160477238666740861">
      <property name="nonStatic" nameId="yvor.521412098689998745:3" value="true" />
      <property name="name" nameId="yvnu.1169194664001:0" value="MyLayoutChoice" />
      <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="6160477238666742339">
        <property name="name" nameId="yvnu.1169194664001:0" value="getSelectedLayoutLavel" />
        <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="6160477238666742343" />
        <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="6160477238666742341" />
        <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="6160477238666742342">
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="6160477238666743961">
            <node role="expression" roleId="yvor.1068581517676:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="6160477238666743963">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6160477238666743957" resolveInfo="layoutLevel" />
            </node>
          </node>
        </node>
      </node>
      <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="8680836410351749781">
        <property name="name" nameId="yvnu.1169194664001:0" value="isSetLabels" />
        <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.BooleanType" typeId="yvor.1070534644030:3" id="8680836410351749785" />
        <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="8680836410351749783" />
        <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8680836410351749784">
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="8680836410351749795">
            <node role="expression" roleId="yvor.1068581517676:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8680836410351749798">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8680836410351749797">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8680836410351744506" resolveInfo="myLabelForAllEdges" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8680836410351749802">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~AbstractButton%disSelected()%cboolean" resolveInfo="isSelected" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="field" roleId="yvor.1068390468199:3" type="yvor.FieldDeclaration" typeId="yvor.1068390468200:3" id="6160477238666743957">
        <property name="name" nameId="yvnu.1169194664001:0" value="myLayoutLevel" />
        <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="6160477238666743958" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="6160477238666743960" />
      </node>
      <node role="field" roleId="yvor.1068390468199:3" type="yvor.FieldDeclaration" typeId="yvor.1068390468200:3" id="8680836410351744506">
        <property name="name" nameId="yvnu.1169194664001:0" value="myLabelForAllEdges" />
        <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="8680836410351744507" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8680836410351749773">
          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="t147.~JRadioButton" resolveInfo="JRadioButton" />
        </node>
      </node>
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="6160477238666740865" />
      <node role="constructor" roleId="yvor.1068390468201:3" type="yvor.ConstructorDeclaration" typeId="yvor.1068580123140:3" id="6160477238666740866">
        <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="6160477238666740867" />
        <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="6160477238666740868" />
        <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="6160477238666740869">
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="6160477238666740870">
            <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="6160477238666740871">
              <property name="name" nameId="yvnu.1169194664001:0" value="group" />
              <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="6160477238666740872">
                <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="t147.~ButtonGroup" resolveInfo="ButtonGroup" />
              </node>
              <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="6160477238666740873">
                <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="6160477238666740874">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~ButtonGroup%d&lt;init&gt;()" resolveInfo="ButtonGroup" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="6160477238666741127">
            <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="6160477238666741128">
              <property name="name" nameId="yvnu.1169194664001:0" value="c" />
              <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="6160477238666741129">
                <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~GridBagConstraints" resolveInfo="GridBagConstraints" />
              </node>
              <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="6160477238666741130">
                <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="6160477238666741131">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~GridBagConstraints%d&lt;init&gt;()" resolveInfo="GridBagConstraints" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6160477238666741132">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="6160477238666741133">
              <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="6160477238666741134">
                <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="2uit.~GridBagConstraints" resolveInfo="GridBagConstraints" />
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2uit.~GridBagConstraints%dVERTICAL" resolveInfo="VERTICAL" />
              </node>
              <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6160477238666741135">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6160477238666741136">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6160477238666741128" resolveInfo="c" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="6160477238666741137">
                  <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dfill" resolveInfo="fill" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6160477238666741138">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="6160477238666741139">
              <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6160477238666741140">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6160477238666741141">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6160477238666741128" resolveInfo="c" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="6160477238666741142">
                  <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridx" resolveInfo="gridx" />
                </node>
              </node>
              <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="6160477238666741143">
                <property name="value" nameId="yvor.1068580320021:3" value="0" />
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6160477238666741159">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="6160477238666741160">
              <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6160477238666741161">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6160477238666741162">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6160477238666741128" resolveInfo="c" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="6160477238666741163">
                  <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridy" resolveInfo="gridy" />
                </node>
              </node>
              <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="6160477238666741164">
                <property name="value" nameId="yvor.1068580320021:3" value="0" />
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="6160477238666743968">
            <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="6160477238666743969">
              <property name="name" nameId="yvnu.1169194664001:0" value="button" />
              <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="6160477238666743970">
                <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="t147.~JRadioButton" resolveInfo="JRadioButton" />
              </node>
              <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="6160477238666743972">
                <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="6160477238666743973">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JRadioButton%d&lt;init&gt;(java%dlang%dString)" resolveInfo="JRadioButton" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="6160477238666743974">
                    <property name="value" nameId="yvor.1070475926801:3" value="visibility layout" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6160477238666743998">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6160477238666744000">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6160477238666743999">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6160477238666743969" resolveInfo="button" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="6160477238666744011">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~AbstractButton%daddActionListener(java%dawt%devent%dActionListener)%cvoid" resolveInfo="addActionListener" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="6160477238666744012">
                  <node role="creator" roleId="yvor.1145553007750:3" type="yvor.AnonymousClassCreator" typeId="yvor.1182160077978:3" id="6160477238666744014">
                    <node role="cls" roleId="yvor.1182160096073:3" type="yvor.AnonymousClass" typeId="yvor.1170345865475:3" id="6160477238666744015">
                      <property name="nonStatic" nameId="yvor.521412098689998745:3" value="true" />
                      <link role="classifier" roleId="yvor.1170346070688:3" targetNodeId="46vv.~ActionListener" resolveInfo="ActionListener" />
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vhgx.~Object%d&lt;init&gt;()" resolveInfo="Object" />
                      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="6160477238666744016" />
                      <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="6160477238666744017">
                        <property name="isAbstract" nameId="yvor.1178608670077:3" value="false" />
                        <property name="name" nameId="yvnu.1169194664001:0" value="actionPerformed" />
                        <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="6160477238666744018" />
                        <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="6160477238666744019" />
                        <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="6160477238666744020">
                          <property name="name" nameId="yvnu.1169194664001:0" value="p0" />
                          <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="6160477238666744021">
                            <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="46vv.~ActionEvent" resolveInfo="ActionEvent" />
                          </node>
                        </node>
                        <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="6160477238666744022">
                          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6160477238666744023">
                            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="6160477238666744025">
                              <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="6160477238666744028">
                                <property name="value" nameId="yvor.1068580320021:3" value="0" />
                              </node>
                              <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="6160477238666744024">
                                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6160477238666743957" resolveInfo="myLayoutLevel" />
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
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6160477238666740909">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6160477238666740910">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="6160477238666740911" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="6160477238666740912">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Container%dadd(java%dawt%dComponent)%cjava%dawt%dComponent" resolveInfo="add" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6160477238666743975">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6160477238666743969" resolveInfo="button" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6160477238666743977">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6160477238666743979">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6160477238666743978">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6160477238666740871" resolveInfo="group" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="6160477238666743983">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~ButtonGroup%dadd(javax%dswing%dAbstractButton)%cvoid" resolveInfo="add" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6160477238666743984">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6160477238666743969" resolveInfo="button" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6160477238666741096">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="6160477238666741103">
              <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="6160477238666741106">
                <property name="value" nameId="yvor.1068580320021:3" value="1" />
              </node>
              <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6160477238666741098">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6160477238666741097">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6160477238666741128" resolveInfo="c" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="6160477238666741587">
                  <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridy" resolveInfo="gridy" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6160477238666741166">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="6160477238666741167">
              <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="6160477238666741168">
                <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="6160477238666741169">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JRadioButton%d&lt;init&gt;(java%dlang%dString)" resolveInfo="JRadioButton" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="6160477238666741170">
                    <property name="value" nameId="yvor.1070475926801:3" value="graph layout" />
                  </node>
                </node>
              </node>
              <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6160477238666743985">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6160477238666743969" resolveInfo="button" />
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6160477238666744049">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6160477238666744050">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6160477238666744051">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6160477238666743969" resolveInfo="button" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="6160477238666744052">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~AbstractButton%daddActionListener(java%dawt%devent%dActionListener)%cvoid" resolveInfo="addActionListener" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="6160477238666744053">
                  <node role="creator" roleId="yvor.1145553007750:3" type="yvor.AnonymousClassCreator" typeId="yvor.1182160077978:3" id="6160477238666744054">
                    <node role="cls" roleId="yvor.1182160096073:3" type="yvor.AnonymousClass" typeId="yvor.1170345865475:3" id="6160477238666744055">
                      <property name="nonStatic" nameId="yvor.521412098689998745:3" value="true" />
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vhgx.~Object%d&lt;init&gt;()" resolveInfo="Object" />
                      <link role="classifier" roleId="yvor.1170346070688:3" targetNodeId="46vv.~ActionListener" resolveInfo="ActionListener" />
                      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="6160477238666744056" />
                      <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="6160477238666744057">
                        <property name="isAbstract" nameId="yvor.1178608670077:3" value="false" />
                        <property name="name" nameId="yvnu.1169194664001:0" value="actionPerformed" />
                        <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="6160477238666744058" />
                        <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="6160477238666744059" />
                        <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="6160477238666744060">
                          <property name="name" nameId="yvnu.1169194664001:0" value="p0" />
                          <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="6160477238666744061">
                            <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="46vv.~ActionEvent" resolveInfo="ActionEvent" />
                          </node>
                        </node>
                        <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="6160477238666744062">
                          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6160477238666744063">
                            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="6160477238666744064">
                              <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="6160477238666744066">
                                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6160477238666743957" resolveInfo="myLayoutLevel" />
                              </node>
                              <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="6160477238666744087">
                                <property name="value" nameId="yvor.1068580320021:3" value="1" />
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
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6160477238666741173">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6160477238666741175">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="6160477238666741174" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="6160477238666741179">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Container%dadd(java%dawt%dComponent)%cjava%dawt%dComponent" resolveInfo="add" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6160477238666743986">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6160477238666743969" resolveInfo="button" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6160477238666743988">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6160477238666743989">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6160477238666743990">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6160477238666740871" resolveInfo="group" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="6160477238666743991">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~ButtonGroup%dadd(javax%dswing%dAbstractButton)%cvoid" resolveInfo="add" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6160477238666743992">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6160477238666743969" resolveInfo="button" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6160477238666741182">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="6160477238666741183">
              <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6160477238666741185">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6160477238666741186">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6160477238666741128" resolveInfo="c" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="6160477238666741588">
                  <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridy" resolveInfo="gridy" />
                </node>
              </node>
              <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="6160477238666741199">
                <property name="value" nameId="yvor.1068580320021:3" value="2" />
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6160477238666741188">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="6160477238666741189">
              <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="6160477238666741190">
                <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="6160477238666741191">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JRadioButton%d&lt;init&gt;(java%dlang%dString)" resolveInfo="JRadioButton" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="6160477238666741192">
                    <property name="value" nameId="yvor.1070475926801:3" value="optimized layout" />
                  </node>
                </node>
              </node>
              <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6160477238666743993">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6160477238666743969" resolveInfo="button" />
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6160477238666744068">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6160477238666744069">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6160477238666744070">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6160477238666743969" resolveInfo="button" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="6160477238666744071">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~AbstractButton%daddActionListener(java%dawt%devent%dActionListener)%cvoid" resolveInfo="addActionListener" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="6160477238666744072">
                  <node role="creator" roleId="yvor.1145553007750:3" type="yvor.AnonymousClassCreator" typeId="yvor.1182160077978:3" id="6160477238666744073">
                    <node role="cls" roleId="yvor.1182160096073:3" type="yvor.AnonymousClass" typeId="yvor.1170345865475:3" id="6160477238666744074">
                      <property name="nonStatic" nameId="yvor.521412098689998745:3" value="true" />
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vhgx.~Object%d&lt;init&gt;()" resolveInfo="Object" />
                      <link role="classifier" roleId="yvor.1170346070688:3" targetNodeId="46vv.~ActionListener" resolveInfo="ActionListener" />
                      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="6160477238666744075" />
                      <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="6160477238666744076">
                        <property name="isAbstract" nameId="yvor.1178608670077:3" value="false" />
                        <property name="name" nameId="yvnu.1169194664001:0" value="actionPerformed" />
                        <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="6160477238666744077" />
                        <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="6160477238666744078" />
                        <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="6160477238666744079">
                          <property name="name" nameId="yvnu.1169194664001:0" value="p0" />
                          <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="6160477238666744080">
                            <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="46vv.~ActionEvent" resolveInfo="ActionEvent" />
                          </node>
                        </node>
                        <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="6160477238666744081">
                          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6160477238666744082">
                            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="6160477238666744083">
                              <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="6160477238666744085">
                                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6160477238666743957" resolveInfo="myLayoutLevel" />
                              </node>
                              <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="6160477238666744086">
                                <property name="value" nameId="yvor.1068580320021:3" value="2" />
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
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6160477238666741194">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6160477238666741195">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="6160477238666741196" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="6160477238666741197">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Container%dadd(java%dawt%dComponent)%cjava%dawt%dComponent" resolveInfo="add" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6160477238666743994">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6160477238666743969" resolveInfo="button" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6160477238666741201">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6160477238666741203">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6160477238666741202">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6160477238666740871" resolveInfo="group" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="6160477238666741207">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~ButtonGroup%dadd(javax%dswing%dAbstractButton)%cvoid" resolveInfo="add" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6160477238666743995">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6160477238666743969" resolveInfo="button" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6160477238666742152">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6160477238666742154">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6160477238666743996">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6160477238666743969" resolveInfo="button" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="6160477238666742158">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~AbstractButton%dsetSelected(boolean)%cvoid" resolveInfo="setSelected" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="6160477238666742159">
                  <property name="value" nameId="yvor.1068580123138:3" value="true" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8680836410351744512">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8680836410351744519">
              <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8680836410351744522">
                <property name="value" nameId="yvor.1068580320021:3" value="3" />
              </node>
              <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8680836410351744514">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8680836410351744513">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6160477238666741128" resolveInfo="c" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="8680836410351744518">
                  <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridy" resolveInfo="gridy" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8680836410351744524">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8680836410351744526">
              <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8680836410351744529">
                <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="8680836410351749716">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JRadioButton%d&lt;init&gt;(java%dlang%dString)" resolveInfo="JRadioButton" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="8680836410351749717">
                    <property name="value" nameId="yvor.1070475926801:3" value="add labels for each edge" />
                  </node>
                </node>
              </node>
              <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8680836410351744525">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6160477238666743969" resolveInfo="button" />
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8680836410351749720">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8680836410351749722">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="8680836410351749721" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8680836410351749726">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Container%dadd(java%dawt%dComponent)%cjava%dawt%dComponent" resolveInfo="add" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8680836410351749729">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6160477238666743969" resolveInfo="button" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8680836410351749730">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8680836410351749732">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8680836410351749731">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6160477238666743969" resolveInfo="button" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8680836410351749736">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~AbstractButton%dsetSelected(boolean)%cvoid" resolveInfo="setSelected" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="8680836410351749737">
                  <property name="value" nameId="yvor.1068580123138:3" value="true" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8680836410351749775">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8680836410351749777">
              <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8680836410351749780">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6160477238666743969" resolveInfo="button" />
              </node>
              <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8680836410351749776">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8680836410351744506" resolveInfo="myLabelForAllEdges" />
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6160477238666744005">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="6160477238666744007">
              <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="6160477238666744010">
                <property name="value" nameId="yvor.1068580320021:3" value="2" />
              </node>
              <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="6160477238666744006">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6160477238666743957" resolveInfo="myLayoutLevel" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="superclass" roleId="yvor.1165602531693:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="6160477238666740914">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="t147.~JPanel" resolveInfo="JPanel" />
      </node>
    </node>
    <node role="staticInnerClassifiers" roleId="yvor.1178616825527:3" type="yvor.ClassConcept" typeId="yvor.1068390468198:3" id="903391227141135208">
      <property name="nonStatic" nameId="yvor.521412098689998745:3" value="true" />
      <property name="name" nameId="yvnu.1169194664001:0" value="MyGraphLabel" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="903391227141135209" />
      <node role="constructor" roleId="yvor.1068390468201:3" type="yvor.ConstructorDeclaration" typeId="yvor.1068580123140:3" id="903391227141135210">
        <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="903391227141135211" />
        <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="903391227141135212" />
        <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="903391227141135213">
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.SuperConstructorInvocation" typeId="yvor.1070475587102:3" id="903391227141135214">
            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JLabel%d&lt;init&gt;()" resolveInfo="JLabel" />
          </node>
        </node>
      </node>
      <node role="superclass" roleId="yvor.1165602531693:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="903391227141135215">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="t147.~JLabel" resolveInfo="JLabel" />
      </node>
      <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="903391227141135216">
        <property name="name" nameId="yvnu.1169194664001:0" value="paintComponent" />
        <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="903391227141135217" />
        <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="903391227141135218" />
        <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="903391227141135219">
          <property name="name" nameId="yvnu.1169194664001:0" value="graphics" />
          <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="903391227141135220">
            <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~Graphics" resolveInfo="Graphics" />
          </node>
        </node>
        <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="903391227141135221">
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="903391227141136088">
            <node role="condition" roleId="yvor.1068580123160:3" type="yvor.EqualsExpression" typeId="yvor.1068580123152:3" id="903391227141136092">
              <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="903391227141136095" />
              <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="903391227141136091">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135422" resolveInfo="myCurrentLayout" />
              </node>
            </node>
            <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="903391227141136090">
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141136096">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141136098">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="903391227141136097">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135219" resolveInfo="graphics" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="903391227141136102">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Graphics%ddrawString(java%dlang%dString,int,int)%cvoid" resolveInfo="drawString" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="903391227141136103">
                      <property name="value" nameId="yvor.1070475926801:3" value="no graph yet!!!" />
                    </node>
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="903391227141136105">
                      <property name="value" nameId="yvor.1068580320021:3" value="50" />
                    </node>
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="903391227141136107">
                      <property name="value" nameId="yvor.1068580320021:3" value="50" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="ifFalseStatement" roleId="yvor.1082485599094:3" type="yvor.BlockStatement" typeId="yvor.1082485599095:3" id="903391227141136108">
              <node role="statements" roleId="yvor.1082485599096:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="903391227141136109">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141136110">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141136112">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="903391227141136111">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141136131" resolveInfo="myPainter" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="903391227141136116">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="903391227141130080" resolveInfo="paint" />
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="903391227141136117">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135422" resolveInfo="myCurrentLayout" />
                      </node>
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="903391227141136120">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135219" resolveInfo="graphics" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="annotation" roleId="yvor.1188208488637:3" type="yvor.AnnotationInstance" typeId="yvor.1188207840427:3" id="903391227141135412">
          <link role="annotation" roleId="yvor.1188208074048:3" targetNodeId="vhgx.~Override" resolveInfo="Override" />
        </node>
      </node>
    </node>
    <node role="field" roleId="yvor.1068390468199:3" type="yvor.FieldDeclaration" typeId="yvor.1068390468200:3" id="903391227141135413">
      <property name="name" nameId="yvnu.1169194664001:0" value="myTextArea" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="903391227141135414" />
      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="903391227141135415">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="t147.~JTextArea" resolveInfo="JTextArea" />
      </node>
    </node>
    <node role="field" roleId="yvor.1068390468199:3" type="yvor.FieldDeclaration" typeId="yvor.1068390468200:3" id="903391227141135416">
      <property name="name" nameId="yvnu.1169194664001:0" value="myGraphLabel" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="903391227141135417" />
      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="903391227141135418">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="903391227141135208" resolveInfo="TestPanel.MyGraphLabel" />
      </node>
    </node>
    <node role="field" roleId="yvor.1068390468199:3" type="yvor.FieldDeclaration" typeId="yvor.1068390468200:3" id="903391227141136156">
      <property name="name" nameId="yvnu.1169194664001:0" value="myLayouter" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="903391227141136157" />
      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="5368829933099767174">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="4t6q.7021611379030082968" resolveInfo="AbstractOrthogonalFlowLayouter" />
      </node>
    </node>
    <node role="field" roleId="yvor.1068390468199:3" type="yvor.FieldDeclaration" typeId="yvor.1068390468200:3" id="903391227141136131">
      <property name="name" nameId="yvnu.1169194664001:0" value="myPainter" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="903391227141136132" />
      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="903391227141136133">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="903391227141130074" resolveInfo="LayoutPainter" />
      </node>
    </node>
    <node role="field" roleId="yvor.1068390468199:3" type="yvor.FieldDeclaration" typeId="yvor.1068390468200:3" id="903391227141135422">
      <property name="name" nameId="yvnu.1169194664001:0" value="myCurrentLayout" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="903391227141135423" />
      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="2913448412765314842">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="rm96.2913448412765230860" resolveInfo="IGraphLayout" />
      </node>
    </node>
    <node role="field" roleId="yvor.1068390468199:3" type="yvor.FieldDeclaration" typeId="yvor.1068390468200:3" id="903391227141135425">
      <property name="name" nameId="yvnu.1169194664001:0" value="myNumEdgesField" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="903391227141135426" />
      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="903391227141135427">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="t147.~JTextField" resolveInfo="JTextField" />
      </node>
    </node>
    <node role="field" roleId="yvor.1068390468199:3" type="yvor.FieldDeclaration" typeId="yvor.1068390468200:3" id="903391227141135428">
      <property name="name" nameId="yvnu.1169194664001:0" value="myNumNodesField" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="903391227141135429" />
      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="903391227141135430">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="t147.~JTextField" resolveInfo="JTextField" />
      </node>
    </node>
    <node role="field" roleId="yvor.1068390468199:3" type="yvor.FieldDeclaration" typeId="yvor.1068390468200:3" id="6160477238666742422">
      <property name="name" nameId="yvnu.1169194664001:0" value="myLayoutChoice" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="6160477238666742423" />
      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="6160477238666742425">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="6160477238666740861" resolveInfo="OrthogonalLayoutTestPanel.MyLayoutChoice" />
      </node>
    </node>
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="6160477238666723341">
      <property name="name" nameId="yvnu.1169194664001:0" value="createLayoutChoiceButtons" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="6160477238666723342" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="6160477238666723345" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="6160477238666723344">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="6160477238666723529">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="6160477238666723530">
            <property name="name" nameId="yvnu.1169194664001:0" value="c" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="6160477238666723531">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~GridBagConstraints" resolveInfo="GridBagConstraints" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="6160477238666723532">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="6160477238666723533">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~GridBagConstraints%d&lt;init&gt;()" resolveInfo="GridBagConstraints" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6160477238666723534">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="6160477238666723535">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="6160477238666723536">
              <property name="value" nameId="yvor.1068580320021:3" value="0" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6160477238666723537">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6160477238666723538">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6160477238666723530" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="6160477238666723539">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridy" resolveInfo="gridy" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6160477238666723540">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="6160477238666723541">
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6160477238666723543">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6160477238666723544">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6160477238666723530" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="6160477238666723545">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridx" resolveInfo="gridx" />
              </node>
            </node>
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="6160477238666723580">
              <property name="value" nameId="yvor.1068580320021:3" value="2" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6160477238666723546">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="6160477238666723547">
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6160477238666723548">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6160477238666723549">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6160477238666723530" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="6160477238666723550">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dfill" resolveInfo="fill" />
              </node>
            </node>
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="6160477238666723551">
              <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="2uit.~GridBagConstraints" resolveInfo="GridBagConstraints" />
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2uit.~GridBagConstraints%dHORIZONTAL" resolveInfo="HORIZONTAL" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6160477238666742434">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="6160477238666742436">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="6160477238666742439">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="6160477238666742441">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="6160477238666740866" resolveInfo="OrthogonalLayoutTestPanel.MyLayoutChoice" />
              </node>
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="6160477238666742435">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6160477238666742422" resolveInfo="myLayoutChoice" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6160477238666740738">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6160477238666740740">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="6160477238666740739" />
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="6160477238666740744">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Container%dadd(java%dawt%dComponent)%cjava%dawt%dComponent" resolveInfo="add" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="6160477238666742442">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6160477238666742422" resolveInfo="myLayoutChoice" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="903391227141135434">
      <property name="name" nameId="yvnu.1169194664001:0" value="createNewGraphButton" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="903391227141135435" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="903391227141135436" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="903391227141135437">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135438">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="903391227141135439">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="903391227141135440">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="903391227141135441">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTextField%d&lt;init&gt;(int)" resolveInfo="JTextField" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="903391227141135442">
                  <property name="value" nameId="yvor.1068580320021:3" value="10" />
                </node>
              </node>
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="903391227141135443">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135428" resolveInfo="myNumNodesField" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135444">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141135445">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="903391227141135446">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135428" resolveInfo="myNumNodesField" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="903391227141135447">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JComponent%dsetBorder(javax%dswing%dborder%dBorder)%cvoid" resolveInfo="setBorder" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="903391227141135448">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~BorderFactory%dcreateTitledBorder(java%dlang%dString)%cjavax%dswing%dborder%dTitledBorder" resolveInfo="createTitledBorder" />
                <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="t147.~BorderFactory" resolveInfo="BorderFactory" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="903391227141135449">
                  <property name="value" nameId="yvor.1070475926801:3" value="nodes:" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135450">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="903391227141135451">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="903391227141135452">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="903391227141135453">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTextField%d&lt;init&gt;(int)" resolveInfo="JTextField" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="903391227141135454">
                  <property name="value" nameId="yvor.1068580320021:3" value="10" />
                </node>
              </node>
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="903391227141135455">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135425" resolveInfo="myNumEdgesField" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135456">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141135457">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="903391227141135458">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135425" resolveInfo="myNumEdgesField" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="903391227141135459">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JComponent%dsetBorder(javax%dswing%dborder%dBorder)%cvoid" resolveInfo="setBorder" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="903391227141135460">
                <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="t147.~BorderFactory" resolveInfo="BorderFactory" />
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~BorderFactory%dcreateTitledBorder(java%dlang%dString)%cjavax%dswing%dborder%dTitledBorder" resolveInfo="createTitledBorder" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="903391227141135461">
                  <property name="value" nameId="yvor.1070475926801:3" value="edges:" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="903391227141135468">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="903391227141135469">
            <property name="name" nameId="yvnu.1169194664001:0" value="c" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="903391227141135470">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~GridBagConstraints" resolveInfo="GridBagConstraints" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="903391227141135471">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="903391227141135472">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~GridBagConstraints%d&lt;init&gt;()" resolveInfo="GridBagConstraints" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135473">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="903391227141135474">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="903391227141135475">
              <property name="value" nameId="yvor.1068580320021:3" value="0" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141135476">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="903391227141135477">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135469" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="903391227141135478">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridy" resolveInfo="gridy" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135479">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="903391227141135480">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="903391227141135481">
              <property name="value" nameId="yvor.1068580320021:3" value="1" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141135482">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="903391227141135483">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135469" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="903391227141135484">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridx" resolveInfo="gridx" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135485">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="903391227141135486">
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141135487">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="903391227141135488">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135469" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="903391227141135489">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dfill" resolveInfo="fill" />
              </node>
            </node>
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="903391227141135490">
              <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="2uit.~GridBagConstraints" resolveInfo="GridBagConstraints" />
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2uit.~GridBagConstraints%dHORIZONTAL" resolveInfo="HORIZONTAL" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135491">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141135492">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="903391227141135493" />
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="903391227141135494">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Container%dadd(java%dawt%dComponent)%cjava%dawt%dComponent" resolveInfo="add" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="903391227141135495">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135428" resolveInfo="myNumNodesField" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135496">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="903391227141135497">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="903391227141135498">
              <property name="value" nameId="yvor.1068580320021:3" value="2" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141135499">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="903391227141135500">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135469" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="903391227141135501">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridx" resolveInfo="gridx" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135502">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141135503">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="903391227141135504" />
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="903391227141135505">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Container%dadd(java%dawt%dComponent)%cjava%dawt%dComponent" resolveInfo="add" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="903391227141135506">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135425" resolveInfo="myNumEdgesField" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135507">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="903391227141135508">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="903391227141135509">
              <property name="value" nameId="yvor.1068580320021:3" value="3" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141135510">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="903391227141135511">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135469" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="903391227141135512">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridy" resolveInfo="gridy" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135518">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="903391227141135519">
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141135520">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="903391227141135521">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135469" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="903391227141135522">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridy" resolveInfo="gridy" />
              </node>
            </node>
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="903391227141135523">
              <property name="value" nameId="yvor.1068580320021:3" value="4" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="903391227141135524">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="903391227141135525">
            <property name="name" nameId="yvnu.1169194664001:0" value="button" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="903391227141135526">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="t147.~JButton" resolveInfo="JButton" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="903391227141135527">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="903391227141135528">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JButton%d&lt;init&gt;(java%dlang%dString)" resolveInfo="JButton" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="903391227141135529">
                  <property name="value" nameId="yvor.1070475926801:3" value="generate graph!" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135530">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141135531">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="903391227141135532">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135525" resolveInfo="button" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="903391227141135533">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~AbstractButton%daddActionListener(java%dawt%devent%dActionListener)%cvoid" resolveInfo="addActionListener" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="903391227141135534">
                <node role="creator" roleId="yvor.1145553007750:3" type="yvor.AnonymousClassCreator" typeId="yvor.1182160077978:3" id="903391227141135535">
                  <node role="cls" roleId="yvor.1182160096073:3" type="yvor.AnonymousClass" typeId="yvor.1170345865475:3" id="903391227141135536">
                    <property name="nonStatic" nameId="yvor.521412098689998745:3" value="true" />
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vhgx.~Object%d&lt;init&gt;()" resolveInfo="Object" />
                    <link role="classifier" roleId="yvor.1170346070688:3" targetNodeId="46vv.~ActionListener" resolveInfo="ActionListener" />
                    <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="903391227141135537" />
                    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="903391227141135538">
                      <property name="isAbstract" nameId="yvor.1178608670077:3" value="false" />
                      <property name="name" nameId="yvnu.1169194664001:0" value="actionPerformed" />
                      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="903391227141135539" />
                      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="903391227141135540" />
                      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="903391227141135541">
                        <property name="name" nameId="yvnu.1169194664001:0" value="p0" />
                        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="903391227141135542">
                          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="46vv.~ActionEvent" resolveInfo="ActionEvent" />
                        </node>
                      </node>
                      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="903391227141135543">
                        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.TryCatchStatement" typeId="yvor.1164879751025:3" id="903391227141135544">
                          <node role="body" roleId="yvor.1164879758292:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="903391227141135545">
                            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="903391227141135546">
                              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="903391227141135547">
                                <property name="name" nameId="yvnu.1169194664001:0" value="numNodes" />
                                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="903391227141135548" />
                                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="903391227141135549">
                                  <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="vhgx.~Integer" resolveInfo="Integer" />
                                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vhgx.~Integer%dparseInt(java%dlang%dString)%cint" resolveInfo="parseInt" />
                                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141135550">
                                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="903391227141135551">
                                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135428" resolveInfo="myNumNodesField" />
                                    </node>
                                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="903391227141135552">
                                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="ko86.~JTextComponent%dgetText()%cjava%dlang%dString" resolveInfo="getText" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="903391227141135553">
                              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="903391227141135554">
                                <property name="name" nameId="yvnu.1169194664001:0" value="numEdges" />
                                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="903391227141135555" />
                                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="903391227141135556">
                                  <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="vhgx.~Integer" resolveInfo="Integer" />
                                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vhgx.~Integer%dparseInt(java%dlang%dString)%cint" resolveInfo="parseInt" />
                                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141135557">
                                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="903391227141135558">
                                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135425" resolveInfo="myNumEdgesField" />
                                    </node>
                                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="903391227141135559">
                                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="ko86.~JTextComponent%dgetText()%cjava%dlang%dString" resolveInfo="getText" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="903391227141135560">
                              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="903391227141135561">
                                <property name="name" nameId="yvnu.1169194664001:0" value="g" />
                                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="903391227141135562">
                                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="aequ.8567569493821103298" resolveInfo="Graph" />
                                </node>
                              </node>
                            </node>
                            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141136150">
                              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="903391227141136151">
                                <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1265453300921052753">
                                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="35o0.7953585273260012391" resolveInfo="generateSimpleConnectedGraph" />
                                  <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="35o0.3437556975695846619" resolveInfo="RandomGraphGenerator" />
                                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1265453300921052754">
                                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135547" resolveInfo="numNodes" />
                                  </node>
                                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1265453300921052755">
                                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135554" resolveInfo="numEdges" />
                                  </node>
                                </node>
                                <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="903391227141136155">
                                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135561" resolveInfo="g" />
                                </node>
                              </node>
                            </node>
                            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135582">
                              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="903391227141135583">
                                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="903391227141135678" resolveInfo="writeGraph" />
                                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="903391227141135584">
                                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135561" resolveInfo="g" />
                                </node>
                              </node>
                            </node>
                          </node>
                          <node role="catchClause" roleId="yvor.1164903496223:3" type="yvor.CatchClause" typeId="yvor.1164903280175:3" id="903391227141135585">
                            <node role="throwable" roleId="yvor.1164903359217:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="903391227141135586">
                              <property name="name" nameId="yvnu.1169194664001:0" value="e" />
                              <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="903391227141135587">
                                <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Exception" resolveInfo="Exception" />
                              </node>
                            </node>
                            <node role="catchBody" roleId="yvor.1164903359218:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="903391227141135588">
                              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135589">
                                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="903391227141135590">
                                  <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="t147.~JOptionPane" resolveInfo="JOptionPane" />
                                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JOptionPane%dshowMessageDialog(java%dawt%dComponent,java%dlang%dObject)%cvoid" resolveInfo="showMessageDialog" />
                                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="903391227141135591">
                                    <link role="classConcept" roleId="yvor.1182955020723:3" targetNodeId="903391227141135207" resolveInfo="TestPanel" />
                                  </node>
                                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="903391227141135592">
                                    <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141135593">
                                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="903391227141135594">
                                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135586" resolveInfo="e" />
                                      </node>
                                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="903391227141135595">
                                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vhgx.~Throwable%dtoString()%cjava%dlang%dString" resolveInfo="toString" />
                                      </node>
                                    </node>
                                    <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="903391227141135596">
                                      <property name="value" nameId="yvor.1070475926801:3" value="enter number of nodes and edges...\n" />
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
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135597">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141135598">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="903391227141135599" />
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="903391227141135600">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Container%dadd(java%dawt%dComponent)%cjava%dawt%dComponent" resolveInfo="add" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="903391227141135601">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135525" resolveInfo="button" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="903391227141135602">
      <property name="name" nameId="yvnu.1169194664001:0" value="createDoLayoutButton" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="903391227141135603" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="903391227141135604" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="903391227141135605">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="903391227141135606">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="903391227141135607">
            <property name="name" nameId="yvnu.1169194664001:0" value="button" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="903391227141135608">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="t147.~JButton" resolveInfo="JButton" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="903391227141135609">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="903391227141135610">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JButton%d&lt;init&gt;(java%dlang%dString)" resolveInfo="JButton" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="903391227141135611">
                  <property name="value" nameId="yvor.1070475926801:3" value="do layout!" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="903391227141135612">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="903391227141135613">
            <property name="name" nameId="yvnu.1169194664001:0" value="c" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="903391227141135614">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~GridBagConstraints" resolveInfo="GridBagConstraints" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="903391227141135615">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="903391227141135616">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~GridBagConstraints%d&lt;init&gt;()" resolveInfo="GridBagConstraints" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135617">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141135618">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="903391227141135619">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135607" resolveInfo="button" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="903391227141135620">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~AbstractButton%daddActionListener(java%dawt%devent%dActionListener)%cvoid" resolveInfo="addActionListener" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="903391227141135621">
                <node role="creator" roleId="yvor.1145553007750:3" type="yvor.AnonymousClassCreator" typeId="yvor.1182160077978:3" id="903391227141135622">
                  <node role="cls" roleId="yvor.1182160096073:3" type="yvor.AnonymousClass" typeId="yvor.1170345865475:3" id="903391227141135623">
                    <property name="nonStatic" nameId="yvor.521412098689998745:3" value="true" />
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vhgx.~Object%d&lt;init&gt;()" resolveInfo="Object" />
                    <link role="classifier" roleId="yvor.1170346070688:3" targetNodeId="46vv.~ActionListener" resolveInfo="ActionListener" />
                    <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="903391227141135624" />
                    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="903391227141135625">
                      <property name="isAbstract" nameId="yvor.1178608670077:3" value="false" />
                      <property name="name" nameId="yvnu.1169194664001:0" value="actionPerformed" />
                      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="903391227141135626" />
                      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="903391227141135627" />
                      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="903391227141135628">
                        <property name="name" nameId="yvnu.1169194664001:0" value="p0" />
                        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="903391227141135629">
                          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="46vv.~ActionEvent" resolveInfo="ActionEvent" />
                        </node>
                      </node>
                      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="903391227141135630">
                        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135631">
                          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="903391227141135632">
                            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="903391227141135754" resolveInfo="layoutGraph" />
                          </node>
                        </node>
                        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135633">
                          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141135634">
                            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="903391227141135635">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135416" resolveInfo="myGraphLabel" />
                            </node>
                            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="903391227141135636">
                              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Component%drepaint()%cvoid" resolveInfo="repaint" />
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
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135637">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="903391227141135638">
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141135639">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="903391227141135640">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135613" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="903391227141135641">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dfill" resolveInfo="fill" />
              </node>
            </node>
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="903391227141135642">
              <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="2uit.~GridBagConstraints" resolveInfo="GridBagConstraints" />
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2uit.~GridBagConstraints%dHORIZONTAL" resolveInfo="HORIZONTAL" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135643">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="903391227141135644">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="903391227141135645">
              <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="2uit.~GridBagConstraints" resolveInfo="GridBagConstraints" />
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2uit.~GridBagConstraints%dFIRST_LINE_START" resolveInfo="FIRST_LINE_START" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141135646">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="903391227141135647">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135613" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="903391227141135648">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%danchor" resolveInfo="anchor" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135649">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="903391227141135650">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="903391227141135651">
              <property name="value" nameId="yvor.1068580320021:3" value="0" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141135652">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="903391227141135653">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135613" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="903391227141135654">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridx" resolveInfo="gridx" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135655">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="903391227141135656">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="903391227141135657">
              <property name="value" nameId="yvor.1068580320021:3" value="0" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141135658">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="903391227141135659">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135613" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="903391227141135660">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridy" resolveInfo="gridy" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135661">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="903391227141135662">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="903391227141135663">
              <property name="value" nameId="yvor.1068580320021:3" value="1" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141135664">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="903391227141135665">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135613" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="903391227141135666">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridwidth" resolveInfo="gridwidth" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135667">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="903391227141135668">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="903391227141135669">
              <property name="value" nameId="yvor.1068580320021:3" value="1" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141135670">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="903391227141135671">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135613" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="903391227141135672">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridheight" resolveInfo="gridheight" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135673">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141135674">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="903391227141135675" />
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="903391227141135676">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Container%dadd(java%dawt%dComponent)%cjava%dawt%dComponent" resolveInfo="add" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="903391227141135677">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135607" resolveInfo="button" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="903391227141135678">
      <property name="name" nameId="yvnu.1169194664001:0" value="writeGraph" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="903391227141135679" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="903391227141135680" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="903391227141135681">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="8680836410351737632">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8680836410351737633">
            <property name="name" nameId="yvnu.1169194664001:0" value="edges" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.ListType" typeId="yvix.1151688443754:7" id="8680836410351737634">
              <node role="elementType" roleId="yvix.1151688676805:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8680836410351737636">
                <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="aequ.8567569493821103292" resolveInfo="Edge" />
              </node>
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8680836410351737639">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="8680836410351737638">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135752" resolveInfo="graph" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8680836410351737643">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.1654665216152485905" resolveInfo="getEdges" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135705">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141135706">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="903391227141135707">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135413" resolveInfo="myTextArea" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="903391227141135708">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="ko86.~JTextComponent%dsetText(java%dlang%dString)%cvoid" resolveInfo="setText" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="903391227141135709">
                <property name="value" nameId="yvor.1070475926801:3" value="" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135710">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141135711">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="903391227141135712">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135413" resolveInfo="myTextArea" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="903391227141135713">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTextArea%dappend(java%dlang%dString)%cvoid" resolveInfo="append" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="903391227141135714">
                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="903391227141135715">
                  <property name="value" nameId="yvor.1070475926801:3" value="  \n" />
                </node>
                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="903391227141135716">
                  <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="903391227141135717">
                    <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141135718">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="903391227141135719">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135752" resolveInfo="graph" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="903391227141135720">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.8567569493821112214" resolveInfo="getNumNodes" />
                      </node>
                    </node>
                    <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="903391227141135721">
                      <property name="value" nameId="yvor.1070475926801:3" value=" " />
                    </node>
                  </node>
                  <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8680836410351737645">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8680836410351737644">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8680836410351737633" resolveInfo="edges" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetSizeOperation" typeId="yvix.1162935959151:7" id="8680836410351737649" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvix.ForEachStatement" typeId="yvix.1153943597977:7" id="8680836410351737619">
          <node role="variable" roleId="yvix.1153944400369:7" type="yvix.ForEachVariable" typeId="yvix.1153944193378:7" id="8680836410351737620">
            <property name="name" nameId="yvnu.1169194664001:0" value="edge" />
          </node>
          <node role="inputSequence" roleId="yvix.1153944424730:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8680836410351737624">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="8680836410351737623">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135752" resolveInfo="graph" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8680836410351737628">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.1654665216152485905" resolveInfo="getEdges" />
            </node>
          </node>
          <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8680836410351737622">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8680836410351737650">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8680836410351737651">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8680836410351737652">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135413" resolveInfo="myTextArea" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8680836410351737653">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTextArea%dappend(java%dlang%dString)%cvoid" resolveInfo="append" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="8680836410351737654">
                    <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="8680836410351737655">
                      <property name="value" nameId="yvor.1070475926801:3" value="  \n" />
                    </node>
                    <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="8680836410351737656">
                      <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="8680836410351737657">
                        <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8680836410351737658">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8680836410351737659">
                            <node role="operand" roleId="yvor.1197027771414:3" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="8680836410351737660">
                              <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="8680836410351737620" resolveInfo="edge" />
                            </node>
                            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8680836410351737661">
                              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.8567569493821111981" resolveInfo="getSource" />
                            </node>
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8680836410351737662">
                            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.4660430665333281569" resolveInfo="getIndex" />
                          </node>
                        </node>
                        <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="8680836410351737663">
                          <property name="value" nameId="yvor.1070475926801:3" value=" " />
                        </node>
                      </node>
                      <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8680836410351737664">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8680836410351737665">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="8680836410351737666">
                            <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="8680836410351737620" resolveInfo="edge" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8680836410351737667">
                            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.8567569493821111989" resolveInfo="getTarget" />
                          </node>
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8680836410351737668">
                          <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.4660430665333281569" resolveInfo="getIndex" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8680836410351737671">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8680836410351737673">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8680836410351737672">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135413" resolveInfo="myTextArea" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8680836410351737677">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTextArea%dappend(java%dlang%dString)%cvoid" resolveInfo="append" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="8680836410351737678">
                <property name="value" nameId="yvor.1070475926801:3" value="\n\n 0 \n 0 \n" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="903391227141135752">
        <property name="name" nameId="yvnu.1169194664001:0" value="graph" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="903391227141135753">
          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="aequ.8567569493821103298" resolveInfo="Graph" />
        </node>
      </node>
    </node>
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="903391227141135754">
      <property name="name" nameId="yvnu.1169194664001:0" value="layoutGraph" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="903391227141135755" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="903391227141135756" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="903391227141135757">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.CommentedStatementsBlock" typeId="yvor.1177326519037:3" id="3698135283642039222">
          <node role="statement" roleId="yvor.1177326540772:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6160477238666742415">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6160477238666742417">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="6160477238666742416">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141136156" resolveInfo="myLayouter" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="6160477238666742421">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="kw11.6160477238666742402" resolveInfo="setLayoutLevel" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6160477238666742444">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="6160477238666742443">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6160477238666742422" resolveInfo="myLayoutChoice" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="6160477238666742448">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="6160477238666742339" resolveInfo="getSelectedLayoutLavel" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="903391227141135758">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="903391227141135759">
            <property name="name" nameId="yvnu.1169194664001:0" value="scanner" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="903391227141135760">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="yjwb.~Scanner" resolveInfo="Scanner" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="903391227141135761">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="903391227141135762">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Scanner%d&lt;init&gt;(java%dlang%dString)" resolveInfo="Scanner" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141135763">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="903391227141135764">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135413" resolveInfo="myTextArea" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="903391227141135765">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="ko86.~JTextComponent%dgetText()%cjava%dlang%dString" resolveInfo="getText" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="6160477238666745732">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="6160477238666745733">
            <property name="name" nameId="yvnu.1169194664001:0" value="nodeDimensions" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.MapType" typeId="yvix.1197683403723:7" id="6160477238666745734">
              <node role="keyType" roleId="yvix.1197683466920:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="6160477238666745737">
                <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="aequ.4671312709908983848" resolveInfo="Node" />
              </node>
              <node role="valueType" roleId="yvix.1197683475734:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="5639108013728303285">
                <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="4dwg.2301768597858221544" resolveInfo="Dimension" />
              </node>
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="6160477238666745752">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvix.HashMapCreator" typeId="yvix.1197686869805:7" id="6160477238666745757">
                <node role="keyType" roleId="yvix.1197687026896:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="6160477238666745760">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="aequ.4671312709908983848" resolveInfo="Node" />
                </node>
                <node role="valueType" roleId="yvix.1197687035757:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="5639108013728303286">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="4dwg.2301768597858221544" resolveInfo="Dimension" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="490728924230502924">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="490728924230502925">
            <property name="name" nameId="yvnu.1169194664001:0" value="edgeDimensions" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.MapType" typeId="yvix.1197683403723:7" id="490728924230502926">
              <node role="keyType" roleId="yvix.1197683466920:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="490728924230502929">
                <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="aequ.8567569493821103292" resolveInfo="Edge" />
              </node>
              <node role="valueType" roleId="yvix.1197683475734:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="5639108013728303287">
                <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="4dwg.2301768597858221544" resolveInfo="Dimension" />
              </node>
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="490728924230502932">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvix.HashMapCreator" typeId="yvix.1197686869805:7" id="490728924230502933">
                <node role="keyType" roleId="yvix.1197687026896:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="490728924230502934">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="aequ.8567569493821103292" resolveInfo="Edge" />
                </node>
                <node role="valueType" roleId="yvix.1197687035757:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="5639108013728303288">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="4dwg.2301768597858221544" resolveInfo="Dimension" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="903391227141135766">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="903391227141135767">
            <property name="name" nameId="yvnu.1169194664001:0" value="g" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="903391227141135768">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="aequ.8567569493821103298" resolveInfo="Graph" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="903391227141135769" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.TryCatchStatement" typeId="yvor.1164879751025:3" id="903391227141135770">
          <node role="body" roleId="yvor.1164879758292:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="903391227141135771">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135772">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="903391227141135773">
                <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="903391227141135774">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1567683135099906915" resolveInfo="scanGraph" />
                  <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="1567683135099906914" resolveInfo="GraphIO" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="903391227141135775">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135759" resolveInfo="scanner" />
                  </node>
                </node>
                <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="903391227141135776">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135767" resolveInfo="g" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="8680836410351718570">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8680836410351718571">
                <property name="name" nameId="yvnu.1169194664001:0" value="numNodeSizes" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="8680836410351718572" />
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8680836410351718575">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8680836410351718574">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135759" resolveInfo="scanner" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8680836410351718579">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Scanner%dnextInt()%cint" resolveInfo="nextInt" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ForStatement" typeId="yvor.1144231330558:3" id="8680836410351718604">
              <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8680836410351718605">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="8680836410351718615">
                  <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8680836410351718616">
                    <property name="name" nameId="yvnu.1169194664001:0" value="node" />
                    <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8680836410351718617">
                      <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="aequ.4671312709908983848" resolveInfo="Node" />
                    </node>
                    <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8680836410351718618">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8680836410351718619">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135767" resolveInfo="g" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8680836410351718620">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.8567569493821112501" resolveInfo="getNode" />
                        <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8680836410351718621">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8680836410351718622">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135759" resolveInfo="scanner" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8680836410351718623">
                            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Scanner%dnextInt()%cint" resolveInfo="nextInt" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8680836410351718624">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8680836410351718625">
                    <node role="lValue" roleId="yvor.1068498886295:3" type="yvix.MapElement" typeId="yvix.1197932370469:7" id="8680836410351718626">
                      <node role="key" roleId="yvix.1197932525128:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8680836410351718627">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8680836410351718616" resolveInfo="node" />
                      </node>
                      <node role="map" roleId="yvix.1197932505799:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8680836410351718628">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6160477238666745733" resolveInfo="nodeDimensions" />
                      </node>
                    </node>
                    <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8680836410351718629">
                      <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="8680836410351718630">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="4dwg.2301768597858221546" resolveInfo="Dimension" />
                        <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8680836410351718631">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8680836410351718632">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135759" resolveInfo="scanner" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8680836410351718633">
                            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Scanner%dnextInt()%cint" resolveInfo="nextInt" />
                          </node>
                        </node>
                        <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8680836410351718634">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8680836410351718635">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135759" resolveInfo="scanner" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8680836410351718636">
                            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Scanner%dnextInt()%cint" resolveInfo="nextInt" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="variable" roleId="yvor.1144230900587:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8680836410351718606">
                <property name="name" nameId="yvnu.1169194664001:0" value="i" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="8680836410351718607" />
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8680836410351718608">
                  <property name="value" nameId="yvor.1068580320021:3" value="0" />
                </node>
              </node>
              <node role="condition" roleId="yvor.1144231399730:3" type="yvor.LessThanExpression" typeId="yvor.1081506773034:3" id="8680836410351718609">
                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8680836410351718638">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8680836410351718571" resolveInfo="numNodeSizes" />
                </node>
                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8680836410351718637">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8680836410351718606" resolveInfo="i" />
                </node>
              </node>
              <node role="iteration" roleId="yvor.1144231408325:3" type="yvor.PostfixIncrementExpression" typeId="yvor.1214918800624:3" id="8680836410351718612">
                <node role="expression" roleId="yvor.1239714902950:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8680836410351718639">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8680836410351718606" resolveInfo="i" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="8680836410351718644">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8680836410351718645">
                <property name="name" nameId="yvnu.1169194664001:0" value="edgeLabelSizes" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="8680836410351718646" />
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8680836410351718647">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8680836410351718648">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135759" resolveInfo="scanner" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8680836410351718649">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Scanner%dnextInt()%cint" resolveInfo="nextInt" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ForStatement" typeId="yvor.1144231330558:3" id="8680836410351718650">
              <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8680836410351718651">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="8680836410351718652">
                  <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8680836410351718653">
                    <property name="name" nameId="yvnu.1169194664001:0" value="source" />
                    <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8680836410351718654">
                      <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="aequ.4671312709908983848" resolveInfo="Node" />
                    </node>
                    <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8680836410351718655">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8680836410351718656">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135767" resolveInfo="g" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8680836410351718657">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.8567569493821112501" resolveInfo="getNode" />
                        <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8680836410351718658">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8680836410351718659">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135759" resolveInfo="scanner" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8680836410351718660">
                            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Scanner%dnextInt()%cint" resolveInfo="nextInt" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="8680836410351718686">
                  <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8680836410351718687">
                    <property name="name" nameId="yvnu.1169194664001:0" value="target" />
                    <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8680836410351718688">
                      <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="aequ.4671312709908983848" resolveInfo="Node" />
                    </node>
                    <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8680836410351718691">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8680836410351718690">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135767" resolveInfo="g" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8680836410351718695">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.8567569493821112501" resolveInfo="getNode" />
                        <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8680836410351718697">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8680836410351718696">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135759" resolveInfo="scanner" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8680836410351718701">
                            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Scanner%dnextInt()%cint" resolveInfo="nextInt" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="8680836410351718705">
                  <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8680836410351718706">
                    <property name="name" nameId="yvnu.1169194664001:0" value="edge" />
                    <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8680836410351718707">
                      <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="aequ.8567569493821103292" resolveInfo="Edge" />
                    </node>
                    <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8680836410351735764">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8680836410351718715">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8680836410351718710">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8680836410351718709">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8680836410351718653" resolveInfo="source" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8680836410351718714">
                            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.8567569493821110932" resolveInfo="getOutEdges" />
                          </node>
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvix.WhereOperation" typeId="yvix.1202120902084:7" id="8680836410351718719">
                          <node role="closure" roleId="yvix.1204796294226:7" type="yviq.ClosureLiteral" typeId="yviq.1199569711397:3" id="8680836410351718720">
                            <node role="body" roleId="yviq.1199569916463:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8680836410351718721">
                              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8680836410351735748">
                                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.EqualsExpression" typeId="yvor.1068580123152:3" id="8680836410351735759">
                                  <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8680836410351735762">
                                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8680836410351718687" resolveInfo="target" />
                                  </node>
                                  <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8680836410351735750">
                                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="8680836410351735749">
                                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8680836410351718722" resolveInfo="it" />
                                    </node>
                                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8680836410351735754">
                                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.8567569493821111989" resolveInfo="getTarget" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node role="parameter" roleId="yviq.1199569906740:3" type="yvix.SmartClosureParameterDeclaration" typeId="yvix.1203518072036:7" id="8680836410351718722">
                              <property name="name" nameId="yvnu.1169194664001:0" value="it" />
                              <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.WildCardType" typeId="yvor.1171903607971:3" id="8680836410351718723" />
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetFirstOperation" typeId="yvix.1165525191778:7" id="8680836410351735769" />
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="5368829933099715616">
                  <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="5368829933099715617">
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ThrowStatement" typeId="yvor.1164991038168:3" id="5368829933099715632">
                      <node role="throwable" roleId="yvor.1164991057263:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="5368829933099715634">
                        <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="5368829933099715636">
                          <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vhgx.~IllegalArgumentException%d&lt;init&gt;(java%dlang%dString)" resolveInfo="IllegalArgumentException" />
                          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="5368829933099715646">
                            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="5368829933099715649">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8680836410351718687" resolveInfo="target" />
                            </node>
                            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="5368829933099715642">
                              <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="5368829933099715638">
                                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="5368829933099715637">
                                  <property name="value" nameId="yvor.1070475926801:3" value="there is no edge " />
                                </node>
                                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="5368829933099715641">
                                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8680836410351718653" resolveInfo="source" />
                                </node>
                              </node>
                              <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="5368829933099715645">
                                <property name="value" nameId="yvor.1070475926801:3" value=" -&gt; " />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition" roleId="yvor.1068580123160:3" type="yvor.EqualsExpression" typeId="yvor.1068580123152:3" id="5368829933099715621">
                    <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="5368829933099715624" />
                    <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="5368829933099715620">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8680836410351718706" resolveInfo="edge" />
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8680836410351718661">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8680836410351718662">
                    <node role="lValue" roleId="yvor.1068498886295:3" type="yvix.MapElement" typeId="yvix.1197932370469:7" id="8680836410351718663">
                      <node role="key" roleId="yvix.1197932525128:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8680836410351735770">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8680836410351718706" resolveInfo="edge" />
                      </node>
                      <node role="map" roleId="yvix.1197932505799:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8680836410351718682">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="490728924230502925" resolveInfo="edgeDimensions" />
                      </node>
                    </node>
                    <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8680836410351718666">
                      <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="8680836410351718667">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="4dwg.2301768597858221546" resolveInfo="Dimension" />
                        <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8680836410351718668">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8680836410351718669">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135759" resolveInfo="scanner" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8680836410351718670">
                            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Scanner%dnextInt()%cint" resolveInfo="nextInt" />
                          </node>
                        </node>
                        <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8680836410351718671">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8680836410351718672">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135759" resolveInfo="scanner" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8680836410351718673">
                            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Scanner%dnextInt()%cint" resolveInfo="nextInt" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="variable" roleId="yvor.1144230900587:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8680836410351718674">
                <property name="name" nameId="yvnu.1169194664001:0" value="i" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="8680836410351718675" />
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8680836410351718676">
                  <property name="value" nameId="yvor.1068580320021:3" value="0" />
                </node>
              </node>
              <node role="condition" roleId="yvor.1144231399730:3" type="yvor.LessThanExpression" typeId="yvor.1081506773034:3" id="8680836410351718677">
                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8680836410351718678">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8680836410351718645" resolveInfo="numNodeSizes" />
                </node>
                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8680836410351718679">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8680836410351718674" resolveInfo="i" />
                </node>
              </node>
              <node role="iteration" roleId="yvor.1144231408325:3" type="yvor.PostfixIncrementExpression" typeId="yvor.1214918800624:3" id="8680836410351718680">
                <node role="expression" roleId="yvor.1239714902950:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8680836410351718681">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8680836410351718674" resolveInfo="i" />
                </node>
              </node>
            </node>
          </node>
          <node role="catchClause" roleId="yvor.1164903496223:3" type="yvor.CatchClause" typeId="yvor.1164903280175:3" id="903391227141135777">
            <node role="throwable" roleId="yvor.1164903359217:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="903391227141135778">
              <property name="name" nameId="yvnu.1169194664001:0" value="e" />
              <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="903391227141135779">
                <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~IllegalArgumentException" resolveInfo="IllegalArgumentException" />
              </node>
            </node>
            <node role="catchBody" roleId="yvor.1164903359218:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="903391227141135780">
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135781">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="903391227141135782">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JOptionPane%dshowMessageDialog(java%dawt%dComponent,java%dlang%dObject)%cvoid" resolveInfo="showMessageDialog" />
                  <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="t147.~JOptionPane" resolveInfo="JOptionPane" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="903391227141135783" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="5368829933099715650">
                    <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="5368829933099715653">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135778" resolveInfo="e" />
                    </node>
                    <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="903391227141135784">
                      <property name="value" nameId="yvor.1070475926801:3" value="something is wrong in graph notation...\n" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="903391227141138859">
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="903391227141138860">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvix.ForEachStatement" typeId="yvix.1153943597977:7" id="903391227141155926">
              <node role="variable" roleId="yvix.1153944400369:7" type="yvix.ForEachVariable" typeId="yvix.1153944193378:7" id="903391227141155927">
                <property name="name" nameId="yvnu.1169194664001:0" value="node" />
              </node>
              <node role="inputSequence" roleId="yvix.1153944424730:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141155934">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="903391227141155933">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135767" resolveInfo="g" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="903391227141155938">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.8567569493821107956" resolveInfo="getNodes" />
                </node>
              </node>
              <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="903391227141155929">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1418350014056289141">
                  <node role="condition" roleId="yvor.1068580123160:3" type="yvor.EqualsExpression" typeId="yvor.1068580123152:3" id="1418350014056289149">
                    <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1418350014056289152" />
                    <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvix.MapElement" typeId="yvix.1197932370469:7" id="1418350014056289145">
                      <node role="key" roleId="yvix.1197932525128:7" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="1418350014056289148">
                        <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="903391227141155927" resolveInfo="node" />
                      </node>
                      <node role="map" roleId="yvix.1197932505799:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6160477238666745754">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6160477238666745733" resolveInfo="nodeDimensions" />
                      </node>
                    </node>
                  </node>
                  <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1418350014056289143">
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6160477238666745762">
                      <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="6160477238666745768">
                        <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="6160477238666745771">
                          <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="6160477238666745772">
                            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="4dwg.2301768597858221546" resolveInfo="Dimension" />
                            <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalStaticFieldReference" typeId="yvor.1172008963197:3" id="6160477238666745773">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1418350014056289153" resolveInfo="DEFAULT_NODE_SIZE" />
                            </node>
                            <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="8768371262605995174">
                              <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8768371262605995177">
                                <property name="value" nameId="yvor.1068580320021:3" value="10" />
                              </node>
                              <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalStaticFieldReference" typeId="yvor.1172008963197:3" id="6160477238666745775">
                                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1418350014056289153" resolveInfo="DEFAULT_NODE_SIZE" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="lValue" roleId="yvor.1068498886295:3" type="yvix.MapElement" typeId="yvix.1197932370469:7" id="6160477238666745764">
                          <node role="key" roleId="yvix.1197932525128:7" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="6160477238666745767">
                            <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="903391227141155927" resolveInfo="node" />
                          </node>
                          <node role="map" roleId="yvix.1197932505799:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6160477238666745763">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6160477238666745733" resolveInfo="nodeDimensions" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="8680836410351750004">
              <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8680836410351750005">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvix.ForEachStatement" typeId="yvix.1153943597977:7" id="8680836410351750014">
                  <node role="variable" roleId="yvix.1153944400369:7" type="yvix.ForEachVariable" typeId="yvix.1153944193378:7" id="8680836410351750015">
                    <property name="name" nameId="yvnu.1169194664001:0" value="edge" />
                  </node>
                  <node role="inputSequence" roleId="yvix.1153944424730:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8680836410351750019">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8680836410351750018">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135767" resolveInfo="g" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8680836410351750023">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.1654665216152485905" resolveInfo="getEdges" />
                    </node>
                  </node>
                  <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8680836410351750017">
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="8680836410351750024">
                      <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8680836410351750026">
                        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8680836410351750036">
                          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8680836410351750042">
                            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8680836410351750045">
                              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="8680836410351750047">
                                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="4dwg.2301768597858221546" resolveInfo="Dimension" />
                                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalStaticFieldReference" typeId="yvor.1172008963197:3" id="8680836410351750048">
                                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="490728924230502971" resolveInfo="DEFAULT_EDGE_X_SIZE" />
                                </node>
                                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalStaticFieldReference" typeId="yvor.1172008963197:3" id="8680836410351750050">
                                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="490728924230502980" resolveInfo="DEFAULT_EDGE_Y_SIZE" />
                                </node>
                              </node>
                            </node>
                            <node role="lValue" roleId="yvor.1068498886295:3" type="yvix.MapElement" typeId="yvix.1197932370469:7" id="8680836410351750038">
                              <node role="key" roleId="yvix.1197932525128:7" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="8680836410351750041">
                                <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="8680836410351750015" resolveInfo="edge" />
                              </node>
                              <node role="map" roleId="yvix.1197932505799:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8680836410351750037">
                                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="490728924230502925" resolveInfo="edgeDimensions" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotExpression" typeId="yvor.1081516740877:3" id="4302896862695049884">
                        <node role="expression" roleId="yvor.1081516765348:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4302896862695049885">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="4302896862695049886">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="490728924230502925" resolveInfo="edgeDimensions" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvix.ContainsKeyOperation" typeId="yvix.1201306600024:7" id="4302896862695049887">
                            <node role="key" roleId="yvix.1201654602639:7" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="4302896862695049888">
                              <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="8680836410351750015" resolveInfo="edge" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8680836410351750009">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8680836410351750008">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6160477238666742422" resolveInfo="myLayoutChoice" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8680836410351750013">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8680836410351749781" resolveInfo="isSetLabels" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="3848593518650118051">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="3848593518650118052">
                <property name="name" nameId="yvnu.1169194664001:0" value="layoutInfo" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="3848593518650118053">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="rm96.194249616896430087" resolveInfo="LayoutInfo" />
                </node>
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="3848593518650118055">
                  <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="3848593518650118056">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="rm96.194249616896430089" resolveInfo="LayoutInfo" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="3848593518650118057">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135767" resolveInfo="g" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvix.ForEachStatement" typeId="yvix.1153943597977:7" id="3848593518650118059">
              <node role="variable" roleId="yvix.1153944400369:7" type="yvix.ForEachVariable" typeId="yvix.1153944193378:7" id="3848593518650118060">
                <property name="name" nameId="yvnu.1169194664001:0" value="node" />
              </node>
              <node role="inputSequence" roleId="yvix.1153944424730:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3848593518650118064">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="3848593518650118063">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6160477238666745733" resolveInfo="nodeDimensions" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetKeysOperation" typeId="yvix.1201872418428:7" id="3848593518650118068" />
              </node>
              <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="3848593518650118062">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="3848593518650118069">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3848593518650118071">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="3848593518650118070">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="3848593518650118052" resolveInfo="layoutInfo" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="3848593518650118075">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="rm96.194249616896430121" resolveInfo="setNodeSize" />
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="3848593518650118076">
                        <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="3848593518650118060" resolveInfo="node" />
                      </node>
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvix.MapElement" typeId="yvix.1197932370469:7" id="3848593518650118079">
                        <node role="key" roleId="yvix.1197932525128:7" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="3848593518650118082">
                          <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="3848593518650118060" resolveInfo="node" />
                        </node>
                        <node role="map" roleId="yvix.1197932505799:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="3848593518650118078">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6160477238666745733" resolveInfo="nodeDimensions" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvix.ForEachStatement" typeId="yvix.1153943597977:7" id="3848593518650118084">
              <node role="variable" roleId="yvix.1153944400369:7" type="yvix.ForEachVariable" typeId="yvix.1153944193378:7" id="3848593518650118085">
                <property name="name" nameId="yvnu.1169194664001:0" value="edge" />
              </node>
              <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="3848593518650118087">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="3848593518650118094">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3848593518650118096">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="3848593518650118095">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="3848593518650118052" resolveInfo="layoutInfo" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="3848593518650118100">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="rm96.194249616896430140" resolveInfo="setLabelSize" />
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="3848593518650118101">
                        <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="3848593518650118085" resolveInfo="edge" />
                      </node>
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvix.MapElement" typeId="yvix.1197932370469:7" id="3848593518650118104">
                        <node role="key" roleId="yvix.1197932525128:7" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="3848593518650118107">
                          <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="3848593518650118085" resolveInfo="edge" />
                        </node>
                        <node role="map" roleId="yvix.1197932505799:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="3848593518650118103">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="490728924230502925" resolveInfo="edgeDimensions" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="inputSequence" roleId="yvix.1153944424730:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3848593518650118089">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="3848593518650118088">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="490728924230502925" resolveInfo="edgeDimensions" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetKeysOperation" typeId="yvix.1201872418428:7" id="3848593518650118093" />
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141138873">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="903391227141138874">
                <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141138875">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="2913448412765314841">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141136156" resolveInfo="myLayouter" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="903391227141138877">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="rm96.8729833695221619980" resolveInfo="doLayout" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="3848593518650118108">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="3848593518650118052" resolveInfo="layoutInfo" />
                    </node>
                  </node>
                </node>
                <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="903391227141138879">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135422" resolveInfo="myCurrentLayout" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="9047589280051535853">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="9047589280051535855">
                <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="9047589280051535859">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="rm96.903391227141130356" resolveInfo="shift" />
                  <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="rm96.903391227141130350" resolveInfo="LayoutTransform" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParenthesizedExpression" typeId="yvor.1079359253375:3" id="2913448412765314843">
                    <node role="expression" roleId="yvor.1079359253376:3" type="yvor.CastExpression" typeId="yvor.1070534934090:3" id="2913448412765314844">
                      <node role="expression" roleId="yvor.1070534934092:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="2913448412765314845">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135422" resolveInfo="myCurrentLayout" />
                      </node>
                      <node role="type" roleId="yvor.1070534934091:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="2913448412765314846">
                        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="rm96.903391227141129818" resolveInfo="GraphLayout" />
                      </node>
                    </node>
                  </node>
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="9047589280051535862">
                    <property name="value" nameId="yvor.1068580320021:3" value="20" />
                  </node>
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="9047589280051535864">
                    <property name="value" nameId="yvor.1068580320021:3" value="20" />
                  </node>
                </node>
                <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="9047589280051535854">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135422" resolveInfo="myCurrentLayout" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.CommentedStatementsBlock" typeId="yvor.1177326519037:3" id="194249616896467922">
              <node role="statement" roleId="yvor.1177326540772:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="194249616896380519">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="194249616896380521">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="ms8h.1265453300920882198" resolveInfo="checkLayout" />
                  <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="ms8h.5488345258545703420" resolveInfo="OrthogonalLayoutChecker" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="194249616896380522">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135422" resolveInfo="myCurrentLayout" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotEqualsExpression" typeId="yvor.1073239437375:3" id="903391227141138864">
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="903391227141138867" />
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="903391227141138863">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135767" resolveInfo="g" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="903391227141135792">
      <property name="name" nameId="yvnu.1169194664001:0" value="createTextPanel" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="903391227141135793" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="903391227141135794" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="903391227141135795">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135796">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="903391227141135797">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="903391227141135798">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="903391227141135799">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTextArea%d&lt;init&gt;(int,int)" resolveInfo="JTextArea" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="903391227141135800">
                  <property name="value" nameId="yvor.1068580320021:3" value="20" />
                </node>
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="903391227141135801">
                  <property name="value" nameId="yvor.1068580320021:3" value="20" />
                </node>
              </node>
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="903391227141135802">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135413" resolveInfo="myTextArea" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135803">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141135804">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="903391227141135805">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135413" resolveInfo="myTextArea" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="903391227141135806">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JComponent%dsetBorder(javax%dswing%dborder%dBorder)%cvoid" resolveInfo="setBorder" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="903391227141135807">
                <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="t147.~BorderFactory" resolveInfo="BorderFactory" />
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~BorderFactory%dcreateTitledBorder(java%dlang%dString)%cjavax%dswing%dborder%dTitledBorder" resolveInfo="createTitledBorder" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="903391227141135808">
                  <property name="value" nameId="yvor.1070475926801:3" value="enter graph here" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="903391227141135809">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="903391227141135810">
            <property name="name" nameId="yvnu.1169194664001:0" value="c" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="903391227141135811">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~GridBagConstraints" resolveInfo="GridBagConstraints" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="903391227141135812">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="903391227141135813">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~GridBagConstraints%d&lt;init&gt;()" resolveInfo="GridBagConstraints" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135814">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="903391227141135815">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="903391227141135816">
              <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="2uit.~GridBagConstraints" resolveInfo="GridBagConstraints" />
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2uit.~GridBagConstraints%dVERTICAL" resolveInfo="VERTICAL" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141135817">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="903391227141135818">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135810" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="903391227141135819">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dfill" resolveInfo="fill" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135820">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="903391227141135821">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="903391227141135822">
              <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="2uit.~GridBagConstraints" resolveInfo="GridBagConstraints" />
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2uit.~GridBagConstraints%dREMAINDER" resolveInfo="REMAINDER" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141135823">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="903391227141135824">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135810" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="903391227141135825">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridheight" resolveInfo="gridheight" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135826">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="903391227141135827">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="903391227141135828">
              <property name="value" nameId="yvor.1068580320021:3" value="0" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141135829">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="903391227141135830">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135810" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="903391227141135831">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridx" resolveInfo="gridx" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135832">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="903391227141135833">
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141135834">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="903391227141135835">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135810" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="903391227141135836">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridy" resolveInfo="gridy" />
              </node>
            </node>
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="903391227141135837">
              <property name="value" nameId="yvor.1068580320021:3" value="1" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135838">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="903391227141135839">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="903391227141135840">
              <property name="value" nameId="yvor.1068580320021:3" value="1" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141135841">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="903391227141135842">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135810" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="903391227141135843">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dweighty" resolveInfo="weighty" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135844">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141135845">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="903391227141135846" />
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="903391227141135847">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Container%dadd(java%dawt%dComponent,java%dlang%dObject)%cvoid" resolveInfo="add" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="903391227141135848">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135413" resolveInfo="myTextArea" />
              </node>
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="903391227141135849">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135810" resolveInfo="c" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="903391227141135850">
      <property name="name" nameId="yvnu.1169194664001:0" value="createGraphPanel" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="903391227141135851" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="903391227141135852" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="903391227141135853">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135854">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="903391227141135855">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="903391227141135856">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="903391227141135857">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="903391227141135210" resolveInfo="TestPanel.MyGraphLabel" />
              </node>
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="903391227141135858">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135416" resolveInfo="myGraphLabel" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135859">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141135860">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="903391227141135861">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135416" resolveInfo="myGraphLabel" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="903391227141135862">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JComponent%dsetBorder(javax%dswing%dborder%dBorder)%cvoid" resolveInfo="setBorder" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="903391227141135863">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~BorderFactory%dcreateTitledBorder(java%dlang%dString)%cjavax%dswing%dborder%dTitledBorder" resolveInfo="createTitledBorder" />
                <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="t147.~BorderFactory" resolveInfo="BorderFactory" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="903391227141135864">
                  <property name="value" nameId="yvor.1070475926801:3" value="graph layout" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="903391227141135865">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="903391227141135866">
            <property name="name" nameId="yvnu.1169194664001:0" value="c" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="903391227141135867">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~GridBagConstraints" resolveInfo="GridBagConstraints" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="903391227141135868">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="903391227141135869">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~GridBagConstraints%d&lt;init&gt;()" resolveInfo="GridBagConstraints" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135870">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="903391227141135871">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="903391227141135872">
              <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="2uit.~GridBagConstraints" resolveInfo="GridBagConstraints" />
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2uit.~GridBagConstraints%dBOTH" resolveInfo="BOTH" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141135873">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="903391227141135874">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135866" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="903391227141135875">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dfill" resolveInfo="fill" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135876">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="903391227141135877">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="903391227141135878">
              <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="2uit.~GridBagConstraints" resolveInfo="GridBagConstraints" />
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2uit.~GridBagConstraints%dREMAINDER" resolveInfo="REMAINDER" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141135879">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="903391227141135880">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135866" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="903391227141135881">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridwidth" resolveInfo="gridwidth" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135882">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="903391227141135883">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="903391227141135884">
              <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="2uit.~GridBagConstraints" resolveInfo="GridBagConstraints" />
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2uit.~GridBagConstraints%dREMAINDER" resolveInfo="REMAINDER" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141135885">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="903391227141135886">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135866" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="903391227141135887">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridheight" resolveInfo="gridheight" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135888">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="903391227141135889">
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141135890">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="903391227141135891">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135866" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="903391227141135892">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridx" resolveInfo="gridx" />
              </node>
            </node>
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="903391227141135893">
              <property name="value" nameId="yvor.1068580320021:3" value="1" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135894">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="903391227141135895">
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141135896">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="903391227141135897">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135866" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="903391227141135898">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridy" resolveInfo="gridy" />
              </node>
            </node>
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="903391227141135899">
              <property name="value" nameId="yvor.1068580320021:3" value="1" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135900">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="903391227141135901">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="903391227141135902">
              <property name="value" nameId="yvor.1068580320021:3" value="1" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141135903">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="903391227141135904">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135866" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="903391227141135905">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dweightx" resolveInfo="weightx" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135906">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="903391227141135907">
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141135908">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="903391227141135909">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135866" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="903391227141135910">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dweightx" resolveInfo="weightx" />
              </node>
            </node>
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="903391227141135911">
              <property name="value" nameId="yvor.1068580320021:3" value="1" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135919">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141135920">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="903391227141135921" />
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="903391227141135922">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Container%dadd(java%dawt%dComponent,java%dlang%dObject)%cvoid" resolveInfo="add" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="903391227141135923">
                <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="903391227141135924">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JScrollPane%d&lt;init&gt;(java%dawt%dComponent)" resolveInfo="JScrollPane" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="903391227141135925">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135416" resolveInfo="myGraphLabel" />
                  </node>
                </node>
              </node>
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="903391227141135926">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135866" resolveInfo="c" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticField" roleId="yvor.1128555889557:3" type="yvor.StaticFieldDeclaration" typeId="yvor.1070462154015:3" id="903391227141135927">
      <property name="name" nameId="yvnu.1169194664001:0" value="FRAME_DIMENSION" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="903391227141135928" />
      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="5639108013728303284">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~Dimension" resolveInfo="Dimension" />
      </node>
      <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="903391227141135930">
        <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="903391227141135931">
          <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Dimension%d&lt;init&gt;(int,int)" resolveInfo="Dimension" />
          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="903391227141135932">
            <property name="value" nameId="yvor.1068580320021:3" value="800" />
          </node>
          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="903391227141135933">
            <property name="value" nameId="yvor.1068580320021:3" value="600" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticField" roleId="yvor.1128555889557:3" type="yvor.StaticFieldDeclaration" typeId="yvor.1070462154015:3" id="1418350014056289153">
      <property name="name" nameId="yvnu.1169194664001:0" value="DEFAULT_NODE_SIZE" />
      <property name="isFinal" nameId="yvor.1176718929932:3" value="true" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="1418350014056289154" />
      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1418350014056289156" />
      <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1418350014056289158">
        <property name="value" nameId="yvor.1068580320021:3" value="30" />
      </node>
    </node>
    <node role="staticField" roleId="yvor.1128555889557:3" type="yvor.StaticFieldDeclaration" typeId="yvor.1070462154015:3" id="490728924230502971">
      <property name="isFinal" nameId="yvor.1176718929932:3" value="true" />
      <property name="name" nameId="yvnu.1169194664001:0" value="DEFAULT_EDGE_X_SIZE" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="490728924230502972" />
      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="490728924230502974" />
      <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="490728924230502976">
        <property name="value" nameId="yvor.1068580320021:3" value="70" />
      </node>
    </node>
    <node role="staticField" roleId="yvor.1128555889557:3" type="yvor.StaticFieldDeclaration" typeId="yvor.1070462154015:3" id="490728924230502980">
      <property name="isFinal" nameId="yvor.1176718929932:3" value="true" />
      <property name="name" nameId="yvnu.1169194664001:0" value="DEFAULT_EDGE_Y_SIZE" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="490728924230502981" />
      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="490728924230502982" />
      <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="490728924230502983">
        <property name="value" nameId="yvor.1068580320021:3" value="35" />
      </node>
    </node>
    <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="903391227141135946" />
    <node role="constructor" roleId="yvor.1068390468201:3" type="yvor.ConstructorDeclaration" typeId="yvor.1068580123140:3" id="903391227141135947">
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="903391227141135948" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="903391227141135949" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="903391227141135950">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135951">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141135952">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="903391227141135953" />
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="903391227141135954">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Container%dsetLayout(java%dawt%dLayoutManager)%cvoid" resolveInfo="setLayout" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="903391227141135955">
                <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="903391227141135956">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~GridBagLayout%d&lt;init&gt;()" resolveInfo="GridBagLayout" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135957">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="903391227141135958">
            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="903391227141135602" resolveInfo="createDoLayoutButton" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135959">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="903391227141135960">
            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="903391227141135434" resolveInfo="createNewGraphButton" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6160477238666723347">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="6160477238666723348">
            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="6160477238666723341" resolveInfo="createLayoutChoiceButton" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135961">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="903391227141135962">
            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="903391227141135792" resolveInfo="createTextPanel" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135963">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="903391227141135964">
            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="903391227141135850" resolveInfo="createGraphPanel" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.CommentedStatementsBlock" typeId="yvor.1177326519037:3" id="3698135283642035869">
          <node role="statement" roleId="yvor.1177326540772:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141135965">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="903391227141135966">
              <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="903391227141135967">
                <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="903391227141135968">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="kw11.903391227141136169" resolveInfo="RectOrthogonalLayouter" />
                </node>
              </node>
              <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="903391227141135969">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141136156" resolveInfo="myLayouter" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="3698135283642035871">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="3698135283642035873">
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="3698135283642035872">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141136156" resolveInfo="myLayouter" />
            </node>
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="6526638447416979917">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="6526638447417029321">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="4t6q.5368829933099755767" resolveInfo="CurrentOrthogonalFlowLabelLayouter" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.CommentedStatementsBlock" typeId="yvor.1177326519037:3" id="3698135283642039221">
          <node role="statement" roleId="yvor.1177326540772:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1418350014056290615">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1418350014056290617">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="1418350014056290616">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141136156" resolveInfo="myLayouter" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1418350014056290621">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="kw11.1418350014056263386" resolveInfo="setEdgeDistance" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1418350014056290622">
                  <property name="value" nameId="yvor.1068580320021:3" value="20" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141136006">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="903391227141136007">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="903391227141136008" />
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="903391227141136009">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135422" resolveInfo="myCurrentLayout" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141136080">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="903391227141136082">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="903391227141136085">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="903391227141136087">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="903391227141130076" resolveInfo="LayoutPainter" />
              </node>
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="903391227141136081">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141136131" resolveInfo="myPainter" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="superclass" roleId="yvor.1165602531693:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="903391227141136010">
      <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="t147.~JPanel" resolveInfo="JPanel" />
    </node>
    <node role="staticMethod" roleId="yvor.1070462273904:3" type="yvor.StaticMethodDeclaration" typeId="yvor.1081236700938:3" id="903391227141136011">
      <property name="name" nameId="yvnu.1169194664001:0" value="create" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="903391227141136012" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="903391227141136013" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="903391227141136014">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="903391227141136015">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="903391227141136016">
            <property name="name" nameId="yvnu.1169194664001:0" value="frame" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="903391227141136017">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="t147.~JFrame" resolveInfo="JFrame" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="903391227141136018">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="903391227141136019">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JFrame%d&lt;init&gt;()" resolveInfo="JFrame" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141136020">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141136021">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="903391227141136022">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141136016" resolveInfo="frame" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="903391227141136023">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JFrame%dsetDefaultCloseOperation(int)%cvoid" resolveInfo="setDefaultCloseOperation" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="903391227141136024">
                <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="t147.~JFrame" resolveInfo="JFrame" />
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="t147.~JFrame%dEXIT_ON_CLOSE" resolveInfo="EXIT_ON_CLOSE" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141136025">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141136026">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="903391227141136027">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141136016" resolveInfo="frame" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="903391227141136028">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Container%dadd(java%dawt%dComponent)%cjava%dawt%dComponent" resolveInfo="add" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="903391227141136029">
                <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="903391227141136030">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="903391227141135947" resolveInfo="TestPanel" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141136031">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141136032">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="903391227141136033">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141136016" resolveInfo="frame" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="903391227141136034">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Window%dsetMinimumSize(java%dawt%dDimension)%cvoid" resolveInfo="setMinimumSize" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="903391227141136035">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141135927" resolveInfo="FRAME_DIMENSION" />
                <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="903391227141135207" resolveInfo="TestPanel" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141136036">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141136037">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="903391227141136038">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141136016" resolveInfo="frame" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="903391227141136039">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Window%dpack()%cvoid" resolveInfo="pack" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141136040">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="903391227141136041">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="903391227141136042">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="903391227141136016" resolveInfo="frame" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="903391227141136043">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Window%dsetVisible(boolean)%cvoid" resolveInfo="setVisible" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="903391227141136044">
                <property name="value" nameId="yvor.1068580123138:3" value="true" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" roleId="yvor.1070462273904:3" type="yvor.StaticMethodDeclaration" typeId="yvor.1081236700938:3" id="903391227141136045">
      <property name="name" nameId="yvnu.1169194664001:0" value="main" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="903391227141136046" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="903391227141136047" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="903391227141136048">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141136049">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="903391227141136050">
            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~SwingUtilities%dinvokeLater(java%dlang%dRunnable)%cvoid" resolveInfo="invokeLater" />
            <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="t147.~SwingUtilities" resolveInfo="SwingUtilities" />
            <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="903391227141136051">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.AnonymousClassCreator" typeId="yvor.1182160077978:3" id="903391227141136052">
                <node role="cls" roleId="yvor.1182160096073:3" type="yvor.AnonymousClass" typeId="yvor.1170345865475:3" id="903391227141136053">
                  <property name="nonStatic" nameId="yvor.521412098689998745:3" value="true" />
                  <link role="classifier" roleId="yvor.1170346070688:3" targetNodeId="vhgx.~Runnable" resolveInfo="Runnable" />
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vhgx.~Object%d&lt;init&gt;()" resolveInfo="Object" />
                  <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="903391227141136054" />
                  <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="903391227141136055">
                    <property name="isAbstract" nameId="yvor.1178608670077:3" value="false" />
                    <property name="name" nameId="yvnu.1169194664001:0" value="run" />
                    <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="903391227141136056" />
                    <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="903391227141136057" />
                    <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="903391227141136058">
                      <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="903391227141136059">
                        <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalStaticMethodCall" typeId="yvor.1172058436953:3" id="903391227141136060">
                          <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="903391227141136011" resolveInfo="create" />
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
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="903391227141136061">
        <property name="name" nameId="yvnu.1169194664001:0" value="args" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ArrayType" typeId="yvor.1070534760951:3" id="903391227141136062">
          <node role="componentType" roleId="yvor.1070534760952:3" type="yvor.StringType" typeId="yvor.1225271177708:3" id="903391227141136063" />
        </node>
      </node>
    </node>
  </root>
  <root id="8729833695221588600">
    <node role="staticInnerClassifiers" roleId="yvor.1178616825527:3" type="yvor.ClassConcept" typeId="yvor.1068390468198:3" id="8729833695221588601">
      <property name="nonStatic" nameId="yvor.521412098689998745:3" value="true" />
      <property name="name" nameId="yvnu.1169194664001:0" value="MyLayoutChoice" />
      <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="8729833695221588602">
        <property name="name" nameId="yvnu.1169194664001:0" value="getSelectedLayoutLavel" />
        <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="8729833695221588603" />
        <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="8729833695221588604" />
        <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8729833695221588605">
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="8729833695221588606">
            <node role="expression" roleId="yvor.1068581517676:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8729833695221588607">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588616" resolveInfo="myLayoutLevel" />
            </node>
          </node>
        </node>
      </node>
      <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="8729833695221588608">
        <property name="name" nameId="yvnu.1169194664001:0" value="isSetLabels" />
        <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.BooleanType" typeId="yvor.1070534644030:3" id="8729833695221588609" />
        <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="8729833695221588610" />
        <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8729833695221588611">
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="8729833695221588612">
            <node role="expression" roleId="yvor.1068581517676:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221588613">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8729833695221588614">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588619" resolveInfo="myLabelForAllEdges" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221588615">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~AbstractButton%disSelected()%cboolean" resolveInfo="isSelected" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="field" roleId="yvor.1068390468199:3" type="yvor.FieldDeclaration" typeId="yvor.1068390468200:3" id="8729833695221588616">
        <property name="name" nameId="yvnu.1169194664001:0" value="myLayoutLevel" />
        <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="8729833695221588617" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="8729833695221588618" />
      </node>
      <node role="field" roleId="yvor.1068390468199:3" type="yvor.FieldDeclaration" typeId="yvor.1068390468200:3" id="8729833695221588619">
        <property name="name" nameId="yvnu.1169194664001:0" value="myLabelForAllEdges" />
        <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="8729833695221588620" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8729833695221588621">
          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="t147.~JRadioButton" resolveInfo="JRadioButton" />
        </node>
      </node>
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="8729833695221588622" />
      <node role="constructor" roleId="yvor.1068390468201:3" type="yvor.ConstructorDeclaration" typeId="yvor.1068580123140:3" id="8729833695221588623">
        <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="8729833695221588624" />
        <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="8729833695221588625" />
        <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8729833695221588626">
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="8729833695221588627">
            <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8729833695221588628">
              <property name="name" nameId="yvnu.1169194664001:0" value="group" />
              <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8729833695221588629">
                <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="t147.~ButtonGroup" resolveInfo="ButtonGroup" />
              </node>
              <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8729833695221588630">
                <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="8729833695221588631">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~ButtonGroup%d&lt;init&gt;()" resolveInfo="ButtonGroup" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="8729833695221588632">
            <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8729833695221588633">
              <property name="name" nameId="yvnu.1169194664001:0" value="c" />
              <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8729833695221588634">
                <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~GridBagConstraints" resolveInfo="GridBagConstraints" />
              </node>
              <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8729833695221588635">
                <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="8729833695221588636">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~GridBagConstraints%d&lt;init&gt;()" resolveInfo="GridBagConstraints" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221588637">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221588638">
              <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="8729833695221588639">
                <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="2uit.~GridBagConstraints" resolveInfo="GridBagConstraints" />
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2uit.~GridBagConstraints%dVERTICAL" resolveInfo="VERTICAL" />
              </node>
              <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221588640">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221588641">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588633" resolveInfo="c" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="8729833695221588642">
                  <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dfill" resolveInfo="fill" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221588643">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221588644">
              <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221588645">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221588646">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588633" resolveInfo="c" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="8729833695221588647">
                  <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridx" resolveInfo="gridx" />
                </node>
              </node>
              <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8729833695221588648">
                <property name="value" nameId="yvor.1068580320021:3" value="0" />
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221588649">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221588650">
              <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221588651">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221588652">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588633" resolveInfo="c" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="8729833695221588653">
                  <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridy" resolveInfo="gridy" />
                </node>
              </node>
              <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8729833695221588654">
                <property name="value" nameId="yvor.1068580320021:3" value="0" />
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="8729833695221588655">
            <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8729833695221588656">
              <property name="name" nameId="yvnu.1169194664001:0" value="button" />
              <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8729833695221588657">
                <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="t147.~JRadioButton" resolveInfo="JRadioButton" />
              </node>
              <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8729833695221588658">
                <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="8729833695221588659">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JRadioButton%d&lt;init&gt;(java%dlang%dString)" resolveInfo="JRadioButton" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="8729833695221588660">
                    <property name="value" nameId="yvor.1070475926801:3" value="visibility layout" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221588661">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221588662">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221588663">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588656" resolveInfo="button" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221588664">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~AbstractButton%daddActionListener(java%dawt%devent%dActionListener)%cvoid" resolveInfo="addActionListener" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8729833695221588665">
                  <node role="creator" roleId="yvor.1145553007750:3" type="yvor.AnonymousClassCreator" typeId="yvor.1182160077978:3" id="8729833695221588666">
                    <node role="cls" roleId="yvor.1182160096073:3" type="yvor.AnonymousClass" typeId="yvor.1170345865475:3" id="8729833695221588667">
                      <property name="nonStatic" nameId="yvor.521412098689998745:3" value="true" />
                      <link role="classifier" roleId="yvor.1170346070688:3" targetNodeId="46vv.~ActionListener" resolveInfo="ActionListener" />
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vhgx.~Object%d&lt;init&gt;()" resolveInfo="Object" />
                      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="8729833695221588668" />
                      <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="8729833695221588669">
                        <property name="isAbstract" nameId="yvor.1178608670077:3" value="false" />
                        <property name="name" nameId="yvnu.1169194664001:0" value="actionPerformed" />
                        <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="8729833695221588670" />
                        <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="8729833695221588671" />
                        <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="8729833695221588672">
                          <property name="name" nameId="yvnu.1169194664001:0" value="p0" />
                          <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8729833695221588673">
                            <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="46vv.~ActionEvent" resolveInfo="ActionEvent" />
                          </node>
                        </node>
                        <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8729833695221588674">
                          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221588675">
                            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221588676">
                              <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8729833695221588677">
                                <property name="value" nameId="yvor.1068580320021:3" value="0" />
                              </node>
                              <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8729833695221588678">
                                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588616" resolveInfo="myLayoutLevel" />
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
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221588679">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221588680">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="8729833695221588681" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221588682">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Container%dadd(java%dawt%dComponent)%cjava%dawt%dComponent" resolveInfo="add" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221588683">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588656" resolveInfo="button" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221588684">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221588685">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221588686">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588628" resolveInfo="group" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221588687">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~ButtonGroup%dadd(javax%dswing%dAbstractButton)%cvoid" resolveInfo="add" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221588688">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588656" resolveInfo="button" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221588689">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221588690">
              <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8729833695221588691">
                <property name="value" nameId="yvor.1068580320021:3" value="1" />
              </node>
              <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221588692">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221588693">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588633" resolveInfo="c" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="8729833695221588694">
                  <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridy" resolveInfo="gridy" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221588695">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221588696">
              <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8729833695221588697">
                <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="8729833695221588698">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JRadioButton%d&lt;init&gt;(java%dlang%dString)" resolveInfo="JRadioButton" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="8729833695221588699">
                    <property name="value" nameId="yvor.1070475926801:3" value="graph layout" />
                  </node>
                </node>
              </node>
              <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221588700">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588656" resolveInfo="button" />
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221588701">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221588702">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221588703">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588656" resolveInfo="button" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221588704">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~AbstractButton%daddActionListener(java%dawt%devent%dActionListener)%cvoid" resolveInfo="addActionListener" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8729833695221588705">
                  <node role="creator" roleId="yvor.1145553007750:3" type="yvor.AnonymousClassCreator" typeId="yvor.1182160077978:3" id="8729833695221588706">
                    <node role="cls" roleId="yvor.1182160096073:3" type="yvor.AnonymousClass" typeId="yvor.1170345865475:3" id="8729833695221588707">
                      <property name="nonStatic" nameId="yvor.521412098689998745:3" value="true" />
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vhgx.~Object%d&lt;init&gt;()" resolveInfo="Object" />
                      <link role="classifier" roleId="yvor.1170346070688:3" targetNodeId="46vv.~ActionListener" resolveInfo="ActionListener" />
                      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="8729833695221588708" />
                      <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="8729833695221588709">
                        <property name="isAbstract" nameId="yvor.1178608670077:3" value="false" />
                        <property name="name" nameId="yvnu.1169194664001:0" value="actionPerformed" />
                        <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="8729833695221588710" />
                        <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="8729833695221588711" />
                        <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="8729833695221588712">
                          <property name="name" nameId="yvnu.1169194664001:0" value="p0" />
                          <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8729833695221588713">
                            <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="46vv.~ActionEvent" resolveInfo="ActionEvent" />
                          </node>
                        </node>
                        <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8729833695221588714">
                          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221588715">
                            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221588716">
                              <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8729833695221588717">
                                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588616" resolveInfo="myLayoutLevel" />
                              </node>
                              <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8729833695221588718">
                                <property name="value" nameId="yvor.1068580320021:3" value="1" />
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
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221588719">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221588720">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="8729833695221588721" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221588722">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Container%dadd(java%dawt%dComponent)%cjava%dawt%dComponent" resolveInfo="add" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221588723">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588656" resolveInfo="button" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221588724">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221588725">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221588726">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588628" resolveInfo="group" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221588727">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~ButtonGroup%dadd(javax%dswing%dAbstractButton)%cvoid" resolveInfo="add" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221588728">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588656" resolveInfo="button" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221588729">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221588730">
              <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221588731">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221588732">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588633" resolveInfo="c" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="8729833695221588733">
                  <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridy" resolveInfo="gridy" />
                </node>
              </node>
              <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8729833695221588734">
                <property name="value" nameId="yvor.1068580320021:3" value="2" />
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221588735">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221588736">
              <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8729833695221588737">
                <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="8729833695221588738">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JRadioButton%d&lt;init&gt;(java%dlang%dString)" resolveInfo="JRadioButton" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="8729833695221588739">
                    <property name="value" nameId="yvor.1070475926801:3" value="optimized layout" />
                  </node>
                </node>
              </node>
              <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221588740">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588656" resolveInfo="button" />
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221588741">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221588742">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221588743">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588656" resolveInfo="button" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221588744">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~AbstractButton%daddActionListener(java%dawt%devent%dActionListener)%cvoid" resolveInfo="addActionListener" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8729833695221588745">
                  <node role="creator" roleId="yvor.1145553007750:3" type="yvor.AnonymousClassCreator" typeId="yvor.1182160077978:3" id="8729833695221588746">
                    <node role="cls" roleId="yvor.1182160096073:3" type="yvor.AnonymousClass" typeId="yvor.1170345865475:3" id="8729833695221588747">
                      <property name="nonStatic" nameId="yvor.521412098689998745:3" value="true" />
                      <link role="classifier" roleId="yvor.1170346070688:3" targetNodeId="46vv.~ActionListener" resolveInfo="ActionListener" />
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vhgx.~Object%d&lt;init&gt;()" resolveInfo="Object" />
                      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="8729833695221588748" />
                      <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="8729833695221588749">
                        <property name="isAbstract" nameId="yvor.1178608670077:3" value="false" />
                        <property name="name" nameId="yvnu.1169194664001:0" value="actionPerformed" />
                        <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="8729833695221588750" />
                        <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="8729833695221588751" />
                        <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="8729833695221588752">
                          <property name="name" nameId="yvnu.1169194664001:0" value="p0" />
                          <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8729833695221588753">
                            <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="46vv.~ActionEvent" resolveInfo="ActionEvent" />
                          </node>
                        </node>
                        <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8729833695221588754">
                          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221588755">
                            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221588756">
                              <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8729833695221588757">
                                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588616" resolveInfo="myLayoutLevel" />
                              </node>
                              <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8729833695221588758">
                                <property name="value" nameId="yvor.1068580320021:3" value="2" />
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
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221588759">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221588760">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="8729833695221588761" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221588762">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Container%dadd(java%dawt%dComponent)%cjava%dawt%dComponent" resolveInfo="add" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221588763">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588656" resolveInfo="button" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221588764">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221588765">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221588766">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588628" resolveInfo="group" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221588767">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~ButtonGroup%dadd(javax%dswing%dAbstractButton)%cvoid" resolveInfo="add" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221588768">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588656" resolveInfo="button" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221588769">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221588770">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221588771">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588656" resolveInfo="button" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221588772">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~AbstractButton%dsetSelected(boolean)%cvoid" resolveInfo="setSelected" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="8729833695221588773">
                  <property name="value" nameId="yvor.1068580123138:3" value="true" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221588774">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221588775">
              <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8729833695221588776">
                <property name="value" nameId="yvor.1068580320021:3" value="3" />
              </node>
              <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221588777">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221588778">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588633" resolveInfo="c" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="8729833695221588779">
                  <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridy" resolveInfo="gridy" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221588780">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221588781">
              <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8729833695221588782">
                <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="8729833695221588783">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JRadioButton%d&lt;init&gt;(java%dlang%dString)" resolveInfo="JRadioButton" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="8729833695221588784">
                    <property name="value" nameId="yvor.1070475926801:3" value="add labels for each edge" />
                  </node>
                </node>
              </node>
              <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221588785">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588656" resolveInfo="button" />
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221588786">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221588787">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="8729833695221588788" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221588789">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Container%dadd(java%dawt%dComponent)%cjava%dawt%dComponent" resolveInfo="add" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221588790">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588656" resolveInfo="button" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221588791">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221588792">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221588793">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588656" resolveInfo="button" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221588794">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~AbstractButton%dsetSelected(boolean)%cvoid" resolveInfo="setSelected" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="8729833695221588795">
                  <property name="value" nameId="yvor.1068580123138:3" value="true" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221588796">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221588797">
              <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221588798">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588656" resolveInfo="button" />
              </node>
              <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8729833695221588799">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588619" resolveInfo="myLabelForAllEdges" />
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221588800">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221588801">
              <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8729833695221588802">
                <property name="value" nameId="yvor.1068580320021:3" value="2" />
              </node>
              <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8729833695221588803">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588616" resolveInfo="myLayoutLevel" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="superclass" roleId="yvor.1165602531693:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8729833695221588804">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="t147.~JPanel" resolveInfo="JPanel" />
      </node>
    </node>
    <node role="staticInnerClassifiers" roleId="yvor.1178616825527:3" type="yvor.ClassConcept" typeId="yvor.1068390468198:3" id="8729833695221588805">
      <property name="nonStatic" nameId="yvor.521412098689998745:3" value="true" />
      <property name="name" nameId="yvnu.1169194664001:0" value="MyGraphLabel" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="8729833695221588806" />
      <node role="constructor" roleId="yvor.1068390468201:3" type="yvor.ConstructorDeclaration" typeId="yvor.1068580123140:3" id="8729833695221588807">
        <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="8729833695221588808" />
        <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="8729833695221588809" />
        <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8729833695221588810">
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.SuperConstructorInvocation" typeId="yvor.1070475587102:3" id="8729833695221588811">
            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JLabel%d&lt;init&gt;()" resolveInfo="JLabel" />
          </node>
        </node>
      </node>
      <node role="superclass" roleId="yvor.1165602531693:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8729833695221588812">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="t147.~JLabel" resolveInfo="JLabel" />
      </node>
      <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="8729833695221588813">
        <property name="name" nameId="yvnu.1169194664001:0" value="paintComponent" />
        <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="8729833695221588814" />
        <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="8729833695221588815" />
        <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="8729833695221588816">
          <property name="name" nameId="yvnu.1169194664001:0" value="graphics" />
          <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8729833695221588817">
            <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~Graphics" resolveInfo="Graphics" />
          </node>
        </node>
        <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8729833695221588818">
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="8729833695221588819">
            <node role="condition" roleId="yvor.1068580123160:3" type="yvor.EqualsExpression" typeId="yvor.1068580123152:3" id="8729833695221588820">
              <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="8729833695221588821" />
              <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8729833695221588822">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588852" resolveInfo="myCurrentLayout" />
              </node>
            </node>
            <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8729833695221588823">
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221588824">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221588825">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="8729833695221588826">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588816" resolveInfo="graphics" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221588827">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Graphics%ddrawString(java%dlang%dString,int,int)%cvoid" resolveInfo="drawString" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="8729833695221588828">
                      <property name="value" nameId="yvor.1070475926801:3" value="no graph yet!!!" />
                    </node>
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8729833695221588829">
                      <property name="value" nameId="yvor.1068580320021:3" value="50" />
                    </node>
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8729833695221588830">
                      <property name="value" nameId="yvor.1068580320021:3" value="50" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="ifFalseStatement" roleId="yvor.1082485599094:3" type="yvor.BlockStatement" typeId="yvor.1082485599095:3" id="8729833695221588831">
              <node role="statements" roleId="yvor.1082485599096:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8729833695221588832">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221588833">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221588834">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8729833695221588835">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588849" resolveInfo="myPainter" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221588836">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="903391227141130080" resolveInfo="paint" />
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8729833695221588837">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588852" resolveInfo="myCurrentLayout" />
                      </node>
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="8729833695221588838">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588816" resolveInfo="graphics" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="annotation" roleId="yvor.1188208488637:3" type="yvor.AnnotationInstance" typeId="yvor.1188207840427:3" id="8729833695221588839">
          <link role="annotation" roleId="yvor.1188208074048:3" targetNodeId="vhgx.~Override" resolveInfo="Override" />
        </node>
      </node>
    </node>
    <node role="field" roleId="yvor.1068390468199:3" type="yvor.FieldDeclaration" typeId="yvor.1068390468200:3" id="8729833695221588840">
      <property name="name" nameId="yvnu.1169194664001:0" value="myTextArea" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="8729833695221588841" />
      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8729833695221588842">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="t147.~JTextArea" resolveInfo="JTextArea" />
      </node>
    </node>
    <node role="field" roleId="yvor.1068390468199:3" type="yvor.FieldDeclaration" typeId="yvor.1068390468200:3" id="8729833695221588843">
      <property name="name" nameId="yvnu.1169194664001:0" value="myGraphLabel" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="8729833695221588844" />
      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8729833695221588845">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8729833695221588805" resolveInfo="OrthogonalLayoutTestPanel.MyGraphLabel" />
      </node>
    </node>
    <node role="field" roleId="yvor.1068390468199:3" type="yvor.FieldDeclaration" typeId="yvor.1068390468200:3" id="8729833695221588846">
      <property name="name" nameId="yvnu.1169194664001:0" value="myLayouter" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="8729833695221588847" />
      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8729833695221619584">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="kw11.903391227141136167" resolveInfo="RectOrthogonalLayouter" />
      </node>
    </node>
    <node role="field" roleId="yvor.1068390468199:3" type="yvor.FieldDeclaration" typeId="yvor.1068390468200:3" id="8729833695221588849">
      <property name="name" nameId="yvnu.1169194664001:0" value="myPainter" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="8729833695221588850" />
      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8729833695221588851">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="903391227141130074" resolveInfo="LayoutPainter" />
      </node>
    </node>
    <node role="field" roleId="yvor.1068390468199:3" type="yvor.FieldDeclaration" typeId="yvor.1068390468200:3" id="8729833695221588852">
      <property name="name" nameId="yvnu.1169194664001:0" value="myCurrentLayout" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="8729833695221588853" />
      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8729833695221588854">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="rm96.903391227141129818" resolveInfo="GraphLayout" />
      </node>
    </node>
    <node role="field" roleId="yvor.1068390468199:3" type="yvor.FieldDeclaration" typeId="yvor.1068390468200:3" id="8729833695221588855">
      <property name="name" nameId="yvnu.1169194664001:0" value="myNumEdgesField" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="8729833695221588856" />
      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8729833695221588857">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="t147.~JTextField" resolveInfo="JTextField" />
      </node>
    </node>
    <node role="field" roleId="yvor.1068390468199:3" type="yvor.FieldDeclaration" typeId="yvor.1068390468200:3" id="8729833695221588858">
      <property name="name" nameId="yvnu.1169194664001:0" value="myNumNodesField" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="8729833695221588859" />
      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8729833695221588860">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="t147.~JTextField" resolveInfo="JTextField" />
      </node>
    </node>
    <node role="field" roleId="yvor.1068390468199:3" type="yvor.FieldDeclaration" typeId="yvor.1068390468200:3" id="8729833695221588861">
      <property name="name" nameId="yvnu.1169194664001:0" value="myLayoutChoice" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="8729833695221588862" />
      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8729833695221588863">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8729833695221588601" resolveInfo="OrthogonalLayoutTestPanel.MyLayoutChoice" />
      </node>
    </node>
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="8729833695221588864">
      <property name="name" nameId="yvnu.1169194664001:0" value="createLayoutChoiceButtons" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="8729833695221588865" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="8729833695221588866" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8729833695221588867">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="8729833695221588868">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8729833695221588869">
            <property name="name" nameId="yvnu.1169194664001:0" value="c" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8729833695221588870">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~GridBagConstraints" resolveInfo="GridBagConstraints" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8729833695221588871">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="8729833695221588872">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~GridBagConstraints%d&lt;init&gt;()" resolveInfo="GridBagConstraints" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221588873">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221588874">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8729833695221588875">
              <property name="value" nameId="yvor.1068580320021:3" value="0" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221588876">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221588877">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588869" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="8729833695221588878">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridy" resolveInfo="gridy" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221588879">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221588880">
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221588881">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221588882">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588869" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="8729833695221588883">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridx" resolveInfo="gridx" />
              </node>
            </node>
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8729833695221588884">
              <property name="value" nameId="yvor.1068580320021:3" value="2" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221588885">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221588886">
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221588887">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221588888">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588869" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="8729833695221588889">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dfill" resolveInfo="fill" />
              </node>
            </node>
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="8729833695221588890">
              <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="2uit.~GridBagConstraints" resolveInfo="GridBagConstraints" />
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2uit.~GridBagConstraints%dHORIZONTAL" resolveInfo="HORIZONTAL" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221588891">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221588892">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8729833695221588893">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="8729833695221588894">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8729833695221588623" resolveInfo="OrthogonalLayoutTestPanel.MyLayoutChoice" />
              </node>
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8729833695221588895">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588861" resolveInfo="myLayoutChoice" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221619576">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="8729833695221619577">
            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Container%dadd(java%dawt%dComponent)%cjava%dawt%dComponent" resolveInfo="add" />
            <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8729833695221619578">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588861" resolveInfo="myLayoutChoice" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="8729833695221588901">
      <property name="name" nameId="yvnu.1169194664001:0" value="createNewGraphButton" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="8729833695221588902" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="8729833695221588903" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8729833695221588904">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221588905">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221588906">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8729833695221588907">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="8729833695221588908">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTextField%d&lt;init&gt;(int)" resolveInfo="JTextField" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8729833695221588909">
                  <property name="value" nameId="yvor.1068580320021:3" value="10" />
                </node>
              </node>
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8729833695221588910">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588858" resolveInfo="myNumNodesField" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221588911">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221588912">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8729833695221588913">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588858" resolveInfo="myNumNodesField" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221588914">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JComponent%dsetBorder(javax%dswing%dborder%dBorder)%cvoid" resolveInfo="setBorder" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="8729833695221588915">
                <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="t147.~BorderFactory" resolveInfo="BorderFactory" />
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~BorderFactory%dcreateTitledBorder(java%dlang%dString)%cjavax%dswing%dborder%dTitledBorder" resolveInfo="createTitledBorder" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="8729833695221588916">
                  <property name="value" nameId="yvor.1070475926801:3" value="nodes:" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221588917">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221588918">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8729833695221588919">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="8729833695221588920">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTextField%d&lt;init&gt;(int)" resolveInfo="JTextField" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8729833695221588921">
                  <property name="value" nameId="yvor.1068580320021:3" value="10" />
                </node>
              </node>
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8729833695221588922">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588855" resolveInfo="myNumEdgesField" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221588923">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221588924">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8729833695221588925">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588855" resolveInfo="myNumEdgesField" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221588926">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JComponent%dsetBorder(javax%dswing%dborder%dBorder)%cvoid" resolveInfo="setBorder" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="8729833695221588927">
                <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="t147.~BorderFactory" resolveInfo="BorderFactory" />
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~BorderFactory%dcreateTitledBorder(java%dlang%dString)%cjavax%dswing%dborder%dTitledBorder" resolveInfo="createTitledBorder" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="8729833695221588928">
                  <property name="value" nameId="yvor.1070475926801:3" value="edges:" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="8729833695221588929">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8729833695221588930">
            <property name="name" nameId="yvnu.1169194664001:0" value="c" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8729833695221588931">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~GridBagConstraints" resolveInfo="GridBagConstraints" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8729833695221588932">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="8729833695221588933">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~GridBagConstraints%d&lt;init&gt;()" resolveInfo="GridBagConstraints" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221588934">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221588935">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8729833695221588936">
              <property name="value" nameId="yvor.1068580320021:3" value="0" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221588937">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221588938">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588930" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="8729833695221588939">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridy" resolveInfo="gridy" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221588940">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221588941">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8729833695221588942">
              <property name="value" nameId="yvor.1068580320021:3" value="1" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221588943">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221588944">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588930" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="8729833695221588945">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridx" resolveInfo="gridx" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221588946">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221588947">
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221588948">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221588949">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588930" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="8729833695221588950">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dfill" resolveInfo="fill" />
              </node>
            </node>
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="8729833695221588951">
              <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="2uit.~GridBagConstraints" resolveInfo="GridBagConstraints" />
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2uit.~GridBagConstraints%dHORIZONTAL" resolveInfo="HORIZONTAL" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221588952">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221588953">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="8729833695221588954" />
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221588955">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Container%dadd(java%dawt%dComponent)%cjava%dawt%dComponent" resolveInfo="add" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8729833695221588956">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588858" resolveInfo="myNumNodesField" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221588957">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221588958">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8729833695221588959">
              <property name="value" nameId="yvor.1068580320021:3" value="2" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221588960">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221588961">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588930" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="8729833695221588962">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridx" resolveInfo="gridx" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221588963">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221588964">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="8729833695221588965" />
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221588966">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Container%dadd(java%dawt%dComponent)%cjava%dawt%dComponent" resolveInfo="add" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8729833695221619579">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588855" resolveInfo="myNumEdgesField" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221588968">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221588969">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8729833695221588970">
              <property name="value" nameId="yvor.1068580320021:3" value="3" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221588971">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221588972">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588930" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="8729833695221588973">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridy" resolveInfo="gridy" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221588974">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221588975">
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221588976">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221588977">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588930" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="8729833695221588978">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridy" resolveInfo="gridy" />
              </node>
            </node>
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8729833695221588979">
              <property name="value" nameId="yvor.1068580320021:3" value="4" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="8729833695221588980">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8729833695221588981">
            <property name="name" nameId="yvnu.1169194664001:0" value="button" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8729833695221588982">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="t147.~JButton" resolveInfo="JButton" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8729833695221588983">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="8729833695221588984">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JButton%d&lt;init&gt;(java%dlang%dString)" resolveInfo="JButton" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="8729833695221588985">
                  <property name="value" nameId="yvor.1070475926801:3" value="generate graph!" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221588986">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221588987">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221588988">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588981" resolveInfo="button" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221588989">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~AbstractButton%daddActionListener(java%dawt%devent%dActionListener)%cvoid" resolveInfo="addActionListener" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8729833695221588990">
                <node role="creator" roleId="yvor.1145553007750:3" type="yvor.AnonymousClassCreator" typeId="yvor.1182160077978:3" id="8729833695221588991">
                  <node role="cls" roleId="yvor.1182160096073:3" type="yvor.AnonymousClass" typeId="yvor.1170345865475:3" id="8729833695221588992">
                    <property name="nonStatic" nameId="yvor.521412098689998745:3" value="true" />
                    <link role="classifier" roleId="yvor.1170346070688:3" targetNodeId="46vv.~ActionListener" resolveInfo="ActionListener" />
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vhgx.~Object%d&lt;init&gt;()" resolveInfo="Object" />
                    <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="8729833695221588993" />
                    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="8729833695221588994">
                      <property name="isAbstract" nameId="yvor.1178608670077:3" value="false" />
                      <property name="name" nameId="yvnu.1169194664001:0" value="actionPerformed" />
                      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="8729833695221588995" />
                      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="8729833695221588996" />
                      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="8729833695221588997">
                        <property name="name" nameId="yvnu.1169194664001:0" value="p0" />
                        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8729833695221588998">
                          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="46vv.~ActionEvent" resolveInfo="ActionEvent" />
                        </node>
                      </node>
                      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8729833695221588999">
                        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.TryCatchStatement" typeId="yvor.1164879751025:3" id="8729833695221589000">
                          <node role="body" roleId="yvor.1164879758292:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8729833695221589001">
                            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="8729833695221589002">
                              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8729833695221589003">
                                <property name="name" nameId="yvnu.1169194664001:0" value="numNodes" />
                                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="8729833695221589004" />
                                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="8729833695221589005">
                                  <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="vhgx.~Integer" resolveInfo="Integer" />
                                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vhgx.~Integer%dparseInt(java%dlang%dString)%cint" resolveInfo="parseInt" />
                                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589006">
                                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8729833695221589007">
                                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588858" resolveInfo="myNumNodesField" />
                                    </node>
                                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589008">
                                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="ko86.~JTextComponent%dgetText()%cjava%dlang%dString" resolveInfo="getText" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="8729833695221589009">
                              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8729833695221589010">
                                <property name="name" nameId="yvnu.1169194664001:0" value="numEdges" />
                                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="8729833695221589011" />
                                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="8729833695221589012">
                                  <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="vhgx.~Integer" resolveInfo="Integer" />
                                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vhgx.~Integer%dparseInt(java%dlang%dString)%cint" resolveInfo="parseInt" />
                                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589013">
                                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8729833695221589014">
                                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588855" resolveInfo="myNumEdgesField" />
                                    </node>
                                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589015">
                                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="ko86.~JTextComponent%dgetText()%cjava%dlang%dString" resolveInfo="getText" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="8729833695221589016">
                              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8729833695221589017">
                                <property name="name" nameId="yvnu.1169194664001:0" value="g" />
                                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8729833695221589018">
                                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="aequ.8567569493821103298" resolveInfo="Graph" />
                                </node>
                              </node>
                            </node>
                            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589019">
                              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221589020">
                                <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="8729833695221589021">
                                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="35o0.7953585273260012391" resolveInfo="generateSimpleConnectedGraph" />
                                  <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="35o0.3437556975695846619" resolveInfo="RandomGraphGenerator" />
                                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589022">
                                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589003" resolveInfo="numNodes" />
                                  </node>
                                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589023">
                                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589010" resolveInfo="numEdges" />
                                  </node>
                                </node>
                                <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589024">
                                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589017" resolveInfo="g" />
                                </node>
                              </node>
                            </node>
                            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589025">
                              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="8729833695221589026">
                                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8729833695221589121" resolveInfo="writeGraph" />
                                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589027">
                                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589017" resolveInfo="g" />
                                </node>
                              </node>
                            </node>
                          </node>
                          <node role="catchClause" roleId="yvor.1164903496223:3" type="yvor.CatchClause" typeId="yvor.1164903280175:3" id="8729833695221589028">
                            <node role="throwable" roleId="yvor.1164903359217:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8729833695221589029">
                              <property name="name" nameId="yvnu.1169194664001:0" value="e" />
                              <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8729833695221589030">
                                <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Exception" resolveInfo="Exception" />
                              </node>
                            </node>
                            <node role="catchBody" roleId="yvor.1164903359218:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8729833695221589031">
                              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589032">
                                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="8729833695221589033">
                                  <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="t147.~JOptionPane" resolveInfo="JOptionPane" />
                                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JOptionPane%dshowMessageDialog(java%dawt%dComponent,java%dlang%dObject)%cvoid" resolveInfo="showMessageDialog" />
                                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="8729833695221589034">
                                    <link role="classConcept" roleId="yvor.1182955020723:3" targetNodeId="8729833695221588600" resolveInfo="OrthogonalLayoutTestPanel" />
                                  </node>
                                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="8729833695221589035">
                                    <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589036">
                                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589037">
                                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589029" resolveInfo="e" />
                                      </node>
                                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589038">
                                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vhgx.~Throwable%dtoString()%cjava%dlang%dString" resolveInfo="toString" />
                                      </node>
                                    </node>
                                    <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="8729833695221589039">
                                      <property name="value" nameId="yvor.1070475926801:3" value="enter number of nodes and edges...\n" />
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
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589040">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589041">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="8729833695221589042" />
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589043">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Container%dadd(java%dawt%dComponent)%cjava%dawt%dComponent" resolveInfo="add" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589044">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588981" resolveInfo="button" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="8729833695221589045">
      <property name="name" nameId="yvnu.1169194664001:0" value="createDoLayoutButton" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="8729833695221589046" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="8729833695221589047" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8729833695221589048">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="8729833695221589049">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8729833695221589050">
            <property name="name" nameId="yvnu.1169194664001:0" value="button" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8729833695221589051">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="t147.~JButton" resolveInfo="JButton" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8729833695221589052">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="8729833695221589053">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JButton%d&lt;init&gt;(java%dlang%dString)" resolveInfo="JButton" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="8729833695221589054">
                  <property name="value" nameId="yvor.1070475926801:3" value="do layout!" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="8729833695221589055">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8729833695221589056">
            <property name="name" nameId="yvnu.1169194664001:0" value="c" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8729833695221589057">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~GridBagConstraints" resolveInfo="GridBagConstraints" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8729833695221589058">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="8729833695221589059">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~GridBagConstraints%d&lt;init&gt;()" resolveInfo="GridBagConstraints" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589060">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589061">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589062">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589050" resolveInfo="button" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589063">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~AbstractButton%daddActionListener(java%dawt%devent%dActionListener)%cvoid" resolveInfo="addActionListener" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8729833695221589064">
                <node role="creator" roleId="yvor.1145553007750:3" type="yvor.AnonymousClassCreator" typeId="yvor.1182160077978:3" id="8729833695221589065">
                  <node role="cls" roleId="yvor.1182160096073:3" type="yvor.AnonymousClass" typeId="yvor.1170345865475:3" id="8729833695221589066">
                    <property name="nonStatic" nameId="yvor.521412098689998745:3" value="true" />
                    <link role="classifier" roleId="yvor.1170346070688:3" targetNodeId="46vv.~ActionListener" resolveInfo="ActionListener" />
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vhgx.~Object%d&lt;init&gt;()" resolveInfo="Object" />
                    <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="8729833695221589067" />
                    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="8729833695221589068">
                      <property name="isAbstract" nameId="yvor.1178608670077:3" value="false" />
                      <property name="name" nameId="yvnu.1169194664001:0" value="actionPerformed" />
                      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="8729833695221589069" />
                      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="8729833695221589070" />
                      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="8729833695221589071">
                        <property name="name" nameId="yvnu.1169194664001:0" value="p0" />
                        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8729833695221589072">
                          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="46vv.~ActionEvent" resolveInfo="ActionEvent" />
                        </node>
                      </node>
                      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8729833695221589073">
                        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589074">
                          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="8729833695221589075">
                            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8729833695221589184" resolveInfo="layoutGraph" />
                          </node>
                        </node>
                        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589076">
                          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589077">
                            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8729833695221619580">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588843" resolveInfo="myGraphLabel" />
                            </node>
                            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589079">
                              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Component%drepaint()%cvoid" resolveInfo="repaint" />
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
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589080">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221589081">
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589082">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589083">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589056" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="8729833695221589084">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dfill" resolveInfo="fill" />
              </node>
            </node>
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="8729833695221589085">
              <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="2uit.~GridBagConstraints" resolveInfo="GridBagConstraints" />
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2uit.~GridBagConstraints%dHORIZONTAL" resolveInfo="HORIZONTAL" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589086">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221589087">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="8729833695221589088">
              <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="2uit.~GridBagConstraints" resolveInfo="GridBagConstraints" />
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2uit.~GridBagConstraints%dFIRST_LINE_START" resolveInfo="FIRST_LINE_START" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589089">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589090">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589056" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="8729833695221589091">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%danchor" resolveInfo="anchor" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589092">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221589093">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8729833695221589094">
              <property name="value" nameId="yvor.1068580320021:3" value="0" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589095">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589096">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589056" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="8729833695221589097">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridx" resolveInfo="gridx" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589098">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221589099">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8729833695221589100">
              <property name="value" nameId="yvor.1068580320021:3" value="0" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589101">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589102">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589056" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="8729833695221589103">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridy" resolveInfo="gridy" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589104">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221589105">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8729833695221589106">
              <property name="value" nameId="yvor.1068580320021:3" value="1" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589107">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589108">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589056" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="8729833695221589109">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridwidth" resolveInfo="gridwidth" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589110">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221589111">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8729833695221589112">
              <property name="value" nameId="yvor.1068580320021:3" value="1" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589113">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589114">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589056" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="8729833695221589115">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridheight" resolveInfo="gridheight" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589116">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589117">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="8729833695221589118" />
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589119">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Container%dadd(java%dawt%dComponent)%cjava%dawt%dComponent" resolveInfo="add" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221619581">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589050" resolveInfo="button" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="8729833695221589121">
      <property name="name" nameId="yvnu.1169194664001:0" value="writeGraph" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="8729833695221589122" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="8729833695221589123" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8729833695221589124">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="8729833695221589125">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8729833695221589126">
            <property name="name" nameId="yvnu.1169194664001:0" value="edges" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.ListType" typeId="yvix.1151688443754:7" id="8729833695221589127">
              <node role="elementType" roleId="yvix.1151688676805:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8729833695221589128">
                <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="aequ.8567569493821103292" resolveInfo="Edge" />
              </node>
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589129">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="8729833695221589130">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589182" resolveInfo="graph" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589131">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.1654665216152485905" resolveInfo="getEdges" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589132">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589133">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8729833695221589134">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588840" resolveInfo="myTextArea" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589135">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="ko86.~JTextComponent%dsetText(java%dlang%dString)%cvoid" resolveInfo="setText" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="8729833695221589136">
                <property name="value" nameId="yvor.1070475926801:3" value="" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589137">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589138">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8729833695221589139">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588840" resolveInfo="myTextArea" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589140">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTextArea%dappend(java%dlang%dString)%cvoid" resolveInfo="append" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="8729833695221589141">
                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="8729833695221589142">
                  <property name="value" nameId="yvor.1070475926801:3" value="  \n" />
                </node>
                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="8729833695221589143">
                  <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="8729833695221589144">
                    <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589145">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="8729833695221589146">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589182" resolveInfo="graph" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589147">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.8567569493821112214" resolveInfo="getNumNodes" />
                      </node>
                    </node>
                    <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="8729833695221589148">
                      <property name="value" nameId="yvor.1070475926801:3" value=" " />
                    </node>
                  </node>
                  <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589149">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589150">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589126" resolveInfo="edges" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetSizeOperation" typeId="yvix.1162935959151:7" id="8729833695221589151" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvix.ForEachStatement" typeId="yvix.1153943597977:7" id="8729833695221589152">
          <node role="variable" roleId="yvix.1153944400369:7" type="yvix.ForEachVariable" typeId="yvix.1153944193378:7" id="8729833695221589153">
            <property name="name" nameId="yvnu.1169194664001:0" value="edge" />
          </node>
          <node role="inputSequence" roleId="yvix.1153944424730:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589154">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="8729833695221589155">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589182" resolveInfo="graph" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589156">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.1654665216152485905" resolveInfo="getEdges" />
            </node>
          </node>
          <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8729833695221589157">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589158">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589159">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8729833695221589160">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588840" resolveInfo="myTextArea" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589161">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTextArea%dappend(java%dlang%dString)%cvoid" resolveInfo="append" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="8729833695221589162">
                    <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="8729833695221589163">
                      <property name="value" nameId="yvor.1070475926801:3" value="  \n" />
                    </node>
                    <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="8729833695221589164">
                      <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="8729833695221589165">
                        <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589166">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589167">
                            <node role="operand" roleId="yvor.1197027771414:3" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="8729833695221589168">
                              <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="8729833695221589153" resolveInfo="edge" />
                            </node>
                            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589169">
                              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.8567569493821111981" resolveInfo="getSource" />
                            </node>
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589170">
                            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.4660430665333281569" resolveInfo="getIndex" />
                          </node>
                        </node>
                        <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="8729833695221589171">
                          <property name="value" nameId="yvor.1070475926801:3" value=" " />
                        </node>
                      </node>
                      <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589172">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589173">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="8729833695221589174">
                            <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="8729833695221589153" resolveInfo="edge" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589175">
                            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.8567569493821111989" resolveInfo="getTarget" />
                          </node>
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589176">
                          <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.4660430665333281569" resolveInfo="getIndex" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589177">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589178">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8729833695221589179">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588840" resolveInfo="myTextArea" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589180">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTextArea%dappend(java%dlang%dString)%cvoid" resolveInfo="append" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="8729833695221589181">
                <property name="value" nameId="yvor.1070475926801:3" value="\n\n 0 \n 0 \n" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="8729833695221589182">
        <property name="name" nameId="yvnu.1169194664001:0" value="graph" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8729833695221589183">
          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="aequ.8567569493821103298" resolveInfo="Graph" />
        </node>
      </node>
    </node>
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="8729833695221589184">
      <property name="name" nameId="yvnu.1169194664001:0" value="layoutGraph" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="8729833695221589185" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="8729833695221589186" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8729833695221589187">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.CommentedStatementsBlock" typeId="yvor.1177326519037:3" id="8729833695221589188">
          <node role="statement" roleId="yvor.1177326540772:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589189">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589190">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8729833695221589191">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588846" resolveInfo="myLayouter" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589192">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="kw11.6160477238666742402" resolveInfo="setLayoutLevel" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589193">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8729833695221589194">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588861" resolveInfo="myLayoutChoice" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589195">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8729833695221588602" resolveInfo="getSelectedLayoutLavel" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="8729833695221589196">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8729833695221589197">
            <property name="name" nameId="yvnu.1169194664001:0" value="scanner" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8729833695221589198">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="yjwb.~Scanner" resolveInfo="Scanner" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8729833695221589199">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="8729833695221589200">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Scanner%d&lt;init&gt;(java%dlang%dString)" resolveInfo="Scanner" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589201">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8729833695221589202">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588840" resolveInfo="myTextArea" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589203">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="ko86.~JTextComponent%dgetText()%cjava%dlang%dString" resolveInfo="getText" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="8729833695221589204">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8729833695221589205">
            <property name="name" nameId="yvnu.1169194664001:0" value="nodeDimensions" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.MapType" typeId="yvix.1197683403723:7" id="8729833695221589206">
              <node role="keyType" roleId="yvix.1197683466920:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8729833695221589207">
                <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="aequ.4671312709908983848" resolveInfo="Node" />
              </node>
              <node role="valueType" roleId="yvix.1197683475734:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="5639108013728303289">
                <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="4dwg.2301768597858221544" resolveInfo="Dimension" />
              </node>
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8729833695221589209">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvix.HashMapCreator" typeId="yvix.1197686869805:7" id="8729833695221589210">
                <node role="keyType" roleId="yvix.1197687026896:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8729833695221589211">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="aequ.4671312709908983848" resolveInfo="Node" />
                </node>
                <node role="valueType" roleId="yvix.1197687035757:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="5639108013728303291">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="4dwg.2301768597858221544" resolveInfo="Dimension" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="8729833695221589213">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8729833695221589214">
            <property name="name" nameId="yvnu.1169194664001:0" value="edgeDimensions" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.MapType" typeId="yvix.1197683403723:7" id="8729833695221589215">
              <node role="keyType" roleId="yvix.1197683466920:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8729833695221589216">
                <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="aequ.8567569493821103292" resolveInfo="Edge" />
              </node>
              <node role="valueType" roleId="yvix.1197683475734:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="5639108013728303290">
                <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="4dwg.2301768597858221544" resolveInfo="Dimension" />
              </node>
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8729833695221589218">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvix.HashMapCreator" typeId="yvix.1197686869805:7" id="8729833695221589219">
                <node role="keyType" roleId="yvix.1197687026896:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8729833695221589220">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="aequ.8567569493821103292" resolveInfo="Edge" />
                </node>
                <node role="valueType" roleId="yvix.1197687035757:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="5639108013728303292">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="4dwg.2301768597858221544" resolveInfo="Dimension" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="8729833695221589222">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8729833695221589223">
            <property name="name" nameId="yvnu.1169194664001:0" value="graph" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8729833695221589224">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="aequ.8567569493821103298" resolveInfo="Graph" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="8729833695221589225" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.TryCatchStatement" typeId="yvor.1164879751025:3" id="8729833695221589226">
          <node role="body" roleId="yvor.1164879758292:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8729833695221589227">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589228">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221589229">
                <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="8729833695221589230">
                  <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="1567683135099906914" resolveInfo="GraphIO" />
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1567683135099906915" resolveInfo="scanGraph" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589231">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589197" resolveInfo="scanner" />
                  </node>
                </node>
                <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589232">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589223" resolveInfo="g" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="8729833695221589233">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8729833695221589234">
                <property name="name" nameId="yvnu.1169194664001:0" value="numNodeSizes" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="8729833695221589235" />
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589236">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589237">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589197" resolveInfo="scanner" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589238">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Scanner%dnextInt()%cint" resolveInfo="nextInt" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ForStatement" typeId="yvor.1144231330558:3" id="8729833695221589239">
              <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8729833695221589240">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="8729833695221589241">
                  <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8729833695221589242">
                    <property name="name" nameId="yvnu.1169194664001:0" value="node" />
                    <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8729833695221589243">
                      <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="aequ.4671312709908983848" resolveInfo="Node" />
                    </node>
                    <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589244">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589245">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589223" resolveInfo="g" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589246">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.8567569493821112501" resolveInfo="getNode" />
                        <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589247">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589248">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589197" resolveInfo="scanner" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589249">
                            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Scanner%dnextInt()%cint" resolveInfo="nextInt" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589250">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221589251">
                    <node role="lValue" roleId="yvor.1068498886295:3" type="yvix.MapElement" typeId="yvix.1197932370469:7" id="8729833695221589252">
                      <node role="key" roleId="yvix.1197932525128:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589253">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589242" resolveInfo="node" />
                      </node>
                      <node role="map" roleId="yvix.1197932505799:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589254">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589205" resolveInfo="nodeDimensions" />
                      </node>
                    </node>
                    <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8729833695221589255">
                      <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="8729833695221589256">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="4dwg.2301768597858221546" resolveInfo="Dimension" />
                        <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589257">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589258">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589197" resolveInfo="scanner" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589259">
                            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Scanner%dnextInt()%cint" resolveInfo="nextInt" />
                          </node>
                        </node>
                        <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589260">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589261">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589197" resolveInfo="scanner" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589262">
                            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Scanner%dnextInt()%cint" resolveInfo="nextInt" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="variable" roleId="yvor.1144230900587:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8729833695221589263">
                <property name="name" nameId="yvnu.1169194664001:0" value="i" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="8729833695221589264" />
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8729833695221589265">
                  <property name="value" nameId="yvor.1068580320021:3" value="0" />
                </node>
              </node>
              <node role="condition" roleId="yvor.1144231399730:3" type="yvor.LessThanExpression" typeId="yvor.1081506773034:3" id="8729833695221589266">
                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589267">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589234" resolveInfo="numNodeSizes" />
                </node>
                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589268">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589263" resolveInfo="i" />
                </node>
              </node>
              <node role="iteration" roleId="yvor.1144231408325:3" type="yvor.PostfixIncrementExpression" typeId="yvor.1214918800624:3" id="8729833695221589269">
                <node role="expression" roleId="yvor.1239714902950:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589270">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589263" resolveInfo="i" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="8729833695221589271">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8729833695221589272">
                <property name="name" nameId="yvnu.1169194664001:0" value="edgeLabelSizes" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="8729833695221589273" />
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589274">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589275">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589197" resolveInfo="scanner" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589276">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Scanner%dnextInt()%cint" resolveInfo="nextInt" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ForStatement" typeId="yvor.1144231330558:3" id="8729833695221589277">
              <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8729833695221589278">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="8729833695221589279">
                  <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8729833695221589280">
                    <property name="name" nameId="yvnu.1169194664001:0" value="source" />
                    <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8729833695221589281">
                      <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="aequ.4671312709908983848" resolveInfo="Node" />
                    </node>
                    <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589282">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589283">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589223" resolveInfo="g" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589284">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.8567569493821112501" resolveInfo="getNode" />
                        <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589285">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589286">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589197" resolveInfo="scanner" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589287">
                            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Scanner%dnextInt()%cint" resolveInfo="nextInt" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="8729833695221589288">
                  <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8729833695221589289">
                    <property name="name" nameId="yvnu.1169194664001:0" value="target" />
                    <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8729833695221589290">
                      <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="aequ.4671312709908983848" resolveInfo="Node" />
                    </node>
                    <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589291">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589292">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589223" resolveInfo="g" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589293">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.8567569493821112501" resolveInfo="getNode" />
                        <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589294">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589295">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589197" resolveInfo="scanner" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589296">
                            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Scanner%dnextInt()%cint" resolveInfo="nextInt" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="8729833695221589297">
                  <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8729833695221589298">
                    <property name="name" nameId="yvnu.1169194664001:0" value="edge" />
                    <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8729833695221589299">
                      <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="aequ.8567569493821103292" resolveInfo="Edge" />
                    </node>
                    <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589300">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589301">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589302">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589303">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589280" resolveInfo="source" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589304">
                            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.8567569493821110932" resolveInfo="getOutEdges" />
                          </node>
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvix.WhereOperation" typeId="yvix.1202120902084:7" id="8729833695221589305">
                          <node role="closure" roleId="yvix.1204796294226:7" type="yviq.ClosureLiteral" typeId="yviq.1199569711397:3" id="8729833695221589306">
                            <node role="body" roleId="yviq.1199569916463:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8729833695221589307">
                              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589308">
                                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.EqualsExpression" typeId="yvor.1068580123152:3" id="8729833695221589309">
                                  <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589310">
                                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589289" resolveInfo="target" />
                                  </node>
                                  <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589311">
                                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="8729833695221589312">
                                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589314" resolveInfo="it" />
                                    </node>
                                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589313">
                                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.8567569493821111989" resolveInfo="getTarget" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node role="parameter" roleId="yviq.1199569906740:3" type="yvix.SmartClosureParameterDeclaration" typeId="yvix.1203518072036:7" id="8729833695221589314">
                              <property name="name" nameId="yvnu.1169194664001:0" value="it" />
                              <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.WildCardType" typeId="yvor.1171903607971:3" id="8729833695221589315" />
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetFirstOperation" typeId="yvix.1165525191778:7" id="8729833695221589316" />
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="8729833695221589317">
                  <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8729833695221589318">
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ThrowStatement" typeId="yvor.1164991038168:3" id="8729833695221589319">
                      <node role="throwable" roleId="yvor.1164991057263:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8729833695221589320">
                        <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="8729833695221589321">
                          <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vhgx.~IllegalArgumentException%d&lt;init&gt;(java%dlang%dString)" resolveInfo="IllegalArgumentException" />
                          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="8729833695221589322">
                            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589323">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589289" resolveInfo="target" />
                            </node>
                            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="8729833695221589324">
                              <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="8729833695221589325">
                                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="8729833695221589326">
                                  <property name="value" nameId="yvor.1070475926801:3" value="there is no edge " />
                                </node>
                                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589327">
                                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589280" resolveInfo="source" />
                                </node>
                              </node>
                              <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="8729833695221589328">
                                <property name="value" nameId="yvor.1070475926801:3" value=" -&gt; " />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition" roleId="yvor.1068580123160:3" type="yvor.EqualsExpression" typeId="yvor.1068580123152:3" id="8729833695221589329">
                    <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="8729833695221589330" />
                    <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589331">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589298" resolveInfo="edge" />
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589332">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221589333">
                    <node role="lValue" roleId="yvor.1068498886295:3" type="yvix.MapElement" typeId="yvix.1197932370469:7" id="8729833695221589334">
                      <node role="key" roleId="yvix.1197932525128:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589335">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589298" resolveInfo="edge" />
                      </node>
                      <node role="map" roleId="yvix.1197932505799:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589336">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589214" resolveInfo="edgeDimensions" />
                      </node>
                    </node>
                    <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8729833695221589337">
                      <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="8729833695221589338">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="4dwg.2301768597858221546" resolveInfo="Dimension" />
                        <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589339">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589340">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589197" resolveInfo="scanner" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589341">
                            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Scanner%dnextInt()%cint" resolveInfo="nextInt" />
                          </node>
                        </node>
                        <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589342">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589343">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589197" resolveInfo="scanner" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589344">
                            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Scanner%dnextInt()%cint" resolveInfo="nextInt" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="variable" roleId="yvor.1144230900587:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8729833695221589345">
                <property name="name" nameId="yvnu.1169194664001:0" value="i" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="8729833695221589346" />
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8729833695221589347">
                  <property name="value" nameId="yvor.1068580320021:3" value="0" />
                </node>
              </node>
              <node role="condition" roleId="yvor.1144231399730:3" type="yvor.LessThanExpression" typeId="yvor.1081506773034:3" id="8729833695221589348">
                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589349">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589272" resolveInfo="edgeLabelSizes" />
                </node>
                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589350">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589345" resolveInfo="i" />
                </node>
              </node>
              <node role="iteration" roleId="yvor.1144231408325:3" type="yvor.PostfixIncrementExpression" typeId="yvor.1214918800624:3" id="8729833695221589351">
                <node role="expression" roleId="yvor.1239714902950:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589352">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589345" resolveInfo="i" />
                </node>
              </node>
            </node>
          </node>
          <node role="catchClause" roleId="yvor.1164903496223:3" type="yvor.CatchClause" typeId="yvor.1164903280175:3" id="8729833695221589353">
            <node role="throwable" roleId="yvor.1164903359217:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8729833695221589354">
              <property name="name" nameId="yvnu.1169194664001:0" value="e" />
              <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8729833695221589355">
                <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~IllegalArgumentException" resolveInfo="IllegalArgumentException" />
              </node>
            </node>
            <node role="catchBody" roleId="yvor.1164903359218:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8729833695221589356">
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589357">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="8729833695221589358">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JOptionPane%dshowMessageDialog(java%dawt%dComponent,java%dlang%dObject)%cvoid" resolveInfo="showMessageDialog" />
                  <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="t147.~JOptionPane" resolveInfo="JOptionPane" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="8729833695221589359" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="8729833695221589360">
                    <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589361">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589354" resolveInfo="e" />
                    </node>
                    <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="8729833695221589362">
                      <property name="value" nameId="yvor.1070475926801:3" value="something is wrong in graph notation...\n" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="8729833695221589363">
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8729833695221589364">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvix.ForEachStatement" typeId="yvix.1153943597977:7" id="8729833695221589365">
              <node role="variable" roleId="yvix.1153944400369:7" type="yvix.ForEachVariable" typeId="yvix.1153944193378:7" id="8729833695221589366">
                <property name="name" nameId="yvnu.1169194664001:0" value="node" />
              </node>
              <node role="inputSequence" roleId="yvix.1153944424730:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589367">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589368">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589223" resolveInfo="g" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589369">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.8567569493821107956" resolveInfo="getNodes" />
                </node>
              </node>
              <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8729833695221589370">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="8729833695221589371">
                  <node role="condition" roleId="yvor.1068580123160:3" type="yvor.EqualsExpression" typeId="yvor.1068580123152:3" id="8729833695221589372">
                    <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="8729833695221589373" />
                    <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvix.MapElement" typeId="yvix.1197932370469:7" id="8729833695221589374">
                      <node role="key" roleId="yvix.1197932525128:7" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="8729833695221589375">
                        <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="8729833695221589366" resolveInfo="node" />
                      </node>
                      <node role="map" roleId="yvix.1197932505799:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589376">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589205" resolveInfo="nodeDimensions" />
                      </node>
                    </node>
                  </node>
                  <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8729833695221589377">
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589378">
                      <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221589379">
                        <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8729833695221589380">
                          <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="8729833695221589381">
                            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="4dwg.2301768597858221546" resolveInfo="Dimension" />
                            <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="8729833695221589382">
                              <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="8729833695221588600" resolveInfo="OrthogonalLayoutTestPanel" />
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589599" resolveInfo="DEFAULT_NODE_SIZE" />
                            </node>
                            <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="8729833695221589383">
                              <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8729833695221589384">
                                <property name="value" nameId="yvor.1068580320021:3" value="10" />
                              </node>
                              <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="8729833695221589385">
                                <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="8729833695221588600" resolveInfo="OrthogonalLayoutTestPanel" />
                                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589599" resolveInfo="DEFAULT_NODE_SIZE" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="lValue" roleId="yvor.1068498886295:3" type="yvix.MapElement" typeId="yvix.1197932370469:7" id="8729833695221589386">
                          <node role="key" roleId="yvix.1197932525128:7" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="8729833695221589387">
                            <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="8729833695221589366" resolveInfo="node" />
                          </node>
                          <node role="map" roleId="yvix.1197932505799:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589388">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589205" resolveInfo="nodeDimensions" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="8729833695221589389">
              <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8729833695221589390">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvix.ForEachStatement" typeId="yvix.1153943597977:7" id="8729833695221589391">
                  <node role="variable" roleId="yvix.1153944400369:7" type="yvix.ForEachVariable" typeId="yvix.1153944193378:7" id="8729833695221589392">
                    <property name="name" nameId="yvnu.1169194664001:0" value="edge" />
                  </node>
                  <node role="inputSequence" roleId="yvix.1153944424730:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589393">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589394">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589223" resolveInfo="g" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589395">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="aequ.1654665216152485905" resolveInfo="getEdges" />
                    </node>
                  </node>
                  <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8729833695221589396">
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="8729833695221589397">
                      <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8729833695221589398">
                        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589399">
                          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221589400">
                            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8729833695221589401">
                              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="8729833695221589402">
                                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="4dwg.2301768597858221546" resolveInfo="Dimension" />
                                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="8729833695221589403">
                                  <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="8729833695221588600" resolveInfo="OrthogonalLayoutTestPanel" />
                                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589603" resolveInfo="DEFAULT_EDGE_X_SIZE" />
                                </node>
                                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="8729833695221589404">
                                  <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="8729833695221588600" resolveInfo="OrthogonalLayoutTestPanel" />
                                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589607" resolveInfo="DEFAULT_EDGE_Y_SIZE" />
                                </node>
                              </node>
                            </node>
                            <node role="lValue" roleId="yvor.1068498886295:3" type="yvix.MapElement" typeId="yvix.1197932370469:7" id="8729833695221589405">
                              <node role="key" roleId="yvix.1197932525128:7" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="8729833695221589406">
                                <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="8729833695221589392" resolveInfo="edge" />
                              </node>
                              <node role="map" roleId="yvix.1197932505799:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589407">
                                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589214" resolveInfo="edgeDimensions" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotExpression" typeId="yvor.1081516740877:3" id="8729833695221589408">
                        <node role="expression" roleId="yvor.1081516765348:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589409">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589410">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589214" resolveInfo="edgeDimensions" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvix.ContainsKeyOperation" typeId="yvix.1201306600024:7" id="8729833695221589411">
                            <node role="key" roleId="yvix.1201654602639:7" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="8729833695221589412">
                              <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="8729833695221589392" resolveInfo="edge" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589413">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8729833695221589414">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588861" resolveInfo="myLayoutChoice" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589415">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8729833695221588608" resolveInfo="isSetLabels" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="8729833695221589416">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8729833695221589417">
                <property name="name" nameId="yvnu.1169194664001:0" value="layoutInfo" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8729833695221589418">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="rm96.194249616896430087" resolveInfo="LayoutInfo" />
                </node>
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8729833695221589419">
                  <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="8729833695221589420">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="rm96.194249616896430089" resolveInfo="LayoutInfo" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589421">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589223" resolveInfo="g" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvix.ForEachStatement" typeId="yvix.1153943597977:7" id="8729833695221589422">
              <node role="variable" roleId="yvix.1153944400369:7" type="yvix.ForEachVariable" typeId="yvix.1153944193378:7" id="8729833695221589423">
                <property name="name" nameId="yvnu.1169194664001:0" value="node" />
              </node>
              <node role="inputSequence" roleId="yvix.1153944424730:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589424">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589425">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589205" resolveInfo="nodeDimensions" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetKeysOperation" typeId="yvix.1201872418428:7" id="8729833695221589426" />
              </node>
              <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8729833695221589427">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589428">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589429">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589430">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589417" resolveInfo="layoutInfo" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589431">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="rm96.194249616896430121" resolveInfo="setNodeSize" />
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="8729833695221589432">
                        <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="8729833695221589423" resolveInfo="node" />
                      </node>
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvix.MapElement" typeId="yvix.1197932370469:7" id="8729833695221589433">
                        <node role="key" roleId="yvix.1197932525128:7" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="8729833695221589434">
                          <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="8729833695221589423" resolveInfo="node" />
                        </node>
                        <node role="map" roleId="yvix.1197932505799:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589435">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589205" resolveInfo="nodeDimensions" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvix.ForEachStatement" typeId="yvix.1153943597977:7" id="8729833695221589436">
              <node role="variable" roleId="yvix.1153944400369:7" type="yvix.ForEachVariable" typeId="yvix.1153944193378:7" id="8729833695221589437">
                <property name="name" nameId="yvnu.1169194664001:0" value="edge" />
              </node>
              <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8729833695221589438">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589439">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589440">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589441">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589417" resolveInfo="layoutInfo" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589442">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="rm96.194249616896430140" resolveInfo="setLabelSize" />
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="8729833695221589443">
                        <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="8729833695221589437" resolveInfo="edge" />
                      </node>
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvix.MapElement" typeId="yvix.1197932370469:7" id="8729833695221589444">
                        <node role="key" roleId="yvix.1197932525128:7" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="8729833695221589445">
                          <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="8729833695221589437" resolveInfo="edge" />
                        </node>
                        <node role="map" roleId="yvix.1197932505799:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589446">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589214" resolveInfo="edgeDimensions" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="inputSequence" roleId="yvix.1153944424730:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589447">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589448">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589214" resolveInfo="edgeDimensions" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetKeysOperation" typeId="yvix.1201872418428:7" id="8729833695221589449" />
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589450">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221589451">
                <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589452">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8729833695221589453">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588846" resolveInfo="myLayouter" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589454">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="kw11.903391227141136173" resolveInfo="doLayout" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221619591">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589223" resolveInfo="g" />
                    </node>
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221619587">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589205" resolveInfo="nodeDimensions" />
                    </node>
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221619589">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589214" resolveInfo="edgeDimensions" />
                    </node>
                  </node>
                </node>
                <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8729833695221589456">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588852" resolveInfo="myCurrentLayout" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.CommentedStatementsBlock" typeId="yvor.1177326519037:3" id="8729833695221589457">
              <node role="statement" roleId="yvor.1177326540772:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589458">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="8729833695221589459">
                  <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="ms8h.5488345258545703420" resolveInfo="OrthogonalLayoutChecker" />
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="ms8h.1265453300920882198" resolveInfo="checkLayout" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8729833695221589460">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588852" resolveInfo="myCurrentLayout" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotEqualsExpression" typeId="yvor.1073239437375:3" id="8729833695221589461">
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="8729833695221589462" />
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589463">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589223" resolveInfo="g" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="8729833695221589464">
      <property name="name" nameId="yvnu.1169194664001:0" value="createTextPanel" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="8729833695221589465" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="8729833695221589466" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8729833695221589467">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589468">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221589469">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8729833695221589470">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="8729833695221589471">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTextArea%d&lt;init&gt;(int,int)" resolveInfo="JTextArea" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8729833695221589472">
                  <property name="value" nameId="yvor.1068580320021:3" value="20" />
                </node>
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8729833695221589473">
                  <property name="value" nameId="yvor.1068580320021:3" value="20" />
                </node>
              </node>
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8729833695221589474">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588840" resolveInfo="myTextArea" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589475">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589476">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8729833695221589477">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588840" resolveInfo="myTextArea" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589478">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JComponent%dsetBorder(javax%dswing%dborder%dBorder)%cvoid" resolveInfo="setBorder" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="8729833695221589479">
                <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="t147.~BorderFactory" resolveInfo="BorderFactory" />
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~BorderFactory%dcreateTitledBorder(java%dlang%dString)%cjavax%dswing%dborder%dTitledBorder" resolveInfo="createTitledBorder" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="8729833695221589480">
                  <property name="value" nameId="yvor.1070475926801:3" value="enter graph here" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="8729833695221589481">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8729833695221589482">
            <property name="name" nameId="yvnu.1169194664001:0" value="c" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8729833695221589483">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~GridBagConstraints" resolveInfo="GridBagConstraints" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8729833695221589484">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="8729833695221589485">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~GridBagConstraints%d&lt;init&gt;()" resolveInfo="GridBagConstraints" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589486">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221589487">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="8729833695221589488">
              <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="2uit.~GridBagConstraints" resolveInfo="GridBagConstraints" />
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2uit.~GridBagConstraints%dVERTICAL" resolveInfo="VERTICAL" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589489">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589490">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589482" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="8729833695221589491">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dfill" resolveInfo="fill" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589492">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221589493">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="8729833695221589494">
              <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="2uit.~GridBagConstraints" resolveInfo="GridBagConstraints" />
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2uit.~GridBagConstraints%dREMAINDER" resolveInfo="REMAINDER" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589495">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589496">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589482" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="8729833695221589497">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridheight" resolveInfo="gridheight" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589498">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221589499">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8729833695221589500">
              <property name="value" nameId="yvor.1068580320021:3" value="0" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589501">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589502">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589482" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="8729833695221589503">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridx" resolveInfo="gridx" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589504">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221589505">
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589506">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589507">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589482" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="8729833695221589508">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridy" resolveInfo="gridy" />
              </node>
            </node>
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8729833695221589509">
              <property name="value" nameId="yvor.1068580320021:3" value="1" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589510">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221589511">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8729833695221589512">
              <property name="value" nameId="yvor.1068580320021:3" value="1" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589513">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589514">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589482" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="8729833695221589515">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dweighty" resolveInfo="weighty" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589516">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589517">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="8729833695221589518" />
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589519">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Container%dadd(java%dawt%dComponent,java%dlang%dObject)%cvoid" resolveInfo="add" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8729833695221589520">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588840" resolveInfo="myTextArea" />
              </node>
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589521">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589482" resolveInfo="c" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="8729833695221589522">
      <property name="name" nameId="yvnu.1169194664001:0" value="createGraphPanel" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="8729833695221589523" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="8729833695221589524" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8729833695221589525">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589526">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221589527">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8729833695221589528">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="8729833695221589529">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8729833695221588807" resolveInfo="OrthogonalLayoutTestPanel.MyGraphLabel" />
              </node>
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8729833695221589530">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588843" resolveInfo="myGraphLabel" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589531">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589532">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8729833695221589533">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588843" resolveInfo="myGraphLabel" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589534">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JComponent%dsetBorder(javax%dswing%dborder%dBorder)%cvoid" resolveInfo="setBorder" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="8729833695221619582">
                <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="t147.~BorderFactory" resolveInfo="BorderFactory" />
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~BorderFactory%dcreateTitledBorder(java%dlang%dString)%cjavax%dswing%dborder%dTitledBorder" resolveInfo="createTitledBorder" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="8729833695221619583">
                  <property name="value" nameId="yvor.1070475926801:3" value="graph layout" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="8729833695221589537">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8729833695221589538">
            <property name="name" nameId="yvnu.1169194664001:0" value="c" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8729833695221589539">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~GridBagConstraints" resolveInfo="GridBagConstraints" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8729833695221589540">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="8729833695221589541">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~GridBagConstraints%d&lt;init&gt;()" resolveInfo="GridBagConstraints" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589542">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221589543">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="8729833695221589544">
              <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="2uit.~GridBagConstraints" resolveInfo="GridBagConstraints" />
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2uit.~GridBagConstraints%dBOTH" resolveInfo="BOTH" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589545">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589546">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589538" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="8729833695221589547">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dfill" resolveInfo="fill" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589548">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221589549">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="8729833695221589550">
              <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="2uit.~GridBagConstraints" resolveInfo="GridBagConstraints" />
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2uit.~GridBagConstraints%dREMAINDER" resolveInfo="REMAINDER" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589551">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589552">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589538" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="8729833695221589553">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridwidth" resolveInfo="gridwidth" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589554">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221589555">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="8729833695221589556">
              <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="2uit.~GridBagConstraints" resolveInfo="GridBagConstraints" />
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2uit.~GridBagConstraints%dREMAINDER" resolveInfo="REMAINDER" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589557">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589558">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589538" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="8729833695221589559">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridheight" resolveInfo="gridheight" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589560">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221589561">
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589562">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589563">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589538" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="8729833695221589564">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridx" resolveInfo="gridx" />
              </node>
            </node>
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8729833695221589565">
              <property name="value" nameId="yvor.1068580320021:3" value="1" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589566">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221589567">
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589568">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589569">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589538" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="8729833695221589570">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dgridy" resolveInfo="gridy" />
              </node>
            </node>
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8729833695221589571">
              <property name="value" nameId="yvor.1068580320021:3" value="1" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589572">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221589573">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8729833695221589574">
              <property name="value" nameId="yvor.1068580320021:3" value="1" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589575">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589576">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589538" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="8729833695221589577">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dweightx" resolveInfo="weightx" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589578">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221589579">
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589580">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589581">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589538" resolveInfo="c" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="8729833695221589582">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2uit.~GridBagConstraints%dweightx" resolveInfo="weightx" />
              </node>
            </node>
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8729833695221589583">
              <property name="value" nameId="yvor.1068580320021:3" value="1" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589584">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589585">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="8729833695221589586" />
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589587">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Container%dadd(java%dawt%dComponent,java%dlang%dObject)%cvoid" resolveInfo="add" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8729833695221589588">
                <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="8729833695221589589">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JScrollPane%d&lt;init&gt;(java%dawt%dComponent)" resolveInfo="JScrollPane" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8729833695221589590">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588843" resolveInfo="myGraphLabel" />
                  </node>
                </node>
              </node>
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589591">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589538" resolveInfo="c" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticField" roleId="yvor.1128555889557:3" type="yvor.StaticFieldDeclaration" typeId="yvor.1070462154015:3" id="8729833695221589592">
      <property name="name" nameId="yvnu.1169194664001:0" value="FRAME_DIMENSION" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="8729833695221589593" />
      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8729833695221589594">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~Dimension" resolveInfo="Dimension" />
      </node>
      <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8729833695221589595">
        <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="8729833695221589596">
          <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Dimension%d&lt;init&gt;(int,int)" resolveInfo="Dimension" />
          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8729833695221589597">
            <property name="value" nameId="yvor.1068580320021:3" value="800" />
          </node>
          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8729833695221589598">
            <property name="value" nameId="yvor.1068580320021:3" value="600" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticField" roleId="yvor.1128555889557:3" type="yvor.StaticFieldDeclaration" typeId="yvor.1070462154015:3" id="8729833695221589599">
      <property name="name" nameId="yvnu.1169194664001:0" value="DEFAULT_NODE_SIZE" />
      <property name="isFinal" nameId="yvor.1176718929932:3" value="true" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="8729833695221589600" />
      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="8729833695221589601" />
      <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8729833695221589602">
        <property name="value" nameId="yvor.1068580320021:3" value="30" />
      </node>
    </node>
    <node role="staticField" roleId="yvor.1128555889557:3" type="yvor.StaticFieldDeclaration" typeId="yvor.1070462154015:3" id="8729833695221589603">
      <property name="isFinal" nameId="yvor.1176718929932:3" value="true" />
      <property name="name" nameId="yvnu.1169194664001:0" value="DEFAULT_EDGE_X_SIZE" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="8729833695221589604" />
      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="8729833695221589605" />
      <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8729833695221589606">
        <property name="value" nameId="yvor.1068580320021:3" value="70" />
      </node>
    </node>
    <node role="staticField" roleId="yvor.1128555889557:3" type="yvor.StaticFieldDeclaration" typeId="yvor.1070462154015:3" id="8729833695221589607">
      <property name="isFinal" nameId="yvor.1176718929932:3" value="true" />
      <property name="name" nameId="yvnu.1169194664001:0" value="DEFAULT_EDGE_Y_SIZE" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="8729833695221589608" />
      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="8729833695221589609" />
      <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8729833695221589610">
        <property name="value" nameId="yvor.1068580320021:3" value="35" />
      </node>
    </node>
    <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="8729833695221589611" />
    <node role="constructor" roleId="yvor.1068390468201:3" type="yvor.ConstructorDeclaration" typeId="yvor.1068580123140:3" id="8729833695221589612">
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="8729833695221589613" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="8729833695221589614" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8729833695221589615">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589713">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="8729833695221589714">
            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Container%dsetLayout(java%dawt%dLayoutManager)%cvoid" resolveInfo="setLayout" />
            <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8729833695221589715">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="8729833695221619574">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~GridBagLayout%d&lt;init&gt;()" resolveInfo="GridBagLayout" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589622">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="8729833695221589623">
            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8729833695221589045" resolveInfo="createDoLayoutButton" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589624">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="8729833695221589625">
            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8729833695221588901" resolveInfo="createNewGraphButton" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589626">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="8729833695221589627">
            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8729833695221588864" resolveInfo="createLayoutChoiceButtons" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589628">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="8729833695221589629">
            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8729833695221589464" resolveInfo="createTextPanel" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589630">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalInstanceMethodCall" typeId="yvor.3066917033203108594:3" id="8729833695221589631">
            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8729833695221589522" resolveInfo="createGraphPanel" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.CommentedStatementsBlock" typeId="yvor.1177326519037:3" id="8729833695221589632">
          <node role="statement" roleId="yvor.1177326540772:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589633">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221589634">
              <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8729833695221589635">
                <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="8729833695221589636">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="kw11.903391227141136169" resolveInfo="RectOrthogonalLayouter" />
                </node>
              </node>
              <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8729833695221589637">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588846" resolveInfo="myLayouter" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589638">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221589639">
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8729833695221589640">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588846" resolveInfo="myLayouter" />
            </node>
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8729833695221589641">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="8729833695221589642">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="kw11.903391227141136169" resolveInfo="RectOrthogonalLayouter" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.CommentedStatementsBlock" typeId="yvor.1177326519037:3" id="8729833695221589643">
          <node role="statement" roleId="yvor.1177326540772:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589644">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589645">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8729833695221589646">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588846" resolveInfo="myLayouter" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589647">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="kw11.1418350014056263386" resolveInfo="setEdgeDistance" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="8729833695221589648">
                  <property name="value" nameId="yvor.1068580320021:3" value="20" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589649">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221589650">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="8729833695221589651" />
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8729833695221589652">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588852" resolveInfo="myCurrentLayout" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589653">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8729833695221589654">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8729833695221589655">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="8729833695221589656">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="903391227141130076" resolveInfo="LayoutPainter" />
              </node>
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalInstanceFieldReference" typeId="yvor.7785501532031639928:3" id="8729833695221589657">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221588849" resolveInfo="myPainter" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="superclass" roleId="yvor.1165602531693:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8729833695221589658">
      <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="t147.~JPanel" resolveInfo="JPanel" />
    </node>
    <node role="staticMethod" roleId="yvor.1070462273904:3" type="yvor.StaticMethodDeclaration" typeId="yvor.1081236700938:3" id="8729833695221589659">
      <property name="name" nameId="yvnu.1169194664001:0" value="create" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="8729833695221589660" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="8729833695221589661" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8729833695221589662">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="8729833695221589663">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8729833695221589664">
            <property name="name" nameId="yvnu.1169194664001:0" value="frame" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8729833695221589665">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="t147.~JFrame" resolveInfo="JFrame" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8729833695221589666">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="8729833695221589667">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JFrame%d&lt;init&gt;()" resolveInfo="JFrame" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589668">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589669">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589670">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589664" resolveInfo="frame" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589671">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JFrame%dsetDefaultCloseOperation(int)%cvoid" resolveInfo="setDefaultCloseOperation" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="8729833695221589672">
                <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="t147.~JFrame" resolveInfo="JFrame" />
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="t147.~JFrame%dEXIT_ON_CLOSE" resolveInfo="EXIT_ON_CLOSE" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589673">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589674">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589675">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589664" resolveInfo="frame" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589676">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Container%dadd(java%dawt%dComponent)%cjava%dawt%dComponent" resolveInfo="add" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8729833695221589677">
                <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="8729833695221589678">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8729833695221589612" resolveInfo="OrthogonalLayoutTestPanel" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589679">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589680">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589681">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589664" resolveInfo="frame" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589682">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Window%dsetMinimumSize(java%dawt%dDimension)%cvoid" resolveInfo="setMinimumSize" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="8729833695221589683">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589592" resolveInfo="FRAME_DIMENSION" />
                <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="8729833695221588600" resolveInfo="OrthogonalLayoutTestPanel" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589684">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589685">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589686">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589664" resolveInfo="frame" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589687">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Window%dpack()%cvoid" resolveInfo="pack" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589688">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8729833695221589689">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8729833695221589690">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8729833695221589664" resolveInfo="frame" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8729833695221589691">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Window%dsetVisible(boolean)%cvoid" resolveInfo="setVisible" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="8729833695221589692">
                <property name="value" nameId="yvor.1068580123138:3" value="true" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" roleId="yvor.1070462273904:3" type="yvor.StaticMethodDeclaration" typeId="yvor.1081236700938:3" id="8729833695221589693">
      <property name="name" nameId="yvnu.1169194664001:0" value="main" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="8729833695221589694" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="8729833695221589695" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8729833695221589696">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589697">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="8729833695221589698">
            <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="t147.~SwingUtilities" resolveInfo="SwingUtilities" />
            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~SwingUtilities%dinvokeLater(java%dlang%dRunnable)%cvoid" resolveInfo="invokeLater" />
            <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8729833695221589699">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.AnonymousClassCreator" typeId="yvor.1182160077978:3" id="8729833695221589700">
                <node role="cls" roleId="yvor.1182160096073:3" type="yvor.AnonymousClass" typeId="yvor.1170345865475:3" id="8729833695221589701">
                  <property name="nonStatic" nameId="yvor.521412098689998745:3" value="true" />
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vhgx.~Object%d&lt;init&gt;()" resolveInfo="Object" />
                  <link role="classifier" roleId="yvor.1170346070688:3" targetNodeId="vhgx.~Runnable" resolveInfo="Runnable" />
                  <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="8729833695221589702" />
                  <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="8729833695221589703">
                    <property name="isAbstract" nameId="yvor.1178608670077:3" value="false" />
                    <property name="name" nameId="yvnu.1169194664001:0" value="run" />
                    <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="8729833695221589704" />
                    <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="8729833695221589705" />
                    <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8729833695221589706">
                      <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8729833695221589707">
                        <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalStaticMethodCall" typeId="yvor.1172058436953:3" id="8729833695221589708">
                          <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8729833695221589659" resolveInfo="create" />
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
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="8729833695221589709">
        <property name="name" nameId="yvnu.1169194664001:0" value="args" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ArrayType" typeId="yvor.1070534760951:3" id="8729833695221589710">
          <node role="componentType" roleId="yvor.1070534760952:3" type="yvor.StringType" typeId="yvor.1225271177708:3" id="8729833695221589711" />
        </node>
      </node>
    </node>
  </root>
</model>

