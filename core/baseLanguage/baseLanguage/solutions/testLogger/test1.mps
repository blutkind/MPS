<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:00000000-0000-4000-0000-011c895903a4(test1)">
  <persistence version="3" />
  <refactoringHistory />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="83888646-71ce-4f1c-9c53-c54016f6ad4f(jetbrains.mps.baseLanguage.collections)" />
  <language namespace="fd392034-7849-419d-9071-12563d152375(jetbrains.mps.baseLanguage.closures)" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902c1(jetbrains.mps.baseLanguage.constraints)" version="83" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="1" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590283(jetbrains.mps.lang.core.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902db(jetbrains.mps.baseLanguage.blTypes.constraints)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959032e(jetbrains.mps.baseLanguage.collections.structure)" version="7" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590328(jetbrains.mps.baseLanguage.collections.constraints)" version="6" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590334(jetbrains.mps.baseLanguage.closures.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590338(jetbrains.mps.baseLanguage.closures.structure)" version="3" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895903fe(jetbrains.mps.baseLanguage.strings.constraints)" version="1" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590402(jetbrains.mps.baseLanguage.strings.structure)" version="9" />
  <maxImportIndex value="3" />
  <import index="1" modelUID="r:00000000-0000-4000-0000-011c895903a5(test2)" version="-1" />
  <import index="3" modelUID="f:java_stub#java.lang(java.lang@java_stub)" version="-1" />
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1191319992725">
    <property name="name" value="A" />
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1191319992726" />
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1224501978738">
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1224501978739" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1224501978740" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1224501978741">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="8533578990689130298">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="8533578990689130299">
            <property name="name" value="c" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="8533578990689130300">
              <link role="classifier" targetNodeId="4539702814067579805" resolveInfo="C" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticInnerClassifiers" type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="4539702814067105036">
      <property name="name" value="B" />
      <property name="nonStatic" value="true" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="4539702814067105037" />
      <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="4539702814067105038">
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="4539702814067105039" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="4539702814067105040" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="4539702814067105041">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="8533578990689130295">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="8533578990689130296">
              <property name="name" value="c" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="8533578990689130297">
                <link role="classifier" targetNodeId="4539702814067579805" resolveInfo="C" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="staticInnerClassifiers" type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="4539702814067579805">
        <property name="name" value="C" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="4539702814067579806" />
        <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="4539702814067579807">
          <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="4539702814067579808" />
          <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="4539702814067579809" />
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="4539702814067579810">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="8533578990689130292">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="8533578990689130293">
                <property name="name" value="c" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="8533578990689130294">
                  <link role="classifier" targetNodeId="4539702814067579805" resolveInfo="C" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="staticInnerClassifiers" type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="4539702814067580420">
          <property name="name" value="D" />
          <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="4539702814067580421" />
          <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="4539702814067580422">
            <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="4539702814067580423" />
            <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="4539702814067580424" />
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="4539702814067580425">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="8533578990689130289">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="8533578990689130290">
                  <property name="name" value="c" />
                  <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="8533578990689130291">
                    <link role="classifier" targetNodeId="4539702814067579805" resolveInfo="A.B.C" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="4539702814068031372">
    <property name="name" value="A2" />
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="4539702814068031373" />
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="4539702814068031374">
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="4539702814068031375" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="4539702814068031376" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="4539702814068031377">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="4539702814068079767">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="4539702814068079768">
            <property name="name" value="aaa" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="4539702814068079769">
              <link role="classifier" targetNodeId="4539702814068031372" resolveInfo="A2" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticInnerClassifiers" type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="4539702814068031388">
      <property name="name" value="B" />
      <property name="nonStatic" value="true" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="4539702814068031389" />
      <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="4539702814068031390">
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="4539702814068031391" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="4539702814068031392" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="4539702814068031393" />
      </node>
      <node role="staticInnerClassifiers" type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="4539702814068031407">
        <property name="name" value="C" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="4539702814068031408" />
        <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="4539702814068031409">
          <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="4539702814068031410" />
          <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="4539702814068031411" />
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="4539702814068031412">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="4539702814068031419">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="4539702814068031420">
                <property name="name" value="bc" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="4539702814068031421">
                  <link role="classifier" targetNodeId="4539702814068031407" resolveInfo="C" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="staticInnerClassifiers" type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="4539702814068031422">
          <property name="name" value="D" />
          <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="4539702814068031423" />
          <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="4539702814068031424">
            <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="4539702814068031425" />
            <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="4539702814068031426" />
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="4539702814068031427" />
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

