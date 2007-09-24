<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.logging.refactoring.editor">
  <language namespace="jetbrains.mps.bootstrap.editorLanguage" />
  <language namespace="jetbrains.mps.baseLanguage" />
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage" />
  <maxImportIndex value="3" />
  <import index="1" modelUID="jetbrains.mps.logging.refactoring.structure" />
  <import index="2" modelUID="jetbrains.mps.core.structure" />
  <import index="3" modelUID="jetbrains.mps.bootstrap.structureLanguage.structure" />
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1189693958814">
    <link role="conceptDeclaration" targetNodeId="1.1189693830529" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1189768590115">
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1189768590116">
        <property name="textFgColor" value="DARK_MAGENTA" />
        <link role="relationDeclaration" targetNodeId="2.1169194664001" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1189768593103">
        <property name="text" value="(" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1189768595636">
        <property name="textFgColor" value="DARK_GREEN" />
        <link role="relationDeclaration" targetNodeId="1.1189768565365" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1189768599560">
        <property name="text" value=")" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1190637154835">
        <property name="text" value=":" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1190637157524">
        <link role="relationDeclaration" targetNodeId="1.1190637130098" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1189694115688">
    <link role="conceptDeclaration" targetNodeId="1.1189694084608" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1189694123409">
      <link role="relationDeclaration" targetNodeId="1.1189694099406" />
      <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1189694123410">
        <link role="conceptDeclaration" targetNodeId="1.1189693830529" />
        <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1189694134365">
          <property name="readOnly" value="true" />
          <property name="textFgColor" value="DARK_MAGENTA" />
          <link role="relationDeclaration" targetNodeId="2.1169194664001" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1189695208374">
    <link role="conceptDeclaration" targetNodeId="1.1189693812263" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1189695216204">
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1189695221471">
        <property name="selectable" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1189695225051">
          <property name="text" value="refactoring" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1189695242647">
          <link role="relationDeclaration" targetNodeId="2.1169194664001" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1189695620833">
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1189695657490">
        <property name="text" value="user-entered arguments:" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1189695686507">
        <property name="vertical" value="true" />
        <link role="relationDeclaration" targetNodeId="1.1189693888592" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1189696129528">
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1189696131468">
        <property name="text" value="internal arguments:" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1189696153626">
        <property name="vertical" value="true" />
        <link role="relationDeclaration" targetNodeId="1.1189696093619" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1189695249055">
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1189695260306">
        <property name="text" value="is applicable:" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1189695272854">
        <property name="noTargetText" value="always" />
        <link role="relationDeclaration" targetNodeId="1.1189695159409" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1189695284621">
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1189695293685">
        <property name="text" value="do refactor:" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1189695303186">
        <link role="relationDeclaration" targetNodeId="1.1189695170518" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1189695305376">
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1189695311659">
        <property name="text" value="update model:" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1189695320894">
        <link role="relationDeclaration" targetNodeId="1.1189695176456" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1190636417925">
    <link role="conceptDeclaration" targetNodeId="1.1190636362747" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1190636450833">
      <property name="text" value="smodel" />
      <property name="textFgColor" value="DARK_BLUE" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1190636616826">
    <link role="conceptDeclaration" targetNodeId="1.1190636474412" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1190636625781">
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1190636745360">
        <property name="text" value="snode" />
        <property name="textFgColor" value="DARK_BLUE" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1190636749455">
        <property name="text" value="&lt;" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1190636751942">
        <property name="noTargetText" value="any" />
        <link role="relationDeclaration" targetNodeId="1.1190636512592" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1190636751943">
          <link role="conceptDeclaration" targetNodeId="3.1071489090640" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1190636755101">
            <property name="readOnly" value="true" />
            <property name="textFgColor" value="DARK_GREEN" />
            <link role="relationDeclaration" targetNodeId="2.1169194664001" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1190636758290">
        <property name="text" value="&gt;" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1190636815916">
    <link role="conceptDeclaration" targetNodeId="1.1190636333995" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1190636820011">
      <property name="text" value="&lt;no type&gt;" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1190636854044">
    <link role="conceptDeclaration" targetNodeId="1.1190636830793" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1190636857062">
      <property name="text" value="string" />
      <property name="textFgColor" value="DARK_BLUE" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1190639270193">
    <link role="conceptDeclaration" targetNodeId="1.1190639244566" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1190639295695">
      <property name="text" value="snodeOrModel" />
    </node>
  </node>
</model>

