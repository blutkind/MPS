<?xml version="1.0" encoding="UTF-8"?>
<model name="treepath_dom">
  <language namespace="jetbrains.mps.baseLanguage" />
  <language namespace="ypath" />
  <language namespace="jetbrains.mps.baseLanguage.ext.collections.lang" />
  <maxImportIndex value="4" />
  <import index="1" modelUID="org.w3c.dom@java_stub" />
  <import index="2" modelUID="ypath.util.xml@java_stub" />
  <import index="4" modelUID="java.lang@java_stub" />
  <node type="ypath.TreePathAspect" id="1175083364493">
    <property name="name" value="DOM" />
    <node role="nodeKinds" type="ypath.TreeNodeKind" id="1175164209843">
      <property name="name" value="ELEMENT" />
      <node role="properties" type="ypath.TreeNodeKindProperty" id="1175164263587">
        <property name="name" value="tag" />
        <property name="default" value="true" />
        <node role="getter" type="ypath.PropertyGetter" id="1175164263588">
          <node role="parameter" type="ypath.LambdaMethodParameter" id="1175164263589">
            <property name="name" value="e" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1175164263590">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1175164272473">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1175164299976">
                <link role="baseMethodDeclaration" extResolveInfo="1.method ([Classifier]Element).([InstanceMethodDeclaration]getTagName() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String]))" />
                <node role="instance" type="jetbrains.mps.baseLanguage.ParenthesizedExpression" id="1175164286501">
                  <node role="expression" type="jetbrains.mps.baseLanguage.CastExpression" id="1175164289107">
                    <node role="expression" type="jetbrains.mps.baseLanguage.ClosureParameterReference" id="1175164295561">
                      <link role="closureParameter" targetNodeId="1175164263589" resolveInfo="e" />
                    </node>
                    <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1175164292940">
                      <link role="classifier" extResolveInfo="1.[Classifier]Element" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="trigger" type="ypath.KindBlock" id="1175164209844">
        <node role="parameter" type="ypath.LambdaMethodParameter" id="1175164209845">
          <property name="name" value="e" />
        </node>
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1175164209846">
          <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1175164227033">
            <node role="expression" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1175164239775">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.ClosureParameterReference" id="1175164231491">
                <link role="closureParameter" targetNodeId="1175164209845" resolveInfo="e" />
              </node>
              <node role="classType" type="jetbrains.mps.baseLanguage.ClassifierType" id="1175164244042">
                <link role="classifier" extResolveInfo="1.[Classifier]Element" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="nodeKinds" type="ypath.TreeNodeKind" id="1175253044037">
      <property name="name" value="ATTR" />
      <node role="properties" type="ypath.TreeNodeKindProperty" id="1175253104657">
        <property name="name" value="name" />
        <property name="default" value="false" />
        <node role="getter" type="ypath.PropertyGetter" id="1175253104658">
          <node role="parameter" type="ypath.LambdaMethodParameter" id="1175253104659">
            <property name="name" value="a" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1175253104660">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1175253111077">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1175253127331">
                <link role="baseMethodDeclaration" extResolveInfo="1.method ([Classifier]Attr).([InstanceMethodDeclaration]getName() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String]))" />
                <node role="instance" type="jetbrains.mps.baseLanguage.ParenthesizedExpression" id="1175253113937">
                  <node role="expression" type="jetbrains.mps.baseLanguage.CastExpression" id="1175253116171">
                    <node role="expression" type="jetbrains.mps.baseLanguage.ClosureParameterReference" id="1175253120838">
                      <link role="closureParameter" targetNodeId="1175253104659" resolveInfo="a" />
                    </node>
                    <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1175253117657">
                      <link role="classifier" extResolveInfo="1.[Classifier]Attr" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="properties" type="ypath.TreeNodeKindProperty" id="1175253134705">
        <property name="name" value="value" />
        <property name="default" value="false" />
        <node role="getter" type="ypath.PropertyGetter" id="1175253134706">
          <node role="parameter" type="ypath.LambdaMethodParameter" id="1175253134707">
            <property name="name" value="a" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1175253134708">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1175253139783">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1175253151942">
                <link role="baseMethodDeclaration" extResolveInfo="1.method ([Classifier]Attr).([InstanceMethodDeclaration]getValue() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String]))" />
                <node role="instance" type="jetbrains.mps.baseLanguage.ParenthesizedExpression" id="1175253143139">
                  <node role="expression" type="jetbrains.mps.baseLanguage.CastExpression" id="1175253145078">
                    <node role="expression" type="jetbrains.mps.baseLanguage.ClosureParameterReference" id="1175253148809">
                      <link role="closureParameter" targetNodeId="1175253134707" resolveInfo="a" />
                    </node>
                    <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1175253146669">
                      <link role="classifier" extResolveInfo="1.[Classifier]Attr" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="trigger" type="ypath.KindBlock" id="1175253044038">
        <node role="parameter" type="ypath.LambdaMethodParameter" id="1175253044039">
          <property name="name" value="a" />
        </node>
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1175253044040">
          <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1175253064403">
            <node role="expression" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1175253093998">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.ClosureParameterReference" id="1175253066285">
                <link role="closureParameter" targetNodeId="1175253044039" resolveInfo="a" />
              </node>
              <node role="classType" type="jetbrains.mps.baseLanguage.ClassifierType" id="1175253096165">
                <link role="classifier" extResolveInfo="1.[Classifier]Attr" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="parentBlock" type="ypath.ParentBlock" id="1175083364495">
      <node role="parameter" type="ypath.LambdaMethodParameter" id="1175083364496">
        <property name="name" value="node" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1175083364497">
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1175083468532">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1175083659218">
            <link role="baseMethodDeclaration" extResolveInfo="1.method ([Classifier]Node).([InstanceMethodDeclaration]getParentNode() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Node]))" />
            <node role="instance" type="jetbrains.mps.baseLanguage.ClosureParameterReference" id="1175084688296">
              <link role="closureParameter" targetNodeId="1175083364496" resolveInfo="node" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="childrenBlock" type="ypath.ChildrenBlock" id="1175083364498">
      <node role="parameter" type="ypath.LambdaMethodParameter" id="1175083364499">
        <property name="name" value="node" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1175083364500">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1180968449701">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1180968449702">
            <property name="name" value="children" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.NewExpression" id="1175083663846">
              <link role="baseMethodDeclaration" extResolveInfo="2.constructor [Classifier]NodeListIterableAdapter[ConstructorDeclaration] ((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [NodeList]))" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1175083670055">
                <link role="baseMethodDeclaration" extResolveInfo="1.method ([Classifier]Node).([InstanceMethodDeclaration]getChildNodes() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [NodeList]))" />
                <node role="instance" type="jetbrains.mps.baseLanguage.ClosureParameterReference" id="1175084694192">
                  <link role="closureParameter" targetNodeId="1175083364499" resolveInfo="node" />
                </node>
              </node>
            </node>
            <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1180970576295">
              <link role="classifier" extResolveInfo="4.[Classifier]Iterable" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.ClassifierType" id="1180970583183">
                <link role="classifier" extResolveInfo="1.[Classifier]Node" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1180970606891">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1180970606892">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1180970620212">
              <node role="expression" type="jetbrains.mps.baseLanguage.NewExpression" id="1180970622172">
                <link role="baseMethodDeclaration" extResolveInfo="2.constructor [Classifier]ChainedIterable[ConstructorDeclaration] ((jetbrains.mps.baseLanguage.types.array/jetbrains.mps.baseLanguage.types.array [-1, jetbrains.mps.baseLanguage.types.classifier [Iterable, &lt;any_&gt;]]))" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.NewExpression" id="1180970687747">
                  <link role="baseMethodDeclaration" extResolveInfo="2.constructor [Classifier]NamedNodeMapIterableAdapter[ConstructorDeclaration] ((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [NamedNodeMap]))" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1180970699258">
                    <link role="baseMethodDeclaration" extResolveInfo="1.method ([Classifier]Node).([InstanceMethodDeclaration]getAttributes() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [NamedNodeMap]))" />
                    <node role="instance" type="jetbrains.mps.baseLanguage.ClosureParameterReference" id="1180970695421">
                      <link role="closureParameter" targetNodeId="1175083364499" resolveInfo="node" />
                    </node>
                  </node>
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1180970708940">
                  <link role="variableDeclaration" targetNodeId="1180968449702" resolveInfo="foo" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1180970611740">
            <node role="classType" type="jetbrains.mps.baseLanguage.ClassifierType" id="1180970618018">
              <link role="classifier" extResolveInfo="1.[Classifier]Element" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.ClosureParameterReference" id="1180970609403">
              <link role="closureParameter" targetNodeId="1175083364499" resolveInfo="node" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1175083557712">
          <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1180968449704">
            <link role="variableDeclaration" targetNodeId="1180968449702" resolveInfo="foo" />
          </node>
        </node>
      </node>
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.PublicVisibility" id="1178558211779" />
    <node role="treePathType" type="ypath.TreePathType" id="1178882722893">
      <node role="nodeType" type="jetbrains.mps.baseLanguage.ClassifierType" id="1178882722896">
        <link role="classifier" extResolveInfo="1.[Classifier]Node" />
      </node>
      <node role="elementType" type="jetbrains.mps.baseLanguage.ClassifierType" id="1179351339513">
        <link role="classifier" extResolveInfo="1.[Classifier]Node" />
      </node>
    </node>
  </node>
</model>

