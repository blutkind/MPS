<?xml version="1.0" encoding="UTF-8"?>
<model namespace="jetbrains.mps.transformation.TLBase">
  <maxReferenceID value="4" />
  <language namespace="jetbrains.mps.bootstrap.structureLanguage" />
  <import referenceID="2" name="structure" namespace="jetbrains.mps.core" />
  <import referenceID="3" name="structure" namespace="jetbrains.mps.bootstrap.structureLanguage" />
  <import referenceID="4" name="library" namespace="jetbrains.mps.bootstrap.structureLanguage" />
  <node type="jetbrains.mps.bootstrap.structureLanguage.ConceptDeclaration" id="1087833241328">
    <property name="name" value="PropertyMacro" />
    <link role="extends" targetNodeId="2.1078489098625" />
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.PropertyDeclaration" id="1087833392642">
      <property name="name" value="aspectMethodName" />
      <link role="dataType" targetNodeId="2.1082983041843" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.LinkDeclaration" id="1087833315485">
      <property name="sourceCardinality" value="1" />
      <property name="targetCardinality" value="0..n" />
      <property name="role" value="property" />
      <link role="target" targetNodeId="3.1071489288299" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.ConceptDeclaration" id="1087833466690">
    <property name="name" value="NodeMacro" />
    <link role="extends" targetNodeId="2.1078489098625" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.LinkDeclaration" id="1096887838191">
      <property name="targetCardinality" value="0..n" />
      <property name="role" value="referencedTag" />
      <link role="target" targetNodeId="1096887421657" />
    </node>
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.PropertyDeclaration" id="1090493180053">
      <property name="name" value="sourceQueryAspectMethodName" />
      <link role="dataType" targetNodeId="2.1082983041843" />
    </node>
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.PropertyDeclaration" id="1090493180054">
      <property name="name" value="targetBuilderAspectMethodName" />
      <link role="dataType" targetNodeId="2.1082983041843" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.ConceptDeclaration" id="1088761943574">
    <property name="name" value="ReferenceMacro" />
    <link role="extends" targetNodeId="2.1078489098625" />
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.PropertyDeclaration" id="1088761950280">
      <property name="name" value="aspectMethodName" />
      <link role="dataType" targetNodeId="2.1082983041843" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.LinkDeclaration" id="1088761943575">
      <property name="sourceCardinality" value="1" />
      <property name="targetCardinality" value="0..n" />
      <property name="role" value="link" />
      <link role="target" targetNodeId="3.1071489288298" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.ConceptDeclaration" id="1092059087312">
    <property name="name" value="TemplateDeclaration" />
    <link role="extends" targetNodeId="2.1078489098625" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.LinkDeclaration" id="1092060348987">
      <property name="sourceCardinality" value="1" />
      <property name="targetCardinality" value="1" />
      <property name="role" value="contentNode" />
      <property name="metaClass" value="aggregation" />
      <link role="target" targetNodeId="2.1078489098625" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.StringConceptProperty" id="1107223377516">
      <property name="value" value="template declaration" />
      <link role="conceptPropertyDeclaration" targetNodeId="4.1106346943066" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.ConceptDeclaration" id="1095416546421">
    <property name="name" value="TemplateMappingConfiguration" />
    <link role="extends" targetNodeId="2.1078489098625" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.LinkDeclaration" id="1095416692159">
      <property name="sourceCardinality" value="0..n" />
      <property name="targetCardinality" value="1" />
      <property name="role" value="mappingRule" />
      <property name="metaClass" value="aggregation" />
      <link role="target" targetNodeId="1095416572297" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.LinkDeclaration" id="1095416692160">
      <property name="sourceCardinality" value="0..n" />
      <property name="targetCardinality" value="1" />
      <property name="role" value="weavingRule" />
      <property name="metaClass" value="aggregation" />
      <link role="target" targetNodeId="1095416624611" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.LinkDeclaration" id="1096887475611">
      <property name="sourceCardinality" value="0..n" />
      <property name="targetCardinality" value="1" />
      <property name="role" value="templateTag" />
      <property name="metaClass" value="aggregation" />
      <link role="target" targetNodeId="1096887421657" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.ConceptDeclaration" id="1095416572297">
    <property name="name" value="TemplateMappingRule" />
    <link role="extends" targetNodeId="2.1078489098625" />
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.PropertyDeclaration" id="1095440741546">
      <property name="name" value="sourceQueryAspectId" />
      <link role="dataType" targetNodeId="2.1082983041843" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.LinkDeclaration" id="1095417265990">
      <property name="sourceCardinality" value="1" />
      <property name="targetCardinality" value="0..n" />
      <property name="role" value="templateNode" />
      <link role="target" targetNodeId="2.1078489098625" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.ConceptDeclaration" id="1095416624611">
    <property name="name" value="TemplateWeavingRule" />
    <link role="extends" targetNodeId="2.1078489098625" />
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.PropertyDeclaration" id="1095418755477">
      <property name="name" value="sourceQueryAspectId" />
      <link role="dataType" targetNodeId="2.1082983041843" />
    </node>
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.PropertyDeclaration" id="1095418755478">
      <property name="name" value="contextProviderAspectId" />
      <link role="dataType" targetNodeId="2.1082983041843" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.LinkDeclaration" id="1095418098242">
      <property name="sourceCardinality" value="1" />
      <property name="role" value="template" />
      <link role="target" targetNodeId="1092059087312" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.ConceptDeclaration" id="1095672379244">
    <property name="name" value="TemplateFragment" />
    <link role="extends" targetNodeId="2.1078489098625" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.LinkDeclaration" id="1096887682700">
      <property name="sourceCardinality" value="0..1" />
      <property name="targetCardinality" value="0..n" />
      <property name="role" value="tag" />
      <link role="target" targetNodeId="1096887421657" />
    </node>
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.PropertyDeclaration" id="1095757900618">
      <property name="name" value="contextProviderAspectId" />
      <link role="dataType" targetNodeId="2.1082983041843" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.ConceptDeclaration" id="1096887421657">
    <property name="name" value="TemplateTag" />
    <link role="extends" targetNodeId="2.1078489098625" />
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.ConceptDeclaration" id="1112730859144">
    <property name="name" value="TemplateSwitch" />
    <link role="extends" targetNodeId="2.1078489098625" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.LinkDeclaration" id="1112820671508">
      <property name="targetCardinality" value="0..n" />
      <property name="role" value="modifiedSwitch" />
      <link role="target" targetNodeId="1112730859144" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.StringConceptProperty" id="1112731491355">
      <property name="value" value="template switch" />
      <link role="conceptPropertyDeclaration" targetNodeId="4.1106346943066" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.LinkDeclaration" id="1112731464728">
      <property name="sourceCardinality" value="0..n" />
      <property name="targetCardinality" value="1" />
      <property name="role" value="template" />
      <property name="metaClass" value="aggregation" />
      <link role="target" targetNodeId="1112730955130" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.ConceptDeclaration" id="1112730955130">
    <property name="name" value="ConditionalTemplate" />
    <link role="extends" targetNodeId="2.1078489098625" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.LinkDeclaration" id="1112804745009">
      <property name="sourceCardinality" value="1" />
      <property name="targetCardinality" value="0..n" />
      <property name="role" value="template" />
      <link role="target" targetNodeId="1092059087312" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.StringConceptProperty" id="1112731289399">
      <property name="value" value="conditional template" />
      <link role="conceptPropertyDeclaration" targetNodeId="4.1106346943066" />
    </node>
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.PropertyDeclaration" id="1112731143975">
      <property name="name" value="conditionAspectId" />
      <link role="dataType" targetNodeId="2.1082983041843" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.ConceptDeclaration" id="1112731569622">
    <property name="name" value="SwitchMacro" />
    <link role="extends" targetNodeId="1087833466690" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.StringConceptProperty" id="1112731678471">
      <property name="value" value="SWITCH" />
      <link role="conceptPropertyDeclaration" targetNodeId="4.1106346943066" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.StringConceptProperty" id="1112731684129">
      <property name="value" value="template switch macro" />
      <link role="conceptPropertyDeclaration" targetNodeId="4.1107214812281" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.LinkDeclaration" id="1112731629154">
      <property name="sourceCardinality" value="1" />
      <property name="targetCardinality" value="0..n" />
      <property name="role" value="templateSwitch" />
      <link role="target" targetNodeId="1112730859144" />
    </node>
  </node>
</model>

