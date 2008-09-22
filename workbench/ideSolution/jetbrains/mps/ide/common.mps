<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:1222075024549(jetbrains.mps.ide.common)">
  <persistence version="3" />
  <refactoringHistory />
  <language namespace="jetbrains.mps.baseLanguage">
    <languageAspect modelUID="r:1222075024065(jetbrains.mps.baseLanguage.constraints)" version="83" />
    <languageAspect modelUID="r:1222075024074(jetbrains.mps.baseLanguage.structure)" version="0" />
  </language>
  <language namespace="jetbrains.mps.uiLanguage">
    <languageAspect modelUID="r:1222075024718(jetbrains.mps.uiLanguage.constraints)" version="26" />
    <languageAspect modelUID="r:1222075024723(jetbrains.mps.uiLanguage.structure)" version="1" />
  </language>
  <language namespace="jetbrains.mps.baseLanguage.classifiers">
    <languageAspect modelUID="r:1222075024238(jetbrains.mps.baseLanguage.classifiers.constraints)" version="7" />
  </language>
  <languageAspect modelUID="r:1222075024141(jetbrains.mps.bootstrap.constraintsLanguage.structure)" version="0" />
  <languageAspect modelUID="r:1222075024003(jetbrains.mps.core.constraints)" version="2" />
  <maxImportIndex value="6" />
  <import index="1" modelUID="f:java_stub#java.lang(java.lang@java_stub)" version="-1" />
  <import index="3" modelUID="f:java_stub#java.awt(java.awt@java_stub)" version="-1" />
  <import index="4" modelUID="f:java_stub#jetbrains.mps.ide.ui.filechoosers.treefilechooser(jetbrains.mps.ide.ui.filechoosers.treefilechooser@java_stub)" version="-1" />
  <import index="5" modelUID="f:java_stub#jetbrains.mps.vfs(jetbrains.mps.vfs@java_stub)" version="-1" />
  <import index="6" modelUID="r:1222075024717(jetbrains.mps.uiLanguage.components)" version="-1" />
  <node type="jetbrains.mps.uiLanguage.structure.ComponentDeclaration" id="1203601634745">
    <property name="name" value="PathField" />
    <node role="root" type="jetbrains.mps.uiLanguage.structure.ComponentInstance" id="1203601640840">
      <link role="componentDeclaration" targetNodeId="6.1202816402995" resolveInfo="Panel" />
      <node role="content" type="jetbrains.mps.uiLanguage.structure.AttributeValue" id="1203601642060">
        <link role="attribute" targetNodeId="6.1202393600503" resolveInfo="layout" />
        <node role="value" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1217888376475">
          <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1217888376477">
            <link role="baseMethodDeclaration" targetNodeId="3.~BorderLayout.&lt;init&gt;()" resolveInfo="BorderLayout" />
          </node>
        </node>
      </node>
      <node role="content" type="jetbrains.mps.uiLanguage.structure.ComponentInstance" id="1203601653846">
        <property name="name" value="pathField" />
        <link role="componentDeclaration" targetNodeId="6.1202464198724" resolveInfo="TextField" />
        <node role="content" type="jetbrains.mps.uiLanguage.structure.AttributeValue" id="1203601680572">
          <link role="attribute" targetNodeId="6.1202464208353" resolveInfo="text" />
          <node role="value" type="jetbrains.mps.uiLanguage.structure.BindExpression" id="1203601681731">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203601686659">
              <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1205754224173" />
              <node role="operation" type="jetbrains.mps.uiLanguage.structure.AttributeReferenceOperation" id="1203601687630">
                <link role="member" targetNodeId="1203601661865" resolveInfo="path" />
              </node>
            </node>
          </node>
        </node>
        <node role="content" type="jetbrains.mps.uiLanguage.structure.AttributeValue" id="1203601991465">
          <link role="attribute" targetNodeId="6.1202818338918" resolveInfo="columns" />
          <node role="value" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1203602003865">
            <property name="value" value="40" />
          </node>
        </node>
        <node role="content" type="jetbrains.mps.uiLanguage.structure.LayoutConstraint" id="1203601691507">
          <node role="constraint" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1203601704010">
            <link role="classifier" targetNodeId="3.~BorderLayout" resolveInfo="BorderLayout" />
            <link role="variableDeclaration" targetNodeId="3.~BorderLayout.CENTER" resolveInfo="CENTER" />
          </node>
        </node>
      </node>
      <node role="content" type="jetbrains.mps.uiLanguage.structure.ComponentInstance" id="1203601707293">
        <link role="componentDeclaration" targetNodeId="6.1202393560969" resolveInfo="Button" />
        <node role="content" type="jetbrains.mps.uiLanguage.structure.AttributeValue" id="1203601708701">
          <link role="attribute" targetNodeId="6.1202393575288" resolveInfo="text" />
          <node role="value" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1203601709359">
            <property name="value" value="..." />
          </node>
        </node>
        <node role="content" type="jetbrains.mps.uiLanguage.structure.ActionHandler" id="1203605502672">
          <node role="handler" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203605531678">
            <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1205754224325" />
            <node role="operation" type="jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierMethodCallOperation" id="1205834446436">
              <link role="member" targetNodeId="1203605506361" resolveInfo="choosePathClicked" />
            </node>
          </node>
        </node>
        <node role="content" type="jetbrains.mps.uiLanguage.structure.LayoutConstraint" id="1203601719721">
          <node role="constraint" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1203601721316">
            <link role="classifier" targetNodeId="3.~BorderLayout" resolveInfo="BorderLayout" />
            <link role="variableDeclaration" targetNodeId="3.~BorderLayout.EAST" resolveInfo="EAST" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.uiLanguage.structure.ComponentController" id="1203601659817">
    <link role="component" targetNodeId="1203601634745" resolveInfo="PathField" />
    <node role="componentMethod" type="jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierMethodDeclaration" id="1203605506361">
      <property name="name" value="choosePathClicked" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1203605517894" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1203605506363">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1203605544101">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1203605544102">
            <property name="name" value="oldPath" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1203605544103">
              <link role="classifier" targetNodeId="1.~String" resolveInfo="String" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203605584048">
              <node role="operand" type="jetbrains.mps.uiLanguage.structure.ComponentReference" id="1203605578127">
                <link role="component" targetNodeId="1203601653846" resolveInfo="pathField" />
              </node>
              <node role="operation" type="jetbrains.mps.uiLanguage.structure.AttributeReferenceOperation" id="1203605585565">
                <link role="member" targetNodeId="6.1202464208353" resolveInfo="text" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1203605648064">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1203605648065">
            <property name="name" value="chooser" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1203605648066">
              <link role="classifier" targetNodeId="4.~TreeFileChooser" resolveInfo="TreeFileChooser" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1217888370243">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1217888370245">
                <link role="baseMethodDeclaration" targetNodeId="4.~TreeFileChooser.&lt;init&gt;()" resolveInfo="TreeFileChooser" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1203605653852">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1217628916271">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203605699313">
              <link role="variableDeclaration" targetNodeId="1203605648065" resolveInfo="chooser" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1217628916272">
              <link role="baseMethodDeclaration" targetNodeId="4.~TreeFileChooser.setMode(int):void" resolveInfo="setMode" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203605663842">
                <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1205754224241" />
                <node role="operation" type="jetbrains.mps.uiLanguage.structure.AttributeReferenceOperation" id="1203605664782">
                  <link role="member" targetNodeId="1203605603115" resolveInfo="mode" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1203605676534">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1203605676535">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1203605686592">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1217628918040">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203605686593">
                  <link role="variableDeclaration" targetNodeId="1203605648065" resolveInfo="chooser" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1217628918041">
                  <link role="baseMethodDeclaration" targetNodeId="4.~TreeFileChooser.setInitialFile(jetbrains.mps.vfs.IFile):void" resolveInfo="setInitialFile" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1217888387895">
                    <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1217888387897">
                      <link role="baseMethodDeclaration" targetNodeId="5.~FileSystemFile.&lt;init&gt;(java.lang.String)" resolveInfo="FileSystemFile" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203605709097">
                        <link role="variableDeclaration" targetNodeId="1203605544102" resolveInfo="oldPath" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1203605683948">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1203605684810" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203605683322">
              <link role="variableDeclaration" targetNodeId="1203605544102" resolveInfo="oldPath" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1203605716177">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1203605716178">
            <property name="name" value="result" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1203605716179">
              <link role="classifier" targetNodeId="5.~IFile" resolveInfo="IFile" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1217628890840">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203605719291">
                <link role="variableDeclaration" targetNodeId="1203605648065" resolveInfo="chooser" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1217628890841">
                <link role="baseMethodDeclaration" targetNodeId="4.~TreeFileChooser.showDialog():jetbrains.mps.vfs.IFile" resolveInfo="showDialog" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1203605744312">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1203605744313">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1203605748477">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1203605757001">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1217628845412">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203605757801">
                    <link role="variableDeclaration" targetNodeId="1203605716178" resolveInfo="result" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1217628845413">
                    <link role="baseMethodDeclaration" targetNodeId="5.~IFile.getPath():java.lang.String" resolveInfo="getPath" />
                  </node>
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203605755201">
                  <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1205754224086" />
                  <node role="operation" type="jetbrains.mps.uiLanguage.structure.AttributeReferenceOperation" id="1203605756203">
                    <link role="member" targetNodeId="1203601661865" resolveInfo="path" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1203605745802">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1203605746664" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203605745129">
              <link role="variableDeclaration" targetNodeId="1203605716178" resolveInfo="result" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="attribute" type="jetbrains.mps.uiLanguage.structure.AttributeDeclaration" id="1203601661865">
      <property name="name" value="path" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1203601663492">
        <link role="classifier" targetNodeId="1.~String" resolveInfo="String" />
      </node>
    </node>
    <node role="attribute" type="jetbrains.mps.uiLanguage.structure.AttributeDeclaration" id="1203605603115">
      <property name="name" value="mode" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1203605604679" />
    </node>
    <node role="afterConstruction" type="jetbrains.mps.uiLanguage.structure.AfterConstructionBlock" id="1203605607368">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1203605613683">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1203605616825">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1203605620471">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1203605635110">
              <link role="classifier" targetNodeId="4.~TreeFileChooser" resolveInfo="TreeFileChooser" />
              <link role="variableDeclaration" targetNodeId="4.~TreeFileChooser.MODE_DIRECTORIES" resolveInfo="MODE_DIRECTORIES" />
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203605617937">
              <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1205754224233" />
              <node role="operation" type="jetbrains.mps.uiLanguage.structure.AttributeReferenceOperation" id="1203605618907">
                <link role="member" targetNodeId="1203605603115" resolveInfo="mode" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

