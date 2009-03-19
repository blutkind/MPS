<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:00000000-0000-4000-0000-011c895905e2(jetbrains.mpslite.sandbox)">
  <persistence version="3" />
  <refactoringHistory />
  <language namespace="3fe6ec39-7405-4314-abfd-5964c9c40e6b(jetbrains.mpslite)" />
  <language namespace="0452c5e6-046a-41b1-a1c2-bfa47ef3ae0b(jetbrains.mps.nanoj)" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="83888646-71ce-4f1c-9c53-c54016f6ad4f(jetbrains.mps.baseLanguage.collections)" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895905dc(jetbrains.mps.nanoj.constraints)" version="45" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959028c(jetbrains.mps.lang.structure.constraints)" version="11" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590283(jetbrains.mps.lang.core.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.lang.structure.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895905d0(jetbrains.mpslite.constraints)" version="27" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902c1(jetbrains.mps.baseLanguage.constraints)" version="83" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="1" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902db(jetbrains.mps.baseLanguage.blTypes.constraints)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590518(jetbrains.mps.baseLanguage.regexp.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590515(jetbrains.mps.baseLanguage.regexp.constraints)" version="3" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895905d5(jetbrains.mpslite.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959032e(jetbrains.mps.baseLanguage.collections.structure)" version="4" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590328(jetbrains.mps.baseLanguage.collections.constraints)" version="6" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590334(jetbrains.mps.baseLanguage.closures.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590338(jetbrains.mps.baseLanguage.closures.structure)" version="3" />
  <maxImportIndex value="3" />
  <import index="2" modelUID="r:00000000-0000-4000-0000-011c895905e1(jetbrains.mpslite.nanoj)" version="-1" />
  <import index="3" modelUID="r:00000000-0000-4000-0000-011c895905e2(jetbrains.mpslite.sandbox)" version="-1" />
  <node type="jetbrains.mpslite.structure.MPSLiteConceptTemplate" id="1237380763528">
    <property name="name" value="PlusExpression" />
    <node role="constantPlaceholder" type="jetbrains.mpslite.structure.ConstantTextPlaceholder" id="1237382014867">
      <property name="name" value="+" />
    </node>
    <node role="childPlaceholder" type="jetbrains.mpslite.structure.ChildPlaceholder" id="1237380772587">
      <property name="name" value="left" />
    </node>
    <node role="childPlaceholder" type="jetbrains.mpslite.structure.ChildPlaceholder" id="1237380775736">
      <property name="name" value="right" />
    </node>
    <node role="lineList" type="jetbrains.mpslite.structure.LineList" id="1237380763529">
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1237380841288">
        <node role="linePart" type="jetbrains.mpslite.structure.ChildPlaceholderReference" id="1237380871906">
          <link role="placeholder" targetNodeId="1237380772587" resolveInfo="left" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantPlaceholderReference" id="1237382026021">
          <link role="placeholder" targetNodeId="1237382014867" resolveInfo="+" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.ChildPlaceholderReference" id="1237380883333">
          <link role="placeholder" targetNodeId="1237380775736" resolveInfo="right" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mpslite.structure.MPSLiteConceptTemplate" id="1237384324136">
    <property name="name" value="Variable" />
    <node role="propertyPlaceholder" type="jetbrains.mpslite.structure.PropertyPlaceholder" id="1237384396620">
      <property name="name" value="varName" />
    </node>
    <node role="constantPlaceholder" type="jetbrains.mpslite.structure.ConstantTextPlaceholder" id="1237384374573">
      <property name="name" value="keyword" />
    </node>
    <node role="childPlaceholder" type="jetbrains.mpslite.structure.ChildPlaceholder" id="1237384345710">
      <property name="name" value="type" />
    </node>
    <node role="childPlaceholder" type="jetbrains.mpslite.structure.ChildPlaceholder" id="1237384350307">
      <property name="name" value="initializer" />
    </node>
    <node role="lineList" type="jetbrains.mpslite.structure.LineList" id="1237384324137">
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1237384404639">
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantPlaceholderReference" id="1237384411065">
          <link role="placeholder" targetNodeId="1237384374573" resolveInfo="keyword" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.PropertyPlaceholderReference" id="1237384495161">
          <link role="placeholder" targetNodeId="1237384396620" resolveInfo="varName" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantLinePart" id="1237384452124">
          <property name="text" value=":" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.ChildPlaceholderReference" id="1237384477061">
          <link role="placeholder" targetNodeId="1237384345710" resolveInfo="type" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mpslite.structure.MPSLiteConceptDeclaration" id="1237458974423">
    <property name="name" value="UnaryMinus" />
    <node role="lineList" type="jetbrains.mpslite.structure.LineList" id="1237458974424">
      <node role="line" type="jetbrains.mpslite.structure.Line" id="1237459007623">
        <node role="linePart" type="jetbrains.mpslite.structure.ConstantLinePart" id="1237459012584">
          <property name="text" value="-" />
        </node>
        <node role="linePart" type="jetbrains.mpslite.structure.ConcreteChildPart" id="1237459020917">
          <property name="name" value="exp" />
          <link role="target" targetNodeId="1237459042860" resolveInfo="Expression" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mpslite.structure.MPSLiteConceptDeclaration" id="1237459042860">
    <property name="name" value="Expression" />
    <node role="lineList" type="jetbrains.mpslite.structure.LineList" id="1237459042861" />
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1237461981718">
    <property name="name" value="Tuples" />
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1237461981719" />
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1237461981721">
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1237461981722" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1237461981723" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1237461981724">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1237465873522">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1237465873523">
            <property name="name" value="ddd" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.TupleType" id="1237465873524">
              <node role="member" type="jetbrains.mps.baseLanguage.structure.TupleMember" id="1237465911805">
                <property name="name" value="ert" />
                <link role="declaration" targetNodeId="1237465911805" resolveInfo="ert" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.StringType" id="1237465914226" />
              </node>
              <node role="member" type="jetbrains.mps.baseLanguage.structure.TupleMember" id="1237465917891">
                <property name="name" value="ssdf" />
                <link role="declaration" targetNodeId="1237465917891" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1237465920320" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1237471962350">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237471963148">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1237471994248">
              <link role="variableDeclaration" targetNodeId="1237465873523" resolveInfo="ddd" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.TupleMemberAccessOperation" id="1237471995902">
              <link role="member" targetNodeId="1237465911805" resolveInfo="ert" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1237471942805" />
      </node>
    </node>
  </node>
</model>

