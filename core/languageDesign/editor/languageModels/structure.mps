<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:00000000-0000-4000-0000-011c8959029e(jetbrains.mps.lang.editor.structure)">
  <persistence version="7" />
  <language namespace="c72da2b9-7cce-4447-8389-f407dc1158b7(jetbrains.mps.lang.structure)" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="83888646-71ce-4f1c-9c53-c54016f6ad4f(jetbrains.mps.baseLanguage.collections)" />
  <language namespace="7866978e-a0f0-4cc7-81bc-4d213d9375e1(jetbrains.mps.lang.smodel)" />
  <language namespace="ceab5195-25ea-4f22-9b92-103b95ca8c0c(jetbrains.mps.lang.core)" />
  <language namespace="18bc6592-03a6-4e29-a83a-7ff23bde13ba(jetbrains.mps.lang.editor)" />
  <import index="yvnr" modelUID="r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.lang.structure.structure)" version="0" />
  <import index="yvnu" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" />
  <import index="yvor" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" />
  <import index="46vv" modelUID="f:java_stub#java.awt.event(java.awt.event@java_stub)" version="-1" />
  <import index="p1ge" modelUID="f:java_stub#jetbrains.mps.nodeEditor(jetbrains.mps.nodeEditor@java_stub)" version="-1" />
  <import index="vhgx" modelUID="f:java_stub#java.lang(java.lang@java_stub)" version="-1" />
  <import index="yvo0" modelUID="r:00000000-0000-4000-0000-011c895902bc(jetbrains.mps.lang.sharedConcepts.structure)" version="0" />
  <import index="t147" modelUID="f:java_stub#javax.swing(javax.swing@java_stub)" version="-1" />
  <import index="2uit" modelUID="f:java_stub#java.awt(java.awt@java_stub)" version="-1" />
  <import index="yvim" modelUID="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.lang.smodel.structure)" version="16" />
  <import index="fqow" modelUID="f:java_stub#jetbrains.mps.nodeEditor.style(jetbrains.mps.nodeEditor.style@java_stub)" version="-1" />
  <import index="yvjr" modelUID="r:00000000-0000-4000-0000-011c89590373(jetbrains.mps.baseLanguage.classifiers.structure)" version="0" />
  <import index="yvix" modelUID="r:00000000-0000-4000-0000-011c8959032e(jetbrains.mps.baseLanguage.collections.structure)" version="7" implicit="yes" />
  <import index="yvnl" modelUID="r:00000000-0000-4000-0000-011c8959029e(jetbrains.mps.lang.editor.structure)" version="32" implicit="yes" />
  <roots>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1071666914219">
      <property name="name" nameId="yvnu.1169194664001:0" value="ConceptEditorDeclaration" />
      <property name="iconPath" nameId="yvnr.1160488491229:0" value="${language_descriptor}\icons\editor.png" />
      <property name="rootable" nameId="yvnr.1096454100552:0" value="true" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1080736578640:32" resolveInfo="BaseEditorComponent" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1073389214265">
      <property name="name" nameId="yvnu.1169194664001:0" value="EditorCellModel" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellModel" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvnu.1133920641626:0" resolveInfo="BaseConcept" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1073389446423">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellModel_Collection" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellModel" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1073389214265:32" resolveInfo="EditorCellModel" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1073389577006">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellModel_Constant" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellModel" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1079353555532:32" resolveInfo="CellModel_AbstractLabel" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1073389658414">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellModel_Property" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellModel" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1139848536355:32" resolveInfo="CellModel_WithRole" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1073389882823">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellModel_RefNode" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellModel" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1139848536355:32" resolveInfo="CellModel_WithRole" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1073390211982">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellModel_RefNodeList" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellModel" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1140524381322:32" resolveInfo="CellModel_ListWithRole" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1074767920765">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellModel_ModelAccess" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellModel" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1079353555532:32" resolveInfo="CellModel_AbstractLabel" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1075375595203">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellModel_Error" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellModel" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1079353555532:32" resolveInfo="CellModel_AbstractLabel" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1078308402140">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellModel_Custom" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellModel" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1073389214265:32" resolveInfo="EditorCellModel" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1078938745671">
      <property name="name" nameId="yvnu.1169194664001:0" value="EditorComponentDeclaration" />
      <property name="iconPath" nameId="yvnr.1160488491229:0" value="${language_descriptor}\icons\editorComponent.png" />
      <property name="rootable" nameId="yvnr.1096454100552:0" value="true" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1080736578640:32" resolveInfo="BaseEditorComponent" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1078939183254">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellModel_Component" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellModel" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1073389214265:32" resolveInfo="EditorCellModel" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1079353555532">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellModel_AbstractLabel" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellModel" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1073389214265:32" resolveInfo="EditorCellModel" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1080736578640">
      <property name="name" nameId="yvnu.1169194664001:0" value="BaseEditorComponent" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1166049232041:32" resolveInfo="AbstractComponent" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1081293058843">
      <property name="iconPath" nameId="yvnr.1160488491229:0" value="${language_descriptor}\icons\keyMap.png" />
      <property name="rootable" nameId="yvnr.1096454100552:0" value="true" />
      <property name="name" nameId="yvnu.1169194664001:0" value="CellKeyMapDeclaration" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellKeyMap" />
    </node>
    <node type="yvnr.EnumerationDataTypeDeclaration" typeId="yvnr.1082978164219:0" id="1083928804390">
      <property name="name" nameId="yvnu.1169194664001:0" value="_YesNoDefault_Enum" />
      <link role="defaultMember" roleId="yvnr.1083241965437:0" targetNodeId="1083928804393:32" resolveInfo="none" />
      <link role="memberDataType" roleId="yvnr.1083171729157:0" targetNodeId="yvnu.1082983041843:0" />
    </node>
    <node type="yvnr.EnumerationDataTypeDeclaration" typeId="yvnr.1082978164219:0" id="1083952545109">
      <property name="name" nameId="yvnu.1169194664001:0" value="_Colors_Enum" />
      <link role="defaultMember" roleId="yvnr.1083241965437:0" targetNodeId="1083952545110:32" resolveInfo="none" />
      <link role="memberDataType" roleId="yvnr.1083171729157:0" targetNodeId="yvnu.1082983041843:0" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1088013125922">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellModel_RefCell" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellModel" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1139848536355:32" resolveInfo="CellModel_WithRole" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1088185857835">
      <property name="name" nameId="yvnu.1169194664001:0" value="InlineEditorComponent" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1080736578640:32" resolveInfo="BaseEditorComponent" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1088612959204">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellModel_Alternation" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellModel" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1073389214265:32" resolveInfo="EditorCellModel" />
    </node>
    <node type="yvnr.EnumerationDataTypeDeclaration" typeId="yvnr.1082978164219:0" id="1101211480448">
      <property name="name" nameId="yvnu.1169194664001:0" value="_FontStyle_Enum" />
      <link role="memberDataType" roleId="yvnr.1083171729157:0" targetNodeId="yvnu.1082983041843:0" />
      <link role="defaultMember" roleId="yvnr.1083241965437:0" targetNodeId="1134577855137:32" resolveInfo="plain" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1103016434866">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellModel_JComponent" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellModel" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1073389214265:32" resolveInfo="EditorCellModel" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1106270491082">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellLayout" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellLayout" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1106270549637">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellLayout_Horizontal" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellLayout" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1106270491082:32" resolveInfo="CellLayout" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1106270571710">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellLayout_Vertical" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellLayout" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1106270491082:32" resolveInfo="CellLayout" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1106270637846">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellLayout_Flow" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellLayout" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1106270491082:32" resolveInfo="CellLayout" />
    </node>
    <node type="yvnr.EnumerationDataTypeDeclaration" typeId="yvnr.1082978164219:0" id="1130847686886">
      <property name="name" nameId="yvnu.1169194664001:0" value="UnderlineStyle" />
      <link role="memberDataType" roleId="yvnr.1083171729157:0" targetNodeId="yvnu.1082983657062:0" />
      <link role="defaultMember" roleId="yvnr.1083241965437:0" targetNodeId="1130847686918:32" resolveInfo="as_is" />
    </node>
    <node type="yvnr.EnumerationDataTypeDeclaration" typeId="yvnr.1082978164219:0" id="1130926557197">
      <property name="name" nameId="yvnu.1169194664001:0" value="FocusPolicy" />
      <link role="memberDataType" roleId="yvnr.1083171729157:0" targetNodeId="yvnu.1082983657062:0" />
      <link role="defaultMember" roleId="yvnr.1083241965437:0" targetNodeId="1130926557292:32" resolveInfo="noAttraction" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1134379236839">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellModel_AttributedPropertyCell" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellModel" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1073389214265:32" resolveInfo="EditorCellModel" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1136564507907">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellModel_AttributedLinkCell" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellModel" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1073389214265:32" resolveInfo="EditorCellModel" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1136916919141">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellKeyMapItem" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellKeyMap" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1136916976737">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellKeyMapKeystroke" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellKeyMap" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvnu.1133920641626:0" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1136917155755">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellKeyMap_AbstractFunction" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellKeyMap" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1137021947720:3" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1136917249679">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellKeyMap_IsApplicableFunction" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellKeyMap" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1136917155755:32" resolveInfo="CellKeyMap_AbstractFunction" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1136917288805">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellKeyMap_ExecuteFunction" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellKeyMap" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1136917155755:32" resolveInfo="CellKeyMap_AbstractFunction" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1137553248617">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellModel_ConceptProperty" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellModel" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1139848536355:32" resolveInfo="CellModel_WithRole" />
    </node>
    <node type="yvnr.EnumerationDataTypeDeclaration" typeId="yvnr.1082978164219:0" id="1138197387103">
      <property name="name" nameId="yvnu.1169194664001:0" value="_Layout_Constraints_Enum" />
      <link role="memberDataType" roleId="yvnr.1083171729157:0" targetNodeId="yvnu.1082983041843:0" />
      <link role="defaultMember" roleId="yvnr.1083241965437:0" targetNodeId="1138197631095:32" resolveInfo="none" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1139535219966">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellActionMapDeclaration" />
      <property name="iconPath" nameId="yvnr.1160488491229:0" value="${language_descriptor}\icons\actionMap.png" />
      <property name="rootable" nameId="yvnr.1096454100552:0" value="true" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1139535280617">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellActionMapItem" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvnu.1133920641626:0" />
    </node>
    <node type="yvnr.EnumerationDataTypeDeclaration" typeId="yvnr.1082978164219:0" id="1139535328871">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellActionId" />
      <link role="memberDataType" roleId="yvnr.1083171729157:0" targetNodeId="yvnu.1082983041843:0" />
      <link role="defaultMember" roleId="yvnr.1083241965437:0" targetNodeId="1139535329028:32" resolveInfo="right_transform" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1139535439104">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellActionMap_ExecuteFunction" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1137021947720:3" />
    </node>
    <node type="yvnr.EnumerationDataTypeDeclaration" typeId="yvnr.1082978164219:0" id="1139744471051">
      <property name="name" nameId="yvnu.1169194664001:0" value="_ImageAlignment_Enum" />
      <link role="memberDataType" roleId="yvnr.1083171729157:0" targetNodeId="yvnu.1082983041843:0" />
      <link role="defaultMember" roleId="yvnr.1083241965437:0" targetNodeId="1139744471411:32" resolveInfo="alignmentJustify" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1139744628335">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellModel_Image" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellModel" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1073389214265:32" resolveInfo="EditorCellModel" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1139848536355">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellModel_WithRole" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellModel" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1079353555532:32" resolveInfo="CellModel_AbstractLabel" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1140524381322">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellModel_ListWithRole" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellModel" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1139848536355:32" resolveInfo="CellModel_WithRole" />
    </node>
    <node type="yvnr.EnumerationDataTypeDeclaration" typeId="yvnr.1082978164219:0" id="1140813780565">
      <property name="name" nameId="yvnu.1169194664001:0" value="RightTransformAnchorTag" />
      <link role="memberDataType" roleId="yvnr.1083171729157:0" targetNodeId="yvnu.1082983041843:0" />
      <link role="defaultMember" roleId="yvnr.1083241965437:0" targetNodeId="1140813780644:32" resolveInfo="none" />
    </node>
    <node type="yvnr.EnumerationDataTypeDeclaration" typeId="yvnr.1082978164219:0" id="1141091053936">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellKeyMapCaretPolicy" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellKeyMap" />
      <link role="memberDataType" roleId="yvnr.1083171729157:0" targetNodeId="yvnu.1082983041843:0" />
      <link role="defaultMember" roleId="yvnr.1083241965437:0" targetNodeId="1141091054266:32" resolveInfo="ANY_POSITION" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1142886221719">
      <property name="name" nameId="yvnu.1169194664001:0" value="QueryFunction_NodeCondition" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="QueryFunction" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1137021947720:3" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1142886811589">
      <property name="name" nameId="yvnu.1169194664001:0" value="ConceptFunctionParameter_node" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1107135704075:3" />
    </node>
    <node type="yvnr.EnumerationDataTypeDeclaration" typeId="yvnr.1082978164219:0" id="1143891911797">
      <property name="name" nameId="yvnu.1169194664001:0" value="_LeftRight_Enum" />
      <link role="memberDataType" roleId="yvnr.1083171729157:0" targetNodeId="yvnu.1082983657063:0" />
      <link role="defaultMember" roleId="yvnr.1083241965437:0" targetNodeId="1143891911798:32" resolveInfo="left" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1149850725784">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellModel_AttributedNodeCell" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellModel" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1073389214265:32" resolveInfo="EditorCellModel" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1160493135005">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellMenuPart_PropertyValues_GetValues" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellMenu" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1137021947720:3" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1161622981231">
      <property name="name" nameId="yvnu.1169194664001:0" value="ConceptFunctionParameter_editorContext" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1107135704075:3" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1162497113192">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellMenuPart_ReplaceChild_currentChild" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellMenu" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1107135704075:3" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1162498275506">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellMenuPart_ReplaceChild_defaultConceptOfChild" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellMenu" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1107135704075:3" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1163613035599">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellMenuPart_AbstractGroup_Query" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellMenu" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1137021947720:3" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1163613131943">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellMenuPart_ReplaceNode_Group_Create" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellMenu" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1137021947720:3" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1163613549566">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellMenuPart_AbstractGroup_parameterObject" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellMenu" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1107135704075:3" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1163613822479">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellMenuPart_Abstract_editedNode" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellMenu" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1107135704075:3" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1164052439493">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellMenuPart_AbstractGroup_MatchingText" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellMenu" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1137021947720:3" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1164052588708">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellMenuPart_AbstractGroup_DescriptionText" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellMenu" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1137021947720:3" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1164824717996">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellMenuDescriptor" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellMenu" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvnu.1133920641626:0" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1164824854750">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellMenuPart_Abstract" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellMenu" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvnu.1133920641626:0" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1164833692343">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellMenuPart_PropertyValues" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellMenu" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1164824854750:32" resolveInfo="CellMenuPart_Abstract" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1164914519156">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellMenuPart_ReplaceNode_CustomNodeConcept" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellMenu" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1164824854750:32" resolveInfo="CellMenuPart_Abstract" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1164996492011">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellMenuPart_ReferentPrimary" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellMenu" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1164824854750:32" resolveInfo="CellMenuPart_Abstract" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1165004207520">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellMenuPart_ReplaceNode_Group" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellMenu" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1165253627126:32" resolveInfo="CellMenuPart_AbstractGroup" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1165253627126">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellMenuPart_AbstractGroup" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellMenu" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1164824854750:32" resolveInfo="CellMenuPart_Abstract" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1165270418989">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellMenuPart_ReplaceChild_Group" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellMenu" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1165253627126:32" resolveInfo="CellMenuPart_AbstractGroup" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1165270662927">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellMenuPart_ReplaceChild_Group_Query" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellMenu" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1137021947720:3" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1165270999881">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellMenuPart_ReplaceChild_Group_Create" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellMenu" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1137021947720:3" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1165280503630">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellMenuPart_ReplaceChild_CustomChildConcept" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellMenu" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1164824854750:32" resolveInfo="CellMenuPart_Abstract" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1165280856333">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellMenuPart_ReplaceChild_CustomChildConcept_Query" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellMenu" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1137021947720:3" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1165339175678">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellMenuPart_ReplaceChild_Item" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellMenu" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1164824854750:32" resolveInfo="CellMenuPart_Abstract" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1165339307433">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellMenuPart_ReplaceChild_Item_Create" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellMenu" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1137021947720:3" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1165420413719">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellMenuPart_Generic_Group" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellMenu" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1165253627126:32" resolveInfo="CellMenuPart_AbstractGroup" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1165420626554">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellMenuPart_Generic_Group_Handler" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellMenu" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1137021947720:3" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1165424453110">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellMenuPart_Generic_Item" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellMenu" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1164824854750:32" resolveInfo="CellMenuPart_Abstract" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1165424657443">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellMenuPart_Generic_Item_Handler" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellMenu" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1137021947720:3" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1166040637528">
      <property name="iconPath" nameId="yvnr.1160488491229:0" value="${language_descriptor}\icons\menuComponent.png" />
      <property name="rootable" nameId="yvnr.1096454100552:0" value="true" />
      <property name="name" nameId="yvnu.1169194664001:0" value="CellMenuComponent" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellMenu" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1166049232041:32" resolveInfo="AbstractComponent" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1166041033436">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellMenuComponentFeature" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellMenu" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvnu.1133920641626:0" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1166041748520">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellMenuComponentFeature_Property" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellMenu" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1166041033436:32" resolveInfo="CellMenuComponentFeature" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1166042131867">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellMenuComponentFeature_Link" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellMenu" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1166041033436:32" resolveInfo="CellMenuComponentFeature" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1166049232041">
      <property name="name" nameId="yvnu.1169194664001:0" value="AbstractComponent" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1166059625718">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellMenuPart_CellMenuComponent" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellMenu" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1164824854750:32" resolveInfo="CellMenuPart_Abstract" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1174088067129">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellMenuPart_ReplaceChildPrimary" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellMenu" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1164824854750:32" resolveInfo="CellMenuPart_Abstract" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1176474535556">
      <property name="name" nameId="yvnu.1169194664001:0" value="QueryFunction_JComponent" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="QueryFunction" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1137021947720:3" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1176717779940">
      <property name="name" nameId="yvnu.1169194664001:0" value="ConceptFunctionParameter_text" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1107135704075:3" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1176717841777">
      <property name="name" nameId="yvnu.1169194664001:0" value="QueryFunction_ModelAccess_Getter" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="QueryFunction" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1137021947720:3" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1176717871254">
      <property name="name" nameId="yvnu.1169194664001:0" value="QueryFunction_ModelAccess_Setter" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="QueryFunction" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1137021947720:3" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1176717888428">
      <property name="name" nameId="yvnu.1169194664001:0" value="QueryFunction_ModelAccess_Validator" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="QueryFunction" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1137021947720:3" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1176717996748">
      <property name="name" nameId="yvnu.1169194664001:0" value="ModelAccessor" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvnu.1133920641626:0" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1176731909317">
      <property name="name" nameId="yvnu.1169194664001:0" value="ConceptFunctionParameter_oldText" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1107135704075:3" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1176749715029">
      <property name="name" nameId="yvnu.1169194664001:0" value="QueryFunction_CellProvider" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="QueryFunction" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1137021947720:3" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1176809959526">
      <property name="name" nameId="yvnu.1169194664001:0" value="QueryFunction_Color" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="QueryFunction.Style" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1221059528506:32" resolveInfo="QueryFunction_StyleParameter" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1176897764478">
      <property name="name" nameId="yvnu.1169194664001:0" value="QueryFunction_NodeFactory" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="QueryFunction" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1137021947720:3" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1176899348742">
      <property name="name" nameId="yvnu.1169194664001:0" value="QueryFunction_ImagePath" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="QueryFunction" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1137021947720:3" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1180615838666">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellMenuPart_PropertyPostfixHints" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellMenu" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1164824854750:32" resolveInfo="CellMenuPart_Abstract" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1180616057533">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellMenuPart_PropertyPostfixHints_GetPostfixes" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellMenu" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1137021947720:3" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1182191800432">
      <property name="name" nameId="yvnu.1169194664001:0" value="QueryFunction_NodeListFilter" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="QueryFunction" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1137021947720:3" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1182233249301">
      <property name="name" nameId="yvnu.1169194664001:0" value="ConceptFunctionParameter_childNode" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1107135704075:3" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1184319644772">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellModel_NonEmptyProperty" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellModel" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1073389658414:32" resolveInfo="CellModel_Property" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1186402211651">
      <property name="name" nameId="yvnu.1169194664001:0" value="StyleSheet" />
      <property name="rootable" nameId="yvnr.1096454100552:0" value="true" />
      <property name="iconPath" nameId="yvnr.1160488491229:0" value="${language_descriptor}\icons\editorStylesheet.png" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvnu.1133920641626:0" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1186402373407">
      <property name="name" nameId="yvnu.1169194664001:0" value="StyleSheetClass" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvnu.1133920641626:0" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1186402475462">
      <property name="name" nameId="yvnu.1169194664001:0" value="StyleClassItem" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvnu.1133920641626:0" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1186403694788">
      <property name="name" nameId="yvnu.1169194664001:0" value="ColorStyleClassItem" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1186402475462:32" resolveInfo="StyleClassItem" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1186403751766">
      <property name="name" nameId="yvnu.1169194664001:0" value="FontStyleStyleClassItem" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1186402475462:32" resolveInfo="StyleClassItem" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1186404549998">
      <property name="name" nameId="yvnu.1169194664001:0" value="ForegroundColorStyleClassItem" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1186403694788:32" resolveInfo="ColorStyleClassItem" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1186404574412">
      <property name="name" nameId="yvnu.1169194664001:0" value="BackgroundColorStyleClassItem" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1186403694788:32" resolveInfo="ColorStyleClassItem" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1186413799158">
      <property name="name" nameId="yvnu.1169194664001:0" value="BracketColorStyleClassItem" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1186403694788:32" resolveInfo="ColorStyleClassItem" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1186414536763">
      <property name="name" nameId="yvnu.1169194664001:0" value="BooleanStyleSheetItem" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1186402475462:32" resolveInfo="StyleClassItem" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1186414928363">
      <property name="name" nameId="yvnu.1169194664001:0" value="SelectableStyleSheetItem" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1186414536763:32" resolveInfo="BooleanStyleSheetItem" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1186414949600">
      <property name="name" nameId="yvnu.1169194664001:0" value="AutoDeletableStyleClassItem" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1186414536763:32" resolveInfo="BooleanStyleSheetItem" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1186414976055">
      <property name="name" nameId="yvnu.1169194664001:0" value="DrawBorderStyleClassItem" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1186414536763:32" resolveInfo="BooleanStyleSheetItem" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1186414999511">
      <property name="name" nameId="yvnu.1169194664001:0" value="UnderlinedStyleClassItem" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1186402475462:32" resolveInfo="StyleClassItem" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1186415722038">
      <property name="name" nameId="yvnu.1169194664001:0" value="FontSizeStyleClassItem" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1186402475462:32" resolveInfo="StyleClassItem" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1186414860679">
      <property name="name" nameId="yvnu.1169194664001:0" value="EditableStyleClassItem" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1186414536763:32" resolveInfo="BooleanStyleSheetItem" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1187258617779">
      <property name="name" nameId="yvnu.1169194664001:0" value="ForegroundNullColorStyleClassItem" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1186403694788:32" resolveInfo="ColorStyleClassItem" />
    </node>
    <node type="yvnr.EnumerationDataTypeDeclaration" typeId="yvnr.1082978164219:0" id="1197893505573">
      <property name="name" nameId="yvnu.1169194664001:0" value="_CaretPosition_Enum" />
      <link role="memberDataType" roleId="yvnr.1083171729157:0" targetNodeId="yvnu.1082983041843:0" resolveInfo="string" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1198252130653">
      <property name="name" nameId="yvnu.1169194664001:0" value="StyleSheetClassReference" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvnu.1133920641626:0" resolveInfo="BaseConcept" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1198256887712">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellModel_Indent" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellModel" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1073389214265:32" resolveInfo="EditorCellModel" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1198257632966">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellModel_BlockStart" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellModel" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1073389214265:32" resolveInfo="EditorCellModel" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1198257747917">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellModel_BlockEnd" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellModel" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1073389214265:32" resolveInfo="EditorCellModel" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1198489924438">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellModel_Block" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellModel" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1073389214265:32" resolveInfo="EditorCellModel" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1201265905111">
      <property name="name" nameId="yvnu.1169194664001:0" value="SelectOperation" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="SNode" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvim.1138411891628:16" resolveInfo="SNodeOperation" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1201266127262">
      <property name="name" nameId="yvnu.1169194664001:0" value="SelectParameter" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="SNode" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvnu.1133920641626:0" resolveInfo="BaseConcept" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1201268783309">
      <property name="name" nameId="yvnu.1169194664001:0" value="SelectPositionParameter" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="SNode" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1201266127262:32" resolveInfo="SelectLaterParameter" />
    </node>
    <node type="yvnr.EnumerationDataTypeDeclaration" typeId="yvnr.1082978164219:0" id="1201268793545">
      <property name="name" nameId="yvnu.1169194664001:0" value="SelectPosition" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="SNode" />
      <link role="memberDataType" roleId="yvnr.1083171729157:0" targetNodeId="yvnu.1082983041843:0" resolveInfo="string" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1201270864927">
      <property name="name" nameId="yvnu.1169194664001:0" value="CaretPositionParameter" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="SNode" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1201266127262:32" resolveInfo="SelectLaterParameter" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1214317859050">
      <property name="name" nameId="yvnu.1169194664001:0" value="LayoutConstraintStyleClassItem" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1186402475462:32" resolveInfo="StyleClassItem" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1214320119173">
      <property name="name" nameId="yvnu.1169194664001:0" value="SideTransformAnchorTagStyleClassItem" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1186402475462:32" resolveInfo="StyleClassItem" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1214406454886">
      <property name="name" nameId="yvnu.1169194664001:0" value="TextBackgroundColorStyleClassItem" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1186403694788:32" resolveInfo="ColorStyleClassItem" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1214406466686">
      <property name="name" nameId="yvnu.1169194664001:0" value="TextBackgroundColorSelectedStyleClassItem" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1186403694788:32" resolveInfo="ColorStyleClassItem" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1214472762472">
      <property name="name" nameId="yvnu.1169194664001:0" value="DefaultCaretPositionStyleClassItem" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1186402475462:32" resolveInfo="StyleClassItem" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1215007762405">
      <property name="name" nameId="yvnu.1169194664001:0" value="FloatStyleClassItem" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1186402475462:32" resolveInfo="StyleClassItem" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1215007883204">
      <property name="name" nameId="yvnu.1169194664001:0" value="PaddingLeftStyleClassItem" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet.Paddings" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1226339938453:32" resolveInfo="PaddingStyleClassItem" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1215007897487">
      <property name="name" nameId="yvnu.1169194664001:0" value="PaddingRightStyleClassItem" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet.Paddings" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1226339938453:32" resolveInfo="AbstractPaddingStyleClassItem" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1215085112640">
      <property name="name" nameId="yvnu.1169194664001:0" value="FirstPositionAllowedStyleClassItem" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1186414536763:32" resolveInfo="BooleanStyleSheetItem" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1215085197271">
      <property name="name" nameId="yvnu.1169194664001:0" value="LastPositionAllowedStyleClassItem" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1186414536763:32" resolveInfo="BooleanStyleSheetItem" />
    </node>
    <node type="yvnr.EnumerationDataTypeDeclaration" typeId="yvnr.1082978164219:0" id="1216308376568">
      <property name="name" nameId="yvnu.1169194664001:0" value="_NextLine_Enum" />
      <link role="memberDataType" roleId="yvnr.1083171729157:0" targetNodeId="yvnu.1082983041843:0" resolveInfo="string" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1216308599511">
      <property name="name" nameId="yvnu.1169194664001:0" value="PositionStyleClassItem" />
      <property name="rootable" nameId="yvnr.1096454100552:0" value="false" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1186402475462:32" resolveInfo="StyleClassItem" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1216380990741">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellModel_TransactionalProperty" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellModel" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1079353555532:32" resolveInfo="CellModel_AbstractLabel" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1216381054717">
      <property name="name" nameId="yvnu.1169194664001:0" value="TransactionalPropertyHandler" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="QueryFunction" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1137021947720:3" resolveInfo="ConceptFunction" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1216381117100">
      <property name="name" nameId="yvnu.1169194664001:0" value="TransactionPropertyHandler_oldValue" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="QueryFunction" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1107135704075:3" resolveInfo="ConceptFunctionParameter" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1216381148013">
      <property name="name" nameId="yvnu.1169194664001:0" value="TransactionPropertyHandler_newValue" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="QueryFunction" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1107135704075:3" resolveInfo="ConceptFunctionParameter" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1216560327200">
      <property name="name" nameId="yvnu.1169194664001:0" value="PositionChildrenStyleClassItem" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1186402475462:32" resolveInfo="StyleClassItem" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1216672142186">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellLayout_Indent_Old" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellLayout" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1106270491082:32" resolveInfo="CellLayout" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1219226236603">
      <property name="name" nameId="yvnu.1169194664001:0" value="DrawBracketsStyleClassItem" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1186414536763:32" resolveInfo="BooleanStyleSheetItem" />
    </node>
    <node type="yvnr.InterfaceConceptDeclaration" typeId="yvnr.1169125989551:0" id="1219418625346">
      <property name="name" nameId="yvnu.1169194664001:0" value="IStyleContainer" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1220974635399">
      <property name="name" nameId="yvnu.1169194664001:0" value="QueryFunction_FontStyle" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="QueryFunction.Style" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1221059528506:32" resolveInfo="QueryFunction_StyleParameter" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1221057094638">
      <property name="name" nameId="yvnu.1169194664001:0" value="QueryFunction_Integer" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="QueryFunction.Style" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1221059528506:32" resolveInfo="QueryFunction_StyleParameter" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1221059528506">
      <property name="name" nameId="yvnu.1169194664001:0" value="QueryFunction_StyleParameter" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="QueryFunction.Style" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1137021947720:3" resolveInfo="ConceptFunction" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1221062700015">
      <property name="name" nameId="yvnu.1169194664001:0" value="QueryFunction_Underlined" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="QueryFunction.Style" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1221059528506:32" resolveInfo="QueryFunction_StyleParameter" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1223386653097">
      <property name="name" nameId="yvnu.1169194664001:0" value="StrikeOutStyleSheet" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1186414536763:32" resolveInfo="BooleanStyleSheetItem" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1223387125302">
      <property name="name" nameId="yvnu.1169194664001:0" value="QueryFunction_Boolean" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="QueryFunction.Style" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1221059528506:32" resolveInfo="QueryFunction_StyleParameter" />
    </node>
    <node type="yvnr.InterfaceConceptDeclaration" typeId="yvnr.1169125989551:0" id="1225456097782">
      <property name="name" nameId="yvnu.1169194664001:0" value="IQueryFunction_Color" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="QueryFunction.Style" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1225456267680">
      <property name="name" nameId="yvnu.1169194664001:0" value="RGBColor" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvnu.1133920641626:0" resolveInfo="BaseConcept" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1225898583838">
      <property name="name" nameId="yvnu.1169194664001:0" value="ReadOnlyModelAccessor" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvnu.1133920641626:0" resolveInfo="BaseConcept" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1225900081164">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellModel_ReadOnlyModelAccessor" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellModel" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1079353555532:32" resolveInfo="CellModel_AbstractLabel" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1226339751946">
      <property name="name" nameId="yvnu.1169194664001:0" value="PaddingTopStyleClassItem" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet.Paddings" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1226339938453:32" resolveInfo="AbstractPaddingStyleClassItem" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1226339813308">
      <property name="name" nameId="yvnu.1169194664001:0" value="PaddingBottomStyleClassItem" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet.Paddings" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1226339938453:32" resolveInfo="AbstractPaddingStyleClassItem" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1226339938453">
      <property name="name" nameId="yvnu.1169194664001:0" value="AbstractPaddingStyleClassItem" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet.Paddings" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1215007762405:32" resolveInfo="FloatStyleClassItem" />
    </node>
    <node type="yvnr.EnumerationDataTypeDeclaration" typeId="yvnr.1082978164219:0" id="1226504633752">
      <property name="name" nameId="yvnu.1169194664001:0" value="_Enum_Measure" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet.Paddings" />
      <link role="memberDataType" roleId="yvnr.1083171729157:0" targetNodeId="yvnu.1082983041843:0" resolveInfo="string" />
      <link role="defaultMember" roleId="yvnr.1083241965437:0" targetNodeId="1226504706052:32" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1227861515039">
      <property name="name" nameId="yvnu.1169194664001:0" value="NavigatableReferenceStyleClassItem" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1186402475462:32" resolveInfo="StyleClassItem" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1233148810477">
      <property name="name" nameId="yvnu.1169194664001:0" value="InlineStyleDeclaration" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvnu.1133920641626:0" resolveInfo="BaseConcept" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1233758997495">
      <property name="name" nameId="yvnu.1169194664001:0" value="PunctuationLeftStyleClassItem" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1186414536763:32" resolveInfo="BooleanStyleSheetItem" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1233759184865">
      <property name="name" nameId="yvnu.1169194664001:0" value="PunctuationRightStyleClassItem" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1186414536763:32" resolveInfo="BooleanStyleSheetItem" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1233823429331">
      <property name="name" nameId="yvnu.1169194664001:0" value="HorizontalGapStyleClassItem" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet.Paddings" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1226339938453:32" resolveInfo="AbstractPaddingStyleClassItem" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1235728439575">
      <property name="name" nameId="yvnu.1169194664001:0" value="BaseLineCell" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1186414536763:32" resolveInfo="BooleanStyleSheetItem" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1235999440492">
      <property name="name" nameId="yvnu.1169194664001:0" value="HorizontalAlign" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1186402475462:32" resolveInfo="StyleClassItem" />
    </node>
    <node type="yvnr.EnumerationDataTypeDeclaration" typeId="yvnr.1082978164219:0" id="1235999709834">
      <property name="name" nameId="yvnu.1169194664001:0" value="AlignEnum" />
      <link role="memberDataType" roleId="yvnr.1083171729157:0" targetNodeId="yvnu.1082983041843:0" resolveInfo="string" />
      <link role="defaultMember" roleId="yvnr.1083241965437:0" targetNodeId="1235999709835:32" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1236262245656">
      <property name="name" nameId="yvnu.1169194664001:0" value="MatchingLabelStyleClassItem" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1186402475462:32" resolveInfo="StyleClassItem" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1236263696991">
      <property name="name" nameId="yvnu.1169194664001:0" value="QueryFunction_MatchingNode" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="QueryFunction" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1137021947720:3" resolveInfo="ConceptFunction" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1236443640684">
      <property name="name" nameId="yvnu.1169194664001:0" value="QueryFunction_String" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="QueryFunction" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1137021947720:3" resolveInfo="ConceptFunction" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1237303669825">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellLayout_Indent" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellLayout" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1106270491082:32" resolveInfo="CellLayout" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1237307900041">
      <property name="name" nameId="yvnu.1169194664001:0" value="IndentLayoutIndentStyleClassItem" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet.IndentLayout" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1186414536763:32" resolveInfo="BooleanStyleSheetItem" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1237308012275">
      <property name="name" nameId="yvnu.1169194664001:0" value="IndentLayoutNewLineStyleClassItem" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet.IndentLayout" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1186414536763:32" resolveInfo="BooleanStyleSheetItem" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1237375020029">
      <property name="name" nameId="yvnu.1169194664001:0" value="IndentLayoutNewLineChildrenStyleClassItem" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet.IndentLayout" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1186414536763:32" resolveInfo="BooleanStyleSheetItem" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1237385578942">
      <property name="name" nameId="yvnu.1169194664001:0" value="IndentLayoutOnNewLineStyleClassItem" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet.IndentLayout" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1186414536763:32" resolveInfo="BooleanStyleSheetItem" />
    </node>
    <node type="yvnr.ConstrainedDataTypeDeclaration" typeId="yvnr.1082978499127:0" id="1239805001815">
      <property name="name" nameId="yvnu.1169194664001:0" value="_FloatOrInteger_String" />
      <property name="constraint" nameId="yvnr.1083066089218:0" value="-?[0-9]+\\.?[0-9]*" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet.Paddings" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1239814640496">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellLayout_VerticalGrid" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellLayout" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1106270571710:32" resolveInfo="CellLayout_Vertical" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1240253180846">
      <property name="name" nameId="yvnu.1169194664001:0" value="IndentLayoutNoWrapClassItem" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet.IndentLayout" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1186414536763:32" resolveInfo="BooleanStyleSheetItem" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="625126330682908270">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellModel_ReferencePresentation" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellModel" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1073389214265:32" resolveInfo="EditorCellModel" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="7667276221847570194">
      <property name="name" nameId="yvnu.1169194664001:0" value="ParametersInformationStyleClassItem" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1186402475462:32" resolveInfo="StyleClassItem" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="7667276221847612622">
      <property name="name" nameId="yvnu.1169194664001:0" value="ParametersInformationQuery" />
      <property name="rootable" nameId="yvnr.1096454100552:0" value="true" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="MethodParameters" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvnu.1133920641626:0" resolveInfo="BaseConcept" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="7667276221847612943">
      <property name="name" nameId="yvnu.1169194664001:0" value="QueryFunction_ParametersList" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="MethodParameters" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1137021947720:3" resolveInfo="ConceptFunction" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="671290755174094686">
      <property name="name" nameId="yvnu.1169194664001:0" value="QueryFunction_MethodPresentation" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="MethodParameters" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1137021947720:3" resolveInfo="ConceptFunction" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="671290755174094691">
      <property name="name" nameId="yvnu.1169194664001:0" value="ConceptFunctionParameter_parameterObject" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="MethodParameters" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1107135704075:3" resolveInfo="ConceptFunctionParameter" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="6419604448124516209">
      <property name="name" nameId="yvnu.1169194664001:0" value="QueryFunction_IsMethodCurrent" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="MethodParameters" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1137021947720:3" resolveInfo="ConceptFunction" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="4526149749187797167">
      <property name="name" nameId="yvnu.1169194664001:0" value="ConceptFunctionParameter_StyledText" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="MethodParameters" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1107135704075:3" resolveInfo="ConceptFunctionParameter" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="280151408461567367">
      <property name="name" nameId="yvnu.1169194664001:0" value="AppendTextOperation" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="MethodParameters" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="4531786690998636238:32" resolveInfo="AbstractOperation" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="280151408461909164">
      <property name="name" nameId="yvnu.1169194664001:0" value="SetBoldOperation" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="MethodParameters" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="4531786690998636238:32" resolveInfo="AbstractOperation" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="4531786690998636238">
      <property name="name" nameId="yvnu.1169194664001:0" value="AbstractStyledTextOperation" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="MethodParameters" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvnu.1133920641626:0" resolveInfo="BaseConcept" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="3903367331818357915">
      <property name="name" nameId="yvnu.1169194664001:0" value="StyledTextType" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="MethodParameters" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1068431790189:3" resolveInfo="Type" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="7620205565664569937">
      <property name="name" nameId="yvnu.1169194664001:0" value="DefaultBaseLine" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1186402475462:32" resolveInfo="StyleClassItem" />
    </node>
    <node type="yvnr.EnumerationDataTypeDeclaration" typeId="yvnr.1082978164219:0" id="7620205565664606377">
      <property name="name" nameId="yvnu.1169194664001:0" value="DefaultBaseLineEnum" />
      <link role="memberDataType" roleId="yvnr.1083171729157:0" targetNodeId="yvnu.1082983041843:0" resolveInfo="string" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1886960078078641793">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellLayout_Superscript" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellLayout" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1106270491082:32" resolveInfo="CellLayout" />
    </node>
    <node type="yvnr.EnumerationDataTypeDeclaration" typeId="yvnr.1082978164219:0" id="8255250703325730686">
      <property name="name" nameId="yvnu.1169194664001:0" value="ScriptSwitchEnum" />
      <link role="memberDataType" roleId="yvnr.1083171729157:0" targetNodeId="yvnu.1082983041843:0" resolveInfo="string" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="8255250703325731016">
      <property name="name" nameId="yvnu.1169194664001:0" value="ScriptKindClassItem" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1186402475462:32" resolveInfo="StyleClassItem" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="4203201205844553978">
      <property name="name" nameId="yvnu.1169194664001:0" value="ConceptFunctionParameter_selectedNode" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="MethodParameters" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1107135704075:3" resolveInfo="ConceptFunctionParameter" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="5949640294884234625">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellLayout_Table" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellLayout" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1106270491082:32" resolveInfo="CellLayout" />
    </node>
    <node type="yvnr.EnumerationDataTypeDeclaration" typeId="yvnr.1082978164219:0" id="6820251943131810951">
      <property name="name" nameId="yvnu.1169194664001:0" value="TableComponentEnum" />
      <link role="memberDataType" roleId="yvnr.1083171729157:0" targetNodeId="yvnu.1082983041843:0" resolveInfo="string" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="6820251943131810950">
      <property name="name" nameId="yvnu.1169194664001:0" value="TableComponentStyleClassItem" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1186402475462:32" resolveInfo="StyleClassItem" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="8313721352726366579">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellModel_Empty" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellModel" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1073389214265:32" resolveInfo="EditorCellModel" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="7597241200646296617">
      <property name="name" nameId="yvnu.1169194664001:0" value="NavigatableNodeStyleClassItem" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="Stylesheet" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1186402475462:32" resolveInfo="StyleClassItem" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="7597241200646296619">
      <property name="name" nameId="yvnu.1169194664001:0" value="QueryFunction_SNode" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="QueryFunction.Style" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1221059528506:32" resolveInfo="QueryFunction_StyleParameter" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="3696012239575138270">
      <property name="name" nameId="yvnu.1169194664001:0" value="CellModel_URL" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="CellModel" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="1139848536355:32" resolveInfo="CellModel_WithRole" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="3608226089191997415">
      <property name="name" nameId="yvnu.1169194664001:0" value="RightTransformAnchorTagWrapper" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvnu.1133920641626:0" resolveInfo="BaseConcept" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="709996738298806197">
      <property name="name" nameId="yvnu.1169194664001:0" value="QueryFunction_SeparatorText" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="QueryFunction" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1137021947720:3" resolveInfo="ConceptFunction" />
    </node>
  </roots>
  <root id="1071666914219">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1078153129734">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="0..1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="inspectedCellModel" />
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1073389214265:32" resolveInfo="EditorCellModel" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1158938128496">
      <property name="value" nameId="yvnr.1105725733873:0" value="concept editor" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="1210369064378">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="yvnu.1169194658468:0" resolveInfo="INamedConcept" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="2621449412040149672">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="yvnr.2621449412040133764:0" resolveInfo="ConceptAspect" />
    </node>
  </root>
  <root id="1073389214265">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1119645550923">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473854053:0" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1142887637401">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="0..1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="renderingCondition" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1142886221719:32" resolveInfo="QueryFunction_NodeCondition" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1139959269582">
      <property name="role" nameId="yvnr.1071599776563:0" value="actionMap" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1139535219966:32" resolveInfo="CellActionMapDeclaration" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1081339532145">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="0..1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="keyMap" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1081293058843:32" resolveInfo="CellKeyMapDeclaration" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1186406756722">
      <property name="role" nameId="yvnr.1071599776563:0" value="styleClass" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1186402373407:32" resolveInfo="StyleSheetClass" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1164826688380">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="menuDescriptor" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1164824717996:32" resolveInfo="CellMenuDescriptor" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1176810465151">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="cellBackgroundFunction" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1176809959526:32" resolveInfo="QueryFunction_Color" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1198512004906">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="focusPolicyApplicable" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1142886221719:32" resolveInfo="QueryFunction_NodeCondition" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1130859485024">
      <property name="name" nameId="yvnu.1169194664001:0" value="attractsFocus" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="1130926557197:32" resolveInfo="FocusPolicy" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="1219418770234">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="1219418625346:32" resolveInfo="IStyleContainer" />
    </node>
  </root>
  <root id="1073389446423">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1073389446424">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="0..n" />
      <property name="role" nameId="yvnr.1071599776563:0" value="childCellModel" />
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1073389214265:32" resolveInfo="EditorCellModel" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="7723470090030138869">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="foldedCellModel" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1073389214265:32" resolveInfo="EditorCellModel" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1106270802874">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="0..1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="cellLayout" />
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1106270491082:32" resolveInfo="CellLayout" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="8709572687796959088">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="usesFoldingCondition" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1142886221719:32" resolveInfo="QueryFunction_NodeCondition" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1073389446425">
      <property name="name" nameId="yvnu.1169194664001:0" value="vertical" />
      <property name="propertyType" value="boolean" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983657063:0" />
      <node role="deprecatedNode$attribute" type="yvnr.DeprecatedNodeAnnotation" typeId="yvnr.1224240836180:0" id="1239869892471">
        <property name="comment" nameId="yvnr.1225118933224:0" value="Use isVertical()" />
      </node>
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1073389446426">
      <property name="name" nameId="yvnu.1169194664001:0" value="gridLayout" />
      <property name="propertyType" value="boolean" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983657063:0" />
      <node role="deprecatedNode$attribute" type="yvnr.DeprecatedNodeAnnotation" typeId="yvnr.1224240836180:0" id="1239869894921">
        <property name="comment" nameId="yvnr.1225118933224:0" value="Use isVerticalGrid()" />
      </node>
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1139416841293">
      <property name="name" nameId="yvnu.1169194664001:0" value="usesBraces" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983657063:0" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1160590353935">
      <property name="name" nameId="yvnu.1169194664001:0" value="usesFolding" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983657063:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1107223377702">
      <property name="value" nameId="yvnr.1105725733873:0" value="collection" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1107223377703">
      <property name="value" nameId="yvnr.1105725733873:0" value="collection of cells" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
  </root>
  <root id="1073389577006">
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1073389577007">
      <property name="name" nameId="yvnu.1169194664001:0" value="text" />
      <property name="propertyType" value="string" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983041843:0" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1082639509531">
      <property name="name" nameId="yvnu.1169194664001:0" value="nullText" />
      <property name="propertyType" value="string" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983041843:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1107223377704">
      <property name="value" nameId="yvnr.1105725733873:0" value="constant" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1107223377705">
      <property name="value" nameId="yvnr.1105725733873:0" value="text label" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
  </root>
  <root id="1073389658414">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1073389964684">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="propertyDeclaration" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvnr.1071489288299:0" />
      <link role="specializedLink" roleId="yvnr.1071599698500:0" targetNodeId="1140103550593:32" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1107223377706">
      <property name="value" nameId="yvnr.1105725733873:0" value="{&lt;{propertyDeclaration}&gt;}" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1180268756546">
      <property name="value" nameId="yvnr.1105725733873:0" value="property" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
  </root>
  <root id="1073389882823">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1073389882824">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="linkDeclaration" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvnr.1071489288298:0" />
      <link role="specializedLink" roleId="yvnr.1071599698500:0" targetNodeId="1140103550593:32" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1180297564460">
      <property name="value" nameId="yvnr.1105725733873:0" value="%&lt;{linkDeclaration}&gt;%" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1180298340765">
      <property name="value" nameId="yvnr.1105725733873:0" value="single aggregation" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
  </root>
  <root id="1073390211982">
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1145360728033">
      <property name="name" nameId="yvnu.1169194664001:0" value="reverse" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983657063:0" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1073390211987">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="linkDeclaration" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvnr.1071489288298:0" />
      <link role="specializedLink" roleId="yvnr.1071599698500:0" targetNodeId="1140103550593:32" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1165347032372">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="elementMenuDescriptor" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1164824717996:32" resolveInfo="CellMenuDescriptor" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1173177718857">
      <property name="role" nameId="yvnr.1071599776563:0" value="elementActionMap" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1139535219966:32" resolveInfo="CellActionMapDeclaration" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1182233390675">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="filter" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1182191800432:32" resolveInfo="QueryFunction_NodeListFilter" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1107223377710">
      <property name="value" nameId="yvnr.1105725733873:0" value="%&lt;{linkDeclaration}&gt;%" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1180298374005">
      <property name="value" nameId="yvnr.1105725733873:0" value="multiple aggregation" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
  </root>
  <root id="1074767920765">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1176718152741">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="modelAcessor" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1176717996748:32" resolveInfo="ModelAccessor" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1082638248796">
      <property name="name" nameId="yvnu.1169194664001:0" value="nullText" />
      <property name="propertyType" value="string" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983041843:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1107223377711">
      <property name="value" nameId="yvnr.1105725733873:0" value="model access" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1107223377712">
      <property name="value" nameId="yvnr.1105725733873:0" value="reference to accessor" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
  </root>
  <root id="1075375595203">
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1075375595204">
      <property name="name" nameId="yvnu.1169194664001:0" value="text" />
      <property name="propertyType" value="string" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983041843:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1107223377713">
      <property name="value" nameId="yvnr.1105725733873:0" value="error" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1107223377714">
      <property name="value" nameId="yvnr.1105725733873:0" value="red text label" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
  </root>
  <root id="1078308402140">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1176795024817">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="cellProvider" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1176749715029:32" resolveInfo="QueryFunction_CellProvider" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1107223377720">
      <property name="value" nameId="yvnr.1105725733873:0" value="custom" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1107223377721">
      <property name="value" nameId="yvnr.1105725733873:0" value="reference to cell provider" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
  </root>
  <root id="1078938745671">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1158938178950">
      <property name="value" nameId="yvnr.1105725733873:0" value="editor component" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="1210369055138">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="yvnu.1169194658468:0" resolveInfo="INamedConcept" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="5270353093116097894">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="yvnr.2621449412040133764:0" resolveInfo="IConceptAspect" />
    </node>
  </root>
  <root id="1078939183254">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1078939183255">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="editorComponent" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1078938745671:32" resolveInfo="EditorComponentDeclaration" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1107223377722">
      <property name="value" nameId="yvnr.1105725733873:0" value="component" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1107223377723">
      <property name="value" nameId="yvnr.1105725733873:0" value="reference to editor component" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
  </root>
  <root id="1079353555532">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1176889772388">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="cellForegroundFunction" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1176809959526:32" resolveInfo="QueryFunction_Color" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1185888338931">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="textForegroundEmptyFunction" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1176809959526:32" resolveInfo="QueryFunction_Color" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1185888173839">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="textBackgroundFunction" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1176809959526:32" resolveInfo="QueryFunction_Color" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1185888320335">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="textBgColorSelectedFunction" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1176809959526:32" resolveInfo="QueryFunction_Color" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1119646130993">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473854053:0" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1197893615481">
      <property name="name" nameId="yvnu.1169194664001:0" value="defaultCaretPosition" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="1197893505573:32" resolveInfo="_DefaultCaretPosition_Enum" />
    </node>
  </root>
  <root id="1080736578640">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1080736633877">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="cellModel" />
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1073389214265:32" resolveInfo="EditorCellModel" />
    </node>
  </root>
  <root id="1081293058843">
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="1173470710781">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="yvnu.1169194658468:0" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="5270353093116096533">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="yvnr.2621449412040133764:0" resolveInfo="IConceptAspect" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1149937560128">
      <property name="name" nameId="yvnu.1169194664001:0" value="everyModel" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983657063:0" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1139445935125">
      <property name="role" nameId="yvnr.1071599776563:0" value="applicableConcept" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvnr.1169125787135:0" resolveInfo="AbstractConceptDeclaration" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1136930944870">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="0..n" />
      <property name="role" nameId="yvnr.1071599776563:0" value="item" />
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1136916919141:32" resolveInfo="CellKeyMapItem" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1158938229201">
      <property name="value" nameId="yvnr.1105725733873:0" value="cell keymap" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
  </root>
  <root id="1083928804390">
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1083928804391">
      <property name="name" value="yes" />
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="yes" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="true" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1083928804392">
      <property name="name" value="no" />
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="no" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="false" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1083928804393">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="none" />
    </node>
  </root>
  <root id="1083952545109">
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1083952545110">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="none" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1083952545111">
      <property name="name" value="red" />
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="red" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="red" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1083952545112">
      <property name="name" value="pink" />
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="pink" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="pink" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1083952545113">
      <property name="name" value="orange" />
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="orange" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="orange" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1083952545114">
      <property name="name" value="yellow" />
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="yellow" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="yellow" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1083952545115">
      <property name="name" value="green" />
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="green" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="green" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1101213169706">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="darkGreen" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="DARK_GREEN" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1083952545116">
      <property name="name" value="magenta" />
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="magenta" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="magenta" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1101213185757">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="darkMagenta" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="DARK_MAGENTA" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1083952545117">
      <property name="name" value="cyan" />
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="cyan" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="cyan" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1083952545118">
      <property name="name" value="blue" />
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="blue" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="blue" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1216404713420">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="lightBlue" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="LIGHT_BLUE" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1101209985304">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="darkBlue" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="DARK_BLUE" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1084208529765">
      <property name="name" value="gray" />
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="gray" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="gray" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1084208529766">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="lightGray" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="lightGray" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1084208529767">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="darkGray" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="darkGray" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1214395400259">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="white" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="WHITE" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="7151630269404055096">
      <property name="name" value="blue" />
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="black" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="black" />
    </node>
  </root>
  <root id="1088013125922">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1088013239202">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="linkDeclaration" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvnr.1071489288298:0" />
      <link role="specializedLink" roleId="yvnr.1071599698500:0" targetNodeId="1140103550593:32" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1088186146602">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="editorComponent" />
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1088185857835:32" resolveInfo="InlineEditorComponent" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1180296391450">
      <property name="value" nameId="yvnr.1105725733873:0" value="%&lt;{linkDeclaration}&gt;%-&gt;" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1180298302748">
      <property name="value" nameId="yvnr.1105725733873:0" value="reference" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
  </root>
  <root id="1088185857835">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1107223377726">
      <property name="value" nameId="yvnr.1105725733873:0" value="in-line editor component" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
  </root>
  <root id="1088612959204">
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1088613081987">
      <property name="name" nameId="yvnu.1169194664001:0" value="vertical" />
      <property name="propertyType" value="boolean" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983657063:0" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1145918517974">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="alternationCondition" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1142886221719:32" resolveInfo="QueryFunction_NodeCondition" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1088612958265">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="ifTrueCellModel" />
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1073389214265:32" resolveInfo="EditorCellModel" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1088612973955">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="ifFalseCellModel" />
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1073389214265:32" resolveInfo="EditorCellModel" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1107223377727">
      <property name="value" nameId="yvnr.1105725733873:0" value="alternation" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1107223377728">
      <property name="value" nameId="yvnr.1105725733873:0" value="cell alternation" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
  </root>
  <root id="1101211480448">
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1101211523070">
      <property name="name" value="bold" />
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="bold" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="BOLD" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1101211542532">
      <property name="name" value="italic" />
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="italic" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="ITALIC" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1101213960346">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="boldItalic" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="BOLD_ITALIC" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1134577855137">
      <property name="name" value="plain" />
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="plain" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="PLAIN" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1220973684614">
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="QUERY" />
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="query" />
    </node>
  </root>
  <root id="1103016434866">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1176475119347">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="componentProvider" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1176474535556:32" resolveInfo="QueryFunction_JComponent" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1137941825015">
      <property name="value" nameId="yvnr.1105725733873:0" value="swing component" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
  </root>
  <root id="1106270491082">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1235226217430">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473854053:0" resolveInfo="abstract" />
    </node>
  </root>
  <root id="1106270549637">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1235227714767">
      <property name="value" nameId="yvnr.1105725733873:0" value="horizontal" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="1106270571710">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1235227746009">
      <property name="value" nameId="yvnr.1105725733873:0" value="vertical" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="1106270637846">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1235227699406">
      <property name="value" nameId="yvnr.1105725733873:0" value="flow" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="1130847686886">
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1130847686918">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="as_is" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="0" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1130847816499">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="not_underlined" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="1" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1130847833453">
      <property name="name" value="underlined" />
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="underlined" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="2" />
    </node>
  </root>
  <root id="1130926557197">
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1130926557292">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="noAttraction" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="0" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1130926591919">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="attractsFocus" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="1" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1130926603060">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="firstEditableCell" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="2" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1227082414196">
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="3" />
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="attractsRecursively" />
    </node>
  </root>
  <root id="1134379236839">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1134380148394">
      <property name="value" nameId="yvnr.1105725733873:0" value="attributed property" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1134380159646">
      <property name="value" nameId="yvnr.1105725733873:0" value="cell for attributed property" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
  </root>
  <root id="1136564507907">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1136564532725">
      <property name="value" nameId="yvnr.1105725733873:0" value="attributed link" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1136564532726">
      <property name="value" nameId="yvnr.1105725733873:0" value="cell for attributed link" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
  </root>
  <root id="1136916919141">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1136916998332">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1..n" />
      <property name="role" nameId="yvnr.1071599776563:0" value="keystroke" />
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1136916976737:32" resolveInfo="CellKeyMapKeystroke" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1136917325338">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="0..1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="isApplicableFunction" />
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1136917249679:32" resolveInfo="CellKeyMap_IsApplicableFunction" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1136920925604">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="executeFunction" />
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1136917288805:32" resolveInfo="CellKeyMap_ExecuteFunction" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1136916941877">
      <property name="name" nameId="yvnu.1169194664001:0" value="description" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983041843:0" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1141091278922">
      <property name="name" nameId="yvnu.1169194664001:0" value="caretPolicy" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="1141091053936:32" resolveInfo="CellKeyMapCaretPolicy" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1163507208434">
      <property name="name" nameId="yvnu.1169194664001:0" value="showInPopup" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983657063:0" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1184322083615">
      <property name="name" nameId="yvnu.1169194664001:0" value="menuAlwaysShown" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983657063:0" />
    </node>
  </root>
  <root id="1136916976737">
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1136923970223">
      <property name="name" nameId="yvnu.1169194664001:0" value="modifiers" />
      <property name="propertyType" value="string" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983041843:0" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1136923970224">
      <property name="name" nameId="yvnu.1169194664001:0" value="keycode" />
      <property name="propertyType" value="string" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983041843:0" />
    </node>
  </root>
  <root id="1136917155755">
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1161630184985">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1161622981231:32" resolveInfo="ConceptFunctionParameter_editorContext" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1137189922872">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1137546998352:3" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1137189922873">
        <property name="name" nameId="yvnu.1169194664001:0" value="CellKeyMap_FunctionParm_selectedNode" />
        <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1107135704075:3" />
        <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1137189922876">
          <property name="value" nameId="yvnr.1105725733873:0" value="node" />
          <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
        </node>
        <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1137189922877">
          <property name="value" nameId="yvnr.1105725733873:0" value="keymap function parameter" />
          <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
        </node>
      </node>
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1189582551383">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1137546998352:3" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1189582551384">
        <property name="name" nameId="yvnu.1169194664001:0" value="CellKeyMap_FunctionParm_selectedNodes" />
        <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1107135704075:3" />
        <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1189582551385">
          <property name="value" nameId="yvnr.1105725733873:0" value="selectedNodes" />
          <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
        </node>
        <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1189582551386">
          <property name="value" nameId="yvnr.1105725733873:0" value="keymap function parameter" />
          <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
        </node>
      </node>
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1143487952335">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1137546998352:3" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1143487955383">
        <property name="name" nameId="yvnu.1169194664001:0" value="CellKeyMap_FunctionParm_keyEvent" />
        <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1107135704075:3" />
        <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1143490306697">
          <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1137545963098:3" />
          <node role="target" roleId="yvnr.1105736901241:0" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1143490313729">
            <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="46vv.~KeyEvent" resolveInfo="KeyEvent" />
          </node>
        </node>
        <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1143488564542">
          <property name="value" nameId="yvnr.1105725733873:0" value="keyEvent" />
          <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
        </node>
        <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1143488601967">
          <property name="value" nameId="yvnr.1105725733873:0" value="keymap function parameter" />
          <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
        </node>
      </node>
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1136917182663">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473854053:0" />
    </node>
  </root>
  <root id="1136917249679">
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1137545690489">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1137545148427:3" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.BooleanType" typeId="yvor.1070534644030:3" id="1141871296431" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1158958783311">
      <property name="value" nameId="yvnr.1105725733873:0" value="is applicable block" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
  </root>
  <root id="1136917288805">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1158958837093">
      <property name="value" nameId="yvnr.1105725733873:0" value="execute block" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
  </root>
  <root id="1137553248617">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1137553248621">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="propertyDeclaration" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvnr.1105725006687:0" />
      <link role="specializedLink" roleId="yvnr.1071599698500:0" targetNodeId="1140103550593:32" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1137553248622">
      <property name="value" nameId="yvnr.1105725733873:0" value="{{&lt;{propertyDeclaration}&gt;}}" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1180269136114">
      <property name="value" nameId="yvnr.1105725733873:0" value="concept property" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
  </root>
  <root id="1138197387103">
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1138197387339">
      <property name="name" value="punctuation" />
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="punctuation" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="punctuation" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1138197619454">
      <property name="name" value="noflow" />
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="noflow" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="noflow" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1138197631095">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="none" />
    </node>
  </root>
  <root id="1139535219966">
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="1173470751204">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="yvnu.1169194658468:0" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="5270353093116090437">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="yvnr.2621449412040133764:0" resolveInfo="IConceptAspect" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1139535219968">
      <property name="role" nameId="yvnr.1071599776563:0" value="applicableConcept" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvnr.1169125787135:0" resolveInfo="AbstractConceptDeclaration" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1139535219969">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="0..n" />
      <property name="role" nameId="yvnr.1071599776563:0" value="item" />
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1139535280617:32" resolveInfo="CellActionMapItem" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1158938242046">
      <property name="value" nameId="yvnr.1105725733873:0" value="cell action map" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
  </root>
  <root id="1139535280617">
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1139537298254">
      <property name="name" nameId="yvnu.1169194664001:0" value="description" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983041843:0" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1139535298778">
      <property name="name" nameId="yvnu.1169194664001:0" value="actionId" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="1139535328871:32" resolveInfo="CellActionId" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1139535280620">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="executeFunction" />
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1139535439104:32" resolveInfo="CellActionMap_ExecuteFunction" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1185875612566">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473994950:0" />
    </node>
  </root>
  <root id="1139535328871">
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1139535329028">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="RIGHT_TRANSFORM" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="right_transform_action_id" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1139535387060">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="DELETE" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="delete_action_id" />
    </node>
  </root>
  <root id="1139535439104">
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1161630496596">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1161622981231:32" resolveInfo="ConceptFunctionParameter_editorContext" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1139535439111">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1137546998352:3" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1139535439112">
        <property name="name" nameId="yvnu.1169194664001:0" value="CellActionMap_FunctionParm_selectedNode" />
        <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1107135704075:3" />
        <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1139535439113">
          <property name="value" nameId="yvnr.1105725733873:0" value="node" />
          <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
        </node>
        <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1139535439114">
          <property name="value" nameId="yvnr.1105725733873:0" value="selected node (action map function parameter)" />
          <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
        </node>
      </node>
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1158959403408">
      <property name="value" nameId="yvnr.1105725733873:0" value="execute block" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
  </root>
  <root id="1139744471051">
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1139744471411">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="alignmentJustify" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="justify" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1139744531598">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="alignmentCenter" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="center" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1139744545740">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="alignmentTile" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="tile" />
    </node>
  </root>
  <root id="1139744628335">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1176899909521">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="imagePathProvider" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1176899348742:32" resolveInfo="QueryFunction_ImagePath" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1139746504291">
      <property name="name" nameId="yvnu.1169194664001:0" value="imageFile" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983041843:0" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1139858284555">
      <property name="name" nameId="yvnu.1169194664001:0" value="descent" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983657062:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1139746404569">
      <property name="value" nameId="yvnr.1105725733873:0" value="image" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1139746422633">
      <property name="value" nameId="yvnr.1105725733873:0" value="cell for an image" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
  </root>
  <root id="1139848536355">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1139849308084">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473854053:0" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1139852716018">
      <property name="name" nameId="yvnu.1169194664001:0" value="noTargetText" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983041843:0" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1214560368769">
      <property name="name" nameId="yvnu.1169194664001:0" value="emptyNoTargetText" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983657063:0" resolveInfo="boolean" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1140017977771">
      <property name="name" nameId="yvnu.1169194664001:0" value="readOnly" />
      <property name="propertyType" value="boolean" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983657063:0" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1140114345053">
      <property name="name" nameId="yvnu.1169194664001:0" value="allowEmptyText" />
      <property name="propertyType" value="boolean" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983657063:0" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1140103550593">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="relationDeclaration" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvnu.1133920641626:0" />
    </node>
  </root>
  <root id="1140524381322">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1140524467909">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473854053:0" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1176897874615">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="nodeFactory" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1176897764478:32" resolveInfo="QueryFunction_NodeFactory" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1140524464359">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="0..1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="emptyCellModel" />
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1073389214265:32" resolveInfo="EditorCellModel" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="6046489571270834038">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="foldedCellModel" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1073389214265:32" resolveInfo="EditorCellModel" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1140524464360">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="0..1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="cellLayout" />
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1106270491082:32" resolveInfo="CellLayout" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1233141163694">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="separatorStyle" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1233148810477:32" resolveInfo="InlineStyleDeclaration" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="928328222691832421">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="separatorTextQuery" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="709996738298806197:32" resolveInfo="QueryFunction_SeparatorText" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="4601216887035799527">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="usesFoldingCondition" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1142886221719:32" resolveInfo="QueryFunction_NodeCondition" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1140524450554">
      <property name="name" nameId="yvnu.1169194664001:0" value="vertical" />
      <property name="propertyType" value="boolean" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983657063:0" />
      <node role="deprecatedNode$attribute" type="yvnr.DeprecatedNodeAnnotation" typeId="yvnr.1224240836180:0" id="1239873962700" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1140524450555">
      <property name="name" nameId="yvnu.1169194664001:0" value="gridLayout" />
      <property name="propertyType" value="boolean" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983657063:0" />
      <node role="deprecatedNode$attribute" type="yvnr.DeprecatedNodeAnnotation" typeId="yvnr.1224240836180:0" id="1239873964974" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1140524450556">
      <property name="name" nameId="yvnu.1169194664001:0" value="usesBraces" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983657063:0" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1160590307797">
      <property name="name" nameId="yvnu.1169194664001:0" value="usesFolding" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983657063:0" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1140524450557">
      <property name="name" nameId="yvnu.1169194664001:0" value="separatorText" />
      <property name="propertyType" value="string" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983041843:0" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1156252885376">
      <property name="name" nameId="yvnu.1169194664001:0" value="separatorLayoutConstraint" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="1138197387103:32" resolveInfo="_Layout_Constraints_Enum" />
    </node>
  </root>
  <root id="1140813780565">
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1140813780644">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="none" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1140813835051">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="default_" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="default_RTransform" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1140813898505">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="ext_1" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="ext_1_RTransform" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1140813939727">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="ext_2" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="ext_2_RTransform" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1140813947731">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="ext_3" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="ext_3_RTransform" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1140813957048">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="ext_4" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="ext_4_RTransform" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1140813967505">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="ext_5" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="ext_5_RTransform" />
    </node>
  </root>
  <root id="1141091053936">
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1141091054266">
      <property name="name" value="ANY_POSITION" />
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="ANY_POSITION" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1141091172402">
      <property name="name" value="FIRST_POSITION" />
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="FIRST_POSITION" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="caret_at_first_position" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1141091209420">
      <property name="name" value="LAST_POSITION" />
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="LAST_POSITION" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="caret_at_last_position" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1143573566373">
      <property name="name" value="INTERMEDIATE_POSITION" />
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="INTERMEDIATE_POSITION" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="caret_at_intermediate_position" />
    </node>
  </root>
  <root id="1142886221719">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1145652669910">
      <property name="value" nameId="yvnr.1105725733873:0" value="condition" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1145665848571">
      <property name="value" nameId="yvnr.1105725733873:0" value="embedded block of code" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1142886758850">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1137545148427:3" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.BooleanType" typeId="yvor.1070534644030:3" id="1142886762757" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1161627665731">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="yvo0.1161622878565:0" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1183571201975">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1161622981231:32" resolveInfo="ConceptFunctionParameter_editorContext" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1176473889746">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1142886811589:32" resolveInfo="ConceptFunctionParameter_node" />
    </node>
  </root>
  <root id="1142886811589">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1142886811590">
      <property name="value" nameId="yvnr.1105725733873:0" value="node" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1142886811591">
      <property name="value" nameId="yvnr.1105725733873:0" value="function parameter" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1176492724289">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473994950:0" />
    </node>
  </root>
  <root id="1143891911797">
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1143891911798">
      <property name="name" value="left" />
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="left" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="true" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1143891954220">
      <property name="name" value="right" />
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="right" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="false" />
    </node>
  </root>
  <root id="1149850725784">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1149850757778">
      <property name="value" nameId="yvnr.1105725733873:0" value="attributed node" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1149850757779">
      <property name="value" nameId="yvnr.1105725733873:0" value="cell for attributed node" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
  </root>
  <root id="1160493135005">
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1160500373903">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1137545148427:3" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvix.ListType" typeId="yvix.1151688443754:7" id="1160674633356">
        <node role="elementType" roleId="yvix.1151688676805:7" type="yvor.StringType" typeId="yvor.1225271177708:3" id="1225191493854" />
      </node>
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1161629196402">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="yvo0.1161622878565:0" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1161629292561">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="yvo0.1161622753914:0" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1164848564365">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1163613822479:32" resolveInfo="CellMenuPart_Abstract_editedNode" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1160493189132">
      <property name="value" nameId="yvnr.1105725733873:0" value="property values" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
  </root>
  <root id="1161622981231">
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1161622981232">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1137545963098:3" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1161622981233">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="p1ge.~EditorContext" resolveInfo="EditorContext" />
      </node>
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1161622981234">
      <property name="value" nameId="yvnr.1105725733873:0" value="editorContext" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1161622981235">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473994950:0" />
    </node>
  </root>
  <root id="1162497113192">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1162497113193">
      <property name="value" nameId="yvnr.1105725733873:0" value="currentChild" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1162497113194">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473994950:0" />
    </node>
  </root>
  <root id="1162498275506">
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1162498325651">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1137545963098:3" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1162498330044">
        <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvnr.1071489090640:0" />
      </node>
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1162498275507">
      <property name="value" nameId="yvnr.1105725733873:0" value="defaultConceptOfChild" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1162498275508">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473994950:0" />
    </node>
  </root>
  <root id="1163613035599">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1163613035600">
      <property name="value" nameId="yvnr.1105725733873:0" value="get objects" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1178647877855">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1137545148427:3" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvix.ListType" typeId="yvix.1151688443754:7" id="1178647881515">
        <node role="elementType" roleId="yvix.1151688676805:7" type="yvor.WildCardType" typeId="yvor.1171903607971:3" id="1178647886236" />
      </node>
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1163613035601">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1163613822479:32" resolveInfo="CellMenuPart_Abstract_editedNode" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1163613035604">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="yvo0.1161622878565:0" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1163613035605">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="yvo0.1161622753914:0" />
    </node>
  </root>
  <root id="1163613131943">
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1163711457917">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1137545148427:3" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1163711460075" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1163613131944">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1163613549566:32" resolveInfo="CellMenuPart_AbstractGroup_parameterObject" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1163613915977">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1163613822479:32" resolveInfo="CellMenuPart_Abstract_editedNode" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1163613131948">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="yvo0.1161622665029:0" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1163613131949">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="yvo0.1161622878565:0" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1163613131950">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="yvo0.1161622753914:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1163613131951">
      <property name="value" nameId="yvnr.1105725733873:0" value="create replacement node" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
  </root>
  <root id="1163613549566">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1163613549567">
      <property name="value" nameId="yvnr.1105725733873:0" value="parameterObject" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1163613549568">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473994950:0" />
    </node>
  </root>
  <root id="1163613822479">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1163613822480">
      <property name="value" nameId="yvnr.1105725733873:0" value="node" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1163613822481">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473994950:0" />
    </node>
  </root>
  <root id="1164052439493">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1164052439494">
      <property name="value" nameId="yvnr.1105725733873:0" value="matching text" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1164052439495">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1137545148427:3" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.StringType" typeId="yvor.1225271177708:3" id="1225191500317" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1164052439497">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1163613549566:32" resolveInfo="CellMenuPart_AbstractGroup_parameterObject" />
    </node>
  </root>
  <root id="1164052588708">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1164052588709">
      <property name="value" nameId="yvnr.1105725733873:0" value="description text" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1164052588710">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1137545148427:3" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.StringType" typeId="yvor.1225271177708:3" id="1225191499704" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1164052588712">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1163613549566:32" resolveInfo="CellMenuPart_AbstractGroup_parameterObject" />
    </node>
  </root>
  <root id="1164824717996">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1164824815888">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="0..n" />
      <property name="role" nameId="yvnr.1071599776563:0" value="cellMenuPart" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1164824854750:32" resolveInfo="CellMenuPart_Abstract" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1164826227425">
      <property name="value" nameId="yvnr.1105725733873:0" value="cell menu" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
  </root>
  <root id="1164824854750">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1164824871502">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473854053:0" />
    </node>
  </root>
  <root id="1164833692343">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1164833692344">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="valuesFunction" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1160493135005:32" resolveInfo="CellMenuPart_PropertyValues_GetValues" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1199894803096">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473994950:0" resolveInfo="dontSubstituteByDefault" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1164833692345">
      <property name="value" nameId="yvnr.1105725733873:0" value="property values" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
  </root>
  <root id="1164914519156">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1164914727930">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="replacementConcept" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvnr.1071489090640:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1164914519158">
      <property name="value" nameId="yvnr.1105725733873:0" value="replace node (custom node concept)" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
  </root>
  <root id="1164996492011">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1199894998166">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473994950:0" resolveInfo="dontSubstituteByDefault" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1164996492013">
      <property name="value" nameId="yvnr.1105725733873:0" value="primary choose referent menu" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
  </root>
  <root id="1165004207520">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1165004529292">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="parametersFunction" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1163613035599:32" resolveInfo="CellMenuPart_AbstractGroup_Query" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1165004529293">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="createFunction" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1163613131943:32" resolveInfo="CellMenuPart_ReplaceNode_Group_Create" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1165004207522">
      <property name="value" nameId="yvnr.1105725733873:0" value="replace node (group of custom actions)" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
  </root>
  <root id="1165253627126">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1165253627127">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473854053:0" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1165253890469">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="parameterObjectType" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068431790189:3" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1165254125954">
      <property name="name" nameId="yvnu.1169194664001:0" value="presentation" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvo0.1165007009656:0" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1165254159533">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="matchingTextFunction" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1164052439493:32" resolveInfo="CellMenuPart_AbstractGroup_MatchingText" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1165254180581">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="descriptionTextFunction" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1164052588708:32" resolveInfo="CellMenuPart_AbstractGroup_DescriptionText" />
    </node>
  </root>
  <root id="1165270418989">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1165270418991">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="parametersFunction" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1165270662927:32" resolveInfo="CellMenuPart_ReplaceChild_Group_Query" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1165270418992">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="createFunction" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1165270999881:32" resolveInfo="CellMenuPart_ReplaceChild_Group_Create" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1199895090639">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473994950:0" resolveInfo="dontSubstituteByDefault" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1165270418995">
      <property name="value" nameId="yvnr.1105725733873:0" value="replace child (group of custom actions)" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
  </root>
  <root id="1165270662927">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1165270662928">
      <property name="value" nameId="yvnr.1105725733873:0" value="get objects" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1165270662929">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1163613822479:32" resolveInfo="CellMenuPart_Abstract_editedNode" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1165270662930">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1162497113192:32" resolveInfo="CellMenuPart_ReplaceChild_currentChild" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1165270662931">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1162498275506:32" resolveInfo="CellMenuPart_ReplaceChild_defaultConceptOfChild" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1165270662932">
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="yvo0.1161622878565:0" />
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1165270662933">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="yvo0.1161622753914:0" />
    </node>
  </root>
  <root id="1165270999881">
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1165270999882">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1163613549566:32" resolveInfo="CellMenuPart_AbstractGroup_parameterObject" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1165270999883">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1163613822479:32" resolveInfo="CellMenuPart_Abstract_editedNode" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1165270999884">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1162497113192:32" resolveInfo="CellMenuPart_ReplaceChild_currentChild" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1165270999885">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1162498275506:32" resolveInfo="CellMenuPart_ReplaceChild_defaultConceptOfChild" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1165270999886">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="yvo0.1161622665029:0" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1165270999887">
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="yvo0.1161622878565:0" />
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1165270999888">
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="yvo0.1161622753914:0" />
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1165270999889">
      <property name="value" nameId="yvnr.1105725733873:0" value="create new child" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
  </root>
  <root id="1165280503630">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1165280503631">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="childConceptFunction" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1165280856333:32" resolveInfo="CellMenuPart_ReplaceChild_CustomChildConcept_Query" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1199895114478">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473994950:0" resolveInfo="dontSubstituteByDefault" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1165280503632">
      <property name="value" nameId="yvnr.1105725733873:0" value="replace child (custom child's concept)" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
  </root>
  <root id="1165280856333">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1165280856334">
      <property name="value" nameId="yvnr.1105725733873:0" value="get child concept" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1165280856335">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1137545148427:3" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1165280856336">
        <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvnr.1071489090640:0" />
      </node>
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1165280856337">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1163613822479:32" resolveInfo="CellMenuPart_Abstract_editedNode" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1165280856338">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1162497113192:32" resolveInfo="CellMenuPart_ReplaceChild_currentChild" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1165280856339">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1162498275506:32" resolveInfo="CellMenuPart_ReplaceChild_defaultConceptOfChild" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1165280856340">
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="yvo0.1161622878565:0" />
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1165280856341">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="yvo0.1161622753914:0" />
    </node>
  </root>
  <root id="1165339175678">
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1165339639991">
      <property name="name" nameId="yvnu.1169194664001:0" value="matchingText" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983041843:0" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1175117579502">
      <property name="name" nameId="yvnu.1169194664001:0" value="descriptionText" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983041843:0" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1165339175680">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="createFunction" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1165339307433:32" resolveInfo="CellMenuPart_ReplaceChild_Item_Create" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1199895109786">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473994950:0" resolveInfo="dontSubstituteByDefault" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1165339175681">
      <property name="value" nameId="yvnr.1105725733873:0" value="replace child (custom action)" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
  </root>
  <root id="1165339307433">
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1165339307434">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1163613822479:32" resolveInfo="CellMenuPart_Abstract_editedNode" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1165339437299">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1162497113192:32" resolveInfo="CellMenuPart_ReplaceChild_currentChild" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1165339437300">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1162498275506:32" resolveInfo="CellMenuPart_ReplaceChild_defaultConceptOfChild" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1165339307435">
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="yvo0.1161622665029:0" />
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1165339307436">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="yvo0.1161622878565:0" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1165339307437">
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="yvo0.1161622753914:0" />
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
    </node>
  </root>
  <root id="1165420413719">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1165420413720">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="parametersFunction" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1163613035599:32" resolveInfo="CellMenuPart_AbstractGroup_Query" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1165420413721">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="handlerFunction" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1165420626554:32" resolveInfo="CellMenuPart_Generic_Group_Handler" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1165420413722">
      <property name="value" nameId="yvnr.1105725733873:0" value="generic group" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
  </root>
  <root id="1165420626554">
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1165420626557">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1163613549566:32" resolveInfo="CellMenuPart_AbstractGroup_parameterObject" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1165420626558">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1163613822479:32" resolveInfo="CellMenuPart_Abstract_editedNode" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1165420626559">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="yvo0.1161622665029:0" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1165420626560">
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="yvo0.1161622878565:0" />
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1165420626561">
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="yvo0.1161622753914:0" />
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="2265407187494681810">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" resolveInfo="applicableConceptFunctionParameter" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1161622981231:32" resolveInfo="ConceptFunctionParameter_editorContext" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1165420626562">
      <property name="value" nameId="yvnr.1105725733873:0" value="generic handler" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
  </root>
  <root id="1165424453110">
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1165424453111">
      <property name="name" nameId="yvnu.1169194664001:0" value="matchingText" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983041843:0" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1165424453112">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="handlerFunction" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1165424657443:32" resolveInfo="CellMenuPart_Generic_Item_Handler" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1165424453113">
      <property name="value" nameId="yvnr.1105725733873:0" value="generic item" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
  </root>
  <root id="1165424657443">
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1165424657444">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1163613822479:32" resolveInfo="CellMenuPart_Abstract_editedNode" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1165424657447">
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="yvo0.1161622665029:0" />
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1165424657448">
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="yvo0.1161622878565:0" />
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1165424657449">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="yvo0.1161622753914:0" />
    </node>
  </root>
  <root id="1166040637528">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1166040865497">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="applicableFeature" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1166041033436:32" resolveInfo="CellMenuComponentFeature" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1166041505377">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="menuDescriptor" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1164824717996:32" resolveInfo="CellMenuDescriptor" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1166047295586">
      <property name="value" nameId="yvnr.1105725733873:0" value="cell menu component" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="1210369041997">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="yvnu.1169194658468:0" resolveInfo="INamedConcept" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="5270353093116097656">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="yvnr.2621449412040133764:0" resolveInfo="IConceptAspect" />
    </node>
  </root>
  <root id="1166041033436">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1166054297096">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="relationDeclaration" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvnu.1133920641626:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1166041079437">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473854053:0" />
    </node>
  </root>
  <root id="1166041748520">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1166041884271">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="propertyDeclaration" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvnr.1071489288299:0" />
      <link role="specializedLink" roleId="yvnr.1071599698500:0" targetNodeId="1166054297096:32" />
    </node>
  </root>
  <root id="1166042131867">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1166042131869">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="linkDeclaration" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvnr.1071489288298:0" />
      <link role="specializedLink" roleId="yvnr.1071599698500:0" targetNodeId="1166054297096:32" />
    </node>
  </root>
  <root id="1166049232041">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1166049251808">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473854053:0" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1166049300910">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="0..1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="conceptDeclaration" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvnr.1169125787135:0" />
    </node>
  </root>
  <root id="1166059625718">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1166059677893">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="cellMenuComponent" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1166040637528:32" resolveInfo="CellMenuComponent" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1166059625736">
      <property name="value" nameId="yvnr.1105725733873:0" value="menu component" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
  </root>
  <root id="1174088067129">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1199895105514">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473994950:0" resolveInfo="dontSubstituteByDefault" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1174088067130">
      <property name="value" nameId="yvnr.1105725733873:0" value="primary replace child menu" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
  </root>
  <root id="1176474535556">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1176474588488">
      <property name="value" nameId="yvnr.1105725733873:0" value="component" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1176474596599">
      <property name="value" nameId="yvnr.1105725733873:0" value="embedded block of code" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1176474617542">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1137545148427:3" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1176474640436">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="t147.~JComponent" resolveInfo="JComponent" />
      </node>
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1176474644923">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1161622981231:32" resolveInfo="ConceptFunctionParameter_editorContext" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1176474658345">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1142886811589:32" resolveInfo="ConceptFunctionParameter_node" />
    </node>
  </root>
  <root id="1176717779940">
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1176717792086">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1137545963098:3" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.StringType" typeId="yvor.1225271177708:3" id="1225191485527" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1176717779941">
      <property name="value" nameId="yvnr.1105725733873:0" value="text" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1176717779942">
      <property name="value" nameId="yvnr.1105725733873:0" value="function parameter" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1176717779943">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473994950:0" />
    </node>
  </root>
  <root id="1176717841777">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1176717841778">
      <property name="value" nameId="yvnr.1105725733873:0" value="condition" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1176717841779">
      <property name="value" nameId="yvnr.1105725733873:0" value="embedded block of code" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1176717841780">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1137545148427:3" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.StringType" typeId="yvor.1225271177708:3" id="1225191497093" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1176717841782">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1161622981231:32" resolveInfo="ConceptFunctionParameter_editorContext" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1176717841783">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1142886811589:32" resolveInfo="ConceptFunctionParameter_node" />
    </node>
  </root>
  <root id="1176717871254">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1176717871255">
      <property name="value" nameId="yvnr.1105725733873:0" value="condition" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1176717871256">
      <property name="value" nameId="yvnr.1105725733873:0" value="embedded block of code" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1176717871257">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1137545148427:3" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="1176717878779" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1176717871259">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1161622981231:32" resolveInfo="ConceptFunctionParameter_editorContext" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1176717871260">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1142886811589:32" resolveInfo="ConceptFunctionParameter_node" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1176725584265">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1176717779940:32" resolveInfo="ConceptFunctionParameter_text" />
    </node>
  </root>
  <root id="1176717888428">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1176717888429">
      <property name="value" nameId="yvnr.1105725733873:0" value="condition" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1176717888430">
      <property name="value" nameId="yvnr.1105725733873:0" value="embedded block of code" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1176717888431">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1137545148427:3" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.BooleanType" typeId="yvor.1070534644030:3" id="1176717902389" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1176717888433">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1161622981231:32" resolveInfo="ConceptFunctionParameter_editorContext" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1176717888434">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1142886811589:32" resolveInfo="ConceptFunctionParameter_node" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1176725860484">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1176717779940:32" resolveInfo="ConceptFunctionParameter_text" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1176732129892">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1176731909317:32" resolveInfo="ConceptFunctionParameter_oldText" />
    </node>
  </root>
  <root id="1176717996748">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1176718001874">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="getter" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1176717841777:32" resolveInfo="QueryFunction_ModelAccess_Getter" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1176718007938">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="setter" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1176717871254:32" resolveInfo="QueryFunction_ModelAccess_Setter" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1176718014393">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="validator" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1176717888428:32" resolveInfo="QueryFunction_ModelAccess_Validator" />
    </node>
  </root>
  <root id="1176731909317">
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1176731909318">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1137545963098:3" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.StringType" typeId="yvor.1225271177708:3" id="1225191495552" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1176731909320">
      <property name="value" nameId="yvnr.1105725733873:0" value="oldText" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1176731909321">
      <property name="value" nameId="yvnr.1105725733873:0" value="function parameter" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1176731909322">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473994950:0" />
    </node>
  </root>
  <root id="1176749715029">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1176749779885">
      <property name="value" nameId="yvnr.1105725733873:0" value="cell provider" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1176749779886">
      <property name="value" nameId="yvnr.1105725733873:0" value="embedded block of code" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1176749854668">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1137545148427:3" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1176794890268">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="p1ge.~AbstractCellProvider" resolveInfo="AbstractCellProvider" />
      </node>
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1176749862944">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1142886811589:32" resolveInfo="ConceptFunctionParameter_node" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1176749872102">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1161622981231:32" resolveInfo="ConceptFunctionParameter_editorContext" />
    </node>
  </root>
  <root id="1176809959526">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1176809959527">
      <property name="value" nameId="yvnr.1105725733873:0" value="color function" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1176809959529">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1137545148427:3" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1176810139102">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="2uit.~Color" resolveInfo="Color" />
      </node>
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="1225456207992">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="1225456097782:32" resolveInfo="IQueryFunction_Color" />
    </node>
  </root>
  <root id="1176897764478">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1176897764479">
      <property name="value" nameId="yvnr.1105725733873:0" value="node factory" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1176897764480">
      <property name="value" nameId="yvnr.1105725733873:0" value="embedded block of code" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1176897764481">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1137545148427:3" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1176897813346" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1176897764483">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="yvo0.1161622878565:0" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1176897764484">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1142886811589:32" resolveInfo="ConceptFunctionParameter_node" />
    </node>
  </root>
  <root id="1176899348742">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1176899348743">
      <property name="value" nameId="yvnr.1105725733873:0" value="string" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1176899348744">
      <property name="value" nameId="yvnr.1105725733873:0" value="embedded block of code" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1176899348745">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1137545148427:3" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.StringType" typeId="yvor.1225271177708:3" id="1225191486628" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1176899348747">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1142886811589:32" resolveInfo="ConceptFunctionParameter_node" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1176899348748">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1161622981231:32" resolveInfo="ConceptFunctionParameter_editorContext" />
    </node>
  </root>
  <root id="1180615838666">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1180615838667">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="postfixesFunction" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1180616057533:32" resolveInfo="CellMenuPart_PropertyPostfixHints_GetPostfixes" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1180615838668">
      <property name="value" nameId="yvnr.1105725733873:0" value="property postfix hints" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1205367019469">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473994950:0" resolveInfo="dontSubstituteByDefault" />
    </node>
  </root>
  <root id="1180616057533">
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1180616057534">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1137545148427:3" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvix.ListType" typeId="yvix.1151688443754:7" id="1180616057535">
        <node role="elementType" roleId="yvix.1151688676805:7" type="yvor.StringType" typeId="yvor.1225271177708:3" id="1225191498477" />
      </node>
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1180616057537">
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="yvo0.1161622878565:0" />
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1180616057538">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="yvo0.1161622753914:0" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1180616057539">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1163613822479:32" resolveInfo="CellMenuPart_Abstract_editedNode" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1180616057540">
      <property name="value" nameId="yvnr.1105725733873:0" value="postfixes" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
  </root>
  <root id="1182191800432">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1182191800433">
      <property name="value" nameId="yvnr.1105725733873:0" value="node list provider" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1182191800434">
      <property name="value" nameId="yvnr.1105725733873:0" value="embedded block of code" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1182191800435">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1137545148427:3" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.BooleanType" typeId="yvor.1070534644030:3" id="1182234187657" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1182191800437">
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="yvo0.1161622878565:0" />
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1182191800438">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1182233249301:32" resolveInfo="ConceptFunctionParameter_childNode" />
    </node>
  </root>
  <root id="1182233249301">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1182233331889">
      <property name="value" nameId="yvnr.1105725733873:0" value="childNode" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1182233336391">
      <property name="value" nameId="yvnr.1105725733873:0" value="function parameter" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1182233342737">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473994950:0" />
    </node>
  </root>
  <root id="1184319644772">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1184319817911">
      <property name="value" nameId="yvnr.1105725733873:0" value="{+&lt;{propertyDeclaration}&gt;+}" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1184319817912">
      <property name="value" nameId="yvnr.1105725733873:0" value="not empty property" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="5137527105084538846">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473994950:0" resolveInfo="dontSubstituteByDefault" />
    </node>
  </root>
  <root id="1186402211651">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1186402402630">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="styleClass" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="0..n" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1186402373407:32" resolveInfo="StyleSheetClass" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="1186402303894">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="yvnu.1169194658468:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1194566715035">
      <property name="value" nameId="yvnr.1105725733873:0" value="stylesheet" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="1186402373407">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1198252369256">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="extendedClass" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1198252130653:32" resolveInfo="StyleSheetClassReference" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="1186402391299">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="yvnu.1169194658468:0" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="1215087816795">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="yvor.1212170275853:3" resolveInfo="IValidIdentifier" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="1219418689782">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="1219418625346:32" resolveInfo="StyleContainer" />
    </node>
  </root>
  <root id="1186402475462">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1186402481854">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473854053:0" />
    </node>
    <node role="conceptLinkDeclaration" roleId="yvnr.1137532086877:0" type="yvnr.AggregationConceptLinkDeclaration" typeId="yvnr.1105741535888:0" id="1215701938122">
      <property name="name" nameId="yvnu.1169194664001:0" value="attributeConstant" />
      <link role="targetType" roleId="yvnr.1105736621938:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
  </root>
  <root id="1186403694788">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1186403803051">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="query" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1225456097782:32" resolveInfo="IQueryFunction_Color" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1186403713874">
      <property name="name" nameId="yvnu.1169194664001:0" value="color" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="1083952545109:32" resolveInfo="_Colors_Enum" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1186403787518">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473854053:0" />
    </node>
  </root>
  <root id="1186403751766">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1220975211821">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="query" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1220974635399:32" resolveInfo="QueryFunction_FontStyle" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1186403918499">
      <property name="value" nameId="yvnr.1105725733873:0" value="font-style" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1186403771423">
      <property name="name" nameId="yvnu.1169194664001:0" value="style" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="1101211480448:32" resolveInfo="_FontStyle_Enum" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1221051468077">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="1215701938122:32" resolveInfo="attributeConstant" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1221051476610">
        <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="fqow.~StyleAttributes" resolveInfo="StyleAttributes" />
        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="fqow.~StyleAttributes%dFONT_STYLE" resolveInfo="FONT_STYLE" />
      </node>
    </node>
  </root>
  <root id="1186404549998">
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1215703469851">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="1215701938122:32" resolveInfo="attributeConstant" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1215703469852">
        <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="fqow.~StyleAttributes" resolveInfo="StyleAttributes" />
        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="fqow.~StyleAttributes%dTEXT_COLOR" resolveInfo="TEXT_COLOR" />
      </node>
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1186404568646">
      <property name="value" nameId="yvnr.1105725733873:0" value="text-foreground-color" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
  </root>
  <root id="1186404574412">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1186404589776">
      <property name="value" nameId="yvnr.1105725733873:0" value="background-color" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1215703443814">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="1215701938122:32" resolveInfo="attributeConstant" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1215703448660">
        <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="fqow.~StyleAttributes" resolveInfo="StyleAttributes" />
        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="fqow.~StyleAttributes%dBACKGROUND_COLOR" resolveInfo="BACKGROUND_COLOR" />
      </node>
    </node>
  </root>
  <root id="1186413799158">
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1215703461771">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="1215701938122:32" resolveInfo="attributeConstant" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1215703461772">
        <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="fqow.~StyleAttributes" resolveInfo="StyleAttributes" />
        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="fqow.~StyleAttributes%dBRACKETS_COLOR" resolveInfo="BRACKETS_COLOR" />
      </node>
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1186413814629">
      <property name="value" nameId="yvnr.1105725733873:0" value="bracket-color" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
  </root>
  <root id="1186414536763">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1223387335081">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="query" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1223387125302:32" resolveInfo="QueryFunction_Boolean" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1186414551515">
      <property name="name" nameId="yvnu.1169194664001:0" value="flag" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983657063:0" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1186414559000">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473854053:0" />
    </node>
  </root>
  <root id="1186414928363">
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1215702083875">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="1215701938122:32" resolveInfo="attributeConstant" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1215702083876">
        <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="fqow.~StyleAttributes" resolveInfo="StyleAttributes" />
        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="fqow.~StyleAttributes%dSELECTABLE" resolveInfo="SELECTABLE" />
      </node>
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1186414942927">
      <property name="value" nameId="yvnr.1105725733873:0" value="selectable" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
  </root>
  <root id="1186414949600">
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1215702053365">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="1215701938122:32" resolveInfo="attributeConstant" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1215702053366">
        <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="fqow.~StyleAttributes" resolveInfo="StyleAttributes" />
        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="fqow.~StyleAttributes%dAUTO_DELETABLE" resolveInfo="AUTO_DELETABLE" />
      </node>
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1186414964929">
      <property name="value" nameId="yvnr.1105725733873:0" value="auto-deletable" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
  </root>
  <root id="1186414976055">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1186414988603">
      <property name="value" nameId="yvnr.1105725733873:0" value="draw-border" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1215702014501">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="1215701938122:32" resolveInfo="attributeConstant" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1215702044051">
        <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="fqow.~StyleAttributes" resolveInfo="StyleAttributes" />
        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="fqow.~StyleAttributes%dDRAW_BORDER" resolveInfo="DRAW_BORDER" />
      </node>
    </node>
  </root>
  <root id="1186414999511">
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1214316229833">
      <property name="name" nameId="yvnu.1169194664001:0" value="underlined" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="1130847686886:32" resolveInfo="UnderlineStyle" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1186415029919">
      <property name="value" nameId="yvnr.1105725733873:0" value="underlined" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1221219051630">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="query" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1221062700015:32" resolveInfo="QueryFunction_Underlined" />
    </node>
  </root>
  <root id="1186415722038">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1221064706952">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="query" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="0..1" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1221057094638:32" resolveInfo="QueryFunction_FontSize" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1186415796023">
      <property name="value" nameId="yvnr.1105725733873:0" value="font-size" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1221209241505">
      <property name="name" nameId="yvnu.1169194664001:0" value="value" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983657062:0" resolveInfo="integer" />
    </node>
  </root>
  <root id="1186414860679">
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1215702059789">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="1215701938122:32" resolveInfo="attributeConstant" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1215702059790">
        <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="fqow.~StyleAttributes" resolveInfo="StyleAttributes" />
        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="fqow.~StyleAttributes%dEDITABLE" resolveInfo="EDITABLE" />
      </node>
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1186414958479">
      <property name="value" nameId="yvnr.1105725733873:0" value="editable" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
  </root>
  <root id="1187258617779">
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1215703479915">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="1215701938122:32" resolveInfo="attributeConstant" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1215703479916">
        <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="fqow.~StyleAttributes" resolveInfo="StyleAttributes" />
        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="fqow.~StyleAttributes%dNULL_TEXT_COLOR" resolveInfo="NULL_TEXT_COLOR" />
      </node>
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1187258725566">
      <property name="value" nameId="yvnr.1105725733873:0" value="text-foreground-null-color" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" />
    </node>
  </root>
  <root id="1197893505573">
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1197893505574">
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="NONE" />
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="none" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1197893580900">
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="FIRST" />
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="first" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1197893584870">
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="LAST" />
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="last" />
    </node>
  </root>
  <root id="1198252130653">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1198252276894">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="styleSheetClass" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1186402373407:32" resolveInfo="StyleSheetClass" />
    </node>
  </root>
  <root id="1198256887712">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1198256955554">
      <property name="value" nameId="yvnr.1105725733873:0" value="---&gt;" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1198509278511">
      <property name="value" nameId="yvnr.1105725733873:0" value="indent" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" resolveInfo="short_description" />
    </node>
  </root>
  <root id="1198257632966">
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1198504797640">
      <property name="name" nameId="yvnu.1169194664001:0" value="openBrace" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983041843:0" resolveInfo="string" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1198257692449">
      <property name="value" nameId="yvnr.1105725733873:0" value="block start" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="1198257747917">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1198257819370">
      <property name="value" nameId="yvnr.1105725733873:0" value="block end" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1198506631483">
      <property name="name" nameId="yvnu.1169194664001:0" value="closeBrace" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983041843:0" resolveInfo="string" />
    </node>
  </root>
  <root id="1198489924438">
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1198508727334">
      <property name="name" nameId="yvnu.1169194664001:0" value="openBrace" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983041843:0" resolveInfo="string" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1198508733600">
      <property name="name" nameId="yvnu.1169194664001:0" value="closeBrace" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983041843:0" resolveInfo="string" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1198490012674">
      <property name="value" nameId="yvnr.1105725733873:0" value="block" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1198489985045">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="header" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="0..1" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1073389214265:32" resolveInfo="EditorCellModel" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1198489993734">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="body" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1073389214265:32" resolveInfo="EditorCellModel" />
    </node>
  </root>
  <root id="1201265905111">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1201266028598">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="editorContext" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1201266036224">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="0..n" />
      <property name="role" nameId="yvnr.1071599776563:0" value="selectLaterParameter" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1201266127262:32" resolveInfo="SelectLaterParameter" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1201269239863">
      <property name="value" nameId="yvnr.1105725733873:0" value="select" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1201269290000">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvim.1138763241883:16" resolveInfo="applicable_to_node" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1201606885224">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvim.1138763325919:16" resolveInfo="applicable_to_link" />
    </node>
  </root>
  <root id="1201266127262">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1201266139935">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473854053:0" resolveInfo="abstract" />
    </node>
  </root>
  <root id="1201268783309">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1201268911190">
      <property name="value" nameId="yvnr.1105725733873:0" value="position=" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1201268881975">
      <property name="name" nameId="yvnu.1169194664001:0" value="position" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="1201268793545:32" resolveInfo="SelectPoisition" />
    </node>
  </root>
  <root id="1201268793545">
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1201268793546">
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="before" />
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="before" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1201268803781">
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="after" />
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="after" />
    </node>
  </root>
  <root id="1201270864927">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1201270907764">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="position" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1201270898074">
      <property name="value" nameId="yvnr.1105725733873:0" value="caret position=" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="1214317859050">
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1214317859051">
      <property name="name" nameId="yvnu.1169194664001:0" value="layoutConstraint" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="1138197387103:32" resolveInfo="_Layout_Constraints_Enum" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1214317859052">
      <property name="value" nameId="yvnr.1105725733873:0" value="layout constraint" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="1214320119173">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="3608226089191997414">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="tags" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="0..n" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="3608226089191997415:32" resolveInfo="RightTransformAnchorTagWrapper" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1214320119174">
      <property name="name" nameId="yvnu.1169194664001:0" value="tag" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="1140813780565:32" resolveInfo="RightTransformAnchorTag" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1214320119175">
      <property name="value" nameId="yvnr.1105725733873:0" value="side-transform-anchor-tag" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="1214406454886">
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1215703515607">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="1215701938122:32" resolveInfo="attributeConstant" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1215703515608">
        <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="fqow.~StyleAttributes" resolveInfo="StyleAttributes" />
        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="fqow.~StyleAttributes%dTEXT_BACKGROUND_COLOR" resolveInfo="TEXT_BACKGROUND_COLOR" />
      </node>
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1214406454887">
      <property name="value" nameId="yvnr.1105725733873:0" value="text-background-color" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="1214406466686">
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1215703491746">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="1215701938122:32" resolveInfo="attributeConstant" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1215703491747">
        <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="fqow.~StyleAttributes" resolveInfo="StyleAttributes" />
        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="fqow.~StyleAttributes%dSELECTED_TEXT_BACKGROUND_COLOR" resolveInfo="SELECTED_TEXT_BACKGROUND_COLOR" />
      </node>
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1214406466687">
      <property name="value" nameId="yvnr.1105725733873:0" value="text-background-color-selected" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="1214472762472">
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1214472762473">
      <property name="name" nameId="yvnu.1169194664001:0" value="position" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="1197893505573:32" resolveInfo="_CaretPosition_Enum" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1214472762474">
      <property name="value" nameId="yvnr.1105725733873:0" value="default-caret-position" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="1215007762405">
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1215007802031">
      <property name="name" nameId="yvnu.1169194664001:0" value="value" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="1239805001815:32" resolveInfo="_FloatOrInteger" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1215007873046">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473854053:0" resolveInfo="abstract" />
    </node>
  </root>
  <root id="1215007883204">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1215007893986">
      <property name="value" nameId="yvnr.1105725733873:0" value="padding-left" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1226491327426">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="1215701938122:32" resolveInfo="attributeConstant" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1226491332601">
        <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="fqow.~StyleAttributes" resolveInfo="StyleAttributes" />
        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="fqow.~StyleAttributes%dPADDING_LEFT" resolveInfo="PADDING_LEFT" />
      </node>
    </node>
  </root>
  <root id="1215007897487">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1215007897488">
      <property name="value" nameId="yvnr.1105725733873:0" value="padding-right" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1226491349683">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="1215701938122:32" resolveInfo="attributeConstant" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1226491353889">
        <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="fqow.~StyleAttributes" resolveInfo="StyleAttributes" />
        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="fqow.~StyleAttributes%dPADDING_RIGHT" resolveInfo="PADDING_RIGHT" />
      </node>
    </node>
  </root>
  <root id="1215085112640">
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1215702064900">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="1215701938122:32" resolveInfo="attributeConstant" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1215702064901">
        <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="fqow.~StyleAttributes" resolveInfo="StyleAttributes" />
        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="fqow.~StyleAttributes%dFIRST_POSITION_ALLOWED" resolveInfo="FIRST_POSITION_ALLOWED" />
      </node>
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1215085187379">
      <property name="value" nameId="yvnr.1105725733873:0" value="first-position-allowed" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="1215085197271">
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1215702077186">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="1215701938122:32" resolveInfo="attributeConstant" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1215702077187">
        <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="fqow.~StyleAttributes" resolveInfo="StyleAttributes" />
        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="fqow.~StyleAttributes%dLAST_POSITION_ALLOWED" resolveInfo="LAST_POSITION_ALLOWED" />
      </node>
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1215085197272">
      <property name="value" nameId="yvnr.1105725733873:0" value="last-position-allowed" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="1216308376568">
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1216308507057">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="right" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1216308502931">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="next-line" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="next-line" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1216308376569">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="indented" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="indented" />
    </node>
  </root>
  <root id="1216308599511">
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1216308761668">
      <property name="name" nameId="yvnu.1169194664001:0" value="position" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="1216308376568:32" resolveInfo="_NextLine_Enum" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1216308818747">
      <property name="value" nameId="yvnr.1105725733873:0" value="position" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="1216380990741">
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1232439938817">
      <property name="name" nameId="yvnu.1169194664001:0" value="runInCommand" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983657063:0" resolveInfo="boolean" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="8251517099537646385">
      <property name="name" nameId="yvnu.1169194664001:0" value="allowEmptyText" />
      <property name="propertyType" value="boolean" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983657063:0" resolveInfo="boolean" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1216385453572">
      <property name="value" nameId="yvnr.1105725733873:0" value="{T &lt;{property}&gt; T}" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="5137527105084538852">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473994950:0" resolveInfo="dontSubstituteByDefault" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1216381211800">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="handlerBlock" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1216381054717:32" resolveInfo="TransactionalPropertyHandler" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1216381219207">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="reference" />
      <property name="role" nameId="yvnr.1071599776563:0" value="property" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvnr.1071489288299:0" resolveInfo="PropertyDeclaration" />
    </node>
  </root>
  <root id="1216381054717">
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1216381097005">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" resolveInfo="applicableConceptFunctionParameter" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1216381148013:32" resolveInfo="TransactionPropertyHandler_newValue" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1216381170362">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" resolveInfo="applicableConceptFunctionParameter" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1216381117100:32" resolveInfo="TransactionPropertyHandler_oldValue" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1216384575593">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" resolveInfo="applicableConceptFunctionParameter" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1161622981231:32" resolveInfo="ConceptFunctionParameter_editorContext" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1216384575594">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" resolveInfo="applicableConceptFunctionParameter" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1142886811589:32" resolveInfo="ConceptFunctionParameter_node" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1216381091954">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1137545148427:3" resolveInfo="conceptFunctionReturnType" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="1216381093987" />
    </node>
  </root>
  <root id="1216381117100">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1216381136570">
      <property name="value" nameId="yvnr.1105725733873:0" value="oldValue" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="1216381148013">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1216381148014">
      <property name="value" nameId="yvnr.1105725733873:0" value="newValue" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1216383773966">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473994950:0" resolveInfo="dontSubstituteByDefault" />
    </node>
  </root>
  <root id="1216560327200">
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1216560518566">
      <property name="name" nameId="yvnu.1169194664001:0" value="position" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="1216308376568:32" resolveInfo="_NextLine_Enum" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1216560546489">
      <property name="value" nameId="yvnr.1105725733873:0" value="position-children" />
      <property name="name" value="position-children" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="1216672142186">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1235227729696">
      <property name="value" nameId="yvnr.1105725733873:0" value="indent_old" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="1219226236603">
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1219226236604">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="1215701938122:32" resolveInfo="attributeConstant" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1219226236605">
        <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="fqow.~StyleAttributes" resolveInfo="StyleAttributes" />
        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="fqow.~StyleAttributes%dDRAW_BRACKETS" resolveInfo="DRAW_BRACKETS" />
      </node>
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1219226236606">
      <property name="value" nameId="yvnr.1105725733873:0" value="draw-brackets" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="1219418625346">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1219418656006">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="styleItem" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="0..n" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1186402475462:32" resolveInfo="StyleClassItem" />
    </node>
  </root>
  <root id="1220974635399">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1220974841934">
      <property name="value" nameId="yvnr.1105725733873:0" value="font style function" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1220974915063">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1137545148427:3" resolveInfo="conceptFunctionReturnType" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1221052118278" />
    </node>
  </root>
  <root id="1221057094638">
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1221057195672">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1137545148427:3" resolveInfo="conceptFunctionReturnType" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1221057195673" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1221057173654">
      <property name="value" nameId="yvnr.1105725733873:0" value="int function" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="1221059528506">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1221211298019">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473854053:0" resolveInfo="abstract" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1221059797722">
      <property name="value" nameId="yvnr.1105725733873:0" value="embedded block of code" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" resolveInfo="short_description" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1221059701511">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" resolveInfo="applicableConceptFunctionParameter" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1142886811589:32" resolveInfo="ConceptFunctionParameter_node" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1221059701512">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" resolveInfo="applicableConceptFunctionParameter" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1161622981231:32" resolveInfo="ConceptFunctionParameter_editorContext" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1221060393848">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1137545148427:3" resolveInfo="conceptFunctionReturnType" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1221060400056">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Object" resolveInfo="Object" />
      </node>
    </node>
  </root>
  <root id="1221062700015">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1221062795610">
      <property name="value" nameId="yvnr.1105725733873:0" value="underlined function" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1221062811502">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1137545148427:3" resolveInfo="conceptFunctionReturnType" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.BooleanType" typeId="yvor.1070534644030:3" id="1221062816176" />
    </node>
  </root>
  <root id="1223386653097">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1223386894103">
      <property name="value" nameId="yvnr.1105725733873:0" value="strike-out" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1223388842734">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="1215701938122:32" resolveInfo="attributeConstant" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1223388868719">
        <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="fqow.~StyleAttributes" resolveInfo="StyleAttributes" />
        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="fqow.~StyleAttributes%dSTRIKE_OUT" resolveInfo="STRIKE_OUT" />
      </node>
    </node>
  </root>
  <root id="1223387125302">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1223387147820">
      <property name="value" nameId="yvnr.1105725733873:0" value="boolean function" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1223387210120">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1137545148427:3" resolveInfo="conceptFunctionReturnType" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.BooleanType" typeId="yvor.1070534644030:3" id="1223387224419" />
    </node>
  </root>
  <root id="1225456097782" />
  <root id="1225456267680">
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="1225456281899">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="1225456097782:32" resolveInfo="IQueryFunction_Color" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1225456328150">
      <property name="value" nameId="yvnr.1105725733873:0" value="#" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1225456336245">
      <property name="value" nameId="yvnr.1105725733873:0" value="#RRGGBB" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" resolveInfo="short_description" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1225456424731">
      <property name="name" nameId="yvnu.1169194664001:0" value="value" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983041843:0" resolveInfo="string" />
    </node>
  </root>
  <root id="1225898583838">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1225898971709">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="getter" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1176717841777:32" resolveInfo="QueryFunction_ModelAccess_Getter" />
    </node>
  </root>
  <root id="1225900081164">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1225903603081">
      <property name="value" nameId="yvnr.1105725733873:0" value="read only model access" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1225903603082">
      <property name="value" nameId="yvnr.1105725733873:0" value="reference to read only accessor" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" resolveInfo="short_description" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1225900141900">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="modelAccessor" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1225898583838:32" resolveInfo="ReadOnlyModelAccessor" />
    </node>
  </root>
  <root id="1226339751946">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1226339797666">
      <property name="value" nameId="yvnr.1105725733873:0" value="padding-top" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1226491363829">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="1215701938122:32" resolveInfo="attributeConstant" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1226491369520">
        <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="fqow.~StyleAttributes" resolveInfo="StyleAttributes" />
        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="fqow.~StyleAttributes%dPADDING_TOP" resolveInfo="PADDING_TOP" />
      </node>
    </node>
  </root>
  <root id="1226339813308">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1226339845434">
      <property name="value" nameId="yvnr.1105725733873:0" value="padding-bottom" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1226491309950">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="1215701938122:32" resolveInfo="attributeConstant" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1226491315063">
        <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="fqow.~StyleAttributes" resolveInfo="StyleAttributes" />
        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="fqow.~StyleAttributes%dPADDING_BOTTOM" resolveInfo="PADDING_BOTTOM" />
      </node>
    </node>
  </root>
  <root id="1226339938453">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="1226503604644">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473854053:0" resolveInfo="abstract" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1226504838901">
      <property name="name" nameId="yvnu.1169194664001:0" value="measure" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="1226504633752:32" resolveInfo="_Enum_Measure" />
    </node>
  </root>
  <root id="1226504633752">
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1226504633753">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="pixels" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="PIXELS" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1226504706052">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="spaces" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="SPACES" />
    </node>
  </root>
  <root id="1227861515039">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1227861587090">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="reference" />
      <property name="role" nameId="yvnr.1071599776563:0" value="link" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="0..1" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvnr.1071489288298:0" resolveInfo="LinkDeclaration" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1227874655665">
      <property name="value" nameId="yvnr.1105725733873:0" value="navigatable-reference" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="1233148810477">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1233148881323">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="reference" />
      <property name="role" nameId="yvnr.1071599776563:0" value="parentClass" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1186402373407:32" resolveInfo="StyleSheetClass" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="1233148918310">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="1219418625346:32" resolveInfo="IStyleContainer" />
    </node>
  </root>
  <root id="1233758997495">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1233759068045">
      <property name="value" nameId="yvnr.1105725733873:0" value="punctuation-left" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1233759108034">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="1215701938122:32" resolveInfo="attributeConstant" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1233759122712">
        <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="fqow.~StyleAttributes" resolveInfo="StyleAttributes" />
        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="fqow.~StyleAttributes%dPUNCTUATION_LEFT" resolveInfo="PUNCTUATION_LEFT" />
      </node>
    </node>
  </root>
  <root id="1233759184865">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1233759225808">
      <property name="value" nameId="yvnr.1105725733873:0" value="punctuation-right" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1233759264978">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="1215701938122:32" resolveInfo="attributeConstant" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1233759270401">
        <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="fqow.~StyleAttributes" resolveInfo="StyleAttributes" />
        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="fqow.~StyleAttributes%dPUNCTUATION_RIGHT" resolveInfo="PUNCTUATION_RIGHT" />
      </node>
    </node>
  </root>
  <root id="1233823429331">
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1233823521393">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="1215701938122:32" resolveInfo="attributeConstant" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1233823532331">
        <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="fqow.~StyleAttributes" resolveInfo="StyleAttributes" />
        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="fqow.~StyleAttributes%dHORIZONTAL_GAP" resolveInfo="HORIZONTAL_GAP" />
      </node>
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1233825610829">
      <property name="value" nameId="yvnr.1105725733873:0" value="horizontal-gap" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="1235728439575">
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1235728439576">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="1215701938122:32" resolveInfo="attributeConstant" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1235728439577">
        <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="fqow.~StyleAttributes" resolveInfo="StyleAttributes" />
        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="fqow.~StyleAttributes%dBASE_LINE_CELL" resolveInfo="BASE_LINE_CELL" />
      </node>
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1235728439578">
      <property name="value" nameId="yvnr.1105725733873:0" value="base-line-cell" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="1235999440492">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1235999512654">
      <property name="value" nameId="yvnr.1105725733873:0" value="horizontal-align" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1235999557292">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="1215701938122:32" resolveInfo="attributeConstant" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1235999566301">
        <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="fqow.~StyleAttributes" resolveInfo="StyleAttributes" />
        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="fqow.~StyleAttributes%dHORIZONTAL_ALIGN" resolveInfo="HORIZONTAL_ALIGN" />
      </node>
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1235999920262">
      <property name="name" nameId="yvnu.1169194664001:0" value="align" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="1235999709834:32" resolveInfo="AlignEnum" />
    </node>
  </root>
  <root id="1235999709834">
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1235999709835">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="left" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="LEFT" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1235999738057">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="right" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="RIGHT" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="1235999744266">
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="center" />
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="CENTER" />
    </node>
  </root>
  <root id="1236262245656">
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="1238091709220">
      <property name="name" nameId="yvnu.1169194664001:0" value="labelName" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983041843:0" resolveInfo="string" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="5915179142332960580">
      <property name="name" nameId="yvnu.1169194664001:0" value="hasNoLabel" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983657063:0" resolveInfo="boolean" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1236443321503">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="query" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="0..1" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="1236443640684:32" resolveInfo="QueryFunction_String" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1236263409818">
      <property name="value" nameId="yvnr.1105725733873:0" value="matching-label" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1236266496796">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="1215701938122:32" resolveInfo="attributeConstant" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1236266567702">
        <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="fqow.~StyleAttributes" resolveInfo="StyleAttributes" />
        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="fqow.~StyleAttributes%dMATCHING_LABEL" resolveInfo="MATCHING_LABEL" />
      </node>
    </node>
  </root>
  <root id="1236263696991">
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1236263780519">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1137545148427:3" resolveInfo="conceptFunctionReturnType" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1236263806677" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1236263761754">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" resolveInfo="applicableConceptFunctionParameter" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1142886811589:32" resolveInfo="ConceptFunctionParameter_node" />
    </node>
  </root>
  <root id="1236443640684">
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1236443640685">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1137545148427:3" resolveInfo="conceptFunctionReturnType" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.StringType" typeId="yvor.1225271177708:3" id="1236443698038" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="1236443640687">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" resolveInfo="applicableConceptFunctionParameter" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1142886811589:32" resolveInfo="ConceptFunctionParameter_node" />
    </node>
  </root>
  <root id="1237303669825">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1237303669826">
      <property name="value" nameId="yvnr.1105725733873:0" value="indent" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="1237307900041">
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1237308006695">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="1215701938122:32" resolveInfo="attributeConstant" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1237308006696">
        <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="fqow.~StyleAttributes" resolveInfo="StyleAttributes" />
        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="fqow.~StyleAttributes%dINDENT_LAYOUT_INDENT" resolveInfo="INDENT_LAYOUT_INDENT" />
      </node>
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1237307999225">
      <property name="value" nameId="yvnr.1105725733873:0" value="indent-layout-indent" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="1237308012275">
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1237308012276">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="1215701938122:32" resolveInfo="attributeConstant" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1237308012277">
        <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="fqow.~StyleAttributes" resolveInfo="StyleAttributes" />
        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="fqow.~StyleAttributes%dINDENT_LAYOUT_NEW_LINE" resolveInfo="INDENT_LAYOUT_NEW_LINE" />
      </node>
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1237308012278">
      <property name="value" nameId="yvnr.1105725733873:0" value="indent-layout-new-line" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="1237375020029">
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1237374854247">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="1215701938122:32" resolveInfo="attributeConstant" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1237374854248">
        <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="fqow.~StyleAttributes" resolveInfo="StyleAttributes" />
        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="fqow.~StyleAttributes%dINDENT_LAYOUT_CHILDREN_NEWLINE" resolveInfo="INDENT_LAYOUT_CHILDREN_NEWLINE" />
      </node>
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1237375109781">
      <property name="value" nameId="yvnr.1105725733873:0" value="indent-layout-new-line-children" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="1237385578942">
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1237385578943">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="1215701938122:32" resolveInfo="attributeConstant" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1237385578944">
        <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="fqow.~StyleAttributes" resolveInfo="StyleAttributes" />
        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="fqow.~StyleAttributes%dINDENT_LAYOUT_ON_NEW_LINE" resolveInfo="INDENT_LAYOUT_ON_NEW_LINE" />
      </node>
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1237385578945">
      <property name="value" nameId="yvnr.1105725733873:0" value="indent-layout-on-new-line" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="1239805001815" />
  <root id="1239814640496">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1239814668280">
      <property name="value" nameId="yvnr.1105725733873:0" value="vertical grid" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="1240253180846">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1240253297498">
      <property name="value" nameId="yvnr.1105725733873:0" value="indent-layout-no-wrap" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="1240251450434">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="1215701938122:32" resolveInfo="attributeConstant" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1240251450435">
        <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="fqow.~StyleAttributes" resolveInfo="StyleAttributes" />
        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="fqow.~StyleAttributes%dINDENT_LAYOUT_NO_WRAP" resolveInfo="INDENT_LAYOUT_NO_WRAP" />
      </node>
    </node>
  </root>
  <root id="625126330682908270">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="625126330682991093">
      <property name="value" nameId="yvnr.1105725733873:0" value="ref. presentation" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="7667276221847570194">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="8863456892852949148">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="reference" />
      <property name="role" nameId="yvnr.1071599776563:0" value="parametersInformation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="7667276221847612622:32" resolveInfo="ParametersInformationQuery" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="7667276221847632140">
      <property name="value" nameId="yvnr.1105725733873:0" value="parameters-information" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="7667276221847612622">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="4203201205843994215">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="reference" />
      <property name="role" nameId="yvnr.1071599776563:0" value="applicableConcept" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvnr.1169125787135:0" resolveInfo="AbstractConceptDeclaration" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="8178273524755058633">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="type" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068431790189:3" resolveInfo="Type" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="7667276221847612623">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="methods" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="7667276221847612943:32" resolveInfo="QueryFunction_NodeList" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="671290755174161557">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="presentation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="671290755174094686:32" resolveInfo="QueryFunction_MethodPresentation" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="6419604448124516218">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="isMethodCurrent" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="6419604448124516209:32" resolveInfo="QueryFunction_IsMethodCurrent" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="1336839120510622371">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="methodDeclaration" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="0..n" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvjr.1205769003971:0" resolveInfo="DefaultClassifierMethodDeclaration" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="4755152624708547702">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="yvnu.1169194658468:0" resolveInfo="INamedConcept" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="1336839120510359488">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="yvjr.1205751982837:0" resolveInfo="IClassifier" />
    </node>
  </root>
  <root id="7667276221847612943">
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="671290755173763930">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" resolveInfo="applicableConceptFunctionParameter" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="4203201205844553978:32" resolveInfo="ConceptFunctionParameter_selectedNode" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="671290755173777668">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" resolveInfo="applicableConceptFunctionParameter" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1161622981231:32" resolveInfo="ConceptFunctionParameter_editorContext" />
    </node>
  </root>
  <root id="671290755174094686">
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="671290755174094687">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" resolveInfo="applicableConceptFunctionParameter" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="4203201205844553978:32" resolveInfo="ConceptFunctionParameter_selectedNode" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="671290755174094688">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" resolveInfo="applicableConceptFunctionParameter" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1161622981231:32" resolveInfo="ConceptFunctionParameter_editorContext" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="671290755174094690">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" resolveInfo="applicableConceptFunctionParameter" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="671290755174094691:32" resolveInfo="ConceptFunctionParameter_method" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="4526149749187797166">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" resolveInfo="applicableConceptFunctionParameter" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="4526149749187797167:32" resolveInfo="ConceptFunctionParameter_StyledText" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="671290755174161554">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1137545148427:3" resolveInfo="conceptFunctionReturnType" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="4526149749187797164" />
    </node>
  </root>
  <root id="671290755174094691">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="671290755174094694">
      <property name="value" nameId="yvnr.1105725733873:0" value="parameterObject" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="671290755174094695">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473994950:0" resolveInfo="dontSubstituteByDefault" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="7806530711847278494">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvor.1199886518837:3" resolveInfo="dontUseParameterObject" />
    </node>
  </root>
  <root id="6419604448124516209">
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="6419604448124516210">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" resolveInfo="applicableConceptFunctionParameter" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="4203201205844553978:32" resolveInfo="ConceptFunctionParameter_selectedNode" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="6419604448124516211">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" resolveInfo="applicableConceptFunctionParameter" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1161622981231:32" resolveInfo="ConceptFunctionParameter_editorContext" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="6419604448124516212">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" resolveInfo="applicableConceptFunctionParameter" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="671290755174094691:32" resolveInfo="ConceptFunctionParameter_method" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="6419604448124516213">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1137545148427:3" resolveInfo="conceptFunctionReturnType" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.BooleanType" typeId="yvor.1070534644030:3" id="6419604448124773698" />
    </node>
  </root>
  <root id="4526149749187797167">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="4526149749187797170">
      <property name="value" nameId="yvnr.1105725733873:0" value="styledText" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="4526149749187797171">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473994950:0" resolveInfo="dontSubstituteByDefault" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="4526149749187937572">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1137545963098:3" resolveInfo="conceptFunctionParameterType" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvnl.StyledTextType" typeId="3903367331818357915:32" id="1511134095826078599" />
    </node>
  </root>
  <root id="280151408461567367">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="280151408461603512">
      <property name="value" nameId="yvnr.1105725733873:0" value="append" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="4531786690998911346">
      <property name="value" nameId="yvnr.1105725733873:0" value="append" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="4531786690998812995:32" resolveInfo="generatedName" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="4531786690998911347">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="4531786690998812992:32" resolveInfo="operationArgumentType" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.StringType" typeId="yvor.1225271177708:3" id="4531786690998911349" />
    </node>
  </root>
  <root id="280151408461909164">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="280151408461967237">
      <property name="value" nameId="yvnr.1105725733873:0" value="setBold" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="226730285128288237">
      <property name="value" nameId="yvnr.1105725733873:0" value="setBold" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="4531786690998812995:32" resolveInfo="methodToGenerate" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="7686902624460872740">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="4531786690998812992:32" resolveInfo="operationArgumentType" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.BooleanType" typeId="yvor.1070534644030:3" id="7686902624460905120" />
    </node>
  </root>
  <root id="4531786690998636238">
    <node role="conceptLinkDeclaration" roleId="yvnr.1137532086877:0" type="yvnr.AggregationConceptLinkDeclaration" typeId="yvnr.1105741535888:0" id="4531786690998812992">
      <property name="name" nameId="yvnu.1169194664001:0" value="operationArgumentType" />
      <link role="targetType" roleId="yvnr.1105736621938:0" targetNodeId="yvor.1068431790189:3" resolveInfo="Type" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="4531786690998636239">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="yvor.1197027803184:3" resolveInfo="IOperation" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="4531786690998636240">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="0..n" />
      <property name="role" nameId="yvnr.1071599776563:0" value="actualArgument" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
    </node>
    <node role="conceptPropertyDeclaration" roleId="yvnr.1137467167200:0" type="yvnr.StringConceptPropertyDeclaration" typeId="yvnr.1105725281956:0" id="4531786690998812995">
      <property name="name" nameId="yvnu.1169194664001:0" value="methodToGenerate" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="2835407828667813404">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473854053:0" resolveInfo="abstract" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="226730285126749472">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473994950:0" resolveInfo="dontSubstituteByDefault" />
    </node>
  </root>
  <root id="3903367331818357915">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="6552123473823027984">
      <property name="value" nameId="yvnr.1105725733873:0" value="styled text" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="7620205565664569937">
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="7620205565664606477">
      <property name="name" nameId="yvnu.1169194664001:0" value="baseline" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="7620205565664606377:32" resolveInfo="DefaultBaseLineEnum" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="7620205565664606478">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="1215701938122:32" resolveInfo="attributeConstant" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="4098449021143562584">
        <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="fqow.~StyleAttributes" resolveInfo="StyleAttributes" />
        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="fqow.~StyleAttributes%dDEFAULT_BASE_LINE" resolveInfo="DEFAULT_BASE_LINE" />
      </node>
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="7620205565664606480">
      <property name="value" nameId="yvnr.1105725733873:0" value="default-baseline" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="7620205565664606377">
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="7620205565664606378">
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="FIRST" />
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="first cell baseline" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="7620205565664606380">
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="CENTER" />
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="collection center" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="7620205565664606448">
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="LAST" />
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="last cell baseline" />
    </node>
  </root>
  <root id="1886960078078641793">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1886960078078641794">
      <property name="value" nameId="yvnr.1105725733873:0" value="superscript" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="8255250703325730686">
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="8255250703325730687">
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="NORMAL" />
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="plain text" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="8255250703325731012">
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="SUPERSCRIPT" />
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="superscript" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="8255250703325731013">
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="SUBSCRIPT" />
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="subscript" />
    </node>
  </root>
  <root id="8255250703325731016">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="8255250703325731017">
      <property name="value" nameId="yvnr.1105725733873:0" value="script-kind" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="8255250703325731018">
      <property name="name" nameId="yvnu.1169194664001:0" value="script" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="8255250703325730686:32" resolveInfo="SuperscriptSwitchEnum" />
    </node>
  </root>
  <root id="4203201205844553978">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="4203201205844628834">
      <property name="value" nameId="yvnr.1105725733873:0" value="node" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="4203201205844628835">
      <property name="value" nameId="yvnr.1105725733873:0" value="selected node" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" resolveInfo="shortDescription" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="4203201205844628836">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473994950:0" resolveInfo="dontSubstituteByDefault" />
    </node>
  </root>
  <root id="5949640294884234625">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="5949640294884269781">
      <property name="value" nameId="yvnr.1105725733873:0" value="table" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="6820251943131810951">
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="6820251943131810953">
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="HORIZONTAL_COLLECTION" />
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="horizontal collection" />
    </node>
    <node role="member" roleId="yvnr.1083172003582:0" type="yvnr.EnumerationMemberDeclaration" typeId="yvnr.1083171877298:0" id="6820251943131810954">
      <property name="internalValue" nameId="yvnr.1083923523171:0" value="VERTICAL_COLLECTION" />
      <property name="externalValue" nameId="yvnr.1083923523172:0" value="vertical collection" />
    </node>
  </root>
  <root id="6820251943131810950">
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="6820251943131810955">
      <property name="name" nameId="yvnu.1169194664001:0" value="tableComponent" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="6820251943131810951:32" resolveInfo="TableComponentEnum" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1326688792171902653">
      <property name="value" nameId="yvnr.1105725733873:0" value="table-component" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="8313721352726366579">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="8313721352726450629">
      <property name="value" nameId="yvnr.1105725733873:0" value="empty" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="7597241200646296617">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="7597241200646296626">
      <property name="value" nameId="yvnr.1105725733873:0" value="navigatable-node" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="7597241200646296618">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="functionNode" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="7597241200646296619:32" resolveInfo="QueryFunction_SNode" />
    </node>
  </root>
  <root id="7597241200646296619">
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="7597241200646296622">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1137545148427:3" resolveInfo="conceptFunctionReturnType" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="7597241200646296624" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="7597241200646296621">
      <property name="value" nameId="yvnr.1105725733873:0" value="snode function" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="3696012239575138270">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="3696012239575138271">
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="1" />
      <property name="role" nameId="yvnr.1071599776563:0" value="propertyDeclaration" />
      <link role="specializedLink" roleId="yvnr.1071599698500:0" targetNodeId="1140103550593:32" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvnr.1071489288299:0" resolveInfo="PropertyDeclaration" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="3696012239575138272">
      <property name="value" nameId="yvnr.1105725733873:0" value="URL" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="3696012239575138273">
      <property name="value" nameId="yvnr.1105725733873:0" value="URL property" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" resolveInfo="shortDescription" />
    </node>
  </root>
  <root id="3608226089191997415">
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="3608226089191997418">
      <property name="name" nameId="yvnu.1169194664001:0" value="tag" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="1140813780565:32" resolveInfo="RightTransformAnchorTag" />
    </node>
  </root>
  <root id="709996738298806197">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="709996738298806202">
      <property name="value" nameId="yvnr.1105725733873:0" value="separator text" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="709996738298806204">
      <property name="value" nameId="yvnr.1105725733873:0" value="embedded block of code" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473914776:0" resolveInfo="shortDescription" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="709996738298806205">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1137545148427:3" resolveInfo="conceptFunctionReturnType" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.StringType" typeId="yvor.1225271177708:3" id="709996738298806207" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="709996738298806218">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" resolveInfo="applicableConceptFunctionParameter" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="yvo0.1161622878565:0" resolveInfo="ConceptFunctionParameter_scope" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="709996738298806220">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" resolveInfo="applicableConceptFunctionParameter" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="1142886811589:32" resolveInfo="ConceptFunctionParameter_node" />
    </node>
  </root>
</model>

