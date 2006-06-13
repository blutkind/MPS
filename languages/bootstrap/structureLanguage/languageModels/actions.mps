<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.bootstrap.structureLanguage.actions">
  <language namespace="jetbrains.mps.bootstrap.actionsLanguage" />
  <maxImportIndex value="1" />
  <import index="1" modelUID="jetbrains.mps.bootstrap.structureLanguage.structure" />
  <node type="jetbrains.mps.bootstrap.actionsLanguage.ReferentSubstituteActions" id="1141871382787">
    <property name="name" value="STRL_referent_substitute" />
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.ReferentSubstituteActionsBuilder" id="1146701476978">
      <property name="actionsFactoryAspectId" value="ConceptDeclaration_ExtendedConcept" />
      <link role="applicableSourceConcept" targetNodeId="1.1071489090640" />
      <link role="applicableLink" targetNodeId="1.1071489389519" />
    </node>
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.ReferentSubstituteActionsBuilder" id="1146704516900">
      <property name="actionsFactoryAspectId" value="LinkDeclaration_LinksToSpecialize" />
      <link role="applicableSourceConcept" targetNodeId="1.1071489288298" />
      <link role="applicableLink" targetNodeId="1.1071599698500" />
    </node>
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.ReferentSubstituteActionsBuilder" id="1141936376504">
      <property name="actionsFactoryAspectId" value="ReferenceConceptLink_target" />
      <link role="applicableSourceConcept" targetNodeId="1.1105736778597" />
      <link role="applicableLink" targetNodeId="1.1105736807942" />
    </node>
  </node>
</model>

