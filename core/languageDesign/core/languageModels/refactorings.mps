<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:d9efd362-28b8-4f70-9bcd-fb582528d11c(jetbrains.mps.lang.core.refactorings)">
  <persistence version="7" />
  <language namespace="3ecd7c84-cde3-45de-886c-135ecc69b742(jetbrains.mps.lang.refactoring)" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="18bc6592-03a6-4e29-a83a-7ff23bde13ba(jetbrains.mps.lang.editor)" />
  <language namespace="28f9e497-3b42-4291-aeba-0a1039153ab1(jetbrains.mps.lang.plugin)" />
  <language namespace="fd392034-7849-419d-9071-12563d152375(jetbrains.mps.baseLanguage.closures)" />
  <language namespace="83888646-71ce-4f1c-9c53-c54016f6ad4f(jetbrains.mps.baseLanguage.collections)" />
  <language namespace="7a5dda62-9140-4668-ab76-d5ed1746f2b2(jetbrains.mps.lang.typesystem)" />
  <language namespace="ceab5195-25ea-4f22-9b92-103b95ca8c0c(jetbrains.mps.lang.core)" />
  <language namespace="7866978e-a0f0-4cc7-81bc-4d213d9375e1(jetbrains.mps.lang.smodel)" />
  <import index="yvnu" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" />
  <import index="yvnt" modelUID="r:00000000-0000-4000-0000-011c8959028e(jetbrains.mps.lang.structure.findUsages)" version="-1" />
  <import index="yvnx" modelUID="r:00000000-0000-4000-0000-011c89590287(jetbrains.mps.lang.core.scripts)" version="-1" />
  <import index="rggf" modelUID="r:2c4d9270-b6d6-44af-aecd-e01a223680db(jetbrains.mps.kernel.model)" version="-1" />
  <import index="yvnr" modelUID="r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.lang.structure.structure)" version="0" />
  <import index="hx9v" modelUID="f:java_stub#jetbrains.mps.lang.structure.structure(jetbrains.mps.lang.structure.structure@java_stub)" version="-1" />
  <import index="8n6q" modelUID="f:java_stub#jetbrains.mps.smodel(jetbrains.mps.smodel@java_stub)" version="-1" />
  <import index="yeix" modelUID="f:java_stub#jetbrains.mps.smodel.search(jetbrains.mps.smodel.search@java_stub)" version="-1" />
  <import index="1alo" modelUID="f:java_stub#jetbrains.mps.ide.findusages.model(jetbrains.mps.ide.findusages.model@java_stub)" version="-1" />
  <import index="inno" modelUID="f:java_stub#jetbrains.mps.workbench.editors(jetbrains.mps.workbench.editors@java_stub)" version="-1" />
  <import index="64wz" modelUID="f:java_stub#com.intellij.openapi.components(com.intellij.openapi.components@java_stub)" version="-1" />
  <import index="t147" modelUID="f:java_stub#javax.swing(javax.swing@java_stub)" version="-1" />
  <import index="tkc7" modelUID="f:java_stub#jetbrains.mps.ide.projectPane(jetbrains.mps.ide.projectPane@java_stub)" version="-1" />
  <import index="a0fo" modelUID="f:java_stub#com.intellij.openapi.project(com.intellij.openapi.project@java_stub)" version="-1" />
  <import index="cry7" modelUID="f:java_stub#jetbrains.mps.ide.ui.smodel(jetbrains.mps.ide.ui.smodel@java_stub)" version="-1" />
  <import index="kstb" modelUID="f:java_stub#javax.swing.tree(javax.swing.tree@java_stub)" version="-1" />
  <import index="332" modelUID="f:java_stub#jetbrains.mps.ide(jetbrains.mps.ide@java_stub)" version="-1" />
  <import index="fps3" modelUID="f:java_stub#jetbrains.mps.ide.ui(jetbrains.mps.ide.ui@java_stub)" version="-1" />
  <import index="jv43" modelUID="f:java_stub#com.intellij.openapi.wm(com.intellij.openapi.wm@java_stub)" version="-1" />
  <import index="yvia" modelUID="r:00000000-0000-4000-0000-011c89590319(jetbrains.mps.lang.refactoring.structure)" version="1" implicit="yes" />
  <import index="yvix" modelUID="r:00000000-0000-4000-0000-011c8959032e(jetbrains.mps.baseLanguage.collections.structure)" version="7" implicit="yes" />
  <import index="yvor" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" implicit="yes" />
  <import index="yvim" modelUID="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.lang.smodel.structure)" version="16" implicit="yes" />
  <import index="yviq" modelUID="r:00000000-0000-4000-0000-011c89590338(jetbrains.mps.baseLanguage.closures.structure)" version="3" implicit="yes" />
  <import index="yvju" modelUID="r:00000000-0000-4000-0000-011c89590368(jetbrains.mps.lang.plugin.structure)" version="23" implicit="yes" />
  <import index="vhgx" modelUID="f:java_stub#java.lang(java.lang@java_stub)" version="-1" implicit="yes" />
  <import index="1h63" modelUID="r:d9efd362-28b8-4f70-9bcd-fb582528d11c(jetbrains.mps.lang.core.refactorings)" version="-1" implicit="yes" />
  <roots>
    <node type="yvia.Refactoring" typeId="yvia.6895093993902236229:1" id="1347577327951770664">
      <property name="name" nameId="yvnu.1169194664001:0" value="Rename" />
      <property name="userFriendlyName" nameId="yvia.6895093993902236371:1" value="Rename" />
    </node>
    <node type="yvia.Refactoring" typeId="yvia.6895093993902236229:1" id="7012097027058633272">
      <property name="name" nameId="yvnu.1169194664001:0" value="MoveNodes" />
      <property name="userFriendlyName" nameId="yvia.6895093993902236371:1" value="Move Nodes" />
    </node>
    <node type="yvor.ClassConcept" typeId="yvor.1068390468198:3" id="7012097027058828343">
      <property name="name" nameId="yvnu.1169194664001:0" value="ModelOrNodeChooser" />
    </node>
  </roots>
  <root id="1347577327951770664">
    <node role="parameter" roleId="yvia.6895093993902236376:1" type="yvia.RefactoringParameter" typeId="yvia.6895093993902311012:1" id="1347577327951780456">
      <property name="name" nameId="yvnu.1169194664001:0" value="newName" />
      <node role="chooser" roleId="yvia.5497648299878741978:1" type="yvia.MPSParameterChooser" typeId="yvia.5497648299878742011:1" id="1347577327951780457">
        <property name="title" nameId="yvia.6647259624309067737:1" value="New name:" />
        <node role="paramType" roleId="yvia.4413749148913695157:1" type="yvia.StringMPSParameterType" typeId="yvia.4413749148913695143:1" id="1347577327951780458" />
        <node role="initialValueBlock" roleId="yvia.3060724424231928628:1" type="yvia.InitialPropertyValueClause" typeId="yvia.7573235936722759511:1" id="1347577327951780459">
          <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1347577327951780460">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1347577327951780461">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1347577327951780462">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1347577327951780463">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvia.SettingsRefactoringContext_ConceptFunctionParameter" typeId="yvia.3644668945279694356:1" id="1347577327951780464" />
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvia.NodeOperation" typeId="yvia.7953996722066252915:1" id="1347577327951780465" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="1347577327951780466">
                  <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvnu.1169194664001:0" resolveInfo="name" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="target" roleId="yvia.6895093993902310998:1" type="yvia.NodeTarget" typeId="yvia.6895093993902310764:1" id="1347577327951770668">
      <link role="concept" roleId="yvia.6895093993902310806:1" targetNodeId="yvnu.1169194658468:0" resolveInfo="INamedConcept" />
    </node>
    <node role="doRefactorBlock" roleId="yvia.6895093993902236381:1" type="yvia.DoRefactorClause" typeId="yvia.1189694053795:1" id="1347577327951770666">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1347577327951770667">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1347577327951780494">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1347577327951780495">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvia.RefactoringParameterReference" typeId="yvia.6895093993902496262:1" id="1347577327951780496">
              <link role="refactoringParameter" roleId="yvia.6895093993902496263:1" targetNodeId="1347577327951780456" resolveInfo="newName" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1347577327951780497">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1347577327951780498">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvia.RefactoringContext_ConceptFunctionParameter" typeId="yvia.7953996722066256458:1" id="1347577327951780499" />
                <node role="operation" roleId="yvor.1197027833540:3" type="yvia.NodeOperation" typeId="yvia.7953996722066252915:1" id="1347577327951780500" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="1347577327951780501">
                <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvnu.1169194664001:0" resolveInfo="name" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="keystroke" roleId="yvia.6895093993902236375:1" type="yvju.KeyMapKeystroke" typeId="yvju.1207318242772:23" id="1347577327951780455">
      <property name="keycode" nameId="yvju.1207318242774:23" value="VK_F6" />
      <property name="modifiers" nameId="yvju.1207318242773:23" value="shift" />
    </node>
    <node role="initBlock" roleId="yvia.5497648299878741976:1" type="yvia.InitClause" typeId="yvia.5497648299878741970:1" id="1347577327951780469">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1347577327951780470">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1347577327951780471">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1347577327951780472">
            <property name="name" nameId="yvnu.1169194664001:0" value="result" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.BooleanType" typeId="yvor.1070534644030:3" id="1347577327951780473" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvju.ExecuteLightweightCommandStatement" typeId="yvju.1225441341971:23" id="1347577327951780474">
          <node role="commandClosureLiteral" roleId="yvju.1225441160167:23" type="yvju.CommandClosureLiteral" typeId="yvju.1225441216717:23" id="1347577327951780475">
            <node role="body" roleId="yviq.1199569916463:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1347577327951780476">
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1347577327951780477">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1347577327951780478">
                  <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1347577327951780479">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1347577327951780472" resolveInfo="result" />
                  </node>
                  <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1347577327951780480">
                    <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="yvnx.4706738529699924056" resolveInfo="RenameUtil" />
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvnx.4706738529699924062" resolveInfo="canBeRenamed" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1347577327951780481">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvia.RefactoringContext_ConceptFunctionParameter" typeId="yvia.7953996722066256458:1" id="1347577327951780482" />
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvia.NodeOperation" typeId="yvia.7953996722066252915:1" id="1347577327951780483" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1347577327951780484">
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1347577327951780485">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="8537071608806078683">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8537071608806078684">
                <property name="name" nameId="yvnu.1169194664001:0" value="frame" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8537071608806078685">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="t147.~JFrame" resolveInfo="JFrame" />
                </node>
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8537071608806078686">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="8537071608806078687">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="jv43.~WindowManager%dgetInstance()%ccom%dintellij%dopenapi%dwm%dWindowManager" resolveInfo="getInstance" />
                    <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="jv43.~WindowManager" resolveInfo="WindowManager" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8537071608806078688">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="jv43.~WindowManager%dgetFrame(com%dintellij%dopenapi%dproject%dProject)%cjavax%dswing%dJFrame" resolveInfo="getFrame" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8537071608806078689">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvia.RefactoringContext_ConceptFunctionParameter" typeId="yvia.7953996722066256458:1" id="8537071608806078690" />
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvia.MainProjectOperation" typeId="yvia.8113680833395644310:1" id="8537071608806078691" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8537071608806061066">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="8537071608806074926">
                <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="t147.~JOptionPane" resolveInfo="JOptionPane" />
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JOptionPane%dshowMessageDialog(java%dawt%dComponent,java%dlang%dObject,java%dlang%dString,int)%cvoid" resolveInfo="showMessageDialog" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8537071608806078692">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8537071608806078684" resolveInfo="frame" />
                </node>
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="8537071608806078694">
                  <property name="value" nameId="yvor.1070475926801:3" value="Nodes with getter for the \&quot;name\&quot; property can't be renamed" />
                </node>
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="8537071608806078699">
                  <property name="value" nameId="yvor.1070475926801:3" value="Node can't be renamed" />
                </node>
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="8537071608806078696">
                  <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="t147.~JOptionPane" resolveInfo="JOptionPane" />
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="t147.~JOptionPane%dINFORMATION_MESSAGE" resolveInfo="INFORMATION_MESSAGE" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1347577327951780486">
              <node role="expression" roleId="yvor.1068581517676:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="1347577327951780487">
                <property name="value" nameId="yvor.1068580123138:3" value="false" />
              </node>
            </node>
          </node>
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotExpression" typeId="yvor.1081516740877:3" id="1347577327951780488">
            <node role="expression" roleId="yvor.1081516765348:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1347577327951780489">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1347577327951780472" resolveInfo="result" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1347577327951780490">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvia.AskExpression" typeId="yvia.6895093993902311015:1" id="1347577327951780491">
            <node role="parameter" roleId="yvia.6895093993902311020:1" type="yvia.RefactoringParameterReference" typeId="yvia.6895093993902496262:1" id="1347577327951780492">
              <link role="refactoringParameter" roleId="yvia.6895093993902496263:1" targetNodeId="1347577327951780456" resolveInfo="newName" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="affectedNodesBlock" roleId="yvia.1347577327951503399:1" type="yvia.AffectedNodesClause" typeId="yvia.1200932465350:1" id="1347577327951780502">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1347577327951780503">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1347577327951780505">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvia.ExecuteFindersExpression" typeId="yvia.1212242396240:1" id="1347577327951780506">
            <node role="finders" roleId="yvia.1212242658590:1" type="yvia.FinderReference" typeId="yvia.1212242507771:1" id="1347577327951780507">
              <link role="finderDeclaration" roleId="yvia.1212242603178:1" targetNodeId="yvnt.1198430852441" resolveInfo="NodeAndDescendantsUsages" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="modelsToGenerateBlock" roleId="yvia.616550569928923871:1" type="yvia.ModelsToGenerateClause" typeId="yvia.1682834381185132063:1" id="6253304210158143009">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="6253304210158143010">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6253304210158147116">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvia.ModelsToGenerateByDefault" typeId="yvia.4347648036456711197:1" id="6253304210158147117" />
        </node>
      </node>
    </node>
  </root>
  <root id="7012097027058633272">
    <node role="field" roleId="yvia.6895093993902236377:1" type="yvia.RefactoringField" typeId="yvia.6895093993902311010:1" id="7012097027058650679">
      <property name="name" nameId="yvnu.1169194664001:0" value="role" />
      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.StringType" typeId="yvor.1225271177708:3" id="7012097027058650681" />
    </node>
    <node role="field" roleId="yvia.6895093993902236377:1" type="yvia.RefactoringField" typeId="yvia.6895093993902311010:1" id="7012097027058650682">
      <property name="name" nameId="yvnu.1169194664001:0" value="nodeToOpen" />
      <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="7012097027058650688" />
    </node>
    <node role="parameter" roleId="yvia.6895093993902236376:1" type="yvia.RefactoringParameter" typeId="yvia.6895093993902311012:1" id="7012097027058633816">
      <property name="name" nameId="yvnu.1169194664001:0" value="target" />
      <node role="chooser" roleId="yvia.5497648299878741978:1" type="yvia.CustomParameterChooser" typeId="yvia.5497648299878742029:1" id="7012097027058633818">
        <property name="stretch" nameId="yvia.5934994956485846035:1" value="true" />
        <node role="entityType" roleId="yvia.5497648299878979017:1" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="7012097027058650672">
          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Object" resolveInfo="Object" />
        </node>
        <node role="mainComponent" roleId="yvia.5934994956485838241:1" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="7012097027058862192">
          <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="7012097027058891174">
            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="7012097027058828345" resolveInfo="ModelOrNodeChooser" />
            <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvia.RefactoringContextExpression" typeId="yvia.5934994956487113631:1" id="4284078376668133048" />
          </node>
        </node>
        <node role="commitBlock" roleId="yvia.5934994956485846034:1" type="yvia.CommitClause" typeId="yvia.5497648299878742031:1" id="7012097027058633821">
          <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="7012097027058633822">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="4284078376668136073">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="4284078376668136074">
                <property name="name" nameId="yvnu.1169194664001:0" value="selectedObject" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="4284078376668136075">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Object" resolveInfo="Object" />
                </node>
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4284078376668136076">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvia.ComponentExpression" typeId="yvia.5934994956486307251:1" id="4284078376668136077" />
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="4284078376668136078">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="7012097027058891183" resolveInfo="getSelectedObject" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="4284078376668136093">
              <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="4284078376668136094">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvia.ErrorStatement" typeId="yvia.5934994956485965463:1" id="4284078376668136515">
                  <node role="error" roleId="yvia.5934994956485965470:1" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="4284078376668136521">
                    <property name="value" nameId="yvor.1070475926801:3" value="select node or model" />
                  </node>
                </node>
              </node>
              <node role="condition" roleId="yvor.1068580123160:3" type="yvor.AndExpression" typeId="yvor.1080120340718:3" id="4284078376668136469">
                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NotExpression" typeId="yvor.1081516740877:3" id="4284078376668136476">
                  <node role="expression" roleId="yvor.1081516765348:3" type="yvor.InstanceOfExpression" typeId="yvor.1081256982272:3" id="4284078376668136503">
                    <node role="classType" roleId="yvor.1081256993305:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="4284078376668136510">
                      <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8n6q.~SModelDescriptor" resolveInfo="SModelDescriptor" />
                    </node>
                    <node role="leftExpression" roleId="yvor.1081256993304:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="4284078376668136482">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="4284078376668136074" resolveInfo="selectedObject" />
                    </node>
                  </node>
                </node>
                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.NotExpression" typeId="yvor.1081516740877:3" id="4284078376668136149">
                  <node role="expression" roleId="yvor.1081516765348:3" type="yvor.InstanceOfExpression" typeId="yvor.1081256982272:3" id="4284078376668136159">
                    <node role="classType" roleId="yvor.1081256993305:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="4284078376668136460">
                      <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8n6q.~SNode" resolveInfo="SNode" />
                    </node>
                    <node role="leftExpression" roleId="yvor.1081256993304:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="4284078376668136150">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="4284078376668136074" resolveInfo="selectedObject" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvia.SetValueStatement" typeId="yvia.5934994956485884215:1" id="7012097027058650673">
              <node role="value" roleId="yvia.5934994956485884218:1" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="4284078376668136079">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="4284078376668136074" resolveInfo="selectedObject" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="target" roleId="yvia.6895093993902310998:1" type="yvia.NodeTarget" typeId="yvia.6895093993902310764:1" id="7012097027058633806">
      <property name="allowMultiple" nameId="yvia.6895093993902310999:1" value="true" />
    </node>
    <node role="doRefactorBlock" roleId="yvia.6895093993902236381:1" type="yvia.DoRefactorClause" typeId="yvia.1189694053795:1" id="7012097027058633274">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="7012097027058633275">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="7012097027058650997">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="7012097027058650998">
            <property name="name" nameId="yvnu.1169194664001:0" value="nodes" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="7012097027058650999" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7012097027058651163">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvia.RefactoringContext_ConceptFunctionParameter" typeId="yvia.7953996722066256458:1" id="7012097027058651158" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvia.NodesOperation" typeId="yvia.7953996722066252917:1" id="7012097027058651171" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="7012097027058651001">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="7012097027058651002">
            <property name="name" nameId="yvnu.1169194664001:0" value="targetModel" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="7012097027058651003" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SModelType" typeId="yvim.1143226024141:16" id="7012097027058651004" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="7012097027058651005">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="7012097027058651006">
            <property name="name" nameId="yvnu.1169194664001:0" value="movedNodes" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="7012097027058651007" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="7012097027058651008" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="7012097027058651009">
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="7012097027058651010">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="7012097027058651011">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="7012097027058651012">
                <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7012097027058651013">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7012097027058651002" resolveInfo="targetModel" />
                </node>
                <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7012097027058651014">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParenthesizedExpression" typeId="yvor.1079359253375:3" id="7012097027058651015">
                    <node role="expression" roleId="yvor.1079359253376:3" type="yvor.CastExpression" typeId="yvor.1070534934090:3" id="7012097027058651016">
                      <node role="type" roleId="yvor.1070534934091:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="7012097027058651017">
                        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8n6q.~SModelDescriptor" resolveInfo="SModelDescriptor" />
                      </node>
                      <node role="expression" roleId="yvor.1070534934092:3" type="yvia.RefactoringParameterReference" typeId="yvia.6895093993902496262:1" id="7012097027058651176">
                        <link role="refactoringParameter" roleId="yvia.6895093993902496263:1" targetNodeId="7012097027058633816" resolveInfo="target" />
                      </node>
                    </node>
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="7012097027058651019">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SModelDescriptor%dgetSModel()%cjetbrains%dmps%dsmodel%dSModel" resolveInfo="getSModel" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="7012097027058651020">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="7012097027058651021">
                <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7012097027058651022">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7012097027058651006" resolveInfo="movedNodes" />
                </node>
                <node role="rValue" roleId="yvor.1068498886297:3" type="yvia.MoveNodesToModelExpression" typeId="yvia.1199620728600:1" id="7012097027058651023">
                  <node role="whatToMove" roleId="yvia.1199619459778:1" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7012097027058651024">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7012097027058650998" resolveInfo="nodes" />
                  </node>
                  <node role="destination" roleId="yvia.1199619459779:1" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7012097027058651025">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7012097027058651002" resolveInfo="targetModel" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.InstanceOfExpression" typeId="yvor.1081256982272:3" id="7012097027058651026">
            <node role="classType" roleId="yvor.1081256993305:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="7012097027058651027">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8n6q.~SModelDescriptor" resolveInfo="SModelDescriptor" />
            </node>
            <node role="leftExpression" roleId="yvor.1081256993304:3" type="yvia.RefactoringParameterReference" typeId="yvia.6895093993902496262:1" id="7012097027058651153">
              <link role="refactoringParameter" roleId="yvia.6895093993902496263:1" targetNodeId="7012097027058633816" resolveInfo="target" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="7012097027058651029">
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="7012097027058651030">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="7012097027058651031">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="7012097027058651032">
                <property name="name" nameId="yvnu.1169194664001:0" value="targetNode" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="7012097027058651033" />
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.CastExpression" typeId="yvor.1070534934090:3" id="7012097027058651034">
                  <node role="expression" roleId="yvor.1070534934092:3" type="yvia.RefactoringParameterReference" typeId="yvia.6895093993902496262:1" id="7012097027058651181">
                    <link role="refactoringParameter" roleId="yvia.6895093993902496263:1" targetNodeId="7012097027058633816" resolveInfo="target" />
                  </node>
                  <node role="type" roleId="yvor.1070534934091:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="7012097027058651036" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="7012097027058651037">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="7012097027058651038">
                <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7012097027058651039">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7012097027058651006" resolveInfo="movedNodes" />
                </node>
                <node role="rValue" roleId="yvor.1068498886297:3" type="yvia.MoveNodesToNodeExpression" typeId="yvia.1199620920737:1" id="7012097027058651040">
                  <node role="whatToMove" roleId="yvia.1199619459778:1" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7012097027058651041">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7012097027058650998" resolveInfo="nodes" />
                  </node>
                  <node role="destination" roleId="yvia.1199619459779:1" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7012097027058651042">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7012097027058651032" resolveInfo="targetNode" />
                  </node>
                  <node role="roleInTarget" roleId="yvia.1199620959025:1" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7012097027058651043">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvim.SemanticDowncastExpression" typeId="yvim.1145404486709:16" id="7012097027058651044">
                      <node role="leftExpression" roleId="yvim.1145404616321:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7012097027058651045">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7012097027058651046">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7012097027058650998" resolveInfo="nodes" />
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetFirstOperation" typeId="yvix.1165525191778:7" id="7012097027058651047" />
                      </node>
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="7012097027058651048">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SNode%dgetRole_()%cjava%dlang%dString" resolveInfo="getRole_" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="7012097027058651049">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="7012097027058651050">
                <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7012097027058651051">
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_GetModelOperation" typeId="yvim.1143234257716:16" id="7012097027058651052" />
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7012097027058651053">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7012097027058651032" resolveInfo="targetNode" />
                  </node>
                </node>
                <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7012097027058651054">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7012097027058651002" resolveInfo="targetModel" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.InstanceOfExpression" typeId="yvor.1081256982272:3" id="7012097027058651055">
            <node role="classType" roleId="yvor.1081256993305:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="7012097027058651056">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8n6q.~SNode" resolveInfo="SNode" />
            </node>
            <node role="leftExpression" roleId="yvor.1081256993304:3" type="yvia.RefactoringParameterReference" typeId="yvia.6895093993902496262:1" id="7012097027058651186">
              <link role="refactoringParameter" roleId="yvia.6895093993902496263:1" targetNodeId="7012097027058633816" resolveInfo="target" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="7012097027058651058">
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="7012097027058651059">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="7012097027058827720">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="7012097027058827721">
                <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7012097027058827722">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7012097027058827723">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7012097027058651006" resolveInfo="movedNodes" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetFirstOperation" typeId="yvix.1165525191778:7" id="7012097027058827724" />
                </node>
                <node role="lValue" roleId="yvor.1068498886295:3" type="yvia.RefactoringFieldReference" typeId="yvia.5497648299878398634:1" id="7012097027058827734">
                  <link role="baseVariableDeclaration" roleId="yvor.5497648299878491909:3" targetNodeId="7012097027058650682" resolveInfo="nodeToOpen" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotEqualsExpression" typeId="yvor.1073239437375:3" id="7012097027058651091">
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="7012097027058651092" />
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7012097027058651093">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7012097027058651002" resolveInfo="targetModel" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="initBlock" roleId="yvia.5497648299878741976:1" type="yvia.InitClause" typeId="yvia.5497648299878741970:1" id="7012097027058650706">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="7012097027058650707">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="4284078376668136003">
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="4284078376668136004">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="4284078376668136030">
              <node role="expression" roleId="yvor.1068581517676:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="4284078376668136040">
                <property name="value" nameId="yvor.1068580123138:3" value="false" />
              </node>
            </node>
          </node>
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotExpression" typeId="yvor.1081516740877:3" id="4284078376668136022">
            <node role="expression" roleId="yvor.1081516765348:3" type="yvia.AskExpression" typeId="yvia.6895093993902311015:1" id="4284078376668136023">
              <node role="parameter" roleId="yvia.6895093993902311020:1" type="yvia.RefactoringParameterReference" typeId="yvia.6895093993902496262:1" id="4284078376668136024">
                <link role="refactoringParameter" roleId="yvia.6895093993902496263:1" targetNodeId="7012097027058633816" resolveInfo="target" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.Statement" typeId="yvor.1068580123157:3" id="4284078376668136046" />
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="3548249452606313660">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="3548249452606313661">
            <property name="name" nameId="yvnu.1169194664001:0" value="result" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.BooleanType" typeId="yvor.1070534644030:3" id="3548249452606313662" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="3548249452606313676">
              <property name="value" nameId="yvor.1068580123138:3" value="false" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvju.ExecuteLightweightCommandStatement" typeId="yvju.1225441341971:23" id="3548249452606313471">
          <node role="commandClosureLiteral" roleId="yvju.1225441160167:23" type="yvju.CommandClosureLiteral" typeId="yvju.1225441216717:23" id="3548249452606313472">
            <node role="body" roleId="yviq.1199569916463:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="3548249452606313473">
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="3548249452606313491">
                <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="3548249452606313492">
                  <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="3548249452606313493">
                    <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="3548249452606313494">
                      <property name="name" nameId="yvnu.1169194664001:0" value="targetNode" />
                      <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="3548249452606313495" />
                      <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.ParenthesizedExpression" typeId="yvor.1079359253375:3" id="3548249452606313496">
                        <node role="expression" roleId="yvor.1079359253376:3" type="yvor.CastExpression" typeId="yvor.1070534934090:3" id="3548249452606313497">
                          <node role="type" roleId="yvor.1070534934091:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="3548249452606313498" />
                          <node role="expression" roleId="yvor.1070534934092:3" type="yvia.RefactoringParameterReference" typeId="yvia.6895093993902496262:1" id="3548249452606313499">
                            <link role="refactoringParameter" roleId="yvia.6895093993902496263:1" targetNodeId="7012097027058633816" resolveInfo="target" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="3548249452606313500">
                    <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="3548249452606313501">
                      <property name="name" nameId="yvnu.1169194664001:0" value="concept" />
                      <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SConceptType" typeId="yvim.1172420572800:16" id="3548249452606313502" />
                      <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3548249452606313503">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="3548249452606313504">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="3548249452606313494" resolveInfo="targetNode" />
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_GetConceptOperation" typeId="yvim.1172323065820:16" id="3548249452606313505" />
                      </node>
                    </node>
                  </node>
                  <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="3548249452606313506">
                    <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="3548249452606313507">
                      <property name="name" nameId="yvnu.1169194664001:0" value="superConceptsScope" />
                      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="3548249452606313508">
                        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="yeix.~ConceptAndSuperConceptsScope" resolveInfo="ConceptAndSuperConceptsScope" />
                      </node>
                      <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="3548249452606313509">
                        <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="3548249452606313510">
                          <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yeix.~ConceptAndSuperConceptsScope%d&lt;init&gt;(jetbrains%dmps%dlang%dstructure%dstructure%dAbstractConceptDeclaration)" resolveInfo="ConceptAndSuperConceptsScope" />
                          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3548249452606313511">
                            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="3548249452606313512">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="3548249452606313501" resolveInfo="concept" />
                            </node>
                            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_GetAdapterOperation" typeId="yvim.1170384605257:16" id="3548249452606313513" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="3548249452606313514">
                    <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="3548249452606313515">
                      <property name="name" nameId="yvnu.1169194664001:0" value="linkDeclarations" />
                      <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.ListType" typeId="yvix.1151688443754:7" id="3548249452606313516">
                        <node role="elementType" roleId="yvix.1151688676805:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="3548249452606313517">
                          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="hx9v.~LinkDeclaration" resolveInfo="LinkDeclaration" />
                        </node>
                      </node>
                      <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3548249452606313518">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="3548249452606313519">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="3548249452606313507" resolveInfo="superConceptsScope" />
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="3548249452606313520">
                          <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yeix.~ConceptAndSuperConceptsScope%dgetLinkDeclarationsExcludingOverridden()%cjava%dutil%dList" resolveInfo="getLinkDeclarationsExcludingOverridden" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="3548249452606313521">
                    <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="3548249452606313522">
                      <property name="name" nameId="yvnu.1169194664001:0" value="childLinkDeclarations" />
                      <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.SequenceType" typeId="yvix.1151689724996:7" id="3548249452606313523">
                        <node role="elementType" roleId="yvix.1151689745422:7" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="3548249452606313524">
                          <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvnr.1071489288298:0" resolveInfo="LinkDeclaration" />
                        </node>
                      </node>
                      <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3548249452606313525">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3548249452606313526">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="3548249452606313527">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="3548249452606313515" resolveInfo="linkDeclarations" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvix.WhereOperation" typeId="yvix.1202120902084:7" id="3548249452606313528">
                            <node role="closure" roleId="yvix.1204796294226:7" type="yviq.ClosureLiteral" typeId="yviq.1199569711397:3" id="3548249452606313529">
                              <node role="parameter" roleId="yviq.1199569906740:3" type="yvix.SmartClosureParameterDeclaration" typeId="yvix.1203518072036:7" id="3548249452606313530">
                                <property name="name" nameId="yvnu.1169194664001:0" value="it" />
                                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.WildCardType" typeId="yvor.1171903607971:3" id="3548249452606313531" />
                              </node>
                              <node role="body" roleId="yviq.1199569916463:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="3548249452606313532">
                                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="3548249452606313533">
                                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3548249452606313534">
                                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3548249452606313535">
                                      <node role="operand" roleId="yvor.1197027771414:3" type="yvim.SNodeTypeCastExpression" typeId="yvim.1140137987495:16" id="3548249452606313536">
                                        <link role="concept" roleId="yvim.1140138128738:16" targetNodeId="yvnr.1071489288298:0" resolveInfo="LinkDeclaration" />
                                        <node role="leftExpression" roleId="yvim.1140138123956:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3548249452606313537">
                                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="3548249452606313538">
                                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="3548249452606313530" resolveInfo="it" />
                                          </node>
                                          <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="3548249452606313539">
                                            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~BaseAdapter%dgetNode()%cjetbrains%dmps%dsmodel%dSNode" resolveInfo="getNode" />
                                          </node>
                                        </node>
                                      </node>
                                      <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="3548249452606313540">
                                        <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvnr.1071599937831:0" resolveInfo="metaClass" />
                                      </node>
                                    </node>
                                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Property_HasValue_Enum" typeId="yvim.1146171026731:16" id="3548249452606313541">
                                      <node role="value" roleId="yvim.1146171026732:16" type="yvim.EnumMemberReference" typeId="yvim.1138676077309:16" id="3548249452606313542">
                                        <link role="enumMember" roleId="yvim.1138676095763:16" targetNodeId="yvnr.1084199179705:0" resolveInfo="aggregation" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvix.SelectOperation" typeId="yvix.1202128969694:7" id="3548249452606313543">
                          <node role="closure" roleId="yvix.1204796294226:7" type="yviq.ClosureLiteral" typeId="yviq.1199569711397:3" id="3548249452606313544">
                            <node role="parameter" roleId="yviq.1199569906740:3" type="yvix.SmartClosureParameterDeclaration" typeId="yvix.1203518072036:7" id="3548249452606313545">
                              <property name="name" nameId="yvnu.1169194664001:0" value="it" />
                              <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.WildCardType" typeId="yvor.1171903607971:3" id="3548249452606313546" />
                            </node>
                            <node role="body" roleId="yviq.1199569916463:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="3548249452606313547">
                              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="3548249452606313548">
                                <node role="expression" roleId="yvor.1068580123156:3" type="yvim.SNodeTypeCastExpression" typeId="yvim.1140137987495:16" id="3548249452606313549">
                                  <link role="concept" roleId="yvim.1140138128738:16" targetNodeId="yvnr.1071489288298:0" resolveInfo="LinkDeclaration" />
                                  <node role="leftExpression" roleId="yvim.1140138123956:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3548249452606313550">
                                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="3548249452606313551">
                                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="3548249452606313545" resolveInfo="it" />
                                    </node>
                                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="3548249452606313552">
                                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~BaseAdapter%dgetNode()%cjetbrains%dmps%dsmodel%dSNode" resolveInfo="getNode" />
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
                  <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="3548249452606313553">
                    <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="3548249452606313554">
                      <property name="name" nameId="yvnu.1169194664001:0" value="childLinksRoles" />
                      <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.SequenceType" typeId="yvix.1151689724996:7" id="3548249452606313555">
                        <node role="elementType" roleId="yvix.1151689745422:7" type="yvor.StringType" typeId="yvor.1225271177708:3" id="3548249452606313556" />
                      </node>
                      <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3548249452606313557">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="3548249452606313558">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="3548249452606313522" resolveInfo="childLinkDeclarations" />
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvix.SelectOperation" typeId="yvix.1202128969694:7" id="3548249452606313559">
                          <node role="closure" roleId="yvix.1204796294226:7" type="yviq.ClosureLiteral" typeId="yviq.1199569711397:3" id="3548249452606313560">
                            <node role="parameter" roleId="yviq.1199569906740:3" type="yvix.SmartClosureParameterDeclaration" typeId="yvix.1203518072036:7" id="3548249452606313561">
                              <property name="name" nameId="yvnu.1169194664001:0" value="it" />
                              <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.WildCardType" typeId="yvor.1171903607971:3" id="3548249452606313562" />
                            </node>
                            <node role="body" roleId="yviq.1199569916463:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="3548249452606313563">
                              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="3548249452606313564">
                                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="3548249452606313565">
                                  <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="rggf.1237995590703" resolveInfo="SModelUtil" />
                                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="rggf.1238250357846" resolveInfo="getGenuineLinkRole" />
                                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="3548249452606313566">
                                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="3548249452606313561" resolveInfo="it" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ForeachStatement" typeId="yvor.1144226303539:3" id="3548249452606313567">
                    <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="3548249452606313568">
                      <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="3548249452606313569">
                        <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="3548249452606313570">
                          <property name="name" nameId="yvnu.1169194664001:0" value="childRole" />
                          <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.StringType" typeId="yvor.1225271177708:3" id="3548249452606313571" />
                          <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3548249452606313572">
                            <node role="operand" roleId="yvor.1197027771414:3" type="yvim.SemanticDowncastExpression" typeId="yvim.1145404486709:16" id="3548249452606313573">
                              <node role="leftExpression" roleId="yvim.1145404616321:16" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="3548249452606313574">
                                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="3548249452606313615" resolveInfo="node" />
                              </node>
                            </node>
                            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="3548249452606313575">
                              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SNode%dgetRole_()%cjava%dlang%dString" resolveInfo="getRole_" />
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="3548249452606313576">
                        <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotExpression" typeId="yvor.1081516740877:3" id="3548249452606313577">
                          <node role="expression" roleId="yvor.1081516765348:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3548249452606313578">
                            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="3548249452606313579">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="3548249452606313554" resolveInfo="childLinksRoles" />
                            </node>
                            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.ContainsOperation" typeId="yvix.1172254888721:7" id="3548249452606313580">
                              <node role="argument" roleId="yvix.1172256416782:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="3548249452606313581">
                                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="3548249452606313570" resolveInfo="childRole" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="3548249452606313582">
                          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="3548249452606313583" />
                        </node>
                      </node>
                      <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ForeachStatement" typeId="yvor.1144226303539:3" id="3548249452606313585">
                        <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="3548249452606313586">
                          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="3548249452606313587">
                            <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="3548249452606313588">
                              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="3548249452606313589">
                                <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="3548249452606313590">
                                  <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="3548249452606313591" />
                                </node>
                                <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotExpression" typeId="yvor.1081516740877:3" id="3548249452606313593">
                                  <node role="expression" roleId="yvor.1081516765348:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3548249452606313594">
                                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3548249452606313595">
                                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="3548249452606313596">
                                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="3548249452606313610" resolveInfo="linkDeclaration" />
                                      </node>
                                      <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="3548249452606313597">
                                        <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvnr.1071599976176:0" />
                                      </node>
                                    </node>
                                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Concept_IsSuperConceptOfOperation" typeId="yvim.1180028149140:16" id="3548249452606313598">
                                      <node role="conceptArgument" roleId="yvim.1180028346304:16" type="yvim.PoundExpression" typeId="yvim.1204834851141:16" id="3548249452606313599">
                                        <node role="expression" roleId="yvim.1204834868751:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3548249452606313600">
                                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="3548249452606313601">
                                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="3548249452606313615" resolveInfo="node" />
                                          </node>
                                          <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_GetConceptOperation" typeId="yvim.1172323065820:16" id="3548249452606313602" />
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3548249452606313603">
                              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3548249452606313604">
                                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="3548249452606313605">
                                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="3548249452606313610" resolveInfo="linkDeclaration" />
                                </node>
                                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="3548249452606313606">
                                  <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvnr.1071599776563:0" resolveInfo="role" />
                                </node>
                              </node>
                              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="3548249452606313607">
                                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vhgx.~String%dequals(java%dlang%dObject)%cboolean" resolveInfo="equals" />
                                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="3548249452606313608">
                                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="3548249452606313570" resolveInfo="childRole" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="iterable" roleId="yvor.1144226360166:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="3548249452606313609">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="3548249452606313522" resolveInfo="childLinkDeclarations" />
                        </node>
                        <node role="variable" roleId="yvor.1144230900587:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="3548249452606313610">
                          <property name="name" nameId="yvnu.1169194664001:0" value="linkDeclaration" />
                          <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="3548249452606313611">
                            <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvnr.1071489288298:0" resolveInfo="LinkDeclaration" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="iterable" roleId="yvor.1144226360166:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3548249452606313612">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvia.RefactoringContext_ConceptFunctionParameter" typeId="yvia.7953996722066256458:1" id="3548249452606313613" />
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvia.NodesOperation" typeId="yvia.7953996722066252917:1" id="3548249452606313614" />
                    </node>
                    <node role="variable" roleId="yvor.1144230900587:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="3548249452606313615">
                      <property name="name" nameId="yvnu.1169194664001:0" value="node" />
                      <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="3548249452606313616" />
                    </node>
                  </node>
                  <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="3548249452606313751">
                    <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="3548249452606313761">
                      <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="3548249452606313764">
                        <property name="value" nameId="yvor.1068580123138:3" value="true" />
                      </node>
                      <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="3548249452606313752">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="3548249452606313661" resolveInfo="result" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="condition" roleId="yvor.1068580123160:3" type="yvor.InstanceOfExpression" typeId="yvor.1081256982272:3" id="3548249452606313619">
                  <node role="classType" roleId="yvor.1081256993305:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="3548249452606313620">
                    <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8n6q.~SNode" resolveInfo="SNode" />
                  </node>
                  <node role="leftExpression" roleId="yvor.1081256993304:3" type="yvia.RefactoringParameterReference" typeId="yvia.6895093993902496262:1" id="3548249452606313621">
                    <link role="refactoringParameter" roleId="yvia.6895093993902496263:1" targetNodeId="7012097027058633816" resolveInfo="target" />
                  </node>
                </node>
                <node role="elsifClauses" roleId="yvor.1206060520071:3" type="yvor.ElsifClause" typeId="yvor.1206060495898:3" id="3548249452606313795">
                  <node role="statementList" roleId="yvor.1206060644605:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="3548249452606313797">
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ForeachStatement" typeId="yvor.1144226303539:3" id="3548249452606313821">
                      <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="3548249452606313822">
                        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="3548249452606313823">
                          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="3548249452606313824">
                            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="3548249452606313825" />
                          </node>
                          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotExpression" typeId="yvor.1081516740877:3" id="3548249452606313826">
                            <node role="expression" roleId="yvor.1081516765348:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3548249452606313827">
                              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3548249452606313828">
                                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="3548249452606313829">
                                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="3548249452606313835" resolveInfo="node" />
                                </node>
                                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_GetConceptOperation" typeId="yvim.1172323065820:16" id="3548249452606313830" />
                              </node>
                              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="3548249452606313831">
                                <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvnr.1096454100552:0" resolveInfo="rootable" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="iterable" roleId="yvor.1144226360166:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3548249452606313832">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvia.RefactoringContext_ConceptFunctionParameter" typeId="yvia.7953996722066256458:1" id="3548249452606313833" />
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvia.NodesOperation" typeId="yvia.7953996722066252917:1" id="3548249452606313834" />
                      </node>
                      <node role="variable" roleId="yvor.1144230900587:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="3548249452606313835">
                        <property name="name" nameId="yvnu.1169194664001:0" value="node" />
                        <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="3548249452606313836" />
                      </node>
                    </node>
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="3548249452606313837">
                      <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="3548249452606313838">
                        <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="3548249452606313839">
                          <property name="value" nameId="yvor.1068580123138:3" value="true" />
                        </node>
                        <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="3548249452606313840">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="3548249452606313661" resolveInfo="result" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition" roleId="yvor.1206060619838:3" type="yvor.InstanceOfExpression" typeId="yvor.1081256982272:3" id="3548249452606313806">
                    <node role="classType" roleId="yvor.1081256993305:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="3548249452606313807">
                      <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8n6q.~SModelDescriptor" resolveInfo="SModelDescriptor" />
                    </node>
                    <node role="leftExpression" roleId="yvor.1081256993304:3" type="yvia.RefactoringParameterReference" typeId="yvia.6895093993902496262:1" id="3548249452606313808">
                      <link role="refactoringParameter" roleId="yvia.6895093993902496263:1" targetNodeId="7012097027058633816" resolveInfo="target" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="3548249452606313686">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="3548249452606313696">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="3548249452606313661" resolveInfo="result" />
          </node>
        </node>
      </node>
    </node>
    <node role="affectedNodesBlock" roleId="yvia.1347577327951503399:1" type="yvia.AffectedNodesClause" typeId="yvia.1200932465350:1" id="7012097027058650941">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="7012097027058650942">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="7012097027058650947">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="7012097027058650948">
            <property name="name" nameId="yvnu.1169194664001:0" value="searchResults" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="7012097027058650949">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="1alo.~SearchResults" resolveInfo="SearchResults" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="7012097027058650950">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="7012097027058650951">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1alo.~SearchResults%d&lt;init&gt;()" resolveInfo="SearchResults" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvix.ForEachStatement" typeId="yvix.1153943597977:7" id="7012097027058650952">
          <node role="variable" roleId="yvix.1153944400369:7" type="yvix.ForEachVariable" typeId="yvix.1153944193378:7" id="7012097027058650953">
            <property name="name" nameId="yvnu.1169194664001:0" value="selNode" />
          </node>
          <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="7012097027058650954">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="7012097027058650955">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7012097027058650956">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7012097027058650957">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7012097027058650948" resolveInfo="searchResults" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="7012097027058650958">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1alo.~SearchResults%daddAll(jetbrains%dmps%dide%dfindusages%dmodel%dSearchResults)%cvoid" resolveInfo="addAll" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvia.ExecuteFindersExpression" typeId="yvia.1212242396240:1" id="7012097027058650959">
                    <node role="finders" roleId="yvia.1212242658590:1" type="yvia.FinderReference" typeId="yvia.1212242507771:1" id="7012097027058650960">
                      <link role="finderDeclaration" roleId="yvia.1212242603178:1" targetNodeId="yvnt.1198430852441" resolveInfo="NodeAndDescendantsUsages" />
                    </node>
                    <node role="searchNode" roleId="yvia.1212242678419:1" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="7012097027058650961">
                      <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="7012097027058650953" resolveInfo="selNode" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="inputSequence" roleId="yvix.1153944424730:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7012097027058650974">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvia.RefactoringContext_ConceptFunctionParameter" typeId="yvia.7953996722066256458:1" id="7012097027058650969" />
            <node role="operation" roleId="yvor.1197027833540:3" type="yvia.NodesOperation" typeId="yvia.7953996722066252917:1" id="7012097027058650982" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="7012097027058650963">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7012097027058650964">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7012097027058650948" resolveInfo="searchResults" />
          </node>
        </node>
      </node>
    </node>
    <node role="updateModelBlock" roleId="yvia.1347577327951503400:1" type="yvia.UpdateModelClause" typeId="yvia.1189694434958:1" id="7012097027058651098">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="7012097027058651099">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvia.UpdateModelByDefaultOperation" typeId="yvia.1197382578687:1" id="7012097027058651108" />
      </node>
    </node>
    <node role="doWhenDoneBlock" roleId="yvia.2058726427123891193:1" type="yvia.DoWhenDoneClause" typeId="yvia.2058726427123891188:1" id="7012097027058651117">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="7012097027058651118">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.SingleLineComment" typeId="yvor.6329021646629104954:3" id="7012097027058828305">
          <node role="commentPart" roleId="yvor.6329021646629175155:3" type="yvor.TextCommentPart" typeId="yvor.6329021646629104957:3" id="7012097027058828310">
            <property name="text" nameId="yvor.6329021646629104958:3" value="todo: open target nodes" />
          </node>
        </node>
      </node>
    </node>
    <node role="keystroke" roleId="yvia.6895093993902236375:1" type="yvju.KeyMapKeystroke" typeId="yvju.1207318242772:23" id="3068114543317961934">
      <property name="keycode" nameId="yvju.1207318242774:23" value="VK_F6" />
    </node>
  </root>
  <root id="7012097027058828343">
    <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="7012097027058828344" />
    <node role="constructor" roleId="yvor.1068390468201:3" type="yvor.ConstructorDeclaration" typeId="yvor.1068580123140:3" id="7012097027058828345">
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="7012097027058828346" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="7012097027058828347" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="7012097027058828348">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.SuperConstructorInvocation" typeId="yvor.1070475587102:3" id="4272582839150467879">
          <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JScrollPane%d&lt;init&gt;()" resolveInfo="JScrollPane" />
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="4284078376668355730">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="4284078376668355731">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="4284078376668355732">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="4284078376668355733">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="tkc7.~ProjectTree%d&lt;init&gt;(com%dintellij%dopenapi%dproject%dProject)" resolveInfo="ProjectTree" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2270577049313345360">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="4284078376668355734">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="4284078376668130771" resolveInfo="project" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvia.MainProjectOperation" typeId="yvia.8113680833395644310:1" id="2270577049313345364" />
                </node>
              </node>
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4284078376668355735">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="4284078376668355736" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="4284078376668355737">
                <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="4284078376668155142" resolveInfo="myTree" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="4284078376668359452">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4284078376668359453">
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="4284078376668359454">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JScrollPane%dsetViewportView(java%dawt%dComponent)%cvoid" resolveInfo="setViewportView" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4284078376668359456">
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="4284078376668359457">
                  <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="4284078376668155142" resolveInfo="myTree" />
                </node>
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="4284078376668359458" />
              </node>
            </node>
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="4284078376668359455" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="4284078376668540875">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="4284078376668541489">
            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="332.~ThreadUtils%drunInUIThreadNoWait(java%dlang%dRunnable)%cvoid" resolveInfo="runInUIThreadNoWait" />
            <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="332.~ThreadUtils" resolveInfo="ThreadUtils" />
            <node role="actualArgument" roleId="yvor.1068499141038:3" type="yviq.ClosureLiteral" typeId="yviq.1199569711397:3" id="4284078376668541490">
              <node role="body" roleId="yviq.1199569916463:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="4284078376668541491">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="4284078376668541492">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4284078376668541496">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4284078376668541493">
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="4284078376668541494">
                        <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="4284078376668155142" resolveInfo="myTree" />
                      </node>
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="4284078376668541495" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="4284078376668547739">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="fps3.~MPSTree%drebuildNow()%cvoid" resolveInfo="rebuildNow" />
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="2270577049313304944">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2270577049313304948">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2270577049313304945">
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="2270577049313304946">
                        <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="4284078376668155142" resolveInfo="myTree" />
                      </node>
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="2270577049313304947" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="2270577049313304952">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="fps3.~MPSTree%drunWithoutExpansion(java%dlang%dRunnable)%cvoid" resolveInfo="runWithoutExpansion" />
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yviq.ClosureLiteral" typeId="yviq.1199569711397:3" id="2270577049313304953">
                        <node role="body" roleId="yviq.1199569916463:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="2270577049313304954">
                          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="2270577049313307686">
                            <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="2270577049313307687">
                              <property name="name" nameId="yvnu.1169194664001:0" value="treeNode" />
                              <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="2270577049313307688">
                                <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="fps3.~MPSTreeNode" resolveInfo="MPSTreeNode" />
                              </node>
                              <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2270577049313342687">
                                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2270577049313342684">
                                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="2270577049313342685">
                                    <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="2270577049313323323" resolveInfo="myHelper" />
                                  </node>
                                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="2270577049313342686" />
                                </node>
                                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="2270577049313342691">
                                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="tkc7.~ProjectTreeFindHelper%dfindMostSuitableModelTreeNode(jetbrains%dmps%dsmodel%dSModelDescriptor)%cjetbrains%dmps%dide%dui%dsmodel%dSModelTreeNode" resolveInfo="findMostSuitableModelTreeNode" />
                                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2270577049313345366">
                                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="2270577049313345365">
                                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="4284078376668130771" resolveInfo="context" />
                                    </node>
                                    <node role="operation" roleId="yvor.1197027833540:3" type="yvia.ModelDescriptorOperation" typeId="yvia.7953996722066252911:1" id="2270577049313345370" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="2270577049313307693">
                            <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="2270577049313307694">
                              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="2270577049313323321" />
                            </node>
                            <node role="condition" roleId="yvor.1068580123160:3" type="yvor.EqualsExpression" typeId="yvor.1068580123152:3" id="2270577049313323317">
                              <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="2270577049313323320" />
                              <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="2270577049313323316">
                                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2270577049313307687" resolveInfo="treeNode" />
                              </node>
                            </node>
                          </node>
                          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.Statement" typeId="yvor.1068580123157:3" id="2270577049313307692" />
                          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="2270577049313304956">
                            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2270577049313304960">
                              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2270577049313304957">
                                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="2270577049313304958">
                                  <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="4284078376668155142" resolveInfo="myTree" />
                                </node>
                                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="2270577049313304959" />
                              </node>
                              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="2270577049313307680">
                                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="fps3.~MPSTree%dselectNode(javax%dswing%dtree%dTreeNode)%cvoid" resolveInfo="selectNode" />
                                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="2270577049313307690">
                                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2270577049313307687" resolveInfo="treeNode" />
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
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="4284078376668130771">
        <property name="name" nameId="yvnu.1169194664001:0" value="context" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvia.ContextType" typeId="yvia.7953996722066536522:1" id="2270577049313345359" />
      </node>
    </node>
    <node role="superclass" roleId="yvor.1165602531693:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="4272582839150466069">
      <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="t147.~JScrollPane" resolveInfo="JScrollPane" />
    </node>
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="7012097027058891183">
      <property name="name" nameId="yvnu.1169194664001:0" value="getSelectedObject" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="7012097027058891191">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Object" resolveInfo="Object" />
      </node>
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="7012097027058891185">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="3548249452606133128">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="3548249452606133129">
            <property name="name" nameId="yvnu.1169194664001:0" value="selection" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="3548249452606133130">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Object" resolveInfo="Object" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3548249452606133131">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3548249452606133132">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3548249452606133133">
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="3548249452606133134">
                    <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="4284078376668155142" resolveInfo="myTree" />
                  </node>
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="3548249452606133135" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="3548249452606133136">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTree%dgetSelectionPath()%cjavax%dswing%dtree%dTreePath" resolveInfo="getSelectionPath" />
                </node>
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="3548249452606133137">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="kstb.~TreePath%dgetLastPathComponent()%cjava%dlang%dObject" resolveInfo="getLastPathComponent" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="3548249452606133177">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="3548249452606133178">
            <property name="name" nameId="yvnu.1169194664001:0" value="result" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="3548249452606133179">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Object" resolveInfo="Object" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="3548249452606133180" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvju.ExecuteLightweightCommandStatement" typeId="yvju.1225441341971:23" id="3548249452606133078">
          <node role="commandClosureLiteral" roleId="yvju.1225441160167:23" type="yvju.CommandClosureLiteral" typeId="yvju.1225441216717:23" id="3548249452606133079">
            <node role="body" roleId="yviq.1199569916463:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="3548249452606133080">
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="3548249452606133143">
                <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="3548249452606133144">
                  <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="3548249452606133145">
                    <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="3548249452606133146">
                      <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3548249452606133147">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParenthesizedExpression" typeId="yvor.1079359253375:3" id="3548249452606133148">
                          <node role="expression" roleId="yvor.1079359253376:3" type="yvor.CastExpression" typeId="yvor.1070534934090:3" id="3548249452606133149">
                            <node role="expression" roleId="yvor.1070534934092:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="3548249452606133150">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="3548249452606133129" resolveInfo="selection" />
                            </node>
                            <node role="type" roleId="yvor.1070534934091:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="3548249452606133151">
                              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="cry7.~SNodeTreeNode" resolveInfo="SNodeTreeNode" />
                            </node>
                          </node>
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="3548249452606133152">
                          <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="cry7.~SNodeTreeNode%dgetSNode()%cjetbrains%dmps%dsmodel%dSNode" resolveInfo="getSNode" />
                        </node>
                      </node>
                      <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="3548249452606133153">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="3548249452606133178" resolveInfo="result" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="condition" roleId="yvor.1068580123160:3" type="yvor.InstanceOfExpression" typeId="yvor.1081256982272:3" id="3548249452606133154">
                  <node role="classType" roleId="yvor.1081256993305:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="3548249452606133155">
                    <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="cry7.~SNodeTreeNode" resolveInfo="SNodeTreeNode" />
                  </node>
                  <node role="leftExpression" roleId="yvor.1081256993304:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="3548249452606133156">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="3548249452606133129" resolveInfo="selection" />
                  </node>
                </node>
                <node role="elsifClauses" roleId="yvor.1206060520071:3" type="yvor.ElsifClause" typeId="yvor.1206060495898:3" id="3548249452606133157">
                  <node role="condition" roleId="yvor.1206060619838:3" type="yvor.InstanceOfExpression" typeId="yvor.1081256982272:3" id="3548249452606133158">
                    <node role="classType" roleId="yvor.1081256993305:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="3548249452606133159">
                      <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="cry7.~SModelTreeNode" resolveInfo="SModelTreeNode" />
                    </node>
                    <node role="leftExpression" roleId="yvor.1081256993304:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="3548249452606133160">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="3548249452606133129" resolveInfo="selection" />
                    </node>
                  </node>
                  <node role="statementList" roleId="yvor.1206060644605:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="3548249452606133161">
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="3548249452606133162">
                      <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="3548249452606133163">
                        <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="3548249452606133164">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="3548249452606133178" resolveInfo="result" />
                        </node>
                        <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3548249452606133165">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3548249452606133166">
                            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParenthesizedExpression" typeId="yvor.1079359253375:3" id="3548249452606133167">
                              <node role="expression" roleId="yvor.1079359253376:3" type="yvor.CastExpression" typeId="yvor.1070534934090:3" id="3548249452606133168">
                                <node role="expression" roleId="yvor.1070534934092:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="3548249452606133169">
                                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="3548249452606133129" resolveInfo="selection" />
                                </node>
                                <node role="type" roleId="yvor.1070534934091:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="3548249452606133170">
                                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="cry7.~SModelTreeNode" resolveInfo="SModelTreeNode" />
                                </node>
                              </node>
                            </node>
                            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="3548249452606133171">
                              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="cry7.~SModelTreeNode%dgetSModel()%cjetbrains%dmps%dsmodel%dSModel" resolveInfo="getSModel" />
                            </node>
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="3548249452606133172">
                            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SModel%dgetModelDescriptor()%cjetbrains%dmps%dsmodel%dSModelDescriptor" resolveInfo="getModelDescriptor" />
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
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="3548249452606133174">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="3548249452606133181">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="3548249452606133178" resolveInfo="result" />
          </node>
        </node>
      </node>
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="7012097027058891186" />
    </node>
    <node role="field" roleId="yvor.1068390468199:3" type="yvor.FieldDeclaration" typeId="yvor.1068390468200:3" id="4284078376668155142">
      <property name="name" nameId="yvnu.1169194664001:0" value="myTree" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="4284078376668155143" />
      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="4284078376668155144">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="tkc7.~ProjectTree" resolveInfo="ProjectTree" />
      </node>
    </node>
    <node role="field" roleId="yvor.1068390468199:3" type="yvor.FieldDeclaration" typeId="yvor.1068390468200:3" id="2270577049313323323">
      <property name="name" nameId="yvnu.1169194664001:0" value="myHelper" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="2270577049313323324" />
      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="2270577049313323326">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="tkc7.~ProjectTreeFindHelper" resolveInfo="ProjectTreeFindHelper" />
      </node>
      <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="2270577049313323328">
        <node role="creator" roleId="yvor.1145553007750:3" type="yvor.AnonymousClassCreator" typeId="yvor.1182160077978:3" id="2270577049313342664">
          <node role="cls" roleId="yvor.1182160096073:3" type="yvor.AnonymousClass" typeId="yvor.1170345865475:3" id="2270577049313342665">
            <property name="nonStatic" nameId="yvor.521412098689998745:3" value="true" />
            <link role="classifier" roleId="yvor.1170346070688:3" targetNodeId="tkc7.~ProjectTreeFindHelper" resolveInfo="ProjectTreeFindHelper" />
            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="tkc7.~ProjectTreeFindHelper%d&lt;init&gt;()" resolveInfo="ProjectTreeFindHelper" />
            <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="2270577049313342666" />
            <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="2270577049313342667">
              <property name="isAbstract" nameId="yvor.1178608670077:3" value="false" />
              <property name="name" nameId="yvnu.1169194664001:0" value="getTree" />
              <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.ProtectedVisibility" typeId="yvor.1146644641414:3" id="2270577049313342668" />
              <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="2270577049313344475">
                <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="tkc7.~ProjectTree" resolveInfo="ProjectTree" />
              </node>
              <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="2270577049313342670">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="2270577049313342679">
                  <node role="expression" roleId="yvor.1068581517676:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2270577049313342681">
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="2270577049313342682">
                      <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="4284078376668155142" resolveInfo="myTree" />
                    </node>
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="2270577049313342683">
                      <link role="classConcept" roleId="yvor.1182955020723:3" targetNodeId="7012097027058828343" resolveInfo="ModelOrNodeChooser" />
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
</model>

