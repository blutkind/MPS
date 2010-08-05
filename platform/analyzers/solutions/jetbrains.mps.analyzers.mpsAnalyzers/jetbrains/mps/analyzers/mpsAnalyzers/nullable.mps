<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:fc545d82-6d72-41b7-a7f1-93ef15402ef1(jetbrains.mps.analyzers.mpsAnalyzers.nullable)">
  <persistence version="4" />
  <refactoringHistory />
  <language namespace="97a52717-898f-4598-8150-573d9fd03868(jetbrains.mps.analyzers)" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="d4615e3b-d671-4ba9-af01-2b78369b0ba7(jetbrains.mps.lang.pattern)" />
  <language namespace="7866978e-a0f0-4cc7-81bc-4d213d9375e1(jetbrains.mps.lang.smodel)" />
  <language namespace="83888646-71ce-4f1c-9c53-c54016f6ad4f(jetbrains.mps.baseLanguage.collections)" />
  <language namespace="c72da2b9-7cce-4447-8389-f407dc1158b7(jetbrains.mps.lang.structure)" />
  <languageAspect modelUID="r:8b09f5e2-b403-4747-aaa3-eac5acb1f753(jetbrains.mps.analyzers.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902c1(jetbrains.mps.baseLanguage.constraints)" version="83" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902db(jetbrains.mps.baseLanguage.blTypes.constraints)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590283(jetbrains.mps.lang.core.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590345(jetbrains.mps.lang.pattern.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590340(jetbrains.mps.lang.pattern.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959033d(jetbrains.mps.lang.annotations.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902fb(jetbrains.mps.lang.smodel.constraints)" version="21" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.lang.smodel.structure)" version="16" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590334(jetbrains.mps.baseLanguage.closures.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590338(jetbrains.mps.baseLanguage.closures.structure)" version="3" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590328(jetbrains.mps.baseLanguage.collections.constraints)" version="6" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959032e(jetbrains.mps.baseLanguage.collections.structure)" version="7" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.lang.structure.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959028c(jetbrains.mps.lang.structure.constraints)" version="11" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959034b(jetbrains.mps.lang.quotation.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902ae(jetbrains.mps.lang.typesystem.constraints)" version="17" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902b4(jetbrains.mps.lang.typesystem.structure)" version="3" />
  <devkit namespace="2677cb18-f558-4e33-bc38-a5139cee06dc(jetbrains.mps.devkit.language-design)" />
  <maxImportIndex value="9" />
  <import index="2" modelUID="r:6fb1beb5-17d5-44c1-a541-c95672dc4233(jetbrains.mps.dataFlow.runtime)" version="-1" />
  <import index="3" modelUID="f:java_stub#jetbrains.mps.lang.dataFlow.framework(jetbrains.mps.lang.dataFlow.framework@java_stub)" version="-1" />
  <import index="4" modelUID="f:java_stub#java.util(java.util@java_stub)" version="-1" />
  <import index="5" modelUID="f:java_stub#jetbrains.mps.lang.dataFlow.framework.instructions(jetbrains.mps.lang.dataFlow.framework.instructions@java_stub)" version="-1" />
  <import index="7" modelUID="r:fc545d82-6d72-41b7-a7f1-93ef15402ef1(jetbrains.mps.analyzers.mpsAnalyzers.nullable)" version="-1" />
  <import index="8" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" />
  <import index="9" modelUID="f:java_stub#java.io(java.io@java_stub)" version="-1" />
  <node type="jetbrains.mps.analyzers.structure.Analyzer:0" id="1665527126811217298">
    <property name="name:0" value="Nullable" />
    <node role="ruleReference:0" type="jetbrains.mps.analyzers.structure.RuleReference:0" id="1936451686726661222">
      <link role="rule:0" targetNodeId="1936451686726656874" resolveInfo="RuleNotEqualsNull" />
    </node>
    <node role="ruleReference:0" type="jetbrains.mps.analyzers.structure.RuleReference:0" id="1936451686726661224">
      <link role="rule:0" targetNodeId="4072414341992373193" resolveInfo="RuleNullNotEquals" />
    </node>
    <node role="ruleReference:0" type="jetbrains.mps.analyzers.structure.RuleReference:0" id="3762983614228146800">
      <link role="rule:0" targetNodeId="3762983614228143038" resolveInfo="RuleNotEqualsNullAnd" />
    </node>
    <node role="ruleReference:0" type="jetbrains.mps.analyzers.structure.RuleReference:0" id="2581561496109682526">
      <link role="rule:0" targetNodeId="2581561496109679426" resolveInfo="RuleVoidIfNullReturn" />
    </node>
    <node role="ruleReference:0" type="jetbrains.mps.analyzers.structure.RuleReference:0" id="1483902774837544566">
      <link role="rule:0" targetNodeId="1483902774837517184" resolveInfo="RuleIfNullEqualsReturn" />
    </node>
    <node role="instruction:0" type="jetbrains.mps.analyzers.structure.Instruction:0" id="1665527126811217322">
      <property name="name:0" value="notNull" />
      <node role="parameter:0" type="jetbrains.mps.analyzers.structure.InstructionParameter:0" id="1665527126811217323">
        <property name="name:0" value="expression" />
        <node role="type:0" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="1665527126811217325" />
      </node>
    </node>
    <node role="instruction:0" type="jetbrains.mps.analyzers.structure.Instruction:0" id="1665527126811217326">
      <property name="name:0" value="nullable" />
      <node role="parameter:0" type="jetbrains.mps.analyzers.structure.InstructionParameter:0" id="1665527126811217327">
        <property name="name:0" value="expression" />
        <node role="type:0" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="1665527126811217329" />
      </node>
    </node>
    <node role="initialFunction:0" type="jetbrains.mps.analyzers.structure.AnalyzerInitialFunction:0" id="1665527126811217299">
      <node role="body:0" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="1665527126811217300">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="1261570916635558897">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="1261570916635558898">
            <property name="name:3" value="result" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="1261570916635558914">
              <link role="classifier:3" targetNodeId="4.~Map" resolveInfo="Map" />
              <node role="parameter:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="2680657297511386665" />
              <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="1261570916635558918">
                <link role="classifier:3" targetNodeId="1665527126811217334" resolveInfo="NullableState" />
              </node>
            </node>
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="1261570916635558920">
              <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="1261570916635563959">
                <link role="baseMethodDeclaration:3" targetNodeId="4.~HashMap.&lt;init&gt;()" resolveInfo="HashMap" />
                <node role="typeParameter:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="2680657297511386666" />
                <node role="typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="1261570916635563964">
                  <link role="classifier:3" targetNodeId="1665527126811217334" resolveInfo="NullableState" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="1261570916635563966">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="1261570916635563967">
            <link role="variableDeclaration:3" targetNodeId="1261570916635558898" resolveInfo="result" />
          </node>
        </node>
      </node>
    </node>
    <node role="mergeFunction:0" type="jetbrains.mps.analyzers.structure.AnalyzerMergeFunction:0" id="1665527126811217301">
      <node role="body:0" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="1665527126811217302">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="2022791306161968874">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="2022791306161968875">
            <property name="name:3" value="result" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="2022791306161968876">
              <link role="classifier:3" targetNodeId="4.~Map" resolveInfo="Map" />
              <node role="parameter:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="2022791306161968877" />
              <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="2022791306161968878">
                <link role="classifier:3" targetNodeId="1665527126811217334" resolveInfo="NullableState" />
              </node>
            </node>
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="2022791306161968879">
              <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="2022791306161968880">
                <link role="baseMethodDeclaration:3" targetNodeId="4.~HashMap.&lt;init&gt;()" resolveInfo="HashMap" />
                <node role="typeParameter:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="2022791306161968881" />
                <node role="typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="2022791306161968882">
                  <link role="classifier:3" targetNodeId="1665527126811217334" resolveInfo="NullableState" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.Statement:3" id="2022791306161968893" />
        <node role="statement:3" type="jetbrains.mps.baseLanguage.collections.structure.ForEachStatement:7" id="2022791306161968896">
          <node role="variable:7" type="jetbrains.mps.baseLanguage.collections.structure.ForEachVariable:7" id="2022791306161968897">
            <property name="name:7" value="inputElement" />
          </node>
          <node role="inputSequence:7" type="jetbrains.mps.analyzers.structure.AnalyzerMergeParameterInput:0" id="2022791306161968898" />
          <node role="body:7" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="2022791306161968899">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="2022791306161968932">
              <node role="variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="2022791306161968933">
                <property name="name:3" value="entry" />
                <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="2022791306161968943">
                  <link role="classifier:3" targetNodeId="4.~Map$Entry" resolveInfo="Map.Entry" />
                  <node role="parameter:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="2022791306161968945" />
                  <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="2022791306161968947">
                    <link role="classifier:3" targetNodeId="1665527126811217334" resolveInfo="NullableState" />
                  </node>
                </node>
              </node>
              <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="2022791306161968934">
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="2022791306161968958">
                  <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="2022791306161968959">
                    <property name="name:3" value="expr" />
                    <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="2022791306161968960" />
                    <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="2022791306161968963">
                      <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="2022791306161968962">
                        <link role="variableDeclaration:3" targetNodeId="2022791306161968933" resolveInfo="entry" />
                      </node>
                      <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="2022791306161968967">
                        <link role="baseMethodDeclaration:3" targetNodeId="4.~Map$Entry.getKey():java.lang.Object" resolveInfo="getKey" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="2022791306161968971">
                  <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="2022791306161968972">
                    <property name="name:3" value="value" />
                    <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="2022791306161968973">
                      <link role="classifier:3" targetNodeId="1665527126811217334" resolveInfo="NullableState" />
                    </node>
                    <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="2022791306161968976">
                      <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="2022791306161968975">
                        <link role="variableDeclaration:3" targetNodeId="2022791306161968933" resolveInfo="entry" />
                      </node>
                      <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="2022791306161968980">
                        <link role="baseMethodDeclaration:3" targetNodeId="4.~Map$Entry.getValue():java.lang.Object" resolveInfo="getValue" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="2022791306161968992">
                  <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="2022791306161968993">
                    <property name="name:3" value="resValue" />
                    <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="2022791306161968994">
                      <link role="classifier:3" targetNodeId="1665527126811217334" resolveInfo="NullableState" />
                    </node>
                    <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="2022791306161968996">
                      <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="2022791306161968997">
                        <link role="variableDeclaration:3" targetNodeId="2022791306161968875" resolveInfo="result" />
                      </node>
                      <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="2022791306161968998">
                        <link role="baseMethodDeclaration:3" targetNodeId="4.~Map.get(java.lang.Object):java.lang.Object" resolveInfo="get" />
                        <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="2022791306161968999">
                          <link role="variableDeclaration:3" targetNodeId="2022791306161968959" resolveInfo="expr" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="2022791306161969001">
                  <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="2022791306161969002">
                    <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="2022791306161969010">
                      <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="2022791306161969012">
                        <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="2022791306161969017">
                          <link role="enumConstantDeclaration:3" targetNodeId="1665527126811217344" resolveInfo="UNKNOWN" />
                          <link role="enumClass:3" targetNodeId="1665527126811217334" resolveInfo="NullableState" />
                        </node>
                        <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="2022791306161969011">
                          <link role="variableDeclaration:3" targetNodeId="2022791306161968993" resolveInfo="resValue" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="2022791306161969006">
                    <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="2022791306161969009" />
                    <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="2022791306161969005">
                      <link role="variableDeclaration:3" targetNodeId="2022791306161968993" resolveInfo="resValue" />
                    </node>
                  </node>
                </node>
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="2022791306161969019">
                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="2022791306161969020">
                    <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="2022791306161969021">
                      <link role="variableDeclaration:3" targetNodeId="2022791306161968875" resolveInfo="result" />
                    </node>
                    <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="2022791306161969022">
                      <link role="baseMethodDeclaration:3" targetNodeId="4.~Map.put(java.lang.Object,java.lang.Object):java.lang.Object" resolveInfo="put" />
                      <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="2022791306161969034">
                        <link role="variableDeclaration:3" targetNodeId="2022791306161968959" resolveInfo="expr" />
                      </node>
                      <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="2022791306161969024">
                        <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="2022791306161969036">
                          <link role="variableDeclaration:3" targetNodeId="2022791306161968993" resolveInfo="resValue" />
                        </node>
                        <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="2022791306161969029">
                          <link role="baseMethodDeclaration:3" targetNodeId="7985661997283757656" resolveInfo="merge" />
                          <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="2022791306161969038">
                            <link role="variableDeclaration:3" targetNodeId="2022791306161968972" resolveInfo="value" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="iterable:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="2022791306161968938">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.collections.structure.ForEachVariableReference:7" id="2022791306161968937">
                  <link role="variable:7" targetNodeId="2022791306161968897" resolveInfo="value" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="2022791306161968942">
                  <link role="baseMethodDeclaration:3" targetNodeId="4.~Map.entrySet():java.util.Set" resolveInfo="entrySet" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="1936451686726646996">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="1936451686726646997">
            <link role="variableDeclaration:3" targetNodeId="2022791306161968875" resolveInfo="result" />
          </node>
        </node>
      </node>
    </node>
    <node role="funFunction:0" type="jetbrains.mps.analyzers.structure.AnalyzerFunFunction:0" id="1665527126811217303">
      <node role="body:0" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="1665527126811217304">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="2022791306161968884">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="2022791306161968885">
            <property name="name:3" value="result" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="2022791306161968886">
              <link role="classifier:3" targetNodeId="4.~Map" resolveInfo="Map" />
              <node role="parameter:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="2022791306161968887" />
              <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="2022791306161968888">
                <link role="classifier:3" targetNodeId="1665527126811217334" resolveInfo="NullableState" />
              </node>
            </node>
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="2022791306161968889">
              <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="2022791306161968890">
                <link role="baseMethodDeclaration:3" targetNodeId="4.~HashMap.&lt;init&gt;()" resolveInfo="HashMap" />
                <node role="typeParameter:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="2022791306161968891" />
                <node role="typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="2022791306161968892">
                  <link role="classifier:3" targetNodeId="1665527126811217334" resolveInfo="NullableState" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="3762983614228137828">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="3762983614228137829">
            <property name="name:3" value="instruction" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="3762983614228137832">
              <link role="classifier:3" targetNodeId="5.~Instruction" resolveInfo="Instruction" />
            </node>
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="3762983614228137834">
              <node role="operand:3" type="jetbrains.mps.analyzers.structure.AnalyzerFunParameterProgramState:0" id="3762983614228137835" />
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="3762983614228137836">
                <link role="baseMethodDeclaration:3" targetNodeId="3.~ProgramState.getInstruction():jetbrains.mps.lang.dataFlow.framework.instructions.Instruction" resolveInfo="getInstruction" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="7985661997283748631">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="7985661997283748632">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="7985661997283748633">
              <link role="variableDeclaration:3" targetNodeId="2022791306161968885" resolveInfo="result" />
            </node>
            <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="7985661997283748634">
              <link role="baseMethodDeclaration:3" targetNodeId="4.~Map.putAll(java.util.Map):void" resolveInfo="putAll" />
              <node role="actualArgument:3" type="jetbrains.mps.analyzers.structure.AnalyzerFunParameterInput:0" id="7985661997283748635" />
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4113754758724700814">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4113754758724700815">
            <property name="name:3" value="nullableState" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4113754758724700816">
              <link role="classifier:3" targetNodeId="1665527126811217334" resolveInfo="NullableState" />
            </node>
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="4113754758724700819">
              <link role="enumConstantDeclaration:3" targetNodeId="1665527126811217344" resolveInfo="UNKNOWN" />
              <link role="enumClass:3" targetNodeId="1665527126811217334" resolveInfo="NullableState" />
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4113754758724700832">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4113754758724700833">
            <property name="name:3" value="node" />
            <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="4113754758724700859" />
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.CastExpression:3" id="4113754758724700862">
              <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="4113754758724700865" />
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4113754758724700835">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4113754758724700836">
                  <link role="variableDeclaration:3" targetNodeId="3762983614228137829" resolveInfo="instruction" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4113754758724700837">
                  <link role="baseMethodDeclaration:3" targetNodeId="5.~Instruction.getUserObject(java.lang.Object):java.lang.Object" resolveInfo="getUserObject" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="4113754758724700838">
                    <property name="value:3" value="expression" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="7985661997283730027">
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="7985661997283730028">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4113754758724700839">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="4113754758724700841">
                <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="4113754758724700846">
                  <link role="enumConstantDeclaration:3" targetNodeId="1665527126811217342" resolveInfo="NOTNULL" />
                  <link role="enumClass:3" targetNodeId="1665527126811217334" resolveInfo="NullableState" />
                </node>
                <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4113754758724700840">
                  <link role="variableDeclaration:3" targetNodeId="4113754758724700815" resolveInfo="nullableState" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition:3" type="jetbrains.mps.analyzers.structure.IsOperation:0" id="7985661997283748457">
            <link role="instruction:0" targetNodeId="1665527126811217322" resolveInfo="notNull" />
            <node role="left:0" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="7985661997283748459">
              <link role="variableDeclaration:3" targetNodeId="3762983614228137829" resolveInfo="instruction" />
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="7985661997283748573">
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="7985661997283748574">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4113754758724700847">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="4113754758724700848">
                <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="4113754758724700851">
                  <link role="enumConstantDeclaration:3" targetNodeId="1665527126811217340" resolveInfo="NULLABLE" />
                  <link role="enumClass:3" targetNodeId="1665527126811217334" resolveInfo="NullableState" />
                </node>
                <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4113754758724700850">
                  <link role="variableDeclaration:3" targetNodeId="4113754758724700815" resolveInfo="nullableState" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition:3" type="jetbrains.mps.analyzers.structure.IsOperation:0" id="7985661997283748577">
            <link role="instruction:0" targetNodeId="1665527126811217326" resolveInfo="nullable" />
            <node role="left:0" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="7985661997283748579">
              <link role="variableDeclaration:3" targetNodeId="3762983614228137829" resolveInfo="instruction" />
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4113754758724700866">
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4113754758724700867">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4113754758724700878">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="4113754758724700880">
                <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4113754758724700886">
                  <node role="operand:3" type="jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression:16" id="4113754758724700884">
                    <link role="concept:16" targetNodeId="8.1068498886296:3" resolveInfo="VariableReference" />
                    <node role="leftExpression:16" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4113754758724700883">
                      <link role="variableDeclaration:3" targetNodeId="4113754758724700833" resolveInfo="node" />
                    </node>
                  </node>
                  <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.SLinkAccess:16" id="4113754758724700890">
                    <link role="link:16" targetNodeId="8.1068581517664:3" />
                  </node>
                </node>
                <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4113754758724700879">
                  <link role="variableDeclaration:3" targetNodeId="4113754758724700833" resolveInfo="node" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4113754758724700871">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4113754758724700870">
              <link role="variableDeclaration:3" targetNodeId="4113754758724700833" resolveInfo="node" />
            </node>
            <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation:16" id="4113754758724700875">
              <node role="conceptArgument:16" type="jetbrains.mps.lang.smodel.structure.RefConcept_Reference:16" id="4113754758724700877">
                <link role="conceptDeclaration:16" targetNodeId="8.1068498886296:3" resolveInfo="VariableReference" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4113754758724710686">
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4113754758724710687">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4113754758724710695">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4113754758724710696">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4113754758724710697">
                  <link role="variableDeclaration:3" targetNodeId="2022791306161968885" resolveInfo="result" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4113754758724710698">
                  <link role="baseMethodDeclaration:3" targetNodeId="4.~Map.put(java.lang.Object,java.lang.Object):java.lang.Object" resolveInfo="put" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.CastExpression:3" id="4113754758724710699">
                    <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="4113754758724710700" />
                    <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4113754758724710701">
                      <link role="variableDeclaration:3" targetNodeId="4113754758724700833" resolveInfo="node" />
                    </node>
                  </node>
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4113754758724710702">
                    <link role="variableDeclaration:3" targetNodeId="4113754758724700815" resolveInfo="nullableState" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="4113754758724710691">
            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4113754758724710694" />
            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4113754758724710690">
              <link role="variableDeclaration:3" targetNodeId="4113754758724700833" resolveInfo="node" />
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="5551408539114776321">
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="5551408539114776322">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="5551408539114779292">
              <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="5551408539114779293">
                <property name="name:3" value="write" />
                <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="5551408539114779294">
                  <link role="classifier:3" targetNodeId="5.~WriteInstruction" resolveInfo="WriteInstruction" />
                </node>
                <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.CastExpression:3" id="5551408539114779299">
                  <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="5551408539114779302">
                    <link role="classifier:3" targetNodeId="5.~WriteInstruction" resolveInfo="WriteInstruction" />
                  </node>
                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="5551408539114779296">
                    <link role="variableDeclaration:3" targetNodeId="3762983614228137829" resolveInfo="instruction" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4113754758724670015">
              <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4113754758724670016">
                <property name="name:3" value="value" />
                <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="4113754758724670017" />
                <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.CastExpression:3" id="4113754758724670026">
                  <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="4113754758724670029">
                    <link role="concept:16" targetNodeId="8.1068431790191:3" resolveInfo="Expression" />
                  </node>
                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4113754758724670023">
                    <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4113754758724670024">
                      <link role="variableDeclaration:3" targetNodeId="5551408539114779293" resolveInfo="write" />
                    </node>
                    <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4113754758724670025">
                      <link role="baseMethodDeclaration:3" targetNodeId="5.~WriteInstruction.getValue():java.lang.Object" resolveInfo="getValue" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4113754758724716611">
              <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4113754758724716612">
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4113754758724716613">
                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="4113754758724716614">
                    <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4113754758724716615">
                      <node role="operand:3" type="jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression:16" id="4113754758724716616">
                        <link role="concept:16" targetNodeId="8.1068498886296:3" resolveInfo="VariableReference" />
                        <node role="leftExpression:16" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4113754758724716617">
                          <link role="variableDeclaration:3" targetNodeId="4113754758724670016" resolveInfo="value" />
                        </node>
                      </node>
                      <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.SLinkAccess:16" id="4113754758724716618">
                        <link role="link:16" targetNodeId="8.1068581517664:3" />
                      </node>
                    </node>
                    <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4113754758724716619">
                      <link role="variableDeclaration:3" targetNodeId="4113754758724670016" resolveInfo="value" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4113754758724716620">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4113754758724716621">
                  <link role="variableDeclaration:3" targetNodeId="4113754758724670016" resolveInfo="value" />
                </node>
                <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation:16" id="4113754758724716622">
                  <node role="conceptArgument:16" type="jetbrains.mps.lang.smodel.structure.RefConcept_Reference:16" id="4113754758724716623">
                    <link role="conceptDeclaration:16" targetNodeId="8.1068498886296:3" resolveInfo="VariableReference" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4113754758724670031">
              <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4113754758724670032">
                <property name="name:3" value="valueState" />
                <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4113754758724670035">
                  <link role="classifier:3" targetNodeId="1665527126811217334" resolveInfo="NullableState" />
                </node>
                <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4113754758724670039">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4113754758724670038">
                    <link role="variableDeclaration:3" targetNodeId="2022791306161968885" resolveInfo="result" />
                  </node>
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4113754758724670043">
                    <link role="baseMethodDeclaration:3" targetNodeId="4.~Map.get(java.lang.Object):java.lang.Object" resolveInfo="get" />
                    <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4113754758724670044">
                      <link role="variableDeclaration:3" targetNodeId="4113754758724670016" resolveInfo="value" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4113754758724670046">
              <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4113754758724670047">
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4113754758724670055">
                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="4113754758724670057">
                    <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="4113754758724670062">
                      <link role="enumConstantDeclaration:3" targetNodeId="1665527126811217344" resolveInfo="UNKNOWN" />
                      <link role="enumClass:3" targetNodeId="1665527126811217334" resolveInfo="NullableState" />
                    </node>
                    <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4113754758724670056">
                      <link role="variableDeclaration:3" targetNodeId="4113754758724670032" resolveInfo="valueState" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="4113754758724670051">
                <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4113754758724670054" />
                <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4113754758724670050">
                  <link role="variableDeclaration:3" targetNodeId="4113754758724670032" resolveInfo="state" />
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4113754758724669992">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4113754758724669994">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4113754758724669993">
                  <link role="variableDeclaration:3" targetNodeId="2022791306161968885" resolveInfo="result" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4113754758724669998">
                  <link role="baseMethodDeclaration:3" targetNodeId="4.~Map.put(java.lang.Object,java.lang.Object):java.lang.Object" resolveInfo="put" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.CastExpression:3" id="4113754758724670003">
                    <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="4113754758724700805" />
                    <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4113754758724670009">
                      <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4113754758724670008">
                        <link role="variableDeclaration:3" targetNodeId="5551408539114779293" resolveInfo="write" />
                      </node>
                      <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4113754758724670013">
                        <link role="baseMethodDeclaration:3" targetNodeId="5.~WriteInstruction.getVariable():java.lang.Object" resolveInfo="getVariable" />
                      </node>
                    </node>
                  </node>
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4113754758724670063">
                    <link role="variableDeclaration:3" targetNodeId="4113754758724670032" resolveInfo="valueState" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.InstanceOfExpression:3" id="5551408539114779286">
            <node role="classType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="5551408539114779289">
              <link role="classifier:3" targetNodeId="5.~WriteInstruction" resolveInfo="WriteInstruction" />
            </node>
            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="5551408539114779281">
              <link role="variableDeclaration:3" targetNodeId="3762983614228137829" resolveInfo="instruction" />
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="1936451686726647007">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="1936451686726647008">
            <link role="variableDeclaration:3" targetNodeId="2022791306161968885" resolveInfo="result" />
          </node>
        </node>
      </node>
    </node>
    <node role="direction:0" type="jetbrains.mps.analyzers.structure.ForwardDirection:0" id="1665527126811217307" />
    <node role="latticeElementType:0" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="1261570916635558908">
      <link role="classifier:3" targetNodeId="4.~Map" resolveInfo="Map" />
      <node role="parameter:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="2680657297511386664" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="1261570916635558912">
        <link role="classifier:3" targetNodeId="1665527126811217334" resolveInfo="NullableState" />
      </node>
    </node>
  </node>
  <visible index="2" modelUID="f:java_stub#java.lang(java.lang@java_stub)" />
  <node type="jetbrains.mps.baseLanguage.structure.EnumClass:3" id="1665527126811217334">
    <property name="name:3" value="NullableState" />
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="7985661997283757656">
      <property name="name:3" value="merge" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="7985661997283757714">
        <link role="classifier:3" targetNodeId="1665527126811217334" resolveInfo="NullableState" />
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="7985661997283757658" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="7985661997283757659">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="7985661997283757676">
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="7985661997283757677">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="7985661997283757678">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="7985661997283757679" />
            </node>
          </node>
          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="7985661997283757680">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="7985661997283757681" />
            <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="7985661997283757682">
              <link role="baseMethodDeclaration:3" targetNodeId="2v.~Enum.equals(java.lang.Object):boolean" resolveInfo="equals" />
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="7985661997283757683">
                <link role="variableDeclaration:3" targetNodeId="7985661997283757712" resolveInfo="state" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="7985661997283757684">
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="7985661997283757685">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="7985661997283757686">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="7985661997283757719">
                <link role="enumConstantDeclaration:3" targetNodeId="1665527126811217344" resolveInfo="UNKNOWN" />
                <link role="enumClass:3" targetNodeId="1665527126811217334" resolveInfo="NullableState" />
              </node>
            </node>
          </node>
          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.AndExpression:3" id="7985661997283757688">
            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="7985661997283757689">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="7985661997283757690" />
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="7985661997283757691">
                <link role="baseMethodDeclaration:3" targetNodeId="2v.~Enum.equals(java.lang.Object):boolean" resolveInfo="equals" />
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="7985661997283757721">
                  <link role="enumConstantDeclaration:3" targetNodeId="1665527126811217342" resolveInfo="NOTNULL" />
                  <link role="enumClass:3" targetNodeId="1665527126811217334" resolveInfo="NullableState" />
                </node>
              </node>
            </node>
            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="7985661997283757693">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="7985661997283757694">
                <link role="variableDeclaration:3" targetNodeId="7985661997283757712" resolveInfo="state" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="7985661997283757695">
                <link role="baseMethodDeclaration:3" targetNodeId="2v.~Enum.equals(java.lang.Object):boolean" resolveInfo="equals" />
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="7985661997283757718">
                  <link role="enumConstantDeclaration:3" targetNodeId="1665527126811217344" resolveInfo="UNKNOWN" />
                  <link role="enumClass:3" targetNodeId="1665527126811217334" resolveInfo="NullableState" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="7985661997283757697">
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="7985661997283757698">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="7985661997283757699">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="7985661997283757724">
                <link role="enumConstantDeclaration:3" targetNodeId="1665527126811217344" resolveInfo="UNKNOWN" />
                <link role="enumClass:3" targetNodeId="1665527126811217334" resolveInfo="NullableState" />
              </node>
            </node>
          </node>
          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.AndExpression:3" id="7985661997283757701">
            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="7985661997283757702">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="7985661997283757703" />
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="7985661997283757704">
                <link role="baseMethodDeclaration:3" targetNodeId="2v.~Enum.equals(java.lang.Object):boolean" resolveInfo="equals" />
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="7985661997283757722">
                  <link role="enumConstantDeclaration:3" targetNodeId="1665527126811217344" resolveInfo="UNKNOWN" />
                  <link role="enumClass:3" targetNodeId="1665527126811217334" resolveInfo="NullableState" />
                </node>
              </node>
            </node>
            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="7985661997283757706">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="7985661997283757707">
                <link role="variableDeclaration:3" targetNodeId="7985661997283757712" resolveInfo="state" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="7985661997283757708">
                <link role="baseMethodDeclaration:3" targetNodeId="2v.~Enum.equals(java.lang.Object):boolean" resolveInfo="equals" />
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="7985661997283757720">
                  <link role="enumConstantDeclaration:3" targetNodeId="1665527126811217342" resolveInfo="NOTNULL" />
                  <link role="enumClass:3" targetNodeId="1665527126811217334" resolveInfo="NullableState" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="7985661997283757710">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="7985661997283757723">
            <link role="enumConstantDeclaration:3" targetNodeId="1665527126811217340" resolveInfo="NULLABLE" />
            <link role="enumClass:3" targetNodeId="1665527126811217334" resolveInfo="NullableState" />
          </node>
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="7985661997283757712">
        <property name="name:3" value="state" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="7985661997283757716">
          <link role="classifier:3" targetNodeId="1665527126811217334" resolveInfo="NullableState" />
        </node>
      </node>
    </node>
    <node role="enumConstant:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantDeclaration:3" id="1665527126811217340">
      <property name="name:3" value="NULLABLE" />
      <link role="baseMethodDeclaration:3" targetNodeId="1665527126811217336" resolveInfo="NullableState" />
    </node>
    <node role="enumConstant:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantDeclaration:3" id="1665527126811217342">
      <property name="name:3" value="NOTNULL" />
      <link role="baseMethodDeclaration:3" targetNodeId="1665527126811217336" resolveInfo="NullableState" />
    </node>
    <node role="enumConstant:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantDeclaration:3" id="1665527126811217344">
      <property name="name:3" value="UNKNOWN" />
      <link role="baseMethodDeclaration:3" targetNodeId="1665527126811217336" resolveInfo="NullableState" />
    </node>
    <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="1665527126811217335" />
    <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="1665527126811217336">
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="1665527126811217337" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="1665527126811217338" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="1665527126811217339" />
    </node>
  </node>
  <node type="jetbrains.mps.analyzers.structure.Rule:0" id="1936451686726656874">
    <property name="name:0" value="RuleNotEqualsNull" />
    <node role="condition:0" type="jetbrains.mps.analyzers.structure.PatternCondition:0" id="1936451686726656876">
      <node role="pattern:0" type="jetbrains.mps.lang.pattern.structure.PatternExpression:0" id="1936451686726656877">
        <node role="patternNode:0" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="1936451686726656878">
          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="1936451686726656882">
            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="1936451686726656885" />
            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.Expression:3" id="1936451686726656884">
              <node role="_attr_$attribute:3" type="jetbrains.mps.lang.pattern.structure.PatternVariableDeclaration:0" id="1936451686726656886">
                <property name="varName:0" value="p" />
              </node>
            </node>
          </node>
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="1936451686726656880">
            <node role="asPattern$attribute:3" type="jetbrains.mps.lang.pattern.structure.ActionAsPattern:0" id="6672886161226171798">
              <property name="varName:0" value="ifTrue" />
              <node role="action:0" type="jetbrains.mps.analyzers.structure.EmitInstruction:0" id="6672886161226174756">
                <node role="instructionRef:0" type="jetbrains.mps.analyzers.structure.InstructionReference:0" id="6672886161226174758">
                  <link role="instruction:0" targetNodeId="1665527126811217322" resolveInfo="notNull" />
                  <node role="argument:0" type="jetbrains.mps.lang.pattern.structure.PatternVariableReference:0" id="6672886161226174759">
                    <link role="variable:0" targetNodeId="1936451686726656886" resolveInfo="#p" />
                  </node>
                </node>
                <node role="position:0" type="jetbrains.mps.analyzers.structure.InsertBeforePosition:0" id="4072414341992398128" />
              </node>
            </node>
          </node>
          <node role="asPattern$attribute:3" type="jetbrains.mps.lang.pattern.structure.ActionAsPattern:0" id="4072414341992398129">
            <property name="varName:0" value="ifStatement" />
            <node role="action:0" type="jetbrains.mps.analyzers.structure.EmitInstruction:0" id="4072414341992398131">
              <node role="instructionRef:0" type="jetbrains.mps.analyzers.structure.InstructionReference:0" id="4072414341992398135">
                <link role="instruction:0" targetNodeId="1665527126811217326" resolveInfo="nullable" />
                <node role="argument:0" type="jetbrains.mps.lang.pattern.structure.PatternVariableReference:0" id="4072414341992398136">
                  <link role="variable:0" targetNodeId="1936451686726656886" resolveInfo="#p" />
                </node>
              </node>
              <node role="position:0" type="jetbrains.mps.analyzers.structure.InsertAfterPosition:0" id="4072414341992398134" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.analyzers.structure.Rule:0" id="4072414341992373193">
    <property name="name:0" value="RuleNullNotEquals" />
    <node role="condition:0" type="jetbrains.mps.analyzers.structure.PatternCondition:0" id="4072414341992373195">
      <node role="pattern:0" type="jetbrains.mps.lang.pattern.structure.PatternExpression:0" id="4072414341992373196">
        <node role="patternNode:0" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4072414341992373197">
          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="7985661997283620708">
            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="7985661997283620709" />
            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.Expression:3" id="7985661997283620710">
              <node role="_attr_$attribute:3" type="jetbrains.mps.lang.pattern.structure.PatternVariableDeclaration:0" id="7985661997283620711">
                <property name="varName:0" value="p" />
              </node>
            </node>
          </node>
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4072414341992373199">
            <node role="asPattern$attribute:3" type="jetbrains.mps.lang.pattern.structure.ActionAsPattern:0" id="4072414341992373205">
              <property name="varName:0" value="ifTrue" />
              <node role="action:0" type="jetbrains.mps.analyzers.structure.EmitInstruction:0" id="4072414341992373207">
                <node role="instructionRef:0" type="jetbrains.mps.analyzers.structure.InstructionReference:0" id="4072414341992373209">
                  <link role="instruction:0" targetNodeId="1665527126811217322" resolveInfo="notNull" />
                  <node role="argument:0" type="jetbrains.mps.lang.pattern.structure.PatternVariableReference:0" id="4072414341992373210">
                    <link role="variable:0" targetNodeId="7985661997283620711" resolveInfo="#p" />
                  </node>
                </node>
                <node role="position:0" type="jetbrains.mps.analyzers.structure.InsertBeforePosition:0" id="4072414341992398126" />
              </node>
            </node>
          </node>
          <node role="asPattern$attribute:3" type="jetbrains.mps.lang.pattern.structure.ActionAsPattern:0" id="4072414341992417241">
            <property name="varName:0" value="node" />
            <node role="action:0" type="jetbrains.mps.analyzers.structure.EmitInstruction:0" id="4072414341992417243">
              <node role="instructionRef:0" type="jetbrains.mps.analyzers.structure.InstructionReference:0" id="4072414341992417246">
                <link role="instruction:0" targetNodeId="1665527126811217326" resolveInfo="nullable" />
                <node role="argument:0" type="jetbrains.mps.lang.pattern.structure.PatternVariableReference:0" id="4072414341992417247">
                  <link role="variable:0" targetNodeId="7985661997283620711" resolveInfo="#p" />
                </node>
              </node>
              <node role="position:0" type="jetbrains.mps.analyzers.structure.InsertAfterPosition:0" id="4072414341992417248" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.analyzers.structure.Rule:0" id="3762983614228143038">
    <property name="name:0" value="RuleNotEqualsNullAnd" />
    <node role="condition:0" type="jetbrains.mps.analyzers.structure.PatternCondition:0" id="3762983614228143040">
      <node role="pattern:0" type="jetbrains.mps.lang.pattern.structure.PatternExpression:0" id="3762983614228143041">
        <node role="patternNode:0" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="3762983614228143042">
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="3762983614228143044">
            <node role="asPattern$attribute:3" type="jetbrains.mps.lang.pattern.structure.ActionAsPattern:0" id="3762983614228143057">
              <property name="varName:0" value="ifTrue" />
              <node role="action:0" type="jetbrains.mps.analyzers.structure.EmitInstruction:0" id="3762983614228143059">
                <node role="instructionRef:0" type="jetbrains.mps.analyzers.structure.InstructionReference:0" id="3762983614228143062">
                  <link role="instruction:0" targetNodeId="1665527126811217322" resolveInfo="notNull" />
                  <node role="argument:0" type="jetbrains.mps.lang.pattern.structure.PatternVariableReference:0" id="6942119419517283936">
                    <link role="variable:0" targetNodeId="6942119419517283934" resolveInfo="#p" />
                  </node>
                </node>
                <node role="position:0" type="jetbrains.mps.analyzers.structure.InsertBeforePosition:0" id="3762983614228143064" />
              </node>
            </node>
          </node>
          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.AndExpression:3" id="6942119419517283928">
            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="6942119419517283931">
              <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6942119419517283935" />
              <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.Expression:3" id="6942119419517283933">
                <node role="_attr_$attribute:3" type="jetbrains.mps.lang.pattern.structure.PatternVariableDeclaration:0" id="6942119419517283934">
                  <property name="varName:0" value="p" />
                </node>
              </node>
            </node>
            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.Expression:3" id="6942119419517283926">
              <node role="_attr_$attribute:3" type="jetbrains.mps.lang.pattern.structure.WildcardPattern:0" id="6942119419517283927" />
            </node>
          </node>
          <node role="asPattern$attribute:3" type="jetbrains.mps.lang.pattern.structure.ActionAsPattern:0" id="6942119419517295943">
            <property name="varName:0" value="body" />
            <node role="action:0" type="jetbrains.mps.analyzers.structure.EmitInstruction:0" id="6942119419517295945">
              <node role="instructionRef:0" type="jetbrains.mps.analyzers.structure.InstructionReference:0" id="6942119419517295948">
                <link role="instruction:0" targetNodeId="1665527126811217326" resolveInfo="nullable" />
                <node role="argument:0" type="jetbrains.mps.lang.pattern.structure.PatternVariableReference:0" id="6942119419517295949">
                  <link role="variable:0" targetNodeId="6942119419517283934" resolveInfo="#p" />
                </node>
              </node>
              <node role="position:0" type="jetbrains.mps.analyzers.structure.InsertAfterPosition:0" id="6942119419517295950" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.analyzers.structure.Rule:0" id="2581561496109679426">
    <property name="name:0" value="RuleIfNullReturn" />
    <node role="condition:0" type="jetbrains.mps.analyzers.structure.PatternCondition:0" id="2581561496109679427">
      <node role="pattern:0" type="jetbrains.mps.lang.pattern.structure.PatternExpression:0" id="2581561496109679428">
        <node role="patternNode:0" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="2581561496109679429">
          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="2581561496109679430">
            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="2581561496109679431" />
            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.Expression:3" id="2581561496109679432">
              <node role="_attr_$attribute:3" type="jetbrains.mps.lang.pattern.structure.PatternVariableDeclaration:0" id="2581561496109679433">
                <property name="varName:0" value="p" />
              </node>
            </node>
          </node>
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="2581561496109679434">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="2581561496109679443" />
          </node>
          <node role="asPattern$attribute:3" type="jetbrains.mps.lang.pattern.structure.ActionAsPattern:0" id="2581561496109679438">
            <property name="varName:0" value="body" />
            <node role="action:0" type="jetbrains.mps.analyzers.structure.EmitInstruction:0" id="2581561496109679439">
              <node role="instructionRef:0" type="jetbrains.mps.analyzers.structure.InstructionReference:0" id="2581561496109679440">
                <link role="instruction:0" targetNodeId="1665527126811217322" resolveInfo="notNull" />
                <node role="argument:0" type="jetbrains.mps.lang.pattern.structure.PatternVariableReference:0" id="2581561496109679441">
                  <link role="variable:0" targetNodeId="2581561496109679433" resolveInfo="#p" />
                </node>
              </node>
              <node role="position:0" type="jetbrains.mps.analyzers.structure.InsertAfterPosition:0" id="2581561496109679442" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.analyzers.structure.Rule:0" id="1483902774837517184">
    <property name="name:0" value="RuleIfNullEqualsReturn" />
    <node role="condition:0" type="jetbrains.mps.analyzers.structure.PatternCondition:0" id="1483902774837517186">
      <node role="pattern:0" type="jetbrains.mps.lang.pattern.structure.PatternExpression:0" id="1483902774837517187">
        <node role="patternNode:0" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="1483902774837517188">
          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="1483902774837517192">
            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.Expression:3" id="1483902774837517193">
              <node role="_attr_$attribute:3" type="jetbrains.mps.lang.pattern.structure.PatternVariableDeclaration:0" id="1483902774837517195">
                <property name="varName:0" value="p" />
              </node>
            </node>
            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="1483902774837517191" />
          </node>
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="1483902774837517190">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="1483902774837517196" />
          </node>
          <node role="asPattern$attribute:3" type="jetbrains.mps.lang.pattern.structure.ActionAsPattern:0" id="1483902774837517197">
            <property name="varName:0" value="ifStatement" />
            <node role="action:0" type="jetbrains.mps.analyzers.structure.EmitInstruction:0" id="1483902774837524580">
              <node role="instructionRef:0" type="jetbrains.mps.analyzers.structure.InstructionReference:0" id="1483902774837524583">
                <link role="instruction:0" targetNodeId="1665527126811217322" resolveInfo="notNull" />
                <node role="argument:0" type="jetbrains.mps.lang.pattern.structure.PatternVariableReference:0" id="1483902774837524584">
                  <link role="variable:0" targetNodeId="1483902774837517195" resolveInfo="#p" />
                </node>
              </node>
              <node role="position:0" type="jetbrains.mps.analyzers.structure.InsertAfterPosition:0" id="1483902774837524585" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

