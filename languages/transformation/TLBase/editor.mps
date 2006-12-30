<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.transformation.TLBase.editor">
  <language namespace="jetbrains.mps.bootstrap.editorLanguage" />
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage" />
  <language namespace="jetbrains.mps.baseLanguage" />
  <language namespace="jetbrains.mps.bootstrap.sharedConcepts" />
  <language namespace="jetbrains.mps.baseLanguage.ext.collections.lang" />
  <maxImportIndex value="34" />
  <import index="1" modelUID="jetbrains.mps.transformation.TLBase.structure" />
  <import index="4" modelUID="jetbrains.mps.core.structure" />
  <import index="6" modelUID="jetbrains.mps.bootstrap.structureLanguage.structure" />
  <import index="8" modelUID="jetbrains.mps.transformation@java_stub" />
  <import index="9" modelUID="jetbrains.mps.nodeEditor@java_stub" />
  <import index="10" modelUID="jetbrains.mps.smodel@java_stub" />
  <import index="11" modelUID="java.util@java_stub" />
  <import index="15" modelUID="jetbrains.mps.transformation.TLBase.editor@java_stub" />
  <import index="18" modelUID="jetbrains.mps.baseLanguage.structure" />
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1087903454703">
    <property name="name" value="PropertyMacro_Editor" />
    <link role="conceptDeclaration" targetNodeId="1.1087833241328" />
    <node role="inspectedCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1087903454708">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1087907544521">
        <property name="text" value="&lt; Property Macro &gt;" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1087907544522">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1087907544523">
          <property name="text" value="propertyMacro_" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Custom" id="1088501636842">
          <property name="drawBorder" value="false" />
          <property name="cellProviderId" value="PropertyMacroProviderAspect" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1089123998625">
          <property name="text" value="(..)" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
    </node>
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1149859004960">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1149859006667">
        <property name="textFgColor" value="DARK_BLUE" />
        <property name="text" value="$" />
        <property name="fontStyle" value="BOLD_ITALIC" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
        <property name="textBgColorSelected" value="cyan" />
        <link role="keyMap" targetNodeId="1149931179122" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_AttributedPropertyCell" id="1149859009402">
        <property name="drawBorder" value="false" />
        <property name="drawBrackets" value="true" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapDeclaration" id="1087911817437">
    <property name="name" value="_PropertyMacroSwitch_KeyMap" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapItem" id="1146772585733">
      <property name="description" value="add/remove property macro" />
      <node role="keystroke" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapKeystroke" id="1146772585734">
        <property name="modifiers" value="ctrl+shift" />
        <property name="keycode" value="VK_M" />
      </node>
      <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_IsApplicableFunction" id="1146772585735">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1146772585736">
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1146773380110">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1146773380111">
              <property name="name" value="cell" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1146773380112">
                <link role="classifier" extResolveInfo="9.[Classifier]EditorCell" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1146773380113">
                <link role="baseMethodDeclaration" extResolveInfo="9.method ([Classifier]EditorContext).([InstanceMethodDeclaration]getSelectedCell() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [EditorCell]))" />
                <node role="instance" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_editorContext" id="1146773380114" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1146773380115">
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1146773380116">
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1146773380117">
                <node role="expression" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1146773380118" />
              </node>
            </node>
            <node role="condition" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1146773380119">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_FunctionParm_selectedNode" id="1146773380120" />
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1146773380121">
                <link role="baseMethodDeclaration" extResolveInfo="9.method ([Classifier]EditorCell).([InstanceMethodDeclaration]getSNode() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SNode]))" />
                <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1146773380122">
                  <link role="variableDeclaration" targetNodeId="1146773380111" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1146773380123">
            <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1146773380124">
              <link role="classConcept" extResolveInfo="8.[Classifier]TemplateLanguageUtil" />
              <link role="baseMethodDeclaration" extResolveInfo="8.static method ([Classifier]TemplateLanguageUtil).([StaticMethodDeclaration]canSwitchPropertyMacro((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [EditorCell])) : (jetbrains.mps.baseLanguage.types.boolean/jetbrains.mps.baseLanguage.types.boolean))" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1146773380125">
                <link role="variableDeclaration" targetNodeId="1146773380111" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_ExecuteFunction" id="1146772585737">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1146772585738">
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1146773399455">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1146773399456">
              <property name="name" value="cell" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1146773399457">
                <link role="classifier" extResolveInfo="9.[Classifier]EditorCell" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1146773399458">
                <link role="baseMethodDeclaration" extResolveInfo="9.method ([Classifier]EditorContext).([InstanceMethodDeclaration]getSelectedCell() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [EditorCell]))" />
                <node role="instance" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_editorContext" id="1146773399459" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1146773399460">
            <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1146773399461">
              <link role="classConcept" extResolveInfo="8.[Classifier]TemplateLanguageUtil" />
              <link role="baseMethodDeclaration" extResolveInfo="8.static method ([Classifier]TemplateLanguageUtil).([StaticMethodDeclaration]switchPropertyMacro((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [EditorCell]), (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [IScope])) : (jetbrains.mps.baseLanguage.types.void/jetbrains.mps.baseLanguage.types.void))" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1146773399462">
                <link role="variableDeclaration" targetNodeId="1146773399456" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1146773628732">
                <link role="baseMethodDeclaration" extResolveInfo="10.method ([Classifier]IOperationContext).([InstanceMethodDeclaration]getScope() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [IScope]))" />
                <node role="instance" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1146773598370">
                  <link role="baseMethodDeclaration" extResolveInfo="9.method ([Classifier]EditorContext).([InstanceMethodDeclaration]getOperationContext() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [IOperationContext]))" />
                  <node role="instance" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_editorContext" id="1146773577061" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapItem" id="1146773424398">
      <property name="description" value="remove property macro" />
      <node role="keystroke" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapKeystroke" id="1146773424399">
        <property name="modifiers" value="ctrl+shift" />
        <property name="keycode" value="VK_M" />
      </node>
      <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_IsApplicableFunction" id="1146773424400">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1146773424401">
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1146773446984">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1146773446985">
              <property name="name" value="selectedNode" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1146773446986" />
              <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1146773446987">
                <link role="baseMethodDeclaration" extResolveInfo="9.method ([Classifier]EditorCell).([InstanceMethodDeclaration]getSNode() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SNode]))" />
                <node role="instance" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1146773446988">
                  <link role="baseMethodDeclaration" extResolveInfo="9.method ([Classifier]EditorContext).([InstanceMethodDeclaration]getSelectedCell() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [EditorCell]))" />
                  <node role="instance" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_editorContext" id="1146773446989" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1146773446990">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1146773446991">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1146773446992">
                <link role="variableDeclaration" targetNodeId="1146773446985" />
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsInstanceOfOperation" id="1146773446993">
                <link role="concept" targetNodeId="1.1087833241328" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_ExecuteFunction" id="1146773424418">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1146773424419">
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1146773503987">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1146773503988">
              <property name="name" value="propertyMacro" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1146773503989" />
              <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1146773503990">
                <link role="baseMethodDeclaration" extResolveInfo="9.method ([Classifier]EditorCell).([InstanceMethodDeclaration]getSNode() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SNode]))" />
                <node role="instance" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1146773503991">
                  <link role="baseMethodDeclaration" extResolveInfo="9.method ([Classifier]EditorContext).([InstanceMethodDeclaration]getSelectedCell() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [EditorCell]))" />
                  <node role="instance" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_editorContext" id="1146773503992" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1146773503993">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1146773503994">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1146773503995">
                <link role="variableDeclaration" targetNodeId="1146773503988" />
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_DeleteOperation" id="1146773503996" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1087926271843">
    <property name="name" value="NodeMacro_Editor" />
    <link role="conceptDeclaration" targetNodeId="1.1087833466690" />
    <node role="inspectedCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1089126084078">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="true" />
      <property name="selectable" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1089126148391">
        <property name="text" value="&lt; Node Macro &gt;" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1096644584231">
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1152722138460">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1152722138461">
          <property name="text" value="mapping name" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1152722172528">
          <property name="allowEmptyText" value="true" />
          <property name="drawBorder" value="false" />
          <property name="noTargetText" value="&lt;none&gt;" />
          <link role="relationDeclaration" targetNodeId="1.1152722085357" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1090493300946">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1090493300947">
          <property name="text" value="templateSourceQuery_" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Custom" id="1090493300948">
          <property name="drawBorder" value="false" />
          <property name="cellProviderId" value="templateSourceQuery_CellProvider" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1090493300949">
          <property name="text" value="(..)" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1090493300950">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1090493300951">
          <property name="text" value="templateTargetBuilder_" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Custom" id="1090493300952">
          <property name="drawBorder" value="false" />
          <property name="cellProviderId" value="templateTargetBuilder_CellProvider" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1090493300953">
          <property name="text" value="(..)" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
    </node>
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1149865862287">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1149865868009">
        <property name="editable" value="true" />
        <property name="textFgColor" value="DARK_BLUE" />
        <property name="text" value="$$" />
        <property name="fontStyle" value="BOLD_ITALIC" />
        <property name="drawBorder" value="false" />
        <property name="textBgColorSelected" value="cyan" />
        <property name="selectable" value="true" />
        <link role="keyMap" targetNodeId="1149931179122" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1152722394825">
        <property name="textBgColor" value="orange" />
        <property name="drawBorder" value="false" />
        <property name="textBgColorSelected" value="cyan" />
        <link role="relationDeclaration" targetNodeId="1.1152722085357" />
        <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1152722420638">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1152722420639">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1152722442394">
              <node role="expression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1152722464211">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1152722469480" />
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1152722454147">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.NodeCondition_FunctionParm_node" id="1152722452552" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1152722459085">
                    <link role="property" targetNodeId="1.1152722085357" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_AttributedNodeCell" id="1149865877792">
        <property name="drawBorder" value="false" />
        <property name="drawBrackets" value="true" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapDeclaration" id="1087927878702">
    <property name="name" value="_NodeMacroSwitch_KeyMap" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapItem" id="1146757069336">
      <property name="description" value="convert to/from 'template fragmet'" />
      <node role="keystroke" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapKeystroke" id="1146757069337">
        <property name="modifiers" value="ctrl+shift" />
        <property name="keycode" value="VK_F" />
      </node>
      <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_IsApplicableFunction" id="1146757069338">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1146757069339">
          <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1146757613716">
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1146757613718">
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1146757670422">
                <node role="expression" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1146757672924" />
              </node>
            </node>
            <node role="condition" type="jetbrains.mps.baseLanguage.EqualsExpression" id="1146757623811">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1146757618776">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_FunctionParm_selectedNode" id="1146757618777" />
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetParentOperation" id="1146757618778">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.OperationParm_Concept" id="1146757618779">
                    <link role="concept" targetNodeId="1.1092059087312" />
                  </node>
                </node>
              </node>
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1146757618775" />
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1146764888741">
            <node role="expression" type="jetbrains.mps.baseLanguage.NotExpression" id="1146764889946">
              <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1146764899824">
                <link role="baseMethodDeclaration" extResolveInfo="8.static method ([Classifier]TemplateLanguageUtil).([StaticMethodDeclaration]isInsideTemplateFragment((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SNode])) : (jetbrains.mps.baseLanguage.types.boolean/jetbrains.mps.baseLanguage.types.boolean))" />
                <link role="classConcept" extResolveInfo="8.[Classifier]TemplateLanguageUtil" />
                <node role="actualArgument" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_FunctionParm_selectedNode" id="1146764902059" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_ExecuteFunction" id="1146757069340">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1146757069341">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1146760357262">
            <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1146760361280">
              <link role="baseMethodDeclaration" extResolveInfo="8.static method ([Classifier]TemplateLanguageUtil).([StaticMethodDeclaration]switchTemplateFragment((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SNode])) : (jetbrains.mps.baseLanguage.types.void/jetbrains.mps.baseLanguage.types.void))" />
              <link role="classConcept" extResolveInfo="8.[Classifier]TemplateLanguageUtil" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_FunctionParm_selectedNode" id="1146760364499" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapItem" id="1146763185637">
      <property name="description" value="add/remove node macro" />
      <node role="keystroke" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapKeystroke" id="1146763185638">
        <property name="modifiers" value="ctrl+shift" />
        <property name="keycode" value="VK_M" />
      </node>
      <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_IsApplicableFunction" id="1146763185639">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1146763185640">
          <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1146764783456">
            <node role="expression" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1146764785176">
              <property name="value" value="true" />
            </node>
          </node>
        </node>
      </node>
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_ExecuteFunction" id="1146763185641">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1146763185642">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1146764794381">
            <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1146764797695">
              <link role="classConcept" extResolveInfo="8.[Classifier]TemplateLanguageUtil" />
              <link role="baseMethodDeclaration" extResolveInfo="8.static method ([Classifier]TemplateLanguageUtil).([StaticMethodDeclaration]switchNodeMacro((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SNode])) : (jetbrains.mps.baseLanguage.types.void/jetbrains.mps.baseLanguage.types.void))" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_FunctionParm_selectedNode" id="1146764863895" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1088762125437">
    <property name="name" value="ReferenceMacro_Editor" />
    <link role="conceptDeclaration" targetNodeId="1.1088761943574" />
    <node role="inspectedCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1088763040904">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="true" />
      <property name="selectable" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1088763156827">
        <property name="text" value="&lt; Reference Macro &gt;" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1088763156828">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1088763156829">
          <property name="text" value="referenceMacro_" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Custom" id="1088763156830">
          <property name="drawBorder" value="false" />
          <property name="cellProviderId" value="ReferenceMacroProviderAspect" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1088763156831">
          <property name="text" value="(..)" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
    </node>
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1149858909222">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1149858910850">
        <property name="textFgColor" value="DARK_BLUE" />
        <property name="text" value="-&gt;$" />
        <property name="fontStyle" value="BOLD_ITALIC" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
        <property name="textBgColorSelected" value="cyan" />
        <link role="keyMap" targetNodeId="1149931179122" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_AttributedLinkCell" id="1149858915193">
        <property name="drawBorder" value="false" />
        <property name="drawBrackets" value="true" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapDeclaration" id="1088969011903">
    <property name="name" value="_ReferenceMacroSwitch_KeyMap" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapItem" id="1146765617426">
      <property name="description" value="add/remove reference macro" />
      <node role="keystroke" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapKeystroke" id="1146765617427">
        <property name="modifiers" value="ctrl+shift" />
        <property name="keycode" value="VK_M" />
      </node>
      <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_IsApplicableFunction" id="1146765617428">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1146765617429">
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1146770038514">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1146770038515">
              <property name="name" value="cell" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1146770038533">
                <link role="classifier" extResolveInfo="9.[Classifier]EditorCell" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1146768862615">
                <link role="baseMethodDeclaration" extResolveInfo="9.method ([Classifier]EditorContext).([InstanceMethodDeclaration]getSelectedCell() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [EditorCell]))" />
                <node role="instance" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_editorContext" id="1146768843649" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1146770071380">
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1146770071382">
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1146770091576">
                <node role="expression" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1146770104921" />
              </node>
            </node>
            <node role="condition" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1146770088715">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_FunctionParm_selectedNode" id="1146770081449" />
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1146770081447">
                <link role="baseMethodDeclaration" extResolveInfo="9.method ([Classifier]EditorCell).([InstanceMethodDeclaration]getSNode() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SNode]))" />
                <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1146770081448">
                  <link role="variableDeclaration" targetNodeId="1146770038515" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1146770175781">
            <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1146770190815">
              <link role="baseMethodDeclaration" extResolveInfo="8.static method ([Classifier]TemplateLanguageUtil).([StaticMethodDeclaration]canSwitchReferenceMacro((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [EditorCell])) : (jetbrains.mps.baseLanguage.types.boolean/jetbrains.mps.baseLanguage.types.boolean))" />
              <link role="classConcept" extResolveInfo="8.[Classifier]TemplateLanguageUtil" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1146770193707">
                <link role="variableDeclaration" targetNodeId="1146770038515" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_ExecuteFunction" id="1146765617430">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1146765617431">
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1146766016219">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1146766016220">
              <property name="name" value="cell" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1146766016221">
                <link role="classifier" extResolveInfo="9.[Classifier]EditorCell" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1146766029913">
                <link role="baseMethodDeclaration" extResolveInfo="9.method ([Classifier]EditorContext).([InstanceMethodDeclaration]getSelectedCell() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [EditorCell]))" />
                <node role="instance" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_editorContext" id="1146766023426" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1146766594804">
            <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1146766600040">
              <link role="classConcept" extResolveInfo="8.[Classifier]TemplateLanguageUtil" />
              <link role="baseMethodDeclaration" extResolveInfo="8.static method ([Classifier]TemplateLanguageUtil).([StaticMethodDeclaration]switchReferenceMacro((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [EditorCell])) : (jetbrains.mps.baseLanguage.types.void/jetbrains.mps.baseLanguage.types.void))" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1146766605401">
                <link role="variableDeclaration" targetNodeId="1146766016220" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapItem" id="1146768766123">
      <property name="description" value="remove reference macro" />
      <node role="keystroke" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapKeystroke" id="1146768766124">
        <property name="modifiers" value="ctrl+shift" />
        <property name="keycode" value="VK_M" />
      </node>
      <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_IsApplicableFunction" id="1146768766125">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1146768766126">
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1146769424391">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1146769424392">
              <property name="name" value="selectedNode" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1146769424393" />
              <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1146769436407">
                <link role="baseMethodDeclaration" extResolveInfo="9.method ([Classifier]EditorCell).([InstanceMethodDeclaration]getSNode() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SNode]))" />
                <node role="instance" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1146769436408">
                  <link role="baseMethodDeclaration" extResolveInfo="9.method ([Classifier]EditorContext).([InstanceMethodDeclaration]getSelectedCell() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [EditorCell]))" />
                  <node role="instance" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_editorContext" id="1146769436409" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1146768974154">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1146768982407">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1146769455123">
                <link role="variableDeclaration" targetNodeId="1146769424392" />
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsInstanceOfOperation" id="1146768984830">
                <link role="concept" targetNodeId="1.1088761943574" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_ExecuteFunction" id="1146768766127">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1146768766128">
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1146769494352">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1146769494353">
              <property name="name" value="referenceMacro" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1146769494354" />
              <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1146769494355">
                <link role="baseMethodDeclaration" extResolveInfo="9.method ([Classifier]EditorCell).([InstanceMethodDeclaration]getSNode() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SNode]))" />
                <node role="instance" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1146769494356">
                  <link role="baseMethodDeclaration" extResolveInfo="9.method ([Classifier]EditorContext).([InstanceMethodDeclaration]getSelectedCell() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [EditorCell]))" />
                  <node role="instance" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_editorContext" id="1146769494357" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1146768997362">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1146768998739">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1146769503561">
                <link role="variableDeclaration" targetNodeId="1146769494353" />
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_DeleteOperation" id="1146769000506" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1092060948911">
    <property name="name" value="TemplateDeclaration_Editor" />
    <link role="conceptDeclaration" targetNodeId="1.1092059087312" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1092060948912">
      <property name="drawBorder" value="false" />
      <property name="name" value="nodeBox" />
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1092060948913">
        <property name="drawBorder" value="false" />
        <property name="name" value="headerRow" />
        <property name="vertical" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1092060948914">
          <property name="text" value="template:" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="true" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1092060948915">
          <property name="textBgColor" value="yellow" />
          <property name="drawBorder" value="false" />
          <property name="noTargetText" value="&lt;no name&gt;" />
          <property name="textBgColorSelected" value="cyan" />
          <link role="relationDeclaration" targetNodeId="4.1078489098626" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1092060945722">
        <property name="drawBorder" value="false" />
        <property name="name" value="separator" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1092826413145">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="true" />
        <property name="selectable" value="false" />
        <property name="gridLayout" value="true" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1092826609045">
          <property name="drawBorder" value="false" />
          <property name="vertical" value="false" />
          <property name="selectable" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1092826609046">
            <property name="textBgColor" value="pink" />
            <property name="text" value="Ctrl-Shift-F" />
            <property name="drawBorder" value="false" />
            <property name="name" value="help3" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1092826609047">
            <property name="text" value="convert to template fragment" />
            <property name="drawBorder" value="false" />
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1100116537416">
          <property name="drawBorder" value="false" />
          <property name="vertical" value="false" />
          <property name="selectable" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1100116537417">
            <property name="textBgColor" value="orange" />
            <property name="text" value="Ctrl-Shift-M" />
            <property name="drawBorder" value="false" />
            <property name="name" value="help1" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1100116537418">
            <property name="text" value="convert to macro" />
            <property name="drawBorder" value="false" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1146604973776">
        <property name="drawBorder" value="false" />
        <property name="name" value="separator" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1092061173513">
        <property name="text" value="content node:" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1092135992437">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;no content node&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1092060348987" />
        <node role="menuDescriptor" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuDescriptor" id="1165279095747">
          <node role="cellMenuPart" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuPart_ReplaceChild_Group" id="1165279105014">
            <property name="presentation" value="default_referent" />
            <node role="parametersFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuPart_ReplaceChild_Group_Query" id="1165279105015">
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1165279105016">
                <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1165279154277">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1165279154278">
                    <property name="name" value="languages" />
                    <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.ListType" id="1165279154279">
                      <node role="elementType" type="jetbrains.mps.baseLanguage.ClassifierType" id="1165279154280">
                        <link role="classifier" extResolveInfo="10.[Classifier]Language" />
                      </node>
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1165279154281">
                      <link role="baseMethodDeclaration" extResolveInfo="10.method ([Classifier]SModel).([InstanceMethodDeclaration]getLanguages((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [IScope])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [List, &lt;jetbrains.mps.baseLanguage.types.classifier [Language]&gt;]))" />
                      <node role="instance" type="jetbrains.mps.bootstrap.smodelLanguage.SemanticDowncastExpression" id="1165279154282">
                        <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1165279154283">
                          <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuPart_Abstract_editedNode" id="1165279173968" />
                          <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetModelOperation" id="1165279154285" />
                        </node>
                      </node>
                      <node role="actualArgument" type="jetbrains.mps.bootstrap.sharedConcepts.ConceptFunctionParameter_scope" id="1165279154286" />
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1165279154287">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1165279154288">
                    <property name="name" value="structures" />
                    <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.SequenceType" id="1165279154289">
                      <node role="elementType" type="jetbrains.mps.baseLanguage.ClassifierType" id="1165279154290">
                        <link role="classifier" extResolveInfo="10.[Classifier]SModel" />
                      </node>
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.ext.collections.lang.SequenceOperationExpression" id="1165279154291">
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1165279154292">
                        <link role="variableDeclaration" targetNodeId="1165279154278" resolveInfo="languages" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.SelectOperation" id="1165279154293">
                        <node role="selector" type="jetbrains.mps.baseLanguage.ext.collections.lang.SelectorBlock" id="1165279154294">
                          <node role="defaultInputElement" type="jetbrains.mps.baseLanguage.ext.collections.lang.DefaultInputElement" id="1165279154295">
                            <property name="name" value="L" />
                          </node>
                          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1165279154296">
                            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1165279154297">
                              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1165279154298">
                                <link role="baseMethodDeclaration" extResolveInfo="10.method ([Classifier]SModelDescriptor).([InstanceMethodDeclaration]getSModel() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SModel]))" />
                                <node role="instance" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1165279154299">
                                  <link role="baseMethodDeclaration" extResolveInfo="10.method ([Classifier]Language).([InstanceMethodDeclaration]getStructureModelDescriptor() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SModelDescriptor]))" />
                                  <node role="instance" type="jetbrains.mps.baseLanguage.ClosureParameterReference" id="1165279154300">
                                    <link role="closureParameter" targetNodeId="1165279154295" resolveInfo="L" />
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
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1165279154301">
                  <node role="expression" type="jetbrains.mps.baseLanguage.ext.collections.lang.SequenceOperationExpression" id="1165279154302">
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.ext.collections.lang.SequenceOperationExpression" id="1165279154303">
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1165279154304">
                        <link role="variableDeclaration" targetNodeId="1165279154288" resolveInfo="structures" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.MapOperation" id="1165279154305">
                        <node role="mapper" type="jetbrains.mps.baseLanguage.ext.collections.lang.MapperBlock" id="1165279154306">
                          <node role="defaultInputElement" type="jetbrains.mps.baseLanguage.ext.collections.lang.DefaultInputElement" id="1165279154307">
                            <property name="name" value="S" />
                          </node>
                          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1165279154308">
                            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1165279154309">
                              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1165279154310">
                                <property name="name" value="roots" />
                                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1165279154311" />
                                <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1165279154312">
                                  <link role="baseMethodDeclaration" extResolveInfo="10.method ([Classifier]SModel).([InstanceMethodDeclaration]getRoots() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [List, &lt;jetbrains.mps.baseLanguage.types.classifier [SNode]&gt;]))" />
                                  <node role="instance" type="jetbrains.mps.baseLanguage.ClosureParameterReference" id="1165279154313">
                                    <link role="closureParameter" targetNodeId="1165279154307" resolveInfo="S" />
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.ForEachStatement" id="1165279154314">
                              <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.ForEachVariable" id="1165279154315">
                                <property name="name" value="root" />
                              </node>
                              <node role="inputSequence" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1165279154316">
                                <link role="variableDeclaration" targetNodeId="1165279154310" resolveInfo="roots" />
                              </node>
                              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1165279154317">
                                <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1165279154318">
                                  <node role="condition" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1165279154319">
                                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.ext.collections.lang.ForEachVariableReference" id="1165279154320">
                                      <link role="variable" targetNodeId="1165279154315" resolveInfo="root" />
                                    </node>
                                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsInstanceOfOperation" id="1165279154321">
                                      <link role="concept" targetNodeId="6.1071489090640" />
                                    </node>
                                  </node>
                                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1165279154322">
                                    <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.TraversalYieldStatement" id="1165279154323">
                                      <node role="value" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeTypeCastExpression" id="1165279154324">
                                        <link role="concept" targetNodeId="6.1071489090640" />
                                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.ext.collections.lang.ForEachVariableReference" id="1165279154325">
                                          <link role="variable" targetNodeId="1165279154315" resolveInfo="root" />
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
                    <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.ToListOperation" id="1165279154326" />
                  </node>
                </node>
              </node>
            </node>
            <node role="parameterObjectType" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1165279119873">
              <link role="concept" targetNodeId="6.1071489090640" />
            </node>
          </node>
          <node role="cellMenuPart" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuPart_ReplaceChild_CustomChildConcept" id="1165283338061">
            <node role="childConceptFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuPart_ReplaceChild_CustomChildConcept_Query" id="1165283338062">
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1165283338063">
                <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1165283359720">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1165283359721">
                    <property name="name" value="currentChildConcept" />
                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1165283359722" />
                    <node role="initializer" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuPart_ReplaceChild_defaultConceptOfChild" id="1165283363568" />
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1165283359724">
                  <node role="condition" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1165283359725">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1165283359726" />
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuPart_ReplaceChild_currentChild" id="1165283376459" />
                  </node>
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1165283359728">
                    <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1165283359729">
                      <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1165283359730">
                        <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1165283359731">
                          <link role="variableDeclaration" targetNodeId="1165283359721" resolveInfo="currentChildConcept" />
                        </node>
                        <node role="rValue" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1165283359732">
                          <link role="classConcept" extResolveInfo="10.[Classifier]SModelUtil" />
                          <link role="baseMethodDeclaration" extResolveInfo="10.static method ([Classifier]SModelUtil).([StaticMethodDeclaration]getConceptDeclaration((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SNode]), (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [IScope])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [ConceptDeclaration]))" />
                          <node role="actualArgument" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuPart_ReplaceChild_currentChild" id="1165283381382" />
                          <node role="actualArgument" type="jetbrains.mps.bootstrap.sharedConcepts.ConceptFunctionParameter_scope" id="1165283359734" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1165283359735">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1165283359736">
                    <property name="name" value="createActions" />
                    <node role="type" type="jetbrains.mps.baseLanguage.BooleanType" id="1165283359737" />
                    <node role="initializer" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1165283359738">
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1165283359739">
                        <link role="variableDeclaration" targetNodeId="1165283359721" resolveInfo="currentChildConcept" />
                      </node>
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1165283359740">
                        <link role="baseMethodDeclaration" extResolveInfo="10.static method ([Classifier]SModelUtil).([StaticMethodDeclaration]getBaseConcept() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [ConceptDeclaration]))" />
                        <link role="classConcept" extResolveInfo="10.[Classifier]SModelUtil" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1165283359741">
                  <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1165283359742">
                    <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1165283359743">
                      <link role="variableDeclaration" targetNodeId="1165283359736" resolveInfo="createActions" />
                    </node>
                    <node role="rValue" type="jetbrains.mps.baseLanguage.AndExpression" id="1165283359744">
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1165283359745">
                        <link role="variableDeclaration" targetNodeId="1165283359736" resolveInfo="createActions" />
                      </node>
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.ParenthesizedExpression" id="1165283359746">
                        <node role="expression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1165283359747">
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1165283359748">
                            <link role="variableDeclaration" targetNodeId="1165283359721" resolveInfo="currentChildConcept" />
                          </node>
                          <node role="rightExpression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1165283359749">
                            <link role="classConcept" extResolveInfo="10.[Classifier]SModelUtil" />
                            <link role="baseMethodDeclaration" extResolveInfo="10.static method ([Classifier]SModelUtil).([StaticMethodDeclaration]getNamedConcept() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [ConceptDeclaration]))" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1165283359750">
                  <node role="condition" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1165283359751">
                    <link role="variableDeclaration" targetNodeId="1165283359736" resolveInfo="createActions" />
                  </node>
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1165283359752">
                    <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1165283359753">
                      <node role="expression" type="jetbrains.mps.baseLanguage.CastExpression" id="1165283359754">
                        <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1165283359755">
                          <link role="variableDeclaration" targetNodeId="1165283359721" resolveInfo="currentChildConcept" />
                        </node>
                        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1165283359756">
                          <link role="concept" targetNodeId="6.1071489090640" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1165283359757">
                  <node role="expression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1165283359758" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1095419078589">
    <property name="name" value="MappingConfiguration_Editor" />
    <link role="conceptDeclaration" targetNodeId="1.1095416546421" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1095419078590">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1095419078591">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1095419078592">
          <property name="text" value="mapping configuration:" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1095419078593">
          <property name="drawBorder" value="false" />
          <property name="noTargetText" value="&lt;no name&gt;" />
          <link role="relationDeclaration" targetNodeId="4.1078489098626" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1095419376938">
        <property name="drawBorder" value="false" />
        <property name="name" value="separator" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167514761201">
        <property name="vertical" value="true" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167514761202">
          <property name="drawBorder" value="false" />
          <property name="vertical" value="false" />
          <property name="selectable" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167514761203">
            <property name="text" value="  " />
            <property name="drawBorder" value="false" />
            <property name="name" value="indent" />
            <property name="selectable" value="false" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167514761204">
            <property name="drawBorder" value="false" />
            <property name="vertical" value="true" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167514761205">
              <property name="textFgColor" value="red" />
              <property name="text" value="mapping rules (old):" />
              <property name="drawBorder" value="false" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167514761206">
              <property name="drawBorder" value="false" />
              <property name="vertical" value="false" />
              <property name="selectable" value="false" />
              <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167514761207">
                <property name="text" value="  " />
                <property name="drawBorder" value="false" />
                <property name="name" value="indent" />
                <property name="selectable" value="false" />
              </node>
              <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1167514761208">
                <property name="drawBorder" value="false" />
                <property name="vertical" value="true" />
                <property name="gridLayout" value="true" />
                <property name="selectable" value="false" />
                <link role="relationDeclaration" targetNodeId="1.1095416692159" />
              </node>
            </node>
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167514770664">
          <property name="drawBorder" value="false" />
          <property name="name" value="separator" />
          <property name="selectable" value="false" />
        </node>
        <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1167514782540">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1167514782541">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1167514784911">
              <node role="expression" type="jetbrains.mps.baseLanguage.GreaterThanExpression" id="1167514808496">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1167514812405">
                  <property name="value" value="0" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1167514800057">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1167514790430">
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.NodeCondition_FunctionParm_node" id="1167514788179" />
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkListAccess" id="1167514793681">
                      <link role="link" targetNodeId="1.1095416692159" />
                    </node>
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.LinkList_GetCountOperation" id="1167514803417" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167514717717">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167514717718">
          <property name="text" value="  " />
          <property name="drawBorder" value="false" />
          <property name="name" value="indent" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167514717719">
          <property name="drawBorder" value="false" />
          <property name="vertical" value="true" />
          <property name="selectable" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167514717720">
            <property name="text" value="mapping rules:" />
            <property name="drawBorder" value="false" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167514717721">
            <property name="drawBorder" value="false" />
            <property name="vertical" value="false" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167514717722">
              <property name="text" value="  " />
              <property name="drawBorder" value="false" />
              <property name="name" value="indent" />
              <property name="selectable" value="false" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1167514717723">
              <property name="drawBorder" value="false" />
              <property name="vertical" value="true" />
              <property name="selectable" value="false" />
              <link role="relationDeclaration" targetNodeId="1.1167514678247" />
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167514717724">
        <property name="drawBorder" value="false" />
        <property name="name" value="separator" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167243902059">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="true" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167243902060">
          <property name="drawBorder" value="false" />
          <property name="vertical" value="false" />
          <property name="selectable" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167243902061">
            <property name="text" value="  " />
            <property name="drawBorder" value="false" />
            <property name="name" value="indent" />
            <property name="selectable" value="false" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167243902062">
            <property name="drawBorder" value="false" />
            <property name="vertical" value="true" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167243902063">
              <property name="textFgColor" value="red" />
              <property name="text" value="weaving rules (old):" />
              <property name="drawBorder" value="false" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167243902064">
              <property name="drawBorder" value="false" />
              <property name="vertical" value="false" />
              <property name="selectable" value="false" />
              <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167243902065">
                <property name="text" value="  " />
                <property name="drawBorder" value="false" />
                <property name="name" value="indent" />
                <property name="selectable" value="false" />
              </node>
              <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1167243902066">
                <property name="drawBorder" value="false" />
                <property name="vertical" value="true" />
                <property name="gridLayout" value="true" />
                <property name="selectable" value="false" />
                <link role="relationDeclaration" targetNodeId="1.1095416692160" />
              </node>
            </node>
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167333277504">
          <property name="drawBorder" value="false" />
          <property name="name" value="separator" />
          <property name="selectable" value="false" />
        </node>
        <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1167243933523">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1167243933524">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1167243965754">
              <node role="expression" type="jetbrains.mps.baseLanguage.GreaterThanExpression" id="1167333384106">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1167243984681">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1167243971882">
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.NodeCondition_FunctionParm_node" id="1167243969913" />
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkListAccess" id="1167243981977">
                      <link role="link" targetNodeId="1.1095416692160" />
                    </node>
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.LinkList_GetCountOperation" id="1167243992526" />
                </node>
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1167243999967">
                  <property name="value" value="0" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167172252969">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167172252970">
          <property name="text" value="  " />
          <property name="drawBorder" value="false" />
          <property name="name" value="indent" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167172252971">
          <property name="drawBorder" value="false" />
          <property name="vertical" value="true" />
          <property name="selectable" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167172252972">
            <property name="text" value="weaving rules:" />
            <property name="drawBorder" value="false" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167172252973">
            <property name="drawBorder" value="false" />
            <property name="vertical" value="false" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167172252974">
              <property name="text" value="  " />
              <property name="drawBorder" value="false" />
              <property name="name" value="indent" />
              <property name="selectable" value="false" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1167172252975">
              <property name="drawBorder" value="false" />
              <property name="vertical" value="true" />
              <property name="selectable" value="false" />
              <link role="relationDeclaration" targetNodeId="1.1167172143858" />
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167172252976">
        <property name="drawBorder" value="false" />
        <property name="name" value="separator" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167333255554">
        <property name="vertical" value="true" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167333255555">
          <property name="drawBorder" value="false" />
          <property name="vertical" value="false" />
          <property name="selectable" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167333255556">
            <property name="text" value="  " />
            <property name="drawBorder" value="false" />
            <property name="name" value="indent" />
            <property name="selectable" value="false" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167333255557">
            <property name="drawBorder" value="false" />
            <property name="vertical" value="true" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167333255558">
              <property name="textFgColor" value="red" />
              <property name="text" value="reduction rules (old):" />
              <property name="drawBorder" value="false" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167333255559">
              <property name="drawBorder" value="false" />
              <property name="vertical" value="false" />
              <property name="selectable" value="false" />
              <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167333255560">
                <property name="text" value="  " />
                <property name="drawBorder" value="false" />
                <property name="name" value="indent" />
                <property name="selectable" value="false" />
              </node>
              <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1167333255561">
                <property name="drawBorder" value="false" />
                <property name="vertical" value="true" />
                <property name="gridLayout" value="true" />
                <property name="selectable" value="false" />
                <link role="relationDeclaration" targetNodeId="1.1132881836530" />
              </node>
            </node>
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167333289179">
          <property name="drawBorder" value="false" />
          <property name="name" value="separator" />
          <property name="selectable" value="false" />
        </node>
        <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1167333316774">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1167333316775">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1167333343437">
              <node role="expression" type="jetbrains.mps.baseLanguage.GreaterThanExpression" id="1167333366475">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1167333370884">
                  <property name="value" value="0" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1167333356957">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1167333347674">
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.NodeCondition_FunctionParm_node" id="1167333345954" />
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkListAccess" id="1167333353003">
                      <link role="link" targetNodeId="1.1132881836530" />
                    </node>
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.LinkList_GetCountOperation" id="1167333360974" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167328391789">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167328391790">
          <property name="text" value="  " />
          <property name="drawBorder" value="false" />
          <property name="name" value="indent" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167328391791">
          <property name="drawBorder" value="false" />
          <property name="vertical" value="true" />
          <property name="selectable" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167328391792">
            <property name="text" value="reduction rules:" />
            <property name="drawBorder" value="false" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167328391793">
            <property name="drawBorder" value="false" />
            <property name="vertical" value="false" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167328391794">
              <property name="text" value="  " />
              <property name="drawBorder" value="false" />
              <property name="name" value="indent" />
              <property name="selectable" value="false" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1167328391795">
              <property name="drawBorder" value="false" />
              <property name="vertical" value="true" />
              <property name="selectable" value="false" />
              <link role="relationDeclaration" targetNodeId="1.1167328349397" />
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167328391796">
        <property name="drawBorder" value="false" />
        <property name="name" value="separator" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167244753657">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167244753658">
          <property name="text" value="  " />
          <property name="drawBorder" value="false" />
          <property name="name" value="indent" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167244753659">
          <property name="drawBorder" value="false" />
          <property name="vertical" value="true" />
          <property name="selectable" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167244753660">
            <property name="text" value="conditional root rules:" />
            <property name="drawBorder" value="false" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167244753661">
            <property name="drawBorder" value="false" />
            <property name="vertical" value="false" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167244753662">
              <property name="text" value="  " />
              <property name="drawBorder" value="false" />
              <property name="name" value="indent" />
              <property name="selectable" value="false" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1167244753663">
              <property name="drawBorder" value="false" />
              <property name="vertical" value="true" />
              <property name="selectable" value="false" />
              <property name="gridLayout" value="true" />
              <link role="relationDeclaration" targetNodeId="1.1167088157977" />
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1133123767598">
        <property name="drawBorder" value="false" />
        <property name="name" value="separator" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1133123767599">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1133123767600">
          <property name="text" value="  " />
          <property name="drawBorder" value="false" />
          <property name="name" value="indent" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1133123767601">
          <property name="drawBorder" value="false" />
          <property name="vertical" value="true" />
          <property name="selectable" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1133123767602">
            <property name="text" value="output root concepts:" />
            <property name="drawBorder" value="false" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1133123767603">
            <property name="drawBorder" value="false" />
            <property name="vertical" value="false" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1133123767604">
              <property name="text" value="  " />
              <property name="drawBorder" value="false" />
              <property name="name" value="indent" />
              <property name="selectable" value="false" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1133123767605">
              <property name="drawBorder" value="false" />
              <property name="vertical" value="true" />
              <property name="selectable" value="false" />
              <property name="gridLayout" value="true" />
              <link role="relationDeclaration" targetNodeId="1.1132881767512" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1095419606578">
    <property name="name" value="MappingRule_Editor" />
    <link role="conceptDeclaration" targetNodeId="1.1095416572297" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1095419606579">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1095441898829">
        <property name="text" value="for each" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Custom" id="1095441898830">
        <property name="drawBorder" value="false" />
        <property name="cellProviderId" value="templateMappingRule_SourceQuery_CellProvider" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1095424336422">
        <property name="text" value="--&gt;" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1095419687662">
        <property name="textBgColor" value="orange" />
        <property name="allowEmptyText" value="true" />
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;no mapping name&gt;" />
        <property name="textBgColorSelected" value="cyan" />
        <link role="relationDeclaration" targetNodeId="4.1078489098626" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1095424336423">
        <property name="text" value=":" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1095420084444">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;no template&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1095417265990" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1095420084445">
          <link role="conceptDeclaration" targetNodeId="4.1078489098625" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1095420084446">
            <property name="drawBorder" value="false" />
            <property name="readOnly" value="true" />
            <property name="noTargetText" value="&lt;no name&gt;" />
            <link role="relationDeclaration" targetNodeId="4.1078489098626" />
          </node>
        </node>
      </node>
    </node>
    <node role="inspectedCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1095442717471">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1095442750740">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1095442750741">
          <property name="text" value="templateMappingRule_SourceQuery_" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Custom" id="1095442750742">
          <property name="drawBorder" value="false" />
          <property name="cellProviderId" value="templateMappingRule_SourceQuery_CellProvider" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1095442750743">
          <property name="text" value="()" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1095420477103">
    <property name="name" value="WeavingRule_Editor" />
    <link role="conceptDeclaration" targetNodeId="1.1095416624611" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1095420477104">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167171691455">
        <property name="text" value="for each" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Custom" id="1167171691456">
        <property name="drawBorder" value="false" />
        <property name="cellProviderId" value="templateWeavingRule_SourceQuery_CellProvider" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1095421134218">
        <property name="text" value="--&gt;" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1095676786799">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="true" />
        <property name="selectable" value="false" />
        <property name="gridLayout" value="true" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1095676812694">
          <property name="drawBorder" value="false" />
          <property name="noTargetText" value="&lt;no template&gt;" />
          <link role="relationDeclaration" targetNodeId="1.1095418098242" />
          <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1095676812695">
            <link role="conceptDeclaration" targetNodeId="1.1092059087312" />
            <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1095676812696">
              <property name="drawBorder" value="false" />
              <property name="readOnly" value="true" />
              <property name="noTargetText" value="&lt;no name&gt;" />
              <link role="relationDeclaration" targetNodeId="4.1078489098626" />
            </node>
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1095676835588">
          <property name="drawBorder" value="false" />
          <property name="vertical" value="false" />
          <property name="selectable" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1095676835589">
            <property name="text" value="context:" />
            <property name="drawBorder" value="false" />
            <property name="selectable" value="true" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Custom" id="1095676835590">
            <property name="drawBorder" value="false" />
            <property name="cellProviderId" value="templateWeavingRule_Context_CellProvider" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1095672501074">
    <property name="name" value="TemplateFragment_Editor" />
    <link role="conceptDeclaration" targetNodeId="1.1095672379244" />
    <node role="inspectedCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1095672654001">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1095672654002">
        <property name="text" value="&lt;Template Fragment&gt;" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1100694221900">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1100694221901">
          <property name="text" value="mapping name" />
          <property name="drawBorder" value="false" />
          <property name="nullText" value="&lt;none&gt;" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1100694221902">
          <property name="allowEmptyText" value="true" />
          <property name="textBgColor" value="orange" />
          <property name="drawBorder" value="false" />
          <property name="noTargetText" value="&lt;no name&gt;" />
          <property name="textBgColorSelected" value="cyan" />
          <link role="relationDeclaration" targetNodeId="4.1078489098626" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1095757990766">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1095757990767">
          <property name="text" value="templateFragment_Context_" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Custom" id="1095757990768">
          <property name="drawBorder" value="false" />
          <property name="cellProviderId" value="templateFragment_Context_CellProvider" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1095757990769">
          <property name="text" value="()" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
    </node>
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1096109716628">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1096109764800">
        <property name="textBgColor" value="pink" />
        <property name="text" value="&lt;TF" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
        <property name="textBgColorSelected" value="magenta" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1100694105555">
        <property name="textBgColor" value="orange" />
        <property name="drawBorder" value="false" />
        <property name="textBgColorSelected" value="cyan" />
        <link role="relationDeclaration" targetNodeId="4.1078489098626" />
        <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1146604643746">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1146604643747">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1146604692957">
              <node role="expression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1146604723411">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1146604697085">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.NodeCondition_FunctionParm_node" id="1146604695490" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1146604698398">
                    <link role="property" targetNodeId="4.1078489098626" />
                  </node>
                </node>
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1146604704386" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_AttributedNodeCell" id="1149858834706">
        <property name="drawBorder" value="false" />
        <property name="drawBrackets" value="true" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1149858857560">
        <property name="textBgColor" value="pink" />
        <property name="text" value="TF&gt;" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
        <property name="textBgColorSelected" value="magenta" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1112731832583">
    <link role="conceptDeclaration" targetNodeId="1.1112731569622" />
    <node role="inspectedCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1112732002603">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="true" />
      <property name="selectable" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1112732044745">
        <property name="text" value="&lt; Switch Macro &gt;" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1152722291322">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1152722291323">
          <property name="text" value="mapping name" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1152722291324">
          <property name="allowEmptyText" value="true" />
          <property name="drawBorder" value="false" />
          <property name="noTargetText" value="&lt;none&gt;" />
          <link role="relationDeclaration" targetNodeId="1.1152722085357" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1112732044746">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1112732044747">
          <property name="text" value="templateSourceQuery_" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Custom" id="1112732044748">
          <property name="drawBorder" value="false" />
          <property name="cellProviderId" value="templateSourceQuery_CellProvider" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1112732044749">
          <property name="text" value="(..)" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1112738412383">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1112738370678">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1112738412384">
          <property name="text" value="template switch" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1112738412385">
          <property name="drawBorder" value="false" />
          <property name="noTargetText" value="&lt;choose template switch&gt;" />
          <link role="relationDeclaration" targetNodeId="1.1112731629154" />
          <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1112738378725">
            <link role="conceptDeclaration" targetNodeId="1.1112730859144" />
            <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1112738412386">
              <property name="drawBorder" value="false" />
              <property name="readOnly" value="true" />
              <property name="noTargetText" value="&lt;no name&gt;" />
              <link role="relationDeclaration" targetNodeId="4.1078489098626" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1149865970859">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1149865971863">
        <property name="editable" value="true" />
        <property name="textFgColor" value="DARK_BLUE" />
        <property name="text" value="$SWITCH$" />
        <property name="fontStyle" value="BOLD_ITALIC" />
        <property name="drawBorder" value="false" />
        <property name="textBgColorSelected" value="cyan" />
        <link role="keyMap" targetNodeId="1149931179122" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1152722539533">
        <property name="textBgColor" value="orange" />
        <property name="drawBorder" value="false" />
        <property name="textBgColorSelected" value="cyan" />
        <link role="relationDeclaration" targetNodeId="1.1152722085357" />
        <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1152722539534">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1152722539535">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1152722539536">
              <node role="expression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1152722539537">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1152722539538" />
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1152722539539">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.NodeCondition_FunctionParm_node" id="1152722539540" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1152722539541">
                    <link role="property" targetNodeId="1.1152722085357" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_AttributedNodeCell" id="1149865975021">
        <property name="drawBorder" value="false" />
        <property name="drawBrackets" value="true" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1112732167706">
    <link role="conceptDeclaration" targetNodeId="1.1112730859144" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1112732179003">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1113324878579">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1113324878580">
          <property name="text" value="template switch" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1113324878581">
          <property name="drawBorder" value="false" />
          <property name="noTargetText" value="&lt;no name&gt;" />
          <link role="relationDeclaration" targetNodeId="4.1078489098626" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1113324878582">
          <property name="text" value="extends" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1113324878583">
          <property name="drawBorder" value="false" />
          <property name="noTargetText" value="&lt;none&gt;" />
          <link role="relationDeclaration" targetNodeId="1.1112820671508" />
          <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1113324878584">
            <link role="conceptDeclaration" targetNodeId="1.1112730859144" />
            <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1113324878585">
              <property name="drawBorder" value="false" />
              <property name="readOnly" value="true" />
              <property name="noTargetText" value="&lt;no name&gt;" />
              <link role="relationDeclaration" targetNodeId="4.1078489098626" />
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1112732307916">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1112732228505">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1112732307917">
          <property name="text" value="  " />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167337603751">
          <property name="drawBorder" value="false" />
          <property name="vertical" value="true" />
          <property name="selectable" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167340901400">
            <property name="vertical" value="true" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167340908529">
              <property name="textFgColor" value="red" />
              <property name="text" value="cases (old):" />
              <property name="drawBorder" value="false" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1167340901401">
              <property name="separatorText" value=" " />
              <property name="drawBorder" value="false" />
              <property name="vertical" value="true" />
              <property name="selectable" value="false" />
              <property name="gridLayout" value="true" />
              <link role="relationDeclaration" targetNodeId="1.1112731464728" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167340915594">
              <property name="drawBorder" value="false" />
              <property name="selectable" value="false" />
            </node>
            <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1167343946435">
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1167343946436">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1167343973814">
                  <node role="expression" type="jetbrains.mps.baseLanguage.GreaterThanExpression" id="1167343996774">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1167344000027">
                      <property name="value" value="0" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1167343990116">
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1167343978442">
                        <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.NodeCondition_FunctionParm_node" id="1167343976801" />
                        <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkListAccess" id="1167343988381">
                          <link role="link" targetNodeId="1.1112731464728" />
                        </node>
                      </node>
                      <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.LinkList_GetCountOperation" id="1167343993320" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167340820337">
            <property name="text" value="cases:" />
            <property name="drawBorder" value="false" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167340983613">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167340820338">
            <property name="drawBorder" value="false" />
            <property name="vertical" value="false" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167340820339">
              <property name="text" value="  " />
              <property name="drawBorder" value="false" />
              <property name="name" value="indent" />
              <property name="selectable" value="false" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1167340820340">
              <property name="drawBorder" value="false" />
              <property name="vertical" value="true" />
              <property name="selectable" value="false" />
              <link role="relationDeclaration" targetNodeId="1.1167340453568" />
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167340858502">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167340861629">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167337623947">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167337633496">
              <property name="text" value="default:" />
              <property name="drawBorder" value="false" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1167337647732">
              <property name="drawBorder" value="false" />
              <property name="noTargetText" value="&lt;nothing&gt;" />
              <link role="relationDeclaration" targetNodeId="1.1167337076112" />
              <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1167337647733">
                <link role="conceptDeclaration" targetNodeId="1.1092059087312" />
                <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1167337655501">
                  <property name="readOnly" value="true" />
                  <property name="noTargetText" value="&lt;no name&gt;" />
                  <link role="relationDeclaration" targetNodeId="4.1078489098626" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1112732352606">
    <link role="conceptDeclaration" targetNodeId="1.1112730955130" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1112732806310">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1112733509077">
        <property name="text" value="case" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Custom" id="1112733509078">
        <property name="drawBorder" value="false" />
        <property name="cellProviderId" value="semanticNodeCondition_CellProvider" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1112733509079">
        <property name="text" value="  : " />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1112804833058">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;no template - skip source&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1112804745009" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1112804790541">
          <link role="conceptDeclaration" targetNodeId="1.1092059087312" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1112804833059">
            <property name="drawBorder" value="false" />
            <property name="readOnly" value="true" />
            <link role="relationDeclaration" targetNodeId="4.1078489098626" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1112911659681">
    <link role="conceptDeclaration" targetNodeId="1.1112911581741" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1112911714074">
      <property name="drawBorder" value="false" />
      <property name="noTargetText" value="&lt;choose switch&gt;" />
      <link role="relationDeclaration" targetNodeId="1.1112911598335" />
      <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1112911678104">
        <link role="conceptDeclaration" targetNodeId="1.1112730859144" />
        <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1112911714075">
          <property name="drawBorder" value="false" />
          <property name="readOnly" value="true" />
          <property name="noTargetText" value="&lt;no name&gt;" />
          <link role="relationDeclaration" targetNodeId="4.1078489098626" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1114458549484">
    <link role="conceptDeclaration" targetNodeId="1.1114458327664" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1114458600627">
      <property name="drawBorder" value="false" />
      <property name="noTargetText" value="&lt;choose concept declaration&gt;" />
      <link role="relationDeclaration" targetNodeId="1.1114458346385" />
      <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1114458566423">
        <link role="conceptDeclaration" targetNodeId="6.1071489090640" />
        <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1114458600628">
          <property name="textFgColor" value="DARK_MAGENTA" />
          <property name="drawBorder" value="false" />
          <property name="readOnly" value="true" />
          <property name="noTargetText" value="&lt;no name&gt;" />
          <link role="relationDeclaration" targetNodeId="4.1078489098626" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1114458648191">
    <link role="conceptDeclaration" targetNodeId="1.1114456532170" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1114461204693">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1114461360775">
        <property name="text" value="case:" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Custom" id="1114461360776">
        <property name="drawBorder" value="false" />
        <property name="cellProviderId" value="reductionRuleCondition_AspectId" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1114461360777">
        <property name="text" value="--&gt;" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1132950999824">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;no template&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1132950837789" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1132950999823">
          <link role="conceptDeclaration" targetNodeId="1.1092059087312" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1132951007170">
            <property name="drawBorder" value="false" />
            <property name="readOnly" value="true" />
            <link role="relationDeclaration" targetNodeId="4.1078489098626" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1114707211025">
    <link role="conceptDeclaration" targetNodeId="1.1118773211870" />
    <node role="inspectedCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1114709712821">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="true" />
      <property name="selectable" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1114709792729">
        <property name="text" value="&lt; conditional macro &gt;" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1152722302265">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1152722302266">
          <property name="text" value="mapping name" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1152722302267">
          <property name="allowEmptyText" value="true" />
          <property name="drawBorder" value="false" />
          <property name="noTargetText" value="&lt;none&gt;" />
          <link role="relationDeclaration" targetNodeId="1.1152722085357" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1114709792730">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1114709792731">
          <property name="text" value="nodeCondition_" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Custom" id="1114709792732">
          <property name="drawBorder" value="false" />
          <property name="cellProviderId" value="semanticNodeCondition_CellProvider" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1114709792733">
          <property name="text" value="(..)" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1114709792734">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
    </node>
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1149865994570">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1149865995528">
        <property name="editable" value="true" />
        <property name="textFgColor" value="DARK_BLUE" />
        <property name="text" value="$IF$" />
        <property name="fontStyle" value="BOLD_ITALIC" />
        <property name="drawBorder" value="false" />
        <property name="textBgColorSelected" value="cyan" />
        <link role="keyMap" targetNodeId="1149931179122" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1152722546973">
        <property name="textBgColor" value="orange" />
        <property name="drawBorder" value="false" />
        <property name="textBgColorSelected" value="cyan" />
        <link role="relationDeclaration" targetNodeId="1.1152722085357" />
        <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1152722546974">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1152722546975">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1152722546976">
              <node role="expression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1152722546977">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1152722546978" />
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1152722546979">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.NodeCondition_FunctionParm_node" id="1152722546980" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1152722546981">
                    <link role="property" targetNodeId="1.1152722085357" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_AttributedNodeCell" id="1149865998639">
        <property name="drawBorder" value="false" />
        <property name="drawBrackets" value="true" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1114729546995">
    <link role="conceptDeclaration" targetNodeId="1.1114729360583" />
    <node role="inspectedCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1114729602403">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="true" />
      <property name="selectable" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1114729602404">
        <property name="text" value="&lt; Copy Src List of Nodes macro &gt;" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1152722248456">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1152722248457">
          <property name="text" value="mapping name" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1152722248458">
          <property name="allowEmptyText" value="true" />
          <property name="drawBorder" value="false" />
          <property name="noTargetText" value="&lt;none&gt;" />
          <link role="relationDeclaration" targetNodeId="1.1152722085357" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1114729602405">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1114729602406">
          <property name="text" value="templateSourceQuery_" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Custom" id="1114729602407">
          <property name="drawBorder" value="false" />
          <property name="cellProviderId" value="templateSourceQuery_CellProvider" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1114729602408">
          <property name="text" value="(..)" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1114729602409">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
    </node>
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1149865947522">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1149865948823">
        <property name="editable" value="true" />
        <property name="textFgColor" value="DARK_BLUE" />
        <property name="text" value="$COPY_SRCL$" />
        <property name="fontStyle" value="BOLD_ITALIC" />
        <property name="drawBorder" value="false" />
        <property name="textBgColorSelected" value="cyan" />
        <link role="keyMap" targetNodeId="1149931179122" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1152722532921">
        <property name="textBgColor" value="orange" />
        <property name="drawBorder" value="false" />
        <property name="textBgColorSelected" value="cyan" />
        <link role="relationDeclaration" targetNodeId="1.1152722085357" />
        <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1152722532922">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1152722532923">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1152722532924">
              <node role="expression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1152722532925">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1152722532926" />
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1152722532927">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.NodeCondition_FunctionParm_node" id="1152722532928" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1152722532929">
                    <link role="property" targetNodeId="1.1152722085357" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_AttributedNodeCell" id="1149865951872">
        <property name="drawBorder" value="false" />
        <property name="drawBrackets" value="true" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1118773368750">
    <link role="conceptDeclaration" targetNodeId="1.1114706874351" />
    <node role="inspectedCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1118773368752">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="true" />
      <property name="selectable" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1118773368753">
        <property name="text" value="&lt; Copy Src Node macro &gt;" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1152722324711">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1152722324712">
          <property name="text" value="mapping name" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1152722324713">
          <property name="allowEmptyText" value="true" />
          <property name="drawBorder" value="false" />
          <property name="noTargetText" value="&lt;none&gt;" />
          <link role="relationDeclaration" targetNodeId="1.1152722085357" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1118773368754">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1118773368755">
          <property name="text" value="templateSourceNodeQuery_" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Custom" id="1118773368756">
          <property name="drawBorder" value="false" />
          <property name="cellProviderId" value="templateSourceNodeQueryId" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1118773368757">
          <property name="text" value="(..)" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
    </node>
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1149866056564">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1149866057537">
        <property name="editable" value="true" />
        <property name="textFgColor" value="DARK_BLUE" />
        <property name="text" value="$COPY_SRC$" />
        <property name="fontStyle" value="BOLD_ITALIC" />
        <property name="drawBorder" value="false" />
        <property name="textBgColorSelected" value="cyan" />
        <link role="keyMap" targetNodeId="1149931179122" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1152722581607">
        <property name="textBgColor" value="orange" />
        <property name="drawBorder" value="false" />
        <property name="textBgColorSelected" value="cyan" />
        <link role="relationDeclaration" targetNodeId="1.1152722085357" />
        <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1152722581608">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1152722581609">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1152722581610">
              <node role="expression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1152722581611">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1152722581612" />
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1152722581613">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.NodeCondition_FunctionParm_node" id="1152722581614" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1152722581615">
                    <link role="property" targetNodeId="1.1152722085357" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_AttributedNodeCell" id="1149866060008">
        <property name="drawBorder" value="false" />
        <property name="drawBrackets" value="true" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1118786597045">
    <link role="conceptDeclaration" targetNodeId="1.1118786554307" />
    <node role="inspectedCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1118786597047">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="true" />
      <property name="selectable" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1118786597048">
        <property name="text" value="&lt; loop macro &gt;" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1152722313512">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1152722313513">
          <property name="text" value="mapping name" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1152722313514">
          <property name="allowEmptyText" value="true" />
          <property name="drawBorder" value="false" />
          <property name="noTargetText" value="&lt;none&gt;" />
          <link role="relationDeclaration" targetNodeId="1.1152722085357" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1118786597049">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1118786597050">
          <property name="text" value="templateSourceQuery_" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Custom" id="1118786597051">
          <property name="drawBorder" value="false" />
          <property name="cellProviderId" value="templateSourceQuery_CellProvider" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1118786597052">
          <property name="text" value="(..)" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1118786597053">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
    </node>
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1149866039728">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1149866040638">
        <property name="editable" value="true" />
        <property name="textFgColor" value="DARK_BLUE" />
        <property name="text" value="$LOOP$" />
        <property name="fontStyle" value="BOLD_ITALIC" />
        <property name="drawBorder" value="false" />
        <property name="textBgColorSelected" value="cyan" />
        <link role="keyMap" targetNodeId="1149931179122" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1152722569821">
        <property name="textBgColor" value="orange" />
        <property name="drawBorder" value="false" />
        <property name="textBgColorSelected" value="cyan" />
        <link role="relationDeclaration" targetNodeId="1.1152722085357" />
        <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1152722569822">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1152722569823">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1152722569824">
              <node role="expression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1152722569825">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1152722569826" />
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1152722569827">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.NodeCondition_FunctionParm_node" id="1152722569828" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1152722569829">
                    <link role="property" targetNodeId="1.1152722085357" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_AttributedNodeCell" id="1149866045437">
        <property name="drawBorder" value="false" />
        <property name="drawBrackets" value="true" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1131073370410">
    <link role="conceptDeclaration" targetNodeId="1.1131073187192" />
    <node role="inspectedCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1131073370412">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="true" />
      <property name="selectable" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1131073370413">
        <property name="text" value="&lt; map src node macro &gt;" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1152722308193">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1152722308194">
          <property name="text" value="mapping name" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1152722308195">
          <property name="allowEmptyText" value="true" />
          <property name="drawBorder" value="false" />
          <property name="noTargetText" value="&lt;none&gt;" />
          <link role="relationDeclaration" targetNodeId="1.1152722085357" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1131073370414">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1131073370415">
          <property name="text" value="templateSourceNodeQuery_" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Custom" id="1131073370416">
          <property name="drawBorder" value="false" />
          <property name="cellProviderId" value="templateSourceNodeQueryId_Optional" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1131073370417">
          <property name="text" value="(..)" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1131073696555">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1131073696556">
          <property name="text" value="templateSourceNodeMapper_" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Custom" id="1131073696557">
          <property name="drawBorder" value="false" />
          <property name="cellProviderId" value="templateSourceNodeMapperId" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1131073696558">
          <property name="text" value="(..)" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1131073370418">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
    </node>
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1149866021735">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1149866022646">
        <property name="editable" value="true" />
        <property name="textFgColor" value="DARK_BLUE" />
        <property name="text" value="$MAP_SRC$" />
        <property name="fontStyle" value="BOLD_ITALIC" />
        <property name="drawBorder" value="false" />
        <property name="textBgColorSelected" value="cyan" />
        <link role="keyMap" targetNodeId="1149931179122" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1152722564678">
        <property name="textBgColor" value="orange" />
        <property name="drawBorder" value="false" />
        <property name="textBgColorSelected" value="cyan" />
        <link role="relationDeclaration" targetNodeId="1.1152722085357" />
        <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1152722564679">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1152722564680">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1152722564681">
              <node role="expression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1152722564682">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1152722564683" />
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1152722564684">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.NodeCondition_FunctionParm_node" id="1152722564685" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1152722564686">
                    <link role="property" targetNodeId="1.1152722085357" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_AttributedNodeCell" id="1149866026194">
        <property name="drawBorder" value="false" />
        <property name="drawBrackets" value="true" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1133037934981">
    <link role="conceptDeclaration" targetNodeId="1.1133037731736" />
    <node role="inspectedCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1133038004770">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="true" />
      <property name="selectable" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1133038004771">
        <property name="text" value="&lt; map src nodes macro &gt;" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1152722318674">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1152722318675">
          <property name="text" value="mapping name" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1152722318676">
          <property name="allowEmptyText" value="true" />
          <property name="drawBorder" value="false" />
          <property name="noTargetText" value="&lt;none&gt;" />
          <link role="relationDeclaration" targetNodeId="1.1152722085357" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1133038004772">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1133038004773">
          <property name="text" value="templateSourceQuery_" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Custom" id="1133038004774">
          <property name="drawBorder" value="false" />
          <property name="cellProviderId" value="templateSourceQuery_CellProvider" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1133038004775">
          <property name="text" value="(..)" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1133038043414">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1133038043415">
          <property name="text" value="templateSourceNodeMapper_" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Custom" id="1133038043416">
          <property name="drawBorder" value="false" />
          <property name="cellProviderId" value="templateSourceNodeMapperId" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1133038043417">
          <property name="text" value="(..)" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1133038004780">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
    </node>
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1149865914232">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1149865915190">
        <property name="editable" value="true" />
        <property name="textFgColor" value="DARK_BLUE" />
        <property name="text" value="$MAP_SRCL$" />
        <property name="fontStyle" value="BOLD_ITALIC" />
        <property name="drawBorder" value="false" />
        <property name="textBgColorSelected" value="cyan" />
        <link role="keyMap" targetNodeId="1149931179122" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1152722575417">
        <property name="textBgColor" value="orange" />
        <property name="drawBorder" value="false" />
        <property name="textBgColorSelected" value="cyan" />
        <link role="relationDeclaration" targetNodeId="1.1152722085357" />
        <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1152722575418">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1152722575419">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1152722575420">
              <node role="expression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1152722575421">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1152722575422" />
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1152722575423">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.NodeCondition_FunctionParm_node" id="1152722575424" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1152722575425">
                    <link role="property" targetNodeId="1.1152722085357" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_AttributedNodeCell" id="1149865918317">
        <property name="drawBorder" value="false" />
        <property name="drawBrackets" value="true" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapDeclaration" id="1149868357716">
    <property name="everyModel" value="true" />
    <property name="name" value="_MacrosSwitch_KeyMap" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapItem" id="1149868396494">
      <property name="showInPopup" value="true" />
      <property name="description" value="convert to/from 'template fragmet'" />
      <node role="keystroke" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapKeystroke" id="1149868396495">
        <property name="modifiers" value="ctrl+shift" />
        <property name="keycode" value="VK_F" />
      </node>
      <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_IsApplicableFunction" id="1149868396496">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1149868396497">
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1149930383754">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1149930383755">
              <property name="name" value="selectedNode" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1149930383756" />
              <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1149930383757">
                <link role="baseMethodDeclaration" extResolveInfo="9.method ([Classifier]EditorCell).([InstanceMethodDeclaration]getSNode() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SNode]))" />
                <node role="instance" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1149930383758">
                  <link role="baseMethodDeclaration" extResolveInfo="9.method ([Classifier]EditorContext).([InstanceMethodDeclaration]getSelectedCell() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [EditorCell]))" />
                  <node role="instance" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_editorContext" id="1149930383759" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1149868396498">
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1149868396499">
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1149868396500">
                <node role="expression" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1149868396501" />
              </node>
            </node>
            <node role="condition" type="jetbrains.mps.baseLanguage.EqualsExpression" id="1149868396502">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1149868396503">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1149930402974">
                  <link role="variableDeclaration" targetNodeId="1149930383755" />
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetParentOperation" id="1149868396505">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.OperationParm_Concept" id="1149868396506">
                    <link role="concept" targetNodeId="1.1092059087312" />
                  </node>
                </node>
              </node>
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1149868396507" />
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1149868396508">
            <node role="expression" type="jetbrains.mps.baseLanguage.NotExpression" id="1149868396509">
              <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1149868396510">
                <link role="baseMethodDeclaration" extResolveInfo="8.static method ([Classifier]TemplateLanguageUtil).([StaticMethodDeclaration]isInsideTemplateFragment((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SNode])) : (jetbrains.mps.baseLanguage.types.boolean/jetbrains.mps.baseLanguage.types.boolean))" />
                <link role="classConcept" extResolveInfo="8.[Classifier]TemplateLanguageUtil" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1149930411569">
                  <link role="variableDeclaration" targetNodeId="1149930383755" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_ExecuteFunction" id="1149868396512">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1149868396513">
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1149930388404">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1149930388405">
              <property name="name" value="selectedNode" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1149930388406" />
              <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1149930388407">
                <link role="baseMethodDeclaration" extResolveInfo="9.method ([Classifier]EditorCell).([InstanceMethodDeclaration]getSNode() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SNode]))" />
                <node role="instance" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1149930388408">
                  <link role="baseMethodDeclaration" extResolveInfo="9.method ([Classifier]EditorContext).([InstanceMethodDeclaration]getSelectedCell() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [EditorCell]))" />
                  <node role="instance" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_editorContext" id="1149930388409" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1149868396514">
            <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1149868396515">
              <link role="baseMethodDeclaration" extResolveInfo="8.static method ([Classifier]TemplateLanguageUtil).([StaticMethodDeclaration]switchTemplateFragment((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SNode])) : (jetbrains.mps.baseLanguage.types.void/jetbrains.mps.baseLanguage.types.void))" />
              <link role="classConcept" extResolveInfo="8.[Classifier]TemplateLanguageUtil" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1149930396051">
                <link role="variableDeclaration" targetNodeId="1149930388405" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapItem" id="1149868396517">
      <property name="showInPopup" value="true" />
      <property name="description" value="add node macro" />
      <node role="keystroke" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapKeystroke" id="1149868396518">
        <property name="modifiers" value="ctrl+shift" />
        <property name="keycode" value="VK_M" />
      </node>
      <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_IsApplicableFunction" id="1149868396519">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1149868396520">
          <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1149868396521">
            <node role="expression" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1149868396522">
              <property name="value" value="true" />
            </node>
          </node>
        </node>
      </node>
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_ExecuteFunction" id="1149868396523">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1149868396524">
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1149930300675">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1149930300676">
              <property name="name" value="selectedNode" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1149930300677" />
              <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1149930300678">
                <link role="baseMethodDeclaration" extResolveInfo="9.method ([Classifier]EditorCell).([InstanceMethodDeclaration]getSNode() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SNode]))" />
                <node role="instance" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1149930300679">
                  <link role="baseMethodDeclaration" extResolveInfo="9.method ([Classifier]EditorContext).([InstanceMethodDeclaration]getSelectedCell() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [EditorCell]))" />
                  <node role="instance" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_editorContext" id="1149930300680" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1149868396525">
            <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1149868396526">
              <link role="classConcept" extResolveInfo="8.[Classifier]TemplateLanguageUtil" />
              <link role="baseMethodDeclaration" extResolveInfo="8.static method ([Classifier]TemplateLanguageUtil).([StaticMethodDeclaration]switchNodeMacro((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SNode])) : (jetbrains.mps.baseLanguage.types.void/jetbrains.mps.baseLanguage.types.void))" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1149930309540">
                <link role="variableDeclaration" targetNodeId="1149930300676" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapItem" id="1149868414143">
      <property name="showInPopup" value="true" />
      <property name="description" value="add/remove property macro" />
      <node role="keystroke" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapKeystroke" id="1149868414144">
        <property name="modifiers" value="ctrl+shift" />
        <property name="keycode" value="VK_M" />
      </node>
      <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_IsApplicableFunction" id="1149868414145">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1149868414146">
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1149868414147">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1149868414148">
              <property name="name" value="cell" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1149868414149">
                <link role="classifier" extResolveInfo="9.[Classifier]EditorCell" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1149868414150">
                <link role="baseMethodDeclaration" extResolveInfo="9.method ([Classifier]EditorContext).([InstanceMethodDeclaration]getSelectedCell() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [EditorCell]))" />
                <node role="instance" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_editorContext" id="1149868414151" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1149868414160">
            <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1149868414161">
              <link role="baseMethodDeclaration" extResolveInfo="8.static method ([Classifier]TemplateLanguageUtil).([StaticMethodDeclaration]canSwitchPropertyMacro((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [EditorCell])) : (jetbrains.mps.baseLanguage.types.boolean/jetbrains.mps.baseLanguage.types.boolean))" />
              <link role="classConcept" extResolveInfo="8.[Classifier]TemplateLanguageUtil" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1149868414162">
                <link role="variableDeclaration" targetNodeId="1149868414148" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_ExecuteFunction" id="1149868414163">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1149868414164">
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1149868414165">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1149868414166">
              <property name="name" value="cell" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1149868414167">
                <link role="classifier" extResolveInfo="9.[Classifier]EditorCell" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1149868414168">
                <link role="baseMethodDeclaration" extResolveInfo="9.method ([Classifier]EditorContext).([InstanceMethodDeclaration]getSelectedCell() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [EditorCell]))" />
                <node role="instance" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_editorContext" id="1149868414169" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1149868414170">
            <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1149868414171">
              <link role="classConcept" extResolveInfo="8.[Classifier]TemplateLanguageUtil" />
              <link role="baseMethodDeclaration" extResolveInfo="8.static method ([Classifier]TemplateLanguageUtil).([StaticMethodDeclaration]switchPropertyMacro((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [EditorCell]), (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [IScope])) : (jetbrains.mps.baseLanguage.types.void/jetbrains.mps.baseLanguage.types.void))" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1149868414172">
                <link role="variableDeclaration" targetNodeId="1149868414166" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1149868414173">
                <link role="baseMethodDeclaration" extResolveInfo="10.method ([Classifier]IOperationContext).([InstanceMethodDeclaration]getScope() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [IScope]))" />
                <node role="instance" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1149868414174">
                  <link role="baseMethodDeclaration" extResolveInfo="9.method ([Classifier]EditorContext).([InstanceMethodDeclaration]getOperationContext() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [IOperationContext]))" />
                  <node role="instance" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_editorContext" id="1149868414175" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapItem" id="1149868455481">
      <property name="showInPopup" value="true" />
      <property name="description" value="add/remove reference macro" />
      <node role="keystroke" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapKeystroke" id="1149868455482">
        <property name="modifiers" value="ctrl+shift" />
        <property name="keycode" value="VK_M" />
      </node>
      <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_IsApplicableFunction" id="1149868455483">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1149868455484">
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1149868455485">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1149868455486">
              <property name="name" value="cell" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1149868455487">
                <link role="classifier" extResolveInfo="9.[Classifier]EditorCell" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1149868455488">
                <link role="baseMethodDeclaration" extResolveInfo="9.method ([Classifier]EditorContext).([InstanceMethodDeclaration]getSelectedCell() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [EditorCell]))" />
                <node role="instance" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_editorContext" id="1149868455489" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1149868455498">
            <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1149868455499">
              <link role="baseMethodDeclaration" extResolveInfo="8.static method ([Classifier]TemplateLanguageUtil).([StaticMethodDeclaration]canSwitchReferenceMacro((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [EditorCell])) : (jetbrains.mps.baseLanguage.types.boolean/jetbrains.mps.baseLanguage.types.boolean))" />
              <link role="classConcept" extResolveInfo="8.[Classifier]TemplateLanguageUtil" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1149868455500">
                <link role="variableDeclaration" targetNodeId="1149868455486" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_ExecuteFunction" id="1149868455501">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1149868455502">
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1149868455503">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1149868455504">
              <property name="name" value="cell" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1149868455505">
                <link role="classifier" extResolveInfo="9.[Classifier]EditorCell" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1149868455506">
                <link role="baseMethodDeclaration" extResolveInfo="9.method ([Classifier]EditorContext).([InstanceMethodDeclaration]getSelectedCell() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [EditorCell]))" />
                <node role="instance" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_editorContext" id="1149868455507" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1149868455508">
            <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1149868455509">
              <link role="baseMethodDeclaration" extResolveInfo="8.static method ([Classifier]TemplateLanguageUtil).([StaticMethodDeclaration]switchReferenceMacro((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [EditorCell])) : (jetbrains.mps.baseLanguage.types.void/jetbrains.mps.baseLanguage.types.void))" />
              <link role="classConcept" extResolveInfo="8.[Classifier]TemplateLanguageUtil" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1149868455510">
                <link role="variableDeclaration" targetNodeId="1149868455504" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapDeclaration" id="1149931179122">
    <property name="name" value="_RemoveMacro_KeyMap" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapItem" id="1149931207086">
      <property name="description" value="remove property macro" />
      <node role="keystroke" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapKeystroke" id="1149931207087">
        <property name="modifiers" value="ctrl+shift" />
        <property name="keycode" value="VK_M" />
      </node>
      <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_IsApplicableFunction" id="1149931207088">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1149931207089">
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1149931207090">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1149931207091">
              <property name="name" value="selectedNode" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1149931207092" />
              <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1149931207093">
                <link role="baseMethodDeclaration" extResolveInfo="9.method ([Classifier]EditorCell).([InstanceMethodDeclaration]getSNode() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SNode]))" />
                <node role="instance" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1149931207094">
                  <link role="baseMethodDeclaration" extResolveInfo="9.method ([Classifier]EditorContext).([InstanceMethodDeclaration]getSelectedCell() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [EditorCell]))" />
                  <node role="instance" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_editorContext" id="1149931207095" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1149931207096">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1149931207097">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1149931207098">
                <link role="variableDeclaration" targetNodeId="1149931207091" />
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsInstanceOfOperation" id="1149931207099">
                <link role="concept" targetNodeId="1.1087833241328" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_ExecuteFunction" id="1149931207100">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1149931207101">
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1149931207102">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1149931207103">
              <property name="name" value="propertyMacro" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1149931207104" />
              <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1149931207105">
                <link role="baseMethodDeclaration" extResolveInfo="9.method ([Classifier]EditorCell).([InstanceMethodDeclaration]getSNode() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SNode]))" />
                <node role="instance" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1149931207106">
                  <link role="baseMethodDeclaration" extResolveInfo="9.method ([Classifier]EditorContext).([InstanceMethodDeclaration]getSelectedCell() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [EditorCell]))" />
                  <node role="instance" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_editorContext" id="1149931207107" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1149931207108">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1149931207109">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1149931207110">
                <link role="variableDeclaration" targetNodeId="1149931207103" />
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_DeleteOperation" id="1149931207111" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapItem" id="1149931224617">
      <property name="description" value="remove reference macro" />
      <node role="keystroke" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapKeystroke" id="1149931224618">
        <property name="modifiers" value="ctrl+shift" />
        <property name="keycode" value="VK_M" />
      </node>
      <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_IsApplicableFunction" id="1149931224619">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1149931224620">
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1149931224621">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1149931224622">
              <property name="name" value="selectedNode" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1149931224623" />
              <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1149931224624">
                <link role="baseMethodDeclaration" extResolveInfo="9.method ([Classifier]EditorCell).([InstanceMethodDeclaration]getSNode() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SNode]))" />
                <node role="instance" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1149931224625">
                  <link role="baseMethodDeclaration" extResolveInfo="9.method ([Classifier]EditorContext).([InstanceMethodDeclaration]getSelectedCell() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [EditorCell]))" />
                  <node role="instance" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_editorContext" id="1149931224626" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1149931224627">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1149931224628">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1149931224629">
                <link role="variableDeclaration" targetNodeId="1149931224622" />
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsInstanceOfOperation" id="1149931224630">
                <link role="concept" targetNodeId="1.1088761943574" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_ExecuteFunction" id="1149931224631">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1149931224632">
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1149931224633">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1149931224634">
              <property name="name" value="referenceMacro" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1149931224635" />
              <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1149931224636">
                <link role="baseMethodDeclaration" extResolveInfo="9.method ([Classifier]EditorCell).([InstanceMethodDeclaration]getSNode() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SNode]))" />
                <node role="instance" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1149931224637">
                  <link role="baseMethodDeclaration" extResolveInfo="9.method ([Classifier]EditorContext).([InstanceMethodDeclaration]getSelectedCell() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [EditorCell]))" />
                  <node role="instance" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_editorContext" id="1149931224638" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1149931224639">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1149931224640">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1149931224641">
                <link role="variableDeclaration" targetNodeId="1149931224634" />
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_DeleteOperation" id="1149931224642" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapItem" id="1149931229356">
      <property name="description" value="remove node macro" />
      <node role="keystroke" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapKeystroke" id="1149931229357">
        <property name="modifiers" value="ctrl+shift" />
        <property name="keycode" value="VK_M" />
      </node>
      <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_IsApplicableFunction" id="1149931229358">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1149931229359">
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1149931229360">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1149931229361">
              <property name="name" value="selectedNode" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1149931229362" />
              <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1149931229363">
                <link role="baseMethodDeclaration" extResolveInfo="9.method ([Classifier]EditorCell).([InstanceMethodDeclaration]getSNode() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SNode]))" />
                <node role="instance" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1149931229364">
                  <link role="baseMethodDeclaration" extResolveInfo="9.method ([Classifier]EditorContext).([InstanceMethodDeclaration]getSelectedCell() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [EditorCell]))" />
                  <node role="instance" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_editorContext" id="1149931229365" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1149931229366">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1149931229367">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1149931229368">
                <link role="variableDeclaration" targetNodeId="1149931229361" />
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsInstanceOfOperation" id="1149931229369">
                <link role="concept" targetNodeId="1.1087833466690" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_ExecuteFunction" id="1149931229370">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1149931229371">
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1149931229372">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1149931229373">
              <property name="name" value="nodeMacro" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1149931229374" />
              <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1149931229375">
                <link role="baseMethodDeclaration" extResolveInfo="9.method ([Classifier]EditorCell).([InstanceMethodDeclaration]getSNode() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SNode]))" />
                <node role="instance" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1149931229376">
                  <link role="baseMethodDeclaration" extResolveInfo="9.method ([Classifier]EditorContext).([InstanceMethodDeclaration]getSelectedCell() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [EditorCell]))" />
                  <node role="instance" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_editorContext" id="1149931229377" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1149931229378">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1149931229379">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1149931229380">
                <link role="variableDeclaration" targetNodeId="1149931229373" />
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_DeleteOperation" id="1149931229381" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1164129385371">
    <link role="conceptDeclaration" targetNodeId="1.1164129274099" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1164129387403">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1164129387404">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1164129387405">
          <property name="text" value="rewriting rules" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1164129387406">
          <property name="drawBorder" value="false" />
          <property name="noTargetText" value="&lt;no name&gt;" />
          <link role="relationDeclaration" targetNodeId="4.1078489098626" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1164129387407">
        <property name="drawBorder" value="false" />
        <property name="name" value="separator" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1164129387424">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1164129387425">
          <property name="textFgColor" value="red" />
          <property name="text" value="old:" />
          <property name="drawBorder" value="false" />
          <property name="name" value="indent" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1164212870535">
          <property name="drawBorder" value="false" />
          <property name="vertical" value="true" />
          <property name="selectable" value="false" />
          <property name="gridLayout" value="true" />
          <link role="relationDeclaration" targetNodeId="1.1164129352445" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167333619208">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167333619209">
          <property name="textFgColor" value="red" />
          <property name="text" value="    " />
          <property name="drawBorder" value="false" />
          <property name="name" value="indent" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1167333619210">
          <property name="drawBorder" value="false" />
          <property name="vertical" value="true" />
          <property name="selectable" value="false" />
          <link role="relationDeclaration" targetNodeId="1.1167329435487" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1167087589303">
    <link role="conceptDeclaration" targetNodeId="1.1167087518662" />
    <node role="inspectedCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167087675405">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="true" />
      <property name="selectable" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167087675406">
        <property name="textBgColor" value="lightGray" />
        <property name="textFgColor" value="blue" />
        <property name="text" value="condition for 'create root' rule" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167087675407">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167087675408">
        <property name="text" value="returns: boolean" />
        <property name="fontStyle" value="PLAIN" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167087675409">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167087675410">
        <property name="text" value="parameters:" />
        <property name="fontStyle" value="PLAIN" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167087675411">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="true" />
        <property name="selectable" value="false" />
        <property name="gridLayout" value="true" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167087675412">
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167087675413">
            <property name="text" value="sourceModel" />
            <property name="drawBorder" value="false" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167087675414">
            <property name="text" value="source model" />
            <property name="fontStyle" value="PLAIN" />
            <property name="drawBorder" value="false" />
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167087762052">
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167087762053">
            <property name="text" value="generator" />
            <property name="drawBorder" value="false" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167087762054">
            <property name="text" value="generator object (jetbrains.mps.generator.template.ITemplateGenerator)" />
            <property name="fontStyle" value="PLAIN" />
            <property name="drawBorder" value="false" />
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167087675415">
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167087675416">
            <property name="text" value="scope" />
            <property name="drawBorder" value="false" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167087675417">
            <property name="text" value="context (jetbrains.mps.smodel.IScope)" />
            <property name="fontStyle" value="PLAIN" />
            <property name="drawBorder" value="false" />
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167087675418">
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167087675419">
            <property name="text" value="operationContext" />
            <property name="drawBorder" value="false" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167087675420">
            <property name="text" value="context (jetbrains.mps.smodel.IOperationContext)" />
            <property name="fontStyle" value="PLAIN" />
            <property name="drawBorder" value="false" />
          </node>
        </node>
      </node>
    </node>
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167087837671">
      <property name="drawBorder" value="false" />
      <property name="drawBrackets" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167087837672">
        <property name="textFgColor" value="blue" />
        <property name="text" value="&gt;" />
        <property name="attractsFocus" value="0" />
        <property name="fontStyle" value="BOLD" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1167087837673">
        <property name="drawBorder" value="false" />
        <property name="drawBrackets" value="true" />
        <link role="relationDeclaration" targetNodeId="18.1137022507850" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1167088003562">
    <link role="conceptDeclaration" targetNodeId="1.1167087469898" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167088005388">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167088005389">
        <property name="text" value="condition" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1167088028162">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;always&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1167087469900" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167088005391">
        <property name="text" value="--&gt;" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167518654057">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1167518654058">
          <property name="allowEmptyText" value="true" />
          <property name="textBgColor" value="orange" />
          <property name="drawBorder" value="false" />
          <property name="noTargetText" value="&lt;no mapping name&gt;" />
          <property name="textBgColorSelected" value="cyan" />
          <link role="relationDeclaration" targetNodeId="4.1078489098626" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167518654059">
          <property name="text" value=":" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="true" />
        </node>
        <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1167518654060">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1167518654061">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1167518654062">
              <node role="expression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1167518654063">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1167518654064" />
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1167518654065">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.NodeCondition_FunctionParm_node" id="1167518654066" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1167518654067">
                    <link role="property" targetNodeId="4.1078489098626" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1167088005394">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;no template&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1095417265990" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1167088005395">
          <link role="conceptDeclaration" targetNodeId="4.1078489098625" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1167088005396">
            <property name="drawBorder" value="false" />
            <property name="readOnly" value="true" />
            <property name="noTargetText" value="&lt;no name&gt;" />
            <link role="relationDeclaration" targetNodeId="4.1078489098626" />
          </node>
        </node>
      </node>
    </node>
    <node role="inspectedCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167518681155">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="true" />
      <property name="selectable" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167518681156">
        <property name="textFgColor" value="DARK_BLUE" />
        <property name="textBgColor" value="lightGray" />
        <property name="text" value="conditional root rule" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167518681157">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167518681158">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167518681159">
          <property name="text" value="mapping name" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1167518681160">
          <property name="allowEmptyText" value="true" />
          <property name="textBgColor" value="orange" />
          <property name="drawBorder" value="false" />
          <property name="noTargetText" value="&lt;none&gt;" />
          <link role="relationDeclaration" targetNodeId="4.1078489098626" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1167169732004">
    <link role="conceptDeclaration" targetNodeId="1.1167168920554" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167169733593">
      <property name="drawBorder" value="false" />
      <property name="drawBrackets" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167169733594">
        <property name="textFgColor" value="blue" />
        <property name="text" value="&gt;" />
        <property name="attractsFocus" value="0" />
        <property name="fontStyle" value="BOLD" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1167169733595">
        <property name="drawBorder" value="false" />
        <property name="drawBrackets" value="true" />
        <link role="relationDeclaration" targetNodeId="18.1137022507850" />
      </node>
    </node>
    <node role="inspectedCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167169742235">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="true" />
      <property name="selectable" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167169742236">
        <property name="textBgColor" value="lightGray" />
        <property name="textFgColor" value="blue" />
        <property name="text" value="rule condition" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167169742237">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167169742238">
        <property name="text" value="returns: boolean" />
        <property name="fontStyle" value="PLAIN" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167169742239">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167169742240">
        <property name="text" value="parameters:" />
        <property name="fontStyle" value="PLAIN" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167169742241">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="true" />
        <property name="selectable" value="false" />
        <property name="gridLayout" value="true" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167169763869">
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167169763870">
            <property name="text" value="node" />
            <property name="drawBorder" value="false" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167169763871">
            <property name="text" value="node from source model" />
            <property name="fontStyle" value="PLAIN" />
            <property name="drawBorder" value="false" />
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167169742242">
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167169742243">
            <property name="text" value="sourceModel" />
            <property name="drawBorder" value="false" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167169742244">
            <property name="text" value="source model" />
            <property name="fontStyle" value="PLAIN" />
            <property name="drawBorder" value="false" />
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167169742245">
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167169742246">
            <property name="text" value="generator" />
            <property name="drawBorder" value="false" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167169742247">
            <property name="text" value="generator object (jetbrains.mps.generator.template.ITemplateGenerator)" />
            <property name="fontStyle" value="PLAIN" />
            <property name="drawBorder" value="false" />
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167169742248">
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167169742249">
            <property name="text" value="scope" />
            <property name="drawBorder" value="false" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167169742250">
            <property name="text" value="context (jetbrains.mps.smodel.IScope)" />
            <property name="fontStyle" value="PLAIN" />
            <property name="drawBorder" value="false" />
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167169742251">
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167169742252">
            <property name="text" value="operationContext" />
            <property name="drawBorder" value="false" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167169742253">
            <property name="text" value="context (jetbrains.mps.smodel.IOperationContext)" />
            <property name="fontStyle" value="PLAIN" />
            <property name="drawBorder" value="false" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1167171627113">
    <link role="conceptDeclaration" targetNodeId="1.1167171569011" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167171628753">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167257103456">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="true" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1167328218997">
          <property name="drawBorder" value="false" />
          <link role="editorComponent" targetNodeId="1167328078404" resolveInfo="BaseMappingRule_premise" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167257108578">
          <property name="editable" value="true" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167171628765">
        <property name="text" value="--&gt;" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167517936907">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1167517936908">
          <property name="allowEmptyText" value="true" />
          <property name="textBgColor" value="orange" />
          <property name="drawBorder" value="false" />
          <property name="noTargetText" value="&lt;no mapping name&gt;" />
          <property name="textBgColorSelected" value="cyan" />
          <link role="relationDeclaration" targetNodeId="4.1078489098626" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167517936909">
          <property name="text" value=":" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="true" />
        </node>
        <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1167517936910">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1167517936911">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1167517936912">
              <node role="expression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1167517936913">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1167517936914" />
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1167517936915">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.NodeCondition_FunctionParm_node" id="1167517936916" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1167517936917">
                    <link role="property" targetNodeId="4.1078489098626" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167171628766">
        <property name="drawBorder" value="false" />
        <property name="bracketsColor" value="gray" />
        <property name="vertical" value="true" />
        <property name="selectable" value="false" />
        <property name="gridLayout" value="true" />
        <property name="drawBrackets" value="true" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1167171628767">
          <property name="drawBorder" value="false" />
          <property name="noTargetText" value="&lt;no template&gt;" />
          <link role="relationDeclaration" targetNodeId="1.1095418098242" />
          <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1167171628768">
            <link role="conceptDeclaration" targetNodeId="1.1092059087312" />
            <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1167171628769">
              <property name="drawBorder" value="false" />
              <property name="readOnly" value="true" />
              <property name="noTargetText" value="&lt;no name&gt;" />
              <link role="relationDeclaration" targetNodeId="4.1078489098626" />
            </node>
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167171628770">
          <property name="drawBorder" value="false" />
          <property name="vertical" value="false" />
          <property name="selectable" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167171628771">
            <property name="text" value="context:" />
            <property name="drawBorder" value="false" />
            <property name="selectable" value="true" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Custom" id="1167171628772">
            <property name="drawBorder" value="false" />
            <property name="cellProviderId" value="templateWeavingRule_Context_CellProvider" />
          </node>
        </node>
      </node>
    </node>
    <node role="inspectedCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167517960207">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="true" />
      <property name="selectable" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167517960208">
        <property name="textFgColor" value="DARK_BLUE" />
        <property name="textBgColor" value="lightGray" />
        <property name="text" value="weaving rule" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167517960209">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167517960210">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167517960211">
          <property name="text" value="mapping name" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1167517960212">
          <property name="allowEmptyText" value="true" />
          <property name="textBgColor" value="orange" />
          <property name="drawBorder" value="false" />
          <property name="noTargetText" value="&lt;none&gt;" />
          <link role="relationDeclaration" targetNodeId="4.1078489098626" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.EditorComponentDeclaration" id="1167328078404">
    <property name="name" value="BaseMappingRule_premise" />
    <link role="conceptDeclaration" targetNodeId="1.1167169308231" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167328170273">
      <property name="drawBorder" value="false" />
      <property name="bracketsColor" value="gray" />
      <property name="vertical" value="true" />
      <property name="drawBrackets" value="true" />
      <property name="selectable" value="false" />
      <property name="gridLayout" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167328170274">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167328170275">
          <property name="text" value="concept" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167328170276">
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1167328170277">
            <property name="attractsFocus" value="2" />
            <property name="drawBorder" value="false" />
            <property name="noTargetText" value="&lt;any node&gt;" />
            <link role="relationDeclaration" targetNodeId="1.1167169349424" />
            <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1167328170278">
              <link role="conceptDeclaration" targetNodeId="6.1071489090640" />
              <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1167328170279">
                <property name="textFgColor" value="DARK_MAGENTA" />
                <property name="attractsFocus" value="0" />
                <property name="readOnly" value="true" />
                <link role="relationDeclaration" targetNodeId="4.1078489098626" />
              </node>
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167328170280">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167328170281">
              <property name="text" value="inheritors:" />
              <property name="drawBorder" value="false" />
              <property name="selectable" value="false" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1167328170282">
              <property name="drawBorder" value="false" />
              <link role="relationDeclaration" targetNodeId="1.1167272244852" />
            </node>
            <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1167328170283">
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1167328170284">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1167328170285">
                  <node role="expression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1167328170286">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1167328170287" />
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1167328170288">
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.NodeCondition_FunctionParm_node" id="1167328170289" />
                      <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1167328170290">
                        <link role="link" targetNodeId="1.1167169349424" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167328170291">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167328170292">
          <property name="text" value="condition" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1167328170293">
          <property name="drawBorder" value="false" />
          <property name="noTargetText" value="&lt;always&gt;" />
          <link role="relationDeclaration" targetNodeId="1.1167169362365" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1167328252970">
    <link role="conceptDeclaration" targetNodeId="1.1167327847730" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167328265442">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167328265443">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="true" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1167328265444">
          <property name="drawBorder" value="false" />
          <link role="editorComponent" targetNodeId="1167328078404" resolveInfo="BaseMappingRule_premise" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167328265445">
          <property name="editable" value="true" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167328265446">
        <property name="text" value="--&gt;" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167518254692">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1167518254693">
          <property name="allowEmptyText" value="true" />
          <property name="textBgColor" value="orange" />
          <property name="drawBorder" value="false" />
          <property name="noTargetText" value="&lt;no mapping name&gt;" />
          <property name="textBgColorSelected" value="cyan" />
          <link role="relationDeclaration" targetNodeId="4.1078489098626" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167518254694">
          <property name="text" value=":" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="true" />
        </node>
        <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1167518254695">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1167518254696">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1167518254697">
              <node role="expression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1167518254698">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1167518254699" />
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1167518254700">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.NodeCondition_FunctionParm_node" id="1167518254701" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1167518254702">
                    <link role="property" targetNodeId="4.1078489098626" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1167328293894">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;no template&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1167327847732" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1167328293895">
          <link role="conceptDeclaration" targetNodeId="1.1092059087312" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1167328293896">
            <property name="drawBorder" value="false" />
            <property name="readOnly" value="true" />
            <property name="noTargetText" value="&lt;no name&gt;" />
            <link role="relationDeclaration" targetNodeId="4.1078489098626" />
          </node>
        </node>
      </node>
    </node>
    <node role="inspectedCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167518270805">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="true" />
      <property name="selectable" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167518270806">
        <property name="textFgColor" value="DARK_BLUE" />
        <property name="textBgColor" value="lightGray" />
        <property name="text" value="reduction rule" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167518270807">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167518270808">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167518270809">
          <property name="text" value="mapping name" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1167518270810">
          <property name="allowEmptyText" value="true" />
          <property name="textBgColor" value="orange" />
          <property name="drawBorder" value="false" />
          <property name="noTargetText" value="&lt;none&gt;" />
          <link role="relationDeclaration" targetNodeId="4.1078489098626" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1167514442227">
    <link role="conceptDeclaration" targetNodeId="1.1167514355419" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167514444706">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167514444707">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="true" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1167514444708">
          <property name="drawBorder" value="false" />
          <link role="editorComponent" targetNodeId="1167328078404" resolveInfo="BaseMappingRule_premise" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167514444709">
          <property name="editable" value="true" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167514444710">
        <property name="text" value="--&gt;" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167516991645">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1167516991646">
          <property name="allowEmptyText" value="true" />
          <property name="textBgColor" value="orange" />
          <property name="drawBorder" value="false" />
          <property name="noTargetText" value="&lt;no mapping name&gt;" />
          <property name="textBgColorSelected" value="cyan" />
          <link role="relationDeclaration" targetNodeId="4.1078489098626" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167517002540">
          <property name="text" value=":" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="true" />
        </node>
        <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1167517031025">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1167517031026">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1167517052856">
              <node role="expression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1167517072579">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1167517075864" />
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1167517067499">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.NodeCondition_FunctionParm_node" id="1167517064342" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1167517069032">
                    <link role="property" targetNodeId="4.1078489098626" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1167514444711">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;no template&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1167514355421" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1167514444712">
          <link role="conceptDeclaration" targetNodeId="4.1078489098625" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1167514444713">
            <property name="drawBorder" value="false" />
            <property name="readOnly" value="true" />
            <property name="noTargetText" value="&lt;no name&gt;" />
            <link role="relationDeclaration" targetNodeId="4.1078489098626" />
          </node>
        </node>
      </node>
    </node>
    <node role="inspectedCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167516839695">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="true" />
      <property name="selectable" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167516845603">
        <property name="textFgColor" value="DARK_BLUE" />
        <property name="textBgColor" value="lightGray" />
        <property name="text" value="root mapping rule" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167516860073">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167516898389">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167516900797">
          <property name="text" value="mapping name" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1167516913752">
          <property name="allowEmptyText" value="true" />
          <property name="textBgColor" value="orange" />
          <property name="drawBorder" value="false" />
          <property name="noTargetText" value="&lt;none&gt;" />
          <link role="relationDeclaration" targetNodeId="4.1078489098626" />
        </node>
      </node>
    </node>
  </node>
</model>

