<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:a40eb9ab-0526-425a-be0d-2da074779da0(jetbrains.mps.lang.dataFlow.actions)">
  <persistence version="4" />
  <refactoringHistory />
  <language namespace="7fa12e9c-b949-4976-b4fa-19accbc320b4(jetbrains.mps.lang.dataFlow)" />
  <language namespace="aee9cad2-acd4-4608-aef2-0004f6a1cdbd(jetbrains.mps.lang.actions)" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590377(jetbrains.mps.lang.dataFlow.constraints)" version="4" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902ba(jetbrains.mps.lang.sharedConcepts.constraints)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902a8(jetbrains.mps.lang.actions.structure)" version="23" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902c1(jetbrains.mps.baseLanguage.constraints)" version="83" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902bc(jetbrains.mps.lang.sharedConcepts.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.lang.structure.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590283(jetbrains.mps.lang.core.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902a4(jetbrains.mps.lang.actions.constraints)" version="16" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902db(jetbrains.mps.baseLanguage.blTypes.constraints)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959037d(jetbrains.mps.lang.dataFlow.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902fb(jetbrains.mps.lang.smodel.constraints)" version="21" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959028c(jetbrains.mps.lang.structure.constraints)" version="11" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.lang.smodel.structure)" version="16" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590334(jetbrains.mps.baseLanguage.closures.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590338(jetbrains.mps.baseLanguage.closures.structure)" version="3" />
  <devkit namespace="2677cb18-f558-4e33-bc38-a5139cee06dc(jetbrains.mps.devkit.language-design)" />
  <maxImportIndex value="1" />
  <import index="1" modelUID="r:00000000-0000-4000-0000-011c8959037d(jetbrains.mps.lang.dataFlow.structure)" version="0" />
  <node type="jetbrains.mps.lang.actions.structure.SideTransformHintSubstituteActions:23" id="137546700134038987">
    <property name="name:23" value="InsertPosition" />
    <node role="actionsBuilder:23" type="jetbrains.mps.lang.actions.structure.SideTransformHintSubstituteActionsBuilder:23" id="137546700134038988">
      <property name="side:23" value="left" />
      <link role="applicableConcept:23" targetNodeId="1.1206443583064:0" resolveInfo="EmitStatement" />
      <node role="part:23" type="jetbrains.mps.lang.actions.structure.AddMenuPart:23" id="137546700134038991">
        <link role="concept:23" targetNodeId="1.1206443583064:0" resolveInfo="EmitStatement" />
        <node role="part:23" type="jetbrains.mps.lang.actions.structure.SimpleSideTransformMenuPart:23" id="137546700134038993">
          <node role="handler:23" type="jetbrains.mps.lang.actions.structure.QueryFunction_SideTransform_Handler:23" id="137546700134038994">
            <node role="body:23" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="137546700134038995">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="137546700134039056">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="137546700134039063">
                  <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="137546700134039058">
                    <node role="operand:3" type="jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_sourceNode:23" id="137546700134039057" />
                    <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.SLinkAccess:16" id="137546700134039062">
                      <link role="link:16" targetNodeId="1.78261276407124230:0" />
                    </node>
                  </node>
                  <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="137546700134039068">
                    <node role="creator:3" type="jetbrains.mps.lang.smodel.structure.SNodeCreator:16" id="137546700134039069">
                      <node role="createdType:16" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="137546700134039070">
                        <link role="concept:16" targetNodeId="1.8486807419021026918:0" resolveInfo="InsertPosition" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="matchingText:23" type="jetbrains.mps.lang.actions.structure.SideTransform_SimpleString:23" id="137546700134039071">
            <property name="text:23" value="insert" />
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

