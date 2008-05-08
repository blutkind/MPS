<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.matrixLanguage.editor">
  <persistence version="1" />
  <refactoringHistory />
  <language namespace="jetbrains.mps.bootstrap.editorLanguage" />
  <language namespace="jetbrains.mps.baseLanguage.ext.collections.lang">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.structure" version="1" />
  </language>
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage">
    <languageAspect modelUID="jetbrains.mps.bootstrap.smodelLanguage.structure" version="0" />
  </language>
  <language namespace="jetbrains.mps.baseLanguage">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.structure" version="0" />
  </language>
  <languageAspect modelUID="jetbrains.mps.closures.structure" version="0" />
  <languageAspect modelUID="jetbrains.mps.closures.structure" version="0" />
  <languageAspect modelUID="jetbrains.mps.closures.structure" version="0" />
  <languageAspect modelUID="jetbrains.mps.closures.structure" version="0" />
  <languageAspect modelUID="jetbrains.mps.closures.structure" version="0" />
  <languageAspect modelUID="jetbrains.mps.closures.structure" version="0" />
  <maxImportIndex value="1" />
  <import index="1" modelUID="jetbrains.mps.matrixLanguage.structure" version="-1" />
  <visible index="2" modelUID="jetbrains.mps.baseLanguage.editor" />
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1209978837347">
    <link role="conceptDeclaration" targetNodeId="1.1209978821264" resolveInfo="MatrixType" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1210159695067">
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1210159695068">
        <property name="text" value="matrix" />
        <link role="styleClass" targetNodeId="2v.1186415544875" resolveInfo="KeyWord" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1210159696492">
        <property name="text" value="&lt;" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1210159697979">
        <link role="relationDeclaration" targetNodeId="1.1210159684238" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1210159699059">
        <property name="text" value="&gt;" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1209987553892">
    <property name="package" value="literal" />
    <link role="conceptDeclaration" targetNodeId="1.1209987469663" resolveInfo="MatrixLiteral" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1210161248002">
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1210161262162">
        <property name="text" value="&lt;" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1210161282776">
        <link role="relationDeclaration" targetNodeId="1.1210161158423" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1210161273414">
        <property name="text" value="&gt;" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNodeList" id="1210161250534">
        <property name="vertical" value="true" />
        <property name="drawBrackets" value="true" />
        <property name="gridLayout" value="true" />
        <link role="relationDeclaration" targetNodeId="1.1209987497704" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1209987600840">
    <property name="package" value="literal" />
    <link role="conceptDeclaration" targetNodeId="1.1209987479015" resolveInfo="MatrixRow" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNodeList" id="1209988029837">
      <property name="separatorText" value="," />
      <property name="selectable" value="true" />
      <property name="gridLayout" value="true" />
      <link role="relationDeclaration" targetNodeId="1.1209987483934" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1209989691485">
    <property name="package" value="expressions" />
    <link role="conceptDeclaration" targetNodeId="1.1209989472341" resolveInfo="Determinant" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1209989706354">
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1209989710366">
        <property name="text" value="det" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1209989725186">
        <link role="relationDeclaration" targetNodeId="1.1209989620759" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1209999517477">
    <property name="package" value="expressions" />
    <link role="conceptDeclaration" targetNodeId="1.1209999461920" resolveInfo="TransposeExpression" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1209999527439">
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1209999546411">
        <link role="relationDeclaration" targetNodeId="1.1209999493205" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1209999557387">
        <property name="text" value="T" />
        <property name="fontStyle" value="BOLD" />
      </node>
    </node>
  </node>
  <visible index="3" modelUID="jetbrains.mps.baseLanguage.structure" />
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1210235084326">
    <property name="package" value="for" />
    <link role="conceptDeclaration" targetNodeId="1.1210234754876" resolveInfo="ForMatrixElemnts" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1210235596913">
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1210235597992">
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1210235597993">
          <property name="text" value="for" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1210235597994">
          <link role="relationDeclaration" targetNodeId="1.1210234807362" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1210235597995">
          <property name="text" value="," />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1210235597996">
          <link role="relationDeclaration" targetNodeId="1.1210234892102" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1210235597997">
          <property name="text" value="," />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1210235597998">
          <link role="relationDeclaration" targetNodeId="1.1210234933941" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1210235597999">
          <property name="text" value="in" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1210235598000">
          <link role="relationDeclaration" targetNodeId="1.1210234913397" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1210235610431">
          <property name="text" value="{" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1210235713300">
        <property name="selectable" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Indent" id="1210238228064" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1210235732862">
          <link role="relationDeclaration" targetNodeId="3v.1154032183016" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1210235741205">
        <property name="selectable" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1210235774094">
          <property name="text" value="}" />
        </node>
      </node>
    </node>
  </node>
  <visible index="4" modelUID="jetbrains.mps.core.structure" />
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1210238291784">
    <property name="package" value="for" />
    <link role="conceptDeclaration" targetNodeId="1.1210234982684" resolveInfo="MatrixElementVariableDeclaration" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1210238332891">
      <link role="relationDeclaration" targetNodeId="4v.1169194664001" resolveInfo="name" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1210246419877">
    <property name="package" value="for" />
    <link role="conceptDeclaration" targetNodeId="1.1210234858018" resolveInfo="MatrixIndexVariableDeclaration" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1210246433816">
      <link role="relationDeclaration" targetNodeId="4v.1169194664001" resolveInfo="name" />
    </node>
  </node>
</model>

