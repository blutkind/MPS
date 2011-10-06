package jetbrains.mps.lang.core.plugin;

/*Generated by MPS */

import jetbrains.mps.make.facet.IFacet;
import java.util.List;
import jetbrains.mps.make.facet.ITarget;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.make.resources.IPropertiesPersistence;
import jetbrains.mps.make.resources.IResource;
import jetbrains.mps.smodel.resources.IDeltaResource;
import jetbrains.mps.make.script.IJob;
import jetbrains.mps.make.script.IResult;
import jetbrains.mps.make.script.IJobMonitor;
import jetbrains.mps.make.resources.IPropertiesAccessor;
import jetbrains.mps.ide.ThreadUtils;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.internal.make.runtime.util.DeltaReconciler;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.make.delta.IDelta;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.make.delta.IInternalDelta;
import jetbrains.mps.make.script.IConfig;
import jetbrains.mps.make.script.IConfigMonitor;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import jetbrains.mps.baseLanguage.tuples.runtime.MultiTuple;
import java.util.Map;
import jetbrains.mps.make.script.IPropertiesPool;
import jetbrains.mps.internal.collections.runtime.MapSequence;

public class Make_Facet extends IFacet.Stub {
  private List<ITarget> targets = ListSequence.fromList(new ArrayList<ITarget>());
  private IFacet.Name name = new IFacet.Name("jetbrains.mps.lang.core.Make");

  public Make_Facet() {
    ListSequence.fromList(targets).addElement(new Make_Facet.Target_reconcile());
    ListSequence.fromList(targets).addElement(new Make_Facet.Target_make());
  }

  public Iterable<ITarget> targets() {
    return targets;
  }

  public Iterable<IFacet.Name> optional() {
    return null;
  }

  public Iterable<IFacet.Name> required() {
    return null;
  }

  public Iterable<IFacet.Name> extended() {
    return null;
  }

  public IFacet.Name getName() {
    return this.name;
  }

  public IPropertiesPersistence propertiesPersistence() {
    return new Make_Facet.TargetProperties();
  }

  public static class Target_reconcile implements ITarget {
    private static Class<? extends IResource>[] EXPECTED_INPUT = (Class<? extends IResource>[]) new Class[]{IDeltaResource.class};
    private static Class<? extends IResource>[] EXPECTED_OUTPUT = (Class<? extends IResource>[]) new Class[]{};

    private ITarget.Name name = new ITarget.Name("jetbrains.mps.lang.core.Make.reconcile");

    public Target_reconcile() {
    }

