package jetbrains.mps.make.facet.plugin;

/*Generated by MPS */

import jetbrains.mps.make.facet.IFacet;
import java.util.List;
import jetbrains.mps.make.facet.ITarget;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.make.resources.IResource;
import jetbrains.mps.smodel.resources.IGResource;
import jetbrains.mps.make.script.IJob;
import jetbrains.mps.make.script.IResult;
import jetbrains.mps.make.script.IJobMonitor;
import jetbrains.mps.make.script.IParametersPool;
import jetbrains.mps.smodel.resources.GResource;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.internal.make.runtime.util.FilesDelta;
import jetbrains.mps.internal.make.runtime.java.JavaStreamHandler;
import jetbrains.mps.generator.generationTypes.TextGenerator;
import jetbrains.mps.generator.ModelGenerationStatusManager;
import jetbrains.mps.make.java.BLDependenciesCache;
import jetbrains.mps.generator.traceInfo.TraceInfoCache;
import jetbrains.mps.generator.impl.dependencies.GenerationDependenciesCache;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.generator.TransientModelsModule;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.cleanup.CleanupManager;
import jetbrains.mps.smodel.resources.TResource;
import jetbrains.mps.make.script.IConfig;
import java.util.Map;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.util.JavaNameUtil;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.textGen.TextGenerationResult;
import jetbrains.mps.textGen.TextGenerationUtil;
import jetbrains.mps.textGen.TextGenManager;
import jetbrains.mps.smodel.resources.FResource;

public class TextGen_Facet implements IFacet {
  private List<ITarget> targets = ListSequence.fromList(new ArrayList<ITarget>());
  private IFacet.Name name = new IFacet.Name("TextGen");

  public TextGen_Facet() {
    ListSequence.fromList(targets).addElement(new TextGen_Facet.Target_21gswx_a());
    ListSequence.fromList(targets).addElement(new TextGen_Facet.Target_21gswx_b());
  }

  public Iterable<ITarget> targets() {
    return targets;
  }

  public Iterable<IFacet.Name> optional() {
    return null;
  }

  public Iterable<IFacet.Name> required() {
    return Sequence.fromArray(new IFacet.Name[]{new IFacet.Name("Generate"), new IFacet.Name("Make")});
  }

  public Iterable<IFacet.Name> extended() {
    return null;
  }

  public IFacet.Name getName() {
    return this.name;
  }

  public static class Target_21gswx_a implements ITarget {
    private static Class<? extends IResource>[] EXPECTED_INPUT = (Class<? extends IResource>[]) new Class[]{IGResource.class};
    private static Class<? extends IResource>[] EXPECTED_OUTPUT = (Class<? extends IResource>[]) new Class[]{};

    private ITarget.Name name = new ITarget.Name("textGen");

    public Target_21gswx_a() {
    }

