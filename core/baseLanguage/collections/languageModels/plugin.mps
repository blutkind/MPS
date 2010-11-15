<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:cf23edd7-256f-4b20-82d2-696c87889d85(jetbrains.mps.baseLanguage.collections.plugin)">
  <persistence version="7" />
  <language namespace="28f9e497-3b42-4291-aeba-0a1039153ab1(jetbrains.mps.lang.plugin)" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="83888646-71ce-4f1c-9c53-c54016f6ad4f(jetbrains.mps.baseLanguage.collections)" />
  <language namespace="fd392034-7849-419d-9071-12563d152375(jetbrains.mps.baseLanguage.closures)" />
  <language namespace="760a0a8c-eabb-4521-8bfd-65db761a9ba3(jetbrains.mps.baseLanguage.logging)" />
  <language namespace="443f4c36-fcf5-4eb6-9500-8d06ed259e3e(jetbrains.mps.baseLanguage.classifiers)" />
  <language namespace="fa8aeae9-4df9-4e13-bfb1-9b04c67ddb77(jetbrains.mps.debug.customViewers)" />
  <language namespace="7866978e-a0f0-4cc7-81bc-4d213d9375e1(jetbrains.mps.lang.smodel)" />
  <import index="yvix" modelUID="r:00000000-0000-4000-0000-011c8959032e(jetbrains.mps.baseLanguage.collections.structure)" version="7" />
  <import index="vhgx" modelUID="f:java_stub#java.lang(java.lang@java_stub)" version="-1" />
  <import index="txlh" modelUID="f:java_stub#jetbrains.mps.project(jetbrains.mps.project@java_stub)" version="-1" />
  <import index="8n6q" modelUID="f:java_stub#jetbrains.mps.smodel(jetbrains.mps.smodel@java_stub)" version="-1" />
  <import index="906v" modelUID="f:java_stub#jetbrains.mps.project.dependency(jetbrains.mps.project.dependency@java_stub)" version="-1" />
  <import index="rl4u" modelUID="f:java_stub#jetbrains.mps.internal.collections.runtime(jetbrains.mps.internal.collections.runtime@java_stub)" version="-1" />
  <import index="zevl" modelUID="r:fc76aa36-3cff-41c7-b94b-eee0e8341932(jetbrains.mps.internal.collections.runtime)" version="-1" />
  <import index="yjwb" modelUID="f:java_stub#java.util(java.util@java_stub)" version="-1" />
  <import index="yvnu" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" implicit="yes" />
  <import index="yvor" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" implicit="yes" />
  <import index="yvju" modelUID="r:00000000-0000-4000-0000-011c89590368(jetbrains.mps.lang.plugin.structure)" version="23" implicit="yes" />
  <import index="yviq" modelUID="r:00000000-0000-4000-0000-011c89590338(jetbrains.mps.baseLanguage.closures.structure)" version="3" implicit="yes" />
  <import index="yvjr" modelUID="r:00000000-0000-4000-0000-011c89590373(jetbrains.mps.baseLanguage.classifiers.structure)" version="0" implicit="yes" />
  <import index="yvqp" modelUID="r:00000000-0000-4000-0000-011c8959057f(jetbrains.mps.baseLanguage.logging.structure)" version="0" implicit="yes" />
  <import index="yvim" modelUID="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.lang.smodel.structure)" version="16" implicit="yes" />
  <import index="a9e8" modelUID="r:c8cdf89f-8d25-442c-ae58-6e44844b68d7(jetbrains.mps.debug.customViewers.structure)" version="0" implicit="yes" />
  <import index="35lb" modelUID="r:cf23edd7-256f-4b20-82d2-696c87889d85(jetbrains.mps.baseLanguage.collections.plugin)" version="-1" implicit="yes" />
  <roots>
    <node type="yvor.ClassConcept" typeId="yvor.1068390468198:3" id="8536718853245006659">
      <property name="name" nameId="yvnu.1169194664001:0" value="CollectionsLanguage" />
    </node>
    <node type="yvor.ClassConcept" typeId="yvor.1068390468198:3" id="8536718853245008409">
      <property name="name" nameId="yvnu.1169194664001:0" value="CustomContainersRegistry" />
    </node>
    <node type="yvju.ApplicationPluginDeclaration" typeId="yvju.1215279937187:23" id="8536718853245025849">
      <property name="name" nameId="yvnu.1169194664001:0" value="Collections" />
    </node>
    <node type="yvju.ApplicationPluginDeclaration" typeId="yvju.1215279937187:23" id="8536718853245029918">
      <property name="name" nameId="yvnu.1169194664001:0" value="SampleCustomContainers" />
    </node>
    <node type="a9e8.CustomWatchablesContainer" typeId="a9e8.5117350825036256317:0" id="8423890115754358686">
      <property name="name" nameId="yvnu.1169194664001:0" value="CollectionsWatchables" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="debug" />
    </node>
    <node type="a9e8.HighLevelCustomViewer" typeId="a9e8.680105146889009728:0" id="5116701553466303326">
      <property name="name" nameId="yvnu.1169194664001:0" value="ListViewer" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="debug" />
    </node>
    <node type="a9e8.HighLevelCustomViewer" typeId="a9e8.680105146889009728:0" id="7785669630792406965">
      <property name="name" nameId="yvnu.1169194664001:0" value="MapEntryViewer" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="debug" />
    </node>
    <node type="a9e8.HighLevelCustomViewer" typeId="a9e8.680105146889009728:0" id="7785669630792592640">
      <property name="name" nameId="yvnu.1169194664001:0" value="MapViewer" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="debug" />
    </node>
    <node type="a9e8.HighLevelCustomViewer" typeId="a9e8.680105146889009728:0" id="7785669630792592730">
      <property name="name" nameId="yvnu.1169194664001:0" value="SetViewer" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="debug" />
    </node>
  </roots>
  <root id="8536718853245006659">
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="8536718853245025323">
      <property name="name" nameId="yvnu.1169194664001:0" value="getCustomContainersRegistry" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="8536718853245025325" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8536718853245025326">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8536718853245025328">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="8536718853245025329">
            <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="8536718853245008409" resolveInfo="CustomContainersRegistry" />
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8536718853245025255" resolveInfo="INSTANCE" />
          </node>
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8536718853245025327">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8536718853245008409" resolveInfo="CustomContainersRegistry" />
      </node>
    </node>
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="8536718853245025419">
      <property name="name" nameId="yvnu.1169194664001:0" value="init" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="8536718853245025420" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8536718853245025422">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.SynchronizedStatement" typeId="yvor.1170075670744:3" id="8536718853245025436">
          <node role="expression" roleId="yvor.1170075728144:3" type="yvor.ClassifierClassExpression" typeId="yvor.1116615150612:3" id="8536718853245025439">
            <link role="classifier" roleId="yvor.1116615189566:3" targetNodeId="8536718853245006659" resolveInfo="CollectionsLanguage" />
          </node>
          <node role="block" roleId="yvor.1170075736412:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8536718853245025438">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.WhileStatement" typeId="yvor.1076505808687:3" id="8536718853245025440">
              <node role="condition" roleId="yvor.1076505808688:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8536718853245025444">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalStaticFieldReference" typeId="yvor.1172008963197:3" id="8536718853245025443">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8536718853245025382" resolveInfo="DELAYED_RUNMES" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvix.IsNotEmptyOperation" typeId="yvix.1176501494711:7" id="8536718853245025448" />
              </node>
              <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8536718853245025442">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.TryCatchStatement" typeId="yvor.1164879751025:3" id="8536718853245025587">
                  <node role="body" roleId="yvor.1164879758292:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8536718853245025588">
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8536718853245025449">
                      <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8536718853245025552">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8536718853245025451">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalStaticFieldReference" typeId="yvor.1172008963197:3" id="8536718853245025450">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8536718853245025382" resolveInfo="DELAYED_RUNMES" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvix.RemoveFirstElementOperation" typeId="yvix.1227026082377:7" id="8536718853245025455" />
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yviq.InvokeFunctionOperation" typeId="yviq.1225797177491:3" id="8536718853245025566">
                          <node role="parameter" roleId="yviq.1225797361612:3" type="yvor.LocalStaticFieldReference" typeId="yvor.1172008963197:3" id="8536718853245025573">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8536718853245006666" resolveInfo="INSTANCE" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="catchClause" roleId="yvor.1164903496223:3" type="yvor.CatchClause" typeId="yvor.1164903280175:3" id="8536718853245025590">
                    <node role="throwable" roleId="yvor.1164903359217:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8536718853245025591">
                      <property name="name" nameId="yvnu.1169194664001:0" value="thr" />
                      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8536718853245025594">
                        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Throwable" resolveInfo="Throwable" />
                      </node>
                    </node>
                    <node role="catchBody" roleId="yvor.1164903359218:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8536718853245025593">
                      <node role="statement" roleId="yvor.1068581517665:3" type="yvqp.LogStatement" typeId="yvqp.1167227138527:0" id="8536718853245025621">
                        <property name="severity" nameId="yvqp.1167245565795:0" value="error" />
                        <property name="hasException" nameId="yvqp.1167228628751:0" value="true" />
                        <node role="logExpression" roleId="yvqp.1167227463056:0" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="8536718853245025622">
                          <property name="value" nameId="yvor.1070475926801:3" value="Error executing delayed code" />
                        </node>
                        <node role="exception" roleId="yvqp.1167227561449:0" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8536718853245025623">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8536718853245025591" resolveInfo="thr" />
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
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="8536718853245025647">
      <property name="name" nameId="yvnu.1169194664001:0" value="dispose" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="8536718853245025648" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8536718853245025650">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.SynchronizedStatement" typeId="yvor.1170075670744:3" id="8536718853245025796">
          <node role="block" roleId="yvor.1170075736412:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8536718853245025798">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.WhileStatement" typeId="yvor.1076505808687:3" id="8536718853245025801">
              <node role="condition" roleId="yvor.1076505808688:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8536718853245025802">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalStaticFieldReference" typeId="yvor.1172008963197:3" id="8536718853245025834">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8536718853245025727" resolveInfo="ONDISPOSE_RUNMES" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvix.IsNotEmptyOperation" typeId="yvix.1176501494711:7" id="8536718853245025804" />
              </node>
              <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8536718853245025805">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.TryCatchStatement" typeId="yvor.1164879751025:3" id="8536718853245025806">
                  <node role="body" roleId="yvor.1164879758292:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8536718853245025807">
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8536718853245025808">
                      <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8536718853245025809">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8536718853245025810">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalStaticFieldReference" typeId="yvor.1172008963197:3" id="8536718853245025835">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8536718853245025727" resolveInfo="ONDISPOSE_RUNMES" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvix.RemoveFirstElementOperation" typeId="yvix.1227026082377:7" id="8536718853245025812" />
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yviq.InvokeFunctionOperation" typeId="yviq.1225797177491:3" id="8536718853245025813">
                          <node role="parameter" roleId="yviq.1225797361612:3" type="yvor.LocalStaticFieldReference" typeId="yvor.1172008963197:3" id="8536718853245025814">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8536718853245006666" resolveInfo="INSTANCE" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="catchClause" roleId="yvor.1164903496223:3" type="yvor.CatchClause" typeId="yvor.1164903280175:3" id="8536718853245025815">
                    <node role="throwable" roleId="yvor.1164903359217:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8536718853245025816">
                      <property name="name" nameId="yvnu.1169194664001:0" value="thr" />
                      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8536718853245025817">
                        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Throwable" resolveInfo="Throwable" />
                      </node>
                    </node>
                    <node role="catchBody" roleId="yvor.1164903359218:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8536718853245025818">
                      <node role="statement" roleId="yvor.1068581517665:3" type="yvqp.LogStatement" typeId="yvqp.1167227138527:0" id="8536718853245025819">
                        <property name="severity" nameId="yvqp.1167245565795:0" value="error" />
                        <property name="hasException" nameId="yvqp.1167228628751:0" value="true" />
                        <node role="logExpression" roleId="yvqp.1167227463056:0" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="8536718853245025820">
                          <property name="value" nameId="yvor.1070475926801:3" value="Error executing delayed code" />
                        </node>
                        <node role="exception" roleId="yvqp.1167227561449:0" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8536718853245025821">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8536718853245025816" resolveInfo="thr" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="expression" roleId="yvor.1170075728144:3" type="yvor.ClassifierClassExpression" typeId="yvor.1116615150612:3" id="8536718853245025848">
            <link role="classifier" roleId="yvor.1116615189566:3" targetNodeId="8536718853245006659" resolveInfo="CollectionsLanguage" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" roleId="yvor.1070462273904:3" type="yvor.StaticMethodDeclaration" typeId="yvor.1081236700938:3" id="8536718853245008402">
      <property name="name" nameId="yvnu.1169194664001:0" value="getInstance" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="8536718853245008404" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8536718853245008405">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8536718853245008407">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalStaticFieldReference" typeId="yvor.1172008963197:3" id="8536718853245008408">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8536718853245006666" resolveInfo="INSTANCE" />
          </node>
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8536718853245008406">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8536718853245006659" resolveInfo="CollectionsLanguage" />
      </node>
    </node>
    <node role="staticMethod" roleId="yvor.1070462273904:3" type="yvor.StaticMethodDeclaration" typeId="yvor.1081236700938:3" id="8536718853245025330">
      <property name="name" nameId="yvnu.1169194664001:0" value="runOnInit" />
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="8536718853245025334">
        <property name="name" nameId="yvnu.1169194664001:0" value="runme" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yviq.FunctionType" typeId="yviq.1199542442495:3" id="8536718853245025336">
          <node role="parameterType" roleId="yviq.1199542501692:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8536718853245025352">
            <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8536718853245006659" resolveInfo="CollectionsLanguage" />
          </node>
          <node role="resultType" roleId="yviq.1199542457201:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="8536718853245025338" />
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="8536718853245025331" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="8536718853245025332" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8536718853245025333">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.SynchronizedStatement" typeId="yvor.1170075670744:3" id="8536718853245025339">
          <node role="expression" roleId="yvor.1170075728144:3" type="yvor.ClassifierClassExpression" typeId="yvor.1116615150612:3" id="8536718853245025342">
            <link role="classifier" roleId="yvor.1116615189566:3" targetNodeId="8536718853245006659" resolveInfo="CollectionsLanguage" />
          </node>
          <node role="block" roleId="yvor.1170075736412:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8536718853245025341">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="8536718853245025343">
              <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotEqualsExpression" typeId="yvor.1073239437375:3" id="8536718853245025347">
                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="8536718853245025350" />
                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalStaticFieldReference" typeId="yvor.1172008963197:3" id="8536718853245025346">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8536718853245006666" resolveInfo="INSTANCE" />
                </node>
              </node>
              <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8536718853245025345">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8536718853245025353">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yviq.CompactInvokeFunctionExpression" typeId="yviq.1235746970280:3" id="8536718853245025355">
                    <node role="parameter" roleId="yviq.1235747002942:3" type="yvor.LocalStaticFieldReference" typeId="yvor.1172008963197:3" id="8536718853245025374">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8536718853245006666" resolveInfo="INSTANCE" />
                    </node>
                    <node role="function" roleId="yviq.1235746996653:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="8536718853245025356">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8536718853245025334" resolveInfo="runme" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="ifFalseStatement" roleId="yvor.1082485599094:3" type="yvor.BlockStatement" typeId="yvor.1082485599095:3" id="8536718853245025397">
                <node role="statements" roleId="yvor.1082485599096:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8536718853245025398">
                  <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8536718853245025399">
                    <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8536718853245025401">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalStaticFieldReference" typeId="yvor.1172008963197:3" id="8536718853245025400">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8536718853245025382" resolveInfo="DELAYED" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddLastElementOperation" typeId="yvix.1227022179634:7" id="8536718853245025405">
                        <node role="argument" roleId="yvix.1227022698412:7" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="8536718853245025411">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8536718853245025334" resolveInfo="runme" />
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
    <node role="staticMethod" roleId="yvor.1070462273904:3" type="yvor.StaticMethodDeclaration" typeId="yvor.1081236700938:3" id="8536718853245025681">
      <property name="name" nameId="yvnu.1169194664001:0" value="runOnDispose" />
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="8536718853245025708">
        <property name="name" nameId="yvnu.1169194664001:0" value="runme" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yviq.FunctionType" typeId="yviq.1199542442495:3" id="8536718853245025709">
          <node role="parameterType" roleId="yviq.1199542501692:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8536718853245025710">
            <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8536718853245006659" resolveInfo="CollectionsLanguage" />
          </node>
          <node role="resultType" roleId="yviq.1199542457201:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="8536718853245025711" />
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="8536718853245025682" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="8536718853245025683" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8536718853245025684">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.SynchronizedStatement" typeId="yvor.1170075670744:3" id="8536718853245025712">
          <node role="expression" roleId="yvor.1170075728144:3" type="yvor.ClassifierClassExpression" typeId="yvor.1116615150612:3" id="8536718853245025715">
            <link role="classifier" roleId="yvor.1116615189566:3" targetNodeId="8536718853245006659" resolveInfo="CollectionsLanguage" />
          </node>
          <node role="block" roleId="yvor.1170075736412:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8536718853245025714">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8536718853245025779">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8536718853245025781">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalStaticFieldReference" typeId="yvor.1172008963197:3" id="8536718853245025780">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8536718853245025382" resolveInfo="ONINIT_DELAYED_RUNMES" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddLastElementOperation" typeId="yvix.1227022179634:7" id="8536718853245025785">
                  <node role="argument" roleId="yvix.1227022698412:7" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="8536718853245025791">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8536718853245025708" resolveInfo="runme" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticField" roleId="yvor.1128555889557:3" type="yvor.StaticFieldDeclaration" typeId="yvor.1070462154015:3" id="8536718853245006666">
      <property name="name" nameId="yvnu.1169194664001:0" value="INSTANCE" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="8536718853245006667" />
      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8536718853245008395">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8536718853245006659" resolveInfo="CollectionsLanguage" />
      </node>
    </node>
    <node role="staticField" roleId="yvor.1128555889557:3" type="yvor.StaticFieldDeclaration" typeId="yvor.1070462154015:3" id="8536718853245025382">
      <property name="name" nameId="yvnu.1169194664001:0" value="ONINIT_DELAYED_RUNMES" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="8536718853245025383" />
      <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.QueueType" typeId="yvix.5686963296372475025:7" id="8536718853245025392">
        <node role="elementType" roleId="yvix.5686963296372573084:7" type="yviq.FunctionType" typeId="yviq.1199542442495:3" id="8536718853245025394">
          <node role="parameterType" roleId="yviq.1199542501692:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8536718853245025395">
            <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8536718853245006659" resolveInfo="CollectionsLanguage" />
          </node>
          <node role="resultType" roleId="yviq.1199542457201:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="8536718853245025396" />
        </node>
      </node>
    </node>
    <node role="staticField" roleId="yvor.1128555889557:3" type="yvor.StaticFieldDeclaration" typeId="yvor.1070462154015:3" id="8536718853245025727">
      <property name="name" nameId="yvnu.1169194664001:0" value="ONDISPOSE_RUNMES" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="8536718853245025728" />
      <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.QueueType" typeId="yvix.5686963296372475025:7" id="8536718853245025729">
        <node role="elementType" roleId="yvix.5686963296372573084:7" type="yviq.FunctionType" typeId="yviq.1199542442495:3" id="8536718853245025730">
          <node role="parameterType" roleId="yviq.1199542501692:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8536718853245025731">
            <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8536718853245006659" resolveInfo="CollectionsLanguage" />
          </node>
          <node role="resultType" roleId="yviq.1199542457201:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="8536718853245025732" />
        </node>
      </node>
    </node>
    <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="8536718853245006660" />
    <node role="constructor" roleId="yvor.1068390468201:3" type="yvor.ConstructorDeclaration" typeId="yvor.1068580123140:3" id="8536718853245006661">
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="8536718853245006662" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8536718853245006664">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8536718853245008396">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8536718853245008398">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="8536718853245008401" />
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalStaticFieldReference" typeId="yvor.1172008963197:3" id="8536718853245008397">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8536718853245006666" resolveInfo="INSTANCE" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8536718853245025676">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8536718853245025677">
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8536718853245025678">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8536718853245025419" resolveInfo="init" />
            </node>
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="8536718853245025679" />
          </node>
        </node>
      </node>
    </node>
  </root>
  <root id="8536718853245008409">
    <node role="staticField" roleId="yvor.1128555889557:3" type="yvor.StaticFieldDeclaration" typeId="yvor.1070462154015:3" id="8536718853245025255">
      <property name="name" nameId="yvnu.1169194664001:0" value="INSTANCE" />
      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8536718853245025282">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8536718853245008409" resolveInfo="CustomContainersRegistry" />
      </node>
      <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8536718853245025292">
        <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="8536718853245025293">
          <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8536718853245008411" resolveInfo="CustomContainersRegistry" />
        </node>
      </node>
    </node>
    <node role="field" roleId="yvor.1068390468199:3" type="yvor.FieldDeclaration" typeId="yvor.1068390468200:3" id="8536718853245008426">
      <property name="name" nameId="yvnu.1169194664001:0" value="providers" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="8536718853245008427" />
      <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.ListType" typeId="yvix.1151688443754:7" id="8536718853245008429">
        <node role="elementType" roleId="yvix.1151688676805:7" type="yviq.FunctionType" typeId="yviq.1199542442495:3" id="8536718853245008431">
          <node role="resultType" roleId="yviq.1199542457201:3" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="8536718853245008433">
            <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvix.6099516049394485324:7" resolveInfo="CustomContainers" />
          </node>
        </node>
      </node>
      <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8536718853245008435">
        <node role="creator" roleId="yvor.1145553007750:3" type="yvix.ListCreatorWithInit" typeId="yvix.1160600644654:7" id="8536718853245008436">
          <node role="elementType" roleId="yvix.1237721435807:7" type="yviq.FunctionType" typeId="yviq.1199542442495:3" id="8536718853245008437">
            <node role="resultType" roleId="yviq.1199542457201:3" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="8536718853245008438">
              <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvix.6099516049394485324:7" resolveInfo="CustomContainers" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="8536718853245008415">
      <property name="name" nameId="yvnu.1169194664001:0" value="allCustomContainerDeclarations" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="8536718853245008417" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8536718853245008418">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="7602110602933085941">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="7602110602933085942">
            <property name="name" nameId="yvnu.1169194664001:0" value="allCustomContainers" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.SequenceType" typeId="yvix.1151689724996:7" id="7602110602933085943">
              <node role="elementType" roleId="yvix.1151689745422:7" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="7602110602933085944">
                <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvix.6099516049394485324:7" resolveInfo="CustomContainers" />
              </node>
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7602110602933086045">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="7602110602933086046" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="7602110602933086047">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="7602110602933086006" resolveInfo="primAllCustomContainers" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="8536718853245024209">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8536718853245024210">
            <property name="name" nameId="yvnu.1169194664001:0" value="res" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="8536718853245024253">
              <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvix.6099516049394485216:7" resolveInfo="CustomContainerDeclaration" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8536718853245024398">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvim.SNodeListCreator" typeId="yvim.1145567426890:16" id="8536718853245024399">
                <node role="createdType" roleId="yvim.1145567471833:16" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="8536718853245024400">
                  <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvix.6099516049394485216:7" resolveInfo="CustomContainerDeclaration" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8536718853245024265">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8536718853245024267">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8536718853245024266">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8536718853245024210" resolveInfo="res" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddAllElementsOperation" typeId="yvix.1160666733551:7" id="8536718853245024271">
              <node role="argument" roleId="yvix.1160666822012:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7602110602933085982">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7602110602933085983">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7602110602933085942" resolveInfo="allCustomContainers" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvix.TranslateOperation" typeId="yvix.1201792049884:7" id="7602110602933085984">
                  <node role="closure" roleId="yvix.1204796294226:7" type="yviq.ClosureLiteral" typeId="yviq.1199569711397:3" id="7602110602933085985">
                    <node role="body" roleId="yviq.1199569916463:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="7602110602933085986">
                      <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="7602110602933085987">
                        <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7602110602933085988">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="7602110602933085989">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7602110602933085991" resolveInfo="cc" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkListAccess" typeId="yvim.1138056282393:16" id="7602110602933085990">
                            <link role="link" roleId="yvim.1138056546658:16" targetNodeId="yvix.6099516049394485326:7" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="parameter" roleId="yviq.1199569906740:3" type="yvix.SmartClosureParameterDeclaration" typeId="yvix.1203518072036:7" id="7602110602933085991">
                      <property name="name" nameId="yvnu.1169194664001:0" value="cc" />
                      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.WildCardType" typeId="yvor.1171903607971:3" id="7602110602933085992" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8536718853245024244">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8536718853245024245">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8536718853245024210" resolveInfo="copy" />
          </node>
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="8536718853245008419">
        <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvix.6099516049394485216:7" resolveInfo="CustomContainerDeclaration" />
      </node>
    </node>
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="7602110602933084131">
      <property name="name" nameId="yvnu.1169194664001:0" value="accessibleCustomContainerDeclarations" />
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="7602110602933085887">
        <property name="name" nameId="yvnu.1169194664001:0" value="fromModel" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SModelType" typeId="yvim.1143226024141:16" id="7602110602933085889" />
      </node>
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="7602110602933084133" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="7602110602933084134">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="7602110602933086187">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="7602110602933086188">
            <property name="name" nameId="yvnu.1169194664001:0" value="res" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="7602110602933086189">
              <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvix.6099516049394485216:7" resolveInfo="CustomContainerDeclaration" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="7602110602933086190">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvim.SNodeListCreator" typeId="yvim.1145567426890:16" id="7602110602933086191">
                <node role="createdType" roleId="yvim.1145567471833:16" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="7602110602933086192">
                  <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvix.6099516049394485216:7" resolveInfo="CustomContainerDeclaration" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="7602110602933086885">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="7602110602933086886">
            <property name="name" nameId="yvnu.1169194664001:0" value="om" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="7602110602933086887">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="txlh.~IModule" resolveInfo="IModule" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7602110602933086888">
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="7602110602933086889">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="7602110602933086796" resolveInfo="getOwningModule" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="7602110602933086890">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7602110602933085887" resolveInfo="fromModel" />
                </node>
              </node>
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="7602110602933086891" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="7602110602933086356">
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="7602110602933086357">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="7602110602933086905">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="7602110602933086906">
                <property name="name" nameId="yvnu.1169194664001:0" value="allDependOnModules" />
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6791246587134144588">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6791246587134143954">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6791246587134143953">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7602110602933086886" resolveInfo="om" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="6791246587134144511">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="txlh.~IModule%dgetDependenciesManager()%cjetbrains%dmps%dproject%ddependency%dDependencyManager" resolveInfo="getDependenciesManager" />
                    </node>
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="6791246587134144592">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="906v.~DependencyManager%dgetAllDependOnModules()%cjava%dutil%dSet" resolveInfo="getAllDependOnModules" />
                  </node>
                </node>
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.SetType" typeId="yvix.1226511727824:7" id="5699776870187354425">
                  <node role="elementType" roleId="yvix.1226511765987:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="5699776870187354426">
                    <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="txlh.~IModule" resolveInfo="IModule" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="7602110602933787602">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="7602110602933787603">
                <property name="name" nameId="yvnu.1169194664001:0" value="allUsedLanguages" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.ListType" typeId="yvix.1151688443754:7" id="7602110602933787604">
                  <node role="elementType" roleId="yvix.1151688676805:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="7602110602933787606">
                    <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8n6q.~Language" resolveInfo="Language" />
                  </node>
                </node>
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6791246587134144594">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6791246587134144595">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6791246587134144596">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7602110602933086886" resolveInfo="om" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="6791246587134144597">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="txlh.~IModule%dgetDependenciesManager()%cjetbrains%dmps%dproject%ddependency%dDependencyManager" resolveInfo="getDependenciesManager" />
                    </node>
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="6791246587134144598">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="906v.~DependencyManager%dgetAllUsedLanguages()%cjava%dutil%dList" resolveInfo="getAllUsedLanguages" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="7602110602933086180">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="7602110602933086181">
                <property name="name" nameId="yvnu.1169194664001:0" value="allCustomContainers" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.SequenceType" typeId="yvix.1151689724996:7" id="7602110602933086182">
                  <node role="elementType" roleId="yvix.1151689745422:7" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="7602110602933086183">
                    <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvix.6099516049394485324:7" resolveInfo="CustomContainers" />
                  </node>
                </node>
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7602110602933086184">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="7602110602933086185" />
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="7602110602933086186">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="7602110602933086006" resolveInfo="primAllCustomContainers" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="7602110602933086193">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7602110602933086194">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7602110602933086195">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7602110602933086188" resolveInfo="res" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddAllElementsOperation" typeId="yvix.1160666733551:7" id="7602110602933086196">
                  <node role="argument" roleId="yvix.1160666822012:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7602110602933086197">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7602110602933086277">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7602110602933086198">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7602110602933086181" resolveInfo="allCustomContainers" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvix.WhereOperation" typeId="yvix.1202120902084:7" id="7602110602933086294">
                        <node role="closure" roleId="yvix.1204796294226:7" type="yviq.ClosureLiteral" typeId="yviq.1199569711397:3" id="7602110602933086295">
                          <node role="body" roleId="yviq.1199569916463:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="7602110602933086296">
                            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="7602110602933791047">
                              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="7602110602933791048">
                                <property name="name" nameId="yvnu.1169194664001:0" value="owner" />
                                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="7602110602933791049">
                                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="txlh.~IModule" resolveInfo="IModule" />
                                </node>
                                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7602110602933791050">
                                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="7602110602933791051">
                                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="7602110602933086796" resolveInfo="getOwningModule" />
                                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7602110602933791052">
                                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="7602110602933791053">
                                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7602110602933086297" resolveInfo="cc" />
                                      </node>
                                      <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_GetModelOperation" typeId="yvim.1143234257716:16" id="7602110602933791054" />
                                    </node>
                                  </node>
                                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="7602110602933791055" />
                                </node>
                              </node>
                            </node>
                            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="7602110602933086915">
                              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.OrExpression" typeId="yvor.1080223426719:3" id="7602110602933791102">
                                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7602110602933791148">
                                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7602110602933791126">
                                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7602110602933787603" resolveInfo="allUsedLanguages" />
                                  </node>
                                  <node role="operation" roleId="yvor.1197027833540:3" type="yvix.ContainsOperation" typeId="yvix.1172254888721:7" id="7602110602933791173">
                                    <node role="argument" roleId="yvix.1172256416782:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7602110602933791197">
                                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7602110602933791048" resolveInfo="owner" />
                                    </node>
                                  </node>
                                </node>
                                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7602110602933086937">
                                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7602110602933086916">
                                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7602110602933086906" resolveInfo="allDependOnModules" />
                                  </node>
                                  <node role="operation" roleId="yvor.1197027833540:3" type="yvix.ContainsOperation" typeId="yvix.1172254888721:7" id="7602110602933086961">
                                    <node role="argument" roleId="yvix.1172256416782:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7602110602933791056">
                                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7602110602933791048" resolveInfo="owner" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                          <node role="parameter" roleId="yviq.1199569906740:3" type="yvix.SmartClosureParameterDeclaration" typeId="yvix.1203518072036:7" id="7602110602933086297">
                            <property name="name" nameId="yvnu.1169194664001:0" value="cc" />
                            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.WildCardType" typeId="yvor.1171903607971:3" id="7602110602933086298" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvix.TranslateOperation" typeId="yvix.1201792049884:7" id="7602110602933086199">
                      <node role="closure" roleId="yvix.1204796294226:7" type="yviq.ClosureLiteral" typeId="yviq.1199569711397:3" id="7602110602933086200">
                        <node role="body" roleId="yviq.1199569916463:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="7602110602933086201">
                          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="7602110602933086202">
                            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7602110602933086203">
                              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="7602110602933086204">
                                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7602110602933086206" resolveInfo="cc" />
                              </node>
                              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkListAccess" typeId="yvim.1138056282393:16" id="7602110602933086205">
                                <link role="link" roleId="yvim.1138056546658:16" targetNodeId="yvix.6099516049394485326:7" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="parameter" roleId="yviq.1199569906740:3" type="yvix.SmartClosureParameterDeclaration" typeId="yvix.1203518072036:7" id="7602110602933086206">
                          <property name="name" nameId="yvnu.1169194664001:0" value="cc" />
                          <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.WildCardType" typeId="yvor.1171903607971:3" id="7602110602933086207" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotEqualsExpression" typeId="yvor.1073239437375:3" id="7602110602933086893">
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="7602110602933086896" />
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7602110602933086892">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7602110602933086886" resolveInfo="om" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="7602110602933086208">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7602110602933086209">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7602110602933086188" resolveInfo="res" />
          </node>
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="7602110602933085886">
        <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvix.6099516049394485216:7" resolveInfo="CustomContainerDeclaration" />
      </node>
    </node>
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="8536718853245008440">
      <property name="name" nameId="yvnu.1169194664001:0" value="registerProvider" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="8536718853245008441" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="8536718853245008442" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8536718853245008443">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.SynchronizedStatement" typeId="yvor.1170075670744:3" id="8536718853245008475">
          <node role="expression" roleId="yvor.1170075728144:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="8536718853245008478" />
          <node role="block" roleId="yvor.1170075736412:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8536718853245008477">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8536718853245008459">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8536718853245008463">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8536718853245008460">
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="8536718853245008461">
                    <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="8536718853245008426" resolveInfo="providers" />
                  </node>
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="8536718853245008462" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddElementOperation" typeId="yvix.1160612413312:7" id="8536718853245008467">
                  <node role="argument" roleId="yvix.1160612519549:7" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="8536718853245008471">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8536718853245008444" resolveInfo="prov" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="8536718853245008444">
        <property name="name" nameId="yvnu.1169194664001:0" value="prov" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yviq.FunctionType" typeId="yviq.1199542442495:3" id="8536718853245008445">
          <node role="resultType" roleId="yviq.1199542457201:3" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="8536718853245008447">
            <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvix.6099516049394485324:7" resolveInfo="CustomContainers" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="8536718853245008452">
      <property name="name" nameId="yvnu.1169194664001:0" value="unRegisterProvider" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="8536718853245008453" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="8536718853245008454" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8536718853245008455">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.SynchronizedStatement" typeId="yvor.1170075670744:3" id="8536718853245008479">
          <node role="expression" roleId="yvor.1170075728144:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="8536718853245008482" />
          <node role="block" roleId="yvor.1170075736412:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8536718853245008481">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8536718853245008483">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8536718853245008487">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8536718853245008484">
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="8536718853245008485">
                    <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="8536718853245008426" resolveInfo="providers" />
                  </node>
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="8536718853245008486" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvix.RemoveElementOperation" typeId="yvix.1167380149909:7" id="8536718853245008491">
                  <node role="argument" roleId="yvix.1167380149910:7" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="8536718853245008497">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8536718853245008456" resolveInfo="prov" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="8536718853245008456">
        <property name="name" nameId="yvnu.1169194664001:0" value="prov" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yviq.FunctionType" typeId="yviq.1199542442495:3" id="8536718853245008457">
          <node role="resultType" roleId="yviq.1199542457201:3" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="8536718853245008458">
            <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvix.6099516049394485324:7" resolveInfo="CustomContainers" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="7602110602933086796">
      <property name="name" nameId="yvnu.1169194664001:0" value="getOwningModule" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="7602110602933086798" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="7602110602933086799">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="7602110602933086853">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="7602110602933086854">
            <property name="name" nameId="yvnu.1169194664001:0" value="fmdesc" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="7602110602933086855">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8n6q.~SModelDescriptor" resolveInfo="SModelDescriptor" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2754724685431260763">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvim.SemanticDowncastExpression" typeId="yvim.1145404486709:16" id="2754724685431260761">
                <node role="leftExpression" roleId="yvim.1145404616321:16" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="2754724685431260301">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7602110602933086851" resolveInfo="model" />
                </node>
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="2754724685431266041">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SModel%dgetModelDescriptor()%cjetbrains%dmps%dsmodel%dSModelDescriptor" resolveInfo="getModelDescriptor" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="7602110602933086861">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.TernaryOperatorExpression" typeId="yvor.1163668896201:3" id="7602110602933086863">
            <node role="condition" roleId="yvor.1163668914799:3" type="yvor.NotEqualsExpression" typeId="yvor.1073239437375:3" id="7602110602933086868">
              <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="7602110602933086871" />
              <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7602110602933086867">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7602110602933086854" resolveInfo="fmdesc" />
              </node>
            </node>
            <node role="ifTrue" roleId="yvor.1163668922816:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7602110602933086873">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7602110602933086872">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7602110602933086854" resolveInfo="fmdesc" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="7602110602933086877">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SModelDescriptor%dgetModule()%cjetbrains%dmps%dproject%dIModule" resolveInfo="getModule" />
              </node>
            </node>
            <node role="ifFalse" roleId="yvor.1163668934364:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="7602110602933086878" />
          </node>
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="7602110602933086850">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="txlh.~IModule" resolveInfo="IModule" />
      </node>
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="7602110602933086851">
        <property name="name" nameId="yvnu.1169194664001:0" value="model" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SModelType" typeId="yvim.1143226024141:16" id="7602110602933086852" />
      </node>
    </node>
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="7602110602933086006">
      <property name="name" nameId="yvnu.1169194664001:0" value="primAllCustomContainers" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="7602110602933086007" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvix.SequenceType" typeId="yvix.1151689724996:7" id="7602110602933086008">
        <node role="elementType" roleId="yvix.1151689745422:7" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="7602110602933086009">
          <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvix.6099516049394485324:7" resolveInfo="CustomContainers" />
        </node>
      </node>
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="7602110602933086010">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="7602110602933086011">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="7602110602933086012">
            <property name="name" nameId="yvnu.1169194664001:0" value="providersCopy" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.ListType" typeId="yvix.1151688443754:7" id="7602110602933086013">
              <node role="elementType" roleId="yvix.1151688676805:7" type="yviq.FunctionType" typeId="yviq.1199542442495:3" id="7602110602933086014">
                <node role="resultType" roleId="yviq.1199542457201:3" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="7602110602933086015">
                  <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvix.6099516049394485324:7" resolveInfo="CustomContainers" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.SynchronizedStatement" typeId="yvor.1170075670744:3" id="7602110602933086016">
          <node role="expression" roleId="yvor.1170075728144:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="7602110602933086017" />
          <node role="block" roleId="yvor.1170075736412:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="7602110602933086018">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="7602110602933086019">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="7602110602933086020">
                <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="7602110602933086021">
                  <node role="creator" roleId="yvor.1145553007750:3" type="yvix.ListCreatorWithInit" typeId="yvix.1160600644654:7" id="7602110602933086022">
                    <node role="elementType" roleId="yvix.1237721435807:7" type="yviq.FunctionType" typeId="yviq.1199542442495:3" id="7602110602933086023">
                      <node role="resultType" roleId="yviq.1199542457201:3" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="7602110602933086024">
                        <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvix.6099516049394485324:7" resolveInfo="CustomContainers" />
                      </node>
                    </node>
                    <node role="copyFrom" roleId="yvix.1237731803878:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7602110602933086025">
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="7602110602933086026">
                        <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="8536718853245008426" resolveInfo="providers" />
                      </node>
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="7602110602933086027" />
                    </node>
                  </node>
                </node>
                <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7602110602933086028">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7602110602933086012" resolveInfo="providersCopy" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="7602110602933086043">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7602110602933086033">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7602110602933086034">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7602110602933086012" resolveInfo="providersCopy" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.TranslateOperation" typeId="yvix.1201792049884:7" id="7602110602933086035">
              <node role="closure" roleId="yvix.1204796294226:7" type="yviq.ClosureLiteral" typeId="yviq.1199569711397:3" id="7602110602933086036">
                <node role="body" roleId="yviq.1199569916463:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="7602110602933086037">
                  <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="7602110602933086038">
                    <node role="expression" roleId="yvor.1068580123156:3" type="yviq.CompactInvokeFunctionExpression" typeId="yviq.1235746970280:3" id="7602110602933086039">
                      <node role="function" roleId="yviq.1235746996653:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="7602110602933086040">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7602110602933086041" resolveInfo="prov" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="parameter" roleId="yviq.1199569906740:3" type="yvix.SmartClosureParameterDeclaration" typeId="yvix.1203518072036:7" id="7602110602933086041">
                  <property name="name" nameId="yvnu.1169194664001:0" value="prov" />
                  <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.WildCardType" typeId="yvor.1171903607971:3" id="7602110602933086042" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="8536718853245008410" />
    <node role="constructor" roleId="yvor.1068390468201:3" type="yvor.ConstructorDeclaration" typeId="yvor.1068580123140:3" id="8536718853245008411">
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="8536718853245008412" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8536718853245008414" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="8536718853245025318" />
    </node>
  </root>
  <root id="8536718853245025849">
    <node role="fieldDeclaration" roleId="yvju.1215279937191:23" type="yvjr.DefaultClassifierFieldDeclaration" typeId="yvjr.1213999088275:0" id="8536718853245025855">
      <property name="name" nameId="yvnu.1169194664001:0" value="language" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="8536718853245025856" />
      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8536718853245025858">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8536718853245006659" resolveInfo="CollectionsLanguage" />
      </node>
    </node>
    <node role="initBlock" roleId="yvju.1215279937189:23" type="yvju.ApplicationPluginInitBlock" typeId="yvju.1215278261851:23" id="8536718853245025853">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8536718853245025854">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8536718853245025859">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8536718853245025891">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8536718853245025894">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="8536718853245029888">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8536718853245006661" resolveInfo="CollectionsLanguage" />
              </node>
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8536718853245025860">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvjr.ThisClassifierExpression" typeId="yvjr.1205752633985:0" id="8536718853245025861" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvjr.DefaultClassifierFieldAccessOperation" typeId="yvjr.1213999117680:0" id="8536718853245025862">
                <link role="member" roleId="yvjr.1205756909548:0" targetNodeId="8536718853245025855" resolveInfo="language" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="disposeBlock" roleId="yvju.1215279937190:23" type="yvju.ApplicationPluginDisposeBlock" typeId="yvju.1215278396618:23" id="8536718853245029889">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8536718853245029890">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="6877924468658338433">
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="6877924468658338434">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8536718853245029891">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8536718853245029895">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8536718853245029892">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvjr.ThisClassifierExpression" typeId="yvjr.1205752633985:0" id="8536718853245029893" />
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvjr.DefaultClassifierFieldAccessOperation" typeId="yvjr.1213999117680:0" id="8536718853245029894">
                    <link role="member" roleId="yvjr.1205756909548:0" targetNodeId="8536718853245025855" resolveInfo="language" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8536718853245029899">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8536718853245025647" resolveInfo="dispose" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8536718853245029901">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8536718853245029908">
                <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="8536718853245029911" />
                <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8536718853245029903">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvjr.ThisClassifierExpression" typeId="yvjr.1205752633985:0" id="8536718853245029902" />
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvjr.DefaultClassifierFieldAccessOperation" typeId="yvjr.1213999117680:0" id="8536718853245029907">
                    <link role="member" roleId="yvjr.1205756909548:0" targetNodeId="8536718853245025855" resolveInfo="language" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotEqualsExpression" typeId="yvor.1073239437375:3" id="6877924468658338471">
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="6877924468658338474" />
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6877924468658338466">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvjr.ThisClassifierExpression" typeId="yvjr.1205752633985:0" id="6877924468658338437" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvjr.DefaultClassifierFieldAccessOperation" typeId="yvjr.1213999117680:0" id="6877924468658338470">
                <link role="member" roleId="yvjr.1205756909548:0" targetNodeId="8536718853245025855" resolveInfo="language" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </root>
  <root id="8536718853245029918">
    <node role="initBlock" roleId="yvju.1215279937189:23" type="yvju.ApplicationPluginInitBlock" typeId="yvju.1215278261851:23" id="8536718853245029919">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8536718853245029920">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="8536718853245030611">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8536718853245030612">
            <property name="name" nameId="yvnu.1169194664001:0" value="provider" />
            <property name="isFinal" nameId="yvor.1176718929932:3" value="true" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yviq.FunctionType" typeId="yviq.1199542442495:3" id="8536718853245030613">
              <node role="resultType" roleId="yviq.1199542457201:3" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="8536718853245030614">
                <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvix.6099516049394485324:7" resolveInfo="CustomContainers" />
              </node>
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yviq.ClosureLiteral" typeId="yviq.1199569711397:3" id="8536718853245030615">
              <node role="body" roleId="yviq.1199569916463:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8536718853245030616">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="8536718853245030617">
                  <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8536718853245030618">
                    <property name="name" nameId="yvnu.1169194664001:0" value="res" />
                    <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="8536718853245030619">
                      <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvix.6099516049394485324:7" resolveInfo="CustomContainers" />
                    </node>
                    <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8536718853245030620">
                      <node role="creator" roleId="yvor.1145553007750:3" type="yvim.SNodeListCreator" typeId="yvim.1145567426890:16" id="8536718853245030621">
                        <node role="createdType" roleId="yvim.1145567471833:16" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="8536718853245030622">
                          <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvix.6099516049394485324:7" resolveInfo="CustomContainers" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.SingleLineComment" typeId="yvor.6329021646629104954:3" id="7376433222636453323">
                  <node role="commentPart" roleId="yvor.6329021646629175155:3" type="yvor.TextCommentPart" typeId="yvor.6329021646629104957:3" id="7376433222636453324">
                    <property name="text" nameId="yvor.6329021646629104958:3" value="Find the model(s) with custom container declarations" />
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="8536718853245030624">
                  <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8536718853245030625">
                    <property name="name" nameId="yvnu.1169194664001:0" value="desc" />
                    <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8536718853245030626">
                      <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8n6q.~SModelDescriptor" resolveInfo="SModelDescriptor" />
                    </node>
                    <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8536718853245030627">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="8536718853245030628">
                        <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="txlh.~GlobalScope" resolveInfo="GlobalScope" />
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="txlh.~GlobalScope%dgetInstance()%cjetbrains%dmps%dproject%dGlobalScope" resolveInfo="getInstance" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8536718853245030629">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~BaseScope%dgetModelDescriptor(jetbrains%dmps%dsmodel%dSModelFqName)%cjetbrains%dmps%dsmodel%dSModelDescriptor" resolveInfo="getModelDescriptor" />
                        <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="8536718853245030630">
                          <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SModelFqName%dfromString(java%dlang%dString)%cjetbrains%dmps%dsmodel%dSModelFqName" resolveInfo="fromString" />
                          <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="8n6q.~SModelFqName" resolveInfo="SModelFqName" />
                          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="8536718853245030631">
                            <property name="value" nameId="yvor.1070475926801:3" value="jetbrains.mps.baseLanguage.collections.custom" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="8536718853245030632">
                  <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8536718853245030633">
                    <property name="name" nameId="yvnu.1169194664001:0" value="mdl" />
                    <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SModelType" typeId="yvim.1143226024141:16" id="8536718853245030634" />
                    <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8536718853245030635">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8536718853245030636">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8536718853245030625" resolveInfo="desc" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8536718853245030637">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SModelDescriptor%dgetSModel()%cjetbrains%dmps%dsmodel%dSModel" resolveInfo="getSModel" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="8536718853245030638">
                  <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8536718853245030639">
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8536718853245030640">
                      <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8536718853245030641">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8536718853245030642">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8536718853245030618" resolveInfo="res" />
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddAllElementsOperation" typeId="yvix.1160666733551:7" id="8536718853245030643">
                          <node role="argument" roleId="yvix.1160666822012:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8536718853245030644">
                            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8536718853245030645">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8536718853245030633" resolveInfo="mdl" />
                            </node>
                            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Model_NodesOperation" typeId="yvim.1171323947159:16" id="8536718853245030646">
                              <link role="concept" roleId="yvim.1171323947160:16" targetNodeId="yvix.6099516049394485324:7" resolveInfo="CustomContainers" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotEqualsExpression" typeId="yvor.1073239437375:3" id="8536718853245030647">
                    <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="8536718853245030648" />
                    <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8536718853245030649">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8536718853245030633" resolveInfo="mdl" />
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8536718853245030650">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8536718853245030651">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8536718853245030618" resolveInfo="res" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8536718853245029921">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="8536718853245029923">
            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8536718853245025330" resolveInfo="runOnInit" />
            <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="8536718853245006659" resolveInfo="CollectionsLanguage" />
            <node role="actualArgument" roleId="yvor.1068499141038:3" type="yviq.ClosureLiteral" typeId="yviq.1199569711397:3" id="8536718853245029925">
              <node role="parameter" roleId="yviq.1199569906740:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="8536718853245029927">
                <property name="name" nameId="yvnu.1169194664001:0" value="cl" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8536718853245029929">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8536718853245006659" resolveInfo="CollectionsLanguage" />
                </node>
              </node>
              <node role="body" roleId="yviq.1199569916463:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8536718853245029926">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8536718853245029930">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8536718853245029941">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8536718853245029932">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="8536718853245029931">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8536718853245029927" resolveInfo="cl" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8536718853245029938">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8536718853245025323" resolveInfo="getCustomContainersRegistry" />
                      </node>
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8536718853245029947">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8536718853245008440" resolveInfo="registerProvider" />
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8536718853245030664">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8536718853245030612" resolveInfo="prov" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8536718853245030567">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="8536718853245030569">
            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8536718853245025681" resolveInfo="runOnDispose" />
            <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="8536718853245006659" resolveInfo="CollectionsLanguage" />
            <node role="actualArgument" roleId="yvor.1068499141038:3" type="yviq.ClosureLiteral" typeId="yviq.1199569711397:3" id="8536718853245030570">
              <node role="parameter" roleId="yviq.1199569906740:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="8536718853245030572">
                <property name="name" nameId="yvnu.1169194664001:0" value="cl" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8536718853245030574">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8536718853245006659" resolveInfo="CollectionsLanguage" />
                </node>
              </node>
              <node role="body" roleId="yviq.1199569916463:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8536718853245030571">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8536718853245030575">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8536718853245030591">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8536718853245030577">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="8536718853245030576">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8536718853245030572" resolveInfo="cl" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8536718853245030583">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8536718853245025323" resolveInfo="getCustomContainersRegistry" />
                      </node>
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8536718853245030597">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8536718853245008452" resolveInfo="unRegisterProvider" />
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8536718853245030671">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8536718853245030612" resolveInfo="prov" />
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
  </root>
  <root id="8423890115754358686">
    <node role="watchable" roleId="a9e8.5117350825036256318:0" type="a9e8.CustomWatchable" typeId="a9e8.5117350825036234483:0" id="8423890115754358692">
      <property name="name" nameId="yvnu.1169194664001:0" value="element" />
    </node>
    <node role="watchable" roleId="a9e8.5117350825036256318:0" type="a9e8.CustomWatchable" typeId="a9e8.5117350825036234483:0" id="1549837254988592393">
      <property name="name" nameId="yvnu.1169194664001:0" value="entry" />
    </node>
    <node role="watchable" roleId="a9e8.5117350825036256318:0" type="a9e8.CustomWatchable" typeId="a9e8.5117350825036234483:0" id="1549837254988610010">
      <property name="name" nameId="yvnu.1169194664001:0" value="key" />
    </node>
    <node role="watchable" roleId="a9e8.5117350825036256318:0" type="a9e8.CustomWatchable" typeId="a9e8.5117350825036234483:0" id="1549837254988610011">
      <property name="name" nameId="yvnu.1169194664001:0" value="value" />
    </node>
    <node role="watchable" roleId="a9e8.5117350825036256318:0" type="a9e8.CustomWatchable" typeId="a9e8.5117350825036234483:0" id="4489446533979526102">
      <property name="name" nameId="yvnu.1169194664001:0" value="size" />
    </node>
  </root>
  <root id="5116701553466303326">
    <node role="valueType" roleId="a9e8.43370322128256026:0" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="7785669630792592729">
      <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="yjwb.~List" resolveInfo="List" />
    </node>
    <node role="getWatchables" roleId="a9e8.43370322128194611:0" type="a9e8.GetHighLevelWatchablesBlock_ConceptFunction" typeId="a9e8.43370322128194518:0" id="5116701553466303330">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="5116701553466303331">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="6367352481823138411">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="6367352481823138412">
            <property name="name" nameId="yvnu.1169194664001:0" value="watchables" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="6367352481823138417">
              <node role="creator" roleId="yvor.1145553007750:3" type="a9e8.WatchablesListCreator" typeId="a9e8.1842653058274900914:0" id="1842653058275008948" />
            </node>
            <node role="type" roleId="yvor.5680397130376446158:3" type="a9e8.WatchableListType" typeId="a9e8.1842653058274900915:0" id="1842653058275008947" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.Statement" typeId="yvor.1068580123157:3" id="6367352481823138410" />
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="6367352481823138403">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="6367352481823138404">
            <property name="name" nameId="yvnu.1169194664001:0" value="size" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="6367352481823138405" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6367352481823138406">
              <node role="operand" roleId="yvor.1197027771414:3" type="a9e8.HighLevelValue_ConceptFunctionParameter" typeId="a9e8.43370322128272301:0" id="6367352481823138407" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="6367352481823138408">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~List%dsize()%cint" resolveInfo="size" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1067996875388370558">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1067996875388370560">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1067996875388370559">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6367352481823138412" resolveInfo="watchables" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1067996875388372928">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~List%dadd(java%dlang%dObject)%cboolean" resolveInfo="add" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1067996875388372931">
                <node role="creator" roleId="yvor.1145553007750:3" type="a9e8.HighLevelWatchableCreator" typeId="a9e8.43370322128285902:0" id="1067996875388372932">
                  <link role="watchable" roleId="a9e8.43370322128310821:0" targetNodeId="4489446533979526102" resolveInfo="size" />
                  <node role="value" roleId="a9e8.43370322128311163:0" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1067996875388372933">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6367352481823138404" resolveInfo="size" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.Statement" typeId="yvor.1068580123157:3" id="1842653058275013458" />
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ForeachStatement" typeId="yvor.1144226303539:3" id="6367352481823164548">
          <node role="variable" roleId="yvor.1144230900587:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="6367352481823164549">
            <property name="name" nameId="yvnu.1169194664001:0" value="element" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="6367352481823164554">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Object" resolveInfo="Object" />
            </node>
          </node>
          <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="6367352481823164550">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1067996875388372935">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1067996875388372937">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1067996875388372936">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6367352481823138412" resolveInfo="watchables" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1067996875388372941">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~List%dadd(java%dlang%dObject)%cboolean" resolveInfo="add" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1067996875388372942">
                    <node role="creator" roleId="yvor.1145553007750:3" type="a9e8.HighLevelWatchableCreator" typeId="a9e8.43370322128285902:0" id="1067996875388372943">
                      <link role="watchable" roleId="a9e8.43370322128310821:0" targetNodeId="8423890115754358692" resolveInfo="element" />
                      <node role="value" roleId="a9e8.43370322128311163:0" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1067996875388372944">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6367352481823164549" resolveInfo="element" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="iterable" roleId="yvor.1144226360166:3" type="a9e8.HighLevelValue_ConceptFunctionParameter" typeId="a9e8.43370322128272301:0" id="6367352481823164555" />
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.Statement" typeId="yvor.1068580123157:3" id="6367352481823138420" />
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="6367352481823138422">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6367352481823138424">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6367352481823138412" resolveInfo="watchables" />
          </node>
        </node>
      </node>
    </node>
  </root>
  <root id="7785669630792406965">
    <node role="valueType" roleId="a9e8.43370322128256026:0" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="7785669630792426020">
      <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="yjwb.~Map$Entry" resolveInfo="Map.Entry" />
    </node>
    <node role="getWatchables" roleId="a9e8.43370322128194611:0" type="a9e8.GetHighLevelWatchablesBlock_ConceptFunction" typeId="a9e8.43370322128194518:0" id="7785669630792406967">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="7785669630792406968">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="7785669630792487826">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="7785669630792487827">
            <property name="name" nameId="yvnu.1169194664001:0" value="result" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="a9e8.WatchableListType" typeId="a9e8.1842653058274900915:0" id="7785669630792487828" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="7785669630792487830">
              <node role="creator" roleId="yvor.1145553007750:3" type="a9e8.WatchablesListCreator" typeId="a9e8.1842653058274900914:0" id="7785669630792487832" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="7785669630792487812">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="7785669630792487813">
            <property name="name" nameId="yvnu.1169194664001:0" value="key" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="7785669630792487814">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Object" resolveInfo="Object" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7785669630792487815">
              <node role="operand" roleId="yvor.1197027771414:3" type="a9e8.HighLevelValue_ConceptFunctionParameter" typeId="a9e8.43370322128272301:0" id="7785669630792487816" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="7785669630792487817">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Map$Entry%dgetKey()%cjava%dlang%dObject" resolveInfo="getKey" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="7785669630792487818">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="7785669630792487819">
            <property name="name" nameId="yvnu.1169194664001:0" value="entryValue" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="7785669630792487820">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Object" resolveInfo="Object" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7785669630792487821">
              <node role="operand" roleId="yvor.1197027771414:3" type="a9e8.HighLevelValue_ConceptFunctionParameter" typeId="a9e8.43370322128272301:0" id="7785669630792487822" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="7785669630792487823">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Map$Entry%dgetValue()%cjava%dlang%dObject" resolveInfo="getValue" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="7785669630792487833">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7785669630792487835">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7785669630792487834">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7785669630792487827" resolveInfo="result" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="7785669630792487839">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~List%dadd(java%dlang%dObject)%cboolean" resolveInfo="add" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="7785669630792487840">
                <node role="creator" roleId="yvor.1145553007750:3" type="a9e8.HighLevelWatchableCreator" typeId="a9e8.43370322128285902:0" id="7785669630792487842">
                  <link role="watchable" roleId="a9e8.43370322128310821:0" targetNodeId="1549837254988610010" resolveInfo="key" />
                  <node role="value" roleId="a9e8.43370322128311163:0" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7785669630792487844">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7785669630792487813" resolveInfo="key" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="7785669630792487845">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7785669630792487846">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7785669630792487847">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7785669630792487827" resolveInfo="result" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="7785669630792487848">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~List%dadd(java%dlang%dObject)%cboolean" resolveInfo="add" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="7785669630792487849">
                <node role="creator" roleId="yvor.1145553007750:3" type="a9e8.HighLevelWatchableCreator" typeId="a9e8.43370322128285902:0" id="7785669630792487850">
                  <link role="watchable" roleId="a9e8.43370322128310821:0" targetNodeId="1549837254988610011" resolveInfo="value" />
                  <node role="value" roleId="a9e8.43370322128311163:0" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7785669630792487852">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7785669630792487819" resolveInfo="entryValue" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="7785669630792487854">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7785669630792487856">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7785669630792487827" resolveInfo="result" />
          </node>
        </node>
      </node>
    </node>
    <node role="getPresentation" roleId="a9e8.43370322128194610:0" type="a9e8.GetHighLevelValuePresentation_ConceptFunction" typeId="a9e8.43370322128194514:0" id="7785669630792426021">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="7785669630792426022">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="7785669630792487769">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="7785669630792487770">
            <property name="name" nameId="yvnu.1169194664001:0" value="key" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="7785669630792487771">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Object" resolveInfo="Object" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7785669630792487772">
              <node role="operand" roleId="yvor.1197027771414:3" type="a9e8.HighLevelValue_ConceptFunctionParameter" typeId="a9e8.43370322128272301:0" id="7785669630792487773" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="7785669630792487774">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Map$Entry%dgetKey()%cjava%dlang%dObject" resolveInfo="getKey" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="7785669630792487783">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="7785669630792487784">
            <property name="name" nameId="yvnu.1169194664001:0" value="entryValue" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="7785669630792487785">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Object" resolveInfo="Object" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7785669630792487786">
              <node role="operand" roleId="yvor.1197027771414:3" type="a9e8.HighLevelValue_ConceptFunctionParameter" typeId="a9e8.43370322128272301:0" id="7785669630792487787" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="7785669630792487788">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Map$Entry%dgetValue()%cjava%dlang%dObject" resolveInfo="getValue" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="7785669630792487794">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="667569110692308445">
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.ParenthesizedExpression" typeId="yvor.1079359253375:3" id="667569110692308448">
              <node role="expression" roleId="yvor.1079359253376:3" type="yvor.TernaryOperatorExpression" typeId="yvor.1163668896201:3" id="667569110692308455">
                <node role="ifTrue" roleId="yvor.1163668922816:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="667569110692308459">
                  <property name="value" nameId="yvor.1070475926801:3" value="null" />
                </node>
                <node role="ifFalse" roleId="yvor.1163668934364:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="667569110692308460">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7785669630792487784" resolveInfo="entryValue" />
                </node>
                <node role="condition" roleId="yvor.1163668914799:3" type="yvor.EqualsExpression" typeId="yvor.1068580123152:3" id="667569110692308451">
                  <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="667569110692308454" />
                  <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="667569110692308450">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7785669630792487784" resolveInfo="entryValue" />
                  </node>
                </node>
              </node>
            </node>
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="7785669630792487804">
              <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="7785669630792487799">
                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="7785669630792487798">
                  <property name="value" nameId="yvor.1070475926801:3" value="[" />
                </node>
                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.ParenthesizedExpression" typeId="yvor.1079359253375:3" id="667569110692308433">
                  <node role="expression" roleId="yvor.1079359253376:3" type="yvor.TernaryOperatorExpression" typeId="yvor.1163668896201:3" id="667569110692308439">
                    <node role="ifTrue" roleId="yvor.1163668922816:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="667569110692308443">
                      <property name="value" nameId="yvor.1070475926801:3" value="null" />
                    </node>
                    <node role="ifFalse" roleId="yvor.1163668934364:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="667569110692308444">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7785669630792487770" resolveInfo="key" />
                    </node>
                    <node role="condition" roleId="yvor.1163668914799:3" type="yvor.EqualsExpression" typeId="yvor.1068580123152:3" id="667569110692308435">
                      <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="667569110692308438" />
                      <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="667569110692308434">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7785669630792487770" resolveInfo="key" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="7785669630792487807">
                <property name="value" nameId="yvor.1070475926801:3" value="] = " />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </root>
  <root id="7785669630792592640">
    <node role="valueType" roleId="a9e8.43370322128256026:0" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="7785669630792592644">
      <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="yjwb.~Map" resolveInfo="Map" />
    </node>
    <node role="getWatchables" roleId="a9e8.43370322128194611:0" type="a9e8.GetHighLevelWatchablesBlock_ConceptFunction" typeId="a9e8.43370322128194518:0" id="7785669630792592642">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="7785669630792592643">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="7785669630792592660">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="7785669630792592661">
            <property name="name" nameId="yvnu.1169194664001:0" value="result" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="a9e8.WatchableListType" typeId="a9e8.1842653058274900915:0" id="7785669630792592662" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="7785669630792592664">
              <node role="creator" roleId="yvor.1145553007750:3" type="a9e8.WatchablesListCreator" typeId="a9e8.1842653058274900914:0" id="7785669630792592666" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.Statement" typeId="yvor.1068580123157:3" id="7785669630792592667" />
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="7785669630792592652">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="7785669630792592653">
            <property name="name" nameId="yvnu.1169194664001:0" value="size" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="7785669630792592654" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7785669630792592655">
              <node role="operand" roleId="yvor.1197027771414:3" type="a9e8.HighLevelValue_ConceptFunctionParameter" typeId="a9e8.43370322128272301:0" id="7785669630792592656" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="7785669630792592657">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Map%dsize()%cint" resolveInfo="size" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="3720097505854413239">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3720097505854413241">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="3720097505854413240">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7785669630792592661" resolveInfo="result" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="3720097505854413798">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~List%dadd(java%dlang%dObject)%cboolean" resolveInfo="add" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="3720097505854413799">
                <node role="creator" roleId="yvor.1145553007750:3" type="a9e8.HighLevelWatchableCreator" typeId="a9e8.43370322128285902:0" id="3720097505854413801">
                  <link role="watchable" roleId="a9e8.43370322128310821:0" targetNodeId="4489446533979526102" resolveInfo="size" />
                  <node role="value" roleId="a9e8.43370322128311163:0" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="3720097505854413803">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7785669630792592653" resolveInfo="size" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.Statement" typeId="yvor.1068580123157:3" id="3720097505854399044" />
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="7785669630792592675">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="7785669630792592676">
            <property name="name" nameId="yvnu.1169194664001:0" value="entries" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="7785669630792592677">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="yjwb.~Set" resolveInfo="Set" />
              <node role="parameter" roleId="yvor.1109201940907:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="7785669630792592695">
                <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="yjwb.~Map$Entry" resolveInfo="Map.Entry" />
              </node>
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7785669630792592678">
              <node role="operand" roleId="yvor.1197027771414:3" type="a9e8.HighLevelValue_ConceptFunctionParameter" typeId="a9e8.43370322128272301:0" id="7785669630792592679" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="7785669630792592680">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Map%dentrySet()%cjava%dutil%dSet" resolveInfo="entrySet" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ForeachStatement" typeId="yvor.1144226303539:3" id="7785669630792592688">
          <node role="variable" roleId="yvor.1144230900587:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="7785669630792592689">
            <property name="name" nameId="yvnu.1169194664001:0" value="entry" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="7785669630792592696">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="yjwb.~Map$Entry" resolveInfo="Map.Entry" />
            </node>
          </node>
          <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="7785669630792592690">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="7785669630792592697">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7785669630792592699">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7785669630792592698">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7785669630792592661" resolveInfo="result" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="7785669630792592703">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~List%dadd(java%dlang%dObject)%cboolean" resolveInfo="add" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="7785669630792592704">
                    <node role="creator" roleId="yvor.1145553007750:3" type="a9e8.HighLevelWatchableCreator" typeId="a9e8.43370322128285902:0" id="7785669630792592706">
                      <link role="watchable" roleId="a9e8.43370322128310821:0" targetNodeId="1549837254988592393" resolveInfo="entry" />
                      <node role="value" roleId="a9e8.43370322128311163:0" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7785669630792592708">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7785669630792592689" resolveInfo="entry" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="iterable" roleId="yvor.1144226360166:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7785669630792592693">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7785669630792592676" resolveInfo="entries" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.Statement" typeId="yvor.1068580123157:3" id="7785669630792592709" />
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="7785669630792592711">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7785669630792592713">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7785669630792592661" resolveInfo="result" />
          </node>
        </node>
      </node>
    </node>
  </root>
  <root id="7785669630792592730">
    <node role="valueType" roleId="a9e8.43370322128256026:0" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="7785669630792592734">
      <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="yjwb.~Set" resolveInfo="Set" />
    </node>
    <node role="getWatchables" roleId="a9e8.43370322128194611:0" type="a9e8.GetHighLevelWatchablesBlock_ConceptFunction" typeId="a9e8.43370322128194518:0" id="7785669630792592732">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="7785669630792592733">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.SingleLineComment" typeId="yvor.6329021646629104954:3" id="7785669630792592775">
          <node role="commentPart" roleId="yvor.6329021646629175155:3" type="yvor.TextCommentPart" typeId="yvor.6329021646629104957:3" id="7785669630792592776">
            <property name="text" nameId="yvor.6329021646629104958:3" value="again, same as ListViewer" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="7785669630792592738">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="7785669630792592739">
            <property name="name" nameId="yvnu.1169194664001:0" value="watchables" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="7785669630792592740">
              <node role="creator" roleId="yvor.1145553007750:3" type="a9e8.WatchablesListCreator" typeId="a9e8.1842653058274900914:0" id="7785669630792592741" />
            </node>
            <node role="type" roleId="yvor.5680397130376446158:3" type="a9e8.WatchableListType" typeId="a9e8.1842653058274900915:0" id="7785669630792592742" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.Statement" typeId="yvor.1068580123157:3" id="7785669630792592743" />
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="7785669630792592744">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="7785669630792592745">
            <property name="name" nameId="yvnu.1169194664001:0" value="size" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="7785669630792592746" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7785669630792592747">
              <node role="operand" roleId="yvor.1197027771414:3" type="a9e8.HighLevelValue_ConceptFunctionParameter" typeId="a9e8.43370322128272301:0" id="7785669630792592773" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="7785669630792592749">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Set%dsize()%cint" resolveInfo="size" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="7785669630792592750">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7785669630792592751">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7785669630792592752">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7785669630792592739" resolveInfo="watchables" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="7785669630792592753">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~List%dadd(java%dlang%dObject)%cboolean" resolveInfo="add" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="7785669630792592754">
                <node role="creator" roleId="yvor.1145553007750:3" type="a9e8.HighLevelWatchableCreator" typeId="a9e8.43370322128285902:0" id="7785669630792592755">
                  <link role="watchable" roleId="a9e8.43370322128310821:0" targetNodeId="4489446533979526102" resolveInfo="size" />
                  <node role="value" roleId="a9e8.43370322128311163:0" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7785669630792592756">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7785669630792592745" resolveInfo="size" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.Statement" typeId="yvor.1068580123157:3" id="7785669630792592757" />
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ForeachStatement" typeId="yvor.1144226303539:3" id="7785669630792592758">
          <node role="variable" roleId="yvor.1144230900587:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="7785669630792592759">
            <property name="name" nameId="yvnu.1169194664001:0" value="element" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="7785669630792592760">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Object" resolveInfo="Object" />
            </node>
          </node>
          <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="7785669630792592761">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="7785669630792592762">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7785669630792592763">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7785669630792592764">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7785669630792592739" resolveInfo="watchables" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="7785669630792592765">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~List%dadd(java%dlang%dObject)%cboolean" resolveInfo="add" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="7785669630792592766">
                    <node role="creator" roleId="yvor.1145553007750:3" type="a9e8.HighLevelWatchableCreator" typeId="a9e8.43370322128285902:0" id="7785669630792592767">
                      <link role="watchable" roleId="a9e8.43370322128310821:0" targetNodeId="8423890115754358692" resolveInfo="element" />
                      <node role="value" roleId="a9e8.43370322128311163:0" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7785669630792592768">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7785669630792592759" resolveInfo="element" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="iterable" roleId="yvor.1144226360166:3" type="a9e8.HighLevelValue_ConceptFunctionParameter" typeId="a9e8.43370322128272301:0" id="7785669630792592769" />
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.Statement" typeId="yvor.1068580123157:3" id="7785669630792592770" />
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="7785669630792592771">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7785669630792592772">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7785669630792592739" resolveInfo="watchables" />
          </node>
        </node>
      </node>
    </node>
  </root>
</model>

