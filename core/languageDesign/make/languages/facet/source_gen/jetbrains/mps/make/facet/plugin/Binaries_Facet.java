package jetbrains.mps.make.facet.plugin;

/*Generated by MPS */

import jetbrains.mps.make.facet.IFacet;
import java.util.List;
import jetbrains.mps.make.facet.ITarget;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.make.script.IJob;
import jetbrains.mps.make.script.IResult;
import jetbrains.mps.make.resources.IResource;
import jetbrains.mps.make.script.IJobMonitor;
import jetbrains.mps.make.script.IParametersPool;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.smodel.resources.MResource;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.plugin.behavior.Resource_Behavior;
import jetbrains.mps.make.script.IConfig;

public class Binaries_Facet implements IFacet {
  private List<ITarget> targets = ListSequence.fromList(new ArrayList<ITarget>());
  private IFacet.Name name = new IFacet.Name("Binaries");

  public Binaries_Facet() {
    ListSequence.fromList(targets).addElement(new Binaries_Facet.Target_8acy7z_a());
  }

  public Iterable<ITarget> targets() {
    return targets;
  }

  public Iterable<IFacet.Name> optional() {
    return null;
  }

  public Iterable<IFacet.Name> required() {
    return Sequence.fromArray(new IFacet.Name[]{new IFacet.Name("Make"), new IFacet.Name("Generate"), new IFacet.Name("JavaCompile")});
  }

  public Iterable<IFacet.Name> extended() {
    return null;
  }

  public IFacet.Name getName() {
    return this.name;
  }

  public static class Target_8acy7z_a implements ITarget {
    private ITarget.Name name = new ITarget.Name("GenerateIcons");

    public Target_8acy7z_a() {
    }

    public IJob createJob() {
      return new IJob() {
        public IResult execute(final Iterable<IResource> input, final IJobMonitor monitor, final IParametersPool pool) {
          Iterable<IResource> _output_8acy7z_a0a = null;
          switch (0) {
            case 0:
              Sequence.fromIterable(input).<SModelDescriptor>translate(new ITranslator2<IResource, SModelDescriptor>() {
                public Iterable<SModelDescriptor> translate(IResource it) {
                  return ((MResource) it).models();
                }
              }).visitAll(new IVisitor<SModelDescriptor>() {
                public void visit(SModelDescriptor it) {
                  SModel model = it.getSModel();
                  ListSequence.fromList(SModelOperations.getNodes(model, "jetbrains.mps.lang.plugin.structure.Resource")).visitAll(new IVisitor<SNode>() {
                    public void visit(SNode res) {
                      Resource_Behavior.call_generate_9219036563477424614(res);
                    }
                  });
                }
              });
            default:
              return new IResult.SUCCESS(_output_8acy7z_a0a);
          }
        }
      };
    }

    public IConfig createConfig() {
      return null;
    }

    public Iterable<ITarget.Name> notAfter() {
      return null;
    }

    public Iterable<ITarget.Name> after() {
      return Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("configure")});
    }

    public Iterable<ITarget.Name> notBefore() {
      return null;
    }

    public Iterable<ITarget.Name> before() {
      return Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("make"), new ITarget.Name("compile")});
    }

    public ITarget.Name getName() {
      return name;
    }

    public boolean requiresInput() {
      return true;
    }

    public boolean producesOutput() {
      return true;
    }

    public Iterable<Class<? extends IResource>> expectedInput() {
      return null;
    }

    public Iterable<Class<? extends IResource>> expectedOutput() {
      return null;
    }

    public <T> T createParameters(Class<T> cls) {
      return null;
    }
  }
}
