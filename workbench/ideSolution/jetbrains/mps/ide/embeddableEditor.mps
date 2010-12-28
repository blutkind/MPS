<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:00000000-0000-4000-0000-011c895904a6(jetbrains.mps.ide.embeddableEditor)">
  <persistence version="7" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="7866978e-a0f0-4cc7-81bc-4d213d9375e1(jetbrains.mps.lang.smodel)" />
  <language namespace="28f9e497-3b42-4291-aeba-0a1039153ab1(jetbrains.mps.lang.plugin)" />
  <language namespace="83888646-71ce-4f1c-9c53-c54016f6ad4f(jetbrains.mps.baseLanguage.collections)" />
  <language namespace="d745e97c-8235-4470-b086-ba3da1f4c03c(jetbrains.mps.quickQueryLanguage)" />
  <language namespace="a247e09e-2435-45ba-b8d2-07e93feba96a(jetbrains.mps.baseLanguage.tuples)" />
  <language namespace="fd392034-7849-419d-9071-12563d152375(jetbrains.mps.baseLanguage.closures)" />
  <import index="i09a" modelUID="f:java_stub#javax.swing(javax.swing@java_stub)" version="-1" />
  <import index="5p1m" modelUID="f:java_stub#java.awt(java.awt@java_stub)" version="-1" />
  <import index="d8ec" modelUID="f:java_stub#jetbrains.mps.smodel(jetbrains.mps.smodel@java_stub)" version="-1" />
  <import index="mwyq" modelUID="f:java_stub#java.lang(java.lang@java_stub)" version="-1" />
  <import index="50zc" modelUID="f:java_stub#jetbrains.mps.generator.generationTypes(jetbrains.mps.generator.generationTypes@java_stub)" version="-1" />
  <import index="1bbd" modelUID="f:java_stub#jetbrains.mps.workbench.editors(jetbrains.mps.workbench.editors@java_stub)" version="-1" />
  <import index="v3up" modelUID="f:java_stub#jetbrains.mps.workbench.nodesFs(jetbrains.mps.workbench.nodesFs@java_stub)" version="-1" />
  <import index="ll11" modelUID="f:java_stub#com.intellij.openapi.actionSystem(com.intellij.openapi.actionSystem@java_stub)" version="-1" />
  <import index="qvoq" modelUID="f:java_stub#org.jetbrains.annotations(org.jetbrains.annotations@java_stub)" version="-1" />
  <import index="jvm9" modelUID="f:java_stub#jetbrains.mps.workbench(jetbrains.mps.workbench@java_stub)" version="-1" />
  <import index="nubx" modelUID="f:java_stub#jetbrains.mps.library(jetbrains.mps.library@java_stub)" version="-1" />
  <import index="ejwt" modelUID="f:java_stub#jetbrains.mps.compiler(jetbrains.mps.compiler@java_stub)" version="-1" />
  <import index="fo3f" modelUID="f:java_stub#jetbrains.mps.reloading(jetbrains.mps.reloading@java_stub)" version="-1" />
  <import index="t1ti" modelUID="f:java_stub#java.util(java.util@java_stub)" version="-1" />
  <import index="664" modelUID="f:java_stub#jetbrains.mps.ide(jetbrains.mps.ide@java_stub)" version="-1" />
  <import index="a0xp" modelUID="f:java_stub#jetbrains.mps.nodeEditor(jetbrains.mps.nodeEditor@java_stub)" version="-1" />
  <import index="b2e1" modelUID="f:java_stub#jetbrains.mps.smodel.descriptor(jetbrains.mps.smodel.descriptor@java_stub)" version="-1" />
  <import index="t5t" modelUID="f:java_stub#jetbrains.mps.ide.generator(jetbrains.mps.ide.generator@java_stub)" version="-1" />
  <import index="tpee" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" implicit="yes" />
  <import index="tp25" modelUID="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.lang.smodel.structure)" version="16" implicit="yes" />
  <import index="tp2c" modelUID="r:00000000-0000-4000-0000-011c89590338(jetbrains.mps.baseLanguage.closures.structure)" version="3" implicit="yes" />
  <import index="tpck" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" implicit="yes" />
  <import index="tp4k" modelUID="r:00000000-0000-4000-0000-011c89590368(jetbrains.mps.lang.plugin.structure)" version="23" implicit="yes" />
  <import index="tp2q" modelUID="r:00000000-0000-4000-0000-011c8959032e(jetbrains.mps.baseLanguage.collections.structure)" version="7" implicit="yes" />
  <import index="tpru" modelUID="r:00000000-0000-4000-0000-011c895904a6(jetbrains.mps.ide.embeddableEditor)" version="-1" implicit="yes" />
  <import index="jt7v" modelUID="f:java_stub#jetbrains.mps.project(jetbrains.mps.project@java_stub)" version="-1" implicit="yes" />
  <roots>
    <node type="tpee.ClassConcept" typeId="tpee.1068390468198" id="1219405202223">
      <property name="name" nameId="tpck.1169194664001" value="EmbeddableEditor" />
    </node>
    <node type="tpee.ClassConcept" typeId="tpee.1068390468198" id="1219411663047">
      <property name="name" nameId="tpck.1169194664001" value="GenerationResult" />
    </node>
    <node type="tpee.ClassConcept" typeId="tpee.1068390468198" id="1220433141274">
      <property name="name" nameId="tpck.1169194664001" value="EmbeddableEditorPanel" />
    </node>
  </roots>
  <root id="1219405202223">
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="199149364782662172">
      <property name="name" nameId="tpck.1169194664001" value="setNode" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="199149364782662173" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="199149364782662176" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="199149364782662175">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="199149364782675495">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="199149364782675499">
            <node role="rValue" roleId="tpee.1068498886297" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="199149364782675502">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="199149364782662177" resolveInfo="rootNode" />
            </node>
            <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="8692480643148204920">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="199149364782660330" resolveInfo="myRootNode" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="199149364782662184">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="199149364782662185">
            <node role="rValue" roleId="tpee.1068498886297" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="199149364782675493">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="199149364782662179" resolveInfo="targetNode" />
            </node>
            <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="8692480643148204498">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1219408375970" resolveInfo="myNode" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="276193728322519114">
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="276193728322519115">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="5720687632037741505">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="5720687632037741506">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="5720687632037741507">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="5720687632037741508">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1219408476932" resolveInfo="myModel" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="5720687632037741509">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="d8ec.~SModelDescriptor%dgetSModel()%cjetbrains%dmps%dsmodel%dSModel" resolveInfo="getSModel" />
                  </node>
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="5720687632037741510">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="d8ec.~SModel%drunLoadingAction(java%dlang%dRunnable)%cvoid" resolveInfo="runLoadingAction" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="5720687632037741511">
                    <node role="creator" roleId="tpee.1145553007750" type="tpee.AnonymousClassCreator" typeId="tpee.1182160077978" id="5720687632037741512">
                      <node role="cls" roleId="tpee.1182160096073" type="tpee.AnonymousClass" typeId="tpee.1170345865475" id="5720687632037741513">
                        <link role="classifier" roleId="tpee.1170346070688" targetNodeId="mwyq.~Runnable" resolveInfo="Runnable" />
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="mwyq.~Object%d&lt;init&gt;()" resolveInfo="Object" />
                        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="5720687632037741514" />
                        <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="5720687632037741515">
                          <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
                          <property name="name" nameId="tpck.1169194664001" value="run" />
                          <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="5720687632037741516" />
                          <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="5720687632037741517" />
                          <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="5720687632037741518">
                            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="5720687632037741519">
                              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="5720687632037741520">
                                <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="5720687632037741521">
                                  <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="5720687632037741522">
                                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1219408476932" resolveInfo="myModel" />
                                  </node>
                                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="5720687632037741523">
                                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="d8ec.~SModelDescriptor%dgetSModel()%cjetbrains%dmps%dsmodel%dSModel" resolveInfo="getSModel" />
                                  </node>
                                </node>
                                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="5720687632037741524">
                                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="d8ec.~SModel%daddRoot(jetbrains%dmps%dsmodel%dSNode)%cvoid" resolveInfo="addRoot" />
                                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="5720687632037741525">
                                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="199149364782662177" resolveInfo="rootNode" />
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
          <node role="condition" roleId="tpee.1068580123160" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="276193728322519118">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="276193728322519106" resolveInfo="addToModel" />
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="199149364782662217">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="199149364782662218">
            <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="8692480643148204666">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1220438174600" resolveInfo="myFileNodeEditor" />
            </node>
            <node role="rValue" roleId="tpee.1068498886297" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="199149364782662222">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="199149364782662223">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="1bbd.~MPSFileNodeEditor%d&lt;init&gt;(jetbrains%dmps%dsmodel%dIOperationContext,jetbrains%dmps%dworkbench%dnodesFs%dMPSNodeVirtualFile)" resolveInfo="MPSFileNodeEditor" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="8692480643148204763">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1219408662419" resolveInfo="myContext" />
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="199149364782662227">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="199149364782662228">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="v3up.~MPSNodesVirtualFileSystem%dgetInstance()%cjetbrains%dmps%dworkbench%dnodesFs%dMPSNodesVirtualFileSystem" resolveInfo="getInstance" />
                    <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="v3up.~MPSNodesVirtualFileSystem" resolveInfo="MPSNodesVirtualFileSystem" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="199149364782662229">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="v3up.~MPSNodesVirtualFileSystem%dgetFileFor(jetbrains%dmps%dsmodel%dSNode)%cjetbrains%dmps%dworkbench%dnodesFs%dMPSNodeVirtualFile" resolveInfo="getFileFor" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="8692480643148204440">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1219408375970" resolveInfo="myNode" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="199149364782662233">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="199149364782662234">
            <property name="name" nameId="tpck.1169194664001" value="editor" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="199149364782662235">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="664.~IEditor" resolveInfo="IEditor" />
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="199149364782662236">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="8692480643148205116">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1220438174600" resolveInfo="myFileNodeEditor" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="199149364782662240">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="1bbd.~MPSFileNodeEditor%dgetNodeEditor()%cjetbrains%dmps%dide%dIEditor" resolveInfo="getNodeEditor" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="199149364782662241">
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="199149364782662242">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="199149364782662243">
              <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="199149364782662244">
                <property name="name" nameId="tpck.1169194664001" value="nodeEditor" />
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="199149364782662245">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="664.~NodeEditor" resolveInfo="NodeEditor" />
                </node>
                <node role="initializer" roleId="tpee.1068431790190" type="tpee.CastExpression" typeId="tpee.1070534934090" id="199149364782662246">
                  <node role="type" roleId="tpee.1070534934091" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="199149364782662247">
                    <link role="classifier" roleId="tpee.1107535924139" targetNodeId="664.~NodeEditor" resolveInfo="NodeEditor" />
                  </node>
                  <node role="expression" roleId="tpee.1070534934092" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="199149364782662248">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="199149364782662234" resolveInfo="editor" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="199149364782662249">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="199149364782662250">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="199149364782662251">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="199149364782662244" resolveInfo="nodeEditor" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="199149364782662252">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="664.~NodeEditor%dsetEditable(boolean)%cvoid" resolveInfo="setEditable" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="8692480643148204862">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5367124414732056014" resolveInfo="myIsEditable" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="tpee.1068580123160" type="tpee.InstanceOfExpression" typeId="tpee.1081256982272" id="199149364782662256">
            <node role="classType" roleId="tpee.1081256993305" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="199149364782662257">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="664.~NodeEditor" resolveInfo="NodeEditor" />
            </node>
            <node role="leftExpression" roleId="tpee.1081256993304" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="199149364782662258">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="199149364782662234" resolveInfo="editor" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="199149364782662259">
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="199149364782662260">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="199149364782662261">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="199149364782662262">
                <node role="rValue" roleId="tpee.1068498886297" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="199149364782662263">
                  <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="199149364782662264">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="1220433141276" resolveInfo="EmbeddableEditorPanel" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="8692480643148204907">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1220438174600" resolveInfo="myFileNodeEditor" />
                    </node>
                  </node>
                </node>
                <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="8692480643148204937">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1220433430382" resolveInfo="myPanel" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="tpee.1068580123160" type="tpee.EqualsExpression" typeId="tpee.1068580123152" id="199149364782662271">
            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="199149364782662272" />
            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="8692480643148204211">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1220433430382" resolveInfo="myPanel" />
            </node>
          </node>
          <node role="ifFalseStatement" roleId="tpee.1082485599094" type="tpee.BlockStatement" typeId="tpee.1082485599095" id="199149364782662276">
            <node role="statements" roleId="tpee.1082485599096" type="tpee.StatementList" typeId="tpee.1068580123136" id="199149364782662277">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="199149364782662278">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="199149364782662279">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="8692480643148204427">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1220433430382" resolveInfo="myPanel" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="199149364782662283">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7184256428677620033" resolveInfo="setEditor" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="8692480643148204653">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1220438174600" resolveInfo="myFileNodeEditor" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="199149364782662177">
        <property name="name" nameId="tpck.1169194664001" value="rootNode" />
        <property name="isFinal" nameId="tpee.1176718929932" value="true" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="199149364782662178" />
        <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="3062193708278909633">
          <link role="annotation" roleId="tpee.1188208074048" targetNodeId="qvoq.~NotNull" resolveInfo="NotNull" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="199149364782662179">
        <property name="name" nameId="tpck.1169194664001" value="targetNode" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="199149364782662181" />
        <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="3062193708278911594">
          <link role="annotation" roleId="tpee.1188208074048" targetNodeId="qvoq.~NotNull" resolveInfo="NotNull" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="276193728322519106">
        <property name="name" nameId="tpck.1169194664001" value="addToModel" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.BooleanType" typeId="tpee.1070534644030" id="276193728322519108" />
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="1476208411437217394">
      <property name="name" nameId="tpck.1169194664001" value="setNode" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="1476208411437217395" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="1476208411437217396" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="1476208411437217397">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="199149364782675504">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="1200564340082201880">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="199149364782662172" resolveInfo="setNode" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="199149364782675508">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1476208411437217398" resolveInfo="node" />
            </node>
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="199149364782675510">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1476208411437217398" resolveInfo="node" />
            </node>
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="276193728322519110">
              <property name="value" nameId="tpee.1068580123138" value="true" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="1476208411437217398">
        <property name="name" nameId="tpck.1169194664001" value="node" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="1476208411437217399" />
        <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="3062193708278911593">
          <link role="annotation" roleId="tpee.1188208074048" targetNodeId="qvoq.~NotNull" resolveInfo="NotNull" />
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="1220278334166">
      <property name="name" nameId="tpck.1169194664001" value="getComponenet" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="1220278338348">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i09a.~JComponent" resolveInfo="JComponent" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="1220278334168" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="1220278334169">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="1220278349755">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="8692480643148204840">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1220433430382" resolveInfo="myPanel" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="6737363541215469063">
      <property name="name" nameId="tpck.1169194664001" value="setBackground" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="6737363541215469064" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="6737363541215469065" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="6737363541215469066">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="6737363541215469071">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="6737363541215469072">
            <property name="name" nameId="tpck.1169194664001" value="editor" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6737363541215469073">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="664.~IEditor" resolveInfo="IEditor" />
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6737363541215469074">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="8692480643148205141">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1220438174600" resolveInfo="myFileNodeEditor" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6737363541215469078">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="1bbd.~MPSFileNodeEditor%dgetNodeEditor()%cjetbrains%dmps%dide%dIEditor" resolveInfo="getNodeEditor" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="6737363541215469079">
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="6737363541215469080">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="6737363541215469081">
              <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="6737363541215469082">
                <property name="name" nameId="tpck.1169194664001" value="nodeEditor" />
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6737363541215469083">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="664.~NodeEditor" resolveInfo="NodeEditor" />
                </node>
                <node role="initializer" roleId="tpee.1068431790190" type="tpee.CastExpression" typeId="tpee.1070534934090" id="6737363541215469084">
                  <node role="type" roleId="tpee.1070534934091" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6737363541215469085">
                    <link role="classifier" roleId="tpee.1107535924139" targetNodeId="664.~NodeEditor" resolveInfo="NodeEditor" />
                  </node>
                  <node role="expression" roleId="tpee.1070534934092" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="6737363541215469086">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6737363541215469072" resolveInfo="editor" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6737363541215469245">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6737363541215469247">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="6737363541215469246">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6737363541215469082" resolveInfo="nodeEditor" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="1537397159312965364">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="664.~NodeEditor%dsetBackground(java%dawt%dColor)%cvoid" resolveInfo="setBackground" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="1537397159312982072">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6737363541215469067" resolveInfo="color" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="tpee.1068580123160" type="tpee.InstanceOfExpression" typeId="tpee.1081256982272" id="6737363541215469092">
            <node role="classType" roleId="tpee.1081256993305" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6737363541215469093">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="664.~NodeEditor" resolveInfo="NodeEditor" />
            </node>
            <node role="leftExpression" roleId="tpee.1081256993304" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="6737363541215469094">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6737363541215469072" resolveInfo="editor" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="6737363541215469067">
        <property name="name" nameId="tpck.1169194664001" value="color" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6737363541215469068">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="5p1m.~Color" resolveInfo="Color" />
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7294814585296168382">
      <property name="name" nameId="tpck.1169194664001" value="mark" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7294814585296168383" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7294814585296168384" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7294814585296168385">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7294814585296168392">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7294814585296168393">
            <property name="name" nameId="tpck.1169194664001" value="editor" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7294814585296168394">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="664.~IEditor" resolveInfo="IEditor" />
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7294814585296231435">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="8692480643148204703">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1220438174600" resolveInfo="myFileNodeEditor" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7294814585296232080">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="1bbd.~MPSFileNodeEditor%dgetNodeEditor()%cjetbrains%dmps%dide%dIEditor" resolveInfo="getNodeEditor" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7294814585296232082">
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7294814585296232083">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7294814585296232093">
              <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7294814585296232094">
                <property name="name" nameId="tpck.1169194664001" value="nodeEditor" />
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7294814585296232095">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="664.~NodeEditor" resolveInfo="NodeEditor" />
                </node>
                <node role="initializer" roleId="tpee.1068431790190" type="tpee.CastExpression" typeId="tpee.1070534934090" id="7294814585296232097">
                  <node role="type" roleId="tpee.1070534934091" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7294814585296232098">
                    <link role="classifier" roleId="tpee.1107535924139" targetNodeId="664.~NodeEditor" resolveInfo="NodeEditor" />
                  </node>
                  <node role="expression" roleId="tpee.1070534934092" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7294814585296232100">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7294814585296168393" resolveInfo="editor" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7294814585296232102">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7294814585296232104">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7294814585296232103">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7294814585296232094" resolveInfo="nodeEditor" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7294814585296232108">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="664.~NodeEditor%dmark(java%dutil%dList)%cvoid" resolveInfo="mark" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7294814585296232109">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7294814585296168386" resolveInfo="messages" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="tpee.1068580123160" type="tpee.InstanceOfExpression" typeId="tpee.1081256982272" id="7294814585296232087">
            <node role="classType" roleId="tpee.1081256993305" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7294814585296232090">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="664.~NodeEditor" resolveInfo="NodeEditor" />
            </node>
            <node role="leftExpression" roleId="tpee.1081256993304" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7294814585296232086">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7294814585296168393" resolveInfo="editor" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7294814585296168386">
        <property name="name" nameId="tpck.1169194664001" value="messages" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp2q.ListType" typeId="tp2q.1151688443754" id="7294814585296168387">
          <node role="elementType" roleId="tp2q.1151688676805" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7294814585296168389">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="a0xp.~EditorMessage" resolveInfo="EditorMessage" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7469930712745424618">
      <property name="name" nameId="tpck.1169194664001" value="selectNode" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7469930712745424619" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7469930712745424620" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7469930712745424621">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7469930712745424632">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7469930712745425282">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7469930712745424636">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="8692480643148204282">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1220438174600" resolveInfo="myFileNodeEditor" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7469930712745425281">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="1bbd.~MPSFileNodeEditor%dgetNodeEditor()%cjetbrains%dmps%dide%dIEditor" resolveInfo="getNodeEditor" />
              </node>
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7469930712745425286">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="664.~IEditor%dselectNode(jetbrains%dmps%dsmodel%dSNode)%cvoid" resolveInfo="selectNode" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7469930712745425287">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7469930712745424622" resolveInfo="node" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7469930712745424622">
        <property name="name" nameId="tpck.1169194664001" value="node" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="7469930712745424623" />
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="3094411788089107832">
      <property name="name" nameId="tpck.1169194664001" value="getEditor" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3094411788089108007">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="664.~IEditor" resolveInfo="IEditor" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="3094411788089107834" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="3094411788089107835">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="3094411788089108008">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3094411788089108011">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="3094411788089108010">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1220438174600" resolveInfo="myFileNodeEditor" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="3094411788089108015">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="1bbd.~MPSFileNodeEditor%dgetNodeEditor()%cjetbrains%dmps%dide%dIEditor" resolveInfo="getNodeEditor" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="1219412504349">
      <property name="name" nameId="tpck.1169194664001" value="generate" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="1219412509590">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="1219411663047" resolveInfo="GenerateResult" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="1219412504351" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="1219412504352">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7865481948248727739">
          <node role="condition" roleId="tpee.1068580123160" type="tpee.EqualsExpression" typeId="tpee.1068580123152" id="7865481948248727740">
            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="7865481948248727741" />
            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="8692480643148204625">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="199149364782660330" resolveInfo="myRootNode" />
            </node>
          </node>
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7865481948248727745">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7865481948248727746">
              <node role="expression" roleId="tpee.1068581517676" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="7865481948248727747" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7865481948248722446">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7865481948248722447">
            <property name="name" nameId="tpck.1169194664001" value="handler" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7865481948248727671">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="50zc.~InMemoryJavaGenerationHandler" resolveInfo="InMemoryJavaGenerationHandler" />
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7865481948248722449">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.AnonymousClassCreator" typeId="tpee.1182160077978" id="7865481948248722450">
                <node role="cls" roleId="tpee.1182160096073" type="tpee.AnonymousClass" typeId="tpee.1170345865475" id="7865481948248722451">
                  <property name="nonStatic" nameId="tpee.521412098689998745" value="true" />
                  <link role="classifier" roleId="tpee.1170346070688" targetNodeId="50zc.~InMemoryJavaGenerationHandler" resolveInfo="InMemoryJavaGenerationHandler" />
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="50zc.~InMemoryJavaGenerationHandler%d&lt;init&gt;(boolean,boolean)" resolveInfo="InMemoryJavaGenerationHandler" />
                  <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7865481948248722452" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="7865481948248722453">
                    <property name="value" nameId="tpee.1068580123138" value="false" />
                  </node>
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="7865481948248727672">
                    <property name="value" nameId="tpee.1068580123138" value="false" />
                  </node>
                  <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7865481948248722455">
                    <property name="name" nameId="tpck.1169194664001" value="canHandle" />
                    <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7865481948248722456" />
                    <node role="returnType" roleId="tpee.1068580123133" type="tpee.BooleanType" typeId="tpee.1070534644030" id="7865481948248722457" />
                    <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7865481948248722458">
                      <property name="name" nameId="tpck.1169194664001" value="inputModel" />
                      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7865481948248722459">
                        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="d8ec.~SModelDescriptor" resolveInfo="SModelDescriptor" />
                      </node>
                    </node>
                    <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7865481948248722460">
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7865481948248722461">
                        <node role="expression" roleId="tpee.1068580123156" type="tpee.NotEqualsExpression" typeId="tpee.1073239437375" id="7865481948248722462">
                          <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="7865481948248722463" />
                          <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7865481948248722464">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7865481948248722458" resolveInfo="inputModel" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="7865481948248722465">
                      <link role="annotation" roleId="tpee.1188208074048" targetNodeId="mwyq.~Override" resolveInfo="Override" />
                    </node>
                  </node>
                  <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7865481948248722466">
                    <property name="name" nameId="tpck.1169194664001" value="getClassPath" />
                    <node role="visibility" roleId="tpee.1178549979242" type="tpee.ProtectedVisibility" typeId="tpee.1146644641414" id="7865481948248722467" />
                    <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7865481948248722468">
                      <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fo3f.~CompositeClassPathItem" resolveInfo="CompositeClassPathItem" />
                    </node>
                    <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7865481948248722469">
                      <property name="name" nameId="tpck.1169194664001" value="contextModules" />
                      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7865481948248722470">
                        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="t1ti.~Set" resolveInfo="Set" />
                        <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7865481948248722471">
                          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="jt7v.~IModule" resolveInfo="IModule" />
                        </node>
                      </node>
                    </node>
                    <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7865481948248722472">
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7865481948248722473">
                        <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7865481948248722474">
                          <property name="name" nameId="tpck.1169194664001" value="result" />
                          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7865481948248722475">
                            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fo3f.~CompositeClassPathItem" resolveInfo="CompositeClassPathItem" />
                          </node>
                          <node role="initializer" roleId="tpee.1068431790190" type="tpee.SuperMethodCall" typeId="tpee.1073063089578" id="7865481948248722476">
                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="50zc.~InMemoryJavaGenerationHandler%dgetClassPath(java%dutil%dSet)%cjetbrains%dmps%dreloading%dCompositeClassPathItem" resolveInfo="getClassPath" />
                            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7865481948248722477">
                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7865481948248722469" resolveInfo="contextModules" />
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.ForeachStatement" typeId="tpee.1144226303539" id="7865481948248722478">
                        <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="7865481948248722479">
                          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7865481948248722480">
                            <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7865481948248722481">
                              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7865481948248722482">
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7865481948248722474" resolveInfo="result" />
                              </node>
                              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7865481948248722483">
                                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fo3f.~CompositeClassPathItem%dadd(jetbrains%dmps%dreloading%dIClassPathItem)%cvoid" resolveInfo="add" />
                                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7865481948248722484">
                                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7865481948248722486" resolveInfo="item" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="iterable" roleId="tpee.1144226360166" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7865481948248722485">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5658679531526376321" resolveInfo="additionalClasspath" />
                        </node>
                        <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7865481948248722486">
                          <property name="name" nameId="tpck.1169194664001" value="item" />
                          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7865481948248722487">
                            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fo3f.~IClassPathItem" resolveInfo="IClassPathItem" />
                          </node>
                        </node>
                      </node>
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7865481948248722488">
                        <node role="expression" roleId="tpee.1068581517676" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7865481948248722489">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7865481948248722474" resolveInfo="result" />
                        </node>
                      </node>
                    </node>
                    <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="7865481948248722490">
                      <link role="annotation" roleId="tpee.1188208074048" targetNodeId="mwyq.~Override" resolveInfo="Override" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="1079232116104569374">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="1079232116104569375">
            <property name="name" nameId="tpck.1169194664001" value="successful" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.BooleanType" typeId="tpee.1070534644030" id="1079232116104569376" />
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1079232116104569378">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="1079232116104569379">
                <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="t5t.~GeneratorFacade" resolveInfo="GeneratorFacade" />
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="t5t.~GeneratorFacade%dgetInstance()%cjetbrains%dmps%dide%dgenerator%dGeneratorFacade" resolveInfo="getInstance" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="1079232116104569380">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="t5t.~GeneratorFacade%dgenerateModels(jetbrains%dmps%dsmodel%dIOperationContext,java%dutil%dList,jetbrains%dmps%dgenerator%dgenerationTypes%dIGenerationHandler,boolean,boolean)%cboolean" resolveInfo="generateModels" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="1079232116104569381">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1219408662419" resolveInfo="myContext" />
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="1079232116104569382">
                  <node role="creator" roleId="tpee.1145553007750" type="tp2q.ListCreatorWithInit" typeId="tp2q.1160600644654" id="1079232116104569383">
                    <node role="elementType" roleId="tp2q.1237721435807" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="1079232116104569384">
                      <link role="classifier" roleId="tpee.1107535924139" targetNodeId="d8ec.~SModelDescriptor" resolveInfo="SModelDescriptor" />
                    </node>
                    <node role="initValue" roleId="tp2q.1237721435808" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="1079232116104569385">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1219408476932" resolveInfo="myModel" />
                    </node>
                  </node>
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="1079232116104569386">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7865481948248722447" resolveInfo="handler" />
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="1079232116104569387">
                  <property name="value" nameId="tpee.1068580123138" value="true" />
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="1079232116104569388">
                  <property name="value" nameId="tpee.1068580123138" value="true" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7865481948248727724">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7865481948248727725">
            <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7865481948248727726">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="1219669234496" resolveInfo="GenerationResult" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="8692480643148204187">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="199149364782660330" resolveInfo="myRootNode" />
              </node>
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="8692480643148204593">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1219408662419" resolveInfo="myContext" />
              </node>
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="8692480643148204688">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1219408476932" resolveInfo="myModel" />
              </node>
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7865481948248727749">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7865481948248722447" resolveInfo="handler" />
              </node>
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="1079232116104569389">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1079232116104569375" resolveInfo="successful" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="5658679531526376321">
        <property name="name" nameId="tpck.1169194664001" value="additionalClasspath" />
        <property name="isFinal" nameId="tpee.1176718929932" value="true" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="5658679531526383601">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="t1ti.~Set" resolveInfo="Set" />
          <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="5658679531526383624">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fo3f.~IClassPathItem" resolveInfo="IClassPathItem" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="6483976992294511266">
      <property name="name" nameId="tpck.1169194664001" value="getModel" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="9094453971530657552">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="b2e1.~EditableSModelDescriptor" resolveInfo="EditableSModelDescriptor" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="6483976992294511268" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="6483976992294511269">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6483976992294521820">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="8692480643148204718">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1219408476932" resolveInfo="myModel" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="1219418281320">
      <property name="name" nameId="tpck.1169194664001" value="addLanguageStructureModel" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="1219418281321" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="1219418281322" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="1219418281323">
        <node role="statement" roleId="tpee.1068581517665" type="tp4k.ExecuteCommandStatement" typeId="tp4k.1225441285519" id="1219418302102">
          <node role="commandClosureLiteral" roleId="tp4k.1225441160167" type="tp4k.CommandClosureLiteral" typeId="tp4k.1225441216717" id="1219418302103">
            <node role="body" roleId="tp2c.1199569916463" type="tpee.StatementList" typeId="tpee.1068580123136" id="1219418302104">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="6853886991698787741">
                <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="6853886991698787742">
                  <property name="name" nameId="tpck.1169194664001" value="ref" />
                  <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6853886991698787743">
                    <link role="classifier" roleId="tpee.1107535924139" targetNodeId="d8ec.~SModelReference" resolveInfo="SModelReference" />
                  </node>
                  <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6853886991698787744">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6853886991698787745">
                      <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6853886991698787746">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="d8ec.~Language%dgetStructureModelDescriptor()%cjetbrains%dmps%dsmodel%ddescriptor%dEditableSModelDescriptor" resolveInfo="getStructureModelDescriptor" />
                      </node>
                      <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6853886991698787747">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1219418299303" resolveInfo="language" />
                      </node>
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6853886991698787748">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="d8ec.~SModelDescriptor%dgetSModelReference()%cjetbrains%dmps%dsmodel%dSModelReference" resolveInfo="getSModelReference" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6853886991698800458">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6853886991698800462">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6853886991698800459">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="6853886991698800460">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1219408476932" resolveInfo="myModel" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6853886991698800461">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="d8ec.~SModelDescriptor%dgetSModel()%cjetbrains%dmps%dsmodel%dSModel" resolveInfo="getSModel" />
                    </node>
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6853886991698800470">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="d8ec.~SModel%daddModelImport(jetbrains%dmps%dsmodel%dSModelReference,boolean)%cvoid" resolveInfo="addModelImport" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="6853886991698800471">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6853886991698787742" resolveInfo="ref" />
                    </node>
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="6853886991698800473">
                      <property name="value" nameId="tpee.1068580123138" value="false" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="1219418299303">
        <property name="name" nameId="tpck.1169194664001" value="language" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="1219418299304">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="d8ec.~Language" resolveInfo="Language" />
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="1227605579938">
      <property name="name" nameId="tpck.1169194664001" value="addLanguage" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="1227605602243">
        <property name="name" nameId="tpck.1169194664001" value="language" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="1227605602244">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="d8ec.~Language" resolveInfo="Language" />
        </node>
      </node>
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="1227605579939" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="1227605579940" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="1227605579941">
        <node role="statement" roleId="tpee.1068581517665" type="tp4k.ExecuteWriteActionStatement" typeId="tp4k.1225441380935" id="1227605620573">
          <node role="commandClosureLiteral" roleId="tp4k.1225441160167" type="tp4k.CommandClosureLiteral" typeId="tp4k.1225441216717" id="1227605620574">
            <node role="body" roleId="tp2c.1199569916463" type="tpee.StatementList" typeId="tpee.1068580123136" id="1227605620575">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1227605624919">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1227605624920">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1227605624921">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="8692480643148205093">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1219408476932" resolveInfo="myModel" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="1227605624925">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="d8ec.~SModelDescriptor%dgetSModel()%cjetbrains%dmps%dsmodel%dSModel" resolveInfo="getSModel" />
                    </node>
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="1227605624926">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="d8ec.~SModel%daddLanguage(jetbrains%dmps%dproject%dstructure%dmodules%dModuleReference)%cvoid" resolveInfo="addLanguage" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6853886991698800476">
                      <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="1227605624927">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1227605602243" resolveInfo="language" />
                      </node>
                      <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6853886991698800480">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="jt7v.~AbstractModule%dgetModuleReference()%cjetbrains%dmps%dproject%dstructure%dmodules%dModuleReference" resolveInfo="getModuleReference" />
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
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="8119021187637935031">
      <property name="name" nameId="tpck.1169194664001" value="addModel" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="8119021187637935032" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="8119021187637935033" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="8119021187637935034">
        <node role="statement" roleId="tpee.1068581517665" type="tp4k.ExecuteWriteActionStatement" typeId="tp4k.1225441380935" id="8119021187637935508">
          <node role="commandClosureLiteral" roleId="tp4k.1225441160167" type="tp4k.CommandClosureLiteral" typeId="tp4k.1225441216717" id="8119021187637935509">
            <node role="body" roleId="tp2c.1199569916463" type="tpee.StatementList" typeId="tpee.1068580123136" id="8119021187637935510">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="8119021187637935511">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8119021187637936936">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8119021187637935521">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="8692480643148204557">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1219408476932" resolveInfo="myModel" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="8119021187637936934">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="d8ec.~SModelDescriptor%dgetSModel()%cjetbrains%dmps%dsmodel%dSModel" resolveInfo="getSModel" />
                    </node>
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="8119021187637938176">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="d8ec.~SModel%daddModelImport(jetbrains%dmps%dsmodel%dSModelReference,boolean)%cvoid" resolveInfo="addModelImport" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="8119021187637938180">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="8119021187637938178" resolveInfo="model" />
                    </node>
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="6853886991698800475">
                      <property name="value" nameId="tpee.1068580123138" value="false" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="8119021187637938178">
        <property name="name" nameId="tpck.1169194664001" value="model" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="8119021187637938179">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="d8ec.~SModelReference" resolveInfo="SModelReference" />
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="1219672383771">
      <property name="name" nameId="tpck.1169194664001" value="disposeEditor" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="1219672383772" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="1219672383773" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="1219672383774">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="5602187481573680136">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="5602187481573680137">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="5602187481573650797" resolveInfo="disposeEditor" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="5602187481573680138">
              <property name="value" nameId="tpee.1068580123138" value="true" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="5602187481573650797">
      <property name="name" nameId="tpck.1169194664001" value="disposeEditor" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="5602187481573650798" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="5602187481573650799" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="5602187481573650800">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="5602187481573680131">
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="5602187481573680132">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="5602187481573650801">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="5602187481573650802">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="5602187481573650803">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="d8ec.~SModelRepository%dgetInstance()%cjetbrains%dmps%dsmodel%dSModelRepository" resolveInfo="getInstance" />
                  <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="d8ec.~SModelRepository" resolveInfo="SModelRepository" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="5602187481573650804">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="d8ec.~SModelRepository%dunRegisterModelDescriptors(jetbrains%dmps%dsmodel%dModelOwner)%cvoid" resolveInfo="unRegisterModelDescriptors" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="5602187481573650805">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1219413493008" resolveInfo="myOwner" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="tpee.1068580123160" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="5602187481573680135">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5602187481573680128" resolveInfo="clearModule" />
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="5602187481573650806">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="5602187481573650807">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="5602187481573650808">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1220438174600" resolveInfo="myFileNodeEditor" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="5602187481573650809">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="1bbd.~MPSFileNodeEditor%ddispose()%cvoid" resolveInfo="dispose" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="5602187481573680128">
        <property name="name" nameId="tpck.1169194664001" value="clearModule" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.BooleanType" typeId="tpee.1070534644030" id="5602187481573680129" />
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="1220276440556">
      <property name="name" nameId="tpck.1169194664001" value="createOperationContext" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="1220276477301">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="d8ec.~IOperationContext" resolveInfo="IOperationContext" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.ProtectedVisibility" typeId="tpee.1146644641414" id="1220277179118" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="1220276440559">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="1220276500271">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="8692480643148204985">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1219408662419" resolveInfo="myContext" />
          </node>
        </node>
      </node>
    </node>
    <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="1220438174600">
      <property name="name" nameId="tpck.1169194664001" value="myFileNodeEditor" />
      <property name="isFinal" nameId="tpee.1176718929932" value="false" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="1220438174601" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="1220438178935">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="1bbd.~MPSFileNodeEditor" resolveInfo="MPSFileNodeEditor" />
      </node>
    </node>
    <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="1220433430382">
      <property name="name" nameId="tpck.1169194664001" value="myPanel" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="1220433430383" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="1220433434937">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="1220433141274" resolveInfo="EmbeddableEditorPanel" />
      </node>
    </node>
    <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="1219408662419">
      <property name="name" nameId="tpck.1169194664001" value="myContext" />
      <property name="isFinal" nameId="tpee.1176718929932" value="true" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="1219408662420" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="1219408665735">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="d8ec.~IOperationContext" resolveInfo="IOperationContext" />
      </node>
    </node>
    <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="1219408476932">
      <property name="name" nameId="tpck.1169194664001" value="myModel" />
      <property name="isFinal" nameId="tpee.1176718929932" value="true" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="1219408476933" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="9094453971530657554">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="b2e1.~EditableSModelDescriptor" resolveInfo="EditableSModelDescriptor" />
      </node>
    </node>
    <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="1219413493008">
      <property name="name" nameId="tpck.1169194664001" value="myOwner" />
      <property name="isFinal" nameId="tpee.1176718929932" value="true" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="1219413493009" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="1219413496515">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="d8ec.~ModelOwner" resolveInfo="ModelOwner" />
      </node>
    </node>
    <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="1219408375970">
      <property name="name" nameId="tpck.1169194664001" value="myNode" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="1219408375971" />
      <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="1219408375972" />
    </node>
    <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="199149364782660330">
      <property name="name" nameId="tpck.1169194664001" value="myRootNode" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="199149364782660331" />
      <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="199149364782662167" />
    </node>
    <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="5367124414732056014">
      <property name="name" nameId="tpck.1169194664001" value="myIsEditable" />
      <property name="isFinal" nameId="tpee.1176718929932" value="true" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="5367124414732056015" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.BooleanType" typeId="tpee.1070534644030" id="5367124414732056017" />
    </node>
    <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="1219405202224" />
    <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="5367124414732055990">
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="5367124414732055994">
        <property name="name" nameId="tpck.1169194664001" value="context" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="5367124414732055995">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="d8ec.~IOperationContext" resolveInfo="IOperationContext" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="5367124414732055996">
        <property name="name" nameId="tpck.1169194664001" value="owner" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="5367124414732055997">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="d8ec.~ModelOwner" resolveInfo="ModelOwner" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="5367124414732055998">
        <property name="name" nameId="tpck.1169194664001" value="node" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="5367124414732055999" />
      </node>
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="5367124414732055991" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="5367124414732055992" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="5367124414732055993">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ThisConstructorInvocation" typeId="tpee.1178893518978" id="5367124414732056006">
          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="1219405202225" resolveInfo="EmbeddableEditor" />
          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="5367124414732056007">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5367124414732055994" resolveInfo="context" />
          </node>
          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="5367124414732056009">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5367124414732055996" resolveInfo="owner" />
          </node>
          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="5367124414732056011">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5367124414732055998" resolveInfo="node" />
          </node>
          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="5367124414732056013">
            <property name="value" nameId="tpee.1068580123138" value="true" />
          </node>
        </node>
      </node>
    </node>
    <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="1219405202225">
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="1219405202226" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="1219405202227" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="1219405202228">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ThisConstructorInvocation" typeId="tpee.1178893518978" id="199149364782675623">
          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="199149364782675564" resolveInfo="EmbeddableEditor" />
          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="199149364782675624">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1219405578628" resolveInfo="context" />
          </node>
          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="199149364782675626">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1219409493139" resolveInfo="owner" />
          </node>
          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="199149364782675628">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1220272668087" resolveInfo="node" />
          </node>
          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="199149364782675630">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1220272668087" resolveInfo="node" />
          </node>
          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="199149364782675632">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5367124414732056003" resolveInfo="editable" />
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="1219405578628">
        <property name="name" nameId="tpck.1169194664001" value="context" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="1219405578629">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="d8ec.~IOperationContext" resolveInfo="IOperationContext" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="1219409493139">
        <property name="name" nameId="tpck.1169194664001" value="owner" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="1219409495923">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="d8ec.~ModelOwner" resolveInfo="ModelOwner" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="1220272668087">
        <property name="name" nameId="tpck.1169194664001" value="node" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="1239568232624" />
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="5367124414732056003">
        <property name="name" nameId="tpck.1169194664001" value="editable" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.BooleanType" typeId="tpee.1070534644030" id="5367124414732056005" />
      </node>
    </node>
    <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="199149364782675564">
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="199149364782675565" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="199149364782675566" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="199149364782675567">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="199149364782675568">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="199149364782675569">
            <node role="rValue" roleId="tpee.1068498886297" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="199149364782675570">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="199149364782675611" resolveInfo="owner" />
            </node>
            <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="8692480643148204747">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1219413493008" resolveInfo="myOwner" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="199149364782675574">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="199149364782675575">
            <node role="rValue" roleId="tpee.1068498886297" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="199149364782675576">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="199149364782675609" resolveInfo="context" />
            </node>
            <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="8692480643148204940">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1219408662419" resolveInfo="myContext" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="199149364782675580">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="199149364782675581">
            <node role="rValue" roleId="tpee.1068498886297" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="199149364782675582">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="199149364782675615" resolveInfo="editable" />
            </node>
            <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="8692480643148204355">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5367124414732056014" resolveInfo="myIsEditable" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="199149364782675586">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="199149364782675587">
            <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="8692480643148204412">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1219408476932" resolveInfo="myModel" />
            </node>
            <node role="rValue" roleId="tpee.1068498886297" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="199149364782675591">
              <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="d8ec.~ProjectModels" resolveInfo="ProjectModels" />
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="d8ec.~ProjectModels%dcreateDescriptorFor(jetbrains%dmps%dsmodel%dModelOwner)%cjetbrains%dmps%dsmodel%ddescriptor%dEditableSModelDescriptor" resolveInfo="createDescriptorFor" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="8692480643148204254">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1219413493008" resolveInfo="myOwner" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="199149364782675595">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="199149364782675596">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="199149364782675597">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="8692480643148204519">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1219408476932" resolveInfo="myModel" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="199149364782675601">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="d8ec.~SModelDescriptor%dgetSModel()%cjetbrains%dmps%dsmodel%dSModel" resolveInfo="getSModel" />
              </node>
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="199149364782675602">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="d8ec.~SModel%daddDevKit(jetbrains%dmps%dproject%dstructure%dmodules%dModuleReference)%cvoid" resolveInfo="addDevKit" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="7123761944774892370">
                <link role="classifier" roleId="tpee.1144433057691" targetNodeId="nubx.~GeneralPurpose_DevKit" resolveInfo="GeneralPurpose_DevKit" />
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="nubx.~GeneralPurpose_DevKit%dMODULE_REFERENCE" resolveInfo="MODULE_REFERENCE" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="199149364782675604">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="1200564340082201686">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="199149364782662172" resolveInfo="setNode" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="199149364782675634">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="199149364782675617" resolveInfo="rootNode" />
            </node>
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="199149364782675607">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="199149364782675613" resolveInfo="node" />
            </node>
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="276193728322519112">
              <property name="value" nameId="tpee.1068580123138" value="true" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="199149364782675609">
        <property name="name" nameId="tpck.1169194664001" value="context" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="199149364782675610">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="d8ec.~IOperationContext" resolveInfo="IOperationContext" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="199149364782675611">
        <property name="name" nameId="tpck.1169194664001" value="owner" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="199149364782675612">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="d8ec.~ModelOwner" resolveInfo="ModelOwner" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="199149364782675617">
        <property name="name" nameId="tpck.1169194664001" value="rootNode" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="199149364782675619" />
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="199149364782675613">
        <property name="name" nameId="tpck.1169194664001" value="targetNode" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="199149364782675614" />
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="199149364782675615">
        <property name="name" nameId="tpck.1169194664001" value="editable" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.BooleanType" typeId="tpee.1070534644030" id="199149364782675616" />
      </node>
    </node>
    <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="276193728322472400">
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="276193728322472401" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="276193728322472402" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="276193728322472403">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="276193728322472404">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="276193728322472405">
            <node role="rValue" roleId="tpee.1068498886297" type="tpee.DotExpression" typeId="tpee.1197027756228" id="5720687632037740415">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="5720687632037740414">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5720687632037736075" resolveInfo="modelDescriptor" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="5720687632037741491">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="d8ec.~SModelDescriptor%dgetModule()%cjetbrains%dmps%dproject%dIModule" resolveInfo="getModule" />
              </node>
            </node>
            <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="276193728322472407">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1219413493008" resolveInfo="myOwner" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="276193728322472408">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="276193728322472409">
            <node role="rValue" roleId="tpee.1068498886297" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="276193728322472410">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="276193728322472432" resolveInfo="context" />
            </node>
            <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="276193728322472411">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1219408662419" resolveInfo="myContext" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="276193728322472412">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="276193728322472413">
            <node role="rValue" roleId="tpee.1068498886297" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="276193728322472414">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="276193728322472440" resolveInfo="editable" />
            </node>
            <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="276193728322472415">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5367124414732056014" resolveInfo="myIsEditable" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="276193728322472416">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="5720687632037741492">
            <node role="rValue" roleId="tpee.1068498886297" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="5720687632037741495">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5720687632037736075" resolveInfo="modelDescriptor" />
            </node>
            <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="276193728322472418">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1219408476932" resolveInfo="myModel" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="276193728322519132">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="276193728322519133">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="199149364782662172" resolveInfo="setNode" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="5720687632037741502">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5720687632037741498" resolveInfo="rootNode" />
            </node>
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="5720687632037741503">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5720687632037741500" resolveInfo="targetNode" />
            </node>
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="276193728322519152">
              <property name="value" nameId="tpee.1068580123138" value="false" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="276193728322472432">
        <property name="name" nameId="tpck.1169194664001" value="context" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="276193728322472433">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="d8ec.~IOperationContext" resolveInfo="IOperationContext" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="5720687632037736075">
        <property name="name" nameId="tpck.1169194664001" value="modelDescriptor" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="5720687632037741504">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="b2e1.~EditableSModelDescriptor" resolveInfo="EditableSModelDescriptor" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="5720687632037741498">
        <property name="name" nameId="tpck.1169194664001" value="rootNode" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="5720687632037741499" />
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="5720687632037741500">
        <property name="name" nameId="tpck.1169194664001" value="targetNode" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="5720687632037741501" />
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="276193728322472440">
        <property name="name" nameId="tpck.1169194664001" value="editable" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.BooleanType" typeId="tpee.1070534644030" id="276193728322472441" />
      </node>
    </node>
  </root>
  <root id="1219411663047">
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="1219412424344">
      <property name="name" nameId="tpck.1169194664001" value="getSNode" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="1219412424346" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="1219412424347">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="1219412442647">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="8692480643148204243">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1219412374874" resolveInfo="myNode" />
          </node>
        </node>
      </node>
      <node role="returnType" roleId="tpee.1068580123133" type="tp25.SNodeType" typeId="tp25.1138055754698" id="1239575040463" />
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="1219415849704">
      <property name="name" nameId="tpck.1169194664001" value="getOperationContext" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="1219415849706" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="1219415849707">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="1219415862558">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="8692480643148204167">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1219415867591" resolveInfo="myContext" />
          </node>
        </node>
      </node>
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="1219415853447">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="d8ec.~IOperationContext" resolveInfo="IOperationContext" />
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="1219669366778">
      <property name="name" nameId="tpck.1169194664001" value="getModelDescriptor" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="1219669379391">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="d8ec.~SModelDescriptor" resolveInfo="SModelDescriptor" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="1219669366780" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="1219669366781">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="1219669395111">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="8692480643148205009">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1219669286119" resolveInfo="myDescriptor" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="148290935931702978">
      <property name="name" nameId="tpck.1169194664001" value="isSuccessful" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.BooleanType" typeId="tpee.1070534644030" id="148290935931712764" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="148290935931702980" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="148290935931702981">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="148290935931712765">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="8692480643148204378">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="148290935931700617" resolveInfo="mySuccesful" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="1219740551235">
      <property name="name" nameId="tpck.1169194664001" value="getLoader" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="1219740556114">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="mwyq.~ClassLoader" resolveInfo="ClassLoader" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="1219740551237" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="1219740551238">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="1219744933249">
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="1219744933250">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="1219744951526">
              <node role="expression" roleId="tpee.1068581517676" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="1219744952841" />
            </node>
          </node>
          <node role="condition" roleId="tpee.1068580123160" type="tpee.EqualsExpression" typeId="tpee.1068580123152" id="1219744947647">
            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="1219744949103" />
            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="8692480643148205080">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6516969602351205800" resolveInfo="myHandler" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="1219740561099">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6516969602351205812">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6516969602351205807">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="8692480643148204388">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6516969602351205800" resolveInfo="myHandler" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6516969602351205811">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="50zc.~InMemoryJavaGenerationHandler%dgetCompiler()%cjetbrains%dmps%dcompiler%dJavaCompiler" resolveInfo="getCompiler" />
              </node>
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6516969602351205816">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="ejwt.~JavaCompiler%dgetClassLoader(java%dlang%dClassLoader)%cjava%dlang%dClassLoader" resolveInfo="getClassLoader" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6516969602351205817">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1219741072589" resolveInfo="parentLoader" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="1219741072589">
        <property name="name" nameId="tpck.1169194664001" value="parentLoader" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="1219934981627">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="mwyq.~ClassLoader" resolveInfo="ClassLoader" />
        </node>
      </node>
    </node>
    <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="1219411663048" />
    <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="1219669234496">
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="1219669245703">
        <property name="name" nameId="tpck.1169194664001" value="node" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="1239568232785" />
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="1219669245705">
        <property name="name" nameId="tpck.1169194664001" value="context" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="1219669245706">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="d8ec.~IOperationContext" resolveInfo="IOperationContext" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="1219669269757">
        <property name="name" nameId="tpck.1169194664001" value="modelDescriptor" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="1219669272931">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="d8ec.~SModelDescriptor" resolveInfo="SModelDescriptor" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="1219740839230">
        <property name="name" nameId="tpck.1169194664001" value="handler" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6516969602351205804">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="50zc.~InMemoryJavaGenerationHandler" resolveInfo="InMemoryJavaGenerationHandler" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="148290935931702966">
        <property name="name" nameId="tpck.1169194664001" value="succesful" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.BooleanType" typeId="tpee.1070534644030" id="148290935931702968" />
      </node>
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="1219669234497" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="1219669234499">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1219744483420">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="1219744484784">
            <node role="rValue" roleId="tpee.1068498886297" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="1219744487349">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1219669245705" resolveInfo="context" />
            </node>
            <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="8692480643148205130">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1219415867591" resolveInfo="myContext" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1219744495961">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="1219744497387">
            <node role="rValue" roleId="tpee.1068498886297" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="1219744500187">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1219669245703" resolveInfo="model" />
            </node>
            <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="8692480643148204040">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1219412374874" resolveInfo="myNode" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1219669347202">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="1219669348377">
            <node role="rValue" roleId="tpee.1068498886297" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="1219669351521">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1219669269757" resolveInfo="modelDescriptor" />
            </node>
            <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="8692480643148204248">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1219669286119" resolveInfo="myDescriptor" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1219740882757">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="1219740884136">
            <node role="rValue" roleId="tpee.1068498886297" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="1219740887764">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1219740839230" resolveInfo="type" />
            </node>
            <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="8692480643148204336">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6516969602351205800" resolveInfo="myHandler" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="148290935931702970">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="148290935931702974">
            <node role="rValue" roleId="tpee.1068498886297" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="148290935931702977">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="148290935931702966" resolveInfo="succesful" />
            </node>
            <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="8692480643148204236">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="148290935931700617" resolveInfo="mySuccesful" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="1219744797298">
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="1219744816042">
        <property name="name" nameId="tpck.1169194664001" value="node" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="1239568232756" />
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="1219744816044">
        <property name="name" nameId="tpck.1169194664001" value="context" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="1219744816045">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="d8ec.~IOperationContext" resolveInfo="IOperationContext" />
        </node>
      </node>
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="1219744797299" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="1219744797301">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1219744802553">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="1219744802554">
            <node role="rValue" roleId="tpee.1068498886297" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="1219744802555">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1219744816044" resolveInfo="context" />
            </node>
            <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="8692480643148205179">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1219415867591" resolveInfo="myContext" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1219744802574">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="1219744802575">
            <node role="rValue" roleId="tpee.1068498886297" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="1219744823547">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1219744816042" resolveInfo="node" />
            </node>
            <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="8692480643148204554">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1219412374874" resolveInfo="myNode" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="1219412374874">
      <property name="name" nameId="tpck.1169194664001" value="myNode" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="1219412374875" />
      <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="1239568232758" />
    </node>
    <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="6516969602351205800">
      <property name="name" nameId="tpck.1169194664001" value="myHandler" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="6516969602351205801" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6516969602351205803">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="50zc.~InMemoryJavaGenerationHandler" resolveInfo="InMemoryJavaGenerationHandler" />
      </node>
    </node>
    <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="1219415867591">
      <property name="name" nameId="tpck.1169194664001" value="myContext" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="1219415867592" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="1219415870521">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="d8ec.~IOperationContext" resolveInfo="IOperationContext" />
      </node>
    </node>
    <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="1219669286119">
      <property name="name" nameId="tpck.1169194664001" value="myDescriptor" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="1219669286120" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="1219669298060">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="d8ec.~SModelDescriptor" resolveInfo="SModelDescriptor" />
      </node>
    </node>
    <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="148290935931700617">
      <property name="name" nameId="tpck.1169194664001" value="mySuccesful" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="148290935931700618" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.BooleanType" typeId="tpee.1070534644030" id="148290935931702961" />
      <node role="initializer" roleId="tpee.1068431790190" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="148290935931702963">
        <property name="value" nameId="tpee.1068580123138" value="true" />
      </node>
    </node>
  </root>
  <root id="1220433141274">
    <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="1220433141276">
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="1220433141277" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="1220433141279">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.SuperConstructorInvocation" typeId="tpee.1070475587102" id="1220433474908">
          <link role="constructorDeclaration" roleId="tpee.1241540960362" targetNodeId="i09a.~JPanel%d&lt;init&gt;(java%dawt%dLayoutManager)" resolveInfo="JPanel" />
          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i09a.~JPanel%d&lt;init&gt;(java%dawt%dLayoutManager)" resolveInfo="JPanel" />
          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="1220433476893">
            <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="1220434122932">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="5p1m.~BorderLayout%d&lt;init&gt;()" resolveInfo="BorderLayout" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7184256428677640941">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="1200564340082201621">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7184256428677620033" resolveInfo="setEditor" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7184256428677640945">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1220433384466" resolveInfo="editor" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="1220433384466">
        <property name="name" nameId="tpck.1169194664001" value="editor" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="1220433384467">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="1bbd.~MPSFileNodeEditor" resolveInfo="MPSFileNodeEditor" />
        </node>
      </node>
    </node>
    <node role="superclass" roleId="tpee.1165602531693" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="1220433174913">
      <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i09a.~JPanel" resolveInfo="JPanel" />
    </node>
    <node role="implementedInterface" roleId="tpee.1095933932569" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="1220433179273">
      <link role="classifier" roleId="tpee.1107535924139" targetNodeId="ll11.~DataProvider" resolveInfo="DataProvider" />
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7184256428677620033">
      <property name="name" nameId="tpck.1169194664001" value="setEditor" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7184256428677620157">
        <property name="name" nameId="tpck.1169194664001" value="editor" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7184256428677620158">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="1bbd.~MPSFileNodeEditor" resolveInfo="MPSFileNodeEditor" />
        </node>
      </node>
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7184256428677620034" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7184256428677620035">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7184256428677640913">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7184256428677640917">
            <node role="rValue" roleId="tpee.1068498886297" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7184256428677640920">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7184256428677620157" resolveInfo="editor" />
            </node>
            <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="8692480643148204777">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1220433350457" resolveInfo="myFileNodeEditor" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7184256428677640922">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="1200564340082201886">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="5p1m.~Container%dremoveAll()%cvoid" resolveInfo="removeAll" />
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7184256428677640932">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="1200564340082201594">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="5p1m.~Container%dadd(java%dawt%dComponent,java%dlang%dObject)%cvoid" resolveInfo="add" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7184256428677640935">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7184256428677640936">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7184256428677620157" resolveInfo="editor" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7184256428677640937">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="1bbd.~MPSFileNodeEditor%dgetComponent()%cjavax%dswing%dJComponent" resolveInfo="getComponent" />
              </node>
            </node>
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="7184256428677640938">
              <link role="classifier" roleId="tpee.1144433057691" targetNodeId="5p1m.~BorderLayout" resolveInfo="BorderLayout" />
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5p1m.~BorderLayout%dCENTER" resolveInfo="CENTER" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="1220433215934">
      <property name="name" nameId="tpck.1169194664001" value="getData" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="1220433215935" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="1220433215936">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="mwyq.~Object" resolveInfo="Object" />
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="1220433215937">
        <property name="name" nameId="tpck.1169194664001" value="dataId" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="1225195954812" />
        <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="1220433215939">
          <link role="annotation" roleId="tpee.1188208074048" targetNodeId="qvoq.~NonNls" resolveInfo="NonNls" />
        </node>
      </node>
      <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="1220433215940">
        <link role="annotation" roleId="tpee.1188208074048" targetNodeId="qvoq.~Nullable" resolveInfo="Nullable" />
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="1220433215941">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="1220433232301">
          <node role="condition" roleId="tpee.1068580123160" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1220433232302">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="1220433250804">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1220433215937" resolveInfo="dataId" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="1220433232304">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="mwyq.~String%dequals(java%dlang%dObject)%cboolean" resolveInfo="equals" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1220433232305">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="1220433232306">
                  <link role="classifier" roleId="tpee.1144433057691" targetNodeId="jvm9.~MPSDataKeys" resolveInfo="MPSDataKeys" />
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="ll11.~PlatformDataKeys%dFILE_EDITOR" resolveInfo="FILE_EDITOR" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="1220433232307">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="ll11.~DataKey%dgetName()%cjava%dlang%dString" resolveInfo="getName" />
                </node>
              </node>
            </node>
          </node>
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="1220433232308">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="1220433232309">
              <node role="expression" roleId="tpee.1068581517676" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="8692480643148204432">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1220433350457" resolveInfo="myFileNodeEditor" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="1220433232313">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="1220433232314" />
        </node>
      </node>
    </node>
    <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="1220433350457">
      <property name="name" nameId="tpck.1169194664001" value="myFileNodeEditor" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="1220433350458" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="1220433354570">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="1bbd.~MPSFileNodeEditor" resolveInfo="MPSFileNodeEditor" />
      </node>
    </node>
  </root>
</model>

