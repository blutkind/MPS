<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:1222075024656(jetbrains.mps.quickQueryLanguage.structure)">
  <persistence version="3" />
  <refactoringHistory />
  <language namespace="jetbrains.mps.bootstrap.structureLanguage" />
  <language namespace="jetbrains.mps.baseLanguage.ext.collections.lang" />
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage" />
  <language namespace="jetbrains.mps.baseLanguage" />
  <language namespace="jetbrains.mps.core" />
  <languageAspect modelUID="r:1222075024012(jetbrains.mps.bootstrap.structureLanguage.constraints)" version="11" />
  <languageAspect modelUID="r:1222075024168(jetbrains.mps.baseLanguage.ext.collections.lang.constraints)" version="6" />
  <languageAspect modelUID="r:1222075024174(jetbrains.mps.baseLanguage.ext.collections.lang.structure)" version="1" />
  <languageAspect modelUID="r:1222075024123(jetbrains.mps.bootstrap.smodelLanguage.constraints)" version="21" />
  <languageAspect modelUID="r:1222075024129(jetbrains.mps.bootstrap.smodelLanguage.structure)" version="1" />
  <languageAspect modelUID="r:1222075024065(jetbrains.mps.baseLanguage.constraints)" version="83" />
  <languageAspect modelUID="r:1222075024074(jetbrains.mps.baseLanguage.structure)" version="0" />
  <languageAspect modelUID="r:1222075024003(jetbrains.mps.core.constraints)" version="2" />
  <languageAspect modelUID="r:1222075024184(jetbrains.mps.closures.structure)" version="0" />
  <languageAspect modelUID="r:1222075024180(jetbrains.mps.closures.constraints)" version="2" />
  <languageAspect modelUID="r:1222075024356(jetbrains.mps.internal.collections.constraints)" version="2" />
  <languageAspect modelUID="r:1222075024091(jetbrains.mps.baseLanguage.blTypes.constraints)" version="0" />
  <maxImportIndex value="4" />
  <import index="1" modelUID="r:1222075024656(jetbrains.mps.quickQueryLanguage.structure)" version="-1" />
  <import index="2" modelUID="r:1222075024074(jetbrains.mps.baseLanguage.structure)" version="0" />
  <import index="3" modelUID="r:1222075024008(jetbrains.mps.core.structure)" version="-1" />
  <import index="4" modelUID="r:1222075024018(jetbrains.mps.bootstrap.structureLanguage.structure)" version="-1" />
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1218793502081">
    <property name="name" value="ModelQuery" />
    <property name="rootable" value="true" />
    <link role="extends" targetNodeId="1219752983955" resolveInfo="BaseQuery" />
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1218793664585">
    <property name="name" value="QueryCondition" />
    <link role="extends" targetNodeId="2.1137021947720" resolveInfo="ConceptFunction" />
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1218793829580">
      <link role="conceptLinkDeclaration" targetNodeId="2.1161119487665" resolveInfo="applicableConceptFunctionParameter" />
      <link role="target" targetNodeId="1218793728835" resolveInfo="Query_node_Parameter" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1218793688891">
      <link role="conceptLinkDeclaration" targetNodeId="2.1137545148427" resolveInfo="conceptFunctionReturnType" />
      <node role="target" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1219401286366" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1218793728835">
    <property name="name" value="Query_node_Parameter" />
    <link role="extends" targetNodeId="2.1107135704075" resolveInfo="ConceptFunctionParameter" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.BooleanConceptProperty" id="1218796520355">
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473994950" resolveInfo="dontSubstituteByDefault" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1218793803765">
      <property name="value" value="node" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" resolveInfo="alias" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1219745756351">
    <property name="name" value="ReplaceModelQuery" />
    <property name="rootable" value="true" />
    <link role="extends" targetNodeId="1219752983955" resolveInfo="BaseQuery" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1219746108290">
      <property name="metaClass" value="aggregation" />
      <property name="role" value="replace" />
      <property name="sourceCardinality" value="1" />
      <link role="target" targetNodeId="1219745924291" resolveInfo="QueryReplace" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1219745924291">
    <property name="name" value="QueryReplace" />
    <link role="extends" targetNodeId="2.1137021947720" resolveInfo="ConceptFunction" />
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1219746016782">
      <link role="conceptLinkDeclaration" targetNodeId="2.1161119487665" resolveInfo="applicableConceptFunctionParameter" />
      <link role="target" targetNodeId="1218793728835" resolveInfo="Query_node_Parameter" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1219745984855">
      <link role="conceptLinkDeclaration" targetNodeId="2.1137545148427" resolveInfo="conceptFunctionReturnType" />
      <node role="target" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1219745986732" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1219752983955">
    <property name="name" value="BaseQuery" />
    <link role="extends" targetNodeId="3.1133920641626" resolveInfo="BaseConcept" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1219753034317">
      <property name="metaClass" value="reference" />
      <property name="role" value="conceptDeclaration" />
      <property name="sourceCardinality" value="1" />
      <link role="target" targetNodeId="4.1169125787135" resolveInfo="AbstractConceptDeclaration" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1219753024878">
      <property name="metaClass" value="aggregation" />
      <property name="role" value="condition" />
      <property name="sourceCardinality" value="1" />
      <link role="target" targetNodeId="1218793664585" resolveInfo="QueryCondition" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.BooleanConceptProperty" id="1219753004534">
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473854053" resolveInfo="abstract" />
    </node>
  </node>
</model>

