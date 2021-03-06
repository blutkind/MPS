package jetbrains.mps.stubs.util;

/*Generated by MPS */

import jetbrains.mps.smodel.descriptor.source.StubModelDataSource;
import jetbrains.mps.project.structure.model.ModelRoot;
import jetbrains.mps.smodel.loading.ModelLoadResult;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.loading.ModelLoadingState;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.nodeidmap.ForeignNodeIdMap;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.project.ModuleId;
import java.util.List;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.SNodeId;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.baseLanguage.tuples.runtime.MultiTuple;
import jetbrains.mps.smodel.SModelStereotype;
import jetbrains.mps.smodel.SModelReference;
import java.io.InputStream;
import org.jdom.input.SAXBuilder;
import jetbrains.mps.util.JDOMUtil;
import java.io.IOException;
import org.jdom.JDOMException;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.persistence.def.DescriptorLoadResult;
import jetbrains.mps.smodel.SModelFqName;

public class GWTStubsSource extends StubModelDataSource {
  private ModelRoot root;

  public GWTStubsSource(ModelRoot root) {
    this.root = root;
  }

  public ModelLoadResult loadSModel(IModule module, SModelDescriptor descriptor, ModelLoadingState state) {
    SModel model = new SModel(descriptor.getSModelReference(), new ForeignNodeIdMap());
    ModuleReference lang = MPSModuleRepository.getInstance().getModuleById(ModuleId.fromString("954c4d77-e24b-4e49-a5a5-5476c966c092")).getModuleReference();
    model.addLanguage(lang);
    module.addUsedLanguage(lang);

    String pkg = model.getSModelFqName().getLongName();
    PathItem pi = GWTModulePathItem.getPathItem(root.getPath());
    List<Tuples._3<String, String, SNode>> modlst = ListSequence.fromList(new ArrayList<Tuples._3<String, String, SNode>>());
    SNode sample = SConceptOperations.createNewNode("jetbrains.mps.gwt.client.structure.GWTModule", null);
    for (String modres : ListSequence.fromList(pi.resources(pkg))) {
      SNodeId id = GWTModuleReader.createId(pi.baseName(modres));
      SNode gwtModule = (SNode) model.getNodeById(id);
      if ((gwtModule == null)) {
        gwtModule = SConceptOperations.createNewNode(NameUtil.nodeFQName(SConceptOperations.findConceptDeclaration("jetbrains.mps.gwt.client.structure.GWTModule")), sample);
        gwtModule.setId(id);
        SPropertyOperations.set(gwtModule, "name", pi.baseName(modres));
        SModelOperations.addRootNode(((SModel) model), gwtModule);
      }
      ListSequence.fromList(modlst).addElement(MultiTuple.<String,String,SNode>from(pkg, modres, gwtModule));
    }
    final StubModelDescriptors descs = new StubModelDescriptors(SModelStereotype.getStubStereotypeForId("gwt"), root, module, true);
    GWTModuleReader reader = new GWTModuleReader(new GWTModuleReader.Resolver() {
      public SModelReference stubModelReference(String pk) {
        return descs.javaStubRef(pk);
      }
    }, new GWTModuleReader.Resolver() {
      public SModelReference stubModelReference(String pk) {
        return descs.smodelRefWithId(pk);
      }
    });
    for (Tuples._3<String, String, SNode> modpair : ListSequence.fromList(modlst)) {
      InputStream is = null;
      try {
        is = pi.openResource(modpair._0(), modpair._1());
        SAXBuilder saxBuilder = JDOMUtil.createBuilder();
        reader.read(modpair._2(), saxBuilder.build(is));
      } catch (IOException e) {
        e.printStackTrace();
      } catch (JDOMException e) {
        e.printStackTrace();
      } catch (GWTModuleFormatException e) {
        e.printStackTrace();
      }
      if (is != null) {
        try {
          is.close();
        } catch (IOException e) {
        }
      }
    }
    SNodeOperations.deleteNode(sample);

    return new ModelLoadResult(model, ModelLoadingState.FULLY_LOADED);
  }

  public DescriptorLoadResult loadDescriptor(IModule module, SModelFqName name) {
    return null;
  }

  public long getTimestamp() {
    return 0;
  }
}
