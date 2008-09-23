<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:1222075024653(jetbrains.mps.quickQueryLanguage.editor)">
  <persistence version="3" />
  <refactoringHistory />
  <language namespace="jetbrains.mps.bootstrap.editorLanguage" />
  <language namespace="jetbrains.mps.baseLanguage.ext.collections.lang" />
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage" />
  <language namespace="jetbrains.mps.baseLanguage" />
  <languageAspect modelUID="r:1222075024024(jetbrains.mps.bootstrap.editorLanguage.constraints)" version="21" />
  <languageAspect modelUID="r:1222075024030(jetbrains.mps.bootstrap.editorLanguage.structure)" version="26" />
  <languageAspect modelUID="r:1222075024168(jetbrains.mps.baseLanguage.ext.collections.lang.constraints)" version="6" />
  <languageAspect modelUID="r:1222075024174(jetbrains.mps.baseLanguage.ext.collections.lang.structure)" version="1" />
  <languageAspect modelUID="r:1222075024123(jetbrains.mps.bootstrap.smodelLanguage.constraints)" version="21" />
  <languageAspect modelUID="r:1222075024129(jetbrains.mps.bootstrap.smodelLanguage.structure)" version="1" />
  <languageAspect modelUID="r:1222075024065(jetbrains.mps.baseLanguage.constraints)" version="83" />
  <languageAspect modelUID="r:1222075024074(jetbrains.mps.baseLanguage.structure)" version="0" />
  <languageAspect modelUID="r:1222075024012(jetbrains.mps.bootstrap.structureLanguage.constraints)" version="11" />
  <languageAspect modelUID="r:1222075024184(jetbrains.mps.closures.structure)" version="0" />
  <languageAspect modelUID="r:1222075024003(jetbrains.mps.core.constraints)" version="2" />
  <languageAspect modelUID="r:1222075024180(jetbrains.mps.closures.constraints)" version="2" />
  <languageAspect modelUID="r:1222075024356(jetbrains.mps.internal.collections.constraints)" version="2" />
  <languageAspect modelUID="r:1222075024058(jetbrains.mps.bootstrap.sharedConcepts.constraints)" version="0" />
  <languageAspect modelUID="r:1222075024091(jetbrains.mps.baseLanguage.blTypes.constraints)" version="0" />
  <maxImportIndex value="4" />
  <import index="1" modelUID="r:1222075024656(jetbrains.mps.quickQueryLanguage.structure)" version="-1" />
  <import index="2" modelUID="r:1222075024067(jetbrains.mps.baseLanguage.editor)" version="-1" />
  <import index="3" modelUID="r:1222075024018(jetbrains.mps.bootstrap.structureLanguage.structure)" version="-1" />
  <import index="4" modelUID="r:1222075024008(jetbrains.mps.core.structure)" version="-1" />
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1218793625941">
    <link role="conceptDeclaration" targetNodeId="1.1218793502081" resolveInfo="ModelQuery" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1218793628630">
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1218795500272">
        <property name="vertical" value="false" />
        <node role="styleItem" type="jetbrains.mps.bootstrap.editorLanguage.structure.SelectableStyleSheetItem" id="1218795500273">
          <property name="flag" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1218795504996">
          <property name="text" value="search query" />
          <link role="styleClass" targetNodeId="2.1186415544875" resolveInfo="KeyWord" />
        </node>
        <node role="styleItem" type="jetbrains.mps.bootstrap.editorLanguage.structure.SelectableStyleSheetItem" id="1218795500275">
          <property name="flag" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1218795552315">
        <property name="vertical" value="false" />
        <node role="styleItem" type="jetbrains.mps.bootstrap.editorLanguage.structure.SelectableStyleSheetItem" id="1218795552316">
          <property name="flag" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1218795555084">
          <property name="text" value="find all" />
          <link role="styleClass" targetNodeId="2.1186415544875" resolveInfo="KeyWord" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell" id="1218795568071">
          <link role="relationDeclaration" targetNodeId="1.1219753034317" />
          <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.structure.InlineEditorComponent" id="1218795568072">
            <link role="conceptDeclaration" targetNodeId="3.1169125787135" resolveInfo="AbstractConceptDeclaration" />
            <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1218795571418">
              <property name="readOnly" value="true" />
              <link role="relationDeclaration" targetNodeId="4.1169194664001" resolveInfo="name" />
              <node role="styleItem" type="jetbrains.mps.bootstrap.editorLanguage.structure.ForegroundColorStyleClassItem" id="1219310700640">
                <property name="color" value="DARK_MAGENTA" />
              </node>
            </node>
          </node>
        </node>
        <node role="styleItem" type="jetbrains.mps.bootstrap.editorLanguage.structure.SelectableStyleSheetItem" id="1218795552318">
          <property name="flag" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1218795577186">
        <property name="vertical" value="false" />
        <node role="styleItem" type="jetbrains.mps.bootstrap.editorLanguage.structure.SelectableStyleSheetItem" id="1218795577187">
          <property name="flag" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1218795912744">
          <property name="text" value="where" />
          <link role="styleClass" targetNodeId="2.1186415544875" resolveInfo="KeyWord" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1218795918684">
          <property name="vertical" value="true" />
          <node role="styleItem" type="jetbrains.mps.bootstrap.editorLanguage.structure.SelectableStyleSheetItem" id="1218795918685">
            <property name="flag" value="false" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1218795923674">
            <link role="relationDeclaration" targetNodeId="1.1219753024878" />
          </node>
          <node role="styleItem" type="jetbrains.mps.bootstrap.editorLanguage.structure.SelectableStyleSheetItem" id="1218795918687">
            <property name="flag" value="false" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1219745771774">
    <link role="conceptDeclaration" targetNodeId="1.1219745756351" resolveInfo="ReplaceQuery" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1219745786557">
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1219745786558">
        <property name="vertical" value="false" />
        <node role="styleItem" type="jetbrains.mps.bootstrap.editorLanguage.structure.SelectableStyleSheetItem" id="1219745786559">
          <property name="flag" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1219745786560">
          <property name="text" value="modify query" />
          <link role="styleClass" targetNodeId="2.1186415544875" resolveInfo="KeyWord" />
        </node>
        <node role="styleItem" type="jetbrains.mps.bootstrap.editorLanguage.structure.SelectableStyleSheetItem" id="1219745786561">
          <property name="flag" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1219745786562">
        <property name="vertical" value="false" />
        <node role="styleItem" type="jetbrains.mps.bootstrap.editorLanguage.structure.SelectableStyleSheetItem" id="1219745786563">
          <property name="flag" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1219745786564">
          <property name="text" value="with all" />
          <link role="styleClass" targetNodeId="2.1186415544875" resolveInfo="KeyWord" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell" id="1219745786565">
          <link role="relationDeclaration" targetNodeId="1.1219753034317" />
          <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.structure.InlineEditorComponent" id="1219745786566">
            <link role="conceptDeclaration" targetNodeId="3.1169125787135" resolveInfo="AbstractConceptDeclaration" />
            <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1219745786567">
              <property name="readOnly" value="true" />
              <link role="relationDeclaration" targetNodeId="4.1169194664001" resolveInfo="name" />
              <node role="styleItem" type="jetbrains.mps.bootstrap.editorLanguage.structure.ForegroundColorStyleClassItem" id="1219745786568">
                <property name="color" value="DARK_MAGENTA" />
              </node>
            </node>
          </node>
        </node>
        <node role="styleItem" type="jetbrains.mps.bootstrap.editorLanguage.structure.SelectableStyleSheetItem" id="1219745786569">
          <property name="flag" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1219748754002">
        <property name="vertical" value="true" />
        <property name="gridLayout" value="true" />
        <node role="styleItem" type="jetbrains.mps.bootstrap.editorLanguage.structure.SelectableStyleSheetItem" id="1219748754003">
          <property name="flag" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1219745786570">
          <property name="vertical" value="false" />
          <node role="styleItem" type="jetbrains.mps.bootstrap.editorLanguage.structure.SelectableStyleSheetItem" id="1219745786571">
            <property name="flag" value="false" />
          </node>
          <node role="styleItem" type="jetbrains.mps.bootstrap.editorLanguage.structure.SelectableStyleSheetItem" id="1219745786572">
            <property name="flag" value="false" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1219745786573">
            <property name="text" value="where" />
            <link role="styleClass" targetNodeId="2.1186415544875" resolveInfo="KeyWord" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1219745786574">
            <property name="vertical" value="true" />
            <node role="styleItem" type="jetbrains.mps.bootstrap.editorLanguage.structure.SelectableStyleSheetItem" id="1219745786575">
              <property name="flag" value="false" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1219745786576">
              <link role="relationDeclaration" targetNodeId="1.1219753024878" />
            </node>
            <node role="styleItem" type="jetbrains.mps.bootstrap.editorLanguage.structure.SelectableStyleSheetItem" id="1219745786577">
              <property name="flag" value="false" />
            </node>
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1219745830394">
          <property name="vertical" value="false" />
          <node role="styleItem" type="jetbrains.mps.bootstrap.editorLanguage.structure.SelectableStyleSheetItem" id="1219745830395">
            <property name="flag" value="false" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1219745852524">
            <property name="text" value="do" />
            <link role="styleClass" targetNodeId="2.1186415544875" resolveInfo="KeyWord" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1219746088754">
            <property name="vertical" value="true" />
            <node role="styleItem" type="jetbrains.mps.bootstrap.editorLanguage.structure.SelectableStyleSheetItem" id="1219746088755">
              <property name="flag" value="false" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1219746142479">
              <link role="relationDeclaration" targetNodeId="1.1219746108290" />
            </node>
            <node role="styleItem" type="jetbrains.mps.bootstrap.editorLanguage.structure.SelectableStyleSheetItem" id="1219746088757">
              <property name="flag" value="false" />
            </node>
          </node>
          <node role="styleItem" type="jetbrains.mps.bootstrap.editorLanguage.structure.SelectableStyleSheetItem" id="1219745830397">
            <property name="flag" value="false" />
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

