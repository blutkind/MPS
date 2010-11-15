<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:00000000-0000-4000-0000-011c89590327(jetbrains.mps.baseLanguage.collections.behavior)">
  <persistence version="7" />
  <language namespace="83888646-71ce-4f1c-9c53-c54016f6ad4f(jetbrains.mps.baseLanguage.collections)" />
  <language namespace="7866978e-a0f0-4cc7-81bc-4d213d9375e1(jetbrains.mps.lang.smodel)" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="af65afd8-f0dd-4942-87d9-63a55f2a9db1(jetbrains.mps.lang.behavior)" />
  <language namespace="3a13115c-633c-4c5c-bbcc-75c4219e9555(jetbrains.mps.lang.quotation)" />
  <language namespace="ceab5195-25ea-4f22-9b92-103b95ca8c0c(jetbrains.mps.lang.core)" />
  <language namespace="fd392034-7849-419d-9071-12563d152375(jetbrains.mps.baseLanguage.closures)" />
  <language namespace="3f4bc5f5-c6c1-4a28-8b10-c83066ffa4a1(jetbrains.mps.lang.constraints)" />
  <language namespace="7a5dda62-9140-4668-ab76-d5ed1746f2b2(jetbrains.mps.lang.typesystem)" />
  <import index="yvix" modelUID="r:00000000-0000-4000-0000-011c8959032e(jetbrains.mps.baseLanguage.collections.structure)" version="7" />
  <import index="vhgx" modelUID="f:java_stub#java.lang(java.lang@java_stub)" version="-1" />
  <import index="6eoo" modelUID="f:java_stub#jetbrains.mps.util(jetbrains.mps.util@java_stub)" version="-1" />
  <import index="yvnz" modelUID="r:00000000-0000-4000-0000-011c89590282(jetbrains.mps.lang.core.behavior)" version="-1" />
  <import index="yvou" modelUID="r:00000000-0000-4000-0000-011c895902c0(jetbrains.mps.baseLanguage.behavior)" version="-1" />
  <import index="yvor" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" />
  <import index="yvnu" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" />
  <import index="yjwb" modelUID="f:java_stub#java.util(java.util@java_stub)" version="-1" />
  <import index="yvo4" modelUID="r:00000000-0000-4000-0000-011c895902b4(jetbrains.mps.lang.typesystem.structure)" version="3" />
  <import index="txlh" modelUID="f:java_stub#jetbrains.mps.project(jetbrains.mps.project@java_stub)" version="-1" />
  <import index="8n6q" modelUID="f:java_stub#jetbrains.mps.smodel(jetbrains.mps.smodel@java_stub)" version="-1" />
  <import index="35lb" modelUID="r:cf23edd7-256f-4b20-82d2-696c87889d85(jetbrains.mps.baseLanguage.collections.plugin)" version="-1" />
  <import index="zevl" modelUID="r:fc76aa36-3cff-41c7-b94b-eee0e8341932(jetbrains.mps.internal.collections.runtime)" version="-1" />
  <import index="yvim" modelUID="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.lang.smodel.structure)" version="16" implicit="yes" />
  <import index="yviq" modelUID="r:00000000-0000-4000-0000-011c89590338(jetbrains.mps.baseLanguage.closures.structure)" version="3" implicit="yes" />
  <import index="yvjf" modelUID="r:00000000-0000-4000-0000-011c8959034b(jetbrains.mps.lang.quotation.structure)" version="0" implicit="yes" />
  <import index="yvj1" modelUID="r:00000000-0000-4000-0000-011c89590327(jetbrains.mps.baseLanguage.collections.behavior)" version="-1" implicit="yes" />
  <import index="2rzm" modelUID="r:3270011d-8b2d-4938-8dff-d256a759e017(jetbrains.mps.lang.behavior.structure)" version="-1" implicit="yes" />
  <roots>
    <node type="2rzm.ConceptBehavior" typeId="2rzm.1225194240794" id="1213877245174">
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="sequence" />
      <link role="concept" roleId="2rzm.1225194240799" targetNodeId="yvix.1151689724996:7" resolveInfo="SequenceType" />
    </node>
    <node type="2rzm.ConceptBehavior" typeId="2rzm.1225194240794" id="1213877497462">
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="sequence" />
      <link role="concept" roleId="2rzm.1225194240799" targetNodeId="yvix.1151701983961:7" resolveInfo="SequenceOperation" />
    </node>
    <node type="2rzm.ConceptBehavior" typeId="2rzm.1225194240794" id="1213877511286">
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="list" />
      <link role="concept" roleId="2rzm.1225194240799" targetNodeId="yvix.1151688443754:7" resolveInfo="ListType" />
    </node>
    <node type="2rzm.ConceptBehavior" typeId="2rzm.1225194240794" id="1213877520358">
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="mapType" />
      <link role="concept" roleId="2rzm.1225194240799" targetNodeId="yvix.1197683403723:7" resolveInfo="MapType" />
    </node>
    <node type="2rzm.ConceptBehavior" typeId="2rzm.1225194240794" id="1213877532555">
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="mapType" />
      <link role="concept" roleId="2rzm.1225194240799" targetNodeId="yvix.1201225890326:7" resolveInfo="MapOperation" />
    </node>
    <node type="2rzm.ConceptBehavior" typeId="2rzm.1225194240794" id="1226515539540">
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="set" />
      <link role="concept" roleId="2rzm.1225194240799" targetNodeId="yvix.1226511727824:7" resolveInfo="SetType" />
    </node>
    <node type="2rzm.ConceptBehavior" typeId="2rzm.1225194240794" id="1237468611264">
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="iteratorEnumerator" />
      <link role="concept" roleId="2rzm.1225194240799" targetNodeId="yvix.1237467705688:7" resolveInfo="IteratorType" />
    </node>
    <node type="2rzm.ConceptBehavior" typeId="2rzm.1225194240794" id="1237496376141">
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="iteratorEnumerator" />
      <link role="concept" roleId="2rzm.1225194240799" targetNodeId="yvix.1237496250641:7" resolveInfo="EnumeratorType" />
    </node>
    <node type="2rzm.ConceptBehavior" typeId="2rzm.1225194240794" id="1237548270025">
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="sequence.closures" />
      <link role="concept" roleId="2rzm.1225194240799" targetNodeId="yvix.1224446583770:7" resolveInfo="SkipStatement" />
    </node>
    <node type="2rzm.ConceptBehavior" typeId="2rzm.1225194240794" id="1237722435323">
      <link role="concept" roleId="2rzm.1225194240799" targetNodeId="yvix.1237721394592:7" resolveInfo="AbstractContainerCreator" />
    </node>
    <node type="2rzm.ConceptBehavior" typeId="2rzm.1225194240794" id="1237724489609">
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="list" />
      <link role="concept" roleId="2rzm.1225194240799" targetNodeId="yvix.1160600644654:7" resolveInfo="ListCreatorWithInit" />
    </node>
    <node type="2rzm.ConceptBehavior" typeId="2rzm.1225194240794" id="1237724578571">
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="set" />
      <link role="concept" roleId="2rzm.1225194240799" targetNodeId="yvix.1226516258405:7" resolveInfo="HashSetCreator" />
    </node>
    <node type="2rzm.ConceptBehavior" typeId="2rzm.1225194240794" id="1237724603556">
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="list" />
      <link role="concept" roleId="2rzm.1225194240799" targetNodeId="yvix.1227008614712:7" resolveInfo="LinkedListCreator" />
    </node>
    <node type="2rzm.ConceptBehavior" typeId="2rzm.1225194240794" id="1237783270701">
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="sequence" />
      <link role="concept" roleId="2rzm.1225194240799" targetNodeId="yvix.1237783176940:7" resolveInfo="AllConstant" />
    </node>
    <node type="2rzm.ConceptBehavior" typeId="2rzm.1225194240794" id="1240239413630">
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="mapType" />
      <link role="concept" roleId="2rzm.1225194240799" targetNodeId="yvix.1240239337991:7" resolveInfo="SortedMapType" />
    </node>
    <node type="2rzm.ConceptBehavior" typeId="2rzm.1225194240794" id="1240249640915">
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="set" />
      <link role="concept" roleId="2rzm.1225194240799" targetNodeId="yvix.1240247491866:7" resolveInfo="SortedSetType" />
    </node>
    <node type="2rzm.ConceptBehavior" typeId="2rzm.1225194240794" id="1240249694731">
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="set" />
      <link role="concept" roleId="2rzm.1225194240799" targetNodeId="yvix.1240247536947:7" resolveInfo="TreeSetCreator" />
    </node>
    <node type="2rzm.ConceptBehavior" typeId="2rzm.1225194240794" id="1240823859791">
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="mapType" />
      <link role="concept" roleId="2rzm.1225194240799" targetNodeId="yvix.1240424373525:7" resolveInfo="MappingType" />
    </node>
    <node type="2rzm.ConceptBehavior" typeId="2rzm.1225194240794" id="5686963296372576518">
      <link role="concept" roleId="2rzm.1225194240799" targetNodeId="yvix.5686963296372573083:7" resolveInfo="AbstractContainerType" />
    </node>
    <node type="2rzm.ConceptBehavior" typeId="2rzm.1225194240794" id="2141797557973018586">
      <link role="concept" roleId="2rzm.1225194240799" targetNodeId="yvix.2141797557972817928:7" resolveInfo="ISequenceOperation" />
    </node>
    <node type="2rzm.ConceptBehavior" typeId="2rzm.1225194240794" id="2141797557973018609">
      <link role="concept" roleId="2rzm.1225194240799" targetNodeId="yvix.2141797557973018607:7" resolveInfo="IListOperation" />
    </node>
    <node type="2rzm.ConceptBehavior" typeId="2rzm.1225194240794" id="3358009230509337679">
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="queue" />
      <link role="concept" roleId="2rzm.1225194240799" targetNodeId="yvix.5686963296372475025:7" resolveInfo="QueueType" />
    </node>
    <node type="2rzm.ConceptBehavior" typeId="2rzm.1225194240794" id="3358009230509514611">
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="queue" />
      <link role="concept" roleId="2rzm.1225194240799" targetNodeId="yvix.3358009230509514604:7" resolveInfo="QueueCreator" />
    </node>
    <node type="2rzm.ConceptBehavior" typeId="2rzm.1225194240794" id="3358009230509734418">
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="queue.deque" />
      <link role="concept" roleId="2rzm.1225194240799" targetNodeId="yvix.3357971920378033937:7" resolveInfo="DequeType" />
    </node>
    <node type="2rzm.ConceptBehavior" typeId="2rzm.1225194240794" id="3358009230509812020">
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="stack" />
      <link role="concept" roleId="2rzm.1225194240799" targetNodeId="yvix.6801639034384703212:7" resolveInfo="StackType" />
    </node>
    <node type="2rzm.ConceptBehavior" typeId="2rzm.1225194240794" id="1331913329176106421">
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="customContainers" />
      <link role="concept" roleId="2rzm.1225194240799" targetNodeId="yvix.1331913329176106419:7" resolveInfo="CustomContainerCreator" />
    </node>
    <node type="yvor.ClassConcept" typeId="yvor.1068390468198:3" id="1331913329176269837">
      <property name="name" nameId="yvnu.1169194664001:0" value="CustomContainersUtil" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="customContainers" />
    </node>
    <node type="2rzm.ConceptBehavior" typeId="2rzm.1225194240794" id="1576845966386891472">
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="mapType" />
      <link role="concept" roleId="2rzm.1225194240799" targetNodeId="yvix.1576845966386891367:7" resolveInfo="CustomMapCreator" />
    </node>
    <node type="2rzm.ConceptBehavior" typeId="2rzm.1225194240794" id="3185788474596486341">
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="sequence.closures" />
      <link role="concept" roleId="2rzm.1225194240799" targetNodeId="yvix.1205679737078:7" resolveInfo="SortOperation" />
    </node>
  </roots>
  <root id="1213877245174">
    <node role="constructor" roleId="2rzm.1225194240801" type="2rzm.ConceptConstructorDeclaration" typeId="2rzm.1225194413805" id="1213877245175">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1213877245176" />
    </node>
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="1213877245177">
      <property name="name" nameId="yvnu.1169194664001:0" value="getPresentation" />
      <property name="isPrivate" nameId="2rzm.1225194472833" value="false" />
      <link role="overriddenMethod" roleId="2rzm.1225194472831" targetNodeId="yvnz.1213877396640" resolveInfo="getPresentation" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1213877245178">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1213877245179">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1213877245181">
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1213877245182">
              <property name="value" nameId="yvor.1070475926801:3" value="&gt;" />
            </node>
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1213877245180">
              <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1213877245188">
                <property name="value" nameId="yvor.1070475926801:3" value="sequence&lt;" />
              </node>
              <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1213877245183">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1213877245184">
                  <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1213877245185" />
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1213877245186">
                    <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1151689745422:7" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ConceptMethodCall" typeId="yvim.1179409122411:16" id="1213877245187">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvnz.1213877396640" resolveInfo="getPresentation" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.StringType" typeId="yvor.1225271177708:3" id="4887793210800602584" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1219155724263" />
    </node>
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="1213877245190">
      <property name="name" nameId="yvnu.1169194664001:0" value="getVariableSuffixes" />
      <property name="isPrivate" nameId="2rzm.1225194472833" value="false" />
      <link role="overriddenMethod" roleId="2rzm.1225194472831" targetNodeId="yvou.1213877337304" resolveInfo="getVariableSuffixes" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1213877245191">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1213877245192">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1213877245193">
            <property name="name" nameId="yvnu.1169194664001:0" value="variableSuffixes" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.ListType" typeId="yvix.1151688443754:7" id="1213877245194">
              <node role="elementType" roleId="yvix.1151688676805:7" type="yvor.StringType" typeId="yvor.1225271177708:3" id="4887793210800602581" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1213877245196">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvix.ListCreatorWithInit" typeId="yvix.1160600644654:7" id="1213877245197">
                <node role="elementType" roleId="yvix.1237721435807:7" type="yvor.StringType" typeId="yvor.1225271177708:3" id="4887793210800602585" />
                <node role="initValue" roleId="yvix.1237721435808:7" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1213877245199">
                  <property name="value" nameId="yvor.1070475926801:3" value="seq" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1213877245200">
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1213877245201">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1447667470349161983">
              <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1447667470349161984">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvix.ForEachStatement" typeId="yvix.1153943597977:7" id="1447667470349200717">
                  <node role="variable" roleId="yvix.1153944400369:7" type="yvix.ForEachVariable" typeId="yvix.1153944193378:7" id="1447667470349200718">
                    <property name="name" nameId="yvnu.1169194664001:0" value="suffix" />
                  </node>
                  <node role="inputSequence" roleId="yvix.1153944424730:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1447667470349200719">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1447667470349200720">
                      <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1447667470349200721" />
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1447667470349200737">
                        <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1151689745422:7" />
                      </node>
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ConceptMethodCall" typeId="yvim.1179409122411:16" id="1447667470349200723">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvou.1213877337304" resolveInfo="getVariableSuffixes" />
                    </node>
                  </node>
                  <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1447667470349200724">
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1447667470349200725">
                      <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1447667470349200726">
                        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1447667470349200727">
                          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1447667470349200728">
                            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1447667470349200729">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1213877245193" resolveInfo="variableSuffixes" />
                            </node>
                            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddElementOperation" typeId="yvix.1160612413312:7" id="1447667470349200730">
                              <node role="argument" roleId="yvix.1160612519549:7" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="1447667470349200731">
                                <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="1447667470349200718" resolveInfo="suffix" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotExpression" typeId="yvor.1081516740877:3" id="1447667470349200732">
                        <node role="expression" roleId="yvor.1081516765348:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1447667470349200733">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1447667470349200734">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1213877245193" resolveInfo="variableSuffixes" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvix.ContainsOperation" typeId="yvix.1172254888721:7" id="1447667470349200735">
                            <node role="argument" roleId="yvix.1172256416782:7" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="1447667470349200736">
                              <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="1447667470349200718" resolveInfo="suffix" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1447667470349161986">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1447667470349161987">
                  <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1447667470349161988" />
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1447667470349162017">
                    <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1151689745422:7" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ConceptMethodCall" typeId="yvim.1179409122411:16" id="1447667470349161990">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvou.1447667470349154499" resolveInfo="hasPluralVariableSuffixes" />
                </node>
              </node>
              <node role="ifFalseStatement" roleId="yvor.1082485599094:3" type="yvor.BlockStatement" typeId="yvor.1082485599095:3" id="1447667470349161991">
                <node role="statements" roleId="yvor.1082485599096:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1447667470349161992">
                  <node role="statement" roleId="yvor.1068581517665:3" type="yvix.ForEachStatement" typeId="yvix.1153943597977:7" id="1213877245202">
                    <node role="variable" roleId="yvix.1153944400369:7" type="yvix.ForEachVariable" typeId="yvix.1153944193378:7" id="1213877245203">
                      <property name="name" nameId="yvnu.1169194664001:0" value="suffix" />
                    </node>
                    <node role="inputSequence" roleId="yvix.1153944424730:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1213877245204">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1213877245205">
                        <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1213877245206" />
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1213877245207">
                          <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1151689745422:7" />
                        </node>
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ConceptMethodCall" typeId="yvim.1179409122411:16" id="1213877245208">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvou.1213877337304" resolveInfo="getVariableSuffixes" />
                      </node>
                    </node>
                    <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1213877245209">
                      <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1213877245210">
                        <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1213877245211">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1213877245212">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1213877245193" resolveInfo="variableSuffixes" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddElementOperation" typeId="yvix.1160612413312:7" id="1213877245213">
                            <node role="argument" roleId="yvix.1160612519549:7" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1213877245214">
                              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="6eoo.~NameUtil%dpluralize(java%dlang%dString)%cjava%dlang%dString" resolveInfo="pluralize" />
                              <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="6eoo.~NameUtil" resolveInfo="NameUtil" />
                              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="1213877245215">
                                <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="1213877245203" resolveInfo="suffix" />
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
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1213877245216">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1213877245217">
              <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1213877245218" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1213877245219">
                <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1151689745422:7" />
              </node>
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_IsNotNullOperation" typeId="yvim.1172008320231:16" id="1213877245220" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1213877245221">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1213877245222">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1213877245193" resolveInfo="variableSuffixes" />
          </node>
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvix.ListType" typeId="yvix.1151688443754:7" id="1213877245223">
        <node role="elementType" roleId="yvix.1151688676805:7" type="yvor.StringType" typeId="yvor.1225271177708:3" id="4887793210800602578" />
      </node>
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1219155723911" />
    </node>
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="1447667470349161952">
      <property name="name" nameId="yvnu.1169194664001:0" value="hasPluralVariableSuffixes" />
      <link role="overriddenMethod" roleId="2rzm.1225194472831" targetNodeId="yvou.1447667470349154499" resolveInfo="hasPluralVariableSuffixes" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1447667470349161953">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1447667470349161954">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="1447667470349161955">
            <property name="value" nameId="yvor.1068580123138:3" value="true" />
          </node>
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.BooleanType" typeId="yvor.1070534644030:3" id="1447667470349161956" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.ProtectedVisibility" typeId="yvor.1146644641414:3" id="1447667470349161957" />
    </node>
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="1235575347098">
      <property name="name" nameId="yvnu.1169194664001:0" value="getAbstractCreators" />
      <link role="overriddenMethod" roleId="2rzm.1225194472831" targetNodeId="yvou.1226945293888" resolveInfo="getAbstractCreators" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1235575347100">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1235575368807">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1235575368808">
            <property name="name" nameId="yvnu.1169194664001:0" value="result" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="1235575368809">
              <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvor.1145552809883:3" resolveInfo="AbstractCreator" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1235575376727">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvim.SNodeListCreator" typeId="yvim.1145567426890:16" id="1235575376728">
                <node role="createdType" roleId="yvim.1145567471833:16" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="1235575376729">
                  <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvor.1145552809883:3" resolveInfo="AbstractCreator" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1235575391411">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1235575391412">
            <property name="name" nameId="yvnu.1169194664001:0" value="seqCreator" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1235575391413">
              <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvix.1224414427926:7" resolveInfo="SequenceCreator" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1235575391414">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvim.SNodeCreator" typeId="yvim.1180636770613:16" id="1235575391415">
                <node role="createdType" roleId="yvim.1180636770616:16" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1235575391416">
                  <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvix.1224414427926:7" resolveInfo="SequenceCreator" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1235575391417">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1235575391418">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1235575391419">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1235575391420">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1235575391412" resolveInfo="creator" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1235575391421">
                <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1224414456414:7" />
              </node>
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Link_SetTargetOperation" typeId="yvim.1140725362528:16" id="1235575391422">
              <node role="linkTarget" roleId="yvim.1140725362529:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1235575391423">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1235575391424">
                  <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1235575391425" />
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1235575391426">
                    <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1151689745422:7" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_CopyOperation" typeId="yvim.1144146199828:16" id="1235575391427" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1235575397086">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1235575397739">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1235575397087">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1235575368808" resolveInfo="result" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddElementOperation" typeId="yvix.1160612413312:7" id="1235575401168">
              <node role="argument" roleId="yvix.1160612519549:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1235575404056">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1235575391412" resolveInfo="creator" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1235575416914">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1235575416915">
            <property name="name" nameId="yvnu.1169194664001:0" value="singCreator" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1235575416916">
              <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvix.1235573135402:7" resolveInfo="SingletonSequenceCreator" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1235575416917">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvim.SNodeCreator" typeId="yvim.1180636770613:16" id="1235575416918">
                <node role="createdType" roleId="yvim.1180636770616:16" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1235575416919">
                  <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvix.1235573135402:7" resolveInfo="SingletonSequenceCreator" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1235575416921">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1235575416922">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1235575416923">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1235575416924">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1235575416915" resolveInfo="seqCreator" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1235575416925">
                <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1224414456414:7" />
              </node>
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Link_SetTargetOperation" typeId="yvim.1140725362528:16" id="1235575416926">
              <node role="linkTarget" roleId="yvim.1140725362529:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1235575416927">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1235575416928">
                  <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1235575416929" />
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1235575416930">
                    <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1151689745422:7" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_CopyOperation" typeId="yvim.1144146199828:16" id="1235575416931" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1235575432703">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1235575433900">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1235575432704">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1235575368808" resolveInfo="result" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddElementOperation" typeId="yvix.1160612413312:7" id="1235575435165">
              <node role="argument" roleId="yvix.1160612519549:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1235575436470">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1235575416915" resolveInfo="singCreator" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1235575439927">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1235575440756">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1235575368808" resolveInfo="result" />
          </node>
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="1235575355772">
        <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvor.1145552809883:3" resolveInfo="AbstractCreator" />
      </node>
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1235575444889" />
    </node>
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="3078742637637080244">
      <property name="name" nameId="yvnu.1169194664001:0" value="getClassExpression" />
      <property name="isPrivate" nameId="2rzm.1225194472833" value="false" />
      <link role="overriddenMethod" roleId="2rzm.1225194472831" targetNodeId="yvou.1213877337357" resolveInfo="getClassExpression" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="3078742637637080245">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="3078742637637080246">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvjf.Quotation" typeId="yvjf.1196350785113:0" id="3078742637637080247">
            <node role="quotedNode" roleId="yvjf.1196350785114:0" type="yvor.ClassifierClassExpression" typeId="yvor.1116615150612:3" id="3078742637637080251">
              <link role="classifier" roleId="yvor.1116615189566:3" targetNodeId="zevl.6543581031674024311" resolveInfo="ISequence" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="3078742637637080249">
        <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
      </node>
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="3078742637637080250" />
    </node>
  </root>
  <root id="1213877497462">
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="1213877497463">
      <property name="name" nameId="yvnu.1169194664001:0" value="getLeft" />
      <property name="isPrivate" nameId="2rzm.1225194472833" value="false" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1213877497464">
        <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
      </node>
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1213877497465">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1213877497466">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1213877497467">
            <property name="name" nameId="yvnu.1169194664001:0" value="operand" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1213877497468">
              <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1213877497469">
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1213877497470">
                <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvor.1197027771414:3" />
              </node>
              <node role="operand" roleId="yvor.1197027771414:3" type="yvim.SNodeTypeCastExpression" typeId="yvim.1140137987495:16" id="1213877497471">
                <link role="concept" roleId="yvim.1140138128738:16" targetNodeId="yvor.1197027756228:3" resolveInfo="DotExpression" />
                <node role="leftExpression" roleId="yvim.1140138123956:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1213877497472">
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_GetParentOperation" typeId="yvim.1139613262185:16" id="1213877497473" />
                  <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1213877497474" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1213877497492">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1213877497493">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1213877497467" resolveInfo="operand" />
          </node>
        </node>
      </node>
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1219155723902" />
    </node>
    <node role="constructor" roleId="2rzm.1225194240801" type="2rzm.ConceptConstructorDeclaration" typeId="2rzm.1225194413805" id="1213877497494">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1213877497495" />
    </node>
  </root>
  <root id="1213877511286">
    <node role="constructor" roleId="2rzm.1225194240801" type="2rzm.ConceptConstructorDeclaration" typeId="2rzm.1225194413805" id="1213877511287">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1213877511288" />
    </node>
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="1213877511289">
      <property name="name" nameId="yvnu.1169194664001:0" value="getPresentation" />
      <property name="isPrivate" nameId="2rzm.1225194472833" value="false" />
      <link role="overriddenMethod" roleId="2rzm.1225194472831" targetNodeId="yvnz.1213877396640" resolveInfo="getPresentation" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1213877511290">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1213877511291">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1213877511293">
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1213877511294">
              <property name="value" nameId="yvor.1070475926801:3" value="&gt;" />
            </node>
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1213877511292">
              <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="3358009230509561324">
                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3358009230509562488">
                  <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="3358009230509562487" />
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SConceptPropertyAccess" typeId="yvim.1145994841052:16" id="3358009230509562492">
                    <link role="conceptProperty" roleId="yvim.1145994841055:16" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
                  </node>
                </node>
                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1213877511300">
                  <property name="value" nameId="yvor.1070475926801:3" value="&lt;" />
                </node>
              </node>
              <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1213877511295">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1213877511296">
                  <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1213877511297" />
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1213877511298">
                    <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1151688676805:7" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ConceptMethodCall" typeId="yvim.1179409122411:16" id="1213877511299">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvnz.1213877396640" resolveInfo="getPresentation" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.StringType" typeId="yvor.1225271177708:3" id="4887793210800602559" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1219155724420" />
    </node>
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="1213877511302">
      <property name="name" nameId="yvnu.1169194664001:0" value="getVariableSuffixes" />
      <property name="isPrivate" nameId="2rzm.1225194472833" value="false" />
      <link role="overriddenMethod" roleId="2rzm.1225194472831" targetNodeId="yvou.1213877337304" resolveInfo="getVariableSuffixes" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1213877511303">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1213877511304">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1213877511305">
            <property name="name" nameId="yvnu.1169194664001:0" value="variableSuffixes" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.ListType" typeId="yvix.1151688443754:7" id="1213877511306">
              <node role="elementType" roleId="yvix.1151688676805:7" type="yvor.StringType" typeId="yvor.1225271177708:3" id="4887793210800602560" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1213877511308">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvix.ListCreatorWithInit" typeId="yvix.1160600644654:7" id="1213877511309">
                <node role="elementType" roleId="yvix.1237721435807:7" type="yvor.StringType" typeId="yvor.1225271177708:3" id="4887793210800602563" />
                <node role="initValue" roleId="yvix.1237721435808:7" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1213877511311">
                  <property name="value" nameId="yvor.1070475926801:3" value="list" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1213877511312">
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1213877511313">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1447667470349161965">
              <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1447667470349161966">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvix.ForEachStatement" typeId="yvix.1153943597977:7" id="1447667470349200691">
                  <node role="variable" roleId="yvix.1153944400369:7" type="yvix.ForEachVariable" typeId="yvix.1153944193378:7" id="1447667470349200692">
                    <property name="name" nameId="yvnu.1169194664001:0" value="suffix" />
                  </node>
                  <node role="inputSequence" roleId="yvix.1153944424730:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1447667470349200693">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1447667470349200694">
                      <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1447667470349200695" />
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1447667470349200711">
                        <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1151688676805:7" />
                      </node>
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ConceptMethodCall" typeId="yvim.1179409122411:16" id="1447667470349200697">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvou.1213877337304" resolveInfo="getVariableSuffixes" />
                    </node>
                  </node>
                  <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1447667470349200698">
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1447667470349200699">
                      <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1447667470349200700">
                        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1447667470349200701">
                          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1447667470349200702">
                            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1447667470349200703">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1213877511305" resolveInfo="variableSuffixes" />
                            </node>
                            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddElementOperation" typeId="yvix.1160612413312:7" id="1447667470349200704">
                              <node role="argument" roleId="yvix.1160612519549:7" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="1447667470349200705">
                                <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="1447667470349200692" resolveInfo="suffix" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotExpression" typeId="yvor.1081516740877:3" id="1447667470349200706">
                        <node role="expression" roleId="yvor.1081516765348:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1447667470349200707">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1447667470349200708">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1213877511305" resolveInfo="variableSuffixes" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvix.ContainsOperation" typeId="yvix.1172254888721:7" id="1447667470349200709">
                            <node role="argument" roleId="yvix.1172256416782:7" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="1447667470349200710">
                              <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="1447667470349200692" resolveInfo="suffix" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1447667470349161975">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1447667470349161970">
                  <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1447667470349161969" />
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1447667470349161974">
                    <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1151688676805:7" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ConceptMethodCall" typeId="yvim.1179409122411:16" id="1447667470349161979">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvou.1447667470349154499" resolveInfo="hasPluralVariableSuffixes" />
                </node>
              </node>
              <node role="ifFalseStatement" roleId="yvor.1082485599094:3" type="yvor.BlockStatement" typeId="yvor.1082485599095:3" id="1447667470349161980">
                <node role="statements" roleId="yvor.1082485599096:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1447667470349161981">
                  <node role="statement" roleId="yvor.1068581517665:3" type="yvix.ForEachStatement" typeId="yvix.1153943597977:7" id="1213877511314">
                    <node role="variable" roleId="yvix.1153944400369:7" type="yvix.ForEachVariable" typeId="yvix.1153944193378:7" id="1213877511315">
                      <property name="name" nameId="yvnu.1169194664001:0" value="suffix" />
                    </node>
                    <node role="inputSequence" roleId="yvix.1153944424730:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1213877511316">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1213877511317">
                        <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1213877511318" />
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1213877511319">
                          <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1151688676805:7" />
                        </node>
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ConceptMethodCall" typeId="yvim.1179409122411:16" id="1213877511320">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvou.1213877337304" resolveInfo="getVariableSuffixes" />
                      </node>
                    </node>
                    <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1213877511321">
                      <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1213877511322">
                        <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1213877511323">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1213877511324">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1213877511305" resolveInfo="variableSuffixes" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddElementOperation" typeId="yvix.1160612413312:7" id="1213877511325">
                            <node role="argument" roleId="yvix.1160612519549:7" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1213877511326">
                              <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="6eoo.~NameUtil" resolveInfo="NameUtil" />
                              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="6eoo.~NameUtil%dpluralize(java%dlang%dString)%cjava%dlang%dString" resolveInfo="pluralize" />
                              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="1213877511327">
                                <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="1213877511315" resolveInfo="suffix" />
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
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1213877511328">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1213877511329">
              <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1213877511330" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1213877511331">
                <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1151688676805:7" />
              </node>
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_IsNotNullOperation" typeId="yvim.1172008320231:16" id="1213877511332" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1213877511333">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1213877511334">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1213877511305" resolveInfo="variableSuffixes" />
          </node>
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvix.ListType" typeId="yvix.1151688443754:7" id="1213877511335">
        <node role="elementType" roleId="yvix.1151688676805:7" type="yvor.StringType" typeId="yvor.1225271177708:3" id="4887793210800602556" />
      </node>
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1219155724355" />
    </node>
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="1447667470349161946">
      <property name="name" nameId="yvnu.1169194664001:0" value="hasPluralVariableSuffixes" />
      <link role="overriddenMethod" roleId="2rzm.1225194472831" targetNodeId="yvou.1447667470349154499" resolveInfo="hasPluralVariableSuffixes" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1447667470349161947">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1447667470349161948">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="1447667470349161949">
            <property name="value" nameId="yvor.1068580123138:3" value="true" />
          </node>
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.BooleanType" typeId="yvor.1070534644030:3" id="1447667470349161950" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.ProtectedVisibility" typeId="yvor.1146644641414:3" id="1447667470349161951" />
    </node>
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="1213877511337">
      <property name="name" nameId="yvnu.1169194664001:0" value="getAbstractCreator" />
      <property name="isPrivate" nameId="2rzm.1225194472833" value="false" />
      <link role="overriddenMethod" roleId="2rzm.1225194472831" targetNodeId="yvou.1213877337340" resolveInfo="getAbstractCreator" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1213877511338">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1213877511339">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1213877511340">
            <property name="name" nameId="yvnu.1169194664001:0" value="creator" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1213877511341">
              <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvix.1160600644654:7" resolveInfo="ListCreatorWithInit" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1213877511342">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvim.SNodeCreator" typeId="yvim.1180636770613:16" id="1213877511343">
                <node role="createdType" roleId="yvim.1180636770616:16" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1213877511344">
                  <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvix.1160600644654:7" resolveInfo="ListCreatorWithInit" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1213877511345">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1213877511346">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1213877511347">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1213877511348">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1213877511340" resolveInfo="creator" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1237725091198">
                <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1237721435807:7" />
              </node>
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Link_SetTargetOperation" typeId="yvim.1140725362528:16" id="1213877511350">
              <node role="linkTarget" roleId="yvim.1140725362529:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1213877511351">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1213877511352">
                  <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1213877511353" />
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1213877511354">
                    <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1151688676805:7" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_CopyOperation" typeId="yvim.1144146199828:16" id="1213877511355" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1213877511356">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1213877511357">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1213877511340" resolveInfo="creator" />
          </node>
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1213877511358">
        <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvor.1145552809883:3" resolveInfo="AbstractCreator" />
      </node>
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1219155724866" />
    </node>
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="7602110602933345720">
      <property name="name" nameId="yvnu.1169194664001:0" value="getAbstractCreators" />
      <property name="isVirtual" nameId="2rzm.1225194472832" value="true" />
      <link role="overriddenMethod" roleId="2rzm.1225194472831" targetNodeId="yvou.7602110602933317830" resolveInfo="getAbstractCreators" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="7602110602933345721" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="7602110602933345722">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1227009867418">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1227009867419">
            <property name="name" nameId="yvnu.1169194664001:0" value="res" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="1227009867421">
              <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvor.1145552809883:3" resolveInfo="AbstractCreator" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1227009872453">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvim.SNodeListCreator" typeId="yvim.1145567426890:16" id="1227009872454">
                <node role="createdType" roleId="yvim.1145567471833:16" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="1227009872455">
                  <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvor.1145552809883:3" resolveInfo="AbstractCreator" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1227009884961">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1227009884962">
            <property name="name" nameId="yvnu.1169194664001:0" value="lc" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1227009884963">
              <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvix.1160600644654:7" resolveInfo="ListCreatorWithInit" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1227009884964">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvim.SNodeCreator" typeId="yvim.1180636770613:16" id="1227009884965">
                <node role="createdType" roleId="yvim.1180636770616:16" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1227009884966">
                  <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvix.1160600644654:7" resolveInfo="ListCreatorWithInit" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1227009884967">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1227009884968">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1227009884969">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1227009884970">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1227009884962" resolveInfo="creator" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1237725103290">
                <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1237721435807:7" />
              </node>
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Link_SetTargetOperation" typeId="yvim.1140725362528:16" id="1227009884972">
              <node role="linkTarget" roleId="yvim.1140725362529:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1227009884973">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1227009884974">
                  <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1227009884975" />
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1227009884976">
                    <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1151688676805:7" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_CopyOperation" typeId="yvim.1144146199828:16" id="1227009884977" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1227009893452">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1227009895957">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1227009893453">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1227009867419" resolveInfo="res" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddElementOperation" typeId="yvix.1160612413312:7" id="1227009899885">
              <node role="argument" roleId="yvix.1160612519549:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1227009901609">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1227009884962" resolveInfo="creator" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1227009917853">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1227009917854">
            <property name="name" nameId="yvnu.1169194664001:0" value="llc" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1227009917855">
              <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvix.1227008614712:7" resolveInfo="LinkedListCreator" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1227009917856">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvim.SNodeCreator" typeId="yvim.1180636770613:16" id="1227009917857">
                <node role="createdType" roleId="yvim.1180636770616:16" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1227009917858">
                  <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvix.1227008614712:7" resolveInfo="LinkedListCreator" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1227009917859">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1227009917860">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1227009917861">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1227009917862">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1227009917854" resolveInfo="lc" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1237725107477">
                <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1237721435807:7" />
              </node>
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Link_SetTargetOperation" typeId="yvim.1140725362528:16" id="1227009917864">
              <node role="linkTarget" roleId="yvim.1140725362529:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1227009917865">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1227009917866">
                  <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1227009917867" />
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1227009917868">
                    <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1151688676805:7" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_CopyOperation" typeId="yvim.1144146199828:16" id="1227009917869" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1227009937823">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1227009937824">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1227009937825">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1227009867419" resolveInfo="res" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddElementOperation" typeId="yvix.1160612413312:7" id="1227009937826">
              <node role="argument" roleId="yvix.1160612519549:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1227009940332">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1227009917854" resolveInfo="llc" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1331913329176292169">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1331913329176292171">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1331913329176292170">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1227009867419" resolveInfo="res" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddAllElementsOperation" typeId="yvix.1160666733551:7" id="1331913329176292175">
              <node role="argument" roleId="yvix.1160666822012:7" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1331913329176292188">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1331913329176269843" resolveInfo="creators" />
                <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="1331913329176269837" resolveInfo="CustomContainersUtil" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="7602110602933345736">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7602110602933345723" resolveInfo="targetModel" />
                </node>
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="7602110602933345748" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1227009962009">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1227009962010">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1227009867419" resolveInfo="res" />
          </node>
        </node>
      </node>
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="7602110602933345723">
        <property name="name" nameId="yvnu.1169194664001:0" value="targetModel" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SModelType" typeId="yvim.1143226024141:16" id="7602110602933345724" />
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="7602110602933345725">
        <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvor.1145552809883:3" resolveInfo="AbstractCreator" />
      </node>
    </node>
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="3078742637637080209">
      <property name="name" nameId="yvnu.1169194664001:0" value="getClassExpression" />
      <property name="isPrivate" nameId="2rzm.1225194472833" value="false" />
      <link role="overriddenMethod" roleId="2rzm.1225194472831" targetNodeId="yvou.1213877337357" resolveInfo="getClassExpression" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="3078742637637080210">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="3078742637637080211">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvjf.Quotation" typeId="yvjf.1196350785113:0" id="3078742637637080212">
            <node role="quotedNode" roleId="yvjf.1196350785114:0" type="yvor.ClassifierClassExpression" typeId="yvor.1116615150612:3" id="3078742637637080216">
              <link role="classifier" roleId="yvor.1116615189566:3" targetNodeId="yjwb.~List" resolveInfo="List" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="3078742637637080214">
        <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
      </node>
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="3078742637637080215" />
    </node>
  </root>
  <root id="1213877520358">
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="1213877520359">
      <property name="name" nameId="yvnu.1169194664001:0" value="getPresentation" />
      <property name="isPrivate" nameId="2rzm.1225194472833" value="false" />
      <link role="overriddenMethod" roleId="2rzm.1225194472831" targetNodeId="yvnz.1213877396640" resolveInfo="getPresentation" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1213877520360">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1213877520361">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1213877520365">
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1213877520366">
              <property name="value" nameId="yvor.1070475926801:3" value="&gt;" />
            </node>
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1213877520364">
              <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1213877520363">
                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1213877520362">
                  <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1240239394639">
                    <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240239399864">
                      <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1240239399792" />
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SConceptPropertyAccess" typeId="yvim.1145994841052:16" id="1240239405333">
                        <link role="conceptProperty" roleId="yvim.1145994841055:16" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
                      </node>
                    </node>
                    <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1213877520378">
                      <property name="value" nameId="yvor.1070475926801:3" value="&lt;" />
                    </node>
                  </node>
                  <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1213877520373">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1213877520374">
                      <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1213877520375" />
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1213877520376">
                        <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1197683466920:7" />
                      </node>
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ConceptMethodCall" typeId="yvim.1179409122411:16" id="1213877520377">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvnz.1213877396640" resolveInfo="getPresentation" />
                    </node>
                  </node>
                </node>
                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1213877520372">
                  <property name="value" nameId="yvor.1070475926801:3" value="," />
                </node>
              </node>
              <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1213877520367">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1213877520368">
                  <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1213877520369" />
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1213877520370">
                    <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1197683475734:7" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ConceptMethodCall" typeId="yvim.1179409122411:16" id="1213877520371">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvnz.1213877396640" resolveInfo="getPresentation" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.StringType" typeId="yvor.1225271177708:3" id="4887793210800602568" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1219155724032" />
    </node>
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="7602110602933345772">
      <property name="name" nameId="yvnu.1169194664001:0" value="getAbstractCreators" />
      <property name="isVirtual" nameId="2rzm.1225194472832" value="true" />
      <link role="overriddenMethod" roleId="2rzm.1225194472831" targetNodeId="yvou.7602110602933317830" resolveInfo="getAbstractCreators" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="7602110602933345773" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="7602110602933345774">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1240216995250">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1240216995251">
            <property name="name" nameId="yvnu.1169194664001:0" value="result" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="1240216995252">
              <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvor.1145552809883:3" resolveInfo="AbstractCreator" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1240217160748">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvim.SNodeListCreator" typeId="yvim.1145567426890:16" id="1240217160749">
                <node role="createdType" roleId="yvim.1145567471833:16" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="1240217160750">
                  <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvor.1145552809883:3" resolveInfo="AbstractCreator" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1240217164006">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240217164359">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1240217164007">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1240216995251" resolveInfo="result" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddElementOperation" typeId="yvix.1160612413312:7" id="1240217172038">
              <node role="argument" roleId="yvix.1160612519549:7" type="yvjf.Quotation" typeId="yvjf.1196350785113:0" id="1240217184126">
                <node role="quotedNode" roleId="yvjf.1196350785114:0" type="yvix.HashMapCreator" typeId="yvix.1197686869805:7" id="1240217191166">
                  <node role="keyType" roleId="yvix.1197687026896:7" type="yvor.Type" typeId="yvor.1068431790189:3" id="1240217191167">
                    <node role="_attr_$attribute" type="yvjf.Antiquotation" typeId="yvjf.1196350785112:0" id="1240217192664">
                      <node role="expression" roleId="yvjf.1196350785111:0" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240217196278">
                        <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1240217196113" />
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1240217197064">
                          <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1197683466920:7" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="valueType" roleId="yvix.1197687035757:7" type="yvor.Type" typeId="yvor.1068431790189:3" id="1240217191168">
                    <node role="_attr_$attribute" type="yvjf.Antiquotation" typeId="yvjf.1196350785112:0" id="1240217200632">
                      <node role="expression" roleId="yvjf.1196350785111:0" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240217201769">
                        <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1240217201623" />
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1240217202626">
                          <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1197683475734:7" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1240217206225">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240217206447">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1240217206226">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1240216995251" resolveInfo="result" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddElementOperation" typeId="yvix.1160612413312:7" id="1240217208210">
              <node role="argument" roleId="yvix.1160612519549:7" type="yvjf.Quotation" typeId="yvjf.1196350785113:0" id="1240217210566">
                <node role="quotedNode" roleId="yvjf.1196350785114:0" type="yvix.LinkedHashMapCreator" typeId="yvix.1240216724530:7" id="1240217217926">
                  <node role="keyType" roleId="yvix.1197687026896:7" type="yvor.Type" typeId="yvor.1068431790189:3" id="1240217217927">
                    <node role="_attr_$attribute" type="yvjf.Antiquotation" typeId="yvjf.1196350785112:0" id="1240217219617">
                      <node role="expression" roleId="yvjf.1196350785111:0" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240217221108">
                        <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1240217220927" />
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1240217222810">
                          <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1197683466920:7" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="valueType" roleId="yvix.1197687035757:7" type="yvor.Type" typeId="yvor.1068431790189:3" id="1240217217928">
                    <node role="_attr_$attribute" type="yvjf.Antiquotation" typeId="yvjf.1196350785112:0" id="1240217225938">
                      <node role="expression" roleId="yvjf.1196350785111:0" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240217227189">
                        <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1240217227026" />
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1240217228249">
                          <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1197683475734:7" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1576845966386920614">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1576845966386920615">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1576845966386920624">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1240216995251" resolveInfo="result" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddAllElementsOperation" typeId="yvix.1160666733551:7" id="1576845966386920617">
              <node role="argument" roleId="yvix.1160666822012:7" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1576845966386920618">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1331913329176269843" resolveInfo="creators" />
                <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="1331913329176269837" resolveInfo="CustomContainersUtil" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="7602110602933345794">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7602110602933345775" resolveInfo="targetModel" />
                </node>
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1576845966386920619" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1240217231264">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1240217231265">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1240216995251" resolveInfo="result" />
          </node>
        </node>
      </node>
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="7602110602933345775">
        <property name="name" nameId="yvnu.1169194664001:0" value="targetModel" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SModelType" typeId="yvim.1143226024141:16" id="7602110602933345776" />
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="7602110602933345777">
        <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvor.1145552809883:3" resolveInfo="AbstractCreator" />
      </node>
    </node>
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="3078742637637080191">
      <property name="name" nameId="yvnu.1169194664001:0" value="getClassExpression" />
      <property name="isPrivate" nameId="2rzm.1225194472833" value="false" />
      <link role="overriddenMethod" roleId="2rzm.1225194472831" targetNodeId="yvou.1213877337357" resolveInfo="getClassExpression" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="3078742637637080192">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="3078742637637080193">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvjf.Quotation" typeId="yvjf.1196350785113:0" id="3078742637637080194">
            <node role="quotedNode" roleId="yvjf.1196350785114:0" type="yvor.ClassifierClassExpression" typeId="yvor.1116615150612:3" id="3078742637637080198">
              <link role="classifier" roleId="yvor.1116615189566:3" targetNodeId="yjwb.~Map" resolveInfo="Map" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="3078742637637080196">
        <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
      </node>
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="3078742637637080197" />
    </node>
    <node role="constructor" roleId="2rzm.1225194240801" type="2rzm.ConceptConstructorDeclaration" typeId="2rzm.1225194413805" id="1213877520413">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1213877520414" />
    </node>
  </root>
  <root id="1213877532555">
    <node role="constructor" roleId="2rzm.1225194240801" type="2rzm.ConceptConstructorDeclaration" typeId="2rzm.1225194413805" id="1213877532556">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1213877532557" />
    </node>
  </root>
  <root id="1226515539540">
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="1226515541880">
      <property name="name" nameId="yvnu.1169194664001:0" value="getPresentation" />
      <property name="isPrivate" nameId="2rzm.1225194472833" value="false" />
      <link role="overriddenMethod" roleId="2rzm.1225194472831" targetNodeId="yvnz.1213877396640" resolveInfo="getPresentation" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1226515541881">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1226515541882">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1226515541884">
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1226515541885">
              <property name="value" nameId="yvor.1070475926801:3" value="&gt;" />
            </node>
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1226515541883">
              <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1240254954608">
                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240254956472">
                  <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1240254956334" />
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SConceptPropertyAccess" typeId="yvim.1145994841052:16" id="1240254958524">
                    <link role="conceptProperty" roleId="yvim.1145994841055:16" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
                  </node>
                </node>
                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1226515541891">
                  <property name="value" nameId="yvor.1070475926801:3" value="&lt;" />
                </node>
              </node>
              <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1226515541886">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1226515541887">
                  <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1226515541888" />
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1226515545929">
                    <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1226511765987:7" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ConceptMethodCall" typeId="yvim.1179409122411:16" id="1226515541890">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvnz.1213877396640" resolveInfo="getPresentation" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.StringType" typeId="yvor.1225271177708:3" id="4887793210800602598" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1226515541893" />
    </node>
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="1226515541894">
      <property name="name" nameId="yvnu.1169194664001:0" value="getVariableSuffixes" />
      <property name="isPrivate" nameId="2rzm.1225194472833" value="false" />
      <link role="overriddenMethod" roleId="2rzm.1225194472831" targetNodeId="yvou.1213877337304" resolveInfo="getVariableSuffixes" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1226515541895">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1226515541896">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1226515541897">
            <property name="name" nameId="yvnu.1169194664001:0" value="variableSuffixes" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.ListType" typeId="yvix.1151688443754:7" id="1226515541898">
              <node role="elementType" roleId="yvix.1151688676805:7" type="yvor.StringType" typeId="yvor.1225271177708:3" id="4887793210800602599" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1226515541900">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvix.ListCreatorWithInit" typeId="yvix.1160600644654:7" id="1226515541901">
                <node role="elementType" roleId="yvix.1237721435807:7" type="yvor.StringType" typeId="yvor.1225271177708:3" id="4887793210800602592" />
                <node role="initValue" roleId="yvix.1237721435808:7" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1226515541903">
                  <property name="value" nameId="yvor.1070475926801:3" value="set" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1226515541904">
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1226515541905">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1447667470349161994">
              <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1447667470349161995">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvix.ForEachStatement" typeId="yvix.1153943597977:7" id="1447667470349200739">
                  <node role="variable" roleId="yvix.1153944400369:7" type="yvix.ForEachVariable" typeId="yvix.1153944193378:7" id="1447667470349200740">
                    <property name="name" nameId="yvnu.1169194664001:0" value="suffix" />
                  </node>
                  <node role="inputSequence" roleId="yvix.1153944424730:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1447667470349200741">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1447667470349200742">
                      <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1447667470349200743" />
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1447667470349200759">
                        <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1226511765987:7" />
                      </node>
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ConceptMethodCall" typeId="yvim.1179409122411:16" id="1447667470349200745">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvou.1213877337304" resolveInfo="getVariableSuffixes" />
                    </node>
                  </node>
                  <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1447667470349200746">
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1447667470349200747">
                      <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1447667470349200748">
                        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1447667470349200749">
                          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1447667470349200750">
                            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1447667470349200751">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1226515541897" resolveInfo="variableSuffixes" />
                            </node>
                            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddElementOperation" typeId="yvix.1160612413312:7" id="1447667470349200752">
                              <node role="argument" roleId="yvix.1160612519549:7" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="1447667470349200753">
                                <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="1447667470349200740" resolveInfo="suffix" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotExpression" typeId="yvor.1081516740877:3" id="1447667470349200754">
                        <node role="expression" roleId="yvor.1081516765348:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1447667470349200755">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1447667470349200756">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1226515541897" resolveInfo="variableSuffixes" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvix.ContainsOperation" typeId="yvix.1172254888721:7" id="1447667470349200757">
                            <node role="argument" roleId="yvix.1172256416782:7" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="1447667470349200758">
                              <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="1447667470349200740" resolveInfo="suffix" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1447667470349161997">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1447667470349161998">
                  <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1447667470349161999" />
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1447667470349162028">
                    <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1226511765987:7" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ConceptMethodCall" typeId="yvim.1179409122411:16" id="1447667470349162001">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvou.1447667470349154499" resolveInfo="hasPluralVariableSuffixes" />
                </node>
              </node>
              <node role="ifFalseStatement" roleId="yvor.1082485599094:3" type="yvor.BlockStatement" typeId="yvor.1082485599095:3" id="1447667470349162002">
                <node role="statements" roleId="yvor.1082485599096:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1447667470349162003">
                  <node role="statement" roleId="yvor.1068581517665:3" type="yvix.ForEachStatement" typeId="yvix.1153943597977:7" id="1226515541906">
                    <node role="variable" roleId="yvix.1153944400369:7" type="yvix.ForEachVariable" typeId="yvix.1153944193378:7" id="1226515541907">
                      <property name="name" nameId="yvnu.1169194664001:0" value="suffix" />
                    </node>
                    <node role="inputSequence" roleId="yvix.1153944424730:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1226515541908">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1226515541909">
                        <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1226515541910" />
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1226515557375">
                          <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1226511765987:7" />
                        </node>
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ConceptMethodCall" typeId="yvim.1179409122411:16" id="1226515541912">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvou.1213877337304" resolveInfo="getVariableSuffixes" />
                      </node>
                    </node>
                    <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1226515541913">
                      <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1226515541914">
                        <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1226515541915">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1226515541916">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1226515541897" resolveInfo="variableSuffixes" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddElementOperation" typeId="yvix.1160612413312:7" id="1226515541917">
                            <node role="argument" roleId="yvix.1160612519549:7" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1226515541918">
                              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="6eoo.~NameUtil%dpluralize(java%dlang%dString)%cjava%dlang%dString" resolveInfo="pluralize" />
                              <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="6eoo.~NameUtil" resolveInfo="NameUtil" />
                              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="1226515541919">
                                <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="1226515541907" resolveInfo="suffix" />
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
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1226515541920">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1226515541921">
              <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1226515541922" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1226515552087">
                <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1226511765987:7" />
              </node>
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_IsNotNullOperation" typeId="yvim.1172008320231:16" id="1226515541924" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1226515541925">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1226515541926">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1226515541897" resolveInfo="variableSuffixes" />
          </node>
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvix.ListType" typeId="yvix.1151688443754:7" id="1226515541927">
        <node role="elementType" roleId="yvix.1151688676805:7" type="yvor.StringType" typeId="yvor.1225271177708:3" id="4887793210800602595" />
      </node>
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1226515541929" />
    </node>
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="1447667470349161958">
      <property name="name" nameId="yvnu.1169194664001:0" value="hasPluralVariableSuffixes" />
      <link role="overriddenMethod" roleId="2rzm.1225194472831" targetNodeId="yvou.1447667470349154499" resolveInfo="hasPluralVariableSuffixes" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1447667470349161959">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1447667470349161960">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="1447667470349161961">
            <property name="value" nameId="yvor.1068580123138:3" value="true" />
          </node>
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.BooleanType" typeId="yvor.1070534644030:3" id="1447667470349161962" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.ProtectedVisibility" typeId="yvor.1146644641414:3" id="1447667470349161963" />
    </node>
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="1226515541930">
      <property name="name" nameId="yvnu.1169194664001:0" value="getAbstractCreator" />
      <property name="isPrivate" nameId="2rzm.1225194472833" value="false" />
      <link role="overriddenMethod" roleId="2rzm.1225194472831" targetNodeId="yvou.1213877337340" resolveInfo="getAbstractCreator" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1226515541931">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1240217589371">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1240217589372" />
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1226515541951">
        <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvor.1145552809883:3" resolveInfo="AbstractCreator" />
      </node>
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1226515541952" />
    </node>
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="7602110602933345893">
      <property name="name" nameId="yvnu.1169194664001:0" value="getAbstractCreators" />
      <property name="isVirtual" nameId="2rzm.1225194472832" value="true" />
      <link role="overriddenMethod" roleId="2rzm.1225194472831" targetNodeId="yvou.7602110602933317830" resolveInfo="getAbstractCreators" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="7602110602933345894" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="7602110602933345895">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1240217449792">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1240217449793">
            <property name="name" nameId="yvnu.1169194664001:0" value="result" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="1240217449794">
              <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvor.1145552809883:3" resolveInfo="AbstractCreator" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1240217455297">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvim.SNodeListCreator" typeId="yvim.1145567426890:16" id="1240217473811">
                <node role="createdType" roleId="yvim.1145567471833:16" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="1240217473812">
                  <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvor.1145552809883:3" resolveInfo="AbstractCreator" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1240217480466">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240217481864">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1240217480467">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1240217449793" resolveInfo="result" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddElementOperation" typeId="yvix.1160612413312:7" id="1240217482658">
              <node role="argument" roleId="yvix.1160612519549:7" type="yvjf.Quotation" typeId="yvjf.1196350785113:0" id="1240217485195">
                <node role="quotedNode" roleId="yvjf.1196350785114:0" type="yvix.HashSetCreator" typeId="yvix.1226516258405:7" id="1240217550678">
                  <node role="elementType" roleId="yvix.1237721435807:7" type="yvor.Type" typeId="yvor.1068431790189:3" id="1240217550679">
                    <node role="_attr_$attribute" type="yvjf.Antiquotation" typeId="yvjf.1196350785112:0" id="1240217552298">
                      <node role="expression" roleId="yvjf.1196350785111:0" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240217554375">
                        <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1240217554185" />
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1240217555009">
                          <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1226511765987:7" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1240217564740">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240217569617">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1240217564741">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1240217449793" resolveInfo="result" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddElementOperation" typeId="yvix.1160612413312:7" id="1240217570826">
              <node role="argument" roleId="yvix.1160612519549:7" type="yvjf.Quotation" typeId="yvjf.1196350785113:0" id="1240217572758">
                <node role="quotedNode" roleId="yvjf.1196350785114:0" type="yvix.LinkedHashSetCreator" typeId="yvix.1240217271293:7" id="1240217576428">
                  <node role="elementType" roleId="yvix.1237721435807:7" type="yvor.Type" typeId="yvor.1068431790189:3" id="1240217576429">
                    <node role="_attr_$attribute" type="yvjf.Antiquotation" typeId="yvjf.1196350785112:0" id="1240217578478">
                      <node role="expression" roleId="yvjf.1196350785111:0" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240217579511">
                        <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1240217579356" />
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1240217580114">
                          <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1226511765987:7" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1576845966386920530">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1576845966386920531">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1576845966386920540">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1240217449793" resolveInfo="result" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddAllElementsOperation" typeId="yvix.1160666733551:7" id="1576845966386920533">
              <node role="argument" roleId="yvix.1160666822012:7" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1576845966386920534">
                <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="1331913329176269837" resolveInfo="CustomContainersUtil" />
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1331913329176269843" resolveInfo="creators" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="7602110602933345919">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7602110602933345896" resolveInfo="targetModel" />
                </node>
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1576845966386920535" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1240217585270">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1240217585271">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1240217449793" resolveInfo="result" />
          </node>
        </node>
      </node>
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="7602110602933345896">
        <property name="name" nameId="yvnu.1169194664001:0" value="targetModel" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SModelType" typeId="yvim.1143226024141:16" id="7602110602933345897" />
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="7602110602933345898">
        <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvor.1145552809883:3" resolveInfo="AbstractCreator" />
      </node>
    </node>
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="3078742637637080146">
      <property name="name" nameId="yvnu.1169194664001:0" value="getClassExpression" />
      <property name="isPrivate" nameId="2rzm.1225194472833" value="false" />
      <link role="overriddenMethod" roleId="2rzm.1225194472831" targetNodeId="yvou.1213877337357" resolveInfo="getClassExpression" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="3078742637637080147">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="3078742637637080166">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvjf.Quotation" typeId="yvjf.1196350785113:0" id="3078742637637080167">
            <node role="quotedNode" roleId="yvjf.1196350785114:0" type="yvor.ClassifierClassExpression" typeId="yvor.1116615150612:3" id="3078742637637080173">
              <link role="classifier" roleId="yvor.1116615189566:3" targetNodeId="yjwb.~Set" resolveInfo="Set" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="3078742637637080151">
        <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
      </node>
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="3078742637637080152" />
    </node>
    <node role="constructor" roleId="2rzm.1225194240801" type="2rzm.ConceptConstructorDeclaration" typeId="2rzm.1225194413805" id="1226515539541">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1226515539542" />
    </node>
  </root>
  <root id="1237468611264">
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="1237468613396">
      <property name="name" nameId="yvnu.1169194664001:0" value="getPresentation" />
      <property name="isPrivate" nameId="2rzm.1225194472833" value="false" />
      <link role="overriddenMethod" roleId="2rzm.1225194472831" targetNodeId="yvnz.1213877396640" resolveInfo="getPresentation" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1237468613397">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1237468613398">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1237468613400">
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1237468613401">
              <property name="value" nameId="yvor.1070475926801:3" value="&gt;" />
            </node>
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1237468613399">
              <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1237468631406">
                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1237468638269">
                  <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1237468638002" />
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SConceptPropertyAccess" typeId="yvim.1145994841052:16" id="1237468641490">
                    <link role="conceptProperty" roleId="yvim.1145994841055:16" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
                  </node>
                </node>
                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1237468613407">
                  <property name="value" nameId="yvor.1070475926801:3" value="&lt;" />
                </node>
              </node>
              <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1237468613402">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1237468613403">
                  <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1237468613404" />
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1237468616797">
                    <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1237467730343:7" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ConceptMethodCall" typeId="yvim.1179409122411:16" id="1237468613406">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvnz.1213877396640" resolveInfo="getPresentation" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.StringType" typeId="yvor.1225271177708:3" id="4887793210800602536" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1237468613409" />
    </node>
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="1237468719543">
      <property name="name" nameId="yvnu.1169194664001:0" value="getVariableSuffixes" />
      <property name="isPrivate" nameId="2rzm.1225194472833" value="false" />
      <link role="overriddenMethod" roleId="2rzm.1225194472831" targetNodeId="yvou.1213877337304" resolveInfo="getVariableSuffixes" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1237468719544">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1237468719545">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1237468719546">
            <property name="name" nameId="yvnu.1169194664001:0" value="variableSuffixes" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.ListType" typeId="yvix.1151688443754:7" id="1237468719547">
              <node role="elementType" roleId="yvix.1151688676805:7" type="yvor.StringType" typeId="yvor.1225271177708:3" id="4887793210800602540" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1237468719549">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvix.ListCreatorWithInit" typeId="yvix.1160600644654:7" id="1237468719550">
                <node role="elementType" roleId="yvix.1237721435807:7" type="yvor.StringType" typeId="yvor.1225271177708:3" id="4887793210800602543" />
                <node role="initValue" roleId="yvix.1237721435808:7" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1237468719552">
                  <property name="value" nameId="yvor.1070475926801:3" value="itr" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1237468719553">
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1237468719554">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1447667470349161906">
              <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1447667470349161907">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvix.ForEachStatement" typeId="yvix.1153943597977:7" id="1447667470349200663">
                  <node role="variable" roleId="yvix.1153944400369:7" type="yvix.ForEachVariable" typeId="yvix.1153944193378:7" id="1447667470349200664">
                    <property name="name" nameId="yvnu.1169194664001:0" value="suffix" />
                  </node>
                  <node role="inputSequence" roleId="yvix.1153944424730:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1447667470349200665">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1447667470349200666">
                      <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1447667470349200667" />
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1447667470349200683">
                        <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1237467730343:7" />
                      </node>
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ConceptMethodCall" typeId="yvim.1179409122411:16" id="1447667470349200669">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvou.1213877337304" resolveInfo="getVariableSuffixes" />
                    </node>
                  </node>
                  <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1447667470349200670">
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1447667470349200671">
                      <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1447667470349200672">
                        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1447667470349200673">
                          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1447667470349200674">
                            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1447667470349200675">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1237468719546" resolveInfo="variableSuffixes" />
                            </node>
                            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddElementOperation" typeId="yvix.1160612413312:7" id="1447667470349200676">
                              <node role="argument" roleId="yvix.1160612519549:7" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="1447667470349200677">
                                <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="1447667470349200664" resolveInfo="suffix" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotExpression" typeId="yvor.1081516740877:3" id="1447667470349200678">
                        <node role="expression" roleId="yvor.1081516765348:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1447667470349200679">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1447667470349200680">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1237468719546" resolveInfo="variableSuffixes" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvix.ContainsOperation" typeId="yvix.1172254888721:7" id="1447667470349200681">
                            <node role="argument" roleId="yvix.1172256416782:7" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="1447667470349200682">
                              <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="1447667470349200664" resolveInfo="suffix" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1447667470349161916">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1447667470349161911">
                  <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1447667470349161910" />
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1447667470349161915">
                    <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1237467730343:7" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ConceptMethodCall" typeId="yvim.1179409122411:16" id="1447667470349161920">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvou.1447667470349154499" resolveInfo="hasPluralVariableSuffixes" />
                </node>
              </node>
              <node role="ifFalseStatement" roleId="yvor.1082485599094:3" type="yvor.BlockStatement" typeId="yvor.1082485599095:3" id="1447667470349161921">
                <node role="statements" roleId="yvor.1082485599096:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1447667470349161922">
                  <node role="statement" roleId="yvor.1068581517665:3" type="yvix.ForEachStatement" typeId="yvix.1153943597977:7" id="1237468719555">
                    <node role="variable" roleId="yvix.1153944400369:7" type="yvix.ForEachVariable" typeId="yvix.1153944193378:7" id="1237468719556">
                      <property name="name" nameId="yvnu.1169194664001:0" value="suffix" />
                    </node>
                    <node role="inputSequence" roleId="yvix.1153944424730:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1237468719557">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1237468719558">
                        <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1237468719559" />
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1237468738314">
                          <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1237467730343:7" />
                        </node>
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ConceptMethodCall" typeId="yvim.1179409122411:16" id="1237468719561">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvou.1213877337304" resolveInfo="getVariableSuffixes" />
                      </node>
                    </node>
                    <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1237468719562">
                      <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1237468719563">
                        <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1237468719564">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1237468719565">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1237468719546" resolveInfo="variableSuffixes" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddElementOperation" typeId="yvix.1160612413312:7" id="1237468719566">
                            <node role="argument" roleId="yvix.1160612519549:7" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1237468719567">
                              <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="6eoo.~NameUtil" resolveInfo="NameUtil" />
                              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="6eoo.~NameUtil%dpluralize(java%dlang%dString)%cjava%dlang%dString" resolveInfo="pluralize" />
                              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="1237468719568">
                                <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="1237468719556" resolveInfo="suffix" />
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
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1237468719569">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1237468719570">
              <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1237468719571" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1237468736604">
                <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1237467730343:7" />
              </node>
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_IsNotNullOperation" typeId="yvim.1172008320231:16" id="1237468719573" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1237468719574">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1237468719575">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1237468719546" resolveInfo="variableSuffixes" />
          </node>
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvix.ListType" typeId="yvix.1151688443754:7" id="1237468719576">
        <node role="elementType" roleId="yvix.1151688676805:7" type="yvor.StringType" typeId="yvor.1225271177708:3" id="4887793210800602537" />
      </node>
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1237468719578" />
    </node>
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="1447667470349161897">
      <property name="name" nameId="yvnu.1169194664001:0" value="hasPluralVariableSuffixes" />
      <link role="overriddenMethod" roleId="2rzm.1225194472831" targetNodeId="yvou.1447667470349154499" resolveInfo="hasPluralVariableSuffixes" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1447667470349161900">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1447667470349161903">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="1447667470349161904">
            <property name="value" nameId="yvor.1068580123138:3" value="true" />
          </node>
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.BooleanType" typeId="yvor.1070534644030:3" id="1447667470349161901" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.ProtectedVisibility" typeId="yvor.1146644641414:3" id="1447667470349161902" />
    </node>
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="3078742637637080219">
      <property name="name" nameId="yvnu.1169194664001:0" value="getClassExpression" />
      <property name="isPrivate" nameId="2rzm.1225194472833" value="false" />
      <link role="overriddenMethod" roleId="2rzm.1225194472831" targetNodeId="yvou.1213877337357" resolveInfo="getClassExpression" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="3078742637637080220">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="3078742637637080221">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvjf.Quotation" typeId="yvjf.1196350785113:0" id="3078742637637080222">
            <node role="quotedNode" roleId="yvjf.1196350785114:0" type="yvor.ClassifierClassExpression" typeId="yvor.1116615150612:3" id="3078742637637080226">
              <link role="classifier" roleId="yvor.1116615189566:3" targetNodeId="yjwb.~Iterator" resolveInfo="Iterator" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="3078742637637080224">
        <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
      </node>
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="3078742637637080225" />
    </node>
    <node role="constructor" roleId="2rzm.1225194240801" type="2rzm.ConceptConstructorDeclaration" typeId="2rzm.1225194413805" id="1237468611265">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1237468611266" />
    </node>
  </root>
  <root id="1237496376141">
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="1237496377901">
      <property name="name" nameId="yvnu.1169194664001:0" value="getPresentation" />
      <property name="isPrivate" nameId="2rzm.1225194472833" value="false" />
      <link role="overriddenMethod" roleId="2rzm.1225194472831" targetNodeId="yvnz.1213877396640" resolveInfo="getPresentation" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1237496377902">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1237496377903">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1237496377905">
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1237496377906">
              <property name="value" nameId="yvor.1070475926801:3" value="&gt;" />
            </node>
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1237496377904">
              <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1237496377912">
                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1237496377913">
                  <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1237496377914" />
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SConceptPropertyAccess" typeId="yvim.1145994841052:16" id="1237496377915">
                    <link role="conceptProperty" roleId="yvim.1145994841055:16" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
                  </node>
                </node>
                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1237496377916">
                  <property name="value" nameId="yvor.1070475926801:3" value="&lt;" />
                </node>
              </node>
              <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1237496377907">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1237496377908">
                  <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1237496377909" />
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1237496385849">
                    <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1237496250642:7" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ConceptMethodCall" typeId="yvim.1179409122411:16" id="1237496377911">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvnz.1213877396640" resolveInfo="getPresentation" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.StringType" typeId="yvor.1225271177708:3" id="4887793210800602524" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1237496377918" />
    </node>
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="1237496377919">
      <property name="name" nameId="yvnu.1169194664001:0" value="getVariableSuffixes" />
      <property name="isPrivate" nameId="2rzm.1225194472833" value="false" />
      <link role="overriddenMethod" roleId="2rzm.1225194472831" targetNodeId="yvou.1213877337304" resolveInfo="getVariableSuffixes" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1237496377920">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1237496377921">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1237496377922">
            <property name="name" nameId="yvnu.1169194664001:0" value="variableSuffixes" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.ListType" typeId="yvix.1151688443754:7" id="1237496377923">
              <node role="elementType" roleId="yvix.1151688676805:7" type="yvor.StringType" typeId="yvor.1225271177708:3" id="4887793210800602528" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1237496377925">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvix.ListCreatorWithInit" typeId="yvix.1160600644654:7" id="1237496377926">
                <node role="elementType" roleId="yvix.1237721435807:7" type="yvor.StringType" typeId="yvor.1225271177708:3" id="4887793210800602531" />
                <node role="initValue" roleId="yvix.1237721435808:7" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1237496377928">
                  <property name="value" nameId="yvor.1070475926801:3" value="itr" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1237496377929">
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1237496377930">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1447667470349161867">
              <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1447667470349161868">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvix.ForEachStatement" typeId="yvix.1153943597977:7" id="1447667470349200641">
                  <node role="variable" roleId="yvix.1153944400369:7" type="yvix.ForEachVariable" typeId="yvix.1153944193378:7" id="1447667470349200642">
                    <property name="name" nameId="yvnu.1169194664001:0" value="suffix" />
                  </node>
                  <node role="inputSequence" roleId="yvix.1153944424730:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1447667470349200643">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1447667470349200644">
                      <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1447667470349200645" />
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1447667470349200661">
                        <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1237496250642:7" />
                      </node>
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ConceptMethodCall" typeId="yvim.1179409122411:16" id="1447667470349200647">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvou.1213877337304" resolveInfo="getVariableSuffixes" />
                    </node>
                  </node>
                  <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1447667470349200648">
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1447667470349200649">
                      <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1447667470349200650">
                        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1447667470349200651">
                          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1447667470349200652">
                            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1447667470349200653">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1237496377922" resolveInfo="variableSuffixes" />
                            </node>
                            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddElementOperation" typeId="yvix.1160612413312:7" id="1447667470349200654">
                              <node role="argument" roleId="yvix.1160612519549:7" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="1447667470349200655">
                                <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="1447667470349200642" resolveInfo="suffix" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotExpression" typeId="yvor.1081516740877:3" id="1447667470349200656">
                        <node role="expression" roleId="yvor.1081516765348:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1447667470349200657">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1447667470349200658">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1237496377922" resolveInfo="variableSuffixes" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvix.ContainsOperation" typeId="yvix.1172254888721:7" id="1447667470349200659">
                            <node role="argument" roleId="yvix.1172256416782:7" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="1447667470349200660">
                              <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="1447667470349200642" resolveInfo="suffix" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1447667470349161877">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1447667470349161872">
                  <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1447667470349161871" />
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1447667470349161876">
                    <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1237496250642:7" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ConceptMethodCall" typeId="yvim.1179409122411:16" id="1447667470349161881">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvou.1447667470349154499" resolveInfo="hasPluralVariableSuffixes" />
                </node>
              </node>
              <node role="ifFalseStatement" roleId="yvor.1082485599094:3" type="yvor.BlockStatement" typeId="yvor.1082485599095:3" id="1447667470349161882">
                <node role="statements" roleId="yvor.1082485599096:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1447667470349161883">
                  <node role="statement" roleId="yvor.1068581517665:3" type="yvix.ForEachStatement" typeId="yvix.1153943597977:7" id="1237496377931">
                    <node role="variable" roleId="yvix.1153944400369:7" type="yvix.ForEachVariable" typeId="yvix.1153944193378:7" id="1237496377932">
                      <property name="name" nameId="yvnu.1169194664001:0" value="suffix" />
                    </node>
                    <node role="inputSequence" roleId="yvix.1153944424730:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1237496377933">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1237496377934">
                        <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1237496377935" />
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1237496386954">
                          <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1237496250642:7" />
                        </node>
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ConceptMethodCall" typeId="yvim.1179409122411:16" id="1237496377937">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvou.1213877337304" resolveInfo="getVariableSuffixes" />
                      </node>
                    </node>
                    <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1237496377938">
                      <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1237496377939">
                        <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1237496377940">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1237496377941">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1237496377922" resolveInfo="variableSuffixes" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddElementOperation" typeId="yvix.1160612413312:7" id="1237496377942">
                            <node role="argument" roleId="yvix.1160612519549:7" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1237496377943">
                              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="6eoo.~NameUtil%dpluralize(java%dlang%dString)%cjava%dlang%dString" resolveInfo="pluralize" />
                              <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="6eoo.~NameUtil" resolveInfo="NameUtil" />
                              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="1237496377944">
                                <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="1237496377932" resolveInfo="suffix" />
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
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1237496377945">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1237496377946">
              <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1237496377947" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1237496384432">
                <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1237496250642:7" />
              </node>
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_IsNotNullOperation" typeId="yvim.1172008320231:16" id="1237496377949" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1237496377950">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1237496377951">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1237496377922" resolveInfo="variableSuffixes" />
          </node>
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvix.ListType" typeId="yvix.1151688443754:7" id="1237496377952">
        <node role="elementType" roleId="yvix.1151688676805:7" type="yvor.StringType" typeId="yvor.1225271177708:3" id="4887793210800602525" />
      </node>
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1237496377954" />
    </node>
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="1447667470349161858">
      <property name="name" nameId="yvnu.1169194664001:0" value="hasPluralVariableSuffixes" />
      <link role="overriddenMethod" roleId="2rzm.1225194472831" targetNodeId="yvou.1447667470349154499" resolveInfo="hasPluralVariableSuffixes" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1447667470349161861">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1447667470349161864">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="1447667470349161865">
            <property name="value" nameId="yvor.1068580123138:3" value="true" />
          </node>
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.BooleanType" typeId="yvor.1070534644030:3" id="1447667470349161862" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.ProtectedVisibility" typeId="yvor.1146644641414:3" id="1447667470349161863" />
    </node>
    <node role="constructor" roleId="2rzm.1225194240801" type="2rzm.ConceptConstructorDeclaration" typeId="2rzm.1225194413805" id="1237496376142">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1237496376143" />
    </node>
  </root>
  <root id="1237548270025">
    <node role="constructor" roleId="2rzm.1225194240801" type="2rzm.ConceptConstructorDeclaration" typeId="2rzm.1225194413805" id="1237548270026">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1237548270027" />
    </node>
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="1237548271216">
      <property name="name" nameId="yvnu.1169194664001:0" value="isGuardClauseStatement" />
      <link role="overriddenMethod" roleId="2rzm.1225194472831" targetNodeId="yvou.1237547327995" resolveInfo="isGuardClauseStatement" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1237548271218">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1237548277088">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="1237548277293">
            <property name="value" nameId="yvor.1068580123138:3" value="true" />
          </node>
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.BooleanType" typeId="yvor.1070534644030:3" id="1237548447621" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1237548447622" />
    </node>
  </root>
  <root id="1237722435323">
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="1237722437229">
      <property name="name" nameId="yvnu.1169194664001:0" value="createType" />
      <property name="isVirtual" nameId="2rzm.1225194472832" value="true" />
      <property name="isAbstract" nameId="2rzm.1225194472834" value="true" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1237722538731">
        <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvor.1068431790189:3" resolveInfo="Type" />
      </node>
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1237722437231" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1237723666468" />
    </node>
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="2261417478150191157">
      <property name="name" nameId="yvnu.1169194664001:0" value="canHaveParameter" />
      <property name="isVirtual" nameId="2rzm.1225194472832" value="true" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="2261417478150191158" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.BooleanType" typeId="yvor.1070534644030:3" id="2261417478150191161" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="2261417478150191160">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="2261417478150191162">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="2261417478150191163">
            <property name="value" nameId="yvor.1068580123138:3" value="true" />
          </node>
        </node>
      </node>
    </node>
    <node role="constructor" roleId="2rzm.1225194240801" type="2rzm.ConceptConstructorDeclaration" typeId="2rzm.1225194413805" id="1237722435324">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1237722435325" />
    </node>
  </root>
  <root id="1237724489609">
    <node role="constructor" roleId="2rzm.1225194240801" type="2rzm.ConceptConstructorDeclaration" typeId="2rzm.1225194413805" id="1237724489610">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1237724489611" />
    </node>
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="1237724519693">
      <property name="name" nameId="yvnu.1169194664001:0" value="createType" />
      <link role="overriddenMethod" roleId="2rzm.1225194472831" targetNodeId="1237722437229" resolveInfo="createType" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1237724519695">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1237724552148">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvjf.Quotation" typeId="yvjf.1196350785113:0" id="1237724552149">
            <node role="quotedNode" roleId="yvjf.1196350785114:0" type="yvix.ListType" typeId="yvix.1151688443754:7" id="1237724559068">
              <node role="elementType" roleId="yvix.1151688676805:7" type="yvor.Type" typeId="yvor.1068431790189:3" id="1237724559069">
                <node role="_attr_$attribute" type="yvjf.Antiquotation" typeId="yvjf.1196350785112:0" id="1237724561305">
                  <node role="expression" roleId="yvjf.1196350785111:0" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1237724564243">
                    <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1237724564005" />
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1237724566357">
                      <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1237721435807:7" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1237724531631">
        <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvor.1068431790189:3" resolveInfo="Type" />
      </node>
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1237724536087" />
    </node>
  </root>
  <root id="1237724578571">
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="1237724580095">
      <property name="name" nameId="yvnu.1169194664001:0" value="createType" />
      <link role="overriddenMethod" roleId="2rzm.1225194472831" targetNodeId="1237722437229" resolveInfo="createType" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1237724580096">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1237724580097">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvjf.Quotation" typeId="yvjf.1196350785113:0" id="1237724580098">
            <node role="quotedNode" roleId="yvjf.1196350785114:0" type="yvix.SetType" typeId="yvix.1226511727824:7" id="1237724591999">
              <node role="elementType" roleId="yvix.1226511765987:7" type="yvor.Type" typeId="yvor.1068431790189:3" id="1237724592000">
                <node role="_attr_$attribute" type="yvjf.Antiquotation" typeId="yvjf.1196350785112:0" id="1237724593277">
                  <node role="expression" roleId="yvjf.1196350785111:0" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1237724596111">
                    <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1237724595937" />
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1237724596927">
                      <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1237721435807:7" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1237724580105">
        <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvor.1068431790189:3" resolveInfo="Type" />
      </node>
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1237724580106" />
    </node>
    <node role="constructor" roleId="2rzm.1225194240801" type="2rzm.ConceptConstructorDeclaration" typeId="2rzm.1225194413805" id="1237724578572">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1237724578573" />
    </node>
  </root>
  <root id="1237724603556">
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="1237724605193">
      <property name="name" nameId="yvnu.1169194664001:0" value="createType" />
      <link role="overriddenMethod" roleId="2rzm.1225194472831" targetNodeId="1237722437229" resolveInfo="createType" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1237724605194">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1237724605195">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvjf.Quotation" typeId="yvjf.1196350785113:0" id="1237724605196">
            <node role="quotedNode" roleId="yvjf.1196350785114:0" type="yvix.LinkedListType" typeId="yvix.3358009230509553641:7" id="3358009230509664484">
              <node role="elementType" roleId="yvix.1151688676805:7" type="yvor.Type" typeId="yvor.1068431790189:3" id="3358009230509664485">
                <node role="_attr_$attribute" type="yvjf.Antiquotation" typeId="yvjf.1196350785112:0" id="3358009230509664486">
                  <node role="expression" roleId="yvjf.1196350785111:0" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3358009230509664489">
                    <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="3358009230509664488" />
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="3358009230509664493">
                      <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1237721435807:7" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1237724605203">
        <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvor.1068431790189:3" resolveInfo="Type" />
      </node>
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1237724605204" />
    </node>
    <node role="constructor" roleId="2rzm.1225194240801" type="2rzm.ConceptConstructorDeclaration" typeId="2rzm.1225194413805" id="1237724603557">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1237724603558" />
    </node>
  </root>
  <root id="1237783270701">
    <node role="constructor" roleId="2rzm.1225194240801" type="2rzm.ConceptConstructorDeclaration" typeId="2rzm.1225194413805" id="1237783270702">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1237783270703">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1237783279164">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1237783282929">
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1237783279359">
              <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1237783279165" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="1237783281255">
                <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvor.1068580320021:3" resolveInfo="value" />
              </node>
            </node>
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1237783286410">
              <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="vhgx.~Integer" resolveInfo="Integer" />
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="vhgx.~Integer%dMAX_VALUE" resolveInfo="MAX_VALUE" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </root>
  <root id="1240239413630">
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="7602110602933345941">
      <property name="name" nameId="yvnu.1169194664001:0" value="getAbstractCreators" />
      <property name="isVirtual" nameId="2rzm.1225194472832" value="true" />
      <link role="overriddenMethod" roleId="2rzm.1225194472831" targetNodeId="yvou.7602110602933317830" resolveInfo="getAbstractCreators" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="7602110602933345942" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="7602110602933345943">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1240241646936">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1240241646937">
            <property name="name" nameId="yvnu.1169194664001:0" value="result" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="1240241646938">
              <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvor.1145552809883:3" resolveInfo="AbstractCreator" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1240241646939">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvim.SNodeListCreator" typeId="yvim.1145567426890:16" id="1240241646940">
                <node role="createdType" roleId="yvim.1145567471833:16" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="1240241646941">
                  <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvor.1145552809883:3" resolveInfo="AbstractCreator" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1240241655540">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240241656300">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1240241655541">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1240241646937" resolveInfo="result" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddElementOperation" typeId="yvix.1160612413312:7" id="1240241657626">
              <node role="argument" roleId="yvix.1160612519549:7" type="yvjf.Quotation" typeId="yvjf.1196350785113:0" id="1240241661326">
                <node role="quotedNode" roleId="yvjf.1196350785114:0" type="yvix.TreeMapCreator" typeId="yvix.1240239494010:7" id="1240241661327">
                  <node role="keyType" roleId="yvix.1197687026896:7" type="yvor.Type" typeId="yvor.1068431790189:3" id="1240241661328">
                    <node role="_attr_$attribute" type="yvjf.Antiquotation" typeId="yvjf.1196350785112:0" id="1240241661329">
                      <node role="expression" roleId="yvjf.1196350785111:0" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240241661331">
                        <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1240241661332" />
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1240241661333">
                          <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1197683466920:7" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="valueType" roleId="yvix.1197687035757:7" type="yvor.Type" typeId="yvor.1068431790189:3" id="1240241661335">
                    <node role="_attr_$attribute" type="yvjf.Antiquotation" typeId="yvjf.1196350785112:0" id="1240241661336">
                      <node role="expression" roleId="yvjf.1196350785111:0" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240241661338">
                        <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1240241661339" />
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1240241661340">
                          <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1197683475734:7" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1576845966386920633">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1576845966386920634">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1576845966386920635">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1240241646937" resolveInfo="result" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddAllElementsOperation" typeId="yvix.1160666733551:7" id="1576845966386920636">
              <node role="argument" roleId="yvix.1160666822012:7" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1576845966386920637">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1331913329176269843" resolveInfo="creators" />
                <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="1331913329176269837" resolveInfo="CustomContainersUtil" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="7602110602933345963">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7602110602933345944" resolveInfo="targetModel" />
                </node>
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1576845966386920638" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1240241663468">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1240241663469">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1240241646937" resolveInfo="result" />
          </node>
        </node>
      </node>
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="7602110602933345944">
        <property name="name" nameId="yvnu.1169194664001:0" value="targetModel" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SModelType" typeId="yvim.1143226024141:16" id="7602110602933345945" />
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="7602110602933345946">
        <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvor.1145552809883:3" resolveInfo="AbstractCreator" />
      </node>
    </node>
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="3078742637637080228">
      <property name="name" nameId="yvnu.1169194664001:0" value="getClassExpression" />
      <property name="isPrivate" nameId="2rzm.1225194472833" value="false" />
      <link role="overriddenMethod" roleId="2rzm.1225194472831" targetNodeId="yvou.1213877337357" resolveInfo="getClassExpression" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="3078742637637080229">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="3078742637637080230">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvjf.Quotation" typeId="yvjf.1196350785113:0" id="3078742637637080231">
            <node role="quotedNode" roleId="yvjf.1196350785114:0" type="yvor.ClassifierClassExpression" typeId="yvor.1116615150612:3" id="3078742637637080235">
              <link role="classifier" roleId="yvor.1116615189566:3" targetNodeId="yjwb.~SortedMap" resolveInfo="SortedMap" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="3078742637637080233">
        <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
      </node>
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="3078742637637080234" />
    </node>
    <node role="constructor" roleId="2rzm.1225194240801" type="2rzm.ConceptConstructorDeclaration" typeId="2rzm.1225194413805" id="1240239413631">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1240239413632" />
    </node>
  </root>
  <root id="1240249640915">
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="7602110602933345983">
      <property name="name" nameId="yvnu.1169194664001:0" value="getAbstractCreators" />
      <property name="isVirtual" nameId="2rzm.1225194472832" value="true" />
      <link role="overriddenMethod" roleId="2rzm.1225194472831" targetNodeId="yvou.7602110602933317830" resolveInfo="getAbstractCreators" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="7602110602933345984" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="7602110602933345985">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1240249655483">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1240249655484">
            <property name="name" nameId="yvnu.1169194664001:0" value="result" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="1240249655485">
              <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvor.1145552809883:3" resolveInfo="AbstractCreator" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1240249655486">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvim.SNodeListCreator" typeId="yvim.1145567426890:16" id="1240249655487">
                <node role="createdType" roleId="yvim.1145567471833:16" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="1240249655488">
                  <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvor.1145552809883:3" resolveInfo="AbstractCreator" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1240249655489">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240249655490">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1240249655491">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1240249655484" resolveInfo="result" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddElementOperation" typeId="yvix.1160612413312:7" id="1240249655492">
              <node role="argument" roleId="yvix.1160612519549:7" type="yvjf.Quotation" typeId="yvjf.1196350785113:0" id="1240249655493">
                <node role="quotedNode" roleId="yvjf.1196350785114:0" type="yvix.TreeSetCreator" typeId="yvix.1240247536947:7" id="1240249663536">
                  <node role="elementType" roleId="yvix.1237721435807:7" type="yvor.Type" typeId="yvor.1068431790189:3" id="1240249663537">
                    <node role="_attr_$attribute" type="yvjf.Antiquotation" typeId="yvjf.1196350785112:0" id="1240249665167">
                      <node role="expression" roleId="yvjf.1196350785111:0" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240249667853">
                        <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1240249667587" />
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1240249668328">
                          <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1226511765987:7" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1576845966386920549">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1576845966386920550">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1576845966386920551">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1240249655484" resolveInfo="result" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddAllElementsOperation" typeId="yvix.1160666733551:7" id="1576845966386920552">
              <node role="argument" roleId="yvix.1160666822012:7" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1576845966386920553">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1331913329176269843" resolveInfo="creators" />
                <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="1331913329176269837" resolveInfo="CustomContainersUtil" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="7602110602933346007">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7602110602933345986" resolveInfo="targetModel" />
                </node>
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1576845966386920554" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1240249655515">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1240249655516">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1240249655484" resolveInfo="result" />
          </node>
        </node>
      </node>
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="7602110602933345986">
        <property name="name" nameId="yvnu.1169194664001:0" value="targetModel" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SModelType" typeId="yvim.1143226024141:16" id="7602110602933345987" />
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="7602110602933345988">
        <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvor.1145552809883:3" resolveInfo="AbstractCreator" />
      </node>
    </node>
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="3078742637637080175">
      <property name="name" nameId="yvnu.1169194664001:0" value="getClassExpression" />
      <property name="isPrivate" nameId="2rzm.1225194472833" value="false" />
      <link role="overriddenMethod" roleId="2rzm.1225194472831" targetNodeId="yvou.1213877337357" resolveInfo="getClassExpression" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="3078742637637080176">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="3078742637637080177">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvjf.Quotation" typeId="yvjf.1196350785113:0" id="3078742637637080178">
            <node role="quotedNode" roleId="yvjf.1196350785114:0" type="yvor.ClassifierClassExpression" typeId="yvor.1116615150612:3" id="3078742637637080183">
              <link role="classifier" roleId="yvor.1116615189566:3" targetNodeId="yjwb.~SortedSet" resolveInfo="SortedSet" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="3078742637637080180">
        <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
      </node>
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="3078742637637080181" />
    </node>
    <node role="constructor" roleId="2rzm.1225194240801" type="2rzm.ConceptConstructorDeclaration" typeId="2rzm.1225194413805" id="1240249640916">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1240249640917" />
    </node>
  </root>
  <root id="1240249694731">
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="1240249696308">
      <property name="name" nameId="yvnu.1169194664001:0" value="createType" />
      <link role="overriddenMethod" roleId="2rzm.1225194472831" targetNodeId="1237722437229" resolveInfo="createType" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1240249696311">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1240249709334">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvjf.Quotation" typeId="yvjf.1196350785113:0" id="1240249709335">
            <node role="quotedNode" roleId="yvjf.1196350785114:0" type="yvix.SortedSetType" typeId="yvix.1240247491866:7" id="1240250690898">
              <node role="elementType" roleId="yvix.1226511765987:7" type="yvor.Type" typeId="yvor.1068431790189:3" id="1240250690899">
                <node role="_attr_$attribute" type="yvjf.Antiquotation" typeId="yvjf.1196350785112:0" id="1240250692827">
                  <node role="expression" roleId="yvjf.1196350785111:0" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240250697321">
                    <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1240250697103" />
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1240250698218">
                      <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1237721435807:7" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1240249699656">
        <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvor.1068431790189:3" resolveInfo="Type" />
      </node>
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1240249699657" />
    </node>
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="2261417478150191164">
      <property name="name" nameId="yvnu.1169194664001:0" value="canHaveParameter" />
      <property name="isVirtual" nameId="2rzm.1225194472832" value="true" />
      <link role="overriddenMethod" roleId="2rzm.1225194472831" targetNodeId="2261417478150191157" resolveInfo="canHavParameter" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="2261417478150191165" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="2261417478150191166">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="2261417478150191168">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AndExpression" typeId="yvor.1080120340718:3" id="2261417478150191172">
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2261417478150191181">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2261417478150191176">
                <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="2261417478150191175" />
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="2261417478150191180">
                  <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.2261417478148778174:7" />
                </node>
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_IsNullOperation" typeId="yvim.1171999116870:16" id="2261417478150191185" />
            </node>
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2261417478150191169">
              <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.SuperNodeExpression" typeId="2rzm.1225194628440" id="2261417478150191170" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ConceptMethodCall" typeId="yvim.1179409122411:16" id="2261417478150191171">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2261417478150191157" resolveInfo="canHavParameter" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.BooleanType" typeId="yvor.1070534644030:3" id="2261417478150191167" />
    </node>
    <node role="constructor" roleId="2rzm.1225194240801" type="2rzm.ConceptConstructorDeclaration" typeId="2rzm.1225194413805" id="1240249694732">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1240249694733" />
    </node>
  </root>
  <root id="1240823859791">
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="1240823861529">
      <property name="name" nameId="yvnu.1169194664001:0" value="getPresentation" />
      <link role="overriddenMethod" roleId="2rzm.1225194472831" targetNodeId="yvnz.1213877396640" resolveInfo="getPresentation" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1240823861532">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1240823873373">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1240823923670">
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1240823923705">
              <property name="value" nameId="yvor.1070475926801:3" value="&gt;" />
            </node>
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1240823917185">
              <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1240823914022">
                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1240823904958">
                  <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1240823881084">
                    <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240823896552">
                      <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1240823894336" />
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SConceptPropertyAccess" typeId="yvim.1145994841052:16" id="1240823899067">
                        <link role="conceptProperty" roleId="yvim.1145994841055:16" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
                      </node>
                    </node>
                    <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1240823873374">
                      <property name="value" nameId="yvor.1070475926801:3" value="&lt;" />
                    </node>
                  </node>
                  <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240823909289">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240823907798">
                      <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1240823907625" />
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1240823908587">
                        <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1240424397093:7" />
                      </node>
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ConceptMethodCall" typeId="yvim.1179409122411:16" id="1240823910752">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvnz.1213877396640" resolveInfo="getPresentation" />
                    </node>
                  </node>
                </node>
                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1240823914240">
                  <property name="value" nameId="yvor.1070475926801:3" value=", " />
                </node>
              </node>
              <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240823920203">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240823918173">
                  <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1240823918005" />
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1240823919117">
                    <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1240424402756:7" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ConceptMethodCall" typeId="yvim.1179409122411:16" id="1240823921330">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvnz.1213877396640" resolveInfo="getPresentation" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.StringType" typeId="yvor.1225271177708:3" id="4887793210800602569" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1240823866531" />
    </node>
    <node role="constructor" roleId="2rzm.1225194240801" type="2rzm.ConceptConstructorDeclaration" typeId="2rzm.1225194413805" id="1240823859792">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1240823859793" />
    </node>
  </root>
  <root id="5686963296372576518">
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="5686963296372576521">
      <property name="name" nameId="yvnu.1169194664001:0" value="getPresentation" />
      <property name="isPrivate" nameId="2rzm.1225194472833" value="false" />
      <link role="overriddenMethod" roleId="2rzm.1225194472831" targetNodeId="yvnz.1213877396640" resolveInfo="getPresentation" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="5686963296372576522">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="5686963296372576523">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="5686963296372576524">
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="5686963296372576525">
              <property name="value" nameId="yvor.1070475926801:3" value="&gt;" />
            </node>
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="5686963296372576526">
              <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="5686963296372576527">
                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="5686963296372576528">
                  <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="5686963296372576529" />
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SConceptPropertyAccess" typeId="yvim.1145994841052:16" id="5686963296372576530">
                    <link role="conceptProperty" roleId="yvim.1145994841055:16" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
                  </node>
                </node>
                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="5686963296372576531">
                  <property name="value" nameId="yvor.1070475926801:3" value="&lt;" />
                </node>
              </node>
              <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="5686963296372576532">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="5686963296372576533">
                  <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="5686963296372576534" />
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="5686963296372577651">
                    <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.5686963296372573084:7" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ConceptMethodCall" typeId="yvim.1179409122411:16" id="5686963296372576536">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvnz.1213877396640" resolveInfo="getPresentation" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.StringType" typeId="yvor.1225271177708:3" id="5686963296372576537" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="5686963296372576538" />
    </node>
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="5686963296372577658">
      <property name="name" nameId="yvnu.1169194664001:0" value="getVariableSuffixes" />
      <property name="isPrivate" nameId="2rzm.1225194472833" value="false" />
      <link role="overriddenMethod" roleId="2rzm.1225194472831" targetNodeId="yvou.1213877337304" resolveInfo="getVariableSuffixes" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="5686963296372577659">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="5686963296372577660">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="5686963296372577661">
            <property name="name" nameId="yvnu.1169194664001:0" value="variableSuffixes" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.ListType" typeId="yvix.1151688443754:7" id="5686963296372577662">
              <node role="elementType" roleId="yvix.1151688676805:7" type="yvor.StringType" typeId="yvor.1225271177708:3" id="5686963296372577663" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="5686963296372577664">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvix.ListCreatorWithInit" typeId="yvix.1160600644654:7" id="5686963296372577665">
                <node role="elementType" roleId="yvix.1237721435807:7" type="yvor.StringType" typeId="yvor.1225271177708:3" id="5686963296372577666" />
                <node role="initValue" roleId="yvix.1237721435808:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="5686963296372577706">
                  <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="5686963296372577703" />
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SConceptPropertyAccess" typeId="yvim.1145994841052:16" id="5686963296372577712">
                    <link role="conceptProperty" roleId="yvim.1145994841055:16" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="5686963296372577668">
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="5686963296372577669">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1447667470349161819">
              <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1447667470349161820">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvix.ForEachStatement" typeId="yvix.1153943597977:7" id="1447667470349200618">
                  <node role="variable" roleId="yvix.1153944400369:7" type="yvix.ForEachVariable" typeId="yvix.1153944193378:7" id="1447667470349200619">
                    <property name="name" nameId="yvnu.1169194664001:0" value="suffix" />
                  </node>
                  <node role="inputSequence" roleId="yvix.1153944424730:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1447667470349200620">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1447667470349200621">
                      <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1447667470349200622" />
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1447667470349200638">
                        <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.5686963296372573084:7" />
                      </node>
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ConceptMethodCall" typeId="yvim.1179409122411:16" id="1447667470349200624">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvou.1213877337304" resolveInfo="getVariableSuffixes" />
                    </node>
                  </node>
                  <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1447667470349200625">
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1447667470349200626">
                      <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1447667470349200627">
                        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1447667470349200628">
                          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1447667470349200629">
                            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1447667470349200630">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="5686963296372577661" resolveInfo="variableSuffixes" />
                            </node>
                            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddElementOperation" typeId="yvix.1160612413312:7" id="1447667470349200631">
                              <node role="argument" roleId="yvix.1160612519549:7" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="1447667470349200632">
                                <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="1447667470349200619" resolveInfo="suffix" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotExpression" typeId="yvor.1081516740877:3" id="1447667470349200633">
                        <node role="expression" roleId="yvor.1081516765348:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1447667470349200634">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1447667470349200635">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="5686963296372577661" resolveInfo="variableSuffixes" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvix.ContainsOperation" typeId="yvix.1172254888721:7" id="1447667470349200636">
                            <node role="argument" roleId="yvix.1172256416782:7" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="1447667470349200637">
                              <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="1447667470349200619" resolveInfo="suffix" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1447667470349161829">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1447667470349161824">
                  <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1447667470349161823" />
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1447667470349161828">
                    <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.5686963296372573084:7" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ConceptMethodCall" typeId="yvim.1179409122411:16" id="1447667470349161833">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvou.1447667470349154499" resolveInfo="hasPluralVariableSuffixes" />
                </node>
              </node>
              <node role="ifFalseStatement" roleId="yvor.1082485599094:3" type="yvor.BlockStatement" typeId="yvor.1082485599095:3" id="1447667470349161834">
                <node role="statements" roleId="yvor.1082485599096:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1447667470349161835">
                  <node role="statement" roleId="yvor.1068581517665:3" type="yvix.ForEachStatement" typeId="yvix.1153943597977:7" id="5686963296372577670">
                    <node role="variable" roleId="yvix.1153944400369:7" type="yvix.ForEachVariable" typeId="yvix.1153944193378:7" id="5686963296372577671">
                      <property name="name" nameId="yvnu.1169194664001:0" value="suffix" />
                    </node>
                    <node role="inputSequence" roleId="yvix.1153944424730:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="5686963296372577672">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="5686963296372577673">
                        <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="5686963296372577674" />
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="5686963296372577697">
                          <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.5686963296372573084:7" />
                        </node>
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ConceptMethodCall" typeId="yvim.1179409122411:16" id="5686963296372577676">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvou.1213877337304" resolveInfo="getVariableSuffixes" />
                      </node>
                    </node>
                    <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="5686963296372577677">
                      <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="5686963296372577678">
                        <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="5686963296372577679">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="5686963296372577680">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="5686963296372577661" resolveInfo="variableSuffixes" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddElementOperation" typeId="yvix.1160612413312:7" id="5686963296372577681">
                            <node role="argument" roleId="yvix.1160612519549:7" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="5686963296372577682">
                              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="6eoo.~NameUtil%dpluralize(java%dlang%dString)%cjava%dlang%dString" resolveInfo="pluralize" />
                              <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="6eoo.~NameUtil" resolveInfo="NameUtil" />
                              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="5686963296372577683">
                                <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="5686963296372577671" resolveInfo="suffix" />
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
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="5686963296372577684">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="5686963296372577685">
              <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="5686963296372577686" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="5686963296372577696">
                <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.5686963296372573084:7" />
              </node>
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_IsNotNullOperation" typeId="yvim.1172008320231:16" id="5686963296372577688" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="5686963296372577689">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="5686963296372577690">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="5686963296372577661" resolveInfo="variableSuffixes" />
          </node>
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvix.ListType" typeId="yvix.1151688443754:7" id="5686963296372577691">
        <node role="elementType" roleId="yvix.1151688676805:7" type="yvor.StringType" typeId="yvor.1225271177708:3" id="5686963296372577692" />
      </node>
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="5686963296372577693" />
    </node>
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="1447667470349161849">
      <property name="name" nameId="yvnu.1169194664001:0" value="hasPluralVariableSuffixes" />
      <link role="overriddenMethod" roleId="2rzm.1225194472831" targetNodeId="yvou.1447667470349154499" resolveInfo="hasPluralVariableSuffixes" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1447667470349161852">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1447667470349161856">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="1447667470349161857">
            <property name="value" nameId="yvor.1068580123138:3" value="true" />
          </node>
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.BooleanType" typeId="yvor.1070534644030:3" id="1447667470349161854" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.ProtectedVisibility" typeId="yvor.1146644641414:3" id="1447667470349161855" />
    </node>
    <node role="constructor" roleId="2rzm.1225194240801" type="2rzm.ConceptConstructorDeclaration" typeId="2rzm.1225194413805" id="5686963296372576519">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="5686963296372576520" />
    </node>
  </root>
  <root id="2141797557973018586">
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="2141797557973018589">
      <property name="name" nameId="yvnu.1169194664001:0" value="expectedOperandType" />
      <property name="isVirtual" nameId="2rzm.1225194472832" value="true" />
      <property name="isAbstract" nameId="2rzm.1225194472834" value="false" />
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="2141797557973018593">
        <property name="name" nameId="yvnu.1169194664001:0" value="elementType" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="2141797557973018595" />
      </node>
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="2141797557973018590" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="2141797557973018596" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="2141797557973018592">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="497032923610432965">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="497032923610432966">
            <property name="name" nameId="yvnu.1169194664001:0" value="jt" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="497032923610432967">
              <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvo4.1179479408386:3" resolveInfo="JoinType" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="497032923610432968">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvim.SNodeCreator" typeId="yvim.1180636770613:16" id="497032923610432969">
                <node role="createdType" roleId="yvim.1180636770616:16" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="497032923610432970">
                  <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvo4.1179479408386:3" resolveInfo="JoinType" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ForeachStatement" typeId="yvor.1144226303539:3" id="497032923610416156">
          <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="497032923610416157">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="497032923610152022">
              <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="497032923610152023">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="497032923610152047">
                  <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="497032923610152048">
                    <property name="name" nameId="yvnu.1169194664001:0" value="rt" />
                    <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="497032923610152049">
                      <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvor.1068431790189:3" resolveInfo="Type" />
                    </node>
                    <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="497032923610152050">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="497032923610152051">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="497032923610416160" resolveInfo="et" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_CopyOperation" typeId="yvim.1144146199828:16" id="497032923610152052" />
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="497032923610152479">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="497032923610152502">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="497032923610152494">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="497032923610152485">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="497032923610152480">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="497032923610152048" resolveInfo="rt" />
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_GetChildrenOperation" typeId="yvim.1171500988903:16" id="497032923610152491" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetFirstOperation" typeId="yvix.1165525191778:7" id="497032923610152498" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ReplaceWithAnotherOperation" typeId="yvim.1140131837776:16" id="497032923610152509">
                      <node role="replacementNode" roleId="yvim.1140131861877:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="497032923610792438">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="497032923610152511">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2141797557973018593" resolveInfo="elementType" />
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_CopyOperation" typeId="yvim.1144146199828:16" id="497032923610792442" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="497032923610723038">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="497032923610723045">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="497032923610723040">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="497032923610723039">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="497032923610432966" resolveInfo="mt" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkListAccess" typeId="yvim.1138056282393:16" id="497032923610792444">
                        <link role="link" roleId="yvim.1138056546658:16" targetNodeId="yvo4.1179479418730:3" />
                      </node>
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddElementOperation" typeId="yvix.1160612413312:7" id="4296974352970550225">
                      <node role="argument" roleId="yvix.1160612519549:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="497032923610723052">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="497032923610152048" resolveInfo="rt" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="497032923610152029">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="497032923610152026">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="497032923610416160" resolveInfo="et" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_IsNotNullOperation" typeId="yvim.1172008320231:16" id="497032923610152035" />
              </node>
            </node>
          </node>
          <node role="variable" roleId="yvor.1144230900587:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="497032923610416160">
            <property name="name" nameId="yvnu.1169194664001:0" value="et" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="497032923610416164" />
          </node>
          <node role="iterable" roleId="yvor.1144226360166:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="497032923610416167">
            <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="497032923610416168" />
            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SConceptLinkAccess" typeId="yvim.1175618182947:16" id="497032923610416169">
              <link role="conceptLinkDeclaration" roleId="yvim.1175618223511:16" targetNodeId="yvix.497032923610147119:7" resolveInfo="expectedOperandType" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="497032923610152517">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="497032923610432995">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="497032923610432966" resolveInfo="jt" />
          </node>
        </node>
      </node>
    </node>
    <node role="constructor" roleId="2rzm.1225194240801" type="2rzm.ConceptConstructorDeclaration" typeId="2rzm.1225194413805" id="2141797557973018587">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="2141797557973018588" />
    </node>
  </root>
  <root id="2141797557973018609">
    <node role="constructor" roleId="2rzm.1225194240801" type="2rzm.ConceptConstructorDeclaration" typeId="2rzm.1225194413805" id="2141797557973018610">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="2141797557973018611" />
    </node>
  </root>
  <root id="3358009230509337679">
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="7602110602933345818">
      <property name="name" nameId="yvnu.1169194664001:0" value="getAbstractCreators" />
      <property name="isVirtual" nameId="2rzm.1225194472832" value="true" />
      <link role="overriddenMethod" roleId="2rzm.1225194472831" targetNodeId="yvou.7602110602933317830" resolveInfo="getAbstractCreators" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="7602110602933345819" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="7602110602933345820">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="3358009230509358916">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="3358009230509358917">
            <property name="name" nameId="yvnu.1169194664001:0" value="res" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="3358009230509358918">
              <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvor.1145552809883:3" resolveInfo="AbstractCreator" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="3358009230509358919">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvim.SNodeListCreator" typeId="yvim.1145567426890:16" id="3358009230509358920">
                <node role="createdType" roleId="yvim.1145567471833:16" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="3358009230509358921">
                  <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvor.1145552809883:3" resolveInfo="AbstractCreator" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="3358009230509358923">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3358009230509358925">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="3358009230509358924">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="3358009230509358917" resolveInfo="res" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddElementOperation" typeId="yvix.1160612413312:7" id="3358009230509358929">
              <node role="argument" roleId="yvix.1160612519549:7" type="yvjf.Quotation" typeId="yvjf.1196350785113:0" id="3358009230509358933">
                <node role="quotedNode" roleId="yvjf.1196350785114:0" type="yvix.LinkedListCreator" typeId="yvix.1227008614712:7" id="3358009230509358937">
                  <node role="elementType" roleId="yvix.1237721435807:7" type="yvor.Type" typeId="yvor.1068431790189:3" id="3358009230509358938">
                    <node role="_attr_$attribute" type="yvjf.Antiquotation" typeId="yvjf.1196350785112:0" id="3358009230509358939">
                      <node role="expression" roleId="yvjf.1196350785111:0" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3358009230509358942">
                        <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="3358009230509358941" />
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="3358009230509358946">
                          <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.5686963296372573084:7" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="3358009230509700612">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3358009230509700614">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="3358009230509700613">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="3358009230509358917" resolveInfo="res" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddElementOperation" typeId="yvix.1160612413312:7" id="3358009230509700618">
              <node role="argument" roleId="yvix.1160612519549:7" type="yvjf.Quotation" typeId="yvjf.1196350785113:0" id="3358009230509700622">
                <node role="quotedNode" roleId="yvjf.1196350785114:0" type="yvix.PriorityQueueCreator" typeId="yvix.3358009230509514604:7" id="3358009230509700626">
                  <node role="elementType" roleId="yvix.1237721435807:7" type="yvor.Type" typeId="yvor.1068431790189:3" id="3358009230509700627">
                    <node role="_attr_$attribute" type="yvjf.Antiquotation" typeId="yvjf.1196350785112:0" id="3358009230509700628">
                      <node role="expression" roleId="yvjf.1196350785111:0" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3358009230509700631">
                        <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="3358009230509700630" />
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="3358009230509700635">
                          <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.5686963296372573084:7" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1576845966386920584">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1576845966386920585">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1576845966386920586">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="3358009230509358917" resolveInfo="res" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddAllElementsOperation" typeId="yvix.1160666733551:7" id="1576845966386920587">
              <node role="argument" roleId="yvix.1160666822012:7" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1576845966386920588">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1331913329176269843" resolveInfo="creators" />
                <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="1331913329176269837" resolveInfo="CustomContainersUtil" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="7602110602933345844">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7602110602933345821" resolveInfo="targetModel" />
                </node>
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1576845966386920589" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="3358009230509358950">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="3358009230509358954">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="3358009230509358917" resolveInfo="res" />
          </node>
        </node>
      </node>
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="7602110602933345821">
        <property name="name" nameId="yvnu.1169194664001:0" value="targetModel" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SModelType" typeId="yvim.1143226024141:16" id="7602110602933345822" />
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="7602110602933345823">
        <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvor.1145552809883:3" resolveInfo="AbstractCreator" />
      </node>
    </node>
    <node role="constructor" roleId="2rzm.1225194240801" type="2rzm.ConceptConstructorDeclaration" typeId="2rzm.1225194413805" id="3358009230509337680">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="3358009230509337681" />
    </node>
  </root>
  <root id="3358009230509514611">
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="3358009230509514614">
      <property name="name" nameId="yvnu.1169194664001:0" value="createType" />
      <link role="overriddenMethod" roleId="2rzm.1225194472831" targetNodeId="1237722437229" resolveInfo="createType" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="3358009230509514617">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="3358009230509516543">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvjf.Quotation" typeId="yvjf.1196350785113:0" id="3358009230509516544">
            <node role="quotedNode" roleId="yvjf.1196350785114:0" type="yvix.QueueType" typeId="yvix.5686963296372475025:7" id="3358009230509516546">
              <node role="elementType" roleId="yvix.5686963296372573084:7" type="yvor.Type" typeId="yvor.1068431790189:3" id="3358009230509516547">
                <node role="_attr_$attribute" type="yvjf.Antiquotation" typeId="yvjf.1196350785112:0" id="3358009230509516548">
                  <node role="expression" roleId="yvjf.1196350785111:0" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3358009230509516551">
                    <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="3358009230509516550" />
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="3358009230509516555">
                      <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1237721435807:7" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="3358009230509514618">
        <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvor.1068431790189:3" resolveInfo="Type" />
      </node>
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="3358009230509514619" />
    </node>
    <node role="constructor" roleId="2rzm.1225194240801" type="2rzm.ConceptConstructorDeclaration" typeId="2rzm.1225194413805" id="3358009230509514612">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="3358009230509514613" />
    </node>
  </root>
  <root id="3358009230509734418">
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="7602110602933345651">
      <property name="name" nameId="yvnu.1169194664001:0" value="getAbstractCreators" />
      <property name="isVirtual" nameId="2rzm.1225194472832" value="true" />
      <link role="overriddenMethod" roleId="2rzm.1225194472831" targetNodeId="yvou.7602110602933317830" resolveInfo="getAbstractCreators" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="7602110602933345652" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="7602110602933345653">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="3358009230509734428">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="3358009230509734429">
            <property name="name" nameId="yvnu.1169194664001:0" value="res" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="3358009230509734430">
              <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvor.1145552809883:3" resolveInfo="AbstractCreator" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="3358009230509734431">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvim.SNodeListCreator" typeId="yvim.1145567426890:16" id="3358009230509734432">
                <node role="createdType" roleId="yvim.1145567471833:16" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="3358009230509734433">
                  <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvor.1145552809883:3" resolveInfo="AbstractCreator" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="3358009230509734434">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3358009230509734435">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="3358009230509734436">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="3358009230509734429" resolveInfo="res" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddElementOperation" typeId="yvix.1160612413312:7" id="3358009230509734437">
              <node role="argument" roleId="yvix.1160612519549:7" type="yvjf.Quotation" typeId="yvjf.1196350785113:0" id="3358009230509734438">
                <node role="quotedNode" roleId="yvjf.1196350785114:0" type="yvix.LinkedListCreator" typeId="yvix.1227008614712:7" id="3358009230509734439">
                  <node role="elementType" roleId="yvix.1237721435807:7" type="yvor.Type" typeId="yvor.1068431790189:3" id="3358009230509734440">
                    <node role="_attr_$attribute" type="yvjf.Antiquotation" typeId="yvjf.1196350785112:0" id="3358009230509734441">
                      <node role="expression" roleId="yvjf.1196350785111:0" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3358009230509734442">
                        <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="3358009230509734443" />
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="3358009230509734444">
                          <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.5686963296372573084:7" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1576845966386920598">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1576845966386920599">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1576845966386920600">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="3358009230509734429" resolveInfo="res" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddAllElementsOperation" typeId="yvix.1160666733551:7" id="1576845966386920601">
              <node role="argument" roleId="yvix.1160666822012:7" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1576845966386920602">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1331913329176269843" resolveInfo="creators" />
                <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="1331913329176269837" resolveInfo="CustomContainersUtil" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="7602110602933345675">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7602110602933345654" resolveInfo="targetModel" />
                </node>
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1576845966386920603" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="3358009230509734456">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="3358009230509734457">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="3358009230509734429" resolveInfo="res" />
          </node>
        </node>
      </node>
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="7602110602933345654">
        <property name="name" nameId="yvnu.1169194664001:0" value="targetModel" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SModelType" typeId="yvim.1143226024141:16" id="7602110602933345655" />
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="7602110602933345656">
        <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvor.1145552809883:3" resolveInfo="AbstractCreator" />
      </node>
    </node>
    <node role="constructor" roleId="2rzm.1225194240801" type="2rzm.ConceptConstructorDeclaration" typeId="2rzm.1225194413805" id="3358009230509734419">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="3358009230509734420" />
    </node>
  </root>
  <root id="3358009230509812020">
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="7602110602933346049">
      <property name="name" nameId="yvnu.1169194664001:0" value="getAbstractCreators" />
      <property name="isVirtual" nameId="2rzm.1225194472832" value="true" />
      <link role="overriddenMethod" roleId="2rzm.1225194472831" targetNodeId="yvou.7602110602933317830" resolveInfo="getAbstractCreators" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="7602110602933346050" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="7602110602933346051">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="3358009230509812025">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="3358009230509812026">
            <property name="name" nameId="yvnu.1169194664001:0" value="res" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="3358009230509812027">
              <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvor.1145552809883:3" resolveInfo="AbstractCreator" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="3358009230509812028">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvim.SNodeListCreator" typeId="yvim.1145567426890:16" id="3358009230509812029">
                <node role="createdType" roleId="yvim.1145567471833:16" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="3358009230509812030">
                  <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvor.1145552809883:3" resolveInfo="AbstractCreator" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="3358009230509812031">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3358009230509812032">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="3358009230509812033">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="3358009230509812026" resolveInfo="res" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddElementOperation" typeId="yvix.1160612413312:7" id="3358009230509812034">
              <node role="argument" roleId="yvix.1160612519549:7" type="yvjf.Quotation" typeId="yvjf.1196350785113:0" id="3358009230509812035">
                <node role="quotedNode" roleId="yvjf.1196350785114:0" type="yvix.LinkedListCreator" typeId="yvix.1227008614712:7" id="3358009230509812036">
                  <node role="elementType" roleId="yvix.1237721435807:7" type="yvor.Type" typeId="yvor.1068431790189:3" id="3358009230509812037">
                    <node role="_attr_$attribute" type="yvjf.Antiquotation" typeId="yvjf.1196350785112:0" id="3358009230509812038">
                      <node role="expression" roleId="yvjf.1196350785111:0" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3358009230509812039">
                        <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="3358009230509812040" />
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="3358009230509812041">
                          <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.5686963296372573084:7" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1576845966386920563">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1576845966386920564">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1576845966386920573">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="3358009230509812026" resolveInfo="res" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddAllElementsOperation" typeId="yvix.1160666733551:7" id="1576845966386920566">
              <node role="argument" roleId="yvix.1160666822012:7" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1576845966386920567">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1331913329176269843" resolveInfo="creators" />
                <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="1331913329176269837" resolveInfo="CustomContainersUtil" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="7602110602933346073">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7602110602933346052" resolveInfo="targetModel" />
                </node>
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1576845966386920568" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="3358009230509812042">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="3358009230509812043">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="3358009230509812026" resolveInfo="res" />
          </node>
        </node>
      </node>
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="7602110602933346052">
        <property name="name" nameId="yvnu.1169194664001:0" value="targetModel" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SModelType" typeId="yvim.1143226024141:16" id="7602110602933346053" />
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="7602110602933346054">
        <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvor.1145552809883:3" resolveInfo="AbstractCreator" />
      </node>
    </node>
    <node role="constructor" roleId="2rzm.1225194240801" type="2rzm.ConceptConstructorDeclaration" typeId="2rzm.1225194413805" id="3358009230509812021">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="3358009230509812022" />
    </node>
  </root>
  <root id="1331913329176106421">
    <node role="constructor" roleId="2rzm.1225194240801" type="2rzm.ConceptConstructorDeclaration" typeId="2rzm.1225194413805" id="1331913329176106422">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1331913329176106423" />
    </node>
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="1331913329176106428">
      <property name="name" nameId="yvnu.1169194664001:0" value="createType" />
      <property name="isVirtual" nameId="2rzm.1225194472832" value="true" />
      <link role="overriddenMethod" roleId="2rzm.1225194472831" targetNodeId="1237722437229" resolveInfo="createType" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1331913329176106429" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1331913329176106430">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1331913329176106542">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1331913329176106543">
            <property name="name" nameId="yvnu.1169194664001:0" value="res" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1331913329176106544">
              <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvor.1068431790189:3" resolveInfo="Type" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1331913329176106545">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1331913329176106546">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1331913329176106547">
                  <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1331913329176106548" />
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1331913329176106549">
                    <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1331913329176106420:7" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1331913329176106550">
                  <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.6099516049394485311:7" />
                </node>
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_CopyOperation" typeId="yvim.1144146199828:16" id="1331913329176106551" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.SingleLineComment" typeId="yvor.6329021646629104954:3" id="7376433222636453465">
          <node role="commentPart" roleId="yvor.6329021646629175155:3" type="yvor.TextCommentPart" typeId="yvor.6329021646629104957:3" id="7376433222636453466">
            <property name="text" nameId="yvor.6329021646629104958:3" value=" workaround an SModel's dumbness" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1331913329176269760">
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1331913329176269761">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1331913329176106554">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1331913329176106562">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvim.SemanticDowncastExpression" typeId="yvim.1145404486709:16" id="1331913329176106558">
                  <node role="leftExpression" roleId="yvim.1145404616321:16" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1331913329176106555">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1331913329176106543" resolveInfo="res" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1331913329176106567">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SNode%dchangeModel(jetbrains%dmps%dsmodel%dSModel)%cvoid" resolveInfo="changeModel" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1331913329176106570">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1331913329176106569">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="txlh.~AuxilaryRuntimeModel%dgetDescriptor()%cjetbrains%dmps%dsmodel%dSModelDescriptor" resolveInfo="getDescriptor" />
                      <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="txlh.~AuxilaryRuntimeModel" resolveInfo="AuxilaryRuntimeModel" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1331913329176106574">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SModelDescriptor%dgetSModel()%cjetbrains%dmps%dsmodel%dSModel" resolveInfo="getSModel" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotEqualsExpression" typeId="yvor.1073239437375:3" id="1331913329176269767">
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1331913329176269770" />
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1331913329176269764">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1331913329176106543" resolveInfo="res" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="5192033827214196804">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="5192033827214196827">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="5192033827214196815">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="5192033827214196808">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="5192033827214196805">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1331913329176106543" resolveInfo="res" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_GetChildrenOperation" typeId="yvim.1171500988903:16" id="5192033827214196813" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvix.ToListOperation" typeId="yvix.1151702311717:7" id="5192033827214196819" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.VisitAllOperation" typeId="yvix.1204980550705:7" id="5192033827214196834">
              <node role="closure" roleId="yvix.1204796294226:7" type="yviq.ClosureLiteral" typeId="yviq.1199569711397:3" id="5192033827214196835">
                <node role="body" roleId="yviq.1199569916463:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="5192033827214196836">
                  <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="5192033827214196844">
                    <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="5192033827214196864">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="5192033827214196852">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="5192033827214196837" resolveInfo="chld" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_IsInstanceOfOperation" typeId="yvim.1139621453865:16" id="5192033827214196876">
                        <node role="conceptArgument" roleId="yvim.1177027386292:16" type="yvim.RefConcept_Reference" typeId="yvim.1177026924588:16" id="5192033827214196883">
                          <link role="conceptDeclaration" roleId="yvim.1177026940964:16" targetNodeId="yvor.1109283449304:3" resolveInfo="TypeVariableReference" />
                        </node>
                      </node>
                    </node>
                    <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="5192033827214196846">
                      <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="5192033827214196889">
                        <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="5192033827214196902">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="5192033827214196890">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="5192033827214196837" resolveInfo="chld" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ReplaceWithAnotherOperation" typeId="yvim.1140131837776:16" id="5192033827214196917">
                            <node role="replacementNode" roleId="yvim.1140131861877:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="5192033827214196945">
                              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="5192033827214196930">
                                <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="5192033827214196924" />
                                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="5192033827214196939">
                                  <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1237721435807:7" />
                                </node>
                              </node>
                              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_CopyOperation" typeId="yvim.1144146199828:16" id="5192033827214196954" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="parameter" roleId="yviq.1199569906740:3" type="yvix.SmartClosureParameterDeclaration" typeId="yvix.1203518072036:7" id="5192033827214196837">
                  <property name="name" nameId="yvnu.1169194664001:0" value="chld" />
                  <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.WildCardType" typeId="yvor.1171903607971:3" id="5192033827214196838" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1331913329176106576">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1331913329176106577">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1331913329176106543" resolveInfo="res" />
          </node>
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1331913329176106431">
        <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvor.1068431790189:3" resolveInfo="Type" />
      </node>
    </node>
  </root>
  <root id="1331913329176269837">
    <node role="staticMethod" roleId="yvor.1070462273904:3" type="yvor.StaticMethodDeclaration" typeId="yvor.1081236700938:3" id="1331913329176269843">
      <property name="name" nameId="yvnu.1169194664001:0" value="containerCreators" />
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="7602110602933087137">
        <property name="name" nameId="yvnu.1169194664001:0" value="model" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SModelType" typeId="yvim.1143226024141:16" id="7602110602933087153" />
      </node>
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1331913329176269850">
        <property name="name" nameId="yvnu.1169194664001:0" value="type" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1331913329176269852">
          <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvor.1068431790189:3" resolveInfo="Type" />
        </node>
      </node>
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1331913329176269845" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvix.SequenceType" typeId="yvix.1151689724996:7" id="1331913329176269847">
        <node role="elementType" roleId="yvix.1151689745422:7" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1331913329176269849">
          <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvor.1145552809883:3" resolveInfo="AbstractCreator" />
        </node>
      </node>
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1331913329176269853">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1331913329176269888">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.CastExpression" typeId="yvor.1070534934090:3" id="1576845966387098637">
            <node role="type" roleId="yvor.1070534934091:3" type="yvix.SequenceType" typeId="yvix.1151689724996:7" id="1576845966387098638">
              <node role="elementType" roleId="yvix.1151689745422:7" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1576845966387098639">
                <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvor.1145552809883:3" resolveInfo="AbstractCreator" />
              </node>
            </node>
            <node role="expression" roleId="yvor.1070534934092:3" type="yvor.TernaryOperatorExpression" typeId="yvor.1163668896201:3" id="1576845966387098640">
              <node role="ifFalse" roleId="yvor.1163668934364:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1576845966387098641">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalStaticMethodCall" typeId="yvor.1172058436953:3" id="9034802358628472698">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="9034802358628470395" resolveInfo="containerDeclarations" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="7602110602933087221">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7602110602933087137" resolveInfo="model" />
                  </node>
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="9034802358628472713">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1331913329176269850" resolveInfo="type" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvix.SelectOperation" typeId="yvix.1202128969694:7" id="1576845966387098643">
                  <node role="closure" roleId="yvix.1204796294226:7" type="yviq.ClosureLiteral" typeId="yviq.1199569711397:3" id="1576845966387098644">
                    <node role="body" roleId="yviq.1199569916463:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1576845966387098645">
                      <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1576845966387098646">
                        <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1576845966387098647">
                          <property name="name" nameId="yvnu.1169194664001:0" value="ccc" />
                          <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1576845966387098648">
                            <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvix.1331913329176106419:7" resolveInfo="CustomContainerCreator" />
                          </node>
                          <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1576845966387098649">
                            <node role="creator" roleId="yvor.1145553007750:3" type="yvim.SNodeCreator" typeId="yvim.1180636770613:16" id="1576845966387098650">
                              <node role="createdType" roleId="yvim.1180636770616:16" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1576845966387098651">
                                <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvix.1331913329176106419:7" resolveInfo="CustomContainerCreator" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1576845966387098652">
                        <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1576845966387098653">
                          <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1576845966387098654">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1576845966387098660" resolveInfo="ccd" />
                          </node>
                          <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1576845966387098655">
                            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1576845966387098656">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1576845966387098647" resolveInfo="ccc" />
                            </node>
                            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1576845966387098657">
                              <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1331913329176106420:7" />
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1279588871815509430">
                        <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1279588871815509431">
                          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1576845966387106089">
                            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1576845966387106138">
                              <node role="rValue" roleId="yvor.1068498886297:3" type="yvim.SNodeTypeCastExpression" typeId="yvim.1140137987495:16" id="1576845966387106239">
                                <property name="asCast" nameId="yvim.1238684351431:16" value="true" />
                                <link role="concept" roleId="yvim.1140138128738:16" targetNodeId="yvor.1068431790189:3" resolveInfo="Type" />
                                <node role="leftExpression" roleId="yvim.1140138123956:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1576845966387106203">
                                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1576845966387106170">
                                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1576845966387106155">
                                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1331913329176269850" resolveInfo="type" />
                                    </node>
                                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_GetChildrenOperation" typeId="yvim.1171500988903:16" id="1576845966387106188" />
                                  </node>
                                  <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetFirstOperation" typeId="yvix.1165525191778:7" id="1576845966387106221" />
                                </node>
                              </node>
                              <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1576845966387106105">
                                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1576845966387106090">
                                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1576845966387098647" resolveInfo="ccc" />
                                </node>
                                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1576845966387106123">
                                  <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1237721435807:7" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="condition" roleId="yvor.1068580123160:3" type="yvor.EqualsExpression" typeId="yvor.1068580123152:3" id="1279588871815509576">
                          <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1279588871815509579">
                            <property name="value" nameId="yvor.1068580320021:3" value="1" />
                          </node>
                          <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1279588871815509538">
                            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1279588871815509467">
                              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1279588871815509449">
                                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1576845966387098660" resolveInfo="ccd" />
                              </node>
                              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkListAccess" typeId="yvim.1138056282393:16" id="1279588871815509521">
                                <link role="link" roleId="yvim.1138056546658:16" targetNodeId="yvor.1109279881614:3" />
                              </node>
                            </node>
                            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetSizeOperation" typeId="yvix.1162935959151:7" id="1279588871815509557" />
                          </node>
                        </node>
                      </node>
                      <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1576845966387098658">
                        <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1576845966387098659">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1576845966387098647" resolveInfo="ccc" />
                        </node>
                      </node>
                    </node>
                    <node role="parameter" roleId="yviq.1199569906740:3" type="yvix.SmartClosureParameterDeclaration" typeId="yvix.1203518072036:7" id="1576845966387098660">
                      <property name="name" nameId="yvnu.1169194664001:0" value="ccd" />
                      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.WildCardType" typeId="yvor.1171903607971:3" id="1576845966387098661" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" roleId="yvor.1163668914799:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1576845966387098662">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1576845966387098663">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1576845966387098664">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1331913329176269850" resolveInfo="type" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_GetConceptOperation" typeId="yvim.1172323065820:16" id="1576845966387098665" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Concept_IsSubConceptOfOperation" typeId="yvim.1180031783296:16" id="1576845966387098666">
                  <node role="conceptArgument" roleId="yvim.1180031783297:16" type="yvim.RefConcept_Reference" typeId="yvim.1177026924588:16" id="1576845966387098667">
                    <link role="conceptDeclaration" roleId="yvim.1177026940964:16" targetNodeId="yvix.1197683403723:7" resolveInfo="MapType" />
                  </node>
                </node>
              </node>
              <node role="ifTrue" roleId="yvor.1163668922816:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1576845966387098668">
                <node role="operation" roleId="yvor.1197027833540:3" type="yvix.SelectOperation" typeId="yvix.1202128969694:7" id="1576845966387098670">
                  <node role="closure" roleId="yvix.1204796294226:7" type="yviq.ClosureLiteral" typeId="yviq.1199569711397:3" id="1576845966387098671">
                    <node role="body" roleId="yviq.1199569916463:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1576845966387098672">
                      <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1576845966387098673">
                        <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1576845966387098674">
                          <property name="name" nameId="yvnu.1169194664001:0" value="cmc" />
                          <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1576845966387098675">
                            <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvix.1576845966386891367:7" resolveInfo="CustomMapCreator" />
                          </node>
                          <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1576845966387098676">
                            <node role="creator" roleId="yvor.1145553007750:3" type="yvim.SNodeCreator" typeId="yvim.1180636770613:16" id="1576845966387098677">
                              <node role="createdType" roleId="yvim.1180636770616:16" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1576845966387098678">
                                <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvix.1576845966386891367:7" resolveInfo="CustomMapCreator" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1576845966387098679">
                        <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1576845966387098680">
                          <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1576845966387098681">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1576845966387098687" resolveInfo="ccd" />
                          </node>
                          <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1576845966387098682">
                            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1576845966387098683">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1576845966387098674" resolveInfo="ccc" />
                            </node>
                            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1576845966387098684">
                              <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1576845966386891370:7" />
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1279588871815509357">
                        <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1279588871815509358">
                          <property name="name" nameId="yvnu.1169194664001:0" value="tvds" />
                          <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="1279588871815509359">
                            <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvor.1109279763828:3" resolveInfo="TypeVariableDeclaration" />
                          </node>
                          <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1279588871815509360">
                            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1279588871815509361">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1576845966387098687" resolveInfo="ccd" />
                            </node>
                            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkListAccess" typeId="yvim.1138056282393:16" id="1279588871815509362">
                              <link role="link" roleId="yvim.1138056546658:16" targetNodeId="yvor.1109279881614:3" />
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1434634659124293199">
                        <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1434634659124293200">
                          <property name="name" nameId="yvnu.1169194664001:0" value="ctParams" />
                          <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.ListType" typeId="yvix.1151688443754:7" id="1434634659124293201">
                            <node role="elementType" roleId="yvix.1151688676805:7" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1434634659124293202" />
                          </node>
                          <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1434634659124293203">
                            <node role="creator" roleId="yvor.1145553007750:3" type="yvix.ListCreatorWithInit" typeId="yvix.1160600644654:7" id="1434634659124293204">
                              <node role="elementType" roleId="yvix.1237721435807:7" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1434634659124293205" />
                              <node role="initValue" roleId="yvix.1237721435808:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1434634659124293206">
                                <node role="operand" roleId="yvor.1197027771414:3" type="yvim.SNodeTypeCastExpression" typeId="yvim.1140137987495:16" id="1434634659124293207">
                                  <link role="concept" roleId="yvim.1140138128738:16" targetNodeId="yvix.1197683403723:7" resolveInfo="MapType" />
                                  <node role="leftExpression" roleId="yvim.1140138123956:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1434634659124293208">
                                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1434634659124293209">
                                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1576845966387098687" resolveInfo="ccd" />
                                    </node>
                                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1434634659124293210">
                                      <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.6099516049394485311:7" />
                                    </node>
                                  </node>
                                </node>
                                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1434634659124293211">
                                  <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1197683466920:7" />
                                </node>
                              </node>
                              <node role="initValue" roleId="yvix.1237721435808:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1434634659124293212">
                                <node role="operand" roleId="yvor.1197027771414:3" type="yvim.SNodeTypeCastExpression" typeId="yvim.1140137987495:16" id="1434634659124293213">
                                  <link role="concept" roleId="yvim.1140138128738:16" targetNodeId="yvix.1197683403723:7" resolveInfo="MapType" />
                                  <node role="leftExpression" roleId="yvim.1140138123956:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1434634659124293214">
                                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1434634659124293215">
                                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1576845966387098687" resolveInfo="ccd" />
                                    </node>
                                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1434634659124293216">
                                      <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.6099516049394485311:7" />
                                    </node>
                                  </node>
                                </node>
                                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1434634659124293217">
                                  <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1197683475734:7" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1434634659123514320">
                        <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1434634659123514321">
                          <property name="name" nameId="yvnu.1169194664001:0" value="typeParams" />
                          <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.ListType" typeId="yvix.1151688443754:7" id="1434634659123514322">
                            <node role="elementType" roleId="yvix.1151688676805:7" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1434634659123514323" />
                          </node>
                          <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1434634659123514324">
                            <node role="creator" roleId="yvor.1145553007750:3" type="yvix.ListCreatorWithInit" typeId="yvix.1160600644654:7" id="1434634659123514325">
                              <node role="elementType" roleId="yvix.1237721435807:7" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1434634659123514326" />
                              <node role="initValue" roleId="yvix.1237721435808:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1434634659123514327">
                                <node role="operand" roleId="yvor.1197027771414:3" type="yvim.SNodeTypeCastExpression" typeId="yvim.1140137987495:16" id="1434634659123514328">
                                  <property name="asCast" nameId="yvim.1238684351431:16" value="true" />
                                  <link role="concept" roleId="yvim.1140138128738:16" targetNodeId="yvix.1197683403723:7" resolveInfo="MapType" />
                                  <node role="leftExpression" roleId="yvim.1140138123956:16" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1434634659123514329">
                                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1331913329176269850" resolveInfo="type" />
                                  </node>
                                </node>
                                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1434634659123514330">
                                  <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1197683466920:7" />
                                </node>
                              </node>
                              <node role="initValue" roleId="yvix.1237721435808:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1434634659123514331">
                                <node role="operand" roleId="yvor.1197027771414:3" type="yvim.SNodeTypeCastExpression" typeId="yvim.1140137987495:16" id="1434634659123514332">
                                  <link role="concept" roleId="yvim.1140138128738:16" targetNodeId="yvix.1197683403723:7" resolveInfo="MapType" />
                                  <node role="leftExpression" roleId="yvim.1140138123956:16" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1434634659123514333">
                                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1331913329176269850" resolveInfo="type" />
                                  </node>
                                </node>
                                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1434634659123514334">
                                  <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1197683475734:7" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ForStatement" typeId="yvor.1144231330558:3" id="1434634659124293271">
                        <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1434634659124293272">
                          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1434634659124293832">
                            <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1434634659124293833">
                              <property name="name" nameId="yvnu.1169194664001:0" value="c" />
                              <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1434634659124293834" />
                              <node role="initializer" roleId="yvor.1068431790190:3" type="yvix.ListElementAccessExpression" typeId="yvix.1225711141656:7" id="1434634659124293835">
                                <node role="index" roleId="yvix.1225711191269:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1434634659124293836">
                                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1434634659124293274" resolveInfo="idx" />
                                </node>
                                <node role="list" roleId="yvix.1225711182005:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1434634659124293837">
                                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1434634659124293200" resolveInfo="ctParams" />
                                </node>
                              </node>
                            </node>
                          </node>
                          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1434634659124148763">
                            <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1434634659124148781">
                              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1434634659124148780">
                                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1434634659124293833" resolveInfo="c" />
                              </node>
                              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_IsInstanceOfOperation" typeId="yvim.1139621453865:16" id="1434634659124148799">
                                <node role="conceptArgument" roleId="yvim.1177027386292:16" type="yvim.RefConcept_Reference" typeId="yvim.1177026924588:16" id="1434634659124148815">
                                  <link role="conceptDeclaration" roleId="yvim.1177026940964:16" targetNodeId="yvor.1109283449304:3" resolveInfo="TypeVariableReference" />
                                </node>
                              </node>
                            </node>
                            <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1434634659124148765">
                              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1434634659124149575">
                                <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1434634659124149576">
                                  <property name="name" nameId="yvnu.1169194664001:0" value="pt" />
                                  <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1434634659124149577" />
                                  <node role="initializer" roleId="yvor.1068431790190:3" type="yvix.ListElementAccessExpression" typeId="yvix.1225711141656:7" id="1434634659124149578">
                                    <node role="list" roleId="yvix.1225711182005:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1434634659124149579">
                                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1434634659123514321" resolveInfo="params" />
                                    </node>
                                    <node role="index" roleId="yvix.1225711191269:7" type="yvor.TernaryOperatorExpression" typeId="yvor.1163668896201:3" id="1434634659124149580">
                                      <node role="ifFalse" roleId="yvor.1163668934364:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1434634659124149581">
                                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1434634659124293274" resolveInfo="idx" />
                                      </node>
                                      <node role="ifTrue" roleId="yvor.1163668922816:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1434634659124149582">
                                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1434634659124149583">
                                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1279588871815509358" resolveInfo="tvds" />
                                        </node>
                                        <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetIndexOfOperation" typeId="yvix.1171391069720:7" id="1434634659124149584">
                                          <node role="argument" roleId="yvix.1171391518575:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1434634659124149585">
                                            <node role="operand" roleId="yvor.1197027771414:3" type="yvim.SNodeTypeCastExpression" typeId="yvim.1140137987495:16" id="1434634659124149586">
                                              <link role="concept" roleId="yvim.1140138128738:16" targetNodeId="yvor.1109283449304:3" resolveInfo="TypeVariableReference" />
                                              <node role="leftExpression" roleId="yvim.1140138123956:16" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1434634659124149587">
                                                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1434634659124293833" resolveInfo="c" />
                                              </node>
                                            </node>
                                            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1434634659124149588">
                                              <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvor.1109283546497:3" />
                                            </node>
                                          </node>
                                        </node>
                                      </node>
                                      <node role="condition" roleId="yvor.1163668914799:3" type="yvor.GreaterThanExpression" typeId="yvor.1081506762703:3" id="1434634659124149589">
                                        <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1434634659124149590">
                                          <property name="value" nameId="yvor.1068580320021:3" value="1" />
                                        </node>
                                        <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1434634659124149591">
                                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1434634659124149592">
                                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1279588871815509358" resolveInfo="tvds" />
                                          </node>
                                          <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetSizeOperation" typeId="yvix.1162935959151:7" id="1434634659124149593" />
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.SwitchStatement" typeId="yvor.1163670490218:3" id="1434634659124149349">
                                <node role="case" roleId="yvor.1163670772911:3" type="yvor.SwitchCase" typeId="yvor.1163670641947:3" id="1434634659124149397">
                                  <node role="expression" roleId="yvor.1163670677455:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1434634659124149414">
                                    <property name="value" nameId="yvor.1068580320021:3" value="0" />
                                  </node>
                                  <node role="body" roleId="yvor.1163670683720:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1434634659124149399">
                                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1434634659124149429">
                                      <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1434634659124149478">
                                        <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1434634659124149632">
                                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1434634659124149611">
                                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1434634659124149576" resolveInfo="pt" />
                                          </node>
                                          <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_CopyOperation" typeId="yvim.1144146199828:16" id="1434634659124149653" />
                                        </node>
                                        <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1434634659124149445">
                                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1434634659124149430">
                                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1576845966387098674" resolveInfo="cmc" />
                                          </node>
                                          <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1434634659124149463">
                                            <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1197687026896:7" />
                                          </node>
                                        </node>
                                      </node>
                                    </node>
                                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.BreakStatement" typeId="yvor.1081855346303:3" id="1434634659124149701" />
                                  </node>
                                </node>
                                <node role="case" roleId="yvor.1163670772911:3" type="yvor.SwitchCase" typeId="yvor.1163670641947:3" id="1434634659124149669">
                                  <node role="expression" roleId="yvor.1163670677455:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1434634659124149716">
                                    <property name="value" nameId="yvor.1068580320021:3" value="1" />
                                  </node>
                                  <node role="body" roleId="yvor.1163670683720:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1434634659124149671">
                                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1434634659124149731">
                                      <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1434634659124149780">
                                        <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1434634659124149818">
                                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1434634659124149797">
                                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1434634659124149576" resolveInfo="pt" />
                                          </node>
                                          <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_CopyOperation" typeId="yvim.1144146199828:16" id="1434634659124149842" />
                                        </node>
                                        <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1434634659124149747">
                                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1434634659124149732">
                                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1576845966387098674" resolveInfo="cmc" />
                                          </node>
                                          <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1434634659124149765">
                                            <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1197687035757:7" />
                                          </node>
                                        </node>
                                      </node>
                                    </node>
                                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.BreakStatement" typeId="yvor.1081855346303:3" id="1434634659124210439" />
                                  </node>
                                </node>
                                <node role="expression" roleId="yvor.1163670766145:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1434634659124149382">
                                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1434634659124293274" resolveInfo="idx" />
                                </node>
                                <node role="defaultBlock" roleId="yvor.1163670592366:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1434634659124149351">
                                  <node role="statement" roleId="yvor.1068581517665:3" type="yvor.BreakStatement" typeId="yvor.1081855346303:3" id="1434634659124149858">
                                    <node role="loopLabelReference" roleId="yvor.9056323058805176516:3" type="yvor.LoopLabelReference" typeId="yvor.363746191845183785:3" id="1434634659124293899">
                                      <link role="loopLabel" roleId="yvor.363746191845183786:3" targetNodeId="1434634659124293884" resolveInfo="with_ctParams" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="variable" roleId="yvor.1144230900587:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1434634659124293274">
                          <property name="name" nameId="yvnu.1169194664001:0" value="idx" />
                          <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1434634659124293293" />
                          <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1434634659124293329">
                            <property name="value" nameId="yvor.1068580320021:3" value="0" />
                          </node>
                        </node>
                        <node role="condition" roleId="yvor.1144231399730:3" type="yvor.LessThanExpression" typeId="yvor.1081506773034:3" id="1434634659124293458">
                          <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1434634659124293496">
                            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1434634659124293478">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1434634659124293200" resolveInfo="ctParams" />
                            </node>
                            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetSizeOperation" typeId="yvix.1162935959151:7" id="1434634659124293555" />
                          </node>
                          <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1434634659124293347">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1434634659124293274" resolveInfo="idx" />
                          </node>
                        </node>
                        <node role="iteration" roleId="yvor.1144231408325:3" type="yvor.PostfixIncrementExpression" typeId="yvor.1214918800624:3" id="1434634659124293592">
                          <node role="expression" roleId="yvor.1239714902950:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1434634659124293593">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1434634659124293274" resolveInfo="idx" />
                          </node>
                        </node>
                        <node role="loopLabel" roleId="yvor.363746191845183793:3" type="yvor.LoopLabel" typeId="yvor.363746191845175146:3" id="1434634659124293884">
                          <property name="name" nameId="yvnu.1169194664001:0" value="with_ctParams" />
                        </node>
                      </node>
                      <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1576845966387098685">
                        <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1576845966387098686">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1576845966387098674" resolveInfo="ccc" />
                        </node>
                      </node>
                    </node>
                    <node role="parameter" roleId="yviq.1199569906740:3" type="yvix.SmartClosureParameterDeclaration" typeId="yvix.1203518072036:7" id="1576845966387098687">
                      <property name="name" nameId="yvnu.1169194664001:0" value="ccd" />
                      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.WildCardType" typeId="yvor.1171903607971:3" id="1576845966387098688" />
                    </node>
                  </node>
                </node>
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalStaticMethodCall" typeId="yvor.1172058436953:3" id="9034802358628472506">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="9034802358628470395" resolveInfo="containerDeclarations" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="7602110602933087280">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7602110602933087137" resolveInfo="model" />
                  </node>
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="9034802358628472521">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1331913329176269850" resolveInfo="type" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" roleId="yvor.1070462273904:3" type="yvor.StaticMethodDeclaration" typeId="yvor.1081236700938:3" id="9034802358628470395">
      <property name="name" nameId="yvnu.1169194664001:0" value="containerDeclarations" />
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="7602110602933087154">
        <property name="name" nameId="yvnu.1169194664001:0" value="model" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SModelType" typeId="yvim.1143226024141:16" id="7602110602933087191" />
      </node>
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="9034802358628472457">
        <property name="name" nameId="yvnu.1169194664001:0" value="type" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="9034802358628472459">
          <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvor.1068431790189:3" resolveInfo="Type" />
        </node>
      </node>
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="9034802358628470397" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="9034802358628470398">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="9034802358628472461">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7602110602932948074">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="9034802358628472462">
              <node role="operation" roleId="yvor.1197027833540:3" type="yvix.WhereOperation" typeId="yvix.1202120902084:7" id="9034802358628472463">
                <node role="closure" roleId="yvix.1204796294226:7" type="yviq.ClosureLiteral" typeId="yviq.1199569711397:3" id="9034802358628472464">
                  <node role="body" roleId="yviq.1199569916463:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="9034802358628472465">
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="9034802358628472466">
                      <node role="expression" roleId="yvor.1068580123156:3" type="yvor.EqualsExpression" typeId="yvor.1068580123152:3" id="9034802358628472467">
                        <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="9034802358628472468">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="9034802358628472469">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="9034802358628472457" resolveInfo="type" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_GetConceptOperation" typeId="yvim.1172323065820:16" id="9034802358628472470" />
                        </node>
                        <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="9034802358628472471">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="9034802358628472472">
                            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="9034802358628472473">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="9034802358628472476" resolveInfo="ccd" />
                            </node>
                            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="9034802358628472474">
                              <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.6099516049394485311:7" />
                            </node>
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_GetConceptOperation" typeId="yvim.1172323065820:16" id="9034802358628472475" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="parameter" roleId="yviq.1199569906740:3" type="yvix.SmartClosureParameterDeclaration" typeId="yvix.1203518072036:7" id="9034802358628472476">
                    <property name="name" nameId="yvnu.1169194664001:0" value="ccd" />
                    <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.WildCardType" typeId="yvor.1171903607971:3" id="9034802358628472477" />
                  </node>
                </node>
              </node>
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="9034802358628472478">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="9034802358628472479">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="9034802358628472480">
                    <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="35lb.8536718853245006659" resolveInfo="CollectionsLanguage" />
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="35lb.8536718853245008402" resolveInfo="getInstance" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="9034802358628472481">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="35lb.8536718853245025323" resolveInfo="getCustomContainersRegistry" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="7602110602933087344">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="35lb.7602110602933084131" resolveInfo="accessibleCustomContainerDeclarations" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="7602110602933087380">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7602110602933087154" resolveInfo="model" />
                  </node>
                </node>
              </node>
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.WhereOperation" typeId="yvix.1202120902084:7" id="7602110602932948110">
              <node role="closure" roleId="yvix.1204796294226:7" type="yviq.ClosureLiteral" typeId="yviq.1199569711397:3" id="7602110602932948111">
                <node role="body" roleId="yviq.1199569916463:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="7602110602932948112">
                  <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="7602110602932951426">
                    <node role="expression" roleId="yvor.1068580123156:3" type="yvo4.IsSubtypeExpression" typeId="yvo4.1176543928247:3" id="7602110602933016262">
                      <node role="subtypeExpression" roleId="yvo4.1176543945045:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7602110602933016263">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="7602110602933016264">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7602110602932948113" resolveInfo="ccd" />
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="7602110602933016265">
                          <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.6099516049394485311:7" />
                        </node>
                      </node>
                      <node role="supertypeExpression" roleId="yvo4.1176543950311:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="7602110602933016266">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="9034802358628472457" resolveInfo="type" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="parameter" roleId="yviq.1199569906740:3" type="yvix.SmartClosureParameterDeclaration" typeId="yvix.1203518072036:7" id="7602110602932948113">
                  <property name="name" nameId="yvnu.1169194664001:0" value="ccd" />
                  <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.WildCardType" typeId="yvor.1171903607971:3" id="7602110602932948114" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvix.SequenceType" typeId="yvix.1151689724996:7" id="9034802358628472454">
        <node role="elementType" roleId="yvix.1151689745422:7" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="9034802358628472456">
          <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvix.6099516049394485216:7" resolveInfo="CustomContainerDeclaration" />
        </node>
      </node>
    </node>
    <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1331913329176269838" />
    <node role="constructor" roleId="yvor.1068390468201:3" type="yvor.ConstructorDeclaration" typeId="yvor.1068580123140:3" id="1331913329176269839">
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="1331913329176269840" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1331913329176269841" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1331913329176269842" />
    </node>
  </root>
  <root id="1576845966386891472">
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="1576845966386891475">
      <property name="name" nameId="yvnu.1169194664001:0" value="createType" />
      <property name="isVirtual" nameId="2rzm.1225194472832" value="false" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1576845966386891476" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1576845966386891477">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1576845966386891478">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1576845966386891479">
            <property name="name" nameId="yvnu.1169194664001:0" value="res" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1576845966386891480">
              <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvor.1068431790189:3" resolveInfo="Type" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1576845966386891481">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1576845966386891482">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1576845966386891483">
                  <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1576845966386891484" />
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1576845966386915713">
                    <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1576845966386891370:7" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1576845966386891486">
                  <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.6099516049394485311:7" />
                </node>
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_CopyOperation" typeId="yvim.1144146199828:16" id="1576845966386891487" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.RemarkStatement" typeId="yvor.1168622733562:3" id="1576845966386891488">
          <property name="value" nameId="yvor.1168623065899:3" value=" workaround an SModel's dumbness" />
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1576845966386891489">
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1576845966386891490">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1576845966386891491">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1576845966386891492">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvim.SemanticDowncastExpression" typeId="yvim.1145404486709:16" id="1576845966386891493">
                  <node role="leftExpression" roleId="yvim.1145404616321:16" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1576845966386891494">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1576845966386891479" resolveInfo="res" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1576845966386891495">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SNode%dchangeModel(jetbrains%dmps%dsmodel%dSModel)%cvoid" resolveInfo="changeModel" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1576845966386891496">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1576845966386891497">
                      <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="txlh.~AuxilaryRuntimeModel" resolveInfo="AuxilaryRuntimeModel" />
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="txlh.~AuxilaryRuntimeModel%dgetDescriptor()%cjetbrains%dmps%dsmodel%dSModelDescriptor" resolveInfo="getDescriptor" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1576845966386891498">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SModelDescriptor%dgetSModel()%cjetbrains%dmps%dsmodel%dSModel" resolveInfo="getSModel" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotEqualsExpression" typeId="yvor.1073239437375:3" id="1576845966386891499">
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1576845966386891500" />
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1576845966386891501">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1576845966386891479" resolveInfo="res" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1576845966386915635">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1576845966386915636">
            <property name="name" nameId="yvnu.1169194664001:0" value="params" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.ListType" typeId="yvix.1151688443754:7" id="1576845966386915637">
              <node role="elementType" roleId="yvix.1151688676805:7" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1576845966386915638" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1576845966386915639">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvix.ListCreatorWithInit" typeId="yvix.1160600644654:7" id="1576845966386915640">
                <node role="elementType" roleId="yvix.1237721435807:7" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1576845966386915641" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1434634659123367770">
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1434634659123367771">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1434634659123367785">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1434634659123367787">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1434634659123367786">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1576845966386915636" resolveInfo="params" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddElementOperation" typeId="yvix.1160612413312:7" id="1434634659123367791">
                  <node role="argument" roleId="yvix.1160612519549:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1434634659123367798">
                    <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1434634659123367795" />
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1434634659123367804">
                      <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1197687026896:7" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1434634659123367780">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1434634659123367775">
              <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1434634659123367774" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1434634659123367779">
                <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1197687026896:7" />
              </node>
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_IsNotNullOperation" typeId="yvim.1172008320231:16" id="1434634659123367784" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1434634659123367730">
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1434634659123367731">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1434634659123367745">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1434634659123367747">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1434634659123367746">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1576845966386915636" resolveInfo="params" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddElementOperation" typeId="yvix.1160612413312:7" id="1434634659123367751">
                  <node role="argument" roleId="yvix.1160612519549:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1434634659123367760">
                    <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1434634659123367757" />
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1434634659123367766">
                      <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1197687035757:7" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1434634659123367740">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1434634659123367735">
              <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="1434634659123367734" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1434634659123367739">
                <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1197687035757:7" />
              </node>
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_IsNotNullOperation" typeId="yvim.1172008320231:16" id="1434634659123367744" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="4498918741262383784">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="4498918741262383785">
            <property name="name" nameId="yvnu.1169194664001:0" value="tvars" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="4498918741262383783">
              <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvor.1109279763828:3" resolveInfo="TypeVariableDeclaration" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4498918741262383786">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4498918741262383787">
                <node role="operand" roleId="yvor.1197027771414:3" type="2rzm.ThisNodeExpression" typeId="2rzm.1225194691553" id="4498918741262383788" />
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="4498918741262383789">
                  <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1576845966386891370:7" />
                </node>
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkListAccess" typeId="yvim.1138056282393:16" id="4498918741262383790">
                <link role="link" roleId="yvim.1138056546658:16" targetNodeId="yvor.1109279881614:3" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1576845966386891502">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1576845966386891503">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1576845966386891504">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1576845966386891505">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1576845966386891506">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1576845966386891479" resolveInfo="res" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_GetChildrenOperation" typeId="yvim.1171500988903:16" id="1576845966386891507" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvix.ToListOperation" typeId="yvix.1151702311717:7" id="1576845966386891508" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.VisitAllOperation" typeId="yvix.1204980550705:7" id="1576845966386891509">
              <node role="closure" roleId="yvix.1204796294226:7" type="yviq.ClosureLiteral" typeId="yviq.1199569711397:3" id="1576845966386891510">
                <node role="body" roleId="yviq.1199569916463:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1576845966386891511">
                  <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1576845966386891512">
                    <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1576845966386891513">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1576845966386891514">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1576845966386891527" resolveInfo="chld" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_IsInstanceOfOperation" typeId="yvim.1139621453865:16" id="1576845966386891515">
                        <node role="conceptArgument" roleId="yvim.1177027386292:16" type="yvim.RefConcept_Reference" typeId="yvim.1177026924588:16" id="1576845966386891516">
                          <link role="conceptDeclaration" roleId="yvim.1177026940964:16" targetNodeId="yvor.1109283449304:3" resolveInfo="TypeVariableReference" />
                        </node>
                      </node>
                    </node>
                    <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1576845966386891517">
                      <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="41886248565391438">
                        <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="41886248565391439">
                          <property name="name" nameId="yvnu.1169194664001:0" value="index" />
                          <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="41886248565391440" />
                          <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="41886248565391441">
                            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="41886248565391442">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="4498918741262383785" resolveInfo="tvars" />
                            </node>
                            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetIndexOfOperation" typeId="yvix.1171391069720:7" id="41886248565391443">
                              <node role="argument" roleId="yvix.1171391518575:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="41886248565391444">
                                <node role="operand" roleId="yvor.1197027771414:3" type="yvim.SNodeTypeCastExpression" typeId="yvim.1140137987495:16" id="41886248565391445">
                                  <link role="concept" roleId="yvim.1140138128738:16" targetNodeId="yvor.1109283449304:3" resolveInfo="TypeVariableReference" />
                                  <node role="leftExpression" roleId="yvim.1140138123956:16" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="41886248565391446">
                                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1576845966386891527" resolveInfo="chld" />
                                  </node>
                                </node>
                                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="41886248565391447">
                                  <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvor.1109283546497:3" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="41886248565391450">
                        <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="41886248565391451">
                          <property name="name" nameId="yvnu.1169194664001:0" value="realType" />
                          <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="41886248565391452">
                            <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvnu.1133920641626:0" resolveInfo="BaseConcept" />
                          </node>
                          <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.TernaryOperatorExpression" typeId="yvor.1163668896201:3" id="41886248565428650">
                            <node role="ifFalse" roleId="yvor.1163668934364:3" type="yvor.CastExpression" typeId="yvor.1070534934090:3" id="41886248565472559">
                              <node role="expression" roleId="yvor.1070534934092:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="41886248565472564" />
                              <node role="type" roleId="yvor.1070534934091:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="41886248565472562" />
                            </node>
                            <node role="condition" roleId="yvor.1163668914799:3" type="yvor.ParenthesizedExpression" typeId="yvor.1079359253375:3" id="41886248565428626">
                              <node role="expression" roleId="yvor.1079359253376:3" type="yvor.AndExpression" typeId="yvor.1080120340718:3" id="41886248565428637">
                                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LessThanExpression" typeId="yvor.1081506773034:3" id="41886248565428641">
                                  <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="41886248565428645">
                                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="41886248565428644">
                                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1576845966386915636" resolveInfo="params" />
                                    </node>
                                    <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetSizeOperation" typeId="yvix.1162935959151:7" id="41886248565428649" />
                                  </node>
                                  <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="41886248565428640">
                                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="41886248565391439" resolveInfo="index" />
                                  </node>
                                </node>
                                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.GreaterThanOrEqualsExpression" typeId="yvor.1153417849900:3" id="41886248565428633">
                                  <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="41886248565428629">
                                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="41886248565391439" resolveInfo="index" />
                                  </node>
                                  <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="41886248565428636">
                                    <property name="value" nameId="yvor.1068580320021:3" value="0" />
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node role="ifTrue" roleId="yvor.1163668922816:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="41886248565428654">
                              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_CopyOperation" typeId="yvim.1144146199828:16" id="41886248565428655" />
                              <node role="operand" roleId="yvor.1197027771414:3" type="yvix.ListElementAccessExpression" typeId="yvix.1225711141656:7" id="41886248565428656">
                                <node role="index" roleId="yvix.1225711191269:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="41886248565428657">
                                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="41886248565391439" resolveInfo="index" />
                                </node>
                                <node role="list" roleId="yvix.1225711182005:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="41886248565428658">
                                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1576845966386915636" resolveInfo="params" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1576845966386891518">
                        <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1576845966386891519">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1576845966386891520">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1576845966386891527" resolveInfo="chld" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ReplaceWithAnotherOperation" typeId="yvim.1140131837776:16" id="1576845966386891521">
                            <node role="replacementNode" roleId="yvim.1140131861877:16" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="41886248565391458">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="41886248565391451" resolveInfo="realType" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="parameter" roleId="yviq.1199569906740:3" type="yvix.SmartClosureParameterDeclaration" typeId="yvix.1203518072036:7" id="1576845966386891527">
                  <property name="name" nameId="yvnu.1169194664001:0" value="chld" />
                  <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.WildCardType" typeId="yvor.1171903607971:3" id="1576845966386891528" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1576845966386891529">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1576845966386891530">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1576845966386891479" resolveInfo="res" />
          </node>
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1576845966386891531">
        <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvor.1068431790189:3" resolveInfo="Type" />
      </node>
    </node>
    <node role="constructor" roleId="2rzm.1225194240801" type="2rzm.ConceptConstructorDeclaration" typeId="2rzm.1225194413805" id="1576845966386891473">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1576845966386891474" />
    </node>
  </root>
  <root id="3185788474596486341">
    <node role="constructor" roleId="2rzm.1225194240801" type="2rzm.ConceptConstructorDeclaration" typeId="2rzm.1225194413805" id="3185788474596486342">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="3185788474596486343" />
    </node>
    <node role="method" roleId="2rzm.1225194240805" type="2rzm.ConceptMethodDeclaration" typeId="2rzm.1225194472830" id="3185788474596486344">
      <property name="name" nameId="yvnu.1169194664001:0" value="isDotExpressionLegalAsStatement" />
      <property name="isVirtual" nameId="2rzm.1225194472832" value="true" />
      <link role="overriddenMethod" roleId="2rzm.1225194472831" targetNodeId="yvou.1239212437413" resolveInfo="isDotExpressionLegalAsStatement" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="3185788474596486345" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="3185788474596486346">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="3185788474596488416">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="3185788474596488417">
            <property name="value" nameId="yvor.1068580123138:3" value="false" />
          </node>
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.BooleanType" typeId="yvor.1070534644030:3" id="3185788474596486347" />
    </node>
  </root>
</model>

