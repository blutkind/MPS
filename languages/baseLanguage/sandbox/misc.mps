<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.baseLanguage.sandbox.misc">
  <language namespace="jetbrains.mps.baseLanguage" />
  <maxImportIndex value="3" />
  <import index="1" modelUID="java.lang@java_stub" />
  <import index="2" modelUID="java.io@java_stub" />
  <import index="3" modelUID="java.util@java_stub" />
  <node type="jetbrains.mps.baseLanguage.ClassConcept" id="1144230421203">
    <property name="name" value="Test" />
    <node role="constructor" type="jetbrains.mps.baseLanguage.ConstructorDeclaration" id="1158236092784">
      <node role="returnType" type="jetbrains.mps.baseLanguage.Type" id="1158236092785" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1158236092786" />
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.FieldDeclaration" id="1144367869245">
      <property name="name" value="cc" />
      <node role="type" type="jetbrains.mps.baseLanguage.IntegerType" id="1144367871403" />
      <node role="initializer" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1144367878921">
        <property name="value" value="100" />
      </node>
    </node>
    <node role="staticField" type="jetbrains.mps.baseLanguage.StaticFieldDeclaration" id="1144367857599">
      <property name="name" value="iiiiiii" />
      <node role="type" type="jetbrains.mps.baseLanguage.IntegerType" id="1144367860429" />
      <node role="initializer" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1144367867681">
        <property name="value" value="100" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1144230427845">
      <property name="name" value="test" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1144230430894" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1144230427847">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1144367841672">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1144367841673">
            <property name="name" value="i" />
            <node role="type" type="jetbrains.mps.baseLanguage.IntegerType" id="1144367841674" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1144367846958">
              <property name="value" value="0" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1144230437427">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1144230437428">
            <property name="name" value="i" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1144230437429">
              <link role="classifier" extResolveInfo="1.[Classifier]Iterable" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1158229702642">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1158229702643">
            <property name="name" value="hmap" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1158229702644">
              <link role="classifier" extResolveInfo="3.[Classifier]HashMap" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.ClassifierType" id="1158229719522">
                <link role="classifier" extResolveInfo="1.[Classifier]String" />
              </node>
              <node role="parameter" type="jetbrains.mps.baseLanguage.ClassifierType" id="1158229809487">
                <link role="classifier" extResolveInfo="1.[Classifier]String" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.NewExpression" id="1158229731447">
              <link role="baseMethodDeclaration" extResolveInfo="3.constructor [Classifier]HashMap[ConstructorDeclaration] ()" />
              <node role="typeParameter" type="jetbrains.mps.baseLanguage.ClassifierType" id="1158229778374">
                <link role="classifier" extResolveInfo="1.[Classifier]String" />
              </node>
              <node role="typeParameter" type="jetbrains.mps.baseLanguage.ClassifierType" id="1158229787001">
                <link role="classifier" extResolveInfo="1.[Classifier]String" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1158229816911">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1158229816912">
            <property name="name" value="map" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1158229816913">
              <link role="classifier" extResolveInfo="3.[Classifier]Map" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.ClassifierType" id="1158229829886">
                <link role="classifier" extResolveInfo="1.[Classifier]String" />
              </node>
              <node role="parameter" type="jetbrains.mps.baseLanguage.ClassifierType" id="1158239941706">
                <link role="classifier" extResolveInfo="3.[Classifier]Set" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1158229851341">
              <link role="variableDeclaration" targetNodeId="1158229702643" resolveInfo="hmap" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1158240000390">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1158240000391">
            <property name="name" value="map1" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1158240000392">
              <link role="classifier" extResolveInfo="3.[Classifier]Map" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.ClassifierType" id="1158240000393">
                <link role="classifier" extResolveInfo="1.[Classifier]String" />
              </node>
              <node role="parameter" type="jetbrains.mps.baseLanguage.ClassifierType" id="1158240007225">
                <link role="classifier" extResolveInfo="1.[Classifier]Object" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1158240000395">
              <link role="variableDeclaration" targetNodeId="1158229702643" resolveInfo="hmap" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1158230214070">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1158230214071">
            <property name="name" value="c" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1158230214072">
              <link role="classifier" extResolveInfo="1.[Classifier]CharSequence" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.NewExpression" id="1158230219199">
              <link role="baseMethodDeclaration" extResolveInfo="1.constructor [Classifier]String[ConstructorDeclaration] ()" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1158235208200">
          <node role="expression" type="jetbrains.mps.baseLanguage.NewExpression" id="1158235208201">
            <link role="baseMethodDeclaration" extResolveInfo="1.constructor [Classifier]String[ConstructorDeclaration] ()" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.ClassConcept" id="1149153108889">
    <property name="name" value="Main" />
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1157626500598">
      <property name="name" value="foo" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1157626504992" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1157626500600">
        <node role="statement" type="jetbrains.mps.baseLanguage.WhileStatement" id="1157626515028">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1157626515032">
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1157630304932">
              <node role="expression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1157630305075">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1157630307453">
                  <property name="value" value="3" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1157630304933">
                  <property name="value" value="2" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1158161023706">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1158161023707">
                <property name="name" value="intArray" />
                <node role="type" type="jetbrains.mps.baseLanguage.ArrayType" id="1158161027006">
                  <node role="componentType" type="jetbrains.mps.baseLanguage.IntegerType" id="1158161023708" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1158161066431">
              <node role="expression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1158161068808">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1158161113273">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1158161116901">
                    <property name="value" value="2" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1158161102459">
                    <property name="value" value="aaa" />
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1158161066432">
                  <link role="variableDeclaration" targetNodeId="1158161023707" resolveInfo="intArray" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1157631134999">
              <node role="expression" type="jetbrains.mps.baseLanguage.MinusExpression" id="1157631136048">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.FloatingPointConstant" id="1157631138817">
                  <property name="value" value="3.3" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1157631135000">
                  <property name="value" value="2" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1157633784186">
              <node role="expression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1157633785282">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1157633787004">
                  <link role="baseMethodDeclaration" targetNodeId="1157626500598" resolveInfo="foo" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.ThisExpression" id="1157633787005" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1157633784187">
                  <property name="value" value="2" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1158146800775">
              <node role="expression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1158153168235">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1158152589638">
                  <property name="value" value="3" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.Statement" id="1158658610705" />
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1158146991461">
              <node role="expression" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1158146991462">
                <property name="value" value="true" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1158159142820">
            <property name="value" value="3" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.ClassConcept" id="1154543408784">
    <property name="name" value="Arraysss" />
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1154543420692">
      <property name="name" value="newArray" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1154543422788" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1154543420694">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1154543432617">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1154543432618">
            <property name="name" value="ints" />
            <node role="type" type="jetbrains.mps.baseLanguage.ArrayType" id="1154543437136">
              <node role="componentType" type="jetbrains.mps.baseLanguage.IntegerType" id="1154543432619" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.GenericNewExpression" id="1154543686468">
              <node role="creator" type="jetbrains.mps.baseLanguage.ArrayCreatorWithInitializer" id="1154543689017">
                <node role="componentType" type="jetbrains.mps.baseLanguage.IntegerType" id="1154543693675" />
                <node role="initValue" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1154543790458">
                  <property name="value" value="10" />
                </node>
                <node role="initValue" type="jetbrains.mps.baseLanguage.ParameterReference" id="1154544756285">
                  <link role="variableDeclaration" targetNodeId="1154544745892" />
                </node>
                <node role="initValue" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1154543801869">
                  <property name="value" value="30" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1154544745892">
        <property name="name" value="val" />
        <node role="type" type="jetbrains.mps.baseLanguage.IntegerType" id="1154544745893" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1158098418869">
      <property name="name" value="aa" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1158098418870" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1158098418871" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1158180144526">
      <property name="name" value="aaa" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1158180144527">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1158180164634">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1158180164635">
            <property name="name" value="i" />
            <node role="type" type="jetbrains.mps.baseLanguage.IntegerType" id="1158180164636" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.MulExpression" id="1158608663259">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1158608213475">
                <property name="value" value="10" />
              </node>
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1158180230042">
                <property name="value" value="20" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1158657408980">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1158657408981">
            <property name="name" value="b" />
            <node role="type" type="jetbrains.mps.baseLanguage.BooleanType" id="1158657408982" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1158657413094">
              <property name="value" value="10" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1158657539957">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1158657539958">
            <property name="name" value="c" />
            <node role="type" type="jetbrains.mps.baseLanguage.BooleanType" id="1158657539959" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1158657549148">
          <node role="condition" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1158657550808">
            <property name="value" value="3" />
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1158657549150">
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1158657591419">
              <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1158657594858">
                <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1158657591420">
                  <link role="variableDeclaration" targetNodeId="1158657539958" resolveInfo="c" />
                </node>
                <node role="rValue" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1158657597500">
                  <property name="value" value="140" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1158657602486">
              <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1158657603848">
                <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1158657602487">
                  <link role="variableDeclaration" targetNodeId="1158657539958" resolveInfo="c" />
                </node>
                <node role="rValue" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1158657605630">
                  <property name="value" value="true" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1158657780243">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1158657782856">
                <link role="baseMethodDeclaration" targetNodeId="1154543420692" resolveInfo="newArray" />
                <node role="instance" type="jetbrains.mps.baseLanguage.ThisExpression" id="1158657780244" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1158657788623">
                  <property name="value" value="3" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1158657848985">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1158657851113">
                <link role="baseMethodDeclaration" targetNodeId="1154543420692" resolveInfo="newArray" />
                <node role="instance" type="jetbrains.mps.baseLanguage.ThisExpression" id="1158657848986" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1158657853708">
                  <property name="value" value="true" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1158664437586">
              <node role="expression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1158664445074">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1158664448156">
                  <property name="value" value="3" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1158664441636">
                  <link role="baseMethodDeclaration" targetNodeId="1158180144526" resolveInfo="aaa" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.ThisExpression" id="1158664437587" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1158664454580">
              <node role="expression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1158664458035">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1158664460194">
                  <property name="value" value="3" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1158664454581">
                  <property name="value" value="aa" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1158323969879">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1158323969880">
            <link role="baseMethodDeclaration" targetNodeId="1154543420692" resolveInfo="newArray" />
            <node role="instance" type="jetbrains.mps.baseLanguage.ThisExpression" id="1158323969881" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1158657930059">
              <property name="value" value="true" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1158657909351">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1158657948403">
            <link role="baseMethodDeclaration" targetNodeId="1154543420692" resolveInfo="newArray" />
            <node role="instance" type="jetbrains.mps.baseLanguage.ThisExpression" id="1158657909352" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1158657955952">
              <link role="variableDeclaration" targetNodeId="1158180164635" resolveInfo="i" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1158657938287">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1158657938288">
            <link role="baseMethodDeclaration" targetNodeId="1154543420692" resolveInfo="newArray" />
            <node role="instance" type="jetbrains.mps.baseLanguage.ThisExpression" id="1158657938289" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1158657938290">
              <property name="value" value="true" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1158658217791">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1158658217792">
            <property name="name" value="hm" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1158658217793">
              <link role="classifier" extResolveInfo="3.[Classifier]HashMap" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.ClassifierType" id="1158658226061">
                <link role="classifier" extResolveInfo="1.[Classifier]String" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1158658265972">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1158658265973">
            <property name="name" value="mm" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1158658265974">
              <link role="classifier" extResolveInfo="3.[Classifier]Map" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.ClassifierType" id="1158658265975">
                <link role="classifier" extResolveInfo="1.[Classifier]String" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1158658273494">
              <link role="variableDeclaration" targetNodeId="1158658217792" resolveInfo="hm" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1158180144528" />
    </node>
  </node>
</model>

