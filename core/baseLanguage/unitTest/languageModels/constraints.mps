<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:1222075024082(jetbrains.mps.baseLanguage.unitTest.constraints)">
  <persistence version="3" />
  <refactoringHistory />
  <language namespace="jetbrains.mps.bootstrap.constraintsLanguage">
    <languageAspect modelUID="r:1222075024135(jetbrains.mps.bootstrap.constraintsLanguage.constraints)" version="9" />
    <languageAspect modelUID="r:1222075024141(jetbrains.mps.bootstrap.constraintsLanguage.structure)" version="0" />
  </language>
  <language namespace="jetbrains.mps.baseLanguage">
    <languageAspect modelUID="r:1222075024065(jetbrains.mps.baseLanguage.constraints)" version="83" />
    <languageAspect modelUID="r:1222075024074(jetbrains.mps.baseLanguage.structure)" version="0" />
  </language>
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage">
    <languageAspect modelUID="r:1222075024123(jetbrains.mps.bootstrap.smodelLanguage.constraints)" version="21" />
    <languageAspect modelUID="r:1222075024129(jetbrains.mps.bootstrap.smodelLanguage.structure)" version="1" />
  </language>
  <language namespace="jetbrains.mps.baseLanguage.ext.collections.lang">
    <languageAspect modelUID="r:1222075024168(jetbrains.mps.baseLanguage.ext.collections.lang.constraints)" version="6" />
    <languageAspect modelUID="r:1222075024174(jetbrains.mps.baseLanguage.ext.collections.lang.structure)" version="1" />
  </language>
  <languageAspect modelUID="r:1222075024184(jetbrains.mps.closures.structure)" version="0" />
  <languageAspect modelUID="r:1222075024012(jetbrains.mps.bootstrap.structureLanguage.constraints)" version="11" />
  <languageAspect modelUID="r:1222075024058(jetbrains.mps.bootstrap.sharedConcepts.constraints)" version="0" />
  <languageAspect modelUID="r:1222075024082(jetbrains.mps.baseLanguage.unitTest.constraints)" version="1" />
  <languageAspect modelUID="r:1222075024180(jetbrains.mps.closures.constraints)" version="2" />
  <languageAspect modelUID="r:1222075024003(jetbrains.mps.core.constraints)" version="2" />
  <languageAspect modelUID="r:1222075024356(jetbrains.mps.internal.collections.constraints)" version="2" />
  <maxImportIndex value="3" />
  <import index="1" modelUID="r:1222075024087(jetbrains.mps.baseLanguage.unitTest.structure)" version="-1" />
  <import index="2" modelUID="r:1222075024008(jetbrains.mps.core.structure)" version="-1" />
  <import index="3" modelUID="r:1222075024074(jetbrains.mps.baseLanguage.structure)" version="0" />
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstraints" id="1213104846868">
    <link role="concept" targetNodeId="1.1171931851043" resolveInfo="BTestCase" />
    <node role="property" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodePropertyConstraint" id="1213104846869">
      <link role="applicableProperty" targetNodeId="2.1169194664001" resolveInfo="name" />
      <node role="propertyGetter" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_PropertyGetter" id="1213104846870">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213104846871">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213104846872">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1213104846873">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213104846874">
                <property name="value" value="_Test" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213104846875">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintsFunctionParameter_node" id="1213104846876" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1213104846877">
                  <link role="property" targetNodeId="1.1171931851045" resolveInfo="testCaseName" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstraints" id="1213104847596">
    <link role="concept" targetNodeId="1.1171931690126" resolveInfo="TestMethod" />
    <node role="property" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodePropertyConstraint" id="1213104847597">
      <link role="applicableProperty" targetNodeId="2.1169194664001" resolveInfo="name" />
      <node role="propertyGetter" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_PropertyGetter" id="1213104847598">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213104847599">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213104847600">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1213104847601">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213104847602">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintsFunctionParameter_node" id="1213104847603" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1213104847604">
                  <link role="property" targetNodeId="1.1171931690128" resolveInfo="methodName" />
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213104847605">
                <property name="value" value="test_" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

