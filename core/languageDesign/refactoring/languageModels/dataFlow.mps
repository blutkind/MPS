<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:00000000-0000-4000-0000-011c89590314(jetbrains.mps.lang.refactoring.dataFlow)">
  <persistence version="3" />
  <refactoringHistory />
  <language namespace="7fa12e9c-b949-4976-b4fa-19accbc320b4(jetbrains.mps.lang.dataFlow)" />
  <language namespace="7866978e-a0f0-4cc7-81bc-4d213d9375e1(jetbrains.mps.lang.smodel)" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="83888646-71ce-4f1c-9c53-c54016f6ad4f(jetbrains.mps.baseLanguage.collections)" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590377(jetbrains.mps.lang.dataFlow.constraints)" version="4" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902fb(jetbrains.mps.lang.smodel.constraints)" version="21" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.lang.smodel.structure)" version="16" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902c1(jetbrains.mps.baseLanguage.constraints)" version="83" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590328(jetbrains.mps.baseLanguage.collections.constraints)" version="6" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959032e(jetbrains.mps.baseLanguage.collections.structure)" version="7" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590338(jetbrains.mps.baseLanguage.closures.structure)" version="3" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959035b(jetbrains.mps.lang.findUsages.structure)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590298(jetbrains.mps.lang.editor.constraints)" version="21" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959028c(jetbrains.mps.lang.structure.constraints)" version="11" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590358(jetbrains.mps.lang.findUsages.constraints)" version="4" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590313(jetbrains.mps.lang.refactoring.constraints)" version="4" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590334(jetbrains.mps.baseLanguage.closures.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590283(jetbrains.mps.lang.core.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895903e4(jetbrains.mps.internal.collections.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959029e(jetbrains.mps.lang.editor.structure)" version="32" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902db(jetbrains.mps.baseLanguage.blTypes.constraints)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.lang.structure.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590319(jetbrains.mps.lang.refactoring.structure)" version="1" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959037d(jetbrains.mps.lang.dataFlow.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895903fe(jetbrains.mps.baseLanguage.strings.constraints)" version="1" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590402(jetbrains.mps.baseLanguage.strings.structure)" version="9" />
  <maxImportIndex value="1" />
  <import index="1" modelUID="r:00000000-0000-4000-0000-011c89590319(jetbrains.mps.lang.refactoring.structure)" version="1" />
  <node type="jetbrains.mps.lang.dataFlow.structure.DataFlowBuilderDeclaration" id="1210945623184">
    <property name="package" value="Deprecated" />
    <link role="conceptDeclaration" targetNodeId="1.1204722970897" resolveInfo="DeleteFeatureOperation" />
    <node role="builderBlock" type="jetbrains.mps.lang.dataFlow.structure.BuilderBlock" id="1210945623185">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1210945623186">
        <node role="statement" type="jetbrains.mps.lang.dataFlow.structure.EmitCodeForStatement" id="1210945727112">
          <node role="codeFor" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210945730349">
            <node role="operand" type="jetbrains.mps.lang.dataFlow.structure.NodeParameter" id="1210945729301" />
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1210945735743">
              <link role="link" targetNodeId="1.1204722988476" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.dataFlow.structure.DataFlowBuilderDeclaration" id="1210946712795">
    <property name="package" value="RefActions" />
    <link role="conceptDeclaration" targetNodeId="1.1199619425400" resolveInfo="AbstractMoveExpression" />
    <node role="builderBlock" type="jetbrains.mps.lang.dataFlow.structure.BuilderBlock" id="1210946712796">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1210946712797">
        <node role="statement" type="jetbrains.mps.lang.dataFlow.structure.EmitCodeForStatement" id="1210946714720">
          <node role="codeFor" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210946723304">
            <node role="operand" type="jetbrains.mps.lang.dataFlow.structure.NodeParameter" id="1210946722428" />
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1210946723760">
              <link role="link" targetNodeId="1.1199619459778" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.dataFlow.structure.EmitCodeForStatement" id="1210946718114">
          <node role="codeFor" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210946727622">
            <node role="operand" type="jetbrains.mps.lang.dataFlow.structure.NodeParameter" id="1210946726871" />
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1210946729265">
              <link role="link" targetNodeId="1.1199619459779" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.dataFlow.structure.DataFlowBuilderDeclaration" id="1240302183947">
    <property name="package" value="Deprecated" />
    <link role="conceptDeclaration" targetNodeId="1.1197386846879" resolveInfo="ChangeFeatureNameOperation" />
    <node role="builderBlock" type="jetbrains.mps.lang.dataFlow.structure.BuilderBlock" id="1240302183948">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1240302183949">
        <node role="statement" type="jetbrains.mps.lang.dataFlow.structure.EmitCodeForStatement" id="1240302189841">
          <node role="codeFor" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1240302191922">
            <node role="operand" type="jetbrains.mps.lang.dataFlow.structure.NodeParameter" id="1240302191765" />
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1240302194051">
              <link role="link" targetNodeId="1.1197386861552" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.dataFlow.structure.EmitCodeForStatement" id="1240302195412">
          <node role="codeFor" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1240302199603">
            <node role="operand" type="jetbrains.mps.lang.dataFlow.structure.NodeParameter" id="1240302199555" />
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1240302200498">
              <link role="link" targetNodeId="1.1197386874459" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.dataFlow.structure.EmitCodeForStatement" id="1240302204484">
          <node role="codeFor" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1240302205893">
            <node role="operand" type="jetbrains.mps.lang.dataFlow.structure.NodeParameter" id="1240302205845" />
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1240302208241">
              <link role="link" targetNodeId="1.1197386900758" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.dataFlow.structure.DataFlowBuilderDeclaration" id="6528618226609613337">
    <property name="package" value="RefActions" />
    <link role="conceptDeclaration" targetNodeId="1.1199620589385" resolveInfo="MoveNodeToNodeExpression" />
    <node role="builderBlock" type="jetbrains.mps.lang.dataFlow.structure.BuilderBlock" id="6528618226609613338">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="6528618226609613339">
        <node role="statement" type="jetbrains.mps.lang.dataFlow.structure.EmitCodeForStatement" id="6528618226609660031">
          <node role="codeFor" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="6528618226609660032">
            <node role="operand" type="jetbrains.mps.lang.dataFlow.structure.NodeParameter" id="6528618226609660033" />
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="6528618226609660034">
              <link role="link" targetNodeId="1.1199619459778" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.dataFlow.structure.EmitCodeForStatement" id="6528618226609660035">
          <node role="codeFor" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="6528618226609660036">
            <node role="operand" type="jetbrains.mps.lang.dataFlow.structure.NodeParameter" id="6528618226609660037" />
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="6528618226609660038">
              <link role="link" targetNodeId="1.1199619459779" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.dataFlow.structure.EmitCodeForStatement" id="6528618226609613340">
          <node role="codeFor" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="6528618226609613343">
            <node role="operand" type="jetbrains.mps.lang.dataFlow.structure.NodeParameter" id="6528618226609613342" />
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="6528618226609613347">
              <link role="link" targetNodeId="1.1199620651934" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.dataFlow.structure.DataFlowBuilderDeclaration" id="478744034994505060">
    <property name="package" value="RefDecl.Arg.Parameters" />
    <link role="conceptDeclaration" targetNodeId="1.6895093993902311015" resolveInfo="AskStatement" />
    <node role="builderBlock" type="jetbrains.mps.lang.dataFlow.structure.BuilderBlock" id="478744034994505061">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="478744034994505062">
        <node role="statement" type="jetbrains.mps.baseLanguage.collections.structure.ForEachStatement" id="478744034994505074">
          <node role="variable" type="jetbrains.mps.baseLanguage.collections.structure.ForEachVariable" id="478744034994505075">
            <property name="name" value="parameter" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="478744034994505077">
            <node role="statement" type="jetbrains.mps.lang.dataFlow.structure.EmitWriteStatement" id="4312073247720489896">
              <node role="variable" type="jetbrains.mps.baseLanguage.collections.structure.ForEachVariableReference" id="4312073247720489898">
                <link role="variable" targetNodeId="478744034994505075" resolveInfo="parameter" />
              </node>
            </node>
          </node>
          <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="478744034994505079">
            <node role="operand" type="jetbrains.mps.lang.dataFlow.structure.NodeParameter" id="478744034994505080" />
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="478744034994505081">
              <link role="link" targetNodeId="1.6895093993902311020" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.dataFlow.structure.DataFlowBuilderDeclaration" id="5934994956485846055">
    <property name="package" value="RefDecl.Arg.Parameters.Chooser.Custom" />
    <link role="conceptDeclaration" targetNodeId="1.5497648299878742029" resolveInfo="CustomParameterChooser" />
    <node role="builderBlock" type="jetbrains.mps.lang.dataFlow.structure.BuilderBlock" id="5934994956485846056">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="5934994956485846057">
        <node role="statement" type="jetbrains.mps.lang.dataFlow.structure.EmitCodeForStatement" id="5934994956485846058">
          <node role="codeFor" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="5934994956485863487">
            <node role="operand" type="jetbrains.mps.lang.dataFlow.structure.NodeParameter" id="5934994956485846060" />
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="5934994956485863491">
              <link role="link" targetNodeId="1.5934994956485838241" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.dataFlow.structure.EmitCodeForStatement" id="5934994956485863493">
          <node role="codeFor" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="5934994956485863496">
            <node role="operand" type="jetbrains.mps.lang.dataFlow.structure.NodeParameter" id="5934994956485863495" />
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="5934994956485863500">
              <link role="link" targetNodeId="1.5497648299878979018" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.dataFlow.structure.EmitCodeForStatement" id="5934994956485863502">
          <node role="codeFor" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="5934994956485863505">
            <node role="operand" type="jetbrains.mps.lang.dataFlow.structure.NodeParameter" id="5934994956485863504" />
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="5934994956485863509">
              <link role="link" targetNodeId="1.5934994956485846034" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.dataFlow.structure.DataFlowBuilderDeclaration" id="5934994956485884261">
    <property name="package" value="RefDecl.Arg.Parameters.Chooser.Custom" />
    <link role="conceptDeclaration" targetNodeId="1.5934994956485884215" resolveInfo="SetValueStatement" />
    <node role="builderBlock" type="jetbrains.mps.lang.dataFlow.structure.BuilderBlock" id="5934994956485884262">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="5934994956485884263">
        <node role="statement" type="jetbrains.mps.lang.dataFlow.structure.EmitWriteStatement" id="5934994956485884276">
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="5934994956485884279">
            <node role="operand" type="jetbrains.mps.lang.dataFlow.structure.NodeParameter" id="5934994956485884278" />
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_GetAncestorOperation" id="5934994956485884283">
              <node role="parameter" type="jetbrains.mps.lang.smodel.structure.OperationParm_Concept" id="5934994956485884284">
                <node role="conceptArgument" type="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" id="5934994956485884287">
                  <link role="conceptDeclaration" targetNodeId="1.6895093993902311012" resolveInfo="RefactoringParameter" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.dataFlow.structure.EmitCodeForStatement" id="5934994956485884264">
          <node role="codeFor" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="5934994956485884267">
            <node role="operand" type="jetbrains.mps.lang.dataFlow.structure.NodeParameter" id="5934994956485884266" />
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="5934994956485884271">
              <link role="link" targetNodeId="1.5934994956485884218" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.dataFlow.structure.DataFlowBuilderDeclaration" id="5934994956485965494">
    <property name="package" value="RefDecl.Arg.Parameters.Chooser.Custom" />
    <link role="conceptDeclaration" targetNodeId="1.5934994956485965463" resolveInfo="ErrorStatement" />
    <node role="builderBlock" type="jetbrains.mps.lang.dataFlow.structure.BuilderBlock" id="5934994956485965495">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="5934994956485965496">
        <node role="statement" type="jetbrains.mps.lang.dataFlow.structure.EmitCodeForStatement" id="5934994956485965497">
          <node role="codeFor" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="5934994956485965500">
            <node role="operand" type="jetbrains.mps.lang.dataFlow.structure.NodeParameter" id="5934994956485965499" />
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="5934994956485965504">
              <link role="link" targetNodeId="1.5934994956485965470" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.dataFlow.structure.DataFlowBuilderDeclaration" id="3302086321379400383">
    <property name="package" value="RefActions" />
    <link role="conceptDeclaration" targetNodeId="1.3302086321379400330" resolveInfo="ChangeFeatureNameExpression" />
    <node role="builderBlock" type="jetbrains.mps.lang.dataFlow.structure.BuilderBlock" id="3302086321379400384">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="3302086321379400385">
        <node role="statement" type="jetbrains.mps.lang.dataFlow.structure.EmitCodeForStatement" id="3302086321379400386">
          <node role="codeFor" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="3302086321379400387">
            <node role="operand" type="jetbrains.mps.lang.dataFlow.structure.NodeParameter" id="3302086321379400388" />
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="3302086321379400401">
              <link role="link" targetNodeId="1.3302086321379400331" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.dataFlow.structure.EmitCodeForStatement" id="3302086321379400390">
          <node role="codeFor" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="3302086321379400391">
            <node role="operand" type="jetbrains.mps.lang.dataFlow.structure.NodeParameter" id="3302086321379400392" />
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="3302086321379400398">
              <link role="link" targetNodeId="1.3302086321379400332" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.dataFlow.structure.EmitCodeForStatement" id="3302086321379400394">
          <node role="codeFor" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="3302086321379400395">
            <node role="operand" type="jetbrains.mps.lang.dataFlow.structure.NodeParameter" id="3302086321379400396" />
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="3302086321379400399">
              <link role="link" targetNodeId="1.3302086321379400333" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.dataFlow.structure.DataFlowBuilderDeclaration" id="3302086321379403372">
    <property name="package" value="RefActions" />
    <link role="conceptDeclaration" targetNodeId="1.3302086321379403347" resolveInfo="DeleteFeatureExpression" />
    <node role="builderBlock" type="jetbrains.mps.lang.dataFlow.structure.BuilderBlock" id="3302086321379403373">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="3302086321379403374">
        <node role="statement" type="jetbrains.mps.lang.dataFlow.structure.EmitCodeForStatement" id="3302086321379403375">
          <node role="codeFor" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="3302086321379403376">
            <node role="operand" type="jetbrains.mps.lang.dataFlow.structure.NodeParameter" id="3302086321379403377" />
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="3302086321379403379">
              <link role="link" targetNodeId="1.3302086321379403348" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.dataFlow.structure.DataFlowBuilderDeclaration" id="4312073247720489881">
    <property name="package" value="RefDecl.Arg.Parameters" />
    <link role="conceptDeclaration" targetNodeId="1.4312073247720468747" resolveInfo="AskBooleanExpression" />
    <node role="builderBlock" type="jetbrains.mps.lang.dataFlow.structure.BuilderBlock" id="4312073247720489882">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="4312073247720489883">
        <node role="statement" type="jetbrains.mps.lang.dataFlow.structure.EmitWriteStatement" id="4312073247720489887">
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="4312073247720489890">
            <node role="operand" type="jetbrains.mps.lang.dataFlow.structure.NodeParameter" id="4312073247720489889" />
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="4312073247720715214">
              <link role="link" targetNodeId="1.4312073247720715111" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

