<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.regexp.sandbox">
  <language namespace="jetbrains.mps.baseLanguage" />
  <language namespace="jetbrains.mps.regexp" />
  <maxImportIndex value="4" />
  <import index="1" modelUID="java.util.regex@java_stub" />
  <import index="2" modelUID="java.lang@java_stub" />
  <import index="3" modelUID="java.io@java_stub" />
  <import index="4" modelUID="jetbrains.mps.regexp.jetbrains.mps.regexp.accessory" />
  <node type="jetbrains.mps.regexp.RegexpDeclaration" id="1174484236394">
    <property name="description" value="word" />
    <property name="name" value="Sample" />
    <node role="regexp" type="jetbrains.mps.regexp.MatchParensRegexp" id="1174921482465">
      <property name="name" value="word" />
      <node role="regexp" type="jetbrains.mps.regexp.PlusRegexp" id="1174921488191">
        <node role="regexp" type="jetbrains.mps.regexp.PredefinedSymbolClassRegexp" id="1174921486259">
          <link role="symbolClass" targetNodeId="4.1174554738336" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.ClassConcept" id="1174510621720">
    <property name="name" value="Sandobx" />
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1174510626802">
      <property name="name" value="main" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1174510628289" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1174510626804">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1174564396602">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1174564396603">
            <property name="name" value="email" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1174564396604">
              <link role="classifier" extResolveInfo="2.[Classifier]String" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.StringLiteral" id="1174564398746">
              <property name="value" value="kostik@jetbrains.com" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.regexp.MatchRegexpStatement" id="1174564406608">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1174564406609">
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1174565132150">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1174565136407">
                <link role="baseMethodDeclaration" extResolveInfo="3.method ([Classifier]PrintStream).([InstanceMethodDeclaration]println((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String])) : (jetbrains.mps.baseLanguage.types.void/jetbrains.mps.baseLanguage.types.void))" />
                <node role="instance" type="jetbrains.mps.baseLanguage.StaticFieldReference" id="1174565132151">
                  <link role="classifier" extResolveInfo="2.[Classifier]System" />
                  <link role="variableDeclaration" extResolveInfo="2.static field ([Classifier]System).([StaticFieldDeclaration]out : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [PrintStream]))" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.PlusExpression" id="1174565140237">
                  <node role="rightExpression" type="jetbrains.mps.regexp.MatchVariableReference" id="1174565142240">
                    <link role="match" targetNodeId="1174564423490" resolveInfo="user" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1174565137440">
                    <property name="value" value="User name = " />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1174565147430">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1174565151606">
                <link role="baseMethodDeclaration" extResolveInfo="3.method ([Classifier]PrintStream).([InstanceMethodDeclaration]println((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String])) : (jetbrains.mps.baseLanguage.types.void/jetbrains.mps.baseLanguage.types.void))" />
                <node role="instance" type="jetbrains.mps.baseLanguage.StaticFieldReference" id="1174565147431">
                  <link role="classifier" extResolveInfo="2.[Classifier]System" />
                  <link role="variableDeclaration" extResolveInfo="2.static field ([Classifier]System).([StaticFieldDeclaration]out : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [PrintStream]))" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.PlusExpression" id="1174565162248">
                  <node role="rightExpression" type="jetbrains.mps.regexp.MatchVariableReference" id="1174565163423">
                    <link role="match" targetNodeId="1174564477096" resolveInfo="domain" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1174565152388">
                    <property name="value" value="Domain = " />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.regexp.MatchRegexpStatement" id="1174654916182">
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1174654916183">
                <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1174654933630">
                  <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1174654938576">
                    <link role="baseMethodDeclaration" extResolveInfo="3.method ([Classifier]PrintStream).([InstanceMethodDeclaration]println((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String])) : (jetbrains.mps.baseLanguage.types.void/jetbrains.mps.baseLanguage.types.void))" />
                    <node role="instance" type="jetbrains.mps.baseLanguage.StaticFieldReference" id="1174654933631">
                      <link role="classifier" extResolveInfo="2.[Classifier]System" />
                      <link role="variableDeclaration" extResolveInfo="2.static field ([Classifier]System).([StaticFieldDeclaration]out : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [PrintStream]))" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.PlusExpression" id="1174655085990">
                      <node role="rightExpression" type="jetbrains.mps.regexp.MatchVariableReference" id="1174655089821">
                        <link role="match" targetNodeId="1174654922689" resolveInfo="abdef" />
                      </node>
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1174654939577">
                        <property name="value" value="never happens" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="expr" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1174654917733">
                <link role="variableDeclaration" targetNodeId="1174564396603" resolveInfo="email" />
              </node>
              <node role="regexp" type="jetbrains.mps.regexp.InlineRegexpExpression" id="1174654919765">
                <node role="regexp" type="jetbrains.mps.regexp.MatchParensRegexp" id="1174654922689">
                  <property name="name" value="abdef" />
                  <node role="regexp" type="jetbrains.mps.regexp.StringLiteralRegexp" id="1174654928520">
                    <property name="text" value="abddef" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="expr" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1174564408549">
            <link role="variableDeclaration" targetNodeId="1174564396603" resolveInfo="email" />
          </node>
          <node role="regexp" type="jetbrains.mps.regexp.InlineRegexpExpression" id="1174564411128">
            <node role="regexp" type="jetbrains.mps.regexp.SeqRegexp" id="1174564473109">
              <node role="left" type="jetbrains.mps.regexp.MatchParensRegexp" id="1174564423490">
                <property name="name" value="user" />
                <node role="regexp" type="jetbrains.mps.regexp.PlusRegexp" id="1174564466247">
                  <node role="regexp" type="jetbrains.mps.regexp.PredefinedSymbolClassRegexp" id="1174564465011">
                    <link role="symbolClass" targetNodeId="4.1174554738336" />
                  </node>
                </node>
              </node>
              <node role="right" type="jetbrains.mps.regexp.SeqRegexp" id="1174564477095">
                <node role="left" type="jetbrains.mps.regexp.StringLiteralRegexp" id="1174564473110">
                  <property name="text" value="@" />
                </node>
                <node role="right" type="jetbrains.mps.regexp.MatchParensRegexp" id="1174564477096">
                  <property name="name" value="domain" />
                  <node role="regexp" type="jetbrains.mps.regexp.SeqRegexp" id="1174564499012">
                    <node role="left" type="jetbrains.mps.regexp.ParensRegexp" id="1174564483520">
                      <node role="expr" type="jetbrains.mps.regexp.SeqRegexp" id="1174564492791">
                        <node role="left" type="jetbrains.mps.regexp.PlusRegexp" id="1174564490226">
                          <node role="regexp" type="jetbrains.mps.regexp.PredefinedSymbolClassRegexp" id="1174564488757">
                            <link role="symbolClass" targetNodeId="4.1174554738336" />
                          </node>
                        </node>
                        <node role="right" type="jetbrains.mps.regexp.StringLiteralRegexp" id="1174564492792">
                          <property name="text" value="." />
                        </node>
                      </node>
                    </node>
                    <node role="right" type="jetbrains.mps.regexp.PlusRegexp" id="1174564499920">
                      <node role="regexp" type="jetbrains.mps.regexp.PredefinedSymbolClassRegexp" id="1174564499013">
                        <link role="symbolClass" targetNodeId="4.1174554738336" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.regexp.MatchRegexpStatement" id="1174911774409">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1174911774410" />
          <node role="expr" type="jetbrains.mps.baseLanguage.StringLiteral" id="1174911775897">
            <property name="value" value="bcde" />
          </node>
          <node role="regexp" type="jetbrains.mps.regexp.InlineRegexpExpression" id="1174911781164">
            <node role="regexp" type="jetbrains.mps.regexp.SeqRegexp" id="1174911795826">
              <node role="left" type="jetbrains.mps.regexp.MatchParensRegexp" id="1174911786604">
                <property name="name" value="abc" />
                <node role="regexp" type="jetbrains.mps.regexp.StringLiteralRegexp" id="1174911790856">
                  <property name="text" value="abc" />
                </node>
              </node>
              <node role="right" type="jetbrains.mps.regexp.ParensRegexp" id="1174911795827">
                <node role="expr" type="jetbrains.mps.regexp.OrRegexp" id="1174911799986">
                  <node role="left" type="jetbrains.mps.regexp.StringLiteralRegexp" id="1174911798032">
                    <property name="text" value="a" />
                  </node>
                  <node role="right" type="jetbrains.mps.regexp.OrRegexp" id="1174911811713">
                    <node role="left" type="jetbrains.mps.regexp.StringLiteralRegexp" id="1174911803353">
                      <property name="text" value="b" />
                    </node>
                    <node role="right" type="jetbrains.mps.regexp.MatchVariableReferenceRegexp" id="1174911815639">
                      <link role="match" targetNodeId="1174911786604" resolveInfo="abc" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1174657478685">
          <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1174657478984">
            <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1174657478686">
              <link role="variableDeclaration" targetNodeId="1174564396603" resolveInfo="email" />
            </node>
            <node role="rValue" type="jetbrains.mps.regexp.ReplaceWithRegexpExpression" id="1174657590412">
              <node role="expr" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1174657607249">
                <link role="variableDeclaration" targetNodeId="1174564396603" resolveInfo="email" />
              </node>
              <node role="replaceBlock" type="jetbrains.mps.regexp.ReplaceBlock" id="1174657590414">
                <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1174657590415">
                  <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1174659360255">
                    <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1174659360788">
                      <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1174659360256">
                        <link role="variableDeclaration" targetNodeId="1174564396603" resolveInfo="email" />
                      </node>
                      <node role="rValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1174659362695">
                        <link role="variableDeclaration" targetNodeId="1174564396603" resolveInfo="email" />
                      </node>
                    </node>
                  </node>
                  <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1174657609813">
                    <node role="expression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1174659729958">
                      <node role="rightExpression" type="jetbrains.mps.regexp.MatchVariableReference" id="1174659730883">
                        <link role="match" targetNodeId="1174657603512" resolveInfo="user" />
                      </node>
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1174659317441">
                        <property name="value" value="abcdef" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="regexp" type="jetbrains.mps.regexp.InlineRegexpExpression" id="1174657595933">
                <node role="regexp" type="jetbrains.mps.regexp.MatchParensRegexp" id="1174657603512">
                  <property name="name" value="user" />
                  <node role="regexp" type="jetbrains.mps.regexp.PlusRegexp" id="1174657603513">
                    <node role="regexp" type="jetbrains.mps.regexp.PredefinedSymbolClassRegexp" id="1174657603514">
                      <link role="symbolClass" targetNodeId="4.1174554738336" />
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
  <node type="jetbrains.mps.baseLanguage.ClassConcept" id="1174905433848">
    <property name="name" value="XXX" />
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1174905437286">
      <property name="name" value="test" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1174905449612" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1174913792745">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1174913794122">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1174913794123">
            <property name="name" value="s" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1174913794124">
              <link role="classifier" extResolveInfo="2.[Classifier]String" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.StringLiteral" id="1174913795985">
              <property name="value" value="quaqua" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.regexp.MatchRegexpStatement" id="1174913804740">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1174913804741" />
          <node role="expr" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1174913806947">
            <link role="variableDeclaration" targetNodeId="1174913794123" resolveInfo="s" />
          </node>
          <node role="regexp" type="jetbrains.mps.regexp.InlineRegexpExpression" id="1174913809089">
            <node role="regexp" type="jetbrains.mps.regexp.SeqRegexp" id="1174914122881">
              <node role="right" type="jetbrains.mps.regexp.MatchVariableReferenceRegexp" id="1174914122882">
                <link role="match" targetNodeId="1174913813747" resolveInfo="1st" />
              </node>
              <node role="left" type="jetbrains.mps.regexp.MatchParensRegexp" id="1174913813747">
                <property name="name" value="1st" />
                <node role="regexp" type="jetbrains.mps.regexp.PlusRegexp" id="1174913825875">
                  <node role="regexp" type="jetbrains.mps.regexp.PredefinedSymbolClassRegexp" id="1174913824077">
                    <link role="symbolClass" targetNodeId="4.1174554738336" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.ClassConcept" id="1174921457453">
    <property name="name" value="YYY" />
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1174921462032">
      <property name="name" value="m" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1174921462033" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1174921462034">
        <node role="statement" type="jetbrains.mps.regexp.MatchRegexpStatement" id="1174921494020">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1174921494021">
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1174921854379">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1174921858902">
                <link role="baseMethodDeclaration" extResolveInfo="3.method ([Classifier]PrintStream).([InstanceMethodDeclaration]println((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String])) : (jetbrains.mps.baseLanguage.types.void/jetbrains.mps.baseLanguage.types.void))" />
                <node role="instance" type="jetbrains.mps.baseLanguage.StaticFieldReference" id="1174921854380">
                  <link role="classifier" extResolveInfo="2.[Classifier]System" />
                  <link role="variableDeclaration" extResolveInfo="2.static field ([Classifier]System).([StaticFieldDeclaration]out : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [PrintStream]))" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.PlusExpression" id="1174921867810">
                  <node role="rightExpression" type="jetbrains.mps.regexp.MatchVariableReference" id="1174921868829">
                    <link role="match" targetNodeId="1174921482465" resolveInfo="word" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1174921859403">
                    <property name="value" value="word : " />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="expr" type="jetbrains.mps.baseLanguage.StringLiteral" id="1174921495415">
            <property name="value" value="abc" />
          </node>
          <node role="regexp" type="jetbrains.mps.regexp.InlineRegexpExpression" id="1174921498634">
            <node role="regexp" type="jetbrains.mps.regexp.RegexpDeclarationReferenceRegexp" id="1174921508056">
              <link role="regexp" targetNodeId="1174484236394" resolveInfo="Sample" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.regexp.Regexps" id="1174921878564">
    <property name="name" value="ABc" />
    <node role="regexp" type="jetbrains.mps.regexp.RegexpDeclaration" id="1174921880690">
      <property name="name" value="cde" />
      <node role="regexp" type="jetbrains.mps.regexp.MatchParensRegexp" id="1174921885036">
        <property name="name" value="somename" />
        <node role="regexp" type="jetbrains.mps.regexp.StringLiteralRegexp" id="1174922977145">
          <property name="text" value="abc" />
        </node>
      </node>
    </node>
  </node>
</model>

