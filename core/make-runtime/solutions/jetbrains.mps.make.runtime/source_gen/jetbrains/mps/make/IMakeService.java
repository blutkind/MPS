package jetbrains.mps.make;

/*Generated by MPS */

import jetbrains.mps.make.script.IResult;
import jetbrains.mps.make.resources.IResource;
import jetbrains.mps.make.script.IScript;

public interface IMakeService {
  public IResult make(Iterable<? extends IResource> resources);
  public IResult make(Iterable<? extends IResource> resources, IScript script);
  public IResult make(Iterable<? extends IResource> resources, IScript script, IMakeService.Executor executor);
  public IResult make(Iterable<? extends IResource> resources, IMakeService.Executor executor);
  public static interface Executor {
    public void doExecute(Runnable runnable);
  }

}
