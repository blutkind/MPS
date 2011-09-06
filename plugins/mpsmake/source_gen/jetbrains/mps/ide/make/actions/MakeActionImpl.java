package jetbrains.mps.ide.make.actions;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.make.resources.IResource;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.make.MakeSession;
import jetbrains.mps.ide.generator.GenerationCheckHelper;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.make.IMakeService;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.smodel.resources.MResource;

public class MakeActionImpl {
  private IOperationContext context;
  private MakeActionParameters params;
  private boolean cleanMake;

  public MakeActionImpl(IOperationContext context, MakeActionParameters params, boolean cleanMake) {
    this.context = context;
    this.params = params;
    this.cleanMake = cleanMake;
  }

  public void executeAction() {
    final Iterable<? extends IResource> inputRes = params.collectInput(!(this.cleanMake));

    // save all before launching make 
    ModelAccess.instance().runWriteActionInCommand(new Runnable() {
      public void run() {
        SModelRepository.getInstance().saveAll();
      }
    });

    MakeSession session = new MakeSession(context, null, cleanMake) {
      @Override
      public void doExecute(Runnable scriptRunnable) {
        if (GenerationCheckHelper.getInstance().checkModelsBeforeGenerationIfNeeded(MakeActionImpl.this.context.getProject(), MakeActionImpl.this.context, Sequence.fromIterable(MakeActionImpl.this.selectModels(inputRes)).toListSequence(), null)) {
          // ok to go 
          scriptRunnable.run();
        } else {
          // errors found, abort 
          IMakeService.INSTANCE.get().closeSession(this);
        }
      }
    };

    if (IMakeService.INSTANCE.get().openNewSession(session)) {
      IMakeService.INSTANCE.get().make(session, inputRes);
    }
  }

  private Iterable<SModelDescriptor> selectModels(Iterable<? extends IResource> inputRes) {
    return Sequence.fromIterable(inputRes).<SModelDescriptor>translate(new ITranslator2<IResource, SModelDescriptor>() {
      public Iterable<SModelDescriptor> translate(IResource it) {
        return ((MResource) it).models();
      }
    });
  }
}
