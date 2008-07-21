<?xml version="1.0" encoding="UTF-8"?>
<language namespace="jetbrains.mps.transformationTest" compileInMPS="false">
  <models>
    <modelRoot path="${language_descriptor}\languageModels" namespacePrefix="jetbrains.mps.transformationTest" />
    <modelRoot path="${language_descriptor}\languageAccessories" namespacePrefix="jetbrains.mps.transformationTest" />
  </models>
  <accessoryModels>
    <model modelUID="jetbrains.mps.transformationTest.categories" />
  </accessoryModels>
  <generators>
    <generator generatorUID="jetbrains.mps.transformationTest#1210261198005">
      <models>
        <modelRoot path="${language_descriptor}\generator\baseLanguage\template" namespacePrefix="jetbrains.mps.transformationTest.generator.baseLanguage.template" />
      </models>
      <external-templates>
        <generator generatorUID="jetbrains.mps.baseLanguage.unitTest#1171932017138" />
        <generator generatorUID="jetbrains.mps.bootstrap.smodelLanguage#1139186730696" />
      </external-templates>
      <dependencies>
        <dependency reexport="false">jetbrains.mps.baseLanguage</dependency>
        <dependency reexport="false">jetbrains.mps.bootstrap.helgins</dependency>
        <dependency reexport="false">jetbrains.mps.transformationTest.runtime</dependency>
      </dependencies>
      <usedLanguages>
        <usedLanguages>jetbrains.mps.baseLanguage.unitTest</usedLanguages>
      </usedLanguages>
      <mapping-priorities>
        <mapping-priority-rule kind="strictly_before">
          <greater-priority-mapping>
            <all-local-mappings />
          </greater-priority-mapping>
          <lesser-priority-mapping>
            <generator generatorUID="jetbrains.mps.baseLanguage.unitTest#1171932017138" />
            <external-mapping>
              <all-local-mappings />
            </external-mapping>
          </lesser-priority-mapping>
        </mapping-priority-rule>
        <mapping-priority-rule kind="strictly_before">
          <greater-priority-mapping>
            <all-local-mappings />
          </greater-priority-mapping>
          <lesser-priority-mapping>
            <generator generatorUID="jetbrains.mps.bootstrap.smodelLanguage#1139186730696" />
            <external-mapping>
              <mapping-node modelUID="jetbrains.mps.bootstrap.smodelLanguage.generator.baseLanguage.template.main@templates" nodeID="1208783529339" />
            </external-mapping>
          </lesser-priority-mapping>
        </mapping-priority-rule>
      </mapping-priorities>
    </generator>
  </generators>
  <classPath>
    <entry path="${language_descriptor}\classes" />
  </classPath>
  <languageRuntimeClassPath>
    <entry path="${language_descriptor}\classes" />
    <entry path="${mps_home}\core\kernel\classes" />
    <entry path="${mps_home}\lib\log4j\log4j-1.2.14.jar" />
    <entry path="${mps_home}\MPSPlugin\MPSSupport\classes" />
  </languageRuntimeClassPath>
  <sourcePath />
  <dependencies>
    <dependency reexport="false">JDK</dependency>
    <dependency reexport="false">MPS.Classpath</dependency>
    <dependency reexport="false">jetbrains.mps.baseLanguage.unitTest.runtime</dependency>
  </dependencies>
  <runtime>
    <dependency reexport="false">jetbrains.mps.transformationTest.runtime</dependency>
  </runtime>
  <extendedLanguages>
    <extendedLanguage>jetbrains.mps.baseLanguage</extendedLanguage>
    <extendedLanguage>jetbrains.mps.bootstrap.smodelLanguage</extendedLanguage>
    <extendedLanguage>jetbrains.mps.baseLanguage.unitTest</extendedLanguage>
  </extendedLanguages>
</language>

