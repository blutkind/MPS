<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:00000000-0000-4000-0000-011c89590291(jetbrains.mps.lang.structure.scripts)">
  <persistence version="7" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="7866978e-a0f0-4cc7-81bc-4d213d9375e1(jetbrains.mps.lang.smodel)" />
  <language namespace="3ecd7c84-cde3-45de-886c-135ecc69b742(jetbrains.mps.lang.refactoring)" />
  <language namespace="83888646-71ce-4f1c-9c53-c54016f6ad4f(jetbrains.mps.baseLanguage.collections)" />
  <language namespace="0eddeefa-c2d6-4437-bc2c-de50fd4ce470(jetbrains.mps.lang.script)" />
  <language namespace="fd392034-7849-419d-9071-12563d152375(jetbrains.mps.baseLanguage.closures)" />
  <import index="yvnr" modelUID="r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.lang.structure.structure)" version="0" />
  <import index="yvnu" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" />
  <import index="vhgx" modelUID="f:java_stub#java.lang(java.lang@java_stub)" version="-1" />
  <import index="8n6q" modelUID="f:java_stub#jetbrains.mps.smodel(jetbrains.mps.smodel@java_stub)" version="-1" />
  <import index="yvnx" modelUID="r:00000000-0000-4000-0000-011c89590287(jetbrains.mps.lang.core.scripts)" version="-1" />
  <import index="txlh" modelUID="f:java_stub#jetbrains.mps.project(jetbrains.mps.project@java_stub)" version="-1" />
  <import index="yvnl" modelUID="r:00000000-0000-4000-0000-011c8959029e(jetbrains.mps.lang.editor.structure)" version="32" />
  <import index="yvig" modelUID="r:00000000-0000-4000-0000-011c8959030d(jetbrains.mps.lang.constraints.structure)" version="8" />
  <import index="1alo" modelUID="f:java_stub#jetbrains.mps.ide.findusages.model(jetbrains.mps.ide.findusages.model@java_stub)" version="-1" />
  <import index="bjpd" modelUID="f:java_stub#jetbrains.mps.refactoring.framework(jetbrains.mps.refactoring.framework@java_stub)" version="-1" />
  <import index="yvnt" modelUID="r:00000000-0000-4000-0000-011c8959028e(jetbrains.mps.lang.structure.findUsages)" version="-1" />
  <import index="2rzm" modelUID="r:3270011d-8b2d-4938-8dff-d256a759e017(jetbrains.mps.lang.behavior.structure)" version="-1" />
  <import index="yvjk" modelUID="r:00000000-0000-4000-0000-011c8959037d(jetbrains.mps.lang.dataFlow.structure)" version="0" />
  <import index="6eoo" modelUID="f:java_stub#jetbrains.mps.util(jetbrains.mps.util@java_stub)" version="-1" />
  <import index="yvor" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" implicit="yes" />
  <import index="yvim" modelUID="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.lang.smodel.structure)" version="16" implicit="yes" />
  <import index="yvix" modelUID="r:00000000-0000-4000-0000-011c8959032e(jetbrains.mps.baseLanguage.collections.structure)" version="7" implicit="yes" />
  <import index="yviq" modelUID="r:00000000-0000-4000-0000-011c89590338(jetbrains.mps.baseLanguage.closures.structure)" version="3" implicit="yes" />
  <import index="yvia" modelUID="r:00000000-0000-4000-0000-011c89590319(jetbrains.mps.lang.refactoring.structure)" version="1" implicit="yes" />
  <import index="yvj3" modelUID="r:00000000-0000-4000-0000-011c89590323(jetbrains.mps.lang.script.structure)" version="0" implicit="yes" />
  <import index="yvnv" modelUID="r:00000000-0000-4000-0000-011c8959028b(jetbrains.mps.lang.structure.behavior)" version="-1" implicit="yes" />
  <import index="yvnq" modelUID="r:00000000-0000-4000-0000-011c89590291(jetbrains.mps.lang.structure.scripts)" version="-1" implicit="yes" />
  <roots>
    <node type="yvia.OldRefactoring" typeId="yvia.1189693812263:1" id="1198085953023">
      <property name="name" nameId="yvnu.1169194664001:0" value="RenameConcept" />
      <property name="userFriendlyName" nameId="yvia.1191237830649:1" value="Rename Concept" />
      <property name="oneTargetOnly" nameId="yvia.700745782152514628:1" value="true" />
      <link role="applicableConcept" roleId="yvia.1199455371376:1" targetNodeId="yvnr.1169125787135:0" resolveInfo="AbstractConceptDeclaration" />
      <link role="overrides" roleId="yvia.1199455378190:1" targetNodeId="yvnx.1199457919461" resolveInfo="Rename" />
    </node>
    <node type="yvia.OldRefactoring" typeId="yvia.1189693812263:1" id="1198173570106">
      <property name="name" nameId="yvnu.1169194664001:0" value="MoveConcepts" />
      <property name="userFriendlyName" nameId="yvia.1191237830649:1" value="Move Concepts" />
      <link role="applicableConcept" roleId="yvia.1199455371376:1" targetNodeId="yvnr.1169125787135:0" resolveInfo="AbstractConceptDeclaration" />
      <link role="overrides" roleId="yvia.1199455378190:1" targetNodeId="yvnx.1198076144993" resolveInfo="MoveNodes" />
    </node>
    <node type="yvia.OldRefactoring" typeId="yvia.1189693812263:1" id="1198587937318">
      <property name="userFriendlyName" nameId="yvia.1191237830649:1" value="Rename Link" />
      <property name="oneTargetOnly" nameId="yvia.700745782152514628:1" value="true" />
      <property name="name" nameId="yvnu.1169194664001:0" value="RenameLink" />
      <link role="applicableConcept" roleId="yvia.1199455371376:1" targetNodeId="yvnr.1071489288298:0" resolveInfo="LinkDeclaration" />
      <link role="overrides" roleId="yvia.1199455378190:1" targetNodeId="yvnx.1199457919461" resolveInfo="Rename" />
    </node>
    <node type="yvia.OldRefactoring" typeId="yvia.1189693812263:1" id="1198592945615">
      <property name="name" nameId="yvnu.1169194664001:0" value="MoveLinkUp" />
      <property name="userFriendlyName" nameId="yvia.1191237830649:1" value="Move Link Up" />
      <property name="oneTargetOnly" nameId="yvia.700745782152514628:1" value="true" />
      <link role="applicableConcept" roleId="yvia.1199455371376:1" targetNodeId="yvnr.1071489288298:0" resolveInfo="LinkDeclaration" />
      <link role="overrides" roleId="yvia.1199455378190:1" targetNodeId="yvnx.1198076144993" resolveInfo="MoveNodes" />
    </node>
    <node type="yvia.OldRefactoring" typeId="yvia.1189693812263:1" id="1198764756152">
      <property name="name" nameId="yvnu.1169194664001:0" value="RenameProperty" />
      <property name="userFriendlyName" nameId="yvia.1191237830649:1" value="Rename Property" />
      <property name="oneTargetOnly" nameId="yvia.700745782152514628:1" value="true" />
      <link role="applicableConcept" roleId="yvia.1199455371376:1" targetNodeId="yvnr.1071489288299:0" resolveInfo="PropertyDeclaration" />
      <link role="overrides" roleId="yvia.1199455378190:1" targetNodeId="yvnx.1199457919461" resolveInfo="Rename" />
    </node>
    <node type="yvia.OldRefactoring" typeId="yvia.1189693812263:1" id="1198776916667">
      <property name="name" nameId="yvnu.1169194664001:0" value="MovePropertyUp" />
      <property name="userFriendlyName" nameId="yvia.1191237830649:1" value="Move Property Up" />
      <property name="oneTargetOnly" nameId="yvia.700745782152514628:1" value="true" />
      <link role="applicableConcept" roleId="yvia.1199455371376:1" targetNodeId="yvnr.1071489288299:0" resolveInfo="PropertyDeclaration" />
      <link role="overrides" roleId="yvia.1199455378190:1" targetNodeId="yvnx.1198076144993" resolveInfo="MoveNodes" />
    </node>
    <node type="yvia.OldRefactoring" typeId="yvia.1189693812263:1" id="1201019507868">
      <property name="name" nameId="yvnu.1169194664001:0" value="SafeDeleteConcept" />
      <property name="userFriendlyName" nameId="yvia.1191237830649:1" value="Safe Delete Concept" />
      <property name="refactorImmediatelyIfNoUsages" nameId="yvia.1210941394948:1" value="true" />
      <property name="oneTargetOnly" nameId="yvia.700745782152514628:1" value="true" />
      <link role="overrides" roleId="yvia.1199455378190:1" targetNodeId="yvnx.1200665013408" resolveInfo="SafeDelete" />
      <link role="applicableConcept" roleId="yvia.1199455371376:1" targetNodeId="yvnr.1169125787135:0" resolveInfo="AbstractConceptDeclaration" />
    </node>
    <node type="yvia.OldRefactoring" typeId="yvia.1189693812263:1" id="1201283571431">
      <property name="name" nameId="yvnu.1169194664001:0" value="SafeDeleteLink" />
      <property name="userFriendlyName" nameId="yvia.1191237830649:1" value="Safe Delete Link" />
      <property name="refactorImmediatelyIfNoUsages" nameId="yvia.1210941394948:1" value="true" />
      <property name="oneTargetOnly" nameId="yvia.700745782152514628:1" value="true" />
      <link role="applicableConcept" roleId="yvia.1199455371376:1" targetNodeId="yvnr.1071489288298:0" resolveInfo="LinkDeclaration" />
      <link role="overrides" roleId="yvia.1199455378190:1" targetNodeId="yvnx.1200665013408" resolveInfo="SafeDelete" />
    </node>
    <node type="yvj3.MigrationScript" typeId="yvj3.1177457067821:0" id="4975090607137555731">
      <property name="name" nameId="yvnu.1169194664001:0" value="CheckRootNodesNamingInternalPolicy" />
      <property name="title" nameId="yvj3.1177457669450:0" value="Check Root Concepts' Internal Naming Policy" />
    </node>
    <node type="yvor.ClassConcept" typeId="yvor.1068390468198:3" id="5800912818421828062">
      <property name="name" nameId="yvnu.1169194664001:0" value="RefUtil" />
    </node>
  </roots>
  <root id="1198085953023">
    <node role="arguments" roleId="yvia.1189693888592:1" type="yvia.RequiredUserEnteredArgument" typeId="yvia.1192792808079:1" id="1198086090026">
      <property name="name" nameId="yvnu.1169194664001:0" value="newName" />
      <property name="presentation" nameId="yvia.6895093993902236769:1" value="new concept name" />
      <node role="argumentType" roleId="yvia.1190637130098:1" type="yvor.StringType" typeId="yvor.1225271177708:3" id="4853609160933269618" />
      <node role="initialValue" roleId="yvia.1198599595536:1" type="yvia.InitialValueClause" typeId="yvia.1198599668934:1" id="1198600921522">
        <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198600921523">
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6528618226609779068">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6528618226609779069">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvia.NodeExpression" typeId="yvia.1215000036307:1" id="6528618226609779070" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="6528618226609779071">
                <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvnu.1169194664001:0" resolveInfo="name" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="doRefactorClause" roleId="yvia.1189695170518:1" type="yvia.DoRefactorClause" typeId="yvia.1189694053795:1" id="1198086296187">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198086296188">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvia.ChangeFeatureNameOperation" typeId="yvia.1197386846879:1" id="1198088569528">
          <node role="feature" roleId="yvia.1197386861552:1" type="yvia.NodeExpression" typeId="yvia.1215000036307:1" id="6528618226609613260" />
          <node role="newConceptFQName" roleId="yvia.1197386874459:1" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1198088914632">
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvia.RequiredAdditionalArgumentReference" typeId="yvia.1189694084608:1" id="1198088918369">
              <link role="argument" roleId="yvia.1189694099406:1" targetNodeId="1198086090026" resolveInfo="newName" />
            </node>
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1198088899284">
              <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204740202056">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvim.SemanticDowncastExpression" typeId="yvim.1145404486709:16" id="1198088891904">
                  <node role="leftExpression" roleId="yvim.1145404616321:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1203721648003">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvia.NodeExpression" typeId="yvia.1215000036307:1" id="6528618226609613259" />
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_GetModelOperation" typeId="yvim.1143234257716:16" id="1198088888087" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1222093465422">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SModel%dgetSModelFqName()%cjetbrains%dmps%dsmodel%dSModelFqName" resolveInfo="getSModelFqName" />
                </node>
              </node>
              <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1198088910896">
                <property name="value" nameId="yvor.1070475926801:3" value="." />
              </node>
            </node>
          </node>
          <node role="newFeatureName" roleId="yvia.1197386900758:1" type="yvia.RequiredAdditionalArgumentReference" typeId="yvia.1189694084608:1" id="1198160247532">
            <link role="argument" roleId="yvia.1189694099406:1" targetNodeId="1198086090026" resolveInfo="newName" />
          </node>
        </node>
      </node>
    </node>
    <node role="getModelsToGenerateClause" roleId="yvia.1191591935289:1" type="yvia.GetModelsToGenerateClause" typeId="yvia.1191591349007:1" id="1198086566333">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198086566334">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1240394867786">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1240394867787">
            <property name="name" nameId="yvnu.1169194664001:0" value="result" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.MapType" typeId="yvix.1197683403723:7" id="1240394867788">
              <node role="keyType" roleId="yvix.1197683466920:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1240394867789">
                <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="txlh.~IModule" resolveInfo="IModule" />
              </node>
              <node role="valueType" roleId="yvix.1197683475734:7" type="yvix.ListType" typeId="yvix.1151688443754:7" id="1240394867790">
                <node role="elementType" roleId="yvix.1151688676805:7" type="yvim.SModelType" typeId="yvim.1143226024141:16" id="1240394867791" />
              </node>
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1240397342357">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvix.LinkedHashMapCreator" typeId="yvix.1240216724530:7" id="1240397342358">
                <node role="keyType" roleId="yvix.1197687026896:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1240397342359">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="txlh.~IModule" resolveInfo="IModule" />
                </node>
                <node role="valueType" roleId="yvix.1197687035757:7" type="yvix.ListType" typeId="yvix.1151688443754:7" id="1240397342360">
                  <node role="elementType" roleId="yvix.1151688676805:7" type="yvim.SModelType" typeId="yvim.1143226024141:16" id="1240397342361" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1240394867797">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1240394867798">
            <property name="name" nameId="yvnu.1169194664001:0" value="sourceLanguage" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1240394867799">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8n6q.~Language" resolveInfo="Language" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1240394867800">
              <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="8n6q.~Language" resolveInfo="Language" />
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~Language%dgetLanguageFor(jetbrains%dmps%dsmodel%dSModelDescriptor)%cjetbrains%dmps%dsmodel%dLanguage" resolveInfo="getLanguageFor" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240394867801">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvim.SemanticDowncastExpression" typeId="yvim.1145404486709:16" id="1240394867802">
                  <node role="leftExpression" roleId="yvim.1145404616321:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240394867803">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvia.NodeExpression" typeId="yvia.1215000036307:1" id="1240394890482" />
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_GetModelOperation" typeId="yvim.1143234257716:16" id="1240394867805" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1240394867806">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SModel%dgetModelDescriptor()%cjetbrains%dmps%dsmodel%dSModelDescriptor" resolveInfo="getModelDescriptor" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1240475863182">
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1240475863183">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1240926401388">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240926403593">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1240926401389">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1240394867787" resolveInfo="result" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvix.PutAllOperation" typeId="yvix.1240906768633:7" id="1240926404821">
                  <node role="map" roleId="yvix.1240906921264:7" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1240926408229">
                    <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="bjpd.~RefactoringUtil" resolveInfo="RefactoringUtil" />
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="bjpd.~RefactoringUtil%dgetLanguageAndItsExtendingLanguageModels(jetbrains%dmps%dproject%dMPSProject,jetbrains%dmps%dsmodel%dLanguage)%cjava%dutil%dMap" resolveInfo="getLanguageAndItsExtendingLanguageModels" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvia.ProjectExpression" typeId="yvia.1215084496797:1" id="1240926408230" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1240926408231">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1240394867798" resolveInfo="sourceLanguage" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotEqualsExpression" typeId="yvor.1073239437375:3" id="1240475864968">
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1240475865674" />
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1240475864389">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1240394867798" resolveInfo="sourceLanguage" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="6528618226609613262">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6528618226609613264">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1240394867787" resolveInfo="result" />
          </node>
        </node>
      </node>
    </node>
    <node role="updateModelClause" roleId="yvia.1189695176456:1" type="yvia.UpdateModelClause" typeId="yvia.1189694434958:1" id="1198088938918">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198088938919">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvia.UpdateModelByDefaultOperation" typeId="yvia.1197382578687:1" id="1198088940952" />
      </node>
    </node>
    <node role="affectedNodesClause" roleId="yvia.1200932683928:1" type="yvia.AffectedNodesClause" typeId="yvia.1200932465350:1" id="1201531772166">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1201531772167">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6528618226609613322">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvia.ExecuteFindersExpression" typeId="yvia.1212242396240:1" id="6528618226609613323">
            <node role="finders" roleId="yvia.1212242658590:1" type="yvia.FinderReference" typeId="yvia.1212242507771:1" id="6528618226609613324">
              <link role="finderDeclaration" roleId="yvia.1212242603178:1" targetNodeId="yvnt.1197632773078" resolveInfo="ConceptInstances" />
            </node>
            <node role="finders" roleId="yvia.1212242658590:1" type="yvia.FinderReference" typeId="yvia.1212242507771:1" id="6528618226609613325">
              <link role="finderDeclaration" roleId="yvia.1212242603178:1" targetNodeId="yvnt.1198430852441" resolveInfo="NodeAndDescendantsUsages" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </root>
  <root id="1198173570106">
    <node role="arguments" roleId="yvia.1189693888592:1" type="yvia.RequiredUserEnteredArgument" typeId="yvia.1192792808079:1" id="1198173589717">
      <property name="name" nameId="yvnu.1169194664001:0" value="targetModel" />
      <property name="presentation" nameId="yvia.6895093993902236769:1" value="choose target model" />
      <node role="argumentType" roleId="yvia.1190637130098:1" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1198679961031">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8n6q.~SModelDescriptor" resolveInfo="SModelDescriptor" />
      </node>
      <node role="filterClause" roleId="yvia.1192793165066:1" type="yvia.FilterArgumentClause" typeId="yvia.1192793302394:1" id="1198678051360">
        <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198678051361">
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1198678065703">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.EqualsExpression" typeId="yvor.1068580123152:3" id="1198678077591">
              <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.EnumConstantReference" typeId="yvor.1083260308424:3" id="1198678108424">
                <link role="enumConstantDeclaration" roleId="yvor.1083260308426:3" targetNodeId="8n6q.~LanguageAspect%dSTRUCTURE" resolveInfo="STRUCTURE" />
                <link role="enumClass" roleId="yvor.1144432896254:3" targetNodeId="8n6q.~LanguageAspect" resolveInfo="LanguageAspect" />
              </node>
              <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1198678071138">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~Language%dgetModelAspect(jetbrains%dmps%dsmodel%dSModelDescriptor)%cjetbrains%dmps%dsmodel%dLanguageAspect" resolveInfo="getModelAspect" />
                <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="8n6q.~Language" resolveInfo="Language" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvia.ConceptFunctionParameter_UserArgument" typeId="yvia.1192793411861:1" id="1198678074192" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="isApplicableClause" roleId="yvia.1189695159409:1" type="yvia.IsApplicableClause" typeId="yvia.1189694022607:1" id="1198173639186">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198173639187">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1239348814467">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1239348814468">
            <property name="name" nameId="yvnu.1169194664001:0" value="model" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SModelType" typeId="yvim.1143226024141:16" id="1239348814469" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1239348814470">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1239348814471">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvia.NodesExpression" typeId="yvia.1214999715318:1" id="1239348814472" />
                <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetFirstOperation" typeId="yvix.1165525191778:7" id="1239348814473" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_GetModelOperation" typeId="yvim.1143234257716:16" id="1239348814474" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ForeachStatement" typeId="yvor.1144226303539:3" id="1198173673729">
          <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198173673730">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1198173749184">
              <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198173749185">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1198173749186">
                  <node role="expression" roleId="yvor.1068581517676:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="1198173790233">
                    <property name="value" nameId="yvor.1068580123138:3" value="false" />
                  </node>
                </node>
              </node>
              <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotExpression" typeId="yvor.1081516740877:3" id="1198173762977">
                <node role="expression" roleId="yvor.1081516765348:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1203721648210">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198173762979">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198173673733" resolveInfo="node" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_IsInstanceOfOperation" typeId="yvim.1139621453865:16" id="1198173762980">
                    <node role="conceptArgument" roleId="yvim.1177027386292:16" type="yvim.RefConcept_Reference" typeId="yvim.1177026924588:16" id="1198173774623">
                      <link role="conceptDeclaration" roleId="yvim.1177026940964:16" targetNodeId="yvnr.1169125787135:0" resolveInfo="AbstractConceptDeclaration" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1239348832666">
              <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1239348832667">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1239348852758">
                  <node role="expression" roleId="yvor.1068581517676:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="1239348855682">
                    <property name="value" nameId="yvor.1068580123138:3" value="false" />
                  </node>
                </node>
              </node>
              <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotEqualsExpression" typeId="yvor.1073239437375:3" id="1239348844488">
                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1239348850710">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1239348814468" resolveInfo="model" />
                </node>
                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1239348841733">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1239348840795">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198173673733" resolveInfo="node" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_GetModelOperation" typeId="yvim.1143234257716:16" id="1239348843065" />
                </node>
              </node>
            </node>
          </node>
          <node role="iterable" roleId="yvor.1144226360166:3" type="yvia.NodesExpression" typeId="yvia.1214999715318:1" id="1239348785995" />
          <node role="variable" roleId="yvor.1144230900587:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1198173673733">
            <property name="name" nameId="yvnu.1169194664001:0" value="node" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1198173701416" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1198173793564">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="1198173795550">
            <property name="value" nameId="yvor.1068580123138:3" value="true" />
          </node>
        </node>
      </node>
    </node>
    <node role="doRefactorClause" roleId="yvia.1189695170518:1" type="yvia.DoRefactorClause" typeId="yvia.1189694053795:1" id="1198173798786">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198173798787">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1198173821007">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1198173821008">
            <property name="name" nameId="yvnu.1169194664001:0" value="nodes" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="1198173821009">
              <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvnr.1169125787135:0" resolveInfo="AbstractConceptDeclaration" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.CastExpression" typeId="yvor.1070534934090:3" id="1198174090060">
              <node role="type" roleId="yvor.1070534934091:3" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="1198174090061">
                <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvnr.1169125787135:0" resolveInfo="AbstractConceptDeclaration" />
              </node>
              <node role="expression" roleId="yvor.1070534934092:3" type="yvia.NodesExpression" typeId="yvia.1214999715318:1" id="1215002621336" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1198174267448">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1198174268934">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204740201904">
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1204740201905">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SModel%dgetModelDescriptor()%cjetbrains%dmps%dsmodel%dSModelDescriptor" resolveInfo="getModelDescriptor" />
              </node>
              <node role="operand" roleId="yvor.1197027771414:3" type="yvim.SemanticDowncastExpression" typeId="yvim.1145404486709:16" id="1239348986674">
                <node role="leftExpression" roleId="yvim.1145404616321:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1239348981435">
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_GetModelOperation" typeId="yvim.1143234257716:16" id="1239348983751" />
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1239349016565">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvia.NodesExpression" typeId="yvia.1214999715318:1" id="1239349015283" />
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetFirstOperation" typeId="yvix.1165525191778:7" id="1239349018053" />
                  </node>
                </node>
              </node>
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvia.RequiredAdditionalArgumentReference" typeId="yvia.1189694084608:1" id="1198176984526">
              <link role="argument" roleId="yvia.1189694099406:1" targetNodeId="1198174225279" resolveInfo="sourceModel" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1198521027977">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1198521027978">
            <property name="name" nameId="yvnu.1169194664001:0" value="sourceLanguage" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1198521027979">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8n6q.~Language" resolveInfo="Language" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1198521027980">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~Language%dgetLanguageFor(jetbrains%dmps%dsmodel%dSModelDescriptor)%cjetbrains%dmps%dsmodel%dLanguage" resolveInfo="getLanguageFor" />
              <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="8n6q.~Language" resolveInfo="Language" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvia.RequiredAdditionalArgumentReference" typeId="yvia.1189694084608:1" id="1198521027983">
                <link role="argument" roleId="yvia.1189694099406:1" targetNodeId="1198174225279" resolveInfo="sourceModel" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1198521036392">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1198521036393">
            <property name="name" nameId="yvnu.1169194664001:0" value="targetLanguage" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1198521036394">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8n6q.~Language" resolveInfo="Language" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1198521036395">
              <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="8n6q.~Language" resolveInfo="Language" />
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~Language%dgetLanguageFor(jetbrains%dmps%dsmodel%dSModelDescriptor)%cjetbrains%dmps%dsmodel%dLanguage" resolveInfo="getLanguageFor" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvia.RequiredAdditionalArgumentReference" typeId="yvia.1189694084608:1" id="1198521036398">
                <link role="argument" roleId="yvia.1189694099406:1" targetNodeId="1198173589717" resolveInfo="targetModel" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1198523058146">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1198523058147">
            <property name="name" nameId="yvnu.1169194664001:0" value="editors" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="1198523058148">
              <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvnl.1071666914219:32" resolveInfo="ConceptEditorDeclaration" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1198523058149">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvim.SNodeListCreator" typeId="yvim.1145567426890:16" id="1198523058150">
                <node role="createdType" roleId="yvim.1145567471833:16" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="1198523058151">
                  <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvnl.1071666914219:32" resolveInfo="ConceptEditorDeclaration" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1198523085614">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1198523085615">
            <property name="name" nameId="yvnu.1169194664001:0" value="behaviors" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="1198523085616">
              <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="2rzm.1225194240794" resolveInfo="ConceptBehavior" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1198523085617">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvim.SNodeListCreator" typeId="yvim.1145567426890:16" id="1198523085618">
                <node role="createdType" roleId="yvim.1145567471833:16" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="1198523085619">
                  <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="2rzm.1225194240794" resolveInfo="ConceptBehavior" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1224506462989">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1224506462990">
            <property name="name" nameId="yvnu.1169194664001:0" value="constraints" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="1224506462991">
              <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvig.1213093968558:8" resolveInfo="ConceptConstraints" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1224506462992">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvim.SNodeListCreator" typeId="yvim.1145567426890:16" id="1224506462993">
                <node role="createdType" roleId="yvim.1145567471833:16" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="1224506462994">
                  <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvig.1213093968558:8" resolveInfo="ConceptConstraints" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1225273023774">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1225273023775">
            <property name="name" nameId="yvnu.1169194664001:0" value="dataFlows" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="1225273023776">
              <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvjk.1206442055221:0" resolveInfo="DataFlowBuilderDeclaration" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1225273023777">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvim.SNodeListCreator" typeId="yvim.1145567426890:16" id="1225273023778">
                <node role="createdType" roleId="yvim.1145567471833:16" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="1225273023779">
                  <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvjk.1206442055221:0" resolveInfo="DataFlowBuilderDeclaration" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.SingleLineComment" typeId="yvor.6329021646629104954:3" id="7376433222636453793">
          <node role="commentPart" roleId="yvor.6329021646629175155:3" type="yvor.TextCommentPart" typeId="yvor.6329021646629104957:3" id="7376433222636453794">
            <property name="text" nameId="yvor.6329021646629104958:3" value="collecting editors:" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1198521700205">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1198521700206">
            <property name="name" nameId="yvnu.1169194664001:0" value="editorModelDescriptor" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1198521700207">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8n6q.~SModelDescriptor" resolveInfo="SModelDescriptor" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204740201643">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198521700209">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198521027978" resolveInfo="sourceLanguage" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1204740201644">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~Language%dgetEditorModelDescriptor()%cjetbrains%dmps%dsmodel%ddescriptor%dEditableSModelDescriptor" resolveInfo="getEditorModelDescriptor" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1198521711727">
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198521711728">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ForeachStatement" typeId="yvor.1144226303539:3" id="1198521724545">
              <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198521724546">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="6409339300305624927">
                  <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="6409339300305624928">
                    <property name="name" nameId="yvnu.1169194664001:0" value="editor" />
                    <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="6409339300305624934">
                      <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvnl.1071666914219:32" resolveInfo="ConceptEditorDeclaration" />
                    </node>
                    <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8941943470987481085">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8941943470987481086">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198521724577" resolveInfo="node" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ConceptMethodCall" typeId="yvim.1179409122411:16" id="8941943470987481087">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvnv.8360039740498069412" resolveInfo="findConceptAspect" />
                        <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8941943470987481088">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8941943470987481089">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198521700206" resolveInfo="editorModelDescriptor" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8941943470987481090">
                            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SModelDescriptor%dgetSModel()%cjetbrains%dmps%dsmodel%dSModel" resolveInfo="getSModel" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="6409339300305624935">
                  <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="6409339300305624936">
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6409339300305624937">
                      <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6409339300305624938">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6409339300305624939">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198523058147" resolveInfo="editors" />
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddElementOperation" typeId="yvix.1160612413312:7" id="6409339300305624940">
                          <node role="argument" roleId="yvix.1160612519549:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6409339300305624941">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6409339300305624928" resolveInfo="editor" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotEqualsExpression" typeId="yvor.1073239437375:3" id="6409339300305624942">
                    <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="6409339300305624943" />
                    <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6409339300305624944">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="6409339300305624928" resolveInfo="editor" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="iterable" roleId="yvor.1144226360166:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198521724576">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198173821008" resolveInfo="nodes" />
              </node>
              <node role="variable" roleId="yvor.1144230900587:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1198521724577">
                <property name="name" nameId="yvnu.1169194664001:0" value="node" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1198521724578">
                  <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvnr.1169125787135:0" resolveInfo="AbstractConceptDeclaration" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotEqualsExpression" typeId="yvor.1073239437375:3" id="1198521719204">
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1198521723160" />
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198521717999">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198521700206" resolveInfo="editorModelDescriptor" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.SingleLineComment" typeId="yvor.6329021646629104954:3" id="7376433222636453549">
          <node role="commentPart" roleId="yvor.6329021646629175155:3" type="yvor.TextCommentPart" typeId="yvor.6329021646629104957:3" id="7376433222636453550">
            <property name="text" nameId="yvor.6329021646629104958:3" value="collecting behaviors:" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1198521635840">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1198521635841">
            <property name="name" nameId="yvnu.1169194664001:0" value="behaviorModelDescriptor" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1198521635842">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8n6q.~SModelDescriptor" resolveInfo="SModelDescriptor" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204740202627">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198521635844">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198521027978" resolveInfo="sourceLanguage" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1204740202628">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~Language%dgetBehaviorModelDescriptor()%cjetbrains%dmps%dsmodel%ddescriptor%dEditableSModelDescriptor" resolveInfo="getBehaviorModelDescriptor" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1198521646191">
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198521646192">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ForeachStatement" typeId="yvor.1144226303539:3" id="1198521676522">
              <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198521676523">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1238259466129">
                  <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1238259466130">
                    <property name="name" nameId="yvnu.1169194664001:0" value="behavior" />
                    <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1238259466131">
                      <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="2rzm.1225194240794" resolveInfo="ConceptBehavior" />
                    </node>
                    <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8941943470987481093">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8941943470987481092">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198521676547" resolveInfo="node" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ConceptMethodCall" typeId="yvim.1179409122411:16" id="8941943470987481097">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvnv.8360039740498069412" resolveInfo="findConceptAspect" />
                        <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8941943470987481098">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8941943470987481099">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198521635841" resolveInfo="behaviorModelDescriptor" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8941943470987481100">
                            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SModelDescriptor%dgetSModel()%cjetbrains%dmps%dsmodel%dSModel" resolveInfo="getSModel" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1198521676536">
                  <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198521676537">
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1198521676538">
                      <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1206576384212">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198523181471">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198523085615" resolveInfo="behaviors" />
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddElementOperation" typeId="yvix.1160612413312:7" id="1198521676541">
                          <node role="argument" roleId="yvix.1160612519549:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198521676542">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1238259466130" resolveInfo="behavior" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotEqualsExpression" typeId="yvor.1073239437375:3" id="1199636090078">
                    <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1199636092394" />
                    <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1238259473343">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1238259466130" resolveInfo="behavior" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="iterable" roleId="yvor.1144226360166:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198521676546">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198173821008" resolveInfo="nodes" />
              </node>
              <node role="variable" roleId="yvor.1144230900587:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1198521676547">
                <property name="name" nameId="yvnu.1169194664001:0" value="node" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1198521676548">
                  <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvnr.1169125787135:0" resolveInfo="AbstractConceptDeclaration" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotEqualsExpression" typeId="yvor.1073239437375:3" id="1198521650930">
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1198521663621" />
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198521649320">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198521635841" resolveInfo="constraintsModelDescriptor" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.SingleLineComment" typeId="yvor.6329021646629104954:3" id="7376433222636453637">
          <node role="commentPart" roleId="yvor.6329021646629175155:3" type="yvor.TextCommentPart" typeId="yvor.6329021646629104957:3" id="7376433222636453638">
            <property name="text" nameId="yvor.6329021646629104958:3" value="collecting constraints:" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1224506339400">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1224506339401">
            <property name="name" nameId="yvnu.1169194664001:0" value="constraintsModelDescriptor" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1224506339402">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8n6q.~SModelDescriptor" resolveInfo="SModelDescriptor" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1224506339403">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1224506339404">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198521027978" resolveInfo="sourceLanguage" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1224506366702">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~Language%dgetConstraintsModelDescriptor()%cjetbrains%dmps%dsmodel%ddescriptor%dEditableSModelDescriptor" resolveInfo="getConstraintsModelDescriptor" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1224506339406">
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1224506339407">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ForeachStatement" typeId="yvor.1144226303539:3" id="1224506339408">
              <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1224506339409">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1238259500671">
                  <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1238259500672">
                    <property name="name" nameId="yvnu.1169194664001:0" value="constraint" />
                    <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1238259500673">
                      <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvig.1213093968558:8" resolveInfo="ConceptConstraints" />
                    </node>
                    <node role="initializer" roleId="yvor.1068431790190:3" type="yvim.SNodeTypeCastExpression" typeId="yvim.1140137987495:16" id="8360039740498069597">
                      <link role="concept" roleId="yvim.1140138128738:16" targetNodeId="yvig.1213093968558:8" resolveInfo="ConceptConstraints" />
                      <node role="leftExpression" roleId="yvim.1140138123956:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8941943470987481103">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8941943470987481102">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1224506339439" resolveInfo="node" />
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ConceptMethodCall" typeId="yvim.1179409122411:16" id="8941943470987481107">
                          <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvnv.8360039740498069412" resolveInfo="findConceptAspect" />
                          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8941943470987481108">
                            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8941943470987481109">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1224506339401" resolveInfo="constraintsModelDescriptor" />
                            </node>
                            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8941943470987481110">
                              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SModelDescriptor%dgetSModel()%cjetbrains%dmps%dsmodel%dSModel" resolveInfo="getSModel" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1224506339420">
                  <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1224506339421">
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1224506339430">
                      <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1224506339431">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1224506499094">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1224506462990" resolveInfo="constraints" />
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddElementOperation" typeId="yvix.1160612413312:7" id="1224506339433">
                          <node role="argument" roleId="yvix.1160612519549:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1238259521340">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1238259500672" resolveInfo="constraints" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotEqualsExpression" typeId="yvor.1073239437375:3" id="1224506339435">
                    <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1224506339436" />
                    <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1238259510463">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1238259500672" resolveInfo="constraints" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="iterable" roleId="yvor.1144226360166:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1224506339438">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198173821008" resolveInfo="nodes" />
              </node>
              <node role="variable" roleId="yvor.1144230900587:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1224506339439">
                <property name="name" nameId="yvnu.1169194664001:0" value="node" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1224506339440">
                  <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvnr.1169125787135:0" resolveInfo="AbstractConceptDeclaration" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotEqualsExpression" typeId="yvor.1073239437375:3" id="1224506339441">
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1224506339442" />
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1224506339443">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1224506339401" resolveInfo="behaviorModelDescriptor" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.SingleLineComment" typeId="yvor.6329021646629104954:3" id="7376433222636454173">
          <node role="commentPart" roleId="yvor.6329021646629175155:3" type="yvor.TextCommentPart" typeId="yvor.6329021646629104957:3" id="7376433222636454174">
            <property name="text" nameId="yvor.6329021646629104958:3" value="collecting data flow:" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1225272186218">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1225272186219">
            <property name="name" nameId="yvnu.1169194664001:0" value="dataflowModelDescriptor" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1225272186220">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8n6q.~SModelDescriptor" resolveInfo="SModelDescriptor" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1225272186221">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1225272186222">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198521027978" resolveInfo="sourceLanguage" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1225272269620">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~Language%dgetDataFlowModelDescriptor()%cjetbrains%dmps%dsmodel%ddescriptor%dEditableSModelDescriptor" resolveInfo="getDataFlowModelDescriptor" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1225272186224">
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1225272186225">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ForeachStatement" typeId="yvor.1144226303539:3" id="1225272186226">
              <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1225272186227">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1238259428602">
                  <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1238259428603">
                    <property name="name" nameId="yvnu.1169194664001:0" value="dataFlow" />
                    <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1238259428604">
                      <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvjk.1206442055221:0" resolveInfo="DataFlowBuilderDeclaration" />
                    </node>
                    <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8941943470987481113">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8941943470987481112">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1225272186257" resolveInfo="node" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ConceptMethodCall" typeId="yvim.1179409122411:16" id="8941943470987481117">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvnv.8360039740498069412" resolveInfo="findConceptAspect" />
                        <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8941943470987481118">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8941943470987481119">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1225272186219" resolveInfo="dataflowModelDescriptor" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8941943470987481120">
                            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SModelDescriptor%dgetSModel()%cjetbrains%dmps%dsmodel%dSModel" resolveInfo="getSModel" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1225272186238">
                  <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1225272186239">
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1225272186248">
                      <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1225272186249">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1225273070687">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1225273023775" resolveInfo="dataFlows" />
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddElementOperation" typeId="yvix.1160612413312:7" id="1225272186251">
                          <node role="argument" roleId="yvix.1160612519549:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1238259440302">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1238259428603" resolveInfo="dataFlow" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotEqualsExpression" typeId="yvor.1073239437375:3" id="1225272186253">
                    <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1225272186254" />
                    <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1238259437067">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1238259428603" resolveInfo="dataFlow" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="iterable" roleId="yvor.1144226360166:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1225272186256">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198173821008" resolveInfo="nodes" />
              </node>
              <node role="variable" roleId="yvor.1144230900587:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1225272186257">
                <property name="name" nameId="yvnu.1169194664001:0" value="node" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1225272186258">
                  <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvnr.1169125787135:0" resolveInfo="AbstractConceptDeclaration" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotEqualsExpression" typeId="yvor.1073239437375:3" id="1225272186259">
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1225272186260" />
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1225272186261">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1225272186219" resolveInfo="constraintsModelDescriptor" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.SingleLineComment" typeId="yvor.6329021646629104954:3" id="7376433222636453311">
          <node role="commentPart" roleId="yvor.6329021646629175155:3" type="yvor.TextCommentPart" typeId="yvor.6329021646629104957:3" id="7376433222636453312">
            <property name="text" nameId="yvor.6329021646629104958:3" value="refactoring itself" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ForeachStatement" typeId="yvor.1144226303539:3" id="1198173949294">
          <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198173949295">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvia.ChangeFeatureNameOperation" typeId="yvia.1197386846879:1" id="1198174041135">
              <node role="feature" roleId="yvia.1197386861552:1" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198174045248">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198173949298" resolveInfo="node" />
              </node>
              <node role="newConceptFQName" roleId="yvia.1197386874459:1" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1198174057942">
                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1203721648644">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198174061836">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198173949298" resolveInfo="node" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="1198174100361">
                    <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvnu.1169194664001:0" resolveInfo="name" />
                  </node>
                </node>
                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1198174054407">
                  <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1224074105952">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1224074098187">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7755274343641446065">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvia.RequiredAdditionalArgumentReference" typeId="yvia.1189694084608:1" id="1198174051499">
                          <link role="argument" roleId="yvia.1189694099406:1" targetNodeId="1198173589717" resolveInfo="targetModel" />
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="7755274343641446069">
                          <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SModelDescriptor%dgetSModelReference()%cjetbrains%dmps%dsmodel%dSModelReference" resolveInfo="getSModelReference" />
                        </node>
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1224074105294">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SModelReference%dgetSModelFqName()%cjetbrains%dmps%dsmodel%dSModelFqName" resolveInfo="getSModelFqName" />
                      </node>
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1224074106486">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SModelFqName%dtoString()%cjava%dlang%dString" resolveInfo="toString" />
                    </node>
                  </node>
                  <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1198174055472">
                    <property name="value" nameId="yvor.1070475926801:3" value="." />
                  </node>
                </node>
              </node>
              <node role="newFeatureName" roleId="yvia.1197386900758:1" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1203721648384">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198174143879">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198173949298" resolveInfo="node" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="1198174146539">
                  <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvnu.1169194664001:0" resolveInfo="name" />
                </node>
              </node>
            </node>
          </node>
          <node role="iterable" roleId="yvor.1144226360166:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198174029366">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198173821008" resolveInfo="nodes" />
          </node>
          <node role="variable" roleId="yvor.1144230900587:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1198173949298">
            <property name="name" nameId="yvnu.1169194664001:0" value="node" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1198173960800">
              <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvnr.1169125787135:0" resolveInfo="AbstractConceptDeclaration" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1199622881357">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvia.MoveNodesToModelExpression" typeId="yvia.1199620728600:1" id="1199622881359">
            <node role="whatToMove" roleId="yvia.1199619459778:1" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198173924290">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198173821008" resolveInfo="nodes" />
            </node>
            <node role="destination" roleId="yvia.1199619459779:1" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204740201625">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvia.RequiredAdditionalArgumentReference" typeId="yvia.1189694084608:1" id="1198173929119">
                <link role="argument" roleId="yvia.1189694099406:1" targetNodeId="1198173589717" resolveInfo="targetModel" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1204740201626">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SModelDescriptor%dgetSModel()%cjetbrains%dmps%dsmodel%dSModel" resolveInfo="getSModel" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1198523148210">
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198523148211">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvia.UpdateModelProcedure" typeId="yvia.1198577376375:1" id="1470666820232676970">
              <node role="argument" roleId="yvia.1198577431631:1" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1470666820232676973">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1470666820232676972">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198521700206" resolveInfo="editorModelDescriptor" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1470666820232677353">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SModelDescriptor%dgetSModel()%cjetbrains%dmps%dsmodel%dSModel" resolveInfo="getSModel" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1198523148212">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1198523148213">
                <property name="name" nameId="yvnu.1169194664001:0" value="targetEditorModelDescriptor" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1198523148214">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8n6q.~SModelDescriptor" resolveInfo="SModelDescriptor" />
                </node>
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204740202466">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198523148216">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198521036393" resolveInfo="targetLanguage" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1204740202467">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~Language%dgetEditorModelDescriptor()%cjetbrains%dmps%dsmodel%ddescriptor%dEditableSModelDescriptor" resolveInfo="getEditorModelDescriptor" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1198523148217">
              <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198523148218">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1198523148219">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1198523148220">
                    <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204740202419">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.EnumConstantReference" typeId="yvor.1083260308424:3" id="1202935679374">
                        <link role="enumConstantDeclaration" roleId="yvor.1083260308426:3" targetNodeId="8n6q.~LanguageAspect%dEDITOR" resolveInfo="EDITOR" />
                        <link role="enumClass" roleId="yvor.1144432896254:3" targetNodeId="8n6q.~LanguageAspect" resolveInfo="LanguageAspect" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1204740202420">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~LanguageAspect%dcreateNew(jetbrains%dmps%dsmodel%dLanguage)%cjetbrains%dmps%dsmodel%dSModelDescriptor" resolveInfo="createNew" />
                        <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1202935690659">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198521036393" resolveInfo="targetLanguage" />
                        </node>
                      </node>
                    </node>
                    <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198523148223">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198523148213" resolveInfo="targetEditorModelDescriptor" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" roleId="yvor.1068580123160:3" type="yvor.EqualsExpression" typeId="yvor.1068580123152:3" id="1198523148224">
                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1198523148225" />
                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198523148226">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198523148213" resolveInfo="targetEditorModelDescriptor" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1198578312499">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1198578312500">
                <property name="name" nameId="yvnu.1169194664001:0" value="editorModel" />
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204740202464">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198523148230">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198523148213" resolveInfo="targetEditorModelDescriptor" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1204740202465">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SModelDescriptor%dgetSModel()%cjetbrains%dmps%dsmodel%dSModel" resolveInfo="getSModel" />
                  </node>
                </node>
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SModelType" typeId="yvim.1143226024141:16" id="1239568349874" />
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1199622895190">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvia.MoveNodesToModelExpression" typeId="yvia.1199620728600:1" id="1199622895192">
                <node role="whatToMove" roleId="yvia.1199619459778:1" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198523148228">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198523058147" resolveInfo="editors" />
                </node>
                <node role="destination" roleId="yvia.1199619459779:1" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198578312502">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198578312500" resolveInfo="editorModel" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvia.UpdateModelProcedure" typeId="yvia.1198577376375:1" id="1198578300606">
              <node role="argument" roleId="yvia.1198577431631:1" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198578318588">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198578312500" resolveInfo="editorModel" />
              </node>
            </node>
          </node>
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1206576384188">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198523148232">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198523058147" resolveInfo="editors" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.IsNotEmptyOperation" typeId="yvix.1176501494711:7" id="1198523148233" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1198523135247">
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198523135248">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvia.UpdateModelProcedure" typeId="yvia.1198577376375:1" id="1470666820232677354">
              <node role="argument" roleId="yvia.1198577431631:1" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1470666820232677355">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1470666820232677358">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198521635841" resolveInfo="behaviorModelDescriptor" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1470666820232677357">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SModelDescriptor%dgetSModel()%cjetbrains%dmps%dsmodel%dSModel" resolveInfo="getSModel" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1198523135249">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1198523135250">
                <property name="name" nameId="yvnu.1169194664001:0" value="targetBehaviorModelDescriptor" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1198523135251">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8n6q.~SModelDescriptor" resolveInfo="SModelDescriptor" />
                </node>
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204740202604">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198523135253">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198521036393" resolveInfo="targetLanguage" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1224506597820">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~Language%dgetBehaviorModelDescriptor()%cjetbrains%dmps%dsmodel%ddescriptor%dEditableSModelDescriptor" resolveInfo="getBehaviorModelDescriptor" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1198523135254">
              <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198523135255">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1198523135256">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1198523135257">
                    <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204740202123">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.EnumConstantReference" typeId="yvor.1083260308424:3" id="1202935710147">
                        <link role="enumClass" roleId="yvor.1144432896254:3" targetNodeId="8n6q.~LanguageAspect" resolveInfo="LanguageAspect" />
                        <link role="enumConstantDeclaration" roleId="yvor.1083260308426:3" targetNodeId="8n6q.~LanguageAspect%dBEHAVIOR" resolveInfo="BEHAVIOR" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1204740202124">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~LanguageAspect%dcreateNew(jetbrains%dmps%dsmodel%dLanguage)%cjetbrains%dmps%dsmodel%dSModelDescriptor" resolveInfo="createNew" />
                        <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1202935734697">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198521036393" resolveInfo="targetLanguage" />
                        </node>
                      </node>
                    </node>
                    <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198523135260">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198523135250" resolveInfo="targetConstraintsModelDescriptor" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" roleId="yvor.1068580123160:3" type="yvor.EqualsExpression" typeId="yvor.1068580123152:3" id="1198523135261">
                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1198523135262" />
                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198523135263">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198523135250" resolveInfo="targetConstraintsModelDescriptor" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1198578331104">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1198578331105">
                <property name="name" nameId="yvnu.1169194664001:0" value="behaviorModel" />
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204740201906">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198523135267">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198523135250" resolveInfo="targetConstraintsModelDescriptor" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1204740201907">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SModelDescriptor%dgetSModel()%cjetbrains%dmps%dsmodel%dSModel" resolveInfo="getSModel" />
                  </node>
                </node>
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SModelType" typeId="yvim.1143226024141:16" id="1239568349832" />
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1199622905680">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvia.MoveNodesToModelExpression" typeId="yvia.1199620728600:1" id="1199622905682">
                <node role="whatToMove" roleId="yvia.1199619459778:1" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198523135265">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198523085615" resolveInfo="behaviors" />
                </node>
                <node role="destination" roleId="yvia.1199619459779:1" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198578331107">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198578331105" resolveInfo="constraintsModel" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvia.UpdateModelProcedure" typeId="yvia.1198577376375:1" id="1198578338817">
              <node role="argument" roleId="yvia.1198577431631:1" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198578342845">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198578331105" resolveInfo="constraintsModel" />
              </node>
            </node>
          </node>
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1206576384297">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198523135269">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198523085615" resolveInfo="behaviors" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.IsNotEmptyOperation" typeId="yvix.1176501494711:7" id="1198523135270" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1224506544492">
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1224506544493">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvia.UpdateModelProcedure" typeId="yvia.1198577376375:1" id="1470666820232677359">
              <node role="argument" roleId="yvia.1198577431631:1" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1470666820232677360">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1470666820232677363">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1224506339401" resolveInfo="constraintsModelDescriptor" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1470666820232677362">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SModelDescriptor%dgetSModel()%cjetbrains%dmps%dsmodel%dSModel" resolveInfo="getSModel" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1224506544494">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1224506544495">
                <property name="name" nameId="yvnu.1169194664001:0" value="targetConstraintsModelDescriptor" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1224506544496">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8n6q.~SModelDescriptor" resolveInfo="SModelDescriptor" />
                </node>
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1224506544497">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1224506544498">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198521036393" resolveInfo="targetLanguage" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1224506544499">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~Language%dgetConstraintsModelDescriptor()%cjetbrains%dmps%dsmodel%ddescriptor%dEditableSModelDescriptor" resolveInfo="getConstraintsModelDescriptor" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1224506544500">
              <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1224506544501">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1224506544502">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1224506544503">
                    <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1224506544504">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.EnumConstantReference" typeId="yvor.1083260308424:3" id="1224506544505">
                        <link role="enumClass" roleId="yvor.1144432896254:3" targetNodeId="8n6q.~LanguageAspect" resolveInfo="LanguageAspect" />
                        <link role="enumConstantDeclaration" roleId="yvor.1083260308426:3" targetNodeId="8n6q.~LanguageAspect%dCONSTRAINTS" resolveInfo="CONSTRAINTS" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1224506544506">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~LanguageAspect%dcreateNew(jetbrains%dmps%dsmodel%dLanguage)%cjetbrains%dmps%dsmodel%dSModelDescriptor" resolveInfo="createNew" />
                        <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1224506544507">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198521036393" resolveInfo="targetLanguage" />
                        </node>
                      </node>
                    </node>
                    <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1224506544508">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1224506544495" resolveInfo="targetConstraintsModelDescriptor" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" roleId="yvor.1068580123160:3" type="yvor.EqualsExpression" typeId="yvor.1068580123152:3" id="1224506544509">
                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1224506544510" />
                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1224506544511">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1224506544495" resolveInfo="targetConstraintsModelDescriptor" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1224506544512">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1224506544513">
                <property name="name" nameId="yvnu.1169194664001:0" value="constraintsModel" />
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1224506544515">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1224506544516">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1224506544495" resolveInfo="targetConstraintsModelDescriptor" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1224506544517">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SModelDescriptor%dgetSModel()%cjetbrains%dmps%dsmodel%dSModel" resolveInfo="getSModel" />
                  </node>
                </node>
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SModelType" typeId="yvim.1143226024141:16" id="1239568349896" />
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1224506544518">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvia.MoveNodesToModelExpression" typeId="yvia.1199620728600:1" id="1224506544519">
                <node role="whatToMove" roleId="yvia.1199619459778:1" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1224506572371">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1224506462990" resolveInfo="constraints" />
                </node>
                <node role="destination" roleId="yvia.1199619459779:1" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1224506544521">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1224506544513" resolveInfo="constraintsModel" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvia.UpdateModelProcedure" typeId="yvia.1198577376375:1" id="1224506544522">
              <node role="argument" roleId="yvia.1198577431631:1" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1224506544523">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1224506544513" resolveInfo="constraintsModel" />
              </node>
            </node>
          </node>
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1224506544524">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1224506549379">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1224506462990" resolveInfo="constraints" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.IsNotEmptyOperation" typeId="yvix.1176501494711:7" id="1224506544526" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1225273090116">
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1225273090117">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvia.UpdateModelProcedure" typeId="yvia.1198577376375:1" id="1470666820232677364">
              <node role="argument" roleId="yvia.1198577431631:1" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1470666820232677365">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1470666820232677368">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1225272186219" resolveInfo="dataflowModelDescriptor" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1470666820232677367">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SModelDescriptor%dgetSModel()%cjetbrains%dmps%dsmodel%dSModel" resolveInfo="getSModel" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1225273090118">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1225273090119">
                <property name="name" nameId="yvnu.1169194664001:0" value="targetDataFlowModelDescriptor" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1225273090120">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8n6q.~SModelDescriptor" resolveInfo="SModelDescriptor" />
                </node>
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1225273090121">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1225273090122">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198521036393" resolveInfo="targetLanguage" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1225273121092">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~Language%dgetDataFlowModelDescriptor()%cjetbrains%dmps%dsmodel%ddescriptor%dEditableSModelDescriptor" resolveInfo="getDataFlowModelDescriptor" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1225273090124">
              <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1225273090125">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1225273090126">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1225273090127">
                    <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1225273090128">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.EnumConstantReference" typeId="yvor.1083260308424:3" id="1225273130539">
                        <link role="enumConstantDeclaration" roleId="yvor.1083260308426:3" targetNodeId="8n6q.~LanguageAspect%dDATA_FLOW" resolveInfo="DATA_FLOW" />
                        <link role="enumClass" roleId="yvor.1144432896254:3" targetNodeId="8n6q.~LanguageAspect" resolveInfo="LanguageAspect" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1225273090130">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~LanguageAspect%dcreateNew(jetbrains%dmps%dsmodel%dLanguage)%cjetbrains%dmps%dsmodel%dSModelDescriptor" resolveInfo="createNew" />
                        <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1225273090131">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198521036393" resolveInfo="targetLanguage" />
                        </node>
                      </node>
                    </node>
                    <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1225273090132">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1225273090119" resolveInfo="targetConstraintsModelDescriptor" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" roleId="yvor.1068580123160:3" type="yvor.EqualsExpression" typeId="yvor.1068580123152:3" id="1225273090133">
                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1225273090134" />
                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1225273090135">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1225273090119" resolveInfo="targetConstraintsModelDescriptor" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1225273090136">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1225273090137">
                <property name="name" nameId="yvnu.1169194664001:0" value="dataFlowModel" />
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1225273090139">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1225273090140">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1225273090119" resolveInfo="targetConstraintsModelDescriptor" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1225273090141">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SModelDescriptor%dgetSModel()%cjetbrains%dmps%dsmodel%dSModel" resolveInfo="getSModel" />
                  </node>
                </node>
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SModelType" typeId="yvim.1143226024141:16" id="1239568349794" />
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1225273090142">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvia.MoveNodesToModelExpression" typeId="yvia.1199620728600:1" id="1225273090143">
                <node role="whatToMove" roleId="yvia.1199619459778:1" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1225273150715">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1225273023775" resolveInfo="dataFlows" />
                </node>
                <node role="destination" roleId="yvia.1199619459779:1" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1225273090145">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1225273090137" resolveInfo="constraintsModel" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvia.UpdateModelProcedure" typeId="yvia.1198577376375:1" id="1225273090146">
              <node role="argument" roleId="yvia.1198577431631:1" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1225273090147">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1225273090137" resolveInfo="constraintsModel" />
              </node>
            </node>
          </node>
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1225273090148">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1225273097693">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1225273023775" resolveInfo="dataFlows" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.IsNotEmptyOperation" typeId="yvix.1176501494711:7" id="1225273090150" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.SingleLineComment" typeId="yvor.6329021646629104954:3" id="7376433222636453653">
          <node role="commentPart" roleId="yvor.6329021646629175155:3" type="yvor.TextCommentPart" typeId="yvor.6329021646629104957:3" id="7376433222636453654">
            <property name="text" nameId="yvor.6329021646629104958:3" value="todo: move other concept-related aspect stuff" />
          </node>
        </node>
      </node>
    </node>
    <node role="updateModelClause" roleId="yvia.1189695176456:1" type="yvia.UpdateModelClause" typeId="yvia.1189694434958:1" id="1198173864691">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198173864692">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvia.UpdateModelByDefaultOperation" typeId="yvia.1197382578687:1" id="1198173866787" />
      </node>
    </node>
    <node role="getModelsToGenerateClause" roleId="yvia.1191591935289:1" type="yvia.GetModelsToGenerateClause" typeId="yvia.1191591349007:1" id="1198174193573">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198174193574">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1198174209091">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1198174209092">
            <property name="name" nameId="yvnu.1169194664001:0" value="result" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.MapType" typeId="yvix.1197683403723:7" id="1238587761050">
              <node role="keyType" roleId="yvix.1197683466920:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1238587761051">
                <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="txlh.~IModule" resolveInfo="IModule" />
              </node>
              <node role="valueType" roleId="yvix.1197683475734:7" type="yvix.ListType" typeId="yvix.1151688443754:7" id="1238587761052">
                <node role="elementType" roleId="yvix.1151688676805:7" type="yvim.SModelType" typeId="yvim.1143226024141:16" id="1239574131439" />
              </node>
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1215002646764">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvix.LinkedHashMapCreator" typeId="yvix.1240216724530:7" id="1240397296731">
                <node role="keyType" roleId="yvix.1197687026896:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1240397299570">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="txlh.~IModule" resolveInfo="IModule" />
                </node>
                <node role="valueType" roleId="yvix.1197687035757:7" type="yvix.ListType" typeId="yvix.1151688443754:7" id="1240397300626">
                  <node role="elementType" roleId="yvix.1151688676805:7" type="yvim.SModelType" typeId="yvim.1143226024141:16" id="1240397302792" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1198174296771">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1198174296772">
            <property name="name" nameId="yvnu.1169194664001:0" value="sourceLanguage" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1198174296773">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8n6q.~Language" resolveInfo="Language" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1198174296774">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~Language%dgetLanguageFor(jetbrains%dmps%dsmodel%dSModelDescriptor)%cjetbrains%dmps%dsmodel%dLanguage" resolveInfo="getLanguageFor" />
              <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="8n6q.~Language" resolveInfo="Language" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvia.RequiredAdditionalArgumentReference" typeId="yvia.1189694084608:1" id="1198174322482">
                <link role="argument" roleId="yvia.1189694099406:1" targetNodeId="1198174225279" resolveInfo="sourceModel" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1240475762624">
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1240475762625">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1240926313060">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240926313475">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1240926313061">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198174209092" resolveInfo="result" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvix.PutAllOperation" typeId="yvix.1240906768633:7" id="1240926314858">
                  <node role="map" roleId="yvix.1240906921264:7" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1240926317996">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="bjpd.~RefactoringUtil%dgetLanguageAndItsExtendingLanguageModels(jetbrains%dmps%dproject%dMPSProject,jetbrains%dmps%dsmodel%dLanguage)%cjava%dutil%dMap" resolveInfo="getLanguageAndItsExtendingLanguageModels" />
                    <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="bjpd.~RefactoringUtil" resolveInfo="RefactoringUtil" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvia.ProjectExpression" typeId="yvia.1215084496797:1" id="1240926317997" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1240926317998">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198174296772" resolveInfo="sourceLanguage" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotEqualsExpression" typeId="yvor.1073239437375:3" id="1240475771895">
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1240475772976" />
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1240475768800">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198174296772" resolveInfo="sourceLanguage" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1198174351034">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1198174351035">
            <property name="name" nameId="yvnu.1169194664001:0" value="targetLanguage" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1198174351036">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8n6q.~Language" resolveInfo="Language" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1198174351037">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~Language%dgetLanguageFor(jetbrains%dmps%dsmodel%dSModelDescriptor)%cjetbrains%dmps%dsmodel%dLanguage" resolveInfo="getLanguageFor" />
              <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="8n6q.~Language" resolveInfo="Language" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvia.RequiredAdditionalArgumentReference" typeId="yvia.1189694084608:1" id="1198174357478">
                <link role="argument" roleId="yvia.1189694099406:1" targetNodeId="1198173589717" resolveInfo="targetModel" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1240475783306">
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1240475783307">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1240926338253">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240926339201">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1240926338254">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198174209092" resolveInfo="result" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvix.PutAllOperation" typeId="yvix.1240906768633:7" id="1240926340562">
                  <node role="map" roleId="yvix.1240906921264:7" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1240926344794">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="bjpd.~RefactoringUtil%dgetLanguageAndItsExtendingLanguageModels(jetbrains%dmps%dproject%dMPSProject,jetbrains%dmps%dsmodel%dLanguage)%cjava%dutil%dMap" resolveInfo="getLanguageAndItsExtendingLanguageModels" />
                    <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="bjpd.~RefactoringUtil" resolveInfo="RefactoringUtil" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvia.ProjectExpression" typeId="yvia.1215084496797:1" id="1240926344795" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1240926344796">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198174351035" resolveInfo="targetLanguage" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotEqualsExpression" typeId="yvor.1073239437375:3" id="1240475793248">
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1240475794173" />
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1240475787810">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198174351035" resolveInfo="targetLanguage" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1198174394687">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198174396251">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198174209092" resolveInfo="result" />
          </node>
        </node>
      </node>
    </node>
    <node role="internalArguments" roleId="yvia.1189696093619:1" type="yvia.RequiredAdditionalArgument" typeId="yvia.1189693830529:1" id="1198174225279">
      <property name="name" nameId="yvnu.1169194664001:0" value="sourceModel" />
      <node role="argumentType" roleId="yvia.1190637130098:1" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1198679999789">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8n6q.~SModelDescriptor" resolveInfo="SModelDescriptor" />
      </node>
    </node>
    <node role="affectedNodesClause" roleId="yvia.1200932683928:1" type="yvia.AffectedNodesClause" typeId="yvia.1200932465350:1" id="1201533747260">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1201533747261">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1239348184133">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1239348184134">
            <property name="name" nameId="yvnu.1169194664001:0" value="searchResults" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1239348184135">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="1alo.~SearchResults" resolveInfo="SearchResults" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1239348184136">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="1239348184137">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1alo.~SearchResults%d&lt;init&gt;()" resolveInfo="SearchResults" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvix.ForEachStatement" typeId="yvix.1153943597977:7" id="1239348184138">
          <node role="variable" roleId="yvix.1153944400369:7" type="yvix.ForEachVariable" typeId="yvix.1153944193378:7" id="1239348184139">
            <property name="name" nameId="yvnu.1169194664001:0" value="selNode" />
          </node>
          <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1239348184140">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1239348184141">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1239348184142">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1239348184143">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1239348184134" resolveInfo="searchResults" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1239348184144">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1alo.~SearchResults%daddAll(jetbrains%dmps%dide%dfindusages%dmodel%dSearchResults)%cvoid" resolveInfo="addAll" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvia.ExecuteFindersExpression" typeId="yvia.1212242396240:1" id="1239348184145">
                    <node role="finders" roleId="yvia.1212242658590:1" type="yvia.FinderReference" typeId="yvia.1212242507771:1" id="1239348197688">
                      <link role="finderDeclaration" roleId="yvia.1212242603178:1" targetNodeId="yvnt.1197632773078" resolveInfo="ConceptInstances" />
                    </node>
                    <node role="finders" roleId="yvia.1212242658590:1" type="yvia.FinderReference" typeId="yvia.1212242507771:1" id="1239348197689">
                      <link role="finderDeclaration" roleId="yvia.1212242603178:1" targetNodeId="yvnt.1198430852441" resolveInfo="NodeAndDescendantsUsages" />
                    </node>
                    <node role="searchNode" roleId="yvia.1212242678419:1" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="1239348184147">
                      <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="1239348184139" resolveInfo="selNode" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="inputSequence" roleId="yvix.1153944424730:7" type="yvia.NodesExpression" typeId="yvia.1214999715318:1" id="1239348184148" />
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1239348184165">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1239348184166">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1239348184134" resolveInfo="searchResults" />
          </node>
        </node>
      </node>
    </node>
  </root>
  <root id="1198587937318">
    <node role="arguments" roleId="yvia.1189693888592:1" type="yvia.RequiredUserEnteredArgument" typeId="yvia.1192792808079:1" id="1198587985396">
      <property name="name" nameId="yvnu.1169194664001:0" value="newName" />
      <property name="presentation" nameId="yvia.6895093993902236769:1" value="enter new name" />
      <node role="argumentType" roleId="yvia.1190637130098:1" type="yvor.StringType" typeId="yvor.1225271177708:3" id="4853609160933269614" />
      <node role="initialValue" roleId="yvia.1198599595536:1" type="yvia.InitialValueClause" typeId="yvia.1198599668934:1" id="1198600846281">
        <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198600846282">
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6528618226609779064">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6528618226609779065">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvia.NodeExpression" typeId="yvia.1215000036307:1" id="6528618226609779066" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="6528618226609779067">
                <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvnr.1071599776563:0" resolveInfo="role" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="doRefactorClause" roleId="yvia.1189695170518:1" type="yvia.DoRefactorClause" typeId="yvia.1189694053795:1" id="1198588081171">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198588081172">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1198588083689">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1198588083690">
            <property name="name" nameId="yvnu.1169194664001:0" value="concept" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1198588083691">
              <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvnr.1169125787135:0" resolveInfo="AbstractConceptDeclaration" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1203721648405">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvia.NodeExpression" typeId="yvia.1215000036307:1" id="6528618226609613315" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_GetAncestorOperation" typeId="yvim.1171407110247:16" id="1198588382882">
                <node role="parameter" roleId="yvim.1144104376918:16" type="yvim.OperationParm_Concept" typeId="yvim.1144101972840:16" id="1198588386946">
                  <node role="conceptArgument" roleId="yvim.1207343664468:16" type="yvim.RefConcept_Reference" typeId="yvim.1177026924588:16" id="1212181505308">
                    <link role="conceptDeclaration" roleId="yvim.1177026940964:16" targetNodeId="yvnr.1169125787135:0" resolveInfo="AbstractConceptDeclaration" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvia.ChangeFeatureNameOperation" typeId="yvia.1197386846879:1" id="1198588513346">
          <node role="feature" roleId="yvia.1197386861552:1" type="yvia.NodeExpression" typeId="yvia.1215000036307:1" id="6528618226609613316" />
          <node role="newConceptFQName" roleId="yvia.1197386874459:1" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1198588573696">
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1203721647960">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198588575871">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198588083690" resolveInfo="concept" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="1198588586875">
                <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvnu.1169194664001:0" resolveInfo="name" />
              </node>
            </node>
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1198588549546">
              <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1224086438751">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvim.SemanticDowncastExpression" typeId="yvim.1145404486709:16" id="1224086430997">
                  <node role="leftExpression" roleId="yvim.1145404616321:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1203721648542">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198588530914">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198588083690" resolveInfo="concept" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_GetModelOperation" typeId="yvim.1143234257716:16" id="1198588547170" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1224086442791">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SModel%dgetSModelFqName()%cjetbrains%dmps%dsmodel%dSModelFqName" resolveInfo="getSModelFqName" />
                </node>
              </node>
              <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1198588571164">
                <property name="value" nameId="yvor.1070475926801:3" value="." />
              </node>
            </node>
          </node>
          <node role="newFeatureName" roleId="yvia.1197386900758:1" type="yvia.RequiredAdditionalArgumentReference" typeId="yvia.1189694084608:1" id="1198588600204">
            <link role="argument" roleId="yvia.1189694099406:1" targetNodeId="1198086090026" resolveInfo="newName" />
          </node>
        </node>
      </node>
    </node>
    <node role="getModelsToGenerateClause" roleId="yvia.1191591935289:1" type="yvia.GetModelsToGenerateClause" typeId="yvia.1191591349007:1" id="1198588627632">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198588627633">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1240394909188">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1240394909189">
            <property name="name" nameId="yvnu.1169194664001:0" value="result" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.MapType" typeId="yvix.1197683403723:7" id="1240394909190">
              <node role="keyType" roleId="yvix.1197683466920:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1240394909191">
                <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="txlh.~IModule" resolveInfo="IModule" />
              </node>
              <node role="valueType" roleId="yvix.1197683475734:7" type="yvix.ListType" typeId="yvix.1151688443754:7" id="1240394909192">
                <node role="elementType" roleId="yvix.1151688676805:7" type="yvim.SModelType" typeId="yvim.1143226024141:16" id="1240394909193" />
              </node>
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1240397346777">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvix.LinkedHashMapCreator" typeId="yvix.1240216724530:7" id="1240397346778">
                <node role="keyType" roleId="yvix.1197687026896:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1240397346779">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="txlh.~IModule" resolveInfo="IModule" />
                </node>
                <node role="valueType" roleId="yvix.1197687035757:7" type="yvix.ListType" typeId="yvix.1151688443754:7" id="1240397346780">
                  <node role="elementType" roleId="yvix.1151688676805:7" type="yvim.SModelType" typeId="yvim.1143226024141:16" id="1240397346781" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1240394909199">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1240394909200">
            <property name="name" nameId="yvnu.1169194664001:0" value="sourceLanguage" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1240394909201">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8n6q.~Language" resolveInfo="Language" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1240394909202">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~Language%dgetLanguageFor(jetbrains%dmps%dsmodel%dSModelDescriptor)%cjetbrains%dmps%dsmodel%dLanguage" resolveInfo="getLanguageFor" />
              <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="8n6q.~Language" resolveInfo="Language" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240394909203">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvim.SemanticDowncastExpression" typeId="yvim.1145404486709:16" id="1240394909204">
                  <node role="leftExpression" roleId="yvim.1145404616321:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240394909205">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvia.NodeExpression" typeId="yvia.1215000036307:1" id="1240394909206" />
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_GetModelOperation" typeId="yvim.1143234257716:16" id="1240394909207" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1240394909208">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SModel%dgetModelDescriptor()%cjetbrains%dmps%dsmodel%dSModelDescriptor" resolveInfo="getModelDescriptor" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1240475874758">
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1240475874759">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1240926416285">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240926417019">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1240926416286">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1240394909189" resolveInfo="result" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvix.PutAllOperation" typeId="yvix.1240906768633:7" id="1240926418610">
                  <node role="map" roleId="yvix.1240906921264:7" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1240926421833">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="bjpd.~RefactoringUtil%dgetLanguageAndItsExtendingLanguageModels(jetbrains%dmps%dproject%dMPSProject,jetbrains%dmps%dsmodel%dLanguage)%cjava%dutil%dMap" resolveInfo="getLanguageAndItsExtendingLanguageModels" />
                    <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="bjpd.~RefactoringUtil" resolveInfo="RefactoringUtil" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvia.ProjectExpression" typeId="yvia.1215084496797:1" id="1240926421834" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1240926421835">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1240394909200" resolveInfo="sourceLanguage" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotEqualsExpression" typeId="yvor.1073239437375:3" id="1240475876623">
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1240475877313" />
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1240475875872">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1240394909200" resolveInfo="sourceLanguage" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="6528618226609613268">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6528618226609613270">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1240394909189" resolveInfo="result" />
          </node>
        </node>
      </node>
    </node>
    <node role="updateModelClause" roleId="yvia.1189695176456:1" type="yvia.UpdateModelClause" typeId="yvia.1189694434958:1" id="1198588645737">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198588645738">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvia.UpdateModelByDefaultOperation" typeId="yvia.1197382578687:1" id="1198588648536" />
      </node>
    </node>
    <node role="affectedNodesClause" roleId="yvia.1200932683928:1" type="yvia.AffectedNodesClause" typeId="yvia.1200932465350:1" id="1201533901845">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1201533901846">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6528618226609613309">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvia.ExecuteFindersExpression" typeId="yvia.1212242396240:1" id="6528618226609613310">
            <node role="finders" roleId="yvia.1212242658590:1" type="yvia.FinderReference" typeId="yvia.1212242507771:1" id="6528618226609613311">
              <link role="finderDeclaration" roleId="yvia.1212242603178:1" targetNodeId="yvnt.1201275992898" resolveInfo="LinkInstances" />
            </node>
            <node role="finders" roleId="yvia.1212242658590:1" type="yvia.FinderReference" typeId="yvia.1212242507771:1" id="6528618226609613312">
              <link role="finderDeclaration" roleId="yvia.1212242603178:1" targetNodeId="yvnt.1198430852441" resolveInfo="NodeAndDescendantsUsages" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </root>
  <root id="1198592945615">
    <node role="arguments" roleId="yvia.1189693888592:1" type="yvia.RequiredUserEnteredArgument" typeId="yvia.1192792808079:1" id="1198592978857">
      <property name="name" nameId="yvnu.1169194664001:0" value="targetConcept" />
      <property name="presentation" nameId="yvia.6895093993902236769:1" value="choose target concept" />
      <node role="argumentType" roleId="yvia.1190637130098:1" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1198593001176">
        <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvnr.1169125787135:0" resolveInfo="AbstractConceptDeclaration" />
      </node>
      <node role="chooseComponentClause" roleId="yvia.1197983571375:1" type="yvia.ChooseComponentClause" typeId="yvia.1197983858784:1" id="1198689008355">
        <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198689008356">
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1198759274435">
            <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1198759274436">
              <property name="name" nameId="yvnu.1169194664001:0" value="abstractConceptDeclaration" />
              <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1198759274437">
                <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvnr.1169125787135:0" resolveInfo="AbstractConceptDeclaration" />
              </node>
              <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1203721648080">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvia.NodeExpression" typeId="yvia.1215000036307:1" id="6528618226609660022" />
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_GetAncestorOperation" typeId="yvim.1171407110247:16" id="1198759349466">
                  <node role="parameter" roleId="yvim.1144104376918:16" type="yvim.OperationParm_Concept" typeId="yvim.1144101972840:16" id="1198759351701">
                    <node role="conceptArgument" roleId="yvim.1207343664468:16" type="yvim.RefConcept_Reference" typeId="yvim.1177026924588:16" id="1212181505311">
                      <link role="conceptDeclaration" roleId="yvim.1177026940964:16" targetNodeId="yvnr.1169125787135:0" resolveInfo="AbstractConceptDeclaration" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1198689023328">
            <node role="expression" roleId="yvor.1068581517676:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1213097219002">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="1213097219004">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="bjpd.~HierarchicalChooseNodeComponent%d&lt;init&gt;(jetbrains%dmps%dsmodel%dIOperationContext,jetbrains%dmps%drefactoring%dframework%dIDescendantsProvider,jetbrains%dmps%dsmodel%dSNode)" resolveInfo="HierarchicalChooseNodeComponent" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvia.OperationContextExpression" typeId="yvia.1215084612287:1" id="1215088370799" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1213097221833">
                  <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="1213097221835">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="bjpd.~ConceptAncestorsProvider%d&lt;init&gt;()" resolveInfo="ConceptAncestorsProvider" />
                  </node>
                </node>
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198759376345">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198759274436" resolveInfo="abstractConceptDeclaration" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="isApplicableClause" roleId="yvia.1189695159409:1" type="yvia.IsApplicableClause" typeId="yvia.1189694022607:1" id="1198593012789">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198593012790">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1198593066115">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1198593066116">
            <property name="name" nameId="yvnu.1169194664001:0" value="concept" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1198593066117">
              <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvnr.1169125787135:0" resolveInfo="AbstractConceptDeclaration" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1203721648610">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvia.NodeExpression" typeId="yvia.1215000036307:1" id="6528618226609755753" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_GetAncestorOperation" typeId="yvim.1171407110247:16" id="1198593083065">
                <node role="parameter" roleId="yvim.1144104376918:16" type="yvim.OperationParm_Concept" typeId="yvim.1144101972840:16" id="1198593086645">
                  <node role="conceptArgument" roleId="yvim.1207343664468:16" type="yvim.RefConcept_Reference" typeId="yvim.1177026924588:16" id="1212181505312">
                    <link role="conceptDeclaration" roleId="yvim.1177026940964:16" targetNodeId="yvnr.1169125787135:0" resolveInfo="AbstractConceptDeclaration" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.Statement" typeId="yvor.1068580123157:3" id="8941943470987180062" />
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1198593095227">
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198593095228">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1198593102801">
              <node role="expression" roleId="yvor.1068581517676:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="1198593107460">
                <property name="value" nameId="yvor.1068580123138:3" value="false" />
              </node>
            </node>
          </node>
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.EqualsExpression" typeId="yvor.1068580123152:3" id="1198593097873">
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1198593100111" />
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198593096872">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198593066116" resolveInfo="concept" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1198593708178">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.AndExpression" typeId="yvor.1080120340718:3" id="1198593736620">
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1203721648518">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvia.RequiredAdditionalArgumentReference" typeId="yvia.1189694084608:1" id="1198593738876">
                <link role="argument" roleId="yvia.1189694099406:1" targetNodeId="1198592978857" resolveInfo="targetConcept" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Concept_IsSuperConceptOfOperation" typeId="yvim.1180028149140:16" id="1203555078771">
                <node role="conceptArgument" roleId="yvim.1180028346304:16" type="yvim.PoundExpression" typeId="yvim.1204834851141:16" id="1212181503944">
                  <node role="expression" roleId="yvim.1204834868751:16" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1203555092802">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198593066116" resolveInfo="concept" />
                  </node>
                </node>
              </node>
            </node>
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.NotEqualsExpression" typeId="yvor.1073239437375:3" id="1198593732954">
              <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvia.RequiredAdditionalArgumentReference" typeId="yvia.1189694084608:1" id="1198593731420">
                <link role="argument" roleId="yvia.1189694099406:1" targetNodeId="1198592978857" resolveInfo="targetConcept" />
              </node>
              <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198593734506">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198593066116" resolveInfo="concept" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="doRefactorClause" roleId="yvia.1189695170518:1" type="yvia.DoRefactorClause" typeId="yvia.1189694053795:1" id="1198593761413">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198593761414">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.CommentedStatementsBlock" typeId="yvor.1177326519037:3" id="8941943470987180061">
          <node role="statement" roleId="yvor.1177326540772:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1709900160195163099">
            <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1709900160195163100">
              <property name="name" nameId="yvnu.1169194664001:0" value="linkToReplace" />
              <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1709900160195163101">
                <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvnr.1071489288298:0" resolveInfo="LinkDeclaration" />
              </node>
              <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1709900160195163102">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1709900160195124941" resolveInfo="findLinkToReplace" />
                <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="5800912818421828062" resolveInfo="RefUtil" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvia.RequiredAdditionalArgumentReference" typeId="yvia.1189694084608:1" id="1709900160195163103">
                  <link role="argument" roleId="yvia.1189694099406:1" targetNodeId="1198592978857" resolveInfo="targetConcept" />
                </node>
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvia.NodeExpression" typeId="yvia.1215000036307:1" id="1709900160195163104" />
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1177326540772:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1709900160195163085">
            <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1709900160195163086">
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1709900160195163106">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvia.MergeNodeWithAnotherNodeExpression" typeId="yvia.3242588059496747656:1" id="1709900160195163107">
                  <node role="whatToMove" roleId="yvia.1199619459778:1" type="yvia.NodeExpression" typeId="yvia.1215000036307:1" id="1709900160195163110" />
                  <node role="destination" roleId="yvia.1199619459779:1" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1709900160195163111">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1709900160195163100" resolveInfo="linkToReplace" />
                  </node>
                </node>
              </node>
            </node>
            <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1709900160195163094">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1709900160195163105">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1709900160195163100" resolveInfo="linkToReplace" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_IsNotNullOperation" typeId="yvim.1172008320231:16" id="1709900160195163098" />
            </node>
            <node role="ifFalseStatement" roleId="yvor.1082485599094:3" type="yvor.BlockStatement" typeId="yvor.1082485599095:3" id="1709900160195163112">
              <node role="statements" roleId="yvor.1082485599096:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1709900160195163113">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1709900160195163114">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvia.MoveNodeToNodeExpression" typeId="yvia.1199620589385:1" id="1709900160195163115">
                    <node role="whatToMove" roleId="yvia.1199619459778:1" type="yvia.NodeExpression" typeId="yvia.1215000036307:1" id="1709900160195163116" />
                    <node role="destination" roleId="yvia.1199619459779:1" type="yvia.RequiredAdditionalArgumentReference" typeId="yvia.1189694084608:1" id="1709900160195163117">
                      <link role="argument" roleId="yvia.1189694099406:1" targetNodeId="1198592978857" resolveInfo="targetConcept" />
                    </node>
                    <node role="roleInTarget" roleId="yvia.1199620651934:1" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1709900160195163118">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvim.SemanticDowncastExpression" typeId="yvim.1145404486709:16" id="1709900160195163119">
                        <node role="leftExpression" roleId="yvim.1145404616321:16" type="yvia.NodeExpression" typeId="yvia.1215000036307:1" id="1709900160195163120" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1709900160195163121">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SNode%dgetRole_()%cjava%dlang%dString" resolveInfo="getRole_" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8941943470987180053">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvia.MoveNodeToNodeExpression" typeId="yvia.1199620589385:1" id="8941943470987180054">
            <node role="whatToMove" roleId="yvia.1199619459778:1" type="yvia.NodeExpression" typeId="yvia.1215000036307:1" id="8941943470987180055" />
            <node role="destination" roleId="yvia.1199619459779:1" type="yvia.RequiredAdditionalArgumentReference" typeId="yvia.1189694084608:1" id="8941943470987180056">
              <link role="argument" roleId="yvia.1189694099406:1" targetNodeId="1198592978857" resolveInfo="targetConcept" />
            </node>
            <node role="roleInTarget" roleId="yvia.1199620651934:1" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8941943470987180057">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvim.SemanticDowncastExpression" typeId="yvim.1145404486709:16" id="8941943470987180058">
                <node role="leftExpression" roleId="yvim.1145404616321:16" type="yvia.NodeExpression" typeId="yvia.1215000036307:1" id="8941943470987180059" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8941943470987180060">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SNode%dgetRole_()%cjava%dlang%dString" resolveInfo="getRole_" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvia.ChangeFeatureNameOperation" typeId="yvia.1197386846879:1" id="1198593934851">
          <node role="feature" roleId="yvia.1197386861552:1" type="yvia.NodeExpression" typeId="yvia.1215000036307:1" id="6528618226609755749" />
          <node role="newConceptFQName" roleId="yvia.1197386874459:1" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1198593963992">
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1203721648636">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvia.RequiredAdditionalArgumentReference" typeId="yvia.1189694084608:1" id="1198593966703">
                <link role="argument" roleId="yvia.1189694099406:1" targetNodeId="1198592978857" resolveInfo="targetConcept" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="1198593968506">
                <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvnu.1169194664001:0" resolveInfo="name" />
              </node>
            </node>
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1198593960436">
              <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1224086369806">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvim.SemanticDowncastExpression" typeId="yvim.1145404486709:16" id="1224086368720">
                  <node role="leftExpression" roleId="yvim.1145404616321:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1203721648307">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvia.RequiredAdditionalArgumentReference" typeId="yvia.1189694084608:1" id="1198593956926">
                      <link role="argument" roleId="yvia.1189694099406:1" targetNodeId="1198592978857" resolveInfo="targetConcept" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_GetModelOperation" typeId="yvim.1143234257716:16" id="1198593959230" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1224086377058">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SModel%dgetSModelFqName()%cjetbrains%dmps%dsmodel%dSModelFqName" resolveInfo="getSModelFqName" />
                </node>
              </node>
              <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1198593961566">
                <property name="value" nameId="yvor.1070475926801:3" value="." />
              </node>
            </node>
          </node>
          <node role="newFeatureName" roleId="yvia.1197386900758:1" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1203721648616">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvia.NodeExpression" typeId="yvia.1215000036307:1" id="6528618226609755748" />
            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="1198593951213">
              <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvnr.1071599776563:0" resolveInfo="role" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="updateModelClause" roleId="yvia.1189695176456:1" type="yvia.UpdateModelClause" typeId="yvia.1189694434958:1" id="1198593973640">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198593973641">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvia.UpdateModelByDefaultOperation" typeId="yvia.1197382578687:1" id="1198593975629" />
      </node>
    </node>
    <node role="getModelsToGenerateClause" roleId="yvia.1191591935289:1" type="yvia.GetModelsToGenerateClause" typeId="yvia.1191591349007:1" id="1198594002608">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198594002609">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1240394761429">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1240394761430">
            <property name="name" nameId="yvnu.1169194664001:0" value="result" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.MapType" typeId="yvix.1197683403723:7" id="1240394761431">
              <node role="keyType" roleId="yvix.1197683466920:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1240394761432">
                <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="txlh.~IModule" resolveInfo="IModule" />
              </node>
              <node role="valueType" roleId="yvix.1197683475734:7" type="yvix.ListType" typeId="yvix.1151688443754:7" id="1240394761433">
                <node role="elementType" roleId="yvix.1151688676805:7" type="yvim.SModelType" typeId="yvim.1143226024141:16" id="1240394761434" />
              </node>
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1240397329647">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvix.LinkedHashMapCreator" typeId="yvix.1240216724530:7" id="1240397329648">
                <node role="keyType" roleId="yvix.1197687026896:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1240397329649">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="txlh.~IModule" resolveInfo="IModule" />
                </node>
                <node role="valueType" roleId="yvix.1197687035757:7" type="yvix.ListType" typeId="yvix.1151688443754:7" id="1240397329650">
                  <node role="elementType" roleId="yvix.1151688676805:7" type="yvim.SModelType" typeId="yvim.1143226024141:16" id="1240397329651" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1240394761440">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1240394761441">
            <property name="name" nameId="yvnu.1169194664001:0" value="sourceLanguage" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1240394761442">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8n6q.~Language" resolveInfo="Language" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1240394761443">
              <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="8n6q.~Language" resolveInfo="Language" />
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~Language%dgetLanguageFor(jetbrains%dmps%dsmodel%dSModelDescriptor)%cjetbrains%dmps%dsmodel%dLanguage" resolveInfo="getLanguageFor" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240394819909">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvim.SemanticDowncastExpression" typeId="yvim.1145404486709:16" id="1240394819910">
                  <node role="leftExpression" roleId="yvim.1145404616321:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240394819911">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvia.NodeExpression" typeId="yvia.1215000036307:1" id="1240394822982" />
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_GetModelOperation" typeId="yvim.1143234257716:16" id="1240394819913" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1240394819914">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SModel%dgetModelDescriptor()%cjetbrains%dmps%dsmodel%dSModelDescriptor" resolveInfo="getModelDescriptor" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1240475825786">
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1240475825787">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1240926354404">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240926354779">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1240926354405">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1240394761430" resolveInfo="result" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvix.PutAllOperation" typeId="yvix.1240906768633:7" id="1240926356170">
                  <node role="map" roleId="yvix.1240906921264:7" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1240926359073">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="bjpd.~RefactoringUtil%dgetLanguageAndItsExtendingLanguageModels(jetbrains%dmps%dproject%dMPSProject,jetbrains%dmps%dsmodel%dLanguage)%cjava%dutil%dMap" resolveInfo="getLanguageAndItsExtendingLanguageModels" />
                    <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="bjpd.~RefactoringUtil" resolveInfo="RefactoringUtil" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvia.ProjectExpression" typeId="yvia.1215084496797:1" id="1240926359074" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1240926359075">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1240394761441" resolveInfo="sourceLanguage" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotEqualsExpression" typeId="yvor.1073239437375:3" id="1240475828885">
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1240475829638" />
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1240475827024">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1240394761441" resolveInfo="sourceLanguage" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1240394761458">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1240394761459">
            <property name="name" nameId="yvnu.1169194664001:0" value="targetLanguage" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1240394761460">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8n6q.~Language" resolveInfo="Language" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1240394761461">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~Language%dgetLanguageFor(jetbrains%dmps%dsmodel%dSModelDescriptor)%cjetbrains%dmps%dsmodel%dLanguage" resolveInfo="getLanguageFor" />
              <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="8n6q.~Language" resolveInfo="Language" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240394801866">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvim.SemanticDowncastExpression" typeId="yvim.1145404486709:16" id="1240394801517">
                  <node role="leftExpression" roleId="yvim.1145404616321:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240394792164">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvia.RequiredAdditionalArgumentReference" typeId="yvia.1189694084608:1" id="1240394782815">
                      <link role="argument" roleId="yvia.1189694099406:1" targetNodeId="1198592978857" resolveInfo="targetConcept" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_GetModelOperation" typeId="yvim.1143234257716:16" id="1240394794468" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1240394810373">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SModel%dgetModelDescriptor()%cjetbrains%dmps%dsmodel%dSModelDescriptor" resolveInfo="getModelDescriptor" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1240475834046">
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1240475834047">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1240926364788">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240926365106">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1240926364789">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1240394761430" resolveInfo="result" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvix.PutAllOperation" typeId="yvix.1240906768633:7" id="1240926366723">
                  <node role="map" roleId="yvix.1240906921264:7" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1240926369985">
                    <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="bjpd.~RefactoringUtil" resolveInfo="RefactoringUtil" />
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="bjpd.~RefactoringUtil%dgetLanguageAndItsExtendingLanguageModels(jetbrains%dmps%dproject%dMPSProject,jetbrains%dmps%dsmodel%dLanguage)%cjava%dutil%dMap" resolveInfo="getLanguageAndItsExtendingLanguageModels" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvia.ProjectExpression" typeId="yvia.1215084496797:1" id="1240926369986" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1240926369987">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1240394761459" resolveInfo="targetLanguage" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotEqualsExpression" typeId="yvor.1073239437375:3" id="1240475836520">
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1240475837273" />
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1240475836097">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1240394761459" resolveInfo="targetLanguage" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1240394761476">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1240394761477">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1240394761430" resolveInfo="result" />
          </node>
        </node>
      </node>
    </node>
    <node role="affectedNodesClause" roleId="yvia.1200932683928:1" type="yvia.AffectedNodesClause" typeId="yvia.1200932465350:1" id="1201533945673">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1201533945674">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6528618226609777088">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvia.ExecuteFindersExpression" typeId="yvia.1212242396240:1" id="6528618226609777089">
            <node role="finders" roleId="yvia.1212242658590:1" type="yvia.FinderReference" typeId="yvia.1212242507771:1" id="6528618226609777090">
              <link role="finderDeclaration" roleId="yvia.1212242603178:1" targetNodeId="yvnt.1198430852441" resolveInfo="NodeAndDescendantsUsages" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </root>
  <root id="1198764756152">
    <node role="arguments" roleId="yvia.1189693888592:1" type="yvia.RequiredUserEnteredArgument" typeId="yvia.1192792808079:1" id="1198764804967">
      <property name="name" nameId="yvnu.1169194664001:0" value="newName" />
      <property name="presentation" nameId="yvia.6895093993902236769:1" value="enter new name" />
      <node role="argumentType" roleId="yvia.1190637130098:1" type="yvor.StringType" typeId="yvor.1225271177708:3" id="4853609160933269613" />
      <node role="initialValue" roleId="yvia.1198599595536:1" type="yvia.InitialValueClause" typeId="yvia.1198599668934:1" id="1198764844727">
        <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198764844728">
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6528618226609779094">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1203721647939">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvia.NodeExpression" typeId="yvia.1215000036307:1" id="6528618226609613280" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="1198764856839">
                <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvnu.1169194664001:0" resolveInfo="name" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="doRefactorClause" roleId="yvia.1189695170518:1" type="yvia.DoRefactorClause" typeId="yvia.1189694053795:1" id="1198764893478">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198764893479">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1198764893487">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1198764893488">
            <property name="name" nameId="yvnu.1169194664001:0" value="concept" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1198764893489">
              <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvnr.1169125787135:0" resolveInfo="AbstractConceptDeclaration" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1203721648358">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvia.NodeExpression" typeId="yvia.1215000036307:1" id="6528618226609613277" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_GetAncestorOperation" typeId="yvim.1171407110247:16" id="1198764893491">
                <node role="parameter" roleId="yvim.1144104376918:16" type="yvim.OperationParm_Concept" typeId="yvim.1144101972840:16" id="1198764893492">
                  <node role="conceptArgument" roleId="yvim.1207343664468:16" type="yvim.RefConcept_Reference" typeId="yvim.1177026924588:16" id="1212181505306">
                    <link role="conceptDeclaration" roleId="yvim.1177026940964:16" targetNodeId="yvnr.1169125787135:0" resolveInfo="AbstractConceptDeclaration" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvia.ChangeFeatureNameOperation" typeId="yvia.1197386846879:1" id="1198764893494">
          <node role="feature" roleId="yvia.1197386861552:1" type="yvia.NodeExpression" typeId="yvia.1215000036307:1" id="6528618226609613278" />
          <node role="newConceptFQName" roleId="yvia.1197386874459:1" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1198764893497">
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1203721648614">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198764893500">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198764893488" resolveInfo="concept" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="1198764893499">
                <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvnu.1169194664001:0" resolveInfo="name" />
              </node>
            </node>
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1198764893496">
              <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1224086454526">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvim.SemanticDowncastExpression" typeId="yvim.1145404486709:16" id="1224086453615">
                  <node role="leftExpression" roleId="yvim.1145404616321:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1203721648386">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198764893504">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198764893488" resolveInfo="concept" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_GetModelOperation" typeId="yvim.1143234257716:16" id="1198764893503" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1224086458351">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SModel%dgetSModelFqName()%cjetbrains%dmps%dsmodel%dSModelFqName" resolveInfo="getSModelFqName" />
                </node>
              </node>
              <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1198764893501">
                <property name="value" nameId="yvor.1070475926801:3" value="." />
              </node>
            </node>
          </node>
          <node role="newFeatureName" roleId="yvia.1197386900758:1" type="yvia.RequiredAdditionalArgumentReference" typeId="yvia.1189694084608:1" id="1198764893505">
            <link role="argument" roleId="yvia.1189694099406:1" targetNodeId="1198086090026" resolveInfo="newName" />
          </node>
        </node>
      </node>
    </node>
    <node role="getModelsToGenerateClause" roleId="yvia.1191591935289:1" type="yvia.GetModelsToGenerateClause" typeId="yvia.1191591349007:1" id="1198764929782">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198764929783">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1240394919864">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1240394919865">
            <property name="name" nameId="yvnu.1169194664001:0" value="result" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.MapType" typeId="yvix.1197683403723:7" id="1240394919866">
              <node role="keyType" roleId="yvix.1197683466920:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1240394919867">
                <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="txlh.~IModule" resolveInfo="IModule" />
              </node>
              <node role="valueType" roleId="yvix.1197683475734:7" type="yvix.ListType" typeId="yvix.1151688443754:7" id="1240394919868">
                <node role="elementType" roleId="yvix.1151688676805:7" type="yvim.SModelType" typeId="yvim.1143226024141:16" id="1240394919869" />
              </node>
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1240397351274">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvix.LinkedHashMapCreator" typeId="yvix.1240216724530:7" id="1240397351275">
                <node role="keyType" roleId="yvix.1197687026896:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1240397351276">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="txlh.~IModule" resolveInfo="IModule" />
                </node>
                <node role="valueType" roleId="yvix.1197687035757:7" type="yvix.ListType" typeId="yvix.1151688443754:7" id="1240397351277">
                  <node role="elementType" roleId="yvix.1151688676805:7" type="yvim.SModelType" typeId="yvim.1143226024141:16" id="1240397351278" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1240394919875">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1240394919876">
            <property name="name" nameId="yvnu.1169194664001:0" value="sourceLanguage" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1240394919877">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8n6q.~Language" resolveInfo="Language" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1240394919878">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~Language%dgetLanguageFor(jetbrains%dmps%dsmodel%dSModelDescriptor)%cjetbrains%dmps%dsmodel%dLanguage" resolveInfo="getLanguageFor" />
              <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="8n6q.~Language" resolveInfo="Language" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240394919879">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvim.SemanticDowncastExpression" typeId="yvim.1145404486709:16" id="1240394919880">
                  <node role="leftExpression" roleId="yvim.1145404616321:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240394919881">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvia.NodeExpression" typeId="yvia.1215000036307:1" id="1240394919882" />
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_GetModelOperation" typeId="yvim.1143234257716:16" id="1240394919883" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1240394919884">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SModel%dgetModelDescriptor()%cjetbrains%dmps%dsmodel%dSModelDescriptor" resolveInfo="getModelDescriptor" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1240475883444">
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1240475883445">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1240926428969">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240926429945">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1240926428970">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1240394919865" resolveInfo="result" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvix.PutAllOperation" typeId="yvix.1240906768633:7" id="1240926430830">
                  <node role="map" roleId="yvix.1240906921264:7" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1240926433749">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="bjpd.~RefactoringUtil%dgetLanguageAndItsExtendingLanguageModels(jetbrains%dmps%dproject%dMPSProject,jetbrains%dmps%dsmodel%dLanguage)%cjava%dutil%dMap" resolveInfo="getLanguageAndItsExtendingLanguageModels" />
                    <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="bjpd.~RefactoringUtil" resolveInfo="RefactoringUtil" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvia.ProjectExpression" typeId="yvia.1215084496797:1" id="1240926433750" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1240926433751">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1240394919876" resolveInfo="sourceLanguage" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotEqualsExpression" typeId="yvor.1073239437375:3" id="1240475885090">
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1240475885827" />
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1240475884526">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1240394919876" resolveInfo="sourceLanguage" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="6528618226609613274">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6528618226609613276">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1240394919865" resolveInfo="result" />
          </node>
        </node>
      </node>
    </node>
    <node role="updateModelClause" roleId="yvia.1189695176456:1" type="yvia.UpdateModelClause" typeId="yvia.1189694434958:1" id="1198764936759">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198764936760">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvia.UpdateModelByDefaultOperation" typeId="yvia.1197382578687:1" id="1198764939011" />
      </node>
    </node>
  </root>
  <root id="1198776916667">
    <node role="arguments" roleId="yvia.1189693888592:1" type="yvia.RequiredUserEnteredArgument" typeId="yvia.1192792808079:1" id="1198776978561">
      <property name="name" nameId="yvnu.1169194664001:0" value="targetConcept" />
      <property name="presentation" nameId="yvia.6895093993902236769:1" value="choose target concept" />
      <node role="argumentType" roleId="yvia.1190637130098:1" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1198776978562">
        <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvnr.1169125787135:0" resolveInfo="AbstractConceptDeclaration" />
      </node>
      <node role="chooseComponentClause" roleId="yvia.1197983571375:1" type="yvia.ChooseComponentClause" typeId="yvia.1197983858784:1" id="1198776978563">
        <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198776978564">
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1198776978570">
            <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1198776978571">
              <property name="name" nameId="yvnu.1169194664001:0" value="abstractConceptDeclaration" />
              <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1198776978572">
                <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvnr.1169125787135:0" resolveInfo="AbstractConceptDeclaration" />
              </node>
              <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1203721648072">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvia.NodeExpression" typeId="yvia.1215000036307:1" id="6528618226609613328" />
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_GetAncestorOperation" typeId="yvim.1171407110247:16" id="1198776978574">
                  <node role="parameter" roleId="yvim.1144104376918:16" type="yvim.OperationParm_Concept" typeId="yvim.1144101972840:16" id="1198776978575">
                    <node role="conceptArgument" roleId="yvim.1207343664468:16" type="yvim.RefConcept_Reference" typeId="yvim.1177026924588:16" id="1212170082678">
                      <link role="conceptDeclaration" roleId="yvim.1177026940964:16" targetNodeId="yvnr.1169125787135:0" resolveInfo="AbstractConceptDeclaration" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1198776978577">
            <node role="expression" roleId="yvor.1068581517676:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1213097137342">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="1213097137344">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="bjpd.~HierarchicalChooseNodeComponent%d&lt;init&gt;(jetbrains%dmps%dsmodel%dIOperationContext,jetbrains%dmps%drefactoring%dframework%dIDescendantsProvider,jetbrains%dmps%dsmodel%dSNode)" resolveInfo="HierarchicalChooseNodeComponent" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvia.OperationContextExpression" typeId="yvia.1215084612287:1" id="1215088387769" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1213097141172">
                  <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="1213097141174">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="bjpd.~ConceptAncestorsProvider%d&lt;init&gt;()" resolveInfo="ConceptAncestorsProvider" />
                  </node>
                </node>
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198776978583">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198776978571" resolveInfo="abstractConceptDeclaration" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="isApplicableClause" roleId="yvia.1189695159409:1" type="yvia.IsApplicableClause" typeId="yvia.1189694022607:1" id="1198777009916">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198777009917">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1198777009932">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1198777009933">
            <property name="name" nameId="yvnu.1169194664001:0" value="concept" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1198777009934">
              <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvnr.1169125787135:0" resolveInfo="AbstractConceptDeclaration" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1203721648159">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvia.NodeExpression" typeId="yvia.1215000036307:1" id="6528618226609613330" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_GetAncestorOperation" typeId="yvim.1171407110247:16" id="1198777009936">
                <node role="parameter" roleId="yvim.1144104376918:16" type="yvim.OperationParm_Concept" typeId="yvim.1144101972840:16" id="1198777009937">
                  <node role="conceptArgument" roleId="yvim.1207343664468:16" type="yvim.RefConcept_Reference" typeId="yvim.1177026924588:16" id="1212170079056">
                    <link role="conceptDeclaration" roleId="yvim.1177026940964:16" targetNodeId="yvnr.1169125787135:0" resolveInfo="AbstractConceptDeclaration" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1198777009939">
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198777009940">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1198777009941">
              <node role="expression" roleId="yvor.1068581517676:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="1198777009942">
                <property name="value" nameId="yvor.1068580123138:3" value="false" />
              </node>
            </node>
          </node>
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.EqualsExpression" typeId="yvor.1068580123152:3" id="1198777009943">
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1198777009944" />
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198777009945">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198777009933" resolveInfo="concept" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1198777009946">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.AndExpression" typeId="yvor.1080120340718:3" id="1198777009947">
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1203721647980">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvia.RequiredAdditionalArgumentReference" typeId="yvia.1189694084608:1" id="1198777025206">
                <link role="argument" roleId="yvia.1189694099406:1" targetNodeId="1198776978561" resolveInfo="targetConcept" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Concept_IsSuperConceptOfOperation" typeId="yvim.1180028149140:16" id="1203555189179">
                <node role="conceptArgument" roleId="yvim.1180028346304:16" type="yvim.PoundExpression" typeId="yvim.1204834851141:16" id="1212181503911">
                  <node role="expression" roleId="yvim.1204834868751:16" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1203555194292">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198777009933" resolveInfo="concept" />
                  </node>
                </node>
              </node>
            </node>
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.NotEqualsExpression" typeId="yvor.1073239437375:3" id="1198777009952">
              <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvia.RequiredAdditionalArgumentReference" typeId="yvia.1189694084608:1" id="1198777017502">
                <link role="argument" roleId="yvia.1189694099406:1" targetNodeId="1198776978561" resolveInfo="targetConcept" />
              </node>
              <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198777009954">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198777009933" resolveInfo="concept" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="doRefactorClause" roleId="yvia.1189695170518:1" type="yvia.DoRefactorClause" typeId="yvia.1189694053795:1" id="1198777110054">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198777110055">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.CommentedStatementsBlock" typeId="yvor.1177326519037:3" id="8941943470987182306">
          <node role="statement" roleId="yvor.1177326540772:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="8941943470987182283">
            <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8941943470987182284">
              <property name="name" nameId="yvnu.1169194664001:0" value="propertyToMerge" />
              <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="8941943470987182285">
                <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvnr.1071489288299:0" resolveInfo="PropertyDeclaration" />
              </node>
              <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="8941943470987182286">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8941943470987180068" resolveInfo="findPropertyToMerge" />
                <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="5800912818421828062" resolveInfo="RefUtil" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvia.RequiredAdditionalArgumentReference" typeId="yvia.1189694084608:1" id="8941943470987182287">
                  <link role="argument" roleId="yvia.1189694099406:1" targetNodeId="1198776978561" resolveInfo="targetConcept" />
                </node>
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvia.NodeExpression" typeId="yvia.1215000036307:1" id="8941943470987182288" />
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1177326540772:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="8941943470987182269">
            <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8941943470987182270">
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8941943470987182290">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvia.MergeNodeWithAnotherNodeExpression" typeId="yvia.3242588059496747656:1" id="8941943470987182291">
                  <node role="whatToMove" roleId="yvia.1199619459778:1" type="yvia.NodeExpression" typeId="yvia.1215000036307:1" id="8941943470987182294" />
                  <node role="destination" roleId="yvia.1199619459779:1" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8941943470987182295">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8941943470987182284" resolveInfo="propertyToMerge" />
                  </node>
                </node>
              </node>
            </node>
            <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8941943470987182278">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8941943470987182289">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8941943470987182284" resolveInfo="propertyToMerge" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_IsNotNullOperation" typeId="yvim.1172008320231:16" id="8941943470987182282" />
            </node>
            <node role="ifFalseStatement" roleId="yvor.1082485599094:3" type="yvor.BlockStatement" typeId="yvor.1082485599095:3" id="8941943470987182296">
              <node role="statements" roleId="yvor.1082485599096:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8941943470987182297">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8941943470987182298">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvia.MoveNodeToNodeExpression" typeId="yvia.1199620589385:1" id="8941943470987182299">
                    <node role="roleInTarget" roleId="yvia.1199620651934:1" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8941943470987182300">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvim.SemanticDowncastExpression" typeId="yvim.1145404486709:16" id="8941943470987182301">
                        <node role="leftExpression" roleId="yvim.1145404616321:16" type="yvia.NodeExpression" typeId="yvia.1215000036307:1" id="8941943470987182302" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8941943470987182303">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SNode%dgetRole_()%cjava%dlang%dString" resolveInfo="getRole_" />
                      </node>
                    </node>
                    <node role="whatToMove" roleId="yvia.1199619459778:1" type="yvia.NodeExpression" typeId="yvia.1215000036307:1" id="8941943470987182304" />
                    <node role="destination" roleId="yvia.1199619459779:1" type="yvia.RequiredAdditionalArgumentReference" typeId="yvia.1189694084608:1" id="8941943470987182305">
                      <link role="argument" roleId="yvia.1189694099406:1" targetNodeId="1198776978561" resolveInfo="targetConcept" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1239805397495">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvia.MoveNodeToNodeExpression" typeId="yvia.1199620589385:1" id="1239805397496">
            <node role="roleInTarget" roleId="yvia.1199620651934:1" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1239805594536">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvim.SemanticDowncastExpression" typeId="yvim.1145404486709:16" id="1239805594037">
                <node role="leftExpression" roleId="yvim.1145404616321:16" type="yvia.NodeExpression" typeId="yvia.1215000036307:1" id="1239805587463" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1239805601383">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SNode%dgetRole_()%cjava%dlang%dString" resolveInfo="getRole_" />
              </node>
            </node>
            <node role="whatToMove" roleId="yvia.1199619459778:1" type="yvia.NodeExpression" typeId="yvia.1215000036307:1" id="1239805402696" />
            <node role="destination" roleId="yvia.1199619459779:1" type="yvia.RequiredAdditionalArgumentReference" typeId="yvia.1189694084608:1" id="1239805474259">
              <link role="argument" roleId="yvia.1189694099406:1" targetNodeId="1198776978561" resolveInfo="targetConcept" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvia.ChangeFeatureNameOperation" typeId="yvia.1197386846879:1" id="1198777116397">
          <node role="feature" roleId="yvia.1197386861552:1" type="yvia.NodeExpression" typeId="yvia.1215000036307:1" id="8941943470987182267" />
          <node role="newConceptFQName" roleId="yvia.1197386874459:1" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1198777116400">
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1203721648484">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvia.RequiredAdditionalArgumentReference" typeId="yvia.1189694084608:1" id="1198777130273">
                <link role="argument" roleId="yvia.1189694099406:1" targetNodeId="1198776978561" resolveInfo="targetConcept" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="1198777116402">
                <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvnu.1169194664001:0" resolveInfo="name" />
              </node>
            </node>
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.PlusExpression" typeId="yvor.1068581242875:3" id="1198777116399">
              <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1224086401041">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvim.SemanticDowncastExpression" typeId="yvim.1145404486709:16" id="1224086400062">
                  <node role="leftExpression" roleId="yvim.1145404616321:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1203721647911">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvia.RequiredAdditionalArgumentReference" typeId="yvia.1189694084608:1" id="1198777127459">
                      <link role="argument" roleId="yvia.1189694099406:1" targetNodeId="1198776978561" resolveInfo="targetConcept" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_GetModelOperation" typeId="yvim.1143234257716:16" id="1198777116406" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1224086403950">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SModel%dgetSModelFqName()%cjetbrains%dmps%dsmodel%dSModelFqName" resolveInfo="getSModelFqName" />
                </node>
              </node>
              <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1198777116404">
                <property name="value" nameId="yvor.1070475926801:3" value="." />
              </node>
            </node>
          </node>
          <node role="newFeatureName" roleId="yvia.1197386900758:1" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1203721648236">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvia.NodeExpression" typeId="yvia.1215000036307:1" id="8941943470987182268" />
            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="1239805112266">
              <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvnu.1169194664001:0" resolveInfo="name" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="updateModelClause" roleId="yvia.1189695176456:1" type="yvia.UpdateModelClause" typeId="yvia.1189694434958:1" id="1198777145321">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198777145322">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvia.UpdateModelByDefaultOperation" typeId="yvia.1197382578687:1" id="1198777149010" />
      </node>
    </node>
    <node role="getModelsToGenerateClause" roleId="yvia.1191591935289:1" type="yvia.GetModelsToGenerateClause" typeId="yvia.1191591349007:1" id="1198777287088">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198777287089">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1240394844739">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1240394844740">
            <property name="name" nameId="yvnu.1169194664001:0" value="result" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.MapType" typeId="yvix.1197683403723:7" id="1240394844741">
              <node role="keyType" roleId="yvix.1197683466920:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1240394844742">
                <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="txlh.~IModule" resolveInfo="IModule" />
              </node>
              <node role="valueType" roleId="yvix.1197683475734:7" type="yvix.ListType" typeId="yvix.1151688443754:7" id="1240394844743">
                <node role="elementType" roleId="yvix.1151688676805:7" type="yvim.SModelType" typeId="yvim.1143226024141:16" id="1240394844744" />
              </node>
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1240397335574">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvix.LinkedHashMapCreator" typeId="yvix.1240216724530:7" id="1240397335575">
                <node role="keyType" roleId="yvix.1197687026896:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1240397335576">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="txlh.~IModule" resolveInfo="IModule" />
                </node>
                <node role="valueType" roleId="yvix.1197687035757:7" type="yvix.ListType" typeId="yvix.1151688443754:7" id="1240397335577">
                  <node role="elementType" roleId="yvix.1151688676805:7" type="yvim.SModelType" typeId="yvim.1143226024141:16" id="1240397335578" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1240394844750">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1240394844751">
            <property name="name" nameId="yvnu.1169194664001:0" value="sourceLanguage" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1240394844752">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8n6q.~Language" resolveInfo="Language" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1240394844753">
              <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="8n6q.~Language" resolveInfo="Language" />
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~Language%dgetLanguageFor(jetbrains%dmps%dsmodel%dSModelDescriptor)%cjetbrains%dmps%dsmodel%dLanguage" resolveInfo="getLanguageFor" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240394844754">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvim.SemanticDowncastExpression" typeId="yvim.1145404486709:16" id="1240394844755">
                  <node role="leftExpression" roleId="yvim.1145404616321:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240394844756">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvia.NodeExpression" typeId="yvia.1215000036307:1" id="1240394844757" />
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_GetModelOperation" typeId="yvim.1143234257716:16" id="1240394844758" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1240394844759">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SModel%dgetModelDescriptor()%cjetbrains%dmps%dsmodel%dSModelDescriptor" resolveInfo="getModelDescriptor" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1240475845330">
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1240475845331">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1240926379307">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240926380144">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1240926379308">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1240394844740" resolveInfo="result" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvix.PutAllOperation" typeId="yvix.1240906768633:7" id="1240926381074">
                  <node role="map" roleId="yvix.1240906921264:7" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1240926384209">
                    <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="bjpd.~RefactoringUtil" resolveInfo="RefactoringUtil" />
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="bjpd.~RefactoringUtil%dgetLanguageAndItsExtendingLanguageModels(jetbrains%dmps%dproject%dMPSProject,jetbrains%dmps%dsmodel%dLanguage)%cjava%dutil%dMap" resolveInfo="getLanguageAndItsExtendingLanguageModels" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvia.ProjectExpression" typeId="yvia.1215084496797:1" id="1240926384210" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1240926384211">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1240394844751" resolveInfo="sourceLanguage" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotEqualsExpression" typeId="yvor.1073239437375:3" id="1240475847663">
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1240475848400" />
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1240475846787">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1240394844751" resolveInfo="sourceLanguage" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1240394844773">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1240394844774">
            <property name="name" nameId="yvnu.1169194664001:0" value="targetLanguage" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1240394844775">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8n6q.~Language" resolveInfo="Language" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1240394844776">
              <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="8n6q.~Language" resolveInfo="Language" />
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~Language%dgetLanguageFor(jetbrains%dmps%dsmodel%dSModelDescriptor)%cjetbrains%dmps%dsmodel%dLanguage" resolveInfo="getLanguageFor" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240394844777">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvim.SemanticDowncastExpression" typeId="yvim.1145404486709:16" id="1240394844778">
                  <node role="leftExpression" roleId="yvim.1145404616321:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240394844779">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvia.RequiredAdditionalArgumentReference" typeId="yvia.1189694084608:1" id="1240394857181">
                      <link role="argument" roleId="yvia.1189694099406:1" targetNodeId="1198776978561" resolveInfo="targetConcept" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_GetModelOperation" typeId="yvim.1143234257716:16" id="1240394844781" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1240394844782">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SModel%dgetModelDescriptor()%cjetbrains%dmps%dsmodel%dSModelDescriptor" resolveInfo="getModelDescriptor" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1240475852746">
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1240475852747">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1240926389340">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240926389678">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1240926389341">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1240394844740" resolveInfo="result" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvix.PutAllOperation" typeId="yvix.1240906768633:7" id="1240926391081">
                  <node role="map" roleId="yvix.1240906921264:7" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1240926393433">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="bjpd.~RefactoringUtil%dgetLanguageAndItsExtendingLanguageModels(jetbrains%dmps%dproject%dMPSProject,jetbrains%dmps%dsmodel%dLanguage)%cjava%dutil%dMap" resolveInfo="getLanguageAndItsExtendingLanguageModels" />
                    <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="bjpd.~RefactoringUtil" resolveInfo="RefactoringUtil" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvia.ProjectExpression" typeId="yvia.1215084496797:1" id="1240926393434" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1240926393435">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1240394844774" resolveInfo="targetLanguage" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotEqualsExpression" typeId="yvor.1073239437375:3" id="1240475855079">
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1240475855816" />
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1240475854547">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1240394844774" resolveInfo="targetLanguage" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1240394844796">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1240394844797">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1240394844740" resolveInfo="result" />
          </node>
        </node>
      </node>
    </node>
  </root>
  <root id="1201019507868">
    <node role="internalArguments" roleId="yvia.1189696093619:1" type="yvia.RequiredAdditionalArgument" typeId="yvia.1189693830529:1" id="7754459869734029548">
      <property name="name" nameId="yvnu.1169194664001:0" value="nodeAspects" />
      <node role="argumentType" roleId="yvia.1190637130098:1" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="7754459869734029550" />
    </node>
    <node role="affectedNodesClause" roleId="yvia.1200932683928:1" type="yvia.AffectedNodesClause" typeId="yvia.1200932465350:1" id="1201019642858">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1201019642859">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.SingleLineComment" typeId="yvor.6329021646629104954:3" id="7376433222636453715">
          <node role="commentPart" roleId="yvor.6329021646629175155:3" type="yvor.TextCommentPart" typeId="yvor.6329021646629104957:3" id="7376433222636453716">
            <property name="text" nameId="yvor.6329021646629104958:3" value="all usages excluding concept's aspects" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="7754459869734029552">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="7754459869734029554">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7754459869734029558">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvia.NodeExpression" typeId="yvia.1215000036307:1" id="7754459869734029557" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ConceptMethodCall" typeId="yvim.1179409122411:16" id="7754459869734029565">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvnv.7754459869734028917" resolveInfo="findAllAspects" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="7754459869734029567">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="txlh.~GlobalScope%dgetInstance()%cjetbrains%dmps%dproject%dGlobalScope" resolveInfo="getInstance" />
                  <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="txlh.~GlobalScope" resolveInfo="GlobalScope" />
                </node>
              </node>
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvia.RequiredAdditionalArgumentReference" typeId="yvia.1189694084608:1" id="7754459869734029553">
              <link role="argument" roleId="yvia.1189694099406:1" targetNodeId="7754459869734029548" resolveInfo="nodeAspects" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.Statement" typeId="yvor.1068580123157:3" id="2621449412039967484" />
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="2621449412039967466">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="2621449412039967467">
            <property name="name" nameId="yvnu.1169194664001:0" value="searchResults" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="2621449412039967468">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="1alo.~SearchResults" resolveInfo="SearchResults" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="2621449412039967505">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="2621449412039967506">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1alo.~SearchResults%d&lt;init&gt;()" resolveInfo="SearchResults" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="2621449412039967522">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2621449412039967524">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="2621449412039967523">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2621449412039967467" resolveInfo="searchResults" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="2621449412039967528">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1alo.~SearchResults%daddAll(jetbrains%dmps%dide%dfindusages%dmodel%dSearchResults)%cvoid" resolveInfo="addAll" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvia.ExecuteFindersExpression" typeId="yvia.1212242396240:1" id="2621449412039967537">
                <node role="finders" roleId="yvia.1212242658590:1" type="yvia.FinderReference" typeId="yvia.1212242507771:1" id="2621449412039967538">
                  <link role="finderDeclaration" roleId="yvia.1212242603178:1" targetNodeId="yvnt.1197632773078" resolveInfo="ConceptInstances" />
                </node>
                <node role="finders" roleId="yvia.1212242658590:1" type="yvia.FinderReference" typeId="yvia.1212242507771:1" id="2621449412039967539">
                  <link role="finderDeclaration" roleId="yvia.1212242603178:1" targetNodeId="yvnt.1198430852441" resolveInfo="NodeAndDescendantsUsages" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvix.ForEachStatement" typeId="yvix.1153943597977:7" id="2621449412039967543">
          <node role="variable" roleId="yvix.1153944400369:7" type="yvix.ForEachVariable" typeId="yvix.1153944193378:7" id="2621449412039967544">
            <property name="name" nameId="yvnu.1169194664001:0" value="aspect" />
          </node>
          <node role="inputSequence" roleId="yvix.1153944424730:7" type="yvor.ParenthesizedExpression" typeId="yvor.1079359253375:3" id="2621449412039981733">
            <node role="expression" roleId="yvor.1079359253376:3" type="yvor.CastExpression" typeId="yvor.1070534934090:3" id="2621449412039981734">
              <node role="expression" roleId="yvor.1070534934092:3" type="yvia.RequiredAdditionalArgumentReference" typeId="yvia.1189694084608:1" id="2621449412039981735">
                <link role="argument" roleId="yvia.1189694099406:1" targetNodeId="7754459869734029548" resolveInfo="nodeAspects" />
              </node>
              <node role="type" roleId="yvor.1070534934091:3" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="2621449412039981742" />
            </node>
          </node>
          <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="2621449412039967546">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="2621449412039967550">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2621449412039967551">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="2621449412039967552">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2621449412039967467" resolveInfo="searchResults" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="2621449412039967553">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1alo.~SearchResults%daddAll(jetbrains%dmps%dide%dfindusages%dmodel%dSearchResults)%cvoid" resolveInfo="addAll" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvia.ExecuteFindersExpression" typeId="yvia.1212242396240:1" id="2621449412039967554">
                    <node role="finders" roleId="yvia.1212242658590:1" type="yvia.FinderReference" typeId="yvia.1212242507771:1" id="2621449412039967556">
                      <link role="finderDeclaration" roleId="yvia.1212242603178:1" targetNodeId="yvnt.1198430852441" resolveInfo="NodeAndDescendantsUsages" />
                    </node>
                    <node role="searchNode" roleId="yvia.1212242678419:1" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="2621449412039967559">
                      <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="2621449412039967544" resolveInfo="aspect" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.Statement" typeId="yvor.1068580123157:3" id="2621449412039967578" />
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="7754459869734029524">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="7754459869734029525">
            <property name="name" nameId="yvnu.1169194664001:0" value="searchResultsList" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.ListType" typeId="yvix.1151688443754:7" id="7754459869734029526">
              <node role="elementType" roleId="yvix.1151688676805:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="7754459869734029527">
                <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="1alo.~SearchResult" resolveInfo="SearchResult" />
                <node role="parameter" roleId="yvor.1109201940907:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="7754459869734029528">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8n6q.~SNode" resolveInfo="SNode" />
                </node>
              </node>
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7754459869734029529">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7754459869734029530">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2621449412039967467" resolveInfo="searchResults" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="7754459869734029531">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1alo.~SearchResults%dgetSearchResults()%cjava%dutil%dList" resolveInfo="getSearchResults" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="7754459869734087573">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="7754459869734087574">
            <property name="name" nameId="yvnu.1169194664001:0" value="searchResultsCopy" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.ListType" typeId="yvix.1151688443754:7" id="7754459869734087575">
              <node role="elementType" roleId="yvix.1151688676805:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="7754459869734087576">
                <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="1alo.~SearchResult" resolveInfo="SearchResult" />
                <node role="parameter" roleId="yvor.1109201940907:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="7754459869734087577">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8n6q.~SNode" resolveInfo="SNode" />
                </node>
              </node>
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="7754459869734087578">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvix.ListCreatorWithInit" typeId="yvix.1160600644654:7" id="7754459869734087579">
                <node role="elementType" roleId="yvix.1237721435807:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="7754459869734087580">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="1alo.~SearchResult" resolveInfo="SearchResult" />
                  <node role="parameter" roleId="yvor.1109201940907:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="7754459869734087581">
                    <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8n6q.~SNode" resolveInfo="SNode" />
                  </node>
                </node>
                <node role="copyFrom" roleId="yvix.1237731803878:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7754459869734087582">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7754459869734029525" resolveInfo="searchResultsList" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.Statement" typeId="yvor.1068580123157:3" id="7754459869734087614" />
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ForeachStatement" typeId="yvor.1144226303539:3" id="7754459869734029435">
          <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="7754459869734029436">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="7754459869734087540">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="7754459869734087541">
                <property name="name" nameId="yvnu.1169194664001:0" value="containingRoot" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="7754459869734087542">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8n6q.~SNode" resolveInfo="SNode" />
                </node>
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7754459869734087543">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7754459869734087544">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7754459869734087545">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7754459869734029456" resolveInfo="searchResult" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="7754459869734087546">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1alo.~SearchResult%dgetObject()%cjava%dlang%dObject" resolveInfo="getObject" />
                    </node>
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="7754459869734087547">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SNode%dgetContainingRoot()%cjetbrains%dmps%dsmodel%dSNode" resolveInfo="getContainingRoot" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="7754459869734087551">
              <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="7754459869734087552">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="7754459869734087566">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7754459869734087567">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7754459869734087568">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2621449412039967467" resolveInfo="searchResults" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="7754459869734087569">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1alo.~SearchResults%dremove(java%dlang%dObject)%cvoid" resolveInfo="remove" />
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7754459869734087570">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7754459869734029456" resolveInfo="searchResult" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7754459869734087556">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvia.RequiredAdditionalArgumentReference" typeId="yvia.1189694084608:1" id="7754459869734087555">
                  <link role="argument" roleId="yvia.1189694099406:1" targetNodeId="7754459869734029548" resolveInfo="nodeAspects" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvix.ContainsOperation" typeId="yvix.1172254888721:7" id="7754459869734087563">
                  <node role="argument" roleId="yvix.1172256416782:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7754459869734087565">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7754459869734087541" resolveInfo="containingRoot" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="iterable" roleId="yvor.1144226360166:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7754459869734087583">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7754459869734087574" resolveInfo="searchResultsCopy" />
          </node>
          <node role="variable" roleId="yvor.1144230900587:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="7754459869734029456">
            <property name="name" nameId="yvnu.1169194664001:0" value="searchResult" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="7754459869734029457">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="1alo.~SearchResult" resolveInfo="SearchResult" />
              <node role="parameter" roleId="yvor.1109201940907:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="7754459869734029458">
                <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8n6q.~SNode" resolveInfo="SNode" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.Statement" typeId="yvor.1068580123157:3" id="7754459869734029546" />
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1210944469240">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1210944486581">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2621449412039967467" resolveInfo="searchResults" />
          </node>
        </node>
      </node>
    </node>
    <node role="doRefactorClause" roleId="yvia.1189695170518:1" type="yvia.DoRefactorClause" typeId="yvia.1189694053795:1" id="1201021907869">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1201021907870">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ForeachStatement" typeId="yvor.1144226303539:3" id="7754459869734190610">
          <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="7754459869734190611">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="7754459869734190627">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7754459869734190629">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7754459869734190628">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7754459869734190614" resolveInfo="aspectNode" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_DeleteOperation" typeId="yvim.1140133623887:16" id="7754459869734190633" />
              </node>
            </node>
          </node>
          <node role="iterable" roleId="yvor.1144226360166:3" type="yvor.ParenthesizedExpression" typeId="yvor.1079359253375:3" id="7754459869734196742">
            <node role="expression" roleId="yvor.1079359253376:3" type="yvor.CastExpression" typeId="yvor.1070534934090:3" id="7754459869734196743">
              <node role="expression" roleId="yvor.1070534934092:3" type="yvia.RequiredAdditionalArgumentReference" typeId="yvia.1189694084608:1" id="7754459869734196744">
                <link role="argument" roleId="yvia.1189694099406:1" targetNodeId="7754459869734029548" resolveInfo="nodeAspects" />
              </node>
              <node role="type" roleId="yvor.1070534934091:3" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="7754459869734196747" />
            </node>
          </node>
          <node role="variable" roleId="yvor.1144230900587:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="7754459869734190614">
            <property name="name" nameId="yvnu.1169194664001:0" value="aspectNode" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="7754459869734190622" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1201022931761">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1203721648132">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvia.NodeExpression" typeId="yvia.1215000036307:1" id="7754459869734176339" />
            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_DeleteOperation" typeId="yvim.1140133623887:16" id="1201022934173" />
          </node>
        </node>
      </node>
    </node>
    <node role="getModelsToGenerateClause" roleId="yvia.1191591935289:1" type="yvia.GetModelsToGenerateClause" typeId="yvia.1191591349007:1" id="1201265985667">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1201265985668">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1240394932408">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1240394932409">
            <property name="name" nameId="yvnu.1169194664001:0" value="result" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.MapType" typeId="yvix.1197683403723:7" id="1240394932410">
              <node role="keyType" roleId="yvix.1197683466920:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1240394932411">
                <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="txlh.~IModule" resolveInfo="IModule" />
              </node>
              <node role="valueType" roleId="yvix.1197683475734:7" type="yvix.ListType" typeId="yvix.1151688443754:7" id="1240394932412">
                <node role="elementType" roleId="yvix.1151688676805:7" type="yvim.SModelType" typeId="yvim.1143226024141:16" id="1240394932413" />
              </node>
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1240397356880">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvix.LinkedHashMapCreator" typeId="yvix.1240216724530:7" id="1240397356881">
                <node role="keyType" roleId="yvix.1197687026896:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1240397356882">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="txlh.~IModule" resolveInfo="IModule" />
                </node>
                <node role="valueType" roleId="yvix.1197687035757:7" type="yvix.ListType" typeId="yvix.1151688443754:7" id="1240397356883">
                  <node role="elementType" roleId="yvix.1151688676805:7" type="yvim.SModelType" typeId="yvim.1143226024141:16" id="1240397356884" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1240394932419">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1240394932420">
            <property name="name" nameId="yvnu.1169194664001:0" value="sourceLanguage" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1240394932421">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8n6q.~Language" resolveInfo="Language" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1240394932422">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~Language%dgetLanguageFor(jetbrains%dmps%dsmodel%dSModelDescriptor)%cjetbrains%dmps%dsmodel%dLanguage" resolveInfo="getLanguageFor" />
              <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="8n6q.~Language" resolveInfo="Language" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240394932423">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvim.SemanticDowncastExpression" typeId="yvim.1145404486709:16" id="1240394932424">
                  <node role="leftExpression" roleId="yvim.1145404616321:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240394932425">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvia.NodeExpression" typeId="yvia.1215000036307:1" id="1240394932426" />
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_GetModelOperation" typeId="yvim.1143234257716:16" id="1240394932427" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1240394932428">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SModel%dgetModelDescriptor()%cjetbrains%dmps%dsmodel%dSModelDescriptor" resolveInfo="getModelDescriptor" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1240475892988">
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1240475892989">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1240926441370">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240926445834">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1240926441371">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1240394932409" resolveInfo="result" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvix.PutAllOperation" typeId="yvix.1240906768633:7" id="1240926447104">
                  <node role="map" roleId="yvix.1240906921264:7" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1240926449687">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="bjpd.~RefactoringUtil%dgetLanguageModels(jetbrains%dmps%dproject%dMPSProject,jetbrains%dmps%dsmodel%dLanguage)%cjava%dutil%dMap" resolveInfo="getLanguageModels" />
                    <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="bjpd.~RefactoringUtil" resolveInfo="RefactoringUtil" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvia.ProjectExpression" typeId="yvia.1215084496797:1" id="1240926449688" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1240926449689">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1240394932420" resolveInfo="sourceLanguage" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotEqualsExpression" typeId="yvor.1073239437375:3" id="1240475895336">
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1240475896121" />
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1240475894898">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1240394932420" resolveInfo="sourceLanguage" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="7754459869734176360">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7754459869734176362">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1240394932409" resolveInfo="result" />
          </node>
        </node>
      </node>
    </node>
  </root>
  <root id="1201283571431">
    <node role="internalArguments" roleId="yvia.1189696093619:1" type="yvia.RequiredAdditionalArgument" typeId="yvia.1189693830529:1" id="1215001925245">
      <property name="name" nameId="yvnu.1169194664001:0" value="sourceLanguage" />
      <node role="argumentType" roleId="yvia.1190637130098:1" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1215001925246">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8n6q.~Language" resolveInfo="Language" />
      </node>
    </node>
    <node role="affectedNodesClause" roleId="yvia.1200932683928:1" type="yvia.AffectedNodesClause" typeId="yvia.1200932465350:1" id="1201283678685">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1201283678686">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1215002157841">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1215002157842">
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvia.RequiredAdditionalArgumentReference" typeId="yvia.1189694084608:1" id="1215002157843">
              <link role="argument" roleId="yvia.1189694099406:1" targetNodeId="1215001925245" resolveInfo="sourceLanguage" />
            </node>
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1215002157844">
              <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="8n6q.~Language" resolveInfo="Language" />
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~Language%dgetLanguageFor(jetbrains%dmps%dsmodel%dSModelDescriptor)%cjetbrains%dmps%dsmodel%dLanguage" resolveInfo="getLanguageFor" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1215002157845">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvim.SemanticDowncastExpression" typeId="yvim.1145404486709:16" id="1215002157846">
                  <node role="leftExpression" roleId="yvim.1145404616321:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1215002157847">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvia.NodeExpression" typeId="yvia.1215000036307:1" id="1215002188035" />
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_GetModelOperation" typeId="yvim.1143234257716:16" id="1215002157849" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1215002157850">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SModel%dgetModelDescriptor()%cjetbrains%dmps%dsmodel%dSModelDescriptor" resolveInfo="getModelDescriptor" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1210944534119">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvia.ExecuteFindersExpression" typeId="yvia.1212242396240:1" id="1212246460853">
            <node role="finders" roleId="yvia.1212242658590:1" type="yvia.FinderReference" typeId="yvia.1212242507771:1" id="1212246468558">
              <link role="finderDeclaration" roleId="yvia.1212242603178:1" targetNodeId="yvnt.1201275992898" resolveInfo="LinkExamples" />
            </node>
            <node role="finders" roleId="yvia.1212242658590:1" type="yvia.FinderReference" typeId="yvia.1212242507771:1" id="1212246471403">
              <link role="finderDeclaration" roleId="yvia.1212242603178:1" targetNodeId="yvnt.1198430852441" resolveInfo="NodeAndDescendantsUsages" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="getModelsToGenerateClause" roleId="yvia.1191591935289:1" type="yvia.GetModelsToGenerateClause" typeId="yvia.1191591349007:1" id="1201283765827">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1201283765828">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1240395196618">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1240395196619">
            <property name="name" nameId="yvnu.1169194664001:0" value="result" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.MapType" typeId="yvix.1197683403723:7" id="1240395196620">
              <node role="keyType" roleId="yvix.1197683466920:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1240395196621">
                <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="txlh.~IModule" resolveInfo="IModule" />
              </node>
              <node role="valueType" roleId="yvix.1197683475734:7" type="yvix.ListType" typeId="yvix.1151688443754:7" id="1240395196622">
                <node role="elementType" roleId="yvix.1151688676805:7" type="yvim.SModelType" typeId="yvim.1143226024141:16" id="1240395196623" />
              </node>
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1240397365362">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvix.LinkedHashMapCreator" typeId="yvix.1240216724530:7" id="1240397365363">
                <node role="keyType" roleId="yvix.1197687026896:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1240397365364">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="txlh.~IModule" resolveInfo="IModule" />
                </node>
                <node role="valueType" roleId="yvix.1197687035757:7" type="yvix.ListType" typeId="yvix.1151688443754:7" id="1240397365365">
                  <node role="elementType" roleId="yvix.1151688676805:7" type="yvim.SModelType" typeId="yvim.1143226024141:16" id="1240397365366" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1240395196629">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1240395196630">
            <property name="name" nameId="yvnu.1169194664001:0" value="sourceLanguage" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1240395196631">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8n6q.~Language" resolveInfo="Language" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1240395196632">
              <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="8n6q.~Language" resolveInfo="Language" />
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~Language%dgetLanguageFor(jetbrains%dmps%dsmodel%dSModelDescriptor)%cjetbrains%dmps%dsmodel%dLanguage" resolveInfo="getLanguageFor" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240395196633">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvim.SemanticDowncastExpression" typeId="yvim.1145404486709:16" id="1240395196634">
                  <node role="leftExpression" roleId="yvim.1145404616321:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240395196635">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvia.NodeExpression" typeId="yvia.1215000036307:1" id="1240395196636" />
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_GetModelOperation" typeId="yvim.1143234257716:16" id="1240395196637" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1240395196638">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SModel%dgetModelDescriptor()%cjetbrains%dmps%dsmodel%dSModelDescriptor" resolveInfo="getModelDescriptor" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1240475901627">
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1240475901628">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1240926459222">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1240926461497">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1240926459223">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1240395196619" resolveInfo="result" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvix.PutAllOperation" typeId="yvix.1240906768633:7" id="1240926465635">
                  <node role="map" roleId="yvix.1240906921264:7" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1240926469179">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="bjpd.~RefactoringUtil%dgetLanguageModels(jetbrains%dmps%dproject%dMPSProject,jetbrains%dmps%dsmodel%dLanguage)%cjava%dutil%dMap" resolveInfo="getLanguageModels" />
                    <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="bjpd.~RefactoringUtil" resolveInfo="RefactoringUtil" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvia.ProjectExpression" typeId="yvia.1215084496797:1" id="1240926469180" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1240926469181">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1240395196630" resolveInfo="sourceLanguage" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotEqualsExpression" typeId="yvor.1073239437375:3" id="1240475906132">
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1240475906963" />
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1240475905224">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1240395196630" resolveInfo="sourceLanguage" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="6528618226609613286">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="6528618226609613288">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1240395196619" resolveInfo="result" />
          </node>
        </node>
      </node>
    </node>
    <node role="doRefactorClause" roleId="yvia.1189695170518:1" type="yvia.DoRefactorClause" typeId="yvia.1189694053795:1" id="1201283785915">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1201283785916">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvia.DeleteFeatureOperation" typeId="yvia.1204722970897:1" id="1204725627551">
          <node role="feature" roleId="yvia.1204722988476:1" type="yvia.NodeExpression" typeId="yvia.1215000036307:1" id="6528618226609613284" />
        </node>
      </node>
    </node>
    <node role="updateModelClause" roleId="yvia.1189695176456:1" type="yvia.UpdateModelClause" typeId="yvia.1189694434958:1" id="1204731600803">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1204731600804">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvia.UpdateModelByDefaultOperation" typeId="yvia.1197382578687:1" id="1204731622795" />
      </node>
    </node>
  </root>
  <root id="4975090607137555731">
    <node role="part" roleId="yvj3.1177458178889:0" type="yvj3.MigrationScriptPart_Instance" typeId="yvj3.1177457850499:0" id="4975090607137555732">
      <property name="description" nameId="yvj3.1177457972041:0" value="Fix Root Concepts' Aliases" />
      <link role="affectedInstanceConcept" roleId="yvj3.1177457957477:0" targetNodeId="yvnr.1071489090640:0" resolveInfo="ConceptDeclaration" />
      <node role="affectedInstanceUpdater" roleId="yvj3.1177458005323:0" type="yvj3.MigrationScriptPart_Instance_Updater" typeId="yvj3.1177458491964:0" id="4975090607137555733">
        <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="4975090607137555734">
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="9161136784551155301">
            <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="9161136784551155302">
              <property name="name" nameId="yvnu.1169194664001:0" value="aliasProperty" />
              <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="9161136784551155303">
                <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvnr.1105725638761:0" resolveInfo="StringConceptProperty" />
              </node>
              <node role="initializer" roleId="yvor.1068431790190:3" type="yvim.SNodeTypeCastExpression" typeId="yvim.1140137987495:16" id="9161136784551155304">
                <link role="concept" roleId="yvim.1140138128738:16" targetNodeId="yvnr.1105725638761:0" resolveInfo="StringConceptProperty" />
                <node role="leftExpression" roleId="yvim.1140138123956:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="9161136784551155305">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="9161136784551155306">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="9161136784551155307">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvj3.MigrationScriptPart_node" typeId="yvj3.1177458237937:0" id="9161136784551155308" />
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkListAccess" typeId="yvim.1138056282393:16" id="9161136784551155309">
                        <link role="link" roleId="yvim.1138056546658:16" targetNodeId="yvnr.1105725339613:0" />
                      </node>
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvix.WhereOperation" typeId="yvix.1202120902084:7" id="9161136784551155310">
                      <node role="closure" roleId="yvix.1204796294226:7" type="yviq.ClosureLiteral" typeId="yviq.1199569711397:3" id="9161136784551155311">
                        <node role="body" roleId="yviq.1199569916463:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="9161136784551155312">
                          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="9161136784551155313">
                            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AndExpression" typeId="yvor.1080120340718:3" id="9161136784551155314">
                              <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="9161136784551155315">
                                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="9161136784551155316">
                                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="9161136784551155317">
                                    <node role="operand" roleId="yvor.1197027771414:3" type="yvim.SNodeTypeCastExpression" typeId="yvim.1140137987495:16" id="9161136784551155318">
                                      <link role="concept" roleId="yvim.1140138128738:16" targetNodeId="yvnr.1105725638761:0" resolveInfo="StringConceptProperty" />
                                      <node role="leftExpression" roleId="yvim.1140138123956:16" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="9161136784551155319">
                                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="9161136784551155328" resolveInfo="it" />
                                      </node>
                                    </node>
                                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="9161136784551155320">
                                      <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvnr.1105725659058:0" />
                                    </node>
                                  </node>
                                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="9161136784551155321">
                                    <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvnu.1169194664001:0" resolveInfo="name" />
                                  </node>
                                </node>
                                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="9161136784551155322">
                                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vhgx.~String%dequals(java%dlang%dObject)%cboolean" resolveInfo="equals" />
                                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="9161136784551155323">
                                    <property name="value" nameId="yvor.1070475926801:3" value="alias" />
                                  </node>
                                </node>
                              </node>
                              <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="9161136784551155324">
                                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="9161136784551155325">
                                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="9161136784551155328" resolveInfo="it" />
                                </node>
                                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_IsInstanceOfOperation" typeId="yvim.1139621453865:16" id="9161136784551155326">
                                  <node role="conceptArgument" roleId="yvim.1177027386292:16" type="yvim.RefConcept_Reference" typeId="yvim.1177026924588:16" id="9161136784551155327">
                                    <link role="conceptDeclaration" roleId="yvim.1177026940964:16" targetNodeId="yvnr.1105725638761:0" resolveInfo="StringConceptProperty" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="parameter" roleId="yviq.1199569906740:3" type="yvix.SmartClosureParameterDeclaration" typeId="yvix.1203518072036:7" id="9161136784551155328">
                          <property name="name" nameId="yvnu.1169194664001:0" value="it" />
                          <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.WildCardType" typeId="yvor.1171903607971:3" id="9161136784551155329" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetFirstOperation" typeId="yvix.1165525191778:7" id="9161136784551155330" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="9161136784551302798">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="9161136784551302799">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="9161136784551302800">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="9161136784551302801">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="9161136784551155302" resolveInfo="aliasProperty" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="9161136784551302802">
                  <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvnr.1105725733873:0" resolveInfo="value" />
                </node>
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Property_SetOperation" typeId="yvim.1138661924179:16" id="9161136784551302803">
                <node role="value" roleId="yvim.1138662048170:16" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="9161136784551302804">
                  <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="6eoo.~NameUtil" resolveInfo="NameUtil" />
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="6eoo.~NameUtil%dmultiWordDecapitalize(java%dlang%dString)%cjava%dlang%dString" resolveInfo="multiWordDecapitalize" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="9161136784551302805">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvj3.MigrationScriptPart_node" typeId="yvj3.1177458237937:0" id="9161136784551302806" />
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SConceptPropertyAccess" typeId="yvim.1145994841052:16" id="9161136784551302807">
                      <link role="conceptProperty" roleId="yvim.1145994841055:16" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="affectedInstancePredicate" roleId="yvj3.1177457957478:0" type="yvj3.MigrationScriptPart_Instance_Predicate" typeId="yvj3.1177458061340:0" id="4975090607137661795">
        <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="4975090607137661796">
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="4975090607137661806">
            <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4975090607137661810">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvj3.MigrationScriptPart_node" typeId="yvj3.1177458237937:0" id="4975090607137661809" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SConceptPropertyAccess" typeId="yvim.1145994841052:16" id="4975090607137661814">
                <link role="conceptProperty" roleId="yvim.1145994841055:16" targetNodeId="yvnu.1137473854053:0" resolveInfo="abstract" />
              </node>
            </node>
            <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="4975090607137661808">
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="4975090607137661815">
                <node role="expression" roleId="yvor.1068581517676:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="4975090607137661817">
                  <property name="value" nameId="yvor.1068580123138:3" value="false" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="4975090607137725253">
            <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="4975090607137725254">
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="4975090607137727009">
                <node role="expression" roleId="yvor.1068581517676:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="4975090607137727011">
                  <property name="value" nameId="yvor.1068580123138:3" value="false" />
                </node>
              </node>
            </node>
            <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotExpression" typeId="yvor.1081516740877:3" id="4975090607137727005">
              <node role="expression" roleId="yvor.1081516765348:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4975090607137727006">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvj3.MigrationScriptPart_node" typeId="yvj3.1177458237937:0" id="4975090607137727007" />
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="4975090607137727008">
                  <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvnr.1096454100552:0" resolveInfo="rootable" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="4975090607137661819">
            <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="4975090607137661820">
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="4975090607137662194">
                <node role="expression" roleId="yvor.1068581517676:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="9161136784551302528">
                  <property name="value" nameId="yvor.1068580123138:3" value="false" />
                </node>
              </node>
            </node>
            <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4975090607137661832">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4975090607137661824">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvj3.MigrationScriptPart_node" typeId="yvj3.1177458237937:0" id="4975090607137661823" />
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SConceptPropertyAccess" typeId="yvim.1145994841052:16" id="9161136784551149891">
                  <link role="conceptProperty" roleId="yvim.1145994841055:16" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
                </node>
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.IsEmptyOperation" typeId="yvor.1225271369338:3" id="9161136784551150249" />
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="4975090607137662199">
            <node role="expression" roleId="yvor.1068581517676:3" type="yvor.NotExpression" typeId="yvor.1081516740877:3" id="4975090607137834647">
              <node role="expression" roleId="yvor.1081516765348:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4975090607137834648">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4975090607137834649">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvj3.MigrationScriptPart_node" typeId="yvj3.1177458237937:0" id="4975090607137834650" />
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SConceptPropertyAccess" typeId="yvim.1145994841052:16" id="9161136784551150250">
                    <link role="conceptProperty" roleId="yvim.1145994841055:16" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="4975090607137834652">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vhgx.~String%dequals(java%dlang%dObject)%cboolean" resolveInfo="equals" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="4975090607137834653">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="6eoo.~NameUtil%dmultiWordDecapitalize(java%dlang%dString)%cjava%dlang%dString" resolveInfo="multiWordDecapitalize" />
                    <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="6eoo.~NameUtil" resolveInfo="NameUtil" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4975090607137834654">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvj3.MigrationScriptPart_node" typeId="yvj3.1177458237937:0" id="4975090607137834655" />
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SConceptPropertyAccess" typeId="yvim.1145994841052:16" id="9161136784551155339">
                        <link role="conceptProperty" roleId="yvim.1145994841055:16" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
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
    <node role="part" roleId="yvj3.1177458178889:0" type="yvj3.MigrationScriptPart_Instance" typeId="yvj3.1177457850499:0" id="9161136784551302525">
      <property name="description" nameId="yvj3.1177457972041:0" value="Add Alias to Root Concepts" />
      <link role="affectedInstanceConcept" roleId="yvj3.1177457957477:0" targetNodeId="yvnr.1071489090640:0" resolveInfo="ConceptDeclaration" />
      <node role="affectedInstanceUpdater" roleId="yvj3.1177458005323:0" type="yvj3.MigrationScriptPart_Instance_Updater" typeId="yvj3.1177458491964:0" id="9161136784551302526">
        <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="9161136784551302527">
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="9161136784551302566">
            <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="9161136784551302567">
              <property name="name" nameId="yvnu.1169194664001:0" value="sb" />
              <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="9161136784551302568">
                <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~StringBuilder" resolveInfo="StringBuilder" />
              </node>
              <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="9161136784551302569">
                <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="9161136784551302570">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vhgx.~StringBuilder%d&lt;init&gt;()" resolveInfo="StringBuilder" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvix.ForEachStatement" typeId="yvix.1153943597977:7" id="9161136784551302571">
            <node role="variable" roleId="yvix.1153944400369:7" type="yvix.ForEachVariable" typeId="yvix.1153944193378:7" id="9161136784551302572">
              <property name="name" nameId="yvnu.1169194664001:0" value="word" />
            </node>
            <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="9161136784551302573">
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="9161136784551302574">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="9161136784551302575">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="9161136784551302576">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="9161136784551302577">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="9161136784551302567" resolveInfo="sb" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="9161136784551302578">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vhgx.~StringBuilder%dappend(java%dlang%dString)%cjava%dlang%dStringBuilder" resolveInfo="append" />
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="9161136784551302579">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="6eoo.~NameUtil%ddecapitalize(java%dlang%dString)%cjava%dlang%dString" resolveInfo="decapitalize" />
                        <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="6eoo.~NameUtil" resolveInfo="NameUtil" />
                        <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="9161136784551302580">
                          <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="9161136784551302572" resolveInfo="word" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="9161136784551302581">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vhgx.~StringBuilder%dappend(java%dlang%dString)%cjava%dlang%dStringBuilder" resolveInfo="append" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="9161136784551302582">
                      <property name="value" nameId="yvor.1070475926801:3" value=" " />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="inputSequence" roleId="yvix.1153944424730:7" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="9161136784551302583">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="6eoo.~NameUtil%dsplitByCamels(java%dlang%dString)%cjava%dutil%dList" resolveInfo="splitByCamels" />
              <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="6eoo.~NameUtil" resolveInfo="NameUtil" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="9161136784551302584">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvj3.MigrationScriptPart_node" typeId="yvj3.1177458237937:0" id="9161136784551302585" />
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="9161136784551302586">
                  <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvnu.1169194664001:0" resolveInfo="name" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="9161136784551302759">
            <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="9161136784551302760">
              <property name="name" nameId="yvnu.1169194664001:0" value="aliasProperty" />
              <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="9161136784551302761">
                <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvnr.1105725638761:0" resolveInfo="StringConceptProperty" />
              </node>
              <node role="initializer" roleId="yvor.1068431790190:3" type="yvim.SNodeTypeCastExpression" typeId="yvim.1140137987495:16" id="9161136784551302762">
                <link role="concept" roleId="yvim.1140138128738:16" targetNodeId="yvnr.1105725638761:0" resolveInfo="StringConceptProperty" />
                <node role="leftExpression" roleId="yvim.1140138123956:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="9161136784551302763">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="9161136784551302764">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="9161136784551302765">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvj3.MigrationScriptPart_node" typeId="yvj3.1177458237937:0" id="9161136784551302766" />
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkListAccess" typeId="yvim.1138056282393:16" id="9161136784551302767">
                        <link role="link" roleId="yvim.1138056546658:16" targetNodeId="yvnr.1105725339613:0" />
                      </node>
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvix.WhereOperation" typeId="yvix.1202120902084:7" id="9161136784551302768">
                      <node role="closure" roleId="yvix.1204796294226:7" type="yviq.ClosureLiteral" typeId="yviq.1199569711397:3" id="9161136784551302769">
                        <node role="body" roleId="yviq.1199569916463:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="9161136784551302770">
                          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="9161136784551302771">
                            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AndExpression" typeId="yvor.1080120340718:3" id="9161136784551302772">
                              <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="9161136784551302773">
                                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="9161136784551302774">
                                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="9161136784551302775">
                                    <node role="operand" roleId="yvor.1197027771414:3" type="yvim.SNodeTypeCastExpression" typeId="yvim.1140137987495:16" id="9161136784551302776">
                                      <link role="concept" roleId="yvim.1140138128738:16" targetNodeId="yvnr.1105725638761:0" resolveInfo="StringConceptProperty" />
                                      <node role="leftExpression" roleId="yvim.1140138123956:16" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="9161136784551302777">
                                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="9161136784551302786" resolveInfo="it" />
                                      </node>
                                    </node>
                                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="9161136784551302778">
                                      <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvnr.1105725659058:0" />
                                    </node>
                                  </node>
                                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="9161136784551302779">
                                    <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvnu.1169194664001:0" resolveInfo="name" />
                                  </node>
                                </node>
                                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="9161136784551302780">
                                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vhgx.~String%dequals(java%dlang%dObject)%cboolean" resolveInfo="equals" />
                                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="9161136784551302781">
                                    <property name="value" nameId="yvor.1070475926801:3" value="alias" />
                                  </node>
                                </node>
                              </node>
                              <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="9161136784551302782">
                                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="9161136784551302783">
                                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="9161136784551302786" resolveInfo="it" />
                                </node>
                                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_IsInstanceOfOperation" typeId="yvim.1139621453865:16" id="9161136784551302784">
                                  <node role="conceptArgument" roleId="yvim.1177027386292:16" type="yvim.RefConcept_Reference" typeId="yvim.1177026924588:16" id="9161136784551302785">
                                    <link role="conceptDeclaration" roleId="yvim.1177026940964:16" targetNodeId="yvnr.1105725638761:0" resolveInfo="StringConceptProperty" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="parameter" roleId="yviq.1199569906740:3" type="yvix.SmartClosureParameterDeclaration" typeId="yvix.1203518072036:7" id="9161136784551302786">
                          <property name="name" nameId="yvnu.1169194664001:0" value="it" />
                          <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.WildCardType" typeId="yvor.1171903607971:3" id="9161136784551302787" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetFirstOperation" typeId="yvix.1165525191778:7" id="9161136784551302788" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="9161136784551302587">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="9161136784551302588">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="9161136784551302589">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="9161136784551302590">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="9161136784551302760" resolveInfo="aliasProperty" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="9161136784551302591">
                  <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvnr.1105725733873:0" resolveInfo="value" />
                </node>
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Property_SetOperation" typeId="yvim.1138661924179:16" id="9161136784551302592">
                <node role="value" roleId="yvim.1138662048170:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="9161136784551302593">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="9161136784551302594">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="9161136784551302595">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="9161136784551302567" resolveInfo="sb" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="9161136784551302596">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vhgx.~StringBuilder%dtoString()%cjava%dlang%dString" resolveInfo="toString" />
                    </node>
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="9161136784551302597">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vhgx.~String%dtrim()%cjava%dlang%dString" resolveInfo="trim" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="affectedInstancePredicate" roleId="yvj3.1177457957478:0" type="yvj3.MigrationScriptPart_Instance_Predicate" typeId="yvj3.1177458061340:0" id="9161136784551302529">
        <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="9161136784551302530">
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="9161136784551302531">
            <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="9161136784551302532">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvj3.MigrationScriptPart_node" typeId="yvj3.1177458237937:0" id="9161136784551302533" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SConceptPropertyAccess" typeId="yvim.1145994841052:16" id="9161136784551302534">
                <link role="conceptProperty" roleId="yvim.1145994841055:16" targetNodeId="yvnu.1137473854053:0" resolveInfo="abstract" />
              </node>
            </node>
            <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="9161136784551302535">
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="9161136784551302536">
                <node role="expression" roleId="yvor.1068581517676:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="9161136784551302537">
                  <property name="value" nameId="yvor.1068580123138:3" value="false" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="9161136784551302538">
            <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="9161136784551302539">
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="9161136784551302540">
                <node role="expression" roleId="yvor.1068581517676:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="9161136784551302541">
                  <property name="value" nameId="yvor.1068580123138:3" value="false" />
                </node>
              </node>
            </node>
            <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotExpression" typeId="yvor.1081516740877:3" id="9161136784551302542">
              <node role="expression" roleId="yvor.1081516765348:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="9161136784551302543">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvj3.MigrationScriptPart_node" typeId="yvj3.1177458237937:0" id="9161136784551302544" />
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="9161136784551302545">
                  <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvnr.1096454100552:0" resolveInfo="rootable" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="9161136784551302557">
            <node role="expression" roleId="yvor.1068581517676:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="9161136784551302559">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="9161136784551302560">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvj3.MigrationScriptPart_node" typeId="yvj3.1177458237937:0" id="9161136784551302561" />
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SConceptPropertyAccess" typeId="yvim.1145994841052:16" id="9161136784551302562">
                  <link role="conceptProperty" roleId="yvim.1145994841055:16" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
                </node>
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.IsEmptyOperation" typeId="yvor.1225271369338:3" id="9161136784551302563" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </root>
  <root id="5800912818421828062">
    <node role="staticMethod" roleId="yvor.1070462273904:3" type="yvor.StaticMethodDeclaration" typeId="yvor.1081236700938:3" id="1709900160195124941">
      <property name="name" nameId="yvnu.1169194664001:0" value="findLinkToMerge" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1709900160195127091">
        <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvnr.1071489288298:0" resolveInfo="LinkDeclaration" />
      </node>
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1709900160195124943" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1709900160195124944">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvix.ForEachStatement" typeId="yvix.1153943597977:7" id="1709900160195127097">
          <node role="variable" roleId="yvix.1153944400369:7" type="yvix.ForEachVariable" typeId="yvix.1153944193378:7" id="1709900160195127098">
            <property name="name" nameId="yvnu.1169194664001:0" value="linkDecl" />
          </node>
          <node role="inputSequence" roleId="yvix.1153944424730:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1709900160195127103">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1709900160195127102">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1709900160195127092" resolveInfo="concept" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ConceptMethodCall" typeId="yvim.1179409122411:16" id="1709900160195163001">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvnv.1213877394480" resolveInfo="getLinkDeclarations" />
            </node>
          </node>
          <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1709900160195127100">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1709900160195127110">
              <node role="condition" roleId="yvor.1068580123160:3" type="yvor.AndExpression" typeId="yvor.1080120340718:3" id="2893383476258780658">
                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2893383476258780703">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2893383476258780662">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="2893383476258780661">
                      <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="1709900160195127098" resolveInfo="linkDecl" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="2893383476258780702">
                      <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvnr.1071599976176:0" />
                    </node>
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Concept_IsSuperConceptOfOperation" typeId="yvim.1180028149140:16" id="2893383476258780707">
                    <node role="conceptArgument" roleId="yvim.1180028346304:16" type="yvim.PoundExpression" typeId="yvim.1204834851141:16" id="2893383476258780709">
                      <node role="expression" roleId="yvim.1204834868751:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2893383476258780712">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="2893383476258780711">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1709900160195127094" resolveInfo="linkNode" />
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="2893383476258780716">
                          <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvnr.1071599976176:0" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.AndExpression" typeId="yvor.1080120340718:3" id="1709900160195163020">
                  <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.EqualsExpression" typeId="yvor.1068580123152:3" id="1709900160195163007">
                    <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1709900160195127116">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="1709900160195127113">
                        <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="1709900160195127098" resolveInfo="linkDecl" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="1709900160195163004">
                        <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvnr.1071599937831:0" resolveInfo="metaClass" />
                      </node>
                    </node>
                    <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1709900160195163013">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1709900160195163011">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1709900160195127094" resolveInfo="linkNode" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="1709900160195163018">
                        <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvnr.1071599937831:0" resolveInfo="metaClass" />
                      </node>
                    </node>
                  </node>
                  <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1709900160195163038">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1709900160195163028">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="1709900160195163024">
                        <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="1709900160195127098" resolveInfo="linkDecl" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="1709900160195163035">
                        <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvnr.1071599776563:0" resolveInfo="role" />
                      </node>
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1709900160195163043">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vhgx.~String%dequals(java%dlang%dObject)%cboolean" resolveInfo="equals" />
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1709900160195163047">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1709900160195163045">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1709900160195127094" resolveInfo="linkNode" />
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="1709900160195163052">
                          <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvnr.1071599776563:0" resolveInfo="role" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1709900160195127112">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1709900160195163073">
                  <node role="expression" roleId="yvor.1068581517676:3" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="1709900160195163075">
                    <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="1709900160195127098" resolveInfo="linkDecl" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1709900160195163078">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1709900160195163082" />
        </node>
      </node>
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1709900160195127092">
        <property name="name" nameId="yvnu.1169194664001:0" value="concept" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1709900160195127093">
          <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvnr.1169125787135:0" resolveInfo="AbstractConceptDeclaration" />
        </node>
      </node>
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1709900160195127094">
        <property name="name" nameId="yvnu.1169194664001:0" value="linkNode" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1709900160195127096">
          <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvnr.1071489288298:0" resolveInfo="LinkDeclaration" />
        </node>
      </node>
    </node>
    <node role="staticMethod" roleId="yvor.1070462273904:3" type="yvor.StaticMethodDeclaration" typeId="yvor.1081236700938:3" id="8941943470987180068">
      <property name="name" nameId="yvnu.1169194664001:0" value="findPropertyToMerge" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="8941943470987180069">
        <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvnr.1071489288299:0" resolveInfo="PropertyDeclaration" />
      </node>
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="8941943470987180070" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8941943470987180071">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvix.ForEachStatement" typeId="yvix.1153943597977:7" id="8941943470987180072">
          <node role="variable" roleId="yvix.1153944400369:7" type="yvix.ForEachVariable" typeId="yvix.1153944193378:7" id="8941943470987180073">
            <property name="name" nameId="yvnu.1169194664001:0" value="propDecl" />
          </node>
          <node role="inputSequence" roleId="yvix.1153944424730:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8941943470987180074">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="8941943470987180075">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8941943470987180100" resolveInfo="concept" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ConceptMethodCall" typeId="yvim.1179409122411:16" id="8941943470987182255">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvnv.1213877394546" resolveInfo="getPropertyDeclarations" />
            </node>
          </node>
          <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8941943470987180077">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="8941943470987180078">
              <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8941943470987180087">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8941943470987180088">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="8941943470987180089">
                    <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="8941943470987180073" resolveInfo="linkDecl" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="8941943470987182258">
                    <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvnu.1169194664001:0" resolveInfo="name" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8941943470987180091">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vhgx.~String%dequals(java%dlang%dObject)%cboolean" resolveInfo="equals" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8941943470987180092">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="8941943470987180093">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8941943470987180102" resolveInfo="linkNode" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="8941943470987182260">
                      <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvnu.1169194664001:0" resolveInfo="name" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8941943470987180095">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="8941943470987180096">
                  <node role="expression" roleId="yvor.1068581517676:3" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="8941943470987180097">
                    <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="8941943470987180073" resolveInfo="linkDecl" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="8941943470987180098">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="8941943470987180099" />
        </node>
      </node>
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="8941943470987180100">
        <property name="name" nameId="yvnu.1169194664001:0" value="concept" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="8941943470987180101">
          <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvnr.1169125787135:0" resolveInfo="AbstractConceptDeclaration" />
        </node>
      </node>
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="8941943470987180102">
        <property name="name" nameId="yvnu.1169194664001:0" value="propNode" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="8941943470987180103">
          <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvnr.1071489288299:0" resolveInfo="PropertyDeclaration" />
        </node>
      </node>
    </node>
    <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="5800912818421828063" />
  </root>
</model>

