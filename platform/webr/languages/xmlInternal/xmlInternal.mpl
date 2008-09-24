<?xml version="1.0" encoding="UTF-8"?>
<language namespace="webr.xmlInternal" uuid="64f62b28-36e3-4052-9f72-f616211ae615" compileInMPS="true">
  <models>
    <modelRoot path="${language_descriptor}\languageModels" namespacePrefix="webr.xmlInternal" />
    <modelRoot path="${language_descriptor}\languageAccessories" namespacePrefix="webr.xmlInternal" />
  </models>
  <accessoryModels />
  <generators>
    <generator generatorUID="webr.xmlInternal#1165632612566" uuid="54e8601c-dee3-4b7a-94f7-5ee53b3f2dcb">
      <models>
        <modelRoot path="${language_descriptor}\generators\baseLanguage\templates" namespacePrefix="webr.xmlInternal.generator.baseLanguage.template" />
      </models>
      <external-templates>
        <generator generatorUID="webr.gtext#1164413905312" />
      </external-templates>
      <dependencies>
        <dependency reexport="false">jetbrains.mps.baseLanguage</dependency>
      </dependencies>
      <usedLanguages>
        <usedLanguages>webr.gtext</usedLanguages>
      </usedLanguages>
      <mapping-priorities>
        <mapping-priority-rule kind="strictly_before">
          <greater-priority-mapping>
            <mapping-node modelUID="r:00000000-0000-4000-0000-011c89590592(webr.xmlInternal.generator.baseLanguage.template.main@generator)" nodeID="*" />
          </greater-priority-mapping>
          <lesser-priority-mapping>
            <generator generatorUID="webr.gtext#1164413905312" />
            <external-mapping>
              <mapping-node modelUID="r:00000000-0000-4000-0000-011c89590576(webr.gtext.generator.baseLanguage.template.main@generator)" nodeID="*" />
            </external-mapping>
          </lesser-priority-mapping>
        </mapping-priority-rule>
      </mapping-priorities>
    </generator>
  </generators>
  <classPath />
  <languageRuntimeClassPath />
  <sourcePath />
  <extendedLanguages>
    <extendedLanguage>jetbrains.mps.core</extendedLanguage>
    <extendedLanguage>webr.xml</extendedLanguage>
    <extendedLanguage>jetbrains.mps.baseLanguage</extendedLanguage>
    <extendedLanguage>webr.xmlSchema</extendedLanguage>
  </extendedLanguages>
</language>

