<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:83748538-cbc9-4e2d-b0e1-e282b3d0c13d(jetbrains.mps.smodel.persistence.def.v6)">
  <persistence version="5" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="a8fdde77-2e6c-41f6-ac79-8e9b6449c271(jetbrains.mps.xmlQuery)" />
  <language namespace="760a0a8c-eabb-4521-8bfd-65db761a9ba3(jetbrains.mps.baseLanguage.logging)" />
  <language namespace="83888646-71ce-4f1c-9c53-c54016f6ad4f(jetbrains.mps.baseLanguage.collections)" />
  <languageAspect modelUID="r:bd6e2c7d-3a5d-4eed-9ff9-27f23ecb34e2(jetbrains.mps.xmlQuery.structure)" version="4" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959057f(jetbrains.mps.baseLanguage.logging.structure)" version="0" />
  <languageAspect modelUID="r:83748538-cbc9-4e2d-b0e1-e282b3d0c13d(jetbrains.mps.smodel.persistence.def.v6)" version="-1" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959032e(jetbrains.mps.baseLanguage.collections.structure)" version="7" />
  <maxImportIndex value="57" />
  <import index="1" modelUID="f:java_stub#jetbrains.mps.smodel.persistence.def(jetbrains.mps.smodel.persistence.def@java_stub)" version="-1" />
  <import index="3" modelUID="f:java_stub#java.lang(java.lang@java_stub)" version="-1" />
  <import index="4" modelUID="f:java_stub#jetbrains.mps.project.structure.modules(jetbrains.mps.project.structure.modules@java_stub)" version="-1" />
  <import index="5" modelUID="r:2cdd9596-2ed5-4152-b387-8144a1963c4c(jetbrains.mps.smodel.persistence.def.v5)" version="-1" />
  <import index="6" modelUID="f:java_stub#java.util(java.util@java_stub)" version="-1" />
  <import index="7" modelUID="f:java_stub#org.xml.sax(org.xml.sax@java_stub)" version="-1" />
  <import index="8" modelUID="f:java_stub#jetbrains.mps.smodel(jetbrains.mps.smodel@java_stub)" version="-1" />
  <import index="15" modelUID="f:java_stub#jetbrains.mps.smodel.persistence.def.v6(jetbrains.mps.smodel.persistence.def.v6@java_stub)" version="-1" />
  <import index="55" modelUID="f:java_stub#jetbrains.mps.util(jetbrains.mps.util@java_stub)" version="-1" />
  <import index="56" modelUID="f:java_stub#org.apache.commons.lang(org.apache.commons.lang@java_stub)" version="-1" />
  <import index="57" modelUID="f:java_stub#java.io(java.io@java_stub)" version="-1" />
  <node type="jetbrains.mps.xmlQuery.structure.XMLSAXParser:4" id="7319439566871678351">
    <property name="name:4" value="ModelReader6" />
    <link role="root:4" targetNodeId="7319439566871678361" resolveInfo="model" />
    <node role="fields:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXFieldDeclaration:4" id="7319439566871678359">
      <property name="name:4" value="model" />
      <node role="type:4" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="7319439566871678360">
        <link role="classifier:3" targetNodeId="8.~SModel" resolveInfo="SModel" />
      </node>
    </node>
    <node role="fields:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXFieldDeclaration:4" id="8991412067520654781">
      <property name="name:4" value="helper" />
      <node role="type:4" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="8991412067520654783">
        <link role="classifier:3" targetNodeId="15.~VersionUtil" resolveInfo="VersionUtil" />
      </node>
    </node>
    <node role="fields:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXFieldDeclaration:4" id="7535955628554243884">
      <property name="name:4" value="nodeIdStack" />
      <node role="type:4" type="jetbrains.mps.baseLanguage.collections.structure.StackType:7" id="7535955628554243885">
        <node role="elementType:7" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="7535955628554243886">
          <link role="classifier:3" targetNodeId="8.~SNodeId" resolveInfo="SNodeId" />
        </node>
      </node>
    </node>
    <node role="fields:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXFieldDeclaration:4" id="3440568815089790411">
      <property name="name:4" value="lineToIdMap" />
      <node role="type:4" type="jetbrains.mps.baseLanguage.collections.structure.ListType:7" id="1586605412047026018">
        <node role="elementType:7" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="1586605412047026020">
          <link role="classifier:3" targetNodeId="8.~SNodeId" resolveInfo="SNodeId" />
        </node>
      </node>
    </node>
    <node role="fields:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXFieldDeclaration:4" id="4238874031540120256">
      <property name="name:4" value="nodeEnded" />
      <node role="type:4" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="4238874031540120258" />
    </node>
    <node role="nodes:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXNodeRule:4" id="7319439566871678361">
      <property name="name:4" value="model" />
      <property name="tagName:4" value="model" />
      <node role="attrs:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXAttributeRule:4" id="7319439566871678362">
        <property name="name:4" value="modelUID" />
        <property name="isRequired:4" value="true" />
      </node>
      <node role="children:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXChildRule:4" id="7319439566871678364">
        <link role="rule:4" targetNodeId="7319439566871678522" resolveInfo="persistence" />
      </node>
      <node role="children:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXChildRule:4" id="7319439566871678400">
        <property name="tagName:4" value="language" />
        <link role="rule:4" targetNodeId="7319439566871678551" resolveInfo="tag_with_namespace" />
        <node role="handler:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXChildHandler:4" id="7319439566871678401">
          <node role="body:4" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="7319439566871678402">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="7319439566871678403">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="7319439566871678404">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="3440568815089790449">
                  <node role="operand:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXHandler_resultObject:4" id="7319439566871678405" />
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="3440568815089790453">
                    <link role="fieldDeclaration:3" targetNodeId="55.~Pair.o1" resolveInfo="o1" />
                  </node>
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="7319439566871678406">
                  <link role="baseMethodDeclaration:3" targetNodeId="8.~SModel.addLanguage(jetbrains.mps.project.structure.modules.ModuleReference):void" resolveInfo="addLanguage" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="7319439566871678407">
                    <link role="classConcept:3" targetNodeId="4.~ModuleReference" resolveInfo="ModuleReference" />
                    <link role="baseMethodDeclaration:3" targetNodeId="4.~ModuleReference.fromString(java.lang.String):jetbrains.mps.project.structure.modules.ModuleReference" resolveInfo="fromString" />
                    <node role="actualArgument:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXChildHandler_childObject:4" id="7319439566871678408" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="children:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXChildRule:4" id="7319439566871678409">
        <property name="tagName:4" value="language-engaged-on-generation" />
        <link role="rule:4" targetNodeId="7319439566871678551" resolveInfo="tag_with_namespace" />
        <node role="handler:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXChildHandler:4" id="7319439566871678410">
          <node role="body:4" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="7319439566871678411">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="7319439566871678412">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="7319439566871678413">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="3440568815089790454">
                  <node role="operand:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXHandler_resultObject:4" id="7319439566871678414" />
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="3440568815089790458">
                    <link role="fieldDeclaration:3" targetNodeId="55.~Pair.o1" resolveInfo="o1" />
                  </node>
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="7319439566871678415">
                  <link role="baseMethodDeclaration:3" targetNodeId="8.~SModel.addEngagedOnGenerationLanguage(jetbrains.mps.project.structure.modules.ModuleReference):void" resolveInfo="addEngagedOnGenerationLanguage" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="7319439566871678416">
                    <link role="classConcept:3" targetNodeId="4.~ModuleReference" resolveInfo="ModuleReference" />
                    <link role="baseMethodDeclaration:3" targetNodeId="4.~ModuleReference.fromString(java.lang.String):jetbrains.mps.project.structure.modules.ModuleReference" resolveInfo="fromString" />
                    <node role="actualArgument:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXChildHandler_childObject:4" id="7319439566871678417" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="children:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXChildRule:4" id="7319439566871678418">
        <property name="tagName:4" value="devkit" />
        <link role="rule:4" targetNodeId="7319439566871678551" resolveInfo="tag_with_namespace" />
        <node role="handler:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXChildHandler:4" id="7319439566871678419">
          <node role="body:4" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="7319439566871678420">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="7319439566871678421">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="7319439566871678422">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="3440568815089790459">
                  <node role="operand:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXHandler_resultObject:4" id="7319439566871678423" />
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="3440568815089790463">
                    <link role="fieldDeclaration:3" targetNodeId="55.~Pair.o1" resolveInfo="o1" />
                  </node>
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="7319439566871678424">
                  <link role="baseMethodDeclaration:3" targetNodeId="8.~SModel.addDevKit(jetbrains.mps.project.structure.modules.ModuleReference):void" resolveInfo="addDevKit" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="7319439566871678425">
                    <link role="baseMethodDeclaration:3" targetNodeId="4.~ModuleReference.fromString(java.lang.String):jetbrains.mps.project.structure.modules.ModuleReference" resolveInfo="fromString" />
                    <link role="classConcept:3" targetNodeId="4.~ModuleReference" resolveInfo="ModuleReference" />
                    <node role="actualArgument:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXChildHandler_childObject:4" id="7319439566871678426" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="children:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXChildRule:4" id="7319439566871678427">
        <link role="rule:4" targetNodeId="7319439566871678558" resolveInfo="import" />
        <node role="handler:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXChildHandler:4" id="7319439566871678428">
          <node role="body:4" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="7319439566871678429">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="7089291479286711585">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="7089291479286711587">
                <node role="operand:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXFieldReference:4" id="7089291479286711586">
                  <link role="declaration:4" targetNodeId="8991412067520654781" resolveInfo="helper" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="7089291479286711591">
                  <link role="baseMethodDeclaration:3" targetNodeId="15.~VersionUtil.addImport(jetbrains.mps.smodel.SModel,java.lang.String,java.lang.String,int,boolean):void" resolveInfo="addImport" />
                  <node role="actualArgument:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXFieldReference:4" id="7089291479286711592">
                    <link role="declaration:4" targetNodeId="7319439566871678359" resolveInfo="model" />
                  </node>
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression:3" id="7089291479286711595">
                    <node role="index:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="7089291479286711598">
                      <property name="value:3" value="0" />
                    </node>
                    <node role="array:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXChildHandler_childObject:4" id="7089291479286711594" />
                  </node>
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression:3" id="7089291479286711601">
                    <node role="index:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="7089291479286711604">
                      <property name="value:3" value="1" />
                    </node>
                    <node role="array:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXChildHandler_childObject:4" id="7089291479286711600" />
                  </node>
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="7089291479286711607">
                    <link role="baseMethodDeclaration:3" targetNodeId="3.~Integer.parseInt(java.lang.String):int" resolveInfo="parseInt" />
                    <link role="classConcept:3" targetNodeId="3.~Integer" resolveInfo="Integer" />
                    <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression:3" id="7089291479286711609">
                      <node role="index:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="7089291479286711612">
                        <property name="value:3" value="2" />
                      </node>
                      <node role="array:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXChildHandler_childObject:4" id="7089291479286711608" />
                    </node>
                  </node>
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="7089291479286711619">
                    <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="7089291479286711622" />
                    <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression:3" id="7089291479286711615">
                      <node role="index:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="7089291479286711618">
                        <property name="value:3" value="3" />
                      </node>
                      <node role="array:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXChildHandler_childObject:4" id="7089291479286711614" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="children:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXChildRule:4" id="7319439566871678451">
        <link role="rule:4" targetNodeId="7319439566871678583" resolveInfo="node" />
        <node role="handler:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXChildHandler:4" id="7319439566871678452">
          <node role="body:4" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="7319439566871678453">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="7319439566871678454">
              <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="7319439566871678455">
                <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="7319439566871678456" />
                <node role="leftExpression:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXChildHandler_childObject:4" id="7319439566871678457" />
              </node>
              <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="7319439566871678458">
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="7319439566871678459">
                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="7319439566871678460">
                    <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="3440568815089790484">
                      <node role="operand:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXHandler_resultObject:4" id="7319439566871678461" />
                      <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="3440568815089790488">
                        <link role="fieldDeclaration:3" targetNodeId="55.~Pair.o1" resolveInfo="o1" />
                      </node>
                    </node>
                    <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="7319439566871678462">
                      <link role="baseMethodDeclaration:3" targetNodeId="8.~SModel.addRoot(jetbrains.mps.smodel.SNode):void" resolveInfo="addRoot" />
                      <node role="actualArgument:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXChildHandler_childObject:4" id="7319439566871678463" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="creator:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXNodeCreator:4" id="7319439566871678465">
        <node role="body:4" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="7319439566871678466">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="7535955628554243894">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="7535955628554243895">
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="7535955628554243896">
                <node role="creator:3" type="jetbrains.mps.baseLanguage.collections.structure.LinkedListCreator:7" id="7535955628554243897">
                  <node role="elementType:7" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="7535955628554243898">
                    <link role="classifier:3" targetNodeId="8.~SNodeId" resolveInfo="SNodeId" />
                  </node>
                </node>
              </node>
              <node role="lValue:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXFieldReference:4" id="7535955628554243899">
                <link role="declaration:4" targetNodeId="7535955628554243884" resolveInfo="nodeIdStack" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="1586605412047026028">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="1586605412047026029">
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="1586605412047026030">
                <node role="creator:3" type="jetbrains.mps.baseLanguage.collections.structure.ListCreatorWithInit:7" id="1586605412047026031">
                  <node role="elementType:7" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="1586605412047026032">
                    <link role="classifier:3" targetNodeId="8.~SNodeId" resolveInfo="SNodeId" />
                  </node>
                </node>
              </node>
              <node role="lValue:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXFieldReference:4" id="1586605412047026033">
                <link role="declaration:4" targetNodeId="3440568815089790411" resolveInfo="lineToIdMap" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4238874031540120260">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="4238874031540120262">
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="4238874031540120265">
                <property name="value:3" value="false" />
              </node>
              <node role="lValue:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXFieldReference:4" id="4238874031540120261">
                <link role="declaration:4" targetNodeId="4238874031540120256" resolveInfo="nodeEnded" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="7319439566871678483">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="7319439566871678484">
              <node role="lValue:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXFieldReference:4" id="7319439566871678485">
                <link role="declaration:4" targetNodeId="7319439566871678359" resolveInfo="model" />
              </node>
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="7319439566871678486">
                <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="7319439566871678487">
                  <link role="baseMethodDeclaration:3" targetNodeId="8.~SModel.&lt;init&gt;(jetbrains.mps.smodel.SModelReference)" resolveInfo="SModel" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="7319439566871678488">
                    <link role="classConcept:3" targetNodeId="8.~SModelReference" resolveInfo="SModelReference" />
                    <link role="baseMethodDeclaration:3" targetNodeId="8.~SModelReference.fromString(java.lang.String):jetbrains.mps.smodel.SModelReference" resolveInfo="fromString" />
                    <node role="actualArgument:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXAttributeReference:4" id="7319439566871678489">
                      <link role="attribute:4" targetNodeId="7319439566871678362" resolveInfo="modelUID" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="7319439566871678490">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="7319439566871678491">
              <node role="operand:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXFieldReference:4" id="7319439566871678492">
                <link role="declaration:4" targetNodeId="7319439566871678359" resolveInfo="model" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="7319439566871678493">
                <link role="baseMethodDeclaration:3" targetNodeId="8.~SModel.setPersistenceVersion(int):void" resolveInfo="setPersistenceVersion" />
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="7319439566871683210">
                  <property name="value:3" value="6" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="7319439566871678495">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="7319439566871678496">
              <node role="operand:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXFieldReference:4" id="7319439566871678497">
                <link role="declaration:4" targetNodeId="7319439566871678359" resolveInfo="model" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="7319439566871678498">
                <link role="baseMethodDeclaration:3" targetNodeId="8.~SModel.setLoading(boolean):boolean" resolveInfo="setLoading" />
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="7319439566871678499">
                  <property name="value:3" value="true" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="8991412067520654786">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="8991412067520654788">
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="8991412067520654791">
                <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="8991412067520654793">
                  <link role="baseMethodDeclaration:3" targetNodeId="15.~VersionUtil.&lt;init&gt;(jetbrains.mps.smodel.SModelReference)" resolveInfo="VersionUtil" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4922846057374124435">
                    <node role="operand:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXFieldReference:4" id="8991412067520654794">
                      <link role="declaration:4" targetNodeId="7319439566871678359" resolveInfo="model" />
                    </node>
                    <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4922846057374125050">
                      <link role="baseMethodDeclaration:3" targetNodeId="8.~SModel.getSModelReference():jetbrains.mps.smodel.SModelReference" resolveInfo="getSModelReference" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="lValue:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXFieldReference:4" id="8991412067520654787">
                <link role="declaration:4" targetNodeId="8991412067520654781" resolveInfo="helper" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="1586605412047026034">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="1586605412047026035">
              <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="1586605412047026036">
                <link role="baseMethodDeclaration:3" targetNodeId="55.~Pair.&lt;init&gt;(java.lang.Object,java.lang.Object)" resolveInfo="Pair" />
                <node role="typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="1586605412047026037">
                  <link role="classifier:3" targetNodeId="8.~SModel" resolveInfo="SModel" />
                </node>
                <node role="typeParameter:3" type="jetbrains.mps.baseLanguage.collections.structure.ListType:7" id="1586605412047026038">
                  <node role="elementType:7" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="1586605412047026039">
                    <link role="classifier:3" targetNodeId="8.~SNodeId" resolveInfo="SNodeId" />
                  </node>
                </node>
                <node role="actualArgument:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXFieldReference:4" id="1586605412047026040">
                  <link role="declaration:4" targetNodeId="7319439566871678359" resolveInfo="model" />
                </node>
                <node role="actualArgument:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXFieldReference:4" id="1586605412047026041">
                  <link role="declaration:4" targetNodeId="3440568815089790411" resolveInfo="lineToIdMap" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="validator:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXNodeValidator:4" id="7319439566871678502">
        <node role="body:4" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="7319439566871678503">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="7319439566871678515">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="7319439566871678516">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="3440568815089790489">
                <node role="operand:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXHandler_resultObject:4" id="7319439566871678517" />
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="3440568815089790493">
                  <link role="fieldDeclaration:3" targetNodeId="55.~Pair.o1" resolveInfo="o1" />
                </node>
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="7319439566871678518">
                <link role="baseMethodDeclaration:3" targetNodeId="8.~SModel.setLoading(boolean):boolean" resolveInfo="setLoading" />
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="7319439566871678519">
                  <property name="value:3" value="false" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="7319439566871678520">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="7319439566871678521">
              <property name="value:3" value="true" />
            </node>
          </node>
        </node>
      </node>
      <node role="type:4" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="3440568815089790415">
        <link role="classifier:3" targetNodeId="55.~Pair" resolveInfo="Pair" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="3440568815089790416">
          <link role="classifier:3" targetNodeId="8.~SModel" resolveInfo="SModel" />
        </node>
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.collections.structure.ListType:7" id="1586605412047026052">
          <node role="elementType:7" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="1586605412047026054">
            <link role="classifier:3" targetNodeId="8.~SNodeId" resolveInfo="SNodeId" />
          </node>
        </node>
      </node>
    </node>
    <node role="nodes:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXNodeRule:4" id="7319439566871678522">
      <property name="name:4" value="persistence" />
      <property name="tagName:4" value="persistence" />
      <property name="isCompact:4" value="true" />
      <node role="attrs:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXAttributeRule:4" id="7319439566871678523">
        <property name="name:4" value="version" />
        <property name="isRequired:4" value="true" />
      </node>
      <node role="creator:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXNodeCreator:4" id="7319439566871678524">
        <node role="body:4" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="7319439566871678525">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="7319439566871678526">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="7319439566871678527">
              <link role="classConcept:3" targetNodeId="3.~Integer" resolveInfo="Integer" />
              <link role="baseMethodDeclaration:3" targetNodeId="3.~Integer.parseInt(java.lang.String):int" resolveInfo="parseInt" />
              <node role="actualArgument:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXAttributeReference:4" id="7319439566871678528">
                <link role="attribute:4" targetNodeId="7319439566871678523" resolveInfo="version" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="type:4" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="7319439566871678529">
        <link role="classifier:3" targetNodeId="3.~Integer" resolveInfo="Integer" />
      </node>
    </node>
    <node role="nodes:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXNodeRule:4" id="7319439566871678530">
      <property name="name:4" value="maxImportIndex" />
      <property name="tagName:4" value="maxImportIndex" />
      <property name="isCompact:4" value="true" />
      <node role="attrs:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXAttributeRule:4" id="7319439566871678531">
        <property name="isRequired:4" value="true" />
        <property name="name:4" value="value" />
      </node>
      <node role="type:4" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="7319439566871678532">
        <link role="classifier:3" targetNodeId="3.~Integer" resolveInfo="Integer" />
      </node>
      <node role="creator:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXNodeCreator:4" id="7319439566871678533">
        <node role="body:4" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="7319439566871678534">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="7319439566871678535">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="7319439566871678536">
              <link role="classConcept:3" targetNodeId="3.~Integer" resolveInfo="Integer" />
              <link role="baseMethodDeclaration:3" targetNodeId="3.~Integer.parseInt(java.lang.String):int" resolveInfo="parseInt" />
              <node role="actualArgument:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXAttributeReference:4" id="7319439566871678537">
                <link role="attribute:4" targetNodeId="7319439566871678531" resolveInfo="value" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="nodes:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXNodeRule:4" id="7319439566871678551">
      <property name="name:4" value="tag_with_namespace" />
      <property name="isCompact:4" value="true" />
      <node role="attrs:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXAttributeRule:4" id="7319439566871678552">
        <property name="name:4" value="namespace" />
        <property name="isRequired:4" value="true" />
      </node>
      <node role="type:4" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="7319439566871678553" />
      <node role="creator:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXNodeCreator:4" id="7319439566871678554">
        <node role="body:4" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="7319439566871678555">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="7319439566871678556">
            <node role="expression:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXAttributeReference:4" id="7319439566871678557">
              <link role="attribute:4" targetNodeId="7319439566871678552" resolveInfo="namespace" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="nodes:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXNodeRule:4" id="7319439566871678558">
      <property name="name:4" value="import" />
      <property name="tagName:4" value="import" />
      <property name="isCompact:4" value="true" />
      <node role="attrs:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXAttributeRule:4" id="7319439566871678559">
        <property name="name:4" value="index" />
        <property name="isRequired:4" value="true" />
      </node>
      <node role="attrs:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXAttributeRule:4" id="7319439566871678560">
        <property name="name:4" value="version" />
        <property name="isRequired:4" value="true" />
      </node>
      <node role="attrs:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXAttributeRule:4" id="7319439566871678561">
        <property name="name:4" value="modelUID" />
        <property name="isRequired:4" value="true" />
      </node>
      <node role="attrs:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXAttributeRule:4" id="7319439566871683191">
        <property name="name:4" value="implicit" />
        <node role="handler:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXAttributeHandler:4" id="7319439566871696860">
          <node role="body:4" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="7319439566871696861">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="7319439566871696862">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="7319439566871696868">
                <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression:3" id="7319439566871696864">
                  <node role="array:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXHandler_resultObject:4" id="7319439566871696863" />
                  <node role="index:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="7089291479286711580">
                    <property name="value:3" value="3" />
                  </node>
                </node>
                <node role="rValue:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXAttributeHandler_value:4" id="7089291479286711582" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="creator:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXNodeCreator:4" id="7319439566871678562">
        <node role="body:4" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="7319439566871678563">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="7089291479286711564">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="7089291479286711565">
              <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ArrayCreatorWithInitializer:3" id="7089291479286711571">
                <node role="componentType:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="7089291479286711570" />
                <node role="initValue:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXAttributeReference:4" id="7089291479286711573">
                  <link role="attribute:4" targetNodeId="7319439566871678559" resolveInfo="index" />
                </node>
                <node role="initValue:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXAttributeReference:4" id="7089291479286711575">
                  <link role="attribute:4" targetNodeId="7319439566871678561" resolveInfo="modelUID" />
                </node>
                <node role="initValue:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXAttributeReference:4" id="7089291479286711578">
                  <link role="attribute:4" targetNodeId="7319439566871678560" resolveInfo="version" />
                </node>
                <node role="initValue:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="7089291479286711579" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="type:4" type="jetbrains.mps.baseLanguage.structure.ArrayType:3" id="7319439566871683212">
        <node role="componentType:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="7089291479286711562" />
      </node>
    </node>
    <node role="nodes:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXNodeRule:4" id="7319439566871678583">
      <property name="name:4" value="node" />
      <property name="tagName:4" value="node" />
      <property name="isCompact:4" value="false" />
      <node role="children:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXChildRule:4" id="7319439566871678584">
        <link role="rule:4" targetNodeId="7319439566871678711" resolveInfo="property" />
        <node role="handler:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXChildHandler:4" id="7319439566871678585">
          <node role="body:4" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="7319439566871678586">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="7319439566871678587">
              <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="7319439566871678588">
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="7319439566871678589">
                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="7319439566871678590">
                    <node role="operand:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXHandler_resultObject:4" id="7319439566871678591" />
                    <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="7319439566871678592">
                      <link role="baseMethodDeclaration:3" targetNodeId="8.~SNode.setProperty(java.lang.String,java.lang.String):void" resolveInfo="setProperty" />
                      <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4922846057374104732">
                        <node role="operand:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXFieldReference:4" id="4922846057374104731">
                          <link role="declaration:4" targetNodeId="8991412067520654781" resolveInfo="helper" />
                        </node>
                        <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4922846057374104736">
                          <link role="baseMethodDeclaration:3" targetNodeId="15.~VersionUtil.readName(java.lang.String):java.lang.String" resolveInfo="readName" />
                          <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression:3" id="4922846057374104738">
                            <node role="index:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="4922846057374104741">
                              <property name="value:3" value="0" />
                            </node>
                            <node role="array:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXChildHandler_childObject:4" id="4922846057374104737" />
                          </node>
                        </node>
                      </node>
                      <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression:3" id="7319439566871678599">
                        <node role="index:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="7319439566871678600">
                          <property name="value:3" value="1" />
                        </node>
                        <node role="array:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXChildHandler_childObject:4" id="7319439566871678601" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="7319439566871678602">
                <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression:3" id="7319439566871678603">
                  <node role="index:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="7319439566871678604">
                    <property name="value:3" value="1" />
                  </node>
                  <node role="array:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXChildHandler_childObject:4" id="7319439566871678605" />
                </node>
                <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="7319439566871678606" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="children:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXChildRule:4" id="7319439566871678607">
        <link role="rule:4" targetNodeId="7319439566871678732" resolveInfo="link" />
        <node role="handler:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXChildHandler:4" id="7319439566871678608">
          <node role="body:4" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="7319439566871678609">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="212199194136557543">
              <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="212199194136557544">
                <node role="statement:3" type="jetbrains.mps.baseLanguage.logging.structure.LogStatement:0" id="212199194136557556">
                  <property name="severity:0" value="error" />
                  <node role="logExpression:0" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="212199194136557558">
                    <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="212199194136557559">
                      <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression:3" id="212199194136557560">
                        <node role="index:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="212199194136557561">
                          <property name="value:3" value="0" />
                        </node>
                        <node role="array:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXChildHandler_childObject:4" id="212199194136557562" />
                      </node>
                      <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="212199194136557563">
                        <property name="value:3" value="couldn't create reference '" />
                      </node>
                    </node>
                    <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="212199194136557564">
                      <property name="value:3" value="' : traget node id is null" />
                    </node>
                  </node>
                </node>
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="212199194136557566" />
              </node>
              <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="212199194136557552">
                <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="212199194136557555" />
                <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression:3" id="212199194136557548">
                  <node role="index:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="212199194136557551">
                    <property name="value:3" value="2" />
                  </node>
                  <node role="array:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXChildHandler_childObject:4" id="212199194136557547" />
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="2791660890086899466">
              <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="2791660890086899467">
                <property name="name:3" value="ref" />
                <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="2791660890086899468">
                  <link role="classifier:3" targetNodeId="8.~SReference" resolveInfo="SReference" />
                </node>
                <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="2791660890086899470">
                  <node role="operand:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXFieldReference:4" id="2791660890086899471">
                    <link role="declaration:4" targetNodeId="8991412067520654781" resolveInfo="helper" />
                  </node>
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="2791660890086899472">
                    <link role="baseMethodDeclaration:3" targetNodeId="15.~VersionUtil.readLink(jetbrains.mps.smodel.SNode,java.lang.String,java.lang.String,java.lang.String):jetbrains.mps.smodel.SReference" resolveInfo="readLink" />
                    <node role="actualArgument:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXHandler_resultObject:4" id="2791660890086899473" />
                    <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression:3" id="2791660890086899478">
                      <node role="index:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="2791660890086899481">
                        <property name="value:3" value="0" />
                      </node>
                      <node role="array:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXChildHandler_childObject:4" id="2791660890086899477" />
                    </node>
                    <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression:3" id="2791660890086899484">
                      <node role="index:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="2791660890086899487">
                        <property name="value:3" value="2" />
                      </node>
                      <node role="array:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXChildHandler_childObject:4" id="2791660890086899483" />
                    </node>
                    <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression:3" id="2791660890086899490">
                      <node role="index:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="2791660890086899493">
                        <property name="value:3" value="1" />
                      </node>
                      <node role="array:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXChildHandler_childObject:4" id="2791660890086899489" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="2791660890086899495">
              <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="2791660890086899496">
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="2791660890086899504">
                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="2791660890086899506">
                    <node role="operand:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXHandler_resultObject:4" id="2791660890086899505" />
                    <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="2791660890086899510">
                      <link role="baseMethodDeclaration:3" targetNodeId="8.~SNode.addReference(jetbrains.mps.smodel.SReference):void" resolveInfo="addReference" />
                      <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="2791660890086899511">
                        <link role="variableDeclaration:3" targetNodeId="2791660890086899467" resolveInfo="ref" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="2791660890086899500">
                <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="2791660890086899503" />
                <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="2791660890086899499">
                  <link role="variableDeclaration:3" targetNodeId="2791660890086899467" resolveInfo="ref" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="children:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXChildRule:4" id="7319439566871678636">
        <link role="rule:4" targetNodeId="7319439566871678583" resolveInfo="node" />
        <node role="handler:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXChildHandler:4" id="7319439566871678637">
          <node role="body:4" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="7319439566871678638">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="7319439566871678639">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="7319439566871678640">
                <node role="operand:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXHandler_resultObject:4" id="7319439566871678641" />
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="7319439566871678642">
                  <link role="baseMethodDeclaration:3" targetNodeId="8.~SNode.addChild(java.lang.String,jetbrains.mps.smodel.SNode):void" resolveInfo="addChild" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="7319439566871678643">
                    <node role="operand:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXChildHandler_childObject:4" id="7319439566871678644" />
                    <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="7319439566871678645">
                      <link role="baseMethodDeclaration:3" targetNodeId="8.~SNode.getRole_():java.lang.String" resolveInfo="getRole_" />
                    </node>
                  </node>
                  <node role="actualArgument:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXChildHandler_childObject:4" id="7319439566871678646" />
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4238874031540120267">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="4238874031540120269">
                <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="4238874031540120272">
                  <property name="value:3" value="true" />
                </node>
                <node role="lValue:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXFieldReference:4" id="4238874031540120268">
                  <link role="declaration:4" targetNodeId="4238874031540120256" resolveInfo="nodeEnded" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="attrs:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXAttributeRule:4" id="7319439566871678647">
        <property name="name:4" value="type" />
        <property name="isRequired:4" value="true" />
      </node>
      <node role="attrs:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXAttributeRule:4" id="7319439566871678648">
        <property name="name:4" value="role" />
        <node role="handler:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXAttributeHandler:4" id="7319439566871678649">
          <node role="body:4" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="7319439566871678650">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="7319439566871678651">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="7319439566871678652">
                <node role="operand:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXHandler_resultObject:4" id="7319439566871678653" />
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="7319439566871678654">
                  <link role="baseMethodDeclaration:3" targetNodeId="8.~SNode.setRoleInParent(java.lang.String):void" resolveInfo="setRoleInParent" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4922846057374104716">
                    <node role="operand:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXFieldReference:4" id="4922846057374104715">
                      <link role="declaration:4" targetNodeId="8991412067520654781" resolveInfo="helper" />
                    </node>
                    <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4922846057374104720">
                      <link role="baseMethodDeclaration:3" targetNodeId="15.~VersionUtil.readRole(java.lang.String):java.lang.String" resolveInfo="readRole" />
                      <node role="actualArgument:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXAttributeHandler_value:4" id="4922846057374104722" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="attrs:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXAttributeRule:4" id="7319439566871678662">
        <property name="name:4" value="id" />
        <node role="handler:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXAttributeHandler:4" id="7319439566871678663">
          <node role="body:4" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="7319439566871678664">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="7319439566871678665">
              <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="7319439566871678666">
                <property name="name:3" value="id" />
                <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="7319439566871678667">
                  <link role="classifier:3" targetNodeId="8.~SNodeId" resolveInfo="SNodeId" />
                </node>
                <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="7319439566871678668">
                  <link role="classConcept:3" targetNodeId="8.~SNodeId" resolveInfo="SNodeId" />
                  <link role="baseMethodDeclaration:3" targetNodeId="8.~SNodeId.fromString(java.lang.String):jetbrains.mps.smodel.SNodeId" resolveInfo="fromString" />
                  <node role="actualArgument:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXAttributeHandler_value:4" id="7319439566871678669" />
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="7319439566871678670">
              <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="7319439566871678671">
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ThrowStatement:3" id="7319439566871678672">
                  <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="7319439566871678673">
                    <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="7319439566871678674">
                      <link role="baseMethodDeclaration:3" targetNodeId="7.~SAXParseException.&lt;init&gt;(java.lang.String,org.xml.sax.Locator)" resolveInfo="SAXParseException" />
                      <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="7319439566871678675">
                        <property name="value:3" value="bad node ID" />
                      </node>
                      <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="7319439566871678676" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="7319439566871678677">
                <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="7319439566871678678" />
                <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="7319439566871678679">
                  <link role="variableDeclaration:3" targetNodeId="7319439566871678666" resolveInfo="id" />
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="1586605412047026056">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="7535955628554243935">
                <node role="operand:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXFieldReference:4" id="7535955628554243934">
                  <link role="declaration:4" targetNodeId="7535955628554243884" resolveInfo="nodeIdStack" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.collections.structure.PushOperation:7" id="7535955628554243939">
                  <node role="argument:7" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="7535955628554243941">
                    <link role="variableDeclaration:3" targetNodeId="7319439566871678666" resolveInfo="id" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="7319439566871678680">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="7319439566871678681">
                <node role="operand:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXHandler_resultObject:4" id="7319439566871678682" />
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="7319439566871678683">
                  <link role="baseMethodDeclaration:3" targetNodeId="8.~SNode.setId(jetbrains.mps.smodel.SNodeId):void" resolveInfo="setId" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="7319439566871678684">
                    <link role="variableDeclaration:3" targetNodeId="7319439566871678666" resolveInfo="id" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="type:4" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="7319439566871678685">
        <link role="classifier:3" targetNodeId="8.~SNode" resolveInfo="SNode" />
      </node>
      <node role="creator:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXNodeCreator:4" id="7319439566871678686">
        <node role="body:4" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="7319439566871678687">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="7319439566871683205">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="7319439566871683206">
              <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="7319439566871683207">
                <link role="baseMethodDeclaration:3" targetNodeId="8.~SNode.&lt;init&gt;(jetbrains.mps.smodel.SModel,java.lang.String)" resolveInfo="SNode" />
                <node role="actualArgument:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXFieldReference:4" id="7319439566871683208">
                  <link role="declaration:4" targetNodeId="7319439566871678359" resolveInfo="model" />
                </node>
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4922846057374104142">
                  <node role="operand:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXFieldReference:4" id="4922846057374104143">
                    <link role="declaration:4" targetNodeId="8991412067520654781" resolveInfo="helper" />
                  </node>
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4922846057374104144">
                    <link role="baseMethodDeclaration:3" targetNodeId="15.~VersionUtil.readType(java.lang.String):java.lang.String" resolveInfo="readType" />
                    <node role="actualArgument:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXAttributeReference:4" id="4922846057374104145">
                      <link role="attribute:4" targetNodeId="7319439566871678647" resolveInfo="type" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="nodes:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXNodeRule:4" id="7319439566871678711">
      <property name="name:4" value="property" />
      <property name="tagName:4" value="property" />
      <property name="isCompact:4" value="true" />
      <node role="attrs:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXAttributeRule:4" id="7319439566871678712">
        <property name="name:4" value="name" />
        <property name="isRequired:4" value="true" />
      </node>
      <node role="attrs:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXAttributeRule:4" id="7319439566871678713">
        <property name="name:4" value="value" />
        <node role="handler:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXAttributeHandler:4" id="7319439566871678714">
          <node role="body:4" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="7319439566871678715">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="7319439566871678716">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="7319439566871678717">
                <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression:3" id="7319439566871678718">
                  <node role="index:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="7319439566871678719">
                    <property name="value:3" value="1" />
                  </node>
                  <node role="array:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXHandler_resultObject:4" id="7319439566871678720" />
                </node>
                <node role="rValue:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXAttributeHandler_value:4" id="7319439566871678721" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="type:4" type="jetbrains.mps.baseLanguage.structure.ArrayType:3" id="7319439566871678722">
        <node role="componentType:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="7319439566871678723" />
      </node>
      <node role="creator:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXNodeCreator:4" id="7319439566871678724">
        <node role="body:4" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="7319439566871678725">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="7319439566871678726">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="7319439566871678727">
              <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ArrayCreatorWithInitializer:3" id="7319439566871678728">
                <node role="componentType:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="7319439566871678729" />
                <node role="initValue:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXAttributeReference:4" id="7319439566871678730">
                  <link role="attribute:4" targetNodeId="7319439566871678712" resolveInfo="name" />
                </node>
                <node role="initValue:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="7319439566871678731" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="nodes:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXNodeRule:4" id="7319439566871678732">
      <property name="name:4" value="link" />
      <property name="tagName:4" value="link" />
      <property name="isCompact:4" value="true" />
      <node role="attrs:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXAttributeRule:4" id="7319439566871678733">
        <property name="name:4" value="role" />
        <node role="handler:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXAttributeHandler:4" id="7319439566871678734">
          <node role="body:4" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="7319439566871678735">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="7319439566871678736">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="7319439566871678737">
                <node role="rValue:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXAttributeHandler_value:4" id="2791660890086899514" />
                <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression:3" id="7319439566871678739">
                  <node role="index:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="7319439566871678740">
                    <property name="value:3" value="0" />
                  </node>
                  <node role="array:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXHandler_resultObject:4" id="7319439566871678741" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="attrs:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXAttributeRule:4" id="7319439566871678742">
        <property name="name:4" value="resolveInfo" />
        <node role="handler:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXAttributeHandler:4" id="7319439566871678743">
          <node role="body:4" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="7319439566871678744">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="7319439566871678745">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="7319439566871678746">
                <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression:3" id="7319439566871678747">
                  <node role="index:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="7319439566871678748">
                    <property name="value:3" value="1" />
                  </node>
                  <node role="array:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXHandler_resultObject:4" id="7319439566871678749" />
                </node>
                <node role="rValue:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXAttributeHandler_value:4" id="7319439566871678750" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="attrs:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXAttributeRule:4" id="7319439566871678751">
        <property name="name:4" value="targetNodeId" />
        <node role="handler:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXAttributeHandler:4" id="7319439566871678752">
          <node role="body:4" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="7319439566871678753">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="7319439566871678754">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="7319439566871678755">
                <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression:3" id="7319439566871678756">
                  <node role="index:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="7319439566871678757">
                    <property name="value:3" value="2" />
                  </node>
                  <node role="array:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXHandler_resultObject:4" id="7319439566871678758" />
                </node>
                <node role="rValue:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXAttributeHandler_value:4" id="4922846057374127789" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="type:4" type="jetbrains.mps.baseLanguage.structure.ArrayType:3" id="7319439566871678760">
        <node role="componentType:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="7319439566871678761" />
      </node>
      <node role="creator:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXNodeCreator:4" id="7319439566871678762">
        <node role="body:4" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="7319439566871678763">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="7319439566871678764">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="7319439566871678765">
              <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ArrayCreatorWithInitializer:3" id="7319439566871678766">
                <node role="componentType:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="7319439566871678767" />
                <node role="initValue:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="7319439566871678768" />
                <node role="initValue:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="7319439566871678769" />
                <node role="initValue:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="7319439566871678770" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="globalText:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXTextRule:4" id="3440568815089790494">
      <node role="handler:4" type="jetbrains.mps.xmlQuery.structure.XMLSAXTextHandler:4" id="3440568815089790495">
        <node role="body:4" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="3440568815089790496">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ForStatement:3" id="7535955628554206944">
            <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="7535955628554206945">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="7535955628554206946">
                <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="7535955628554206947">
                  <property name="name:3" value="line" />
                  <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="7535955628554206948" />
                  <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.MinusExpression:3" id="7535955628554206949">
                    <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="7535955628554206950">
                      <property name="value:3" value="1" />
                    </node>
                    <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="7535955628554206951">
                      <node role="operand:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXLocatorExpression:4" id="7535955628554206952" />
                      <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="7535955628554206953">
                        <link role="baseMethodDeclaration:3" targetNodeId="7.~Locator.getLineNumber():int" resolveInfo="getLineNumber" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.WhileStatement:3" id="7535955628554206954">
                <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.GreaterThanExpression:3" id="7535955628554243959">
                  <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="7535955628554243960">
                    <link role="variableDeclaration:3" targetNodeId="7535955628554206947" resolveInfo="line" />
                  </node>
                  <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="7535955628554243961">
                    <node role="operand:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXFieldReference:4" id="7535955628554243962">
                      <link role="declaration:4" targetNodeId="3440568815089790411" resolveInfo="lineToIdMap" />
                    </node>
                    <node role="operation:3" type="jetbrains.mps.baseLanguage.collections.structure.GetSizeOperation:7" id="7535955628554243963" />
                  </node>
                </node>
                <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="7535955628554206960">
                  <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="7535955628554206961">
                    <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="7535955628554206962">
                      <node role="operand:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXFieldReference:4" id="7535955628554206963">
                        <link role="declaration:4" targetNodeId="3440568815089790411" resolveInfo="lineToIdMap" />
                      </node>
                      <node role="operation:3" type="jetbrains.mps.baseLanguage.collections.structure.AddLastElementOperation:7" id="7535955628554206964">
                        <node role="argument:7" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="7535955628554243943">
                          <node role="operand:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXFieldReference:4" id="7535955628554243942">
                            <link role="declaration:4" targetNodeId="7535955628554243884" resolveInfo="nodeIdStack" />
                          </node>
                          <node role="operation:3" type="jetbrains.mps.baseLanguage.collections.structure.PeekOperation:7" id="7535955628554243947" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4238874031540120245">
                    <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4238874031540120246">
                      <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4238874031540120247">
                        <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4238874031540120248">
                          <node role="operand:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXFieldReference:4" id="4238874031540120249">
                            <link role="declaration:4" targetNodeId="7535955628554243884" resolveInfo="nodeIdStack" />
                          </node>
                          <node role="operation:3" type="jetbrains.mps.baseLanguage.collections.structure.PopOperation:7" id="4238874031540120250" />
                        </node>
                      </node>
                      <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4238874031540120251">
                        <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="4238874031540120252">
                          <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="4238874031540120253">
                            <property name="value:3" value="false" />
                          </node>
                          <node role="lValue:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXFieldReference:4" id="4238874031540120254">
                            <link role="declaration:4" targetNodeId="4238874031540120256" resolveInfo="nodeEnded" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="condition:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXFieldReference:4" id="4238874031540120255">
                      <link role="declaration:4" targetNodeId="4238874031540120256" resolveInfo="nodeEnded" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="7535955628554206966">
              <property name="name:3" value="i" />
              <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="7535955628554206967" />
              <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="7535955628554206968">
                <property name="value:3" value="0" />
              </node>
            </node>
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.LessThanExpression:3" id="7535955628554206969">
              <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="7535955628554206970">
                <link role="baseMethodDeclaration:3" targetNodeId="56.~StringUtils.countMatches(java.lang.String,java.lang.String):int" resolveInfo="countMatches" />
                <link role="classConcept:3" targetNodeId="56.~StringUtils" resolveInfo="StringUtils" />
                <node role="actualArgument:3" type="jetbrains.mps.xmlQuery.structure.XMLSAXTextHandler_value:4" id="7535955628554206971" />
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="7535955628554206972">
                  <property name="value:3" value="\n" />
                </node>
              </node>
              <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="7535955628554206973">
                <link role="variableDeclaration:3" targetNodeId="7535955628554206966" resolveInfo="i" />
              </node>
            </node>
            <node role="iteration:3" type="jetbrains.mps.baseLanguage.structure.PostfixIncrementExpression:3" id="7535955628554206974">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="7535955628554206975">
                <link role="variableDeclaration:3" targetNodeId="7535955628554206966" resolveInfo="i" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

