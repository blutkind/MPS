<?xml version="1.0" encoding="UTF-8"?>
<model name="webr.xmlSchema.constraints">
  <language namespace="jetbrains.mps.bootstrap.constraintsLanguage" />
  <language namespace="jetbrains.mps.baseLanguage" />
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage" />
  <language namespace="jetbrains.mps.baseLanguage.ext.collections.lang" />
  <maxImportIndex value="3" />
  <import index="1" modelUID="webr.xmlSchema.structure" />
  <import index="2" modelUID="jetbrains.mps.core.structure" />
  <import index="3" modelUID="jetbrains.mps.smodel.search@java_stub" />
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptBehavior" id="1178187486639">
    <link role="concept" targetNodeId="1.1172950047361" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptConstructorDeclaration" id="1178187486640">
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1178187486641" />
    </node>
    <node role="properties" type="jetbrains.mps.bootstrap.constraintsLanguage.NodePropertyConstraint" id="1172961273051">
      <link role="applicableProperty" targetNodeId="2.1156235010670" />
      <node role="propertyGetter" type="jetbrains.mps.bootstrap.constraintsLanguage.ConstraintFunction_PropertyGetter" id="1172961280802">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1172961280803">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1172961286354">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1172961286903">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.PropertyGetter_FunctionParm_node" id="1172961286355" />
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1172961290435">
                <link role="property" targetNodeId="1.1172959826115" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptBehavior" id="1178187486654">
    <link role="concept" targetNodeId="1.1167697887602" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptMethodDeclaration" id="1183585492113">
      <property name="name" value="checkAttributes" />
      <link role="overridenMethod" targetNodeId="1183585335179" resolveInfo="checkAttributes" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1183585492115">
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1183585531592">
          <node role="expression" type="jetbrains.mps.baseLanguage.ext.collections.lang.SequenceOperationExpression" id="1183585532393">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1183585531593">
              <link role="variableDeclaration" targetNodeId="1183585499196" resolveInfo="attributeDeclarations" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.AddElementOperation" id="1183585533834">
              <node role="argument" type="jetbrains.mps.bootstrap.constraintsLanguage.ThisNodeExpression" id="1183585538572" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1183585499196">
        <property name="name" value="attributeDeclarations" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1183585499197">
          <link role="elementConcept" targetNodeId="1.1167697887602" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1183585499198" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptConstructorDeclaration" id="1178187486655">
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1178187486656" />
    </node>
    <node role="properties" type="jetbrains.mps.bootstrap.constraintsLanguage.NodePropertyConstraint" id="1167860545649">
      <link role="applicableProperty" targetNodeId="2.1156235010670" />
      <node role="propertyGetter" type="jetbrains.mps.bootstrap.constraintsLanguage.ConstraintFunction_PropertyGetter" id="1167860551447">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1167860551448">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1172950526049">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1167860555381">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.PropertyGetter_FunctionParm_node" id="1167860554911" />
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1167860561788">
                <link role="property" targetNodeId="1.1167698115100" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptBehavior" id="1178187486659">
    <link role="concept" targetNodeId="1.1167597273853" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptConstructorDeclaration" id="1178187486660">
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1178187486661" />
    </node>
    <node role="properties" type="jetbrains.mps.bootstrap.constraintsLanguage.NodePropertyConstraint" id="1167611762778">
      <link role="applicableProperty" targetNodeId="2.1156235010670" />
      <node role="propertyGetter" type="jetbrains.mps.bootstrap.constraintsLanguage.ConstraintFunction_PropertyGetter" id="1167611768451">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1167611768452">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1172950536434">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1167611773159">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.PropertyGetter_FunctionParm_node" id="1167611772720" />
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1167611777394">
                <link role="property" targetNodeId="1.1167597749542" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptBehavior" id="1178187486674">
    <link role="concept" targetNodeId="1.1167838236835" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptMethodDeclaration" id="1183587644932">
      <property name="name" value="getAttributeDeclarations" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1183587648439">
        <link role="elementConcept" targetNodeId="1.1167697887602" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1183587644934">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1183587673507">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1183587673508">
            <property name="name" value="attributeDeclarations" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1183587673509">
              <link role="elementConcept" targetNodeId="1.1167697887602" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.GenericNewExpression" id="1183587664763">
              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListCreator" id="1183587666597">
                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1183587666598">
                  <link role="elementConcept" targetNodeId="1.1167697887602" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1183587681200">
          <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1183587681674">
            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_ConceptMethodCall" id="1183587683588">
              <link role="conceptMethodDeclaration" targetNodeId="1183585335179" resolveInfo="checkAttributes" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1183587685046">
                <link role="variableDeclaration" targetNodeId="1183587673508" resolveInfo="attributeDeclarations" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.ThisNodeExpression" id="1183587681201" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1183587674844">
          <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1183587674845">
            <link role="variableDeclaration" targetNodeId="1183587673508" resolveInfo="attributeDeclarations" />
          </node>
        </node>
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptConstructorDeclaration" id="1178187486675">
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1178187486676" />
    </node>
    <node role="properties" type="jetbrains.mps.bootstrap.constraintsLanguage.NodePropertyConstraint" id="1167534323225">
      <link role="applicableProperty" targetNodeId="2.1156235010670" />
      <node role="propertyGetter" type="jetbrains.mps.bootstrap.constraintsLanguage.ConstraintFunction_PropertyGetter" id="1167534332945">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1167534332946">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1172950532180">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1167534341329">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.PropertyGetter_FunctionParm_node" id="1167534340109" />
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1167534343158">
                <link role="property" targetNodeId="1.1167838788027" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="properties" type="jetbrains.mps.bootstrap.constraintsLanguage.NodePropertyConstraint" id="1172768991363">
      <link role="applicableProperty" targetNodeId="2.1169194664001" />
      <node role="propertyGetter" type="jetbrains.mps.bootstrap.constraintsLanguage.ConstraintFunction_PropertyGetter" id="1172768996317">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1172768996318">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1172950534447">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1172769002067">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.PropertyGetter_FunctionParm_node" id="1172769001394" />
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1172769004006">
                <link role="property" targetNodeId="1.1167838788027" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptBehavior" id="1178187486714">
    <link role="concept" targetNodeId="1.1167710782427" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptConstructorDeclaration" id="1178187486715">
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1178187486716" />
    </node>
    <node role="properties" type="jetbrains.mps.bootstrap.constraintsLanguage.NodePropertyConstraint" id="1167711508987">
      <link role="applicableProperty" targetNodeId="2.1156235010670" />
      <node role="propertyGetter" type="jetbrains.mps.bootstrap.constraintsLanguage.ConstraintFunction_PropertyGetter" id="1167711516582">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1167711516583">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1172950528097">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1167711520431">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.PropertyGetter_FunctionParm_node" id="1167711519633" />
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1167711522823">
                <link role="property" targetNodeId="1.1167710946714" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptBehavior" id="1178187486719">
    <link role="concept" targetNodeId="1.1172948996536" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptConstructorDeclaration" id="1178187486720">
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1178187486721" />
    </node>
    <node role="properties" type="jetbrains.mps.bootstrap.constraintsLanguage.NodePropertyConstraint" id="1172950550406">
      <link role="applicableProperty" targetNodeId="2.1169194664001" />
      <node role="propertyGetter" type="jetbrains.mps.bootstrap.constraintsLanguage.ConstraintFunction_PropertyGetter" id="1172950575440">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1172950575441">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1172950578980">
            <node role="expression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1172950663380">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1172950665774">
                <property name="value" value=" entity set" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1172950579498">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.PropertyGetter_FunctionParm_node" id="1172950578981" />
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1172950580233">
                  <link role="property" targetNodeId="1.1172950400255" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptBehavior" id="1178187486777">
    <link role="concept" targetNodeId="1.1167513239198" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptConstructorDeclaration" id="1178187486778">
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1178187486779" />
    </node>
    <node role="properties" type="jetbrains.mps.bootstrap.constraintsLanguage.NodePropertyConstraint" id="1167755120556">
      <link role="applicableProperty" targetNodeId="2.1169194664001" />
      <node role="propertyGetter" type="jetbrains.mps.bootstrap.constraintsLanguage.ConstraintFunction_PropertyGetter" id="1167755126291">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1167755126292">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1172950538842">
            <node role="expression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1167755135929">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1167755139526">
                <property name="value" value=" schema" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1167755132771">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.PropertyGetter_FunctionParm_node" id="1167755132176" />
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1167755134538">
                  <link role="property" targetNodeId="1.1167754958780" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptBehavior" id="1178187486815">
    <link role="concept" targetNodeId="1.1167615791597" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptMethodDeclaration" id="1183586905683">
      <property name="name" value="checkAttributes" />
      <link role="overridenMethod" targetNodeId="1183585335179" resolveInfo="checkAttributes" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1183586905685">
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1183586936307">
          <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1183586939209">
            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_ConceptMethodCall" id="1183586940433">
              <link role="conceptMethodDeclaration" targetNodeId="1183585335179" resolveInfo="checkAttributes" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1183586941530">
                <link role="variableDeclaration" targetNodeId="1183586911316" resolveInfo="attributeDeclarations" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1183586936717">
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1183586938612">
                <link role="link" targetNodeId="1.1167841515196" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.ThisNodeExpression" id="1183586936308" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1183586911316">
        <property name="name" value="attributeDeclarations" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1183586911317">
          <link role="elementConcept" targetNodeId="1.1167697887602" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1183586911318" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptConstructorDeclaration" id="1178187486816">
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1178187486817" />
    </node>
    <node role="properties" type="jetbrains.mps.bootstrap.constraintsLanguage.NodePropertyConstraint" id="1167711917782">
      <link role="applicableProperty" targetNodeId="2.1156235010670" />
      <node role="propertyGetter" type="jetbrains.mps.bootstrap.constraintsLanguage.ConstraintFunction_PropertyGetter" id="1167711923470">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1167711923471">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1172950530006">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1167711927397">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.PropertyGetter_FunctionParm_node" id="1167711927037" />
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1167711934695">
                <link role="property" targetNodeId="1.1167615988144" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptBehavior" id="1178194664950">
    <link role="concept" targetNodeId="1.1167513851570" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptConstructorDeclaration" id="1178194664951">
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1178194664952" />
    </node>
    <node role="defaultScope" type="jetbrains.mps.bootstrap.constraintsLanguage.NodeDefaultSearchScope" id="1178194675164">
      <link role="referentConcept" targetNodeId="1.1167513851570" />
      <node role="searchScopeFactory" type="jetbrains.mps.bootstrap.constraintsLanguage.ConstraintFunction_ReferentSearchScope_Factory" id="1178194675165">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1178194675166">
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1178194675167">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1178194675168">
              <property name="name" value="schema" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1178194675169">
                <link role="concept" targetNodeId="1.1167513239198" />
              </node>
              <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1178194675170">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetAncestorOperation" id="1178194675171">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.OperationParm_Inclusion" id="1178194675172" />
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.OperationParm_Concept" id="1178194675173">
                    <link role="concept" targetNodeId="1.1167513239198" />
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptParameter_ReferentSearchScope_enclosingNode" id="1178194675174" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1178194675175">
            <node role="expression" type="jetbrains.mps.baseLanguage.NewExpression" id="1178194675176">
              <link role="baseMethodDeclaration" extResolveInfo="3.constructor [Classifier]SubnodesSearchScope[ConstructorDeclaration] ((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SNode]))" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1178194675177">
                <link role="variableDeclaration" targetNodeId="1178194675168" resolveInfo="schema" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="searchScopeCanCreate" type="jetbrains.mps.bootstrap.constraintsLanguage.ConstraintFunction_ReferentSearchScope_CanCreate" id="1178194675178">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1178194675179">
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1178194675180">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1178194675181">
              <property name="name" value="schema" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1178194675182">
                <link role="concept" targetNodeId="1.1167513239198" />
              </node>
              <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1178194675183">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetAncestorOperation" id="1178194675184">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.OperationParm_Inclusion" id="1178194675185" />
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.OperationParm_Concept" id="1178194675186">
                    <link role="concept" targetNodeId="1.1167513239198" />
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptParameter_ReferentSearchScope_enclosingNode" id="1178194675187" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1178194675188">
            <node role="expression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1178194675189">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1178194675190" />
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1178194675191">
                <link role="variableDeclaration" targetNodeId="1178194675181" resolveInfo="schema" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptBehavior" id="1183585307833">
    <link role="concept" targetNodeId="1.1183585239137" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptMethodDeclaration" id="1183585335179">
      <property name="isVirtual" value="true" />
      <property name="isAbstract" value="true" />
      <property name="name" value="checkAttributes" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1183585345759">
        <property name="name" value="attributeDeclarations" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1183585347829">
          <link role="elementConcept" targetNodeId="1.1167697887602" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1183585337727" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1183585335181" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptConstructorDeclaration" id="1183585307834">
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1183585307835" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptBehavior" id="1183585662244">
    <link role="concept" targetNodeId="1.1167711418665" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptMethodDeclaration" id="1183585664468">
      <property name="name" value="checkAttributes" />
      <link role="overridenMethod" targetNodeId="1183585335179" resolveInfo="checkAttributes" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1183585664470">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1183585719548">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1183585719549">
            <property name="name" value="attributeExpressions" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1183585719550">
              <link role="elementConcept" targetNodeId="1.1167711059994" />
            </node>
            <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1183585713450">
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkListAccessAsList" id="1183585716391">
                <link role="link" targetNodeId="1.1167711088999" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1183585710884">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1183585712856">
                  <link role="link" targetNodeId="1.1167711433182" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.ThisNodeExpression" id="1183585710461" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.ForEachStatement" id="1183585721724">
          <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.ForEachVariable" id="1183585721725">
            <property name="name" value="attributeExpression" />
          </node>
          <node role="inputSequence" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1183585724978">
            <link role="variableDeclaration" targetNodeId="1183585719549" resolveInfo="attributeExpressions" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1183585721727">
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1183585806000">
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1183585806677">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_ConceptMethodCall" id="1183585809151">
                  <link role="conceptMethodDeclaration" targetNodeId="1183585335179" resolveInfo="checkAttributes" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1183585815952">
                    <link role="variableDeclaration" targetNodeId="1183585682534" resolveInfo="attributeDeclarations" />
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.ext.collections.lang.ForEachVariableReference" id="1183585806001">
                  <link role="variable" targetNodeId="1183585721725" resolveInfo="attributeExpression" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1183585682534">
        <property name="name" value="attributeDeclarations" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1183585682535">
          <link role="elementConcept" targetNodeId="1.1167697887602" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1183585682536" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptConstructorDeclaration" id="1183585662245">
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1183585662246" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptBehavior" id="1183586042765">
    <link role="concept" targetNodeId="1.1167794310821" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptMethodDeclaration" id="1183586044893">
      <property name="name" value="checkAttributes" />
      <link role="overridenMethod" targetNodeId="1183585335179" resolveInfo="checkAttributes" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1183586044895">
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1183586199277">
          <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1183586218877">
            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_ConceptMethodCall" id="1183586220583">
              <link role="conceptMethodDeclaration" targetNodeId="1183585335179" resolveInfo="checkAttributes" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1183586222146">
                <link role="variableDeclaration" targetNodeId="1183586049255" resolveInfo="attributeDeclarations" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1183586199685">
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1183586205954">
                <link role="link" targetNodeId="1.1167794765257" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.ThisNodeExpression" id="1183586199278" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1183586049255">
        <property name="name" value="attributeDeclarations" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1183586049256">
          <link role="elementConcept" targetNodeId="1.1167697887602" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1183586049257" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptMethodDeclaration" id="1183589777679">
      <property name="name" value="checkElements" />
      <link role="overridenMethod" targetNodeId="1183589342800" resolveInfo="checkElements" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1183589777681">
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1183589807468">
          <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1183589810787">
            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_ConceptMethodCall" id="1183589812337">
              <link role="conceptMethodDeclaration" targetNodeId="1183589342800" resolveInfo="checkElements" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1183589813322">
                <link role="variableDeclaration" targetNodeId="1183589784385" resolveInfo="elementDeclarations" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1183589807892">
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1183589810192">
                <link role="link" targetNodeId="1.1167794765257" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.ThisNodeExpression" id="1183589807469" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1183589784385">
        <property name="name" value="elementDeclarations" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1183589784386">
          <link role="elementConcept" targetNodeId="1.1167838236835" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1183589784387" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptConstructorDeclaration" id="1183586042766">
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1183586042767" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptBehavior" id="1183586299280">
    <link role="concept" targetNodeId="1.1167618352310" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptMethodDeclaration" id="1183586300861">
      <property name="name" value="checkAttributes" />
      <link role="overridenMethod" targetNodeId="1183585335179" resolveInfo="checkAttributes" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1183586300863">
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1183586340182">
          <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1183586343204">
            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_ConceptMethodCall" id="1183586344410">
              <link role="conceptMethodDeclaration" targetNodeId="1183585335179" resolveInfo="checkAttributes" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1183586346036">
                <link role="variableDeclaration" targetNodeId="1183586304645" resolveInfo="attributeDeclarations" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1183586340591">
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1183586342672">
                <link role="link" targetNodeId="1.1167797649631" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.ThisNodeExpression" id="1183586340183" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1183586304645">
        <property name="name" value="attributeDeclarations" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1183586304646">
          <link role="elementConcept" targetNodeId="1.1167697887602" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1183586304647" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptMethodDeclaration" id="1183589838823">
      <property name="name" value="checkElements" />
      <link role="overridenMethod" targetNodeId="1183589342800" resolveInfo="checkElements" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1183589838825">
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1183589942940">
          <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1183590008372">
            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_ConceptMethodCall" id="1183590010188">
              <link role="conceptMethodDeclaration" targetNodeId="1183589342800" resolveInfo="checkElements" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1183590011173">
                <link role="variableDeclaration" targetNodeId="1183589842920" resolveInfo="elementDeclarations" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1183589948149">
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1183589950027">
                <link role="link" targetNodeId="1.1167790582664" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1183589943395">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1183589946507">
                  <link role="link" targetNodeId="1.1167851034776" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.ThisNodeExpression" id="1183589942941" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1183589842920">
        <property name="name" value="elementDeclarations" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1183589842921">
          <link role="elementConcept" targetNodeId="1.1167838236835" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1183589842922" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptConstructorDeclaration" id="1183586299281">
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1183586299282" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptBehavior" id="1183586583188">
    <link role="concept" targetNodeId="1.1167795596947" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptMethodDeclaration" id="1183586584676">
      <property name="name" value="checkAttributes" />
      <link role="overridenMethod" targetNodeId="1183585335179" resolveInfo="checkAttributes" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1183586584678">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1183586609736">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1183586609737">
            <property name="name" value="typeExpressions" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1183586609738">
              <link role="elementConcept" targetNodeId="1.1167590960646" />
            </node>
            <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1183586604982">
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkListAccessAsList" id="1183586607203">
                <link role="link" targetNodeId="1.1167795626698" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.ThisNodeExpression" id="1183586604559" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.ForEachStatement" id="1183586611380">
          <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.ForEachVariable" id="1183586611381">
            <property name="name" value="typeExpression" />
          </node>
          <node role="inputSequence" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1183586612947">
            <link role="variableDeclaration" targetNodeId="1183586609737" resolveInfo="typeExpressions" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1183586611383">
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1183586619496">
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1183586619998">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_ConceptMethodCall" id="1183586621235">
                  <link role="conceptMethodDeclaration" targetNodeId="1183585335179" resolveInfo="checkAttributes" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1183586622595">
                    <link role="variableDeclaration" targetNodeId="1183586588366" resolveInfo="attributeDeclarations" />
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.ext.collections.lang.ForEachVariableReference" id="1183586619497">
                  <link role="variable" targetNodeId="1183586611381" resolveInfo="typeExpression" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1183586588366">
        <property name="name" value="attributeDeclarations" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1183586588367">
          <link role="elementConcept" targetNodeId="1.1167697887602" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1183586588368" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptMethodDeclaration" id="1183589609729">
      <property name="name" value="checkElements" />
      <link role="overridenMethod" targetNodeId="1183589342800" resolveInfo="checkElements" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1183589609731">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1183589738144">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1183589738145">
            <property name="name" value="typeExpressions" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1183589738146">
              <link role="elementConcept" targetNodeId="1.1167590960646" />
            </node>
            <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1183589733509">
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkListAccessAsList" id="1183589735468">
                <link role="link" targetNodeId="1.1167795626698" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.ThisNodeExpression" id="1183589733133" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.ForEachStatement" id="1183589739679">
          <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.ForEachVariable" id="1183589739680">
            <property name="name" value="typeExpression" />
          </node>
          <node role="inputSequence" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1183589740999">
            <link role="variableDeclaration" targetNodeId="1183589738145" resolveInfo="typeExpressions" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1183589739682">
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1183589747410">
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1183589747900">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_ConceptMethodCall" id="1183589749390">
                  <link role="conceptMethodDeclaration" targetNodeId="1183589342800" resolveInfo="checkElements" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1183589751750">
                    <link role="variableDeclaration" targetNodeId="1183589614704" resolveInfo="elementDeclarations" />
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.ext.collections.lang.ForEachVariableReference" id="1183589747411">
                  <link role="variable" targetNodeId="1183589739680" resolveInfo="typeExpression" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1183589614704">
        <property name="name" value="elementDeclarations" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1183589614705">
          <link role="elementConcept" targetNodeId="1.1167838236835" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1183589614706" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptConstructorDeclaration" id="1183586583189">
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1183586583190" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptBehavior" id="1183587083588">
    <link role="concept" targetNodeId="1.1167512696010" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptMethodDeclaration" id="1183587085138">
      <property name="name" value="checkAttributes" />
      <link role="overridenMethod" targetNodeId="1183585335179" resolveInfo="checkAttributes" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1183587085140">
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1183587100176">
          <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1183587104166">
            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_ConceptMethodCall" id="1183587105232">
              <link role="conceptMethodDeclaration" targetNodeId="1183585335179" resolveInfo="checkAttributes" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1183587106155">
                <link role="variableDeclaration" targetNodeId="1183587088469" resolveInfo="attributeDeclarations" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1183587100522">
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1183587103681">
                <link role="link" targetNodeId="1.1167842409344" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.ThisNodeExpression" id="1183587100177" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1183587088469">
        <property name="name" value="attributeDeclarations" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1183587088470">
          <link role="elementConcept" targetNodeId="1.1167697887602" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1183587088471" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptConstructorDeclaration" id="1183587083589">
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1183587083590" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptBehavior" id="1183587113750">
    <link role="concept" targetNodeId="1.1167838362804" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptMethodDeclaration" id="1183587115253">
      <property name="name" value="checkAttributes" />
      <link role="overridenMethod" targetNodeId="1183585335179" resolveInfo="checkAttributes" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1183587115255">
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1183587126197">
          <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1183587131348">
            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_ConceptMethodCall" id="1183587132929">
              <link role="conceptMethodDeclaration" targetNodeId="1183585335179" resolveInfo="checkAttributes" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1183587134195">
                <link role="variableDeclaration" targetNodeId="1183587118537" resolveInfo="attributeDeclarations" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1183587128844">
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1183587130925">
                <link role="link" targetNodeId="1.1167790582664" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1183587126590">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1183587128202">
                  <link role="link" targetNodeId="1.1167839503230" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.ThisNodeExpression" id="1183587126198" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1183587118537">
        <property name="name" value="attributeDeclarations" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1183587118538">
          <link role="elementConcept" targetNodeId="1.1167697887602" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1183587118539" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptConstructorDeclaration" id="1183587113751">
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1183587113752" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptBehavior" id="1183589341047">
    <link role="concept" targetNodeId="1.1183589255096" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptMethodDeclaration" id="1183589342800">
      <property name="isVirtual" value="true" />
      <property name="isAbstract" value="true" />
      <property name="name" value="checkElements" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1183589344788" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1183589342802" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1183589374368">
        <property name="name" value="elementDeclarations" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1183589374369">
          <link role="elementConcept" targetNodeId="1.1167838236835" />
        </node>
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptConstructorDeclaration" id="1183589341048">
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1183589341049" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptBehavior" id="1183589565903">
    <link role="concept" targetNodeId="1.1167530070286" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptMethodDeclaration" id="1183589567969">
      <property name="name" value="checkElements" />
      <link role="overridenMethod" targetNodeId="1183589342800" resolveInfo="checkElements" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1183589567971">
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1183589630304">
          <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1183589632873">
            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_ConceptMethodCall" id="1183589635095">
              <link role="conceptMethodDeclaration" targetNodeId="1183589342800" resolveInfo="checkElements" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1183589636939">
                <link role="variableDeclaration" targetNodeId="1183589572972" resolveInfo="elementDeclarations" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1183589630728">
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1183589632309">
                <link role="link" targetNodeId="1.1167797203049" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.ThisNodeExpression" id="1183589630305" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1183589572972">
        <property name="name" value="elementDeclarations" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1183589572973">
          <link role="elementConcept" targetNodeId="1.1167838236835" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1183589572974" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptConstructorDeclaration" id="1183589565904">
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1183589565905" />
    </node>
  </node>
</model>

