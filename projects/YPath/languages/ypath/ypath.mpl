<?xml version="1.0" encoding="UTF-8"?>
<language namespace="ypath">
  <structure>
    <model modelUID="ypath.structure" />
  </structure>
  <helginsTypeSystem>
    <model modelUID="ypath.helgins" />
  </helginsTypeSystem>
  <actions>
    <model modelUID="ypath.actions" />
  </actions>
  <constraints>
    <model modelUID="ypath.constraints" />
  </constraints>
  <editor>
    <model modelUID="ypath.editor" />
  </editor>
  <models>
    <modelRoot path="${language_descriptor}\languageModels" namespacePrefix="ypath" />
    <modelRoot path="${language_descriptor}\languageAccessories" namespacePrefix="ypath" />
  </models>
  <module />
  <accessoryModels />
  <generators>
    <generator generatorUID="ypath#1168438160182" targetLanguage="jetbrains.mps.baseLanguage">
      <models>
        <modelRoot path="${language_descriptor}\generators\baseLanguage\templates" namespacePrefix="ypath.generator.baseLanguage.template" />
      </models>
      <module>
        <moduleRoot path="${mps_home}\languages\baseLanguage\language\baseLanguage.mpl" />
      </module>
      <external-templates />
      <mapping-priorities />
    </generator>
  </generators>
  <classPath>
    <entry path="${mps_home}\projects\YPath\classes" />
  </classPath>
</language>

