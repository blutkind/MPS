<?xml version="1.0" encoding="UTF-8"?>
<language namespace="jetbrains.mps.samples.theSimplestLanguage" uuid="f8fecd49-3abe-4733-9741-0c637123d219" compileInMPS="true" doNotGenerateAdapters="false">
  <models>
    <modelRoot path="${language_descriptor}/languageAccessories" />
    <modelRoot path="${language_descriptor}/languageModels" />
  </models>
  <accessoryModels />
  <generators>
    <generator name="baseLanguageGenerator" generatorUID="jetbrains.mps.samples.theSimplestLanguage#1222955937368" uuid="3212a8c5-a123-4417-90e3-865a4c2e3a7e">
      <models>
        <modelRoot path="${language_descriptor}/generator/template" />
      </models>
      <external-templates />
      <usedDevKits>
        <usedDevKit>2677cb18-f558-4e33-bc38-a5139cee06dc(jetbrains.mps.devkit.language-design)</usedDevKit>
      </usedDevKits>
      <mapping-priorities />
    </generator>
  </generators>
  <sourcePath />
  <dependencies>
    <dependency reexport="false">18bc6592-03a6-4e29-a83a-7ff23bde13ba(jetbrains.mps.lang.editor)</dependency>
  </dependencies>
  <usedDevKits>
    <usedDevKit>2677cb18-f558-4e33-bc38-a5139cee06dc(jetbrains.mps.devkit.language-design)</usedDevKit>
  </usedDevKits>
  <extendedLanguages />
</language>

