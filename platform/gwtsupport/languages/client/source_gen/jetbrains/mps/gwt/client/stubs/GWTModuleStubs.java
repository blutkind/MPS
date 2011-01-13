package jetbrains.mps.gwt.client.stubs;

/*Generated by MPS */

import jetbrains.mps.stubs.BaseStubModelRootManager;
import java.util.Set;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.project.ModuleId;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.stubs.StubLocation;
import jetbrains.mps.smodel.SModel;
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
import jetbrains.mps.smodel.SModelReference;
import java.io.InputStream;
import org.jdom.input.SAXBuilder;
import java.io.IOException;
import org.jdom.JDOMException;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.stubs.BaseStubModelDescriptor;
import jetbrains.mps.smodel.persistence.IModelRootManager;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.smodel.SModelStereotype;
import jetbrains.mps.smodel.SModelFqName;
import jetbrains.mps.smodel.SModelId;

public class GWTModuleStubs extends BaseStubModelRootManager {
  public GWTModuleStubs() {
  }

  protected Set<Language> getLanguagesToImport() {
    Set<String> moduleIds = SetSequence.fromSet(new HashSet<String>());

    moduleIds.add("954c4d77-e24b-4e49-a5a5-5476c966c092");

    Iterable<Language> languages = SetSequence.fromSet(moduleIds).<Language>select(new ISelector<String, Language>() {
      public Language select(String it) {
        return (Language) MPSModuleRepository.getInstance().getModuleById(ModuleId.fromString(it));
      }
    });

    Set<Language> result = new HashSet<Language>();
    result.addAll(Sequence.fromIterable(languages).toListSequence());
    return result;
  }

  protected void updateModel(final StubLocation location, final SModel model) {
    String pkg = model.getSModelFqName().getLongName();
    PathItem pi = PathItemsReloadableCache.getPathItem(location.getPath());
    List<Tuples._3<String, String, SNode>> modlst = ListSequence.fromList(new ArrayList<Tuples._3<String, String, SNode>>());
    SNode sample = SConceptOperations.createNewNode("jetbrains.mps.gwt.client.structure.GWTModule", null);
    for (String modres : ListSequence.fromList(pi.resources(pkg))) {
      SNodeId id = GWTModuleReader.createId(pi.baseName(modres));
      SNode module = (SNode) model.getNodeById(id);
      if ((module == null)) {
        module = SConceptOperations.createNewNode(NameUtil.nodeFQName(SConceptOperations.findConceptDeclaration("jetbrains.mps.gwt.client.structure.GWTModule")), sample);
        module.setId(id);
        SPropertyOperations.set(module, "name", pi.baseName(modres));
        SModelOperations.addRootNode(model, module);
      }
      ListSequence.fromList(modlst).addElement(MultiTuple.<String,String,SNode>from(pkg, modres, module));
    }
    GWTModuleReader reader = new GWTModuleReader(new GWTModuleReader.Resolver() {
      public SModelReference stubModelReference(String pk) {
        return GWTModuleStubs.this.javaStubRef(pk);
      }
    }, new GWTModuleReader.Resolver() {
      public SModelReference stubModelReference(String pk) {
        return GWTModuleStubs.this.smodelRefWithId(pk);
      }
    });
    for (Tuples._3<String, String, SNode> modpair : ListSequence.fromList(modlst)) {
      InputStream is = null;
      try {
        is = pi.openResource(modpair._0(), modpair._1());
        reader.read(modpair._2(), new SAXBuilder().build(is));
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
  }

  protected Set<BaseStubModelDescriptor> getModelDescriptors(final StubLocation location) {
    Set<BaseStubModelDescriptor> result = SetSequence.fromSet(new HashSet<BaseStubModelDescriptor>());
    GWTModuleStubs.this.collectDescriptors(GWTModuleStubs.this, location, result);
    return result;
  }

  protected String getSelfModuleId() {
    return "954c4d77-e24b-4e49-a5a5-5476c966c092";
  }

  private void collectDescriptors(IModelRootManager mrm, StubLocation loc, Set<BaseStubModelDescriptor> result) {
    String pkg = loc.getPrefix();
    PathItem pi = PathItemsReloadableCache.getPathItem(loc.getPath());
    for (String subpkg : ListSequence.fromList(pi.subpackages(pkg))) {
      if (ListSequence.fromList(pi.resources(subpkg)).isNotEmpty()) {
        SModelReference smref = GWTModuleStubs.this.smodelRefWithId(subpkg);
        SModelReference smref2 = GWTModuleStubs.this.smodelRefWithFqName(subpkg);
        SModelDescriptor descById = SModelRepository.getInstance().getModelDescriptor(smref);
        SModelDescriptor descByFqName = SModelRepository.getInstance().getModelDescriptor(smref2);
        if (descById != null && descByFqName != null) {
          SModelRepository.getInstance().addOwnerForDescriptor(descByFqName, loc.getModule());
          SetSequence.fromSet(result).addElement(((BaseStubModelDescriptor) descByFqName));
        } else {
          BaseStubModelDescriptor desc = new BaseStubModelDescriptor(mrm, null, smref);
          SetSequence.fromSet(result).addElement(desc);
        }
      }
      GWTModuleStubs.this.collectDescriptors(mrm, new StubLocation(loc.getPath(), subpkg, loc.getModule()), result);
    }
  }

  private SModelReference smodelRefWithId(String pkg) {
    String stereo = SModelStereotype.getStubStereotypeForId("gwt");
    SModelFqName fqname = new SModelFqName(pkg, stereo);
    SModelId modelId = SModelId.foreign(stereo, pkg);
    return new SModelReference(fqname, modelId);
  }

  private SModelReference smodelRefWithFqName(String pkg) {
    return SModelReference.fromString(pkg + "@" + SModelStereotype.getStubStereotypeForId("gwt"));
  }

  private SModelReference javaStubRef(String pkg) {
    String stereo = SModelStereotype.getStubStereotypeForId("java");
    SModelFqName fqname = new SModelFqName(pkg, stereo);
    SModelId modelId = SModelId.foreign(stereo, pkg);
    return new SModelReference(fqname, modelId);
  }
}
