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
import jetbrains.mps.make.CompilationResult;
import jetbrains.mps.make.ModuleMaker;
import jetbrains.mps.util.CollectionUtil;
import com.intellij.openapi.progress.EmptyProgressIndicator;
import jetbrains.mps.make.script.IConfig;
import jetbrains.mps.reloading.ClassLoaderManager;

public class JavaCompile_Facet implements IFacet {
  private List<ITarget> targets = ListSequence.fromList(new ArrayList<ITarget>());
  private IFacet.Name name = new IFacet.Name("JavaCompile");

  public JavaCompile_Facet() {
    ListSequence.fromList(targets).addElement(new JavaCompile_Facet.Target_wf1ya0_a());
    ListSequence.fromList(targets).addElement(new JavaCompile_Facet.Target_wf1ya0_b());
  }

  public Iterable<ITarget> targets() {
    return targets;
  }

  public Iterable<IFacet.Name> optional() {
    return null;
  }

  public Iterable<IFacet.Name> required() {
    return Sequence.fromArray(new IFacet.Name[]{new IFacet.Name("TextGen"), new IFacet.Name("Make")});
  }

  public Iterable<IFacet.Name> extended() {
    return null;
  }

  public IFacet.Name getName() {
    return this.name;
  }

  public static class Target_wf1ya0_a implements ITarget {
    private ITarget.Name name = new ITarget.Name("compile");

    public Target_wf1ya0_a() {
    }

    public IJob createJob() {
      return new IJob() {
        public IResult execute(final Iterable<IResource> input, final IJobMonitor monitor, final IParametersPool pool) {
          Iterable<IResource> _output_wf1ya0_a0a = null;
          switch (0) {
            case 0:
              for (IResource resource : input) {
                GResource gr = (GResource) resource;
                if (gr.data.module() == null) {
                  return new IResult.FAILURE(_output_wf1ya0_a0a);
                }
                CompilationResult compilationResult;
                compilationResult = new ModuleMaker().make(CollectionUtil.set(gr.data.module()), new EmptyProgressIndicator());
                if (compilationResult != null && compilationResult.getErrors() > 0) {
                  return new IResult.FAILURE(_output_wf1ya0_a0a);
                }
                if (gr.data.module().reloadClassesAfterGeneration()) {
                  _output_wf1ya0_a0a = Sequence.fromIterable(_output_wf1ya0_a0a).concat(Sequence.fromIterable(Sequence.<IResource>singleton(gr)));
                }
              }
            default:
              return new IResult.SUCCESS(_output_wf1ya0_a0a);
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
      return Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("textGen")});
    }

    public Iterable<ITarget.Name> notBefore() {
      return null;
    }

    public Iterable<ITarget.Name> before() {
      return Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("make")});
    }

    public ITarget.Name getName() {
      return name;
    }

    public boolean requiresInput() {
      return false;
    }

    public Class<? extends IResource> expectedResources() {
      return null;
    }

    public <T> T createParameters(Class<T> cls) {
      return null;
    }
  }

  public static class Target_wf1ya0_b implements ITarget {
    private ITarget.Name name = new ITarget.Name("reloadClasses");

    public Target_wf1ya0_b() {
    }

    public IJob createJob() {
      return new IJob() {
        public IResult execute(final Iterable<IResource> input, final IJobMonitor monitor, final IParametersPool pool) {
          Iterable<IResource> _output_wf1ya0_a0b = null;
          switch (0) {
            case 0:
              ClassLoaderManager.getInstance().reloadAll(new EmptyProgressIndicator());
            default:
              return new IResult.SUCCESS(_output_wf1ya0_a0b);
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
      return Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("compile")});
    }

    public Iterable<ITarget.Name> notBefore() {
      return null;
    }

    public Iterable<ITarget.Name> before() {
      return Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("make")});
    }

    public ITarget.Name getName() {
      return name;
    }

    public boolean requiresInput() {
      return false;
    }

    public Class<? extends IResource> expectedResources() {
      return null;
    }

    public <T> T createParameters(Class<T> cls) {
      return null;
    }
  }
}
