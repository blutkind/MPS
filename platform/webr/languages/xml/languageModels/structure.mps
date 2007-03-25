<?xml version="1.0" encoding="UTF-8"?>
<model name="webr.xml.structure">
  <language namespace="jetbrains.mps.bootstrap.structureLanguage" />
  <maxImportIndex value="5" />
  <import index="1" modelUID="jetbrains.mps.core.structure" />
  <import index="2" modelUID="jetbrains.mps.bootstrap.structureLanguage.structure" />
  <import index="3" modelUID="webr.xml.structure" />
  <import index="4" modelUID="jetbrains.mps.baseLanguage.structure" />
  <import index="5" modelUID="webr.xmlSchema.structure" />
  <node type="jetbrains.mps.bootstrap.structureLanguage.ConceptDeclaration" id="1161371727643">
    <property name="name" value="Content" />
    <link role="extends" targetNodeId="1.1133920641626" />
    <node role="conceptPropertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.BooleanConceptPropertyDeclaration" id="1168792704590">
      <property name="name" value="isComplex" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.BooleanConceptProperty" id="1161371746114">
      <link role="conceptPropertyDeclaration" targetNodeId="1.1137473854053" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.ConceptDeclaration" id="1161373262136">
    <property name="name" value="Text" />
    <link role="extends" targetNodeId="1163340203555" resolveInfo="BaseText" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.StringConceptProperty" id="1162498464999">
      <property name="value" value="/text" />
      <link role="conceptPropertyDeclaration" targetNodeId="1.1137473891462" />
    </node>
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.PropertyDeclaration" id="1161373273669">
      <property name="name" value="text" />
      <link role="dataType" targetNodeId="1.1082983041843" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.ConceptDeclaration" id="1161911457732">
    <property name="name" value="ComplexText" />
    <link role="extends" targetNodeId="1163340203555" resolveInfo="BaseText" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.StringConceptProperty" id="1162498470751">
      <property name="value" value="*complexText" />
      <link role="conceptPropertyDeclaration" targetNodeId="1.1137473891462" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.LinkDeclaration" id="1161911474092">
      <property name="sourceCardinality" value="1..n" />
      <property name="role" value="text" />
      <property name="metaClass" value="aggregation" />
      <link role="target" targetNodeId="1163340203555" resolveInfo="BaseText" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.ConceptDeclaration" id="1163340203555">
    <property name="name" value="BaseText" />
    <link role="extends" targetNodeId="1161371727643" resolveInfo="Content" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.BooleanConceptProperty" id="1163340214415">
      <link role="conceptPropertyDeclaration" targetNodeId="1.1137473854053" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.ConceptDeclaration" id="1163629230879">
    <property name="name" value="ContentList" />
    <link role="extends" targetNodeId="1161371727643" resolveInfo="Content" />
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.PropertyDeclaration" id="1166231449055">
      <property name="name" value="isHorizontal" />
      <link role="dataType" targetNodeId="1.1082983657063" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.LinkDeclaration" id="1163629255661">
      <property name="sourceCardinality" value="0..n" />
      <property name="role" value="content" />
      <property name="metaClass" value="aggregation" />
      <link role="target" targetNodeId="1161371727643" resolveInfo="Content" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.StringConceptProperty" id="1166304178740">
      <property name="value" value="(contentList)" />
      <link role="conceptPropertyDeclaration" targetNodeId="1.1137473891462" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.BooleanConceptProperty" id="1168792765501">
      <link role="conceptPropertyDeclaration" targetNodeId="1168792704590" resolveInfo="isComplex" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.ConceptDeclaration" id="1163723419051">
    <property name="name" value="AttributeList" />
    <link role="extends" targetNodeId="1.1133920641626" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.LinkDeclaration" id="1163723441114">
      <property name="sourceCardinality" value="0..n" />
      <property name="role" value="attribute" />
      <property name="metaClass" value="aggregation" />
      <link role="target" targetNodeId="1165235274815" resolveInfo="BaseAttribute" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.ConceptDeclaration" id="1165235274815">
    <property name="name" value="BaseAttribute" />
    <link role="extends" targetNodeId="1.1133920641626" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.BooleanConceptProperty" id="1165235282019">
      <link role="conceptPropertyDeclaration" targetNodeId="1.1137473854053" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.ConceptDeclaration" id="1167523027466">
    <property name="name" value="Element" />
    <link role="extends" targetNodeId="1161371727643" resolveInfo="Content" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.LinkDeclaration" id="1167523262932">
      <property name="sourceCardinality" value="1" />
      <property name="role" value="elementDeclaration" />
      <link role="target" targetNodeId="5.1167838236835" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.BooleanConceptProperty" id="1167523602746">
      <link role="conceptPropertyDeclaration" targetNodeId="1.1137473994950" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.BooleanConceptProperty" id="1168818951439">
      <link role="conceptPropertyDeclaration" targetNodeId="1168792704590" resolveInfo="isComplex" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.LinkDeclaration" id="1172970431688">
      <property name="sourceCardinality" value="1" />
      <property name="role" value="contentList" />
      <property name="metaClass" value="aggregation" />
      <link role="target" targetNodeId="1163629230879" resolveInfo="ContentList" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.LinkDeclaration" id="1172970512463">
      <property name="sourceCardinality" value="1" />
      <property name="role" value="attributeList" />
      <property name="metaClass" value="aggregation" />
      <link role="target" targetNodeId="1163723419051" resolveInfo="AttributeList" />
    </node>
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.PropertyDeclaration" id="1172970532917">
      <property name="name" value="isEmpty" />
      <link role="dataType" targetNodeId="1.1082983657063" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.ConceptDeclaration" id="1167700349452">
    <property name="name" value="Attribute" />
    <link role="extends" targetNodeId="1165235274815" resolveInfo="BaseAttribute" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.LinkDeclaration" id="1167701332877">
      <property name="sourceCardinality" value="1" />
      <property name="role" value="attributeDeclaration" />
      <link role="target" targetNodeId="5.1167697887602" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.LinkDeclaration" id="1167703268127">
      <property name="sourceCardinality" value="1" />
      <property name="role" value="value" />
      <property name="metaClass" value="aggregation" />
      <link role="target" targetNodeId="1163340203555" resolveInfo="BaseText" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.BooleanConceptProperty" id="1167701543016">
      <link role="conceptPropertyDeclaration" targetNodeId="1.1137473994950" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.ConceptDeclaration" id="1172952771790">
    <property name="name" value="Comment" />
    <link role="extends" targetNodeId="1161371727643" resolveInfo="Content" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.LinkDeclaration" id="1172953539617">
      <property name="sourceCardinality" value="1..n" />
      <property name="role" value="text" />
      <property name="metaClass" value="aggregation" />
      <link role="target" targetNodeId="1163340203555" resolveInfo="BaseText" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.StringConceptProperty" id="1172953518022">
      <property name="value" value="!-- comment" />
      <link role="conceptPropertyDeclaration" targetNodeId="1.1137473891462" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.ConceptDeclaration" id="1172960673168">
    <property name="name" value="EntityReference" />
    <link role="extends" targetNodeId="1163340203555" resolveInfo="BaseText" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.LinkDeclaration" id="1172960837561">
      <property name="sourceCardinality" value="1" />
      <property name="role" value="entityDeclaration" />
      <link role="target" targetNodeId="5.1172950047361" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.StringConceptProperty" id="1172960808169">
      <property name="value" value="&amp;entity;" />
      <link role="conceptPropertyDeclaration" targetNodeId="1.1137473891462" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.ConceptDeclaration" id="1174832926259">
    <property name="name" value="Document" />
    <link role="extends" targetNodeId="1.1133920641626" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.LinkDeclaration" id="1174833002186">
      <property name="sourceCardinality" value="1" />
      <property name="role" value="rootElement" />
      <property name="metaClass" value="aggregation" />
      <link role="target" targetNodeId="1167523027466" resolveInfo="Element" />
    </node>
  </node>
</model>

