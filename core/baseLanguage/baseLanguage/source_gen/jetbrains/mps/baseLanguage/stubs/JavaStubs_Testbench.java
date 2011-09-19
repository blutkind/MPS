package jetbrains.mps.baseLanguage.stubs;

/*Generated by MPS */

import jetbrains.mps.smodel.descriptor.source.ModelDataSource;
import jetbrains.mps.stubs.StubLocation;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.stubs.StubSource;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;

public class JavaStubs_Testbench extends JavaStubs {
  public JavaStubs_Testbench() {
  }

  protected void updateModel(final StubLocation location, final SModel model, ModelDataSource source) {
    SNode exp = null;
    SPropertyOperations.set(SNodeOperations.cast((exp = SConceptOperations.createNewNode("jetbrains.mps.lang.core.structure.ExportScopeNamespace", null)), "jetbrains.mps.lang.core.structure.ExportScopeNamespace"), "namespace", "jetbrains.mps");
    for (SNode root : model.roots()) {
      AttributeOperations.setAttribute(root, new IAttributeDescriptor.NodeAttribute(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.core.structure.ExportScope")), SNodeOperations.copyNode(exp));
    }
  }
}
