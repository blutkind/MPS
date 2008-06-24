<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.bootstrap.editorLanguage.scripts">
  <persistence version="1" />
  <refactoringHistory />
  <language namespace="jetbrains.mps.ide.scriptLanguage">
    <languageAspect modelUID="jetbrains.mps.ide.scriptLanguage.constraints" version="0" />
  </language>
  <language namespace="jetbrains.mps.baseLanguage.ext.collections.lang">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.constraints" version="6" />
    <languageAspect modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.structure" version="1" />
  </language>
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage">
    <languageAspect modelUID="jetbrains.mps.bootstrap.smodelLanguage.constraints" version="21" />
    <languageAspect modelUID="jetbrains.mps.bootstrap.smodelLanguage.structure" version="0" />
  </language>
  <language namespace="jetbrains.mps.baseLanguage">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.constraints" version="83" />
    <languageAspect modelUID="jetbrains.mps.baseLanguage.structure" version="0" />
  </language>
  <languageAspect modelUID="jetbrains.mps.core.constraints" version="2" />
  <languageAspect modelUID="jetbrains.mps.closures.structure" version="0" />
  <languageAspect modelUID="jetbrains.mps.bootstrap.editorLanguage.constraints" version="21" />
  <languageAspect modelUID="jetbrains.mps.bootstrap.sharedConcepts.constraints" version="0" />
  <languageAspect modelUID="jetbrains.mps.closures.constraints" version="2" />
  <languageAspect modelUID="jetbrains.mps.bootstrap.structureLanguage.constraints" version="11" />
  <maxImportIndex value="1" />
  <import index="1" modelUID="jetbrains.mps.bootstrap.editorLanguage.structure" version="-1" />
  <node type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScript" id="1214310157048">
    <property name="migrationFromBuild" value="755" />
    <property name="name" value="ConvertToInlineProperies" />
    <property name="category" value="editor" />
    <property name="title" value="convert to inline properties" />
    <node role="part" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_Instance" id="1214310198721">
      <property name="description" value="selected" />
      <link role="affectedInstanceConcept" targetNodeId="1.1073389214265" resolveInfo="EditorCellModel" />
      <node role="affectedInstanceUpdater" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_Instance_Updater" id="1214310198722">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1214310198723">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1214310263725">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1214310263726">
              <property name="name" value="item" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1214310263727">
                <link role="concept" targetNodeId="1.1186414928363" resolveInfo="SelectableStyleSheetItem" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1214310269680">
                <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1214310269681">
                  <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1214310269682">
                    <link role="concept" targetNodeId="1.1186414928363" resolveInfo="SelectableStyleSheetItem" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1214310256213">
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1214310256214">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1214310274994">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214310276593">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214310275433">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1214310274995">
                      <link role="variableDeclaration" targetNodeId="1214310263726" resolveInfo="item" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1214310276358">
                      <link role="property" targetNodeId="1.1186414551515" resolveInfo="flag" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_SetOperation" id="1214310277127">
                    <node role="value" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1214310277957">
                      <property name="value" value="true" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214310258612">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214310257218">
                <node role="operand" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_node" id="1214310256951" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1214310258002">
                  <link role="property" targetNodeId="1.1073389214266" resolveInfo="selectable" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_HasValue_Enum" id="1214310258911">
                <node role="value" type="jetbrains.mps.bootstrap.smodelLanguage.structure.EnumMemberReference" id="1214310258912">
                  <link role="enumMember" targetNodeId="1.1083928804391" resolveInfo="yes" />
                </node>
              </node>
            </node>
            <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1214310280989">
              <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1214310280990">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1214310282367">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214310284122">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214310282790">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1214310282368">
                        <link role="variableDeclaration" targetNodeId="1214310263726" resolveInfo="item" />
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1214310283684">
                        <link role="property" targetNodeId="1.1186414551515" resolveInfo="flag" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_SetOperation" id="1214310285562">
                      <node role="value" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1214310287220">
                        <property name="value" value="false" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1214310288893">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214310292257">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214310288910">
                <node role="operand" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_node" id="1214310288894" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1214310291912">
                  <link role="link" targetNodeId="1.1214305243050" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_AddChildOperation" id="1214310293650">
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1214310295308">
                  <link role="variableDeclaration" targetNodeId="1214310263726" resolveInfo="item" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1214310246041">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214310247594">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214310246262">
                <node role="operand" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_node" id="1214310246042" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1214310247187">
                  <link role="property" targetNodeId="1.1073389214266" resolveInfo="selectable" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_SetOperation" id="1214310248737">
                <node role="value" type="jetbrains.mps.bootstrap.smodelLanguage.structure.EnumMemberReference" id="1214310253540">
                  <link role="enumMember" targetNodeId="1.1083928804393" resolveInfo="none" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="affectedInstancePredicate" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_Instance_Predicate" id="1214310207112">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1214310207113">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1214310208332">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1214310219855">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214310219856">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214310219857">
                  <node role="operand" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_node" id="1214310219858" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1214310219859">
                    <link role="property" targetNodeId="1.1073389214266" resolveInfo="selectable" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_HasValue_Enum" id="1214310219860">
                  <node role="value" type="jetbrains.mps.bootstrap.smodelLanguage.structure.EnumMemberReference" id="1214310224609">
                    <link role="enumMember" targetNodeId="1.1083928804393" resolveInfo="none" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="part" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_Instance" id="1214312387028">
      <property name="description" value="brackets" />
      <link role="affectedInstanceConcept" targetNodeId="1.1073389214265" resolveInfo="EditorCellModel" />
      <node role="affectedInstanceUpdater" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_Instance_Updater" id="1214312387029">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1214312387030">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1214312445638">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1214312445639">
              <property name="name" value="item" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1214312445640">
                <link role="concept" targetNodeId="1.1186414949600" resolveInfo="DrawBracketsStyleSheetItem" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1214312449814">
                <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1214312449815">
                  <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1214312449816">
                    <link role="concept" targetNodeId="1.1186414949600" resolveInfo="DrawBracketsStyleSheetItem" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1214312451489">
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1214312451490">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1214312459254">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214312462510">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214312459631">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1214312459255">
                      <link role="variableDeclaration" targetNodeId="1214312445639" resolveInfo="item" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1214312462103">
                      <link role="property" targetNodeId="1.1186414551515" resolveInfo="flag" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_SetOperation" id="1214312462935">
                    <node role="value" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1214312463593">
                      <property name="value" value="true" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214312455420">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214312452291">
                <node role="operand" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_node" id="1214312452103" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1214312454951">
                  <link role="property" targetNodeId="1.1101478251453" resolveInfo="drawBrackets" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_HasValue_Enum" id="1214312456736">
                <node role="value" type="jetbrains.mps.bootstrap.smodelLanguage.structure.EnumMemberReference" id="1214312456737">
                  <link role="enumMember" targetNodeId="1.1083928804391" resolveInfo="yes" />
                </node>
              </node>
            </node>
            <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1214312465876">
              <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1214312465877">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1214312467301">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214312468573">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214312467569">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1214312467302">
                        <link role="variableDeclaration" targetNodeId="1214312445639" resolveInfo="item" />
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1214312468338">
                        <link role="property" targetNodeId="1.1186414551515" resolveInfo="flag" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_SetOperation" id="1214312469045">
                      <node role="value" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1214312470172">
                        <property name="value" value="false" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1214312472346">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214312478258">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214312472379">
                <node role="operand" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_node" id="1214312472347" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1214312476882">
                  <link role="link" targetNodeId="1.1214305243050" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_AddChildOperation" id="1214312487121">
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1214312487826">
                  <link role="variableDeclaration" targetNodeId="1214312445639" resolveInfo="item" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1214312489578">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214312492647">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214312489596">
                <node role="operand" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_node" id="1214312489579" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1214312939141">
                  <link role="property" targetNodeId="1.1101478251453" resolveInfo="drawBrackets" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_SetOperation" id="1214312494040">
                <node role="value" type="jetbrains.mps.bootstrap.smodelLanguage.structure.EnumMemberReference" id="1214312498327">
                  <link role="enumMember" targetNodeId="1.1083928804393" resolveInfo="none" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="affectedInstancePredicate" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_Instance_Predicate" id="1214312429926">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1214312429927">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1214312431303">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1214312431304">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214312435702">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214312432229">
                  <node role="operand" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_node" id="1214312431947" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1214312434935">
                    <link role="property" targetNodeId="1.1101478251453" resolveInfo="drawBrackets" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_HasValue_Enum" id="1214312437290">
                  <node role="value" type="jetbrains.mps.bootstrap.smodelLanguage.structure.EnumMemberReference" id="1214312437291">
                    <link role="enumMember" targetNodeId="1.1083928804393" resolveInfo="none" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="part" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_Instance" id="1214313848019">
      <property name="description" value="border" />
      <link role="affectedInstanceConcept" targetNodeId="1.1073389214265" resolveInfo="EditorCellModel" />
      <node role="affectedInstanceUpdater" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_Instance_Updater" id="1214313848020">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1214313848021">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1214314868155">
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1214314868156">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1214313874495">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1214313874496">
                  <property name="name" value="item" />
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1214313874497">
                    <link role="concept" targetNodeId="1.1186414976055" resolveInfo="DrawBorderStyleSheetItem" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1214313882155">
                    <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1214313882156">
                      <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1214313882157">
                        <link role="concept" targetNodeId="1.1186414976055" resolveInfo="DrawBorderStyleSheetItem" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1214313902240">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214313904308">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214313902554">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1214313902241">
                      <link role="variableDeclaration" targetNodeId="1214313874496" resolveInfo="item" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1214313903901">
                      <link role="property" targetNodeId="1.1186414551515" resolveInfo="flag" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_SetOperation" id="1214313904874">
                    <node role="value" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1214313905516">
                      <property name="value" value="true" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1214313918279">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214313921331">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214313918562">
                    <node role="operand" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_node" id="1214313918280" />
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1214313921049">
                      <link role="link" targetNodeId="1.1214305243050" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_AddChildOperation" id="1214313923474">
                    <node role="parameter" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1214313923976">
                      <link role="variableDeclaration" targetNodeId="1214313874496" resolveInfo="item" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214314873648">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214314871597">
                <node role="operand" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_node" id="1214314871315" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1214314873397">
                  <link role="property" targetNodeId="1.1078832671094" resolveInfo="drawBorder" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_HasValue_Enum" id="1214314875220">
                <node role="value" type="jetbrains.mps.bootstrap.smodelLanguage.structure.EnumMemberReference" id="1214314875221">
                  <link role="enumMember" targetNodeId="1.1083928804391" resolveInfo="yes" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1214313884721">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214313886836">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214313884739">
                <node role="operand" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_node" id="1214313884722" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1214313886601">
                  <link role="property" targetNodeId="1.1078832671094" resolveInfo="drawBorder" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_SetOperation" id="1214313887386">
                <node role="value" type="jetbrains.mps.bootstrap.smodelLanguage.structure.EnumMemberReference" id="1214313891315">
                  <link role="enumMember" targetNodeId="1.1083928804393" resolveInfo="none" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="affectedInstancePredicate" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_Instance_Predicate" id="1214313854537">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1214313854538">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1214314796389">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1214314862988">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214314862989">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214314862990">
                  <node role="operand" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_node" id="1214314862991" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1214314862992">
                    <link role="property" targetNodeId="1.1078832671094" resolveInfo="drawBorder" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_HasValue_Enum" id="1214314862993">
                  <node role="value" type="jetbrains.mps.bootstrap.smodelLanguage.structure.EnumMemberReference" id="1214314862994">
                    <link role="enumMember" targetNodeId="1.1083928804393" resolveInfo="none" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="part" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_Instance" id="1214316864874">
      <property name="description" value="font style" />
      <link role="affectedInstanceConcept" targetNodeId="1.1073389214265" resolveInfo="EditorCellModel" />
      <node role="affectedInstanceUpdater" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_Instance_Updater" id="1214316864875">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1214316864876">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1214316897579">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1214316897580">
              <property name="name" value="item" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1214316897581">
                <link role="concept" targetNodeId="1.1186403751766" resolveInfo="FontStyleStyleSheetItem" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1214316900849">
                <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1214316900850">
                  <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1214316900851">
                    <link role="concept" targetNodeId="1.1186403751766" resolveInfo="FontStyleStyleSheetItem" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1214316906290">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214316911062">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214316906683">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1214316906291">
                  <link role="variableDeclaration" targetNodeId="1214316897580" resolveInfo="item" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1214316910749">
                  <link role="property" targetNodeId="1.1186403771423" resolveInfo="style" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_SetOperation" id="1214316911471">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214316913240">
                  <node role="operand" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_node" id="1214316913005" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1214316915384">
                    <link role="property" targetNodeId="1.1130426512758" resolveInfo="fontStyle" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1214316930984">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214316935974">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214316931017">
                <node role="operand" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_node" id="1214316930985" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1214316935567">
                  <link role="link" targetNodeId="1.1214305243050" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_AddChildOperation" id="1214316938339">
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1214316939200">
                  <link role="variableDeclaration" targetNodeId="1214316897580" resolveInfo="item" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1214316919105">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214316921142">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214316919122">
                <node role="operand" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_node" id="1214316919106" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1214316920813">
                  <link role="property" targetNodeId="1.1130426512758" resolveInfo="fontStyle" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_SetOperation" id="1214316922333">
                <node role="value" type="jetbrains.mps.bootstrap.smodelLanguage.structure.EnumMemberReference" id="1214316927435">
                  <link role="enumMember" targetNodeId="1.1101211506174" resolveInfo="none" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="affectedInstancePredicate" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_Instance_Predicate" id="1214316881691">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1214316881692">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1214316883036">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1214316890491">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214316890492">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214316890493">
                  <node role="operand" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_node" id="1214316890494" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1214316890495">
                    <link role="property" targetNodeId="1.1130426512758" resolveInfo="fontStyle" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_HasValue_Enum" id="1214316890496">
                  <node role="value" type="jetbrains.mps.bootstrap.smodelLanguage.structure.EnumMemberReference" id="1214316890497">
                    <link role="enumMember" targetNodeId="1.1101211506174" resolveInfo="none" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="part" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_Instance" id="1214316595467">
      <property name="description" value="font size" />
      <link role="affectedInstanceConcept" targetNodeId="1.1073389214265" resolveInfo="EditorCellModel" />
      <node role="affectedInstanceUpdater" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_Instance_Updater" id="1214316595468">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1214316595469">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1214316617049">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1214316617050">
              <property name="name" value="item" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1214316617051">
                <link role="concept" targetNodeId="1.1186415722038" resolveInfo="FontSizeStyleSheetItem" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1214316620225">
                <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1214316620226">
                  <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1214316620227">
                    <link role="concept" targetNodeId="1.1186415722038" resolveInfo="FontSizeStyleSheetItem" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1214316623276">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214316626454">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214316623544">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1214316623277">
                  <link role="variableDeclaration" targetNodeId="1214316617050" resolveInfo="item" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1214316626125">
                  <link role="property" targetNodeId="1.1186415735165" resolveInfo="size" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_SetOperation" id="1214316626816">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214316628147">
                  <node role="operand" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_node" id="1214316627959" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1214316629510">
                    <link role="property" targetNodeId="1.1130426512759" resolveInfo="fontSize" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1214316631606">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214316633580">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214316631623">
                <node role="operand" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_node" id="1214316631607" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1214316633345">
                  <link role="link" targetNodeId="1.1214305243050" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_AddChildOperation" id="1214316634833">
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1214316635351">
                  <link role="variableDeclaration" targetNodeId="1214316617050" resolveInfo="item" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1214316636931">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214316640500">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214316636964">
                <node role="operand" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_node" id="1214316636932" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1214316640202">
                  <link role="property" targetNodeId="1.1130426512758" resolveInfo="fontStyle" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_SetOperation" id="1214316641681">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1214316643652" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="affectedInstancePredicate" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_Instance_Predicate" id="1214316601845">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1214316601846">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1214316605988">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1214316605989">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214316608855">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214316607148">
                  <node role="operand" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_node" id="1214316606679" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1214316608526">
                    <link role="property" targetNodeId="1.1130426512759" resolveInfo="fontSize" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_HasValue_Simple" id="1214316610030">
                  <node role="value" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1214316611720" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="part" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_Instance" id="1214316710812">
      <property name="description" value="underlined" />
      <link role="affectedInstanceConcept" targetNodeId="1.1073389214265" resolveInfo="EditorCellModel" />
      <node role="affectedInstanceUpdater" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_Instance_Updater" id="1214316710813">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1214316710814">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1214316729958">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1214316729959">
              <property name="name" value="item" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1214316729960">
                <link role="concept" targetNodeId="1.1186414999511" resolveInfo="UnderlinedStyleSheetItem" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1214316733712">
                <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1214316733713">
                  <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1214316733714">
                    <link role="concept" targetNodeId="1.1186414999511" resolveInfo="UnderlinedStyleSheetItem" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1214316736372">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214316738487">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214316736671">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1214316736373">
                  <link role="variableDeclaration" targetNodeId="1214316729959" resolveInfo="item" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1214316738252">
                  <link role="property" targetNodeId="1.1214316229833" resolveInfo="underlined" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_SetOperation" id="1214316738865">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214316739853">
                  <node role="operand" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_node" id="1214316739680" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1214316741090">
                    <link role="property" targetNodeId="1.1130836394969" resolveInfo="underlined" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1214316768674">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214316773961">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214316768707">
                <node role="operand" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_node" id="1214316768675" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1214316773647">
                  <link role="link" targetNodeId="1.1214305243050" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_AddChildOperation" id="1214316774870">
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1214316775622">
                  <link role="variableDeclaration" targetNodeId="1214316729959" resolveInfo="item" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1214316806944">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214316809200">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214316806962">
                <node role="operand" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_node" id="1214316806945" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1214316808746">
                  <link role="property" targetNodeId="1.1130836394969" resolveInfo="underlined" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_SetOperation" id="1214316810219">
                <node role="value" type="jetbrains.mps.bootstrap.smodelLanguage.structure.EnumMemberReference" id="1214316811814">
                  <link role="enumMember" targetNodeId="1.1130847686918" resolveInfo="as_is" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="affectedInstancePredicate" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_Instance_Predicate" id="1214316715846">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1214316715847">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1214316717613">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1214316717614">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214316720512">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214316718539">
                  <node role="operand" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_node" id="1214316718148" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1214316722578">
                    <link role="property" targetNodeId="1.1130836394969" resolveInfo="underlined" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_HasValue_Enum" id="1214316723188">
                  <node role="value" type="jetbrains.mps.bootstrap.smodelLanguage.structure.EnumMemberReference" id="1214316723189">
                    <link role="enumMember" targetNodeId="1.1130847686918" resolveInfo="as_is" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="part" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_Instance" id="1214318253141">
      <property name="description" value="layout constraints" />
      <link role="affectedInstanceConcept" targetNodeId="1.1073389214265" resolveInfo="EditorCellModel" />
      <node role="affectedInstanceUpdater" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_Instance_Updater" id="1214318253142">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1214318253143">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1214318304505">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1214318304506">
              <property name="name" value="item" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1214318304507">
                <link role="concept" targetNodeId="1.1214317859050" resolveInfo="LayoutConstraintStyleSheetItem" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1214318307540">
                <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1214318307541">
                  <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1214318307542">
                    <link role="concept" targetNodeId="1.1214317859050" resolveInfo="LayoutConstraintStyleSheetItem" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1214318310591">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214318312550">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214318311046">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1214318310592">
                  <link role="variableDeclaration" targetNodeId="1214318304506" resolveInfo="item" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1214318311924">
                  <link role="property" targetNodeId="1.1214317859051" resolveInfo="layoutConstraint" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_SetOperation" id="1214318313960">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214318315838">
                  <node role="operand" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_node" id="1214318315712" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1214318316809">
                    <link role="property" targetNodeId="1.1129573164669" resolveInfo="layoutConstraint" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1214318320812">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214318324818">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214318320845">
                <node role="operand" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_node" id="1214318320813" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1214318324223">
                  <link role="link" targetNodeId="1.1214305243050" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_AddChildOperation" id="1214318325899">
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1214318326417">
                  <link role="variableDeclaration" targetNodeId="1214318304506" resolveInfo="item" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1214318328716">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214318331284">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214318328749">
                <node role="operand" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_node" id="1214318328717" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1214318330814">
                  <link role="property" targetNodeId="1.1129573164669" resolveInfo="layoutConstraint" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_SetOperation" id="1214318332272">
                <node role="value" type="jetbrains.mps.bootstrap.smodelLanguage.structure.EnumMemberReference" id="1214318335633">
                  <link role="enumMember" targetNodeId="1.1138197631095" resolveInfo="none" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="affectedInstancePredicate" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_Instance_Predicate" id="1214318272935">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1214318272936">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1214318293657">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1214318293658">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214318297446">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214318296051">
                  <node role="operand" type="jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_node" id="1214318295238" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1214318297148">
                    <link role="property" targetNodeId="1.1129573164669" resolveInfo="layoutConstraint" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_HasValue_Enum" id="1214318298955">
                  <node role="value" type="jetbrains.mps.bootstrap.smodelLanguage.structure.EnumMemberReference" id="1214318298956">
                    <link role="enumMember" targetNodeId="1.1138197631095" resolveInfo="none" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