    public IJob createJob() {
      return new IJob() {
        public IResult execute(final Iterable<IResource> input, final IJobMonitor monitor, final IParametersPool pool) {
          Iterable<IResource> _output_21gswx_a0a = null;
          switch (0) {
            case 0:
              monitor.currentProgress().beginWork("Writing", Sequence.fromIterable(input).count() * 100, monitor.currentProgress().workLeft());
              for (IResource resource : Sequence.fromIterable(input)) {
                GResource gres = (GResource) resource;
                monitor.currentProgress().advanceWork("Writing", 50, gres.status().getInputModel().getSModelReference().getSModelFqName().getLongName());
                if (!(gres.status().isOk())) {
                  Logger.getLogger("jetbrains.mps.make.TextGen").error("Generation was not OK");
                  return new IResult.FAILURE(_output_21gswx_a0a);
                }

                IFile targetDir = FileSystem.getInstance().getFileByPath(gres.module().getOutputFor(gres.model()));
                FilesDelta delta = new FilesDelta(targetDir);
                final JavaStreamHandler javaStreamHandler = new JavaStreamHandler(gres.model(), targetDir, delta);
                boolean ok;
                try {
                  ok = new TextGenerator(javaStreamHandler, ModelGenerationStatusManager.getInstance().getCacheGenerator(), BLDependenciesCache.getInstance().getGenerator(), TraceInfoCache.getInstance().getGenerator(), GenerationDependenciesCache.getInstance().getGenerator()).handleOutput(pool.parameters(new ITarget.Name("checkParameters"), Generate_Facet.Target_fi61u2_a.Variables.class).operationContext(), gres.status());
                } finally {
                  javaStreamHandler.dispose();
                }

                final SModelDescriptor outputMD = gres.status().getOutputModelDescriptor();
                if (outputMD instanceof TransientModelsModule.TransientSModelDescriptor) {
                  ModelAccess.instance().runWriteInEDT(new Runnable() {
                    public void run() {
                      TransientModelsModule.TransientSModelDescriptor tmd = (TransientModelsModule.TransientSModelDescriptor) outputMD;
                      ((TransientModelsModule) tmd.getModule()).removeModel(tmd);
                    }
                  });
                }
                CleanupManager.getInstance().cleanup();

                if (!(ok)) {
                  Logger.getLogger("jetbrains.mps.make.TextGen").error("TextGenerator returned false");
                  return new IResult.FAILURE(_output_21gswx_a0a);
                }
                ModelAccess.instance().writeFilesInEDT(new Runnable() {
                  public void run() {
                    javaStreamHandler.flush();
                  }
                });
                monitor.currentProgress().advanceWork("Writing", 50);
                _output_21gswx_a0a = Sequence.fromIterable(_output_21gswx_a0a).concat(Sequence.fromIterable(Sequence.<IResource>singleton(new TResource(gres.module(), delta))));
              }
              monitor.currentProgress().finishWork("Writing");
            default:
              return new IResult.SUCCESS(_output_21gswx_a0a);
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
      return Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("generate")});
    }

    public Iterable<ITarget.Name> notBefore() {
      return null;
    }

    public Iterable<ITarget.Name> before() {
      return Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("cleanUpAfterGeneration"), new ITarget.Name("reconcile"), new ITarget.Name("make")});
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
      return Sequence.fromArray(EXPECTED_INPUT);
    }

    public Iterable<Class<? extends IResource>> expectedOutput() {
      return null;
    }

    public <T> T createParameters(Class<T> cls) {
      return null;
    }
  }

  public static class Target_21gswx_b implements ITarget {
    private static Class<? extends IResource>[] EXPECTED_INPUT = (Class<? extends IResource>[]) new Class[]{IGResource.class};
    private static Class<? extends IResource>[] EXPECTED_OUTPUT = (Class<? extends IResource>[]) new Class[]{};

    private ITarget.Name name = new ITarget.Name("textGenToMemory");

    public Target_21gswx_b() {
    }

    public IJob createJob() {
      return new IJob() {
        public IResult execute(final Iterable<IResource> input, final IJobMonitor monitor, final IParametersPool pool) {
          Iterable<IResource> _output_21gswx_a0b = null;
          switch (0) {
            case 0:
              for (IResource resource : Sequence.fromIterable(input)) {
                GResource gres = (GResource) resource;
                Map<String, Object> texts = MapSequence.fromMap(new HashMap<String, Object>());
                String prefix = JavaNameUtil.packageNameForModelUID(gres.status().getOutputModel().getSModelReference());

                for (SNode root : Sequence.fromIterable(gres.status().getOutputModel().roots()).where(new IWhereFilter<SNode>() {
                  public boolean accept(SNode rt) {
                    return rt.getName() != null;
                  }
                })) {
                  TextGenerationResult tgr = TextGenerationUtil.generateText(pool.parameters(new ITarget.Name("checkParameters"), Generate_Facet.Target_fi61u2_a.Variables.class).operationContext(), root);
                  if (tgr.hasErrors()) {
                    return new IResult.FAILURE(_output_21gswx_a0b);
                  }
                  String ext = TextGenManager.instance().getExtension(root);
                  String fname = ((ext != null ?
                    root.getName() + "." + ext :
                    root.getName()
                  ));
                  MapSequence.fromMap(texts).put(fname, tgr.getResult());
                }

                _output_21gswx_a0b = Sequence.fromIterable(_output_21gswx_a0b).concat(Sequence.fromIterable(Sequence.<IResource>singleton(new FResource(prefix, texts, gres.module(), gres.model()))));
              }
            default:
              return new IResult.SUCCESS(_output_21gswx_a0b);
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
      return Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("generate")});
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
      return true;
    }

    public boolean producesOutput() {
      return true;
    }

    public Iterable<Class<? extends IResource>> expectedInput() {
      return Sequence.fromArray(EXPECTED_INPUT);
    }

    public Iterable<Class<? extends IResource>> expectedOutput() {
      return null;
    }

    public <T> T createParameters(Class<T> cls) {
      return null;
    }
  }
}
