package jetbrains.mps.build.ant.generation.workers;

/*Generated by MPS */

import jetbrains.mps.make.IMakeService;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.messages.IMessageHandler;
import jetbrains.mps.make.script.IResult;
import jetbrains.mps.make.resources.IResource;
import jetbrains.mps.make.script.IScript;
import jetbrains.mps.make.script.IScriptController;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.messages.Message;
import jetbrains.mps.messages.MessageKind;
import jetbrains.mps.make.script.IConfigMonitor;
import jetbrains.mps.make.script.IOption;
import jetbrains.mps.make.script.IQuery;
import jetbrains.mps.make.script.IJobMonitor;
import jetbrains.mps.make.script.IFeedback;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.EmptyProgressIndicator;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import com.intellij.ide.IdeEventQueue;
import jetbrains.mps.smodel.ModelAccess;
import com.intellij.openapi.progress.Progressive;
import jetbrains.mps.make.script.IParametersPool;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import com.intellij.openapi.project.Project;
import jetbrains.mps.make.facet.ITarget;
import jetbrains.mps.make.script.ScriptBuilder;
import jetbrains.mps.make.facet.IFacet;

public class BuildMakeService implements IMakeService {
  private IOperationContext context;
  private IMessageHandler messageHandler;

  public BuildMakeService(IOperationContext context, IMessageHandler messageHandler) {
    this.context = context;
    this.messageHandler = messageHandler;
  }

  public IResult make(Iterable<? extends IResource> resources) {
    return doMake(resources, defaultMakeScript(), null);
  }

  public IResult make(Iterable<? extends IResource> resources, IScript script) {
    return doMake(resources, script, null);
  }

  public IResult make(Iterable<? extends IResource> resources, IScript script, IScriptController controller) {
    return doMake(resources, script, controller);
  }

  private IResult doMake(Iterable<? extends IResource> inputRes, IScript script, IScriptController controller) {
    String scrName = "Build";

    if (Sequence.fromIterable(inputRes).isEmpty()) {
      String msg = scrName + " aborted: nothing to do";
      this.showError(msg);
      return new IResult.FAILURE(null);
    }


    if (!(script.isValid())) {
      String msg = scrName + " failed";
      showError(msg + ". Invalid script.");
      return new IResult.FAILURE(null);
    }

    IScriptController ctl = this.completeController(controller);
    IResult res;
    res = script.execute(ctl, inputRes);

    if (res == null) {
      String msg = scrName + " aborted";
      showError(msg);
    } else if (!(res.isSucessful())) {
      String msg = scrName + " failed";
      showError(msg + ". See previous messages for details.");
    }
    return res;
  }

  private void showError(String msg) {
    messageHandler.handle(new Message(MessageKind.ERROR, msg));
  }

  private IScriptController completeController(final IScriptController ctl) {
    final IConfigMonitor cmon = new IConfigMonitor.Stub() {
      public <T extends IOption> T relayQuery(IQuery<T> query) {
        return query.defaultOption();
      }
    };
    final IJobMonitor jmon = new IJobMonitor.Stub() {
      @Override
      public void reportFeedback(IFeedback fdbk) {
        new BuildMakeService.MessageFeedbackStrategy(messageHandler).reportFeedback(fdbk);
      }
    };

    final Wrappers._T<ProgressIndicator> pind = new Wrappers._T<ProgressIndicator>(new EmptyProgressIndicator());
    return new IScriptController() {
      public void runConfigWithMonitor(_FunctionTypes._void_P1_E0<? super IConfigMonitor> code) {
        code.invoke(cmon);
      }

      public void runJobWithMonitor(final _FunctionTypes._void_P1_E0<? super IJobMonitor> code) {
        IdeEventQueue.getInstance().flushQueue();
        ModelAccess.instance().runWriteActionWithProgressSynchronously(new Progressive() {
          public void run(ProgressIndicator realInd) {
            pind.value = new EmptyProgressIndicator();
            code.invoke(jmon);
          }
        }, "Build", true, BuildMakeService.this.context.getProject());
      }

      public void setup(IParametersPool pool) {
        Tuples._4<Project, IOperationContext, Boolean, _FunctionTypes._return_P0_E0<? extends ProgressIndicator>> vars = (Tuples._4<Project, IOperationContext, Boolean, _FunctionTypes._return_P0_E0<? extends ProgressIndicator>>) pool.parameters(new ITarget.Name("checkParameters"), Object.class);
        if (vars != null) {
          vars._0(BuildMakeService.this.context.getProject());
          vars._1(BuildMakeService.this.context);
          vars._2(true);
          vars._3(new _FunctionTypes._return_P0_E0<ProgressIndicator>() {
            public ProgressIndicator invoke() {
              return pind.value;
            }
          });
        }

        if (ctl != null) {
          ctl.setup(pool);
        }
      }
    };
  }

  public static IScript defaultMakeScript() {
    return new ScriptBuilder().withFacets(new IFacet.Name("Binaries"), new IFacet.Name("Generate"), new IFacet.Name("TextGen"), new IFacet.Name("JavaCompile"), new IFacet.Name("Make")).withFinalTarget(new ITarget.Name("make")).toScript();
  }

  public static class MessageFeedbackStrategy {
    private IMessageHandler handler;

    public MessageFeedbackStrategy(IMessageHandler handler) {
      this.handler = handler;
    }

    public void reportFeedback(IFeedback fdk) {
      MessageKind messageKind;
      switch (fdk.getSeverity()) {
        case ERROR:
          messageKind = MessageKind.ERROR;
          break;
        case WARNING:
          messageKind = MessageKind.WARNING;
          break;
        case INFO:
          messageKind = MessageKind.INFORMATION;
          break;
        default:
          messageKind = MessageKind.ERROR;
          break;
      }
      Message message = new Message(messageKind, fdk.getMessage());
      message.setException(fdk.getException());
      message.setHintObject(fdk.getSource());
      handler.handle(message);
    }
  }
}
