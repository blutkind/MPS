<?xml version="1.0" encoding="UTF-8"?>
<language namespace="jetbrains.mps.bootstrap.structureLanguage" generatorOutputPath="${mps_home}\source_gen">
  <structure>
    <model modelUID="jetbrains.mps.bootstrap.structureLanguage.structure" />
  </structure>
  <typeSystem>
    <model modelUID="jetbrains.mps.bootstrap.structureLanguage.types" />
  </typeSystem>
  <actions>
    <model modelUID="jetbrains.mps.bootstrap.structureLanguage.actions" />
  </actions>
  <constraints>
    <model modelUID="jetbrains.mps.bootstrap.structureLanguage.constraints" />
  </constraints>
  <editor>
    <model modelUID="jetbrains.mps.bootstrap.structureLanguage.editor" />
  </editor>
  <models>
    <modelRoot path="${language_descriptor}\languageModels" namespacePrefix="jetbrains.mps.bootstrap.structureLanguage" />
    <modelRoot path="${language_descriptor}\languageAccessories" namespacePrefix="jetbrains.mps.bootstrap.structureLanguage" />
    <modelRoot path="${mps_home}\languages\core" namespacePrefix="jetbrains.mps.core" />
  </models>
  <module />
  <accessoryModels>
    <model modelUID="jetbrains.mps.core.structure" />
  </accessoryModels>
  <generators>
    <generator name="structure generator" generatorUID="jetbrains.mps.bootstrap.structureLanguage#1129914001820" targetLanguage="jetbrains.mps.baseLanguage">
      <models>
        <modelRoot path="${language_descriptor}\generator" namespacePrefix="jetbrains.mps.bootstrap.structureLanguage.generator" />
      </models>
      <module />
    </generator>
    <generator generatorUID="jetbrains.mps.bootstrap.structureLanguage#1170324972255" targetLanguage="jetbrains.mps.baseLanguage.ext.collections.lang">
      <models>
        <modelRoot path="${language_descriptor}\generator_new" namespacePrefix="jetbrains.mps.bootstrap.structureLanguage.generator_new" />
      </models>
      <module>
        <moduleRoot path="${mps_home}\projects\baseLanguageExt\dev\languages\collections\lang\collections.mpl" />
      </module>
    </generator>
  </generators>
  <classPath />
</language>