    public IJob createJob() {
      return new IJob.Stub() {
        public IResult execute(final Iterable<IResource> input, final IJobMonitor monitor, final IPropertiesAccessor pa) {
          Iterable<IResource> _output_pm9z_a0a = null;
          switch (0) {
            case 0:
              ThreadUtils.runInUIThreadAndWait(new Runnable() {
                public void run() {
                  ModelAccess.instance().requireWrite(new Runnable() {
                    public void run() {
                      new DeltaReconciler(Sequence.fromIterable(input).translate(new ITranslator2<IResource, IDelta>() {
                        public Iterable<IDelta> translate(IResource res) {
                          return ((IDeltaResource) res).delta();
                        }
                      }).where(new IWhereFilter<IDelta>() {
                        public boolean accept(IDelta d) {
                          return !(d instanceof IInternalDelta);
                        }
                      })).reconcileAll();
                      new DeltaReconciler(Sequence.fromIterable(input).translate(new ITranslator2<IResource, IDelta>() {
                        public Iterable<IDelta> translate(IResource res) {
                          return ((IDeltaResource) res).delta();
                        }
                      }).where(new IWhereFilter<IDelta>() {
                        public boolean accept(IDelta d) {
                          return d instanceof IInternalDelta;
                        }
                      })).reconcileAll();
                    }
                  });
                }
              });
              _output_pm9z_a0a = Sequence.fromIterable(_output_pm9z_a0a).concat(Sequence.fromIterable(input));
            default:
              return new IResult.SUCCESS(_output_pm9z_a0a);
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

    public <T> T createParameters(Class<T> cls, T copyFrom) {
      T t = createParameters(cls);
      return t;
    }
  }

  public static class Target_make implements ITarget {
    private static Class<? extends IResource>[] EXPECTED_INPUT = (Class<? extends IResource>[]) new Class[]{IResource.class};
    private static Class<? extends IResource>[] EXPECTED_OUTPUT = (Class<? extends IResource>[]) new Class[]{};

    private ITarget.Name name = new ITarget.Name("jetbrains.mps.lang.core.Make.make");

    public Target_make() {
    }

    public IJob createJob() {
      return new IJob.Stub() {
        public IResult execute(final Iterable<IResource> input, final IJobMonitor monitor, final IPropertiesAccessor pa) {
          Iterable<IResource> _output_pm9z_a0b = null;
          switch (0) {
            case 0:
            default:
              return new IResult.SUCCESS(_output_pm9z_a0b);
          }
        }
      };
    }

    public IConfig createConfig() {
      return new IConfig.Stub() {
        @Override
        public boolean configure(final IConfigMonitor cmonitor, final IPropertiesAccessor pa) {
          switch (0) {
            case 0:
              if (pa.global().properties(Target_make.this.getName(), Make_Facet.Target_make.Parameters.class).pathToFile() == null) {
                pa.global().properties(Target_make.this.getName(), Make_Facet.Target_make.Parameters.class).pathToFile(new _FunctionTypes._return_P1_E0<IFile, String>() {
                  public IFile invoke(String p) {
                    return FileSystem.getInstance().getFileByPath(p);
                  }
                });
              }
            default:
              return true;
          }
        }
      };
    }

    public Iterable<ITarget.Name> notAfter() {
      return null;
    }

    public Iterable<ITarget.Name> after() {
      return Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("jetbrains.mps.lang.core.Make.reconcile")});
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
      return false;
    }

    public Iterable<Class<? extends IResource>> expectedInput() {
      return Sequence.fromArray(EXPECTED_INPUT);
    }

    public Iterable<Class<? extends IResource>> expectedOutput() {
      return null;
    }

    public <T> T createParameters(Class<T> cls) {
      return cls.cast(new Parameters());
    }

    public <T> T createParameters(Class<T> cls, T copyFrom) {
      T t = createParameters(cls);
      if (t != null) {
        ((Tuples._1) t).assign((Tuples._1) copyFrom);
      }
      return t;
    }

    public static class Parameters extends MultiTuple._1<_FunctionTypes._return_P1_E0<? extends IFile, ? super String>> {
      public Parameters() {
        super();
      }

      public Parameters(_FunctionTypes._return_P1_E0<? extends IFile, ? super String> pathToFile) {
        super(pathToFile);
      }

      public _FunctionTypes._return_P1_E0<? extends IFile, ? super String> pathToFile(_FunctionTypes._return_P1_E0<? extends IFile, ? super String> value) {
        return super._0(value);
      }

      public _FunctionTypes._return_P1_E0<? extends IFile, ? super String> pathToFile() {
        return super._0();
      }

      @SuppressWarnings(value = "unchecked")
      public Make_Facet.Target_make.Parameters assignFrom(Tuples._1<_FunctionTypes._return_P1_E0<? extends IFile, ? super String>> from) {
        return (Make_Facet.Target_make.Parameters) super.assign(from);
      }
    }
  }

  public static class TargetProperties implements IPropertiesPersistence {
    public TargetProperties() {
    }

    public void storeValues(Map<String, String> store, IPropertiesPool properties) {
      {
        ITarget.Name name = new ITarget.Name("jetbrains.mps.lang.core.Make.make");
        if (properties.hasProperties(name)) {
          Make_Facet.Target_make.Parameters props = properties.properties(name, Make_Facet.Target_make.Parameters.class);
          MapSequence.fromMap(store).put("jetbrains.mps.lang.core.Make.make.pathToFile", null);
        }
      }
    }

    public void loadValues(Map<String, String> store, IPropertiesPool properties) {
      try {
        {
          ITarget.Name name = new ITarget.Name("jetbrains.mps.lang.core.Make.make");
          Make_Facet.Target_make.Parameters props = properties.properties(name, Make_Facet.Target_make.Parameters.class);
          if (MapSequence.fromMap(store).containsKey("jetbrains.mps.lang.core.Make.make.pathToFile")) {
            props.pathToFile(null);
          }
        }
      } catch (RuntimeException re) {
      }
    }
  }
}
