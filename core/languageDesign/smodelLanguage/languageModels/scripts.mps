<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.bootstrap.smodelLanguage.scripts">
  <persistence version="1" />
  <refactoringHistory />
  <language namespace="jetbrains.mps.baseLanguage">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.constraints" version="83" />
    <languageAspect modelUID="jetbrains.mps.baseLanguage.structure" version="0" />
  </language>
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage">
    <languageAspect modelUID="jetbrains.mps.bootstrap.smodelLanguage.constraints" version="21" />
    <languageAspect modelUID="jetbrains.mps.bootstrap.smodelLanguage.structure" version="1" />
  </language>
  <language namespace="jetbrains.mps.ide.scriptLanguage">
    <languageAspect modelUID="jetbrains.mps.ide.scriptLanguage.constraints" version="0" />
  </language>
  <language namespace="jetbrains.mps.baseLanguage.ext.collections.lang">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.constraints" version="6" />
    <languageAspect modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.structure" version="1" />
  </language>
  <languageAspect modelUID="jetbrains.mps.bootstrap.intentionsLanguage.constraints" version="1" />
  <languageAspect modelUID="jetbrains.mps.bootstrap.constraintsLanguage.structure" version="0" />
  <languageAspect modelUID="jetbrains.mps.closures.structure" version="0" />
  <languageAspect modelUID="jetbrains.mps.bootstrap.structureLanguage.constraints" version="11" />
  <languageAspect modelUID="jetbrains.mps.bootstrap.sharedConcepts.constraints" version="0" />
  <languageAspect modelUID="jetbrains.mps.closures.constraints" version="2" />
  <languageAspect modelUID="jetbrains.mps.core.constraints" version="2" />
  <languageAspect modelUID="jetbrains.mps.internal.collections.constraints" version="2" />
  <languageAspect modelUID="jetbrains.mps.bootstrap.editorLanguage.structure" version="25" />
  <maxImportIndex value="7" />
  <import index="1" modelUID="jetbrains.mps.bootstrap.smodelLanguage.structure" version="1" />
  <import index="2" modelUID="jetbrains.mps.bootstrap.structureLanguage.structure" version="-1" />
  <import index="4" modelUID="jetbrains.mps.baseLanguage.structure" version="0" />
  <node type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScript" id="1203640442563">
    <property name="name" value="Replace_SNodeOperationExpression" />
    <property name="title" value="Convert old SNodeOperationExpression" />
    <property name="category" value="DotExpression" />
    <property name="migrationFromBuild" value="470" />
    <node role="part" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_Instance" id="1203640759821">
      <property name="description" value="DotExpression: convert SNodeOperationExpression " />
      <link role="affectedInstanceConcept" targetNodeId="1.1138055978872" resolveInfo="SNodeOperationExpression" />
      <node role="affectedInstanceUpdater" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_Instance_Updater" id="1203640759824">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1203640759825">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1203640842646">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1203640842647">
              <property name="name" value="dotExpression" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1203640842648">
                <link role="concept" targetNodeId="4.1197027756228" resolveInfo="DotExpression" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203640842649">
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ReplaceWithNewOperation" id="1203640842650">
                  <link role="concept" targetNodeId="4.1197027756228" resolveInfo="DotExpression" />
                </node>
                <node role="operand" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_node" id="1203640842651" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1203640848137">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203640864799">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203640849233">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203640848138">
                  <link role="variableDeclaration" targetNodeId="1203640842647" resolveInfo="dotExpression" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1203640862704">
                  <link role="link" targetNodeId="4.1197027771414" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetTargetOperation" id="1203640867176">
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203640871070">
                  <node role="operand" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_node" id="1203640871054" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1203640881026">
                    <link role="link" targetNodeId="1.1138056667223" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1203640886231">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203640886232">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203640886233">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203640886234">
                  <link role="variableDeclaration" targetNodeId="1203640842647" resolveInfo="dotExpression" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1203640890491">
                  <link role="link" targetNodeId="4.1197027833540" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetTargetOperation" id="1203640886236">
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203640886237">
                  <node role="operand" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_node" id="1203640886238" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1203640902602">
                    <link role="link" targetNodeId="1.1138411864174" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScript" id="1206732362886">
    <property name="name" value="Convert_conceptArgument504" />
    <property name="migrationFromBuild" value="504" />
    <property name="title" value="Convert concept argument (smodel lang)" />
    <property name="category" value="#&lt;expr&gt;" />
    <node role="part" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_Instance" id="1206732504319">
      <property name="description" value="replace RefConcept_Expression with PoundExpression ('# expr')" />
      <link role="affectedInstanceConcept" targetNodeId="1.1177025403857" resolveInfo="RefConcept_Expression" />
      <node role="affectedInstanceUpdater" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_Instance_Updater" id="1206732504320">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206732504321">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1206732589339">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1206732589340">
              <property name="name" value="poundExpression" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1206732589341">
                <link role="concept" targetNodeId="1.1204834851141" resolveInfo="PoundExpression" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206732589342">
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ReplaceWithNewOperation" id="1206732589343">
                  <link role="concept" targetNodeId="1.1204834851141" resolveInfo="PoundExpression" />
                </node>
                <node role="operand" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_node" id="1206732593587" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1206732589345">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1206732589346">
              <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206732589347">
                <node role="operand" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_node" id="1206732595463" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1206732589349">
                  <link role="link" targetNodeId="1.1177025447014" />
                </node>
              </node>
              <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206732589350">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1206732589351">
                  <link role="variableDeclaration" targetNodeId="1206732589340" resolveInfo="poundExpression" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1206732589352">
                  <link role="link" targetNodeId="1.1204834868751" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="part" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_Instance" id="1207355303249">
      <property name="description" value="update op&lt;concept=...&gt; parameter" />
      <link role="affectedInstanceConcept" targetNodeId="1.1144101972840" resolveInfo="OperationParm_Concept" />
      <node role="affectedInstanceUpdater" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_Instance_Updater" id="1207355303250">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207355303251">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207355414674">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1207355414675">
              <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207355414676">
                <node role="operand" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_node" id="1207355422475" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1207355414678">
                  <link role="link" targetNodeId="1.1144102028966" />
                </node>
              </node>
              <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207355414679">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207355414680">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207355414681">
                    <node role="operand" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_node" id="1207355418395" />
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1207355414683">
                      <link role="link" targetNodeId="1.1207343664468" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetNewChildOperation" id="1207355414684">
                    <link role="concept" targetNodeId="1.1177026924588" resolveInfo="RefConcept_Reference" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1207355414685">
                  <link role="link" targetNodeId="1.1177026940964" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207355414686">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1207355414687">
              <node role="rValue" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1207355414688" />
              <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207355414689">
                <node role="operand" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_node" id="1207355419724" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1207355414691">
                  <link role="link" targetNodeId="1.1144102028966" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="affectedInstancePredicate" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_Instance_Predicate" id="1207355379455">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207355379456">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207355395644">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1207355395645">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207355395646">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207355395647">
                  <node role="operand" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_node" id="1207355402126" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1207355395649">
                    <link role="link" targetNodeId="1.1207343664468" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNullOperation" id="1207355395650" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207355395651">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207355395652">
                  <node role="operand" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_node" id="1207355399094" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1207355395654">
                    <link role="link" targetNodeId="1.1144102028966" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNotNullOperation" id="1207355395655" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="part" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_Instance" id="1207357723905">
      <property name="description" value="replace &lt;concept expr=expre&gt; with &lt;concept=#exp&gt;" />
      <link role="affectedInstanceConcept" targetNodeId="1.1176461918946" resolveInfo="OperationParm_ConceptExpression" />
      <node role="affectedInstanceUpdater" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_Instance_Updater" id="1207357723906">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207357723907">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207357843065">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207357843066">
              <property name="name" value="newParm" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207357843067">
                <link role="concept" targetNodeId="1.1144101972840" resolveInfo="OperationParm_Concept" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1207357843068">
                <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1207357843069">
                  <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207357843070">
                    <link role="concept" targetNodeId="1.1144101972840" resolveInfo="OperationParm_Concept" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207357843071">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1207357843072">
              <node role="rValue" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1207357843073">
                <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1207357843074">
                  <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207357843075">
                    <link role="concept" targetNodeId="1.1204834851141" resolveInfo="PoundExpression" />
                  </node>
                </node>
              </node>
              <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207357843076">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207357843077">
                  <link role="variableDeclaration" targetNodeId="1207357843066" resolveInfo="newParm" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1207357843078">
                  <link role="link" targetNodeId="1.1207343664468" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207357843079">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1207357843080">
              <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207357843081">
                <node role="operand" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_node" id="1207357848017" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1207357843083">
                  <link role="link" targetNodeId="1.1176461970854" />
                </node>
              </node>
              <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207357843084">
                <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1207357843085">
                  <link role="concept" targetNodeId="1.1204834851141" resolveInfo="PoundExpression" />
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207357843086">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207357843087">
                      <link role="variableDeclaration" targetNodeId="1207357843066" resolveInfo="newParm" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1207357843088">
                      <link role="link" targetNodeId="1.1207343664468" />
                    </node>
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1207357843089">
                  <link role="link" targetNodeId="1.1204834868751" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207357843090">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207357843091">
              <node role="operand" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_node" id="1207357850753" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ReplaceWithAnotherOperation" id="1207357843093">
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207357843094">
                  <link role="variableDeclaration" targetNodeId="1207357843066" resolveInfo="newParm" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

