<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.bootstrap.structureLanguage.actions">
  <language namespace="jetbrains.mps.bootstrap.actionsLanguage" />
  <maxImportIndex value="1" />
  <import index="1" modelUID="jetbrains.mps.bootstrap.structureLanguage.structure" />
  <node type="jetbrains.mps.bootstrap.actionsLanguage.ReferentSubstituteActions" id="1141871382787">
    <property name="name" value="referent_substitute" />
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.ReferentSubstituteActionsBuilder" id="1146701476978">
      <property name="actionsFactoryAspectId" value="ConceptDeclaration_ExtendedConcept" />
      <link role="applicableSourceConcept" targetNodeId="1.1071489090640" />
      <link role="applicableLink" targetNodeId="1.1071489389519" />
    </node>
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.ReferentSubstituteActionsBuilder" id="1146704516900">
      <property name="searchScopeProviderAspectId" value="ParentConceptDeclaration_ExtendedConcept_Hierarchy" />
      <property name="actionsFactoryAspectId" value="LinkDeclaration_LinksToSpecialize" />
      <link role="applicableSourceConcept" targetNodeId="1.1071489288298" />
      <link role="applicableLink" targetNodeId="1.1071599698500" />
    </node>
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.ReferentSubstituteActionsBuilder" id="1146703376974">
      <property name="searchScopeProviderAspectId" value="ParentConceptDeclaration_Hierarchy" />
      <link role="applicableSourceConcept" targetNodeId="1.1105725498741" />
      <link role="applicableLink" targetNodeId="1.1105725523273" />
    </node>
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.ReferentSubstituteActionsBuilder" id="1146703759413">
      <property name="searchScopeProviderAspectId" value="ParentConceptDeclaration_Hierarchy" />
      <link role="applicableSourceConcept" targetNodeId="1.1105725638761" />
      <link role="applicableLink" targetNodeId="1.1105725659058" />
    </node>
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.ReferentSubstituteActionsBuilder" id="1141871391304">
      <property name="searchScopeProviderAspectId" value="ParentConceptDeclaration_Hierarchy" />
      <link role="applicableSourceConcept" targetNodeId="1.1105736889287" />
      <link role="applicableLink" targetNodeId="1.1105742417828" />
    </node>
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.ReferentSubstituteActionsBuilder" id="1141936138706">
      <property name="searchScopeProviderAspectId" value="ParentConceptDeclaration_Hierarchy" />
      <link role="applicableSourceConcept" targetNodeId="1.1105736778597" />
      <link role="applicableLink" targetNodeId="1.1105742372452" />
    </node>
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.ReferentSubstituteActionsBuilder" id="1141936376504">
      <property name="actionsFactoryAspectId" value="ReferenceConceptLink_target" />
      <link role="applicableSourceConcept" targetNodeId="1.1105736778597" />
      <link role="applicableLink" targetNodeId="1.1105736807942" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.actionsLanguage.NodeSubstituteActions" id="1142040373858">
    <property name="name" value="child_substitute" />
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.NodeSubstituteActionsBuilder" id="1146700484561">
      <property name="actionsFactoryAspectId" value="ConceptProperties" />
      <property name="preconditionAspectId" value="Parent_isConceptDeclaration" />
      <link role="applicableConcept" targetNodeId="1.1105725413739" />
    </node>
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.NodeSubstituteActionsBuilder" id="1142040375687">
      <property name="actionsFactoryAspectId" value="ConceptLinks" />
      <property name="preconditionAspectId" value="Parent_isConceptDeclaration" />
      <link role="applicableConcept" targetNodeId="1.1105736674127" />
    </node>
  </node>
</model>

