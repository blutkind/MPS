<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:1222075024139(jetbrains.mps.bootstrap.constraintsLanguage.plugin)">
  <persistence version="3" />
  <refactoringHistory />
  <language namespace="jetbrains.mps.bootstrap.pluginLanguage" />
  <language namespace="jetbrains.mps.baseLanguage" />
  <language namespace="jetbrains.mps.baseLanguage.classifiers" />
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage" />
  <languageAspect modelUID="r:1222075024225(jetbrains.mps.bootstrap.pluginLanguage.constraints)" version="19" />
  <languageAspect modelUID="r:1222075024232(jetbrains.mps.bootstrap.pluginLanguage.structure)" version="14" />
  <languageAspect modelUID="r:1222075024065(jetbrains.mps.baseLanguage.constraints)" version="83" />
  <languageAspect modelUID="r:1222075024074(jetbrains.mps.baseLanguage.structure)" version="0" />
  <languageAspect modelUID="r:1222075024238(jetbrains.mps.baseLanguage.classifiers.constraints)" version="7" />
  <languageAspect modelUID="r:1222075024123(jetbrains.mps.bootstrap.smodelLanguage.constraints)" version="21" />
  <languageAspect modelUID="r:1222075024129(jetbrains.mps.bootstrap.smodelLanguage.structure)" version="1" />
  <languageAspect modelUID="r:1222075024168(jetbrains.mps.baseLanguage.ext.collections.lang.constraints)" version="6" />
  <languageAspect modelUID="r:1222075024174(jetbrains.mps.baseLanguage.ext.collections.lang.structure)" version="1" />
  <languageAspect modelUID="r:1222075024184(jetbrains.mps.closures.structure)" version="0" />
  <languageAspect modelUID="r:1222075024141(jetbrains.mps.bootstrap.constraintsLanguage.structure)" version="0" />
  <languageAspect modelUID="r:1222075024012(jetbrains.mps.bootstrap.structureLanguage.constraints)" version="11" />
  <languageAspect modelUID="r:1222075024058(jetbrains.mps.bootstrap.sharedConcepts.constraints)" version="0" />
  <languageAspect modelUID="r:1222075024135(jetbrains.mps.bootstrap.constraintsLanguage.constraints)" version="9" />
  <languageAspect modelUID="r:1222075024180(jetbrains.mps.closures.constraints)" version="2" />
  <languageAspect modelUID="r:1222075024003(jetbrains.mps.core.constraints)" version="2" />
  <languageAspect modelUID="r:1222075024356(jetbrains.mps.internal.collections.constraints)" version="2" />
  <languageAspect modelUID="r:1222075024091(jetbrains.mps.baseLanguage.blTypes.constraints)" version="0" />
  <maxImportIndex value="30" />
  <import index="2" modelUID="f:java_stub#jetbrains.mps.smodel.constraints(jetbrains.mps.smodel.constraints@java_stub)" version="-1" />
  <import index="12" modelUID="f:java_stub#jetbrains.mps.nodeEditor(jetbrains.mps.nodeEditor@java_stub)" version="-1" />
  <import index="16" modelUID="f:java_stub#jetbrains.mps.project(jetbrains.mps.project@java_stub)" version="-1" />
  <node type="jetbrains.mps.bootstrap.pluginLanguage.structure.ProjectPluginDeclaration" id="1208436352096">
    <property name="name" value="ConstaintsLanguagePlugin" />
    <node role="fieldDeclaration" type="jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierFieldDeclaration" id="1215438637915">
      <property name="name" value="myConstraintsChecker" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1215438637916" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1215438646788">
        <link role="classifier" targetNodeId="2.~ConstraintsChecker" resolveInfo="ConstraintsChecker" />
      </node>
      <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1215438655227">
        <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1215438655228">
          <link role="baseMethodDeclaration" targetNodeId="2.~ConstraintsChecker.&lt;init&gt;()" resolveInfo="ConstraintsChecker" />
        </node>
      </node>
    </node>
    <node role="initBlock" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ProjectPluginInitBlock" id="1208436374875">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208436374876">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1208436397039">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1208436397040">
            <property name="name" value="highlighter" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208436397041">
              <link role="classifier" targetNodeId="12.~Highlighter" resolveInfo="Highlighter" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208436397042">
              <node role="operand" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ConceptFunctionParameter_MPSProject" id="1208436397043" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208436397044">
                <link role="baseMethodDeclaration" targetNodeId="16.~MPSProject.getComponent(java.lang.Class):java.lang.Object" resolveInfo="getComponent" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression" id="1208436397045">
                  <link role="classifier" targetNodeId="12.~Highlighter" resolveInfo="Highlighter" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1208436397046">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208436397047">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1208436397048">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208436397049">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208436397050">
                  <link role="variableDeclaration" targetNodeId="1208436397040" resolveInfo="highlighter" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208436397051">
                  <link role="baseMethodDeclaration" targetNodeId="12.~Highlighter.addChecker(jetbrains.mps.nodeEditor.IEditorChecker):void" resolveInfo="addChecker" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208436397052">
                    <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1208436397053" />
                    <node role="operation" type="jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierFieldAccessOperation" id="1215438662761">
                      <link role="member" targetNodeId="1215438637915" resolveInfo="myConstraintsChecker" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1208436397055">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1208436397056" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208436397057">
              <link role="variableDeclaration" targetNodeId="1208436397040" resolveInfo="highlighter" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="disposeBlock" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ProjectPluginDisposeBlock" id="1208436375612">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208436375613">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1208436450682">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1208436450683">
            <property name="name" value="highlighter" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208436450684">
              <link role="classifier" targetNodeId="12.~Highlighter" resolveInfo="Highlighter" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208436450685">
              <node role="operand" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ConceptFunctionParameter_MPSProject" id="1208436450686" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208436450687">
                <link role="baseMethodDeclaration" targetNodeId="16.~MPSProject.getComponent(java.lang.Class):java.lang.Object" resolveInfo="getComponent" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression" id="1208436450688">
                  <link role="classifier" targetNodeId="12.~Highlighter" resolveInfo="Highlighter" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1208436450704">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208436450705">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1208436450706">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208436450707">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208436450708">
                  <link role="variableDeclaration" targetNodeId="1208436450683" resolveInfo="highlighter" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208436450709">
                  <link role="baseMethodDeclaration" targetNodeId="12.~Highlighter.removeChecker(jetbrains.mps.nodeEditor.IEditorChecker):void" resolveInfo="removeChecker" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208436450710">
                    <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1208436450711" />
                    <node role="operation" type="jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierFieldAccessOperation" id="1215438665465">
                      <link role="member" targetNodeId="1215438637915" resolveInfo="myConstraintsChecker" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1208436450713">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1208436450714" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208436450715">
              <link role="variableDeclaration" targetNodeId="1208436450683" resolveInfo="highlighter" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

