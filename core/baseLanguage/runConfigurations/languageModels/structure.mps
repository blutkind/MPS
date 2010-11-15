<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:550fbd90-c9f2-4576-a8a6-223eca16d68b(jetbrains.mps.baseLanguage.runConfigurations.structure)">
  <persistence version="7" />
  <language namespace="82c32a3b-4a54-4fc1-b551-7ff9f198d7c1(jetbrains.mps.baseLanguage.runConfigurations)" />
  <language namespace="c72da2b9-7cce-4447-8389-f407dc1158b7(jetbrains.mps.lang.structure)" />
  <language namespace="ceab5195-25ea-4f22-9b92-103b95ca8c0c(jetbrains.mps.lang.core)" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="7866978e-a0f0-4cc7-81bc-4d213d9375e1(jetbrains.mps.lang.smodel)" />
  <import index="yvor" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" />
  <import index="65y0" modelUID="r:f144b87b-8ea5-4a8a-bb79-78fd4663e93c(jetbrains.mps.baseLanguage.util.plugin.run)" version="-1" />
  <import index="yvnr" modelUID="r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.lang.structure.structure)" version="0" />
  <import index="yvju" modelUID="r:00000000-0000-4000-0000-011c89590368(jetbrains.mps.lang.plugin.structure)" version="23" />
  <import index="yvnu" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" implicit="yes" />
  <import index="yvim" modelUID="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.lang.smodel.structure)" version="16" implicit="yes" />
  <import index="2jop" modelUID="r:550fbd90-c9f2-4576-a8a6-223eca16d68b(jetbrains.mps.baseLanguage.runConfigurations.structure)" version="0" implicit="yes" />
  <roots>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="8456022385895583119">
      <property name="name" nameId="yvnu.1169194664001:0" value="JavaNodeRunConfiguration" />
      <property name="rootable" nameId="yvnr.1096454100552:0" value="true" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="node" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="655818460756091959:0" resolveInfo="JavaRunConfiguration" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="8456022385895584871">
      <property name="name" nameId="yvnu.1169194664001:0" value="JavaCheckBlock" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="node" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvju.1347772807199150767:23" resolveInfo="AbstractCheckConfigBlock" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="655818460756091959">
      <property name="name" nameId="yvnu.1169194664001:0" value="JavaRunConfiguration" />
      <property name="rootable" nameId="yvnr.1096454100552:0" value="true" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="java" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvju.7035278950562851062:23" resolveInfo="RunConfigurationDeclaration" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="4964800443628314809">
      <property name="name" nameId="yvnu.1169194664001:0" value="JavaConfigurationRunParameters_FunctionParameter" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="java" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1107135704075:3" resolveInfo="ConceptFunctionParameter" />
    </node>
    <node type="yvnr.AnnotationLinkDeclaration" typeId="yvnr.1149608206811:0" id="7549816165173144969">
      <property name="role" nameId="yvnr.1204740973143:0" value="userComponentReferenceAnnotation" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="annotations" />
      <link role="source" roleId="yvnr.1149608246500:0" targetNodeId="yvju.3452826078638178132:23" resolveInfo="ComponentReference" />
      <link role="target" roleId="yvnr.1204741097161:0" targetNodeId="7549816165173145425:0" resolveInfo="UserComponentReferenceAnnotation" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="7549816165173145425">
      <property name="name" nameId="yvnu.1169194664001:0" value="UserComponentReferenceAnnotation" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="annotations" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvnu.1133920641626:0" resolveInfo="BaseConcept" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="3607966867310075767">
      <property name="name" nameId="yvnu.1169194664001:0" value="Node_FunctionParameter" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="node" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1107135704075:3" resolveInfo="ConceptFunctionParameter" />
    </node>
    <node type="yvnr.InterfaceConceptDeclaration" typeId="yvnr.1169125989551:0" id="1810772216404800349">
      <property name="name" nameId="yvnu.1169194664001:0" value="IJavaRunConfigurationParameter" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="3361586479360705438">
      <property name="name" nameId="yvnu.1169194664001:0" value="NodeRunConfigPropertyInstance" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="node" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvnu.1133920641626:0" resolveInfo="BaseConcept" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="2178855608170754068">
      <property name="name" nameId="yvnu.1169194664001:0" value="JavaNodeConfigurationEditorDeclaration" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="node" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvju.162872405267681132:23" resolveInfo="ConfigurationEditorDeclaration" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="2178855608170754525">
      <property name="name" nameId="yvnu.1169194664001:0" value="OnChangeNodeBlock" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="node" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1137021947720:3" resolveInfo="ConceptFunction" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="1566895476211680658">
      <property name="name" nameId="yvnu.1169194664001:0" value="ComponentInsideOfChangeListenerAnnotation" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="annotations" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvnu.1133920641626:0" resolveInfo="BaseConcept" />
    </node>
    <node type="yvnr.InterfaceConceptDeclaration" typeId="yvnr.1169125989551:0" id="1566895476211680660">
      <property name="name" nameId="yvnu.1169194664001:0" value="IOnChangeEditorBlock" />
    </node>
    <node type="yvnr.AnnotationLinkDeclaration" typeId="yvnr.1149608206811:0" id="1566895476211680990">
      <property name="role" nameId="yvnr.1204740973143:0" value="componentInsideOfChangeListenerAnnotation" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="annotations" />
      <link role="target" roleId="yvnr.1204741097161:0" targetNodeId="1566895476211680658:0" resolveInfo="ComponentInsideOfChangeListenerAnnotation" />
      <link role="source" roleId="yvnr.1149608246500:0" targetNodeId="yvju.3452826078638178132:23" resolveInfo="ComponentReference" />
    </node>
    <node type="yvnr.ConceptDeclaration" typeId="yvnr.1071489090640:0" id="4462513030604064303">
      <property name="name" nameId="yvnu.1169194664001:0" value="IsApplicableBlock" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="node" />
      <link role="extends" roleId="yvnr.1071489389519:0" targetNodeId="yvor.1137021947720:3" resolveInfo="ConceptFunction" />
    </node>
  </roots>
  <root id="8456022385895583119">
    <node role="propertyDeclaration" roleId="yvnr.1071489727084:0" type="yvnr.PropertyDeclaration" typeId="yvnr.1071489288299:0" id="3592413331516836478">
      <property name="name" nameId="yvnu.1169194664001:0" value="generate" />
      <link role="dataType" roleId="yvnr.1082985295845:0" targetNodeId="yvnu.1082983657063:0" resolveInfo="boolean" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="3607966867310500324">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="reference" />
      <property name="role" nameId="yvnr.1071599776563:0" value="conceptDeclaration" />
      <property name="sourceCardinality" nameId="yvnr.1071599893252:0" value="0..1" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="yvnr.1169125787135:0" resolveInfo="AbstractConceptDeclaration" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="8456022385895584872">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="checkBlock" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="8456022385895584871:0" resolveInfo="JavaCheckBlock" />
      <link role="specializedLink" roleId="yvnr.1071599698500:0" targetNodeId="yvju.678887849223472883:23" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="2178855608170933990">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="editor" />
      <link role="specializedLink" roleId="yvnr.1071599698500:0" targetNodeId="yvju.162872405267681133:23" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="2178855608170754068:0" resolveInfo="JavaConfigurationEditorDeclaration" />
    </node>
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="4462513030604064304">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="isApplicableBlock" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="4462513030604064303:0" resolveInfo="IsApplicableBlock" />
    </node>
  </root>
  <root id="8456022385895584871">
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="668913963929392860">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" resolveInfo="applicableConceptFunctionParameter" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="3607966867310075767:0" resolveInfo="Node_FunctionParameter" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="6629582826329141261">
      <property name="value" nameId="yvnr.1105725733873:0" value="check java" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="668913963929538836">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvor.1216468774225:3" resolveInfo="showName" />
    </node>
  </root>
  <root id="655818460756091959">
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="655818460756092288">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="yvju.3636700473138841144:23" resolveInfo="IEnchancedRunConfiguration" />
    </node>
  </root>
  <root id="4964800443628314809">
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="4964800443628314814">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1137545963098:3" resolveInfo="conceptFunctionParameterType" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="4964800443628318550">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="65y0.8492459591399148682" resolveInfo="ConfigRunParameters" />
      </node>
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="4964800443628314811">
      <property name="value" nameId="yvnr.1105725733873:0" value="javaParameters" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="1810772216404802094">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="1810772216404800349:0" resolveInfo="IJavaRunConfigurationParameter" />
    </node>
  </root>
  <root id="7549816165173144969" />
  <root id="7549816165173145425">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="7549816165173145427">
      <property name="value" nameId="yvnr.1105725733873:0" value="user component reference" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="3607966867310075767">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="3607966867310076241">
      <property name="value" nameId="yvnr.1105725733873:0" value="node" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.AggregationConceptLink" typeId="yvnr.1105736889287:0" id="3607966867310747841">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1137545963098:3" resolveInfo="conceptFunctionParameterType" />
      <node role="target" roleId="yvnr.1105736901241:0" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="3607966867310749204" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="1810772216404831565">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="1810772216404800349:0" resolveInfo="IJavaRunConfigurationParameter" />
    </node>
  </root>
  <root id="1810772216404800349" />
  <root id="3361586479360705438">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="3361586479361483886">
      <property name="value" nameId="yvnr.1105725733873:0" value="node" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="7589249354678411013">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="yvju.7086588812844908357:23" resolveInfo="IRunConfigPropertyInstance" />
    </node>
  </root>
  <root id="2178855608170754068">
    <node role="linkDeclaration" roleId="yvnr.1071489727083:0" type="yvnr.LinkDeclaration" typeId="yvnr.1071489288298:0" id="2178855608170754524">
      <property name="metaClass" nameId="yvnr.1071599937831:0" value="aggregation" />
      <property name="role" nameId="yvnr.1071599776563:0" value="onChangeNodeBlock" />
      <link role="target" roleId="yvnr.1071599976176:0" targetNodeId="2178855608170754525:0" resolveInfo="OnChangeEditorBlock" />
    </node>
  </root>
  <root id="2178855608170754525">
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="2178855608171215724">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" resolveInfo="applicableConceptFunctionParameter" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="3607966867310075767:0" resolveInfo="Node_FunctionParameter" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="2178855608170754527">
      <property name="value" nameId="yvnr.1105725733873:0" value="onChange" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="2178855608170754529">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvor.1216468774225:3" resolveInfo="showName" />
    </node>
    <node role="implements" roleId="yvnr.1169129564478:0" type="yvnr.InterfaceConceptReference" typeId="yvnr.1169127622168:0" id="1566895476211680989">
      <link role="intfc" roleId="yvnr.1169127628841:0" targetNodeId="1566895476211680660:0" resolveInfo="IOnChangeEditorBlock" />
    </node>
  </root>
  <root id="1566895476211680658">
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="1566895476211680659">
      <property name="value" nameId="yvnr.1105725733873:0" value="component inside of change listener" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
  <root id="1566895476211680660" />
  <root id="1566895476211680990" />
  <root id="4462513030604064303">
    <node role="conceptLink" roleId="yvnr.1105736949336:0" type="yvnr.ReferenceConceptLink" typeId="yvnr.1105736778597:0" id="4462513030604064310">
      <link role="conceptLinkDeclaration" roleId="yvnr.1105736734721:0" targetNodeId="yvor.1161119487665:3" resolveInfo="applicableConceptFunctionParameter" />
      <link role="target" roleId="yvnr.1105736807942:0" targetNodeId="3607966867310075767:0" resolveInfo="Node_FunctionParameter" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.BooleanConceptProperty" typeId="yvnr.1105725574259:0" id="4462513030604244386">
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvor.1216468774225:3" resolveInfo="showName" />
    </node>
    <node role="conceptProperty" roleId="yvnr.1105725339613:0" type="yvnr.StringConceptProperty" typeId="yvnr.1105725638761:0" id="4462513030604064308">
      <property name="value" nameId="yvnr.1105725733873:0" value="is applicable" />
      <link role="conceptPropertyDeclaration" roleId="yvnr.1105725439818:0" targetNodeId="yvnu.1137473891462:0" resolveInfo="alias" />
    </node>
  </root>
</model>

