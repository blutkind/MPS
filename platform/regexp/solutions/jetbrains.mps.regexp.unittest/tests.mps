<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:710bb5ca-133c-4e34-80eb-4be42af51339(tests)">
  <persistence version="3" />
  <refactoringHistory />
  <language namespace="daafa647-f1f7-4b0b-b096-69cd7c8408c0(jetbrains.mps.baseLanguage.regexp)" />
  <language namespace="f61473f9-130f-42f6-b98d-6c438812c2f6(jetbrains.mps.baseLanguage.unitTest)" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="7866978e-a0f0-4cc7-81bc-4d213d9375e1(jetbrains.mps.lang.smodel)" />
  <language namespace="443f4c36-fcf5-4eb6-9500-8d06ed259e3e(jetbrains.mps.baseLanguage.classifiers)" />
  <language namespace="ceab5195-25ea-4f22-9b92-103b95ca8c0c(jetbrains.mps.lang.core)" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590515(jetbrains.mps.baseLanguage.regexp.constraints)" version="3" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590518(jetbrains.mps.baseLanguage.regexp.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902c1(jetbrains.mps.baseLanguage.constraints)" version="83" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902db(jetbrains.mps.baseLanguage.blTypes.constraints)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590283(jetbrains.mps.lang.core.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902d2(jetbrains.mps.baseLanguage.unitTest.constraints)" version="1" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902d5(jetbrains.mps.baseLanguage.unitTest.plugin)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902fb(jetbrains.mps.lang.smodel.constraints)" version="21" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.lang.smodel.structure)" version="16" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590334(jetbrains.mps.baseLanguage.closures.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590338(jetbrains.mps.baseLanguage.closures.structure)" version="3" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590373(jetbrains.mps.baseLanguage.classifiers.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959036e(jetbrains.mps.baseLanguage.classifiers.constraints)" version="7" />
  <maxImportIndex value="3" />
  <import index="1" modelUID="r:00000000-0000-4000-0000-011c89590518(jetbrains.mps.baseLanguage.regexp.structure)" version="0" />
  <import index="2" modelUID="f:java_stub#java.util(java.util@java_stub)" version="-1" />
  <import index="3" modelUID="f:java_stub#java.util.regex(java.util.regex@java_stub)" version="-1" />
  <node type="jetbrains.mps.baseLanguage.unitTest.structure.BTestCase" id="6799940379546332953">
    <property name="testCaseName" value="Statements" />
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="6799940379546332954" />
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="6799940379546332955">
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="6799940379546332956" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="6799940379546332957" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="6799940379546332958" />
    </node>
    <node role="testMethodList" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethodList" id="6799940379546332959">
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="6799940379546332960">
        <property name="methodName" value="ifmatch" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="6799940379546332961" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="6799940379546332962" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="6799940379546332963">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="6799940379546332980">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="6799940379546332981">
              <property name="name" value="input" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.StringType" id="6799940379546332982" />
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="6799940379546332984">
                <property name="value" value="reader@gmail.com" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="6799940379546332987">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="6799940379546332988">
              <property name="name" value="matches" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="6799940379546332989" />
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="6799940379546332991">
                <property name="value" value="false" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.regexp.structure.MatchRegexpStatement" id="6799940379546332964">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="6799940379546332965">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="6799940379546332992">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="6799940379546332994">
                  <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="6799940379546332993">
                    <link role="variableDeclaration" targetNodeId="6799940379546332988" resolveInfo="matches" />
                  </node>
                  <node role="rValue" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="6799940379546332997">
                    <property name="value" value="true" />
                  </node>
                </node>
              </node>
            </node>
            <node role="expr" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="6799940379546332985">
              <link role="variableDeclaration" targetNodeId="6799940379546332981" resolveInfo="input" />
            </node>
            <node role="regexp" type="jetbrains.mps.baseLanguage.regexp.structure.InlineRegexpExpression" id="6799940379546332976">
              <node role="regexp" type="jetbrains.mps.baseLanguage.regexp.structure.RegexpDeclarationReferenceRegexp" id="233706782641329819">
                <link role="regexp" targetNodeId="6799940379546332969" resolveInfo="EMail" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertTrue" id="6799940379546332999">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="6799940379546333004">
              <link role="variableDeclaration" targetNodeId="6799940379546332988" resolveInfo="matches" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <visible index="2" modelUID="r:00000000-0000-4000-0000-011c89590519(jetbrains.mps.baseLanguage.regexp.jetbrains.mps.regexp.accessory)" />
  <node type="jetbrains.mps.baseLanguage.regexp.structure.Regexps" id="6799940379546332968">
    <property name="name" value="Regexps" />
    <node role="regexp" type="jetbrains.mps.baseLanguage.regexp.structure.RegexpDeclaration" id="6799940379546332969">
      <property name="name" value="EMail" />
      <property name="description" value="email regexp" />
      <node role="regexp" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp" id="6799940379546350580">
        <node role="left" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp" id="6799940379546350583">
          <node role="right" type="jetbrains.mps.baseLanguage.regexp.structure.StringLiteralRegexp" id="6799940379546350586">
            <property name="text" value="@" />
          </node>
          <node role="left" type="jetbrains.mps.baseLanguage.regexp.structure.PlusRegexp" id="6799940379546914498">
            <node role="regexp" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp" id="6799940379547300497">
              <link role="symbolClass" targetNodeId="2v.1174554738336" resolveInfo="\w" />
            </node>
          </node>
        </node>
        <node role="right" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp" id="6799940379546350600">
          <node role="left" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp" id="5533535376639120957">
            <link role="symbolClass" targetNodeId="2v.1174554738336" resolveInfo="\w" />
          </node>
          <node role="right" type="jetbrains.mps.baseLanguage.regexp.structure.StarRegexp" id="6799940379547199073">
            <node role="regexp" type="jetbrains.mps.baseLanguage.regexp.structure.ParensRegexp" id="6799940379547199074">
              <node role="expr" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp" id="6799940379547199075">
                <node role="left" type="jetbrains.mps.baseLanguage.regexp.structure.DotRegexp" id="5533535376639120959" />
                <node role="right" type="jetbrains.mps.baseLanguage.regexp.structure.PlusRegexp" id="6799940379547199077">
                  <node role="regexp" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp" id="5533535376639120958">
                    <link role="symbolClass" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="regexp" type="jetbrains.mps.baseLanguage.regexp.structure.RegexpDeclaration" id="5533535376639120949">
      <property name="name" value="esc_Brackets" />
      <node role="regexp" type="jetbrains.mps.baseLanguage.regexp.structure.PlusRegexp" id="1353467374625726864">
        <node role="regexp" type="jetbrains.mps.baseLanguage.regexp.structure.MatchParensRegexp" id="1353467374625726865">
          <property name="name" value="as" />
          <node role="regexp" type="jetbrains.mps.baseLanguage.regexp.structure.OrRegexp" id="1353467374625726866">
            <node role="left" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp" id="1353467374625726867">
              <node role="right" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp" id="1353467374625726868">
                <node role="right" type="jetbrains.mps.baseLanguage.regexp.structure.StringLiteralRegexp" id="1353467374625726869">
                  <property name="text" value="]" />
                </node>
                <node role="left" type="jetbrains.mps.baseLanguage.regexp.structure.PlusRegexp" id="1353467374625726870">
                  <node role="regexp" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp" id="1353467374625726871">
                    <link role="symbolClass" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                  </node>
                </node>
              </node>
              <node role="left" type="jetbrains.mps.baseLanguage.regexp.structure.StringLiteralRegexp" id="1353467374625726872">
                <property name="text" value="[" />
              </node>
            </node>
            <node role="right" type="jetbrains.mps.baseLanguage.regexp.structure.OrRegexp" id="1353467374625726873">
              <node role="left" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp" id="1353467374625726874">
                <node role="left" type="jetbrains.mps.baseLanguage.regexp.structure.StringLiteralRegexp" id="1353467374625726875">
                  <property name="text" value="(" />
                </node>
                <node role="right" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp" id="1353467374625726876">
                  <node role="right" type="jetbrains.mps.baseLanguage.regexp.structure.StringLiteralRegexp" id="1353467374625726877">
                    <property name="text" value=")" />
                  </node>
                  <node role="left" type="jetbrains.mps.baseLanguage.regexp.structure.PlusRegexp" id="1353467374625726878">
                    <node role="regexp" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp" id="1353467374625726879">
                      <link role="symbolClass" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="right" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp" id="1353467374625726880">
                <node role="right" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp" id="1353467374625726881">
                  <node role="right" type="jetbrains.mps.baseLanguage.regexp.structure.StringLiteralRegexp" id="1353467374625726882">
                    <property name="text" value="}" />
                  </node>
                  <node role="left" type="jetbrains.mps.baseLanguage.regexp.structure.PlusRegexp" id="1353467374625726883">
                    <node role="regexp" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp" id="1353467374625726884">
                      <link role="symbolClass" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                    </node>
                  </node>
                </node>
                <node role="left" type="jetbrains.mps.baseLanguage.regexp.structure.StringLiteralRegexp" id="1353467374625726885">
                  <property name="text" value="{" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="regexp" type="jetbrains.mps.baseLanguage.regexp.structure.RegexpDeclaration" id="1353467374624831077">
      <property name="name" value="ssdssds" />
      <node role="regexp" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp" id="1353467374625020297">
        <node role="left" type="jetbrains.mps.baseLanguage.regexp.structure.StringLiteralRegexp" id="1353467374624831083">
          <property name="text" value="(asdadsasd)" />
        </node>
        <node role="right" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp" id="1353467374625824275">
          <node role="right" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp" id="1353467374625909705">
            <node role="right" type="jetbrains.mps.baseLanguage.regexp.structure.StringLiteralRegexp" id="1353467374625909708">
              <property name="text" value="$" />
            </node>
            <node role="left" type="jetbrains.mps.baseLanguage.regexp.structure.UnicodeCharacterRegexp" id="1353467374625824278">
              <property name="code" value="0022" />
            </node>
          </node>
          <node role="left" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp" id="1353467374626009226">
            <node role="left" type="jetbrains.mps.baseLanguage.regexp.structure.FromNToMTimesRegexp" id="1353467374625213924">
              <property name="n" value="1" />
              <property name="m" value="4" />
              <node role="regexp" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp" id="1353467374625213925">
                <node role="right" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp" id="1353467374625213926">
                  <link role="symbolClass" targetNodeId="2v.1174554696286" resolveInfo="\D" />
                </node>
                <node role="left" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp" id="1353467374625213927">
                  <link role="symbolClass" targetNodeId="2v.1174554752025" resolveInfo="\W" />
                </node>
              </node>
            </node>
            <node role="right" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp" id="1353467374626825854">
              <node role="left" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp" id="1353467374626009229">
                <link role="symbolClass" targetNodeId="2v.3050481019132403217" resolveInfo="\\" />
              </node>
              <node role="right" type="jetbrains.mps.baseLanguage.regexp.structure.LineEndRegexp" id="1353467374626825859" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.unitTest.structure.BTestCase" id="1353467374625228509">
    <property name="testCaseName" value="Escaping" />
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1353467374625228510" />
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1353467374625228511">
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1353467374625228512" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1353467374625228513" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1353467374625228514" />
    </node>
    <node role="testMethodList" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethodList" id="1353467374625228515">
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="1353467374625228516">
        <property name="methodName" value="escapeInLiteral" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1353467374625228517" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1353467374625228518" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1353467374625228519">
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertTrue" id="1353467374625228614">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1353467374625228615">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1353467374625228616">
                <property name="value" value="[asdsa]" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.regexp.structure.MatchRegexpOperation" id="1353467374625228617">
                <node role="regexp" type="jetbrains.mps.baseLanguage.regexp.structure.InlineRegexpExpression" id="1353467374625228618">
                  <node role="regexp" type="jetbrains.mps.baseLanguage.regexp.structure.RegexpDeclarationReferenceRegexp" id="1353467374625228619">
                    <link role="regexp" targetNodeId="5533535376639120949" resolveInfo="esc_Brackets" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertTrue" id="1353467374625327703">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1353467374625327704">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1353467374625327705">
                <property name="value" value="(asdsa)" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.regexp.structure.MatchRegexpOperation" id="1353467374625327706">
                <node role="regexp" type="jetbrains.mps.baseLanguage.regexp.structure.InlineRegexpExpression" id="1353467374625327707">
                  <node role="regexp" type="jetbrains.mps.baseLanguage.regexp.structure.RegexpDeclarationReferenceRegexp" id="1353467374625327708">
                    <link role="regexp" targetNodeId="5533535376639120949" resolveInfo="esc_Brackets" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertTrue" id="1353467374625327710">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1353467374625327711">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1353467374625327712">
                <property name="value" value="{qq}" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.regexp.structure.MatchRegexpOperation" id="1353467374625327713">
                <node role="regexp" type="jetbrains.mps.baseLanguage.regexp.structure.InlineRegexpExpression" id="1353467374625327714">
                  <node role="regexp" type="jetbrains.mps.baseLanguage.regexp.structure.RegexpDeclarationReferenceRegexp" id="1353467374625327715">
                    <link role="regexp" targetNodeId="5533535376639120949" resolveInfo="esc_Brackets" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertFalse" id="1353467374625412825">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1353467374625412827">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1353467374625412828">
                <property name="value" value="s{qq}" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.regexp.structure.MatchRegexpOperation" id="1353467374625412829">
                <node role="regexp" type="jetbrains.mps.baseLanguage.regexp.structure.InlineRegexpExpression" id="1353467374625412830">
                  <node role="regexp" type="jetbrains.mps.baseLanguage.regexp.structure.RegexpDeclarationReferenceRegexp" id="1353467374625412831">
                    <link role="regexp" targetNodeId="5533535376639120949" resolveInfo="esc_Brackets" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="8330008649153446819">
        <property name="methodName" value="testPredefined" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="8330008649153446820" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="8330008649153446821" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="8330008649153446822">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="8330008649153446829">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="8330008649153446830">
              <property name="name" value="p" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="8330008649153446831">
                <link role="classifier" targetNodeId="3.~Pattern" resolveInfo="Pattern" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.regexp.structure.InlineRegexpExpression" id="8330008649153446832">
                <node role="regexp" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp" id="8330008649153447615">
                  <node role="right" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp" id="8330008649153447619">
                    <node role="right" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp" id="8330008649153447623">
                      <node role="right" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp" id="8330008649153448116">
                        <node role="right" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp" id="8330008649153448119">
                          <link role="symbolClass" targetNodeId="2v.1202318346829" resolveInfo="\b" />
                        </node>
                        <node role="left" type="jetbrains.mps.baseLanguage.regexp.structure.PositiveSymbolClassRegexp" id="8330008649153447626">
                          <node role="part" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassSymbolClassPart" id="8330008649153448115">
                            <link role="declaration" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                          </node>
                          <node role="part" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassSymbolClassPart" id="8330008649153447797">
                            <link role="declaration" targetNodeId="2v.1174554696286" resolveInfo="\D" />
                          </node>
                        </node>
                      </node>
                      <node role="left" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp" id="8330008649153447622">
                        <link role="symbolClass" targetNodeId="2v.1174554752025" resolveInfo="\W" />
                      </node>
                    </node>
                    <node role="left" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp" id="8330008649153447618">
                      <link role="symbolClass" targetNodeId="2v.3050481019132403217" resolveInfo="\\" />
                    </node>
                  </node>
                  <node role="left" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp" id="8330008649153446833">
                    <link role="symbolClass" targetNodeId="2v.1174554710194" resolveInfo="\s" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="8330008649153446835">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="8330008649153446838">
              <property name="value" value="\\s\\\\\\W[\\w\\D]\\b" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8330008649153446839">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="8330008649153446840">
                <link role="variableDeclaration" targetNodeId="8330008649153446830" resolveInfo="p" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="8330008649153446841">
                <link role="baseMethodDeclaration" targetNodeId="3.~Pattern.pattern():java.lang.String" resolveInfo="pattern" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="8330008649153753492">
        <property name="methodName" value="testRange1" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="8330008649153753493" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="8330008649153753494" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="8330008649153753495">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="8330008649153753497">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="8330008649153753498">
              <property name="name" value="p" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="8330008649153753499">
                <link role="classifier" targetNodeId="3.~Pattern" resolveInfo="Pattern" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.regexp.structure.InlineRegexpExpression" id="8330008649153753500">
                <node role="regexp" type="jetbrains.mps.baseLanguage.regexp.structure.PositiveSymbolClassRegexp" id="8330008649153753518">
                  <node role="part" type="jetbrains.mps.baseLanguage.regexp.structure.CharacterSymbolClassPart" id="8330008649153753519">
                    <property name="character" value="a" />
                  </node>
                  <node role="part" type="jetbrains.mps.baseLanguage.regexp.structure.IntervalSymbolClassPart" id="8330008649153753521">
                    <property name="start" value="c" />
                    <property name="end" value="f" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="8330008649153753512">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="8330008649153753513">
              <property name="value" value="[\\Qa\\Ec-f]" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8330008649153753514">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="8330008649153753515">
                <link role="variableDeclaration" targetNodeId="8330008649153753498" resolveInfo="p" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="8330008649153753516">
                <link role="baseMethodDeclaration" targetNodeId="3.~Pattern.pattern():java.lang.String" resolveInfo="pattern" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="8330008649153447596">
        <property name="methodName" value="testStringLiteral" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="8330008649153447597" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="8330008649153447598" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="8330008649153447599">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="8330008649153447600">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="8330008649153447601">
              <property name="name" value="p" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="8330008649153447602">
                <link role="classifier" targetNodeId="3.~Pattern" resolveInfo="Pattern" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.regexp.structure.InlineRegexpExpression" id="8330008649153447603">
                <node role="regexp" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp" id="8330008649153447604">
                  <node role="right" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp" id="8330008649153447605">
                    <node role="right" type="jetbrains.mps.baseLanguage.regexp.structure.StringLiteralRegexp" id="8330008649153447606">
                      <property name="text" value="\&quot;" />
                    </node>
                    <node role="left" type="jetbrains.mps.baseLanguage.regexp.structure.StringLiteralRegexp" id="8330008649153447607">
                      <property name="text" value="&quot;" />
                    </node>
                  </node>
                  <node role="left" type="jetbrains.mps.baseLanguage.regexp.structure.StringLiteralRegexp" id="8330008649153447634">
                    <property name="text" value="'\'" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="8330008649153447609">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="8330008649153447610">
              <property name="value" value="'\\'\&quot;\\\&quot;" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8330008649153447611">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="8330008649153447612">
                <link role="variableDeclaration" targetNodeId="8330008649153447601" resolveInfo="p" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="8330008649153447613">
                <link role="baseMethodDeclaration" targetNodeId="3.~Pattern.pattern():java.lang.String" resolveInfo="pattern" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertTrue" id="8330008649153448279">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8330008649153448287">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8330008649153448282">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="8330008649153448281">
                  <link role="variableDeclaration" targetNodeId="8330008649153447601" resolveInfo="p" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="8330008649153448286">
                  <link role="baseMethodDeclaration" targetNodeId="3.~Pattern.matcher(java.lang.CharSequence):java.util.regex.Matcher" resolveInfo="matcher" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="8330008649153448292">
                    <property name="value" value="''\&quot;\&quot;" />
                  </node>
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="8330008649153448291">
                <link role="baseMethodDeclaration" targetNodeId="3.~Matcher.matches():boolean" resolveInfo="matches" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="8330008649153549856">
        <property name="methodName" value="testBackref" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="8330008649153549857" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="8330008649153549858" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="8330008649153549859">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="8330008649153549860">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="8330008649153549861">
              <property name="name" value="p" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="8330008649153549862">
                <link role="classifier" targetNodeId="3.~Pattern" resolveInfo="Pattern" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.regexp.structure.InlineRegexpExpression" id="8330008649153549863">
                <node role="regexp" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp" id="8330008649153549870">
                  <node role="right" type="jetbrains.mps.baseLanguage.regexp.structure.LineEndRegexp" id="8330008649153549873" />
                  <node role="left" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp" id="8330008649153549877">
                    <node role="right" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp" id="8330008649153549882">
                      <node role="right" type="jetbrains.mps.baseLanguage.regexp.structure.MatchVariableReferenceRegexp" id="8330008649153549885">
                        <link role="match" targetNodeId="8330008649153549880" resolveInfo="ioo" />
                      </node>
                      <node role="left" type="jetbrains.mps.baseLanguage.regexp.structure.MatchParensRegexp" id="8330008649153549880">
                        <property name="name" value="ioo" />
                        <node role="regexp" type="jetbrains.mps.baseLanguage.regexp.structure.PlusRegexp" id="8330008649153549887">
                          <node role="regexp" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp" id="8330008649153549886">
                            <link role="symbolClass" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="left" type="jetbrains.mps.baseLanguage.regexp.structure.LineStartRegexp" id="8330008649153549869" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="8330008649153549890">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="8330008649153549891">
              <property name="value" value="^(\\w+)\\1$" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8330008649153549892">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="8330008649153549893">
                <link role="variableDeclaration" targetNodeId="8330008649153549861" resolveInfo="p" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="8330008649153549894">
                <link role="baseMethodDeclaration" targetNodeId="3.~Pattern.pattern():java.lang.String" resolveInfo="pattern" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertTrue" id="8330008649153549901">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8330008649153549902">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8330008649153549903">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="8330008649153549904">
                  <link role="variableDeclaration" targetNodeId="8330008649153549861" resolveInfo="p" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="8330008649153549905">
                  <link role="baseMethodDeclaration" targetNodeId="3.~Pattern.matcher(java.lang.CharSequence):java.util.regex.Matcher" resolveInfo="matcher" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="8330008649153549906">
                    <property name="value" value="kbbbwkbbbw" />
                  </node>
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="8330008649153549907">
                <link role="baseMethodDeclaration" targetNodeId="3.~Matcher.matches():boolean" resolveInfo="matches" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertFalse" id="8330008649153549917">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8330008649153549919">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8330008649153549920">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="8330008649153549921">
                  <link role="variableDeclaration" targetNodeId="8330008649153549861" resolveInfo="p" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="8330008649153549922">
                  <link role="baseMethodDeclaration" targetNodeId="3.~Pattern.matcher(java.lang.CharSequence):java.util.regex.Matcher" resolveInfo="matcher" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="8330008649153549923">
                    <property name="value" value="kbbbwkbbw" />
                  </node>
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="8330008649153549924">
                <link role="baseMethodDeclaration" targetNodeId="3.~Matcher.matches():boolean" resolveInfo="matches" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="8330008649153751541">
        <property name="methodName" value="testAutoBrackets" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="8330008649153751542" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="8330008649153751543" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="8330008649153751544">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="8330008649153751545">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="8330008649153751546">
              <property name="name" value="p" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="8330008649153751547">
                <link role="classifier" targetNodeId="3.~Pattern" resolveInfo="Pattern" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.regexp.structure.InlineRegexpExpression" id="8330008649153751549">
                <node role="regexp" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp" id="8330008649153751552">
                  <node role="right" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp" id="8330008649153751581">
                    <node role="right" type="jetbrains.mps.baseLanguage.regexp.structure.LineEndRegexp" id="8330008649153751584" />
                    <node role="left" type="jetbrains.mps.baseLanguage.regexp.structure.PlusRegexp" id="8330008649153751561">
                      <node role="regexp" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp" id="8330008649153751564">
                        <node role="right" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp" id="8330008649153751567">
                          <link role="symbolClass" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                        </node>
                        <node role="left" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp" id="8330008649153751563">
                          <link role="symbolClass" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="left" type="jetbrains.mps.baseLanguage.regexp.structure.LineStartRegexp" id="8330008649153751551" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="8330008649153751586">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="8330008649153751587">
              <property name="value" value="^(?:\\w\\w)+$" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8330008649153751588">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="8330008649153751589">
                <link role="variableDeclaration" targetNodeId="8330008649153751546" resolveInfo="p" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="8330008649153751590">
                <link role="baseMethodDeclaration" targetNodeId="3.~Pattern.pattern():java.lang.String" resolveInfo="pattern" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertTrue" id="8330008649153751591">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8330008649153751592">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8330008649153751593">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="8330008649153751594">
                  <link role="variableDeclaration" targetNodeId="8330008649153751546" resolveInfo="p" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="8330008649153751595">
                  <link role="baseMethodDeclaration" targetNodeId="3.~Pattern.matcher(java.lang.CharSequence):java.util.regex.Matcher" resolveInfo="matcher" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="8330008649153751596">
                    <property name="value" value="bwbb" />
                  </node>
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="8330008649153751597">
                <link role="baseMethodDeclaration" targetNodeId="3.~Matcher.matches():boolean" resolveInfo="matches" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertFalse" id="8330008649153751599">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8330008649153751608">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8330008649153751602">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="8330008649153751601">
                  <link role="variableDeclaration" targetNodeId="8330008649153751546" resolveInfo="p" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="8330008649153751606">
                  <link role="baseMethodDeclaration" targetNodeId="3.~Pattern.matcher(java.lang.CharSequence):java.util.regex.Matcher" resolveInfo="matcher" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="8330008649153751607">
                    <property name="value" value="bbb" />
                  </node>
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="8330008649153751612">
                <link role="baseMethodDeclaration" targetNodeId="3.~Matcher.matches():boolean" resolveInfo="matches" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="8330008649153752705">
        <property name="methodName" value="testAutoBrackets24" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="8330008649153752706" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="8330008649153752707" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="8330008649153752708">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="8330008649153752709">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="8330008649153752710">
              <property name="name" value="p" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="8330008649153752711">
                <link role="classifier" targetNodeId="3.~Pattern" resolveInfo="Pattern" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.regexp.structure.InlineRegexpExpression" id="8330008649153752712">
                <node role="regexp" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp" id="8330008649153752713">
                  <node role="right" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp" id="8330008649153752714">
                    <node role="right" type="jetbrains.mps.baseLanguage.regexp.structure.LineEndRegexp" id="8330008649153752715" />
                    <node role="left" type="jetbrains.mps.baseLanguage.regexp.structure.FromNToMTimesRegexp" id="8330008649153752740">
                      <property name="n" value="2" />
                      <property name="m" value="4" />
                      <node role="regexp" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp" id="8330008649153752741">
                        <node role="right" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp" id="8330008649153752742">
                          <link role="symbolClass" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                        </node>
                        <node role="left" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp" id="8330008649153752743">
                          <link role="symbolClass" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="left" type="jetbrains.mps.baseLanguage.regexp.structure.LineStartRegexp" id="8330008649153752720" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="8330008649153752721">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="8330008649153752722">
              <property name="value" value="^(?:\\w\\w){2,4}$" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8330008649153752723">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="8330008649153752724">
                <link role="variableDeclaration" targetNodeId="8330008649153752710" resolveInfo="p" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="8330008649153752725">
                <link role="baseMethodDeclaration" targetNodeId="3.~Pattern.pattern():java.lang.String" resolveInfo="pattern" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertTrue" id="8330008649153752726">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8330008649153752727">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8330008649153752728">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="8330008649153752729">
                  <link role="variableDeclaration" targetNodeId="8330008649153752710" resolveInfo="p" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="8330008649153752730">
                  <link role="baseMethodDeclaration" targetNodeId="3.~Pattern.matcher(java.lang.CharSequence):java.util.regex.Matcher" resolveInfo="matcher" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="8330008649153752731">
                    <property name="value" value="bwbbbb" />
                  </node>
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="8330008649153752732">
                <link role="baseMethodDeclaration" targetNodeId="3.~Matcher.matches():boolean" resolveInfo="matches" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertFalse" id="8330008649153752733">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8330008649153752734">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8330008649153752735">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="8330008649153752736">
                  <link role="variableDeclaration" targetNodeId="8330008649153752710" resolveInfo="p" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="8330008649153752737">
                  <link role="baseMethodDeclaration" targetNodeId="3.~Pattern.matcher(java.lang.CharSequence):java.util.regex.Matcher" resolveInfo="matcher" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="8330008649153752738">
                    <property name="value" value="bbaabbaacc" />
                  </node>
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="8330008649153752739">
                <link role="baseMethodDeclaration" targetNodeId="3.~Matcher.matches():boolean" resolveInfo="matches" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="8330008649153753025">
        <property name="methodName" value="testAutoBrackets2ormore" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="8330008649153753026" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="8330008649153753027" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="8330008649153753028">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="8330008649153753029">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="8330008649153753030">
              <property name="name" value="p" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="8330008649153753031">
                <link role="classifier" targetNodeId="3.~Pattern" resolveInfo="Pattern" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.regexp.structure.InlineRegexpExpression" id="8330008649153753032">
                <node role="regexp" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp" id="8330008649153753033">
                  <node role="right" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp" id="8330008649153753034">
                    <node role="right" type="jetbrains.mps.baseLanguage.regexp.structure.LineEndRegexp" id="8330008649153753035" />
                    <node role="left" type="jetbrains.mps.baseLanguage.regexp.structure.AtLeastNTimesRegexp" id="8330008649153753060">
                      <property name="n" value="2" />
                      <node role="regexp" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp" id="8330008649153753062">
                        <node role="right" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp" id="8330008649153753063">
                          <link role="symbolClass" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                        </node>
                        <node role="left" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp" id="8330008649153753064">
                          <link role="symbolClass" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="left" type="jetbrains.mps.baseLanguage.regexp.structure.LineStartRegexp" id="8330008649153753040" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="8330008649153753041">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="8330008649153753042">
              <property name="value" value="^(?:\\w\\w){2,}$" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8330008649153753043">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="8330008649153753044">
                <link role="variableDeclaration" targetNodeId="8330008649153753030" resolveInfo="p" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="8330008649153753045">
                <link role="baseMethodDeclaration" targetNodeId="3.~Pattern.pattern():java.lang.String" resolveInfo="pattern" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertTrue" id="8330008649153753046">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8330008649153753047">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8330008649153753048">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="8330008649153753049">
                  <link role="variableDeclaration" targetNodeId="8330008649153753030" resolveInfo="p" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="8330008649153753050">
                  <link role="baseMethodDeclaration" targetNodeId="3.~Pattern.matcher(java.lang.CharSequence):java.util.regex.Matcher" resolveInfo="matcher" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="8330008649153753051">
                    <property name="value" value="bwbb" />
                  </node>
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="8330008649153753052">
                <link role="baseMethodDeclaration" targetNodeId="3.~Matcher.matches():boolean" resolveInfo="matches" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertFalse" id="8330008649153753053">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8330008649153753054">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8330008649153753055">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="8330008649153753056">
                  <link role="variableDeclaration" targetNodeId="8330008649153753030" resolveInfo="p" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="8330008649153753057">
                  <link role="baseMethodDeclaration" targetNodeId="3.~Pattern.matcher(java.lang.CharSequence):java.util.regex.Matcher" resolveInfo="matcher" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="8330008649153753058">
                    <property name="value" value="bb" />
                  </node>
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="8330008649153753059">
                <link role="baseMethodDeclaration" targetNodeId="3.~Matcher.matches():boolean" resolveInfo="matches" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="8330008649153753101">
        <property name="methodName" value="testAutoBrackets2exactly" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="8330008649153753102" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="8330008649153753103" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="8330008649153753104">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="8330008649153753105">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="8330008649153753106">
              <property name="name" value="p" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="8330008649153753107">
                <link role="classifier" targetNodeId="3.~Pattern" resolveInfo="Pattern" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.regexp.structure.InlineRegexpExpression" id="8330008649153753108">
                <node role="regexp" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp" id="8330008649153753109">
                  <node role="right" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp" id="8330008649153753110">
                    <node role="right" type="jetbrains.mps.baseLanguage.regexp.structure.LineEndRegexp" id="8330008649153753111" />
                    <node role="left" type="jetbrains.mps.baseLanguage.regexp.structure.NTimesRegexp" id="8330008649153753137">
                      <property name="n" value="2" />
                      <node role="regexp" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp" id="8330008649153753139">
                        <node role="right" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp" id="8330008649153753140">
                          <link role="symbolClass" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                        </node>
                        <node role="left" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp" id="8330008649153753141">
                          <link role="symbolClass" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="left" type="jetbrains.mps.baseLanguage.regexp.structure.LineStartRegexp" id="8330008649153753116" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="8330008649153753117">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="8330008649153753118">
              <property name="value" value="^(?:\\w\\w){2}$" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8330008649153753119">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="8330008649153753120">
                <link role="variableDeclaration" targetNodeId="8330008649153753106" resolveInfo="p" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="8330008649153753121">
                <link role="baseMethodDeclaration" targetNodeId="3.~Pattern.pattern():java.lang.String" resolveInfo="pattern" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertTrue" id="8330008649153753122">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8330008649153753123">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8330008649153753124">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="8330008649153753125">
                  <link role="variableDeclaration" targetNodeId="8330008649153753106" resolveInfo="p" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="8330008649153753126">
                  <link role="baseMethodDeclaration" targetNodeId="3.~Pattern.matcher(java.lang.CharSequence):java.util.regex.Matcher" resolveInfo="matcher" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="8330008649153753127">
                    <property name="value" value="bwbb" />
                  </node>
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="8330008649153753128">
                <link role="baseMethodDeclaration" targetNodeId="3.~Matcher.matches():boolean" resolveInfo="matches" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertFalse" id="8330008649153753129">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8330008649153753130">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8330008649153753131">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="8330008649153753132">
                  <link role="variableDeclaration" targetNodeId="8330008649153753106" resolveInfo="p" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="8330008649153753133">
                  <link role="baseMethodDeclaration" targetNodeId="3.~Pattern.matcher(java.lang.CharSequence):java.util.regex.Matcher" resolveInfo="matcher" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="8330008649153753134">
                    <property name="value" value="bb" />
                  </node>
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="8330008649153753135">
                <link role="baseMethodDeclaration" targetNodeId="3.~Matcher.matches():boolean" resolveInfo="matches" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

