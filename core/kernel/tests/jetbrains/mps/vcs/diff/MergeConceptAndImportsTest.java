package jetbrains.mps.vcs.diff;

import jetbrains.mps.vcs.diff.ui.ModelDiffTool.ReadException;

import java.io.IOException;

/**
 * Test is made from MPS-3152
 */
public class MergeConceptAndImportsTest extends MergeTestCase{
  public void testConceptsAndLanguageImports() throws IOException, ReadException {
    testZip("resources/help.mps.zip");
  }

  public void testModelImports() throws IOException, ReadException {
    testZip("resources/structure.2.mps.zip");
  }
}
