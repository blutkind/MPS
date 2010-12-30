package jetbrains.mps.make.facet.plugin;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.internal.make.runtime.script.ScriptBuilder;
import jetbrains.mps.internal.make.runtime.script.UIQueryRelayStrategy;
import jetbrains.mps.internal.make.runtime.backports.ProgressIndicatorProgressStrategy;
import jetbrains.mps.internal.make.runtime.script.LoggingFeedbackStrategy;
import jetbrains.mps.make.script.IJobMonitor;
import jetbrains.mps.make.script.IProgress;
import jetbrains.mps.make.script.IFeedback;
import jetbrains.mps.make.script.IConfigMonitor;
import jetbrains.mps.make.script.IOption;
import jetbrains.mps.make.script.IQuery;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.make.script.IScript;
import jetbrains.mps.make.facet.IFacet;
import jetbrains.mps.make.facet.ITarget;
import jetbrains.mps.make.script.IParametersPool;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import com.intellij.openapi.project.Project;
import jetbrains.mps.make.script.IMonitors;
import com.intellij.ide.IdeEventQueue;
import jetbrains.mps.smodel.ModelAccess;
import com.intellij.openapi.progress.Progressive;
import jetbrains.mps.internal.make.runtime.backports.JobMonitorProgressIndicator;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.make.script.IResult;
import jetbrains.mps.ide.actions.ModelCheckerTool_Tool;
import jetbrains.mps.plugins.projectplugins.ProjectPluginManager;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.internal.collections.runtime.ITranslator2;

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
    ScriptBuilder scb = new ScriptBuilder();
    final UIQueryRelayStrategy relayStrat = new UIQueryRelayStrategy();
    final ProgressIndicatorProgressStrategy progStrat = new ProgressIndicatorProgressStrategy();
    final LoggingFeedbackStrategy feedbackStrat = new LoggingFeedbackStrategy();
    final IJobMonitor jmon = new IJobMonitor() {
      public boolean pleaseStop() {
        return false;
      }

      public IProgress currentProgress() {
        return progStrat.currentProgress();
      }

      public void reportFeedback(IFeedback fdbk) {
        feedbackStrat.reportFeedback(fdbk);
      }
    };
    final IConfigMonitor cmon = new IConfigMonitor() {
      public <T extends IOption> T relayQuery(IQuery<T> query) {
        return relayStrat.relayQuery(query, MakeActionImpl.this.context);
      }
    };
    final Wrappers._T<ProgressIndicator> pind = new Wrappers._T<ProgressIndicator>(null);
    final _FunctionTypes._return_P0_E0<? extends ProgressIndicator> pindGet = new _FunctionTypes._return_P0_E0<ProgressIndicator>() {
      public ProgressIndicator invoke() {
        return pind.value;
      }
    };
    final IScript scr = scb.withFacets(new IFacet.Name("Generate"), new IFacet.Name("TextGen"), new IFacet.Name("JavaCompile"), new IFacet.Name("Make")).withTarget(new ITarget.Name("make")).withInit(new _FunctionTypes._void_P1_E0<IParametersPool>() {
      public void invoke(IParametersPool pool) {
        Tuples._4<Project, IOperationContext, Boolean, _FunctionTypes._return_P0_E0<? extends ProgressIndicator>> vars = (Tuples._4<Project, IOperationContext, Boolean, _FunctionTypes._return_P0_E0<? extends ProgressIndicator>>) pool.parameters(new ITarget.Name("checkParameters"), Object.class);
        vars._0(MakeActionImpl.this.context.getProject());
        vars._1(MakeActionImpl.this.context);
        vars._2(MakeActionImpl.this.cleanMake);
        vars._3(pindGet);
      }
    }).withMonitors(new IMonitors.Stub(cmon, jmon) {
      @Override
      public void runJobWithMonitor(final _FunctionTypes._void_P1_E0<? super IJobMonitor> code) {
        IdeEventQueue.getInstance().flushQueue();
        ModelAccess.instance().runWriteActionWithProgressSynchronously(new Progressive() {
          public void run(ProgressIndicator realInd) {
            progStrat.setProgressIndicator(realInd);
            pind.value = new JobMonitorProgressIndicator(jmon);
            code.invoke(jmon);
          }
        }, (cleanMake ?
          "Rebuild" :
          "Make"
        ), true, MakeActionImpl.this.context.getProject());
      }
    }).toScript();


    if (!(scr.isValid())) {
      return;
    }

    final Iterable<MResource> inputRes = params.collectInput(!(this.cleanMake));

    // save all before launching the script 
    ModelAccess.instance().runWriteActionInCommand(new Runnable() {
      public void run() {
        SModelRepository.getInstance().saveAll();
      }
    });

    final Wrappers._T<IResult> res = new Wrappers._T<IResult>();

    ModelCheckerTool_Tool mct = this.context.getProject().getComponent(ProjectPluginManager.class).getTool(ModelCheckerTool_Tool.class);
    if (mct.checkModelsBeforeGenerationIfNeeded(this.context, Sequence.fromIterable(inputRes).<SModelDescriptor>translate(new ITranslator2<MResource, SModelDescriptor>() {
      public Iterable<SModelDescriptor> translate(MResource it) {
        return it.models();
      }
    }).toListSequence(), new Runnable() {
      public void run() {
        res.value = scr.execute(inputRes);
      }
    })) {
      //  this is insanity! really call this _again_? 
      new _FunctionTypes._return_P0_E0<IResult>() {
        public IResult invoke() {
          return res.value = scr.execute(inputRes);
        }
      }.invoke();
    }
  }
}
