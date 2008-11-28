package jetbrains.mps;

import java.io.File;

public class BootstrapTest extends BaseMPSTest {
  public void testBaseLanguage() {
    assertGenerates(new File("core/baseLanguage/baseLanguage/baseLanguage.mpr"));
  }

  public void testBaseLanguageStrings() {
    assertGenerates(new File("core/baseLanguage/strings/strings.mpr"));
  }

  public void testBaseLanguageInternal() {
    assertGenerates(new File("core/baseLanguage/baseLanguageInternal/baseLanguageInternal.mpr"));
  }

  public void testCoreLanguage() {
    assertGenerates(new File("core/languageDesign/core/core.mpr"));
  }

  public void testStructureLanguage() {
    assertGenerates(new File("core/languageDesign/structure/structure.mpr"));
  }

  public void testEditorLanguage() {
    assertGenerates(new File("core/languageDesign/editor/editor.mpr"));
  }

  public void testConstraintsLanguage() {
    assertGenerates(new File("core/languageDesign/constraints/constraints.mpr"));
  }

  public void testSModelLanguage() {
    assertGenerates(new File("core/languageDesign/smodel/smodel.mpr"));
  }

  public void testActionsLanguage() {
    assertGenerates(new File("core/languageDesign/actions/actions.mpr"));
  }

  public void testTypesystem() {
    assertGenerates(new File("core/languageDesign/typesystem/typesystem.mpr"));
  }

  public void testRefactoringLanguage() {
    assertGenerates(new File("core/languageDesign/refactoring/refactoring.mpr"));
  }

  public void testSharedConcepts() {
    assertGenerates(new File("core/languageDesign/sharedConcepts/sharedConcepts.mpr"));
  }

  public void testCollectionsLanguage() {
    assertGenerates(new File("core/baseLanguage/collections/collections.mpr"));
  }

  public void testClosures() {
    assertGenerates(new File("core/baseLanguage/closures/closures.mpr"));
  }


  public void testProjectLanguage() {
    assertGenerates(new File("core/projectLanguage/projectLanguage.mpr"));
  }

  public void testGenerator() {
    assertGenerates(new File("core/languageDesign/generator/generator.mpr"));
  }

  public void testIntentionsLanguage() {
    assertGenerates(new File("core/languageDesign/intentions/intentions.mpr"));
  }

  public void testFindUsagesLanguage() {
    assertGenerates(new File("core/languageDesign/findUsages/findUsages.mpr"));
  }

  public void testPluginLanguage() {
    assertGenerates(new File("core/languageDesign/plugin/plugin.mpr"));
  }

  public void testDeprecatedXML() {
    assertGenerates(new File("platform/xmlDeprecated/xmlDeprecated.mpr"));
  }

  public void testRegexps() {
    assertGenerates(new File("platform/regexp/regexp.mpr"));
  }

  public void testQuotation() {
    assertGenerates(new File("core/languageDesign/quotation/quotation.mpr"));
  }

  public void testAnnotations() {
    assertGenerates(new File("core/languageDesign/annotations/annotations.mpr"));
  }

  public void testPatterns() {
    assertGenerates(new File("core/languageDesign/pattern/pattern.mpr"));
  }

  public void testDataFlow() {
    assertGenerates(new File("core/languageDesign/dataFlow/dataFlow.mpr"));
  }

  public void testScript() {
    assertGenerates(new File("core/languageDesign/script/script.mpr"));
  }

  public void testLanguageTest() {
    assertGenerates(new File("core/languageDesign/test/test.mpr"));
  }

  public void testXML() {
    assertGenerates(new File("platform/xml/xml/xml.mpr"));
  }
}
