<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:00000000-0000-4000-0000-011c895903a5(test2)">
  <persistence version="3" />
  <refactoringHistory />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902c1(jetbrains.mps.baseLanguage.constraints)" version="83" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590283(jetbrains.mps.lang.core.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902db(jetbrains.mps.baseLanguage.blTypes.constraints)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" />
  <maxImportIndex value="1" />
  <import index="1" modelUID="f:java_stub#java.lang(java.lang@java_stub)" version="-1" />
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1191320001477">
    <property name="name" value="B" />
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration" id="1191933883592">
      <property name="name" value="foo" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1191933883593" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1191933883594" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1191933883595">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1224574507647">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.EnumValuesExpression" id="1224581271267">
            <link role="enumClass" targetNodeId="1224574178631" resolveInfo="ABCDEF" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1224575613066">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.EnumValueOfExpression" id="1224581266796">
            <link role="enumClass" targetNodeId="1224574178631" resolveInfo="ABCDEF" />
            <node role="value" type="jetbrains.mps.baseLanguage.structure.Expression" id="1224581266797" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1224577704182">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.EnumValuesExpression" id="1224577726328">
            <link role="enumClass" targetNodeId="1224574178631" resolveInfo="ABCDEF" />
          </node>
        </node>
      </node>
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1191320001478" />
    <node role="staticField" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration" id="1224573028547">
      <property name="name" value="abc" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1224573028548" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1224575284928">
        <link role="classifier" targetNodeId="1.~AbstractMethodError" resolveInfo="AbstractMethodError" />
      </node>
    </node>
    <node role="staticInnerClassifiers" type="jetbrains.mps.baseLanguage.structure.EnumClass" id="1224574178631">
      <property name="name" value="ABCDEF" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1224574178632" />
      <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1224574178648">
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1224574178649" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1224574178650" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1224574178651" />
      </node>
      <node role="enumConstant" type="jetbrains.mps.baseLanguage.structure.EnumConstantDeclaration" id="1224577688019">
        <property name="name" value="A" />
      </node>
      <node role="staticMethod" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration" id="1224577696365">
        <property name="name" value="aaa" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1224577696366" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1224577696367" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1224577696368" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1191327608581">
    <property name="name" value="C" />
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration" id="1192532450961">
      <property name="name" value="boo" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1192532450962" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1192532450963" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1192532450964">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1224580894646">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1224580894647">
            <property name="name" value="value" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1224580894648">
              <link role="classifier" targetNodeId="1224580698120" resolveInfo="AAAA" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.EnumValueOfExpression" id="1224580894649">
              <link role="enumClass" targetNodeId="1224580698120" resolveInfo="AAAA" />
              <node role="value" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1224580894650">
                <property name="value" value="abc" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1224580691273">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.EnumValuesExpression" id="1224580693931">
            <link role="enumClass" targetNodeId="1224580427854" resolveInfo="CDE" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1224580321248">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1224580321249">
            <link role="classifier" targetNodeId="1191327608581" resolveInfo="C" />
            <link role="variableDeclaration" targetNodeId="1224580290870" resolveInfo="a" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1192532475677">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1192532476804">
            <link role="baseMethodDeclaration" targetNodeId="1191933883592" resolveInfo="foo" />
            <link role="classConcept" targetNodeId="1191320001477" resolveInfo="B" />
          </node>
        </node>
      </node>
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1191327608582" />
    <node role="staticField" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration" id="1224580290870">
      <property name="name" value="a" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1224580314479" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1224580292545">
        <link role="classifier" targetNodeId="1191327608581" resolveInfo="C" />
      </node>
    </node>
    <node role="staticField" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration" id="1224580293593">
      <property name="name" value="b" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1224580315855" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1224580294658">
        <link role="classifier" targetNodeId="1191327608581" resolveInfo="C" />
      </node>
    </node>
    <node role="staticField" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration" id="1224580295503">
      <property name="name" value="c" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1224580317231" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1224580297240">
        <link role="classifier" targetNodeId="1191327608581" resolveInfo="C" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.EnumClass" id="1224580427854">
    <property name="name" value="CDE" />
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1224580427855" />
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1224580427856">
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1224580427857" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1224580427858" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1224580427859" />
    </node>
    <node role="enumConstant" type="jetbrains.mps.baseLanguage.structure.EnumConstantDeclaration" id="1224580429845">
      <property name="name" value="A" />
    </node>
    <node role="enumConstant" type="jetbrains.mps.baseLanguage.structure.EnumConstantDeclaration" id="1224580431049">
      <property name="name" value="B" />
    </node>
    <node role="enumConstant" type="jetbrains.mps.baseLanguage.structure.EnumConstantDeclaration" id="1224580432206">
      <property name="name" value="C" />
    </node>
    <node role="enumConstant" type="jetbrains.mps.baseLanguage.structure.EnumConstantDeclaration" id="1224580434302">
      <property name="name" value="D" />
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.EnumClass" id="1224580698120">
    <property name="name" value="AAAA" />
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1224580698121" />
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1224580698122">
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1224580698123" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1224580698124" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1224580698125" />
    </node>
  </node>
</model>

