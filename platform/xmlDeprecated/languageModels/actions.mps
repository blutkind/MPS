<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:00000000-0000-4000-0000-011c895905a0(jetbrains.mps.xml.deprecated.actions)">
  <persistence version="7" />
  <language namespace="aee9cad2-acd4-4608-aef2-0004f6a1cdbd(jetbrains.mps.lang.actions)" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="7866978e-a0f0-4cc7-81bc-4d213d9375e1(jetbrains.mps.lang.smodel)" />
  <import index="yvrz" modelUID="r:00000000-0000-4000-0000-011c895905a3(jetbrains.mps.xml.deprecated.structure)" version="0" />
  <import index="vhgx" modelUID="f:java_stub#java.lang(java.lang@java_stub)" version="-1" />
  <import index="yvnu" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" />
  <import index="yvoa" modelUID="r:00000000-0000-4000-0000-011c895902a8(jetbrains.mps.lang.actions.structure)" version="23" implicit="yes" />
  <import index="yvor" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" implicit="yes" />
  <import index="yvim" modelUID="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.lang.smodel.structure)" version="16" implicit="yes" />
  <import index="yvry" modelUID="r:00000000-0000-4000-0000-011c895905a0(jetbrains.mps.xml.deprecated.actions)" version="-1" implicit="yes" />
  <roots>
    <node type="yvoa.NodeSubstituteActions" typeId="yvoa.1112056943463:23" id="1220989580562">
      <property name="name" nameId="yvnu.1169194664001:0" value="substitute ElementPart" />
    </node>
    <node type="yvoa.NodeSubstituteActions" typeId="yvoa.1112056943463:23" id="1220992142083">
      <property name="name" nameId="yvnu.1169194664001:0" value="substitute Attribute" />
    </node>
    <node type="yvoa.SideTransformHintSubstituteActions" typeId="yvoa.1138079416598:23" id="1220992737642">
      <property name="name" nameId="yvnu.1169194664001:0" value="transform Attribute" />
    </node>
  </roots>
  <root id="1220989580562">
    <node role="actionsBuilder" roleId="yvoa.1112058057696:23" type="yvoa.NodeSubstituteActionsBuilder" typeId="yvoa.1112058030570:23" id="1220989638938">
      <link role="applicableConcept" roleId="yvoa.1112058088712:23" targetNodeId="yvrz.1107866767486:0" resolveInfo="ElementPart" />
      <node role="part" roleId="yvoa.1177324142645:23" type="yvoa.AddMenuPart" typeId="yvoa.1177323996388:23" id="1220989709127">
        <link role="concept" roleId="yvoa.1177333551023:23" targetNodeId="yvrz.1107866821377:0" resolveInfo="Text" />
        <node role="part" roleId="yvoa.1177333559040:23" type="yvoa.SimpleItemSubstitutePart" typeId="yvoa.1177327666243:23" id="1220989812816">
          <node role="handler" roleId="yvoa.1177327709106:23" type="yvoa.QueryFunction_Substitute_Handler" typeId="yvoa.1177327570013:23" id="1220989812817">
            <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1220989812818">
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1220989964204">
                <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1220989964205">
                  <property name="name" nameId="yvnu.1169194664001:0" value="text" />
                  <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1220989964206">
                    <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvrz.1107866821377:0" resolveInfo="Text" />
                  </node>
                  <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1220989973333">
                    <node role="creator" roleId="yvor.1145553007750:3" type="yvim.SNodeCreator" typeId="yvim.1180636770613:16" id="1220989973334">
                      <node role="createdType" roleId="yvim.1180636770616:16" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1220989973335">
                        <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvrz.1107866821377:0" resolveInfo="Text" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1220989978759">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1220989983749">
                  <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1220989980652">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1220989978760">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1220989964205" resolveInfo="element" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="1220989981233">
                      <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvnu.1169194664001:0" resolveInfo="name" />
                    </node>
                  </node>
                  <node role="rValue" roleId="yvor.1068498886297:3" type="yvoa.ConceptFunctionParameter_pattern" typeId="yvoa.1177327274449:23" id="1220989991190" />
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1220989994145">
                <node role="expression" roleId="yvor.1068581517676:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1220989996381">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1220989964205" resolveInfo="element" />
                </node>
              </node>
            </node>
          </node>
          <node role="matchingText" roleId="yvoa.1177336013307:23" type="yvoa.QueryFunction_SubstituteString" typeId="yvoa.1177335944525:23" id="1220989835678">
            <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1220989835679">
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1220990243225">
                <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1220990243226">
                  <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1220990261092">
                    <node role="expression" roleId="yvor.1068581517676:3" type="yvoa.ConceptFunctionParameter_pattern" typeId="yvoa.1177327274449:23" id="1220990264063" />
                  </node>
                </node>
                <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotExpression" typeId="yvor.1081516740877:3" id="1220990794497">
                  <node role="expression" roleId="yvor.1081516765348:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1220990794498">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvoa.ConceptFunctionParameter_pattern" typeId="yvoa.1177327274449:23" id="1220990794499" />
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1220990794500">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vhgx.~String%dstartsWith(java%dlang%dString)%cboolean" resolveInfo="startsWith" />
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1220990794501">
                        <property name="value" nameId="yvor.1070475926801:3" value="&lt;" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1220990269861">
                <node role="expression" roleId="yvor.1068581517676:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1220990269863" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </root>
  <root id="1220992142083">
    <node role="actionsBuilder" roleId="yvoa.1112058057696:23" type="yvoa.NodeSubstituteActionsBuilder" typeId="yvoa.1112058030570:23" id="1220992153912">
      <link role="applicableConcept" roleId="yvoa.1112058088712:23" targetNodeId="yvrz.1107866742882:0" resolveInfo="Attribute" />
      <node role="part" roleId="yvoa.1177324142645:23" type="yvoa.AddMenuPart" typeId="yvoa.1177323996388:23" id="1220992168867">
        <link role="concept" roleId="yvoa.1177333551023:23" targetNodeId="yvrz.1107866742882:0" resolveInfo="Attribute" />
        <node role="part" roleId="yvoa.1177333559040:23" type="yvoa.SimpleItemSubstitutePart" typeId="yvoa.1177327666243:23" id="1220992177572">
          <node role="handler" roleId="yvoa.1177327709106:23" type="yvoa.QueryFunction_Substitute_Handler" typeId="yvoa.1177327570013:23" id="1220992177573">
            <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1220992177574">
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1220992363474">
                <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1220992363475">
                  <property name="name" nameId="yvnu.1169194664001:0" value="attr" />
                  <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1220992363476">
                    <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvrz.1107866742882:0" resolveInfo="Attribute" />
                  </node>
                  <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1220992373494">
                    <node role="creator" roleId="yvor.1145553007750:3" type="yvim.SNodeCreator" typeId="yvim.1180636770613:16" id="1220992373495">
                      <node role="createdType" roleId="yvim.1180636770616:16" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1220992373496">
                        <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvrz.1107866742882:0" resolveInfo="Attribute" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1220992382029">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1220992385973">
                  <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1220992383437">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1220992382030">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1220992363475" resolveInfo="attr" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="1220992384034">
                      <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvnu.1169194664001:0" resolveInfo="name" />
                    </node>
                  </node>
                  <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1220993027869">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvoa.ConceptFunctionParameter_pattern" typeId="yvoa.1177327274449:23" id="1220992388851" />
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.TrimOperation" typeId="yvor.1225271546410:3" id="1220993030388" />
                  </node>
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1220992391509">
                <node role="expression" roleId="yvor.1068581517676:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1220992393433">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1220992363475" resolveInfo="attr" />
                </node>
              </node>
            </node>
          </node>
          <node role="matchingText" roleId="yvoa.1177336013307:23" type="yvoa.QueryFunction_SubstituteString" typeId="yvoa.1177335944525:23" id="1220992214856">
            <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1220992214857">
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1220992270238">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvoa.ConceptFunctionParameter_pattern" typeId="yvoa.1177327274449:23" id="1220992270239" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </root>
  <root id="1220992737642">
    <node role="actionsBuilder" roleId="yvoa.1138079416599:23" type="yvoa.SideTransformHintSubstituteActionsBuilder" typeId="yvoa.1138079221458:23" id="1220992758002">
      <link role="applicableConcept" roleId="yvoa.1138079221462:23" targetNodeId="yvrz.1107866742882:0" resolveInfo="Attribute" />
      <node role="part" roleId="yvoa.1177442283389:23" type="yvoa.AddMenuPart" typeId="yvoa.1177323996388:23" id="1220992862863">
        <link role="concept" roleId="yvoa.1177333551023:23" targetNodeId="yvrz.1107866742882:0" resolveInfo="Attribute" />
        <node role="part" roleId="yvoa.1177333559040:23" type="yvoa.SimpleSideTransformMenuPart" typeId="yvoa.1177498013932:23" id="1220992876614">
          <node role="handler" roleId="yvoa.1177498207384:23" type="yvoa.QueryFunction_SideTransform_Handler" typeId="yvoa.1177498227294:23" id="1220992876615">
            <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1220992876616">
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.SingleLineComment" typeId="yvor.6329021646629104954:3" id="7376433222636453731">
                <node role="commentPart" roleId="yvor.6329021646629175155:3" type="yvor.TextCommentPart" typeId="yvor.6329021646629104957:3" id="7376433222636453732">
                  <property name="text" nameId="yvor.6329021646629104958:3" value=" add next attribute" />
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1220992946295">
                <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1220992946296">
                  <property name="name" nameId="yvnu.1169194664001:0" value="nextAttr" />
                  <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1220992946297">
                    <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvrz.1107866742882:0" resolveInfo="Attribute" />
                  </node>
                  <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1220992954643">
                    <node role="creator" roleId="yvor.1145553007750:3" type="yvim.SNodeCreator" typeId="yvim.1180636770613:16" id="1220992954644">
                      <node role="createdType" roleId="yvim.1180636770616:16" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1220992954645">
                        <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvrz.1107866742882:0" resolveInfo="Attribute" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1220992989922">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1220992999524">
                  <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1220993017617">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvoa.ConceptFunctionParameter_pattern" typeId="yvoa.1177327274449:23" id="1220993001481" />
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.TrimOperation" typeId="yvor.1225271546410:3" id="1220993020790" />
                  </node>
                  <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1220992994989">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1220992989923">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1220992946296" resolveInfo="nextAttr" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="1220992995617">
                      <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvnu.1169194664001:0" resolveInfo="name" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1220992976225">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1220992978649">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvoa.ConceptFunctionParameter_sourceNode" typeId="yvoa.1177497140107:23" id="1220992976226" />
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_InsertNextSiblingOperation" typeId="yvim.1143224066846:16" id="1220992981965">
                    <node role="insertedNode" roleId="yvim.1143224066849:16" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1220992985013">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1220992946296" resolveInfo="nextAttr" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1220993506808">
                <node role="expression" roleId="yvor.1068581517676:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1220993509825">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1220992946296" resolveInfo="nextAttr" />
                </node>
              </node>
            </node>
          </node>
          <node role="matchingText" roleId="yvoa.1177498166690:23" type="yvoa.QueryFunction_SideTransform_String" typeId="yvoa.1177498071304:23" id="1220992891930">
            <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1220992891931">
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1220992913744">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvoa.ConceptFunctionParameter_pattern" typeId="yvoa.1177327274449:23" id="1220992913745" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </root>
</model>

