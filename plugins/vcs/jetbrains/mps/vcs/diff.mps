<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:5744ed46-c83f-47cd-94ce-f24d1f92d6a1(jetbrains.mps.vcs.diff)">
  <persistence version="6" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="28f9e497-3b42-4291-aeba-0a1039153ab1(jetbrains.mps.lang.plugin)" />
  <import index="14" modelUID="r:0aa2e89a-3f2c-4ca7-bd78-489a5b116779(jetbrains.mps.vcs.diff.oldchanges)" version="-1" />
  <import index="27" modelUID="r:cd7c9d90-25b3-4a54-a510-a0bcc7072c1d(jetbrains.mps.vcs)" version="-1" />
  <import index="1" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" implicit="yes" />
  <import index="2" modelUID="f:java_stub#java.lang(java.lang@java_stub)" version="-1" implicit="yes" />
  <import index="3" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" implicit="yes" />
  <import index="4" modelUID="f:java_stub#java.util(java.util@java_stub)" version="-1" implicit="yes" />
  <import index="5" modelUID="f:java_stub#com.intellij.openapi.ui(com.intellij.openapi.ui@java_stub)" version="-1" implicit="yes" />
  <import index="6" modelUID="f:java_stub#jetbrains.mps.smodel.search(jetbrains.mps.smodel.search@java_stub)" version="-1" implicit="yes" />
  <import index="7" modelUID="r:5744ed46-c83f-47cd-94ce-f24d1f92d6a1(jetbrains.mps.vcs.diff)" version="-1" implicit="yes" />
  <import index="8" modelUID="f:java_stub#com.intellij.openapi.application(com.intellij.openapi.application@java_stub)" version="-1" implicit="yes" />
  <import index="9" modelUID="f:java_stub#jetbrains.mps.project.structure.modules(jetbrains.mps.project.structure.modules@java_stub)" version="-1" implicit="yes" />
  <import index="10" modelUID="f:java_stub#jetbrains.mps.fileTypes(jetbrains.mps.fileTypes@java_stub)" version="-1" implicit="yes" />
  <import index="11" modelUID="f:java_stub#jetbrains.mps.project(jetbrains.mps.project@java_stub)" version="-1" implicit="yes" />
  <import index="12" modelUID="f:java_stub#jetbrains.mps.vcs(jetbrains.mps.vcs@java_stub)" version="-1" implicit="yes" />
  <import index="13" modelUID="f:java_stub#org.jetbrains.annotations(org.jetbrains.annotations@java_stub)" version="-1" implicit="yes" />
  <import index="15" modelUID="f:java_stub#com.intellij.openapi.diff(com.intellij.openapi.diff@java_stub)" version="-1" implicit="yes" />
  <import index="16" modelUID="f:java_stub#com.intellij.openapi.util(com.intellij.openapi.util@java_stub)" version="-1" implicit="yes" />
  <import index="17" modelUID="f:java_stub#jetbrains.mps.util(jetbrains.mps.util@java_stub)" version="-1" implicit="yes" />
  <import index="18" modelUID="f:java_stub#org.apache.commons.lang(org.apache.commons.lang@java_stub)" version="-1" implicit="yes" />
  <import index="20" modelUID="f:java_stub#jetbrains.mps.logging(jetbrains.mps.logging@java_stub)" version="-1" implicit="yes" />
  <import index="21" modelUID="f:java_stub#jetbrains.mps.smodel(jetbrains.mps.smodel@java_stub)" version="-1" implicit="yes" />
  <import index="22" modelUID="f:java_stub#com.intellij.openapi.vfs(com.intellij.openapi.vfs@java_stub)" version="-1" implicit="yes" />
  <import index="23" modelUID="f:java_stub#com.intellij.openapi.diff.impl.mergeTool(com.intellij.openapi.diff.impl.mergeTool@java_stub)" version="-1" implicit="yes" />
  <import index="24" modelUID="f:java_stub#jetbrains.mps.lang.structure.structure(jetbrains.mps.lang.structure.structure@java_stub)" version="-1" implicit="yes" />
  <import index="25" modelUID="f:java_stub#com.intellij.openapi.project(com.intellij.openapi.project@java_stub)" version="-1" implicit="yes" />
  <import index="26" modelUID="f:java_stub#java.io(java.io@java_stub)" version="-1" implicit="yes" />
  <import index="28" modelUID="r:00000000-0000-4000-0000-011c89590338(jetbrains.mps.baseLanguage.closures.structure)" version="3" implicit="yes" />
  <import index="29" modelUID="r:00000000-0000-4000-0000-011c89590368(jetbrains.mps.lang.plugin.structure)" version="23" implicit="yes" />
  <root_stubs>
    <node type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="4707157387247628917">
      <property name="1.name:0" value="DiffBuilder" />
    </node>
    <node type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="4707157387247630609">
      <property name="1.name:0" value="MPSDiffRequestFactory" />
    </node>
    <node type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="4707157387247630666">
      <property name="1.name:0" value="Merger" />
    </node>
    <node type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="4707157387247632367">
      <property name="1.name:0" value="Conflict" />
    </node>
    <node type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="4707157387247632403">
      <property name="1.name:0" value="Warning" />
    </node>
    <node type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="4707157387247632445">
      <property name="1.name:0" value="ModelMergeRequest" />
    </node>
  </root_stubs>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="4707157387247628917">
    <property name="1.name:0" value="DiffBuilder" />
    <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4707157387247628918" />
    <node role="3.staticField:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration:3" id="4707157387247628919">
      <property name="3.isFinal:3" value="true" />
      <property name="1.name:0" value="LOG" />
      <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247628920">
        <link role="3.classifier:3" targetNodeId="20.~Logger" />
      </node>
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247628921" />
      <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="4707157387247628922">
        <link role="3.classConcept:3" targetNodeId="20.~Logger" />
        <link role="3.baseMethodDeclaration:3" targetNodeId="20.~Logger.getLogger(java.lang.Class):jetbrains.mps.logging.Logger" />
        <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression:3" id="4707157387247628923">
          <link role="3.classifier:3" targetNodeId="4707157387247628917" resolveInfo="DiffBuilder" />
        </node>
      </node>
    </node>
    <node role="3.field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="4707157387247628924">
      <property name="1.name:0" value="myOldModel" />
      <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247628925">
        <link role="3.classifier:3" targetNodeId="21.~SModel" />
      </node>
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247628926" />
    </node>
    <node role="3.field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="4707157387247628927">
      <property name="1.name:0" value="myNewModel" />
      <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247628928">
        <link role="3.classifier:3" targetNodeId="21.~SModel" />
      </node>
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247628929" />
    </node>
    <node role="3.field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="4707157387247628930">
      <property name="1.name:0" value="myChangeGroups" />
      <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247628931">
        <link role="3.classifier:3" targetNodeId="4.~Map" />
        <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247628932">
          <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
        </node>
        <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247628933">
          <link role="3.classifier:3" targetNodeId="21.~SNode" />
        </node>
      </node>
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247628934" />
      <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247628935">
        <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247628936">
          <link role="3.baseMethodDeclaration:3" targetNodeId="4.~HashMap.&lt;init&gt;()" />
          <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247628937">
            <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
          </node>
          <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247628938">
            <link role="3.classifier:3" targetNodeId="21.~SNode" />
          </node>
        </node>
      </node>
    </node>
    <node role="3.field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="4707157387247628939">
      <property name="1.name:0" value="myChanges" />
      <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247628940">
        <link role="3.classifier:3" targetNodeId="4.~List" />
        <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247628941">
          <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
        </node>
      </node>
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247628942" />
      <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247628943">
        <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247628944">
          <link role="3.baseMethodDeclaration:3" targetNodeId="4.~ArrayList.&lt;init&gt;()" />
          <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247628945">
            <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
          </node>
        </node>
      </node>
    </node>
    <node role="3.constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="4707157387247628946">
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4707157387247628947" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="4707157387247628948" />
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247628949">
        <property name="1.name:0" value="oldModel" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247628950">
          <link role="3.classifier:3" targetNodeId="21.~SModel" />
        </node>
      </node>
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247628951">
        <property name="1.name:0" value="newModel" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247628952">
          <link role="3.classifier:3" targetNodeId="21.~SModel" />
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247628953">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247628954">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="4707157387247628955">
            <node role="3.lValue:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247628956">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247628924" resolveInfo="myOldModel" />
            </node>
            <node role="3.rValue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247628957">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247628949" resolveInfo="oldModel" />
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247628958">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="4707157387247628959">
            <node role="3.lValue:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247628960">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247628927" resolveInfo="myNewModel" />
            </node>
            <node role="3.rValue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247628961">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247628951" resolveInfo="newModel" />
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247628962">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247628963">
            <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247628964" resolveInfo="collectChanges" />
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247628964">
      <property name="1.name:0" value="collectChanges" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247628965" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="4707157387247628966" />
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247628967">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247628968">
          <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247628969">
            <property name="1.name:0" value="intersect" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247628970">
              <link role="3.classifier:3" targetNodeId="4.~Set" />
              <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247628971">
                <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
              </node>
            </node>
            <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247628972">
              <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247628973">
                <link role="3.baseMethodDeclaration:3" targetNodeId="4.~HashSet.&lt;init&gt;()" />
                <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247628974">
                  <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247628975">
          <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247628976">
            <property name="1.name:0" value="onlyOld" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247628977">
              <link role="3.classifier:3" targetNodeId="4.~Map" />
              <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247628978">
                <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
              </node>
              <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247628979">
                <link role="3.classifier:3" targetNodeId="21.~SNode" />
              </node>
            </node>
            <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247628980">
              <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247628981">
                <link role="3.baseMethodDeclaration:3" targetNodeId="4.~HashMap.&lt;init&gt;()" />
                <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247628982">
                  <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
                </node>
                <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247628983">
                  <link role="3.classifier:3" targetNodeId="21.~SNode" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247628984">
          <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247628985">
            <property name="1.name:0" value="onlyNew" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247628986">
              <link role="3.classifier:3" targetNodeId="4.~Map" />
              <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247628987">
                <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
              </node>
              <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247628988">
                <link role="3.classifier:3" targetNodeId="21.~SNode" />
              </node>
            </node>
            <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247628989">
              <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247628990">
                <link role="3.baseMethodDeclaration:3" targetNodeId="4.~HashMap.&lt;init&gt;()" />
                <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247628991">
                  <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
                </node>
                <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247628992">
                  <link role="3.classifier:3" targetNodeId="21.~SNode" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247628993">
          <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247628994">
            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247628995">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247628924" resolveInfo="myOldModel" />
            </node>
            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247628996">
              <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SModel.nodes():java.lang.Iterable" />
            </node>
          </node>
          <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247628997">
            <property name="1.name:0" value="node" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247628998">
              <link role="3.classifier:3" targetNodeId="21.~SNode" />
            </node>
          </node>
          <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247628999">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629000">
              <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629001">
                <property name="1.name:0" value="id" />
                <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629002">
                  <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
                </node>
                <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629003">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629004">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247628997" resolveInfo="node" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629005">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getSNodeId():jetbrains.mps.smodel.SNodeId" />
                  </node>
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247629006">
              <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="4707157387247629007">
                <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629008">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247629009">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247628927" resolveInfo="myNewModel" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629010">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SModel.getNodeById(jetbrains.mps.smodel.SNodeId):jetbrains.mps.smodel.SNode" />
                    <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629011">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247629001" resolveInfo="id" />
                    </node>
                  </node>
                </node>
                <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247629012" />
              </node>
              <node role="3.ifFalseStatement:3" type="jetbrains.mps.baseLanguage.structure.BlockStatement:3" id="4707157387247629013">
                <node role="3.statements:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629014">
                  <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247629015">
                    <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629016">
                      <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629017">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247628976" resolveInfo="onlyOld" />
                      </node>
                      <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629018">
                        <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Map.put(java.lang.Object,java.lang.Object):java.lang.Object" />
                        <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629019">
                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247629001" resolveInfo="id" />
                        </node>
                        <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629020">
                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247628997" resolveInfo="node" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629021">
                <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247629022">
                  <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629023">
                    <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629024">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247628969" resolveInfo="intersect" />
                    </node>
                    <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629025">
                      <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Set.add(java.lang.Object):boolean" />
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629026">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247629001" resolveInfo="id" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247629027">
          <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629028">
            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247629029">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247628927" resolveInfo="myNewModel" />
            </node>
            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629030">
              <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SModel.nodes():java.lang.Iterable" />
            </node>
          </node>
          <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629031">
            <property name="1.name:0" value="node" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629032">
              <link role="3.classifier:3" targetNodeId="21.~SNode" />
            </node>
          </node>
          <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629033">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629034">
              <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629035">
                <property name="1.name:0" value="id" />
                <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629036">
                  <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
                </node>
                <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629037">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629038">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247629031" resolveInfo="node" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629039">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getSNodeId():jetbrains.mps.smodel.SNodeId" />
                  </node>
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247629040">
              <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="4707157387247629041">
                <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629042">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247629043">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247628924" resolveInfo="myOldModel" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629044">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SModel.getNodeById(jetbrains.mps.smodel.SNodeId):jetbrains.mps.smodel.SNode" />
                    <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629045">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247629035" resolveInfo="id" />
                    </node>
                  </node>
                </node>
                <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247629046" />
              </node>
              <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629047">
                <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247629048">
                  <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629049">
                    <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629050">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247628985" resolveInfo="onlyNew" />
                    </node>
                    <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629051">
                      <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Map.put(java.lang.Object,java.lang.Object):java.lang.Object" />
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629052">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247629035" resolveInfo="id" />
                      </node>
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629053">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247629031" resolveInfo="node" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247629054">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247629055">
            <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247629540" resolveInfo="collectAddedLanguageImports" />
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247629056">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247629057">
            <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247629598" resolveInfo="collectChangedUsedDevkits" />
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247629058">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247629059">
            <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247629656" resolveInfo="collectEngagedOnGenerationLanguages" />
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247629060">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247629061">
            <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247629250" resolveInfo="collectAddedModelImport" />
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247629062">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247629063">
            <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247629306" resolveInfo="collectLanguageAspects" />
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247629064">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247629065">
            <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247629741" resolveInfo="collectDeletedNodes" />
            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629066">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247628976" resolveInfo="onlyOld" />
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247629067">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247629068">
            <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247629791" resolveInfo="collectAddedNodes" />
            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629069">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247628985" resolveInfo="onlyNew" />
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247629070">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247629071">
            <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247630000" resolveInfo="collectMovedNodes" />
            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629072">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247628969" resolveInfo="intersect" />
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247629073">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247629074">
            <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247630204" resolveInfo="collectPropertyChanges" />
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247629075">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247629076">
            <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247630356" resolveInfo="collectReferenceChanges" />
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247629077">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247629078">
            <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247629367" resolveInfo="collectConceptChanges" />
            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629079">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247628969" resolveInfo="intersect" />
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247629080">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247629081">
            <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247629082" resolveInfo="makeChangeGroups" />
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247629082">
      <property name="1.name:0" value="makeChangeGroups" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247629083" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="4707157387247629084" />
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629085">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629086">
          <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629087">
            <property name="1.name:0" value="deletedNodes" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629088">
              <link role="3.classifier:3" targetNodeId="4.~Set" />
              <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629089">
                <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
              </node>
            </node>
            <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247629090">
              <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247629091">
                <link role="3.baseMethodDeclaration:3" targetNodeId="4.~HashSet.&lt;init&gt;()" />
                <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629092">
                  <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247629093">
          <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="4707157387247629094">
            <link role="3.classConcept:3" targetNodeId="17.~CollectionUtil" />
            <link role="3.baseMethodDeclaration:3" targetNodeId="17.~CollectionUtil.filter(java.lang.Class,java.util.List):java.util.List" />
            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression:3" id="4707157387247629095">
              <link role="3.classifier:3" targetNodeId="14.4707157387247557317" resolveInfo="DeleteNodeChange" />
            </node>
            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247629096">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247628939" resolveInfo="myChanges" />
            </node>
          </node>
          <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629097">
            <property name="1.name:0" value="change" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="3613324658897910019">
              <link role="3.classifier:3" targetNodeId="14.4707157387247557317" resolveInfo="DeleteNodeChange" />
            </node>
          </node>
          <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629099">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247629100">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629101">
                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629102">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247629087" resolveInfo="deletedNodes" />
                </node>
                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629103">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Set.add(java.lang.Object):boolean" />
                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629104">
                    <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629105">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247629097" resolveInfo="change" />
                    </node>
                    <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629106">
                      <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247557496" resolveInfo="getAffectedNodeId" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247629107">
          <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="4707157387247629108">
            <link role="3.classConcept:3" targetNodeId="17.~CollectionUtil" />
            <link role="3.baseMethodDeclaration:3" targetNodeId="17.~CollectionUtil.filter(java.lang.Class,java.util.List):java.util.List" />
            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression:3" id="4707157387247629109">
              <link role="3.classifier:3" targetNodeId="14.4707157387247557317" resolveInfo="DeleteNodeChange" />
            </node>
            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247629110">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247628939" resolveInfo="myChanges" />
            </node>
          </node>
          <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629111">
            <property name="1.name:0" value="change" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="3613324658897910020">
              <link role="3.classifier:3" targetNodeId="14.4707157387247557317" resolveInfo="DeleteNodeChange" />
            </node>
          </node>
          <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629113">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629114">
              <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629115">
                <property name="1.name:0" value="deleted" />
                <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629116">
                  <link role="3.classifier:3" targetNodeId="21.~SNode" />
                </node>
                <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629117">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247629118">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247628924" resolveInfo="myOldModel" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629119">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SModel.getNodeById(jetbrains.mps.smodel.SNodeId):jetbrains.mps.smodel.SNode" />
                    <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629120">
                      <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629121">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247629111" resolveInfo="change" />
                      </node>
                      <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629122">
                        <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247557496" resolveInfo="getAffectedNodeId" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.AssertStatement:3" id="4707157387247629123">
              <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="4707157387247629124">
                <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629125">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247629115" resolveInfo="deleted" />
                </node>
                <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247629126" />
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629127">
              <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629128">
                <property name="1.name:0" value="deleteRoot" />
                <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629129">
                  <link role="3.classifier:3" targetNodeId="21.~SNode" />
                </node>
                <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629130">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247629115" resolveInfo="deleted" />
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.WhileStatement:3" id="4707157387247629131">
              <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.AndExpression:3" id="4707157387247629132">
                <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="4707157387247629133">
                  <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629134">
                    <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629135">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247629128" resolveInfo="deleteRoot" />
                    </node>
                    <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629136">
                      <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getParent():jetbrains.mps.smodel.SNode" />
                    </node>
                  </node>
                  <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247629137" />
                </node>
                <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629138">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629139">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247629087" resolveInfo="deletedNodes" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629140">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Set.contains(java.lang.Object):boolean" />
                    <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629141">
                      <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629142">
                        <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629143">
                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247629128" resolveInfo="deleteRoot" />
                        </node>
                        <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629144">
                          <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getParent():jetbrains.mps.smodel.SNode" />
                        </node>
                      </node>
                      <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629145">
                        <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getSNodeId():jetbrains.mps.smodel.SNodeId" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629146">
                <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247629147">
                  <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="4707157387247629148">
                    <node role="3.lValue:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629149">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247629128" resolveInfo="deleteRoot" />
                    </node>
                    <node role="3.rValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629150">
                      <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629151">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247629128" resolveInfo="deleteRoot" />
                      </node>
                      <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629152">
                        <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getParent():jetbrains.mps.smodel.SNode" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247629153">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629154">
                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247629155">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247628930" resolveInfo="myChangeGroups" />
                </node>
                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629156">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Map.put(java.lang.Object,java.lang.Object):java.lang.Object" />
                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629157">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247629111" resolveInfo="change" />
                  </node>
                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629158">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247629128" resolveInfo="deleteRoot" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629159">
          <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629160">
            <property name="1.name:0" value="addedNodes" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629161">
              <link role="3.classifier:3" targetNodeId="4.~Set" />
              <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629162">
                <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
              </node>
            </node>
            <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247629163">
              <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247629164">
                <link role="3.baseMethodDeclaration:3" targetNodeId="4.~HashSet.&lt;init&gt;()" />
                <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629165">
                  <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247629166">
          <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="4707157387247629167">
            <link role="3.classConcept:3" targetNodeId="17.~CollectionUtil" />
            <link role="3.baseMethodDeclaration:3" targetNodeId="17.~CollectionUtil.filter(java.lang.Class,java.util.List):java.util.List" />
            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression:3" id="4707157387247629168">
              <link role="3.classifier:3" targetNodeId="14.4707157387247556780" resolveInfo="NewNodeChange" />
            </node>
            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247629169">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247628939" resolveInfo="myChanges" />
            </node>
          </node>
          <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629170">
            <property name="1.name:0" value="change" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="3613324658897910021">
              <link role="3.classifier:3" targetNodeId="14.4707157387247556780" resolveInfo="NewNodeChange" />
            </node>
          </node>
          <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629172">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247629173">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629174">
                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629175">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247629160" resolveInfo="addedNodes" />
                </node>
                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629176">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Set.add(java.lang.Object):boolean" />
                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629177">
                    <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629178">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247629170" resolveInfo="change" />
                    </node>
                    <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629179">
                      <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247556823" resolveInfo="getAffectedNodeId" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247629180">
          <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247629181">
            <link role="3.variableDeclaration:3" targetNodeId="4707157387247628939" resolveInfo="myChanges" />
          </node>
          <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629182">
            <property name="1.name:0" value="change" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629183">
              <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
            </node>
          </node>
          <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629184">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629185">
              <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629186">
                <property name="1.name:0" value="id" />
                <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629187">
                  <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
                </node>
                <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629188">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629189">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247629182" resolveInfo="change" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629190">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247556975" resolveInfo="getAffectedNodeId" />
                  </node>
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247629191">
              <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="4707157387247629192">
                <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629193">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247629186" resolveInfo="id" />
                </node>
                <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247629194" />
              </node>
              <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629195">
                <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ContinueStatement:3" id="4707157387247629196" />
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629197">
              <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629198">
                <property name="1.name:0" value="added" />
                <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629199">
                  <link role="3.classifier:3" targetNodeId="21.~SNode" />
                </node>
                <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629200">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247629201">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247628927" resolveInfo="myNewModel" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629202">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SModel.getNodeById(jetbrains.mps.smodel.SNodeId):jetbrains.mps.smodel.SNode" />
                    <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629203">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247629186" resolveInfo="id" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247629204">
              <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="4707157387247629205">
                <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629206">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247629198" resolveInfo="added" />
                </node>
                <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247629207" />
              </node>
              <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629208">
                <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ContinueStatement:3" id="4707157387247629209" />
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629210">
              <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629211">
                <property name="1.name:0" value="addRoot" />
                <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629212">
                  <link role="3.classifier:3" targetNodeId="21.~SNode" />
                </node>
                <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629213">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247629198" resolveInfo="added" />
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.WhileStatement:3" id="4707157387247629214">
              <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.AndExpression:3" id="4707157387247629215">
                <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="4707157387247629216">
                  <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629217">
                    <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629218">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247629211" resolveInfo="addRoot" />
                    </node>
                    <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629219">
                      <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getParent():jetbrains.mps.smodel.SNode" />
                    </node>
                  </node>
                  <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247629220" />
                </node>
                <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629221">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629222">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247629160" resolveInfo="addedNodes" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629223">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Set.contains(java.lang.Object):boolean" />
                    <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629224">
                      <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629225">
                        <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629226">
                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247629211" resolveInfo="addRoot" />
                        </node>
                        <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629227">
                          <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getParent():jetbrains.mps.smodel.SNode" />
                        </node>
                      </node>
                      <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629228">
                        <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getSNodeId():jetbrains.mps.smodel.SNodeId" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629229">
                <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247629230">
                  <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="4707157387247629231">
                    <node role="3.lValue:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629232">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247629211" resolveInfo="addRoot" />
                    </node>
                    <node role="3.rValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629233">
                      <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629234">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247629211" resolveInfo="addRoot" />
                      </node>
                      <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629235">
                        <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getParent():jetbrains.mps.smodel.SNode" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247629236">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629237">
                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247629238">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247628930" resolveInfo="myChangeGroups" />
                </node>
                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629239">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Map.put(java.lang.Object,java.lang.Object):java.lang.Object" />
                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629240">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247629182" resolveInfo="change" />
                  </node>
                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629241">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247629211" resolveInfo="addRoot" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247629242">
      <property name="1.name:0" value="getChangeGroups" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4707157387247629243" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629244">
        <link role="3.classifier:3" targetNodeId="4.~Map" />
        <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629245">
          <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
        </node>
        <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629246">
          <link role="3.classifier:3" targetNodeId="21.~SNode" />
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629247">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247629248">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247629249">
            <link role="3.variableDeclaration:3" targetNodeId="4707157387247628930" resolveInfo="myChangeGroups" />
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247629250">
      <property name="1.name:0" value="collectAddedModelImport" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247629251" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="4707157387247629252" />
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629253">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629254">
          <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629255">
            <property name="1.name:0" value="oldImportElements" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629256">
              <link role="3.classifier:3" targetNodeId="4.~List" />
              <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629257">
                <link role="3.classifier:3" targetNodeId="21.~SModelReference" />
              </node>
            </node>
            <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="4707157387247629258">
              <link role="3.classConcept:3" targetNodeId="21.~SModelOperations" />
              <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SModelOperations.getImportedModelUIDs(jetbrains.mps.smodel.SModel):java.util.List" />
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247629259">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247628924" resolveInfo="myOldModel" />
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629260">
          <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629261">
            <property name="1.name:0" value="newImportElements" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629262">
              <link role="3.classifier:3" targetNodeId="4.~List" />
              <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629263">
                <link role="3.classifier:3" targetNodeId="21.~SModelReference" />
              </node>
            </node>
            <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="4707157387247629264">
              <link role="3.classConcept:3" targetNodeId="21.~SModelOperations" />
              <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SModelOperations.getImportedModelUIDs(jetbrains.mps.smodel.SModel):java.util.List" />
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247629265">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247628927" resolveInfo="myNewModel" />
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629266">
          <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629267">
            <property name="1.name:0" value="addedImports" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629268">
              <link role="3.classifier:3" targetNodeId="4.~Set" />
              <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629269">
                <link role="3.classifier:3" targetNodeId="21.~SModelReference" />
              </node>
            </node>
            <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247629270">
              <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247629714" resolveInfo="getDiff" />
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629271">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247629255" resolveInfo="oldImportElements" />
              </node>
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629272">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247629261" resolveInfo="newImportElements" />
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629273">
          <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629274">
            <property name="1.name:0" value="deletedImports" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629275">
              <link role="3.classifier:3" targetNodeId="4.~Set" />
              <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629276">
                <link role="3.classifier:3" targetNodeId="21.~SModelReference" />
              </node>
            </node>
            <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247629277">
              <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247629714" resolveInfo="getDiff" />
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629278">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247629261" resolveInfo="newImportElements" />
              </node>
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629279">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247629255" resolveInfo="oldImportElements" />
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247629280">
          <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629281">
            <link role="3.variableDeclaration:3" targetNodeId="4707157387247629267" resolveInfo="addedImports" />
          </node>
          <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629282">
            <property name="1.name:0" value="ref" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629283">
              <link role="3.classifier:3" targetNodeId="21.~SModelReference" />
            </node>
          </node>
          <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629284">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247629285">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629286">
                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247629287">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247628939" resolveInfo="myChanges" />
                </node>
                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629288">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.add(java.lang.Object):boolean" />
                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247629289">
                    <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247629290">
                      <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247558057" resolveInfo="ModelImportChange" />
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629291">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247629282" resolveInfo="ref" />
                      </node>
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="4707157387247629292" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247629293">
          <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629294">
            <link role="3.variableDeclaration:3" targetNodeId="4707157387247629274" resolveInfo="deletedImports" />
          </node>
          <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629295">
            <property name="1.name:0" value="ref" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629296">
              <link role="3.classifier:3" targetNodeId="21.~SModelReference" />
            </node>
          </node>
          <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629297">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247629298">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629299">
                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247629300">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247628939" resolveInfo="myChanges" />
                </node>
                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629301">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.add(java.lang.Object):boolean" />
                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247629302">
                    <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247629303">
                      <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247558057" resolveInfo="ModelImportChange" />
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629304">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247629295" resolveInfo="ref" />
                      </node>
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="4707157387247629305">
                        <property name="3.value:3" value="true" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247629306">
      <property name="1.name:0" value="collectLanguageAspects" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247629307" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="4707157387247629308" />
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629309">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629310">
          <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629311">
            <property name="1.name:0" value="oldImportElements" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629312">
              <link role="3.classifier:3" targetNodeId="4.~List" />
              <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629313">
                <link role="3.classifier:3" targetNodeId="21.~SModel$ImportElement" />
              </node>
            </node>
            <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629314">
              <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247629315">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247628924" resolveInfo="myOldModel" />
              </node>
              <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629316">
                <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SModel.getAdditionalModelVersions():java.util.List" />
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247629317">
          <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629318">
            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247629319">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247628927" resolveInfo="myNewModel" />
            </node>
            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629320">
              <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SModel.getAdditionalModelVersions():java.util.List" />
            </node>
          </node>
          <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629321">
            <property name="1.name:0" value="importElement" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629322">
              <link role="3.classifier:3" targetNodeId="21.~SModel$ImportElement" />
            </node>
          </node>
          <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629323">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629324">
              <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629325">
                <property name="1.name:0" value="alreadyPresent" />
                <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="4707157387247629326" />
                <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="4707157387247629327" />
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247629328">
              <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629329">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247629311" resolveInfo="oldImportElements" />
              </node>
              <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629330">
                <property name="1.name:0" value="oldImportElement" />
                <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629331">
                  <link role="3.classifier:3" targetNodeId="21.~SModel$ImportElement" />
                </node>
              </node>
              <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629332">
                <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247629333">
                  <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.AndExpression:3" id="4707157387247629334">
                    <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629335">
                      <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629336">
                        <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629337">
                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247629330" resolveInfo="oldImportElement" />
                        </node>
                        <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629338">
                          <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SModel$ImportElement.getModelReference():jetbrains.mps.smodel.SModelReference" />
                        </node>
                      </node>
                      <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629339">
                        <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SModelReference.equals(java.lang.Object):boolean" />
                        <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629340">
                          <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629341">
                            <link role="3.variableDeclaration:3" targetNodeId="4707157387247629321" resolveInfo="importElement" />
                          </node>
                          <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629342">
                            <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SModel$ImportElement.getModelReference():jetbrains.mps.smodel.SModelReference" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="4707157387247629343">
                      <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629344">
                        <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629345">
                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247629330" resolveInfo="oldImportElement" />
                        </node>
                        <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629346">
                          <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SModel$ImportElement.getReferenceID():int" />
                        </node>
                      </node>
                      <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629347">
                        <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629348">
                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247629321" resolveInfo="importElement" />
                        </node>
                        <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629349">
                          <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SModel$ImportElement.getReferenceID():int" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629350">
                    <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247629351">
                      <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="4707157387247629352">
                        <node role="3.lValue:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629353">
                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247629325" resolveInfo="alreadyPresent" />
                        </node>
                        <node role="3.rValue:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="4707157387247629354">
                          <property name="3.value:3" value="true" />
                        </node>
                      </node>
                    </node>
                    <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.BreakStatement:3" id="4707157387247629355" />
                  </node>
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247629356">
              <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.NotExpression:3" id="4707157387247629357">
                <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629358">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247629325" resolveInfo="alreadyPresent" />
                </node>
              </node>
              <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629359">
                <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247629360">
                  <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629361">
                    <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247629362">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247628939" resolveInfo="myChanges" />
                    </node>
                    <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629363">
                      <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.add(java.lang.Object):boolean" />
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247629364">
                        <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247629365">
                          <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247556085" resolveInfo="AddLanguageAspectChange" />
                          <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629366">
                            <link role="3.variableDeclaration:3" targetNodeId="4707157387247629321" resolveInfo="importElement" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247629367">
      <property name="1.name:0" value="collectConceptChanges" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247629368" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="4707157387247629369" />
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247629370">
        <property name="1.name:0" value="intersected" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629371">
          <link role="3.classifier:3" targetNodeId="4.~Set" />
          <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629372">
            <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
          </node>
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629373">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247629374">
          <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247629375">
            <link role="3.variableDeclaration:3" targetNodeId="4707157387247629370" resolveInfo="intersected" />
          </node>
          <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629376">
            <property name="1.name:0" value="id" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629377">
              <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
            </node>
          </node>
          <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629378">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629379">
              <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629380">
                <property name="1.name:0" value="newNode" />
                <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629381">
                  <link role="3.classifier:3" targetNodeId="21.~SNode" />
                </node>
                <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629382">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247629383">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247628927" resolveInfo="myNewModel" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629384">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SModel.getNodeById(jetbrains.mps.smodel.SNodeId):jetbrains.mps.smodel.SNode" />
                    <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629385">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247629376" resolveInfo="id" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629386">
              <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629387">
                <property name="1.name:0" value="oldNode" />
                <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629388">
                  <link role="3.classifier:3" targetNodeId="21.~SNode" />
                </node>
                <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629389">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247629390">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247628924" resolveInfo="myOldModel" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629391">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SModel.getNodeById(jetbrains.mps.smodel.SNodeId):jetbrains.mps.smodel.SNode" />
                    <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629392">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247629376" resolveInfo="id" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.AssertStatement:3" id="4707157387247629393">
              <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="4707157387247629394">
                <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629395">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247629380" resolveInfo="newNode" />
                </node>
                <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247629396" />
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.AssertStatement:3" id="4707157387247629397">
              <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="4707157387247629398">
                <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629399">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247629387" resolveInfo="oldNode" />
                </node>
                <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247629400" />
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629401">
              <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629402">
                <property name="1.name:0" value="oldConceptName" />
                <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629403">
                  <link role="3.classifier:3" targetNodeId="2.~String" />
                </node>
                <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629404">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629405">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247629387" resolveInfo="oldNode" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629406">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getConceptFqName():java.lang.String" />
                  </node>
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629407">
              <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629408">
                <property name="1.name:0" value="newConceptName" />
                <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629409">
                  <link role="3.classifier:3" targetNodeId="2.~String" />
                </node>
                <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629410">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629411">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247629380" resolveInfo="newNode" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629412">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getConceptFqName():java.lang.String" />
                  </node>
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247629413">
              <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.NotExpression:3" id="4707157387247629414">
                <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629415">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629416">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247629402" resolveInfo="oldConceptName" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629417">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="2.~String.equals(java.lang.Object):boolean" />
                    <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629418">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247629408" resolveInfo="newConceptName" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629419">
                <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629420">
                  <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629421">
                    <property name="1.name:0" value="oldLanguage" />
                    <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629422">
                      <link role="3.classifier:3" targetNodeId="9.~ModuleReference" />
                    </node>
                    <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629423">
                      <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629424">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247629387" resolveInfo="oldNode" />
                      </node>
                      <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629425">
                        <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getConceptLanguage():jetbrains.mps.project.structure.modules.ModuleReference" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629426">
                  <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629427">
                    <property name="1.name:0" value="newLanguage" />
                    <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629428">
                      <link role="3.classifier:3" targetNodeId="9.~ModuleReference" />
                    </node>
                    <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629429">
                      <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629430">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247629380" resolveInfo="newNode" />
                      </node>
                      <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629431">
                        <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getConceptLanguage():jetbrains.mps.project.structure.modules.ModuleReference" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247629432">
                  <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.AndExpression:3" id="4707157387247629433">
                    <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.AndExpression:3" id="4707157387247629434">
                      <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression:3" id="4707157387247629435">
                        <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="4707157387247629436">
                          <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629437">
                            <link role="3.variableDeclaration:3" targetNodeId="4707157387247629427" resolveInfo="newLanguage" />
                          </node>
                          <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247629438" />
                        </node>
                      </node>
                      <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression:3" id="4707157387247629439">
                        <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="4707157387247629440">
                          <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629441">
                            <link role="3.variableDeclaration:3" targetNodeId="4707157387247629421" resolveInfo="oldLanguage" />
                          </node>
                          <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247629442" />
                        </node>
                      </node>
                    </node>
                    <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629443">
                      <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629444">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247629427" resolveInfo="newLanguage" />
                      </node>
                      <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629445">
                        <link role="3.baseMethodDeclaration:3" targetNodeId="9.~ModuleReference.equals(java.lang.Object):boolean" />
                        <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629446">
                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247629421" resolveInfo="oldLanguage" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629447">
                    <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629448">
                      <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629449">
                        <property name="1.name:0" value="oldVersion" />
                        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="4707157387247629450" />
                        <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247629451">
                          <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247629503" resolveInfo="getStructureImportVersion" />
                          <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247629452">
                            <link role="3.variableDeclaration:3" targetNodeId="4707157387247628924" resolveInfo="myOldModel" />
                          </node>
                          <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629453">
                            <link role="3.variableDeclaration:3" targetNodeId="4707157387247629421" resolveInfo="oldLanguage" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629454">
                      <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629455">
                        <property name="1.name:0" value="newVersion" />
                        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="4707157387247629456" />
                        <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247629457">
                          <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247629503" resolveInfo="getStructureImportVersion" />
                          <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247629458">
                            <link role="3.variableDeclaration:3" targetNodeId="4707157387247628927" resolveInfo="myNewModel" />
                          </node>
                          <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629459">
                            <link role="3.variableDeclaration:3" targetNodeId="4707157387247629427" resolveInfo="newLanguage" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247629460">
                      <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="4707157387247629461">
                        <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629462">
                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247629449" resolveInfo="oldVersion" />
                        </node>
                        <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629463">
                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247629455" resolveInfo="newVersion" />
                        </node>
                      </node>
                      <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629464">
                        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247629465">
                          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629466">
                            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalStaticFieldReference:3" id="4707157387247629467">
                              <link role="3.variableDeclaration:3" targetNodeId="4707157387247628919" resolveInfo="LOG" />
                            </node>
                            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629468">
                              <link role="3.baseMethodDeclaration:3" targetNodeId="20.~Logger.debug(java.lang.String):void" />
                              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="4707157387247629469">
                                <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="4707157387247629470">
                                  <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="4707157387247629471">
                                    <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="4707157387247629472">
                                      <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="4707157387247629473">
                                        <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="4707157387247629474">
                                          <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="4707157387247629475">
                                            <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="4707157387247629476">
                                              <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="4707157387247629477">
                                                <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="4707157387247629478">
                                                  <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="4707157387247629479">
                                                    <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="4707157387247629480">
                                                      <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="4707157387247629481">
                                                        <property name="3.value:3" value="Refactoring in language " />
                                                      </node>
                                                      <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629482">
                                                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247629421" resolveInfo="oldLanguage" />
                                                      </node>
                                                    </node>
                                                    <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="4707157387247629483">
                                                      <property name="3.value:3" value=" from " />
                                                    </node>
                                                  </node>
                                                  <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629484">
                                                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247629449" resolveInfo="oldVersion" />
                                                  </node>
                                                </node>
                                                <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="4707157387247629485">
                                                  <property name="3.value:3" value=" to " />
                                                </node>
                                              </node>
                                              <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629486">
                                                <link role="3.variableDeclaration:3" targetNodeId="4707157387247629455" resolveInfo="newVersion" />
                                              </node>
                                            </node>
                                            <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="4707157387247629487">
                                              <property name="3.value:3" value=".\n" />
                                            </node>
                                          </node>
                                          <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="4707157387247629488">
                                            <property name="3.value:3" value="Ignoring concept change of node " />
                                          </node>
                                        </node>
                                        <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629489">
                                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247629376" resolveInfo="id" />
                                        </node>
                                      </node>
                                      <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="4707157387247629490">
                                        <property name="3.value:3" value=" from " />
                                      </node>
                                    </node>
                                    <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629491">
                                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247629402" resolveInfo="oldConceptName" />
                                    </node>
                                  </node>
                                  <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="4707157387247629492">
                                    <property name="3.value:3" value=" to " />
                                  </node>
                                </node>
                                <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629493">
                                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247629408" resolveInfo="newConceptName" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ContinueStatement:3" id="4707157387247629494" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247629495">
                  <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629496">
                    <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247629497">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247628939" resolveInfo="myChanges" />
                    </node>
                    <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629498">
                      <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.add(java.lang.Object):boolean" />
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247629499">
                        <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247629500">
                          <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247558342" resolveInfo="ChangeConceptChange" />
                          <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629501">
                            <link role="3.variableDeclaration:3" targetNodeId="4707157387247629376" resolveInfo="id" />
                          </node>
                          <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629502">
                            <link role="3.variableDeclaration:3" targetNodeId="4707157387247629408" resolveInfo="newConceptName" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247629503">
      <property name="1.name:0" value="getStructureImportVersion" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247629504" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="4707157387247629505" />
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247629506">
        <property name="1.name:0" value="model" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629507">
          <link role="3.classifier:3" targetNodeId="21.~SModel" />
        </node>
      </node>
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247629508">
        <property name="1.name:0" value="language" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629509">
          <link role="3.classifier:3" targetNodeId="9.~ModuleReference" />
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629510">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247629511">
          <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629512">
            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247629513">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247629506" resolveInfo="model" />
            </node>
            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629514">
              <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SModel.getAdditionalModelVersions():java.util.List" />
            </node>
          </node>
          <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629515">
            <property name="1.name:0" value="el" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629516">
              <link role="3.classifier:3" targetNodeId="21.~SModel$ImportElement" />
            </node>
          </node>
          <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629517">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247629518">
              <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629519">
                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression:3" id="4707157387247629520">
                  <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="4707157387247629521">
                    <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629522">
                      <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247629523">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247629508" resolveInfo="language" />
                      </node>
                      <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629524">
                        <link role="3.baseMethodDeclaration:3" targetNodeId="9.~ModuleReference.getModuleFqName():java.lang.String" />
                      </node>
                    </node>
                    <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="4707157387247629525">
                      <property name="3.value:3" value=".structure" />
                    </node>
                  </node>
                </node>
                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629526">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="2.~String.equals(java.lang.Object):boolean" />
                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629527">
                    <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629528">
                      <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629529">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247629515" resolveInfo="el" />
                      </node>
                      <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629530">
                        <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SModel$ImportElement.getModelReference():jetbrains.mps.smodel.SModelReference" />
                      </node>
                    </node>
                    <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629531">
                      <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SModelReference.getLongName():java.lang.String" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629532">
                <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247629533">
                  <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629534">
                    <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629535">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247629515" resolveInfo="el" />
                    </node>
                    <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629536">
                      <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SModel$ImportElement.getUsedVersion():int" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247629537">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.UnaryMinus:3" id="4707157387247629538">
            <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="4707157387247629539">
              <property name="3.value:3" value="1" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247629540">
      <property name="1.name:0" value="collectAddedLanguageImports" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247629541" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="4707157387247629542" />
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629543">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629544">
          <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629545">
            <property name="1.name:0" value="oldLanguages" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629546">
              <link role="3.classifier:3" targetNodeId="4.~List" />
              <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629547">
                <link role="3.classifier:3" targetNodeId="9.~ModuleReference" />
              </node>
            </node>
            <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629548">
              <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247629549">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247628924" resolveInfo="myOldModel" />
              </node>
              <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629550">
                <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SModel.importedLanguages():java.util.List" />
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629551">
          <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629552">
            <property name="1.name:0" value="newLanguages" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629553">
              <link role="3.classifier:3" targetNodeId="4.~List" />
              <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629554">
                <link role="3.classifier:3" targetNodeId="9.~ModuleReference" />
              </node>
            </node>
            <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629555">
              <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247629556">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247628927" resolveInfo="myNewModel" />
              </node>
              <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629557">
                <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SModel.importedLanguages():java.util.List" />
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629558">
          <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629559">
            <property name="1.name:0" value="addedImports" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629560">
              <link role="3.classifier:3" targetNodeId="4.~Set" />
              <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629561">
                <link role="3.classifier:3" targetNodeId="9.~ModuleReference" />
              </node>
            </node>
            <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247629562">
              <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247629714" resolveInfo="getDiff" />
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629563">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247629545" resolveInfo="oldLanguages" />
              </node>
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629564">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247629552" resolveInfo="newLanguages" />
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629565">
          <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629566">
            <property name="1.name:0" value="deletedImports" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629567">
              <link role="3.classifier:3" targetNodeId="4.~Set" />
              <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629568">
                <link role="3.classifier:3" targetNodeId="9.~ModuleReference" />
              </node>
            </node>
            <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247629569">
              <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247629714" resolveInfo="getDiff" />
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629570">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247629552" resolveInfo="newLanguages" />
              </node>
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629571">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247629545" resolveInfo="oldLanguages" />
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247629572">
          <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629573">
            <link role="3.variableDeclaration:3" targetNodeId="4707157387247629559" resolveInfo="addedImports" />
          </node>
          <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629574">
            <property name="1.name:0" value="ref" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629575">
              <link role="3.classifier:3" targetNodeId="9.~ModuleReference" />
            </node>
          </node>
          <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629576">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247629577">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629578">
                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247629579">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247628939" resolveInfo="myChanges" />
                </node>
                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629580">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.add(java.lang.Object):boolean" />
                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247629581">
                    <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247629582">
                      <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247556669" resolveInfo="UsedLanguagesChange" />
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629583">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247629574" resolveInfo="ref" />
                      </node>
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="4707157387247629584" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247629585">
          <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629586">
            <link role="3.variableDeclaration:3" targetNodeId="4707157387247629566" resolveInfo="deletedImports" />
          </node>
          <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629587">
            <property name="1.name:0" value="ref" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629588">
              <link role="3.classifier:3" targetNodeId="9.~ModuleReference" />
            </node>
          </node>
          <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629589">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247629590">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629591">
                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247629592">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247628939" resolveInfo="myChanges" />
                </node>
                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629593">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.add(java.lang.Object):boolean" />
                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247629594">
                    <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247629595">
                      <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247556669" resolveInfo="UsedLanguagesChange" />
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629596">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247629587" resolveInfo="ref" />
                      </node>
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="4707157387247629597">
                        <property name="3.value:3" value="true" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247629598">
      <property name="1.name:0" value="collectChangedUsedDevkits" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247629599" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="4707157387247629600" />
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629601">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629602">
          <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629603">
            <property name="1.name:0" value="oldDevkits" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629604">
              <link role="3.classifier:3" targetNodeId="4.~List" />
              <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629605">
                <link role="3.classifier:3" targetNodeId="9.~ModuleReference" />
              </node>
            </node>
            <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629606">
              <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247629607">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247628924" resolveInfo="myOldModel" />
              </node>
              <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629608">
                <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SModel.importedDevkits():java.util.List" />
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629609">
          <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629610">
            <property name="1.name:0" value="newDevkits" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629611">
              <link role="3.classifier:3" targetNodeId="4.~List" />
              <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629612">
                <link role="3.classifier:3" targetNodeId="9.~ModuleReference" />
              </node>
            </node>
            <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629613">
              <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247629614">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247628927" resolveInfo="myNewModel" />
              </node>
              <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629615">
                <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SModel.importedDevkits():java.util.List" />
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629616">
          <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629617">
            <property name="1.name:0" value="addedDevkits" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629618">
              <link role="3.classifier:3" targetNodeId="4.~Set" />
              <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629619">
                <link role="3.classifier:3" targetNodeId="9.~ModuleReference" />
              </node>
            </node>
            <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247629620">
              <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247629714" resolveInfo="getDiff" />
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629621">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247629603" resolveInfo="oldDevkits" />
              </node>
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629622">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247629610" resolveInfo="newDevkits" />
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629623">
          <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629624">
            <property name="1.name:0" value="deletedDevkits" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629625">
              <link role="3.classifier:3" targetNodeId="4.~Set" />
              <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629626">
                <link role="3.classifier:3" targetNodeId="9.~ModuleReference" />
              </node>
            </node>
            <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247629627">
              <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247629714" resolveInfo="getDiff" />
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629628">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247629610" resolveInfo="newDevkits" />
              </node>
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629629">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247629603" resolveInfo="oldDevkits" />
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247629630">
          <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629631">
            <link role="3.variableDeclaration:3" targetNodeId="4707157387247629617" resolveInfo="addedDevkits" />
          </node>
          <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629632">
            <property name="1.name:0" value="ref" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629633">
              <link role="3.classifier:3" targetNodeId="9.~ModuleReference" />
            </node>
          </node>
          <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629634">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247629635">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629636">
                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247629637">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247628939" resolveInfo="myChanges" />
                </node>
                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629638">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.add(java.lang.Object):boolean" />
                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247629639">
                    <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247629640">
                      <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247556549" resolveInfo="UsedDevkitsChange" />
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629641">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247629632" resolveInfo="ref" />
                      </node>
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="4707157387247629642" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247629643">
          <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629644">
            <link role="3.variableDeclaration:3" targetNodeId="4707157387247629624" resolveInfo="deletedDevkits" />
          </node>
          <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629645">
            <property name="1.name:0" value="ref" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629646">
              <link role="3.classifier:3" targetNodeId="9.~ModuleReference" />
            </node>
          </node>
          <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629647">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247629648">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629649">
                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247629650">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247628939" resolveInfo="myChanges" />
                </node>
                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629651">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.add(java.lang.Object):boolean" />
                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247629652">
                    <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247629653">
                      <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247556549" resolveInfo="UsedDevkitsChange" />
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629654">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247629645" resolveInfo="ref" />
                      </node>
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="4707157387247629655">
                        <property name="3.value:3" value="true" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247629656">
      <property name="1.name:0" value="collectEngagedOnGenerationLanguages" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247629657" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="4707157387247629658" />
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629659">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629660">
          <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629661">
            <property name="1.name:0" value="oldLanguages" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629662">
              <link role="3.classifier:3" targetNodeId="4.~List" />
              <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629663">
                <link role="3.classifier:3" targetNodeId="9.~ModuleReference" />
              </node>
            </node>
            <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629664">
              <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247629665">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247628924" resolveInfo="myOldModel" />
              </node>
              <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629666">
                <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SModel.engagedOnGenerationLanguages():java.util.List" />
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629667">
          <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629668">
            <property name="1.name:0" value="newLanguages" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629669">
              <link role="3.classifier:3" targetNodeId="4.~List" />
              <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629670">
                <link role="3.classifier:3" targetNodeId="9.~ModuleReference" />
              </node>
            </node>
            <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629671">
              <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247629672">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247628927" resolveInfo="myNewModel" />
              </node>
              <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629673">
                <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SModel.engagedOnGenerationLanguages():java.util.List" />
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629674">
          <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629675">
            <property name="1.name:0" value="addedImports" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629676">
              <link role="3.classifier:3" targetNodeId="4.~Set" />
              <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629677">
                <link role="3.classifier:3" targetNodeId="9.~ModuleReference" />
              </node>
            </node>
            <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247629678">
              <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247629714" resolveInfo="getDiff" />
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629679">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247629661" resolveInfo="oldLanguages" />
              </node>
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629680">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247629668" resolveInfo="newLanguages" />
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629681">
          <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629682">
            <property name="1.name:0" value="deletedImports" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629683">
              <link role="3.classifier:3" targetNodeId="4.~Set" />
              <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629684">
                <link role="3.classifier:3" targetNodeId="9.~ModuleReference" />
              </node>
            </node>
            <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247629685">
              <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247629714" resolveInfo="getDiff" />
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629686">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247629668" resolveInfo="newLanguages" />
              </node>
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629687">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247629661" resolveInfo="oldLanguages" />
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247629688">
          <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629689">
            <link role="3.variableDeclaration:3" targetNodeId="4707157387247629675" resolveInfo="addedImports" />
          </node>
          <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629690">
            <property name="1.name:0" value="ref" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629691">
              <link role="3.classifier:3" targetNodeId="9.~ModuleReference" />
            </node>
          </node>
          <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629692">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247629693">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629694">
                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247629695">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247628939" resolveInfo="myChanges" />
                </node>
                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629696">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.add(java.lang.Object):boolean" />
                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247629697">
                    <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247629698">
                      <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247558241" resolveInfo="EngagedOnGenerationLanguagesChange" />
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629699">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247629690" resolveInfo="ref" />
                      </node>
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="4707157387247629700" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247629701">
          <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629702">
            <link role="3.variableDeclaration:3" targetNodeId="4707157387247629682" resolveInfo="deletedImports" />
          </node>
          <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629703">
            <property name="1.name:0" value="ref" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629704">
              <link role="3.classifier:3" targetNodeId="9.~ModuleReference" />
            </node>
          </node>
          <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629705">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247629706">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629707">
                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247629708">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247628939" resolveInfo="myChanges" />
                </node>
                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629709">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.add(java.lang.Object):boolean" />
                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247629710">
                    <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247629711">
                      <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247558241" resolveInfo="EngagedOnGenerationLanguagesChange" />
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629712">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247629703" resolveInfo="ref" />
                      </node>
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="4707157387247629713">
                        <property name="3.value:3" value="true" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247629714">
      <property name="1.name:0" value="getDiff" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247629715" />
      <node role="3.typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="4707157387247629716">
        <property name="1.name:0" value="C" />
      </node>
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629717">
        <link role="3.classifier:3" targetNodeId="4.~Set" />
        <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="4707157387247629718">
          <link role="3.typeVariableDeclaration:3" targetNodeId="4707157387247629716" resolveInfo="C" />
        </node>
      </node>
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247629719">
        <property name="1.name:0" value="oldList" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629720">
          <link role="3.classifier:3" targetNodeId="4.~List" />
          <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="4707157387247629721">
            <link role="3.typeVariableDeclaration:3" targetNodeId="4707157387247629716" resolveInfo="C" />
          </node>
        </node>
      </node>
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247629722">
        <property name="1.name:0" value="newList" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629723">
          <link role="3.classifier:3" targetNodeId="4.~List" />
          <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="4707157387247629724">
            <link role="3.typeVariableDeclaration:3" targetNodeId="4707157387247629716" resolveInfo="C" />
          </node>
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629725">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629726">
          <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629727">
            <property name="1.name:0" value="addedImports" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629728">
              <link role="3.classifier:3" targetNodeId="4.~Set" />
              <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="4707157387247629729">
                <link role="3.typeVariableDeclaration:3" targetNodeId="4707157387247629716" resolveInfo="C" />
              </node>
            </node>
            <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247629730">
              <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247629731">
                <link role="3.baseMethodDeclaration:3" targetNodeId="4.~LinkedHashSet.&lt;init&gt;(java.util.Collection)" />
                <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="4707157387247629732">
                  <link role="3.typeVariableDeclaration:3" targetNodeId="4707157387247629716" resolveInfo="C" />
                </node>
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247629733">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247629722" resolveInfo="newList" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247629734">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629735">
            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629736">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247629727" resolveInfo="addedImports" />
            </node>
            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629737">
              <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Set.removeAll(java.util.Collection):boolean" />
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247629738">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247629719" resolveInfo="oldList" />
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247629739">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629740">
            <link role="3.variableDeclaration:3" targetNodeId="4707157387247629727" resolveInfo="addedImports" />
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247629741">
      <property name="1.name:0" value="collectDeletedNodes" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247629742" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="4707157387247629743" />
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247629744">
        <property name="1.name:0" value="onlyOld" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629745">
          <link role="3.classifier:3" targetNodeId="4.~Map" />
          <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629746">
            <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
          </node>
          <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629747">
            <link role="3.classifier:3" targetNodeId="21.~SNode" />
          </node>
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629748">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247629749">
          <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629750">
            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247629751">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247629744" resolveInfo="onlyOld" />
            </node>
            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629752">
              <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Map.entrySet():java.util.Set" />
            </node>
          </node>
          <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629753">
            <property name="1.name:0" value="entry" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629754">
              <link role="3.classifier:3" targetNodeId="4.~Map$Entry" />
              <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629755">
                <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
              </node>
              <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629756">
                <link role="3.classifier:3" targetNodeId="21.~SNode" />
              </node>
            </node>
          </node>
          <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629757">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629758">
              <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629759">
                <property name="1.name:0" value="childrenIds" />
                <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629760">
                  <link role="3.classifier:3" targetNodeId="4.~List" />
                  <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629761">
                    <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
                  </node>
                </node>
                <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247629762">
                  <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247629763">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="4.~ArrayList.&lt;init&gt;()" />
                    <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629764">
                      <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247629765">
              <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629766">
                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629767">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629768">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247629753" resolveInfo="entry" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629769">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Map$Entry.getValue():java.lang.Object" />
                  </node>
                </node>
                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629770">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getChildren():java.util.List" />
                </node>
              </node>
              <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629771">
                <property name="1.name:0" value="child" />
                <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629772">
                  <link role="3.classifier:3" targetNodeId="21.~SNode" />
                </node>
              </node>
              <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629773">
                <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247629774">
                  <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629775">
                    <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629776">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247629759" resolveInfo="childrenIds" />
                    </node>
                    <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629777">
                      <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.add(java.lang.Object):boolean" />
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629778">
                        <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629779">
                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247629771" resolveInfo="child" />
                        </node>
                        <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629780">
                          <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getSNodeId():jetbrains.mps.smodel.SNodeId" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247629781">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629782">
                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247629783">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247628939" resolveInfo="myChanges" />
                </node>
                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629784">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.add(java.lang.Object):boolean" />
                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247629785">
                    <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247629786">
                      <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247557415" resolveInfo="DeleteNodeChange" />
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629787">
                        <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629788">
                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247629753" resolveInfo="entry" />
                        </node>
                        <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629789">
                          <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Map$Entry.getKey():java.lang.Object" />
                        </node>
                      </node>
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629790">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247629759" resolveInfo="childrenIds" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247629791">
      <property name="1.name:0" value="collectAddedNodes" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247629792" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="4707157387247629793" />
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247629794">
        <property name="1.name:0" value="onlyNew" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629795">
          <link role="3.classifier:3" targetNodeId="4.~Map" />
          <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629796">
            <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
          </node>
          <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629797">
            <link role="3.classifier:3" targetNodeId="21.~SNode" />
          </node>
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629798">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247629799">
          <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629800">
            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247629801">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247629794" resolveInfo="onlyNew" />
            </node>
            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629802">
              <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Map.entrySet():java.util.Set" />
            </node>
          </node>
          <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629803">
            <property name="1.name:0" value="entry" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629804">
              <link role="3.classifier:3" targetNodeId="4.~Map$Entry" />
              <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629805">
                <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
              </node>
              <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629806">
                <link role="3.classifier:3" targetNodeId="21.~SNode" />
              </node>
            </node>
          </node>
          <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629807">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629808">
              <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629809">
                <property name="1.name:0" value="node" />
                <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629810">
                  <link role="3.classifier:3" targetNodeId="21.~SNode" />
                </node>
                <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629811">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629812">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247629803" resolveInfo="entry" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629813">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Map$Entry.getValue():java.lang.Object" />
                  </node>
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629814">
              <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629815">
                <property name="1.name:0" value="id" />
                <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629816">
                  <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
                </node>
                <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629817">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629818">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247629803" resolveInfo="entry" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629819">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Map$Entry.getKey():java.lang.Object" />
                  </node>
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.AssertStatement:3" id="4707157387247629820">
              <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="4707157387247629821">
                <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629822">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247629809" resolveInfo="node" />
                </node>
                <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247629823" />
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629824">
              <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629825">
                <property name="1.name:0" value="role" />
                <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629826">
                  <link role="3.classifier:3" targetNodeId="2.~String" />
                </node>
                <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629827">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629828">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247629809" resolveInfo="node" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629829">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getRole_():java.lang.String" />
                  </node>
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247629830">
              <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="4707157387247629831">
                <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629832">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247629825" resolveInfo="role" />
                </node>
                <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247629833" />
              </node>
              <node role="3.ifFalseStatement:3" type="jetbrains.mps.baseLanguage.structure.BlockStatement:3" id="4707157387247629834">
                <node role="3.statements:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629835">
                  <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247629836">
                    <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629837">
                      <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247629838">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247628939" resolveInfo="myChanges" />
                      </node>
                      <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629839">
                        <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.add(java.lang.Object):boolean" />
                        <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247629840">
                          <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247629841">
                            <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247556489" resolveInfo="AddRootChange" />
                            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629842">
                              <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629843">
                                <link role="3.variableDeclaration:3" targetNodeId="4707157387247629809" resolveInfo="node" />
                              </node>
                              <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629844">
                                <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getConceptFqName():java.lang.String" />
                              </node>
                            </node>
                            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629845">
                              <link role="3.variableDeclaration:3" targetNodeId="4707157387247629815" resolveInfo="id" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629846">
                <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247629847">
                  <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.NotExpression:3" id="4707157387247629848">
                    <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247629849">
                      <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247630564" resolveInfo="isMultipleCardinality" />
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629850">
                        <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629851">
                          <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629852">
                            <link role="3.variableDeclaration:3" targetNodeId="4707157387247629809" resolveInfo="node" />
                          </node>
                          <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629853">
                            <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getParent():jetbrains.mps.smodel.SNode" />
                          </node>
                        </node>
                        <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629854">
                          <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getConceptFqName():java.lang.String" />
                        </node>
                      </node>
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629855">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247629825" resolveInfo="role" />
                      </node>
                    </node>
                  </node>
                  <node role="3.ifFalseStatement:3" type="jetbrains.mps.baseLanguage.structure.BlockStatement:3" id="4707157387247629856">
                    <node role="3.statements:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629857">
                      <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629858">
                        <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629859">
                          <property name="1.name:0" value="prevChild" />
                          <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629860">
                            <link role="3.classifier:3" targetNodeId="21.~SNode" />
                          </node>
                          <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629861">
                            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629862">
                              <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629863">
                                <link role="3.variableDeclaration:3" targetNodeId="4707157387247629809" resolveInfo="node" />
                              </node>
                              <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629864">
                                <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getParent():jetbrains.mps.smodel.SNode" />
                              </node>
                            </node>
                            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629865">
                              <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getPrevChild(jetbrains.mps.smodel.SNode):jetbrains.mps.smodel.SNode" />
                              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629866">
                                <link role="3.variableDeclaration:3" targetNodeId="4707157387247629809" resolveInfo="node" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629867">
                        <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629868">
                          <property name="1.name:0" value="prevId" />
                          <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629869">
                            <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
                          </node>
                          <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247629870" />
                        </node>
                      </node>
                      <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629871">
                        <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629872">
                          <property name="1.name:0" value="prevRole" />
                          <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629873">
                            <link role="3.classifier:3" targetNodeId="2.~String" />
                          </node>
                          <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247629874" />
                        </node>
                      </node>
                      <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247629875">
                        <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="4707157387247629876">
                          <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629877">
                            <link role="3.variableDeclaration:3" targetNodeId="4707157387247629859" resolveInfo="prevChild" />
                          </node>
                          <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247629878" />
                        </node>
                        <node role="3.ifFalseStatement:3" type="jetbrains.mps.baseLanguage.structure.BlockStatement:3" id="4707157387247629879">
                          <node role="3.statements:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629880">
                            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629881">
                              <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629882">
                                <property name="1.name:0" value="prevSubling" />
                                <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629883">
                                  <link role="3.classifier:3" targetNodeId="21.~SNode" />
                                </node>
                                <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629884">
                                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629885">
                                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247629809" resolveInfo="node" />
                                  </node>
                                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629886">
                                    <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.prevSibling():jetbrains.mps.smodel.SNode" />
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247629887">
                              <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="4707157387247629888">
                                <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629889">
                                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247629882" resolveInfo="prevSubling" />
                                </node>
                                <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247629890" />
                              </node>
                              <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629891">
                                <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247629892">
                                  <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="4707157387247629893">
                                    <node role="3.lValue:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629894">
                                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247629872" resolveInfo="prevRole" />
                                    </node>
                                    <node role="3.rValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629895">
                                      <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629896">
                                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247629882" resolveInfo="prevSubling" />
                                      </node>
                                      <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629897">
                                        <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getRole_():java.lang.String" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629898">
                          <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247629899">
                            <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="4707157387247629900">
                              <node role="3.lValue:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629901">
                                <link role="3.variableDeclaration:3" targetNodeId="4707157387247629868" resolveInfo="prevId" />
                              </node>
                              <node role="3.rValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629902">
                                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629903">
                                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247629859" resolveInfo="prevChild" />
                                </node>
                                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629904">
                                  <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getSNodeId():jetbrains.mps.smodel.SNodeId" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247629905">
                        <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629906">
                          <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247629907">
                            <link role="3.variableDeclaration:3" targetNodeId="4707157387247628939" resolveInfo="myChanges" />
                          </node>
                          <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629908">
                            <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.add(java.lang.Object):boolean" />
                            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247629909">
                              <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247629910">
                                <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247557602" resolveInfo="AddNodeChange" />
                                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629911">
                                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629912">
                                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247629809" resolveInfo="node" />
                                  </node>
                                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629913">
                                    <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getConceptFqName():java.lang.String" />
                                  </node>
                                </node>
                                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629914">
                                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247629815" resolveInfo="id" />
                                </node>
                                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629915">
                                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247629825" resolveInfo="role" />
                                </node>
                                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629916">
                                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629917">
                                    <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629918">
                                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247629809" resolveInfo="node" />
                                    </node>
                                    <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629919">
                                      <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getParent():jetbrains.mps.smodel.SNode" />
                                    </node>
                                  </node>
                                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629920">
                                    <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getSNodeId():jetbrains.mps.smodel.SNodeId" />
                                  </node>
                                </node>
                                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629921">
                                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247629868" resolveInfo="prevId" />
                                </node>
                                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629922">
                                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247629872" resolveInfo="prevRole" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629923">
                    <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629924">
                      <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629925">
                        <property name="1.name:0" value="parentId" />
                        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629926">
                          <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
                        </node>
                        <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629927">
                          <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629928">
                            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629929">
                              <link role="3.variableDeclaration:3" targetNodeId="4707157387247629809" resolveInfo="node" />
                            </node>
                            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629930">
                              <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getParent():jetbrains.mps.smodel.SNode" />
                            </node>
                          </node>
                          <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629931">
                            <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getSNodeId():jetbrains.mps.smodel.SNodeId" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629932">
                      <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629933">
                        <property name="1.name:0" value="oldParent" />
                        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629934">
                          <link role="3.classifier:3" targetNodeId="21.~SNode" />
                        </node>
                        <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629935">
                          <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247629936">
                            <link role="3.variableDeclaration:3" targetNodeId="4707157387247628924" resolveInfo="myOldModel" />
                          </node>
                          <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629937">
                            <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SModel.getNodeById(jetbrains.mps.smodel.SNodeId):jetbrains.mps.smodel.SNode" />
                            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629938">
                              <link role="3.variableDeclaration:3" targetNodeId="4707157387247629925" resolveInfo="parentId" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629939">
                      <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629940">
                        <property name="1.name:0" value="oldChildId" />
                        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629941">
                          <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
                        </node>
                        <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247629942" />
                      </node>
                    </node>
                    <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247629943">
                      <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="4707157387247629944">
                        <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629945">
                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247629933" resolveInfo="oldParent" />
                        </node>
                        <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247629946" />
                      </node>
                      <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629947">
                        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247629948">
                          <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="4707157387247629949">
                            <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629950">
                              <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629951">
                                <link role="3.variableDeclaration:3" targetNodeId="4707157387247629933" resolveInfo="oldParent" />
                              </node>
                              <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629952">
                                <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getChild(java.lang.String):jetbrains.mps.smodel.SNode" />
                                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629953">
                                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247629825" resolveInfo="role" />
                                </node>
                              </node>
                            </node>
                            <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247629954" />
                          </node>
                          <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629955">
                            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247629956">
                              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="4707157387247629957">
                                <node role="3.lValue:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629958">
                                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247629940" resolveInfo="oldChildId" />
                                </node>
                                <node role="3.rValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629959">
                                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629960">
                                    <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629961">
                                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247629933" resolveInfo="oldParent" />
                                    </node>
                                    <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629962">
                                      <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getChild(java.lang.String):jetbrains.mps.smodel.SNode" />
                                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629963">
                                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247629825" resolveInfo="role" />
                                      </node>
                                    </node>
                                  </node>
                                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629964">
                                    <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getSNodeId():jetbrains.mps.smodel.SNodeId" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629965">
                      <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629966">
                        <property name="1.name:0" value="prevRole" />
                        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629967">
                          <link role="3.classifier:3" targetNodeId="2.~String" />
                        </node>
                        <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247629968" />
                      </node>
                    </node>
                    <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247629969">
                      <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247629970">
                        <property name="1.name:0" value="prevSibling" />
                        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247629971">
                          <link role="3.classifier:3" targetNodeId="21.~SNode" />
                        </node>
                        <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629972">
                          <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629973">
                            <link role="3.variableDeclaration:3" targetNodeId="4707157387247629809" resolveInfo="node" />
                          </node>
                          <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629974">
                            <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.prevSibling():jetbrains.mps.smodel.SNode" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247629975">
                      <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="4707157387247629976">
                        <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629977">
                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247629970" resolveInfo="prevSibling" />
                        </node>
                        <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247629978" />
                      </node>
                      <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247629979">
                        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247629980">
                          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="4707157387247629981">
                            <node role="3.lValue:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629982">
                              <link role="3.variableDeclaration:3" targetNodeId="4707157387247629966" resolveInfo="prevRole" />
                            </node>
                            <node role="3.rValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629983">
                              <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629984">
                                <link role="3.variableDeclaration:3" targetNodeId="4707157387247629970" resolveInfo="prevSibling" />
                              </node>
                              <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629985">
                                <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getRole_():java.lang.String" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247629986">
                      <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629987">
                        <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247629988">
                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247628939" resolveInfo="myChanges" />
                        </node>
                        <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629989">
                          <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.add(java.lang.Object):boolean" />
                          <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247629990">
                            <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247629991">
                              <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247557777" resolveInfo="SetNodeChange" />
                              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247629992">
                                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629993">
                                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247629809" resolveInfo="node" />
                                </node>
                                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247629994">
                                  <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getConceptFqName():java.lang.String" />
                                </node>
                              </node>
                              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629995">
                                <link role="3.variableDeclaration:3" targetNodeId="4707157387247629815" resolveInfo="id" />
                              </node>
                              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629996">
                                <link role="3.variableDeclaration:3" targetNodeId="4707157387247629825" resolveInfo="role" />
                              </node>
                              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629997">
                                <link role="3.variableDeclaration:3" targetNodeId="4707157387247629925" resolveInfo="parentId" />
                              </node>
                              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629998">
                                <link role="3.variableDeclaration:3" targetNodeId="4707157387247629940" resolveInfo="oldChildId" />
                              </node>
                              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247629999">
                                <link role="3.variableDeclaration:3" targetNodeId="4707157387247629966" resolveInfo="prevRole" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247630000">
      <property name="1.name:0" value="collectMovedNodes" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247630001" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="4707157387247630002" />
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247630003">
        <property name="1.name:0" value="intersect" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630004">
          <link role="3.classifier:3" targetNodeId="4.~Set" />
          <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630005">
            <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
          </node>
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630006">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247630007">
          <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247630008">
            <link role="3.variableDeclaration:3" targetNodeId="4707157387247630003" resolveInfo="intersect" />
          </node>
          <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247630009">
            <property name="1.name:0" value="id" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630010">
              <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
            </node>
          </node>
          <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630011">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247630012">
              <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247630013">
                <property name="1.name:0" value="n" />
                <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630014">
                  <link role="3.classifier:3" targetNodeId="21.~SNode" />
                </node>
                <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630015">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247630016">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247628927" resolveInfo="myNewModel" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630017">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SModel.getNodeById(jetbrains.mps.smodel.SNodeId):jetbrains.mps.smodel.SNode" />
                    <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630018">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247630009" resolveInfo="id" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247630019">
              <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247630020">
                <property name="1.name:0" value="o" />
                <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630021">
                  <link role="3.classifier:3" targetNodeId="21.~SNode" />
                </node>
                <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630022">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247630023">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247628924" resolveInfo="myOldModel" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630024">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SModel.getNodeById(jetbrains.mps.smodel.SNodeId):jetbrains.mps.smodel.SNode" />
                    <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630025">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247630009" resolveInfo="id" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.AssertStatement:3" id="4707157387247630026">
              <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.AndExpression:3" id="4707157387247630027">
                <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="4707157387247630028">
                  <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630029">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247630013" resolveInfo="n" />
                  </node>
                  <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247630030" />
                </node>
                <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="4707157387247630031">
                  <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630032">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247630020" resolveInfo="o" />
                  </node>
                  <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247630033" />
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247630034">
              <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247630035">
                <property name="1.name:0" value="nid" />
                <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630036">
                  <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
                </node>
                <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247630037">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247630183" resolveInfo="getParentId" />
                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630038">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247630013" resolveInfo="n" />
                  </node>
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247630039">
              <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247630040">
                <property name="1.name:0" value="oid" />
                <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630041">
                  <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
                </node>
                <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247630042">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247630183" resolveInfo="getParentId" />
                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630043">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247630020" resolveInfo="o" />
                  </node>
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247630044">
              <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247630045">
                <property name="1.name:0" value="nPrevSibling" />
                <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630046">
                  <link role="3.classifier:3" targetNodeId="21.~SNode" />
                </node>
                <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630047">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630048">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247630013" resolveInfo="n" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630049">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.prevSibling():jetbrains.mps.smodel.SNode" />
                  </node>
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247630050">
              <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247630051">
                <property name="1.name:0" value="oPrevSibling" />
                <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630052">
                  <link role="3.classifier:3" targetNodeId="21.~SNode" />
                </node>
                <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630053">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630054">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247630020" resolveInfo="o" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630055">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.prevSibling():jetbrains.mps.smodel.SNode" />
                  </node>
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247630056">
              <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="4707157387247630057">
                <link role="3.classConcept:3" targetNodeId="18.~ObjectUtils" />
                <link role="3.baseMethodDeclaration:3" targetNodeId="18.~ObjectUtils.equals(java.lang.Object,java.lang.Object):boolean" />
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630058">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630035" resolveInfo="nid" />
                </node>
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630059">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630040" resolveInfo="oid" />
                </node>
              </node>
              <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630060">
                <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247630061">
                  <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="4707157387247630062">
                    <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630063">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247630045" resolveInfo="nPrevSibling" />
                    </node>
                    <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630064">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247630051" resolveInfo="oPrevSibling" />
                    </node>
                  </node>
                  <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630065">
                    <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ContinueStatement:3" id="4707157387247630066" />
                  </node>
                </node>
                <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247630067">
                  <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.AndExpression:3" id="4707157387247630068">
                    <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.AndExpression:3" id="4707157387247630069">
                      <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="4707157387247630070">
                        <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630071">
                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247630045" resolveInfo="nPrevSibling" />
                        </node>
                        <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247630072" />
                      </node>
                      <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="4707157387247630073">
                        <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630074">
                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247630051" resolveInfo="oPrevSibling" />
                        </node>
                        <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247630075" />
                      </node>
                    </node>
                    <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630076">
                      <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630077">
                        <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630078">
                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247630045" resolveInfo="nPrevSibling" />
                        </node>
                        <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630079">
                          <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getId():java.lang.String" />
                        </node>
                      </node>
                      <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630080">
                        <link role="3.baseMethodDeclaration:3" targetNodeId="2.~String.equals(java.lang.Object):boolean" />
                        <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630081">
                          <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630082">
                            <link role="3.variableDeclaration:3" targetNodeId="4707157387247630051" resolveInfo="oPrevSibling" />
                          </node>
                          <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630083">
                            <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getId():java.lang.String" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630084">
                    <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ContinueStatement:3" id="4707157387247630085" />
                  </node>
                </node>
                <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247630086">
                  <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.AndExpression:3" id="4707157387247630087">
                    <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="4707157387247630088">
                      <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630089">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247630045" resolveInfo="nPrevSibling" />
                      </node>
                      <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247630090" />
                    </node>
                    <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.GreaterThanExpression:3" id="4707157387247630091">
                      <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630092">
                        <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247630093">
                          <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247630149" resolveInfo="getChangesFor" />
                          <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630094">
                            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630095">
                              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630045" resolveInfo="nPrevSibling" />
                            </node>
                            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630096">
                              <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getSNodeId():jetbrains.mps.smodel.SNodeId" />
                            </node>
                          </node>
                        </node>
                        <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630097">
                          <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.size():int" />
                        </node>
                      </node>
                      <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="4707157387247630098">
                        <property name="3.value:3" value="0" />
                      </node>
                    </node>
                  </node>
                  <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630099">
                    <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ContinueStatement:3" id="4707157387247630100" />
                  </node>
                </node>
                <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247630101">
                  <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.AndExpression:3" id="4707157387247630102">
                    <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="4707157387247630103">
                      <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630104">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247630051" resolveInfo="oPrevSibling" />
                      </node>
                      <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247630105" />
                    </node>
                    <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.GreaterThanExpression:3" id="4707157387247630106">
                      <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630107">
                        <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247630108">
                          <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247630149" resolveInfo="getChangesFor" />
                          <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630109">
                            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630110">
                              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630051" resolveInfo="oPrevSibling" />
                            </node>
                            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630111">
                              <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getSNodeId():jetbrains.mps.smodel.SNodeId" />
                            </node>
                          </node>
                        </node>
                        <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630112">
                          <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.size():int" />
                        </node>
                      </node>
                      <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="4707157387247630113">
                        <property name="3.value:3" value="0" />
                      </node>
                    </node>
                  </node>
                  <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630114">
                    <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ContinueStatement:3" id="4707157387247630115" />
                  </node>
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247630116">
              <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="4707157387247630117">
                <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630118">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630045" resolveInfo="nPrevSibling" />
                </node>
                <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247630119" />
              </node>
              <node role="3.ifFalseStatement:3" type="jetbrains.mps.baseLanguage.structure.BlockStatement:3" id="4707157387247630120">
                <node role="3.statements:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630121">
                  <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247630122">
                    <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630123">
                      <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247630124">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247628939" resolveInfo="myChanges" />
                      </node>
                      <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630125">
                        <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.add(java.lang.Object):boolean" />
                        <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247630126">
                          <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247630127">
                            <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247556238" resolveInfo="MoveNodeChange" />
                            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630128">
                              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630009" resolveInfo="id" />
                            </node>
                            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630129">
                              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630035" resolveInfo="nid" />
                            </node>
                            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247630130" />
                            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630131">
                              <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630132">
                                <link role="3.variableDeclaration:3" targetNodeId="4707157387247630013" resolveInfo="n" />
                              </node>
                              <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630133">
                                <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getRole_():java.lang.String" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630134">
                <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247630135">
                  <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630136">
                    <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247630137">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247628939" resolveInfo="myChanges" />
                    </node>
                    <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630138">
                      <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.add(java.lang.Object):boolean" />
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247630139">
                        <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247630140">
                          <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247556238" resolveInfo="MoveNodeChange" />
                          <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630141">
                            <link role="3.variableDeclaration:3" targetNodeId="4707157387247630009" resolveInfo="id" />
                          </node>
                          <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630142">
                            <link role="3.variableDeclaration:3" targetNodeId="4707157387247630035" resolveInfo="nid" />
                          </node>
                          <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630143">
                            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630144">
                              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630045" resolveInfo="nPrevSibling" />
                            </node>
                            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630145">
                              <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getSNodeId():jetbrains.mps.smodel.SNodeId" />
                            </node>
                          </node>
                          <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630146">
                            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630147">
                              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630013" resolveInfo="n" />
                            </node>
                            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630148">
                              <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getRole_():java.lang.String" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247630149">
      <property name="1.name:0" value="getChangesFor" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247630150" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630151">
        <link role="3.classifier:3" targetNodeId="4.~List" />
        <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630152">
          <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
        </node>
      </node>
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247630153">
        <property name="1.name:0" value="sNodeId" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630154">
          <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630155">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247630156">
          <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247630157">
            <property name="1.name:0" value="result" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630158">
              <link role="3.classifier:3" targetNodeId="4.~List" />
              <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630159">
                <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
              </node>
            </node>
            <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247630160">
              <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247630161">
                <link role="3.baseMethodDeclaration:3" targetNodeId="4.~ArrayList.&lt;init&gt;()" />
                <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630162">
                  <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247630163">
          <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247630164">
            <link role="3.variableDeclaration:3" targetNodeId="4707157387247628939" resolveInfo="myChanges" />
          </node>
          <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247630165">
            <property name="1.name:0" value="change" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630166">
              <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
            </node>
          </node>
          <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630167">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247630168">
              <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630169">
                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247630170">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630153" resolveInfo="sNodeId" />
                </node>
                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630171">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="2.~Object.equals(java.lang.Object):boolean" />
                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630172">
                    <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630173">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247630165" resolveInfo="change" />
                    </node>
                    <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630174">
                      <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247556975" resolveInfo="getAffectedNodeId" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630175">
                <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247630176">
                  <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630177">
                    <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630178">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247630157" resolveInfo="result" />
                    </node>
                    <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630179">
                      <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.add(java.lang.Object):boolean" />
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630180">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247630165" resolveInfo="change" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247630181">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630182">
            <link role="3.variableDeclaration:3" targetNodeId="4707157387247630157" resolveInfo="result" />
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247630183">
      <property name="1.name:0" value="getParentId" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247630184" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630185">
        <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
      </node>
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247630186">
        <property name="1.name:0" value="n" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630187">
          <link role="3.classifier:3" targetNodeId="21.~SNode" />
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630188">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247630189">
          <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="4707157387247630190">
            <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630191">
              <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247630192">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247630186" resolveInfo="n" />
              </node>
              <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630193">
                <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getParent():jetbrains.mps.smodel.SNode" />
              </node>
            </node>
            <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247630194" />
          </node>
          <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630195">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247630196">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247630197" />
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247630198">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630199">
            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630200">
              <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247630201">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247630186" resolveInfo="n" />
              </node>
              <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630202">
                <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getParent():jetbrains.mps.smodel.SNode" />
              </node>
            </node>
            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630203">
              <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getSNodeId():jetbrains.mps.smodel.SNodeId" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247630204">
      <property name="1.name:0" value="collectPropertyChanges" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247630205" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="4707157387247630206" />
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630207">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247630208">
          <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630209">
            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247630210">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247628927" resolveInfo="myNewModel" />
            </node>
            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630211">
              <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SModel.nodes():java.lang.Iterable" />
            </node>
          </node>
          <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247630212">
            <property name="1.name:0" value="newNode" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630213">
              <link role="3.classifier:3" targetNodeId="21.~SNode" />
            </node>
          </node>
          <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630214">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247630215">
              <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247630216">
                <property name="1.name:0" value="id" />
                <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630217">
                  <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
                </node>
                <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630218">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630219">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247630212" resolveInfo="newNode" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630220">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getSNodeId():jetbrains.mps.smodel.SNodeId" />
                  </node>
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247630221">
              <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247630222">
                <property name="1.name:0" value="oldNode" />
                <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630223">
                  <link role="3.classifier:3" targetNodeId="21.~SNode" />
                </node>
                <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630224">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247630225">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247628924" resolveInfo="myOldModel" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630226">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SModel.getNodeById(jetbrains.mps.smodel.SNodeId):jetbrains.mps.smodel.SNode" />
                    <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630227">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247630216" resolveInfo="id" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247630228">
              <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="4707157387247630229">
                <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630230">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630222" resolveInfo="oldNode" />
                </node>
                <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247630231" />
              </node>
              <node role="3.ifFalseStatement:3" type="jetbrains.mps.baseLanguage.structure.BlockStatement:3" id="4707157387247630232">
                <node role="3.statements:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630233">
                  <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247630234">
                    <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247630235">
                      <property name="1.name:0" value="newNodeProps" />
                      <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630236">
                        <link role="3.classifier:3" targetNodeId="4.~Set" />
                        <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630237">
                          <link role="3.classifier:3" targetNodeId="2.~String" />
                        </node>
                      </node>
                      <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630238">
                        <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630239">
                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247630212" resolveInfo="newNode" />
                        </node>
                        <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630240">
                          <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getPropertyNames():java.util.Set" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247630241">
                    <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247630242">
                      <property name="1.name:0" value="oldNodeProps" />
                      <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630243">
                        <link role="3.classifier:3" targetNodeId="4.~Set" />
                        <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630244">
                          <link role="3.classifier:3" targetNodeId="2.~String" />
                        </node>
                      </node>
                      <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630245">
                        <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630246">
                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247630222" resolveInfo="oldNode" />
                        </node>
                        <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630247">
                          <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getPropertyNames():java.util.Set" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247630248">
                    <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247630249">
                      <property name="1.name:0" value="deletedProps" />
                      <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630250">
                        <link role="3.classifier:3" targetNodeId="4.~Set" />
                        <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630251">
                          <link role="3.classifier:3" targetNodeId="2.~String" />
                        </node>
                      </node>
                      <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247630252">
                        <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247630253">
                          <link role="3.baseMethodDeclaration:3" targetNodeId="4.~HashSet.&lt;init&gt;(java.util.Collection)" />
                          <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630254">
                            <link role="3.classifier:3" targetNodeId="2.~String" />
                          </node>
                          <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630255">
                            <link role="3.variableDeclaration:3" targetNodeId="4707157387247630242" resolveInfo="oldNodeProps" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247630256">
                    <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630257">
                      <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630258">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247630249" resolveInfo="deletedProps" />
                      </node>
                      <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630259">
                        <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Set.removeAll(java.util.Collection):boolean" />
                        <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630260">
                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247630235" resolveInfo="newNodeProps" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247630261">
                    <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630262">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247630249" resolveInfo="deletedProps" />
                    </node>
                    <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247630263">
                      <property name="1.name:0" value="deletedProp" />
                      <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630264">
                        <link role="3.classifier:3" targetNodeId="2.~String" />
                      </node>
                    </node>
                    <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630265">
                      <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247630266">
                        <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630267">
                          <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247630268">
                            <link role="3.variableDeclaration:3" targetNodeId="4707157387247628939" resolveInfo="myChanges" />
                          </node>
                          <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630269">
                            <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.add(java.lang.Object):boolean" />
                            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247630270">
                              <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247630271">
                                <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247557049" resolveInfo="SetPropertyChange" />
                                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630272">
                                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630216" resolveInfo="id" />
                                </node>
                                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630273">
                                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630263" resolveInfo="deletedProp" />
                                </node>
                                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247630274" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247630275">
                    <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630276">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247630235" resolveInfo="newNodeProps" />
                    </node>
                    <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247630277">
                      <property name="1.name:0" value="nnp" />
                      <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630278">
                        <link role="3.classifier:3" targetNodeId="2.~String" />
                      </node>
                    </node>
                    <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630279">
                      <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247630280">
                        <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.NotExpression:3" id="4707157387247630281">
                          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247630282">
                            <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247630334" resolveInfo="eq" />
                            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630283">
                              <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630284">
                                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630285">
                                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630212" resolveInfo="newNode" />
                                </node>
                                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630286">
                                  <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getProperties():java.util.Map" />
                                </node>
                              </node>
                              <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630287">
                                <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Map.get(java.lang.Object):java.lang.Object" />
                                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630288">
                                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630277" resolveInfo="nnp" />
                                </node>
                              </node>
                            </node>
                            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630289">
                              <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630290">
                                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630291">
                                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630222" resolveInfo="oldNode" />
                                </node>
                                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630292">
                                  <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getProperties():java.util.Map" />
                                </node>
                              </node>
                              <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630293">
                                <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Map.get(java.lang.Object):java.lang.Object" />
                                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630294">
                                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630277" resolveInfo="nnp" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630295">
                          <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247630296">
                            <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630297">
                              <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247630298">
                                <link role="3.variableDeclaration:3" targetNodeId="4707157387247628939" resolveInfo="myChanges" />
                              </node>
                              <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630299">
                                <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.add(java.lang.Object):boolean" />
                                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247630300">
                                  <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247630301">
                                    <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247557049" resolveInfo="SetPropertyChange" />
                                    <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630302">
                                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247630216" resolveInfo="id" />
                                    </node>
                                    <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630303">
                                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247630277" resolveInfo="nnp" />
                                    </node>
                                    <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630304">
                                      <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630305">
                                        <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630306">
                                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247630212" resolveInfo="newNode" />
                                        </node>
                                        <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630307">
                                          <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getProperties():java.util.Map" />
                                        </node>
                                      </node>
                                      <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630308">
                                        <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Map.get(java.lang.Object):java.lang.Object" />
                                        <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630309">
                                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247630277" resolveInfo="nnp" />
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630310">
                <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247630311">
                  <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630312">
                    <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630313">
                      <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630314">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247630212" resolveInfo="newNode" />
                      </node>
                      <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630315">
                        <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getProperties():java.util.Map" />
                      </node>
                    </node>
                    <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630316">
                      <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Map.keySet():java.util.Set" />
                    </node>
                  </node>
                  <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247630317">
                    <property name="1.name:0" value="prop" />
                    <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630318">
                      <link role="3.classifier:3" targetNodeId="2.~String" />
                    </node>
                  </node>
                  <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630319">
                    <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247630320">
                      <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630321">
                        <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247630322">
                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247628939" resolveInfo="myChanges" />
                        </node>
                        <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630323">
                          <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.add(java.lang.Object):boolean" />
                          <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247630324">
                            <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247630325">
                              <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247557049" resolveInfo="SetPropertyChange" />
                              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630326">
                                <link role="3.variableDeclaration:3" targetNodeId="4707157387247630216" resolveInfo="id" />
                              </node>
                              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630327">
                                <link role="3.variableDeclaration:3" targetNodeId="4707157387247630317" resolveInfo="prop" />
                              </node>
                              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630328">
                                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630329">
                                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630330">
                                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247630212" resolveInfo="newNode" />
                                  </node>
                                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630331">
                                    <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getProperties():java.util.Map" />
                                  </node>
                                </node>
                                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630332">
                                  <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Map.get(java.lang.Object):java.lang.Object" />
                                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630333">
                                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247630317" resolveInfo="prop" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247630334">
      <property name="1.name:0" value="eq" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247630335" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="4707157387247630336" />
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247630337">
        <property name="1.name:0" value="o1" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630338">
          <link role="3.classifier:3" targetNodeId="2.~Object" />
        </node>
      </node>
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247630339">
        <property name="1.name:0" value="o2" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630340">
          <link role="3.classifier:3" targetNodeId="2.~Object" />
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630341">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247630342">
          <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="4707157387247630343">
            <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247630344">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630337" resolveInfo="o1" />
            </node>
            <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247630345" />
          </node>
          <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630346">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247630347">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="4707157387247630348">
                <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247630349">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630337" resolveInfo="o1" />
                </node>
                <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247630350">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630339" resolveInfo="o2" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247630351">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630352">
            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247630353">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630337" resolveInfo="o1" />
            </node>
            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630354">
              <link role="3.baseMethodDeclaration:3" targetNodeId="2.~Object.equals(java.lang.Object):boolean" />
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247630355">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247630339" resolveInfo="o2" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247630356">
      <property name="1.name:0" value="collectReferenceChanges" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247630357" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="4707157387247630358" />
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630359">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247630360">
          <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630361">
            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247630362">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247628927" resolveInfo="myNewModel" />
            </node>
            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630363">
              <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SModel.nodes():java.lang.Iterable" />
            </node>
          </node>
          <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247630364">
            <property name="1.name:0" value="newNode" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630365">
              <link role="3.classifier:3" targetNodeId="21.~SNode" />
            </node>
          </node>
          <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630366">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247630367">
              <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247630368">
                <property name="1.name:0" value="id" />
                <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630369">
                  <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
                </node>
                <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630370">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630371">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247630364" resolveInfo="newNode" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630372">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getSNodeId():jetbrains.mps.smodel.SNodeId" />
                  </node>
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247630373">
              <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247630374">
                <property name="1.name:0" value="oldNode" />
                <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630375">
                  <link role="3.classifier:3" targetNodeId="21.~SNode" />
                </node>
                <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630376">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247630377">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247628924" resolveInfo="myOldModel" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630378">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SModel.getNodeById(jetbrains.mps.smodel.SNodeId):jetbrains.mps.smodel.SNode" />
                    <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630379">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247630368" resolveInfo="id" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247630380">
              <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="4707157387247630381">
                <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630382">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630374" resolveInfo="oldNode" />
                </node>
                <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247630383" />
              </node>
              <node role="3.ifFalseStatement:3" type="jetbrains.mps.baseLanguage.structure.BlockStatement:3" id="4707157387247630384">
                <node role="3.statements:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630385">
                  <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247630386">
                    <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247630387">
                      <property name="1.name:0" value="roles" />
                      <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630388">
                        <link role="3.classifier:3" targetNodeId="4.~Set" />
                        <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630389">
                          <link role="3.classifier:3" targetNodeId="2.~String" />
                        </node>
                      </node>
                      <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247630390">
                        <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247630391">
                          <link role="3.baseMethodDeclaration:3" targetNodeId="4.~HashSet.&lt;init&gt;(java.util.Collection)" />
                          <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630392">
                            <link role="3.classifier:3" targetNodeId="2.~String" />
                          </node>
                          <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630393">
                            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630394">
                              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630364" resolveInfo="newNode" />
                            </node>
                            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630395">
                              <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getReferenceRoles():java.util.Set" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247630396">
                    <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630397">
                      <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630398">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247630387" resolveInfo="roles" />
                      </node>
                      <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630399">
                        <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Set.addAll(java.util.Collection):boolean" />
                        <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630400">
                          <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630401">
                            <link role="3.variableDeclaration:3" targetNodeId="4707157387247630374" resolveInfo="oldNode" />
                          </node>
                          <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630402">
                            <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getReferenceRoles():java.util.Set" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247630403">
                    <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630404">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247630387" resolveInfo="roles" />
                    </node>
                    <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247630405">
                      <property name="1.name:0" value="role" />
                      <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630406">
                        <link role="3.classifier:3" targetNodeId="2.~String" />
                      </node>
                    </node>
                    <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630407">
                      <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247630408">
                        <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.NotExpression:3" id="4707157387247630409">
                          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247630410">
                            <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247630564" resolveInfo="isMultipleCardinality" />
                            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630411">
                              <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630412">
                                <link role="3.variableDeclaration:3" targetNodeId="4707157387247630364" resolveInfo="newNode" />
                              </node>
                              <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630413">
                                <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getConceptFqName():java.lang.String" />
                              </node>
                            </node>
                            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630414">
                              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630405" resolveInfo="role" />
                            </node>
                          </node>
                        </node>
                        <node role="3.ifFalseStatement:3" type="jetbrains.mps.baseLanguage.structure.BlockStatement:3" id="4707157387247630415">
                          <node role="3.statements:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630416">
                            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247630417">
                              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630418">
                                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference:3" id="4707157387247630419">
                                  <link role="3.classifier:3" targetNodeId="2.~System" />
                                  <link role="3.variableDeclaration:3" targetNodeId="2.~System.out" />
                                </node>
                                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630420">
                                  <link role="3.baseMethodDeclaration:3" targetNodeId="26.~PrintStream.println(java.lang.String):void" />
                                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="4707157387247630421">
                                    <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="4707157387247630422">
                                      <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="4707157387247630423">
                                        <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="4707157387247630424">
                                          <property name="3.value:3" value="we have too many references : " />
                                        </node>
                                        <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630425">
                                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247630364" resolveInfo="newNode" />
                                        </node>
                                      </node>
                                      <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="4707157387247630426">
                                        <property name="3.value:3" value=" " />
                                      </node>
                                    </node>
                                    <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630427">
                                      <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630428">
                                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247630364" resolveInfo="newNode" />
                                      </node>
                                      <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630429">
                                        <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getId():java.lang.String" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247630430">
                              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630431">
                                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference:3" id="4707157387247630432">
                                  <link role="3.classifier:3" targetNodeId="2.~System" />
                                  <link role="3.variableDeclaration:3" targetNodeId="2.~System.out" />
                                </node>
                                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630433">
                                  <link role="3.baseMethodDeclaration:3" targetNodeId="26.~PrintStream.println(java.lang.String):void" />
                                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="4707157387247630434">
                                    <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="4707157387247630435">
                                      <property name="3.value:3" value="role : " />
                                    </node>
                                    <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630436">
                                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247630405" resolveInfo="role" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247630437">
                              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630438">
                                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference:3" id="4707157387247630439">
                                  <link role="3.classifier:3" targetNodeId="2.~System" />
                                  <link role="3.variableDeclaration:3" targetNodeId="2.~System.out" />
                                </node>
                                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630440">
                                  <link role="3.baseMethodDeclaration:3" targetNodeId="26.~PrintStream.println(java.lang.String):void" />
                                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="4707157387247630441">
                                    <property name="3.value:3" value="not supported!" />
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247630442">
                              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247630443">
                                <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247630564" resolveInfo="isMultipleCardinality" />
                                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630444">
                                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630445">
                                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247630364" resolveInfo="newNode" />
                                  </node>
                                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630446">
                                    <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getConceptFqName():java.lang.String" />
                                  </node>
                                </node>
                                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630447">
                                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630405" resolveInfo="role" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630448">
                          <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247630449">
                            <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.AndExpression:3" id="4707157387247630450">
                              <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="4707157387247630451">
                                <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630452">
                                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630453">
                                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247630374" resolveInfo="oldNode" />
                                  </node>
                                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630454">
                                    <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getReference(java.lang.String):jetbrains.mps.smodel.SReference" />
                                    <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630455">
                                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247630405" resolveInfo="role" />
                                    </node>
                                  </node>
                                </node>
                                <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247630456" />
                              </node>
                              <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="4707157387247630457">
                                <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630458">
                                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630459">
                                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247630364" resolveInfo="newNode" />
                                  </node>
                                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630460">
                                    <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getReference(java.lang.String):jetbrains.mps.smodel.SReference" />
                                    <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630461">
                                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247630405" resolveInfo="role" />
                                    </node>
                                  </node>
                                </node>
                                <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247630462" />
                              </node>
                            </node>
                            <node role="3.ifFalseStatement:3" type="jetbrains.mps.baseLanguage.structure.BlockStatement:3" id="4707157387247630463">
                              <node role="3.statements:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630464">
                                <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247630465">
                                  <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.NotExpression:3" id="4707157387247630466">
                                    <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630467">
                                      <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression:3" id="4707157387247630468">
                                        <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="4707157387247630469">
                                          <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="4707157387247630470">
                                            <property name="3.value:3" value="" />
                                          </node>
                                          <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247630471">
                                            <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247630534" resolveInfo="getTargetId" />
                                            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630472">
                                              <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630473">
                                                <link role="3.variableDeclaration:3" targetNodeId="4707157387247630364" resolveInfo="newNode" />
                                              </node>
                                              <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630474">
                                                <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getReference(java.lang.String):jetbrains.mps.smodel.SReference" />
                                                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630475">
                                                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630405" resolveInfo="role" />
                                                </node>
                                              </node>
                                            </node>
                                          </node>
                                        </node>
                                      </node>
                                      <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630476">
                                        <link role="3.baseMethodDeclaration:3" targetNodeId="2.~String.equals(java.lang.Object):boolean" />
                                        <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="4707157387247630477">
                                          <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="4707157387247630478">
                                            <property name="3.value:3" value="" />
                                          </node>
                                          <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247630479">
                                            <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247630534" resolveInfo="getTargetId" />
                                            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630480">
                                              <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630481">
                                                <link role="3.variableDeclaration:3" targetNodeId="4707157387247630374" resolveInfo="oldNode" />
                                              </node>
                                              <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630482">
                                                <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getReference(java.lang.String):jetbrains.mps.smodel.SReference" />
                                                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630483">
                                                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630405" resolveInfo="role" />
                                                </node>
                                              </node>
                                            </node>
                                          </node>
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                  <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630484">
                                    <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247630485">
                                      <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630486">
                                        <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247630487">
                                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247628939" resolveInfo="myChanges" />
                                        </node>
                                        <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630488">
                                          <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.add(java.lang.Object):boolean" />
                                          <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247630489">
                                            <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247630490">
                                              <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247558500" resolveInfo="SetReferenceChange" />
                                              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630491">
                                                <link role="3.variableDeclaration:3" targetNodeId="4707157387247630368" resolveInfo="id" />
                                              </node>
                                              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247630492">
                                                <link role="3.variableDeclaration:3" targetNodeId="4707157387247628927" resolveInfo="myNewModel" />
                                              </node>
                                              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630493">
                                                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630494">
                                                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630364" resolveInfo="newNode" />
                                                </node>
                                                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630495">
                                                  <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getReference(java.lang.String):jetbrains.mps.smodel.SReference" />
                                                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630496">
                                                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247630405" resolveInfo="role" />
                                                  </node>
                                                </node>
                                              </node>
                                              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630497">
                                                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630498">
                                                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630364" resolveInfo="newNode" />
                                                </node>
                                                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630499">
                                                  <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getReferent(java.lang.String):jetbrains.mps.smodel.SNode" />
                                                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630500">
                                                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247630405" resolveInfo="role" />
                                                  </node>
                                                </node>
                                              </node>
                                            </node>
                                          </node>
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630501">
                              <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247630502">
                                <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630503">
                                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247630504">
                                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247628939" resolveInfo="myChanges" />
                                  </node>
                                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630505">
                                    <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.add(java.lang.Object):boolean" />
                                    <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247630506">
                                      <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247630507">
                                        <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247557987" resolveInfo="DeleteReferenceChange" />
                                        <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630508">
                                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247630368" resolveInfo="id" />
                                        </node>
                                        <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247630509">
                                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247628927" resolveInfo="myNewModel" />
                                        </node>
                                        <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630510">
                                          <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630511">
                                            <link role="3.variableDeclaration:3" targetNodeId="4707157387247630374" resolveInfo="oldNode" />
                                          </node>
                                          <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630512">
                                            <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getReference(java.lang.String):jetbrains.mps.smodel.SReference" />
                                            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630513">
                                              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630405" resolveInfo="role" />
                                            </node>
                                          </node>
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630514">
                <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247630515">
                  <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630516">
                    <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630517">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247630364" resolveInfo="newNode" />
                    </node>
                    <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630518">
                      <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getReferences():java.util.List" />
                    </node>
                  </node>
                  <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247630519">
                    <property name="1.name:0" value="ref" />
                    <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630520">
                      <link role="3.classifier:3" targetNodeId="21.~SReference" />
                    </node>
                  </node>
                  <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630521">
                    <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247630522">
                      <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630523">
                        <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247630524">
                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247628939" resolveInfo="myChanges" />
                        </node>
                        <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630525">
                          <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.add(java.lang.Object):boolean" />
                          <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247630526">
                            <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247630527">
                              <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247558500" resolveInfo="SetReferenceChange" />
                              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630528">
                                <link role="3.variableDeclaration:3" targetNodeId="4707157387247630368" resolveInfo="id" />
                              </node>
                              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247630529">
                                <link role="3.variableDeclaration:3" targetNodeId="4707157387247628927" resolveInfo="myNewModel" />
                              </node>
                              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630530">
                                <link role="3.variableDeclaration:3" targetNodeId="4707157387247630519" resolveInfo="ref" />
                              </node>
                              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630531">
                                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630532">
                                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630519" resolveInfo="ref" />
                                </node>
                                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630533">
                                  <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SReference.getTargetNode():jetbrains.mps.smodel.SNode" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247630534">
      <property name="1.name:0" value="getTargetId" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247630535" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630536">
        <link role="3.classifier:3" targetNodeId="2.~String" />
      </node>
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247630537">
        <property name="1.name:0" value="ref" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630538">
          <link role="3.classifier:3" targetNodeId="21.~SReference" />
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630539">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247630540">
          <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="4707157387247630541">
            <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247630542">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630537" resolveInfo="ref" />
            </node>
            <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247630543" />
          </node>
          <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630544">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247630545">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247630546" />
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247630547">
          <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247630548">
            <property name="1.name:0" value="id" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630549">
              <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
            </node>
            <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630550">
              <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247630551">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247630537" resolveInfo="ref" />
              </node>
              <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630552">
                <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SReference.getTargetNodeId():jetbrains.mps.smodel.SNodeId" />
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247630553">
          <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="4707157387247630554">
            <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630555">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630548" resolveInfo="id" />
            </node>
            <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247630556" />
          </node>
          <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630557">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247630558">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247630559" />
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247630560">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630561">
            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630562">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630548" resolveInfo="id" />
            </node>
            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630563">
              <link role="3.baseMethodDeclaration:3" targetNodeId="2.~Object.toString():java.lang.String" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247630564">
      <property name="1.name:0" value="isMultipleCardinality" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247630565" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="4707157387247630566" />
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247630567">
        <property name="1.name:0" value="fqName" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630568">
          <link role="3.classifier:3" targetNodeId="2.~String" />
        </node>
      </node>
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247630569">
        <property name="1.name:0" value="role" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630570">
          <link role="3.classifier:3" targetNodeId="2.~String" />
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630571">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247630572">
          <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247630573">
            <property name="1.name:0" value="ld" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630574">
              <link role="3.classifier:3" targetNodeId="24.~LinkDeclaration" />
            </node>
            <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="4707157387247630575">
              <link role="3.classConcept:3" targetNodeId="6.~SModelSearchUtil" />
              <link role="3.baseMethodDeclaration:3" targetNodeId="6.~SModelSearchUtil.findLinkDeclaration(jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration,java.lang.String):jetbrains.mps.lang.structure.structure.LinkDeclaration" />
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="4707157387247630576">
                <link role="3.classConcept:3" targetNodeId="21.~SModelUtil_new" />
                <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SModelUtil_new.findConceptDeclaration(java.lang.String,jetbrains.mps.smodel.IScope):jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration" />
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247630577">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630567" resolveInfo="fqName" />
                </node>
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="4707157387247630578">
                  <link role="3.classConcept:3" targetNodeId="11.~GlobalScope" />
                  <link role="3.baseMethodDeclaration:3" targetNodeId="11.~GlobalScope.getInstance():jetbrains.mps.project.GlobalScope" />
                </node>
              </node>
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247630579">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247630569" resolveInfo="role" />
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247630580">
          <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="4707157387247630581">
            <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630582">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630573" resolveInfo="ld" />
            </node>
            <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247630583" />
          </node>
          <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630584">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247630585">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="4707157387247630586" />
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247630587">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.AndExpression:3" id="4707157387247630588">
            <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="4707157387247630589">
              <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630590">
                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630591">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630573" resolveInfo="ld" />
                </node>
                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630592">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="24.~LinkDeclaration.getSourceCardinality():jetbrains.mps.lang.structure.structure.Cardinality" />
                </node>
              </node>
              <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="3613324658897910017">
                <link role="3.enumConstantDeclaration:3" targetNodeId="24.~Cardinality._0__1" resolveInfo="_0__1" />
                <link role="3.enumClass:3" targetNodeId="24.~Cardinality" resolveInfo="Cardinality" />
              </node>
            </node>
            <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="4707157387247630594">
              <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630595">
                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630596">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630573" resolveInfo="ld" />
                </node>
                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630597">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="24.~LinkDeclaration.getSourceCardinality():jetbrains.mps.lang.structure.structure.Cardinality" />
                </node>
              </node>
              <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="3613324658897910018">
                <link role="3.enumConstantDeclaration:3" targetNodeId="24.~Cardinality._1" resolveInfo="_1" />
                <link role="3.enumClass:3" targetNodeId="24.~Cardinality" resolveInfo="Cardinality" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247630599">
      <property name="1.name:0" value="getChanges" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4707157387247630600" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630601">
        <link role="3.classifier:3" targetNodeId="4.~List" />
        <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630602">
          <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630603">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247630604">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247630605">
            <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247630606">
              <link role="3.baseMethodDeclaration:3" targetNodeId="4.~ArrayList.&lt;init&gt;(java.util.Collection)" />
              <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630607">
                <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
              </node>
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247630608">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247628939" resolveInfo="myChanges" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="4707157387247630609">
    <property name="1.name:0" value="MPSDiffRequestFactory" />
    <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4707157387247630610" />
    <node role="3.superclass:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630611">
      <link role="3.classifier:3" targetNodeId="23.~DiffRequestFactoryImpl" />
    </node>
    <node role="3.constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="4707157387247630617">
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4707157387247630618" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="4707157387247630619" />
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630620" />
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247630621">
      <property name="1.name:0" value="createMergeRequest" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4707157387247630622" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630623">
        <link role="3.classifier:3" targetNodeId="15.~MergeRequest" />
      </node>
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247630624">
        <property name="1.name:0" value="leftText" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630625">
          <link role="3.classifier:3" targetNodeId="2.~String" />
        </node>
      </node>
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247630626">
        <property name="1.name:0" value="rightText" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630627">
          <link role="3.classifier:3" targetNodeId="2.~String" />
        </node>
      </node>
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247630628">
        <property name="1.name:0" value="originalContent" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630629">
          <link role="3.classifier:3" targetNodeId="2.~String" />
        </node>
      </node>
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247630630">
        <property name="1.name:0" value="file" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630631">
          <link role="3.classifier:3" targetNodeId="22.~VirtualFile" />
        </node>
        <node role="3.annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="4707157387247630632">
          <link role="3.annotation:3" targetNodeId="13.~NotNull" />
        </node>
      </node>
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247630633">
        <property name="1.name:0" value="project" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630634">
          <link role="3.classifier:3" targetNodeId="25.~Project" />
        </node>
      </node>
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247630635">
        <property name="1.name:0" value="actionButtonPresentation" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630636">
          <link role="3.classifier:3" targetNodeId="15.~ActionButtonPresentation" />
        </node>
        <node role="3.annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="4707157387247630637">
          <link role="3.annotation:3" targetNodeId="13.~Nullable" />
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630638">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247630639">
          <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.NotExpression:3" id="4707157387247630640">
            <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630641">
              <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630642">
                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247630643">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630630" resolveInfo="file" />
                </node>
                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630644">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="22.~VirtualFile.getFileType():com.intellij.openapi.fileTypes.FileType" />
                </node>
              </node>
              <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630645">
                <link role="3.baseMethodDeclaration:3" targetNodeId="2.~Object.equals(java.lang.Object):boolean" />
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference:3" id="4707157387247630646">
                  <link role="3.classifier:3" targetNodeId="10.~MPSFileTypeFactory" />
                  <link role="3.variableDeclaration:3" targetNodeId="10.~MPSFileTypeFactory.MODEL_FILE_TYPE" />
                </node>
              </node>
            </node>
          </node>
          <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630647">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247630648">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.SuperMethodCall:3" id="4707157387247630649">
                <link role="3.baseMethodDeclaration:3" targetNodeId="23.~DiffRequestFactoryImpl.createMergeRequest(java.lang.String,java.lang.String,java.lang.String,com.intellij.openapi.vfs.VirtualFile,com.intellij.openapi.project.Project,com.intellij.openapi.diff.ActionButtonPresentation):com.intellij.openapi.diff.MergeRequest" />
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247630650">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630624" resolveInfo="leftText" />
                </node>
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247630651">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630626" resolveInfo="rightText" />
                </node>
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247630652">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630628" resolveInfo="originalContent" />
                </node>
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247630653">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630630" resolveInfo="file" />
                </node>
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247630654">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630633" resolveInfo="project" />
                </node>
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247630655">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630635" resolveInfo="actionButtonPresentation" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247630656">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247630657">
            <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247630658">
              <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247632451" resolveInfo="ModelMergeRequest" />
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247630659">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247630624" resolveInfo="leftText" />
              </node>
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247630660">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247630626" resolveInfo="rightText" />
              </node>
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247630661">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247630628" resolveInfo="originalContent" />
              </node>
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247630662">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247630630" resolveInfo="file" />
              </node>
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247630663">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247630633" resolveInfo="project" />
              </node>
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247630664">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247630635" resolveInfo="actionButtonPresentation" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="3.annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="4707157387247630665">
        <link role="3.annotation:3" targetNodeId="2.~Override" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="4707157387247630666">
    <property name="1.name:0" value="Merger" />
    <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4707157387247630667" />
    <node role="3.staticInnerClassifiers:3" type="jetbrains.mps.baseLanguage.structure.EnumClass:3" id="4707157387247630668">
      <property name="1.name:0" value="Version" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247630669" />
      <node role="3.enumConstant:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantDeclaration:3" id="4707157387247630670">
        <property name="1.name:0" value="MINE" />
        <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247630673" resolveInfo="Version" />
      </node>
      <node role="3.enumConstant:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantDeclaration:3" id="4707157387247630671">
        <property name="1.name:0" value="BASE" />
        <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247630673" resolveInfo="Version" />
      </node>
      <node role="3.enumConstant:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantDeclaration:3" id="4707157387247630672">
        <property name="1.name:0" value="REPO" />
        <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247630673" resolveInfo="Version" />
      </node>
      <node role="3.constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="4707157387247630673">
        <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247630674" />
        <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="4707157387247630675" />
        <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247632310" />
      </node>
    </node>
    <node role="3.field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="4707157387247630676">
      <property name="3.isFinal:3" value="true" />
      <property name="1.name:0" value="mySourceModels" />
      <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ArrayType:3" id="4707157387247630677">
        <node role="3.componentType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630678">
          <link role="3.classifier:3" targetNodeId="21.~SModel" />
        </node>
      </node>
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247630679" />
      <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247630680">
        <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ArrayCreator:3" id="4707157387247630681">
          <node role="3.dimensionExpression:3" type="jetbrains.mps.baseLanguage.structure.DimensionExpression:3" id="4707157387247630682">
            <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630683">
              <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.EnumValuesExpression:3" id="4707157387247635467">
                <link role="3.enumClass:3" targetNodeId="4707157387247630668" resolveInfo="Merger.Version" />
              </node>
              <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.ArrayLengthOperation:3" id="4707157387247630685" />
            </node>
          </node>
          <node role="3.componentType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630686">
            <link role="3.classifier:3" targetNodeId="21.~SModel" resolveInfo="SModel" />
          </node>
        </node>
      </node>
    </node>
    <node role="3.field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="4707157387247630687">
      <property name="1.name:0" value="myResultModel" />
      <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630688">
        <link role="3.classifier:3" targetNodeId="21.~SModel" />
      </node>
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247630689" />
    </node>
    <node role="3.field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="4707157387247630690">
      <property name="1.name:0" value="myBaseMineChanges" />
      <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630691">
        <link role="3.classifier:3" targetNodeId="4.~List" />
        <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630692">
          <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
        </node>
      </node>
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247630693" />
    </node>
    <node role="3.field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="4707157387247630694">
      <property name="1.name:0" value="myChangeGroups" />
      <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630695">
        <link role="3.classifier:3" targetNodeId="4.~Map" />
        <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630696">
          <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
        </node>
        <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630697">
          <link role="3.classifier:3" targetNodeId="21.~SNode" />
        </node>
      </node>
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247630698" />
      <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247630699">
        <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247630700">
          <link role="3.baseMethodDeclaration:3" targetNodeId="4.~HashMap.&lt;init&gt;()" />
          <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630701">
            <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
          </node>
          <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630702">
            <link role="3.classifier:3" targetNodeId="21.~SNode" />
          </node>
        </node>
      </node>
    </node>
    <node role="3.field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="4707157387247630703">
      <property name="1.name:0" value="myBaseRepoChanges" />
      <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630704">
        <link role="3.classifier:3" targetNodeId="4.~List" />
        <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630705">
          <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
        </node>
      </node>
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247630706" />
    </node>
    <node role="3.field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="4707157387247630707">
      <property name="1.name:0" value="myExcludedChanges" />
      <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630708">
        <link role="3.classifier:3" targetNodeId="4.~Set" />
        <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630709">
          <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
        </node>
      </node>
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247630710" />
      <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247630711">
        <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247630712">
          <link role="3.baseMethodDeclaration:3" targetNodeId="4.~HashSet.&lt;init&gt;()" />
          <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630713">
            <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
          </node>
        </node>
      </node>
    </node>
    <node role="3.field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="4707157387247630714">
      <property name="1.name:0" value="myAppliedChanges" />
      <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630715">
        <link role="3.classifier:3" targetNodeId="4.~Set" />
        <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630716">
          <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
        </node>
      </node>
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247630717" />
      <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247630718">
        <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247630719">
          <link role="3.baseMethodDeclaration:3" targetNodeId="4.~HashSet.&lt;init&gt;()" />
          <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630720">
            <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
          </node>
        </node>
      </node>
    </node>
    <node role="3.field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="4707157387247630721">
      <property name="1.name:0" value="myConflicts" />
      <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630722">
        <link role="3.classifier:3" targetNodeId="4.~List" />
        <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630723">
          <link role="3.classifier:3" targetNodeId="4707157387247632367" resolveInfo="Conflict" />
        </node>
      </node>
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247630724" />
      <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247630725">
        <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247630726">
          <link role="3.baseMethodDeclaration:3" targetNodeId="4.~ArrayList.&lt;init&gt;()" />
          <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630727">
            <link role="3.classifier:3" targetNodeId="4707157387247632367" resolveInfo="Conflict" />
          </node>
        </node>
      </node>
    </node>
    <node role="3.field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="4707157387247630728">
      <property name="1.name:0" value="myWarnings" />
      <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630729">
        <link role="3.classifier:3" targetNodeId="4.~List" />
        <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630730">
          <link role="3.classifier:3" targetNodeId="4707157387247632403" resolveInfo="Warning" />
        </node>
      </node>
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247630731" />
      <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247630732">
        <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247630733">
          <link role="3.baseMethodDeclaration:3" targetNodeId="4.~ArrayList.&lt;init&gt;()" />
          <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630734">
            <link role="3.classifier:3" targetNodeId="4707157387247632403" resolveInfo="Warning" />
          </node>
        </node>
      </node>
    </node>
    <node role="3.field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="4707157387247630735">
      <property name="1.name:0" value="myUnresolvedConflictingChanges" />
      <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630736">
        <link role="3.classifier:3" targetNodeId="4.~Set" />
        <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630737">
          <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
        </node>
      </node>
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247630738" />
    </node>
    <node role="3.field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="4707157387247630739">
      <property name="1.name:0" value="myConflictingChanges" />
      <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630740">
        <link role="3.classifier:3" targetNodeId="4.~Set" />
        <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630741">
          <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
        </node>
      </node>
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247630742" />
      <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247630743">
        <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247630744">
          <link role="3.baseMethodDeclaration:3" targetNodeId="4.~HashSet.&lt;init&gt;()" />
          <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630745">
            <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
          </node>
        </node>
      </node>
    </node>
    <node role="3.field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="4707157387247630746">
      <property name="1.name:0" value="mySymmetricChanges" />
      <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630747">
        <link role="3.classifier:3" targetNodeId="4.~Set" />
        <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630748">
          <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
        </node>
      </node>
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247630749" />
      <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247630750">
        <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247630751">
          <link role="3.baseMethodDeclaration:3" targetNodeId="4.~HashSet.&lt;init&gt;()" />
          <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630752">
            <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
          </node>
        </node>
      </node>
    </node>
    <node role="3.field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="4707157387247630753">
      <property name="1.name:0" value="myPreviewMode" />
      <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="4707157387247630754" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247630755" />
      <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="4707157387247630756" />
    </node>
    <node role="3.constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="4707157387247630757">
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4707157387247630758" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="4707157387247630759" />
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247630760">
        <property name="1.name:0" value="base" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630761">
          <link role="3.classifier:3" targetNodeId="21.~SModel" />
        </node>
      </node>
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247630762">
        <property name="1.name:0" value="mine" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630763">
          <link role="3.classifier:3" targetNodeId="21.~SModel" />
        </node>
      </node>
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247630764">
        <property name="1.name:0" value="repo" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630765">
          <link role="3.classifier:3" targetNodeId="21.~SModel" />
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630766">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247630767">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="4707157387247630768">
            <node role="3.lValue:3" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression:3" id="4707157387247630769">
              <node role="3.array:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247630770">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247630676" resolveInfo="mySourceModels" />
              </node>
              <node role="3.index:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630771">
                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="4707157387247630772">
                  <link role="3.enumClass:3" targetNodeId="4707157387247630668" resolveInfo="Merger.Version" />
                  <link role="3.enumConstantDeclaration:3" targetNodeId="4707157387247630671" resolveInfo="BASE" />
                </node>
                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630773">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="2.~Enum.ordinal():int" />
                </node>
              </node>
            </node>
            <node role="3.rValue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247630774">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630760" resolveInfo="base" />
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247630775">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="4707157387247630776">
            <node role="3.lValue:3" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression:3" id="4707157387247630777">
              <node role="3.array:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247630778">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247630676" resolveInfo="mySourceModels" />
              </node>
              <node role="3.index:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630779">
                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="4707157387247630780">
                  <link role="3.enumClass:3" targetNodeId="4707157387247630668" resolveInfo="Merger.Version" />
                  <link role="3.enumConstantDeclaration:3" targetNodeId="4707157387247630670" resolveInfo="MINE" />
                </node>
                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630781">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="2.~Enum.ordinal():int" />
                </node>
              </node>
            </node>
            <node role="3.rValue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247630782">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630762" resolveInfo="mine" />
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247630783">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="4707157387247630784">
            <node role="3.lValue:3" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression:3" id="4707157387247630785">
              <node role="3.array:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247630786">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247630676" resolveInfo="mySourceModels" />
              </node>
              <node role="3.index:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630787">
                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="4707157387247630788">
                  <link role="3.enumClass:3" targetNodeId="4707157387247630668" resolveInfo="Merger.Version" />
                  <link role="3.enumConstantDeclaration:3" targetNodeId="4707157387247630672" resolveInfo="REPO" />
                </node>
                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630789">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="2.~Enum.ordinal():int" />
                </node>
              </node>
            </node>
            <node role="3.rValue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247630790">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630764" resolveInfo="repo" />
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247630791">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630792">
            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="4707157387247630793">
              <link role="3.classConcept:3" targetNodeId="21.~ModelAccess" />
              <link role="3.baseMethodDeclaration:3" targetNodeId="21.~ModelAccess.instance():jetbrains.mps.smodel.ModelAccess" />
            </node>
            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630794">
              <link role="3.baseMethodDeclaration:3" targetNodeId="21.~ModelCommandExecutor.runReadAction(java.lang.Runnable):void" />
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247630795">
                <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.AnonymousClassCreator:3" id="4707157387247630796">
                  <node role="3.cls:3" type="jetbrains.mps.baseLanguage.structure.AnonymousClass:3" id="4707157387247630797">
                    <property name="1.name:0" value="" />
                    <link role="3.classifier:3" targetNodeId="2.~Runnable" resolveInfo="Runnable" />
                    <link role="3.baseMethodDeclaration:3" targetNodeId="2.~Object.&lt;init&gt;()" />
                    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247630798">
                      <property name="1.name:0" value="run" />
                      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4707157387247630799" />
                      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="4707157387247630800" />
                      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247632311">
                        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247632312">
                          <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247632313">
                            <property name="1.name:0" value="mineDiffBuilder" />
                            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632314">
                              <link role="3.classifier:3" targetNodeId="4707157387247628917" resolveInfo="DiffBuilder" />
                            </node>
                            <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247632315">
                              <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247632316">
                                <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247628946" resolveInfo="DiffBuilder" />
                                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247632317">
                                  <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247630950" resolveInfo="getBase" />
                                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247632318">
                                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247630676" resolveInfo="mySourceModels" />
                                  </node>
                                </node>
                                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247632319">
                                  <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247630937" resolveInfo="getMine" />
                                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247632320">
                                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247630676" resolveInfo="mySourceModels" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247632321">
                          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="4707157387247632322">
                            <node role="3.lValue:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247632323">
                              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630690" resolveInfo="myBaseMineChanges" />
                            </node>
                            <node role="3.rValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247632324">
                              <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247632325">
                                <link role="3.variableDeclaration:3" targetNodeId="4707157387247632313" resolveInfo="mineDiffBuilder" />
                              </node>
                              <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247632326">
                                <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247630599" resolveInfo="getChanges" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247632327">
                          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247632328">
                            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247632329">
                              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630694" resolveInfo="myChangeGroups" />
                            </node>
                            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247632330">
                              <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Map.putAll(java.util.Map):void" />
                              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247632331">
                                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247632332">
                                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247632313" resolveInfo="mineDiffBuilder" />
                                </node>
                                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247632333">
                                  <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247629242" resolveInfo="getChangeGroups" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247632334">
                          <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247632335">
                            <property name="1.name:0" value="repoDiffBuilder" />
                            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632336">
                              <link role="3.classifier:3" targetNodeId="4707157387247628917" resolveInfo="DiffBuilder" />
                            </node>
                            <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247632337">
                              <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247632338">
                                <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247628946" resolveInfo="DiffBuilder" />
                                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247632339">
                                  <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247630950" resolveInfo="getBase" />
                                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247632340">
                                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247630676" resolveInfo="mySourceModels" />
                                  </node>
                                </node>
                                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247632341">
                                  <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247630924" resolveInfo="getRepo" />
                                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247632342">
                                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247630676" resolveInfo="mySourceModels" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247632343">
                          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="4707157387247632344">
                            <node role="3.lValue:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247632345">
                              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630703" resolveInfo="myBaseRepoChanges" />
                            </node>
                            <node role="3.rValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247632346">
                              <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247632347">
                                <link role="3.variableDeclaration:3" targetNodeId="4707157387247632335" resolveInfo="repoDiffBuilder" />
                              </node>
                              <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247632348">
                                <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247630599" resolveInfo="getChanges" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247632349">
                          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247632350">
                            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247632351">
                              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630694" resolveInfo="myChangeGroups" />
                            </node>
                            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247632352">
                              <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Map.putAll(java.util.Map):void" />
                              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247632353">
                                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247632354">
                                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247632335" resolveInfo="repoDiffBuilder" />
                                </node>
                                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247632355">
                                  <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247629242" resolveInfo="getChangeGroups" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247630801">
      <property name="1.name:0" value="getResultModel" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4707157387247630802" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630803">
        <link role="3.classifier:3" targetNodeId="21.~SModel" />
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630804">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247630805">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247630806">
            <link role="3.variableDeclaration:3" targetNodeId="4707157387247630687" resolveInfo="myResultModel" />
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247630807">
      <property name="1.name:0" value="getExcludedChanges" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4707157387247630808" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630809">
        <link role="3.classifier:3" targetNodeId="4.~Set" />
        <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630810">
          <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630811">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247630812">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="4707157387247630813">
            <link role="3.classConcept:3" targetNodeId="4.~Collections" />
            <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Collections.unmodifiableSet(java.util.Set):java.util.Set" />
            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247630814">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630707" resolveInfo="myExcludedChanges" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247630815">
      <property name="1.name:0" value="getWarnings" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4707157387247630816" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630817">
        <link role="3.classifier:3" targetNodeId="4.~List" />
        <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630818">
          <link role="3.classifier:3" targetNodeId="4707157387247632403" resolveInfo="Warning" />
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630819">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247630820">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="4707157387247630821">
            <link role="3.classConcept:3" targetNodeId="4.~Collections" />
            <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Collections.unmodifiableList(java.util.List):java.util.List" />
            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247630822">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630728" resolveInfo="myWarnings" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247630823">
      <property name="1.name:0" value="getConflicts" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4707157387247630824" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630825">
        <link role="3.classifier:3" targetNodeId="4.~List" />
        <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630826">
          <link role="3.classifier:3" targetNodeId="4707157387247632367" resolveInfo="Conflict" />
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630827">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247630828">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="4707157387247630829">
            <link role="3.classConcept:3" targetNodeId="4.~Collections" />
            <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Collections.unmodifiableList(java.util.List):java.util.List" />
            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247630830">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630721" resolveInfo="myConflicts" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247630831">
      <property name="1.name:0" value="getUnresolvedConflicts" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4707157387247630832" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630833">
        <link role="3.classifier:3" targetNodeId="4.~List" />
        <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630834">
          <link role="3.classifier:3" targetNodeId="4707157387247632367" resolveInfo="Conflict" />
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630835">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247630836">
          <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247630837">
            <property name="1.name:0" value="result" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630838">
              <link role="3.classifier:3" targetNodeId="4.~ArrayList" />
              <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630839">
                <link role="3.classifier:3" targetNodeId="4707157387247632367" resolveInfo="Conflict" />
              </node>
            </node>
            <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247630840">
              <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247630841">
                <link role="3.baseMethodDeclaration:3" targetNodeId="4.~ArrayList.&lt;init&gt;()" />
                <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630842">
                  <link role="3.classifier:3" targetNodeId="4707157387247632367" resolveInfo="Conflict" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247630843">
          <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247630844">
            <link role="3.variableDeclaration:3" targetNodeId="4707157387247630721" resolveInfo="myConflicts" />
          </node>
          <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247630845">
            <property name="1.name:0" value="conflict" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630846">
              <link role="3.classifier:3" targetNodeId="4707157387247632367" resolveInfo="Conflict" />
            </node>
          </node>
          <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630847">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247630848">
              <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.AndExpression:3" id="4707157387247630849">
                <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.NotExpression:3" id="4707157387247630850">
                  <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630851">
                    <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247630852">
                      <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247630807" resolveInfo="getExcludedChanges" />
                    </node>
                    <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630853">
                      <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Set.contains(java.lang.Object):boolean" />
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630854">
                        <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630855">
                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247630845" resolveInfo="conflict" />
                        </node>
                        <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630856">
                          <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247632391" resolveInfo="getChange1" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NotExpression:3" id="4707157387247630857">
                  <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630858">
                    <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247630859">
                      <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247630807" resolveInfo="getExcludedChanges" />
                    </node>
                    <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630860">
                      <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Set.contains(java.lang.Object):boolean" />
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630861">
                        <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630862">
                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247630845" resolveInfo="conflict" />
                        </node>
                        <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630863">
                          <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247632397" resolveInfo="getChange2" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630864">
                <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247630865">
                  <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630866">
                    <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630867">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247630837" resolveInfo="result" />
                    </node>
                    <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630868">
                      <link role="3.baseMethodDeclaration:3" targetNodeId="4.~ArrayList.add(java.lang.Object):boolean" />
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630869">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247630845" resolveInfo="conflict" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247630870">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247630871">
            <link role="3.variableDeclaration:3" targetNodeId="4707157387247630837" resolveInfo="result" />
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247630872">
      <property name="1.name:0" value="includeChange" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4707157387247630873" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="4707157387247630874" />
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247630875">
        <property name="1.name:0" value="change" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630876">
          <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630877">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247630878">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630879">
            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247630880">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630707" resolveInfo="myExcludedChanges" />
            </node>
            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630881">
              <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Set.remove(java.lang.Object):boolean" />
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247630882">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247630875" resolveInfo="change" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247630883">
      <property name="1.name:0" value="excludeChange" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4707157387247630884" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="4707157387247630885" />
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247630886">
        <property name="1.name:0" value="change" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630887">
          <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630888">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247630889">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630890">
            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247630891">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630707" resolveInfo="myExcludedChanges" />
            </node>
            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630892">
              <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Set.add(java.lang.Object):boolean" />
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247630893">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247630886" resolveInfo="change" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247630894">
      <property name="1.name:0" value="doRebuild" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4707157387247630895" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="4707157387247630896" />
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247630897">
        <property name="1.name:0" value="afterRebuild" />
        <property name="3.isFinal:3" value="true" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630898">
          <link role="3.classifier:3" targetNodeId="2.~Runnable" />
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630899">
        <node role="3.statement:3" type="jetbrains.mps.lang.plugin.structure.ExecuteLightweightCommandStatement:23" id="983248792627961290">
          <node role="29.commandClosureLiteral:23" type="jetbrains.mps.lang.plugin.structure.CommandClosureLiteral:23" id="983248792627961291">
            <node role="28.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="983248792627961292">
              <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="983248792627961293">
                <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="983248792627961294">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247630963" resolveInfo="collectConflicts" />
                </node>
              </node>
              <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="983248792627961295">
                <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="983248792627961296">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247631079" resolveInfo="collectWarnings" />
                </node>
              </node>
              <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="983248792627961297">
                <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="983248792627961298">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247631678" resolveInfo="rebuldResultModel" />
                </node>
              </node>
              <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="983248792627961299">
                <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="983248792627961300">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="983248792627961301">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247630897" resolveInfo="afterRebuild" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="983248792627961302">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="2.~Runnable.run():void" resolveInfo="run" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247630910">
      <property name="1.name:0" value="getBaseMineChanges" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4707157387247630911" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630912">
        <link role="3.classifier:3" targetNodeId="4.~List" />
        <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630913">
          <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630914">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247630915">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247630916">
            <link role="3.variableDeclaration:3" targetNodeId="4707157387247630690" resolveInfo="myBaseMineChanges" />
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247630917">
      <property name="1.name:0" value="getBaseRepoChanges" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4707157387247630918" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630919">
        <link role="3.classifier:3" targetNodeId="4.~List" />
        <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630920">
          <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630921">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247630922">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247630923">
            <link role="3.variableDeclaration:3" targetNodeId="4707157387247630703" resolveInfo="myBaseRepoChanges" />
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247630924">
      <property name="1.name:0" value="getRepo" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247630925" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630926">
        <link role="3.classifier:3" targetNodeId="21.~SModel" />
      </node>
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247630927">
        <property name="1.name:0" value="models" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ArrayType:3" id="4707157387247630928">
          <node role="3.componentType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630929">
            <link role="3.classifier:3" targetNodeId="21.~SModel" />
          </node>
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630930">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247630931">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression:3" id="4707157387247630932">
            <node role="3.array:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247630933">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630927" resolveInfo="models" />
            </node>
            <node role="3.index:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630934">
              <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="4707157387247630935">
                <link role="3.enumClass:3" targetNodeId="4707157387247630668" resolveInfo="Merger.Version" />
                <link role="3.enumConstantDeclaration:3" targetNodeId="4707157387247630672" resolveInfo="REPO" />
              </node>
              <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630936">
                <link role="3.baseMethodDeclaration:3" targetNodeId="2.~Enum.ordinal():int" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247630937">
      <property name="1.name:0" value="getMine" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247630938" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630939">
        <link role="3.classifier:3" targetNodeId="21.~SModel" />
      </node>
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247630940">
        <property name="1.name:0" value="models" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ArrayType:3" id="4707157387247630941">
          <node role="3.componentType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630942">
            <link role="3.classifier:3" targetNodeId="21.~SModel" />
          </node>
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630943">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247630944">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression:3" id="4707157387247630945">
            <node role="3.array:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247630946">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630940" resolveInfo="models" />
            </node>
            <node role="3.index:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630947">
              <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="4707157387247630948">
                <link role="3.enumClass:3" targetNodeId="4707157387247630668" resolveInfo="Merger.Version" />
                <link role="3.enumConstantDeclaration:3" targetNodeId="4707157387247630670" resolveInfo="MINE" />
              </node>
              <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630949">
                <link role="3.baseMethodDeclaration:3" targetNodeId="2.~Enum.ordinal():int" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247630950">
      <property name="1.name:0" value="getBase" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247630951" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630952">
        <link role="3.classifier:3" targetNodeId="21.~SModel" />
      </node>
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247630953">
        <property name="1.name:0" value="models" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ArrayType:3" id="4707157387247630954">
          <node role="3.componentType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247630955">
            <link role="3.classifier:3" targetNodeId="21.~SModel" />
          </node>
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630956">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247630957">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression:3" id="4707157387247630958">
            <node role="3.array:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247630959">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630953" resolveInfo="models" />
            </node>
            <node role="3.index:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630960">
              <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="4707157387247630961">
                <link role="3.enumClass:3" targetNodeId="4707157387247630668" resolveInfo="Merger.Version" />
                <link role="3.enumConstantDeclaration:3" targetNodeId="4707157387247630671" resolveInfo="BASE" />
              </node>
              <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630962">
                <link role="3.baseMethodDeclaration:3" targetNodeId="2.~Enum.ordinal():int" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247630963">
      <property name="1.name:0" value="collectConflicts" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247630964" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="4707157387247630965" />
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247630966">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247630967">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630968">
            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247630969">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630721" resolveInfo="myConflicts" />
            </node>
            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630970">
              <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.clear():void" />
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247630971">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247630972">
            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247630973">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630739" resolveInfo="myConflictingChanges" />
            </node>
            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247630974">
              <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Set.clear():void" />
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247630975">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247630976">
            <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247631144" resolveInfo="collectConflictsByClass" />
            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression:3" id="4707157387247630977">
              <link role="3.classifier:3" targetNodeId="14.4707157387247556079" resolveInfo="AddLanguageAspectChange" />
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247630978">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247630979">
            <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247631144" resolveInfo="collectConflictsByClass" />
            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression:3" id="4707157387247630980">
              <link role="3.classifier:3" targetNodeId="14.4707157387247557037" resolveInfo="SetPropertyChange" />
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247630981">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247630982">
            <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247631144" resolveInfo="collectConflictsByClass" />
            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression:3" id="4707157387247630983">
              <link role="3.classifier:3" targetNodeId="14.4707157387247558473" resolveInfo="SetReferenceChange" />
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247630984">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247630985">
            <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247631301" resolveInfo="collectSetNodeConflicts" />
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247630986">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247630987">
            <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247631144" resolveInfo="collectConflictsByClass" />
            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression:3" id="4707157387247630988">
              <link role="3.classifier:3" targetNodeId="14.4707157387247557317" resolveInfo="DeleteNodeChange" />
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247630989">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247630990">
            <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247631144" resolveInfo="collectConflictsByClass" />
            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression:3" id="4707157387247630991">
              <link role="3.classifier:3" targetNodeId="14.4707157387247557593" resolveInfo="AddNodeChange" />
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247630992">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247630993">
            <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247631144" resolveInfo="collectConflictsByClass" />
            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression:3" id="4707157387247630994">
              <link role="3.classifier:3" targetNodeId="14.4707157387247556486" resolveInfo="AddRootChange" />
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247630995">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247630996">
            <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247631570" resolveInfo="collectDeleteDependencyConflicts" />
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247630997">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247630998">
            <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247631144" resolveInfo="collectConflictsByClass" />
            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression:3" id="4707157387247630999">
              <link role="3.classifier:3" targetNodeId="14.4707157387247556223" resolveInfo="MoveNodeChange" />
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631000">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247631001">
            <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247631144" resolveInfo="collectConflictsByClass" />
            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression:3" id="4707157387247631002">
              <link role="3.classifier:3" targetNodeId="14.4707157387247558333" resolveInfo="ChangeConceptChange" />
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247631003">
          <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247631004">
            <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247631005">
              <link role="3.baseMethodDeclaration:3" targetNodeId="4.~ArrayList.&lt;init&gt;(java.util.Collection)" />
              <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631006">
                <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
              </node>
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631007">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247630739" resolveInfo="myConflictingChanges" />
              </node>
            </node>
          </node>
          <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247631008">
            <property name="1.name:0" value="change" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631009">
              <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
            </node>
          </node>
          <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631010">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631011">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631012">
                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631013">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630739" resolveInfo="myConflictingChanges" />
                </node>
                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631014">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Set.addAll(java.util.Collection):boolean" />
                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247631015">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247631017" resolveInfo="getChangeGroupOf" />
                    <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631016">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247631008" resolveInfo="change" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247631017">
      <property name="1.name:0" value="getChangeGroupOf" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4707157387247631018" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631019">
        <link role="3.classifier:3" targetNodeId="4.~List" />
        <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631020">
          <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
        </node>
      </node>
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247631021">
        <property name="1.name:0" value="change" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631022">
          <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631023">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247631024">
          <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247631025">
            <property name="1.name:0" value="result" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631026">
              <link role="3.classifier:3" targetNodeId="4.~List" />
              <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631027">
                <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
              </node>
            </node>
            <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247631028">
              <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247631029">
                <link role="3.baseMethodDeclaration:3" targetNodeId="4.~ArrayList.&lt;init&gt;()" />
                <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631030">
                  <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247631031">
          <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="4707157387247631032">
            <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631033">
              <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631034">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247630694" resolveInfo="myChangeGroups" />
              </node>
              <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631035">
                <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Map.get(java.lang.Object):java.lang.Object" />
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247631036">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247631021" resolveInfo="change" />
                </node>
              </node>
            </node>
            <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247631037" />
          </node>
          <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631038">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247631039">
              <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247631040">
                <property name="1.name:0" value="group" />
                <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631041">
                  <link role="3.classifier:3" targetNodeId="21.~SNode" />
                </node>
                <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631042">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631043">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247630694" resolveInfo="myChangeGroups" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631044">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Map.get(java.lang.Object):java.lang.Object" />
                    <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247631045">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247631021" resolveInfo="change" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247631046">
              <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631047">
                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631048">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630694" resolveInfo="myChangeGroups" />
                </node>
                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631049">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Map.entrySet():java.util.Set" />
                </node>
              </node>
              <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247631050">
                <property name="1.name:0" value="e" />
                <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631051">
                  <link role="3.classifier:3" targetNodeId="4.~Map$Entry" />
                  <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631052">
                    <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
                  </node>
                  <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631053">
                    <link role="3.classifier:3" targetNodeId="21.~SNode" />
                  </node>
                </node>
              </node>
              <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631054">
                <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247631055">
                  <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631056">
                    <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631057">
                      <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631058">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247631050" resolveInfo="e" />
                      </node>
                      <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631059">
                        <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Map$Entry.getValue():java.lang.Object" />
                      </node>
                    </node>
                    <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631060">
                      <link role="3.baseMethodDeclaration:3" targetNodeId="2.~Object.equals(java.lang.Object):boolean" />
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631061">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247631040" resolveInfo="group" />
                      </node>
                    </node>
                  </node>
                  <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631062">
                    <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631063">
                      <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631064">
                        <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631065">
                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247631025" resolveInfo="result" />
                        </node>
                        <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631066">
                          <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.add(java.lang.Object):boolean" />
                          <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631067">
                            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631068">
                              <link role="3.variableDeclaration:3" targetNodeId="4707157387247631050" resolveInfo="e" />
                            </node>
                            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631069">
                              <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Map$Entry.getKey():java.lang.Object" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247631070">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631071">
            <link role="3.variableDeclaration:3" targetNodeId="4707157387247631025" resolveInfo="result" />
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247631072">
      <property name="1.name:0" value="getConflictingChanges" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4707157387247631073" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631074">
        <link role="3.classifier:3" targetNodeId="4.~Set" />
        <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631075">
          <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631076">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247631077">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631078">
            <link role="3.variableDeclaration:3" targetNodeId="4707157387247630739" resolveInfo="myConflictingChanges" />
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247631079">
      <property name="1.name:0" value="collectWarnings" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247631080" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="4707157387247631081" />
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631082">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631083">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631084">
            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631085">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630728" resolveInfo="myWarnings" />
            </node>
            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631086">
              <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.clear():void" />
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247631087">
          <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247631088">
            <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247631645" resolveInfo="getChanges" />
            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression:3" id="4707157387247631089">
              <link role="3.classifier:3" targetNodeId="14.4707157387247558473" resolveInfo="SetReferenceChange" />
            </node>
          </node>
          <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247631090">
            <property name="1.name:0" value="srf" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631091">
              <link role="3.classifier:3" targetNodeId="14.4707157387247558473" resolveInfo="SetReferenceChange" />
            </node>
          </node>
          <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631092">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247631093">
              <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631094">
                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631095">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247631090" resolveInfo="srf" />
                </node>
                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631096">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247558589" resolveInfo="isBrokenReference" />
                </node>
              </node>
              <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631097">
                <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631098">
                  <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631099">
                    <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631100">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247630728" resolveInfo="myWarnings" />
                    </node>
                    <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631101">
                      <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.add(java.lang.Object):boolean" />
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247631102">
                        <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247631103">
                          <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247632411" resolveInfo="Warning" />
                          <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631104">
                            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631105">
                              <link role="3.variableDeclaration:3" targetNodeId="4707157387247631090" resolveInfo="srf" />
                            </node>
                            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631106">
                              <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247558669" resolveInfo="getAffectedNodeId" />
                            </node>
                          </node>
                          <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="4707157387247631107">
                            <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="4707157387247631108">
                              <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="4707157387247631109">
                                <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="4707157387247631110">
                                  <property name="3.value:3" value="Maybe broken reference to " />
                                </node>
                                <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631111">
                                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631112">
                                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247631090" resolveInfo="srf" />
                                  </node>
                                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631113">
                                    <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247558770" resolveInfo="getResolveInfo" />
                                  </node>
                                </node>
                              </node>
                              <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="4707157387247631114">
                                <property name="3.value:3" value=" at " />
                              </node>
                            </node>
                            <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631115">
                              <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631116">
                                <link role="3.variableDeclaration:3" targetNodeId="4707157387247631090" resolveInfo="srf" />
                              </node>
                              <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631117">
                                <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247558669" resolveInfo="getAffectedNodeId" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247631118">
          <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247631119">
            <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247631645" resolveInfo="getChanges" />
            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression:3" id="4707157387247631120">
              <link role="3.classifier:3" targetNodeId="14.4707157387247558333" resolveInfo="ChangeConceptChange" />
            </node>
          </node>
          <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247631121">
            <property name="1.name:0" value="ch" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631122">
              <link role="3.classifier:3" targetNodeId="14.4707157387247558333" resolveInfo="ChangeConceptChange" />
            </node>
          </node>
          <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631123">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631124">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631125">
                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631126">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630728" resolveInfo="myWarnings" />
                </node>
                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631127">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.add(java.lang.Object):boolean" />
                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247631128">
                    <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247631129">
                      <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247632411" resolveInfo="Warning" />
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631130">
                        <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631131">
                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247631121" resolveInfo="ch" />
                        </node>
                        <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631132">
                          <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247558358" resolveInfo="getAffectedNodeId" />
                        </node>
                      </node>
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="4707157387247631133">
                        <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="4707157387247631134">
                          <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="4707157387247631135">
                            <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="4707157387247631136">
                              <property name="3.value:3" value="Concept changed to " />
                            </node>
                            <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631137">
                              <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631138">
                                <link role="3.variableDeclaration:3" targetNodeId="4707157387247631121" resolveInfo="ch" />
                              </node>
                              <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631139">
                                <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247558467" resolveInfo="getConceptFqName" />
                              </node>
                            </node>
                          </node>
                          <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="4707157387247631140">
                            <property name="3.value:3" value=" for node " />
                          </node>
                        </node>
                        <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631141">
                          <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631142">
                            <link role="3.variableDeclaration:3" targetNodeId="4707157387247631121" resolveInfo="ch" />
                          </node>
                          <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631143">
                            <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247558358" resolveInfo="getAffectedNodeId" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247631144">
      <property name="1.name:0" value="collectConflictsByClass" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247631145" />
      <node role="3.typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="4707157387247631146">
        <property name="1.name:0" value="C" />
        <property name="3.extends:3" value="true" />
        <node role="3.bound:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631147">
          <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
        </node>
      </node>
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="4707157387247631148" />
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247631149">
        <property name="1.name:0" value="changeClass" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631150">
          <link role="3.classifier:3" targetNodeId="2.~Class" />
          <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="4707157387247631151">
            <link role="3.typeVariableDeclaration:3" targetNodeId="4707157387247631146" resolveInfo="C" />
          </node>
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631152">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247631153">
          <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247631154">
            <property name="1.name:0" value="changesMap" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631155">
              <link role="3.classifier:3" targetNodeId="4.~Map" />
              <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631156">
                <link role="3.classifier:3" targetNodeId="2.~Object" />
              </node>
              <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631157">
                <link role="3.classifier:3" targetNodeId="4.~List" />
                <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="4707157387247631158">
                  <link role="3.typeVariableDeclaration:3" targetNodeId="4707157387247631146" resolveInfo="C" />
                </node>
              </node>
            </node>
            <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247631159">
              <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247631160">
                <link role="3.baseMethodDeclaration:3" targetNodeId="4.~HashMap.&lt;init&gt;()" />
                <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631161">
                  <link role="3.classifier:3" targetNodeId="2.~Object" />
                </node>
                <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631162">
                  <link role="3.classifier:3" targetNodeId="4.~List" />
                  <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="4707157387247631163">
                    <link role="3.typeVariableDeclaration:3" targetNodeId="4707157387247631146" resolveInfo="C" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247631164">
          <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247631165">
            <property name="1.name:0" value="changes" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631166">
              <link role="3.classifier:3" targetNodeId="4.~List" />
              <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="4707157387247631167">
                <link role="3.typeVariableDeclaration:3" targetNodeId="4707157387247631146" resolveInfo="C" />
              </node>
            </node>
            <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247631168">
              <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247631645" resolveInfo="getChanges" />
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247631169">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247631149" resolveInfo="changeClass" />
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247631170">
          <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631171">
            <link role="3.variableDeclaration:3" targetNodeId="4707157387247631165" resolveInfo="changes" />
          </node>
          <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247631172">
            <property name="1.name:0" value="change" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="4707157387247631173">
              <link role="3.typeVariableDeclaration:3" targetNodeId="4707157387247631146" resolveInfo="C" />
            </node>
          </node>
          <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631174">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247631175">
              <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247631176">
                <property name="1.name:0" value="key" />
                <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631177">
                  <link role="3.classifier:3" targetNodeId="2.~Object" />
                </node>
                <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631178">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631179">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247631172" resolveInfo="change" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631180">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247557021" resolveInfo="getChangeKey" />
                  </node>
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247631181">
              <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="4707157387247631182">
                <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631183">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631184">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247631154" resolveInfo="changesMap" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631185">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Map.get(java.lang.Object):java.lang.Object" />
                    <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631186">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247631176" resolveInfo="key" />
                    </node>
                  </node>
                </node>
                <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247631187" />
              </node>
              <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631188">
                <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631189">
                  <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631190">
                    <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631191">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247631154" resolveInfo="changesMap" />
                    </node>
                    <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631192">
                      <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Map.put(java.lang.Object,java.lang.Object):java.lang.Object" />
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631193">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247631176" resolveInfo="key" />
                      </node>
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247631194">
                        <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247631195">
                          <link role="3.baseMethodDeclaration:3" targetNodeId="4.~ArrayList.&lt;init&gt;()" />
                          <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="4707157387247631196">
                            <link role="3.typeVariableDeclaration:3" targetNodeId="4707157387247631146" resolveInfo="C" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631197">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631198">
                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631199">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631200">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247631154" resolveInfo="changesMap" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631201">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Map.get(java.lang.Object):java.lang.Object" />
                    <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631202">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247631176" resolveInfo="key" />
                    </node>
                  </node>
                </node>
                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631203">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.add(java.lang.Object):boolean" />
                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631204">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247631172" resolveInfo="change" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247631205">
          <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631206">
            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631207">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247631154" resolveInfo="changesMap" />
            </node>
            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631208">
              <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Map.keySet():java.util.Set" />
            </node>
          </node>
          <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247631209">
            <property name="1.name:0" value="k" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631210">
              <link role="3.classifier:3" targetNodeId="2.~Object" />
            </node>
          </node>
          <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631211">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631212">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247631213">
                <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247631218" resolveInfo="handlePossibleConflictOrSymmetry" />
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631214">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631215">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247631154" resolveInfo="changesMap" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631216">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Map.get(java.lang.Object):java.lang.Object" />
                    <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631217">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247631209" resolveInfo="k" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247631218">
      <property name="1.name:0" value="handlePossibleConflictOrSymmetry" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247631219" />
      <node role="3.typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="4707157387247631220">
        <property name="1.name:0" value="C" />
        <property name="3.extends:3" value="true" />
        <node role="3.bound:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631221">
          <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
        </node>
      </node>
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="4707157387247631222" />
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247631223">
        <property name="1.name:0" value="changesPair" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631224">
          <link role="3.classifier:3" targetNodeId="4.~List" />
          <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="4707157387247631225">
            <link role="3.typeVariableDeclaration:3" targetNodeId="4707157387247631220" resolveInfo="C" />
          </node>
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631226">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247631227">
          <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.LessThanOrEqualsExpression:3" id="4707157387247631228">
            <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631229">
              <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247631230">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247631223" resolveInfo="changesPair" />
              </node>
              <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631231">
                <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.size():int" />
              </node>
            </node>
            <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="4707157387247631232">
              <property name="3.value:3" value="1" />
            </node>
          </node>
          <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631233">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247631234" />
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.AssertStatement:3" id="4707157387247631235">
          <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="4707157387247631236">
            <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631237">
              <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247631238">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247631223" resolveInfo="changesPair" />
              </node>
              <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631239">
                <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.size():int" />
              </node>
            </node>
            <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="4707157387247631240">
              <property name="3.value:3" value="2" />
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247631241">
          <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247631242">
            <property name="1.name:0" value="first" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="4707157387247631243">
              <link role="3.typeVariableDeclaration:3" targetNodeId="4707157387247631220" resolveInfo="C" />
            </node>
            <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631244">
              <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247631245">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247631223" resolveInfo="changesPair" />
              </node>
              <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631246">
                <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.get(int):java.lang.Object" />
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="4707157387247631247">
                  <property name="3.value:3" value="0" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247631248">
          <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247631249">
            <property name="1.name:0" value="second" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="4707157387247631250">
              <link role="3.typeVariableDeclaration:3" targetNodeId="4707157387247631220" resolveInfo="C" />
            </node>
            <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631251">
              <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247631252">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247631223" resolveInfo="changesPair" />
              </node>
              <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631253">
                <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.get(int):java.lang.Object" />
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="4707157387247631254">
                  <property name="3.value:3" value="1" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247631255">
          <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631256">
            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631257">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247631242" resolveInfo="first" />
            </node>
            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631258">
              <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247557027" resolveInfo="isSameChange" />
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631259">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247631249" resolveInfo="second" />
              </node>
            </node>
          </node>
          <node role="3.ifFalseStatement:3" type="jetbrains.mps.baseLanguage.structure.BlockStatement:3" id="4707157387247631260">
            <node role="3.statements:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631261">
              <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631262">
                <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631263">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631264">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247630721" resolveInfo="myConflicts" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631265">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.add(java.lang.Object):boolean" />
                    <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247631266">
                      <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247631267">
                        <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247632375" resolveInfo="Conflict" />
                        <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631268">
                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247631242" resolveInfo="first" />
                        </node>
                        <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631269">
                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247631249" resolveInfo="second" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631270">
                <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631271">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631272">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247630739" resolveInfo="myConflictingChanges" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631273">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Set.add(java.lang.Object):boolean" />
                    <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631274">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247631242" resolveInfo="first" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631275">
                <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631276">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631277">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247630739" resolveInfo="myConflictingChanges" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631278">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Set.add(java.lang.Object):boolean" />
                    <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631279">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247631249" resolveInfo="second" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631280">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631281">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631282">
                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631283">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630746" resolveInfo="mySymmetricChanges" />
                </node>
                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631284">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Set.add(java.lang.Object):boolean" />
                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631285">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247631242" resolveInfo="first" />
                  </node>
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631286">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631287">
                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631288">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630746" resolveInfo="mySymmetricChanges" />
                </node>
                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631289">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Set.add(java.lang.Object):boolean" />
                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631290">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247631249" resolveInfo="second" />
                  </node>
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631291">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631292">
                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631293">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630714" resolveInfo="myAppliedChanges" />
                </node>
                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631294">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Set.add(java.lang.Object):boolean" />
                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631295">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247631242" resolveInfo="first" />
                  </node>
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631296">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631297">
                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631298">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630707" resolveInfo="myExcludedChanges" />
                </node>
                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631299">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Set.add(java.lang.Object):boolean" />
                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631300">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247631249" resolveInfo="second" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247631301">
      <property name="1.name:0" value="collectSetNodeConflicts" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247631302" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="4707157387247631303" />
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631304">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247631305">
          <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247631306">
            <property name="1.name:0" value="changes" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631307">
              <link role="3.classifier:3" targetNodeId="4.~Map" />
              <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631308">
                <link role="3.classifier:3" targetNodeId="16.~Pair" />
                <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631309">
                  <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
                </node>
                <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631310">
                  <link role="3.classifier:3" targetNodeId="2.~String" />
                </node>
              </node>
              <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631311">
                <link role="3.classifier:3" targetNodeId="4.~List" />
                <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631312">
                  <link role="3.classifier:3" targetNodeId="14.4707157387247557769" resolveInfo="SetNodeChange" />
                </node>
              </node>
            </node>
            <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247631313">
              <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247631314">
                <link role="3.baseMethodDeclaration:3" targetNodeId="4.~HashMap.&lt;init&gt;()" />
                <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631315">
                  <link role="3.classifier:3" targetNodeId="16.~Pair" />
                  <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631316">
                    <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
                  </node>
                  <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631317">
                    <link role="3.classifier:3" targetNodeId="2.~String" />
                  </node>
                </node>
                <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631318">
                  <link role="3.classifier:3" targetNodeId="4.~List" />
                  <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631319">
                    <link role="3.classifier:3" targetNodeId="14.4707157387247557769" resolveInfo="SetNodeChange" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247631320">
          <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247631321">
            <property name="1.name:0" value="sets" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631322">
              <link role="3.classifier:3" targetNodeId="4.~List" />
              <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631323">
                <link role="3.classifier:3" targetNodeId="14.4707157387247557769" resolveInfo="SetNodeChange" />
              </node>
            </node>
            <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247631324">
              <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247631645" resolveInfo="getChanges" />
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression:3" id="4707157387247631325">
                <link role="3.classifier:3" targetNodeId="14.4707157387247557769" resolveInfo="SetNodeChange" />
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247631326">
          <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631327">
            <link role="3.variableDeclaration:3" targetNodeId="4707157387247631321" resolveInfo="sets" />
          </node>
          <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247631328">
            <property name="1.name:0" value="spc" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631329">
              <link role="3.classifier:3" targetNodeId="14.4707157387247557769" resolveInfo="SetNodeChange" />
            </node>
          </node>
          <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631330">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247631331">
              <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247631332">
                <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247631533" resolveInfo="isOneOrZeroCardinality" />
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247631333">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247631511" resolveInfo="getNodeByIdAndChange" />
                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631334">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247631328" resolveInfo="spc" />
                  </node>
                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631335">
                    <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631336">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247631328" resolveInfo="spc" />
                    </node>
                    <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631337">
                      <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247556841" resolveInfo="getNodeParent" />
                    </node>
                  </node>
                </node>
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631338">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631339">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247631328" resolveInfo="spc" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631340">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247556835" resolveInfo="getNodeRole" />
                  </node>
                </node>
              </node>
              <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631341">
                <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247631342">
                  <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="4707157387247631343">
                    <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631344">
                      <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631345">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247631306" resolveInfo="changes" />
                      </node>
                      <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631346">
                        <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Map.get(java.lang.Object):java.lang.Object" />
                        <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247631347">
                          <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247631348">
                            <link role="3.baseMethodDeclaration:3" targetNodeId="16.~Pair.&lt;init&gt;(java.lang.Object,java.lang.Object)" />
                            <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631349">
                              <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
                            </node>
                            <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631350">
                              <link role="3.classifier:3" targetNodeId="2.~String" />
                            </node>
                            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631351">
                              <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631352">
                                <link role="3.variableDeclaration:3" targetNodeId="4707157387247631328" resolveInfo="spc" />
                              </node>
                              <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631353">
                                <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247556841" resolveInfo="getNodeParent" />
                              </node>
                            </node>
                            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631354">
                              <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631355">
                                <link role="3.variableDeclaration:3" targetNodeId="4707157387247631328" resolveInfo="spc" />
                              </node>
                              <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631356">
                                <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247556835" resolveInfo="getNodeRole" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247631357" />
                  </node>
                  <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631358">
                    <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631359">
                      <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631360">
                        <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631361">
                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247631306" resolveInfo="changes" />
                        </node>
                        <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631362">
                          <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Map.put(java.lang.Object,java.lang.Object):java.lang.Object" />
                          <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247631363">
                            <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247631364">
                              <link role="3.baseMethodDeclaration:3" targetNodeId="16.~Pair.&lt;init&gt;(java.lang.Object,java.lang.Object)" />
                              <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631365">
                                <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
                              </node>
                              <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631366">
                                <link role="3.classifier:3" targetNodeId="2.~String" />
                              </node>
                              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631367">
                                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631368">
                                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247631328" resolveInfo="spc" />
                                </node>
                                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631369">
                                  <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247556841" resolveInfo="getNodeParent" />
                                </node>
                              </node>
                              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631370">
                                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631371">
                                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247631328" resolveInfo="spc" />
                                </node>
                                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631372">
                                  <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247556835" resolveInfo="getNodeRole" />
                                </node>
                              </node>
                            </node>
                          </node>
                          <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247631373">
                            <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247631374">
                              <link role="3.baseMethodDeclaration:3" targetNodeId="4.~ArrayList.&lt;init&gt;()" />
                              <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631375">
                                <link role="3.classifier:3" targetNodeId="14.4707157387247557769" resolveInfo="SetNodeChange" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631376">
                  <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631377">
                    <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631378">
                      <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631379">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247631306" resolveInfo="changes" />
                      </node>
                      <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631380">
                        <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Map.get(java.lang.Object):java.lang.Object" />
                        <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247631381">
                          <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247631382">
                            <link role="3.baseMethodDeclaration:3" targetNodeId="16.~Pair.&lt;init&gt;(java.lang.Object,java.lang.Object)" />
                            <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631383">
                              <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
                            </node>
                            <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631384">
                              <link role="3.classifier:3" targetNodeId="2.~String" />
                            </node>
                            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631385">
                              <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631386">
                                <link role="3.variableDeclaration:3" targetNodeId="4707157387247631328" resolveInfo="spc" />
                              </node>
                              <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631387">
                                <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247556841" resolveInfo="getNodeParent" />
                              </node>
                            </node>
                            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631388">
                              <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631389">
                                <link role="3.variableDeclaration:3" targetNodeId="4707157387247631328" resolveInfo="spc" />
                              </node>
                              <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631390">
                                <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247556835" resolveInfo="getNodeRole" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631391">
                      <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.add(java.lang.Object):boolean" />
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631392">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247631328" resolveInfo="spc" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247631393">
          <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247631394">
            <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247631645" resolveInfo="getChanges" />
            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression:3" id="4707157387247631395">
              <link role="3.classifier:3" targetNodeId="14.4707157387247556223" resolveInfo="MoveNodeChange" />
            </node>
          </node>
          <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247631396">
            <property name="1.name:0" value="mnc" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631397">
              <link role="3.classifier:3" targetNodeId="14.4707157387247556223" resolveInfo="MoveNodeChange" />
            </node>
          </node>
          <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631398">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247631399">
              <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247631400">
                <property name="1.name:0" value="newRole" />
                <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631401">
                  <link role="3.classifier:3" targetNodeId="2.~String" />
                </node>
                <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631402">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631403">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247631396" resolveInfo="mnc" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631404">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247556278" resolveInfo="getNewRole" />
                  </node>
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247631405">
              <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="4707157387247631406">
                <link role="3.classConcept:3" targetNodeId="17.~CollectionUtil" />
                <link role="3.baseMethodDeclaration:3" targetNodeId="17.~CollectionUtil.set(java.lang.Object...):java.util.Set" />
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631407">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247631408">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247630937" resolveInfo="getMine" />
                    <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631409">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247630676" resolveInfo="mySourceModels" />
                    </node>
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631410">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SModel.getNodeById(jetbrains.mps.smodel.SNodeId):jetbrains.mps.smodel.SNode" />
                    <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631411">
                      <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631412">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247631396" resolveInfo="mnc" />
                      </node>
                      <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631413">
                        <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247556266" resolveInfo="getNewParent" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631414">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247631415">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247630937" resolveInfo="getMine" />
                    <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631416">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247630676" resolveInfo="mySourceModels" />
                    </node>
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631417">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SModel.getNodeById(jetbrains.mps.smodel.SNodeId):jetbrains.mps.smodel.SNode" />
                    <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631418">
                      <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631419">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247631396" resolveInfo="mnc" />
                      </node>
                      <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631420">
                        <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247556266" resolveInfo="getNewParent" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247631421">
                <property name="1.name:0" value="newParent" />
                <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631422">
                  <link role="3.classifier:3" targetNodeId="21.~SNode" />
                </node>
              </node>
              <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631423">
                <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.WhileStatement:3" id="4707157387247631424">
                  <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="4707157387247631425">
                    <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631426">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247631421" resolveInfo="newParent" />
                    </node>
                    <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247631427" />
                  </node>
                  <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631428">
                    <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247631429">
                      <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631430">
                        <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631431">
                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247631306" resolveInfo="changes" />
                        </node>
                        <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631432">
                          <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Map.containsKey(java.lang.Object):boolean" />
                          <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247631433">
                            <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247631434">
                              <link role="3.baseMethodDeclaration:3" targetNodeId="16.~Pair.&lt;init&gt;(java.lang.Object,java.lang.Object)" />
                              <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631435">
                                <link role="3.classifier:3" targetNodeId="2.~Object" />
                              </node>
                              <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631436">
                                <link role="3.classifier:3" targetNodeId="2.~Object" />
                              </node>
                              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631437">
                                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631438">
                                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247631421" resolveInfo="newParent" />
                                </node>
                                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631439">
                                  <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getId():java.lang.String" />
                                </node>
                              </node>
                              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631440">
                                <link role="3.variableDeclaration:3" targetNodeId="4707157387247631400" resolveInfo="newRole" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631441">
                        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247631442">
                          <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247631443">
                            <property name="1.name:0" value="cs" />
                            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631444">
                              <link role="3.classifier:3" targetNodeId="4.~List" />
                              <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631445">
                                <link role="3.classifier:3" targetNodeId="14.4707157387247557769" resolveInfo="SetNodeChange" />
                              </node>
                            </node>
                            <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247631446">
                              <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247631447">
                                <link role="3.baseMethodDeclaration:3" targetNodeId="4.~ArrayList.&lt;init&gt;(java.util.Collection)" />
                                <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631448">
                                  <link role="3.classifier:3" targetNodeId="14.4707157387247557769" resolveInfo="SetNodeChange" />
                                </node>
                                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631449">
                                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631450">
                                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247631306" resolveInfo="changes" />
                                  </node>
                                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631451">
                                    <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Map.get(java.lang.Object):java.lang.Object" />
                                    <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247631452">
                                      <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247631453">
                                        <link role="3.baseMethodDeclaration:3" targetNodeId="16.~Pair.&lt;init&gt;(java.lang.Object,java.lang.Object)" />
                                        <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631454">
                                          <link role="3.classifier:3" targetNodeId="2.~Object" />
                                        </node>
                                        <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631455">
                                          <link role="3.classifier:3" targetNodeId="2.~Object" />
                                        </node>
                                        <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631456">
                                          <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631457">
                                            <link role="3.variableDeclaration:3" targetNodeId="4707157387247631421" resolveInfo="newParent" />
                                          </node>
                                          <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631458">
                                            <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getId():java.lang.String" />
                                          </node>
                                        </node>
                                        <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631459">
                                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247631400" resolveInfo="newRole" />
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631460">
                          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631461">
                            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631462">
                              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630721" resolveInfo="myConflicts" />
                            </node>
                            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631463">
                              <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.add(java.lang.Object):boolean" />
                              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247631464">
                                <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247631465">
                                  <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247632375" resolveInfo="Conflict" />
                                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631466">
                                    <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631467">
                                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247631443" resolveInfo="cs" />
                                    </node>
                                    <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631468">
                                      <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.get(int):java.lang.Object" />
                                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="4707157387247631469">
                                        <property name="3.value:3" value="0" />
                                      </node>
                                    </node>
                                  </node>
                                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631470">
                                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247631396" resolveInfo="mnc" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631471">
                          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631472">
                            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631473">
                              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630739" resolveInfo="myConflictingChanges" />
                            </node>
                            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631474">
                              <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Set.add(java.lang.Object):boolean" />
                              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631475">
                                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631476">
                                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247631443" resolveInfo="cs" />
                                </node>
                                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631477">
                                  <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.get(int):java.lang.Object" />
                                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="4707157387247631478">
                                    <property name="3.value:3" value="0" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631479">
                          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631480">
                            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631481">
                              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630739" resolveInfo="myConflictingChanges" />
                            </node>
                            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631482">
                              <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Set.add(java.lang.Object):boolean" />
                              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631483">
                                <link role="3.variableDeclaration:3" targetNodeId="4707157387247631396" resolveInfo="mnc" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631484">
                      <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="4707157387247631485">
                        <node role="3.lValue:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631486">
                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247631400" resolveInfo="newRole" />
                        </node>
                        <node role="3.rValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631487">
                          <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631488">
                            <link role="3.variableDeclaration:3" targetNodeId="4707157387247631421" resolveInfo="newParent" />
                          </node>
                          <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631489">
                            <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getRole_():java.lang.String" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631490">
                      <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="4707157387247631491">
                        <node role="3.lValue:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631492">
                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247631421" resolveInfo="newParent" />
                        </node>
                        <node role="3.rValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631493">
                          <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631494">
                            <link role="3.variableDeclaration:3" targetNodeId="4707157387247631421" resolveInfo="newParent" />
                          </node>
                          <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631495">
                            <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getParent():jetbrains.mps.smodel.SNode" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247631496">
          <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631497">
            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631498">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247631306" resolveInfo="changes" />
            </node>
            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631499">
              <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Map.keySet():java.util.Set" />
            </node>
          </node>
          <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247631500">
            <property name="1.name:0" value="p" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631501">
              <link role="3.classifier:3" targetNodeId="16.~Pair" />
              <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631502">
                <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
              </node>
              <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631503">
                <link role="3.classifier:3" targetNodeId="2.~String" />
              </node>
            </node>
          </node>
          <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631504">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631505">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247631506">
                <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247631218" resolveInfo="handlePossibleConflictOrSymmetry" />
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631507">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631508">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247631306" resolveInfo="changes" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631509">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Map.get(java.lang.Object):java.lang.Object" />
                    <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631510">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247631500" resolveInfo="p" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247631511">
      <property name="1.name:0" value="getNodeByIdAndChange" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247631512" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631513">
        <link role="3.classifier:3" targetNodeId="21.~SNode" />
      </node>
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247631514">
        <property name="1.name:0" value="spc" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631515">
          <link role="3.classifier:3" targetNodeId="14.4707157387247557769" resolveInfo="SetNodeChange" />
        </node>
      </node>
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247631516">
        <property name="1.name:0" value="nodeId" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631517">
          <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631518">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247631519">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.TernaryOperatorExpression:3" id="4707157387247631520">
            <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247631521">
              <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247632201" resolveInfo="isMine" />
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247631522">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247631514" resolveInfo="spc" />
              </node>
            </node>
            <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631523">
              <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247631524">
                <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247630937" resolveInfo="getMine" />
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631525">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630676" resolveInfo="mySourceModels" />
                </node>
              </node>
              <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631526">
                <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SModel.getNodeById(jetbrains.mps.smodel.SNodeId):jetbrains.mps.smodel.SNode" />
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247631527">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247631516" resolveInfo="nodeId" />
                </node>
              </node>
            </node>
            <node role="3.ifFalse:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631528">
              <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247631529">
                <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247630924" resolveInfo="getRepo" />
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631530">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630676" resolveInfo="mySourceModels" />
                </node>
              </node>
              <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631531">
                <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SModel.getNodeById(jetbrains.mps.smodel.SNodeId):jetbrains.mps.smodel.SNode" />
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247631532">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247631516" resolveInfo="nodeId" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247631533">
      <property name="1.name:0" value="isOneOrZeroCardinality" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247631534" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="4707157387247631535" />
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247631536">
        <property name="1.name:0" value="parent" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631537">
          <link role="3.classifier:3" targetNodeId="21.~SNode" />
        </node>
      </node>
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247631538">
        <property name="1.name:0" value="role" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631539">
          <link role="3.classifier:3" targetNodeId="2.~String" />
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631540">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247631541">
          <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247631542">
            <property name="1.name:0" value="ld" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631543">
              <link role="3.classifier:3" targetNodeId="24.~LinkDeclaration" />
            </node>
            <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="4707157387247631544">
              <link role="3.classConcept:3" targetNodeId="6.~SModelSearchUtil" />
              <link role="3.baseMethodDeclaration:3" targetNodeId="6.~SModelSearchUtil.findLinkDeclaration(jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration,java.lang.String):jetbrains.mps.lang.structure.structure.LinkDeclaration" />
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="4707157387247631545">
                <link role="3.classConcept:3" targetNodeId="21.~SModelUtil_new" />
                <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SModelUtil_new.findConceptDeclaration(java.lang.String,jetbrains.mps.smodel.IScope):jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration" />
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631546">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247631547">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247631536" resolveInfo="parent" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631548">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.getConceptFqName():java.lang.String" />
                  </node>
                </node>
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="4707157387247631549">
                  <link role="3.classConcept:3" targetNodeId="11.~GlobalScope" />
                  <link role="3.baseMethodDeclaration:3" targetNodeId="11.~GlobalScope.getInstance():jetbrains.mps.project.GlobalScope" />
                </node>
              </node>
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247631550">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247631538" resolveInfo="role" />
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247631551">
          <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="4707157387247631552">
            <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631553">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247631542" resolveInfo="ld" />
            </node>
            <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247631554" />
          </node>
          <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631555">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247631556">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="4707157387247631557" />
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247631558">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.OrExpression:3" id="4707157387247631559">
            <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="4707157387247631560">
              <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631561">
                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631562">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247631542" resolveInfo="ld" />
                </node>
                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631563">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="24.~LinkDeclaration.getSourceCardinality():jetbrains.mps.lang.structure.structure.Cardinality" />
                </node>
              </node>
              <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="3613324658897910022">
                <link role="3.enumConstantDeclaration:3" targetNodeId="24.~Cardinality._0__1" resolveInfo="_0__1" />
                <link role="3.enumClass:3" targetNodeId="24.~Cardinality" resolveInfo="Cardinality" />
              </node>
            </node>
            <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="4707157387247631565">
              <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631566">
                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631567">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247631542" resolveInfo="ld" />
                </node>
                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631568">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="24.~LinkDeclaration.getSourceCardinality():jetbrains.mps.lang.structure.structure.Cardinality" />
                </node>
              </node>
              <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="3613324658897910023">
                <link role="3.enumConstantDeclaration:3" targetNodeId="24.~Cardinality._1" resolveInfo="_1" />
                <link role="3.enumClass:3" targetNodeId="24.~Cardinality" resolveInfo="Cardinality" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247631570">
      <property name="1.name:0" value="collectDeleteDependencyConflicts" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247631571" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="4707157387247631572" />
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631573">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631574">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247631575">
            <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247631582" resolveInfo="collectDeleteDependencyConflicts" />
            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631576">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630690" resolveInfo="myBaseMineChanges" />
            </node>
            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631577">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630703" resolveInfo="myBaseRepoChanges" />
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631578">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247631579">
            <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247631582" resolveInfo="collectDeleteDependencyConflicts" />
            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631580">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630703" resolveInfo="myBaseRepoChanges" />
            </node>
            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631581">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630690" resolveInfo="myBaseMineChanges" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247631582">
      <property name="1.name:0" value="collectDeleteDependencyConflicts" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247631583" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="4707157387247631584" />
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247631585">
        <property name="1.name:0" value="list1" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631586">
          <link role="3.classifier:3" targetNodeId="4.~List" />
          <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631587">
            <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
          </node>
        </node>
      </node>
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247631588">
        <property name="1.name:0" value="list2" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631589">
          <link role="3.classifier:3" targetNodeId="4.~List" />
          <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631590">
            <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
          </node>
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631591">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247631592">
          <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247631593">
            <link role="3.variableDeclaration:3" targetNodeId="4707157387247631585" resolveInfo="list1" />
          </node>
          <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247631594">
            <property name="1.name:0" value="c" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631595">
              <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
            </node>
          </node>
          <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631596">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247631597">
              <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.NotExpression:3" id="4707157387247631598">
                <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631599">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631600">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247630746" resolveInfo="mySymmetricChanges" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631601">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Set.contains(java.lang.Object):boolean" />
                    <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631602">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247631594" resolveInfo="c" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631603">
                <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247631604">
                  <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="4707157387247631605">
                    <link role="3.classConcept:3" targetNodeId="17.~CollectionUtil" />
                    <link role="3.baseMethodDeclaration:3" targetNodeId="17.~CollectionUtil.filter(java.lang.Class,java.util.List):java.util.List" />
                    <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression:3" id="4707157387247631606">
                      <link role="3.classifier:3" targetNodeId="14.4707157387247557317" resolveInfo="DeleteNodeChange" />
                    </node>
                    <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247631607">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247631588" resolveInfo="list2" />
                    </node>
                  </node>
                  <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247631608">
                    <property name="1.name:0" value="d" />
                    <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631609">
                      <link role="3.classifier:3" targetNodeId="14.4707157387247557317" resolveInfo="DeleteNodeChange" />
                    </node>
                  </node>
                  <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631610">
                    <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247631611">
                      <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.AndExpression:3" id="4707157387247631612">
                        <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.NotExpression:3" id="4707157387247631613">
                          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631614">
                            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631615">
                              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630746" resolveInfo="mySymmetricChanges" />
                            </node>
                            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631616">
                              <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Set.contains(java.lang.Object):boolean" />
                              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631617">
                                <link role="3.variableDeclaration:3" targetNodeId="4707157387247631608" resolveInfo="d" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631618">
                          <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631619">
                            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631620">
                              <link role="3.variableDeclaration:3" targetNodeId="4707157387247631594" resolveInfo="c" />
                            </node>
                            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631621">
                              <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247556985" resolveInfo="getDependencies" />
                            </node>
                          </node>
                          <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631622">
                            <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.contains(java.lang.Object):boolean" />
                            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631623">
                              <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631624">
                                <link role="3.variableDeclaration:3" targetNodeId="4707157387247631608" resolveInfo="d" />
                              </node>
                              <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631625">
                                <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247557496" resolveInfo="getAffectedNodeId" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631626">
                        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631627">
                          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631628">
                            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631629">
                              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630721" resolveInfo="myConflicts" />
                            </node>
                            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631630">
                              <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.add(java.lang.Object):boolean" />
                              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247631631">
                                <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247631632">
                                  <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247632375" resolveInfo="Conflict" />
                                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631633">
                                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247631594" resolveInfo="c" />
                                  </node>
                                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631634">
                                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247631608" resolveInfo="d" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631635">
                          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631636">
                            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631637">
                              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630739" resolveInfo="myConflictingChanges" />
                            </node>
                            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631638">
                              <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Set.add(java.lang.Object):boolean" />
                              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631639">
                                <link role="3.variableDeclaration:3" targetNodeId="4707157387247631594" resolveInfo="c" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631640">
                          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631641">
                            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631642">
                              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630739" resolveInfo="myConflictingChanges" />
                            </node>
                            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631643">
                              <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Set.add(java.lang.Object):boolean" />
                              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631644">
                                <link role="3.variableDeclaration:3" targetNodeId="4707157387247631608" resolveInfo="d" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247631645">
      <property name="1.name:0" value="getChanges" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247631646" />
      <node role="3.typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="4707157387247631647">
        <property name="1.name:0" value="C" />
        <property name="3.extends:3" value="true" />
        <node role="3.bound:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631648">
          <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
        </node>
      </node>
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631649">
        <link role="3.classifier:3" targetNodeId="4.~List" />
        <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="4707157387247631650">
          <link role="3.typeVariableDeclaration:3" targetNodeId="4707157387247631647" resolveInfo="C" />
        </node>
      </node>
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247631651">
        <property name="1.name:0" value="changeClass" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631652">
          <link role="3.classifier:3" targetNodeId="2.~Class" />
          <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="4707157387247631653">
            <link role="3.typeVariableDeclaration:3" targetNodeId="4707157387247631647" resolveInfo="C" />
          </node>
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631654">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247631655">
          <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247631656">
            <property name="1.name:0" value="result" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631657">
              <link role="3.classifier:3" targetNodeId="4.~List" />
              <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="4707157387247631658">
                <link role="3.typeVariableDeclaration:3" targetNodeId="4707157387247631647" resolveInfo="C" />
              </node>
            </node>
            <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247631659">
              <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247631660">
                <link role="3.baseMethodDeclaration:3" targetNodeId="4.~ArrayList.&lt;init&gt;()" />
                <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="4707157387247631661">
                  <link role="3.typeVariableDeclaration:3" targetNodeId="4707157387247631647" resolveInfo="C" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631662">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631663">
            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631664">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247631656" resolveInfo="result" />
            </node>
            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631665">
              <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.addAll(java.util.Collection):boolean" />
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="4707157387247631666">
                <link role="3.classConcept:3" targetNodeId="17.~CollectionUtil" />
                <link role="3.baseMethodDeclaration:3" targetNodeId="17.~CollectionUtil.filter(java.lang.Class,java.util.List):java.util.List" />
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247631667">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247631651" resolveInfo="changeClass" />
                </node>
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631668">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630690" resolveInfo="myBaseMineChanges" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631669">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631670">
            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631671">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247631656" resolveInfo="result" />
            </node>
            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631672">
              <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.addAll(java.util.Collection):boolean" />
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="4707157387247631673">
                <link role="3.classConcept:3" targetNodeId="17.~CollectionUtil" />
                <link role="3.baseMethodDeclaration:3" targetNodeId="17.~CollectionUtil.filter(java.lang.Class,java.util.List):java.util.List" />
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247631674">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247631651" resolveInfo="changeClass" />
                </node>
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631675">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630703" resolveInfo="myBaseRepoChanges" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247631676">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631677">
            <link role="3.variableDeclaration:3" targetNodeId="4707157387247631656" resolveInfo="result" />
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247631678">
      <property name="1.name:0" value="rebuldResultModel" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4707157387247631679" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="4707157387247631680" />
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631681">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631682">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="4707157387247631683">
            <node role="3.lValue:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631684">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630687" resolveInfo="myResultModel" />
            </node>
            <node role="3.rValue:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="4707157387247631685">
              <link role="3.classConcept:3" targetNodeId="21.~CopyUtil" />
              <link role="3.baseMethodDeclaration:3" targetNodeId="21.~CopyUtil.copyModel(jetbrains.mps.smodel.SModel):jetbrains.mps.smodel.SModel" />
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247631686">
                <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247630950" resolveInfo="getBase" />
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631687">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630676" resolveInfo="mySourceModels" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247631688">
          <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247631689">
            <property name="1.name:0" value="wasLoading" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="4707157387247631690" />
            <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631691">
              <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631692">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247630687" resolveInfo="myResultModel" />
              </node>
              <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631693">
                <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SModel.setLoading(boolean):boolean" />
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="4707157387247631694">
                  <property name="3.value:3" value="true" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.TryStatement:3" id="4707157387247631695">
          <node role="3.finallyBody:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631696">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631697">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631698">
                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631699">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630687" resolveInfo="myResultModel" />
                </node>
                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631700">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SModel.setLoading(boolean):boolean" />
                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631701">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247631689" resolveInfo="wasLoading" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631702">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247631703">
              <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247631704">
                <property name="1.name:0" value="languageNamespace" />
                <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631705">
                  <link role="3.classifier:3" targetNodeId="9.~ModuleReference" />
                </node>
                <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="4707157387247631706">
                  <link role="3.classConcept:3" targetNodeId="9.~ModuleReference" />
                  <link role="3.baseMethodDeclaration:3" targetNodeId="9.~ModuleReference.fromString(java.lang.String):jetbrains.mps.project.structure.modules.ModuleReference" />
                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="4707157387247631707">
                    <property name="3.value:3" value="jetbrains.mps.core" />
                  </node>
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247631708">
              <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247631709">
                <property name="1.name:0" value="tmp" />
                <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631710">
                  <link role="3.classifier:3" targetNodeId="21.~SNode" />
                </node>
                <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247631711">
                  <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247631712">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SNode.&lt;init&gt;(jetbrains.mps.smodel.SModel,java.lang.String)" />
                    <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631713">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247630687" resolveInfo="myResultModel" />
                    </node>
                    <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="4707157387247631714">
                      <link role="3.classConcept:3" targetNodeId="17.~NameUtil" />
                      <link role="3.baseMethodDeclaration:3" targetNodeId="17.~NameUtil.conceptFQNameFromNamespaceAndShortName(java.lang.String,java.lang.String):java.lang.String" />
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631715">
                        <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631716">
                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247631704" resolveInfo="languageNamespace" />
                        </node>
                        <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631717">
                          <link role="3.baseMethodDeclaration:3" targetNodeId="9.~ModuleReference.getModuleFqName():java.lang.String" />
                        </node>
                      </node>
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="4707157387247631718">
                        <property name="3.value:3" value="BaseConcept" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247631719">
              <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247631720">
                <property name="1.name:0" value="notRemoveLanguage" />
                <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="4707157387247631721" />
                <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="4707157387247631722" />
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247631723">
              <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631724">
                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631725">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631726">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247630687" resolveInfo="myResultModel" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631727">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SModel.importedLanguages():java.util.List" />
                  </node>
                </node>
                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631728">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.contains(java.lang.Object):boolean" />
                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631729">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247631704" resolveInfo="languageNamespace" />
                  </node>
                </node>
              </node>
              <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631730">
                <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631731">
                  <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="4707157387247631732">
                    <node role="3.lValue:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631733">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247631720" resolveInfo="notRemoveLanguage" />
                    </node>
                    <node role="3.rValue:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="4707157387247631734">
                      <property name="3.value:3" value="true" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631735">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631736">
                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631737">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630687" resolveInfo="myResultModel" />
                </node>
                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631738">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SModel.addRoot(jetbrains.mps.smodel.SNode):void" />
                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631739">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247631709" resolveInfo="tmp" />
                  </node>
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631740">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="4707157387247631741">
                <node role="3.lValue:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631742">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630735" resolveInfo="myUnresolvedConflictingChanges" />
                </node>
                <node role="3.rValue:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247631743">
                  <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247631744">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="4.~LinkedHashSet.&lt;init&gt;()" />
                    <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631745">
                      <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247631746">
              <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631747">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247630721" resolveInfo="myConflicts" />
              </node>
              <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247631748">
                <property name="1.name:0" value="conflict" />
                <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631749">
                  <link role="3.classifier:3" targetNodeId="4707157387247632367" resolveInfo="Conflict" />
                </node>
              </node>
              <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631750">
                <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247631751">
                  <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.AndExpression:3" id="4707157387247631752">
                    <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.NotExpression:3" id="4707157387247631753">
                      <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631754">
                        <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631755">
                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247630707" resolveInfo="myExcludedChanges" />
                        </node>
                        <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631756">
                          <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Set.contains(java.lang.Object):boolean" />
                          <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631757">
                            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631758">
                              <link role="3.variableDeclaration:3" targetNodeId="4707157387247631748" resolveInfo="conflict" />
                            </node>
                            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631759">
                              <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247632391" resolveInfo="getChange1" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NotExpression:3" id="4707157387247631760">
                      <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631761">
                        <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631762">
                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247630707" resolveInfo="myExcludedChanges" />
                        </node>
                        <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631763">
                          <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Set.contains(java.lang.Object):boolean" />
                          <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631764">
                            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631765">
                              <link role="3.variableDeclaration:3" targetNodeId="4707157387247631748" resolveInfo="conflict" />
                            </node>
                            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631766">
                              <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247632397" resolveInfo="getChange2" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631767">
                    <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631768">
                      <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631769">
                        <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631770">
                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247630735" resolveInfo="myUnresolvedConflictingChanges" />
                        </node>
                        <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631771">
                          <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Set.add(java.lang.Object):boolean" />
                          <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631772">
                            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631773">
                              <link role="3.variableDeclaration:3" targetNodeId="4707157387247631748" resolveInfo="conflict" />
                            </node>
                            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631774">
                              <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247632391" resolveInfo="getChange1" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631775">
                      <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631776">
                        <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631777">
                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247630735" resolveInfo="myUnresolvedConflictingChanges" />
                        </node>
                        <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631778">
                          <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Set.add(java.lang.Object):boolean" />
                          <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631779">
                            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631780">
                              <link role="3.variableDeclaration:3" targetNodeId="4707157387247631748" resolveInfo="conflict" />
                            </node>
                            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631781">
                              <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247632397" resolveInfo="getChange2" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247631782">
              <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247631783">
                <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247631784">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="4.~ArrayList.&lt;init&gt;(java.util.Collection)" />
                  <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631785">
                    <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
                  </node>
                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631786">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247630735" resolveInfo="myUnresolvedConflictingChanges" />
                  </node>
                </node>
              </node>
              <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247631787">
                <property name="1.name:0" value="change" />
                <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631788">
                  <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
                </node>
              </node>
              <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631789">
                <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631790">
                  <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631791">
                    <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631792">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247630735" resolveInfo="myUnresolvedConflictingChanges" />
                    </node>
                    <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631793">
                      <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Set.addAll(java.util.Collection):boolean" />
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247631794">
                        <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247631017" resolveInfo="getChangeGroupOf" />
                        <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631795">
                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247631787" resolveInfo="change" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631796">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247631797">
                <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247631897" resolveInfo="applyChangesByClass" />
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression:3" id="4707157387247631798">
                  <link role="3.classifier:3" targetNodeId="14.4707157387247556660" resolveInfo="UsedLanguagesChange" />
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631799">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247631800">
                <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247631897" resolveInfo="applyChangesByClass" />
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression:3" id="4707157387247631801">
                  <link role="3.classifier:3" targetNodeId="14.4707157387247558048" resolveInfo="ModelImportChange" />
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631802">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247631803">
                <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247631897" resolveInfo="applyChangesByClass" />
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression:3" id="4707157387247631804">
                  <link role="3.classifier:3" targetNodeId="14.4707157387247556079" resolveInfo="AddLanguageAspectChange" />
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631805">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247631806">
                <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247631922" resolveInfo="applyStructuralChanges" />
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631807">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247631808">
                <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247631897" resolveInfo="applyChangesByClass" />
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression:3" id="4707157387247631809">
                  <link role="3.classifier:3" targetNodeId="14.4707157387247558333" resolveInfo="ChangeConceptChange" />
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631810">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247631811">
                <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247631897" resolveInfo="applyChangesByClass" />
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression:3" id="4707157387247631812">
                  <link role="3.classifier:3" targetNodeId="14.4707157387247557037" resolveInfo="SetPropertyChange" />
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631813">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247631814">
                <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247631897" resolveInfo="applyChangesByClass" />
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression:3" id="4707157387247631815">
                  <link role="3.classifier:3" targetNodeId="14.4707157387247558473" resolveInfo="SetReferenceChange" />
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631816">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631817">
                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631818">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630687" resolveInfo="myResultModel" />
                </node>
                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631819">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SModel.removeRoot(jetbrains.mps.smodel.SNode):void" />
                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631820">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247631709" resolveInfo="tmp" />
                  </node>
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247631821">
              <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.NotExpression:3" id="4707157387247631822">
                <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631823">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247631720" resolveInfo="notRemoveLanguage" />
                </node>
              </node>
              <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631824">
                <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631825">
                  <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631826">
                    <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631827">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247630687" resolveInfo="myResultModel" />
                    </node>
                    <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631828">
                      <link role="3.baseMethodDeclaration:3" targetNodeId="21.~SModel.deleteLanguage(jetbrains.mps.project.structure.modules.ModuleReference):void" />
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631829">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247631704" resolveInfo="languageNamespace" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247631830">
      <property name="1.name:0" value="isChangeApplicable" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247631831" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="4707157387247631832" />
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247631833">
        <property name="1.name:0" value="change" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631834">
          <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631835">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247631836">
          <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.AndExpression:3" id="4707157387247631837">
            <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631838">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630753" resolveInfo="myPreviewMode" />
            </node>
            <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NotExpression:3" id="4707157387247631839">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631840">
                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631841">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630714" resolveInfo="myAppliedChanges" />
                </node>
                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631842">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Set.contains(java.lang.Object):boolean" />
                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247631843">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247631833" resolveInfo="change" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631844">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247631845">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="4707157387247631846" />
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247631847">
          <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631848">
            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631849">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630707" resolveInfo="myExcludedChanges" />
            </node>
            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631850">
              <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Set.contains(java.lang.Object):boolean" />
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247631851">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247631833" resolveInfo="change" />
              </node>
            </node>
          </node>
          <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631852">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247631853">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="4707157387247631854" />
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247631855">
          <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247631856">
            <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247632157" resolveInfo="isChangeUnresolved" />
            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247631857">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247631833" resolveInfo="change" />
            </node>
          </node>
          <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631858">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247631859">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="4707157387247631860" />
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247631861">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="4707157387247631862">
            <property name="3.value:3" value="true" />
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247631863">
      <property name="1.name:0" value="getApplicableChanges" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247631864" />
      <node role="3.typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="4707157387247631865">
        <property name="1.name:0" value="C" />
        <property name="3.extends:3" value="true" />
        <node role="3.bound:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631866">
          <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
        </node>
      </node>
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631867">
        <link role="3.classifier:3" targetNodeId="4.~List" />
        <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="4707157387247631868">
          <link role="3.typeVariableDeclaration:3" targetNodeId="4707157387247631865" resolveInfo="C" />
        </node>
      </node>
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247631869">
        <property name="1.name:0" value="changeClass" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631870">
          <link role="3.classifier:3" targetNodeId="2.~Class" />
          <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="4707157387247631871">
            <link role="3.typeVariableDeclaration:3" targetNodeId="4707157387247631865" resolveInfo="C" />
          </node>
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631872">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247631873">
          <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247631874">
            <property name="1.name:0" value="result" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631875">
              <link role="3.classifier:3" targetNodeId="4.~List" />
              <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="4707157387247631876">
                <link role="3.typeVariableDeclaration:3" targetNodeId="4707157387247631865" resolveInfo="C" />
              </node>
            </node>
            <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247631877">
              <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247631878">
                <link role="3.baseMethodDeclaration:3" targetNodeId="4.~ArrayList.&lt;init&gt;()" />
                <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="4707157387247631879">
                  <link role="3.typeVariableDeclaration:3" targetNodeId="4707157387247631865" resolveInfo="C" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247631880">
          <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247631881">
            <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247631645" resolveInfo="getChanges" />
            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247631882">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247631869" resolveInfo="changeClass" />
            </node>
          </node>
          <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247631883">
            <property name="1.name:0" value="change" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="4707157387247631884">
              <link role="3.typeVariableDeclaration:3" targetNodeId="4707157387247631865" resolveInfo="C" />
            </node>
          </node>
          <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631885">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247631886">
              <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247631887">
                <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247631830" resolveInfo="isChangeApplicable" />
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631888">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247631883" resolveInfo="change" />
                </node>
              </node>
              <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631889">
                <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631890">
                  <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631891">
                    <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631892">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247631874" resolveInfo="result" />
                    </node>
                    <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631893">
                      <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.add(java.lang.Object):boolean" />
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631894">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247631883" resolveInfo="change" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247631895">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631896">
            <link role="3.variableDeclaration:3" targetNodeId="4707157387247631874" resolveInfo="result" />
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247631897">
      <property name="1.name:0" value="applyChangesByClass" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247631898" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="4707157387247631899" />
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247631900">
        <property name="1.name:0" value="changeClass" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631901">
          <link role="3.classifier:3" targetNodeId="2.~Class" />
          <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.UpperBoundType:3" id="4707157387247631902">
            <node role="3.bound:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631903">
              <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
            </node>
          </node>
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631904">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247631905">
          <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247631906">
            <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247631863" resolveInfo="getApplicableChanges" />
            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247631907">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247631900" resolveInfo="changeClass" />
            </node>
          </node>
          <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247631908">
            <property name="1.name:0" value="change" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631909">
              <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
            </node>
          </node>
          <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631910">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247631911">
              <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631912">
                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631913">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247631908" resolveInfo="change" />
                </node>
                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631914">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247556979" resolveInfo="apply" />
                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631915">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247630687" resolveInfo="myResultModel" />
                  </node>
                </node>
              </node>
              <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631916">
                <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631917">
                  <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631918">
                    <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247631919">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247630714" resolveInfo="myAppliedChanges" />
                    </node>
                    <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631920">
                      <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Set.add(java.lang.Object):boolean" />
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631921">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247631908" resolveInfo="change" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247631922">
      <property name="1.name:0" value="applyStructuralChanges" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247631923" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="4707157387247631924" />
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631925">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247631926">
          <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247631927">
            <property name="1.name:0" value="structuralChanges" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631928">
              <link role="3.classifier:3" targetNodeId="4.~List" />
              <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631929">
                <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
              </node>
            </node>
            <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247631930">
              <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247631931">
                <link role="3.baseMethodDeclaration:3" targetNodeId="4.~ArrayList.&lt;init&gt;()" />
                <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631932">
                  <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631933">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631934">
            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631935">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247631927" resolveInfo="structuralChanges" />
            </node>
            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631936">
              <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.addAll(java.util.Collection):boolean" />
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247631937">
                <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247631863" resolveInfo="getApplicableChanges" />
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression:3" id="4707157387247631938">
                  <link role="3.classifier:3" targetNodeId="14.4707157387247556780" resolveInfo="NewNodeChange" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631939">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631940">
            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631941">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247631927" resolveInfo="structuralChanges" />
            </node>
            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631942">
              <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.addAll(java.util.Collection):boolean" />
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247631943">
                <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247631863" resolveInfo="getApplicableChanges" />
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression:3" id="4707157387247631944">
                  <link role="3.classifier:3" targetNodeId="14.4707157387247557317" resolveInfo="DeleteNodeChange" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631945">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631946">
            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631947">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247631927" resolveInfo="structuralChanges" />
            </node>
            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631948">
              <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.addAll(java.util.Collection):boolean" />
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247631949">
                <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247631863" resolveInfo="getApplicableChanges" />
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression:3" id="4707157387247631950">
                  <link role="3.classifier:3" targetNodeId="14.4707157387247556223" resolveInfo="MoveNodeChange" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247631951">
          <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247631952">
            <property name="1.name:0" value="nodeIdToChangeMap" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631953">
              <link role="3.classifier:3" targetNodeId="4.~Map" />
              <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631954">
                <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
              </node>
              <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631955">
                <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
              </node>
            </node>
            <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247631956">
              <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247631957">
                <link role="3.baseMethodDeclaration:3" targetNodeId="4.~HashMap.&lt;init&gt;()" />
                <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631958">
                  <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
                </node>
                <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631959">
                  <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247631960">
          <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631961">
            <link role="3.variableDeclaration:3" targetNodeId="4707157387247631927" resolveInfo="structuralChanges" />
          </node>
          <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247631962">
            <property name="1.name:0" value="structuralChange" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631963">
              <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
            </node>
          </node>
          <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631964">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247631965">
              <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247631966">
                <property name="1.name:0" value="nodeId" />
                <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631967">
                  <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
                </node>
                <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631968">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631969">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247631962" resolveInfo="structuralChange" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631970">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247556975" resolveInfo="getAffectedNodeId" />
                  </node>
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247631971">
              <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247631972">
                <property name="1.name:0" value="sameChange" />
                <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631973">
                  <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
                </node>
                <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631974">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631975">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247631952" resolveInfo="nodeIdToChangeMap" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631976">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Map.get(java.lang.Object):java.lang.Object" />
                    <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631977">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247631966" resolveInfo="nodeId" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247631978">
              <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="4707157387247631979">
                <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631980">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247631972" resolveInfo="sameChange" />
                </node>
                <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4707157387247631981" />
              </node>
              <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631982">
                <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247631983">
                  <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.AndExpression:3" id="4707157387247631984">
                    <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.InstanceOfExpression:3" id="4707157387247631985">
                      <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631986">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247631962" resolveInfo="structuralChange" />
                      </node>
                      <node role="3.classType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631987">
                        <link role="3.classifier:3" targetNodeId="14.4707157387247557317" resolveInfo="DeleteNodeChange" />
                      </node>
                    </node>
                    <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.InstanceOfExpression:3" id="4707157387247631988">
                      <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631989">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247631972" resolveInfo="sameChange" />
                      </node>
                      <node role="3.classType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247631990">
                        <link role="3.classifier:3" targetNodeId="14.4707157387247557317" resolveInfo="DeleteNodeChange" />
                      </node>
                    </node>
                  </node>
                  <node role="3.ifFalseStatement:3" type="jetbrains.mps.baseLanguage.structure.BlockStatement:3" id="4707157387247631991">
                    <node role="3.statements:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631992">
                      <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.AssertStatement:3" id="4707157387247631993">
                        <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="4707157387247631994" />
                      </node>
                    </node>
                  </node>
                  <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247631995" />
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247631996">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247631997">
                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247631998">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247631952" resolveInfo="nodeIdToChangeMap" />
                </node>
                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247631999">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Map.put(java.lang.Object,java.lang.Object):java.lang.Object" />
                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247632000">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247631966" resolveInfo="nodeId" />
                  </node>
                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247632001">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247631962" resolveInfo="structuralChange" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247632002">
          <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247632003">
            <property name="1.name:0" value="alreadyApplied" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632004">
              <link role="3.classifier:3" targetNodeId="4.~Set" />
              <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632005">
                <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
              </node>
            </node>
            <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247632006">
              <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247632007">
                <link role="3.baseMethodDeclaration:3" targetNodeId="4.~HashSet.&lt;init&gt;()" />
                <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632008">
                  <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247632009">
          <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247632010">
            <link role="3.variableDeclaration:3" targetNodeId="4707157387247631927" resolveInfo="structuralChanges" />
          </node>
          <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247632011">
            <property name="1.name:0" value="change" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632012">
              <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
            </node>
          </node>
          <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247632013">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247632014">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247632015">
                <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247632070" resolveInfo="applyStructurualChange" />
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247632016">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247631952" resolveInfo="nodeIdToChangeMap" />
                </node>
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247632017">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247632003" resolveInfo="alreadyApplied" />
                </node>
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247632018">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247632011" resolveInfo="change" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247632019">
      <property name="1.name:0" value="getRealDependencies" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247632020" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632021">
        <link role="3.classifier:3" targetNodeId="4.~List" />
        <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632022">
          <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
        </node>
      </node>
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247632023">
        <property name="1.name:0" value="nodeIdToChangeMap" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632024">
          <link role="3.classifier:3" targetNodeId="4.~Map" />
          <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632025">
            <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
          </node>
          <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632026">
            <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
          </node>
        </node>
      </node>
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247632027">
        <property name="1.name:0" value="change" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632028">
          <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247632029">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247632030">
          <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.InstanceOfExpression:3" id="4707157387247632031">
            <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247632032">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247632027" resolveInfo="change" />
            </node>
            <node role="3.classType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632033">
              <link role="3.classifier:3" targetNodeId="14.4707157387247557317" resolveInfo="DeleteNodeChange" />
            </node>
          </node>
          <node role="3.ifFalseStatement:3" type="jetbrains.mps.baseLanguage.structure.BlockStatement:3" id="4707157387247632034">
            <node role="3.statements:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247632035">
              <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247632036">
                <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247632037">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247632038">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247632027" resolveInfo="change" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247632039">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247556985" resolveInfo="getDependencies" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247632040">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247632041">
              <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247632042">
                <property name="1.name:0" value="result" />
                <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632043">
                  <link role="3.classifier:3" targetNodeId="4.~ArrayList" />
                  <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632044">
                    <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
                  </node>
                </node>
                <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247632045">
                  <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247632046">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="4.~ArrayList.&lt;init&gt;()" />
                    <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632047">
                      <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247632048">
              <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247632049">
                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247632050">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247632027" resolveInfo="change" />
                </node>
                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247632051">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247556985" resolveInfo="getDependencies" />
                </node>
              </node>
              <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247632052">
                <property name="1.name:0" value="nodeId" />
                <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632053">
                  <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
                </node>
              </node>
              <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247632054">
                <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247632055">
                  <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.InstanceOfExpression:3" id="4707157387247632056">
                    <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247632057">
                      <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247632058">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247632023" resolveInfo="nodeIdToChangeMap" />
                      </node>
                      <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247632059">
                        <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Map.get(java.lang.Object):java.lang.Object" />
                        <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247632060">
                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247632052" resolveInfo="nodeId" />
                        </node>
                      </node>
                    </node>
                    <node role="3.classType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632061">
                      <link role="3.classifier:3" targetNodeId="14.4707157387247557317" resolveInfo="DeleteNodeChange" />
                    </node>
                  </node>
                  <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247632062">
                    <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247632063">
                      <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247632064">
                        <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247632065">
                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247632042" resolveInfo="result" />
                        </node>
                        <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247632066">
                          <link role="3.baseMethodDeclaration:3" targetNodeId="4.~ArrayList.add(java.lang.Object):boolean" />
                          <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247632067">
                            <link role="3.variableDeclaration:3" targetNodeId="4707157387247632052" resolveInfo="nodeId" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247632068">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247632069">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247632042" resolveInfo="result" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247632070">
      <property name="1.name:0" value="applyStructurualChange" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247632071" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="4707157387247632072" />
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247632073">
        <property name="1.name:0" value="nodeIdToChangeMap" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632074">
          <link role="3.classifier:3" targetNodeId="4.~Map" />
          <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632075">
            <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
          </node>
          <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632076">
            <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
          </node>
        </node>
      </node>
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247632077">
        <property name="1.name:0" value="alreadyApplied" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632078">
          <link role="3.classifier:3" targetNodeId="4.~Set" />
          <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632079">
            <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
          </node>
        </node>
      </node>
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247632080">
        <property name="1.name:0" value="change" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632081">
          <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247632082">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247632083">
          <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.AndExpression:3" id="4707157387247632084">
            <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247632085">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630753" resolveInfo="myPreviewMode" />
            </node>
            <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NotExpression:3" id="4707157387247632086">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247632087">
                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247632088">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630714" resolveInfo="myAppliedChanges" />
                </node>
                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247632089">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Set.contains(java.lang.Object):boolean" />
                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247632090">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247632080" resolveInfo="change" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247632091">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247632092">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="4707157387247632093" />
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247632094">
          <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.OrExpression:3" id="4707157387247632095">
            <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247632096">
              <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247632097">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247630707" resolveInfo="myExcludedChanges" />
              </node>
              <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247632098">
                <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Set.contains(java.lang.Object):boolean" />
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247632099">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247632080" resolveInfo="change" />
                </node>
              </node>
            </node>
            <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247632100">
              <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247632157" resolveInfo="isChangeUnresolved" />
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247632101">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247632080" resolveInfo="change" />
              </node>
            </node>
          </node>
          <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247632102">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247632103">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="4707157387247632104" />
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247632105">
          <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247632106">
            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247632107">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247632077" resolveInfo="alreadyApplied" />
            </node>
            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247632108">
              <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Set.contains(java.lang.Object):boolean" />
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247632109">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247632080" resolveInfo="change" />
              </node>
            </node>
          </node>
          <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247632110">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247632111">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="4707157387247632112">
                <property name="3.value:3" value="true" />
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247632113">
          <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247632114">
            <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247632019" resolveInfo="getRealDependencies" />
            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247632115">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247632073" resolveInfo="nodeIdToChangeMap" />
            </node>
            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247632116">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247632080" resolveInfo="change" />
            </node>
          </node>
          <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247632117">
            <property name="1.name:0" value="dependency" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632118">
              <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
            </node>
          </node>
          <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247632119">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247632120">
              <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.NotExpression:3" id="4707157387247632121">
                <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247632122">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247632123">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247632073" resolveInfo="nodeIdToChangeMap" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247632124">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Map.containsKey(java.lang.Object):boolean" />
                    <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247632125">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247632117" resolveInfo="dependency" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247632126">
                <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ContinueStatement:3" id="4707157387247632127" />
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247632128">
              <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.NotExpression:3" id="4707157387247632129">
                <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247632130">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247632070" resolveInfo="applyStructurualChange" />
                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247632131">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247632073" resolveInfo="nodeIdToChangeMap" />
                  </node>
                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247632132">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247632077" resolveInfo="alreadyApplied" />
                  </node>
                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247632133">
                    <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247632134">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247632073" resolveInfo="nodeIdToChangeMap" />
                    </node>
                    <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247632135">
                      <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Map.get(java.lang.Object):java.lang.Object" />
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247632136">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247632117" resolveInfo="dependency" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247632137">
                <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247632138">
                  <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="4707157387247632139" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247632140">
          <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247632141">
            <property name="1.name:0" value="applied" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="4707157387247632142" />
            <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247632143">
              <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247632144">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247632080" resolveInfo="change" />
              </node>
              <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247632145">
                <link role="3.baseMethodDeclaration:3" targetNodeId="14.4707157387247556979" resolveInfo="apply" />
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247632146">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247630687" resolveInfo="myResultModel" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247632147">
          <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247632148">
            <link role="3.variableDeclaration:3" targetNodeId="4707157387247632141" resolveInfo="applied" />
          </node>
          <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247632149">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247632150">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247632151">
                <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247632152">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247632077" resolveInfo="alreadyApplied" />
                </node>
                <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247632153">
                  <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Set.add(java.lang.Object):boolean" />
                  <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247632154">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247632080" resolveInfo="change" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247632155">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247632156">
            <link role="3.variableDeclaration:3" targetNodeId="4707157387247632141" resolveInfo="applied" />
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247632157">
      <property name="1.name:0" value="isChangeUnresolved" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247632158" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="4707157387247632159" />
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247632160">
        <property name="1.name:0" value="ch" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632161">
          <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247632162">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247632163">
          <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247632164">
            <link role="3.variableDeclaration:3" targetNodeId="4707157387247630753" resolveInfo="myPreviewMode" />
          </node>
          <node role="3.ifFalseStatement:3" type="jetbrains.mps.baseLanguage.structure.BlockStatement:3" id="4707157387247632165">
            <node role="3.statements:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247632166">
              <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247632167">
                <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.AndExpression:3" id="4707157387247632168">
                  <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.AndExpression:3" id="4707157387247632169">
                    <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247632170">
                      <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247632171">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247630739" resolveInfo="myConflictingChanges" />
                      </node>
                      <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247632172">
                        <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Set.contains(java.lang.Object):boolean" />
                        <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247632173">
                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247632160" resolveInfo="ch" />
                        </node>
                      </node>
                    </node>
                    <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247632174">
                      <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247632175">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247630735" resolveInfo="myUnresolvedConflictingChanges" />
                      </node>
                      <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247632176">
                        <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Set.contains(java.lang.Object):boolean" />
                        <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247632177">
                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247632160" resolveInfo="ch" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247632178">
                    <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247632179">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247630703" resolveInfo="myBaseRepoChanges" />
                    </node>
                    <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247632180">
                      <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.contains(java.lang.Object):boolean" />
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247632181">
                        <link role="3.variableDeclaration:3" targetNodeId="4707157387247632160" resolveInfo="ch" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247632182">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247632183">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.AndExpression:3" id="4707157387247632184">
                <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247632185">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247632186">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247630739" resolveInfo="myConflictingChanges" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247632187">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Set.contains(java.lang.Object):boolean" />
                    <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247632188">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247632160" resolveInfo="ch" />
                    </node>
                  </node>
                </node>
                <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247632189">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247632190">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247630735" resolveInfo="myUnresolvedConflictingChanges" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247632191">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Set.contains(java.lang.Object):boolean" />
                    <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247632192">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247632160" resolveInfo="ch" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247632193">
      <property name="1.name:0" value="isResolved" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4707157387247632194" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="4707157387247632195" />
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247632196">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247632197">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247632198">
            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247632199">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630735" resolveInfo="myUnresolvedConflictingChanges" />
            </node>
            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247632200">
              <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Set.isEmpty():boolean" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247632201">
      <property name="1.name:0" value="isMine" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4707157387247632202" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="4707157387247632203" />
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247632204">
        <property name="1.name:0" value="change" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632205">
          <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247632206">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247632207">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247632208">
            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247632209">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630690" resolveInfo="myBaseMineChanges" />
            </node>
            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247632210">
              <link role="3.baseMethodDeclaration:3" targetNodeId="4.~List.contains(java.lang.Object):boolean" />
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247632211">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247632204" resolveInfo="change" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247632212">
      <property name="1.name:0" value="setPreviewMode" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4707157387247632213" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="4707157387247632214" />
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247632215">
        <property name="1.name:0" value="b" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="4707157387247632216" />
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247632217">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247632218">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="4707157387247632219">
            <node role="3.lValue:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247632220">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247630753" resolveInfo="myPreviewMode" />
            </node>
            <node role="3.rValue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247632221">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247632215" resolveInfo="b" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247632222">
      <property name="1.name:0" value="getAppliedChanges" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4707157387247632223" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632224">
        <link role="3.classifier:3" targetNodeId="4.~Set" />
        <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632225">
          <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247632226">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247632227">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247632228">
            <link role="3.variableDeclaration:3" targetNodeId="4707157387247630714" resolveInfo="myAppliedChanges" />
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247632229">
      <property name="1.name:0" value="getConflictedWith" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4707157387247632230" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632231">
        <link role="3.classifier:3" targetNodeId="4.~Set" />
        <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632232">
          <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
        </node>
      </node>
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247632233">
        <property name="1.name:0" value="change" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632234">
          <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247632235">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4707157387247632236">
          <node role="3.localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247632237">
            <property name="1.name:0" value="result" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632238">
              <link role="3.classifier:3" targetNodeId="4.~Set" />
              <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632239">
                <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
              </node>
            </node>
            <node role="3.initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4707157387247632240">
              <node role="3.creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4707157387247632241">
                <link role="3.baseMethodDeclaration:3" targetNodeId="4.~HashSet.&lt;init&gt;()" />
                <node role="3.typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632242">
                  <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247632243">
          <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.NotExpression:3" id="4707157387247632244">
            <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247632245">
              <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247632246">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247630739" resolveInfo="myConflictingChanges" />
              </node>
              <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247632247">
                <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Set.contains(java.lang.Object):boolean" />
                <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247632248">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247632233" resolveInfo="change" />
                </node>
              </node>
            </node>
          </node>
          <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247632249">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247632250">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247632251">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247632237" resolveInfo="result" />
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4707157387247632252">
          <node role="3.iterable:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247632253">
            <link role="3.variableDeclaration:3" targetNodeId="4707157387247630721" resolveInfo="myConflicts" />
          </node>
          <node role="3.variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4707157387247632254">
            <property name="1.name:0" value="c" />
            <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632255">
              <link role="3.classifier:3" targetNodeId="4707157387247632367" resolveInfo="Conflict" />
            </node>
          </node>
          <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247632256">
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247632257">
              <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="4707157387247632258">
                <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247632259">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247632260">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247632254" resolveInfo="c" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247632261">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247632391" resolveInfo="getChange1" />
                  </node>
                </node>
                <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247632262">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247632233" resolveInfo="change" />
                </node>
              </node>
              <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247632263">
                <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247632264">
                  <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247632265">
                    <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247632266">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247632237" resolveInfo="result" />
                    </node>
                    <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247632267">
                      <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Set.add(java.lang.Object):boolean" />
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247632268">
                        <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247632269">
                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247632254" resolveInfo="c" />
                        </node>
                        <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247632270">
                          <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247632397" resolveInfo="getChange2" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247632271">
                  <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247632272">
                    <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247632273">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247632237" resolveInfo="result" />
                    </node>
                    <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247632274">
                      <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Set.addAll(java.util.Collection):boolean" />
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247632275">
                        <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247631017" resolveInfo="getChangeGroupOf" />
                        <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247632276">
                          <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247632277">
                            <link role="3.variableDeclaration:3" targetNodeId="4707157387247632254" resolveInfo="c" />
                          </node>
                          <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247632278">
                            <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247632397" resolveInfo="getChange2" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4707157387247632279">
              <node role="3.condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="4707157387247632280">
                <node role="3.leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247632281">
                  <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247632282">
                    <link role="3.variableDeclaration:3" targetNodeId="4707157387247632254" resolveInfo="c" />
                  </node>
                  <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247632283">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247632397" resolveInfo="getChange2" />
                  </node>
                </node>
                <node role="3.rightExpression:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247632284">
                  <link role="3.variableDeclaration:3" targetNodeId="4707157387247632233" resolveInfo="change" />
                </node>
              </node>
              <node role="3.ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247632285">
                <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247632286">
                  <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247632287">
                    <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247632288">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247632237" resolveInfo="result" />
                    </node>
                    <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247632289">
                      <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Set.add(java.lang.Object):boolean" />
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247632290">
                        <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247632291">
                          <link role="3.variableDeclaration:3" targetNodeId="4707157387247632254" resolveInfo="c" />
                        </node>
                        <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247632292">
                          <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247632391" resolveInfo="getChange1" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247632293">
                  <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247632294">
                    <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247632295">
                      <link role="3.variableDeclaration:3" targetNodeId="4707157387247632237" resolveInfo="result" />
                    </node>
                    <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247632296">
                      <link role="3.baseMethodDeclaration:3" targetNodeId="4.~Set.addAll(java.util.Collection):boolean" />
                      <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247632297">
                        <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247631017" resolveInfo="getChangeGroupOf" />
                        <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247632298">
                          <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247632299">
                            <link role="3.variableDeclaration:3" targetNodeId="4707157387247632254" resolveInfo="c" />
                          </node>
                          <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247632300">
                            <link role="3.baseMethodDeclaration:3" targetNodeId="4707157387247632391" resolveInfo="getChange1" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247632301">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4707157387247632302">
            <link role="3.variableDeclaration:3" targetNodeId="4707157387247632237" resolveInfo="result" />
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247632303">
      <property name="1.name:0" value="getUnresolvedConflictingChanges" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4707157387247632304" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632305">
        <link role="3.classifier:3" targetNodeId="4.~Set" />
        <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632306">
          <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247632307">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247632308">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247632309">
            <link role="3.variableDeclaration:3" targetNodeId="4707157387247630735" resolveInfo="myUnresolvedConflictingChanges" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="4707157387247632367">
    <property name="1.name:0" value="Conflict" />
    <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4707157387247632368" />
    <node role="3.field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="4707157387247632369">
      <property name="1.name:0" value="myChange1" />
      <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632370">
        <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
      </node>
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247632371" />
    </node>
    <node role="3.field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="4707157387247632372">
      <property name="1.name:0" value="myChange2" />
      <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632373">
        <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
      </node>
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247632374" />
    </node>
    <node role="3.constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="4707157387247632375">
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4707157387247632376" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="4707157387247632377" />
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247632378">
        <property name="1.name:0" value="change1" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632379">
          <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
        </node>
      </node>
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247632380">
        <property name="1.name:0" value="change2" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632381">
          <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247632382">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247632383">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="4707157387247632384">
            <node role="3.lValue:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247632385">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247632369" resolveInfo="myChange1" />
            </node>
            <node role="3.rValue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247632386">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247632378" resolveInfo="change1" />
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247632387">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="4707157387247632388">
            <node role="3.lValue:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247632389">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247632372" resolveInfo="myChange2" />
            </node>
            <node role="3.rValue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247632390">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247632380" resolveInfo="change2" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247632391">
      <property name="1.name:0" value="getChange1" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4707157387247632392" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632393">
        <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247632394">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247632395">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247632396">
            <link role="3.variableDeclaration:3" targetNodeId="4707157387247632369" resolveInfo="myChange1" />
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247632397">
      <property name="1.name:0" value="getChange2" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4707157387247632398" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632399">
        <link role="3.classifier:3" targetNodeId="14.4707157387247556966" resolveInfo="Change" />
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247632400">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247632401">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247632402">
            <link role="3.variableDeclaration:3" targetNodeId="4707157387247632372" resolveInfo="myChange2" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="4707157387247632403">
    <property name="1.name:0" value="Warning" />
    <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4707157387247632404" />
    <node role="3.field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="4707157387247632405">
      <property name="1.name:0" value="myId" />
      <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632406">
        <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
      </node>
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247632407" />
    </node>
    <node role="3.field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="4707157387247632408">
      <property name="1.name:0" value="myMessage" />
      <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632409">
        <link role="3.classifier:3" targetNodeId="2.~String" />
      </node>
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247632410" />
    </node>
    <node role="3.constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="4707157387247632411">
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4707157387247632412" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="4707157387247632413" />
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247632414">
        <property name="1.name:0" value="id" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632415">
          <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
        </node>
      </node>
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247632416">
        <property name="1.name:0" value="message" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632417">
          <link role="3.classifier:3" targetNodeId="2.~String" />
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247632418">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247632419">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="4707157387247632420">
            <node role="3.lValue:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247632421">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247632405" resolveInfo="myId" />
            </node>
            <node role="3.rValue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247632422">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247632414" resolveInfo="id" />
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247632423">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="4707157387247632424">
            <node role="3.lValue:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247632425">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247632408" resolveInfo="myMessage" />
            </node>
            <node role="3.rValue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247632426">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247632416" resolveInfo="message" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247632427">
      <property name="1.name:0" value="getId" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4707157387247632428" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632429">
        <link role="3.classifier:3" targetNodeId="21.~SNodeId" />
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247632430">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247632431">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247632432">
            <link role="3.variableDeclaration:3" targetNodeId="4707157387247632405" resolveInfo="myId" />
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247632433">
      <property name="1.name:0" value="getMessage" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4707157387247632434" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632435">
        <link role="3.classifier:3" targetNodeId="2.~String" />
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247632436">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247632437">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247632438">
            <link role="3.variableDeclaration:3" targetNodeId="4707157387247632408" resolveInfo="myMessage" />
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247632439">
      <property name="1.name:0" value="toString" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4707157387247632440" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632441">
        <link role="3.classifier:3" targetNodeId="2.~String" />
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247632442">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247632443">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247632444">
            <link role="3.variableDeclaration:3" targetNodeId="4707157387247632408" resolveInfo="myMessage" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="4707157387247632445">
    <property name="1.name:0" value="ModelMergeRequest" />
    <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4707157387247632446" />
    <node role="3.superclass:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632447">
      <link role="3.classifier:3" targetNodeId="23.~MergeRequestImpl" />
    </node>
    <node role="3.field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="4707157387247632448">
      <property name="3.isFinal:3" value="true" />
      <property name="1.name:0" value="myFile" />
      <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632449">
        <link role="3.classifier:3" targetNodeId="22.~VirtualFile" />
      </node>
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="4707157387247632450" />
    </node>
    <node role="3.constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="4707157387247632451">
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="4707157387247632452" />
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247632453">
        <property name="1.name:0" value="leftText" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632454">
          <link role="3.classifier:3" targetNodeId="2.~String" />
        </node>
      </node>
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247632455">
        <property name="1.name:0" value="rightText" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632456">
          <link role="3.classifier:3" targetNodeId="2.~String" />
        </node>
      </node>
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247632457">
        <property name="1.name:0" value="originalContent" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632458">
          <link role="3.classifier:3" targetNodeId="2.~String" />
        </node>
      </node>
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247632459">
        <property name="1.name:0" value="file" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632460">
          <link role="3.classifier:3" targetNodeId="22.~VirtualFile" />
        </node>
        <node role="3.annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="4707157387247632461">
          <link role="3.annotation:3" targetNodeId="13.~NotNull" />
        </node>
      </node>
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247632462">
        <property name="1.name:0" value="project" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632463">
          <link role="3.classifier:3" targetNodeId="25.~Project" />
        </node>
      </node>
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247632464">
        <property name="1.name:0" value="actionButtonPresentation" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632465">
          <link role="3.classifier:3" targetNodeId="15.~ActionButtonPresentation" />
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247632466">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.SuperConstructorInvocation:3" id="4707157387247632467">
          <link role="3.baseMethodDeclaration:3" targetNodeId="23.~MergeRequestImpl.&lt;init&gt;(java.lang.String,java.lang.String,java.lang.String,com.intellij.openapi.project.Project,com.intellij.openapi.diff.ActionButtonPresentation)" />
          <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247632468">
            <link role="3.variableDeclaration:3" targetNodeId="4707157387247632453" resolveInfo="leftText" />
          </node>
          <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247632469">
            <link role="3.variableDeclaration:3" targetNodeId="4707157387247632457" resolveInfo="originalContent" />
          </node>
          <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247632470">
            <link role="3.variableDeclaration:3" targetNodeId="4707157387247632455" resolveInfo="rightText" />
          </node>
          <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247632471">
            <link role="3.variableDeclaration:3" targetNodeId="4707157387247632462" resolveInfo="project" />
          </node>
          <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247632472">
            <link role="3.variableDeclaration:3" targetNodeId="4707157387247632464" resolveInfo="actionButtonPresentation" />
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247632473">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247632474">
            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="4707157387247632475">
              <link role="3.classConcept:3" targetNodeId="8.~ApplicationManager" />
              <link role="3.baseMethodDeclaration:3" targetNodeId="8.~ApplicationManager.getApplication():com.intellij.openapi.application.Application" />
            </node>
            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247632476">
              <link role="3.baseMethodDeclaration:3" targetNodeId="8.~Application.saveAll():void" />
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247632477">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="4707157387247632478">
            <node role="3.lValue:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247632479">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247632448" resolveInfo="myFile" />
            </node>
            <node role="3.rValue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247632480">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247632459" resolveInfo="file" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247632481">
      <property name="1.name:0" value="getFile" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4707157387247632482" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632483">
        <link role="3.classifier:3" targetNodeId="22.~VirtualFile" />
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247632484">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4707157387247632485">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247632486">
            <link role="3.variableDeclaration:3" targetNodeId="4707157387247632448" resolveInfo="myFile" />
          </node>
        </node>
      </node>
      <node role="3.annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="4707157387247632487">
        <link role="3.annotation:3" targetNodeId="13.~NotNull" />
      </node>
    </node>
    <node role="3.method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4707157387247632488">
      <property name="1.name:0" value="resolved" />
      <node role="3.visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4707157387247632489" />
      <node role="3.returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="4707157387247632490" />
      <node role="3.parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4707157387247632491">
        <property name="1.name:0" value="result" />
        <property name="3.isFinal:3" value="true" />
        <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ArrayType:3" id="4707157387247632492">
          <node role="3.componentType:3" type="jetbrains.mps.baseLanguage.structure.ByteType:3" id="4707157387247632493" />
        </node>
      </node>
      <node role="3.body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4707157387247632494">
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247632495">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4707157387247632496">
            <node role="3.operand:3" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression:3" id="4707157387247632497">
              <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.CastExpression:3" id="4707157387247632498">
                <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression:3" id="4707157387247632499">
                  <node role="3.array:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247632500">
                    <link role="3.baseMethodDeclaration:3" targetNodeId="23.~MergeRequestImpl.getContents():com.intellij.openapi.diff.DiffContent[]" />
                  </node>
                  <node role="3.index:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference:3" id="4707157387247632501">
                    <link role="3.classifier:3" targetNodeId="12.~ModelMergeRequestConstants" />
                    <link role="3.variableDeclaration:3" targetNodeId="12.~ModelMergeRequestConstants.ORIGINAL" />
                  </node>
                </node>
                <node role="3.type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4707157387247632502">
                  <link role="3.classifier:3" targetNodeId="15.~SimpleContent" />
                </node>
              </node>
            </node>
            <node role="3.operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4707157387247632503">
              <link role="3.baseMethodDeclaration:3" targetNodeId="15.~SimpleContent.setBOM(byte[]):void" />
              <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247632504">
                <link role="3.variableDeclaration:3" targetNodeId="4707157387247632491" resolveInfo="result" />
              </node>
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247632505">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4707157387247632506">
            <link role="3.baseMethodDeclaration:3" targetNodeId="23.~MergeRequestImpl.setResult(int):void" />
            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference:3" id="4707157387247632507">
              <link role="3.classifier:3" targetNodeId="5.~DialogWrapper" />
              <link role="3.variableDeclaration:3" targetNodeId="5.~DialogWrapper.OK_EXIT_CODE" />
            </node>
          </node>
        </node>
        <node role="3.statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4707157387247632508">
          <node role="3.expression:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="4707157387247632509">
            <link role="3.classConcept:3" targetNodeId="27.3613324658897713898" resolveInfo="ModelUtils" />
            <link role="3.baseMethodDeclaration:3" targetNodeId="27.3613324658897713963" resolveInfo="replaceWithNewModelFromBytes" />
            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4707157387247632510">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247632448" resolveInfo="myFile" />
            </node>
            <node role="3.actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4707157387247632511">
              <link role="3.variableDeclaration:3" targetNodeId="4707157387247632491" resolveInfo="result" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

