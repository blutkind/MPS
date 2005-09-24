<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.baseLanguage.sandbox.test">
  <maxReferenceID value="2" />
  <language namespace="jetbrains.mps.baseLanguage" />
  <import referenceID="1" modelUID="java.lang@java_stub" />
  <node type="jetbrains.mps.baseLanguage.Interface" id="1115766127296">
    <property name="name" value="IBaseInterface" />
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1115766147547">
      <property name="name" value="baseInterfaceMethod" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115766147565" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1115766151082" />
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.Interface" id="1115766166286">
    <property name="name" value="AnInterface" />
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1115766214538">
      <property name="name" value="baseInterfaceMethod" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115766214540" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1115766218166" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1115766241542">
      <property name="name" value="anInterfaceMethod" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115766241544" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1115766243764" />
    </node>
    <node role="extendedInterface" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115766202021">
      <link role="classifier" targetNodeId="1115766127296" />
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.ClassConcept" id="1115766267843">
    <property name="name" value="BaseClass" />
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1115766285313">
      <property name="name" value="baseInterfaceMethod" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115766285315" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1115766288301" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1115766295021">
      <property name="name" value="anInterfaceMethod" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115766295023" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1115766297524" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1115766326104">
      <property name="name" value="baseClassMethod" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115766326106" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1115766328169" />
    </node>
    <node role="implementedInterface" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115766274125">
      <link role="classifier" targetNodeId="1115766166286" />
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.ClassConcept" id="1115766310400">
    <property name="name" value="AClass" />
    <link role="extendedClass" targetNodeId="1115766267843" />
    <node role="field" type="jetbrains.mps.baseLanguage.FieldDeclaration" id="1127094836077">
      <property name="name" value="aaa" />
      <node role="type" type="jetbrains.mps.baseLanguage.IntegerType" id="1127094838614" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1115766338748">
      <property name="name" value="aClassMethod" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115766338750">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1126142422028">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1126142422092">
            <property name="name" value="aClass" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1126142422093">
              <link role="classifier" targetNodeId="1115766310400" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1127094882893">
          <node role="expression" type="jetbrains.mps.baseLanguage.FieldReference" id="1127098709768">
            <link role="variableDeclaration" targetNodeId="1127094836077" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1127094882894">
              <link role="variableDeclaration" targetNodeId="1126142422092" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1127095494814">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1127098277264">
            <link role="baseMethodDeclaration" targetNodeId="1115766338748" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1127095494815">
              <link role="variableDeclaration" targetNodeId="1126142422092" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1127098721977">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1127098788159">
            <link role="baseMethodDeclaration" targetNodeId="1115766295021" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1127098721978">
              <link role="variableDeclaration" targetNodeId="1126142422092" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1115766340908" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1126142365135">
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1126142365229">
          <link role="classifier" targetNodeId="1115766310400" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.ClassConcept" id="1115766355096">
    <property name="name" value="TESTMethodCalls" />
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115766367394">
      <property name="name" value="mmm" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115766367412">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115766387882">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115766387883">
            <property name="name" value="c1" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115766387884">
              <link role="classifier" targetNodeId="1115766310400" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115766395168">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115766399358">
            <link role="baseMethodDeclaration" targetNodeId="1115766338748" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115766395169">
              <link role="variableDeclaration" targetNodeId="1115766387883" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1115766375256" />
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.ClassConcept" id="1119992601482">
    <property name="name" value="TestInt" />
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1120075189455">
      <property name="name" value="aaa_static" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1120075189581" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1120075201350" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1119993863122">
      <property name="name" value="aaa" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1119993863499">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1120147044954">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1120147044955">
            <property name="name" value="aaa" />
            <node role="type" type="jetbrains.mps.baseLanguage.IntegerType" id="1120147044956" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.ParenthesizedExpression" id="1120166093665">
              <node role="expression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1120166075736">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1120166080849">
                  <property name="value" value="10" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.FloatingPointConstant" id="1120233244547">
                  <property name="value" value="10.0" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.IntegerType" id="1119993866157" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1119993881455">
        <property name="name" value="iii" />
        <node role="type" type="jetbrains.mps.baseLanguage.IntegerType" id="1119993881456" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.ClassConcept" id="1127501659937">
    <property name="name" value="TestArrays" />
    <node role="constructor" type="jetbrains.mps.baseLanguage.ConstructorDeclaration" id="1127521381925">
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1127521385662">
        <property name="name" value="args" />
        <node role="type" type="jetbrains.mps.baseLanguage.ArrayType" id="1127521404777">
          <node role="componentType" type="jetbrains.mps.baseLanguage.ClassType" id="1127521404778">
            <link role="classifier" extResolveInfo="1.[ClassConcept]String" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.Type" id="1127521515935" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1127521382005" />
    </node>
    <node role="staticField" type="jetbrains.mps.baseLanguage.StaticFieldDeclaration" id="1127521372765">
      <property name="name" value="bbb" />
      <node role="type" type="jetbrains.mps.baseLanguage.ArrayType" id="1127521376986">
        <node role="componentType" type="jetbrains.mps.baseLanguage.ClassType" id="1127521377018">
          <link role="classifier" extResolveInfo="1.[ClassConcept]AbstractStringBuilder" />
        </node>
      </node>
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.FieldDeclaration" id="1127505657359">
      <property name="name" value="aaa" />
      <node role="type" type="jetbrains.mps.baseLanguage.ArrayType" id="1127511843639">
        <node role="componentType" type="jetbrains.mps.baseLanguage.InterfaceType" id="1127511843796">
          <link role="classifier" targetNodeId="1115766127296" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1127501681001">
      <property name="name" value="method" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1127501681440" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.ArrayType" id="1127520302970">
        <node role="componentType" type="jetbrains.mps.baseLanguage.TypeVariableReference" id="1127520308379">
          <link role="typeVariableDeclaration" targetNodeId="1127509349664" />
        </node>
      </node>
    </node>
    <node role="typeVariableDeclaration" type="jetbrains.mps.baseLanguage.TypeVariableDeclaration" id="1127509349664">
      <property name="name" value="T1" />
    </node>
    <node role="typeVariableDeclaration" type="jetbrains.mps.baseLanguage.TypeVariableDeclaration" id="1127509355540">
      <property name="name" value="T2" />
    </node>
  </node>
</model>

