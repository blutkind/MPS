<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:242df33e-bb74-49e9-9cfb-0712ffc0ed0e(jetbrains.mps.internal.collections.runtime.impl)">
  <persistence version="4" />
  <refactoringHistory />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="fd392034-7849-419d-9071-12563d152375(jetbrains.mps.baseLanguage.closures)" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902db(jetbrains.mps.baseLanguage.blTypes.constraints)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902c1(jetbrains.mps.baseLanguage.constraints)" version="83" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590283(jetbrains.mps.lang.core.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590334(jetbrains.mps.baseLanguage.closures.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590338(jetbrains.mps.baseLanguage.closures.structure)" version="3" />
  <maxImportIndex value="3" />
  <import index="1" modelUID="r:fc76aa36-3cff-41c7-b94b-eee0e8341932(jetbrains.mps.internal.collections.runtime)" version="-1" />
  <import index="2" modelUID="f:java_stub#java.util(java.util@java_stub)" version="-1" />
  <import index="3" modelUID="r:044f5891-b1a8-40d1-8dc9-dd5797045766(jetbrains.mps.internal.collections.runtime.backports)" version="-1" />
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="6543581031674022257">
    <property name="name:3" value="NegateWhereFilter" />
    <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022258" />
    <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674022259">
      <property name="name:3" value="T" />
    </node>
    <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674022262">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="filter" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674022265" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.closures.structure.FunctionType:3" id="7730170264858260954">
        <node role="resultType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="7730170264858260955" />
        <node role="parameterType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="7730170264858260958">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022259" resolveInfo="T" />
        </node>
      </node>
    </node>
    <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="6543581031674022266">
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022267" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674022268" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674022269">
        <property name="name:3" value="filter" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.closures.structure.FunctionType:3" id="7730170264858260949">
          <node role="resultType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="7730170264858260950" />
          <node role="parameterType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="7730170264858260953">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022259" resolveInfo="T" />
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022272">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674022273">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674022274">
            <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674022275">
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674022276">
                <link role="fieldDeclaration:3" targetNodeId="6543581031674022262" resolveInfo="filter" />
              </node>
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674022277" />
            </node>
            <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674022278">
              <link role="variableDeclaration:3" targetNodeId="6543581031674022269" resolveInfo="filter" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674022279">
      <property name="name:3" value="accept" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022280" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674022281" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674022282">
        <property name="name:3" value="t" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022283">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022259" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022284">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674022285">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NotExpression:3" id="6543581031674022286">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression:3" id="6543581031674022287">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.closures.structure.CompactInvokeFunctionExpression:3" id="7730170264858260959">
                <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="7730170264858260962">
                  <link role="variableDeclaration:3" targetNodeId="6543581031674022282" resolveInfo="t" />
                </node>
                <node role="function:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="7730170264858260960">
                  <link role="variableDeclaration:3" targetNodeId="6543581031674022262" resolveInfo="filter" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="superclass:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="7730170264858260946">
      <link role="classifier:3" targetNodeId="1.7730170264858257623" resolveInfo="IWhereFilter" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="7730170264858260948">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022259" resolveInfo="T" />
      </node>
    </node>
  </node>
  <visible index="2" modelUID="f:java_stub#java.lang(java.lang@java_stub)" />
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="6543581031674022292">
    <property name="name:3" value="NullSetSequence" />
    <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022293" />
    <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674022294">
      <property name="name:3" value="T" />
    </node>
    <node role="superclass:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674022295">
      <link role="classifier:3" targetNodeId="6543581031674029595" resolveInfo="NullSequence" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022296">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022294" resolveInfo="T" />
      </node>
    </node>
    <node role="implementedInterface:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674022297">
      <link role="classifier:3" targetNodeId="1.6543581031674036081" resolveInfo="ISetSequence" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022298">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022294" resolveInfo="T" />
      </node>
    </node>
    <node role="implementedInterface:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674022299">
      <link role="classifier:3" targetNodeId="2.~Set" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022300">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022294" resolveInfo="T" />
      </node>
    </node>
    <node role="staticField:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration:3" id="6543581031674022301">
      <property name="name:3" value="EMPTY_ARRAY" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ArrayType:3" id="6543581031674022302">
        <node role="componentType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674022303">
          <link role="classifier:3" targetNodeId="2v.~Object" />
        </node>
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674022304" />
      <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674022305">
        <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ArrayCreator:3" id="6543581031674022306">
          <node role="dimensionExpression:3" type="jetbrains.mps.baseLanguage.structure.DimensionExpression:3" id="6543581031674022307">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="6543581031674022308">
              <property name="value:3" value="0" />
            </node>
          </node>
          <node role="componentType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674022309">
            <link role="classifier:3" targetNodeId="2v.~Object" resolveInfo="Object" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticField:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration:3" id="6543581031674022310">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="INSTANCE" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674022311">
        <link role="classifier:3" targetNodeId="6543581031674022292" resolveInfo="NullSetSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674022312">
          <link role="classifier:3" targetNodeId="2v.~Object" />
        </node>
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674022313" />
      <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674022314">
        <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674022315">
          <link role="baseMethodDeclaration:3" targetNodeId="6543581031674022331" resolveInfo="NullSetSequence" />
          <node role="typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674022316">
            <link role="classifier:3" targetNodeId="2v.~Object" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration:3" id="6543581031674022317">
      <property name="name:3" value="instance" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022318" />
      <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674022319">
        <property name="name:3" value="U" />
      </node>
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674022320">
        <link role="classifier:3" targetNodeId="6543581031674022292" resolveInfo="NullSetSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022321">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022319" resolveInfo="U" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022322">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674022323">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.CastExpression:3" id="6543581031674022324">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalStaticFieldReference:3" id="6543581031674022325">
              <link role="variableDeclaration:3" targetNodeId="6543581031674022310" resolveInfo="INSTANCE" />
            </node>
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674022326">
              <link role="classifier:3" targetNodeId="6543581031674022292" resolveInfo="NullSetSequence" />
              <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022327">
                <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022319" resolveInfo="U" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="6543581031674022328">
        <link role="annotation:3" targetNodeId="2v.~SuppressWarnings" />
        <node role="value:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstanceValue:3" id="6543581031674022329">
          <link role="key:3" targetNodeId="2v.~SuppressWarnings.value()" />
          <node role="value:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="6543581031674022330">
            <property name="value:3" value="unchecked" />
          </node>
        </node>
      </node>
    </node>
    <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="6543581031674022331">
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.ProtectedVisibility:3" id="6543581031674022332" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674022333" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022334" />
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674022335">
      <property name="name:3" value="add" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022336" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674022337" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674022338">
        <property name="name:3" value="e" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022339">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022294" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022340">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674022341">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="6543581031674022342" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674022343">
      <property name="name:3" value="addAll" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022344" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674022345" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674022346">
        <property name="name:3" value="c" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674022347">
          <link role="classifier:3" targetNodeId="2.~Collection" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.UpperBoundType:3" id="6543581031674022348">
            <node role="bound:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022349">
              <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022294" resolveInfo="T" />
            </node>
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022350">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674022351">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="6543581031674022352" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674022353">
      <property name="name:3" value="clear" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022354" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674022355" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022356" />
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674022357">
      <property name="name:3" value="contains" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022358" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674022359" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674022360">
        <property name="name:3" value="t" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674022361">
          <link role="classifier:3" targetNodeId="2v.~Object" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022362">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674022363">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="6543581031674022364" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674022365">
      <property name="name:3" value="containsAll" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022366" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674022367" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674022368">
        <property name="name:3" value="c" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674022369">
          <link role="classifier:3" targetNodeId="2.~Collection" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.WildCardType:3" id="6543581031674022370" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022371">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674022372">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="6543581031674022373" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674022374">
      <property name="name:3" value="remove" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022375" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674022376" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674022377">
        <property name="name:3" value="o" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674022378">
          <link role="classifier:3" targetNodeId="2v.~Object" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022379">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674022380">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="6543581031674022381" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674022382">
      <property name="name:3" value="removeAll" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022383" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674022384" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674022385">
        <property name="name:3" value="c" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674022386">
          <link role="classifier:3" targetNodeId="2.~Collection" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.WildCardType:3" id="6543581031674022387" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022388">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674022389">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="6543581031674022390" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674022391">
      <property name="name:3" value="retainAll" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022392" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674022393" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674022394">
        <property name="name:3" value="c" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674022395">
          <link role="classifier:3" targetNodeId="2.~Collection" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.WildCardType:3" id="6543581031674022396" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022397">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674022398">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="6543581031674022399" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674022400">
      <property name="name:3" value="size" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022401" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="6543581031674022402" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022403">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674022404">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="6543581031674022405">
            <property name="value:3" value="0" />
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674022406">
      <property name="name:3" value="toArray" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022407" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ArrayType:3" id="6543581031674022408">
        <node role="componentType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674022409">
          <link role="classifier:3" targetNodeId="2v.~Object" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022410">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674022411">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalStaticFieldReference:3" id="6543581031674022412">
            <link role="variableDeclaration:3" targetNodeId="6543581031674022301" resolveInfo="EMPTY_ARRAY" />
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674022413">
      <property name="name:3" value="toArray" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022414" />
      <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674022415">
        <property name="name:3" value="U" />
      </node>
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ArrayType:3" id="6543581031674022416">
        <node role="componentType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022417">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022415" resolveInfo="U" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674022418">
        <property name="name:3" value="a" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ArrayType:3" id="6543581031674022419">
          <node role="componentType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022420">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022415" resolveInfo="U" />
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022421">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674022422">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.CastExpression:3" id="6543581031674022423">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalStaticFieldReference:3" id="6543581031674022424">
              <link role="variableDeclaration:3" targetNodeId="6543581031674022301" resolveInfo="EMPTY_ARRAY" />
            </node>
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ArrayType:3" id="6543581031674022425">
              <node role="componentType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022426">
                <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022415" resolveInfo="U" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="6543581031674022427">
        <link role="annotation:3" targetNodeId="2v.~SuppressWarnings" />
        <node role="value:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstanceValue:3" id="6543581031674022428">
          <link role="key:3" targetNodeId="2v.~SuppressWarnings.value()" />
          <node role="value:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="6543581031674022429">
            <property name="value:3" value="unchecked" />
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674022430">
      <property name="name:3" value="addElement" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022431" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022432">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022294" resolveInfo="T" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674022433">
        <property name="name:3" value="t" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022434">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022294" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022435">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674022436">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674022437" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674022438">
      <property name="name:3" value="addSequence" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022439" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674022440">
        <link role="classifier:3" targetNodeId="1.6543581031674036081" resolveInfo="ISetSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022441">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022294" resolveInfo="T" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674022442">
        <property name="name:3" value="seq" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674022443">
          <link role="classifier:3" targetNodeId="1.6543581031674024311" resolveInfo="ISequence" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.UpperBoundType:3" id="6543581031674022444">
            <node role="bound:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022445">
              <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022294" resolveInfo="T" />
            </node>
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022446">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674022447">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674022448" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674022449">
      <property name="name:3" value="removeElement" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022450" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022451">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022294" resolveInfo="T" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674022452">
        <property name="name:3" value="t" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022453">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022294" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022454">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674022455">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674022456" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674022457">
      <property name="name:3" value="removeSequence" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022458" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674022459">
        <link role="classifier:3" targetNodeId="1.6543581031674036081" resolveInfo="ISetSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022460">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022294" resolveInfo="T" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674022461">
        <property name="name:3" value="seq" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674022462">
          <link role="classifier:3" targetNodeId="1.6543581031674024311" resolveInfo="ISequence" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.UpperBoundType:3" id="6543581031674022463">
            <node role="bound:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022464">
              <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022294" resolveInfo="T" />
            </node>
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022465">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674022466">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674022467" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674022468">
      <property name="name:3" value="toGenericArray" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022469" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ArrayType:3" id="6543581031674022470">
        <node role="componentType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022471">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022294" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022472">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674022473">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.CastExpression:3" id="6543581031674022474">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalStaticFieldReference:3" id="6543581031674022475">
              <link role="variableDeclaration:3" targetNodeId="6543581031674022301" resolveInfo="EMPTY_ARRAY" />
            </node>
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ArrayType:3" id="6543581031674022476">
              <node role="componentType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022477">
                <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022294" resolveInfo="T" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="6543581031674022478">
        <link role="annotation:3" targetNodeId="2v.~SuppressWarnings" />
        <node role="value:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstanceValue:3" id="6543581031674022479">
          <link role="key:3" targetNodeId="2v.~SuppressWarnings.value()" />
          <node role="value:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="6543581031674022480">
            <property name="value:3" value="unchecked" />
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674022481">
      <property name="name:3" value="toGenericArray" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022482" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ArrayType:3" id="6543581031674022483">
        <node role="componentType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022484">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022294" resolveInfo="T" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674022485">
        <property name="name:3" value="runtimeClass" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674022486">
          <link role="classifier:3" targetNodeId="2v.~Class" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022487">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022294" resolveInfo="T" />
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022488">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674022489">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.CastExpression:3" id="6543581031674022490">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalStaticFieldReference:3" id="6543581031674022491">
              <link role="variableDeclaration:3" targetNodeId="6543581031674022301" resolveInfo="EMPTY_ARRAY" />
            </node>
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ArrayType:3" id="6543581031674022492">
              <node role="componentType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022493">
                <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022294" resolveInfo="T" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="6543581031674022494">
        <link role="annotation:3" targetNodeId="2v.~SuppressWarnings" />
        <node role="value:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstanceValue:3" id="6543581031674022495">
          <link role="key:3" targetNodeId="2v.~SuppressWarnings.value()" />
          <node role="value:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="6543581031674022496">
            <property name="value:3" value="unchecked" />
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674022497">
      <property name="name:3" value="toSet" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022498" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674022499">
        <link role="classifier:3" targetNodeId="2.~Set" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022500">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022294" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022501">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674022502">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674022503" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="6543581031674022504">
    <property name="name:3" value="NullDequeSequence" />
    <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022505" />
    <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674022506">
      <property name="name:3" value="T" />
    </node>
    <node role="superclass:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674022507">
      <link role="classifier:3" targetNodeId="6543581031674027576" resolveInfo="NullQueueSequence" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022508">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022506" resolveInfo="T" />
      </node>
    </node>
    <node role="implementedInterface:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674022509">
      <link role="classifier:3" targetNodeId="1.6543581031674024899" resolveInfo="IDequeSequence" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022510">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022506" resolveInfo="T" />
      </node>
    </node>
    <node role="implementedInterface:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674022511">
      <link role="classifier:3" targetNodeId="3.6543581031674027297" resolveInfo="Deque" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022512">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022506" resolveInfo="T" />
      </node>
    </node>
    <node role="staticField:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration:3" id="6543581031674022513">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="INSTANCE" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674022514">
        <link role="classifier:3" targetNodeId="6543581031674022504" resolveInfo="NullDequeSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674022515">
          <link role="classifier:3" targetNodeId="2v.~Object" />
        </node>
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674022516" />
      <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674022517">
        <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674022518">
          <link role="baseMethodDeclaration:3" targetNodeId="6543581031674022534" resolveInfo="NullDequeSequence" />
          <node role="typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674022519">
            <link role="classifier:3" targetNodeId="2v.~Object" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration:3" id="6543581031674022520">
      <property name="name:3" value="instance" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022521" />
      <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674022522">
        <property name="name:3" value="U" />
      </node>
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674022523">
        <link role="classifier:3" targetNodeId="6543581031674022504" resolveInfo="NullDequeSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022524">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022522" resolveInfo="U" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022525">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674022526">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.CastExpression:3" id="6543581031674022527">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalStaticFieldReference:3" id="6543581031674022528">
              <link role="variableDeclaration:3" targetNodeId="6543581031674022513" resolveInfo="INSTANCE" />
            </node>
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674022529">
              <link role="classifier:3" targetNodeId="6543581031674022504" resolveInfo="NullDequeSequence" />
              <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022530">
                <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022522" resolveInfo="U" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="6543581031674022531">
        <link role="annotation:3" targetNodeId="2v.~SuppressWarnings" />
        <node role="value:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstanceValue:3" id="6543581031674022532">
          <link role="key:3" targetNodeId="2v.~SuppressWarnings.value()" />
          <node role="value:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="6543581031674022533">
            <property name="value:3" value="unchecked" />
          </node>
        </node>
      </node>
    </node>
    <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="6543581031674022534">
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.ProtectedVisibility:3" id="6543581031674022535" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674022536" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022537" />
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674022538">
      <property name="name:3" value="addFirst" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022539" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674022540" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674022541">
        <property name="name:3" value="t" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022542">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022506" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022543" />
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674022544">
      <property name="name:3" value="addLast" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022545" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674022546" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674022547">
        <property name="name:3" value="t" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022548">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022506" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022549" />
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674022550">
      <property name="name:3" value="descendingIterator" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022551" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674022552">
        <link role="classifier:3" targetNodeId="2.~Iterator" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022553">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022506" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022554">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674022555">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6543581031674022556">
            <link role="baseMethodDeclaration:3" targetNodeId="6543581031674029710" resolveInfo="iterator" />
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674022557">
      <property name="name:3" value="getFirst" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022558" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022559">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022506" resolveInfo="T" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022560">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674022561">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674022562" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674022563">
      <property name="name:3" value="getLast" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022564" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022565">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022506" resolveInfo="T" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022566">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674022567">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674022568" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674022569">
      <property name="name:3" value="offerFirst" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022570" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674022571" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674022572">
        <property name="name:3" value="t" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022573">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022506" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022574">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674022575">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="6543581031674022576" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674022577">
      <property name="name:3" value="offerLast" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022578" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674022579" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674022580">
        <property name="name:3" value="t" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022581">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022506" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022582">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674022583">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="6543581031674022584" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674022585">
      <property name="name:3" value="peekFirst" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022586" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022587">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022506" resolveInfo="T" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022588">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674022589">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674022590" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674022591">
      <property name="name:3" value="peekLast" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022592" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022593">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022506" resolveInfo="T" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022594">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674022595">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674022596" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674022597">
      <property name="name:3" value="pollFirst" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022598" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022599">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022506" resolveInfo="T" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022600">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674022601">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674022602" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674022603">
      <property name="name:3" value="pollLast" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022604" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022605">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022506" resolveInfo="T" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022606">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674022607">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674022608" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674022609">
      <property name="name:3" value="pop" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022610" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022611">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022506" resolveInfo="T" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022612">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674022613">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674022614" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674022615">
      <property name="name:3" value="push" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022616" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674022617" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674022618">
        <property name="name:3" value="t" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022619">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022506" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022620" />
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674022621">
      <property name="name:3" value="removeFirst" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022622" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022623">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022506" resolveInfo="T" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022624">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674022625">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674022626" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674022627">
      <property name="name:3" value="removeFirstOccurrence" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022628" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674022629" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674022630">
        <property name="name:3" value="o" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674022631">
          <link role="classifier:3" targetNodeId="2v.~Object" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022632">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674022633">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="6543581031674022634" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674022635">
      <property name="name:3" value="removeLast" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022636" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022637">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022506" resolveInfo="T" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022638">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674022639">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674022640" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674022641">
      <property name="name:3" value="removeLastOccurrence" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022642" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674022643" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674022644">
        <property name="name:3" value="o" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674022645">
          <link role="classifier:3" targetNodeId="2v.~Object" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022646">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674022647">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="6543581031674022648" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674022649">
      <property name="name:3" value="addFirstElement" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022650" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022651">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022506" resolveInfo="T" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674022652">
        <property name="name:3" value="t" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022653">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022506" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022654">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674022655">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674022656" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674022657">
      <property name="name:3" value="peekElement" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022658" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022659">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022506" resolveInfo="T" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022660">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674022661">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674022662" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674022663">
      <property name="name:3" value="popElement" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022664" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022665">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022506" resolveInfo="T" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022666">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674022667">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674022668" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674022669">
      <property name="name:3" value="pushElement" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022670" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022671">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022506" resolveInfo="T" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674022672">
        <property name="name:3" value="t" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022673">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022506" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022674">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674022675">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674022676" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674022677">
      <property name="name:3" value="removeLastElement" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022678" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022679">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022506" resolveInfo="T" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022680">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674022681">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674022682" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674022683">
      <property name="name:3" value="addSequence" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022684" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674022685">
        <link role="classifier:3" targetNodeId="1.6543581031674024899" resolveInfo="IDequeSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022686">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022506" resolveInfo="T" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674022687">
        <property name="name:3" value="seq" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674022688">
          <link role="classifier:3" targetNodeId="1.6543581031674024311" resolveInfo="ISequence" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.UpperBoundType:3" id="6543581031674022689">
            <node role="bound:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022690">
              <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022506" resolveInfo="T" />
            </node>
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022691">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674022692">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.CastExpression:3" id="6543581031674022693">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.SuperMethodCall:3" id="6543581031674022694">
              <link role="baseMethodDeclaration:3" targetNodeId="6543581031674027630" resolveInfo="addSequence" />
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674022695">
                <link role="variableDeclaration:3" targetNodeId="6543581031674022687" resolveInfo="seq" />
              </node>
            </node>
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674022696">
              <link role="classifier:3" targetNodeId="1.6543581031674024899" resolveInfo="IDequeSequence" />
              <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022697">
                <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022506" resolveInfo="T" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="6543581031674022698">
        <link role="annotation:3" targetNodeId="2v.~Override" />
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674022699">
      <property name="name:3" value="removeSequence" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022700" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674022701">
        <link role="classifier:3" targetNodeId="1.6543581031674024899" resolveInfo="IDequeSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022702">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022506" resolveInfo="T" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674022703">
        <property name="name:3" value="seq" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674022704">
          <link role="classifier:3" targetNodeId="1.6543581031674024311" resolveInfo="ISequence" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.UpperBoundType:3" id="6543581031674022705">
            <node role="bound:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022706">
              <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022506" resolveInfo="T" />
            </node>
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022707">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674022708">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.CastExpression:3" id="6543581031674022709">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.SuperMethodCall:3" id="6543581031674022710">
              <link role="baseMethodDeclaration:3" targetNodeId="6543581031674027641" resolveInfo="removeSequence" />
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674022711">
                <link role="variableDeclaration:3" targetNodeId="6543581031674022703" resolveInfo="seq" />
              </node>
            </node>
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674022712">
              <link role="classifier:3" targetNodeId="1.6543581031674024899" resolveInfo="IDequeSequence" />
              <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022713">
                <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022506" resolveInfo="T" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="6543581031674022714">
        <link role="annotation:3" targetNodeId="2v.~Override" />
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674022715">
      <property name="name:3" value="removeWhere" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022716" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674022717">
        <link role="classifier:3" targetNodeId="1.6543581031674024899" resolveInfo="IDequeSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022718">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022506" resolveInfo="T" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674022719">
        <property name="name:3" value="filter" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.closures.structure.FunctionType:3" id="7730170264858260975">
          <node role="resultType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="7730170264858260976" />
          <node role="parameterType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="7730170264858260980">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022506" resolveInfo="T" />
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022722">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674022723">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.CastExpression:3" id="6543581031674022724">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.SuperMethodCall:3" id="6543581031674022725">
              <link role="baseMethodDeclaration:3" targetNodeId="6543581031674027652" resolveInfo="removeWhere" />
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674022726">
                <link role="variableDeclaration:3" targetNodeId="6543581031674022719" resolveInfo="filter" />
              </node>
            </node>
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674022727">
              <link role="classifier:3" targetNodeId="1.6543581031674024899" resolveInfo="IDequeSequence" />
              <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022728">
                <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022506" resolveInfo="T" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="6543581031674022729">
        <link role="annotation:3" targetNodeId="2v.~Override" />
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674022730">
      <property name="name:3" value="asUnmodifiable" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022731" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674022732">
        <link role="classifier:3" targetNodeId="1.6543581031674024899" resolveInfo="IDequeSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022733">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022506" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022734">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674022735">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.CastExpression:3" id="6543581031674022736">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.SuperMethodCall:3" id="6543581031674022737">
              <link role="baseMethodDeclaration:3" targetNodeId="6543581031674027667" resolveInfo="asUnmodifiable" />
            </node>
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674022738">
              <link role="classifier:3" targetNodeId="1.6543581031674024899" resolveInfo="IDequeSequence" />
              <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022739">
                <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022506" resolveInfo="T" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="6543581031674022740">
        <link role="annotation:3" targetNodeId="2v.~Override" />
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674022741">
      <property name="name:3" value="asSynchronized" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022742" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674022743">
        <link role="classifier:3" targetNodeId="1.6543581031674024899" resolveInfo="IDequeSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022744">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022506" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022745">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674022746">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.CastExpression:3" id="6543581031674022747">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.SuperMethodCall:3" id="6543581031674022748">
              <link role="baseMethodDeclaration:3" targetNodeId="6543581031674027678" resolveInfo="asSynchronized" />
            </node>
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674022749">
              <link role="classifier:3" targetNodeId="1.6543581031674024899" resolveInfo="IDequeSequence" />
              <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022750">
                <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022506" resolveInfo="T" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="6543581031674022751">
        <link role="annotation:3" targetNodeId="2v.~Override" />
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674022752">
      <property name="name:3" value="toDeque" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674022753" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674022754">
        <link role="classifier:3" targetNodeId="3.6543581031674027297" resolveInfo="Deque" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674022755">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674022506" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674022756">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674022757">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674022758" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="6543581031674024631">
    <property name="abstractClass:3" value="true" />
    <property name="name:3" value="NullCollectionSequence" />
    <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674024632" />
    <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674024633">
      <property name="name:3" value="T" />
    </node>
    <node role="superclass:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674024634">
      <link role="classifier:3" targetNodeId="6543581031674029595" resolveInfo="NullSequence" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674024635">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674024633" resolveInfo="T" />
      </node>
    </node>
    <node role="implementedInterface:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674024636">
      <link role="classifier:3" targetNodeId="1.6543581031674026272" resolveInfo="ICollectionSequence" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674024637">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674024633" resolveInfo="T" />
      </node>
    </node>
    <node role="implementedInterface:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674024638">
      <link role="classifier:3" targetNodeId="2.~Collection" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674024639">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674024633" resolveInfo="T" />
      </node>
    </node>
    <node role="staticField:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration:3" id="6543581031674024640">
      <property name="name:3" value="EMPTY_ARRAY" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ArrayType:3" id="6543581031674024641">
        <node role="componentType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674024642">
          <link role="classifier:3" targetNodeId="2v.~Object" />
        </node>
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.ProtectedVisibility:3" id="6543581031674024643" />
      <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674024644">
        <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ArrayCreator:3" id="6543581031674024645">
          <node role="dimensionExpression:3" type="jetbrains.mps.baseLanguage.structure.DimensionExpression:3" id="6543581031674024646">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="6543581031674024647">
              <property name="value:3" value="0" />
            </node>
          </node>
          <node role="componentType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674024648">
            <link role="classifier:3" targetNodeId="2v.~Object" resolveInfo="Object" />
          </node>
        </node>
      </node>
    </node>
    <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="6543581031674024649">
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.ProtectedVisibility:3" id="6543581031674024650" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674024651" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674024652" />
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674024653">
      <property name="name:3" value="addElement" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674024654" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674024655">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674024633" resolveInfo="T" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674024656">
        <property name="name:3" value="t" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674024657">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674024633" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674024658">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674024659">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674024660" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674024661">
      <property name="name:3" value="addSequence" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674024662" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674024663">
        <link role="classifier:3" targetNodeId="1.6543581031674026272" resolveInfo="ICollectionSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674024664">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674024633" resolveInfo="T" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674024665">
        <property name="name:3" value="seq" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674024666">
          <link role="classifier:3" targetNodeId="1.6543581031674024311" resolveInfo="ISequence" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.UpperBoundType:3" id="6543581031674024667">
            <node role="bound:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674024668">
              <link role="typeVariableDeclaration:3" targetNodeId="6543581031674024633" resolveInfo="T" />
            </node>
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674024669">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674024670">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674024671" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674024672">
      <property name="name:3" value="removeElement" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674024673" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674024674">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674024633" resolveInfo="T" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674024675">
        <property name="name:3" value="t" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674024676">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674024633" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674024677">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674024678">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674024679" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674024680">
      <property name="name:3" value="removeSequence" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674024681" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674024682">
        <link role="classifier:3" targetNodeId="1.6543581031674026272" resolveInfo="ICollectionSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674024683">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674024633" resolveInfo="T" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674024684">
        <property name="name:3" value="seq" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674024685">
          <link role="classifier:3" targetNodeId="1.6543581031674024311" resolveInfo="ISequence" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.UpperBoundType:3" id="6543581031674024686">
            <node role="bound:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674024687">
              <link role="typeVariableDeclaration:3" targetNodeId="6543581031674024633" resolveInfo="T" />
            </node>
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674024688">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674024689">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674024690" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674024691">
      <property name="name:3" value="removeWhere" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674024692" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674024693">
        <link role="classifier:3" targetNodeId="1.6543581031674026272" resolveInfo="ICollectionSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674024694">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674024633" resolveInfo="T" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674024695">
        <property name="name:3" value="filter" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.closures.structure.FunctionType:3" id="7730170264858260969">
          <node role="resultType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="7730170264858260970" />
          <node role="parameterType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="7730170264858260973">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674024633" resolveInfo="T" />
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674024698">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674024699">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674024700" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674024701">
      <property name="name:3" value="add" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674024702" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674024703" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674024704">
        <property name="name:3" value="o" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674024705">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674024633" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674024706">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674024707">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="6543581031674024708" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674024709">
      <property name="name:3" value="addAll" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674024710" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674024711" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674024712">
        <property name="name:3" value="c" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674024713">
          <link role="classifier:3" targetNodeId="2.~Collection" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.UpperBoundType:3" id="6543581031674024714">
            <node role="bound:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674024715">
              <link role="typeVariableDeclaration:3" targetNodeId="6543581031674024633" resolveInfo="T" />
            </node>
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674024716">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674024717">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="6543581031674024718" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674024719">
      <property name="name:3" value="clear" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674024720" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674024721" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674024722" />
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674024723">
      <property name="name:3" value="contains" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674024724" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674024725" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674024726">
        <property name="name:3" value="o" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674024727">
          <link role="classifier:3" targetNodeId="2v.~Object" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674024728">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674024729">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="6543581031674024730" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674024731">
      <property name="name:3" value="containsAll" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674024732" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674024733" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674024734">
        <property name="name:3" value="c" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674024735">
          <link role="classifier:3" targetNodeId="2.~Collection" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.WildCardType:3" id="6543581031674024736" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674024737">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674024738">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="6543581031674024739" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674024740">
      <property name="name:3" value="remove" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674024741" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674024742" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674024743">
        <property name="name:3" value="o" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674024744">
          <link role="classifier:3" targetNodeId="2v.~Object" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674024745">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674024746">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="6543581031674024747" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674024748">
      <property name="name:3" value="removeAll" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674024749" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674024750" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674024751">
        <property name="name:3" value="c" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674024752">
          <link role="classifier:3" targetNodeId="2.~Collection" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.WildCardType:3" id="6543581031674024753" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674024754">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674024755">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="6543581031674024756" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674024757">
      <property name="name:3" value="retainAll" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674024758" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674024759" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674024760">
        <property name="name:3" value="c" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674024761">
          <link role="classifier:3" targetNodeId="2.~Collection" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.WildCardType:3" id="6543581031674024762" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674024763">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674024764">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="6543581031674024765" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674024766">
      <property name="name:3" value="asUnmodifiable" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674024767" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674024768">
        <link role="classifier:3" targetNodeId="1.6543581031674026272" resolveInfo="ICollectionSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674024769">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674024633" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674024770">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674024771">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674024772" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674024773">
      <property name="name:3" value="asSynchronized" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674024774" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674024775">
        <link role="classifier:3" targetNodeId="1.6543581031674026272" resolveInfo="ICollectionSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674024776">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674024633" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674024777">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674024778">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674024779" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674024780">
      <property name="name:3" value="size" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674024781" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="6543581031674024782" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674024783">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674024784">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="6543581031674024785">
            <property name="value:3" value="0" />
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674024786">
      <property name="name:3" value="toArray" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674024787" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ArrayType:3" id="6543581031674024788">
        <node role="componentType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674024789">
          <link role="classifier:3" targetNodeId="2v.~Object" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674024790">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674024791">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalStaticFieldReference:3" id="6543581031674024792">
            <link role="variableDeclaration:3" targetNodeId="6543581031674024640" resolveInfo="EMPTY_ARRAY" />
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674024793">
      <property name="name:3" value="toArray" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674024794" />
      <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674024795">
        <property name="name:3" value="U" />
      </node>
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ArrayType:3" id="6543581031674024796">
        <node role="componentType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674024797">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674024795" resolveInfo="U" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674024798">
        <property name="name:3" value="a" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ArrayType:3" id="6543581031674024799">
          <node role="componentType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674024800">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674024795" resolveInfo="U" />
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674024801">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674024802">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.CastExpression:3" id="6543581031674024803">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalStaticFieldReference:3" id="6543581031674024804">
              <link role="variableDeclaration:3" targetNodeId="6543581031674024640" resolveInfo="EMPTY_ARRAY" />
            </node>
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ArrayType:3" id="6543581031674024805">
              <node role="componentType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674024806">
                <link role="typeVariableDeclaration:3" targetNodeId="6543581031674024795" resolveInfo="U" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="6543581031674024807">
        <link role="annotation:3" targetNodeId="2v.~SuppressWarnings" />
        <node role="value:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstanceValue:3" id="6543581031674024808">
          <link role="key:3" targetNodeId="2v.~SuppressWarnings.value()" />
          <node role="value:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="6543581031674024809">
            <property name="value:3" value="unchecked" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="6543581031674024998">
    <property name="name:3" value="ConcatingSequence" />
    <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674024999" />
    <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674025000">
      <property name="name:3" value="U" />
    </node>
    <node role="superclass:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674025001">
      <link role="classifier:3" targetNodeId="1.6543581031674023524" resolveInfo="Sequence" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674025002">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674025000" resolveInfo="U" />
      </node>
    </node>
    <node role="staticInnerClassifiers:3" type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="6543581031674025003">
      <property name="name:3" value="ConcatingIterator" />
      <property name="nonStatic:3" value="true" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674025004" />
      <node role="implementedInterface:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674025005">
        <link role="classifier:3" targetNodeId="2.~Iterator" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674025006">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674025000" resolveInfo="U" />
        </node>
      </node>
      <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674025007">
        <property name="name:3" value="next" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674025008">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674025000" resolveInfo="U" />
        </node>
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674025009" />
      </node>
      <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674025010">
        <property name="name:3" value="hasNext" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674025011">
          <link role="classifier:3" targetNodeId="6543581031674034581" resolveInfo="HasNextState" />
        </node>
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674025012" />
        <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="6543581031674025094">
          <link role="enumClass:3" targetNodeId="6543581031674034581" resolveInfo="HasNextState" />
          <link role="enumConstantDeclaration:3" targetNodeId="6543581031674034583" resolveInfo="UNKNOWN" />
        </node>
      </node>
      <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674025013">
        <property name="name:3" value="leftIt" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674025014">
          <link role="classifier:3" targetNodeId="2.~Iterator" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674025015">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674025000" resolveInfo="U" />
          </node>
        </node>
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674025016" />
      </node>
      <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674025017">
        <property name="name:3" value="rightIt" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674025018">
          <link role="classifier:3" targetNodeId="2.~Iterator" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674025019">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674025000" resolveInfo="U" />
          </node>
        </node>
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674025020" />
      </node>
      <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="6543581031674025021">
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674025022" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674025023" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674025095" />
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674025024">
        <property name="name:3" value="hasNext" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674025025" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674025026" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674025096">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6401275180973216590">
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6401275180973216591">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6401275180973216610">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6401275180973216611">
                  <link role="baseMethodDeclaration:3" targetNodeId="6543581031674025033" resolveInfo="init" />
                </node>
              </node>
            </node>
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.OrExpression:3" id="6401275180973216602">
              <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="6401275180973216606">
                <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6401275180973216609" />
                <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6401275180973216605">
                  <link role="variableDeclaration:3" targetNodeId="6543581031674025017" resolveInfo="rightIt" />
                </node>
              </node>
              <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="6401275180973216598">
                <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6401275180973216594">
                  <link role="variableDeclaration:3" targetNodeId="6543581031674025013" resolveInfo="leftIt" />
                </node>
                <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6401275180973216601" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674025097">
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674025098">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674025099">
                <link role="variableDeclaration:3" targetNodeId="6543581031674025010" resolveInfo="hasNext" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674025100">
                <link role="baseMethodDeclaration:3" targetNodeId="6543581031674034605" resolveInfo="unknown" />
              </node>
            </node>
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674025101">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674025104">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6543581031674025105">
                  <link role="baseMethodDeclaration:3" targetNodeId="6543581031674025036" resolveInfo="moveToNext" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674025106">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674025107">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674025108">
                <link role="variableDeclaration:3" targetNodeId="6543581031674025010" resolveInfo="hasNext" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674025109">
                <link role="baseMethodDeclaration:3" targetNodeId="6543581031674034613" resolveInfo="hasNext" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674025027">
        <property name="name:3" value="next" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674025028" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674025029">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674025000" resolveInfo="U" />
        </node>
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674025110">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6401275180973216612">
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6401275180973216613">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6401275180973216614">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6401275180973216615">
                  <link role="baseMethodDeclaration:3" targetNodeId="6543581031674025033" resolveInfo="init" />
                </node>
              </node>
            </node>
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.OrExpression:3" id="6401275180973216616">
              <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="6401275180973216617">
                <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6401275180973216618" />
                <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6401275180973216619">
                  <link role="variableDeclaration:3" targetNodeId="6543581031674025017" resolveInfo="rightIt" />
                </node>
              </node>
              <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="6401275180973216620">
                <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6401275180973216621">
                  <link role="variableDeclaration:3" targetNodeId="6543581031674025013" resolveInfo="leftIt" />
                </node>
                <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6401275180973216622" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674025111">
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674025112">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674025113">
                <link role="variableDeclaration:3" targetNodeId="6543581031674025010" resolveInfo="hasNext" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674025114">
                <link role="baseMethodDeclaration:3" targetNodeId="6543581031674034605" resolveInfo="unknown" />
              </node>
            </node>
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674025115">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674025118">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6543581031674025119">
                  <link role="baseMethodDeclaration:3" targetNodeId="6543581031674025036" resolveInfo="moveToNext" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674025120">
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.NotExpression:3" id="6543581031674025121">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression:3" id="6543581031674025122">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674025123">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674025124">
                    <link role="variableDeclaration:3" targetNodeId="6543581031674025010" resolveInfo="hasNext" />
                  </node>
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674025125">
                    <link role="baseMethodDeclaration:3" targetNodeId="6543581031674034613" resolveInfo="hasNext" />
                  </node>
                </node>
              </node>
            </node>
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674025126">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ThrowStatement:3" id="6543581031674025127">
                <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674025128">
                  <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674025129">
                    <link role="baseMethodDeclaration:3" targetNodeId="2.~NoSuchElementException.&lt;init&gt;()" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6401275180973221700">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6401275180973221701">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6401275180973221702" />
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6401275180973221703">
                <link role="baseMethodDeclaration:3" targetNodeId="6401275180973221679" resolveInfo="clearNext" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674025030">
        <property name="name:3" value="remove" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674025031" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674025032" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674025138">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ThrowStatement:3" id="6543581031674025139">
            <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674025140">
              <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674025141">
                <link role="baseMethodDeclaration:3" targetNodeId="2v.~UnsupportedOperationException.&lt;init&gt;()" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674025033">
        <property name="name:3" value="init" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674025034" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674025035" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674025142">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674025143">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674025144">
              <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674025145">
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674025146">
                  <link role="fieldDeclaration:3" targetNodeId="6543581031674025013" resolveInfo="leftIt" />
                </node>
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674025147" />
              </node>
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674025148">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674025149">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674025150">
                    <link role="variableDeclaration:3" targetNodeId="6543581031674025044" resolveInfo="left" />
                  </node>
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674025151">
                    <link role="baseMethodDeclaration:3" targetNodeId="1.6543581031674024589" resolveInfo="toIterable" />
                  </node>
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674025152">
                  <link role="baseMethodDeclaration:3" targetNodeId="2v.~Iterable.iterator():java.util.Iterator" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674025153">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674025154">
              <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674025155">
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674025156">
                  <link role="fieldDeclaration:3" targetNodeId="6543581031674025017" resolveInfo="rightIt" />
                </node>
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674025157" />
              </node>
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674025158">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674025159">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674025160">
                    <link role="variableDeclaration:3" targetNodeId="6543581031674025048" resolveInfo="right" />
                  </node>
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674025161">
                    <link role="baseMethodDeclaration:3" targetNodeId="1.6543581031674024589" resolveInfo="toIterable" />
                  </node>
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674025162">
                  <link role="baseMethodDeclaration:3" targetNodeId="2v.~Iterable.iterator():java.util.Iterator" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674025036">
        <property name="name:3" value="moveToNext" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674025037" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674025038" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674025163">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674025164">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674025165">
              <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674025166">
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674025167">
                  <link role="fieldDeclaration:3" targetNodeId="6543581031674025007" resolveInfo="next" />
                </node>
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674025168" />
              </node>
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674025169" />
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674025170">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674025171">
              <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674025172">
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674025173">
                  <link role="fieldDeclaration:3" targetNodeId="6543581031674025010" resolveInfo="hasNext" />
                </node>
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674025174" />
              </node>
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="6543581031674025175">
                <link role="enumClass:3" targetNodeId="6543581031674034581" resolveInfo="HasNextState" />
                <link role="enumConstantDeclaration:3" targetNodeId="6543581031674034588" resolveInfo="AT_END" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674025176">
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674025177">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674025178">
                <link role="variableDeclaration:3" targetNodeId="6543581031674025013" resolveInfo="leftIt" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674025179">
                <link role="baseMethodDeclaration:3" targetNodeId="2.~Iterator.hasNext():boolean" />
              </node>
            </node>
            <node role="ifFalseStatement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674025180">
              <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674025181">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674025182">
                  <link role="variableDeclaration:3" targetNodeId="6543581031674025017" resolveInfo="rightIt" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674025183">
                  <link role="baseMethodDeclaration:3" targetNodeId="2.~Iterator.hasNext():boolean" />
                </node>
              </node>
              <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674025184">
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674025185">
                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6543581031674025186">
                    <link role="baseMethodDeclaration:3" targetNodeId="6543581031674025039" resolveInfo="setNext" />
                    <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674025187">
                      <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674025188">
                        <link role="variableDeclaration:3" targetNodeId="6543581031674025017" resolveInfo="rightIt" />
                      </node>
                      <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674025189">
                        <link role="baseMethodDeclaration:3" targetNodeId="2.~Iterator.next():java.lang.Object" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674025190">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674025191">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6543581031674025192">
                  <link role="baseMethodDeclaration:3" targetNodeId="6543581031674025039" resolveInfo="setNext" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674025193">
                    <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674025194">
                      <link role="variableDeclaration:3" targetNodeId="6543581031674025013" resolveInfo="leftIt" />
                    </node>
                    <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674025195">
                      <link role="baseMethodDeclaration:3" targetNodeId="2.~Iterator.next():java.lang.Object" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6401275180973221679">
        <property name="name:3" value="clearNext" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6401275180973221680" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6401275180973221681">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674025000" resolveInfo="U" />
        </node>
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6401275180973221682">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="6401275180973221683">
            <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="6401275180973221678">
              <property name="name:3" value="tmp" />
              <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6401275180973221684">
                <link role="typeVariableDeclaration:3" targetNodeId="6543581031674025000" resolveInfo="U" />
              </node>
              <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6401275180973221685">
                <link role="variableDeclaration:3" targetNodeId="6543581031674025007" resolveInfo="next" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6401275180973221686">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6401275180973221687">
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6401275180973221688" />
              <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6401275180973221689">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6401275180973221690" />
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6401275180973221691">
                  <link role="fieldDeclaration:3" targetNodeId="6543581031674025007" resolveInfo="next" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6401275180973221692">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6401275180973221693">
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="6401275180973221694">
                <link role="enumConstantDeclaration:3" targetNodeId="6543581031674034583" resolveInfo="UNKNOWN" />
                <link role="enumClass:3" targetNodeId="6543581031674034581" resolveInfo="HasNextState" />
              </node>
              <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6401275180973221695">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6401275180973221696" />
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6401275180973221697">
                  <link role="fieldDeclaration:3" targetNodeId="6543581031674025010" resolveInfo="hasNext" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6401275180973221698">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6401275180973221699">
              <link role="variableDeclaration:3" targetNodeId="6401275180973221678" resolveInfo="tmp" />
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674025039">
        <property name="name:3" value="setNext" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674025040" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674025041" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674025042">
          <property name="name:3" value="next" />
          <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674025043">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674025000" resolveInfo="U" />
          </node>
        </node>
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674025196">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674025197">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674025198">
              <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674025199">
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674025200">
                  <link role="fieldDeclaration:3" targetNodeId="6543581031674025007" resolveInfo="next" />
                </node>
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674025201" />
              </node>
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674025202">
                <link role="variableDeclaration:3" targetNodeId="6543581031674025042" resolveInfo="next" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674025203">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674025204">
              <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674025205">
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674025206">
                  <link role="fieldDeclaration:3" targetNodeId="6543581031674025010" resolveInfo="hasNext" />
                </node>
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674025207" />
              </node>
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="6543581031674025208">
                <link role="enumClass:3" targetNodeId="6543581031674034581" resolveInfo="HasNextState" />
                <link role="enumConstantDeclaration:3" targetNodeId="6543581031674034586" resolveInfo="HAS_NEXT" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674025044">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="left" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674025045">
        <link role="classifier:3" targetNodeId="1.6543581031674024311" resolveInfo="ISequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674025046">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674025000" resolveInfo="U" />
        </node>
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674025047" />
    </node>
    <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674025048">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="right" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674025049">
        <link role="classifier:3" targetNodeId="1.6543581031674024311" resolveInfo="ISequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674025050">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674025000" resolveInfo="U" />
        </node>
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674025051" />
    </node>
    <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="6543581031674025052">
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674025053" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674025054" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674025055">
        <property name="name:3" value="left" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674025056">
          <link role="classifier:3" targetNodeId="1.6543581031674024311" resolveInfo="ISequence" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674025057">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674025000" resolveInfo="U" />
          </node>
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674025058">
        <property name="name:3" value="right" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674025059">
          <link role="classifier:3" targetNodeId="1.6543581031674024311" resolveInfo="ISequence" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674025060">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674025000" resolveInfo="U" />
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674025061">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674025062">
          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.OrExpression:3" id="6543581031674025063">
            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="6543581031674025064">
              <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674025065">
                <link role="variableDeclaration:3" targetNodeId="6543581031674025055" resolveInfo="left" />
              </node>
              <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674025066" />
            </node>
            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="6543581031674025067">
              <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674025068">
                <link role="variableDeclaration:3" targetNodeId="6543581031674025058" resolveInfo="right" />
              </node>
              <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674025069" />
            </node>
          </node>
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674025070">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ThrowStatement:3" id="6543581031674025071">
              <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674025072">
                <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674025073">
                  <link role="baseMethodDeclaration:3" targetNodeId="2v.~NullPointerException.&lt;init&gt;()" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674025074">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674025075">
            <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674025076">
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674025077">
                <link role="fieldDeclaration:3" targetNodeId="6543581031674025044" resolveInfo="left" />
              </node>
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674025078" />
            </node>
            <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674025079">
              <link role="variableDeclaration:3" targetNodeId="6543581031674025055" resolveInfo="left" />
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674025080">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674025081">
            <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674025082">
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674025083">
                <link role="fieldDeclaration:3" targetNodeId="6543581031674025048" resolveInfo="right" />
              </node>
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674025084" />
            </node>
            <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674025085">
              <link role="variableDeclaration:3" targetNodeId="6543581031674025058" resolveInfo="right" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674025086">
      <property name="name:3" value="iterator" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674025087" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674025088">
        <link role="classifier:3" targetNodeId="2.~Iterator" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674025089">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674025000" resolveInfo="U" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674025090">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674025091">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674025092">
            <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674025093">
              <link role="baseMethodDeclaration:3" targetNodeId="6543581031674025021" resolveInfo="ConcatingSequence.ConcatingIterator" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="6543581031674026327">
    <property name="name:3" value="TranslatingSequence" />
    <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674026328" />
    <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674026329">
      <property name="name:3" value="U" />
    </node>
    <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674026330">
      <property name="name:3" value="V" />
    </node>
    <node role="superclass:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674026331">
      <link role="classifier:3" targetNodeId="6543581031674030214" resolveInfo="AbstractChainedSequence" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026332">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026329" resolveInfo="U" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026333">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026330" resolveInfo="V" />
      </node>
    </node>
    <node role="implementedInterface:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674026334">
      <link role="classifier:3" targetNodeId="2v.~Iterable" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026335">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026330" resolveInfo="V" />
      </node>
    </node>
    <node role="staticInnerClassifiers:3" type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="6543581031674026336">
      <property name="name:3" value="TranslatingIterator" />
      <property name="nonStatic:3" value="true" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674026337" />
      <node role="implementedInterface:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674026338">
        <link role="classifier:3" targetNodeId="2.~Iterator" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026339">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026330" resolveInfo="V" />
        </node>
      </node>
      <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674026340">
        <property name="name:3" value="inputIt" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674026341">
          <link role="classifier:3" targetNodeId="2.~Iterator" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026342">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026329" resolveInfo="U" />
          </node>
        </node>
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674026343" />
      </node>
      <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674026344">
        <property name="name:3" value="transIt" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674026345">
          <link role="classifier:3" targetNodeId="2.~Iterator" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026346">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026330" resolveInfo="V" />
          </node>
        </node>
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674026347" />
      </node>
      <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674026348">
        <property name="name:3" value="hasNext" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674026349">
          <link role="classifier:3" targetNodeId="6543581031674034581" resolveInfo="HasNextState" />
        </node>
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674026350" />
        <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="6543581031674026414">
          <link role="enumClass:3" targetNodeId="6543581031674034581" resolveInfo="HasNextState" />
          <link role="enumConstantDeclaration:3" targetNodeId="6543581031674034583" resolveInfo="UNKNOWN" />
        </node>
      </node>
      <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674026351">
        <property name="name:3" value="next" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026352">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026330" resolveInfo="V" />
        </node>
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674026353" />
      </node>
      <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="6543581031674026354">
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674026355" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674026356" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674026415" />
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674026357">
        <property name="name:3" value="hasNext" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674026358" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674026359" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674026416">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="5746517363044288488">
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="5746517363044288489">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674026422">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6543581031674026423">
                  <link role="baseMethodDeclaration:3" targetNodeId="6543581031674026366" resolveInfo="init" />
                </node>
              </node>
            </node>
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="5746517363044288493">
              <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="5746517363044288496" />
              <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="5746517363044288492">
                <link role="variableDeclaration:3" targetNodeId="6543581031674026340" resolveInfo="inputIt" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674026417">
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674026418">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674026419">
                <link role="variableDeclaration:3" targetNodeId="6543581031674026348" resolveInfo="hasNext" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674026420">
                <link role="baseMethodDeclaration:3" targetNodeId="6543581031674034605" resolveInfo="unknown" />
              </node>
            </node>
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674026421">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674026424">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6543581031674026425">
                  <link role="baseMethodDeclaration:3" targetNodeId="6543581031674026369" resolveInfo="moveToNext" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674026426">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674026427">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674026428">
                <link role="variableDeclaration:3" targetNodeId="6543581031674026348" resolveInfo="hasNext" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674026429">
                <link role="baseMethodDeclaration:3" targetNodeId="6543581031674034613" resolveInfo="hasNext" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674026360">
        <property name="name:3" value="next" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674026361" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026362">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026330" resolveInfo="V" />
        </node>
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674026430">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="5746517363044288497">
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="5746517363044288498">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="5746517363044288499">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="5746517363044288500">
                  <link role="baseMethodDeclaration:3" targetNodeId="6543581031674026366" resolveInfo="init" />
                </node>
              </node>
            </node>
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="5746517363044288501">
              <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="5746517363044288502" />
              <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="5746517363044288503">
                <link role="variableDeclaration:3" targetNodeId="6543581031674026340" resolveInfo="inputIt" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674026431">
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674026432">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674026433">
                <link role="variableDeclaration:3" targetNodeId="6543581031674026348" resolveInfo="hasNext" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674026434">
                <link role="baseMethodDeclaration:3" targetNodeId="6543581031674034605" resolveInfo="unknown" />
              </node>
            </node>
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674026435">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674026438">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6543581031674026439">
                  <link role="baseMethodDeclaration:3" targetNodeId="6543581031674026369" resolveInfo="moveToNext" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674026440">
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.NotExpression:3" id="6543581031674026441">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression:3" id="6543581031674026442">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674026443">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674026444">
                    <link role="variableDeclaration:3" targetNodeId="6543581031674026348" resolveInfo="hasNext" />
                  </node>
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674026445">
                    <link role="baseMethodDeclaration:3" targetNodeId="6543581031674034613" resolveInfo="hasNext" />
                  </node>
                </node>
              </node>
            </node>
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674026446">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ThrowStatement:3" id="6543581031674026447">
                <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674026448">
                  <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674026449">
                    <link role="baseMethodDeclaration:3" targetNodeId="2.~NoSuchElementException.&lt;init&gt;()" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="5746517363044288551">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="5746517363044288552">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="5746517363044288553" />
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="5746517363044288554">
                <link role="baseMethodDeclaration:3" targetNodeId="5746517363044288530" resolveInfo="clearNext" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674026363">
        <property name="name:3" value="remove" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674026364" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674026365" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674026458">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ThrowStatement:3" id="6543581031674026459">
            <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674026460">
              <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674026461">
                <link role="baseMethodDeclaration:3" targetNodeId="2v.~UnsupportedOperationException.&lt;init&gt;()" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674026366">
        <property name="name:3" value="init" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674026367" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674026368" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674026462">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674026463">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674026464">
              <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674026465">
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674026466">
                  <link role="fieldDeclaration:3" targetNodeId="6543581031674026340" resolveInfo="inputIt" />
                </node>
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674026467" />
              </node>
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674026468">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6543581031674026469">
                  <link role="baseMethodDeclaration:3" targetNodeId="6543581031674030245" resolveInfo="getInput" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674026470">
                  <link role="baseMethodDeclaration:3" targetNodeId="2v.~Iterable.iterator():java.util.Iterator" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674026369">
        <property name="name:3" value="moveToNext" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674026370" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674026371" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674026471">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674026472">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674026473">
              <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674026474">
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674026475">
                  <link role="fieldDeclaration:3" targetNodeId="6543581031674026348" resolveInfo="hasNext" />
                </node>
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674026476" />
              </node>
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="6543581031674026477">
                <link role="enumClass:3" targetNodeId="6543581031674034581" resolveInfo="HasNextState" />
                <link role="enumConstantDeclaration:3" targetNodeId="6543581031674034588" resolveInfo="AT_END" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674026478">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674026479">
              <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674026480">
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674026481">
                  <link role="fieldDeclaration:3" targetNodeId="6543581031674026351" resolveInfo="next" />
                </node>
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674026482" />
              </node>
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674026483" />
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.DoWhileStatement:3" id="6543581031674026484">
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="6543581031674026485">
              <property name="value:3" value="true" />
            </node>
            <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674026486">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.TryCatchStatement:3" id="6543581031674026487">
                <node role="catchClause:3" type="jetbrains.mps.baseLanguage.structure.CatchClause:3" id="6543581031674026488">
                  <node role="catchBody:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674026489">
                    <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.BreakStatement:3" id="6543581031674026490" />
                  </node>
                  <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="6543581031674026491">
                    <property name="name:3" value="stop" />
                    <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674026492">
                      <link role="classifier:3" targetNodeId="1.6543581031674024612" resolveInfo="StopIteratingException" />
                    </node>
                  </node>
                </node>
                <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674026493">
                  <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674026494">
                    <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.AndExpression:3" id="6543581031674026495">
                      <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="6543581031674026496">
                        <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674026497">
                          <link role="variableDeclaration:3" targetNodeId="6543581031674026344" resolveInfo="transIt" />
                        </node>
                        <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674026498" />
                      </node>
                      <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674026499">
                        <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674026500">
                          <link role="variableDeclaration:3" targetNodeId="6543581031674026344" resolveInfo="transIt" />
                        </node>
                        <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674026501">
                          <link role="baseMethodDeclaration:3" targetNodeId="2.~Iterator.hasNext():boolean" />
                        </node>
                      </node>
                    </node>
                    <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674026502">
                      <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="6543581031674026503">
                        <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="6543581031674026504">
                          <property name="name:3" value="tmp" />
                          <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026505">
                            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026330" resolveInfo="V" />
                          </node>
                          <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674026506">
                            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674026507">
                              <link role="variableDeclaration:3" targetNodeId="6543581031674026344" resolveInfo="transIt" />
                            </node>
                            <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674026508">
                              <link role="baseMethodDeclaration:3" targetNodeId="2.~Iterator.next():java.lang.Object" />
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674026509">
                        <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference:3" id="6543581031674026510">
                          <link role="classifier:3" targetNodeId="1.6543581031674023524" resolveInfo="Sequence" />
                          <link role="variableDeclaration:3" targetNodeId="1.6543581031674023535" resolveInfo="IGNORE_NULL_VALUES" />
                        </node>
                        <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674026511">
                          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674026512">
                            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="6543581031674026513">
                              <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674026514">
                                <link role="variableDeclaration:3" targetNodeId="6543581031674026504" resolveInfo="tmp" />
                              </node>
                              <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674026515" />
                            </node>
                            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674026516">
                              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ContinueStatement:3" id="6543581031674026517" />
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674026518">
                        <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674026519">
                          <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674026520">
                            <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674026521">
                              <link role="fieldDeclaration:3" targetNodeId="6543581031674026351" resolveInfo="next" />
                            </node>
                            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674026522" />
                          </node>
                          <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674026523">
                            <link role="variableDeclaration:3" targetNodeId="6543581031674026504" resolveInfo="tmp" />
                          </node>
                        </node>
                      </node>
                      <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674026524">
                        <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674026525">
                          <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674026526">
                            <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674026527">
                              <link role="fieldDeclaration:3" targetNodeId="6543581031674026348" resolveInfo="hasNext" />
                            </node>
                            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674026528" />
                          </node>
                          <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="6543581031674026529">
                            <link role="enumClass:3" targetNodeId="6543581031674034581" resolveInfo="HasNextState" />
                            <link role="enumConstantDeclaration:3" targetNodeId="6543581031674034586" resolveInfo="HAS_NEXT" />
                          </node>
                        </node>
                      </node>
                      <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.BreakStatement:3" id="6543581031674026530" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674026531">
                <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674026532">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674026533">
                    <link role="variableDeclaration:3" targetNodeId="6543581031674026340" resolveInfo="inputIt" />
                  </node>
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674026534">
                    <link role="baseMethodDeclaration:3" targetNodeId="2.~Iterator.hasNext():boolean" />
                  </node>
                </node>
                <node role="ifFalseStatement:3" type="jetbrains.mps.baseLanguage.structure.BlockStatement:3" id="6543581031674026535">
                  <node role="statements:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674026536">
                    <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.BreakStatement:3" id="6543581031674026537" />
                  </node>
                </node>
                <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674026538">
                  <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.TryCatchStatement:3" id="6543581031674026539">
                    <node role="catchClause:3" type="jetbrains.mps.baseLanguage.structure.CatchClause:3" id="6543581031674026540">
                      <node role="catchBody:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674026541">
                        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ThrowStatement:3" id="6543581031674026542">
                          <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674026543">
                            <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674026544">
                              <link role="baseMethodDeclaration:3" targetNodeId="2v.~IllegalStateException.&lt;init&gt;(java.lang.Throwable)" />
                              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674026545">
                                <link role="variableDeclaration:3" targetNodeId="6543581031674026546" resolveInfo="illegal" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="6543581031674026546">
                        <property name="name:3" value="illegal" />
                        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674026547">
                          <link role="classifier:3" targetNodeId="1.6543581031674024612" resolveInfo="StopIteratingException" />
                        </node>
                      </node>
                    </node>
                    <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674026548">
                      <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="6543581031674026549">
                        <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="6543581031674026550">
                          <property name="name:3" value="transSeq" />
                          <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674026551">
                            <link role="classifier:3" targetNodeId="2v.~Iterable" resolveInfo="Iterable" />
                            <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026552">
                              <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026330" resolveInfo="V" />
                            </node>
                          </node>
                          <node role="initializer:3" type="jetbrains.mps.baseLanguage.closures.structure.CompactInvokeFunctionExpression:3" id="7730170264858297905">
                            <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="7730170264858297907">
                              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="7730170264858297908">
                                <link role="variableDeclaration:3" targetNodeId="6543581031674026340" resolveInfo="inputIt" />
                              </node>
                              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="7730170264858297909">
                                <link role="baseMethodDeclaration:3" targetNodeId="2.~Iterator.next():java.lang.Object" resolveInfo="next" />
                              </node>
                            </node>
                            <node role="function:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="7730170264858297906">
                              <link role="variableDeclaration:3" targetNodeId="6543581031674026372" resolveInfo="translator" />
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674026559">
                        <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference:3" id="6543581031674026560">
                          <link role="classifier:3" targetNodeId="1.6543581031674023524" resolveInfo="Sequence" />
                          <link role="variableDeclaration:3" targetNodeId="1.6543581031674023531" resolveInfo="USE_NULL_SEQUENCE" />
                        </node>
                        <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674026561">
                          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674026562">
                            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="6543581031674026563">
                              <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674026564">
                                <link role="variableDeclaration:3" targetNodeId="6543581031674026550" resolveInfo="transSeq" />
                              </node>
                              <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674026565" />
                            </node>
                            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674026566">
                              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674026567">
                                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674026568">
                                  <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674026569">
                                    <link role="variableDeclaration:3" targetNodeId="6543581031674026550" resolveInfo="transSeq" />
                                  </node>
                                  <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="6543581031674026570">
                                    <link role="classConcept:3" targetNodeId="6543581031674029595" resolveInfo="NullSequence" />
                                    <link role="baseMethodDeclaration:3" targetNodeId="6543581031674029626" resolveInfo="instance" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674026571">
                        <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674026572">
                          <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674026573">
                            <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674026574">
                              <link role="fieldDeclaration:3" targetNodeId="6543581031674026344" resolveInfo="transIt" />
                            </node>
                            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674026575" />
                          </node>
                          <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674026576">
                            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674026578">
                              <link role="variableDeclaration:3" targetNodeId="6543581031674026550" resolveInfo="transSeq" />
                            </node>
                            <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674026580">
                              <link role="baseMethodDeclaration:3" targetNodeId="2v.~Iterable.iterator():java.util.Iterator" />
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
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="5746517363044288530">
        <property name="name:3" value="clearNext" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="5746517363044288531" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="5746517363044288532">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026330" resolveInfo="V" />
        </node>
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="5746517363044288533">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="5746517363044288534">
            <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="5746517363044288529">
              <property name="name:3" value="tmp" />
              <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="5746517363044288535">
                <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026330" resolveInfo="V" />
              </node>
              <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="5746517363044288536">
                <link role="variableDeclaration:3" targetNodeId="6543581031674026351" resolveInfo="next" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="5746517363044288537">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="5746517363044288538">
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="5746517363044288539" />
              <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="5746517363044288540">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="5746517363044288541" />
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="5746517363044288542">
                  <link role="fieldDeclaration:3" targetNodeId="6543581031674026351" resolveInfo="next" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="5746517363044288543">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="5746517363044288544">
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="5746517363044288545">
                <link role="enumConstantDeclaration:3" targetNodeId="6543581031674034583" resolveInfo="UNKNOWN" />
                <link role="enumClass:3" targetNodeId="6543581031674034581" resolveInfo="HasNextState" />
              </node>
              <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="5746517363044288546">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="5746517363044288547" />
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="5746517363044288548">
                  <link role="fieldDeclaration:3" targetNodeId="6543581031674026348" resolveInfo="hasNext" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="5746517363044288549">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="5746517363044288550">
              <link role="variableDeclaration:3" targetNodeId="5746517363044288529" resolveInfo="tmp" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674026372">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="translator" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674026377" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.closures.structure.FunctionType:3" id="3473971317150294873">
        <node role="parameterType:3" type="jetbrains.mps.baseLanguage.structure.LowerBoundType:3" id="3473971317150294874">
          <node role="bound:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="3473971317150294875">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026329" resolveInfo="U" />
          </node>
        </node>
        <node role="resultType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="3473971317150294876">
          <link role="classifier:3" targetNodeId="2v.~Iterable" resolveInfo="Iterable" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="3473971317150294877">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026330" resolveInfo="V" />
          </node>
        </node>
      </node>
    </node>
    <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="6543581031674026378">
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674026379" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674026380" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674026381">
        <property name="name:3" value="input" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674026382">
          <link role="classifier:3" targetNodeId="2v.~Iterable" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026383">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026329" resolveInfo="U" />
          </node>
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="3473971317150294861">
        <property name="name:3" value="translator" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.closures.structure.FunctionType:3" id="3473971317150294862">
          <node role="parameterType:3" type="jetbrains.mps.baseLanguage.structure.LowerBoundType:3" id="3473971317150294869">
            <node role="bound:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="3473971317150294871">
              <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026329" resolveInfo="U" />
            </node>
          </node>
          <node role="resultType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="3473971317150294864">
            <link role="classifier:3" targetNodeId="2v.~Iterable" resolveInfo="Iterable" />
            <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="3473971317150294872">
              <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026330" resolveInfo="V" />
            </node>
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674026389">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.SuperConstructorInvocation:3" id="6543581031674026390">
          <link role="baseMethodDeclaration:3" targetNodeId="6543581031674030224" resolveInfo="AbstractChainedSequence" />
          <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674026391">
            <link role="variableDeclaration:3" targetNodeId="6543581031674026381" resolveInfo="input" />
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674026392">
          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="6543581031674026393">
            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674026394">
              <link role="variableDeclaration:3" targetNodeId="3473971317150294861" resolveInfo="translator" />
            </node>
            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674026395" />
          </node>
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674026396">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ThrowStatement:3" id="6543581031674026397">
              <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674026398">
                <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674026399">
                  <link role="baseMethodDeclaration:3" targetNodeId="2v.~NullPointerException.&lt;init&gt;()" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674026400">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674026401">
            <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674026402">
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674026403">
                <link role="fieldDeclaration:3" targetNodeId="6543581031674026372" resolveInfo="translator" />
              </node>
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674026404" />
            </node>
            <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674026405">
              <link role="variableDeclaration:3" targetNodeId="3473971317150294861" resolveInfo="translator" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674026406">
      <property name="name:3" value="iterator" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674026407" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674026408">
        <link role="classifier:3" targetNodeId="2.~Iterator" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026409">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026330" resolveInfo="V" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674026410">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674026411">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674026412">
            <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674026413">
              <link role="baseMethodDeclaration:3" targetNodeId="6543581031674026354" resolveInfo="TranslatingSequence.TranslatingIterator" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="6543581031674026581">
    <property name="name:3" value="SortingSequence" />
    <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674026582" />
    <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674026583">
      <property name="name:3" value="U" />
    </node>
    <node role="superclass:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674026584">
      <link role="classifier:3" targetNodeId="1.6543581031674023524" resolveInfo="Sequence" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026585">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026583" resolveInfo="U" />
      </node>
    </node>
    <node role="implementedInterface:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674026586">
      <link role="classifier:3" targetNodeId="2v.~Iterable" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026587">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026583" resolveInfo="U" />
      </node>
    </node>
    <node role="staticInnerClassifiers:3" type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="6543581031674026588">
      <property name="name:3" value="UnmodifiableIterator" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674026589" />
      <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674026590">
        <property name="name:3" value="U" />
      </node>
      <node role="implementedInterface:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674026591">
        <link role="classifier:3" targetNodeId="2.~Iterator" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026592">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026590" resolveInfo="U" />
        </node>
      </node>
      <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674026593">
        <property name="isFinal:3" value="true" />
        <property name="name:3" value="source" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674026594">
          <link role="classifier:3" targetNodeId="2.~ListIterator" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026595">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026590" resolveInfo="U" />
          </node>
        </node>
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674026596" />
      </node>
      <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="6543581031674026597">
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674026598" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674026599" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674026600">
          <property name="name:3" value="source" />
          <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674026601">
            <link role="classifier:3" targetNodeId="2.~ListIterator" />
            <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026602">
              <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026590" resolveInfo="U" />
            </node>
          </node>
        </node>
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674026843">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674026844">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674026845">
              <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674026846">
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674026847">
                  <link role="fieldDeclaration:3" targetNodeId="6543581031674026593" resolveInfo="source" />
                </node>
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674026848" />
              </node>
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674026849">
                <link role="variableDeclaration:3" targetNodeId="6543581031674026600" resolveInfo="source" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674026603">
        <property name="name:3" value="hasNext" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674026604" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674026605" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674026850">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674026851">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674026852">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674026853">
                <link role="variableDeclaration:3" targetNodeId="6543581031674026593" resolveInfo="source" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674026854">
                <link role="baseMethodDeclaration:3" targetNodeId="2.~ListIterator.hasNext():boolean" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674026606">
        <property name="name:3" value="next" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674026607" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026608">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026590" resolveInfo="U" />
        </node>
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674026855">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674026856">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674026857">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674026858">
                <link role="variableDeclaration:3" targetNodeId="6543581031674026593" resolveInfo="source" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674026859">
                <link role="baseMethodDeclaration:3" targetNodeId="2.~ListIterator.next():java.lang.Object" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674026609">
        <property name="name:3" value="remove" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674026610" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674026611" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674026860">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ThrowStatement:3" id="6543581031674026861">
            <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674026862">
              <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674026863">
                <link role="baseMethodDeclaration:3" targetNodeId="2v.~UnsupportedOperationException.&lt;init&gt;()" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticInnerClassifiers:3" type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="6543581031674026612">
      <property name="name:3" value="InversedComparator" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674026613" />
      <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674026614">
        <property name="name:3" value="T" />
      </node>
      <node role="implementedInterface:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674026615">
        <link role="classifier:3" targetNodeId="2.~Comparator" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026616">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026614" resolveInfo="T" />
        </node>
      </node>
      <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674026617">
        <property name="isFinal:3" value="true" />
        <property name="name:3" value="primary" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674026618">
          <link role="classifier:3" targetNodeId="2.~Comparator" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026619">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026614" resolveInfo="T" />
          </node>
        </node>
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674026620" />
      </node>
      <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="6543581031674026621">
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674026622" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674026623" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674026624">
          <property name="name:3" value="primary" />
          <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674026625">
            <link role="classifier:3" targetNodeId="2.~Comparator" />
            <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026626">
              <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026614" resolveInfo="T" />
            </node>
          </node>
        </node>
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674026864">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674026865">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674026866">
              <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674026867">
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674026868">
                  <link role="fieldDeclaration:3" targetNodeId="6543581031674026617" resolveInfo="primary" />
                </node>
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674026869" />
              </node>
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674026870">
                <link role="variableDeclaration:3" targetNodeId="6543581031674026624" resolveInfo="primary" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674026627">
        <property name="name:3" value="compare" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674026628" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="6543581031674026629" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674026630">
          <property name="name:3" value="a" />
          <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026631">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026614" resolveInfo="T" />
          </node>
        </node>
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674026632">
          <property name="name:3" value="b" />
          <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026633">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026614" resolveInfo="T" />
          </node>
        </node>
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674026871">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674026872">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.UnaryMinus:3" id="6543581031674026873">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674026874">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674026875">
                  <link role="variableDeclaration:3" targetNodeId="6543581031674026617" resolveInfo="primary" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674026876">
                  <link role="baseMethodDeclaration:3" targetNodeId="2.~Comparator.compare(java.lang.Object,java.lang.Object):int" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674026877">
                    <link role="variableDeclaration:3" targetNodeId="6543581031674026630" resolveInfo="a" />
                  </node>
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674026878">
                    <link role="variableDeclaration:3" targetNodeId="6543581031674026632" resolveInfo="b" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticInnerClassifiers:3" type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="6543581031674026634">
      <property name="name:3" value="CompoundComparator" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674026635" />
      <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674026636">
        <property name="name:3" value="T" />
      </node>
      <node role="implementedInterface:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674026637">
        <link role="classifier:3" targetNodeId="2.~Comparator" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026638">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026636" resolveInfo="T" />
        </node>
      </node>
      <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674026639">
        <property name="isFinal:3" value="true" />
        <property name="name:3" value="secondary" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674026640">
          <link role="classifier:3" targetNodeId="2.~Comparator" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026641">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026636" resolveInfo="T" />
          </node>
        </node>
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674026642" />
      </node>
      <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674026643">
        <property name="isFinal:3" value="true" />
        <property name="name:3" value="primary" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674026644">
          <link role="classifier:3" targetNodeId="2.~Comparator" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026645">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026636" resolveInfo="T" />
          </node>
        </node>
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674026646" />
      </node>
      <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="6543581031674026647">
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674026648" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674026649" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674026650">
          <property name="name:3" value="primary" />
          <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674026651">
            <link role="classifier:3" targetNodeId="2.~Comparator" />
            <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026652">
              <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026636" resolveInfo="T" />
            </node>
          </node>
        </node>
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674026653">
          <property name="name:3" value="secondary" />
          <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674026654">
            <link role="classifier:3" targetNodeId="2.~Comparator" />
            <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026655">
              <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026636" resolveInfo="T" />
            </node>
          </node>
        </node>
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674026879">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674026880">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674026881">
              <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674026882">
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674026883">
                  <link role="fieldDeclaration:3" targetNodeId="6543581031674026643" resolveInfo="primary" />
                </node>
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674026884" />
              </node>
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674026885">
                <link role="variableDeclaration:3" targetNodeId="6543581031674026650" resolveInfo="primary" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674026886">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674026887">
              <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674026888">
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674026889">
                  <link role="fieldDeclaration:3" targetNodeId="6543581031674026639" resolveInfo="secondary" />
                </node>
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674026890" />
              </node>
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674026891">
                <link role="variableDeclaration:3" targetNodeId="6543581031674026653" resolveInfo="secondary" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674026656">
        <property name="name:3" value="compare" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674026657" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="6543581031674026658" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674026659">
          <property name="name:3" value="a" />
          <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026660">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026636" resolveInfo="T" />
          </node>
        </node>
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674026661">
          <property name="name:3" value="b" />
          <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026662">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026636" resolveInfo="T" />
          </node>
        </node>
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674026892">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="6543581031674026893">
            <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="6543581031674026894">
              <property name="name:3" value="c" />
              <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="6543581031674026895" />
              <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674026896">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674026897">
                  <link role="variableDeclaration:3" targetNodeId="6543581031674026643" resolveInfo="primary" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674026898">
                  <link role="baseMethodDeclaration:3" targetNodeId="2.~Comparator.compare(java.lang.Object,java.lang.Object):int" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674026899">
                    <link role="variableDeclaration:3" targetNodeId="6543581031674026659" resolveInfo="a" />
                  </node>
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674026900">
                    <link role="variableDeclaration:3" targetNodeId="6543581031674026661" resolveInfo="b" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674026901">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.TernaryOperatorExpression:3" id="6543581031674026902">
              <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="6543581031674026903">
                <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674026904">
                  <link role="variableDeclaration:3" targetNodeId="6543581031674026894" resolveInfo="c" />
                </node>
                <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="6543581031674026905">
                  <property name="value:3" value="0" />
                </node>
              </node>
              <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674026906">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674026907">
                  <link role="variableDeclaration:3" targetNodeId="6543581031674026639" resolveInfo="secondary" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674026908">
                  <link role="baseMethodDeclaration:3" targetNodeId="2.~Comparator.compare(java.lang.Object,java.lang.Object):int" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674026909">
                    <link role="variableDeclaration:3" targetNodeId="6543581031674026659" resolveInfo="a" />
                  </node>
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674026910">
                    <link role="variableDeclaration:3" targetNodeId="6543581031674026661" resolveInfo="b" />
                  </node>
                </node>
              </node>
              <node role="ifFalse:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674026911">
                <link role="variableDeclaration:3" targetNodeId="6543581031674026894" resolveInfo="c" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674026663">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="input" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674026664">
        <link role="classifier:3" targetNodeId="1.6543581031674023524" resolveInfo="Sequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026665">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026583" resolveInfo="U" />
        </node>
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674026666" />
    </node>
    <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674026667">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="comparator" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674026668">
        <link role="classifier:3" targetNodeId="2.~Comparator" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026669">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026583" resolveInfo="U" />
        </node>
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674026670" />
    </node>
    <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="6543581031674026671">
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674026672" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674026673" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674026674">
        <property name="name:3" value="input" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674026675">
          <link role="classifier:3" targetNodeId="1.6543581031674023524" resolveInfo="Sequence" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026676">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026583" resolveInfo="U" />
          </node>
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674026677">
        <property name="name:3" value="comparator" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674026678">
          <link role="classifier:3" targetNodeId="2.~Comparator" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026679">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026583" resolveInfo="U" />
          </node>
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674026680">
        <property name="name:3" value="ascending" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674026681" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674026682">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674026683">
          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.OrExpression:3" id="6543581031674026684">
            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="6543581031674026685">
              <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674026686">
                <link role="variableDeclaration:3" targetNodeId="6543581031674026674" resolveInfo="input" />
              </node>
              <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674026687" />
            </node>
            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="6543581031674026688">
              <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674026689">
                <link role="variableDeclaration:3" targetNodeId="6543581031674026677" resolveInfo="comparator" />
              </node>
              <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674026690" />
            </node>
          </node>
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674026691">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ThrowStatement:3" id="6543581031674026692">
              <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674026693">
                <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674026694">
                  <link role="baseMethodDeclaration:3" targetNodeId="2v.~NullPointerException.&lt;init&gt;()" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674026695">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674026696">
            <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674026697">
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674026698">
                <link role="fieldDeclaration:3" targetNodeId="6543581031674026663" resolveInfo="input" />
              </node>
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674026699" />
            </node>
            <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674026700">
              <link role="variableDeclaration:3" targetNodeId="6543581031674026674" resolveInfo="input" />
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674026701">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674026702">
            <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674026703">
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674026704">
                <link role="fieldDeclaration:3" targetNodeId="6543581031674026667" resolveInfo="comparator" />
              </node>
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674026705" />
            </node>
            <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.TernaryOperatorExpression:3" id="6543581031674026706">
              <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674026707">
                <link role="variableDeclaration:3" targetNodeId="6543581031674026680" resolveInfo="ascending" />
              </node>
              <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674026708">
                <link role="variableDeclaration:3" targetNodeId="6543581031674026677" resolveInfo="comparator" />
              </node>
              <node role="ifFalse:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674026709">
                <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674026710">
                  <link role="baseMethodDeclaration:3" targetNodeId="6543581031674026621" resolveInfo="SortingSequence.InversedComparator" />
                  <node role="typeParameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026711">
                    <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026583" resolveInfo="U" />
                  </node>
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674026712">
                    <link role="variableDeclaration:3" targetNodeId="6543581031674026677" resolveInfo="comparator" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="6543581031674026713">
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674026714" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674026715" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674026716">
        <property name="name:3" value="input" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674026717">
          <link role="classifier:3" targetNodeId="1.6543581031674023524" resolveInfo="Sequence" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026718">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026583" resolveInfo="U" />
          </node>
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674026719">
        <property name="name:3" value="comparator" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674026720">
          <link role="classifier:3" targetNodeId="2.~Comparator" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026721">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026583" resolveInfo="U" />
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674026722">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674026723">
          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.OrExpression:3" id="6543581031674026724">
            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="6543581031674026725">
              <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674026726">
                <link role="variableDeclaration:3" targetNodeId="6543581031674026716" resolveInfo="input" />
              </node>
              <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674026727" />
            </node>
            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="6543581031674026728">
              <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674026729">
                <link role="variableDeclaration:3" targetNodeId="6543581031674026719" resolveInfo="comparator" />
              </node>
              <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674026730" />
            </node>
          </node>
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674026731">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ThrowStatement:3" id="6543581031674026732">
              <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674026733">
                <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674026734">
                  <link role="baseMethodDeclaration:3" targetNodeId="2v.~NullPointerException.&lt;init&gt;()" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674026735">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674026736">
            <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674026737">
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674026738">
                <link role="fieldDeclaration:3" targetNodeId="6543581031674026663" resolveInfo="input" />
              </node>
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674026739" />
            </node>
            <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674026740">
              <link role="variableDeclaration:3" targetNodeId="6543581031674026716" resolveInfo="input" />
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674026741">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674026742">
            <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674026743">
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674026744">
                <link role="fieldDeclaration:3" targetNodeId="6543581031674026667" resolveInfo="comparator" />
              </node>
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674026745" />
            </node>
            <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674026746">
              <link role="variableDeclaration:3" targetNodeId="6543581031674026719" resolveInfo="comparator" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674026747">
      <property name="name:3" value="iterator" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674026748" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674026749">
        <link role="classifier:3" targetNodeId="2.~Iterator" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026750">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026583" resolveInfo="U" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674026751">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="6543581031674026752">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="6543581031674026753">
            <property name="name:3" value="sortedInput" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674026754">
              <link role="classifier:3" targetNodeId="2.~List" />
              <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026755">
                <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026583" resolveInfo="U" />
              </node>
            </node>
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6543581031674026756">
              <link role="baseMethodDeclaration:3" targetNodeId="6543581031674026801" resolveInfo="inputSortedWithSelector" />
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674026757">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674026758">
            <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674026759">
              <link role="baseMethodDeclaration:3" targetNodeId="6543581031674026597" resolveInfo="SortingSequence.UnmodifiableIterator" />
              <node role="typeParameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026760">
                <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026583" resolveInfo="U" />
              </node>
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674026761">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674026762">
                  <link role="variableDeclaration:3" targetNodeId="6543581031674026753" resolveInfo="sortedInput" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674026763">
                  <link role="baseMethodDeclaration:3" targetNodeId="2.~List.listIterator():java.util.ListIterator" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674026764">
      <property name="name:3" value="alsoSort" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674026765" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674026766">
        <link role="classifier:3" targetNodeId="1.6543581031674024311" resolveInfo="ISequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026767">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026583" resolveInfo="U" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="3473971317150288159">
        <property name="name:3" value="selector" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.closures.structure.FunctionType:3" id="3473971317150288160">
          <node role="parameterType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="3473971317150288166">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026583" resolveInfo="U" />
          </node>
          <node role="resultType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="3473971317150288167">
            <link role="classifier:3" targetNodeId="2v.~Comparable" resolveInfo="Comparable" />
            <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.WildCardType:3" id="3473971317150288169" />
          </node>
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674026773">
        <property name="name:3" value="ascending" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674026774" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674026775">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="6543581031674026776">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="6543581031674026777">
            <property name="name:3" value="selectComparator" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674026778">
              <link role="classifier:3" targetNodeId="1.6543581031674025363" resolveInfo="SelectComparator" />
              <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026779">
                <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026583" resolveInfo="U" />
              </node>
            </node>
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674026780">
              <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674026781">
                <link role="baseMethodDeclaration:3" targetNodeId="1.6543581031674025374" resolveInfo="SelectComparator" />
                <node role="typeParameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026782">
                  <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026583" resolveInfo="U" />
                </node>
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674026783">
                  <link role="variableDeclaration:3" targetNodeId="3473971317150288159" resolveInfo="selector" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674026784">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674026785">
            <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674026786">
              <link role="baseMethodDeclaration:3" targetNodeId="6543581031674026713" resolveInfo="SortingSequence" />
              <node role="typeParameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026787">
                <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026583" resolveInfo="U" />
              </node>
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674026788">
                <link role="variableDeclaration:3" targetNodeId="6543581031674026663" resolveInfo="input" />
              </node>
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674026789">
                <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674026790">
                  <link role="baseMethodDeclaration:3" targetNodeId="6543581031674026647" resolveInfo="SortingSequence.CompoundComparator" />
                  <node role="typeParameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026791">
                    <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026583" resolveInfo="U" />
                  </node>
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674026792">
                    <link role="variableDeclaration:3" targetNodeId="6543581031674026667" resolveInfo="comparator" />
                  </node>
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.TernaryOperatorExpression:3" id="6543581031674026793">
                    <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674026794">
                      <link role="variableDeclaration:3" targetNodeId="6543581031674026773" resolveInfo="ascending" />
                    </node>
                    <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674026795">
                      <link role="variableDeclaration:3" targetNodeId="6543581031674026777" resolveInfo="selectComparator" />
                    </node>
                    <node role="ifFalse:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674026796">
                      <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674026797">
                        <link role="baseMethodDeclaration:3" targetNodeId="6543581031674026621" resolveInfo="SortingSequence.InversedComparator" />
                        <node role="typeParameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026798">
                          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026583" resolveInfo="U" />
                        </node>
                        <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674026799">
                          <link role="variableDeclaration:3" targetNodeId="6543581031674026777" resolveInfo="selectComparator" />
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
      <node role="annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="6543581031674026800">
        <link role="annotation:3" targetNodeId="2v.~Override" />
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674026801">
      <property name="name:3" value="inputSortedWithSelector" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674026802" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674026803">
        <link role="classifier:3" targetNodeId="2.~List" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026804">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026583" resolveInfo="U" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674026805">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="6543581031674026806">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="6543581031674026807">
            <property name="name:3" value="cache" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674026808">
              <link role="classifier:3" targetNodeId="2.~ArrayList" />
              <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026809">
                <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026583" resolveInfo="U" />
              </node>
            </node>
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674026810">
              <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674026811">
                <link role="baseMethodDeclaration:3" targetNodeId="2.~ArrayList.&lt;init&gt;()" />
                <node role="typeParameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026812">
                  <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026583" resolveInfo="U" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="6543581031674026813">
          <node role="iterable:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674026814">
            <link role="variableDeclaration:3" targetNodeId="6543581031674026663" resolveInfo="input" />
          </node>
          <node role="variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="6543581031674026815">
            <property name="name:3" value="u" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026816">
              <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026583" resolveInfo="U" />
            </node>
          </node>
          <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674026817">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674026818">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674026819">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674026820">
                  <link role="variableDeclaration:3" targetNodeId="6543581031674026807" resolveInfo="cache" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674026821">
                  <link role="baseMethodDeclaration:3" targetNodeId="2.~ArrayList.add(java.lang.Object):boolean" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674026822">
                    <link role="variableDeclaration:3" targetNodeId="6543581031674026815" resolveInfo="u" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="6543581031674026823">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="6543581031674026824">
            <property name="name:3" value="array" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ArrayType:3" id="6543581031674026825">
              <node role="componentType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026826">
                <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026583" resolveInfo="U" />
              </node>
            </node>
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.CastExpression:3" id="6543581031674026827">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674026828">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674026829">
                  <link role="variableDeclaration:3" targetNodeId="6543581031674026807" resolveInfo="cache" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674026830">
                  <link role="baseMethodDeclaration:3" targetNodeId="2.~ArrayList.toArray():java.lang.Object[]" />
                </node>
              </node>
              <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ArrayType:3" id="6543581031674026831">
                <node role="componentType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026832">
                  <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026583" resolveInfo="U" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674026833">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="6543581031674026834">
            <link role="classConcept:3" targetNodeId="2.~Arrays" />
            <link role="baseMethodDeclaration:3" targetNodeId="2.~Arrays.sort(java.lang.Object[],java.util.Comparator):void" />
            <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674026835">
              <link role="variableDeclaration:3" targetNodeId="6543581031674026824" resolveInfo="array" />
            </node>
            <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674026836">
              <link role="variableDeclaration:3" targetNodeId="6543581031674026667" resolveInfo="comparator" />
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674026837">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="6543581031674026838">
            <link role="classConcept:3" targetNodeId="2.~Arrays" />
            <link role="baseMethodDeclaration:3" targetNodeId="2.~Arrays.asList(java.lang.Object...):java.util.List" />
            <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674026839">
              <link role="variableDeclaration:3" targetNodeId="6543581031674026824" resolveInfo="array" />
            </node>
          </node>
        </node>
      </node>
      <node role="annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="6543581031674026840">
        <link role="annotation:3" targetNodeId="2v.~SuppressWarnings" />
        <node role="value:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstanceValue:3" id="6543581031674026841">
          <link role="key:3" targetNodeId="2v.~SuppressWarnings.value()" />
          <node role="value:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="6543581031674026842">
            <property name="value:3" value="unchecked" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="6543581031674026912">
    <property name="name:3" value="NullListSequence" />
    <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674026913" />
    <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674026914">
      <property name="name:3" value="T" />
    </node>
    <node role="superclass:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674026915">
      <link role="classifier:3" targetNodeId="6543581031674024631" resolveInfo="NullCollectionSequence" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026916">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026914" resolveInfo="T" />
      </node>
    </node>
    <node role="implementedInterface:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674026917">
      <link role="classifier:3" targetNodeId="1.6543581031674030017" resolveInfo="IListSequence" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026918">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026914" resolveInfo="T" />
      </node>
    </node>
    <node role="implementedInterface:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674026919">
      <link role="classifier:3" targetNodeId="2.~List" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026920">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026914" resolveInfo="T" />
      </node>
    </node>
    <node role="staticInnerClassifiers:3" type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="6543581031674026921">
      <property name="name:3" value="EmptyListIterator" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.ProtectedVisibility:3" id="6543581031674026922" />
      <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674026923">
        <property name="name:3" value="U" />
      </node>
      <node role="implementedInterface:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674026924">
        <link role="classifier:3" targetNodeId="2.~ListIterator" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026925">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026923" resolveInfo="U" />
        </node>
      </node>
      <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="6543581031674026926">
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.ProtectedVisibility:3" id="6543581031674026927" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674026928" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027259" />
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674026929">
        <property name="name:3" value="add" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674026930" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674026931" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674026932">
          <property name="name:3" value="e" />
          <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026933">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026923" resolveInfo="U" />
          </node>
        </node>
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027260" />
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674026934">
        <property name="name:3" value="hasNext" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674026935" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674026936" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027261">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027262">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="6543581031674027263" />
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674026937">
        <property name="name:3" value="hasPrevious" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674026938" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674026939" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027264">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027265">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="6543581031674027266" />
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674026940">
        <property name="name:3" value="next" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674026941" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026942">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026923" resolveInfo="U" />
        </node>
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027267">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ThrowStatement:3" id="6543581031674027268">
            <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674027269">
              <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674027270">
                <link role="baseMethodDeclaration:3" targetNodeId="2.~NoSuchElementException.&lt;init&gt;()" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674026943">
        <property name="name:3" value="nextIndex" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674026944" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="6543581031674026945" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027271">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027272">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.UnaryMinus:3" id="6543581031674027273">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="6543581031674027274">
                <property name="value:3" value="1" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674026946">
        <property name="name:3" value="previous" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674026947" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026948">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026923" resolveInfo="U" />
        </node>
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027275">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027276">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674027277" />
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674026949">
        <property name="name:3" value="previousIndex" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674026950" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="6543581031674026951" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027278">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027279">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.UnaryMinus:3" id="6543581031674027280">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="6543581031674027281">
                <property name="value:3" value="1" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674026952">
        <property name="name:3" value="remove" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674026953" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674026954" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027282">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ThrowStatement:3" id="6543581031674027283">
            <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674027284">
              <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674027285">
                <link role="baseMethodDeclaration:3" targetNodeId="2v.~UnsupportedOperationException.&lt;init&gt;()" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674026955">
        <property name="name:3" value="set" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674026956" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674026957" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674026958">
          <property name="name:3" value="e" />
          <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026959">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026923" resolveInfo="U" />
          </node>
        </node>
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027286">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ThrowStatement:3" id="6543581031674027287">
            <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674027288">
              <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674027289">
                <link role="baseMethodDeclaration:3" targetNodeId="2v.~UnsupportedOperationException.&lt;init&gt;()" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticField:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration:3" id="6543581031674026960">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="INSTANCE" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674026961">
        <link role="classifier:3" targetNodeId="6543581031674026912" resolveInfo="NullListSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674026962">
          <link role="classifier:3" targetNodeId="2v.~Object" />
        </node>
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674026963" />
      <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674026964">
        <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674026965">
          <link role="baseMethodDeclaration:3" targetNodeId="6543581031674026981" resolveInfo="NullListSequence" />
          <node role="typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674026966">
            <link role="classifier:3" targetNodeId="2v.~Object" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration:3" id="6543581031674026967">
      <property name="name:3" value="instance" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674026968" />
      <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674026969">
        <property name="name:3" value="U" />
      </node>
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674026970">
        <link role="classifier:3" targetNodeId="6543581031674026912" resolveInfo="NullListSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026971">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026969" resolveInfo="U" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674026972">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674026973">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.CastExpression:3" id="6543581031674026974">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalStaticFieldReference:3" id="6543581031674026975">
              <link role="variableDeclaration:3" targetNodeId="6543581031674026960" resolveInfo="INSTANCE" />
            </node>
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674026976">
              <link role="classifier:3" targetNodeId="6543581031674026912" resolveInfo="NullListSequence" />
              <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026977">
                <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026969" resolveInfo="U" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="6543581031674026978">
        <link role="annotation:3" targetNodeId="2v.~SuppressWarnings" />
        <node role="value:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstanceValue:3" id="6543581031674026979">
          <link role="key:3" targetNodeId="2v.~SuppressWarnings.value()" />
          <node role="value:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="6543581031674026980">
            <property name="value:3" value="unchecked" />
          </node>
        </node>
      </node>
    </node>
    <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="6543581031674026981">
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.ProtectedVisibility:3" id="6543581031674026982" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674026983" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674026984" />
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674026985">
      <property name="name:3" value="add" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674026986" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674026987" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674026988">
        <property name="name:3" value="index" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="6543581031674026989" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674026990">
        <property name="name:3" value="element" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674026991">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026914" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674026992" />
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674026993">
      <property name="name:3" value="addAll" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674026994" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674026995" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674026996">
        <property name="name:3" value="index" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="6543581031674026997" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674026998">
        <property name="name:3" value="c" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674026999">
          <link role="classifier:3" targetNodeId="2.~Collection" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.UpperBoundType:3" id="6543581031674027000">
            <node role="bound:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027001">
              <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026914" resolveInfo="T" />
            </node>
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027002">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027003">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="6543581031674027004" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674027005">
      <property name="name:3" value="get" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027006" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027007">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026914" resolveInfo="T" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674027008">
        <property name="name:3" value="index" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="6543581031674027009" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027010">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027011">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674027012" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674027013">
      <property name="name:3" value="indexOf" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027014" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="6543581031674027015" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674027016">
        <property name="name:3" value="t" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674027017">
          <link role="classifier:3" targetNodeId="2v.~Object" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027018">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027019">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.UnaryMinus:3" id="6543581031674027020">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="6543581031674027021">
              <property name="value:3" value="1" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674027022">
      <property name="name:3" value="lastIndexOf" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027023" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="6543581031674027024" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674027025">
        <property name="name:3" value="o" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674027026">
          <link role="classifier:3" targetNodeId="2v.~Object" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027027">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027028">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.UnaryMinus:3" id="6543581031674027029">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="6543581031674027030">
              <property name="value:3" value="1" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674027031">
      <property name="name:3" value="listIterator" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027032" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674027033">
        <link role="classifier:3" targetNodeId="2.~ListIterator" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027034">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026914" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027035">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027036">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674027037">
            <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674027038">
              <link role="baseMethodDeclaration:3" targetNodeId="6543581031674026926" resolveInfo="NullListSequence.EmptyListIterator" />
              <node role="typeParameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027039">
                <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026914" resolveInfo="T" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674027040">
      <property name="name:3" value="listIterator" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027041" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674027042">
        <link role="classifier:3" targetNodeId="2.~ListIterator" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027043">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026914" resolveInfo="T" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674027044">
        <property name="name:3" value="index" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="6543581031674027045" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027046">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027047">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674027048">
            <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674027049">
              <link role="baseMethodDeclaration:3" targetNodeId="6543581031674026926" resolveInfo="NullListSequence.EmptyListIterator" />
              <node role="typeParameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027050">
                <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026914" resolveInfo="T" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674027051">
      <property name="name:3" value="remove" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027052" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027053">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026914" resolveInfo="T" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674027054">
        <property name="name:3" value="index" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="6543581031674027055" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027056">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027057">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674027058" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674027059">
      <property name="name:3" value="set" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027060" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027061">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026914" resolveInfo="T" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674027062">
        <property name="name:3" value="index" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="6543581031674027063" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674027064">
        <property name="name:3" value="element" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027065">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026914" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027066">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027067">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674027068" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674027069">
      <property name="name:3" value="size" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027070" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="6543581031674027071" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027072">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027073">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="6543581031674027074">
            <property name="value:3" value="0" />
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674027075">
      <property name="name:3" value="subList" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027076" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674027077">
        <link role="classifier:3" targetNodeId="2.~List" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027078">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026914" resolveInfo="T" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674027079">
        <property name="name:3" value="fromIndex" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="6543581031674027080" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674027081">
        <property name="name:3" value="toIndex" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="6543581031674027082" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027083">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027084">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674027085" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674027086">
      <property name="name:3" value="removeElementAt" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027087" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027088">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026914" resolveInfo="T" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674027089">
        <property name="name:3" value="idx" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="6543581031674027090" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027091">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027092">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674027093" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674027094">
      <property name="name:3" value="removeLastElement" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027095" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027096">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026914" resolveInfo="T" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027097">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027098">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674027099" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674027100">
      <property name="name:3" value="insertElement" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027101" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027102">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026914" resolveInfo="T" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674027103">
        <property name="name:3" value="idx" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="6543581031674027104" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674027105">
        <property name="name:3" value="t" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027106">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026914" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027107">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027108">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674027109" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674027110">
      <property name="name:3" value="getElement" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027111" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027112">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026914" resolveInfo="T" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674027113">
        <property name="name:3" value="idx" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="6543581031674027114" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027115">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027116">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674027117" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674027118">
      <property name="name:3" value="setElement" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027119" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027120">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026914" resolveInfo="T" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674027121">
        <property name="name:3" value="idx" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="6543581031674027122" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674027123">
        <property name="name:3" value="t" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027124">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026914" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027125">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027126">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674027127" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674027128">
      <property name="name:3" value="addSequence" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027129" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674027130">
        <link role="classifier:3" targetNodeId="1.6543581031674030017" resolveInfo="IListSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027131">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026914" resolveInfo="T" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674027132">
        <property name="name:3" value="seq" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674027133">
          <link role="classifier:3" targetNodeId="1.6543581031674024311" resolveInfo="ISequence" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.UpperBoundType:3" id="6543581031674027134">
            <node role="bound:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027135">
              <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026914" resolveInfo="T" />
            </node>
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027136">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027137">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674027138" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674027139">
      <property name="name:3" value="reversedList" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027140" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674027141">
        <link role="classifier:3" targetNodeId="1.6543581031674030017" resolveInfo="IListSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027142">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026914" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027143">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027144">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674027145" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674027146">
      <property name="name:3" value="subListSequence" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027147" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674027148">
        <link role="classifier:3" targetNodeId="1.6543581031674030017" resolveInfo="IListSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027149">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026914" resolveInfo="T" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674027150">
        <property name="name:3" value="fromIdx" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="6543581031674027151" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674027152">
        <property name="name:3" value="upToIdx" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="6543581031674027153" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027154">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027155">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674027156" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674027157">
      <property name="name:3" value="headListSequence" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027158" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674027159">
        <link role="classifier:3" targetNodeId="1.6543581031674030017" resolveInfo="IListSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027160">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026914" resolveInfo="T" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674027161">
        <property name="name:3" value="upToIdx" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="6543581031674027162" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027163">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027164">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674027165" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674027166">
      <property name="name:3" value="tailListSequence" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027167" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674027168">
        <link role="classifier:3" targetNodeId="1.6543581031674030017" resolveInfo="IListSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027169">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026914" resolveInfo="T" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674027170">
        <property name="name:3" value="fromIdx" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="6543581031674027171" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027172">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027173">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674027174" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674027175">
      <property name="name:3" value="removeSequence" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027176" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674027177">
        <link role="classifier:3" targetNodeId="1.6543581031674030017" resolveInfo="IListSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027178">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026914" resolveInfo="T" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674027179">
        <property name="name:3" value="seq" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674027180">
          <link role="classifier:3" targetNodeId="1.6543581031674024311" resolveInfo="ISequence" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.UpperBoundType:3" id="6543581031674027181">
            <node role="bound:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027182">
              <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026914" resolveInfo="T" />
            </node>
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027183">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027184">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674027185" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674027186">
      <property name="name:3" value="removeWhere" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027187" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674027188">
        <link role="classifier:3" targetNodeId="1.6543581031674030017" resolveInfo="IListSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027189">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026914" resolveInfo="T" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674027190">
        <property name="name:3" value="filter" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.closures.structure.FunctionType:3" id="7730170264858260986">
          <node role="resultType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="7730170264858260987" />
          <node role="parameterType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="7730170264858260991">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026914" resolveInfo="T" />
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027193">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027194">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.CastExpression:3" id="6543581031674027195">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.SuperMethodCall:3" id="6543581031674027196">
              <link role="baseMethodDeclaration:3" targetNodeId="6543581031674024691" resolveInfo="removeWhere" />
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674027197">
                <link role="variableDeclaration:3" targetNodeId="6543581031674027190" resolveInfo="filter" />
              </node>
            </node>
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674027198">
              <link role="classifier:3" targetNodeId="1.6543581031674030017" resolveInfo="IListSequence" />
              <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027199">
                <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026914" resolveInfo="T" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="6543581031674027200">
        <link role="annotation:3" targetNodeId="2v.~Override" />
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674027201">
      <property name="name:3" value="asSynchronized" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027202" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674027203">
        <link role="classifier:3" targetNodeId="1.6543581031674030017" resolveInfo="IListSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027204">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026914" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027205">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027206">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.CastExpression:3" id="6543581031674027207">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.SuperMethodCall:3" id="6543581031674027208">
              <link role="baseMethodDeclaration:3" targetNodeId="6543581031674024773" resolveInfo="asSynchronized" />
            </node>
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674027209">
              <link role="classifier:3" targetNodeId="1.6543581031674030017" resolveInfo="IListSequence" />
              <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027210">
                <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026914" resolveInfo="T" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="6543581031674027211">
        <link role="annotation:3" targetNodeId="2v.~Override" />
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674027212">
      <property name="name:3" value="asUnmodifiable" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027213" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674027214">
        <link role="classifier:3" targetNodeId="1.6543581031674030017" resolveInfo="IListSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027215">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026914" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027216">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027217">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.CastExpression:3" id="6543581031674027218">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.SuperMethodCall:3" id="6543581031674027219">
              <link role="baseMethodDeclaration:3" targetNodeId="6543581031674024766" resolveInfo="asUnmodifiable" />
            </node>
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674027220">
              <link role="classifier:3" targetNodeId="1.6543581031674030017" resolveInfo="IListSequence" />
              <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027221">
                <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026914" resolveInfo="T" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="6543581031674027222">
        <link role="annotation:3" targetNodeId="2v.~Override" />
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674027223">
      <property name="name:3" value="toList" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027224" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674027225">
        <link role="classifier:3" targetNodeId="2.~List" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027226">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026914" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027227">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027228">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674027229" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674027230">
      <property name="name:3" value="toGenericArray" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027231" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ArrayType:3" id="6543581031674027232">
        <node role="componentType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027233">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026914" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027234">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027235">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.CastExpression:3" id="6543581031674027236">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference:3" id="6543581031674027237">
              <link role="classifier:3" targetNodeId="6543581031674024631" resolveInfo="NullCollectionSequence" />
              <link role="variableDeclaration:3" targetNodeId="6543581031674024640" resolveInfo="EMPTY_ARRAY" />
            </node>
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ArrayType:3" id="6543581031674027238">
              <node role="componentType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027239">
                <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026914" resolveInfo="T" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="6543581031674027240">
        <link role="annotation:3" targetNodeId="2v.~SuppressWarnings" />
        <node role="value:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstanceValue:3" id="6543581031674027241">
          <link role="key:3" targetNodeId="2v.~SuppressWarnings.value()" />
          <node role="value:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="6543581031674027242">
            <property name="value:3" value="unchecked" />
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674027243">
      <property name="name:3" value="toGenericArray" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027244" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ArrayType:3" id="6543581031674027245">
        <node role="componentType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027246">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026914" resolveInfo="T" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674027247">
        <property name="name:3" value="runtimeClass" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674027248">
          <link role="classifier:3" targetNodeId="2v.~Class" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027249">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026914" resolveInfo="T" />
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027250">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027251">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.CastExpression:3" id="6543581031674027252">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference:3" id="6543581031674027253">
              <link role="classifier:3" targetNodeId="6543581031674024631" resolveInfo="NullCollectionSequence" />
              <link role="variableDeclaration:3" targetNodeId="6543581031674024640" resolveInfo="EMPTY_ARRAY" />
            </node>
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ArrayType:3" id="6543581031674027254">
              <node role="componentType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027255">
                <link role="typeVariableDeclaration:3" targetNodeId="6543581031674026914" resolveInfo="T" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="6543581031674027256">
        <link role="annotation:3" targetNodeId="2v.~SuppressWarnings" />
        <node role="value:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstanceValue:3" id="6543581031674027257">
          <link role="key:3" targetNodeId="2v.~SuppressWarnings.value()" />
          <node role="value:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="6543581031674027258">
            <property name="value:3" value="unchecked" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="6543581031674027385">
    <property name="name:3" value="LimitedCardinalitySequence" />
    <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027386" />
    <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674027387">
      <property name="name:3" value="U" />
    </node>
    <node role="superclass:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674027388">
      <link role="classifier:3" targetNodeId="1.6543581031674023524" resolveInfo="Sequence" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027389">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674027387" resolveInfo="U" />
      </node>
    </node>
    <node role="staticInnerClassifiers:3" type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="6543581031674027390">
      <property name="name:3" value="LimitedCardinalityIterator" />
      <property name="nonStatic:3" value="true" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674027391" />
      <node role="implementedInterface:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674027392">
        <link role="classifier:3" targetNodeId="2.~Iterator" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027393">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674027387" resolveInfo="U" />
        </node>
      </node>
      <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674027394">
        <property name="name:3" value="inputIt" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674027395">
          <link role="classifier:3" targetNodeId="2.~Iterator" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027396">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674027387" resolveInfo="U" />
          </node>
        </node>
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674027397" />
      </node>
      <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674027398">
        <property name="name:3" value="cardMap" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674027399">
          <link role="classifier:3" targetNodeId="6543581031674028259" resolveInfo="CardinalityMap" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027400">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674027387" resolveInfo="U" />
          </node>
        </node>
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674027401" />
      </node>
      <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674027402">
        <property name="name:3" value="next" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027403">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674027387" resolveInfo="U" />
        </node>
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674027404" />
      </node>
      <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674027405">
        <property name="name:3" value="hasNext" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674027406">
          <link role="classifier:3" targetNodeId="6543581031674034581" resolveInfo="HasNextState" />
        </node>
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674027407" />
        <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="6543581031674027467">
          <link role="enumClass:3" targetNodeId="6543581031674034581" resolveInfo="HasNextState" />
          <link role="enumConstantDeclaration:3" targetNodeId="6543581031674034583" resolveInfo="UNKNOWN" />
        </node>
      </node>
      <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="6543581031674027408">
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027409" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674027410" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027468" />
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674027411">
        <property name="name:3" value="hasNext" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027412" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674027413" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027485">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6401275180973216449">
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6401275180973216450">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6401275180973216465">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6401275180973216466">
                  <link role="baseMethodDeclaration:3" targetNodeId="6401275180973216424" resolveInfo="init" />
                </node>
              </node>
            </node>
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="6401275180973216461">
              <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6401275180973216464" />
              <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6401275180973216460">
                <link role="variableDeclaration:3" targetNodeId="6543581031674027394" resolveInfo="inputIt" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674027486">
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674027487">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674027488">
                <link role="variableDeclaration:3" targetNodeId="6543581031674027405" resolveInfo="hasNext" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674027489">
                <link role="baseMethodDeclaration:3" targetNodeId="6543581031674034605" resolveInfo="unknown" />
              </node>
            </node>
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027490">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674027491">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6543581031674027492">
                  <link role="baseMethodDeclaration:3" targetNodeId="6543581031674027420" resolveInfo="moveToNext" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027493">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674027494">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674027495">
                <link role="variableDeclaration:3" targetNodeId="6543581031674027405" resolveInfo="hasNext" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674027496">
                <link role="baseMethodDeclaration:3" targetNodeId="6543581031674034613" resolveInfo="hasNext" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674027414">
        <property name="name:3" value="next" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027415" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027416">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674027387" resolveInfo="U" />
        </node>
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027497">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6401275180973216467">
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6401275180973216468">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6401275180973216469">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6401275180973216470">
                  <link role="baseMethodDeclaration:3" targetNodeId="6401275180973216424" resolveInfo="init" />
                </node>
              </node>
            </node>
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="6401275180973216471">
              <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6401275180973216472" />
              <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6401275180973216473">
                <link role="variableDeclaration:3" targetNodeId="6543581031674027394" resolveInfo="inputIt" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674027498">
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674027499">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674027500">
                <link role="variableDeclaration:3" targetNodeId="6543581031674027405" resolveInfo="hasNext" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674027501">
                <link role="baseMethodDeclaration:3" targetNodeId="6543581031674034605" resolveInfo="unknown" />
              </node>
            </node>
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027502">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674027503">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6543581031674027504">
                  <link role="baseMethodDeclaration:3" targetNodeId="6543581031674027420" resolveInfo="moveToNext" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674027505">
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.NotExpression:3" id="6543581031674027506">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression:3" id="6543581031674027507">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674027508">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674027509">
                    <link role="variableDeclaration:3" targetNodeId="6543581031674027405" resolveInfo="hasNext" />
                  </node>
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674027510">
                    <link role="baseMethodDeclaration:3" targetNodeId="6543581031674034613" resolveInfo="hasNext" />
                  </node>
                </node>
              </node>
            </node>
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027511">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ThrowStatement:3" id="6543581031674027512">
                <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674027513">
                  <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674027514">
                    <link role="baseMethodDeclaration:3" targetNodeId="2.~NoSuchElementException.&lt;init&gt;()" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6401275180973216521">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6401275180973216522">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6401275180973216523" />
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6401275180973216524">
                <link role="baseMethodDeclaration:3" targetNodeId="6401275180973216500" resolveInfo="clearNext" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674027417">
        <property name="name:3" value="remove" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027418" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674027419" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027523">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ThrowStatement:3" id="6543581031674027524">
            <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674027525">
              <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674027526">
                <link role="baseMethodDeclaration:3" targetNodeId="2v.~UnsupportedOperationException.&lt;init&gt;()" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674027420">
        <property name="name:3" value="moveToNext" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674027421" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674027422" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027527">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674027528">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674027529">
              <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674027530">
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674027531">
                  <link role="fieldDeclaration:3" targetNodeId="6543581031674027402" resolveInfo="next" />
                </node>
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674027532" />
              </node>
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674027533" />
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674027534">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674027535">
              <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674027536">
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674027537">
                  <link role="fieldDeclaration:3" targetNodeId="6543581031674027405" resolveInfo="hasNext" />
                </node>
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674027538" />
              </node>
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="6543581031674027539">
                <link role="enumClass:3" targetNodeId="6543581031674034581" resolveInfo="HasNextState" />
                <link role="enumConstantDeclaration:3" targetNodeId="6543581031674034588" resolveInfo="AT_END" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.WhileStatement:3" id="6543581031674027540">
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674027541">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674027542">
                <link role="variableDeclaration:3" targetNodeId="6543581031674027394" resolveInfo="inputIt" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674027543">
                <link role="baseMethodDeclaration:3" targetNodeId="2.~Iterator.hasNext():boolean" />
              </node>
            </node>
            <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027544">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="6543581031674027545">
                <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="6543581031674027546">
                  <property name="name:3" value="tmp" />
                  <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027547">
                    <link role="typeVariableDeclaration:3" targetNodeId="6543581031674027387" resolveInfo="U" />
                  </node>
                  <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674027548">
                    <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674027549">
                      <link role="variableDeclaration:3" targetNodeId="6543581031674027394" resolveInfo="inputIt" />
                    </node>
                    <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674027550">
                      <link role="baseMethodDeclaration:3" targetNodeId="2.~Iterator.next():java.lang.Object" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674027551">
                <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.LessThanExpression:3" id="6543581031674027552">
                  <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674027553">
                    <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674027554">
                      <link role="variableDeclaration:3" targetNodeId="6543581031674027398" resolveInfo="cardMap" />
                    </node>
                    <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674027555">
                      <link role="baseMethodDeclaration:3" targetNodeId="6543581031674028293" resolveInfo="postInc" />
                      <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674027556">
                        <link role="variableDeclaration:3" targetNodeId="6543581031674027546" resolveInfo="tmp" />
                      </node>
                    </node>
                  </node>
                  <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674027557">
                    <link role="variableDeclaration:3" targetNodeId="6543581031674027427" resolveInfo="maxCardinality" />
                  </node>
                </node>
                <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027558">
                  <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674027559">
                    <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674027560">
                      <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674027561">
                        <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674027562">
                          <link role="fieldDeclaration:3" targetNodeId="6543581031674027402" resolveInfo="next" />
                        </node>
                        <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674027563" />
                      </node>
                      <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674027564">
                        <link role="variableDeclaration:3" targetNodeId="6543581031674027546" resolveInfo="tmp" />
                      </node>
                    </node>
                  </node>
                  <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674027565">
                    <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674027566">
                      <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674027567">
                        <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674027568">
                          <link role="fieldDeclaration:3" targetNodeId="6543581031674027405" resolveInfo="hasNext" />
                        </node>
                        <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674027569" />
                      </node>
                      <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="6543581031674027570">
                        <link role="enumClass:3" targetNodeId="6543581031674034581" resolveInfo="HasNextState" />
                        <link role="enumConstantDeclaration:3" targetNodeId="6543581031674034586" resolveInfo="HAS_NEXT" />
                      </node>
                    </node>
                  </node>
                  <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027571" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674027572">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674027573">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674027574">
                <link role="variableDeclaration:3" targetNodeId="6543581031674027398" resolveInfo="cardMap" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674027575">
                <link role="baseMethodDeclaration:3" targetNodeId="6543581031674028383" resolveInfo="clear" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6401275180973216500">
        <property name="name:3" value="clearNext" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6401275180973216501" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6401275180973216502">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674027387" resolveInfo="U" />
        </node>
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6401275180973216503">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="6401275180973216504">
            <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="6401275180973216499">
              <property name="name:3" value="tmp" />
              <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6401275180973216505">
                <link role="typeVariableDeclaration:3" targetNodeId="6543581031674027387" resolveInfo="U" />
              </node>
              <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6401275180973216506">
                <link role="variableDeclaration:3" targetNodeId="6543581031674027402" resolveInfo="next" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6401275180973216507">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6401275180973216508">
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6401275180973216509" />
              <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6401275180973216510">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6401275180973216511" />
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6401275180973216512">
                  <link role="fieldDeclaration:3" targetNodeId="6543581031674027402" resolveInfo="next" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6401275180973216513">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6401275180973216514">
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="6401275180973216515">
                <link role="enumConstantDeclaration:3" targetNodeId="6543581031674034583" resolveInfo="UNKNOWN" />
                <link role="enumClass:3" targetNodeId="6543581031674034581" resolveInfo="HasNextState" />
              </node>
              <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6401275180973216516">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6401275180973216517" />
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6401275180973216518">
                  <link role="fieldDeclaration:3" targetNodeId="6543581031674027405" resolveInfo="hasNext" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6401275180973216519">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6401275180973216520">
              <link role="variableDeclaration:3" targetNodeId="6401275180973216499" resolveInfo="tmp" />
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6401275180973216424">
        <property name="name:3" value="init" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6401275180973216425" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6401275180973216426" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6401275180973216427">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6401275180973216428">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6401275180973216429">
              <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6401275180973216430">
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6401275180973216431">
                  <link role="fieldDeclaration:3" targetNodeId="6543581031674027394" resolveInfo="inputIt" />
                </node>
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6401275180973216432" />
              </node>
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6401275180973216433">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6401275180973216434">
                  <link role="variableDeclaration:3" targetNodeId="6543581031674027423" resolveInfo="input" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6401275180973216435">
                  <link role="baseMethodDeclaration:3" targetNodeId="2v.~Iterable.iterator():java.util.Iterator" resolveInfo="iterator" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6401275180973216436">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6401275180973216437">
              <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6401275180973216438">
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6401275180973216439">
                  <link role="fieldDeclaration:3" targetNodeId="6543581031674027398" resolveInfo="cardMap" />
                </node>
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6401275180973216440" />
              </node>
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6401275180973216441">
                <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6401275180973216442">
                  <link role="baseMethodDeclaration:3" targetNodeId="6543581031674028270" resolveInfo="CardinalityMap" />
                  <node role="typeParameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6401275180973216443">
                    <link role="typeVariableDeclaration:3" targetNodeId="6543581031674027387" resolveInfo="U" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674027423">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="input" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674027424">
        <link role="classifier:3" targetNodeId="1.6543581031674023524" resolveInfo="Sequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027425">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674027387" resolveInfo="U" />
        </node>
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674027426" />
    </node>
    <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674027427">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="maxCardinality" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="6543581031674027428" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674027429" />
    </node>
    <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="6543581031674027430">
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027431" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674027432" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674027433">
        <property name="name:3" value="input" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674027434">
          <link role="classifier:3" targetNodeId="1.6543581031674023524" resolveInfo="Sequence" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027435">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674027387" resolveInfo="U" />
          </node>
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674027436">
        <property name="name:3" value="maxCardinality" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="6543581031674027437" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027438">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674027439">
          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="6543581031674027440">
            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674027441">
              <link role="variableDeclaration:3" targetNodeId="6543581031674027433" resolveInfo="input" />
            </node>
            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674027442" />
          </node>
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027443">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ThrowStatement:3" id="6543581031674027444">
              <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674027445">
                <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674027446">
                  <link role="baseMethodDeclaration:3" targetNodeId="2v.~NullPointerException.&lt;init&gt;()" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674027447">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674027448">
            <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674027449">
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674027450">
                <link role="fieldDeclaration:3" targetNodeId="6543581031674027423" resolveInfo="input" />
              </node>
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674027451" />
            </node>
            <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674027452">
              <link role="variableDeclaration:3" targetNodeId="6543581031674027433" resolveInfo="input" />
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674027453">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674027454">
            <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674027455">
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674027456">
                <link role="fieldDeclaration:3" targetNodeId="6543581031674027427" resolveInfo="maxCardinality" />
              </node>
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674027457" />
            </node>
            <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674027458">
              <link role="variableDeclaration:3" targetNodeId="6543581031674027436" resolveInfo="maxCardinality" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674027459">
      <property name="name:3" value="iterator" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027460" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674027461">
        <link role="classifier:3" targetNodeId="2.~Iterator" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027462">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674027387" resolveInfo="U" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027463">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027464">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674027465">
            <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674027466">
              <link role="baseMethodDeclaration:3" targetNodeId="6543581031674027408" resolveInfo="LimitedCardinalitySequence.LimitedCardinalityIterator" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="6543581031674027576">
    <property name="name:3" value="NullQueueSequence" />
    <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027577" />
    <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674027578">
      <property name="name:3" value="T" />
    </node>
    <node role="superclass:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674027579">
      <link role="classifier:3" targetNodeId="6543581031674024631" resolveInfo="NullCollectionSequence" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027580">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674027578" resolveInfo="T" />
      </node>
    </node>
    <node role="implementedInterface:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674027581">
      <link role="classifier:3" targetNodeId="1.6543581031674036013" resolveInfo="IQueueSequence" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027582">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674027578" resolveInfo="T" />
      </node>
    </node>
    <node role="implementedInterface:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674027583">
      <link role="classifier:3" targetNodeId="2.~Queue" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027584">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674027578" resolveInfo="T" />
      </node>
    </node>
    <node role="staticField:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration:3" id="6543581031674027585">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="INSTANCE" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674027586">
        <link role="classifier:3" targetNodeId="6543581031674027576" resolveInfo="NullQueueSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674027587">
          <link role="classifier:3" targetNodeId="2v.~Object" />
        </node>
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674027588" />
      <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674027589">
        <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674027590">
          <link role="baseMethodDeclaration:3" targetNodeId="6543581031674027606" resolveInfo="NullQueueSequence" />
          <node role="typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674027591">
            <link role="classifier:3" targetNodeId="2v.~Object" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration:3" id="6543581031674027592">
      <property name="name:3" value="instance" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027593" />
      <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674027594">
        <property name="name:3" value="U" />
      </node>
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674027595">
        <link role="classifier:3" targetNodeId="6543581031674027576" resolveInfo="NullQueueSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027596">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674027594" resolveInfo="U" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027597">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027598">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.CastExpression:3" id="6543581031674027599">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalStaticFieldReference:3" id="6543581031674027600">
              <link role="variableDeclaration:3" targetNodeId="6543581031674027585" resolveInfo="INSTANCE" />
            </node>
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674027601">
              <link role="classifier:3" targetNodeId="6543581031674027576" resolveInfo="NullQueueSequence" />
              <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027602">
                <link role="typeVariableDeclaration:3" targetNodeId="6543581031674027594" resolveInfo="U" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="6543581031674027603">
        <link role="annotation:3" targetNodeId="2v.~SuppressWarnings" />
        <node role="value:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstanceValue:3" id="6543581031674027604">
          <link role="key:3" targetNodeId="2v.~SuppressWarnings.value()" />
          <node role="value:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="6543581031674027605">
            <property name="value:3" value="unchecked" />
          </node>
        </node>
      </node>
    </node>
    <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="6543581031674027606">
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.ProtectedVisibility:3" id="6543581031674027607" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674027608" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027609" />
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674027610">
      <property name="name:3" value="addLastElement" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027611" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027612">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674027578" resolveInfo="T" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674027613">
        <property name="name:3" value="t" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027614">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674027578" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027615">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027616">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674027617" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674027618">
      <property name="name:3" value="first" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027619" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027620">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674027578" resolveInfo="T" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027621">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027622">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674027623" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674027624">
      <property name="name:3" value="removeFirstElement" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027625" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027626">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674027578" resolveInfo="T" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027627">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027628">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674027629" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674027630">
      <property name="name:3" value="addSequence" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027631" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674027632">
        <link role="classifier:3" targetNodeId="1.6543581031674036013" resolveInfo="IQueueSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027633">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674027578" resolveInfo="T" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674027634">
        <property name="name:3" value="seq" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674027635">
          <link role="classifier:3" targetNodeId="1.6543581031674024311" resolveInfo="ISequence" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.UpperBoundType:3" id="6543581031674027636">
            <node role="bound:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027637">
              <link role="typeVariableDeclaration:3" targetNodeId="6543581031674027578" resolveInfo="T" />
            </node>
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027638">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027639">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674027640" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674027641">
      <property name="name:3" value="removeSequence" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027642" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674027643">
        <link role="classifier:3" targetNodeId="1.6543581031674036013" resolveInfo="IQueueSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027644">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674027578" resolveInfo="T" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674027645">
        <property name="name:3" value="seq" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674027646">
          <link role="classifier:3" targetNodeId="1.6543581031674024311" resolveInfo="ISequence" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.UpperBoundType:3" id="6543581031674027647">
            <node role="bound:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027648">
              <link role="typeVariableDeclaration:3" targetNodeId="6543581031674027578" resolveInfo="T" />
            </node>
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027649">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027650">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674027651" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674027652">
      <property name="name:3" value="removeWhere" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027653" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674027654">
        <link role="classifier:3" targetNodeId="1.6543581031674036013" resolveInfo="IQueueSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027655">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674027578" resolveInfo="T" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674027656">
        <property name="name:3" value="filter" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.closures.structure.FunctionType:3" id="7730170264858260993">
          <node role="resultType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="7730170264858260994" />
          <node role="parameterType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="7730170264858260998">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674027578" resolveInfo="T" />
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027659">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027660">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.CastExpression:3" id="6543581031674027661">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.SuperMethodCall:3" id="6543581031674027662">
              <link role="baseMethodDeclaration:3" targetNodeId="6543581031674024691" resolveInfo="removeWhere" />
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674027663">
                <link role="variableDeclaration:3" targetNodeId="6543581031674027656" resolveInfo="filter" />
              </node>
            </node>
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674027664">
              <link role="classifier:3" targetNodeId="1.6543581031674036013" resolveInfo="IQueueSequence" />
              <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027665">
                <link role="typeVariableDeclaration:3" targetNodeId="6543581031674027578" resolveInfo="T" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="6543581031674027666">
        <link role="annotation:3" targetNodeId="2v.~Override" />
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674027667">
      <property name="name:3" value="asUnmodifiable" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027668" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674027669">
        <link role="classifier:3" targetNodeId="1.6543581031674036013" resolveInfo="IQueueSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027670">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674027578" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027671">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027672">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.CastExpression:3" id="6543581031674027673">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.SuperMethodCall:3" id="6543581031674027674">
              <link role="baseMethodDeclaration:3" targetNodeId="6543581031674024766" resolveInfo="asUnmodifiable" />
            </node>
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674027675">
              <link role="classifier:3" targetNodeId="1.6543581031674036013" resolveInfo="IQueueSequence" />
              <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027676">
                <link role="typeVariableDeclaration:3" targetNodeId="6543581031674027578" resolveInfo="T" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="6543581031674027677">
        <link role="annotation:3" targetNodeId="2v.~Override" />
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674027678">
      <property name="name:3" value="asSynchronized" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027679" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674027680">
        <link role="classifier:3" targetNodeId="1.6543581031674036013" resolveInfo="IQueueSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027681">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674027578" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027682">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027683">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.CastExpression:3" id="6543581031674027684">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.SuperMethodCall:3" id="6543581031674027685">
              <link role="baseMethodDeclaration:3" targetNodeId="6543581031674024773" resolveInfo="asSynchronized" />
            </node>
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674027686">
              <link role="classifier:3" targetNodeId="1.6543581031674036013" resolveInfo="IQueueSequence" />
              <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027687">
                <link role="typeVariableDeclaration:3" targetNodeId="6543581031674027578" resolveInfo="T" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="6543581031674027688">
        <link role="annotation:3" targetNodeId="2v.~Override" />
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674027689">
      <property name="name:3" value="toQueue" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027690" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674027691">
        <link role="classifier:3" targetNodeId="2.~Queue" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027692">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674027578" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027693">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027694">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674027695" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674027696">
      <property name="name:3" value="element" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027697" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027698">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674027578" resolveInfo="T" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027699">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027700">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674027701" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674027702">
      <property name="name:3" value="offer" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027703" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674027704" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674027705">
        <property name="name:3" value="o" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027706">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674027578" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027707">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027708">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="6543581031674027709" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674027710">
      <property name="name:3" value="peek" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027711" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027712">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674027578" resolveInfo="T" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027713">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027714">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674027715" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674027716">
      <property name="name:3" value="poll" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027717" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027718">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674027578" resolveInfo="T" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027719">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027720">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674027721" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674027722">
      <property name="name:3" value="remove" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674027723" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674027724">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674027578" resolveInfo="T" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674027725">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674027726">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674027727" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="6543581031674028259">
    <property name="name:3" value="CardinalityMap" />
    <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674028260">
      <property name="name:3" value="U" />
    </node>
    <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674028261">
      <property name="name:3" value="map" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674028262">
        <link role="classifier:3" targetNodeId="2.~HashMap" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674028263">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674028260" resolveInfo="U" />
        </node>
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674028264">
          <link role="classifier:3" targetNodeId="2v.~Integer" />
        </node>
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674028265" />
      <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674028266">
        <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674028267">
          <link role="baseMethodDeclaration:3" targetNodeId="2.~HashMap.&lt;init&gt;()" />
          <node role="typeParameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674028268">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674028260" resolveInfo="U" />
          </node>
          <node role="typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674028269">
            <link role="classifier:3" targetNodeId="2v.~Integer" />
          </node>
        </node>
      </node>
    </node>
    <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="6543581031674028270">
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674028271" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028272" />
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674028273">
      <property name="name:3" value="card" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674028274" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="6543581031674028275" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674028276">
        <property name="name:3" value="u" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674028277">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674028260" resolveInfo="U" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028278">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="6543581031674028279">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="6543581031674028280">
            <property name="name:3" value="c" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674028281">
              <link role="classifier:3" targetNodeId="2v.~Integer" />
            </node>
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028282">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028283">
                <link role="variableDeclaration:3" targetNodeId="6543581031674028261" resolveInfo="map" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028284">
                <link role="baseMethodDeclaration:3" targetNodeId="2.~HashMap.get(java.lang.Object):java.lang.Object" />
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674028285">
                  <link role="variableDeclaration:3" targetNodeId="6543581031674028276" resolveInfo="u" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674028286">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.TernaryOperatorExpression:3" id="6543581031674028287">
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="6543581031674028288">
              <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674028289">
                <link role="variableDeclaration:3" targetNodeId="6543581031674028280" resolveInfo="c" />
              </node>
              <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674028290" />
            </node>
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674028291">
              <link role="variableDeclaration:3" targetNodeId="6543581031674028280" resolveInfo="c" />
            </node>
            <node role="ifFalse:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="6543581031674028292">
              <property name="value:3" value="0" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674028293">
      <property name="name:3" value="postInc" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674028294" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="6543581031674028295" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674028296">
        <property name="name:3" value="u" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674028297">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674028260" resolveInfo="U" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028298">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="6543581031674028299">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="6543581031674028300">
            <property name="name:3" value="c" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674028301">
              <link role="classifier:3" targetNodeId="2v.~Integer" />
            </node>
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028302">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028303">
                <link role="variableDeclaration:3" targetNodeId="6543581031674028261" resolveInfo="map" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028304">
                <link role="baseMethodDeclaration:3" targetNodeId="2.~HashMap.get(java.lang.Object):java.lang.Object" />
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674028305">
                  <link role="variableDeclaration:3" targetNodeId="6543581031674028296" resolveInfo="u" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674028306">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028307">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028308">
              <link role="variableDeclaration:3" targetNodeId="6543581031674028261" resolveInfo="map" />
            </node>
            <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028309">
              <link role="baseMethodDeclaration:3" targetNodeId="2.~HashMap.put(java.lang.Object,java.lang.Object):java.lang.Object" />
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674028310">
                <link role="variableDeclaration:3" targetNodeId="6543581031674028296" resolveInfo="u" />
              </node>
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.TernaryOperatorExpression:3" id="6543581031674028311">
                <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="6543581031674028312">
                  <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674028313">
                    <link role="variableDeclaration:3" targetNodeId="6543581031674028300" resolveInfo="c" />
                  </node>
                  <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674028314" />
                </node>
                <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="6543581031674028315">
                  <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674028316">
                    <link role="variableDeclaration:3" targetNodeId="6543581031674028300" resolveInfo="c" />
                  </node>
                  <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="6543581031674028317">
                    <property name="value:3" value="1" />
                  </node>
                </node>
                <node role="ifFalse:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="6543581031674028318">
                  <property name="value:3" value="1" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674028319">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.TernaryOperatorExpression:3" id="6543581031674028320">
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="6543581031674028321">
              <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674028322">
                <link role="variableDeclaration:3" targetNodeId="6543581031674028300" resolveInfo="c" />
              </node>
              <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674028323" />
            </node>
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674028324">
              <link role="variableDeclaration:3" targetNodeId="6543581031674028300" resolveInfo="c" />
            </node>
            <node role="ifFalse:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="6543581031674028325">
              <property name="value:3" value="0" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674028326">
      <property name="name:3" value="postDec" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674028327" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="6543581031674028328" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674028329">
        <property name="name:3" value="u" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674028330">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674028260" resolveInfo="U" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028331">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="6543581031674028332">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="6543581031674028333">
            <property name="name:3" value="c" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674028334">
              <link role="classifier:3" targetNodeId="2v.~Integer" />
            </node>
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028335">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028336">
                <link role="variableDeclaration:3" targetNodeId="6543581031674028261" resolveInfo="map" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028337">
                <link role="baseMethodDeclaration:3" targetNodeId="2.~HashMap.get(java.lang.Object):java.lang.Object" />
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674028338">
                  <link role="variableDeclaration:3" targetNodeId="6543581031674028329" resolveInfo="u" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674028339">
          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.AndExpression:3" id="6543581031674028340">
            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="6543581031674028341">
              <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674028342">
                <link role="variableDeclaration:3" targetNodeId="6543581031674028333" resolveInfo="c" />
              </node>
              <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674028343" />
            </node>
            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.GreaterThanExpression:3" id="6543581031674028344">
              <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674028345">
                <link role="variableDeclaration:3" targetNodeId="6543581031674028333" resolveInfo="c" />
              </node>
              <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="6543581031674028346">
                <property name="value:3" value="1" />
              </node>
            </node>
          </node>
          <node role="ifFalseStatement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674028347">
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.AndExpression:3" id="6543581031674028348">
              <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="6543581031674028349">
                <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674028350">
                  <link role="variableDeclaration:3" targetNodeId="6543581031674028333" resolveInfo="c" />
                </node>
                <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674028351" />
              </node>
              <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.GreaterThanExpression:3" id="6543581031674028352">
                <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674028353">
                  <link role="variableDeclaration:3" targetNodeId="6543581031674028333" resolveInfo="c" />
                </node>
                <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="6543581031674028354">
                  <property name="value:3" value="0" />
                </node>
              </node>
            </node>
            <node role="ifFalseStatement:3" type="jetbrains.mps.baseLanguage.structure.BlockStatement:3" id="6543581031674028355">
              <node role="statements:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028356">
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674028357">
                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028358">
                    <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028359">
                      <link role="variableDeclaration:3" targetNodeId="6543581031674028261" resolveInfo="map" />
                    </node>
                    <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028360">
                      <link role="baseMethodDeclaration:3" targetNodeId="2.~HashMap.remove(java.lang.Object):java.lang.Object" />
                      <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674028361">
                        <link role="variableDeclaration:3" targetNodeId="6543581031674028329" resolveInfo="u" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674028362">
                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="6543581031674028363">
                    <property name="value:3" value="0" />
                  </node>
                </node>
              </node>
            </node>
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028364">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674028365">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028366">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028367">
                    <link role="variableDeclaration:3" targetNodeId="6543581031674028261" resolveInfo="map" />
                  </node>
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028368">
                    <link role="baseMethodDeclaration:3" targetNodeId="2.~HashMap.remove(java.lang.Object):java.lang.Object" />
                    <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674028369">
                      <link role="variableDeclaration:3" targetNodeId="6543581031674028329" resolveInfo="u" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674028370">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674028371">
                  <link role="variableDeclaration:3" targetNodeId="6543581031674028333" resolveInfo="c" />
                </node>
              </node>
            </node>
          </node>
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028372">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674028373">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028374">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028375">
                  <link role="variableDeclaration:3" targetNodeId="6543581031674028261" resolveInfo="map" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028376">
                  <link role="baseMethodDeclaration:3" targetNodeId="2.~HashMap.put(java.lang.Object,java.lang.Object):java.lang.Object" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674028377">
                    <link role="variableDeclaration:3" targetNodeId="6543581031674028329" resolveInfo="u" />
                  </node>
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.MinusExpression:3" id="6543581031674028378">
                    <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674028379">
                      <link role="variableDeclaration:3" targetNodeId="6543581031674028333" resolveInfo="c" />
                    </node>
                    <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="6543581031674028380">
                      <property name="value:3" value="1" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674028381">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674028382">
                <link role="variableDeclaration:3" targetNodeId="6543581031674028333" resolveInfo="c" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674028383">
      <property name="name:3" value="clear" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674028384" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674028385" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028386">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674028387">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028388">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028389">
              <link role="variableDeclaration:3" targetNodeId="6543581031674028261" resolveInfo="map" />
            </node>
            <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028390">
              <link role="baseMethodDeclaration:3" targetNodeId="2.~HashMap.clear():void" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="6543581031674028391">
    <property name="name:3" value="ComparingSequence" />
    <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674028392" />
    <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674028393">
      <property name="name:3" value="U" />
    </node>
    <node role="superclass:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674028394">
      <link role="classifier:3" targetNodeId="1.6543581031674023524" resolveInfo="Sequence" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674028395">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674028393" resolveInfo="U" />
      </node>
    </node>
    <node role="implementedInterface:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674028396">
      <link role="classifier:3" targetNodeId="2v.~Iterable" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674028397">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674028393" resolveInfo="U" />
      </node>
    </node>
    <node role="staticInnerClassifiers:3" type="jetbrains.mps.baseLanguage.structure.EnumClass:3" id="6543581031674028398">
      <property name="name:3" value="Kind" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674028399" />
      <node role="enumConstant:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantDeclaration:3" id="6543581031674028400">
        <property name="name:3" value="UNION" />
        <link role="baseMethodDeclaration:3" targetNodeId="6543581031674028404" resolveInfo="Kind" />
      </node>
      <node role="enumConstant:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantDeclaration:3" id="6543581031674028401">
        <property name="name:3" value="INTERSECTION" />
        <link role="baseMethodDeclaration:3" targetNodeId="6543581031674028404" resolveInfo="Kind" />
      </node>
      <node role="enumConstant:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantDeclaration:3" id="6543581031674028402">
        <property name="name:3" value="SUBSTRACTION" />
        <link role="baseMethodDeclaration:3" targetNodeId="6543581031674028404" resolveInfo="Kind" />
      </node>
      <node role="enumConstant:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantDeclaration:3" id="6543581031674028403">
        <property name="name:3" value="DISJUNCTION" />
        <link role="baseMethodDeclaration:3" targetNodeId="6543581031674028404" resolveInfo="Kind" />
      </node>
      <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="6543581031674028404">
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674028405" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674028406" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028520" />
      </node>
    </node>
    <node role="staticInnerClassifiers:3" type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="6543581031674028407">
      <property name="name:3" value="ComparingIterator" />
      <property name="nonStatic:3" value="true" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674028408" />
      <node role="implementedInterface:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674028409">
        <link role="classifier:3" targetNodeId="2.~Iterator" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674028410">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674028393" resolveInfo="U" />
        </node>
      </node>
      <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674028411">
        <property name="name:3" value="cardMap" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674028412">
          <link role="classifier:3" targetNodeId="6543581031674028259" resolveInfo="CardinalityMap" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674028413">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674028393" resolveInfo="U" />
          </node>
        </node>
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674028414" />
        <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674028521">
          <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674028522">
            <link role="baseMethodDeclaration:3" targetNodeId="6543581031674028270" resolveInfo="CardinalityMap" />
            <node role="typeParameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674028523">
              <link role="typeVariableDeclaration:3" targetNodeId="6543581031674028393" resolveInfo="U" />
            </node>
          </node>
        </node>
      </node>
      <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674028415">
        <property name="name:3" value="cache" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674028416">
          <link role="classifier:3" targetNodeId="2.~List" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674028417">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674028393" resolveInfo="U" />
          </node>
        </node>
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674028418" />
      </node>
      <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674028419">
        <property name="name:3" value="leftIt" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674028420">
          <link role="classifier:3" targetNodeId="2.~Iterator" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674028421">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674028393" resolveInfo="U" />
          </node>
        </node>
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674028422" />
      </node>
      <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674028423">
        <property name="name:3" value="rightIt" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674028424">
          <link role="classifier:3" targetNodeId="2.~Iterator" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674028425">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674028393" resolveInfo="U" />
          </node>
        </node>
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674028426" />
      </node>
      <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674028427">
        <property name="name:3" value="next" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674028428">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674028393" resolveInfo="U" />
        </node>
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674028429" />
      </node>
      <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674028430">
        <property name="name:3" value="hasNext" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674028431">
          <link role="classifier:3" targetNodeId="6543581031674034581" resolveInfo="HasNextState" />
        </node>
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674028432" />
        <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="6543581031674028524">
          <link role="enumClass:3" targetNodeId="6543581031674034581" resolveInfo="HasNextState" />
          <link role="enumConstantDeclaration:3" targetNodeId="6543581031674034583" resolveInfo="UNKNOWN" />
        </node>
      </node>
      <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="6543581031674028433">
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674028434" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674028435" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028525" />
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674028436">
        <property name="name:3" value="hasNext" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674028437" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674028438" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028526">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6401275180973221705">
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6401275180973221706">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674028532">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6543581031674028533">
                  <link role="baseMethodDeclaration:3" targetNodeId="6543581031674028445" resolveInfo="init" />
                </node>
              </node>
            </node>
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.OrExpression:3" id="6401275180973221714">
              <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="6401275180973221718">
                <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6401275180973221721" />
                <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6401275180973221717">
                  <link role="variableDeclaration:3" targetNodeId="6543581031674028423" resolveInfo="rightIt" />
                </node>
              </node>
              <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="6401275180973221710">
                <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6401275180973221709">
                  <link role="variableDeclaration:3" targetNodeId="6543581031674028419" resolveInfo="leftIt" />
                </node>
                <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6401275180973221713" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674028527">
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028528">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028529">
                <link role="variableDeclaration:3" targetNodeId="6543581031674028430" resolveInfo="hasNext" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028530">
                <link role="baseMethodDeclaration:3" targetNodeId="6543581031674034605" resolveInfo="unknown" />
              </node>
            </node>
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028531">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674028534">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6543581031674028535">
                  <link role="baseMethodDeclaration:3" targetNodeId="6543581031674028451" resolveInfo="moveToNext" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674028536">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028537">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028538">
                <link role="variableDeclaration:3" targetNodeId="6543581031674028430" resolveInfo="hasNext" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028539">
                <link role="baseMethodDeclaration:3" targetNodeId="6543581031674034613" resolveInfo="hasNext" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674028439">
        <property name="name:3" value="next" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674028440" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674028441">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674028393" resolveInfo="U" />
        </node>
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028540">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6401275180973221723">
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6401275180973221724">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6401275180973221725">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6401275180973221726">
                  <link role="baseMethodDeclaration:3" targetNodeId="6543581031674028445" resolveInfo="init" />
                </node>
              </node>
            </node>
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.OrExpression:3" id="6401275180973221727">
              <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="6401275180973221728">
                <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6401275180973221729" />
                <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6401275180973221730">
                  <link role="variableDeclaration:3" targetNodeId="6543581031674028423" resolveInfo="rightIt" />
                </node>
              </node>
              <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="6401275180973221731">
                <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6401275180973221732">
                  <link role="variableDeclaration:3" targetNodeId="6543581031674028419" resolveInfo="leftIt" />
                </node>
                <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6401275180973221733" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674028541">
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028542">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028543">
                <link role="variableDeclaration:3" targetNodeId="6543581031674028430" resolveInfo="hasNext" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028544">
                <link role="baseMethodDeclaration:3" targetNodeId="6543581031674034605" resolveInfo="unknown" />
              </node>
            </node>
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028545">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674028548">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6543581031674028549">
                  <link role="baseMethodDeclaration:3" targetNodeId="6543581031674028451" resolveInfo="moveToNext" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674028550">
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.NotExpression:3" id="6543581031674028551">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression:3" id="6543581031674028552">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028553">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028554">
                    <link role="variableDeclaration:3" targetNodeId="6543581031674028430" resolveInfo="hasNext" />
                  </node>
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028555">
                    <link role="baseMethodDeclaration:3" targetNodeId="6543581031674034613" resolveInfo="hasNext" />
                  </node>
                </node>
              </node>
            </node>
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028556">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ThrowStatement:3" id="6543581031674028557">
                <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674028558">
                  <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674028559">
                    <link role="baseMethodDeclaration:3" targetNodeId="2.~NoSuchElementException.&lt;init&gt;()" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6401275180973221791">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6401275180973221792">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6401275180973221793" />
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6401275180973221794">
                <link role="baseMethodDeclaration:3" targetNodeId="6401275180973221770" resolveInfo="clearNext" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674028442">
        <property name="name:3" value="remove" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674028443" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674028444" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028577">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ThrowStatement:3" id="6543581031674028578">
            <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674028579">
              <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674028580">
                <link role="baseMethodDeclaration:3" targetNodeId="2v.~UnsupportedOperationException.&lt;init&gt;()" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674028445">
        <property name="name:3" value="init" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674028446" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674028447" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028581">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.SwitchStatement:3" id="6543581031674028582">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028583">
              <link role="variableDeclaration:3" targetNodeId="6543581031674028467" resolveInfo="kind" />
            </node>
            <node role="defaultBlock:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028584">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.BreakStatement:3" id="6543581031674028585" />
            </node>
            <node role="case:3" type="jetbrains.mps.baseLanguage.structure.SwitchCase:3" id="6543581031674028586">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="6543581031674028587">
                <link role="enumClass:3" targetNodeId="6543581031674028398" resolveInfo="ComparingSequence.Kind" />
                <link role="enumConstantDeclaration:3" targetNodeId="6543581031674028402" resolveInfo="SUBSTRACTION" />
              </node>
              <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028588" />
            </node>
            <node role="case:3" type="jetbrains.mps.baseLanguage.structure.SwitchCase:3" id="6543581031674028589">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="6543581031674028590">
                <link role="enumClass:3" targetNodeId="6543581031674028398" resolveInfo="ComparingSequence.Kind" />
                <link role="enumConstantDeclaration:3" targetNodeId="6543581031674028401" resolveInfo="INTERSECTION" />
              </node>
              <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028591">
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="6543581031674028592">
                  <node role="iterable:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028593">
                    <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028594">
                      <link role="variableDeclaration:3" targetNodeId="6543581031674028463" resolveInfo="right" />
                    </node>
                    <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028595">
                      <link role="baseMethodDeclaration:3" targetNodeId="1.6543581031674024589" resolveInfo="toIterable" />
                    </node>
                  </node>
                  <node role="variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="6543581031674028596">
                    <property name="name:3" value="o" />
                    <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674028597">
                      <link role="typeVariableDeclaration:3" targetNodeId="6543581031674028393" resolveInfo="U" />
                    </node>
                  </node>
                  <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028598">
                    <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674028599">
                      <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028600">
                        <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028601">
                          <link role="variableDeclaration:3" targetNodeId="6543581031674028411" resolveInfo="cardMap" />
                        </node>
                        <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028602">
                          <link role="baseMethodDeclaration:3" targetNodeId="6543581031674028293" resolveInfo="postInc" />
                          <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674028603">
                            <link role="variableDeclaration:3" targetNodeId="6543581031674028596" resolveInfo="o" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674028604">
                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674028605">
                    <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028606">
                      <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674028607">
                        <link role="fieldDeclaration:3" targetNodeId="6543581031674028419" resolveInfo="leftIt" />
                      </node>
                      <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674028608" />
                    </node>
                    <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028609">
                      <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028610">
                        <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028611">
                          <link role="variableDeclaration:3" targetNodeId="6543581031674028459" resolveInfo="left" />
                        </node>
                        <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028612">
                          <link role="baseMethodDeclaration:3" targetNodeId="1.6543581031674024589" resolveInfo="toIterable" />
                        </node>
                      </node>
                      <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028613">
                        <link role="baseMethodDeclaration:3" targetNodeId="2v.~Iterable.iterator():java.util.Iterator" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.BreakStatement:3" id="6543581031674028614" />
              </node>
            </node>
            <node role="case:3" type="jetbrains.mps.baseLanguage.structure.SwitchCase:3" id="6543581031674028615">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="6543581031674028616">
                <link role="enumClass:3" targetNodeId="6543581031674028398" resolveInfo="ComparingSequence.Kind" />
                <link role="enumConstantDeclaration:3" targetNodeId="6543581031674028400" resolveInfo="UNION" />
              </node>
              <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028617">
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674028618">
                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674028619">
                    <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028620">
                      <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674028621">
                        <link role="fieldDeclaration:3" targetNodeId="6543581031674028419" resolveInfo="leftIt" />
                      </node>
                      <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674028622" />
                    </node>
                    <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028623">
                      <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028624">
                        <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028625">
                          <link role="variableDeclaration:3" targetNodeId="6543581031674028459" resolveInfo="left" />
                        </node>
                        <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028626">
                          <link role="baseMethodDeclaration:3" targetNodeId="1.6543581031674024589" resolveInfo="toIterable" />
                        </node>
                      </node>
                      <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028627">
                        <link role="baseMethodDeclaration:3" targetNodeId="2v.~Iterable.iterator():java.util.Iterator" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674028628">
                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674028629">
                    <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028630">
                      <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674028631">
                        <link role="fieldDeclaration:3" targetNodeId="6543581031674028423" resolveInfo="rightIt" />
                      </node>
                      <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674028632" />
                    </node>
                    <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028633">
                      <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028634">
                        <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028635">
                          <link role="variableDeclaration:3" targetNodeId="6543581031674028463" resolveInfo="right" />
                        </node>
                        <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028636">
                          <link role="baseMethodDeclaration:3" targetNodeId="1.6543581031674024589" resolveInfo="toIterable" />
                        </node>
                      </node>
                      <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028637">
                        <link role="baseMethodDeclaration:3" targetNodeId="2v.~Iterable.iterator():java.util.Iterator" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.BreakStatement:3" id="6543581031674028638" />
              </node>
            </node>
            <node role="case:3" type="jetbrains.mps.baseLanguage.structure.SwitchCase:3" id="6543581031674028639">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="6543581031674028640">
                <link role="enumClass:3" targetNodeId="6543581031674028398" resolveInfo="ComparingSequence.Kind" />
                <link role="enumConstantDeclaration:3" targetNodeId="6543581031674028403" resolveInfo="DISJUNCTION" />
              </node>
              <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028641">
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674028642">
                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674028643">
                    <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028644">
                      <link role="variableDeclaration:3" targetNodeId="6543581031674028415" resolveInfo="cache" />
                    </node>
                    <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674028645">
                      <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674028646">
                        <link role="baseMethodDeclaration:3" targetNodeId="2.~ArrayList.&lt;init&gt;()" />
                        <node role="typeParameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674028647">
                          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674028393" resolveInfo="U" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="6543581031674028648">
                  <node role="iterable:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028649">
                    <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028650">
                      <link role="variableDeclaration:3" targetNodeId="6543581031674028463" resolveInfo="right" />
                    </node>
                    <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028651">
                      <link role="baseMethodDeclaration:3" targetNodeId="1.6543581031674024589" resolveInfo="toIterable" />
                    </node>
                  </node>
                  <node role="variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="6543581031674028652">
                    <property name="name:3" value="o" />
                    <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674028653">
                      <link role="typeVariableDeclaration:3" targetNodeId="6543581031674028393" resolveInfo="U" />
                    </node>
                  </node>
                  <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028654">
                    <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674028655">
                      <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028656">
                        <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028657">
                          <link role="variableDeclaration:3" targetNodeId="6543581031674028411" resolveInfo="cardMap" />
                        </node>
                        <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028658">
                          <link role="baseMethodDeclaration:3" targetNodeId="6543581031674028293" resolveInfo="postInc" />
                          <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674028659">
                            <link role="variableDeclaration:3" targetNodeId="6543581031674028652" resolveInfo="o" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674028660">
                      <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028661">
                        <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028662">
                          <link role="variableDeclaration:3" targetNodeId="6543581031674028415" resolveInfo="cache" />
                        </node>
                        <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028663">
                          <link role="baseMethodDeclaration:3" targetNodeId="2.~List.add(java.lang.Object):boolean" />
                          <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674028664">
                            <link role="variableDeclaration:3" targetNodeId="6543581031674028652" resolveInfo="o" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674028665">
                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674028666">
                    <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028667">
                      <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674028668">
                        <link role="fieldDeclaration:3" targetNodeId="6543581031674028419" resolveInfo="leftIt" />
                      </node>
                      <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674028669" />
                    </node>
                    <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028670">
                      <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028671">
                        <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028672">
                          <link role="variableDeclaration:3" targetNodeId="6543581031674028459" resolveInfo="left" />
                        </node>
                        <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028673">
                          <link role="baseMethodDeclaration:3" targetNodeId="1.6543581031674024589" resolveInfo="toIterable" />
                        </node>
                      </node>
                      <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028674">
                        <link role="baseMethodDeclaration:3" targetNodeId="2v.~Iterable.iterator():java.util.Iterator" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674028675">
                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674028676">
                    <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028677">
                      <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674028678">
                        <link role="fieldDeclaration:3" targetNodeId="6543581031674028423" resolveInfo="rightIt" />
                      </node>
                      <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674028679" />
                    </node>
                    <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028680">
                      <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028681">
                        <link role="variableDeclaration:3" targetNodeId="6543581031674028415" resolveInfo="cache" />
                      </node>
                      <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028682">
                        <link role="baseMethodDeclaration:3" targetNodeId="2.~List.iterator():java.util.Iterator" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.BreakStatement:3" id="6543581031674028683" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674028448">
        <property name="name:3" value="destroy" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674028449" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674028450" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028684">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674028685">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028686">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028687">
                <link role="variableDeclaration:3" targetNodeId="6543581031674028411" resolveInfo="cardMap" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028688">
                <link role="baseMethodDeclaration:3" targetNodeId="6543581031674028383" resolveInfo="clear" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674028689">
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="6543581031674028690">
              <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028691">
                <link role="variableDeclaration:3" targetNodeId="6543581031674028415" resolveInfo="cache" />
              </node>
              <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674028692" />
            </node>
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028693">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674028694">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028695">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028696">
                    <link role="variableDeclaration:3" targetNodeId="6543581031674028415" resolveInfo="cache" />
                  </node>
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028697">
                    <link role="baseMethodDeclaration:3" targetNodeId="2.~List.clear():void" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674028451">
        <property name="name:3" value="moveToNext" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674028452" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674028453" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028698">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674028699">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674028700">
              <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028701">
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674028702">
                  <link role="fieldDeclaration:3" targetNodeId="6543581031674028427" resolveInfo="next" />
                </node>
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674028703" />
              </node>
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674028704" />
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674028705">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674028706">
              <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028707">
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674028708">
                  <link role="fieldDeclaration:3" targetNodeId="6543581031674028430" resolveInfo="hasNext" />
                </node>
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674028709" />
              </node>
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="6543581031674028710">
                <link role="enumClass:3" targetNodeId="6543581031674034581" resolveInfo="HasNextState" />
                <link role="enumConstantDeclaration:3" targetNodeId="6543581031674034588" resolveInfo="AT_END" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.DoWhileStatement:3" id="6543581031674028711">
            <property name="label:3" value="loop" />
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="6543581031674028712">
              <property name="value:3" value="true" />
            </node>
            <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028713">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.SwitchStatement:3" id="6543581031674028714">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028715">
                  <link role="variableDeclaration:3" targetNodeId="6543581031674028467" resolveInfo="kind" />
                </node>
                <node role="defaultBlock:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028716">
                  <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.BreakStatement:3" id="6543581031674028717" />
                </node>
                <node role="case:3" type="jetbrains.mps.baseLanguage.structure.SwitchCase:3" id="6543581031674028718">
                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="6543581031674028719">
                    <link role="enumClass:3" targetNodeId="6543581031674028398" resolveInfo="ComparingSequence.Kind" />
                    <link role="enumConstantDeclaration:3" targetNodeId="6543581031674028402" resolveInfo="SUBSTRACTION" />
                  </node>
                  <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028720">
                    <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674028721">
                      <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028722">
                        <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028723">
                          <link role="variableDeclaration:3" targetNodeId="6543581031674028419" resolveInfo="leftIt" />
                        </node>
                        <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028724">
                          <link role="baseMethodDeclaration:3" targetNodeId="2.~Iterator.hasNext():boolean" />
                        </node>
                      </node>
                      <node role="ifFalseStatement:3" type="jetbrains.mps.baseLanguage.structure.BlockStatement:3" id="6543581031674028725">
                        <node role="statements:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028726">
                          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.BreakStatement:3" id="6543581031674028727">
                            <property name="label:3" value="loop" />
                          </node>
                        </node>
                      </node>
                      <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028728">
                        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="6543581031674028729">
                          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="6543581031674028730">
                            <property name="name:3" value="tmp" />
                            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674028731">
                              <link role="typeVariableDeclaration:3" targetNodeId="6543581031674028393" resolveInfo="U" />
                            </node>
                            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028732">
                              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028733">
                                <link role="variableDeclaration:3" targetNodeId="6543581031674028419" resolveInfo="leftIt" />
                              </node>
                              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028734">
                                <link role="baseMethodDeclaration:3" targetNodeId="2.~Iterator.next():java.lang.Object" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674028735">
                          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="6543581031674028736">
                            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028737">
                              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028738">
                                <link role="variableDeclaration:3" targetNodeId="6543581031674028411" resolveInfo="cardMap" />
                              </node>
                              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028739">
                                <link role="baseMethodDeclaration:3" targetNodeId="6543581031674028326" resolveInfo="postDec" />
                                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674028740">
                                  <link role="variableDeclaration:3" targetNodeId="6543581031674028730" resolveInfo="tmp" />
                                </node>
                              </node>
                            </node>
                            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="6543581031674028741">
                              <property name="value:3" value="0" />
                            </node>
                          </node>
                          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028742">
                            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674028743">
                              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6543581031674028744">
                                <link role="baseMethodDeclaration:3" targetNodeId="6543581031674028454" resolveInfo="setNext" />
                                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674028745">
                                  <link role="variableDeclaration:3" targetNodeId="6543581031674028730" resolveInfo="tmp" />
                                </node>
                              </node>
                            </node>
                            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.BreakStatement:3" id="6543581031674028746">
                              <property name="label:3" value="loop" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.BreakStatement:3" id="6543581031674028747" />
                  </node>
                </node>
                <node role="case:3" type="jetbrains.mps.baseLanguage.structure.SwitchCase:3" id="6543581031674028748">
                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="6543581031674028749">
                    <link role="enumClass:3" targetNodeId="6543581031674028398" resolveInfo="ComparingSequence.Kind" />
                    <link role="enumConstantDeclaration:3" targetNodeId="6543581031674028401" resolveInfo="INTERSECTION" />
                  </node>
                  <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028750">
                    <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674028751">
                      <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028752">
                        <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028753">
                          <link role="variableDeclaration:3" targetNodeId="6543581031674028419" resolveInfo="leftIt" />
                        </node>
                        <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028754">
                          <link role="baseMethodDeclaration:3" targetNodeId="2.~Iterator.hasNext():boolean" />
                        </node>
                      </node>
                      <node role="ifFalseStatement:3" type="jetbrains.mps.baseLanguage.structure.BlockStatement:3" id="6543581031674028755">
                        <node role="statements:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028756">
                          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.BreakStatement:3" id="6543581031674028757">
                            <property name="label:3" value="loop" />
                          </node>
                        </node>
                      </node>
                      <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028758">
                        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="6543581031674028759">
                          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="6543581031674028760">
                            <property name="name:3" value="tmp" />
                            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674028761">
                              <link role="typeVariableDeclaration:3" targetNodeId="6543581031674028393" resolveInfo="U" />
                            </node>
                            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028762">
                              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028763">
                                <link role="variableDeclaration:3" targetNodeId="6543581031674028419" resolveInfo="leftIt" />
                              </node>
                              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028764">
                                <link role="baseMethodDeclaration:3" targetNodeId="2.~Iterator.next():java.lang.Object" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674028765">
                          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.GreaterThanExpression:3" id="6543581031674028766">
                            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028767">
                              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028768">
                                <link role="variableDeclaration:3" targetNodeId="6543581031674028411" resolveInfo="cardMap" />
                              </node>
                              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028769">
                                <link role="baseMethodDeclaration:3" targetNodeId="6543581031674028326" resolveInfo="postDec" />
                                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674028770">
                                  <link role="variableDeclaration:3" targetNodeId="6543581031674028760" resolveInfo="tmp" />
                                </node>
                              </node>
                            </node>
                            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="6543581031674028771">
                              <property name="value:3" value="0" />
                            </node>
                          </node>
                          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028772">
                            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674028773">
                              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6543581031674028774">
                                <link role="baseMethodDeclaration:3" targetNodeId="6543581031674028454" resolveInfo="setNext" />
                                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674028775">
                                  <link role="variableDeclaration:3" targetNodeId="6543581031674028760" resolveInfo="tmp" />
                                </node>
                              </node>
                            </node>
                            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.BreakStatement:3" id="6543581031674028776">
                              <property name="label:3" value="loop" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.BreakStatement:3" id="6543581031674028777" />
                  </node>
                </node>
                <node role="case:3" type="jetbrains.mps.baseLanguage.structure.SwitchCase:3" id="6543581031674028778">
                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="6543581031674028779">
                    <link role="enumClass:3" targetNodeId="6543581031674028398" resolveInfo="ComparingSequence.Kind" />
                    <link role="enumConstantDeclaration:3" targetNodeId="6543581031674028400" resolveInfo="UNION" />
                  </node>
                  <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028780">
                    <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674028781">
                      <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028782">
                        <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028783">
                          <link role="variableDeclaration:3" targetNodeId="6543581031674028419" resolveInfo="leftIt" />
                        </node>
                        <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028784">
                          <link role="baseMethodDeclaration:3" targetNodeId="2.~Iterator.hasNext():boolean" />
                        </node>
                      </node>
                      <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028785">
                        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="6543581031674028786">
                          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="6543581031674028787">
                            <property name="name:3" value="tmp" />
                            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674028788">
                              <link role="typeVariableDeclaration:3" targetNodeId="6543581031674028393" resolveInfo="U" />
                            </node>
                            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028789">
                              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028790">
                                <link role="variableDeclaration:3" targetNodeId="6543581031674028419" resolveInfo="leftIt" />
                              </node>
                              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028791">
                                <link role="baseMethodDeclaration:3" targetNodeId="2.~Iterator.next():java.lang.Object" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674028792">
                          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028793">
                            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028794">
                              <link role="variableDeclaration:3" targetNodeId="6543581031674028411" resolveInfo="cardMap" />
                            </node>
                            <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028795">
                              <link role="baseMethodDeclaration:3" targetNodeId="6543581031674028293" resolveInfo="postInc" />
                              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674028796">
                                <link role="variableDeclaration:3" targetNodeId="6543581031674028787" resolveInfo="tmp" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674028797">
                          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6543581031674028798">
                            <link role="baseMethodDeclaration:3" targetNodeId="6543581031674028454" resolveInfo="setNext" />
                            <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674028799">
                              <link role="variableDeclaration:3" targetNodeId="6543581031674028787" resolveInfo="tmp" />
                            </node>
                          </node>
                        </node>
                        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.BreakStatement:3" id="6543581031674028800">
                          <property name="label:3" value="loop" />
                        </node>
                      </node>
                    </node>
                    <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674028801">
                      <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028802">
                        <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028803">
                          <link role="variableDeclaration:3" targetNodeId="6543581031674028423" resolveInfo="rightIt" />
                        </node>
                        <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028804">
                          <link role="baseMethodDeclaration:3" targetNodeId="2.~Iterator.hasNext():boolean" />
                        </node>
                      </node>
                      <node role="ifFalseStatement:3" type="jetbrains.mps.baseLanguage.structure.BlockStatement:3" id="6543581031674028805">
                        <node role="statements:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028806">
                          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.BreakStatement:3" id="6543581031674028807">
                            <property name="label:3" value="loop" />
                          </node>
                        </node>
                      </node>
                      <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028808">
                        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="6543581031674028809">
                          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="6543581031674028810">
                            <property name="name:3" value="tmp" />
                            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674028811">
                              <link role="typeVariableDeclaration:3" targetNodeId="6543581031674028393" resolveInfo="U" />
                            </node>
                            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028812">
                              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028813">
                                <link role="variableDeclaration:3" targetNodeId="6543581031674028423" resolveInfo="rightIt" />
                              </node>
                              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028814">
                                <link role="baseMethodDeclaration:3" targetNodeId="2.~Iterator.next():java.lang.Object" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674028815">
                          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="6543581031674028816">
                            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028817">
                              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028818">
                                <link role="variableDeclaration:3" targetNodeId="6543581031674028411" resolveInfo="cardMap" />
                              </node>
                              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028819">
                                <link role="baseMethodDeclaration:3" targetNodeId="6543581031674028326" resolveInfo="postDec" />
                                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674028820">
                                  <link role="variableDeclaration:3" targetNodeId="6543581031674028810" resolveInfo="tmp" />
                                </node>
                              </node>
                            </node>
                            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="6543581031674028821">
                              <property name="value:3" value="0" />
                            </node>
                          </node>
                          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028822">
                            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674028823">
                              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6543581031674028824">
                                <link role="baseMethodDeclaration:3" targetNodeId="6543581031674028454" resolveInfo="setNext" />
                                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674028825">
                                  <link role="variableDeclaration:3" targetNodeId="6543581031674028810" resolveInfo="tmp" />
                                </node>
                              </node>
                            </node>
                            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.BreakStatement:3" id="6543581031674028826">
                              <property name="label:3" value="loop" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.BreakStatement:3" id="6543581031674028827" />
                  </node>
                </node>
                <node role="case:3" type="jetbrains.mps.baseLanguage.structure.SwitchCase:3" id="6543581031674028828">
                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="6543581031674028829">
                    <link role="enumClass:3" targetNodeId="6543581031674028398" resolveInfo="ComparingSequence.Kind" />
                    <link role="enumConstantDeclaration:3" targetNodeId="6543581031674028403" resolveInfo="DISJUNCTION" />
                  </node>
                  <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028830">
                    <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674028831">
                      <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028832">
                        <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028833">
                          <link role="variableDeclaration:3" targetNodeId="6543581031674028419" resolveInfo="leftIt" />
                        </node>
                        <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028834">
                          <link role="baseMethodDeclaration:3" targetNodeId="2.~Iterator.hasNext():boolean" />
                        </node>
                      </node>
                      <node role="ifFalseStatement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674028835">
                        <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028836">
                          <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028837">
                            <link role="variableDeclaration:3" targetNodeId="6543581031674028423" resolveInfo="rightIt" />
                          </node>
                          <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028838">
                            <link role="baseMethodDeclaration:3" targetNodeId="2.~Iterator.hasNext():boolean" />
                          </node>
                        </node>
                        <node role="ifFalseStatement:3" type="jetbrains.mps.baseLanguage.structure.BlockStatement:3" id="6543581031674028839">
                          <node role="statements:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028840">
                            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.BreakStatement:3" id="6543581031674028841">
                              <property name="label:3" value="loop" />
                            </node>
                          </node>
                        </node>
                        <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028842">
                          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="6543581031674028843">
                            <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="6543581031674028844">
                              <property name="name:3" value="tmp" />
                              <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674028845">
                                <link role="typeVariableDeclaration:3" targetNodeId="6543581031674028393" resolveInfo="U" />
                              </node>
                              <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028846">
                                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028847">
                                  <link role="variableDeclaration:3" targetNodeId="6543581031674028423" resolveInfo="rightIt" />
                                </node>
                                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028848">
                                  <link role="baseMethodDeclaration:3" targetNodeId="2.~Iterator.next():java.lang.Object" />
                                </node>
                              </node>
                            </node>
                          </node>
                          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674028849">
                            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.GreaterThanExpression:3" id="6543581031674028850">
                              <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028851">
                                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028852">
                                  <link role="variableDeclaration:3" targetNodeId="6543581031674028411" resolveInfo="cardMap" />
                                </node>
                                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028853">
                                  <link role="baseMethodDeclaration:3" targetNodeId="6543581031674028326" resolveInfo="postDec" />
                                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674028854">
                                    <link role="variableDeclaration:3" targetNodeId="6543581031674028844" resolveInfo="tmp" />
                                  </node>
                                </node>
                              </node>
                              <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="6543581031674028855">
                                <property name="value:3" value="0" />
                              </node>
                            </node>
                            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028856">
                              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674028857">
                                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6543581031674028858">
                                  <link role="baseMethodDeclaration:3" targetNodeId="6543581031674028454" resolveInfo="setNext" />
                                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674028859">
                                    <link role="variableDeclaration:3" targetNodeId="6543581031674028844" resolveInfo="tmp" />
                                  </node>
                                </node>
                              </node>
                              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.BreakStatement:3" id="6543581031674028860">
                                <property name="label:3" value="loop" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028861">
                        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="6543581031674028862">
                          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="6543581031674028863">
                            <property name="name:3" value="tmp" />
                            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674028864">
                              <link role="typeVariableDeclaration:3" targetNodeId="6543581031674028393" resolveInfo="U" />
                            </node>
                            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028865">
                              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028866">
                                <link role="variableDeclaration:3" targetNodeId="6543581031674028419" resolveInfo="leftIt" />
                              </node>
                              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028867">
                                <link role="baseMethodDeclaration:3" targetNodeId="2.~Iterator.next():java.lang.Object" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674028868">
                          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="6543581031674028869">
                            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028870">
                              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028871">
                                <link role="variableDeclaration:3" targetNodeId="6543581031674028411" resolveInfo="cardMap" />
                              </node>
                              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028872">
                                <link role="baseMethodDeclaration:3" targetNodeId="6543581031674028326" resolveInfo="postDec" />
                                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674028873">
                                  <link role="variableDeclaration:3" targetNodeId="6543581031674028863" resolveInfo="tmp" />
                                </node>
                              </node>
                            </node>
                            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="6543581031674028874">
                              <property name="value:3" value="0" />
                            </node>
                          </node>
                          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028875">
                            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674028876">
                              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6543581031674028877">
                                <link role="baseMethodDeclaration:3" targetNodeId="6543581031674028454" resolveInfo="setNext" />
                                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674028878">
                                  <link role="variableDeclaration:3" targetNodeId="6543581031674028863" resolveInfo="tmp" />
                                </node>
                              </node>
                            </node>
                            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.BreakStatement:3" id="6543581031674028879">
                              <property name="label:3" value="loop" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.BreakStatement:3" id="6543581031674028880" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6401275180973221760">
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.NotExpression:3" id="6401275180973221761">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression:3" id="6401275180973221762">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6401275180973221763">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6401275180973221764">
                    <link role="variableDeclaration:3" targetNodeId="6543581031674028430" resolveInfo="hasNext" />
                  </node>
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6401275180973221765">
                    <link role="baseMethodDeclaration:3" targetNodeId="6543581031674034613" resolveInfo="hasNext" />
                  </node>
                </node>
              </node>
            </node>
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6401275180973221766">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6401275180973221767">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6401275180973221768">
                  <link role="baseMethodDeclaration:3" targetNodeId="6543581031674028448" resolveInfo="destroy" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6401275180973221770">
        <property name="name:3" value="clearNext" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6401275180973221771" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6401275180973221772">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674028393" resolveInfo="U" />
        </node>
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6401275180973221773">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="6401275180973221774">
            <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="6401275180973221769">
              <property name="name:3" value="tmp" />
              <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6401275180973221775">
                <link role="typeVariableDeclaration:3" targetNodeId="6543581031674028393" resolveInfo="U" />
              </node>
              <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6401275180973221776">
                <link role="variableDeclaration:3" targetNodeId="6543581031674028427" resolveInfo="next" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6401275180973221777">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6401275180973221778">
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6401275180973221779" />
              <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6401275180973221780">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6401275180973221781" />
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6401275180973221782">
                  <link role="fieldDeclaration:3" targetNodeId="6543581031674028427" resolveInfo="next" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6401275180973221783">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6401275180973221784">
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="6401275180973221785">
                <link role="enumConstantDeclaration:3" targetNodeId="6543581031674034583" resolveInfo="UNKNOWN" />
                <link role="enumClass:3" targetNodeId="6543581031674034581" resolveInfo="HasNextState" />
              </node>
              <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6401275180973221786">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6401275180973221787" />
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6401275180973221788">
                  <link role="fieldDeclaration:3" targetNodeId="6543581031674028430" resolveInfo="hasNext" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6401275180973221789">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6401275180973221790">
              <link role="variableDeclaration:3" targetNodeId="6401275180973221769" resolveInfo="tmp" />
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674028454">
        <property name="name:3" value="setNext" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674028455" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674028456" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674028457">
          <property name="name:3" value="tmp" />
          <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674028458">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674028393" resolveInfo="U" />
          </node>
        </node>
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028881">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674028882">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674028883">
              <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028884">
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674028885">
                  <link role="fieldDeclaration:3" targetNodeId="6543581031674028427" resolveInfo="next" />
                </node>
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674028886" />
              </node>
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674028887">
                <link role="variableDeclaration:3" targetNodeId="6543581031674028457" resolveInfo="tmp" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674028888">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674028889">
              <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028890">
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674028891">
                  <link role="fieldDeclaration:3" targetNodeId="6543581031674028430" resolveInfo="hasNext" />
                </node>
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674028892" />
              </node>
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="6543581031674028893">
                <link role="enumClass:3" targetNodeId="6543581031674034581" resolveInfo="HasNextState" />
                <link role="enumConstantDeclaration:3" targetNodeId="6543581031674034586" resolveInfo="HAS_NEXT" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674028459">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="left" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674028460">
        <link role="classifier:3" targetNodeId="1.6543581031674024311" resolveInfo="ISequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674028461">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674028393" resolveInfo="U" />
        </node>
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674028462" />
    </node>
    <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674028463">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="right" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674028464">
        <link role="classifier:3" targetNodeId="1.6543581031674024311" resolveInfo="ISequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674028465">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674028393" resolveInfo="U" />
        </node>
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674028466" />
    </node>
    <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674028467">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="kind" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674028468">
        <link role="classifier:3" targetNodeId="6543581031674028398" resolveInfo="ComparingSequence.Kind" />
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674028469" />
    </node>
    <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="6543581031674028470">
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674028471" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674028472" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674028473">
        <property name="name:3" value="left" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674028474">
          <link role="classifier:3" targetNodeId="1.6543581031674024311" resolveInfo="ISequence" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674028475">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674028393" resolveInfo="U" />
          </node>
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674028476">
        <property name="name:3" value="right" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674028477">
          <link role="classifier:3" targetNodeId="1.6543581031674024311" resolveInfo="ISequence" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674028478">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674028393" resolveInfo="U" />
          </node>
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674028479">
        <property name="name:3" value="kind" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674028480">
          <link role="classifier:3" targetNodeId="6543581031674028398" resolveInfo="ComparingSequence.Kind" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028481">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674028482">
          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.OrExpression:3" id="6543581031674028483">
            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="6543581031674028484">
              <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674028485">
                <link role="variableDeclaration:3" targetNodeId="6543581031674028473" resolveInfo="left" />
              </node>
              <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674028486" />
            </node>
            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="6543581031674028487">
              <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674028488">
                <link role="variableDeclaration:3" targetNodeId="6543581031674028476" resolveInfo="right" />
              </node>
              <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674028489" />
            </node>
          </node>
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028490">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ThrowStatement:3" id="6543581031674028491">
              <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674028492">
                <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674028493">
                  <link role="baseMethodDeclaration:3" targetNodeId="2v.~NullPointerException.&lt;init&gt;()" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674028494">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674028495">
            <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028496">
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674028497">
                <link role="fieldDeclaration:3" targetNodeId="6543581031674028459" resolveInfo="left" />
              </node>
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674028498" />
            </node>
            <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674028499">
              <link role="variableDeclaration:3" targetNodeId="6543581031674028473" resolveInfo="left" />
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674028500">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674028501">
            <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028502">
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674028503">
                <link role="fieldDeclaration:3" targetNodeId="6543581031674028463" resolveInfo="right" />
              </node>
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674028504" />
            </node>
            <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674028505">
              <link role="variableDeclaration:3" targetNodeId="6543581031674028476" resolveInfo="right" />
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674028506">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674028507">
            <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028508">
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674028509">
                <link role="fieldDeclaration:3" targetNodeId="6543581031674028467" resolveInfo="kind" />
              </node>
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674028510" />
            </node>
            <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674028511">
              <link role="variableDeclaration:3" targetNodeId="6543581031674028479" resolveInfo="kind" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674028512">
      <property name="name:3" value="iterator" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674028513" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674028514">
        <link role="classifier:3" targetNodeId="2.~Iterator" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674028515">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674028393" resolveInfo="U" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028516">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674028517">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674028518">
            <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674028519">
              <link role="baseMethodDeclaration:3" targetNodeId="6543581031674028433" resolveInfo="ComparingSequence.ComparingIterator" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="6543581031674028894">
    <property name="name:3" value="FilteringSequence" />
    <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674028895" />
    <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674028896">
      <property name="name:3" value="U" />
    </node>
    <node role="superclass:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674028897">
      <link role="classifier:3" targetNodeId="6543581031674030214" resolveInfo="AbstractChainedSequence" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674028898">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674028896" resolveInfo="U" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674028899">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674028896" resolveInfo="U" />
      </node>
    </node>
    <node role="implementedInterface:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674028900">
      <link role="classifier:3" targetNodeId="2v.~Iterable" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674028901">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674028896" resolveInfo="U" />
      </node>
    </node>
    <node role="staticInnerClassifiers:3" type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="6543581031674028902">
      <property name="name:3" value="FilteringIterator" />
      <property name="nonStatic:3" value="true" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674028903" />
      <node role="implementedInterface:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674028904">
        <link role="classifier:3" targetNodeId="2.~Iterator" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674028905">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674028896" resolveInfo="U" />
        </node>
      </node>
      <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674028906">
        <property name="name:3" value="inputIterator" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674028907">
          <link role="classifier:3" targetNodeId="2.~Iterator" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674028908">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674028896" resolveInfo="U" />
          </node>
        </node>
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674028909" />
      </node>
      <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674028910">
        <property name="name:3" value="hasNext" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674028911">
          <link role="classifier:3" targetNodeId="6543581031674034581" resolveInfo="HasNextState" />
        </node>
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674028912" />
        <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="6543581031674028974">
          <link role="enumClass:3" targetNodeId="6543581031674034581" resolveInfo="HasNextState" />
          <link role="enumConstantDeclaration:3" targetNodeId="6543581031674034583" resolveInfo="UNKNOWN" />
        </node>
      </node>
      <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674028913">
        <property name="name:3" value="next" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674028914">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674028896" resolveInfo="U" />
        </node>
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674028915" />
      </node>
      <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="6543581031674028916">
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674028917" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674028918" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028975" />
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674028919">
        <property name="name:3" value="hasNext" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674028920" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674028921" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028976">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="5746517363044288556">
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="5746517363044288557">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674028982">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6543581031674028983">
                  <link role="baseMethodDeclaration:3" targetNodeId="6543581031674028928" resolveInfo="init" />
                </node>
              </node>
            </node>
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="5746517363044288561">
              <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="5746517363044288564" />
              <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="5746517363044288560">
                <link role="variableDeclaration:3" targetNodeId="6543581031674028906" resolveInfo="inputIterator" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674028977">
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028978">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028979">
                <link role="variableDeclaration:3" targetNodeId="6543581031674028910" resolveInfo="hasNext" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028980">
                <link role="baseMethodDeclaration:3" targetNodeId="6543581031674034605" resolveInfo="unknown" />
              </node>
            </node>
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028981">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674028984">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6543581031674028985">
                  <link role="baseMethodDeclaration:3" targetNodeId="6543581031674028931" resolveInfo="moveToNext" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674028986">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028987">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028988">
                <link role="variableDeclaration:3" targetNodeId="6543581031674028910" resolveInfo="hasNext" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028989">
                <link role="baseMethodDeclaration:3" targetNodeId="6543581031674034613" resolveInfo="hasNext" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674028922">
        <property name="name:3" value="next" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674028923" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674028924">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674028896" resolveInfo="U" />
        </node>
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028990">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="5746517363044288565">
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="5746517363044288566">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="5746517363044288567">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="5746517363044288568">
                  <link role="baseMethodDeclaration:3" targetNodeId="6543581031674028928" resolveInfo="init" />
                </node>
              </node>
            </node>
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="5746517363044288569">
              <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="5746517363044288570" />
              <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="5746517363044288571">
                <link role="variableDeclaration:3" targetNodeId="6543581031674028906" resolveInfo="inputIterator" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674028991">
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028992">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674028993">
                <link role="variableDeclaration:3" targetNodeId="6543581031674028910" resolveInfo="hasNext" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674028994">
                <link role="baseMethodDeclaration:3" targetNodeId="6543581031674034605" resolveInfo="unknown" />
              </node>
            </node>
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028995">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674028998">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6543581031674028999">
                  <link role="baseMethodDeclaration:3" targetNodeId="6543581031674028931" resolveInfo="moveToNext" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674029000">
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.NotExpression:3" id="6543581031674029001">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression:3" id="6543581031674029002">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674029003">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674029004">
                    <link role="variableDeclaration:3" targetNodeId="6543581031674028910" resolveInfo="hasNext" />
                  </node>
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674029005">
                    <link role="baseMethodDeclaration:3" targetNodeId="6543581031674034613" resolveInfo="hasNext" />
                  </node>
                </node>
              </node>
            </node>
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029006">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ThrowStatement:3" id="6543581031674029007">
                <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674029008">
                  <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674029009">
                    <link role="baseMethodDeclaration:3" targetNodeId="2.~NoSuchElementException.&lt;init&gt;()" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="5746517363044288622">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="5746517363044288623">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="5746517363044288624" />
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="5746517363044288625">
                <link role="baseMethodDeclaration:3" targetNodeId="5746517363044288601" resolveInfo="clearNext" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674028925">
        <property name="name:3" value="remove" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674028926" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674028927" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029018">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ThrowStatement:3" id="6543581031674029019">
            <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674029020">
              <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674029021">
                <link role="baseMethodDeclaration:3" targetNodeId="2v.~UnsupportedOperationException.&lt;init&gt;()" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674028928">
        <property name="name:3" value="init" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674028929" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674028930" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029022">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674029023">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674029024">
              <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674029025">
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674029026">
                  <link role="fieldDeclaration:3" targetNodeId="6543581031674028906" resolveInfo="inputIterator" />
                </node>
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674029027" />
              </node>
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674029028">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6543581031674029029">
                  <link role="baseMethodDeclaration:3" targetNodeId="6543581031674030245" resolveInfo="getInput" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674029030">
                  <link role="baseMethodDeclaration:3" targetNodeId="2v.~Iterable.iterator():java.util.Iterator" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674028931">
        <property name="name:3" value="moveToNext" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674028932" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674028933" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029031">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674029032">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674029033">
              <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674029034">
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674029035">
                  <link role="fieldDeclaration:3" targetNodeId="6543581031674028910" resolveInfo="hasNext" />
                </node>
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674029036" />
              </node>
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="6543581031674029037">
                <link role="enumClass:3" targetNodeId="6543581031674034581" resolveInfo="HasNextState" />
                <link role="enumConstantDeclaration:3" targetNodeId="6543581031674034588" resolveInfo="AT_END" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674029038">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674029039">
              <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674029040">
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674029041">
                  <link role="fieldDeclaration:3" targetNodeId="6543581031674028913" resolveInfo="next" />
                </node>
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674029042" />
              </node>
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674029043" />
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.WhileStatement:3" id="6543581031674029044">
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674029045">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674029046">
                <link role="variableDeclaration:3" targetNodeId="6543581031674028906" resolveInfo="inputIterator" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674029047">
                <link role="baseMethodDeclaration:3" targetNodeId="2.~Iterator.hasNext():boolean" />
              </node>
            </node>
            <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029048">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="6543581031674029049">
                <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="6543581031674029050">
                  <property name="name:3" value="tmp" />
                  <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029051">
                    <link role="typeVariableDeclaration:3" targetNodeId="6543581031674028896" resolveInfo="U" />
                  </node>
                  <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674029052">
                    <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674029053">
                      <link role="variableDeclaration:3" targetNodeId="6543581031674028906" resolveInfo="inputIterator" />
                    </node>
                    <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674029054">
                      <link role="baseMethodDeclaration:3" targetNodeId="2.~Iterator.next():java.lang.Object" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674029055">
                <node role="condition:3" type="jetbrains.mps.baseLanguage.closures.structure.CompactInvokeFunctionExpression:3" id="7730170264858297910">
                  <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="7730170264858297913">
                    <link role="variableDeclaration:3" targetNodeId="6543581031674029050" resolveInfo="tmp" />
                  </node>
                  <node role="function:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="7730170264858297911">
                    <link role="variableDeclaration:3" targetNodeId="6543581031674028934" resolveInfo="filter" />
                  </node>
                </node>
                <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029060">
                  <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674029061">
                    <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674029062">
                      <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674029063">
                        <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674029064">
                          <link role="fieldDeclaration:3" targetNodeId="6543581031674028913" resolveInfo="next" />
                        </node>
                        <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674029065" />
                      </node>
                      <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674029066">
                        <link role="variableDeclaration:3" targetNodeId="6543581031674029050" resolveInfo="tmp" />
                      </node>
                    </node>
                  </node>
                  <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674029067">
                    <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674029068">
                      <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674029069">
                        <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674029070">
                          <link role="fieldDeclaration:3" targetNodeId="6543581031674028910" resolveInfo="hasNext" />
                        </node>
                        <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674029071" />
                      </node>
                      <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="6543581031674029072">
                        <link role="enumClass:3" targetNodeId="6543581031674034581" resolveInfo="HasNextState" />
                        <link role="enumConstantDeclaration:3" targetNodeId="6543581031674034586" resolveInfo="HAS_NEXT" />
                      </node>
                    </node>
                  </node>
                  <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.BreakStatement:3" id="6543581031674029073" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="5746517363044288601">
        <property name="name:3" value="clearNext" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="5746517363044288602" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="5746517363044288603">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674028896" resolveInfo="U" />
        </node>
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="5746517363044288604">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="5746517363044288605">
            <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="5746517363044288600">
              <property name="name:3" value="tmp" />
              <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="5746517363044288606">
                <link role="typeVariableDeclaration:3" targetNodeId="6543581031674028896" resolveInfo="U" />
              </node>
              <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="5746517363044288607">
                <link role="variableDeclaration:3" targetNodeId="6543581031674028913" resolveInfo="next" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="5746517363044288608">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="5746517363044288609">
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="5746517363044288610" />
              <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="5746517363044288611">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="5746517363044288612" />
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="5746517363044288613">
                  <link role="fieldDeclaration:3" targetNodeId="6543581031674028913" resolveInfo="next" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="5746517363044288614">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="5746517363044288615">
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="5746517363044288616">
                <link role="enumConstantDeclaration:3" targetNodeId="6543581031674034583" resolveInfo="UNKNOWN" />
                <link role="enumClass:3" targetNodeId="6543581031674034581" resolveInfo="HasNextState" />
              </node>
              <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="5746517363044288617">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="5746517363044288618" />
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="5746517363044288619">
                  <link role="fieldDeclaration:3" targetNodeId="6543581031674028910" resolveInfo="hasNext" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="5746517363044288620">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="5746517363044288621">
              <link role="variableDeclaration:3" targetNodeId="5746517363044288600" resolveInfo="tmp" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674028934">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="filter" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674028938" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.closures.structure.FunctionType:3" id="7730170264858260942">
        <node role="resultType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="7730170264858260943" />
        <node role="parameterType:3" type="jetbrains.mps.baseLanguage.structure.LowerBoundType:3" id="7730170264858260944">
          <node role="bound:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="7730170264858260945">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674028896" resolveInfo="U" />
          </node>
        </node>
      </node>
    </node>
    <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="6543581031674028939">
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674028940" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674028941" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674028942">
        <property name="name:3" value="input" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674028943">
          <link role="classifier:3" targetNodeId="2v.~Iterable" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674028944">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674028896" resolveInfo="U" />
          </node>
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="7730170264858257968">
        <property name="name:3" value="filter" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.closures.structure.FunctionType:3" id="7730170264858257969">
          <node role="resultType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="7730170264858257971" />
          <node role="parameterType:3" type="jetbrains.mps.baseLanguage.structure.LowerBoundType:3" id="7730170264858260939">
            <node role="bound:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="7730170264858260941">
              <link role="typeVariableDeclaration:3" targetNodeId="6543581031674028896" resolveInfo="U" />
            </node>
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028949">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.SuperConstructorInvocation:3" id="6543581031674028950">
          <link role="baseMethodDeclaration:3" targetNodeId="6543581031674030224" resolveInfo="AbstractChainedSequence" />
          <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674028951">
            <link role="variableDeclaration:3" targetNodeId="6543581031674028942" resolveInfo="input" />
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674028952">
          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="6543581031674028953">
            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674028954">
              <link role="variableDeclaration:3" targetNodeId="7730170264858257968" resolveInfo="filter" />
            </node>
            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674028955" />
          </node>
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028956">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ThrowStatement:3" id="6543581031674028957">
              <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674028958">
                <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674028959">
                  <link role="baseMethodDeclaration:3" targetNodeId="2v.~NullPointerException.&lt;init&gt;()" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674028960">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674028961">
            <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674028962">
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674028963">
                <link role="fieldDeclaration:3" targetNodeId="6543581031674028934" resolveInfo="filter" />
              </node>
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674028964" />
            </node>
            <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674028965">
              <link role="variableDeclaration:3" targetNodeId="7730170264858257968" resolveInfo="filter" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674028966">
      <property name="name:3" value="iterator" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674028967" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674028968">
        <link role="classifier:3" targetNodeId="2.~Iterator" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674028969">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674028896" resolveInfo="U" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674028970">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674028971">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674028972">
            <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674028973">
              <link role="baseMethodDeclaration:3" targetNodeId="6543581031674028916" resolveInfo="FilteringSequence.FilteringIterator" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="6543581031674029595">
    <property name="name:3" value="NullSequence" />
    <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029596" />
    <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674029597">
      <property name="name:3" value="T" />
    </node>
    <node role="superclass:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674029598">
      <link role="classifier:3" targetNodeId="1.6543581031674023524" resolveInfo="Sequence" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029599">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029597" resolveInfo="T" />
      </node>
    </node>
    <node role="implementedInterface:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674029600">
      <link role="classifier:3" targetNodeId="2v.~Iterable" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029601">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029597" resolveInfo="T" />
      </node>
    </node>
    <node role="staticInnerClassifiers:3" type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="6543581031674029602">
      <property name="name:3" value="EmptyIterator" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.ProtectedVisibility:3" id="6543581031674029603" />
      <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674029604">
        <property name="name:3" value="U" />
      </node>
      <node role="implementedInterface:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674029605">
        <link role="classifier:3" targetNodeId="2.~Iterator" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029606">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029604" resolveInfo="U" />
        </node>
      </node>
      <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="6543581031674029607">
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.ProtectedVisibility:3" id="6543581031674029608" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674029609" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029719" />
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674029610">
        <property name="name:3" value="hasNext" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029611" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674029612" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029720">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674029721">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="6543581031674029722" />
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674029613">
        <property name="name:3" value="next" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029614" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029615">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029604" resolveInfo="U" />
        </node>
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029723">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ThrowStatement:3" id="6543581031674029724">
            <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674029725">
              <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674029726">
                <link role="baseMethodDeclaration:3" targetNodeId="2.~NoSuchElementException.&lt;init&gt;()" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674029616">
        <property name="name:3" value="remove" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029617" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674029618" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029727">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ThrowStatement:3" id="6543581031674029728">
            <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674029729">
              <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674029730">
                <link role="baseMethodDeclaration:3" targetNodeId="2v.~UnsupportedOperationException.&lt;init&gt;()" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticField:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration:3" id="6543581031674029619">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="INSTANCE" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674029620">
        <link role="classifier:3" targetNodeId="6543581031674029595" resolveInfo="NullSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674029621">
          <link role="classifier:3" targetNodeId="2v.~Object" />
        </node>
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674029622" />
      <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674029623">
        <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674029624">
          <link role="baseMethodDeclaration:3" targetNodeId="6543581031674029640" resolveInfo="NullSequence" />
          <node role="typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674029625">
            <link role="classifier:3" targetNodeId="2v.~Object" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration:3" id="6543581031674029626">
      <property name="name:3" value="instance" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029627" />
      <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674029628">
        <property name="name:3" value="U" />
      </node>
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674029629">
        <link role="classifier:3" targetNodeId="6543581031674029595" resolveInfo="NullSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029630">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029628" resolveInfo="U" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029631">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674029632">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.CastExpression:3" id="6543581031674029633">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalStaticFieldReference:3" id="6543581031674029634">
              <link role="variableDeclaration:3" targetNodeId="6543581031674029619" resolveInfo="INSTANCE" />
            </node>
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674029635">
              <link role="classifier:3" targetNodeId="6543581031674029595" resolveInfo="NullSequence" />
              <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029636">
                <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029628" resolveInfo="U" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="6543581031674029637">
        <link role="annotation:3" targetNodeId="2v.~SuppressWarnings" />
        <node role="value:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstanceValue:3" id="6543581031674029638">
          <link role="key:3" targetNodeId="2v.~SuppressWarnings.value()" />
          <node role="value:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="6543581031674029639">
            <property name="value:3" value="unchecked" />
          </node>
        </node>
      </node>
    </node>
    <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="6543581031674029640">
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.ProtectedVisibility:3" id="6543581031674029641" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674029642" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029643" />
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674029644">
      <property name="name:3" value="first" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029645" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029646">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029597" resolveInfo="T" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029647">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674029648">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674029649" />
        </node>
      </node>
      <node role="annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="6543581031674029650">
        <link role="annotation:3" targetNodeId="2v.~Override" />
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674029651">
      <property name="name:3" value="last" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029652" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029653">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029597" resolveInfo="T" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029654">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674029655">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674029656" />
        </node>
      </node>
      <node role="annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="6543581031674029657">
        <link role="annotation:3" targetNodeId="2v.~Override" />
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674029658">
      <property name="name:3" value="cut" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029659" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674029660">
        <link role="classifier:3" targetNodeId="1.6543581031674024311" resolveInfo="ISequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029661">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029597" resolveInfo="T" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674029662">
        <property name="name:3" value="length" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="6543581031674029663" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029664">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674029665">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674029666" />
        </node>
      </node>
      <node role="annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="6543581031674029667">
        <link role="annotation:3" targetNodeId="2v.~Override" />
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674029668">
      <property name="name:3" value="skip" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029669" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674029670">
        <link role="classifier:3" targetNodeId="1.6543581031674024311" resolveInfo="ISequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029671">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029597" resolveInfo="T" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674029672">
        <property name="name:3" value="length" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="6543581031674029673" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029674">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674029675">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674029676" />
        </node>
      </node>
      <node role="annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="6543581031674029677">
        <link role="annotation:3" targetNodeId="2v.~Override" />
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674029678">
      <property name="name:3" value="tail" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029679" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674029680">
        <link role="classifier:3" targetNodeId="1.6543581031674024311" resolveInfo="ISequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029681">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029597" resolveInfo="T" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674029682">
        <property name="name:3" value="length" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="6543581031674029683" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029684">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674029685">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674029686" />
        </node>
      </node>
      <node role="annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="6543581031674029687">
        <link role="annotation:3" targetNodeId="2v.~Override" />
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674029688">
      <property name="name:3" value="take" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029689" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674029690">
        <link role="classifier:3" targetNodeId="1.6543581031674024311" resolveInfo="ISequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029691">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029597" resolveInfo="T" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674029692">
        <property name="name:3" value="length" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="6543581031674029693" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029694">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674029695">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674029696" />
        </node>
      </node>
      <node role="annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="6543581031674029697">
        <link role="annotation:3" targetNodeId="2v.~Override" />
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674029698">
      <property name="name:3" value="page" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029699" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674029700">
        <link role="classifier:3" targetNodeId="1.6543581031674024311" resolveInfo="ISequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029701">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029597" resolveInfo="T" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674029702">
        <property name="name:3" value="skip" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="6543581031674029703" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674029704">
        <property name="name:3" value="skipplustake" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="6543581031674029705" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029706">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674029707">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674029708" />
        </node>
      </node>
      <node role="annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="6543581031674029709">
        <link role="annotation:3" targetNodeId="2v.~Override" />
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674029710">
      <property name="name:3" value="iterator" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029711" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674029712">
        <link role="classifier:3" targetNodeId="2.~Iterator" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029713">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029597" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029714">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674029715">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674029716">
            <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674029717">
              <link role="baseMethodDeclaration:3" targetNodeId="6543581031674029607" resolveInfo="NullSequence.EmptyIterator" />
              <node role="typeParameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029718">
                <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029597" resolveInfo="T" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="6543581031674029731">
    <property name="name:3" value="NullLinkedListSequence" />
    <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029732" />
    <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674029733">
      <property name="name:3" value="T" />
    </node>
    <node role="superclass:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674029734">
      <link role="classifier:3" targetNodeId="6543581031674026912" resolveInfo="NullListSequence" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029735">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029733" resolveInfo="T" />
      </node>
    </node>
    <node role="implementedInterface:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674029736">
      <link role="classifier:3" targetNodeId="1.6543581031674024810" resolveInfo="ILinkedListSequence" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029737">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029733" resolveInfo="T" />
      </node>
    </node>
    <node role="implementedInterface:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674029738">
      <link role="classifier:3" targetNodeId="1.6543581031674027290" resolveInfo="ILinkedList" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029739">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029733" resolveInfo="T" />
      </node>
    </node>
    <node role="staticField:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration:3" id="6543581031674029740">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="INSTANCE" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674029741">
        <link role="classifier:3" targetNodeId="6543581031674029731" resolveInfo="NullLinkedListSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674029742">
          <link role="classifier:3" targetNodeId="2v.~Object" />
        </node>
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674029743" />
      <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674029744">
        <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674029745">
          <link role="baseMethodDeclaration:3" targetNodeId="6543581031674029761" resolveInfo="NullLinkedListSequence" />
          <node role="typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674029746">
            <link role="classifier:3" targetNodeId="2v.~Object" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration:3" id="6543581031674029747">
      <property name="name:3" value="instance" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029748" />
      <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674029749">
        <property name="name:3" value="U" />
      </node>
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674029750">
        <link role="classifier:3" targetNodeId="6543581031674029731" resolveInfo="NullLinkedListSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029751">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029749" resolveInfo="U" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029752">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674029753">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.CastExpression:3" id="6543581031674029754">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalStaticFieldReference:3" id="6543581031674029755">
              <link role="variableDeclaration:3" targetNodeId="6543581031674029740" resolveInfo="INSTANCE" />
            </node>
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674029756">
              <link role="classifier:3" targetNodeId="6543581031674029731" resolveInfo="NullLinkedListSequence" />
              <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029757">
                <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029749" resolveInfo="U" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="6543581031674029758">
        <link role="annotation:3" targetNodeId="2v.~SuppressWarnings" />
        <node role="value:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstanceValue:3" id="6543581031674029759">
          <link role="key:3" targetNodeId="2v.~SuppressWarnings.value()" />
          <node role="value:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="6543581031674029760">
            <property name="value:3" value="unchecked" />
          </node>
        </node>
      </node>
    </node>
    <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="6543581031674029761">
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.ProtectedVisibility:3" id="6543581031674029762" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674029763" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029764" />
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674029765">
      <property name="name:3" value="addFirst" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029766" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674029767" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674029768">
        <property name="name:3" value="t" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029769">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029733" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029770" />
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674029771">
      <property name="name:3" value="addLast" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029772" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674029773" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674029774">
        <property name="name:3" value="t" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029775">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029733" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029776" />
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674029777">
      <property name="name:3" value="offerFirst" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029778" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674029779" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674029780">
        <property name="name:3" value="t" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029781">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029733" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029782">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674029783">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="6543581031674029784" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674029785">
      <property name="name:3" value="offerLast" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029786" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674029787" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674029788">
        <property name="name:3" value="t" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029789">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029733" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029790">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674029791">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="6543581031674029792" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674029793">
      <property name="name:3" value="removeFirst" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029794" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029795">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029733" resolveInfo="T" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029796">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674029797">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674029798" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674029799">
      <property name="name:3" value="removeLast" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029800" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029801">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029733" resolveInfo="T" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029802">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674029803">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674029804" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674029805">
      <property name="name:3" value="addLastElement" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029806" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029807">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029733" resolveInfo="T" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674029808">
        <property name="name:3" value="t" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029809">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029733" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029810">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674029811">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674029812" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674029813">
      <property name="name:3" value="pollLast" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029814" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029815">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029733" resolveInfo="T" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029816">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674029817">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674029818" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674029819">
      <property name="name:3" value="removeFirstElement" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029820" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029821">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029733" resolveInfo="T" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029822">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674029823">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674029824" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674029825">
      <property name="name:3" value="getFirst" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029826" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029827">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029733" resolveInfo="T" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029828">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674029829">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674029830" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674029831">
      <property name="name:3" value="getLast" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029832" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029833">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029733" resolveInfo="T" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029834">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674029835">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674029836" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674029837">
      <property name="name:3" value="toQueue" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029838" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674029839">
        <link role="classifier:3" targetNodeId="2.~Queue" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029840">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029733" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029841">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674029842">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674029843" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674029844">
      <property name="name:3" value="peekFirst" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029845" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029846">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029733" resolveInfo="T" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029847">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674029848">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674029849" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674029850">
      <property name="name:3" value="addFirstElement" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029851" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029852">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029733" resolveInfo="T" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674029853">
        <property name="name:3" value="t" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029854">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029733" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029855">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674029856">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674029857" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674029858">
      <property name="name:3" value="peekLast" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029859" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029860">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029733" resolveInfo="T" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029861">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674029862">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674029863" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674029864">
      <property name="name:3" value="removeFirstOccurrence" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029865" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674029866" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674029867">
        <property name="name:3" value="o" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674029868">
          <link role="classifier:3" targetNodeId="2v.~Object" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029869">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674029870">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="6543581031674029871" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674029872">
      <property name="name:3" value="peekElement" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029873" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029874">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029733" resolveInfo="T" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029875">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674029876">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674029877" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674029878">
      <property name="name:3" value="removeLastOccurrence" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029879" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674029880" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674029881">
        <property name="name:3" value="o" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674029882">
          <link role="classifier:3" targetNodeId="2v.~Object" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029883">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674029884">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="6543581031674029885" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674029886">
      <property name="name:3" value="pushElement" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029887" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029888">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029733" resolveInfo="T" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674029889">
        <property name="name:3" value="t" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029890">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029733" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029891">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674029892">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674029893" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674029894">
      <property name="name:3" value="toDeque" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029895" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674029896">
        <link role="classifier:3" targetNodeId="3.6543581031674027297" resolveInfo="Deque" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029897">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029733" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029898">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674029899">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674029900" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674029901">
      <property name="name:3" value="offer" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029902" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674029903" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674029904">
        <property name="name:3" value="t" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029905">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029733" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029906">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674029907">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="6543581031674029908" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674029909">
      <property name="name:3" value="remove" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029910" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029911">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029733" resolveInfo="T" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029912">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674029913">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674029914" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674029915">
      <property name="name:3" value="poll" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029916" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029917">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029733" resolveInfo="T" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029918">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674029919">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674029920" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674029921">
      <property name="name:3" value="element" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029922" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029923">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029733" resolveInfo="T" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029924">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674029925">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674029926" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674029927">
      <property name="name:3" value="peek" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029928" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029929">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029733" resolveInfo="T" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029930">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674029931">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674029932" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674029933">
      <property name="name:3" value="push" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029934" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674029935" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674029936">
        <property name="name:3" value="t" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029937">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029733" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029938" />
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674029939">
      <property name="name:3" value="pop" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029940" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029941">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029733" resolveInfo="T" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029942">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674029943">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674029944" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674029945">
      <property name="name:3" value="descendingIterator" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029946" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674029947">
        <link role="classifier:3" targetNodeId="2.~Iterator" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029948">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029733" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029949">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674029950">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674029951">
            <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674029952">
              <link role="baseMethodDeclaration:3" targetNodeId="6543581031674029607" resolveInfo="NullSequence.EmptyIterator" />
              <node role="typeParameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029953">
                <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029733" resolveInfo="T" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674029954">
      <property name="name:3" value="pollFirst" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029955" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029956">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029733" resolveInfo="T" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029957">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674029958">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674029959" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674029960">
      <property name="name:3" value="popElement" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029961" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029962">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029733" resolveInfo="T" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029963">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674029964">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674029965" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674029966">
      <property name="name:3" value="asSynchronized" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029967" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674029968">
        <link role="classifier:3" targetNodeId="1.6543581031674024810" resolveInfo="ILinkedListSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029969">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029733" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029970">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674029971">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674029972" />
        </node>
      </node>
      <node role="annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="6543581031674029973">
        <link role="annotation:3" targetNodeId="2v.~Override" />
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674029974">
      <property name="name:3" value="asUnmodifiable" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029975" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674029976">
        <link role="classifier:3" targetNodeId="1.6543581031674024810" resolveInfo="ILinkedListSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029977">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029733" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029978">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674029979">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674029980" />
        </node>
      </node>
      <node role="annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="6543581031674029981">
        <link role="annotation:3" targetNodeId="2v.~Override" />
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674029982">
      <property name="name:3" value="removeWhere" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029983" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674029984">
        <link role="classifier:3" targetNodeId="1.6543581031674024810" resolveInfo="ILinkedListSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029985">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029733" resolveInfo="T" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674029986">
        <property name="name:3" value="tiWhereFilter" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.closures.structure.FunctionType:3" id="7730170264858260981">
          <node role="resultType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="7730170264858260982" />
          <node role="parameterType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="7730170264858260985">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029733" resolveInfo="T" />
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674029989">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674029990">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674029991" />
        </node>
      </node>
      <node role="annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="6543581031674029992">
        <link role="annotation:3" targetNodeId="2v.~Override" />
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674029993">
      <property name="name:3" value="addSequence" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674029994" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674029995">
        <link role="classifier:3" targetNodeId="1.6543581031674024810" resolveInfo="ILinkedListSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674029996">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029733" resolveInfo="T" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674029997">
        <property name="name:3" value="seq" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674029998">
          <link role="classifier:3" targetNodeId="1.6543581031674024311" resolveInfo="ISequence" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.UpperBoundType:3" id="6543581031674029999">
            <node role="bound:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674030000">
              <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029733" resolveInfo="T" />
            </node>
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674030001">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674030002">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674030003" />
        </node>
      </node>
      <node role="annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="6543581031674030004">
        <link role="annotation:3" targetNodeId="2v.~Override" />
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674030005">
      <property name="name:3" value="removeSequence" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674030006" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674030007">
        <link role="classifier:3" targetNodeId="1.6543581031674024810" resolveInfo="ILinkedListSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674030008">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029733" resolveInfo="T" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674030009">
        <property name="name:3" value="seq" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674030010">
          <link role="classifier:3" targetNodeId="1.6543581031674024311" resolveInfo="ISequence" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.UpperBoundType:3" id="6543581031674030011">
            <node role="bound:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674030012">
              <link role="typeVariableDeclaration:3" targetNodeId="6543581031674029733" resolveInfo="T" />
            </node>
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674030013">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674030014">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674030015" />
        </node>
      </node>
      <node role="annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="6543581031674030016">
        <link role="annotation:3" targetNodeId="2v.~Override" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="6543581031674030152">
    <property name="name:3" value="TranslatorAdapter" />
    <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674030153" />
    <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674030154">
      <property name="name:3" value="T" />
    </node>
    <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674030155">
      <property name="name:3" value="S" />
    </node>
    <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674030159">
      <property name="name:3" value="translator2" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.closures.structure.FunctionType:3" id="3473971317150331407">
        <node role="parameterType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="3473971317150331408">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674030154" resolveInfo="T" />
        </node>
        <node role="resultType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="3473971317150331409">
          <link role="classifier:3" targetNodeId="2v.~Iterable" resolveInfo="Iterable" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="3473971317150331410">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674030155" resolveInfo="S" />
          </node>
        </node>
      </node>
    </node>
    <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="6543581031674030163">
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674030164" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674030165" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="3473971317150331398">
        <property name="name:3" value="translator2" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.closures.structure.FunctionType:3" id="3473971317150331399">
          <node role="parameterType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="3473971317150331400">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674030154" resolveInfo="T" />
          </node>
          <node role="resultType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="3473971317150331401">
            <link role="classifier:3" targetNodeId="2v.~Iterable" resolveInfo="Iterable" />
            <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="3473971317150331406">
              <link role="typeVariableDeclaration:3" targetNodeId="6543581031674030155" resolveInfo="S" />
            </node>
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674030170">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674030171">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674030172">
            <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674030173">
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674030174">
                <link role="fieldDeclaration:3" targetNodeId="6543581031674030159" resolveInfo="translator2" />
              </node>
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674030175" />
            </node>
            <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674030176">
              <link role="variableDeclaration:3" targetNodeId="3473971317150331398" resolveInfo="translator2" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674030177">
      <property name="name:3" value="translate" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674030178" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674030179">
        <link role="classifier:3" targetNodeId="1.6543581031674024311" resolveInfo="ISequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674030180">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674030155" resolveInfo="S" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674030181">
        <property name="name:3" value="t" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674030182">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674030154" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674030183">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674030184">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="6543581031674030185">
            <link role="classConcept:3" targetNodeId="1.6543581031674023524" resolveInfo="Sequence" />
            <link role="baseMethodDeclaration:3" targetNodeId="1.6543581031674023610" resolveInfo="fromIterable" />
            <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.closures.structure.CompactInvokeFunctionExpression:3" id="3473971317150331411">
              <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="3473971317150331414">
                <link role="variableDeclaration:3" targetNodeId="6543581031674030181" resolveInfo="t" />
              </node>
              <node role="function:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="3473971317150331412">
                <link role="variableDeclaration:3" targetNodeId="6543581031674030159" resolveInfo="translator2" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="superclass:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="3473971317150294878">
      <link role="classifier:3" targetNodeId="1.3473971317150294731" resolveInfo="ITranslator" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="3473971317150294880">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674030154" resolveInfo="T" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="3473971317150294882">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674030155" resolveInfo="S" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="6543581031674030214">
    <property name="abstractClass:3" value="true" />
    <property name="name:3" value="AbstractChainedSequence" />
    <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674030215" />
    <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674030216">
      <property name="name:3" value="U" />
    </node>
    <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674030217">
      <property name="name:3" value="V" />
    </node>
    <node role="superclass:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674030218">
      <link role="classifier:3" targetNodeId="1.6543581031674023524" resolveInfo="Sequence" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674030219">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674030217" resolveInfo="V" />
      </node>
    </node>
    <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674030220">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="input" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674030221">
        <link role="classifier:3" targetNodeId="2v.~Iterable" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674030222">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674030216" resolveInfo="U" />
        </node>
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674030223" />
    </node>
    <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="6543581031674030224">
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674030225" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674030226" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674030227">
        <property name="name:3" value="input" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674030228">
          <link role="classifier:3" targetNodeId="2v.~Iterable" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674030229">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674030216" resolveInfo="U" />
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674030230">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674030231">
          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="6543581031674030232">
            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674030233">
              <link role="variableDeclaration:3" targetNodeId="6543581031674030227" resolveInfo="input" />
            </node>
            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674030234" />
          </node>
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674030235">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ThrowStatement:3" id="6543581031674030236">
              <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674030237">
                <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674030238">
                  <link role="baseMethodDeclaration:3" targetNodeId="2v.~NullPointerException.&lt;init&gt;()" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674030239">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674030240">
            <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674030241">
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674030242">
                <link role="fieldDeclaration:3" targetNodeId="6543581031674030220" resolveInfo="input" />
              </node>
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674030243" />
            </node>
            <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674030244">
              <link role="variableDeclaration:3" targetNodeId="6543581031674030227" resolveInfo="input" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674030245">
      <property name="name:3" value="getInput" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674030246" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674030247">
        <link role="classifier:3" targetNodeId="2v.~Iterable" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674030248">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674030216" resolveInfo="U" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674030249">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674030250">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674030251">
            <link role="variableDeclaration:3" targetNodeId="6543581031674030220" resolveInfo="input" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="6543581031674030252">
    <property name="name:3" value="BasicSequence" />
    <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674030253" />
    <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674030254">
      <property name="name:3" value="U" />
    </node>
    <node role="superclass:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674030255">
      <link role="classifier:3" targetNodeId="1.6543581031674023524" resolveInfo="Sequence" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674030256">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674030254" resolveInfo="U" />
      </node>
    </node>
    <node role="implementedInterface:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674030257">
      <link role="classifier:3" targetNodeId="2v.~Iterable" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674030258">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674030254" resolveInfo="U" />
      </node>
    </node>
    <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674030259">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="input" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674030260">
        <link role="classifier:3" targetNodeId="2v.~Iterable" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674030261">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674030254" resolveInfo="U" />
        </node>
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674030262" />
    </node>
    <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="6543581031674030263">
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674030264" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674030265" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674030266">
        <property name="name:3" value="input" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674030267">
          <link role="classifier:3" targetNodeId="2v.~Iterable" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674030268">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674030254" resolveInfo="U" />
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674030269">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674030270">
          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="6543581031674030271">
            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674030272">
              <link role="variableDeclaration:3" targetNodeId="6543581031674030266" resolveInfo="input" />
            </node>
            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674030273" />
          </node>
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674030274">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ThrowStatement:3" id="6543581031674030275">
              <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674030276">
                <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674030277">
                  <link role="baseMethodDeclaration:3" targetNodeId="2v.~NullPointerException.&lt;init&gt;()" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674030278">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674030279">
            <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674030280">
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674030281">
                <link role="fieldDeclaration:3" targetNodeId="6543581031674030259" resolveInfo="input" />
              </node>
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674030282" />
            </node>
            <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674030283">
              <link role="variableDeclaration:3" targetNodeId="6543581031674030266" resolveInfo="input" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674030284">
      <property name="name:3" value="iterator" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674030285" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674030286">
        <link role="classifier:3" targetNodeId="2.~Iterator" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674030287">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674030254" resolveInfo="U" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674030288">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674030289">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674030290">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674030291">
              <link role="variableDeclaration:3" targetNodeId="6543581031674030259" resolveInfo="input" />
            </node>
            <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674030292">
              <link role="baseMethodDeclaration:3" targetNodeId="2v.~Iterable.iterator():java.util.Iterator" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="6543581031674034089">
    <property name="name:3" value="SelectingSequence" />
    <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674034090" />
    <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674034091">
      <property name="name:3" value="U" />
    </node>
    <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674034092">
      <property name="name:3" value="V" />
    </node>
    <node role="superclass:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674034093">
      <link role="classifier:3" targetNodeId="6543581031674030214" resolveInfo="AbstractChainedSequence" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674034094">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674034091" resolveInfo="U" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674034095">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674034092" resolveInfo="V" />
      </node>
    </node>
    <node role="implementedInterface:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674034096">
      <link role="classifier:3" targetNodeId="2v.~Iterable" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674034097">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674034092" resolveInfo="V" />
      </node>
    </node>
    <node role="staticInnerClassifiers:3" type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="6543581031674034098">
      <property name="name:3" value="SelectingIterator" />
      <property name="nonStatic:3" value="true" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674034099" />
      <node role="implementedInterface:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674034100">
        <link role="classifier:3" targetNodeId="2.~Iterator" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674034101">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674034092" resolveInfo="V" />
        </node>
      </node>
      <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674034102">
        <property name="name:3" value="inputIterator" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674034103">
          <link role="classifier:3" targetNodeId="2.~Iterator" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674034104">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674034091" resolveInfo="U" />
          </node>
        </node>
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674034105" />
        <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674034164" />
      </node>
      <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674034106">
        <property name="name:3" value="hasNext" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="7797065405157484018">
          <link role="classifier:3" targetNodeId="6543581031674034581" resolveInfo="HasNextState" />
        </node>
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674034108" />
        <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="7797065405157484021">
          <link role="enumConstantDeclaration:3" targetNodeId="6543581031674034583" resolveInfo="UNKNOWN" />
          <link role="enumClass:3" targetNodeId="6543581031674034581" resolveInfo="HasNextState" />
        </node>
      </node>
      <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674034109">
        <property name="name:3" value="next" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674034110">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674034092" resolveInfo="V" />
        </node>
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674034111" />
      </node>
      <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="6543581031674034112">
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674034113" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674034114" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674034165" />
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674034115">
        <property name="name:3" value="hasNext" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674034116" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674034117" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674034166">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674034167">
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="6543581031674034168">
              <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674034169">
                <link role="variableDeclaration:3" targetNodeId="6543581031674034102" resolveInfo="inputIterator" />
              </node>
              <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674034170" />
            </node>
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674034171">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674034172">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6543581031674034173">
                  <link role="baseMethodDeclaration:3" targetNodeId="6543581031674034124" resolveInfo="init" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="7797065405157484058">
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="7797065405157484059">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674034174">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6543581031674034175">
                  <link role="baseMethodDeclaration:3" targetNodeId="6543581031674034127" resolveInfo="moveToNext" />
                </node>
              </node>
            </node>
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="7797065405157484063">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="7797065405157484062">
                <link role="variableDeclaration:3" targetNodeId="6543581031674034106" resolveInfo="hasNext" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="7797065405157484067">
                <link role="baseMethodDeclaration:3" targetNodeId="6543581031674034605" resolveInfo="unknown" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674034176">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="7797065405157484022">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674034177">
                <link role="variableDeclaration:3" targetNodeId="6543581031674034106" resolveInfo="hasNext" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="7797065405157484026">
                <link role="baseMethodDeclaration:3" targetNodeId="6543581031674034613" resolveInfo="hasNext" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674034118">
        <property name="name:3" value="next" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674034119" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674034120">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674034092" resolveInfo="V" />
        </node>
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674034178">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674034179">
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="6543581031674034180">
              <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674034181">
                <link role="variableDeclaration:3" targetNodeId="6543581031674034102" resolveInfo="inputIterator" />
              </node>
              <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674034182" />
            </node>
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674034183">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674034184">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6543581031674034185">
                  <link role="baseMethodDeclaration:3" targetNodeId="6543581031674034124" resolveInfo="init" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="7797065405157484069">
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="7797065405157484070">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674034186">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6543581031674034187">
                  <link role="baseMethodDeclaration:3" targetNodeId="6543581031674034127" resolveInfo="moveToNext" />
                </node>
              </node>
            </node>
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="7797065405157484074">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="7797065405157484073">
                <link role="variableDeclaration:3" targetNodeId="6543581031674034106" resolveInfo="hasNext" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="7797065405157484078">
                <link role="baseMethodDeclaration:3" targetNodeId="6543581031674034605" resolveInfo="unknown" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674034188">
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.NotExpression:3" id="6543581031674034189">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="7797065405157484028">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674034190">
                  <link role="variableDeclaration:3" targetNodeId="6543581031674034106" resolveInfo="hasNext" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="7797065405157484032">
                  <link role="baseMethodDeclaration:3" targetNodeId="6543581031674034613" resolveInfo="hasNext" />
                </node>
              </node>
            </node>
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674034191">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ThrowStatement:3" id="6543581031674034192">
                <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674034193">
                  <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674034194">
                    <link role="baseMethodDeclaration:3" targetNodeId="2.~NoSuchElementException.&lt;init&gt;()" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="5746517363044288483">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="5746517363044288484">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="5746517363044288485" />
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="5746517363044288486">
                <link role="baseMethodDeclaration:3" targetNodeId="5746517363044288462" resolveInfo="clearNext" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674034121">
        <property name="name:3" value="remove" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674034122" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674034123" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674034203">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ThrowStatement:3" id="6543581031674034204">
            <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674034205">
              <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674034206">
                <link role="baseMethodDeclaration:3" targetNodeId="2v.~UnsupportedOperationException.&lt;init&gt;()" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674034124">
        <property name="name:3" value="init" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674034125" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674034126" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674034207">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674034208">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674034209">
              <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674034210">
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674034211">
                  <link role="fieldDeclaration:3" targetNodeId="6543581031674034102" resolveInfo="inputIterator" />
                </node>
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674034212" />
              </node>
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674034213">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6543581031674034214">
                  <link role="baseMethodDeclaration:3" targetNodeId="6543581031674030245" resolveInfo="getInput" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674034215">
                  <link role="baseMethodDeclaration:3" targetNodeId="2v.~Iterable.iterator():java.util.Iterator" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674034127">
        <property name="name:3" value="moveToNext" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674034128" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674034129" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674034216">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674034217">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674034218">
              <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674034219">
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674034220">
                  <link role="fieldDeclaration:3" targetNodeId="6543581031674034106" resolveInfo="hasNext" />
                </node>
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674034221" />
              </node>
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="7797065405157489136">
                <link role="enumConstantDeclaration:3" targetNodeId="6543581031674034588" resolveInfo="AT_END" />
                <link role="enumClass:3" targetNodeId="6543581031674034581" resolveInfo="HasNextState" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674034223">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674034224">
              <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674034225">
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674034226">
                  <link role="fieldDeclaration:3" targetNodeId="6543581031674034109" resolveInfo="next" />
                </node>
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674034227" />
              </node>
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674034228" />
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.WhileStatement:3" id="6543581031674034229">
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674034230">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674034231">
                <link role="variableDeclaration:3" targetNodeId="6543581031674034102" resolveInfo="inputIterator" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674034232">
                <link role="baseMethodDeclaration:3" targetNodeId="2.~Iterator.hasNext():boolean" />
              </node>
            </node>
            <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674034233">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="6543581031674034234">
                <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="6543581031674034235">
                  <property name="name:3" value="tmp" />
                  <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674034236">
                    <link role="typeVariableDeclaration:3" targetNodeId="6543581031674034092" resolveInfo="V" />
                  </node>
                  <node role="initializer:3" type="jetbrains.mps.baseLanguage.closures.structure.CompactInvokeFunctionExpression:3" id="3473971317150288060">
                    <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="3473971317150288062">
                      <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="3473971317150288063">
                        <link role="variableDeclaration:3" targetNodeId="6543581031674034102" resolveInfo="inputIterator" />
                      </node>
                      <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="3473971317150288064">
                        <link role="baseMethodDeclaration:3" targetNodeId="2.~Iterator.next():java.lang.Object" resolveInfo="next" />
                      </node>
                    </node>
                    <node role="function:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="3473971317150288061">
                      <link role="variableDeclaration:3" targetNodeId="6543581031674034130" resolveInfo="selector" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674034243">
                <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference:3" id="6543581031674034244">
                  <link role="classifier:3" targetNodeId="1.6543581031674023524" resolveInfo="Sequence" />
                  <link role="variableDeclaration:3" targetNodeId="1.6543581031674023535" resolveInfo="IGNORE_NULL_VALUES" />
                </node>
                <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674034245">
                  <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674034246">
                    <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="6543581031674034247">
                      <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674034248">
                        <link role="variableDeclaration:3" targetNodeId="6543581031674034235" resolveInfo="tmp" />
                      </node>
                      <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674034249" />
                    </node>
                    <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674034250">
                      <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ContinueStatement:3" id="6543581031674034251" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674034252">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674034253">
                  <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674034254">
                    <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674034255">
                      <link role="fieldDeclaration:3" targetNodeId="6543581031674034106" resolveInfo="hasNext" />
                    </node>
                    <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674034256" />
                  </node>
                  <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="7797065405157489138">
                    <link role="enumConstantDeclaration:3" targetNodeId="6543581031674034586" resolveInfo="HAS_NEXT" />
                    <link role="enumClass:3" targetNodeId="6543581031674034581" resolveInfo="HasNextState" />
                  </node>
                </node>
              </node>
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674034258">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674034259">
                  <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674034260">
                    <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674034261">
                      <link role="fieldDeclaration:3" targetNodeId="6543581031674034109" resolveInfo="next" />
                    </node>
                    <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674034262" />
                  </node>
                  <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674034263">
                    <link role="variableDeclaration:3" targetNodeId="6543581031674034235" resolveInfo="tmp" />
                  </node>
                </node>
              </node>
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.BreakStatement:3" id="6543581031674034264" />
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="5746517363044288462">
        <property name="name:3" value="clearNext" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="5746517363044288463" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="5746517363044288464">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674034092" resolveInfo="V" />
        </node>
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="5746517363044288465">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="5746517363044288466">
            <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="5746517363044288461">
              <property name="name:3" value="tmp" />
              <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="5746517363044288467">
                <link role="typeVariableDeclaration:3" targetNodeId="6543581031674034092" resolveInfo="V" />
              </node>
              <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="5746517363044288468">
                <link role="variableDeclaration:3" targetNodeId="6543581031674034109" resolveInfo="next" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="5746517363044288469">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="5746517363044288470">
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="5746517363044288471" />
              <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="5746517363044288472">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="5746517363044288473" />
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="5746517363044288474">
                  <link role="fieldDeclaration:3" targetNodeId="6543581031674034109" resolveInfo="next" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="5746517363044288475">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="5746517363044288476">
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="5746517363044288477">
                <link role="enumConstantDeclaration:3" targetNodeId="6543581031674034583" resolveInfo="UNKNOWN" />
                <link role="enumClass:3" targetNodeId="6543581031674034581" resolveInfo="HasNextState" />
              </node>
              <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="5746517363044288478">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="5746517363044288479" />
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="5746517363044288480">
                  <link role="fieldDeclaration:3" targetNodeId="6543581031674034106" resolveInfo="hasNext" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="5746517363044288481">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="5746517363044288482">
              <link role="variableDeclaration:3" targetNodeId="5746517363044288461" resolveInfo="tmp" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674034130">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="selector" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674034135" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.closures.structure.FunctionType:3" id="3473971317150288056">
        <node role="parameterType:3" type="jetbrains.mps.baseLanguage.structure.LowerBoundType:3" id="3473971317150288057">
          <node role="bound:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="3473971317150288058">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674034091" resolveInfo="U" />
          </node>
        </node>
        <node role="resultType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="3473971317150288059">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674034092" resolveInfo="V" />
        </node>
      </node>
    </node>
    <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="6543581031674034136">
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674034137" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674034138" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674034139">
        <property name="name:3" value="input" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674034140">
          <link role="classifier:3" targetNodeId="2v.~Iterable" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674034141">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674034091" resolveInfo="U" />
          </node>
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="3473971317150285085">
        <property name="name:3" value="selector" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.closures.structure.FunctionType:3" id="3473971317150288048">
          <node role="parameterType:3" type="jetbrains.mps.baseLanguage.structure.LowerBoundType:3" id="3473971317150288052">
            <node role="bound:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="3473971317150288054">
              <link role="typeVariableDeclaration:3" targetNodeId="6543581031674034091" resolveInfo="U" />
            </node>
          </node>
          <node role="resultType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="3473971317150288055">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674034092" resolveInfo="V" />
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674034147">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.SuperConstructorInvocation:3" id="6543581031674034148">
          <link role="baseMethodDeclaration:3" targetNodeId="6543581031674030224" resolveInfo="AbstractChainedSequence" />
          <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674034149">
            <link role="variableDeclaration:3" targetNodeId="6543581031674034139" resolveInfo="input" />
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674034150">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674034151">
            <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674034152">
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674034153">
                <link role="fieldDeclaration:3" targetNodeId="6543581031674034130" resolveInfo="selector" />
              </node>
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674034154" />
            </node>
            <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674034155">
              <link role="variableDeclaration:3" targetNodeId="3473971317150285085" resolveInfo="selector" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674034156">
      <property name="name:3" value="iterator" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674034157" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674034158">
        <link role="classifier:3" targetNodeId="2.~Iterator" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674034159">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674034092" resolveInfo="V" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674034160">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674034161">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674034162">
            <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674034163">
              <link role="baseMethodDeclaration:3" targetNodeId="6543581031674034112" resolveInfo="SelectingSequence.SelectingIterator" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="6543581031674034265">
    <property name="name:3" value="ReversingSequence" />
    <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674034266" />
    <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674034267">
      <property name="name:3" value="T" />
    </node>
    <node role="superclass:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674034268">
      <link role="classifier:3" targetNodeId="6543581031674030214" resolveInfo="AbstractChainedSequence" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674034269">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674034267" resolveInfo="T" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674034270">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674034267" resolveInfo="T" />
      </node>
    </node>
    <node role="staticInnerClassifiers:3" type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="6543581031674034271">
      <property name="name:3" value="ReversingIterator" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674034272" />
      <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674034273">
        <property name="name:3" value="U" />
      </node>
      <node role="implementedInterface:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674034274">
        <link role="classifier:3" targetNodeId="2.~Iterator" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674034275">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674034273" resolveInfo="U" />
        </node>
      </node>
      <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674034276">
        <property name="name:3" value="listIterator" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674034277">
          <link role="classifier:3" targetNodeId="2.~ListIterator" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674034278">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674034273" resolveInfo="U" />
          </node>
        </node>
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674034279" />
      </node>
      <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="6543581031674034280">
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674034281" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674034282" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674034283">
          <property name="name:3" value="listIterator" />
          <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674034284">
            <link role="classifier:3" targetNodeId="2.~ListIterator" />
            <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674034285">
              <link role="typeVariableDeclaration:3" targetNodeId="6543581031674034273" resolveInfo="U" />
            </node>
          </node>
        </node>
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674034335">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674034336">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674034337">
              <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674034338">
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674034339">
                  <link role="fieldDeclaration:3" targetNodeId="6543581031674034276" resolveInfo="listIterator" />
                </node>
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674034340" />
              </node>
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674034341">
                <link role="variableDeclaration:3" targetNodeId="6543581031674034283" resolveInfo="listIterator" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674034286">
        <property name="name:3" value="hasNext" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674034287" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674034288" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674034342">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674034343">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674034344">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674034345">
                <link role="variableDeclaration:3" targetNodeId="6543581031674034276" resolveInfo="listIterator" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674034346">
                <link role="baseMethodDeclaration:3" targetNodeId="2.~ListIterator.hasPrevious():boolean" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674034289">
        <property name="name:3" value="next" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674034290" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674034291">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674034273" resolveInfo="U" />
        </node>
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674034347">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674034348">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674034349">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674034350">
                <link role="variableDeclaration:3" targetNodeId="6543581031674034276" resolveInfo="listIterator" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674034351">
                <link role="baseMethodDeclaration:3" targetNodeId="2.~ListIterator.previous():java.lang.Object" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674034292">
        <property name="name:3" value="remove" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674034293" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674034294" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674034352">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674034353">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674034354">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674034355">
                <link role="variableDeclaration:3" targetNodeId="6543581031674034276" resolveInfo="listIterator" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674034356">
                <link role="baseMethodDeclaration:3" targetNodeId="2.~ListIterator.remove():void" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="6543581031674034295">
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674034296" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674034297" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674034298">
        <property name="name:3" value="input" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674034299">
          <link role="classifier:3" targetNodeId="2v.~Iterable" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674034300">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674034267" resolveInfo="T" />
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674034301">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.SuperConstructorInvocation:3" id="6543581031674034302">
          <link role="baseMethodDeclaration:3" targetNodeId="6543581031674030224" resolveInfo="AbstractChainedSequence" />
          <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674034303">
            <link role="variableDeclaration:3" targetNodeId="6543581031674034298" resolveInfo="input" />
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674034304">
      <property name="name:3" value="iterator" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674034305" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674034306">
        <link role="classifier:3" targetNodeId="2.~Iterator" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674034307">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674034267" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674034308">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="6543581031674034309">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="6543581031674034310">
            <property name="name:3" value="cache" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674034311">
              <link role="classifier:3" targetNodeId="2.~ArrayList" />
              <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674034312">
                <link role="typeVariableDeclaration:3" targetNodeId="6543581031674034267" resolveInfo="T" />
              </node>
            </node>
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674034313">
              <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674034314">
                <link role="baseMethodDeclaration:3" targetNodeId="2.~ArrayList.&lt;init&gt;()" />
                <node role="typeParameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674034315">
                  <link role="typeVariableDeclaration:3" targetNodeId="6543581031674034267" resolveInfo="T" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="6543581031674034316">
          <node role="iterable:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6543581031674034317">
            <link role="baseMethodDeclaration:3" targetNodeId="6543581031674030245" resolveInfo="getInput" />
          </node>
          <node role="variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="6543581031674034318">
            <property name="name:3" value="u" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674034319">
              <link role="typeVariableDeclaration:3" targetNodeId="6543581031674034267" resolveInfo="T" />
            </node>
          </node>
          <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674034320">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674034321">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674034322">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674034323">
                  <link role="variableDeclaration:3" targetNodeId="6543581031674034310" resolveInfo="cache" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674034324">
                  <link role="baseMethodDeclaration:3" targetNodeId="2.~ArrayList.add(java.lang.Object):boolean" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674034325">
                    <link role="variableDeclaration:3" targetNodeId="6543581031674034318" resolveInfo="u" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674034326">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674034327">
            <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674034328">
              <link role="baseMethodDeclaration:3" targetNodeId="6543581031674034280" resolveInfo="ReversingSequence.ReversingIterator" />
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674034329">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674034330">
                  <link role="variableDeclaration:3" targetNodeId="6543581031674034310" resolveInfo="cache" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674034331">
                  <link role="baseMethodDeclaration:3" targetNodeId="2.~AbstractList.listIterator(int):java.util.ListIterator" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674034332">
                    <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674034333">
                      <link role="variableDeclaration:3" targetNodeId="6543581031674034310" resolveInfo="cache" />
                    </node>
                    <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674034334">
                      <link role="baseMethodDeclaration:3" targetNodeId="2.~ArrayList.size():int" />
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
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="6543581031674034357">
    <property name="name:3" value="EnumeratorIterator" />
    <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674034358" />
    <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674034359">
      <property name="name:3" value="T" />
    </node>
    <node role="implementedInterface:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674034360">
      <link role="classifier:3" targetNodeId="1.6543581031674024974" resolveInfo="IEnumerator.Iterator" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674034361">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674034359" resolveInfo="T" />
      </node>
    </node>
    <node role="staticInnerClassifiers:3" type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="6543581031674034362">
      <property name="name:3" value="Empty" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.ProtectedVisibility:3" id="6543581031674034363" />
      <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674034364">
        <property name="name:3" value="U" />
      </node>
      <node role="implementedInterface:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674034365">
        <link role="classifier:3" targetNodeId="1.6543581031674024974" resolveInfo="IEnumerator.Iterator" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674034366">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674034364" resolveInfo="U" />
        </node>
      </node>
      <node role="staticField:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration:3" id="6543581031674034367">
        <property name="name:3" value="INSTANCE" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674034368">
          <link role="classifier:3" targetNodeId="6543581031674034362" resolveInfo="EnumeratorIterator.Empty" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674034369">
            <link role="classifier:3" targetNodeId="2v.~Object" />
          </node>
        </node>
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674034370" />
        <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674034534">
          <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674034535">
            <link role="baseMethodDeclaration:3" targetNodeId="6543581031674034376" resolveInfo="EnumeratorIterator.Empty" />
            <node role="typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674034536">
              <link role="classifier:3" targetNodeId="2v.~Object" />
            </node>
          </node>
        </node>
      </node>
      <node role="staticMethod:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration:3" id="6543581031674034371">
        <property name="name:3" value="instance" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674034372" />
        <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674034373">
          <property name="name:3" value="V" />
        </node>
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674034374">
          <link role="classifier:3" targetNodeId="6543581031674034362" resolveInfo="EnumeratorIterator.Empty" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674034375">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674034373" resolveInfo="V" />
          </node>
        </node>
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674034537">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674034538">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.CastExpression:3" id="6543581031674034539">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalStaticFieldReference:3" id="6543581031674034540">
                <link role="variableDeclaration:3" targetNodeId="6543581031674034367" resolveInfo="INSTANCE" />
              </node>
              <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674034541">
                <link role="classifier:3" targetNodeId="6543581031674034362" resolveInfo="EnumeratorIterator.Empty" />
                <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674034542">
                  <link role="typeVariableDeclaration:3" targetNodeId="6543581031674034373" resolveInfo="V" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="6543581031674034543">
          <link role="annotation:3" targetNodeId="2v.~SuppressWarnings" />
          <node role="value:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstanceValue:3" id="6543581031674034544">
            <link role="key:3" targetNodeId="2v.~SuppressWarnings.value()" />
            <node role="value:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="6543581031674034545">
              <property name="value:3" value="unchecked" />
            </node>
          </node>
        </node>
      </node>
      <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="6543581031674034376">
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.ProtectedVisibility:3" id="6543581031674034377" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674034378" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674034546" />
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674034379">
        <property name="name:3" value="current" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674034380" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674034381">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674034364" resolveInfo="U" />
        </node>
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674034547">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ThrowStatement:3" id="6543581031674034548">
            <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674034549">
              <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674034550">
                <link role="baseMethodDeclaration:3" targetNodeId="2.~NoSuchElementException.&lt;init&gt;()" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674034382">
        <property name="name:3" value="hasNext" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674034383" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674034384" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674034551">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674034552">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="6543581031674034553" />
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674034385">
        <property name="name:3" value="moveNext" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674034386" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674034387" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674034554">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674034555">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="6543581031674034556" />
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674034388">
        <property name="name:3" value="next" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674034389" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674034390">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674034364" resolveInfo="U" />
        </node>
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674034557">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ThrowStatement:3" id="6543581031674034558">
            <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674034559">
              <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674034560">
                <link role="baseMethodDeclaration:3" targetNodeId="2.~NoSuchElementException.&lt;init&gt;()" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674034391">
        <property name="name:3" value="remove" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674034392" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674034393" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674034561">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ThrowStatement:3" id="6543581031674034562">
            <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674034563">
              <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674034564">
                <link role="baseMethodDeclaration:3" targetNodeId="2v.~UnsupportedOperationException.&lt;init&gt;()" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674034394">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="delegate" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674034395">
        <link role="classifier:3" targetNodeId="2.~Iterator" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674034396">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674034359" resolveInfo="T" />
        </node>
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674034397" />
    </node>
    <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674034398">
      <property name="name:3" value="current" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674034399">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674034359" resolveInfo="T" />
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674034400" />
    </node>
    <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674034401">
      <property name="name:3" value="hasCurrent" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674034402" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674034403" />
      <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="6543581031674034404" />
    </node>
    <node role="staticMethod:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration:3" id="6543581031674034405">
      <property name="name:3" value="fromIterator" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674034406" />
      <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674034407">
        <property name="name:3" value="U" />
      </node>
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674034408">
        <link role="classifier:3" targetNodeId="1.6543581031674024974" resolveInfo="IEnumerator.Iterator" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674034409">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674034407" resolveInfo="U" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674034410">
        <property name="name:3" value="itr" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674034411">
          <link role="classifier:3" targetNodeId="2.~Iterator" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674034412">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674034407" resolveInfo="U" />
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674034413">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674034414">
          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference:3" id="6543581031674034415">
            <link role="classifier:3" targetNodeId="1.6543581031674023524" resolveInfo="Sequence" />
            <link role="variableDeclaration:3" targetNodeId="1.6543581031674023535" resolveInfo="IGNORE_NULL_VALUES" />
          </node>
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674034416">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674034417">
              <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="6543581031674034418">
                <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674034419">
                  <link role="variableDeclaration:3" targetNodeId="6543581031674034410" resolveInfo="itr" />
                </node>
                <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674034420" />
              </node>
              <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674034421">
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674034422">
                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="6543581031674034423">
                    <link role="classConcept:3" targetNodeId="6543581031674034362" resolveInfo="EnumeratorIterator.Empty" />
                    <link role="baseMethodDeclaration:3" targetNodeId="6543581031674034371" resolveInfo="instance" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674034424">
          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.InstanceOfExpression:3" id="6543581031674034425">
            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674034426">
              <link role="variableDeclaration:3" targetNodeId="6543581031674034410" resolveInfo="itr" />
            </node>
            <node role="classType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674034427">
              <link role="classifier:3" targetNodeId="1.6543581031674024974" resolveInfo="IEnumerator.Iterator" />
            </node>
          </node>
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674034428">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674034429">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.CastExpression:3" id="6543581031674034430">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674034431">
                  <link role="variableDeclaration:3" targetNodeId="6543581031674034410" resolveInfo="itr" />
                </node>
                <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674034432">
                  <link role="classifier:3" targetNodeId="1.6543581031674024974" resolveInfo="IEnumerator.Iterator" />
                  <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674034433">
                    <link role="typeVariableDeclaration:3" targetNodeId="6543581031674034407" resolveInfo="U" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674034434">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674034435">
            <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674034436">
              <link role="baseMethodDeclaration:3" targetNodeId="6543581031674034439" resolveInfo="EnumeratorIterator" />
              <node role="typeParameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674034437">
                <link role="typeVariableDeclaration:3" targetNodeId="6543581031674034407" resolveInfo="U" />
              </node>
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674034438">
                <link role="variableDeclaration:3" targetNodeId="6543581031674034410" resolveInfo="itr" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="6543581031674034439">
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674034440" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674034441" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674034442">
        <property name="name:3" value="iterator" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674034443">
          <link role="classifier:3" targetNodeId="2.~Iterator" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674034444">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674034359" resolveInfo="T" />
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674034445">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674034446">
          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="6543581031674034447">
            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674034448">
              <link role="variableDeclaration:3" targetNodeId="6543581031674034442" resolveInfo="iterator" />
            </node>
            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674034449" />
          </node>
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674034450">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ThrowStatement:3" id="6543581031674034451">
              <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674034452">
                <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674034453">
                  <link role="baseMethodDeclaration:3" targetNodeId="2v.~NullPointerException.&lt;init&gt;()" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674034454">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674034455">
            <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674034456">
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674034457">
                <link role="fieldDeclaration:3" targetNodeId="6543581031674034394" resolveInfo="delegate" />
              </node>
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674034458" />
            </node>
            <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674034459">
              <link role="variableDeclaration:3" targetNodeId="6543581031674034442" resolveInfo="iterator" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674034460">
      <property name="name:3" value="hasNext" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674034461" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674034462" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674034463">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674034464">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674034465">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674034466">
              <link role="variableDeclaration:3" targetNodeId="6543581031674034394" resolveInfo="delegate" />
            </node>
            <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674034467">
              <link role="baseMethodDeclaration:3" targetNodeId="2.~Iterator.hasNext():boolean" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674034468">
      <property name="name:3" value="next" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674034469" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674034470">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674034359" resolveInfo="T" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674034471">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674034472">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6543581031674034473">
            <link role="baseMethodDeclaration:3" targetNodeId="6543581031674034509" resolveInfo="primMoveNext" />
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674034474">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6543581031674034475">
            <link role="baseMethodDeclaration:3" targetNodeId="6543581031674034496" resolveInfo="primCurrent" />
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674034476">
      <property name="name:3" value="remove" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674034477" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674034478" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674034479">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674034480">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674034481">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674034482">
              <link role="variableDeclaration:3" targetNodeId="6543581031674034394" resolveInfo="delegate" />
            </node>
            <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674034483">
              <link role="baseMethodDeclaration:3" targetNodeId="2.~Iterator.remove():void" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674034484">
      <property name="name:3" value="current" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674034485" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674034486">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674034359" resolveInfo="T" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674034487">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674034488">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6543581031674034489">
            <link role="baseMethodDeclaration:3" targetNodeId="6543581031674034496" resolveInfo="primCurrent" />
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674034490">
      <property name="name:3" value="moveNext" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674034491" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674034492" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674034493">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674034494">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6543581031674034495">
            <link role="baseMethodDeclaration:3" targetNodeId="6543581031674034509" resolveInfo="primMoveNext" />
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674034496">
      <property name="name:3" value="primCurrent" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674034497" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674034498">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674034359" resolveInfo="T" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674034499">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674034500">
          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.NotExpression:3" id="6543581031674034501">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674034502">
              <link role="variableDeclaration:3" targetNodeId="6543581031674034401" resolveInfo="hasCurrent" />
            </node>
          </node>
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674034503">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ThrowStatement:3" id="6543581031674034504">
              <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674034505">
                <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674034506">
                  <link role="baseMethodDeclaration:3" targetNodeId="2.~NoSuchElementException.&lt;init&gt;()" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674034507">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674034508">
            <link role="variableDeclaration:3" targetNodeId="6543581031674034398" resolveInfo="current" />
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674034509">
      <property name="name:3" value="primMoveNext" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674034510" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674034511" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674034512">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674034513">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674034514">
            <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674034515">
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674034516">
                <link role="fieldDeclaration:3" targetNodeId="6543581031674034401" resolveInfo="hasCurrent" />
              </node>
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674034517" />
            </node>
            <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674034518">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674034519">
                <link role="variableDeclaration:3" targetNodeId="6543581031674034394" resolveInfo="delegate" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674034520">
                <link role="baseMethodDeclaration:3" targetNodeId="2.~Iterator.hasNext():boolean" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674034521">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674034522">
            <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674034523">
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674034524">
                <link role="fieldDeclaration:3" targetNodeId="6543581031674034398" resolveInfo="current" />
              </node>
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674034525" />
            </node>
            <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.TernaryOperatorExpression:3" id="6543581031674034526">
              <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674034527">
                <link role="variableDeclaration:3" targetNodeId="6543581031674034401" resolveInfo="hasCurrent" />
              </node>
              <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674034528">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674034529">
                  <link role="variableDeclaration:3" targetNodeId="6543581031674034394" resolveInfo="delegate" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674034530">
                  <link role="baseMethodDeclaration:3" targetNodeId="2.~Iterator.next():java.lang.Object" />
                </node>
              </node>
              <node role="ifFalse:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674034531" />
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674034532">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674034533">
            <link role="variableDeclaration:3" targetNodeId="6543581031674034401" resolveInfo="hasCurrent" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.EnumClass:3" id="6543581031674034581">
    <property name="name:3" value="HasNextState" />
    <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674034582" />
    <node role="enumConstant:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantDeclaration:3" id="6543581031674034583">
      <property name="name:3" value="UNKNOWN" />
      <link role="baseMethodDeclaration:3" targetNodeId="6543581031674034593" resolveInfo="HasNextState" />
      <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.UnaryMinus:3" id="6543581031674034584">
        <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="6543581031674034585">
          <property name="value:3" value="1" />
        </node>
      </node>
    </node>
    <node role="enumConstant:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantDeclaration:3" id="6543581031674034586">
      <property name="name:3" value="HAS_NEXT" />
      <link role="baseMethodDeclaration:3" targetNodeId="6543581031674034593" resolveInfo="HasNextState" />
      <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="6543581031674034587">
        <property name="value:3" value="1" />
      </node>
    </node>
    <node role="enumConstant:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantDeclaration:3" id="6543581031674034588">
      <property name="name:3" value="AT_END" />
      <link role="baseMethodDeclaration:3" targetNodeId="6543581031674034593" resolveInfo="HasNextState" />
      <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="6543581031674034589">
        <property name="value:3" value="0" />
      </node>
    </node>
    <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674034590">
      <property name="name:3" value="value" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="6543581031674034591" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674034592" />
    </node>
    <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="6543581031674034593">
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674034594" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674034595" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674034596">
        <property name="name:3" value="value" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="6543581031674034597" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674034598">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674034599">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674034600">
            <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674034601">
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674034602">
                <link role="fieldDeclaration:3" targetNodeId="6543581031674034590" resolveInfo="value" />
              </node>
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674034603" />
            </node>
            <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674034604">
              <link role="variableDeclaration:3" targetNodeId="6543581031674034596" resolveInfo="value" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674034605">
      <property name="name:3" value="unknown" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674034606" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674034607" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674034608">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674034609">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LessThanExpression:3" id="6543581031674034610">
            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674034611">
              <link role="variableDeclaration:3" targetNodeId="6543581031674034590" resolveInfo="value" />
            </node>
            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="6543581031674034612">
              <property name="value:3" value="0" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674034613">
      <property name="name:3" value="hasNext" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674034614" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674034615" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674034616">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674034617">
          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.LessThanExpression:3" id="6543581031674034618">
            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674034619">
              <link role="variableDeclaration:3" targetNodeId="6543581031674034590" resolveInfo="value" />
            </node>
            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="6543581031674034620">
              <property name="value:3" value="0" />
            </node>
          </node>
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674034621">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ThrowStatement:3" id="6543581031674034622">
              <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674034623">
                <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674034624">
                  <link role="baseMethodDeclaration:3" targetNodeId="2v.~IllegalStateException.&lt;init&gt;()" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674034625">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.GreaterThanExpression:3" id="6543581031674034626">
            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674034627">
              <link role="variableDeclaration:3" targetNodeId="6543581031674034590" resolveInfo="value" />
            </node>
            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="6543581031674034628">
              <property name="value:3" value="0" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="6543581031674035918">
    <property name="name:3" value="NullSortedSetSequence" />
    <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674035919" />
    <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674035920">
      <property name="name:3" value="T" />
    </node>
    <node role="superclass:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674035921">
      <link role="classifier:3" targetNodeId="6543581031674022292" resolveInfo="NullSetSequence" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674035922">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674035920" resolveInfo="T" />
      </node>
    </node>
    <node role="implementedInterface:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674035923">
      <link role="classifier:3" targetNodeId="1.6543581031674036880" resolveInfo="ISortedSetSequence" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674035924">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674035920" resolveInfo="T" />
      </node>
    </node>
    <node role="implementedInterface:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674035925">
      <link role="classifier:3" targetNodeId="2.~SortedSet" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674035926">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674035920" resolveInfo="T" />
      </node>
    </node>
    <node role="staticField:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration:3" id="6543581031674035927">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="INSTANCE" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674035928">
        <link role="classifier:3" targetNodeId="6543581031674035918" resolveInfo="NullSortedSetSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674035929">
          <link role="classifier:3" targetNodeId="2v.~Object" />
        </node>
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674035930" />
      <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674035931">
        <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674035932">
          <link role="baseMethodDeclaration:3" targetNodeId="6543581031674035948" resolveInfo="NullSortedSetSequence" />
          <node role="typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674035933">
            <link role="classifier:3" targetNodeId="2v.~Object" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration:3" id="6543581031674035934">
      <property name="name:3" value="instance" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674035935" />
      <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674035936">
        <property name="name:3" value="U" />
      </node>
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674035937">
        <link role="classifier:3" targetNodeId="6543581031674035918" resolveInfo="NullSortedSetSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674035938">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674035936" resolveInfo="U" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674035939">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674035940">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.CastExpression:3" id="6543581031674035941">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalStaticFieldReference:3" id="6543581031674035942">
              <link role="variableDeclaration:3" targetNodeId="6543581031674035927" resolveInfo="INSTANCE" />
            </node>
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674035943">
              <link role="classifier:3" targetNodeId="6543581031674035918" resolveInfo="NullSortedSetSequence" />
              <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674035944">
                <link role="typeVariableDeclaration:3" targetNodeId="6543581031674035936" resolveInfo="U" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="6543581031674035945">
        <link role="annotation:3" targetNodeId="2v.~SuppressWarnings" />
        <node role="value:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstanceValue:3" id="6543581031674035946">
          <link role="key:3" targetNodeId="2v.~SuppressWarnings.value()" />
          <node role="value:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="6543581031674035947">
            <property name="value:3" value="unchecked" />
          </node>
        </node>
      </node>
    </node>
    <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="6543581031674035948">
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.ProtectedVisibility:3" id="6543581031674035949" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674035950" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674035951" />
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674035952">
      <property name="name:3" value="headSet" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674035953" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674035954">
        <link role="classifier:3" targetNodeId="1.6543581031674036880" resolveInfo="ISortedSetSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674035955">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674035920" resolveInfo="T" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674035956">
        <property name="name:3" value="toElement" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674035957">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674035920" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674035958">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674035959">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674035960" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674035961">
      <property name="name:3" value="subSet" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674035962" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674035963">
        <link role="classifier:3" targetNodeId="1.6543581031674036880" resolveInfo="ISortedSetSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674035964">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674035920" resolveInfo="T" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674035965">
        <property name="name:3" value="fromElement" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674035966">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674035920" resolveInfo="T" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674035967">
        <property name="name:3" value="toElement" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674035968">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674035920" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674035969">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674035970">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674035971" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674035972">
      <property name="name:3" value="tailSet" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674035973" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674035974">
        <link role="classifier:3" targetNodeId="1.6543581031674036880" resolveInfo="ISortedSetSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674035975">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674035920" resolveInfo="T" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674035976">
        <property name="name:3" value="fromElement" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674035977">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674035920" resolveInfo="T" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674035978">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674035979">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674035980" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674035981">
      <property name="name:3" value="addSequence" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674035982" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674035983">
        <link role="classifier:3" targetNodeId="1.6543581031674036880" resolveInfo="ISortedSetSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674035984">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674035920" resolveInfo="T" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674035985">
        <property name="name:3" value="seq" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674035986">
          <link role="classifier:3" targetNodeId="1.6543581031674024311" resolveInfo="ISequence" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.UpperBoundType:3" id="6543581031674035987">
            <node role="bound:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674035988">
              <link role="typeVariableDeclaration:3" targetNodeId="6543581031674035920" resolveInfo="T" />
            </node>
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674035989">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674035990">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674035991" />
        </node>
      </node>
      <node role="annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="6543581031674035992">
        <link role="annotation:3" targetNodeId="2v.~Override" />
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674035993">
      <property name="name:3" value="removeSequence" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674035994" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674035995">
        <link role="classifier:3" targetNodeId="1.6543581031674036880" resolveInfo="ISortedSetSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674035996">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674035920" resolveInfo="T" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674035997">
        <property name="name:3" value="seq" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674035998">
          <link role="classifier:3" targetNodeId="1.6543581031674024311" resolveInfo="ISequence" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.UpperBoundType:3" id="6543581031674035999">
            <node role="bound:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036000">
              <link role="typeVariableDeclaration:3" targetNodeId="6543581031674035920" resolveInfo="T" />
            </node>
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036001">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674036002">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674036003" />
        </node>
      </node>
      <node role="annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="6543581031674036004">
        <link role="annotation:3" targetNodeId="2v.~Override" />
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674036005">
      <property name="name:3" value="comparator" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674036006" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036007">
        <link role="classifier:3" targetNodeId="2.~Comparator" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.LowerBoundType:3" id="6543581031674036008">
          <node role="bound:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036009">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674035920" resolveInfo="T" />
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036010">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674036011">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674036012" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="6543581031674036136">
    <property name="name:3" value="NullSortedMapSequence" />
    <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674036137" />
    <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674036138">
      <property name="name:3" value="U" />
    </node>
    <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674036139">
      <property name="name:3" value="V" />
    </node>
    <node role="superclass:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036140">
      <link role="classifier:3" targetNodeId="6543581031674036695" resolveInfo="NullMapSequence" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036141">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036138" resolveInfo="U" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036142">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036139" resolveInfo="V" />
      </node>
    </node>
    <node role="implementedInterface:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036143">
      <link role="classifier:3" targetNodeId="1.6543581031674025209" resolveInfo="ISortedMapSequence" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036144">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036138" resolveInfo="U" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036145">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036139" resolveInfo="V" />
      </node>
    </node>
    <node role="implementedInterface:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036146">
      <link role="classifier:3" targetNodeId="2.~SortedMap" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036147">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036138" resolveInfo="U" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036148">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036139" resolveInfo="V" />
      </node>
    </node>
    <node role="staticField:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration:3" id="6543581031674036149">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="INSTANCE" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036150">
        <link role="classifier:3" targetNodeId="6543581031674036136" resolveInfo="NullSortedMapSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036151">
          <link role="classifier:3" targetNodeId="2v.~Object" />
        </node>
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036152">
          <link role="classifier:3" targetNodeId="2v.~Object" />
        </node>
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674036153" />
      <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674036154">
        <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674036155">
          <link role="baseMethodDeclaration:3" targetNodeId="6543581031674036175" resolveInfo="NullSortedMapSequence" />
          <node role="typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036156">
            <link role="classifier:3" targetNodeId="2v.~Object" />
          </node>
          <node role="typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036157">
            <link role="classifier:3" targetNodeId="2v.~Object" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration:3" id="6543581031674036158">
      <property name="name:3" value="instance" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674036159" />
      <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674036160">
        <property name="name:3" value="P" />
      </node>
      <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674036161">
        <property name="name:3" value="Q" />
      </node>
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036162">
        <link role="classifier:3" targetNodeId="6543581031674036136" resolveInfo="NullSortedMapSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036163">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036160" resolveInfo="P" />
        </node>
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036164">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036161" resolveInfo="Q" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036165">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674036166">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.CastExpression:3" id="6543581031674036167">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalStaticFieldReference:3" id="6543581031674036168">
              <link role="variableDeclaration:3" targetNodeId="6543581031674036149" resolveInfo="INSTANCE" />
            </node>
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036169">
              <link role="classifier:3" targetNodeId="6543581031674036136" resolveInfo="NullSortedMapSequence" />
              <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036170">
                <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036160" resolveInfo="P" />
              </node>
              <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036171">
                <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036161" resolveInfo="Q" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="6543581031674036172">
        <link role="annotation:3" targetNodeId="2v.~SuppressWarnings" />
        <node role="value:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstanceValue:3" id="6543581031674036173">
          <link role="key:3" targetNodeId="2v.~SuppressWarnings.value()" />
          <node role="value:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="6543581031674036174">
            <property name="value:3" value="unchecked" />
          </node>
        </node>
      </node>
    </node>
    <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="6543581031674036175">
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.ProtectedVisibility:3" id="6543581031674036176" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674036177" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036178" />
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674036179">
      <property name="name:3" value="comparator" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674036180" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036181">
        <link role="classifier:3" targetNodeId="2.~Comparator" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.LowerBoundType:3" id="6543581031674036182">
          <node role="bound:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036183">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036138" resolveInfo="U" />
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036184">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674036185">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674036186" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674036187">
      <property name="name:3" value="firstKey" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674036188" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036189">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036138" resolveInfo="U" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036190">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674036191">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674036192" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674036193">
      <property name="name:3" value="headMap" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674036194" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036195">
        <link role="classifier:3" targetNodeId="1.6543581031674025209" resolveInfo="ISortedMapSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036196">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036138" resolveInfo="U" />
        </node>
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036197">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036139" resolveInfo="V" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674036198">
        <property name="name:3" value="toKey" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036199">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036138" resolveInfo="U" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036200">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674036201">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674036202" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674036203">
      <property name="name:3" value="lastKey" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674036204" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036205">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036138" resolveInfo="U" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036206">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674036207">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674036208" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674036209">
      <property name="name:3" value="subMap" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674036210" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036211">
        <link role="classifier:3" targetNodeId="1.6543581031674025209" resolveInfo="ISortedMapSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036212">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036138" resolveInfo="U" />
        </node>
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036213">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036139" resolveInfo="V" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674036214">
        <property name="name:3" value="fromKey" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036215">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036138" resolveInfo="U" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674036216">
        <property name="name:3" value="toKey" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036217">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036138" resolveInfo="U" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036218">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674036219">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674036220" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674036221">
      <property name="name:3" value="tailMap" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674036222" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036223">
        <link role="classifier:3" targetNodeId="1.6543581031674025209" resolveInfo="ISortedMapSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036224">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036138" resolveInfo="U" />
        </node>
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036225">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036139" resolveInfo="V" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674036226">
        <property name="name:3" value="fromKey" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036227">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036138" resolveInfo="U" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036228">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674036229">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674036230" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="6543581031674036231">
    <property name="name:3" value="PagingSequence" />
    <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674036232" />
    <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674036233">
      <property name="name:3" value="U" />
    </node>
    <node role="superclass:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036234">
      <link role="classifier:3" targetNodeId="1.6543581031674023524" resolveInfo="Sequence" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036235">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036233" resolveInfo="U" />
      </node>
    </node>
    <node role="implementedInterface:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036236">
      <link role="classifier:3" targetNodeId="2v.~Iterable" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036237">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036233" resolveInfo="U" />
      </node>
    </node>
    <node role="staticInnerClassifiers:3" type="jetbrains.mps.baseLanguage.structure.EnumClass:3" id="6543581031674036238">
      <property name="name:3" value="Page" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674036239" />
      <node role="enumConstant:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantDeclaration:3" id="6543581031674036240">
        <property name="name:3" value="TAKE" />
        <link role="baseMethodDeclaration:3" targetNodeId="6543581031674036244" resolveInfo="Page" />
      </node>
      <node role="enumConstant:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantDeclaration:3" id="6543581031674036241">
        <property name="name:3" value="SKIP" />
        <link role="baseMethodDeclaration:3" targetNodeId="6543581031674036244" resolveInfo="Page" />
      </node>
      <node role="enumConstant:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantDeclaration:3" id="6543581031674036242">
        <property name="name:3" value="TAIL" />
        <link role="baseMethodDeclaration:3" targetNodeId="6543581031674036244" resolveInfo="Page" />
      </node>
      <node role="enumConstant:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantDeclaration:3" id="6543581031674036243">
        <property name="name:3" value="CUT" />
        <link role="baseMethodDeclaration:3" targetNodeId="6543581031674036244" resolveInfo="Page" />
      </node>
      <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="6543581031674036244">
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674036245" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674036246" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036362" />
      </node>
    </node>
    <node role="staticInnerClassifiers:3" type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="6543581031674036247">
      <property name="name:3" value="PagingIterator" />
      <property name="nonStatic:3" value="true" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674036248" />
      <node role="implementedInterface:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036249">
        <link role="classifier:3" targetNodeId="2.~Iterator" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036250">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036233" resolveInfo="U" />
        </node>
      </node>
      <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674036251">
        <property name="name:3" value="inputIt" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036252">
          <link role="classifier:3" targetNodeId="2.~Iterator" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036253">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036233" resolveInfo="U" />
          </node>
        </node>
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674036254" />
      </node>
      <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674036255">
        <property name="name:3" value="hasNext" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036256">
          <link role="classifier:3" targetNodeId="6543581031674034581" resolveInfo="HasNextState" />
        </node>
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674036257" />
        <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="6543581031674036363">
          <link role="enumClass:3" targetNodeId="6543581031674034581" resolveInfo="HasNextState" />
          <link role="enumConstantDeclaration:3" targetNodeId="6543581031674034583" resolveInfo="UNKNOWN" />
        </node>
      </node>
      <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674036258">
        <property name="name:3" value="next" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036259">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036233" resolveInfo="U" />
        </node>
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674036260" />
      </node>
      <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674036261">
        <property name="name:3" value="countDown" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="6543581031674036262" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674036263" />
      </node>
      <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674036264">
        <property name="name:3" value="cache" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036265">
          <link role="classifier:3" targetNodeId="2.~ArrayList" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036266">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036233" resolveInfo="U" />
          </node>
        </node>
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674036267" />
      </node>
      <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="6543581031674036268">
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674036269" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674036270" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036364" />
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674036271">
        <property name="name:3" value="hasNext" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674036272" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674036273" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036365">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6401275180973182960">
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6401275180973182961">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674036371">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6543581031674036372">
                  <link role="baseMethodDeclaration:3" targetNodeId="6543581031674036280" resolveInfo="init" />
                </node>
              </node>
            </node>
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="6401275180973182965">
              <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6401275180973182968" />
              <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6401275180973182964">
                <link role="variableDeclaration:3" targetNodeId="6543581031674036251" resolveInfo="inputIt" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674036366">
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674036367">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674036368">
                <link role="variableDeclaration:3" targetNodeId="6543581031674036255" resolveInfo="hasNext" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674036369">
                <link role="baseMethodDeclaration:3" targetNodeId="6543581031674034605" resolveInfo="unknown" />
              </node>
            </node>
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036370">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674036373">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6543581031674036374">
                  <link role="baseMethodDeclaration:3" targetNodeId="6543581031674036286" resolveInfo="moveToNext" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674036375">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674036376">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674036377">
                <link role="variableDeclaration:3" targetNodeId="6543581031674036255" resolveInfo="hasNext" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674036378">
                <link role="baseMethodDeclaration:3" targetNodeId="6543581031674034613" resolveInfo="hasNext" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674036274">
        <property name="name:3" value="next" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674036275" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036276">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036233" resolveInfo="U" />
        </node>
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036379">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6401275180973182969">
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6401275180973182970">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6401275180973182971">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6401275180973182972">
                  <link role="baseMethodDeclaration:3" targetNodeId="6543581031674036280" resolveInfo="init" />
                </node>
              </node>
            </node>
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="6401275180973182973">
              <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6401275180973182974" />
              <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6401275180973182975">
                <link role="variableDeclaration:3" targetNodeId="6543581031674036251" resolveInfo="inputIt" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674036380">
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674036381">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674036382">
                <link role="variableDeclaration:3" targetNodeId="6543581031674036255" resolveInfo="hasNext" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674036383">
                <link role="baseMethodDeclaration:3" targetNodeId="6543581031674034605" resolveInfo="unknown" />
              </node>
            </node>
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036384">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674036387">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6543581031674036388">
                  <link role="baseMethodDeclaration:3" targetNodeId="6543581031674036286" resolveInfo="moveToNext" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674036389">
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.NotExpression:3" id="6543581031674036390">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression:3" id="6543581031674036391">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674036392">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674036393">
                    <link role="variableDeclaration:3" targetNodeId="6543581031674036255" resolveInfo="hasNext" />
                  </node>
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674036394">
                    <link role="baseMethodDeclaration:3" targetNodeId="6543581031674034613" resolveInfo="hasNext" />
                  </node>
                </node>
              </node>
            </node>
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036395">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ThrowStatement:3" id="6543581031674036396">
                <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674036397">
                  <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674036398">
                    <link role="baseMethodDeclaration:3" targetNodeId="2.~NoSuchElementException.&lt;init&gt;()" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6401275180973183023">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6401275180973183024">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6401275180973183025" />
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6401275180973183026">
                <link role="baseMethodDeclaration:3" targetNodeId="6401275180973183002" resolveInfo="clearNext" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674036277">
        <property name="name:3" value="remove" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674036278" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674036279" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036407">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ThrowStatement:3" id="6543581031674036408">
            <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674036409">
              <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674036410">
                <link role="baseMethodDeclaration:3" targetNodeId="2v.~UnsupportedOperationException.&lt;init&gt;()" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674036280">
        <property name="name:3" value="init" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674036281" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674036282" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036411">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.SwitchStatement:3" id="6543581031674036412">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674036413">
              <link role="variableDeclaration:3" targetNodeId="6543581031674036302" resolveInfo="page" />
            </node>
            <node role="defaultBlock:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036414">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.BreakStatement:3" id="6543581031674036415" />
            </node>
            <node role="case:3" type="jetbrains.mps.baseLanguage.structure.SwitchCase:3" id="6543581031674036416">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="6543581031674036417">
                <link role="enumClass:3" targetNodeId="6543581031674036238" resolveInfo="PagingSequence.Page" />
                <link role="enumConstantDeclaration:3" targetNodeId="6543581031674036240" resolveInfo="TAKE" />
              </node>
              <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036418" />
            </node>
            <node role="case:3" type="jetbrains.mps.baseLanguage.structure.SwitchCase:3" id="6543581031674036419">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="6543581031674036420">
                <link role="enumClass:3" targetNodeId="6543581031674036238" resolveInfo="PagingSequence.Page" />
                <link role="enumConstantDeclaration:3" targetNodeId="6543581031674036241" resolveInfo="SKIP" />
              </node>
              <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036421">
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674036422">
                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674036423">
                    <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674036424">
                      <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674036425">
                        <link role="fieldDeclaration:3" targetNodeId="6543581031674036251" resolveInfo="inputIt" />
                      </node>
                      <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674036426" />
                    </node>
                    <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674036427">
                      <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674036428">
                        <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674036429">
                          <link role="variableDeclaration:3" targetNodeId="6543581031674036298" resolveInfo="input" />
                        </node>
                        <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674036430">
                          <link role="baseMethodDeclaration:3" targetNodeId="1.6543581031674024210" resolveInfo="toIterable" />
                        </node>
                      </node>
                      <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674036431">
                        <link role="baseMethodDeclaration:3" targetNodeId="2v.~Iterable.iterator():java.util.Iterator" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674036432">
                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674036433">
                    <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674036434">
                      <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674036435">
                        <link role="fieldDeclaration:3" targetNodeId="6543581031674036261" resolveInfo="countDown" />
                      </node>
                      <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674036436" />
                    </node>
                    <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674036437">
                      <link role="variableDeclaration:3" targetNodeId="6543581031674036305" resolveInfo="length" />
                    </node>
                  </node>
                </node>
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.BreakStatement:3" id="6543581031674036438" />
              </node>
            </node>
            <node role="case:3" type="jetbrains.mps.baseLanguage.structure.SwitchCase:3" id="6543581031674036439">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="6543581031674036440">
                <link role="enumClass:3" targetNodeId="6543581031674036238" resolveInfo="PagingSequence.Page" />
                <link role="enumConstantDeclaration:3" targetNodeId="6543581031674036242" resolveInfo="TAIL" />
              </node>
              <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036441" />
            </node>
            <node role="case:3" type="jetbrains.mps.baseLanguage.structure.SwitchCase:3" id="6543581031674036442">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="6543581031674036443">
                <link role="enumClass:3" targetNodeId="6543581031674036238" resolveInfo="PagingSequence.Page" />
                <link role="enumConstantDeclaration:3" targetNodeId="6543581031674036243" resolveInfo="CUT" />
              </node>
              <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036444">
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674036445">
                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674036446">
                    <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674036447">
                      <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674036448">
                        <link role="fieldDeclaration:3" targetNodeId="6543581031674036264" resolveInfo="cache" />
                      </node>
                      <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674036449" />
                    </node>
                    <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674036450">
                      <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674036451">
                        <link role="baseMethodDeclaration:3" targetNodeId="2.~ArrayList.&lt;init&gt;()" />
                        <node role="typeParameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036452">
                          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036233" resolveInfo="U" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="6543581031674036453">
                  <node role="iterable:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674036454">
                    <link role="variableDeclaration:3" targetNodeId="6543581031674036298" resolveInfo="input" />
                  </node>
                  <node role="variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="6543581031674036455">
                    <property name="name:3" value="o" />
                    <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036456">
                      <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036233" resolveInfo="U" />
                    </node>
                  </node>
                  <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036457">
                    <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674036458">
                      <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674036459">
                        <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674036460">
                          <link role="variableDeclaration:3" targetNodeId="6543581031674036264" resolveInfo="cache" />
                        </node>
                        <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674036461">
                          <link role="baseMethodDeclaration:3" targetNodeId="2.~ArrayList.add(java.lang.Object):boolean" />
                          <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6543581031674036462">
                            <link role="variableDeclaration:3" targetNodeId="6543581031674036455" resolveInfo="o" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674036463">
                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674036464">
                    <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674036465">
                      <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674036466">
                        <link role="fieldDeclaration:3" targetNodeId="6543581031674036251" resolveInfo="inputIt" />
                      </node>
                      <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674036467" />
                    </node>
                    <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674036468">
                      <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674036469">
                        <link role="variableDeclaration:3" targetNodeId="6543581031674036264" resolveInfo="cache" />
                      </node>
                      <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674036470">
                        <link role="baseMethodDeclaration:3" targetNodeId="2.~AbstractList.iterator():java.util.Iterator" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674036471">
                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674036472">
                    <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674036473">
                      <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674036474">
                        <link role="fieldDeclaration:3" targetNodeId="6543581031674036261" resolveInfo="countDown" />
                      </node>
                      <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674036475" />
                    </node>
                    <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="6543581031674036476">
                      <link role="classConcept:3" targetNodeId="2v.~Math" />
                      <link role="baseMethodDeclaration:3" targetNodeId="2v.~Math.max(int,int):int" />
                      <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="6543581031674036477">
                        <property name="value:3" value="0" />
                      </node>
                      <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.MinusExpression:3" id="6543581031674036478">
                        <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674036479">
                          <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674036480">
                            <link role="variableDeclaration:3" targetNodeId="6543581031674036264" resolveInfo="cache" />
                          </node>
                          <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674036481">
                            <link role="baseMethodDeclaration:3" targetNodeId="2.~ArrayList.size():int" />
                          </node>
                        </node>
                        <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674036482">
                          <link role="variableDeclaration:3" targetNodeId="6543581031674036305" resolveInfo="length" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.BreakStatement:3" id="6543581031674036483" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674036283">
        <property name="name:3" value="destroy" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674036284" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674036285" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036484">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.SwitchStatement:3" id="6543581031674036485">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674036486">
              <link role="variableDeclaration:3" targetNodeId="6543581031674036302" resolveInfo="page" />
            </node>
            <node role="defaultBlock:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036487">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.BreakStatement:3" id="6543581031674036488" />
            </node>
            <node role="case:3" type="jetbrains.mps.baseLanguage.structure.SwitchCase:3" id="6543581031674036489">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="6543581031674036490">
                <link role="enumClass:3" targetNodeId="6543581031674036238" resolveInfo="PagingSequence.Page" />
                <link role="enumConstantDeclaration:3" targetNodeId="6543581031674036240" resolveInfo="TAKE" />
              </node>
              <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036491" />
            </node>
            <node role="case:3" type="jetbrains.mps.baseLanguage.structure.SwitchCase:3" id="6543581031674036492">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="6543581031674036493">
                <link role="enumClass:3" targetNodeId="6543581031674036238" resolveInfo="PagingSequence.Page" />
                <link role="enumConstantDeclaration:3" targetNodeId="6543581031674036241" resolveInfo="SKIP" />
              </node>
              <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036494">
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.BreakStatement:3" id="6543581031674036495" />
              </node>
            </node>
            <node role="case:3" type="jetbrains.mps.baseLanguage.structure.SwitchCase:3" id="6543581031674036496">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="6543581031674036497">
                <link role="enumClass:3" targetNodeId="6543581031674036238" resolveInfo="PagingSequence.Page" />
                <link role="enumConstantDeclaration:3" targetNodeId="6543581031674036242" resolveInfo="TAIL" />
              </node>
              <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036498" />
            </node>
            <node role="case:3" type="jetbrains.mps.baseLanguage.structure.SwitchCase:3" id="6543581031674036499">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="6543581031674036500">
                <link role="enumClass:3" targetNodeId="6543581031674036238" resolveInfo="PagingSequence.Page" />
                <link role="enumConstantDeclaration:3" targetNodeId="6543581031674036243" resolveInfo="CUT" />
              </node>
              <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036501">
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674036502">
                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674036503">
                    <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674036504">
                      <link role="variableDeclaration:3" targetNodeId="6543581031674036264" resolveInfo="cache" />
                    </node>
                    <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674036505">
                      <link role="baseMethodDeclaration:3" targetNodeId="2.~ArrayList.clear():void" />
                    </node>
                  </node>
                </node>
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.BreakStatement:3" id="6543581031674036506" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674036286">
        <property name="name:3" value="moveToNext" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674036287" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674036288" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036507">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674036508">
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.GreaterThanExpression:3" id="6543581031674036509">
              <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674036510">
                <link role="variableDeclaration:3" targetNodeId="6543581031674036261" resolveInfo="countDown" />
              </node>
              <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="6543581031674036511">
                <property name="value:3" value="0" />
              </node>
            </node>
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036512">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.DoWhileStatement:3" id="6543581031674036513">
                <property name="label:3" value="skipping" />
                <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.GreaterThanExpression:3" id="6543581031674036514">
                  <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674036515">
                    <link role="variableDeclaration:3" targetNodeId="6543581031674036261" resolveInfo="countDown" />
                  </node>
                  <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="6543581031674036516">
                    <property name="value:3" value="0" />
                  </node>
                </node>
                <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036517">
                  <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674036518">
                    <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.PrefixDecrementExpression:3" id="6543581031674036519">
                      <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674036520">
                        <link role="variableDeclaration:3" targetNodeId="6543581031674036261" resolveInfo="countDown" />
                      </node>
                    </node>
                  </node>
                  <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.SwitchStatement:3" id="6543581031674036521">
                    <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674036522">
                      <link role="variableDeclaration:3" targetNodeId="6543581031674036302" resolveInfo="page" />
                    </node>
                    <node role="defaultBlock:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036523">
                      <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.BreakStatement:3" id="6543581031674036524" />
                    </node>
                    <node role="case:3" type="jetbrains.mps.baseLanguage.structure.SwitchCase:3" id="6543581031674036525">
                      <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="6543581031674036526">
                        <link role="enumClass:3" targetNodeId="6543581031674036238" resolveInfo="PagingSequence.Page" />
                        <link role="enumConstantDeclaration:3" targetNodeId="6543581031674036240" resolveInfo="TAKE" />
                      </node>
                      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036527" />
                    </node>
                    <node role="case:3" type="jetbrains.mps.baseLanguage.structure.SwitchCase:3" id="6543581031674036528">
                      <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="6543581031674036529">
                        <link role="enumClass:3" targetNodeId="6543581031674036238" resolveInfo="PagingSequence.Page" />
                        <link role="enumConstantDeclaration:3" targetNodeId="6543581031674036243" resolveInfo="CUT" />
                      </node>
                      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036530">
                        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674036531">
                          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6543581031674036532">
                            <link role="baseMethodDeclaration:3" targetNodeId="6543581031674036295" resolveInfo="takeNext" />
                          </node>
                        </node>
                        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674036533" />
                      </node>
                    </node>
                    <node role="case:3" type="jetbrains.mps.baseLanguage.structure.SwitchCase:3" id="6543581031674036534">
                      <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="6543581031674036535">
                        <link role="enumClass:3" targetNodeId="6543581031674036238" resolveInfo="PagingSequence.Page" />
                        <link role="enumConstantDeclaration:3" targetNodeId="6543581031674036241" resolveInfo="SKIP" />
                      </node>
                      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036536" />
                    </node>
                    <node role="case:3" type="jetbrains.mps.baseLanguage.structure.SwitchCase:3" id="6543581031674036537">
                      <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="6543581031674036538">
                        <link role="enumClass:3" targetNodeId="6543581031674036238" resolveInfo="PagingSequence.Page" />
                        <link role="enumConstantDeclaration:3" targetNodeId="6543581031674036242" resolveInfo="TAIL" />
                      </node>
                      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036539">
                        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674036540">
                          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.NotExpression:3" id="6543581031674036541">
                            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6543581031674036542">
                              <link role="baseMethodDeclaration:3" targetNodeId="6543581031674036289" resolveInfo="skipNext" />
                            </node>
                          </node>
                          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036543">
                            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674036544" />
                          </node>
                        </node>
                        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.BreakStatement:3" id="6543581031674036545" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.SwitchStatement:3" id="6543581031674036546">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674036547">
              <link role="variableDeclaration:3" targetNodeId="6543581031674036302" resolveInfo="page" />
            </node>
            <node role="defaultBlock:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036548">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.BreakStatement:3" id="6543581031674036549" />
            </node>
            <node role="case:3" type="jetbrains.mps.baseLanguage.structure.SwitchCase:3" id="6543581031674036550">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="6543581031674036551">
                <link role="enumClass:3" targetNodeId="6543581031674036238" resolveInfo="PagingSequence.Page" />
                <link role="enumConstantDeclaration:3" targetNodeId="6543581031674036240" resolveInfo="TAKE" />
              </node>
              <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036552" />
            </node>
            <node role="case:3" type="jetbrains.mps.baseLanguage.structure.SwitchCase:3" id="6543581031674036553">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="6543581031674036554">
                <link role="enumClass:3" targetNodeId="6543581031674036238" resolveInfo="PagingSequence.Page" />
                <link role="enumConstantDeclaration:3" targetNodeId="6543581031674036243" resolveInfo="CUT" />
              </node>
              <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036555">
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674036556">
                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6543581031674036557">
                    <link role="baseMethodDeclaration:3" targetNodeId="6543581031674036292" resolveInfo="stop" />
                  </node>
                </node>
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.BreakStatement:3" id="6543581031674036558" />
              </node>
            </node>
            <node role="case:3" type="jetbrains.mps.baseLanguage.structure.SwitchCase:3" id="6543581031674036559">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="6543581031674036560">
                <link role="enumClass:3" targetNodeId="6543581031674036238" resolveInfo="PagingSequence.Page" />
                <link role="enumConstantDeclaration:3" targetNodeId="6543581031674036241" resolveInfo="SKIP" />
              </node>
              <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036561" />
            </node>
            <node role="case:3" type="jetbrains.mps.baseLanguage.structure.SwitchCase:3" id="6543581031674036562">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="6543581031674036563">
                <link role="enumClass:3" targetNodeId="6543581031674036238" resolveInfo="PagingSequence.Page" />
                <link role="enumConstantDeclaration:3" targetNodeId="6543581031674036242" resolveInfo="TAIL" />
              </node>
              <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036564">
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674036565">
                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6543581031674036566">
                    <link role="baseMethodDeclaration:3" targetNodeId="6543581031674036295" resolveInfo="takeNext" />
                  </node>
                </node>
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.BreakStatement:3" id="6543581031674036567" />
              </node>
            </node>
          </node>
        </node>
        <node role="annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="6543581031674036568">
          <link role="annotation:3" targetNodeId="2v.~SuppressWarnings" />
          <node role="value:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstanceValue:3" id="6543581031674036569">
            <link role="key:3" targetNodeId="2v.~SuppressWarnings.value()" />
            <node role="value:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="6543581031674036570">
              <property name="value:3" value="unused" />
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6401275180973183002">
        <property name="name:3" value="clearNext" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6401275180973183003" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6401275180973183004">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036233" resolveInfo="U" />
        </node>
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6401275180973183005">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="6401275180973183006">
            <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="6401275180973183001">
              <property name="name:3" value="tmp" />
              <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6401275180973183007">
                <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036233" resolveInfo="U" />
              </node>
              <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6401275180973183008">
                <link role="variableDeclaration:3" targetNodeId="6543581031674036258" resolveInfo="next" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6401275180973183009">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6401275180973183010">
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6401275180973183011" />
              <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6401275180973183012">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6401275180973183013" />
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6401275180973183014">
                  <link role="fieldDeclaration:3" targetNodeId="6543581031674036258" resolveInfo="next" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6401275180973183015">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6401275180973183016">
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="6401275180973183017">
                <link role="enumConstantDeclaration:3" targetNodeId="6543581031674034583" resolveInfo="UNKNOWN" />
                <link role="enumClass:3" targetNodeId="6543581031674034581" resolveInfo="HasNextState" />
              </node>
              <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6401275180973183018">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6401275180973183019" />
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6401275180973183020">
                  <link role="fieldDeclaration:3" targetNodeId="6543581031674036255" resolveInfo="hasNext" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6401275180973183021">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6401275180973183022">
              <link role="variableDeclaration:3" targetNodeId="6401275180973183001" resolveInfo="tmp" />
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674036289">
        <property name="name:3" value="skipNext" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674036290" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674036291" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036571">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674036572">
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674036573">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674036574">
                <link role="variableDeclaration:3" targetNodeId="6543581031674036251" resolveInfo="inputIt" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674036575">
                <link role="baseMethodDeclaration:3" targetNodeId="2.~Iterator.hasNext():boolean" />
              </node>
            </node>
            <node role="ifFalseStatement:3" type="jetbrains.mps.baseLanguage.structure.BlockStatement:3" id="6543581031674036576">
              <node role="statements:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036577">
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674036578">
                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6543581031674036579">
                    <link role="baseMethodDeclaration:3" targetNodeId="6543581031674036292" resolveInfo="stop" />
                  </node>
                </node>
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674036580">
                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="6543581031674036581" />
                </node>
              </node>
            </node>
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036582">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674036583">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674036584">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674036585">
                    <link role="variableDeclaration:3" targetNodeId="6543581031674036251" resolveInfo="inputIt" />
                  </node>
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674036586">
                    <link role="baseMethodDeclaration:3" targetNodeId="2.~Iterator.next():java.lang.Object" />
                  </node>
                </node>
              </node>
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674036587">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674036588">
                  <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674036589">
                    <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674036590">
                      <link role="fieldDeclaration:3" targetNodeId="6543581031674036258" resolveInfo="next" />
                    </node>
                    <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674036591" />
                  </node>
                  <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674036592" />
                </node>
              </node>
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674036593">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="6543581031674036594">
                  <property name="value:3" value="true" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674036292">
        <property name="name:3" value="stop" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674036293" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674036294" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036595">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674036596">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674036597">
              <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674036598">
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674036599">
                  <link role="fieldDeclaration:3" targetNodeId="6543581031674036255" resolveInfo="hasNext" />
                </node>
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674036600" />
              </node>
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="6543581031674036601">
                <link role="enumClass:3" targetNodeId="6543581031674034581" resolveInfo="HasNextState" />
                <link role="enumConstantDeclaration:3" targetNodeId="6543581031674034588" resolveInfo="AT_END" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674036602">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674036603">
              <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674036604">
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674036605">
                  <link role="fieldDeclaration:3" targetNodeId="6543581031674036258" resolveInfo="next" />
                </node>
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674036606" />
              </node>
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674036607" />
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674036608">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6543581031674036609">
              <link role="baseMethodDeclaration:3" targetNodeId="6543581031674036283" resolveInfo="destroy" />
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674036295">
        <property name="name:3" value="takeNext" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674036296" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674036297" />
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036610">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674036611">
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674036612">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674036613">
                <link role="variableDeclaration:3" targetNodeId="6543581031674036251" resolveInfo="inputIt" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674036614">
                <link role="baseMethodDeclaration:3" targetNodeId="2.~Iterator.hasNext():boolean" />
              </node>
            </node>
            <node role="ifFalseStatement:3" type="jetbrains.mps.baseLanguage.structure.BlockStatement:3" id="6543581031674036615">
              <node role="statements:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036616">
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674036617">
                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6543581031674036618">
                    <link role="baseMethodDeclaration:3" targetNodeId="6543581031674036292" resolveInfo="stop" />
                  </node>
                </node>
              </node>
            </node>
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036619">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674036620">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674036621">
                  <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674036622">
                    <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674036623">
                      <link role="fieldDeclaration:3" targetNodeId="6543581031674036258" resolveInfo="next" />
                    </node>
                    <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674036624" />
                  </node>
                  <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674036625">
                    <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6543581031674036626">
                      <link role="variableDeclaration:3" targetNodeId="6543581031674036251" resolveInfo="inputIt" />
                    </node>
                    <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6543581031674036627">
                      <link role="baseMethodDeclaration:3" targetNodeId="2.~Iterator.next():java.lang.Object" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674036628">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674036629">
                  <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674036630">
                    <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674036631">
                      <link role="fieldDeclaration:3" targetNodeId="6543581031674036255" resolveInfo="hasNext" />
                    </node>
                    <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674036632" />
                  </node>
                  <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="6543581031674036633">
                    <link role="enumClass:3" targetNodeId="6543581031674034581" resolveInfo="HasNextState" />
                    <link role="enumConstantDeclaration:3" targetNodeId="6543581031674034586" resolveInfo="HAS_NEXT" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674036298">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="input" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036299">
        <link role="classifier:3" targetNodeId="1.6543581031674023524" resolveInfo="Sequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036300">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036233" resolveInfo="U" />
        </node>
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674036301" />
    </node>
    <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674036302">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="page" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036303">
        <link role="classifier:3" targetNodeId="6543581031674036238" resolveInfo="PagingSequence.Page" />
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674036304" />
    </node>
    <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6543581031674036305">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="length" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="6543581031674036306" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6543581031674036307" />
    </node>
    <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="6543581031674036308">
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674036309" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674036310" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674036311">
        <property name="name:3" value="input" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036312">
          <link role="classifier:3" targetNodeId="1.6543581031674023524" resolveInfo="Sequence" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036313">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036233" resolveInfo="U" />
          </node>
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674036314">
        <property name="name:3" value="page" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036315">
          <link role="classifier:3" targetNodeId="6543581031674036238" resolveInfo="PagingSequence.Page" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674036316">
        <property name="name:3" value="length" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="6543581031674036317" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036318">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674036319">
          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="6543581031674036320">
            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674036321">
              <link role="variableDeclaration:3" targetNodeId="6543581031674036311" resolveInfo="input" />
            </node>
            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674036322" />
          </node>
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036323">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ThrowStatement:3" id="6543581031674036324">
              <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674036325">
                <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674036326">
                  <link role="baseMethodDeclaration:3" targetNodeId="2v.~NullPointerException.&lt;init&gt;()" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="6543581031674036327">
          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.LessThanExpression:3" id="6543581031674036328">
            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674036329">
              <link role="variableDeclaration:3" targetNodeId="6543581031674036316" resolveInfo="length" />
            </node>
            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="6543581031674036330">
              <property name="value:3" value="0" />
            </node>
          </node>
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036331">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ThrowStatement:3" id="6543581031674036332">
              <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674036333">
                <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674036334">
                  <link role="baseMethodDeclaration:3" targetNodeId="2v.~IllegalArgumentException.&lt;init&gt;(java.lang.String)" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="6543581031674036335">
                    <property name="value:3" value="Negative page length" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674036336">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674036337">
            <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674036338">
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674036339">
                <link role="fieldDeclaration:3" targetNodeId="6543581031674036298" resolveInfo="input" />
              </node>
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674036340" />
            </node>
            <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674036341">
              <link role="variableDeclaration:3" targetNodeId="6543581031674036311" resolveInfo="input" />
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674036342">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674036343">
            <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674036344">
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674036345">
                <link role="fieldDeclaration:3" targetNodeId="6543581031674036302" resolveInfo="page" />
              </node>
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674036346" />
            </node>
            <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674036347">
              <link role="variableDeclaration:3" targetNodeId="6543581031674036314" resolveInfo="page" />
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6543581031674036348">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6543581031674036349">
            <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6543581031674036350">
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6543581031674036351">
                <link role="fieldDeclaration:3" targetNodeId="6543581031674036305" resolveInfo="length" />
              </node>
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674036352" />
            </node>
            <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6543581031674036353">
              <link role="variableDeclaration:3" targetNodeId="6543581031674036316" resolveInfo="length" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674036354">
      <property name="name:3" value="iterator" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674036355" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036356">
        <link role="classifier:3" targetNodeId="2.~Iterator" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036357">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036233" resolveInfo="U" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036358">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674036359">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674036360">
            <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674036361">
              <link role="baseMethodDeclaration:3" targetNodeId="6543581031674036268" resolveInfo="PagingSequence.PagingIterator" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="6543581031674036695">
    <property name="name:3" value="NullMapSequence" />
    <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674036696" />
    <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674036697">
      <property name="name:3" value="U" />
    </node>
    <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674036698">
      <property name="name:3" value="V" />
    </node>
    <node role="superclass:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036699">
      <link role="classifier:3" targetNodeId="6543581031674029595" resolveInfo="NullSequence" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036700">
        <link role="classifier:3" targetNodeId="1.6543581031674030190" resolveInfo="IMapping" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036701">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036697" resolveInfo="U" />
        </node>
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036702">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036698" resolveInfo="V" />
        </node>
      </node>
    </node>
    <node role="implementedInterface:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036703">
      <link role="classifier:3" targetNodeId="1.6543581031674036653" resolveInfo="IMapSequence" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036704">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036697" resolveInfo="U" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036705">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036698" resolveInfo="V" />
      </node>
    </node>
    <node role="implementedInterface:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036706">
      <link role="classifier:3" targetNodeId="2.~Map" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036707">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036697" resolveInfo="U" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036708">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036698" resolveInfo="V" />
      </node>
    </node>
    <node role="staticField:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration:3" id="6543581031674036709">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="INSTANCE" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036710">
        <link role="classifier:3" targetNodeId="6543581031674036695" resolveInfo="NullMapSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036711">
          <link role="classifier:3" targetNodeId="2v.~Object" />
        </node>
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036712">
          <link role="classifier:3" targetNodeId="2v.~Object" />
        </node>
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674036713" />
      <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674036714">
        <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674036715">
          <link role="baseMethodDeclaration:3" targetNodeId="6543581031674036735" resolveInfo="NullMapSequence" />
          <node role="typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036716">
            <link role="classifier:3" targetNodeId="2v.~Object" />
          </node>
          <node role="typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036717">
            <link role="classifier:3" targetNodeId="2v.~Object" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration:3" id="6543581031674036718">
      <property name="name:3" value="instance" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674036719" />
      <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674036720">
        <property name="name:3" value="P" />
      </node>
      <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="6543581031674036721">
        <property name="name:3" value="Q" />
      </node>
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036722">
        <link role="classifier:3" targetNodeId="6543581031674036695" resolveInfo="NullMapSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036723">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036720" resolveInfo="P" />
        </node>
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036724">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036721" resolveInfo="Q" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036725">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674036726">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.CastExpression:3" id="6543581031674036727">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalStaticFieldReference:3" id="6543581031674036728">
              <link role="variableDeclaration:3" targetNodeId="6543581031674036709" resolveInfo="INSTANCE" />
            </node>
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036729">
              <link role="classifier:3" targetNodeId="6543581031674036695" resolveInfo="NullMapSequence" />
              <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036730">
                <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036720" resolveInfo="P" />
              </node>
              <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036731">
                <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036721" resolveInfo="Q" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="6543581031674036732">
        <link role="annotation:3" targetNodeId="2v.~SuppressWarnings" />
        <node role="value:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstanceValue:3" id="6543581031674036733">
          <link role="key:3" targetNodeId="2v.~SuppressWarnings.value()" />
          <node role="value:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="6543581031674036734">
            <property name="value:3" value="unchecked" />
          </node>
        </node>
      </node>
    </node>
    <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="6543581031674036735">
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.ProtectedVisibility:3" id="6543581031674036736" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674036737" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036738" />
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674036739">
      <property name="name:3" value="clear" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674036740" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674036741" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036742" />
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674036743">
      <property name="name:3" value="containsKey" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674036744" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674036745" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674036746">
        <property name="name:3" value="key" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036747">
          <link role="classifier:3" targetNodeId="2v.~Object" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036748">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674036749">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="6543581031674036750" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674036751">
      <property name="name:3" value="containsValue" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674036752" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6543581031674036753" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674036754">
        <property name="name:3" value="value" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036755">
          <link role="classifier:3" targetNodeId="2v.~Object" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036756">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674036757">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="6543581031674036758" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674036759">
      <property name="name:3" value="entrySet" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674036760" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036761">
        <link role="classifier:3" targetNodeId="2.~Set" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036762">
          <link role="classifier:3" targetNodeId="2.~Map$Entry" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036763">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036697" resolveInfo="U" />
          </node>
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036764">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036698" resolveInfo="V" />
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036765">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674036766">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="6543581031674036767">
            <link role="classConcept:3" targetNodeId="2.~Collections" />
            <link role="baseMethodDeclaration:3" targetNodeId="2.~Collections.emptySet():java.util.Set" />
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674036768">
      <property name="name:3" value="get" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674036769" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036770">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036698" resolveInfo="V" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674036771">
        <property name="name:3" value="key" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036772">
          <link role="classifier:3" targetNodeId="2v.~Object" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036773">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674036774">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674036775" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674036776">
      <property name="name:3" value="keySet" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674036777" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036778">
        <link role="classifier:3" targetNodeId="2.~Set" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036779">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036697" resolveInfo="U" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036780">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674036781">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="6543581031674036782">
            <link role="classConcept:3" targetNodeId="2.~Collections" />
            <link role="baseMethodDeclaration:3" targetNodeId="2.~Collections.emptySet():java.util.Set" />
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674036783">
      <property name="name:3" value="put" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674036784" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036785">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036698" resolveInfo="V" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674036786">
        <property name="name:3" value="key" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036787">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036697" resolveInfo="U" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674036788">
        <property name="name:3" value="value" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036789">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036698" resolveInfo="V" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036790">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674036791">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674036792" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674036793">
      <property name="name:3" value="putAll" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674036794" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6543581031674036795" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674036796">
        <property name="name:3" value="m" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036797">
          <link role="classifier:3" targetNodeId="2.~Map" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.UpperBoundType:3" id="6543581031674036798">
            <node role="bound:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036799">
              <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036697" resolveInfo="U" />
            </node>
          </node>
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.UpperBoundType:3" id="6543581031674036800">
            <node role="bound:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036801">
              <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036698" resolveInfo="V" />
            </node>
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036802" />
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674036803">
      <property name="name:3" value="remove" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674036804" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036805">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036698" resolveInfo="V" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674036806">
        <property name="name:3" value="key" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036807">
          <link role="classifier:3" targetNodeId="2v.~Object" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036808">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674036809">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674036810" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674036811">
      <property name="name:3" value="size" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674036812" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="6543581031674036813" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036814">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674036815">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="6543581031674036816">
            <property name="value:3" value="0" />
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674036817">
      <property name="name:3" value="values" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674036818" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036819">
        <link role="classifier:3" targetNodeId="2.~Collection" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036820">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036698" resolveInfo="V" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036821">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674036822">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="6543581031674036823">
            <link role="classConcept:3" targetNodeId="2.~Collections" />
            <link role="baseMethodDeclaration:3" targetNodeId="2.~Collections.emptySet():java.util.Set" />
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674036824">
      <property name="name:3" value="putAll" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674036825" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036826">
        <link role="classifier:3" targetNodeId="1.6543581031674036653" resolveInfo="IMapSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036827">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036697" resolveInfo="U" />
        </node>
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036828">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036698" resolveInfo="V" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674036829">
        <property name="name:3" value="map" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036830">
          <link role="classifier:3" targetNodeId="1.6543581031674036653" resolveInfo="IMapSequence" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.UpperBoundType:3" id="6543581031674036831">
            <node role="bound:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036832">
              <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036697" resolveInfo="U" />
            </node>
          </node>
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.UpperBoundType:3" id="6543581031674036833">
            <node role="bound:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036834">
              <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036698" resolveInfo="V" />
            </node>
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036835">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674036836">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674036837" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674036838">
      <property name="name:3" value="removeKey" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674036839" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036840">
        <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036698" resolveInfo="V" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6543581031674036841">
        <property name="name:3" value="u" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036842">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036697" resolveInfo="U" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036843">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674036844">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="6543581031674036845" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674036846">
      <property name="name:3" value="toMap" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674036847" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036848">
        <link role="classifier:3" targetNodeId="2.~Map" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036849">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036697" resolveInfo="U" />
        </node>
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036850">
          <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036698" resolveInfo="V" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036851">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674036852">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6543581031674036853" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674036854">
      <property name="name:3" value="iterator" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674036855" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036856">
        <link role="classifier:3" targetNodeId="2.~Iterator" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036857">
          <link role="classifier:3" targetNodeId="1.6543581031674030190" resolveInfo="IMapping" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036858">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036697" resolveInfo="U" />
          </node>
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036859">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036698" resolveInfo="V" />
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036860">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674036861">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="6543581031674036862">
            <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="6543581031674036863">
              <link role="baseMethodDeclaration:3" targetNodeId="6543581031674029607" resolveInfo="NullSequence.EmptyIterator" />
              <node role="typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036864">
                <link role="classifier:3" targetNodeId="1.6543581031674030190" resolveInfo="IMapping" />
                <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036865">
                  <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036697" resolveInfo="U" />
                </node>
                <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036866">
                  <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036698" resolveInfo="V" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="6543581031674036867">
      <property name="name:3" value="mappingsSet" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6543581031674036868" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036869">
        <link role="classifier:3" targetNodeId="1.6543581031674036081" resolveInfo="ISetSequence" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036870">
          <link role="classifier:3" targetNodeId="1.6543581031674030190" resolveInfo="IMapping" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036871">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036697" resolveInfo="U" />
          </node>
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036872">
            <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036698" resolveInfo="V" />
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6543581031674036873">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="6543581031674036874">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="6543581031674036875">
            <link role="classConcept:3" targetNodeId="1.6543581031674032858" resolveInfo="SetSequence" />
            <link role="baseMethodDeclaration:3" targetNodeId="1.6543581031674032902" resolveInfo="fromSet" />
            <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="6543581031674036876">
              <link role="classConcept:3" targetNodeId="2.~Collections" />
              <link role="baseMethodDeclaration:3" targetNodeId="2.~Collections.emptySet():java.util.Set" />
              <node role="typeArgument:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6543581031674036877">
                <link role="classifier:3" targetNodeId="1.6543581031674030190" resolveInfo="IMapping" />
                <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036878">
                  <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036697" resolveInfo="U" />
                </node>
                <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="6543581031674036879">
                  <link role="typeVariableDeclaration:3" targetNodeId="6543581031674036698" resolveInfo="V" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

