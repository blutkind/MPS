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
import jetbrains.mps.MPSCore;
import jetbrains.mps.internal.make.runtime.java.IAuxProjectPeer;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.reloading.ClassLoaderManager;

public class JavaCompile_Facet implements IFacet {
  private List<ITarget> targets = ListSequence.fromList(new ArrayList<ITarget>());
  private IFacet.Name name = new IFacet.Name("JavaCompile");

  public JavaCompile_Facet() {
    ListSequence.fromList(targets).addElement(new JavaCompile_Facet.Target_wf1ya0_a());
    ListSequence.fromList(targets).addElement(new JavaCompile_Facet.Target_wf1ya0_b());
    ListSequence.fromList(targets).addElement(new JavaCompile_Facet.Target_wf1ya0_c());
  }

  public Iterable<ITarget> targets() {
    return targets;
  }

  public Iterable<IFacet.Name> optional() {
    return null;
  }

  public Iterable<IFacet.Name> required() {
    return Sequence.fromArray(new IFacet.Name[]{new IFacet.Name("Generate"), new IFacet.Name("TextGen"), new IFacet.Name("Make")});
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
              for (IResource resource : Sequence.fromIterable(input)) {
                TResource tres = new TResource().assignFrom((TResource) resource);
                if (tres.module() == null) {
                  return new IResult.FAILURE(_output_wf1ya0_a0a);
                }
                if (!(tres.module().isCompileInMPS())) {
                  continue;
                }
                CompilationResult compilationResult;
                compilationResult = new ModuleMaker().make(CollectionUtil.set(tres.module()), new EmptyProgressIndicator());
                if (compilationResult != null && compilationResult.getErrors() > 0) {
                  return new IResult.FAILURE(_output_wf1ya0_a0a);
                }
                if (tres.module().reloadClassesAfterGeneration()) {
                  _output_wf1ya0_a0a = Sequence.fromIterable(_output_wf1ya0_a0a).concat(Sequence.fromIterable(Sequence.<IResource>singleton(tres)));
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
      return true;
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

  public static class Target_wf1ya0_b implements ITarget {
    private ITarget.Name name = new ITarget.Name("auxCompile");

    public Target_wf1ya0_b() {
    }

    public IJob createJob() {
      return new IJob() {
        public IResult execute(final Iterable<IResource> input, final IJobMonitor monitor, final IParametersPool pool) {
          Iterable<IResource> _output_wf1ya0_a0b = null;
          switch (0) {
            case 0:
              for (IResource resource : Sequence.fromIterable(input)) {
                TResource tres = new TResource().assignFrom((TResource) resource);
                if (tres.module() == null) {
                  return new IResult.FAILURE(_output_wf1ya0_a0b);
                }
                if (tres.module().isCompileInMPS()) {
                  continue;
                }
                if (MPSCore.getInstance().isTestMode()) {
                  return new IResult.FAILURE(_output_wf1ya0_a0b);
                }
                IAuxProjectPeer peer = pool.parameters(new ITarget.Name("checkParameters"), Generate_Facet.Target_fi61u2_a.Variables.class).project().getComponent(IAuxProjectPeer.class);
                if (peer == null) {
                  return new IResult.FAILURE(_output_wf1ya0_a0b);
                }
                peer.getJavaCompiler().compileModule(tres.module());
                if (!(peer.getJavaCompiler().compileModule(tres.module()))) {
                  return new IResult.FAILURE(_output_wf1ya0_a0b);
                }
                if (tres.module().reloadClassesAfterGeneration()) {
                  _output_wf1ya0_a0b = Sequence.fromIterable(_output_wf1ya0_a0b).concat(Sequence.fromIterable(Sequence.<IResource>singleton(tres)));
                }
              }
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
      return true;
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

  public static class Target_wf1ya0_c implements ITarget {
    private ITarget.Name name = new ITarget.Name("reloadClasses");

    public Target_wf1ya0_c() {
    }

    public IJob createJob() {
      return new IJob() {
        public IResult execute(final Iterable<IResource> input, final IJobMonitor monitor, final IParametersPool pool) {
          Iterable<IResource> _output_wf1ya0_a0c = null;
          switch (0) {
            case 0:
              if (Sequence.fromIterable(input).any(new IWhereFilter<IResource>() {
                public boolean accept(IResource in) {
                  return ((TResource) in).module().reloadClassesAfterGeneration();
                }
              })) {
                ClassLoaderManager.getInstance().reloadAll(new EmptyProgressIndicator());
              }
            default:
              return new IResult.SUCCESS(_output_wf1ya0_a0c);
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

    public boolean producesOutput() {
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
