package jetbrains.mps.make.generator;

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
import jetbrains.mps.make.script.IConfig;
import jetbrains.mps.baseLanguage.tuples.runtime.MultiTuple;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import junit.framework.Assert;

public class Generator_Facet implements IFacet {
  private List<ITarget> targets = ListSequence.fromList(new ArrayList<ITarget>());
  private IFacet.Name name = new IFacet.Name("Generator");

  public Generator_Facet() {
    ListSequence.fromList(targets).addElement(new Generator_Facet.Target_ixz87t_a());
    ListSequence.fromList(targets).addElement(new Generator_Facet.Target_ixz87t_b());
  }

  public Iterable<ITarget> targets() {
    return targets;
  }

  public Iterable<IFacet.Name> optional() {
    return null;
  }

  public Iterable<IFacet.Name> required() {
    return Sequence.fromArray(new IFacet.Name[]{new IFacet.Name("Maker")});
  }

  public Iterable<IFacet.Name> extended() {
    return null;
  }

  public IFacet.Name getName() {
    return this.name;
  }

  public static class Target_ixz87t_a implements ITarget {
    private ITarget.Name name = new ITarget.Name("Configure");

    public Target_ixz87t_a() {
    }

    public IJob createJob() {
      return new IJob() {
        public IResult execute(final Iterable<IResource> input, final IJobMonitor monitor, final IParametersPool pool) {
          Iterable<IResource> _output_ixz87t_a0a = null;
          switch (0) {
            case 0:
              pool.parameters(Target_ixz87t_a.this.getName(), Generator_Facet.Target_ixz87t_a.Variables.class).value("uninitialized");
            default:
              return new IResult.SUCCESS(_output_ixz87t_a0a);
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
      return null;
    }

    public Iterable<ITarget.Name> notBefore() {
      return null;
    }

    public Iterable<ITarget.Name> before() {
      return null;
    }

    public ITarget.Name getName() {
      return name;
    }

    public boolean requiresInput() {
      return false;
    }

    public boolean producesOutput() {
      return false;
    }

    public Class<? extends IResource> expectedResources() {
      return null;
    }

    public <T> T createParameters(Class<T> cls) {
      return cls.cast(new Variables());
    }

    public static class Variables extends MultiTuple._1<String> {
      public Variables() {
        super();
      }

      public Variables(String value) {
        super(value);
      }

      public String value(String value) {
        return super._0(value);
      }

      public String value() {
        return super._0();
      }

      @SuppressWarnings(value = "unchecked")
      public Generator_Facet.Target_ixz87t_a.Variables assignFrom(Tuples._1<String> from) {
        return (Generator_Facet.Target_ixz87t_a.Variables) super.assign(from);
      }
    }
  }

  public static class Target_ixz87t_b implements ITarget {
    private ITarget.Name name = new ITarget.Name("Generate");

    public Target_ixz87t_b() {
    }

    public IJob createJob() {
      return new IJob() {
        public IResult execute(final Iterable<IResource> input, final IJobMonitor monitor, final IParametersPool pool) {
          Iterable<IResource> _output_ixz87t_a0b = null;
          switch (0) {
            case 0:
              Assert.assertEquals("uninitialized", pool.parameters(new ITarget.Name("Configure"), Generator_Facet.Target_ixz87t_a.Variables.class).value());
              monitor.currentProgress().beginWork("GENERATE", 100, monitor.currentProgress().workLeft());
              pool.parameters(new ITarget.Name("Configure"), Generator_Facet.Target_ixz87t_a.Variables.class).value("VALUE");
              for (IResource resource : input) {
                _output_ixz87t_a0b = Sequence.fromIterable(_output_ixz87t_a0b).concat(Sequence.fromIterable(Sequence.<IResource>singleton(resource)));
                monitor.currentProgress().doneWork("GENERATE", 50);
              }
              monitor.currentProgress().finishWork("GENERATE");
              _output_ixz87t_a0b = Sequence.fromIterable(_output_ixz87t_a0b).concat(Sequence.fromIterable(input));
              return new IResult.SUCCESS(_output_ixz87t_a0b);
            default:
              return new IResult.SUCCESS(_output_ixz87t_a0b);
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
      return Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("Configure")});
    }

    public Iterable<ITarget.Name> notBefore() {
      return null;
    }

    public Iterable<ITarget.Name> before() {
      return Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("Make")});
    }

    public ITarget.Name getName() {
      return name;
    }

    public boolean requiresInput() {
      return false;
    }

    public boolean producesOutput() {
      return true;
    }

    public Class<? extends IResource> expectedResources() {
      return null;
    }

    public <T> T createParameters(Class<T> cls) {
      return null;
    }
  }
}
