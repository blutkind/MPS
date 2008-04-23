<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.bootstrap.structureLanguage.editor">
  <persistence version="1" />
  <refactoringHistory />
  <language namespace="jetbrains.mps.bootstrap.editorLanguage" />
  <language namespace="jetbrains.mps.baseLanguage">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.structure" version="0" />
  </language>
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage">
    <languageAspect modelUID="jetbrains.mps.bootstrap.smodelLanguage.structure" version="0" />
  </language>
  <language namespace="jetbrains.mps.bootstrap.sharedConcepts" />
  <language namespace="jetbrains.mps.baseLanguage.ext.collections.lang">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.structure" version="1" />
  </language>
  <languageAspect modelUID="jetbrains.mps.bootstrap.constraintsLanguage.structure" version="1" />
  <languageAspect modelUID="jetbrains.mps.closures.structure" version="0" />
  <languageAspect modelUID="jetbrains.mps.closures.structure" version="0" />
  <maxImportIndex value="30" />
  <import index="1" modelUID="jetbrains.mps.bootstrap.structureLanguage.structure" version="-1" />
  <import index="2" modelUID="jetbrains.mps.core.structure" version="-1" />
  <import index="4" modelUID="jetbrains.mps.nodeEditor@java_stub" version="-1" />
  <import index="5" modelUID="jetbrains.mps.smodel@java_stub" version="-1" />
  <import index="6" modelUID="java.lang@java_stub" version="-1" />
  <import index="13" modelUID="jetbrains.mps.project@java_stub" version="-1" />
  <import index="14" modelUID="jetbrains.mps.util@java_stub" version="-1" />
  <import index="16" modelUID="java.io@java_stub" version="-1" />
  <import index="28" modelUID="jetbrains.mps.bootstrap.structureLanguage.editor@java_stub" version="-1" />
  <import index="29" modelUID="jetbrains.mps.bootstrap.structureLanguage.structure@java_stub" version="-1" />
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1082979388796">
    <property name="name" value="ConstrainedDataTypeDeclaration_Editor" />
    <link role="conceptDeclaration" targetNodeId="1.1082978499127" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1082979388797">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="true" />
      <property name="name" value="nodeBox" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1082979388814">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <property name="selectable" value="false" />
        <property name="name" value="headerRow" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1082979388815">
          <property name="drawBorder" value="false" />
          <property name="text" value="constrained string datatype:" />
          <property name="selectable" value="true" />
          <property name="editable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1082979388816">
          <property name="drawBorder" value="false" />
          <property name="noTargetText" value="&lt;no name&gt;" />
          <link role="relationDeclaration" targetNodeId="2.1169194664001" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1083066231719">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <property name="name" value="separator" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1083066231720">
        <property name="selectable" value="false" />
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1083066231721">
          <property name="drawBorder" value="false" />
          <property name="text" value="    matching regexp:" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1083066231722">
          <property name="drawBorder" value="false" />
          <property name="noTargetText" value="&lt;no value&gt;" />
          <property name="textFgColor" value="DARK_BLUE" />
          <link role="relationDeclaration" targetNodeId="1.1083066089218" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1082985570612">
    <property name="name" value="PropertyDeclaration_Editor" />
    <link role="conceptDeclaration" targetNodeId="1.1071489288299" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1082985570613">
      <property name="vertical" value="false" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1082985570614">
        <property name="drawBorder" value="false" />
        <property name="fontStyle" value="BOLD" />
        <property name="noTargetText" value="&lt;no name&gt;" />
        <property name="textFgColor" value="DARK_MAGENTA" />
        <link role="relationDeclaration" targetNodeId="2.1169194664001" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1082987076546">
        <property name="selectable" value="false" />
        <property name="drawBorder" value="false" />
        <property name="text" value=":" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell" id="1106002077142">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;no data type&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1082985295845" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.structure.InlineEditorComponent" id="1106001907860">
          <link role="conceptDeclaration" targetNodeId="1.1082978164218" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1106002077143">
            <property name="drawBorder" value="false" />
            <property name="noTargetText" value="&lt;no name&gt;" />
            <property name="readOnly" value="true" />
            <link role="relationDeclaration" targetNodeId="2.1169194664001" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1083172239067">
    <property name="name" value="EnumerationMemberDeclaration_Editor" />
    <link role="conceptDeclaration" targetNodeId="1.1083171877298" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1083925414250">
      <property name="vertical" value="false" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1197591774607">
        <property name="selectable" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1197591784562">
          <property name="drawBorder" value="false" />
          <property name="fontStyle" value="ITALIC" />
          <property name="selectable" value="false" />
          <property name="textFgColor" value="darkGray" />
          <property name="text" value="identifier" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1197591806188">
          <property name="drawBorder" value="false" />
          <property name="noTargetText" value="&lt;no identifier&gt;" />
          <property name="textBgColorSelected" value="cyan" />
          <property name="textFgColor" value="DARK_MAGENTA" />
          <property name="fontStyle" value="BOLD_ITALIC" />
          <link role="relationDeclaration" targetNodeId="1.1192116978809" resolveInfo="javaIdentifier" />
        </node>
        <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1197591831892">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197591831893">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1197591883385">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203721648102">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203721648591">
                  <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1197591888969">
                    <link role="concept" targetNodeId="1.1082978164219" resolveInfo="EnumerationDataTypeDeclaration" />
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203721648206">
                      <node role="operand" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1197591883386" />
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1197591886468" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1197591920349">
                    <link role="property" targetNodeId="1.1197591154882" resolveInfo="memberIdentifierPolicy" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_HasValue_Enum" id="1197591927572">
                  <node role="value" type="jetbrains.mps.bootstrap.smodelLanguage.structure.EnumMemberReference" id="1197591927573">
                    <link role="enumMember" targetNodeId="1.1197591075491" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1162585934258">
        <property name="drawBorder" value="false" />
        <property name="fontStyle" value="ITALIC" />
        <property name="selectable" value="false" />
        <property name="textFgColor" value="darkGray" />
        <property name="text" value="  value" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1083925414256">
        <property name="allowEmptyText" value="true" />
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;NULL&gt;" />
        <property name="textBgColorSelected" value="cyan" />
        <property name="textFgColor" value="blue" />
        <link role="relationDeclaration" targetNodeId="1.1083923523171" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1162585954651">
        <property name="drawBorder" value="false" />
        <property name="text" value="  presentation" />
        <property name="fontStyle" value="ITALIC" />
        <property name="selectable" value="false" />
        <property name="textFgColor" value="darkGray" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1083925414254">
        <property name="drawBorder" value="false" />
        <property name="fontStyle" value="BOLD" />
        <property name="noTargetText" value="&lt;no external value&gt;" />
        <property name="textFgColor" value="DARK_MAGENTA" />
        <link role="relationDeclaration" targetNodeId="1.1083923523172" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1083925414258">
        <property name="drawBorder" value="false" />
        <property name="fontStyle" value="PLAIN" />
        <property name="text" value="    (default)" />
        <property name="selectable" value="false" />
        <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1162585619940">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1162585619941">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1162585663699">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1162585663700">
                <property name="name" value="defMember" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1162585663702">
                  <link role="concept" targetNodeId="1.1083171877298" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203721647887">
                  <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1162585635431">
                    <link role="concept" targetNodeId="1.1082978164219" />
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203721648264">
                      <node role="operand" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1162585627975" />
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1162585633289" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1162585648698">
                    <link role="link" targetNodeId="1.1083241965437" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1162585672689">
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1162585681208">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1162585683258" />
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1162585675895">
                  <link role="variableDeclaration" targetNodeId="1162585663700" resolveInfo="defMember" />
                </node>
              </node>
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1162585672691">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1162585693072">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1162585704046">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1162585707845" />
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203721647931">
                      <node role="operand" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1162585696496" />
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetPrevSiblingOperation" id="1162585701591" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1162585711941">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1162585716319">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1162585719541">
                  <link role="variableDeclaration" targetNodeId="1162585663700" resolveInfo="defMember" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1162585714990" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1083172476027">
    <property name="name" value="EnumerationDataTypeDeclaration_Editor" />
    <link role="conceptDeclaration" targetNodeId="1.1082978164219" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1083172476028">
      <property name="vertical" value="true" />
      <property name="name" value="nodeBox" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1083172476029">
        <property name="vertical" value="false" />
        <property name="selectable" value="false" />
        <property name="name" value="headerRow" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1083172476030">
          <property name="selectable" value="true" />
          <property name="drawBorder" value="false" />
          <property name="text" value="enumeration datatype:" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1083172476031">
          <property name="drawBorder" value="false" />
          <property name="noTargetText" value="&lt;no name&gt;" />
          <property name="textBgColorSelected" value="cyan" />
          <property name="textBgColor" value="yellow" />
          <link role="relationDeclaration" targetNodeId="2.1169194664001" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1162581284214">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1162581300246">
          <property name="drawBorder" value="false" />
          <property name="text" value="    " />
          <property name="selectable" value="false" />
          <property name="name" value="indent" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1162581349089">
          <property name="selectable" value="false" />
          <property name="drawBorder" value="false" />
          <property name="vertical" value="true" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1162581349090">
            <property name="vertical" value="true" />
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <property name="gridLayout" value="true" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1162581349091">
              <property name="selectable" value="false" />
              <property name="drawBorder" value="false" />
              <property name="vertical" value="false" />
              <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1162581349092">
                <property name="selectable" value="false" />
                <property name="drawBorder" value="false" />
                <property name="text" value="member type" />
              </node>
              <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1162581845504">
                <property name="drawBorder" value="false" />
                <property name="text" value=":" />
                <property name="selectable" value="false" />
                <property name="name" value="indent" />
              </node>
              <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell" id="1162581349093">
                <property name="drawBorder" value="false" />
                <property name="noTargetText" value="&lt;no type&gt;" />
                <link role="relationDeclaration" targetNodeId="1.1083171729157" />
                <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.structure.InlineEditorComponent" id="1162581349094">
                  <link role="conceptDeclaration" targetNodeId="1.1083243159079" />
                  <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1162581349095">
                    <property name="drawBorder" value="false" />
                    <property name="readOnly" value="true" />
                    <link role="relationDeclaration" targetNodeId="2.1169194664001" />
                  </node>
                </node>
              </node>
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1162581349096">
              <property name="selectable" value="false" />
              <property name="drawBorder" value="false" />
              <property name="vertical" value="false" />
              <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1162581349097">
                <property name="selectable" value="false" />
                <property name="drawBorder" value="false" />
                <property name="text" value="default" />
              </node>
              <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1162581855288">
                <property name="drawBorder" value="false" />
                <property name="text" value=":" />
                <property name="selectable" value="false" />
                <property name="name" value="indent" />
              </node>
              <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell" id="1162581349098">
                <property name="drawBorder" value="false" />
                <property name="noTargetText" value="&lt;1-st member&gt;" />
                <link role="relationDeclaration" targetNodeId="1.1083241965437" />
                <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.structure.InlineEditorComponent" id="1162581349099">
                  <link role="conceptDeclaration" targetNodeId="1.1083171877298" />
                  <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1162581349100">
                    <property name="drawBorder" value="false" />
                    <property name="noTargetText" value="&lt;no external value&gt;" />
                    <property name="fontStyle" value="BOLD" />
                    <property name="readOnly" value="true" />
                    <property name="textFgColor" value="DARK_MAGENTA" />
                    <link role="relationDeclaration" targetNodeId="1.1083923523172" />
                  </node>
                </node>
              </node>
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1197591210899">
              <property name="selectable" value="false" />
              <property name="drawBorder" value="false" />
              <property name="vertical" value="false" />
              <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1197591210900">
                <property name="selectable" value="false" />
                <property name="drawBorder" value="false" />
                <property name="text" value="member identifier" />
              </node>
              <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1197591210901">
                <property name="drawBorder" value="false" />
                <property name="text" value=":" />
                <property name="selectable" value="false" />
                <property name="name" value="indent" />
              </node>
              <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1197591280167">
                <property name="fontStyle" value="BOLD" />
                <property name="textFgColor" value="DARK_MAGENTA" />
                <link role="relationDeclaration" targetNodeId="1.1197591154882" resolveInfo="memberIdentifierPolicy" />
              </node>
              <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1197593552141">
                <property name="text" value="(not recommended)" />
                <property name="textFgColor" value="red" />
                <property name="fontStyle" value="PLAIN" />
                <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1197593498320">
                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1197593498321">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1197593564049">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203721648413">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203721648078">
                          <node role="operand" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1197593564050" />
                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1197593570538">
                            <link role="property" targetNodeId="1.1197591154882" resolveInfo="memberIdentifierPolicy" />
                          </node>
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_HasValue_Enum" id="1197593576526">
                          <node role="value" type="jetbrains.mps.bootstrap.smodelLanguage.structure.EnumMemberReference" id="1197593576527">
                            <link role="enumMember" targetNodeId="1.1197590884614" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1162582323023">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <property name="name" value="indent" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1162582337073">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <property name="name" value="indent" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNodeList" id="1162581824142">
            <property name="vertical" value="true" />
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <property name="gridLayout" value="true" />
            <link role="relationDeclaration" targetNodeId="1.1083172003582" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1083244251718">
    <property name="name" value="PrimitiveDataTypeDeclaration_Editor" />
    <link role="conceptDeclaration" targetNodeId="1.1083243159079" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1083244251719">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="true" />
      <property name="name" value="nodeBox" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1083244251720">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <property name="selectable" value="false" />
        <property name="name" value="headerRow" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1083244251721">
          <property name="drawBorder" value="false" />
          <property name="text" value="primitive datatype:" />
          <property name="selectable" value="true" />
          <property name="editable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1083244251722">
          <property name="drawBorder" value="false" />
          <property name="noTargetText" value="&lt;no name&gt;" />
          <property name="textBgColorSelected" value="cyan" />
          <property name="textBgColor" value="yellow" />
          <link role="relationDeclaration" targetNodeId="2.1169194664001" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1084189569969">
    <property name="name" value="LinkDeclaration_Editor" />
    <link role="conceptDeclaration" targetNodeId="1.1071489288298" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1084189569970">
      <property name="vertical" value="false" />
      <property name="drawBorder" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell" id="1197832374770">
        <property name="drawBorder" value="true" />
        <property name="noTargetText" value="&lt;no target&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1071599976176" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.structure.InlineEditorComponent" id="1197832374771">
          <link role="conceptDeclaration" targetNodeId="1.1169125787135" resolveInfo="AbstractConceptDeclaration" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1197832374772">
            <property name="drawBorder" value="false" />
            <property name="noTargetText" value="&lt;no name&gt;" />
            <property name="readOnly" value="true" />
            <property name="textFgColor" value="DARK_MAGENTA" />
            <link role="relationDeclaration" targetNodeId="2.1169194664001" resolveInfo="name" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1084189569972">
        <property name="drawBorder" value="true" />
        <property name="noTargetText" value="&lt;no role&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1071599776563" />
        <node role="menuDescriptor" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuDescriptor" id="1186997087930">
          <node role="cellMenuPart" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_PropertyPostfixHints" id="1186997093971">
            <node role="postfixesFunction" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_PropertyPostfixHints_GetPostfixes" id="1186997093972">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1186997093973">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1186997157547">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1186997157548">
                    <property name="name" value="postfixes" />
                    <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1186997157549">
                      <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1186997159888">
                        <link role="classifier" targetNodeId="6.~String" resolveInfo="String" />
                      </node>
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1186997170881">
                      <node role="creator" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListCreatorWithInit" id="1186997172064">
                        <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1186997174528">
                          <link role="classifier" targetNodeId="6.~String" resolveInfo="String" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1186997182375">
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1186997182376">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1186997464771">
                      <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1186997464772">
                        <property name="name" value="name" />
                        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1186997464773">
                          <link role="classifier" targetNodeId="6.~String" resolveInfo="String" />
                        </node>
                        <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1186997476272">
                          <link role="baseMethodDeclaration" targetNodeId="14.~NameUtil.decapitalize(java.lang.String):java.lang.String" resolveInfo="decapitalize" />
                          <link role="classConcept" targetNodeId="14.~NameUtil" resolveInfo="NameUtil" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203721648492">
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203721648514">
                              <node role="operand" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_Abstract_editedNode" id="1186997477473" />
                              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1186997477472">
                                <link role="link" targetNodeId="1.1071599976176" />
                              </node>
                            </node>
                            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1186997477470">
                              <link role="property" targetNodeId="2.1169194664001" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1186997249027">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206576384190">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1186997249028">
                          <link role="variableDeclaration" targetNodeId="1186997157548" resolveInfo="postfixes" />
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddAllElementsOperation" id="1186997251568">
                          <node role="argument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1186997255466">
                            <link role="classConcept" targetNodeId="14.~NameUtil" resolveInfo="NameUtil" />
                            <link role="baseMethodDeclaration" targetNodeId="14.~NameUtil.splitByCamels(java.lang.String):java.util.List" resolveInfo="splitByCamels" />
                            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1186997464774">
                              <link role="variableDeclaration" targetNodeId="1186997464772" resolveInfo="name" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203721648634">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203721648441">
                      <node role="operand" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_Abstract_editedNode" id="1186997183851" />
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1186997194351">
                        <link role="link" targetNodeId="1.1071599976176" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNotNullOperation" id="1186997197227" />
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1186997179415">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1186997179417">
                    <link role="variableDeclaration" targetNodeId="1186997157548" resolveInfo="postfixes" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1084205682782">
        <property name="drawBorder" value="true" />
        <link role="relationDeclaration" targetNodeId="1.1071599893252" />
        <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1146605728892">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1146605728893">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1146605730972">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1146605739321">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1146605743324" />
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203721648232">
                  <node role="operand" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1146605733068" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1146605736382">
                    <link role="link" targetNodeId="1.1071599698500" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="menuDescriptor" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuDescriptor" id="1185271029574">
          <node role="cellMenuPart" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_PropertyValues" id="1185271033481">
            <node role="valuesFunction" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_PropertyValues_GetValues" id="1185271033482">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1185271033483">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1185271154474">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1185271154475">
                    <property name="name" value="result" />
                    <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1185271154476">
                      <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1185271156728">
                        <link role="classifier" targetNodeId="6.~String" resolveInfo="String" />
                      </node>
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1185271161745">
                      <node role="creator" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListCreatorWithInit" id="1185271163966">
                        <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1185271166327">
                          <link role="classifier" targetNodeId="6.~String" resolveInfo="String" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1185271168704">
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1185271168705">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1185271239813">
                      <node role="iterable" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1185271257648">
                        <link role="baseMethodDeclaration" targetNodeId="29.~Cardinality.getConstants():java.util.List" resolveInfo="getConstants" />
                        <link role="classConcept" targetNodeId="29.~Cardinality" resolveInfo="Cardinality" />
                      </node>
                      <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1185271239815">
                        <property name="name" value="c" />
                        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1185271250208">
                          <link role="classifier" targetNodeId="29.~Cardinality" resolveInfo="Cardinality" />
                        </node>
                      </node>
                      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1185271239817">
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1185271259368">
                          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206576384192">
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1185271259369">
                              <link role="variableDeclaration" targetNodeId="1185271154475" resolveInfo="result" />
                            </node>
                            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddElementOperation" id="1185271261121">
                              <node role="argument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204740201576">
                                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1185271263154">
                                  <link role="variableDeclaration" targetNodeId="1185271239815" resolveInfo="c" />
                                </node>
                                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204740201577">
                                  <link role="baseMethodDeclaration" targetNodeId="29.~Cardinality.getValueAsString():java.lang.String" resolveInfo="getValueAsString" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203721648333">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203721647905">
                      <node role="operand" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_Abstract_editedNode" id="1185271172177" />
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1185271178322">
                        <link role="property" targetNodeId="1.1071599937831" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_HasValue_Enum" id="1185271181529">
                      <node role="value" type="jetbrains.mps.bootstrap.smodelLanguage.structure.EnumMemberReference" id="1185271181530">
                        <link role="enumMember" targetNodeId="1.1084199179705" />
                      </node>
                    </node>
                  </node>
                  <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1185271224138">
                    <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1185271224139">
                      <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1185271271424">
                        <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206576384194">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1185271271425">
                            <link role="variableDeclaration" targetNodeId="1185271154475" resolveInfo="result" />
                          </node>
                          <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddElementOperation" id="1185271273286">
                            <node role="argument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204740202168">
                              <node role="operand" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference" id="1188230297816">
                                <link role="enumClass" targetNodeId="29.~Cardinality" resolveInfo="Cardinality" />
                                <link role="enumConstantDeclaration" targetNodeId="29.~Cardinality._0__1" resolveInfo="_0__1" />
                              </node>
                              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204740202169">
                                <link role="baseMethodDeclaration" targetNodeId="29.~Cardinality.getValueAsString():java.lang.String" resolveInfo="getValueAsString" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1185271283324">
                        <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206576384295">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1185271283325">
                            <link role="variableDeclaration" targetNodeId="1185271154475" resolveInfo="result" />
                          </node>
                          <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddElementOperation" id="1185271284843">
                            <node role="argument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204740202145">
                              <node role="operand" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference" id="1188230300583">
                                <link role="enumConstantDeclaration" targetNodeId="29.~Cardinality._1" resolveInfo="_1" />
                                <link role="enumClass" targetNodeId="29.~Cardinality" resolveInfo="Cardinality" />
                              </node>
                              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204740202146">
                                <link role="baseMethodDeclaration" targetNodeId="29.~Cardinality.getValueAsString():java.lang.String" resolveInfo="getValueAsString" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1185271295867">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1185271297463">
                    <link role="variableDeclaration" targetNodeId="1185271154475" resolveInfo="result" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_ModelAccess" id="1084205682785">
        <property name="textBgColor" value="lightGray" />
        <property name="drawBorder" value="true" />
        <property name="editable" value="false" />
        <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1146606011485">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1146606011486">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1146606013315">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1146606029617">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1146606034885" />
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203721648589">
                  <node role="operand" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1146606020207" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1146606027069">
                    <link role="link" targetNodeId="1.1071599698500" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="modelAcessor" type="jetbrains.mps.bootstrap.editorLanguage.structure.ModelAccessor" id="1176725059208">
          <node role="getter" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_ModelAccess_Getter" id="1176725059209">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1176725059210">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1176725072209">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1176725072210">
                  <property name="name" value="cardinality" />
                  <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1176725072211">
                    <link role="classifier" targetNodeId="29.~Cardinality" resolveInfo="Cardinality" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1176725086308">
                    <link role="baseMethodDeclaration" targetNodeId="5.~SModelUtil_new.getGenuineLinkSourceCardinality(jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration):jetbrains.mps.bootstrap.structureLanguage.structure.Cardinality" resolveInfo="getGenuineLinkSourceCardinality" />
                    <link role="classConcept" targetNodeId="5.~SModelUtil_new" resolveInfo="SModelUtil_new" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204668805196">
                      <node role="operand" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1176725088262" />
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAdapterOperation" id="1176725090717" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1176725098329">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204740202580">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1176725099753">
                    <link role="variableDeclaration" targetNodeId="1176725072210" resolveInfo="cardinality" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204740202581">
                    <link role="baseMethodDeclaration" targetNodeId="29.~Cardinality.getName():java.lang.String" resolveInfo="getName" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="setter" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_ModelAccess_Setter" id="1176725059211">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1176725059212" />
          </node>
          <node role="validator" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_ModelAccess_Validator" id="1176725059213">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1176725059214">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1176725109038">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1176725110775">
                  <property name="value" value="true" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1164661317301">
        <property name="drawBorder" value="true" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1164661317302">
          <property name="selectable" value="false" />
          <property name="drawBorder" value="true" />
          <property name="text" value="specializes:" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell" id="1164661343825">
          <property name="drawBorder" value="true" />
          <property name="noTargetText" value="&lt;none&gt;" />
          <link role="relationDeclaration" targetNodeId="1.1071599698500" />
          <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.structure.InlineEditorComponent" id="1164661343826">
            <link role="conceptDeclaration" targetNodeId="1.1071489288298" />
            <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1164661343827">
              <property name="drawBorder" value="false" />
              <property name="readOnly" value="true" />
              <link role="relationDeclaration" targetNodeId="1.1071599776563" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1087215312703">
    <property name="name" value="ConceptDeclaration_Editor" />
    <link role="conceptDeclaration" targetNodeId="1.1071489090640" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1087215312704">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="true" />
      <property name="name" value="nodeBox" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1087215312705">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <property name="selectable" value="false" />
        <property name="name" value="headerRow" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1087215312706">
          <property name="drawBorder" value="false" />
          <property name="text" value="concept declaration" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1087215312707">
          <property name="drawBorder" value="false" />
          <property name="noTargetText" value="&lt;no name&gt;" />
          <link role="relationDeclaration" targetNodeId="2.1169194664001" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1105741360137">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <property name="name" value="separator" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1105726622986">
        <property name="selectable" value="false" />
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1105726671674">
          <property name="drawBorder" value="false" />
          <property name="text" value="    " />
          <property name="selectable" value="false" />
          <property name="name" value="indent" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1105726747113">
          <property name="drawBorder" value="false" />
          <property name="vertical" value="true" />
          <property name="selectable" value="false" />
          <property name="name" value="contentArea" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1105726767723">
            <property name="selectable" value="false" />
            <property name="drawBorder" value="false" />
            <property name="vertical" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1105726767724">
              <property name="drawBorder" value="false" />
              <property name="text" value="extends:" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell" id="1105726767725">
              <property name="drawBorder" value="false" />
              <property name="noTargetText" value="&lt;default&gt;" />
              <link role="relationDeclaration" targetNodeId="1.1071489389519" />
              <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.structure.InlineEditorComponent" id="1105726767726">
                <link role="conceptDeclaration" targetNodeId="1.1071489090640" />
                <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1105726767727">
                  <property name="drawBorder" value="false" />
                  <property name="noTargetText" value="&lt;no name&gt;" />
                  <property name="readOnly" value="true" />
                  <property name="textFgColor" value="DARK_MAGENTA" />
                  <link role="relationDeclaration" targetNodeId="2.1169194664001" />
                </node>
              </node>
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1169129598802">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1169129609804">
            <property name="drawBorder" value="false" />
            <property name="text" value="implements" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNodeList" id="1169129613900">
            <property name="vertical" value="true" />
            <property name="drawBorder" value="false" />
            <link role="relationDeclaration" targetNodeId="1.1169129564478" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1169129590549">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1105726767729">
            <property name="selectable" value="false" />
            <property name="drawBorder" value="false" />
            <property name="vertical" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1105726767730">
              <property name="drawBorder" value="false" />
              <property name="text" value="is root:" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1105726767731">
              <property name="drawBorder" value="false" />
              <link role="relationDeclaration" targetNodeId="1.1096454100552" />
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1105726767732">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <property name="name" value="separator" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1105739255643">
            <property name="selectable" value="true" />
            <property name="drawBorder" value="false" />
            <property name="text" value="properties:" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNodeList" id="1105739255644">
            <property name="vertical" value="true" />
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <property name="gridLayout" value="true" />
            <link role="relationDeclaration" targetNodeId="1.1071489727084" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1105739255645">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <property name="name" value="separator" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1182234062187">
            <property name="text" value="children:" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNodeList" id="1182234070816">
            <property name="vertical" value="true" />
            <property name="gridLayout" value="true" />
            <link role="relationDeclaration" targetNodeId="1.1071489727083" />
            <node role="filter" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeListFilter" id="1182234081146">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1182234081147">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1182234103709">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1182234160829">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference" id="1188230327315">
                      <link role="enumConstantDeclaration" targetNodeId="29.~LinkMetaclass.aggregation" resolveInfo="aggregation" />
                      <link role="enumClass" targetNodeId="29.~LinkMetaclass" resolveInfo="LinkMetaclass" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204740202151">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204668805123">
                        <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1182234140775">
                          <link role="concept" targetNodeId="1.1071489288298" />
                          <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_childNode" id="1182234121464" />
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAdapterOperation" id="1182234149633" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204740202152">
                        <link role="baseMethodDeclaration" targetNodeId="29.~LinkDeclaration.getMetaClass():jetbrains.mps.bootstrap.structureLanguage.structure.LinkMetaclass" resolveInfo="getMetaClass" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="nodeFactory" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeFactory" id="1182234402996">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1182234402997">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1182234409419">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1182234409420">
                    <property name="name" value="result" />
                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1182234409421">
                      <link role="concept" targetNodeId="1.1071489288298" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203721648415">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203721648134">
                        <node role="operand" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1182234418162" />
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetModelOperation" id="1182234419864" />
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Model_CreateNewNodeOperation" id="1182234429288">
                        <link role="concept" targetNodeId="1.1071489288298" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1182234438111">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204740201572">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204668805202">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1182234438112">
                        <link role="variableDeclaration" targetNodeId="1182234409420" resolveInfo="result" />
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAdapterOperation" id="1182234440499" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204740201573">
                      <link role="baseMethodDeclaration" targetNodeId="29.~LinkDeclaration.setMetaClass(jetbrains.mps.bootstrap.structureLanguage.structure.LinkMetaclass):void" resolveInfo="setMetaClass" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference" id="1188230308973">
                        <link role="enumConstantDeclaration" targetNodeId="29.~LinkMetaclass.aggregation" resolveInfo="aggregation" />
                        <link role="enumClass" targetNodeId="29.~LinkMetaclass" resolveInfo="LinkMetaclass" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1182234454515">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1182234455108">
                    <link role="variableDeclaration" targetNodeId="1182234409420" resolveInfo="result" />
                  </node>
                </node>
              </node>
            </node>
            <node role="elementMenuDescriptor" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuDescriptor" id="1193062963226">
              <node role="cellMenuPart" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_Generic_Item" id="1193063991105">
                <property name="matchingText" value="new child" />
                <node role="handlerFunction" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_Generic_Item_Handler" id="1193063991106">
                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1193063991107">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1193064011202">
                      <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1193064011203">
                        <property name="name" value="result" />
                        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1193064011204">
                          <link role="concept" targetNodeId="1.1071489288298" resolveInfo="LinkDeclaration" />
                        </node>
                        <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203721648567">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203721648234">
                            <node role="operand" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_Abstract_editedNode" id="1199955266256" />
                            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetModelOperation" id="1193064011208" />
                          </node>
                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Model_CreateNewNodeOperation" id="1193064011206">
                            <link role="concept" targetNodeId="1.1071489288298" resolveInfo="LinkDeclaration" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1193064011210">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204740201786">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204668805245">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1193064011214">
                            <link role="variableDeclaration" targetNodeId="1193064011203" resolveInfo="result" />
                          </node>
                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAdapterOperation" id="1193064011213" />
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204740201787">
                          <link role="baseMethodDeclaration" targetNodeId="29.~LinkDeclaration.setMetaClass(jetbrains.mps.bootstrap.structureLanguage.structure.LinkMetaclass):void" resolveInfo="setMetaClass" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference" id="1193064011215">
                            <link role="enumClass" targetNodeId="29.~LinkMetaclass" resolveInfo="LinkMetaclass" />
                            <link role="enumConstantDeclaration" targetNodeId="29.~LinkMetaclass.aggregation" resolveInfo="aggregation" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1193064060298">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203721647962">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203721647935">
                          <node role="operand" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_Abstract_editedNode" id="1193064060299" />
                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1193064063772">
                            <link role="link" targetNodeId="1.1071489727083" />
                          </node>
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_AddChildOperation" id="1193064068338">
                          <node role="parameter" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1193064070497">
                            <link role="variableDeclaration" targetNodeId="1193064011203" resolveInfo="result" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1105726767735">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <property name="name" value="separator" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1182234548647">
            <property name="text" value="references:" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNodeList" id="1182234553570">
            <property name="vertical" value="true" />
            <property name="gridLayout" value="true" />
            <link role="relationDeclaration" targetNodeId="1.1071489727083" />
            <node role="filter" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeListFilter" id="1182234553571">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1182234553572">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1182234553573">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1182234553574">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference" id="1188230033390">
                      <link role="enumConstantDeclaration" targetNodeId="29.~LinkMetaclass.reference" resolveInfo="reference" />
                      <link role="enumClass" targetNodeId="29.~LinkMetaclass" resolveInfo="LinkMetaclass" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204740201979">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204668805172">
                        <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1182234553579">
                          <link role="concept" targetNodeId="1.1071489288298" />
                          <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_childNode" id="1182234553580" />
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAdapterOperation" id="1182234553578" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204740201980">
                        <link role="baseMethodDeclaration" targetNodeId="29.~LinkDeclaration.getMetaClass():jetbrains.mps.bootstrap.structureLanguage.structure.LinkMetaclass" resolveInfo="getMetaClass" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="nodeFactory" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeFactory" id="1182234553581">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1182234553582">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1182234553583">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1182234553584">
                    <property name="name" value="result" />
                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1182234553585">
                      <link role="concept" targetNodeId="1.1071489288298" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203721648005">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203721648051">
                        <node role="operand" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1182234553590" />
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetModelOperation" id="1182234553589" />
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Model_CreateNewNodeOperation" id="1182234553587">
                        <link role="concept" targetNodeId="1.1071489288298" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1182234595782">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204740202369">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204668805249">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1182234595786">
                        <link role="variableDeclaration" targetNodeId="1182234553584" resolveInfo="result" />
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAdapterOperation" id="1182234595785" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204740202370">
                      <link role="baseMethodDeclaration" targetNodeId="29.~LinkDeclaration.setMetaClass(jetbrains.mps.bootstrap.structureLanguage.structure.LinkMetaclass):void" resolveInfo="setMetaClass" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference" id="1188230455032">
                        <link role="enumConstantDeclaration" targetNodeId="29.~LinkMetaclass.reference" resolveInfo="reference" />
                        <link role="enumClass" targetNodeId="29.~LinkMetaclass" resolveInfo="LinkMetaclass" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1182234553597">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1182234553598">
                    <link role="variableDeclaration" targetNodeId="1182234553584" resolveInfo="result" />
                  </node>
                </node>
              </node>
            </node>
            <node role="elementMenuDescriptor" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuDescriptor" id="1193063213113">
              <node role="cellMenuPart" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_Generic_Item" id="1193064081514">
                <property name="matchingText" value="new reference" />
                <node role="handlerFunction" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_Generic_Item_Handler" id="1193064081515">
                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1193064081516">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1193064081517">
                      <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1193064081518">
                        <property name="name" value="result" />
                        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1193064081519">
                          <link role="concept" targetNodeId="1.1071489288298" resolveInfo="LinkDeclaration" />
                        </node>
                        <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203721648285">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203721647999">
                            <node role="operand" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_Abstract_editedNode" id="1199955873390" />
                            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetModelOperation" id="1193064081523" />
                          </node>
                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Model_CreateNewNodeOperation" id="1193064081521">
                            <link role="concept" targetNodeId="1.1071489288298" resolveInfo="LinkDeclaration" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1193064081525">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204740202288">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204668805247">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1193064081529">
                            <link role="variableDeclaration" targetNodeId="1193064081518" resolveInfo="result" />
                          </node>
                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAdapterOperation" id="1193064081528" />
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204740202289">
                          <link role="baseMethodDeclaration" targetNodeId="29.~LinkDeclaration.setMetaClass(jetbrains.mps.bootstrap.structureLanguage.structure.LinkMetaclass):void" resolveInfo="setMetaClass" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference" id="1193064081530">
                            <link role="enumClass" targetNodeId="29.~LinkMetaclass" resolveInfo="LinkMetaclass" />
                            <link role="enumConstantDeclaration" targetNodeId="29.~LinkMetaclass.reference" resolveInfo="reference" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1193064081531">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203721648023">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203721648437">
                          <node role="operand" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_Abstract_editedNode" id="1193064081537" />
                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1193064081536">
                            <link role="link" targetNodeId="1.1071489727083" />
                          </node>
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_AddChildOperation" id="1193064081533">
                          <node role="parameter" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1193064081534">
                            <link role="variableDeclaration" targetNodeId="1193064081518" resolveInfo="result" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1182234566645">
            <property name="selectable" value="false" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1105726873348">
            <property name="selectable" value="true" />
            <property name="drawBorder" value="false" />
            <property name="text" value="concept properties:" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNodeList" id="1105726873349">
            <property name="vertical" value="true" />
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <property name="gridLayout" value="true" />
            <link role="relationDeclaration" targetNodeId="1.1105725339613" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1105739239077">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <property name="name" value="separator" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1105739239078">
            <property name="selectable" value="true" />
            <property name="drawBorder" value="false" />
            <property name="text" value="concept links:" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNodeList" id="1105739239079">
            <property name="vertical" value="true" />
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <property name="gridLayout" value="true" />
            <link role="relationDeclaration" targetNodeId="1.1105736949336" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1137467292180">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <property name="name" value="separator" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1137467292181">
            <property name="selectable" value="true" />
            <property name="drawBorder" value="false" />
            <property name="text" value="concept property declarations:" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNodeList" id="1137467292182">
            <property name="vertical" value="true" />
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <property name="gridLayout" value="true" />
            <link role="relationDeclaration" targetNodeId="1.1137467167200" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1137467292184">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <property name="name" value="separator" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1137532267759">
            <property name="selectable" value="true" />
            <property name="drawBorder" value="false" />
            <property name="text" value="concept link declarations:" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNodeList" id="1137532267760">
            <property name="vertical" value="true" />
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <property name="gridLayout" value="true" />
            <link role="relationDeclaration" targetNodeId="1.1137532086877" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1137532267761">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <property name="name" value="separator" />
          </node>
        </node>
      </node>
    </node>
    <node role="inspectedCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1160492784517">
      <property name="vertical" value="true" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Alternation" id="1161165530947">
        <property name="drawBorder" value="false" />
        <node role="alternationCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1161165530948">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1161165530949">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1161165897338">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1161165897339">
                <property name="name" value="l" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1161165897340">
                  <link role="classifier" targetNodeId="5.~Language" resolveInfo="Language" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1161165942508">
                  <link role="classConcept" targetNodeId="5.~SModelUtil_new" resolveInfo="SModelUtil_new" />
                  <link role="baseMethodDeclaration" targetNodeId="5.~SModelUtil_new.getDeclaringLanguage(jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration,jetbrains.mps.smodel.IScope):jetbrains.mps.smodel.Language" resolveInfo="getDeclaringLanguage" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204668805170">
                    <node role="operand" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1171282852459" />
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAdapterOperation" id="1171282854213" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.bootstrap.sharedConcepts.structure.ConceptFunctionParameter_scope" id="1161628902013" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1162559216418">
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1162559219406">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1162559220877" />
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1162559217842">
                  <link role="variableDeclaration" targetNodeId="1161165897339" resolveInfo="l" />
                </node>
              </node>
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1162559216420">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1162559222378">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1162559225098" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1161166135928">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1161166135929">
                <property name="name" value="s" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1161166135930">
                  <link role="classifier" targetNodeId="6.~String" resolveInfo="String" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204740201548">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1161166203371">
                    <link role="baseMethodDeclaration" targetNodeId="14.~Macros.languageDescriptor():jetbrains.mps.util.Macros" resolveInfo="languageDescriptor" />
                    <link role="classConcept" targetNodeId="14.~Macros" resolveInfo="Macros" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204740201549">
                    <link role="baseMethodDeclaration" targetNodeId="14.~Macros.expandPath(java.lang.String,java.io.File):java.lang.String" resolveInfo="expandPath" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203721648287">
                      <node role="operand" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1161166236733" />
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1161166240923">
                        <link role="property" targetNodeId="1.1160488491229" />
                      </node>
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204740202678">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1161166250159">
                        <link role="variableDeclaration" targetNodeId="1161165897339" resolveInfo="l" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204740202679">
                        <link role="baseMethodDeclaration" targetNodeId="13.~AbstractModule.getDescriptorFile():jetbrains.mps.vfs.IFile" resolveInfo="getDescriptorFile" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1161722900535">
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1161722908711">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1161722911542" />
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1161722905163">
                  <link role="variableDeclaration" targetNodeId="1161166135929" resolveInfo="s" />
                </node>
              </node>
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1161722900537">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1161722913887">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1161722917123" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1161166287878">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204740202076">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1161166299147">
                  <link role="baseMethodDeclaration" targetNodeId="16.~File.&lt;init&gt;(java.lang.String)" resolveInfo="File" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1161166402911">
                    <link role="variableDeclaration" targetNodeId="1161166135929" resolveInfo="s" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204740202077">
                  <link role="baseMethodDeclaration" targetNodeId="16.~File.exists():boolean" resolveInfo="exists" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="ifTrueCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Image" id="1161165534970">
          <property name="drawBorder" value="false" />
          <node role="imagePathProvider" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_ImagePath" id="1176901208635">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1176901208636">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1176901491576">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1176901491577">
                  <property name="name" value="language" />
                  <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1176901491578">
                    <link role="classifier" targetNodeId="5.~Language" resolveInfo="Language" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1176901502255">
                    <link role="baseMethodDeclaration" targetNodeId="5.~SModelUtil_new.getDeclaringLanguage(jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration,jetbrains.mps.smodel.IScope):jetbrains.mps.smodel.Language" resolveInfo="getDeclaringLanguage" />
                    <link role="classConcept" targetNodeId="5.~SModelUtil_new" resolveInfo="SModelUtil_new" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204668805174">
                      <node role="operand" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1176901505075" />
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAdapterOperation" id="1176901509194" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204740201505">
                      <node role="operand" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_editorContext" id="1176901512067" />
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204740201506">
                        <link role="baseMethodDeclaration" targetNodeId="4.~EditorContext.getScope():jetbrains.mps.smodel.IScope" resolveInfo="getScope" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1176901521424">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1176901521425">
                  <property name="name" value="iconPath" />
                  <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1176901521426">
                    <link role="classifier" targetNodeId="6.~String" resolveInfo="String" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203721648546">
                    <node role="operand" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1176901525480" />
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1176901528637">
                      <link role="property" targetNodeId="1.1160488491229" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1176901535979">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204740202078">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1176901543228">
                    <link role="baseMethodDeclaration" targetNodeId="14.~Macros.languageDescriptor():jetbrains.mps.util.Macros" resolveInfo="languageDescriptor" />
                    <link role="classConcept" targetNodeId="14.~Macros" resolveInfo="Macros" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204740202079">
                    <link role="baseMethodDeclaration" targetNodeId="14.~Macros.expandPath(java.lang.String,java.io.File):java.lang.String" resolveInfo="expandPath" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1176901551843">
                      <link role="variableDeclaration" targetNodeId="1176901521425" resolveInfo="iconPath" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204740202125">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1176901556888">
                        <link role="variableDeclaration" targetNodeId="1176901491577" resolveInfo="language" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204740202126">
                        <link role="baseMethodDeclaration" targetNodeId="13.~AbstractModule.getDescriptorFile():jetbrains.mps.vfs.IFile" resolveInfo="getDescriptorFile" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="ifFalseCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1161165544408">
          <property name="drawBorder" value="false" />
          <property name="text" value="&lt;no icon&gt;" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1160492829175">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1160492829176">
          <property name="drawBorder" value="false" />
          <property name="text" value="icon" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1160492829177">
          <property name="drawBorder" value="false" />
          <property name="allowEmptyText" value="true" />
          <property name="noTargetText" value="&lt;no icon&gt;" />
          <link role="relationDeclaration" targetNodeId="1.1160488491229" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_JComponent" id="1160492829178">
          <property name="componentProviderID" value="SelectIconButton" />
          <property name="drawBorder" value="false" />
          <node role="componentProvider" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_JComponent" id="1176492331666">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1176492331667">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1176492672998">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1176492693378">
                  <link role="baseMethodDeclaration" targetNodeId="28.~EditorUtil.createSelectIconButton(jetbrains.mps.smodel.SNode,jetbrains.mps.nodeEditor.EditorContext):javax.swing.JComponent" resolveInfo="createSelectIconButton" />
                  <link role="classConcept" targetNodeId="28.~EditorUtil" resolveInfo="EditorUtil" />
                  <node role="actualArgument" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1176492696394" />
                  <node role="actualArgument" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_editorContext" id="1176493020466" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1105726931569">
    <property name="name" value="IntegerConceptPropertyDeclaration_Editor" />
    <link role="conceptDeclaration" targetNodeId="1.1105725141344" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1105726994976">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="false" />
      <property name="name" value="nodeBox" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1105727034368">
        <property name="drawBorder" value="false" />
        <property name="text" value="integer" />
        <property name="fontStyle" value="BOLD" />
        <property name="textFgColor" value="DARK_MAGENTA" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1105727076103">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;no name&gt;" />
        <property name="textFgColor" value="DARK_GREEN" />
        <link role="relationDeclaration" targetNodeId="2.1169194664001" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1105727100448">
    <property name="name" value="StringConceptPropertyDeclaration_Editor" />
    <link role="conceptDeclaration" targetNodeId="1.1105725281956" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1105727123121">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="false" />
      <property name="name" value="nodeBox" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1105727123122">
        <property name="drawBorder" value="false" />
        <property name="text" value="string" />
        <property name="fontStyle" value="BOLD" />
        <property name="textFgColor" value="DARK_MAGENTA" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1105727123123">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;no name&gt;" />
        <property name="textFgColor" value="DARK_GREEN" />
        <link role="relationDeclaration" targetNodeId="2.1169194664001" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1105727129077">
    <property name="name" value="BooleanConceptPropertyDeclaration_Editor" />
    <link role="conceptDeclaration" targetNodeId="1.1105725240314" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1105727152859">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="false" />
      <property name="name" value="nodeBox" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1105727152860">
        <property name="drawBorder" value="false" />
        <property name="text" value="boolean" />
        <property name="fontStyle" value="BOLD" />
        <property name="textFgColor" value="DARK_MAGENTA" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1105727152861">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;no name&gt;" />
        <property name="textFgColor" value="DARK_GREEN" />
        <link role="relationDeclaration" targetNodeId="2.1169194664001" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1105727182159">
    <property name="name" value="IntegerConceptProperty_Editor" />
    <link role="conceptDeclaration" targetNodeId="1.1105725498741" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1105727243426">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="false" />
      <property name="name" value="nodeBox" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell" id="1105727338100">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;no property&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1105725523273" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.structure.InlineEditorComponent" id="1105727274599">
          <link role="conceptDeclaration" targetNodeId="1.1105725141344" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1105727338101">
            <property name="drawBorder" value="false" />
            <property name="fontStyle" value="BOLD" />
            <property name="readOnly" value="true" />
            <property name="textFgColor" value="DARK_MAGENTA" />
            <link role="relationDeclaration" targetNodeId="2.1169194664001" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1105727371774">
        <property name="selectable" value="false" />
        <property name="drawBorder" value="false" />
        <property name="text" value="=" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1105727402759">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;no value&gt;" />
        <property name="textFgColor" value="DARK_BLUE" />
        <link role="relationDeclaration" targetNodeId="1.1105725713309" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1105727411385">
    <property name="name" value="BooleanConceptProperty_Editor" />
    <link role="conceptDeclaration" targetNodeId="1.1105725574259" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell" id="1146699642295">
      <property name="drawBorder" value="false" />
      <property name="noTargetText" value="&lt;no property&gt;" />
      <link role="relationDeclaration" targetNodeId="1.1105725597978" />
      <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.structure.InlineEditorComponent" id="1146699642296">
        <link role="conceptDeclaration" targetNodeId="1.1105725240314" />
        <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1146699642297">
          <property name="drawBorder" value="false" />
          <property name="fontStyle" value="BOLD" />
          <property name="readOnly" value="true" />
          <property name="textFgColor" value="DARK_MAGENTA" />
          <link role="relationDeclaration" targetNodeId="2.1169194664001" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1105727508247">
    <property name="name" value="StringConceptProperty_Editor" />
    <link role="conceptDeclaration" targetNodeId="1.1105725638761" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1105727525373">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="false" />
      <property name="name" value="nodeBox" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell" id="1105727610549">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;no property&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1105725659058" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.structure.InlineEditorComponent" id="1105727537781">
          <link role="conceptDeclaration" targetNodeId="1.1105725281956" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1105727610550">
            <property name="drawBorder" value="false" />
            <property name="fontStyle" value="BOLD" />
            <property name="readOnly" value="true" />
            <property name="textFgColor" value="DARK_MAGENTA" />
            <link role="relationDeclaration" targetNodeId="2.1169194664001" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1105731706156">
        <property name="selectable" value="false" />
        <property name="drawBorder" value="false" />
        <property name="text" value="=" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1105731706157">
        <property name="drawBorder" value="false" />
        <property name="fontStyle" value="BOLD" />
        <property name="noTargetText" value="&lt;no value&gt;" />
        <property name="textFgColor" value="DARK_GREEN" />
        <link role="relationDeclaration" targetNodeId="1.1105725733873" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1105728890378">
    <property name="name" value="ConceptProperty_Editor" />
    <link role="conceptDeclaration" targetNodeId="1.1105725413739" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Error" id="1105728957754">
      <property name="drawBorder" value="false" />
      <property name="text" value="&lt;choose property&gt;" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1105737052656">
    <property name="name" value="ReferenceConceptLinkDeclaration_Editor" />
    <link role="conceptDeclaration" targetNodeId="1.1105741578420" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1137532689744">
      <property name="vertical" value="false" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1137532689745">
        <property name="drawBorder" value="false" />
        <property name="text" value="reference" />
        <property name="fontStyle" value="BOLD" />
        <property name="textFgColor" value="DARK_MAGENTA" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1137532689746">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;no name&gt;" />
        <property name="textFgColor" value="DARK_GREEN" />
        <link role="relationDeclaration" targetNodeId="2.1169194664001" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1137532689747">
        <property name="drawBorder" value="false" />
        <property name="text" value="target concept:" />
        <property name="fontStyle" value="BOLD" />
        <property name="textFgColor" value="DARK_MAGENTA" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell" id="1137532689748">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;no target type&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1105736621938" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.structure.InlineEditorComponent" id="1137532689749">
          <link role="conceptDeclaration" targetNodeId="1.1071489090640" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1137532689750">
            <property name="drawBorder" value="false" />
            <property name="noTargetText" value="&lt;no name&gt;" />
            <property name="readOnly" value="true" />
            <link role="relationDeclaration" targetNodeId="2.1169194664001" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1105737366950">
    <property name="name" value="ReferenceConceptLink_Editor" />
    <link role="conceptDeclaration" targetNodeId="1.1105736778597" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1105738878701">
      <property name="vertical" value="false" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell" id="1105739062907">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;no link&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1105742372452" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.structure.InlineEditorComponent" id="1105738886421">
          <link role="conceptDeclaration" targetNodeId="1.1105741578420" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1105739062908">
            <property name="drawBorder" value="false" />
            <property name="fontStyle" value="BOLD" />
            <property name="readOnly" value="true" />
            <property name="textFgColor" value="DARK_MAGENTA" />
            <link role="relationDeclaration" targetNodeId="2.1169194664001" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1105739062909">
        <property name="drawBorder" value="false" />
        <property name="text" value="=" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell" id="1141943896680">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1105736807942" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.structure.InlineEditorComponent" id="1141943896681">
          <link role="conceptDeclaration" targetNodeId="2.1133920641626" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1141945365974">
            <property name="drawBorder" value="false" />
            <property name="readOnly" value="true" />
            <link role="relationDeclaration" targetNodeId="2.1169194664001" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1105739078475">
    <property name="name" value="AggregationConceptLink_Editor" />
    <link role="conceptDeclaration" targetNodeId="1.1105736889287" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1105739124743">
      <property name="vertical" value="false" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell" id="1105739124744">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;no link&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1105742417828" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.structure.InlineEditorComponent" id="1105739101929">
          <link role="conceptDeclaration" targetNodeId="1.1105741535888" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1105739124745">
            <property name="drawBorder" value="false" />
            <property name="noTargetText" value="&lt;no name&gt;" />
            <property name="fontStyle" value="BOLD" />
            <property name="readOnly" value="true" />
            <property name="textFgColor" value="DARK_MAGENTA" />
            <link role="relationDeclaration" targetNodeId="2.1169194664001" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1105739124746">
        <property name="drawBorder" value="false" />
        <property name="text" value="=" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1105987989392">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1105736901241" />
        <node role="menuDescriptor" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuDescriptor" id="1165336798257">
          <node role="cellMenuPart" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_ReplaceChild_CustomChildConcept" id="1165336801227">
            <node role="childConceptFunction" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_ReplaceChild_CustomChildConcept_Query" id="1165336801228">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1165336801229">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1165336805433">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203721648001">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203721648281">
                      <node role="operand" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_Abstract_editedNode" id="1165336808607" />
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1165336814078">
                        <link role="link" targetNodeId="1.1105742417828" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1165336819877">
                      <link role="link" targetNodeId="1.1105736621938" />
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
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1105742536548">
    <property name="name" value="ConceptLink_Editor" />
    <link role="conceptDeclaration" targetNodeId="1.1105736674127" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Error" id="1105742555383">
      <property name="drawBorder" value="false" />
      <property name="text" value="&lt;choose link&gt;" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1105751805016">
    <property name="name" value="AggregationConceptLinkDeclaration_Editor" />
    <link role="conceptDeclaration" targetNodeId="1.1105741535888" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1137532662973">
      <property name="vertical" value="false" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1137532662974">
        <property name="drawBorder" value="false" />
        <property name="text" value="aggregation" />
        <property name="fontStyle" value="BOLD" />
        <property name="textFgColor" value="DARK_MAGENTA" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1137532662975">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;no name&gt;" />
        <property name="textFgColor" value="DARK_GREEN" />
        <link role="relationDeclaration" targetNodeId="2.1169194664001" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1137532662976">
        <property name="drawBorder" value="false" />
        <property name="text" value="target concept:" />
        <property name="fontStyle" value="BOLD" />
        <property name="textFgColor" value="DARK_MAGENTA" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell" id="1137532662977">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;no target type&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1105736621938" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.structure.InlineEditorComponent" id="1137532662978">
          <link role="conceptDeclaration" targetNodeId="1.1071489090640" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1137545446126">
            <property name="drawBorder" value="false" />
            <property name="noTargetText" value="&lt;no name&gt;" />
            <property name="readOnly" value="true" />
            <link role="relationDeclaration" targetNodeId="2.1169194664001" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1137467669465">
    <link role="conceptDeclaration" targetNodeId="1.1105725006687" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Error" id="1137469134524">
      <property name="drawBorder" value="false" />
      <property name="text" value="&lt;choose property type&gt;" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1137532943361">
    <link role="conceptDeclaration" targetNodeId="1.1105736576531" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Error" id="1137532945724">
      <property name="drawBorder" value="false" />
      <property name="text" value="&lt;choose link type&gt;" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1149608488896">
    <property name="package" value="annotation" />
    <link role="conceptDeclaration" targetNodeId="1.1149608206811" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1149608637030">
      <property name="vertical" value="true" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1204749925795">
        <property name="selectable" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1204749925796">
          <property name="drawBorder" value="false" />
          <property name="text" value="annotation link declaration" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1204749937611">
          <property name="noTargetText" value="&lt;no role&gt;" />
          <link role="relationDeclaration" targetNodeId="1.1204740973143" resolveInfo="role" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1149608660300">
        <property name="selectable" value="false" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1204750695927">
        <property name="selectable" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1204750701898">
          <property name="selectable" value="false" />
          <property name="drawBorder" value="false" />
          <property name="text" value="   " />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1204750734337">
          <property name="vertical" value="true" />
          <property name="gridLayout" value="true" />
          <property name="selectable" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1204751056949">
            <property name="selectable" value="false" />
            <property name="vertical" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1204751129795">
              <property name="drawBorder" value="false" />
              <property name="text" value="stereotype" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1204751142436">
              <property name="drawBorder" value="false" />
              <link role="relationDeclaration" targetNodeId="1.1149608445162" resolveInfo="stereotype" />
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1204751512792">
            <property name="selectable" value="false" />
            <property name="vertical" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1204751512793">
              <property name="drawBorder" value="false" />
              <property name="text" value="cardinality" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1204751512794">
              <property name="drawBorder" value="false" />
              <link role="relationDeclaration" targetNodeId="1.1204741022738" resolveInfo="sourceCardinality" />
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1204751152562">
            <property name="selectable" value="false" />
            <property name="vertical" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1204751152563">
              <property name="drawBorder" value="false" />
              <property name="text" value="source" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell" id="1204751188237">
              <property name="drawBorder" value="false" />
              <link role="relationDeclaration" targetNodeId="1.1149608246500" />
              <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.structure.InlineEditorComponent" id="1204751188238">
                <link role="conceptDeclaration" targetNodeId="1.1071489090640" resolveInfo="ConceptDeclaration" />
                <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1204751188239">
                  <property name="drawBorder" value="false" />
                  <property name="noTargetText" value="&lt;no concept&gt;" />
                  <property name="readOnly" value="true" />
                  <property name="textFgColor" value="DARK_MAGENTA" />
                  <link role="relationDeclaration" targetNodeId="2.1169194664001" resolveInfo="name" />
                </node>
              </node>
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1204751383646">
            <property name="selectable" value="false" />
            <property name="vertical" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1204751383647">
              <property name="drawBorder" value="false" />
              <property name="text" value="target" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell" id="1204751383648">
              <property name="drawBorder" value="false" />
              <link role="relationDeclaration" targetNodeId="1.1204741097161" />
              <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.structure.InlineEditorComponent" id="1204751383649">
                <link role="conceptDeclaration" targetNodeId="1.1169125787135" resolveInfo="AbstractConceptDeclaration" />
                <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1204751383650">
                  <property name="drawBorder" value="false" />
                  <property name="noTargetText" value="&lt;no concept&gt;" />
                  <property name="readOnly" value="true" />
                  <property name="textFgColor" value="DARK_MAGENTA" />
                  <link role="relationDeclaration" targetNodeId="2.1169194664001" resolveInfo="name" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1169126000005">
    <link role="conceptDeclaration" targetNodeId="1.1169125989551" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1169126008913">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="true" />
      <property name="name" value="nodeBox" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1169126008914">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <property name="selectable" value="false" />
        <property name="name" value="headerRow" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1169126008915">
          <property name="drawBorder" value="false" />
          <property name="text" value="interface concept declaration" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1169126008916">
          <property name="drawBorder" value="false" />
          <property name="noTargetText" value="&lt;no name&gt;" />
          <property name="textBgColorSelected" value="cyan" />
          <property name="textBgColor" value="yellow" />
          <link role="relationDeclaration" targetNodeId="2.1169194664001" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1169126008917">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <property name="name" value="separator" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1169126008918">
        <property name="selectable" value="false" />
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1169126008919">
          <property name="drawBorder" value="false" />
          <property name="text" value="    " />
          <property name="selectable" value="false" />
          <property name="name" value="indent" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1169126008920">
          <property name="drawBorder" value="false" />
          <property name="vertical" value="true" />
          <property name="selectable" value="false" />
          <property name="name" value="contentArea" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1169127688705">
            <property name="drawBorder" value="false" />
            <property name="text" value="extends:" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNodeList" id="1169127704617">
            <property name="vertical" value="true" />
            <property name="drawBorder" value="false" />
            <link role="relationDeclaration" targetNodeId="1.1169127546356" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1169127682234">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1169126008930">
            <property name="selectable" value="true" />
            <property name="drawBorder" value="false" />
            <property name="text" value="properties:" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNodeList" id="1169126008931">
            <property name="vertical" value="true" />
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <property name="gridLayout" value="true" />
            <link role="relationDeclaration" targetNodeId="1.1071489727084" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1169126008932">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <property name="name" value="separator" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1193064095866">
            <property name="text" value="children:" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNodeList" id="1193064095867">
            <property name="vertical" value="true" />
            <property name="gridLayout" value="true" />
            <link role="relationDeclaration" targetNodeId="1.1071489727083" />
            <node role="filter" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeListFilter" id="1193064095868">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1193064095869">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1193064095870">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1193064095871">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference" id="1193064095872">
                      <link role="enumClass" targetNodeId="29.~LinkMetaclass" resolveInfo="LinkMetaclass" />
                      <link role="enumConstantDeclaration" targetNodeId="29.~LinkMetaclass.aggregation" resolveInfo="aggregation" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204740202415">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204668805168">
                        <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1193064095876">
                          <link role="concept" targetNodeId="1.1071489288298" resolveInfo="LinkDeclaration" />
                          <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_childNode" id="1193064095877" />
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAdapterOperation" id="1193064095875" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204740202416">
                        <link role="baseMethodDeclaration" targetNodeId="29.~LinkDeclaration.getMetaClass():jetbrains.mps.bootstrap.structureLanguage.structure.LinkMetaclass" resolveInfo="getMetaClass" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="nodeFactory" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeFactory" id="1193064095878">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1193064095879">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1193064095880">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1193064095881">
                    <property name="name" value="result" />
                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1193064095882">
                      <link role="concept" targetNodeId="1.1071489288298" resolveInfo="LinkDeclaration" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203721647958">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203721648490">
                        <node role="operand" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1193064095887" />
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetModelOperation" id="1193064095886" />
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Model_CreateNewNodeOperation" id="1193064095884">
                        <link role="concept" targetNodeId="1.1071489288298" resolveInfo="LinkDeclaration" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1193064095888">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204740202411">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204668805121">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1193064095892">
                        <link role="variableDeclaration" targetNodeId="1193064095881" resolveInfo="result" />
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAdapterOperation" id="1193064095891" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204740202412">
                      <link role="baseMethodDeclaration" targetNodeId="29.~LinkDeclaration.setMetaClass(jetbrains.mps.bootstrap.structureLanguage.structure.LinkMetaclass):void" resolveInfo="setMetaClass" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference" id="1193064095893">
                        <link role="enumClass" targetNodeId="29.~LinkMetaclass" resolveInfo="LinkMetaclass" />
                        <link role="enumConstantDeclaration" targetNodeId="29.~LinkMetaclass.aggregation" resolveInfo="aggregation" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1193064095894">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1193064095895">
                    <link role="variableDeclaration" targetNodeId="1193064095881" resolveInfo="result" />
                  </node>
                </node>
              </node>
            </node>
            <node role="elementMenuDescriptor" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuDescriptor" id="1193064095896">
              <node role="cellMenuPart" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_Generic_Item" id="1193064095897">
                <property name="matchingText" value="new child" />
                <node role="handlerFunction" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_Generic_Item_Handler" id="1193064095898">
                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1193064095899">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1193064095900">
                      <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1193064095901">
                        <property name="name" value="result" />
                        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1193064095902">
                          <link role="concept" targetNodeId="1.1071489288298" resolveInfo="LinkDeclaration" />
                        </node>
                        <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203721648467">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203721648106">
                            <node role="operand" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_Abstract_editedNode" id="1199955973763" />
                            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetModelOperation" id="1193064095906" />
                          </node>
                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Model_CreateNewNodeOperation" id="1193064095904">
                            <link role="concept" targetNodeId="1.1071489288298" resolveInfo="LinkDeclaration" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1193064095908">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204740202586">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204668805198">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1193064095912">
                            <link role="variableDeclaration" targetNodeId="1193064095901" resolveInfo="result" />
                          </node>
                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAdapterOperation" id="1193064095911" />
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204740202587">
                          <link role="baseMethodDeclaration" targetNodeId="29.~LinkDeclaration.setMetaClass(jetbrains.mps.bootstrap.structureLanguage.structure.LinkMetaclass):void" resolveInfo="setMetaClass" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference" id="1193064095913">
                            <link role="enumClass" targetNodeId="29.~LinkMetaclass" resolveInfo="LinkMetaclass" />
                            <link role="enumConstantDeclaration" targetNodeId="29.~LinkMetaclass.aggregation" resolveInfo="aggregation" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1193064095914">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203721648309">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203721648082">
                          <node role="operand" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_Abstract_editedNode" id="1193064095920" />
                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1193064095919">
                            <link role="link" targetNodeId="1.1071489727083" />
                          </node>
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_AddChildOperation" id="1193064095916">
                          <node role="parameter" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1193064095917">
                            <link role="variableDeclaration" targetNodeId="1193064095901" resolveInfo="result" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1193064095921">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <property name="name" value="separator" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1193064095922">
            <property name="text" value="references:" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNodeList" id="1193064095923">
            <property name="vertical" value="true" />
            <property name="gridLayout" value="true" />
            <link role="relationDeclaration" targetNodeId="1.1071489727083" />
            <node role="filter" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeListFilter" id="1193064095924">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1193064095925">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1193064095926">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1193064095927">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference" id="1193064095928">
                      <link role="enumClass" targetNodeId="29.~LinkMetaclass" resolveInfo="LinkMetaclass" />
                      <link role="enumConstantDeclaration" targetNodeId="29.~LinkMetaclass.reference" resolveInfo="reference" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204740201956">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204668805147">
                        <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1193064095932">
                          <link role="concept" targetNodeId="1.1071489288298" resolveInfo="LinkDeclaration" />
                          <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_childNode" id="1193064095933" />
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAdapterOperation" id="1193064095931" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204740201957">
                        <link role="baseMethodDeclaration" targetNodeId="29.~LinkDeclaration.getMetaClass():jetbrains.mps.bootstrap.structureLanguage.structure.LinkMetaclass" resolveInfo="getMetaClass" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="nodeFactory" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeFactory" id="1193064095934">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1193064095935">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1193064095936">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1193064095937">
                    <property name="name" value="result" />
                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1193064095938">
                      <link role="concept" targetNodeId="1.1071489288298" resolveInfo="LinkDeclaration" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203721648029">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203721648331">
                        <node role="operand" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1193064095943" />
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetModelOperation" id="1193064095942" />
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Model_CreateNewNodeOperation" id="1193064095940">
                        <link role="concept" targetNodeId="1.1071489288298" resolveInfo="LinkDeclaration" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1193064095944">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204740202578">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204668805227">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1193064095948">
                        <link role="variableDeclaration" targetNodeId="1193064095937" resolveInfo="result" />
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAdapterOperation" id="1193064095947" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204740202579">
                      <link role="baseMethodDeclaration" targetNodeId="29.~LinkDeclaration.setMetaClass(jetbrains.mps.bootstrap.structureLanguage.structure.LinkMetaclass):void" resolveInfo="setMetaClass" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference" id="1193064095949">
                        <link role="enumClass" targetNodeId="29.~LinkMetaclass" resolveInfo="LinkMetaclass" />
                        <link role="enumConstantDeclaration" targetNodeId="29.~LinkMetaclass.reference" resolveInfo="reference" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1193064095950">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1193064095951">
                    <link role="variableDeclaration" targetNodeId="1193064095937" resolveInfo="result" />
                  </node>
                </node>
              </node>
            </node>
            <node role="elementMenuDescriptor" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuDescriptor" id="1193064095952">
              <node role="cellMenuPart" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_Generic_Item" id="1193064095953">
                <property name="matchingText" value="new reference" />
                <node role="handlerFunction" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_Generic_Item_Handler" id="1193064095954">
                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1193064095955">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1193064095956">
                      <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1193064095957">
                        <property name="name" value="result" />
                        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1193064095958">
                          <link role="concept" targetNodeId="1.1071489288298" resolveInfo="LinkDeclaration" />
                        </node>
                        <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203721647913">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203721648311">
                            <node role="operand" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_Abstract_editedNode" id="1199956020698" />
                            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetModelOperation" id="1193064095962" />
                          </node>
                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Model_CreateNewNodeOperation" id="1193064095960">
                            <link role="concept" targetNodeId="1.1071489288298" resolveInfo="LinkDeclaration" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1193064095964">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204740201936">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204668805221">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1193064095968">
                            <link role="variableDeclaration" targetNodeId="1193064095957" resolveInfo="result" />
                          </node>
                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAdapterOperation" id="1193064095967" />
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204740201937">
                          <link role="baseMethodDeclaration" targetNodeId="29.~LinkDeclaration.setMetaClass(jetbrains.mps.bootstrap.structureLanguage.structure.LinkMetaclass):void" resolveInfo="setMetaClass" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference" id="1193064095969">
                            <link role="enumClass" targetNodeId="29.~LinkMetaclass" resolveInfo="LinkMetaclass" />
                            <link role="enumConstantDeclaration" targetNodeId="29.~LinkMetaclass.reference" resolveInfo="reference" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1193064095970">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203721648512">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203721648409">
                          <node role="operand" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_Abstract_editedNode" id="1193064095976" />
                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1193064095975">
                            <link role="link" targetNodeId="1.1071489727083" />
                          </node>
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_AddChildOperation" id="1193064095972">
                          <node role="parameter" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1193064095973">
                            <link role="variableDeclaration" targetNodeId="1193064095957" resolveInfo="result" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1193064095977">
            <property name="selectable" value="false" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1169126008936">
            <property name="selectable" value="true" />
            <property name="drawBorder" value="false" />
            <property name="text" value="concept properties:" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNodeList" id="1169126008937">
            <property name="vertical" value="true" />
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <property name="gridLayout" value="true" />
            <link role="relationDeclaration" targetNodeId="1.1105725339613" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1169126008938">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <property name="name" value="separator" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1169126008939">
            <property name="selectable" value="true" />
            <property name="drawBorder" value="false" />
            <property name="text" value="concept links:" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNodeList" id="1169126008940">
            <property name="vertical" value="true" />
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <property name="gridLayout" value="true" />
            <link role="relationDeclaration" targetNodeId="1.1105736949336" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1169126008941">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <property name="name" value="separator" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1169126008942">
            <property name="selectable" value="true" />
            <property name="drawBorder" value="false" />
            <property name="text" value="concept property declarations:" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNodeList" id="1169126008943">
            <property name="vertical" value="true" />
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <property name="gridLayout" value="true" />
            <link role="relationDeclaration" targetNodeId="1.1137467167200" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1169126008944">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <property name="name" value="separator" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1169126008945">
            <property name="selectable" value="true" />
            <property name="drawBorder" value="false" />
            <property name="text" value="concept link declarations:" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNodeList" id="1169126008946">
            <property name="vertical" value="true" />
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <property name="gridLayout" value="true" />
            <link role="relationDeclaration" targetNodeId="1.1137532086877" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1169126008947">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <property name="name" value="separator" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1169127648030">
    <link role="conceptDeclaration" targetNodeId="1.1169127622168" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell" id="1199633082144">
      <property name="drawBorder" value="false" />
      <link role="relationDeclaration" targetNodeId="1.1169127628841" />
      <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.structure.InlineEditorComponent" id="1199633082145">
        <link role="conceptDeclaration" targetNodeId="1.1169125989551" resolveInfo="InterfaceConceptDeclaration" />
        <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1199633082146">
          <property name="drawBorder" value="false" />
          <property name="readOnly" value="true" />
          <property name="textFgColor" value="DARK_MAGENTA" />
          <link role="relationDeclaration" targetNodeId="2.1169194664001" resolveInfo="name" />
        </node>
      </node>
    </node>
  </node>
</model>

